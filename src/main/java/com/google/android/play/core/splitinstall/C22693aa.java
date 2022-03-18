package com.google.android.play.core.splitinstall;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.play.core.splitinstall.aa */
public final class C22693aa {

    /* renamed from: a */
    private final Map<String, Map<String, String>> f56153a;

    /* synthetic */ C22693aa(Map map) {
        this.f56153a = map;
    }

    /* renamed from: a */
    public final Map<String, Set<String>> mo79042a(Collection<String> collection) {
        Set set;
        HashMap hashMap = new HashMap();
        for (String str : this.f56153a.keySet()) {
            if (!this.f56153a.containsKey(str)) {
                set = Collections.emptySet();
            } else {
                HashSet hashSet = new HashSet();
                for (Map.Entry<String, String> entry : this.f56153a.get(str).entrySet()) {
                    if (collection.contains(entry.getKey())) {
                        hashSet.add(entry.getValue());
                    }
                }
                set = Collections.unmodifiableSet(hashSet);
            }
            hashMap.put(str, set);
        }
        return hashMap;
    }
}
