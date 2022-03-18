package com.bytedance.ee.larkwebview.service.p681a;

import com.bytedance.ee.larkwebview.base.LarkWebView;
import com.bytedance.ee.larkwebview.p670c.AbstractC13420b;
import com.bytedance.ee.larkwebview.p670c.C13419a;
import com.bytedance.ee.larkwebview.p670c.C13422d;
import com.bytedance.ee.larkwebview.service.AbstractC13470e;
import com.bytedance.lynx.webview.extension.TTWebViewExtension;
import com.ss.android.lark.log.Log;

/* renamed from: com.bytedance.ee.larkwebview.service.a.a */
public class C13459a implements AbstractC13470e {

    /* renamed from: a */
    private TTWebViewExtension f35496a;

    /* renamed from: b */
    private C13419a f35497b;

    @Override // com.bytedance.ee.larkwebview.service.AbstractC13470e
    /* renamed from: a */
    public boolean mo49909a() {
        return m54699a(true);
    }

    @Override // com.bytedance.ee.larkwebview.service.AbstractC13470e
    /* renamed from: a */
    public void mo49908a(String str) {
        C13422d.m54558a().mo49812a(str);
    }

    @Override // com.bytedance.ee.larkwebview.service.AbstractC13470e
    /* renamed from: a */
    public void mo49906a(LarkWebView larkWebView) {
        this.f35496a = new TTWebViewExtension(larkWebView);
        C13419a aVar = new C13419a();
        this.f35497b = aVar;
        this.f35496a.addPluginFactory(aVar);
    }

    /* renamed from: a */
    private boolean m54699a(boolean z) {
        boolean z2;
        TTWebViewExtension tTWebViewExtension = this.f35496a;
        boolean z3 = false;
        if (tTWebViewExtension != null) {
            z2 = tTWebViewExtension.isFeatureSupport("mixrender_sandwich_mode");
            if (z2) {
                z3 = this.f35496a.enableFeature("mixrender_sandwich_mode", z);
            }
        } else {
            z2 = false;
        }
        Log.m165389i("RenderInWebViewServiceImpl", "switchMixRender " + z + " result = " + z3 + " , isSupportMix = " + z2);
        return z3;
    }

    @Override // com.bytedance.ee.larkwebview.service.AbstractC13470e
    /* renamed from: a */
    public void mo49907a(AbstractC13420b bVar) {
        C13422d.m54558a().mo49811a(bVar);
        String a = bVar.mo48171a();
        C13419a aVar = this.f35497b;
        if (aVar != null && aVar.mo49804a(a) != null) {
            this.f35497b.mo49804a(a).mo49807a();
        }
    }
}
