package com.tt.miniapp.render;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebView;
import com.bytedance.ee.bear.atbottombar.C4260d;
import com.bytedance.ee.bear.atfinder.AbstractC4271f;
import com.bytedance.ee.bear.atfinder.AbstractC4272g;
import com.bytedance.ee.bear.atfinder.MentionModel;
import com.bytedance.ee.bear.bean.C4519b;
import com.bytedance.ee.bear.document.at.AbstractC5670e;
import com.bytedance.ee.bear.jsbridge.C7939a;
import com.bytedance.ee.bear.middleground.docsdk.v2.DocSdkV2;
import com.bytedance.ee.bear.p526r.C10598a;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.ref.impl.host.HostExtensionManager;
import com.bytedance.ee.util.p707j.C13684a;
import com.larksuite.suite.R;
import com.ss.android.lark.optrace.api.TracingCoreSpan;
import com.tt.frontendapiinterface.IActivityLife;
import com.tt.frontendapiinterface.IKeyboardObserver;
import com.tt.miniapp.AppConfig;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.C65966d;
import com.tt.miniapp.C66283l;
import com.tt.miniapp.C66546p;
import com.tt.miniapp.IKeyBoardStateChange;
import com.tt.miniapp.component.nativeview.AbstractC65853c;
import com.tt.miniapp.component.nativeview.C65844b;
import com.tt.miniapp.component.nativeview.C65887g;
import com.tt.miniapp.component.nativeview.C65911k;
import com.tt.miniapp.component.nativeview.InputBean;
import com.tt.miniapp.component.nativeview.NativeViewManager;
import com.tt.miniapp.component.nativeview.p3271c.C65868b;
import com.tt.miniapp.debug.C65983a;
import com.tt.miniapp.p3307n.C66493a;
import com.tt.miniapp.util.C67033g;
import com.tt.miniapp.util.C67047m;
import com.tt.miniapp.view.webcore.AbstractC67282j;
import com.tt.miniapp.view.webcore.C67257d;
import com.tt.miniapp.view.webcore.WebViewWrapper;
import com.tt.miniapphost.data.C67485a;
import com.tt.miniapphost.data.C67488b;
import com.tt.miniapphost.data.ContextSingletonInstance;
import com.tt.miniapphost.host.HostDependManager;
import com.tt.miniapphost.p3362a.p3363a.AbstractC67434b;
import com.tt.miniapphost.p3362a.p3367e.C67460f;
import com.tt.miniapphost.p3370d.C67479c;
import com.tt.miniapphost.util.C67587d;
import com.tt.miniapphost.util.C67589g;
import com.tt.miniapphost.util.C67590h;
import com.tt.miniapphost.util.DebugUtil;
import com.tt.option.ext.WebEventCallback;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.tt.miniapp.render.a */
public class C66721a implements IKeyboardObserver, IAppbrandRender {

    /* renamed from: a */
    public IAppbrandRenderHost f168436a;

    /* renamed from: b */
    public WebViewWrapper f168437b;

    /* renamed from: c */
    public C65911k f168438c;

    /* renamed from: d */
    public DocSdkV2.AbstractC9329b f168439d;

    /* renamed from: e */
    public C7939a f168440e;

    /* renamed from: f */
    public boolean f168441f = false;

    /* renamed from: g */
    private C67257d f168442g;

    /* renamed from: h */
    private boolean f168443h;

    /* renamed from: i */
    private LinkedList<Runnable> f168444i = new LinkedList<>();

    /* renamed from: j */
    private int f168445j = 0;

    /* renamed from: k */
    private InputBean f168446k = null;

    /* renamed from: l */
    private final List<WeakReference<IKeyBoardStateChange>> f168447l = new ArrayList();

    /* renamed from: m */
    private IActivityLife f168448m;

    @Override // com.tt.miniapp.render.IAppbrandRender
    public void onActivityRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
    }

    @Override // com.tt.miniapp.render.IAppbrandRender
    public void onDetach() {
        this.f168438c = null;
    }

    @Override // com.tt.miniapp.render.IAppbrandRender
    public void onDetermineRenderContainerSize(int i, int i2) {
    }

    @Override // com.tt.miniapp.render.IAppbrandRender
    public void onPkgDownloadDone(boolean z) {
    }

    @Override // com.tt.miniapp.render.IAppbrandRender
    public void onPostResume() {
    }

    @Override // com.tt.miniapp.render.IAppbrandRender
    public void onTrimMemory(int i) {
    }

    @Override // com.tt.miniapp.render.IAppbrandRender
    public void onUserLeaveHint() {
    }

    @Override // com.tt.miniapp.render.IAppbrandRender
    public NativeViewManager getNativeViewManager() {
        return this.f168438c;
    }

    /* renamed from: a */
    public View getRealRenderView() {
        return this.f168437b.mo233948a();
    }

    @Override // com.tt.miniapp.render.IAppbrandRender
    public boolean isRenderInBrowserEnabled() {
        return this.f168437b.mo233955c();
    }

    /* renamed from: b */
    private C67488b m260527b() {
        return C67485a.m262488a(this.f168436a.getAppContext()).mo234280a();
    }

    @Override // com.tt.miniapp.render.IAppbrandRender
    public int getRenderHeight() {
        return this.f168437b.mo233948a().getMeasuredHeight();
    }

    @Override // com.tt.miniapp.render.IAppbrandRender
    public int getRenderViewId() {
        C67257d dVar = this.f168442g;
        if (dVar != null) {
            return dVar.getRenderViewId();
        }
        return -1;
    }

    @Override // com.tt.miniapp.render.IAppbrandRender
    public TracingCoreSpan getRenderViewTracingCoreSpan() {
        return this.f168442g.getRenderLoadManager().getTracingCoreSpan();
    }

    @Override // com.tt.miniapp.render.IAppbrandRender
    public int getRenderWidth() {
        return this.f168437b.mo233948a().getMeasuredWidth();
    }

    @Override // com.tt.miniapp.render.IAppbrandRender
    public boolean isTemplateReady() {
        return this.f168442g.getRenderLoadManager().isTemplateReady();
    }

    @Override // com.tt.miniapp.render.IAppbrandRender
    public void onAppInstallSuccess() {
        this.f168442g.getRenderLoadManager().continuePreloadIfNeed();
    }

    @Override // com.tt.miniapp.render.IAppbrandRender
    public void onAppStartLaunching() {
        this.f168442g.getRenderLoadManager().markForceLoadPathFrameJs();
    }

    @Override // com.tt.miniapp.render.IAppbrandRender
    public void onDOMReady() {
        this.f168441f = true;
        this.f168442g.getRenderLoadManager().onDOMReady();
        m260528c();
    }

    @Override // com.tt.miniapp.render.IAppbrandRender
    public void onDestroyView() {
        IActivityLife iActivityLife = this.f168448m;
        if (iActivityLife != null) {
            iActivityLife.unRegisterKeyboardListener(this);
        }
        DocSdkV2.AbstractC9329b bVar = this.f168439d;
        if (bVar != null) {
            bVar.mo35592c();
        }
    }

    @Override // com.tt.miniapp.render.IAppbrandRender
    public void onStart() {
        this.f168445j = C66283l.m259346a();
        ContextSingletonInstance.getInstance().keyboardId = this.f168445j;
    }

    @Override // com.tt.miniapp.render.IAppbrandRender
    public void onSubAppInstallSuccess() {
        this.f168442g.getRenderLoadManager().continuePreloadIfNeed();
    }

    @Override // com.tt.miniapp.render.IAppbrandRender
    public void reLaunchForSSB() {
        this.f168442g.getRenderLoadManager().reLaunchForSSB();
    }

    @Override // com.tt.miniapp.render.IAppbrandRender
    public void reloadWebUrl() {
        C65887g a;
        C65911k kVar = this.f168438c;
        if (kVar != null && (a = kVar.mo230780a()) != null) {
            a.mo230671a();
        }
    }

    @Override // com.tt.miniapp.render.IAppbrandRender
    public void sendOnAppRoute() {
        this.f168442g.getRenderLoadManager().sendOnAppRoute();
    }

    /* renamed from: c */
    private void m260528c() {
        if (HostDependManager.getInst().getFeatureGating("editor.use.larkwebview.bridge", false)) {
            m260526a(true);
        } else {
            m260529d();
        }
    }

    /* renamed from: d */
    private void m260529d() {
        if (this.f168440e != null) {
            m260526a(false);
            return;
        }
        AppBrandLogger.m52829e("tma_AppbrandFragmentWebViewRender", "editor Bridge null");
    }

    @Override // com.tt.miniapp.render.IAppbrandRender
    public void onCreateView() {
        IActivityLife activityLife = AppbrandApplicationImpl.getInst(this.f168436a.getAppContext()).getActivityLife();
        this.f168448m = activityLife;
        if (activityLife != null) {
            activityLife.registerKeyboardListener(this);
        }
    }

    @Override // com.tt.miniapp.render.IAppbrandRender
    public void onDestroy() {
        m260525a(this.f168437b.mo233948a());
        C65911k kVar = this.f168438c;
        if (kVar != null) {
            kVar.mo230786b();
        }
        IAppbrandRenderHost iAppbrandRenderHost = this.f168436a;
        if (iAppbrandRenderHost != null) {
            iAppbrandRenderHost.detachRenderView(this.f168442g);
            this.f168442g = null;
        }
    }

    @Override // com.tt.miniapp.render.IAppbrandRender
    public void hideConfirmBar() {
        C65911k kVar;
        if (this.f168442g.getConfirmHolder() != null && (kVar = this.f168438c) != null && TextUtils.equals("textarea", kVar.getViewType()) && this.f168442g.getShowConfirmBar()) {
            this.f168442g.getConfirmHolder().setVisibility(8);
        }
    }

    @Override // com.tt.miniapp.render.IAppbrandRender
    public void showConfirmBar() {
        C65911k kVar;
        if (this.f168442g.getConfirmHolder() != null && (kVar = this.f168438c) != null && TextUtils.equals("textarea", kVar.getViewType()) && this.f168442g.getShowConfirmBar()) {
            this.f168442g.getConfirmHolder().setVisibility(0);
        }
    }

    @Override // com.tt.miniapp.render.IAppbrandRender
    public void onPause() {
        if (this.f168436a.getAppContext() != null && !this.f168436a.getAppContext().isDestroyed() && !this.f168436a.getAppContext().isDestroying() && ContextSingletonInstance.getInstance().keyboardId == this.f168445j) {
            try {
                C67047m.m261304a(this.f168436a.getActivity());
            } catch (Exception e) {
                AppBrandLogger.m52829e("tma_AppbrandFragmentWebViewRender", "hide input method error", e);
            }
            m260530e();
        }
    }

    /* renamed from: e */
    private void m260530e() {
        AppBrandLogger.m52830i("tma_AppbrandFragmentWebViewRender", "onKeyBoardHide mLastFocusInput webviewId ", Integer.valueOf(getRenderViewId()));
        if (System.identityHashCode(this) == m260527b().f170177d) {
            InputBean inputBean = this.f168446k;
            if (inputBean != null) {
                int i = inputBean.inputId;
                AbstractC65853c cVar = (AbstractC65853c) this.f168438c.getView(i);
                if (cVar == null) {
                    this.f168446k = null;
                    for (WeakReference<IKeyBoardStateChange> weakReference : this.f168447l) {
                        IKeyBoardStateChange iKeyBoardStateChange = weakReference.get();
                        if (iKeyBoardStateChange != null) {
                            iKeyBoardStateChange.onKeyboardHide();
                        }
                    }
                    return;
                } else if ((cVar instanceof C65844b) || (cVar instanceof C65868b)) {
                    AppBrandLogger.m52830i("tma_AppbrandFragmentWebViewRender", "input type need remove");
                    removeNativeView(i, null);
                } else if (!TextUtils.equals(cVar.getType(), "textarea")) {
                    this.f168446k.cursor = cVar.getCursor();
                    this.f168446k.value = cVar.getValue();
                    this.f168436a.getRenderViewManager().publish(getRenderViewId(), "onKeyboardComplete", new C67587d().mo234783a("value", this.f168446k.value).mo234783a("inputId", Integer.valueOf(this.f168446k.inputId)).mo234783a("cursor", Integer.valueOf(this.f168446k.cursor)).mo234784a().toString());
                }
            }
            this.f168446k = null;
            for (WeakReference<IKeyBoardStateChange> weakReference2 : this.f168447l) {
                IKeyBoardStateChange iKeyBoardStateChange2 = weakReference2.get();
                if (iKeyBoardStateChange2 != null) {
                    iKeyBoardStateChange2.onKeyboardHide();
                }
            }
            this.f168436a.getRenderViewManager().publish(getRenderViewId(), "hideKeyboard", null);
        }
    }

    @Override // com.tt.miniapp.render.IAppbrandRender
    public void onAttach(Context context) {
        m260528c();
    }

    @Override // com.tt.miniapp.render.IAppbrandRender
    public void setDisableScroll(boolean z) {
        this.f168437b.mo233952a(z);
    }

    @Override // com.tt.miniapp.render.IAppbrandRender
    public View getNativeView(int i) {
        C65911k kVar = this.f168438c;
        if (kVar != null) {
            return kVar.getView(i);
        }
        return null;
    }

    @Override // com.tt.miniapp.render.IAppbrandRender
    public void registerKeyBoardStateChange(IKeyBoardStateChange iKeyBoardStateChange) {
        if (iKeyBoardStateChange != null) {
            this.f168447l.add(new WeakReference<>(iKeyBoardStateChange));
        }
    }

    @Override // com.tt.miniapp.render.IAppbrandRender
    public void setOpenType(String str) {
        this.f168442g.getRenderLoadManager().setOpenType(str);
    }

    @Override // com.tt.miniapp.render.IAppbrandRender
    public void updateBackgroundColor(int i) {
        this.f168442g.getWebView().mo233948a().setBackgroundColor(i);
    }

    public C66721a(C67257d dVar) {
        this.f168442g = dVar;
        C67590h.m263088c(dVar);
    }

    /* renamed from: a */
    private void m260526a(final boolean z) {
        final View fragmentView = this.f168436a.getFragmentView();
        final IAppContext appContext = this.f168436a.getAppContext();
        fragmentView.post(new Runnable() {
            /* class com.tt.miniapp.render.C66721a.RunnableC667243 */

            public void run() {
                C7939a aVar;
                IAppContext iAppContext = appContext;
                if (iAppContext == null || iAppContext.getCurrentActivity() == null) {
                    AppBrandLogger.m52829e("tma_AppbrandFragmentWebViewRender", "context, null");
                } else if (!C66721a.this.f168441f) {
                    AppBrandLogger.m52829e("tma_AppbrandFragmentWebViewRender", "InitEditor but dom is not ready");
                } else {
                    AbstractC67434b a = ((C67460f) appContext).mo234156a();
                    if (a == null) {
                        AppBrandLogger.m52829e("tma_AppbrandFragmentWebViewRender", "gadgetViewProxy null");
                        return;
                    }
                    C66493a F = ((C66546p) a).mo232114F();
                    if (F == null) {
                        AppBrandLogger.m52829e("tma_AppbrandFragmentWebViewRender", "keyBoardProvider null");
                    } else if (C66721a.this.f168439d != null) {
                        AppBrandLogger.m52830i("tma_AppbrandFragmentWebViewRender", "docSdkV2 is not null");
                    } else if (C66721a.this.f168436a.getFragment().getActivity() == null) {
                        AppBrandLogger.m52829e("tma_AppbrandFragmentWebViewRender", "InitEditor but host fragment's activity null");
                    } else {
                        WebView a2 = C66721a.this.f168437b.mo233948a();
                        if (z) {
                            aVar = null;
                        } else {
                            aVar = C66721a.this.f168440e;
                        }
                        DocSdkV2.C9328a aVar2 = new DocSdkV2.C9328a(a2, aVar);
                        aVar2.mo35589a(z);
                        AppBrandLogger.m52830i("tma_AppbrandFragmentWebViewRender", "init editor native sdk");
                        aVar2.mo35588a(new C13684a.AbstractC13685a() {
                            /* class com.tt.miniapp.render.C66721a.RunnableC667243.C667251 */

                            @Override // com.bytedance.ee.util.p707j.C13684a.AbstractC13685a
                            /* renamed from: a */
                            public String mo16557a() {
                                return HostExtensionManager.getInstance().getHostInterface().getSession();
                            }

                            @Override // com.bytedance.ee.util.p707j.C13684a.AbstractC13685a
                            /* renamed from: b */
                            public Locale mo16558b() {
                                return C67479c.m262467a().mo234230c();
                            }
                        });
                        aVar2.mo35587a(new AbstractC5670e() {
                            /* class com.tt.miniapp.render.C66721a.RunnableC667243.C667262 */

                            @Override // com.bytedance.ee.bear.atfinder.AbstractC4270e
                            /* renamed from: b */
                            public C4519b mo16811b() {
                                return new C4519b();
                            }

                            /* access modifiers changed from: protected */
                            @Override // com.bytedance.ee.bear.document.at.AbstractC5670e
                            /* renamed from: a */
                            public void mo22651a(ArrayList<C4260d> arrayList) {
                                arrayList.add(new C4260d(R.drawable.icon_global_mentionpeople_nor, appContext.getCurrentActivity().getString(R.string.Doc_At_MentionUserTip), Arrays.asList(C10598a.f28440b), new AbstractC4271f() {
                                    /* class com.tt.miniapp.render.C66721a.RunnableC667243.C667262.C667271 */

                                    @Override // com.bytedance.ee.bear.atfinder.AbstractC4271f
                                    /* renamed from: a */
                                    public void mo16667a(MentionModel mentionModel, String str, AbstractC4272g gVar) {
                                        AppBrandLogger.m52830i("tma_AppbrandFragmentWebViewRender", "do editor search:" + mentionModel.getKeyword());
                                        HostDependManager.getInst().doEditorAtSearch(mentionModel.getKeyword(), str, gVar, appContext);
                                    }
                                }));
                            }
                        });
                        aVar2.mo35586a(F, (ViewGroup) F.getContentView());
                        C66721a aVar3 = C66721a.this;
                        aVar3.f168439d = aVar2.mo35590a(aVar3.f168436a.getFragment());
                        C66721a.this.f168439d.mo35591a((ViewGroup) fragmentView);
                    }
                }
            }
        });
    }

    @Override // com.tt.miniapp.render.IAppbrandRender
    public void onAnimationEnd(boolean z) {
        this.f168443h = true;
        if (z) {
            while (!this.f168444i.isEmpty()) {
                Runnable poll = this.f168444i.poll();
                if (poll != null) {
                    poll.run();
                }
            }
        }
    }

    @Override // com.tt.miniapp.render.IAppbrandRender
    public void showKeyboard(final int i) {
        C65911k kVar = this.f168438c;
        if (kVar != null) {
            if (this.f168443h) {
                kVar.mo230781a(i);
            } else {
                this.f168444i.add(new Runnable() {
                    /* class com.tt.miniapp.render.C66721a.RunnableC667232 */

                    public void run() {
                        if (C66721a.this.f168438c != null) {
                            C66721a.this.f168438c.mo230781a(i);
                        }
                    }
                });
            }
        }
    }

    /* renamed from: a */
    private static void m260525a(WebView webView) {
        if (webView != null) {
            webView.setWebChromeClient(null);
            webView.setWebViewClient(null);
            webView.destroy();
            HostDependManager.getInst().cleanTTWebViewExtension(webView.hashCode());
            ViewParent parent = webView.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(webView);
                try {
                    webView.destroy();
                } catch (Throwable th) {
                    AppBrandLogger.m52829e("tma_AppbrandFragmentWebViewRender", "", th);
                }
            }
        }
    }

    @Override // com.tt.miniapp.render.IAppbrandRender
    public void initPopMenuConfig(AppConfig.Window window) {
        C67257d dVar = this.f168442g;
        if (dVar == null || dVar.getWebView() == null) {
            AppBrandLogger.m52829e("tma_AppbrandFragmentWebViewRender", "initPopMenuConfig: current web-view is null");
            return;
        }
        this.f168442g.getWebView().mo233954b(window.disableDefaultPopupMenu);
    }

    @Override // com.tt.miniapp.render.IAppbrandRender
    public void onPageExit(int i) {
        if (ContextSingletonInstance.getInstance().keyboardId == this.f168445j) {
            C67047m.m261304a(this.f168436a.getActivity());
        }
        IAppContext appContext = this.f168436a.getAppContext();
        if (appContext != null) {
            C67485a.m262488a(appContext).mo234277G().mo233999a();
        }
    }

    @Override // com.tt.miniapp.render.IAppbrandRender
    public void unregisterKeyBoardStateChange(IKeyBoardStateChange iKeyBoardStateChange) {
        if (iKeyBoardStateChange != null) {
            Iterator<WeakReference<IKeyBoardStateChange>> it = this.f168447l.iterator();
            while (it.hasNext()) {
                WeakReference<IKeyBoardStateChange> next = it.next();
                if (!(next == null || next.get() == null || !iKeyBoardStateChange.equals(next.get()))) {
                    it.remove();
                }
            }
        }
    }

    @Override // com.tt.miniapp.render.IAppbrandRender
    public void initHost(IAppbrandRenderHost iAppbrandRenderHost) {
        this.f168436a = iAppbrandRenderHost;
        iAppbrandRenderHost.attachRenderView(this.f168442g);
        registerKeyBoardStateChange(this.f168442g);
        this.f168438c = new C65911k(iAppbrandRenderHost, this.f168442g, getRenderViewId(), this.f168436a.getAppContext());
        this.f168442g.setScrollListener(new AbstractC67282j.AbstractC67284b() {
            /* class com.tt.miniapp.render.C66721a.C667221 */

            @Override // com.tt.miniapp.view.webcore.AbstractC67282j.AbstractC67284b
            /* renamed from: a */
            public void mo232559a(int i, int i2, int i3, int i4) {
                C65966d titleBar = C66721a.this.f168436a.getTitleBar();
                if (titleBar != null) {
                    titleBar.mo230930a(i2);
                }
            }
        });
        this.f168437b = this.f168442g.getWebView();
        if (C65983a.m258415a().f166554d) {
            WebView.setWebContentsDebuggingEnabled(true);
        }
        this.f168437b.mo233948a().getSettings().setMediaPlaybackRequiresUserGesture(false);
        if (!HostDependManager.getInst().getFeatureGating("editor.use.larkwebview.bridge", false)) {
            this.f168440e = DocSdkV2.C9330c.m38537a(this.f168437b.mo233948a());
        }
    }

    /* renamed from: a */
    private void m260524a(int i) {
        AppBrandLogger.m52830i("tma_AppbrandFragmentWebViewRender", "onKeyBoardShow webviewId ", Integer.valueOf(getRenderViewId()));
        m260527b().f170177d = System.identityHashCode(this);
        InputBean currentInputValue = this.f168438c.getCurrentInputValue();
        int i2 = currentInputValue.inputId;
        if (i2 != -1) {
            if (DebugUtil.debug()) {
                AppBrandLogger.m52830i("tma_AppbrandFragmentWebViewRender", "currentFocusId ", Integer.valueOf(i2));
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("inputId", i2);
                    this.f168436a.getRenderViewManager().publish(getRenderViewId(), "syncNativeScroll", jSONObject.toString());
                } catch (JSONException e) {
                    AppBrandLogger.stacktrace(6, "tma_AppbrandFragmentWebViewRender", e.getStackTrace());
                }
            }
            AbstractC65853c cVar = (AbstractC65853c) this.f168438c.getView(currentInputValue.inputId);
            if ((cVar instanceof C65844b) || (cVar instanceof C65868b)) {
                AppBrandLogger.m52830i("tma_AppbrandFragmentWebViewRender", "input type need send key board show");
                this.f168436a.getRenderViewManager().publish(getRenderViewId(), "onKeyboardShow", new C67587d().mo234783a("inputId", Integer.valueOf(currentInputValue.inputId)).mo234783a("height", Integer.valueOf(C67589g.m263064a(i))).mo234784a().toString());
            }
            this.f168446k = currentInputValue;
            for (WeakReference<IKeyBoardStateChange> weakReference : this.f168447l) {
                IKeyBoardStateChange iKeyBoardStateChange = weakReference.get();
                if (iKeyBoardStateChange != null) {
                    iKeyBoardStateChange.onKeyboardShow(i, this.f168446k.inputId);
                }
            }
        }
    }

    @Override // com.tt.miniapp.render.IAppbrandRender
    public void removeNativeView(int i, WebEventCallback webEventCallback) {
        C65911k kVar = this.f168438c;
        if (kVar != null) {
            kVar.mo230782a(i, webEventCallback);
            return;
        }
        AppBrandLogger.m52831w("tma_AppbrandFragmentWebViewRender", "removeNativeView, viewId: ", Integer.valueOf(i), " NativeViewManager is null");
    }

    @Override // com.tt.frontendapiinterface.IKeyboardObserver
    public void onKeyboardHeightChanged(int i, int i2) {
        AppBrandLogger.m52830i("tma_AppbrandFragmentWebViewRender", "onKeyboardHeightChanged, height: " + i);
        if (this.f168436a.isStarted() && !this.f168436a.isHidden()) {
            if (C67033g.m261251a() && i == 120) {
                m260530e();
            } else if (i > 0) {
                m260524a(i);
            } else {
                m260530e();
            }
        }
    }

    @Override // com.tt.miniapp.render.IAppbrandRender
    public void updateNativeView(int i, String str, WebEventCallback webEventCallback) {
        C65911k kVar = this.f168438c;
        if (kVar != null) {
            kVar.mo230783a(i, str, webEventCallback);
            return;
        }
        AppBrandLogger.m52831w("tma_AppbrandFragmentWebViewRender", "updateNativeView, viewId: ", Integer.valueOf(i), ", NativeViewManager is null");
    }

    @Override // com.tt.miniapp.render.IAppbrandRender
    public void updateArgument(String str, String str2, String str3, String str4) {
        this.f168442g.getRenderLoadManager().updateArgument(str, str2, str3, str4);
    }

    @Override // com.tt.miniapp.render.IAppbrandRender
    public void addNativeView(int i, String str, String str2, WebEventCallback webEventCallback) {
        C65911k kVar = this.f168438c;
        if (kVar != null) {
            kVar.mo230784a(i, str, str2, webEventCallback);
            return;
        }
        AppBrandLogger.m52829e("tma_AppbrandFragmentWebViewRender", "addNativeView, NativeViewManager is null, type: ", str, "viewId: ", Integer.valueOf(i));
    }
}
