package com.ss.android.lark.calendar.impl.features.meetingroom.base.helper;

import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttendee;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\tJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J-\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u001b"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/meetingroom/base/helper/ApprovalTipDialogData;", "", "approvalType", "", "approvalTitle", "", "approvalAttendee", "", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventAttendee;", "(ILjava/lang/String;Ljava/util/List;)V", "getApprovalAttendee", "()Ljava/util/List;", "getApprovalTitle", "()Ljava/lang/String;", "getApprovalType", "()I", "setApprovalType", "(I)V", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.base.helper.a */
public final class ApprovalTipDialogData {

    /* renamed from: a */
    private int f81968a;

    /* renamed from: b */
    private final String f81969b;

    /* renamed from: c */
    private final List<CalendarEventAttendee> f81970c;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApprovalTipDialogData)) {
            return false;
        }
        ApprovalTipDialogData aVar = (ApprovalTipDialogData) obj;
        return this.f81968a == aVar.f81968a && Intrinsics.areEqual(this.f81969b, aVar.f81969b) && Intrinsics.areEqual(this.f81970c, aVar.f81970c);
    }

    public int hashCode() {
        int i = this.f81968a * 31;
        String str = this.f81969b;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        List<CalendarEventAttendee> list = this.f81970c;
        if (list != null) {
            i2 = list.hashCode();
        }
        return hashCode + i2;
    }

    public String toString() {
        return "ApprovalTipDialogData(approvalType=" + this.f81968a + ", approvalTitle=" + this.f81969b + ", approvalAttendee=" + this.f81970c + ")";
    }

    /* renamed from: a */
    public final int mo117013a() {
        return this.f81968a;
    }

    /* renamed from: b */
    public final String mo117014b() {
        return this.f81969b;
    }

    /* renamed from: c */
    public final List<CalendarEventAttendee> mo117015c() {
        return this.f81970c;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.util.List<? extends com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttendee> */
    /* JADX WARN: Multi-variable type inference failed */
    public ApprovalTipDialogData(int i, String str, List<? extends CalendarEventAttendee> list) {
        Intrinsics.checkParameterIsNotNull(str, "approvalTitle");
        Intrinsics.checkParameterIsNotNull(list, "approvalAttendee");
        this.f81968a = i;
        this.f81969b = str;
        this.f81970c = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ApprovalTipDialogData(int i, String str, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? "" : str, list);
    }
}
