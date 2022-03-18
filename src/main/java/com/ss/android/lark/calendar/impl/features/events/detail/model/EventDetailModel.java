package com.ss.android.lark.calendar.impl.features.events.detail.model;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.lark.pb.calendar.v1.CalendarEventDisplayInfo;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.api.entity.CalendarPstnDetailInfo;
import com.ss.android.lark.calendar.impl.features.events.detail.CalendarEventType;
import com.ss.android.lark.calendar.impl.features.events.detail.EventDetailSource;
import com.ss.android.lark.calendar.impl.features.events.detail.ICalendarDetailContact;
import com.ss.android.lark.calendar.impl.features.events.detail.idata.VideoMeetingVisibility;
import com.ss.android.lark.calendar.impl.features.events.detail.viewdata.LimitedEventViewData;
import com.ss.android.lark.calendar.impl.features.events.detail.viewdata.LocalEventViewData;
import com.ss.android.lark.calendar.impl.features.events.detail.viewdata.NormalEventViewData;
import com.ss.android.lark.calendar.impl.features.events.detail.viewdata.NotJoinEventViewData;
import com.ss.android.lark.calendar.impl.features.events.detail.viewdata.ThirdPartyEventViewData;
import com.ss.android.lark.calendar.impl.features.meetingroom.base.extension.C32060a;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.Calendar;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttendee;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventInstance;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.calendar.impl.utils.C32661n;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30054s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000 t2\u00020\u0001:\u0001tB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010]\u001a\u00020^H\u0016J\b\u0010_\u001a\u00020^H\u0016J\u000e\u0010`\u001a\b\u0012\u0004\u0012\u00020#0aH\u0016J\b\u0010b\u001a\u00020#H\u0016J\b\u0010c\u001a\u00020#H\u0016J\b\u0010d\u001a\u00020#H\u0016J\b\u0010e\u001a\u00020#H\u0016J\b\u0010f\u001a\u00020gH\u0016J\b\u0010h\u001a\u000205H\u0016J\b\u0010i\u001a\u000205H\u0016J\b\u0010j\u001a\u000205H\u0016J\b\u0010k\u001a\u000205H\u0016J\b\u0010l\u001a\u000205H\u0016J\b\u0010m\u001a\u000205H\u0016J\b\u0010n\u001a\u000205H\u0016J\b\u0010o\u001a\u000205H\u0016J\b\u0010p\u001a\u000205H\u0016J\b\u0010q\u001a\u000205H\u0016J\u0018\u0010r\u001a\u00020^2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010s\u001a\u000205H\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u0010\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u000eR\u001e\u0010\u0013\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u0014\u0010\f\"\u0004\b\u0015\u0010\u000eR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001c\u0010\"\u001a\u0004\u0018\u00010#X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u001a\u0010(\u001a\u00020)X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001a\u0010.\u001a\u00020/X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u001a\u00104\u001a\u000205X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u001e\u0010:\u001a\u0004\u0018\u000105X\u000e¢\u0006\u0010\n\u0002\u0010>\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u001c\u0010?\u001a\u0004\u0018\u00010#X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010%\"\u0004\bA\u0010'R\u001c\u0010B\u001a\u0004\u0018\u00010#X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010%\"\u0004\bD\u0010'R\u001c\u0010E\u001a\u0004\u0018\u00010FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\u001a\u0010K\u001a\u00020#X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bL\u0010%\"\u0004\bM\u0010'R\u001c\u0010N\u001a\u0004\u0018\u00010OX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR\u001c\u0010T\u001a\u0004\u0018\u00010#X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bU\u0010%\"\u0004\bV\u0010'R\u001a\u0010W\u001a\u00020XX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\¨\u0006u"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/detail/model/EventDetailModel;", "Lcom/ss/android/lark/calendar/impl/features/events/detail/ICalendarDetailContact$IDetailModel;", "()V", "calendar", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/Calendar;", "getCalendar", "()Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/Calendar;", "setCalendar", "(Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/Calendar;)V", "dueTime", "", "getDueTime", "()Ljava/lang/Long;", "setDueTime", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "dueTimeClientRequestStartTime", "getDueTimeClientRequestStartTime", "setDueTimeClientRequestStartTime", "dueTimeServerRequestTime", "getDueTimeServerRequestTime", "setDueTimeServerRequestTime", "event", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEvent;", "getEvent", "()Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEvent;", "setEvent", "(Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEvent;)V", "eventInstance", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventInstance;", "getEventInstance", "()Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventInstance;", "setEventInstance", "(Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventInstance;)V", "eventShareCopy", "", "getEventShareCopy", "()Ljava/lang/String;", "setEventShareCopy", "(Ljava/lang/String;)V", "eventType", "Lcom/ss/android/lark/calendar/impl/features/events/detail/CalendarEventType;", "getEventType", "()Lcom/ss/android/lark/calendar/impl/features/events/detail/CalendarEventType;", "setEventType", "(Lcom/ss/android/lark/calendar/impl/features/events/detail/CalendarEventType;)V", "fromSource", "Lcom/ss/android/lark/calendar/impl/features/events/detail/EventDetailSource;", "getFromSource", "()Lcom/ss/android/lark/calendar/impl/features/events/detail/EventDetailSource;", "setFromSource", "(Lcom/ss/android/lark/calendar/impl/features/events/detail/EventDetailSource;)V", "hasOriginalRepeatEvent", "", "getHasOriginalRepeatEvent", "()Z", "setHasOriginalRepeatEvent", "(Z)V", "isJoinable", "()Ljava/lang/Boolean;", "setJoinable", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "linkAddress", "getLinkAddress", "setLinkAddress", "messageId", "getMessageId", "setMessageId", "pstnDetailInfo", "Lcom/ss/android/lark/calendar/api/entity/CalendarPstnDetailInfo;", "getPstnDetailInfo", "()Lcom/ss/android/lark/calendar/api/entity/CalendarPstnDetailInfo;", "setPstnDetailInfo", "(Lcom/ss/android/lark/calendar/api/entity/CalendarPstnDetailInfo;)V", "rsvpBotCardAttendeeName", "getRsvpBotCardAttendeeName", "setRsvpBotCardAttendeeName", "rsvpBotCardReplyStatus", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventAttendee$Status;", "getRsvpBotCardReplyStatus", "()Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventAttendee$Status;", "setRsvpBotCardReplyStatus", "(Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventAttendee$Status;)V", "shareUserToken", "getShareUserToken", "setShareUserToken", "videoVisibility", "Lcom/ss/android/lark/calendar/impl/features/events/detail/idata/VideoMeetingVisibility;", "getVideoVisibility", "()Lcom/ss/android/lark/calendar/impl/features/events/detail/idata/VideoMeetingVisibility;", "setVideoVisibility", "(Lcom/ss/android/lark/calendar/impl/features/events/detail/idata/VideoMeetingVisibility;)V", "create", "", "destroy", "getCurrentMeetingRoomIds", "", "getEventServerId", "getEventStartTime", "getReportUrl", "getSummery", "getViewData", "Lcom/ss/android/lark/calendar/impl/features/events/detail/ICalendarDetailContact$IDetailViewData;", "hasEventAttendee", "isExceptionEvent", "isExchangeEvent", "isGoogleEvent", "isLimitedEvent", "isLocalEvent", "isMeetingMinuteCreatable", "isRepeatEvent", "isResourceEvent", "isShareCalendarEvent", "updateEventAndInstance", "isUpdateInstanceTime", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.b.a */
public final class EventDetailModel implements ICalendarDetailContact.IDetailModel {

    /* renamed from: a */
    public static final Companion f79076a = new Companion(null);

    /* renamed from: t */
    private static final String f79077t;

    /* renamed from: u */
    private static final String f79078u;

    /* renamed from: b */
    private EventDetailSource f79079b = EventDetailSource.FROM_CALENDAR_VIEW;

    /* renamed from: c */
    private CalendarEventType f79080c = CalendarEventType.NORMAL_EVENT;

    /* renamed from: d */
    private CalendarEvent f79081d;

    /* renamed from: e */
    private CalendarPstnDetailInfo f79082e;

    /* renamed from: f */
    private Long f79083f;

    /* renamed from: g */
    private Long f79084g;

    /* renamed from: h */
    private Long f79085h;

    /* renamed from: i */
    private Calendar f79086i;

    /* renamed from: j */
    private CalendarEventInstance f79087j;

    /* renamed from: k */
    private boolean f79088k = true;

    /* renamed from: l */
    private VideoMeetingVisibility f79089l = VideoMeetingVisibility.INVISIBLE;

    /* renamed from: m */
    private String f79090m;

    /* renamed from: n */
    private String f79091n;

    /* renamed from: o */
    private Boolean f79092o;

    /* renamed from: p */
    private CalendarEventAttendee.Status f79093p = CalendarEventAttendee.Status.NEEDS_ACTION;

    /* renamed from: q */
    private String f79094q = "";

    /* renamed from: r */
    private String f79095r = "";

    /* renamed from: s */
    private String f79096s = "";

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/detail/model/EventDetailModel$Companion;", "", "()V", "REPORT_HOST", "", "REPORT_URL", "REPORT_URL_PARAM_CALENDAR_ID", "REPORT_URL_PARAM_ORIGINAL_TIME", "REPORT_URL_PARAM_UID", "TAG", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.b.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.detail.ICalendarDetailContact.IDetailModel
    /* renamed from: a */
    public EventDetailSource mo113400a() {
        return this.f79079b;
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.detail.ICalendarDetailContact.IDetailModel
    /* renamed from: b */
    public CalendarEventType mo113414b() {
        return this.f79080c;
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.detail.ICalendarDetailContact.IDetailModel
    /* renamed from: c */
    public CalendarEvent mo113417c() {
        return this.f79081d;
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.detail.ICalendarDetailContact.IDetailModel
    /* renamed from: d */
    public CalendarPstnDetailInfo mo113420d() {
        return this.f79082e;
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.detail.ICalendarDetailContact.IDetailModel
    /* renamed from: e */
    public Long mo113422e() {
        return this.f79084g;
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.detail.ICalendarDetailContact.IDetailModel
    /* renamed from: g */
    public Long mo113424g() {
        return this.f79083f;
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.detail.ICalendarDetailContact.IDetailModel
    /* renamed from: h */
    public Long mo113425h() {
        return this.f79085h;
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.detail.ICalendarDetailContact.IDetailModel
    /* renamed from: i */
    public CalendarEventInstance mo113426i() {
        return this.f79087j;
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.detail.ICalendarDetailContact.IDetailModel
    /* renamed from: j */
    public Calendar mo113427j() {
        return this.f79086i;
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.detail.ICalendarDetailContact.IDetailModel
    /* renamed from: k */
    public VideoMeetingVisibility mo113428k() {
        return this.f79089l;
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.detail.ICalendarDetailContact.IDetailModel
    /* renamed from: l */
    public CalendarEventAttendee.Status mo113429l() {
        return this.f79093p;
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.detail.ICalendarDetailContact.IDetailModel
    /* renamed from: m */
    public String mo113430m() {
        return this.f79094q;
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.detail.ICalendarDetailContact.IDetailModel
    /* renamed from: n */
    public String mo113431n() {
        return this.f79090m;
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.detail.ICalendarDetailContact.IDetailModel
    /* renamed from: o */
    public String mo113432o() {
        return this.f79091n;
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.detail.ICalendarDetailContact.IDetailModel
    /* renamed from: p */
    public Boolean mo113433p() {
        return this.f79092o;
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.detail.ICalendarDetailContact.IDetailModel
    /* renamed from: q */
    public boolean mo113434q() {
        return this.f79088k;
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.detail.ICalendarDetailContact.IDetailModel
    /* renamed from: r */
    public String mo113435r() {
        return this.f79095r;
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.detail.ICalendarDetailContact.IDetailModel
    /* renamed from: s */
    public String mo113436s() {
        return this.f79096s;
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.detail.ICalendarDetailContact.IDetailModel
    /* renamed from: a */
    public void mo113411a(Long l) {
        this.f79084g = l;
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.detail.ICalendarDetailContact.IDetailModel
    /* renamed from: a */
    public void mo113413a(boolean z) {
        this.f79088k = z;
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.detail.ICalendarDetailContact.IDetailModel
    /* renamed from: a */
    public void mo113412a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f79094q = str;
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.detail.ICalendarDetailContact.IDetailModel
    /* renamed from: D */
    public String mo113395D() {
        String serverId;
        CalendarEvent c = mo113417c();
        if (c == null || (serverId = c.getServerId()) == null) {
            return "";
        }
        return serverId;
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.detail.ICalendarDetailContact.IDetailModel
    /* renamed from: B */
    public boolean mo113393B() {
        CalendarEvent.DisplayType displayType;
        CalendarEvent c = mo113417c();
        if (c != null) {
            displayType = c.getDisplayType();
        } else {
            displayType = null;
        }
        if (displayType == CalendarEvent.DisplayType.LIMITED) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.detail.ICalendarDetailContact.IDetailModel
    /* renamed from: F */
    public String mo113397F() {
        String valueOf;
        CalendarEvent c = mo113417c();
        if (c == null || (valueOf = String.valueOf(c.getStartTime())) == null) {
            return "";
        }
        return valueOf;
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.detail.ICalendarDetailContact.IDetailModel
    /* renamed from: G */
    public boolean mo113398G() {
        CalendarEventDisplayInfo.ButtonDisplayType buttonDisplayType;
        com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventDisplayInfo calendarEventDisplayInfo;
        CalendarEvent c = mo113417c();
        if (c == null || (calendarEventDisplayInfo = c.getCalendarEventDisplayInfo()) == null) {
            buttonDisplayType = null;
        } else {
            buttonDisplayType = calendarEventDisplayInfo.getMeetingMinutesBtnDisplayType();
        }
        if (buttonDisplayType == CalendarEventDisplayInfo.ButtonDisplayType.SHOWN) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.detail.ICalendarDetailContact.IDetailModel
    /* renamed from: u */
    public boolean mo113438u() {
        CalendarEvent.Source source;
        CalendarEvent c = mo113417c();
        if (c != null) {
            source = c.getSource();
        } else {
            source = null;
        }
        if (source == CalendarEvent.Source.GOOGLE) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.detail.ICalendarDetailContact.IDetailModel
    /* renamed from: v */
    public boolean mo113439v() {
        CalendarEvent.Source source;
        CalendarEvent c = mo113417c();
        if (c != null) {
            source = c.getSource();
        } else {
            source = null;
        }
        if (source == CalendarEvent.Source.EXCHANGE) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.detail.ICalendarDetailContact.IDetailModel
    /* renamed from: w */
    public boolean mo113440w() {
        CalendarEvent.Source source;
        CalendarEvent c = mo113417c();
        if (c != null) {
            source = c.getSource();
        } else {
            source = null;
        }
        if (source == CalendarEvent.Source.ANDROID) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.detail.ICalendarDetailContact.IDetailModel
    /* renamed from: x */
    public boolean mo113441x() {
        String str;
        CalendarEvent c = mo113417c();
        if (c != null) {
            str = c.getRRule();
        } else {
            str = null;
        }
        return !TextUtils.isEmpty(str);
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.detail.ICalendarDetailContact.IDetailModel
    /* renamed from: y */
    public boolean mo113442y() {
        CalendarEvent c = mo113417c();
        if (c == null || c.getOriginalTime() != 0) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.detail.ICalendarDetailContact.IDetailModel
    /* renamed from: z */
    public boolean mo113443z() {
        Calendar.Type type;
        Calendar j = mo113427j();
        if (j != null) {
            type = j.getType();
        } else {
            type = null;
        }
        if (type == Calendar.Type.OTHER) {
            return true;
        }
        return false;
    }

    static {
        String a = C30022a.f74882a.dynamicConfigModuleDependency().mo108232a();
        f79077t = a;
        f79078u = "https://" + a + "/report/?type=calendar&params=";
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.detail.ICalendarDetailContact.IDetailModel
    /* renamed from: A */
    public boolean mo113392A() {
        CalendarEvent.DisplayType displayType;
        Calendar.Type type;
        CalendarEvent c = mo113417c();
        Calendar.Type type2 = null;
        if (c != null) {
            displayType = c.getDisplayType();
        } else {
            displayType = null;
        }
        if (displayType == CalendarEvent.DisplayType.LIMITED) {
            Calendar j = mo113427j();
            if (j != null) {
                type = j.getType();
            } else {
                type = null;
            }
            if (type != Calendar.Type.RESOURCES) {
                Calendar j2 = mo113427j();
                if (j2 != null) {
                    type2 = j2.getType();
                }
                if (type2 == Calendar.Type.GOOGLE_RESOURCE) {
                    return true;
                }
            }
            return true;
        }
        return false;
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.detail.ICalendarDetailContact.IDetailModel
    /* renamed from: C */
    public String mo113394C() {
        String str;
        Object obj;
        String calendarId;
        JSONObject jSONObject = new JSONObject();
        try {
            CalendarEvent c = mo113417c();
            String str2 = "";
            if (c == null || (str = c.getKey()) == null) {
                str = str2;
            }
            jSONObject.put("uid", str);
            CalendarEvent c2 = mo113417c();
            if (c2 != null) {
                obj = Long.valueOf(c2.getOriginalTime());
            } else {
                obj = str2;
            }
            jSONObject.put("original_time", obj);
            CalendarEvent c3 = mo113417c();
            if (!(c3 == null || (calendarId = c3.getCalendarId()) == null)) {
                str2 = calendarId;
            }
            jSONObject.put("calendar_id", str2);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return f79078u + Uri.encode(jSONObject.toString());
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.detail.ICalendarDetailContact.IDetailModel
    /* renamed from: E */
    public List<String> mo113396E() {
        List<CalendarEventAttendee> attendees;
        CalendarEvent c = mo113417c();
        if (!(c == null || (attendees = c.getAttendees()) == null)) {
            AbstractC30054s loginDependency = C30022a.f74882a.loginDependency();
            Intrinsics.checkExpressionValueIsNotNull(loginDependency, "CalendarDependencyHolder…endency.loginDependency()");
            String a = loginDependency.mo108269a();
            Intrinsics.checkExpressionValueIsNotNull(a, "CalendarDependencyHolder….loginDependency().userId");
            List<CalendarEventAttendee> a2 = C32060a.m121940a(attendees, a);
            if (a2 != null) {
                List<CalendarEventAttendee> list = a2;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    String attendeeCalendarId = it.next().getAttendeeCalendarId();
                    if (attendeeCalendarId == null) {
                        attendeeCalendarId = "";
                    }
                    arrayList.add(attendeeCalendarId);
                }
                return arrayList;
            }
        }
        return CollectionsKt.emptyList();
    }

    /* renamed from: H */
    public ICalendarDetailContact.IDetailViewData mo109793f() {
        int i = C31239b.f79097a[mo113414b().ordinal()];
        if (i == 1) {
            return new ThirdPartyEventViewData(this);
        }
        if (i == 2) {
            return new LocalEventViewData(this);
        }
        if (i == 3) {
            return new NotJoinEventViewData(this);
        }
        if (i == 4) {
            return new NormalEventViewData(this);
        }
        if (i == 5) {
            return new LimitedEventViewData(this);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.detail.ICalendarDetailContact.IDetailModel
    /* renamed from: t */
    public String mo113437t() {
        String str;
        CalendarEvent.Category category;
        CalendarEvent.Category category2;
        CalendarEvent c = mo113417c();
        if (c == null || (str = c.getSummary()) == null) {
            str = "";
        }
        CalendarEvent c2 = mo113417c();
        CalendarEvent.DisplayType displayType = null;
        if (c2 != null) {
            category = c2.getCategory();
        } else {
            category = null;
        }
        if (category == CalendarEvent.Category.RESOURCE_REQUISITION) {
            String b = C32634ae.m125182b(R.string.Calendar_Edit_MeetingRoomInactiveCantReserve);
            Intrinsics.checkExpressionValueIsNotNull(b, "ResUtil.getString(R.stri…gRoomInactiveCantReserve)");
            return b;
        }
        CalendarEvent c3 = mo113417c();
        if (c3 != null) {
            category2 = c3.getCategory();
        } else {
            category2 = null;
        }
        if (category2 == CalendarEvent.Category.RESOURCE_STRATEGY) {
            String b2 = C32634ae.m125182b(R.string.Calendar_MeetingView_MeetingRoomCantReservePeriod);
            Intrinsics.checkExpressionValueIsNotNull(b2, "ResUtil.getString(R.stri…ingRoomCantReservePeriod)");
            return b2;
        } else if (mo113400a() == EventDetailSource.FROM_ROOM_VIEW_NOT_ACCESSIBLE) {
            return str;
        } else {
            CalendarEvent c4 = mo113417c();
            if (c4 != null) {
                displayType = c4.getDisplayType();
            }
            if (displayType == CalendarEvent.DisplayType.LIMITED) {
                String b3 = C32634ae.m125182b(R.string.Calendar_Detail_Busy);
                Intrinsics.checkExpressionValueIsNotNull(b3, "ResUtil.getString(R.string.Calendar_Detail_Busy)");
                return b3;
            } else if (!TextUtils.isEmpty(str)) {
                return str;
            } else {
                String b4 = C32634ae.m125182b(R.string.Calendar_Common_NoTitle);
                Intrinsics.checkExpressionValueIsNotNull(b4, "ResUtil.getString(R.stri….Calendar_Common_NoTitle)");
                return b4;
            }
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.detail.ICalendarDetailContact.IDetailModel
    /* renamed from: a */
    public void mo113401a(CalendarPstnDetailInfo aVar) {
        this.f79082e = aVar;
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.detail.ICalendarDetailContact.IDetailModel
    /* renamed from: b */
    public void mo113415b(Long l) {
        this.f79083f = l;
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.detail.ICalendarDetailContact.IDetailModel
    /* renamed from: c */
    public void mo113418c(Long l) {
        this.f79085h = l;
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.detail.ICalendarDetailContact.IDetailModel
    /* renamed from: d */
    public void mo113421d(String str) {
        this.f79095r = str;
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.detail.ICalendarDetailContact.IDetailModel
    /* renamed from: e */
    public void mo113423e(String str) {
        this.f79096s = str;
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.detail.ICalendarDetailContact.IDetailModel
    /* renamed from: a */
    public void mo113402a(CalendarEventType calendarEventType) {
        Intrinsics.checkParameterIsNotNull(calendarEventType, "<set-?>");
        this.f79080c = calendarEventType;
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.detail.ICalendarDetailContact.IDetailModel
    /* renamed from: b */
    public void mo113416b(String str) {
        this.f79090m = str;
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.detail.ICalendarDetailContact.IDetailModel
    /* renamed from: c */
    public void mo113419c(String str) {
        this.f79091n = str;
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.detail.ICalendarDetailContact.IDetailModel
    /* renamed from: a */
    public void mo113403a(EventDetailSource eventDetailSource) {
        Intrinsics.checkParameterIsNotNull(eventDetailSource, "<set-?>");
        this.f79079b = eventDetailSource;
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.detail.ICalendarDetailContact.IDetailModel
    /* renamed from: a */
    public void mo113404a(VideoMeetingVisibility videoMeetingVisibility) {
        Intrinsics.checkParameterIsNotNull(videoMeetingVisibility, "<set-?>");
        this.f79089l = videoMeetingVisibility;
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.detail.ICalendarDetailContact.IDetailModel
    /* renamed from: a */
    public void mo113405a(Calendar calendar) {
        this.f79086i = calendar;
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.detail.ICalendarDetailContact.IDetailModel
    /* renamed from: a */
    public void mo113406a(CalendarEvent calendarEvent) {
        this.f79081d = calendarEvent;
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.detail.ICalendarDetailContact.IDetailModel
    /* renamed from: a */
    public void mo113408a(CalendarEventAttendee.Status status) {
        this.f79093p = status;
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.detail.ICalendarDetailContact.IDetailModel
    /* renamed from: a */
    public void mo113409a(CalendarEventInstance calendarEventInstance) {
        this.f79087j = calendarEventInstance;
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.detail.ICalendarDetailContact.IDetailModel
    /* renamed from: a */
    public void mo113410a(Boolean bool) {
        this.f79092o = bool;
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.detail.ICalendarDetailContact.IDetailModel
    /* renamed from: a */
    public void mo113407a(CalendarEvent calendarEvent, boolean z) {
        Intrinsics.checkParameterIsNotNull(calendarEvent, "event");
        if (mo113426i() == null) {
            mo113409a(new CalendarEventInstance());
            Unit unit = Unit.INSTANCE;
        }
        C32661n.m125344a(mo113426i(), calendarEvent, z);
        mo113406a(calendarEvent);
    }
}
