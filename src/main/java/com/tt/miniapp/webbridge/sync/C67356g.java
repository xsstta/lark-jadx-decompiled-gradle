package com.tt.miniapp.webbridge.sync;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.utils.CharacterUtils;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.larksuite.suite.R;
import com.tt.miniapp.AppConfig;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.RenderViewManager;
import com.tt.miniapp.event.C66020b;
import com.tt.miniapp.webbridge.AbstractC67320f;
import com.tt.miniapphost.AbstractC67550j;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.C67432a;
import com.tt.miniapphost.MiniappHostBase;
import com.tt.miniapphost.entity.AppInfoEntity;
import com.tt.miniapphost.host.HostDependManager;
import com.tt.miniapphost.util.C67590h;
import com.tt.option.p3397r.C67673c;
import com.tt.refer.common.annotation.ApiHandler;
import org.json.JSONException;
import org.json.JSONObject;

@ApiHandler(eventName = "launchApp")
/* renamed from: com.tt.miniapp.webbridge.sync.g */
public class C67356g extends AbstractC67320f {
    @Override // com.tt.option.ext.AbstractC67628l
    public String getApiName() {
        return "launchApp";
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.tt.miniapp.webbridge.sync.g$a */
    public enum EnumC67360a {
        INVALID_SCENE("invalid scene"),
        HAVE_NO_PERMISSION("have no permission"),
        APP_JSON_CONFIG_ERROR("app json config error"),
        NEED_UPDATE("need update"),
        LAUNCH_ERROR("launch error");
        
        private String desc;

        public String getDesc() {
            return this.desc;
        }

        private EnumC67360a(String str) {
            this.desc = str;
        }
    }

    @Override // com.tt.option.ext.AbstractC67628l
    public String act() {
        final Activity currentActivity = this.iAppContext.getCurrentActivity();
        if (currentActivity == null) {
            AppBrandLogger.m52830i("LaunchApp", "LaunchAppHandler failed by activity is null");
            return makeFailMsg("activity is null");
        }
        final AppInfoEntity appInfo = C67432a.m262319a(this.iAppContext).getAppInfo();
        if (appInfo == null) {
            AppBrandLogger.m52830i("LaunchApp", "LaunchAppHandler  failed by app info is null");
            return makeFailMsg("app info is null");
        }
        final AppConfig appConfig = AppbrandApplicationImpl.getInst(this.iAppContext).getAppConfig();
        if (appConfig == null) {
            AppBrandLogger.m52830i("LaunchApp", "LaunchAppHandler  failed by appconfig is null");
            return makeFailMsg("appconfig is null");
        }
        final JSONObject jSONObject = new JSONObject();
        try {
            if (!appInfo.isCanLaunchApp()) {
                mo234031a(jSONObject, EnumC67360a.HAVE_NO_PERMISSION.getDesc());
            } else {
                if (!TextUtils.isEmpty(appConfig.mo230045f().f165529a)) {
                    if (!TextUtils.isEmpty(appConfig.mo230045f().f165530b)) {
                        if (!C67673c.m263285a(this.iAppContext).mo234939a()) {
                            mo234031a(jSONObject, EnumC67360a.INVALID_SCENE.getDesc());
                        }
                    }
                }
                mo234031a(jSONObject, EnumC67360a.APP_JSON_CONFIG_ERROR.getDesc());
            }
            if (AppbrandApplicationImpl.getInst(this.iAppContext).getRenderViewManager() == null || TextUtils.isEmpty(jSONObject.optString(com.tt.frontendapiinterface.ApiHandler.API_CALLBACK_ERRMSG))) {
                C66020b.m258531a("micro_app_call_app_button_click", appInfo, this.iAppContext).mo231092a();
                AppbrandContext.getMainHandler().post(new Runnable() {
                    /* class com.tt.miniapp.webbridge.sync.C67356g.RunnableC673571 */

                    public void run() {
                        HostDependManager.getInst().showModal(currentActivity, null, "", String.format(C67590h.m263073a((int) R.string.microapp_m_launch_to_app), appConfig.mo230045f().f165529a), true, C67590h.m263073a((int) R.string.microapp_m_map_dialog_cancel), "", C67590h.m263073a((int) R.string.microapp_m_brand_permission_ok), "", new AbstractC67550j.AbstractC67551a<Integer>() {
                            /* class com.tt.miniapp.webbridge.sync.C67356g.RunnableC673571.C673581 */

                            /* renamed from: a */
                            public void onNativeModuleCall(Integer num) {
                                boolean z;
                                try {
                                    if (num.intValue() == 0) {
                                        C66020b.m258531a("micro_app_call_app_pop_up", appInfo, C67356g.this.iAppContext).mo231090a("select_option", "no").mo231092a();
                                        JSONObject jSONObject = new JSONObject();
                                        C67356g.this.mo234031a(jSONObject, EnumC67360a.LAUNCH_ERROR.getDesc());
                                        if (AppbrandApplicationImpl.getInst(C67356g.this.iAppContext).getRenderViewManager() != null) {
                                            AppbrandApplicationImpl.getInst(C67356g.this.iAppContext).getRenderViewManager().invokeHandler(C67356g.this.mRender.getRenderViewId(), C67356g.this.mCallBackId, jSONObject.toString());
                                            return;
                                        }
                                        return;
                                    }
                                    C66020b.m258531a("micro_app_call_app_pop_up", appInfo, C67356g.this.iAppContext).mo231090a("select_option", "yes").mo231092a();
                                    final JSONObject jSONObject2 = new JSONObject();
                                    String a = C67356g.this.mo234029a(new JSONObject(C67356g.this.mArgs).optString("appParameter"), appInfo.appId);
                                    if (!C67673c.m263285a(C67356g.this.iAppContext).mo234939a() || !appInfo.isCanLaunchApp()) {
                                        z = false;
                                    } else {
                                        z = C67356g.m262228a(a, appConfig.mo230045f().f165530b, C67356g.this.iAppContext);
                                    }
                                    boolean a2 = C67356g.this.mo234032a(currentActivity, appConfig.mo230045f().f165530b);
                                    if (a2) {
                                        C67356g.this.mo234031a(jSONObject2, EnumC67360a.NEED_UPDATE.getDesc());
                                    } else {
                                        C67356g.this.mo234031a(jSONObject2, EnumC67360a.LAUNCH_ERROR.getDesc());
                                    }
                                    if (!z || !a2) {
                                        C67356g.this.mo234030a(appInfo, jSONObject2);
                                    } else {
                                        AppbrandContext.getMainHandler().postDelayed(new Runnable() {
                                            /* class com.tt.miniapp.webbridge.sync.C67356g.RunnableC673571.C673581.RunnableC673591 */

                                            public void run() {
                                                if (((MiniappHostBase) C67356g.this.iAppContext.getCurrentActivity()).isOnActivityStackTop()) {
                                                    C67356g.this.mo234030a(appInfo, jSONObject2);
                                                }
                                            }
                                        }, 1000);
                                    }
                                } catch (Exception e) {
                                    AppBrandLogger.m52829e("LaunchApp", "onNativeModuleCall exception " + e);
                                    try {
                                        C67356g.this.mo234031a(jSONObject, EnumC67360a.LAUNCH_ERROR.getDesc());
                                        C67356g.this.mo234030a(appInfo, jSONObject);
                                    } catch (JSONException e2) {
                                        AppBrandLogger.m52829e("LaunchApp", e2);
                                    }
                                }
                            }
                        }, C67356g.this.iAppContext.getCurrentActivity());
                    }
                });
                return CharacterUtils.empty();
            }
            AppbrandApplicationImpl.getInst(this.iAppContext).getRenderViewManager().invokeHandler(this.mRender.getRenderViewId(), this.mCallBackId, jSONObject.toString());
            AppBrandLogger.m52830i("LaunchApp", "call button click failed by " + jSONObject.toString());
            C66020b.m258531a("micro_app_call_app_button_click", appInfo, this.iAppContext).mo231090a("error_msg", jSONObject.optString(com.tt.frontendapiinterface.ApiHandler.API_CALLBACK_ERRMSG)).mo231092a();
            return CharacterUtils.empty();
        } catch (Exception e) {
            AppBrandLogger.m52829e("LaunchApp", e);
            return makeFailMsg(e);
        }
    }

    /* renamed from: a */
    public String mo234029a(String str, String str2) {
        String encodeToString = Base64.encodeToString(str.getBytes(), 8);
        return str2 + "://bytedance.com/bdp/launchApp?app-parameter-base64=" + encodeToString;
    }

    /* renamed from: a */
    public void mo234030a(AppInfoEntity appInfoEntity, JSONObject jSONObject) {
        String str;
        C66020b.m258531a("micro_app_call_app_failed", appInfoEntity, this.iAppContext).mo231090a("error_msg", jSONObject.optString(com.tt.frontendapiinterface.ApiHandler.API_CALLBACK_ERRMSG)).mo231092a();
        Object[] objArr = new Object[1];
        StringBuilder sb = new StringBuilder();
        sb.append("call app failed by ");
        if (jSONObject == null) {
            str = "";
        } else {
            str = jSONObject.toString();
        }
        sb.append(str);
        objArr[0] = sb.toString();
        AppBrandLogger.m52830i("LaunchApp", objArr);
        if (AppbrandApplicationImpl.getInst(this.iAppContext).getRenderViewManager() != null) {
            AppbrandApplicationImpl.getInst(this.iAppContext).getRenderViewManager().invokeHandler(this.mRender.getRenderViewId(), this.mCallBackId, jSONObject.toString());
        }
    }

    /* renamed from: a */
    public void mo234031a(JSONObject jSONObject, String str) throws JSONException {
        jSONObject.put(com.tt.frontendapiinterface.ApiHandler.API_CALLBACK_ERRMSG, buildErrorMsg("launchApp", "fail " + str));
    }

    /* renamed from: a */
    public boolean mo234032a(Context context, String str) {
        PackageInfo packageInfo;
        try {
            packageInfo = context.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e) {
            AppBrandLogger.m52829e("LaunchApp", e);
            packageInfo = null;
        }
        if (packageInfo != null) {
            return true;
        }
        return false;
    }

    public C67356g(RenderViewManager.IRender iRender, String str, int i) {
        super(iRender, str, i);
    }

    /* renamed from: a */
    public static boolean m262228a(String str, String str2, IAppContext iAppContext) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            intent.setFlags(268435456);
            intent.setPackage(str2);
            Activity currentActivity = iAppContext.getCurrentActivity();
            if (currentActivity != null) {
                currentActivity.startActivity(intent);
            }
            return true;
        } catch (Exception e) {
            AppBrandLogger.m52829e("LaunchApp", e);
            return false;
        }
    }
}
