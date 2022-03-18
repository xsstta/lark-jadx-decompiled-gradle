package com.huawei.hms.framework.network.grs;

import android.content.Context;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.huawei.hms.framework.network.grs.e */
public class C23588e {

    /* renamed from: a */
    private static Map<String, C23576d> f58162a = new ConcurrentHashMap(16);

    /* renamed from: b */
    private static final Object f58163b = new Object();

    /* renamed from: a */
    public static C23576d m85568a(GrsBaseInfo grsBaseInfo, Context context) {
        synchronized (f58163b) {
            int uniqueCode = grsBaseInfo.uniqueCode();
            Map<String, C23576d> map = f58162a;
            C23576d dVar = map.get(context.getPackageName() + uniqueCode);
            if (dVar == null) {
                C23576d dVar2 = new C23576d(context, grsBaseInfo);
                Map<String, C23576d> map2 = f58162a;
                map2.put(context.getPackageName() + uniqueCode, dVar2);
                return dVar2;
            } else if (dVar.mo82924a((Object) new C23576d(grsBaseInfo))) {
                return dVar;
            } else {
                C23576d dVar3 = new C23576d(context, grsBaseInfo);
                Map<String, C23576d> map3 = f58162a;
                map3.put(context.getPackageName() + uniqueCode, dVar3);
                return dVar3;
            }
        }
    }
}
