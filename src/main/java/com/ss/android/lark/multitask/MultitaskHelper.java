package com.ss.android.lark.multitask;

import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.multitask.task.AbstractC48369g;
import com.ss.android.lark.multitask.task.AbstractC48375n;
import com.ss.android.lark.multitask.task.AbstractC48378t;
import com.ss.android.lark.multitask.task.AbstractC48379u;
import com.ss.android.lark.multitask.task.C48366c;
import com.ss.android.lark.multitask.task.C48368f;
import com.ss.android.lark.multitask.task.C48376q;
import com.ss.android.lark.multitask.task.EventTracker;
import com.ss.android.lark.multitask.task.Task;
import com.ss.android.lark.multitask.task.TaskFinishHandler;
import com.ss.android.lark.multitask.task.TaskIdGenerator;
import com.ss.android.lark.multitask.task.TaskWrapperHolder;
import com.ss.android.lark.slideback.SlideHelper;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 ,2\u00020\u0001:\u0001,B!\b\u0012\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007B\u0019\b\u0012\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\u001a\u0010\u0019\u001a\u00020\u001a2\u0010\b\u0002\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u001cH\u0007J\u001a\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0002J\u0006\u0010\u001e\u001a\u00020\u0005J\u0006\u0010\u001f\u001a\u00020\u0005J\u0006\u0010 \u001a\u00020\u001aJ\r\u0010!\u001a\u00020\u001aH\u0000¢\u0006\u0002\b\"J\u000e\u0010#\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0003J\u001d\u0010$\u001a\u00020\u001a2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010%\u001a\u00020&H\u0000¢\u0006\u0002\b'J\u0010\u0010(\u001a\u00020\u001a2\b\u0010)\u001a\u0004\u0018\u00010*J\u0006\u0010+\u001a\u00020\u001aR\u000e\u0010\u000b\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u00020\u0013X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0018\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000¨\u0006-"}, d2 = {"Lcom/ss/android/lark/multitask/MultitaskHelper;", "", "wrapper", "Lcom/ss/android/lark/multitask/task/ActivityTaskWrapper;", "slideEnabled", "", "slideOverrideFG", "(Lcom/ss/android/lark/multitask/task/ActivityTaskWrapper;ZZ)V", "slideHelper", "Lcom/ss/android/lark/slideback/SlideHelper;", "(Lcom/ss/android/lark/multitask/task/ActivityTaskWrapper;Lcom/ss/android/lark/slideback/SlideHelper;)V", "isRestoredTask", "getSlideHelper", "()Lcom/ss/android/lark/slideback/SlideHelper;", "setSlideHelper", "(Lcom/ss/android/lark/slideback/SlideHelper;)V", "taskFinishHandler", "Lcom/ss/android/lark/multitask/task/TaskFinishHandler;", "taskWrapper", "Lcom/ss/android/lark/multitask/task/TaskWrapper;", "getTaskWrapper", "()Lcom/ss/android/lark/multitask/task/TaskWrapper;", "setTaskWrapper", "(Lcom/ss/android/lark/multitask/task/TaskWrapper;)V", "terminated", "dropIntoBasket", "", "actionAfterDroppedIntoBasket", "Lkotlin/Function0;", "init", "isDuplicatedTask", "isFull", "notifyTaskWillEnterBackground", "notifyTaskWillEnterForeground", "notifyTaskWillEnterForeground$features_multitask_release", "recreate", "scheduleDispatchRestoreInstanceState", "snapshot", "Lcom/ss/android/lark/multitask/task/TaskSnapshot;", "scheduleDispatchRestoreInstanceState$features_multitask_release", "setBackgroundArtist", "backgroundArtist", "Lcom/ss/android/lark/slideback/BackgroundArtist;", "terminate", "Companion", "features_multitask_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.multitask.h */
public final class MultitaskHelper {

    /* renamed from: e */
    public static TaskIdGenerator f121711e;

    /* renamed from: f */
    public static final Companion f121712f = new Companion(null);

    /* renamed from: a */
    public AbstractC48379u f121713a;

    /* renamed from: b */
    public boolean f121714b;

    /* renamed from: c */
    public boolean f121715c;

    /* renamed from: d */
    public TaskFinishHandler f121716d;

    /* renamed from: g */
    private SlideHelper f121717g;

    @JvmStatic
    /* renamed from: a */
    public static final MultitaskHelper m190620a(AbstractC48369g gVar, boolean z) {
        return Companion.m190633a(f121712f, gVar, z, false, 4, null);
    }

    @JvmStatic
    /* renamed from: a */
    public static final MultitaskHelper m190621a(AbstractC48369g gVar, boolean z, boolean z2) {
        return f121712f.mo169051a(gVar, z, z2);
    }

    @JvmStatic
    /* renamed from: b */
    public static final MultitaskHelper m190623b(AbstractC48369g gVar) {
        return Companion.m190633a(f121712f, gVar, false, false, 6, null);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J$\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0010H\u0007J\b\u0010\u0012\u001a\u00020\u0010H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Lcom/ss/android/lark/multitask/MultitaskHelper$Companion;", "", "()V", "TAG", "", "taskIdGenerator", "Lcom/ss/android/lark/multitask/task/TaskIdGenerator;", "getTaskIdGenerator", "()Lcom/ss/android/lark/multitask/task/TaskIdGenerator;", "setTaskIdGenerator", "(Lcom/ss/android/lark/multitask/task/TaskIdGenerator;)V", "create", "Lcom/ss/android/lark/multitask/MultitaskHelper;", "taskWrapper", "Lcom/ss/android/lark/multitask/task/ActivityTaskWrapper;", "slideEnabled", "", "slideOverrideFG", "isInitialized", "features_multitask_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.multitask.h$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: b */
        public final boolean mo169054b() {
            if (MultitaskHelper.f121711e != null) {
                return true;
            }
            return false;
        }

        /* renamed from: a */
        public final TaskIdGenerator mo169052a() {
            TaskIdGenerator pVar = MultitaskHelper.f121711e;
            if (pVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("taskIdGenerator");
            }
            return pVar;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo169053a(TaskIdGenerator pVar) {
            Intrinsics.checkParameterIsNotNull(pVar, "<set-?>");
            MultitaskHelper.f121711e = pVar;
        }

        @JvmStatic
        /* renamed from: a */
        public final MultitaskHelper mo169051a(AbstractC48369g gVar, boolean z, boolean z2) {
            Intrinsics.checkParameterIsNotNull(gVar, "taskWrapper");
            return new MultitaskHelper(gVar, z, z2, null);
        }

        /* renamed from: a */
        public static /* synthetic */ MultitaskHelper m190633a(Companion aVar, AbstractC48369g gVar, boolean z, boolean z2, int i, Object obj) {
            if ((i & 2) != 0) {
                z = true;
            }
            if ((i & 4) != 0) {
                z2 = false;
            }
            return aVar.mo169051a(gVar, z, z2);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\fH\u0016¨\u0006\r"}, d2 = {"com/ss/android/lark/multitask/MultitaskHelper$init$1", "Lcom/ss/android/lark/multitask/task/ActivityTaskWrapper;", "getActivity", "Landroidx/fragment/app/FragmentActivity;", "getActivityOrNull", "getContainer", "Lcom/ss/android/lark/multitask/task/TaskContainer;", "getEventTracker", "Lcom/ss/android/lark/multitask/task/EventTracker;", "getStarter", "Lcom/ss/android/lark/multitask/task/TaskStarter;", "getWrapped", "Lcom/ss/android/lark/multitask/task/Task;", "features_multitask_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.multitask.h$b */
    public static final class C48332b implements AbstractC48369g {

        /* renamed from: a */
        final /* synthetic */ Task f121718a;

        /* renamed from: b */
        final /* synthetic */ AbstractC48378t f121719b;

        /* renamed from: c */
        final /* synthetic */ AbstractC48375n f121720c;

        /* renamed from: d */
        final /* synthetic */ WeakReference f121721d;

        /* renamed from: e */
        final /* synthetic */ EventTracker f121722e;

        @Override // com.ss.android.lark.multitask.task.AbstractC48379u, com.ss.android.lark.multitask.task.AbstractC48369g
        public EventTracker O_() {
            return this.f121722e;
        }

        @Override // com.ss.android.lark.multitask.task.AbstractC48379u
        /* renamed from: a */
        public Task mo23782a() {
            return this.f121718a;
        }

        @Override // com.ss.android.lark.multitask.task.AbstractC48379u
        /* renamed from: b */
        public AbstractC48378t mo23783b() {
            return this.f121719b;
        }

        @Override // com.ss.android.lark.multitask.task.AbstractC48379u
        /* renamed from: e */
        public AbstractC48375n mo23786e() {
            return this.f121720c;
        }

        @Override // com.ss.android.lark.multitask.task.AbstractC48369g
        /* renamed from: d */
        public FragmentActivity mo23785d() {
            Object obj = this.f121721d.get();
            if (obj == null) {
                Intrinsics.throwNpe();
            }
            return (FragmentActivity) obj;
        }

        @Override // com.ss.android.lark.multitask.task.AbstractC48369g
        public FragmentActivity p_() {
            return (FragmentActivity) this.f121721d.get();
        }

        C48332b(Task task, AbstractC48378t tVar, AbstractC48375n nVar, WeakReference weakReference, EventTracker hVar) {
            this.f121718a = task;
            this.f121719b = tVar;
            this.f121720c = nVar;
            this.f121721d = weakReference;
            this.f121722e = hVar;
        }
    }

    /* renamed from: a */
    public final SlideHelper mo169043a() {
        return this.f121717g;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.multitask.h$c */
    static final class RunnableC48333c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AbstractC48379u f121723a;

        /* renamed from: b */
        final /* synthetic */ C48376q f121724b;

        RunnableC48333c(AbstractC48379u uVar, C48376q qVar) {
            this.f121723a = uVar;
            this.f121724b = qVar;
        }

        public final void run() {
            Task a = this.f121723a.mo23782a();
            Intrinsics.checkExpressionValueIsNotNull(a, "taskWrapper.wrapped");
            a.getLifecycle().addObserver(new MultitaskHelper$scheduleDispatchRestoreInstanceState$1$1(this));
        }
    }

    /* renamed from: b */
    public final AbstractC48379u mo169046b() {
        AbstractC48379u uVar = this.f121713a;
        if (uVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("taskWrapper");
        }
        return uVar;
    }

    /* renamed from: c */
    public final void mo169047c() {
        AbstractC48379u uVar = this.f121713a;
        if (uVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("taskWrapper");
        }
        AbstractC48375n e = uVar.mo23786e();
        AbstractC48379u uVar2 = this.f121713a;
        if (uVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("taskWrapper");
        }
        Task a = uVar2.mo23782a();
        AbstractC48379u uVar3 = this.f121713a;
        if (uVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("taskWrapper");
        }
        AbstractC48375n e2 = uVar3.mo23786e();
        AbstractC48379u uVar4 = this.f121713a;
        if (uVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("taskWrapper");
        }
        e.mo169152a(a, e2, uVar4.mo23783b());
    }

    /* renamed from: d */
    public final void mo169048d() {
        AbstractC48379u uVar = this.f121713a;
        if (uVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("taskWrapper");
        }
        AbstractC48375n e = uVar.mo23786e();
        AbstractC48379u uVar2 = this.f121713a;
        if (uVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("taskWrapper");
        }
        Task a = uVar2.mo23782a();
        Intrinsics.checkExpressionValueIsNotNull(a, "taskWrapper.wrapped");
        e.mo169161b(a.mo23792d());
    }

    /* renamed from: e */
    public final boolean mo169049e() {
        boolean z;
        if (this.f121713a != null) {
            z = true;
        } else {
            z = false;
        }
        Log.m165389i("MULTITASK-MultitaskHelper", "isDuplicatedTask isInitialized = " + z);
        if (!z) {
            return true;
        }
        AbstractC48379u uVar = this.f121713a;
        if (uVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("taskWrapper");
        }
        AbstractC48375n e = uVar.mo23786e();
        AbstractC48379u uVar2 = this.f121713a;
        if (uVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("taskWrapper");
        }
        boolean a = e.mo169159a(uVar2.mo23782a());
        Log.m165389i("MULTITASK-MultitaskHelper", "isDuplicatedTask isDuplicatedTask = " + a);
        return a;
    }

    /* renamed from: f */
    public final void mo169050f() {
        boolean z;
        if (this.f121713a != null) {
            z = true;
        } else {
            z = false;
        }
        Log.m165389i("MULTITASK-MultitaskHelper", "terminate isInitialized = " + z);
        if (z) {
            AbstractC48379u uVar = this.f121713a;
            if (uVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("taskWrapper");
            }
            EventTracker O_ = uVar.O_();
            JSONObject jSONObject = new JSONObject();
            AbstractC48379u uVar2 = this.f121713a;
            if (uVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("taskWrapper");
            }
            Task a = uVar2.mo23782a();
            Intrinsics.checkExpressionValueIsNotNull(a, "taskWrapper.wrapped");
            O_.mo169219a("tasklist_delete_by_fix", jSONObject.put("task_type", a.mo23791c()));
            AbstractC48379u uVar3 = this.f121713a;
            if (uVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("taskWrapper");
            }
            AbstractC48375n e = uVar3.mo23786e();
            AbstractC48379u uVar4 = this.f121713a;
            if (uVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("taskWrapper");
            }
            Task a2 = uVar4.mo23782a();
            Intrinsics.checkExpressionValueIsNotNull(a2, "taskWrapper.wrapped");
            e.mo169155a(a2.mo23792d());
            this.f121715c = true;
        }
    }

    /* renamed from: a */
    public final MultitaskHelper mo169042a(AbstractC48369g gVar) {
        Intrinsics.checkParameterIsNotNull(gVar, "taskWrapper");
        FragmentActivity d = gVar.mo23785d();
        Intrinsics.checkExpressionValueIsNotNull(d, "taskWrapper.activity");
        Fragment findFragmentByTag = d.getSupportFragmentManager().findFragmentByTag("multitask.lifecycle.fragment.tag");
        if (findFragmentByTag != null) {
            FragmentActivity d2 = gVar.mo23785d();
            Intrinsics.checkExpressionValueIsNotNull(d2, "taskWrapper.activity");
            d2.getSupportFragmentManager().beginTransaction().remove(findFragmentByTag).commitNowAllowingStateLoss();
        }
        return new MultitaskHelper(gVar, this.f121717g);
    }

    /* renamed from: a */
    public final void mo169045a(Function0<Unit> function0) {
        boolean z;
        TaskFinishHandler oVar;
        if (this.f121713a != null) {
            z = true;
        } else {
            z = false;
        }
        Log.m165389i("MULTITASK-MultitaskHelper", "dropIntoBasket isInitialized = " + z);
        if (z && (oVar = this.f121716d) != null) {
            oVar.mo169084a(function0);
        }
    }

    private MultitaskHelper(AbstractC48369g gVar, SlideHelper jVar) {
        m190622a(gVar, jVar);
    }

    /* renamed from: a */
    public final void mo169044a(AbstractC48379u uVar, C48376q qVar) {
        Intrinsics.checkParameterIsNotNull(uVar, "taskWrapper");
        Intrinsics.checkParameterIsNotNull(qVar, "snapshot");
        new Handler(Looper.getMainLooper()).post(new RunnableC48333c(uVar, qVar));
    }

    /* renamed from: a */
    private final void m190622a(AbstractC48369g gVar, SlideHelper jVar) {
        long j;
        if (!f121712f.mo169054b()) {
            Log.m165383e("MULTITASK-MultitaskHelper", "Multitask is not initialized. Skip initialization!");
            return;
        }
        this.f121717g = jVar;
        if (MultitaskFG.f121595b.mo168904a()) {
            Task a = gVar.mo23782a();
            Intrinsics.checkExpressionValueIsNotNull(a, "wrapper.wrapped");
            AbstractC48378t b = gVar.mo23783b();
            Intrinsics.checkExpressionValueIsNotNull(b, "wrapper.starter");
            AbstractC48375n e = gVar.mo23786e();
            Intrinsics.checkExpressionValueIsNotNull(e, "wrapper.container");
            WeakReference weakReference = new WeakReference(gVar.mo23785d());
            EventTracker O_ = gVar.O_();
            Intrinsics.checkExpressionValueIsNotNull(O_, "wrapper.eventTracker");
            this.f121713a = new C48332b(a, b, e, weakReference, O_);
            this.f121714b = false;
            if (a instanceof C48366c) {
                Intent f = ((C48366c) a).mo169215f();
                Intrinsics.checkExpressionValueIsNotNull(f, "wrappedTask.intent");
                j = C48368f.m190781b(f);
            } else {
                FragmentActivity d = gVar.mo23785d();
                Intrinsics.checkExpressionValueIsNotNull(d, "wrapper.activity");
                Intent intent = d.getIntent();
                Intrinsics.checkExpressionValueIsNotNull(intent, "wrapper.activity.intent");
                j = C48368f.m190781b(intent);
            }
            if (j == Long.MIN_VALUE) {
                TaskIdGenerator pVar = f121711e;
                if (pVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("taskIdGenerator");
                }
                j = pVar.mo169233a();
            } else {
                this.f121714b = true;
            }
            a.mo169192a(j);
            Lifecycle lifecycle = a.getLifecycle();
            lifecycle.addObserver(new MultitaskHelper$init$$inlined$let$lambda$1(this));
            if (this.f121714b) {
                lifecycle.addObserver(new MultitaskHelper$init$$inlined$let$lambda$2(this));
            }
            TaskWrapperHolder vVar = TaskWrapperHolder.f121828a;
            AbstractC48379u uVar = this.f121713a;
            if (uVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("taskWrapper");
            }
            if (uVar != null) {
                vVar.mo169249a((AbstractC48369g) uVar);
                TaskWrapperHolder vVar2 = TaskWrapperHolder.f121828a;
                AbstractC48379u uVar2 = this.f121713a;
                if (uVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("taskWrapper");
                }
                vVar2.mo169250a(uVar2);
                a.getLifecycle().addObserver(new MultitaskHelper$init$3(this));
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.multitask.task.ActivityTaskWrapper");
        }
    }

    private MultitaskHelper(AbstractC48369g gVar, boolean z, boolean z2) {
        SlideHelper jVar = null;
        if (z && (MultitaskFG.f121595b.mo168904a() || (!MultitaskFG.f121595b.mo168904a() && z2))) {
            FragmentActivity d = gVar.mo23785d();
            Intrinsics.checkExpressionValueIsNotNull(d, "wrapper.activity");
            jVar = new SlideHelper(d);
        }
        m190622a(gVar, jVar);
    }

    public /* synthetic */ MultitaskHelper(AbstractC48369g gVar, boolean z, boolean z2, DefaultConstructorMarker defaultConstructorMarker) {
        this(gVar, z, z2);
    }
}
