package com.ss.android.lark.calendar.impl.features.events.edit.data;

import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarBuilding;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0006HÆ\u0003J\t\u0010\"\u001a\u00020\u0006HÆ\u0003J\t\u0010#\u001a\u00020\tHÆ\u0003J\t\u0010$\u001a\u00020\u000bHÆ\u0003JE\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010&\u001a\u00020\u00032\b\u0010'\u001a\u0004\u0018\u00010(HÖ\u0003J\t\u0010)\u001a\u00020*HÖ\u0001J\t\u0010+\u001a\u00020\tHÖ\u0001R\u001a\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0002\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0015\"\u0004\b\u0018\u0010\u0017R\u001a\u0010\b\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0012\"\u0004\b\u001e\u0010\u0014¨\u0006,"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/data/MeetingRoomFragmentData;", "Ljava/io/Serializable;", "isShowUsableContainer", "", "isShowUsableMeetingRoom", "startTime", "", "endTime", "rRule", "", "chosenBuilding", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarBuilding;", "(ZZJJLjava/lang/String;Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarBuilding;)V", "getChosenBuilding", "()Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarBuilding;", "setChosenBuilding", "(Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarBuilding;)V", "getEndTime", "()J", "setEndTime", "(J)V", "()Z", "setShowUsableContainer", "(Z)V", "setShowUsableMeetingRoom", "getRRule", "()Ljava/lang/String;", "setRRule", "(Ljava/lang/String;)V", "getStartTime", "setStartTime", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "", "hashCode", "", "toString", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class MeetingRoomFragmentData implements Serializable {
    private CalendarBuilding chosenBuilding;
    private long endTime;
    private boolean isShowUsableContainer;
    private boolean isShowUsableMeetingRoom;
    private String rRule;
    private long startTime;

    public static /* synthetic */ MeetingRoomFragmentData copy$default(MeetingRoomFragmentData meetingRoomFragmentData, boolean z, boolean z2, long j, long j2, String str, CalendarBuilding calendarBuilding, int i, Object obj) {
        return meetingRoomFragmentData.copy((i & 1) != 0 ? meetingRoomFragmentData.isShowUsableContainer : z, (i & 2) != 0 ? meetingRoomFragmentData.isShowUsableMeetingRoom : z2, (i & 4) != 0 ? meetingRoomFragmentData.startTime : j, (i & 8) != 0 ? meetingRoomFragmentData.endTime : j2, (i & 16) != 0 ? meetingRoomFragmentData.rRule : str, (i & 32) != 0 ? meetingRoomFragmentData.chosenBuilding : calendarBuilding);
    }

    public final boolean component1() {
        return this.isShowUsableContainer;
    }

    public final boolean component2() {
        return this.isShowUsableMeetingRoom;
    }

    public final long component3() {
        return this.startTime;
    }

    public final long component4() {
        return this.endTime;
    }

    public final String component5() {
        return this.rRule;
    }

    public final CalendarBuilding component6() {
        return this.chosenBuilding;
    }

    public final MeetingRoomFragmentData copy(boolean z, boolean z2, long j, long j2, String str, CalendarBuilding calendarBuilding) {
        Intrinsics.checkParameterIsNotNull(str, "rRule");
        Intrinsics.checkParameterIsNotNull(calendarBuilding, "chosenBuilding");
        return new MeetingRoomFragmentData(z, z2, j, j2, str, calendarBuilding);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MeetingRoomFragmentData)) {
            return false;
        }
        MeetingRoomFragmentData meetingRoomFragmentData = (MeetingRoomFragmentData) obj;
        return this.isShowUsableContainer == meetingRoomFragmentData.isShowUsableContainer && this.isShowUsableMeetingRoom == meetingRoomFragmentData.isShowUsableMeetingRoom && this.startTime == meetingRoomFragmentData.startTime && this.endTime == meetingRoomFragmentData.endTime && Intrinsics.areEqual(this.rRule, meetingRoomFragmentData.rRule) && Intrinsics.areEqual(this.chosenBuilding, meetingRoomFragmentData.chosenBuilding);
    }

    public int hashCode() {
        boolean z = this.isShowUsableContainer;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = i2 * 31;
        boolean z2 = this.isShowUsableMeetingRoom;
        if (!z2) {
            i = z2 ? 1 : 0;
        }
        long j = this.startTime;
        long j2 = this.endTime;
        int i6 = (((((i5 + i) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        String str = this.rRule;
        int i7 = 0;
        int hashCode = (i6 + (str != null ? str.hashCode() : 0)) * 31;
        CalendarBuilding calendarBuilding = this.chosenBuilding;
        if (calendarBuilding != null) {
            i7 = calendarBuilding.hashCode();
        }
        return hashCode + i7;
    }

    public String toString() {
        return "MeetingRoomFragmentData(isShowUsableContainer=" + this.isShowUsableContainer + ", isShowUsableMeetingRoom=" + this.isShowUsableMeetingRoom + ", startTime=" + this.startTime + ", endTime=" + this.endTime + ", rRule=" + this.rRule + ", chosenBuilding=" + this.chosenBuilding + ")";
    }

    public final CalendarBuilding getChosenBuilding() {
        return this.chosenBuilding;
    }

    public final long getEndTime() {
        return this.endTime;
    }

    public final String getRRule() {
        return this.rRule;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public final boolean isShowUsableContainer() {
        return this.isShowUsableContainer;
    }

    public final boolean isShowUsableMeetingRoom() {
        return this.isShowUsableMeetingRoom;
    }

    public final void setEndTime(long j) {
        this.endTime = j;
    }

    public final void setShowUsableContainer(boolean z) {
        this.isShowUsableContainer = z;
    }

    public final void setShowUsableMeetingRoom(boolean z) {
        this.isShowUsableMeetingRoom = z;
    }

    public final void setStartTime(long j) {
        this.startTime = j;
    }

    public final void setChosenBuilding(CalendarBuilding calendarBuilding) {
        Intrinsics.checkParameterIsNotNull(calendarBuilding, "<set-?>");
        this.chosenBuilding = calendarBuilding;
    }

    public final void setRRule(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.rRule = str;
    }

    public MeetingRoomFragmentData(boolean z, boolean z2, long j, long j2, String str, CalendarBuilding calendarBuilding) {
        Intrinsics.checkParameterIsNotNull(str, "rRule");
        Intrinsics.checkParameterIsNotNull(calendarBuilding, "chosenBuilding");
        this.isShowUsableContainer = z;
        this.isShowUsableMeetingRoom = z2;
        this.startTime = j;
        this.endTime = j2;
        this.rRule = str;
        this.chosenBuilding = calendarBuilding;
    }
}
