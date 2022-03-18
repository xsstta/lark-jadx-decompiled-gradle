package com.larksuite.component.openplatform.core.plugin.infra;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;
import com.alibaba.fastjson.annotation.JSONField;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.larksuite.component.openplatform.core.plugin.OPPlugin;
import com.larksuite.component.openplatform.core.utils.C25529d;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.larksuite.framework.apiplugin.common.C25921b;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25895f;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25897h;
import com.larksuite.suite.R;
import com.ss.android.lark.optrace.api.ILogger;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.RenderViewManager;
import com.tt.miniapp.manager.p3302a.C66399c;
import com.tt.miniapp.util.C67043j;
import com.tt.miniapp.util.C67052p;
import com.tt.miniapp.util.C67068y;
import com.tt.miniapphost.C67432a;
import com.tt.miniapphost.C67552k;
import com.tt.miniapphost.data.ContextSingletonInstance;
import com.tt.miniapphost.entity.AppInfoEntity;
import com.tt.miniapphost.p3370d.C67479c;
import com.tt.miniapphost.util.C67590h;
import com.tt.refer.common.base.AppType;
import com.tt.refer.common.util.C67857a;
import com.tt.refer.p3400a.p3401a.AbstractC67709b;
import java.lang.ref.WeakReference;
import java.util.Locale;
import org.json.JSONException;

public class GetSystemInfoPlugin extends OPPlugin {

    /* access modifiers changed from: private */
    public static class GetSystemInfoSyncHandlerResponse extends C25921b {
        @JSONField(name = "SDKUpdateVersion")
        public String SDKUpdateVersion;
        @JSONField(name = "SDKVersion")
        public String SDKVersion;
        @JSONField(name = "appName")
        public String appName;
        @JSONField(name = "battery")
        public int battery;
        @JSONField(name = "blockitVersion")
        public String blockitVersion;
        @JSONField(name = "brand")
        public String brand;
        @JSONField(name = "fontSizeSetting")
        public float fontSizeSetting;
        @JSONField(name = "gadgetVersion")
        public String gadgetVersion;
        @JSONField(name = "isSupportTTWebViewRender")
        public boolean isSupportTTWebViewRender;
        @JSONField(name = "language")
        public String language;
        @JSONField(name = "model")
        public String model;
        @JSONField(name = "nativeSDKVersion")
        public String nativeSDKVersion;
        @JSONField(name = "navigationBarSafeArea")
        public NavigationBarSafeArea navigationBarSafeArea;
        @JSONField(name = "pixelRatio")
        public float pixelRatio;
        @JSONField(name = "platform")
        public String platform;
        @JSONField(name = "safeArea")
        public SafeArea safeArea;
        @JSONField(name = "screenHeight")
        public int screenHeight;
        @JSONField(name = "screenWidth")
        public int screenWidth;
        @JSONField(name = "statusBarHeight")
        public int statusBarHeight;
        @JSONField(name = "system")
        public String system;
        @JSONField(name = "theme")
        public String theme;
        @JSONField(name = HiAnalyticsConstant.HaKey.BI_KEY_VERSION)
        public String version;
        @JSONField(name = "wifiSignal")
        public int wifiSignal;
        @JSONField(name = "windowHeight")
        public int windowHeight;
        @JSONField(name = "windowWidth")
        public int windowWidth;

        /* access modifiers changed from: package-private */
        public static class NavigationBarSafeArea {
            @JSONField(name = "bottom")
            public int bottom;
            @JSONField(name = "height")
            public int height;
            @JSONField(name = "left")
            public int left;
            @JSONField(name = "right")
            public int right;
            @JSONField(name = "top")
            public int top;
            @JSONField(name = "width")
            public int width;

            NavigationBarSafeArea() {
            }
        }

        /* access modifiers changed from: package-private */
        public static class SafeArea {
            @JSONField(name = "bottom")
            public int bottom;
            @JSONField(name = "height")
            public int height;
            @JSONField(name = "left")
            public int left;
            @JSONField(name = "right")
            public int right;
            @JSONField(name = "top")
            public int top;
            @JSONField(name = "width")
            public int width;

            SafeArea() {
            }
        }

        private GetSystemInfoSyncHandlerResponse() {
        }
    }

    @Override // com.larksuite.component.openplatform.core.plugin.OPPlugin, com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
        super.onRelease();
    }

    @LKPluginFunction(async = false, eventName = {"getSystemInfoSync"})
    public GetSystemInfoSyncHandlerResponse getSystemInfoSyncHandlerAsync(AbstractC25895f fVar) {
        String str;
        int i;
        ILogger b = fVar.mo92190b();
        GetSystemInfoSyncHandlerResponse getSystemInfoSyncHandlerResponse = new GetSystemInfoSyncHandlerResponse();
        IAppContext appContext = getAppContext();
        Context applicationContext = appContext.getApplicationContext();
        boolean k = ((AbstractC67709b.AbstractC67710a) ((AbstractC67709b) appContext.findServiceByInterface(AbstractC67709b.class)).mo235130i()).mo235060k();
        try {
            getSystemInfoSyncHandlerResponse.brand = C67043j.m261271a();
            getSystemInfoSyncHandlerResponse.model = C67043j.m261271a();
            getSystemInfoSyncHandlerResponse.pixelRatio = C67043j.m261281e(applicationContext);
            getSystemInfoSyncHandlerResponse.version = C67043j.m261283f(applicationContext);
            if (appContext.getAppType() != AppType.CardAPP) {
                if (k) {
                    i = 0;
                } else {
                    i = C67590h.m263081b(applicationContext, (float) C67043j.m261285g(applicationContext));
                }
                getSystemInfoSyncHandlerResponse.statusBarHeight = i;
                getSystemInfoSyncHandlerResponse.battery = C67043j.m261289j(applicationContext);
                getSystemInfoSyncHandlerResponse.fontSizeSetting = C67043j.m261287h(applicationContext);
                addVersionInfo(appContext, getSystemInfoSyncHandlerResponse);
            }
            if (appContext.getAppType() == AppType.GadgetAPP) {
                RenderViewManager.IRender currentIRender = AppbrandApplicationImpl.getInst(appContext).getRenderViewManager().getCurrentIRender();
                if (currentIRender != null) {
                    getSystemInfoSyncHandlerResponse.isSupportTTWebViewRender = currentIRender.isRenderInBrowserEnabled();
                } else {
                    getSystemInfoSyncHandlerResponse.isSupportTTWebViewRender = false;
                    AppBrandLogger.m52829e("GetSystemInfoSyncHandlerPlugin", "current render null");
                }
                String e = C25529d.m91164e(appContext);
                if (!TextUtils.isEmpty(e)) {
                    getSystemInfoSyncHandlerResponse.theme = e;
                }
            } else if (AppType.BlockitApp == appContext.getAppType()) {
                if (((Boolean) appContext.getExtra("darkmode")).booleanValue()) {
                    getSystemInfoSyncHandlerResponse.theme = C67043j.m261272a(appContext.getCurrentActivity().getResources().getConfiguration());
                }
                getSystemInfoSyncHandlerResponse.blockitVersion = (String) appContext.getExtra("basic_lib_version");
            }
            getSystemInfoSyncHandlerResponse.wifiSignal = C67043j.m261288i(applicationContext);
            String d = C67043j.m261279d();
            if (!TextUtils.isEmpty(d)) {
                String trim = d.trim();
                if (!trim.toLowerCase().startsWith("android")) {
                    trim = C67043j.m261282e() + " " + trim;
                }
                getSystemInfoSyncHandlerResponse.system = trim;
            }
            getSystemInfoSyncHandlerResponse.platform = C67043j.m261282e();
            Locale c = C67479c.m262467a().mo234230c();
            if (c != null) {
                if (TextUtils.isEmpty(c.getCountry())) {
                    getSystemInfoSyncHandlerResponse.language = c.getLanguage();
                } else {
                    getSystemInfoSyncHandlerResponse.language = c.getLanguage() + "_" + c.getCountry();
                }
            }
            if (C67857a.m263992a(appContext)) {
                str = "Lark";
            } else {
                str = "Feishu";
            }
            getSystemInfoSyncHandlerResponse.appName = str;
            if (appContext.getAppType() != AppType.CardAPP) {
                addScreenSize(appContext, fVar, getSystemInfoSyncHandlerResponse);
            }
        } catch (Exception e2) {
            b.mo92223e("GetSystemInfoSyncHandlerPlugin", e2);
        }
        return getSystemInfoSyncHandlerResponse;
    }

    @LKPluginFunction(async = true, eventName = {"getSystemInfo"})
    public void GetSystemInfoSyncHandler(AbstractC25895f fVar, AbstractC25897h<GetSystemInfoSyncHandlerResponse> hVar) {
        hVar.callback(getSystemInfoSyncHandlerAsync(fVar));
    }

    public static void addVersionInfo(IAppContext iAppContext, GetSystemInfoSyncHandlerResponse getSystemInfoSyncHandlerResponse) throws Exception {
        Context applicationContext = iAppContext.getApplicationContext();
        if (iAppContext.getAppType() == AppType.GadgetAPP) {
            addSDKVersion(getSystemInfoSyncHandlerResponse, applicationContext, iAppContext);
            if (C67432a.m262319a(iAppContext).getAppInfo() != null) {
                getSystemInfoSyncHandlerResponse.gadgetVersion = C67432a.m262319a(iAppContext).getAppInfo().version;
            }
            getSystemInfoSyncHandlerResponse.nativeSDKVersion = C67552k.m262718a();
        } else if (iAppContext.getAppType() == AppType.WebGadgetAPP) {
            addSDKVersion(getSystemInfoSyncHandlerResponse, applicationContext, iAppContext);
            if (C67432a.m262319a(iAppContext).getAppInfo() != null) {
                getSystemInfoSyncHandlerResponse.gadgetVersion = C67432a.m262319a(iAppContext).getAppInfo().mWebApp.mo234353c();
            }
        }
    }

    private static void addSDKVersion(GetSystemInfoSyncHandlerResponse getSystemInfoSyncHandlerResponse, Context context, IAppContext iAppContext) throws JSONException {
        String b = C66399c.m259608a().mo231922b(context, iAppContext);
        String b2 = C66399c.m259608a().mo231922b(context, iAppContext);
        if (!TextUtils.isEmpty(b2)) {
            getSystemInfoSyncHandlerResponse.SDKUpdateVersion = b2;
        }
        if (!TextUtils.isEmpty(b)) {
            getSystemInfoSyncHandlerResponse.SDKVersion = b;
        }
    }

    private static void validateWH(IAppContext iAppContext, Context context, int[] iArr) {
        int i;
        AppInfoEntity appInfo = AppbrandApplicationImpl.getInst(iAppContext).getAppInfo();
        if (appInfo != null && appInfo.isGame()) {
            int i2 = context.getResources().getConfiguration().orientation;
            if (appInfo.isLandScape) {
                i = 2;
            } else {
                i = 1;
            }
            if (i2 != i) {
                int i3 = iArr[0];
                iArr[0] = iArr[1];
                iArr[1] = i3;
            }
        }
    }

    public static void addNavigationBarSafeArea(IAppContext iAppContext, AbstractC25895f fVar, GetSystemInfoSyncHandlerResponse getSystemInfoSyncHandlerResponse) {
        View view;
        GetSystemInfoSyncHandlerResponse.NavigationBarSafeArea navigationBarSafeArea = new GetSystemInfoSyncHandlerResponse.NavigationBarSafeArea();
        try {
            WeakReference<C67068y.AbstractC67069a> weakReference = ContextSingletonInstance.getInstance().mWeakActivityInfo;
            if (!(!TextUtils.equals(C67052p.m261322a(iAppContext), "custom") || weakReference == null || weakReference.get() == null || weakReference.get().mo232134w() == null)) {
                View w = weakReference.get().mo232134w();
                View findViewById = w.findViewById(R.id.microapp_m_loading_title_bar);
                if (findViewById == null) {
                    view = w.findViewById(R.id.fl_title_bar_capsule_right);
                } else {
                    view = findViewById.findViewById(R.id.fl_title_bar_capsule_right);
                }
                if (view != null) {
                    float e = C67043j.m261281e(iAppContext.getApplicationContext());
                    int ceil = (int) Math.ceil((double) (((float) view.getLeft()) / e));
                    navigationBarSafeArea.left = 0;
                    navigationBarSafeArea.right = ceil;
                    navigationBarSafeArea.top = (int) Math.ceil((double) (((float) view.getTop()) / e));
                    navigationBarSafeArea.bottom = (int) Math.ceil((double) (((float) view.getBottom()) / e));
                    navigationBarSafeArea.width = ceil + 0;
                    navigationBarSafeArea.height = (int) Math.ceil((double) (((float) view.getHeight()) / e));
                    getSystemInfoSyncHandlerResponse.navigationBarSafeArea = navigationBarSafeArea;
                }
            }
        } catch (Exception e2) {
            fVar.mo92190b().mo92223e("GetSystemInfoSyncHandlerPlugin", "addNavigationBarSafeArea", e2);
        }
        AppBrandLogger.m52828d("GetSystemInfoSyncHandlerPlugin", " , NavigationBarSafeArea = " + navigationBarSafeArea.toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00d1, code lost:
        if (r1 != 0) goto L_0x00e0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void addScreenSize(com.bytedance.ee.lark.infra.sandbox.context.IAppContext r8, com.larksuite.framework.apiplugin.p1175a.AbstractC25895f r9, com.larksuite.component.openplatform.core.plugin.infra.GetSystemInfoPlugin.GetSystemInfoSyncHandlerResponse r10) {
        /*
        // Method dump skipped, instructions count: 297
        */
        throw new UnsupportedOperationException("Method not decompiled: com.larksuite.component.openplatform.core.plugin.infra.GetSystemInfoPlugin.addScreenSize(com.bytedance.ee.lark.infra.sandbox.context.IAppContext, com.larksuite.framework.apiplugin.a.f, com.larksuite.component.openplatform.core.plugin.infra.GetSystemInfoPlugin$GetSystemInfoSyncHandlerResponse):void");
    }

    private static void addSafeArea(IAppContext iAppContext, AbstractC25895f fVar, GetSystemInfoSyncHandlerResponse getSystemInfoSyncHandlerResponse, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        WindowInsets rootWindowInsets;
        if (iAppContext.getAppType() == AppType.GadgetAPP) {
            Context applicationContext = iAppContext.getApplicationContext();
            DisplayCutout displayCutout = null;
            GetSystemInfoSyncHandlerResponse.SafeArea safeArea = new GetSystemInfoSyncHandlerResponse.SafeArea();
            try {
                WeakReference<C67068y.AbstractC67069a> weakReference = ContextSingletonInstance.getInstance().mWeakActivityInfo;
                if (!(weakReference == null || weakReference.get() == null || weakReference.get().mo232134w() == null || Build.VERSION.SDK_INT < 28 || (rootWindowInsets = weakReference.get().mo232134w().getRootWindowInsets()) == null)) {
                    displayCutout = rootWindowInsets.getDisplayCutout();
                }
                if (displayCutout == null || Build.VERSION.SDK_INT < 28) {
                    i6 = i;
                    i3 = i2;
                    i5 = 0;
                    i4 = 0;
                } else {
                    i5 = (int) Math.ceil((double) (((float) displayCutout.getSafeInsetLeft()) / C67043j.m261281e(applicationContext)));
                    i -= (int) Math.ceil((double) (((float) displayCutout.getSafeInsetRight()) / C67043j.m261281e(applicationContext)));
                    i4 = (int) Math.ceil((double) (((float) displayCutout.getSafeInsetTop()) / C67043j.m261281e(applicationContext)));
                    i2 -= (int) Math.ceil((double) (((float) displayCutout.getSafeInsetBottom()) / C67043j.m261281e(applicationContext)));
                    i3 = i2 - i4;
                    i6 = i - i5;
                }
                safeArea.left = i5;
                safeArea.right = i;
                safeArea.top = i4;
                safeArea.bottom = i2;
                safeArea.width = i6;
                safeArea.height = i3;
            } catch (Exception e) {
                fVar.mo92190b().mo92223e("GetSystemInfoSyncHandlerPlugin", "addSafeArea", e);
            }
            AppBrandLogger.m52828d("GetSystemInfoSyncHandlerPlugin", " , safeArea = " + safeArea.toString());
            getSystemInfoSyncHandlerResponse.safeArea = safeArea;
        }
    }
}
