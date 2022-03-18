package com.larksuite.component.openplatform.core.plugin.infra;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.larksuite.suite.R;
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
import org.json.JSONObject;

/* renamed from: com.larksuite.component.openplatform.core.plugin.infra.e */
class C24888e {
    /* renamed from: a */
    public static JSONObject m90070a(IAppContext iAppContext) throws Exception {
        String str;
        int i;
        Context applicationContext = iAppContext.getApplicationContext();
        boolean k = ((AbstractC67709b.AbstractC67710a) ((AbstractC67709b) iAppContext.findServiceByInterface(AbstractC67709b.class)).mo235130i()).mo235060k();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("brand", C67043j.m261271a());
        jSONObject.put("model", C67043j.m261276b());
        jSONObject.put("pixelRatio", (double) C67043j.m261281e(applicationContext));
        jSONObject.put(HiAnalyticsConstant.HaKey.BI_KEY_VERSION, C67043j.m261283f(applicationContext));
        if (iAppContext.getAppType() != AppType.CardAPP) {
            if (k) {
                i = 0;
            } else {
                i = C67590h.m263081b(applicationContext, (float) C67043j.m261285g(applicationContext));
            }
            jSONObject.put("statusBarHeight", i);
            jSONObject.put("fontSizeSetting", (double) C67043j.m261287h(applicationContext));
            jSONObject.put("battery", C67043j.m261289j(applicationContext));
            m90076c(iAppContext, jSONObject);
        }
        if (iAppContext.getAppType() == AppType.GadgetAPP) {
            RenderViewManager.IRender currentIRender = AppbrandApplicationImpl.getInst(iAppContext).getRenderViewManager().getCurrentIRender();
            if (currentIRender != null) {
                jSONObject.put("isSupportTTWebViewRender", currentIRender.isRenderInBrowserEnabled());
            } else {
                jSONObject.put("isSupportTTWebViewRender", false);
                AppBrandLogger.m52829e("SystemInfoUtil", "current render null");
            }
        } else if (AppType.BlockitApp == iAppContext.getAppType() && ((Boolean) iAppContext.getExtra("darkmode")).booleanValue()) {
            jSONObject.put("theme", C67043j.m261272a(iAppContext.getCurrentActivity().getResources().getConfiguration()));
        }
        jSONObject.put("wifiSignal", C67043j.m261288i(applicationContext));
        String d = C67043j.m261279d();
        if (!TextUtils.isEmpty(d)) {
            String trim = d.trim();
            if (!trim.toLowerCase().startsWith("android")) {
                trim = C67043j.m261282e() + " " + trim;
            }
            jSONObject.put("system", trim);
        }
        jSONObject.put("platform", C67043j.m261282e());
        Locale c = C67479c.m262467a().mo234230c();
        if (c != null) {
            if (TextUtils.isEmpty(c.getCountry())) {
                jSONObject.put("language", c.getLanguage());
            } else {
                jSONObject.put("language", c.getLanguage() + "_" + c.getCountry());
            }
        }
        if (C67857a.m263992a(iAppContext)) {
            str = "Lark";
        } else {
            str = "Feishu";
        }
        jSONObject.put("appName", str);
        if (iAppContext.getAppType() != AppType.CardAPP) {
            m90075b(iAppContext, jSONObject);
        }
        return jSONObject;
    }

    /* renamed from: c */
    private static void m90076c(IAppContext iAppContext, JSONObject jSONObject) throws JSONException {
        Context applicationContext = iAppContext.getApplicationContext();
        if (iAppContext.getAppType() == AppType.GadgetAPP) {
            m90074a(jSONObject, applicationContext, iAppContext);
            if (C67432a.m262319a(iAppContext).getAppInfo() != null) {
                jSONObject.put("gadgetVersion", C67432a.m262319a(iAppContext).getAppInfo().version);
            }
            jSONObject.put("nativeSDKVersion", C67552k.m262718a());
        } else if (iAppContext.getAppType() != AppType.WebAPP && iAppContext.getAppType() == AppType.WebGadgetAPP) {
            m90074a(jSONObject, applicationContext, iAppContext);
            if (C67432a.m262319a(iAppContext).getAppInfo() != null) {
                jSONObject.put("gadgetVersion", C67432a.m262319a(iAppContext).getAppInfo().mWebApp.mo234353c());
            }
        }
    }

    /* renamed from: a */
    public static void m90072a(IAppContext iAppContext, JSONObject jSONObject) {
        View view;
        JSONObject jSONObject2 = new JSONObject();
        iAppContext.getApplicationContext();
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
                    jSONObject2.put("left", 0);
                    jSONObject2.put("right", ceil);
                    jSONObject2.put("top", (int) Math.ceil((double) (((float) view.getTop()) / e)));
                    jSONObject2.put("bottom", (int) Math.ceil((double) (((float) view.getBottom()) / e)));
                    jSONObject2.put("width", ceil + 0);
                    jSONObject2.put("height", (int) Math.ceil((double) (((float) view.getHeight()) / e)));
                    jSONObject.put("navigationBarSafeArea", jSONObject2);
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        AppBrandLogger.m52828d("SystemInfoUtil", " , NavigationBarSafeArea = " + jSONObject2.toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00d1, code lost:
        if (r1 != 0) goto L_0x00e0;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m90075b(com.bytedance.ee.lark.infra.sandbox.context.IAppContext r8, org.json.JSONObject r9) throws org.json.JSONException {
        /*
        // Method dump skipped, instructions count: 309
        */
        throw new UnsupportedOperationException("Method not decompiled: com.larksuite.component.openplatform.core.plugin.infra.C24888e.m90075b(com.bytedance.ee.lark.infra.sandbox.context.IAppContext, org.json.JSONObject):void");
    }

    /* renamed from: a */
    private static void m90071a(IAppContext iAppContext, Context context, int[] iArr) {
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

    /* renamed from: a */
    private static void m90074a(JSONObject jSONObject, Context context, IAppContext iAppContext) throws JSONException {
        String b = C66399c.m259608a().mo231922b(context, iAppContext);
        String b2 = C66399c.m259608a().mo231922b(context, iAppContext);
        if (!TextUtils.isEmpty(b2)) {
            jSONObject.put("SDKUpdateVersion", b2);
        }
        if (!TextUtils.isEmpty(b)) {
            jSONObject.put("SDKVersion", b);
        }
    }

    /* renamed from: a */
    private static void m90073a(IAppContext iAppContext, JSONObject jSONObject, int i, int i2) throws JSONException {
        int i3;
        int i4;
        int i5;
        int i6;
        WindowInsets rootWindowInsets;
        if (iAppContext.getAppType() == AppType.GadgetAPP) {
            Context applicationContext = iAppContext.getApplicationContext();
            DisplayCutout displayCutout = null;
            JSONObject jSONObject2 = new JSONObject();
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
                jSONObject2.put("left", i5);
                jSONObject2.put("right", i);
                jSONObject2.put("top", i4);
                jSONObject2.put("bottom", i2);
                jSONObject2.put("width", i6);
                jSONObject2.put("height", i3);
            } catch (Exception e) {
                e.printStackTrace();
            }
            AppBrandLogger.m52828d("SystemInfoUtil", " , safeArea = " + jSONObject2.toString());
            jSONObject.put("safeArea", jSONObject2);
        }
    }
}
