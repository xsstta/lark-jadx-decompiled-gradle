package com.ss.android.lark.calendar.impl.rustadapter.doentity;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0016\b\u0002\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u0017\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003HÆ\u0003J!\u0010\u000b\u001a\u00020\u00002\u0016\b\u0002\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0004HÖ\u0001R(\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\u0006¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/GetMeetingRoomsStatusInformationResponse;", "", "statusInformation", "", "", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/StatusInformation;", "(Ljava/util/Map;)V", "getStatusInformation", "()Ljava/util/Map;", "setStatusInformation", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.rustadapter.doentity.i */
public final class GetMeetingRoomsStatusInformationResponse {

    /* renamed from: a */
    private Map<String, StatusInformation> f83609a;

    public GetMeetingRoomsStatusInformationResponse() {
        this(null, 1, null);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof GetMeetingRoomsStatusInformationResponse) && Intrinsics.areEqual(this.f83609a, ((GetMeetingRoomsStatusInformationResponse) obj).f83609a);
        }
        return true;
    }

    public int hashCode() {
        Map<String, StatusInformation> map = this.f83609a;
        if (map != null) {
            return map.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "GetMeetingRoomsStatusInformationResponse(statusInformation=" + this.f83609a + ")";
    }

    /* renamed from: a */
    public final Map<String, StatusInformation> mo120090a() {
        return this.f83609a;
    }

    /* renamed from: a */
    public final void mo120091a(Map<String, StatusInformation> map) {
        this.f83609a = map;
    }

    public GetMeetingRoomsStatusInformationResponse(Map<String, StatusInformation> map) {
        this.f83609a = map;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GetMeetingRoomsStatusInformationResponse(Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : map);
    }
}
