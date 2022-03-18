package com.ss.android.lark.calendar.impl.features.events.edit.operation;

import android.content.Context;
import android.content.DialogInterface;
import com.larksuite.component.universe_design.dialog.UDBaseDialogBuilder;
import com.larksuite.component.universe_design.dialog.UDDialogBuilder;
import com.larksuite.component.universe_design.dialog.UDListDialogController;
import com.larksuite.component.universe_design.dialog.actionpanel.UDActionPanelBuilder;
import com.larksuite.framework.callback.CallbackManager;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.suite.R;
import com.ss.android.eventbus.EventBus;
import com.ss.android.lark.calendar.impl.features.common.widget.dialog.CommonAlertDialog;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.entity.SpanMenuItem;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.dialog.SpanListDialogBuilder;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.dialog.SpanListDialogController;
import com.ss.android.lark.calendar.impl.features.events.edit.listener.process.IDeleteProcessListener;
import com.ss.android.lark.calendar.impl.features.events.edit.listener.process.IExceptionEventListener;
import com.ss.android.lark.calendar.impl.features.events.edit.listener.process.INotificationListener;
import com.ss.android.lark.calendar.impl.features.events.edit.utils.OperationUtils;
import com.ss.android.lark.calendar.impl.features.local.C31927d;
import com.ss.android.lark.calendar.impl.framework.busevents.BookRoomFinishEvent;
import com.ss.android.lark.calendar.impl.framework.busevents.RefreshSearchResultEvent;
import com.ss.android.lark.calendar.impl.framework.hitpoint.appreciable.AppreciableHitPoint;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event.CalendarHitPoint;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event.GeneralHitPoint;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event2.CalendarEventHitPoint;
import com.ss.android.lark.calendar.impl.framework.p1568a.C32488e;
import com.ss.android.lark.calendar.impl.framework.p1568a.C32493l;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventInstance;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.EventOperationType;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.OptimisticReplyCalendarEventInvitationResponse;
import com.ss.android.lark.calendar.impl.rustadapter.p1575c.AbstractC32594f;
import com.ss.android.lark.calendar.impl.rustadapter.p1575c.C32533b;
import com.ss.android.lark.calendar.impl.rustadapter.service.CalendarSDKService;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.calendar.impl.utils.C32673y;
import com.ss.android.lark.log.Log;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\"\u001a\u00020#H\u0002J\u0010\u0010$\u001a\u00020#2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\b\u0010%\u001a\u00020#H\u0002J\u0010\u0010&\u001a\u00020#2\u0006\u0010'\u001a\u00020\u001aH\u0002J\u0018\u0010(\u001a\u00020#2\u0006\u0010)\u001a\u00020!2\u0006\u0010*\u001a\u00020\u001aH\u0002J*\u0010+\u001a\u00020#2\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010,\u001a\u0004\u0018\u00010\u001d2\u0006\u0010-\u001a\u00020\u000f2\u0006\u0010.\u001a\u00020\u0011J\b\u0010/\u001a\u00020#H\u0002J\b\u00100\u001a\u00020#H\u0002J\u0010\u00101\u001a\u00020#2\u0006\u0010)\u001a\u00020!H\u0002J\u0010\u00102\u001a\u00020#2\u0006\u0010)\u001a\u00020!H\u0002J\b\u00103\u001a\u00020#H\u0002J\u0010\u00104\u001a\u00020#2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\u0018\u00105\u001a\u00020#2\u0006\u0010)\u001a\u00020!2\u0006\u0010*\u001a\u00020\u001aH\u0002J\b\u00106\u001a\u00020#H\u0002J\b\u00107\u001a\u00020#H\u0002J\u0010\u00108\u001a\u00020#2\u0006\u0010)\u001a\u00020!H\u0002J \u00109\u001a\u00020#2\u0006\u0010)\u001a\u00020!2\u0006\u0010:\u001a\u00020;2\u0006\u0010'\u001a\u00020\u001aH\u0002J\u0010\u0010<\u001a\u00020#2\u0006\u0010)\u001a\u00020!H\u0002J\u000e\u0010=\u001a\u00020#2\u0006\u0010>\u001a\u00020\u0013J\u0010\u0010?\u001a\u00020#2\u0006\u0010@\u001a\u00020\u0018H\u0002J\b\u0010A\u001a\u00020#H\u0002J\b\u0010B\u001a\u00020#H\u0002J\b\u0010C\u001a\u00020#H\u0002J\b\u0010D\u001a\u00020#H\u0002J\u0010\u0010E\u001a\u00020#2\u0006\u0010@\u001a\u00020\u0018H\u0002J\b\u0010F\u001a\u00020#H\u0002J\b\u0010G\u001a\u00020#H\u0002J\b\u0010H\u001a\u00020#H\u0002J\b\u0010I\u001a\u00020#H\u0002J\b\u0010J\u001a\u00020#H\u0002J\b\u0010K\u001a\u00020#H\u0002J\b\u0010L\u001a\u00020#H\u0002J\u0010\u0010M\u001a\u00020#2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006XD¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX.¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X.¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0003X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001aX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX.¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u000e¢\u0006\u0002\n\u0000¨\u0006N"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/operation/DeleteProcess;", "", "event", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEvent;", "(Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEvent;)V", "TAG", "", "hitPointSource", "getHitPointSource", "()Ljava/lang/String;", "setHitPointSource", "(Ljava/lang/String;)V", "mCalendarEventService", "Lcom/ss/android/lark/calendar/impl/rustadapter/service/ICalendarEventService;", "mCallbackManager", "Lcom/larksuite/framework/callback/CallbackManager;", "mContext", "Landroid/content/Context;", "mDeleteProcessListener", "Lcom/ss/android/lark/calendar/impl/features/events/edit/listener/process/IDeleteProcessListener;", "mEvent", "mExceptionEventProcess", "Lcom/ss/android/lark/calendar/impl/features/events/edit/operation/ExceptionEventInitProcess;", "mExceptionalEventNum", "", "mHasMeetingBySDK", "", "mHasOriginalRepeatEvent", "mInstance", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventInstance;", "mNotificationProcess", "Lcom/ss/android/lark/calendar/impl/features/events/edit/operation/NotificationProcess;", "mNotificationSpan", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEvent$Span;", "bindNotificationListener", "", "checkHasMeetingAndDelete", "deleteCreationEventProcess", "deleteCreationNormalEvent", "dissolveMeeting", "deleteCreationRepeatBySpan", "span", "isTransferToChat", "deleteEvent", "instance", "callbackManager", "context", "deleteInvitationEventProcess", "deleteInvitationNormalEvent", "deleteInvitationRepeatBySpan", "deleteLocalEvent", "deleteLocalEventProcess", "deleteNormalAndGoogleEvent", "judgeNotificationOnDelete", "onDeleteFailure", "onDeleteFinished", "optimisticSendRemoveInvitationEventRequest", "sendRemoveCreationEventRequest", "notificationType", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEvent$NotificationType;", "sendRemoveInvitationEventRequest", "setDeleteProcessListener", "deleteProcessListener", "showCreationDeleteAlert", "eventType", "showEventDeleteAlert", "showEventInvitationDeleteAlert", "showExceptionalEventDeleteAlert", "showExceptionalMeetingEventDeleteAlert", "showInvitationDeleteAlert", "showMeetingEventDeleteAlert", "showMeetingInvitationDeleteAlert", "showRepeatEventDeleteAlert", "showRepeatInvitationDeleteAlert", "showRepeatMeetingEventDeleteAlert", "showRepeatMeetingInvitationDeleteAlert", "triggerDeleteEvent", "triggerRoomEvent", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.c.a */
public final class DeleteProcess {

    /* renamed from: a */
    public final String f79941a = "DeleteProcess";

    /* renamed from: b */
    public int f79942b;

    /* renamed from: c */
    public boolean f79943c;

    /* renamed from: d */
    public CalendarEvent.Span f79944d;

    /* renamed from: e */
    public CalendarEvent f79945e;

    /* renamed from: f */
    public CalendarEventInstance f79946f;

    /* renamed from: g */
    public boolean f79947g;

    /* renamed from: h */
    private final AbstractC32594f f79948h;

    /* renamed from: i */
    private IDeleteProcessListener f79949i;

    /* renamed from: j */
    private CallbackManager f79950j;

    /* renamed from: k */
    private Context f79951k;

    /* renamed from: l */
    private ExceptionEventInitProcess f79952l;

    /* renamed from: m */
    private NotificationProcess f79953m;

    /* renamed from: n */
    private String f79954n;

    /* renamed from: a */
    public final String mo114673a() {
        return this.f79954n;
    }

    /* renamed from: b */
    public final void mo114683b() {
        m118953c(CalendarEvent.Span.NONE_SPAN);
    }

    /* renamed from: c */
    public final void mo114685c() {
        IDeleteProcessListener aVar = this.f79949i;
        if (aVar != null) {
            aVar.mo113884a();
        }
    }

    /* renamed from: d */
    public final void mo114686d() {
        IDeleteProcessListener aVar = this.f79949i;
        if (aVar != null) {
            aVar.mo113885b();
        }
    }

    /* renamed from: f */
    private final void m118956f() {
        this.f79953m.mo114702a(new C31544a(this));
    }

    /* renamed from: g */
    private final void m118957g() {
        OperationUtils eVar = OperationUtils.f80189a;
        CalendarEvent calendarEvent = this.f79945e;
        if (calendarEvent == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEvent");
        }
        if (eVar.mo114886c(calendarEvent)) {
            mo114674a(2);
        } else {
            mo114674a(1);
        }
    }

    /* renamed from: h */
    private final void m118958h() {
        OperationUtils eVar = OperationUtils.f80189a;
        CalendarEvent calendarEvent = this.f79945e;
        if (calendarEvent == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEvent");
        }
        if (!eVar.mo114886c(calendarEvent)) {
            if (this.f79947g) {
                OperationUtils eVar2 = OperationUtils.f80189a;
                CalendarEvent calendarEvent2 = this.f79945e;
                if (calendarEvent2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mEvent");
                }
                if (!eVar2.mo114887d(calendarEvent2)) {
                    m118952b(CalendarEvent.Span.NONE_SPAN, false);
                    return;
                }
            }
            OperationUtils eVar3 = OperationUtils.f80189a;
            CalendarEvent calendarEvent3 = this.f79945e;
            if (calendarEvent3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mEvent");
            }
            if (!eVar3.mo114887d(calendarEvent3)) {
                m118952b(CalendarEvent.Span.NONE_SPAN, false);
            } else if (this.f79947g) {
                mo114674a(6);
            } else {
                mo114674a(5);
            }
        } else if (this.f79947g) {
            mo114674a(4);
        } else {
            mo114674a(2);
        }
    }

    /* renamed from: i */
    private final void m118959i() {
        OperationUtils eVar = OperationUtils.f80189a;
        CalendarEvent calendarEvent = this.f79945e;
        if (calendarEvent == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEvent");
        }
        if (eVar.mo114886c(calendarEvent)) {
            if (this.f79947g) {
                m118950b(4);
            } else {
                m118950b(2);
            }
        } else if (this.f79947g) {
            OperationUtils eVar2 = OperationUtils.f80189a;
            CalendarEvent calendarEvent2 = this.f79945e;
            if (calendarEvent2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mEvent");
            }
            if (!eVar2.mo114887d(calendarEvent2) || OperationUtils.f80189a.mo114876a(this.f79942b, this.f79943c)) {
                m118950b(3);
            } else {
                m118950b(4);
            }
        } else {
            OperationUtils eVar3 = OperationUtils.f80189a;
            CalendarEvent calendarEvent3 = this.f79945e;
            if (calendarEvent3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mEvent");
            }
            if (!eVar3.mo114887d(calendarEvent3) || OperationUtils.f80189a.mo114876a(this.f79942b, this.f79943c)) {
                m118950b(1);
            } else {
                m118950b(2);
            }
        }
    }

    /* renamed from: q */
    private final void m118967q() {
        CalendarEvent calendarEvent = this.f79945e;
        if (calendarEvent == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEvent");
        }
        String serverId = calendarEvent.getServerId();
        CalendarEvent calendarEvent2 = this.f79945e;
        if (calendarEvent2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEvent");
        }
        CalendarEventHitPoint.m124337a(serverId, String.valueOf(calendarEvent2.getStartTime()));
        Context context = this.f79951k;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
        }
        ((UDActionPanelBuilder) ((UDActionPanelBuilder) ((UDActionPanelBuilder) new UDActionPanelBuilder(context).mo90870a(CollectionsKt.listOf((Object[]) new String[]{C32634ae.m125182b(R.string.Calendar_Alert_RemoveThisEventOnly), C32634ae.m125182b(R.string.Calendar_Alert_RemoveAllEvents)}))).mo90869a(new C31555l(this))).addActionButton(R.id.ud_dialog_btn_cancel, R.string.Calendar_Common_Cancel, (DialogInterface.OnClickListener) null)).show();
    }

    /* renamed from: r */
    private final void m118968r() {
        CalendarEvent calendarEvent = this.f79945e;
        if (calendarEvent == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEvent");
        }
        String serverId = calendarEvent.getServerId();
        CalendarEvent calendarEvent2 = this.f79945e;
        if (calendarEvent2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEvent");
        }
        CalendarEventHitPoint.m124337a(serverId, String.valueOf(calendarEvent2.getStartTime()));
        Context context = this.f79951k;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
        }
        ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) new UDDialogBuilder(context).title(R.string.Calendar_Event_DeletedEventDesc)).message(R.string.Calendar_Alert_DeleteAndLeaveGroupAlert)).addActionButton(R.id.ud_dialog_btn_primary, R.string.Calendar_Event_Remove, new DialogInterface$OnClickListenerC31553j(this))).addActionButton(R.id.ud_dialog_btn_secondary, R.string.Calendar_Common_Cancel, (DialogInterface.OnClickListener) null)).messageTextSize(14)).messageTextColor(R.color.text_caption)).show();
    }

    /* renamed from: e */
    public final void mo114687e() {
        EventBus.getDefault().trigger(new C32493l());
        EventBus.getDefault().trigger(new RefreshSearchResultEvent());
        if (this.f79945e != null) {
            EventBus eventBus = EventBus.getDefault();
            CalendarEvent calendarEvent = this.f79945e;
            if (calendarEvent == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mEvent");
            }
            String calendarId = calendarEvent.getCalendarId();
            CalendarEvent calendarEvent2 = this.f79945e;
            if (calendarEvent2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mEvent");
            }
            eventBus.trigger(C32488e.m124015c(calendarId, calendarEvent2.getServerId()));
        }
    }

    /* renamed from: j */
    private final void m118960j() {
        String str;
        CalendarEvent calendarEvent = this.f79945e;
        if (calendarEvent == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEvent");
        }
        if (calendarEvent.hasMeetingMinute()) {
            Context context = this.f79951k;
            if (context == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mContext");
            }
            str = context.getResources().getString(R.string.Calendar_MeetingMinutes_PopUpWindow);
            Intrinsics.checkExpressionValueIsNotNull(str, "mContext.resources.getSt…etingMinutes_PopUpWindow)");
        } else {
            str = "";
        }
        CalendarEvent calendarEvent2 = this.f79945e;
        if (calendarEvent2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEvent");
        }
        String serverId = calendarEvent2.getServerId();
        CalendarEvent calendarEvent3 = this.f79945e;
        if (calendarEvent3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEvent");
        }
        CalendarEventHitPoint.m124337a(serverId, String.valueOf(calendarEvent3.getStartTime()));
        UDBaseDialogBuilder.ActionBuilder a = new UDBaseDialogBuilder.ActionBuilder().mo90702a(R.id.ud_dialog_btn_primary).mo90706b(R.string.Calendar_Event_CancelButton).mo90712e(C32634ae.m125178a(R.color.ud_R500)).mo90703a(new DialogInterface$OnClickListenerC31548e(this));
        Context context2 = this.f79951k;
        if (context2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
        }
        ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) new UDDialogBuilder(context2).title(R.string.Calendar_Event_SureCancelEvent)).message(str)).addActionButton(a)).addActionButton(R.id.ud_dialog_btn_secondary, R.string.Calendar_Event_DeleteEventGoBack_Button, (DialogInterface.OnClickListener) null)).messageTextSize(14)).messageTextColor(R.color.text_caption)).show();
    }

    /* renamed from: k */
    private final void m118961k() {
        Context context = this.f79951k;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
        }
        UDActionPanelBuilder aVar = new UDActionPanelBuilder(context);
        CalendarEvent calendarEvent = this.f79945e;
        if (calendarEvent == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEvent");
        }
        if (calendarEvent.hasMeetingMinute()) {
            String b = C32634ae.m125182b(R.string.Calendar_MeetingMinutes_PopUpWindow);
            Intrinsics.checkExpressionValueIsNotNull(b, "ResUtil.getString(R.stri…etingMinutes_PopUpWindow)");
            ((UDActionPanelBuilder) ((UDActionPanelBuilder) aVar.title(b)).titleSize(14)).titleColor(R.color.text_caption);
        }
        CalendarEvent calendarEvent2 = this.f79945e;
        if (calendarEvent2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEvent");
        }
        String serverId = calendarEvent2.getServerId();
        CalendarEvent calendarEvent3 = this.f79945e;
        if (calendarEvent3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEvent");
        }
        CalendarEventHitPoint.m124337a(serverId, String.valueOf(calendarEvent3.getStartTime()));
        ((UDActionPanelBuilder) ((UDActionPanelBuilder) ((UDActionPanelBuilder) ((UDActionPanelBuilder) aVar.mo90870a(CollectionsKt.listOf((Object[]) new String[]{C32634ae.m125182b(R.string.Calendar_Edit_DeleteThisEventOnly), C32634ae.m125182b(R.string.Calendar_Detail_DeleteFollowingEvent), C32634ae.m125182b(R.string.Calendar_Edit_DeleteAllEvents)}))).gravity(80)).addActionButton(R.id.ud_dialog_btn_cancel, R.string.Calendar_Common_Cancel, (DialogInterface.OnClickListener) null)).mo90869a(new C31554k(this))).show();
    }

    /* renamed from: l */
    private final void m118962l() {
        CalendarEvent calendarEvent = this.f79945e;
        if (calendarEvent == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEvent");
        }
        String serverId = calendarEvent.getServerId();
        CalendarEvent calendarEvent2 = this.f79945e;
        if (calendarEvent2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEvent");
        }
        CalendarEventHitPoint.m124337a(serverId, String.valueOf(calendarEvent2.getStartTime()));
        Context context = this.f79951k;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
        }
        CommonAlertDialog aVar = new CommonAlertDialog(context);
        String b = C32634ae.m125182b(R.string.Calendar_Event_SureCancelEvent);
        Intrinsics.checkExpressionValueIsNotNull(b, "ResUtil.getString(R.stri…ar_Event_SureCancelEvent)");
        CommonAlertDialog a = aVar.mo112870a(b);
        String b2 = C32634ae.m125182b(R.string.Calendar_Transfer_ConvertWhenDelete);
        Intrinsics.checkExpressionValueIsNotNull(b2, "ResUtil.getString(R.stri…ansfer_ConvertWhenDelete)");
        CommonAlertDialog a2 = a.mo112872a(true, b2).mo112873b(C32634ae.m125178a(R.color.lkui_N600)).mo112869a(14);
        String b3 = C32634ae.m125182b(R.string.Calendar_Event_DeleteEventGoBack_Button);
        Intrinsics.checkExpressionValueIsNotNull(b3, "ResUtil.getString(R.stri…DeleteEventGoBack_Button)");
        String b4 = C32634ae.m125182b(R.string.Calendar_Event_CancelButton);
        Intrinsics.checkExpressionValueIsNotNull(b4, "ResUtil.getString(R.stri…endar_Event_CancelButton)");
        a2.mo112871a(b3, b4, new C31552i(this)).show();
    }

    /* renamed from: m */
    private final void m118963m() {
        ArrayList arrayList = new ArrayList();
        SpanMenuItem.Builder aVar = new SpanMenuItem.Builder();
        String b = C32634ae.m125182b(R.string.Calendar_Transfer_ConvertWhenDeleteRecursive);
        Intrinsics.checkExpressionValueIsNotNull(b, "ResUtil.getString(R.stri…nvertWhenDeleteRecursive)");
        arrayList.add(aVar.mo115315c(b).mo115310a(true).mo115324i());
        SpanMenuItem.Builder a = new SpanMenuItem.Builder().mo115308a(CalendarEvent.Span.THIS_EVENT);
        String b2 = C32634ae.m125182b(R.string.Calendar_Edit_DeleteThisEventOnly);
        Intrinsics.checkExpressionValueIsNotNull(b2, "ResUtil.getString(R.stri…Edit_DeleteThisEventOnly)");
        arrayList.add(a.mo115309a(b2).mo115324i());
        SpanMenuItem.Builder a2 = new SpanMenuItem.Builder().mo115308a(CalendarEvent.Span.FUTURE_EVENTS);
        String b3 = C32634ae.m125182b(R.string.Calendar_Detail_DeleteFollowingEvent);
        Intrinsics.checkExpressionValueIsNotNull(b3, "ResUtil.getString(R.stri…ail_DeleteFollowingEvent)");
        arrayList.add(a2.mo115309a(b3).mo115324i());
        SpanMenuItem.Builder a3 = new SpanMenuItem.Builder().mo115308a(CalendarEvent.Span.ALL_EVENTS);
        String b4 = C32634ae.m125182b(R.string.Calendar_Edit_DeleteAllEvents);
        Intrinsics.checkExpressionValueIsNotNull(b4, "ResUtil.getString(R.stri…dar_Edit_DeleteAllEvents)");
        arrayList.add(a3.mo115309a(b4).mo115324i());
        CalendarEvent calendarEvent = this.f79945e;
        if (calendarEvent == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEvent");
        }
        String serverId = calendarEvent.getServerId();
        CalendarEvent calendarEvent2 = this.f79945e;
        if (calendarEvent2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEvent");
        }
        CalendarEventHitPoint.m124337a(serverId, String.valueOf(calendarEvent2.getStartTime()));
        Context context = this.f79951k;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
        }
        ((SpanListDialogBuilder) new SpanListDialogBuilder(context).mo116008a(arrayList).mo116007a(new C31556m(this)).addActionButton(R.id.ud_dialog_btn_cancel, R.string.Calendar_Common_Cancel, (DialogInterface.OnClickListener) null)).show();
    }

    /* renamed from: n */
    private final void m118964n() {
        Context context = this.f79951k;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
        }
        UDActionPanelBuilder aVar = new UDActionPanelBuilder(context);
        CalendarEvent calendarEvent = this.f79945e;
        if (calendarEvent == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEvent");
        }
        if (calendarEvent.hasMeetingMinute()) {
            ((UDActionPanelBuilder) ((UDActionPanelBuilder) aVar.title(R.string.Calendar_MeetingMinutes_PopUpWindow)).titleColor(R.color.text_caption)).titleSize(14);
        }
        CalendarEvent calendarEvent2 = this.f79945e;
        if (calendarEvent2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEvent");
        }
        String serverId = calendarEvent2.getServerId();
        CalendarEvent calendarEvent3 = this.f79945e;
        if (calendarEvent3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEvent");
        }
        CalendarEventHitPoint.m124337a(serverId, String.valueOf(calendarEvent3.getStartTime()));
        ((UDActionPanelBuilder) ((UDActionPanelBuilder) ((UDActionPanelBuilder) ((UDActionPanelBuilder) aVar.mo90870a(CollectionsKt.listOf((Object[]) new String[]{C32634ae.m125182b(R.string.Calendar_Edit_DeleteThisEventOnly), C32634ae.m125182b(R.string.Calendar_Edit_DeleteAllEvents)}))).mo90869a(new C31550g(this))).gravity(80)).addActionButton(R.id.ud_dialog_btn_cancel, R.string.Calendar_Common_Cancel, (DialogInterface.OnClickListener) null)).show();
    }

    /* renamed from: o */
    private final void m118965o() {
        ArrayList arrayList = new ArrayList();
        SpanMenuItem.Builder aVar = new SpanMenuItem.Builder();
        String b = C32634ae.m125182b(R.string.Calendar_Transfer_ConvertWhenDeleteRecursive);
        Intrinsics.checkExpressionValueIsNotNull(b, "ResUtil.getString(R.stri…nvertWhenDeleteRecursive)");
        arrayList.add(aVar.mo115315c(b).mo115310a(true).mo115324i());
        SpanMenuItem.Builder a = new SpanMenuItem.Builder().mo115308a(CalendarEvent.Span.THIS_EVENT);
        Context context = this.f79951k;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
        }
        String string = context.getResources().getString(R.string.Calendar_Edit_DeleteThisEventOnly);
        Intrinsics.checkExpressionValueIsNotNull(string, "mContext.resources.getSt…Edit_DeleteThisEventOnly)");
        arrayList.add(a.mo115309a(string).mo115324i());
        SpanMenuItem.Builder a2 = new SpanMenuItem.Builder().mo115308a(CalendarEvent.Span.ALL_EVENTS);
        Context context2 = this.f79951k;
        if (context2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
        }
        String string2 = context2.getResources().getString(R.string.Calendar_Edit_DeleteAllEvents);
        Intrinsics.checkExpressionValueIsNotNull(string2, "mContext.resources.getSt…dar_Edit_DeleteAllEvents)");
        arrayList.add(a2.mo115309a(string2).mo115324i());
        CalendarEvent calendarEvent = this.f79945e;
        if (calendarEvent == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEvent");
        }
        String serverId = calendarEvent.getServerId();
        CalendarEvent calendarEvent2 = this.f79945e;
        if (calendarEvent2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEvent");
        }
        CalendarEventHitPoint.m124337a(serverId, String.valueOf(calendarEvent2.getStartTime()));
        Context context3 = this.f79951k;
        if (context3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
        }
        ((SpanListDialogBuilder) new SpanListDialogBuilder(context3).mo116008a(arrayList).mo116007a(new C31551h(this)).addActionButton(R.id.ud_dialog_btn_cancel, R.string.Calendar_Common_Cancel, (DialogInterface.OnClickListener) null)).show();
    }

    /* renamed from: p */
    private final void m118966p() {
        CalendarEvent calendarEvent = this.f79945e;
        if (calendarEvent == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEvent");
        }
        String serverId = calendarEvent.getServerId();
        CalendarEvent calendarEvent2 = this.f79945e;
        if (calendarEvent2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEvent");
        }
        CalendarEventHitPoint.m124337a(serverId, String.valueOf(calendarEvent2.getStartTime()));
        UDBaseDialogBuilder.ActionBuilder a = new UDBaseDialogBuilder.ActionBuilder().mo90702a(R.id.ud_dialog_btn_primary).mo90706b(R.string.Calendar_Event_Remove).mo90712e(C32634ae.m125178a(R.color.ud_R500)).mo90703a(new DialogInterface$OnClickListenerC31549f(this));
        Context context = this.f79951k;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
        }
        ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) new UDDialogBuilder(context).title(R.string.Calendar_Common_Notice)).message(R.string.Calendar_Event_DeletedEventDesc)).addActionButton(a)).addActionButton(R.id.ud_dialog_btn_secondary, R.string.Calendar_Common_Cancel, (DialogInterface.OnClickListener) null)).messageTextColor(R.color.text_caption)).messageTextSize(14)).show();
    }

    /* renamed from: s */
    private final void m118969s() {
        ArrayList arrayList = new ArrayList();
        SpanMenuItem.Builder aVar = new SpanMenuItem.Builder();
        Context context = this.f79951k;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
        }
        String string = context.getResources().getString(R.string.Calendar_Alert_DeleteAllAndExitMeeting);
        Intrinsics.checkExpressionValueIsNotNull(string, "mContext.resources.getSt…_DeleteAllAndExitMeeting)");
        arrayList.add(aVar.mo115312b(string).mo115324i());
        SpanMenuItem.Builder a = new SpanMenuItem.Builder().mo115308a(CalendarEvent.Span.THIS_EVENT);
        Context context2 = this.f79951k;
        if (context2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
        }
        String string2 = context2.getResources().getString(R.string.Calendar_Alert_RemoveThisEventOnly);
        Intrinsics.checkExpressionValueIsNotNull(string2, "mContext.resources.getSt…lert_RemoveThisEventOnly)");
        arrayList.add(a.mo115309a(string2).mo115324i());
        SpanMenuItem.Builder a2 = new SpanMenuItem.Builder().mo115308a(CalendarEvent.Span.ALL_EVENTS);
        Context context3 = this.f79951k;
        if (context3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
        }
        String string3 = context3.getResources().getString(R.string.Calendar_Alert_RemoveAllEvents);
        Intrinsics.checkExpressionValueIsNotNull(string3, "mContext.resources.getSt…ar_Alert_RemoveAllEvents)");
        arrayList.add(a2.mo115309a(string3).mo115324i());
        CalendarEvent calendarEvent = this.f79945e;
        if (calendarEvent == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEvent");
        }
        String serverId = calendarEvent.getServerId();
        CalendarEvent calendarEvent2 = this.f79945e;
        if (calendarEvent2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEvent");
        }
        CalendarEventHitPoint.m124337a(serverId, String.valueOf(calendarEvent2.getStartTime()));
        Context context4 = this.f79951k;
        if (context4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
        }
        ((SpanListDialogBuilder) new SpanListDialogBuilder(context4).mo116008a(arrayList).mo116007a(new C31557n(this)).addActionButton(R.id.ud_dialog_btn_cancel, R.string.Calendar_Common_Cancel, (DialogInterface.OnClickListener) null)).show();
    }

    /* renamed from: c */
    private final void m118953c(CalendarEvent.Span span) {
        m118955d(span);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016J,\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0016J,\u0010\u000e\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0016J<\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0016J<\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0016¨\u0006\u0014"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/edit/operation/DeleteProcess$bindNotificationListener$1", "Lcom/ss/android/lark/calendar/impl/features/events/edit/listener/process/INotificationListener;", "onAfterAddAccount", "", "onAfterChooseCancel", "onCancelNotificationBtnChosen", "onJudgeNotificationBoxTypeFailed", "event", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEvent;", "instance", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventInstance;", "startTime", "", "endTime", "onNoNotificationBox", "onNotSendNotificationBtnChosen", "isShareToChat", "", "isTransferToChat", "onSendNotificationBtnChosen", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.c.a$a */
    public static final class C31544a implements INotificationListener {

        /* renamed from: a */
        final /* synthetic */ DeleteProcess f79956a;

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.listener.process.INotificationListener
        /* renamed from: a */
        public void mo111617a() {
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.listener.process.INotificationListener
        /* renamed from: b */
        public void mo111620b(CalendarEvent calendarEvent, CalendarEventInstance calendarEventInstance, long j, long j2) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31544a(DeleteProcess aVar) {
            this.f79956a = aVar;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.listener.process.INotificationListener
        /* renamed from: a */
        public void mo111618a(CalendarEvent calendarEvent, CalendarEventInstance calendarEventInstance, long j, long j2) {
            if (this.f79956a.f79944d != CalendarEvent.Span.NONE_SPAN) {
                GeneralHitPoint.m124210a(GeneralHitPoint.m124226b(DeleteProcess.m118948a(this.f79956a)), "no_value", this.f79956a.mo114673a(), DeleteProcess.m118948a(this.f79956a), this.f79956a.f79944d);
                DeleteProcess aVar = this.f79956a;
                aVar.mo114677a(aVar.f79944d, CalendarEvent.NotificationType.DEFAULT_NOTIFICATION_TYPE, true);
            } else if (this.f79956a.f79947g) {
                this.f79956a.mo114674a(3);
            } else {
                this.f79956a.mo114674a(1);
            }
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.listener.process.INotificationListener
        /* renamed from: a */
        public void mo111619a(boolean z, boolean z2, CalendarEvent calendarEvent, CalendarEventInstance calendarEventInstance, long j, long j2) {
            GeneralHitPoint.m124187a(DeleteProcess.m118948a(this.f79956a), "not_notify", this.f79956a.mo114673a(), this.f79956a.f79944d);
            DeleteProcess aVar = this.f79956a;
            aVar.mo114677a(aVar.f79944d, CalendarEvent.NotificationType.NO_NOTIFICATION, !z2);
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.listener.process.INotificationListener
        /* renamed from: b */
        public void mo111621b(boolean z, boolean z2, CalendarEvent calendarEvent, CalendarEventInstance calendarEventInstance, long j, long j2) {
            GeneralHitPoint.m124187a(DeleteProcess.m118948a(this.f79956a), "notify", this.f79956a.mo114673a(), this.f79956a.f79944d);
            DeleteProcess aVar = this.f79956a;
            aVar.mo114677a(aVar.f79944d, CalendarEvent.NotificationType.SEND_NOTIFICATION, !z2);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/edit/operation/DeleteProcess$showExceptionalEventDeleteAlert$1", "Lcom/larksuite/component/universe_design/dialog/UDListDialogController$OnItemClickListener;", "onItemClick", "", "index", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.c.a$g */
    public static final class C31550g implements UDListDialogController.OnItemClickListener {

        /* renamed from: a */
        final /* synthetic */ DeleteProcess f79969a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31550g(DeleteProcess aVar) {
            this.f79969a = aVar;
        }

        @Override // com.larksuite.component.universe_design.dialog.UDListDialogController.OnItemClickListener
        public void onItemClick(int i) {
            if (i == 0) {
                Log.m165389i(this.f79969a.f79941a, C32673y.m125369a("delExpThis"));
                CalendarEventHitPoint.m124341a(DeleteProcess.m118948a(this.f79969a).getServerId(), String.valueOf(DeleteProcess.m118948a(this.f79969a).getStartTime()), "yes_only", (Boolean) null);
                this.f79969a.mo114678a(CalendarEvent.Span.THIS_EVENT, false);
            } else if (i == 1) {
                Log.m165389i(this.f79969a.f79941a, C32673y.m125369a("delExpAll"));
                CalendarEventHitPoint.m124341a(DeleteProcess.m118948a(this.f79969a).getServerId(), String.valueOf(DeleteProcess.m118948a(this.f79969a).getStartTime()), "yes_all", (Boolean) null);
                this.f79969a.mo114678a(CalendarEvent.Span.ALL_EVENTS, false);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/edit/operation/DeleteProcess$showExceptionalMeetingEventDeleteAlert$1", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/widget/dialog/SpanListDialogController$OnItemClickListener;", "onItemClick", "", "span", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEvent$Span;", "isChecked", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.c.a$h */
    public static final class C31551h implements SpanListDialogController.OnItemClickListener {

        /* renamed from: a */
        final /* synthetic */ DeleteProcess f79970a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31551h(DeleteProcess aVar) {
            this.f79970a = aVar;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.dialog.SpanListDialogController.OnItemClickListener
        /* renamed from: a */
        public void mo109576a(CalendarEvent.Span span, boolean z) {
            if (span != null) {
                int i = C31558b.f79978b[span.ordinal()];
                if (i == 1) {
                    CalendarEventHitPoint.m124341a(DeleteProcess.m118948a(this.f79970a).getServerId(), String.valueOf(DeleteProcess.m118948a(this.f79970a).getStartTime()), "yes_only", Boolean.valueOf(z));
                    this.f79970a.mo114678a(CalendarEvent.Span.THIS_EVENT, z);
                } else if (i == 2) {
                    CalendarEventHitPoint.m124341a(DeleteProcess.m118948a(this.f79970a).getServerId(), String.valueOf(DeleteProcess.m118948a(this.f79970a).getStartTime()), "yes_all", Boolean.valueOf(z));
                    this.f79970a.mo114678a(CalendarEvent.Span.ALL_EVENTS, z);
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/edit/operation/DeleteProcess$showMeetingEventDeleteAlert$1", "Lcom/ss/android/lark/calendar/impl/features/common/widget/dialog/CommonAlertDialog$OnBottomClickListener;", "onClickedConfirm", "", "isChecked", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.c.a$i */
    public static final class C31552i implements CommonAlertDialog.OnBottomClickListener {

        /* renamed from: a */
        final /* synthetic */ DeleteProcess f79971a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31552i(DeleteProcess aVar) {
            this.f79971a = aVar;
        }

        @Override // com.ss.android.lark.calendar.impl.features.common.widget.dialog.CommonAlertDialog.OnBottomClickListener
        /* renamed from: a */
        public void mo112875a(boolean z) {
            CalendarEventHitPoint.m124341a(DeleteProcess.m118948a(this.f79971a).getServerId(), String.valueOf(DeleteProcess.m118948a(this.f79971a).getStartTime()), "yes", Boolean.valueOf(z));
            GeneralHitPoint.m124210a("meeting", "no_value", this.f79971a.mo114673a(), DeleteProcess.m118948a(this.f79971a), CalendarEvent.Span.NONE_SPAN);
            this.f79971a.mo114682a(!z);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/edit/operation/DeleteProcess$showRepeatEventDeleteAlert$1", "Lcom/larksuite/component/universe_design/dialog/UDListDialogController$OnItemClickListener;", "onItemClick", "", "index", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.c.a$k */
    public static final class C31554k implements UDListDialogController.OnItemClickListener {

        /* renamed from: a */
        final /* synthetic */ DeleteProcess f79973a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31554k(DeleteProcess aVar) {
            this.f79973a = aVar;
        }

        @Override // com.larksuite.component.universe_design.dialog.UDListDialogController.OnItemClickListener
        public void onItemClick(int i) {
            if (i == 0) {
                Log.m165389i(this.f79973a.f79941a, C32673y.m125369a("delThis"));
                CalendarEventHitPoint.m124341a(DeleteProcess.m118948a(this.f79973a).getServerId(), String.valueOf(DeleteProcess.m118948a(this.f79973a).getStartTime()), "yes_only", (Boolean) null);
                GeneralHitPoint.m124210a(GeneralHitPoint.m124226b(DeleteProcess.m118948a(this.f79973a)), "no_value", this.f79973a.mo114673a(), DeleteProcess.m118948a(this.f79973a), CalendarEvent.Span.THIS_EVENT);
                this.f79973a.mo114678a(CalendarEvent.Span.THIS_EVENT, false);
            } else if (i == 1) {
                Log.m165389i(this.f79973a.f79941a, C32673y.m125369a("delFollow"));
                GeneralHitPoint.m124210a(GeneralHitPoint.m124226b(DeleteProcess.m118948a(this.f79973a)), "no_value", this.f79973a.mo114673a(), DeleteProcess.m118948a(this.f79973a), CalendarEvent.Span.FUTURE_EVENTS);
                CalendarEventHitPoint.m124341a(DeleteProcess.m118948a(this.f79973a).getServerId(), String.valueOf(DeleteProcess.m118948a(this.f79973a).getStartTime()), "yes_after", (Boolean) null);
                this.f79973a.mo114678a(CalendarEvent.Span.FUTURE_EVENTS, false);
            } else if (i == 2) {
                Log.m165389i(this.f79973a.f79941a, C32673y.m125369a("delAll"));
                GeneralHitPoint.m124210a(GeneralHitPoint.m124226b(DeleteProcess.m118948a(this.f79973a)), "no_value", this.f79973a.mo114673a(), DeleteProcess.m118948a(this.f79973a), CalendarEvent.Span.ALL_EVENTS);
                CalendarEventHitPoint.m124341a(DeleteProcess.m118948a(this.f79973a).getServerId(), String.valueOf(DeleteProcess.m118948a(this.f79973a).getStartTime()), "yes_all", (Boolean) null);
                this.f79973a.mo114678a(CalendarEvent.Span.ALL_EVENTS, false);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/edit/operation/DeleteProcess$showRepeatInvitationDeleteAlert$1", "Lcom/larksuite/component/universe_design/dialog/UDListDialogController$OnItemClickListener;", "onItemClick", "", "index", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.c.a$l */
    public static final class C31555l implements UDListDialogController.OnItemClickListener {

        /* renamed from: a */
        final /* synthetic */ DeleteProcess f79974a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31555l(DeleteProcess aVar) {
            this.f79974a = aVar;
        }

        @Override // com.larksuite.component.universe_design.dialog.UDListDialogController.OnItemClickListener
        public void onItemClick(int i) {
            if (i == 0) {
                Log.m165389i(this.f79974a.f79941a, C32673y.m125369a("delInvThis"));
                CalendarEventHitPoint.m124341a(DeleteProcess.m118948a(this.f79974a).getServerId(), String.valueOf(DeleteProcess.m118948a(this.f79974a).getStartTime()), "yes_only", (Boolean) null);
                this.f79974a.mo114676a(CalendarEvent.Span.THIS_EVENT);
            } else if (i == 1) {
                Log.m165389i(this.f79974a.f79941a, C32673y.m125369a("delInvAll"));
                CalendarEventHitPoint.m124341a(DeleteProcess.m118948a(this.f79974a).getServerId(), String.valueOf(DeleteProcess.m118948a(this.f79974a).getStartTime()), "yes_all", (Boolean) null);
                this.f79974a.mo114676a(CalendarEvent.Span.ALL_EVENTS);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/edit/operation/DeleteProcess$showRepeatMeetingEventDeleteAlert$1", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/widget/dialog/SpanListDialogController$OnItemClickListener;", "onItemClick", "", "span", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEvent$Span;", "isChecked", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.c.a$m */
    public static final class C31556m implements SpanListDialogController.OnItemClickListener {

        /* renamed from: a */
        final /* synthetic */ DeleteProcess f79975a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31556m(DeleteProcess aVar) {
            this.f79975a = aVar;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.dialog.SpanListDialogController.OnItemClickListener
        /* renamed from: a */
        public void mo109576a(CalendarEvent.Span span, boolean z) {
            if (span != null) {
                int i = C31558b.f79977a[span.ordinal()];
                if (i == 1) {
                    CalendarEventHitPoint.m124341a(DeleteProcess.m118948a(this.f79975a).getServerId(), String.valueOf(DeleteProcess.m118948a(this.f79975a).getStartTime()), "yes_only", Boolean.valueOf(z));
                    this.f79975a.mo114678a(CalendarEvent.Span.THIS_EVENT, z);
                } else if (i == 2) {
                    CalendarEventHitPoint.m124341a(DeleteProcess.m118948a(this.f79975a).getServerId(), String.valueOf(DeleteProcess.m118948a(this.f79975a).getStartTime()), "yes_after", Boolean.valueOf(z));
                    this.f79975a.mo114678a(CalendarEvent.Span.FUTURE_EVENTS, z);
                } else if (i == 3) {
                    CalendarEventHitPoint.m124341a(DeleteProcess.m118948a(this.f79975a).getServerId(), String.valueOf(DeleteProcess.m118948a(this.f79975a).getStartTime()), "yes_all", Boolean.valueOf(z));
                    this.f79975a.mo114678a(CalendarEvent.Span.ALL_EVENTS, z);
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/edit/operation/DeleteProcess$showRepeatMeetingInvitationDeleteAlert$1", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/widget/dialog/SpanListDialogController$OnItemClickListener;", "onItemClick", "", "span", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEvent$Span;", "isChecked", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.c.a$n */
    public static final class C31557n implements SpanListDialogController.OnItemClickListener {

        /* renamed from: a */
        final /* synthetic */ DeleteProcess f79976a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31557n(DeleteProcess aVar) {
            this.f79976a = aVar;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.dialog.SpanListDialogController.OnItemClickListener
        /* renamed from: a */
        public void mo109576a(CalendarEvent.Span span, boolean z) {
            if (span != null) {
                int i = C31558b.f79979c[span.ordinal()];
                if (i == 1) {
                    CalendarEventHitPoint.m124341a(DeleteProcess.m118948a(this.f79976a).getServerId(), String.valueOf(DeleteProcess.m118948a(this.f79976a).getStartTime()), "yes_only", (Boolean) true);
                    this.f79976a.mo114676a(CalendarEvent.Span.THIS_EVENT);
                } else if (i == 2) {
                    CalendarEventHitPoint.m124341a(DeleteProcess.m118948a(this.f79976a).getServerId(), String.valueOf(DeleteProcess.m118948a(this.f79976a).getStartTime()), "yes_all", (Boolean) true);
                    this.f79976a.mo114676a(CalendarEvent.Span.ALL_EVENTS);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo114675a(IDeleteProcessListener aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "deleteProcessListener");
        this.f79949i = aVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/edit/operation/DeleteProcess$checkHasMeetingAndDelete$callback$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "hasMeeting", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.c.a$b */
    public static final class C31545b implements IGetDataCallback<Boolean> {

        /* renamed from: a */
        final /* synthetic */ DeleteProcess f79957a;

        /* renamed from: b */
        final /* synthetic */ CalendarEvent f79958b;

        /* renamed from: c */
        final /* synthetic */ String f79959c;

        /* renamed from: d */
        final /* synthetic */ String f79960d;

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.larksuite.framework.callback.IGetDataCallback, com.larksuite.framework.callback.IRequestCallback
        public /* synthetic */ void onSuccess(Boolean bool) {
            mo114688a(bool.booleanValue());
        }

        /* renamed from: a */
        public void mo114688a(boolean z) {
            this.f79957a.f79947g = z;
            this.f79957a.mo114679a(this.f79958b);
            Log.m165389i(this.f79957a.f79941a, C32673y.m125373a(this.f79959c, this.f79960d, "loadEventHasMeeting", String.valueOf(z)));
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            this.f79957a.f79947g = false;
            this.f79957a.mo114679a(this.f79958b);
            Log.m165383e(this.f79957a.f79941a, C32673y.m125370a(this.f79959c, this.f79960d, errorResult));
        }

        C31545b(DeleteProcess aVar, CalendarEvent calendarEvent, String str, String str2) {
            this.f79957a = aVar;
            this.f79958b = calendarEvent;
            this.f79959c = str;
            this.f79960d = str2;
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ CalendarEvent m118948a(DeleteProcess aVar) {
        CalendarEvent calendarEvent = aVar.f79945e;
        if (calendarEvent == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEvent");
        }
        return calendarEvent;
    }

    /* renamed from: b */
    public static final /* synthetic */ CalendarEventInstance m118949b(DeleteProcess aVar) {
        CalendarEventInstance calendarEventInstance = aVar.f79946f;
        if (calendarEventInstance == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mInstance");
        }
        return calendarEventInstance;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/edit/operation/DeleteProcess$optimisticSendRemoveInvitationEventRequest$callback$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/OptimisticReplyCalendarEventInvitationResponse;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "response", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.c.a$c */
    public static final class C31546c implements IGetDataCallback<OptimisticReplyCalendarEventInvitationResponse> {

        /* renamed from: a */
        final /* synthetic */ DeleteProcess f79961a;

        /* renamed from: b */
        final /* synthetic */ String f79962b;

        /* renamed from: c */
        final /* synthetic */ String f79963c;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165383e(this.f79961a.f79941a, C32673y.m125370a(this.f79962b, this.f79963c, errorResult));
            this.f79961a.mo114686d();
        }

        /* renamed from: a */
        public void onSuccess(OptimisticReplyCalendarEventInvitationResponse sVar) {
            Intrinsics.checkParameterIsNotNull(sVar, "response");
            Log.m165389i(this.f79961a.f79941a, C32673y.m125373a(this.f79962b, this.f79963c, new String[0]));
            this.f79961a.mo114685c();
            this.f79961a.mo114687e();
        }

        C31546c(DeleteProcess aVar, String str, String str2) {
            this.f79961a = aVar;
            this.f79962b = str;
            this.f79963c = str2;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/edit/operation/DeleteProcess$sendRemoveCreationEventRequest$callback$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lorg/json/JSONObject;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "jsonObject", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.c.a$d */
    public static final class C31547d implements IGetDataCallback<JSONObject> {

        /* renamed from: a */
        final /* synthetic */ DeleteProcess f79964a;

        /* renamed from: b */
        final /* synthetic */ String f79965b;

        /* renamed from: c */
        final /* synthetic */ String f79966c;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165383e(this.f79964a.f79941a, C32673y.m125370a(this.f79965b, this.f79966c, errorResult));
            this.f79964a.mo114686d();
        }

        /* renamed from: a */
        public void onSuccess(JSONObject jSONObject) {
            Intrinsics.checkParameterIsNotNull(jSONObject, "jsonObject");
            Log.m165389i(this.f79964a.f79941a, C32673y.m125373a(this.f79965b, this.f79966c, new String[0]));
            this.f79964a.mo114685c();
            if (DeleteProcess.m118949b(this.f79964a).getEventType() == CalendarEvent.Type.DEFAULT_TYPE) {
                CalendarHitPoint.m124130d();
            } else {
                CalendarHitPoint.m124132e();
            }
            this.f79964a.mo114687e();
            DeleteProcess aVar = this.f79964a;
            aVar.mo114684b(DeleteProcess.m118948a(aVar));
        }

        C31547d(DeleteProcess aVar, String str, String str2) {
            this.f79964a = aVar;
            this.f79965b = str;
            this.f79966c = str2;
        }
    }

    /* renamed from: b */
    private final void m118950b(int i) {
        if (i == 1) {
            m118966p();
        } else if (i == 2) {
            m118967q();
        } else if (i == 3) {
            m118968r();
        } else if (i == 4) {
            m118969s();
        }
    }

    /* renamed from: a */
    public final void mo114676a(CalendarEvent.Span span) {
        m118953c(span);
    }

    public DeleteProcess(CalendarEvent calendarEvent) {
        C32533b a = C32533b.m124620a();
        Intrinsics.checkExpressionValueIsNotNull(a, "CalendarEventService.getInstance()");
        this.f79948h = a;
        this.f79944d = CalendarEvent.Span.THIS_EVENT;
        this.f79952l = new ExceptionEventInitProcess();
        this.f79953m = new NotificationProcess();
        this.f79954n = "full_event_editor";
        this.f79952l.mo114694a(new IExceptionEventListener(this) {
            /* class com.ss.android.lark.calendar.impl.features.events.edit.operation.DeleteProcess.C315431 */

            /* renamed from: a */
            final /* synthetic */ DeleteProcess f79955a;

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f79955a = r1;
            }

            @Override // com.ss.android.lark.calendar.impl.features.events.edit.listener.process.IExceptionEventListener
            /* renamed from: a */
            public void mo114634a(int i) {
                this.f79955a.f79942b = i;
            }

            @Override // com.ss.android.lark.calendar.impl.features.events.edit.listener.process.IExceptionEventListener
            /* renamed from: a */
            public void mo114635a(CalendarEvent calendarEvent) {
                boolean z;
                DeleteProcess aVar = this.f79955a;
                if (calendarEvent != null) {
                    z = true;
                } else {
                    z = false;
                }
                aVar.f79943c = z;
            }
        });
        this.f79952l.mo114695a(calendarEvent);
        m118956f();
    }

    /* renamed from: b */
    private final void m118951b(CalendarEvent.Span span) {
        AppreciableHitPoint.f83321a.mo118703s();
        C31927d a = C31927d.m121459a();
        CalendarEvent calendarEvent = this.f79945e;
        if (calendarEvent == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEvent");
        }
        CalendarEventInstance calendarEventInstance = this.f79946f;
        if (calendarEventInstance == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mInstance");
        }
        if (a.mo116546a(calendarEvent, calendarEventInstance, span)) {
            mo114685c();
            mo114687e();
        } else {
            mo114686d();
        }
        String uuid = UUID.randomUUID().toString();
        Intrinsics.checkExpressionValueIsNotNull(uuid, "UUID.randomUUID().toString()");
        CalendarHitPoint.m124139h(uuid);
    }

    /* renamed from: a */
    public final void mo114674a(int i) {
        switch (i) {
            case 1:
                m118960j();
                return;
            case 2:
                m118961k();
                return;
            case 3:
                m118962l();
                return;
            case 4:
                m118963m();
                return;
            case 5:
                m118964n();
                return;
            case 6:
                m118965o();
                return;
            default:
                return;
        }
    }

    /* renamed from: c */
    private final void m118954c(CalendarEvent calendarEvent) {
        String valueOf = String.valueOf(new Date().getTime());
        Log.m165389i(this.f79941a, C32673y.m125376b(valueOf, "loadEventHasMeeting", new String[0]));
        C31545b bVar = new C31545b(this, calendarEvent, valueOf, "loadEventHasMeeting");
        CallbackManager callbackManager = this.f79950j;
        if (callbackManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCallbackManager");
        }
        UIGetDataCallback wrapAndAddGetDataCallback = callbackManager.wrapAndAddGetDataCallback(bVar);
        CalendarSDKService.Companion aVar = CalendarSDKService.f83473a;
        String calendarId = calendarEvent.getCalendarId();
        String str = "";
        if (calendarId == null) {
            calendarId = str;
        }
        String key = calendarEvent.getKey();
        if (key != null) {
            str = key;
        }
        Intrinsics.checkExpressionValueIsNotNull(wrapAndAddGetDataCallback, "uiCallback");
        aVar.mo118939a(calendarId, str, wrapAndAddGetDataCallback);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00d1  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m118955d(com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent.Span r15) {
        /*
        // Method dump skipped, instructions count: 225
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.calendar.impl.features.events.edit.operation.DeleteProcess.m118955d(com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent$Span):void");
    }

    /* renamed from: b */
    public final void mo114684b(CalendarEvent calendarEvent) {
        List<BookRoomFinishEvent> c = BookRoomFinishEvent.f83289a.mo118645c(calendarEvent);
        if (c != null) {
            Iterator<T> it = c.iterator();
            while (it.hasNext()) {
                EventBus.getDefault().trigger(it.next());
            }
        }
    }

    /* renamed from: a */
    public final void mo114679a(CalendarEvent calendarEvent) {
        if (OperationUtils.f80189a.mo114889f(calendarEvent)) {
            m118958h();
        } else if (OperationUtils.f80189a.mo114890g(calendarEvent)) {
            m118959i();
        }
    }

    /* renamed from: a */
    public final void mo114681a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f79954n = str;
    }

    /* renamed from: a */
    public final void mo114682a(boolean z) {
        OperationUtils eVar = OperationUtils.f80189a;
        CalendarEvent calendarEvent = this.f79945e;
        if (calendarEvent == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEvent");
        }
        if (eVar.mo114877a(calendarEvent)) {
            m118951b(CalendarEvent.Span.NONE_SPAN);
        } else {
            mo114677a(CalendarEvent.Span.NONE_SPAN, CalendarEvent.NotificationType.DEFAULT_NOTIFICATION_TYPE, z);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.c.a$f */
    public static final class DialogInterface$OnClickListenerC31549f implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DeleteProcess f79968a;

        DialogInterface$OnClickListenerC31549f(DeleteProcess aVar) {
            this.f79968a = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            Log.m165389i(this.f79968a.f79941a, C32673y.m125369a("delInv"));
            CalendarEventHitPoint.m124341a(DeleteProcess.m118948a(this.f79968a).getServerId(), String.valueOf(DeleteProcess.m118948a(this.f79968a).getStartTime()), "yes", (Boolean) null);
            this.f79968a.mo114683b();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "which", "", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.c.a$j */
    public static final class DialogInterface$OnClickListenerC31553j implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DeleteProcess f79972a;

        DialogInterface$OnClickListenerC31553j(DeleteProcess aVar) {
            this.f79972a = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            CalendarEventHitPoint.m124341a(DeleteProcess.m118948a(this.f79972a).getServerId(), String.valueOf(DeleteProcess.m118948a(this.f79972a).getStartTime()), "yes", (Boolean) true);
            this.f79972a.mo114683b();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.c.a$e */
    public static final class DialogInterface$OnClickListenerC31548e implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DeleteProcess f79967a;

        DialogInterface$OnClickListenerC31548e(DeleteProcess aVar) {
            this.f79967a = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            Log.m165389i(this.f79967a.f79941a, C32673y.m125369a("del"));
            this.f79967a.mo114682a(true);
            CalendarEventHitPoint.m124341a(DeleteProcess.m118948a(this.f79967a).getServerId(), String.valueOf(DeleteProcess.m118948a(this.f79967a).getStartTime()), "yes", (Boolean) null);
            GeneralHitPoint.m124210a(GeneralHitPoint.m124226b(DeleteProcess.m118948a(this.f79967a)), "no_value", this.f79967a.mo114673a(), DeleteProcess.m118948a(this.f79967a), CalendarEvent.Span.NONE_SPAN);
        }
    }

    /* renamed from: b */
    private final void m118952b(CalendarEvent.Span span, boolean z) {
        this.f79944d = span;
        NotificationProcess dVar = this.f79953m;
        Context context = this.f79951k;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
        }
        CallbackManager callbackManager = this.f79950j;
        if (callbackManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCallbackManager");
        }
        CalendarEvent calendarEvent = this.f79945e;
        if (calendarEvent == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEvent");
        }
        CalendarEvent calendarEvent2 = this.f79945e;
        if (calendarEvent2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEvent");
        }
        CalendarEventInstance calendarEventInstance = this.f79946f;
        if (calendarEventInstance == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mInstance");
        }
        dVar.mo114700a(context, callbackManager, calendarEvent, calendarEvent2, calendarEventInstance, EventOperationType.OP_DELETE_EVENT, span, false, false, z, 0, 0);
    }

    /* renamed from: a */
    public final void mo114678a(CalendarEvent.Span span, boolean z) {
        OperationUtils eVar = OperationUtils.f80189a;
        CalendarEvent calendarEvent = this.f79945e;
        if (calendarEvent == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEvent");
        }
        if (eVar.mo114877a(calendarEvent)) {
            m118951b(span);
        } else {
            m118952b(span, z);
        }
    }

    /* renamed from: a */
    public final void mo114677a(CalendarEvent.Span span, CalendarEvent.NotificationType notificationType, boolean z) {
        CalendarEvent calendarEvent = this.f79945e;
        if (calendarEvent == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEvent");
        }
        calendarEvent.setNotificationType(notificationType);
        String valueOf = String.valueOf(new Date().getTime());
        String str = this.f79941a;
        String[] strArr = new String[4];
        strArr[0] = "key";
        CalendarEvent calendarEvent2 = this.f79945e;
        if (calendarEvent2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEvent");
        }
        strArr[1] = calendarEvent2.getKey();
        strArr[2] = "span";
        strArr[3] = "" + span;
        Log.m165389i(str, C32673y.m125376b(valueOf, "deleteEvent", strArr));
        AppreciableHitPoint.f83321a.mo118703s();
        C31547d dVar = new C31547d(this, valueOf, "deleteEvent");
        if (!z) {
            GeneralHitPoint.m124259m();
        }
        CallbackManager callbackManager = this.f79950j;
        if (callbackManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCallbackManager");
        }
        UIGetDataCallback wrapAndAddGetDataCallback = callbackManager.wrapAndAddGetDataCallback(dVar);
        AbstractC32594f fVar = this.f79948h;
        CalendarEvent calendarEvent3 = this.f79945e;
        if (calendarEvent3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEvent");
        }
        CalendarEventInstance calendarEventInstance = this.f79946f;
        if (calendarEventInstance == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mInstance");
        }
        fVar.mo118854a(calendarEvent3, calendarEventInstance, span, wrapAndAddGetDataCallback, z);
    }

    /* renamed from: a */
    public final void mo114680a(CalendarEvent calendarEvent, CalendarEventInstance calendarEventInstance, CallbackManager callbackManager, Context context) {
        Intrinsics.checkParameterIsNotNull(callbackManager, "callbackManager");
        Intrinsics.checkParameterIsNotNull(context, "context");
        if (calendarEvent != null && calendarEventInstance != null) {
            this.f79945e = calendarEvent;
            this.f79946f = calendarEventInstance;
            this.f79950j = callbackManager;
            this.f79951k = context;
            if (OperationUtils.f80189a.mo114877a(calendarEvent)) {
                m118957g();
            } else {
                m118954c(calendarEvent);
            }
        }
    }
}
