package com.ss.android.lark.calendar.impl.features.calendars.selector;

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
import com.ss.android.lark.calendar.impl.features.calendars.selector.CalendarSelectorContract;
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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 ,2\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001:\u0002,-B\u0015\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0002\u0010\bJ\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016J\b\u0010\u0013\u001a\u00020\u0005H\u0016J\u0012\u0010\u0014\u001a\u00020\u00112\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0002J\b\u0010\u0017\u001a\u00020\u0011H\u0002J\u0006\u0010\u0018\u001a\u00020\u0011J\b\u0010\u0019\u001a\u00020\u0011H\u0002J\b\u0010\u001a\u001a\u00020\u0011H\u0002J \u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010 J\u0010\u0010!\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020#H\u0007J\b\u0010$\u001a\u00020\u0011H\u0002J\b\u0010%\u001a\u00020\u0011H\u0002J\b\u0010&\u001a\u00020\u0011H\u0002J\u000e\u0010'\u001a\u00020\u00112\u0006\u0010(\u001a\u00020\u000eJ\b\u0010)\u001a\u00020\u0011H\u0002J\b\u0010*\u001a\u00020\u0011H\u0002J\b\u0010+\u001a\u00020\u0011H\u0002R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000¨\u0006."}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/selector/CalendarSelectorPresenter;", "Lcom/ss/android/lark/calendar/impl/framework/calendarmvp/BasePresenterCalendar;", "Lcom/ss/android/lark/calendar/impl/features/calendars/selector/CalendarSelectorContract$ICalendarSelectorModel;", "Lcom/ss/android/lark/calendar/impl/features/calendars/selector/CalendarSelectorContract$ICalendarSelectorView;", "Lcom/ss/android/lark/calendar/impl/features/calendars/selector/CalendarSelectorContract$IViewData;", "Lcom/ss/android/lark/calendar/impl/features/calendars/selector/CalendarSelectorContract$IViewAction;", "selectorView", "selectorModel", "(Lcom/ss/android/lark/calendar/impl/features/calendars/selector/CalendarSelectorContract$ICalendarSelectorView;Lcom/ss/android/lark/calendar/impl/features/calendars/selector/CalendarSelectorContract$ICalendarSelectorModel;)V", "mCalendarAndEventSyncPushListener", "Lcom/ss/android/lark/calendar/impl/rustadapter/push/CalendarPushHandleCallBack;", "mCalendarChangedListener", "Lcom/ss/android/lark/calendar/impl/servicemodel/calendar/CalendarServiceModel$CalendarChangedListener;", "mFragmentDependency", "Lcom/ss/android/lark/calendar/impl/features/calendars/selector/CalendarSelectorContract$IFragmentDependency;", "mThirdPartBindPushListener", "create", "", "destroy", "getViewAction", "loadAndSortCalendars", "account", "", "loadCalendars", "loadData", "loadLocalCalendars", "loadStoredCalendar", "onActivityResult", "requestCode", "", "resultCode", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/content/Intent;", "onRefreshLocalCalendars", "refreshLocalCalendarsEvent", "Lcom/ss/android/lark/calendar/impl/framework/busevents/RefreshLocalCalendarsEvent;", "registerCalendarEventSyncPush", "registerExchangeBindPush", "registerGoogleBindPush", "setActivityDependency", "dependency", "unRegisterCalendarEventSyncPush", "unRegisterExchangeBindPush", "unRegisterGoogleBindPush", "Companion", "ViewActionImpl", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class CalendarSelectorPresenter extends BasePresenterCalendar<CalendarSelectorContract.ICalendarSelectorModel, CalendarSelectorContract.ICalendarSelectorView, CalendarSelectorContract.IViewData, CalendarSelectorContract.IViewAction> {

    /* renamed from: b */
    public static final String f76082b = CalendarSelectorPresenter.class.getSimpleName();

    /* renamed from: c */
    public static final Companion f76083c = new Companion(null);

    /* renamed from: a */
    public CalendarSelectorContract.IFragmentDependency f76084a;

    /* renamed from: d */
    private AbstractC32524a f76085d = new C30389f(this);

    /* renamed from: e */
    private final AbstractC32524a f76086e = new C30393h(this);

    /* renamed from: f */
    private final C30076a.AbstractC30081a f76087f = new C30391g(this);

    @Subscribe
    public final void onRefreshLocalCalendars(C32492j jVar) {
        Intrinsics.checkParameterIsNotNull(jVar, "refreshLocalCalendarsEvent");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/selector/CalendarSelectorPresenter$Companion;", "", "()V", "TAG", "", "kotlin.jvm.PlatformType", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.selector.CalendarSelectorPresenter$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public CalendarSelectorContract.IViewAction mo109713b() {
        return new ViewActionImpl();
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0018\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0004H\u0016J\b\u0010\u0010\u001a\u00020\u0004H\u0016J\b\u0010\u0011\u001a\u00020\u0004H\u0016¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/selector/CalendarSelectorPresenter$ViewActionImpl;", "Lcom/ss/android/lark/calendar/impl/features/calendars/selector/CalendarSelectorContract$IViewAction;", "(Lcom/ss/android/lark/calendar/impl/features/calendars/selector/CalendarSelectorPresenter;)V", "onClickCalendarSetting", "", "calendarId", "", "onClickCalendarVisibility", "isVisible", "", "onClickLocalCalVisibility", "severId", "onGotoAccountManagePage", "accountItem", "Lcom/ss/android/lark/calendar/impl/features/settings/account/AccountDataListItem;", "onStartImportActivity", "onStartNewCalendarActivity", "onStartSubscribeActivity", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.selector.CalendarSelectorPresenter$b */
    public final class ViewActionImpl implements CalendarSelectorContract.IViewAction {
        @Override // com.ss.android.lark.calendar.impl.features.calendars.selector.CalendarSelectorContract.IViewAction
        /* renamed from: a */
        public void mo109717a() {
            CalendarSelectorContract.IFragmentDependency dVar = CalendarSelectorPresenter.this.f76084a;
            if (dVar != null) {
                dVar.mo109771a();
            }
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendars.selector.CalendarSelectorContract.IViewAction
        /* renamed from: b */
        public void mo109721b() {
            CalendarSelectorContract.IFragmentDependency dVar = CalendarSelectorPresenter.this.f76084a;
            if (dVar != null) {
                dVar.mo109774b();
            }
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendars.selector.CalendarSelectorContract.IViewAction
        /* renamed from: c */
        public void mo109723c() {
            CalendarSelectorContract.IFragmentDependency dVar = CalendarSelectorPresenter.this.f76084a;
            if (dVar != null) {
                dVar.mo109775c();
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public ViewActionImpl() {
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendars.selector.CalendarSelectorContract.IViewAction
        /* renamed from: a */
        public void mo109718a(AccountDataListItem aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, "accountItem");
            CalendarSelectorContract.IFragmentDependency dVar = CalendarSelectorPresenter.this.f76084a;
            if (dVar != null) {
                dVar.mo109772a(aVar);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0017\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendars/selector/CalendarSelectorPresenter$ViewActionImpl$onClickCalendarVisibility$updateCalendarCallback$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "suc", "(Ljava/lang/Boolean;)V", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.selector.CalendarSelectorPresenter$b$a */
        public static final class C30385a implements IGetDataCallback<Boolean> {

            /* renamed from: a */
            final /* synthetic */ ViewActionImpl f76089a;

            /* renamed from: b */
            final /* synthetic */ String f76090b;

            /* renamed from: c */
            final /* synthetic */ boolean f76091c;

            /* renamed from: d */
            final /* synthetic */ String f76092d;

            /* renamed from: e */
            final /* synthetic */ String f76093e;

            /* renamed from: a */
            public void onSuccess(Boolean bool) {
                if (bool != null && bool.booleanValue()) {
                    ((CalendarSelectorContract.ICalendarSelectorModel) CalendarSelectorPresenter.this.mo118652t()).mo109756a(this.f76090b, this.f76091c);
                }
                Log.m165389i(CalendarSelectorPresenter.f76082b, C32673y.m125373a(this.f76092d, this.f76093e, new String[0]));
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Intrinsics.checkParameterIsNotNull(errorResult, "err");
                ((CalendarSelectorContract.ICalendarSelectorModel) CalendarSelectorPresenter.this.mo118652t()).mo109763c(this.f76090b);
                ((CalendarSelectorContract.ICalendarSelectorView) CalendarSelectorPresenter.this.mo118651s()).mo109766a(this.f76090b);
                Log.m165383e(CalendarSelectorPresenter.f76082b, C32673y.m125370a(this.f76092d, this.f76093e, errorResult));
            }

            C30385a(ViewActionImpl bVar, String str, boolean z, String str2, String str3) {
                this.f76089a = bVar;
                this.f76090b = str;
                this.f76091c = z;
                this.f76092d = str2;
                this.f76093e = str3;
            }
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendars.selector.CalendarSelectorContract.IViewAction
        /* renamed from: a */
        public void mo109719a(String str) {
            boolean z;
            Calendar b;
            CalendarSelectorContract.IFragmentDependency dVar;
            String str2 = str;
            if (str2 == null || str2.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z && (b = ((CalendarSelectorContract.ICalendarSelectorModel) CalendarSelectorPresenter.this.mo118652t()).mo109759b(str)) != null && (dVar = CalendarSelectorPresenter.this.f76084a) != null) {
                dVar.mo109773a(b);
            }
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendars.selector.CalendarSelectorContract.IViewAction
        /* renamed from: b */
        public void mo109722b(String str, boolean z) {
            Intrinsics.checkParameterIsNotNull(str, "severId");
            ((CalendarSelectorContract.ICalendarSelectorModel) CalendarSelectorPresenter.this.mo118652t()).mo109761b(str, z);
            C31934h.m121506a().mo116562b(str, z);
            EventBus.getDefault().trigger(new C32493l());
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendars.selector.CalendarSelectorContract.IViewAction
        /* renamed from: a */
        public void mo109720a(String str, boolean z) {
            Intrinsics.checkParameterIsNotNull(str, "calendarId");
            String valueOf = String.valueOf(new Date().getTime());
            Log.m165389i(CalendarSelectorPresenter.f76082b, C32673y.m125376b(valueOf, "updateCalendarVisibility", "calendar_id", str, "visibility", String.valueOf(z)));
            C30076a.m111290a().mo108425a(str, z, CalendarSelectorPresenter.this.mo118653u().wrapAndAddGetDataCallback(new C30385a(this, str, z, valueOf, "updateCalendarVisibility")));
            EventBus.getDefault().trigger(new C32493l());
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.selector.CalendarSelectorPresenter$e */
    public static final class RunnableC30388e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ CalendarSelectorPresenter f76098a;

        RunnableC30388e(CalendarSelectorPresenter calendarSelectorPresenter) {
            this.f76098a = calendarSelectorPresenter;
        }

        public final void run() {
            ((CalendarSelectorContract.ICalendarSelectorView) this.f76098a.mo118651s()).mo109765a();
        }
    }

    /* renamed from: g */
    private final void m112956g() {
        CalendarPushProcess.f83425a.mo118826a(Command.PUSH_CALENDAR_BIND_GOOGLE_NOTIFICATION, this.f76086e);
    }

    /* renamed from: h */
    private final void m112957h() {
        CalendarPushProcess.f83425a.mo118827b(Command.PUSH_CALENDAR_BIND_GOOGLE_NOTIFICATION, this.f76086e);
    }

    /* renamed from: i */
    private final void m112958i() {
        CalendarPushProcess.f83425a.mo118826a(Command.PUSH_EXTERNAL_CALENDAR_CHANGE_NOTIFICATION, this.f76086e);
    }

    /* renamed from: j */
    private final void m112959j() {
        CalendarPushProcess.f83425a.mo118827b(Command.PUSH_EXTERNAL_CALENDAR_CHANGE_NOTIFICATION, this.f76086e);
    }

    /* renamed from: k */
    private final void m112960k() {
        CalendarPushProcess.f83425a.mo118826a(Command.PUSH_CALENDAR_EVENT_SYNC_NOTIFICATION, this.f76085d);
    }

    /* renamed from: l */
    private final void m112961l() {
        CalendarPushProcess.f83425a.mo118827b(Command.PUSH_CALENDAR_EVENT_SYNC_NOTIFICATION, this.f76085d);
    }

    /* renamed from: f */
    private final void m112955f() {
        C31927d a = C31927d.m121459a();
        Intrinsics.checkExpressionValueIsNotNull(a, "LocalCalendarProvider.getInstance()");
        ((CalendarSelectorContract.ICalendarSelectorModel) mo118652t()).mo109762b(a.mo116553d());
        ((CalendarSelectorContract.ICalendarSelectorView) mo118651s()).mo109768b();
    }

    /* renamed from: c */
    public final void mo109714c() {
        UIGetDataCallback wrapAndAddGetDataCallback = mo118653u().wrapAndAddGetDataCallback(new C30387d(this));
        Intrinsics.checkExpressionValueIsNotNull(wrapAndAddGetDataCallback, "callbackManager.wrapAndA…\n            }\n        })");
        ThirdPartAccountSPUtil.m125202a(wrapAndAddGetDataCallback);
    }

    @Override // com.ss.android.lark.calendar.impl.framework.calendarmvp.BasePresenterCalendar, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        m112954e();
        m112955f();
        mo109714c();
        m112960k();
        m112956g();
        m112958i();
        EventBus.getDefault().register(this);
    }

    @Override // com.ss.android.lark.calendar.impl.framework.calendarmvp.BasePresenterCalendar, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        super.destroy();
        m112961l();
        m112957h();
        m112959j();
        EventBus.getDefault().unregister(this);
    }

    /* renamed from: e */
    private final void m112954e() {
        C30076a a = C30076a.m111290a();
        Intrinsics.checkExpressionValueIsNotNull(a, "CalendarServiceModel.getInstance()");
        List<Calendar> d = a.mo108434d();
        if (CollectionUtils.isNotEmpty(d)) {
            ((CalendarSelectorContract.ICalendarSelectorModel) mo118652t()).mo109758a(d);
            UICallbackExecutor.post(new RunnableC30388e(this));
        }
    }

    /* renamed from: d */
    public final void mo109715d() {
        String valueOf = String.valueOf(new Date().getTime());
        Log.m165389i(f76082b, C32673y.m125376b(valueOf, "loadCalendars", new String[0]));
        C30076a.m111290a().mo108430b(mo118653u().wrapAndAddGetDataCallback(new C30386c(this, valueOf, "loadCalendars")));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002$\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004`\u00050\u0001J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J0\u0010\n\u001a\u00020\u00072&\u0010\u000b\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002j\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u0005H\u0016¨\u0006\f"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendars/selector/CalendarSelectorPresenter$loadData$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Ljava/util/HashMap;", "", "", "Lkotlin/collections/HashMap;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.selector.CalendarSelectorPresenter$d */
    public static final class C30387d implements IGetDataCallback<HashMap<String, Boolean>> {

        /* renamed from: a */
        final /* synthetic */ CalendarSelectorPresenter f76097a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C30387d(CalendarSelectorPresenter calendarSelectorPresenter) {
            this.f76097a = calendarSelectorPresenter;
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            this.f76097a.mo109715d();
        }

        /* renamed from: a */
        public void onSuccess(HashMap<String, Boolean> hashMap) {
            if (hashMap != null) {
                ((CalendarSelectorContract.ICalendarSelectorModel) this.f76097a.mo118652t()).mo109757a(hashMap);
            }
            this.f76097a.mo109715d();
        }
    }

    /* renamed from: a */
    public final void mo109712a(CalendarSelectorContract.IFragmentDependency dVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "dependency");
        this.f76084a = dVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¨\u0006\n"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendars/selector/CalendarSelectorPresenter$loadCalendars$callback$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/Calendar;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "calendars", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.selector.CalendarSelectorPresenter$c */
    public static final class C30386c implements IGetDataCallback<List<? extends Calendar>> {

        /* renamed from: a */
        final /* synthetic */ CalendarSelectorPresenter f76094a;

        /* renamed from: b */
        final /* synthetic */ String f76095b;

        /* renamed from: c */
        final /* synthetic */ String f76096c;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165383e(CalendarSelectorPresenter.f76082b, C32673y.m125370a(this.f76095b, this.f76096c, errorResult));
        }

        /* renamed from: a */
        public void onSuccess(List<? extends Calendar> list) {
            String str;
            if (list == null) {
                str = "null";
            } else {
                str = String.valueOf(list.size()) + "";
            }
            Log.m165389i(CalendarSelectorPresenter.f76082b, C32673y.m125373a(this.f76095b, this.f76096c, "calendars_size", str));
            ((CalendarSelectorContract.ICalendarSelectorModel) this.f76094a.mo118652t()).mo109758a(list);
            ((CalendarSelectorContract.ICalendarSelectorView) this.f76094a.mo118651s()).mo109765a();
            String b = ((CalendarSelectorContract.ICalendarSelectorModel) this.f76094a.mo118652t()).mo109760b();
            if (b != null) {
                ((CalendarSelectorContract.ICalendarSelectorView) this.f76094a.mo118651s()).mo109770c(b);
                ((CalendarSelectorContract.ICalendarSelectorModel) this.f76094a.mo118652t()).mo109755a((String) null);
            }
        }

        C30386c(CalendarSelectorPresenter calendarSelectorPresenter, String str, String str2) {
            this.f76094a = calendarSelectorPresenter;
            this.f76095b = str;
            this.f76096c = str2;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000b\u0010\u0002\u001a\u00070\u0003¢\u0006\u0002\b\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/alibaba/fastjson/JSONObject;", "Lorg/jetbrains/annotations/NotNull;", "onPush"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.selector.CalendarSelectorPresenter$f */
    static final class C30389f implements AbstractC32524a {

        /* renamed from: a */
        final /* synthetic */ CalendarSelectorPresenter f76099a;

        C30389f(CalendarSelectorPresenter calendarSelectorPresenter) {
            this.f76099a = calendarSelectorPresenter;
        }

        @Override // com.ss.android.lark.calendar.impl.rustadapter.p1574b.AbstractC32524a
        public final void onPush(final JSONObject jSONObject) {
            Intrinsics.checkParameterIsNotNull(jSONObject, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            Log.m165389i(CalendarSelectorPresenter.f76082b, C32673y.m125374b("pushCalEventSync"));
            UICallbackExecutor.post(new Runnable(this) {
                /* class com.ss.android.lark.calendar.impl.features.calendars.selector.CalendarSelectorPresenter.C30389f.RunnableC303901 */

                /* renamed from: a */
                final /* synthetic */ C30389f f76100a;

                {
                    this.f76100a = r1;
                }

                public final void run() {
                    Object obj = jSONObject.get("calendar_event_sync");
                    if (obj instanceof List) {
                        List<String> list = (List) obj;
                        ((CalendarSelectorContract.ICalendarSelectorModel) this.f76100a.f76099a.mo118652t()).mo109764c(list);
                        ((CalendarSelectorContract.ICalendarSelectorView) this.f76100a.f76099a.mo118651s()).mo109767a(list);
                    }
                }
            });
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\u0010\u0000\u001a\u00020\u00012*\u0010\u0002\u001a&\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0012\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00060\u0003H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "sortedCalendars", "", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/Calendar;", "kotlin.jvm.PlatformType", "", "onCalendarChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.selector.CalendarSelectorPresenter$g */
    static final class C30391g implements C30076a.AbstractC30081a {

        /* renamed from: a */
        final /* synthetic */ CalendarSelectorPresenter f76102a;

        C30391g(CalendarSelectorPresenter calendarSelectorPresenter) {
            this.f76102a = calendarSelectorPresenter;
        }

        @Override // com.ss.android.lark.calendar.impl.p1437b.p1438a.C30076a.AbstractC30081a
        /* renamed from: a */
        public final void mo108441a(final List<Calendar> list) {
            UICallbackExecutor.post(new Runnable(this) {
                /* class com.ss.android.lark.calendar.impl.features.calendars.selector.CalendarSelectorPresenter.C30391g.RunnableC303921 */

                /* renamed from: a */
                final /* synthetic */ C30391g f76103a;

                {
                    this.f76103a = r1;
                }

                public final void run() {
                    ((CalendarSelectorContract.ICalendarSelectorModel) this.f76103a.f76102a.mo118652t()).mo109758a(list);
                    ((CalendarSelectorContract.ICalendarSelectorView) this.f76103a.f76102a.mo118651s()).mo109765a();
                }
            });
            String str = CalendarSelectorPresenter.f76082b;
            Log.m165389i(str, C32673y.m125378d("CalendarChanged calendars size = " + list.size()));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000b\u0010\u0002\u001a\u00070\u0003¢\u0006\u0002\b\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/alibaba/fastjson/JSONObject;", "Lorg/jetbrains/annotations/NotNull;", "onPush"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.selector.CalendarSelectorPresenter$h */
    static final class C30393h implements AbstractC32524a {

        /* renamed from: a */
        final /* synthetic */ CalendarSelectorPresenter f76105a;

        C30393h(CalendarSelectorPresenter calendarSelectorPresenter) {
            this.f76105a = calendarSelectorPresenter;
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
                    Boolean bool2 = ((CalendarSelectorContract.ICalendarSelectorModel) this.f76105a.mo118652t()).mo109754a().get(str2);
                    if (bool2 != null && Intrinsics.areEqual((Object) bool2, (Object) false)) {
                        ((CalendarSelectorContract.ICalendarSelectorModel) this.f76105a.mo118652t()).mo109754a().put(str2, true);
                        ThirdPartAccountSPUtil.f83748a.mo120317a(str2);
                    }
                    final String valueOf = String.valueOf(new Date().getTime());
                    Log.m165389i(CalendarSelectorPresenter.f76082b, C32673y.m125376b(valueOf, "loadCalendars", new String[0]));
                    C30076a.m111290a().mo108430b(new IGetDataCallback<List<? extends Calendar>>(this, "loadCalendars") {
                        /* class com.ss.android.lark.calendar.impl.features.calendars.selector.CalendarSelectorPresenter.C30393h.C303941 */

                        /* renamed from: a */
                        final /* synthetic */ C30393h f76106a;

                        /* access modifiers changed from: package-private */
                        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
                        /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.selector.CalendarSelectorPresenter$h$1$a */
                        public static final class RunnableC30395a implements Runnable {

                            /* renamed from: a */
                            final /* synthetic */ C303941 f76110a;

                            /* renamed from: b */
                            final /* synthetic */ List f76111b;

                            RunnableC30395a(C303941 r1, List list) {
                                this.f76110a = r1;
                                this.f76111b = list;
                            }

                            public final void run() {
                                String str = str2;
                                if (this.f76111b != null) {
                                    ((CalendarSelectorContract.ICalendarSelectorModel) this.f76110a.f76106a.f76105a.mo118652t()).mo109758a(this.f76111b);
                                    ((CalendarSelectorContract.ICalendarSelectorView) this.f76110a.f76106a.f76105a.mo118651s()).mo109765a();
                                    ((CalendarSelectorContract.ICalendarSelectorView) this.f76110a.f76106a.f76105a.mo118651s()).mo109769b(str2);
                                }
                            }
                        }

                        @Override // com.larksuite.framework.callback.IGetDataCallback
                        public void onError(ErrorResult errorResult) {
                            Intrinsics.checkParameterIsNotNull(errorResult, "err");
                            Log.m165383e(CalendarSelectorPresenter.f76082b, C32673y.m125370a(valueOf, "loadCalendars", errorResult));
                        }

                        /* renamed from: a */
                        public void onSuccess(List<? extends Calendar> list) {
                            String str;
                            if (list == null || (str = String.valueOf(list.size())) == null) {
                                str = "null";
                            }
                            Log.m165389i(CalendarSelectorPresenter.f76082b, C32673y.m125373a(valueOf, "loadCalendars", "calendars_size", str));
                            UICallbackExecutor.post(new RunnableC30395a(this, list));
                        }

                        {
                            this.f76106a = r1;
                        }
                    });
                }
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CalendarSelectorPresenter(CalendarSelectorContract.ICalendarSelectorView cVar, CalendarSelectorContract.ICalendarSelectorModel bVar) {
        super(cVar, bVar);
        Intrinsics.checkParameterIsNotNull(cVar, "selectorView");
        Intrinsics.checkParameterIsNotNull(bVar, "selectorModel");
    }

    /* renamed from: a */
    public final void mo109711a(int i, int i2, Intent intent) {
        if (i == 1 || i == 2 || i == 3) {
            mo109715d();
        } else if (i == 4) {
            m112955f();
            mo109715d();
        }
    }
}
