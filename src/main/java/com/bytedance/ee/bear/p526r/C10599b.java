package com.bytedance.ee.bear.p526r;

import android.text.TextUtils;
import com.bytedance.ee.bear.appsetting.C4211a;
import com.bytedance.ee.bear.facade.common.icon.C7713a;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.log.C13479a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.r.b */
public class C10599b {

    /* renamed from: a */
    private static ArrayList<String> f28449a = new ArrayList() {
        /* class com.bytedance.ee.bear.p526r.C10599b.C106001 */

        {
            for (int i = 0; i < C10598a.f28439a.length; i++) {
                add(String.valueOf(C10598a.f28439a[i]));
            }
        }
    };

    /* renamed from: b */
    private static ArrayList<String> f28450b = new ArrayList<>();

    /* renamed from: a */
    public static void m43901a() {
        f28450b.clear();
    }

    /* renamed from: b */
    public static ArrayList<String> m43906b() {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.addAll(f28449a);
        arrayList.addAll(f28450b);
        if (C4211a.m17514a().mo16536a("spacekit.mobile.wiki2.0_enable", false)) {
            arrayList.add(String.valueOf(16));
        }
        if (C4211a.m17514a().mo16538b("spacekit.mobile.docx_enable", false)) {
            arrayList.add(String.valueOf(22));
        }
        return arrayList;
    }

    /* renamed from: b */
    public static int m43904b(String str) {
        return C7713a.m30841a(str);
    }

    /* renamed from: a */
    public static C8275a m43899a(int i) {
        return C10598a.f28447i.get(i, C8275a.f22369b);
    }

    /* renamed from: a */
    public static int m43898a(C8275a aVar) {
        if (C10598a.f28446h.containsKey(aVar)) {
            return C10598a.f28446h.get(aVar).intValue();
        }
        return 1;
    }

    /* renamed from: b */
    public static int m43903b(C8275a aVar) {
        if (C10598a.f28444f.containsKey(aVar)) {
            return C10598a.f28444f.get(aVar).intValue();
        }
        C13479a.m54758a("AtUtils", "getMentionType null");
        return 1;
    }

    /* renamed from: c */
    public static boolean m43907c(int i) {
        ArrayList<String> b = m43906b();
        return b.contains(i + "");
    }

    /* renamed from: d */
    public static int m43908d(int i) {
        int i2 = C10598a.f28442d.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        C13479a.m54764b("AtUtils", "getResId(): default");
        return C10598a.f28448j;
    }

    /* renamed from: e */
    public static String m43909e(int i) {
        String str = C10598a.f28443e.get(i);
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return str;
    }

    /* renamed from: a */
    public static void m43902a(String str) {
        if (!f28450b.contains(str)) {
            f28450b.add(str);
        }
    }

    /* renamed from: b */
    public static C8275a m43905b(int i) {
        if (C10598a.f28445g.containsKey(Integer.valueOf(i))) {
            return C10598a.f28445g.get(Integer.valueOf(i));
        }
        C13479a.m54758a("AtUtils", "getDocumentType null");
        return C8275a.f22371d;
    }

    /* renamed from: a */
    public static String m43900a(List<String> list) {
        if (list == null || list.isEmpty()) {
            C13479a.m54764b("AtUtils", "convertSearchTypeStrFromList: types is null ");
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(list.get(0));
        if (list.size() > 1) {
            for (int i = 1; i < list.size(); i++) {
                sb.append(',');
                sb.append(list.get(i));
            }
        }
        C13479a.m54764b("AtUtils", "convertSearchTypeStrFromList end: " + sb.toString());
        return sb.toString();
    }

    /* renamed from: f */
    public static String m43910f(int i) {
        if (i == 0) {
            return "user";
        }
        if (i == 1) {
            return C8275a.f22371d.mo32553a();
        }
        if (i == 3) {
            return C8275a.f22372e.mo32553a();
        }
        if (i == 5) {
            return "chat";
        }
        if (i == 8) {
            return C8275a.f22373f.mo32553a();
        }
        if (i == 22) {
            return C8275a.f22378k.mo32553a();
        }
        if (i == 11) {
            return C8275a.f22374g.mo32553a();
        }
        if (i == 12) {
            return C8275a.f22375h.mo32553a();
        }
        if (i == 15) {
            return C8275a.f22376i.mo32553a();
        }
        if (i != 16) {
            return "unknown";
        }
        return C8275a.f22377j.mo32553a();
    }
}
