package com.google.android.play.core.splitinstall;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.play.core.splitinstall.z */
public final class C22728z {

    /* renamed from: a */
    private final Map<String, Map<String, String>> f56243a = new HashMap();

    /* renamed from: a */
    public final C22693aa mo79068a() {
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, Map<String, String>> entry : this.f56243a.entrySet()) {
            hashMap.put(entry.getKey(), Collections.unmodifiableMap(new HashMap(entry.getValue())));
        }
        return new C22693aa(Collections.unmodifiableMap(hashMap));
    }

    /* renamed from: a */
    public final void mo79069a(String str, String str2, String str3) {
        if (!this.f56243a.containsKey(str2)) {
            this.f56243a.put(str2, new HashMap());
        }
        this.f56243a.get(str2).put(str, str3);
    }
}
