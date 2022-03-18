package com.ss.android.lark.calendar.impl.features.calendars.sidebar;

import android.content.Intent;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.lark.pb.basic.v1.Command;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.eventbus.EventBus;
import com.ss.android.eventbus.Subscribe;
import com.ss.android.lark.calendar.impl.features.calendars.sidebar.CalendarSidebarContract;
import com.ss.android.lark.calendar.impl.features.local.C31927d;
import com.ss.android.lark.calendar.impl.features.local.C31934h;
import com.ss.android.lark.calendar.impl.features.settings.account.AccountDataListItem;
import com.ss.android.lark.calendar.impl.framework.calendarmvp.BasePresenterCalendar;
import com.ss.android.lark.calendar.impl.framework.p1568a.C32492j;
import com.ss.android.lark.calendar.impl.framework.p1568a.C32493l;
import com.ss.android.lark.calendar.impl.p1437b.p1438a.C30076a;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.Calendar;
import com.ss.android.lark.calendar.impl.rustadapter.p1574b.AbstractC32524a;
import com.ss.android.lark.calendar.impl.rustadapter.push.CalendarPushProcess;
import com.ss.android.lark.calendar.impl.utils.C32673y;
import com.ss.android.lark.calendar.impl.utils.ThirdPartAccountSPUtil;
import com.ss.android.lark.log.Log;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 ,2\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001:\u0002,-B\u0015\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0002\u0010\bJ\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\b\u0010\u0011\u001a\u00020\u0005H\u0016J\u0012\u0010\u0012\u001a\u00020\u000f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0002J\b\u0010\u0015\u001a\u00020\u000fH\u0002J\u0006\u0010\u0016\u001a\u00020\u000fJ\b\u0010\u0017\u001a\u00020\u000fH\u0002J\b\u0010\u0018\u001a\u00020\u000fH\u0002J \u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eJ\u0010\u0010\u001f\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020!H\u0007J\b\u0010\"\u001a\u00020\u000fH\u0002J\b\u0010#\u001a\u00020\u000fH\u0002J\b\u0010$\u001a\u00020\u000fH\u0002J\u000e\u0010%\u001a\u00020\u000f2\u0006\u0010&\u001a\u00020\fJ\u000e\u0010'\u001a\u00020\u000f2\u0006\u0010(\u001a\u00020\u0014J\b\u0010)\u001a\u00020\u000fH\u0002J\b\u0010*\u001a\u00020\u000fH\u0002J\b\u0010+\u001a\u00020\u000fH\u0002R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000¨\u0006."}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/sidebar/CalendarSidebarPresenter;", "Lcom/ss/android/lark/calendar/impl/framework/calendarmvp/BasePresenterCalendar;", "Lcom/ss/android/lark/calendar/impl/features/calendars/sidebar/CalendarSidebarContract$ICalendarSidebarModel;", "Lcom/ss/android/lark/calendar/impl/features/calendars/sidebar/CalendarSidebarContract$ICalendarSidebarView;", "Lcom/ss/android/lark/calendar/impl/features/calendars/sidebar/CalendarSidebarContract$IViewData;", "Lcom/ss/android/lark/calendar/impl/features/calendars/sidebar/CalendarSidebarContract$IViewAction;", "selectorView", "selectorModel", "(Lcom/ss/android/lark/calendar/impl/features/calendars/sidebar/CalendarSidebarContract$ICalendarSidebarView;Lcom/ss/android/lark/calendar/impl/features/calendars/sidebar/CalendarSidebarContract$ICalendarSidebarModel;)V", "mCalendarAndEventSyncPushListener", "Lcom/ss/android/lark/calendar/impl/rustadapter/push/CalendarPushHandleCallBack;", "mFragmentDependency", "Lcom/ss/android/lark/calendar/impl/features/calendars/sidebar/CalendarSidebarContract$IFragmentDependency;", "mThirdPartBindPushListener", "create", "", "destroy", "getViewAction", "loadAndSortCalendars", "account", "", "loadCalendars", "loadData", "loadLocalCalendars", "loadStoredCalendar", "onActivityResult", "requestCode", "", "resultCode", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/content/Intent;", "onRefreshLocalCalendars", "refreshLocalCalendarsEvent", "Lcom/ss/android/lark/calendar/impl/framework/busevents/RefreshLocalCalendarsEvent;", "registerCalendarEventSyncPush", "registerExchangeBindPush", "registerGoogleBindPush", "setActivityDependency", "dependency", "setBlinkCalendarId", "calendarId", "unRegisterCalendarEventSyncPush", "unRegisterExchangeBindPush", "unRegisterGoogleBindPush", "Companion", "ViewActionImpl", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class CalendarSidebarPresenter extends BasePresenterCalendar<CalendarSidebarContract.ICalendarSidebarModel, CalendarSidebarContract.ICalendarSidebarView, CalendarSidebarContract.IViewData, CalendarSidebarContract.IViewAction> {

    /* renamed from: b */
    public static final String f76397b = CalendarSidebarPresenter.class.getSimpleName();

    /* renamed from: c */
    public static final Companion f76398c = new Companion(null);

    /* renamed from: a */
    public CalendarSidebarContract.IFragmentDependency f76399a;

    /* renamed from: d */
    private AbstractC32524a f76400d = new C30553f(this);

    /* renamed from: e */
    private final AbstractC32524a f76401e = new C30555g(this);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/sidebar/CalendarSidebarPresenter$Companion;", "", "()V", "TAG", "", "kotlin.jvm.PlatformType", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.sidebar.CalendarSidebarPresenter$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public CalendarSidebarContract.IViewAction mo109713b() {
        return new ViewActionImpl();
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0018\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0004H\u0016J\b\u0010\u0010\u001a\u00020\u0004H\u0016J\b\u0010\u0011\u001a\u00020\u0004H\u0016¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/sidebar/CalendarSidebarPresenter$ViewActionImpl;", "Lcom/ss/android/lark/calendar/impl/features/calendars/sidebar/CalendarSidebarContract$IViewAction;", "(Lcom/ss/android/lark/calendar/impl/features/calendars/sidebar/CalendarSidebarPresenter;)V", "onClickCalendarSetting", "", "calendarId", "", "onClickCalendarVisibility", "isVisible", "", "onClickLocalCalVisibility", "severId", "onGotoAccountManagePage", "accountItem", "Lcom/ss/android/lark/calendar/impl/features/settings/account/AccountDataListItem;", "onStartImportActivity", "onStartNewCalendarActivity", "onStartSubscribeActivity", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.sidebar.CalendarSidebarPresenter$b */
    public final class ViewActionImpl implements CalendarSidebarContract.IViewAction {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.sidebar.CalendarSidebarPresenter$b$a */
        static final class RunnableC30548a implements Runnable {

            /* renamed from: a */
            public static final RunnableC30548a f76403a = new RunnableC30548a();

            RunnableC30548a() {
            }

            public final void run() {
                EventBus.getDefault().trigger(new C32493l());
            }
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendars.sidebar.CalendarSidebarContract.IViewAction
        /* renamed from: a */
        public void mo110219a() {
            CalendarSidebarContract.IFragmentDependency dVar = CalendarSidebarPresenter.this.f76399a;
            if (dVar != null) {
                dVar.mo110206a();
            }
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendars.sidebar.CalendarSidebarContract.IViewAction
        /* renamed from: b */
        public void mo110223b() {
            CalendarSidebarContract.IFragmentDependency dVar = CalendarSidebarPresenter.this.f76399a;
            if (dVar != null) {
                dVar.mo110209b();
            }
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendars.sidebar.CalendarSidebarContract.IViewAction
        /* renamed from: c */
        public void mo110225c() {
            CalendarSidebarContract.IFragmentDependency dVar = CalendarSidebarPresenter.this.f76399a;
            if (dVar != null) {
                dVar.mo110210c();
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public ViewActionImpl() {
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendars.sidebar.CalendarSidebarContract.IViewAction
        /* renamed from: a */
        public void mo110220a(AccountDataListItem aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, "accountItem");
            CalendarSidebarContract.IFragmentDependency dVar = CalendarSidebarPresenter.this.f76399a;
            if (dVar != null) {
                dVar.mo110207a(aVar);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0017\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendars/sidebar/CalendarSidebarPresenter$ViewActionImpl$onClickCalendarVisibility$updateCalendarCallback$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "suc", "(Ljava/lang/Boolean;)V", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.sidebar.CalendarSidebarPresenter$b$b */
        public static final class C30549b implements IGetDataCallback<Boolean> {

            /* renamed from: a */
            final /* synthetic */ ViewActionImpl f76404a;

            /* renamed from: b */
            final /* synthetic */ String f76405b;

            /* renamed from: c */
            final /* synthetic */ boolean f76406c;

            /* renamed from: d */
            final /* synthetic */ String f76407d;

            /* renamed from: e */
            final /* synthetic */ String f76408e;

            /* renamed from: a */
            public void onSuccess(Boolean bool) {
                if (bool != null && bool.booleanValue()) {
                    ((CalendarSidebarContract.ICalendarSidebarModel) CalendarSidebarPresenter.this.mo118652t()).mo110242a(this.f76405b, this.f76406c);
                }
                Log.m165389i(CalendarSidebarPresenter.f76397b, C32673y.m125373a(this.f76407d, this.f76408e, new String[0]));
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Intrinsics.checkParameterIsNotNull(errorResult, "err");
                ((CalendarSidebarContract.ICalendarSidebarModel) CalendarSidebarPresenter.this.mo118652t()).mo110249c(this.f76405b);
                ((CalendarSidebarContract.ICalendarSidebarView) CalendarSidebarPresenter.this.mo118651s()).mo110252a(this.f76405b);
                Log.m165383e(CalendarSidebarPresenter.f76397b, C32673y.m125370a(this.f76407d, this.f76408e, errorResult));
            }

            C30549b(ViewActionImpl bVar, String str, boolean z, String str2, String str3) {
                this.f76404a = bVar;
                this.f76405b = str;
                this.f76406c = z;
                this.f76407d = str2;
                this.f76408e = str3;
            }
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendars.sidebar.CalendarSidebarContract.IViewAction
        /* renamed from: a */
        public void mo110221a(String str) {
            boolean z;
            Calendar b;
            CalendarSidebarContract.IFragmentDependency dVar;
            String str2 = str;
            if (str2 == null || str2.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z && (b = ((CalendarSidebarContract.ICalendarSidebarModel) CalendarSidebarPresenter.this.mo118652t()).mo110245b(str)) != null && (dVar = CalendarSidebarPresenter.this.f76399a) != null) {
                dVar.mo110208a(b);
            }
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendars.sidebar.CalendarSidebarContract.IViewAction
        /* renamed from: b */
        public void mo110224b(String str, boolean z) {
            Intrinsics.checkParameterIsNotNull(str, "severId");
            ((CalendarSidebarContract.ICalendarSidebarModel) CalendarSidebarPresenter.this.mo118652t()).mo110247b(str, z);
            C31934h.m121506a().mo116562b(str, z);
            EventBus.getDefault().trigger(new C32493l());
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendars.sidebar.CalendarSidebarContract.IViewAction
        /* renamed from: a */
        public void mo110222a(String str, boolean z) {
            Intrinsics.checkParameterIsNotNull(str, "calendarId");
            String valueOf = String.valueOf(new Date().getTime());
            Log.m165389i(CalendarSidebarPresenter.f76397b, C32673y.m125376b(valueOf, "updateCalendarVisibility", "calendar_id", str, "visibility", String.valueOf(z)));
            C30076a.m111290a().mo108425a(str, z, CalendarSidebarPresenter.this.mo118653u().wrapAndAddGetDataCallback(new C30549b(this, str, z, valueOf, "updateCalendarVisibility")));
            UICallbackExecutor.executeDelayed(RunnableC30548a.f76403a, 1500);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.sidebar.CalendarSidebarPresenter$e */
    public static final class RunnableC30552e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ CalendarSidebarPresenter f76413a;

        RunnableC30552e(CalendarSidebarPresenter calendarSidebarPresenter) {
            this.f76413a = calendarSidebarPresenter;
        }

        public final void run() {
            ((CalendarSidebarContract.ICalendarSidebarView) this.f76413a.mo118651s()).mo110251a();
        }
    }

    /* renamed from: g */
    private final void m113486g() {
        CalendarPushProcess.f83425a.mo118826a(Command.PUSH_CALENDAR_BIND_GOOGLE_NOTIFICATION, this.f76401e);
    }

    /* renamed from: h */
    private final void m113487h() {
        CalendarPushProcess.f83425a.mo118827b(Command.PUSH_CALENDAR_BIND_GOOGLE_NOTIFICATION, this.f76401e);
    }

    /* renamed from: i */
    private final void m113488i() {
        CalendarPushProcess.f83425a.mo118826a(Command.PUSH_EXTERNAL_CALENDAR_CHANGE_NOTIFICATION, this.f76401e);
    }

    /* renamed from: j */
    private final void m113489j() {
        CalendarPushProcess.f83425a.mo118827b(Command.PUSH_EXTERNAL_CALENDAR_CHANGE_NOTIFICATION, this.f76401e);
    }

    /* renamed from: k */
    private final void m113490k() {
        CalendarPushProcess.f83425a.mo118826a(Command.PUSH_CALENDAR_EVENT_SYNC_NOTIFICATION, this.f76400d);
    }

    /* renamed from: l */
    private final void m113491l() {
        CalendarPushProcess.f83425a.mo118827b(Command.PUSH_CALENDAR_EVENT_SYNC_NOTIFICATION, this.f76400d);
    }

    /* renamed from: f */
    private final void m113485f() {
        C31927d a = C31927d.m121459a();
        Intrinsics.checkExpressionValueIsNotNull(a, "LocalCalendarProvider.getInstance()");
        ((CalendarSidebarContract.ICalendarSidebarModel) mo118652t()).mo110248b(a.mo116553d());
        ((CalendarSidebarContract.ICalendarSidebarView) mo118651s()).mo110254b();
    }

    /* renamed from: c */
    public final void mo110216c() {
        UIGetDataCallback wrapAndAddGetDataCallback = mo118653u().wrapAndAddGetDataCallback(new C30551d(this));
        Intrinsics.checkExpressionValueIsNotNull(wrapAndAddGetDataCallback, "callbackManager.wrapAndA…\n            }\n        })");
        ThirdPartAccountSPUtil.m125202a(wrapAndAddGetDataCallback);
    }

    @Override // com.ss.android.lark.calendar.impl.framework.calendarmvp.BasePresenterCalendar, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        m113484e();
        m113485f();
        mo110216c();
        m113490k();
        m113486g();
        m113488i();
        EventBus.getDefault().register(this);
    }

    @Override // com.ss.android.lark.calendar.impl.framework.calendarmvp.BasePresenterCalendar, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        super.destroy();
        m113491l();
        m113487h();
        m113489j();
        EventBus.getDefault().unregister(this);
    }

    /* renamed from: e */
    private final void m113484e() {
        C30076a a = C30076a.m111290a();
        Intrinsics.checkExpressionValueIsNotNull(a, "CalendarServiceModel.getInstance()");
        List<Calendar> d = a.mo108434d();
        if (CollectionUtils.isNotEmpty(d)) {
            ((CalendarSidebarContract.ICalendarSidebarModel) mo118652t()).mo110244a(d);
            UICallbackExecutor.post(new RunnableC30552e(this));
        }
    }

    /* renamed from: d */
    public final void mo110217d() {
        String valueOf = String.valueOf(new Date().getTime());
        Log.m165389i(f76397b, C32673y.m125376b(valueOf, "loadCalendars", new String[0]));
        C30076a.m111290a().mo108430b(mo118653u().wrapAndAddGetDataCallback(new C30550c(this, valueOf, "loadCalendars")));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002$\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004`\u00050\u0001J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J0\u0010\n\u001a\u00020\u00072&\u0010\u000b\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002j\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u0005H\u0016¨\u0006\f"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendars/sidebar/CalendarSidebarPresenter$loadData$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Ljava/util/HashMap;", "", "", "Lkotlin/collections/HashMap;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.sidebar.CalendarSidebarPresenter$d */
    public static final class C30551d implements IGetDataCallback<HashMap<String, Boolean>> {

        /* renamed from: a */
        final /* synthetic */ CalendarSidebarPresenter f76412a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C30551d(CalendarSidebarPresenter calendarSidebarPresenter) {
            this.f76412a = calendarSidebarPresenter;
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            this.f76412a.mo110217d();
        }

        /* renamed from: a */
        public void onSuccess(HashMap<String, Boolean> hashMap) {
            if (hashMap != null) {
                ((CalendarSidebarContract.ICalendarSidebarModel) this.f76412a.mo118652t()).mo110243a(hashMap);
            }
            this.f76412a.mo110217d();
        }
    }

    /* renamed from: a */
    public final void mo110214a(CalendarSidebarContract.IFragmentDependency dVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "dependency");
        this.f76399a = dVar;
    }

    @Subscribe
    public final void onRefreshLocalCalendars(C32492j jVar) {
        Intrinsics.checkParameterIsNotNull(jVar, "refreshLocalCalendarsEvent");
        m113485f();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¨\u0006\n"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendars/sidebar/CalendarSidebarPresenter$loadCalendars$callback$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/Calendar;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "calendars", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.sidebar.CalendarSidebarPresenter$c */
    public static final class C30550c implements IGetDataCallback<List<? extends Calendar>> {

        /* renamed from: a */
        final /* synthetic */ CalendarSidebarPresenter f76409a;

        /* renamed from: b */
        final /* synthetic */ String f76410b;

        /* renamed from: c */
        final /* synthetic */ String f76411c;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165383e(CalendarSidebarPresenter.f76397b, C32673y.m125370a(this.f76410b, this.f76411c, errorResult));
        }

        /* renamed from: a */
        public void onSuccess(List<? extends Calendar> list) {
            String str;
            if (list == null) {
                str = "null";
            } else {
                str = String.valueOf(list.size()) + "";
            }
            Log.m165389i(CalendarSidebarPresenter.f76397b, C32673y.m125373a(this.f76410b, this.f76411c, "calendars_size", str));
            ((CalendarSidebarContract.ICalendarSidebarModel) this.f76409a.mo118652t()).mo110244a(list);
            ((CalendarSidebarContract.ICalendarSidebarView) this.f76409a.mo118651s()).mo110251a();
            String a = ((CalendarSidebarContract.ICalendarSidebarModel) this.f76409a.mo118652t()).mo110240a();
            if (a != null) {
                ((CalendarSidebarContract.ICalendarSidebarView) this.f76409a.mo118651s()).mo110256c(a);
                ((CalendarSidebarContract.ICalendarSidebarModel) this.f76409a.mo118652t()).mo110241a((String) null);
            }
        }

        C30550c(CalendarSidebarPresenter calendarSidebarPresenter, String str, String str2) {
            this.f76409a = calendarSidebarPresenter;
            this.f76410b = str;
            this.f76411c = str2;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000b\u0010\u0002\u001a\u00070\u0003¢\u0006\u0002\b\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/alibaba/fastjson/JSONObject;", "Lorg/jetbrains/annotations/NotNull;", "onPush"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.sidebar.CalendarSidebarPresenter$f */
    static final class C30553f implements AbstractC32524a {

        /* renamed from: a */
        final /* synthetic */ CalendarSidebarPresenter f76414a;

        C30553f(CalendarSidebarPresenter calendarSidebarPresenter) {
            this.f76414a = calendarSidebarPresenter;
        }

        @Override // com.ss.android.lark.calendar.impl.rustadapter.p1574b.AbstractC32524a
        public final void onPush(final JSONObject jSONObject) {
            Intrinsics.checkParameterIsNotNull(jSONObject, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            Log.m165389i(CalendarSidebarPresenter.f76397b, C32673y.m125374b("pushCalEventSync"));
            UICallbackExecutor.post(new Runnable(this) {
                /* class com.ss.android.lark.calendar.impl.features.calendars.sidebar.CalendarSidebarPresenter.C30553f.RunnableC305541 */

                /* renamed from: a */
                final /* synthetic */ C30553f f76415a;

                {
                    this.f76415a = r1;
                }

                public final void run() {
                    Object obj = jSONObject.get("calendar_event_sync");
                    if (obj instanceof List) {
                        List<String> list = (List) obj;
                        ((CalendarSidebarContract.ICalendarSidebarModel) this.f76415a.f76414a.mo118652t()).mo110250c(list);
                        ((CalendarSidebarContract.ICalendarSidebarView) this.f76415a.f76414a.mo118651s()).mo110253a(list);
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo110215a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "calendarId");
        ((CalendarSidebarContract.ICalendarSidebarModel) mo118652t()).mo110241a(str);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000b\u0010\u0002\u001a\u00070\u0003¢\u0006\u0002\b\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/alibaba/fastjson/JSONObject;", "Lorg/jetbrains/annotations/NotNull;", "onPush"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.sidebar.CalendarSidebarPresenter$g */
    static final class C30555g implements AbstractC32524a {

        /* renamed from: a */
        final /* synthetic */ CalendarSidebarPresenter f76417a;

        C30555g(CalendarSidebarPresenter calendarSidebarPresenter) {
            this.f76417a = calendarSidebarPresenter;
        }

        @Override // com.ss.android.lark.calendar.impl.rustadapter.p1574b.AbstractC32524a
        public final void onPush(JSONObject jSONObject) {
            Intrinsics.checkParameterIsNotNull(jSONObject, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            Object obj = jSONObject.get("bound");
            String str = null;
            if (!(obj instanceof Boolean)) {
                obj = null;
            }
            Boolean bool = (Boolean) obj;
            if (bool != null) {
                boolean booleanValue = bool.booleanValue();
                Object obj2 = jSONObject.get("account");
                if (obj2 instanceof String) {
                    str = obj2;
                }
                final String str2 = str;
                if (str2 != null && booleanValue) {
                    Boolean bool2 = ((CalendarSidebarContract.ICalendarSidebarModel) this.f76417a.mo118652t()).mo110246b().get(str2);
                    if (bool2 != null && Intrinsics.areEqual((Object) bool2, (Object) false)) {
                        ((CalendarSidebarContract.ICalendarSidebarModel) this.f76417a.mo118652t()).mo110246b().put(str2, true);
                        ThirdPartAccountSPUtil.f83748a.mo120317a(str2);
                    }
                    final String valueOf = String.valueOf(new Date().getTime());
                    Log.m165389i(CalendarSidebarPresenter.f76397b, C32673y.m125376b(valueOf, "loadCalendars", new String[0]));
                    C30076a.m111290a().mo108430b(new IGetDataCallback<List<? extends Calendar>>(this, "loadCalendars") {
                        /* class com.ss.android.lark.calendar.impl.features.calendars.sidebar.CalendarSidebarPresenter.C30555g.C305561 */

                        /* renamed from: a */
                        final /* synthetic */ C30555g f76418a;

                        /* access modifiers changed from: package-private */
                        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
                        /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.sidebar.CalendarSidebarPresenter$g$1$a */
                        public static final class RunnableC30557a implements Runnable {

                            /* renamed from: a */
                            final /* synthetic */ C305561 f76422a;

                            /* renamed from: b */
                            final /* synthetic */ List f76423b;

                            RunnableC30557a(C305561 r1, List list) {
                                this.f76422a = r1;
                                this.f76423b = list;
                            }

                            public final void run() {
                                String str = str2;
                                if (this.f76423b != null) {
                                    ((CalendarSidebarContract.ICalendarSidebarModel) this.f76422a.f76418a.f76417a.mo118652t()).mo110244a(this.f76423b);
                                    ((CalendarSidebarContract.ICalendarSidebarView) this.f76422a.f76418a.f76417a.mo118651s()).mo110251a();
                                    ((CalendarSidebarContract.ICalendarSidebarView) this.f76422a.f76418a.f76417a.mo118651s()).mo110255b(str2);
                                }
                            }
                        }

                        @Override // com.larksuite.framework.callback.IGetDataCallback
                        public void onError(ErrorResult errorResult) {
                            Intrinsics.checkParameterIsNotNull(errorResult, "err");
                            Log.m165383e(CalendarSidebarPresenter.f76397b, C32673y.m125370a(valueOf, "loadCalendars", errorResult));
                        }

                        /* renamed from: a */
                        public void onSuccess(List<? extends Calendar> list) {
                            String str;
                            if (list == null || (str = String.valueOf(list.size())) == null) {
                                str = "null";
                            }
                            Log.m165389i(CalendarSidebarPresenter.f76397b, C32673y.m125373a(valueOf, "loadCalendars", "calendars_size", str));
                            UICallbackExecutor.post(new RunnableC30557a(this, list));
                        }

                        {
                            this.f76418a = r1;
                        }
                    });
                }
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CalendarSidebarPresenter(CalendarSidebarContract.ICalendarSidebarView cVar, CalendarSidebarContract.ICalendarSidebarModel bVar) {
        super(cVar, bVar);
        Intrinsics.checkParameterIsNotNull(cVar, "selectorView");
        Intrinsics.checkParameterIsNotNull(bVar, "selectorModel");
    }

    /* renamed from: a */
    public final void mo110213a(int i, int i2, Intent intent) {
        if (i == 1 || i == 2 || i == 3) {
            mo110217d();
        } else if (i == 4) {
            m113485f();
            mo110217d();
        }
    }
}
