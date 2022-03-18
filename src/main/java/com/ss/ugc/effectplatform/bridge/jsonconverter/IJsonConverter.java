package com.ss.ugc.effectplatform.bridge.jsonconverter;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\"\u0010\u0007\u001a\u0002H\b\"\n\b\u0000\u0010\b\u0018\u0001*\u00020\u00012\u0006\u0010\t\u001a\u00020\nH\b¢\u0006\u0002\u0010\u000bJ$\u0010\f\u001a\u0004\u0018\u00010\n\"\n\b\u0000\u0010\b\u0018\u0001*\u00020\u00012\u0006\u0010\r\u001a\u0002H\bH\b¢\u0006\u0002\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/ss/ugc/effectplatform/bridge/jsonconverter/IJsonConverter;", "", "iJsonConverter", "Lcom/ss/ugc/effectplatform/bridge/jsonconverter/IAndroidJsonConverter;", "(Lcom/ss/ugc/effectplatform/bridge/jsonconverter/IAndroidJsonConverter;)V", "getIJsonConverter", "()Lcom/ss/ugc/effectplatform/bridge/jsonconverter/IAndroidJsonConverter;", "convertJsonToObj", "T", "json", "", "(Ljava/lang/String;)Ljava/lang/Object;", "convertObjToJson", "obj", "(Ljava/lang/Object;)Ljava/lang/String;", "effect_bridge_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.ugc.effectplatform.bridge.b.b */
public final class IJsonConverter {

    /* renamed from: a */
    private final IAndroidJsonConverter f164867a;

    /* renamed from: a */
    public final IAndroidJsonConverter mo227739a() {
        return this.f164867a;
    }

    public IJsonConverter(IAndroidJsonConverter aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "iJsonConverter");
        this.f164867a = aVar;
    }
}
