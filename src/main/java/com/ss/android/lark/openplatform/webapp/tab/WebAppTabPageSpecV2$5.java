package com.ss.android.lark.openplatform.webapp.tab;

import android.os.RemoteException;
import com.bytedance.ee.webapp.v2.IWebTabCallbackInterface;
import com.ss.android.lark.sdk.C53241h;

/* access modifiers changed from: package-private */
public class WebAppTabPageSpecV2$5 extends IWebTabCallbackInterface.Default {
    final /* synthetic */ C48893d this$0;

    WebAppTabPageSpecV2$5(C48893d dVar) {
        this.this$0 = dVar;
    }

    @Override // com.bytedance.ee.webapp.v2.IWebTabCallbackInterface, com.bytedance.ee.webapp.v2.IWebTabCallbackInterface.Default
    public void onAppCommonResult(boolean z) throws RemoteException {
        C53241h.m205898b("WebAppTabPageSpecV2", "requestCommon onCommonResult = " + z);
        this.this$0.f122836f = z;
    }
}
