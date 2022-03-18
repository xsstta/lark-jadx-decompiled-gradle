package com.lcodecore.tkrefreshlayout.p1212a;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.animation.DecelerateInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.huawei.hms.support.api.entity.core.JosStatusCodes;
import com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout;
import com.lcodecore.tkrefreshlayout.p1213b.C26396b;
import com.lcodecore.tkrefreshlayout.p1213b.C26397c;

/* renamed from: com.lcodecore.tkrefreshlayout.a.a */
public class C26377a {

    /* renamed from: a */
    public TwinklingRefreshLayout.C26373a f65082a;

    /* renamed from: b */
    public boolean f65083b;

    /* renamed from: c */
    public boolean f65084c;

    /* renamed from: d */
    public boolean f65085d;

    /* renamed from: e */
    public boolean f65086e;

    /* renamed from: f */
    public boolean f65087f;

    /* renamed from: g */
    public boolean f65088g;

    /* renamed from: h */
    public boolean f65089h;

    /* renamed from: i */
    public boolean f65090i;

    /* renamed from: j */
    public boolean f65091j;

    /* renamed from: k */
    public boolean f65092k;

    /* renamed from: l */
    public boolean f65093l;

    /* renamed from: m */
    public boolean f65094m;

    /* renamed from: n */
    public ValueAnimator.AnimatorUpdateListener f65095n = new ValueAnimator.AnimatorUpdateListener() {
        /* class com.lcodecore.tkrefreshlayout.p1212a.C26377a.C263823 */

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            if (!C26377a.this.f65084c || !C26377a.this.f65082a.mo93591c()) {
                C26377a.this.f65082a.mo93605m().getLayoutParams().height = intValue;
                C26377a.this.f65082a.mo93605m().requestLayout();
                C26377a.this.f65082a.mo93605m().setTranslationY(BitmapDescriptorFactory.HUE_RED);
                C26377a.this.f65082a.mo93592d((float) intValue);
            } else {
                C26377a.this.mo93643d((float) intValue);
            }
            C26377a.this.f65082a.mo93603k().setTranslationY((float) (-intValue));
        }
    };

    /* renamed from: o */
    public ValueAnimator.AnimatorUpdateListener f65096o = new ValueAnimator.AnimatorUpdateListener() {
        /* class com.lcodecore.tkrefreshlayout.p1212a.C26377a.C263834 */

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            if (C26377a.this.f65082a.mo93568K()) {
                if (C26377a.this.f65082a.mo93604l().getVisibility() != 0) {
                    C26377a.this.f65082a.mo93604l().setVisibility(0);
                }
            } else if (C26377a.this.f65082a.mo93604l().getVisibility() != 8) {
                C26377a.this.f65082a.mo93604l().setVisibility(8);
            }
            if (!C26377a.this.f65083b || !C26377a.this.f65082a.mo93591c()) {
                C26377a.this.f65082a.mo93604l().setTranslationY(BitmapDescriptorFactory.HUE_RED);
                C26377a.this.f65082a.mo93604l().getLayoutParams().height = intValue;
                C26377a.this.f65082a.mo93604l().requestLayout();
                C26377a.this.f65082a.mo93589c((float) intValue);
            } else {
                C26377a.this.mo93640c((float) intValue);
            }
            C26377a.this.f65082a.mo93603k().setTranslationY((float) intValue);
            C26377a.this.mo93641c(intValue);
        }
    };

    /* renamed from: p */
    public ValueAnimator.AnimatorUpdateListener f65097p = new ValueAnimator.AnimatorUpdateListener() {
        /* class com.lcodecore.tkrefreshlayout.p1212a.C26377a.C263845 */

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            if (C26377a.this.f65082a.mo93569L()) {
                if (C26377a.this.f65082a.mo93605m().getVisibility() != 0) {
                    C26377a.this.f65082a.mo93605m().setVisibility(0);
                }
            } else if (C26377a.this.f65082a.mo93605m().getVisibility() != 8) {
                C26377a.this.f65082a.mo93605m().setVisibility(8);
            }
            if (!C26377a.this.f65084c || !C26377a.this.f65082a.mo93591c()) {
                C26377a.this.f65082a.mo93605m().getLayoutParams().height = intValue;
                C26377a.this.f65082a.mo93605m().requestLayout();
                C26377a.this.f65082a.mo93605m().setTranslationY(BitmapDescriptorFactory.HUE_RED);
                C26377a.this.f65082a.mo93592d((float) intValue);
            } else {
                C26377a.this.mo93643d((float) intValue);
            }
            C26377a.this.f65082a.mo93603k().setTranslationY((float) (-intValue));
        }
    };

    /* renamed from: q */
    private DecelerateInterpolator f65098q;

    /* renamed from: r */
    private ValueAnimator.AnimatorUpdateListener f65099r = new ValueAnimator.AnimatorUpdateListener() {
        /* class com.lcodecore.tkrefreshlayout.p1212a.C26377a.C263812 */

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            if (!C26377a.this.f65083b || !C26377a.this.f65082a.mo93591c()) {
                C26377a.this.f65082a.mo93604l().getLayoutParams().height = intValue;
                C26377a.this.f65082a.mo93604l().requestLayout();
                C26377a.this.f65082a.mo93604l().setTranslationY(BitmapDescriptorFactory.HUE_RED);
                C26377a.this.f65082a.mo93589c((float) intValue);
            } else {
                C26377a.this.mo93640c((float) intValue);
            }
            if (!C26377a.this.f65082a.mo93565H()) {
                C26377a.this.f65082a.mo93603k().setTranslationY((float) intValue);
                C26377a.this.mo93641c(intValue);
            }
        }
    };

    /* renamed from: a */
    public void mo93633a(final boolean z) {
        C26396b.m95594a("animHeadBack：finishRefresh?->" + z);
        this.f65086e = true;
        if (z && this.f65083b && this.f65082a.mo93591c()) {
            this.f65082a.mo93595e(true);
        }
        mo93632a(m95546f(), 0, this.f65099r, new AnimatorListenerAdapter() {
            /* class com.lcodecore.tkrefreshlayout.p1212a.C26377a.C263856 */

            public void onAnimationEnd(Animator animator) {
                C26377a.this.f65086e = false;
                C26377a.this.f65082a.mo93584a(false);
                if (z && C26377a.this.f65083b && C26377a.this.f65082a.mo93591c()) {
                    C26377a.this.f65082a.mo93604l().getLayoutParams().height = 0;
                    C26377a.this.f65082a.mo93604l().requestLayout();
                    C26377a.this.f65082a.mo93604l().setTranslationY(BitmapDescriptorFactory.HUE_RED);
                    C26377a.this.f65083b = false;
                    C26377a.this.f65082a.mo93590c(false);
                    C26377a.this.f65082a.mo93607o();
                }
            }
        });
    }

    /* renamed from: d */
    public void mo93642d() {
        C26396b.m95594a("animHeadToRefresh:");
        this.f65085d = true;
        mo93632a(m95546f(), this.f65082a.mo93599g(), this.f65099r, new AnimatorListenerAdapter() {
            /* class com.lcodecore.tkrefreshlayout.p1212a.C26377a.C263781 */

            public void onAnimationEnd(Animator animator) {
                C26377a.this.f65085d = false;
                if (C26377a.this.f65082a.mo93604l().getVisibility() != 0) {
                    C26377a.this.f65082a.mo93604l().setVisibility(0);
                }
                C26377a.this.f65082a.mo93584a(true);
                if (!C26377a.this.f65082a.mo93591c()) {
                    C26377a.this.f65082a.mo93590c(true);
                    C26377a.this.f65082a.mo93570M();
                } else if (!C26377a.this.f65083b) {
                    C26377a.this.f65082a.mo93590c(true);
                    C26377a.this.f65082a.mo93570M();
                    C26377a.this.f65083b = true;
                }
            }
        });
    }

    /* renamed from: e */
    public void mo93644e() {
        C26396b.m95594a("animBottomToLoad");
        this.f65087f = true;
        mo93632a(mo93639c(), this.f65082a.mo93601i(), this.f65095n, new AnimatorListenerAdapter() {
            /* class com.lcodecore.tkrefreshlayout.p1212a.C26377a.C263867 */

            public void onAnimationEnd(Animator animator) {
                C26377a.this.f65087f = false;
                if (C26377a.this.f65082a.mo93605m().getVisibility() != 0) {
                    C26377a.this.f65082a.mo93605m().setVisibility(0);
                }
                C26377a.this.f65082a.mo93588b(true);
                if (!C26377a.this.f65082a.mo93591c()) {
                    C26377a.this.f65082a.mo93593d(true);
                    C26377a.this.f65082a.mo93571N();
                } else if (!C26377a.this.f65084c) {
                    C26377a.this.f65082a.mo93593d(true);
                    C26377a.this.f65082a.mo93571N();
                    C26377a.this.f65084c = true;
                }
            }
        });
    }

    /* renamed from: a */
    public void mo93627a() {
        if (this.f65082a.mo93567J() || !this.f65082a.mo93558A() || m95546f() < this.f65082a.mo93599g() - this.f65082a.mo93606n()) {
            mo93633a(false);
        } else {
            mo93642d();
        }
    }

    /* renamed from: b */
    public void mo93634b() {
        if (this.f65082a.mo93567J() || !this.f65082a.mo93559B() || mo93639c() < this.f65082a.mo93601i() - this.f65082a.mo93606n()) {
            mo93638b(false);
        } else {
            mo93644e();
        }
    }

    /* renamed from: c */
    public int mo93639c() {
        C26396b.m95594a("footer translationY:" + this.f65082a.mo93605m().getTranslationY() + "");
        return (int) (((float) this.f65082a.mo93605m().getLayoutParams().height) - this.f65082a.mo93605m().getTranslationY());
    }

    /* renamed from: f */
    private int m95546f() {
        C26396b.m95594a("header translationY:" + this.f65082a.mo93604l().getTranslationY() + ",Visible head height:" + (((float) this.f65082a.mo93604l().getLayoutParams().height) + this.f65082a.mo93604l().getTranslationY()));
        return (int) (((float) this.f65082a.mo93604l().getLayoutParams().height) + this.f65082a.mo93604l().getTranslationY());
    }

    /* renamed from: c */
    public void mo93640c(float f) {
        this.f65082a.mo93604l().setTranslationY(f - ((float) this.f65082a.mo93604l().getLayoutParams().height));
    }

    public C26377a(TwinklingRefreshLayout.C26373a aVar) {
        this.f65082a = aVar;
        this.f65098q = new DecelerateInterpolator(8.0f);
    }

    /* renamed from: d */
    public void mo93643d(float f) {
        this.f65082a.mo93605m().setTranslationY(((float) this.f65082a.mo93605m().getLayoutParams().height) - f);
    }

    /* renamed from: c */
    public void mo93641c(int i) {
        if (!this.f65082a.mo93610r()) {
            this.f65082a.mo93609q().setTranslationY((float) i);
        }
    }

    /* renamed from: a */
    public void mo93628a(float f) {
        float interpolation = (this.f65098q.getInterpolation((f / this.f65082a.mo93597f()) / 2.0f) * f) / 2.0f;
        if (this.f65082a.mo93567J() || (!this.f65082a.mo93558A() && !this.f65082a.mo93568K())) {
            if (this.f65082a.mo93604l().getVisibility() != 8) {
                this.f65082a.mo93604l().setVisibility(8);
            }
        } else if (this.f65082a.mo93604l().getVisibility() != 0) {
            this.f65082a.mo93604l().setVisibility(0);
        }
        if (!this.f65083b || !this.f65082a.mo93591c()) {
            this.f65082a.mo93604l().setTranslationY(BitmapDescriptorFactory.HUE_RED);
            this.f65082a.mo93604l().getLayoutParams().height = (int) Math.abs(interpolation);
            this.f65082a.mo93604l().requestLayout();
            this.f65082a.mo93583a(interpolation);
        } else {
            this.f65082a.mo93604l().setTranslationY(interpolation - ((float) this.f65082a.mo93604l().getLayoutParams().height));
        }
        if (!this.f65082a.mo93565H()) {
            this.f65082a.mo93603k().setTranslationY(interpolation);
            mo93641c((int) interpolation);
        }
    }

    /* renamed from: b */
    public void mo93635b(float f) {
        float interpolation = (this.f65098q.getInterpolation((f / ((float) this.f65082a.mo93600h())) / 2.0f) * f) / 2.0f;
        if (this.f65082a.mo93567J() || (!this.f65082a.mo93559B() && !this.f65082a.mo93569L())) {
            if (this.f65082a.mo93605m().getVisibility() != 8) {
                this.f65082a.mo93605m().setVisibility(8);
            }
        } else if (this.f65082a.mo93605m().getVisibility() != 0) {
            this.f65082a.mo93605m().setVisibility(0);
        }
        if (!this.f65084c || !this.f65082a.mo93591c()) {
            this.f65082a.mo93605m().setTranslationY(BitmapDescriptorFactory.HUE_RED);
            this.f65082a.mo93605m().getLayoutParams().height = (int) Math.abs(interpolation);
            this.f65082a.mo93605m().requestLayout();
            this.f65082a.mo93587b(-interpolation);
        } else {
            this.f65082a.mo93605m().setTranslationY(((float) this.f65082a.mo93605m().getLayoutParams().height) - interpolation);
        }
        this.f65082a.mo93603k().setTranslationY(-interpolation);
    }

    /* renamed from: a */
    public void mo93630a(int i) {
        if (!this.f65089h) {
            this.f65089h = true;
            C26396b.m95594a("animHeadHideByVy：vy->" + i);
            int abs = Math.abs(i);
            if (abs < 5000) {
                abs = JosStatusCodes.RTN_CODE_COMMON_ERROR;
            }
            mo93631a(m95546f(), 0, (long) (Math.abs((m95546f() * 1000) / abs) * 5), this.f65099r, new AnimatorListenerAdapter() {
                /* class com.lcodecore.tkrefreshlayout.p1212a.C26377a.AnonymousClass10 */

                public void onAnimationEnd(Animator animator) {
                    C26377a.this.f65089h = false;
                    C26377a.this.f65082a.mo93584a(false);
                    if (!C26377a.this.f65082a.mo93591c()) {
                        C26377a.this.f65082a.mo93590c(false);
                        C26377a.this.f65082a.mo93574Q();
                        C26377a.this.f65082a.mo93607o();
                    }
                }
            });
        }
    }

    /* renamed from: b */
    public void mo93637b(int i) {
        C26396b.m95594a("animBottomHideByVy：vy->" + i);
        if (!this.f65090i) {
            this.f65090i = true;
            int abs = Math.abs(i);
            if (abs < 5000) {
                abs = JosStatusCodes.RTN_CODE_COMMON_ERROR;
            }
            mo93631a(mo93639c(), 0, (long) (((mo93639c() * 5) * 1000) / abs), this.f65095n, new AnimatorListenerAdapter() {
                /* class com.lcodecore.tkrefreshlayout.p1212a.C26377a.AnonymousClass11 */

                public void onAnimationEnd(Animator animator) {
                    C26377a.this.f65090i = false;
                    C26377a.this.f65082a.mo93588b(false);
                    if (!C26377a.this.f65082a.mo93591c()) {
                        C26377a.this.f65082a.mo93593d(false);
                        C26377a.this.f65082a.mo93575R();
                        C26377a.this.f65082a.mo93608p();
                    }
                }
            });
        }
    }

    /* renamed from: b */
    public void mo93638b(final boolean z) {
        C26396b.m95594a("animBottomBack：finishLoading?->" + z);
        this.f65088g = true;
        if (z && this.f65084c && this.f65082a.mo93591c()) {
            this.f65082a.mo93598f(true);
        }
        mo93632a(mo93639c(), 0, new ValueAnimator.AnimatorUpdateListener() {
            /* class com.lcodecore.tkrefreshlayout.p1212a.C26377a.C263878 */

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                int c;
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                if (!C26397c.m95601b(C26377a.this.f65082a.mo93603k(), C26377a.this.f65082a.mo93606n()) && (c = C26377a.this.mo93639c() - intValue) > 0) {
                    if (C26377a.this.f65082a.mo93603k() instanceof RecyclerView) {
                        C26397c.m95604c(C26377a.this.f65082a.mo93603k(), c);
                    } else {
                        C26397c.m95604c(C26377a.this.f65082a.mo93603k(), c / 2);
                    }
                }
                C26377a.this.f65095n.onAnimationUpdate(valueAnimator);
            }
        }, new AnimatorListenerAdapter() {
            /* class com.lcodecore.tkrefreshlayout.p1212a.C26377a.C263889 */

            public void onAnimationEnd(Animator animator) {
                C26377a.this.f65088g = false;
                C26377a.this.f65082a.mo93588b(false);
                if (z && C26377a.this.f65084c && C26377a.this.f65082a.mo93591c()) {
                    C26377a.this.f65082a.mo93605m().getLayoutParams().height = 0;
                    C26377a.this.f65082a.mo93605m().requestLayout();
                    C26377a.this.f65082a.mo93605m().setTranslationY(BitmapDescriptorFactory.HUE_RED);
                    C26377a.this.f65084c = false;
                    C26377a.this.f65082a.mo93608p();
                    C26377a.this.f65082a.mo93593d(false);
                }
            }
        });
    }

    /* renamed from: a */
    public void mo93629a(float f, int i) {
        final int i2;
        C26396b.m95594a("animOverScrollTop：vy->" + f + ",computeTimes->" + i);
        if (!this.f65092k) {
            this.f65092k = true;
            this.f65091j = true;
            this.f65082a.mo93576S();
            final int abs = (int) Math.abs((f / ((float) i)) / 2.0f);
            if (abs > this.f65082a.mo93602j()) {
                abs = this.f65082a.mo93602j();
            }
            if (abs <= 50) {
                i2 = 115;
            } else {
                i2 = (int) ((((double) abs) * 0.3d) + 100.0d);
            }
            mo93631a(m95546f(), abs, (long) i2, this.f65096o, new AnimatorListenerAdapter() {
                /* class com.lcodecore.tkrefreshlayout.p1212a.C26377a.AnonymousClass12 */

                public void onAnimationEnd(Animator animator) {
                    if (!C26377a.this.f65083b || !C26377a.this.f65082a.mo93591c() || !C26377a.this.f65082a.mo93594d()) {
                        C26377a aVar = C26377a.this;
                        aVar.mo93631a(abs, 0, (long) (i2 * 2), aVar.f65096o, new AnimatorListenerAdapter() {
                            /* class com.lcodecore.tkrefreshlayout.p1212a.C26377a.AnonymousClass12.C263791 */

                            public void onAnimationEnd(Animator animator) {
                                C26377a.this.f65091j = false;
                                C26377a.this.f65092k = false;
                            }
                        });
                        return;
                    }
                    C26377a.this.mo93642d();
                    C26377a.this.f65091j = false;
                    C26377a.this.f65092k = false;
                }
            });
        }
    }

    /* renamed from: b */
    public void mo93636b(float f, int i) {
        final int i2;
        C26396b.m95594a("animOverScrollBottom：vy->" + f + ",computeTimes->" + i);
        if (!this.f65094m) {
            this.f65082a.mo93577T();
            final int abs = (int) Math.abs((f / ((float) i)) / 2.0f);
            if (abs > this.f65082a.mo93602j()) {
                abs = this.f65082a.mo93602j();
            }
            if (abs <= 50) {
                i2 = 115;
            } else {
                i2 = (int) ((((double) abs) * 0.3d) + 100.0d);
            }
            if (this.f65084c || !this.f65082a.mo93566I()) {
                this.f65094m = true;
                this.f65093l = true;
                mo93631a(0, abs, (long) i2, this.f65097p, new AnimatorListenerAdapter() {
                    /* class com.lcodecore.tkrefreshlayout.p1212a.C26377a.AnonymousClass13 */

                    public void onAnimationEnd(Animator animator) {
                        if (!C26377a.this.f65084c || !C26377a.this.f65082a.mo93591c() || !C26377a.this.f65082a.mo93596e()) {
                            C26377a aVar = C26377a.this;
                            aVar.mo93631a(abs, 0, (long) (i2 * 2), aVar.f65097p, new AnimatorListenerAdapter() {
                                /* class com.lcodecore.tkrefreshlayout.p1212a.C26377a.AnonymousClass13.C263801 */

                                public void onAnimationEnd(Animator animator) {
                                    C26377a.this.f65093l = false;
                                    C26377a.this.f65094m = false;
                                }
                            });
                            return;
                        }
                        C26377a.this.mo93644e();
                        C26377a.this.f65093l = false;
                        C26377a.this.f65094m = false;
                    }
                });
                return;
            }
            this.f65082a.mo93612t();
        }
    }

    /* renamed from: a */
    public void mo93632a(int i, int i2, ValueAnimator.AnimatorUpdateListener animatorUpdateListener, Animator.AnimatorListener animatorListener) {
        ValueAnimator ofInt = ValueAnimator.ofInt(i, i2);
        ofInt.setInterpolator(new DecelerateInterpolator());
        ofInt.addUpdateListener(animatorUpdateListener);
        ofInt.addListener(animatorListener);
        ofInt.setDuration((long) ((int) (((float) Math.abs(i - i2)) * 1.0f)));
        ofInt.start();
    }

    /* renamed from: a */
    public void mo93631a(int i, int i2, long j, ValueAnimator.AnimatorUpdateListener animatorUpdateListener, Animator.AnimatorListener animatorListener) {
        ValueAnimator ofInt = ValueAnimator.ofInt(i, i2);
        ofInt.setInterpolator(new DecelerateInterpolator());
        ofInt.addUpdateListener(animatorUpdateListener);
        ofInt.addListener(animatorListener);
        ofInt.setDuration(j);
        ofInt.start();
    }
}
