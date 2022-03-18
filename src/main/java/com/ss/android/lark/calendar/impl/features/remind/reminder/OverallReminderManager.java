package com.ss.android.lark.calendar.impl.features.remind.reminder;

import android.app.Activity;
import android.os.SystemClock;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.lark.pb.basic.v1.Command;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.site.ActivityC23764o;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.calendar.impl.features.remind.reminder.C32266a;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.C32609u;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.OverallReminderData;
import com.ss.android.lark.calendar.impl.rustadapter.p1574b.AbstractC32524a;
import com.ss.android.lark.calendar.impl.rustadapter.p1575c.C32583e;
import com.ss.android.lark.calendar.impl.rustadapter.push.CalendarPushProcess;
import com.ss.android.lark.calendar.impl.utils.C32673y;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.calendar.p1430a.p1431a.aj;
import com.ss.android.lark.log.Log;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\r\u001a\u00020\u000eH\u0002J\b\u0010\u000f\u001a\u00020\u000eH\u0002J\u0006\u0010\u0010\u001a\u00020\u000eJ\b\u0010\u0011\u001a\u00020\u000eH\u0002J\b\u0010\u0012\u001a\u00020\u000eH\u0002J\u0006\u0010\u0013\u001a\u00020\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n \f*\u0004\u0018\u00010\u000b0\u000bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/remind/reminder/OverallReminderManager;", "", "mActivity", "Landroid/app/Activity;", "(Landroid/app/Activity;)V", "mCalendarEventReminderPushListener", "Lcom/ss/android/lark/calendar/impl/rustadapter/push/CalendarPushHandleCallBack;", "mCalendarReminderClosePushListener", "mOverallReminderController", "Lcom/ss/android/lark/calendar/impl/features/remind/reminder/OverallReminderController;", "mZenModeDependency", "Lcom/ss/android/lark/calendar/dependency/idependency/IZenModeDependency;", "kotlin.jvm.PlatformType", "registerCalendarEventReminderPush", "", "registerCalendarReminderClosePush", "registerPush", "unRegisterCalendarEventReminderPush", "unRegisterCalendarReminderClosePush", "unRegisterPush", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.remind.reminder.c */
public final class OverallReminderManager {

    /* renamed from: c */
    public static final Companion f82556c = new Companion(null);

    /* renamed from: a */
    public final aj f82557a = C30022a.f74882a.zenModeDependency();

    /* renamed from: b */
    public final C32266a f82558b;

    /* renamed from: d */
    private AbstractC32524a f82559d;

    /* renamed from: e */
    private AbstractC32524a f82560e;

    /* renamed from: f */
    private final Activity f82561f;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/remind/reminder/OverallReminderManager$Companion;", "", "()V", "TAG", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.remind.reminder.c$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/calendar/impl/features/remind/reminder/OverallReminderManager$mOverallReminderController$1", "Lcom/ss/android/lark/calendar/impl/features/remind/reminder/OverallReminderController$OverallReminderListener;", "notifyCloseCalendarReminder", "", "overallReminderUnit", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/OverallReminderUnit;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.remind.reminder.c$b */
    public static final class C32271b implements C32266a.AbstractC32269a {
        C32271b() {
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/calendar/impl/features/remind/reminder/OverallReminderManager$mOverallReminderController$1$notifyCloseCalendarReminder$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", ActivityC23764o.f58839a, "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.features.remind.reminder.c$b$a */
        public static final class C32272a implements IGetDataCallback<Object> {

            /* renamed from: a */
            final /* synthetic */ String f82562a;

            /* renamed from: b */
            final /* synthetic */ String f82563b;

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Intrinsics.checkParameterIsNotNull(errorResult, "err");
                Log.m165383e("OverallReminderManager", C32673y.m125370a(this.f82562a, this.f82563b, errorResult));
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback, com.larksuite.framework.callback.IRequestCallback
            public void onSuccess(Object obj) {
                Intrinsics.checkParameterIsNotNull(obj, ActivityC23764o.f58839a);
                Log.m165389i("OverallReminderManager", C32673y.m125373a(this.f82562a, this.f82563b, new String[0]));
            }

            C32272a(String str, String str2) {
                this.f82562a = str;
                this.f82563b = str2;
            }
        }

        @Override // com.ss.android.lark.calendar.impl.features.remind.reminder.C32266a.AbstractC32269a
        /* renamed from: a */
        public void mo117927a(C32609u uVar) {
            if (uVar == null) {
                Log.m165383e("OverallReminderManager", C32673y.m125378d("overallReminderUnit_is_null"));
                return;
            }
            String valueOf = String.valueOf(new Date().getTime());
            Log.m165389i("OverallReminderManager", C32673y.m125376b(valueOf, "setCalendarReminderClose", "key", uVar.mo120225b()));
            C32583e.m124816a().mo119036a(uVar, new C32272a(valueOf, "setCalendarReminderClose"));
        }
    }

    /* renamed from: a */
    public final void mo117936a() {
        m123055c();
        m123057e();
    }

    /* renamed from: b */
    public final void mo117937b() {
        m123056d();
        m123058f();
    }

    /* renamed from: d */
    private final void m123056d() {
        if (this.f82559d != null) {
            CalendarPushProcess.f83425a.mo118827b(Command.PUSH_CALENDAR_EVENT_REMINDER, this.f82559d);
        }
    }

    /* renamed from: f */
    private final void m123058f() {
        if (this.f82560e != null) {
            CalendarPushProcess.f83425a.mo118827b(Command.PUSH_REMINDER_CLOSED_NOTIFICATION, this.f82560e);
        }
    }

    /* renamed from: c */
    private final void m123055c() {
        this.f82559d = new C32273c(this);
        CalendarPushProcess.f83425a.mo118826a(Command.PUSH_CALENDAR_EVENT_REMINDER, this.f82559d);
    }

    /* renamed from: e */
    private final void m123057e() {
        this.f82560e = new C32274d(this);
        CalendarPushProcess.f83425a.mo118826a(Command.PUSH_REMINDER_CLOSED_NOTIFICATION, this.f82560e);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000b\u0010\u0002\u001a\u00070\u0003¢\u0006\u0002\b\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/alibaba/fastjson/JSONObject;", "Lorg/jetbrains/annotations/NotNull;", "onPush"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.remind.reminder.c$d */
    public static final class C32274d implements AbstractC32524a {

        /* renamed from: a */
        final /* synthetic */ OverallReminderManager f82565a;

        C32274d(OverallReminderManager cVar) {
            this.f82565a = cVar;
        }

        @Override // com.ss.android.lark.calendar.impl.rustadapter.p1574b.AbstractC32524a
        public final void onPush(JSONObject jSONObject) {
            Intrinsics.checkParameterIsNotNull(jSONObject, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            Log.m165389i("OverallReminderManager", C32673y.m125374b("pushReminderClose"));
            Object obj = jSONObject.get("calendar_reminder_close");
            if (!(obj instanceof C32609u)) {
                obj = null;
            }
            C32609u uVar = (C32609u) obj;
            if (uVar != null) {
                this.f82565a.f82558b.mo117923a(uVar);
            } else {
                Log.m165383e("OverallReminderManager", C32673y.m125374b("overallReminderUnit_is_null"));
            }
        }
    }

    public OverallReminderManager(Activity activity) {
        Intrinsics.checkParameterIsNotNull(activity, "mActivity");
        this.f82561f = activity;
        this.f82558b = new C32266a(activity, new C32271b());
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000b\u0010\u0002\u001a\u00070\u0003¢\u0006\u0002\b\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/alibaba/fastjson/JSONObject;", "Lorg/jetbrains/annotations/NotNull;", "onPush"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.remind.reminder.c$c */
    public static final class C32273c implements AbstractC32524a {

        /* renamed from: a */
        final /* synthetic */ OverallReminderManager f82564a;

        C32273c(OverallReminderManager cVar) {
            this.f82564a = cVar;
        }

        @Override // com.ss.android.lark.calendar.impl.rustadapter.p1574b.AbstractC32524a
        public final void onPush(JSONObject jSONObject) {
            Intrinsics.checkParameterIsNotNull(jSONObject, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            Log.m165389i("OverallReminderManager", C32673y.m125374b("pushReminder"));
            Object obj = jSONObject.get("calendar_overall_reminder");
            if (!(obj instanceof OverallReminderData)) {
                obj = null;
            }
            OverallReminderData overallReminderData = (OverallReminderData) obj;
            if (overallReminderData != null) {
                overallReminderData.setArriveTime(SystemClock.elapsedRealtime());
            }
            if (overallReminderData != null) {
                aj ajVar = this.f82564a.f82557a;
                Intrinsics.checkExpressionValueIsNotNull(ajVar, "mZenModeDependency");
                if (!ajVar.mo108204a()) {
                    this.f82564a.f82558b.mo117922a(overallReminderData);
                    return;
                }
                return;
            }
            Log.m165383e("OverallReminderManager", C32673y.m125374b("overallReminder_is_null"));
        }
    }
}
