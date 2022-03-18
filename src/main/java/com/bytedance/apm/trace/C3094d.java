package com.bytedance.apm.trace;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.fragment.app.Fragment;
import com.bytedance.apm.agent.monitor.MonitorTool;
import com.bytedance.apm.agent.tracing.AutoPageTraceHelper;
import com.bytedance.apm.core.ActivityLifeObserver;
import com.bytedance.apm.internal.ApmDelegate;
import com.bytedance.apm.trace.p156b.C3092a;
import com.bytedance.services.apm.api.AbstractC20698c;
import java.lang.ref.WeakReference;

/* renamed from: com.bytedance.apm.trace.d */
public class C3094d implements AbstractC20698c {

    /* renamed from: a */
    public long f9941a = -1;

    /* renamed from: b */
    public String f9942b;

    /* renamed from: c */
    public ViewTreeObserver.OnGlobalLayoutListener f9943c;

    /* renamed from: d */
    public Runnable f9944d;

    /* renamed from: e */
    public Handler f9945e = new Handler(Looper.getMainLooper());

    /* renamed from: f */
    public long f9946f;

    /* renamed from: g */
    private boolean f9947g;

    @Override // com.bytedance.services.apm.api.AbstractC20698c
    public void onActivityResume(Activity activity) {
    }

    @Override // com.bytedance.services.apm.api.AbstractC20698c
    public void onActivityStarted(Activity activity) {
    }

    @Override // com.bytedance.services.apm.api.AbstractC20698c
    public void onBackground(Activity activity) {
    }

    @Override // com.bytedance.services.apm.api.AbstractC20698c
    public void onChange(Activity activity, Fragment fragment) {
    }

    @Override // com.bytedance.services.apm.api.AbstractC20698c
    public void onFront(Activity activity) {
    }

    /* renamed from: a */
    public void mo12975a() {
        this.f9946f = ApmDelegate.m12591a().mo12793f().mo12394c();
        this.f9947g = ApmDelegate.m12591a().mo12793f().mo12393b();
        ActivityLifeObserver.getInstance().register(this);
    }

    @Override // com.bytedance.services.apm.api.AbstractC20698c
    public void onActivityPause(Activity activity) {
        this.f9941a = 0;
        try {
            if (this.f9943c != null) {
                activity.getWindow().getDecorView().getViewTreeObserver().removeOnGlobalLayoutListener(this.f9943c);
                this.f9943c = null;
            }
            Runnable runnable = this.f9944d;
            if (runnable != null) {
                this.f9945e.removeCallbacks(runnable);
                this.f9944d = null;
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    private void m12886a(Activity activity) {
        this.f9941a = System.currentTimeMillis();
        String canonicalName = activity.getClass().getCanonicalName();
        this.f9942b = canonicalName;
        final Integer a = C3092a.m12878a(canonicalName);
        if (a != null) {
            final WeakReference weakReference = new WeakReference(activity.getWindow().getDecorView());
            this.f9943c = new ViewTreeObserver.OnGlobalLayoutListener() {
                /* class com.bytedance.apm.trace.C3094d.ViewTreeObserver$OnGlobalLayoutListenerC30951 */

                public void onGlobalLayout() {
                    View findViewById;
                    if (weakReference.get() != null && (findViewById = ((View) weakReference.get()).findViewById(a.intValue())) != null && findViewById.getVisibility() == 0 && findViewById.getWidth() > 0) {
                        ViewTreeObserver viewTreeObserver = ((View) weakReference.get()).getViewTreeObserver();
                        if (viewTreeObserver.isAlive() && C3094d.this.f9943c != null) {
                            viewTreeObserver.removeOnGlobalLayoutListener(C3094d.this.f9943c);
                        }
                        if (C3094d.this.f9944d != null) {
                            C3094d.this.f9945e.removeCallbacks(C3094d.this.f9944d);
                            C3094d.this.f9944d = null;
                        }
                        C3094d.this.f9943c = null;
                        if (C3094d.this.f9941a > 0) {
                            long currentTimeMillis = System.currentTimeMillis();
                            long j = currentTimeMillis - C3094d.this.f9941a;
                            C3094d.this.f9941a = 0;
                            if (j < C3094d.this.f9946f && j > 0) {
                                AutoPageTraceHelper.reportViewIdStats(currentTimeMillis, C3094d.this.f9942b);
                                MonitorTool.reportTraceTime(C3094d.this.f9942b, "activityOnCreateToViewShow", j);
                            }
                        }
                    }
                }
            };
            ((View) weakReference.get()).getViewTreeObserver().addOnGlobalLayoutListener(this.f9943c);
            RunnableC30962 r4 = new Runnable() {
                /* class com.bytedance.apm.trace.C3094d.RunnableC30962 */

                public void run() {
                    if (C3094d.this.f9943c != null && weakReference.get() != null) {
                        ((View) weakReference.get()).getViewTreeObserver().removeOnGlobalLayoutListener(C3094d.this.f9943c);
                    }
                }
            };
            this.f9944d = r4;
            this.f9945e.postDelayed(r4, this.f9946f);
        }
    }

    @Override // com.bytedance.services.apm.api.AbstractC20698c
    public void onActivityCreated(Activity activity, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16 && this.f9947g) {
            try {
                m12886a(activity);
            } catch (Exception unused) {
            }
        }
    }
}
