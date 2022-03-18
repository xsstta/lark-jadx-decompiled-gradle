package com.bytedance.ee.bear.doc;

import com.bytedance.ee.bear.doc.p290a.AbstractC5319a;
import com.bytedance.ee.bear.doc.toolbar.C5544b;
import com.bytedance.ee.bear.doc.toolbar2.AbstractC5556d;
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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0011\u0010\u0000\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"DocDIModule", "Lorg/koin/core/module/Module;", "getDocDIModule", "()Lorg/koin/core/module/Module;", "doc-impl_release"}, mo238835k = 2, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.doc.a */
public final class C5314a {

    /* renamed from: a */
    private static final Module f15231a = C70027b.m268604a(false, false, C5315a.INSTANCE, 3, null);

    /* renamed from: a */
    public static final Module m21725a() {
        return f15231a;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lorg/koin/core/module/Module;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.doc.a$a */
    static final class C5315a extends Lambda implements Function1<Module, Unit> {
        public static final C5315a INSTANCE = new C5315a();

        C5315a() {
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
            Options a2 = Module.m268650a(aVar, false, false, 2, null);
            ScopeDefinition.m268731a(a, new BeanDefinition(a, Reflection.getOrCreateKotlinClass(C5544b.class), aVar2, C53161.INSTANCE, Kind.Factory, CollectionsKt.emptyList(), a2, null, null, 384, null), false, 2, null);
            C53172 r11 = C53172.INSTANCE;
            Definitions dVar2 = Definitions.f175040a;
            ScopeDefinition a3 = aVar.mo246637a();
            ScopeDefinition.m268731a(a3, new BeanDefinition(a3, Reflection.getOrCreateKotlinClass(AbstractC5556d.class), aVar2, r11, Kind.Factory, CollectionsKt.emptyList(), Module.m268650a(aVar, false, false, 2, null), null, null, 384, null), false, 2, null);
            C53183 r112 = C53183.INSTANCE;
            Definitions dVar3 = Definitions.f175040a;
            ScopeDefinition a4 = aVar.mo246637a();
            ScopeDefinition.m268731a(a4, new BeanDefinition(a4, Reflection.getOrCreateKotlinClass(AbstractC5319a.class), aVar2, r112, Kind.Single, CollectionsKt.emptyList(), aVar.mo246636a(false, false), null, null, 384, null), false, 2, null);
        }
    }
}
