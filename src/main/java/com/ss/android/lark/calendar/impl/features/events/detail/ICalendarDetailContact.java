package com.ss.android.lark.calendar.impl.features.events.detail;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.ee.bear.middleground.comment.Comment;
import com.ss.android.lark.calendar.api.entity.CalendarPstnDetailInfo;
import com.ss.android.lark.calendar.impl.features.events.detail.idata.IAttendeeFragmentData;
import com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData;
import com.ss.android.lark.calendar.impl.features.events.detail.idata.IDialogData;
import com.ss.android.lark.calendar.impl.features.events.detail.idata.IFooterData;
import com.ss.android.lark.calendar.impl.features.events.detail.idata.IHeaderData;
import com.ss.android.lark.calendar.impl.features.events.detail.idata.ITitleData;
import com.ss.android.lark.calendar.impl.features.events.detail.idata.RSVPStatus;
import com.ss.android.lark.calendar.impl.features.events.detail.idata.VideoMeetingVisibility;
import com.ss.android.lark.calendar.impl.features.events.detail.share.EventShareDialog;
import com.ss.android.lark.calendar.impl.features.events.detail.videoUrl.entity.AssociatedLiveStatus;
import com.ss.android.lark.calendar.impl.features.events.detail.videoUrl.entity.AssociatedVideoChatStatus;
import com.ss.android.lark.calendar.impl.features.events.detail.videoUrl.entity.VideoType;
import com.ss.android.lark.calendar.impl.framework.calendarmvp.IModelCalendar;
import com.ss.android.lark.calendar.impl.framework.calendarmvp.IViewCalender;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.Calendar;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttendee;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventInstance;
import com.ss.android.lark.pb.videoconference.v1.GetAdminSettingsResponse;
import com.tt.frontendapiinterface.ApiHandler;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/detail/ICalendarDetailContact;", "", "IDetailModel", "IDetailView", "IDetailViewAction", "IDetailViewData", "ViewDependency", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.d */
public interface ICalendarDetailContact {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000e\u0010[\u001a\b\u0012\u0004\u0012\u00020\"0\\H&J\b\u0010]\u001a\u00020\"H&J\b\u0010^\u001a\u00020\"H&J\b\u0010_\u001a\u00020\"H&J\b\u0010`\u001a\u00020\"H&J\b\u0010a\u001a\u000204H&J\b\u0010b\u001a\u000204H&J\b\u0010c\u001a\u000204H&J\b\u0010d\u001a\u000204H&J\b\u0010e\u001a\u000204H&J\b\u0010f\u001a\u000204H&J\b\u0010g\u001a\u000204H&J\b\u0010h\u001a\u000204H&J\b\u0010i\u001a\u000204H&J\b\u0010j\u001a\u000204H&J\u0018\u0010k\u001a\u00020l2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010m\u001a\u000204H&R\u001a\u0010\u0003\u001a\u0004\u0018\u00010\u0004X¦\u000e¢\u0006\f\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u0004\u0018\u00010\nX¦\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u0004\u0018\u00010\nX¦\u000e¢\u0006\f\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u001a\u0010\u0012\u001a\u0004\u0018\u00010\nX¦\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR\u001a\u0010\u0015\u001a\u0004\u0018\u00010\u0016X¦\u000e¢\u0006\f\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u0004\u0018\u00010\u001cX¦\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010!\u001a\u0004\u0018\u00010\"X¦\u000e¢\u0006\f\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u0018\u0010'\u001a\u00020(X¦\u000e¢\u0006\f\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u0018\u0010-\u001a\u00020.X¦\u000e¢\u0006\f\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u0018\u00103\u001a\u000204X¦\u000e¢\u0006\f\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u001a\u00109\u001a\u0004\u0018\u000104X¦\u000e¢\u0006\f\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u001a\u0010=\u001a\u0004\u0018\u00010\"X¦\u000e¢\u0006\f\u001a\u0004\b>\u0010$\"\u0004\b?\u0010&R\u001a\u0010@\u001a\u0004\u0018\u00010\"X¦\u000e¢\u0006\f\u001a\u0004\bA\u0010$\"\u0004\bB\u0010&R\u001a\u0010C\u001a\u0004\u0018\u00010DX¦\u000e¢\u0006\f\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\u0018\u0010I\u001a\u00020\"X¦\u000e¢\u0006\f\u001a\u0004\bJ\u0010$\"\u0004\bK\u0010&R\u001a\u0010L\u001a\u0004\u0018\u00010MX¦\u000e¢\u0006\f\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR\u001a\u0010R\u001a\u0004\u0018\u00010\"X¦\u000e¢\u0006\f\u001a\u0004\bS\u0010$\"\u0004\bT\u0010&R\u0018\u0010U\u001a\u00020VX¦\u000e¢\u0006\f\u001a\u0004\bW\u0010X\"\u0004\bY\u0010Z¨\u0006n"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/detail/ICalendarDetailContact$IDetailModel;", "Lcom/ss/android/lark/calendar/impl/framework/calendarmvp/IModelCalendar;", "Lcom/ss/android/lark/calendar/impl/features/events/detail/ICalendarDetailContact$IDetailViewData;", "calendar", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/Calendar;", "getCalendar", "()Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/Calendar;", "setCalendar", "(Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/Calendar;)V", "dueTime", "", "getDueTime", "()Ljava/lang/Long;", "setDueTime", "(Ljava/lang/Long;)V", "dueTimeClientRequestStartTime", "getDueTimeClientRequestStartTime", "setDueTimeClientRequestStartTime", "dueTimeServerRequestTime", "getDueTimeServerRequestTime", "setDueTimeServerRequestTime", "event", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEvent;", "getEvent", "()Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEvent;", "setEvent", "(Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEvent;)V", "eventInstance", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventInstance;", "getEventInstance", "()Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventInstance;", "setEventInstance", "(Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventInstance;)V", "eventShareCopy", "", "getEventShareCopy", "()Ljava/lang/String;", "setEventShareCopy", "(Ljava/lang/String;)V", "eventType", "Lcom/ss/android/lark/calendar/impl/features/events/detail/CalendarEventType;", "getEventType", "()Lcom/ss/android/lark/calendar/impl/features/events/detail/CalendarEventType;", "setEventType", "(Lcom/ss/android/lark/calendar/impl/features/events/detail/CalendarEventType;)V", "fromSource", "Lcom/ss/android/lark/calendar/impl/features/events/detail/EventDetailSource;", "getFromSource", "()Lcom/ss/android/lark/calendar/impl/features/events/detail/EventDetailSource;", "setFromSource", "(Lcom/ss/android/lark/calendar/impl/features/events/detail/EventDetailSource;)V", "hasOriginalRepeatEvent", "", "getHasOriginalRepeatEvent", "()Z", "setHasOriginalRepeatEvent", "(Z)V", "isJoinable", "()Ljava/lang/Boolean;", "setJoinable", "(Ljava/lang/Boolean;)V", "linkAddress", "getLinkAddress", "setLinkAddress", "messageId", "getMessageId", "setMessageId", "pstnDetailInfo", "Lcom/ss/android/lark/calendar/api/entity/CalendarPstnDetailInfo;", "getPstnDetailInfo", "()Lcom/ss/android/lark/calendar/api/entity/CalendarPstnDetailInfo;", "setPstnDetailInfo", "(Lcom/ss/android/lark/calendar/api/entity/CalendarPstnDetailInfo;)V", "rsvpBotCardAttendeeName", "getRsvpBotCardAttendeeName", "setRsvpBotCardAttendeeName", "rsvpBotCardReplyStatus", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventAttendee$Status;", "getRsvpBotCardReplyStatus", "()Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventAttendee$Status;", "setRsvpBotCardReplyStatus", "(Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventAttendee$Status;)V", "shareUserToken", "getShareUserToken", "setShareUserToken", "videoVisibility", "Lcom/ss/android/lark/calendar/impl/features/events/detail/idata/VideoMeetingVisibility;", "getVideoVisibility", "()Lcom/ss/android/lark/calendar/impl/features/events/detail/idata/VideoMeetingVisibility;", "setVideoVisibility", "(Lcom/ss/android/lark/calendar/impl/features/events/detail/idata/VideoMeetingVisibility;)V", "getCurrentMeetingRoomIds", "", "getEventServerId", "getEventStartTime", "getReportUrl", "getSummery", "hasEventAttendee", "isExceptionEvent", "isExchangeEvent", "isGoogleEvent", "isLimitedEvent", "isLocalEvent", "isMeetingMinuteCreatable", "isRepeatEvent", "isResourceEvent", "isShareCalendarEvent", "updateEventAndInstance", "", "isUpdateTimeByEvent", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.d$a */
    public interface IDetailModel extends IModelCalendar<IDetailViewData> {
        /* renamed from: A */
        boolean mo113392A();

        /* renamed from: B */
        boolean mo113393B();

        /* renamed from: C */
        String mo113394C();

        /* renamed from: D */
        String mo113395D();

        /* renamed from: E */
        List<String> mo113396E();

        /* renamed from: F */
        String mo113397F();

        /* renamed from: G */
        boolean mo113398G();

        /* renamed from: a */
        EventDetailSource mo113400a();

        /* renamed from: a */
        void mo113401a(CalendarPstnDetailInfo aVar);

        /* renamed from: a */
        void mo113402a(CalendarEventType calendarEventType);

        /* renamed from: a */
        void mo113403a(EventDetailSource eventDetailSource);

        /* renamed from: a */
        void mo113404a(VideoMeetingVisibility videoMeetingVisibility);

        /* renamed from: a */
        void mo113405a(Calendar calendar);

        /* renamed from: a */
        void mo113406a(CalendarEvent calendarEvent);

        /* renamed from: a */
        void mo113407a(CalendarEvent calendarEvent, boolean z);

        /* renamed from: a */
        void mo113408a(CalendarEventAttendee.Status status);

        /* renamed from: a */
        void mo113409a(CalendarEventInstance calendarEventInstance);

        /* renamed from: a */
        void mo113410a(Boolean bool);

        /* renamed from: a */
        void mo113411a(Long l);

        /* renamed from: a */
        void mo113412a(String str);

        /* renamed from: a */
        void mo113413a(boolean z);

        /* renamed from: b */
        CalendarEventType mo113414b();

        /* renamed from: b */
        void mo113415b(Long l);

        /* renamed from: b */
        void mo113416b(String str);

        /* renamed from: c */
        CalendarEvent mo113417c();

        /* renamed from: c */
        void mo113418c(Long l);

        /* renamed from: c */
        void mo113419c(String str);

        /* renamed from: d */
        CalendarPstnDetailInfo mo113420d();

        /* renamed from: d */
        void mo113421d(String str);

        /* renamed from: e */
        Long mo113422e();

        /* renamed from: e */
        void mo113423e(String str);

        /* renamed from: g */
        Long mo113424g();

        /* renamed from: h */
        Long mo113425h();

        /* renamed from: i */
        CalendarEventInstance mo113426i();

        /* renamed from: j */
        Calendar mo113427j();

        /* renamed from: k */
        VideoMeetingVisibility mo113428k();

        /* renamed from: l */
        CalendarEventAttendee.Status mo113429l();

        /* renamed from: m */
        String mo113430m();

        /* renamed from: n */
        String mo113431n();

        /* renamed from: o */
        String mo113432o();

        /* renamed from: p */
        Boolean mo113433p();

        /* renamed from: q */
        boolean mo113434q();

        /* renamed from: r */
        String mo113435r();

        /* renamed from: s */
        String mo113436s();

        /* renamed from: t */
        String mo113437t();

        /* renamed from: u */
        boolean mo113438u();

        /* renamed from: v */
        boolean mo113439v();

        /* renamed from: w */
        boolean mo113440w();

        /* renamed from: x */
        boolean mo113441x();

        /* renamed from: y */
        boolean mo113442y();

        /* renamed from: z */
        boolean mo113443z();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0005H&J\b\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\u0005H&J\b\u0010\n\u001a\u00020\u0005H&J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\rH&J\b\u0010\u000e\u001a\u00020\u0005H&J\b\u0010\u000f\u001a\u00020\u0005H&J\b\u0010\u0010\u001a\u00020\u0005H&J\u0010\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0013H&J\u0012\u0010\u0014\u001a\u00020\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H&J\u0010\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0002H&J\b\u0010\u0019\u001a\u00020\u0005H&J\b\u0010\u001a\u001a\u00020\u0005H&J\b\u0010\u001b\u001a\u00020\u0005H&J\b\u0010\u001c\u001a\u00020\u0005H&J\b\u0010\u001d\u001a\u00020\u0005H&J\u0010\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020 H&J\b\u0010!\u001a\u00020\u0005H&J\u0018\u0010\"\u001a\u00020\u00052\u000e\u0010#\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010$H&J\b\u0010&\u001a\u00020\u0005H&J\b\u0010'\u001a\u00020\u0005H&J\u0010\u0010(\u001a\u00020\u00052\u0006\u0010)\u001a\u00020%H&J\u0010\u0010*\u001a\u00020\u00052\u0006\u0010+\u001a\u00020%H&J\b\u0010,\u001a\u00020\u0005H&J\b\u0010-\u001a\u00020\u0005H&J\b\u0010.\u001a\u00020\u0005H&J\u0010\u0010/\u001a\u00020\u00052\u0006\u00100\u001a\u000201H&J\b\u00102\u001a\u00020\u0005H&J\b\u00103\u001a\u00020\u0005H&J\b\u00104\u001a\u00020\u0005H&J \u00105\u001a\u00020\u00052\u0006\u00106\u001a\u00020%2\u0006\u00107\u001a\u00020%2\u0006\u00108\u001a\u000209H&J\u0010\u0010:\u001a\u00020\u00052\u0006\u0010;\u001a\u00020%H&J\b\u0010<\u001a\u00020\u0005H&J\b\u0010=\u001a\u00020\u0005H&J\u0018\u0010>\u001a\u00020\u00052\u0006\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020@H&J\u0010\u0010B\u001a\u00020\u00052\u0006\u0010?\u001a\u00020@H&J\u0010\u0010C\u001a\u00020\u00052\u0006\u0010?\u001a\u00020@H&J\u0010\u0010D\u001a\u00020\u00052\u0006\u0010E\u001a\u000209H&J\b\u0010F\u001a\u00020\u0005H&J\u0010\u0010G\u001a\u00020\u00052\u0006\u0010H\u001a\u00020@H&J\b\u0010I\u001a\u00020\u0005H&J\b\u0010J\u001a\u00020\u0005H&J\u0012\u0010K\u001a\u00020\u00052\b\u0010L\u001a\u0004\u0018\u00010MH&J\u0012\u0010N\u001a\u00020\u00052\b\u0010L\u001a\u0004\u0018\u00010MH&¨\u0006O"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/detail/ICalendarDetailContact$IDetailView;", "Lcom/ss/android/lark/calendar/impl/framework/calendarmvp/IViewCalender;", "Lcom/ss/android/lark/calendar/impl/features/events/detail/ICalendarDetailContact$IDetailViewData;", "Lcom/ss/android/lark/calendar/impl/features/events/detail/ICalendarDetailContact$IDetailViewAction;", "backPressed", "", "finishActivity", "getActivity", "Landroid/app/Activity;", "hideLaunchDetailView", "refreshAttendeeNum", "refreshLiveStatusByVCPush", "associatedLiveStatus", "Lcom/ss/android/lark/calendar/impl/features/events/detail/videoUrl/entity/AssociatedLiveStatus;", "refreshMeetingZone", "refreshTimeText", "refreshTitleActions", "refreshVideoStatusByVCPush", "associatedVideoChatStatus", "Lcom/ss/android/lark/calendar/impl/features/events/detail/videoUrl/entity/AssociatedVideoChatStatus;", "setSavedInstanceState", "savedInstanceState", "Landroid/os/Bundle;", "setViewData", "viewData", "showAttendeeFragment", "showAttendeeListItem", "showCalendarItem", "showCreatorItem", "showDetailResourceFragment", "showEventShareDialog", "dependency", "Lcom/ss/android/lark/calendar/impl/features/events/detail/share/EventShareDialog$EventShareDependency;", "showEventShareImageDialog", "showEventView", "forbidItemName", "", "", "showExternalMinutesPermissionAlertDialog", "showFooter", "showGroupRestrictionDialog", "message", "showInvalidEventErrorView", "errText", "showLaunchDetailView", "showLaunchErrorView", "showMeetingVideo", "showMeetingVideoStatus", "isLiving", "", "showNotCreateMeetingGroupOrMinuteDialog", "showNotJoinableDialog", "showOrganizerItem", "showRSVPCommentDialog", "invitorId", "invitorName", "rsvpStatus", "Lcom/ss/android/lark/calendar/impl/features/events/detail/idata/RSVPStatus;", "showRSVPCommentErrDialog", ApiHandler.API_CALLBACK_ERRMSG, "showRSVPCommentSucDialog", "showRequestDismiss", "showRequestErrToast", "tipType", "", "errCode", "showRequestSucToast", "showRequestToast", "showRsvpSpanMenu", "replyStatus", "showTimeLineShareDialog", "showToast", "resIds", "showTransferChatterPickerFragment", "showTransferRepeatEventDialog", "updateEventShareImageDialog", "bitmap", "Landroid/graphics/Bitmap;", "updateTimeLineShareDialog", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.d$b */
    public interface IDetailView extends IViewCalender<IDetailViewData, IDetailViewAction> {
        /* renamed from: a */
        Activity mo113492a();

        /* renamed from: a */
        void mo113493a(int i);

        /* renamed from: a */
        void mo113494a(int i, int i2);

        /* renamed from: a */
        void mo113495a(Bitmap bitmap);

        /* renamed from: a */
        void mo113496a(Bundle bundle);

        /* renamed from: a */
        void mo113497a(IDetailViewData dVar);

        /* renamed from: a */
        void mo113498a(RSVPStatus rSVPStatus);

        /* renamed from: a */
        void mo113499a(EventShareDialog.EventShareDependency bVar);

        /* renamed from: a */
        void mo113500a(AssociatedLiveStatus associatedLiveStatus);

        /* renamed from: a */
        void mo113501a(AssociatedVideoChatStatus associatedVideoChatStatus);

        /* renamed from: a */
        void mo113502a(String str);

        /* renamed from: a */
        void mo113503a(String str, String str2, RSVPStatus rSVPStatus);

        /* renamed from: a */
        void mo113504a(List<String> list);

        /* renamed from: a */
        void mo113505a(boolean z);

        /* renamed from: b */
        void mo113506b();

        /* renamed from: b */
        void mo113507b(int i);

        /* renamed from: b */
        void mo113508b(Bitmap bitmap);

        /* renamed from: b */
        void mo113509b(String str);

        /* renamed from: c */
        void mo113510c();

        /* renamed from: c */
        void mo113511c(int i);

        /* renamed from: c */
        void mo113512c(String str);

        /* renamed from: d */
        void mo113513d();

        /* renamed from: e */
        void mo113514e();

        /* renamed from: f */
        void mo113515f();

        /* renamed from: g */
        void mo113516g();

        /* renamed from: h */
        void mo113517h();

        /* renamed from: i */
        void mo113518i();

        /* renamed from: j */
        void mo113519j();

        /* renamed from: k */
        void mo113520k();

        /* renamed from: l */
        void mo113521l();

        /* renamed from: m */
        void mo113522m();

        /* renamed from: n */
        void mo113523n();

        /* renamed from: o */
        void mo113524o();

        /* renamed from: p */
        void mo113525p();

        /* renamed from: q */
        void mo113526q();

        /* renamed from: r */
        void mo113527r();

        /* renamed from: s */
        void mo113528s();

        /* renamed from: t */
        void mo113529t();

        /* renamed from: u */
        void mo113530u();

        /* renamed from: v */
        void mo113531v();

        /* renamed from: w */
        void mo113532w();

        /* renamed from: x */
        void mo113533x();

        /* renamed from: y */
        void mo113534y();

        /* renamed from: z */
        void mo113535z();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0002\b\u0015\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&J*\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00052\b\u0010\r\u001a\u0004\u0018\u00010\u000eH&J\u0018\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H&J\b\u0010\u0014\u001a\u00020\u0003H&J\b\u0010\u0015\u001a\u00020\u0003H&J\b\u0010\u0016\u001a\u00020\u0003H&J\b\u0010\u0017\u001a\u00020\u0003H&J \u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001bH&J\b\u0010\u001d\u001a\u00020\u0003H&J\b\u0010\u001e\u001a\u00020\u0003H&J\u0010\u0010\u001f\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u0005H&J\u0010\u0010!\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020\u0005H&J\u0010\u0010#\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0011H&J\b\u0010$\u001a\u00020\u0003H&J\b\u0010%\u001a\u00020\u0003H&J \u0010&\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010'\u001a\u00020\u00052\u0006\u0010(\u001a\u00020\u0005H&J\b\u0010)\u001a\u00020\u0003H&J\u0010\u0010*\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0011H&J\b\u0010+\u001a\u00020\u0003H&J\b\u0010,\u001a\u00020\u0003H&J(\u0010-\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010.\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0005H&J\u0018\u0010/\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010.\u001a\u00020\u0005H&¨\u00060"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/detail/ICalendarDetailContact$IDetailViewAction;", "Lcom/ss/android/lark/calendar/impl/framework/calendarmvp/IViewCalender$IViewAction;", "onAttachmentClicked", "", "token", "", "onAttendeesItemClicked", "onClickPstnDetailPage", "context", "Landroid/content/Context;", "videoType", "Lcom/ss/android/lark/calendar/impl/features/events/detail/videoUrl/entity/VideoType;", "meetingUrl", "adminSettingsResponse", "Lcom/ss/android/lark/pb/videoconference/v1/GetAdminSettingsResponse;", "onConfirmRSVPClicked", "replyStatus", "Lcom/ss/android/lark/calendar/impl/features/events/detail/idata/RSVPStatus;", "span", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEvent$Span;", "onConfirmTransferEvent", "onDeleteEventClicked", "onEditEventClicked", "onJoinEventClicked", "onMapClicked", "location", "latitude", "", "longitude", "onMeetingGroupClicked", "onMeetingMinuteClicked", "onMeetingRoomInfoClicked", "resourceCalendarId", "onOpenProfilePageClicked", "attendeeCalendarId", "onRSVPClicked", "onReportEventClicked", "onSeeMoreResourceClicked", "onSendRSVPCommentClicked", Comment.f24093e, "inviterId", "onShareEventClicked", "onShowRSVPCommentDialogClicked", "onTransferEventClicked", "onTryAgainClicked", "onVideoMeetingIconClicked", "meetingId", "onVideoMeetingSettingIconClicked", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.d$c */
    public interface IDetailViewAction extends IViewCalender.IViewAction {
        /* renamed from: a */
        void mo113536a();

        /* renamed from: a */
        void mo113537a(Context context, VideoType videoType, String str, GetAdminSettingsResponse getAdminSettingsResponse);

        /* renamed from: a */
        void mo113538a(Context context, VideoType videoType, String str, String str2);

        /* renamed from: a */
        void mo113539a(Context context, String str);

        /* renamed from: a */
        void mo113540a(RSVPStatus rSVPStatus);

        /* renamed from: a */
        void mo113541a(RSVPStatus rSVPStatus, CalendarEvent.Span span);

        /* renamed from: a */
        void mo113542a(RSVPStatus rSVPStatus, String str, String str2);

        /* renamed from: a */
        void mo113543a(String str);

        /* renamed from: a */
        void mo113544a(String str, double d, double d2);

        /* renamed from: b */
        void mo113545b();

        /* renamed from: b */
        void mo113546b(RSVPStatus rSVPStatus);

        /* renamed from: b */
        void mo113547b(String str);

        /* renamed from: c */
        void mo113548c();

        /* renamed from: c */
        void mo113549c(String str);

        /* renamed from: d */
        void mo113550d();

        /* renamed from: e */
        void mo113551e();

        /* renamed from: f */
        void mo113552f();

        /* renamed from: g */
        void mo113553g();

        /* renamed from: h */
        void mo113554h();

        /* renamed from: i */
        void mo113555i();

        /* renamed from: j */
        void mo113556j();

        /* renamed from: k */
        void mo113557k();

        /* renamed from: l */
        void mo113558l();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\tH&J\b\u0010\n\u001a\u00020\u000bH&J\b\u0010\f\u001a\u00020\rH&¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/detail/ICalendarDetailContact$IDetailViewData;", "Lcom/ss/android/lark/calendar/impl/framework/calendarmvp/IViewCalender$IViewData;", "getAttendeeFragmentData", "Lcom/ss/android/lark/calendar/impl/features/events/detail/idata/IAttendeeFragmentData;", "getBodyData", "Lcom/ss/android/lark/calendar/impl/features/events/detail/idata/IBodyData;", "getDialogData", "Lcom/ss/android/lark/calendar/impl/features/events/detail/idata/IDialogData;", "getFooterData", "Lcom/ss/android/lark/calendar/impl/features/events/detail/idata/IFooterData;", "getHeaderData", "Lcom/ss/android/lark/calendar/impl/features/events/detail/idata/IHeaderData;", "getTitleViewData", "Lcom/ss/android/lark/calendar/impl/features/events/detail/idata/ITitleData;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.d$d */
    public interface IDetailViewData extends IViewCalender.IViewData {
        /* renamed from: a */
        ITitleData mo113559a();

        /* renamed from: b */
        IHeaderData mo113560b();

        /* renamed from: c */
        IBodyData mo113561c();

        /* renamed from: d */
        IFooterData mo113562d();

        /* renamed from: e */
        IDialogData mo113563e();

        /* renamed from: f */
        IAttendeeFragmentData mo113564f();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H&J\b\u0010\t\u001a\u00020\u0003H&J\b\u0010\n\u001a\u00020\u000bH&J\"\u0010\f\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H&J\"\u0010\r\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H&¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/detail/ICalendarDetailContact$ViewDependency;", "", "addFragment", "", "fragment", "Landroidx/fragment/app/Fragment;", "enterAnimation", "", "outAnimation", "finishActivity", "getActivity", "Landroid/app/Activity;", "hideFragment", "showFragment", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.d$e */
    public interface ViewDependency {
        /* renamed from: a */
        void mo113367a();

        /* renamed from: a */
        void mo113368a(Fragment fragment, int i, int i2);

        /* renamed from: b */
        Activity mo113369b();

        /* renamed from: b */
        void mo113370b(Fragment fragment, int i, int i2);

        /* renamed from: c */
        void mo113371c(Fragment fragment, int i, int i2);
    }
}
