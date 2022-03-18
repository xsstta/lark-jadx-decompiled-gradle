package com.huawei.updatesdk.p1046b.p1055f;

import android.text.TextUtils;
import com.huawei.updatesdk.p1029a.p1030a.p1032b.p1033a.p1034a.C23834a;
import com.huawei.updatesdk.p1029a.p1030a.p1035c.p1036h.C23845b;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.huawei.updatesdk.b.f.a */
public final class C23890a {

    /* renamed from: b */
    private static final Map<Integer, String> f59133b;

    /* renamed from: c */
    private static C23890a f59134c = new C23890a();

    /* renamed from: a */
    private int f59135a = 0;

    static {
        HashMap hashMap = new HashMap();
        f59133b = hashMap;
        hashMap.put(1, "1.0");
        hashMap.put(2, "1.5");
        hashMap.put(3, "1.6");
        hashMap.put(4, "2.0");
        hashMap.put(5, "2.0");
        hashMap.put(6, "2.3");
        hashMap.put(7, "3.0");
        hashMap.put(8, "3.0.5");
        hashMap.put(8, "3.1");
        hashMap.put(9, "4.0");
        hashMap.put(10, "4.1");
        hashMap.put(11, "5.0");
        hashMap.put(12, "5.1");
    }

    private C23890a() {
        int c = m87352c();
        this.f59135a = c;
        if (c == 0) {
            this.f59135a = m87351b();
        }
        C23834a.m87116a("EMUISupportUtil", "emuiVersion:" + this.f59135a);
    }

    /* renamed from: a */
    private String m87350a(String str) {
        if (!TextUtils.isEmpty(str)) {
            String[] split = str.split("_");
            if (split.length == 2) {
                return split[1];
            }
        }
        return "";
    }

    /* renamed from: b */
    private int m87351b() {
        String a = m87350a(C23845b.m87155a("ro.build.version.emui", ""));
        if (TextUtils.isEmpty(a)) {
            return 0;
        }
        for (Map.Entry<Integer, String> entry : f59133b.entrySet()) {
            if (a.equals(entry.getValue())) {
                return entry.getKey().intValue();
            }
        }
        return 0;
    }

    /* renamed from: c */
    private int m87352c() {
        return C23845b.m87151a("ro.build.hw_emui_api_level", 0);
    }

    /* renamed from: d */
    public static C23890a m87353d() {
        return f59134c;
    }

    /* renamed from: a */
    public int mo85685a() {
        return this.f59135a;
    }
}
