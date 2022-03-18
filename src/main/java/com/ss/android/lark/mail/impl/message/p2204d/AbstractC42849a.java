package com.ss.android.lark.mail.impl.message.p2204d;

import android.content.Context;
import android.text.TextUtils;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.C41816b;
import com.ss.android.lark.mail.impl.entity.C42099l;
import com.ss.android.lark.mail.impl.message.template.C43089z;
import com.ss.android.lark.mail.impl.message.view.p2212c.AbstractC43201b;
import com.ss.android.lark.mail.impl.message.view.p2212c.C43194a;
import com.ss.android.lark.mail.impl.message.view.p2212c.p2213a.C43199a;
import com.ss.android.lark.mail.impl.p2171h.C42187a;
import com.ss.android.lark.mail.impl.p2171h.p2173b.C42299o;
import com.ss.android.lark.mail.impl.p2171h.p2175c.C42344d;
import com.ss.android.lark.mail.impl.uiframework.view.webview.AbstractC43719c;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.mail.impl.message.d.a */
public abstract class AbstractC42849a implements C43199a.AbstractC43200a {

    /* renamed from: a */
    protected boolean f109082a;

    /* renamed from: b */
    protected boolean f109083b;

    /* renamed from: c */
    protected JSONObject f109084c;

    /* renamed from: d */
    protected C42851b f109085d = mo153798a();

    /* renamed from: e */
    private AbstractC42850a f109086e;

    /* renamed from: f */
    private String f109087f = "";

    /* renamed from: g */
    private final String f109088g = "domReady";

    /* renamed from: h */
    private String f109089h;

    /* renamed from: i */
    private int f109090i;

    /* renamed from: com.ss.android.lark.mail.impl.message.d.a$a */
    public interface AbstractC42850a {
        /* renamed from: a */
        void mo153808a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract C42851b mo153798a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public JSONObject mo153804b() {
        return this.f109084c;
    }

    /* renamed from: d */
    public boolean mo153806d() {
        return this.f109082a;
    }

    /* renamed from: e */
    public boolean mo153807e() {
        return this.f109083b;
    }

    /* renamed from: c */
    public void mo153805c() {
        Log.m165389i("BaseAsynWebViewRender", "testAsynRender resetVar");
        this.f109086e = null;
        this.f109082a = false;
        this.f109083b = false;
        this.f109084c = null;
    }

    /* renamed from: a */
    public void mo153799a(AbstractC42850a aVar) {
        this.f109086e = aVar;
    }

    /* renamed from: a */
    public void mo153800a(String str) {
        this.f109085d.mo153825i(str);
        mo153805c();
    }

    @Override // com.ss.android.lark.mail.impl.message.view.p2212c.p2213a.C43199a.AbstractC43200a
    /* renamed from: a */
    public void mo153803a(String str, JSONObject jSONObject) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1945522772:
                if (str.equals("imageLoadingOnScreen")) {
                    c = 0;
                    break;
                }
                break;
            case 107332:
                if (str.equals("log")) {
                    c = 1;
                    break;
                }
                break;
            case 110621003:
                if (str.equals("track")) {
                    c = 2;
                    break;
                }
                break;
            case 398622220:
                if (str.equals("checkUrls")) {
                    c = 3;
                    break;
                }
                break;
            case 1115446657:
                if (str.equals("domReady")) {
                    c = 4;
                    break;
                }
                break;
            case 1569900877:
                if (str.equals("imageStartLoad")) {
                    c = 5;
                    break;
                }
                break;
            case 2054169760:
                if (str.equals("imageOnLoad")) {
                    c = 6;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                String optString = jSONObject.optString("src");
                if (!TextUtils.isEmpty(optString)) {
                    ((C42299o) C42344d.m169092a(C42299o.class, C41816b.m166115a().mo150132b(), optString)).mo152425m();
                    return;
                }
                return;
            case 1:
                Log.m165389i("BaseAsynWebViewRender", "handleJsPrompt log:" + jSONObject.optString("content"));
                return;
            case 2:
                if (jSONObject != null) {
                    C42187a.m168507b(jSONObject.optString("event"), jSONObject.optJSONObject("params"));
                    return;
                }
                return;
            case 3:
                Log.m165389i("BaseAsynWebViewRender", "testAsynRender onHandleJsCallback check urls");
                this.f109084c = jSONObject;
                return;
            case 4:
                Log.m165389i("BaseAsynWebViewRender", "testAsynRender ==DOM_READY==");
                this.f109082a = true;
                C42879j.m170799a().mo153883g(this.f109087f);
                AbstractC42850a aVar = this.f109086e;
                if (aVar != null) {
                    aVar.mo153808a();
                    return;
                }
                return;
            case 5:
                String optString2 = jSONObject.optString("src");
                if (!TextUtils.isEmpty(optString2)) {
                    ((C42299o) C42344d.m169092a(C42299o.class, C41816b.m166115a().mo150132b(), optString2)).mo152380b("cache");
                    ((C42299o) C42344d.m169092a(C42299o.class, C41816b.m166115a().mo150132b(), optString2)).mo152422a(jSONObject.optLong("timestamp", 0), optString2.startsWith("cid"), true, this.f109090i, this.f109089h);
                    if (optString2.startsWith("http")) {
                        ((C42299o) C42344d.m169092a(C42299o.class, C41816b.m166115a().mo150132b(), optString2)).mo152368a();
                        return;
                    }
                    return;
                }
                return;
            case 6:
                String optString3 = jSONObject.optString("src");
                if (!TextUtils.isEmpty(optString3)) {
                    ((C42299o) C42344d.m169092a(C42299o.class, C41816b.m166115a().mo150132b(), optString3)).mo152421a(jSONObject.optLong("timestamp", 0));
                    ((C42299o) C42344d.m169092a(C42299o.class, C41816b.m166115a().mo150132b(), optString3)).mo152424j("success");
                    return;
                }
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    public void mo153801a(String str, Context context, String str2) {
        mo153805c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo153802a(String str, String str2, C42099l lVar, Context context, String str3) {
        Log.m165389i("BaseAsynWebViewRender", "testAsynRender doRenderWebView");
        this.f109089h = str3;
        this.f109090i = lVar.mo151992i() ? 1 : 0;
        this.f109087f = str;
        this.f109083b = true;
        C43194a b = C42859c.m170753a().mo153837b(context);
        b.mo154599a((AbstractC43719c) null, (AbstractC43201b) null);
        b.onResume();
        b.mo154601a(lVar.mo151973a(), str);
        String b2 = C43089z.m171291a().mo154274b();
        b.setWebJsPromptListener(this);
        C42879j.m170799a().mo153885h(str);
        b.loadDataWithBaseURL(b2, str2, "text/html; charset=UTF-8", null, null);
    }
}
