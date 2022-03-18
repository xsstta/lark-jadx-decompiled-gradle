package com.larksuite.component.openplatform.core.plugin.settings;

import android.app.Activity;
import android.content.Intent;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.AbstractC12888c;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.larksuite.component.openplatform.core.utils.C25529d;
import com.tt.frontendapiinterface.ApiCallResultHelper;
import com.tt.miniapp.errorcode.ApiCode;
import com.tt.miniapp.event.C66036d;
import com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65797c;
import com.tt.miniapp.permission.PermissionSettingActivity;
import com.tt.miniapphost.C67432a;
import com.tt.miniapphost.host.HostDependManager;
import com.tt.refer.common.annotation.ApiSupportType;
import com.tt.refer.common.base.AppType;
import com.tt.refer.p3400a.p3401a.p3402a.C67701b;
import com.tt.refer.p3400a.p3412i.AbstractC67733a;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

@ApiSupportType(apiName = {"openSetting"}, support = {AppType.WebAPP})
/* renamed from: com.larksuite.component.openplatform.core.plugin.settings.d */
public class C25481d extends AbstractC65797c {

    /* renamed from: a */
    private JSONObject f62072a;

    @Override // com.larksuite.framework.apiplugin.AbstractC25937e
    public boolean shouldHandleActivityResult() {
        return true;
    }

    public C25481d() {
    }

    @Override // com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65792a
    /* renamed from: a */
    public List<String> mo87215a() {
        return Collections.singletonList("openSetting");
    }

    /* renamed from: a */
    private void m91035a(boolean z) {
        if (C67432a.m262319a(mo230473f()).getAppInfo().isGame()) {
            C66036d.m258595a(z, mo230473f());
        }
    }

    @Override // com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65797c
    /* renamed from: a */
    public void mo87216a(C67701b bVar) {
        AppBrandLogger.m52830i("ApiHandler", "invoke api");
        this.f62072a = new JSONObject();
        Activity currentActivity = mo230473f().getCurrentActivity();
        if (currentActivity == null) {
            mo230482a(ApiCode.GENERAL_UNKONW_ERROR, ApiCallResultHelper.generateDataNullExtraInfo("activity"));
            return;
        }
        AbstractC12888c i = C25529d.m91168i(mo230473f());
        if (i != null) {
            i.startActivityForResult(PermissionSettingActivity.m260080a(currentActivity, mo230473f()), 6);
        } else {
            currentActivity.startActivityForResult(PermissionSettingActivity.m260080a(currentActivity, mo230473f()), 6);
        }
        try {
            HostDependManager.getInst().getLocalScope(this.f62072a, mo230473f());
        } catch (Exception e) {
            mo230482a(ApiCode.GENERAL_UNKONW_ERROR, e.getMessage());
            AppBrandLogger.m52829e("ApiHandler", e);
        }
    }

    public C25481d(String str, IAppContext iAppContext) {
        super(str, iAppContext);
    }

    @Override // com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65792a, com.larksuite.framework.apiplugin.AbstractC25937e, com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65803f
    public boolean handleActivityResult(int i, int i2, Intent intent) {
        char c = 3;
        AppBrandLogger.m52830i("ApiHandler", "handleActivityResult ", Integer.valueOf(i), " ", Integer.valueOf(i2));
        if (i == 6 && i2 == 51 && intent != null) {
            Map map = (Map) intent.getSerializableExtra("extra_change_permission_map");
            if (map == null || map.size() <= 0) {
                mo230493c("permission map is empty");
            } else {
                for (Map.Entry entry : map.entrySet()) {
                    ((AbstractC67733a) mo230473f().findServiceByInterface(AbstractC67733a.class)).mo50183b(((Integer) entry.getKey()).intValue(), ((Boolean) entry.getValue()).booleanValue());
                    if (this.f62072a != null) {
                        Object[] objArr = new Object[6];
                        objArr[0] = "change permission ";
                        objArr[1] = entry.getKey();
                        objArr[2] = " ";
                        objArr[c] = entry.getValue();
                        objArr[4] = " ";
                        objArr[5] = this.f62072a.toString();
                        AppBrandLogger.m52830i("ApiHandler", objArr);
                        try {
                            HostDependManager.getInst().handleCustomizePermissionResult(this.f62072a, ((Integer) entry.getKey()).intValue(), ((Boolean) entry.getValue()).booleanValue());
                        } catch (Exception e) {
                            AppBrandLogger.m52829e("ApiHandler", e);
                        }
                    }
                    c = 3;
                }
                HostDependManager.getInst().syncPermissionToService(mo230473f());
                try {
                    JSONObject put = new JSONObject().put("authSetting", this.f62072a);
                    AppBrandLogger.m52830i("ApiHandler", "extraDataJO ", put);
                    mo230492b(put);
                } catch (JSONException e2) {
                    AppBrandLogger.m52829e("ApiHandler", e2);
                    mo230481a(ApiCode.GENERAL_JSON_ERROR);
                }
            }
            JSONObject jSONObject = this.f62072a;
            if (jSONObject != null) {
                m91035a(jSONObject.optBoolean("scope.screenRecord", true));
            }
            this.f62072a = null;
            return true;
        }
        if (this.f62072a != null) {
            try {
                JSONObject put2 = new JSONObject().put("authSetting", this.f62072a);
                AppBrandLogger.m52830i("ApiHandler", "extraDataJO ", put2);
                mo230492b(put2);
            } catch (JSONException e3) {
                AppBrandLogger.m52829e("ApiHandler", e3);
                mo230486a(e3);
            }
            if (i == 6) {
                m91035a(this.f62072a.optBoolean("scope.screenRecord", true));
            }
            this.f62072a = null;
        }
        return false;
    }
}
