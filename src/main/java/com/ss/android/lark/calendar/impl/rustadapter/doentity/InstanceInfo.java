package com.ss.android.lark.calendar.impl.rustadapter.doentity;

import com.bytedance.lark.pb.calendar.v1.InstanceCheckInInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/InstanceInfo;", "", "instance", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventInstance;", "instanceCheckInInfo", "Lcom/bytedance/lark/pb/calendar/v1/InstanceCheckInInfo;", "(Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventInstance;Lcom/bytedance/lark/pb/calendar/v1/InstanceCheckInInfo;)V", "getInstance", "()Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventInstance;", "setInstance", "(Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventInstance;)V", "getInstanceCheckInInfo", "()Lcom/bytedance/lark/pb/calendar/v1/InstanceCheckInInfo;", "setInstanceCheckInInfo", "(Lcom/bytedance/lark/pb/calendar/v1/InstanceCheckInInfo;)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.rustadapter.doentity.m */
public final class InstanceInfo {

    /* renamed from: a */
    private CalendarEventInstance f83622a;

    /* renamed from: b */
    private InstanceCheckInInfo f83623b;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InstanceInfo)) {
            return false;
        }
        InstanceInfo mVar = (InstanceInfo) obj;
        return Intrinsics.areEqual(this.f83622a, mVar.f83622a) && Intrinsics.areEqual(this.f83623b, mVar.f83623b);
    }

    public int hashCode() {
        CalendarEventInstance calendarEventInstance = this.f83622a;
        int i = 0;
        int hashCode = (calendarEventInstance != null ? calendarEventInstance.hashCode() : 0) * 31;
        InstanceCheckInInfo instanceCheckInInfo = this.f83623b;
        if (instanceCheckInInfo != null) {
            i = instanceCheckInInfo.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "InstanceInfo(instance=" + this.f83622a + ", instanceCheckInInfo=" + this.f83623b + ")";
    }

    /* renamed from: a */
    public final CalendarEventInstance mo120126a() {
        return this.f83622a;
    }

    /* renamed from: b */
    public final InstanceCheckInInfo mo120127b() {
        return this.f83623b;
    }

    public InstanceInfo(CalendarEventInstance calendarEventInstance, InstanceCheckInInfo instanceCheckInInfo) {
        Intrinsics.checkParameterIsNotNull(calendarEventInstance, "instance");
        this.f83622a = calendarEventInstance;
        this.f83623b = instanceCheckInInfo;
    }
}
