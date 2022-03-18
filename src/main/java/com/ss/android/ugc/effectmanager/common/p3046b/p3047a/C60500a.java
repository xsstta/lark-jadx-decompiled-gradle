package com.ss.android.ugc.effectmanager.common.p3046b.p3047a;

import com.ss.android.ugc.effectmanager.common.logger.EPLog;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.regex.Pattern;

/* renamed from: com.ss.android.ugc.effectmanager.common.b.a.a */
public final class C60500a implements Closeable {

    /* renamed from: e */
    public static final OutputStream f151260e = new OutputStream() {
        /* class com.ss.android.ugc.effectmanager.common.p3046b.p3047a.C60500a.C605022 */

        @Override // java.io.OutputStream
        public void write(int i) throws IOException {
        }
    };

    /* renamed from: f */
    private static final Pattern f151261f = Pattern.compile("[a-z0-9_-]{1,120}");

    /* renamed from: a */
    public final File f151262a;

    /* renamed from: b */
    public final int f151263b;

    /* renamed from: c */
    public Writer f151264c;

    /* renamed from: d */
    public int f151265d;

    /* renamed from: g */
    private final File f151266g;

    /* renamed from: h */
    private final File f151267h;

    /* renamed from: i */
    private final File f151268i;

    /* renamed from: j */
    private final int f151269j;

    /* renamed from: k */
    private long f151270k;

    /* renamed from: l */
    private long f151271l;

    /* renamed from: m */
    private final LinkedHashMap<String, C60505b> f151272m = new LinkedHashMap<>(0, 0.75f, true);

    /* renamed from: n */
    private long f151273n = 0;

    /* renamed from: o */
    private final ExecutorService f151274o = Executors.newSingleThreadExecutor();

    /* renamed from: p */
    private IAllowListRule f151275p;

    /* renamed from: q */
    private final Callable<Void> f151276q = new Callable<Void>() {
        /* class com.ss.android.ugc.effectmanager.common.p3046b.p3047a.C60500a.CallableC605011 */

        /* renamed from: a */
        public Void call() throws Exception {
            synchronized (C60500a.this) {
                if (C60500a.this.f151264c == null) {
                    return null;
                }
                C60500a.this.mo207165e();
                if (C60500a.this.mo207163d()) {
                    C60500a.this.mo207158b();
                    C60500a.this.f151265d = 0;
                }
                return null;
            }
        }
    };

    /* renamed from: com.ss.android.ugc.effectmanager.common.b.a.a$a */
    public final class C60503a {

        /* renamed from: a */
        public final C60505b f151278a;

        /* renamed from: b */
        public final boolean[] f151279b;

        /* renamed from: c */
        public boolean f151280c;

        /* renamed from: e */
        private boolean f151282e;

        /* renamed from: b */
        public void mo207173b() throws IOException {
            C60500a.this.mo207156a(this, false);
        }

        /* renamed from: c */
        public void mo207174c() {
            if (!this.f151282e) {
                try {
                    mo207173b();
                } catch (IOException unused) {
                }
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: com.ss.android.ugc.effectmanager.common.b.a.a$a$a */
        public class C60504a extends FilterOutputStream {
            @Override // java.io.OutputStream, java.io.Closeable, java.io.FilterOutputStream, java.lang.AutoCloseable
            public void close() {
                try {
                    this.out.close();
                } catch (IOException unused) {
                    C60503a.this.f151280c = true;
                }
            }

            @Override // java.io.OutputStream, java.io.FilterOutputStream, java.io.Flushable
            public void flush() {
                try {
                    this.out.flush();
                } catch (IOException unused) {
                    C60503a.this.f151280c = true;
                }
            }

            @Override // java.io.OutputStream, java.io.FilterOutputStream
            public void write(int i) {
                try {
                    this.out.write(i);
                } catch (IOException unused) {
                    C60503a.this.f151280c = true;
                }
            }

            private C60504a(OutputStream outputStream) {
                super(outputStream);
            }

            @Override // java.io.OutputStream, java.io.FilterOutputStream
            public void write(byte[] bArr, int i, int i2) {
                try {
                    this.out.write(bArr, i, i2);
                } catch (IOException unused) {
                    C60503a.this.f151280c = true;
                }
            }
        }

        /* renamed from: a */
        public void mo207172a() throws IOException {
            if (this.f151280c) {
                C60500a.this.mo207156a(this, false);
                C60500a.this.mo207159b(this.f151278a.f151284a);
            } else {
                C60500a.this.mo207156a(this, true);
            }
            this.f151282e = true;
        }

        /* renamed from: a */
        public OutputStream mo207171a(int i) throws IOException {
            FileOutputStream fileOutputStream;
            C60504a aVar;
            if (i < 0 || i >= C60500a.this.f151263b) {
                throw new IllegalArgumentException("Expected index " + i + " to be greater than 0 and less than the maximum value count of " + C60500a.this.f151263b);
            }
            synchronized (C60500a.this) {
                if (this.f151278a.f151287d == this) {
                    if (!this.f151278a.f151286c) {
                        this.f151279b[i] = true;
                    }
                    File b = this.f151278a.mo207182b(i);
                    try {
                        fileOutputStream = new FileOutputStream(b);
                    } catch (FileNotFoundException unused) {
                        C60500a.this.f151262a.mkdirs();
                        try {
                            fileOutputStream = new FileOutputStream(b);
                        } catch (FileNotFoundException unused2) {
                            return C60500a.f151260e;
                        }
                    }
                    aVar = new C60504a(fileOutputStream);
                } else {
                    throw new IllegalStateException();
                }
            }
            return aVar;
        }

        private C60503a(C60505b bVar) {
            boolean[] zArr;
            this.f151278a = bVar;
            if (bVar.f151286c) {
                zArr = null;
            } else {
                zArr = new boolean[C60500a.this.f151263b];
            }
            this.f151279b = zArr;
        }
    }

    /* renamed from: c */
    public synchronized long mo207160c() {
        return this.f151270k;
    }

    /* renamed from: i */
    private void m235127i() {
        if (this.f151264c == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.ugc.effectmanager.common.b.a.a$b */
    public final class C60505b {

        /* renamed from: a */
        public final String f151284a;

        /* renamed from: b */
        public final long[] f151285b;

        /* renamed from: c */
        public boolean f151286c;

        /* renamed from: d */
        public C60503a f151287d;

        /* renamed from: e */
        public long f151288e;

        /* renamed from: a */
        public String mo207180a() throws IOException {
            StringBuilder sb = new StringBuilder();
            long[] jArr = this.f151285b;
            for (long j : jArr) {
                sb.append(' ');
                sb.append(j);
            }
            return sb.toString();
        }

        /* renamed from: b */
        private IOException m235147b(String[] strArr) throws IOException {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        /* renamed from: a */
        public File mo207179a(int i) {
            if (i == 0) {
                return new File(C60500a.this.f151262a, this.f151284a);
            }
            File file = C60500a.this.f151262a;
            return new File(file, this.f151284a + "." + i);
        }

        /* renamed from: a */
        public void mo207181a(String[] strArr) throws IOException {
            if (strArr.length == C60500a.this.f151263b) {
                for (int i = 0; i < strArr.length; i++) {
                    try {
                        this.f151285b[i] = Long.parseLong(strArr[i]);
                    } catch (NumberFormatException unused) {
                        throw m235147b(strArr);
                    }
                }
                return;
            }
            throw m235147b(strArr);
        }

        /* renamed from: b */
        public File mo207182b(int i) {
            if (i == 0) {
                File file = C60500a.this.f151262a;
                return new File(file, this.f151284a + ".tmp");
            }
            File file2 = C60500a.this.f151262a;
            return new File(file2, this.f151284a + "." + i + ".tmp");
        }

        private C60505b(String str) {
            this.f151284a = str;
            this.f151285b = new long[C60500a.this.f151263b];
        }
    }

    /* renamed from: d */
    public boolean mo207163d() {
        int i = this.f151265d;
        if (i < 2000 || i < this.f151272m.size()) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public void mo207167f() throws IOException {
        EPLog.m235179b("DiskLruCache", "delete");
        close();
        FileUtils.f151342a.mo207252b(this.f151262a);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        if (this.f151264c != null) {
            Iterator it = new ArrayList(this.f151272m.values()).iterator();
            while (it.hasNext()) {
                C60505b bVar = (C60505b) it.next();
                if (bVar.f151287d != null) {
                    bVar.f151287d.mo207173b();
                }
            }
            mo207165e();
            this.f151264c.close();
            this.f151264c = null;
        }
    }

    /* renamed from: h */
    private void m235125h() throws IOException {
        m235120a(this.f151267h);
        Iterator<C60505b> it = this.f151272m.values().iterator();
        while (it.hasNext()) {
            C60505b next = it.next();
            int i = 0;
            if (next.f151287d == null) {
                while (i < this.f151263b) {
                    this.f151271l += next.f151285b[i];
                    i++;
                }
            } else {
                next.f151287d = null;
                while (i < this.f151263b) {
                    m235120a(next.mo207179a(i));
                    m235120a(next.mo207182b(i));
                    i++;
                }
                it.remove();
            }
        }
    }

    /* renamed from: g */
    private void m235123g() throws IOException {
        C60506c cVar = new C60506c(new FileInputStream(this.f151266g), FileUtils.f151342a.mo207246a());
        try {
            String a = cVar.mo207183a();
            String a2 = cVar.mo207183a();
            String a3 = cVar.mo207183a();
            String a4 = cVar.mo207183a();
            String a5 = cVar.mo207183a();
            if (!"libcore.io.DiskLruCache".equals(a) || !"1".equals(a2) || !Integer.toString(this.f151269j).equals(a3) || !Integer.toString(this.f151263b).equals(a4) || !"".equals(a5)) {
                throw new IOException("unexpected journal header: [" + a + ", " + a2 + ", " + a4 + ", " + a5 + "]");
            }
            int i = 0;
            while (true) {
                try {
                    m235124g(cVar.mo207183a());
                    i++;
                } catch (EOFException unused) {
                    this.f151265d = i - this.f151272m.size();
                    if (cVar.mo207184b()) {
                        mo207158b();
                    } else {
                        this.f151264c = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f151266g, true), FileUtils.f151342a.mo207246a()));
                    }
                    return;
                }
            }
        } finally {
            FileUtils.f151342a.mo207247a(cVar);
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: b */
    public synchronized void mo207158b() throws IOException {
        Writer writer = this.f151264c;
        if (writer != null) {
            writer.close();
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f151267h), FileUtils.f151342a.mo207246a()));
        try {
            bufferedWriter.write("libcore.io.DiskLruCache");
            bufferedWriter.write("\n");
            bufferedWriter.write("1");
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.f151269j));
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.f151263b));
            bufferedWriter.write("\n");
            bufferedWriter.write("\n");
            for (C60505b bVar : this.f151272m.values()) {
                if (bVar.f151287d != null) {
                    bufferedWriter.write("DIRTY " + bVar.f151284a + '\n');
                } else {
                    bufferedWriter.write("CLEAN " + bVar.f151284a + bVar.mo207180a() + '\n');
                }
            }
            bufferedWriter.close();
            if (this.f151266g.exists()) {
                m235121a(this.f151266g, this.f151268i, true);
            }
            m235121a(this.f151267h, this.f151266g, false);
            this.f151268i.delete();
            this.f151264c = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f151266g, true), FileUtils.f151342a.mo207246a()));
        } catch (Throwable th) {
            bufferedWriter.close();
            throw th;
        }
    }

    /* renamed from: e */
    public synchronized void mo207165e() throws IOException {
        Map.Entry<String, C60505b> next;
        EPLog.m235179b("DiskLruCache", "trimToSize size: " + this.f151271l);
        while (this.f151271l > this.f151270k) {
            int size = this.f151272m.size();
            int i = 0;
            Iterator<Map.Entry<String, C60505b>> it = this.f151272m.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                next = it.next();
                EPLog.m235179b("DiskLruCache", "trimToSize key:" + next.getKey());
                IAllowListRule bVar = this.f151275p;
                if (bVar == null || !bVar.mo207142e(next.getKey())) {
                    EPLog.m235179b("DiskLruCache", "trimToSize exe");
                } else {
                    i++;
                }
            }
            EPLog.m235179b("DiskLruCache", "trimToSize exe");
            if (size - i < 10) {
                mo207155a(mo207160c() * 2);
            }
            mo207159b(next.getKey());
        }
    }

    /* renamed from: a */
    public synchronized boolean mo207157a() {
        boolean z;
        File file = this.f151262a;
        if (file == null || !file.exists() || !this.f151266g.exists()) {
            z = false;
        } else {
            z = true;
        }
        return z;
    }

    /* renamed from: a */
    public C60503a mo207153a(String str) throws IOException {
        return mo207154a(str, -1);
    }

    /* renamed from: h */
    private boolean m235126h(String str) {
        return f151261f.matcher(str).matches();
    }

    /* renamed from: a */
    public synchronized void mo207155a(long j) {
        this.f151270k = j;
        this.f151274o.submit(this.f151276q);
    }

    /* renamed from: e */
    public synchronized void mo207166e(String str) {
        m235127i();
        this.f151272m.get(str);
    }

    /* renamed from: a */
    private static void m235120a(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    /* renamed from: f */
    public static String m235122f(String str) {
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char c = charArray[i];
            if (!(c == '_' || c == '-' || ((c >= 'a' && c <= 'z') || (c >= '0' && c <= '9')))) {
                charArray[i] = '_';
            }
        }
        return new String(charArray);
    }

    /* renamed from: d */
    public synchronized boolean mo207164d(String str) {
        m235127i();
        if (m235126h(str)) {
            C60505b bVar = this.f151272m.get(str);
            if (bVar == null) {
                return false;
            }
            if (!bVar.f151286c) {
                return false;
            }
            try {
                this.f151265d++;
                this.f151264c.write("READ " + str + '\n');
                this.f151264c.flush();
                if (mo207163d()) {
                    this.f151274o.submit(this.f151276q);
                }
            } catch (IOException unused) {
            }
            return true;
        }
        throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,120}: \"" + str + "\"");
    }

    /* renamed from: c */
    public synchronized boolean mo207161c(String str) throws IOException {
        EPLog.m235179b("DiskLruCache", "addEntryToCache:" + str);
        m235127i();
        if (m235126h(str)) {
            C60505b bVar = this.f151272m.get(str);
            if (bVar == null) {
                bVar = new C60505b(str);
                this.f151272m.put(str, bVar);
            } else if (bVar.f151287d != null) {
                return false;
            }
            File a = bVar.mo207179a(0);
            if (a.exists()) {
                long j = bVar.f151285b[0];
                long length = a.length();
                if (a.isDirectory()) {
                    length = FileUtils.f151342a.mo207258d(a);
                }
                bVar.f151285b[0] = length;
                this.f151271l = (this.f151271l - j) + length;
                this.f151265d++;
                bVar.f151287d = null;
                bVar.f151286c = true;
                this.f151264c.write("CLEAN " + bVar.f151284a + bVar.mo207180a() + '\n');
                long j2 = this.f151273n;
                this.f151273n = 1 + j2;
                bVar.f151288e = j2;
                this.f151264c.flush();
                if (this.f151271l > this.f151270k || mo207163d()) {
                    this.f151274o.submit(this.f151276q);
                }
                return true;
            }
            this.f151272m.remove(bVar.f151284a);
            this.f151264c.write("REMOVE " + bVar.f151284a + '\n');
            return false;
        }
        throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,120}: \"" + str + "\"");
    }

    /* renamed from: g */
    private void m235124g(String str) throws IOException {
        String str2;
        int indexOf = str.indexOf(32);
        if (indexOf != -1) {
            int i = indexOf + 1;
            int indexOf2 = str.indexOf(32, i);
            if (indexOf2 == -1) {
                str2 = str.substring(i);
                if (indexOf == 6 && str.startsWith("REMOVE")) {
                    this.f151272m.remove(str2);
                    return;
                }
            } else {
                str2 = str.substring(i, indexOf2);
            }
            C60505b bVar = this.f151272m.get(str2);
            if (bVar == null) {
                bVar = new C60505b(str2);
                this.f151272m.put(str2, bVar);
            }
            if (indexOf2 != -1 && indexOf == 5 && str.startsWith("CLEAN")) {
                String[] split = str.substring(indexOf2 + 1).split(" ");
                bVar.f151286c = true;
                bVar.f151287d = null;
                bVar.mo207181a(split);
            } else if (indexOf2 == -1 && indexOf == 5 && str.startsWith("DIRTY")) {
                bVar.f151287d = new C60503a(bVar);
            } else if (indexOf2 != -1 || indexOf != 4 || !str.startsWith("READ")) {
                throw new IOException("unexpected journal line: " + str);
            }
        } else {
            throw new IOException("unexpected journal line: " + str);
        }
    }

    /* renamed from: b */
    public synchronized boolean mo207159b(String str) throws IOException {
        EPLog.m235179b("DiskLruCache", "remove:" + str);
        m235127i();
        if (m235126h(str)) {
            C60505b bVar = this.f151272m.get(str);
            boolean z = true;
            if (bVar != null) {
                if (bVar.f151287d == null) {
                    this.f151265d++;
                    this.f151264c.append((CharSequence) ("REMOVE " + str + '\n'));
                    this.f151264c.flush();
                    this.f151272m.remove(str);
                    for (int i = 0; i < this.f151263b; i++) {
                        File a = bVar.mo207179a(i);
                        if (a.exists()) {
                            if (a.isFile()) {
                                if (!a.delete()) {
                                    EPLog.m235180c("DiskLruCache", "remove  err:" + str);
                                    throw new IOException("failed to delete " + a);
                                }
                            }
                            if (!a.isDirectory()) {
                                continue;
                            } else if (!FileUtils.f151342a.mo207257c(a)) {
                                EPLog.m235180c("DiskLruCache", "remove  err:" + str);
                                throw new IOException("failed to delete " + a);
                            }
                        }
                        this.f151271l -= bVar.f151285b[i];
                        bVar.f151285b[i] = 0;
                    }
                    if (mo207163d()) {
                        this.f151274o.submit(this.f151276q);
                    }
                    return true;
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("remove: can not:");
            if (bVar != null) {
                z = false;
            }
            sb.append(z);
            EPLog.m235180c("DiskLruCache", sb.toString());
            return false;
        }
        throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,120}: \"" + str + "\"");
    }

    /* renamed from: a */
    public synchronized C60503a mo207154a(String str, long j) throws IOException {
        m235127i();
        if (m235126h(str)) {
            C60505b bVar = this.f151272m.get(str);
            if (j != -1 && (bVar == null || bVar.f151288e != j)) {
                return null;
            }
            if (bVar == null) {
                bVar = new C60505b(str);
                this.f151272m.put(str, bVar);
            } else if (bVar.f151287d != null) {
                return null;
            }
            C60503a aVar = new C60503a(bVar);
            bVar.f151287d = aVar;
            Writer writer = this.f151264c;
            writer.write("DIRTY " + str + '\n');
            this.f151264c.flush();
            return aVar;
        }
        throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,120}: \"" + str + "\"");
    }

    /* renamed from: a */
    public synchronized void mo207156a(C60503a aVar, boolean z) throws IOException {
        String str;
        C60505b bVar = aVar.f151278a;
        StringBuilder sb = new StringBuilder();
        sb.append("completeEdit start, key: ");
        if (bVar == null) {
            str = "null";
        } else {
            str = bVar.f151284a;
        }
        sb.append(str);
        sb.append(", success: ");
        sb.append(z);
        EPLog.m235179b("DiskLruCache", sb.toString());
        if (bVar.f151287d == aVar) {
            if (z && !bVar.f151286c) {
                for (int i = 0; i < this.f151263b; i++) {
                    if (!aVar.f151279b[i]) {
                        aVar.mo207173b();
                        throw new IllegalStateException("Newly created entry didn't create value for index " + i);
                    } else if (!bVar.mo207182b(i).exists()) {
                        aVar.mo207173b();
                        return;
                    }
                }
            }
            for (int i2 = 0; i2 < this.f151263b; i2++) {
                File b = bVar.mo207182b(i2);
                if (!z) {
                    m235120a(b);
                } else if (b.exists()) {
                    File a = bVar.mo207179a(i2);
                    b.renameTo(a);
                    long j = bVar.f151285b[i2];
                    long length = a.length();
                    bVar.f151285b[i2] = length;
                    this.f151271l = (this.f151271l - j) + length;
                }
            }
            this.f151265d++;
            bVar.f151287d = null;
            if (bVar.f151286c || z) {
                bVar.f151286c = true;
                this.f151264c.write("CLEAN " + bVar.f151284a + bVar.mo207180a() + '\n');
                if (z) {
                    long j2 = this.f151273n;
                    this.f151273n = 1 + j2;
                    bVar.f151288e = j2;
                }
            } else {
                this.f151272m.remove(bVar.f151284a);
                this.f151264c.write("REMOVE " + bVar.f151284a + '\n');
            }
            this.f151264c.flush();
            if (this.f151271l > this.f151270k || mo207163d()) {
                this.f151274o.submit(this.f151276q);
            }
            return;
        }
        throw new IllegalStateException();
    }

    /* renamed from: a */
    private static void m235121a(File file, File file2, boolean z) throws IOException {
        if (z) {
            m235120a(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    private C60500a(File file, int i, int i2, long j) {
        this.f151262a = file;
        this.f151269j = i;
        this.f151266g = new File(file, "journal");
        this.f151267h = new File(file, "journal.tmp");
        this.f151268i = new File(file, "journal.bkp");
        this.f151263b = i2;
        this.f151270k = j;
    }

    /* renamed from: a */
    public static synchronized C60500a m235119a(File file, int i, int i2, long j, IAllowListRule bVar) throws IOException {
        synchronized (C60500a.class) {
            if (j <= 0) {
                throw new IllegalArgumentException("maxSize <= 0");
            } else if (i2 > 0) {
                File file2 = new File(file, "journal.bkp");
                if (file2.exists()) {
                    File file3 = new File(file, "journal");
                    if (file3.exists()) {
                        file2.delete();
                    } else {
                        m235121a(file2, file3, false);
                    }
                }
                C60500a aVar = new C60500a(file, i, i2, j);
                if (aVar.f151266g.exists()) {
                    try {
                        aVar.m235123g();
                        aVar.m235125h();
                        return aVar;
                    } catch (IOException e) {
                        PrintStream printStream = System.out;
                        printStream.println("DiskLruCache " + file + " is corrupt: " + e.getMessage() + ", removing");
                        aVar.mo207167f();
                    }
                }
                file.mkdirs();
                C60500a aVar2 = new C60500a(file, i, i2, j);
                aVar2.mo207158b();
                if (bVar != null) {
                    aVar2.f151275p = bVar;
                }
                return aVar2;
            } else {
                throw new IllegalArgumentException("valueCount <= 0");
            }
        }
    }
}
