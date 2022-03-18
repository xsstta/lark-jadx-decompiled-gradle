package com.ss.android.lark.passport.infra.widget;

import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver;
import com.ss.android.lark.passport.infra.log.PassportLog;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.android.lark.passport.infra.widget.a */
public class C49240a {

    /* renamed from: a */
    public WeakReference<View> f123606a;

    /* renamed from: b */
    public WeakReference<AbstractC49245b> f123607b;

    /* renamed from: c */
    public boolean f123608c;

    /* renamed from: d */
    private final WeakReference<Activity> f123609d;

    /* renamed from: e */
    private ViewTreeObserver.OnGlobalLayoutListener f123610e;

    /* renamed from: com.ss.android.lark.passport.infra.widget.a$b */
    public interface AbstractC49245b {
        /* renamed from: a */
        void mo171800a();

        /* renamed from: b */
        void mo171801b();
    }

    /* renamed from: b */
    private boolean m194097b() {
        if ((this.f123609d.get().getWindow().getAttributes().softInputMode & 16) != 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.passport.infra.widget.a$a */
    public class ViewTreeObserver$OnGlobalLayoutListenerC49242a implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a */
        int f123611a;

        /* renamed from: b */
        boolean f123612b;

        public void onGlobalLayout() {
            View view = C49240a.this.f123606a.get();
            if (view == null) {
                PassportLog a = PassportLog.f123351c.mo171474a();
                a.mo171471d("KeyboardWatcher", "The rootView is null, Current thread: " + Thread.currentThread());
                return;
            }
            int height = view.getHeight();
            int i = this.f123611a;
            if (i == 0) {
                this.f123611a = height;
                return;
            }
            if (i > height) {
                if (!this.f123612b || !C49240a.this.f123608c) {
                    C49240a.this.f123608c = true;
                    view.post(new Runnable() {
                        /* class com.ss.android.lark.passport.infra.widget.C49240a.ViewTreeObserver$OnGlobalLayoutListenerC49242a.RunnableC492431 */

                        public void run() {
                            if (C49240a.this.f123607b.get() != null) {
                                C49240a.this.f123607b.get().mo171800a();
                            }
                        }
                    });
                }
            } else if (!this.f123612b || C49240a.this.f123608c) {
                C49240a.this.f123608c = false;
                view.post(new Runnable() {
                    /* class com.ss.android.lark.passport.infra.widget.C49240a.ViewTreeObserver$OnGlobalLayoutListenerC49242a.RunnableC492442 */

                    public void run() {
                        if (C49240a.this.f123607b != null && C49240a.this.f123607b.get() != null) {
                            C49240a.this.f123607b.get().mo171801b();
                        }
                    }
                });
            }
            this.f123612b = true;
        }

        private ViewTreeObserver$OnGlobalLayoutListenerC49242a() {
        }
    }

    /* renamed from: a */
    public void mo171795a() {
        Activity activity = this.f123609d.get();
        if (activity != null) {
            if (m194097b()) {
                WeakReference<View> weakReference = new WeakReference<>(activity.findViewById(16908290));
                this.f123606a = weakReference;
                if (this.f123610e != null) {
                    weakReference.get().getViewTreeObserver().removeOnGlobalLayoutListener(this.f123610e);
                    this.f123610e = null;
                }
                this.f123610e = new ViewTreeObserver$OnGlobalLayoutListenerC49242a();
                this.f123606a.get().getViewTreeObserver().addOnGlobalLayoutListener(this.f123610e);
                return;
            }
            PassportLog.f123351c.mo171474a().mo171471d("KeyboardWatcher", String.format("Activity %s should have windowSoftInputMode=\"adjustResize\"to make KeyboardWatcher working. You can set it in AndroidManifest.xml", activity.getClass().getSimpleName()));
        }
    }

    /* renamed from: a */
    public void mo171796a(AbstractC49245b bVar) {
        this.f123607b = new WeakReference<>(bVar);
    }

    public C49240a(Activity activity) {
        this.f123609d = new WeakReference<>(activity);
        mo171795a();
    }
}
