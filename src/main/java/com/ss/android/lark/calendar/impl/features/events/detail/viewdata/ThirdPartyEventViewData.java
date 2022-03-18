package com.ss.android.lark.calendar.impl.features.events.detail.viewdata;

import android.text.TextUtils;
import com.bytedance.lark.pb.calendar.v1.CalendarEventDisplayInfo;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.api.entity.CalendarPstnDetailInfo;
import com.ss.android.lark.calendar.impl.features.common.widget.attachment.AttachmentItemData;
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
import com.ss.android.lark.calendar.impl.features.events.detail.utils.AttendeeUtil;
import com.ss.android.lark.calendar.impl.features.events.detail.utils.AuthorityUtil;
import com.ss.android.lark.calendar.impl.features.events.detail.videoUrl.entity.VideoType;
import com.ss.android.lark.calendar.impl.features.events.edit.utils.OperationUtils;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.Calendar;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttachment;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttendee;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarLocation;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarSchemaCollection;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.DoVideoMeeting;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.calendar.impl.utils.SchemaHelper;
import com.ss.android.lark.calendar.p1430a.C30022a;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00122\u00020\u00012\u00020\u0002:\u0001\u0012B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/detail/viewdata/ThirdPartyEventViewData;", "Lcom/ss/android/lark/calendar/impl/features/events/detail/viewdata/BaseEventViewData;", "Lcom/ss/android/lark/calendar/impl/features/events/detail/ICalendarDetailContact$IDetailViewData;", "model", "Lcom/ss/android/lark/calendar/impl/features/events/detail/ICalendarDetailContact$IDetailModel;", "(Lcom/ss/android/lark/calendar/impl/features/events/detail/ICalendarDetailContact$IDetailModel;)V", "getAttendeeFragmentData", "Lcom/ss/android/lark/calendar/impl/features/events/detail/idata/IAttendeeFragmentData;", "getBodyData", "Lcom/ss/android/lark/calendar/impl/features/events/detail/idata/IBodyData;", "getDialogData", "Lcom/ss/android/lark/calendar/impl/features/events/detail/idata/IDialogData;", "getFooterData", "Lcom/ss/android/lark/calendar/impl/features/events/detail/idata/IFooterData;", "getHeaderData", "Lcom/ss/android/lark/calendar/impl/features/events/detail/idata/IHeaderData;", "getTitleViewData", "Lcom/ss/android/lark/calendar/impl/features/events/detail/idata/ITitleData;", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.e.h */
public final class ThirdPartyEventViewData extends BaseEventViewData implements ICalendarDetailContact.IDetailViewData {

    /* renamed from: c */
    public static final Companion f79221c = new Companion(null);

    /* renamed from: b */
    public final ICalendarDetailContact.IDetailModel f79222b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/detail/viewdata/ThirdPartyEventViewData$Companion;", "", "()V", "DESCRIPTION_BLANK", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.e.h$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\u0003H\u0016J\b\u0010\t\u001a\u00020\u0003H\u0016J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016J\b\u0010\u0012\u001a\u00020\rH\u0016J\b\u0010\u0013\u001a\u00020\rH\u0016¨\u0006\u0014"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/detail/viewdata/ThirdPartyEventViewData$getHeaderData$1", "Lcom/ss/android/lark/calendar/impl/features/events/detail/idata/IHeaderData;", "getEventServerId", "", "getEventStartTime", "getEventSummary", "getHeaderColor", "", "getRuleText", "getTimeText", "getVideoMeetingVisibility", "Lcom/ss/android/lark/calendar/impl/features/events/detail/idata/VideoMeetingVisibility;", "isHasChatGroup", "", "isHasMeetingMinute", "isShowChatGroupIcon", "Lcom/bytedance/lark/pb/calendar/v1/CalendarEventDisplayInfo$ButtonDisplayType;", "isShowMeetingMinuteIcon", "isShowRule", "isStartAndEndSameDay", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.e.h$e */
    public static final class C31294e implements IHeaderData {

        /* renamed from: a */
        final /* synthetic */ ThirdPartyEventViewData f79226a;

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
            return this.f79226a.mo113590h();
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IHeaderData
        /* renamed from: c */
        public String mo113682c() {
            return this.f79226a.mo113591i();
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IHeaderData
        /* renamed from: d */
        public boolean mo113683d() {
            return this.f79226a.mo113592j();
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IHeaderData
        /* renamed from: b */
        public String mo113681b() {
            return this.f79226a.f79222b.mo113437t();
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IHeaderData
        /* renamed from: f */
        public String mo113685f() {
            String rRule;
            CalendarEvent c = this.f79226a.f79222b.mo113417c();
            if (c == null || (rRule = c.getRRule()) == null) {
                return "";
            }
            return rRule;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IHeaderData
        /* renamed from: e */
        public boolean mo113684e() {
            String str;
            if (this.f79226a.f79222b.mo113393B()) {
                return false;
            }
            CalendarEvent c = this.f79226a.f79222b.mo113417c();
            if (c != null) {
                str = c.getRRule();
            } else {
                str = null;
            }
            return !TextUtils.isEmpty(str);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31294e(ThirdPartyEventViewData hVar) {
            this.f79226a = hVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000{\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\u0018\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bH\u0016J\b\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\nH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\nH\u0016J\b\u0010\u0012\u001a\u00020\nH\u0016J\b\u0010\u0013\u001a\u00020\nH\u0016J\u000f\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0002\u0010\u0016J\u000f\u0010\u0017\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0002\u0010\u0016J\u000f\u0010\u0018\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0002\u0010\u0016J\b\u0010\u0019\u001a\u00020\u0010H\u0016J\b\u0010\u001a\u001a\u00020\nH\u0016J\b\u0010\u001b\u001a\u00020\nH\u0016J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\nH\u0016J\b\u0010\u001f\u001a\u00020 H\u0016J\b\u0010!\u001a\u00020\nH\u0016J\b\u0010\"\u001a\u00020\nH\u0016J\b\u0010#\u001a\u00020\nH\u0016J\b\u0010$\u001a\u00020%H\u0016J\u000e\u0010&\u001a\b\u0012\u0004\u0012\u00020'0\u0003H\u0016J\n\u0010(\u001a\u0004\u0018\u00010)H\u0016J\b\u0010*\u001a\u00020\nH\u0016J\n\u0010+\u001a\u0004\u0018\u00010,H\u0016J\b\u0010-\u001a\u00020.H\u0016J\n\u0010/\u001a\u0004\u0018\u000100H\u0016J\b\u00101\u001a\u00020\u0010H\u0016J\b\u00102\u001a\u00020\u0010H\u0016J\b\u00103\u001a\u00020\u0010H\u0016J\b\u00104\u001a\u00020\u0010H\u0016J\b\u00105\u001a\u00020\u0010H\u0016J\b\u00106\u001a\u00020\u0010H\u0016J\b\u00107\u001a\u00020\u0010H\u0016J\b\u00108\u001a\u00020\u0010H\u0016J\b\u00109\u001a\u00020\u0010H\u0016J\b\u0010:\u001a\u00020\u0010H\u0016J\b\u0010;\u001a\u00020\u0010H\u0016J\b\u0010<\u001a\u00020\u0010H\u0016J\b\u0010=\u001a\u00020\u0010H\u0016J\b\u0010>\u001a\u00020\u0010H\u0016¨\u0006?"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/detail/viewdata/ThirdPartyEventViewData$getBodyData$1", "Lcom/ss/android/lark/calendar/impl/features/events/detail/idata/IBodyData;", "getAttachmentDatas", "", "Lcom/ss/android/lark/calendar/impl/features/common/widget/attachment/AttachmentItemData;", "getAttendeeDatas", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/calendar/impl/features/events/detail/idata/IBodyData$IAttendeeDetailData;", "Lkotlin/collections/ArrayList;", "getAttendeeNumDetailText", "", "getAttendeeNumText", "getAttendeeVisiblility", "Lcom/ss/android/lark/calendar/impl/features/events/detail/idata/IBodyData$AttendeeVisibility;", "getCalendarSummary", "getCanEditEvent", "", "getCreatorDisplayName", "getDescriptionRichData", "getDescriptionTextData", "getDueTime", "", "()Ljava/lang/Long;", "getDueTimeClientReqStartTime", "getDueTimeServerReqTime", "getEventIsCrossTenant", "getEventScopeText", "getEventServerId", "getEventSource", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEvent$Source;", "getEventStartTime", "getEventType", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEvent$Type;", "getFragmentAttendeeNumText", "getFreeBusyText", "getLiveEventId", "getLocationData", "Lcom/ss/android/lark/calendar/impl/features/events/detail/idata/IBodyData$ILocationData;", "getMeetingRoomDatas", "Lcom/ss/android/lark/calendar/impl/features/events/detail/idata/IBodyData$IMeetingRoomData;", "getOrganizerData", "Lcom/ss/android/lark/calendar/impl/features/events/detail/idata/IBodyData$IOrganizerData;", "getReminderText", "getVideoMeeting", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/DoVideoMeeting;", "getVideoMeetingVisibility", "Lcom/ss/android/lark/calendar/impl/features/events/detail/idata/VideoMeetingVisibility;", "getVideoPstnDetailInfo", "Lcom/ss/android/lark/calendar/api/entity/CalendarPstnDetailInfo;", "isCreatorResigned", "isShowAttachment", "isShowCalendarResignedLabel", "isShowCalendarSummary", "isShowCreator", "isShowEventScope", "isShowFreeBusy", "isShowLocation", "isShowMeetingRoom", "isShowNotOrganizerTip", "isShowOrganizer", "isShowReminder", "isShowRichDescription", "isShowTextDescription", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.e.h$b */
    public static final class C31291b implements IBodyData {

        /* renamed from: a */
        final /* synthetic */ ThirdPartyEventViewData f79223a;

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData
        /* renamed from: A */
        public boolean mo113633A() {
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
        /* renamed from: h */
        public String mo113656h() {
            return "";
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData
        /* renamed from: P */
        public String mo113648P() {
            return this.f79223a.mo113593k();
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData
        /* renamed from: b */
        public List<IBodyData.IMeetingRoomData> mo113650b() {
            return this.f79223a.mo113594l();
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData
        /* renamed from: d */
        public IBodyData.ILocationData mo113652d() {
            return this.f79223a.mo113595m();
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData
        /* renamed from: f */
        public String mo113654f() {
            return this.f79223a.mo113596n();
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData
        /* renamed from: g */
        public String mo113655g() {
            return this.f79223a.mo113597o();
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData
        /* renamed from: i */
        public ArrayList<IBodyData.IAttendeeDetailData> mo113657i() {
            return this.f79223a.mo113598p();
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData
        /* renamed from: k */
        public String mo113659k() {
            return this.f79223a.mo113599q();
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData
        /* renamed from: m */
        public String mo113661m() {
            return this.f79223a.mo113600r();
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData
        /* renamed from: q */
        public List<AttachmentItemData> mo113665q() {
            return this.f79223a.mo113601s();
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData
        /* renamed from: z */
        public IBodyData.IOrganizerData mo113674z() {
            return this.f79223a.mo113602t();
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData
        /* renamed from: F */
        public CalendarPstnDetailInfo mo113638F() {
            return this.f79223a.f79222b.mo113420d();
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData
        /* renamed from: N */
        public String mo113646N() {
            return this.f79223a.f79222b.mo113395D();
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData
        /* renamed from: O */
        public String mo113647O() {
            return this.f79223a.f79222b.mo113397F();
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData
        /* renamed from: o */
        public String mo113663o() {
            String b = C32634ae.m125182b(R.string.Calendar_Detail_Free);
            Intrinsics.checkExpressionValueIsNotNull(b, "ResUtil.getString(R.string.Calendar_Detail_Free)");
            return b;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData
        /* renamed from: B */
        public boolean mo113634B() {
            com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventDisplayInfo calendarEventDisplayInfo;
            CalendarEvent c = this.f79223a.f79222b.mo113417c();
            if (c == null || (calendarEventDisplayInfo = c.getCalendarEventDisplayInfo()) == null || !calendarEventDisplayInfo.isEventCreatorShow()) {
                return false;
            }
            return true;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData
        /* renamed from: C */
        public String mo113635C() {
            CalendarEventAttendee creator;
            String localizedDisplayName;
            CalendarEvent c = this.f79223a.f79222b.mo113417c();
            if (c == null || (creator = c.getCreator()) == null || (localizedDisplayName = creator.getLocalizedDisplayName()) == null) {
                return "";
            }
            return localizedDisplayName;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData
        /* renamed from: D */
        public VideoMeetingVisibility mo113636D() {
            VideoType videoType;
            DoVideoMeeting videoMeeting;
            CalendarEvent c = this.f79223a.f79222b.mo113417c();
            if (c == null || (videoMeeting = c.getVideoMeeting()) == null) {
                videoType = null;
            } else {
                videoType = videoMeeting.getMeetingType();
            }
            if (videoType == VideoType.GOOGLE_VIDEO_CONFERENCE) {
                return VideoMeetingVisibility.VISIBLE;
            }
            return VideoMeetingVisibility.INVISIBLE;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData
        /* renamed from: E */
        public DoVideoMeeting mo113637E() {
            CalendarEvent c = this.f79223a.f79222b.mo113417c();
            if (c != null) {
                return c.getVideoMeeting();
            }
            return null;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData
        /* renamed from: G */
        public boolean mo113639G() {
            Boolean isEditable;
            CalendarEvent c = this.f79223a.f79222b.mo113417c();
            if (c == null || (isEditable = c.getIsEditable()) == null) {
                return false;
            }
            return isEditable.booleanValue();
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData
        /* renamed from: K */
        public boolean mo113643K() {
            CalendarEvent c = this.f79223a.f79222b.mo113417c();
            if (c != null) {
                return c.isCrossTenant();
            }
            return false;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData
        /* renamed from: L */
        public CalendarEvent.Type mo113644L() {
            CalendarEvent.Type type;
            CalendarEvent c = this.f79223a.f79222b.mo113417c();
            if (c == null || (type = c.getType()) == null) {
                return CalendarEvent.Type.DEFAULT_TYPE;
            }
            return type;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData
        /* renamed from: M */
        public CalendarEvent.Source mo113645M() {
            CalendarEvent.Source source;
            CalendarEvent c = this.f79223a.f79222b.mo113417c();
            if (c == null || (source = c.getSource()) == null) {
                return CalendarEvent.Source.UNKNOWN_SOURCE;
            }
            return source;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData
        /* renamed from: u */
        public String mo113669u() {
            String docsDescription;
            CalendarEvent c = this.f79223a.f79222b.mo113417c();
            if (c == null || (docsDescription = c.getDocsDescription()) == null) {
                return "";
            }
            return docsDescription;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData
        /* renamed from: w */
        public boolean mo113671w() {
            Calendar j = this.f79223a.f79222b.mo113427j();
            if (j == null || !j.isResignedCalendar()) {
                return false;
            }
            return true;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData
        /* renamed from: x */
        public String mo113672x() {
            String noteOrLocalizeSummary;
            Calendar j = this.f79223a.f79222b.mo113427j();
            if (j == null || (noteOrLocalizeSummary = j.getNoteOrLocalizeSummary()) == null) {
                return "";
            }
            return noteOrLocalizeSummary;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData
        /* renamed from: c */
        public boolean mo113651c() {
            CalendarLocation calendarLocation;
            if (this.f79223a.f79222b.mo113393B()) {
                return false;
            }
            CalendarEvent c = this.f79223a.f79222b.mo113417c();
            CalendarSchemaCollection calendarSchemaCollection = null;
            if (c != null) {
                calendarLocation = c.getLocation();
            } else {
                calendarLocation = null;
            }
            if (calendarLocation == null) {
                return false;
            }
            SchemaHelper.Companion aVar = SchemaHelper.f83746a;
            CalendarEvent c2 = this.f79223a.f79222b.mo113417c();
            if (c2 != null) {
                calendarSchemaCollection = c2.getCalendarSchemaCollection();
            }
            if (aVar.mo120313a("Location", calendarSchemaCollection)) {
                return true;
            }
            return false;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData
        /* renamed from: j */
        public boolean mo113658j() {
            if (this.f79223a.f79222b.mo113393B()) {
                return false;
            }
            CalendarEvent c = this.f79223a.f79222b.mo113417c();
            if (c == null) {
                return false;
            }
            if (!CollectionUtils.isNotEmpty(c.getReminders()) || !SchemaHelper.f83746a.mo120313a("Reminder", c.getCalendarSchemaCollection())) {
                return false;
            }
            return true;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData
        /* renamed from: n */
        public boolean mo113662n() {
            CalendarEvent c;
            CalendarSchemaCollection calendarSchemaCollection;
            if (this.f79223a.f79222b.mo113393B() || (c = this.f79223a.f79222b.mo113417c()) == null || !c.isFree()) {
                return false;
            }
            SchemaHelper.Companion aVar = SchemaHelper.f83746a;
            CalendarEvent c2 = this.f79223a.f79222b.mo113417c();
            if (c2 != null) {
                calendarSchemaCollection = c2.getCalendarSchemaCollection();
            } else {
                calendarSchemaCollection = null;
            }
            if (aVar.mo120313a("FreeBusy", calendarSchemaCollection)) {
                return true;
            }
            return false;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData
        /* renamed from: p */
        public boolean mo113664p() {
            List<CalendarEventAttachment> list;
            if (this.f79223a.f79222b.mo113393B()) {
                return false;
            }
            CalendarEvent c = this.f79223a.f79222b.mo113417c();
            CalendarSchemaCollection calendarSchemaCollection = null;
            if (c != null) {
                list = c.getAttachment();
            } else {
                list = null;
            }
            if (!CollectionUtils.isNotEmpty(list)) {
                return false;
            }
            SchemaHelper.Companion aVar = SchemaHelper.f83746a;
            CalendarEvent c2 = this.f79223a.f79222b.mo113417c();
            if (c2 != null) {
                calendarSchemaCollection = c2.getCalendarSchemaCollection();
            }
            if (aVar.mo120313a("Attachment", calendarSchemaCollection)) {
                return true;
            }
            return false;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData
        /* renamed from: r */
        public boolean mo113666r() {
            CalendarEvent c;
            if (!this.f79223a.f79222b.mo113393B() && (c = this.f79223a.f79222b.mo113417c()) != null && !TextUtils.isEmpty(c.getDescription()) && SchemaHelper.f83746a.mo120313a("Description", c.getCalendarSchemaCollection())) {
                return true;
            }
            return false;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData
        /* renamed from: s */
        public boolean mo113667s() {
            CalendarEvent c;
            if (!this.f79223a.f79222b.mo113393B() && (c = this.f79223a.f79222b.mo113417c()) != null && !TextUtils.isEmpty(c.getDocsDescription()) && SchemaHelper.f83746a.mo120313a("Description", c.getCalendarSchemaCollection())) {
                return true;
            }
            return false;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData
        /* renamed from: t */
        public String mo113668t() {
            CalendarEvent c = this.f79223a.f79222b.mo113417c();
            if (c == null) {
                return "";
            }
            String description = c.getDescription();
            if (description == null) {
                description = "";
            }
            if (this.f79223a.f79222b.mo113439v()) {
                description = Pattern.compile("<div></div>").matcher(description).replaceAll("");
                Intrinsics.checkExpressionValueIsNotNull(description, "divMatcher.replaceAll(\"\")");
            }
            if (description != null) {
                return description;
            }
            return "";
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData
        /* renamed from: v */
        public boolean mo113670v() {
            String str;
            Calendar j = this.f79223a.f79222b.mo113427j();
            CalendarSchemaCollection calendarSchemaCollection = null;
            if (j != null) {
                str = j.getNoteOrLocalizeSummary();
            } else {
                str = null;
            }
            if (!TextUtils.isEmpty(str)) {
                SchemaHelper.Companion aVar = SchemaHelper.f83746a;
                CalendarEvent c = this.f79223a.f79222b.mo113417c();
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
            com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventDisplayInfo calendarEventDisplayInfo;
            CalendarSchemaCollection calendarSchemaCollection;
            if (!this.f79223a.f79222b.mo113393B() && (c = this.f79223a.f79222b.mo113417c()) != null && (calendarEventDisplayInfo = c.getCalendarEventDisplayInfo()) != null && calendarEventDisplayInfo.isEventOrganizerShow()) {
                SchemaHelper.Companion aVar = SchemaHelper.f83746a;
                CalendarEvent c2 = this.f79223a.f79222b.mo113417c();
                if (c2 != null) {
                    calendarSchemaCollection = c2.getCalendarSchemaCollection();
                } else {
                    calendarSchemaCollection = null;
                }
                if (!aVar.mo120313a("OrganizerOrCreator", calendarSchemaCollection)) {
                    return false;
                }
                return true;
            }
            return false;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData
        /* renamed from: a */
        public boolean mo113649a() {
            List<CalendarEventAttendee> list;
            if (this.f79223a.f79222b.mo113393B()) {
                return false;
            }
            AttendeeUtil aVar = AttendeeUtil.f79151a;
            CalendarEvent c = this.f79223a.f79222b.mo113417c();
            CalendarSchemaCollection calendarSchemaCollection = null;
            if (c != null) {
                list = c.getAttendees();
            } else {
                list = null;
            }
            if (!CollectionUtils.isNotEmpty(aVar.mo113568a(list))) {
                return false;
            }
            SchemaHelper.Companion aVar2 = SchemaHelper.f83746a;
            CalendarEvent c2 = this.f79223a.f79222b.mo113417c();
            if (c2 != null) {
                calendarSchemaCollection = c2.getCalendarSchemaCollection();
            }
            if (aVar2.mo120313a("MeetingRoom", calendarSchemaCollection)) {
                return true;
            }
            return false;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData
        /* renamed from: e */
        public IBodyData.AttendeeVisibility mo113653e() {
            CalendarSchemaCollection calendarSchemaCollection;
            CalendarEvent c = this.f79223a.f79222b.mo113417c();
            if (c == null) {
                return IBodyData.AttendeeVisibility.GONE;
            }
            Calendar j = this.f79223a.f79222b.mo113427j();
            if (j == null) {
                return IBodyData.AttendeeVisibility.GONE;
            }
            if (this.f79223a.f79222b.mo113392A()) {
                return IBodyData.AttendeeVisibility.GONE;
            }
            if (c.getDisplayType() == CalendarEvent.DisplayType.LIMITED || !AuthorityUtil.f79153a.mo113576b(c, j)) {
                return IBodyData.AttendeeVisibility.HIDDEN;
            }
            if (AuthorityUtil.f79153a.mo113576b(c, j) && CollectionUtils.isNotEmpty(AttendeeUtil.f79151a.mo113566a(c))) {
                SchemaHelper.Companion aVar = SchemaHelper.f83746a;
                CalendarEvent c2 = this.f79223a.f79222b.mo113417c();
                if (c2 != null) {
                    calendarSchemaCollection = c2.getCalendarSchemaCollection();
                } else {
                    calendarSchemaCollection = null;
                }
                if (aVar.mo120313a("Attendee", calendarSchemaCollection)) {
                    return IBodyData.AttendeeVisibility.SHOW;
                }
            }
            return IBodyData.AttendeeVisibility.GONE;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData
        /* renamed from: l */
        public boolean mo113660l() {
            CalendarEvent.Visibility visibility;
            CalendarEvent.Visibility visibility2;
            if (this.f79223a.f79222b.mo113393B()) {
                return false;
            }
            CalendarEvent c = this.f79223a.f79222b.mo113417c();
            CalendarSchemaCollection calendarSchemaCollection = null;
            if (c != null) {
                visibility = c.getVisibility();
            } else {
                visibility = null;
            }
            if (visibility != CalendarEvent.Visibility.PUBLIC) {
                CalendarEvent c2 = this.f79223a.f79222b.mo113417c();
                if (c2 != null) {
                    visibility2 = c2.getVisibility();
                } else {
                    visibility2 = null;
                }
                if (visibility2 != CalendarEvent.Visibility.PRIVATE) {
                    return false;
                }
            }
            SchemaHelper.Companion aVar = SchemaHelper.f83746a;
            CalendarEvent c3 = this.f79223a.f79222b.mo113417c();
            if (c3 != null) {
                calendarSchemaCollection = c3.getCalendarSchemaCollection();
            }
            if (aVar.mo120313a("Scope", calendarSchemaCollection)) {
                return true;
            }
            return false;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31291b(ThirdPartyEventViewData hVar) {
            this.f79223a = hVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/detail/viewdata/ThirdPartyEventViewData$getFooterData$1", "Lcom/ss/android/lark/calendar/impl/features/events/detail/idata/IFooterData;", "getFooterType", "Lcom/ss/android/lark/calendar/impl/features/events/detail/idata/IFooterData$FooterType;", "getRSVPStatus", "Lcom/ss/android/lark/calendar/impl/features/events/detail/idata/RSVPStatus;", "getRsvpBotCardReplyStatus", "", "isShowRsvpCommentIcon", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.e.h$d */
    public static final class C31293d implements IFooterData {

        /* renamed from: a */
        final /* synthetic */ ThirdPartyEventViewData f79225a;

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

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IFooterData
        /* renamed from: b */
        public RSVPStatus mo113677b() {
            return this.f79225a.mo113603u();
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IFooterData
        /* renamed from: a */
        public IFooterData.FooterType mo113676a() {
            CalendarEvent c = this.f79225a.f79222b.mo113417c();
            if (c == null) {
                return IFooterData.FooterType.GONE;
            }
            Calendar j = this.f79225a.f79222b.mo113427j();
            if (j == null) {
                return IFooterData.FooterType.GONE;
            }
            if (Intrinsics.areEqual(c.getCalendarId(), c.getOrganizerCalendarId()) && this.f79225a.f79222b.mo113439v()) {
                return IFooterData.FooterType.GONE;
            }
            if (!AuthorityUtil.f79153a.mo113575a(c, j) || !SchemaHelper.f83746a.mo120313a("RSVP", c.getCalendarSchemaCollection())) {
                return IFooterData.FooterType.GONE;
            }
            return IFooterData.FooterType.RSVP;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31293d(ThirdPartyEventViewData hVar) {
            this.f79225a = hVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\u0007\u001a\u00020\u0005H\u0016J\n\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\r\u001a\u00020\u000bH\u0016J\b\u0010\u000e\u001a\u00020\u000bH\u0016J\b\u0010\u000f\u001a\u00020\u000bH\u0016J\b\u0010\u0010\u001a\u00020\u000bH\u0016J\b\u0010\u0011\u001a\u00020\u000bH\u0016J\b\u0010\u0012\u001a\u00020\u000bH\u0016J\b\u0010\u0013\u001a\u00020\u000bH\u0016J\b\u0010\u0014\u001a\u00020\u000bH\u0016¨\u0006\u0015"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/detail/viewdata/ThirdPartyEventViewData$getTitleViewData$1", "Lcom/ss/android/lark/calendar/impl/features/events/detail/idata/ITitleData;", "getEventDeleteAbility", "", "getEventServerID", "", "getEventStartTime", "getEventSummary", "getTransferEventData", "Lcom/ss/android/lark/calendar/impl/features/events/detail/fragment/transfer/TransferEventData;", "isEditIconDisable", "", "isShowEditIcon", "isShowExchangeIcon", "isShowExternalIcon", "isShowGoogleIcon", "isShowHint", "isShowLocalIcon", "isShowReportIcon", "isShowSharableIcon", "isShowTransferIcon", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.e.h$f */
    public static final class C31295f implements ITitleData {

        /* renamed from: a */
        final /* synthetic */ ThirdPartyEventViewData f79227a;

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.ITitleData
        /* renamed from: d */
        public boolean mo113693d() {
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
        /* renamed from: j */
        public boolean mo113699j() {
            return this.f79227a.mo113605w();
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.ITitleData
        /* renamed from: o */
        public boolean mo113704o() {
            return this.f79227a.mo113604v();
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.ITitleData
        /* renamed from: a */
        public String mo113690a() {
            return this.f79227a.f79222b.mo113437t();
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.ITitleData
        /* renamed from: b */
        public String mo113691b() {
            return this.f79227a.f79222b.mo113395D();
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.ITitleData
        /* renamed from: c */
        public String mo113692c() {
            return this.f79227a.f79222b.mo113397F();
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.ITitleData
        /* renamed from: e */
        public boolean mo113694e() {
            return this.f79227a.f79222b.mo113438u();
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.ITitleData
        /* renamed from: f */
        public boolean mo113695f() {
            return this.f79227a.f79222b.mo113439v();
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.ITitleData
        /* renamed from: i */
        public boolean mo113698i() {
            boolean z;
            CalendarSchemaCollection calendarSchemaCollection;
            com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventDisplayInfo calendarEventDisplayInfo;
            CalendarEvent c = this.f79227a.f79222b.mo113417c();
            if (c == null || (calendarEventDisplayInfo = c.getCalendarEventDisplayInfo()) == null) {
                z = false;
            } else {
                z = calendarEventDisplayInfo.isEditableBtnShow();
            }
            if (!z) {
                return false;
            }
            SchemaHelper.Companion aVar = SchemaHelper.f83746a;
            CalendarEvent c2 = this.f79227a.f79222b.mo113417c();
            if (c2 != null) {
                calendarSchemaCollection = c2.getCalendarSchemaCollection();
            } else {
                calendarSchemaCollection = null;
            }
            if (aVar.mo120313a("EditIcon", calendarSchemaCollection)) {
                return true;
            }
            return false;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.ITitleData
        /* renamed from: m */
        public boolean mo113702m() {
            com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventDisplayInfo calendarEventDisplayInfo;
            CalendarEvent c = this.f79227a.f79222b.mo113417c();
            if (c == null || (calendarEventDisplayInfo = c.getCalendarEventDisplayInfo()) == null || !calendarEventDisplayInfo.isReportBtnShow() || !C30022a.f74883b.mo112693a() || !C30022a.f74885d.mo112720b()) {
                return false;
            }
            return true;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.ITitleData
        /* renamed from: n */
        public int mo113703n() {
            com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventDisplayInfo calendarEventDisplayInfo;
            CalendarSchemaCollection calendarSchemaCollection;
            CalendarEvent c = this.f79227a.f79222b.mo113417c();
            if (!(c == null || (calendarEventDisplayInfo = c.getCalendarEventDisplayInfo()) == null || !calendarEventDisplayInfo.isDeletableBtnShow())) {
                SchemaHelper.Companion aVar = SchemaHelper.f83746a;
                CalendarEvent c2 = this.f79227a.f79222b.mo113417c();
                if (c2 != null) {
                    calendarSchemaCollection = c2.getCalendarSchemaCollection();
                } else {
                    calendarSchemaCollection = null;
                }
                if (aVar.mo120313a("DeleteIcon", calendarSchemaCollection)) {
                    if (OperationUtils.f80189a.mo114889f(this.f79227a.f79222b.mo113417c())) {
                        return 1;
                    }
                    if (OperationUtils.f80189a.mo114890g(this.f79227a.f79222b.mo113417c())) {
                        return 2;
                    }
                }
            }
            return 0;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31295f(ThirdPartyEventViewData hVar) {
            this.f79227a = hVar;
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.detail.ICalendarDetailContact.IDetailViewData
    /* renamed from: a */
    public ITitleData mo113559a() {
        return new C31295f(this);
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.detail.ICalendarDetailContact.IDetailViewData
    /* renamed from: b */
    public IHeaderData mo113560b() {
        return new C31294e(this);
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.detail.ICalendarDetailContact.IDetailViewData
    /* renamed from: c */
    public IBodyData mo113561c() {
        return new C31291b(this);
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.detail.ICalendarDetailContact.IDetailViewData
    /* renamed from: d */
    public IFooterData mo113562d() {
        return new C31293d(this);
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.detail.ICalendarDetailContact.IDetailViewData
    /* renamed from: e */
    public IDialogData mo113563e() {
        return new C31292c(this);
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.detail.ICalendarDetailContact.IDetailViewData
    /* renamed from: f */
    public IAttendeeFragmentData mo113564f() {
        return mo113606x();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/detail/viewdata/ThirdPartyEventViewData$getDialogData$1", "Lcom/ss/android/lark/calendar/impl/features/events/detail/idata/IDialogData;", "getOrganizerName", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.e.h$c */
    public static final class C31292c implements IDialogData {

        /* renamed from: a */
        final /* synthetic */ ThirdPartyEventViewData f79224a;

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IDialogData
        /* renamed from: a */
        public String mo113675a() {
            return AttendeeUtil.f79151a.mo113571d(this.f79224a.f79222b.mo113417c());
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31292c(ThirdPartyEventViewData hVar) {
            this.f79224a = hVar;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ThirdPartyEventViewData(ICalendarDetailContact.IDetailModel aVar) {
        super(aVar);
        Intrinsics.checkParameterIsNotNull(aVar, "model");
        this.f79222b = aVar;
    }
}
