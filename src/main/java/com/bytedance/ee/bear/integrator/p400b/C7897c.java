package com.bytedance.ee.bear.integrator.p400b;

import com.bytedance.ee.bear.browser.AbstractC4936n;
import com.bytedance.ee.bear.browser.plugin.AbstractC4948i;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.contract.route.parcelable.WikiPluginsProvider;
import com.bytedance.ee.bear.domain.AbstractC6307e;
import com.bytedance.ee.bear.middleground.comment.p445c.AbstractC9105b;
import com.bytedance.ee.bear.onboarding.p514a.AbstractC10372a;
import com.bytedance.ee.bear.p409j.AbstractC7935a;
import com.bytedance.ee.bear.route.AbstractC10740f;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.wiki.browser.plugin.AbstractC11921a;
import com.bytedance.ee.bear.wikiv2.browser.plugin.AbstractC12208a;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.Definitions;
import org.koin.core.definition.Kind;
import org.koin.core.definition.Options;
import org.koin.core.module.Module;
import org.koin.core.parameter.DefinitionParameters;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.Scope;
import org.koin.core.scope.ScopeDefinition;
import org.koin.p3512a.C70026a;
import org.koin.p3512a.C70027b;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0006\"\u0011\u0010\u0000\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"koinCommonModule", "Lorg/koin/core/module/Module;", "getKoinCommonModule", "()Lorg/koin/core/module/Module;", "createAppInitializeKoinModule", "serviceContext", "Lcom/bytedance/ee/bear/service/ServiceContext;", "basesdk_release"}, mo238835k = 2, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.integrator.b.c */
public final class C7897c {

    /* renamed from: a */
    private static final Module f21296a = C70027b.m268604a(false, false, C7900b.INSTANCE, 3, null);

    /* renamed from: a */
    public static final Module m31641a() {
        return f21296a;
    }

    /* renamed from: a */
    public static final Module m31642a(C10917c cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "serviceContext");
        return C70027b.m268604a(false, false, new C7898a(cVar), 3, null);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lorg/koin/core/module/Module;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.integrator.b.c$a */
    public static final class C7898a extends Lambda implements Function1<Module, Unit> {
        final /* synthetic */ C10917c $serviceContext;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C7898a(C10917c cVar) {
            super(1);
            this.$serviceContext = cVar;
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
            Options a2 = Module.m268650a(aVar, false, false, 2, null);
            List emptyList = CollectionsKt.emptyList();
            KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(AbstractC7935a.class);
            ScopeDefinition.m268731a(a, new BeanDefinition(a, orCreateKotlinClass, null, new Function2<Scope, DefinitionParameters, C7875a>(this) {
                /* class com.bytedance.ee.bear.integrator.p400b.C7897c.C7898a.C78991 */
                final /* synthetic */ C7898a this$0;

                {
                    this.this$0 = r1;
                }

                public final C7875a invoke(Scope aVar, DefinitionParameters aVar2) {
                    Intrinsics.checkParameterIsNotNull(aVar, "$receiver");
                    Intrinsics.checkParameterIsNotNull(aVar2, "it");
                    return new C7875a(this.this$0.$serviceContext);
                }
            }, Kind.Factory, emptyList, a2, null, null, 384, null), false, 2, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lorg/koin/core/module/Module;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.integrator.b.c$b */
    static final class C7900b extends Lambda implements Function1<Module, Unit> {
        public static final C7900b INSTANCE = new C7900b();

        C7900b() {
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
            BeanDefinition aVar3 = new BeanDefinition(a, Reflection.getOrCreateKotlinClass(AbstractC4948i.class), aVar2, C79011.INSTANCE, Kind.Factory, CollectionsKt.emptyList(), a2, null, null, 384, null);
            ScopeDefinition.m268731a(a, aVar3, false, 2, null);
            C70026a.m268602a(aVar3, new KClass[]{Reflection.getOrCreateKotlinClass(AbstractC4948i.class), Reflection.getOrCreateKotlinClass(AbstractC4936n.class)});
            C79022 r11 = C79022.INSTANCE;
            Definitions dVar2 = Definitions.f175040a;
            ScopeDefinition a3 = aVar.mo246637a();
            ScopeDefinition.m268731a(a3, new BeanDefinition(a3, Reflection.getOrCreateKotlinClass(WikiPluginsProvider.class), aVar2, r11, Kind.Factory, CollectionsKt.emptyList(), Module.m268650a(aVar, false, false, 2, null), null, null, 384, null), false, 2, null);
            C79033 r112 = C79033.INSTANCE;
            Definitions dVar3 = Definitions.f175040a;
            ScopeDefinition a4 = aVar.mo246637a();
            ScopeDefinition.m268731a(a4, new BeanDefinition(a4, Reflection.getOrCreateKotlinClass(AbstractC11921a.class), aVar2, r112, Kind.Factory, CollectionsKt.emptyList(), Module.m268650a(aVar, false, false, 2, null), null, null, 384, null), false, 2, null);
            C79044 r113 = C79044.INSTANCE;
            Definitions dVar4 = Definitions.f175040a;
            ScopeDefinition a5 = aVar.mo246637a();
            ScopeDefinition.m268731a(a5, new BeanDefinition(a5, Reflection.getOrCreateKotlinClass(AbstractC12208a.class), aVar2, r113, Kind.Factory, CollectionsKt.emptyList(), Module.m268650a(aVar, false, false, 2, null), null, null, 384, null), false, 2, null);
            C79055 r114 = C79055.INSTANCE;
            Definitions dVar5 = Definitions.f175040a;
            ScopeDefinition a6 = aVar.mo246637a();
            ScopeDefinition.m268731a(a6, new BeanDefinition(a6, Reflection.getOrCreateKotlinClass(AbstractC10372a.class), aVar2, r114, Kind.Single, CollectionsKt.emptyList(), aVar.mo246636a(false, false), null, null, 384, null), false, 2, null);
            C79066 r115 = C79066.INSTANCE;
            Definitions dVar6 = Definitions.f175040a;
            ScopeDefinition a7 = aVar.mo246637a();
            ScopeDefinition.m268731a(a7, new BeanDefinition(a7, Reflection.getOrCreateKotlinClass(AbstractC9105b.class), aVar2, r115, Kind.Single, CollectionsKt.emptyList(), aVar.mo246636a(false, false), null, null, 384, null), false, 2, null);
            C79077 r116 = C79077.INSTANCE;
            Definitions dVar7 = Definitions.f175040a;
            ScopeDefinition a8 = aVar.mo246637a();
            ScopeDefinition.m268731a(a8, new BeanDefinition(a8, Reflection.getOrCreateKotlinClass(NetService.class), aVar2, r116, Kind.Single, CollectionsKt.emptyList(), aVar.mo246636a(false, false), null, null, 384, null), false, 2, null);
            C79088 r117 = C79088.INSTANCE;
            Definitions dVar8 = Definitions.f175040a;
            ScopeDefinition a9 = aVar.mo246637a();
            ScopeDefinition.m268731a(a9, new BeanDefinition(a9, Reflection.getOrCreateKotlinClass(AbstractC10740f.class), aVar2, r117, Kind.Single, CollectionsKt.emptyList(), aVar.mo246636a(false, false), null, null, 384, null), false, 2, null);
            C79099 r118 = C79099.INSTANCE;
            Definitions dVar9 = Definitions.f175040a;
            ScopeDefinition a10 = aVar.mo246637a();
            ScopeDefinition.m268731a(a10, new BeanDefinition(a10, Reflection.getOrCreateKotlinClass(AbstractC6307e.class), aVar2, r118, Kind.Single, CollectionsKt.emptyList(), aVar.mo246636a(false, false), null, null, 384, null), false, 2, null);
        }
    }
}
