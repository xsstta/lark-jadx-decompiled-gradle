package com.bytedance.ee.bear.drive.view.preview.wps;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.bytedance.ee.bear.appsetting.C4211a;
import com.bytedance.ee.bear.basesdk.services.C4511g;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.drive.biz.comment.area.CommentRectF;
import com.bytedance.ee.bear.drive.biz.preview.show.C6712a;
import com.bytedance.ee.bear.drive.common.C6892d;
import com.bytedance.ee.bear.drive.view.preview.AbstractC7256c;
import com.bytedance.ee.bear.drive.view.preview.document.BaseWebPreviewView;
import com.bytedance.ee.bear.drive.view.preview.wps.WpsAccessTokenPuller;
import com.bytedance.ee.bear.drive.view.preview.wps.WpsGrayStrategyPuller;
import com.bytedance.ee.bear.drive.view.preview.wps.WpsView;
import com.bytedance.ee.bear.drive.view.preview.wrapper.AbstractC7549a;
import com.bytedance.ee.bear.drive.view.preview.wrapper.C7553d;
import com.bytedance.ee.bear.drive.view.preview.wrapper.ViewOwner;
import com.bytedance.ee.bear.drive.view.widget.C7571d;
import com.bytedance.ee.bear.route.AbstractC10740f;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p700c.C13598b;
import com.bytedance.ee.util.p718t.C13742g;
import com.bytedance.frameworks.baselib.network.http.cronet.impl.C13998f;
import io.reactivex.AbstractC68307f;
import io.reactivex.disposables.C68289a;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import org.json.JSONObject;
import org.koin.java.KoinJavaComponent;

public class WpsView extends BaseWebPreviewView implements AbstractC7549a {

    /* renamed from: e */
    public AbstractC7256c f20304e;

    /* renamed from: f */
    boolean f20305f = true;

    /* renamed from: g */
    public long f20306g;

    /* renamed from: h */
    public AbstractC7522a f20307h;

    /* renamed from: i */
    String f20308i;

    /* renamed from: j */
    C7521a f20309j;

    /* renamed from: k */
    boolean f20310k;

    /* renamed from: l */
    String f20311l = "";

    /* renamed from: m */
    boolean f20312m;

    /* renamed from: n */
    boolean f20313n;

    /* renamed from: o */
    boolean f20314o;

    /* renamed from: p */
    boolean f20315p;

    /* renamed from: q */
    public AbstractC7523b f20316q;

    /* renamed from: r */
    public C7529g f20317r;

    /* renamed from: s */
    public Runnable f20318s = new Runnable() {
        /* class com.bytedance.ee.bear.drive.view.preview.wps.WpsView.RunnableC75181 */

        public void run() {
            if (WpsView.this.f20310k) {
                if (WpsView.this.f20305f && WpsView.this.f20304e != null) {
                    WpsView.this.f20304e.mo26118a("wps");
                    WpsView.this.f20307h.mo29390d();
                }
                C6712a.m26464b(WpsView.this.f19469d, WpsView.this);
                WpsView.this.f20305f = false;
                return;
            }
            if (WpsView.this.f20304e != null) {
                WpsView.this.f20304e.mo26119a("wps", new Throwable(WpsView.this.f20311l));
            }
            C6712a.m26465c(WpsView.this.f19469d, WpsView.this);
            WpsView.this.f20307h.mo29389c();
        }
    };

    /* renamed from: t */
    private ArrayList<CommentRectF> f20319t;

    /* renamed from: u */
    private C7527e f20320u;

    /* renamed from: v */
    private C10917c f20321v;

    /* renamed from: w */
    private Object f20322w;

    /* renamed from: a */
    public void mo29359a(int i) {
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.wrapper.AbstractC7549a, com.bytedance.ee.bear.drive.view.preview.document.BaseWebPreviewView
    public String getCommentQuote() {
        return null;
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.wrapper.AbstractC7549a, com.bytedance.ee.bear.drive.view.preview.document.BaseWebPreviewView
    public View getView() {
        return this;
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.wrapper.AbstractC7549a, com.bytedance.ee.bear.drive.view.preview.document.BaseWebPreviewView
    public CommentRectF hideCreateComment() {
        return null;
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.wrapper.AbstractC7549a, com.bytedance.ee.bear.drive.view.preview.document.BaseWebPreviewView
    public boolean onAreaClick() {
        return false;
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.wrapper.AbstractC7549a
    public boolean onBackPressed() {
        return false;
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.wrapper.AbstractC7549a, com.bytedance.ee.bear.drive.view.preview.document.BaseWebPreviewView
    public void onCommentInputPanelClose() {
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.wrapper.AbstractC7549a, com.bytedance.ee.bear.drive.view.preview.document.BaseWebPreviewView
    public void onCommentListPanelClose() {
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.wrapper.AbstractC7549a, com.bytedance.ee.bear.drive.view.preview.document.BaseWebPreviewView
    public void showThumbnailPreview() {
    }

    /* renamed from: com.bytedance.ee.bear.drive.view.preview.wps.WpsView$a */
    public static class C7521a {

        /* renamed from: a */
        C7553d f20326a;

        /* renamed from: b */
        int f20327b = 1;

        /* renamed from: c */
        boolean f20328c;

        /* renamed from: a */
        public C7553d mo29380a() {
            return this.f20326a;
        }

        /* renamed from: e */
        public boolean mo29384e() {
            return this.f20328c;
        }

        /* renamed from: b */
        public void mo29381b() {
            if (this.f20327b == 2) {
                this.f20327b = 1;
            }
        }

        /* renamed from: c */
        public void mo29382c() {
            if (this.f20327b == 1) {
                this.f20327b = 2;
            }
        }

        /* renamed from: d */
        public boolean mo29383d() {
            if (this.f20327b == 2) {
                return true;
            }
            return false;
        }

        public C7521a(C7553d dVar) {
            this.f20326a = dVar;
        }
    }

    private String getWpsIframeUrl() {
        return this.f20307h.mo29388b();
    }

    private Object getJavascriptInterface() {
        if (this.f20322w == null) {
            this.f20322w = new Object() {
                /* class com.bytedance.ee.bear.drive.view.preview.wps.WpsView.C75203 */

                @JavascriptInterface
                public void getAuthToken() {
                    C13479a.m54764b("WpsWebView", "getAuthToken called");
                    WpsView wpsView = WpsView.this;
                    wpsView.f19467b = wpsView.mo29357a().mo237985a(C11678b.m48481e()).mo238001b(new Consumer() {
                        /* class com.bytedance.ee.bear.drive.view.preview.wps.$$Lambda$WpsView$3$UjONmuw8u93YdWezK1ViJtGxwlk */

                        @Override // io.reactivex.functions.Consumer
                        public final void accept(Object obj) {
                            WpsView.C75203.this.m30101a((WpsView.C75203) ((String) obj));
                        }
                    }, new Consumer() {
                        /* class com.bytedance.ee.bear.drive.view.preview.wps.$$Lambda$WpsView$3$QzFEG_Z_pPy4s47NzsgbkcuGMpI */

                        @Override // io.reactivex.functions.Consumer
                        public final void accept(Object obj) {
                            WpsView.C75203.this.m30103a((WpsView.C75203) ((Throwable) obj));
                        }
                    });
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public /* synthetic */ void m30101a(String str) throws Exception {
                    C13479a.m54764b("WpsWebView", "refreshAuthToken success");
                    WpsView.this.f19466a.evaluateJavascript(str, null);
                }

                /* access modifiers changed from: private */
                /* renamed from: c */
                public /* synthetic */ void m30106c(Throwable th) throws Exception {
                    C13479a.m54759a("WpsWebView", "getInitialData error=", th);
                    WpsView.this.f20307h.mo29387a(th);
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public /* synthetic */ void m30103a(Throwable th) throws Exception {
                    C13479a.m54759a("WpsWebView", "refreshAuthToken error=", th);
                    WpsView.this.f20307h.mo29387a(th);
                }

                @JavascriptInterface
                public void printIframeLog(String str) {
                    C13479a.m54772d("WpsWebView", "printIframeLog = " + str);
                }

                /* access modifiers changed from: private */
                /* renamed from: b */
                public /* synthetic */ void m30104b(String str) throws Exception {
                    C13479a.m54764b("WpsWebView", "getInitialData success ");
                    if (WpsView.this.f20316q != null) {
                        WpsView.this.f20316q.mo29395b();
                        WpsView.this.f20316q.mo29394a("wps_render");
                    }
                    WpsView.this.f19466a.evaluateJavascript(str, null);
                }

                @JavascriptInterface
                public void getInitialData(String str) {
                    C13479a.m54764b("WpsWebView", "getInitialData called");
                    if (WpsView.this.f20316q != null) {
                        WpsView.this.f20316q.mo29394a("wps_getInitial_data");
                    }
                    ((C68289a) WpsView.this.f19467b).mo237937a(WpsView.this.getInitialDataImp().mo237985a(C11678b.m48481e()).mo238001b(new Consumer() {
                        /* class com.bytedance.ee.bear.drive.view.preview.wps.$$Lambda$WpsView$3$nnGnktNxHtxIjnN_ioXxo60CeM */

                        @Override // io.reactivex.functions.Consumer
                        public final void accept(Object obj) {
                            WpsView.C75203.this.m30104b((WpsView.C75203) ((String) obj));
                        }
                    }, new Consumer() {
                        /* class com.bytedance.ee.bear.drive.view.preview.wps.$$Lambda$WpsView$3$67Q2k4LfFbVuUUdjGKXj8PQXV_k */

                        @Override // io.reactivex.functions.Consumer
                        public final void accept(Object obj) {
                            WpsView.C75203.this.m30106c((Throwable) obj);
                        }
                    }));
                }

                @JavascriptInterface
                public void onHyperLinkOpen(String str) {
                    try {
                        String optString = new JSONObject(str).optString("linkUrl");
                        C13479a.m54764b("WpsWebView", "onHyperLinkOpen() url=" + C13598b.m55197d(optString));
                        ((AbstractC10740f) KoinJavaComponent.m268610a(AbstractC10740f.class)).mo17292a(optString);
                    } catch (Exception e) {
                        C13479a.m54759a("WpsWebView", "onHyperLinkOpen() error", e);
                    }
                }

                @JavascriptInterface
                public void wpsError(String str) {
                    C13479a.m54758a("WpsWebView", "wpsError = " + str);
                    long uptimeMillis = SystemClock.uptimeMillis();
                    if (uptimeMillis - WpsView.this.f20306g >= 50) {
                        WpsView.this.f20306g = uptimeMillis;
                        C13742g.m55710c(WpsView.this.f20318s);
                        WpsView.this.f20317r.getErrorLiveData().mo5926a("true");
                        WpsView.this.f19467b = AbstractC68307f.m265083a((Object) true).mo237985a(C11678b.m48481e()).mo238001b(new Consumer(str) {
                            /* class com.bytedance.ee.bear.drive.view.preview.wps.$$Lambda$WpsView$3$F578zRvZYkfglu0CkauwTdZ_T8 */
                            public final /* synthetic */ String f$1;

                            {
                                this.f$1 = r2;
                            }

                            @Override // io.reactivex.functions.Consumer
                            public final void accept(Object obj) {
                                WpsView.C75203.this.m30102a(this.f$1, (Boolean) obj);
                            }
                        }, $$Lambda$WpsView$3$ybhKLQezYCWRtEURwUsHnhDdg.INSTANCE);
                    }
                }

                @JavascriptInterface
                public void wpsLoadStatus(String str) {
                    boolean z;
                    try {
                        z = new JSONObject(str).getBoolean("isSuccess");
                    } catch (Exception e) {
                        C13479a.m54759a("WpsWebView", "parse wpsLoadStatus fail. ", e);
                        z = false;
                    }
                    if (z) {
                        if (WpsView.this.f20316q != null) {
                            WpsView.this.f20316q.mo29396c();
                        }
                        WpsView.this.f20317r.getSuccessLiveData().mo5926a("true");
                    }
                    C13479a.m54764b("WpsWebView", "wpsLoadStatus = " + str);
                    WpsView.this.f20310k = z;
                    WpsView.this.f20311l = str;
                    C13742g.m55710c(WpsView.this.f20318s);
                    C13742g.m55706a(WpsView.this.f20318s, 50);
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public /* synthetic */ void m30102a(String str, Boolean bool) throws Exception {
                    C13479a.m54764b("WpsWebView", "wpsError callback");
                    if (WpsView.this.f20304e != null) {
                        WpsView.this.f20304e.mo26119a("wps", new Throwable(str));
                    }
                    C6712a.m26465c(WpsView.this.f19469d, WpsView.this);
                    WpsView.this.f20307h.mo29389c();
                }
            };
        }
        return this.f20322w;
    }

    private void getGrayStrategy() {
        ((C68289a) this.f19467b).mo237937a(WpsGrayStrategyPuller.m30084a((NetService) KoinJavaComponent.m268610a(NetService.class)).mo238001b(new Consumer() {
            /* class com.bytedance.ee.bear.drive.view.preview.wps.$$Lambda$WpsView$3cRSC890plt2zT1gZ_ZsZ6WKuHs */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                WpsView.this.m30089a((WpsView) ((WpsGrayStrategyPuller.Result) obj));
            }
        }, $$Lambda$WpsView$KTPVYRAuD8vRN7x35eIbMwLbu98.INSTANCE));
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.drive.view.preview.document.BaseWebPreviewView
    public void onDetachedFromWindow() {
        if (this.f19469d == null || !this.f19469d.isBlockViewChanging()) {
            this.f20307h.mo29391e();
            C13742g.m55710c(this.f20318s);
            super.onDetachedFromWindow();
        }
    }

    public String getLocal() {
        if (getContext().getResources().getConfiguration().locale.getLanguage().equals(Locale.CHINESE.getLanguage())) {
            return "zh-CN";
        }
        return "en-US";
    }

    public String getType() {
        String m = this.f20309j.mo29380a().mo29494m();
        if (C6892d.m27249g(m)) {
            return "p";
        }
        if (C6892d.m27246d(m)) {
            return "w";
        }
        if (C6892d.m27247e(m) || C6892d.m27248f(m)) {
            return "s";
        }
        return C13998f.f36682a;
    }

    public String getWpsDomain() {
        int t = C4511g.m18594d().mo17370t();
        C13479a.m54764b("WpsWebView", "getWpsDomain env = " + t);
        if (t == 6 || t == 2) {
            return "box-boe.bytedance.net";
        }
        return (String) C4211a.m17514a().mo16533a("drive_wps_domain", "weboffice.feishu-3rd-party-services.com");
    }

    public AbstractC68307f<String> getInitialDataImp() {
        WpsAccessTokenPuller.Params params;
        if (!TextUtils.isEmpty(this.f20309j.mo29380a().mo29498q())) {
            params = new WpsAccessTokenPuller.DriveSdkParams(this.f20309j.mo29380a().mo29496o(), this.f20309j.mo29380a().mo29479b(), this.f20309j.mo29380a().mo29498q(), this.f20307h.mo29392f());
        } else {
            params = new WpsAccessTokenPuller.Params(this.f20309j.mo29380a().mo29479b(), this.f20309j.mo29380a().mo29499r(), this.f20307h.mo29392f());
        }
        return WpsAccessTokenPuller.m30082a((NetService) KoinJavaComponent.m268610a(NetService.class), params).mo237985a(C11678b.m48478b()).mo238020d(new Function() {
            /* class com.bytedance.ee.bear.drive.view.preview.wps.$$Lambda$WpsView$m3ehovR0pvJ_ua_6KjYwy4kRPmU */

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return WpsView.this.m30090b((WpsAccessTokenPuller.Result) obj);
            }
        });
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.wrapper.AbstractC7549a
    public void show() {
        if (TextUtils.isEmpty(this.f20308i)) {
            getGrayStrategy();
        }
        getWebView().setVerticalScrollBarEnabled(false);
        getWebView().setHorizontalScrollBarEnabled(false);
        C7521a aVar = this.f20309j;
        if (aVar == null || aVar.mo29380a() == null) {
            C13479a.m54758a("WpsWebView", "WpsView show fail because mWpsViewEntity= " + this.f20309j + ", fileModel= " + this.f20309j.mo29380a());
            return;
        }
        m30091b();
    }

    /* renamed from: b */
    private void m30091b() {
        C13479a.m54764b("WpsWebView", "show, token = " + C13598b.m55197d(this.f20309j.mo29380a().mo29479b()));
        AbstractC7256c cVar = this.f20304e;
        if (cVar != null) {
            cVar.mo26117a();
        }
        System.currentTimeMillis();
        C6712a.m26463a(this.f19469d, this);
        this.f19466a.addJavascriptInterface(getJavascriptInterface(), "jsObj");
        this.f19466a.mo29642a(new C7571d() {
            /* class com.bytedance.ee.bear.drive.view.preview.wps.WpsView.C75192 */

            @Override // com.bytedance.ee.bear.drive.view.widget.C7571d
            /* renamed from: a */
            public void mo29373a(WebView webView, String str) {
                super.mo29373a(webView, str);
                if (WpsView.this.f20316q != null) {
                    WpsView.this.f20316q.mo29393a();
                }
                C13479a.m54764b("WpsWebView", "showDocuments loadRes time ");
            }
        });
        AbstractC7523b bVar = this.f20316q;
        if (bVar != null) {
            bVar.mo29394a("wps_load_template");
        }
        this.f19466a.loadUrl("file:///android_asset/wps/wps.html");
    }

    /* renamed from: a */
    public AbstractC68307f<String> mo29357a() {
        WpsAccessTokenPuller.Params params;
        if (!TextUtils.isEmpty(this.f20309j.mo29380a().mo29498q())) {
            params = new WpsAccessTokenPuller.DriveSdkParams(this.f20309j.mo29380a().mo29496o(), this.f20309j.mo29380a().mo29479b(), this.f20309j.mo29380a().mo29498q(), this.f20307h.mo29392f());
        } else {
            params = new WpsAccessTokenPuller.Params(this.f20309j.mo29380a().mo29479b(), this.f20309j.mo29380a().mo29499r(), this.f20307h.mo29392f());
        }
        return WpsAccessTokenPuller.m30082a((NetService) KoinJavaComponent.m268610a(NetService.class), params).mo238020d(new Function() {
            /* class com.bytedance.ee.bear.drive.view.preview.wps.$$Lambda$WpsView$GaYkB5qwyyI0HiGfnuW3EL0BDJc */

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return WpsView.this.m30087a((WpsAccessTokenPuller.Result) obj);
            }
        });
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.AbstractC7262d, com.bytedance.ee.bear.drive.view.preview.document.BaseWebPreviewView
    public void setOnShowViewTrackEventCallback(AbstractC7256c cVar) {
        this.f20304e = cVar;
    }

    public void setServiceContext(C10917c cVar) {
        this.f20321v = cVar;
    }

    public void setWpsLoadState(AbstractC7523b bVar) {
        this.f20316q = bVar;
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.wrapper.AbstractC7549a, com.bytedance.ee.bear.drive.view.preview.document.BaseWebPreviewView
    public void updateComment(ArrayList<CommentRectF> arrayList) {
        this.f20319t = arrayList;
    }

    /* renamed from: a */
    public void mo29360a(C7521a aVar) {
        this.f20309j = aVar;
    }

    public void setOnFullScreenSwitchListener(Runnable runnable) {
        this.f20320u.mo29403a(runnable);
    }

    /* renamed from: a */
    private void m30088a(Context context) {
        this.f20320u = new C7527e();
        this.f19467b = new C68289a();
    }

    /* renamed from: b */
    public void mo29363b(boolean z) {
        AbstractC7522a aVar;
        if (z) {
            aVar = new C7526d(this);
        } else {
            aVar = new C7528f(this);
        }
        this.f20307h = aVar;
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        this.f20320u.mo29402a(motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    public WpsView(Context context) {
        super(context);
        m30088a(context);
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.wrapper.AbstractC7549a, com.bytedance.ee.bear.drive.view.preview.document.BaseWebPreviewView
    public void onSetup(ViewOwner viewOwner) {
        super.onSetup(viewOwner);
        this.f20307h.mo29386a(viewOwner);
        this.f20317r = (C7529g) viewOwner.viewModel(C7529g.class);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ String m30087a(WpsAccessTokenPuller.Result result) throws Exception {
        com.alibaba.fastjson.JSONObject jSONObject = new com.alibaba.fastjson.JSONObject();
        com.alibaba.fastjson.JSONObject jSONObject2 = new com.alibaba.fastjson.JSONObject();
        jSONObject2.put("token", (Object) result.token);
        jSONObject2.put("expire", (Object) Long.valueOf(result.expire));
        jSONObject.put("authToken", (Object) jSONObject2);
        return String.format("javascript:triggerJSEvent('%1$s')", mo29358a("refreshAuthToken", jSONObject));
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.wrapper.AbstractC7549a, com.bytedance.ee.bear.drive.view.preview.document.BaseWebPreviewView
    public void showSelectedComment(String str) {
        ArrayList<CommentRectF> arrayList = this.f20319t;
        if (arrayList != null) {
            Iterator<CommentRectF> it = arrayList.iterator();
            while (it.hasNext()) {
                CommentRectF next = it.next();
                if (TextUtils.equals(next.mo25555a(), str)) {
                    mo29359a(next.mo25565d());
                    return;
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m30089a(WpsGrayStrategyPuller.Result result) throws Exception {
        String str;
        if (result != null) {
            str = result.env;
        } else {
            str = null;
        }
        this.f20308i = str;
        C13479a.m54764b("WpsWebView", "grayStrategy = " + this.f20308i);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ String m30090b(WpsAccessTokenPuller.Result result) throws Exception {
        com.alibaba.fastjson.JSONObject jSONObject = new com.alibaba.fastjson.JSONObject();
        jSONObject.put("token", (Object) result.token);
        jSONObject.put("expire", (Object) Long.valueOf(result.expire));
        com.alibaba.fastjson.JSONObject jSONObject2 = new com.alibaba.fastjson.JSONObject();
        jSONObject2.put("authToken", (Object) jSONObject);
        jSONObject2.put("wpsOptions", this.f20307h.mo29385a());
        jSONObject2.put("wpsIframeUrl", (Object) getWpsIframeUrl());
        return String.format("javascript:triggerJSEvent('%1$s')", mo29358a("setInitialData", jSONObject2));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo29361a(Throwable th) {
        AbstractC7256c cVar = this.f20304e;
        if (cVar != null) {
            cVar.mo26119a("wps", th);
        }
        C6712a.m26465c(this.f19469d, this);
    }

    /* renamed from: a */
    public String mo29358a(String str, com.alibaba.fastjson.JSONObject jSONObject) {
        com.alibaba.fastjson.JSONObject jSONObject2 = new com.alibaba.fastjson.JSONObject();
        jSONObject2.put("key", (Object) str);
        jSONObject2.put("value", (Object) jSONObject);
        return Base64.encodeToString(jSONObject2.toJSONString().getBytes(), 2);
    }

    public WpsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m30088a(context);
    }

    public WpsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m30088a(context);
    }

    /* renamed from: a */
    public void mo29362a(boolean z, boolean z2, boolean z3, boolean z4) {
        this.f20312m = z;
        this.f20313n = z2;
        this.f20314o = z3;
        this.f20315p = z4;
    }
}
