package com.ss.android.lark.browser.biz.dybrid.viewdelegate;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import androidx.fragment.app.Fragment;
import com.bytedance.ee.larkwebview.base.LarkWebView;
import com.bytedance.ee.larkwebview.bridge.JsCallBack;
import com.bytedance.ee.larkwebview.bridge.Status;
import com.bytedance.ee.larkwebview.monitor.webview.BizType;
import com.bytedance.lark.webview.container.impl.p836b.AbstractC19856a;
import com.bytedance.lark.webview.container.impl.p837c.AbstractC19871a;
import com.larksuite.component.dybrid.h5api.AbstractC24152a;
import com.larksuite.component.dybrid.h5api.api.AbstractC24168k;
import com.larksuite.component.dybrid.h5api.api.C24160c;
import com.larksuite.component.dybrid.h5api.api.C24162e;
import com.larksuite.component.dybrid.h5api.api.H5Param;
import com.larksuite.component.dybrid.h5api.p1071b.C24174b;
import com.larksuite.component.webview.container.dto.IWebContainerContract;
import com.ss.android.lark.browser.C29638a;
import com.ss.android.lark.browser.biz.dybrid.viewdelegate.DybridWebViewDelegate;
import com.ss.android.lark.browser.biz.messenger.viewdelegate.MessengerWebViewDelegate;
import com.ss.android.lark.browser.impl.C29927b;
import com.ss.android.lark.browser.impl.p1421a.C29925a;
import com.ss.android.lark.browser.interceptor.QuickOpenUrlInterceptor;
import com.ss.android.lark.jsbridge.AbstractC40669e;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.openapi.jsapi.AbstractC48759a;
import com.ss.android.lark.util.share_preference.C57744a;
import com.ss.android.lark.utils.ApiUtils;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class DybridWebViewDelegate extends MessengerWebViewDelegate {
    public static final Parcelable.Creator<DybridWebViewDelegate> CREATOR = new Parcelable.Creator<DybridWebViewDelegate>() {
        /* class com.ss.android.lark.browser.biz.dybrid.viewdelegate.DybridWebViewDelegate.C297713 */

        /* renamed from: a */
        public DybridWebViewDelegate[] newArray(int i) {
            return new DybridWebViewDelegate[i];
        }

        /* renamed from: a */
        public DybridWebViewDelegate createFromParcel(Parcel parcel) {
            return new DybridWebViewDelegate(parcel);
        }
    };

    /* renamed from: a */
    private boolean f74464a;

    /* renamed from: b */
    private String f74465b;

    /* renamed from: c */
    private String f74466c;

    /* renamed from: d */
    private String f74467d;

    /* renamed from: e */
    private boolean f74468e;

    /* renamed from: f */
    private String f74469f;

    /* renamed from: g */
    private AbstractC24168k f74470g;

    /* renamed from: h */
    private long f74471h;

    @Override // com.larksuite.component.webview.container.dto.AbstractInjectWebViewDelegate, com.ss.android.lark.browser.biz.messenger.viewdelegate.MessengerWebViewDelegate
    public int describeContents() {
        return 0;
    }

    public DybridWebViewDelegate() {
    }

    /* renamed from: a */
    private void m110077a() {
        mo92000x().mo67339a("setStatusBarColor", new AbstractC19871a<String>() {
            /* class com.ss.android.lark.browser.biz.dybrid.viewdelegate.DybridWebViewDelegate.C297702 */

            /* access modifiers changed from: private */
            /* renamed from: a */
            public /* synthetic */ void m110096a(String str, JsCallBack gVar, String str2) {
                Activity u = DybridWebViewDelegate.this.mo91997u();
                if (u instanceof AbstractC19856a) {
                    ((AbstractC19856a) u).mo67225a(Color.parseColor(str));
                    gVar.mo49778a(Status.SUCCESS, str2);
                    return;
                }
                Log.m165389i("DybirdWebViewDelegate", "activity is not IWebStatusBar");
                gVar.mo49778a(Status.FAILURE, str2);
            }

            /* renamed from: a */
            public void mo30815a(String str, JsCallBack gVar, String str2, LarkWebView larkWebView) {
                try {
                    if (TextUtils.isEmpty(str)) {
                        Log.m165383e("DybirdWebViewDelegate", "api data is empty will return");
                        gVar.mo49778a(Status.FAILURE, str);
                    } else if (larkWebView == null) {
                        Log.m165389i("DybirdWebViewDelegate", "larkWebView is null,will return");
                    } else {
                        String string = new JSONObject(str).getString("color");
                        if (TextUtils.isEmpty(string)) {
                            Log.m165389i("DybirdWebViewDelegate", "setStatusBarColor color is empty,will return");
                            gVar.mo49778a(Status.FAILURE, str);
                            return;
                        }
                        larkWebView.post(new Runnable(string, gVar, str) {
                            /* class com.ss.android.lark.browser.biz.dybrid.viewdelegate.$$Lambda$DybridWebViewDelegate$2$q1vuB4fY3Cnwk5p9bUj9pRRgm_0 */
                            public final /* synthetic */ String f$1;
                            public final /* synthetic */ JsCallBack f$2;
                            public final /* synthetic */ String f$3;

                            {
                                this.f$1 = r2;
                                this.f$2 = r3;
                                this.f$3 = r4;
                            }

                            public final void run() {
                                DybridWebViewDelegate.C297702.this.m110096a(this.f$1, this.f$2, this.f$3);
                            }
                        });
                    }
                } catch (Throwable th) {
                    Log.m165386e("DybirdWebViewDelegate", th);
                    gVar.mo49778a(Status.FAILURE, str);
                }
            }
        });
    }

    /* renamed from: b */
    private void m110079b() {
        if (mo91997u() != null) {
            Intent intent = new Intent();
            intent.setAction("loading.url.open");
            intent.setPackage(mo91997u().getPackageName());
            intent.putExtra("isLoadingUrlOpen", false);
            mo91997u().sendBroadcast(intent);
        }
    }

    protected DybridWebViewDelegate(Parcel parcel) {
        super(parcel);
    }

    /* renamed from: a */
    private AbstractC19871a<String> m110075a(final AbstractC48759a<String> aVar) {
        return new AbstractC19871a<String>() {
            /* class com.ss.android.lark.browser.biz.dybrid.viewdelegate.DybridWebViewDelegate.C297681 */

            /* renamed from: a */
            public void mo30815a(String str, final JsCallBack gVar, String str2, LarkWebView larkWebView) {
                aVar.mo86799a(str, new AbstractC40669e() {
                    /* class com.ss.android.lark.browser.biz.dybrid.viewdelegate.DybridWebViewDelegate.C297681.C297691 */

                    @Override // com.ss.android.lark.jsbridge.AbstractC40669e
                    /* renamed from: a */
                    public void mo107242a(String str) {
                        gVar.mo49778a(Status.SUCCESS, str);
                    }

                    @Override // com.ss.android.lark.jsbridge.AbstractC40669e
                    /* renamed from: b */
                    public void mo107243b(String str) {
                        gVar.mo49778a(Status.FAILURE, str);
                    }
                });
            }
        };
    }

    /* renamed from: a */
    private String m110076a(String str) {
        try {
            return Uri.parse(str).getQueryParameter("dynamic_bn");
        } catch (Exception unused) {
            Log.m165383e("DybirdWebViewDelegate", "This isn't a hierarchical URI. -->" + str);
            return "";
        }
    }

    /* renamed from: a */
    private void m110078a(Bundle bundle) {
        this.f74467d = bundle.getString("offlineResRootPath");
        this.f74466c = bundle.getString("titleBackgroundTranslate");
        this.f74465b = bundle.getString("bizName");
        this.f74468e = bundle.getBoolean("isLoginUrl", false);
        mo92000x().mo67341a(false);
    }

    @Override // com.larksuite.component.webview.container.dto.AbstractInjectWebViewDelegate, com.ss.android.lark.browser.biz.messenger.viewdelegate.MessengerWebViewDelegate
    /* renamed from: a */
    public void mo50979a(Fragment fragment) {
        super.mo50979a(fragment);
        this.f74468e = false;
        if (!TextUtils.isEmpty(this.f74469f) && this.f74469f.contains("&loadingpage=true")) {
            C57744a.m224104a().putString("passport_security_id", "");
            m110079b();
        }
    }

    @Override // com.larksuite.component.webview.container.dto.AbstractInjectWebViewDelegate, com.ss.android.lark.browser.biz.messenger.viewdelegate.MessengerWebViewDelegate
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }

    @Override // com.larksuite.component.webview.container.dto.AbstractInjectWebViewDelegate
    /* renamed from: c */
    public void mo51000c(Fragment fragment, WebView webView) {
        AbstractC24168k kVar = this.f74470g;
        if (kVar != null) {
            kVar.mo86736a("h5PageResume", null);
        }
    }

    @Override // com.larksuite.component.webview.container.dto.AbstractInjectWebViewDelegate
    /* renamed from: e */
    public void mo91876e(Fragment fragment, WebView webView) {
        AbstractC24168k kVar = this.f74470g;
        if (kVar != null) {
            kVar.mo86756i();
            this.f74470g = null;
        }
    }

    @Override // com.larksuite.component.webview.container.dto.AbstractInjectWebViewDelegate, com.ss.android.lark.browser.biz.messenger.viewdelegate.MessengerWebViewDelegate, com.larksuite.component.webview.container.dto.IWebContainerContract.IWebContainerView.AbstractC25824a
    /* renamed from: c */
    public boolean mo51002c(WebView webView, String str) {
        if (webView.getContext() == null || !this.f74468e || !QuickOpenUrlInterceptor.f74310a.mo106870b()) {
            if (!TextUtils.isEmpty(m110076a(str))) {
                C29925a.m110632a(str);
            }
            return super.mo51002c(webView, str);
        }
        Log.m165389i("DybirdWebViewDelegate", "shouldOverrideUrlLoading--QuickOpenUrlInterceptor run");
        return false;
    }

    @Override // com.larksuite.component.webview.container.dto.AbstractInjectWebViewDelegate, com.larksuite.component.webview.container.dto.IWebContainerContract.IWebContainerView.AbstractC25824a
    /* renamed from: d */
    public void mo51004d(WebView webView, String str) {
        try {
            if (!TextUtils.isEmpty(this.f74465b) && this.f74470g != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("title", str);
                this.f74470g.mo86736a("h5PageReceivedTitle", jSONObject);
            }
        } catch (JSONException e) {
            Log.m165384e("DybirdWebViewDelegate", "jsonException", e);
        }
    }

    @Override // com.larksuite.component.webview.container.dto.AbstractInjectWebViewDelegate, com.ss.android.lark.browser.biz.messenger.viewdelegate.MessengerWebViewDelegate, com.larksuite.component.webview.container.dto.IWebContainerContract.IWebContainerView.AbstractC25824a
    /* renamed from: b */
    public void mo50995b(WebView webView, String str) {
        if (!TextUtils.isEmpty(m110076a(str))) {
            C29925a.m110631a(System.currentTimeMillis() - this.f74471h, str);
        }
        try {
            if (!TextUtils.isEmpty(this.f74465b) && this.f74470g != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("url", str);
                this.f74470g.mo86736a("h5PageFinished", jSONObject);
            }
        } catch (JSONException e) {
            Log.m165384e("DybirdWebViewDelegate", "jsonException", e);
        }
    }

    @Override // com.larksuite.component.webview.container.dto.AbstractInjectWebViewDelegate, com.larksuite.component.webview.container.dto.IWebContainerContract.IWebContainerView.AbstractC25824a
    /* renamed from: a */
    public WebResourceResponse mo91871a(WebView webView, WebResourceRequest webResourceRequest) {
        long currentTimeMillis = System.currentTimeMillis();
        if (TextUtils.isEmpty(this.f74467d)) {
            return null;
        }
        C29925a.m110637e(webResourceRequest.getUrl().toString());
        AbstractC24152a h5Service = C29638a.m109622a().getH5Service();
        if (h5Service == null) {
            Log.m165383e("DybirdWebViewDelegate", "H5service == null");
            return super.mo91871a(webView, webResourceRequest);
        }
        WebResourceResponse offlineResByPath = h5Service.getOfflineResByPath(this.f74467d, webResourceRequest.getUrl().toString());
        if (offlineResByPath != null) {
            C29925a.m110633b(System.currentTimeMillis() - currentTimeMillis, webResourceRequest.getUrl().toString());
            return offlineResByPath;
        }
        C29925a.m110630a(-1, "have offlinePath ResourceResponse == null");
        C29925a.m110638f(webResourceRequest.getUrl().toString());
        return null;
    }

    @Override // com.larksuite.component.webview.container.dto.AbstractInjectWebViewDelegate, com.ss.android.lark.browser.biz.messenger.viewdelegate.MessengerWebViewDelegate
    /* renamed from: b */
    public void mo50996b(Fragment fragment, WebView webView) {
        super.mo50996b(fragment, webView);
        if (!this.f74464a) {
            m110078a(fragment.getArguments());
            this.f74464a = true;
        }
        if (webView instanceof LarkWebView) {
            ((LarkWebView) webView).setBizType(BizType.f35444h.mo49864e());
        }
        AbstractC24152a aVar = (AbstractC24152a) ApiUtils.getApi(AbstractC24152a.class);
        if (aVar != null) {
            if (this.f74470g == null) {
                long currentTimeMillis = System.currentTimeMillis();
                this.f74470g = aVar.createH5Page(new C24162e(mo91997u()), new C24160c(fragment.getArguments()), webView);
                Log.m165379d("DybirdWebViewDelegate", "create H5DybridPage timestamp:" + (System.currentTimeMillis() - currentTimeMillis));
                Map<String, AbstractC48759a<String>> h5PluginConfigToJSHandlers = aVar.h5PluginConfigToJSHandlers(this.f74470g);
                if (h5PluginConfigToJSHandlers != null) {
                    for (String str : h5PluginConfigToJSHandlers.keySet()) {
                        C24174b.m88296a("DybirdWebViewDelegate", "eventName:" + str);
                        mo92000x().mo67340a(str, h5PluginConfigToJSHandlers.get(str));
                        mo92000x().mo67339a(str, m110075a(h5PluginConfigToJSHandlers.get(str)));
                    }
                    m110077a();
                }
            } else {
                Log.m165379d("DybirdWebViewDelegate", "this fragment has h5DybridPage!");
            }
        }
        if (!(TextUtils.isEmpty(this.f74465b) || TextUtils.isEmpty(this.f74466c))) {
            if (this.f74466c.equals(H5Param.TitleBackgroundTranslate.always.name()) || this.f74466c.equals(H5Param.TitleBackgroundTranslate.auto.name())) {
                mo91999w().mo67307a(true);
                mo91999w().mo67308b().mo67324b(0);
            }
        }
    }

    @Override // com.larksuite.component.webview.container.dto.AbstractInjectWebViewDelegate, com.ss.android.lark.browser.biz.messenger.viewdelegate.MessengerWebViewDelegate, com.larksuite.component.webview.container.dto.IWebContainerContract.IWebContainerView.AbstractC25824a
    /* renamed from: a */
    public void mo50978a(WebView webView, String str) {
        this.f74471h = System.currentTimeMillis();
        this.f74469f = str;
        if (!TextUtils.isEmpty(m110076a(str))) {
            if (TextUtils.isEmpty(this.f74467d)) {
                C29925a.m110636d(str);
            } else {
                C29925a.m110635c(str);
            }
        }
        try {
            if (!TextUtils.isEmpty(this.f74465b) && this.f74470g != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("url", str);
                this.f74470g.mo86736a("h5PageStarted", jSONObject);
            }
        } catch (JSONException e) {
            Log.m165384e("DybirdWebViewDelegate", "jsonException", e);
        }
        C29927b.m110647a(C29638a.m109622a().getLoginDependency(), str);
    }

    @Override // com.larksuite.component.webview.container.dto.AbstractInjectWebViewDelegate, com.ss.android.lark.browser.biz.messenger.viewdelegate.MessengerWebViewDelegate
    /* renamed from: a */
    public boolean mo50992a(Fragment fragment, WebView webView) {
        AbstractC24168k kVar;
        try {
            boolean booleanValue = ((Boolean) mo91995c("KEY_INTERCEPT_BACK")).booleanValue();
            if (!booleanValue && !TextUtils.isEmpty(this.f74465b) && (kVar = this.f74470g) != null) {
                kVar.mo86736a("h5PagePhysicalBack", null);
            }
            Log.m165389i("DybirdWebViewDelegate", "onInterceptBack value is " + booleanValue);
            return booleanValue;
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.larksuite.component.webview.container.dto.AbstractInjectWebViewDelegate, com.larksuite.component.webview.container.dto.IWebContainerContract.IWebContainerView.AbstractC25824a
    /* renamed from: a */
    public void mo50976a(WebView webView, int i, String str, String str2) {
        if (!TextUtils.isEmpty(m110076a(str2))) {
            C29925a.m110634b(str2);
        }
    }

    @Override // com.larksuite.component.webview.container.dto.AbstractInjectWebViewDelegate
    /* renamed from: a */
    public void mo91872a(int i, int i2, int i3, int i4) {
        int i5;
        if (!TextUtils.isEmpty(this.f74466c) && this.f74466c.equals(H5Param.TitleBackgroundTranslate.auto.name())) {
            IWebContainerContract.IWebContainerView.IWebContainerTitleBar b = mo91999w().mo67308b();
            if (i2 == 0) {
                i5 = 0;
            } else {
                i5 = Math.min(i2, 255);
            }
            b.mo67324b(i5);
        }
    }
}
