package com.ss.android.lark.mail.impl.message;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.MotionEvent;
import android.view.View;
import com.huawei.hms.location.LocationRequest;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.utils.C43849u;
import com.ss.android.lark.utils.UIHelper;

/* renamed from: com.ss.android.lark.mail.impl.message.c */
public class C42839c {

    /* renamed from: a */
    public Animator f109056a;

    /* renamed from: b */
    public Animator f109057b;

    /* renamed from: c */
    final int f109058c = LocationRequest.PRIORITY_HD_ACCURACY;

    /* renamed from: d */
    private final String f109059d = "TitleScrollHelper";

    /* renamed from: e */
    private final int f109060e = 5;

    /* renamed from: f */
    private int f109061f;

    /* renamed from: g */
    private float f109062g;

    /* renamed from: h */
    private float f109063h;

    /* renamed from: i */
    private float f109064i;

    /* renamed from: j */
    private float f109065j;

    /* renamed from: a */
    public void mo153766a() {
        this.f109061f = 0;
        this.f109062g = BitmapDescriptorFactory.HUE_RED;
        this.f109063h = BitmapDescriptorFactory.HUE_RED;
        this.f109064i = BitmapDescriptorFactory.HUE_RED;
        this.f109065j = BitmapDescriptorFactory.HUE_RED;
    }

    /* renamed from: b */
    private void m170687b(final View view) {
        if (this.f109056a != null) {
            Log.m165389i("TitleScrollHelper", "hideTitleBar mPreAnimatorIn.cancel():");
            this.f109056a.cancel();
            view.setVisibility(0);
        }
        if (view.getVisibility() == 0 && this.f109057b == null) {
            ObjectAnimator duration = ObjectAnimator.ofFloat(view, "alpha", 1.0f, BitmapDescriptorFactory.HUE_RED).setDuration(200L);
            this.f109057b = duration;
            duration.addListener(new Animator.AnimatorListener() {
                /* class com.ss.android.lark.mail.impl.message.C42839c.C428422 */

                public void onAnimationRepeat(Animator animator) {
                }

                public void onAnimationStart(Animator animator) {
                }

                public void onAnimationCancel(Animator animator) {
                    C42839c.this.f109057b = null;
                }

                public void onAnimationEnd(Animator animator) {
                    Log.m165389i("TitleScrollHelper", "hideTitleBar titleView INVISIBLE ");
                    if (!C43849u.m173830c()) {
                        C43849u.m173826a(new Runnable() {
                            /* class com.ss.android.lark.mail.impl.message.C42839c.C428422.RunnableC428431 */

                            public void run() {
                                view.setVisibility(4);
                            }
                        });
                    } else {
                        view.setVisibility(4);
                    }
                    C42839c.this.f109057b = null;
                }
            });
            Animator animator = this.f109057b;
            if (animator != null) {
                animator.start();
                Log.m165389i("TitleScrollHelper", "hideTitleBar mPreAnimatorOut.start():");
            }
        }
    }

    /* renamed from: a */
    private void m170686a(final View view) {
        if (this.f109057b != null) {
            Log.m165389i("TitleScrollHelper", "showTitleBar mPreAnimatorOut.cancel():");
            this.f109057b.cancel();
            view.setVisibility(4);
        }
        if (view.getVisibility() != 0 && this.f109056a == null) {
            ObjectAnimator duration = ObjectAnimator.ofFloat(view, "alpha", BitmapDescriptorFactory.HUE_RED, 1.0f).setDuration(200L);
            this.f109056a = duration;
            duration.addListener(new Animator.AnimatorListener() {
                /* class com.ss.android.lark.mail.impl.message.C42839c.C428401 */

                public void onAnimationRepeat(Animator animator) {
                }

                public void onAnimationCancel(Animator animator) {
                    C42839c.this.f109056a = null;
                }

                public void onAnimationEnd(Animator animator) {
                    C42839c.this.f109056a = null;
                }

                public void onAnimationStart(Animator animator) {
                    Log.m165389i("TitleScrollHelper", "showTitleBar titleView VISIBLE ");
                    if (!C43849u.m173830c()) {
                        C43849u.m173826a(new Runnable() {
                            /* class com.ss.android.lark.mail.impl.message.C42839c.C428401.RunnableC428411 */

                            public void run() {
                                view.setVisibility(0);
                            }
                        });
                    } else {
                        view.setVisibility(0);
                    }
                }
            });
            Animator animator = this.f109056a;
            if (animator != null) {
                animator.start();
                Log.m165389i("TitleScrollHelper", "showTitleBar mPreAnimatorIn.start():");
            }
        }
    }

    /* renamed from: a */
    public void mo153768a(MotionEvent motionEvent, View view) {
        float f = this.f109065j;
        int i = this.f109061f;
        if (f != ((float) i)) {
            this.f109065j = (float) i;
            if (motionEvent.getActionMasked() == 0) {
                this.f109062g = motionEvent.getY();
            } else if (motionEvent.getActionMasked() == 2) {
                m170685a(motionEvent.getY() - this.f109062g, this.f109061f, view);
                this.f109062g = motionEvent.getY();
            }
        }
    }

    /* renamed from: a */
    private void m170685a(float f, int i, View view) {
        if (view != null) {
            if (f > BitmapDescriptorFactory.HUE_RED) {
                this.f109063h = BitmapDescriptorFactory.HUE_RED;
                if (f > 5.0f) {
                    this.f109064i = BitmapDescriptorFactory.HUE_RED;
                    m170686a(view);
                } else {
                    float f2 = this.f109064i + f;
                    this.f109064i = f2;
                    if (f2 > 10.0f) {
                        this.f109064i = BitmapDescriptorFactory.HUE_RED;
                        m170686a(view);
                    }
                }
            }
            if (i > UIHelper.getDimens(R.dimen.mail_operation_title_bar_height) && f < BitmapDescriptorFactory.HUE_RED) {
                this.f109064i = BitmapDescriptorFactory.HUE_RED;
                if (f < -5.0f) {
                    this.f109063h = BitmapDescriptorFactory.HUE_RED;
                    m170687b(view);
                    return;
                }
                float f3 = this.f109063h + f;
                this.f109063h = f3;
                if (f3 < -10.0f) {
                    this.f109063h = BitmapDescriptorFactory.HUE_RED;
                    m170687b(view);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo153767a(int i, int i2, int i3, int i4, View view) {
        if (view != null) {
            int i5 = this.f109061f + (i2 - i4);
            this.f109061f = i5;
            if (i5 < 0) {
                this.f109061f = 0;
            }
            if (this.f109061f <= UIHelper.getDimens(R.dimen.mail_operation_title_bar_height)) {
                m170686a(view);
            }
        }
    }
}
