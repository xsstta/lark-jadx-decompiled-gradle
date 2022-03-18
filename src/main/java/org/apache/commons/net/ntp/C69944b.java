package org.apache.commons.net.ntp;

import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import java.net.DatagramPacket;
import java.util.Arrays;

/* renamed from: org.apache.commons.net.ntp.b */
public class C69944b implements AbstractC69945c {

    /* renamed from: a */
    private final byte[] f174815a = new byte[48];

    /* renamed from: b */
    private volatile DatagramPacket f174816b;

    /* renamed from: a */
    protected static final int m268323a(byte b) {
        return b & 255;
    }

    /* renamed from: b */
    protected static final long m268325b(byte b) {
        return (long) (b & 255);
    }

    /* renamed from: b */
    public int mo245839b() {
        return this.f174815a[2];
    }

    /* renamed from: c */
    public int mo245841c() {
        return this.f174815a[3];
    }

    /* renamed from: f */
    public int mo245845f() {
        return m268326c(4);
    }

    /* renamed from: g */
    public int mo245846g() {
        return m268326c(8);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f174815a);
    }

    /* renamed from: i */
    public int mo245849i() {
        return m268326c(12);
    }

    @Override // org.apache.commons.net.ntp.AbstractC69945c
    /* renamed from: k */
    public TimeStamp mo245851k() {
        return m268327d(40);
    }

    @Override // org.apache.commons.net.ntp.AbstractC69945c
    /* renamed from: l */
    public TimeStamp mo245852l() {
        return m268327d(24);
    }

    @Override // org.apache.commons.net.ntp.AbstractC69945c
    /* renamed from: m */
    public TimeStamp mo245853m() {
        return m268327d(32);
    }

    /* renamed from: q */
    private String m268331q() {
        return Integer.toHexString(mo245849i());
    }

    /* renamed from: a */
    public int mo245836a() {
        return (m268323a(this.f174815a[0]) >> 0) & 7;
    }

    /* renamed from: e */
    public int mo245843e() {
        return m268323a(this.f174815a[1]);
    }

    /* renamed from: h */
    public double mo245847h() {
        return ((double) mo245846g()) / 65.536d;
    }

    /* renamed from: p */
    private String m268330p() {
        char c;
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i <= 3 && (c = (char) this.f174815a[i + 12]) != 0) {
            sb.append(c);
            i++;
        }
        return sb.toString();
    }

    /* renamed from: d */
    public int mo245842d() {
        return (m268323a(this.f174815a[0]) >> 3) & 7;
    }

    @Override // org.apache.commons.net.ntp.AbstractC69945c
    /* renamed from: n */
    public synchronized DatagramPacket mo245854n() {
        if (this.f174816b == null) {
            byte[] bArr = this.f174815a;
            this.f174816b = new DatagramPacket(bArr, bArr.length);
            this.f174816b.setPort(SmActions.ACTION_CALLING_ENTRY);
        }
        return this.f174816b;
    }

    /* renamed from: j */
    public String mo245850j() {
        int d = mo245842d();
        int e = mo245843e();
        if (d == 3 || d == 4) {
            if (e == 0 || e == 1) {
                return m268330p();
            }
            if (d == 4) {
                return m268331q();
            }
        }
        if (e >= 2) {
            return m268329o();
        }
        return m268331q();
    }

    /* renamed from: o */
    private String m268329o() {
        return m268323a(this.f174815a[12]) + "." + m268323a(this.f174815a[13]) + "." + m268323a(this.f174815a[14]) + "." + m268323a(this.f174815a[15]);
    }

    public String toString() {
        return "[version:" + mo245842d() + ", mode:" + mo245836a() + ", poll:" + mo245839b() + ", precision:" + mo245841c() + ", delay:" + mo245845f() + ", dispersion(ms):" + mo245847h() + ", id:" + mo245850j() + ", xmitTime:" + mo245851k().toDateString() + " ]";
    }

    @Override // org.apache.commons.net.ntp.AbstractC69945c
    /* renamed from: a */
    public void mo245838a(TimeStamp timeStamp) {
        m268324a(40, timeStamp);
    }

    /* renamed from: d */
    private TimeStamp m268327d(int i) {
        return new TimeStamp(m268328e(i));
    }

    @Override // org.apache.commons.net.ntp.AbstractC69945c
    /* renamed from: b */
    public void mo245840b(int i) {
        byte[] bArr = this.f174815a;
        bArr[0] = (byte) (((i & 7) << 3) | (bArr[0] & 199));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f174815a, ((C69944b) obj).f174815a);
    }

    /* renamed from: c */
    private int m268326c(int i) {
        return m268323a(this.f174815a[i + 3]) | (m268323a(this.f174815a[i]) << 24) | (m268323a(this.f174815a[i + 1]) << 16) | (m268323a(this.f174815a[i + 2]) << 8);
    }

    @Override // org.apache.commons.net.ntp.AbstractC69945c
    /* renamed from: a */
    public void mo245837a(int i) {
        byte[] bArr = this.f174815a;
        bArr[0] = (byte) ((i & 7) | (bArr[0] & 248));
    }

    /* renamed from: e */
    private long m268328e(int i) {
        return (m268325b(this.f174815a[i]) << 56) | (m268325b(this.f174815a[i + 1]) << 48) | (m268325b(this.f174815a[i + 2]) << 40) | (m268325b(this.f174815a[i + 3]) << 32) | (m268325b(this.f174815a[i + 4]) << 24) | (m268325b(this.f174815a[i + 5]) << 16) | (m268325b(this.f174815a[i + 6]) << 8) | m268325b(this.f174815a[i + 7]);
    }

    /* renamed from: a */
    private void m268324a(int i, TimeStamp timeStamp) {
        long j;
        if (timeStamp == null) {
            j = 0;
        } else {
            j = timeStamp.ntpValue();
        }
        for (int i2 = 7; i2 >= 0; i2--) {
            this.f174815a[i + i2] = (byte) ((int) (255 & j));
            j >>>= 8;
        }
    }
}
