package com.ss.android.lark.calendar.impl.features.calendarview.entity.chipstate;

import android.graphics.drawable.Drawable;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.calendar.impl.utils.ao;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\tH\u0016¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/entity/chipstate/TimeState;", "Lcom/ss/android/lark/calendar/impl/features/calendarview/entity/chipstate/AppendState;", "()V", "getColorBgWithBorderDrawable", "Landroid/graphics/drawable/Drawable;", "roundRectRadius", "", "strokeWidth", "showDragBorder", "", "showAppendStr", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class TimeState extends AppendState {
    @Override // com.ss.android.lark.calendar.impl.features.calendarview.entity.chipstate.BaseEventChipViewAttribute, com.ss.android.lark.calendar.impl.features.calendarview.entity.chipstate.EventChipViewAttribute, com.ss.android.lark.calendar.impl.features.calendarview.entity.chipstate.AppendState
    public boolean showAppendStr() {
        return false;
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.entity.chipstate.BaseEventChipViewAttribute, com.ss.android.lark.calendar.impl.features.calendarview.entity.chipstate.EventChipViewAttribute
    public Drawable getColorBgWithBorderDrawable(int i, int i2, boolean z) {
        int borderColor = getBorderColor();
        if (z) {
            borderColor = getDragColor();
        }
        int e = C32634ae.m125185e(R.dimen.dp_4);
        float f = (float) i;
        Drawable a = ao.m125219a(getBackGroundColor(), new float[]{f, f, f, f}, i2, borderColor, e, e);
        Intrinsics.checkExpressionValueIsNotNull(a, "ViewUtil.getCustomCorner…Width,dashWidth\n        )");
        return a;
    }
}
