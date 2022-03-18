package org.koin.java;

import kotlin.Metadata;
import kotlin.jvm.C69113a;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import org.koin.core.Koin;
import org.koin.core.context.KoinContextHandler;
import org.koin.core.parameter.DefinitionParameters;
import org.koin.core.qualifier.Qualifier;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JU\u0010\u0003\u001a\u0002H\u0004\"\b\b\u0000\u0010\u0005*\u00020\u0001\"\b\b\u0001\u0010\u0004*\u00020\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00050\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00040\u00072\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nj\u0004\u0018\u0001`\fH\u0007¢\u0006\u0002\u0010\rJI\u0010\u000e\u001a\u0002H\u000f\"\b\b\u0000\u0010\u000f*\u00020\u00012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u000f0\u00072\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nj\u0004\u0018\u0001`\fH\u0007¢\u0006\u0002\u0010\u0013J\b\u0010\u0014\u001a\u00020\u0015H\u0007JJ\u0010\u0016\u001a\b\u0012\u0004\u0012\u0002H\u000f0\u0017\"\b\b\u0000\u0010\u000f*\u00020\u00012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u000f0\u00072\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nj\u0004\u0018\u0001`\fH\u0007¨\u0006\u0018"}, d2 = {"Lorg/koin/java/KoinJavaComponent;", "", "()V", "bind", "S", "P", "primary", "Ljava/lang/Class;", "secondary", "parameters", "Lkotlin/Function0;", "Lorg/koin/core/parameter/DefinitionParameters;", "Lorg/koin/core/parameter/ParametersDefinition;", "(Ljava/lang/Class;Ljava/lang/Class;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "get", "T", "clazz", "qualifier", "Lorg/koin/core/qualifier/Qualifier;", "(Ljava/lang/Class;Lorg/koin/core/qualifier/Qualifier;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "getKoin", "Lorg/koin/core/Koin;", "inject", "Lkotlin/Lazy;", "koin-core"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: org.koin.c.a */
public final class KoinJavaComponent {

    /* renamed from: a */
    public static final KoinJavaComponent f175005a = new KoinJavaComponent();

    @JvmStatic
    /* renamed from: a */
    public static final <T> T m268610a(Class<T> cls) {
        return (T) m268613a(cls, null, null, 6, null);
    }

    @JvmStatic
    /* renamed from: a */
    public static final <T> T m268611a(Class<T> cls, Qualifier aVar) {
        return (T) m268613a(cls, aVar, null, 4, null);
    }

    private KoinJavaComponent() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final Koin m268614a() {
        return KoinContextHandler.f175011a.mo246622a();
    }

    @JvmStatic
    /* renamed from: a */
    public static final <T> T m268612a(Class<T> cls, Qualifier aVar, Function0<DefinitionParameters> function0) {
        Intrinsics.checkParameterIsNotNull(cls, "clazz");
        KClass<?> a = C69113a.m265955a((Class) cls);
        T t = (T) m268614a().mo246613a(a, aVar, function0);
        return t != null ? t : (T) m268614a().mo246613a(a, aVar, function0);
    }

    /* renamed from: a */
    public static /* synthetic */ Object m268613a(Class cls, Qualifier aVar, Function0 function0, int i, Object obj) {
        if ((i & 2) != 0) {
            aVar = null;
        }
        if ((i & 4) != 0) {
            function0 = null;
        }
        return m268612a(cls, aVar, function0);
    }
}
