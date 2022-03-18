package org.koin.core.registry;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.koin.core.Koin;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\tJ\u0010\u0010\u000e\u001a\u0004\u0018\u00010\t2\u0006\u0010\r\u001a\u00020\tJ\u0006\u0010\u000f\u001a\u00020\u000bJ\u000e\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\tJ\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\tH\u0002J\u000e\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0013J\u001a\u0010\u0015\u001a\u00020\u000b2\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u0017J\u001d\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\tH\u0000¢\u0006\u0002\b\u001aR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lorg/koin/core/registry/PropertyRegistry;", "", "_koin", "Lorg/koin/core/Koin;", "(Lorg/koin/core/Koin;)V", "get_koin", "()Lorg/koin/core/Koin;", "_values", "", "", "close", "", "deleteProperty", "key", "getProperty", "loadEnvironmentProperties", "loadPropertiesFromFile", "fileName", "readDataFromFile", "Ljava/util/Properties;", "content", "saveProperties", "properties", "", "saveProperty", "value", "saveProperty$koin_core", "koin-core"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: org.koin.core.f.c */
public final class PropertyRegistry {

    /* renamed from: a */
    private final Map<String, String> f175049a = new ConcurrentHashMap();

    /* renamed from: b */
    private final Koin f175050b;

    /* renamed from: a */
    public final String mo246679a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "key");
        return this.f175049a.get(str);
    }

    public PropertyRegistry(Koin aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "_koin");
        this.f175050b = aVar;
    }
}
