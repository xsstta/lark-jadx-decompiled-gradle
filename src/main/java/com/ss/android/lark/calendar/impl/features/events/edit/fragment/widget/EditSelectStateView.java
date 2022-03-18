package com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget;

import android.content.Context;
import android.util.AttributeSet;
import com.larksuite.component.universe_design.checkbox.UDCheckBox;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.IBuildingContract;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B/\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010\tJ\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/widget/EditSelectStateView;", "Lcom/larksuite/component/universe_design/checkbox/UDCheckBox;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "updateSelectState", "", "selectState", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/IBuildingContract$SelectState;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class EditSelectStateView extends UDCheckBox {
    public EditSelectStateView(Context context) {
        this(context, null, 0, 0, 14, null);
    }

    public EditSelectStateView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    public EditSelectStateView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
    }

    /* renamed from: a */
    public final void mo115963a(IBuildingContract.SelectState selectState) {
        Intrinsics.checkParameterIsNotNull(selectState, "selectState");
        int i = C31821e.f81050a[selectState.ordinal()];
        if (i == 1) {
            setEnabled(false);
            setChecked(false);
            setIndetermined(false);
        } else if (i == 2) {
            setEnabled(true);
            setChecked(false);
            setIndetermined(false);
        } else if (i == 3) {
            setEnabled(true);
            setChecked(true);
            setIndetermined(true);
        } else if (i == 4) {
            setEnabled(true);
            setChecked(true);
            setIndetermined(false);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EditSelectStateView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EditSelectStateView(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }
}
