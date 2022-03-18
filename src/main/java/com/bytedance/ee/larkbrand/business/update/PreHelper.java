package com.bytedance.ee.larkbrand.business.update;

import android.content.Context;
import android.content.SharedPreferences;
import android.location.Location;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.network.p622a.p623a.C12807f;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.lark.infra.storage.sp.biz.Storage;
import com.bytedance.ee.larkbrand.LarkExtensionManager;
import com.bytedance.ee.larkbrand.service.extension.AbstractC13320j;
import com.larksuite.component.openplatform.core.plugin.device.p1133d.C24819e;
import com.larksuite.component.openplatform.core.plugin.passport.LoginLoadManager;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.permission.C66588h;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.entity.AppInfoEntity;
import com.tt.refer.common.base.AppType;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/bytedance/ee/larkbrand/business/update/PreHelper;", "", "()V", "Companion", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.ee.larkbrand.a.b.d */
public final class PreHelper {

    /* renamed from: a */
    public static final Companion f34506a = new Companion(null);

    @JvmStatic
    /* renamed from: a */
    public static final void m53347a(Context context, String str, JSONObject jSONObject) {
        f34506a.mo48850a(context, str, jSONObject);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m53348a(IAppContext iAppContext, JSONObject jSONObject) {
        f34506a.mo48851a(iAppContext, jSONObject);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m53349a(JSONObject jSONObject, IAppContext iAppContext) {
        f34506a.mo48852a(jSONObject, iAppContext);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0007J\u0018\u0010\u000e\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0007J\"\u0010\u000f\u001a\u00020\t2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0018\u0010\u0013\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/bytedance/ee/larkbrand/business/update/PreHelper$Companion;", "", "()V", "LOGIN_DEFAULT_EXPIRED_TIME", "", "SP_KEY_PRE_LOGIN", "", "TAG", "preDNS", "", "preLoadJson", "Lorg/json/JSONObject;", "appContext", "Lcom/bytedance/ee/lark/infra/sandbox/context/IAppContext;", "preGetConnectedWifi", "preLocation", "context", "Landroid/content/Context;", "appId", "preLogin", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ee.larkbrand.a.b.d$a */
    public static final class Companion {
        private Companion() {
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J>\u0010\u0002\u001a\u00020\u00032\u001a\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001`\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u001a\u0010\r\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000f\u001a\u00020\fH\u0016J$\u0010\u0010\u001a\u00020\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016¨\u0006\u0012"}, d2 = {"com/bytedance/ee/larkbrand/business/update/PreHelper$Companion$preLocation$1", "Lcom/bytedance/ee/larkbrand/service/extension/LocationWrapper$Callback;", "onLocationChange", "", "locationList", "Ljava/util/ArrayList;", "Landroid/location/Location;", "Lkotlin/collections/ArrayList;", "recentLocation", ShareHitPoint.f121869d, "", "locationType", "", "onLocationError", "errorMsg", "errorCode", "onLocationSuccess", "location", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.bytedance.ee.larkbrand.a.b.d$a$a */
        public static final class C12954a implements AbstractC13320j.AbstractC13321a {

            /* renamed from: a */
            final /* synthetic */ long f34507a;

            C12954a(long j) {
                this.f34507a = j;
            }

            @Override // com.bytedance.ee.larkbrand.service.extension.AbstractC13320j.AbstractC13321a
            /* renamed from: a */
            public void mo48854a(String str, int i) {
                AppBrandLogger.m52829e("PreHelper", "pre Location  fail:", str, Integer.valueOf(i));
            }

            @Override // com.bytedance.ee.larkbrand.service.extension.AbstractC13320j.AbstractC13321a
            /* renamed from: a */
            public void mo48853a(Location location, String str, int i) {
                if (location == null) {
                    AppBrandLogger.m52829e("PreHelper", "pre Location fail: la:", "location is null");
                    return;
                }
                AppBrandLogger.m52830i("PreHelper", "pre Location success: la:", Double.valueOf(location.getLatitude()), "lo:", Double.valueOf(location.getLongitude()), "acc:", Float.valueOf(location.getAccuracy()), "timestap:", Long.valueOf(location.getTime()), "type:", str, "duration:", Long.valueOf(System.currentTimeMillis() - this.f34507a), "locationType:", Integer.valueOf(i));
            }

            @Override // com.bytedance.ee.larkbrand.service.extension.AbstractC13320j.AbstractC13321a
            /* renamed from: a */
            public void mo48855a(ArrayList<Location> arrayList, Location location, String str, int i) {
                Integer num;
                Intrinsics.checkParameterIsNotNull(str, ShareHitPoint.f121869d);
                Object[] objArr = new Object[9];
                objArr[0] = "pre Location on location change:size:";
                String str2 = null;
                if (arrayList != null) {
                    num = Integer.valueOf(arrayList.size());
                } else {
                    num = null;
                }
                objArr[1] = num;
                objArr[2] = str;
                objArr[3] = "locationType:";
                objArr[4] = Integer.valueOf(i);
                objArr[5] = "located time:";
                objArr[6] = Long.valueOf(System.currentTimeMillis() - this.f34507a);
                objArr[7] = "recentlocation:";
                if (location != null) {
                    str2 = location.toString();
                }
                objArr[8] = str2;
                AppBrandLogger.m52830i("PreHelper", objArr);
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo48851a(IAppContext iAppContext, JSONObject jSONObject) {
            boolean z;
            Intrinsics.checkParameterIsNotNull(iAppContext, "appContext");
            Intrinsics.checkParameterIsNotNull(jSONObject, "preLoadJson");
            if (iAppContext.getAppType() == AppType.GadgetAPP) {
                String appId = iAppContext.getAppId();
                if (appId == null || appId.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z && jSONObject.has("preloginParams")) {
                    try {
                        JSONObject jSONObject2 = jSONObject.getJSONObject("preloginParams");
                        if (jSONObject2.has(iAppContext.getAppId())) {
                            long optLong = jSONObject2.getJSONObject(iAppContext.getAppId()).optLong("expired", 86400) * 1000;
                            SharedPreferences storageByName = Storage.getStorageByName(iAppContext.getApplicationContext(), Storage.getStorageFilePrefix("gadget_key_pre_login"));
                            long j = storageByName.getLong(iAppContext.getAppId(), 0);
                            if (j != 0) {
                                if (System.currentTimeMillis() - j <= optLong) {
                                    AppBrandLogger.m52830i("PreHelper", "preLogin in expire");
                                    return;
                                }
                            }
                            storageByName.edit().putLong(iAppContext.getAppId(), System.currentTimeMillis()).apply();
                            LoginLoadManager.f62037a.mo88592a(iAppContext, optLong);
                        }
                    } catch (JSONException e) {
                        AppBrandLogger.m52829e("PreHelper", e);
                    }
                }
            }
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo48852a(JSONObject jSONObject, IAppContext iAppContext) {
            Intrinsics.checkParameterIsNotNull(jSONObject, "preLoadJson");
            Intrinsics.checkParameterIsNotNull(iAppContext, "appContext");
            try {
                if (jSONObject.has("preloadConnectedWifi")) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject("preloadConnectedWifi");
                    Intrinsics.checkExpressionValueIsNotNull(jSONObject2, "preLoadJson.getJSONObject(\"preloadConnectedWifi\")");
                    AppbrandApplicationImpl inst = AppbrandApplicationImpl.getInst(iAppContext);
                    Intrinsics.checkExpressionValueIsNotNull(inst, "AppbrandApplicationImpl.getInst(appContext)");
                    AppInfoEntity appInfo = inst.getAppInfo();
                    if (appInfo != null) {
                        AppbrandContext inst2 = AppbrandContext.getInst();
                        Intrinsics.checkExpressionValueIsNotNull(inst2, "AppbrandContext.getInst()");
                        if (inst2.getApplicationContext() != null) {
                            C66588h a = C66588h.m260183a();
                            AppbrandContext inst3 = AppbrandContext.getInst();
                            Intrinsics.checkExpressionValueIsNotNull(inst3, "AppbrandContext.getInst()");
                            if (a.mo232195a(inst3.getApplicationContext(), "android.permission.ACCESS_FINE_LOCATION")) {
                                C66588h a2 = C66588h.m260183a();
                                AppbrandContext inst4 = AppbrandContext.getInst();
                                Intrinsics.checkExpressionValueIsNotNull(inst4, "AppbrandContext.getInst()");
                                if (a2.mo232195a(inst4.getApplicationContext(), "android.permission.ACCESS_COARSE_LOCATION")) {
                                    if (jSONObject2.has(appInfo.appId)) {
                                        C24819e a3 = C24819e.m89919a();
                                        Intrinsics.checkExpressionValueIsNotNull(a3, "AppbrandWifiManager.getInstance()");
                                        a3.mo87854a(new C12807f(iAppContext));
                                        AppBrandLogger.m52830i("pre connected wifi:", appInfo.appId);
                                        return;
                                    }
                                    return;
                                }
                            }
                        }
                        AppBrandLogger.m52830i("PreHelper", "pre Location has no system permission");
                    }
                }
            } catch (JSONException e) {
                AppBrandLogger.m52829e("PreHelper", e);
            }
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo48850a(Context context, String str, JSONObject jSONObject) {
            float f;
            Intrinsics.checkParameterIsNotNull(str, "appId");
            Intrinsics.checkParameterIsNotNull(jSONObject, "preLoadJson");
            try {
                if (jSONObject.has("preloadLocation")) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject("preloadLocation");
                    Intrinsics.checkExpressionValueIsNotNull(jSONObject2, "preLoadJson.getJSONObject(\"preloadLocation\")");
                    if (context == null || !C66588h.m260183a().mo232195a(context, "android.permission.ACCESS_FINE_LOCATION") || !C66588h.m260183a().mo232195a(context, "android.permission.ACCESS_COARSE_LOCATION")) {
                        AppBrandLogger.m52830i("PreHelper", "pre Location has no system permission");
                    } else if (jSONObject2.has(str)) {
                        JSONObject jSONObject3 = jSONObject2.getJSONObject(str);
                        AppBrandLogger.m52830i("PreHelper", "pre Location for appid: " + str + " with params: " + jSONObject3.toString());
                        LarkExtensionManager instance = LarkExtensionManager.getInstance();
                        Intrinsics.checkExpressionValueIsNotNull(instance, "LarkExtensionManager.getInstance()");
                        if (instance.getExtension() != null) {
                            if (TextUtils.equals(jSONObject3.optString("accuracy"), "best")) {
                                f = 20.0f;
                            } else {
                                f = 100.0f;
                            }
                            long currentTimeMillis = System.currentTimeMillis();
                            LarkExtensionManager instance2 = LarkExtensionManager.getInstance();
                            Intrinsics.checkExpressionValueIsNotNull(instance2, "LarkExtensionManager.getInstance()");
                            instance2.getExtension().mo49594a(context, jSONObject3.optString(ShareHitPoint.f121869d, "wgs84"), f, (long) (jSONObject3.optInt("timeout", 5) * 1000), jSONObject3.optString("priority"), 0, new C12954a(currentTimeMillis));
                        }
                    } else {
                        AppBrandLogger.m52830i("PreHelper", "Not  pre Location, appId: " + str + "not in " + jSONObject);
                    }
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }
}
