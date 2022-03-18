package com.bytedance.ee.webapp.config;

import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.larkwebview.base.LarkWebView;
import com.bytedance.ee.larkwebview.bridge.JsCallBack;
import com.bytedance.ee.larkwebview.bridge.Status;
import com.bytedance.ee.util.p700c.C13602d;
import com.bytedance.ee.webapp.C13802g;
import com.bytedance.lark.webview.container.impl.p837c.AbstractC19871a;
import com.ss.android.lark.http.model.ErrorResult;
import com.ss.android.lark.http.model.http.AbstractC38765a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.openapi.jsapi.entity.ConfigData;
import com.ss.android.lark.openapi.permission.AbstractC48767b;
import com.ss.android.lark.openapi.permission.bean.C48768a;
import com.ss.android.lark.openapi.permission.http.verify.C48772b;
import com.ss.android.lark.openapi.permission.http.verify.VerifyHttpRequest;
import com.ss.android.lark.openapi.permission.http.verify.VerifyResponse;

/* renamed from: com.bytedance.ee.webapp.config.d */
public class C13773d extends AbstractC19871a<ConfigData> {

    /* renamed from: a */
    public final LarkWebView f36005a;

    /* renamed from: b */
    public final AbstractC48767b f36006b;

    /* renamed from: c */
    private final String f36007c;

    /* renamed from: a */
    private C48772b m55816a(ConfigData configData, String str) {
        if (configData == null) {
            AppBrandLogger.m52829e("ConfigHandler", "web app config data is null");
            return null;
        }
        C48772b.C48774a aVar = new C48772b.C48774a();
        aVar.mo170356a(configData.getAppId()).mo170362e(this.f36007c).mo170361d(configData.getSignature()).mo170360c(configData.getNonceStr()).mo170359b(configData.getTimestamp()).mo170363f(C13772c.m55812a(str)).mo170357a(configData.getJsApiList());
        AppBrandLogger.m52830i("ConfigHandler", "auth url hash code:" + C13602d.m55222a(C13772c.m55812a(str)));
        return aVar.mo170358a();
    }

    public C13773d(LarkWebView larkWebView, String str, AbstractC48767b bVar) {
        if (larkWebView != null) {
            this.f36005a = larkWebView;
            this.f36007c = str;
            this.f36006b = bVar;
            return;
        }
        AppBrandLogger.m52829e("ConfigHandler", "context should not be null");
        throw new IllegalArgumentException("context should not be null");
    }

    /* renamed from: a */
    public void mo50794a(String str, String str2, final C48772b bVar, final AbstractC48767b bVar2) {
        final String a = C13772c.m55812a(bVar.mo170354f());
        new VerifyHttpRequest(str, str2, bVar).request(new AbstractC38765a<VerifyResponse>() {
            /* class com.bytedance.ee.webapp.config.C13773d.C137772 */

            /* renamed from: a */
            public void mo50782a(VerifyResponse verifyResponse) {
                if (!TextUtils.equals(a, C13772c.m55812a(bVar.mo170354f()))) {
                    Log.m165389i("ConfigHandler", "request onSuccess but the url has already changed");
                    return;
                }
                AbstractC48767b bVar = bVar2;
                if (bVar != null) {
                    bVar.mo50795a(bVar, verifyResponse);
                }
            }

            @Override // com.ss.android.lark.http.model.http.AbstractC38765a
            /* renamed from: a */
            public void mo50780a(ErrorResult errorResult) {
                if (!TextUtils.equals(a, C13772c.m55812a(bVar.mo170354f()))) {
                    Log.m165383e("ConfigHandler", "request onError but the url has already changed");
                } else if (bVar2 != null) {
                    int i = 333441;
                    String str = "invalid signature";
                    if (errorResult.getErrorType() == -3 && errorResult.getResponseModel() != null) {
                        i = errorResult.getResponseModel().getErrorCode();
                        if (errorResult.getResponseModel() instanceof VerifyResponse) {
                            String str2 = i + "";
                            if (str2.startsWith("20")) {
                                try {
                                    i = Integer.valueOf("333" + str2.substring(2)).intValue();
                                } catch (Exception e) {
                                    Log.m165389i("ConfigHandler", "requestPermission exception: " + e.getMessage());
                                }
                            }
                            str = ((VerifyResponse) errorResult.getResponseModel()).mErrorMsg;
                        }
                    }
                    bVar2.mo50796a(bVar, C48768a.m192108a(i, str).mo51069b());
                }
            }
        });
    }

    /* renamed from: a */
    public void mo30815a(ConfigData configData, final JsCallBack gVar, String str, LarkWebView larkWebView) {
        mo50794a(C13802g.m55926a().mo50866b().mo50830a(), C13802g.m55926a().mo50866b().mo50839b().mo50853c(), m55816a(configData, larkWebView.getUrl()), new AbstractC48767b() {
            /* class com.bytedance.ee.webapp.config.C13773d.C137741 */

            @Override // com.ss.android.lark.openapi.permission.AbstractC48767b
            /* renamed from: a */
            public void mo50795a(C48772b bVar, final VerifyResponse verifyResponse) {
                AppBrandLogger.m52830i("ConfigHandler", "web app permission granted");
                if (C13773d.this.f36006b != null) {
                    C13773d.this.f36006b.mo50795a(bVar, verifyResponse);
                }
                C13773d.this.f36005a.post(new Runnable() {
                    /* class com.bytedance.ee.webapp.config.C13773d.C137741.RunnableC137751 */

                    public void run() {
                        String str;
                        if (gVar != null) {
                            VerifyResponse verifyResponse = verifyResponse;
                            if (verifyResponse == null || verifyResponse.mDataNode == null) {
                                str = "";
                            } else {
                                str = verifyResponse.mDataNode.mSessionKey;
                            }
                            JsCallBack gVar = gVar;
                            Status status = Status.SUCCESS;
                            gVar.mo49778a(status, "{" + "\"code\":" + "0" + "," + "\"session_key\":\"" + str + "\"}");
                        }
                    }
                });
            }

            @Override // com.ss.android.lark.openapi.permission.AbstractC48767b
            /* renamed from: a */
            public void mo50796a(C48772b bVar, final String str) {
                AppBrandLogger.m52829e("ConfigHandler", "web app permission denied reason: " + str);
                if (C13773d.this.f36006b != null) {
                    C13773d.this.f36006b.mo50796a(bVar, str);
                }
                C13773d.this.f36005a.post(new Runnable() {
                    /* class com.bytedance.ee.webapp.config.C13773d.C137741.RunnableC137762 */

                    public void run() {
                        if (gVar != null) {
                            gVar.mo49778a(Status.FAILURE, str);
                        }
                    }
                });
            }
        });
    }
}
