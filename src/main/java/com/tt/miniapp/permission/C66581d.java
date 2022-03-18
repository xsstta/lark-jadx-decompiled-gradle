package com.tt.miniapp.permission;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.lark.infra.storage.p640c.C12899a;
import com.huawei.hms.android.HwBuildEx;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.p3335u.C66998c;
import com.tt.miniapp.permission.C66578b;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.entity.AppInfoEntity;
import com.tt.miniapphost.host.HostDependManager;
import com.tt.refer.impl.business.p3434e.AbstractC67906a;
import com.tt.refer.p3400a.p3401a.AbstractC67709b;
import com.tt.refer.p3400a.p3408f.AbstractC67724a;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.tt.miniapp.permission.d */
public class C66581d extends AbstractC67906a {
    @Override // com.tt.refer.p3400a.p3412i.AbstractC67733a
    /* renamed from: a */
    public String mo50175a(int i) {
        switch (i) {
            case 11:
                return "user_info";
            case HwBuildEx.VersionCodes.EMUI_5_1:
                return "location";
            case 13:
                return "record";
            case 14:
                return "camera";
            case 15:
                return "address";
            case 16:
                return "phone_num";
            case 17:
                return "photo";
            case 18:
            default:
                return null;
            case 19:
                return "clipboard";
            case 20:
                return "appbadge";
            case 21:
                return "runData";
        }
    }

    @Override // com.tt.refer.p3400a.p3412i.AbstractC67733a
    /* renamed from: a */
    public boolean mo50182a(String str, int i) {
        SharedPreferences a = m260136a(this.f171032b.getApplicationContext(), str);
        return a.contains("permission" + i);
    }

    @Override // com.tt.refer.p3400a.p3412i.AbstractC67733a
    /* renamed from: a */
    public boolean mo50181a(C66578b.C66579a aVar) {
        AppInfoEntity appInfo = AppbrandApplicationImpl.getInst(this.f171032b).getAppInfo();
        if (appInfo == null) {
            return false;
        }
        if ((aVar.f168119a & appInfo.authPass) > 0) {
            return true;
        }
        return false;
    }

    @Override // com.tt.refer.p3400a.p3412i.AbstractC67733a
    /* renamed from: a */
    public boolean mo50180a(Context context, String str, int i) {
        SharedPreferences a = m260136a(context, str);
        return a.contains("permission" + i);
    }

    /* renamed from: a */
    public static String m260138a() {
        return HostDependManager.getInst().getSpPrefixPath() + "permission_";
    }

    public C66581d(IAppContext iAppContext) {
        super(iAppContext);
    }

    /* renamed from: a */
    public static SharedPreferences m260137a(IAppContext iAppContext) {
        return m260136a(AppbrandContext.getInst().getApplicationContext(), iAppContext.getAppId());
    }

    /* renamed from: b */
    public static String m260139b(String str) {
        return m260138a() + str;
    }

    @Override // com.tt.refer.p3400a.p3412i.AbstractC67733a
    /* renamed from: b */
    public boolean mo50184b(int i) {
        SharedPreferences a = m260137a(this.f171032b);
        return a.contains("permission" + i);
    }

    @Override // com.tt.refer.p3400a.p3412i.AbstractC67733a
    /* renamed from: a */
    public List<C66578b.C66579a> mo50176a(String str) {
        return ((AbstractC67724a) this.f171032b.findServiceByInterface(AbstractC67724a.class)).mo50460d(str);
    }

    @Override // com.tt.refer.p3400a.p3412i.AbstractC67733a
    /* renamed from: a */
    public void mo50178a(LinkedHashMap<Integer, String> linkedHashMap) {
        SharedPreferences.Editor edit = m260137a(this.f171032b).edit();
        for (Map.Entry<Integer, String> entry : linkedHashMap.entrySet()) {
            boolean contentEquals = entry.getValue().contentEquals("ok");
            int intValue = entry.getKey().intValue();
            edit.putBoolean("permission" + intValue, contentEquals);
            HostDependManager.getInst().setPermissionTime(intValue, this.f171032b);
        }
        edit.apply();
    }

    /* renamed from: a */
    public static SharedPreferences m260136a(Context context, String str) {
        return C12899a.m53203a(context, m260139b(str));
    }

    @Override // com.tt.refer.p3400a.p3412i.AbstractC67733a
    /* renamed from: b */
    public void mo50183b(int i, boolean z) {
        SharedPreferences.Editor edit = m260137a(this.f171032b).edit();
        edit.putBoolean("permission" + i, z).apply();
        HostDependManager.getInst().setPermissionTime(i, this.f171032b);
        C66998c.m261128a(this.f171032b).mo233044a(i, z);
    }

    @Override // com.tt.refer.p3400a.p3412i.AbstractC67733a
    /* renamed from: b */
    public boolean mo50185b(String str, int i) {
        SharedPreferences a = m260136a(this.f171032b.getApplicationContext(), str);
        return a.getBoolean("permission" + i, false);
    }

    @Override // com.tt.refer.p3400a.p3412i.AbstractC67733a
    /* renamed from: a */
    public boolean mo50179a(int i, boolean z) {
        if (mo50184b(i) || !mo50181a(C66578b.C66579a.m260115c(i, this.f171032b))) {
            SharedPreferences a = m260137a(this.f171032b);
            return a.getBoolean("permission" + i, z);
        }
        mo50183b(i, true);
        return true;
    }

    @Override // com.tt.refer.p3400a.p3412i.AbstractC67733a, com.tt.refer.impl.business.p3434e.AbstractC67906a
    /* renamed from: a */
    public boolean mo232184a(Activity activity, final String str, final Set<String> set, final AbstractC67709b.AbstractC67711b bVar) {
        C66588h.m260183a().mo232189a(activity, set, new AbstractC66590i() {
            /* class com.tt.miniapp.permission.C66581d.C665821 */

            @Override // com.tt.miniapp.permission.AbstractC66590i
            /* renamed from: a */
            public void mo48890a() {
                AppBrandLogger.m52830i("GadgetPermissionService", "api:" + str + " requestSystemPermission" + set + " onGranted");
                bVar.mo87574a();
            }

            @Override // com.tt.miniapp.permission.AbstractC66590i
            /* renamed from: a */
            public void mo48891a(String str) {
                AppBrandLogger.m52830i("GadgetPermissionService", "api:" + str + " requestSystemPermission" + str + " onDenied");
                bVar.mo87575a(str);
            }
        });
        return true;
    }
}
