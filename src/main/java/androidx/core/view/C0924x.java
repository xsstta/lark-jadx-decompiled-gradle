package androidx.core.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

/* renamed from: androidx.core.view.x */
public final class C0924x {

    /* renamed from: a */
    Runnable f3473a;

    /* renamed from: b */
    Runnable f3474b;

    /* renamed from: c */
    int f3475c = -1;

    /* renamed from: d */
    private WeakReference<View> f3476d;

    /* renamed from: a */
    public long mo4722a() {
        View view = this.f3476d.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0;
    }

    /* renamed from: c */
    public void mo4732c() {
        View view = this.f3476d.get();
        if (view != null) {
            view.animate().start();
        }
    }

    /* renamed from: b */
    public void mo4730b() {
        View view = this.f3476d.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.core.view.x$a */
    public static class C0927a implements AbstractC0928y {

        /* renamed from: a */
        C0924x f3483a;

        /* renamed from: b */
        boolean f3484b;

        C0927a(C0924x xVar) {
            this.f3483a = xVar;
        }

        @Override // androidx.core.view.AbstractC0928y
        /* renamed from: c */
        public void mo2464c(View view) {
            AbstractC0928y yVar;
            Object tag = view.getTag(2113929216);
            if (tag instanceof AbstractC0928y) {
                yVar = (AbstractC0928y) tag;
            } else {
                yVar = null;
            }
            if (yVar != null) {
                yVar.mo2464c(view);
            }
        }

        @Override // androidx.core.view.AbstractC0928y
        /* renamed from: a */
        public void mo868a(View view) {
            this.f3484b = false;
            AbstractC0928y yVar = null;
            if (this.f3483a.f3475c > -1) {
                view.setLayerType(2, null);
            }
            if (this.f3483a.f3473a != null) {
                Runnable runnable = this.f3483a.f3473a;
                this.f3483a.f3473a = null;
                runnable.run();
            }
            Object tag = view.getTag(2113929216);
            if (tag instanceof AbstractC0928y) {
                yVar = (AbstractC0928y) tag;
            }
            if (yVar != null) {
                yVar.mo868a(view);
            }
        }

        @Override // androidx.core.view.AbstractC0928y
        /* renamed from: b */
        public void mo869b(View view) {
            AbstractC0928y yVar = null;
            if (this.f3483a.f3475c > -1) {
                view.setLayerType(this.f3483a.f3475c, null);
                this.f3483a.f3475c = -1;
            }
            if (Build.VERSION.SDK_INT >= 16 || !this.f3484b) {
                if (this.f3483a.f3474b != null) {
                    Runnable runnable = this.f3483a.f3474b;
                    this.f3483a.f3474b = null;
                    runnable.run();
                }
                Object tag = view.getTag(2113929216);
                if (tag instanceof AbstractC0928y) {
                    yVar = (AbstractC0928y) tag;
                }
                if (yVar != null) {
                    yVar.mo869b(view);
                }
                this.f3484b = true;
            }
        }
    }

    C0924x(View view) {
        this.f3476d = new WeakReference<>(view);
    }

    /* renamed from: b */
    public C0924x mo4728b(float f) {
        View view = this.f3476d.get();
        if (view != null) {
            view.animate().translationX(f);
        }
        return this;
    }

    /* renamed from: c */
    public C0924x mo4731c(float f) {
        View view = this.f3476d.get();
        if (view != null) {
            view.animate().translationY(f);
        }
        return this;
    }

    /* renamed from: b */
    public C0924x mo4729b(long j) {
        View view = this.f3476d.get();
        if (view != null) {
            view.animate().setStartDelay(j);
        }
        return this;
    }

    /* renamed from: a */
    public C0924x mo4723a(float f) {
        View view = this.f3476d.get();
        if (view != null) {
            view.animate().alpha(f);
        }
        return this;
    }

    /* renamed from: a */
    public C0924x mo4724a(long j) {
        View view = this.f3476d.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
        return this;
    }

    /* renamed from: a */
    public C0924x mo4725a(Interpolator interpolator) {
        View view = this.f3476d.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    /* renamed from: a */
    public C0924x mo4726a(final AbstractC0882aa aaVar) {
        final View view = this.f3476d.get();
        if (view != null && Build.VERSION.SDK_INT >= 19) {
            C09262 r1 = null;
            if (aaVar != null) {
                r1 = new ValueAnimator.AnimatorUpdateListener() {
                    /* class androidx.core.view.C0924x.C09262 */

                    public void onAnimationUpdate(ValueAnimator valueAnimator) {
                        aaVar.a_(view);
                    }
                };
            }
            view.animate().setUpdateListener(r1);
        }
        return this;
    }

    /* renamed from: a */
    public C0924x mo4727a(AbstractC0928y yVar) {
        View view = this.f3476d.get();
        if (view != null) {
            if (Build.VERSION.SDK_INT >= 16) {
                m4423a(view, yVar);
            } else {
                view.setTag(2113929216, yVar);
                m4423a(view, new C0927a(this));
            }
        }
        return this;
    }

    /* renamed from: a */
    private void m4423a(final View view, final AbstractC0928y yVar) {
        if (yVar != null) {
            view.animate().setListener(new AnimatorListenerAdapter() {
                /* class androidx.core.view.C0924x.C09251 */

                public void onAnimationCancel(Animator animator) {
                    yVar.mo2464c(view);
                }

                public void onAnimationEnd(Animator animator) {
                    yVar.mo869b(view);
                }

                public void onAnimationStart(Animator animator) {
                    yVar.mo868a(view);
                }
            });
        } else {
            view.animate().setListener(null);
        }
    }
}
