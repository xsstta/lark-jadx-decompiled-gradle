package com.ss.android.lark.slideback;

import android.app.Application;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/slideback/SlideBack;", "", "()V", "Companion", "slideback_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.slideback.i */
public final class SlideBack {

    /* renamed from: a */
    public static boolean f135612a;

    /* renamed from: b */
    public static final Companion f135613b = new Companion(null);

    @JvmStatic
    /* renamed from: a */
    public static final void m212969a(Application application) {
        f135613b.mo187288a(application);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m212970a(boolean z) {
        f135613b.mo187289a(z);
    }

    /* renamed from: a */
    public static final boolean m212971a() {
        return f135613b.mo187292b();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u0010\u0010\u0010\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012J\u0010\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0004H\u0007R$\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u00048FX\u0004¢\u0006\f\u0012\u0004\b\u000b\u0010\u0002\u001a\u0004\b\n\u0010\u0007¨\u0006\u0015"}, d2 = {"Lcom/ss/android/lark/slideback/SlideBack$Companion;", "", "()V", "ENABLE", "", "ENABLE$annotations", "getENABLE", "()Z", "setENABLE", "(Z)V", "isEnabled", "isEnabled$annotations", "initSlideBack", "", "application", "Landroid/app/Application;", "setGlobalSlideLayoutCallback", "observer", "Lcom/ss/android/lark/slideback/GlobalSlideLayoutCallback;", "setSystemExclusionRectsEnabled", "enabled", "slideback_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.slideback.i$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final boolean mo187290a() {
            return SlideBack.f135612a;
        }

        /* renamed from: b */
        public final boolean mo187292b() {
            return SlideBack.f135613b.mo187290a();
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo187289a(boolean z) {
            SlideFrameLayout.f135537m = z;
        }

        /* renamed from: b */
        public final void mo187291b(boolean z) {
            SlideBack.f135612a = z;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo187288a(Application application) {
            Intrinsics.checkParameterIsNotNull(application, "application");
            ActivityStack.f135610a.mo187276a(application);
            mo187291b(true);
        }
    }
}
