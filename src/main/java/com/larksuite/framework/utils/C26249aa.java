package com.larksuite.framework.utils;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.larksuite.framework.utils.aa */
public class C26249aa {

    /* renamed from: com.larksuite.framework.utils.aa$a */
    public interface AbstractC26250a<S, R> {
        R get(S s);
    }

    /* renamed from: a */
    public static <S, R> List<R> m94984a(List<S> list, AbstractC26250a<S, R> aVar) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (S s : list) {
                R r = aVar.get(s);
                if (r != null) {
                    arrayList.add(r);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static <S, R> Map<String, R> m94985a(Map<String, S> map, AbstractC26250a<S, R> aVar) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (map != null) {
            for (String str : map.keySet()) {
                R r = aVar.get(map.get(str));
                if (r != null) {
                    linkedHashMap.put(str, r);
                }
            }
        }
        return linkedHashMap;
    }
}
