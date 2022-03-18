package com.bytedance.ee.bear.bitable;

import com.bytedance.ee.bear.share.IBitableApi;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.Definitions;
import org.koin.core.definition.Kind;
import org.koin.core.definition.Options;
import org.koin.core.module.Module;
import org.koin.core.scope.ScopeDefinition;
import org.koin.p3512a.C70027b;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0011\u0010\u0000\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"BitableDIModule", "Lorg/koin/core/module/Module;", "getBitableDIModule", "()Lorg/koin/core/module/Module;", "bitable-impl_release"}, mo238835k = 2, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.bitable.b */
public final class C4521b {

    /* renamed from: a */
    private static final Module f13260a = C70027b.m268604a(false, false, C4522a.INSTANCE, 3, null);

    /* renamed from: a */
    public static final Module m18681a() {
        return f13260a;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lorg/koin/core/module/Module;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.b$a */
    static final class C4522a extends Lambda implements Function1<Module, Unit> {
        public static final C4522a INSTANCE = new C4522a();

        C4522a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Module aVar) {
            invoke(aVar);
            return Unit.INSTANCE;
        }

        public final void invoke(Module aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, "$receiver");
            Definitions dVar = Definitions.f175040a;
            ScopeDefinition a = aVar.mo246637a();
            Options a2 = aVar.mo246636a(false, false);
            List emptyList = CollectionsKt.emptyList();
            KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(IBitableApi.class);
            ScopeDefinition.m268731a(a, new BeanDefinition(a, orCreateKotlinClass, null, C45231.INSTANCE, Kind.Single, emptyList, a2, null, null, 384, null), false, 2, null);
        }
    }
}
