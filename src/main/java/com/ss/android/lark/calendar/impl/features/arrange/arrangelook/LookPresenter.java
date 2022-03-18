package com.ss.android.lark.calendar.impl.features.arrange.arrangelook;

import android.os.Handler;
import android.os.Looper;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.mvp.BasePresenter;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.eventbus.EventBus;
import com.ss.android.lark.calendar.impl.features.arrange.arrangelook.ILookContract;
import com.ss.android.lark.calendar.impl.features.arrange.arrangelook.widget.LookPageView;
import com.ss.android.lark.calendar.impl.features.arrange.base.OnLoadEventInstances;
import com.ss.android.lark.calendar.impl.features.arrange.p1441a.AbstractC30095b;
import com.ss.android.lark.calendar.impl.features.calendarview.entity.DayEventChipViewData;
import com.ss.android.lark.calendar.impl.framework.hitpoint.performance.CalendarPerfMonitor;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30037ag;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0002\u001a\u001bB\u0017\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\b\u0010\f\u001a\u00020\rH\u0002J\u0006\u0010\u000e\u001a\u00020\u000fJ\b\u0010\u0010\u001a\u00020\u0004H\u0014J\b\u0010\u0011\u001a\u00020\rH\u0016J\u0010\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0018\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u000e\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0016J\b\u0010\u0018\u001a\u00020\rH\u0002J\b\u0010\u0019\u001a\u00020\rH\u0002R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/arrange/arrangelook/LookPresenter;", "Lcom/larksuite/framework/mvp/BasePresenter;", "Lcom/ss/android/lark/calendar/impl/features/arrange/arrangelook/ILookContract$ILookModel;", "Lcom/ss/android/lark/calendar/impl/features/arrange/arrangelook/ILookContract$ILookView;", "Lcom/ss/android/lark/calendar/impl/features/arrange/arrangelook/ILookContract$ILookView$ViewDelegate;", "model", "view", "(Lcom/ss/android/lark/calendar/impl/features/arrange/arrangelook/ILookContract$ILookModel;Lcom/ss/android/lark/calendar/impl/features/arrange/arrangelook/ILookContract$ILookView;)V", "mTimeFormatChangeListener", "Lcom/ss/android/lark/calendar/dependency/idependency/ITimeFormatDependency$ITimeFormatChangeListener;", "mUIHandler", "Landroid/os/Handler;", "createByMtRoom", "", "createModelDelegate", "Lcom/ss/android/lark/calendar/impl/features/arrange/arrangelook/ILookContract$ILookModel$ModelDelegate;", "createViewDelegate", "destroy", "fetchDayEventChipData", "page", "Lcom/ss/android/lark/calendar/impl/features/arrange/arrangelook/widget/LookPageView;", "isResume", "", "refreshAllPage", "registerTimeFormatChangePush", "unRegisterTimeFormatChangePush", "PresenterModelDelegate", "PresenterViewDelegate", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.arrange.arrangelook.c */
public final class LookPresenter extends BasePresenter<ILookContract.ILookModel, ILookContract.ILookView, ILookContract.ILookView.ViewDelegate> {

    /* renamed from: a */
    public final Handler f75077a = new Handler(Looper.getMainLooper());

    /* renamed from: b */
    private AbstractC30037ag.AbstractC30038a f75078b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u0004H\u0002J\b\u0010\u000b\u001a\u00020\u0004H\u0016J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000eH\u0016¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/arrange/arrangelook/LookPresenter$PresenterViewDelegate;", "Lcom/ss/android/lark/calendar/impl/features/arrange/arrangelook/ILookContract$ILookView$ViewDelegate;", "(Lcom/ss/android/lark/calendar/impl/features/arrange/arrangelook/LookPresenter;)V", "didAfterPagesInflated", "", "didMoveToCenterPage", "didMoveToFollowingPage", "didMoveToPreviousPage", "isFromProfile", "", "refreshCenterPageIfNeed", "refreshThreePage", "viewTimeZoneChanged", "timeZoneId", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.arrange.arrangelook.c$b */
    public final class PresenterViewDelegate implements ILookContract.ILookView.ViewDelegate {
        @Override // com.ss.android.lark.calendar.impl.features.arrange.arrangelook.ILookContract.ILookView.ViewDelegate
        /* renamed from: d */
        public void mo108549d() {
        }

        @Override // com.ss.android.lark.calendar.impl.features.arrange.arrangelook.ILookContract.ILookView.ViewDelegate
        /* renamed from: a */
        public void mo108545a() {
            LookPresenter.this.mo108560a(false);
        }

        @Override // com.ss.android.lark.calendar.impl.features.arrange.arrangelook.ILookContract.ILookView.ViewDelegate
        /* renamed from: f */
        public boolean mo108551f() {
            return ((ILookContract.ILookModel) LookPresenter.this.getModel()).mo108529f();
        }

        @Override // com.ss.android.lark.calendar.impl.features.arrange.arrangelook.ILookContract.ILookView.ViewDelegate
        /* renamed from: b */
        public void mo108547b() {
            m111477g();
            LookPageView c = ((ILookContract.ILookView) LookPresenter.this.getView()).mo108540c();
            c.getEventChipsLayer().mo108736a();
            LookPresenter.this.mo108559a(c);
        }

        @Override // com.ss.android.lark.calendar.impl.features.arrange.arrangelook.ILookContract.ILookView.ViewDelegate
        /* renamed from: c */
        public void mo108548c() {
            m111477g();
            LookPageView b = ((ILookContract.ILookView) LookPresenter.this.getView()).mo108539b();
            b.getEventChipsLayer().mo108736a();
            LookPresenter.this.mo108559a(b);
        }

        @Override // com.ss.android.lark.calendar.impl.features.arrange.arrangelook.ILookContract.ILookView.ViewDelegate
        /* renamed from: e */
        public void mo108550e() {
            if (!((ILookContract.ILookModel) LookPresenter.this.getModel()).mo108529f()) {
                LookPresenter.this.mo108558a();
            } else {
                ((ILookContract.ILookModel) LookPresenter.this.getModel()).mo108521a();
            }
        }

        /* renamed from: g */
        private final void m111477g() {
            LookPageView d = ((ILookContract.ILookView) LookPresenter.this.getView()).mo108541d();
            if (!d.mo108813b()) {
                ((ILookContract.ILookView) LookPresenter.this.getView()).mo108532a();
                LookPresenter.this.mo108559a(d);
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public PresenterViewDelegate() {
        }

        @Override // com.ss.android.lark.calendar.impl.features.arrange.arrangelook.ILookContract.ILookView.ViewDelegate
        /* renamed from: a */
        public void mo108546a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "timeZoneId");
            ((ILookContract.ILookModel) LookPresenter.this.getModel()).mo108524a(str);
            ((ILookContract.ILookView) LookPresenter.this.getView()).mo108539b().mo108812a(str);
            ((ILookContract.ILookView) LookPresenter.this.getView()).mo108541d().mo108812a(str);
            ((ILookContract.ILookView) LookPresenter.this.getView()).mo108540c().mo108812a(str);
            LookPresenter.this.mo108560a(false);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public ILookContract.ILookView.ViewDelegate createViewDelegate() {
        return new PresenterViewDelegate();
    }

    /* renamed from: c */
    public final ILookContract.ILookModel.ModelDelegate mo108562c() {
        return new PresenterModelDelegate();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "onTimeFormatChange"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.arrange.arrangelook.c$d */
    public static final class C30109d implements AbstractC30037ag.AbstractC30038a {

        /* renamed from: a */
        final /* synthetic */ LookPresenter f75088a;

        C30109d(LookPresenter cVar) {
            this.f75088a = cVar;
        }

        @Override // com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30037ag.AbstractC30038a
        /* renamed from: a */
        public final void mo108191a() {
            ((ILookContract.ILookView) this.f75088a.getView()).mo108542e();
        }
    }

    /* renamed from: e */
    private final void m111470e() {
        if (this.f75078b != null) {
            C30022a.f74882a.timeFormatDependency().mo108190b(this.f75078b);
        }
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        super.destroy();
        m111470e();
        EventBus.getDefault().unregister(this);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bH\u0016¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/arrange/arrangelook/LookPresenter$PresenterModelDelegate;", "Lcom/ss/android/lark/calendar/impl/features/arrange/arrangelook/ILookContract$ILookModel$ModelDelegate;", "(Lcom/ss/android/lark/calendar/impl/features/arrange/arrangelook/LookPresenter;)V", "onLoadAttendeeSuccess", "", "attendeList", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/calendar/impl/features/arrange/base/IArrangeBaseData;", "Lkotlin/collections/ArrayList;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.arrange.arrangelook.c$a */
    public final class PresenterModelDelegate implements ILookContract.ILookModel.ModelDelegate {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.features.arrange.arrangelook.c$a$a */
        static final class RunnableC30105a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ PresenterModelDelegate f75080a;

            /* renamed from: b */
            final /* synthetic */ ArrayList f75081b;

            RunnableC30105a(PresenterModelDelegate aVar, ArrayList arrayList) {
                this.f75080a = aVar;
                this.f75081b = arrayList;
            }

            public final void run() {
                ((ILookContract.ILookView) LookPresenter.this.getView()).mo108536a(this.f75081b);
                LookPresenter.this.mo108560a(false);
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public PresenterModelDelegate() {
        }

        @Override // com.ss.android.lark.calendar.impl.features.arrange.arrangelook.ILookContract.ILookModel.ModelDelegate
        /* renamed from: a */
        public void mo108531a(ArrayList<AbstractC30095b> arrayList) {
            Intrinsics.checkParameterIsNotNull(arrayList, "attendeList");
            LookPresenter.this.f75077a.post(new RunnableC30105a(this, arrayList));
        }
    }

    /* renamed from: d */
    private final void m111469d() {
        this.f75078b = new C30109d(this);
        C30022a.f74882a.timeFormatDependency().mo108188a(this.f75078b);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016JB\u0010\u0006\u001a\u00020\u000328\u0010\u0007\u001a4\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\bj\u001e\u0012\u0004\u0012\u00020\t\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\r`\fH\u0016¨\u0006\u000e"}, d2 = {"com/ss/android/lark/calendar/impl/features/arrange/arrangelook/LookPresenter$fetchDayEventChipData$1", "Lcom/ss/android/lark/calendar/impl/features/arrange/base/OnLoadEventInstances;", "onLoadFailed", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onLoadSucceed", "eventInstances", "Ljava/util/HashMap;", "", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/calendar/impl/features/calendarview/entity/DayEventChipViewData;", "Lkotlin/collections/HashMap;", "Lkotlin/collections/ArrayList;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.arrange.arrangelook.c$c */
    public static final class C30106c implements OnLoadEventInstances {

        /* renamed from: a */
        final /* synthetic */ LookPresenter f75083a;

        /* renamed from: b */
        final /* synthetic */ LookPageView f75084b;

        /* renamed from: c */
        final /* synthetic */ boolean f75085c;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.features.arrange.arrangelook.c$c$a */
        static final class RunnableC30107a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C30106c f75086a;

            RunnableC30107a(C30106c cVar) {
                this.f75086a = cVar;
            }

            public final void run() {
                if (!this.f75086a.f75085c) {
                    this.f75086a.f75084b.getEventChipsLayer().mo108736a();
                }
                ((ILookContract.ILookView) this.f75086a.f75083a.getView()).mo108533a(this.f75086a.f75084b);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.features.arrange.arrangelook.c$c$b */
        static final class RunnableC30108b implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C30106c f75087a;

            RunnableC30108b(C30106c cVar) {
                this.f75087a = cVar;
            }

            public final void run() {
                ((ILookContract.ILookView) this.f75087a.f75083a.getView()).mo108538a(((ILookContract.ILookModel) this.f75087a.f75083a.getModel()).mo108526c(), ((ILookContract.ILookModel) this.f75087a.f75083a.getModel()).mo108528e());
                ((ILookContract.ILookView) this.f75087a.f75083a.getView()).mo108537a(((ILookContract.ILookModel) this.f75087a.f75083a.getModel()).mo108527d(), ((ILookContract.ILookModel) this.f75087a.f75083a.getModel()).mo108526c(), ((ILookContract.ILookModel) this.f75087a.f75083a.getModel()).mo108528e());
            }
        }

        @Override // com.ss.android.lark.calendar.impl.features.arrange.base.OnLoadEventInstances
        /* renamed from: a */
        public void mo108498a(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            this.f75083a.f75077a.post(new RunnableC30107a(this));
            CalendarPerfMonitor.m124417b("key_freebusy_view");
        }

        @Override // com.ss.android.lark.calendar.impl.features.arrange.base.OnLoadEventInstances
        /* renamed from: a */
        public void mo108499a(HashMap<String, ArrayList<DayEventChipViewData>> hashMap) {
            Intrinsics.checkParameterIsNotNull(hashMap, "eventInstances");
            if (!((ILookContract.ILookModel) this.f75083a.getModel()).mo108529f()) {
                String g = ((ILookContract.ILookModel) this.f75083a.getModel()).mo108530g();
                if (g != null) {
                    ((ILookContract.ILookView) this.f75083a.getView()).mo108534a(this.f75084b, g, ((ILookContract.ILookModel) this.f75083a.getModel()).mo108520a(hashMap));
                    return;
                }
                return;
            }
            ((ILookContract.ILookView) this.f75083a.getView()).mo108535a(this.f75084b, hashMap);
            this.f75083a.f75077a.post(new RunnableC30108b(this));
        }

        C30106c(LookPresenter cVar, LookPageView aVar, boolean z) {
            this.f75083a = cVar;
            this.f75084b = aVar;
            this.f75085c = z;
        }
    }

    /* renamed from: a */
    public final void mo108558a() {
        ((ILookContract.ILookView) getView()).mo108543f();
        ((ILookContract.ILookView) getView()).mo108544g();
        mo108560a(false);
    }

    /* renamed from: a */
    public final void mo108559a(LookPageView aVar) {
        m111468a(aVar, false);
    }

    /* renamed from: a */
    public final void mo108560a(boolean z) {
        if (!((ILookContract.ILookModel) getModel()).mo108529f() || !CollectionUtils.isEmpty(((ILookContract.ILookModel) getModel()).mo108525b())) {
            m111468a(((ILookContract.ILookView) getView()).mo108539b(), z);
            m111468a(((ILookContract.ILookView) getView()).mo108541d(), z);
            m111468a(((ILookContract.ILookView) getView()).mo108540c(), z);
        }
    }

    /* renamed from: a */
    private final void m111468a(LookPageView aVar, boolean z) {
        ((ILookContract.ILookModel) getModel()).mo108523a(aVar.getDate(), new C30106c(this, aVar, z));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LookPresenter(ILookContract.ILookModel aVar, ILookContract.ILookView bVar) {
        super(aVar, bVar);
        Intrinsics.checkParameterIsNotNull(aVar, "model");
        Intrinsics.checkParameterIsNotNull(bVar, "view");
        aVar.mo108522a(mo108562c());
        EventBus.getDefault().register(this);
        m111469d();
    }
}
