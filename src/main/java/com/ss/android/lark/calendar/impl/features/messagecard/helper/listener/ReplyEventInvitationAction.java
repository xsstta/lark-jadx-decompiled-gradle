package com.ss.android.lark.calendar.impl.features.messagecard.helper.listener;

import android.app.Activity;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.ss.android.eventbus.EventBus;
import com.ss.android.lark.calendar.impl.features.calendarview.widget.RequestLoadingDialog;
import com.ss.android.lark.calendar.impl.features.messagecard.helper.CalendarCardHelper;
import com.ss.android.lark.calendar.impl.features.messagecard.widget.MessageCardReplyContainer;
import com.ss.android.lark.calendar.impl.framework.hitpoint.appreciable.AppreciableHitPoint;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event.GeneralHitPoint;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event2.CalendarEventHitPoint;
import com.ss.android.lark.calendar.impl.framework.hitpoint.performance.CalendarPerfMonitor;
import com.ss.android.lark.calendar.impl.framework.hitpoint.performance.CalendarPerfoMonitor;
import com.ss.android.lark.calendar.impl.framework.p1568a.C32493l;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttendee;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.OptimisticReplyCalendarEventInvitationResponse;
import com.ss.android.lark.calendar.impl.utils.C32673y;
import com.ss.android.lark.chat.utils.ChatParamUtils;
import com.ss.android.lark.log.Log;
import java.util.Date;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 /2\u00020\u0001:\u0001/B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\b\u0010\u0019\u001a\u00020\u001aH\u0002J(\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u001c2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\t2\u0006\u0010!\u001a\u00020\tH\u0002J\u001c\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\t2\b\u0010%\u001a\u0004\u0018\u00010\tH\u0002J\u0010\u0010&\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J \u0010'\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020\t2\u0006\u0010!\u001a\u00020\t2\u0006\u0010(\u001a\u00020)H\u0002J \u0010*\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\t2\u0006\u0010!\u001a\u00020\tH\u0002J\u0018\u0010+\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020\t2\u0006\u0010!\u001a\u00020\tH\u0002J\u0010\u0010,\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u0010\u0010-\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\b\u0010.\u001a\u00020\u001aH\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u00060"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/messagecard/helper/listener/ReplyEventInvitationAction;", "Lcom/ss/android/lark/calendar/impl/features/messagecard/widget/MessageCardReplyContainer$OnActionClickListener;", "activity", "Landroid/app/Activity;", "binderStatusListener", "Lcom/ss/android/lark/calendar/impl/features/messagecard/helper/listener/IBindStatusListener;", "contentDataListener", "Lcom/ss/android/lark/calendar/impl/features/messagecard/helper/listener/IContentDataListener;", "messageId", "", "(Landroid/app/Activity;Lcom/ss/android/lark/calendar/impl/features/messagecard/helper/listener/IBindStatusListener;Lcom/ss/android/lark/calendar/impl/features/messagecard/helper/listener/IContentDataListener;Ljava/lang/String;)V", "getActivity", "()Landroid/app/Activity;", "getBinderStatusListener", "()Lcom/ss/android/lark/calendar/impl/features/messagecard/helper/listener/IBindStatusListener;", "getContentDataListener", "()Lcom/ss/android/lark/calendar/impl/features/messagecard/helper/listener/IContentDataListener;", "setContentDataListener", "(Lcom/ss/android/lark/calendar/impl/features/messagecard/helper/listener/IContentDataListener;)V", "dialog", "Lcom/ss/android/lark/calendar/impl/features/calendarview/widget/RequestLoadingDialog;", "getMessageId", "()Ljava/lang/String;", "setMessageId", "(Ljava/lang/String;)V", "checkShowLoadingDialog", "", "getOptimisticUICallback", "Lcom/larksuite/framework/callback/UIGetDataCallback;", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/OptimisticReplyCalendarEventInvitationResponse;", UpdateKey.STATUS, "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventAttendee$Status;", "contextId", HiAnalyticsConstant.HaKey.BI_KEY_APINAME, "isDataInvalid", "", "calendarId", "eventKey", "logActionClick", "logError", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "logReplyInvitation", "logSuccess", "onActionClick", "replyInvitation", "triggerReloadEvent", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.messagecard.a.a.c */
public final class ReplyEventInvitationAction implements MessageCardReplyContainer.OnActionClickListener {

    /* renamed from: b */
    public static final Companion f82270b = new Companion(null);

    /* renamed from: a */
    public RequestLoadingDialog f82271a;

    /* renamed from: c */
    private final Activity f82272c;

    /* renamed from: d */
    private final IBindStatusListener f82273d;

    /* renamed from: e */
    private IContentDataListener f82274e;

    /* renamed from: f */
    private String f82275f;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/messagecard/helper/listener/ReplyEventInvitationAction$Companion;", "", "()V", "TAG", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.messagecard.a.a.c$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: b */
    public final IBindStatusListener mo117518b() {
        return this.f82273d;
    }

    /* renamed from: c */
    private final void m122644c() {
        if (this.f82271a == null) {
            this.f82271a = new RequestLoadingDialog(this.f82272c);
        }
        RequestLoadingDialog requestLoadingDialog = this.f82271a;
        if (requestLoadingDialog != null) {
            requestLoadingDialog.mo112584a();
        }
    }

    /* renamed from: a */
    public final void mo117514a() {
        EventBus.getDefault().trigger(new C32493l());
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/calendar/impl/features/messagecard/helper/listener/ReplyEventInvitationAction$getOptimisticUICallback$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/OptimisticReplyCalendarEventInvitationResponse;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "calendarEvent", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.messagecard.a.a.c$b */
    public static final class C32179b implements IGetDataCallback<OptimisticReplyCalendarEventInvitationResponse> {

        /* renamed from: a */
        final /* synthetic */ ReplyEventInvitationAction f82276a;

        /* renamed from: b */
        final /* synthetic */ CalendarEventAttendee.Status f82277b;

        /* renamed from: c */
        final /* synthetic */ String f82278c;

        /* renamed from: d */
        final /* synthetic */ String f82279d;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            RequestLoadingDialog requestLoadingDialog = this.f82276a.f82271a;
            if (requestLoadingDialog != null) {
                requestLoadingDialog.mo112588a(false, errorResult.getErrorCode());
            }
            this.f82276a.mo117517a(this.f82278c, this.f82279d, errorResult);
        }

        /* renamed from: a */
        public void onSuccess(OptimisticReplyCalendarEventInvitationResponse sVar) {
            this.f82276a.mo117518b().refreshActionStatus(this.f82277b);
            this.f82276a.mo117514a();
            RequestLoadingDialog requestLoadingDialog = this.f82276a.f82271a;
            if (requestLoadingDialog != null) {
                requestLoadingDialog.mo112587a(true);
            }
            this.f82276a.mo117516a(this.f82278c, this.f82279d);
        }

        C32179b(ReplyEventInvitationAction cVar, CalendarEventAttendee.Status status, String str, String str2) {
            this.f82276a = cVar;
            this.f82277b = status;
            this.f82278c = str;
            this.f82279d = str2;
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.messagecard.widget.MessageCardReplyContainer.OnActionClickListener
    /* renamed from: a */
    public void mo117515a(CalendarEventAttendee.Status status) {
        Intrinsics.checkParameterIsNotNull(status, UpdateKey.STATUS);
        m122645c(status);
        m122641b(status);
    }

    /* renamed from: b */
    private final void m122641b(CalendarEventAttendee.Status status) {
        if (m122643b(this.f82274e.mo117510b(), this.f82274e.mo117511c())) {
            Log.m165389i("ReplyEventInvitationAction", "ReplyEventInvitationAction data is inValid");
            return;
        }
        String valueOf = String.valueOf(new Date().getTime());
        m122642b(status, valueOf, "replyCalendarEventInvitation");
        m122644c();
        CalendarCardHelper.f82294a.mo117526b().mo118866a(this.f82274e.mo117510b(), this.f82274e.mo117511c(), this.f82274e.mo117512d(), this.f82275f, status, m122640a(status, valueOf, "replyCalendarEventInvitation"));
    }

    /* renamed from: c */
    private final void m122645c(CalendarEventAttendee.Status status) {
        Object obj;
        AppreciableHitPoint.f83321a.mo118697m();
        GeneralHitPoint.m124190a(status, this.f82274e.mo117509a());
        Map<String, Object> b = ChatParamUtils.m133148b();
        if (b != null) {
            obj = b.get("chat_id");
        } else {
            obj = null;
        }
        String str = (String) obj;
        String a = this.f82274e.mo117509a();
        String valueOf = String.valueOf(this.f82274e.mo117513e());
        if (!(a == null || str == null)) {
            int i = C32180d.f82280a[status.ordinal()];
            if (i == 1) {
                CalendarEventHitPoint.m124342a(a, valueOf, str, "accept");
            } else if (i == 2) {
                CalendarEventHitPoint.m124342a(a, valueOf, str, "reject");
            } else if (i == 3) {
                CalendarEventHitPoint.m124342a(a, valueOf, str, "not_determined");
            }
        }
        Log.m165389i("ReplyEventInvitationAction", C32673y.m125369a("card action " + status.name()));
    }

    /* renamed from: b */
    private final boolean m122643b(String str, String str2) {
        boolean z;
        boolean z2;
        String str3 = str;
        if (str3 == null || str3.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            String str4 = str2;
            if (str4 == null || str4.length() == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                return true;
            }
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo117516a(String str, String str2) {
        Log.m165389i("ReplyEventInvitationAction", C32673y.m125373a(str, str2, new String[0]));
        CalendarPerfMonitor.m124413a("key_rsvp_event");
        AppreciableHitPoint.f83321a.mo118698n();
        CalendarPerfoMonitor.m124404a(CalendarPerfoMonitor.EventType.PERF_CAL_REPLY);
    }

    /* renamed from: a */
    private final UIGetDataCallback<OptimisticReplyCalendarEventInvitationResponse> m122640a(CalendarEventAttendee.Status status, String str, String str2) {
        return new UIGetDataCallback<>(new C32179b(this, status, str, str2));
    }

    /* renamed from: b */
    private final void m122642b(CalendarEventAttendee.Status status, String str, String str2) {
        CalendarPerfoMonitor.m124406a(CalendarPerfoMonitor.EventType.PERF_CAL_REPLY, CalendarEvent.Span.NONE_SPAN);
        Log.m165389i("ReplyEventInvitationAction", C32673y.m125376b(str, str2, "calendar_id", this.f82274e.mo117510b(), "key", this.f82274e.mo117511c(), "original_time", String.valueOf(this.f82274e.mo117512d()) + "", "reply_status", status.toString() + ""));
        CalendarPerfMonitor.m124415a("key_rsvp_event", "cal_perf_common", "scene_type", "rsvp_event", "extra_name", "bot_card");
    }

    /* renamed from: a */
    public final void mo117517a(String str, String str2, ErrorResult errorResult) {
        Log.m165383e("ReplyEventInvitationAction", C32673y.m125370a(str, str2, errorResult));
        CalendarPerfMonitor.m124417b("key_rsvp_event");
        CalendarPerfoMonitor.m124404a(CalendarPerfoMonitor.EventType.PERF_CAL_REPLY);
        AppreciableHitPoint.f83321a.mo118678a(errorResult);
    }

    public ReplyEventInvitationAction(Activity activity, IBindStatusListener aVar, IContentDataListener bVar, String str) {
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        Intrinsics.checkParameterIsNotNull(aVar, "binderStatusListener");
        Intrinsics.checkParameterIsNotNull(bVar, "contentDataListener");
        this.f82272c = activity;
        this.f82273d = aVar;
        this.f82274e = bVar;
        this.f82275f = str;
    }
}
