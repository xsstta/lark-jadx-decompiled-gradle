package com.ss.android.lark.calendar.impl.features.meetingroom.append.data;

import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttendee;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B?\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0002\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\u0011\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J\t\u0010\u0019\u001a\u00020\nHÆ\u0003J\t\u0010\u001a\u001a\u00020\nHÆ\u0003JC\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\n2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\"HÖ\u0001R\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0011R\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006#"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/data/ResourceAppendFragmentData;", "Ljava/io/Serializable;", "eventData", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/data/EventData;", "requestResourceData", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/data/RequestResourceData;", "chosenMeetingRooms", "", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventAttendee;", "isShowMultiSelect", "", "isDisableApprovalMeetingRoom", "(Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/data/EventData;Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/data/RequestResourceData;Ljava/util/List;ZZ)V", "getChosenMeetingRooms", "()Ljava/util/List;", "getEventData", "()Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/data/EventData;", "()Z", "setShowMultiSelect", "(Z)V", "getRequestResourceData", "()Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/data/RequestResourceData;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "", "hashCode", "", "toString", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class ResourceAppendFragmentData implements Serializable {
    private final List<CalendarEventAttendee> chosenMeetingRooms;
    private final EventData eventData;
    private final boolean isDisableApprovalMeetingRoom;
    private boolean isShowMultiSelect;
    private final RequestResourceData requestResourceData;

    public ResourceAppendFragmentData() {
        this(null, null, null, false, false, 31, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.ss.android.lark.calendar.impl.features.meetingroom.append.data.ResourceAppendFragmentData */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ResourceAppendFragmentData copy$default(ResourceAppendFragmentData resourceAppendFragmentData, EventData eventData2, RequestResourceData requestResourceData2, List list, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            eventData2 = resourceAppendFragmentData.eventData;
        }
        if ((i & 2) != 0) {
            requestResourceData2 = resourceAppendFragmentData.requestResourceData;
        }
        if ((i & 4) != 0) {
            list = resourceAppendFragmentData.chosenMeetingRooms;
        }
        if ((i & 8) != 0) {
            z = resourceAppendFragmentData.isShowMultiSelect;
        }
        if ((i & 16) != 0) {
            z2 = resourceAppendFragmentData.isDisableApprovalMeetingRoom;
        }
        return resourceAppendFragmentData.copy(eventData2, requestResourceData2, list, z, z2);
    }

    public final EventData component1() {
        return this.eventData;
    }

    public final RequestResourceData component2() {
        return this.requestResourceData;
    }

    public final List<CalendarEventAttendee> component3() {
        return this.chosenMeetingRooms;
    }

    public final boolean component4() {
        return this.isShowMultiSelect;
    }

    public final boolean component5() {
        return this.isDisableApprovalMeetingRoom;
    }

    public final ResourceAppendFragmentData copy(EventData eventData2, RequestResourceData requestResourceData2, List<? extends CalendarEventAttendee> list, boolean z, boolean z2) {
        Intrinsics.checkParameterIsNotNull(eventData2, "eventData");
        Intrinsics.checkParameterIsNotNull(requestResourceData2, "requestResourceData");
        return new ResourceAppendFragmentData(eventData2, requestResourceData2, list, z, z2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResourceAppendFragmentData)) {
            return false;
        }
        ResourceAppendFragmentData resourceAppendFragmentData = (ResourceAppendFragmentData) obj;
        return Intrinsics.areEqual(this.eventData, resourceAppendFragmentData.eventData) && Intrinsics.areEqual(this.requestResourceData, resourceAppendFragmentData.requestResourceData) && Intrinsics.areEqual(this.chosenMeetingRooms, resourceAppendFragmentData.chosenMeetingRooms) && this.isShowMultiSelect == resourceAppendFragmentData.isShowMultiSelect && this.isDisableApprovalMeetingRoom == resourceAppendFragmentData.isDisableApprovalMeetingRoom;
    }

    public int hashCode() {
        EventData eventData2 = this.eventData;
        int i = 0;
        int hashCode = (eventData2 != null ? eventData2.hashCode() : 0) * 31;
        RequestResourceData requestResourceData2 = this.requestResourceData;
        int hashCode2 = (hashCode + (requestResourceData2 != null ? requestResourceData2.hashCode() : 0)) * 31;
        List<CalendarEventAttendee> list = this.chosenMeetingRooms;
        if (list != null) {
            i = list.hashCode();
        }
        int i2 = (hashCode2 + i) * 31;
        boolean z = this.isShowMultiSelect;
        int i3 = 1;
        if (z) {
            z = true;
        }
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = z ? 1 : 0;
        int i7 = (i2 + i4) * 31;
        boolean z2 = this.isDisableApprovalMeetingRoom;
        if (!z2) {
            i3 = z2 ? 1 : 0;
        }
        return i7 + i3;
    }

    public String toString() {
        return "ResourceAppendFragmentData(eventData=" + this.eventData + ", requestResourceData=" + this.requestResourceData + ", chosenMeetingRooms=" + this.chosenMeetingRooms + ", isShowMultiSelect=" + this.isShowMultiSelect + ", isDisableApprovalMeetingRoom=" + this.isDisableApprovalMeetingRoom + ")";
    }

    public final List<CalendarEventAttendee> getChosenMeetingRooms() {
        return this.chosenMeetingRooms;
    }

    public final EventData getEventData() {
        return this.eventData;
    }

    public final RequestResourceData getRequestResourceData() {
        return this.requestResourceData;
    }

    public final boolean isDisableApprovalMeetingRoom() {
        return this.isDisableApprovalMeetingRoom;
    }

    public final boolean isShowMultiSelect() {
        return this.isShowMultiSelect;
    }

    public final void setShowMultiSelect(boolean z) {
        this.isShowMultiSelect = z;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.util.List<? extends com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttendee> */
    /* JADX WARN: Multi-variable type inference failed */
    public ResourceAppendFragmentData(EventData eventData2, RequestResourceData requestResourceData2, List<? extends CalendarEventAttendee> list, boolean z, boolean z2) {
        Intrinsics.checkParameterIsNotNull(eventData2, "eventData");
        Intrinsics.checkParameterIsNotNull(requestResourceData2, "requestResourceData");
        this.eventData = eventData2;
        this.requestResourceData = requestResourceData2;
        this.chosenMeetingRooms = list;
        this.isShowMultiSelect = z;
        this.isDisableApprovalMeetingRoom = z2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ ResourceAppendFragmentData(com.ss.android.lark.calendar.impl.features.meetingroom.append.data.EventData r13, com.ss.android.lark.calendar.impl.features.meetingroom.append.data.RequestResourceData r14, java.util.List r15, boolean r16, boolean r17, int r18, kotlin.jvm.internal.DefaultConstructorMarker r19) {
        /*
            r12 = this;
            r0 = r18 & 1
            if (r0 == 0) goto L_0x0016
            com.ss.android.lark.calendar.impl.features.meetingroom.append.data.EventData r0 = new com.ss.android.lark.calendar.impl.features.meetingroom.append.data.EventData
            r2 = 0
            r4 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r10 = 31
            r11 = 0
            r1 = r0
            r1.<init>(r2, r4, r6, r7, r8, r10, r11)
            goto L_0x0017
        L_0x0016:
            r0 = r13
        L_0x0017:
            r1 = r18 & 2
            if (r1 == 0) goto L_0x0027
            com.ss.android.lark.calendar.impl.features.meetingroom.append.data.RequestResourceData r1 = new com.ss.android.lark.calendar.impl.features.meetingroom.append.data.RequestResourceData
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 7
            r7 = 0
            r2 = r1
            r2.<init>(r3, r4, r5, r6, r7)
            goto L_0x0028
        L_0x0027:
            r1 = r14
        L_0x0028:
            r2 = r18 & 4
            if (r2 == 0) goto L_0x0030
            r2 = 0
            java.util.List r2 = (java.util.List) r2
            goto L_0x0031
        L_0x0030:
            r2 = r15
        L_0x0031:
            r3 = r18 & 8
            r4 = 1
            if (r3 == 0) goto L_0x0038
            r3 = 1
            goto L_0x003a
        L_0x0038:
            r3 = r16
        L_0x003a:
            r5 = r18 & 16
            if (r5 == 0) goto L_0x003f
            goto L_0x0041
        L_0x003f:
            r4 = r17
        L_0x0041:
            r13 = r12
            r14 = r0
            r15 = r1
            r16 = r2
            r17 = r3
            r18 = r4
            r13.<init>(r14, r15, r16, r17, r18)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.calendar.impl.features.meetingroom.append.data.ResourceAppendFragmentData.<init>(com.ss.android.lark.calendar.impl.features.meetingroom.append.data.EventData, com.ss.android.lark.calendar.impl.features.meetingroom.append.data.RequestResourceData, java.util.List, boolean, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
