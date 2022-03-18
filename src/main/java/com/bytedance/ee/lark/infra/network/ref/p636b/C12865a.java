package com.bytedance.ee.lark.infra.network.ref.p636b;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.network.ref.entity.AbstractC12876c;
import com.bytedance.ee.lark.infra.network.ref.entity.C12874a;
import com.bytedance.ee.lark.infra.network.ref.entity.C12878e;
import com.bytedance.ee.lark.infra.network.ref.entity.C12882h;
import com.bytedance.ee.lark.infra.network.ref.entity.ECONetworkException;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.ee.lark.infra.network.ref.b.a */
public class C12865a implements AbstractC12876c {
    @Override // com.bytedance.ee.lark.infra.network.ref.entity.AbstractC12876c
    /* renamed from: a */
    public C12874a<C12867c> mo48497a(C12878e eVar, C12867c cVar, Object... objArr) {
        JSONObject jSONObject = new JSONObject(cVar.mo48501a());
        if (objArr != null && objArr.length > 0) {
            Object obj = objArr[0];
            if (obj instanceof JSONObject) {
                JSONObject jSONObject2 = (JSONObject) obj;
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    try {
                        String next = keys.next();
                        jSONObject.put(next, jSONObject2.opt(next));
                    } catch (JSONException e) {
                        AppBrandLogger.eWithThrowable("ECOJsonBodyConverter", "add body err", e);
                        return new C12874a<>(new ECONetworkException("serialize err", e));
                    }
                }
            }
        }
        if (jSONObject.length() > 0) {
            cVar.mo48502a(C12882h.m53158a("application/json", jSONObject.toString()));
        }
        return new C12874a<>(cVar);
    }
}
