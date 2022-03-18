package com.ss.android.lark.calendar.impl.rustadapter.doentity;

import com.bytedance.lark.pb.calendar.v1.CalendarEventDisplayInfo;
import com.huawei.hms.feature.dynamic.DynamicModule;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import com.ss.ttm.player.MediaPlayer;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\fHÆ\u0003J\t\u0010\u0019\u001a\u00020\u000fHÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\fHÆ\u0003Jw\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u000fHÆ\u0001J\u0013\u0010#\u001a\u00020\u00032\b\u0010$\u001a\u0004\u0018\u00010%HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020)HÖ\u0001R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0013R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0013R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0013R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0013R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\r\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015¨\u0006*"}, d2 = {"Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventDisplayInfo;", "Ljava/io/Serializable;", "isEditableBtnShow", "", "isSharableBtnShow", "isDeletableBtnShow", "isTransferBtnShow", "isVideoMeetingBtnShow", "isReportBtnShow", "isEventCreatorShow", "isEventOrganizerShow", "meetingChatBtnDisplayType", "Lcom/bytedance/lark/pb/calendar/v1/CalendarEventDisplayInfo$ButtonDisplayType;", "meetingMinutesBtnDisplayType", "displayExtraData", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventDisplayExtraData;", "(ZZZZZZZZLcom/bytedance/lark/pb/calendar/v1/CalendarEventDisplayInfo$ButtonDisplayType;Lcom/bytedance/lark/pb/calendar/v1/CalendarEventDisplayInfo$ButtonDisplayType;Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventDisplayExtraData;)V", "getDisplayExtraData", "()Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventDisplayExtraData;", "()Z", "getMeetingChatBtnDisplayType", "()Lcom/bytedance/lark/pb/calendar/v1/CalendarEventDisplayInfo$ButtonDisplayType;", "getMeetingMinutesBtnDisplayType", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "", "hashCode", "", "toString", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class CalendarEventDisplayInfo implements Serializable {
    private final CalendarEventDisplayExtraData displayExtraData;
    private final boolean isDeletableBtnShow;
    private final boolean isEditableBtnShow;
    private final boolean isEventCreatorShow;
    private final boolean isEventOrganizerShow;
    private final boolean isReportBtnShow;
    private final boolean isSharableBtnShow;
    private final boolean isTransferBtnShow;
    private final boolean isVideoMeetingBtnShow;
    private final CalendarEventDisplayInfo.ButtonDisplayType meetingChatBtnDisplayType;
    private final CalendarEventDisplayInfo.ButtonDisplayType meetingMinutesBtnDisplayType;

    public static /* synthetic */ CalendarEventDisplayInfo copy$default(CalendarEventDisplayInfo calendarEventDisplayInfo, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, CalendarEventDisplayInfo.ButtonDisplayType buttonDisplayType, CalendarEventDisplayInfo.ButtonDisplayType buttonDisplayType2, CalendarEventDisplayExtraData calendarEventDisplayExtraData, int i, Object obj) {
        return calendarEventDisplayInfo.copy((i & 1) != 0 ? calendarEventDisplayInfo.isEditableBtnShow : z, (i & 2) != 0 ? calendarEventDisplayInfo.isSharableBtnShow : z2, (i & 4) != 0 ? calendarEventDisplayInfo.isDeletableBtnShow : z3, (i & 8) != 0 ? calendarEventDisplayInfo.isTransferBtnShow : z4, (i & 16) != 0 ? calendarEventDisplayInfo.isVideoMeetingBtnShow : z5, (i & 32) != 0 ? calendarEventDisplayInfo.isReportBtnShow : z6, (i & 64) != 0 ? calendarEventDisplayInfo.isEventCreatorShow : z7, (i & SmActions.ACTION_ONTHECALL_EXIT) != 0 ? calendarEventDisplayInfo.isEventOrganizerShow : z8, (i & DynamicModule.f58006b) != 0 ? calendarEventDisplayInfo.meetingChatBtnDisplayType : buttonDisplayType, (i & MediaPlayer.MEDIA_PLAYER_OPTION_APPID) != 0 ? calendarEventDisplayInfo.meetingMinutesBtnDisplayType : buttonDisplayType2, (i & 1024) != 0 ? calendarEventDisplayInfo.displayExtraData : calendarEventDisplayExtraData);
    }

    public final boolean component1() {
        return this.isEditableBtnShow;
    }

    public final CalendarEventDisplayInfo.ButtonDisplayType component10() {
        return this.meetingMinutesBtnDisplayType;
    }

    public final CalendarEventDisplayExtraData component11() {
        return this.displayExtraData;
    }

    public final boolean component2() {
        return this.isSharableBtnShow;
    }

    public final boolean component3() {
        return this.isDeletableBtnShow;
    }

    public final boolean component4() {
        return this.isTransferBtnShow;
    }

    public final boolean component5() {
        return this.isVideoMeetingBtnShow;
    }

    public final boolean component6() {
        return this.isReportBtnShow;
    }

    public final boolean component7() {
        return this.isEventCreatorShow;
    }

    public final boolean component8() {
        return this.isEventOrganizerShow;
    }

    public final CalendarEventDisplayInfo.ButtonDisplayType component9() {
        return this.meetingChatBtnDisplayType;
    }

    public final CalendarEventDisplayInfo copy(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, CalendarEventDisplayInfo.ButtonDisplayType buttonDisplayType, CalendarEventDisplayInfo.ButtonDisplayType buttonDisplayType2, CalendarEventDisplayExtraData calendarEventDisplayExtraData) {
        Intrinsics.checkParameterIsNotNull(buttonDisplayType, "meetingChatBtnDisplayType");
        Intrinsics.checkParameterIsNotNull(buttonDisplayType2, "meetingMinutesBtnDisplayType");
        Intrinsics.checkParameterIsNotNull(calendarEventDisplayExtraData, "displayExtraData");
        return new CalendarEventDisplayInfo(z, z2, z3, z4, z5, z6, z7, z8, buttonDisplayType, buttonDisplayType2, calendarEventDisplayExtraData);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CalendarEventDisplayInfo)) {
            return false;
        }
        CalendarEventDisplayInfo calendarEventDisplayInfo = (CalendarEventDisplayInfo) obj;
        return this.isEditableBtnShow == calendarEventDisplayInfo.isEditableBtnShow && this.isSharableBtnShow == calendarEventDisplayInfo.isSharableBtnShow && this.isDeletableBtnShow == calendarEventDisplayInfo.isDeletableBtnShow && this.isTransferBtnShow == calendarEventDisplayInfo.isTransferBtnShow && this.isVideoMeetingBtnShow == calendarEventDisplayInfo.isVideoMeetingBtnShow && this.isReportBtnShow == calendarEventDisplayInfo.isReportBtnShow && this.isEventCreatorShow == calendarEventDisplayInfo.isEventCreatorShow && this.isEventOrganizerShow == calendarEventDisplayInfo.isEventOrganizerShow && Intrinsics.areEqual(this.meetingChatBtnDisplayType, calendarEventDisplayInfo.meetingChatBtnDisplayType) && Intrinsics.areEqual(this.meetingMinutesBtnDisplayType, calendarEventDisplayInfo.meetingMinutesBtnDisplayType) && Intrinsics.areEqual(this.displayExtraData, calendarEventDisplayInfo.displayExtraData);
    }

    public int hashCode() {
        boolean z = this.isEditableBtnShow;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = i2 * 31;
        boolean z2 = this.isSharableBtnShow;
        if (z2) {
            z2 = true;
        }
        int i6 = z2 ? 1 : 0;
        int i7 = z2 ? 1 : 0;
        int i8 = z2 ? 1 : 0;
        int i9 = (i5 + i6) * 31;
        boolean z3 = this.isDeletableBtnShow;
        if (z3) {
            z3 = true;
        }
        int i10 = z3 ? 1 : 0;
        int i11 = z3 ? 1 : 0;
        int i12 = z3 ? 1 : 0;
        int i13 = (i9 + i10) * 31;
        boolean z4 = this.isTransferBtnShow;
        if (z4) {
            z4 = true;
        }
        int i14 = z4 ? 1 : 0;
        int i15 = z4 ? 1 : 0;
        int i16 = z4 ? 1 : 0;
        int i17 = (i13 + i14) * 31;
        boolean z5 = this.isVideoMeetingBtnShow;
        if (z5) {
            z5 = true;
        }
        int i18 = z5 ? 1 : 0;
        int i19 = z5 ? 1 : 0;
        int i20 = z5 ? 1 : 0;
        int i21 = (i17 + i18) * 31;
        boolean z6 = this.isReportBtnShow;
        if (z6) {
            z6 = true;
        }
        int i22 = z6 ? 1 : 0;
        int i23 = z6 ? 1 : 0;
        int i24 = z6 ? 1 : 0;
        int i25 = (i21 + i22) * 31;
        boolean z7 = this.isEventCreatorShow;
        if (z7) {
            z7 = true;
        }
        int i26 = z7 ? 1 : 0;
        int i27 = z7 ? 1 : 0;
        int i28 = z7 ? 1 : 0;
        int i29 = (i25 + i26) * 31;
        boolean z8 = this.isEventOrganizerShow;
        if (!z8) {
            i = z8 ? 1 : 0;
        }
        int i30 = (i29 + i) * 31;
        CalendarEventDisplayInfo.ButtonDisplayType buttonDisplayType = this.meetingChatBtnDisplayType;
        int i31 = 0;
        int hashCode = (i30 + (buttonDisplayType != null ? buttonDisplayType.hashCode() : 0)) * 31;
        CalendarEventDisplayInfo.ButtonDisplayType buttonDisplayType2 = this.meetingMinutesBtnDisplayType;
        int hashCode2 = (hashCode + (buttonDisplayType2 != null ? buttonDisplayType2.hashCode() : 0)) * 31;
        CalendarEventDisplayExtraData calendarEventDisplayExtraData = this.displayExtraData;
        if (calendarEventDisplayExtraData != null) {
            i31 = calendarEventDisplayExtraData.hashCode();
        }
        return hashCode2 + i31;
    }

    public String toString() {
        return "CalendarEventDisplayInfo(isEditableBtnShow=" + this.isEditableBtnShow + ", isSharableBtnShow=" + this.isSharableBtnShow + ", isDeletableBtnShow=" + this.isDeletableBtnShow + ", isTransferBtnShow=" + this.isTransferBtnShow + ", isVideoMeetingBtnShow=" + this.isVideoMeetingBtnShow + ", isReportBtnShow=" + this.isReportBtnShow + ", isEventCreatorShow=" + this.isEventCreatorShow + ", isEventOrganizerShow=" + this.isEventOrganizerShow + ", meetingChatBtnDisplayType=" + this.meetingChatBtnDisplayType + ", meetingMinutesBtnDisplayType=" + this.meetingMinutesBtnDisplayType + ", displayExtraData=" + this.displayExtraData + ")";
    }

    public final CalendarEventDisplayExtraData getDisplayExtraData() {
        return this.displayExtraData;
    }

    public final CalendarEventDisplayInfo.ButtonDisplayType getMeetingChatBtnDisplayType() {
        return this.meetingChatBtnDisplayType;
    }

    public final CalendarEventDisplayInfo.ButtonDisplayType getMeetingMinutesBtnDisplayType() {
        return this.meetingMinutesBtnDisplayType;
    }

    public final boolean isDeletableBtnShow() {
        return this.isDeletableBtnShow;
    }

    public final boolean isEditableBtnShow() {
        return this.isEditableBtnShow;
    }

    public final boolean isEventCreatorShow() {
        return this.isEventCreatorShow;
    }

    public final boolean isEventOrganizerShow() {
        return this.isEventOrganizerShow;
    }

    public final boolean isReportBtnShow() {
        return this.isReportBtnShow;
    }

    public final boolean isSharableBtnShow() {
        return this.isSharableBtnShow;
    }

    public final boolean isTransferBtnShow() {
        return this.isTransferBtnShow;
    }

    public final boolean isVideoMeetingBtnShow() {
        return this.isVideoMeetingBtnShow;
    }

    public CalendarEventDisplayInfo(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, CalendarEventDisplayInfo.ButtonDisplayType buttonDisplayType, CalendarEventDisplayInfo.ButtonDisplayType buttonDisplayType2, CalendarEventDisplayExtraData calendarEventDisplayExtraData) {
        Intrinsics.checkParameterIsNotNull(buttonDisplayType, "meetingChatBtnDisplayType");
        Intrinsics.checkParameterIsNotNull(buttonDisplayType2, "meetingMinutesBtnDisplayType");
        Intrinsics.checkParameterIsNotNull(calendarEventDisplayExtraData, "displayExtraData");
        this.isEditableBtnShow = z;
        this.isSharableBtnShow = z2;
        this.isDeletableBtnShow = z3;
        this.isTransferBtnShow = z4;
        this.isVideoMeetingBtnShow = z5;
        this.isReportBtnShow = z6;
        this.isEventCreatorShow = z7;
        this.isEventOrganizerShow = z8;
        this.meetingChatBtnDisplayType = buttonDisplayType;
        this.meetingMinutesBtnDisplayType = buttonDisplayType2;
        this.displayExtraData = calendarEventDisplayExtraData;
    }
}
