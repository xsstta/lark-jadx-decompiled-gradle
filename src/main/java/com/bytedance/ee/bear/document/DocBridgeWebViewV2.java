package com.bytedance.ee.bear.document;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.webkit.ConsoleMessage;
import android.webkit.ValueCallback;
import android.webkit.WebBackForwardList;
import android.webkit.WebChromeClient;
import android.webkit.WebHistoryItem;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LiveData;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.appsetting.C4211a;
import com.bytedance.ee.bear.basesdk.services.C4511g;
import com.bytedance.ee.bear.browser.AbstractC4931i;
import com.bytedance.ee.bear.browser.C4920c;
import com.bytedance.ee.bear.browser.C4921d;
import com.bytedance.ee.bear.browser.WebViewV2;
import com.bytedance.ee.bear.contract.AbstractC5089af;
import com.bytedance.ee.bear.contract.AbstractC5233x;
import com.bytedance.ee.bear.contract.AbstractC5238z;
import com.bytedance.ee.bear.contract.AccountService;
import com.bytedance.ee.bear.contract.C5084ad;
import com.bytedance.ee.bear.contract.C5102ai;
import com.bytedance.ee.bear.contract.C5234y;
import com.bytedance.ee.bear.contract.ConnectionService;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.contract.al;
import com.bytedance.ee.bear.contract.an;
import com.bytedance.ee.bear.doc.resupdate.AbstractC5469i;
import com.bytedance.ee.bear.doc.resupdate.ResourceCallback;
import com.bytedance.ee.bear.document.DocBridgeWebViewV2;
import com.bytedance.ee.bear.document.bridgestatus.AbstractC5678b;
import com.bytedance.ee.bear.document.bridgestatus.BridgeReadyModel;
import com.bytedance.ee.bear.document.bridgestatus.C5677a;
import com.bytedance.ee.bear.document.bridgestatus.C5679c;
import com.bytedance.ee.bear.document.bridgestatus.C5680d;
import com.bytedance.ee.bear.document.fail.DocException;
import com.bytedance.ee.bear.document.multitask.C5886b;
import com.bytedance.ee.bear.document.multitask.ScrollData;
import com.bytedance.ee.bear.document.offline.C5890a;
import com.bytedance.ee.bear.document.offline.p318e.C5920b;
import com.bytedance.ee.bear.document.reloadwebview.C6083a;
import com.bytedance.ee.bear.document.rendergone.AbstractC6088b;
import com.bytedance.ee.bear.document.security.SecurityUtils;
import com.bytedance.ee.bear.document.statistics.SendEventCallback;
import com.bytedance.ee.bear.document.statistics.SendEventHandler;
import com.bytedance.ee.bear.domain.BearUrl;
import com.bytedance.ee.bear.domain.C6313i;
import com.bytedance.ee.bear.facade.common.widget.NoNetworkView;
import com.bytedance.ee.bear.jsbridge.AbstractC7945d;
import com.bytedance.ee.bear.jsbridge.AbstractC7947h;
import com.bytedance.ee.bear.jsbridge.BridgeWebViewV2;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.persistence.PersistenceSharedPreference;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.larkwebview.base.AbstractC13402a;
import com.bytedance.ee.larkwebview.base.C13404c;
import com.bytedance.ee.larkwebview.base.LarkWebView;
import com.bytedance.ee.larkwebview.monitor.webview.BizType;
import com.bytedance.ee.larkwebview.service.C13477l;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.common.C13606d;
import com.bytedance.ee.util.common.C13608f;
import com.bytedance.ee.util.io.C13681h;
import com.bytedance.ee.util.p700c.C13598b;
import com.bytedance.ee.util.p704g.C13665a;
import com.bytedance.ee.util.p718t.C13746i;
import com.bytedance.ee.util.p718t.C13748k;
import com.bytedance.ee.util.p718t.C13749l;
import com.bytedance.lynx.webview.extension.TTWebViewExtension;
import com.bytedance.lynx.webview.glue.IWebViewExtension;
import com.bytedance.lynx.webview.glue.TTRenderProcessGoneDetail;
import com.bytedance.lynx.webview.internal.C20011y;
import com.larksuite.framework.utils.C26326z;
import com.larksuite.suite.R;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import io.reactivex.AbstractC68307f;
import io.reactivex.functions.Consumer;
import java.io.Serializable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import org.koin.java.KoinJavaComponent;

public class DocBridgeWebViewV2 extends WebViewV2 implements SendEventCallback {

    /* renamed from: R */
    private static int f15841R;
    private static IWebViewExtension.RenderProcessGoneListener al = $$Lambda$DocBridgeWebViewV2$rvL5SogoCD7E4d4ckYDbSyIS8.INSTANCE;

    /* renamed from: j */
    public static long f15842j;

    /* renamed from: k */
    public static long f15843k;

    /* renamed from: A */
    private al f15844A;

    /* renamed from: B */
    private AbstractC5238z f15845B;

    /* renamed from: C */
    private Map<String, Boolean> f15846C = new HashMap();

    /* renamed from: D */
    private WeakReference<Fragment> f15847D = new WeakReference<>(null);

    /* renamed from: E */
    private List<C5606d<AbstractC5089af.AbstractC5091b>> f15848E = new CopyOnWriteArrayList();

    /* renamed from: F */
    private String f15849F;

    /* renamed from: G */
    private C5920b f15850G;

    /* renamed from: H */
    private String f15851H;

    /* renamed from: I */
    private String f15852I;

    /* renamed from: J */
    private List<C5606d<AbstractC5605c>> f15853J = new CopyOnWriteArrayList();

    /* renamed from: K */
    private List<AbstractC6088b> f15854K = new CopyOnWriteArrayList();

    /* renamed from: L */
    private String f15855L;

    /* renamed from: M */
    private long f15856M = 0;

    /* renamed from: N */
    private long f15857N = 0;

    /* renamed from: O */
    private int f15858O = 0;

    /* renamed from: P */
    private boolean f15859P = false;

    /* renamed from: Q */
    private boolean f15860Q = false;

    /* renamed from: S */
    private Map<String, Serializable> f15861S = new HashMap();

    /* renamed from: T */
    private C4921d f15862T;

    /* renamed from: U */
    private C4920c f15863U;

    /* renamed from: V */
    private AbstractC5603a f15864V;

    /* renamed from: W */
    private LiveData<ConnectionService.NetworkState> f15865W;
    private C5680d aa;
    private int ab;
    private int ac;
    private boolean ad;
    private boolean ae = true;
    private boolean af = true;
    private Map<Integer, Boolean> ag = new HashMap();
    private AbstractC1178x<ConnectionService.NetworkState> ah = new AbstractC1178x<ConnectionService.NetworkState>() {
        /* class com.bytedance.ee.bear.document.DocBridgeWebViewV2.C55941 */

        /* renamed from: a */
        public void onChanged(ConnectionService.NetworkState networkState) {
            DocBridgeWebViewV2.this.mo22325a(networkState);
        }
    };

    /* renamed from: ai  reason: collision with root package name */
    private AbstractC1178x<Boolean> f175417ai = new AbstractC1178x<Boolean>() {
        /* class com.bytedance.ee.bear.document.DocBridgeWebViewV2.C55974 */

        /* renamed from: a */
        public void onChanged(Boolean bool) {
            String str = DocBridgeWebViewV2.this.f15866b;
            C13479a.m54764b(str, "init========  isVisible: " + bool + "  getmLoadHtmlStartTime: " + DocBridgeWebViewV2.this.getmLoadHtmlStartTime() + "  isReady： " + DocBridgeWebViewV2.this.mo22363j() + "  isAttachedToWindow： " + DocBridgeWebViewV2.this.f15869e);
            if (bool == Boolean.TRUE) {
                C13748k.m55735c(DocBridgeWebViewV2.this.f15874l);
                if (DocBridgeWebViewV2.this.getmLoadHtmlStartTime() <= 0) {
                    return;
                }
                if (DocBridgeWebViewV2.this.f15869e) {
                    if (!DocBridgeWebViewV2.this.mo22363j()) {
                        DocBridgeWebViewV2.this.mo22348e();
                    }
                } else if (DocBridgeWebViewV2.this.mo22363j()) {
                } else {
                    if (System.currentTimeMillis() - DocBridgeWebViewV2.this.getmLoadHtmlStartTime() > 120000) {
                        DocBridgeWebViewV2.this.mo22344d();
                    } else {
                        DocBridgeWebViewV2.this.mo22348e();
                    }
                }
            } else {
                C13748k.m55735c(DocBridgeWebViewV2.this.f15874l);
            }
        }
    };
    private AbstractC1178x<Boolean> aj = new AbstractC1178x<Boolean>() {
        /* class com.bytedance.ee.bear.document.DocBridgeWebViewV2.C55985 */

        /* renamed from: a */
        public void onChanged(Boolean bool) {
            DocBridgeWebViewV2.this.mo22334a(bool.booleanValue());
        }
    };
    private TTWebViewExtension ak;

    /* renamed from: b */
    public String f15866b = "DocBridgeWebViewV2";

    /* renamed from: c */
    public AbstractC5233x f15867c;

    /* renamed from: d */
    public boolean f15868d;

    /* renamed from: e */
    public volatile boolean f15869e;

    /* renamed from: f */
    public BearUrl f15870f;

    /* renamed from: g */
    public String f15871g = C8275a.f22371d.mo32553a();

    /* renamed from: h */
    public boolean f15872h;

    /* renamed from: i */
    public boolean f15873i;

    /* renamed from: l */
    public Runnable f15874l = new Runnable() {
        /* class com.bytedance.ee.bear.document.DocBridgeWebViewV2.RunnableC55996 */

        public void run() {
            String str = DocBridgeWebViewV2.this.f15866b;
            C13479a.m54775e(str, "reloadWebviewRunnable====== isAttachedToWindow: " + DocBridgeWebViewV2.this.f15869e + "  isReady： " + DocBridgeWebViewV2.this.mo22363j() + "   type:  " + DocBridgeWebViewV2.this.f15871g);
            if (DocBridgeWebViewV2.this.f15869e) {
                if (!DocBridgeWebViewV2.this.mo22363j()) {
                    DocBridgeWebViewV2.this.mo22348e();
                }
            } else if (!DocBridgeWebViewV2.this.mo22363j()) {
                DocBridgeWebViewV2.this.mo22344d();
            }
        }
    };

    /* renamed from: n */
    private int f15875n;

    /* renamed from: o */
    private boolean f15876o;

    /* renamed from: p */
    private boolean f15877p;

    /* renamed from: q */
    private PersistenceSharedPreference f15878q;

    /* renamed from: r */
    private C10917c f15879r;

    /* renamed from: y */
    private ConnectionService f15880y;

    /* renamed from: z */
    private an f15881z;

    @Retention(RetentionPolicy.SOURCE)
    public @interface DocStatus {
    }

    /* renamed from: com.bytedance.ee.bear.document.DocBridgeWebViewV2$a */
    public interface AbstractC5603a {
        /* renamed from: a */
        void mo22403a(BridgeReadyModel bridgeReadyModel);
    }

    /* renamed from: com.bytedance.ee.bear.document.DocBridgeWebViewV2$c */
    public interface AbstractC5605c {
        void onScrollChange(View view, int i, int i2, int i3, int i4);
    }

    public BearUrl getBearUrl() {
        return this.f15870f;
    }

    public int getDocStatus() {
        return this.f15858O;
    }

    public C5920b getOfflineEngine() {
        return this.f15850G;
    }

    public Map<Integer, Boolean> getWebViewActiveMap() {
        return this.ag;
    }

    public long getmLoadHtmlStartTime() {
        return this.f15856M;
    }

    public boolean isInEditMode() {
        return this.f15868d;
    }

    /* renamed from: a */
    public AbstractC6295z mo22319a(String str, Lifecycle lifecycle) {
        return new SafeReuseDocumentWebV2(str, lifecycle, this);
    }

    /* renamed from: a */
    public void mo22329a(BearUrl bearUrl, String str) {
        if (bearUrl.f17450e.startsWith("https://") || bearUrl.f17450e.startsWith("http://")) {
            this.f15851H = bearUrl.f17450e;
        } else {
            this.f15851H = "https://" + bearUrl.f17450e;
        }
        this.f15870f = bearUrl;
        this.f15871g = bearUrl.f17446a;
        this.f15852I = str;
        C5890a.m23698a(this.f15870f);
        String str2 = this.f15870f.f17453h;
        if (TextUtils.isEmpty(str2)) {
            str2 = "tab_other";
            this.f15851H = C13681h.m55563b(this.f15851H, "from", str2);
        }
        DocReport.f16153n.mo23016a(str2);
        String str3 = this.f15866b;
        C13479a.m54764b(str3, "injectDocInfo()... doc_from=" + str2 + ", type=" + this.f15871g);
    }

    /* renamed from: a */
    public void mo22335a(boolean z, int i) {
        String str = this.f15866b;
        C13479a.m54775e(str, "onRenderProcessGone====== isAttachedToWindow: " + this.f15869e);
        C13748k.m55732a(new Runnable(z, i) {
            /* class com.bytedance.ee.bear.document.$$Lambda$DocBridgeWebViewV2$pghdS6ymGXUz7sL7w1CG26xn2QA */
            public final /* synthetic */ boolean f$1;
            public final /* synthetic */ int f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void run() {
                DocBridgeWebViewV2.this.m22678b((DocBridgeWebViewV2) this.f$1, (boolean) this.f$2);
            }
        });
    }

    /* renamed from: a */
    public void mo22328a(AbstractC6088b bVar) {
        if (bVar != null && !this.f15854K.contains(bVar)) {
            this.f15854K.add(bVar);
        }
    }

    /* renamed from: a */
    public void mo22323a(WebViewClient webViewClient) {
        this.f15862T.mo19387a(webViewClient);
    }

    /* renamed from: a */
    public void mo22321a(int i, WebViewClient webViewClient) {
        this.f15862T.mo19386a(i, webViewClient);
    }

    /* renamed from: a */
    public void mo22320a(int i, WebChromeClient webChromeClient) {
        this.f15863U.mo19355a(i, webChromeClient);
    }

    /* renamed from: a */
    public void mo22322a(WebChromeClient webChromeClient) {
        this.f15863U.mo19358b(webChromeClient);
    }

    /* renamed from: a */
    public void mo22327a(AbstractC5605c cVar) {
        if (cVar != null) {
            C5606d<AbstractC5605c> dVar = new C5606d<>(cVar);
            if (!this.f15853J.contains(dVar)) {
                this.f15853J.add(dVar);
            }
        }
    }

    @Override // com.bytedance.ee.bear.jsbridge.BridgeWebViewV2
    /* renamed from: a */
    public void mo22332a(String str, JSONObject jSONObject) {
        if (str.startsWith("javascript:")) {
            super.mo30808a(str, jSONObject, true);
            return;
        }
        if (this.f15877p) {
            super.mo22332a(str, jSONObject);
        } else if (this.f15876o) {
            String a = C13665a.m55441a(str, jSONObject);
            HashMap hashMap = new HashMap();
            hashMap.put("Env", "Pre_release");
            super.loadUrl(a, hashMap);
        } else {
            super.mo22332a(str, jSONObject);
        }
        mo22349f();
    }

    /* renamed from: a */
    public void mo22331a(String str) {
        JSONObject parseObject = JSON.parseObject(str);
        String str2 = this.f15866b;
        C13479a.m54764b(str2, "renderCacheHTML(): connected = " + this.ad);
        int i = 50;
        if (!this.ad) {
            i = 50 + getTipLayoutHeight();
        }
        parseObject.put("deviceInfo", JSON.toJSON(new DeviceInfo(this.ab, i)));
        mo22332a("javascript:renderCacheHTML", parseObject);
    }

    /* renamed from: a */
    public void mo22325a(ConnectionService.NetworkState networkState) {
        String str = this.f15866b;
        C13479a.m54764b(str, "updateNetworkState:" + networkState);
        if (networkState == null) {
            C13479a.m54761a(this.f15866b, new IllegalArgumentException("updateNetworkState with null state"));
            return;
        }
        this.ad = networkState.mo20041b();
        if (!mo22364k()) {
            C13479a.m54758a(this.f15866b, "updateNetworkState while JsBridge hasn't ready");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(ShareHitPoint.f121869d, (Object) Integer.valueOf(networkState.mo20040a()));
        jSONObject.put("connected", (Object) Boolean.valueOf(networkState.mo20041b()));
        mo22332a("javascript:window.native.setNetworkState", jSONObject);
    }

    /* renamed from: a */
    public void mo22334a(boolean z) {
        String str = this.f15866b;
        C13479a.m54764b(str, "updateDozeState:" + z);
        if (!mo22364k()) {
            C13479a.m54758a(this.f15866b, "updateDozeState while JsBridge hasn't ready");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("isDoze", (Object) Boolean.valueOf(z));
        mo22332a("javascript:window.native.setDozeState", jSONObject);
    }

    /* renamed from: b */
    public void mo22341b(String str) {
        this.f15855L = str;
        String str2 = this.f15866b;
        C13479a.m54764b(str2, "***reportOpenDoc*** loadUrlRenderIfNeed isRenderOpen = " + this.f15872h + ", mType " + this.f15871g + ", isReady " + mo22364k() + ",isOfflineOpen = " + this.f15873i);
        if (this.f15867c.mo21075a("start_open", "start_time") == null) {
            this.f15867c.mo21078a("start_open", "start_time", String.valueOf(System.currentTimeMillis()));
        }
        if (!this.f15872h || !m22696t()) {
            C13479a.m54764b(this.f15866b, "loadUrlRenderIfNeed() use system load url...");
            DocReport.f16153n.mo23020b(System.currentTimeMillis());
            C13748k.m55734b(new Runnable() {
                /* class com.bytedance.ee.bear.document.$$Lambda$DocBridgeWebViewV2$HYl6bJlyc9rWvnzg9rej5irFIi0 */

                public final void run() {
                    DocBridgeWebViewV2.this.m22660B();
                }
            });
        }
    }

    /* renamed from: a */
    public void mo22324a(Fragment fragment) {
        C13479a.m54764b(this.f15866b, "destoryView()...");
        mo19616a();
        setDocStatus(0);
        C5890a.m23698a((BearUrl) null);
    }

    @Override // com.bytedance.ee.bear.document.statistics.SendEventCallback
    /* renamed from: a */
    public void mo22330a(Integer num, Map<String, String> map) {
        if (num.intValue() == 2) {
            if (map != null) {
                String valueOf = String.valueOf(map.get("stage"));
                if (TextUtils.equals(valueOf, "render_doc")) {
                    DocStateTracker.f16283a.mo23274i();
                } else if (TextUtils.equals(valueOf, "pull_data")) {
                    DocStateTracker.f16283a.mo23272g();
                } else if (TextUtils.equals(valueOf, "render_cache")) {
                    DocStateTracker.f16283a.mo23270e();
                } else {
                    String str = this.f15866b;
                    C13479a.m54775e(str, "onReceiveFrontEvent start stage: " + valueOf);
                }
            }
        } else if (num.intValue() == 3 && map != null) {
            String valueOf2 = String.valueOf(map.get("stage"));
            String valueOf3 = String.valueOf(map.get("docs_result_key"));
            String valueOf4 = String.valueOf(map.get("docs_result_code"));
            if (valueOf3 == null) {
                C13479a.m54758a(this.f15866b, "result key is null");
                valueOf4 = "1000";
                valueOf3 = "other";
            }
            boolean z = TextUtils.equals("other", valueOf3) && TextUtils.equals(valueOf4, "0");
            if (TextUtils.equals(valueOf2, "render_doc")) {
                if (z) {
                    DocStateTracker.f16283a.mo23275j();
                    getRenderCallbacks().mo238001b(new Consumer(map) {
                        /* class com.bytedance.ee.bear.document.$$Lambda$DocBridgeWebViewV2$gR1G1jkj2Si1pNFedjhxYFVtfxw */
                        public final /* synthetic */ Map f$0;

                        {
                            this.f$0 = r1;
                        }

                        @Override // io.reactivex.functions.Consumer
                        public final void accept(Object obj) {
                            ((AbstractC5089af.AbstractC5091b) obj).onRenderSuccess(this.f$0);
                        }
                    }, new Consumer() {
                        /* class com.bytedance.ee.bear.document.$$Lambda$DocBridgeWebViewV2$kjRbEyUpR_bYf_kcF_LgE5G48jw */

                        @Override // io.reactivex.functions.Consumer
                        public final void accept(Object obj) {
                            DocBridgeWebViewV2.this.m22688f((DocBridgeWebViewV2) ((Throwable) obj));
                        }
                    });
                    return;
                }
                getRenderCallbacks().mo238001b(new Consumer(map) {
                    /* class com.bytedance.ee.bear.document.$$Lambda$DocBridgeWebViewV2$UzsZcOpq0z8VUbAESjJiEiSIJok */
                    public final /* synthetic */ Map f$1;

                    {
                        this.f$1 = r2;
                    }

                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj) {
                        ((AbstractC5089af.AbstractC5091b) obj).onRenderFail(DocException.this, this.f$1);
                    }
                }, new Consumer() {
                    /* class com.bytedance.ee.bear.document.$$Lambda$DocBridgeWebViewV2$TuhsSAUl3NqudnvfNINGHWg4WwY */

                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj) {
                        DocBridgeWebViewV2.this.m22685e((DocBridgeWebViewV2) ((Throwable) obj));
                    }
                });
            } else if (TextUtils.equals(valueOf2, "pull_data")) {
                if (z) {
                    DocStateTracker.f16283a.mo23273h();
                } else {
                    getRenderCallbacks().mo238001b(new Consumer(map) {
                        /* class com.bytedance.ee.bear.document.$$Lambda$DocBridgeWebViewV2$U1WUMf1skK4RkYK36_HNRDoBQ9U */
                        public final /* synthetic */ Map f$1;

                        {
                            this.f$1 = r2;
                        }

                        @Override // io.reactivex.functions.Consumer
                        public final void accept(Object obj) {
                            ((AbstractC5089af.AbstractC5091b) obj).onRenderFail(DocException.this, this.f$1);
                        }
                    }, new Consumer() {
                        /* class com.bytedance.ee.bear.document.$$Lambda$DocBridgeWebViewV2$eMAQkKqIfrjAkNOid_SVDBerL3c */

                        @Override // io.reactivex.functions.Consumer
                        public final void accept(Object obj) {
                            DocBridgeWebViewV2.this.m22682d((DocBridgeWebViewV2) ((Throwable) obj));
                        }
                    });
                }
            } else if (TextUtils.equals(valueOf2, "render_cache")) {
                DocStateTracker.f16283a.mo23271f();
            } else {
                String str2 = this.f15866b;
                C13479a.m54775e(str2, "onReceiveFrontEvent end stage: " + valueOf2);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ boolean m22673a(WebView webView, TTRenderProcessGoneDetail tTRenderProcessGoneDetail) {
        if (webView instanceof DocBridgeWebViewV2) {
            ((DocBridgeWebViewV2) webView).mo22335a(tTRenderProcessGoneDetail.didCrash(), tTRenderProcessGoneDetail.rendererPriority());
        }
        if (!tTRenderProcessGoneDetail.didCrash()) {
            C13479a.m54758a("RenderProcessGoneListener", "System killed the WebView======= not crashed");
            return true;
        }
        C13479a.m54758a("RenderProcessGoneListener", "System killed the WebView======= crashed");
        return true;
    }

    /* renamed from: a */
    public void mo22333a(String str, Serializable serializable) {
        String str2 = this.f15866b;
        C13479a.m54764b(str2, "addRenderParams:" + str);
        this.f15861S.put(str, serializable);
    }

    /* renamed from: a */
    public void mo22326a(AbstractC5089af.AbstractC5091b bVar) {
        C5606d<AbstractC5089af.AbstractC5091b> dVar = new C5606d<>(bVar);
        if (!this.f15848E.contains(dVar)) {
            this.f15848E.add(dVar);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.document.DocBridgeWebViewV2$d */
    public static class C5606d<T> {

        /* renamed from: a */
        private WeakReference<T> f15893a;

        /* renamed from: a */
        public T mo22406a() {
            return this.f15893a.get();
        }

        public int hashCode() {
            T t = this.f15893a.get();
            if (t == null) {
                return 0;
            }
            return t.hashCode();
        }

        public C5606d(T t) {
            this.f15893a = new WeakReference<>(t);
        }

        public boolean equals(Object obj) {
            T t;
            T t2 = this.f15893a.get();
            if (t2 != null && (obj instanceof C5606d) && (t = ((C5606d) obj).f15893a.get()) != null && t2 == t) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: v */
    private void m22698v() {
        mo30809a("biz.content.editMode", (AbstractC7945d) new AbstractC7945d<String>() {
            /* class com.bytedance.ee.bear.document.DocBridgeWebViewV2.C56018 */

            /* renamed from: a */
            public void handle(String str, AbstractC7947h hVar) {
                boolean z;
                Boolean bool = (Boolean) JSON.parseObject(str, Boolean.class);
                DocBridgeWebViewV2 docBridgeWebViewV2 = DocBridgeWebViewV2.this;
                if (bool == null) {
                    z = false;
                } else {
                    z = bool.booleanValue();
                }
                docBridgeWebViewV2.f15868d = z;
            }
        });
    }

    /* renamed from: y */
    private void m22701y() {
        this.ab = C13749l.m55749b(C13746i.m55722a(getContext()));
    }

    /* renamed from: b */
    public void mo22336b() {
        this.f15857N = SystemClock.uptimeMillis();
        this.f15856M = System.currentTimeMillis();
        mo22348e();
    }

    /* renamed from: e */
    public void mo22348e() {
        C13748k.m55735c(this.f15874l);
        C13748k.m55733a(this.f15874l, 120000);
    }

    /* renamed from: f */
    public void mo22349f() {
        startNestedScroll(2);
        dispatchNestedPreScroll(0, -2147483647, null, null);
        stopNestedScroll();
    }

    public String getPerformanceTiming() {
        TTWebViewExtension tTWebViewExtension = this.ak;
        if (tTWebViewExtension == null) {
            return "{}";
        }
        return tTWebViewExtension.getPerformanceTiming();
    }

    public long getWebviewStatusCode() {
        TTWebViewExtension tTWebViewExtension = this.ak;
        if (tTWebViewExtension == null) {
            return -999;
        }
        return tTWebViewExtension.getLoadingStatusCode();
    }

    /* renamed from: n */
    public void mo22368n() {
        C13479a.m54764b(this.f15866b, "clearRenderParams");
        this.f15861S.clear();
    }

    /* access modifiers changed from: private */
    /* renamed from: C */
    public /* synthetic */ void m22661C() {
        boolean z;
        NetService netService = (NetService) KoinJavaComponent.m268610a(NetService.class);
        if (netService.mo20121b() == 3) {
            z = true;
        } else {
            z = false;
        }
        this.f15876o = z;
        this.f15877p = netService.mo20123c();
    }

    private boolean getFirstNotRenderSwitch() {
        return ((Boolean) this.f15878q.mo34038b("firstRenderNotAccelerate", false)).booleanValue();
    }

    private boolean getRenderSwitch() {
        return ((Boolean) this.f15878q.mo34038b("renderAccelerate", true)).booleanValue();
    }

    /* renamed from: u */
    private void m22697u() {
        C13479a.m54764b(this.f15866b, "downloadFullResource ");
        ((AbstractC5469i) KoinJavaComponent.m268610a(AbstractC5469i.class)).mo21873a(new ResourceCallback() {
            /* class com.bytedance.ee.bear.document.DocBridgeWebViewV2.C56007 */

            @Override // com.bytedance.ee.bear.doc.resupdate.ResourceCallback
            /* renamed from: b */
            public void mo21852b() {
                C13479a.m54764b(DocBridgeWebViewV2.this.f15866b, "downloadFullResource onFail");
            }

            @Override // com.bytedance.ee.bear.doc.resupdate.ResourceCallback
            /* renamed from: a */
            public void mo21850a() {
                C13479a.m54764b(DocBridgeWebViewV2.this.f15866b, "downloadFullResource onReady");
                if (DocBridgeWebViewV2.this.f15869e) {
                    DocBridgeWebViewV2.this.getRenderCallbacks().mo238001b($$Lambda$DocBridgeWebViewV2$7$wN87vryRcm4xKoPL7yYVYEXDjZQ.INSTANCE, new Consumer() {
                        /* class com.bytedance.ee.bear.document.$$Lambda$DocBridgeWebViewV2$7$mCj2wMHCBuLpB8M4Uf1xOSlne1U */

                        @Override // io.reactivex.functions.Consumer
                        public final void accept(Object obj) {
                            DocBridgeWebViewV2.C56007.this.m22744a((DocBridgeWebViewV2.C56007) ((Throwable) obj));
                        }
                    });
                }
                DocBridgeWebViewV2.this.mo22360h();
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public /* synthetic */ void m22744a(Throwable th) throws Exception {
                C13479a.m54765b(DocBridgeWebViewV2.this.f15866b, "accept: onDownloadFullResource()", th);
            }
        });
    }

    /* renamed from: w */
    private void m22699w() {
        mo30809a("biz.statistics.sendEvent", (AbstractC7945d) new SendEventHandler(this.f15867c, this.f15844A.mo17367q(), this));
    }

    /* renamed from: c */
    public AbstractC4931i mo22342c() {
        return new C5630ae(this);
    }

    /* renamed from: g */
    public void mo22350g() {
        this.f15851H = null;
        this.f15870f = null;
        this.f15871g = C8275a.f22371d.mo32553a();
        mo22368n();
    }

    /* renamed from: h */
    public void mo22360h() {
        mo22361i().mo238001b(new Consumer() {
            /* class com.bytedance.ee.bear.document.$$Lambda$DocBridgeWebViewV2$Z09az9rx3OYKhRku7f7pPShUeh0 */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                DocBridgeWebViewV2.this.m22668a((DocBridgeWebViewV2) ((Boolean) obj));
            }
        }, new Consumer() {
            /* class com.bytedance.ee.bear.document.$$Lambda$DocBridgeWebViewV2$iQ8TQ69YVAAMEYCK3zKwMX0nYxc */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                DocBridgeWebViewV2.this.m22690g((DocBridgeWebViewV2) ((Throwable) obj));
            }
        });
    }

    /* renamed from: k */
    public boolean mo22364k() {
        Boolean bool = this.f15846C.get(this.f15871g);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* renamed from: l */
    public void mo22365l() {
        C13479a.m54764b(this.f15866b, "resetIsReady()...  ");
        this.f15846C.clear();
    }

    /* renamed from: m */
    public void mo22367m() {
        if (this.ak != null) {
            C13479a.m54764b(this.f15866b, "notifyV8ToGC ====");
            this.ak.notifyV8ToGC();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.jsbridge.BridgeWebViewV2, com.bytedance.ee.larkwebview.base.BaseWebView, com.bytedance.ee.bear.browser.view.DecorateWebViewV2, com.bytedance.ee.larkwebview.base.LarkWebView
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C13479a.m54764b(this.f15866b, "onAttachedToWindow()...");
        this.f15869e = true;
        onResume();
    }

    /* renamed from: A */
    private void m22659A() {
        this.ae = C4211a.m17514a().mo16536a("spacekit.mobile.use_input_connection_wrapper", true);
        this.af = C4211a.m17514a().mo16536a("spacekit.mobile.intercept_hard_keyboard_enable", true);
        String str = this.f15866b;
        C13479a.m54764b(str, "useInputWrapper:" + this.ae + ", interceptHardKeyboardEnable:" + this.af);
    }

    /* access modifiers changed from: private */
    /* renamed from: B */
    public /* synthetic */ void m22660B() {
        clearHistory();
        if (!this.f15859P || !this.f15860Q) {
            loadUrl(C6313i.m25327a().mo25401i(this.f15851H));
            this.f15859P = true;
            C13479a.m54764b(this.f15866b, "loadUrlRenderIfNeed loadUrl....");
            return;
        }
        m22696t();
        C13479a.m54764b(this.f15866b, "loadUrlRenderIfNeed renderUrl...");
    }

    private int getTipLayoutHeight() {
        if (this.ac == 0) {
            NoNetworkView noNetworkView = new NoNetworkView(getContext());
            noNetworkView.setTip(getContext().getString(R.string.Doc_Facade_SyncedNextOnline));
            C13749l.m55761e(noNetworkView);
            this.ac = C13749l.m55749b(noNetworkView.getMeasuredHeight());
        }
        return this.ac;
    }

    /* renamed from: z */
    private void m22702z() {
        TTWebViewExtension tTWebViewExtension = new TTWebViewExtension(this);
        this.ak = tTWebViewExtension;
        tTWebViewExtension.setRenderProcessGoneListener(al);
        this.ak.setMemoryEventListener((IWebViewExtension.MemoryEventListener) new IWebViewExtension.MemoryEventListener() {
            /* class com.bytedance.ee.bear.document.DocBridgeWebViewV2.C55952 */
        });
        this.ak.setPerformanceTimingListener((IWebViewExtension.PerformanceTimingListener) new IWebViewExtension.PerformanceTimingListener() {
            /* class com.bytedance.ee.bear.document.DocBridgeWebViewV2.C55963 */

            @Override // com.bytedance.lynx.webview.glue.sdk113.IPerformanceTimingListenersdk113
            public void onBodyParsing() {
            }

            @Override // com.bytedance.lynx.webview.glue.sdk112.IPerformanceTimingListenersdk112
            public void onCustomTagNotify(String str) {
            }

            @Override // com.bytedance.lynx.webview.glue.sdk111.IPerformanceTimingListenersdk111
            public void onDOMContentLoaded() {
            }

            @Override // com.bytedance.lynx.webview.glue.sdk111.IPerformanceTimingListenersdk111
            public void onFirstContentfulPaint() {
            }

            @Override // com.bytedance.lynx.webview.glue.sdk113.IPerformanceTimingListenersdk113
            public void onFirstImagePaint() {
            }

            @Override // com.bytedance.lynx.webview.glue.sdk111.IPerformanceTimingListenersdk111
            public void onFirstMeaningfulPaint() {
            }

            @Override // com.bytedance.lynx.webview.glue.sdk112.IPerformanceTimingListenersdk112
            public void onFirstScreenPaint() {
            }

            @Override // com.bytedance.lynx.webview.glue.sdk113.IPerformanceTimingListenersdk113
            public void onIframeLoaded(String str) {
            }

            @Override // com.bytedance.lynx.webview.glue.sdk113.IPerformanceTimingListenersdk113
            public void onJSError(String str) {
            }

            @Override // com.bytedance.lynx.webview.glue.sdk113.IPerformanceTimingListenersdk113
            public void onNetFinish() {
            }

            @Override // com.bytedance.lynx.webview.glue.sdk112.IPerformanceTimingListenersdk112
            public void onReceivedResponse(String str) {
            }

            @Override // com.bytedance.lynx.webview.glue.sdk112.IPerformanceTimingListenersdk112
            public void onReceivedSpecialEvent(String str) {
            }

            @Override // com.bytedance.lynx.webview.glue.sdk113.IPerformanceTimingListenersdk113
            public void onGetJavaScriptStackTrace(String str) {
                C13479a.m54762a("ReportCrashUtils_onGetJavaScriptStackTrace", new Throwable(str), true);
            }
        });
    }

    @Override // com.bytedance.ee.bear.jsbridge.BridgeWebViewV2, com.bytedance.ee.bear.webview.fps.FpsWebViewV2, com.bytedance.ee.larkwebview.base.LarkWebView
    public void destroy() {
        C13479a.m54764b(this.f15866b, "destroy()... ");
        mo22350g();
        LiveData<ConnectionService.NetworkState> liveData = this.f15865W;
        if (liveData != null) {
            liveData.mo5928b(this.ah);
        }
        this.f15845B.mo20215g().mo5928b(this.f175417ai);
        this.f15845B.mo20213e().mo5928b(this.aj);
        C5920b bVar = this.f15850G;
        if (bVar != null) {
            bVar.mo23898c();
        }
        C13748k.m55735c(this.f15874l);
        super.destroy();
    }

    public AbstractC68307f<AbstractC5089af.AbstractC5091b> getRenderCallbacks() {
        ArrayList arrayList = new ArrayList();
        Iterator it = new ArrayList(this.f15848E).iterator();
        while (it.hasNext()) {
            C5606d dVar = (C5606d) it.next();
            AbstractC5089af.AbstractC5091b bVar = (AbstractC5089af.AbstractC5091b) dVar.mo22406a();
            if (bVar == null) {
                this.f15848E.remove(dVar);
            } else {
                arrayList.add(bVar);
            }
        }
        return AbstractC68307f.m265081a((Iterable) arrayList);
    }

    @Override // com.bytedance.ee.larkwebview.base.LarkWebView
    public void goBack() {
        String str;
        int currentIndex;
        WebHistoryItem itemAtIndex;
        WebBackForwardList copyBackForwardList = copyBackForwardList();
        if (copyBackForwardList == null || (currentIndex = copyBackForwardList.getCurrentIndex()) <= 1 || (itemAtIndex = copyBackForwardList.getItemAtIndex(currentIndex - 1)) == null) {
            str = "";
        } else {
            str = itemAtIndex.getOriginalUrl();
        }
        super.goBack();
        m22684e(str);
        getRenderCallbacks().mo238001b(new Consumer(str) {
            /* class com.bytedance.ee.bear.document.$$Lambda$DocBridgeWebViewV2$i9hmpjAm4j3M3xm1awVaN7cYG4 */
            public final /* synthetic */ String f$0;

            {
                this.f$0 = r1;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                ((AbstractC5089af.AbstractC5091b) obj).onDocGoBack(this.f$0);
            }
        }, new Consumer() {
            /* class com.bytedance.ee.bear.document.$$Lambda$DocBridgeWebViewV2$dnE5sUoDbUIXDKdq3F9y7z35rRo */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                DocBridgeWebViewV2.this.m22694k((Throwable) obj);
            }
        });
    }

    /* renamed from: i */
    public AbstractC68307f<Boolean> mo22361i() {
        C13479a.m54764b(this.f15866b, "preloadWebview ");
        setDocStatus(0);
        this.aa.mo22706b();
        this.aa.mo22705a(this.f15871g);
        return ((AbstractC5089af) KoinJavaComponent.m268610a(AbstractC5089af.class)).mo20190b(true);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.browser.view.DecorateWebViewV2, com.bytedance.ee.bear.webview.fps.FpsWebViewV2
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        boolean k = mo22364k();
        String str = this.f15866b;
        C13479a.m54764b(str, "onDetachedFromWindow()... isReay = " + k);
        setHostFragment(null);
        if (k) {
            C13479a.m54764b(this.f15866b, "recycle()... clear");
            clearHistory();
            mo22332a("javascript:clear", (JSONObject) null);
            evaluateJavascript("ttwebview:/*cleanupGPUResource*/;", null);
        }
        this.f15869e = false;
    }

    /* renamed from: d */
    public void mo22344d() {
        if (f15841R < DocOpenConfig.m22763d()) {
            f15841R++;
            ((AbstractC5089af) KoinJavaComponent.m268610a(AbstractC5089af.class)).mo20182a(false).mo238001b(new Consumer() {
                /* class com.bytedance.ee.bear.document.$$Lambda$DocBridgeWebViewV2$yMC7PNDmP1FBp2kgCof_tCoIJo */

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    DocBridgeWebViewV2.this.m22676b((DocBridgeWebViewV2) ((Boolean) obj));
                }
            }, new Consumer() {
                /* class com.bytedance.ee.bear.document.$$Lambda$DocBridgeWebViewV2$hlh6NvRzN2OhX7nw_aduedz4cI */

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    DocBridgeWebViewV2.this.m22695l((Throwable) obj);
                }
            });
            return;
        }
        C13479a.m54775e(this.f15866b, "reloadWebviewRunnable====== sReloadNum: " + f15841R + "  DocOpenConfig.getReloadMaxNum()： " + DocOpenConfig.m22763d());
    }

    /* renamed from: j */
    public boolean mo22363j() {
        Boolean bool = this.f15846C.get(C8275a.f22371d.mo32553a());
        Boolean bool2 = this.f15846C.get(C8275a.f22372e.mo32553a());
        String str = this.f15866b;
        C13479a.m54764b(str, "isDocAndSheetReady()... ret1: " + bool + "   ret2: " + bool2);
        if (bool == null || bool2 == null || !bool.booleanValue() || !bool2.booleanValue()) {
            return false;
        }
        return true;
    }

    /* renamed from: t */
    private boolean m22696t() {
        if (mo22364k()) {
            setDocStatus(1);
            m22674b(1);
            return true;
        }
        DocReport.f16153n.mo23020b(System.currentTimeMillis());
        if (!this.f15873i) {
            return false;
        }
        boolean b = this.f15850G.mo23897b();
        boolean c = ((AbstractC5469i) KoinJavaComponent.m268610a(AbstractC5469i.class)).mo21876c("DOC_CHANNEL");
        String str = this.f15866b;
        C13479a.m54764b(str, "***reportOpenDoc*** loadUrlRenderIfNeed()... getWebviewStatusCode: " + getWebviewStatusCode() + "     isSim:  " + b + "     hasFullResource:  " + c);
        if (TextUtils.equals(this.f15871g, C8275a.f22371d.mo32553a()) || TextUtils.equals(this.f15871g, C8275a.f22372e.mo32553a()) || !b) {
            this.aa.mo22705a(this.f15871g);
            getRenderCallbacks().mo238001b($$Lambda$DocBridgeWebViewV2$l9nptYIeFMW46DuKfeZTDshVuWg.INSTANCE, new Consumer() {
                /* class com.bytedance.ee.bear.document.$$Lambda$DocBridgeWebViewV2$QcbZw5o3Y0mxmDN4lVHDdRTfB9g */

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    DocBridgeWebViewV2.this.m22693j((Throwable) obj);
                }
            });
        } else if (c) {
            getRenderCallbacks().mo238001b($$Lambda$DocBridgeWebViewV2$yyQzepbjvtn5C3suJ1donvhwwc.INSTANCE, new Consumer() {
                /* class com.bytedance.ee.bear.document.$$Lambda$DocBridgeWebViewV2$_eLI8WPwWokcvdj4DNxblGZAGc */

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    DocBridgeWebViewV2.this.m22692i((Throwable) obj);
                }
            });
            mo22360h();
        } else {
            getRenderCallbacks().mo238001b($$Lambda$DocBridgeWebViewV2$XPF6WTK5LXuce7Yje8225Fst0.INSTANCE, new Consumer() {
                /* class com.bytedance.ee.bear.document.$$Lambda$DocBridgeWebViewV2$0FELl5_eEGl_X3fG7UlwuWHK6r4 */

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    DocBridgeWebViewV2.this.m22691h((Throwable) obj);
                }
            });
            m22697u();
        }
        return true;
    }

    /* renamed from: x */
    private void m22700x() {
        setBizType(BizType.f35444h.mo49860a());
        getBridge().mo49767a(new DocsBridgeExtension());
        if (SecurityUtils.m23555a(getContext(), C4511g.m18594d())) {
            setWebContentsDebuggingEnabled(true);
        }
        if (Build.VERSION.SDK_INT >= 26) {
            setRendererPriorityPolicy(2, false);
        }
        setReadyStatus(Boolean.FALSE);
        m22698v();
        m22699w();
        setHorizontalScrollBarEnabled(false);
        this.f15850G = new C5920b(this, this.f15879r, this.f15849F);
        C4921d dVar = new C4921d(new AbstractC13402a() {
            /* class com.bytedance.ee.bear.document.DocBridgeWebViewV2.C56029 */

            @Override // com.bytedance.ee.larkwebview.base.AbstractC13402a
            public LarkWebView getWebView() {
                return DocBridgeWebViewV2.this;
            }

            @Override // com.bytedance.ee.larkwebview.base.AbstractC13402a
            public C13477l getServiceManager() {
                return new C13477l();
            }

            @Override // com.bytedance.ee.larkwebview.base.AbstractC13402a
            public Context getWebViewContext() {
                return DocBridgeWebViewV2.this.getContext();
            }
        });
        this.f15862T = dVar;
        dVar.mo19387a(new C5817i());
        String str = this.f15866b;
        C13479a.m54764b(str, "generateBridgeWebViewClient() use offline res = " + this.f15873i);
        if (this.f15873i) {
            this.f15862T.mo19387a(this.f15850G);
        }
        setWebViewClient(this.f15862T);
        AnonymousClass10 r0 = new AbstractC13402a() {
            /* class com.bytedance.ee.bear.document.DocBridgeWebViewV2.AnonymousClass10 */

            @Override // com.bytedance.ee.larkwebview.base.AbstractC13402a
            public LarkWebView getWebView() {
                return DocBridgeWebViewV2.this;
            }

            @Override // com.bytedance.ee.larkwebview.base.AbstractC13402a
            public C13477l getServiceManager() {
                return new C13477l();
            }

            @Override // com.bytedance.ee.larkwebview.base.AbstractC13402a
            public Context getWebViewContext() {
                return DocBridgeWebViewV2.this.getContext();
            }
        };
        C4920c cVar = new C4920c(r0);
        this.f15863U = cVar;
        cVar.mo19356a(new C13404c(r0) {
            /* class com.bytedance.ee.bear.document.DocBridgeWebViewV2.AnonymousClass11 */

            @Override // com.bytedance.ee.larkwebview.base.C13404c, android.webkit.WebChromeClient
            public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
                return false;
            }

            @Override // com.bytedance.ee.larkwebview.base.C13404c
            public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
                if (consoleMessage.messageLevel().ordinal() <= ConsoleMessage.MessageLevel.LOG.ordinal()) {
                    return true;
                }
                C13479a.m54764b(DocBridgeWebViewV2.this.f15866b + "_js", C13598b.m55191a(consoleMessage.message()) + " -- From line " + consoleMessage.lineNumber());
                return true;
            }

            @Override // com.bytedance.ee.larkwebview.base.C13404c
            public void onProgressChanged(WebView webView, int i) {
                super.onProgressChanged(webView, i);
                String str = DocBridgeWebViewV2.this.f15866b;
                C13479a.m54764b(str, "onProgressChanged: " + i);
            }
        });
        setWebChromeClient(this.f15863U);
        DocReport dVar2 = new DocReport(this.f15880y, this.f15867c, this.f15844A, C5102ai.m20872j(), this.f15844A.mo17367q());
        this.aa = new C5680d(this);
        m22701y();
        mo30809a("biz.notify.ready", (AbstractC7945d) new C5679c(new AbstractC5678b(dVar2) {
            /* class com.bytedance.ee.bear.document.$$Lambda$DocBridgeWebViewV2$ppCP9nfK8_hIz1sCvMvw4F3kvMU */
            public final /* synthetic */ DocReport f$1;

            {
                this.f$1 = r2;
            }

            @Override // com.bytedance.ee.bear.document.bridgestatus.AbstractC5678b
            public final void ready(BridgeReadyModel bridgeReadyModel) {
                DocBridgeWebViewV2.this.m22665a((DocBridgeWebViewV2) this.f$1, (DocReport) bridgeReadyModel);
            }
        }));
        mo30809a("biz.notify.preloadReady", (AbstractC7945d) new C5677a(new AbstractC5678b() {
            /* class com.bytedance.ee.bear.document.$$Lambda$DocBridgeWebViewV2$Cqaauqg1tIr1W8a8uMKHK1PmQZM */

            @Override // com.bytedance.ee.bear.document.bridgestatus.AbstractC5678b
            public final void ready(BridgeReadyModel bridgeReadyModel) {
                DocBridgeWebViewV2.this.m22664a((DocBridgeWebViewV2) bridgeReadyModel);
            }
        }));
        m22659A();
        m22702z();
    }

    public void setBearUrl(BearUrl bearUrl) {
        this.f15870f = bearUrl;
    }

    public void setOfflineOpen(boolean z) {
        this.f15873i = z;
    }

    public void setReadyCallback(AbstractC5603a aVar) {
        this.f15864V = aVar;
    }

    public void setRenderOpen(boolean z) {
        this.f15872h = z;
    }

    /* renamed from: com.bytedance.ee.bear.document.DocBridgeWebViewV2$b */
    public static class C5604b extends InputConnectionWrapper {
        public boolean sendKeyEvent(KeyEvent keyEvent) {
            return super.sendKeyEvent(keyEvent);
        }

        public C5604b(InputConnection inputConnection, boolean z) {
            super(inputConnection, z);
        }

        public boolean deleteSurroundingText(int i, int i2) {
            if (i - i2 != 1) {
                return super.deleteSurroundingText(i, i2);
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            sendKeyEvent(new KeyEvent(uptimeMillis, uptimeMillis, 0, 67, 0, 0, -1, 0, 22));
            sendKeyEvent(new KeyEvent(SystemClock.uptimeMillis(), uptimeMillis, 1, 67, 0, 0, -1, 0, 22));
            return true;
        }
    }

    /* renamed from: a */
    private void m22663a(Context context) {
        this.f15863U.mo49742a(context);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m22677b(Throwable th) throws Exception {
        C13479a.m54765b(this.f15866b, "accept: onRendering()", th);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m22682d(Throwable th) throws Exception {
        C13479a.m54765b(this.f15866b, "accept: pull_data callback", th);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m22685e(Throwable th) throws Exception {
        C13479a.m54765b(this.f15866b, "accept: render_doc callback", th);
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public /* synthetic */ void m22688f(Throwable th) throws Exception {
        C13479a.m54765b(this.f15866b, "accept: render_doc callback", th);
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public /* synthetic */ void m22691h(Throwable th) throws Exception {
        C13479a.m54765b(this.f15866b, "accept: onWaitDownloadFullResource()", th);
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public /* synthetic */ void m22692i(Throwable th) throws Exception {
        C13479a.m54765b(this.f15866b, "accept: onWaitPreloading(isNotReady)", th);
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public /* synthetic */ void m22693j(Throwable th) throws Exception {
        C13479a.m54765b(this.f15866b, "accept: onWaitPreloading(isNotReady)", th);
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public /* synthetic */ void m22694k(Throwable th) throws Exception {
        C13479a.m54759a(this.f15866b, "goBack: ", th);
    }

    @Override // com.bytedance.ee.bear.jsbridge.BridgeWebViewV2
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // com.bytedance.ee.bear.browser.view.DecorateWebViewV2
    public ActionMode startActionMode(ActionMode.Callback callback) {
        return m22662a(callback, -1);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m22680c(Throwable th) throws Exception {
        C13479a.m54765b(this.f15866b, "accept: onRenderByWaitPreload(isReady)", th);
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ void m22690g(Throwable th) throws Exception {
        C13479a.m54761a(this.f15866b, th);
        C13606d.m55245a(this.f15866b, th);
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public /* synthetic */ void m22695l(Throwable th) throws Exception {
        C13479a.m54761a(this.f15866b, th);
        C13606d.m55245a(this.f15866b, th);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m22668a(Boolean bool) throws Exception {
        String str = this.f15866b;
        C13479a.m54764b(str, "***reportPreloadHtml*** preloadTemplateNotDestroyWebview preloadWebview() result = " + bool);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m22676b(Boolean bool) throws Exception {
        String str = this.f15866b;
        C13479a.m54764b(str, "***reportPreloadHtml*** preloadTemplate：doReloadWebview result = " + bool);
    }

    /* renamed from: e */
    private void m22684e(String str) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("url", (Object) mo22343c(str));
        mo22332a("javascript:replace", jSONObject);
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public /* synthetic */ void m22687f(String str) {
        String str2 = this.f15866b;
        C13479a.m54764b(str2, "***reportOpenDoc*** ValueCallback value: " + str);
    }

    /* renamed from: d */
    public void mo22345d(String str) {
        String str2 = this.f15866b;
        C13479a.m54764b(str2, "removeRenderParams:" + str);
        this.f15861S.remove(str);
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (!this.ae) {
            return onCreateInputConnection;
        }
        if (onCreateInputConnection == null) {
            return null;
        }
        return new C5604b(onCreateInputConnection, true);
    }

    /* access modifiers changed from: protected */
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        String str = this.f15866b;
        C13479a.m54764b(str, "onWindowVisibilityChanged  visibility: " + i);
    }

    public synchronized void setDocStatus(int i) {
        String str = this.f15866b;
        C13479a.m54764b(str, "setDocStatus(): " + i);
        this.f15858O = i;
    }

    public void setRenderParams(Map<String, Serializable> map) {
        String str = this.f15866b;
        C13479a.m54764b(str, "setRenderParams:" + map);
        if (map != null) {
            this.f15861S.putAll(map);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m22664a(BridgeReadyModel bridgeReadyModel) {
        String str = this.f15866b;
        C13479a.m54764b(str, "***reportPreloadHtml*** BIZ_NOTIFY_PRELOADREADY data = " + bridgeReadyModel.toString() + "     mType = " + this.f15871g);
        this.aa.mo22704a();
    }

    /* renamed from: c */
    public String mo22343c(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String path = Uri.parse(str).getPath();
        if (TextUtils.isEmpty(path)) {
            return null;
        }
        int indexOf = str.indexOf(path);
        if (indexOf == -1 || indexOf > str.length()) {
            return "";
        }
        return str.substring(indexOf);
    }

    public void setHostFragment(Fragment fragment) {
        boolean z;
        String str = this.f15866b;
        StringBuilder sb = new StringBuilder();
        sb.append("setHostFragment() fragment null is ");
        if (fragment == null) {
            z = true;
        } else {
            z = false;
        }
        sb.append(z);
        C13479a.m54764b(str, sb.toString());
        this.f15847D.clear();
        this.f15847D = new WeakReference<>(fragment);
        if (fragment == null) {
            m22663a(getContext());
        } else {
            m22663a(fragment.getActivity());
        }
    }

    public DocBridgeWebViewV2(Context context) {
        super(context);
        m22700x();
    }

    /* renamed from: b */
    private void m22674b(int i) {
        String c = mo22343c(this.f15851H);
        if (TextUtils.isEmpty(c)) {
            String str = this.f15866b;
            C13479a.m54775e(str, "***reportOpenDoc*** doRender: parsed url is null uri = " + this.f15851H);
            return;
        }
        String str2 = this.f15866b;
        C13479a.m54764b(str2, "***reportOpenDoc*** doRender url = " + c.hashCode());
        m22669a(c, i);
        mo22349f();
    }

    @Override // com.bytedance.ee.bear.jsbridge.BridgeWebViewV2, com.bytedance.ee.larkwebview.base.BaseWebView, com.bytedance.ee.larkwebview.base.LarkWebView
    public void loadUrl(String str) {
        if (TextUtils.isEmpty(str)) {
            C13606d.m55245a(this.f15866b, new IllegalArgumentException(" url is empty!!!"));
        } else if (str.startsWith("javascript:")) {
            super.mo30811a(str, true);
        } else {
            if (this.f15877p) {
                super.loadUrl(str);
            } else if (this.f15876o) {
                HashMap hashMap = new HashMap();
                hashMap.put("Env", "Pre_release");
                super.loadUrl(str, hashMap);
            } else {
                super.loadUrl(str);
            }
            mo22349f();
        }
    }

    public void setReadyStatus(Boolean bool) {
        String str = this.f15866b;
        C13479a.m54764b(str, "setReadyStatus()...  status： " + bool);
        this.f15846C.put(C8275a.f22371d.mo32553a(), bool);
        this.f15846C.put(C8275a.f22377j.mo32553a(), bool);
        this.f15846C.put(C8275a.f22372e.mo32553a(), bool);
        this.f15846C.put(C8275a.f22374g.mo32553a(), bool);
        this.f15846C.put(C8275a.f22376i.mo32553a(), bool);
        this.f15846C.put(C8275a.f22378k.mo32553a(), bool);
        this.f15846C.put(C8275a.f22373f.mo32553a(), bool);
        this.f15846C.put(C8275a.f22375h.mo32553a(), bool);
    }

    /* renamed from: b */
    public void mo22337b(WebViewClient webViewClient) {
        this.f15862T.mo19389b(webViewClient);
    }

    /* renamed from: b */
    public void mo22338b(AbstractC5089af.AbstractC5091b bVar) {
        this.f15848E.remove(new C5606d(bVar));
    }

    /* renamed from: b */
    public void mo22339b(AbstractC5605c cVar) {
        if (cVar != null) {
            this.f15853J.remove(new C5606d(cVar));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m22671a(Throwable th) throws Exception {
        C13479a.m54765b(this.f15866b, "accept: onRendering()", th);
    }

    /* renamed from: b */
    public void mo22340b(AbstractC6088b bVar) {
        if (bVar != null) {
            this.f15854K.remove(bVar);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m22666a(DocException docException, AbstractC5089af.AbstractC5091b bVar) throws Exception {
        bVar.onRenderFail(docException, new HashMap());
    }

    @Override // com.bytedance.ee.bear.browser.view.DecorateWebViewV2
    public ActionMode startActionMode(ActionMode.Callback callback, int i) {
        return m22662a(callback, i);
    }

    public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        if (!this.af || keyEvent.getKeyCode() != 61) {
            return super.onKeyPreIme(i, keyEvent);
        }
        dispatchKeyEvent(keyEvent);
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m22678b(boolean z, int i) {
        for (AbstractC6088b bVar : this.f15854K) {
            bVar.mo22588a(z, i);
        }
    }

    /* access modifiers changed from: protected */
    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (i == 0 && view.equals(this) && this.f15875n == 0) {
            this.f15875n = getBottom();
            String str = this.f15866b;
            C13479a.m54764b(str, "onVisibilityChanged: mOriBottom=" + this.f15875n);
        }
    }

    /* renamed from: a */
    private ActionMode m22662a(ActionMode.Callback callback, int i) {
        FragmentActivity fragmentActivity;
        WeakReference<Fragment> weakReference = this.f15847D;
        if (weakReference == null || weakReference.get() == null) {
            fragmentActivity = null;
        } else {
            fragmentActivity = this.f15847D.get().getActivity();
        }
        if (fragmentActivity == null || fragmentActivity.isFinishing()) {
            C13479a.m54775e(this.f15866b, "startActionMode while not active !");
            return null;
        }
        try {
            C13479a.m54764b(this.f15866b, "DocBridgeWebView start actionMode");
            if (C26326z.m95340d()) {
                return super.startActionMode(callback, i);
            }
            return super.startActionMode(callback);
        } catch (Exception e) {
            C13479a.m54759a(this.f15866b, "DocBridgeWebView start actionMode exception ", e);
            return null;
        }
    }

    public DocBridgeWebViewV2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m22700x();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m22665a(DocReport dVar, BridgeReadyModel bridgeReadyModel) {
        String str = this.f15866b;
        C13479a.m54764b(str, "***reportPreloadHtml*** BIZ_NOTIFY_READY data = " + bridgeReadyModel.toString());
        this.f15846C.put(bridgeReadyModel.getType(), true);
        dVar.mo23000a(bridgeReadyModel.getType(), this.f15857N);
        if (!this.f15869e && TextUtils.equals(bridgeReadyModel.getType(), C8275a.f22372e.mo32553a())) {
            C13479a.m54764b(this.f15866b, "BIZ_NOTIFY_READY onPause");
            onPause();
        }
        if (TextUtils.isEmpty(this.f15851H) || !TextUtils.equals(bridgeReadyModel.getType(), this.f15871g)) {
            C13479a.m54764b(this.f15866b, "ready()... mPenndingUrl is empty");
        } else {
            getRenderCallbacks().mo238001b($$Lambda$DocBridgeWebViewV2$irKqRiHNJJQYzKrXj2NyiqJ7_1I.INSTANCE, new Consumer() {
                /* class com.bytedance.ee.bear.document.$$Lambda$DocBridgeWebViewV2$tn2nq0sz7xda9qIxwGE1bFivig */

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    DocBridgeWebViewV2.this.m22680c((DocBridgeWebViewV2) ((Throwable) obj));
                }
            });
            setDocStatus(1);
            m22674b(0);
        }
        mo22325a(this.f15880y.mo20038b());
        C5890a.m23696a(bridgeReadyModel);
        AbstractC5603a aVar = this.f15864V;
        if (aVar != null) {
            aVar.mo22403a(bridgeReadyModel);
        }
    }

    /* renamed from: a */
    private void m22669a(String str, int i) {
        String str2;
        AccountService.Account f = this.f15881z.mo16408f();
        if (f != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("userId", (Object) f.f14584a);
            jSONObject.put("tenantId", (Object) f.f14592i);
            jSONObject.put("departmentId", (Object) f.f14599p);
            jSONObject.put("isPreloadFinished", (Object) Integer.valueOf(i));
            BearUrl bearUrl = this.f15870f;
            if (bearUrl != null) {
                ScrollData a = C5886b.m23684a(bearUrl.f17447b);
                jSONObject.put("x", (Object) Integer.valueOf(a.getX()));
                jSONObject.put("y", (Object) Integer.valueOf(a.getY()));
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("tap", (Object) Long.valueOf(f15842j));
            jSONObject2.put("invokeRender", (Object) Long.valueOf(System.currentTimeMillis()));
            jSONObject2.put("preloadStart", (Object) Long.valueOf(f15843k));
            jSONObject2.put("webviewLoadUrl", (Object) Long.valueOf(this.f15856M));
            jSONObject.put("timestamp", (Object) jSONObject2);
            if (C5890a.m23714e(this.f15870f.f17447b) == null) {
                jSONObject.put("prefetchData", (Object) "");
            } else {
                jSONObject.put("prefetchData", (Object) C5890a.m23714e(this.f15870f.f17447b));
            }
            jSONObject.put("title", (Object) this.f15852I);
            jSONObject.putAll(this.f15861S);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("url", (Object) str);
            jSONObject3.put("infos", (Object) jSONObject);
            if (DocOpenConfig.m22775p()) {
                StringBuilder sb = new StringBuilder(jSONObject3.toString());
                if (TextUtils.isEmpty(this.f15855L)) {
                    sb.insert(sb.indexOf("infos\":{") + 8, "\"clientvars\":\"\",");
                } else {
                    sb.insert(sb.indexOf("infos\":{") + 8, "\"clientvars\":" + this.f15855L + ",");
                }
                str2 = sb.toString();
            } else {
                if (TextUtils.isEmpty(this.f15855L)) {
                    jSONObject.put("clientvars", (Object) "");
                } else {
                    jSONObject.put("clientvars", (Object) this.f15855L);
                }
                str2 = jSONObject3.toString();
            }
            DocReport.f16153n.mo23020b(System.currentTimeMillis());
            evaluateJavascript("javascript:render" + "(" + str2 + ")", new ValueCallback() {
                /* class com.bytedance.ee.bear.document.$$Lambda$DocBridgeWebViewV2$XuGZ8vpZ_K_qS2ome9UT2XjD6o */

                @Override // android.webkit.ValueCallback
                public final void onReceiveValue(Object obj) {
                    DocBridgeWebViewV2.this.m22687f((DocBridgeWebViewV2) ((String) obj));
                }
            });
        } else {
            C13479a.m54758a(this.f15866b, "***reportOpenDoc*** onCallJsRender()... account is empty ");
            DocReport.f16153n.mo23020b(System.currentTimeMillis());
            getRenderCallbacks().mo238001b(new Consumer() {
                /* class com.bytedance.ee.bear.document.$$Lambda$DocBridgeWebViewV2$mSX7TxivI09hBjZy3ztgin1YeY */

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    DocBridgeWebViewV2.m22666a(DocException.this, (AbstractC5089af.AbstractC5091b) obj);
                }
            }, new Consumer() {
                /* class com.bytedance.ee.bear.document.$$Lambda$DocBridgeWebViewV2$f9ffSlDzWPb4LlqMJvPdq5Kst0 */

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    DocBridgeWebViewV2.this.m22677b((DocBridgeWebViewV2) ((Throwable) obj));
                }
            });
        }
        getRenderCallbacks().mo238001b($$Lambda$DocBridgeWebViewV2$IGonLEAmp0PmK5dXqE0SO9C6E.INSTANCE, new Consumer() {
            /* class com.bytedance.ee.bear.document.$$Lambda$DocBridgeWebViewV2$Uf2aevUeyUIwfDFhttQ6EzClvPU */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                DocBridgeWebViewV2.this.m22671a((DocBridgeWebViewV2) ((Throwable) obj));
            }
        });
    }

    public DocBridgeWebViewV2(Context context, C10917c cVar, String str) {
        super(context);
        this.f15849F = str;
        if (!TextUtils.isEmpty(str)) {
            this.f15866b += "_" + str;
        }
        this.f15879r = cVar;
        this.f15844A = C4511g.m18594d();
        this.f15880y = C5084ad.m20847d();
        this.f15867c = C5234y.m21391b();
        this.f15881z = (an) KoinJavaComponent.m268610a(an.class);
        this.f15845B = C5102ai.m20872j();
        C13608f.m55249a(new Runnable() {
            /* class com.bytedance.ee.bear.document.$$Lambda$DocBridgeWebViewV2$a8kOmS7OnFeqly7y5rMXGkuI8zk */

            public final void run() {
                DocBridgeWebViewV2.this.m22661C();
            }
        });
        this.f15878q = new PersistenceSharedPreference("debug_config");
        this.f15872h = getRenderSwitch();
        this.f15860Q = getFirstNotRenderSwitch();
        this.f15873i = ((Boolean) this.f15878q.mo34038b("resourceIntercept", true)).booleanValue();
        BridgeWebViewV2.f21346m = C4211a.m17514a().mo16536a("spacekit.mobile.webviewbridge.run.on.main.thread", false);
        C13479a.m54764b(this.f15866b, "shandlerRunOnUIThread =  " + BridgeWebViewV2.f21346m);
        DocOpenConfig.m22760a();
        m22700x();
        C6083a.m24591a();
        LiveData<ConnectionService.NetworkState> a = this.f15880y.mo20037a();
        this.f15865W = a;
        a.mo5925a(this.ah);
        this.f15845B.mo20215g().mo5925a(this.f175417ai);
        this.f15845B.mo20213e().mo5925a(this.aj);
        C13479a.m54764b(this.f15866b, "init end TTWebContext.isTTWebView: " + C20011y.m73013k() + "   this: " + this);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.webview.fps.FpsWebViewV2, com.bytedance.ee.larkwebview.base.LarkWebView
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        List<C5606d<AbstractC5605c>> list = this.f15853J;
        if (list != null) {
            for (C5606d<AbstractC5605c> dVar : list) {
                if (dVar == null || dVar.mo22406a() == null) {
                    this.f15853J.remove(dVar);
                } else {
                    dVar.mo22406a().onScrollChange(this, i, i2, i3, i4);
                }
            }
        }
    }
}
