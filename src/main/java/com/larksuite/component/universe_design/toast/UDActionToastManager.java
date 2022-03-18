package com.larksuite.component.universe_design.toast;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.LinkedList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000G\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0017\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\u001eB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\b\u0010\u0012\u001a\u00020\u000fH\u0002J\u0010\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\r\u0010\u0016\u001a\u00020\u0017H\u0002¢\u0006\u0002\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\b\u0010\u001c\u001a\u00020\u000fH\u0002J\u000e\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\t\u001a\u00020\nX.¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/larksuite/component/universe_design/toast/UDActionToastManager;", "", "()V", "activityLifecycleCallbacks", "Landroid/app/Application$ActivityLifecycleCallbacks;", "getActivityLifecycleCallbacks", "()Landroid/app/Application$ActivityLifecycleCallbacks;", "activityLifecycleCallbacks$delegate", "Lkotlin/Lazy;", "handler", "Landroid/os/Handler;", "toastLinkedList", "Ljava/util/LinkedList;", "Lcom/larksuite/component/universe_design/toast/UDActionToastManager$ToastInfo;", "add", "", "toast", "Lcom/larksuite/component/universe_design/toast/UDActionToast;", "checkToShow", "clearToastInActivity", "activity", "Landroid/app/Activity;", "createActivityLifeCycleListener", "com/larksuite/component/universe_design/toast/UDActionToastManager$createActivityLifeCycleListener$1", "()Lcom/larksuite/component/universe_design/toast/UDActionToastManager$createActivityLifeCycleListener$1;", "dismissByTag", "tag", "", "initIfNeeded", "remove", "ToastInfo", "universe-ui-toast_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.component.universe_design.toast.b */
public final class UDActionToastManager {

    /* renamed from: a */
    public static final UDActionToastManager f63803a = new UDActionToastManager();

    /* renamed from: b */
    private static Handler f63804b;

    /* renamed from: c */
    private static final LinkedList<ToastInfo> f63805c = new LinkedList<>();

    /* renamed from: d */
    private static final Lazy f63806d = LazyKt.lazy(C25803b.INSTANCE);

    /* renamed from: c */
    private final Application.ActivityLifecycleCallbacks m93235c() {
        return (Application.ActivityLifecycleCallbacks) f63806d.getValue();
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001H\u0002J\b\u0010\u000e\u001a\u00020\u0006H\u0016R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000f"}, d2 = {"Lcom/larksuite/component/universe_design/toast/UDActionToastManager$ToastInfo;", "", "toast", "Lcom/larksuite/component/universe_design/toast/UDActionToast;", "(Lcom/larksuite/component/universe_design/toast/UDActionToast;)V", "tag", "", "getTag", "()I", "getToast", "()Lcom/larksuite/component/universe_design/toast/UDActionToast;", "equals", "", "other", "hashCode", "universe-ui-toast_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.universe_design.toast.b$a */
    public static final class ToastInfo {

        /* renamed from: a */
        private final int f63807a;

        /* renamed from: b */
        private final UDActionToast f63808b;

        /* renamed from: a */
        public final int mo91683a() {
            return this.f63807a;
        }

        /* renamed from: b */
        public final UDActionToast mo91684b() {
            return this.f63808b;
        }

        public int hashCode() {
            return this.f63807a;
        }

        public ToastInfo(UDActionToast aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, "toast");
            this.f63808b = aVar;
            this.f63807a = aVar.hashCode();
        }

        public boolean equals(Object obj) {
            Class<?> cls;
            if (this == obj) {
                return true;
            }
            Class<?> cls2 = getClass();
            if (obj != null) {
                cls = obj.getClass();
            } else {
                cls = null;
            }
            if (!Intrinsics.areEqual(cls2, cls)) {
                return false;
            }
            if (obj == null) {
                throw new TypeCastException("null cannot be cast to non-null type com.larksuite.component.universe_design.toast.UDActionToastManager.ToastInfo");
            } else if (!Intrinsics.areEqual(this.f63808b, ((ToastInfo) obj).f63808b)) {
                return false;
            } else {
                return true;
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u0012\u0010\b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\t\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\n\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u001c\u0010\u000b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u0007H\u0016J\u0012\u0010\r\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u000e\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u000f"}, d2 = {"com/larksuite/component/universe_design/toast/UDActionToastManager$createActivityLifeCycleListener$1", "Landroid/app/Application$ActivityLifecycleCallbacks;", "onActivityCreated", "", "activity", "Landroid/app/Activity;", "savedInstanceState", "Landroid/os/Bundle;", "onActivityDestroyed", "onActivityPaused", "onActivityResumed", "onActivitySaveInstanceState", "outState", "onActivityStarted", "onActivityStopped", "universe-ui-toast_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.universe_design.toast.b$c */
    public static final class C25804c implements Application.ActivityLifecycleCallbacks {
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        public void onActivityDestroyed(Activity activity) {
        }

        public void onActivityResumed(Activity activity) {
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStarted(Activity activity) {
        }

        public void onActivityStopped(Activity activity) {
        }

        C25804c() {
        }

        public void onActivityPaused(Activity activity) {
            if (activity != null) {
                UDActionToastManager.f63803a.mo91679a(activity);
                activity.getApplication().unregisterActivityLifecycleCallbacks(this);
            }
        }
    }

    private UDActionToastManager() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\t\n\u0000\n\u0002\b\u0003*\u0001\u0001\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "com/larksuite/component/universe_design/toast/UDActionToastManager$createActivityLifeCycleListener$1", "invoke", "()Lcom/larksuite/component/universe_design/toast/UDActionToastManager$createActivityLifeCycleListener$1;"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.universe_design.toast.b$b */
    static final class C25803b extends Lambda implements Function0<C25804c> {
        public static final C25803b INSTANCE = new C25803b();

        C25803b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C25804c invoke() {
            return UDActionToastManager.f63803a.mo91681b();
        }
    }

    /* renamed from: b */
    public final C25804c mo91681b() {
        return new C25804c();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.universe_design.toast.b$f */
    public static final class RunnableC25807f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ UDActionToast f63810a;

        RunnableC25807f(UDActionToast aVar) {
            this.f63810a = aVar;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.larksuite.component.universe_design.toast.b$f$a */
        static final class C25808a extends Lambda implements Function0<Unit> {
            final /* synthetic */ ToastInfo $info;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C25808a(ToastInfo aVar) {
                super(0);
                this.$info = aVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public final void invoke() {
                UDActionToastManager bVar = UDActionToastManager.f63803a;
                UDActionToastManager.f63805c.remove(this.$info);
                UDActionToastManager.f63803a.mo91677a();
            }
        }

        public final void run() {
            boolean z;
            int hashCode = this.f63810a.hashCode();
            UDActionToast aVar = null;
            ToastInfo aVar2 = null;
            UDActionToastManager bVar = UDActionToastManager.f63803a;
            for (ToastInfo aVar3 : UDActionToastManager.f63805c) {
                if (aVar3.mo91683a() == hashCode) {
                    aVar2 = aVar3;
                }
            }
            if (aVar2 != null) {
                UDActionToast b = aVar2.mo91684b();
                if (b.mo91659a() == 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    aVar = b;
                }
                if (aVar != null) {
                    aVar.mo91666a(new C25808a(aVar2));
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.universe_design.toast.b$d */
    public static final class C25805d extends Lambda implements Function0<Unit> {
        final /* synthetic */ ToastInfo $info;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C25805d(ToastInfo aVar) {
            super(0);
            this.$info = aVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            UDActionToastManager bVar = UDActionToastManager.f63803a;
            UDActionToastManager.f63805c.remove(this.$info);
            UDActionToastManager.f63803a.mo91677a();
        }
    }

    /* renamed from: d */
    private final void m93236d() {
        if (f63804b == null) {
            f63804b = new Handler(Looper.getMainLooper(), C25806e.f63809a);
        }
    }

    /* renamed from: a */
    public final void mo91677a() {
        LinkedList<ToastInfo> linkedList = f63805c;
        if (!linkedList.isEmpty()) {
            ToastInfo first = linkedList.getFirst();
            Intrinsics.checkExpressionValueIsNotNull(first, "toastLinkedList.first");
            ToastInfo aVar = first;
            UDActionToast b = aVar.mo91684b();
            if (b.mo91659a() != 2) {
                b.mo91670d();
                Handler handler = f63804b;
                if (handler == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("handler");
                }
                handler.sendEmptyMessageDelayed(aVar.mo91683a(), b.mo91667b());
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/os/Message;", "kotlin.jvm.PlatformType", "handleMessage"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.universe_design.toast.b$e */
    public static final class C25806e implements Handler.Callback {

        /* renamed from: a */
        public static final C25806e f63809a = new C25806e();

        C25806e() {
        }

        public final boolean handleMessage(Message message) {
            UDActionToastManager.f63803a.mo91678a(message.what);
            return true;
        }
    }

    /* renamed from: b */
    public final void mo91682b(UDActionToast aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "toast");
        m93236d();
        Handler handler = f63804b;
        if (handler == null) {
            Intrinsics.throwUninitializedPropertyAccessException("handler");
        }
        handler.post(new RunnableC25807f(aVar));
    }

    /* renamed from: a */
    public final void mo91678a(int i) {
        LinkedList<ToastInfo> linkedList = f63805c;
        if (!linkedList.isEmpty()) {
            ToastInfo aVar = (ToastInfo) CollectionsKt.first((List) linkedList);
            if (aVar.mo91683a() == i) {
                aVar.mo91684b().mo91666a(new C25805d(aVar));
            }
        }
    }

    /* renamed from: a */
    public final void mo91679a(Activity activity) {
        while (true) {
            LinkedList<ToastInfo> linkedList = f63805c;
            if (!linkedList.isEmpty()) {
                ToastInfo first = linkedList.getFirst();
                UDActionToast b = first.mo91684b();
                if (Intrinsics.areEqual(b.mo91672f(), activity)) {
                    if (b.mo91659a() == 2) {
                        b.mo91671e();
                        Handler handler = f63804b;
                        if (handler == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("handler");
                        }
                        handler.removeMessages(first.mo91683a());
                    }
                    linkedList.remove(first);
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public final void mo91680a(UDActionToast aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "toast");
        m93236d();
        f63805c.addLast(new ToastInfo(aVar));
        aVar.mo91672f().getApplication().registerActivityLifecycleCallbacks(m93235c());
        mo91677a();
    }
}
