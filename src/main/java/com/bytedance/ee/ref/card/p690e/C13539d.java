package com.bytedance.ee.ref.card.p690e;

import com.tt.refer.common.pkg.PackageEntity;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.ee.ref.card.e.d */
public class C13539d {
    /* renamed from: a */
    public static Map<String, Object> m54960a(PackageEntity packageEntity) {
        HashMap hashMap = new HashMap();
        if (packageEntity != null) {
            hashMap.put("identifier", packageEntity.getIdentifier());
            hashMap.put("package_name", packageEntity.getPackageName());
        }
        return hashMap;
    }
}
