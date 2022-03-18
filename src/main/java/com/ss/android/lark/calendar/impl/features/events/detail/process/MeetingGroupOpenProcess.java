package com.ss.android.lark.calendar.impl.features.events.detail.process;

import android.app.Activity;
import android.content.DialogInterface;
import android.text.TextUtils;
import com.huawei.hms.support.api.entity.core.JosStatusCodes;
import com.larksuite.component.universe_design.dialog.UDDialogBuilder;
import com.larksuite.framework.callback.CallbackManager;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.calendarview.widget.RequestLoadingDialog;
import com.ss.android.lark.calendar.impl.features.events.detail.utils.AttendeeUtil;
import com.ss.android.lark.calendar.impl.framework.hitpoint.appreciable.AppreciableHitPoint;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event.CalendarHitPoint;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event.GeneralHitPoint;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event2.CalendarEventHitPoint;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarMeetingEvent;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.Meeting;
import com.ss.android.lark.calendar.impl.rustadapter.p1575c.C32533b;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.calendar.impl.utils.C32673y;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.calendar.p1430a.p1431a.p1432a.AbstractC30025c;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.widget.billing.BillingTipsDialog;
import java.util.Date;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0017\u0018\u0000 ,2\u00020\u0001:\u0002,-B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u000e\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\u0005J\u000e\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u0017J\b\u0010\u001b\u001a\u00020\u0013H\u0002J\u0010\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\rH\u0002J\u0006\u0010\u001e\u001a\u00020\u0013J\b\u0010\u001f\u001a\u00020\u0013H\u0002J\u0010\u0010 \u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u0017H\u0002J\b\u0010!\u001a\u00020\u0013H\u0002J\u000e\u0010\"\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u0011J\u0006\u0010#\u001a\u00020\u0013J\u0018\u0010$\u001a\u00020\u00132\u0006\u0010%\u001a\u00020\r2\u0006\u0010&\u001a\u00020\rH\u0002J\u0006\u0010'\u001a\u00020\u0013J\u0006\u0010(\u001a\u00020\u0013J\u0006\u0010)\u001a\u00020\u0013J\u0006\u0010*\u001a\u00020\u0013J\b\u0010+\u001a\u00020\u0013H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n \t*\u0004\u0018\u00010\b0\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0002\n\u0000¨\u0006."}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/detail/process/MeetingGroupOpenProcess;", "", "activity", "Landroid/app/Activity;", "event", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEvent;", "(Landroid/app/Activity;Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEvent;)V", "calendarEventService", "Lcom/ss/android/lark/calendar/impl/rustadapter/service/CalendarEventService;", "kotlin.jvm.PlatformType", "callbackManager", "Lcom/larksuite/framework/callback/CallbackManager;", "isAlive", "", "meetingGroupDialog", "Lcom/ss/android/lark/calendar/impl/features/calendarview/widget/RequestLoadingDialog;", "meetingListener", "Lcom/ss/android/lark/calendar/impl/features/events/detail/process/MeetingGroupOpenProcess$IMeetingProcessListener;", "addMessage", "", "dialog", "Lcom/ss/android/lark/ui/CommonDialog;", "message", "", "checkAndEnterMeetingGroup", "checkChatValid", "chatId", "checkGotoMeetingChatBySDK", "createOrJoinMeeting", "isAddToAttendList", "destory", "enterOrCreateOrJoinMeeting", "gotoMeetingChatActivity", "hideEnteringMeetingDialog", "setMeetingListener", "showAppVersionTooLowDialog", "showCreateMeetingDialog", "isInAttendeeList", "isContainEmailAttendee", "showCreateMeetingExceedNumberDialog", "showCreateMeetingGroupNumLimitDialog", "showEnterMeetingErrorDialog", "showEnteringMeetingDialog", "showJoinMeetingDialog", "Companion", "IMeetingProcessListener", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.c.a */
public final class MeetingGroupOpenProcess {

    /* renamed from: e */
    public static final Companion f79098e = new Companion(null);

    /* renamed from: a */
    public RequestLoadingDialog f79099a;

    /* renamed from: b */
    public IMeetingProcessListener f79100b;

    /* renamed from: c */
    public final Activity f79101c;

    /* renamed from: d */
    public CalendarEvent f79102d;

    /* renamed from: f */
    private boolean f79103f = true;

    /* renamed from: g */
    private final CallbackManager f79104g = new CallbackManager();

    /* renamed from: h */
    private final C32533b f79105h = C32533b.m124620a();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/detail/process/MeetingGroupOpenProcess$IMeetingProcessListener;", "", "reloadAndRefreshEventData", "", "setModelEventMeetingType", "showNotCreateMeetingGroupDialog", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.c.a$b */
    public interface IMeetingProcessListener {
        /* renamed from: a */
        void mo113456a();

        /* renamed from: b */
        void mo113457b();

        /* renamed from: c */
        void mo113458c();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/detail/process/MeetingGroupOpenProcess$Companion;", "", "()V", "TAG", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.c.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: j */
    private final void m116941j() {
        RequestLoadingDialog requestLoadingDialog = this.f79099a;
        if (requestLoadingDialog != null) {
            requestLoadingDialog.dismiss();
        }
        this.f79099a = null;
    }

    /* renamed from: a */
    public final void mo113444a() {
        this.f79103f = false;
        this.f79104g.cancelCallbacks();
    }

    /* renamed from: f */
    public final void mo113454f() {
        RequestLoadingDialog requestLoadingDialog = this.f79099a;
        if (requestLoadingDialog != null) {
            requestLoadingDialog.mo112592c(R.string.Calendar_Common_UpgradeTip);
        }
        this.f79099a = null;
    }

    /* renamed from: g */
    public final void mo113455g() {
        RequestLoadingDialog requestLoadingDialog = this.f79099a;
        if (requestLoadingDialog != null) {
            requestLoadingDialog.mo112592c(R.string.Calendar_Toast_Retry);
        }
        this.f79099a = null;
    }

    /* renamed from: c */
    public final void mo113451c() {
        RequestLoadingDialog requestLoadingDialog = new RequestLoadingDialog(this.f79101c);
        this.f79099a = requestLoadingDialog;
        if (requestLoadingDialog != null) {
            requestLoadingDialog.mo112585a(R.string.Calendar_Toast_Entering);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/detail/process/MeetingGroupOpenProcess$checkChatValid$1", "Ljava/lang/Runnable;", "run", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.c.a$d */
    public static final class RunnableC31242d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MeetingGroupOpenProcess f79109a;

        /* renamed from: b */
        final /* synthetic */ String f79110b;

        /* renamed from: c */
        final /* synthetic */ long f79111c;

        public void run() {
            AbstractC30025c a = C30022a.f74882a.chatModuleDependency().mo108217a(this.f79110b);
            if (a != null && a.isInGroupChat()) {
                GeneralHitPoint.m124208a("event_detail", "meeting", this.f79109a.f79102d, this.f79110b);
                this.f79109a.mo113450b(this.f79110b);
            } else if (System.currentTimeMillis() - this.f79111c < ((long) JosStatusCodes.RTN_CODE_COMMON_ERROR)) {
                UICallbackExecutor.executeDelayed(this, 200);
            } else {
                AppreciableHitPoint.f83321a.mo118688f(null);
                this.f79109a.mo113455g();
            }
        }

        RunnableC31242d(MeetingGroupOpenProcess aVar, String str, long j) {
            this.f79109a = aVar;
            this.f79110b = str;
            this.f79111c = j;
        }
    }

    /* renamed from: h */
    private final void m116939h() {
        mo113451c();
        AppreciableHitPoint.f83321a.mo118709y();
        String valueOf = String.valueOf(new Date().getTime());
        Log.m165389i("MeetingGroupOpenProcess", C32673y.m125376b(valueOf, "getEnterbleChatInfo", "key", this.f79102d.getKey()));
        this.f79105h.mo118884d(this.f79102d.getCalendarId(), this.f79102d.getKey(), this.f79102d.getOriginalTime(), this.f79104g.wrapAndAddGetDataCallback(new C31243e(this, valueOf, "getEnterbleChatInfo")));
    }

    /* renamed from: i */
    private final void m116940i() {
        ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) new UDDialogBuilder(this.f79101c).title(R.string.Calendar_Meeting_EnterMeetingAlert)).message(R.string.Calendar_Meeting_EnterGroupAndJoinEventAlert)).messageTextSize(14)).messageTextColor(R.color.text_placeholder)).addActionButton(R.id.ud_dialog_btn_primary, R.string.Calendar_Common_Confirm, new DialogInterface$OnClickListenerC31246h(this))).addActionButton(R.id.ud_dialog_btn_secondary, R.string.Calendar_Common_Cancel, (DialogInterface.OnClickListener) null)).show();
    }

    /* renamed from: b */
    public final void mo113449b() {
        boolean z;
        boolean z2 = true;
        if (this.f79102d.getOrganizerCalendarId() == null || (Intrinsics.areEqual(this.f79102d.getOrganizerCalendarId(), this.f79102d.getCalendarId()) && (this.f79102d.getAttendees().size() == 0 || !this.f79102d.organizerIsAttend()))) {
            z = false;
        } else {
            z = true;
        }
        if (CalendarEvent.Type.MEETING != this.f79102d.getType()) {
            z2 = false;
        }
        boolean c = AttendeeUtil.f79151a.mo113570c(this.f79102d);
        if (z && z2) {
            m116939h();
        } else if (!z2) {
            m116938a(z, c);
        } else if (!z) {
            m116940i();
        }
    }

    /* renamed from: d */
    public final void mo113452d() {
        m116941j();
        ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) new UDDialogBuilder(this.f79101c).title(R.string.Calendar_Alert_GroupNumLimitTitle)).message(R.string.Calendar_Alert_GroupNumLimitDes3)).addActionButton(R.id.ud_dialog_btn_primary, R.string.Calendar_Common_Confirm, (DialogInterface.OnClickListener) null)).titleLineCount(2)).messageTextSize(14)).messageGravity(3)).messageTextColor(R.color.text_caption)).show();
    }

    /* renamed from: e */
    public final void mo113453e() {
        m116941j();
        ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) new UDDialogBuilder(this.f79101c).title(R.string.Calendar_Alert_GroupNumLimitTitle)).message(R.string.Calendar_Alert_GroupNumLimitDes1)).addActionButton(R.id.ud_dialog_btn_primary, R.string.Calendar_Common_Confirm, (DialogInterface.OnClickListener) null)).titleLineCount(2)).messageTextColor(R.color.text_caption)).messageGravity(3)).messageTextSize(14)).cancelOnTouchOutside(false)).cancelable(false)).show();
    }

    /* renamed from: a */
    public final void mo113445a(IMeetingProcessListener bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "meetingListener");
        this.f79100b = bVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/detail/process/MeetingGroupOpenProcess$checkAndEnterMeetingGroup$callback$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEvent;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "sdkEvent", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.c.a$c */
    public static final class C31241c implements IGetDataCallback<CalendarEvent> {

        /* renamed from: a */
        final /* synthetic */ MeetingGroupOpenProcess f79106a;

        /* renamed from: b */
        final /* synthetic */ String f79107b;

        /* renamed from: c */
        final /* synthetic */ String f79108c;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165383e("MeetingGroupOpenProcess", C32673y.m125370a(this.f79107b, this.f79108c, errorResult));
            this.f79106a.mo113455g();
        }

        /* renamed from: a */
        public void onSuccess(CalendarEvent calendarEvent) {
            Unit unit;
            Log.m165389i("MeetingGroupOpenProcess", C32673y.m125373a(this.f79107b, this.f79108c, new String[0]));
            if (calendarEvent != null) {
                this.f79106a.f79102d = calendarEvent;
                int i = C31247b.f79123a[calendarEvent.getCalendarEventDisplayInfo().getMeetingChatBtnDisplayType().ordinal()];
                if (i == 1) {
                    IMeetingProcessListener bVar = this.f79106a.f79100b;
                    if (bVar != null) {
                        bVar.mo113458c();
                        unit = Unit.INSTANCE;
                    } else {
                        unit = null;
                    }
                } else if (i != 2) {
                    this.f79106a.mo113455g();
                    unit = Unit.INSTANCE;
                } else {
                    this.f79106a.mo113449b();
                    unit = Unit.INSTANCE;
                }
                if (unit != null) {
                    return;
                }
            }
            this.f79106a.mo113455g();
            Unit unit2 = Unit.INSTANCE;
        }

        C31241c(MeetingGroupOpenProcess aVar, String str, String str2) {
            this.f79106a = aVar;
            this.f79107b = str;
            this.f79108c = str2;
        }
    }

    /* renamed from: a */
    public final void mo113447a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "chatId");
        UICallbackExecutor.post(new RunnableC31242d(this, str, System.currentTimeMillis()));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/detail/process/MeetingGroupOpenProcess$checkGotoMeetingChatBySDK$uiCallback$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarMeetingEvent;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "meetingEvent", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.c.a$e */
    public static final class C31243e implements IGetDataCallback<CalendarMeetingEvent> {

        /* renamed from: a */
        final /* synthetic */ MeetingGroupOpenProcess f79112a;

        /* renamed from: b */
        final /* synthetic */ String f79113b;

        /* renamed from: c */
        final /* synthetic */ String f79114c;

        /* renamed from: a */
        public void onSuccess(CalendarMeetingEvent calendarMeetingEvent) {
            String str;
            Meeting meeting;
            Log.m165389i("MeetingGroupOpenProcess", C32673y.m125373a(this.f79113b, this.f79114c, new String[0]));
            if (calendarMeetingEvent == null || (meeting = calendarMeetingEvent.getMeeting()) == null || (str = meeting.getChatId()) == null) {
                str = "";
            }
            if (TextUtils.isEmpty(str)) {
                this.f79112a.mo113455g();
                AppreciableHitPoint.f83321a.mo118688f(null);
                return;
            }
            this.f79112a.mo113447a(str);
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            AppreciableHitPoint.f83321a.mo118688f(errorResult);
            if (errorResult.getErrorCode() == 10016) {
                this.f79112a.mo113452d();
                return;
            }
            int errorCode = errorResult.getErrorCode();
            if (errorCode == 8046) {
                RequestLoadingDialog requestLoadingDialog = this.f79112a.f79099a;
                if (requestLoadingDialog != null) {
                    requestLoadingDialog.cancel();
                }
                BillingTipsDialog.m226151a(this.f79112a.f79101c, errorResult.getDisplayMsg(), BillingTipsDialog.Type.CHAT_JOIN_GROUP_NUMBER_LIMIT);
            } else if (errorCode != 8047) {
                this.f79112a.mo113455g();
            } else {
                RequestLoadingDialog requestLoadingDialog2 = this.f79112a.f79099a;
                if (requestLoadingDialog2 != null) {
                    requestLoadingDialog2.cancel();
                }
            }
        }

        C31243e(MeetingGroupOpenProcess aVar, String str, String str2) {
            this.f79112a = aVar;
            this.f79113b = str;
            this.f79114c = str2;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0002¨\u0006\n"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/detail/process/MeetingGroupOpenProcess$createOrJoinMeeting$createMeetingCallBack$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/Meeting;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "meeting", "sendPenetrationHitPoint", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.c.a$f */
    public static final class C31244f implements IGetDataCallback<Meeting> {

        /* renamed from: a */
        final /* synthetic */ MeetingGroupOpenProcess f79115a;

        /* renamed from: b */
        final /* synthetic */ String f79116b;

        /* renamed from: c */
        final /* synthetic */ String f79117c;

        /* renamed from: d */
        final /* synthetic */ boolean f79118d;

        /* renamed from: e */
        final /* synthetic */ CalendarEvent.Type f79119e;

        /* renamed from: b */
        private final void m116959b(Meeting meeting) {
            String str;
            if (meeting == null || (str = meeting.getChatId()) == null) {
                str = "";
            }
            CalendarHitPoint.m124127c();
            if (this.f79119e != CalendarEvent.Type.MEETING) {
                CalendarHitPoint.m124158r();
                GeneralHitPoint.m124208a("event_detail", "event", this.f79115a.f79102d, str);
                return;
            }
            CalendarHitPoint.m124160s();
            GeneralHitPoint.m124208a("event_detail", "meeting", this.f79115a.f79102d, str);
        }

        /* renamed from: a */
        public void onSuccess(Meeting meeting) {
            IMeetingProcessListener bVar;
            Log.m165389i("MeetingGroupOpenProcess", C32673y.m125373a(this.f79116b, this.f79117c, new String[0]));
            m116959b(meeting);
            if (meeting != null) {
                IMeetingProcessListener bVar2 = this.f79115a.f79100b;
                if (bVar2 != null) {
                    bVar2.mo113457b();
                }
                if (this.f79118d && (bVar = this.f79115a.f79100b) != null) {
                    bVar.mo113456a();
                }
                String chatId = meeting.getChatId();
                if (!TextUtils.isEmpty(chatId)) {
                    MeetingGroupOpenProcess aVar = this.f79115a;
                    Intrinsics.checkExpressionValueIsNotNull(chatId, "chatId");
                    aVar.mo113447a(chatId);
                    return;
                }
            }
            this.f79115a.mo113455g();
            AppreciableHitPoint.f83321a.mo118688f(null);
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            AppreciableHitPoint.f83321a.mo118688f(errorResult);
            Log.m165383e("MeetingGroupOpenProcess", C32673y.m125370a(this.f79116b, this.f79117c, errorResult));
            int errorCode = errorResult.getErrorCode();
            if (errorCode == 8008) {
                this.f79115a.mo113453e();
            } else if (errorCode != 8019) {
                switch (errorCode) {
                    case 8044:
                        RequestLoadingDialog requestLoadingDialog = this.f79115a.f79099a;
                        if (requestLoadingDialog != null) {
                            requestLoadingDialog.cancel();
                        }
                        BillingTipsDialog.m226151a(this.f79115a.f79101c, errorResult.getDisplayMsg(), BillingTipsDialog.Type.CHAT_CREATE_GROUP_NUMBER_LIMIT);
                        return;
                    case 8045:
                        RequestLoadingDialog requestLoadingDialog2 = this.f79115a.f79099a;
                        if (requestLoadingDialog2 != null) {
                            requestLoadingDialog2.cancel();
                            return;
                        }
                        return;
                    case 8046:
                        RequestLoadingDialog requestLoadingDialog3 = this.f79115a.f79099a;
                        if (requestLoadingDialog3 != null) {
                            requestLoadingDialog3.cancel();
                        }
                        BillingTipsDialog.m226151a(this.f79115a.f79101c, errorResult.getDisplayMsg(), BillingTipsDialog.Type.CHAT_JOIN_GROUP_NUMBER_LIMIT);
                        return;
                    case 8047:
                        RequestLoadingDialog requestLoadingDialog4 = this.f79115a.f79099a;
                        if (requestLoadingDialog4 != null) {
                            requestLoadingDialog4.cancel();
                            return;
                        }
                        return;
                    default:
                        this.f79115a.mo113455g();
                        return;
                }
            } else {
                this.f79115a.mo113454f();
            }
        }

        C31244f(MeetingGroupOpenProcess aVar, String str, String str2, boolean z, CalendarEvent.Type type) {
            this.f79115a = aVar;
            this.f79116b = str;
            this.f79117c = str2;
            this.f79118d = z;
            this.f79119e = type;
        }
    }

    /* renamed from: b */
    public final void mo113450b(String str) {
        if (this.f79103f) {
            AppreciableHitPoint.f83321a.mo118710z();
            CalendarEventHitPoint.m124344a(this.f79102d.getServerId(), String.valueOf(this.f79102d.getStartTime()), "enter_chat", (String) null, (String) null, 24, (Object) null);
            C30022a.f74882a.chatModuleDependency().mo108222a(this.f79101c, str);
            m116941j();
            CalendarHitPoint.m124150n();
            return;
        }
        AppreciableHitPoint.f83321a.mo118688f(null);
    }

    /* renamed from: a */
    public final void mo113446a(CalendarEvent calendarEvent) {
        Intrinsics.checkParameterIsNotNull(calendarEvent, "event");
        this.f79102d = calendarEvent;
        String valueOf = String.valueOf(new Date().getTime());
        Log.m165389i("MeetingGroupOpenProcess", C32673y.m125376b(valueOf, "getEventOnEnterChat", new String[0]));
        this.f79105h.mo118878b(calendarEvent.getCalendarId(), calendarEvent.getKey(), calendarEvent.getOriginalTime(), this.f79104g.wrapAndAddGetDataCallback(new C31241c(this, valueOf, "getEventOnEnterChat")));
    }

    /* renamed from: a */
    public final void mo113448a(boolean z) {
        mo113451c();
        AppreciableHitPoint.f83321a.mo118709y();
        String valueOf = String.valueOf(new Date().getTime());
        Log.m165389i("MeetingGroupOpenProcess", C32673y.m125376b(valueOf, "sendCreateMeeting", new String[0]));
        this.f79105h.mo118860a(this.f79102d.getCalendarId(), this.f79102d.getKey(), this.f79102d.getOriginalTime(), this.f79104g.wrapAndAddGetDataCallback(new C31244f(this, valueOf, "sendCreateMeeting", z, this.f79102d.getType())));
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.c.a$h */
    public static final class DialogInterface$OnClickListenerC31246h implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MeetingGroupOpenProcess f79122a;

        DialogInterface$OnClickListenerC31246h(MeetingGroupOpenProcess aVar) {
            this.f79122a = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f79122a.mo113448a(true);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.c.a$g */
    public static final class DialogInterface$OnClickListenerC31245g implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MeetingGroupOpenProcess f79120a;

        /* renamed from: b */
        final /* synthetic */ boolean f79121b;

        DialogInterface$OnClickListenerC31245g(MeetingGroupOpenProcess aVar, boolean z) {
            this.f79120a = aVar;
            this.f79121b = z;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            CalendarEventHitPoint.m124340a(this.f79120a.f79102d.getServerId(), String.valueOf(this.f79120a.f79102d.getStartTime()), "yes");
            this.f79120a.mo113448a(!this.f79121b);
        }
    }

    public MeetingGroupOpenProcess(Activity activity, CalendarEvent calendarEvent) {
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        Intrinsics.checkParameterIsNotNull(calendarEvent, "event");
        this.f79101c = activity;
        this.f79102d = calendarEvent;
    }

    /* renamed from: a */
    private final void m116938a(boolean z, boolean z2) {
        String str;
        if (z2) {
            if (z) {
                str = C32634ae.m125182b(R.string.Calendar_Meeting_MeetingWithEmail);
            } else {
                str = C32634ae.m125182b(R.string.Calendar_Meeting_NotAttendWithEmail);
            }
            Intrinsics.checkExpressionValueIsNotNull(str, "if (isInAttendeeList) Re…eting_NotAttendWithEmail)");
        } else {
            if (z) {
                str = C32634ae.m125182b(R.string.Calendar_Meeting_AllGuestJoinMeetingAlert);
            } else {
                str = C32634ae.m125182b(R.string.Calendar_Meeting_CreateMeetingAndAllGuestJoinAlert);
            }
            Intrinsics.checkExpressionValueIsNotNull(str, "if (isInAttendeeList) Re…tingAndAllGuestJoinAlert)");
        }
        CalendarEventHitPoint.m124344a(this.f79102d.getServerId(), String.valueOf(this.f79102d.getStartTime()), "create_chat", (String) null, (String) null, 24, (Object) null);
        CalendarEventHitPoint.m124348b(this.f79102d.getServerId(), String.valueOf(this.f79102d.getStartTime()));
        ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) new UDDialogBuilder(this.f79101c).title(R.string.Calendar_Meeting_CreateMeetingAlert)).message(str)).messageTextSize(14)).messageTextColor(R.color.text_placeholder)).addActionButton(R.id.ud_dialog_btn_primary, R.string.Calendar_Common_Confirm, new DialogInterface$OnClickListenerC31245g(this, z))).addActionButton(R.id.ud_dialog_btn_secondary, R.string.Calendar_Common_Cancel, (DialogInterface.OnClickListener) null)).show();
    }
}
