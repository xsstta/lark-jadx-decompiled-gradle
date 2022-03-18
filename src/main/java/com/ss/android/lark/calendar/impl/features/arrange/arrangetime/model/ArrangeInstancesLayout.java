package com.ss.android.lark.calendar.impl.features.arrange.arrangetime.model;

import com.ss.android.lark.calendar.impl.rustadapter.doentity.DayInstancesLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/arrange/arrangetime/model/ArrangeInstancesLayout;", "", "()V", "calendarId", "", "getCalendarId", "()Ljava/lang/String;", "setCalendarId", "(Ljava/lang/String;)V", "instanceLayouts", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/DayInstancesLayout;", "getInstanceLayouts", "()Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/DayInstancesLayout;", "setInstanceLayouts", "(Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/DayInstancesLayout;)V", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.arrange.arrangetime.model.a */
public final class ArrangeInstancesLayout {

    /* renamed from: a */
    public String f75459a;

    /* renamed from: b */
    public DayInstancesLayout f75460b;

    /* renamed from: a */
    public final DayInstancesLayout mo108987a() {
        DayInstancesLayout dayInstancesLayout = this.f75460b;
        if (dayInstancesLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("instanceLayouts");
        }
        return dayInstancesLayout;
    }

    /* renamed from: a */
    public final void mo108988a(DayInstancesLayout dayInstancesLayout) {
        Intrinsics.checkParameterIsNotNull(dayInstancesLayout, "<set-?>");
        this.f75460b = dayInstancesLayout;
    }

    /* renamed from: a */
    public final void mo108989a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f75459a = str;
    }
}
