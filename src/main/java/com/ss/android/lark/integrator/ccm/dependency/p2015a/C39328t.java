package com.ss.android.lark.integrator.ccm.dependency.p2015a;

import com.bytedance.ee.bear.abtest.service.AbstractC4156b;
import com.bytedance.ee.bear.banner.p249d.AbstractC4338a;
import com.bytedance.ee.bear.basesdk.AbstractC4483f;
import com.bytedance.ee.bear.basesdk.apisupport.AbstractC4432r;
import com.bytedance.ee.bear.basesdk.p253d.AbstractC4470b;
import com.bytedance.ee.bear.basesdk.p253d.AbstractC4471c;
import com.bytedance.ee.bear.basesdk.p253d.AbstractC4473d;
import com.bytedance.ee.bear.basesdk.p253d.AbstractC4474e;
import com.bytedance.ee.bear.basesdk.services.C4503d;
import com.bytedance.ee.bear.basesdk.services.C4508f;
import com.bytedance.ee.bear.contract.AbstractC5080aa;
import com.bytedance.ee.bear.contract.p277a.AbstractC5079a;
import com.bytedance.ee.bear.contract.p278b.AbstractC5115a;
import com.bytedance.ee.bear.contract.p279c.AbstractC5118a;
import com.bytedance.ee.bear.contract.p280d.AbstractC5125a;
import com.bytedance.ee.bear.contract.p284h.AbstractC5176a;
import com.bytedance.ee.bear.doc.resupdate.AbstractC5470j;
import com.bytedance.ee.bear.document.titlebar.AbstractC6196a;
import com.bytedance.ee.bear.lark.p414b.AbstractC7988a;
import com.bytedance.ee.bear.lark.p414b.AbstractC7989b;
import com.bytedance.ee.bear.lark.p414b.AbstractC7990c;
import com.bytedance.ee.bear.lark.p414b.AbstractC7991d;
import com.bytedance.ee.bear.lark.p414b.AbstractC7992e;
import com.bytedance.ee.bear.lark.p414b.AbstractC7993f;
import com.bytedance.ee.bear.lark.p414b.AbstractC7994g;
import com.bytedance.ee.bear.lark.p414b.AbstractC7995h;
import com.bytedance.ee.bear.lark.p414b.AbstractC7996i;
import com.bytedance.ee.bear.lark.p414b.AbstractC8000k;
import com.bytedance.ee.bear.lark.p414b.AbstractC8001l;
import com.bytedance.ee.bear.lark.p414b.AbstractC8002m;
import com.bytedance.ee.bear.lark.p414b.AbstractC8004n;
import com.bytedance.ee.bear.lark.p414b.AbstractC8005o;
import com.bytedance.ee.bear.lark.p414b.AbstractC8007p;
import com.bytedance.ee.bear.lark.p414b.AbstractC8008q;
import com.bytedance.ee.bear.lark.p414b.AbstractC8009r;
import com.bytedance.ee.bear.lark.p414b.AbstractC8010s;
import com.bytedance.ee.bear.list.AbstractC8454g;
import com.bytedance.ee.bear.lynx.impl.LynxHostService;
import com.bytedance.ee.bear.middleground.permission.callback.ISelectContactCallback;
import com.bytedance.ee.bear.middleground.permission.p484d.AbstractC9901d;
import com.bytedance.ee.bear.more.p500a.AbstractC10195a;
import com.bytedance.ee.bear.more.p502c.AbstractC10204a;
import com.bytedance.ee.bear.p397h.AbstractC7826d;
import com.bytedance.ee.bear.search.AbstractC10819d;
import com.larksuite.component.blockit.C24062d;
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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0011\u0010\u0000\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"larkAppKoinModule", "Lorg/koin/core/module/Module;", "getLarkAppKoinModule", "()Lorg/koin/core/module/Module;", "ccm_productionUsRelease"}, mo238835k = 2, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.integrator.ccm.dependency.a.t */
public final class C39328t {

    /* renamed from: a */
    private static final Module f100652a = C70027b.m268604a(false, false, C39329a.INSTANCE, 3, null);

    /* renamed from: a */
    public static final Module m155065a() {
        return f100652a;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lorg/koin/core/module/Module;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.integrator.ccm.dependency.a.t$a */
    static final class C39329a extends Lambda implements Function1<Module, Unit> {
        public static final C39329a INSTANCE = new C39329a();

        C39329a() {
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
            ScopeDefinition.m268731a(a, new BeanDefinition(a, Reflection.getOrCreateKotlinClass(AbstractC7988a.class), aVar2, C393301.INSTANCE, Kind.Factory, CollectionsKt.emptyList(), a2, null, null, 384, null), false, 2, null);
            AnonymousClass12 r11 = AnonymousClass12.INSTANCE;
            Definitions dVar2 = Definitions.f175040a;
            ScopeDefinition a3 = aVar.mo246637a();
            ScopeDefinition.m268731a(a3, new BeanDefinition(a3, Reflection.getOrCreateKotlinClass(AbstractC8010s.class), aVar2, r11, Kind.Factory, CollectionsKt.emptyList(), Module.m268650a(aVar, false, false, 2, null), null, null, 384, null), false, 2, null);
            AnonymousClass23 r112 = AnonymousClass23.INSTANCE;
            Definitions dVar3 = Definitions.f175040a;
            ScopeDefinition a4 = aVar.mo246637a();
            ScopeDefinition.m268731a(a4, new BeanDefinition(a4, Reflection.getOrCreateKotlinClass(AbstractC8001l.class), aVar2, r112, Kind.Factory, CollectionsKt.emptyList(), Module.m268650a(aVar, false, false, 2, null), null, null, 384, null), false, 2, null);
            AnonymousClass34 r113 = AnonymousClass34.INSTANCE;
            Definitions dVar4 = Definitions.f175040a;
            ScopeDefinition a5 = aVar.mo246637a();
            ScopeDefinition.m268731a(a5, new BeanDefinition(a5, Reflection.getOrCreateKotlinClass(AbstractC7990c.class), aVar2, r113, Kind.Factory, CollectionsKt.emptyList(), Module.m268650a(aVar, false, false, 2, null), null, null, 384, null), false, 2, null);
            AnonymousClass41 r114 = AnonymousClass41.INSTANCE;
            Definitions dVar5 = Definitions.f175040a;
            ScopeDefinition a6 = aVar.mo246637a();
            ScopeDefinition.m268731a(a6, new BeanDefinition(a6, Reflection.getOrCreateKotlinClass(AbstractC8009r.class), aVar2, r114, Kind.Factory, CollectionsKt.emptyList(), Module.m268650a(aVar, false, false, 2, null), null, null, 384, null), false, 2, null);
            AnonymousClass42 r115 = AnonymousClass42.INSTANCE;
            Definitions dVar6 = Definitions.f175040a;
            ScopeDefinition a7 = aVar.mo246637a();
            ScopeDefinition.m268731a(a7, new BeanDefinition(a7, Reflection.getOrCreateKotlinClass(AbstractC7994g.class), aVar2, r115, Kind.Factory, CollectionsKt.emptyList(), Module.m268650a(aVar, false, false, 2, null), null, null, 384, null), false, 2, null);
            AnonymousClass43 r116 = AnonymousClass43.INSTANCE;
            Definitions dVar7 = Definitions.f175040a;
            ScopeDefinition a8 = aVar.mo246637a();
            ScopeDefinition.m268731a(a8, new BeanDefinition(a8, Reflection.getOrCreateKotlinClass(AbstractC7989b.class), aVar2, r116, Kind.Factory, CollectionsKt.emptyList(), Module.m268650a(aVar, false, false, 2, null), null, null, 384, null), false, 2, null);
            AnonymousClass44 r117 = AnonymousClass44.INSTANCE;
            Definitions dVar8 = Definitions.f175040a;
            ScopeDefinition a9 = aVar.mo246637a();
            ScopeDefinition.m268731a(a9, new BeanDefinition(a9, Reflection.getOrCreateKotlinClass(AbstractC7993f.class), aVar2, r117, Kind.Factory, CollectionsKt.emptyList(), Module.m268650a(aVar, false, false, 2, null), null, null, 384, null), false, 2, null);
            AnonymousClass45 r118 = AnonymousClass45.INSTANCE;
            Definitions dVar9 = Definitions.f175040a;
            ScopeDefinition a10 = aVar.mo246637a();
            ScopeDefinition.m268731a(a10, new BeanDefinition(a10, Reflection.getOrCreateKotlinClass(AbstractC8000k.class), aVar2, r118, Kind.Factory, CollectionsKt.emptyList(), Module.m268650a(aVar, false, false, 2, null), null, null, 384, null), false, 2, null);
            C393312 r119 = C393312.INSTANCE;
            Definitions dVar10 = Definitions.f175040a;
            ScopeDefinition a11 = aVar.mo246637a();
            ScopeDefinition.m268731a(a11, new BeanDefinition(a11, Reflection.getOrCreateKotlinClass(AbstractC8007p.class), aVar2, r119, Kind.Factory, CollectionsKt.emptyList(), Module.m268650a(aVar, false, false, 2, null), null, null, 384, null), false, 2, null);
            C393323 r1110 = C393323.INSTANCE;
            Definitions dVar11 = Definitions.f175040a;
            ScopeDefinition a12 = aVar.mo246637a();
            ScopeDefinition.m268731a(a12, new BeanDefinition(a12, Reflection.getOrCreateKotlinClass(AbstractC7996i.class), aVar2, r1110, Kind.Factory, CollectionsKt.emptyList(), Module.m268650a(aVar, false, false, 2, null), null, null, 384, null), false, 2, null);
            C393334 r1111 = C393334.INSTANCE;
            Definitions dVar12 = Definitions.f175040a;
            ScopeDefinition a13 = aVar.mo246637a();
            ScopeDefinition.m268731a(a13, new BeanDefinition(a13, Reflection.getOrCreateKotlinClass(AbstractC7991d.class), aVar2, r1111, Kind.Factory, CollectionsKt.emptyList(), Module.m268650a(aVar, false, false, 2, null), null, null, 384, null), false, 2, null);
            C393345 r1112 = C393345.INSTANCE;
            Definitions dVar13 = Definitions.f175040a;
            ScopeDefinition a14 = aVar.mo246637a();
            ScopeDefinition.m268731a(a14, new BeanDefinition(a14, Reflection.getOrCreateKotlinClass(AbstractC8004n.class), aVar2, r1112, Kind.Factory, CollectionsKt.emptyList(), Module.m268650a(aVar, false, false, 2, null), null, null, 384, null), false, 2, null);
            C393356 r1113 = C393356.INSTANCE;
            Definitions dVar14 = Definitions.f175040a;
            ScopeDefinition a15 = aVar.mo246637a();
            ScopeDefinition.m268731a(a15, new BeanDefinition(a15, Reflection.getOrCreateKotlinClass(AbstractC7995h.class), aVar2, r1113, Kind.Factory, CollectionsKt.emptyList(), Module.m268650a(aVar, false, false, 2, null), null, null, 384, null), false, 2, null);
            C393367 r1114 = C393367.INSTANCE;
            Definitions dVar15 = Definitions.f175040a;
            ScopeDefinition a16 = aVar.mo246637a();
            ScopeDefinition.m268731a(a16, new BeanDefinition(a16, Reflection.getOrCreateKotlinClass(AbstractC5079a.class), aVar2, r1114, Kind.Factory, CollectionsKt.emptyList(), Module.m268650a(aVar, false, false, 2, null), null, null, 384, null), false, 2, null);
            C393378 r1115 = C393378.INSTANCE;
            Definitions dVar16 = Definitions.f175040a;
            ScopeDefinition a17 = aVar.mo246637a();
            ScopeDefinition.m268731a(a17, new BeanDefinition(a17, Reflection.getOrCreateKotlinClass(AbstractC4470b.class), aVar2, r1115, Kind.Factory, CollectionsKt.emptyList(), Module.m268650a(aVar, false, false, 2, null), null, null, 384, null), false, 2, null);
            C393389 r1116 = C393389.INSTANCE;
            Definitions dVar17 = Definitions.f175040a;
            ScopeDefinition a18 = aVar.mo246637a();
            ScopeDefinition.m268731a(a18, new BeanDefinition(a18, Reflection.getOrCreateKotlinClass(AbstractC5080aa.AbstractC5081a.class), aVar2, r1116, Kind.Factory, CollectionsKt.emptyList(), Module.m268650a(aVar, false, false, 2, null), null, null, 384, null), false, 2, null);
            AnonymousClass10 r1117 = AnonymousClass10.INSTANCE;
            Definitions dVar18 = Definitions.f175040a;
            ScopeDefinition a19 = aVar.mo246637a();
            ScopeDefinition.m268731a(a19, new BeanDefinition(a19, Reflection.getOrCreateKotlinClass(AbstractC4338a.class), aVar2, r1117, Kind.Factory, CollectionsKt.emptyList(), Module.m268650a(aVar, false, false, 2, null), null, null, 384, null), false, 2, null);
            AnonymousClass11 r1118 = AnonymousClass11.INSTANCE;
            Definitions dVar19 = Definitions.f175040a;
            ScopeDefinition a20 = aVar.mo246637a();
            ScopeDefinition.m268731a(a20, new BeanDefinition(a20, Reflection.getOrCreateKotlinClass(AbstractC10195a.class), aVar2, r1118, Kind.Factory, CollectionsKt.emptyList(), Module.m268650a(aVar, false, false, 2, null), null, null, 384, null), false, 2, null);
            AnonymousClass13 r1119 = AnonymousClass13.INSTANCE;
            Definitions dVar20 = Definitions.f175040a;
            ScopeDefinition a21 = aVar.mo246637a();
            ScopeDefinition.m268731a(a21, new BeanDefinition(a21, Reflection.getOrCreateKotlinClass(C4508f.AbstractC4509a.class), aVar2, r1119, Kind.Factory, CollectionsKt.emptyList(), Module.m268650a(aVar, false, false, 2, null), null, null, 384, null), false, 2, null);
            AnonymousClass14 r1120 = AnonymousClass14.INSTANCE;
            Definitions dVar21 = Definitions.f175040a;
            ScopeDefinition a22 = aVar.mo246637a();
            ScopeDefinition.m268731a(a22, new BeanDefinition(a22, Reflection.getOrCreateKotlinClass(AbstractC7826d.class), aVar2, r1120, Kind.Factory, CollectionsKt.emptyList(), Module.m268650a(aVar, false, false, 2, null), null, null, 384, null), false, 2, null);
            AnonymousClass15 r1121 = AnonymousClass15.INSTANCE;
            Definitions dVar22 = Definitions.f175040a;
            ScopeDefinition a23 = aVar.mo246637a();
            ScopeDefinition.m268731a(a23, new BeanDefinition(a23, Reflection.getOrCreateKotlinClass(AbstractC4473d.class), aVar2, r1121, Kind.Factory, CollectionsKt.emptyList(), Module.m268650a(aVar, false, false, 2, null), null, null, 384, null), false, 2, null);
            AnonymousClass16 r1122 = AnonymousClass16.INSTANCE;
            Definitions dVar23 = Definitions.f175040a;
            ScopeDefinition a24 = aVar.mo246637a();
            ScopeDefinition.m268731a(a24, new BeanDefinition(a24, Reflection.getOrCreateKotlinClass(AbstractC4483f.class), aVar2, r1122, Kind.Factory, CollectionsKt.emptyList(), Module.m268650a(aVar, false, false, 2, null), null, null, 384, null), false, 2, null);
            AnonymousClass17 r1123 = AnonymousClass17.INSTANCE;
            Definitions dVar24 = Definitions.f175040a;
            ScopeDefinition a25 = aVar.mo246637a();
            ScopeDefinition.m268731a(a25, new BeanDefinition(a25, Reflection.getOrCreateKotlinClass(AbstractC5115a.class), aVar2, r1123, Kind.Factory, CollectionsKt.emptyList(), Module.m268650a(aVar, false, false, 2, null), null, null, 384, null), false, 2, null);
            AnonymousClass18 r1124 = AnonymousClass18.INSTANCE;
            Definitions dVar25 = Definitions.f175040a;
            ScopeDefinition a26 = aVar.mo246637a();
            ScopeDefinition.m268731a(a26, new BeanDefinition(a26, Reflection.getOrCreateKotlinClass(AbstractC8454g.class), aVar2, r1124, Kind.Factory, CollectionsKt.emptyList(), Module.m268650a(aVar, false, false, 2, null), null, null, 384, null), false, 2, null);
            AnonymousClass19 r1125 = AnonymousClass19.INSTANCE;
            Definitions dVar26 = Definitions.f175040a;
            ScopeDefinition a27 = aVar.mo246637a();
            ScopeDefinition.m268731a(a27, new BeanDefinition(a27, Reflection.getOrCreateKotlinClass(AbstractC5118a.class), aVar2, r1125, Kind.Factory, CollectionsKt.emptyList(), Module.m268650a(aVar, false, false, 2, null), null, null, 384, null), false, 2, null);
            AnonymousClass20 r1126 = AnonymousClass20.INSTANCE;
            Definitions dVar27 = Definitions.f175040a;
            ScopeDefinition a28 = aVar.mo246637a();
            ScopeDefinition.m268731a(a28, new BeanDefinition(a28, Reflection.getOrCreateKotlinClass(C4503d.AbstractC4505a.class), aVar2, r1126, Kind.Factory, CollectionsKt.emptyList(), Module.m268650a(aVar, false, false, 2, null), null, null, 384, null), false, 2, null);
            AnonymousClass21 r1127 = AnonymousClass21.INSTANCE;
            Definitions dVar28 = Definitions.f175040a;
            ScopeDefinition a29 = aVar.mo246637a();
            ScopeDefinition.m268731a(a29, new BeanDefinition(a29, Reflection.getOrCreateKotlinClass(AbstractC5125a.class), aVar2, r1127, Kind.Factory, CollectionsKt.emptyList(), Module.m268650a(aVar, false, false, 2, null), null, null, 384, null), false, 2, null);
            AnonymousClass22 r1128 = AnonymousClass22.INSTANCE;
            Definitions dVar29 = Definitions.f175040a;
            ScopeDefinition a30 = aVar.mo246637a();
            ScopeDefinition.m268731a(a30, new BeanDefinition(a30, Reflection.getOrCreateKotlinClass(AbstractC4432r.class), aVar2, r1128, Kind.Factory, CollectionsKt.emptyList(), Module.m268650a(aVar, false, false, 2, null), null, null, 384, null), false, 2, null);
            AnonymousClass24 r1129 = AnonymousClass24.INSTANCE;
            Definitions dVar30 = Definitions.f175040a;
            ScopeDefinition a31 = aVar.mo246637a();
            ScopeDefinition.m268731a(a31, new BeanDefinition(a31, Reflection.getOrCreateKotlinClass(AbstractC4474e.class), aVar2, r1129, Kind.Factory, CollectionsKt.emptyList(), Module.m268650a(aVar, false, false, 2, null), null, null, 384, null), false, 2, null);
            AnonymousClass25 r1130 = AnonymousClass25.INSTANCE;
            Definitions dVar31 = Definitions.f175040a;
            ScopeDefinition a32 = aVar.mo246637a();
            ScopeDefinition.m268731a(a32, new BeanDefinition(a32, Reflection.getOrCreateKotlinClass(ISelectContactCallback.class), aVar2, r1130, Kind.Factory, CollectionsKt.emptyList(), Module.m268650a(aVar, false, false, 2, null), null, null, 384, null), false, 2, null);
            AnonymousClass26 r1131 = AnonymousClass26.INSTANCE;
            Definitions dVar32 = Definitions.f175040a;
            ScopeDefinition a33 = aVar.mo246637a();
            ScopeDefinition.m268731a(a33, new BeanDefinition(a33, Reflection.getOrCreateKotlinClass(AbstractC10819d.class), aVar2, r1131, Kind.Factory, CollectionsKt.emptyList(), Module.m268650a(aVar, false, false, 2, null), null, null, 384, null), false, 2, null);
            AnonymousClass27 r1132 = AnonymousClass27.INSTANCE;
            Definitions dVar33 = Definitions.f175040a;
            ScopeDefinition a34 = aVar.mo246637a();
            ScopeDefinition.m268731a(a34, new BeanDefinition(a34, Reflection.getOrCreateKotlinClass(AbstractC10204a.class), aVar2, r1132, Kind.Factory, CollectionsKt.emptyList(), Module.m268650a(aVar, false, false, 2, null), null, null, 384, null), false, 2, null);
            AnonymousClass28 r1133 = AnonymousClass28.INSTANCE;
            Definitions dVar34 = Definitions.f175040a;
            ScopeDefinition a35 = aVar.mo246637a();
            ScopeDefinition.m268731a(a35, new BeanDefinition(a35, Reflection.getOrCreateKotlinClass(AbstractC5176a.class), aVar2, r1133, Kind.Factory, CollectionsKt.emptyList(), Module.m268650a(aVar, false, false, 2, null), null, null, 384, null), false, 2, null);
            AnonymousClass29 r1134 = AnonymousClass29.INSTANCE;
            Definitions dVar35 = Definitions.f175040a;
            ScopeDefinition a36 = aVar.mo246637a();
            ScopeDefinition.m268731a(a36, new BeanDefinition(a36, Reflection.getOrCreateKotlinClass(AbstractC9901d.class), aVar2, r1134, Kind.Factory, CollectionsKt.emptyList(), Module.m268650a(aVar, false, false, 2, null), null, null, 384, null), false, 2, null);
            AnonymousClass30 r1135 = AnonymousClass30.INSTANCE;
            Definitions dVar36 = Definitions.f175040a;
            ScopeDefinition a37 = aVar.mo246637a();
            ScopeDefinition.m268731a(a37, new BeanDefinition(a37, Reflection.getOrCreateKotlinClass(AbstractC4156b.AbstractC4157a.class), aVar2, r1135, Kind.Factory, CollectionsKt.emptyList(), Module.m268650a(aVar, false, false, 2, null), null, null, 384, null), false, 2, null);
            AnonymousClass31 r1136 = AnonymousClass31.INSTANCE;
            Definitions dVar37 = Definitions.f175040a;
            ScopeDefinition a38 = aVar.mo246637a();
            ScopeDefinition.m268731a(a38, new BeanDefinition(a38, Reflection.getOrCreateKotlinClass(C24062d.class), aVar2, r1136, Kind.Factory, CollectionsKt.emptyList(), Module.m268650a(aVar, false, false, 2, null), null, null, 384, null), false, 2, null);
            AnonymousClass32 r1137 = AnonymousClass32.INSTANCE;
            Definitions dVar38 = Definitions.f175040a;
            ScopeDefinition a39 = aVar.mo246637a();
            ScopeDefinition.m268731a(a39, new BeanDefinition(a39, Reflection.getOrCreateKotlinClass(AbstractC4471c.class), aVar2, r1137, Kind.Factory, CollectionsKt.emptyList(), Module.m268650a(aVar, false, false, 2, null), null, null, 384, null), false, 2, null);
            AnonymousClass33 r1138 = AnonymousClass33.INSTANCE;
            Definitions dVar39 = Definitions.f175040a;
            ScopeDefinition a40 = aVar.mo246637a();
            ScopeDefinition.m268731a(a40, new BeanDefinition(a40, Reflection.getOrCreateKotlinClass(AbstractC6196a.class), aVar2, r1138, Kind.Factory, CollectionsKt.emptyList(), Module.m268650a(aVar, false, false, 2, null), null, null, 384, null), false, 2, null);
            AnonymousClass35 r1139 = AnonymousClass35.INSTANCE;
            Definitions dVar40 = Definitions.f175040a;
            ScopeDefinition a41 = aVar.mo246637a();
            ScopeDefinition.m268731a(a41, new BeanDefinition(a41, Reflection.getOrCreateKotlinClass(AbstractC5470j.class), aVar2, r1139, Kind.Factory, CollectionsKt.emptyList(), Module.m268650a(aVar, false, false, 2, null), null, null, 384, null), false, 2, null);
            AnonymousClass36 r1140 = AnonymousClass36.INSTANCE;
            Definitions dVar41 = Definitions.f175040a;
            ScopeDefinition a42 = aVar.mo246637a();
            ScopeDefinition.m268731a(a42, new BeanDefinition(a42, Reflection.getOrCreateKotlinClass(AbstractC7992e.class), aVar2, r1140, Kind.Factory, CollectionsKt.emptyList(), Module.m268650a(aVar, false, false, 2, null), null, null, 384, null), false, 2, null);
            AnonymousClass37 r1141 = AnonymousClass37.INSTANCE;
            Definitions dVar42 = Definitions.f175040a;
            ScopeDefinition a43 = aVar.mo246637a();
            ScopeDefinition.m268731a(a43, new BeanDefinition(a43, Reflection.getOrCreateKotlinClass(LynxHostService.class), aVar2, r1141, Kind.Factory, CollectionsKt.emptyList(), Module.m268650a(aVar, false, false, 2, null), null, null, 384, null), false, 2, null);
            AnonymousClass38 r1142 = AnonymousClass38.INSTANCE;
            Definitions dVar43 = Definitions.f175040a;
            ScopeDefinition a44 = aVar.mo246637a();
            ScopeDefinition.m268731a(a44, new BeanDefinition(a44, Reflection.getOrCreateKotlinClass(AbstractC8008q.class), aVar2, r1142, Kind.Single, CollectionsKt.emptyList(), aVar.mo246636a(false, false), null, null, 384, null), false, 2, null);
            AnonymousClass39 r1143 = AnonymousClass39.INSTANCE;
            Definitions dVar44 = Definitions.f175040a;
            ScopeDefinition a45 = aVar.mo246637a();
            ScopeDefinition.m268731a(a45, new BeanDefinition(a45, Reflection.getOrCreateKotlinClass(AbstractC8005o.class), aVar2, r1143, Kind.Factory, CollectionsKt.emptyList(), Module.m268650a(aVar, false, false, 2, null), null, null, 384, null), false, 2, null);
            AnonymousClass40 r1144 = AnonymousClass40.INSTANCE;
            Definitions dVar45 = Definitions.f175040a;
            ScopeDefinition a46 = aVar.mo246637a();
            ScopeDefinition.m268731a(a46, new BeanDefinition(a46, Reflection.getOrCreateKotlinClass(AbstractC8002m.class), aVar2, r1144, Kind.Factory, CollectionsKt.emptyList(), Module.m268650a(aVar, false, false, 2, null), null, null, 384, null), false, 2, null);
        }
    }
}
