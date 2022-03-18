package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ReportFragment;

/* renamed from: androidx.lifecycle.aa */
public class C1128aa implements LifecycleOwner {

    /* renamed from: i */
    private static final C1128aa f4220i = new C1128aa();

    /* renamed from: a */
    ReportFragment.AbstractC1123a f4221a = new ReportFragment.AbstractC1123a() {
        /* class androidx.lifecycle.C1128aa.C11302 */

        @Override // androidx.lifecycle.ReportFragment.AbstractC1123a
        /* renamed from: a */
        public void mo5952a() {
        }

        @Override // androidx.lifecycle.ReportFragment.AbstractC1123a
        /* renamed from: b */
        public void mo5953b() {
            C1128aa.this.mo5975a();
        }

        @Override // androidx.lifecycle.ReportFragment.AbstractC1123a
        /* renamed from: c */
        public void mo5954c() {
            C1128aa.this.mo5976b();
        }
    };

    /* renamed from: b */
    private int f4222b;

    /* renamed from: c */
    private int f4223c;

    /* renamed from: d */
    private boolean f4224d = true;

    /* renamed from: e */
    private boolean f4225e = true;

    /* renamed from: f */
    private Handler f4226f;

    /* renamed from: g */
    private final LifecycleRegistry f4227g = new LifecycleRegistry(this);

    /* renamed from: h */
    private Runnable f4228h = new Runnable() {
        /* class androidx.lifecycle.C1128aa.RunnableC11291 */

        public void run() {
            C1128aa.this.mo5980e();
            C1128aa.this.mo5981f();
        }
    };

    @Override // androidx.lifecycle.LifecycleOwner
    public Lifecycle getLifecycle() {
        return this.f4227g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo5979d() {
        this.f4222b--;
        mo5981f();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo5980e() {
        if (this.f4223c == 0) {
            this.f4224d = true;
            this.f4227g.handleLifecycleEvent(Lifecycle.Event.ON_PAUSE);
        }
    }

    private C1128aa() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo5975a() {
        int i = this.f4222b + 1;
        this.f4222b = i;
        if (i == 1 && this.f4225e) {
            this.f4227g.handleLifecycleEvent(Lifecycle.Event.ON_START);
            this.f4225e = false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo5976b() {
        int i = this.f4223c + 1;
        this.f4223c = i;
        if (i != 1) {
            return;
        }
        if (this.f4224d) {
            this.f4227g.handleLifecycleEvent(Lifecycle.Event.ON_RESUME);
            this.f4224d = false;
            return;
        }
        this.f4226f.removeCallbacks(this.f4228h);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo5978c() {
        int i = this.f4223c - 1;
        this.f4223c = i;
        if (i == 0) {
            this.f4226f.postDelayed(this.f4228h, 700);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo5981f() {
        if (this.f4222b == 0 && this.f4224d) {
            this.f4227g.handleLifecycleEvent(Lifecycle.Event.ON_STOP);
            this.f4225e = true;
        }
    }

    /* renamed from: a */
    static void m5329a(Context context) {
        f4220i.mo5977b(context);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo5977b(Context context) {
        this.f4226f = new Handler();
        this.f4227g.handleLifecycleEvent(Lifecycle.Event.ON_CREATE);
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new C1159g() {
            /* class androidx.lifecycle.C1128aa.C11313 */

            @Override // androidx.lifecycle.C1159g
            public void onActivityPaused(Activity activity) {
                C1128aa.this.mo5978c();
            }

            @Override // androidx.lifecycle.C1159g
            public void onActivityStopped(Activity activity) {
                C1128aa.this.mo5979d();
            }

            public void onActivityPreCreated(Activity activity, Bundle bundle) {
                activity.registerActivityLifecycleCallbacks(new C1159g() {
                    /* class androidx.lifecycle.C1128aa.C11313.C11321 */

                    public void onActivityPostResumed(Activity activity) {
                        C1128aa.this.mo5976b();
                    }

                    public void onActivityPostStarted(Activity activity) {
                        C1128aa.this.mo5975a();
                    }
                });
            }

            @Override // androidx.lifecycle.C1159g
            public void onActivityCreated(Activity activity, Bundle bundle) {
                if (Build.VERSION.SDK_INT < 29) {
                    ReportFragment.m5311b(activity).mo5945a(C1128aa.this.f4221a);
                }
            }
        });
    }
}
