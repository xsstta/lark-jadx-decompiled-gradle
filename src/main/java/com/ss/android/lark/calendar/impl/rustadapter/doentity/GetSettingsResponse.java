package com.ss.android.lark.calendar.impl.rustadapter.doentity;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B+\b\u0007\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ2\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u0010\n\u0002\u0010\u000b\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u0010\n\u0002\u0010\u000b\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\nR\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u0010\n\u0002\u0010\u000b\u001a\u0004\b\u000e\u0010\b\"\u0004\b\u000f\u0010\n¨\u0006\u001b"}, d2 = {"Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/GetSettingsResponse;", "", "maxAttendeeNum", "", "maxTimeZoneAttendeeNum", "maxDepartmentAttendeeNum", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getMaxAttendeeNum", "()Ljava/lang/Integer;", "setMaxAttendeeNum", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getMaxDepartmentAttendeeNum", "setMaxDepartmentAttendeeNum", "getMaxTimeZoneAttendeeNum", "setMaxTimeZoneAttendeeNum", "component1", "component2", "component3", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/GetSettingsResponse;", "equals", "", "other", "hashCode", "toString", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.rustadapter.doentity.k */
public final class GetSettingsResponse {

    /* renamed from: a */
    private Integer f83617a;

    /* renamed from: b */
    private Integer f83618b;

    /* renamed from: c */
    private Integer f83619c;

    public GetSettingsResponse() {
        this(null, null, null, 7, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetSettingsResponse)) {
            return false;
        }
        GetSettingsResponse kVar = (GetSettingsResponse) obj;
        return Intrinsics.areEqual(this.f83617a, kVar.f83617a) && Intrinsics.areEqual(this.f83618b, kVar.f83618b) && Intrinsics.areEqual(this.f83619c, kVar.f83619c);
    }

    public int hashCode() {
        Integer num = this.f83617a;
        int i = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        Integer num2 = this.f83618b;
        int hashCode2 = (hashCode + (num2 != null ? num2.hashCode() : 0)) * 31;
        Integer num3 = this.f83619c;
        if (num3 != null) {
            i = num3.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        return "GetSettingsResponse(maxAttendeeNum=" + this.f83617a + ", maxTimeZoneAttendeeNum=" + this.f83618b + ", maxDepartmentAttendeeNum=" + this.f83619c + ")";
    }

    /* renamed from: a */
    public final Integer mo120112a() {
        return this.f83617a;
    }

    /* renamed from: b */
    public final Integer mo120114b() {
        return this.f83618b;
    }

    /* renamed from: c */
    public final Integer mo120116c() {
        return this.f83619c;
    }

    /* renamed from: a */
    public final void mo120113a(Integer num) {
        this.f83617a = num;
    }

    /* renamed from: b */
    public final void mo120115b(Integer num) {
        this.f83618b = num;
    }

    /* renamed from: c */
    public final void mo120117c(Integer num) {
        this.f83619c = num;
    }

    public GetSettingsResponse(Integer num, Integer num2, Integer num3) {
        this.f83617a = num;
        this.f83618b = num2;
        this.f83619c = num3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GetSettingsResponse(Integer num, Integer num2, Integer num3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : num3);
    }
}
