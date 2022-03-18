package com.ss.android.lark.opmonitor.config;

import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: com.ss.android.lark.opmonitor.config.e */
public class C48913e {

    /* renamed from: a */
    String f122863a;

    /* renamed from: b */
    ArrayList<String> f122864b;

    /* renamed from: a */
    public boolean mo170771a(HashMap<String, Object> hashMap) {
        ArrayList<String> arrayList;
        Object obj = hashMap.get(this.f122863a);
        if (obj == null || (arrayList = this.f122864b) == null || arrayList.size() <= 0 || !this.f122864b.contains(obj.toString())) {
            return false;
        }
        return true;
    }
}
