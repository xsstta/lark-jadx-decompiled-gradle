package com.tt.miniapp.view.webcore;

import android.content.Context;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.webkit.CookieManager;
import android.webkit.ValueCallback;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.larkwebview.base.LarkWebView;
import com.bytedance.ee.larkwebview.monitor.webview.BizType;
import com.bytedance.ee.larkwebview.service.AbstractC13471f;
import com.bytedance.lynx.webview.TTWebSdk;
import com.bytedance.lynx.webview.extension.TTWebViewExtension;
import com.huawei.hms.location.LocationRequest;
import com.larksuite.component.openplatform.core.utils.C25529d;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.miniapp.ab.C65726a;
import com.tt.miniapp.util.TimeLogger;
import com.tt.miniapp.util.VideoFullScreenHelper;
import com.tt.miniapp.view.webcore.AbstractC67282j;
import com.tt.miniapp.view.webcore.p3349a.C67236a;
import com.tt.miniapphost.data.ContextSingletonInstance;
import com.tt.miniapphost.host.HostDependManager;
import com.tt.miniapphost.p3371e.C67509b;
import com.tt.miniapphost.p3371e.p3372a.C67500a;
import com.tt.miniapphost.p3371e.p3372a.C67501b;
import com.tt.refer.common.util.C67866g;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.tt.miniapp.view.webcore.f */
public class C67268f extends LarkWebView {

    /* renamed from: a */
    public VideoFullScreenHelper f169795a;

    /* renamed from: b */
    public boolean f169796b;

    /* renamed from: c */
    public IAppContext f169797c;

    /* renamed from: d */
    private boolean f169798d = false;

    /* renamed from: e */
    private int f169799e;

    /* renamed from: f */
    private boolean f169800f;

    /* renamed from: g */
    private AbstractC67282j.AbstractC67284b f169801g;

    /* renamed from: com.tt.miniapp.view.webcore.f$a */
    public static class C67272a {

        /* renamed from: a */
        public Boolean f169809a;
    }

    public VideoFullScreenHelper getVideoFullScreenHelper() {
        return this.f169795a;
    }

    /* renamed from: b */
    public boolean mo22336b() {
        return ContextSingletonInstance.getInstance().larkWebViewDataInstance.f169809a.booleanValue();
    }

    /* renamed from: a */
    public void mo19616a() {
        if (mo22336b()) {
            setLayerType(2, null);
        }
    }

    /* renamed from: c */
    private void m262120c() {
        if (getServiceManager().mo49931b(AbstractC13471f.class) != null && ((AbstractC13471f) getServiceManager().mo49931b(AbstractC13471f.class)).mo49910a() != null) {
            ((AbstractC13471f) getServiceManager().mo49931b(AbstractC13471f.class)).mo49910a().removePluginFactory("mixrender");
        }
    }

    /* renamed from: d */
    private boolean m262121d() {
        if (!TTWebSdk.isTTWebView()) {
            AppBrandLogger.m52831w("native render is disable, because ttwebview core is disabled", new Object[0]);
            return false;
        }
        AbstractC13471f fVar = (AbstractC13471f) getServiceManager().mo49931b(AbstractC13471f.class);
        if (fVar == null) {
            AppBrandLogger.m52831w("native render is disable, because webViewService is null", new Object[0]);
            return false;
        }
        TTWebViewExtension a = fVar.mo49910a();
        if (a == null) {
            AppBrandLogger.m52831w("native render is disable, because TTWebViewExtension is null", new Object[0]);
            return false;
        } else if (!a.isTTRenderInBrowserEnabled()) {
            AppBrandLogger.m52831w("native render is disable, because ttwebview TTRenderInBrowser is disabled ", new Object[0]);
            return false;
        } else if (!HostDependManager.getInst().getFeatureGating("gadget.textarea.use.render.inbrowser", false)) {
            return false;
        } else {
            AppBrandLogger.m52831w("native render is able", new Object[0]);
            return true;
        }
    }

    public void setDisableDefaultPopMenu(boolean z) {
        this.f169800f = z;
    }

    public void setDisableScroll(boolean z) {
        this.f169798d = z;
    }

    public void setVideoFullScreenHelper(VideoFullScreenHelper videoFullScreenHelper) {
        this.f169795a = videoFullScreenHelper;
    }

    @Override // com.bytedance.ee.larkwebview.base.BaseWebView, com.bytedance.ee.larkwebview.base.LarkWebView
    public void loadUrl(final String str) {
        C67866g.m264027a(new Runnable() {
            /* class com.tt.miniapp.view.webcore.C67268f.RunnableC672691 */

            public void run() {
                try {
                    C67268f.super.loadUrl(str);
                } catch (Exception e) {
                    AppBrandLogger.m52829e("NestLarkWebView", "load url ", str, " ", e.toString());
                }
            }
        });
    }

    public ActionMode startActionMode(ActionMode.Callback callback) {
        ActionMode a = m262116a(callback, -1);
        if (a != null) {
            return a;
        }
        return super.startActionMode(callback);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f169796b = true;
        } else if (action == 1 || action == 3) {
            this.f169796b = false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (!HostDependManager.getInst().getFeatureGating("gadget.component.keyboard.delete")) {
            return onCreateInputConnection;
        }
        AppBrandLogger.m52830i("NestLarkWebView", "customize input connection");
        if (onCreateInputConnection == null) {
            return null;
        }
        return new C67251c(onCreateInputConnection, true);
    }

    public void setScrollListener(AbstractC67282j.AbstractC67284b bVar) {
        this.f169801g = bVar;
        if (mo22336b()) {
            HostDependManager.getInst().setPlatformLayerScrollListener(this.f169799e, this.f169801g);
            AppBrandLogger.m52828d("NestLarkWebView", "test ci");
        }
    }

    /* renamed from: a */
    private void m262117a(Context context) {
        if (ContextSingletonInstance.getInstance().larkWebViewDataInstance.f169809a != null && ContextSingletonInstance.getInstance().larkWebViewDataInstance.f169809a.booleanValue()) {
            HostDependManager.getInst().initTTWebViewExtension(this, this.f169799e);
        } else if (ContextSingletonInstance.getInstance().larkWebViewDataInstance.f169809a == null) {
            HostDependManager.getInst().initTTWebViewExtension(this, this.f169799e);
            boolean d = m262121d();
            ContextSingletonInstance.getInstance().larkWebViewDataInstance.f169809a = Boolean.valueOf(d);
            if (!d) {
                HostDependManager.getInst().cleanTTWebViewExtension(this.f169799e);
            }
        }
    }

    @Override // com.bytedance.ee.larkwebview.base.BaseWebView, android.webkit.WebView
    public void evaluateJavascript(String str, ValueCallback<String> valueCallback) {
        mo233903a(str, valueCallback, (String) null);
    }

    /* renamed from: a */
    private ActionMode m262116a(ActionMode.Callback callback, int i) {
        if (this.f169800f) {
            return new C67236a(callback, i);
        }
        return null;
    }

    public void scrollTo(int i, int i2) {
        if (this.f169798d) {
            super.scrollTo(0, 0);
        } else {
            super.scrollTo(i, i2);
        }
    }

    public ActionMode startActionMode(ActionMode.Callback callback, int i) {
        ActionMode a = m262116a(callback, i);
        if (a != null) {
            return a;
        }
        return super.startActionMode(callback, i);
    }

    public C67268f(Context context, IAppContext iAppContext) {
        super(context.getApplicationContext(), null, BizType.f35444h.mo49862c());
        this.f169797c = iAppContext;
        new C65726a(getSettings(), iAppContext).mo230326a();
        this.f169799e = hashCode();
        CookieManager.getInstance().setAcceptThirdPartyCookies(this, true);
        m262117a(context);
        HostDependManager.getInst().onCreateWebView(this);
        m262120c();
    }

    /* renamed from: a */
    public void mo233903a(final String str, final ValueCallback<String> valueCallback, final String str2) {
        C67866g.m264027a(new Runnable() {
            /* class com.tt.miniapp.view.webcore.C67268f.RunnableC672702 */

            public void run() {
                ValueCallback valueCallback;
                if (str2 != null) {
                    AppBrandLogger.m52830i("NestLarkWebView", "RealEvaluate: " + str2);
                    valueCallback = new AbstractC67280i<String>(3000) {
                        /* class com.tt.miniapp.view.webcore.C67268f.RunnableC672702.C672711 */

                        /* access modifiers changed from: package-private */
                        @Override // com.tt.miniapp.view.webcore.AbstractC67280i
                        /* renamed from: a */
                        public void mo233917a() {
                            TimeLogger.getInstance(C67268f.this.f169797c).logError("NestLarkWebView_evaluateJavascript_timeout", str2, "timeout: 3000");
                            JSONObject jSONObject = new JSONObject();
                            String str = str;
                            try {
                                jSONObject.put(ApiHandler.API_CALLBACK_ERRMSG, "evaluateJavascript_timeout: 3000");
                                jSONObject.put("tag", str2);
                                jSONObject.put("url", C67268f.this.getUrl());
                                if (str.length() > 200) {
                                    str = str.substring(0, LocationRequest.PRIORITY_HD_ACCURACY) + "...";
                                }
                                jSONObject.put("script", str);
                            } catch (JSONException e) {
                                e.printStackTrace();
                            }
                            C67509b.m262587a("mp_start_error", 6011, jSONObject, C67268f.this.f169797c);
                            new C67500a("mp_webview_load_exception", C67501b.f170243k, C67268f.this.f169797c).addCategoryValue("url", C67268f.this.getUrl()).setResultTypeFail().setErrorMessage("WebView eval js timeout, js: " + str).flush();
                            C25529d.m91162d(C67268f.this.f169797c, str);
                        }

                        /* access modifiers changed from: package-private */
                        /* renamed from: a */
                        public void mo233918a(String str) {
                            if (valueCallback != null) {
                                valueCallback.onReceiveValue(str);
                            }
                        }
                    };
                } else {
                    valueCallback = valueCallback;
                }
                C67268f.super.evaluateJavascript(str, valueCallback);
            }
        });
    }

    /* access modifiers changed from: protected */
    public void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        if (this.f169798d) {
            super.scrollTo(0, 0);
        } else {
            super.onOverScrolled(i, i2, z, z2);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.larkwebview.base.LarkWebView
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        AbstractC67282j.AbstractC67284b bVar = this.f169801g;
        if (bVar != null) {
            bVar.mo232559a(i, i2, i3, i4);
        }
        super.onScrollChanged(i, i2, i3, i4);
    }
}
