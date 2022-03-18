package com.ss.android.lark.calendar.impl.features.arrange.arrangetime.util;

import com.ss.android.lark.calendar.impl.features.arrange.p1441a.AbstractC30095b;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttendee;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J$\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/arrange/arrangetime/util/ArrangeUtil;", "", "()V", "parseToAttendee", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventAttendee;", "Lkotlin/collections/ArrayList;", "arrangeBaseData", "", "Lcom/ss/android/lark/calendar/impl/features/arrange/base/IArrangeBaseData;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.arrange.arrangetime.b.a */
public final class ArrangeUtil {

    /* renamed from: a */
    public static final ArrangeUtil f75376a = new ArrangeUtil();

    private ArrangeUtil() {
    }

    /* renamed from: a */
    public final ArrayList<CalendarEventAttendee> mo108931a(List<? extends AbstractC30095b> list) {
        Intrinsics.checkParameterIsNotNull(list, "arrangeBaseData");
        ArrayList<CalendarEventAttendee> arrayList = new ArrayList<>();
        for (T t : list) {
            if (t instanceof CalendarEventAttendee) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }
}
