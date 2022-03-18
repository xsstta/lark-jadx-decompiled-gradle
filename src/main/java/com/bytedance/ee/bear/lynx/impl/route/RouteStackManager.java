package com.bytedance.ee.bear.lynx.impl.route;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.bytedance.ee.log.C13479a;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.C69097g;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0007H\u0002J\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0010J\u000e\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\tJ\u0010\u0010\u0013\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0007H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX.¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/bytedance/ee/bear/lynx/impl/route/RouteStackManager;", "", "()V", "activityLifecycleCallback", "Landroid/app/Application$ActivityLifecycleCallbacks;", "activityList", "", "Lcom/bytedance/ee/bear/lynx/impl/route/RouterAbilityProvider;", "application", "Landroid/app/Application;", "initialized", "Ljava/util/concurrent/atomic/AtomicBoolean;", "add", "", "item", "getActivityList", "", "init", "app", "remove", "Companion", "lynx-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.lynx.impl.b.c */
public final class RouteStackManager {

    /* renamed from: b */
    public static final Lazy f23750b = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) C8823b.INSTANCE);

    /* renamed from: c */
    public static final Companion f23751c = new Companion(null);

    /* renamed from: a */
    public Application f23752a;

    /* renamed from: d */
    private final AtomicBoolean f23753d = new AtomicBoolean(false);

    /* renamed from: e */
    private final List<RouterAbilityProvider> f23754e = new ArrayList();

    /* renamed from: f */
    private final Application.ActivityLifecycleCallbacks f23755f = new C8824c(this);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068FX\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/bytedance/ee/bear/lynx/impl/route/RouteStackManager$Companion;", "", "()V", "TAG", "", "instance", "Lcom/bytedance/ee/bear/lynx/impl/route/RouteStackManager;", "getInstance", "()Lcom/bytedance/ee/bear/lynx/impl/route/RouteStackManager;", "instance$delegate", "Lkotlin/Lazy;", "lynx-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.lynx.impl.b.c$a */
    public static final class Companion {

        /* renamed from: a */
        static final /* synthetic */ KProperty[] f23756a = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Companion.class), "instance", "getInstance()Lcom/bytedance/ee/bear/lynx/impl/route/RouteStackManager;"))};

        /* renamed from: a */
        public final RouteStackManager mo33898a() {
            Lazy lazy = RouteStackManager.f23750b;
            Companion aVar = RouteStackManager.f23751c;
            KProperty kProperty = f23756a[0];
            return (RouteStackManager) lazy.getValue();
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/lynx/impl/route/RouteStackManager;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.lynx.impl.b.c$b */
    static final class C8823b extends Lambda implements Function0<RouteStackManager> {
        public static final C8823b INSTANCE = new C8823b();

        C8823b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final RouteStackManager invoke() {
            return new RouteStackManager();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0007H\u0016J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u000f"}, d2 = {"com/bytedance/ee/bear/lynx/impl/route/RouteStackManager$activityLifecycleCallback$1", "Landroid/app/Application$ActivityLifecycleCallbacks;", "onActivityCreated", "", "activity", "Landroid/app/Activity;", "savedInstanceState", "Landroid/os/Bundle;", "onActivityDestroyed", "onActivityPaused", "onActivityResumed", "onActivitySaveInstanceState", "outState", "onActivityStarted", "onActivityStopped", "lynx-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.lynx.impl.b.c$c */
    public static final class C8824c implements Application.ActivityLifecycleCallbacks {

        /* renamed from: a */
        final /* synthetic */ RouteStackManager f23757a;

        public void onActivityPaused(Activity activity) {
            Intrinsics.checkParameterIsNotNull(activity, "activity");
        }

        public void onActivityResumed(Activity activity) {
            Intrinsics.checkParameterIsNotNull(activity, "activity");
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            Intrinsics.checkParameterIsNotNull(activity, "activity");
            Intrinsics.checkParameterIsNotNull(bundle, "outState");
        }

        public void onActivityStarted(Activity activity) {
            Intrinsics.checkParameterIsNotNull(activity, "activity");
        }

        public void onActivityStopped(Activity activity) {
            Intrinsics.checkParameterIsNotNull(activity, "activity");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C8824c(RouteStackManager cVar) {
            this.f23757a = cVar;
        }

        public void onActivityDestroyed(Activity activity) {
            Intrinsics.checkParameterIsNotNull(activity, "activity");
            if (activity instanceof RouterAbilityProvider) {
                this.f23757a.mo33897b((RouterAbilityProvider) activity);
            }
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
            Intrinsics.checkParameterIsNotNull(activity, "activity");
            if (activity instanceof RouterAbilityProvider) {
                this.f23757a.mo33896a((RouterAbilityProvider) activity);
            }
        }
    }

    /* renamed from: a */
    public final void mo33895a(Application application) {
        Intrinsics.checkParameterIsNotNull(application, "app");
        if (!this.f23753d.compareAndSet(false, true)) {
            return;
        }
        if (this.f23752a != null) {
            C13479a.m54775e("RouteStackManager", "application has been initialized!");
            return;
        }
        this.f23752a = application;
        if (application == null) {
            Intrinsics.throwUninitializedPropertyAccessException("application");
        }
        application.registerActivityLifecycleCallbacks(this.f23755f);
    }

    /* renamed from: a */
    public final void mo33896a(RouterAbilityProvider dVar) {
        Object obj;
        Object obj2;
        try {
            Result.Companion aVar = Result.Companion;
            if (dVar instanceof Activity) {
                obj2 = Boolean.valueOf(this.f23754e.add(dVar));
            } else {
                C13479a.m54775e("RouteStackManager", "add item item failure with it not a activity");
                obj2 = Unit.INSTANCE;
            }
            obj = Result.m271569constructorimpl(obj2);
        } catch (Throwable th) {
            Result.Companion aVar2 = Result.Companion;
            obj = Result.m271569constructorimpl(C69097g.m265890a(th));
        }
        if (Result.m271572exceptionOrNullimpl(obj) != null) {
            C13479a.m54758a("RouteStackManager", "add item failed: " + dVar);
        }
    }

    /* renamed from: b */
    public final void mo33897b(RouterAbilityProvider dVar) {
        Object obj;
        Object obj2;
        try {
            Result.Companion aVar = Result.Companion;
            if (dVar instanceof Activity) {
                obj2 = Boolean.valueOf(this.f23754e.remove(dVar));
            } else {
                C13479a.m54775e("RouteStackManager", "remove item item failure with it not a activity");
                obj2 = Unit.INSTANCE;
            }
            obj = Result.m271569constructorimpl(obj2);
        } catch (Throwable th) {
            Result.Companion aVar2 = Result.Companion;
            obj = Result.m271569constructorimpl(C69097g.m265890a(th));
        }
        if (Result.m271572exceptionOrNullimpl(obj) != null) {
            C13479a.m54758a("RouteStackManager", "remove item failed: " + dVar);
        }
    }
}
