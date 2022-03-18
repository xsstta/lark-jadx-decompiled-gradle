package org.apache.commons.compress.compressors;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: org.apache.commons.compress.compressors.e */
public class C69804e {

    /* renamed from: a */
    private final Map<String, String> f174413a = new HashMap();

    /* renamed from: b */
    private final Map<String, String> f174414b;

    /* renamed from: c */
    private final int f174415c;

    /* renamed from: d */
    private final int f174416d;

    /* renamed from: e */
    private final int f174417e;

    /* renamed from: f */
    private final int f174418f;

    /* renamed from: g */
    private final String f174419g;

    public C69804e(Map<String, String> map, String str) {
        this.f174414b = Collections.unmodifiableMap(map);
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MAX_VALUE;
        int i3 = Integer.MIN_VALUE;
        int i4 = Integer.MIN_VALUE;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            int length = entry.getKey().length();
            i3 = length > i3 ? length : i3;
            i = length < i ? length : i;
            String value = entry.getValue();
            int length2 = value.length();
            if (length2 > 0) {
                if (!this.f174413a.containsKey(value)) {
                    this.f174413a.put(value, entry.getKey());
                }
                i4 = length2 > i4 ? length2 : i4;
                if (length2 < i2) {
                    i2 = length2;
                }
            }
        }
        this.f174415c = i3;
        this.f174417e = i4;
        this.f174416d = i;
        this.f174418f = i2;
        this.f174419g = str;
    }
}
