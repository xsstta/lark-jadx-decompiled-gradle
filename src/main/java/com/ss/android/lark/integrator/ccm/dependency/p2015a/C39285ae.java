package com.ss.android.lark.integrator.ccm.dependency.p2015a;

import com.bytedance.ee.bear.lark.p414b.AbstractC8005o;
import com.bytedance.ee.bear.middleground.drive.export.NetworkLevel;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.biz.core.api.NetworkLevelListener;
import com.ss.android.lark.utils.ApiUtils;

/* renamed from: com.ss.android.lark.integrator.ccm.dependency.a.ae */
public class C39285ae implements AbstractC8005o {
    @Override // com.bytedance.ee.bear.lark.p414b.AbstractC8005o
    /* renamed from: a */
    public void mo31016a(AbstractC8005o.AbstractC8006a aVar) {
        if (aVar != null) {
            ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).registerNetworkLevelListener(new NetworkLevelListener() {
                /* class com.ss.android.lark.integrator.ccm.dependency.p2015a.$$Lambda$ae$ZeeI0qgbpIN5d8cNrgDVbLWL3w */

                @Override // com.ss.android.lark.biz.core.api.NetworkLevelListener
                public final void onNetworkLevelChanged(NetworkLevelListener.NetworkLevel networkLevel) {
                    C39285ae.m270610lambda$ZeeI0qgbpIN5d8cNrgDVbLWL3w(AbstractC8005o.AbstractC8006a.this, networkLevel);
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m154959a(AbstractC8005o.AbstractC8006a aVar, NetworkLevelListener.NetworkLevel networkLevel) {
        aVar.mo31017a(NetworkLevel.forNumber(networkLevel.getValue()));
    }
}
