package com.bytedance.ee.webapp.v2;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.webkit.ClientCertRequest;
import android.webkit.WebBackForwardList;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.lark.component.C12733b;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.larkbrand.LarkExtensionManager;
import com.bytedance.ee.larkbrand.menu.AbstractC13135b;
import com.bytedance.ee.larkbrand.menu.C13141f;
import com.bytedance.ee.larkbrand.menu.WorkplaceConfigData;
import com.bytedance.ee.larkbrand.menu.WorkplaceConfigResponse;
import com.bytedance.ee.larkbrand.permission.AbsPermissionSyncWrapper;
import com.bytedance.ee.larkwebview.base.LarkWebView;
import com.bytedance.ee.ref.impl.host.HostExtensionManager;
import com.bytedance.ee.ref.p682a.p685c.C13492c;
import com.bytedance.ee.webapp.AbstractC13753a;
import com.bytedance.ee.webapp.AbstractC13794f;
import com.bytedance.ee.webapp.C13764c;
import com.bytedance.ee.webapp.C13783d;
import com.bytedance.ee.webapp.C13791e;
import com.bytedance.ee.webapp.C13802g;
import com.bytedance.ee.webapp.C13805h;
import com.bytedance.ee.webapp.C13808i;
import com.bytedance.ee.webapp.config.AbstractC13780f;
import com.bytedance.ee.webapp.config.C13771b;
import com.bytedance.ee.webapp.config.C13772c;
import com.bytedance.ee.webapp.config.C13773d;
import com.bytedance.ee.webapp.config.C13781g;
import com.bytedance.ee.webapp.config.H5ConfigPlugin;
import com.bytedance.ee.webapp.config.WebappAuthStrategyCreator;
import com.bytedance.ee.webapp.menu.C13813a;
import com.bytedance.ee.webapp.menu.C13814b;
import com.bytedance.ee.webapp.menu.C13816c;
import com.bytedance.ee.webapp.menu.WebMoreCommonItem;
import com.bytedance.ee.webapp.p722c.C13765a;
import com.bytedance.ee.webapp.p724e.C13792a;
import com.bytedance.ee.webapp.v2.IWebAppBinderCallbackInterface;
import com.bytedance.ee.webapp.v2.WebAppContainerDelegate;
import com.bytedance.lark.pb.basic.v1.SendHttpResponse;
import com.bytedance.lark.webview.container.impl.WebContainerActivity;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.larksuite.component.openplatform.core.utils.C25529d;
import com.larksuite.component.openplatform.plugins.container.AbstractC25576a;
import com.larksuite.component.webview.container.dto.AbstractInjectWebViewDelegate;
import com.larksuite.component.webview.container.dto.C25835f;
import com.larksuite.component.webview.container.dto.C25838g;
import com.larksuite.framework.callback.CallbackManager;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.utils.C26252ad;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.maincore.ITitleController;
import com.ss.android.lark.multitask.MultitaskHelper;
import com.ss.android.lark.multitask.task.AbstractC48369g;
import com.ss.android.lark.multitask.task.AbstractC48375n;
import com.ss.android.lark.multitask.task.AbstractC48378t;
import com.ss.android.lark.multitask.task.C48366c;
import com.ss.android.lark.multitask.task.DrawableIconFactory;
import com.ss.android.lark.multitask.task.EventTracker;
import com.ss.android.lark.multitask.task.GlobalTaskContainer;
import com.ss.android.lark.multitask.task.RemoteTaskContainer;
import com.ss.android.lark.multitask.task.Task;
import com.ss.android.lark.multitask.task.UrlIconFactory;
import com.ss.android.lark.openapi.jsapi.AbstractC48762d;
import com.ss.android.lark.openapi.permission.AbstractC48767b;
import com.ss.android.lark.openapi.permission.http.verify.C48772b;
import com.ss.android.lark.openapi.permission.http.verify.VerifyResponse;
import com.ss.android.lark.opmonitor.trace.OPTrace;
import com.ss.android.lark.opmonitor.trace.OPTraceService;
import com.ss.android.lark.optrace.api.TracingCoreSpan;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import com.tt.frontendapiinterface.ApiHandlerManager;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.debug.InspectDebugHelper;
import com.tt.miniapp.launchaction.C66310g;
import com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65803f;
import com.tt.miniapp.settings.v2.handler.C66780j;
import com.tt.miniapp.toast.ToastManager;
import com.tt.miniapphost.entity.AppInfoEntity;
import com.tt.miniapphost.host.HostDependManager;
import com.tt.miniapphost.p3362a.p3367e.C67462h;
import com.tt.refer.common.base.AppType;
import com.tt.refer.common.util.C67866g;
import com.tt.refer.impl.business.p3433d.AbstractC67905a;
import com.tt.refer.p3400a.p3405d.AbstractC67720a;
import com.tt.refer.p3400a.p3408f.AbstractC67724a;
import com.tt.refer.p3400a.p3411h.AbstractC67730a;
import com.tt.refer.p3400a.p3412i.AbstractC67733a;
import com.tt.refer.p3400a.p3412i.AbstractC67735c;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

public class WebAppContainerDelegate extends AbstractInjectWebViewDelegate implements AbstractC13836d {
    public static final Parcelable.Creator<WebAppContainerDelegate> CREATOR = new Parcelable.Creator<WebAppContainerDelegate>() {
        /* class com.bytedance.ee.webapp.v2.WebAppContainerDelegate.AnonymousClass12 */

        /* renamed from: a */
        public WebAppContainerDelegate[] newArray(int i) {
            return new WebAppContainerDelegate[i];
        }

        /* renamed from: a */
        public WebAppContainerDelegate createFromParcel(Parcel parcel) {
            return new WebAppContainerDelegate(parcel);
        }
    };

    /* renamed from: A */
    private AbstractC13794f.AbstractC13799e f36101A;

    /* renamed from: B */
    private ContainerDelegateDataHelper f36102B;

    /* renamed from: C */
    private boolean f36103C;

    /* renamed from: D */
    private String f36104D;

    /* renamed from: E */
    private volatile boolean f36105E;

    /* renamed from: F */
    private OPTrace f36106F;

    /* renamed from: G */
    private WebMoreCommonItem f36107G;

    /* renamed from: H */
    private C13816c f36108H;

    /* renamed from: I */
    private C66310g f36109I;

    /* renamed from: J */
    private IDelegateDataCallBack f36110J = new IDelegateDataCallBack() {
        /* class com.bytedance.ee.webapp.v2.WebAppContainerDelegate.C138231 */

        @Override // com.bytedance.ee.webapp.v2.IDelegateDataCallBack
        /* renamed from: a */
        public void mo51024a(ContainerDelegateData aVar) {
            WebAppContainerDelegate.this.mo50983a(aVar);
        }

        @Override // com.bytedance.ee.webapp.v2.IDelegateDataCallBack
        /* renamed from: a */
        public C67462h mo51023a(String str, boolean z) {
            if (z) {
                return WebAppContainerDelegate.this.mo50973a((Bundle) null, "");
            }
            WebAppContainerDelegate webAppContainerDelegate = WebAppContainerDelegate.this;
            return webAppContainerDelegate.mo50973a((Bundle) null, webAppContainerDelegate.f36113b);
        }
    };

    /* renamed from: K */
    private final AbstractC13835a f36111K = new AbstractC13835a() {
        /* class com.bytedance.ee.webapp.v2.WebAppContainerDelegate.C138317 */

        @Override // com.bytedance.ee.webapp.v2.WebAppContainerDelegate.AbstractC13835a
        /* renamed from: a */
        public MultitaskHelper mo51032a() {
            return WebAppContainerDelegate.this.f36125n;
        }
    };

    /* renamed from: a */
    public C13771b f36112a;

    /* renamed from: b */
    public String f36113b;

    /* renamed from: c */
    public C67462h f36114c;

    /* renamed from: d */
    public AbstractC13794f.AbstractC13795a f36115d;

    /* renamed from: e */
    public C13808i f36116e;

    /* renamed from: f */
    public WebAppDelegateBinder f36117f;

    /* renamed from: g */
    public boolean f36118g;

    /* renamed from: h */
    public int f36119h;

    /* renamed from: i */
    public C25835f f36120i;

    /* renamed from: j */
    public boolean f36121j;

    /* renamed from: k */
    public String f36122k;

    /* renamed from: l */
    public String f36123l;

    /* renamed from: m */
    public AbstractC13780f f36124m;

    /* renamed from: n */
    public volatile MultitaskHelper f36125n;

    /* renamed from: o */
    private boolean f36126o;

    /* renamed from: p */
    private C13764c f36127p;

    /* renamed from: q */
    private AbstractC13794f.AbstractC13796b f36128q;

    /* renamed from: r */
    private AbstractC13794f.AbstractC13800f f36129r;

    /* renamed from: s */
    private AbstractC13794f.AbstractC13798d f36130s;

    /* renamed from: t */
    private C13846g f36131t;

    /* renamed from: u */
    private boolean f36132u;

    /* renamed from: v */
    private C13808i f36133v;

    /* renamed from: w */
    private C13848h f36134w;

    /* renamed from: x */
    private ITitleController f36135x;

    /* renamed from: y */
    private C13773d f36136y;

    /* renamed from: z */
    private AbstractC13794f.AbstractC13801g f36137z;

    /* renamed from: com.bytedance.ee.webapp.v2.WebAppContainerDelegate$a */
    public interface AbstractC13835a {
        /* renamed from: a */
        MultitaskHelper mo51032a();
    }

    /* renamed from: a */
    public void mo50987a(AbstractC67905a aVar) {
    }

    @Override // com.larksuite.component.webview.container.dto.AbstractInjectWebViewDelegate
    /* renamed from: a */
    public boolean mo50992a(Fragment fragment, WebView webView) {
        return false;
    }

    @Override // com.larksuite.component.webview.container.dto.AbstractInjectWebViewDelegate
    public int describeContents() {
        return 0;
    }

    @Override // com.bytedance.ee.webapp.v2.AbstractC13836d
    /* renamed from: e */
    public IAppContext mo51007e() {
        return this.f36114c;
    }

    @Override // com.larksuite.component.webview.container.dto.AbstractInjectWebViewDelegate
    /* renamed from: m */
    public AbstractC48762d mo51015m() {
        return this.f36127p;
    }

    /* renamed from: q */
    public AbstractC13780f mo51019q() {
        return this.f36124m;
    }

    /* renamed from: r */
    public C67462h mo51020r() {
        return this.f36114c;
    }

    /* access modifiers changed from: protected */
    @Override // com.larksuite.component.webview.container.dto.AbstractInjectWebViewDelegate
    /* renamed from: a */
    public void mo50984a(AbstractInjectWebViewDelegate.AbstractC25823a aVar) {
        AbstractC13794f.AbstractC13800f fVar = this.f36129r;
        if (fVar != null) {
            fVar.mo50860a(aVar, mo50999c());
        }
    }

    /* renamed from: a */
    public void mo50983a(ContainerDelegateData aVar) {
        C67462h b = aVar.mo51050b();
        this.f36114c = b;
        this.f36124m.mo50786a(b, false);
        mo91999w().mo67308b().mo67329c();
        if (!C13772c.m55813a()) {
            this.f36124m.mo50803a(aVar.mo51047a(), this.f36113b, this.f36114c.getAppId());
        }
        this.f36113b = this.f36114c.getAppId();
        m55998a(Bundle.EMPTY);
        this.f36120i = new C25835f.C25837a(aVar.mo51047a()).mo91913a(this.f36113b).mo91914a();
        mo91999w().mo67308b().mo67316a(this.f36120i);
        AbstractC13794f.AbstractC13801g gVar = this.f36137z;
        if (gVar != null) {
            gVar.mo50863a(mo91999w(), mo50994b());
        }
    }

    /* renamed from: a */
    public C67462h mo50973a(Bundle bundle, String str) {
        C67462h hVar = new C67462h(mo91997u().getApplicationContext(), mo51003d());
        hVar.setAppId(str);
        hVar.setCurrentActivity(mo91997u());
        return hVar;
    }

    /* renamed from: a */
    public void mo50988a(String str) {
        C67462h hVar;
        if (TextUtils.isEmpty(str) || (hVar = this.f36114c) == null || hVar.getCurrentActivity() == null) {
            AppBrandLogger.m52831w("WebAppContainerDelegate", "schema:" + str);
            AppBrandLogger.m52831w("WebAppContainerDelegate", "mWebAppContext:" + this.f36114c);
            return;
        }
        AbstractC67724a aVar = (AbstractC67724a) this.f36114c.findServiceByInterface(AbstractC67724a.class);
        if (aVar.mo50464f(str)) {
            aVar.mo50442a(this.f36114c.getCurrentActivity(), str);
        } else {
            aVar.mo50440a(this.f36114c.getCurrentActivity(), str, (String) null);
        }
    }

    /* renamed from: a */
    public void mo50980a(final LarkWebView larkWebView) {
        AbstractC13794f.AbstractC13796b bVar = this.f36128q;
        String b = bVar != null ? bVar.mo50852b() : "";
        AnonymousClass11 r1 = new AbstractC48767b() {
            /* class com.bytedance.ee.webapp.v2.WebAppContainerDelegate.AnonymousClass11 */

            @Override // com.ss.android.lark.openapi.permission.AbstractC48767b
            /* renamed from: a */
            public void mo50795a(final C48772b bVar, final VerifyResponse verifyResponse) {
                larkWebView.post(new Runnable() {
                    /* class com.bytedance.ee.webapp.v2.WebAppContainerDelegate.AnonymousClass11.RunnableC138241 */

                    public void run() {
                        Log.m165379d("WebAppContainerDelegate", "config onPermissionGranted");
                        Activity u = WebAppContainerDelegate.this.mo91997u();
                        if (u == null || u.isDestroyed() || u.isFinishing()) {
                            Log.m165383e("WebAppContainerDelegate", "config onPermissionGranted but activity is gone");
                        } else {
                            WebAppContainerDelegate.this.mo50986a(bVar, verifyResponse);
                        }
                    }
                });
            }

            @Override // com.ss.android.lark.openapi.permission.AbstractC48767b
            /* renamed from: a */
            public void mo50796a(C48772b bVar, String str) {
                Log.m165379d("WebAppContainerDelegate", "Config permission failed appId:" + bVar.mo170349a() + ", error:" + str);
            }
        };
        if (C13802g.m55926a().mo50866b().mo50838a("openplatform.api.use_new_config")) {
            Log.m165379d("WebAppContainerDelegate", "register config plugin");
            mo51007e().getDefaultPluginContainer().mo92183u().mo92199a(new H5ConfigPlugin(r1, this.f36106F));
        } else {
            Log.m165379d("WebAppContainerDelegate", "register config handler");
            this.f36136y = new C13773d(larkWebView, b, r1);
            mo92000x().mo67339a("config", this.f36136y);
        }
        mo92000x().mo67339a("getSDKConfig", new C13781g(larkWebView));
    }

    /* renamed from: a */
    public void mo50986a(C48772b bVar, VerifyResponse verifyResponse) {
        if (C13772c.m55813a()) {
            this.f36112a.mo50790a(bVar, verifyResponse);
            this.f36131t.mo51071a(C13772c.m55812a(bVar.mo170354f()), this.f36112a.mo50789a());
            this.f36113b = bVar.mo170349a();
            m56003d(bVar.mo170354f());
        } else {
            this.f36124m.mo50802a(bVar, verifyResponse);
            if (!TextUtils.equals(this.f36113b, this.f36114c.getAppId())) {
                this.f36113b = this.f36114c.getAppId();
                m56003d(bVar.mo170354f());
            }
        }
        if (!TextUtils.isEmpty(this.f36113b)) {
            m56000a(false, bVar.mo170354f());
            if (C13772c.m55813a()) {
                this.f36131t.mo51075d(this.f36112a.mo50789a());
            } else {
                this.f36131t.mo51075d(this.f36124m.mo50804c());
            }
            if (!C13772c.m55814b(this.f36113b)) {
                AbstractC67735c cVar = (AbstractC67735c) this.f36114c.findServiceByInterface(AbstractC67735c.class);
                if ((cVar instanceof C13492c) && ((C13492c) cVar).mo50200c() != AbsPermissionSyncWrapper.SyncAuthState.SUCCESS) {
                    if (C13772c.m55813a()) {
                        cVar.mo49509a(this.f36113b, this.f36112a.mo50789a());
                    } else {
                        cVar.mo49509a(this.f36113b, this.f36124m.mo50804c());
                    }
                }
            }
            AppBrandLogger.m52830i("WebAppContainerDelegate", "handlePermissionGranted");
            List<String> g = bVar.mo170355g();
            JSONObject jSONObject = new JSONObject();
            if (g != null && !g.isEmpty()) {
                try {
                    jSONObject.put("apis", (Object) g);
                } catch (JSONException e) {
                    Log.m165390i("WebAppContainerDelegate", "", e);
                }
            }
            Log.m165379d("WebAppContainerDelegate", "Config permission success appId:" + this.f36113b + ", " + jSONObject.toString());
        }
    }

    @Override // com.larksuite.component.webview.container.dto.AbstractInjectWebViewDelegate, com.larksuite.component.webview.container.dto.IWebContainerContract.IWebContainerView.AbstractC25824a
    /* renamed from: a */
    public void mo50978a(WebView webView, String str) {
        this.f36102B.mo51052a(str, this.f36114c);
        super.mo50978a(webView, str);
        WebAppDelegateBinder webAppDelegateBinder = this.f36117f;
        if (webAppDelegateBinder != null) {
            webAppDelegateBinder.notifyFirstFrameDraw();
            this.f36117f.notifyPageStarted(str);
        }
        C13846g gVar = this.f36131t;
        if (gVar != null) {
            gVar.mo51074c(str);
        }
        C13802g.m55926a().mo50866b().mo50840b(str);
        if (mo51011i()) {
            this.f36134w.mo51079a(true);
        }
        m56005e(str);
    }

    @Override // com.larksuite.component.webview.container.dto.AbstractInjectWebViewDelegate, com.larksuite.component.webview.container.dto.IWebContainerContract.IWebContainerView.AbstractC25824a
    /* renamed from: a */
    public void mo50975a(WebView webView, int i) {
        WebAppDelegateBinder webAppDelegateBinder = this.f36117f;
        if (webAppDelegateBinder != null) {
            webAppDelegateBinder.notifyProgressChanged(i);
        }
    }

    @Override // com.larksuite.component.webview.container.dto.AbstractInjectWebViewDelegate, com.larksuite.component.webview.container.dto.IWebContainerContract.IWebContainerView.AbstractC25824a
    /* renamed from: a */
    public void mo50976a(WebView webView, int i, String str, String str2) {
        super.mo50976a(webView, i, str, str2);
        if (mo51011i()) {
            this.f36134w.mo51080b();
        }
    }

    @Override // com.larksuite.component.webview.container.dto.AbstractInjectWebViewDelegate
    /* renamed from: a */
    public void mo50979a(Fragment fragment) {
        ContainerDelegateDataHelper bVar = this.f36102B;
        if (bVar != null) {
            Iterator<C67462h> it = bVar.mo51053b().iterator();
            while (it.hasNext()) {
                WebContainerDelegateLogUtils.f36209a.mo51087c(it.next());
            }
        }
        WebContainerDelegateLogUtils.f36209a.mo51087c(this.f36114c);
        AbstractC13794f.AbstractC13800f fVar = this.f36129r;
        if (fVar != null) {
            fVar.mo50859a(mo50999c());
        }
        try {
            WebAppDelegateBinder webAppDelegateBinder = this.f36117f;
            if (webAppDelegateBinder != null) {
                webAppDelegateBinder.setCallback(null);
            }
            AbstractC25576a defaultPluginContainer = this.f36114c.getDefaultPluginContainer();
            if (defaultPluginContainer != null) {
                defaultPluginContainer.ah_();
            }
            AbstractC67720a aVar = (AbstractC67720a) this.f36114c.findServiceByInterface(AbstractC67720a.class);
            if (aVar != null) {
                aVar.mo235075e();
            }
            AbstractC13780f fVar2 = this.f36124m;
            if (fVar2 != null) {
                fVar2.mo50787b();
            }
            this.f36114c.destroy();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
        this.f36102B.mo51051a();
        C13802g.m55926a().mo50866b().mo50834a(fragment);
        this.f36127p = null;
        this.f36126o = false;
        if (this.f36103C) {
            this.f36103C = false;
            WebView.setWebContentsDebuggingEnabled(false);
        }
    }

    /* renamed from: a */
    public void mo50985a(ITitleController iTitleController) {
        this.f36135x = iTitleController;
    }

    /* renamed from: a */
    public void mo50990a(boolean z) {
        WebMoreCommonItem webMoreCommonItem = new WebMoreCommonItem(this.f36114c, z ? 2131234584 : 2131234574, UIUtils.getString(mo50994b(), z ? R.string.OpenPlatform_AppActions_UnfavoriteBttn : R.string.OpenPlatform_AppActions_FavoriteBttn), new WebMoreCommonItem.AbstractC13812a() {
            /* class com.bytedance.ee.webapp.v2.WebAppContainerDelegate.AnonymousClass15 */

            @Override // com.bytedance.ee.webapp.menu.WebMoreCommonItem.AbstractC13812a
            /* renamed from: a */
            public void mo50895a(WebMoreCommonItem.Type type, boolean z, C13813a aVar) {
                AppBrandLogger.m52830i("WebAppContainerDelegate", "notifyItemChange");
                WebAppContainerDelegate.this.mo50981a(type, z);
                C13814b.m55964a(WebAppContainerDelegate.this.f36114c, type, z, false, aVar);
            }
        });
        this.f36107G = webMoreCommonItem;
        webMoreCommonItem.mo50891a(this.f36113b);
        this.f36107G.mo50892a(z);
        this.f36107G.mo91920b(2);
        mo91999w().mo67308b().mo67318a(this.f36107G, 0);
    }

    @Override // com.bytedance.ee.webapp.v2.AbstractC13836d
    /* renamed from: a */
    public boolean mo50991a() {
        return mo91998v() != null && mo91998v().isAdded();
    }

    @Override // com.larksuite.component.webview.container.dto.AbstractInjectWebViewDelegate
    /* renamed from: a */
    public void mo50974a(int i, int i2, Intent intent) {
        Map map;
        super.mo50974a(i, i2, intent);
        C67462h hVar = this.f36114c;
        if (hVar != null) {
            if (hVar.isDestroying() || this.f36114c.isDestroyed()) {
                AppBrandLogger.m52830i("WebAppContainerDelegate", "appContext destroyed");
                return;
            }
            if (i == 5 && i2 == 51 && intent != null && (map = (Map) intent.getSerializableExtra("extra_change_permission_map")) != null) {
                for (Map.Entry entry : map.entrySet()) {
                    ((AbstractC67733a) this.f36114c.findServiceByInterface(AbstractC67733a.class)).mo50183b(((Integer) entry.getKey()).intValue(), ((Boolean) entry.getValue()).booleanValue());
                    AppBrandLogger.m52830i("WebAppContainerDelegate", "change permission ", entry.getKey(), " ", entry.getValue());
                }
                if (map.size() > 0) {
                    HostDependManager.getInst().syncPermissionToService(this.f36114c);
                }
            }
            if (this.f36131t.mo51072a(i, i2, intent)) {
                Log.m165389i("WebAppContainerDelegate", "onActivityResult by PluginManager");
            } else {
                ApiHandlerManager inst = ApiHandlerManager.getInst(this.f36114c);
                if (inst != null) {
                    for (AbstractC65803f fVar : new ArrayList(inst.getNewActivityResultApiHandler())) {
                        fVar.handleActivityResult(i, i2, intent);
                    }
                }
            }
            ApiHandlerManager.getInst(this.f36114c).unRegisterNewActivityResultAllHandler();
        }
    }

    /* renamed from: a */
    public boolean mo50993a(SendHttpResponse sendHttpResponse) {
        try {
            WorkplaceConfigResponse workplaceConfigResponse = (WorkplaceConfigResponse) new Gson().fromJson(sendHttpResponse.json_body, WorkplaceConfigResponse.class);
            if (workplaceConfigResponse != null && workplaceConfigResponse.getCode() == 0) {
                if (workplaceConfigResponse.getData() != null) {
                    WorkplaceConfigData data = workplaceConfigResponse.getData();
                    AppBrandLogger.m52830i("WebAppContainerDelegate", "data.isUserCommon :" + data.isUserCommon);
                    return data.isUserCommon;
                }
            }
            AppBrandLogger.m52829e("WebAppContainerDelegate", "searchCommonItemByAppId data is null");
            return false;
        } catch (JsonSyntaxException e) {
            AppBrandLogger.m52829e("WebAppContainerDelegate", "searchCommonItemByAppId error : ", e);
        } catch (Throwable unused) {
        }
        return false;
    }

    /* renamed from: a */
    public void mo50989a(String str, final IWebTabCallbackInterface iWebTabCallbackInterface) {
        AbstractC13135b bVar = (AbstractC13135b) mo51020r().findServiceByInterface(AbstractC13135b.class);
        if (bVar == null) {
            AppBrandLogger.m52829e("WebAppContainerDelegate", "service is null ,so addCommonApp return");
            return;
        }
        bVar.mo49189b(str, new C13141f.AbstractC13143a() {
            /* class com.bytedance.ee.webapp.v2.WebAppContainerDelegate.C138273 */

            @Override // com.bytedance.ee.larkbrand.menu.C13141f.AbstractC13143a
            /* renamed from: a */
            public void mo49197a(SendHttpResponse sendHttpResponse, C13141f.C13144b bVar) {
                AppBrandLogger.m52830i("WebAppContainerDelegate", "addCommonApp success");
                IWebTabCallbackInterface iWebTabCallbackInterface = iWebTabCallbackInterface;
                if (iWebTabCallbackInterface != null) {
                    try {
                        iWebTabCallbackInterface.onAppAddResult(true);
                        C13814b.m55964a(WebAppContainerDelegate.this.f36114c, WebMoreCommonItem.Type.ADD, true, true, null);
                    } catch (RemoteException e) {
                        e.printStackTrace();
                        AppBrandLogger.m52829e("WebAppContainerDelegate", "addCommonApp callback exception ", e);
                    }
                }
                WebAppContainerDelegate.this.mo50981a(WebMoreCommonItem.Type.ADD, true);
            }

            @Override // com.bytedance.ee.larkbrand.menu.C13141f.AbstractC13143a
            /* renamed from: a */
            public void mo49198a(ErrorResult errorResult, C13141f.C13144b bVar) {
                AppBrandLogger.m52830i("WebAppContainerDelegate", "addCommonApp error");
                IWebTabCallbackInterface iWebTabCallbackInterface = iWebTabCallbackInterface;
                if (iWebTabCallbackInterface != null) {
                    try {
                        iWebTabCallbackInterface.onAppAddResult(false);
                        C13814b.m55964a(WebAppContainerDelegate.this.f36114c, WebMoreCommonItem.Type.ADD, false, true, WebAppContainerDelegate.this.mo50972a(errorResult));
                    } catch (RemoteException e) {
                        e.printStackTrace();
                        AppBrandLogger.m52829e("WebAppContainerDelegate", "addCommonApp error callback exception ", e);
                    }
                }
                WebAppContainerDelegate.this.mo50981a(WebMoreCommonItem.Type.ADD, false);
            }
        });
    }

    /* renamed from: a */
    public void mo50981a(WebMoreCommonItem.Type type, boolean z) {
        WebMoreCommonItem.Type type2 = WebMoreCommonItem.Type.ADD;
        int i = R.string.OpenPlatform_AppActions_NetworkErrToast;
        if (type == type2) {
            Activity currentActivity = this.f36114c.getCurrentActivity();
            Context applicationContext = this.f36114c.getApplicationContext();
            if (z) {
                i = R.string.OpenPlatform_AppActions_AddedToast;
            }
            ToastManager.showToast(currentActivity, applicationContext.getString(i), 0);
        } else if (type == WebMoreCommonItem.Type.REMOVE) {
            Activity currentActivity2 = this.f36114c.getCurrentActivity();
            Context applicationContext2 = this.f36114c.getApplicationContext();
            if (z) {
                i = R.string.OpenPlatform_AppActions_RemovedToast;
            }
            ToastManager.showToast(currentActivity2, applicationContext2.getString(i), 0);
        }
    }

    @Override // com.larksuite.component.webview.container.dto.AbstractInjectWebViewDelegate, com.larksuite.component.webview.container.dto.IWebContainerContract.IWebContainerView.AbstractC25824a
    /* renamed from: a */
    public void mo50977a(WebView webView, ClientCertRequest clientCertRequest) {
        AbstractC13794f.AbstractC13798d dVar = this.f36130s;
        if (dVar != null) {
            dVar.mo50856a(clientCertRequest);
        }
        super.mo50977a(webView, clientCertRequest);
    }

    @Override // com.bytedance.ee.webapp.v2.AbstractC13836d
    /* renamed from: c */
    public Activity mo50999c() {
        return mo91997u();
    }

    @Override // com.bytedance.ee.webapp.v2.AbstractC13836d
    /* renamed from: i */
    public boolean mo51011i() {
        if (this.f36134w != null) {
            return true;
        }
        return false;
    }

    /* renamed from: y */
    private int m56006y() {
        if (mo51011i()) {
            return this.f36134w.mo51082d();
        }
        return -1;
    }

    @Override // com.bytedance.ee.webapp.v2.AbstractC13836d
    /* renamed from: f */
    public String mo51008f() {
        if (mo51011i()) {
            return this.f36134w.mo51081c();
        }
        return this.f36113b;
    }

    @Override // com.bytedance.ee.webapp.v2.AbstractC13836d
    /* renamed from: g */
    public ViewGroup mo51009g() {
        return mo91999w().mo67313f();
    }

    @Override // com.bytedance.ee.webapp.v2.AbstractC13836d
    /* renamed from: h */
    public CallbackManager mo51010h() {
        return mo92000x().mo67337a();
    }

    /* renamed from: j */
    public LarkWebView mo51003d() {
        return (LarkWebView) mo91999w().mo67314g();
    }

    @Override // com.larksuite.component.webview.container.dto.AbstractInjectWebViewDelegate
    /* renamed from: k */
    public boolean mo51013k() {
        AbstractC13794f.AbstractC13800f fVar = this.f36129r;
        if (fVar != null) {
            return fVar.mo50861a();
        }
        return false;
    }

    /* renamed from: n */
    public String mo51016n() {
        C13808i iVar = this.f36116e;
        if (iVar != null) {
            return iVar.mo50886h();
        }
        return "";
    }

    /* renamed from: s */
    public ViewStub mo51021s() {
        return mo91999w().mo67311d();
    }

    public WebAppContainerDelegate() {
        m55989I();
    }

    /* renamed from: E */
    private void m55985E() {
        if (!TextUtils.isEmpty(this.f36113b)) {
            m55986F();
            return;
        }
        AppBrandLogger.m52830i("WebAppContainerDelegate", "is not h5 app so no need add common menu");
    }

    /* renamed from: F */
    private void m55986F() {
        ((AbstractC13135b) this.f36114c.findServiceByInterface(AbstractC13135b.class)).mo49186a(this.f36113b, new C13141f.AbstractC13143a() {
            /* class com.bytedance.ee.webapp.v2.WebAppContainerDelegate.AnonymousClass16 */

            @Override // com.bytedance.ee.larkbrand.menu.C13141f.AbstractC13143a
            /* renamed from: a */
            public void mo49197a(SendHttpResponse sendHttpResponse, C13141f.C13144b bVar) {
                if (WebAppContainerDelegate.this.f36114c != null) {
                    boolean a = WebAppContainerDelegate.this.mo50993a(sendHttpResponse);
                    AppBrandLogger.m52830i("WebAppContainerDelegate", "searchCommon success , isCommon = " + a);
                    WebAppContainerDelegate.this.mo50990a(a);
                    WebAppContainerDelegate.this.f36121j = true;
                    C13814b.m55965a(WebAppContainerDelegate.this.f36114c, true, false, null);
                }
            }

            @Override // com.bytedance.ee.larkbrand.menu.C13141f.AbstractC13143a
            /* renamed from: a */
            public void mo49198a(ErrorResult errorResult, C13141f.C13144b bVar) {
                AppBrandLogger.m52830i("WebAppContainerDelegate", "searchCommonItemByAppId error " + errorResult);
                if (WebAppContainerDelegate.this.f36114c != null) {
                    WebAppContainerDelegate.this.mo50990a(false);
                    WebAppContainerDelegate.this.f36121j = true;
                    C13814b.m55965a(WebAppContainerDelegate.this.f36114c, false, false, WebAppContainerDelegate.this.mo50972a(errorResult));
                }
            }
        });
    }

    /* renamed from: H */
    private void m55988H() {
        C13805h.m55929a().mo50868a("app_id", mo51008f());
        C13805h.m55929a().mo50868a("is_Tab_Mode", String.valueOf(mo51011i()));
    }

    /* renamed from: J */
    private void m55990J() {
        if (TextUtils.isEmpty(this.f36113b)) {
            m56007z();
            m55992L();
            return;
        }
        m55991K();
    }

    /* renamed from: L */
    private void m55992L() {
        if (this.f36108H != null) {
            mo91999w().mo67308b().mo67318a(this.f36108H, 0);
        }
    }

    /* renamed from: o */
    public void mo51017o() {
        C25838g a = m55993a(mo91998v(), this.f36116e, 3);
        if (a != null) {
            mo91999w().mo67308b().mo67318a(a, 0);
        }
    }

    /* renamed from: C */
    private void m55983C() {
        if (!TextUtils.isEmpty(mo51008f())) {
            this.f36116e = null;
            C13802g.m55926a().mo50866b().mo50836a(mo51008f(), new AbstractC13753a() {
                /* class com.bytedance.ee.webapp.v2.WebAppContainerDelegate.AnonymousClass13 */

                @Override // com.bytedance.ee.webapp.AbstractC13753a
                /* renamed from: a */
                public void mo50713a(final C13808i iVar) {
                    C67866g.m264027a(new Runnable() {
                        /* class com.bytedance.ee.webapp.v2.WebAppContainerDelegate.AnonymousClass13.RunnableC138251 */

                        public void run() {
                            C13808i iVar = iVar;
                            if (!(iVar == null || iVar.mo50886h() == null)) {
                                WebAppContainerDelegate.this.f36116e = iVar;
                                if (!WebAppContainerDelegate.this.mo51011i()) {
                                    if (WebAppContainerDelegate.this.f36116e != null) {
                                        WebAppContainerDelegate.this.mo91999w().mo67308b().mo67334f(WebAppContainerDelegate.this.f36116e.mo50879c());
                                        WebAppContainerDelegate.this.mo51017o();
                                    } else {
                                        WebAppContainerDelegate.this.mo91999w().mo67308b().mo67334f(false);
                                    }
                                }
                            }
                            C13808i iVar2 = iVar;
                            if (iVar2 != null && iVar2.mo50884f() != null) {
                                WebAppContainerDelegate.this.f36120i = new C25835f.C25837a("").mo91912a(2).mo91915b(iVar.mo50880d()).mo91916c(iVar.mo50882e()).mo91917d(iVar.mo50884f()).mo91913a(WebAppContainerDelegate.this.f36113b).mo91914a();
                                WebAppContainerDelegate.this.mo91999w().mo67308b().mo67316a(WebAppContainerDelegate.this.f36120i);
                                WebAppContainerDelegate.this.f36122k = iVar.mo50884f();
                                Log.m165389i("WebAppContainerDelegate", "webapp name = " + iVar.mo50884f() + " , iconUrl = " + iVar.mo50880d());
                            }
                        }
                    });
                }
            });
        }
    }

    /* renamed from: D */
    private void m55984D() {
        this.f36133v = C13802g.m55926a().mo50866b().mo50842c(mo51008f());
        C25838g a = m55993a(mo91998v(), this.f36133v, 10);
        C13808i iVar = this.f36133v;
        if (iVar != null) {
            iVar.mo50873a(new View.OnClickListener() {
                /* class com.bytedance.ee.webapp.v2.WebAppContainerDelegate.AnonymousClass14 */

                public void onClick(View view) {
                    Intent intent = new Intent(C13791e.f36047a);
                    Bundle bundle = new Bundle();
                    bundle.putString(C13791e.f36048b, WebAppContainerDelegate.this.f36113b);
                    bundle.putInt(C13791e.f36049c, 0);
                    if (C13772c.m55813a()) {
                        bundle.putString(C13791e.f36050d, WebAppContainerDelegate.this.f36112a.mo50789a());
                    } else {
                        bundle.putString(C13791e.f36050d, WebAppContainerDelegate.this.f36124m.mo50804c());
                    }
                    intent.putExtras(bundle);
                    WebAppContainerDelegate.this.mo91998v().startActivityForResult(intent, 5);
                }
            });
        }
        if (a != null) {
            mo91999w().mo67308b().mo67318a(a, 1);
        }
    }

    /* renamed from: G */
    private void m55987G() {
        this.f36120i = new C25835f.C25837a("").mo91912a(2).mo91917d(UIUtils.getString(mo50994b(), R.string.lark_brand_loading)).mo91913a(this.f36113b).mo91914a();
    }

    /* renamed from: K */
    private void m55991K() {
        if (this.f36132u) {
            if (mo91999w().mo67308b() != null) {
                mo91999w().mo67308b().mo67327b(false);
            }
            m55983C();
            return;
        }
        mo51018p();
    }

    /* renamed from: z */
    private void m56007z() {
        ArrayList<C25838g> a = C13783d.m55867a(mo91997u(), mo91998v(), new AbstractC13794f.AbstractC13797c() {
            /* class com.bytedance.ee.webapp.v2.$$Lambda$WebAppContainerDelegate$qQ43jOLezPpWs1yzJZ1UHlN_iXI */

            @Override // com.bytedance.ee.webapp.AbstractC13794f.AbstractC13797c
            public final void itemClicked(int i) {
                WebAppContainerDelegate.this.m55996a((WebAppContainerDelegate) i);
            }
        });
        if (!(a == null || a.isEmpty())) {
            for (int size = a.size() - 1; size >= 0; size--) {
                mo91999w().mo67308b().mo67318a(a.get(size), 0);
            }
        }
    }

    /* renamed from: l */
    public String mo51014l() {
        if (this.f36114c == null) {
            AppBrandLogger.m52830i("WebAppContainerDelegate", "mWebAppContext is null");
            return "";
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("app_id", (Object) this.f36113b);
        jSONObject.put("app_name", (Object) this.f36122k);
        jSONObject.put("app_type", (Object) this.f36114c.getAppType());
        jSONObject.put("page_path", (Object) this.f36104D);
        return jSONObject.toString();
    }

    /* renamed from: p */
    public void mo51018p() {
        m56007z();
        m55987G();
        m55983C();
        if (!mo51011i()) {
            Log.m165389i("WebAppContainerDelegate", "not tab so add common menu");
            m55985E();
        }
        m55984D();
        m55981A();
        m55992L();
    }

    /* renamed from: A */
    private void m55981A() {
        boolean featureGating = LarkExtensionManager.getInstance().getExtension().getFeatureGating("openplatform.feedback.show", false);
        boolean a = C66780j.m260633a().mo232687a(this.f36113b);
        final String c = C66780j.m260633a().mo232689c();
        boolean d = C66780j.m260633a().mo232690d();
        AppBrandLogger.m52830i("WebAppContainerDelegate", "feedbackFgV2：" + featureGating + "   appIsInWhiteList:" + a + "   isOpenToAll:" + d);
        if (!featureGating) {
            return;
        }
        if (a || d) {
            mo91999w().mo67308b().mo67318a(new C25838g(2131234580, UIUtils.getString(mo50994b(), R.string.lark_brand_feedback), new OnSingleClickListener() {
                /* class com.bytedance.ee.webapp.v2.WebAppContainerDelegate.AnonymousClass10 */

                @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
                public void onSingleClick(View view) {
                    if (WebAppContainerDelegate.this.mo91998v() != null && WebAppContainerDelegate.this.mo91998v().isAdded()) {
                        if (TextUtils.isEmpty(c)) {
                            AppBrandLogger.m52830i("WebAppContainerDelegate", "feedBackAppLink is null");
                            return;
                        }
                        String l = WebAppContainerDelegate.this.mo51014l();
                        Uri.Builder buildUpon = Uri.parse(c).buildUpon();
                        buildUpon.appendQueryParameter("bdp_launch_query", l);
                        WebAppContainerDelegate.this.mo50988a(buildUpon.build().toString());
                    }
                }
            }), 1);
        }
    }

    /* renamed from: B */
    private void m55982B() {
        this.f36112a = new C13771b();
        this.f36127p = new C13764c(C13802g.m55926a().mo50866b().mo50844e());
        AbstractC13794f.AbstractC13796b bVar = this.f36128q;
        if (bVar != null) {
            bVar.mo50854d();
            this.f36128q.mo50851a(this.f36113b);
            AppBrandLogger.m52830i("WebAppContainerDelegate", "webapp audit init and report " + this.f36113b);
        }
        TracingCoreSpan baseTraceSpan = mo51003d().getBaseTraceSpan();
        if (baseTraceSpan != null) {
            this.f36106F = new OPTrace(baseTraceSpan.getTracingID());
        } else {
            this.f36106F = OPTraceService.m192757a();
        }
        AbstractC13780f a = WebappAuthStrategyCreator.m55790a(this.f36106F);
        this.f36124m = a;
        a.mo50786a(this.f36114c, true);
    }

    @Override // com.bytedance.ee.webapp.v2.AbstractC13836d
    /* renamed from: b */
    public Context mo50994b() {
        if (mo91998v() != null) {
            return mo91998v().getContext();
        }
        return null;
    }

    /* renamed from: I */
    private void m55989I() {
        if (C13802g.m55926a().mo50866b() == null) {
            Log.m165383e("WebAppContainerDelegate", "WebAppHostDependManager.getInstance().getDependency() == null");
            return;
        }
        this.f36128q = C13802g.m55926a().mo50866b().mo50839b();
        this.f36137z = C13802g.m55926a().mo50866b().mo50841c();
        this.f36129r = C13802g.m55926a().mo50866b().mo50845f();
        this.f36130s = C13802g.m55926a().mo50866b().mo50846g();
        this.f36101A = C13802g.m55926a().mo50866b().mo50847h();
        this.f36115d = C13802g.m55926a().mo50866b().mo50843d();
        this.f36105E = C13802g.m55926a().mo50866b().mo50838a("openplatform.web.multi_task.open");
        Log.m165389i("WebAppContainerDelegate", "web multitask fg = " + this.f36105E);
    }

    /* renamed from: a */
    public void mo50982a(WebAppDelegateBinder webAppDelegateBinder) {
        this.f36117f = webAppDelegateBinder;
    }

    /* renamed from: a */
    private String m55995a(WebView webView) {
        String url = webView.getUrl();
        if (TextUtils.isEmpty(url)) {
            return this.f36104D;
        }
        return url;
    }

    @Override // com.larksuite.component.webview.container.dto.AbstractInjectWebViewDelegate, com.larksuite.component.webview.container.dto.IWebContainerContract.IWebContainerView.AbstractC25824a
    /* renamed from: b */
    public boolean mo50998b(String str) {
        AbstractC13794f.AbstractC13799e eVar = this.f36101A;
        if (eVar == null) {
            return false;
        }
        return eVar.mo50858a(str);
    }

    /* renamed from: b */
    private String m56001b(Bundle bundle) {
        if (bundle == null) {
            return "";
        }
        String string = bundle.getString("app_id", "");
        if (TextUtils.isEmpty(string)) {
            return bundle.getString("key_appid", "");
        }
        return string;
    }

    /* renamed from: a */
    public C13813a mo50972a(ErrorResult errorResult) {
        return new C13813a(errorResult.getErrorCode(), errorResult.getDisplayMsg());
    }

    protected WebAppContainerDelegate(Parcel parcel) {
        super(parcel);
        Log.m165389i("WebAppContainerDelegate", "go into WebAppContainerDelegate");
        WebAppDelegateBinder webAppDelegateBinder = (WebAppDelegateBinder) parcel.readStrongBinder();
        this.f36117f = webAppDelegateBinder;
        if (webAppDelegateBinder != null) {
            try {
                webAppDelegateBinder.setCallback(new IWebAppBinderCallbackInterface.Stub() {
                    /* class com.bytedance.ee.webapp.v2.WebAppContainerDelegate.BinderC138284 */

                    @Override // com.bytedance.ee.webapp.v2.IWebAppBinderCallbackInterface
                    public String getBotId() throws RemoteException {
                        return WebAppContainerDelegate.this.mo51016n();
                    }

                    @Override // com.bytedance.ee.webapp.v2.IWebAppBinderCallbackInterface
                    public boolean hasInit() throws RemoteException {
                        return WebAppContainerDelegate.this.f36118g;
                    }

                    @Override // com.bytedance.ee.webapp.v2.IWebAppBinderCallbackInterface
                    public boolean canGoBack() {
                        boolean z;
                        if (WebAppContainerDelegate.this.f36118g) {
                            z = WebAppContainerDelegate.this.mo51003d().canGoBack();
                        } else {
                            z = false;
                        }
                        Log.m165389i("WebAppContainerDelegate", "canGoBack init = " + WebAppContainerDelegate.this.f36118g + " , canBack = " + z);
                        return z;
                    }

                    @Override // com.bytedance.ee.webapp.v2.IWebAppBinderCallbackInterface
                    public boolean canGoForward() throws RemoteException {
                        boolean z;
                        if (WebAppContainerDelegate.this.f36118g) {
                            z = WebAppContainerDelegate.this.mo51003d().canGoForward();
                        } else {
                            z = false;
                        }
                        Log.m165389i("WebAppContainerDelegate", "canForward init =" + WebAppContainerDelegate.this.f36118g + " , canForward = " + z);
                        return z;
                    }

                    @Override // com.bytedance.ee.webapp.v2.IWebAppBinderCallbackInterface
                    public void goBack() throws RemoteException {
                        if (WebAppContainerDelegate.this.f36118g) {
                            WebAppContainerDelegate.this.mo51003d().goBack();
                        }
                        Log.m165389i("WebAppContainerDelegate", "go back mHashInit = " + WebAppContainerDelegate.this.f36118g);
                    }

                    @Override // com.bytedance.ee.webapp.v2.IWebAppBinderCallbackInterface
                    public void goForward() throws RemoteException {
                        if (WebAppContainerDelegate.this.f36118g) {
                            WebAppContainerDelegate.this.mo51003d().goForward();
                        }
                        Log.m165389i("WebAppContainerDelegate", "go back mHashInit = " + WebAppContainerDelegate.this.f36118g);
                    }

                    @Override // com.bytedance.ee.webapp.v2.IWebAppBinderCallbackInterface
                    public void setTabTitleBarHeight(int i) throws RemoteException {
                        Log.m165389i("WebAppContainerDelegate", "setTitleBarHeight " + i);
                        WebAppContainerDelegate.this.f36119h = i;
                    }

                    @Override // com.bytedance.ee.webapp.v2.IWebAppBinderCallbackInterface
                    public void addCommonApp(String str, IWebTabCallbackInterface iWebTabCallbackInterface) throws RemoteException {
                        WebAppContainerDelegate.this.mo50989a(str, iWebTabCallbackInterface);
                    }

                    @Override // com.bytedance.ee.webapp.v2.IWebAppBinderCallbackInterface
                    public void removeCommonApp(String str, IWebTabCallbackInterface iWebTabCallbackInterface) throws RemoteException {
                        WebAppContainerDelegate.this.mo50997b(str, iWebTabCallbackInterface);
                    }

                    @Override // com.bytedance.ee.webapp.v2.IWebAppBinderCallbackInterface
                    public void requestCommonApp(String str, IWebTabCallbackInterface iWebTabCallbackInterface) throws RemoteException {
                        WebAppContainerDelegate.this.mo51001c(str, iWebTabCallbackInterface);
                    }

                    @Override // com.bytedance.ee.webapp.v2.IWebAppBinderCallbackInterface
                    public void fireEvent(String str, String str2) throws RemoteException {
                        AppBrandLogger.m52828d("WebAppContainerDelegate", "fireEvent", str, str2);
                        WebAppContainerDelegate.this.f36114c.getDefaultPluginContainer().mo92184v().mo92214a(str, JSONObject.parse(str2));
                    }
                });
            } catch (RemoteException e) {
                e.printStackTrace();
            }
            this.f36117f.notifyFirstDataLoaded();
        }
        m55989I();
    }

    /* renamed from: b */
    private void m56002b(LarkWebView larkWebView) {
        C12733b.m52710a().mo48218a(mo50999c(), larkWebView);
        C12733b.m52710a().mo48222a(HostExtensionManager.getInstance().getHostInterface().getAllNativeComponentType());
    }

    /* renamed from: d */
    private void m56003d(String str) {
        C67462h a = mo50973a((Bundle) null, this.f36113b);
        this.f36114c = a;
        this.f36124m.mo50786a(a, false);
        this.f36102B.mo51054b(str, this.f36114c);
        mo91999w().mo67308b().mo67329c();
        m55998a(Bundle.EMPTY);
        AbstractC13794f.AbstractC13801g gVar = this.f36137z;
        if (gVar != null) {
            gVar.mo50863a(mo91999w(), mo50994b());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m55996a(int i) {
        String str;
        if (mo50991a()) {
            if (TextUtils.isEmpty(mo51008f())) {
                str = "H5";
            } else {
                str = "WebPage";
            }
            C13765a.m55783a(str);
            C13783d.m55874a(this, mo51003d().getUrl(), new C13783d.AbstractC13789a(i) {
                /* class com.bytedance.ee.webapp.v2.$$Lambda$WebAppContainerDelegate$plPhSr6Axx4tV9mM1VNkFHCDYqQ */
                public final /* synthetic */ int f$1;

                {
                    this.f$1 = r2;
                }

                @Override // com.bytedance.ee.webapp.C13783d.AbstractC13789a
                public final void onSharedReceiveValue(String str, String str2, String str3, AbstractC13836d dVar, String str4) {
                    WebAppContainerDelegate.this.m55997a(this.f$1, str, str2, str3, dVar, str4);
                }
            });
        }
    }

    /* renamed from: e */
    private synchronized void m56005e(String str) {
        if (!this.f36105E) {
            Log.m165389i("WebAppContainerDelegate", "initMultitask web multitask fg not on , so return;");
        } else if (mo51011i()) {
            Log.m165389i("WebAppContainerDelegate", "initMultitask is tabMode so return");
        } else {
            C67462h hVar = this.f36114c;
            if (hVar == null || hVar.getCurrentActivity() == null) {
                Log.m165389i("WebAppContainerDelegate", "mWebAppContext == null || currentActivity == null so return");
                return;
            }
            if (this.f36125n == null) {
                this.f36125n = MultitaskHelper.m190620a(m55994a((Intent) null, str), false);
                m55999a(this.f36111K);
            } else {
                Log.m165389i("WebAppContainerDelegate", "new page so recreate MultitaskHelper");
                this.f36125n = this.f36125n.mo169042a(m55994a(new Intent(), str));
            }
        }
    }

    /* renamed from: a */
    private void m55998a(Bundle bundle) {
        this.f36131t = new C13846g(this.f36114c, this.f36127p, new C13792a(this.f36112a, this.f36113b), this, this.f36132u);
        m55990J();
        LarkWebView j = mo51003d();
        if (!(j == null || j.getCommonParams() == null)) {
            j.getCommonParams().put("app_id", this.f36113b);
        }
        AppInfoEntity appInfoEntity = new AppInfoEntity();
        appInfoEntity.appId = this.f36113b;
        appInfoEntity.appName = bundle.getString("title", "");
        AppbrandApplicationImpl.getInst(this.f36114c).setAppInfo(appInfoEntity);
        mo50980a(j);
        m56002b(j);
        m55988H();
        mo51003d().getServiceManager().mo49930a(C13845f.class);
        C13802g.m55926a().mo50866b().mo50835a(this, this.f36113b);
        AbstractC67720a aVar = (AbstractC67720a) this.f36114c.findServiceByInterface(AbstractC67720a.class);
        if (aVar != null) {
            aVar.mo235070a();
        }
        AbstractC13794f.AbstractC13796b bVar = this.f36128q;
        if (bVar != null) {
            bVar.mo50851a(this.f36113b);
        }
        C66310g gVar = this.f36109I;
        if (gVar != null) {
            gVar.mo231758a(this.f36113b, false, 5000);
        }
        if (!InspectDebugHelper.f166565a.mo230982a()) {
            return;
        }
        if (InspectDebugHelper.f166565a.mo230983a(this.f36113b)) {
            Log.m165389i("WebAppContainerDelegate", "web application can debug---mAppId---" + this.f36113b);
            this.f36103C = true;
            WebView.setWebContentsDebuggingEnabled(true);
            return;
        }
        Log.m165389i("WebAppContainerDelegate", "web application can not debug---mAppId---" + this.f36113b);
        this.f36103C = false;
        WebView.setWebContentsDebuggingEnabled(false);
    }

    /* renamed from: a */
    private void m55999a(final AbstractC13835a aVar) {
        final boolean z;
        C13816c cVar = new C13816c(this.f36114c, 2131234081, "", aVar);
        this.f36108H = cVar;
        cVar.mo91920b(1);
        AbstractC13794f.AbstractC13795a aVar2 = this.f36115d;
        if (aVar2 != null) {
            z = aVar2.mo50848a("ecosystem_web_mutitask_badge");
        } else {
            z = false;
        }
        Log.m165389i("WebAppContainerDelegate", "isGuide = " + z);
        this.f36108H.mo91919a(new OnSingleClickListener() {
            /* class com.bytedance.ee.webapp.v2.WebAppContainerDelegate.C138328 */

            /* access modifiers changed from: private */
            /* renamed from: a */
            public /* synthetic */ Unit m56074a() {
                Log.m165389i("WebAppContainerDelegate", "dropIntoBasket so finish");
                WebAppContainerDelegate.this.mo91997u().finish();
                return null;
            }

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                MultitaskHelper a = aVar.mo51032a();
                if (a != null) {
                    if (a.mo169049e()) {
                        Log.m165389i("WebAppContainerDelegate", "click to terminate multitask");
                        a.mo169050f();
                    } else {
                        Log.m165389i("WebAppContainerDelegate", "click to dropIntoBasket");
                        a.mo169045a(new Function0() {
                            /* class com.bytedance.ee.webapp.v2.$$Lambda$WebAppContainerDelegate$8$TIfGKuYHq1WlUauumkDbbBUseo0 */

                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return WebAppContainerDelegate.C138328.this.m56074a();
                            }
                        });
                    }
                    if (z) {
                        Log.m165389i("WebAppContainerDelegate", "isGuide so complteGuide");
                        WebAppContainerDelegate.this.f36115d.mo50849b("ecosystem_web_mutitask_badge");
                        return;
                    }
                    return;
                }
                Log.m165383e("WebAppContainerDelegate", "init float menu, but mMultiTaskHelper is null");
            }
        });
        this.f36108H.mo91925d(z);
        mo91999w().mo67308b().mo67334f(z);
        m55992L();
    }

    /* renamed from: a */
    private AbstractC48369g m55994a(final Intent intent, final String str) {
        return new AbstractC48369g() {
            /* class com.bytedance.ee.webapp.v2.WebAppContainerDelegate.C138339 */

            @Override // com.ss.android.lark.multitask.task.AbstractC48379u, com.ss.android.lark.multitask.task.AbstractC48369g
            public /* synthetic */ EventTracker O_() {
                return AbstractC48369g.CC.$default$O_(this);
            }

            @Override // com.ss.android.lark.multitask.task.AbstractC48369g
            public /* synthetic */ FragmentActivity p_() {
                return AbstractC48369g.CC.$default$p_(this);
            }

            @Override // com.ss.android.lark.multitask.task.AbstractC48379u
            /* renamed from: a */
            public Task mo23782a() {
                return new C48366c(mo23785d(), intent) {
                    /* class com.bytedance.ee.webapp.v2.WebAppContainerDelegate.C138339.C138341 */

                    @Override // com.ss.android.lark.multitask.task.C48366c, com.ss.android.lark.multitask.task.Task
                    /* renamed from: c */
                    public String mo23791c() {
                        return "web";
                    }

                    @Override // com.ss.android.lark.multitask.task.C48366c, com.ss.android.lark.multitask.task.Task
                    /* renamed from: d */
                    public String mo23792d() {
                        String str = str;
                        return "web:" + str;
                    }

                    @Override // com.ss.android.lark.multitask.task.C48366c, com.ss.android.lark.multitask.task.Task
                    /* renamed from: b */
                    public CharSequence mo23790b() {
                        if (!TextUtils.isEmpty(WebAppContainerDelegate.this.f36122k)) {
                            return WebAppContainerDelegate.this.f36122k;
                        }
                        if (TextUtils.isEmpty(WebAppContainerDelegate.this.f36123l)) {
                            return str;
                        }
                        return WebAppContainerDelegate.this.f36123l;
                    }

                    @Override // com.ss.android.lark.multitask.task.C48366c, com.ss.android.lark.multitask.task.Task
                    /* renamed from: a */
                    public Task.IconFactory mo23788a() {
                        if (WebAppContainerDelegate.this.f36120i == null || TextUtils.isEmpty(WebAppContainerDelegate.this.f36120i.mo91908b())) {
                            Log.m165389i("WebAppContainerDelegate", "multitask getIcon for default");
                            return new DrawableIconFactory(R.drawable.web_multitask_default_icon, "web_multitask_default_icon");
                        }
                        Log.m165389i("WebAppContainerDelegate", "multitask getIcon for iconUrl " + WebAppContainerDelegate.this.f36120i.mo91908b());
                        return new UrlIconFactory(WebAppContainerDelegate.this.f36120i.mo91908b());
                    }

                    @Override // com.ss.android.lark.multitask.task.C48366c, com.ss.android.lark.multitask.task.Task
                    /* renamed from: a */
                    public void mo23789a(Bundle bundle) {
                        int scrollY = WebAppContainerDelegate.this.mo51003d().getScrollY();
                        Log.m165389i("WebAppContainerDelegate", "web position = " + scrollY);
                        bundle.putAll(WebAppContainerDelegate.this.mo91998v().getArguments());
                        bundle.putInt("save_position", scrollY);
                        bundle.putString("save_url", str);
                        bundle.putString("url", str);
                        super.mo23789a(bundle);
                    }
                };
            }

            @Override // com.ss.android.lark.multitask.task.AbstractC48379u
            /* renamed from: b */
            public AbstractC48378t mo23783b() {
                Log.m165389i("WebAppContainerDelegate", "RemoteActivity Start");
                return new WebContainerDelegateStarter(WebContainerActivity.class);
            }

            @Override // com.ss.android.lark.multitask.task.AbstractC48369g
            /* renamed from: d */
            public FragmentActivity mo23785d() {
                return (FragmentActivity) WebAppContainerDelegate.this.f36114c.getCurrentActivity();
            }

            @Override // com.ss.android.lark.multitask.task.AbstractC48379u
            /* renamed from: e */
            public AbstractC48375n mo23786e() {
                if (C26252ad.m94993b(WebAppContainerDelegate.this.mo50994b())) {
                    Log.m165389i("WebAppContainerDelegate", "in main process so use GlobalTaskContainer");
                    return GlobalTaskContainer.f121801b;
                }
                Log.m165389i("WebAppContainerDelegate", "p0 process so use RemoteTaskContainer");
                return new RemoteTaskContainer();
            }
        };
    }

    @Override // com.larksuite.component.webview.container.dto.AbstractInjectWebViewDelegate
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        WebAppDelegateBinder webAppDelegateBinder = this.f36117f;
        if (webAppDelegateBinder != null) {
            parcel.writeStrongBinder(webAppDelegateBinder);
        }
    }

    @Override // com.larksuite.component.webview.container.dto.AbstractInjectWebViewDelegate, com.larksuite.component.webview.container.dto.IWebContainerContract.IWebContainerView.AbstractC25824a
    /* renamed from: c */
    public boolean mo51002c(WebView webView, String str) {
        AbstractC13794f.AbstractC13799e eVar = this.f36101A;
        if (eVar != null && eVar.mo50858a(str)) {
            return this.f36101A.mo50857a(mo91997u(), str);
        }
        return false;
    }

    /* renamed from: c */
    public void mo51001c(String str, final IWebTabCallbackInterface iWebTabCallbackInterface) {
        AbstractC13135b bVar = (AbstractC13135b) mo51020r().findServiceByInterface(AbstractC13135b.class);
        if (bVar == null) {
            AppBrandLogger.m52829e("WebAppContainerDelegate", "service is null , so requestCommonApp return;  ");
        }
        bVar.mo49186a(str, new C13141f.AbstractC13143a() {
            /* class com.bytedance.ee.webapp.v2.WebAppContainerDelegate.C138306 */

            @Override // com.bytedance.ee.larkbrand.menu.C13141f.AbstractC13143a
            /* renamed from: a */
            public void mo49198a(ErrorResult errorResult, C13141f.C13144b bVar) {
                IWebTabCallbackInterface iWebTabCallbackInterface = iWebTabCallbackInterface;
                if (iWebTabCallbackInterface != null) {
                    try {
                        iWebTabCallbackInterface.onAppCommonResult(false);
                        C13814b.m55965a(WebAppContainerDelegate.this.mo51020r(), false, true, WebAppContainerDelegate.this.mo50972a(errorResult));
                    } catch (RemoteException e) {
                        e.printStackTrace();
                        AppBrandLogger.m52829e("WebAppContainerDelegate", "onCommonResult exception ", e);
                    }
                }
            }

            @Override // com.bytedance.ee.larkbrand.menu.C13141f.AbstractC13143a
            /* renamed from: a */
            public void mo49197a(SendHttpResponse sendHttpResponse, C13141f.C13144b bVar) {
                boolean a = WebAppContainerDelegate.this.mo50993a(sendHttpResponse);
                AppBrandLogger.m52830i("WebAppContainerDelegate", "tab searchCommon success : " + a);
                if (iWebTabCallbackInterface == null) {
                    AppBrandLogger.m52829e("WebAppContainerDelegate", "tab searchCommonItemByAppId listener null");
                }
                try {
                    iWebTabCallbackInterface.onAppCommonResult(a);
                    C13814b.m55965a(WebAppContainerDelegate.this.mo51020r(), true, true, null);
                } catch (RemoteException e) {
                    e.printStackTrace();
                    AppBrandLogger.m52829e("WebAppContainerDelegate", "tab searchCommonItemByAppId exception : ", e);
                }
            }
        });
    }

    /* renamed from: e */
    private void m56004e(WebView webView, String str) {
        if (!this.f36105E) {
            Log.m165389i("WebAppContainerDelegate", "handleSavedPosition multitask fg not on , so return");
        } else if (mo51011i()) {
            Log.m165389i("WebAppContainerDelegate", "handleSavedPosition is tab mode so return");
        } else {
            try {
                Bundle arguments = mo91998v().getArguments();
                int i = arguments.getInt("save_position", -1);
                String string = arguments.getString("save_url");
                Log.m165389i("WebAppContainerDelegate", "onPageFinished savePosition = " + i);
                if (i > 0 && str.equals(string)) {
                    webView.scrollTo(0, i);
                    Log.m165389i("WebAppContainerDelegate", "scroll to target position");
                }
            } catch (Exception e) {
                Log.m165390i("WebAppContainerDelegate", "handleSavedPosition error, ", e);
            }
        }
    }

    @Override // com.larksuite.component.webview.container.dto.AbstractInjectWebViewDelegate
    /* renamed from: c */
    public void mo51000c(Fragment fragment, WebView webView) {
        AbstractC67720a aVar = (AbstractC67720a) this.f36114c.findServiceByInterface(AbstractC67720a.class);
        if (aVar != null && aVar.mo235074d()) {
            aVar.mo235070a();
        }
        if (C25529d.m91146a(AppType.WebAPP, "onForeGround")) {
            AbstractC67730a aVar2 = (AbstractC67730a) this.f36114c.findServiceByInterface(AbstractC67730a.class);
            if (aVar2 != null) {
                aVar2.mo87907a();
            }
            AbstractC13794f.AbstractC13796b bVar = this.f36128q;
            if (bVar != null) {
                bVar.mo50851a(this.f36113b);
                AppBrandLogger.m52830i("WebAppContainerDelegate", "webapp audit open Event");
            }
        }
        if (webView != null) {
            WebContainerDelegateLogUtils.f36209a.mo51084a(m55995a(webView), this.f36113b, this.f36114c);
        }
    }

    @Override // com.larksuite.component.webview.container.dto.AbstractInjectWebViewDelegate, com.larksuite.component.webview.container.dto.IWebContainerContract.IWebContainerView.AbstractC25824a
    /* renamed from: d */
    public void mo51004d(WebView webView, String str) {
        this.f36123l = str;
        if (mo91999w() == null || mo91999w().mo67308b() == null) {
            Log.m165389i("WebAppContainerDelegate", "onReceivedTitle but titleBar is null");
            return;
        }
        Log.m165389i("WebAppContainerDelegate", "onReceivedTitle title = " + str);
        if (mo91999w().mo67308b().mo67322a()) {
            mo91999w().mo67308b().setTitle(str);
        } else {
            Log.m165389i("WebAppContainerDelegate", "onReceivedTitle not show title");
        }
    }

    @Override // com.larksuite.component.webview.container.dto.AbstractInjectWebViewDelegate, com.larksuite.component.webview.container.dto.IWebContainerContract.IWebContainerView.AbstractC25824a
    /* renamed from: b */
    public void mo50995b(WebView webView, String str) {
        super.mo50995b(webView, str);
        WebAppDelegateBinder webAppDelegateBinder = this.f36117f;
        if (webAppDelegateBinder != null) {
            webAppDelegateBinder.notifyFirstFrameShow();
            this.f36117f.notifyPageFinished(str);
        }
        if (mo51011i()) {
            this.f36134w.mo51076a();
            this.f36134w.mo51079a(false);
        }
        AbstractC13794f.AbstractC13801g gVar = this.f36137z;
        if (gVar != null) {
            gVar.mo50862a(webView, str);
        }
        m56004e(webView, str);
        if (webView != null && webView.getProgress() == 100) {
            WebBackForwardList copyBackForwardList = webView.copyBackForwardList();
            if (copyBackForwardList == null || copyBackForwardList.getSize() != 1) {
                WebContainerDelegateLogUtils.f36209a.mo51084a(m55995a(webView), this.f36113b, this.f36114c);
            } else {
                Log.m165389i("WebAppContainerDelegate", "onPageFinished webBackForwardList.getSize() == 1");
            }
        }
    }

    @Override // com.larksuite.component.webview.container.dto.AbstractInjectWebViewDelegate
    /* renamed from: d */
    public void mo51005d(Fragment fragment, WebView webView) {
        AbstractC67730a aVar;
        AbstractC67720a aVar2 = (AbstractC67720a) this.f36114c.findServiceByInterface(AbstractC67720a.class);
        if (aVar2 != null && !aVar2.mo235074d()) {
            aVar2.mo235073c();
        }
        if (C25529d.m91146a(AppType.WebAPP, "onBackGround") && (aVar = (AbstractC67730a) this.f36114c.findServiceByInterface(AbstractC67730a.class)) != null) {
            aVar.mo87911b();
        }
    }

    @Override // com.larksuite.component.webview.container.dto.AbstractInjectWebViewDelegate
    /* renamed from: b */
    public void mo50996b(Fragment fragment, WebView webView) {
        Log.m165389i("WebAppContainerDelegate", "WebAppContainerDelegate onCreateWebView");
        if (!this.f36126o) {
            Bundle arguments = fragment.getArguments();
            this.f36113b = m56001b(arguments);
            this.f36102B = new ContainerDelegateDataHelper(this.f36110J);
            this.f36132u = arguments.getBoolean("key_is_tab_mode", false);
            this.f36104D = arguments.getString("url", "");
            this.f36114c = mo50973a(arguments, this.f36113b);
            this.f36109I = new C66310g(this);
            m56000a(true, this.f36104D);
            m55982B();
            m55998a(arguments);
            if (InspectDebugHelper.f166565a.mo230982a()) {
                Log.m165389i("WebAppContainerDelegate", "inspectModeIsOpen");
                InspectDebugHelper.f166565a.mo230980a(mo91997u());
            }
            AbstractC13794f.AbstractC13801g gVar = this.f36137z;
            if (gVar != null) {
                gVar.mo50864a(mo91999w(), mo51003d(), mo50994b());
            }
            if (C13848h.m56143a(fragment.getArguments())) {
                WebAppDelegateBinder webAppDelegateBinder = this.f36117f;
                if (webAppDelegateBinder != null) {
                    try {
                        this.f36119h = webAppDelegateBinder.getTabTitleBarHeight();
                    } catch (Exception e) {
                        e.printStackTrace();
                        Log.m165383e("WebAppContainerDelegate", "getTabTitleBar error : " + this.f36119h);
                    }
                }
                C13848h hVar = new C13848h();
                this.f36134w = hVar;
                hVar.mo51077a(fragment.getArguments(), fragment);
                ViewGroup f = mo91999w().mo67313f();
                this.f36134w.mo51078a(f, (FrameLayout) f, this.f36119h, null);
            } else {
                Log.m165389i("WebAppContainerDelegate", "not tab so request Common menu");
            }
            this.f36126o = true;
            AbstractC67720a aVar = (AbstractC67720a) this.f36114c.findServiceByInterface(AbstractC67720a.class);
            if (aVar != null) {
                aVar.mo235070a();
            }
        }
        WebAppDelegateBinder webAppDelegateBinder2 = this.f36117f;
        if (webAppDelegateBinder2 != null) {
            webAppDelegateBinder2.onCreateView();
            Log.m165389i("WebAppContainerDelegate", "mWebAppDelegateBinder onCreateView");
        }
        this.f36118g = true;
        AbstractC13794f.AbstractC13796b bVar = this.f36128q;
        if (bVar != null) {
            C13765a.m55785a(bVar.mo50850a(), this.f36104D, mo51008f(), this.f36122k, m56006y(), true);
        }
        Log.m165389i("WebAppContainerDelegate", "onCreateWebView complete " + this);
    }

    /* renamed from: b */
    public void mo50997b(final String str, final IWebTabCallbackInterface iWebTabCallbackInterface) {
        AbstractC13135b bVar = (AbstractC13135b) mo51020r().findServiceByInterface(AbstractC13135b.class);
        if (bVar == null) {
            AppBrandLogger.m52829e("WebAppContainerDelegate", "requestService is null so removeCommonApp return");
            return;
        }
        bVar.mo49190c(str, new C13141f.AbstractC13143a() {
            /* class com.bytedance.ee.webapp.v2.WebAppContainerDelegate.C138295 */

            @Override // com.bytedance.ee.larkbrand.menu.C13141f.AbstractC13143a
            /* renamed from: a */
            public void mo49197a(SendHttpResponse sendHttpResponse, C13141f.C13144b bVar) {
                AppBrandLogger.m52830i("WebAppContainerDelegate", "removeCommonApp success " + str);
                IWebTabCallbackInterface iWebTabCallbackInterface = iWebTabCallbackInterface;
                if (iWebTabCallbackInterface != null) {
                    try {
                        iWebTabCallbackInterface.onAppRemoveResult(true);
                        C13814b.m55964a(WebAppContainerDelegate.this.f36114c, WebMoreCommonItem.Type.REMOVE, true, true, null);
                    } catch (RemoteException e) {
                        e.printStackTrace();
                        AppBrandLogger.m52829e("WebAppContainerDelegate", "removeCommonApp exception ", e);
                    }
                }
                WebAppContainerDelegate.this.mo50981a(WebMoreCommonItem.Type.REMOVE, true);
            }

            @Override // com.bytedance.ee.larkbrand.menu.C13141f.AbstractC13143a
            /* renamed from: a */
            public void mo49198a(ErrorResult errorResult, C13141f.C13144b bVar) {
                AppBrandLogger.m52829e("WebAppContainerDelegate", "removeCommonApp error " + str);
                IWebTabCallbackInterface iWebTabCallbackInterface = iWebTabCallbackInterface;
                if (iWebTabCallbackInterface != null) {
                    try {
                        iWebTabCallbackInterface.onAppRemoveResult(false);
                        C13814b.m55964a(WebAppContainerDelegate.this.f36114c, WebMoreCommonItem.Type.REMOVE, false, true, WebAppContainerDelegate.this.mo50972a(errorResult));
                    } catch (RemoteException e) {
                        e.printStackTrace();
                        AppBrandLogger.m52829e("WebAppContainerDelegate", "removeCommonApp exception ", e);
                    }
                }
                WebAppContainerDelegate.this.mo50981a(WebMoreCommonItem.Type.REMOVE, false);
            }
        });
    }

    /* renamed from: a */
    private void m56000a(boolean z, String str) {
        if (!TextUtils.isEmpty(this.f36113b) && this.f36114c != null) {
            WebContainerDelegateLogUtils.f36209a.mo51085a(z, str, this.f36113b, this.f36114c);
            WebContainerDelegateLogUtils.f36209a.mo51086b(this.f36114c);
            WebContainerDelegateLogUtils.f36209a.mo51084a(str, this.f36113b, this.f36114c);
        }
    }

    /* renamed from: a */
    private static C25838g m55993a(final Fragment fragment, final C13808i iVar, int i) {
        if (iVar == null) {
            return null;
        }
        C25838g gVar = new C25838g(iVar.mo50885g(), iVar.mo50876b(), new OnSingleClickListener() {
            /* class com.bytedance.ee.webapp.v2.WebAppContainerDelegate.C138262 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                Fragment fragment = fragment;
                if (fragment != null && fragment.isAdded() && iVar.mo50887i() != null) {
                    iVar.mo50887i().onClick(null);
                }
            }
        }, i);
        if (iVar.mo50871a() == 5) {
            gVar.mo91925d(iVar.mo50879c());
        }
        return gVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m55997a(int i, String str, String str2, String str3, AbstractC13836d dVar, String str4) {
        if (i == 1 || i == 2) {
            C13783d.m55869a(i, str, str2, str3, this, str4, new WeakReference(this.f36114c));
            return;
        }
        WebContainerDelegateLogUtils.f36209a.mo51083a(this.f36114c);
        C13783d.m55879a(str, str2, str3, this, str4);
    }
}
