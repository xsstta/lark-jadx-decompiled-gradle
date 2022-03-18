package com.ss.android.lark.desktopmode.utils.window;

import android.app.Activity;
import android.app.ActivityOptions;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/desktopmode/utils/window/DesktopWindowLaunchHelper;", "", "()V", "createActivityOptions", "Landroid/app/ActivityOptions;", "activity", "Landroid/app/Activity;", "launchParam", "Lcom/ss/android/lark/desktopmode/utils/window/LaunchParam;", "Companion", "desktop-mode_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.desktopmode.utils.d.b */
public final class DesktopWindowLaunchHelper {

    /* renamed from: a */
    public static final Lazy f94148a = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) C36591b.INSTANCE);

    /* renamed from: b */
    public static final Companion f94149b = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/desktopmode/utils/window/DesktopWindowLaunchHelper$Companion;", "", "()V", "instance", "Lcom/ss/android/lark/desktopmode/utils/window/DesktopWindowLaunchHelper;", "getInstance", "()Lcom/ss/android/lark/desktopmode/utils/window/DesktopWindowLaunchHelper;", "instance$delegate", "Lkotlin/Lazy;", "desktop-mode_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.desktopmode.utils.d.b$a */
    public static final class Companion {

        /* renamed from: a */
        static final /* synthetic */ KProperty[] f94150a = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Companion.class), "instance", "getInstance()Lcom/ss/android/lark/desktopmode/utils/window/DesktopWindowLaunchHelper;"))};

        /* renamed from: a */
        public final DesktopWindowLaunchHelper mo134981a() {
            Lazy lazy = DesktopWindowLaunchHelper.f94148a;
            Companion aVar = DesktopWindowLaunchHelper.f94149b;
            KProperty kProperty = f94150a[0];
            return (DesktopWindowLaunchHelper) lazy.getValue();
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private DesktopWindowLaunchHelper() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/desktopmode/utils/window/DesktopWindowLaunchHelper;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.desktopmode.utils.d.b$b */
    static final class C36591b extends Lambda implements Function0<DesktopWindowLaunchHelper> {
        public static final C36591b INSTANCE = new C36591b();

        C36591b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final DesktopWindowLaunchHelper invoke() {
            return new DesktopWindowLaunchHelper(null);
        }
    }

    public /* synthetic */ DesktopWindowLaunchHelper(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* renamed from: a */
    public final ActivityOptions mo134980a(Activity activity, LaunchParam cVar) {
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        Intrinsics.checkParameterIsNotNull(cVar, "launchParam");
        int b = cVar.mo134983b();
        if (b == 0) {
            return new ParentCenterWindowLauncher().mo134991a(activity, cVar);
        }
        if (b == 1) {
            return new TargetCoordinateWindowLauncher().mo134992a(activity, cVar);
        }
        if (b != 2) {
            return null;
        }
        return new BoundaryAdaptWindowLauncher().mo134979a(activity, cVar);
    }
}
