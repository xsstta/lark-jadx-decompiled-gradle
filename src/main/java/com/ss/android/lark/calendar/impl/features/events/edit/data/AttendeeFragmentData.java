package com.ss.android.lark.calendar.impl.features.events.edit.data;

import com.huawei.hms.feature.dynamic.DynamicModule;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttendee;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventUniqueField;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import com.ss.ttm.player.MediaPlayer;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b(\n\u0002\u0010\u0000\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001Bg\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0016\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0007¢\u0006\u0002\u0010\u0013J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0007HÆ\u0003J\t\u0010/\u001a\u00020\u0005HÆ\u0003J\t\u00100\u001a\u00020\u0007HÆ\u0003J\u0019\u00101\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000bHÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u00103\u001a\u00020\u0007HÆ\u0003J\t\u00104\u001a\u00020\u0007HÆ\u0003J\t\u00105\u001a\u00020\u0007HÆ\u0003J\t\u00106\u001a\u00020\u0011HÆ\u0003J\u00107\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0018\b\u0002\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u00072\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0007HÆ\u0001J\u0013\u00108\u001a\u00020\u00072\b\u00109\u001a\u0004\u0018\u00010:HÖ\u0003J\t\u0010;\u001a\u00020\u0005HÖ\u0001J\t\u0010<\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\f\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0010\u001a\u00020\u0011X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001a\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\"\"\u0004\b#\u0010$R\u001a\u0010\u000e\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\"\"\u0004\b%\u0010$R\u001a\u0010\r\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\"\"\u0004\b&\u0010$R\u001a\u0010\u0012\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\"\"\u0004\b'\u0010$R\u001a\u0010\u000f\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\"\"\u0004\b(\u0010$R*\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,¨\u0006="}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/data/AttendeeFragmentData;", "Ljava/io/Serializable;", "eventUniqueField", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventUniqueField;", "attendeeNum", "", "isCanInviteGuestOrModify", "", "showAttendeeList", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventAttendee;", "Lkotlin/collections/ArrayList;", "editorAttendee", "isGoogleEvent", "isExchangeEvent", "isPartDelete", "exchangeCalendarName", "", "isNeedLoadSimpleMember", "(Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventUniqueField;IZLjava/util/ArrayList;Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventAttendee;ZZZLjava/lang/String;Z)V", "getAttendeeNum", "()I", "getEditorAttendee", "()Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventAttendee;", "setEditorAttendee", "(Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventAttendee;)V", "getEventUniqueField", "()Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventUniqueField;", "setEventUniqueField", "(Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventUniqueField;)V", "getExchangeCalendarName", "()Ljava/lang/String;", "setExchangeCalendarName", "(Ljava/lang/String;)V", "()Z", "setCanInviteGuestOrModify", "(Z)V", "setExchangeEvent", "setGoogleEvent", "setNeedLoadSimpleMember", "setPartDelete", "getShowAttendeeList", "()Ljava/util/ArrayList;", "setShowAttendeeList", "(Ljava/util/ArrayList;)V", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "", "hashCode", "toString", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class AttendeeFragmentData implements Serializable {
    private final int attendeeNum;
    private CalendarEventAttendee editorAttendee;
    private CalendarEventUniqueField eventUniqueField;
    private String exchangeCalendarName;
    private boolean isCanInviteGuestOrModify;
    private boolean isExchangeEvent;
    private boolean isGoogleEvent;
    private boolean isNeedLoadSimpleMember;
    private boolean isPartDelete;
    private ArrayList<CalendarEventAttendee> showAttendeeList;

    public static /* synthetic */ AttendeeFragmentData copy$default(AttendeeFragmentData attendeeFragmentData, CalendarEventUniqueField bVar, int i, boolean z, ArrayList arrayList, CalendarEventAttendee calendarEventAttendee, boolean z2, boolean z3, boolean z4, String str, boolean z5, int i2, Object obj) {
        return attendeeFragmentData.copy((i2 & 1) != 0 ? attendeeFragmentData.eventUniqueField : bVar, (i2 & 2) != 0 ? attendeeFragmentData.attendeeNum : i, (i2 & 4) != 0 ? attendeeFragmentData.isCanInviteGuestOrModify : z, (i2 & 8) != 0 ? attendeeFragmentData.showAttendeeList : arrayList, (i2 & 16) != 0 ? attendeeFragmentData.editorAttendee : calendarEventAttendee, (i2 & 32) != 0 ? attendeeFragmentData.isGoogleEvent : z2, (i2 & 64) != 0 ? attendeeFragmentData.isExchangeEvent : z3, (i2 & SmActions.ACTION_ONTHECALL_EXIT) != 0 ? attendeeFragmentData.isPartDelete : z4, (i2 & DynamicModule.f58006b) != 0 ? attendeeFragmentData.exchangeCalendarName : str, (i2 & MediaPlayer.MEDIA_PLAYER_OPTION_APPID) != 0 ? attendeeFragmentData.isNeedLoadSimpleMember : z5);
    }

    public final CalendarEventUniqueField component1() {
        return this.eventUniqueField;
    }

    public final boolean component10() {
        return this.isNeedLoadSimpleMember;
    }

    public final int component2() {
        return this.attendeeNum;
    }

    public final boolean component3() {
        return this.isCanInviteGuestOrModify;
    }

    public final ArrayList<CalendarEventAttendee> component4() {
        return this.showAttendeeList;
    }

    public final CalendarEventAttendee component5() {
        return this.editorAttendee;
    }

    public final boolean component6() {
        return this.isGoogleEvent;
    }

    public final boolean component7() {
        return this.isExchangeEvent;
    }

    public final boolean component8() {
        return this.isPartDelete;
    }

    public final String component9() {
        return this.exchangeCalendarName;
    }

    public final AttendeeFragmentData copy(CalendarEventUniqueField bVar, int i, boolean z, ArrayList<CalendarEventAttendee> arrayList, CalendarEventAttendee calendarEventAttendee, boolean z2, boolean z3, boolean z4, String str, boolean z5) {
        Intrinsics.checkParameterIsNotNull(bVar, "eventUniqueField");
        Intrinsics.checkParameterIsNotNull(arrayList, "showAttendeeList");
        Intrinsics.checkParameterIsNotNull(str, "exchangeCalendarName");
        return new AttendeeFragmentData(bVar, i, z, arrayList, calendarEventAttendee, z2, z3, z4, str, z5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AttendeeFragmentData)) {
            return false;
        }
        AttendeeFragmentData attendeeFragmentData = (AttendeeFragmentData) obj;
        return Intrinsics.areEqual(this.eventUniqueField, attendeeFragmentData.eventUniqueField) && this.attendeeNum == attendeeFragmentData.attendeeNum && this.isCanInviteGuestOrModify == attendeeFragmentData.isCanInviteGuestOrModify && Intrinsics.areEqual(this.showAttendeeList, attendeeFragmentData.showAttendeeList) && Intrinsics.areEqual(this.editorAttendee, attendeeFragmentData.editorAttendee) && this.isGoogleEvent == attendeeFragmentData.isGoogleEvent && this.isExchangeEvent == attendeeFragmentData.isExchangeEvent && this.isPartDelete == attendeeFragmentData.isPartDelete && Intrinsics.areEqual(this.exchangeCalendarName, attendeeFragmentData.exchangeCalendarName) && this.isNeedLoadSimpleMember == attendeeFragmentData.isNeedLoadSimpleMember;
    }

    public int hashCode() {
        CalendarEventUniqueField bVar = this.eventUniqueField;
        int i = 0;
        int hashCode = (((bVar != null ? bVar.hashCode() : 0) * 31) + this.attendeeNum) * 31;
        boolean z = this.isCanInviteGuestOrModify;
        int i2 = 1;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = (hashCode + i3) * 31;
        ArrayList<CalendarEventAttendee> arrayList = this.showAttendeeList;
        int hashCode2 = (i6 + (arrayList != null ? arrayList.hashCode() : 0)) * 31;
        CalendarEventAttendee calendarEventAttendee = this.editorAttendee;
        int hashCode3 = (hashCode2 + (calendarEventAttendee != null ? calendarEventAttendee.hashCode() : 0)) * 31;
        boolean z2 = this.isGoogleEvent;
        if (z2) {
            z2 = true;
        }
        int i7 = z2 ? 1 : 0;
        int i8 = z2 ? 1 : 0;
        int i9 = z2 ? 1 : 0;
        int i10 = (hashCode3 + i7) * 31;
        boolean z3 = this.isExchangeEvent;
        if (z3) {
            z3 = true;
        }
        int i11 = z3 ? 1 : 0;
        int i12 = z3 ? 1 : 0;
        int i13 = z3 ? 1 : 0;
        int i14 = (i10 + i11) * 31;
        boolean z4 = this.isPartDelete;
        if (z4) {
            z4 = true;
        }
        int i15 = z4 ? 1 : 0;
        int i16 = z4 ? 1 : 0;
        int i17 = z4 ? 1 : 0;
        int i18 = (i14 + i15) * 31;
        String str = this.exchangeCalendarName;
        if (str != null) {
            i = str.hashCode();
        }
        int i19 = (i18 + i) * 31;
        boolean z5 = this.isNeedLoadSimpleMember;
        if (!z5) {
            i2 = z5 ? 1 : 0;
        }
        return i19 + i2;
    }

    public String toString() {
        return "AttendeeFragmentData(eventUniqueField=" + this.eventUniqueField + ", attendeeNum=" + this.attendeeNum + ", isCanInviteGuestOrModify=" + this.isCanInviteGuestOrModify + ", showAttendeeList=" + this.showAttendeeList + ", editorAttendee=" + this.editorAttendee + ", isGoogleEvent=" + this.isGoogleEvent + ", isExchangeEvent=" + this.isExchangeEvent + ", isPartDelete=" + this.isPartDelete + ", exchangeCalendarName=" + this.exchangeCalendarName + ", isNeedLoadSimpleMember=" + this.isNeedLoadSimpleMember + ")";
    }

    public final int getAttendeeNum() {
        return this.attendeeNum;
    }

    public final CalendarEventAttendee getEditorAttendee() {
        return this.editorAttendee;
    }

    public final CalendarEventUniqueField getEventUniqueField() {
        return this.eventUniqueField;
    }

    public final String getExchangeCalendarName() {
        return this.exchangeCalendarName;
    }

    public final ArrayList<CalendarEventAttendee> getShowAttendeeList() {
        return this.showAttendeeList;
    }

    public final boolean isCanInviteGuestOrModify() {
        return this.isCanInviteGuestOrModify;
    }

    public final boolean isExchangeEvent() {
        return this.isExchangeEvent;
    }

    public final boolean isGoogleEvent() {
        return this.isGoogleEvent;
    }

    public final boolean isNeedLoadSimpleMember() {
        return this.isNeedLoadSimpleMember;
    }

    public final boolean isPartDelete() {
        return this.isPartDelete;
    }

    public final void setCanInviteGuestOrModify(boolean z) {
        this.isCanInviteGuestOrModify = z;
    }

    public final void setEditorAttendee(CalendarEventAttendee calendarEventAttendee) {
        this.editorAttendee = calendarEventAttendee;
    }

    public final void setExchangeEvent(boolean z) {
        this.isExchangeEvent = z;
    }

    public final void setGoogleEvent(boolean z) {
        this.isGoogleEvent = z;
    }

    public final void setNeedLoadSimpleMember(boolean z) {
        this.isNeedLoadSimpleMember = z;
    }

    public final void setPartDelete(boolean z) {
        this.isPartDelete = z;
    }

    public final void setEventUniqueField(CalendarEventUniqueField bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "<set-?>");
        this.eventUniqueField = bVar;
    }

    public final void setExchangeCalendarName(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.exchangeCalendarName = str;
    }

    public final void setShowAttendeeList(ArrayList<CalendarEventAttendee> arrayList) {
        Intrinsics.checkParameterIsNotNull(arrayList, "<set-?>");
        this.showAttendeeList = arrayList;
    }

    public AttendeeFragmentData(CalendarEventUniqueField bVar, int i, boolean z, ArrayList<CalendarEventAttendee> arrayList, CalendarEventAttendee calendarEventAttendee, boolean z2, boolean z3, boolean z4, String str, boolean z5) {
        Intrinsics.checkParameterIsNotNull(bVar, "eventUniqueField");
        Intrinsics.checkParameterIsNotNull(arrayList, "showAttendeeList");
        Intrinsics.checkParameterIsNotNull(str, "exchangeCalendarName");
        this.eventUniqueField = bVar;
        this.attendeeNum = i;
        this.isCanInviteGuestOrModify = z;
        this.showAttendeeList = arrayList;
        this.editorAttendee = calendarEventAttendee;
        this.isGoogleEvent = z2;
        this.isExchangeEvent = z3;
        this.isPartDelete = z4;
        this.exchangeCalendarName = str;
        this.isNeedLoadSimpleMember = z5;
    }
}
