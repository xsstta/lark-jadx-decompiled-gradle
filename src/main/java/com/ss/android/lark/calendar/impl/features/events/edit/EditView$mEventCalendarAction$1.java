package com.ss.android.lark.calendar.impl.features.events.edit;

import com.ss.android.lark.calendar.impl.features.events.edit.fragment.ChooseCalendarFragment;
import com.ss.android.lark.calendar.impl.features.events.edit.part.EditCalendarPart;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/edit/EditView$mEventCalendarAction$1", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/ChooseCalendarFragment$CalendarFragmentAction;", "onBackPressed", "", "onCalendarSwitch", "position", "", "onSavePressed", "currentIndex", "changeType", "Lcom/ss/android/lark/calendar/impl/features/events/edit/part/EditCalendarPart$CHANGE_TYPE;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class EditView$mEventCalendarAction$1 implements ChooseCalendarFragment.CalendarFragmentAction {
    final /* synthetic */ EditView this$0;

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.ChooseCalendarFragment.CalendarFragmentAction
    public void onBackPressed() {
        this.this$0.mo114315a(6);
    }

    /* JADX WARN: Incorrect args count in method signature: ()V */
    EditView$mEventCalendarAction$1(EditView editView) {
        this.this$0 = editView;
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.ChooseCalendarFragment.CalendarFragmentAction
    public void onCalendarSwitch(int i) {
        EditView.m118541b(this.this$0).mo114512a(i);
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.ChooseCalendarFragment.CalendarFragmentAction
    public void onSavePressed(int i, EditCalendarPart.CHANGE_TYPE change_type) {
        Intrinsics.checkParameterIsNotNull(change_type, "changeType");
        EditView.m118541b(this.this$0).mo114513a(i, change_type);
    }
}
