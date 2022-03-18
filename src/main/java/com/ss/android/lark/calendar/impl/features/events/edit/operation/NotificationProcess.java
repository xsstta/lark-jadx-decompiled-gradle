package com.ss.android.lark.calendar.impl.features.events.edit.operation;

import android.content.Context;
import android.content.DialogInterface;
import com.larksuite.component.universe_design.dialog.UDDialogBuilder;
import com.larksuite.framework.callback.CallbackManager;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.events.edit.listener.process.INotificationListener;
import com.ss.android.lark.calendar.impl.features.events.edit.widget.NotifyAttendeeDialog;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event.CalendarHitPoint;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event.GeneralHitPoint;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event2.CalendarEventHitPoint;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttendee;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventInstance;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.EventOperationType;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.NotificationBoxType;
import com.ss.android.lark.calendar.impl.rustadapter.p1575c.C32533b;
import com.ss.android.lark.calendar.impl.utils.C32673y;
import com.ss.android.lark.log.Log;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 +2\u00020\u0001:\u0001+B\u0005¢\u0006\u0002\u0010\u0002Jj\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001cJJ\u0010\u001e\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018JJ\u0010\u001f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001cJ\u000e\u0010 \u001a\u00020\t2\u0006\u0010!\u001a\u00020\u0007J\u0016\u0010\"\u001a\u00020\t2\u000e\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004J2\u0010$\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002Jb\u0010%\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010&\u001a\u00020'2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010(\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002Jb\u0010)\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010&\u001a\u00020'2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010(\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002J:\u0010*\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010&\u001a\u00020'2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002R\u0016\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X.¢\u0006\u0002\n\u0000¨\u0006,"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/operation/NotificationProcess;", "", "()V", "mAllOriginalAttendees", "", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventAttendee;", "mNotificationListener", "Lcom/ss/android/lark/calendar/impl/features/events/edit/listener/process/INotificationListener;", "judgeNotificationBoxType", "", "context", "Landroid/content/Context;", "callbackManager", "Lcom/larksuite/framework/callback/CallbackManager;", "event", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEvent;", "originalEvent", "instance", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventInstance;", "optType", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/EventOperationType;", "span", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEvent$Span;", "isFromView", "", "isShowSendCard", "isTransferToChat", "viewStartTime", "", "viewEndTime", "judgeNotificationBoxTypeForEdit", "judgeNotificationBoxTypeForView", "setNotificationListener", "notificationListener", "setOriginalAttendees", "attendees", "showEnterMeetingBox", "showNotificationBox", "boxType", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/NotificationBoxType;", "isTransferToChatInMenu", "showNotifyAttendeeDialog", "showShareToChatBox", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.c.d */
public final class NotificationProcess {

    /* renamed from: b */
    public static final Companion f79989b = new Companion(null);

    /* renamed from: a */
    public INotificationListener f79990a;

    /* renamed from: c */
    private List<? extends CalendarEventAttendee> f79991c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/operation/NotificationProcess$Companion;", "", "()V", "TAG", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.c.d$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/edit/operation/NotificationProcess$showShareToChatBox$notifyDialog$1", "Lcom/ss/android/lark/calendar/impl/features/events/edit/widget/NotifyAttendeeDialog$Delegate;", "cancelChanges", "", "notSendNotification", "isShareToChat", "", "isTransferToChatInNotify", "sendNotification", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.c.d$e */
    public static final class C31564e implements NotifyAttendeeDialog.Delegate {

        /* renamed from: a */
        final /* synthetic */ NotificationProcess f80018a;

        /* renamed from: b */
        final /* synthetic */ CalendarEvent f80019b;

        /* renamed from: c */
        final /* synthetic */ CalendarEventInstance f80020c;

        /* renamed from: d */
        final /* synthetic */ long f80021d;

        /* renamed from: e */
        final /* synthetic */ long f80022e;

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.widget.NotifyAttendeeDialog.Delegate
        /* renamed from: a */
        public void mo114706a() {
            GeneralHitPoint.m124223a(false, "cancel", false);
            NotificationProcess.m119006a(this.f80018a).mo111617a();
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.widget.NotifyAttendeeDialog.Delegate
        /* renamed from: a */
        public void mo114707a(boolean z, boolean z2) {
            GeneralHitPoint.m124223a(false, "send", true);
            NotificationProcess.m119006a(this.f80018a).mo111621b(true, false, this.f80019b, this.f80020c, this.f80021d, this.f80022e);
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.widget.NotifyAttendeeDialog.Delegate
        /* renamed from: b */
        public void mo114708b(boolean z, boolean z2) {
            GeneralHitPoint.m124223a(false, "unsend", false);
            NotificationProcess.m119006a(this.f80018a).mo111619a(false, false, this.f80019b, this.f80020c, this.f80021d, this.f80022e);
        }

        C31564e(NotificationProcess dVar, CalendarEvent calendarEvent, CalendarEventInstance calendarEventInstance, long j, long j2) {
            this.f80018a = dVar;
            this.f80019b = calendarEvent;
            this.f80020c = calendarEventInstance;
            this.f80021d = j;
            this.f80022e = j2;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/edit/operation/NotificationProcess$showNotificationBox$notifyDialog$1", "Lcom/ss/android/lark/calendar/impl/features/events/edit/widget/NotifyAttendeeDialog$Delegate;", "cancelChanges", "", "notSendNotification", "isShareToChat", "", "isTransferToChatInNotify", "sendNotification", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.c.d$d */
    public static final class C31563d implements NotifyAttendeeDialog.Delegate {

        /* renamed from: a */
        final /* synthetic */ NotificationProcess f80010a;

        /* renamed from: b */
        final /* synthetic */ EventOperationType f80011b;

        /* renamed from: c */
        final /* synthetic */ boolean f80012c;

        /* renamed from: d */
        final /* synthetic */ boolean f80013d;

        /* renamed from: e */
        final /* synthetic */ CalendarEvent f80014e;

        /* renamed from: f */
        final /* synthetic */ CalendarEventInstance f80015f;

        /* renamed from: g */
        final /* synthetic */ long f80016g;

        /* renamed from: h */
        final /* synthetic */ long f80017h;

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.widget.NotifyAttendeeDialog.Delegate
        /* renamed from: a */
        public void mo114706a() {
            if (this.f80011b == EventOperationType.OP_CREATE_EVENT) {
                GeneralHitPoint.m124223a(this.f80012c, "cancel", false);
            }
            CalendarHitPoint.m124164w();
            NotificationProcess.m119006a(this.f80010a).mo111617a();
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.widget.NotifyAttendeeDialog.Delegate
        /* renamed from: a */
        public void mo114707a(boolean z, boolean z2) {
            boolean z3;
            if (this.f80011b == EventOperationType.OP_CREATE_EVENT) {
                GeneralHitPoint.m124223a(this.f80012c, "send", z);
            }
            CalendarHitPoint.m124165x();
            if (z2 || this.f80013d) {
                z3 = true;
            } else {
                z3 = false;
            }
            NotificationProcess.m119006a(this.f80010a).mo111621b(z, z3, this.f80014e, this.f80015f, this.f80016g, this.f80017h);
            if (this.f80011b == EventOperationType.OP_DELETE_EVENT) {
                CalendarEventHitPoint.m124336a(this.f80014e.getServerId(), Long.valueOf(this.f80014e.getStartTime()), "send", Boolean.valueOf(z3));
            }
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.widget.NotifyAttendeeDialog.Delegate
        /* renamed from: b */
        public void mo114708b(boolean z, boolean z2) {
            boolean z3 = false;
            if (this.f80011b == EventOperationType.OP_CREATE_EVENT) {
                GeneralHitPoint.m124223a(this.f80012c, "unsend", false);
            }
            CalendarHitPoint.m124166y();
            if (z2 || this.f80013d) {
                z3 = true;
            }
            NotificationProcess.m119006a(this.f80010a).mo111619a(z, z3, this.f80014e, this.f80015f, this.f80016g, this.f80017h);
            if (this.f80011b == EventOperationType.OP_DELETE_EVENT) {
                CalendarEventHitPoint.m124336a(this.f80014e.getServerId(), Long.valueOf(this.f80014e.getStartTime()), "not_send", Boolean.valueOf(z3));
            }
        }

        C31563d(NotificationProcess dVar, EventOperationType eventOperationType, boolean z, boolean z2, CalendarEvent calendarEvent, CalendarEventInstance calendarEventInstance, long j, long j2) {
            this.f80010a = dVar;
            this.f80011b = eventOperationType;
            this.f80012c = z;
            this.f80013d = z2;
            this.f80014e = calendarEvent;
            this.f80015f = calendarEventInstance;
            this.f80016g = j;
            this.f80017h = j2;
        }
    }

    /* renamed from: a */
    public final void mo114703a(List<? extends CalendarEventAttendee> list) {
        this.f79991c = list;
    }

    /* renamed from: a */
    public final void mo114702a(INotificationListener cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "notificationListener");
        this.f79990a = cVar;
    }

    /* renamed from: a */
    public static final /* synthetic */ INotificationListener m119006a(NotificationProcess dVar) {
        INotificationListener cVar = dVar.f79990a;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mNotificationListener");
        }
        return cVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/edit/operation/NotificationProcess$judgeNotificationBoxType$notificationCallback$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/NotificationBoxType;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "boxtype", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.c.d$b */
    public static final class C31561b implements IGetDataCallback<NotificationBoxType> {

        /* renamed from: a */
        final /* synthetic */ NotificationProcess f79992a;

        /* renamed from: b */
        final /* synthetic */ String f79993b;

        /* renamed from: c */
        final /* synthetic */ String f79994c;

        /* renamed from: d */
        final /* synthetic */ Context f79995d;

        /* renamed from: e */
        final /* synthetic */ CalendarEvent f79996e;

        /* renamed from: f */
        final /* synthetic */ CalendarEventInstance f79997f;

        /* renamed from: g */
        final /* synthetic */ EventOperationType f79998g;

        /* renamed from: h */
        final /* synthetic */ CalendarEvent.Span f79999h;

        /* renamed from: i */
        final /* synthetic */ boolean f80000i;

        /* renamed from: j */
        final /* synthetic */ boolean f80001j;

        /* renamed from: k */
        final /* synthetic */ boolean f80002k;

        /* renamed from: l */
        final /* synthetic */ long f80003l;

        /* renamed from: m */
        final /* synthetic */ long f80004m;

        /* renamed from: a */
        public void onSuccess(NotificationBoxType notificationBoxType) {
            Intrinsics.checkParameterIsNotNull(notificationBoxType, "boxtype");
            Log.m165389i("NotificationProcess", C32673y.m125373a(this.f79993b, this.f79994c, new String[0]));
            this.f79992a.mo114701a(this.f79995d, this.f79996e, this.f79997f, notificationBoxType, this.f79998g, this.f79999h, this.f80000i, this.f80001j, this.f80002k, this.f80003l, this.f80004m);
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165383e("NotificationProcess", C32673y.m125370a(this.f79993b, this.f79994c, errorResult));
            NotificationProcess.m119006a(this.f79992a).mo111620b(this.f79996e, this.f79997f, this.f80003l, this.f80004m);
        }

        C31561b(NotificationProcess dVar, String str, String str2, Context context, CalendarEvent calendarEvent, CalendarEventInstance calendarEventInstance, EventOperationType eventOperationType, CalendarEvent.Span span, boolean z, boolean z2, boolean z3, long j, long j2) {
            this.f79992a = dVar;
            this.f79993b = str;
            this.f79994c = str2;
            this.f79995d = context;
            this.f79996e = calendarEvent;
            this.f79997f = calendarEventInstance;
            this.f79998g = eventOperationType;
            this.f79999h = span;
            this.f80000i = z;
            this.f80001j = z2;
            this.f80002k = z3;
            this.f80003l = j;
            this.f80004m = j2;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.c.d$c */
    public static final class DialogInterface$OnClickListenerC31562c implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ NotificationProcess f80005a;

        /* renamed from: b */
        final /* synthetic */ CalendarEvent f80006b;

        /* renamed from: c */
        final /* synthetic */ CalendarEventInstance f80007c;

        /* renamed from: d */
        final /* synthetic */ long f80008d;

        /* renamed from: e */
        final /* synthetic */ long f80009e;

        DialogInterface$OnClickListenerC31562c(NotificationProcess dVar, CalendarEvent calendarEvent, CalendarEventInstance calendarEventInstance, long j, long j2) {
            this.f80005a = dVar;
            this.f80006b = calendarEvent;
            this.f80007c = calendarEventInstance;
            this.f80008d = j;
            this.f80009e = j2;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            NotificationProcess.m119006a(this.f80005a).mo111618a(this.f80006b, this.f80007c, this.f80008d, this.f80009e);
        }
    }

    /* renamed from: a */
    private final void m119007a(Context context, CalendarEvent calendarEvent, CalendarEventInstance calendarEventInstance, long j, long j2) {
        ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) new UDDialogBuilder(context).message(R.string.Calendar_Meeting_NewMeeting)).messageTextSize(16)).messageTextColor(R.color.text_placeholder)).addActionButton(R.id.ud_dialog_btn_primary, R.string.Calendar_Common_Confirm, new DialogInterface$OnClickListenerC31562c(this, calendarEvent, calendarEventInstance, j, j2))).addActionButton(R.id.ud_dialog_btn_secondary, R.string.Calendar_Common_Cancel, (DialogInterface.OnClickListener) null)).messageGravity(3)).show();
    }

    /* renamed from: a */
    private final void m119008a(Context context, CalendarEvent calendarEvent, CalendarEventInstance calendarEventInstance, NotificationBoxType notificationBoxType, long j, long j2) {
        NotifyAttendeeDialog notifyAttendeeDialog = new NotifyAttendeeDialog(context, notificationBoxType, new C31564e(this, calendarEvent, calendarEventInstance, j, j2));
        notifyAttendeeDialog.mo116424c();
        notifyAttendeeDialog.show();
    }

    /* renamed from: a */
    public final void mo114698a(Context context, CallbackManager callbackManager, CalendarEvent calendarEvent, CalendarEvent calendarEvent2, CalendarEventInstance calendarEventInstance, CalendarEvent.Span span, long j, long j2) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(callbackManager, "callbackManager");
        Intrinsics.checkParameterIsNotNull(calendarEvent, "event");
        Intrinsics.checkParameterIsNotNull(span, "span");
        mo114700a(context, callbackManager, calendarEvent, calendarEvent2, calendarEventInstance, EventOperationType.OP_EDIT_EVENT, span, true, false, false, j, j2);
    }

    /* renamed from: a */
    public final void mo114699a(Context context, CallbackManager callbackManager, CalendarEvent calendarEvent, CalendarEvent calendarEvent2, CalendarEventInstance calendarEventInstance, EventOperationType eventOperationType, CalendarEvent.Span span, boolean z) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(callbackManager, "callbackManager");
        Intrinsics.checkParameterIsNotNull(calendarEvent, "event");
        Intrinsics.checkParameterIsNotNull(eventOperationType, "optType");
        Intrinsics.checkParameterIsNotNull(span, "span");
        mo114700a(context, callbackManager, calendarEvent, calendarEvent2, calendarEventInstance, eventOperationType, span, false, z, false, 0, 0);
    }

    /* renamed from: b */
    private final void m119009b(Context context, CalendarEvent calendarEvent, CalendarEventInstance calendarEventInstance, NotificationBoxType notificationBoxType, EventOperationType eventOperationType, CalendarEvent.Span span, boolean z, boolean z2, boolean z3, long j, long j2) {
        NotifyAttendeeDialog notifyAttendeeDialog = new NotifyAttendeeDialog(context, notificationBoxType, new C31563d(this, eventOperationType, z, z2, calendarEvent, calendarEventInstance, j, j2));
        if (calendarEvent.hasMeetingMinute() && span == CalendarEvent.Span.NONE_SPAN) {
            String string = context.getResources().getString(R.string.Calendar_MeetingMinutes_PopUpWindow);
            Intrinsics.checkExpressionValueIsNotNull(string, "context.resources.getStr…etingMinutes_PopUpWindow)");
            notifyAttendeeDialog.mo116422a(string);
        }
        if (z) {
            notifyAttendeeDialog.mo116423b();
        }
        if (z3) {
            notifyAttendeeDialog.mo116421a();
        }
        if (eventOperationType == EventOperationType.OP_CREATE_EVENT) {
            GeneralHitPoint.m124168A();
        }
        notifyAttendeeDialog.show();
        if (eventOperationType == EventOperationType.OP_DELETE_EVENT) {
            CalendarEventHitPoint.m124335a(calendarEvent.getServerId(), Long.valueOf(calendarEvent.getStartTime()));
        }
    }

    /* renamed from: a */
    public final void mo114701a(Context context, CalendarEvent calendarEvent, CalendarEventInstance calendarEventInstance, NotificationBoxType notificationBoxType, EventOperationType eventOperationType, CalendarEvent.Span span, boolean z, boolean z2, boolean z3, long j, long j2) {
        if (notificationBoxType.mo119918a() != NotificationBoxType.BoxSubjectType.NO_NOTIFICATION_BOX) {
            m119009b(context, calendarEvent, calendarEventInstance, notificationBoxType, eventOperationType, span, z, z2, z3, j, j2);
        } else if (notificationBoxType.mo119922b() == NotificationBoxType.MeetingEventSpecialRule.POP_ALL_ATTENDEES_ENTER_NEW_MEETING_GROUP_BOX) {
            m119007a(context, calendarEvent, calendarEventInstance, j, j2);
        } else if (eventOperationType != EventOperationType.OP_CREATE_EVENT || !z) {
            INotificationListener cVar = this.f79990a;
            if (cVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mNotificationListener");
            }
            cVar.mo111618a(calendarEvent, calendarEventInstance, j, j2);
        } else {
            m119008a(context, calendarEvent, calendarEventInstance, notificationBoxType, j, j2);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v14, resolved type: com.ss.android.lark.calendar.impl.rustadapter.c.b */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public final void mo114700a(Context context, CallbackManager callbackManager, CalendarEvent calendarEvent, CalendarEvent calendarEvent2, CalendarEventInstance calendarEventInstance, EventOperationType eventOperationType, CalendarEvent.Span span, boolean z, boolean z2, boolean z3, long j, long j2) {
        long j3;
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(callbackManager, "callbackManager");
        Intrinsics.checkParameterIsNotNull(calendarEvent, "event");
        Intrinsics.checkParameterIsNotNull(eventOperationType, "optType");
        Intrinsics.checkParameterIsNotNull(span, "span");
        String valueOf = String.valueOf(new Date().getTime());
        Log.m165389i("NotificationProcess", C32673y.m125376b(valueOf, "judgeNotificationBoxTypeRequest", new String[0]));
        C31561b bVar = new C31561b(this, valueOf, "judgeNotificationBoxTypeRequest", context, calendarEvent, calendarEventInstance, eventOperationType, span, z2, z3, z, j, j2);
        if (calendarEventInstance == null || !(eventOperationType == EventOperationType.OP_EDIT_EVENT || eventOperationType == EventOperationType.OP_DELETE_EVENT)) {
            j3 = 0;
        } else {
            j3 = calendarEventInstance.getStartTime();
        }
        C32533b.m124620a().mo118855a(eventOperationType, span, calendarEvent, calendarEvent2, j3, (List<CalendarEventAttendee>) this.f79991c, (IGetDataCallback<NotificationBoxType>) callbackManager.wrapAndAddGetDataCallback(bVar));
    }
}
