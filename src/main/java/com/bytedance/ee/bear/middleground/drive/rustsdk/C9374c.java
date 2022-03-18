package com.bytedance.ee.bear.middleground.drive.rustsdk;

import com.bytedance.ee.bear.lark.p414b.AbstractC8005o;
import com.bytedance.ee.bear.middleground.drive.export.NetworkLevel;
import com.bytedance.ee.log.C13479a;
import com.bytedance.lark.pb.basic.v1.DynamicNetStatusResponse;
import com.ss.android.lark.sdk.C53248k;
import java.io.IOException;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.ee.bear.middleground.drive.rustsdk.c */
public class C9374c implements AbstractC8005o.AbstractC8006a, C53248k.AbstractC53250a {

    /* renamed from: a */
    private NetworkLevel f25205a = NetworkLevel.EXCELLENT;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public NetworkLevel mo35783a() {
        return this.f25205a;
    }

    C9374c() {
    }

    @Override // com.bytedance.ee.bear.lark.p414b.AbstractC8005o.AbstractC8006a
    /* renamed from: a */
    public void mo31017a(NetworkLevel networkLevel) {
        this.f25205a = networkLevel;
    }

    @Override // com.ss.android.lark.sdk.C53248k.AbstractC53250a
    public void onPush(byte[] bArr, String str, boolean z, boolean z2) {
        m38730a(bArr, str, z, z2);
    }

    /* renamed from: a */
    private void m38730a(byte[] bArr, String str, boolean z, boolean z2) {
        try {
            this.f25205a = NetworkLevel.forNumber(DynamicNetStatusResponse.ADAPTER.decode(bArr).net_status.getValue());
        } catch (IOException e) {
            e.printStackTrace();
            C13479a.m54758a("Middleground_Drive_DriveNetStateListener", "onPushNetLevel parser failed:" + e.getMessage());
        }
    }
}
