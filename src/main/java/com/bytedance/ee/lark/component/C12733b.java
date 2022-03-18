package com.bytedance.ee.lark.component;

import android.content.Context;
import com.bytedance.ee.lark.component.p607a.C12717a;
import com.bytedance.ee.lark.component.p607a.p608a.C12718a;
import com.bytedance.ee.lark.component.p607a.p609b.C12721a;
import com.bytedance.ee.lark.component.p607a.p612e.AbstractC12726c;
import com.bytedance.ee.lark.component.p607a.p612e.C12725b;
import com.bytedance.ee.lark.component.p607a.p612e.C12727d;
import com.bytedance.ee.larkwebview.base.LarkWebView;
import com.bytedance.ee.larkwebview.service.AbstractC13470e;
import com.ss.android.lark.log.Log;
import java.util.Map;

/* renamed from: com.bytedance.ee.lark.component.b */
public class C12733b {

    /* renamed from: a */
    private AbstractC12726c f34098a;

    /* renamed from: b */
    private boolean f34099b;

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.lark.component.b$a */
    public static class C12735a {

        /* renamed from: a */
        public static final C12733b f34100a = new C12733b();
    }

    /* renamed from: a */
    public static C12733b m52710a() {
        return C12735a.f34100a;
    }

    /* renamed from: b */
    public AbstractC12726c mo48223b() {
        return this.f34098a;
    }

    /* renamed from: c */
    public boolean mo48224c() {
        return this.f34099b;
    }

    private C12733b() {
        this.f34099b = true;
        this.f34098a = new C12727d();
    }

    /* renamed from: a */
    public <T extends AbstractNativeComponent> void mo48222a(Map<String, Class<T>> map) {
        this.f34098a.mo48199a(map);
    }

    /* renamed from: a */
    public void mo48219a(LarkWebView larkWebView) {
        Log.m165389i("NativeRenderManager", "inject LarkNativeComponentConfig, enable = " + larkWebView.getSettings().getJavaScriptEnabled());
        larkWebView.addJavascriptInterface(new C12721a(), "LarkNativeComponentConfig");
    }

    /* renamed from: a */
    public void mo48220a(LarkWebView larkWebView, String str) {
        larkWebView.removeJavascriptInterface("LarkNativeComponentConfig");
    }

    /* renamed from: a */
    public void mo48218a(Context context, LarkWebView larkWebView) {
        Log.m165389i("NativeRenderManager", "init mixrender ");
        larkWebView.addJavascriptInterface(new C12721a(), "LarkNativeComponentConfig");
        C12725b bVar = new C12725b(new C12717a(context, larkWebView));
        AbstractC13470e eVar = (AbstractC13470e) larkWebView.getServiceManager().mo49931b(AbstractC13470e.class);
        if (eVar != null) {
            this.f34099b = eVar.mo49909a();
        } else {
            this.f34099b = false;
            Log.m165383e("NativeRenderManager", "openMixRender failed, renderInWebViewService is null");
        }
        new C12718a(larkWebView, bVar).mo48168a();
    }

    /* renamed from: a */
    public void mo48221a(LarkWebView larkWebView, String str, Class cls) {
        this.f34098a.mo48198a(larkWebView, str, cls);
    }
}
