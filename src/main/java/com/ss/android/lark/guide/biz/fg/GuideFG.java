package com.ss.android.lark.guide.biz.fg;

import com.ss.android.lark.guide.C38548a;
import com.ss.android.lark.guide.biz.IGuideFG;
import com.ss.android.lark.guide.p1911a.AbstractC38549a;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/guide/biz/fg/GuideFG;", "Lcom/ss/android/lark/guide/biz/IGuideFG;", "()V", "isLarkClientOnBoardingOptEnable", "", "isTenantSwitchGuidanceV3FgEnable", "isUGReachSpotlightFgEnable", "Companion", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.guide.biz.b.a */
public final class GuideFG implements IGuideFG {

    /* renamed from: a */
    public static final Lazy f99143a = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) C38588b.INSTANCE);

    /* renamed from: b */
    public static final Companion f99144b = new Companion(null);

    @JvmStatic
    /* renamed from: d */
    public static final IGuideFG m152181d() {
        return f99144b.mo141341a();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0007R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/guide/biz/fg/GuideFG$Companion;", "", "()V", "instance", "Lcom/ss/android/lark/guide/biz/fg/GuideFG;", "getInstance", "()Lcom/ss/android/lark/guide/biz/fg/GuideFG;", "instance$delegate", "Lkotlin/Lazy;", "inst", "Lcom/ss/android/lark/guide/biz/IGuideFG;", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.guide.biz.b.a$a */
    public static final class Companion {
        /* renamed from: b */
        private final GuideFG m152185b() {
            Lazy lazy = GuideFG.f99143a;
            Companion aVar = GuideFG.f99144b;
            return (GuideFG) lazy.getValue();
        }

        private Companion() {
        }

        @JvmStatic
        /* renamed from: a */
        public final IGuideFG mo141341a() {
            return m152185b();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/guide/biz/fg/GuideFG;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.guide.biz.b.a$b */
    static final class C38588b extends Lambda implements Function0<GuideFG> {
        public static final C38588b INSTANCE = new C38588b();

        C38588b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final GuideFG invoke() {
            return new GuideFG();
        }
    }

    @Override // com.ss.android.lark.guide.biz.IGuideFG
    /* renamed from: a */
    public boolean mo141338a() {
        AbstractC38549a a = C38548a.m152027a();
        Intrinsics.checkExpressionValueIsNotNull(a, "GuideModule.getDependency()");
        return a.mo141259i().mo141269a("lark.client.onboarding.opt");
    }

    @Override // com.ss.android.lark.guide.biz.IGuideFG
    /* renamed from: b */
    public boolean mo141339b() {
        AbstractC38549a a = C38548a.m152027a();
        Intrinsics.checkExpressionValueIsNotNull(a, "GuideModule.getDependency()");
        return a.mo141259i().mo141269a("ug.guide.teamswitch");
    }

    @Override // com.ss.android.lark.guide.biz.IGuideFG
    /* renamed from: c */
    public boolean mo141340c() {
        AbstractC38549a a = C38548a.m152027a();
        Intrinsics.checkExpressionValueIsNotNull(a, "GuideModule.getDependency()");
        return a.mo141259i().mo141269a("lark.ug.reach.spotlight");
    }
}
