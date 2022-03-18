package com.ss.android.lark.calendar.impl.features.meetingroom.instance.util;

import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.JvmStatic;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J6\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H\u0007¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/meetingroom/instance/util/InstanceTimeUtil;", "", "()V", "getFirstNotCrossTime", "Lkotlin/Pair;", "", "busyStartTime", "busyEndTime", "selectStartTime", "selectEndTime", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.instance.a.b */
public final class InstanceTimeUtil {

    /* renamed from: a */
    public static final InstanceTimeUtil f82075a = new InstanceTimeUtil();

    private InstanceTimeUtil() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final Pair<Integer, Integer> m122114a(int i, int i2, int i3, int i4) {
        if (i >= i4 || i2 <= i3) {
            return new Pair<>(Integer.valueOf(i3), Integer.valueOf(i4));
        }
        if (i <= i3 && i2 >= i4) {
            return null;
        }
        int i5 = i3 + 1;
        if (i5 <= i && i4 > i) {
            return new Pair<>(Integer.valueOf(i3), Integer.valueOf(i));
        }
        if (i5 <= i2 && i4 > i2 && i <= i3) {
            return new Pair<>(Integer.valueOf(i2), Integer.valueOf(i4));
        }
        return new Pair<>(Integer.valueOf(i3), Integer.valueOf(i4));
    }
}
