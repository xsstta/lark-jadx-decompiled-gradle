package com.ss.android.lark.openplatform.webapp.tab;

import android.os.RemoteException;
import com.bytedance.ee.webapp.v2.IWebTabCallbackInterface;
import com.ss.android.lark.openplatform.webapp.tab.C48893d;
import com.ss.android.lark.sdk.C53241h;

class WebAppTabPageSpecV2$4$2 extends IWebTabCallbackInterface.Default {
    final /* synthetic */ C48893d.C488974 this$1;

    WebAppTabPageSpecV2$4$2(C48893d.C488974 r1) {
        this.this$1 = r1;
    }

    @Override // com.bytedance.ee.webapp.v2.IWebTabCallbackInterface, com.bytedance.ee.webapp.v2.IWebTabCallbackInterface.Default
    public void onAppRemoveResult(boolean z) throws RemoteException {
        C53241h.m205898b("WebAppTabPageSpecV2", "onRemoveResult " + z);
        if (z) {
            C48893d.this.f122836f = false;
        }
    }
}
