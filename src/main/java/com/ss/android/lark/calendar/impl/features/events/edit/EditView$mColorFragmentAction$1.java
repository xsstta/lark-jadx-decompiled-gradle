package com.ss.android.lark.calendar.impl.features.events.edit;

import com.ss.android.lark.calendar.impl.features.events.edit.fragment.ChooseColorFragment;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/edit/EditView$mColorFragmentAction$1", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/ChooseColorFragment$ColorFragmentAction;", "onBackPressed", "", "onSavePressed", "chosenColor", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class EditView$mColorFragmentAction$1 implements ChooseColorFragment.ColorFragmentAction {
    final /* synthetic */ EditView this$0;

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.ChooseColorFragment.ColorFragmentAction
    public void onBackPressed() {
        this.this$0.mo114315a(7);
    }

    /* JADX WARN: Incorrect args count in method signature: ()V */
    EditView$mColorFragmentAction$1(EditView editView) {
        this.this$0 = editView;
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.ChooseColorFragment.ColorFragmentAction
    public void onSavePressed(int i) {
        this.this$0.mo114315a(7);
        EditView.m118541b(this.this$0).mo114536d(i);
    }
}
