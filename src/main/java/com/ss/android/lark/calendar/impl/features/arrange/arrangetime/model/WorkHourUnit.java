package com.ss.android.lark.calendar.impl.features.arrange.arrangetime.model;

import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarWorkHourSpan;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR*\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\fX.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/arrange/arrangetime/model/WorkHourUnit;", "", "()V", "index", "", "getIndex", "()I", "setIndex", "(I)V", "workHourSpanList", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarWorkHourSpan;", "Lkotlin/collections/ArrayList;", "getWorkHourSpanList", "()Ljava/util/ArrayList;", "setWorkHourSpanList", "(Ljava/util/ArrayList;)V", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.arrange.arrangetime.model.b */
public final class WorkHourUnit {

    /* renamed from: b */
    public static final Companion f75461b = new Companion(null);

    /* renamed from: a */
    public ArrayList<CalendarWorkHourSpan> f75462a;

    /* renamed from: c */
    private int f75463c = -1;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/arrange/arrangetime/model/WorkHourUnit$Companion;", "", "()V", "ILLEGAL_VALUE", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.arrange.arrangetime.model.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final int mo108990a() {
        return this.f75463c;
    }

    /* renamed from: b */
    public final ArrayList<CalendarWorkHourSpan> mo108993b() {
        ArrayList<CalendarWorkHourSpan> arrayList = this.f75462a;
        if (arrayList == null) {
            Intrinsics.throwUninitializedPropertyAccessException("workHourSpanList");
        }
        return arrayList;
    }

    /* renamed from: a */
    public final void mo108991a(int i) {
        this.f75463c = i;
    }

    /* renamed from: a */
    public final void mo108992a(ArrayList<CalendarWorkHourSpan> arrayList) {
        Intrinsics.checkParameterIsNotNull(arrayList, "<set-?>");
        this.f75462a = arrayList;
    }
}
