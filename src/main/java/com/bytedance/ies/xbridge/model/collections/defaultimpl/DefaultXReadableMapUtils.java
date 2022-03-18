package com.bytedance.ies.xbridge.model.collections.defaultimpl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u001c\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\n2\u0006\u0010\u0007\u001a\u00020\u000bJ\u0016\u0010\f\u001a\u00020\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006H\u0002J\u001a\u0010\u000e\u001a\u00020\u000b2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\nR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/bytedance/ies/xbridge/model/collections/defaultimpl/DefaultXReadableMapUtils;", "", "()V", "TAG", "", "jsonToList", "", "json", "Lorg/json/JSONArray;", "jsonToMap", "", "Lorg/json/JSONObject;", "listToJSON", "list", "mapToJSON", "map", "x-bridge-core-api_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.ies.xbridge.d.a.a.e */
public final class DefaultXReadableMapUtils {

    /* renamed from: a */
    public static final DefaultXReadableMapUtils f38026a = new DefaultXReadableMapUtils();

    private DefaultXReadableMapUtils() {
    }

    /* renamed from: a */
    public final List<Object> mo53112a(JSONArray jSONArray) {
        Intrinsics.checkParameterIsNotNull(jSONArray, "json");
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            Object opt = jSONArray.opt(i);
            if (opt instanceof Long) {
                arrayList.add(Long.valueOf(jSONArray.optLong(i)));
            } else if (opt instanceof Double) {
                arrayList.add(Double.valueOf(jSONArray.optDouble(i)));
            } else if (opt instanceof Integer) {
                arrayList.add(Integer.valueOf(jSONArray.getInt(i)));
            } else if (opt instanceof String) {
                arrayList.add(jSONArray.optString(i));
            } else if (opt instanceof JSONObject) {
                DefaultXReadableMapUtils eVar = f38026a;
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                Intrinsics.checkExpressionValueIsNotNull(optJSONObject, "json.optJSONObject(index)");
                arrayList.add(eVar.mo53113a(optJSONObject));
            } else if (opt instanceof JSONArray) {
                DefaultXReadableMapUtils eVar2 = f38026a;
                JSONArray optJSONArray = jSONArray.optJSONArray(i);
                Intrinsics.checkExpressionValueIsNotNull(optJSONArray, "json.optJSONArray(index)");
                arrayList.add(eVar2.mo53112a(optJSONArray));
            } else if (opt instanceof Boolean) {
                arrayList.add(Boolean.valueOf(jSONArray.optBoolean(i)));
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final Map<String, Object> mo53113a(JSONObject jSONObject) {
        Intrinsics.checkParameterIsNotNull(jSONObject, "json");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object opt = jSONObject.opt(next);
            if (opt instanceof Long) {
                Intrinsics.checkExpressionValueIsNotNull(next, "key");
                linkedHashMap.put(next, Long.valueOf(jSONObject.optLong(next)));
            } else if (opt instanceof Double) {
                Intrinsics.checkExpressionValueIsNotNull(next, "key");
                linkedHashMap.put(next, Double.valueOf(jSONObject.optDouble(next)));
            } else if (opt instanceof Integer) {
                Intrinsics.checkExpressionValueIsNotNull(next, "key");
                linkedHashMap.put(next, Integer.valueOf(jSONObject.optInt(next)));
            } else if (opt instanceof String) {
                Intrinsics.checkExpressionValueIsNotNull(next, "key");
                linkedHashMap.put(next, jSONObject.optString(next));
            } else if (opt instanceof JSONObject) {
                Intrinsics.checkExpressionValueIsNotNull(next, "key");
                DefaultXReadableMapUtils eVar = f38026a;
                JSONObject optJSONObject = jSONObject.optJSONObject(next);
                Intrinsics.checkExpressionValueIsNotNull(optJSONObject, "json.optJSONObject(key)");
                linkedHashMap.put(next, eVar.mo53113a(optJSONObject));
            } else if (opt instanceof JSONArray) {
                Intrinsics.checkExpressionValueIsNotNull(next, "key");
                DefaultXReadableMapUtils eVar2 = f38026a;
                JSONArray optJSONArray = jSONObject.optJSONArray(next);
                Intrinsics.checkExpressionValueIsNotNull(optJSONArray, "json.optJSONArray(key)");
                linkedHashMap.put(next, eVar2.mo53112a(optJSONArray));
            } else if (opt instanceof Boolean) {
                Intrinsics.checkExpressionValueIsNotNull(next, "key");
                linkedHashMap.put(next, Boolean.valueOf(jSONObject.optBoolean(next)));
            } else {
                Intrinsics.checkExpressionValueIsNotNull(next, "key");
                linkedHashMap.put(next, null);
            }
        }
        return linkedHashMap;
    }
}
