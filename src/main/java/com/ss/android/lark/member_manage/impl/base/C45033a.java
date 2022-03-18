package com.ss.android.lark.member_manage.impl.base;

import com.ss.android.lark.member_manage.impl.bean.C45084c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.member_manage.impl.base.a */
public class C45033a {

    /* renamed from: a */
    private static HashMap<String, Integer> f114029a = new HashMap<>();

    /* renamed from: a */
    public static Map<String, Integer> m178595a() {
        return f114029a;
    }

    /* renamed from: a */
    public static List<String> m178594a(List<C45084c> list) {
        f114029a.clear();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (C45084c cVar : list) {
            if (!cVar.mo159508d()) {
                String valueOf = String.valueOf(cVar.mo159514i());
                if (!f114029a.containsKey(valueOf.toUpperCase())) {
                    f114029a.put(valueOf.toUpperCase(), Integer.valueOf(i));
                    arrayList.add(valueOf.toUpperCase());
                } else if (!arrayList.contains(valueOf.toUpperCase())) {
                    arrayList.add(valueOf.toUpperCase());
                }
                i++;
            }
        }
        return arrayList;
    }
}
