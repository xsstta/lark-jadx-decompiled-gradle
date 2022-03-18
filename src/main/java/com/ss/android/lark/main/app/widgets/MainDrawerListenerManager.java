package com.ss.android.lark.main.app.widgets;

import com.ss.android.lark.biz.core.api.IMainDrawerListener;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 \f2\u00020\u0001:\u0002\f\rB\u0005¢\u0006\u0002\u0010\u0002J\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005J\u000e\u0010\u000b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/main/app/widgets/MainDrawerListenerManager;", "", "()V", "mDrawerListener", "", "Lcom/ss/android/lark/biz/core/api/IMainDrawerListener;", "getDrawerListeners", "", "registerDrawerListener", "", "listener", "unregisterDrawerListener", "Companion", "InstanceHolder", "core_main_main_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.main.app.widgets.c */
public final class MainDrawerListenerManager {

    /* renamed from: a */
    public static final Companion f112748a = new Companion(null);

    /* renamed from: b */
    private final List<IMainDrawerListener> f112749b = new ArrayList();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/main/app/widgets/MainDrawerListenerManager$Companion;", "", "()V", "inst", "Lcom/ss/android/lark/main/app/widgets/MainDrawerListenerManager;", "core_main_main_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.main.app.widgets.c$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final MainDrawerListenerManager mo157810a() {
            return InstanceHolder.f112750a.mo157811a();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/main/app/widgets/MainDrawerListenerManager$InstanceHolder;", "", "()V", "instance", "Lcom/ss/android/lark/main/app/widgets/MainDrawerListenerManager;", "getInstance", "()Lcom/ss/android/lark/main/app/widgets/MainDrawerListenerManager;", "setInstance", "(Lcom/ss/android/lark/main/app/widgets/MainDrawerListenerManager;)V", "core_main_main_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.main.app.widgets.c$b */
    public static final class InstanceHolder {

        /* renamed from: a */
        public static final InstanceHolder f112750a = new InstanceHolder();

        /* renamed from: b */
        private static MainDrawerListenerManager f112751b = new MainDrawerListenerManager();

        private InstanceHolder() {
        }

        /* renamed from: a */
        public final MainDrawerListenerManager mo157811a() {
            return f112751b;
        }
    }

    /* renamed from: a */
    public final List<IMainDrawerListener> mo157807a() {
        return this.f112749b;
    }

    /* renamed from: a */
    public final void mo157808a(IMainDrawerListener xVar) {
        Intrinsics.checkParameterIsNotNull(xVar, "listener");
        this.f112749b.add(xVar);
    }

    /* renamed from: b */
    public final void mo157809b(IMainDrawerListener xVar) {
        Intrinsics.checkParameterIsNotNull(xVar, "listener");
        this.f112749b.remove(xVar);
    }
}
