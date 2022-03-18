package com.tt.miniapp.manager;

import com.tt.miniapphost.entity.MicroSchemaEntity;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.tt.miniapp.manager.k */
public class C66451k {

    /* renamed from: a */
    private static ConcurrentHashMap<String, MicroSchemaEntity> f167755a = new ConcurrentHashMap<>();

    /* renamed from: a */
    public static MicroSchemaEntity m259761a(String str) {
        if (str == null) {
            return null;
        }
        if (f167755a.containsKey(str)) {
            return f167755a.get(str);
        }
        MicroSchemaEntity parseFromSchema = MicroSchemaEntity.parseFromSchema(str);
        if (parseFromSchema != null) {
            f167755a.put(str, parseFromSchema);
        }
        return parseFromSchema;
    }
}
