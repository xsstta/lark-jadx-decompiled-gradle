package com.ss.android.lark.calendar.impl.features.events.detail.viewdata;

import android.text.TextUtils;
import com.bytedance.lark.pb.calendar.v1.CalendarEventDisplayInfo;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.api.entity.CalendarPstnDetailInfo;
import com.ss.android.lark.calendar.impl.features.common.helper.ReminderHelper;
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
import com.ss.android.lark.calendar.impl.rustadapter.doentity.Calendar;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttachment;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttendee;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventDisplayInfo;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarLocation;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarSchemaCollection;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarSetting;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.DoVideoMeeting;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.calendar.impl.utils.SchemaHelper;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30054s;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/detail/viewdata/NotJoinEventViewData;", "Lcom/ss/android/lark/calendar/impl/features/events/detail/viewdata/BaseEventViewData;", "Lcom/ss/android/lark/calendar/impl/features/events/detail/ICalendarDetailContact$IDetailViewData;", "model", "Lcom/ss/android/lark/calendar/impl/features/events/detail/ICalendarDetailContact$IDetailModel;", "(Lcom/ss/android/lark/calendar/impl/features/events/detail/ICalendarDetailContact$IDetailModel;)V", "getAttendeeFragmentData", "Lcom/ss/android/lark/calendar/impl/features/events/detail/idata/IAttendeeFragmentData;", "getBodyData", "Lcom/ss/android/lark/calendar/impl/features/events/detail/idata/IBodyData;", "getDialogData", "Lcom/ss/android/lark/calendar/impl/features/events/detail/idata/IDialogData;", "getFooterData", "Lcom/ss/android/lark/calendar/impl/features/events/detail/idata/IFooterData;", "getHeaderData", "Lcom/ss/android/lark/calendar/impl/features/events/detail/idata/IHeaderData;", "getTitleViewData", "Lcom/ss/android/lark/calendar/impl/features/events/detail/idata/ITitleData;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.e.g */
public final class NotJoinEventViewData extends BaseEventViewData implements ICalendarDetailContact.IDetailViewData {

    /* renamed from: b */
    public final ICalendarDetailContact.IDetailModel f79215b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000{\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\u0018\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bH\u0016J\b\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\nH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\nH\u0016J\b\u0010\u0012\u001a\u00020\nH\u0016J\b\u0010\u0013\u001a\u00020\nH\u0016J\u000f\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0002\u0010\u0016J\u000f\u0010\u0017\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0002\u0010\u0016J\u000f\u0010\u0018\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0002\u0010\u0016J\b\u0010\u0019\u001a\u00020\u0010H\u0016J\b\u0010\u001a\u001a\u00020\nH\u0016J\b\u0010\u001b\u001a\u00020\nH\u0016J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\nH\u0016J\b\u0010\u001f\u001a\u00020 H\u0016J\b\u0010!\u001a\u00020\nH\u0016J\b\u0010\"\u001a\u00020\nH\u0016J\b\u0010#\u001a\u00020\nH\u0016J\b\u0010$\u001a\u00020%H\u0016J\u000e\u0010&\u001a\b\u0012\u0004\u0012\u00020'0\u0003H\u0016J\n\u0010(\u001a\u0004\u0018\u00010)H\u0016J\b\u0010*\u001a\u00020\nH\u0016J\n\u0010+\u001a\u0004\u0018\u00010,H\u0016J\b\u0010-\u001a\u00020.H\u0016J\n\u0010/\u001a\u0004\u0018\u000100H\u0016J\b\u00101\u001a\u00020\u0010H\u0016J\b\u00102\u001a\u00020\u0010H\u0016J\b\u00103\u001a\u00020\u0010H\u0016J\b\u00104\u001a\u00020\u0010H\u0016J\b\u00105\u001a\u00020\u0010H\u0016J\b\u00106\u001a\u00020\u0010H\u0016J\b\u00107\u001a\u00020\u0010H\u0016J\b\u00108\u001a\u00020\u0010H\u0016J\b\u00109\u001a\u00020\u0010H\u0016J\b\u0010:\u001a\u00020\u0010H\u0016J\b\u0010;\u001a\u00020\u0010H\u0016J\b\u0010<\u001a\u00020\u0010H\u0016J\b\u0010=\u001a\u00020\u0010H\u0016J\b\u0010>\u001a\u00020\u0010H\u0016¨\u0006?"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/detail/viewdata/NotJoinEventViewData$getBodyData$1", "Lcom/ss/android/lark/calendar/impl/features/events/detail/idata/IBodyData;", "getAttachmentDatas", "", "Lcom/ss/android/lark/calendar/impl/features/common/widget/attachment/AttachmentItemData;", "getAttendeeDatas", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/calendar/impl/features/events/detail/idata/IBodyData$IAttendeeDetailData;", "Lkotlin/collections/ArrayList;", "getAttendeeNumDetailText", "", "getAttendeeNumText", "getAttendeeVisiblility", "Lcom/ss/android/lark/calendar/impl/features/events/detail/idata/IBodyData$AttendeeVisibility;", "getCalendarSummary", "getCanEditEvent", "", "getCreatorDisplayName", "getDescriptionRichData", "getDescriptionTextData", "getDueTime", "", "()Ljava/lang/Long;", "getDueTimeClientReqStartTime", "getDueTimeServerReqTime", "getEventIsCrossTenant", "getEventScopeText", "getEventServerId", "getEventSource", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEvent$Source;", "getEventStartTime", "getEventType", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEvent$Type;", "getFragmentAttendeeNumText", "getFreeBusyText", "getLiveEventId", "getLocationData", "Lcom/ss/android/lark/calendar/impl/features/events/detail/idata/IBodyData$ILocationData;", "getMeetingRoomDatas", "Lcom/ss/android/lark/calendar/impl/features/events/detail/idata/IBodyData$IMeetingRoomData;", "getOrganizerData", "Lcom/ss/android/lark/calendar/impl/features/events/detail/idata/IBodyData$IOrganizerData;", "getReminderText", "getVideoMeeting", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/DoVideoMeeting;", "getVideoMeetingVisibility", "Lcom/ss/android/lark/calendar/impl/features/events/detail/idata/VideoMeetingVisibility;", "getVideoPstnDetailInfo", "Lcom/ss/android/lark/calendar/api/entity/CalendarPstnDetailInfo;", "isCreatorResigned", "isShowAttachment", "isShowCalendarResignedLabel", "isShowCalendarSummary", "isShowCreator", "isShowEventScope", "isShowFreeBusy", "isShowLocation", "isShowMeetingRoom", "isShowNotOrganizerTip", "isShowOrganizer", "isShowReminder", "isShowRichDescription", "isShowTextDescription", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.e.g$a */
    public static final class C31286a implements IBodyData {

        /* renamed from: a */
        final /* synthetic */ NotJoinEventViewData f79216a;

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData
        /* renamed from: A */
        public boolean mo113633A() {
            return false;
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
        /* renamed from: v */
        public boolean mo113670v() {
            return false;
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
        /* renamed from: e */
        public IBodyData.AttendeeVisibility mo113653e() {
            return IBodyData.AttendeeVisibility.GONE;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData
        /* renamed from: P */
        public String mo113648P() {
            return this.f79216a.mo113593k();
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData
        /* renamed from: b */
        public List<IBodyData.IMeetingRoomData> mo113650b() {
            return this.f79216a.mo113594l();
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData
        /* renamed from: d */
        public IBodyData.ILocationData mo113652d() {
            return this.f79216a.mo113595m();
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData
        /* renamed from: f */
        public String mo113654f() {
            return this.f79216a.mo113596n();
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData
        /* renamed from: g */
        public String mo113655g() {
            return this.f79216a.mo113597o();
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData
        /* renamed from: i */
        public ArrayList<IBodyData.IAttendeeDetailData> mo113657i() {
            return this.f79216a.mo113598p();
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData
        /* renamed from: m */
        public String mo113661m() {
            return this.f79216a.mo113600r();
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData
        /* renamed from: q */
        public List<AttachmentItemData> mo113665q() {
            return this.f79216a.mo113601s();
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData
        /* renamed from: z */
        public IBodyData.IOrganizerData mo113674z() {
            return this.f79216a.mo113602t();
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData
        /* renamed from: N */
        public String mo113646N() {
            return this.f79216a.f79215b.mo113395D();
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData
        /* renamed from: O */
        public String mo113647O() {
            return this.f79216a.f79215b.mo113397F();
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
            CalendarEventDisplayInfo calendarEventDisplayInfo;
            CalendarEvent c = this.f79216a.f79215b.mo113417c();
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
            CalendarEvent c = this.f79216a.f79215b.mo113417c();
            if (c == null || (creator = c.getCreator()) == null || (localizedDisplayName = creator.getLocalizedDisplayName()) == null) {
                return "";
            }
            return localizedDisplayName;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData
        /* renamed from: E */
        public DoVideoMeeting mo113637E() {
            CalendarEvent c = this.f79216a.f79215b.mo113417c();
            if (c != null) {
                return c.getVideoMeeting();
            }
            return null;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData
        /* renamed from: K */
        public boolean mo113643K() {
            CalendarEvent c = this.f79216a.f79215b.mo113417c();
            if (c != null) {
                return c.isCrossTenant();
            }
            return false;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData
        /* renamed from: L */
        public CalendarEvent.Type mo113644L() {
            CalendarEvent.Type type;
            CalendarEvent c = this.f79216a.f79215b.mo113417c();
            if (c == null || (type = c.getType()) == null) {
                return CalendarEvent.Type.DEFAULT_TYPE;
            }
            return type;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData
        /* renamed from: M */
        public CalendarEvent.Source mo113645M() {
            CalendarEvent.Source source;
            CalendarEvent c = this.f79216a.f79215b.mo113417c();
            if (c == null || (source = c.getSource()) == null) {
                return CalendarEvent.Source.UNKNOWN_SOURCE;
            }
            return source;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData
        /* renamed from: t */
        public String mo113668t() {
            String description;
            CalendarEvent c = this.f79216a.f79215b.mo113417c();
            if (c == null || (description = c.getDescription()) == null) {
                return "";
            }
            return description;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData
        /* renamed from: u */
        public String mo113669u() {
            String docsDescription;
            CalendarEvent c = this.f79216a.f79215b.mo113417c();
            if (c == null || (docsDescription = c.getDocsDescription()) == null) {
                return "";
            }
            return docsDescription;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData
        /* renamed from: x */
        public String mo113672x() {
            String noteOrLocalizeSummary;
            Calendar j = this.f79216a.f79215b.mo113427j();
            if (j == null || (noteOrLocalizeSummary = j.getNoteOrLocalizeSummary()) == null) {
                return "";
            }
            return noteOrLocalizeSummary;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData
        /* renamed from: a */
        public boolean mo113649a() {
            List<CalendarEventAttendee> list;
            AttendeeUtil aVar = AttendeeUtil.f79151a;
            CalendarEvent c = this.f79216a.f79215b.mo113417c();
            CalendarSchemaCollection calendarSchemaCollection = null;
            if (c != null) {
                list = c.getAttendees();
            } else {
                list = null;
            }
            if (CollectionUtils.isNotEmpty(aVar.mo113568a(list))) {
                SchemaHelper.Companion aVar2 = SchemaHelper.f83746a;
                CalendarEvent c2 = this.f79216a.f79215b.mo113417c();
                if (c2 != null) {
                    calendarSchemaCollection = c2.getCalendarSchemaCollection();
                }
                if (aVar2.mo120313a("MeetingRoom", calendarSchemaCollection)) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData
        /* renamed from: c */
        public boolean mo113651c() {
            CalendarLocation calendarLocation;
            CalendarEvent c = this.f79216a.f79215b.mo113417c();
            CalendarSchemaCollection calendarSchemaCollection = null;
            if (c != null) {
                calendarLocation = c.getLocation();
            } else {
                calendarLocation = null;
            }
            if (calendarLocation != null) {
                SchemaHelper.Companion aVar = SchemaHelper.f83746a;
                CalendarEvent c2 = this.f79216a.f79215b.mo113417c();
                if (c2 != null) {
                    calendarSchemaCollection = c2.getCalendarSchemaCollection();
                }
                if (aVar.mo120313a("Location", calendarSchemaCollection)) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData
        /* renamed from: k */
        public String mo113659k() {
            boolean z;
            int i;
            CalendarSetting c = C30022a.f74884c.mo108456c();
            CalendarEvent c2 = this.f79216a.f79215b.mo113417c();
            if (c2 != null) {
                z = c2.isAllDay();
            } else {
                z = false;
            }
            if (z) {
                i = c.getDefaultAllDayReminder();
            } else {
                i = c.getDefaultNoneAllDayReminder();
            }
            return ReminderHelper.f78619a.mo112733a(i, z);
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData
        /* renamed from: n */
        public boolean mo113662n() {
            CalendarSchemaCollection calendarSchemaCollection;
            CalendarEvent c = this.f79216a.f79215b.mo113417c();
            if (c != null && c.isFree()) {
                SchemaHelper.Companion aVar = SchemaHelper.f83746a;
                CalendarEvent c2 = this.f79216a.f79215b.mo113417c();
                if (c2 != null) {
                    calendarSchemaCollection = c2.getCalendarSchemaCollection();
                } else {
                    calendarSchemaCollection = null;
                }
                if (aVar.mo120313a("FreeBusy", calendarSchemaCollection)) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData
        /* renamed from: p */
        public boolean mo113664p() {
            List<CalendarEventAttachment> list;
            CalendarEvent c = this.f79216a.f79215b.mo113417c();
            CalendarSchemaCollection calendarSchemaCollection = null;
            if (c != null) {
                list = c.getAttachment();
            } else {
                list = null;
            }
            if (CollectionUtils.isNotEmpty(list)) {
                SchemaHelper.Companion aVar = SchemaHelper.f83746a;
                CalendarEvent c2 = this.f79216a.f79215b.mo113417c();
                if (c2 != null) {
                    calendarSchemaCollection = c2.getCalendarSchemaCollection();
                }
                if (aVar.mo120313a("Attachment", calendarSchemaCollection)) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData
        /* renamed from: r */
        public boolean mo113666r() {
            CalendarEvent c = this.f79216a.f79215b.mo113417c();
            if (c == null || TextUtils.isEmpty(c.getDescription()) || !SchemaHelper.f83746a.mo120313a("Description", c.getCalendarSchemaCollection())) {
                return false;
            }
            return true;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData
        /* renamed from: s */
        public boolean mo113667s() {
            CalendarEvent c = this.f79216a.f79215b.mo113417c();
            if (c == null || TextUtils.isEmpty(c.getDocsDescription()) || !SchemaHelper.f83746a.mo120313a("Description", c.getCalendarSchemaCollection())) {
                return false;
            }
            return true;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData
        /* renamed from: y */
        public boolean mo113673y() {
            CalendarSchemaCollection calendarSchemaCollection;
            CalendarEvent c;
            CalendarEventDisplayInfo calendarEventDisplayInfo;
            SchemaHelper.Companion aVar = SchemaHelper.f83746a;
            CalendarEvent c2 = this.f79216a.f79215b.mo113417c();
            if (c2 != null) {
                calendarSchemaCollection = c2.getCalendarSchemaCollection();
            } else {
                calendarSchemaCollection = null;
            }
            if (aVar.mo120313a("OrganizerOrCreator", calendarSchemaCollection) && (c = this.f79216a.f79215b.mo113417c()) != null && (calendarEventDisplayInfo = c.getCalendarEventDisplayInfo()) != null && calendarEventDisplayInfo.isEventOrganizerShow()) {
                return true;
            }
            return false;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0027, code lost:
            if (r0 == com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent.Visibility.PRIVATE) goto L_0x0029;
         */
        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData
        /* renamed from: l */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo113660l() {
            /*
                r3 = this;
                com.ss.android.lark.calendar.impl.features.events.detail.e.g r0 = r3.f79216a
                com.ss.android.lark.calendar.impl.features.events.detail.d$a r0 = r0.f79215b
                com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent r0 = r0.mo113417c()
                r1 = 0
                if (r0 == 0) goto L_0x0010
                com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent$Visibility r0 = r0.getVisibility()
                goto L_0x0011
            L_0x0010:
                r0 = r1
            L_0x0011:
                com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent$Visibility r2 = com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent.Visibility.PUBLIC
                if (r0 == r2) goto L_0x0029
                com.ss.android.lark.calendar.impl.features.events.detail.e.g r0 = r3.f79216a
                com.ss.android.lark.calendar.impl.features.events.detail.d$a r0 = r0.f79215b
                com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent r0 = r0.mo113417c()
                if (r0 == 0) goto L_0x0024
                com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent$Visibility r0 = r0.getVisibility()
                goto L_0x0025
            L_0x0024:
                r0 = r1
            L_0x0025:
                com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent$Visibility r2 = com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent.Visibility.PRIVATE
                if (r0 != r2) goto L_0x0043
            L_0x0029:
                com.ss.android.lark.calendar.impl.utils.ah$a r0 = com.ss.android.lark.calendar.impl.utils.SchemaHelper.f83746a
                com.ss.android.lark.calendar.impl.features.events.detail.e.g r2 = r3.f79216a
                com.ss.android.lark.calendar.impl.features.events.detail.d$a r2 = r2.f79215b
                com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent r2 = r2.mo113417c()
                if (r2 == 0) goto L_0x0039
                com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarSchemaCollection r1 = r2.getCalendarSchemaCollection()
            L_0x0039:
                java.lang.String r2 = "Scope"
                boolean r0 = r0.mo120313a(r2, r1)
                if (r0 == 0) goto L_0x0043
                r0 = 1
                goto L_0x0044
            L_0x0043:
                r0 = 0
            L_0x0044:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.calendar.impl.features.events.detail.viewdata.NotJoinEventViewData.C31286a.mo113660l():boolean");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31286a(NotJoinEventViewData gVar) {
            this.f79216a = gVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/detail/viewdata/NotJoinEventViewData$getFooterData$1", "Lcom/ss/android/lark/calendar/impl/features/events/detail/idata/IFooterData;", "getFooterType", "Lcom/ss/android/lark/calendar/impl/features/events/detail/idata/IFooterData$FooterType;", "getRSVPStatus", "Lcom/ss/android/lark/calendar/impl/features/events/detail/idata/RSVPStatus;", "getRsvpBotCardReplyStatus", "", "isShowRsvpCommentIcon", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.e.g$c */
    public static final class C31288c implements IFooterData {

        /* renamed from: a */
        final /* synthetic */ NotJoinEventViewData f79218a;

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
            return RSVPStatus.NEEDS_ACTION;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IFooterData
        /* renamed from: a */
        public IFooterData.FooterType mo113676a() {
            CalendarSchemaCollection calendarSchemaCollection;
            SchemaHelper.Companion aVar = SchemaHelper.f83746a;
            CalendarEvent c = this.f79218a.f79215b.mo113417c();
            if (c != null) {
                calendarSchemaCollection = c.getCalendarSchemaCollection();
            } else {
                calendarSchemaCollection = null;
            }
            if (!aVar.mo120313a("RSVP", calendarSchemaCollection)) {
                return IFooterData.FooterType.GONE;
            }
            if (Intrinsics.areEqual((Object) this.f79218a.f79215b.mo113433p(), (Object) false)) {
                return IFooterData.FooterType.UNJOINABLE;
            }
            return IFooterData.FooterType.JOIN;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31288c(NotJoinEventViewData gVar) {
            this.f79218a = gVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\u0003H\u0016J\b\u0010\t\u001a\u00020\u0003H\u0016J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016J\b\u0010\u0012\u001a\u00020\rH\u0016J\b\u0010\u0013\u001a\u00020\rH\u0016¨\u0006\u0014"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/detail/viewdata/NotJoinEventViewData$getHeaderData$1", "Lcom/ss/android/lark/calendar/impl/features/events/detail/idata/IHeaderData;", "getEventServerId", "", "getEventStartTime", "getEventSummary", "getHeaderColor", "", "getRuleText", "getTimeText", "getVideoMeetingVisibility", "Lcom/ss/android/lark/calendar/impl/features/events/detail/idata/VideoMeetingVisibility;", "isHasChatGroup", "", "isHasMeetingMinute", "isShowChatGroupIcon", "Lcom/bytedance/lark/pb/calendar/v1/CalendarEventDisplayInfo$ButtonDisplayType;", "isShowMeetingMinuteIcon", "isShowRule", "isStartAndEndSameDay", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.e.g$d */
    public static final class C31289d implements IHeaderData {

        /* renamed from: a */
        final /* synthetic */ NotJoinEventViewData f79219a;

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
            return this.f79219a.mo113590h();
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IHeaderData
        /* renamed from: c */
        public String mo113682c() {
            return this.f79219a.mo113591i();
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IHeaderData
        /* renamed from: d */
        public boolean mo113683d() {
            return this.f79219a.mo113592j();
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IHeaderData
        /* renamed from: b */
        public String mo113681b() {
            return this.f79219a.f79215b.mo113437t();
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IHeaderData
        /* renamed from: f */
        public String mo113685f() {
            String rRule;
            CalendarEvent c = this.f79219a.f79215b.mo113417c();
            if (c == null || (rRule = c.getRRule()) == null) {
                return "";
            }
            return rRule;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IHeaderData
        /* renamed from: e */
        public boolean mo113684e() {
            String str;
            if (this.f79219a.f79215b.mo113393B()) {
                return false;
            }
            CalendarEvent c = this.f79219a.f79215b.mo113417c();
            if (c != null) {
                str = c.getRRule();
            } else {
                str = null;
            }
            return !TextUtils.isEmpty(str);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31289d(NotJoinEventViewData gVar) {
            this.f79219a = gVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\u0007\u001a\u00020\u0005H\u0016J\n\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\r\u001a\u00020\u000bH\u0016J\b\u0010\u000e\u001a\u00020\u000bH\u0016J\b\u0010\u000f\u001a\u00020\u000bH\u0016J\b\u0010\u0010\u001a\u00020\u000bH\u0016J\b\u0010\u0011\u001a\u00020\u000bH\u0016J\b\u0010\u0012\u001a\u00020\u000bH\u0016J\b\u0010\u0013\u001a\u00020\u000bH\u0016J\b\u0010\u0014\u001a\u00020\u000bH\u0016¨\u0006\u0015"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/detail/viewdata/NotJoinEventViewData$getTitleViewData$1", "Lcom/ss/android/lark/calendar/impl/features/events/detail/idata/ITitleData;", "getEventDeleteAbility", "", "getEventServerID", "", "getEventStartTime", "getEventSummary", "getTransferEventData", "Lcom/ss/android/lark/calendar/impl/features/events/detail/fragment/transfer/TransferEventData;", "isEditIconDisable", "", "isShowEditIcon", "isShowExchangeIcon", "isShowExternalIcon", "isShowGoogleIcon", "isShowHint", "isShowLocalIcon", "isShowReportIcon", "isShowSharableIcon", "isShowTransferIcon", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.e.g$e */
    public static final class C31290e implements ITitleData {

        /* renamed from: a */
        final /* synthetic */ NotJoinEventViewData f79220a;

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
        /* renamed from: i */
        public boolean mo113698i() {
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
        /* renamed from: n */
        public int mo113703n() {
            return 0;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.ITitleData
        /* renamed from: j */
        public boolean mo113699j() {
            return this.f79220a.mo113605w();
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.ITitleData
        /* renamed from: o */
        public boolean mo113704o() {
            return this.f79220a.mo113604v();
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.ITitleData
        /* renamed from: a */
        public String mo113690a() {
            return this.f79220a.f79215b.mo113437t();
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.ITitleData
        /* renamed from: b */
        public String mo113691b() {
            return this.f79220a.f79215b.mo113395D();
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.ITitleData
        /* renamed from: c */
        public String mo113692c() {
            return this.f79220a.f79215b.mo113397F();
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.ITitleData
        /* renamed from: d */
        public boolean mo113693d() {
            boolean z;
            CalendarEvent c = this.f79220a.f79215b.mo113417c();
            if (c == null) {
                return false;
            }
            if (c.getDisplayType() == CalendarEvent.DisplayType.LIMITED) {
                z = true;
            } else {
                z = false;
            }
            if (!c.isCrossTenant()) {
                return false;
            }
            AbstractC30054s g = this.f79220a.mo113589g();
            Intrinsics.checkExpressionValueIsNotNull(g, "loginDependency");
            if (g.mo108270b() || z) {
                return false;
            }
            return true;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.ITitleData
        /* renamed from: h */
        public boolean mo113697h() {
            com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventDisplayInfo calendarEventDisplayInfo;
            CalendarSchemaCollection calendarSchemaCollection;
            CalendarEvent c = this.f79220a.f79215b.mo113417c();
            if (!(c == null || (calendarEventDisplayInfo = c.getCalendarEventDisplayInfo()) == null || !calendarEventDisplayInfo.isSharableBtnShow())) {
                SchemaHelper.Companion aVar = SchemaHelper.f83746a;
                CalendarEvent c2 = this.f79220a.f79215b.mo113417c();
                if (c2 != null) {
                    calendarSchemaCollection = c2.getCalendarSchemaCollection();
                } else {
                    calendarSchemaCollection = null;
                }
                if (aVar.mo120313a("ForwardIcon", calendarSchemaCollection)) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.ITitleData
        /* renamed from: m */
        public boolean mo113702m() {
            com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventDisplayInfo calendarEventDisplayInfo;
            CalendarEvent c = this.f79220a.f79215b.mo113417c();
            if (c == null || (calendarEventDisplayInfo = c.getCalendarEventDisplayInfo()) == null || !calendarEventDisplayInfo.isReportBtnShow() || !C30022a.f74883b.mo112693a() || !C30022a.f74885d.mo112720b()) {
                return false;
            }
            return true;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31290e(NotJoinEventViewData gVar) {
            this.f79220a = gVar;
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.detail.ICalendarDetailContact.IDetailViewData
    /* renamed from: a */
    public ITitleData mo113559a() {
        return new C31290e(this);
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.detail.ICalendarDetailContact.IDetailViewData
    /* renamed from: b */
    public IHeaderData mo113560b() {
        return new C31289d(this);
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.detail.ICalendarDetailContact.IDetailViewData
    /* renamed from: c */
    public IBodyData mo113561c() {
        return new C31286a(this);
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.detail.ICalendarDetailContact.IDetailViewData
    /* renamed from: d */
    public IFooterData mo113562d() {
        return new C31288c(this);
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.detail.ICalendarDetailContact.IDetailViewData
    /* renamed from: e */
    public IDialogData mo113563e() {
        return new C31287b(this);
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.detail.ICalendarDetailContact.IDetailViewData
    /* renamed from: f */
    public IAttendeeFragmentData mo113564f() {
        return mo113606x();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/detail/viewdata/NotJoinEventViewData$getDialogData$1", "Lcom/ss/android/lark/calendar/impl/features/events/detail/idata/IDialogData;", "getOrganizerName", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.e.g$b */
    public static final class C31287b implements IDialogData {

        /* renamed from: a */
        final /* synthetic */ NotJoinEventViewData f79217a;

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IDialogData
        /* renamed from: a */
        public String mo113675a() {
            return AttendeeUtil.f79151a.mo113571d(this.f79217a.f79215b.mo113417c());
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31287b(NotJoinEventViewData gVar) {
            this.f79217a = gVar;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NotJoinEventViewData(ICalendarDetailContact.IDetailModel aVar) {
        super(aVar);
        Intrinsics.checkParameterIsNotNull(aVar, "model");
        this.f79215b = aVar;
    }
}
