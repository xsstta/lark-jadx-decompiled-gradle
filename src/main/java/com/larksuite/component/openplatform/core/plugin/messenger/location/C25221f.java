package com.larksuite.component.openplatform.core.plugin.messenger.location;

import android.app.Activity;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.larkbrand.LarkHostDependManager;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.littleapp.EnvInfo;
import com.tt.frontendapiinterface.ApiCallResultHelper;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.miniapp.errorcode.ApiCode;
import com.tt.miniapp.permission.C66578b;
import com.tt.miniapphost.host.HostDependManager;
import com.tt.miniapphost.p3373f.AbstractC67540b;
import com.tt.option.ext.AbstractC67619e;
import com.tt.refer.p3400a.p3401a.AbstractC67709b;
import com.tt.refer.p3400a.p3412i.AbstractC67733a;
import java.util.HashSet;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.larksuite.component.openplatform.core.plugin.messenger.location.f */
public class C25221f extends ApiHandler {

    /* renamed from: g */
    private static long f61582g;

    /* renamed from: a */
    public String f61583a;

    /* renamed from: b */
    public String f61584b;

    /* renamed from: c */
    public double f61585c;

    /* renamed from: d */
    public double f61586d;

    /* renamed from: e */
    public int f61587e;

    /* renamed from: f */
    public String f61588f;

    @Override // com.tt.frontendapiinterface.ApiHandler
    public String getActionName() {
        return "openLocation";
    }

    public C25221f() {
    }

    /* renamed from: a */
    public boolean mo88329a() {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - f61582g < 200) {
            return true;
        }
        f61582g = currentTimeMillis;
        return false;
    }

    @Override // com.tt.frontendapiinterface.ApiHandler
    public void act() {
        if (mo88329a()) {
            callbackFail("invoke openLocation too fast");
            return;
        }
        Activity currentActivity = getAppContext().getCurrentActivity();
        if (currentActivity == null) {
            callbackDefaultMsg(false);
            AppBrandLogger.m52829e("tma_ApiOpenLocationCtrl", "activity is null");
            return;
        }
        try {
            AppBrandLogger.m52830i("tma_ApiOpenLocationCtrl", "open location params:" + this.mArgs);
            JSONObject jSONObject = new JSONObject(this.mArgs);
            this.f61583a = jSONObject.optString("name", "");
            this.f61584b = jSONObject.optString("address", "");
            this.f61585c = jSONObject.optDouble("latitude", 400.0d);
            this.f61586d = jSONObject.optDouble("longitude", 400.0d);
            this.f61587e = jSONObject.optInt("scale", 18);
            this.f61588f = jSONObject.optString(ShareHitPoint.f121869d, "gcj02");
            double d = this.f61585c;
            if (d < -90.0d || d > 90.0d) {
                callbackFail(ApiCode.OPENLOCATION_INVALID_LATITUDE);
                AppBrandLogger.m52829e("tma_ApiOpenLocationCtrl", "invalid latitude");
                return;
            }
            double d2 = this.f61586d;
            if (d2 < -180.0d || d2 > 180.0d) {
                callbackFail(ApiCode.OPENLOCATION_INVALID_LONGITUDE);
                AppBrandLogger.m52829e("tma_ApiOpenLocationCtrl", "invalid longitude");
                return;
            }
            int i = this.f61587e;
            if (i < 5 || i > 18) {
                callbackFail(ApiCode.OPENLOCATION_INVALID_SCALE);
                AppBrandLogger.m52829e("tma_ApiOpenLocationCtrl", "invalid scale");
                return;
            }
            EnvInfo a = LarkHostDependManager.f34682b.mo49086a().mo48917a();
            if (a != null && a.mo148730a() && this.f61583a.isEmpty() && this.f61584b.isEmpty()) {
                callbackFail(ApiCode.GENERAL_PARAM, "name and address cannot both be empty");
                AppBrandLogger.m52829e("tma_ApiOpenLocationCtrl", "name and address cannot both be empty");
            } else if (HostDependManager.getInst().createMapInstance() == null) {
                callbackAppUnSupportFeature();
                AppBrandLogger.m52829e("tma_ApiOpenLocationCtrl", "feature is not supported in app");
            } else {
                m90638a(currentActivity);
            }
        } catch (JSONException e) {
            AppBrandLogger.m52829e("tma_ApiOpenLocationCtrl", e);
            callbackFail(ApiCode.GENERAL_JSON_ERROR, ApiCallResultHelper.generateIllegalArgExtraInfo(this.mArgs));
        }
    }

    /* renamed from: a */
    private void m90638a(final Activity activity) {
        ((AbstractC67733a) getAppContext().findServiceByInterface(AbstractC67733a.class)).mo235103a(activity, getActionName(), C66578b.C66579a.m260113b(getAppContext()), new AbstractC67540b() {
            /* class com.larksuite.component.openplatform.core.plugin.messenger.location.C25221f.C252221 */

            @Override // com.tt.miniapphost.p3373f.AbstractC67540b
            /* renamed from: a */
            public void mo87199a() {
                AppBrandLogger.m52830i("tma_ApiOpenLocationCtrl", "app permission onGranted");
                HashSet hashSet = new HashSet();
                hashSet.add("android.permission.ACCESS_COARSE_LOCATION");
                hashSet.add("android.permission.ACCESS_FINE_LOCATION");
                C25221f.this.getApiDependency().mo235022a(activity, C25221f.this.getActionName(), hashSet, new AbstractC67709b.AbstractC67711b() {
                    /* class com.larksuite.component.openplatform.core.plugin.messenger.location.C25221f.C252221.C252231 */

                    @Override // com.tt.refer.p3400a.p3401a.AbstractC67709b.AbstractC67711b
                    /* renamed from: a */
                    public void mo87574a() {
                        try {
                            AppBrandLogger.m52830i("tma_ApiOpenLocationCtrl", "system permission onGranted");
                            C25221f.this.callbackDefaultMsg(true);
                            HostDependManager.getInst().openLocation(activity, C25221f.this.f61583a, C25221f.this.f61584b, C25221f.this.f61585c, C25221f.this.f61586d, C25221f.this.f61587e, C25221f.this.f61588f, C25221f.this.mArgs);
                        } catch (Exception e) {
                            AppBrandLogger.m52829e("tma_ApiOpenLocationCtrl", "", e);
                            C25221f.this.callbackFail(ApiCode.GENERAL_UNKONW_ERROR, e.getMessage());
                        }
                    }

                    @Override // com.tt.refer.p3400a.p3401a.AbstractC67709b.AbstractC67711b
                    /* renamed from: a */
                    public void mo87575a(String str) {
                        AppBrandLogger.m52829e("tma_ApiOpenLocationCtrl", "system permission onDenied ", str);
                        C25221f.this.callbackFail(ApiCode.GENERAL_SYSTEM_AUTH_DENY);
                    }
                });
            }

            @Override // com.tt.miniapphost.p3373f.AbstractC67540b
            /* renamed from: a */
            public void mo87200a(String str) {
                AppBrandLogger.m52829e("tma_ApiOpenLocationCtrl", "app permission onDenied ", str);
                C25221f.this.callbackFail(ApiCode.GENERAL_USER_AUTH_DENIED);
            }
        });
    }

    public C25221f(String str, int i, AbstractC67619e eVar) {
        super(str, i, eVar);
    }
}
