package com.bytedance.apm.util;

import android.text.TextUtils;
import com.google.android.gms.stats.CodePackage;
import com.ss.ttm.player.MediaPlayer;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.HashSet;

/* renamed from: com.bytedance.apm.util.r */
public class C3134r {

    /* renamed from: a */
    private static final byte[] f10055a = {Byte.MAX_VALUE, 69, 76, 70};

    /* renamed from: b */
    private final String f10056b;

    /* renamed from: c */
    private final RandomAccessFile f10057c;

    /* renamed from: d */
    private final byte[] f10058d = new byte[MediaPlayer.MEDIA_PLAYER_OPTION_APPID];

    /* renamed from: e */
    private int f10059e;

    /* renamed from: f */
    private boolean f10060f;

    /* renamed from: g */
    private int f10061g;

    /* renamed from: h */
    private int f10062h;

    /* renamed from: i */
    private long f10063i;

    /* renamed from: j */
    private long f10064j;

    /* renamed from: k */
    private long f10065k;

    /* renamed from: l */
    private long f10066l;

    /* renamed from: m */
    private long f10067m;

    /* renamed from: n */
    private long f10068n;

    /* renamed from: o */
    private long f10069o;

    /* renamed from: p */
    private long f10070p;

    /* renamed from: q */
    private long f10071q;

    /* renamed from: r */
    private long f10072r;

    /* renamed from: a */
    public void mo13057a() {
        try {
            this.f10057c.close();
        } catch (IOException unused) {
        }
    }

    /* renamed from: c */
    private int m13043c() throws IOException {
        return (int) m13031a(2);
    }

    /* renamed from: d */
    private long m13044d() throws IOException {
        return m13031a(4);
    }

    /* renamed from: e */
    private long m13045e() throws IOException {
        return m13031a(this.f10062h);
    }

    /* renamed from: f */
    private long m13046f() throws IOException {
        return m13031a(this.f10062h);
    }

    /* renamed from: g */
    private int m13047g() throws IOException {
        return this.f10057c.read() & 255;
    }

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
        try {
            mo13057a();
        } finally {
            super.finalize();
        }
    }

    /* renamed from: com.bytedance.apm.util.r$a */
    public static class C3135a {

        /* renamed from: a */
        public final String f10073a;

        /* renamed from: b */
        public final int f10074b;

        /* renamed from: c */
        public final int f10075c;

        /* renamed from: a */
        private String m13049a() {
            int i = this.f10074b;
            if (i == 0) {
                return "LOCAL";
            }
            if (i == 1) {
                return "GLOBAL";
            }
            if (i == 2) {
                return "WEAK";
            }
            return "STB_??? (" + this.f10074b + ")";
        }

        public String toString() {
            return "Symbol[" + this.f10073a + "," + m13049a() + "," + m13050b() + "]";
        }

        /* renamed from: b */
        private String m13050b() {
            switch (this.f10075c) {
                case 0:
                    return "NOTYPE";
                case 1:
                    return "OBJECT";
                case 2:
                    return "FUNC";
                case 3:
                    return "SECTION";
                case 4:
                    return "FILE";
                case 5:
                    return CodePackage.COMMON;
                case 6:
                    return "TLS";
                default:
                    return "STT_??? (" + this.f10075c + ")";
            }
        }

        C3135a(String str, int i) {
            this.f10073a = str;
            this.f10074b = (i >> 4) & 15;
            this.f10075c = i & 15;
        }
    }

    /* renamed from: b */
    private void m13041b() throws IOException {
        this.f10057c.seek(0);
        this.f10057c.readFully(this.f10058d, 0, 16);
        byte[] bArr = this.f10058d;
        byte b = bArr[0];
        byte[] bArr2 = f10055a;
        if (b == bArr2[0] && bArr[1] == bArr2[1] && bArr[2] == bArr2[2] && bArr[3] == bArr2[3]) {
            byte b2 = bArr[4];
            if (b2 == 1) {
                this.f10062h = 4;
            } else if (b2 == 2) {
                this.f10062h = 8;
            } else {
                throw new IOException("Invalid ELF EI_CLASS: " + ((int) b2) + ": " + this.f10056b);
            }
            byte b3 = bArr[5];
            this.f10059e = b3;
            if (b3 == 1) {
                this.f10061g = m13043c();
                int c = m13043c();
                if (c != 3 && c != 62 && c != 183 && c != 40 && c != 8 && c != 164) {
                    throw new IOException("Invalid ELF e_machine: " + c + ": " + this.f10056b);
                } else if ((c != 3 || b2 == 1) && ((c != 62 || b2 == 2) && ((c != 183 || b2 == 2) && ((c != 40 || b2 == 1) && (c != 164 || b2 == 1))))) {
                    long d = m13044d();
                    if (d == 1) {
                        m13046f();
                        m13045e();
                        long e = m13045e();
                        m13044d();
                        m13043c();
                        m13043c();
                        m13043c();
                        m13036a(e, m13043c(), m13043c(), m13043c());
                        return;
                    }
                    throw new IOException("Invalid e_version: " + d + ": " + this.f10056b);
                } else {
                    throw new IOException("Invalid e_machine/EI_CLASS ELF combination: " + c + "/" + ((int) b2) + ": " + this.f10056b);
                }
            } else if (b3 == 2) {
                throw new IOException("Unsupported ELFDATA2MSB file: " + this.f10056b);
            } else {
                throw new IOException("Invalid ELF EI_DATA: " + this.f10059e + ": " + this.f10056b);
            }
        } else {
            throw new IllegalArgumentException("Invalid ELF file: " + this.f10056b);
        }
    }

    /* renamed from: a */
    public static C3134r m13033a(File file) throws IOException {
        return new C3134r(file);
    }

    /* renamed from: a */
    private String m13034a(long j) throws IOException {
        long j2 = this.f10067m;
        if (j2 == 0 || j < 0 || j >= this.f10068n) {
            return null;
        }
        return m13040b(j2 + j);
    }

    private C3134r(File file) throws IOException {
        this.f10056b = file.getPath();
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
        this.f10057c = randomAccessFile;
        if (randomAccessFile.length() >= 16) {
            m13041b();
            return;
        }
        throw new IllegalArgumentException("Too small to be an ELF file: " + file);
    }

    /* renamed from: a */
    private long m13031a(int i) throws IOException {
        int i2 = 0;
        this.f10057c.readFully(this.f10058d, 0, i);
        if (this.f10059e == 1) {
            for (int i3 = i - 1; i3 >= 0; i3--) {
                i2 = (i2 << 8) | (this.f10058d[i3] & 255);
            }
        } else {
            int i4 = i - 1;
            int i5 = 0;
            while (i2 <= i4) {
                i5 = (i5 << 8) | (this.f10058d[i2] & 255);
                i2++;
            }
            i2 = i5;
        }
        return (long) i2;
    }

    /* renamed from: b */
    private String m13040b(long j) throws IOException {
        long filePointer = this.f10057c.getFilePointer();
        this.f10057c.seek(j);
        RandomAccessFile randomAccessFile = this.f10057c;
        byte[] bArr = this.f10058d;
        randomAccessFile.readFully(bArr, 0, (int) Math.min((long) bArr.length, randomAccessFile.length() - j));
        this.f10057c.seek(filePointer);
        int i = 0;
        while (true) {
            byte[] bArr2 = this.f10058d;
            if (i >= bArr2.length) {
                return null;
            }
            if (bArr2[i] == 0) {
                return new String(this.f10058d, 0, i);
            }
            i++;
        }
    }

    /* renamed from: b */
    private boolean m13042b(String str) throws IOException {
        int i;
        HashSet<Long> hashSet = new HashSet();
        byte[] bArr = new byte[((int) Math.max(this.f10064j, this.f10070p))];
        this.f10057c.seek(this.f10063i);
        this.f10057c.readFully(bArr, 0, (int) this.f10064j);
        int i2 = 0;
        while (((long) i2) < this.f10064j) {
            long b = m13039b(bArr, i2);
            int i3 = i2 + 4;
            int i4 = this.f10062h;
            if (i4 == 8) {
                i = m13030a(bArr, i3);
                int i5 = this.f10062h;
                i2 = i3 + 1 + i5 + 3 + i5;
            } else {
                int i6 = i3 + i4 + 4;
                i = m13030a(bArr, i6);
                i2 = i6 + 1 + 3;
            }
            if (b != 0 && (i & 15) == 2) {
                hashSet.add(Long.valueOf(b));
            }
        }
        this.f10057c.seek(this.f10069o);
        this.f10057c.readFully(bArr, 0, (int) this.f10070p);
        byte[] bytes = str.getBytes();
        int length = bytes.length;
        for (Long l : hashSet) {
            int i7 = 0;
            while (i7 < length) {
                int longValue = (int) (((long) i7) + l.longValue());
                if (((long) longValue) >= this.f10070p || bArr[longValue] != bytes[i7]) {
                    break;
                }
                i7++;
            }
            if (i7 == length && bArr[(int) (((long) i7) + l.longValue())] == 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private boolean m13038a(String str) throws IOException {
        int i;
        this.f10057c.seek(this.f10063i);
        while (this.f10057c.getFilePointer() < this.f10063i + this.f10064j) {
            long d = m13044d();
            if (this.f10062h == 8) {
                i = m13047g();
                m13047g();
                m13043c();
                m13046f();
                m13031a(this.f10062h);
            } else {
                m13046f();
                m13044d();
                i = m13047g();
                m13047g();
                m13043c();
            }
            if (d != 0) {
                String a = m13035a(this.f10069o, this.f10070p, d);
                if (TextUtils.equals(str, a) && new C3135a(a, i).f10075c == 2) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    private int m13030a(byte[] bArr, int i) {
        return bArr[i] & 255;
    }

    /* renamed from: b */
    private long m13039b(byte[] bArr, int i) throws IOException {
        return m13032a(4, bArr, i);
    }

    /* renamed from: a */
    public static boolean m13037a(File file, String str) throws IOException {
        boolean z;
        C3134r a = m13033a(file);
        if (Math.max(a.f10064j, a.f10070p) <= 200000) {
            z = a.m13042b(str);
        } else {
            z = a.m13038a(str);
        }
        a.mo13057a();
        return z;
    }

    /* renamed from: a */
    private long m13032a(int i, byte[] bArr, int i2) throws IOException {
        int i3 = 0;
        if (this.f10059e == 1) {
            for (int i4 = i - 1; i4 >= 0; i4--) {
                i3 = (bArr[i4 + i2] & 255) | (i3 << 8);
            }
        } else {
            int i5 = i - 1;
            int i6 = 0;
            while (i3 <= i5) {
                i6 = (i6 << 8) | (bArr[i3 + i2] & 255);
                i3++;
            }
            i3 = i6;
        }
        return (long) i3;
    }

    /* renamed from: a */
    private String m13035a(long j, long j2, long j3) throws IOException {
        if (j == 0 || j3 < 0 || j3 >= j2) {
            return null;
        }
        return m13040b(j + j3);
    }

    /* renamed from: a */
    private void m13036a(long j, int i, int i2, int i3) throws IOException {
        this.f10057c.seek(j + ((long) (i3 * i2)));
        m13044d();
        long d = m13044d();
        m13031a(this.f10062h);
        m13046f();
        long e = m13045e();
        long a = m13031a(this.f10062h);
        if (d == 3) {
            this.f10067m = e;
            this.f10068n = a;
        }
        for (int i4 = 0; i4 < i; i4++) {
            if (i4 != i3) {
                this.f10057c.seek(j + ((long) (i4 * i2)));
                long d2 = m13044d();
                long d3 = m13044d();
                m13031a(this.f10062h);
                m13046f();
                long e2 = m13045e();
                long a2 = m13031a(this.f10062h);
                if (d3 == 2 || d3 == 11) {
                    String a3 = m13034a(d2);
                    if (".symtab".equals(a3)) {
                        this.f10063i = e2;
                        this.f10064j = a2;
                    } else if (".dynsym".equals(a3)) {
                        this.f10065k = e2;
                        this.f10066l = a2;
                    }
                } else if (d3 == 3) {
                    String a4 = m13034a(d2);
                    if (".strtab".equals(a4)) {
                        this.f10069o = e2;
                        this.f10070p = a2;
                    } else if (".dynstr".equals(a4)) {
                        this.f10071q = e2;
                        this.f10072r = a2;
                    }
                } else if (d3 == 6) {
                    this.f10060f = true;
                }
            }
        }
    }
}
