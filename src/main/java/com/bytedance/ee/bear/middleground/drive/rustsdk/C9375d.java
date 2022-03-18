package com.bytedance.ee.bear.middleground.drive.rustsdk;

import com.bytedance.ee.bear.contract.C5234y;
import com.bytedance.ee.log.C13479a;
import com.bytedance.lark.pb.space.drive.v1.MonitorCallback;
import com.ss.android.lark.sdk.C53248k;
import java.util.HashMap;
import java.util.Map;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.ee.bear.middleground.drive.rustsdk.d */
public class C9375d implements C53248k.AbstractC53250a {
    /* renamed from: a */
    public void mo35784a() {
    }

    C9375d() {
    }

    /* renamed from: a */
    private void m38734a(String str, Map map) {
        if (map != null && map.size() > 0) {
            C5234y.m21391b().mo21079a(str, map);
        }
    }

    /* renamed from: a */
    private MonitorCallback m38733a(byte[] bArr, String str, boolean z, boolean z2) {
        try {
            return MonitorCallback.ADAPTER.decode(bArr);
        } catch (Exception e) {
            C13479a.m54759a("Middleground_Drive_DriveRustAnalytic", "DriveRustAnalytic parse: ", e);
            return null;
        }
    }

    @Override // com.ss.android.lark.sdk.C53248k.AbstractC53250a
    public void onPush(byte[] bArr, String str, boolean z, boolean z2) {
        MonitorCallback a = m38733a(bArr, str, z, z2);
        if (a == null) {
            C13479a.m54758a("Middleground_Drive_DriveRustAnalytic", "DriveRustAnalytic dispatch: data is null");
            return;
        }
        C13479a.m54764b("Middleground_Drive_DriveRustAnalytic", "DriveRustAnalytic dispatch: event: " + a.event);
        m38734a(a.event, new HashMap(a.params));
    }
}
