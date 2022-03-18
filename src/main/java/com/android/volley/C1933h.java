package com.android.volley;

import com.huawei.hms.location.LocationRequest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: com.android.volley.h */
public class C1933h {

    /* renamed from: a */
    public final int f6597a;

    /* renamed from: b */
    public final byte[] f6598b;

    /* renamed from: c */
    public final Map<String, String> f6599c;

    /* renamed from: d */
    public final List<C1930e> f6600d;

    /* renamed from: e */
    public final boolean f6601e;

    /* renamed from: f */
    public final long f6602f;

    /* renamed from: a */
    private static Map<String, String> m8586a(List<C1930e> list) {
        if (list == null) {
            return null;
        }
        if (list.isEmpty()) {
            return Collections.emptyMap();
        }
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (C1930e eVar : list) {
            treeMap.put(eVar.mo9799a(), eVar.mo9800b());
        }
        return treeMap;
    }

    /* renamed from: a */
    private static List<C1930e> m8585a(Map<String, String> map) {
        if (map == null) {
            return null;
        }
        if (map.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            arrayList.add(new C1930e(entry.getKey(), entry.getValue()));
        }
        return arrayList;
    }

    public C1933h(byte[] bArr, Map<String, String> map) {
        this((int) LocationRequest.PRIORITY_HD_ACCURACY, bArr, map, false, 0L);
    }

    public C1933h(int i, byte[] bArr, Map<String, String> map, boolean z, long j) {
        this(i, bArr, map, m8585a(map), z, j);
    }

    public C1933h(int i, byte[] bArr, boolean z, long j, List<C1930e> list) {
        this(i, bArr, m8586a(list), list, z, j);
    }

    private C1933h(int i, byte[] bArr, Map<String, String> map, List<C1930e> list, boolean z, long j) {
        this.f6597a = i;
        this.f6598b = bArr;
        this.f6599c = map;
        if (list == null) {
            this.f6600d = null;
        } else {
            this.f6600d = Collections.unmodifiableList(list);
        }
        this.f6601e = z;
        this.f6602f = j;
    }
}
