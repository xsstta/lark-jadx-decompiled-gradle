package com.ss.android.appcenter.business.tab.fragmentv3.p1283a;

import android.text.TextUtils;
import android.util.Pair;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.appcenter.business.tab.fragmentv3.a.a */
public class C28030a {

    /* renamed from: a */
    private static List<Pair<Integer, String>> f70137a;

    static {
        ArrayList arrayList = new ArrayList();
        f70137a = arrayList;
        arrayList.add(new Pair(6, "CommonAndRecommend"));
        f70137a.add(new Pair<>(7, "Block"));
    }

    /* renamed from: a */
    public static int m102446a(String str) {
        for (int i = 0; i < f70137a.size(); i++) {
            Pair<Integer, String> pair = f70137a.get(i);
            if (TextUtils.equals((CharSequence) pair.second, str)) {
                return ((Integer) pair.first).intValue();
            }
        }
        return -1;
    }

    /* renamed from: a */
    public static String m102447a(int i) {
        for (int i2 = 0; i2 < f70137a.size(); i2++) {
            Pair<Integer, String> pair = f70137a.get(i2);
            if (((Integer) pair.first).intValue() == i) {
                return (String) pair.second;
            }
        }
        return "Default";
    }
}
