package org.apache.commons.compress.compressors.p3502i;

import com.huawei.hms.feature.dynamic.DynamicModule;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;
import org.apache.commons.compress.compressors.p3500g.AbstractC69810a;

/* renamed from: org.apache.commons.compress.compressors.i.a */
public class C69814a extends AbstractC69810a {

    /* renamed from: b */
    private final boolean f174459b;

    /* renamed from: c */
    private final int f174460c;

    /* renamed from: d */
    private long f174461d;

    /* renamed from: k */
    private void m267909k() {
        mo244894e((this.f174459b ? 1 : 0) + DynamicModule.f58006b);
    }

    /* access modifiers changed from: protected */
    @Override // org.apache.commons.compress.compressors.p3500g.AbstractC69810a
    /* renamed from: c */
    public int mo244888c() throws IOException {
        int c = super.mo244888c();
        if (c >= 0) {
            this.f174461d++;
        }
        return c;
    }

    /* renamed from: l */
    private void m267910l() throws IOException {
        long j = 8 - (this.f174461d % 8);
        if (j == 8) {
            j = 0;
        }
        for (long j2 = 0; j2 < j; j2++) {
            mo244888c();
        }
        this.f174442a.mo244671a();
    }

    /* access modifiers changed from: protected */
    @Override // org.apache.commons.compress.compressors.p3500g.AbstractC69810a
    /* renamed from: b */
    public int mo244886b() throws IOException {
        int c = mo244888c();
        if (c < 0) {
            return -1;
        }
        boolean z = false;
        if (!this.f174459b || c != mo244898i()) {
            if (c == mo244899j()) {
                mo244891d();
                z = true;
            } else if (c > mo244899j()) {
                throw new IOException(String.format("Invalid %d bit code 0x%x", Integer.valueOf(mo244893e()), Integer.valueOf(c)));
            }
            return mo244884a(c, z);
        }
        m267909k();
        m267910l();
        mo244895f();
        mo244897h();
        return 0;
    }

    /* access modifiers changed from: protected */
    @Override // org.apache.commons.compress.compressors.p3500g.AbstractC69810a
    /* renamed from: a */
    public int mo244882a(int i, byte b) throws IOException {
        int e = 1 << mo244893e();
        int a = mo244883a(i, b, e);
        if (mo244899j() == e && mo244893e() < this.f174460c) {
            m267910l();
            mo244896g();
        }
        return a;
    }

    public C69814a(InputStream inputStream, int i) throws IOException {
        super(inputStream, ByteOrder.LITTLE_ENDIAN);
        boolean z;
        int a = (int) this.f174442a.mo244670a(8);
        int a2 = (int) this.f174442a.mo244670a(8);
        int a3 = (int) this.f174442a.mo244670a(8);
        if (a == 31 && a2 == 157 && a3 >= 0) {
            if ((a3 & SmActions.ACTION_ONTHECALL_EXIT) != 0) {
                z = true;
            } else {
                z = false;
            }
            this.f174459b = z;
            int i2 = 31 & a3;
            this.f174460c = i2;
            if (z) {
                mo244887b(9);
            }
            mo244885a(i2, i);
            m267909k();
            return;
        }
        throw new IOException("Input is not in .Z format");
    }
}
