package com.ss.android.lark.calendar.impl.features.events.edit.widget;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\t¨\u0006\u0015"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/widget/MeetingRoomText;", "", "mtRoomSummaryText", "", "mtRoomStrategyText", "(Ljava/lang/String;Ljava/lang/String;)V", "getMtRoomStrategyText", "()Ljava/lang/String;", "setMtRoomStrategyText", "(Ljava/lang/String;)V", "getMtRoomSummaryText", "setMtRoomSummaryText", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.widget.b */
public final class MeetingRoomText {

    /* renamed from: a */
    private String f81398a;

    /* renamed from: b */
    private String f81399b;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MeetingRoomText)) {
            return false;
        }
        MeetingRoomText bVar = (MeetingRoomText) obj;
        return Intrinsics.areEqual(this.f81398a, bVar.f81398a) && Intrinsics.areEqual(this.f81399b, bVar.f81399b);
    }

    public int hashCode() {
        String str = this.f81398a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f81399b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "MeetingRoomText(mtRoomSummaryText=" + this.f81398a + ", mtRoomStrategyText=" + this.f81399b + ")";
    }

    /* renamed from: a */
    public final String mo116451a() {
        return this.f81398a;
    }

    /* renamed from: b */
    public final String mo116452b() {
        return this.f81399b;
    }

    public MeetingRoomText(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "mtRoomSummaryText");
        Intrinsics.checkParameterIsNotNull(str2, "mtRoomStrategyText");
        this.f81398a = str;
        this.f81399b = str2;
    }
}
