package com.ss.android.lark.calendar.impl.features.meetingroom.signin;

import android.os.Bundle;
import com.bytedance.ee.bear.document.tips.BottomDialog;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.meetingroom.signin.IMtRoomSignInContract;
import com.ss.android.lark.calendar.impl.features.meetingroom.signin.data.InactiveReason;
import com.ss.android.lark.calendar.impl.features.meetingroom.signin.data.MeetingRoomSignInState;
import com.ss.android.lark.calendar.impl.features.meetingroom.signin.data.TimeRange;
import com.ss.android.lark.calendar.impl.features.meetingroom.signin.helper.SignInStateHelper;
import com.ss.android.lark.calendar.impl.features.meetingroom.signin.listener.IActivityDependency;
import com.ss.android.lark.calendar.impl.framework.calendarmvp.BasePresenterCalendar;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event.GeneralHitPoint;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventInstance;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarResource;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.GetResourceCheckInInfoResponse;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.InstanceInfo;
import com.ss.android.lark.calendar.impl.rustadapter.service.CalendarSDKService;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30054s;
import com.ss.android.lark.pb.calendarevents.CheckInByQRCodeResponse;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001B\u001d\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010\u0011\u001a\u00020\u0012H\u0002J\b\u0010\u0013\u001a\u00020\u0012H\u0016J\u0018\u0010\u0014\u001a\n \u0016*\u0004\u0018\u00010\u00150\u00152\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\b\u0010\u0019\u001a\u00020\u0005H\u0016J(\u0010\u001a\u001a\u00020\u00122\b\b\u0002\u0010\u001b\u001a\u00020\u00102\u0014\b\u0002\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00120\u001dH\u0002J\u0006\u0010\u001e\u001a\u00020\u0012J\u000e\u0010\u001f\u001a\u00020\u00122\u0006\u0010 \u001a\u00020!J\u0006\u0010\"\u001a\u00020\u0012J\b\u0010#\u001a\u00020\u0012H\u0002J\b\u0010$\u001a\u00020\u0012H\u0002J\b\u0010%\u001a\u00020\u0012H\u0002J\b\u0010&\u001a\u00020\u0012H\u0002J\b\u0010'\u001a\u00020\u0012H\u0002J\u0010\u0010(\u001a\u00020\u00122\u0006\u0010)\u001a\u00020*H\u0002R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000¨\u0006+"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/meetingroom/signin/MeetingRoomSignInPresenter;", "Lcom/ss/android/lark/calendar/impl/framework/calendarmvp/BasePresenterCalendar;", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/signin/IMtRoomSignInContract$IMtRoomSignInModeApi;", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/signin/IMtRoomSignInContract$IMtRoomSignInViewApi;", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/signin/IMtRoomSignInContract$IViewData;", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/signin/IMtRoomSignInContract$IViewAction;", "viewApi", "model", "activityDependency", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/signin/listener/IActivityDependency;", "(Lcom/ss/android/lark/calendar/impl/features/meetingroom/signin/IMtRoomSignInContract$IMtRoomSignInViewApi;Lcom/ss/android/lark/calendar/impl/features/meetingroom/signin/IMtRoomSignInContract$IMtRoomSignInModeApi;Lcom/ss/android/lark/calendar/impl/features/meetingroom/signin/listener/IActivityDependency;)V", "getActivityDependency", "()Lcom/ss/android/lark/calendar/impl/features/meetingroom/signin/listener/IActivityDependency;", "checkInRefreshRunnable", "Ljava/lang/Runnable;", "isResourceCheckInInfoLoading", "", "checkPostRefreshRunnable", "", "create", "getErrorText", "", "kotlin.jvm.PlatformType", "errCode", "", "getViewAction", "loadResourceCheckInInfo", "isShowLoading", "loadErrFun", "Lkotlin/Function1;", "onResume", "onSaveInstanceState", "outState", "Landroid/os/Bundle;", "onStop", "sendCheckInRequest", "sendClickBlockHitPoint", "sendClickCheckInHitPoint", "sendClickFindTimeHitPoint", "sendScanHitPoint", "startUpdateModelView", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/GetResourceCheckInInfoResponse;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.signin.e */
public final class MeetingRoomSignInPresenter extends BasePresenterCalendar<IMtRoomSignInContract.IMtRoomSignInModeApi, IMtRoomSignInContract.IMtRoomSignInViewApi, IMtRoomSignInContract.IViewData, IMtRoomSignInContract.IViewAction> {

    /* renamed from: a */
    public boolean f82224a;

    /* renamed from: b */
    private Runnable f82225b = new RunnableC32158a(this);

    /* renamed from: c */
    private final IActivityDependency f82226c;

    /* renamed from: i */
    public final IActivityDependency mo117462i() {
        return this.f82226c;
    }

    /* renamed from: h */
    public IMtRoomSignInContract.IViewAction mo109713b() {
        return new C32159b(this);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.signin.e$a */
    static final class RunnableC32158a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MeetingRoomSignInPresenter f82227a;

        RunnableC32158a(MeetingRoomSignInPresenter eVar) {
            this.f82227a = eVar;
        }

        public final void run() {
            MeetingRoomSignInPresenter.m122531a(this.f82227a, false, null, 2, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016J\b\u0010\u0007\u001a\u00020\u0003H\u0016J\b\u0010\b\u001a\u00020\u0003H\u0016J\b\u0010\t\u001a\u00020\u0003H\u0016J\b\u0010\n\u001a\u00020\u0003H\u0016J\b\u0010\u000b\u001a\u00020\u0003H\u0016J\b\u0010\f\u001a\u00020\u0003H\u0016¨\u0006\r"}, d2 = {"com/ss/android/lark/calendar/impl/features/meetingroom/signin/MeetingRoomSignInPresenter$getViewAction$1", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/signin/IMtRoomSignInContract$IViewAction;", "onAvatarClicked", "", BottomDialog.f17198f, "", "onBlockTvClicked", "onBookContainerClicked", "onCountDownViewFinished", "onLoadAgainViewClicked", "onResourceInfoContainerClicked", "onSignInTvClicked", "onTitleBarBackClicked", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.signin.e$b */
    public static final class C32159b implements IMtRoomSignInContract.IViewAction {

        /* renamed from: a */
        final /* synthetic */ MeetingRoomSignInPresenter f82228a;

        @Override // com.ss.android.lark.calendar.impl.features.meetingroom.signin.IMtRoomSignInContract.IViewAction
        /* renamed from: c */
        public void mo117374c() {
            this.f82228a.mo117462i().mo117337a();
        }

        @Override // com.ss.android.lark.calendar.impl.features.meetingroom.signin.IMtRoomSignInContract.IViewAction
        /* renamed from: e */
        public void mo117376e() {
            this.f82228a.mo117453a();
            this.f82228a.mo117458e();
        }

        @Override // com.ss.android.lark.calendar.impl.features.meetingroom.signin.IMtRoomSignInContract.IViewAction
        /* renamed from: f */
        public void mo117377f() {
            MeetingRoomSignInPresenter.m122531a(this.f82228a, false, null, 2, null);
        }

        @Override // com.ss.android.lark.calendar.impl.features.meetingroom.signin.IMtRoomSignInContract.IViewAction
        /* renamed from: g */
        public void mo117378g() {
            MeetingRoomSignInPresenter.m122531a(this.f82228a, false, null, 3, null);
        }

        @Override // com.ss.android.lark.calendar.impl.features.meetingroom.signin.IMtRoomSignInContract.IViewAction
        /* renamed from: a */
        public void mo117371a() {
            this.f82228a.mo117462i().mo117339a(((IMtRoomSignInContract.IMtRoomSignInModeApi) this.f82228a.mo118652t()).mo117350g());
            GeneralHitPoint.m124201a("scan_code", (String) null, 2, (Object) null);
        }

        @Override // com.ss.android.lark.calendar.impl.features.meetingroom.signin.IMtRoomSignInContract.IViewAction
        /* renamed from: b */
        public void mo117373b() {
            this.f82228a.mo117462i().mo117340a(((IMtRoomSignInContract.IMtRoomSignInModeApi) this.f82228a.mo118652t()).mo117350g(), ((IMtRoomSignInContract.IMtRoomSignInModeApi) this.f82228a.mo118652t()).mo117358o(), ((IMtRoomSignInContract.IMtRoomSignInModeApi) this.f82228a.mo118652t()).mo117359p());
            this.f82228a.mo117460g();
        }

        @Override // com.ss.android.lark.calendar.impl.features.meetingroom.signin.IMtRoomSignInContract.IViewAction
        /* renamed from: d */
        public void mo117375d() {
            if (((IMtRoomSignInContract.IMtRoomSignInModeApi) this.f82228a.mo118652t()).mo117343a() == MeetingRoomSignInState.IDLE && ((IMtRoomSignInContract.IMtRoomSignInModeApi) this.f82228a.mo118652t()).mo117354k() != 0) {
                AbstractC30054s loginDependency = C30022a.f74882a.loginDependency();
                Intrinsics.checkExpressionValueIsNotNull(loginDependency, "CalendarDependencyHolder…endency.loginDependency()");
                String a = loginDependency.mo108269a();
                TimeRange q = ((IMtRoomSignInContract.IMtRoomSignInModeApi) this.f82228a.mo118652t()).mo117360q();
                IActivityDependency i = this.f82228a.mo117462i();
                long a2 = q.mo117447a();
                long b = q.mo117448b();
                Intrinsics.checkExpressionValueIsNotNull(a, "selfChatterId");
                i.mo117338a(a2, b, a, ((IMtRoomSignInContract.IMtRoomSignInModeApi) this.f82228a.mo118652t()).mo117358o(), ((IMtRoomSignInContract.IMtRoomSignInModeApi) this.f82228a.mo118652t()).mo117359p());
                this.f82228a.mo117459f();
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C32159b(MeetingRoomSignInPresenter eVar) {
            this.f82228a = eVar;
        }

        @Override // com.ss.android.lark.calendar.impl.features.meetingroom.signin.IMtRoomSignInContract.IViewAction
        /* renamed from: a */
        public void mo117372a(String str) {
            Intrinsics.checkParameterIsNotNull(str, BottomDialog.f17198f);
            this.f82228a.mo117462i().mo117342c(str);
        }
    }

    @Override // com.ss.android.lark.calendar.impl.framework.calendarmvp.BasePresenterCalendar, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        m122531a(this, false, null, 3, null);
    }

    /* renamed from: d */
    public final void mo117457d() {
        ((IMtRoomSignInContract.IMtRoomSignInViewApi) mo118651s()).mo117365b();
        UICallbackExecutor.removeCallbacks(this.f82225b);
    }

    /* renamed from: c */
    public final void mo117456c() {
        MeetingRoomSignInState a = ((IMtRoomSignInContract.IMtRoomSignInModeApi) mo118652t()).mo117343a();
        if (a != null && C32164f.f82232a[a.ordinal()] == 1) {
            ((IMtRoomSignInContract.IMtRoomSignInViewApi) mo118651s()).mo117363a();
        } else {
            m122532a(false, C32162e.INSTANCE);
        }
    }

    /* renamed from: j */
    private final void m122533j() {
        MeetingRoomSignInState a = ((IMtRoomSignInContract.IMtRoomSignInModeApi) mo118652t()).mo117343a();
        if (a != MeetingRoomSignInState.NEED_CHECK_IN) {
            if (a != MeetingRoomSignInState.INACTIVE || ((IMtRoomSignInContract.IMtRoomSignInModeApi) mo118652t()).mo117349e() == InactiveReason.DURING_STRATEGY || ((IMtRoomSignInContract.IMtRoomSignInModeApi) mo118652t()).mo117349e() == InactiveReason.DURING_REQUISITION) {
                UICallbackExecutor.executeDelayed(this.f82225b, ((IMtRoomSignInContract.IMtRoomSignInModeApi) mo118652t()).mo117362s() * ((long) 1000));
            }
        }
    }

    /* renamed from: k */
    private final void m122534k() {
        String str;
        String str2;
        String calendarId;
        String name;
        CalendarResource o = ((IMtRoomSignInContract.IMtRoomSignInModeApi) mo118652t()).mo117358o();
        if (o == null || (name = o.getName()) == null) {
            str = "";
        } else {
            str = name;
        }
        CalendarResource o2 = ((IMtRoomSignInContract.IMtRoomSignInModeApi) mo118652t()).mo117358o();
        if (o2 == null || (calendarId = o2.getCalendarId()) == null) {
            str2 = "";
        } else {
            str2 = calendarId;
        }
        GeneralHitPoint.f83331a.mo118723a(str, str2, SignInStateHelper.f82200a.mo117409a(((IMtRoomSignInContract.IMtRoomSignInModeApi) mo118652t()).mo117347c(), ((IMtRoomSignInContract.IMtRoomSignInModeApi) mo118652t()).mo117348d()), SignInStateHelper.f82200a.mo117407a(((IMtRoomSignInContract.IMtRoomSignInModeApi) mo118652t()).mo117343a()), SignInStateHelper.f82200a.mo117415b(((IMtRoomSignInContract.IMtRoomSignInModeApi) mo118652t()).mo117348d()));
    }

    /* renamed from: e */
    public final void mo117458e() {
        String str;
        String str2;
        String calendarId;
        String name;
        CalendarResource o = ((IMtRoomSignInContract.IMtRoomSignInModeApi) mo118652t()).mo117358o();
        if (o == null || (name = o.getName()) == null) {
            str = "";
        } else {
            str = name;
        }
        CalendarResource o2 = ((IMtRoomSignInContract.IMtRoomSignInModeApi) mo118652t()).mo117358o();
        if (o2 == null || (calendarId = o2.getCalendarId()) == null) {
            str2 = "";
        } else {
            str2 = calendarId;
        }
        GeneralHitPoint.f83331a.mo118724a(str, str2, "scan_code", SignInStateHelper.f82200a.mo117409a(((IMtRoomSignInContract.IMtRoomSignInModeApi) mo118652t()).mo117347c(), ((IMtRoomSignInContract.IMtRoomSignInModeApi) mo118652t()).mo117348d()), ((IMtRoomSignInContract.IMtRoomSignInModeApi) mo118652t()).mo117361r());
    }

    /* renamed from: f */
    public final void mo117459f() {
        String str;
        String calendarId;
        CalendarResource o = ((IMtRoomSignInContract.IMtRoomSignInModeApi) mo118652t()).mo117358o();
        String str2 = "";
        if (o == null || (str = o.getName()) == null) {
            str = str2;
        }
        CalendarResource o2 = ((IMtRoomSignInContract.IMtRoomSignInModeApi) mo118652t()).mo117358o();
        if (!(o2 == null || (calendarId = o2.getCalendarId()) == null)) {
            str2 = calendarId;
        }
        GeneralHitPoint.f83331a.mo118722a(str, str2, SignInStateHelper.f82200a.mo117409a(((IMtRoomSignInContract.IMtRoomSignInModeApi) mo118652t()).mo117347c(), ((IMtRoomSignInContract.IMtRoomSignInModeApi) mo118652t()).mo117348d()), SignInStateHelper.f82200a.mo117407a(((IMtRoomSignInContract.IMtRoomSignInModeApi) mo118652t()).mo117343a()));
    }

    /* renamed from: g */
    public final void mo117460g() {
        String str;
        String str2;
        String calendarId;
        String name;
        CalendarResource o = ((IMtRoomSignInContract.IMtRoomSignInModeApi) mo118652t()).mo117358o();
        if (o == null || (name = o.getName()) == null) {
            str = "";
        } else {
            str = name;
        }
        CalendarResource o2 = ((IMtRoomSignInContract.IMtRoomSignInModeApi) mo118652t()).mo117358o();
        if (o2 == null || (calendarId = o2.getCalendarId()) == null) {
            str2 = "";
        } else {
            str2 = calendarId;
        }
        GeneralHitPoint.f83331a.mo118726b(str, str2, SignInStateHelper.f82200a.mo117409a(((IMtRoomSignInContract.IMtRoomSignInModeApi) mo118652t()).mo117347c(), ((IMtRoomSignInContract.IMtRoomSignInModeApi) mo118652t()).mo117348d()), SignInStateHelper.f82200a.mo117407a(((IMtRoomSignInContract.IMtRoomSignInModeApi) mo118652t()).mo117343a()), SignInStateHelper.f82200a.mo117415b(((IMtRoomSignInContract.IMtRoomSignInModeApi) mo118652t()).mo117348d()));
    }

    /* renamed from: a */
    public final void mo117453a() {
        CalendarEventInstance a;
        InstanceInfo b = ((IMtRoomSignInContract.IMtRoomSignInModeApi) mo118652t()).mo117346b();
        if (b != null && (a = b.mo120126a()) != null) {
            C32163f fVar = new C32163f(this);
            CalendarSDKService.Companion aVar = CalendarSDKService.f83473a;
            String h = ((IMtRoomSignInContract.IMtRoomSignInModeApi) mo118652t()).mo117351h();
            String eventServerId = a.getEventServerId();
            Intrinsics.checkExpressionValueIsNotNull(eventServerId, "signInstance.eventServerId");
            long startTime = a.getStartTime();
            long endTime = a.getEndTime();
            UIGetDataCallback wrapAndAddGetDataCallback = mo118653u().wrapAndAddGetDataCallback(fVar);
            Intrinsics.checkExpressionValueIsNotNull(wrapAndAddGetDataCallback, "callbackManager.wrapAndA…GetDataCallback(callback)");
            aVar.mo118935a(h, eventServerId, startTime, endTime, wrapAndAddGetDataCallback);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.signin.e$c */
    public static final class C32160c extends Lambda implements Function1<String, Unit> {
        final /* synthetic */ MeetingRoomSignInPresenter this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32160c(MeetingRoomSignInPresenter eVar) {
            super(1);
            this.this$0 = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke(str);
            return Unit.INSTANCE;
        }

        public final void invoke(String str) {
            Intrinsics.checkParameterIsNotNull(str, "it");
            ((IMtRoomSignInContract.IMtRoomSignInViewApi) this.this$0.mo118651s()).mo117364a(str);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.signin.e$e */
    public static final class C32162e extends Lambda implements Function1<String, Unit> {
        public static final C32162e INSTANCE = new C32162e();

        C32162e() {
            super(1);
        }

        public final void invoke(String str) {
            Intrinsics.checkParameterIsNotNull(str, "it");
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke(str);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/calendar/impl/features/meetingroom/signin/MeetingRoomSignInPresenter$sendCheckInRequest$callback$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/pb/calendarevents/CheckInByQRCodeResponse;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.signin.e$f */
    public static final class C32163f implements IGetDataCallback<CheckInByQRCodeResponse> {

        /* renamed from: a */
        final /* synthetic */ MeetingRoomSignInPresenter f82231a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C32163f(MeetingRoomSignInPresenter eVar) {
            this.f82231a = eVar;
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            ((IMtRoomSignInContract.IMtRoomSignInViewApi) this.f82231a.mo118651s()).mo117367d();
        }

        /* renamed from: a */
        public void onSuccess(CheckInByQRCodeResponse checkInByQRCodeResponse) {
            CheckInByQRCodeResponse.Status status;
            if (checkInByQRCodeResponse != null) {
                status = checkInByQRCodeResponse.mcheck_in_resp;
            } else {
                status = null;
            }
            if (status == CheckInByQRCodeResponse.Status.SUCCESS) {
                ((IMtRoomSignInContract.IMtRoomSignInViewApi) this.f82231a.mo118651s()).mo117366c();
            } else {
                ((IMtRoomSignInContract.IMtRoomSignInViewApi) this.f82231a.mo118651s()).mo117367d();
            }
            MeetingRoomSignInPresenter.m122531a(this.f82231a, false, null, 2, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/calendar/impl/features/meetingroom/signin/MeetingRoomSignInPresenter$loadResourceCheckInInfo$callback$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/GetResourceCheckInInfoResponse;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.signin.e$d */
    public static final class C32161d implements IGetDataCallback<GetResourceCheckInInfoResponse> {

        /* renamed from: a */
        final /* synthetic */ MeetingRoomSignInPresenter f82229a;

        /* renamed from: b */
        final /* synthetic */ Function1 f82230b;

        /* renamed from: a */
        public void onSuccess(GetResourceCheckInInfoResponse jVar) {
            Intrinsics.checkParameterIsNotNull(jVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            this.f82229a.f82224a = false;
            this.f82229a.mo117455a(jVar);
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            this.f82229a.f82224a = false;
            Function1 function1 = this.f82230b;
            String a = this.f82229a.mo117452a(errorResult.getErrorCode());
            Intrinsics.checkExpressionValueIsNotNull(a, "getErrorText(err.errorCode)");
            function1.invoke(a);
        }

        C32161d(MeetingRoomSignInPresenter eVar, Function1 function1) {
            this.f82229a = eVar;
            this.f82230b = function1;
        }
    }

    /* renamed from: a */
    public final void mo117454a(Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(bundle, "outState");
        ((IMtRoomSignInContract.IMtRoomSignInModeApi) mo118652t()).mo117344a(bundle);
    }

    /* renamed from: a */
    public final String mo117452a(int i) {
        if (!(i == 8026 || i == 8027)) {
            if (i != 8029) {
                if (i != 8034) {
                    if (i != 8040) {
                        return C32634ae.m125182b(R.string.Calendar_Common_FailToLoad3);
                    }
                }
            }
            return C32634ae.m125182b(R.string.Calendar_MeetingRoom_NoPermissionToReserveMeetingRoom);
        }
        return C32634ae.m125182b(R.string.Calendar_MeetingRoom_QRCodeExpired);
    }

    /* renamed from: a */
    public final void mo117455a(GetResourceCheckInInfoResponse jVar) {
        ((IMtRoomSignInContract.IMtRoomSignInModeApi) mo118652t()).mo117345a(jVar);
        if (((IMtRoomSignInContract.IMtRoomSignInModeApi) mo118652t()).mo117355l()) {
            this.f82226c.mo117341b(((IMtRoomSignInContract.IMtRoomSignInModeApi) mo118652t()).mo117357n());
            this.f82226c.mo117337a();
            return;
        }
        if (((IMtRoomSignInContract.IMtRoomSignInModeApi) mo118652t()).mo117356m()) {
            ((IMtRoomSignInContract.IMtRoomSignInViewApi) mo118651s()).mo117368e();
        }
        ((IMtRoomSignInContract.IMtRoomSignInModeApi) mo118652t()).mo117353j();
        ((IMtRoomSignInContract.IMtRoomSignInViewApi) mo118651s()).mo117370g();
        ((IMtRoomSignInContract.IMtRoomSignInViewApi) mo118651s()).mo117363a();
        m122533j();
        m122534k();
    }

    /* renamed from: a */
    private final void m122532a(boolean z, Function1<? super String, Unit> function1) {
        boolean z2;
        String i = ((IMtRoomSignInContract.IMtRoomSignInModeApi) mo118652t()).mo117352i();
        if (i.length() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2 && !this.f82224a) {
            this.f82224a = true;
            if (z) {
                ((IMtRoomSignInContract.IMtRoomSignInViewApi) mo118651s()).mo117369f();
            }
            C32161d dVar = new C32161d(this, function1);
            CalendarSDKService.Companion aVar = CalendarSDKService.f83473a;
            TimeZone timeZone = TimeZone.getDefault();
            Intrinsics.checkExpressionValueIsNotNull(timeZone, "TimeZone.getDefault()");
            String id = timeZone.getID();
            Intrinsics.checkExpressionValueIsNotNull(id, "TimeZone.getDefault().id");
            UIGetDataCallback wrapAndAddGetDataCallback = mo118653u().wrapAndAddGetDataCallback(dVar);
            Intrinsics.checkExpressionValueIsNotNull(wrapAndAddGetDataCallback, "callbackManager.wrapAndA…GetDataCallback(callback)");
            aVar.mo118954b(i, id, wrapAndAddGetDataCallback);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MeetingRoomSignInPresenter(IMtRoomSignInContract.IMtRoomSignInViewApi bVar, IMtRoomSignInContract.IMtRoomSignInModeApi aVar, IActivityDependency aVar2) {
        super(bVar, aVar);
        Intrinsics.checkParameterIsNotNull(bVar, "viewApi");
        Intrinsics.checkParameterIsNotNull(aVar, "model");
        Intrinsics.checkParameterIsNotNull(aVar2, "activityDependency");
        this.f82226c = aVar2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.ss.android.lark.calendar.impl.features.meetingroom.signin.e */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    static /* synthetic */ void m122531a(MeetingRoomSignInPresenter eVar, boolean z, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            function1 = new C32160c(eVar);
        }
        eVar.m122532a(z, function1);
    }
}
