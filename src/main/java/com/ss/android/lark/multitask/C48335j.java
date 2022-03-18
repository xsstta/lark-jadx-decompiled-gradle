package com.ss.android.lark.multitask;

import android.app.Application;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import com.larksuite.framework.utils.C26252ad;
import com.ss.android.lark.biz.core.api.ContentStateChangeCallback;
import com.ss.android.lark.biz.core.api.as;
import com.ss.android.lark.multitask.floating.FloatingManager;
import com.ss.android.lark.multitask.floating.ViewStateIdlePositionExclusionRectLifecycleInitializer;

/* renamed from: com.ss.android.lark.multitask.j */
public class C48335j {

    /* renamed from: a */
    private static volatile IMultitaskDependency f121728a;

    /* renamed from: b */
    private static Application f121729b;

    /* renamed from: a */
    public static IMultitaskDependency m190643a() {
        return f121728a;
    }

    public C48335j(IMultitaskDependency aVar) {
        f121728a = aVar;
    }

    /* renamed from: a */
    public as mo169056a(Fragment fragment) {
        return new as(fragment) {
            /* class com.ss.android.lark.multitask.C48335j.C483361 */

            /* renamed from: a */
            final ViewStateIdlePositionExclusionRectLifecycleInitializer f121730a;

            /* renamed from: b */
            final /* synthetic */ Fragment f121731b;

            @Override // com.ss.android.lark.biz.core.api.as
            /* renamed from: a */
            public Lifecycle mo105604a() {
                return this.f121730a.mo169038a();
            }

            @Override // com.ss.android.lark.biz.core.api.as
            /* renamed from: a */
            public void mo105605a(boolean z) {
                this.f121730a.mo169039a(z);
            }

            {
                this.f121731b = r2;
                this.f121730a = new ViewStateIdlePositionExclusionRectLifecycleInitializer(r2);
            }
        };
    }

    /* renamed from: a */
    public void mo169057a(Application application) {
        C48338l.m190661a(application, f121728a.mo168875f());
        f121729b = application;
        mo169064b(application);
    }

    /* renamed from: b */
    public void mo169064b(Application application) {
        if (C26252ad.m94993b(application) && mo169068d(f121729b)) {
            FloatingManager.f121676a.mo169005a(application);
        }
    }

    /* renamed from: c */
    public boolean mo169067c(Application application) {
        if (!C48338l.m190662a()) {
            C48338l.m190661a(application, f121728a.mo168875f());
        }
        return C48338l.m190663b();
    }

    /* renamed from: d */
    public boolean mo169068d(Application application) {
        if (!C48338l.m190662a()) {
            C48338l.m190661a(application, f121728a.mo168875f());
        }
        return C48338l.m190665c();
    }

    /* renamed from: a */
    public void mo169059a(View view) {
        if (mo169068d(f121729b)) {
            FloatingManager.f121676a.mo169007a(view);
        }
    }

    /* renamed from: b */
    public boolean mo169065b(View view) {
        if (!mo169068d(f121729b)) {
            return false;
        }
        FloatingManager.f121676a.mo169016b(view);
        return true;
    }

    /* renamed from: a */
    public void mo169062a(ContentStateChangeCallback dVar) {
        FloatingManager.f121676a.mo169011a(dVar);
    }

    /* renamed from: a */
    public void mo169063a(String str) {
        if (mo169068d(f121729b)) {
            FloatingManager.f121676a.mo169012a(str);
        }
    }

    /* renamed from: b */
    public boolean mo169066b(View view, AppCompatActivity appCompatActivity) {
        if (mo169068d(f121729b)) {
            FloatingManager.f121676a.mo169017b(view, appCompatActivity);
        }
        return false;
    }

    /* renamed from: a */
    public void mo169060a(View view, AppCompatActivity appCompatActivity) {
        if (mo169068d(f121729b)) {
            FloatingManager.f121676a.mo169008a(view, appCompatActivity);
        }
    }

    /* renamed from: a */
    public void mo169061a(Lifecycle lifecycle, View view) {
        if (mo169068d(f121729b)) {
            FloatingManager.f121676a.mo169010a(lifecycle, view);
        }
    }

    /* renamed from: a */
    public void mo169058a(Drawable drawable, int[] iArr, String str, int i, Runnable runnable) {
        if (mo169068d(f121729b)) {
            FloatingManager.f121676a.mo169006a(drawable, iArr, str, i, runnable);
        }
    }
}
