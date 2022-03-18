package com.ss.android.lark.mail.impl.p2168g.p2170b;

import com.ss.android.lark.log.Log;
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

/* renamed from: com.ss.android.lark.mail.impl.g.b.a */
public final class C42154a implements Closeable {

    /* renamed from: a */
    static final Pattern f107184a = Pattern.compile("[a-z0-9_-]{1,120}");

    /* renamed from: b */
    public static final OutputStream f107185b = new OutputStream() {
        /* class com.ss.android.lark.mail.impl.p2168g.p2170b.C42154a.C421551 */

        @Override // java.io.OutputStream
        public void write(int i) throws IOException {
        }
    };

    /* renamed from: c */
    final ThreadPoolExecutor f107186c = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());

    /* renamed from: d */
    public final File f107187d;

    /* renamed from: e */
    public final int f107188e;

    /* renamed from: f */
    public Writer f107189f;

    /* renamed from: g */
    public int f107190g;

    /* renamed from: h */
    private final File f107191h;

    /* renamed from: i */
    private final File f107192i;

    /* renamed from: j */
    private final File f107193j;

    /* renamed from: k */
    private final int f107194k;

    /* renamed from: l */
    private final LinkedHashMap<String, C42159b> f107195l = new LinkedHashMap<>(0, 0.75f, true);

    /* renamed from: m */
    private long f107196m;

    /* renamed from: n */
    private long f107197n = 0;

    /* renamed from: o */
    private final Callable<Void> f107198o = new Callable<Void>() {
        /* class com.ss.android.lark.mail.impl.p2168g.p2170b.C42154a.CallableC421562 */

        /* renamed from: a */
        public Void call() throws Exception {
            synchronized (C42154a.this) {
                if (C42154a.this.f107189f == null) {
                    return null;
                }
                C42154a.this.mo152128d();
                if (C42154a.this.mo152124b()) {
                    C42154a.this.mo152121a();
                    C42154a.this.f107190g = 0;
                }
                return null;
            }
        }
    };

    /* renamed from: p */
    private long f107199p = 0;

    /* renamed from: com.ss.android.lark.mail.impl.g.b.a$a */
    public final class C42157a {

        /* renamed from: a */
        public final C42159b f107201a;

        /* renamed from: b */
        public final boolean[] f107202b;

        /* renamed from: c */
        public boolean f107203c;

        /* renamed from: e */
        private boolean f107205e;

        /* renamed from: b */
        public void mo152135b() throws IOException {
            C42154a.this.mo152122a(this, false);
        }

        /* access modifiers changed from: private */
        /* renamed from: com.ss.android.lark.mail.impl.g.b.a$a$a */
        public class C42158a extends FilterOutputStream {
            @Override // java.io.OutputStream, java.io.Closeable, java.io.FilterOutputStream, java.lang.AutoCloseable
            public void close() {
                try {
                    this.out.close();
                } catch (IOException unused) {
                    C42157a.this.f107203c = true;
                }
            }

            @Override // java.io.OutputStream, java.io.FilterOutputStream, java.io.Flushable
            public void flush() {
                try {
                    this.out.flush();
                } catch (IOException unused) {
                    C42157a.this.f107203c = true;
                }
            }

            @Override // java.io.OutputStream, java.io.FilterOutputStream
            public void write(int i) {
                try {
                    this.out.write(i);
                } catch (IOException unused) {
                    C42157a.this.f107203c = true;
                }
            }

            private C42158a(OutputStream outputStream) {
                super(outputStream);
            }

            @Override // java.io.OutputStream, java.io.FilterOutputStream
            public void write(byte[] bArr, int i, int i2) {
                try {
                    this.out.write(bArr, i, i2);
                } catch (IOException unused) {
                    C42157a.this.f107203c = true;
                }
            }
        }

        /* renamed from: a */
        public void mo152134a() throws IOException {
            if (this.f107203c) {
                C42154a.this.mo152122a(this, false);
                C42154a.this.mo152126c(this.f107201a.f107207a);
            } else {
                C42154a.this.mo152122a(this, true);
            }
            this.f107205e = true;
        }

        /* renamed from: a */
        public OutputStream mo152133a(int i) throws IOException {
            FileOutputStream fileOutputStream;
            C42158a aVar;
            if (i < 0 || i >= C42154a.this.f107188e) {
                throw new IllegalArgumentException("Expected index " + i + " to be greater than 0 and less than the maximum value count of " + C42154a.this.f107188e);
            }
            synchronized (C42154a.this) {
                if (this.f107201a.f107210d == this) {
                    if (!this.f107201a.f107209c) {
                        this.f107202b[i] = true;
                    }
                    File b = this.f107201a.mo152143b(i);
                    try {
                        fileOutputStream = new FileOutputStream(b);
                    } catch (FileNotFoundException unused) {
                        C42154a.this.f107187d.mkdirs();
                        try {
                            fileOutputStream = new FileOutputStream(b);
                        } catch (FileNotFoundException unused2) {
                            return C42154a.f107185b;
                        }
                    }
                    aVar = new C42158a(fileOutputStream);
                } else {
                    throw new IllegalStateException();
                }
            }
            return aVar;
        }

        private C42157a(C42159b bVar) {
            boolean[] zArr;
            this.f107201a = bVar;
            if (bVar.f107209c) {
                zArr = null;
            } else {
                zArr = new boolean[C42154a.this.f107188e];
            }
            this.f107202b = zArr;
        }
    }

    /* renamed from: com.ss.android.lark.mail.impl.g.b.a$c */
    public final class C42160c implements Closeable {

        /* renamed from: b */
        private final String f107214b;

        /* renamed from: c */
        private final long f107215c;

        /* renamed from: d */
        private final InputStream[] f107216d;

        /* renamed from: e */
        private final long[] f107217e;

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            for (InputStream inputStream : this.f107216d) {
                C42163c.m168256a(inputStream);
            }
        }

        /* renamed from: a */
        public InputStream mo152144a(int i) {
            return this.f107216d[i];
        }

        private C42160c(String str, long j, InputStream[] inputStreamArr, long[] jArr) {
            this.f107214b = str;
            this.f107215c = j;
            this.f107216d = inputStreamArr;
            this.f107217e = jArr;
        }
    }

    /* renamed from: h */
    private void m168232h() {
        if (this.f107189f == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    /* renamed from: e */
    public void mo152129e() throws IOException {
        close();
        C42163c.m168257a(this.f107187d);
    }

    /* renamed from: b */
    public boolean mo152124b() {
        int i = this.f107190g;
        if (i < 2000 || i < this.f107195l.size()) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public synchronized void mo152125c() throws IOException {
        m168232h();
        mo152128d();
        this.f107189f.flush();
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.mail.impl.g.b.a$b */
    public final class C42159b {

        /* renamed from: a */
        public final String f107207a;

        /* renamed from: b */
        public final long[] f107208b;

        /* renamed from: c */
        public boolean f107209c;

        /* renamed from: d */
        public C42157a f107210d;

        /* renamed from: e */
        public long f107211e;

        /* renamed from: a */
        public String mo152141a() throws IOException {
            StringBuilder sb = new StringBuilder();
            long[] jArr = this.f107208b;
            for (long j : jArr) {
                sb.append(' ');
                sb.append(j);
            }
            return sb.toString();
        }

        /* renamed from: b */
        private IOException m168247b(String[] strArr) throws IOException {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        /* renamed from: a */
        public File mo152140a(int i) {
            File file = C42154a.this.f107187d;
            return new File(file, this.f107207a + "" + i);
        }

        /* renamed from: b */
        public File mo152143b(int i) {
            File file = C42154a.this.f107187d;
            return new File(file, this.f107207a + "" + i + ".tmp");
        }

        /* renamed from: a */
        public void mo152142a(String[] strArr) throws IOException {
            if (strArr.length == C42154a.this.f107188e) {
                for (int i = 0; i < strArr.length; i++) {
                    try {
                        this.f107208b[i] = Long.parseLong(strArr[i]);
                    } catch (NumberFormatException unused) {
                        throw m168247b(strArr);
                    }
                }
                return;
            }
            throw m168247b(strArr);
        }

        private C42159b(String str) {
            this.f107207a = str;
            this.f107208b = new long[C42154a.this.f107188e];
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        if (this.f107189f != null) {
            Iterator it = new ArrayList(this.f107195l.values()).iterator();
            while (it.hasNext()) {
                C42159b bVar = (C42159b) it.next();
                if (bVar.f107210d != null) {
                    bVar.f107210d.mo152135b();
                }
            }
            mo152128d();
            this.f107189f.close();
            this.f107189f = null;
        }
    }

    /* renamed from: d */
    public void mo152128d() throws IOException {
        while (this.f107197n > this.f107196m) {
            mo152126c(this.f107195l.entrySet().iterator().next().getKey());
        }
    }

    /* renamed from: g */
    private void m168231g() throws IOException {
        m168226a(this.f107192i);
        Iterator<C42159b> it = this.f107195l.values().iterator();
        while (it.hasNext()) {
            C42159b next = it.next();
            int i = 0;
            if (next.f107210d == null) {
                while (i < this.f107188e) {
                    this.f107197n += next.f107208b[i];
                    i++;
                }
            } else {
                next.f107210d = null;
                while (i < this.f107188e) {
                    m168226a(next.mo152140a(i));
                    m168226a(next.mo152143b(i));
                    i++;
                }
                it.remove();
            }
        }
    }

    /* renamed from: f */
    private void m168230f() throws IOException {
        C42161b bVar = new C42161b(new FileInputStream(this.f107191h), C42163c.f107224a);
        try {
            String a = bVar.mo152146a();
            String a2 = bVar.mo152146a();
            String a3 = bVar.mo152146a();
            String a4 = bVar.mo152146a();
            String a5 = bVar.mo152146a();
            if (!"libcore.io.DiskLruCache".equals(a) || !"1".equals(a2) || !Integer.toString(this.f107194k).equals(a3) || !Integer.toString(this.f107188e).equals(a4) || !"".equals(a5)) {
                throw new IOException("unexpected journal header: [" + a + ", " + a2 + ", " + a4 + ", " + a5 + "]");
            }
            int i = 0;
            while (true) {
                try {
                    m168228d(bVar.mo152146a());
                    i++;
                } catch (EOFException unused) {
                    this.f107190g = i - this.f107195l.size();
                    if (bVar.mo152147b()) {
                        mo152121a();
                    } else {
                        this.f107189f = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f107191h, true), C42163c.f107224a));
                    }
                    return;
                }
            }
        } finally {
            C42163c.m168256a(bVar);
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public synchronized void mo152121a() throws IOException {
        Writer writer = this.f107189f;
        if (writer != null) {
            writer.close();
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f107192i), C42163c.f107224a));
        try {
            bufferedWriter.write("libcore.io.DiskLruCache");
            bufferedWriter.write("\n");
            bufferedWriter.write("1");
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.f107194k));
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.f107188e));
            bufferedWriter.write("\n");
            bufferedWriter.write("\n");
            for (C42159b bVar : this.f107195l.values()) {
                if (bVar.f107210d != null) {
                    bufferedWriter.write("DIRTY " + bVar.f107207a + '\n');
                } else {
                    bufferedWriter.write("CLEAN " + bVar.f107207a + bVar.mo152141a() + '\n');
                }
            }
            bufferedWriter.close();
            if (this.f107191h.exists()) {
                m168227a(this.f107191h, this.f107193j, true);
            }
            m168227a(this.f107192i, this.f107191h, false);
            this.f107193j.delete();
            this.f107189f = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f107191h, true), C42163c.f107224a));
        } catch (Throwable th) {
            bufferedWriter.close();
            throw th;
        }
    }

    /* renamed from: b */
    public C42157a mo152123b(String str) throws IOException {
        return mo152119a(str, -1);
    }

    /* renamed from: a */
    private static void m168226a(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    /* renamed from: e */
    private void m168229e(String str) {
        if (!f107184a.matcher(str).matches()) {
            throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,120}: \"" + str + "\"");
        }
    }

    /* renamed from: d */
    private void m168228d(String str) throws IOException {
        String str2;
        int indexOf = str.indexOf(32);
        if (indexOf != -1) {
            int i = indexOf + 1;
            int indexOf2 = str.indexOf(32, i);
            if (indexOf2 == -1) {
                str2 = str.substring(i);
                if (indexOf == 6 && str.startsWith("REMOVE")) {
                    this.f107195l.remove(str2);
                    return;
                }
            } else {
                str2 = str.substring(i, indexOf2);
            }
            C42159b bVar = this.f107195l.get(str2);
            if (bVar == null) {
                bVar = new C42159b(str2);
                this.f107195l.put(str2, bVar);
            }
            if (indexOf2 != -1 && indexOf == 5 && str.startsWith("CLEAN")) {
                String[] split = str.substring(indexOf2 + 1).split(" ");
                bVar.f107209c = true;
                bVar.f107210d = null;
                bVar.mo152142a(split);
            } else if (indexOf2 == -1 && indexOf == 5 && str.startsWith("DIRTY")) {
                bVar.f107210d = new C42157a(bVar);
            } else if (indexOf2 != -1 || indexOf != 4 || !str.startsWith("READ")) {
                throw new IOException("unexpected journal line: " + str);
            }
        } else {
            throw new IOException("unexpected journal line: " + str);
        }
    }

    /* renamed from: c */
    public synchronized boolean mo152126c(String str) throws IOException {
        m168232h();
        m168229e(str);
        C42159b bVar = this.f107195l.get(str);
        if (bVar != null) {
            if (bVar.f107210d == null) {
                for (int i = 0; i < this.f107188e; i++) {
                    File a = bVar.mo152140a(i);
                    if (a.exists()) {
                        if (!a.delete()) {
                            throw new IOException("failed to delete " + a);
                        }
                    }
                    this.f107197n -= bVar.f107208b[i];
                    bVar.f107208b[i] = 0;
                }
                this.f107190g++;
                this.f107189f.append((CharSequence) ("REMOVE " + str + '\n'));
                this.f107195l.remove(str);
                if (mo152124b()) {
                    this.f107186c.submit(this.f107198o);
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public synchronized C42160c mo152120a(String str) throws IOException {
        m168232h();
        m168229e(str);
        C42159b bVar = this.f107195l.get(str);
        if (bVar == null) {
            return null;
        }
        if (!bVar.f107209c) {
            return null;
        }
        InputStream[] inputStreamArr = new InputStream[this.f107188e];
        int i = 0;
        for (int i2 = 0; i2 < this.f107188e; i2++) {
            try {
                inputStreamArr[i2] = new FileInputStream(bVar.mo152140a(i2));
            } catch (FileNotFoundException unused) {
                while (i < this.f107188e && inputStreamArr[i] != null) {
                    C42163c.m168256a(inputStreamArr[i]);
                    i++;
                }
                return null;
            }
        }
        this.f107190g++;
        this.f107189f.append((CharSequence) ("READ " + str + '\n'));
        if (mo152124b()) {
            this.f107186c.submit(this.f107198o);
        }
        return new C42160c(str, bVar.f107211e, inputStreamArr, bVar.f107208b);
    }

    /* renamed from: a */
    public synchronized C42157a mo152119a(String str, long j) throws IOException {
        m168232h();
        m168229e(str);
        C42159b bVar = this.f107195l.get(str);
        if (j != -1 && (bVar == null || bVar.f107211e != j)) {
            return null;
        }
        if (bVar == null) {
            bVar = new C42159b(str);
            this.f107195l.put(str, bVar);
        } else if (bVar.f107210d != null) {
            return null;
        }
        C42157a aVar = new C42157a(bVar);
        bVar.f107210d = aVar;
        Writer writer = this.f107189f;
        writer.write("DIRTY " + str + '\n');
        this.f107189f.flush();
        return aVar;
    }

    /* renamed from: a */
    public synchronized void mo152122a(C42157a aVar, boolean z) throws IOException {
        C42159b bVar = aVar.f107201a;
        if (bVar.f107210d == aVar) {
            if (z && !bVar.f107209c) {
                for (int i = 0; i < this.f107188e; i++) {
                    if (!aVar.f107202b[i]) {
                        aVar.mo152135b();
                        throw new IllegalStateException("Newly created entry didn't create value for index " + i);
                    } else if (!bVar.mo152143b(i).exists()) {
                        aVar.mo152135b();
                        return;
                    }
                }
            }
            for (int i2 = 0; i2 < this.f107188e; i2++) {
                File b = bVar.mo152143b(i2);
                if (!z) {
                    m168226a(b);
                } else if (b.exists()) {
                    File a = bVar.mo152140a(i2);
                    b.renameTo(a);
                    long j = bVar.f107208b[i2];
                    long length = a.length();
                    bVar.f107208b[i2] = length;
                    this.f107197n = (this.f107197n - j) + length;
                }
            }
            this.f107190g++;
            bVar.f107210d = null;
            if (bVar.f107209c || z) {
                bVar.f107209c = true;
                this.f107189f.write("CLEAN " + bVar.f107207a + bVar.mo152141a() + '\n');
                if (z) {
                    long j2 = this.f107199p;
                    this.f107199p = 1 + j2;
                    bVar.f107211e = j2;
                }
            } else {
                this.f107195l.remove(bVar.f107207a);
                this.f107189f.write("REMOVE " + bVar.f107207a + '\n');
            }
            this.f107189f.flush();
            if (this.f107197n > this.f107196m || mo152124b()) {
                this.f107186c.submit(this.f107198o);
            }
            return;
        }
        throw new IllegalStateException();
    }

    /* renamed from: a */
    private static void m168227a(File file, File file2, boolean z) throws IOException {
        if (z) {
            m168226a(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    private C42154a(File file, int i, int i2, long j) {
        this.f107187d = file;
        this.f107194k = i;
        this.f107191h = new File(file, "journal");
        this.f107192i = new File(file, "journal.tmp");
        this.f107193j = new File(file, "journal.bkp");
        this.f107188e = i2;
        this.f107196m = j;
    }

    /* renamed from: a */
    public static C42154a m168225a(File file, int i, int i2, long j) throws IOException {
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        } else if (i2 > 0) {
            File file2 = new File(file, "journal.bkp");
            if (file2.exists()) {
                File file3 = new File(file, "journal");
                if (file3.exists()) {
                    file2.delete();
                } else {
                    m168227a(file2, file3, false);
                }
            }
            C42154a aVar = new C42154a(file, i, i2, j);
            if (aVar.f107191h.exists()) {
                try {
                    aVar.m168230f();
                    aVar.m168231g();
                    return aVar;
                } catch (IOException e) {
                    Log.m165384e("DiskLruCache", "open " + file, e);
                    aVar.mo152129e();
                }
            }
            file.mkdirs();
            C42154a aVar2 = new C42154a(file, i, i2, j);
            aVar2.mo152121a();
            return aVar2;
        } else {
            throw new IllegalArgumentException("valueCount <= 0");
        }
    }
}
