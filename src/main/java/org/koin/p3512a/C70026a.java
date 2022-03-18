package org.koin.p3512a;

import java.util.Collection;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.scope.ScopeDefinition;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u001d\u0010\u0000\u001a\u0006\u0012\u0002\b\u00030\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001*\u0006\u0012\u0002\b\u00030\u0001H\b\u001a+\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0004\u001a,\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0001*\u0006\u0012\u0002\b\u00030\u00012\u0010\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0007H\u0004¢\u0006\u0002\u0010\b\u001a?\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u001e\u0010\t\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u0001H\u0002\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u0002H\u0002`\fH\u0004¨\u0006\r"}, d2 = {"bind", "Lorg/koin/core/definition/BeanDefinition;", "T", "clazz", "Lkotlin/reflect/KClass;", "binds", "classes", "", "(Lorg/koin/core/definition/BeanDefinition;[Lkotlin/reflect/KClass;)Lorg/koin/core/definition/BeanDefinition;", "onClose", "Lkotlin/Function1;", "", "Lorg/koin/core/definition/OnCloseCallback;", "koin-core"}, mo238835k = 2, mv = {1, 1, 16})
/* renamed from: org.koin.a.a */
public final class C70026a {
    /* renamed from: a */
    public static final BeanDefinition<?> m268602a(BeanDefinition<?> aVar, KClass<?>[] kClassArr) {
        Intrinsics.checkParameterIsNotNull(aVar, "$this$binds");
        Intrinsics.checkParameterIsNotNull(kClassArr, "classes");
        BeanDefinition<?> a = BeanDefinition.m268662a(aVar, null, null, null, null, null, CollectionsKt.plus((Collection) aVar.mo246651f(), (Object[]) kClassArr), null, null, null, 479, null);
        aVar.mo246645a().mo246710a(aVar);
        ScopeDefinition.m268731a(aVar.mo246645a(), a, false, 2, null);
        return a;
    }
}
