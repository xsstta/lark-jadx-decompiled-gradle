package com.ss.android.ugc.effectmanager.p3044c;

import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.regex.Pattern;

/* renamed from: com.ss.android.ugc.effectmanager.c.a */
public final class C60485a implements Closeable {

    /* renamed from: a */
    static final Pattern f151183a = Pattern.compile("[a-z0-9_-]{1,120}");

    /* renamed from: h */
    public static final OutputStream f151184h = new OutputStream() {
        /* class com.ss.android.ugc.effectmanager.p3044c.C60485a.C604872 */

        @Override // java.io.OutputStream
        public void write(int i) throws IOException {
        }
    };

    /* renamed from: b */
    public final File f151185b;

    /* renamed from: c */
    public final int f151186c;

    /* renamed from: d */
    public int f151187d;

    /* renamed from: e */
    public boolean f151188e;

    /* renamed from: f */
    public boolean f151189f;

    /* renamed from: g */
    final ExecutorService f151190g = Executors.newSingleThreadExecutor();

    /* renamed from: i */
    private final File f151191i;

    /* renamed from: j */
    private final File f151192j;

    /* renamed from: k */
    private final File f151193k;

    /* renamed from: l */
    private final int f151194l;

    /* renamed from: m */
    private long f151195m;

    /* renamed from: n */
    private long f151196n;

    /* renamed from: o */
    private Writer f151197o;

    /* renamed from: p */
    private final LinkedHashMap<String, C60490b> f151198p = new LinkedHashMap<>(0, 0.75f, true);

    /* renamed from: q */
    private long f151199q = 0;

    /* renamed from: r */
    private final Callable<Void> f151200r = new Callable<Void>() {
        /* class com.ss.android.ugc.effectmanager.p3044c.C60485a.CallableC604861 */

        /* renamed from: a */
        public Void call() throws Exception {
            boolean z;
            synchronized (C60485a.this) {
                if (!C60485a.this.f151188e) {
                    z = true;
                } else {
                    z = false;
                }
                if (z || C60485a.this.f151189f) {
                    return null;
                }
                C60485a.this.mo207086f();
                if (C60485a.this.mo207084d()) {
                    C60485a.this.mo207081c();
                    C60485a.this.f151187d = 0;
                }
                return null;
            }
        }
    };

    /* renamed from: com.ss.android.ugc.effectmanager.c.a$a */
    public final class C60488a {

        /* renamed from: a */
        public final C60490b f151202a;

        /* renamed from: b */
        public final boolean[] f151203b;

        /* renamed from: c */
        public boolean f151204c;

        /* renamed from: e */
        private boolean f151206e;

        /* renamed from: b */
        public void mo207094b() throws IOException {
            C60485a.this.mo207078a(this, false);
        }

        /* renamed from: c */
        public void mo207095c() {
            if (!this.f151206e) {
                try {
                    mo207094b();
                } catch (IOException unused) {
                }
            }
        }

        /* renamed from: com.ss.android.ugc.effectmanager.c.a$a$a */
        private class C60489a extends FilterOutputStream {
            @Override // java.io.OutputStream, java.io.Closeable, java.io.FilterOutputStream, java.lang.AutoCloseable
            public void close() {
                try {
                    this.out.close();
                } catch (IOException unused) {
                    C60488a.this.f151204c = true;
                }
            }

            @Override // java.io.OutputStream, java.io.FilterOutputStream, java.io.Flushable
            public void flush() {
                try {
                    this.out.flush();
                } catch (IOException unused) {
                    C60488a.this.f151204c = true;
                }
            }

            @Override // java.io.OutputStream, java.io.FilterOutputStream
            public void write(int i) {
                try {
                    this.out.write(i);
                } catch (IOException unused) {
                    C60488a.this.f151204c = true;
                }
            }

            private C60489a(OutputStream outputStream) {
                super(outputStream);
            }

            @Override // java.io.OutputStream, java.io.FilterOutputStream
            public void write(byte[] bArr, int i, int i2) {
                try {
                    this.out.write(bArr, i, i2);
                } catch (IOException unused) {
                    C60488a.this.f151204c = true;
                }
            }
        }

        /* renamed from: a */
        public void mo207093a() throws IOException {
            if (this.f151204c) {
                C60485a.this.mo207078a(this, false);
                C60485a.this.mo207082c(this.f151202a.f151208a);
            } else {
                C60485a.this.mo207078a(this, true);
            }
            this.f151206e = true;
        }

        /* renamed from: a */
        public OutputStream mo207092a(int i) throws IOException {
            FileOutputStream fileOutputStream;
            C60489a aVar;
            if (i < 0 || i >= C60485a.this.f151186c) {
                throw new IllegalArgumentException("Expected index " + i + " to be greater than 0 and less than the maximum value count of " + C60485a.this.f151186c);
            }
            synchronized (C60485a.this) {
                if (this.f151202a.f151211d == this) {
                    if (!this.f151202a.f151210c) {
                        this.f151203b[i] = true;
                    }
                    File b = this.f151202a.mo207103b(i);
                    try {
                        fileOutputStream = new FileOutputStream(b);
                    } catch (FileNotFoundException unused) {
                        C60485a.this.f151185b.mkdirs();
                        try {
                            fileOutputStream = new FileOutputStream(b);
                        } catch (FileNotFoundException unused2) {
                            return C60485a.f151184h;
                        }
                    }
                    aVar = new C60489a(fileOutputStream);
                } else {
                    throw new IllegalStateException();
                }
            }
            return aVar;
        }

        private C60488a(C60490b bVar) {
            boolean[] zArr;
            this.f151202a = bVar;
            if (bVar.f151210c) {
                zArr = null;
            } else {
                zArr = new boolean[C60485a.this.f151186c];
            }
            this.f151203b = zArr;
        }
    }

    /* renamed from: e */
    public synchronized boolean mo207085e() {
        return this.f151189f;
    }

    /* renamed from: com.ss.android.ugc.effectmanager.c.a$c */
    public final class C60491c implements Closeable {

        /* renamed from: b */
        private final String f151215b;

        /* renamed from: c */
        private final long f151216c;

        /* renamed from: d */
        private final File[] f151217d;

        /* renamed from: e */
        private final InputStream[] f151218e;

        /* renamed from: f */
        private final long[] f151219f;

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            for (InputStream inputStream : this.f151218e) {
                C60494c.m235070a(inputStream);
            }
        }

        /* renamed from: a */
        public File mo207104a(int i) {
            return this.f151217d[i];
        }

        private C60491c(String str, long j, File[] fileArr, InputStream[] inputStreamArr, long[] jArr) {
            this.f151215b = str;
            this.f151216c = j;
            this.f151217d = fileArr;
            this.f151218e = inputStreamArr;
            this.f151219f = jArr;
        }
    }

    /* renamed from: k */
    private void m235042k() {
        if (mo207085e()) {
            throw new IllegalStateException("cache is closed");
        }
    }

    /* renamed from: g */
    public void mo207087g() throws IOException {
        close();
        C60494c.m235071a(this.f151185b);
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.ugc.effectmanager.c.a$b */
    public final class C60490b {

        /* renamed from: a */
        public final String f151208a;

        /* renamed from: b */
        public final long[] f151209b;

        /* renamed from: c */
        public boolean f151210c;

        /* renamed from: d */
        public C60488a f151211d;

        /* renamed from: e */
        public long f151212e;

        /* renamed from: a */
        public String mo207101a() throws IOException {
            StringBuilder sb = new StringBuilder();
            long[] jArr = this.f151209b;
            for (long j : jArr) {
                sb.append(' ');
                sb.append(j);
            }
            return sb.toString();
        }

        /* renamed from: b */
        private IOException m235061b(String[] strArr) throws IOException {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        /* renamed from: a */
        public File mo207100a(int i) {
            if (i == 0) {
                return new File(C60485a.this.f151185b, this.f151208a);
            }
            File file = C60485a.this.f151185b;
            return new File(file, this.f151208a + "." + i);
        }

        /* renamed from: a */
        public void mo207102a(String[] strArr) throws IOException {
            if (strArr.length == C60485a.this.f151186c) {
                for (int i = 0; i < strArr.length; i++) {
                    try {
                        this.f151209b[i] = Long.parseLong(strArr[i]);
                    } catch (NumberFormatException unused) {
                        throw m235061b(strArr);
                    }
                }
                return;
            }
            throw m235061b(strArr);
        }

        /* renamed from: b */
        public File mo207103b(int i) {
            if (i == 0) {
                File file = C60485a.this.f151185b;
                return new File(file, this.f151208a + ".tmp");
            }
            File file2 = C60485a.this.f151185b;
            return new File(file2, this.f151208a + "." + i + ".tmp");
        }

        private C60490b(String str) {
            this.f151208a = str;
            this.f151209b = new long[C60485a.this.f151186c];
        }
    }

    /* renamed from: b */
    public boolean mo207080b() {
        File file = this.f151185b;
        if (file == null || !file.exists() || !this.f151191i.exists()) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public boolean mo207084d() {
        int i = this.f151187d;
        if (i < 2000 || i < this.f151198p.size()) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    public Set<String> mo207088h() throws IOException {
        Set<String> unmodifiableSet;
        synchronized (this) {
            mo207077a();
            unmodifiableSet = Collections.unmodifiableSet(new LinkedHashSet(this.f151198p.keySet()));
        }
        return unmodifiableSet;
    }

    /* renamed from: f */
    public synchronized void mo207086f() throws IOException {
        while (this.f151196n > this.f151195m) {
            mo207082c(this.f151198p.entrySet().iterator().next().getKey());
        }
    }

    /* renamed from: j */
    private void m235041j() throws IOException {
        m235036a(this.f151192j);
        Iterator<C60490b> it = this.f151198p.values().iterator();
        while (it.hasNext()) {
            C60490b next = it.next();
            int i = 0;
            if (next.f151211d == null) {
                while (i < this.f151186c) {
                    this.f151196n += next.f151209b[i];
                    i++;
                }
            } else {
                next.f151211d = null;
                while (i < this.f151186c) {
                    m235036a(next.mo207100a(i));
                    m235036a(next.mo207103b(i));
                    i++;
                }
                it.remove();
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        if (this.f151188e) {
            if (!this.f151189f) {
                Iterator it = new ArrayList(this.f151198p.values()).iterator();
                while (it.hasNext()) {
                    C60490b bVar = (C60490b) it.next();
                    if (bVar.f151211d != null) {
                        bVar.f151211d.mo207094b();
                    }
                }
                mo207086f();
                this.f151197o.close();
                this.f151197o = null;
                this.f151189f = true;
                return;
            }
        }
        this.f151189f = true;
    }

    /* renamed from: i */
    private void m235040i() throws IOException {
        C60492b bVar = new C60492b(new FileInputStream(this.f151191i), C60494c.f151226a);
        try {
            String a = bVar.mo207106a();
            String a2 = bVar.mo207106a();
            String a3 = bVar.mo207106a();
            String a4 = bVar.mo207106a();
            String a5 = bVar.mo207106a();
            if (!"libcore.io.DiskLruCache".equals(a) || !"1".equals(a2) || !Integer.toString(this.f151194l).equals(a3) || !Integer.toString(this.f151186c).equals(a4) || !"".equals(a5)) {
                throw new IOException("unexpected journal header: [" + a + ", " + a2 + ", " + a4 + ", " + a5 + "]");
            }
            int i = 0;
            while (true) {
                try {
                    m235038d(bVar.mo207106a());
                    i++;
                } catch (EOFException unused) {
                    this.f151187d = i - this.f151198p.size();
                    if (bVar.mo207107b()) {
                        mo207081c();
                    } else {
                        this.f151197o = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f151191i, true), C60494c.f151226a));
                    }
                    return;
                }
            }
        } finally {
            C60494c.m235070a(bVar);
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: c */
    public synchronized void mo207081c() throws IOException {
        FileOutputStream fileOutputStream;
        Writer writer = this.f151197o;
        if (writer != null) {
            writer.close();
        }
        try {
            fileOutputStream = new FileOutputStream(this.f151192j);
        } catch (FileNotFoundException unused) {
            this.f151192j.getParentFile().mkdirs();
            fileOutputStream = new FileOutputStream(this.f151192j);
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(fileOutputStream, C60494c.f151226a));
        try {
            bufferedWriter.write("libcore.io.DiskLruCache");
            bufferedWriter.write("\n");
            bufferedWriter.write("1");
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.f151194l));
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.f151186c));
            bufferedWriter.write("\n");
            bufferedWriter.write("\n");
            for (C60490b bVar : this.f151198p.values()) {
                if (bVar.f151211d != null) {
                    bufferedWriter.write("DIRTY " + bVar.f151208a + '\n');
                } else {
                    bufferedWriter.write("CLEAN " + bVar.f151208a + bVar.mo207101a() + '\n');
                }
            }
            bufferedWriter.close();
            if (this.f151191i.exists()) {
                m235037a(this.f151191i, this.f151193k, true);
            }
            m235037a(this.f151192j, this.f151191i, false);
            this.f151193k.delete();
            this.f151197o = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f151191i, true), C60494c.f151226a));
        } catch (Throwable th) {
            bufferedWriter.close();
            throw th;
        }
    }

    /* renamed from: a */
    public synchronized void mo207077a() throws IOException {
        if (!this.f151188e) {
            if (this.f151193k.exists()) {
                if (!this.f151191i.exists()) {
                    m235037a(this.f151193k, this.f151191i, false);
                } else if (this.f151193k.delete() && this.f151193k.exists()) {
                    throw new IOException("failed to delete " + this.f151193k);
                }
            }
            if (this.f151191i.exists()) {
                try {
                    m235040i();
                    m235041j();
                    this.f151188e = true;
                    return;
                } catch (IOException e) {
                    PrintStream printStream = System.out;
                    printStream.println("DiskLruCache " + this.f151185b + " is corrupt: " + e.getMessage() + ", removing");
                    mo207087g();
                    this.f151189f = false;
                } catch (Throwable th) {
                    this.f151189f = false;
                    throw th;
                }
            }
            mo207081c();
            this.f151188e = true;
        }
    }

    /* renamed from: b */
    public C60488a mo207079b(String str) throws IOException {
        return mo207075a(str, -1);
    }

    /* renamed from: e */
    private boolean m235039e(String str) {
        return f151183a.matcher(str).matches();
    }

    /* renamed from: a */
    private static void m235036a(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    /* renamed from: d */
    private void m235038d(String str) throws IOException {
        String str2;
        int indexOf = str.indexOf(32);
        if (indexOf != -1) {
            int i = indexOf + 1;
            int indexOf2 = str.indexOf(32, i);
            if (indexOf2 == -1) {
                str2 = str.substring(i);
                if (indexOf == 6 && str.startsWith("REMOVE")) {
                    this.f151198p.remove(str2);
                    return;
                }
            } else {
                str2 = str.substring(i, indexOf2);
            }
            C60490b bVar = this.f151198p.get(str2);
            if (bVar == null) {
                bVar = new C60490b(str2);
                this.f151198p.put(str2, bVar);
            }
            if (indexOf2 != -1 && indexOf == 5 && str.startsWith("CLEAN")) {
                String[] split = str.substring(indexOf2 + 1).split(" ");
                bVar.f151210c = true;
                bVar.f151211d = null;
                bVar.mo207102a(split);
            } else if (indexOf2 == -1 && indexOf == 5 && str.startsWith("DIRTY")) {
                bVar.f151211d = new C60488a(bVar);
            } else if (indexOf2 != -1 || indexOf != 4 || !str.startsWith("READ")) {
                throw new IOException("unexpected journal line: " + str);
            }
        } else {
            throw new IOException("unexpected journal line: " + str);
        }
    }

    /* renamed from: a */
    public synchronized C60491c mo207076a(String str) throws IOException {
        mo207077a();
        m235042k();
        if (m235039e(str)) {
            C60490b bVar = this.f151198p.get(str);
            if (bVar == null) {
                return null;
            }
            if (!bVar.f151210c) {
                return null;
            }
            int i = this.f151186c;
            InputStream[] inputStreamArr = new InputStream[i];
            File[] fileArr = new File[i];
            int i2 = 0;
            for (int i3 = 0; i3 < this.f151186c; i3++) {
                try {
                    fileArr[i3] = bVar.mo207100a(i3);
                    inputStreamArr[i3] = new FileInputStream(fileArr[i3]);
                } catch (FileNotFoundException unused) {
                    while (i2 < this.f151186c && inputStreamArr[i2] != null) {
                        C60494c.m235070a(inputStreamArr[i2]);
                        i2++;
                    }
                    return null;
                }
            }
            this.f151187d++;
            this.f151197o.append((CharSequence) ("READ " + str + '\n'));
            this.f151197o.flush();
            if (mo207084d()) {
                this.f151190g.submit(this.f151200r);
            }
            return new C60491c(str, bVar.f151212e, fileArr, inputStreamArr, bVar.f151209b);
        }
        mo207082c(str);
        throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,120}: \"" + str + "\"");
    }

    /* renamed from: c */
    public synchronized boolean mo207082c(String str) throws IOException {
        mo207077a();
        m235042k();
        if (m235039e(str)) {
            C60490b bVar = this.f151198p.get(str);
            if (bVar != null) {
                if (bVar.f151211d == null) {
                    this.f151187d++;
                    this.f151197o.append((CharSequence) ("REMOVE " + str + '\n'));
                    this.f151197o.flush();
                    this.f151198p.remove(str);
                    for (int i = 0; i < this.f151186c; i++) {
                        File a = bVar.mo207100a(i);
                        if (a.exists()) {
                            if (!a.delete()) {
                                throw new IOException("failed to delete " + a);
                            }
                        }
                        this.f151196n -= bVar.f151209b[i];
                        bVar.f151209b[i] = 0;
                    }
                    if (mo207084d()) {
                        this.f151190g.submit(this.f151200r);
                    }
                    return true;
                }
            }
            return false;
        }
        throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,120}: \"" + str + "\"");
    }

    /* renamed from: a */
    public synchronized C60488a mo207075a(String str, long j) throws IOException {
        mo207077a();
        m235042k();
        m235039e(str);
        if (m235039e(str)) {
            C60490b bVar = this.f151198p.get(str);
            if (j != -1 && (bVar == null || bVar.f151212e != j)) {
                return null;
            }
            if (bVar == null) {
                bVar = new C60490b(str);
                this.f151198p.put(str, bVar);
            } else if (bVar.f151211d != null) {
                return null;
            }
            C60488a aVar = new C60488a(bVar);
            bVar.f151211d = aVar;
            Writer writer = this.f151197o;
            writer.write("DIRTY " + str + '\n');
            this.f151197o.flush();
            return aVar;
        }
        throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,120}: \"" + str + "\"");
    }

    /* renamed from: a */
    public synchronized void mo207078a(C60488a aVar, boolean z) throws IOException {
        C60490b bVar = aVar.f151202a;
        if (bVar.f151211d == aVar) {
            if (z && !bVar.f151210c) {
                for (int i = 0; i < this.f151186c; i++) {
                    if (!aVar.f151203b[i]) {
                        aVar.mo207094b();
                        throw new IllegalStateException("Newly created entry didn't create value for index " + i);
                    } else if (!bVar.mo207103b(i).exists()) {
                        aVar.mo207094b();
                        return;
                    }
                }
            }
            for (int i2 = 0; i2 < this.f151186c; i2++) {
                File b = bVar.mo207103b(i2);
                if (!z) {
                    m235036a(b);
                } else if (b.exists()) {
                    File a = bVar.mo207100a(i2);
                    b.renameTo(a);
                    long j = bVar.f151209b[i2];
                    long length = a.length();
                    bVar.f151209b[i2] = length;
                    this.f151196n = (this.f151196n - j) + length;
                }
            }
            this.f151187d++;
            bVar.f151211d = null;
            if (bVar.f151210c || z) {
                bVar.f151210c = true;
                this.f151197o.write("CLEAN " + bVar.f151208a + bVar.mo207101a() + '\n');
                if (z) {
                    long j2 = this.f151199q;
                    this.f151199q = 1 + j2;
                    bVar.f151212e = j2;
                }
            } else {
                this.f151198p.remove(bVar.f151208a);
                this.f151197o.write("REMOVE " + bVar.f151208a + '\n');
            }
            this.f151197o.flush();
            if (this.f151196n > this.f151195m || mo207084d()) {
                this.f151190g.submit(this.f151200r);
            }
            return;
        }
        throw new IllegalStateException();
    }

    /* renamed from: a */
    private static void m235037a(File file, File file2, boolean z) throws IOException {
        if (z) {
            m235036a(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    /* renamed from: a */
    public static C60485a m235035a(File file, int i, int i2, long j) throws IOException {
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        } else if (i2 > 0) {
            return new C60485a(file, i, i2, j);
        } else {
            throw new IllegalArgumentException("valueCount <= 0");
        }
    }

    private C60485a(File file, int i, int i2, long j) {
        this.f151185b = file;
        this.f151194l = i;
        this.f151191i = new File(file, "journal");
        this.f151192j = new File(file, "journal.tmp");
        this.f151193k = new File(file, "journal.bkp");
        this.f151186c = i2;
        this.f151195m = j;
    }
}
