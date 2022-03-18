package com.bytedance.ee.larkbrand.permission;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.larkbrand.permission.p662a.C13282a;
import com.bytedance.ee.larkbrand.utils.C13374s;
import com.ss.android.lark.littleapp.entity.LittleAppPermissionData;
import com.tt.miniapp.permission.C66578b;
import com.tt.miniapp.permission.C66581d;
import com.tt.miniapphost.C67432a;
import com.tt.refer.p3400a.p3412i.AbstractC67733a;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.ee.larkbrand.permission.d */
public class C13286d implements AbstractC13281a {

    /* renamed from: a */
    private Map<IAppContext, SharedPreferences$OnSharedPreferenceChangeListenerC13287a> f35186a = new HashMap();

    /* renamed from: com.bytedance.ee.larkbrand.permission.d$a */
    private static class SharedPreferences$OnSharedPreferenceChangeListenerC13287a implements SharedPreferences.OnSharedPreferenceChangeListener {

        /* renamed from: a */
        private IAppContext f35187a;

        public SharedPreferences$OnSharedPreferenceChangeListenerC13287a(IAppContext iAppContext) {
            this.f35187a = iAppContext;
        }

        public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
            AppBrandLogger.m52830i("PermissionChangeAction", "Preference change for key: " + str);
            if (C66578b.m260108c(str)) {
                int parseInt = Integer.parseInt(str.substring(10));
                boolean a = ((AbstractC67733a) this.f35187a.findServiceByInterface(AbstractC67733a.class)).mo50179a(parseInt, false);
                String str2 = "";
                for (C66578b.C66579a aVar : C13282a.m54094a(C67432a.m262319a(this.f35187a).getAppInfo().appId, this.f35187a)) {
                    if (aVar.mo232177a() == parseInt) {
                        str2 = aVar.mo232178b();
                    }
                }
                if (TextUtils.isEmpty(str2)) {
                    AppBrandLogger.m52830i("PermissionChangeAction", "permission list not contains permission " + parseInt);
                    return;
                }
                C13374s.m54392a(C67432a.m262319a(this.f35187a).getAppInfo().appId, JSON.toJSONString(new LittleAppPermissionData(parseInt, str2, a)), this.f35187a.getAppType());
            }
        }
    }

    @Override // com.bytedance.ee.larkbrand.permission.AbstractC13281a
    /* renamed from: c */
    public boolean mo49520c(IAppContext iAppContext) {
        return this.f35186a.containsKey(iAppContext);
    }

    @Override // com.bytedance.ee.larkbrand.permission.AbstractC13281a
    /* renamed from: b */
    public void mo49519b(IAppContext iAppContext) {
        AppBrandLogger.m52830i("PermissionChangeAction", "Unregister preference change for appId: " + C67432a.m262319a(iAppContext).getAppInfo().appId);
        if (this.f35186a.containsKey(iAppContext)) {
            C66581d.m260137a(iAppContext).unregisterOnSharedPreferenceChangeListener(this.f35186a.remove(iAppContext));
        }
    }

    @Override // com.bytedance.ee.larkbrand.permission.AbstractC13281a
    /* renamed from: a */
    public void mo49518a(IAppContext iAppContext) {
        SharedPreferences$OnSharedPreferenceChangeListenerC13287a aVar;
        if (!this.f35186a.containsKey(iAppContext)) {
            aVar = new SharedPreferences$OnSharedPreferenceChangeListenerC13287a(iAppContext);
            this.f35186a.put(iAppContext, aVar);
        } else {
            aVar = this.f35186a.get(iAppContext);
        }
        AppBrandLogger.m52830i("PermissionChangeAction", "Register preference change for pid: " + C67432a.m262319a(iAppContext).getAppInfo().appId);
        C66581d.m260137a(iAppContext).registerOnSharedPreferenceChangeListener(aVar);
    }
}
