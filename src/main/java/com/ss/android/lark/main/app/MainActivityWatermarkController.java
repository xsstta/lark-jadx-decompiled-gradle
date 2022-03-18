package com.ss.android.lark.main.app;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.main.C44134a;
import com.ss.android.lark.main.guide.TenantSwitchGuideAgent;
import com.ss.android.lark.main.interfaces.AbstractC44499a;
import com.ss.android.lark.main.interfaces.AbstractC44504g;
import com.ss.android.lark.main.p2231a.AbstractC44136a;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000;\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\r\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0013\u001a\u00020\u0014J\u0006\u0010\u0015\u001a\u00020\u0014J\u0006\u0010\u0016\u001a\u00020\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0007\u001a\n \t*\u0004\u0018\u00010\b0\b8BX\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0010\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0004\n\u0002\u0010\u000eR\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/ss/android/lark/main/app/MainActivityWatermarkController;", "", "mainActivity", "Lcom/ss/android/lark/main/app/MainActivity;", "(Lcom/ss/android/lark/main/app/MainActivity;)V", "mainListener", "Lcom/ss/android/lark/main/interfaces/IAccountChangeListener;", "mainModuleDependency", "Lcom/ss/android/lark/main/dependency/IMainModuleDependency;", "kotlin.jvm.PlatformType", "getMainModuleDependency", "()Lcom/ss/android/lark/main/dependency/IMainModuleDependency;", "tenantSwitchListener", "com/ss/android/lark/main/app/MainActivityWatermarkController$tenantSwitchListener$1", "Lcom/ss/android/lark/main/app/MainActivityWatermarkController$tenantSwitchListener$1;", "watermarkDrawable", "Landroid/graphics/drawable/Drawable;", "watermarkHandle", "Lcom/ss/android/lark/main/app/MainActivityWatermarkHandle;", "addGlobalWatermark", "", "destroy", "postSplashRoute", "core_main_main_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.main.app.c */
public final class MainActivityWatermarkController {

    /* renamed from: a */
    public Drawable f112118a;

    /* renamed from: b */
    public final C44188d f112119b = new C44188d(this);

    /* renamed from: c */
    public final MainActivity f112120c;

    /* renamed from: d */
    private final AbstractC44499a f112121d = new C44185b(this);

    /* renamed from: e */
    private final MainActivityWatermarkHandle f112122e;

    /* renamed from: d */
    private final AbstractC44136a m175317d() {
        return this.f112120c.f112091b;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "onAccountChange"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.main.app.c$b */
    static final class C44185b implements AbstractC44499a {

        /* renamed from: a */
        final /* synthetic */ MainActivityWatermarkController f112124a;

        C44185b(MainActivityWatermarkController cVar) {
            this.f112124a = cVar;
        }

        @Override // com.ss.android.lark.main.interfaces.AbstractC44499a
        /* renamed from: a */
        public final void mo157172a() {
            UICallbackExecutor.execute(new Runnable(this) {
                /* class com.ss.android.lark.main.app.MainActivityWatermarkController.C44185b.RunnableC441861 */

                /* renamed from: a */
                final /* synthetic */ C44185b f112125a;

                {
                    this.f112125a = r1;
                }

                public final void run() {
                    if (!this.f112125a.f112124a.f112120c.isDestroyed()) {
                        this.f112125a.f112124a.mo157169a();
                    }
                }
            });
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/lark/main/app/MainActivityWatermarkController$tenantSwitchListener$1", "Lcom/ss/android/lark/main/interfaces/ITenantSwitchListener;", "onBeginChange", "", "onEndChange", "isSuccess", "", "core_main_main_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.main.app.c$d */
    public static final class C44188d implements AbstractC44504g {

        /* renamed from: a */
        final /* synthetic */ MainActivityWatermarkController f112127a;

        @Override // com.ss.android.lark.main.interfaces.AbstractC44504g
        /* renamed from: a */
        public void mo157175a() {
            UICallbackExecutor.execute(new RunnableC44189a(this));
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.main.app.c$d$a */
        static final class RunnableC44189a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C44188d f112128a;

            RunnableC44189a(C44188d dVar) {
                this.f112128a = dVar;
            }

            public final void run() {
                Window window = this.f112128a.f112127a.f112120c.getWindow();
                Intrinsics.checkExpressionValueIsNotNull(window, "mainActivity.window");
                View decorView = window.getDecorView();
                if (decorView != null) {
                    FrameLayout frameLayout = (FrameLayout) decorView;
                    this.f112128a.f112127a.f112118a = frameLayout.getForeground();
                    if (this.f112128a.f112127a.f112118a != null) {
                        frameLayout.setForeground(null);
                        return;
                    }
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout");
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.main.app.c$d$b */
        static final class RunnableC44190b implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C44188d f112129a;

            /* renamed from: b */
            final /* synthetic */ boolean f112130b;

            RunnableC44190b(C44188d dVar, boolean z) {
                this.f112129a = dVar;
                this.f112130b = z;
            }

            public final void run() {
                if (!this.f112130b && this.f112129a.f112127a.f112118a != null) {
                    Window window = this.f112129a.f112127a.f112120c.getWindow();
                    Intrinsics.checkExpressionValueIsNotNull(window, "mainActivity.window");
                    View decorView = window.getDecorView();
                    if (decorView != null) {
                        ((FrameLayout) decorView).setForeground(this.f112129a.f112127a.f112118a);
                        this.f112129a.f112127a.f112118a = null;
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout");
                    }
                }
                TenantSwitchGuideAgent.f112846a.mo157926a(false);
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C44188d(MainActivityWatermarkController cVar) {
            this.f112127a = cVar;
        }

        @Override // com.ss.android.lark.main.interfaces.AbstractC44504g
        /* renamed from: a */
        public void mo157176a(boolean z) {
            UICallbackExecutor.execute(new RunnableC44190b(this, z));
        }
    }

    /* renamed from: c */
    public final void mo157171c() {
        AbstractC44136a a = C44134a.m174959a();
        Intrinsics.checkExpressionValueIsNotNull(a, "MainModule.getDependency()");
        a.mo133194N().mo133383a(this.f112121d);
        UICallbackExecutor.executeDelayed(new RunnableC44187c(this), 3000);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.main.app.c$c */
    public static final class RunnableC44187c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MainActivityWatermarkController f112126a;

        RunnableC44187c(MainActivityWatermarkController cVar) {
            this.f112126a = cVar;
        }

        public final void run() {
            if (!this.f112126a.f112120c.isDestroyed()) {
                Log.m165389i("MainModule_MainActivity", "delay register tenantSwitchListener");
                AbstractC44136a a = C44134a.m174959a();
                Intrinsics.checkExpressionValueIsNotNull(a, "MainModule.getDependency()");
                a.mo133188H().mo133401a(this.f112126a.f112119b);
            }
        }
    }

    /* renamed from: b */
    public final void mo157170b() {
        AbstractC44136a a = C44134a.m174959a();
        Intrinsics.checkExpressionValueIsNotNull(a, "MainModule.getDependency()");
        a.mo133194N().mo133387b(this.f112121d);
        AbstractC44136a a2 = C44134a.m174959a();
        Intrinsics.checkExpressionValueIsNotNull(a2, "MainModule.getDependency()");
        a2.mo133188H().mo133409b(this.f112119b);
    }

    /* renamed from: a */
    public final void mo157169a() {
        AbstractC44136a d = m175317d();
        Intrinsics.checkExpressionValueIsNotNull(d, "mainModuleDependency");
        AbstractC44136a.AbstractC44140ab h = d.mo133252h();
        Intrinsics.checkExpressionValueIsNotNull(h, "mainModuleDependency.watermarkDependency");
        if (!h.mo133337a()) {
            Log.m165389i("MainModule_MainActivity", "watermark v1 impl");
            this.f112122e.mo157181c();
            h.mo133336a((AbstractC44136a.AbstractC44140ab.AbstractC44141a) null);
            AbstractC44136a d2 = m175317d();
            Intrinsics.checkExpressionValueIsNotNull(d2, "mainModuleDependency");
            AbstractC44136a.AbstractC44160o m = d2.mo133257m();
            Intrinsics.checkExpressionValueIsNotNull(m, "mainModuleDependency.loginDependency");
            m.mo133342a(this.f112120c, R.color.color_transparent, new C44184a(this));
            return;
        }
        Log.m165389i("MainModule_MainActivity", "watermark v2 impl");
        this.f112122e.mo157180b();
    }

    public MainActivityWatermarkController(MainActivity mainActivity) {
        Intrinsics.checkParameterIsNotNull(mainActivity, "mainActivity");
        this.f112120c = mainActivity;
        this.f112122e = new MainActivityWatermarkHandle(mainActivity);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "needGlobalWatermark", "", "drawable", "Landroid/graphics/drawable/Drawable;", "kotlin.jvm.PlatformType", "onWatermarkSettingReady"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.main.app.c$a */
    public static final class C44184a implements AbstractC44136a.AbstractC44160o.AbstractC44161a {

        /* renamed from: a */
        final /* synthetic */ MainActivityWatermarkController f112123a;

        C44184a(MainActivityWatermarkController cVar) {
            this.f112123a = cVar;
        }

        @Override // com.ss.android.lark.main.p2231a.AbstractC44136a.AbstractC44160o.AbstractC44161a
        /* renamed from: a */
        public final void mo157133a(boolean z, Drawable drawable) {
            Window window = this.f112123a.f112120c.getWindow();
            Intrinsics.checkExpressionValueIsNotNull(window, "mainActivity.window");
            View decorView = window.getDecorView();
            if (decorView != null) {
                ((FrameLayout) decorView).setForeground(null);
                if (z && drawable != null) {
                    Window window2 = this.f112123a.f112120c.getWindow();
                    Intrinsics.checkExpressionValueIsNotNull(window2, "mainActivity.window");
                    View decorView2 = window2.getDecorView();
                    if (decorView2 != null) {
                        ((FrameLayout) decorView2).setForeground(drawable);
                        return;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout");
                }
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout");
        }
    }
}
