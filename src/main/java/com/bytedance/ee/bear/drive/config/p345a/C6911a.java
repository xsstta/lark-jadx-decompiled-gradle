package com.bytedance.ee.bear.drive.config.p345a;

import com.bytedance.ee.bear.AbstractC4306b;
import com.bytedance.ee.bear.AbstractC4967c;
import com.bytedance.ee.bear.contract.drive.AbstractC5141c;
import com.bytedance.ee.bear.drivesdk.plugin.model.menu.AbstractC7583a;
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
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.ScopeDefinition;
import org.koin.p3512a.C70027b;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0011\u0010\u0000\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"DriveDIModule", "Lorg/koin/core/module/Module;", "getDriveDIModule", "()Lorg/koin/core/module/Module;", "drive-impl_release"}, mo238835k = 2, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.drive.config.a.a */
public final class C6911a {

    /* renamed from: a */
    private static final Module f18683a = C70027b.m268604a(false, false, C6912a.INSTANCE, 3, null);

    /* renamed from: a */
    public static final Module m27340a() {
        return f18683a;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lorg/koin/core/module/Module;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.config.a.a$a */
    static final class C6912a extends Lambda implements Function1<Module, Unit> {
        public static final C6912a INSTANCE = new C6912a();

        C6912a() {
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
            Qualifier aVar2 = null;
            Definitions dVar = Definitions.f175040a;
            ScopeDefinition a = aVar.mo246637a();
            Options a2 = aVar.mo246636a(false, false);
            ScopeDefinition.m268731a(a, new BeanDefinition(a, Reflection.getOrCreateKotlinClass(AbstractC5141c.class), aVar2, C69131.INSTANCE, Kind.Single, CollectionsKt.emptyList(), a2, null, null, 384, null), false, 2, null);
            C69142 r11 = C69142.INSTANCE;
            Definitions dVar2 = Definitions.f175040a;
            ScopeDefinition a3 = aVar.mo246637a();
            ScopeDefinition.m268731a(a3, new BeanDefinition(a3, Reflection.getOrCreateKotlinClass(AbstractC4306b.class), aVar2, r11, Kind.Single, CollectionsKt.emptyList(), aVar.mo246636a(false, false), null, null, 384, null), false, 2, null);
            C69153 r112 = C69153.INSTANCE;
            Definitions dVar3 = Definitions.f175040a;
            ScopeDefinition a4 = aVar.mo246637a();
            ScopeDefinition.m268731a(a4, new BeanDefinition(a4, Reflection.getOrCreateKotlinClass(AbstractC4967c.class), aVar2, r112, Kind.Single, CollectionsKt.emptyList(), aVar.mo246636a(false, false), null, null, 384, null), false, 2, null);
            C69164 r113 = C69164.INSTANCE;
            Definitions dVar4 = Definitions.f175040a;
            ScopeDefinition a5 = aVar.mo246637a();
            ScopeDefinition.m268731a(a5, new BeanDefinition(a5, Reflection.getOrCreateKotlinClass(AbstractC7583a.class), aVar2, r113, Kind.Single, CollectionsKt.emptyList(), aVar.mo246636a(false, false), null, null, 384, null), false, 2, null);
        }
    }
}
