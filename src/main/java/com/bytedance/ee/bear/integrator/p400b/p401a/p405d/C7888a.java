package com.bytedance.ee.bear.integrator.p400b.p401a.p405d;

import com.bytedance.ee.bear.document.offline.sync.AbstractC5982a;
import com.bytedance.ee.bear.document.offline.sync.AbstractC5988f;
import com.bytedance.ee.bear.document.offline.sync.AbstractC5997i;
import com.bytedance.ee.bear.document.offline.sync.BitablePreloadStrategy;
import com.bytedance.ee.bear.document.offline.sync.C5987e;
import com.bytedance.ee.bear.document.offline.sync.C5989g;
import com.bytedance.ee.bear.document.offline.sync.C5998j;
import com.bytedance.ee.bear.document.offline.sync.SheetPreloadStrategy;
import com.bytedance.ee.bear.document.offline.sync.SlidePreloadStrategy;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.util.p701d.C13615c;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.KProperty;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.Definitions;
import org.koin.core.definition.Kind;
import org.koin.core.definition.Options;
import org.koin.core.module.Module;
import org.koin.core.scope.ScopeDefinition;
import org.koin.p3512a.C70027b;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0011\u0010\u0000\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"PreloadStrategyDIModule", "Lorg/koin/core/module/Module;", "getPreloadStrategyDIModule", "()Lorg/koin/core/module/Module;", "preloadStrategyImpl", "Lcom/bytedance/ee/bear/document/offline/sync/DocumentPreloadStrategyProvider;", "getPreloadStrategyImpl", "()Lcom/bytedance/ee/bear/document/offline/sync/DocumentPreloadStrategyProvider;", "basesdk_release"}, mo238835k = 2, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.integrator.b.a.d.a */
public final class C7888a {

    /* renamed from: a */
    private static final Module f21287a = C70027b.m268604a(false, false, C7889a.INSTANCE, 3, null);

    /* renamed from: b */
    private static final AbstractC5988f f21288b = new C7891b();

    /* renamed from: a */
    public static final Module m31628a() {
        return f21287a;
    }

    /* renamed from: b */
    public static final AbstractC5988f m31629b() {
        return f21288b;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0014\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\f0\u000bH\u0016R'\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038BX\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\r"}, d2 = {"com/bytedance/ee/bear/integrator/di/configs/preload/PreloadStrategyDIKt$preloadStrategyImpl$1", "Lcom/bytedance/ee/bear/document/offline/sync/DocumentPreloadStrategyProvider;", "mutableMap", "", "", "Lcom/bytedance/ee/bear/document/offline/sync/AbsPreloadStrategy;", "getMutableMap", "()Ljava/util/Map;", "mutableMap$delegate", "Lkotlin/Lazy;", "getPreloadStrategyMap", "", "Lcom/bytedance/ee/bear/document/offline/sync/IPreloadStrategy;", "basesdk_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.integrator.b.a.d.a$b */
    public static final class C7891b implements AbstractC5988f {

        /* renamed from: a */
        static final /* synthetic */ KProperty[] f21289a = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(C7891b.class), "mutableMap", "getMutableMap()Ljava/util/Map;"))};

        /* renamed from: b */
        private final Lazy f21290b = LazyKt.lazy(C7892a.INSTANCE);

        /* renamed from: b */
        private final Map<Integer, AbstractC5982a> m31630b() {
            Lazy lazy = this.f21290b;
            KProperty kProperty = f21289a[0];
            return (Map) lazy.getValue();
        }

        @Override // com.bytedance.ee.bear.document.offline.sync.AbstractC5988f
        /* renamed from: a */
        public Map<Integer, AbstractC5997i> mo24232a() {
            return m31630b();
        }

        C7891b() {
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "", "Lcom/bytedance/ee/bear/document/offline/sync/AbsPreloadStrategy;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.integrator.b.a.d.a$b$a */
        static final class C7892a extends Lambda implements Function0<Map<Integer, AbstractC5982a>> {
            public static final C7892a INSTANCE = new C7892a();

            C7892a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Map<Integer, AbstractC5982a> invoke() {
                C8275a aVar = C8275a.f22371d;
                Intrinsics.checkExpressionValueIsNotNull(aVar, "DocumentType.DOC");
                C8275a aVar2 = C8275a.f22378k;
                Intrinsics.checkExpressionValueIsNotNull(aVar2, "DocumentType.DOCX");
                C8275a aVar3 = C8275a.f22372e;
                Intrinsics.checkExpressionValueIsNotNull(aVar3, "DocumentType.SHEET");
                C8275a aVar4 = C8275a.f22374g;
                Intrinsics.checkExpressionValueIsNotNull(aVar4, "DocumentType.MINDNOTE");
                C8275a aVar5 = C8275a.f22376i;
                Intrinsics.checkExpressionValueIsNotNull(aVar5, "DocumentType.SLIDE");
                C8275a aVar6 = C8275a.f22373f;
                Intrinsics.checkExpressionValueIsNotNull(aVar6, "DocumentType.BITABLE");
                C8275a aVar7 = C8275a.f22377j;
                Intrinsics.checkExpressionValueIsNotNull(aVar7, "DocumentType.WIKI");
                return MapsKt.mutableMapOf(TuplesKt.to(Integer.valueOf(aVar.mo32555b()), new C5987e()), TuplesKt.to(Integer.valueOf(aVar2.mo32555b()), new C5989g()), TuplesKt.to(Integer.valueOf(aVar3.mo32555b()), new SheetPreloadStrategy()), TuplesKt.to(Integer.valueOf(aVar4.mo32555b()), new C5998j()), TuplesKt.to(Integer.valueOf(aVar5.mo32555b()), new SlidePreloadStrategy()), TuplesKt.to(Integer.valueOf(aVar6.mo32555b()), new BitablePreloadStrategy()), TuplesKt.to(Integer.valueOf(aVar7.mo32555b()), new C7893b(C13615c.f35773a)));
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lorg/koin/core/module/Module;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.integrator.b.a.d.a$a */
    static final class C7889a extends Lambda implements Function1<Module, Unit> {
        public static final C7889a INSTANCE = new C7889a();

        C7889a() {
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
            KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(AbstractC5988f.class);
            ScopeDefinition.m268731a(a, new BeanDefinition(a, orCreateKotlinClass, null, C78901.INSTANCE, Kind.Single, emptyList, a2, null, null, 384, null), false, 2, null);
        }
    }
}
