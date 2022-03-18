package com.bumptech.glide.gifdecoder;

import android.util.Log;
import com.huawei.hms.feature.dynamic.DynamicModule;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* renamed from: com.bumptech.glide.gifdecoder.c */
public class C2133c {

    /* renamed from: a */
    private final byte[] f7402a = new byte[DynamicModule.f58006b];

    /* renamed from: b */
    private ByteBuffer f7403b;

    /* renamed from: c */
    private C2132b f7404c;

    /* renamed from: d */
    private int f7405d;

    /* renamed from: d */
    private void m9275d() {
        m9272a(Integer.MAX_VALUE);
    }

    /* renamed from: j */
    private void m9281j() {
        m9284m();
        m9282k();
    }

    /* renamed from: n */
    private int m9285n() {
        return this.f7403b.getShort();
    }

    /* renamed from: a */
    public void mo10467a() {
        this.f7403b = null;
        this.f7404c = null;
    }

    /* renamed from: m */
    private int m9284m() {
        try {
            return this.f7403b.get() & 255;
        } catch (Exception unused) {
            this.f7404c.f7390b = 1;
            return 0;
        }
    }

    /* renamed from: o */
    private boolean m9286o() {
        if (this.f7404c.f7390b != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    private void m9274c() {
        this.f7403b = null;
        Arrays.fill(this.f7402a, (byte) 0);
        this.f7404c = new C2132b();
        this.f7405d = 0;
    }

    /* renamed from: k */
    private void m9282k() {
        int m;
        do {
            m = m9284m();
            this.f7403b.position(Math.min(this.f7403b.position() + m, this.f7403b.limit()));
        } while (m > 0);
    }

    /* renamed from: g */
    private void m9278g() {
        do {
            m9283l();
            byte[] bArr = this.f7402a;
            if (bArr[0] == 1) {
                this.f7404c.f7401m = ((bArr[2] & 255) << 8) | (bArr[1] & 255);
            }
            if (this.f7405d <= 0) {
                return;
            }
        } while (!m9286o());
    }

    /* renamed from: i */
    private void m9280i() {
        boolean z;
        this.f7404c.f7394f = m9285n();
        this.f7404c.f7395g = m9285n();
        int m = m9284m();
        C2132b bVar = this.f7404c;
        if ((m & SmActions.ACTION_ONTHECALL_EXIT) != 0) {
            z = true;
        } else {
            z = false;
        }
        bVar.f7396h = z;
        this.f7404c.f7397i = (int) Math.pow(2.0d, (double) ((m & 7) + 1));
        this.f7404c.f7398j = m9284m();
        this.f7404c.f7399k = m9284m();
    }

    /* renamed from: b */
    public C2132b mo10468b() {
        if (this.f7403b == null) {
            throw new IllegalStateException("You must call setData() before parseHeader()");
        } else if (m9286o()) {
            return this.f7404c;
        } else {
            m9279h();
            if (!m9286o()) {
                m9275d();
                if (this.f7404c.f7391c < 0) {
                    this.f7404c.f7390b = 1;
                }
            }
            return this.f7404c;
        }
    }

    /* renamed from: e */
    private void m9276e() {
        m9284m();
        int m = m9284m();
        this.f7404c.f7392d.f7384g = (m & 28) >> 2;
        boolean z = true;
        if (this.f7404c.f7392d.f7384g == 0) {
            this.f7404c.f7392d.f7384g = 1;
        }
        C2131a aVar = this.f7404c.f7392d;
        if ((m & 1) == 0) {
            z = false;
        }
        aVar.f7383f = z;
        int n = m9285n();
        if (n < 2) {
            n = 10;
        }
        this.f7404c.f7392d.f7386i = n * 10;
        this.f7404c.f7392d.f7385h = m9284m();
        m9284m();
    }

    /* renamed from: h */
    private void m9279h() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            sb.append((char) m9284m());
        }
        if (!sb.toString().startsWith("GIF")) {
            this.f7404c.f7390b = 1;
            return;
        }
        m9280i();
        if (this.f7404c.f7396h && !m9286o()) {
            C2132b bVar = this.f7404c;
            bVar.f7389a = m9273b(bVar.f7397i);
            C2132b bVar2 = this.f7404c;
            bVar2.f7400l = bVar2.f7389a[this.f7404c.f7398j];
        }
    }

    /* renamed from: l */
    private void m9283l() {
        int m = m9284m();
        this.f7405d = m;
        if (m > 0) {
            int i = 0;
            int i2 = 0;
            while (true) {
                try {
                    int i3 = this.f7405d;
                    if (i < i3) {
                        i2 = i3 - i;
                        this.f7403b.get(this.f7402a, i, i2);
                        i += i2;
                    } else {
                        return;
                    }
                } catch (Exception e) {
                    if (Log.isLoggable("GifHeaderParser", 3)) {
                        Log.d("GifHeaderParser", "Error Reading Block n: " + i + " count: " + i2 + " blockSize: " + this.f7405d, e);
                    }
                    this.f7404c.f7390b = 1;
                    return;
                }
            }
        }
    }

    /* renamed from: f */
    private void m9277f() {
        boolean z;
        this.f7404c.f7392d.f7378a = m9285n();
        this.f7404c.f7392d.f7379b = m9285n();
        this.f7404c.f7392d.f7380c = m9285n();
        this.f7404c.f7392d.f7381d = m9285n();
        int m = m9284m();
        boolean z2 = false;
        if ((m & SmActions.ACTION_ONTHECALL_EXIT) != 0) {
            z = true;
        } else {
            z = false;
        }
        int pow = (int) Math.pow(2.0d, (double) ((m & 7) + 1));
        C2131a aVar = this.f7404c.f7392d;
        if ((m & 64) != 0) {
            z2 = true;
        }
        aVar.f7382e = z2;
        if (z) {
            this.f7404c.f7392d.f7388k = m9273b(pow);
        } else {
            this.f7404c.f7392d.f7388k = null;
        }
        this.f7404c.f7392d.f7387j = this.f7403b.position();
        m9281j();
        if (!m9286o()) {
            this.f7404c.f7391c++;
            this.f7404c.f7393e.add(this.f7404c.f7392d);
        }
    }

    /* renamed from: a */
    public C2133c mo10466a(ByteBuffer byteBuffer) {
        m9274c();
        ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        this.f7403b = asReadOnlyBuffer;
        asReadOnlyBuffer.position(0);
        this.f7403b.order(ByteOrder.LITTLE_ENDIAN);
        return this;
    }

    /* renamed from: b */
    private int[] m9273b(int i) {
        byte[] bArr = new byte[(i * 3)];
        int[] iArr = null;
        try {
            this.f7403b.get(bArr);
            iArr = new int[DynamicModule.f58006b];
            int i2 = 0;
            int i3 = 0;
            while (i2 < i) {
                int i4 = i3 + 1;
                int i5 = i4 + 1;
                int i6 = i5 + 1;
                int i7 = i2 + 1;
                iArr[i2] = ((bArr[i3] & 255) << 16) | -16777216 | ((bArr[i4] & 255) << 8) | (bArr[i5] & 255);
                i3 = i6;
                i2 = i7;
            }
        } catch (BufferUnderflowException e) {
            if (Log.isLoggable("GifHeaderParser", 3)) {
                Log.d("GifHeaderParser", "Format Error Reading Color Table", e);
            }
            this.f7404c.f7390b = 1;
        }
        return iArr;
    }

    /* renamed from: a */
    private void m9272a(int i) {
        boolean z = false;
        while (!z && !m9286o() && this.f7404c.f7391c <= i) {
            int m = m9284m();
            if (m == 33) {
                int m2 = m9284m();
                if (m2 == 1) {
                    m9282k();
                } else if (m2 == 249) {
                    this.f7404c.f7392d = new C2131a();
                    m9276e();
                } else if (m2 == 254) {
                    m9282k();
                } else if (m2 != 255) {
                    m9282k();
                } else {
                    m9283l();
                    StringBuilder sb = new StringBuilder();
                    for (int i2 = 0; i2 < 11; i2++) {
                        sb.append((char) this.f7402a[i2]);
                    }
                    if (sb.toString().equals("NETSCAPE2.0")) {
                        m9278g();
                    } else {
                        m9282k();
                    }
                }
            } else if (m == 44) {
                if (this.f7404c.f7392d == null) {
                    this.f7404c.f7392d = new C2131a();
                }
                m9277f();
            } else if (m != 59) {
                this.f7404c.f7390b = 1;
            } else {
                z = true;
            }
        }
    }
}
