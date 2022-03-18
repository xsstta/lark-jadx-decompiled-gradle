package com.bytedance.ies.xbridge.base.runtime.utils;

import com.google.gson.Gson;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J'\u0010\u0007\u001a\u0002H\b\"\u0004\b\u0000\u0010\b2\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\b0\f¢\u0006\u0002\u0010\rJ\u000e\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/bytedance/ies/xbridge/base/runtime/utils/JsonUtils;", "", "()V", "GSON", "Lcom/google/gson/Gson;", "getGSON", "()Lcom/google/gson/Gson;", "fromJson", "T", "json", "", "typeClass", "Ljava/lang/Class;", "(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;", "toJson", "obj", "x-bridge-base-runtime_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.ies.xbridge.base.runtime.a.a */
public final class JsonUtils {

    /* renamed from: a */
    public static final JsonUtils f37989a = new JsonUtils();

    /* renamed from: b */
    private static final Gson f37990b = new Gson();

    private JsonUtils() {
    }

    /* renamed from: a */
    public final String mo52934a(Object obj) {
        Intrinsics.checkParameterIsNotNull(obj, "obj");
        String json = f37990b.toJson(obj);
        Intrinsics.checkExpressionValueIsNotNull(json, "GSON.toJson(obj)");
        return json;
    }

    /* renamed from: a */
    public final <T> T mo52933a(String str, Class<T> cls) {
        Intrinsics.checkParameterIsNotNull(str, "json");
        Intrinsics.checkParameterIsNotNull(cls, "typeClass");
        return (T) f37990b.fromJson(str, (Class) cls);
    }
}
