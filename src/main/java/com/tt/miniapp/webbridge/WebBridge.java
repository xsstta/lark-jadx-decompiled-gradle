package com.tt.miniapp.webbridge;

import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.utils.CharacterUtils;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.larksuite.component.openplatform.core.loader.jsbundle.C24512a;
import com.larksuite.component.openplatform.core.plugin.ccm.C24618a;
import com.larksuite.component.openplatform.core.plugin.inner.C25009j;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.RenderViewManager;
import com.tt.miniapp.jsbridge.V8ShareManager;
import com.tt.miniapp.p3258a.AbstractC65718b;
import com.tt.miniapp.p3258a.C65720d;
import com.tt.miniapp.util.TimeLogger;
import com.tt.miniapp.view.webcore.AbstractC67261e;
import com.tt.miniapp.webbridge.aysnc.C67305b;
import com.tt.miniapp.webbridge.aysnc.C67308c;
import com.tt.miniapp.webbridge.sync.C67334aa;
import com.tt.miniapp.webbridge.sync.C67335ab;
import com.tt.miniapp.webbridge.sync.C67348c;
import com.tt.miniapp.webbridge.sync.C67349d;
import com.tt.miniapp.webbridge.sync.C67351e;
import com.tt.miniapp.webbridge.sync.C67354f;
import com.tt.miniapp.webbridge.sync.C67356g;
import com.tt.miniapp.webbridge.sync.C67361h;
import com.tt.miniapp.webbridge.sync.C67362i;
import com.tt.miniapp.webbridge.sync.C67365j;
import com.tt.miniapp.webbridge.sync.C67367k;
import com.tt.miniapp.webbridge.sync.C67369l;
import com.tt.miniapp.webbridge.sync.C67374m;
import com.tt.miniapp.webbridge.sync.C67377n;
import com.tt.miniapp.webbridge.sync.C67380o;
import com.tt.miniapp.webbridge.sync.C67383p;
import com.tt.miniapp.webbridge.sync.C67386q;
import com.tt.miniapp.webbridge.sync.C67388r;
import com.tt.miniapp.webbridge.sync.C67390s;
import com.tt.miniapp.webbridge.sync.C67391t;
import com.tt.miniapp.webbridge.sync.C67393v;
import com.tt.miniapp.webbridge.sync.C67396w;
import com.tt.miniapp.webbridge.sync.C67398x;
import com.tt.miniapp.webbridge.sync.C67400y;
import com.tt.miniapp.webbridge.sync.C67402z;
import com.tt.miniapp.webbridge.sync.ReportTimeLineHandler;
import com.tt.miniapp.webbridge.sync.p3355a.C67324a;
import com.tt.miniapp.webbridge.sync.p3355a.C67332c;
import com.tt.miniapp.webbridge.sync.p3356b.C67338a;
import com.tt.miniapp.webbridge.sync.p3356b.C67340b;
import com.tt.miniapp.webbridge.sync.p3356b.C67342c;
import com.tt.miniapp.webbridge.sync.p3356b.C67344d;
import com.tt.miniapp.webbridge.sync.p3356b.C67346e;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.C67432a;
import com.tt.miniapphost.util.DebugUtil;
import com.tt.option.ext.AbstractC67619e;
import com.tt.option.ext.AbstractC67626k;
import com.tt.option.ext.AbstractC67628l;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.List;

public class WebBridge {
    protected IAppContext appContext;
    private List<String> mInterceptInvokeList;
    private AbstractC65718b<AbstractC67628l> mStrategy;
    private AbstractC67261e mWebView;
    private WeakReference<RenderViewManager.IRender> weakRender;

    @JavascriptInterface
    public int id() {
        if (!V8ShareManager.f167231a.mo231625a()) {
            return -1;
        }
        return this.weakRender.get().getRenderViewId();
    }

    @JavascriptInterface
    public int isSnapshotLaunch() {
        IAppContext iAppContext = this.appContext;
        if (iAppContext == null || iAppContext.getAppId() == null || !V8ShareManager.f167231a.mo231626a(this.appContext)) {
            return -1;
        }
        return 0;
    }

    @JavascriptInterface
    public void onDocumentReady() {
        AppBrandLogger.m52830i("StartApp", "onDocumentReady(), obj: ");
        AbstractC67261e eVar = this.mWebView;
        if (eVar != null) {
            eVar.mo233888e();
            this.mWebView.mo233889f();
            return;
        }
        TimeLogger.getInstance(this.appContext).logTimeDuration("tma_WebBridge_onDocumentReady_WebViewIsNull");
    }

    /* access modifiers changed from: protected */
    public boolean interceptInvoke(String str) {
        return this.mInterceptInvokeList.contains(str);
    }

    public void setRender(RenderViewManager.IRender iRender) {
        this.weakRender = new WeakReference<>(iRender);
    }

    public WebBridge(IAppContext iAppContext) {
        this.mStrategy = new C65720d();
        this.mInterceptInvokeList = Arrays.asList("openCustomerService");
        this.appContext = iAppContext;
    }

    @JavascriptInterface
    public void onDocumentReady(String str) {
        AppBrandLogger.m52830i("StartApp", "onDocumentReady, obj: " + str);
        if (str.equals("page-frame.html")) {
            TimeLogger.getInstance(this.appContext).logTimeDuration("tma_WebBridge_onDocumentReady_pageframe.html");
            if (C24512a.m89385a(this.appContext.getAppId())) {
                this.mWebView.mo233887d();
                return;
            }
            return;
        }
        AbstractC67261e eVar = this.mWebView;
        if (eVar != null) {
            eVar.mo233888e();
        } else {
            TimeLogger.getInstance(this.appContext).logTimeDuration("tma_WebBridge_onDocumentReady_WebViewIsNull");
        }
    }

    public WebBridge(AbstractC67261e eVar, IAppContext iAppContext) {
        this(iAppContext);
        this.mWebView = eVar;
        this.appContext = iAppContext;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void callbackWebView(int i, String str) {
        RenderViewManager renderViewManager = AppbrandApplicationImpl.getInst(this.appContext).getRenderViewManager();
        if (renderViewManager != null) {
            renderViewManager.invokeHandler(this.mWebView.getRenderViewId(), i, str);
        }
    }

    @JavascriptInterface
    public String invoke(String str, String str2, int i) {
        return executeInvoke(str, str2, i, "");
    }

    @JavascriptInterface
    public String publish(String str, String str2, int[] iArr) {
        return executePublish(str, str2, iArr);
    }

    private String executePublish(String str, String str2, int[] iArr) {
        int i;
        Object[] objArr = new Object[6];
        objArr[0] = " publish event ";
        objArr[1] = str;
        objArr[2] = " param ";
        if (str2 == null) {
            i = 0;
        } else {
            i = str2.length();
        }
        objArr[3] = Integer.valueOf(i);
        objArr[4] = " webviewIds ";
        objArr[5] = iArr;
        AppBrandLogger.m52830i("tma_WebBridge", objArr);
        WeakReference<RenderViewManager.IRender> weakReference = this.weakRender;
        if (weakReference != null) {
            RenderViewManager.IRender iRender = weakReference.get();
            if (iRender == null) {
                return null;
            }
            C67432a.m262319a(this.appContext).getJsBridge().sendMsgToJsCore(str, str2, iRender.getRenderViewId());
            return null;
        }
        AppBrandLogger.m52829e("tma_WebBridge", "WeakRender is null when publish: ", str, str2);
        return null;
    }

    /* access modifiers changed from: protected */
    public String handleInterceptedInvoke(String str, String str2, int i) {
        Object[] objArr = new Object[6];
        int i2 = 0;
        objArr[0] = "handleInterceptedInvoke event ";
        objArr[1] = str;
        objArr[2] = " param ";
        if (str2 != null) {
            i2 = str2.length();
        }
        objArr[3] = Integer.valueOf(i2);
        objArr[4] = " callbackId ";
        objArr[5] = Integer.valueOf(i);
        AppBrandLogger.m52830i("tma_WebBridge", objArr);
        if (TextUtils.equals(str, "openCustomerService")) {
            C67305b bVar = new C67305b(str2, i, new AbstractC67619e() {
                /* class com.tt.miniapp.webbridge.WebBridge.C673011 */

                @Override // com.tt.option.ext.AbstractC67619e
                public void callback(int i, String str) {
                    WebBridge.this.callbackWebView(i, str);
                }
            });
            bVar.setAppContext(this.appContext);
            bVar.doAct();
        }
        return CharacterUtils.empty();
    }

    private String executeInvoke(String str, String str2, int i, String str3) {
        AbstractC67626k.AbstractC67627a nativeViewCreator;
        AbstractC67628l a;
        int i2;
        int i3;
        if (interceptInvoke(str)) {
            return handleInterceptedInvoke(str, str2, i);
        }
        if (DebugUtil.debug()) {
            Object[] objArr = new Object[8];
            objArr[0] = "invoke event ";
            objArr[1] = str;
            objArr[2] = " param ";
            if (str2 == null) {
                i3 = 0;
            } else {
                i3 = str2;
            }
            objArr[3] = i3;
            objArr[4] = " callbackId ";
            objArr[5] = Integer.valueOf(i);
            objArr[6] = " extra ";
            objArr[7] = str3;
            AppBrandLogger.m52830i("tma_WebBridge", objArr);
        } else {
            Object[] objArr2 = new Object[8];
            objArr2[0] = "invoke event ";
            objArr2[1] = str;
            objArr2[2] = " param ";
            if (str2 == null) {
                i2 = 0;
            } else {
                i2 = str2.length();
            }
            objArr2[3] = Integer.valueOf(i2);
            objArr2[4] = " callbackId ";
            objArr2[5] = Integer.valueOf(i);
            objArr2[6] = " extra ";
            objArr2[7] = str3;
            AppBrandLogger.m52830i("tma_WebBridge", objArr2);
        }
        AbstractC67628l lVar = null;
        if (TextUtils.equals(str, "insertTextArea")) {
            lVar = new C67335ab(this.weakRender.get(), str2, i);
        } else if (TextUtils.equals(str, "removeTextArea")) {
            lVar = new C67367k(this.weakRender.get(), str2, i);
        } else if (TextUtils.equals(str, "insertVideoPlayer")) {
            lVar = new C67340b(this.weakRender.get(), str2, i);
        } else if (TextUtils.equals(str, "hideKeyboard")) {
            lVar = new C67349d(this.weakRender.get(), str2, i);
        } else if (TextUtils.equals(str, "updateTextArea")) {
            lVar = new C67402z(this.weakRender.get(), str2, i);
        } else if (TextUtils.equals(str, "updateVideoPlayer")) {
            lVar = new C67346e(this.weakRender.get(), str2, i);
        } else if (TextUtils.equals(str, "removeVideoPlayer")) {
            lVar = new C67344d(this.weakRender.get(), str2, i);
        } else if (TextUtils.equals(str, "showKeyboard")) {
            lVar = new C67374m(this.weakRender.get(), str2, i);
        } else if (TextUtils.equals(str, "showTextAreaKeyboard")) {
            lVar = new C67386q(this.weakRender.get(), str2, i);
        } else if (TextUtils.equals(str, "updateInput")) {
            lVar = new C67398x(this.weakRender.get(), str2, i);
        } else if (TextUtils.equals(str, "showPickerView")) {
            lVar = new C67380o(this.weakRender.get(), str2, i);
        } else if (TextUtils.equals(str, "showDatePickerView")) {
            lVar = new C67369l(this.weakRender.get(), str2, i);
        } else if (TextUtils.equals(str, "showMultiPickerView")) {
            lVar = new C67377n(this.weakRender.get(), str2, i);
        } else if (TextUtils.equals(str, "updateMultiPickerView")) {
            lVar = new C67400y(this.weakRender.get(), str2, i);
        } else if (TextUtils.equals(str, "showRegionPickerView")) {
            lVar = new C67383p(this.weakRender.get(), str2, i);
        } else if (TextUtils.equals(str, "insertHTMLWebView")) {
            lVar = new C67354f(this.weakRender.get(), str2, i);
            this.weakRender.get().setLoadAsWebView();
            AppbrandApplicationImpl.getInst(this.appContext).setCurrentPageType("webview");
        } else if (TextUtils.equals(str, "updateHTMLWebView")) {
            lVar = new C67396w(this.weakRender.get(), str2, i);
            this.weakRender.get().setLoadAsWebView();
            AppbrandApplicationImpl.getInst(this.appContext).setCurrentPageType("webview");
        } else if (TextUtils.equals(str, "removeHTMLWebView")) {
            lVar = new C67365j(this.weakRender.get(), str2, i);
        } else if (TextUtils.equals(str, "protocolPathToAbsPath")) {
            lVar = new C67348c(this.weakRender.get(), str2, i);
        } else if (TextUtils.equals(str, "disableScrollBounce")) {
            lVar = new C67334aa(this.weakRender.get(), str2, i);
        } else if (TextUtils.equals(str, "systemLog")) {
            lVar = new C67391t(this.weakRender.get(), str2, i);
        } else if (TextUtils.equals(str, "operateVideoContext")) {
            lVar = new C67342c(this.weakRender.get(), str2, i);
        } else if (TextUtils.equals(str, "reportTimeline")) {
            lVar = new ReportTimeLineHandler(this.weakRender.get(), str2, i);
        } else if (TextUtils.equals(str, "videoRequestFullScreen")) {
            lVar = new C67338a(this.weakRender.get(), str2, i);
        } else if (TextUtils.equals(str, "postErrors")) {
            lVar = new C67361h(null, str2, i);
        } else if (TextUtils.equals(str, "launchApp")) {
            lVar = new C67356g(this.weakRender.get(), str2, i);
        } else if (TextUtils.equals(str, "snapshotReady")) {
            lVar = new C67390s(this.weakRender.get(), str2, i);
        } else if (TextUtils.equals(str, "insertAdHTMLWebView")) {
            lVar = new C67351e(this.weakRender.get(), str2, i);
            this.weakRender.get().setLoadAsWebView();
            AppbrandApplicationImpl.getInst(this.appContext).setCurrentPageType("webview");
        } else if (TextUtils.equals(str, "updateAdHTMLWebView")) {
            lVar = new C67393v(this.weakRender.get(), str2, i);
            this.weakRender.get().setLoadAsWebView();
            AppbrandApplicationImpl.getInst(this.appContext).setCurrentPageType("webview");
        } else if (TextUtils.equals(str, "removeAdHTMLWebView")) {
            lVar = new C67362i(this.weakRender.get(), str2, i);
        } else if (TextUtils.equals(str, "showToast")) {
            lVar = new C67388r(this.weakRender.get(), str2, i);
        } else if (TextUtils.equals(str, "storePreRenderData")) {
            lVar = new C25009j(this.weakRender.get(), str2, i);
        } else if (TextUtils.equals(str, "monitorReport")) {
            lVar = new C67308c(this.weakRender.get(), str2, i);
        } else if (TextUtils.equals(str, "editorFilePathConvert")) {
            lVar = new C24618a(this.weakRender.get(), str2, i);
        } else if (TextUtils.equals(str, "showPopoverMenu")) {
            lVar = new C67332c(this.weakRender.get(), str2, i);
        } else if (TextUtils.equals(str, "hidePopoverMenu")) {
            lVar = new C67324a(this.weakRender.get(), str2, i);
        }
        if (!((lVar != null && !lVar.canOverride()) || (nativeViewCreator = AppbrandContext.getInst().getNativeViewCreator()) == null || (a = nativeViewCreator.mo49015a(str, this.weakRender.get(), str2, i)) == null)) {
            lVar = a;
        }
        if (lVar == null) {
            return CharacterUtils.empty();
        }
        lVar.setAppContext(this.appContext);
        this.mStrategy.mo230307a(lVar, str, this.appContext);
        String act = lVar.act();
        AppBrandLogger.m52830i("tma_WebBridge", "invoke return ", act);
        return act;
    }
}
