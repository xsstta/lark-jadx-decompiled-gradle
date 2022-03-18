package com.facebook.battery.metrics.network;

import android.os.Process;
import com.facebook.battery.metrics.core.C20998c;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;

/* access modifiers changed from: package-private */
/* renamed from: com.facebook.battery.metrics.network.c */
public class C21007c extends AbstractC21005a {

    /* renamed from: a */
    private static final long f51393a = ((long) Process.myUid());

    /* renamed from: b */
    private static final long f51394b = ((long) 113213102);

    /* renamed from: c */
    private static final long[] f51395c = {(long) -1320644472, (long) 3459};

    /* renamed from: d */
    private RandomAccessFile f51396d;

    /* renamed from: e */
    private boolean f51397e = true;

    /* renamed from: f */
    private boolean f51398f;

    /* renamed from: g */
    private boolean f51399g;

    /* renamed from: h */
    private int f51400h;

    @Override // com.facebook.battery.metrics.network.AbstractC21005a
    /* renamed from: b */
    public boolean mo71155b() {
        return true;
    }

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
        m76536f();
    }

    C21007c() {
    }

    /* renamed from: f */
    private void m76536f() {
        this.f51397e = false;
        RandomAccessFile randomAccessFile = this.f51396d;
        if (randomAccessFile != null) {
            try {
                randomAccessFile.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: g */
    private boolean m76537g() throws IOException {
        m76538h();
        this.f51399g = true;
        return true ^ this.f51398f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public RandomAccessFile mo71158c() throws FileNotFoundException {
        return new RandomAccessFile("/proc/net/xt_qtaguid/stats", "r");
    }

    /* renamed from: e */
    private int m76535e() throws IOException {
        boolean z = false;
        boolean z2 = false;
        int i = 0;
        while (!z && m76538h()) {
            int i2 = this.f51400h;
            if (i2 != 32) {
                i = (i * 31) + i2;
                z2 = true;
            } else {
                z = true;
            }
        }
        m76533a(z2);
        return i;
    }

    /* renamed from: h */
    private boolean m76538h() throws IOException {
        boolean z = false;
        if (this.f51399g) {
            this.f51399g = false;
            return !this.f51398f;
        }
        int read = this.f51396d.read();
        this.f51400h = read;
        if (read == -1) {
            z = true;
        }
        this.f51398f = z;
        return !z;
    }

    /* renamed from: d */
    private long m76534d() throws IOException {
        boolean z = false;
        long j = 0;
        boolean z2 = false;
        while (!z && m76538h()) {
            if (Character.isDigit(this.f51400h)) {
                j = (j * 10) + ((long) (this.f51400h - 48));
                z2 = true;
            } else {
                z = true;
            }
        }
        m76533a(z2);
        return j;
    }

    /* renamed from: a */
    private boolean m76533a(boolean z) {
        boolean z2 = z & this.f51397e;
        this.f51397e = z2;
        return z2;
    }

    /* renamed from: a */
    private void m76531a(char c) throws IOException {
        boolean z = false;
        while (!z && m76538h()) {
            if (this.f51400h == c) {
                z = true;
            }
        }
        m76533a(z);
    }

    /* renamed from: a */
    private static boolean m76532a(int i) {
        int i2 = 0;
        while (true) {
            long[] jArr = f51395c;
            if (i2 >= jArr.length) {
                return false;
            }
            if (((long) i) == jArr[i2]) {
                return true;
            }
            i2++;
        }
    }

    @Override // com.facebook.battery.metrics.network.AbstractC21005a
    /* renamed from: a */
    public boolean mo71154a(long[] jArr) {
        boolean z;
        char c;
        int i;
        if (!this.f51397e) {
            return false;
        }
        Arrays.fill(jArr, 0L);
        try {
            if (this.f51396d == null) {
                this.f51396d = mo71158c();
            }
            this.f51398f = false;
            this.f51396d.seek(0);
            m76531a('\n');
            while (!this.f51398f && this.f51397e && m76537g()) {
                m76531a(' ');
                int e = m76535e();
                m76531a(' ');
                long d = m76534d();
                boolean z2 = true;
                if (((long) e) == f51394b) {
                    z = true;
                } else {
                    z = false;
                }
                if (z || m76532a(e)) {
                    z2 = false;
                }
                if (d == f51393a) {
                    if (z || z2) {
                        long d2 = m76534d();
                        if (z) {
                            c = 0;
                        } else {
                            c = 2;
                        }
                        int i2 = c | 0;
                        if (d2 == 0) {
                            i = 4;
                        } else {
                            i = 0;
                        }
                        int i3 = i | i2;
                        int i4 = i3 | 0;
                        jArr[i4] = jArr[i4] + m76534d();
                        m76531a(' ');
                        int i5 = i3 | 1;
                        jArr[i5] = jArr[i5] + m76534d();
                        m76531a('\n');
                    }
                }
                m76531a('\n');
            }
        } catch (IOException e2) {
            C20998c.m76505a("QTagUidNetworkBytesCollector", "Unable to parse file", e2);
            m76536f();
        }
        return this.f51397e;
    }
}
