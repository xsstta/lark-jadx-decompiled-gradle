package com.bytedance.sdk.bytebridge.base.utils;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0018\u0010\t\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bJ \u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u0001¨\u0006\u000e"}, d2 = {"Lcom/bytedance/sdk/bytebridge/base/utils/JsonHelper;", "", "()V", "optJSONArray", "Lorg/json/JSONArray;", "params", "Lorg/json/JSONObject;", "key", "", "optJSONObject", "optLong", "", "jsonObject", "defaultValue", "base_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.sdk.bytebridge.base.e.b */
public final class JsonHelper {

    /* renamed from: a */
    public static final JsonHelper f50601a = new JsonHelper();

    private JsonHelper() {
    }

    /* renamed from: b */
    public final JSONArray mo69823b(JSONObject jSONObject, String str) {
        Intrinsics.checkParameterIsNotNull(str, "key");
        if (jSONObject == null) {
            return new JSONArray();
        }
        try {
            JSONArray optJSONArray = jSONObject.optJSONArray(str);
            if (optJSONArray != null) {
                return optJSONArray;
            }
        } catch (Exception unused) {
        }
        return new JSONArray();
    }

    /* renamed from: a */
    public final JSONObject mo69822a(JSONObject jSONObject, String str) {
        Intrinsics.checkParameterIsNotNull(str, "key");
        if (jSONObject == null) {
            return new JSONObject();
        }
        if (Intrinsics.areEqual(str, "__all_params__")) {
            return jSONObject;
        }
        try {
            JSONObject optJSONObject = jSONObject.optJSONObject(str);
            if (optJSONObject != null) {
                return optJSONObject;
            }
        } catch (Exception unused) {
        }
        return new JSONObject();
    }

    /* renamed from: a */
    public final long mo69821a(JSONObject jSONObject, String str, Object obj) {
        Intrinsics.checkParameterIsNotNull(str, "key");
        Intrinsics.checkParameterIsNotNull(obj, "defaultValue");
        if (jSONObject == null) {
            return ((Long) obj).longValue();
        }
        String optString = jSONObject.optString(str);
        long longValue = ((Long) obj).longValue();
        try {
            Long valueOf = Long.valueOf(optString);
            Intrinsics.checkExpressionValueIsNotNull(valueOf, "java.lang.Long.valueOf(value)");
            return valueOf.longValue();
        } catch (NumberFormatException unused) {
            return longValue;
        }
    }
}
