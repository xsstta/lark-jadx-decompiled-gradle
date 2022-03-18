package com.bytedance.ee.bear.rn;

import com.bytedance.ee.bear.rn.RnPushProtocol;
import com.bytedance.ee.bear.rn.handler.RnMessageHandler;
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
import org.koin.core.module.Module;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.ScopeDefinition;
import org.koin.p3512a.C70027b;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0011\u0010\u0000\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"RnDIModule", "Lorg/koin/core/module/Module;", "getRnDIModule", "()Lorg/koin/core/module/Module;", "rn-bridge-impl_release"}, mo238835k = 2, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.rn.g */
public final class C10640g {

    /* renamed from: a */
    private static final Module f28558a = C70027b.m268604a(false, false, C10641a.INSTANCE, 3, null);

    /* renamed from: a */
    public static final Module m44230a() {
        return f28558a;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lorg/koin/core/module/Module;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.rn.g$a */
    static final class C10641a extends Lambda implements Function1<Module, Unit> {
        public static final C10641a INSTANCE = new C10641a();

        C10641a() {
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
            RnPushProtocol.VersionQualifier versionQualifier = RnPushProtocol.VersionQualifier.Specify;
            C106421 r6 = C106421.INSTANCE;
            Definitions dVar = Definitions.f175040a;
            ScopeDefinition a = aVar.mo246637a();
            ScopeDefinition.m268731a(a, new BeanDefinition(a, Reflection.getOrCreateKotlinClass(RnPushProtocol.class), versionQualifier, r6, Kind.Factory, CollectionsKt.emptyList(), Module.m268650a(aVar, false, false, 2, null), null, null, 384, null), false, 2, null);
            RnPushProtocol.VersionQualifier versionQualifier2 = RnPushProtocol.VersionQualifier.Default;
            C106443 r22 = C106443.INSTANCE;
            Definitions dVar2 = Definitions.f175040a;
            ScopeDefinition a2 = aVar.mo246637a();
            ScopeDefinition.m268731a(a2, new BeanDefinition(a2, Reflection.getOrCreateKotlinClass(RnPushProtocol.class), versionQualifier2, r22, Kind.Factory, CollectionsKt.emptyList(), Module.m268650a(aVar, false, false, 2, null), null, null, 384, null), false, 2, null);
            C106454 r222 = C106454.INSTANCE;
            Qualifier aVar2 = null;
            Definitions dVar3 = Definitions.f175040a;
            ScopeDefinition a3 = aVar.mo246637a();
            ScopeDefinition.m268731a(a3, new BeanDefinition(a3, Reflection.getOrCreateKotlinClass(AbstractC10636d.class), aVar2, r222, Kind.Factory, CollectionsKt.emptyList(), Module.m268650a(aVar, false, false, 2, null), null, null, 384, null), false, 2, null);
            C106465 r27 = C106465.INSTANCE;
            Definitions dVar4 = Definitions.f175040a;
            ScopeDefinition a4 = aVar.mo246637a();
            ScopeDefinition.m268731a(a4, new BeanDefinition(a4, Reflection.getOrCreateKotlinClass(RnVersionProtocol.class), aVar2, r27, Kind.Factory, CollectionsKt.emptyList(), Module.m268650a(aVar, false, false, 2, null), null, null, 384, null), false, 2, null);
            C106476 r272 = C106476.INSTANCE;
            Definitions dVar5 = Definitions.f175040a;
            ScopeDefinition a5 = aVar.mo246637a();
            ScopeDefinition.m268731a(a5, new BeanDefinition(a5, Reflection.getOrCreateKotlinClass(RnManager.class), aVar2, r272, Kind.Single, CollectionsKt.emptyList(), aVar.mo246636a(false, false), null, null, 384, null), false, 2, null);
            C106487 r273 = C106487.INSTANCE;
            Definitions dVar6 = Definitions.f175040a;
            ScopeDefinition a6 = aVar.mo246637a();
            ScopeDefinition.m268731a(a6, new BeanDefinition(a6, Reflection.getOrCreateKotlinClass(RnBaseProtocol.class), aVar2, r273, Kind.Factory, CollectionsKt.emptyList(), Module.m268650a(aVar, false, false, 2, null), null, null, 384, null), false, 2, null);
            C106498 r274 = C106498.INSTANCE;
            Definitions dVar7 = Definitions.f175040a;
            ScopeDefinition a7 = aVar.mo246637a();
            ScopeDefinition.m268731a(a7, new BeanDefinition(a7, Reflection.getOrCreateKotlinClass(RnCommentProtocol.class), aVar2, r274, Kind.Factory, CollectionsKt.emptyList(), Module.m268650a(aVar, false, false, 2, null), null, null, 384, null), false, 2, null);
            C106509 r275 = C106509.INSTANCE;
            Definitions dVar8 = Definitions.f175040a;
            ScopeDefinition a8 = aVar.mo246637a();
            ScopeDefinition.m268731a(a8, new BeanDefinition(a8, Reflection.getOrCreateKotlinClass(RnReactionProtocol.class), aVar2, r275, Kind.Factory, CollectionsKt.emptyList(), Module.m268650a(aVar, false, false, 2, null), null, null, 384, null), false, 2, null);
            AnonymousClass10 r276 = AnonymousClass10.INSTANCE;
            Definitions dVar9 = Definitions.f175040a;
            ScopeDefinition a9 = aVar.mo246637a();
            ScopeDefinition.m268731a(a9, new BeanDefinition(a9, Reflection.getOrCreateKotlinClass(RnMessageHandler.class), aVar2, r276, Kind.Single, CollectionsKt.emptyList(), aVar.mo246636a(false, false), null, null, 384, null), false, 2, null);
            C106432 r277 = C106432.INSTANCE;
            Definitions dVar10 = Definitions.f175040a;
            ScopeDefinition a10 = aVar.mo246637a();
            ScopeDefinition.m268731a(a10, new BeanDefinition(a10, Reflection.getOrCreateKotlinClass(AbstractC10638e.class), aVar2, r277, Kind.Factory, CollectionsKt.emptyList(), Module.m268650a(aVar, false, false, 2, null), null, null, 384, null), false, 2, null);
        }
    }
}
