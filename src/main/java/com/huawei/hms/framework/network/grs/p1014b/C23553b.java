package com.huawei.hms.framework.network.grs.p1014b;

import android.content.Context;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.huawei.hms.framework.network.grs.local.model.C23590a;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.huawei.hms.framework.network.grs.b.b */
public class C23553b {

    /* renamed from: a */
    private static Map<String, C23553b> f58056a = new ConcurrentHashMap(16);

    /* renamed from: b */
    private AbstractC23552a f58057b;

    public C23553b(Context context, GrsBaseInfo grsBaseInfo) {
        mo82869a(context);
        Map<String, C23553b> map = f58056a;
        map.put(context.getPackageName() + grsBaseInfo.uniqueCode(), this);
    }

    /* renamed from: a */
    public static C23553b m85431a(String str, GrsBaseInfo grsBaseInfo) {
        Map<String, C23553b> map = f58056a;
        return map.get(str + grsBaseInfo.uniqueCode());
    }

    /* renamed from: a */
    public C23590a mo82866a() {
        return this.f58057b.mo82855a();
    }

    /* renamed from: a */
    public String mo82867a(GrsBaseInfo grsBaseInfo, String str, String str2) {
        return this.f58057b.mo82856a(grsBaseInfo, str, str2);
    }

    /* renamed from: a */
    public Map<String, String> mo82868a(GrsBaseInfo grsBaseInfo, String str) {
        return this.f58057b.mo82858a(grsBaseInfo, str);
    }

    /* renamed from: a */
    public void mo82869a(Context context) {
        C23555d dVar = new C23555d(context);
        this.f58057b = dVar;
        if (!dVar.mo82862b()) {
            this.f58057b = new C23554c(context);
        }
    }

    /* renamed from: a */
    public void mo82870a(GrsBaseInfo grsBaseInfo) {
        this.f58057b.mo82860a(grsBaseInfo);
    }
}
