package com.ss.android.lark.integrator.calendar.dependency;

import com.ss.android.lark.biz.core.api.AbstractC29586u;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.calendar.dependency.idependency.IAppLifeCycleDependency;
import com.ss.android.lark.utils.ApiUtils;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0007H\u0016J\b\u0010\u000f\u001a\u00020\rH\u0002J\u0010\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0007H\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R!\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068BX\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/integrator/calendar/dependency/CalAppLifeCycleDependency;", "Lcom/ss/android/lark/calendar/dependency/idependency/IAppLifeCycleDependency;", "()V", "mAppLifeCycleObserver", "Lcom/ss/android/lark/biz/core/api/ILifecycleObserver;", "mAppStateChangeListeners", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lcom/ss/android/lark/calendar/dependency/idependency/IAppLifeCycleDependency$IAppStateChangeListener;", "getMAppStateChangeListeners", "()Ljava/util/concurrent/CopyOnWriteArrayList;", "mAppStateChangeListeners$delegate", "Lkotlin/Lazy;", "addAppStateChangeListener", "", "listener", "makeLifeCycleObserver", "removeAppStateChangeListener", "calendar_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.integrator.calendar.dependency.c */
public final class CalAppLifeCycleDependency implements IAppLifeCycleDependency {

    /* renamed from: a */
    private AbstractC29586u f100491a;

    /* renamed from: b */
    private final Lazy f100492b = LazyKt.lazy(C39203a.INSTANCE);

    /* renamed from: a */
    public final CopyOnWriteArrayList<IAppLifeCycleDependency.IAppStateChangeListener> mo143033a() {
        return (CopyOnWriteArrayList) this.f100492b.getValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lcom/ss/android/lark/calendar/dependency/idependency/IAppLifeCycleDependency$IAppStateChangeListener;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.integrator.calendar.dependency.c$a */
    static final class C39203a extends Lambda implements Function0<CopyOnWriteArrayList<IAppLifeCycleDependency.IAppStateChangeListener>> {
        public static final C39203a INSTANCE = new C39203a();

        C39203a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CopyOnWriteArrayList<IAppLifeCycleDependency.IAppStateChangeListener> invoke() {
            return new CopyOnWriteArrayList<>();
        }
    }

    /* renamed from: b */
    private final void m154590b() {
        if (this.f100491a == null) {
            this.f100491a = new C39204b(this);
        }
    }

    @Override // com.ss.android.lark.calendar.dependency.idependency.IAppLifeCycleDependency
    /* renamed from: a */
    public void mo108205a(IAppLifeCycleDependency.IAppStateChangeListener aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "listener");
        mo143033a().add(aVar);
        if (this.f100491a == null) {
            m154590b();
            ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).addAppLifecycleObserver(this.f100491a);
        }
    }

    @Override // com.ss.android.lark.calendar.dependency.idependency.IAppLifeCycleDependency
    /* renamed from: b */
    public void mo108206b(IAppLifeCycleDependency.IAppStateChangeListener aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "listener");
        mo143033a().remove(aVar);
        if (this.f100491a != null && mo143033a().size() == 0) {
            ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).removeAppLifecycleObserver(this.f100491a);
            this.f100491a = null;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Lcom/ss/android/lark/biz/core/api/ILifecycleObserver$AppStateInfo;", "newState", "onAppLifecycleChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.integrator.calendar.dependency.c$b */
    public static final class C39204b implements AbstractC29586u {

        /* renamed from: a */
        final /* synthetic */ CalAppLifeCycleDependency f100493a;

        C39204b(CalAppLifeCycleDependency cVar) {
            this.f100493a = cVar;
        }

        @Override // com.ss.android.lark.biz.core.api.AbstractC29586u
        public final void onAppLifecycleChanged(AbstractC29586u.C29587a aVar, AbstractC29586u.C29587a aVar2) {
            Intrinsics.checkParameterIsNotNull(aVar, "<anonymous parameter 0>");
            Intrinsics.checkParameterIsNotNull(aVar2, "newState");
            boolean c = aVar2.mo105887c();
            Iterator<IAppLifeCycleDependency.IAppStateChangeListener> it = this.f100493a.mo143033a().iterator();
            while (it.hasNext()) {
                it.next().mo108207a(c);
            }
        }
    }
}
