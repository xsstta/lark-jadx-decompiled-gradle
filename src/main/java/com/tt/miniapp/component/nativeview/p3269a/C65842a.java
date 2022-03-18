package com.tt.miniapp.component.nativeview.p3269a;

import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.utils.CharacterUtils;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.tt.frontendapiinterface.ApiCallResult;
import com.tt.frontendapiinterface.ApiCallResultHelper;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.RenderViewManager;
import com.tt.miniapp.component.nativeview.C65887g;
import com.tt.miniapp.jsbridge.C66254h;
import com.tt.miniapp.p3324r.C66713b;
import com.tt.miniapp.webbridge.C67315e;
import com.tt.miniapphost.p3371e.C67509b;
import com.tt.option.ext.AbstractC67619e;
import org.json.JSONObject;

/* renamed from: com.tt.miniapp.component.nativeview.a.a */
public class C65842a extends C67315e {

    /* renamed from: c */
    private IAppContext f165933c;

    public C65842a(C65887g gVar, IAppContext iAppContext) {
        super(gVar);
        this.f165933c = iAppContext;
    }

    /* renamed from: a */
    private void m258011a(String str, String str2, String str3) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("eventName", str);
            jSONObject.put("invokeMethodName", str2);
            jSONObject.put("errorMessage", str3);
            C67509b.m262587a("mp_invoke_api_failed", 7000, jSONObject, this.f165933c);
        } catch (Exception e) {
            AppBrandLogger.m52829e("AdWebBridge", e);
        }
    }

    /* renamed from: a */
    public void mo230586a(String str, int i, String str2) {
        if (TextUtils.isEmpty(str2) || !str2.contains(":fail")) {
            AppBrandLogger.m52828d("AdWebBridge", "callbackWebView callbackID ", Integer.valueOf(i), "msg:", str2);
        } else {
            AppBrandLogger.m52829e("AdWebBridge", "******************callbackWebView callbackID ", Integer.valueOf(i), "msg:", str2, new Throwable());
            m258011a(str, "callbackWebView", str2);
        }
        RenderViewManager renderViewManager = AppbrandApplicationImpl.getInst(this.f165933c).getRenderViewManager();
        if (renderViewManager != null) {
            renderViewManager.invokeHandler(this.f169869a, i, str2);
        }
    }

    @Override // com.tt.miniapp.webbridge.C67315e
    @JavascriptInterface
    public String invoke(final String str, String str2, int i) {
        if (str == null) {
            return CharacterUtils.empty();
        }
        AppBrandLogger.m52828d("AdWebBridge", "invoke event ", str, " param ", str2, " callbackId ", Integer.valueOf(i));
        str.hashCode();
        if (str.equals("login") || str.equals("getAdSiteBaseInfo")) {
            try {
                new C66713b(new C66254h(str, str2, i, new AbstractC67619e() {
                    /* class com.tt.miniapp.component.nativeview.p3269a.C65842a.C658431 */

                    @Override // com.tt.option.ext.AbstractC67619e
                    public void callback(int i, String str) {
                        C65842a.this.mo230586a(str, i, str);
                    }
                }), this.f165933c).mo232443a();
            } catch (Throwable th) {
                mo230586a(str, i, ApiCallResult.Builder.createFail(str).extraInfo(ApiCallResultHelper.generateThrowableExtraInfo(th)).toString());
                AppBrandLogger.m52829e("AdWebBridge", "handleInvoke ", th);
            }
        }
        return CharacterUtils.empty();
    }
}
