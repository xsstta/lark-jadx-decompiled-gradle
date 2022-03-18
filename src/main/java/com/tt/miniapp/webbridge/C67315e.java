package com.tt.miniapp.webbridge;

import android.webkit.JavascriptInterface;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.schedulers.Action;
import com.bytedance.ee.lark.infra.foundation.schedulers.Schedulers;
import com.bytedance.ee.lark.infra.foundation.utils.CharacterUtils;
import com.larksuite.component.openplatform.core.utils.OPMonitorUtils;
import com.ss.android.lark.opmonitor.trace.OPTrace;
import com.ss.android.lark.sdk.C53241h;
import com.tt.frontendapiinterface.ApiCallResult;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.RenderViewManager;
import com.tt.miniapp.component.nativeview.C65887g;
import com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65805h;
import com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65806i;
import com.tt.miniapphost.C67432a;
import com.tt.option.ext.AbstractC67619e;
import com.tt.refer.common.util.C67866g;
import com.tt.refer.impl.business.p3431b.AbstractC67896a;
import com.tt.refer.p3400a.p3401a.p3402a.C67706e;
import java.lang.ref.SoftReference;

/* renamed from: com.tt.miniapp.webbridge.e */
public class C67315e extends AbstractC67896a {

    /* renamed from: a */
    protected int f169869a;

    /* renamed from: b */
    public AbstractC67619e f169870b = new AbstractC67619e() {
        /* class com.tt.miniapp.webbridge.C67315e.C673182 */

        @Override // com.tt.option.ext.AbstractC67619e
        public void callback(int i, String str) {
            C67315e.this.mo233991a(i, str);
        }
    };

    /* renamed from: c */
    private SoftReference<C65887g> f169871c;

    @Override // com.bytedance.ee.lark.infra.sandbox.context.IBaseService, com.tt.refer.impl.business.p3431b.AbstractC67896a
    public void release() {
        super.release();
    }

    /* access modifiers changed from: protected */
    @Override // com.tt.refer.impl.business.p3431b.AbstractC67896a
    /* renamed from: a */
    public AbstractC65806i mo50160a() {
        return new AbstractC65806i() {
            /* class com.tt.miniapp.webbridge.C67315e.C673161 */

            @Override // com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65806i
            public void executeAsyncApiHandle(String str, final Runnable runnable) {
                C67866g.m264025a(new Action() {
                    /* class com.tt.miniapp.webbridge.C67315e.C673161.C673171 */

                    @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Action
                    public void act() {
                        runnable.run();
                    }
                }, Schedulers.longIO());
            }
        };
    }

    /* renamed from: com.tt.miniapp.webbridge.e$a */
    private class C67319a implements AbstractC65805h {

        /* renamed from: b */
        private int f169877b;

        @Override // com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65805h
        public void callback(ApiCallResult apiCallResult) {
            C67315e.this.f169870b.callback(this.f169877b, apiCallResult.toString());
        }

        public C67319a(int i) {
            this.f169877b = i;
        }
    }

    public C67315e(C65887g gVar) {
        super(gVar.getAppContext());
        this.f169869a = gVar.getWebViewId();
        this.f169871c = new SoftReference<>(gVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m262204a(String str) {
        C53241h.m205898b("WebComponentBridge", "send to web component." + str);
    }

    @JavascriptInterface
    public String invoke(String str) {
        AppBrandLogger.m52830i("WebComponentBridge", "invoke native webView event---", str);
        SoftReference<C65887g> softReference = this.f169871c;
        if (softReference == null || softReference.get() == null) {
            return "";
        }
        C65887g gVar = this.f169871c.get();
        if (!"reload".equals(str)) {
            return "";
        }
        gVar.mo230671a();
        return "";
    }

    @Override // com.tt.refer.p3400a.p3403b.AbstractC67717a
    /* renamed from: a */
    public void mo50162a(C67706e eVar) {
        SoftReference<C65887g> softReference = this.f169871c;
        if (softReference != null && softReference.get() != null) {
            this.f169871c.get().getWebView().evaluateJavascript(String.format("ttJSBridge.subscribeHandler(\"%s\",%s,%d)", eVar.mo235006d(), eVar.mo235007e().toString(), Integer.valueOf(this.f169869a)), $$Lambda$e$vbqJImnX78YQyjxXxZSEUp94mw.INSTANCE);
        }
    }

    /* renamed from: a */
    public void mo233991a(int i, String str) {
        AppBrandLogger.m52830i("WebComponentBridge", "native webview return invokeHandler callbackID ", Integer.valueOf(i));
        RenderViewManager renderViewManager = AppbrandApplicationImpl.getInst(this.f170082d).getRenderViewManager();
        if (renderViewManager != null) {
            renderViewManager.olderInvokeHandler(this.f169869a, i, str);
        }
    }

    @JavascriptInterface
    public String publish(String str, String str2, int[] iArr) {
        AppBrandLogger.m52830i("WebComponentBridge", " publish event ", str, " webviewIds ", iArr);
        SoftReference<C65887g> softReference = this.f169871c;
        if (softReference == null || softReference.get() == null) {
            return null;
        }
        C67432a.m262319a(this.f169871c.get().getAppContext()).getJsBridge().sendMsgToJsCore(str, str2, this.f169869a);
        return null;
    }

    @JavascriptInterface
    public String invoke(String str, String str2, int i) {
        AppBrandLogger.m52830i("WebComponentBridge", "invoke native webView event--- ", str, " callbackId ", Integer.valueOf(i));
        OPTrace subTrace = this.f170082d.getTracingSpan().subTrace(str);
        OPMonitorUtils.monitorNativeInvoke(this.f170082d, subTrace, str, str2, null, "", false);
        String a = mo235562a(str, str2, subTrace, new C67319a(i));
        if (a != null) {
            return a;
        }
        return CharacterUtils.empty();
    }
}
