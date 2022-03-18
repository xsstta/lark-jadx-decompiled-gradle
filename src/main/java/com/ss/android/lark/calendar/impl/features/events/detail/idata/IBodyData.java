package com.ss.android.lark.calendar.impl.features.events.detail.idata;

import com.ss.android.lark.calendar.api.entity.CalendarPstnDetailInfo;
import com.ss.android.lark.calendar.impl.features.common.widget.attachment.AttachmentItemData;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttendee;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.DoVideoMeeting;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\bf\u0018\u00002\u00020\u0001:\u0007?@ABCDEJ\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u0018\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bH&J\b\u0010\t\u001a\u00020\nH&J\b\u0010\u000b\u001a\u00020\nH&J\b\u0010\f\u001a\u00020\rH&J\b\u0010\u000e\u001a\u00020\nH&J\b\u0010\u000f\u001a\u00020\u0010H&J\b\u0010\u0011\u001a\u00020\nH&J\b\u0010\u0012\u001a\u00020\nH&J\b\u0010\u0013\u001a\u00020\nH&J\u000f\u0010\u0014\u001a\u0004\u0018\u00010\u0015H&¢\u0006\u0002\u0010\u0016J\u000f\u0010\u0017\u001a\u0004\u0018\u00010\u0015H&¢\u0006\u0002\u0010\u0016J\u000f\u0010\u0018\u001a\u0004\u0018\u00010\u0015H&¢\u0006\u0002\u0010\u0016J\b\u0010\u0019\u001a\u00020\u0010H&J\b\u0010\u001a\u001a\u00020\nH&J\b\u0010\u001b\u001a\u00020\nH&J\b\u0010\u001c\u001a\u00020\u001dH&J\b\u0010\u001e\u001a\u00020\nH&J\b\u0010\u001f\u001a\u00020 H&J\b\u0010!\u001a\u00020\nH&J\b\u0010\"\u001a\u00020\nH&J\b\u0010#\u001a\u00020\nH&J\b\u0010$\u001a\u00020%H&J\u000e\u0010&\u001a\b\u0012\u0004\u0012\u00020'0\u0003H&J\n\u0010(\u001a\u0004\u0018\u00010)H&J\b\u0010*\u001a\u00020\nH&J\n\u0010+\u001a\u0004\u0018\u00010,H&J\b\u0010-\u001a\u00020.H&J\n\u0010/\u001a\u0004\u0018\u000100H&J\b\u00101\u001a\u00020\u0010H&J\b\u00102\u001a\u00020\u0010H&J\b\u00103\u001a\u00020\u0010H&J\b\u00104\u001a\u00020\u0010H&J\b\u00105\u001a\u00020\u0010H&J\b\u00106\u001a\u00020\u0010H&J\b\u00107\u001a\u00020\u0010H&J\b\u00108\u001a\u00020\u0010H&J\b\u00109\u001a\u00020\u0010H&J\b\u0010:\u001a\u00020\u0010H&J\b\u0010;\u001a\u00020\u0010H&J\b\u0010<\u001a\u00020\u0010H&J\b\u0010=\u001a\u00020\u0010H&J\b\u0010>\u001a\u00020\u0010H&¨\u0006F"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/detail/idata/IBodyData;", "", "getAttachmentDatas", "", "Lcom/ss/android/lark/calendar/impl/features/common/widget/attachment/AttachmentItemData;", "getAttendeeDatas", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/calendar/impl/features/events/detail/idata/IBodyData$IAttendeeDetailData;", "Lkotlin/collections/ArrayList;", "getAttendeeNumDetailText", "", "getAttendeeNumText", "getAttendeeVisiblility", "Lcom/ss/android/lark/calendar/impl/features/events/detail/idata/IBodyData$AttendeeVisibility;", "getCalendarSummary", "getCanEditEvent", "", "getCreatorDisplayName", "getDescriptionRichData", "getDescriptionTextData", "getDueTime", "", "()Ljava/lang/Long;", "getDueTimeClientReqStartTime", "getDueTimeServerReqTime", "getEventIsCrossTenant", "getEventScopeText", "getEventServerId", "getEventSource", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEvent$Source;", "getEventStartTime", "getEventType", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEvent$Type;", "getFragmentAttendeeNumText", "getFreeBusyText", "getLiveEventId", "getLocationData", "Lcom/ss/android/lark/calendar/impl/features/events/detail/idata/IBodyData$ILocationData;", "getMeetingRoomDatas", "Lcom/ss/android/lark/calendar/impl/features/events/detail/idata/IBodyData$IMeetingRoomData;", "getOrganizerData", "Lcom/ss/android/lark/calendar/impl/features/events/detail/idata/IBodyData$IOrganizerData;", "getReminderText", "getVideoMeeting", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/DoVideoMeeting;", "getVideoMeetingVisibility", "Lcom/ss/android/lark/calendar/impl/features/events/detail/idata/VideoMeetingVisibility;", "getVideoPstnDetailInfo", "Lcom/ss/android/lark/calendar/api/entity/CalendarPstnDetailInfo;", "isCreatorResigned", "isShowAttachment", "isShowCalendarResignedLabel", "isShowCalendarSummary", "isShowCreator", "isShowEventScope", "isShowFreeBusy", "isShowLocation", "isShowMeetingRoom", "isShowNotOrganizerTip", "isShowOrganizer", "isShowReminder", "isShowRichDescription", "isShowTextDescription", "AttendeeVisibility", "IAttendeeBaseData", "IAttendeeDetailData", "IEventPartData", "ILocationData", "IMeetingRoomData", "IOrganizerData", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public interface IBodyData {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/detail/idata/IBodyData$AttendeeVisibility;", "", "(Ljava/lang/String;I)V", "SHOW", "HIDDEN", "GONE", "SHOWINLINE", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum AttendeeVisibility {
        SHOW,
        HIDDEN,
        GONE,
        SHOWINLINE
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001:\u0001\u000fJ\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\u0003H&J\b\u0010\b\u001a\u00020\tH&J\b\u0010\n\u001a\u00020\tH&J\b\u0010\u000b\u001a\u00020\tH&J\b\u0010\f\u001a\u00020\tH&J\b\u0010\r\u001a\u00020\tH&J\b\u0010\u000e\u001a\u00020\tH&¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/detail/idata/IBodyData$IMeetingRoomData;", "", "getCalendarId", "", "getMeetingRoomName", "getReservationStatus", "", "getRoomAppLink", "hasResourceApprovalRequest", "", "isDisabled", "isMeetingRoomApproval", "isMeetingRoomForceReleased", "isMeetingRoomRequisitioned", "isMyMeetingRoom", "ReservationStatus", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    public interface IMeetingRoomData {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/detail/idata/IBodyData$IMeetingRoomData$ReservationStatus;", "", "(Ljava/lang/String;I)V", "ACCEPT", "REFUSE", "RESERVING", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
        public enum ReservationStatus {
            ACCEPT,
            REFUSE,
            RESERVING
        }

        /* renamed from: a */
        int mo113626a();

        /* renamed from: b */
        String mo113627b();

        /* renamed from: c */
        boolean mo113628c();

        /* renamed from: d */
        boolean mo113629d();

        /* renamed from: e */
        String mo113630e();

        /* renamed from: f */
        String mo113631f();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\b\u0010\u0006\u001a\u00020\u0003H&J\b\u0010\u0007\u001a\u00020\u0003H&J\b\u0010\b\u001a\u00020\tH&J\b\u0010\n\u001a\u00020\u000bH&¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/detail/idata/IBodyData$IAttendeeBaseData;", "", "getAvatarEntityId", "", "getAvatarKey", "getCalendarId", "getEmail", "getLocalizedDisplayName", "getRSVPStatus", "Lcom/ss/android/lark/calendar/impl/features/events/detail/idata/RSVPStatus;", "isThirdPartyAttendee", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData$a */
    public interface IAttendeeBaseData {
        /* renamed from: a */
        String mo113375a();

        /* renamed from: b */
        String mo113376b();

        /* renamed from: c */
        boolean mo113377c();

        /* renamed from: d */
        String mo113378d();

        /* renamed from: e */
        String mo113379e();

        /* renamed from: f */
        String mo113380f();

        /* renamed from: p */
        RSVPStatus mo113390p();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\u0007H&J\b\u0010\t\u001a\u00020\nH&J\b\u0010\u000b\u001a\u00020\nH&J\b\u0010\f\u001a\u00020\nH&J\b\u0010\r\u001a\u00020\nH&J\b\u0010\u000e\u001a\u00020\nH&J\b\u0010\u000f\u001a\u00020\nH&¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/detail/idata/IBodyData$IAttendeeDetailData;", "Lcom/ss/android/lark/calendar/impl/features/events/detail/idata/IBodyData$IAttendeeBaseData;", "getCalendarEventAttendee", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventAttendee;", "getGroupId", "", "getGroupMemberSum", "", "getShowMemberLimit", "hasRemoveGroupMember", "", "isCrossTenant", "isGroup", "isJoinedGroup", "isOpenSecurity", "isOptional", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData$b */
    public interface IAttendeeDetailData extends IAttendeeBaseData {
        /* renamed from: g */
        boolean mo113381g();

        /* renamed from: h */
        String mo113382h();

        /* renamed from: i */
        boolean mo113383i();

        /* renamed from: j */
        boolean mo113384j();

        /* renamed from: k */
        boolean mo113385k();

        /* renamed from: l */
        int mo113386l();

        /* renamed from: m */
        int mo113387m();

        /* renamed from: n */
        boolean mo113388n();

        /* renamed from: o */
        boolean mo113389o();

        /* renamed from: q */
        CalendarEventAttendee mo113391q();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0003H&J\u000f\u0010\u0007\u001a\u0004\u0018\u00010\bH&¢\u0006\u0002\u0010\tJ\b\u0010\n\u001a\u00020\u000bH&¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/detail/idata/IBodyData$IEventPartData;", "", "getCalendarId", "", "getEventIndividualPageToken", "getEventVersion", "getKey", "getOriginalTime", "", "()Ljava/lang/Long;", "hasAllIndividualAttendee", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData$c */
    public interface IEventPartData {
        /* renamed from: a */
        String mo113620a();

        /* renamed from: b */
        String mo113621b();

        /* renamed from: c */
        Long mo113622c();

        /* renamed from: d */
        String mo113623d();

        /* renamed from: e */
        String mo113624e();

        /* renamed from: f */
        boolean mo113625f();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&J\b\u0010\u0007\u001a\u00020\u0005H&J\b\u0010\b\u001a\u00020\tH&J\b\u0010\n\u001a\u00020\tH&J\b\u0010\u000b\u001a\u00020\tH&¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/detail/idata/IBodyData$ILocationData;", "", "getAddress", "", "getLatitude", "", "getLocation", "getLongitude", "isShowAddress", "", "isShowLocation", "isShowMapView", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData$d */
    public interface ILocationData {
        /* renamed from: a */
        boolean mo113607a();

        /* renamed from: b */
        String mo113608b();

        /* renamed from: c */
        boolean mo113609c();

        /* renamed from: d */
        String mo113610d();

        /* renamed from: e */
        boolean mo113611e();

        /* renamed from: f */
        double mo113612f();

        /* renamed from: g */
        double mo113613g();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/detail/idata/IBodyData$IOrganizerData;", "Lcom/ss/android/lark/calendar/impl/features/events/detail/idata/IBodyData$IAttendeeBaseData;", "getOrganizerLabel", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData$e */
    public interface IOrganizerData extends IAttendeeBaseData {
        /* renamed from: g */
        int mo113632g();
    }

    /* renamed from: A */
    boolean mo113633A();

    /* renamed from: B */
    boolean mo113634B();

    /* renamed from: C */
    String mo113635C();

    /* renamed from: D */
    VideoMeetingVisibility mo113636D();

    /* renamed from: E */
    DoVideoMeeting mo113637E();

    /* renamed from: F */
    CalendarPstnDetailInfo mo113638F();

    /* renamed from: G */
    boolean mo113639G();

    /* renamed from: H */
    Long mo113640H();

    /* renamed from: I */
    Long mo113641I();

    /* renamed from: J */
    Long mo113642J();

    /* renamed from: K */
    boolean mo113643K();

    /* renamed from: L */
    CalendarEvent.Type mo113644L();

    /* renamed from: M */
    CalendarEvent.Source mo113645M();

    /* renamed from: N */
    String mo113646N();

    /* renamed from: O */
    String mo113647O();

    /* renamed from: P */
    String mo113648P();

    /* renamed from: a */
    boolean mo113649a();

    /* renamed from: b */
    List<IMeetingRoomData> mo113650b();

    /* renamed from: c */
    boolean mo113651c();

    /* renamed from: d */
    ILocationData mo113652d();

    /* renamed from: e */
    AttendeeVisibility mo113653e();

    /* renamed from: f */
    String mo113654f();

    /* renamed from: g */
    String mo113655g();

    /* renamed from: h */
    String mo113656h();

    /* renamed from: i */
    ArrayList<IAttendeeDetailData> mo113657i();

    /* renamed from: j */
    boolean mo113658j();

    /* renamed from: k */
    String mo113659k();

    /* renamed from: l */
    boolean mo113660l();

    /* renamed from: m */
    String mo113661m();

    /* renamed from: n */
    boolean mo113662n();

    /* renamed from: o */
    String mo113663o();

    /* renamed from: p */
    boolean mo113664p();

    /* renamed from: q */
    List<AttachmentItemData> mo113665q();

    /* renamed from: r */
    boolean mo113666r();

    /* renamed from: s */
    boolean mo113667s();

    /* renamed from: t */
    String mo113668t();

    /* renamed from: u */
    String mo113669u();

    /* renamed from: v */
    boolean mo113670v();

    /* renamed from: w */
    boolean mo113671w();

    /* renamed from: x */
    String mo113672x();

    /* renamed from: y */
    boolean mo113673y();

    /* renamed from: z */
    IOrganizerData mo113674z();
}
