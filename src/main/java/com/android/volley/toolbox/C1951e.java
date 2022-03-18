package com.android.volley.toolbox;

import android.os.SystemClock;
import android.text.TextUtils;
import com.android.volley.AbstractC1921a;
import com.android.volley.C1930e;
import com.android.volley.C1941m;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.android.volley.toolbox.e */
public class C1951e implements AbstractC1921a {

    /* renamed from: a */
    private final Map<String, C1952a> f6645a;

    /* renamed from: b */
    private long f6646b;

    /* renamed from: c */
    private final File f6647c;

    /* renamed from: d */
    private final int f6648d;

    @Override // com.android.volley.AbstractC1921a
    /* renamed from: a */
    public synchronized AbstractC1921a.C1922a mo9780a(String str) {
        C1952a aVar = this.f6645a.get(str);
        if (aVar == null) {
            return null;
        }
        File c = mo9837c(str);
        try {
            C1953b bVar = new C1953b(new BufferedInputStream(mo9834a(c)), c.length());
            try {
                C1952a a = C1952a.m8648a(bVar);
                if (!TextUtils.equals(str, a.f6650b)) {
                    C1941m.m8604b("%s: key=%s, found=%s", c.getAbsolutePath(), str, a.f6650b);
                    m8640e(str);
                    return null;
                }
                AbstractC1921a.C1922a a2 = aVar.mo9838a(m8635a(bVar, bVar.mo9840a()));
                bVar.close();
                return a2;
            } finally {
                bVar.close();
            }
        } catch (IOException e) {
            C1941m.m8604b("%s: %s", c.getAbsolutePath(), e.toString());
            mo9836b(str);
            return null;
        }
    }

    @Override // com.android.volley.AbstractC1921a
    /* renamed from: a */
    public synchronized void mo9781a() {
        if (!this.f6647c.exists()) {
            if (!this.f6647c.mkdirs()) {
                C1941m.m8605c("Unable to create cache dir %s", this.f6647c.getAbsolutePath());
            }
            return;
        }
        File[] listFiles = this.f6647c.listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                try {
                    long length = file.length();
                    C1953b bVar = new C1953b(new BufferedInputStream(mo9834a(file)), length);
                    try {
                        C1952a a = C1952a.m8648a(bVar);
                        a.f6649a = length;
                        m8633a(a.f6650b, a);
                    } finally {
                        bVar.close();
                    }
                } catch (IOException unused) {
                    file.delete();
                }
            }
        }
    }

    @Override // com.android.volley.AbstractC1921a
    /* renamed from: a */
    public synchronized void mo9782a(String str, AbstractC1921a.C1922a aVar) {
        m8629a(aVar.f6561a.length);
        File c = mo9837c(str);
        try {
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(mo9835b(c));
            C1952a aVar2 = new C1952a(str, aVar);
            if (aVar2.mo9839a(bufferedOutputStream)) {
                bufferedOutputStream.write(aVar.f6561a);
                bufferedOutputStream.close();
                m8633a(str, aVar2);
            } else {
                bufferedOutputStream.close();
                C1941m.m8604b("Failed to write header for %s", c.getAbsolutePath());
                throw new IOException();
            }
        } catch (IOException unused) {
            if (!c.delete()) {
                C1941m.m8604b("Could not clean up file %s", c.getAbsolutePath());
            }
        }
    }

    /* renamed from: a */
    static byte[] m8635a(C1953b bVar, long j) throws IOException {
        long a = bVar.mo9840a();
        if (j >= 0 && j <= a) {
            int i = (int) j;
            if (((long) i) == j) {
                byte[] bArr = new byte[i];
                new DataInputStream(bVar).readFully(bArr);
                return bArr;
            }
        }
        throw new IOException("streamToBytes length=" + j + ", maxLength=" + a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.android.volley.toolbox.e$b */
    public static class C1953b extends FilterInputStream {

        /* renamed from: a */
        private final long f6657a;

        /* renamed from: b */
        private long f6658b;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public long mo9840a() {
            return this.f6657a - this.f6658b;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read() throws IOException {
            int read = super.read();
            if (read != -1) {
                this.f6658b++;
            }
            return read;
        }

        C1953b(InputStream inputStream, long j) {
            super(inputStream);
            this.f6657a = j;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] bArr, int i, int i2) throws IOException {
            int read = super.read(bArr, i, i2);
            if (read != -1) {
                this.f6658b += (long) read;
            }
            return read;
        }
    }

    public C1951e(File file) {
        this(file, 5242880);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public InputStream mo9834a(File file) throws FileNotFoundException {
        return new FileInputStream(file);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public OutputStream mo9835b(File file) throws FileNotFoundException {
        return new FileOutputStream(file);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.android.volley.toolbox.e$a */
    public static class C1952a {

        /* renamed from: a */
        long f6649a;

        /* renamed from: b */
        final String f6650b;

        /* renamed from: c */
        final String f6651c;

        /* renamed from: d */
        final long f6652d;

        /* renamed from: e */
        final long f6653e;

        /* renamed from: f */
        final long f6654f;

        /* renamed from: g */
        final long f6655g;

        /* renamed from: h */
        final List<C1930e> f6656h;

        /* renamed from: a */
        private static List<C1930e> m8649a(AbstractC1921a.C1922a aVar) {
            if (aVar.f6568h != null) {
                return aVar.f6568h;
            }
            return C1956g.m8663a(aVar.f6567g);
        }

        /* renamed from: a */
        static C1952a m8648a(C1953b bVar) throws IOException {
            if (C1951e.m8627a((InputStream) bVar) == 538247942) {
                return new C1952a(C1951e.m8628a(bVar), C1951e.m8628a(bVar), C1951e.m8636b((InputStream) bVar), C1951e.m8636b((InputStream) bVar), C1951e.m8636b((InputStream) bVar), C1951e.m8636b((InputStream) bVar), C1951e.m8637b(bVar));
            }
            throw new IOException();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public AbstractC1921a.C1922a mo9838a(byte[] bArr) {
            AbstractC1921a.C1922a aVar = new AbstractC1921a.C1922a();
            aVar.f6561a = bArr;
            aVar.f6562b = this.f6651c;
            aVar.f6563c = this.f6652d;
            aVar.f6564d = this.f6653e;
            aVar.f6565e = this.f6654f;
            aVar.f6566f = this.f6655g;
            aVar.f6567g = C1956g.m8664a(this.f6656h);
            aVar.f6568h = Collections.unmodifiableList(this.f6656h);
            return aVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo9839a(OutputStream outputStream) {
            try {
                C1951e.m8630a(outputStream, 538247942);
                C1951e.m8632a(outputStream, this.f6650b);
                String str = this.f6651c;
                if (str == null) {
                    str = "";
                }
                C1951e.m8632a(outputStream, str);
                C1951e.m8631a(outputStream, this.f6652d);
                C1951e.m8631a(outputStream, this.f6653e);
                C1951e.m8631a(outputStream, this.f6654f);
                C1951e.m8631a(outputStream, this.f6655g);
                C1951e.m8634a(this.f6656h, outputStream);
                outputStream.flush();
                return true;
            } catch (IOException e) {
                C1941m.m8604b("%s", e.toString());
                return false;
            }
        }

        C1952a(String str, AbstractC1921a.C1922a aVar) {
            this(str, aVar.f6562b, aVar.f6563c, aVar.f6564d, aVar.f6565e, aVar.f6566f, m8649a(aVar));
            this.f6649a = (long) aVar.f6561a.length;
        }

        private C1952a(String str, String str2, long j, long j2, long j3, long j4, List<C1930e> list) {
            this.f6650b = str;
            this.f6651c = "".equals(str2) ? null : str2;
            this.f6652d = j;
            this.f6653e = j2;
            this.f6654f = j3;
            this.f6655g = j4;
            this.f6656h = list;
        }
    }

    /* renamed from: a */
    static String m8628a(C1953b bVar) throws IOException {
        return new String(m8635a(bVar, m8636b((InputStream) bVar)), "UTF-8");
    }

    /* renamed from: c */
    private static int m8638c(InputStream inputStream) throws IOException {
        int read = inputStream.read();
        if (read != -1) {
            return read;
        }
        throw new EOFException();
    }

    /* renamed from: a */
    static int m8627a(InputStream inputStream) throws IOException {
        return (m8638c(inputStream) << 24) | (m8638c(inputStream) << 0) | 0 | (m8638c(inputStream) << 8) | (m8638c(inputStream) << 16);
    }

    /* renamed from: e */
    private void m8640e(String str) {
        C1952a remove = this.f6645a.remove(str);
        if (remove != null) {
            this.f6646b -= remove.f6649a;
        }
    }

    /* renamed from: c */
    public File mo9837c(String str) {
        return new File(this.f6647c, m8639d(str));
    }

    /* renamed from: d */
    private String m8639d(String str) {
        int length = str.length() / 2;
        String valueOf = String.valueOf(str.substring(0, length).hashCode());
        return valueOf + String.valueOf(str.substring(length).hashCode());
    }

    /* renamed from: b */
    public synchronized void mo9836b(String str) {
        boolean delete = mo9837c(str).delete();
        m8640e(str);
        if (!delete) {
            C1941m.m8604b("Could not delete cache entry for key=%s, filename=%s", str, m8639d(str));
        }
    }

    /* renamed from: b */
    static long m8636b(InputStream inputStream) throws IOException {
        return ((((long) m8638c(inputStream)) & 255) << 0) | 0 | ((((long) m8638c(inputStream)) & 255) << 8) | ((((long) m8638c(inputStream)) & 255) << 16) | ((((long) m8638c(inputStream)) & 255) << 24) | ((((long) m8638c(inputStream)) & 255) << 32) | ((((long) m8638c(inputStream)) & 255) << 40) | ((((long) m8638c(inputStream)) & 255) << 48) | ((255 & ((long) m8638c(inputStream))) << 56);
    }

    /* renamed from: a */
    private void m8629a(int i) {
        long j;
        long j2 = (long) i;
        if (this.f6646b + j2 >= ((long) this.f6648d)) {
            if (C1941m.f6618b) {
                C1941m.m8602a("Pruning old cache entries.", new Object[0]);
            }
            long j3 = this.f6646b;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            Iterator<Map.Entry<String, C1952a>> it = this.f6645a.entrySet().iterator();
            int i2 = 0;
            while (it.hasNext()) {
                C1952a value = it.next().getValue();
                if (mo9837c(value.f6650b).delete()) {
                    j = j2;
                    this.f6646b -= value.f6649a;
                } else {
                    j = j2;
                    C1941m.m8604b("Could not delete cache entry for key=%s, filename=%s", value.f6650b, m8639d(value.f6650b));
                }
                it.remove();
                i2++;
                if (((float) (this.f6646b + j)) < ((float) this.f6648d) * 0.9f) {
                    break;
                }
                j2 = j;
            }
            if (C1941m.f6618b) {
                C1941m.m8602a("pruned %d files, %d bytes, %d ms", Integer.valueOf(i2), Long.valueOf(this.f6646b - j3), Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime));
            }
        }
    }

    /* renamed from: b */
    static List<C1930e> m8637b(C1953b bVar) throws IOException {
        List<C1930e> list;
        int a = m8627a((InputStream) bVar);
        if (a >= 0) {
            if (a == 0) {
                list = Collections.emptyList();
            } else {
                list = new ArrayList<>();
            }
            for (int i = 0; i < a; i++) {
                list.add(new C1930e(m8628a(bVar).intern(), m8628a(bVar).intern()));
            }
            return list;
        }
        throw new IOException("readHeaderList size=" + a);
    }

    public C1951e(File file, int i) {
        this.f6645a = new LinkedHashMap(16, 0.75f, true);
        this.f6646b = 0;
        this.f6647c = file;
        this.f6648d = i;
    }

    /* renamed from: a */
    static void m8630a(OutputStream outputStream, int i) throws IOException {
        outputStream.write((i >> 0) & 255);
        outputStream.write((i >> 8) & 255);
        outputStream.write((i >> 16) & 255);
        outputStream.write((i >> 24) & 255);
    }

    /* renamed from: a */
    static void m8631a(OutputStream outputStream, long j) throws IOException {
        outputStream.write((byte) ((int) (j >>> 0)));
        outputStream.write((byte) ((int) (j >>> 8)));
        outputStream.write((byte) ((int) (j >>> 16)));
        outputStream.write((byte) ((int) (j >>> 24)));
        outputStream.write((byte) ((int) (j >>> 32)));
        outputStream.write((byte) ((int) (j >>> 40)));
        outputStream.write((byte) ((int) (j >>> 48)));
        outputStream.write((byte) ((int) (j >>> 56)));
    }

    /* renamed from: a */
    static void m8632a(OutputStream outputStream, String str) throws IOException {
        byte[] bytes = str.getBytes("UTF-8");
        m8631a(outputStream, (long) bytes.length);
        outputStream.write(bytes, 0, bytes.length);
    }

    /* renamed from: a */
    private void m8633a(String str, C1952a aVar) {
        if (!this.f6645a.containsKey(str)) {
            this.f6646b += aVar.f6649a;
        } else {
            this.f6646b += aVar.f6649a - this.f6645a.get(str).f6649a;
        }
        this.f6645a.put(str, aVar);
    }

    /* renamed from: a */
    static void m8634a(List<C1930e> list, OutputStream outputStream) throws IOException {
        if (list != null) {
            m8630a(outputStream, list.size());
            for (C1930e eVar : list) {
                m8632a(outputStream, eVar.mo9799a());
                m8632a(outputStream, eVar.mo9800b());
            }
            return;
        }
        m8630a(outputStream, 0);
    }
}
