package com.ss.android.lark.guide.landing.general.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.Interpolator;
import android.widget.Scroller;
import androidx.viewpager.widget.ViewPager;
import java.lang.reflect.Field;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u0000 \u00072\u00020\u0001:\u0002\u0007\bB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/guide/landing/general/view/DecreaseAutoScrollSpeedViewPager;", "Landroidx/viewpager/widget/ViewPager;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Companion", "FixedSpeedScroller", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
public class DecreaseAutoScrollSpeedViewPager extends ViewPager {

    /* renamed from: a */
    public static final Companion f99328a = new Companion(null);

    /* renamed from: b */
    private static final Interpolator f99329b = animationInterpolatorC38646b.f99330a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "t", "getInterpolation"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.guide.landing.general.view.DecreaseAutoScrollSpeedViewPager$b  reason: invalid class name */
    static final class animationInterpolatorC38646b implements Interpolator {

        /* renamed from: a */
        public static final animationInterpolatorC38646b f99330a = new animationInterpolatorC38646b();

        animationInterpolatorC38646b() {
        }

        public final float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/guide/landing/general/view/DecreaseAutoScrollSpeedViewPager$Companion;", "", "()V", "MAX_SETTLE_DURATION", "", "SET_CURRENT_ITEM_DEFAULT_DURATION", "sInterpolator", "Landroid/view/animation/Interpolator;", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.guide.landing.general.view.DecreaseAutoScrollSpeedViewPager$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J0\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\nH\u0016¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/guide/landing/general/view/DecreaseAutoScrollSpeedViewPager$FixedSpeedScroller;", "Landroid/widget/Scroller;", "context", "Landroid/content/Context;", "interpolator", "Landroid/view/animation/Interpolator;", "(Landroid/content/Context;Landroid/view/animation/Interpolator;)V", "startScroll", "", "startX", "", "startY", "dx", "dy", "duration", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.guide.landing.general.view.DecreaseAutoScrollSpeedViewPager$c */
    public static final class FixedSpeedScroller extends Scroller {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public FixedSpeedScroller(Context context, Interpolator interpolator) {
            super(context, interpolator);
            Intrinsics.checkParameterIsNotNull(context, "context");
        }

        public void startScroll(int i, int i2, int i3, int i4, int i5) {
            int i6;
            if (i5 == 200) {
                i6 = 600;
            } else {
                i6 = i5;
            }
            super.startScroll(i, i2, i3, i4, i6);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DecreaseAutoScrollSpeedViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkParameterIsNotNull(context, "context");
        try {
            Field declaredField = ViewPager.class.getDeclaredField("mScroller");
            Intrinsics.checkExpressionValueIsNotNull(declaredField, "ViewPager::class.java.ge…eclaredField(\"mScroller\")");
            declaredField.setAccessible(true);
            Context context2 = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context2, "getContext()");
            declaredField.set(this, new FixedSpeedScroller(context2, f99329b));
        } catch (IllegalAccessException | IllegalArgumentException | NoSuchFieldException unused) {
        }
    }
}
