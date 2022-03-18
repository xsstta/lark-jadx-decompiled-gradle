package com.ss.android.lark.opmonitor.config;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: com.ss.android.lark.opmonitor.config.d */
public class C48912d {

    /* renamed from: a */
    int f122860a;

    /* renamed from: b */
    double f122861b;

    /* renamed from: c */
    ArrayList<C48913e> f122862c;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo170770a(HashMap<String, Object> hashMap) {
        ArrayList<C48913e> arrayList = this.f122862c;
        if (arrayList == null) {
            return false;
        }
        Iterator<C48913e> it = arrayList.iterator();
        while (it.hasNext()) {
            if (!it.next().mo170771a(hashMap)) {
                return false;
            }
        }
        return true;
    }
}
