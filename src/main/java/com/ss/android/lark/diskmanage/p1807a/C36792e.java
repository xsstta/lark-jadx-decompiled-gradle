package com.ss.android.lark.diskmanage.p1807a;

import com.ss.android.lark.log.Log;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
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
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.lark.diskmanage.a.e */
public class C36792e implements Closeable {

    /* renamed from: b */
    static final Pattern f94528b = Pattern.compile("[a-z0-9_-]{1,64}");

    /* renamed from: h */
    public static final OutputStream f94529h = new OutputStream() {
        /* class com.ss.android.lark.diskmanage.p1807a.C36792e.C367931 */

        @Override // java.io.OutputStream
        public void write(int i) throws IOException {
        }
    };

    /* renamed from: a */
    private final File f94530a;

    /* renamed from: c */
    public final File f94531c;

    /* renamed from: d */
    public final int f94532d;

    /* renamed from: e */
    public Writer f94533e;

    /* renamed from: f */
    public int f94534f;

    /* renamed from: g */
    final ThreadPoolExecutor f94535g = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());

    /* renamed from: i */
    private final File f94536i;

    /* renamed from: j */
    private final File f94537j;

    /* renamed from: k */
    private final int f94538k;

    /* renamed from: l */
    private long f94539l;

    /* renamed from: m */
    private long f94540m;

    /* renamed from: n */
    private final LinkedHashMap<String, C36797c> f94541n = new LinkedHashMap<>(0, 0.75f, true);

    /* renamed from: o */
    private long f94542o = 0;

    /* renamed from: p */
    private final Callable<Void> f94543p = new CallableC36794a(this.f94539l);

    /* renamed from: com.ss.android.lark.diskmanage.a.e$d */
    public final class C36798d implements Closeable {

        /* renamed from: b */
        private final String f94559b;

        /* renamed from: c */
        private final long f94560c;

        /* renamed from: d */
        private final InputStream[] f94561d;

        /* renamed from: e */
        private final long[] f94562e;

        /* renamed from: f */
        private final C36797c f94563f;

        /* renamed from: a */
        public C36797c mo135550a() {
            return this.f94563f;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            for (InputStream inputStream : this.f94561d) {
                C36801f.m145161a(inputStream);
            }
        }

        private C36798d(String str, long j, InputStream[] inputStreamArr, long[] jArr, C36797c cVar) {
            this.f94559b = str;
            this.f94560c = j;
            this.f94561d = inputStreamArr;
            this.f94562e = jArr;
            this.f94563f = cVar;
        }
    }

    /* renamed from: a */
    public File mo135509a() {
        return this.f94531c;
    }

    /* renamed from: com.ss.android.lark.diskmanage.a.e$b */
    public final class C36795b {

        /* renamed from: a */
        public final C36797c f94546a;

        /* renamed from: b */
        public final boolean[] f94547b;

        /* renamed from: c */
        public boolean f94548c;

        /* renamed from: e */
        private boolean f94550e;

        /* renamed from: b */
        public void mo135541b() throws IOException {
            C36792e.this.mo135529a(this, false);
        }

        /* access modifiers changed from: private */
        /* renamed from: com.ss.android.lark.diskmanage.a.e$b$a */
        public final class C36796a extends FilterOutputStream {
            @Override // java.io.OutputStream, java.io.Closeable, java.io.FilterOutputStream, java.lang.AutoCloseable
            public void close() {
                try {
                    this.out.close();
                } catch (IOException unused) {
                    C36795b.this.f94548c = true;
                }
            }

            @Override // java.io.OutputStream, java.io.FilterOutputStream, java.io.Flushable
            public void flush() {
                try {
                    this.out.flush();
                } catch (IOException unused) {
                    C36795b.this.f94548c = true;
                }
            }

            @Override // java.io.OutputStream, java.io.FilterOutputStream
            public void write(int i) {
                try {
                    this.out.write(i);
                } catch (IOException unused) {
                    C36795b.this.f94548c = true;
                }
            }

            private C36796a(OutputStream outputStream) {
                super(outputStream);
            }

            @Override // java.io.OutputStream, java.io.FilterOutputStream
            public void write(byte[] bArr, int i, int i2) {
                try {
                    this.out.write(bArr, i, i2);
                } catch (IOException unused) {
                    C36795b.this.f94548c = true;
                }
            }
        }

        /* renamed from: a */
        public void mo135539a() throws IOException {
            if (this.f94548c) {
                C36792e.this.mo135529a(this, false);
                C36792e.this.mo135513c(this.f94546a.f94552a);
            } else {
                C36792e.this.mo135529a(this, true);
            }
            this.f94550e = true;
        }

        /* renamed from: a */
        public File mo135538a(int i) throws IOException {
            File b;
            synchronized (C36792e.this) {
                if (this.f94546a.f94555d == this) {
                    if (!this.f94546a.f94554c) {
                        this.f94547b[i] = true;
                    }
                    b = this.f94546a.mo135549b(i);
                    if (!C36792e.this.f94531c.exists()) {
                        C36792e.this.f94531c.mkdirs();
                    }
                } else {
                    throw new IllegalStateException();
                }
            }
            return b;
        }

        /* renamed from: b */
        public OutputStream mo135540b(int i) throws IOException {
            FileOutputStream fileOutputStream;
            C36796a aVar;
            synchronized (C36792e.this) {
                if (this.f94546a.f94555d == this) {
                    if (!this.f94546a.f94554c) {
                        this.f94547b[i] = true;
                    }
                    File b = this.f94546a.mo135549b(i);
                    try {
                        fileOutputStream = new FileOutputStream(b);
                    } catch (FileNotFoundException unused) {
                        C36792e.this.f94531c.mkdirs();
                        try {
                            fileOutputStream = new FileOutputStream(b);
                        } catch (FileNotFoundException unused2) {
                            return C36792e.f94529h;
                        }
                    }
                    aVar = new C36796a(fileOutputStream);
                } else {
                    throw new IllegalStateException();
                }
            }
            return aVar;
        }

        private C36795b(C36797c cVar) {
            boolean[] zArr;
            this.f94546a = cVar;
            if (cVar.f94554c) {
                zArr = null;
            } else {
                zArr = new boolean[C36792e.this.f94532d];
            }
            this.f94547b = zArr;
        }
    }

    /* renamed from: d */
    public synchronized long mo135532d() {
        return this.f94540m;
    }

    /* renamed from: h */
    private void m145135h() {
        if (this.f94533e == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    /* renamed from: b */
    public void mo135512b() throws IOException {
        close();
        C36801f.m145162a(this.f94531c);
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.diskmanage.a.e$e */
    public static class C36799e implements Closeable {

        /* renamed from: a */
        public final Charset f94564a;

        /* renamed from: b */
        private final InputStream f94565b;

        /* renamed from: c */
        private byte[] f94566c;

        /* renamed from: d */
        private int f94567d;

        /* renamed from: e */
        private int f94568e;

        /* renamed from: b */
        private void m145159b() throws IOException {
            InputStream inputStream = this.f94565b;
            byte[] bArr = this.f94566c;
            int read = inputStream.read(bArr, 0, bArr.length);
            if (read != -1) {
                this.f94567d = 0;
                this.f94568e = read;
                return;
            }
            throw new EOFException();
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            synchronized (this.f94565b) {
                if (this.f94566c != null) {
                    this.f94566c = null;
                    this.f94565b.close();
                }
            }
        }

        /* renamed from: a */
        public String mo135552a() throws IOException {
            int i;
            byte[] bArr;
            int i2;
            synchronized (this.f94565b) {
                if (this.f94566c != null) {
                    if (this.f94567d >= this.f94568e) {
                        m145159b();
                    }
                    for (int i3 = this.f94567d; i3 != this.f94568e; i3++) {
                        byte[] bArr2 = this.f94566c;
                        if (bArr2[i3] == 10) {
                            if (i3 != this.f94567d) {
                                i2 = i3 - 1;
                                if (bArr2[i2] == 13) {
                                    byte[] bArr3 = this.f94566c;
                                    int i4 = this.f94567d;
                                    String str = new String(bArr3, i4, i2 - i4, this.f94564a.name());
                                    this.f94567d = i3 + 1;
                                    return str;
                                }
                            }
                            i2 = i3;
                            byte[] bArr32 = this.f94566c;
                            int i42 = this.f94567d;
                            String str2 = new String(bArr32, i42, i2 - i42, this.f94564a.name());
                            this.f94567d = i3 + 1;
                            return str2;
                        }
                    }
                    C368001 r1 = new ByteArrayOutputStream((this.f94568e - this.f94567d) + 80) {
                        /* class com.ss.android.lark.diskmanage.p1807a.C36792e.C36799e.C368001 */

                        public String toString() {
                            int i;
                            if (this.count <= 0 || this.buf[this.count - 1] != 13) {
                                i = this.count;
                            } else {
                                i = this.count - 1;
                            }
                            try {
                                return new String(this.buf, 0, i, C36799e.this.f94564a.name());
                            } catch (UnsupportedEncodingException e) {
                                throw new AssertionError(e);
                            }
                        }
                    };
                    loop1:
                    while (true) {
                        byte[] bArr4 = this.f94566c;
                        int i5 = this.f94567d;
                        r1.write(bArr4, i5, this.f94568e - i5);
                        this.f94568e = -1;
                        m145159b();
                        i = this.f94567d;
                        while (true) {
                            if (i != this.f94568e) {
                                bArr = this.f94566c;
                                if (bArr[i] == 10) {
                                    break loop1;
                                }
                                i++;
                            }
                        }
                    }
                    int i6 = this.f94567d;
                    if (i != i6) {
                        r1.write(bArr, i6, i - i6);
                    }
                    this.f94567d = i + 1;
                    return r1.toString();
                }
                throw new IOException("LineReader is closed");
            }
        }

        C36799e(InputStream inputStream, Charset charset) {
            this(inputStream, 8192, charset);
        }

        C36799e(InputStream inputStream, int i, Charset charset) {
            if (inputStream == null || charset == null) {
                throw null;
            } else if (i < 0) {
                throw new IllegalArgumentException("capacity <= 0");
            } else if (charset.equals(C36801f.f94570a)) {
                this.f94565b = inputStream;
                this.f94564a = charset;
                this.f94566c = new byte[i];
            } else {
                throw new IllegalArgumentException("Unsupported encoding");
            }
        }
    }

    /* renamed from: e */
    public boolean mo135534e() {
        int i = this.f94534f;
        if (i < 2000 || i < this.f94541n.size()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.diskmanage.a.e$a */
    public final class CallableC36794a implements Callable<Void> {

        /* renamed from: b */
        private final long f94545b;

        /* renamed from: a */
        public Void call() throws Exception {
            synchronized (C36792e.this) {
                if (C36792e.this.f94533e == null) {
                    return null;
                }
                C36792e.this.mo135530b(this.f94545b);
                if (C36792e.this.mo135534e()) {
                    C36792e.this.mo135531c();
                    C36792e.this.f94534f = 0;
                }
                return null;
            }
        }

        private CallableC36794a(long j) {
            this.f94545b = j;
        }
    }

    /* renamed from: com.ss.android.lark.diskmanage.a.e$c */
    public final class C36797c {

        /* renamed from: a */
        public final String f94552a;

        /* renamed from: b */
        public final long[] f94553b;

        /* renamed from: c */
        public boolean f94554c;

        /* renamed from: d */
        public C36795b f94555d;

        /* renamed from: e */
        public long f94556e;

        /* renamed from: a */
        public String mo135547a() throws IOException {
            StringBuilder sb = new StringBuilder();
            long[] jArr = this.f94553b;
            for (long j : jArr) {
                sb.append(' ');
                sb.append(j);
            }
            return sb.toString();
        }

        /* renamed from: b */
        private IOException m145153b(String[] strArr) throws IOException {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        /* renamed from: a */
        public File mo135546a(int i) {
            File file = C36792e.this.f94531c;
            return new File(file, this.f94552a + "." + i);
        }

        /* renamed from: b */
        public File mo135549b(int i) {
            File file = C36792e.this.f94531c;
            return new File(file, this.f94552a + "." + i + ".tmp");
        }

        /* renamed from: a */
        public void mo135548a(String[] strArr) throws IOException {
            if (strArr.length == C36792e.this.f94532d) {
                for (int i = 0; i < strArr.length; i++) {
                    try {
                        this.f94553b[i] = Long.parseLong(strArr[i]);
                    } catch (NumberFormatException unused) {
                        throw m145153b(strArr);
                    }
                }
                return;
            }
            throw m145153b(strArr);
        }

        private C36797c(String str) {
            this.f94552a = str;
            this.f94553b = new long[C36792e.this.f94532d];
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        if (this.f94533e != null) {
            Iterator it = new ArrayList(this.f94541n.values()).iterator();
            while (it.hasNext()) {
                C36797c cVar = (C36797c) it.next();
                if (cVar.f94555d != null) {
                    cVar.f94555d.mo135541b();
                }
            }
            mo135530b(this.f94539l);
            this.f94533e.close();
            this.f94533e = null;
        }
    }

    /* renamed from: g */
    private void m145134g() throws IOException {
        m145128a(this.f94536i);
        Iterator<C36797c> it = this.f94541n.values().iterator();
        while (it.hasNext()) {
            C36797c next = it.next();
            int i = 0;
            if (next.f94555d == null) {
                while (i < this.f94532d) {
                    this.f94540m += next.f94553b[i];
                    i++;
                }
            } else {
                next.f94555d = null;
                while (i < this.f94532d) {
                    m145128a(next.mo135546a(i));
                    m145128a(next.mo135549b(i));
                    i++;
                }
                it.remove();
            }
        }
    }

    /* renamed from: f */
    private void m145133f() throws IOException {
        C36799e eVar = new C36799e(new FileInputStream(this.f94530a), C36801f.f94570a);
        try {
            String a = eVar.mo135552a();
            String a2 = eVar.mo135552a();
            String a3 = eVar.mo135552a();
            String a4 = eVar.mo135552a();
            String a5 = eVar.mo135552a();
            if (!"libcore.io.DiskLruCache".equals(a) || !"1".equals(a2) || !Integer.toString(this.f94538k).equals(a3) || !Integer.toString(this.f94532d).equals(a4) || !"".equals(a5)) {
                throw new IOException("unexpected journal header: [" + a + ", " + a2 + ", " + a4 + ", " + a5 + "]");
            }
            int i = 0;
            while (true) {
                try {
                    mo135510a(eVar.mo135552a());
                    i++;
                } catch (EOFException unused) {
                    this.f94534f = i - this.f94541n.size();
                    return;
                }
            }
        } finally {
            C36801f.m145161a(eVar);
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: c */
    public synchronized void mo135531c() throws IOException {
        Writer writer = this.f94533e;
        if (writer != null) {
            writer.close();
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f94536i), C36801f.f94570a));
        try {
            bufferedWriter.write("libcore.io.DiskLruCache");
            bufferedWriter.write("\n");
            bufferedWriter.write("1");
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.f94538k));
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.f94532d));
            bufferedWriter.write("\n");
            bufferedWriter.write("\n");
            for (C36797c cVar : this.f94541n.values()) {
                if (cVar.f94555d != null) {
                    bufferedWriter.write("DIRTY " + cVar.f94552a + '\n');
                } else {
                    bufferedWriter.write("CLEAN " + cVar.f94552a + cVar.mo135547a() + '\n');
                }
            }
            bufferedWriter.close();
            if (this.f94530a.exists()) {
                m145129a(this.f94530a, this.f94537j, true);
            }
            m145129a(this.f94536i, this.f94530a, false);
            this.f94537j.delete();
            this.f94533e = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f94530a, true), C36801f.f94570a));
        } catch (Throwable th) {
            bufferedWriter.close();
            throw th;
        }
    }

    /* renamed from: d */
    public C36795b mo135533d(String str) throws IOException {
        return mo135527a(str, -1);
    }

    /* renamed from: a */
    private static void m145128a(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    /* renamed from: com.ss.android.lark.diskmanage.a.e$f */
    public static final class C36801f {

        /* renamed from: a */
        static final Charset f94570a = Charset.forName("US-ASCII");

        /* renamed from: b */
        static final Charset f94571b = Charset.forName("UTF-8");

        /* renamed from: a */
        static void m145161a(Closeable closeable) {
            if (closeable != null) {
                try {
                    closeable.close();
                } catch (RuntimeException e) {
                    throw e;
                } catch (Exception e2) {
                    Log.m165379d("DiskLruCache", "closeQuietly = " + e2);
                }
            }
        }

        /* renamed from: a */
        static void m145162a(File file) throws IOException {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (File file2 : listFiles) {
                    if (file2.isDirectory()) {
                        m145162a(file2);
                    }
                    if (!file2.delete()) {
                        throw new IOException("failed to delete file: " + file2);
                    }
                }
                return;
            }
            throw new IOException("not a readable directory: " + file);
        }
    }

    /* renamed from: e */
    private void m145132e(String str) {
        if (!f94528b.matcher(str).matches()) {
            throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,64}: \"" + str + "\"");
        }
    }

    /* renamed from: b */
    public void mo135530b(long j) throws IOException {
        while (this.f94540m > j) {
            mo135513c(this.f94541n.entrySet().iterator().next().getKey());
        }
    }

    /* renamed from: a */
    private void mo135510a(String str) throws IOException {
        String str2;
        int indexOf = str.indexOf(32);
        if (indexOf != -1) {
            int i = indexOf + 1;
            int indexOf2 = str.indexOf(32, i);
            if (indexOf2 == -1) {
                str2 = str.substring(i);
                if (indexOf == 6 && str.startsWith("REMOVE")) {
                    this.f94541n.remove(str2);
                    return;
                }
            } else {
                str2 = str.substring(i, indexOf2);
            }
            C36797c cVar = this.f94541n.get(str2);
            if (cVar == null) {
                cVar = new C36797c(str2);
                this.f94541n.put(str2, cVar);
            }
            if (indexOf2 != -1 && indexOf == 5 && str.startsWith("CLEAN")) {
                String[] split = str.substring(indexOf2 + 1).split(" ");
                cVar.f94554c = true;
                cVar.f94555d = null;
                cVar.mo135548a(split);
            } else if (indexOf2 == -1 && indexOf == 5 && str.startsWith("DIRTY")) {
                cVar.f94555d = new C36795b(cVar);
            } else if (indexOf2 == -1 && indexOf == 4 && str.startsWith("READ")) {
                Log.m165379d("DiskLruCache", "This work was already done by calling lruEntries.get()");
            } else {
                throw new IOException("unexpected journal line: " + str);
            }
        } else {
            throw new IOException("unexpected journal line: " + str);
        }
    }

    /* renamed from: a */
    public synchronized void mo135528a(long j) {
        this.f94535g.submit(new CallableC36794a(j));
    }

    /* renamed from: b */
    public synchronized C36798d mo135511b(String str) throws IOException {
        m145135h();
        m145132e(str);
        C36797c cVar = this.f94541n.get(str);
        if (cVar == null) {
            return null;
        }
        if (!cVar.f94554c) {
            return null;
        }
        InputStream[] inputStreamArr = new InputStream[this.f94532d];
        int i = 0;
        for (int i2 = 0; i2 < this.f94532d; i2++) {
            try {
                inputStreamArr[i2] = new FileInputStream(cVar.mo135546a(i2));
            } catch (FileNotFoundException unused) {
                while (i < this.f94532d && inputStreamArr[i] != null) {
                    C36801f.m145161a(inputStreamArr[i]);
                    i++;
                }
                return null;
            }
        }
        this.f94534f++;
        this.f94533e.append((CharSequence) ("READ " + str + '\n'));
        if (mo135534e()) {
            this.f94535g.submit(this.f94543p);
        }
        return new C36798d(str, cVar.f94556e, inputStreamArr, cVar.f94553b, cVar);
    }

    /* renamed from: c */
    public synchronized boolean mo135513c(String str) throws IOException {
        m145135h();
        m145132e(str);
        C36797c cVar = this.f94541n.get(str);
        if (cVar != null) {
            if (cVar.f94555d == null) {
                for (int i = 0; i < this.f94532d; i++) {
                    File a = cVar.mo135546a(i);
                    if (a.exists()) {
                        if (!a.delete()) {
                            throw new IOException("failed to delete " + a);
                        }
                    }
                    this.f94540m -= cVar.f94553b[i];
                    cVar.f94553b[i] = 0;
                }
                this.f94534f++;
                this.f94533e.append((CharSequence) ("REMOVE " + str + '\n'));
                this.f94541n.remove(str);
                if (mo135534e()) {
                    this.f94535g.submit(this.f94543p);
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public synchronized C36795b mo135527a(String str, long j) throws IOException {
        m145135h();
        m145132e(str);
        C36797c cVar = this.f94541n.get(str);
        if (j != -1 && (cVar == null || cVar.f94556e != j)) {
            return null;
        }
        if (cVar == null) {
            cVar = new C36797c(str);
            this.f94541n.put(str, cVar);
        } else if (cVar.f94555d != null) {
            return null;
        }
        C36795b bVar = new C36795b(cVar);
        cVar.f94555d = bVar;
        Writer writer = this.f94533e;
        writer.write("DIRTY " + str + '\n');
        this.f94533e.flush();
        return bVar;
    }

    /* renamed from: a */
    public synchronized void mo135529a(C36795b bVar, boolean z) throws IOException {
        C36797c cVar = bVar.f94546a;
        if (cVar.f94555d == bVar) {
            if (z && !cVar.f94554c) {
                for (int i = 0; i < this.f94532d; i++) {
                    if (!bVar.f94547b[i]) {
                        bVar.mo135541b();
                        throw new IllegalStateException("Newly created entry didn't create value for index " + i);
                    } else if (!cVar.mo135549b(i).exists()) {
                        bVar.mo135541b();
                        return;
                    }
                }
            }
            for (int i2 = 0; i2 < this.f94532d; i2++) {
                File b = cVar.mo135549b(i2);
                if (!z) {
                    m145128a(b);
                } else if (b.exists()) {
                    File a = cVar.mo135546a(i2);
                    b.renameTo(a);
                    long j = cVar.f94553b[i2];
                    long length = a.length();
                    cVar.f94553b[i2] = length;
                    this.f94540m = (this.f94540m - j) + length;
                }
            }
            this.f94534f++;
            cVar.f94555d = null;
            if (cVar.f94554c || z) {
                cVar.f94554c = true;
                this.f94533e.write("CLEAN " + cVar.f94552a + cVar.mo135547a() + '\n');
                if (z) {
                    long j2 = this.f94542o;
                    this.f94542o = 1 + j2;
                    cVar.f94556e = j2;
                }
            } else {
                this.f94541n.remove(cVar.f94552a);
                this.f94533e.write("REMOVE " + cVar.f94552a + '\n');
            }
            this.f94533e.flush();
            if (this.f94540m > this.f94539l || mo135534e()) {
                this.f94535g.submit(this.f94543p);
            }
            return;
        }
        throw new IllegalStateException();
    }

    /* renamed from: a */
    private static void m145129a(File file, File file2, boolean z) throws IOException {
        if (z) {
            m145128a(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    protected C36792e(File file, int i, int i2, long j) {
        this.f94531c = file;
        this.f94538k = i;
        this.f94530a = new File(file, "journal");
        this.f94536i = new File(file, "journal.tmp");
        this.f94537j = new File(file, "journal.bkp");
        this.f94532d = i2;
        this.f94539l = j;
    }

    /* renamed from: b */
    public static C36792e m145131b(File file, int i, int i2, long j) throws IOException {
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        } else if (i2 > 0) {
            File file2 = new File(file, "journal.bkp");
            if (file2.exists()) {
                File file3 = new File(file, "journal");
                if (file3.exists()) {
                    file2.delete();
                } else {
                    m145129a(file2, file3, false);
                }
            }
            C36792e eVar = new C36792e(file, i, i2, j);
            if (eVar.f94530a.exists()) {
                try {
                    eVar.m145133f();
                    eVar.m145134g();
                    eVar.f94533e = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(eVar.f94530a, true), C36801f.f94570a));
                    return eVar;
                } catch (IOException e) {
                    Log.m165382e("DiskLruCache " + file + " is corrupt: " + e.getMessage() + ", removing");
                    eVar.mo135512b();
                }
            }
            file.mkdirs();
            C36792e eVar2 = new C36792e(file, i, i2, j);
            eVar2.mo135531c();
            return eVar2;
        } else {
            throw new IllegalArgumentException("valueCount <= 0");
        }
    }
}
