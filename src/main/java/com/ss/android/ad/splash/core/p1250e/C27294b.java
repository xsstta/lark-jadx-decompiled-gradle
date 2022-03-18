package com.ss.android.ad.splash.core.p1250e;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import com.ss.android.ad.splash.core.model.C27331b;
import com.ss.android.ad.splash.core.p1248c.C27278b;
import com.ss.android.ad.splash.utils.C27475e;
import com.ss.android.ad.splash.utils.C27484l;
import java.util.HashMap;

/* renamed from: com.ss.android.ad.splash.core.e.b */
public class C27294b {

    /* renamed from: a */
    public final Context f68059a;

    /* renamed from: b */
    public final C27331b f68060b;

    /* renamed from: c */
    public final RelativeLayout f68061c;

    /* renamed from: d */
    public LinearLayout f68062d;

    /* renamed from: e */
    private final AbstractC27300a f68063e;

    /* renamed from: f */
    private final PointF f68064f = new PointF();

    /* renamed from: g */
    private final int f68065g;

    /* renamed from: com.ss.android.ad.splash.core.e.b$a */
    public interface AbstractC27300a {
        /* renamed from: a */
        void mo97209a();
    }

    /* renamed from: a */
    public View mo97324a() {
        return this.f68062d;
    }

    /* renamed from: c */
    private boolean m99291c() {
        if (this.f68060b.mo97492g() == 6) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    private boolean m99292d() {
        if (this.f68060b.mo97492g() == 7) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private boolean m99289b() {
        if (m99292d() || m99291c()) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    private void m99293e() {
        final Animator animator;
        if (m99289b()) {
            LinearLayout linearLayout = new LinearLayout(this.f68059a);
            this.f68062d = linearLayout;
            linearLayout.setOrientation(1);
            this.f68062d.setBackgroundResource(R.drawable.splash_ad_bg_swipe_up_bottom_shadow);
            this.f68062d.setGravity(81);
            if (m99291c()) {
                final ImageView imageView = new ImageView(this.f68059a);
                imageView.setImageResource(R.drawable.splash_ad_ic_slide_skip_arrow);
                imageView.setClickable(true);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                layoutParams.bottomMargin = (int) C27484l.m100391a(this.f68059a, 4.0f);
                this.f68062d.addView(imageView, layoutParams);
                imageView.post(new Runnable() {
                    /* class com.ss.android.ad.splash.core.p1250e.C27294b.RunnableC272951 */

                    public void run() {
                        int a = (int) C27484l.m100391a(C27294b.this.f68059a, 8.0f);
                        C27294b.this.f68062d.setTouchDelegate(new C27475e(new Rect(imageView.getLeft() - a, imageView.getTop() - a, imageView.getRight() + a, imageView.getBottom() + a), imageView));
                    }
                });
            }
            TextView textView = new TextView(this.f68059a);
            textView.setText(this.f68060b.mo97493h());
            textView.setTextColor(ColorStateList.valueOf(-1));
            textView.setTextSize(1, 15.0f);
            float a = (float) ((int) C27484l.m100391a(this.f68059a, 1.0f));
            textView.setShadowLayer(a, BitmapDescriptorFactory.HUE_RED, a, Color.argb(31, 0, 0, 0));
            textView.setClickable(true);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams2.bottomMargin = (int) C27484l.m100391a(this.f68059a, 54.0f);
            this.f68062d.addView(textView, layoutParams2);
            if (this.f68060b.mo97495i() > 0) {
                this.f68062d.setVisibility(8);
                this.f68061c.postDelayed(new Runnable() {
                    /* class com.ss.android.ad.splash.core.p1250e.C27294b.RunnableC272962 */

                    public void run() {
                        C27294b.this.f68062d.setAlpha(BitmapDescriptorFactory.HUE_RED);
                        C27294b.this.f68062d.setVisibility(0);
                        ObjectAnimator.ofFloat(C27294b.this.f68062d, "alpha", BitmapDescriptorFactory.HUE_RED, 1.0f).setDuration(300L).start();
                    }
                }, this.f68060b.mo97495i());
            }
            if (m99292d()) {
                animator = m99288a(textView);
            } else {
                animator = null;
            }
            this.f68062d.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() {
                /* class com.ss.android.ad.splash.core.p1250e.C27294b.View$OnAttachStateChangeListenerC272973 */

                public void onViewDetachedFromWindow(View view) {
                    Animator animator = animator;
                    if (animator != null) {
                        animator.removeAllListeners();
                        animator.cancel();
                    }
                }

                public void onViewAttachedToWindow(View view) {
                    HashMap<String, Object> hashMap = new HashMap<>(1);
                    hashMap.put("refer", "tips");
                    C27278b.m99171a().mo97296a(C27294b.this.f68060b, 0, "othershow", hashMap, null);
                    if (animator != null) {
                        C27294b.this.f68061c.postDelayed(new Runnable() {
                            /* class com.ss.android.ad.splash.core.p1250e.C27294b.View$OnAttachStateChangeListenerC272973.RunnableC272981 */

                            public void run() {
                                animator.start();
                            }
                        }, C27294b.this.f68060b.mo97495i());
                    }
                }
            });
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, (int) C27484l.m100391a(this.f68059a, 114.0f));
            layoutParams3.addRule(12);
            this.f68061c.addView(this.f68062d, layoutParams3);
        }
    }

    /* renamed from: a */
    private Animator m99288a(View view) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "translationY", 0.0f, -C27484l.m100391a(this.f68059a, 8.0f), 0.0f);
        ofFloat.setDuration(2000L);
        ofFloat.addListener(new AnimatorListenerAdapter() {
            /* class com.ss.android.ad.splash.core.p1250e.C27294b.C272994 */

            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                animator.setStartDelay(1000);
                animator.start();
            }
        });
        return ofFloat;
    }

    /* renamed from: b */
    private boolean m99290b(MotionEvent motionEvent) {
        float x = motionEvent.getX() - this.f68064f.x;
        float y = motionEvent.getY() - this.f68064f.y;
        if (Math.abs(x) > Math.abs(y) || y >= BitmapDescriptorFactory.HUE_RED || Math.abs(y) < ((float) this.f68065g)) {
            return false;
        }
        this.f68063e.mo97209a();
        return true;
    }

    /* renamed from: a */
    public boolean mo97325a(MotionEvent motionEvent) {
        if (!m99289b()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f68064f.set(motionEvent.getX(), motionEvent.getY());
        } else if (action == 1 || action == 3) {
            return m99290b(motionEvent);
        }
        return false;
    }

    public C27294b(Context context, C27331b bVar, RelativeLayout relativeLayout, AbstractC27300a aVar) {
        this.f68059a = context;
        this.f68060b = bVar;
        this.f68061c = relativeLayout;
        this.f68063e = aVar;
        this.f68065g = ViewConfiguration.get(context).getScaledTouchSlop();
        m99293e();
    }
}
