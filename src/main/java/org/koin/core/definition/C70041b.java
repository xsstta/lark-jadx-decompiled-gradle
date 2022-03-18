package org.koin.core.definition;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import org.koin.core.qualifier.Qualifier;
import org.koin.p3514b.C70034a;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001c\u0010\u0000\u001a\u00020\u00012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005*>\u0010\u0006\u001a\u0004\b\u0000\u0010\u0007\"\u0019\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u0002H\u00070\b¢\u0006\u0002\b\u000b2\u0019\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u0002H\u00070\b¢\u0006\u0002\b\u000b*\n\u0010\f\"\u00020\u00012\u00020\u0001¨\u0006\r"}, d2 = {"indexKey", "", "clazz", "Lkotlin/reflect/KClass;", "qualifier", "Lorg/koin/core/qualifier/Qualifier;", "Definition", "T", "Lkotlin/Function2;", "Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/DefinitionParameters;", "Lkotlin/ExtensionFunctionType;", "IndexKey", "koin-core"}, mo238835k = 2, mv = {1, 1, 16})
/* renamed from: org.koin.core.definition.b */
public final class C70041b {
    /* renamed from: a */
    public static final String m268672a(KClass<?> kClass, Qualifier aVar) {
        String str;
        Intrinsics.checkParameterIsNotNull(kClass, "clazz");
        if (aVar != null) {
            str = aVar.getValue();
        } else {
            str = null;
        }
        if (str == null) {
            return C70034a.m268608a(kClass);
        }
        return C70034a.m268608a(kClass) + "::" + aVar.getValue();
    }
}
