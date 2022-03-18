package com.ss.android.lark.inv.export.util;

import android.os.Bundle;
import android.util.Pair;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.lark.inv.export.util.g */
public class C40108g {
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: java.util.HashMap<K, V> */
    /* JADX WARN: Multi-variable type inference failed */
    @SafeVarargs
    /* renamed from: a */
    public static <K, V> HashMap<K, V> m159014a(Pair<K, V>... pairArr) {
        HashMap<K, V> hashMap = (HashMap<K, V>) new HashMap();
        if (!(pairArr == null || pairArr.length == 0)) {
            for (Pair<K, V> pair : pairArr) {
                if (pair != null) {
                    hashMap.put(pair.first, pair.second);
                }
            }
        }
        return hashMap;
    }

    /* renamed from: a */
    public static Bundle m159013a(Map<String, String> map) {
        Bundle bundle = new Bundle();
        if (map == null) {
            return bundle;
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            bundle.putString(entry.getKey(), entry.getValue());
        }
        return bundle;
    }

    /* renamed from: a */
    public static Map<String, Serializable> m159015a(Bundle bundle) {
        HashMap hashMap = new HashMap();
        if (bundle == null) {
            return hashMap;
        }
        for (String str : bundle.keySet()) {
            Serializable serializable = bundle.getSerializable(str);
            if (serializable != null) {
                hashMap.put(str, serializable);
            }
        }
        return hashMap;
    }
}
