package com.bytedance.ee.ref.p682a.p683a;

import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.google.firebase.messaging.Constants;
import com.ss.android.lark.log.Log;
import com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65806i;
import com.tt.miniapphost.p3362a.p3363a.AbstractC67439g;
import com.tt.refer.common.util.C67866g;
import com.tt.refer.p3400a.p3401a.p3402a.C67706e;
import com.tt.refer.p3413b.p3414a.AbstractC67737a;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.ee.ref.a.a.a */
public class C13484a extends AbstractC67737a implements AbstractC67439g {

    /* renamed from: a */
    public WebView f35531a;

    /* renamed from: b */
    public ExecutorService f35532b = Executors.newSingleThreadExecutor();

    /* renamed from: c */
    private String f35533c;

    @Override // com.tt.miniapphost.p3362a.p3363a.AbstractC67439g
    /* renamed from: b */
    public void mo50164b() {
        this.f35531a = null;
    }

    @Override // com.tt.refer.p3413b.p3414a.AbstractC67737a
    /* renamed from: c */
    public String mo50165c() {
        return this.f35533c;
    }

    @Override // com.bytedance.ee.lark.infra.sandbox.context.IBaseService, com.tt.refer.impl.business.p3431b.AbstractC67896a
    public void release() {
        super.release();
    }

    /* access modifiers changed from: protected */
    @Override // com.tt.refer.impl.business.p3431b.AbstractC67896a
    /* renamed from: a */
    public AbstractC65806i mo50160a() {
        return new AbstractC65806i() {
            /* class com.bytedance.ee.ref.p682a.p683a.C13484a.C134851 */

            @Override // com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65806i
            public void executeAsyncApiHandle(String str, Runnable runnable) {
                C13484a.this.f35532b.execute(runnable);
            }
        };
    }

    /* renamed from: a */
    public void mo50161a(WebView webView) {
        this.f35531a = webView;
    }

    public C13484a(IAppContext iAppContext) {
        super(iAppContext);
    }

    /* renamed from: a */
    public void mo50163a(String str) {
        this.f35533c = str;
    }

    @Override // com.tt.refer.p3400a.p3403b.AbstractC67717a
    /* renamed from: a */
    public void mo50162a(final C67706e eVar) {
        if (this.f35531a == null) {
            AppBrandLogger.m52829e("WebAppJsBridgeServiceImpl", "webView is null");
            return;
        }
        C67866g.m264027a(new Runnable() {
            /* class com.bytedance.ee.ref.p682a.p683a.C13484a.RunnableC134862 */

            public void run() {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("callbackID", eVar.mo235006d());
                    jSONObject.put(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, eVar.mo235007e());
                    jSONObject.put("callbackType", "continued");
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("bizDomain", "open_platform");
                    jSONObject.put("extra", jSONObject2);
                    C13484a.this.f35531a.evaluateJavascript(String.format("LarkWebViewJavaScriptBridge.nativeCallBack(%s)", jSONObject.toString()), new ValueCallback<String>() {
                        /* class com.bytedance.ee.ref.p682a.p683a.C13484a.RunnableC134862.C134871 */

                        /* renamed from: a */
                        public void onReceiveValue(String str) {
                            Log.m165389i("WebAppJsBridgeServiceImpl", "invokeJsRunTimeAPI->onReceiveValue:" + eVar.mo235006d());
                        }
                    });
                } catch (JSONException e) {
                    AppBrandLogger.m52829e("WebAppJsBridgeServiceImpl", e);
                }
            }
        });
    }
}
