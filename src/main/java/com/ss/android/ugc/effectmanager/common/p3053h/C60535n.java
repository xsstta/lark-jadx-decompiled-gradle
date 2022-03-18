package com.ss.android.ugc.effectmanager.common.p3053h;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003\u001a\u0016\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00020\u0005*\u00020\u0007¨\u0006\b"}, d2 = {"toList", "", "", "Lorg/json/JSONArray;", "toMap", "", "", "Lorg/json/JSONObject;", "effectmanager_release"}, mo238835k = 2, mv = {1, 1, 15})
/* renamed from: com.ss.android.ugc.effectmanager.common.h.n */
public final class C60535n {
    /* renamed from: a */
    public static final List<Object> m235316a(JSONArray jSONArray) throws JSONException {
        Intrinsics.checkParameterIsNotNull(jSONArray, "$this$toList");
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            Object obj = jSONArray.get(i);
            if (obj instanceof JSONArray) {
                obj = m235316a((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = m235317a((JSONObject) obj);
            }
            Intrinsics.checkExpressionValueIsNotNull(obj, "value");
            arrayList.add(obj);
        }
        return arrayList;
    }

    /* renamed from: a */
    public static final Map<String, Object> m235317a(JSONObject jSONObject) throws JSONException {
        Intrinsics.checkParameterIsNotNull(jSONObject, "$this$toMap");
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject.get(next);
            if (obj instanceof JSONArray) {
                obj = m235316a((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = m235317a((JSONObject) obj);
            }
            Intrinsics.checkExpressionValueIsNotNull(next, "key");
            Intrinsics.checkExpressionValueIsNotNull(obj, "value");
            hashMap.put(next, obj);
        }
        return hashMap;
    }
}
