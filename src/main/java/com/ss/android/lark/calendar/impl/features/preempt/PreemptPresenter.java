package com.ss.android.lark.calendar.impl.features.preempt;

import android.os.Handler;
import android.os.Looper;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.android.HwBuildEx;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.mvp.BasePresenter;
import com.ss.android.lark.calendar.impl.features.preempt.PreemptContract;
import com.ss.android.lark.calendar.impl.features.preempt.listener.OnLoadMeetingRoomData;
import com.ss.android.lark.calendar.impl.features.preempt.listener.OnPreemptMeetingRoom;
import com.ss.android.lark.calendar.impl.features.preempt.listener.OnSaveNeedPopUpWindow;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event.GeneralHitPoint;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000  2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0004\u001f !\"B\u001f\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010\u0015\u001a\u00020\u0016H\u0002J\b\u0010\u0017\u001a\u00020\u0016H\u0016J\b\u0010\u0018\u001a\u00020\u0019H\u0002J\b\u0010\u001a\u001a\u00020\u0004H\u0014J\b\u0010\u001b\u001a\u00020\u0016H\u0002J\b\u0010\u001c\u001a\u00020\u0016H\u0002J\u0006\u0010\u001d\u001a\u00020\u0016J\u0006\u0010\u001e\u001a\u00020\u0016R\u000e\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/preempt/PreemptPresenter;", "Lcom/larksuite/framework/mvp/BasePresenter;", "Lcom/ss/android/lark/calendar/impl/features/preempt/PreemptContract$IPreemptModel;", "Lcom/ss/android/lark/calendar/impl/features/preempt/PreemptContract$IPreemptView;", "Lcom/ss/android/lark/calendar/impl/features/preempt/PreemptContract$IPreemptView$ViewDelegate;", "model", "view", "context", "Lcom/ss/android/lark/calendar/impl/features/preempt/PreemptPresenter$ActivityDependency;", "(Lcom/ss/android/lark/calendar/impl/features/preempt/PreemptContract$IPreemptModel;Lcom/ss/android/lark/calendar/impl/features/preempt/PreemptContract$IPreemptView;Lcom/ss/android/lark/calendar/impl/features/preempt/PreemptPresenter$ActivityDependency;)V", "lastUpdateTime", "", "mActivityDependency", "mHandler", "Landroid/os/Handler;", "mHasFailed", "", "mIsFirstGetData", "mRunnable", "Ljava/lang/Runnable;", "mUIHandler", "checkMeetingRoomAvailable", "", "create", "createModelDelegate", "Lcom/ss/android/lark/calendar/impl/features/preempt/PreemptContract$IPreemptModel$ModelDelegate;", "createViewDelegate", "fetchMeetingRoomData", "initCycle", "startPolling", "stopPolling", "ActivityDependency", "Companion", "PresenterModelDelegate", "PresenterViewDelegate", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.preempt.c */
public final class PreemptPresenter extends BasePresenter<PreemptContract.IPreemptModel, PreemptContract.IPreemptView, PreemptContract.IPreemptView.ViewDelegate> {

    /* renamed from: g */
    public static final Companion f82454g = new Companion(null);

    /* renamed from: a */
    public final ActivityDependency f82455a;

    /* renamed from: b */
    public final Handler f82456b = new Handler(Looper.getMainLooper());

    /* renamed from: c */
    public final Handler f82457c = new Handler();

    /* renamed from: d */
    public boolean f82458d = true;

    /* renamed from: e */
    public boolean f82459e;

    /* renamed from: f */
    public long f82460f;

    /* renamed from: h */
    private Runnable f82461h;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH&¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/preempt/PreemptPresenter$ActivityDependency;", "", "finishActivity", "", "setActivityResult", "requestCode", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/content/Intent;", "startEventDetailActivity", "calendarEvent", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEvent;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.preempt.c$a */
    public interface ActivityDependency {
        /* renamed from: a */
        void mo117798a(CalendarEvent calendarEvent);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/preempt/PreemptPresenter$Companion;", "", "()V", "POLL_TIME", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.preempt.c$b */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: e */
    private final PreemptContract.IPreemptModel.ModelDelegate m122941e() {
        return new PresenterModelDelegate();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public PreemptContract.IPreemptView.ViewDelegate createViewDelegate() {
        return new PresenterViewDelegate();
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        m122943g();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0004H\u0016J\b\u0010\t\u001a\u00020\u0004H\u0016J\b\u0010\n\u001a\u00020\u0004H\u0016J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\rH\u0016¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/preempt/PreemptPresenter$PresenterViewDelegate;", "Lcom/ss/android/lark/calendar/impl/features/preempt/PreemptContract$IPreemptView$ViewDelegate;", "(Lcom/ss/android/lark/calendar/impl/features/preempt/PreemptPresenter;)V", "onDialogConfirmClicked", "", "isCheck", "", "onProgressBarTimeFinish", "onProgressBarTimeUnFinish", "onProgressPreemptBtnClicked", "onRefreshSheetItems", "onSheetConfirmClicked", "endTime", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.preempt.c$d */
    public final class PresenterViewDelegate implements PreemptContract.IPreemptView.ViewDelegate {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/lark/calendar/impl/features/preempt/PreemptPresenter$PresenterViewDelegate$onDialogConfirmClicked$1", "Lcom/ss/android/lark/calendar/impl/features/preempt/listener/OnSaveNeedPopUpWindow;", "onSaveFailed", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSaveSucceed", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.features.preempt.c$d$a */
        public static final class C32235a implements OnSaveNeedPopUpWindow {

            /* renamed from: a */
            final /* synthetic */ PresenterViewDelegate f82465a;

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
            /* renamed from: com.ss.android.lark.calendar.impl.features.preempt.c$d$a$a */
            static final class RunnableC32236a implements Runnable {

                /* renamed from: a */
                final /* synthetic */ C32235a f82466a;

                RunnableC32236a(C32235a aVar) {
                    this.f82466a = aVar;
                }

                public final void run() {
                    ((PreemptContract.IPreemptView) PreemptPresenter.this.getView()).mo117835m();
                }
            }

            @Override // com.ss.android.lark.calendar.impl.features.preempt.listener.OnSaveNeedPopUpWindow
            /* renamed from: a */
            public void mo117851a() {
                ((PreemptContract.IPreemptView) PreemptPresenter.this.getView()).mo117822a(((PreemptContract.IPreemptModel) PreemptPresenter.this.getModel()).mo117811i());
                ((PreemptContract.IPreemptView) PreemptPresenter.this.getView()).mo117839q();
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            C32235a(PresenterViewDelegate dVar) {
                this.f82465a = dVar;
            }

            @Override // com.ss.android.lark.calendar.impl.features.preempt.listener.OnSaveNeedPopUpWindow
            /* renamed from: a */
            public void mo117852a(ErrorResult errorResult) {
                Intrinsics.checkParameterIsNotNull(errorResult, "err");
                ((PreemptContract.IPreemptView) PreemptPresenter.this.getView()).mo117839q();
                PreemptPresenter.this.f82457c.postDelayed(new RunnableC32236a(this), 300);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/calendar/impl/features/preempt/PreemptPresenter$PresenterViewDelegate$onSheetConfirmClicked$1", "Lcom/ss/android/lark/calendar/impl/features/preempt/listener/OnPreemptMeetingRoom;", "onLoadFailed", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onLoadSucceed", "calendarEvent", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEvent;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.features.preempt.c$d$b */
        public static final class C32237b implements OnPreemptMeetingRoom {

            /* renamed from: a */
            final /* synthetic */ PresenterViewDelegate f82467a;

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
            /* renamed from: com.ss.android.lark.calendar.impl.features.preempt.c$d$b$a */
            static final class RunnableC32238a implements Runnable {

                /* renamed from: a */
                final /* synthetic */ C32237b f82468a;

                RunnableC32238a(C32237b bVar) {
                    this.f82468a = bVar;
                }

                public final void run() {
                    ((PreemptContract.IPreemptView) PreemptPresenter.this.getView()).mo117834l();
                }
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            C32237b(PresenterViewDelegate dVar) {
                this.f82467a = dVar;
            }

            @Override // com.ss.android.lark.calendar.impl.features.preempt.listener.OnPreemptMeetingRoom
            /* renamed from: a */
            public void mo117850a(CalendarEvent calendarEvent) {
                Intrinsics.checkParameterIsNotNull(calendarEvent, "calendarEvent");
                ((PreemptContract.IPreemptView) PreemptPresenter.this.getView()).mo117838p();
                PreemptPresenter.this.f82455a.mo117798a(calendarEvent);
            }

            @Override // com.ss.android.lark.calendar.impl.features.preempt.listener.OnPreemptMeetingRoom
            /* renamed from: a */
            public void mo117849a(ErrorResult errorResult) {
                Intrinsics.checkParameterIsNotNull(errorResult, "err");
                ((PreemptContract.IPreemptView) PreemptPresenter.this.getView()).mo117837o();
                ((PreemptContract.IPreemptView) PreemptPresenter.this.getView()).mo117838p();
                PreemptPresenter.this.f82456b.postDelayed(new RunnableC32238a(this), 300);
            }
        }

        @Override // com.ss.android.lark.calendar.impl.features.preempt.PreemptContract.IPreemptView.ViewDelegate
        /* renamed from: a */
        public void mo117840a() {
            ((PreemptContract.IPreemptView) PreemptPresenter.this.getView()).mo117821a(((PreemptContract.IPreemptModel) PreemptPresenter.this.getModel()).mo117810h(), true);
        }

        @Override // com.ss.android.lark.calendar.impl.features.preempt.PreemptContract.IPreemptView.ViewDelegate
        /* renamed from: b */
        public void mo117843b() {
            ((PreemptContract.IPreemptView) PreemptPresenter.this.getView()).mo117821a(((PreemptContract.IPreemptModel) PreemptPresenter.this.getModel()).mo117806d(), true);
        }

        @Override // com.ss.android.lark.calendar.impl.features.preempt.PreemptContract.IPreemptView.ViewDelegate
        /* renamed from: d */
        public void mo117845d() {
            ((PreemptContract.IPreemptView) PreemptPresenter.this.getView()).mo117824b(((PreemptContract.IPreemptModel) PreemptPresenter.this.getModel()).mo117811i());
        }

        @Override // com.ss.android.lark.calendar.impl.features.preempt.PreemptContract.IPreemptView.ViewDelegate
        /* renamed from: c */
        public void mo117844c() {
            if (((PreemptContract.IPreemptModel) PreemptPresenter.this.getModel()).mo117804b()) {
                ((PreemptContract.IPreemptView) PreemptPresenter.this.getView()).mo117832j();
            } else {
                ((PreemptContract.IPreemptView) PreemptPresenter.this.getView()).mo117822a(((PreemptContract.IPreemptModel) PreemptPresenter.this.getModel()).mo117811i());
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public PresenterViewDelegate() {
        }

        @Override // com.ss.android.lark.calendar.impl.features.preempt.PreemptContract.IPreemptView.ViewDelegate
        /* renamed from: a */
        public void mo117841a(long j) {
            ((PreemptContract.IPreemptModel) PreemptPresenter.this.getModel()).mo117799a(j, new C32237b(this));
        }

        @Override // com.ss.android.lark.calendar.impl.features.preempt.PreemptContract.IPreemptView.ViewDelegate
        /* renamed from: a */
        public void mo117842a(boolean z) {
            ((PreemptContract.IPreemptModel) PreemptPresenter.this.getModel()).mo117802a(!z, new C32235a(this));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/preempt/PreemptPresenter$PresenterModelDelegate;", "Lcom/ss/android/lark/calendar/impl/features/preempt/PreemptContract$IPreemptModel$ModelDelegate;", "(Lcom/ss/android/lark/calendar/impl/features/preempt/PreemptPresenter;)V", "onSpareTimeChanged", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.preempt.c$c */
    public final class PresenterModelDelegate implements PreemptContract.IPreemptModel.ModelDelegate {
        @Override // com.ss.android.lark.calendar.impl.features.preempt.PreemptContract.IPreemptModel.ModelDelegate
        /* renamed from: a */
        public void mo117815a() {
            PreemptPresenter.this.f82456b.post(new RunnableC32234a(this));
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.features.preempt.c$c$a */
        static final class RunnableC32234a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ PresenterModelDelegate f82463a;

            RunnableC32234a(PresenterModelDelegate cVar) {
                this.f82463a = cVar;
            }

            public final void run() {
                ((PreemptContract.IPreemptView) PreemptPresenter.this.getView()).mo117818a(((PreemptContract.IPreemptModel) PreemptPresenter.this.getModel()).mo117813k(), ((PreemptContract.IPreemptModel) PreemptPresenter.this.getModel()).mo117814l());
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public PresenterModelDelegate() {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/lark/calendar/impl/features/preempt/PreemptPresenter$fetchMeetingRoomData$1", "Lcom/ss/android/lark/calendar/impl/features/preempt/listener/OnLoadMeetingRoomData;", "onLoadFailed", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onLoadSucceed", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.preempt.c$e */
    public static final class C32239e implements OnLoadMeetingRoomData {

        /* renamed from: a */
        final /* synthetic */ PreemptPresenter f82469a;

        @Override // com.ss.android.lark.calendar.impl.features.preempt.listener.OnLoadMeetingRoomData
        /* renamed from: a */
        public void mo117847a() {
            this.f82469a.f82456b.post(new RunnableC32243b(this));
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.features.preempt.c$e$a */
        static final class RunnableC32240a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C32239e f82470a;

            /* renamed from: b */
            final /* synthetic */ ErrorResult f82471b;

            RunnableC32240a(C32239e eVar, ErrorResult errorResult) {
                this.f82470a = eVar;
                this.f82471b = errorResult;
            }

            public final void run() {
                this.f82470a.f82469a.f82459e = true;
                if (this.f82470a.f82469a.f82458d) {
                    GeneralHitPoint.m124268q("others");
                }
                switch (this.f82471b.getErrorCode()) {
                    case 8025:
                        ((PreemptContract.IPreemptView) this.f82470a.f82469a.getView()).mo117826d();
                        return;
                    case 8026:
                        ((PreemptContract.IPreemptView) this.f82470a.f82469a.getView()).mo117825c();
                        return;
                    case 8027:
                        ((PreemptContract.IPreemptView) this.f82470a.f82469a.getView()).mo117827e();
                        return;
                    case 8028:
                        ((PreemptContract.IPreemptView) this.f82470a.f82469a.getView()).mo117828f();
                        return;
                    case 8029:
                        ((PreemptContract.IPreemptView) this.f82470a.f82469a.getView()).mo117829g();
                        return;
                    default:
                        if (this.f82470a.f82469a.f82458d) {
                            this.f82470a.f82469a.f82456b.post(new Runnable(this) {
                                /* class com.ss.android.lark.calendar.impl.features.preempt.PreemptPresenter.C32239e.RunnableC32240a.RunnableC322411 */

                                /* renamed from: a */
                                final /* synthetic */ RunnableC32240a f82472a;

                                {
                                    this.f82472a = r1;
                                }

                                public final void run() {
                                    ((PreemptContract.IPreemptView) this.f82472a.f82470a.f82469a.getView()).mo117825c();
                                }
                            });
                            this.f82470a.f82469a.f82458d = false;
                            return;
                        }
                        this.f82470a.f82469a.f82456b.post(new Runnable(this) {
                            /* class com.ss.android.lark.calendar.impl.features.preempt.PreemptPresenter.C32239e.RunnableC32240a.RunnableC322422 */

                            /* renamed from: a */
                            final /* synthetic */ RunnableC32240a f82473a;

                            {
                                this.f82473a = r1;
                            }

                            public final void run() {
                                ((PreemptContract.IPreemptView) this.f82473a.f82470a.f82469a.getView()).mo117833k();
                                this.f82473a.f82470a.f82469a.f82459e = false;
                            }
                        });
                        return;
                }
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.features.preempt.c$e$b */
        static final class RunnableC32243b implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C32239e f82474a;

            RunnableC32243b(C32239e eVar) {
                this.f82474a = eVar;
            }

            public final void run() {
                String str;
                ((PreemptContract.IPreemptView) this.f82474a.f82469a.getView()).mo117823b();
                String c = ((PreemptContract.IPreemptModel) this.f82474a.f82469a.getModel()).mo117805c();
                boolean f = ((PreemptContract.IPreemptModel) this.f82474a.f82469a.getModel()).mo117808f();
                if (!f) {
                    str = ((PreemptContract.IPreemptModel) this.f82474a.f82469a.getModel()).mo117806d();
                    if (str.equals("not empty duration")) {
                        ((PreemptContract.IPreemptView) this.f82474a.f82469a.getView()).mo117831i();
                        if (!this.f82474a.f82469a.f82458d) {
                            ((PreemptContract.IPreemptView) this.f82474a.f82469a.getView()).mo117836n();
                        }
                        this.f82474a.f82469a.f82459e = true;
                    } else {
                        if (this.f82474a.f82469a.f82458d) {
                            GeneralHitPoint.m124268q("normal");
                        }
                        ((PreemptContract.IPreemptView) this.f82474a.f82469a.getView()).mo117817a(((PreemptContract.IPreemptModel) this.f82474a.f82469a.getModel()).mo117812j(), ((PreemptContract.IPreemptModel) this.f82474a.f82469a.getModel()).mo117813k());
                    }
                } else {
                    str = ((PreemptContract.IPreemptModel) this.f82474a.f82469a.getModel()).mo117807e();
                    ((PreemptContract.IPreemptView) this.f82474a.f82469a.getView()).mo117819a(((PreemptContract.IPreemptModel) this.f82474a.f82469a.getModel()).mo117809g());
                    ((PreemptContract.IPreemptView) this.f82474a.f82469a.getView()).mo117830h();
                    this.f82474a.f82469a.f82459e = true;
                    if (this.f82474a.f82469a.f82458d) {
                        GeneralHitPoint.m124268q("others");
                    }
                }
                ((PreemptContract.IPreemptView) this.f82474a.f82469a.getView()).mo117820a(c);
                ((PreemptContract.IPreemptView) this.f82474a.f82469a.getView()).mo117821a(str, !f);
                this.f82474a.f82469a.f82458d = false;
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C32239e(PreemptPresenter cVar) {
            this.f82469a = cVar;
        }

        @Override // com.ss.android.lark.calendar.impl.features.preempt.listener.OnLoadMeetingRoomData
        /* renamed from: a */
        public void mo117848a(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            this.f82469a.f82456b.post(new RunnableC32240a(this, errorResult));
        }
    }

    /* renamed from: f */
    private final void m122942f() {
        this.f82461h = new RunnableC32244f(this);
    }

    /* renamed from: d */
    public final void mo117881d() {
        Handler handler = this.f82457c;
        Runnable runnable = this.f82461h;
        if (runnable == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRunnable");
        }
        handler.removeCallbacks(runnable);
    }

    /* renamed from: a */
    public final void mo117878a() {
        ((PreemptContract.IPreemptModel) getModel()).mo117801a(new C32239e(this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/lark/calendar/impl/features/preempt/PreemptPresenter$initCycle$1", "Ljava/lang/Runnable;", "run", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.preempt.c$f */
    public static final class RunnableC32244f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ PreemptPresenter f82475a;

        public void run() {
            if (!this.f82475a.f82459e) {
                this.f82475a.mo117878a();
                this.f82475a.f82460f = System.currentTimeMillis();
                this.f82475a.f82457c.postDelayed(this, (long) HwBuildEx.VersionCodes.CUR_DEVELOPMENT);
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        RunnableC32244f(PreemptPresenter cVar) {
            this.f82475a = cVar;
        }
    }

    /* renamed from: g */
    private final void m122943g() {
        if (((PreemptContract.IPreemptModel) getModel()).mo117803a()) {
            ((PreemptContract.IPreemptView) getView()).mo117816a();
            return;
        }
        ((PreemptContract.IPreemptView) getView()).mo117825c();
        this.f82459e = true;
    }

    /* renamed from: c */
    public final void mo117880c() {
        Handler handler = this.f82457c;
        Runnable runnable = this.f82461h;
        if (runnable == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRunnable");
        }
        handler.removeCallbacks(runnable);
        if (!this.f82459e) {
            long j = (long) HwBuildEx.VersionCodes.CUR_DEVELOPMENT;
            long currentTimeMillis = j - (System.currentTimeMillis() - this.f82460f);
            if (currentTimeMillis < 0 || currentTimeMillis > j) {
                Handler handler2 = this.f82457c;
                Runnable runnable2 = this.f82461h;
                if (runnable2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mRunnable");
                }
                handler2.post(runnable2);
                return;
            }
            Handler handler3 = this.f82457c;
            Runnable runnable3 = this.f82461h;
            if (runnable3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mRunnable");
            }
            handler3.postDelayed(runnable3, currentTimeMillis);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PreemptPresenter(PreemptContract.IPreemptModel aVar, PreemptContract.IPreemptView bVar, ActivityDependency aVar2) {
        super(aVar, bVar);
        Intrinsics.checkParameterIsNotNull(aVar, "model");
        Intrinsics.checkParameterIsNotNull(bVar, "view");
        Intrinsics.checkParameterIsNotNull(aVar2, "context");
        this.f82455a = aVar2;
        aVar.mo117800a(m122941e());
        m122942f();
    }
}
