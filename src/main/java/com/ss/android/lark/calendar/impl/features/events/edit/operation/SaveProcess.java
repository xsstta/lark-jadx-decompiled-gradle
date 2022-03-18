package com.ss.android.lark.calendar.impl.features.events.edit.operation;

import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import com.larksuite.component.universe_design.dialog.UDDialogBuilder;
import com.larksuite.component.universe_design.dialog.UDListDialogController;
import com.larksuite.component.universe_design.dialog.actionpanel.UDActionPanelBuilder;
import com.larksuite.component.universe_design.toast.UDToast;
import com.larksuite.framework.callback.CallbackManager;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.suite.R;
import com.ss.android.eventbus.EventBus;
import com.ss.android.lark.calendar.impl.features.calendarview.CalendarDate;
import com.ss.android.lark.calendar.impl.features.events.edit.data.UpdateTimeType;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.entity.SpanMenuItem;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.dialog.SpanListDialogBuilder;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.dialog.SpanListDialogController;
import com.ss.android.lark.calendar.impl.features.events.edit.listener.process.IExceptionEventListener;
import com.ss.android.lark.calendar.impl.features.events.edit.listener.process.INotificationListener;
import com.ss.android.lark.calendar.impl.features.events.edit.listener.process.ISaveProcessListener;
import com.ss.android.lark.calendar.impl.features.events.edit.utils.EventCompareUtils;
import com.ss.android.lark.calendar.impl.features.events.edit.utils.OperationUtils;
import com.ss.android.lark.calendar.impl.features.local.C31927d;
import com.ss.android.lark.calendar.impl.features.meetingroom.base.ResourceEditSaveEventProcess;
import com.ss.android.lark.calendar.impl.features.meetingroom.base.helper.OriginalEventData;
import com.ss.android.lark.calendar.impl.features.meetingroom.base.helper.ResourceApprovalDataHelper;
import com.ss.android.lark.calendar.impl.framework.busevents.BookRoomFinishEvent;
import com.ss.android.lark.calendar.impl.framework.hitpoint.appreciable.AppreciableHitPoint;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event.GeneralHitPoint;
import com.ss.android.lark.calendar.impl.framework.p1568a.C32486b;
import com.ss.android.lark.calendar.impl.framework.p1568a.C32488e;
import com.ss.android.lark.calendar.impl.framework.p1568a.C32493l;
import com.ss.android.lark.calendar.impl.p1437b.p1438a.C30076a;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttendee;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventInstance;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.DirtyType;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.EventOperationType;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.SimpleMember;
import com.ss.android.lark.calendar.impl.rustadapter.p1575c.AbstractC32594f;
import com.ss.android.lark.calendar.impl.rustadapter.p1575c.C32533b;
import com.ss.android.lark.calendar.impl.rustadapter.service.CalendarSDKService;
import com.ss.android.lark.calendar.impl.utils.C32632ac;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.calendar.impl.utils.C32673y;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.log.Log;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0014\u0018\u0000 v2\u00020\u0001:\u0001vB\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\b\u0010,\u001a\u00020-H\u0002J\b\u0010.\u001a\u00020-H\u0002J\u0010\u0010/\u001a\u00020-2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\u0018\u00100\u001a\u00020-2\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u00020\u0018H\u0002J\b\u00104\u001a\u00020-H\u0002J\b\u00105\u001a\u00020-H\u0002J\b\u00106\u001a\u00020-H\u0002J\u0010\u00107\u001a\u00020-2\u0006\u00108\u001a\u00020 H\u0002J\b\u00109\u001a\u00020-H\u0002J\b\u0010:\u001a\u00020-H\u0002J\u0010\u0010;\u001a\u00020-2\u0006\u00108\u001a\u00020 H\u0002J\b\u0010<\u001a\u00020-H\u0002J(\u0010=\u001a\u00020-2\u0006\u00101\u001a\u0002022\u0006\u00108\u001a\u00020 2\u0006\u0010>\u001a\u00020\u00182\u0006\u00103\u001a\u00020\u0018H\u0002J\u0016\u0010?\u001a\u00020-2\f\u0010@\u001a\b\u0012\u0004\u0012\u00020-0AH\u0002J\b\u0010B\u001a\u00020\u0018H\u0002J\u001a\u0010C\u001a\u00020\u00182\b\u0010D\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\u0012\u0010E\u001a\u00020\u00182\b\u0010F\u001a\u0004\u0018\u00010\u0003H\u0002J\u0010\u0010G\u001a\u00020-2\u0006\u00108\u001a\u00020 H\u0002J\u0010\u0010H\u001a\u00020-2\u0006\u00108\u001a\u00020 H\u0002J\b\u0010I\u001a\u00020-H\u0002J\u0010\u0010J\u001a\u00020-2\u0006\u0010K\u001a\u00020\u0012H\u0002J\u0012\u0010L\u001a\u00020-2\b\u0010M\u001a\u0004\u0018\u00010\u0003H\u0002Jt\u0010N\u001a\u00020-2\u0006\u0010O\u001a\u00020\u00182\b\u0010D\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010P\u001a\u0004\u0018\u00010\u001a2\u0006\u0010Q\u001a\u00020\u00152\u0006\u0010R\u001a\u00020\u000b2\u0006\u0010S\u001a\u00020\r2\u001a\u0010T\u001a\u0016\u0012\u0004\u0012\u00020\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u0006\u0018\u00010\u00142\u0006\u0010+\u001a\u00020\u00182\f\u0010U\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\u0010\u0010V\u001a\u00020-2\u0006\u0010K\u001a\u00020\u0012H\u0002J(\u0010W\u001a\u00020-2\u0006\u0010X\u001a\u00020\u00032\u0006\u0010Y\u001a\u00020Z2\u0006\u0010[\u001a\u00020)2\u0006\u0010\\\u001a\u00020)H\u0002J\u0010\u0010]\u001a\u00020-2\u0006\u00108\u001a\u00020 H\u0002J\u0018\u0010^\u001a\u00020-2\u0006\u00108\u001a\u00020 2\u0006\u00101\u001a\u000202H\u0002J\u0018\u0010_\u001a\u00020-2\u0006\u00108\u001a\u00020 2\u0006\u00101\u001a\u000202H\u0002JB\u0010`\u001a\u00020-2\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010D\u001a\u0004\u0018\u00010\u00032\b\u0010P\u001a\u0004\u0018\u00010\u001a2\u0006\u00108\u001a\u00020 2\u0006\u0010a\u001a\u00020\u00152\f\u0010b\u001a\b\u0012\u0004\u0012\u00020\u00030cH\u0002J\u0018\u0010d\u001a\u00020-2\u0006\u00108\u001a\u00020 2\u0006\u00101\u001a\u000202H\u0002J\u000e\u0010e\u001a\u00020-2\u0006\u0010f\u001a\u00020&J\b\u0010g\u001a\u00020-H\u0002J\b\u0010h\u001a\u00020-H\u0002J\b\u0010i\u001a\u00020-H\u0002J\u0010\u0010j\u001a\u00020-2\u0006\u0010k\u001a\u00020\u0018H\u0002J\b\u0010l\u001a\u00020-H\u0002J\b\u0010m\u001a\u00020-H\u0002J\b\u0010n\u001a\u00020-H\u0002J\u001a\u0010o\u001a\u00020-2\u0006\u0010p\u001a\u00020\u00152\b\b\u0002\u0010q\u001a\u00020\u0018H\u0002J\u001a\u0010r\u001a\u00020-2\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010O\u001a\u00020\u0018H\u0002J\u0010\u0010s\u001a\u00020-2\u0006\u0010p\u001a\u00020\u0015H\u0002J\u0018\u0010t\u001a\u00020-2\u0006\u00108\u001a\u00020 2\u0006\u0010u\u001a\u00020\u0018H\u0002R\u0016\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX.¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0003X.¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u000e¢\u0006\u0002\n\u0000R\"\u0010\u0013\u001a\u0016\u0012\u0004\u0012\u00020\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u0006\u0018\u00010\u0014X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0018X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0018X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010!\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\"\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020$X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020&X.¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\u0015X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020)X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020)X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u0018X\u000e¢\u0006\u0002\n\u0000¨\u0006w"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/operation/SaveProcess;", "", "event", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEvent;", "(Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEvent;)V", "mAllOriginalAttendees", "", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventAttendee;", "mCalendarEventService", "Lcom/ss/android/lark/calendar/impl/rustadapter/service/ICalendarEventService;", "mCallbackManager", "Lcom/larksuite/framework/callback/CallbackManager;", "mContext", "Landroid/content/Context;", "mEvent", "mExceptionEventProcess", "Lcom/ss/android/lark/calendar/impl/features/events/edit/operation/ExceptionEventInitProcess;", "mExceptionalEventNum", "", "mGroupSimpleMemberMap", "", "", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/SimpleMember;", "mHasOriginalRepeatEvent", "", "mInstance", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventInstance;", "mIsEditEvent", "mIsInvited", "mNotificationProcess", "Lcom/ss/android/lark/calendar/impl/features/events/edit/operation/NotificationProcess;", "mNotificationSpan", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEvent$Span;", "mOriginalEvent", "mOriginalRepeatEvent", "mResourceSaveEventProcess", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/base/ResourceEditSaveEventProcess;", "mSaveProcessListener", "Lcom/ss/android/lark/calendar/impl/features/events/edit/listener/process/ISaveProcessListener;", "mShareToChatId", "mStoreEndTimeDiff", "", "mStoreStartTimeDiff", "needAddNewOrganizer", "bindNotificationListener", "", "checkAttendeeAndSaveEvent", "clearEventAttendeeGroupMember", "createEventRequest", "notificationType", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEvent$NotificationType;", "isShareToChat", "dealExistOrganizer", "editEditableRepeatEventProcess", "editEventSaveProcess", "editInvitationRepeatEvent", "span", "editLocalEventSaveProcess", "editNormalEventProcess", "editRepeatEvent", "editRepeatEventProcess", "executeSaveEdit", "isInvited", "interceptSaveEventResource", "nextAction", "Lkotlin/Function0;", "isCalendarChanged", "isProcessRequiredFieldsEmpty", "originalEvent", "isRepeatEndMoreThanLimitDate", "originalRepeatEvent", "judgeNotificationOnEdit", "judgeNotificationOnEditInvitation", "judgeNotificationOnSave", "saveCreateEventFailure", "errorCode", "saveCreateEventSuccess", "calendarEvent", "saveCreateOrEditEvent", "isEditEvent", "instance", "chatId", "callbackManager", "context", "groupSimpleMemberMap", "originalAttendees", "saveEditEventFailure", "saveEditEventSuccess", "resultEvent", "updateType", "Lcom/ss/android/lark/calendar/impl/features/events/edit/data/UpdateTimeType;", "startTimeDiff", "endTimeDiff", "saveLocalSystemEvent", "sendSaveEditEventRequest", "sendSaveEditInvitationEvent", "sendSaveEventRequest", "shareToChatId", "uiCallback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "sendSaveSwitchCalendarEvent", "setSaveProcessListener", "saveProcessListener", "showAttendeeExceedMeetingLimit", "showExceptionalEventEditAlert", "showRepeatEventEditAlert", "showRepeatInvitationEditAlert", "isEndDateValidate", "showSaveAllEventTipDialog", "showSwitchSaveDialog", "showUnSaveDisConnectDialog", "triggerEditEvent", "calendarId", "isCreate", "triggerRoomEvent", "updateCalendarVisibility", "updateEventTimeDataBySpan", "isNeedUpdateEventTime", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.c.e */
public final class SaveProcess {

    /* renamed from: m */
    public static final Companion f80023m = new Companion(null);

    /* renamed from: a */
    public int f80024a;

    /* renamed from: b */
    public boolean f80025b;

    /* renamed from: c */
    public CalendarEvent f80026c;

    /* renamed from: d */
    public boolean f80027d;

    /* renamed from: e */
    public CalendarEvent.Span f80028e = CalendarEvent.Span.THIS_EVENT;

    /* renamed from: f */
    public CalendarEvent f80029f;

    /* renamed from: g */
    public CalendarEvent f80030g;

    /* renamed from: h */
    public CalendarEventInstance f80031h;

    /* renamed from: i */
    public Context f80032i;

    /* renamed from: j */
    public ISaveProcessListener f80033j;

    /* renamed from: k */
    public long f80034k;

    /* renamed from: l */
    public long f80035l;

    /* renamed from: n */
    private boolean f80036n;

    /* renamed from: o */
    private String f80037o = "";

    /* renamed from: p */
    private CallbackManager f80038p;

    /* renamed from: q */
    private ExceptionEventInitProcess f80039q = new ExceptionEventInitProcess();

    /* renamed from: r */
    private NotificationProcess f80040r = new NotificationProcess();

    /* renamed from: s */
    private final ResourceEditSaveEventProcess f80041s = new ResourceEditSaveEventProcess();

    /* renamed from: t */
    private final AbstractC32594f f80042t;

    /* renamed from: u */
    private Map<String, ? extends List<SimpleMember>> f80043u;

    /* renamed from: v */
    private boolean f80044v;

    /* renamed from: w */
    private List<? extends CalendarEventAttendee> f80045w;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/operation/SaveProcess$Companion;", "", "()V", "REPEAT_END_MAX_AVAILABLE_DAYS", "", "REQUIRED_FIELDS_EMPTY", "", "TAG", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.c.e$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00a2, code lost:
        if (r1.mo114887d(r3) != false) goto L_0x00a4;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo114720a(boolean r10, com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent r11, com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent r12, com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventInstance r13, java.lang.String r14, com.larksuite.framework.callback.CallbackManager r15, android.content.Context r16, java.util.Map<java.lang.String, ? extends java.util.List<com.ss.android.lark.calendar.impl.rustadapter.doentity.SimpleMember>> r17, boolean r18, java.util.List<? extends com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttendee> r19) {
        /*
        // Method dump skipped, instructions count: 344
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.calendar.impl.features.events.edit.operation.SaveProcess.mo114720a(boolean, com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent, com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent, com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventInstance, java.lang.String, com.larksuite.framework.callback.CallbackManager, android.content.Context, java.util.Map, boolean, java.util.List):void");
    }

    /* renamed from: a */
    public final void mo114719a(Function0<Unit> function0) {
        ResourceEditSaveEventProcess bVar = this.f80041s;
        Context context = this.f80032i;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
        }
        ResourceApprovalDataHelper cVar = ResourceApprovalDataHelper.f81975a;
        CalendarEvent calendarEvent = this.f80029f;
        if (calendarEvent == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEvent");
        }
        List<CalendarEventAttendee> a = cVar.mo117029a(calendarEvent.getAttendees());
        CalendarEvent calendarEvent2 = this.f80029f;
        if (calendarEvent2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEvent");
        }
        long startTime = calendarEvent2.getStartTime();
        CalendarEvent calendarEvent3 = this.f80029f;
        if (calendarEvent3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEvent");
        }
        long endTime = calendarEvent3.getEndTime();
        CalendarEvent calendarEvent4 = this.f80029f;
        if (calendarEvent4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEvent");
        }
        String rRule = calendarEvent4.getRRule();
        CalendarEvent calendarEvent5 = this.f80029f;
        if (calendarEvent5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEvent");
        }
        bVar.mo117000a(context, a, startTime, endTime, rRule, calendarEvent5.getOriginalTime(), OriginalEventData.f81971a.mo117025a(this.f80030g), function0);
    }

    /* renamed from: a */
    public final void mo114713a(CalendarEvent.Span span) {
        OperationUtils eVar = OperationUtils.f80189a;
        CalendarEvent calendarEvent = this.f80029f;
        if (calendarEvent == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEvent");
        }
        if (eVar.mo114877a(calendarEvent)) {
            m119039e(span);
        } else {
            m119035c(span);
        }
    }

    /* renamed from: a */
    public final void mo114712a(CalendarEvent.NotificationType notificationType, CalendarEvent.Span span, boolean z, boolean z2) {
        if (!this.f80036n) {
            m119025a(notificationType, z2);
        } else if (m119046m()) {
            m119032b(span, notificationType);
        } else if (z) {
            m119036c(span, notificationType);
        } else {
            mo114714a(span, notificationType);
        }
        OperationUtils eVar = OperationUtils.f80189a;
        ISaveProcessListener dVar = this.f80033j;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSaveProcessListener");
        }
        String f = dVar.mo114646f();
        boolean z3 = this.f80036n;
        CalendarEvent calendarEvent = this.f80029f;
        if (calendarEvent == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEvent");
        }
        CalendarEvent calendarEvent2 = this.f80030g;
        ISaveProcessListener dVar2 = this.f80033j;
        if (dVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSaveProcessListener");
        }
        eVar.mo114875a(notificationType, f, z3, calendarEvent, calendarEvent2, dVar2.mo114647g(), this.f80037o);
    }

    /* renamed from: a */
    public final void mo114714a(CalendarEvent.Span span, CalendarEvent.NotificationType notificationType) {
        CalendarEvent calendarEvent = this.f80029f;
        if (calendarEvent == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEvent");
        }
        calendarEvent.setNotificationType(notificationType);
        String valueOf = String.valueOf(new Date().getTime());
        C31571g gVar = new C31571g(this, valueOf, "saveEdit", span);
        String[] strArr = new String[4];
        strArr[0] = "edit_item";
        EventCompareUtils cVar = EventCompareUtils.f80187a;
        CalendarEvent calendarEvent2 = this.f80030g;
        CalendarEvent calendarEvent3 = this.f80029f;
        if (calendarEvent3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEvent");
        }
        strArr[1] = cVar.mo114862a(calendarEvent2, calendarEvent3, this.f80031h);
        strArr[2] = "span";
        strArr[3] = span.toString() + "";
        Log.m165389i("SaveProcess", C32673y.m125376b(valueOf, "saveEdit", strArr));
        CallbackManager callbackManager = this.f80038p;
        if (callbackManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCallbackManager");
        }
        UIGetDataCallback wrapAndAddGetDataCallback = callbackManager.wrapAndAddGetDataCallback(gVar);
        CalendarEvent calendarEvent4 = this.f80029f;
        if (calendarEvent4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEvent");
        }
        CalendarEvent calendarEvent5 = this.f80030g;
        CalendarEventInstance calendarEventInstance = this.f80031h;
        Intrinsics.checkExpressionValueIsNotNull(wrapAndAddGetDataCallback, "uiCallback");
        m119027a(calendarEvent4, calendarEvent5, calendarEventInstance, span, "", wrapAndAddGetDataCallback);
    }

    /* renamed from: a */
    public final void mo114715a(CalendarEvent calendarEvent) {
        ISaveProcessListener dVar = this.f80033j;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSaveProcessListener");
        }
        dVar.mo114638a(calendarEvent);
    }

    /* renamed from: a */
    public final void mo114710a(int i) {
        ISaveProcessListener dVar = this.f80033j;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSaveProcessListener");
        }
        dVar.mo114637a(i);
    }

    /* renamed from: a */
    public final void mo114716a(CalendarEvent calendarEvent, UpdateTimeType updateTimeType, long j, long j2) {
        ISaveProcessListener dVar = this.f80033j;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSaveProcessListener");
        }
        dVar.mo114639a(calendarEvent, updateTimeType.getNumber(), j, j2);
    }

    /* renamed from: a */
    public final void mo114718a(String str, boolean z) {
        C32488e eVar;
        if (C30022a.f74883b.mo112703k()) {
            EventBus.getDefault().trigger(new C32493l());
        } else {
            EventBus eventBus = EventBus.getDefault();
            ISaveProcessListener dVar = this.f80033j;
            if (dVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mSaveProcessListener");
            }
            eventBus.trigger(new C32486b(dVar.mo114645e()).mo118636a(str));
        }
        if (this.f80029f != null) {
            EventBus eventBus2 = EventBus.getDefault();
            if (z) {
                CalendarEvent calendarEvent = this.f80029f;
                if (calendarEvent == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mEvent");
                }
                String calendarId = calendarEvent.getCalendarId();
                CalendarEvent calendarEvent2 = this.f80029f;
                if (calendarEvent2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mEvent");
                }
                eVar = C32488e.m124013a(calendarId, calendarEvent2.getServerId());
            } else {
                CalendarEvent calendarEvent3 = this.f80029f;
                if (calendarEvent3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mEvent");
                }
                String calendarId2 = calendarEvent3.getCalendarId();
                CalendarEvent calendarEvent4 = this.f80029f;
                if (calendarEvent4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mEvent");
                }
                eVar = C32488e.m124014b(calendarId2, calendarEvent4.getServerId());
            }
            eventBus2.trigger(eVar);
        }
    }

    /* renamed from: a */
    public final void mo114717a(CalendarEvent calendarEvent, boolean z) {
        List<BookRoomFinishEvent> list;
        if (z) {
            list = BookRoomFinishEvent.f83289a.mo118644b(calendarEvent);
        } else {
            list = BookRoomFinishEvent.f83289a.mo118643a(calendarEvent);
        }
        if (list != null) {
            for (BookRoomFinishEvent cVar : list) {
                EventBus.getDefault().trigger(cVar);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.c.e$e */
    public static final class C31569e extends Lambda implements Function0<Unit> {
        final /* synthetic */ SaveProcess this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31569e(SaveProcess eVar) {
            super(0);
            this.this$0 = eVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            this.this$0.mo114709a();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.c.e$f */
    public static final class C31570f extends Lambda implements Function0<Unit> {
        final /* synthetic */ SaveProcess this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31570f(SaveProcess eVar) {
            super(0);
            this.this$0 = eVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            this.this$0.mo114724c();
        }
    }

    /* renamed from: l */
    private final void m119045l() {
        this.f80040r.mo114702a(new C31566b(this));
    }

    /* renamed from: b */
    public final void mo114721b() {
        if (OperationUtils.f80189a.mo114886c(this.f80030g)) {
            m119041h();
        } else {
            m119044k();
        }
    }

    /* renamed from: g */
    private final void m119040g() {
        if (!OperationUtils.f80189a.mo114886c(this.f80030g)) {
            m119039e(CalendarEvent.Span.NONE_SPAN);
            return;
        }
        OperationUtils eVar = OperationUtils.f80189a;
        CalendarEvent calendarEvent = this.f80029f;
        if (calendarEvent == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEvent");
        }
        if (eVar.mo114883b(calendarEvent, this.f80030g, this.f80031h)) {
            m119047n();
            return;
        }
        ISaveProcessListener dVar = this.f80033j;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSaveProcessListener");
        }
        dVar.mo114641b();
    }

    /* renamed from: h */
    private final void m119041h() {
        if (OperationUtils.f80189a.mo114891h(this.f80030g)) {
            m119042i();
            return;
        }
        OperationUtils eVar = OperationUtils.f80189a;
        CalendarEvent calendarEvent = this.f80029f;
        if (calendarEvent == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEvent");
        }
        if (eVar.mo114878a(calendarEvent, this.f80030g)) {
            ISaveProcessListener dVar = this.f80033j;
            if (dVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mSaveProcessListener");
            }
            m119029a(dVar.mo114643c());
            return;
        }
        m119038d(CalendarEvent.Span.ALL_EVENTS);
    }

    /* renamed from: m */
    private final boolean m119046m() {
        String str;
        if (this.f80036n) {
            CalendarEvent calendarEvent = this.f80029f;
            if (calendarEvent == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mEvent");
            }
            String calendarId = calendarEvent.getCalendarId();
            CalendarEvent calendarEvent2 = this.f80030g;
            if (calendarEvent2 != null) {
                str = calendarEvent2.getCalendarId();
            } else {
                str = null;
            }
            if (!Intrinsics.areEqual(calendarId, str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    public final void mo114726e() {
        Context context = this.f80032i;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
        }
        ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) new UDDialogBuilder(context).title(R.string.Calendar_Common_SaveEvnet)).message(R.string.Calendar_Edit_CantSaveEvent)).addActionButton(R.id.ud_dialog_btn_primary, R.string.Calendar_Common_GotIt, (DialogInterface.OnClickListener) null)).show();
    }

    /* renamed from: i */
    private final void m119042i() {
        String str;
        OperationUtils eVar = OperationUtils.f80189a;
        CalendarEvent calendarEvent = this.f80029f;
        if (calendarEvent == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEvent");
        }
        if (eVar.mo114879a(calendarEvent, this.f80030g, this.f80031h)) {
            OperationUtils eVar2 = OperationUtils.f80189a;
            CalendarEvent calendarEvent2 = this.f80030g;
            if (calendarEvent2 != null) {
                str = calendarEvent2.getRRule();
            } else {
                str = null;
            }
            CalendarEvent calendarEvent3 = this.f80029f;
            if (calendarEvent3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mEvent");
            }
            if (eVar2.mo114881a(str, calendarEvent3.getRRule())) {
                mo114713a(CalendarEvent.Span.THIS_EVENT);
                return;
            }
            OperationUtils eVar3 = OperationUtils.f80189a;
            CalendarEvent calendarEvent4 = this.f80029f;
            if (calendarEvent4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mEvent");
            }
            if (eVar3.mo114884b(calendarEvent4, this.f80030g, this.f80031h, this.f80044v)) {
                mo114713a(CalendarEvent.Span.ALL_EVENTS);
                return;
            }
            EventCompareUtils cVar = EventCompareUtils.f80187a;
            CalendarEvent calendarEvent5 = this.f80030g;
            CalendarEvent calendarEvent6 = this.f80029f;
            if (calendarEvent6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mEvent");
            }
            if (cVar.mo114870e(calendarEvent5, calendarEvent6)) {
                m119043j();
            } else {
                m119047n();
            }
        } else {
            ISaveProcessListener dVar = this.f80033j;
            if (dVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mSaveProcessListener");
            }
            dVar.mo114641b();
        }
    }

    /* renamed from: j */
    private final void m119043j() {
        Context context = this.f80032i;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
        }
        ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) new UDDialogBuilder(context).title(R.string.Calendar_Edit_EditRecuringEvents)).message(R.string.Calendar_Edit_UpdateReservationForm)).addActionButton(R.id.ud_dialog_btn_primary, R.string.Calendar_Edit_Save, new DialogInterface$OnClickListenerC31578n(this))).addActionButton(R.id.ud_dialog_btn_secondary, R.string.Calendar_Common_Cancel, DialogInterface$OnClickListenerC31579o.f80072a)).cancelOnTouchOutside(false)).show();
    }

    /* renamed from: n */
    private final void m119047n() {
        Context context = this.f80032i;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
        }
        ((UDActionPanelBuilder) ((UDActionPanelBuilder) ((UDActionPanelBuilder) new UDActionPanelBuilder(context).mo90870a(CollectionsKt.listOf((Object[]) new String[]{C32634ae.m125182b(R.string.Calendar_Edit_UpdateThisEventOnly), C32634ae.m125182b(R.string.Calendar_Edit_UpdateFollowingEvent), C32634ae.m125182b(R.string.Calendar_Detail_UpdateAllEvent)}))).mo90869a(new C31576l(this))).addActionButton(R.id.ud_dialog_btn_cancel, R.string.Calendar_Common_Cancel, (DialogInterface.OnClickListener) null)).show();
    }

    /* renamed from: o */
    private final void m119048o() {
        Context context = this.f80032i;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
        }
        UDActionPanelBuilder aVar = new UDActionPanelBuilder(context);
        String[] strArr = new String[2];
        Context context2 = this.f80032i;
        if (context2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
        }
        strArr[0] = context2.getResources().getString(R.string.Calendar_Edit_UpdateThisEventOnly);
        Context context3 = this.f80032i;
        if (context3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
        }
        strArr[1] = context3.getResources().getString(R.string.Calendar_Detail_UpdateAllEvent);
        ((UDActionPanelBuilder) ((UDActionPanelBuilder) ((UDActionPanelBuilder) aVar.mo90870a(CollectionsKt.listOf((Object[]) strArr))).mo90869a(new C31575k(this))).addActionButton(R.id.ud_dialog_btn_cancel, R.string.Calendar_Common_Cancel, (DialogInterface.OnClickListener) null)).show();
    }

    /* renamed from: p */
    private final void m119049p() {
        Context context = this.f80032i;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
        }
        ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) new UDDialogBuilder(context).title(R.string.Calendar_Edit_ChangeCalendarRecurringEventDialogTitle)).message(R.string.Calendar_Edit_ChangeCalendarRecurringEventDialogContent)).titleLineCount(2)).addActionButton(R.id.ud_dialog_btn_primary, R.string.Calendar_Edit_ChangeCalendarRecurringEventDialogButton, new DialogInterface$OnClickListenerC31580p(this))).addActionButton(R.id.ud_dialog_btn_secondary, R.string.Calendar_Common_Cancel, (DialogInterface.OnClickListener) null)).messageTextSize(14)).messageTextColor(R.color.text_caption)).show();
    }

    /* renamed from: f */
    public final void mo114727f() {
        Context context = this.f80032i;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
        }
        ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) new UDDialogBuilder(context).title(R.string.Calendar_Alert_GroupNumLimitTitle)).message(R.string.Calendar_Alert_GroupNumLimitDes2)).addActionButton(R.id.ud_dialog_btn_primary, R.string.Calendar_Alert_GroupNumLimitButton, new DialogInterface$OnClickListenerC31574j(this))).titleLineCount(2)).messageGravity(3)).messageTextSize(14)).messageTextColor(R.color.text_caption)).show();
    }

    /* renamed from: k */
    private final void m119044k() {
        if (OperationUtils.f80189a.mo114891h(this.f80030g)) {
            OperationUtils eVar = OperationUtils.f80189a;
            CalendarEvent calendarEvent = this.f80029f;
            if (calendarEvent == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mEvent");
            }
            if (eVar.mo114887d(calendarEvent)) {
                OperationUtils eVar2 = OperationUtils.f80189a;
                CalendarEvent calendarEvent2 = this.f80029f;
                if (calendarEvent2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mEvent");
                }
                if (eVar2.mo114880a(calendarEvent2, this.f80030g, this.f80031h, this.f80044v)) {
                    m119048o();
                    return;
                }
            }
            m119035c(CalendarEvent.Span.NONE_SPAN);
            return;
        }
        OperationUtils eVar3 = OperationUtils.f80189a;
        CalendarEvent calendarEvent3 = this.f80029f;
        if (calendarEvent3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEvent");
        }
        if (eVar3.mo114887d(calendarEvent3)) {
            OperationUtils eVar4 = OperationUtils.f80189a;
            CalendarEvent calendarEvent4 = this.f80029f;
            if (calendarEvent4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mEvent");
            }
            if (OperationUtils.m119212a(eVar4, calendarEvent4, this.f80030g, this.f80031h, false, 8, (Object) null) && !OperationUtils.f80189a.mo114876a(this.f80024a, this.f80025b)) {
                EventCompareUtils cVar = EventCompareUtils.f80187a;
                CalendarEvent calendarEvent5 = this.f80030g;
                CalendarEvent calendarEvent6 = this.f80029f;
                if (calendarEvent6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mEvent");
                }
                if (!cVar.mo114869d(calendarEvent5, calendarEvent6) || !m119033b(this.f80026c)) {
                    m119029a(true);
                    return;
                } else {
                    m119029a(false);
                    return;
                }
            }
        }
        m119038d(CalendarEvent.Span.NONE_SPAN);
    }

    /* renamed from: d */
    public final void mo114725d() {
        List<CalendarEventAttendee> attendees;
        CalendarEventAttendee calendarEventAttendee = null;
        CalendarEvent calendarEvent = this.f80030g;
        if (!(calendarEvent == null || (attendees = calendarEvent.getAttendees()) == null)) {
            for (T t : attendees) {
                Intrinsics.checkExpressionValueIsNotNull(t, "it");
                String attendeeCalendarId = t.getAttendeeCalendarId();
                CalendarEvent calendarEvent2 = this.f80030g;
                if (Intrinsics.areEqual(attendeeCalendarId, calendarEvent2 != null ? calendarEvent2.getCalendarId() : null)) {
                    calendarEventAttendee = t;
                }
            }
        }
        if (calendarEventAttendee != null) {
            CalendarEvent calendarEvent3 = this.f80029f;
            if (calendarEvent3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mEvent");
            }
            List<CalendarEventAttendee> attendees2 = calendarEvent3.getAttendees();
            Intrinsics.checkExpressionValueIsNotNull(attendees2, "mEvent.attendees");
            for (T t2 : attendees2) {
                Intrinsics.checkExpressionValueIsNotNull(t2, "it");
                String attendeeCalendarId2 = t2.getAttendeeCalendarId();
                CalendarEvent calendarEvent4 = this.f80030g;
                if (Intrinsics.areEqual(attendeeCalendarId2, calendarEvent4 != null ? calendarEvent4.getCalendarId() : null)) {
                    return;
                }
            }
            if (calendarEventAttendee != null) {
                CalendarEventAttendee calendarEventAttendee2 = new CalendarEventAttendee(calendarEventAttendee);
                calendarEventAttendee2.setStatus(CalendarEventAttendee.Status.REMOVED);
                CalendarEvent calendarEvent5 = this.f80029f;
                if (calendarEvent5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mEvent");
                }
                calendarEvent5.getAttendees().add(calendarEventAttendee2);
            }
        }
    }

    /* renamed from: c */
    public final void mo114724c() {
        this.f80027d = false;
        boolean z = !TextUtils.isEmpty(this.f80037o);
        this.f80028e = CalendarEvent.Span.NONE_SPAN;
        NotificationProcess dVar = this.f80040r;
        Context context = this.f80032i;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
        }
        CallbackManager callbackManager = this.f80038p;
        if (callbackManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCallbackManager");
        }
        CalendarEvent calendarEvent = this.f80029f;
        if (calendarEvent == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEvent");
        }
        dVar.mo114699a(context, callbackManager, calendarEvent, this.f80030g, this.f80031h, EventOperationType.OP_CREATE_EVENT, CalendarEvent.Span.NONE_SPAN, z);
    }

    /* renamed from: a */
    public final void mo114709a() {
        CalendarEvent calendarEvent = this.f80030g;
        if (calendarEvent != null) {
            C31567c cVar = new C31567c(this);
            CallbackManager callbackManager = this.f80038p;
            if (callbackManager == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mCallbackManager");
            }
            UIGetDataCallback wrapAndAddGetDataCallback = callbackManager.wrapAndAddGetDataCallback(cVar);
            CalendarSDKService.Companion aVar = CalendarSDKService.f83473a;
            CalendarEvent calendarEvent2 = this.f80029f;
            if (calendarEvent2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mEvent");
            }
            List<? extends CalendarEventAttendee> list = this.f80045w;
            Intrinsics.checkExpressionValueIsNotNull(wrapAndAddGetDataCallback, "uiCallback");
            aVar.mo118929a(calendarEvent2, calendarEvent, list, wrapAndAddGetDataCallback);
            return;
        }
        mo114721b();
    }

    /* renamed from: b */
    public final void mo114723b(CalendarEvent.Span span) {
        m119038d(span);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016J,\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0016J,\u0010\u000e\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0016J<\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0016J<\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0016¨\u0006\u0014"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/edit/operation/SaveProcess$bindNotificationListener$1", "Lcom/ss/android/lark/calendar/impl/features/events/edit/listener/process/INotificationListener;", "onAfterAddAccount", "", "onAfterChooseCancel", "onCancelNotificationBtnChosen", "onJudgeNotificationBoxTypeFailed", "event", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEvent;", "instance", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventInstance;", "startTime", "", "endTime", "onNoNotificationBox", "onNotSendNotificationBtnChosen", "isShareToChat", "", "isTransferToChat", "onSendNotificationBtnChosen", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.c.e$b */
    public static final class C31566b implements INotificationListener {

        /* renamed from: a */
        final /* synthetic */ SaveProcess f80047a;

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.listener.process.INotificationListener
        /* renamed from: a */
        public void mo111617a() {
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.listener.process.INotificationListener
        /* renamed from: b */
        public void mo111620b(CalendarEvent calendarEvent, CalendarEventInstance calendarEventInstance, long j, long j2) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31566b(SaveProcess eVar) {
            this.f80047a = eVar;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.listener.process.INotificationListener
        /* renamed from: a */
        public void mo111618a(CalendarEvent calendarEvent, CalendarEventInstance calendarEventInstance, long j, long j2) {
            this.f80047a.mo114712a(CalendarEvent.NotificationType.DEFAULT_NOTIFICATION_TYPE, this.f80047a.f80028e, this.f80047a.f80027d, false);
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.listener.process.INotificationListener
        /* renamed from: a */
        public void mo111619a(boolean z, boolean z2, CalendarEvent calendarEvent, CalendarEventInstance calendarEventInstance, long j, long j2) {
            this.f80047a.mo114712a(CalendarEvent.NotificationType.NO_NOTIFICATION, this.f80047a.f80028e, this.f80047a.f80027d, z);
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.listener.process.INotificationListener
        /* renamed from: b */
        public void mo111621b(boolean z, boolean z2, CalendarEvent calendarEvent, CalendarEventInstance calendarEventInstance, long j, long j2) {
            this.f80047a.mo114712a(CalendarEvent.NotificationType.SEND_NOTIFICATION, this.f80047a.f80028e, this.f80047a.f80027d, z);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0017\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0002\u0010\t¨\u0006\n¸\u0006\u0000"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/edit/operation/SaveProcess$checkAttendeeAndSaveEvent$1$callback$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "suc", "(Ljava/lang/Boolean;)V", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.c.e$c */
    public static final class C31567c implements IGetDataCallback<Boolean> {

        /* renamed from: a */
        final /* synthetic */ SaveProcess f80048a;

        C31567c(SaveProcess eVar) {
            this.f80048a = eVar;
        }

        /* renamed from: a */
        public void onSuccess(Boolean bool) {
            if (Intrinsics.areEqual((Object) bool, (Object) true)) {
                this.f80048a.mo114727f();
            } else {
                this.f80048a.mo114721b();
            }
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Context a = C32634ae.m125179a();
            Intrinsics.checkExpressionValueIsNotNull(a, "ResUtil.getAppContext()");
            UDToast.show(a, (int) R.string.Calendar_Toast_FailedToSave);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/edit/operation/SaveProcess$showExceptionalEventEditAlert$1", "Lcom/larksuite/component/universe_design/dialog/UDListDialogController$OnItemClickListener;", "onItemClick", "", "index", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.c.e$k */
    public static final class C31575k implements UDListDialogController.OnItemClickListener {

        /* renamed from: a */
        final /* synthetic */ SaveProcess f80066a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31575k(SaveProcess eVar) {
            this.f80066a = eVar;
        }

        @Override // com.larksuite.component.universe_design.dialog.UDListDialogController.OnItemClickListener
        public void onItemClick(int i) {
            if (i == 0) {
                Log.m165389i("SaveProcess", C32673y.m125369a("saveExpThis"));
                this.f80066a.mo114713a(CalendarEvent.Span.THIS_EVENT);
            } else if (i == 1) {
                Log.m165389i("SaveProcess", C32673y.m125369a("saveExpAll"));
                this.f80066a.mo114713a(CalendarEvent.Span.ALL_EVENTS);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/edit/operation/SaveProcess$showRepeatEventEditAlert$1", "Lcom/larksuite/component/universe_design/dialog/UDListDialogController$OnItemClickListener;", "onItemClick", "", "index", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.c.e$l */
    public static final class C31576l implements UDListDialogController.OnItemClickListener {

        /* renamed from: a */
        final /* synthetic */ SaveProcess f80067a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31576l(SaveProcess eVar) {
            this.f80067a = eVar;
        }

        @Override // com.larksuite.component.universe_design.dialog.UDListDialogController.OnItemClickListener
        public void onItemClick(int i) {
            if (i == 0) {
                Log.m165389i("SaveProcess", C32673y.m125369a("saveThis"));
                this.f80067a.mo114713a(CalendarEvent.Span.THIS_EVENT);
            } else if (i == 1) {
                Log.m165389i("SaveProcess", C32673y.m125369a("saveFollow"));
                if (TextUtils.isEmpty(SaveProcess.m119023a(this.f80067a).getRRule()) || !Intrinsics.areEqual(SaveProcess.m119023a(this.f80067a).getServerId(), "0") || SaveProcess.m119023a(this.f80067a).getDirtyType() == DirtyType.NONE_DIRTY_TYPE) {
                    this.f80067a.mo114713a(CalendarEvent.Span.FUTURE_EVENTS);
                } else {
                    this.f80067a.mo114726e();
                }
            } else if (i == 2) {
                Log.m165389i("SaveProcess", C32673y.m125369a("saveAll"));
                this.f80067a.mo114713a(CalendarEvent.Span.ALL_EVENTS);
            }
        }
    }

    /* renamed from: a */
    public final void mo114711a(ISaveProcessListener dVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "saveProcessListener");
        this.f80033j = dVar;
    }

    /* renamed from: a */
    public static final /* synthetic */ CalendarEvent m119023a(SaveProcess eVar) {
        CalendarEvent calendarEvent = eVar.f80029f;
        if (calendarEvent == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEvent");
        }
        return calendarEvent;
    }

    /* renamed from: b */
    public static final /* synthetic */ ISaveProcessListener m119031b(SaveProcess eVar) {
        ISaveProcessListener dVar = eVar.f80033j;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSaveProcessListener");
        }
        return dVar;
    }

    /* renamed from: c */
    public static final /* synthetic */ Context m119034c(SaveProcess eVar) {
        Context context = eVar.f80032i;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
        }
        return context;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/edit/operation/SaveProcess$sendSaveEditEventRequest$saveEventCallback$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEvent;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "calendarEvent", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.c.e$g */
    public static final class C31571g implements IGetDataCallback<CalendarEvent> {

        /* renamed from: a */
        final /* synthetic */ SaveProcess f80053a;

        /* renamed from: b */
        final /* synthetic */ String f80054b;

        /* renamed from: c */
        final /* synthetic */ String f80055c;

        /* renamed from: d */
        final /* synthetic */ CalendarEvent.Span f80056d;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165383e("SaveProcess", C32673y.m125370a(this.f80054b, this.f80055c, errorResult));
            this.f80053a.mo114722b(errorResult.getErrorCode());
        }

        /* renamed from: a */
        public void onSuccess(CalendarEvent calendarEvent) {
            String str;
            Intrinsics.checkParameterIsNotNull(calendarEvent, "calendarEvent");
            if (calendarEvent.getKey() == null) {
                str = "null";
            } else {
                str = calendarEvent.getKey();
            }
            Log.m165389i("SaveProcess", C32673y.m125373a(this.f80054b, this.f80055c, "key", str));
            UpdateTimeType updateTimeType = UpdateTimeType.UPDATE_TIME_BY_EVENT;
            if (this.f80056d == CalendarEvent.Span.ALL_EVENTS && this.f80053a.f80031h != null) {
                updateTimeType = UpdateTimeType.UPDATE_TIME_BY_DIFF;
            }
            SaveProcess eVar = this.f80053a;
            eVar.mo114716a(calendarEvent, updateTimeType, eVar.f80034k, this.f80053a.f80035l);
            SaveProcess eVar2 = this.f80053a;
            String calendarId = calendarEvent.getCalendarId();
            Intrinsics.checkExpressionValueIsNotNull(calendarId, "calendarEvent.calendarId");
            SaveProcess.m119024a(eVar2, calendarId, false, 2, null);
            this.f80053a.mo114717a(calendarEvent, true);
        }

        C31571g(SaveProcess eVar, String str, String str2, CalendarEvent.Span span) {
            this.f80053a = eVar;
            this.f80054b = str;
            this.f80055c = str2;
            this.f80056d = span;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/edit/operation/SaveProcess$sendSaveEditInvitationEvent$saveEventCallback$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEvent;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "calendarEvent", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.c.e$h */
    public static final class C31572h implements IGetDataCallback<CalendarEvent> {

        /* renamed from: a */
        final /* synthetic */ SaveProcess f80057a;

        /* renamed from: b */
        final /* synthetic */ String f80058b;

        /* renamed from: c */
        final /* synthetic */ String f80059c;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165383e("SaveProcess", C32673y.m125370a(this.f80058b, this.f80059c, errorResult));
            this.f80057a.mo114722b(errorResult.getErrorCode());
        }

        /* renamed from: a */
        public void onSuccess(CalendarEvent calendarEvent) {
            String str;
            if (calendarEvent == null) {
                str = "null";
            } else {
                str = calendarEvent.getKey();
            }
            Log.m165389i("SaveProcess", C32673y.m125373a(this.f80058b, this.f80059c, "key", str));
            if (calendarEvent != null) {
                this.f80057a.mo114716a(calendarEvent, UpdateTimeType.UPDATE_TIME_BY_DIFF, 0, 0);
                SaveProcess eVar = this.f80057a;
                String calendarId = calendarEvent.getCalendarId();
                Intrinsics.checkExpressionValueIsNotNull(calendarId, "it.calendarId");
                SaveProcess.m119024a(eVar, calendarId, false, 2, null);
            }
        }

        C31572h(SaveProcess eVar, String str, String str2) {
            this.f80057a = eVar;
            this.f80058b = str;
            this.f80059c = str2;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0017\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/edit/operation/SaveProcess$updateCalendarVisibility$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "aBoolean", "(Ljava/lang/Boolean;)V", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.c.e$q */
    public static final class C31582q implements IGetDataCallback<Boolean> {

        /* renamed from: a */
        final /* synthetic */ String f80074a;

        /* renamed from: b */
        final /* synthetic */ String f80075b;

        /* renamed from: a */
        public void onSuccess(Boolean bool) {
            Log.m165389i("SaveProcess", C32673y.m125373a(this.f80074a, this.f80075b, new String[0]));
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165383e("SaveProcess", C32673y.m125370a(this.f80074a, this.f80075b, errorResult));
        }

        C31582q(String str, String str2) {
            this.f80074a = str;
            this.f80075b = str2;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/edit/operation/SaveProcess$createEventRequest$saveEventCallback$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEvent;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "calendarEvent", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.c.e$d */
    public static final class C31568d implements IGetDataCallback<CalendarEvent> {

        /* renamed from: a */
        final /* synthetic */ SaveProcess f80049a;

        /* renamed from: b */
        final /* synthetic */ String f80050b;

        /* renamed from: c */
        final /* synthetic */ String f80051c;

        /* renamed from: d */
        final /* synthetic */ long f80052d;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            AppreciableHitPoint.f83321a.mo118692h(errorResult);
            Log.m165383e("SaveProcess", C32673y.m125370a(this.f80050b, this.f80051c, errorResult));
            this.f80049a.mo114710a(errorResult.getErrorCode());
        }

        /* renamed from: a */
        public void onSuccess(CalendarEvent calendarEvent) {
            String str;
            String str2;
            AppreciableHitPoint.f83321a.mo118676F();
            if (calendarEvent == null) {
                str = "null";
            } else {
                str = calendarEvent.getKey();
            }
            Log.m165389i("SaveProcess", C32673y.m125373a(this.f80050b, this.f80051c, "key", str));
            this.f80049a.mo114715a(calendarEvent);
            GeneralHitPoint.m124185a(calendarEvent);
            SaveProcess eVar = this.f80049a;
            if (calendarEvent == null || (str2 = calendarEvent.getCalendarId()) == null) {
                str2 = "";
            }
            eVar.mo114718a(str2, true);
            this.f80049a.mo114717a(calendarEvent, false);
            Log.m165389i("Lark", "saveEvent total time:" + (System.currentTimeMillis() - this.f80052d) + "ms");
        }

        C31568d(SaveProcess eVar, String str, String str2, long j) {
            this.f80049a = eVar;
            this.f80050b = str;
            this.f80051c = str2;
            this.f80052d = j;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/edit/operation/SaveProcess$sendSaveSwitchCalendarEvent$saveEventCallback$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEvent;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "calendarEvent", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.c.e$i */
    public static final class C31573i implements IGetDataCallback<CalendarEvent> {

        /* renamed from: a */
        final /* synthetic */ SaveProcess f80060a;

        /* renamed from: b */
        final /* synthetic */ String f80061b;

        /* renamed from: c */
        final /* synthetic */ String f80062c;

        /* renamed from: d */
        final /* synthetic */ CalendarEvent.Span f80063d;

        /* renamed from: e */
        final /* synthetic */ CalendarEvent.NotificationType f80064e;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165383e("SaveProcess", C32673y.m125370a(this.f80061b, this.f80062c, errorResult));
            ISaveProcessListener.C31540a.m118898a(SaveProcess.m119031b(this.f80060a), false, null, null, null, 14, null);
        }

        /* renamed from: a */
        public void onSuccess(CalendarEvent calendarEvent) {
            Intrinsics.checkParameterIsNotNull(calendarEvent, "calendarEvent");
            String str = this.f80061b;
            String str2 = this.f80062c;
            String[] strArr = new String[2];
            strArr[0] = "key";
            String key = calendarEvent.getKey();
            if (key == null) {
                key = "null";
            }
            strArr[1] = key;
            Log.m165389i("SaveProcess", C32673y.m125373a(str, str2, strArr));
            this.f80060a.f80030g = calendarEvent;
            CalendarEvent a = SaveProcess.m119023a(this.f80060a);
            a.setId(calendarEvent.getId());
            a.setCalendarId(calendarEvent.getCalendarId());
            a.setServerId(calendarEvent.getServerId());
            a.setOrganizerCalendarId(calendarEvent.getOrganizerCalendarId());
            CalendarEventInstance calendarEventInstance = this.f80060a.f80031h;
            if (calendarEventInstance != null) {
                calendarEventInstance.setId(SaveProcess.m119023a(this.f80060a).getId());
                calendarEventInstance.setCalendarId(SaveProcess.m119023a(this.f80060a).getCalendarId());
            }
            SaveProcess.m119031b(this.f80060a).mo114640a(true, SaveProcess.m119023a(this.f80060a), this.f80060a.f80030g, this.f80060a.f80031h);
            SaveProcess eVar = this.f80060a;
            String calendarId = SaveProcess.m119023a(eVar).getCalendarId();
            Intrinsics.checkExpressionValueIsNotNull(calendarId, "mEvent.calendarId");
            SaveProcess.m119024a(eVar, calendarId, false, 2, null);
            this.f80060a.mo114717a(calendarEvent, true);
            this.f80060a.mo114725d();
            this.f80060a.mo114714a(this.f80063d, this.f80064e);
        }

        C31573i(SaveProcess eVar, String str, String str2, CalendarEvent.Span span, CalendarEvent.NotificationType notificationType) {
            this.f80060a = eVar;
            this.f80061b = str;
            this.f80062c = str2;
            this.f80063d = span;
            this.f80064e = notificationType;
        }
    }

    /* renamed from: c */
    private final void m119035c(CalendarEvent.Span span) {
        this.f80027d = false;
        this.f80028e = span;
        m119026a(span, true);
        NotificationProcess dVar = this.f80040r;
        Context context = this.f80032i;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
        }
        CallbackManager callbackManager = this.f80038p;
        if (callbackManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCallbackManager");
        }
        CalendarEvent calendarEvent = this.f80029f;
        if (calendarEvent == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEvent");
        }
        dVar.mo114699a(context, callbackManager, calendarEvent, this.f80030g, this.f80031h, EventOperationType.OP_EDIT_EVENT, span, false);
    }

    /* renamed from: d */
    private final void m119038d(CalendarEvent.Span span) {
        this.f80027d = true;
        this.f80028e = span;
        NotificationProcess dVar = this.f80040r;
        Context context = this.f80032i;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
        }
        CallbackManager callbackManager = this.f80038p;
        if (callbackManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCallbackManager");
        }
        CalendarEvent calendarEvent = this.f80029f;
        if (calendarEvent == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEvent");
        }
        dVar.mo114699a(context, callbackManager, calendarEvent, this.f80030g, this.f80031h, EventOperationType.OP_EDIT_EVENT, span, false);
    }

    /* renamed from: b */
    public final void mo114722b(int i) {
        ISaveProcessListener dVar = this.f80033j;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSaveProcessListener");
        }
        dVar.mo114642b(i);
    }

    public SaveProcess(CalendarEvent calendarEvent) {
        C32533b a = C32533b.m124620a();
        Intrinsics.checkExpressionValueIsNotNull(a, "CalendarEventService.getInstance()");
        this.f80042t = a;
        this.f80039q.mo114694a(new IExceptionEventListener(this) {
            /* class com.ss.android.lark.calendar.impl.features.events.edit.operation.SaveProcess.C315651 */

            /* renamed from: a */
            final /* synthetic */ SaveProcess f80046a;

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f80046a = r1;
            }

            @Override // com.ss.android.lark.calendar.impl.features.events.edit.listener.process.IExceptionEventListener
            /* renamed from: a */
            public void mo114634a(int i) {
                this.f80046a.f80024a = i;
            }

            @Override // com.ss.android.lark.calendar.impl.features.events.edit.listener.process.IExceptionEventListener
            /* renamed from: a */
            public void mo114635a(CalendarEvent calendarEvent) {
                boolean z;
                this.f80046a.f80026c = calendarEvent;
                SaveProcess eVar = this.f80046a;
                if (calendarEvent != null) {
                    z = true;
                } else {
                    z = false;
                }
                eVar.f80025b = z;
            }
        });
        this.f80039q.mo114695a(calendarEvent);
        m119045l();
    }

    /* renamed from: b */
    private final boolean m119033b(CalendarEvent calendarEvent) {
        String str;
        if (this.f80026c == null) {
            return false;
        }
        String str2 = null;
        if (calendarEvent != null) {
            str = calendarEvent.getRRule();
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (calendarEvent != null) {
            str2 = calendarEvent.getRRule();
        }
        CalendarDate a = C32632ac.m125170a(str2);
        ISaveProcessListener dVar = this.f80033j;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSaveProcessListener");
        }
        CalendarDate d = dVar.mo114644d();
        if (d == null) {
            return false;
        }
        if (a != null && a.getJulianDay() <= d.getJulianDay()) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    private final void m119037c(CalendarEvent calendarEvent) {
        List<CalendarEventAttendee> attendees = calendarEvent.getAttendees();
        if (attendees != null) {
            for (T t : attendees) {
                Intrinsics.checkExpressionValueIsNotNull(t, "it");
                t.setGroupMembers(null);
            }
        }
    }

    /* renamed from: e */
    private final void m119039e(CalendarEvent.Span span) {
        UpdateTimeType updateTimeType;
        OperationUtils eVar = OperationUtils.f80189a;
        CalendarEvent calendarEvent = this.f80030g;
        CalendarEvent calendarEvent2 = this.f80029f;
        if (calendarEvent2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEvent");
        }
        eVar.mo114885c(calendarEvent, calendarEvent2, this.f80031h);
        m119026a(span, false);
        OperationUtils eVar2 = OperationUtils.f80189a;
        CalendarEvent.NotificationType notificationType = CalendarEvent.NotificationType.NO_NOTIFICATION;
        boolean z = this.f80036n;
        CalendarEvent calendarEvent3 = this.f80029f;
        if (calendarEvent3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEvent");
        }
        eVar2.mo114875a(notificationType, "full_calendar_editor", z, calendarEvent3, this.f80030g, "", "");
        C31927d a = C31927d.m121459a();
        CalendarEvent calendarEvent4 = this.f80029f;
        if (calendarEvent4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEvent");
        }
        CalendarEvent a2 = a.mo116542a(calendarEvent4, this.f80030g, this.f80031h, span);
        if (a2 != null) {
            CalendarEvent calendarEvent5 = this.f80029f;
            if (calendarEvent5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mEvent");
            }
            a2.setEventColor(calendarEvent5.getEventColor());
            UpdateTimeType updateTimeType2 = UpdateTimeType.UPDATE_TIME_BY_EVENT;
            if (span != CalendarEvent.Span.ALL_EVENTS || this.f80031h == null) {
                updateTimeType = updateTimeType2;
            } else {
                updateTimeType = UpdateTimeType.UPDATE_TIME_BY_DIFF;
            }
            mo114716a(a2, updateTimeType, this.f80034k, this.f80035l);
            String calendarId = a2.getCalendarId();
            Intrinsics.checkExpressionValueIsNotNull(calendarId, "resultEvent.calendarId");
            m119024a(this, calendarId, false, 2, null);
            return;
        }
        mo114722b(0);
    }

    /* renamed from: a */
    private final void m119028a(String str) {
        if (C30022a.f74883b.mo112703k()) {
            String valueOf = String.valueOf(new Date().getTime());
            Log.m165389i("SaveProcess", C32673y.m125376b(valueOf, "updateCalendar", "calendar_id", str, "visibility", String.valueOf(true)));
            C30076a.m111290a().mo108425a(str, true, (IGetDataCallback<Boolean>) new C31582q(valueOf, "updateCalendar"));
        }
    }

    /* renamed from: a */
    private final void m119029a(boolean z) {
        ArrayList arrayList = new ArrayList();
        SpanMenuItem.Builder a = new SpanMenuItem.Builder().mo115308a(CalendarEvent.Span.THIS_EVENT);
        Context context = this.f80032i;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
        }
        String string = context.getResources().getString(R.string.Calendar_Edit_UpdateThisEventOnly);
        Intrinsics.checkExpressionValueIsNotNull(string, "mContext.resources.getSt…Edit_UpdateThisEventOnly)");
        arrayList.add(a.mo115309a(string).mo115324i());
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        T t = (T) "";
        objectRef.element = t;
        if (z) {
            SpanMenuItem.Builder a2 = new SpanMenuItem.Builder().mo115308a(CalendarEvent.Span.ALL_EVENTS);
            Context context2 = this.f80032i;
            if (context2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mContext");
            }
            String string2 = context2.getResources().getString(R.string.Calendar_Detail_UpdateAllEvent);
            Intrinsics.checkExpressionValueIsNotNull(string2, "mContext.resources.getSt…ar_Detail_UpdateAllEvent)");
            arrayList.add(a2.mo115309a(string2).mo115324i());
        } else {
            SpanMenuItem.Builder a3 = new SpanMenuItem.Builder().mo115308a(CalendarEvent.Span.ALL_EVENTS);
            Context context3 = this.f80032i;
            if (context3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mContext");
            }
            String string3 = context3.getResources().getString(R.string.Calendar_Detail_UpdateAllEvent);
            Intrinsics.checkExpressionValueIsNotNull(string3, "mContext.resources.getSt…ar_Detail_UpdateAllEvent)");
            arrayList.add(a3.mo115309a(string3).mo115313b(false).mo115316c(true).mo115324i());
            ISaveProcessListener dVar = this.f80033j;
            if (dVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mSaveProcessListener");
            }
            String h = dVar.mo114648h();
            if (h != null) {
                t = h;
            }
            objectRef.element = t;
        }
        Context context4 = this.f80032i;
        if (context4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
        }
        ((SpanListDialogBuilder) new SpanListDialogBuilder(context4).mo116008a(arrayList).mo116007a(new C31577m(this, z, objectRef)).addActionButton(R.id.ud_dialog_btn_cancel, R.string.Calendar_Common_Cancel, (DialogInterface.OnClickListener) null)).show();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.c.e$o */
    public static final class DialogInterface$OnClickListenerC31579o implements DialogInterface.OnClickListener {

        /* renamed from: a */
        public static final DialogInterface$OnClickListenerC31579o f80072a = new DialogInterface$OnClickListenerC31579o();

        DialogInterface$OnClickListenerC31579o() {
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.c.e$j */
    public static final class DialogInterface$OnClickListenerC31574j implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SaveProcess f80065a;

        DialogInterface$OnClickListenerC31574j(SaveProcess eVar) {
            this.f80065a = eVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f80065a.mo114721b();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.c.e$n */
    public static final class DialogInterface$OnClickListenerC31578n implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SaveProcess f80071a;

        DialogInterface$OnClickListenerC31578n(SaveProcess eVar) {
            this.f80071a = eVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f80071a.mo114713a(CalendarEvent.Span.ALL_EVENTS);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.c.e$p */
    public static final class DialogInterface$OnClickListenerC31580p implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SaveProcess f80073a;

        DialogInterface$OnClickListenerC31580p(SaveProcess eVar) {
            this.f80073a = eVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f80073a.mo114719a(new Function0<Unit>(this) {
                /* class com.ss.android.lark.calendar.impl.features.events.edit.operation.SaveProcess.DialogInterface$OnClickListenerC31580p.C315811 */
                final /* synthetic */ DialogInterface$OnClickListenerC31580p this$0;

                {
                    this.this$0 = r1;
                }

                @Override // kotlin.jvm.functions.Function0
                public final void invoke() {
                    this.this$0.f80073a.mo114709a();
                }
            });
        }
    }

    /* renamed from: a */
    private final void m119026a(CalendarEvent.Span span, boolean z) {
        CalendarEventInstance calendarEventInstance;
        CalendarEvent calendarEvent;
        if (span == CalendarEvent.Span.ALL_EVENTS && (calendarEventInstance = this.f80031h) != null) {
            CalendarEvent calendarEvent2 = this.f80029f;
            if (calendarEvent2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mEvent");
            }
            this.f80034k = calendarEvent2.getStartTime() - calendarEventInstance.getStartTime();
            CalendarEvent calendarEvent3 = this.f80029f;
            if (calendarEvent3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mEvent");
            }
            this.f80035l = calendarEvent3.getEndTime() - calendarEventInstance.getEndTime();
            if (z && (calendarEvent = this.f80030g) != null) {
                CalendarEvent calendarEvent4 = this.f80029f;
                if (calendarEvent4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mEvent");
                }
                calendarEvent4.setStartTime(calendarEvent.getStartTime() + this.f80034k);
                CalendarEvent calendarEvent5 = this.f80029f;
                if (calendarEvent5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mEvent");
                }
                calendarEvent5.setEndTime(calendarEvent.getEndTime() + this.f80035l);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/edit/operation/SaveProcess$showRepeatInvitationEditAlert$1", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/widget/dialog/SpanListDialogController$OnItemClickListener;", "onItemClick", "", "span", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEvent$Span;", "isChecked", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.c.e$m */
    public static final class C31577m implements SpanListDialogController.OnItemClickListener {

        /* renamed from: a */
        final /* synthetic */ SaveProcess f80068a;

        /* renamed from: b */
        final /* synthetic */ boolean f80069b;

        /* renamed from: c */
        final /* synthetic */ Ref.ObjectRef f80070c;

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.dialog.SpanListDialogController.OnItemClickListener
        /* renamed from: a */
        public void mo109576a(CalendarEvent.Span span, boolean z) {
            if (span != null) {
                int i = C31583f.f80078c[span.ordinal()];
                if (i == 1) {
                    Log.m165389i("SaveProcess", C32673y.m125369a("saveInvThis"));
                    this.f80068a.mo114723b(CalendarEvent.Span.THIS_EVENT);
                } else if (i == 2) {
                    if (this.f80069b) {
                        Log.m165389i("SaveProcess", C32673y.m125369a("saveInvAll"));
                        this.f80068a.mo114723b(CalendarEvent.Span.ALL_EVENTS);
                        return;
                    }
                    ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) new UDDialogBuilder(SaveProcess.m119034c(this.f80068a)).title(R.string.Calendar_Common_Notice)).message(this.f80070c.element)).addActionButton(R.id.ud_dialog_btn_primary, R.string.Lark_Legacy_DialogOk, (DialogInterface.OnClickListener) null)).messageTextSize(14)).messageTextColor(R.color.text_caption)).cancelOnTouchOutside(false)).cancelable(false)).show();
                }
            }
        }

        C31577m(SaveProcess eVar, boolean z, Ref.ObjectRef objectRef) {
            this.f80068a = eVar;
            this.f80069b = z;
            this.f80070c = objectRef;
        }
    }

    /* renamed from: a */
    private final void m119025a(CalendarEvent.NotificationType notificationType, boolean z) {
        String str;
        if (C30022a.f74883b.mo112703k()) {
            CalendarEvent calendarEvent = this.f80029f;
            if (calendarEvent == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mEvent");
            }
            String calendarId = calendarEvent.getCalendarId();
            Intrinsics.checkExpressionValueIsNotNull(calendarId, "mEvent.calendarId");
            m119028a(calendarId);
        }
        long currentTimeMillis = System.currentTimeMillis();
        CalendarEvent calendarEvent2 = this.f80029f;
        if (calendarEvent2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEvent");
        }
        calendarEvent2.setNotificationType(notificationType);
        String valueOf = String.valueOf(new Date().getTime());
        Log.m165389i("SaveProcess", C32673y.m125376b(valueOf, "saveNewEvent", new String[0]));
        AppreciableHitPoint.f83321a.mo118675E();
        C31568d dVar = new C31568d(this, valueOf, "saveNewEvent", currentTimeMillis);
        if (z) {
            str = this.f80037o;
        } else {
            str = "";
        }
        CallbackManager callbackManager = this.f80038p;
        if (callbackManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCallbackManager");
        }
        UIGetDataCallback wrapAndAddGetDataCallback = callbackManager.wrapAndAddGetDataCallback(dVar);
        CalendarEvent calendarEvent3 = this.f80029f;
        if (calendarEvent3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEvent");
        }
        CalendarEvent.Span span = CalendarEvent.Span.NONE_SPAN;
        Intrinsics.checkExpressionValueIsNotNull(wrapAndAddGetDataCallback, "uiCallback");
        m119027a(calendarEvent3, null, null, span, str, wrapAndAddGetDataCallback);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001f, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual(r0, r2) != false) goto L_0x0021;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m119032b(com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent.Span r11, com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent.NotificationType r12) {
        /*
        // Method dump skipped, instructions count: 205
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.calendar.impl.features.events.edit.operation.SaveProcess.m119032b(com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent$Span, com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent$NotificationType):void");
    }

    /* renamed from: c */
    private final void m119036c(CalendarEvent.Span span, CalendarEvent.NotificationType notificationType) {
        CalendarEventInstance calendarEventInstance;
        CalendarEvent calendarEvent = this.f80029f;
        if (calendarEvent == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEvent");
        }
        calendarEvent.setNotificationType(notificationType);
        String valueOf = String.valueOf(new Date().getTime());
        if (span == CalendarEvent.Span.THIS_EVENT && (calendarEventInstance = this.f80031h) != null) {
            CalendarEvent calendarEvent2 = this.f80029f;
            if (calendarEvent2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mEvent");
            }
            calendarEvent2.setStartTime(calendarEventInstance.getStartTime());
            CalendarEvent calendarEvent3 = this.f80029f;
            if (calendarEvent3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mEvent");
            }
            calendarEvent3.setStartTimeZone(calendarEventInstance.getStartTimezone());
            CalendarEvent calendarEvent4 = this.f80029f;
            if (calendarEvent4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mEvent");
            }
            calendarEvent4.setEndTime(calendarEventInstance.getEndTime());
            CalendarEvent calendarEvent5 = this.f80029f;
            if (calendarEvent5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mEvent");
            }
            calendarEvent5.setEndTimeZone(calendarEventInstance.getEndTimezone());
        }
        C31572h hVar = new C31572h(this, valueOf, "saveEditInvitation");
        String[] strArr = new String[4];
        strArr[0] = "edit_item";
        EventCompareUtils cVar = EventCompareUtils.f80187a;
        CalendarEvent calendarEvent6 = this.f80030g;
        CalendarEvent calendarEvent7 = this.f80029f;
        if (calendarEvent7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEvent");
        }
        strArr[1] = cVar.mo114862a(calendarEvent6, calendarEvent7, this.f80031h);
        strArr[2] = "span";
        strArr[3] = span.toString() + "";
        Log.m165389i("SaveProcess", C32673y.m125376b(valueOf, "saveEditInvitation", strArr));
        CallbackManager callbackManager = this.f80038p;
        if (callbackManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCallbackManager");
        }
        UIGetDataCallback wrapAndAddGetDataCallback = callbackManager.wrapAndAddGetDataCallback(hVar);
        CalendarEvent calendarEvent8 = this.f80029f;
        if (calendarEvent8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEvent");
        }
        CalendarEvent calendarEvent9 = this.f80030g;
        CalendarEventInstance calendarEventInstance2 = this.f80031h;
        Intrinsics.checkExpressionValueIsNotNull(wrapAndAddGetDataCallback, "uiCallback");
        m119027a(calendarEvent8, calendarEvent9, calendarEventInstance2, span, "", wrapAndAddGetDataCallback);
    }

    /* renamed from: a */
    private final boolean m119030a(CalendarEvent calendarEvent, CalendarEvent calendarEvent2) {
        if ((calendarEvent == null || !OperationUtils.f80189a.mo114888e(calendarEvent)) && !OperationUtils.f80189a.mo114888e(calendarEvent2)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    static /* synthetic */ void m119024a(SaveProcess eVar, String str, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        eVar.mo114718a(str, z);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.ss.android.lark.calendar.impl.rustadapter.c.f */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    private final void m119027a(CalendarEvent calendarEvent, CalendarEvent calendarEvent2, CalendarEventInstance calendarEventInstance, CalendarEvent.Span span, String str, IGetDataCallback<CalendarEvent> iGetDataCallback) {
        CalendarEvent calendarEvent3 = new CalendarEvent(calendarEvent);
        m119037c(calendarEvent3);
        if (calendarEvent2 != null) {
            m119037c(calendarEvent2);
        }
        this.f80042t.mo118853a(calendarEvent3, calendarEvent2, calendarEventInstance, span, str, this.f80043u, this.f80045w, iGetDataCallback);
    }
}
