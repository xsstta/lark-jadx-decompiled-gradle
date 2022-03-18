package com.bytedance.ee.lark.component.p607a.p608a;

import com.bytedance.ee.lark.component.p607a.p612e.C12725b;
import com.bytedance.ee.larkwebview.base.LarkWebView;
import com.ss.android.lark.log.Log;

/* renamed from: com.bytedance.ee.lark.component.a.a.a */
public class C12718a {

    /* renamed from: a */
    private LarkWebView f34051a;

    /* renamed from: b */
    private C12725b f34052b;

    /* renamed from: a */
    public void mo48168a() {
        m52636b();
    }

    /* renamed from: b */
    private void m52636b() {
        m52635a("insertNativeComponent");
        m52635a("updateNativeComponentAttribute");
        m52635a("deleteNativeComponent");
        m52635a("nativeComponentDispatchAction");
    }

    /* renamed from: a */
    private void m52635a(String str) {
        if (this.f34051a == null) {
            Log.m165383e("NativeComponentBridge", "registerHandler, mWebView is null, handlerName = " + str);
            return;
        }
        C12725b bVar = this.f34052b;
        if (bVar == null) {
            Log.m165383e("NativeComponentBridge", "registerHandler, mNativeComponentProvider is null, handlerName = " + str);
            return;
        }
        this.f34051a.getBridge().mo49770a(str, new C12720c(str, bVar));
    }

    public C12718a(LarkWebView larkWebView, C12725b bVar) {
        this.f34051a = larkWebView;
        this.f34052b = bVar;
    }
}
