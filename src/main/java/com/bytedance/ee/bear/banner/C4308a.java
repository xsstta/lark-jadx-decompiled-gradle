package com.bytedance.ee.bear.banner;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.Definitions;
import org.koin.core.definition.Kind;
import org.koin.core.definition.Options;
import org.koin.core.module.Module;
import org.koin.core.p3520e.C70042b;
import org.koin.core.qualifier.StringQualifier;
import org.koin.core.scope.ScopeDefinition;
import org.koin.p3512a.C70027b;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0011\u0010\u0000\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"BannerDiModule", "Lorg/koin/core/module/Module;", "getBannerDiModule", "()Lorg/koin/core/module/Module;", "banner-impl_release"}, mo238835k = 2, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.banner.a */
public final class C4308a {

    /* renamed from: a */
    private static final Module f12912a = C70027b.m268604a(false, false, C4309a.INSTANCE, 3, null);

    /* renamed from: a */
    public static final Module m17825a() {
        return f12912a;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lorg/koin/core/module/Module;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.banner.a$a */
    static final class C4309a extends Lambda implements Function1<Module, Unit> {
        public static final C4309a INSTANCE = new C4309a();

        C4309a() {
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
            StringQualifier a = C70042b.m268676a("space");
            C43101 r6 = C43101.INSTANCE;
            Definitions dVar = Definitions.f175040a;
            ScopeDefinition a2 = aVar.mo246637a();
            Options a3 = aVar.mo246636a(false, false);
            ScopeDefinition.m268731a(a2, new BeanDefinition(a2, Reflection.getOrCreateKotlinClass(AbstractC4339e.class), a, r6, Kind.Single, CollectionsKt.emptyList(), a3, null, null, 384, null), false, 2, null);
            StringQualifier a4 = C70042b.m268676a("template");
            C43112 r19 = C43112.INSTANCE;
            Definitions dVar2 = Definitions.f175040a;
            ScopeDefinition a5 = aVar.mo246637a();
            Options a6 = aVar.mo246636a(false, false);
            ScopeDefinition.m268731a(a5, new BeanDefinition(a5, Reflection.getOrCreateKotlinClass(AbstractC4339e.class), a4, r19, Kind.Single, CollectionsKt.emptyList(), a6, null, null, 384, null), false, 2, null);
        }
    }
}
