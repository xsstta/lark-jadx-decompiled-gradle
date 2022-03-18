package com.ss.android.lark.calendar.impl.features.events.detail.viewdata;

import android.text.TextUtils;
import com.bytedance.lark.pb.calendar.v1.CalendarEventDisplayInfo;
import com.ss.android.lark.calendar.api.entity.CalendarPstnDetailInfo;
import com.ss.android.lark.calendar.impl.features.common.widget.attachment.AttachmentItemData;
import com.ss.android.lark.calendar.impl.features.events.detail.EventDetailSource;
import com.ss.android.lark.calendar.impl.features.events.detail.ICalendarDetailContact;
import com.ss.android.lark.calendar.impl.features.events.detail.fragment.transfer.TransferEventData;
import com.ss.android.lark.calendar.impl.features.events.detail.idata.IAttendeeFragmentData;
import com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData;
import com.ss.android.lark.calendar.impl.features.events.detail.idata.IDialogData;
import com.ss.android.lark.calendar.impl.features.events.detail.idata.IFooterData;
import com.ss.android.lark.calendar.impl.features.events.detail.idata.IHeaderData;
import com.ss.android.lark.calendar.impl.features.events.detail.idata.ITitleData;
import com.ss.android.lark.calendar.impl.features.events.detail.idata.RSVPStatus;
import com.ss.android.lark.calendar.impl.features.events.detail.idata.VideoMeetingVisibility;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.Calendar;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttendee;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventDisplayInfo;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarSchemaCollection;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.DoVideoMeeting;
import com.ss.android.lark.calendar.impl.utils.SchemaHelper;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/detail/viewdata/LimitedEventViewData;", "Lcom/ss/android/lark/calendar/impl/features/events/detail/viewdata/BaseEventViewData;", "Lcom/ss/android/lark/calendar/impl/features/events/detail/ICalendarDetailContact$IDetailViewData;", "model", "Lcom/ss/android/lark/calendar/impl/features/events/detail/ICalendarDetailContact$IDetailModel;", "(Lcom/ss/android/lark/calendar/impl/features/events/detail/ICalendarDetailContact$IDetailModel;)V", "getAttendeeFragmentData", "Lcom/ss/android/lark/calendar/impl/features/events/detail/idata/IAttendeeFragmentData;", "getBodyData", "Lcom/ss/android/lark/calendar/impl/features/events/detail/idata/IBodyData;", "getDialogData", "Lcom/ss/android/lark/calendar/impl/features/events/detail/idata/IDialogData;", "getFooterData", "Lcom/ss/android/lark/calendar/impl/features/events/detail/idata/IFooterData;", "getHeaderData", "Lcom/ss/android/lark/calendar/impl/features/events/detail/idata/IHeaderData;", "getTitleViewData", "Lcom/ss/android/lark/calendar/impl/features/events/detail/idata/ITitleData;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.e.c */
public final class LimitedEventViewData extends BaseEventViewData implements ICalendarDetailContact.IDetailViewData {

    /* renamed from: b */
    public final ICalendarDetailContact.IDetailModel f79198b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000{\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\u0018\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bH\u0016J\b\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\nH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\nH\u0016J\b\u0010\u0012\u001a\u00020\nH\u0016J\b\u0010\u0013\u001a\u00020\nH\u0016J\u000f\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0002\u0010\u0016J\u000f\u0010\u0017\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0002\u0010\u0016J\u000f\u0010\u0018\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0002\u0010\u0016J\b\u0010\u0019\u001a\u00020\u0010H\u0016J\b\u0010\u001a\u001a\u00020\nH\u0016J\b\u0010\u001b\u001a\u00020\nH\u0016J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\nH\u0016J\b\u0010\u001f\u001a\u00020 H\u0016J\b\u0010!\u001a\u00020\nH\u0016J\b\u0010\"\u001a\u00020\nH\u0016J\b\u0010#\u001a\u00020\nH\u0016J\b\u0010$\u001a\u00020%H\u0016J\u000e\u0010&\u001a\b\u0012\u0004\u0012\u00020'0\u0003H\u0016J\n\u0010(\u001a\u0004\u0018\u00010)H\u0016J\b\u0010*\u001a\u00020\nH\u0016J\n\u0010+\u001a\u0004\u0018\u00010,H\u0016J\b\u0010-\u001a\u00020.H\u0016J\n\u0010/\u001a\u0004\u0018\u000100H\u0016J\b\u00101\u001a\u00020\u0010H\u0016J\b\u00102\u001a\u00020\u0010H\u0016J\b\u00103\u001a\u00020\u0010H\u0016J\b\u00104\u001a\u00020\u0010H\u0016J\b\u00105\u001a\u00020\u0010H\u0016J\b\u00106\u001a\u00020\u0010H\u0016J\b\u00107\u001a\u00020\u0010H\u0016J\b\u00108\u001a\u00020\u0010H\u0016J\b\u00109\u001a\u00020\u0010H\u0016J\b\u0010:\u001a\u00020\u0010H\u0016J\b\u0010;\u001a\u00020\u0010H\u0016J\b\u0010<\u001a\u00020\u0010H\u0016J\b\u0010=\u001a\u00020\u0010H\u0016J\b\u0010>\u001a\u00020\u0010H\u0016¨\u0006?"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/detail/viewdata/LimitedEventViewData$getBodyData$1", "Lcom/ss/android/lark/calendar/impl/features/events/detail/idata/IBodyData;", "getAttachmentDatas", "", "Lcom/ss/android/lark/calendar/impl/features/common/widget/attachment/AttachmentItemData;", "getAttendeeDatas", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/calendar/impl/features/events/detail/idata/IBodyData$IAttendeeDetailData;", "Lkotlin/collections/ArrayList;", "getAttendeeNumDetailText", "", "getAttendeeNumText", "getAttendeeVisiblility", "Lcom/ss/android/lark/calendar/impl/features/events/detail/idata/IBodyData$AttendeeVisibility;", "getCalendarSummary", "getCanEditEvent", "", "getCreatorDisplayName", "getDescriptionRichData", "getDescriptionTextData", "getDueTime", "", "()Ljava/lang/Long;", "getDueTimeClientReqStartTime", "getDueTimeServerReqTime", "getEventIsCrossTenant", "getEventScopeText", "getEventServerId", "getEventSource", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEvent$Source;", "getEventStartTime", "getEventType", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEvent$Type;", "getFragmentAttendeeNumText", "getFreeBusyText", "getLiveEventId", "getLocationData", "Lcom/ss/android/lark/calendar/impl/features/events/detail/idata/IBodyData$ILocationData;", "getMeetingRoomDatas", "Lcom/ss/android/lark/calendar/impl/features/events/detail/idata/IBodyData$IMeetingRoomData;", "getOrganizerData", "Lcom/ss/android/lark/calendar/impl/features/events/detail/idata/IBodyData$IOrganizerData;", "getReminderText", "getVideoMeeting", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/DoVideoMeeting;", "getVideoMeetingVisibility", "Lcom/ss/android/lark/calendar/impl/features/events/detail/idata/VideoMeetingVisibility;", "getVideoPstnDetailInfo", "Lcom/ss/android/lark/calendar/api/entity/CalendarPstnDetailInfo;", "isCreatorResigned", "isShowAttachment", "isShowCalendarResignedLabel", "isShowCalendarSummary", "isShowCreator", "isShowEventScope", "isShowFreeBusy", "isShowLocation", "isShowMeetingRoom", "isShowNotOrganizerTip", "isShowOrganizer", "isShowReminder", "isShowRichDescription", "isShowTextDescription", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.e.c$a */
    public static final class C31270a implements IBodyData {

        /* renamed from: a */
        final /* synthetic */ LimitedEventViewData f79199a;

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData
        /* renamed from: E */
        public DoVideoMeeting mo113637E() {
            return null;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData
        /* renamed from: F */
        public CalendarPstnDetailInfo mo113638F() {
            return null;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData
        /* renamed from: G */
        public boolean mo113639G() {
            return false;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData
        /* renamed from: H */
        public Long mo113640H() {
            return null;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData
        /* renamed from: I */
        public Long mo113641I() {
            return null;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData
        /* renamed from: J */
        public Long mo113642J() {
            return null;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData
        /* renamed from: K */
        public boolean mo113643K() {
            return false;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData
        /* renamed from: a */
        public boolean mo113649a() {
            return false;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData
        /* renamed from: c */
        public boolean mo113651c() {
            return false;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData
        /* renamed from: f */
        public String mo113654f() {
            return "";
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData
        /* renamed from: g */
        public String mo113655g() {
            return "";
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData
        /* renamed from: h */
        public String mo113656h() {
            return "";
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData
        /* renamed from: j */
        public boolean mo113658j() {
            return false;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData
        /* renamed from: l */
        public boolean mo113660l() {
            return false;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData
        /* renamed from: m */
        public String mo113661m() {
            return "";
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData
        /* renamed from: n */
        public boolean mo113662n() {
            return false;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData
        /* renamed from: o */
        public String mo113663o() {
            return "";
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData
        /* renamed from: p */
        public boolean mo113664p() {
            return false;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData
        /* renamed from: r */
        public boolean mo113666r() {
            return false;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData
        /* renamed from: s */
        public boolean mo113667s() {
            return false;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData
        /* renamed from: t */
        public String mo113668t() {
            return "";
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData
        /* renamed from: u */
        public String mo113669u() {
            return "";
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData
        /* renamed from: w */
        public boolean mo113671w() {
            return false;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData
        /* renamed from: D */
        public VideoMeetingVisibility mo113636D() {
            return VideoMeetingVisibility.INVISIBLE;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData
        /* renamed from: L */
        public CalendarEvent.Type mo113644L() {
            return CalendarEvent.Type.DEFAULT_TYPE;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData
        /* renamed from: M */
        public CalendarEvent.Source mo113645M() {
            return CalendarEvent.Source.UNKNOWN_SOURCE;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData
        /* renamed from: P */
        public String mo113648P() {
            return this.f79199a.mo113593k();
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData
        /* renamed from: b */
        public List<IBodyData.IMeetingRoomData> mo113650b() {
            return this.f79199a.mo113594l();
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData
        /* renamed from: d */
        public IBodyData.ILocationData mo113652d() {
            return this.f79199a.mo113595m();
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData
        /* renamed from: i */
        public ArrayList<IBodyData.IAttendeeDetailData> mo113657i() {
            return new ArrayList<>();
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData
        /* renamed from: k */
        public String mo113659k() {
            return this.f79199a.mo113599q();
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData
        /* renamed from: q */
        public List<AttachmentItemData> mo113665q() {
            return new ArrayList();
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData
        /* renamed from: z */
        public IBodyData.IOrganizerData mo113674z() {
            return this.f79199a.mo113602t();
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData
        /* renamed from: A */
        public boolean mo113633A() {
            if (this.f79199a.f79198b.mo113400a() == EventDetailSource.FROM_ROOM_VIEW_NOT_ACCESSIBLE) {
                return true;
            }
            return false;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData
        /* renamed from: N */
        public String mo113646N() {
            return this.f79199a.f79198b.mo113395D();
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData
        /* renamed from: O */
        public String mo113647O() {
            return this.f79199a.f79198b.mo113397F();
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData
        /* renamed from: e */
        public IBodyData.AttendeeVisibility mo113653e() {
            if (this.f79199a.f79198b.mo113392A()) {
                return IBodyData.AttendeeVisibility.GONE;
            }
            return IBodyData.AttendeeVisibility.HIDDEN;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData
        /* renamed from: C */
        public String mo113635C() {
            CalendarEventAttendee creator;
            String localizedDisplayName;
            CalendarEvent c = this.f79199a.f79198b.mo113417c();
            if (c == null || (creator = c.getCreator()) == null || (localizedDisplayName = creator.getLocalizedDisplayName()) == null) {
                return "";
            }
            return localizedDisplayName;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData
        /* renamed from: x */
        public String mo113672x() {
            String noteOrLocalizeSummary;
            Calendar j = this.f79199a.f79198b.mo113427j();
            if (j == null || (noteOrLocalizeSummary = j.getNoteOrLocalizeSummary()) == null) {
                return "";
            }
            return noteOrLocalizeSummary;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData
        /* renamed from: B */
        public boolean mo113634B() {
            CalendarEvent c;
            CalendarEventDisplayInfo calendarEventDisplayInfo;
            if (!this.f79199a.f79198b.mo113392A() || (c = this.f79199a.f79198b.mo113417c()) == null || (calendarEventDisplayInfo = c.getCalendarEventDisplayInfo()) == null || !calendarEventDisplayInfo.isEventCreatorShow()) {
                return false;
            }
            return true;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData
        /* renamed from: v */
        public boolean mo113670v() {
            String str;
            Calendar j = this.f79199a.f79198b.mo113427j();
            CalendarSchemaCollection calendarSchemaCollection = null;
            if (j != null) {
                str = j.getNoteOrLocalizeSummary();
            } else {
                str = null;
            }
            if (!TextUtils.isEmpty(str)) {
                SchemaHelper.Companion aVar = SchemaHelper.f83746a;
                CalendarEvent c = this.f79199a.f79198b.mo113417c();
                if (c != null) {
                    calendarSchemaCollection = c.getCalendarSchemaCollection();
                }
                if (aVar.mo120313a("Calendar", calendarSchemaCollection)) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData
        /* renamed from: y */
        public boolean mo113673y() {
            CalendarEvent c;
            CalendarEventDisplayInfo calendarEventDisplayInfo;
            if (!this.f79199a.f79198b.mo113392A() || (c = this.f79199a.f79198b.mo113417c()) == null || (calendarEventDisplayInfo = c.getCalendarEventDisplayInfo()) == null || !calendarEventDisplayInfo.isEventOrganizerShow()) {
                return false;
            }
            return true;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31270a(LimitedEventViewData cVar) {
            this.f79199a = cVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/detail/viewdata/LimitedEventViewData$getDialogData$1", "Lcom/ss/android/lark/calendar/impl/features/events/detail/idata/IDialogData;", "getOrganizerName", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.e.c$b */
    public static final class C31271b implements IDialogData {
        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IDialogData
        /* renamed from: a */
        public String mo113675a() {
            return "";
        }

        C31271b() {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/detail/viewdata/LimitedEventViewData$getFooterData$1", "Lcom/ss/android/lark/calendar/impl/features/events/detail/idata/IFooterData;", "getFooterType", "Lcom/ss/android/lark/calendar/impl/features/events/detail/idata/IFooterData$FooterType;", "getRSVPStatus", "Lcom/ss/android/lark/calendar/impl/features/events/detail/idata/RSVPStatus;", "getRsvpBotCardReplyStatus", "", "isShowRsvpCommentIcon", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.e.c$c */
    public static final class C31272c implements IFooterData {
        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IFooterData
        /* renamed from: c */
        public boolean mo113678c() {
            return false;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IFooterData
        /* renamed from: d */
        public String mo113679d() {
            return "";
        }

        C31272c() {
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IFooterData
        /* renamed from: a */
        public IFooterData.FooterType mo113676a() {
            return IFooterData.FooterType.GONE;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IFooterData
        /* renamed from: b */
        public RSVPStatus mo113677b() {
            return RSVPStatus.NEEDS_ACTION;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\u0003H\u0016J\b\u0010\t\u001a\u00020\u0003H\u0016J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016J\b\u0010\u0012\u001a\u00020\rH\u0016J\b\u0010\u0013\u001a\u00020\rH\u0016¨\u0006\u0014"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/detail/viewdata/LimitedEventViewData$getHeaderData$1", "Lcom/ss/android/lark/calendar/impl/features/events/detail/idata/IHeaderData;", "getEventServerId", "", "getEventStartTime", "getEventSummary", "getHeaderColor", "", "getRuleText", "getTimeText", "getVideoMeetingVisibility", "Lcom/ss/android/lark/calendar/impl/features/events/detail/idata/VideoMeetingVisibility;", "isHasChatGroup", "", "isHasMeetingMinute", "isShowChatGroupIcon", "Lcom/bytedance/lark/pb/calendar/v1/CalendarEventDisplayInfo$ButtonDisplayType;", "isShowMeetingMinuteIcon", "isShowRule", "isStartAndEndSameDay", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.e.c$d */
    public static final class C31273d implements IHeaderData {

        /* renamed from: a */
        final /* synthetic */ LimitedEventViewData f79200a;

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IHeaderData
        /* renamed from: e */
        public boolean mo113684e() {
            return false;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IHeaderData
        /* renamed from: f */
        public String mo113685f() {
            return "";
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IHeaderData
        /* renamed from: g */
        public boolean mo113686g() {
            return false;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IHeaderData
        /* renamed from: h */
        public boolean mo113687h() {
            return false;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IHeaderData
        /* renamed from: i */
        public CalendarEventDisplayInfo.ButtonDisplayType mo113688i() {
            return CalendarEventDisplayInfo.ButtonDisplayType.HIDDEN;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IHeaderData
        /* renamed from: j */
        public CalendarEventDisplayInfo.ButtonDisplayType mo113689j() {
            return CalendarEventDisplayInfo.ButtonDisplayType.HIDDEN;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IHeaderData
        /* renamed from: a */
        public int[] mo113680a() {
            return this.f79200a.mo113590h();
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IHeaderData
        /* renamed from: c */
        public String mo113682c() {
            return this.f79200a.mo113591i();
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IHeaderData
        /* renamed from: d */
        public boolean mo113683d() {
            return this.f79200a.mo113592j();
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IHeaderData
        /* renamed from: b */
        public String mo113681b() {
            return this.f79200a.f79198b.mo113437t();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31273d(LimitedEventViewData cVar) {
            this.f79200a = cVar;
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.detail.ICalendarDetailContact.IDetailViewData
    /* renamed from: a */
    public ITitleData mo113559a() {
        return new C31274e(this);
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.detail.ICalendarDetailContact.IDetailViewData
    /* renamed from: b */
    public IHeaderData mo113560b() {
        return new C31273d(this);
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.detail.ICalendarDetailContact.IDetailViewData
    /* renamed from: c */
    public IBodyData mo113561c() {
        return new C31270a(this);
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.detail.ICalendarDetailContact.IDetailViewData
    /* renamed from: d */
    public IFooterData mo113562d() {
        return new C31272c();
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.detail.ICalendarDetailContact.IDetailViewData
    /* renamed from: e */
    public IDialogData mo113563e() {
        return new C31271b();
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.detail.ICalendarDetailContact.IDetailViewData
    /* renamed from: f */
    public IAttendeeFragmentData mo113564f() {
        return mo113606x();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\u0007\u001a\u00020\u0005H\u0016J\n\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\r\u001a\u00020\u000bH\u0016J\b\u0010\u000e\u001a\u00020\u000bH\u0016J\b\u0010\u000f\u001a\u00020\u000bH\u0016J\b\u0010\u0010\u001a\u00020\u000bH\u0016J\b\u0010\u0011\u001a\u00020\u000bH\u0016J\b\u0010\u0012\u001a\u00020\u000bH\u0016J\b\u0010\u0013\u001a\u00020\u000bH\u0016J\b\u0010\u0014\u001a\u00020\u000bH\u0016¨\u0006\u0015"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/detail/viewdata/LimitedEventViewData$getTitleViewData$1", "Lcom/ss/android/lark/calendar/impl/features/events/detail/idata/ITitleData;", "getEventDeleteAbility", "", "getEventServerID", "", "getEventStartTime", "getEventSummary", "getTransferEventData", "Lcom/ss/android/lark/calendar/impl/features/events/detail/fragment/transfer/TransferEventData;", "isEditIconDisable", "", "isShowEditIcon", "isShowExchangeIcon", "isShowExternalIcon", "isShowGoogleIcon", "isShowHint", "isShowLocalIcon", "isShowReportIcon", "isShowSharableIcon", "isShowTransferIcon", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.e.c$e */
    public static final class C31274e implements ITitleData {

        /* renamed from: a */
        final /* synthetic */ LimitedEventViewData f79201a;

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.ITitleData
        /* renamed from: d */
        public boolean mo113693d() {
            return false;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.ITitleData
        /* renamed from: e */
        public boolean mo113694e() {
            return false;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.ITitleData
        /* renamed from: f */
        public boolean mo113695f() {
            return false;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.ITitleData
        /* renamed from: g */
        public boolean mo113696g() {
            return false;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.ITitleData
        /* renamed from: h */
        public boolean mo113697h() {
            return false;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.ITitleData
        /* renamed from: i */
        public boolean mo113698i() {
            return false;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.ITitleData
        /* renamed from: j */
        public boolean mo113699j() {
            return false;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.ITitleData
        /* renamed from: k */
        public boolean mo113700k() {
            return false;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.ITitleData
        /* renamed from: l */
        public TransferEventData mo113701l() {
            return null;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.ITitleData
        /* renamed from: m */
        public boolean mo113702m() {
            return false;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.ITitleData
        /* renamed from: n */
        public int mo113703n() {
            return 0;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.ITitleData
        /* renamed from: o */
        public boolean mo113704o() {
            return false;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.ITitleData
        /* renamed from: a */
        public String mo113690a() {
            return this.f79201a.f79198b.mo113437t();
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.ITitleData
        /* renamed from: b */
        public String mo113691b() {
            return this.f79201a.f79198b.mo113395D();
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.ITitleData
        /* renamed from: c */
        public String mo113692c() {
            return this.f79201a.f79198b.mo113397F();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31274e(LimitedEventViewData cVar) {
            this.f79201a = cVar;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LimitedEventViewData(ICalendarDetailContact.IDetailModel aVar) {
        super(aVar);
        Intrinsics.checkParameterIsNotNull(aVar, "model");
        this.f79198b = aVar;
    }
}
