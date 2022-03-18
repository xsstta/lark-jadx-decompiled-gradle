package com.ss.android.lark.multitask.floating;

import android.app.Application;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.ss.android.lark.biz.core.api.ContentStateChangeCallback;
import com.ss.android.lark.floating.PermissionUtils;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.multitask.C48335j;
import com.ss.android.lark.multitask.IMultitaskDependency;
import com.ss.android.lark.multitask.floating.AppFloat;
import com.ss.android.lark.multitask.task.C48376q;
import com.ss.android.lark.multitask.task.GlobalTaskContainerImpl;
import com.ss.android.lark.multitask.tasklist.MultitaskListActivity;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u000f\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J2\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 J\u0016\u0010!\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%J\u000e\u0010&\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020#J\u0006\u0010'\u001a\u00020\u0015J\u0006\u0010(\u001a\u00020\u0015J\u0010\u0010)\u001a\u00020\u00152\u0006\u0010*\u001a\u00020+H\u0007J\u000e\u0010,\u001a\u00020\u00152\u0006\u0010-\u001a\u00020.J\u001e\u0010/\u001a\u00020\u00152\f\u00100\u001a\b\u0012\u0004\u0012\u00020\u0012012\u0006\u00102\u001a\u00020\u0012H\u0016J\u001e\u00103\u001a\u00020\u00152\f\u00100\u001a\b\u0012\u0004\u0012\u00020\u0012012\u0006\u00104\u001a\u00020\u0012H\u0016J\b\u00105\u001a\u00020\u0015H\u0016J\b\u00106\u001a\u00020\u0015H\u0016J\u001e\u00107\u001a\u00020\u00152\f\u00100\u001a\b\u0012\u0004\u0012\u00020\u0012012\u0006\u00108\u001a\u00020\u0012H\u0002J\u000e\u00109\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u0005J\u0016\u0010:\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%J\u000e\u0010;\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020#J\u0016\u0010<\u001a\u00020\u00152\u0006\u0010=\u001a\u00020>2\u0006\u0010\"\u001a\u00020#J\u0010\u0010?\u001a\u00020\u00152\b\u0010@\u001a\u0004\u0018\u00010AJ\u0014\u0010B\u001a\u00020\u00152\f\u0010C\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014R\u000e\u0010\u0004\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0004\n\u0002\u0010\u0010R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000¨\u0006D"}, d2 = {"Lcom/ss/android/lark/multitask/floating/FloatingManager;", "Lcom/ss/android/lark/multitask/task/GlobalTaskContainerImpl$OnTaskChangeListener;", "Lcom/ss/android/lark/multitask/task/GlobalTaskContainerImpl$OnCustomViewChangeListener;", "()V", "TAG", "", "appFloatInitialized", "", "initialized", "Ljava/util/concurrent/atomic/AtomicBoolean;", "mActivityFloat", "Lcom/ss/android/lark/multitask/floating/ActivityFloat;", "mAppFloat", "Lcom/ss/android/lark/multitask/floating/AppFloat;", "mAppStateObserver", "com/ss/android/lark/multitask/floating/FloatingManager$mAppStateObserver$1", "Lcom/ss/android/lark/multitask/floating/FloatingManager$mAppStateObserver$1;", "mCacheSnapshot", "Lcom/ss/android/lark/multitask/task/TaskSnapshot;", "pendingActionAfterTaskDeletedByUser", "Lkotlin/Function0;", "", "restored", "addCustomViewAppFloat", "drawable", "Landroid/graphics/drawable/Drawable;", "viewSize", "", "key", "priority", "", "clickHandler", "Ljava/lang/Runnable;", "addViewToActivityFloat", "view", "Landroid/view/View;", "activity", "Landroidx/appcompat/app/AppCompatActivity;", "addViewToAppFloat", "clearCacheTask", "consumeCacheTask", "initAppFloat", "application", "Landroid/app/Application;", "onAppFloatClick", "rootView", "Landroid/view/ViewGroup;", "onBackgroundTaskRemoved", "taskSnapshots", "", "newRemovedTaskSnapshot", "onTaskEnterBackground", "newAddedTaskSnapshot", "onTasksClear", "onTenantChange", "recordMultiTask", "taskSnapshot", "removeCustomViewAppFloat", "removeViewFromActivityFloat", "removeViewFromAppFloat", "setIdlePositionExclusionView", "lifecycle", "Landroidx/lifecycle/Lifecycle;", "setStandAloneCallback", "callback", "Lcom/ss/android/lark/biz/core/api/ContentStateChangeCallback;", "showMultitaskListWithPendingTask", "action", "base_multitask_impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.multitask.floating.h */
public final class FloatingManager implements GlobalTaskContainerImpl.OnCustomViewChangeListener, GlobalTaskContainerImpl.OnTaskChangeListener {

    /* renamed from: a */
    public static final FloatingManager f121676a = new FloatingManager();

    /* renamed from: b */
    private static C48376q f121677b;

    /* renamed from: c */
    private static final ActivityFloat f121678c = new ActivityFloat();

    /* renamed from: d */
    private static Function0<Unit> f121679d;

    /* renamed from: e */
    private static final AppFloat f121680e = new AppFloat(new C48320c());

    /* renamed from: f */
    private static final C48321d f121681f = new C48321d();

    /* renamed from: g */
    private static boolean f121682g;

    /* renamed from: h */
    private static AtomicBoolean f121683h = new AtomicBoolean(false);

    /* renamed from: i */
    private static boolean f121684i;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/multitask/floating/FloatingManager$mAppFloat$1", "Lcom/ss/android/lark/multitask/floating/AppFloat$OnMultiTaskButtonClickListener;", "onMultiTaskButtonClick", "", "rootView", "Landroid/view/View;", "base_multitask_impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.multitask.floating.h$c */
    public static final class C48320c implements AppFloat.OnMultiTaskButtonClickListener {
        C48320c() {
        }

        @Override // com.ss.android.lark.multitask.floating.AppFloat.OnMultiTaskButtonClickListener
        /* renamed from: a */
        public void mo168976a(View view) {
            Intrinsics.checkParameterIsNotNull(view, "rootView");
            Log.m165389i("FloatingManager", "multitask clicked");
            FloatingManager.f121676a.mo169009a((ViewGroup) view);
        }
    }

    private FloatingManager() {
    }

    /* renamed from: a */
    public final void mo169012a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "key");
        f121680e.mo168941a(str);
    }

    /* renamed from: a */
    public final void mo169010a(Lifecycle lifecycle, View view) {
        Intrinsics.checkParameterIsNotNull(lifecycle, "lifecycle");
        Intrinsics.checkParameterIsNotNull(view, "view");
        f121680e.mo168937a(lifecycle, view);
    }

    @Override // com.ss.android.lark.multitask.task.GlobalTaskContainerImpl.OnTaskChangeListener
    /* renamed from: a */
    public void mo169013a(List<? extends C48376q> list, C48376q qVar) {
        Intrinsics.checkParameterIsNotNull(list, "taskSnapshots");
        Intrinsics.checkParameterIsNotNull(qVar, "newAddedTaskSnapshot");
        if (PermissionUtils.m150948a(C48335j.m190643a().mo168869a())) {
            m190590c(list, qVar);
        } else {
            UICallbackExecutor.executeDelayed(new RunnableC48324f(qVar), 300);
        }
    }

    /* renamed from: a */
    public final void mo169011a(ContentStateChangeCallback dVar) {
        f121680e.mo168938a(dVar);
    }

    /* renamed from: a */
    public final void mo169014a(Function0<Unit> function0) {
        Intrinsics.checkParameterIsNotNull(function0, "action");
        f121679d = function0;
        f121680e.mo168959k();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\u0003H\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\r"}, d2 = {"com/ss/android/lark/multitask/floating/FloatingManager$mAppStateObserver$1", "Lcom/ss/android/lark/multitask/IMultitaskDependency$AppStateObserver;", "cachedIsForeground", "", "getCachedIsForeground", "()Z", "setCachedIsForeground", "(Z)V", "onAppStateChanged", "", "topProcess", "", "isForeground", "base_multitask_impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.multitask.floating.h$d */
    public static final class C48321d implements IMultitaskDependency.AppStateObserver {

        /* renamed from: a */
        private boolean f121691a = true;

        C48321d() {
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.multitask.floating.h$d$a */
        static final class RunnableC48322a implements Runnable {

            /* renamed from: a */
            public static final RunnableC48322a f121692a = new RunnableC48322a();

            RunnableC48322a() {
            }

            public final void run() {
                FloatingManager hVar = FloatingManager.f121676a;
                FloatingManager.f121680e.mo168951d();
            }
        }

        @Override // com.ss.android.lark.multitask.IMultitaskDependency.AppStateObserver
        /* renamed from: a */
        public void mo168882a(String str, boolean z) {
            if (z != this.f121691a) {
                this.f121691a = z;
                if (!z || PermissionUtils.m150948a(C48335j.m190643a().mo168869a())) {
                    FloatingManager hVar = FloatingManager.f121676a;
                    FloatingManager.f121680e.mo168942a(z);
                    return;
                }
                FloatingManager.f121676a.mo169020d();
                UICallbackExecutor.execute(RunnableC48322a.f121692a);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.multitask.floating.h$g */
    static final class RunnableC48325g implements Runnable {

        /* renamed from: a */
        public static final RunnableC48325g f121695a = new RunnableC48325g();

        RunnableC48325g() {
        }

        public final void run() {
            FloatingManager hVar = FloatingManager.f121676a;
            FloatingManager.f121680e.mo168951d();
        }
    }

    @Override // com.ss.android.lark.multitask.task.GlobalTaskContainerImpl.OnCustomViewChangeListener
    /* renamed from: b */
    public void mo169015b() {
        UICallbackExecutor.execute(RunnableC48325g.f121695a);
    }

    /* renamed from: d */
    public final void mo169020d() {
        f121677b = null;
        GlobalTaskContainerImpl.f121803b.mo169228d();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.multitask.floating.h$a */
    public static final class RunnableC48318a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Drawable f121685a;

        /* renamed from: b */
        final /* synthetic */ int[] f121686b;

        /* renamed from: c */
        final /* synthetic */ String f121687c;

        /* renamed from: d */
        final /* synthetic */ int f121688d;

        /* renamed from: e */
        final /* synthetic */ Runnable f121689e;

        RunnableC48318a(Drawable drawable, int[] iArr, String str, int i, Runnable runnable) {
            this.f121685a = drawable;
            this.f121686b = iArr;
            this.f121687c = str;
            this.f121688d = i;
            this.f121689e = runnable;
        }

        public final void run() {
            FloatingManager hVar = FloatingManager.f121676a;
            FloatingManager.f121680e.mo168934a(this.f121685a, this.f121686b, this.f121687c, this.f121688d, this.f121689e);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/lark/multitask/floating/FloatingManager$initAppFloat$1", "Lcom/ss/android/lark/multitask/floating/LifecycleActivityLifecycleCallbacks;", "onCreateLifecycleObserver", "Landroidx/lifecycle/LifecycleObserver;", "base_multitask_impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.multitask.floating.h$b */
    public static final class C48319b extends LifecycleActivityLifecycleCallbacks {

        /* renamed from: a */
        final /* synthetic */ Application f121690a;

        @Override // com.ss.android.lark.multitask.floating.LifecycleActivityLifecycleCallbacks
        /* renamed from: a */
        public LifecycleObserver mo169022a() {
            FloatingManager hVar = FloatingManager.f121676a;
            if (FloatingManager.f121684i) {
                return null;
            }
            FloatingManager hVar2 = FloatingManager.f121676a;
            FloatingManager.f121684i = true;
            return new FloatingManager$initAppFloat$1$onCreateLifecycleObserver$1(this);
        }

        C48319b(Application application) {
            this.f121690a = application;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.multitask.floating.h$f */
    static final class RunnableC48324f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C48376q f121694a;

        RunnableC48324f(C48376q qVar) {
            this.f121694a = qVar;
        }

        public final void run() {
            FloatingManager hVar = FloatingManager.f121676a;
            FloatingManager.f121677b = this.f121694a;
            FloatingManager hVar2 = FloatingManager.f121676a;
            FloatingManager.f121680e.mo168957i();
        }
    }

    /* renamed from: c */
    public final void mo169019c() {
        C48376q qVar = f121677b;
        if (qVar != null) {
            m190590c(GlobalTaskContainerImpl.m190803c(), qVar);
        }
        f121677b = null;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.multitask.floating.h$e */
    public static final class RunnableC48323e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f121693a;

        RunnableC48323e(ViewGroup viewGroup) {
            this.f121693a = viewGroup;
        }

        public final void run() {
            this.f121693a.getContext().startActivity(new Intent(this.f121693a.getContext(), MultitaskListActivity.class).addFlags(268435456));
            FloatingManager hVar = FloatingManager.f121676a;
            FloatingManager.f121679d = null;
        }
    }

    @Override // com.ss.android.lark.multitask.task.GlobalTaskContainerImpl.OnTaskChangeListener
    /* renamed from: a */
    public void mo169004a() {
        f121680e.mo168952e();
    }

    /* renamed from: b */
    public final void mo169016b(View view) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        f121680e.mo168949c(view);
    }

    /* renamed from: a */
    public final void mo169005a(Application application) {
        Intrinsics.checkParameterIsNotNull(application, "application");
        if (f121683h.compareAndSet(false, true)) {
            C48335j.m190643a().mo168870a(f121681f);
            application.registerActivityLifecycleCallbacks(new C48319b(application));
        }
    }

    /* renamed from: a */
    public final void mo169007a(View view) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        f121680e.mo168946b(view);
    }

    /* renamed from: a */
    public final void mo169009a(ViewGroup viewGroup) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "rootView");
        viewGroup.post(new RunnableC48323e(viewGroup));
    }

    /* renamed from: c */
    private final void m190590c(List<? extends C48376q> list, C48376q qVar) {
        AppFloat.m190528a(f121680e, list.size(), false, 2, (Object) null);
    }

    /* renamed from: b */
    public final void mo169017b(View view, AppCompatActivity appCompatActivity) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        Intrinsics.checkParameterIsNotNull(appCompatActivity, "activity");
        f121678c.mo168927b(view, appCompatActivity);
    }

    @Override // com.ss.android.lark.multitask.task.GlobalTaskContainerImpl.OnTaskChangeListener
    /* renamed from: b */
    public void mo169018b(List<? extends C48376q> list, C48376q qVar) {
        Intrinsics.checkParameterIsNotNull(list, "taskSnapshots");
        Intrinsics.checkParameterIsNotNull(qVar, "newRemovedTaskSnapshot");
        AppFloat.m190528a(f121680e, list.size(), false, 2, (Object) null);
    }

    /* renamed from: a */
    public final void mo169008a(View view, AppCompatActivity appCompatActivity) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        Intrinsics.checkParameterIsNotNull(appCompatActivity, "activity");
        f121678c.mo168925a(view, appCompatActivity);
    }

    /* renamed from: a */
    public final void mo169006a(Drawable drawable, int[] iArr, String str, int i, Runnable runnable) {
        Intrinsics.checkParameterIsNotNull(drawable, "drawable");
        Intrinsics.checkParameterIsNotNull(str, "key");
        UICallbackExecutor.executeDelayed(new RunnableC48318a(drawable, iArr, str, i, runnable), 300);
    }
}
