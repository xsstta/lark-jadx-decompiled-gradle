package com.ss.android.lark.calendar.impl.features.arrange.arrangetime.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.HorizontalScrollView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0001\u001fB\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nB)\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0002\u0010\fJ\u0012\u0010\u0011\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J(\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u000eH\u0014J\u0012\u0010\u001a\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\u000e\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u000eJ\u000e\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u0010R\u000e\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/arrange/arrangetime/widget/OverHorizScrollView;", "Landroid/widget/HorizontalScrollView;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "needInterceptTouchEvent", "", "scrollViewListener", "Lcom/ss/android/lark/calendar/impl/features/arrange/arrangetime/widget/OverHorizScrollView$ScrollListener;", "onInterceptTouchEvent", "ev", "Landroid/view/MotionEvent;", "onOverScrolled", "", "scrollX", "scrollY", "clampedX", "clampedY", "onTouchEvent", "setNeedInterceptTouchEvent", "needIntercept", "setScrollViewListener", "listener", "ScrollListener", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class OverHorizScrollView extends HorizontalScrollView {

    /* renamed from: a */
    private ScrollListener f75529a;

    /* renamed from: b */
    private boolean f75530b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H&J\u0012\u0010\t\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u000bH&J\u0012\u0010\f\u001a\u00020\u00052\b\u0010\r\u001a\u0004\u0018\u00010\u000eH&¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/arrange/arrangetime/widget/OverHorizScrollView$ScrollListener;", "", "hasTrigger", "", "onScroll", "", "scrollX", "", "scrollY", "onTouch", "ev", "Landroid/view/MotionEvent;", "setTrigger", "scrollView", "Landroid/widget/HorizontalScrollView;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.arrange.arrangetime.widget.OverHorizScrollView$a */
    public interface ScrollListener {
        /* renamed from: a */
        void mo109079a(int i, int i2);

        /* renamed from: a */
        void mo109080a(MotionEvent motionEvent);

        /* renamed from: a */
        void mo109081a(HorizontalScrollView horizontalScrollView);

        /* renamed from: a */
        boolean mo109082a();
    }

    public final void setNeedInterceptTouchEvent(boolean z) {
        this.f75530b = z;
    }

    public final void setScrollViewListener(ScrollListener aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "listener");
        this.f75529a = aVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public OverHorizScrollView(Context context) {
        this(context, null);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f75530b) {
            return true;
        }
        try {
            return super.onInterceptTouchEvent(motionEvent);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        ScrollListener aVar = this.f75529a;
        if (aVar == null) {
            Intrinsics.throwNpe();
        }
        if (!aVar.mo109082a()) {
            ScrollListener aVar2 = this.f75529a;
            if (aVar2 != null) {
                aVar2.mo109081a(this);
            }
            ScrollListener aVar3 = this.f75529a;
            if (aVar3 != null) {
                aVar3.mo109080a(motionEvent);
            }
            ScrollListener aVar4 = this.f75529a;
            if (aVar4 != null) {
                aVar4.mo109081a((HorizontalScrollView) null);
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public OverHorizScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public OverHorizScrollView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* access modifiers changed from: protected */
    public void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        ScrollListener aVar = this.f75529a;
        if (aVar == null) {
            Intrinsics.throwNpe();
        }
        if (!aVar.mo109082a()) {
            ScrollListener aVar2 = this.f75529a;
            if (aVar2 != null) {
                aVar2.mo109081a(this);
            }
            ScrollListener aVar3 = this.f75529a;
            if (aVar3 != null) {
                aVar3.mo109079a(i, i2);
            }
            ScrollListener aVar4 = this.f75529a;
            if (aVar4 != null) {
                aVar4.mo109081a((HorizontalScrollView) null);
            }
        }
        super.onOverScrolled(i, i2, z, z2);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OverHorizScrollView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }
}
