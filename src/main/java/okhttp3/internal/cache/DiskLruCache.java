package okhttp3.internal.cache;

import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.Flushable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.NoSuchElementException;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
import okhttp3.internal.Util;
import okhttp3.internal.io.FileSystem;
import okhttp3.internal.platform.Platform;
import okio.AbstractC69698d;
import okio.AbstractC69699e;
import okio.AbstractC69722t;
import okio.AbstractC69723u;
import okio.C69705k;

public final class DiskLruCache implements Closeable, Flushable {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    static final Pattern LEGAL_KEY_PATTERN = Pattern.compile("[a-z0-9_-]{1,120}");
    private final int appVersion;
    private final Runnable cleanupRunnable = new Runnable() {
        /* class okhttp3.internal.cache.DiskLruCache.RunnableC696661 */

        public void run() {
            boolean z;
            synchronized (DiskLruCache.this) {
                if (!DiskLruCache.this.initialized) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z && !DiskLruCache.this.closed) {
                    try {
                        DiskLruCache.this.trimToSize();
                    } catch (IOException unused) {
                        DiskLruCache.this.mostRecentTrimFailed = true;
                    }
                    try {
                        if (DiskLruCache.this.journalRebuildRequired()) {
                            DiskLruCache.this.rebuildJournal();
                            DiskLruCache.this.redundantOpCount = 0;
                        }
                    } catch (IOException unused2) {
                        DiskLruCache.this.mostRecentRebuildFailed = true;
                        DiskLruCache.this.journalWriter = C69705k.m267589a(C69705k.m267591a());
                    }
                }
            }
        }
    };
    boolean closed;
    final File directory;
    private final Executor executor;
    final FileSystem fileSystem;
    boolean hasJournalErrors;
    boolean initialized;
    private final File journalFile;
    private final File journalFileBackup;
    private final File journalFileTmp;
    AbstractC69698d journalWriter;
    final LinkedHashMap<String, Entry> lruEntries = new LinkedHashMap<>(0, 0.75f, true);
    private long maxSize;
    boolean mostRecentRebuildFailed;
    boolean mostRecentTrimFailed;
    private long nextSequenceNumber = 0;
    int redundantOpCount;
    private long size;
    final int valueCount;

    public final class Snapshot implements Closeable {
        public final String key;
        private final long[] lengths;
        private final long sequenceNumber;
        private final AbstractC69723u[] sources;

        public String key() {
            return this.key;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            for (AbstractC69723u uVar : this.sources) {
                Util.closeQuietly(uVar);
            }
        }

        @Nullable
        public Editor edit() throws IOException {
            return DiskLruCache.this.edit(this.key, this.sequenceNumber);
        }

        public long getLength(int i) {
            return this.lengths[i];
        }

        public AbstractC69723u getSource(int i) {
            return this.sources[i];
        }

        Snapshot(String str, long j, AbstractC69723u[] uVarArr, long[] jArr) {
            this.key = str;
            this.sequenceNumber = j;
            this.sources = uVarArr;
            this.lengths = jArr;
        }
    }

    public File getDirectory() {
        return this.directory;
    }

    public synchronized long getMaxSize() {
        return this.maxSize;
    }

    public synchronized boolean isClosed() {
        return this.closed;
    }

    public void delete() throws IOException {
        close();
        this.fileSystem.deleteContents(this.directory);
    }

    public synchronized long size() throws IOException {
        initialize();
        return this.size;
    }

    public synchronized Iterator<Snapshot> snapshots() throws IOException {
        initialize();
        return new Iterator<Snapshot>() {
            /* class okhttp3.internal.cache.DiskLruCache.C696683 */
            final Iterator<Entry> delegate;
            Snapshot nextSnapshot;
            Snapshot removeSnapshot;

            @Override // java.util.Iterator
            public Snapshot next() {
                if (hasNext()) {
                    Snapshot snapshot = this.nextSnapshot;
                    this.removeSnapshot = snapshot;
                    this.nextSnapshot = null;
                    return snapshot;
                }
                throw new NoSuchElementException();
            }

            public void remove() {
                Snapshot snapshot = this.removeSnapshot;
                if (snapshot != null) {
                    try {
                        DiskLruCache.this.remove(snapshot.key);
                    } catch (IOException unused) {
                    } catch (Throwable th) {
                        this.removeSnapshot = null;
                        throw th;
                    }
                    this.removeSnapshot = null;
                    return;
                }
                throw new IllegalStateException("remove() before next()");
            }

            public boolean hasNext() {
                if (this.nextSnapshot != null) {
                    return true;
                }
                synchronized (DiskLruCache.this) {
                    if (DiskLruCache.this.closed) {
                        return false;
                    }
                    while (this.delegate.hasNext()) {
                        Snapshot snapshot = this.delegate.next().snapshot();
                        if (snapshot != null) {
                            this.nextSnapshot = snapshot;
                            return true;
                        }
                    }
                    return false;
                }
            }

            {
                this.delegate = new ArrayList(DiskLruCache.this.lruEntries.values()).iterator();
            }
        };
    }

    public final class Editor {
        private boolean done;
        final Entry entry;
        final boolean[] written;

        public void abortUnlessCommitted() {
            synchronized (DiskLruCache.this) {
                if (!this.done && this.entry.currentEditor == this) {
                    try {
                        DiskLruCache.this.completeEdit(this, false);
                    } catch (IOException unused) {
                    }
                }
            }
        }

        public void commit() throws IOException {
            synchronized (DiskLruCache.this) {
                if (!this.done) {
                    if (this.entry.currentEditor == this) {
                        DiskLruCache.this.completeEdit(this, true);
                    }
                    this.done = true;
                } else {
                    throw new IllegalStateException();
                }
            }
        }

        public void abort() throws IOException {
            synchronized (DiskLruCache.this) {
                if (!this.done) {
                    if (this.entry.currentEditor == this) {
                        DiskLruCache.this.completeEdit(this, false);
                    }
                    this.done = true;
                } else {
                    throw new IllegalStateException();
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void detach() {
            if (this.entry.currentEditor == this) {
                for (int i = 0; i < DiskLruCache.this.valueCount; i++) {
                    try {
                        DiskLruCache.this.fileSystem.delete(this.entry.dirtyFiles[i]);
                    } catch (IOException unused) {
                    }
                }
                this.entry.currentEditor = null;
            }
        }

        public AbstractC69723u newSource(int i) {
            synchronized (DiskLruCache.this) {
                if (this.done) {
                    throw new IllegalStateException();
                } else if (!this.entry.readable || this.entry.currentEditor != this) {
                    return null;
                } else {
                    try {
                        return DiskLruCache.this.fileSystem.source(this.entry.cleanFiles[i]);
                    } catch (FileNotFoundException unused) {
                        return null;
                    }
                }
            }
        }

        public AbstractC69722t newSink(int i) {
            synchronized (DiskLruCache.this) {
                if (this.done) {
                    throw new IllegalStateException();
                } else if (this.entry.currentEditor != this) {
                    return C69705k.m267591a();
                } else {
                    if (!this.entry.readable) {
                        this.written[i] = true;
                    }
                    try {
                        return new FaultHidingSink(DiskLruCache.this.fileSystem.sink(this.entry.dirtyFiles[i])) {
                            /* class okhttp3.internal.cache.DiskLruCache.Editor.C696691 */

                            /* access modifiers changed from: protected */
                            @Override // okhttp3.internal.cache.FaultHidingSink
                            public void onException(IOException iOException) {
                                synchronized (DiskLruCache.this) {
                                    Editor.this.detach();
                                }
                            }
                        };
                    } catch (FileNotFoundException unused) {
                        return C69705k.m267591a();
                    }
                }
            }
        }

        Editor(Entry entry2) {
            boolean[] zArr;
            this.entry = entry2;
            if (entry2.readable) {
                zArr = null;
            } else {
                zArr = new boolean[DiskLruCache.this.valueCount];
            }
            this.written = zArr;
        }
    }

    private synchronized void checkNotClosed() {
        if (isClosed()) {
            throw new IllegalStateException("cache is closed");
        }
    }

    private AbstractC69698d newJournalWriter() throws FileNotFoundException {
        return C69705k.m267589a(new FaultHidingSink(this.fileSystem.appendingSink(this.journalFile)) {
            /* class okhttp3.internal.cache.DiskLruCache.C696672 */
            static final /* synthetic */ boolean $assertionsDisabled = false;

            /* access modifiers changed from: protected */
            @Override // okhttp3.internal.cache.FaultHidingSink
            public void onException(IOException iOException) {
                DiskLruCache.this.hasJournalErrors = true;
            }
        });
    }

    @Override // java.io.Flushable
    public synchronized void flush() throws IOException {
        if (this.initialized) {
            checkNotClosed();
            trimToSize();
            this.journalWriter.flush();
        }
    }

    /* access modifiers changed from: package-private */
    public boolean journalRebuildRequired() {
        int i = this.redundantOpCount;
        if (i < 2000 || i < this.lruEntries.size()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public void trimToSize() throws IOException {
        while (this.size > this.maxSize) {
            removeEntry(this.lruEntries.values().iterator().next());
        }
        this.mostRecentTrimFailed = false;
    }

    public synchronized void evictAll() throws IOException {
        initialize();
        for (Entry entry : (Entry[]) this.lruEntries.values().toArray(new Entry[this.lruEntries.size()])) {
            removeEntry(entry);
        }
        this.mostRecentTrimFailed = false;
    }

    /* access modifiers changed from: private */
    public final class Entry {
        final File[] cleanFiles;
        Editor currentEditor;
        final File[] dirtyFiles;
        final String key;
        final long[] lengths;
        boolean readable;
        long sequenceNumber;

        /* access modifiers changed from: package-private */
        public Snapshot snapshot() {
            if (Thread.holdsLock(DiskLruCache.this)) {
                AbstractC69723u[] uVarArr = new AbstractC69723u[DiskLruCache.this.valueCount];
                long[] jArr = (long[]) this.lengths.clone();
                int i = 0;
                for (int i2 = 0; i2 < DiskLruCache.this.valueCount; i2++) {
                    try {
                        uVarArr[i2] = DiskLruCache.this.fileSystem.source(this.cleanFiles[i2]);
                    } catch (FileNotFoundException unused) {
                        while (i < DiskLruCache.this.valueCount && uVarArr[i] != null) {
                            Util.closeQuietly(uVarArr[i]);
                            i++;
                        }
                        try {
                            DiskLruCache.this.removeEntry(this);
                            return null;
                        } catch (IOException unused2) {
                            return null;
                        }
                    }
                }
                return new Snapshot(this.key, this.sequenceNumber, uVarArr, jArr);
            }
            throw new AssertionError();
        }

        private IOException invalidLengths(String[] strArr) throws IOException {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        /* access modifiers changed from: package-private */
        public void writeLengths(AbstractC69698d dVar) throws IOException {
            for (long j : this.lengths) {
                dVar.mo244562k(32).mo244554h(j);
            }
        }

        /* access modifiers changed from: package-private */
        public void setLengths(String[] strArr) throws IOException {
            if (strArr.length == DiskLruCache.this.valueCount) {
                for (int i = 0; i < strArr.length; i++) {
                    try {
                        this.lengths[i] = Long.parseLong(strArr[i]);
                    } catch (NumberFormatException unused) {
                        throw invalidLengths(strArr);
                    }
                }
                return;
            }
            throw invalidLengths(strArr);
        }

        Entry(String str) {
            this.key = str;
            this.lengths = new long[DiskLruCache.this.valueCount];
            this.cleanFiles = new File[DiskLruCache.this.valueCount];
            this.dirtyFiles = new File[DiskLruCache.this.valueCount];
            StringBuilder sb = new StringBuilder(str);
            sb.append('.');
            int length = sb.length();
            for (int i = 0; i < DiskLruCache.this.valueCount; i++) {
                sb.append(i);
                this.cleanFiles[i] = new File(DiskLruCache.this.directory, sb.toString());
                sb.append(".tmp");
                this.dirtyFiles[i] = new File(DiskLruCache.this.directory, sb.toString());
                sb.setLength(length);
            }
        }
    }

    private void processJournal() throws IOException {
        this.fileSystem.delete(this.journalFileTmp);
        Iterator<Entry> it = this.lruEntries.values().iterator();
        while (it.hasNext()) {
            Entry next = it.next();
            int i = 0;
            if (next.currentEditor == null) {
                while (i < this.valueCount) {
                    this.size += next.lengths[i];
                    i++;
                }
            } else {
                next.currentEditor = null;
                while (i < this.valueCount) {
                    this.fileSystem.delete(next.cleanFiles[i]);
                    this.fileSystem.delete(next.dirtyFiles[i]);
                    i++;
                }
                it.remove();
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        if (this.initialized) {
            if (!this.closed) {
                Entry[] entryArr = (Entry[]) this.lruEntries.values().toArray(new Entry[this.lruEntries.size()]);
                for (Entry entry : entryArr) {
                    if (entry.currentEditor != null) {
                        entry.currentEditor.abort();
                    }
                }
                trimToSize();
                this.journalWriter.close();
                this.journalWriter = null;
                this.closed = true;
                return;
            }
        }
        this.closed = true;
    }

    private void readJournal() throws IOException {
        AbstractC69699e a = C69705k.m267590a(this.fileSystem.source(this.journalFile));
        try {
            String readUtf8LineStrict = a.readUtf8LineStrict();
            String readUtf8LineStrict2 = a.readUtf8LineStrict();
            String readUtf8LineStrict3 = a.readUtf8LineStrict();
            String readUtf8LineStrict4 = a.readUtf8LineStrict();
            String readUtf8LineStrict5 = a.readUtf8LineStrict();
            if (!"libcore.io.DiskLruCache".equals(readUtf8LineStrict) || !"1".equals(readUtf8LineStrict2) || !Integer.toString(this.appVersion).equals(readUtf8LineStrict3) || !Integer.toString(this.valueCount).equals(readUtf8LineStrict4) || !"".equals(readUtf8LineStrict5)) {
                throw new IOException("unexpected journal header: [" + readUtf8LineStrict + ", " + readUtf8LineStrict2 + ", " + readUtf8LineStrict4 + ", " + readUtf8LineStrict5 + "]");
            }
            int i = 0;
            while (true) {
                try {
                    readJournalLine(a.readUtf8LineStrict());
                    i++;
                } catch (EOFException unused) {
                    this.redundantOpCount = i - this.lruEntries.size();
                    if (!a.exhausted()) {
                        rebuildJournal();
                    } else {
                        this.journalWriter = newJournalWriter();
                    }
                    return;
                }
            }
        } finally {
            Util.closeQuietly(a);
        }
    }

    public synchronized void initialize() throws IOException {
        if (!this.initialized) {
            if (this.fileSystem.exists(this.journalFileBackup)) {
                if (this.fileSystem.exists(this.journalFile)) {
                    this.fileSystem.delete(this.journalFileBackup);
                } else {
                    this.fileSystem.rename(this.journalFileBackup, this.journalFile);
                }
            }
            if (this.fileSystem.exists(this.journalFile)) {
                try {
                    readJournal();
                    processJournal();
                    this.initialized = true;
                    return;
                } catch (IOException e) {
                    Platform platform = Platform.get();
                    platform.log(5, "DiskLruCache " + this.directory + " is corrupt: " + e.getMessage() + ", removing", e);
                    delete();
                    this.closed = false;
                } catch (Throwable th) {
                    this.closed = false;
                    throw th;
                }
            }
            rebuildJournal();
            this.initialized = true;
        }
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    public synchronized void rebuildJournal() throws IOException {
        AbstractC69698d dVar = this.journalWriter;
        if (dVar != null) {
            dVar.close();
        }
        AbstractC69698d a = C69705k.m267589a(this.fileSystem.sink(this.journalFileTmp));
        try {
            a.mo244530b("libcore.io.DiskLruCache").mo244562k(10);
            a.mo244530b("1").mo244562k(10);
            a.mo244554h((long) this.appVersion).mo244562k(10);
            a.mo244554h((long) this.valueCount).mo244562k(10);
            a.mo244562k(10);
            for (Entry entry : this.lruEntries.values()) {
                if (entry.currentEditor != null) {
                    a.mo244530b("DIRTY").mo244562k(32);
                    a.mo244530b(entry.key);
                    a.mo244562k(10);
                } else {
                    a.mo244530b("CLEAN").mo244562k(32);
                    a.mo244530b(entry.key);
                    entry.writeLengths(a);
                    a.mo244562k(10);
                }
            }
            a.close();
            if (this.fileSystem.exists(this.journalFile)) {
                this.fileSystem.rename(this.journalFile, this.journalFileBackup);
            }
            this.fileSystem.rename(this.journalFileTmp, this.journalFile);
            this.fileSystem.delete(this.journalFileBackup);
            this.journalWriter = newJournalWriter();
            this.hasJournalErrors = false;
            this.mostRecentRebuildFailed = false;
        } catch (Throwable th) {
            a.close();
            throw th;
        }
    }

    @Nullable
    public Editor edit(String str) throws IOException {
        return edit(str, -1);
    }

    public synchronized void setMaxSize(long j) {
        this.maxSize = j;
        if (this.initialized) {
            this.executor.execute(this.cleanupRunnable);
        }
    }

    private void validateKey(String str) {
        if (!LEGAL_KEY_PATTERN.matcher(str).matches()) {
            throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,120}: \"" + str + "\"");
        }
    }

    public synchronized boolean remove(String str) throws IOException {
        initialize();
        checkNotClosed();
        validateKey(str);
        Entry entry = this.lruEntries.get(str);
        if (entry == null) {
            return false;
        }
        boolean removeEntry = removeEntry(entry);
        if (removeEntry && this.size <= this.maxSize) {
            this.mostRecentTrimFailed = false;
        }
        return removeEntry;
    }

    public synchronized Snapshot get(String str) throws IOException {
        initialize();
        checkNotClosed();
        validateKey(str);
        Entry entry = this.lruEntries.get(str);
        if (entry != null) {
            if (entry.readable) {
                Snapshot snapshot = entry.snapshot();
                if (snapshot == null) {
                    return null;
                }
                this.redundantOpCount++;
                this.journalWriter.mo244530b("READ").mo244562k(32).mo244530b(str).mo244562k(10);
                if (journalRebuildRequired()) {
                    this.executor.execute(this.cleanupRunnable);
                }
                return snapshot;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public boolean removeEntry(Entry entry) throws IOException {
        if (entry.currentEditor != null) {
            entry.currentEditor.detach();
        }
        for (int i = 0; i < this.valueCount; i++) {
            this.fileSystem.delete(entry.cleanFiles[i]);
            this.size -= entry.lengths[i];
            entry.lengths[i] = 0;
        }
        this.redundantOpCount++;
        this.journalWriter.mo244530b("REMOVE").mo244562k(32).mo244530b(entry.key).mo244562k(10);
        this.lruEntries.remove(entry.key);
        if (journalRebuildRequired()) {
            this.executor.execute(this.cleanupRunnable);
        }
        return true;
    }

    private void readJournalLine(String str) throws IOException {
        String str2;
        int indexOf = str.indexOf(32);
        if (indexOf != -1) {
            int i = indexOf + 1;
            int indexOf2 = str.indexOf(32, i);
            if (indexOf2 == -1) {
                str2 = str.substring(i);
                if (indexOf == 6 && str.startsWith("REMOVE")) {
                    this.lruEntries.remove(str2);
                    return;
                }
            } else {
                str2 = str.substring(i, indexOf2);
            }
            Entry entry = this.lruEntries.get(str2);
            if (entry == null) {
                entry = new Entry(str2);
                this.lruEntries.put(str2, entry);
            }
            if (indexOf2 != -1 && indexOf == 5 && str.startsWith("CLEAN")) {
                String[] split = str.substring(indexOf2 + 1).split(" ");
                entry.readable = true;
                entry.currentEditor = null;
                entry.setLengths(split);
            } else if (indexOf2 == -1 && indexOf == 5 && str.startsWith("DIRTY")) {
                entry.currentEditor = new Editor(entry);
            } else if (indexOf2 != -1 || indexOf != 4 || !str.startsWith("READ")) {
                throw new IOException("unexpected journal line: " + str);
            }
        } else {
            throw new IOException("unexpected journal line: " + str);
        }
    }

    /* access modifiers changed from: package-private */
    public synchronized Editor edit(String str, long j) throws IOException {
        initialize();
        checkNotClosed();
        validateKey(str);
        Entry entry = this.lruEntries.get(str);
        if (j != -1 && (entry == null || entry.sequenceNumber != j)) {
            return null;
        }
        if (entry != null && entry.currentEditor != null) {
            return null;
        }
        if (this.mostRecentTrimFailed || this.mostRecentRebuildFailed) {
            this.executor.execute(this.cleanupRunnable);
            return null;
        }
        this.journalWriter.mo244530b("DIRTY").mo244562k(32).mo244530b(str).mo244562k(10);
        this.journalWriter.flush();
        if (this.hasJournalErrors) {
            return null;
        }
        if (entry == null) {
            entry = new Entry(str);
            this.lruEntries.put(str, entry);
        }
        Editor editor = new Editor(entry);
        entry.currentEditor = editor;
        return editor;
    }

    /* access modifiers changed from: package-private */
    public synchronized void completeEdit(Editor editor, boolean z) throws IOException {
        Entry entry = editor.entry;
        if (entry.currentEditor == editor) {
            if (z && !entry.readable) {
                for (int i = 0; i < this.valueCount; i++) {
                    if (!editor.written[i]) {
                        editor.abort();
                        throw new IllegalStateException("Newly created entry didn't create value for index " + i);
                    } else if (!this.fileSystem.exists(entry.dirtyFiles[i])) {
                        editor.abort();
                        return;
                    }
                }
            }
            for (int i2 = 0; i2 < this.valueCount; i2++) {
                File file = entry.dirtyFiles[i2];
                if (!z) {
                    this.fileSystem.delete(file);
                } else if (this.fileSystem.exists(file)) {
                    File file2 = entry.cleanFiles[i2];
                    this.fileSystem.rename(file, file2);
                    long j = entry.lengths[i2];
                    long size2 = this.fileSystem.size(file2);
                    entry.lengths[i2] = size2;
                    this.size = (this.size - j) + size2;
                }
            }
            this.redundantOpCount++;
            entry.currentEditor = null;
            if (entry.readable || z) {
                entry.readable = true;
                this.journalWriter.mo244530b("CLEAN").mo244562k(32);
                this.journalWriter.mo244530b(entry.key);
                entry.writeLengths(this.journalWriter);
                this.journalWriter.mo244562k(10);
                if (z) {
                    long j2 = this.nextSequenceNumber;
                    this.nextSequenceNumber = 1 + j2;
                    entry.sequenceNumber = j2;
                }
            } else {
                this.lruEntries.remove(entry.key);
                this.journalWriter.mo244530b("REMOVE").mo244562k(32);
                this.journalWriter.mo244530b(entry.key);
                this.journalWriter.mo244562k(10);
            }
            this.journalWriter.flush();
            if (this.size > this.maxSize || journalRebuildRequired()) {
                this.executor.execute(this.cleanupRunnable);
            }
            return;
        }
        throw new IllegalStateException();
    }

    public static DiskLruCache create(FileSystem fileSystem2, File file, int i, int i2, long j) {
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        } else if (i2 > 0) {
            return new DiskLruCache(fileSystem2, file, i, i2, j, new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), Util.threadFactory("OkHttp DiskLruCache", true)));
        } else {
            throw new IllegalArgumentException("valueCount <= 0");
        }
    }

    DiskLruCache(FileSystem fileSystem2, File file, int i, int i2, long j, Executor executor2) {
        this.fileSystem = fileSystem2;
        this.directory = file;
        this.appVersion = i;
        this.journalFile = new File(file, "journal");
        this.journalFileTmp = new File(file, "journal.tmp");
        this.journalFileBackup = new File(file, "journal.bkp");
        this.valueCount = i2;
        this.maxSize = j;
        this.executor = executor2;
    }
}
