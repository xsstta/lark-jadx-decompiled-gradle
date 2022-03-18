package com.bytedance.push.p889j;

import android.content.Context;
import com.bytedance.push.p883e.C20409d;
import com.bytedance.push.settings.C20520j;
import com.bytedance.push.settings.LocalFrequencySettings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.push.j.c */
public final class C20463c {

    /* renamed from: a */
    private static Map<Integer, C20409d> f49944a;

    /* renamed from: a */
    public static synchronized Map<Integer, C20409d> m74474a(Context context) {
        synchronized (C20463c.class) {
            m74476b(context);
            Map<Integer, C20409d> map = f49944a;
            if (map == null) {
                return null;
            }
            return Collections.unmodifiableMap(map);
        }
    }

    /* renamed from: b */
    private static void m74476b(Context context) {
        if (f49944a == null) {
            List<C20409d> k = ((LocalFrequencySettings) C20520j.m74724a(context, LocalFrequencySettings.class)).mo69037k();
            if (k == null) {
                f49944a = new HashMap();
                return;
            }
            HashMap hashMap = new HashMap();
            for (C20409d dVar : k) {
                if (dVar != null) {
                    hashMap.put(Integer.valueOf(dVar.f49888c), dVar);
                }
            }
            f49944a = hashMap;
        }
    }

    /* renamed from: a */
    static synchronized C20409d m74473a(Context context, int i) {
        synchronized (C20463c.class) {
            m74476b(context);
            Map<Integer, C20409d> map = f49944a;
            if (map == null) {
                return null;
            }
            return map.get(Integer.valueOf(i));
        }
    }

    /* renamed from: a */
    static synchronized void m74475a(Context context, C20409d dVar) {
        synchronized (C20463c.class) {
            m74476b(context);
            if (dVar != null) {
                Map<Integer, C20409d> map = f49944a;
                if (map != null) {
                    map.put(Integer.valueOf(dVar.f49888c), dVar);
                    ((LocalFrequencySettings) C20520j.m74724a(context, LocalFrequencySettings.class)).mo69018a(new ArrayList(f49944a.values()));
                }
            }
        }
    }
}
