package com.huawei.updatesdk.p1029a.p1039b.p1044d;

import com.huawei.updatesdk.p1029a.p1039b.p1044d.p1045c.C23869d;
import com.huawei.updatesdk.service.appmgr.bean.C23907a;
import com.huawei.updatesdk.service.appmgr.bean.C23909b;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.huawei.updatesdk.a.b.d.a */
public class C23863a {

    /* renamed from: a */
    private static Map<String, Class> f59092a;

    static {
        HashMap hashMap = new HashMap();
        f59092a = hashMap;
        hashMap.put(C23907a.APIMETHOD, C23909b.class);
    }

    /* renamed from: a */
    public static C23869d m87249a(String str) throws InstantiationException, IllegalAccessException {
        Class cls = f59092a.get(str);
        if (cls != null) {
            return (C23869d) cls.newInstance();
        }
        throw new InstantiationException("ResponseBean class not found, method:" + str);
    }
}
