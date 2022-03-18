package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.play.core.assetpacks.d */
public abstract class AbstractC22591d {
    /* renamed from: a */
    public static AbstractC22591d m82111a(long j, Map<String, AssetPackState> map) {
        return new C22579ad(j, map);
    }

    /* renamed from: a */
    public static AbstractC22591d m82112a(Bundle bundle, bb bbVar) {
        return m82114a(bundle, bbVar, new ArrayList());
    }

    /* renamed from: a */
    public static AbstractC22591d m82113a(Bundle bundle, bb bbVar, AbstractC22612v vVar) {
        return m82115a(bundle, bbVar, new ArrayList(), vVar);
    }

    /* renamed from: a */
    public static AbstractC22591d m82114a(Bundle bundle, bb bbVar, List<String> list) {
        return m82115a(bundle, bbVar, list, C22613w.f55988a);
    }

    /* renamed from: a */
    private static AbstractC22591d m82115a(Bundle bundle, bb bbVar, List<String> list, AbstractC22612v vVar) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("pack_names");
        HashMap hashMap = new HashMap();
        int size = stringArrayList.size();
        for (int i = 0; i < size; i++) {
            String str = stringArrayList.get(i);
            hashMap.put(str, AssetPackState.m81924a(bundle, str, bbVar, vVar));
        }
        int size2 = list.size();
        for (int i2 = 0; i2 < size2; i2++) {
            String str2 = list.get(i2);
            hashMap.put(str2, AssetPackState.m81925a(str2, 4, 0, 0, 0, 0.0d));
        }
        return m82111a(bundle.getLong("total_bytes_to_download"), hashMap);
    }

    /* renamed from: a */
    public abstract long mo78706a();

    /* renamed from: b */
    public abstract Map<String, AssetPackState> mo78707b();
}
