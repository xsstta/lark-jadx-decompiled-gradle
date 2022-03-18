package com.p938d.p939a;

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
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* renamed from: com.d.a.a */
public final class C20945a implements Closeable {

    /* renamed from: a */
    static final Pattern f51282a = Pattern.compile("[a-z0-9_-]{1,64}");

    /* renamed from: g */
    public static final OutputStream f51283g = new OutputStream() {
        /* class com.p938d.p939a.C20945a.C209472 */

        @Override // java.io.OutputStream
        public void write(int i) throws IOException {
        }
    };

    /* renamed from: b */
    public final File f51284b;

    /* renamed from: c */
    public final int f51285c;

    /* renamed from: d */
    public Writer f51286d;

    /* renamed from: e */
    public int f51287e;

    /* renamed from: f */
    final ThreadPoolExecutor f51288f = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());

    /* renamed from: h */
    private final File f51289h;

    /* renamed from: i */
    private final File f51290i;

    /* renamed from: j */
    private final File f51291j;

    /* renamed from: k */
    private final int f51292k;

    /* renamed from: l */
    private long f51293l;

    /* renamed from: m */
    private long f51294m;

    /* renamed from: n */
    private final LinkedHashMap<String, C20950b> f51295n = new LinkedHashMap<>(0, 0.75f, true);

    /* renamed from: o */
    private long f51296o = 0;

    /* renamed from: p */
    private final Callable<Void> f51297p = new Callable<Void>() {
        /* class com.p938d.p939a.C20945a.CallableC209461 */

        /* renamed from: a */
        public Void call() throws Exception {
            synchronized (C20945a.this) {
                if (C20945a.this.f51286d == null) {
                    return null;
                }
                C20945a.this.mo70804d();
                if (C20945a.this.mo70800b()) {
                    C20945a.this.mo70797a();
                    C20945a.this.f51287e = 0;
                }
                return null;
            }
        }
    };

    /* renamed from: com.d.a.a$a */
    public final class C20948a {

        /* renamed from: a */
        public final C20950b f51299a;

        /* renamed from: b */
        public final boolean[] f51300b;

        /* renamed from: c */
        public boolean f51301c;

        /* renamed from: e */
        private boolean f51303e;

        /* renamed from: b */
        public void mo70812b() throws IOException {
            C20945a.this.mo70798a(this, false);
        }

        /* access modifiers changed from: private */
        /* renamed from: com.d.a.a$a$a */
        public class C20949a extends FilterOutputStream {
            @Override // java.io.OutputStream, java.io.Closeable, java.io.FilterOutputStream, java.lang.AutoCloseable
            public void close() {
                try {
                    this.out.close();
                } catch (IOException unused) {
                    C20948a.this.f51301c = true;
                }
            }

            @Override // java.io.OutputStream, java.io.FilterOutputStream, java.io.Flushable
            public void flush() {
                try {
                    this.out.flush();
                } catch (IOException unused) {
                    C20948a.this.f51301c = true;
                }
            }

            @Override // java.io.OutputStream, java.io.FilterOutputStream
            public void write(int i) {
                try {
                    this.out.write(i);
                } catch (IOException unused) {
                    C20948a.this.f51301c = true;
                }
            }

            private C20949a(OutputStream outputStream) {
                super(outputStream);
            }

            @Override // java.io.OutputStream, java.io.FilterOutputStream
            public void write(byte[] bArr, int i, int i2) {
                try {
                    this.out.write(bArr, i, i2);
                } catch (IOException unused) {
                    C20948a.this.f51301c = true;
                }
            }
        }

        /* renamed from: a */
        public void mo70810a() throws IOException {
            if (this.f51301c) {
                C20945a.this.mo70798a(this, false);
                C20945a.this.mo70802c(this.f51299a.f51305a);
            } else {
                C20945a.this.mo70798a(this, true);
            }
            this.f51303e = true;
        }

        /* renamed from: a */
        public OutputStream mo70809a(int i) throws IOException {
            FileOutputStream fileOutputStream;
            C20949a aVar;
            synchronized (C20945a.this) {
                if (this.f51299a.f51308d == this) {
                    if (!this.f51299a.f51307c) {
                        this.f51300b[i] = true;
                    }
                    File b = this.f51299a.mo70820b(i);
                    try {
                        fileOutputStream = new FileOutputStream(b);
                    } catch (FileNotFoundException unused) {
                        C20945a.this.f51284b.mkdirs();
                        try {
                            fileOutputStream = new FileOutputStream(b);
                        } catch (FileNotFoundException unused2) {
                            return C20945a.f51283g;
                        }
                    }
                    aVar = new C20949a(fileOutputStream);
                } else {
                    throw new IllegalStateException();
                }
            }
            return aVar;
        }

        private C20948a(C20950b bVar) {
            boolean[] zArr;
            this.f51299a = bVar;
            if (bVar.f51307c) {
                zArr = null;
            } else {
                zArr = new boolean[C20945a.this.f51285c];
            }
            this.f51300b = zArr;
        }

        /* renamed from: a */
        public void mo70811a(int i, String str) throws IOException {
            Throwable th;
            OutputStreamWriter outputStreamWriter = null;
            try {
                OutputStreamWriter outputStreamWriter2 = new OutputStreamWriter(mo70809a(i), C20954c.f51323b);
                try {
                    outputStreamWriter2.write(str);
                    C20954c.m76336a(outputStreamWriter2);
                } catch (Throwable th2) {
                    th = th2;
                    outputStreamWriter = outputStreamWriter2;
                    C20954c.m76336a(outputStreamWriter);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                C20954c.m76336a(outputStreamWriter);
                throw th;
            }
        }
    }

    /* renamed from: com.d.a.a$c */
    public final class C20951c implements Closeable {

        /* renamed from: b */
        private final String f51312b;

        /* renamed from: c */
        private final long f51313c;

        /* renamed from: d */
        private final InputStream[] f51314d;

        /* renamed from: e */
        private final long[] f51315e;

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            for (InputStream inputStream : this.f51314d) {
                C20954c.m76336a(inputStream);
            }
        }

        /* renamed from: a */
        public InputStream mo70821a(int i) {
            return this.f51314d[i];
        }

        /* renamed from: b */
        public String mo70822b(int i) throws IOException {
            return C20945a.m76303a(mo70821a(i));
        }

        private C20951c(String str, long j, InputStream[] inputStreamArr, long[] jArr) {
            this.f51312b = str;
            this.f51313c = j;
            this.f51314d = inputStreamArr;
            this.f51315e = jArr;
        }
    }

    /* renamed from: h */
    private void m76310h() {
        if (this.f51286d == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    /* renamed from: e */
    public void mo70805e() throws IOException {
        close();
        C20954c.m76337a(this.f51284b);
    }

    /* renamed from: b */
    public boolean mo70800b() {
        int i = this.f51287e;
        if (i < 2000 || i < this.f51295n.size()) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public synchronized void mo70801c() throws IOException {
        m76310h();
        mo70804d();
        this.f51286d.flush();
    }

    /* access modifiers changed from: private */
    /* renamed from: com.d.a.a$b */
    public final class C20950b {

        /* renamed from: a */
        public final String f51305a;

        /* renamed from: b */
        public final long[] f51306b;

        /* renamed from: c */
        public boolean f51307c;

        /* renamed from: d */
        public C20948a f51308d;

        /* renamed from: e */
        public long f51309e;

        /* renamed from: a */
        public String mo70818a() throws IOException {
            StringBuilder sb = new StringBuilder();
            long[] jArr = this.f51306b;
            for (long j : jArr) {
                sb.append(' ');
                sb.append(j);
            }
            return sb.toString();
        }

        /* renamed from: b */
        private IOException m76326b(String[] strArr) throws IOException {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        /* renamed from: a */
        public File mo70817a(int i) {
            File file = C20945a.this.f51284b;
            return new File(file, this.f51305a + "." + i);
        }

        /* renamed from: b */
        public File mo70820b(int i) {
            File file = C20945a.this.f51284b;
            return new File(file, this.f51305a + "." + i + ".tmp");
        }

        /* renamed from: a */
        public void mo70819a(String[] strArr) throws IOException {
            if (strArr.length == C20945a.this.f51285c) {
                for (int i = 0; i < strArr.length; i++) {
                    try {
                        this.f51306b[i] = Long.parseLong(strArr[i]);
                    } catch (NumberFormatException unused) {
                        throw m76326b(strArr);
                    }
                }
                return;
            }
            throw m76326b(strArr);
        }

        private C20950b(String str) {
            this.f51305a = str;
            this.f51306b = new long[C20945a.this.f51285c];
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        if (this.f51286d != null) {
            Iterator it = new ArrayList(this.f51295n.values()).iterator();
            while (it.hasNext()) {
                C20950b bVar = (C20950b) it.next();
                if (bVar.f51308d != null) {
                    bVar.f51308d.mo70812b();
                }
            }
            mo70804d();
            this.f51286d.close();
            this.f51286d = null;
        }
    }

    /* renamed from: d */
    public void mo70804d() throws IOException {
        while (this.f51294m > this.f51293l) {
            mo70802c(this.f51295n.entrySet().iterator().next().getKey());
        }
    }

    /* renamed from: g */
    private void m76309g() throws IOException {
        m76304a(this.f51290i);
        Iterator<C20950b> it = this.f51295n.values().iterator();
        while (it.hasNext()) {
            C20950b next = it.next();
            int i = 0;
            if (next.f51308d == null) {
                while (i < this.f51285c) {
                    this.f51294m += next.f51306b[i];
                    i++;
                }
            } else {
                next.f51308d = null;
                while (i < this.f51285c) {
                    m76304a(next.mo70817a(i));
                    m76304a(next.mo70820b(i));
                    i++;
                }
                it.remove();
            }
        }
    }

    /* renamed from: f */
    private void m76308f() throws IOException {
        C20952b bVar = new C20952b(new FileInputStream(this.f51289h), C20954c.f51322a);
        try {
            String a = bVar.mo70824a();
            String a2 = bVar.mo70824a();
            String a3 = bVar.mo70824a();
            String a4 = bVar.mo70824a();
            String a5 = bVar.mo70824a();
            if (!"libcore.io.DiskLruCache".equals(a) || !"1".equals(a2) || !Integer.toString(this.f51292k).equals(a3) || !Integer.toString(this.f51285c).equals(a4) || !"".equals(a5)) {
                throw new IOException("unexpected journal header: [" + a + ", " + a2 + ", " + a4 + ", " + a5 + "]");
            }
            int i = 0;
            while (true) {
                try {
                    m76306d(bVar.mo70824a());
                    i++;
                } catch (EOFException unused) {
                    this.f51287e = i - this.f51295n.size();
                    return;
                }
            }
        } finally {
            C20954c.m76336a(bVar);
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public synchronized void mo70797a() throws IOException {
        Writer writer = this.f51286d;
        if (writer != null) {
            writer.close();
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f51290i), C20954c.f51322a));
        try {
            bufferedWriter.write("libcore.io.DiskLruCache");
            bufferedWriter.write("\n");
            bufferedWriter.write("1");
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.f51292k));
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.f51285c));
            bufferedWriter.write("\n");
            bufferedWriter.write("\n");
            for (C20950b bVar : this.f51295n.values()) {
                if (bVar.f51308d != null) {
                    bufferedWriter.write("DIRTY " + bVar.f51305a + '\n');
                } else {
                    bufferedWriter.write("CLEAN " + bVar.f51305a + bVar.mo70818a() + '\n');
                }
            }
            bufferedWriter.close();
            if (this.f51289h.exists()) {
                m76305a(this.f51289h, this.f51291j, true);
            }
            m76305a(this.f51290i, this.f51289h, false);
            this.f51291j.delete();
            this.f51286d = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f51289h, true), C20954c.f51322a));
        } catch (Throwable th) {
            bufferedWriter.close();
            throw th;
        }
    }

    /* renamed from: b */
    public C20948a mo70799b(String str) throws IOException {
        return mo70795a(str, -1);
    }

    /* renamed from: a */
    public static String m76303a(InputStream inputStream) throws IOException {
        return C20954c.m76335a((Reader) new InputStreamReader(inputStream, C20954c.f51323b));
    }

    /* renamed from: a */
    private static void m76304a(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    /* renamed from: e */
    private void m76307e(String str) {
        if (!f51282a.matcher(str).matches()) {
            throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,64}: \"" + str + "\"");
        }
    }

    /* renamed from: d */
    private void m76306d(String str) throws IOException {
        String str2;
        int indexOf = str.indexOf(32);
        if (indexOf != -1) {
            int i = indexOf + 1;
            int indexOf2 = str.indexOf(32, i);
            if (indexOf2 == -1) {
                str2 = str.substring(i);
                if (indexOf == 6 && str.startsWith("REMOVE")) {
                    this.f51295n.remove(str2);
                    return;
                }
            } else {
                str2 = str.substring(i, indexOf2);
            }
            C20950b bVar = this.f51295n.get(str2);
            if (bVar == null) {
                bVar = new C20950b(str2);
                this.f51295n.put(str2, bVar);
            }
            if (indexOf2 != -1 && indexOf == 5 && str.startsWith("CLEAN")) {
                String[] split = str.substring(indexOf2 + 1).split(" ");
                bVar.f51307c = true;
                bVar.f51308d = null;
                bVar.mo70819a(split);
            } else if (indexOf2 == -1 && indexOf == 5 && str.startsWith("DIRTY")) {
                bVar.f51308d = new C20948a(bVar);
            } else if (indexOf2 != -1 || indexOf != 4 || !str.startsWith("READ")) {
                throw new IOException("unexpected journal line: " + str);
            }
        } else {
            throw new IOException("unexpected journal line: " + str);
        }
    }

    /* renamed from: c */
    public synchronized boolean mo70802c(String str) throws IOException {
        m76310h();
        m76307e(str);
        C20950b bVar = this.f51295n.get(str);
        if (bVar != null) {
            if (bVar.f51308d == null) {
                for (int i = 0; i < this.f51285c; i++) {
                    File a = bVar.mo70817a(i);
                    if (a.exists()) {
                        if (!a.delete()) {
                            throw new IOException("failed to delete " + a);
                        }
                    }
                    this.f51294m -= bVar.f51306b[i];
                    bVar.f51306b[i] = 0;
                }
                this.f51287e++;
                this.f51286d.append((CharSequence) ("REMOVE " + str + '\n'));
                this.f51295n.remove(str);
                if (mo70800b()) {
                    this.f51288f.submit(this.f51297p);
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public synchronized C20951c mo70796a(String str) throws IOException {
        m76310h();
        m76307e(str);
        C20950b bVar = this.f51295n.get(str);
        if (bVar == null) {
            return null;
        }
        if (!bVar.f51307c) {
            return null;
        }
        InputStream[] inputStreamArr = new InputStream[this.f51285c];
        int i = 0;
        for (int i2 = 0; i2 < this.f51285c; i2++) {
            try {
                inputStreamArr[i2] = new FileInputStream(bVar.mo70817a(i2));
            } catch (FileNotFoundException unused) {
                while (i < this.f51285c && inputStreamArr[i] != null) {
                    C20954c.m76336a(inputStreamArr[i]);
                    i++;
                }
                return null;
            }
        }
        this.f51287e++;
        this.f51286d.append((CharSequence) ("READ " + str + '\n'));
        if (mo70800b()) {
            this.f51288f.submit(this.f51297p);
        }
        return new C20951c(str, bVar.f51309e, inputStreamArr, bVar.f51306b);
    }

    /* renamed from: a */
    public synchronized C20948a mo70795a(String str, long j) throws IOException {
        m76310h();
        m76307e(str);
        C20950b bVar = this.f51295n.get(str);
        if (j != -1 && (bVar == null || bVar.f51309e != j)) {
            return null;
        }
        if (bVar == null) {
            bVar = new C20950b(str);
            this.f51295n.put(str, bVar);
        } else if (bVar.f51308d != null) {
            return null;
        }
        C20948a aVar = new C20948a(bVar);
        bVar.f51308d = aVar;
        Writer writer = this.f51286d;
        writer.write("DIRTY " + str + '\n');
        this.f51286d.flush();
        return aVar;
    }

    /* renamed from: a */
    public synchronized void mo70798a(C20948a aVar, boolean z) throws IOException {
        C20950b bVar = aVar.f51299a;
        if (bVar.f51308d == aVar) {
            if (z && !bVar.f51307c) {
                for (int i = 0; i < this.f51285c; i++) {
                    if (!aVar.f51300b[i]) {
                        aVar.mo70812b();
                        throw new IllegalStateException("Newly created entry didn't create value for index " + i);
                    } else if (!bVar.mo70820b(i).exists()) {
                        aVar.mo70812b();
                        return;
                    }
                }
            }
            for (int i2 = 0; i2 < this.f51285c; i2++) {
                File b = bVar.mo70820b(i2);
                if (!z) {
                    m76304a(b);
                } else if (b.exists()) {
                    File a = bVar.mo70817a(i2);
                    b.renameTo(a);
                    long j = bVar.f51306b[i2];
                    long length = a.length();
                    bVar.f51306b[i2] = length;
                    this.f51294m = (this.f51294m - j) + length;
                }
            }
            this.f51287e++;
            bVar.f51308d = null;
            if (bVar.f51307c || z) {
                bVar.f51307c = true;
                this.f51286d.write("CLEAN " + bVar.f51305a + bVar.mo70818a() + '\n');
                if (z) {
                    long j2 = this.f51296o;
                    this.f51296o = 1 + j2;
                    bVar.f51309e = j2;
                }
            } else {
                this.f51295n.remove(bVar.f51305a);
                this.f51286d.write("REMOVE " + bVar.f51305a + '\n');
            }
            this.f51286d.flush();
            if (this.f51294m > this.f51293l || mo70800b()) {
                this.f51288f.submit(this.f51297p);
            }
            return;
        }
        throw new IllegalStateException();
    }

    /* renamed from: a */
    private static void m76305a(File file, File file2, boolean z) throws IOException {
        if (z) {
            m76304a(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    private C20945a(File file, int i, int i2, long j) {
        this.f51284b = file;
        this.f51292k = i;
        this.f51289h = new File(file, "journal");
        this.f51290i = new File(file, "journal.tmp");
        this.f51291j = new File(file, "journal.bkp");
        this.f51285c = i2;
        this.f51293l = j;
    }

    /* renamed from: a */
    public static C20945a m76302a(File file, int i, int i2, long j) throws IOException {
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        } else if (i2 > 0) {
            File file2 = new File(file, "journal.bkp");
            if (file2.exists()) {
                File file3 = new File(file, "journal");
                if (file3.exists()) {
                    file2.delete();
                } else {
                    m76305a(file2, file3, false);
                }
            }
            C20945a aVar = new C20945a(file, i, i2, j);
            if (aVar.f51289h.exists()) {
                try {
                    aVar.m76308f();
                    aVar.m76309g();
                    aVar.f51286d = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(aVar.f51289h, true), C20954c.f51322a));
                    return aVar;
                } catch (IOException e) {
                    PrintStream printStream = System.out;
                    printStream.println("DiskLruCache " + file + " is corrupt: " + e.getMessage() + ", removing");
                    aVar.mo70805e();
                }
            }
            file.mkdirs();
            C20945a aVar2 = new C20945a(file, i, i2, j);
            aVar2.mo70797a();
            return aVar2;
        } else {
            throw new IllegalArgumentException("valueCount <= 0");
        }
    }
}
