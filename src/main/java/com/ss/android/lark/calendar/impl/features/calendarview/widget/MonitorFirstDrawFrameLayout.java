package com.ss.android.lark.calendar.impl.features.calendarview.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0014B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0012\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0014J\u0006\u0010\u0011\u001a\u00020\u000eJ\u0010\u0010\u0012\u001a\u00020\u000e2\b\u0010\u0013\u001a\u0004\u0018\u00010\nR\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/widget/MonitorFirstDrawFrameLayout;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "firstFrameCallback", "Lcom/ss/android/lark/calendar/impl/features/calendarview/widget/MonitorFirstDrawFrameLayout$FirstPageViewListener;", "isFirstFrameShowed", "", "dispatchDraw", "", "canvas", "Landroid/graphics/Canvas;", "resetTag", "setFirstPageViewListener", "listener", "FirstPageViewListener", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class MonitorFirstDrawFrameLayout extends FrameLayout {

    /* renamed from: a */
    private FirstPageViewListener f78456a;

    /* renamed from: b */
    private boolean f78457b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/widget/MonitorFirstDrawFrameLayout$FirstPageViewListener;", "", "onFirstFrameShowed", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.widget.MonitorFirstDrawFrameLayout$a */
    public interface FirstPageViewListener {
        /* renamed from: a */
        void mo111869a();
    }

    public MonitorFirstDrawFrameLayout(Context context) {
        this(context, null, 0, 6, null);
    }

    public MonitorFirstDrawFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* renamed from: a */
    public final void mo112581a() {
        this.f78457b = false;
    }

    public final void setFirstPageViewListener(FirstPageViewListener aVar) {
        this.f78456a = aVar;
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (!this.f78457b) {
            this.f78457b = true;
            FirstPageViewListener aVar = this.f78456a;
            if (aVar != null) {
                aVar.mo111869a();
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MonitorFirstDrawFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MonitorFirstDrawFrameLayout(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
