package com.tt.miniapp.p3301m;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.lark.infra.storage.p640c.C12899a;
import com.bytedance.ee.larkbrand.permission.AbstractC13298i;
import com.huawei.hms.android.HwBuildEx;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.larksuite.component.openplatform.core.plugin.settings.C25478a;
import com.tt.miniapp.AppbrandConstant;
import com.tt.miniapp.manager.C66467o;
import com.tt.miniapp.net.C66517e;
import com.tt.miniapp.permission.C66578b;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.C67432a;
import com.tt.miniapphost.process.C67556a;
import com.tt.miniapphost.process.data.CrossProcessDataEntity;
import com.tt.option.p3394o.AbstractC67662b;
import com.tt.option.p3394o.C67663c;
import com.tt.refer.p3400a.p3412i.AbstractC67733a;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.tt.miniapp.m.f */
public class C66335f implements AbstractC67662b {

    /* renamed from: a */
    public static int f167410a;

    @Override // com.tt.option.p3394o.AbstractC67662b
    public Set<C66578b.C66579a> filterNeedRequestPermission(String str, Set<C66578b.C66579a> set, IAppContext iAppContext) {
        return set;
    }

    @Override // com.tt.option.p3394o.AbstractC67662b
    public void metaExtraNotify(String str, String str2, IAppContext iAppContext) {
    }

    @Override // com.tt.option.p3394o.AbstractC67662b
    public void onDeniedWhenHasRequested(Activity activity, String str, IAppContext iAppContext) {
    }

    @Override // com.tt.option.p3394o.AbstractC67662b
    public void setPermissionTime(int i, IAppContext iAppContext) {
    }

    @Override // com.tt.option.p3394o.AbstractC67662b
    public void syncAuth(String str, IAppContext iAppContext, AbstractC13298i iVar) {
    }

    @Override // com.tt.option.p3394o.AbstractC67662b
    public void syncPermissionToService(IAppContext iAppContext) {
    }

    @Override // com.tt.option.p3394o.AbstractC67662b
    public void syncPermissionToService(IAppContext iAppContext, String str) {
    }

    @Override // com.tt.option.p3394o.AbstractC67662b
    public void syncPermissionToService(IAppContext iAppContext, String str, AbstractC13298i iVar) {
    }

    /* renamed from: a */
    public static void m259463a() {
        m259462a(AppbrandContext.getInst().getApplicationContext(), "HostOptionPermissionDependImpl").edit().clear().commit();
    }

    @Override // com.tt.option.p3394o.AbstractC67662b
    public List<C66578b.C66579a> getUserDefinableHostPermissionList(IAppContext iAppContext) {
        return C66578b.C66579a.m260127l(iAppContext);
    }

    @Override // com.tt.option.p3394o.AbstractC67662b
    public C67663c getPermissionCustomDialogMsgEntity(IAppContext iAppContext) {
        return new C67663c.C67665a().mo234927a(iAppContext);
    }

    /* renamed from: b */
    public static boolean m259466b(IAppContext iAppContext) {
        SharedPreferences a = m259462a(AppbrandContext.getInst().getApplicationContext(), "HostOptionPermissionDependImpl");
        return a.getBoolean(C67432a.m262319a(iAppContext).getAppInfo().appId + "UserInfoGrantState", false);
    }

    /* renamed from: a */
    public static boolean m259465a(IAppContext iAppContext) {
        SharedPreferences a = m259462a(AppbrandContext.getInst().getApplicationContext(), "HostOptionPermissionDependImpl");
        return a.contains(C67432a.m262319a(iAppContext).getAppInfo().appId + "UserInfoGrantState");
    }

    @Override // com.tt.option.p3394o.AbstractC67662b
    public void getLocalScope(JSONObject jSONObject, IAppContext iAppContext) throws JSONException {
        C25478a.m91031a(jSONObject, iAppContext);
    }

    /* renamed from: a */
    private static SharedPreferences m259462a(Context context, String str) {
        return C12899a.m53203a(context, str);
    }

    @Override // com.tt.option.p3394o.AbstractC67662b
    public C66578b.C66579a permissionTypeToPermission(int i, IAppContext iAppContext) {
        return C66578b.C66579a.m260115c(i, iAppContext);
    }

    @Override // com.tt.option.p3394o.AbstractC67662b
    public C66578b.C66579a scopeToBrandPermission(String str, IAppContext iAppContext) {
        return C66578b.C66579a.m260110a(str, iAppContext);
    }

    @Override // com.tt.option.p3394o.AbstractC67662b
    public boolean shouldFilterPermission(int i, IAppContext iAppContext) {
        return ((AbstractC67733a) iAppContext.findServiceByInterface(AbstractC67733a.class)).mo50184b(i);
    }

    /* renamed from: a */
    public static void m259464a(Boolean bool, IAppContext iAppContext) {
        SharedPreferences.Editor edit = m259462a(AppbrandContext.getInst().getApplicationContext(), "HostOptionPermissionDependImpl").edit();
        edit.putBoolean(C67432a.m262319a(iAppContext).getAppInfo().appId + "UserInfoGrantState", bool.booleanValue()).commit();
    }

    @Override // com.tt.option.p3394o.AbstractC67662b
    public void savePermissionGrant(int i, boolean z, IAppContext iAppContext) {
        CrossProcessDataEntity f;
        if (i == 11 && (f = C67556a.m262949f()) != null) {
            C66467o.C66470b bVar = new C66467o.C66470b(f);
            if (!TextUtils.isEmpty(bVar.f167782h)) {
                mo231825a(bVar.f167782h, i, z, iAppContext);
            }
        }
    }

    @Override // com.tt.option.p3394o.AbstractC67662b
    public void handleCustomizePermissionResult(JSONObject jSONObject, int i, boolean z) throws JSONException {
        switch (i) {
            case 11:
                jSONObject.put("scope.userInfo", z);
                return;
            case HwBuildEx.VersionCodes.EMUI_5_1:
                jSONObject.put("scope.userLocation", z);
                return;
            case 13:
                jSONObject.put("scope.record", z);
                return;
            case 14:
                jSONObject.put("scope.camera", z);
                return;
            case 15:
                jSONObject.put("scope.address", z);
                return;
            case 16:
            default:
                return;
            case 17:
                jSONObject.put("scope.album", z);
                return;
            case 18:
                jSONObject.put("scope.screenRecord", z);
                return;
            case 19:
                jSONObject.put("scope.clipboard", z);
                return;
            case 20:
                jSONObject.put("scope.appBadge", z);
                return;
            case 21:
                jSONObject.put("scope.runData", z);
                return;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo231825a(final String str, final int i, final boolean z, final IAppContext iAppContext) {
        int i2 = 1;
        f167410a++;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("aid", Integer.parseInt(AppbrandContext.getInst().getInitParams().mo234510j()));
            jSONObject.put(HiAnalyticsConstant.HaKey.BI_KEY_APPID, C67432a.m262319a(iAppContext).getAppInfo().appId);
            jSONObject.put("name", "getUserInfo");
            if (!z) {
                i2 = 0;
            }
            jSONObject.put("val", i2);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        C66517e.m259917a().newCall(new Request.Builder().url(new StringBuilder(AppbrandConstant.C65701b.m257612c().mo230143h()).toString()).addHeader("X-Tma-Host-Sessionid", str).post(RequestBody.create(MediaType.parse("application/json"), jSONObject.toString())).build()).enqueue(new Callback() {
            /* class com.tt.miniapp.p3301m.C66335f.C663361 */

            @Override // okhttp3.Callback
            public void onFailure(Call call, IOException iOException) {
                if (C66335f.f167410a < 2) {
                    C66335f.this.mo231825a(str, i, z, iAppContext);
                    return;
                }
                C66335f.f167410a = 0;
                AppBrandLogger.m52829e("HostOptionPermissionDependImpl", "save permission grant fail:" + iOException.getStackTrace());
                C66335f.m259464a(Boolean.valueOf(z), iAppContext);
            }

            @Override // okhttp3.Callback
            public void onResponse(Call call, Response response) throws IOException {
                C66335f.f167410a = 0;
                try {
                    JSONObject jSONObject = new JSONObject(response.body().string());
                    if (jSONObject.optInt("error") == 0) {
                        AppBrandLogger.m52829e("HostOptionPermissionDependImpl", "save permission grant success");
                        C66335f.m259463a();
                        return;
                    }
                    AppBrandLogger.m52829e("HostOptionPermissionDependImpl", "save permission grant fail:" + jSONObject.optString("message", ""));
                    C66335f.m259464a(Boolean.valueOf(z), iAppContext);
                } catch (JSONException e) {
                    AppBrandLogger.m52829e("HostOptionPermissionDependImpl", e);
                }
            }
        });
    }
}
