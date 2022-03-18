package com.bytedance.ee.bear.wikiv2.p589c;

import com.bytedance.ee.bear.contract.AbstractC5233x;
import com.bytedance.ee.bear.contract.C5234y;
import com.bytedance.ee.util.p700c.C13598b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0012\u0010\u0000\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u001a\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u001a'\u0010\b\u001a\u00020\u0004\"\u0004\b\u0000\u0010\t*\u00020\u00072\u0006\u0010\n\u001a\u00020\u00012\b\u0010\u000b\u001a\u0004\u0018\u0001H\t¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"encrypt", "", "s", "report", "", "event", "params", "Lorg/json/JSONObject;", "putNotNull", "T", "key", "value", "(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V", "wiki-implv2_release"}, mo238835k = 2, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.wikiv2.c.d */
public final class C12238d {
    /* renamed from: a */
    public static final String m50931a(String str) {
        if (str != null) {
            return C13598b.m55197d(str);
        }
        return null;
    }

    /* renamed from: a */
    public static final void m50932a(String str, JSONObject jSONObject) {
        Intrinsics.checkParameterIsNotNull(str, "event");
        AbstractC5233x b = C5234y.m21391b();
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        b.mo21085b(str, jSONObject);
    }

    /* renamed from: a */
    public static final <T> void m50933a(JSONObject jSONObject, String str, T t) {
        Intrinsics.checkParameterIsNotNull(jSONObject, "$this$putNotNull");
        Intrinsics.checkParameterIsNotNull(str, "key");
        if (t != null) {
            jSONObject.put(str, t);
        }
    }
}
