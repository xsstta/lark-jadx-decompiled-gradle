package com.tt.miniapp.p3295j.p3297b;

import android.app.Activity;
import android.net.Uri;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.ViewGroup;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.schedulers.Action;
import com.bytedance.ee.lark.infra.foundation.schedulers.Schedulers;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.tt.frontendapiinterface.ApiCallResultHelper;
import com.tt.frontendapiinterface.IBackPressedListener;
import com.tt.miniapp.AbstractC65993e;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.BridgeUniteHelper;
import com.tt.miniapp.RenderViewManager;
import com.tt.miniapp.ab.C65726a;
import com.tt.miniapp.event.C66036d;
import com.tt.miniapp.p3295j.C66207a;
import com.tt.miniapp.p3295j.p3296a.C66208a;
import com.tt.miniapp.p3361z.C67415a;
import com.tt.miniapp.util.C67049n;
import com.tt.miniapp.util.C67070z;
import com.tt.miniapp.view.webcore.C67237b;
import com.tt.miniapp.webbridge.C67302a;
import com.tt.miniapp.webbridge.NewModalWebLarkBridge;
import com.tt.miniapphost.AbstractC67497e;
import com.tt.miniapphost.p3362a.p3363a.AbstractC67433a;
import com.tt.miniapphost.util.AppbrandUtil;
import com.tt.refer.common.util.C67866g;
import java.io.File;
import java.io.FileInputStream;
import java.net.URLConnection;
import org.json.JSONObject;

/* renamed from: com.tt.miniapp.j.b.a */
public class C66211a {

    /* renamed from: a */
    public SparseArray<RenderViewManager.IRender> f167125a = new SparseArray<>();

    /* access modifiers changed from: private */
    /* renamed from: com.tt.miniapp.j.b.a$a */
    public static final class C66218a {

        /* renamed from: a */
        static final C66211a f167147a = new C66211a();
    }

    /* renamed from: com.tt.miniapp.j.b.a$b */
    public interface AbstractC66219b {
        /* renamed from: a */
        void mo87617a(boolean z, int i, String str, int i2);
    }

    /* renamed from: com.tt.miniapp.j.b.a$c */
    public interface AbstractC66220c {
        /* renamed from: a */
        void mo87619a(boolean z);
    }

    /* renamed from: a */
    public static C66211a m259198a() {
        return C66218a.f167147a;
    }

    /* renamed from: b */
    public int mo231560b() {
        RenderViewManager.IRender valueAt;
        int size = this.f167125a.size() - 1;
        if (size < 0 || (valueAt = this.f167125a.valueAt(size)) == null) {
            return -1;
        }
        return valueAt.getRenderViewId();
    }

    /* renamed from: a */
    private RenderViewManager.IRender m259197a(int i, boolean z) {
        RenderViewManager.IRender iRender;
        synchronized (this) {
            if (i == -1) {
                i = mo231560b();
            }
            iRender = this.f167125a.get(i);
            if (z) {
                this.f167125a.remove(i);
            }
        }
        return iRender;
    }

    /* renamed from: a */
    public boolean mo231558a(Uri uri, Uri uri2) {
        if (uri == uri2) {
            return true;
        }
        if (uri == null || uri2 == null || !TextUtils.equals(uri.getScheme(), uri2.getScheme()) || !TextUtils.equals(uri.getHost(), uri2.getHost()) || !TextUtils.equals(uri.getPath(), uri2.getPath())) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public boolean mo231559a(final IAppContext iAppContext, int i) {
        AppBrandLogger.m52828d("ModalWebViewControl", "closeModalWebView");
        final RenderViewManager.IRender a = m259197a(i, true);
        if (a != null) {
            C67866g.m264027a(new Runnable() {
                /* class com.tt.miniapp.p3295j.p3297b.C66211a.RunnableC662173 */

                public void run() {
                    RenderViewManager renderViewManager = AppbrandApplicationImpl.getInst(iAppContext).getRenderViewManager();
                    if (renderViewManager != null) {
                        renderViewManager.removeRender(a.getRenderViewId());
                    }
                    Object realRenderView = a.getRealRenderView();
                    if (realRenderView instanceof WebView) {
                        C67070z.m261392a((WebView) realRenderView);
                    }
                }
            });
            return true;
        }
        AppBrandLogger.m52830i("ModalWebViewControl", "closeModalWebView render is null");
        return false;
    }

    /* renamed from: a */
    public void mo231556a(int i, final boolean z, final AbstractC66220c cVar) {
        final RenderViewManager.IRender a = m259197a(i, false);
        if (a != null) {
            C67866g.m264027a(new Runnable() {
                /* class com.tt.miniapp.p3295j.p3297b.C66211a.RunnableC662162 */

                public void run() {
                    Object realRenderView = a.getRealRenderView();
                    if (realRenderView instanceof WebView) {
                        WebView webView = (WebView) realRenderView;
                        int i = 0;
                        if (webView != null) {
                            if (!z) {
                                i = 8;
                            }
                            webView.setVisibility(i);
                            cVar.mo87619a(true);
                            return;
                        }
                        cVar.mo87619a(false);
                    }
                }
            });
        } else {
            cVar.mo87619a(false);
        }
    }

    /* renamed from: a */
    public void mo231557a(final IAppContext iAppContext, String str, final AbstractC66219b bVar) {
        final String str2;
        final boolean z;
        final boolean z2;
        AppBrandLogger.m52828d("ModalWebViewControl", "openModalWebView");
        final Activity currentActivity = iAppContext.getCurrentActivity();
        if (currentActivity == null) {
            AppBrandLogger.m52829e("ModalWebViewControl", "openModalWebView currentActivity == null");
            bVar.mo87617a(false, 1003, "activity is null", -1);
        } else if (TextUtils.isEmpty(str)) {
            AppBrandLogger.m52829e("ModalWebViewControl", "openModalWebView TextUtils.isEmpty(params)");
            bVar.mo87617a(false, 1003, "params is empty", -1);
        } else {
            final String absolutePath = AppbrandUtil.getOfflineZipDir(currentActivity).getAbsolutePath();
            try {
                JSONObject jSONObject = new JSONObject(str);
                String optString = jSONObject.optString("path");
                if (TextUtils.isEmpty(optString) || !optString.startsWith("ttoffline")) {
                    String optString2 = jSONObject.optString("url");
                    if (TextUtils.isEmpty(optString2)) {
                        AppBrandLogger.m52829e("ModalWebViewControl", "openModalWebView TextUtils.isEmpty(loadUrl) params:", str);
                        bVar.mo87617a(false, 1003, ApiCallResultHelper.generateIllegalParamExtraInfo("url"), -1);
                        return;
                    }
                    str2 = optString2;
                    z = false;
                } else {
                    String a = C67415a.m262297a(currentActivity, optString);
                    if (TextUtils.isEmpty(a)) {
                        AppBrandLogger.m52829e("ModalWebViewControl", "openModalWebView TextUtils.isEmpty(loadUrl) params:", str);
                        bVar.mo87617a(false, 1003, ApiCallResultHelper.generateIllegalParamExtraInfo("path"), -1);
                    }
                    str2 = a;
                    z = true;
                }
                if (jSONObject.optInt("hide") == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                final Uri parse = Uri.parse(str2);
                C67866g.m264027a(new Runnable() {
                    /* class com.tt.miniapp.p3295j.p3297b.C66211a.RunnableC662121 */

                    public void run() {
                        final int a = C67302a.m262173a();
                        final boolean[] zArr = {true};
                        WebView webView = new WebView(currentActivity);
                        webView.setBackgroundColor(0);
                        webView.setWebViewClient(new C67237b(iAppContext) {
                            /* class com.tt.miniapp.p3295j.p3297b.C66211a.RunnableC662121.C662131 */

                            @Override // com.tt.miniapp.view.webcore.C67237b
                            public void onPageFinished(WebView webView, String str) {
                                super.onPageFinished(webView, str);
                                if (!TextUtils.isEmpty(str) && C66211a.this.mo231558a(Uri.parse(str), parse)) {
                                    C67866g.m264025a(new Action() {
                                        /* class com.tt.miniapp.p3295j.p3297b.C66211a.RunnableC662121.C662131.C662141 */

                                        @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Action
                                        public void act() {
                                            if (zArr[0]) {
                                                bVar.mo87617a(true, 0, null, a);
                                            } else {
                                                bVar.mo87617a(false, CommonCode.StatusCode.API_CLIENT_EXPIRED, "load failed", a);
                                            }
                                        }
                                    }, Schedulers.shortIO());
                                }
                            }

                            @Override // com.tt.miniapp.view.webcore.C67237b, android.webkit.WebViewClient
                            public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
                                if (webResourceRequest == null || webResourceRequest.getUrl() == null) {
                                    return super.shouldInterceptRequest(webView, webResourceRequest);
                                }
                                Uri url = webResourceRequest.getUrl();
                                String scheme = url.getScheme();
                                String path = url.getPath();
                                if (z && TextUtils.equals(scheme, "file") && !TextUtils.isEmpty(path) && !path.startsWith(absolutePath)) {
                                    File file = new File(absolutePath + path);
                                    if (file.exists()) {
                                        try {
                                            return new WebResourceResponse(URLConnection.getFileNameMap().getContentTypeFor(url.toString()), "UTF-8", new FileInputStream(file));
                                        } catch (Exception e) {
                                            AppBrandLogger.m52829e("ModalWebViewControl", "shouldInterceptRequest", e);
                                        }
                                    }
                                }
                                return super.shouldInterceptRequest(webView, webResourceRequest);
                            }

                            @Override // com.tt.miniapp.view.webcore.C67237b
                            public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                                if (C66211a.this.mo231558a(webResourceRequest.getUrl(), parse)) {
                                    zArr[0] = false;
                                }
                                super.onReceivedError(webView, webResourceRequest, webResourceError);
                            }

                            public void onReceivedError(WebView webView, int i, String str, String str2) {
                                if (!TextUtils.isEmpty(str2) && C66211a.this.mo231558a(Uri.parse(str2), parse)) {
                                    zArr[0] = false;
                                }
                                C66036d.m258584a("openModalWebView onReceivedError errorCode:" + i + " description:" + str + "failingUrl:" + str2, iAppContext);
                                super.onReceivedError(webView, i, str, str2);
                            }
                        });
                        C66208a aVar = new C66208a(a, iAppContext);
                        C66207a aVar2 = new C66207a(webView, a);
                        aVar.setRender(aVar2);
                        webView.addJavascriptInterface(aVar, "ttJSCore");
                        if (BridgeUniteHelper.f166701a.mo231125a()) {
                            AppBrandLogger.m52828d("ModalWebViewControl", "use new bridge");
                            NewModalWebLarkBridge dVar = new NewModalWebLarkBridge(a, iAppContext);
                            dVar.mo233986a(aVar2);
                            webView.addJavascriptInterface(dVar, "Lark_Bridge");
                        }
                        new C65726a(webView.getSettings(), iAppContext).mo230326a();
                        webView.loadUrl(str2);
                        ((ViewGroup) ((ViewGroup) currentActivity.findViewById(16908290)).getChildAt(0)).addView(webView, new FrameLayout.LayoutParams(-1, -1));
                        synchronized (C66211a.this) {
                            C66211a.this.f167125a.put(a, aVar2);
                        }
                        IAppContext iAppContext = iAppContext;
                        if (iAppContext instanceof AbstractC67433a) {
                            AbstractC67433a aVar3 = (AbstractC67433a) iAppContext;
                            if (aVar3.mo234156a() instanceof AbstractC67497e) {
                                AbstractC67497e eVar = (AbstractC67497e) aVar3.mo234156a();
                                if (eVar instanceof AbstractC65993e) {
                                    ((AbstractC65993e) eVar).registerBackPressedListener(new IBackPressedListener() {
                                        /* class com.tt.miniapp.p3295j.p3297b.C66211a.RunnableC662121.C662152 */

                                        @Override // com.tt.frontendapiinterface.IBackPressedListener
                                        public boolean onBackPressed() {
                                            int b = C66211a.this.mo231560b();
                                            if (b == -1) {
                                                return false;
                                            }
                                            C67049n.m261312a("modalWebview", b, iAppContext);
                                            return true;
                                        }
                                    });
                                }
                            }
                        }
                        RenderViewManager renderViewManager = AppbrandApplicationImpl.getInst(iAppContext).getRenderViewManager();
                        if (renderViewManager != null) {
                            renderViewManager.addRender(aVar2);
                        }
                        if (z2) {
                            webView.setVisibility(8);
                        }
                    }
                });
            } catch (Exception e) {
                AppBrandLogger.m52829e("ModalWebViewControl", "openModalWebView", e);
                bVar.mo87617a(false, 1003, ApiCallResultHelper.generateThrowableExtraInfo(e), -1);
                C66036d.m258584a("openModalWebView parse loadUrl exception:" + e, iAppContext);
            }
        }
    }
}
