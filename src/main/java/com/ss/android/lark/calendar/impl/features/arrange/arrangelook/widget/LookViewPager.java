package com.ss.android.lark.calendar.impl.features.arrange.arrangelook.widget;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.AttributeSet;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.frameworks.baselib.network.http.cronet.impl.C14002h;
import com.larksuite.framework.utils.UIUtils;
import com.ss.android.lark.calendar.impl.features.arrange.arrangelook.ILookContract;
import com.ss.android.lark.calendar.impl.features.common.widget.infinitepager.InfiniteViewPager;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u0000 $2\u00020\u00012\u00020\u0002:\u0002$%B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005B\u0017\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0010\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u0004H\u0002J\b\u0010\u0019\u001a\u00020\u0015H\u0016J\b\u0010\u001a\u001a\u00020\u0015H\u0016J \u0010\u001b\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u000eH\u0016J(\u0010\u001f\u001a\u00020\u00152\u0006\u0010 \u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\u000eH\u0014R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u00060\fR\u00020\u0000X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/arrange/arrangelook/widget/LookViewPager;", "Lcom/ss/android/lark/calendar/impl/features/common/widget/infinitepager/InfiniteViewPager;", "Lcom/ss/android/lark/calendar/impl/features/arrange/arrangelook/ILookContract$OnEventDrag;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "mDelayHandler", "Landroid/os/Handler;", "mDelayRunnable", "Lcom/ss/android/lark/calendar/impl/features/arrange/arrangelook/widget/LookViewPager$DelayScrollRunnable;", "mEdgeLimtValue", "", "mIsDragging", "", "mLastDelayScroll", "", "mWidth", "delayScroll", "", "runnable", "Ljava/lang/Runnable;", "init", "onEventDragEnd", "onEventDragStart", "onEventHandleDragMove", "index", "screenX", "screenY", "onSizeChanged", "w", C14002h.f36692e, "oldw", "oldh", "Companion", "DelayScrollRunnable", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class LookViewPager extends InfiniteViewPager implements ILookContract.OnEventDrag {

    /* renamed from: b */
    public static final Companion f75322b = new Companion(null);

    /* renamed from: a */
    public boolean f75323a;

    /* renamed from: k */
    private int f75324k;

    /* renamed from: l */
    private int f75325l;

    /* renamed from: m */
    private Handler f75326m;

    /* renamed from: n */
    private long f75327n;

    /* renamed from: o */
    private final DelayScrollRunnable f75328o = new DelayScrollRunnable();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/arrange/arrangelook/widget/LookViewPager$Companion;", "", "()V", "DELAY_50_MILLIS", "", "EDGE_LIMIT_VALUE", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.arrange.arrangelook.widget.LookViewPager$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.CalendarDaysContract.AbstractC30655a
    /* renamed from: a */
    public void mo108701a() {
        this.f75323a = true;
        setPageEnabled(false);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/arrange/arrangelook/widget/LookViewPager$DelayScrollRunnable;", "Ljava/lang/Runnable;", "(Lcom/ss/android/lark/calendar/impl/features/arrange/arrangelook/widget/LookViewPager;)V", "mScrollToItem", "", "run", "", "setScrollItem", "item", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.arrange.arrangelook.widget.LookViewPager$b */
    public final class DelayScrollRunnable implements Runnable {

        /* renamed from: b */
        private int f75330b;

        public void run() {
            LookViewPager.this.setPageEnabled(true);
            LookViewPager.this.setCurrentItem(this.f75330b, true);
        }

        /* renamed from: a */
        public final void mo108807a(int i) {
            this.f75330b = i;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public DelayScrollRunnable() {
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.CalendarDaysContract.AbstractC30655a
    /* renamed from: b */
    public void mo108703b() {
        this.f75323a = false;
        setPageEnabled(true);
        Handler handler = this.f75326m;
        if (handler == null) {
            Intrinsics.throwNpe();
        }
        handler.removeCallbacks(this.f75328o);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J \u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005H\u0016J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¨\u0006\f"}, d2 = {"com/ss/android/lark/calendar/impl/features/arrange/arrangelook/widget/LookViewPager$init$1", "Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;", "onPageScrollStateChanged", "", "state", "", "onPageScrolled", "position", "positionOffset", "", "positionOffsetPixels", "onPageSelected", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.arrange.arrangelook.widget.LookViewPager$c */
    public static final class C30175c implements ViewPager.OnPageChangeListener {

        /* renamed from: a */
        final /* synthetic */ LookViewPager f75331a;

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i, float f, int i2) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C30175c(LookViewPager lookViewPager) {
            this.f75331a = lookViewPager;
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i) {
            if (this.f75331a.f75323a && i == 0) {
                this.f75331a.setPageEnabled(false);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LookViewPager(Context context) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "context");
        m111819a(context);
    }

    /* renamed from: a */
    private final void m111819a(Context context) {
        setOffscreenPageLimit(3);
        this.f75326m = new Handler(Looper.getMainLooper());
        this.f75325l = UIUtils.dp2px(context, 20.0f);
        addOnPageChangeListener(new C30175c(this));
    }

    /* renamed from: a */
    private final void m111820a(Runnable runnable) {
        long uptimeMillis = SystemClock.uptimeMillis();
        long j = (long) 50;
        if (uptimeMillis - this.f75327n > j) {
            Handler handler = this.f75326m;
            if (handler == null) {
                Intrinsics.throwNpe();
            }
            handler.removeCallbacks(runnable);
            Handler handler2 = this.f75326m;
            if (handler2 == null) {
                Intrinsics.throwNpe();
            }
            handler2.postDelayed(runnable, j);
            this.f75327n = uptimeMillis;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LookViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(attributeSet, "attrs");
        m111819a(context);
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.CalendarDaysContract.AbstractC30655a
    /* renamed from: a */
    public void mo108702a(int i, int i2, int i3) {
        int i4 = this.f75325l;
        if (i2 <= i4) {
            this.f75328o.mo108807a(getCurrentItem() - 1);
            m111820a(this.f75328o);
        } else if (this.f75324k - i2 <= i4) {
            this.f75328o.mo108807a(getCurrentItem() + 1);
            m111820a(this.f75328o);
        } else {
            Handler handler = this.f75326m;
            if (handler == null) {
                Intrinsics.throwNpe();
            }
            handler.removeCallbacks(this.f75328o);
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.viewpager.widget.ViewPager
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            this.f75324k = i;
        }
    }
}
