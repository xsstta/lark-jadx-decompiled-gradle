package com.ss.android.lark.calendar.impl.features.calendarview.entity.chipstate;

import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/entity/chipstate/ReserveRoomState;", "Lcom/ss/android/lark/calendar/impl/features/calendarview/entity/chipstate/AppendState;", "()V", "appendStr", "", "showAppendStr", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class ReserveRoomState extends AppendState {
    @Override // com.ss.android.lark.calendar.impl.features.calendarview.entity.chipstate.BaseEventChipViewAttribute, com.ss.android.lark.calendar.impl.features.calendarview.entity.chipstate.EventChipViewAttribute, com.ss.android.lark.calendar.impl.features.calendarview.entity.chipstate.AppendState
    public boolean showAppendStr() {
        return true;
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.entity.chipstate.BaseEventChipViewAttribute, com.ss.android.lark.calendar.impl.features.calendarview.entity.chipstate.EventChipViewAttribute, com.ss.android.lark.calendar.impl.features.calendarview.entity.chipstate.AppendState
    public String appendStr() {
        String b = C32634ae.m125182b(R.string.Calendar_Rooms_ReserveRoms);
        Intrinsics.checkExpressionValueIsNotNull(b, "ResUtil.getString(string…lendar_Rooms_ReserveRoms)");
        return b;
    }
}
