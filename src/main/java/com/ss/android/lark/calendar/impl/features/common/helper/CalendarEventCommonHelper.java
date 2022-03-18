package com.ss.android.lark.calendar.impl.features.common.helper;

import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/common/helper/CalendarEventCommonHelper;", "", "()V", "isFakeEventOrInstance", "", "category", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEvent$Category;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.common.c.c */
public final class CalendarEventCommonHelper {

    /* renamed from: a */
    public static final CalendarEventCommonHelper f78611a = new CalendarEventCommonHelper();

    private CalendarEventCommonHelper() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final boolean m116172a(CalendarEvent.Category category) {
        if (category == CalendarEvent.Category.RESOURCE_STRATEGY || category == CalendarEvent.Category.RESOURCE_REQUISITION) {
            return true;
        }
        return false;
    }
}
