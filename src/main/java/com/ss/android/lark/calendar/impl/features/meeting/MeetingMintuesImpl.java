package com.ss.android.lark.calendar.impl.features.meeting;

import android.app.Activity;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.calendar.v1.CalendarEventDisplayInfo;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.callback.CallbackManager;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.events.detail.utils.AttendeeUtil;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event.CalendarHitPoint;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.C32608o;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventInstance;
import com.ss.android.lark.calendar.impl.rustadapter.p1574b.AbstractC32524a;
import com.ss.android.lark.calendar.impl.rustadapter.p1575c.C32533b;
import com.ss.android.lark.calendar.impl.rustadapter.push.CalendarPushProcess;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.calendar.impl.utils.C32673y;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.ui.DialogC57586c;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\t\u0018\u0000 32\u00020\u0001:\u000234B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0019J\b\u0010%\u001a\u00020#H\u0002J\b\u0010&\u001a\u00020#H\u0002J\b\u0010'\u001a\u00020#H\u0002J\u0006\u0010(\u001a\u00020#J\u0006\u0010)\u001a\u00020#J\b\u0010*\u001a\u00020#H\u0002J\u000e\u0010+\u001a\u00020,2\u0006\u0010$\u001a\u00020\u0019J\u0016\u0010-\u001a\u00020#2\u0006\u0010.\u001a\u00020\f2\u0006\u0010/\u001a\u00020\u001eJ\u0010\u00100\u001a\u00020#2\b\u00101\u001a\u0004\u0018\u00010\fJ\b\u00102\u001a\u00020#H\u0002R\u000e\u0010\u0007\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R#\u0010\r\u001a\n \u000f*\u0004\u0018\u00010\u000e0\u000e8BX\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0014\u001a\u00020\u0015X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0017\u001a\u0012\u0012\u0004\u0012\u00020\u00190\u0018j\b\u0012\u0004\u0012\u00020\u0019`\u001aX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001f\u001a\u0004\u0018\u00010 X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u001cX\u0004¢\u0006\u0002\n\u0000¨\u00065"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/meeting/MeetingMintuesImpl;", "", "activity", "Landroid/app/Activity;", "chatId", "", "(Landroid/app/Activity;Ljava/lang/String;)V", "hitPointEditType", "isDestroyed", "", "mActivity", "mCalendarEvent", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEvent;", "mCalendarEventService", "Lcom/ss/android/lark/calendar/impl/rustadapter/service/CalendarEventService;", "kotlin.jvm.PlatformType", "getMCalendarEventService", "()Lcom/ss/android/lark/calendar/impl/rustadapter/service/CalendarEventService;", "mCalendarEventService$delegate", "Lkotlin/Lazy;", "mCallbackManager", "Lcom/larksuite/framework/callback/CallbackManager;", "mChatId", "mDelegates", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/calendar/impl/features/meeting/MeetingMintuesImpl$IMeetingMinutesDelegate;", "Lkotlin/collections/ArrayList;", "mDismissEditingRedDotRunnable", "Ljava/lang/Runnable;", "mEventInstance", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventInstance;", "mMeetingMinuteEditingPushListener", "Lcom/ss/android/lark/calendar/impl/rustadapter/push/CalendarPushHandleCallBack;", "mUpdateRedDotRunnable", "addDelegate", "", "delegate", "calendarHitPoint", "createMeetingMinuteByChatId", "getMeetingMinuteRedDotByChatId", "gotoMeetingMinuteActivity", "onDestroy", "registerMeetingMinuteRedDotEditingPush", "removeDelegate", "", "setEventAndInstance", "event", "instance", "showMeetingMinuteIcon", "calendarEvent", "unRegisterMeetingMinuteRedDotEditingPush", "Companion", "IMeetingMinutesDelegate", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.meeting.c */
public final class MeetingMintuesImpl {

    /* renamed from: i */
    public static final Companion f81639i = new Companion(null);

    /* renamed from: a */
    public final Activity f81640a;

    /* renamed from: b */
    public final String f81641b;

    /* renamed from: c */
    public final ArrayList<IMeetingMinutesDelegate> f81642c = new ArrayList<>();

    /* renamed from: d */
    public boolean f81643d;

    /* renamed from: e */
    public CalendarEvent f81644e;

    /* renamed from: f */
    public String f81645f = "static";

    /* renamed from: g */
    public final Runnable f81646g = new RunnableC31952g(this);

    /* renamed from: h */
    public final Runnable f81647h = new RunnableC31951f(this);

    /* renamed from: j */
    private CallbackManager f81648j;

    /* renamed from: k */
    private CalendarEventInstance f81649k;

    /* renamed from: l */
    private AbstractC32524a f81650l;

    /* renamed from: m */
    private final Lazy f81651m = LazyKt.lazy(C31950e.INSTANCE);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0006H&¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/meeting/MeetingMintuesImpl$IMeetingMinutesDelegate;", "", "showMeetingMinuteIcon", "", "showMeetingMinuteRedDot", "isUpdated", "", "showMeetingMinuteRedDotEditing", "isEditing", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meeting.c$b */
    public interface IMeetingMinutesDelegate {
        /* renamed from: a */
        void mo116570a();

        /* renamed from: a */
        void mo116571a(boolean z);

        /* renamed from: b */
        void mo116572b(boolean z);
    }

    /* renamed from: d */
    private final C32533b m121565d() {
        return (C32533b) this.f81651m.getValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/meeting/MeetingMintuesImpl$Companion;", "", "()V", "TAG", "", "TEN_MINUTES", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meeting.c$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/calendar/impl/rustadapter/service/CalendarEventService;", "kotlin.jvm.PlatformType", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meeting.c$e */
    static final class C31950e extends Lambda implements Function0<C32533b> {
        public static final C31950e INSTANCE = new C31950e();

        C31950e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C32533b invoke() {
            return C32533b.m124620a();
        }
    }

    /* renamed from: h */
    private final void m121569h() {
        if (this.f81650l != null) {
            CalendarPushProcess.f83425a.mo118827b(Command.PUSH_MEETING_MINUTE_EDITORS, this.f81650l);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/lark/calendar/impl/features/meeting/MeetingMintuesImpl$mUpdateRedDotRunnable$1", "Ljava/lang/Runnable;", "run", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meeting.c$g */
    public static final class RunnableC31952g implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MeetingMintuesImpl f81659a;

        public void run() {
            if (!this.f81659a.f81643d) {
                this.f81659a.mo116589c();
                UICallbackExecutor.executeDelayed(this, 600000);
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        RunnableC31952g(MeetingMintuesImpl cVar) {
            this.f81659a = cVar;
        }
    }

    /* renamed from: g */
    private final void m121568g() {
        this.f81650l = new C31953h(this);
        CalendarPushProcess.f83425a.mo118826a(Command.PUSH_MEETING_MINUTE_EDITORS, this.f81650l);
    }

    /* renamed from: a */
    public final void mo116583a() {
        this.f81643d = true;
        this.f81648j.cancelCallbacks();
        UICallbackExecutor.removeCallbacks(this.f81646g);
        UICallbackExecutor.removeCallbacks(this.f81647h);
        m121569h();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meeting.c$f */
    static final class RunnableC31951f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MeetingMintuesImpl f81658a;

        RunnableC31951f(MeetingMintuesImpl cVar) {
            this.f81658a = cVar;
        }

        public final void run() {
            Iterator<T> it = this.f81658a.f81642c.iterator();
            while (it.hasNext()) {
                it.next().mo116571a(false);
            }
            this.f81658a.f81645f = "static";
            UICallbackExecutor.removeCallbacks(this.f81658a.f81646g);
            UICallbackExecutor.post(this.f81658a.f81646g);
        }
    }

    /* renamed from: e */
    private final void m121566e() {
        String str;
        if (this.f81649k != null) {
            long currentTimeMillis = System.currentTimeMillis() / ((long) 1000);
            CalendarEventInstance calendarEventInstance = this.f81649k;
            if (calendarEventInstance == null) {
                Intrinsics.throwNpe();
            }
            if (currentTimeMillis >= calendarEventInstance.getStartTime()) {
                CalendarEventInstance calendarEventInstance2 = this.f81649k;
                if (calendarEventInstance2 == null) {
                    Intrinsics.throwNpe();
                }
                if (currentTimeMillis <= calendarEventInstance2.getEndTime()) {
                    str = "mtg";
                    CalendarHitPoint.m124121a(str, this.f81645f);
                }
            }
            str = "nomtg";
            CalendarHitPoint.m124121a(str, this.f81645f);
        }
    }

    /* renamed from: b */
    public final void mo116588b() {
        if (this.f81644e != null) {
            m121566e();
            for (T t : this.f81642c) {
                t.mo116572b(false);
                t.mo116571a(false);
            }
            UICallbackExecutor.removeCallbacks(this.f81646g);
            UICallbackExecutor.executeDelayed(this.f81646g, 600000);
            m121567f();
            this.f81645f = "static";
        }
    }

    /* renamed from: f */
    private final void m121567f() {
        if (!TextUtils.isEmpty(this.f81641b) && this.f81644e != null) {
            String valueOf = String.valueOf(new Date().getTime());
            Log.m165389i("MeetingMintuesImpl", C32673y.m125376b(valueOf, "createMeetingMinuteUrlByChatId", "chat_ids", this.f81641b));
            m121565d().mo118877b(this.f81641b, this.f81648j.wrapAndAddGetDataCallback(new C31948c(this, valueOf, "createMeetingMinuteUrlByChatId")));
        }
    }

    /* renamed from: c */
    public final void mo116589c() {
        if (!TextUtils.isEmpty(this.f81641b)) {
            String valueOf = String.valueOf(new Date().getTime());
            Log.m165389i("MeetingMintuesImpl", C32673y.m125376b(valueOf, "getMeetingMinuteRedDotByChatId", "chat_ids", this.f81641b));
            m121565d().mo118881c(this.f81641b, this.f81648j.wrapAndAddGetDataCallback(new C31949d(this, valueOf, "getMeetingMinuteRedDotByChatId")));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/calendar/impl/features/meeting/MeetingMintuesImpl$getMeetingMinuteRedDotByChatId$callback$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "isUpdate", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meeting.c$d */
    public static final class C31949d implements IGetDataCallback<Boolean> {

        /* renamed from: a */
        final /* synthetic */ MeetingMintuesImpl f81655a;

        /* renamed from: b */
        final /* synthetic */ String f81656b;

        /* renamed from: c */
        final /* synthetic */ String f81657c;

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.larksuite.framework.callback.IGetDataCallback, com.larksuite.framework.callback.IRequestCallback
        public /* synthetic */ void onSuccess(Boolean bool) {
            mo116591a(bool.booleanValue());
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165383e("MeetingMintuesImpl", C32673y.m125370a(this.f81656b, this.f81657c, errorResult));
        }

        /* renamed from: a */
        public void mo116591a(boolean z) {
            Log.m165389i("MeetingMintuesImpl", C32673y.m125373a(this.f81656b, this.f81657c, new String[0]));
            if (!this.f81655a.f81643d) {
                if (z) {
                    this.f81655a.f81645f = "new";
                }
                Iterator<T> it = this.f81655a.f81642c.iterator();
                while (it.hasNext()) {
                    it.next().mo116572b(z);
                }
            }
        }

        C31949d(MeetingMintuesImpl cVar, String str, String str2) {
            this.f81655a = cVar;
            this.f81656b = str;
            this.f81657c = str2;
        }
    }

    /* renamed from: b */
    public final int mo116587b(IMeetingMinutesDelegate bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "delegate");
        this.f81642c.remove(bVar);
        return this.f81642c.size();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/calendar/impl/features/meeting/MeetingMintuesImpl$createMeetingMinuteByChatId$callback$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "meetingMinuteUrl", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meeting.c$c */
    public static final class C31948c implements IGetDataCallback<String> {

        /* renamed from: a */
        final /* synthetic */ MeetingMintuesImpl f81652a;

        /* renamed from: b */
        final /* synthetic */ String f81653b;

        /* renamed from: c */
        final /* synthetic */ String f81654c;

        /* renamed from: a */
        public void onSuccess(String str) {
            Intrinsics.checkParameterIsNotNull(str, "meetingMinuteUrl");
            Log.m165389i("MeetingMintuesImpl", C32673y.m125373a(this.f81653b, this.f81654c, new String[0]));
            if (!this.f81652a.f81643d) {
                CalendarEvent calendarEvent = this.f81652a.f81644e;
                if (calendarEvent == null) {
                    Intrinsics.throwNpe();
                }
                calendarEvent.setMeetingMinuteUrl(str);
                C30022a.f74882a.browserModuleDependency().mo108213c(this.f81652a.f81640a, str);
            }
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            CalendarEvent calendarEvent = this.f81652a.f81644e;
            if (calendarEvent == null) {
                Intrinsics.throwNpe();
            }
            calendarEvent.setMeetingMinuteUrl("");
            Log.m165383e("MeetingMintuesImpl", C32673y.m125370a(this.f81653b, this.f81654c, errorResult));
            if (errorResult.getErrorCode() == 10008) {
                LKUIToast.show(this.f81652a.f81640a, C32634ae.m125182b(R.string.Calendar_Detail_NoNetwork));
            } else if (errorResult.getErrorCode() == 8020) {
                String a = C30022a.f74882a.utilsDependency().mo108195a(R.string.Calendar_MeetingMinutes_UnavailableDueToAdminPermissionSettings, "name", AttendeeUtil.f79151a.mo113571d(this.f81652a.f81644e));
                DialogC57586c cVar = new DialogC57586c(this.f81652a.f81640a);
                cVar.mo195559a("");
                cVar.mo195563b(a);
                cVar.mo195567c(C32634ae.m125182b(R.string.Calendar_Common_GotIt), null, true);
                cVar.mo195562b(16);
                cVar.mo195568d(C32634ae.m125178a(R.color.lkui_N900));
                cVar.setCanceledOnTouchOutside(false);
                cVar.setCancelable(false);
                cVar.show();
            } else {
                LKUIToast.show(this.f81652a.f81640a, C32634ae.m125182b(R.string.Calendar_Common_FailedtoLoad2));
            }
        }

        C31948c(MeetingMintuesImpl cVar, String str, String str2) {
            this.f81652a = cVar;
            this.f81653b = str;
            this.f81654c = str2;
        }
    }

    /* renamed from: a */
    public final void mo116584a(IMeetingMinutesDelegate bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "delegate");
        if (!this.f81642c.contains(bVar)) {
            this.f81642c.add(bVar);
            UICallbackExecutor.removeCallbacks(this.f81646g);
            UICallbackExecutor.post(this.f81646g);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000b\u0010\u0002\u001a\u00070\u0003¢\u0006\u0002\b\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/alibaba/fastjson/JSONObject;", "Lorg/jetbrains/annotations/NotNull;", "onPush"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meeting.c$h */
    public static final class C31953h implements AbstractC32524a {

        /* renamed from: a */
        final /* synthetic */ MeetingMintuesImpl f81660a;

        C31953h(MeetingMintuesImpl cVar) {
            this.f81660a = cVar;
        }

        @Override // com.ss.android.lark.calendar.impl.rustadapter.p1574b.AbstractC32524a
        public final void onPush(JSONObject jSONObject) {
            C32608o oVar;
            Intrinsics.checkParameterIsNotNull(jSONObject, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            if (!this.f81660a.f81643d && (oVar = (C32608o) jSONObject.get("calendar_meeting_editing")) != null && !TextUtils.isEmpty(oVar.mo120136a()) && Intrinsics.areEqual(oVar.mo120136a(), this.f81660a.f81641b)) {
                Iterator<T> it = this.f81660a.f81642c.iterator();
                while (it.hasNext()) {
                    it.next().mo116571a(true);
                }
                this.f81660a.f81645f = "edit";
                UICallbackExecutor.removeCallbacks(this.f81660a.f81647h);
                Runnable runnable = this.f81660a.f81647h;
                Long b = oVar.mo120139b();
                if (b == null) {
                    Intrinsics.throwNpe();
                }
                UICallbackExecutor.executeDelayed(runnable, b.longValue() * ((long) 1000));
            }
        }
    }

    /* renamed from: a */
    public final void mo116585a(CalendarEvent calendarEvent) {
        if (calendarEvent != null && calendarEvent.getCalendarEventDisplayInfo().getMeetingMinutesBtnDisplayType() == CalendarEventDisplayInfo.ButtonDisplayType.SHOWN) {
            Iterator<T> it = this.f81642c.iterator();
            while (it.hasNext()) {
                it.next().mo116570a();
            }
        }
    }

    /* renamed from: a */
    public final void mo116586a(CalendarEvent calendarEvent, CalendarEventInstance calendarEventInstance) {
        Intrinsics.checkParameterIsNotNull(calendarEvent, "event");
        Intrinsics.checkParameterIsNotNull(calendarEventInstance, "instance");
        this.f81644e = calendarEvent;
        this.f81649k = calendarEventInstance;
    }

    public MeetingMintuesImpl(Activity activity, String str) {
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        Intrinsics.checkParameterIsNotNull(str, "chatId");
        this.f81640a = activity;
        this.f81641b = str;
        this.f81648j = new CallbackManager();
        m121568g();
    }
}
