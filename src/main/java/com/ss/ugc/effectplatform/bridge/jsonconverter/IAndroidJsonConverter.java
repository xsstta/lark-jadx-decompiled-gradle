package com.ss.ugc.effectplatform.bridge.jsonconverter;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J)\u0010\u0002\u001a\u0002H\u0003\"\u0004\b\u0000\u0010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0007H&¢\u0006\u0002\u0010\bJ\u001d\u0010\t\u001a\u0004\u0018\u00010\u0005\"\u0004\b\u0000\u0010\u00032\u0006\u0010\n\u001a\u0002H\u0003H&¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/ss/ugc/effectplatform/bridge/jsonconverter/IAndroidJsonConverter;", "", "convertJsonToObj", "T", "json", "", "cls", "Ljava/lang/Class;", "(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;", "convertObjToJson", "object", "(Ljava/lang/Object;)Ljava/lang/String;", "effect_bridge_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.ugc.effectplatform.bridge.b.a */
public interface IAndroidJsonConverter {
    /* renamed from: a */
    <T> T mo207364a(String str, Class<T> cls);

    /* renamed from: a */
    <T> String mo207365a(T t);
}
