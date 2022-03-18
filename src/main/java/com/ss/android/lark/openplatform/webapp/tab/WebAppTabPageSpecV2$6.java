package com.ss.android.lark.openplatform.webapp.tab;

import android.os.RemoteException;
import com.bytedance.ee.webapp.v2.IWebLifeCycleListener;
import com.ss.android.lark.openplatform.OpenPlatformModule;
import com.ss.android.lark.sdk.C53241h;

/* access modifiers changed from: package-private */
public class WebAppTabPageSpecV2$6 extends IWebLifeCycleListener.Default {
    final /* synthetic */ C48893d this$0;
    final /* synthetic */ String val$tabKey;

    @Override // com.bytedance.ee.webapp.v2.IWebLifeCycleListener, com.bytedance.ee.webapp.v2.IWebLifeCycleListener.Default
    public void onCreateView() throws RemoteException {
        C53241h.m205898b("WebAppTabPageSpecV2", "tab onCreateView");
        this.this$0.mo170741p();
    }

    @Override // com.bytedance.ee.webapp.v2.IWebLifeCycleListener, com.bytedance.ee.webapp.v2.IWebLifeCycleListener.Default
    public void onFirstDataLoaded() throws RemoteException {
        C53241h.m205898b("WebAppTabPageSpecV2", "onFirstDataLoaded-v2 " + this.val$tabKey);
        OpenPlatformModule.m192198d().getMainDependency().mo144964b(this.val$tabKey);
    }

    @Override // com.bytedance.ee.webapp.v2.IWebLifeCycleListener, com.bytedance.ee.webapp.v2.IWebLifeCycleListener.Default
    public void onFirstFrameDraw() throws RemoteException {
        C53241h.m205898b("WebAppTabPageSpecV2", "onFirstFrameDraw-v2 " + this.val$tabKey);
        OpenPlatformModule.m192198d().getMainDependency().mo144965c(this.val$tabKey);
    }

    @Override // com.bytedance.ee.webapp.v2.IWebLifeCycleListener, com.bytedance.ee.webapp.v2.IWebLifeCycleListener.Default
    public void onFirstFrameShow() throws RemoteException {
        C53241h.m205898b("WebAppTabPageSpecV2", "onFirstFrameShow-v2 " + this.val$tabKey);
        OpenPlatformModule.m192198d().getMainDependency().mo144966d(this.val$tabKey);
    }

    @Override // com.bytedance.ee.webapp.v2.IWebLifeCycleListener, com.bytedance.ee.webapp.v2.IWebLifeCycleListener.Default
    public void onPageFinished(String str) throws RemoteException {
        C53241h.m205898b("WebAppTabPageSpecV2", "onPageFinished ");
        if (this.this$0.f122831a != null) {
            this.this$0.f122831a.mo170744i();
        }
    }

    @Override // com.bytedance.ee.webapp.v2.IWebLifeCycleListener, com.bytedance.ee.webapp.v2.IWebLifeCycleListener.Default
    public void onProgressChanged(int i) throws RemoteException {
        C53241h.m205898b("WebAppTabPageSpecV2", "onProgressChanged " + i);
        if (i > 99 && this.this$0.f122831a != null) {
            this.this$0.f122831a.mo170744i();
        }
    }

    WebAppTabPageSpecV2$6(C48893d dVar, String str) {
        this.this$0 = dVar;
        this.val$tabKey = str;
    }
}
