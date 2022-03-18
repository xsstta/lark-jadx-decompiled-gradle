package com.tt.miniapp.event.lark;

import android.os.Bundle;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.larkbrand.utils.C13360l;
import com.ss.android.lark.opmonitor.service.OPMonitor;
import com.tt.miniapphost.host.HostDependManager;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.tt.miniapp.event.lark.a */
public class C66038a {
    /* renamed from: a */
    public static Map<String, Object> m258621a(IAppContext iAppContext) {
        Bundle bundle = (Bundle) iAppContext.getExtra("startParams");
        String string = bundle.getString("host");
        String string2 = bundle.getString("block_id");
        String tenantId = HostDependManager.getInst().getTenantId();
        String userId = HostDependManager.getInst().getUserId();
        HashMap hashMap = new HashMap();
        hashMap.put("app_id", iAppContext.getAppId());
        hashMap.put("tenant_id", C13360l.m54356a(tenantId));
        hashMap.put("block_type_id", iAppContext.getAppIdentify());
        hashMap.put("user_id", C13360l.m54356a(userId));
        hashMap.put("container_type", string);
        hashMap.put("block_id", string2);
        hashMap.put("is_login", "true");
        hashMap.put("os_name", "android");
        hashMap.put("platform", "lark");
        hashMap.put("blockit_version", (String) iAppContext.getExtra("basic_lib_version"));
        hashMap.put("app_version", (String) iAppContext.getExtra("larkAppVersion"));
        hashMap.put("container_id", C13360l.m54356a((String) iAppContext.getExtra("containerID")));
        return hashMap;
    }

    /* renamed from: a */
    public static OPMonitor m258620a(String str, IAppContext iAppContext) {
        return new OPMonitor(str).reportPlatform(4).addMap(m258621a(iAppContext));
    }
}
