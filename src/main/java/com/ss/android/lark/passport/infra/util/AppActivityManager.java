package com.ss.android.lark.passport.infra.util;

import android.app.Activity;
import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import com.ss.android.lark.passport.infra.util.p2439a.C49144c;
import com.ss.android.lark.utils.LarkContext;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import kotlin.C69097g;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.C69086a;
import kotlin.coroutines.jvm.internal.C69089a;
import kotlin.coroutines.jvm.internal.C69091e;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C69117h;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;
import kotlinx.coroutines.C69553g;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000g\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0010\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001)B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0011\u0010\u0017\u001a\u00020\u0005H@ø\u0001\u0000¢\u0006\u0002\u0010\u0018J\u001c\u0010\u0017\u001a\u00020\u00192\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00190\u001bH\u0007J\u001f\u0010\u0017\u001a\u00020\u00052\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00050\rH@ø\u0001\u0000¢\u0006\u0002\u0010\u001dJ\u0018\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020\u00052\u0006\u0010 \u001a\u00020!H\u0002J\b\u0010\"\u001a\u00020\u0019H\u0007J.\u0010#\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020\u00052\u0006\u0010 \u001a\u00020!2\u0006\u0010$\u001a\u00020%2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190&H\u0007J\u001e\u0010'\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020\u00052\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190&H\u0007J\b\u0010(\u001a\u00020\u0019H\u0002R*\u0010\u0003\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b0\u0004X\u0004¢\u0006\u0002\n\u0000R*\u0010\t\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\n0\u0006j\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\n`\bX\u0004¢\u0006\u0002\n\u0000Rn\u0010\u000b\u001ab\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\r\u0012 \u0012\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\n0\u0006j\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\n`\b0\fj0\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\r\u0012 \u0012\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\n0\u0006j\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\n`\b`\u000eX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0004\n\u0002\u0010\u0011R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u00058G¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0016X\u000e¢\u0006\u0002\n\u0000\u0002\u0004\n\u0002\b\u0019¨\u0006*"}, d2 = {"Lcom/ss/android/lark/passport/infra/util/AppActivityManager;", "", "()V", "activityEventObservers", "Ljava/util/WeakHashMap;", "Landroid/app/Activity;", "Ljava/util/LinkedHashSet;", "Lcom/ss/android/lark/passport/infra/util/AppActivityManager$ActivityEventObserver;", "Lkotlin/collections/LinkedHashSet;", "awaitingResumeActivityCoroutines", "Lkotlin/coroutines/Continuation;", "awaitingSpecifyResumeActivityCoroutineMap", "Ljava/util/LinkedHashMap;", "Ljava/lang/Class;", "Lkotlin/collections/LinkedHashMap;", "javaHelper", "com/ss/android/lark/passport/infra/util/AppActivityManager$javaHelper$1", "Lcom/ss/android/lark/passport/infra/util/AppActivityManager$javaHelper$1;", "topActivity", "getTopActivity", "()Landroid/app/Activity;", "topActivityRef", "Ljava/lang/ref/WeakReference;", "awaitNextResumeActivity", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "callback", "Lkotlin/Function1;", "clazz", "(Ljava/lang/Class;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "emitActivityEvent", "activity", "event", "Landroidx/lifecycle/Lifecycle$Event;", "init", "observeActivityEvent", "oneShot", "", "Lkotlin/Function0;", "observeOneShotActivityDestroyed", "registerCallbacks", "ActivityEventObserver", "passport-infra_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.passport.infra.util.c */
public final class AppActivityManager {

    /* renamed from: a */
    public static final AppActivityManager f123444a;

    /* renamed from: b */
    private static final LinkedHashSet<Continuation<Activity>> f123445b = new LinkedHashSet<>();

    /* renamed from: c */
    private static final LinkedHashMap<Class<Activity>, LinkedHashSet<Continuation<Activity>>> f123446c = new LinkedHashMap<>();

    /* renamed from: d */
    private static final WeakHashMap<Activity, LinkedHashSet<ActivityEventObserver>> f123447d = new WeakHashMap<>();

    /* renamed from: e */
    private static final C49163c f123448e = new C49163c();

    /* renamed from: f */
    private static volatile WeakReference<Activity> f123449f;

    @JvmStatic
    /* renamed from: b */
    public static final void m193868b() {
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\tR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/passport/infra/util/AppActivityManager$ActivityEventObserver;", "", "event", "Landroidx/lifecycle/Lifecycle$Event;", "oneShot", "", "callback", "Lkotlin/Function0;", "", "(Landroidx/lifecycle/Lifecycle$Event;ZLkotlin/jvm/functions/Function0;)V", "getCallback", "()Lkotlin/jvm/functions/Function0;", "getEvent", "()Landroidx/lifecycle/Lifecycle$Event;", "getOneShot", "()Z", "passport-infra_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.passport.infra.util.c$a */
    public static final class ActivityEventObserver {

        /* renamed from: a */
        private final Lifecycle.Event f123450a;

        /* renamed from: b */
        private final boolean f123451b;

        /* renamed from: c */
        private final Function0<Unit> f123452c;

        /* renamed from: a */
        public final Lifecycle.Event mo171643a() {
            return this.f123450a;
        }

        /* renamed from: b */
        public final boolean mo171644b() {
            return this.f123451b;
        }

        /* renamed from: c */
        public final Function0<Unit> mo171645c() {
            return this.f123452c;
        }

        public ActivityEventObserver(Lifecycle.Event event, boolean z, Function0<Unit> function0) {
            Intrinsics.checkParameterIsNotNull(event, "event");
            Intrinsics.checkParameterIsNotNull(function0, "callback");
            this.f123450a = event;
            this.f123451b = z;
            this.f123452c = function0;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\r"}, d2 = {"com/ss/android/lark/passport/infra/util/AppActivityManager$registerCallbacks$1", "Lcom/ss/android/lark/passport/infra/util/EmptyActivityLifecycleCallbacks;", "onActivityCreated", "", "activity", "Landroid/app/Activity;", "savedInstanceState", "Landroid/os/Bundle;", "onActivityDestroyed", "onActivityPaused", "onActivityResumed", "onActivityStarted", "onActivityStopped", "passport-infra_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.passport.infra.util.c$d */
    public static final class C49165d extends EmptyActivityLifecycleCallbacks {
        C49165d() {
        }

        @Override // com.ss.android.lark.passport.infra.util.EmptyActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            Intrinsics.checkParameterIsNotNull(activity, "activity");
            super.onActivityPaused(activity);
            AppActivityManager.f123444a.mo171642a(activity, Lifecycle.Event.ON_PAUSE);
        }

        @Override // com.ss.android.lark.passport.infra.util.EmptyActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            Intrinsics.checkParameterIsNotNull(activity, "activity");
            super.onActivityStarted(activity);
            AppActivityManager.f123444a.mo171642a(activity, Lifecycle.Event.ON_START);
        }

        @Override // com.ss.android.lark.passport.infra.util.EmptyActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            Activity activity2;
            Intrinsics.checkParameterIsNotNull(activity, "activity");
            super.onActivityDestroyed(activity);
            AppActivityManager cVar = AppActivityManager.f123444a;
            WeakReference weakReference = AppActivityManager.f123449f;
            if (weakReference != null) {
                activity2 = (Activity) weakReference.get();
            } else {
                activity2 = null;
            }
            if (Intrinsics.areEqual(activity2, activity)) {
                AppActivityManager cVar2 = AppActivityManager.f123444a;
                AppActivityManager.f123449f = null;
            }
            AppActivityManager.f123444a.mo171642a(activity, Lifecycle.Event.ON_DESTROY);
        }

        @Override // com.ss.android.lark.passport.infra.util.EmptyActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            Activity activity2;
            Intrinsics.checkParameterIsNotNull(activity, "activity");
            super.onActivityStopped(activity);
            AppActivityManager cVar = AppActivityManager.f123444a;
            WeakReference weakReference = AppActivityManager.f123449f;
            if (weakReference != null) {
                activity2 = (Activity) weakReference.get();
            } else {
                activity2 = null;
            }
            if (Intrinsics.areEqual(activity2, activity) && activity2.isFinishing()) {
                AppActivityManager cVar2 = AppActivityManager.f123444a;
                AppActivityManager.f123449f = null;
            }
            AppActivityManager.f123444a.mo171642a(activity, Lifecycle.Event.ON_STOP);
        }

        @Override // com.ss.android.lark.passport.infra.util.EmptyActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            Intrinsics.checkParameterIsNotNull(activity, "activity");
            super.onActivityResumed(activity);
            AppActivityManager cVar = AppActivityManager.f123444a;
            AppActivityManager.f123449f = new WeakReference(activity);
            synchronized (this) {
                AppActivityManager cVar2 = AppActivityManager.f123444a;
                Object[] array = AppActivityManager.f123445b.toArray(new Continuation[0]);
                if (array != null) {
                    Continuation[] cVarArr = (Continuation[]) array;
                    for (Continuation cVar3 : cVarArr) {
                        Result.Companion aVar = Result.Companion;
                        cVar3.resumeWith(Result.m271569constructorimpl(activity));
                    }
                    AppActivityManager cVar4 = AppActivityManager.f123444a;
                    AppActivityManager.f123445b.clear();
                    AppActivityManager cVar5 = AppActivityManager.f123444a;
                    LinkedHashSet<Continuation> linkedHashSet = (LinkedHashSet) AppActivityManager.f123446c.get(activity.getClass());
                    if (linkedHashSet != null) {
                        for (Continuation cVar6 : linkedHashSet) {
                            Result.Companion aVar2 = Result.Companion;
                            cVar6.resumeWith(Result.m271569constructorimpl(activity));
                        }
                    }
                    if (linkedHashSet != null) {
                        linkedHashSet.clear();
                        Unit unit = Unit.INSTANCE;
                    }
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
                }
            }
            AppActivityManager.f123444a.mo171642a(activity, Lifecycle.Event.ON_RESUME);
        }

        @Override // com.ss.android.lark.passport.infra.util.EmptyActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            Intrinsics.checkParameterIsNotNull(activity, "activity");
            super.onActivityCreated(activity, bundle);
            AppActivityManager.f123444a.mo171642a(activity, Lifecycle.Event.ON_CREATE);
        }
    }

    private AppActivityManager() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000'\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001JH\u0010\u0004\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u00062\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u00020\u0005\u0018\u00010\b2\u001c\u0010\t\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00060\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\bø\u0001\u0000¢\u0006\u0002\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"com/ss/android/lark/passport/infra/util/AppActivityManager$javaHelper$1", "", "mainScope", "Lkotlinx/coroutines/CoroutineScope;", "toCallback", "", "T", "callback", "Lkotlin/Function1;", "suspendRunnable", "Lkotlin/coroutines/Continuation;", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "passport-infra_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.passport.infra.util.c$c */
    public static final class C49163c {

        /* renamed from: a */
        private final CoroutineScope f123453a = C49144c.m193791a();

        C49163c() {
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u0003H@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
        @DebugMetadata(mo239172c = "com.ss.android.lark.passport.infra.util.AppActivityManager$javaHelper$1$toCallback$1", mo239173f = "AppActivityManager.kt", mo239174i = {0}, mo239175l = {48}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch"}, mo239178s = {"L$0"})
        /* renamed from: com.ss.android.lark.passport.infra.util.c$c$a */
        public static final class C49164a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Function1 $callback;
            final /* synthetic */ Function1 $suspendRunnable;
            Object L$0;
            Object L$1;
            int label;
            private CoroutineScope p$;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C49164a(Function1 function1, Function1 function12, Continuation cVar) {
                super(2, cVar);
                this.$callback = function1;
                this.$suspendRunnable = function12;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
                Intrinsics.checkParameterIsNotNull(cVar, "completion");
                C49164a aVar = new C49164a(this.$callback, this.$suspendRunnable, cVar);
                aVar.p$ = (CoroutineScope) obj;
                return aVar;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
                return ((C49164a) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Function1 function1;
                Object a = C69086a.m265828a();
                int i = this.label;
                if (i == 0) {
                    C69097g.m265891a(obj);
                    CoroutineScope ahVar = this.p$;
                    Function1 function12 = this.$callback;
                    Function1 function13 = this.$suspendRunnable;
                    this.L$0 = ahVar;
                    this.L$1 = function12;
                    this.label = 1;
                    obj = function13.invoke(this);
                    if (obj == a) {
                        return a;
                    }
                    function1 = function12;
                } else if (i == 1) {
                    function1 = (Function1) this.L$1;
                    CoroutineScope ahVar2 = (CoroutineScope) this.L$0;
                    C69097g.m265891a(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                function1.invoke(obj);
                return Unit.INSTANCE;
            }
        }

        /* renamed from: a */
        public final <T> void mo171647a(Function1<? super T, Unit> function1, Function1<? super Continuation<? super T>, ? extends Object> function12) {
            Intrinsics.checkParameterIsNotNull(function12, "suspendRunnable");
            if (function1 != null) {
                Job unused = C69553g.m266944a(this.f123453a, null, null, new C49164a(function1, function12, null), 3, null);
            }
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final Activity m193861a() {
        WeakReference<Activity> weakReference = f123449f;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    /* renamed from: c */
    private final void m193870c() {
        LarkContext.getApplication().registerActivityLifecycleCallbacks(new C49165d());
    }

    static {
        AppActivityManager cVar = new AppActivityManager();
        f123444a = cVar;
        cVar.m193870c();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "Landroid/app/Activity;", "invoke", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.passport.infra.util.c$b */
    static final /* synthetic */ class C49162b extends FunctionReference implements Function1<Continuation<? super Activity>, Object> {
        C49162b(AppActivityManager cVar) {
            super(1, cVar);
        }

        @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
        public final String getName() {
            return "awaitNextResumeActivity";
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final KDeclarationContainer getOwner() {
            return Reflection.getOrCreateKotlinClass(AppActivityManager.class);
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final String getSignature() {
            return "awaitNextResumeActivity(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;";
        }

        public final Object invoke(Continuation<? super Activity> cVar) {
            C69117h.m265970a(0);
            Object a = ((AppActivityManager) this.receiver).mo171641a(cVar);
            C69117h.m265970a(1);
            return a;
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m193866a(Function1<? super Activity, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(function1, "callback");
        f123448e.mo171647a(function1, new C49162b(f123444a));
    }

    /* renamed from: a */
    public final Object mo171641a(Continuation<? super Activity> cVar) {
        SafeContinuation gVar = new SafeContinuation(C69086a.m265825a(cVar));
        SafeContinuation gVar2 = gVar;
        synchronized (f123444a) {
            C69089a.m265837a(f123445b.add(gVar2));
        }
        Object a = gVar.mo239163a();
        if (a == C69086a.m265828a()) {
            C69091e.m265847c(cVar);
        }
        return a;
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m193864a(Activity activity, Function0<Unit> function0) {
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        Intrinsics.checkParameterIsNotNull(function0, "callback");
        m193863a(activity, Lifecycle.Event.ON_DESTROY, true, function0);
    }

    /* renamed from: a */
    public final void mo171642a(Activity activity, Lifecycle.Event event) {
        synchronized (this) {
            LinkedHashSet<ActivityEventObserver> linkedHashSet = f123447d.get(activity);
            if (linkedHashSet != null) {
                Intrinsics.checkExpressionValueIsNotNull(linkedHashSet, "activityEventObservers[a…y] ?: return@synchronized");
                Iterator<ActivityEventObserver> it = linkedHashSet.iterator();
                Intrinsics.checkExpressionValueIsNotNull(it, "set.iterator()");
                while (it.hasNext()) {
                    ActivityEventObserver next = it.next();
                    Intrinsics.checkExpressionValueIsNotNull(next, "iterator.next()");
                    ActivityEventObserver aVar = next;
                    if (aVar.mo171643a() == event || aVar.mo171643a() == Lifecycle.Event.ON_ANY) {
                        aVar.mo171645c().invoke();
                        if (aVar.mo171644b()) {
                            it.remove();
                        }
                    }
                }
                if (linkedHashSet.isEmpty() || event == Lifecycle.Event.ON_DESTROY) {
                    f123447d.remove(activity);
                }
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m193863a(Activity activity, Lifecycle.Event event, boolean z, Function0<Unit> function0) {
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        Intrinsics.checkParameterIsNotNull(event, "event");
        Intrinsics.checkParameterIsNotNull(function0, "callback");
        synchronized (f123444a) {
            WeakHashMap<Activity, LinkedHashSet<ActivityEventObserver>> weakHashMap = f123447d;
            LinkedHashSet<ActivityEventObserver> linkedHashSet = weakHashMap.get(activity);
            if (linkedHashSet == null) {
                linkedHashSet = new LinkedHashSet<>();
                weakHashMap.put(activity, linkedHashSet);
            }
            linkedHashSet.add(new ActivityEventObserver(event, z, function0));
        }
    }
}
