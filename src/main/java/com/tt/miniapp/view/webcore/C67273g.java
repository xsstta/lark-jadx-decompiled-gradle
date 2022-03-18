package com.tt.miniapp.view.webcore;

import android.app.Activity;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.huawei.hms.location.LocationRequest;
import com.larksuite.component.openplatform.core.utils.C25529d;
import com.larksuite.suite.R;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.GadgetErrorRecoveryManager;
import com.tt.miniapp.errorcode.ErrorCode;
import com.tt.miniapp.errorcode.ErrorType;
import com.tt.miniapp.process.p3316a.C66612a;
import com.tt.miniapp.util.TimeLogger;
import com.tt.miniapp.util.VideoFullScreenHelper;
import com.tt.miniapp.view.webcore.AbstractC67282j;
import com.tt.miniapp.view.webcore.p3349a.C67236a;
import com.tt.miniapphost.AbstractC67550j;
import com.tt.miniapphost.data.ContextSingletonInstance;
import com.tt.miniapphost.host.HostDependManager;
import com.tt.miniapphost.p3362a.p3363a.AbstractC67433a;
import com.tt.miniapphost.p3371e.C67509b;
import com.tt.miniapphost.p3371e.p3372a.C67500a;
import com.tt.miniapphost.p3371e.p3372a.C67501b;
import com.tt.refer.common.util.C67866g;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.tt.miniapp.view.webcore.g */
public class C67273g extends WebView {

    /* renamed from: a */
    public VideoFullScreenHelper f169810a;

    /* renamed from: b */
    public boolean f169811b;

    /* renamed from: c */
    public IAppContext f169812c;

    /* renamed from: d */
    private boolean f169813d;

    /* renamed from: e */
    private int f169814e;

    /* renamed from: f */
    private boolean f169815f;

    /* renamed from: g */
    private AbstractC67282j.AbstractC67284b f169816g;

    /* renamed from: com.tt.miniapp.view.webcore.g$a */
    public static class C67278a {

        /* renamed from: a */
        public boolean f169825a;
    }

    public VideoFullScreenHelper getVideoFullScreenHelper() {
        return this.f169810a;
    }

    /* renamed from: a */
    public boolean mo233921a() {
        return ContextSingletonInstance.getInstance().webViewDataInstance.f169825a;
    }

    public void setDisableDefaultPopMenu(boolean z) {
        this.f169815f = z;
    }

    public void setDisableScroll(boolean z) {
        this.f169813d = z;
    }

    public void setVideoFullScreenHelper(VideoFullScreenHelper videoFullScreenHelper) {
        this.f169810a = videoFullScreenHelper;
    }

    public void loadUrl(final String str) {
        C67866g.m264027a(new Runnable() {
            /* class com.tt.miniapp.view.webcore.C67273g.RunnableC672741 */

            public void run() {
                try {
                    C67273g.super.loadUrl(str);
                } catch (Exception e) {
                    AppBrandLogger.m52829e("NestWebView", "load url ", str, " ", e.toString());
                }
            }
        });
    }

    public ActionMode startActionMode(ActionMode.Callback callback) {
        ActionMode a = m262128a(callback, -1);
        if (a != null) {
            return a;
        }
        return super.startActionMode(callback);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f169811b = true;
        } else if (action == 1 || action == 3) {
            this.f169811b = false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public void setScrollListener(AbstractC67282j.AbstractC67284b bVar) {
        this.f169816g = bVar;
        if (mo233921a()) {
            HostDependManager.getInst().setPlatformLayerScrollListener(this.f169814e, this.f169816g);
        }
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (!HostDependManager.getInst().getFeatureGating("gadget.component.keyboard.delete")) {
            return onCreateInputConnection;
        }
        AppBrandLogger.m52830i("NestWebView", "customize input connection");
        if (onCreateInputConnection == null) {
            return null;
        }
        return new C67251c(onCreateInputConnection, true);
    }

    @Override // android.webkit.WebView
    public void evaluateJavascript(String str, ValueCallback<String> valueCallback) {
        mo233920a(str, valueCallback, (String) null);
    }

    /* renamed from: a */
    private ActionMode m262128a(ActionMode.Callback callback, int i) {
        if (this.f169815f) {
            return new C67236a(callback, i);
        }
        return null;
    }

    public void scrollTo(int i, int i2) {
        if (this.f169813d) {
            super.scrollTo(0, 0);
        } else {
            super.scrollTo(i, i2);
        }
    }

    public ActionMode startActionMode(ActionMode.Callback callback, int i) {
        ActionMode a = m262128a(callback, i);
        if (a != null) {
            return a;
        }
        return super.startActionMode(callback, i);
    }

    /* renamed from: a */
    public void mo233920a(final String str, final ValueCallback<String> valueCallback, final String str2) {
        C67866g.m264027a(new Runnable() {
            /* class com.tt.miniapp.view.webcore.C67273g.RunnableC672752 */

            public void run() {
                ValueCallback valueCallback;
                if (str2 != null) {
                    AppBrandLogger.m52830i("NestWebView", "RealEvaluate: " + str2);
                    valueCallback = new AbstractC67280i<String>(3000) {
                        /* class com.tt.miniapp.view.webcore.C67273g.RunnableC672752.C672761 */

                        /* access modifiers changed from: package-private */
                        @Override // com.tt.miniapp.view.webcore.AbstractC67280i
                        /* renamed from: a */
                        public void mo233917a() {
                            TimeLogger.getInstance(C67273g.this.f169812c).logError("NestWebView_evaluateJavascript_timeout", str2, "timeout: 3000");
                            JSONObject jSONObject = new JSONObject();
                            String str = str;
                            try {
                                jSONObject.put(ApiHandler.API_CALLBACK_ERRMSG, "evaluateJavascript_timeout: 3000");
                                jSONObject.put("tag", str2);
                                jSONObject.put("url", C67273g.this.getUrl());
                                if (str.length() > 200) {
                                    str = str.substring(0, LocationRequest.PRIORITY_HD_ACCURACY) + "...";
                                }
                                jSONObject.put("script", str);
                            } catch (JSONException e) {
                                e.printStackTrace();
                            }
                            C67509b.m262587a("mp_start_error", 6011, jSONObject, C67273g.this.f169812c);
                            new C67500a("mp_webview_load_exception", C67501b.f170243k, C67273g.this.f169812c).addCategoryValue("url", C67273g.this.getUrl()).setResultTypeFail().setErrorMessage("WebView eval js timeout, js: " + str).flush();
                            C25529d.m91162d(C67273g.this.f169812c, str);
                            Activity currentActivity = C67273g.this.f169812c.getCurrentActivity();
                            if (currentActivity != null && (C67273g.this.f169812c instanceof AbstractC67433a) && !C67273g.this.f169812c.isEmbedContainer()) {
                                String errorDesc = ((GadgetErrorRecoveryManager) AppbrandApplicationImpl.getInst(C67273g.this.f169812c).getService(GadgetErrorRecoveryManager.class)).getErrorDesc(ErrorType.RUN_ERROR, ErrorCode.WEBVIEW.EVALUATE_JAVA_SCRIPT_ERROR.getCode());
                                AppBrandLogger.m52830i("NestWebView", "evaluateJavascript error desc:" + errorDesc + ", tag:" + str2);
                                HostDependManager.getInst().showModal(currentActivity, null, currentActivity.getString(R.string.OpenPlatform_GadgetErr_AppErrorTtl), errorDesc, true, currentActivity.getString(R.string.microapp_m_map_dialog_cancel), "", currentActivity.getString(R.string.OpenPlatform_GadgetErr_RetryBttn), "", new AbstractC67550j.AbstractC67551a<Integer>() {
                                    /* class com.tt.miniapp.view.webcore.C67273g.RunnableC672752.C672761.C672771 */

                                    /* renamed from: a */
                                    public void onNativeModuleCall(Integer num) {
                                        if (num.intValue() == 1) {
                                            C66612a.m260227a(AppbrandApplicationImpl.getInst(C67273g.this.f169812c).getAppInfo().appId, AppbrandApplicationImpl.getInst(C67273g.this.f169812c).getSchema(), false);
                                        }
                                    }
                                }, currentActivity);
                            }
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
                C67273g.super.evaluateJavascript(str, valueCallback);
            }
        });
    }

    /* access modifiers changed from: protected */
    public void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        if (this.f169813d) {
            super.scrollTo(0, 0);
        } else {
            super.onOverScrolled(i, i2, z, z2);
        }
    }

    /* access modifiers changed from: protected */
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        AbstractC67282j.AbstractC67284b bVar = this.f169816g;
        if (bVar != null) {
            bVar.mo232559a(i, i2, i3, i4);
        }
        super.onScrollChanged(i, i2, i3, i4);
    }
}
