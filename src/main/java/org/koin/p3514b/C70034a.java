package org.koin.p3514b;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.C69113a;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u000e\u0010\u0004\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\u0002\u001a\u000e\u0010\u0005\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\u0002\"\u001e\u0010\u0000\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0012\u0004\u0012\u00020\u00030\u0001X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"classNames", "", "Lkotlin/reflect/KClass;", "", "getFullName", "saveCache", "koin-core"}, mo238835k = 2, mv = {1, 1, 16})
/* renamed from: org.koin.b.a */
public final class C70034a {

    /* renamed from: a */
    private static final Map<KClass<?>, String> f175004a = new ConcurrentHashMap();

    /* renamed from: a */
    public static final String m268608a(KClass<?> kClass) {
        Intrinsics.checkParameterIsNotNull(kClass, "$this$getFullName");
        String str = f175004a.get(kClass);
        if (str != null) {
            return str;
        }
        return m268609b(kClass);
    }

    /* renamed from: b */
    public static final String m268609b(KClass<?> kClass) {
        Intrinsics.checkParameterIsNotNull(kClass, "$this$saveCache");
        String name = C69113a.m265954a((KClass) kClass).getName();
        Map<KClass<?>, String> map = f175004a;
        Intrinsics.checkExpressionValueIsNotNull(name, "name");
        map.put(kClass, name);
        return name;
    }
}
