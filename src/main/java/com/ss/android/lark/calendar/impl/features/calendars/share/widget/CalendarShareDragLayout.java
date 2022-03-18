package com.ss.android.lark.calendar.impl.features.calendars.share.widget;

import android.animation.Animator;
import android.content.Context;
import android.util.AttributeSet;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.VerticalDragLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0013B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u000f\u001a\u00020\u0010H\u0002J\u0006\u0010\u0011\u001a\u00020\u0010J\u0006\u0010\u0012\u001a\u00020\u0010R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/share/widget/CalendarShareDragLayout;", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/widget/VerticalDragLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "shareDragListener", "Lcom/ss/android/lark/calendar/impl/features/calendars/share/widget/CalendarShareDragLayout$ShareDragListener;", "getShareDragListener", "()Lcom/ss/android/lark/calendar/impl/features/calendars/share/widget/CalendarShareDragLayout$ShareDragListener;", "setShareDragListener", "(Lcom/ss/android/lark/calendar/impl/features/calendars/share/widget/CalendarShareDragLayout$ShareDragListener;)V", "initView", "", "startHideAnim", "startShowAnim", "ShareDragListener", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class CalendarShareDragLayout extends VerticalDragLayout {

    /* renamed from: d */
    private ShareDragListener f76377d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&J\b\u0010\u0007\u001a\u00020\u0003H&J\b\u0010\b\u001a\u00020\u0003H&J\b\u0010\t\u001a\u00020\u0003H&¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/share/widget/CalendarShareDragLayout$ShareDragListener;", "", "onDragOffset", "", "totalOffset", "", "currentOffset", "onHideAnimEnd", "onStartAnimEnd", "onStartAnimStart", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.share.widget.CalendarShareDragLayout$a */
    public interface ShareDragListener {
        /* renamed from: a */
        void mo109877a();

        /* renamed from: a */
        void mo109878a(float f, float f2);

        /* renamed from: b */
        void mo109879b();

        /* renamed from: c */
        void mo109880c();
    }

    public CalendarShareDragLayout(Context context) {
        this(context, null, 0, 6, null);
    }

    public CalendarShareDragLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final ShareDragListener getShareDragListener() {
        return this.f76377d;
    }

    /* renamed from: e */
    private final void m113443e() {
        mo115977c();
        setListener(new C30536b(this));
    }

    /* renamed from: a */
    public final void mo110174a() {
        mo115976a((float) getHeight(), BitmapDescriptorFactory.HUE_RED, new C30538d(this));
    }

    /* renamed from: b */
    public final void mo110175b() {
        mo115976a(getTranslationY(), (float) getHeight(), new C30537c(this));
    }

    public final void setShareDragListener(ShareDragListener aVar) {
        this.f76377d = aVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016J\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016J\u0018\u0010\f\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016J\b\u0010\r\u001a\u00020\u0003H\u0016¨\u0006\u000e"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendars/share/widget/CalendarShareDragLayout$initView$1", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/widget/VerticalDragLayout$ShrinkLayoutChangeListener;", "dragOffset", "", "totalOffset", "", "currentOffset", "onLayoutAnimCancel", "start", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/widget/VerticalDragLayout$POSITION;", "end", "onLayoutAnimEnd", "onLayoutAnimStart", "startDrag", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.share.widget.CalendarShareDragLayout$b */
    public static final class C30536b implements VerticalDragLayout.ShrinkLayoutChangeListener {

        /* renamed from: a */
        final /* synthetic */ CalendarShareDragLayout f76378a;

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.VerticalDragLayout.ShrinkLayoutChangeListener
        /* renamed from: a */
        public void mo110178a() {
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.VerticalDragLayout.ShrinkLayoutChangeListener
        /* renamed from: a */
        public void mo110180a(VerticalDragLayout.POSITION position, VerticalDragLayout.POSITION position2) {
            Intrinsics.checkParameterIsNotNull(position, "start");
            Intrinsics.checkParameterIsNotNull(position2, "end");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C30536b(CalendarShareDragLayout calendarShareDragLayout) {
            this.f76378a = calendarShareDragLayout;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.VerticalDragLayout.ShrinkLayoutChangeListener
        /* renamed from: a */
        public void mo110179a(float f, float f2) {
            ShareDragListener shareDragListener = this.f76378a.getShareDragListener();
            if (shareDragListener != null) {
                shareDragListener.mo109878a(f, f2);
            }
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.VerticalDragLayout.ShrinkLayoutChangeListener
        /* renamed from: b */
        public void mo110181b(VerticalDragLayout.POSITION position, VerticalDragLayout.POSITION position2) {
            ShareDragListener shareDragListener;
            Intrinsics.checkParameterIsNotNull(position, "start");
            Intrinsics.checkParameterIsNotNull(position2, "end");
            if (C30539a.f76381a[position2.ordinal()] == 1 && (shareDragListener = this.f76378a.getShareDragListener()) != null) {
                shareDragListener.mo109877a();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0007\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendars/share/widget/CalendarShareDragLayout$startHideAnim$1", "Landroid/animation/Animator$AnimatorListener;", "onAnimationCancel", "", "animation", "Landroid/animation/Animator;", "onAnimationEnd", "onAnimationRepeat", "onAnimationStart", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.share.widget.CalendarShareDragLayout$c */
    public static final class C30537c implements Animator.AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ CalendarShareDragLayout f76379a;

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C30537c(CalendarShareDragLayout calendarShareDragLayout) {
            this.f76379a = calendarShareDragLayout;
        }

        public void onAnimationCancel(Animator animator) {
            ShareDragListener shareDragListener = this.f76379a.getShareDragListener();
            if (shareDragListener != null) {
                shareDragListener.mo109877a();
            }
        }

        public void onAnimationEnd(Animator animator) {
            ShareDragListener shareDragListener = this.f76379a.getShareDragListener();
            if (shareDragListener != null) {
                shareDragListener.mo109877a();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendars/share/widget/CalendarShareDragLayout$startShowAnim$1", "Landroid/animation/Animator$AnimatorListener;", "onAnimationCancel", "", "animation", "Landroid/animation/Animator;", "onAnimationEnd", "onAnimationRepeat", "onAnimationStart", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.share.widget.CalendarShareDragLayout$d */
    public static final class C30538d implements Animator.AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ CalendarShareDragLayout f76380a;

        public void onAnimationCancel(Animator animator) {
            Intrinsics.checkParameterIsNotNull(animator, "animation");
        }

        public void onAnimationRepeat(Animator animator) {
            Intrinsics.checkParameterIsNotNull(animator, "animation");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C30538d(CalendarShareDragLayout calendarShareDragLayout) {
            this.f76380a = calendarShareDragLayout;
        }

        public void onAnimationEnd(Animator animator) {
            Intrinsics.checkParameterIsNotNull(animator, "animation");
            ShareDragListener shareDragListener = this.f76380a.getShareDragListener();
            if (shareDragListener != null) {
                shareDragListener.mo109880c();
            }
        }

        public void onAnimationStart(Animator animator) {
            Intrinsics.checkParameterIsNotNull(animator, "animation");
            ShareDragListener shareDragListener = this.f76380a.getShareDragListener();
            if (shareDragListener != null) {
                shareDragListener.mo109879b();
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CalendarShareDragLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        m113443e();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CalendarShareDragLayout(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
