package org.chromium;

import com.ttnet.org.chromium.net.TTMonitorProvider;

/* renamed from: org.chromium.b */
public class C70009b extends TTMonitorProvider {

    /* renamed from: a */
    private static C70009b f174987a;

    private C70009b() {
    }

    /* renamed from: a */
    public static C70009b m268519a() {
        if (f174987a == null) {
            synchronized (C70009b.class) {
                if (f174987a == null) {
                    f174987a = new C70009b();
                }
            }
        }
        return f174987a;
    }

    @Override // com.ttnet.org.chromium.net.TTMonitorProvider
    public void sendAppMonitorEvent(String str, String str2) {
        C70010c.m268520a().mo246396a(str, str2);
    }

    @Override // com.ttnet.org.chromium.net.TTMonitorProvider
    public void handleApiResult(boolean z, String str, String str2, String str3, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, boolean z2, long j11, long j12, String str4, String str5, String str6, int i, int i2, String str7) {
        C70010c.m268520a().mo246399a(z, str, str2, str3, j, j2, j3, j4, j5, j6, j7, j8, j9, j10, z2, j11, j12, str4, str5, str6, i, i2, str7);
    }
}
