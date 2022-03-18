package com.bytedance.ee.util.p702e;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.ee.util.e.a */
public class C13656a {
    /* renamed from: a */
    public static List<Integer> m55417a(int[] iArr) {
        if (iArr == null || iArr.length == 0) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i : iArr) {
            arrayList.add(Integer.valueOf(i));
        }
        return arrayList;
    }
}
