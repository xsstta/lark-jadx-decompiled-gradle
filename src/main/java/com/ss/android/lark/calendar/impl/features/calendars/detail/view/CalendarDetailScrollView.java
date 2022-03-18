package com.ss.android.lark.calendar.impl.features.calendars.detail.view;

import android.content.Context;
import android.util.AttributeSet;
import com.ss.android.lark.calendar.impl.features.common.widget.BehavioralScrollView;
import com.ss.android.lark.calendar.impl.features.common.widget.NestedScrollBehavior;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B%\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u001f\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0002\u0010\u000eJ\u001f\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0002\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/detail/view/CalendarDetailScrollView;", "Lcom/ss/android/lark/calendar/impl/features/common/widget/BehavioralScrollView;", "Lcom/ss/android/lark/calendar/impl/features/common/widget/NestedScrollBehavior;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "handleNestedPreScrollFirst", "", "scroll", ShareHitPoint.f121869d, "(II)Ljava/lang/Boolean;", "handleNestedScrollFirst", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class CalendarDetailScrollView extends BehavioralScrollView implements NestedScrollBehavior {
    public CalendarDetailScrollView(Context context) {
        this(context, null, 0, 6, null);
    }

    public CalendarDetailScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    @Override // com.ss.android.lark.calendar.impl.features.common.widget.BehavioralScrollView
    /* renamed from: b */
    public Boolean mo109278b(int i, int i2) {
        return true;
    }

    @Override // com.ss.android.lark.calendar.impl.features.common.widget.BehavioralScrollView
    /* renamed from: a */
    public Boolean mo109277a(int i, int i2) {
        if (i > 0) {
            return true;
        }
        return null;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CalendarDetailScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CalendarDetailScrollView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
