package com.larksuite.component.universe_design.animation;

import android.view.animation.LinearInterpolator;
import android.view.animation.PathInterpolator;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/larksuite/component/universe_design/animation/UDAnimation;", "", "()V", "Interpolator", "universe-ui-tab_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.component.universe_design.a.a */
public final class UDAnimation {

    /* renamed from: a */
    public static final UDAnimation f63015a = new UDAnimation();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R!\u0010\u0003\u001a\u00020\u00048FX\u0002¢\u0006\u0012\n\u0004\b\b\u0010\t\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007R!\u0010\n\u001a\u00020\u000b8FX\u0002¢\u0006\u0012\n\u0004\b\u000f\u0010\t\u0012\u0004\b\f\u0010\u0002\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/larksuite/component/universe_design/animation/UDAnimation$Interpolator;", "", "()V", "linear", "Landroid/view/animation/LinearInterpolator;", "linear$annotations", "getLinear", "()Landroid/view/animation/LinearInterpolator;", "linear$delegate", "Lkotlin/Lazy;", "standard", "Landroid/view/animation/PathInterpolator;", "standard$annotations", "getStandard", "()Landroid/view/animation/PathInterpolator;", "standard$delegate", "universe-ui-tab_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.universe_design.a.a$a */
    public static final class Interpolator {

        /* renamed from: a */
        public static final Interpolator f63016a = new Interpolator();

        /* renamed from: b */
        private static final Lazy f63017b = LazyKt.lazy(C25708a.INSTANCE);

        /* renamed from: c */
        private static final Lazy f63018c = LazyKt.lazy(C25709b.INSTANCE);

        /* renamed from: a */
        public static final PathInterpolator m92368a() {
            return (PathInterpolator) f63018c.getValue();
        }

        private Interpolator() {
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/view/animation/LinearInterpolator;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.larksuite.component.universe_design.a.a$a$a */
        static final class C25708a extends Lambda implements Function0<LinearInterpolator> {
            public static final C25708a INSTANCE = new C25708a();

            C25708a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final LinearInterpolator invoke() {
                return new LinearInterpolator();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/view/animation/PathInterpolator;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.larksuite.component.universe_design.a.a$a$b */
        static final class C25709b extends Lambda implements Function0<PathInterpolator> {
            public static final C25709b INSTANCE = new C25709b();

            C25709b() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final PathInterpolator invoke() {
                return new PathInterpolator(0.34f, 0.69f, 0.1f, 1.0f);
            }
        }
    }

    private UDAnimation() {
    }
}
