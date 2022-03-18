package com.bytedance.ee.bear.wiki.favourite.p581a;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p718t.C13727b;
import com.huawei.hms.location.LocationRequest;

/* renamed from: com.bytedance.ee.bear.wiki.favourite.a.a */
public class C11952a {

    /* renamed from: a */
    public ImageView f32309a;

    /* renamed from: b */
    public ValueAnimator f32310b;

    /* renamed from: c */
    public int f32311c;

    /* renamed from: d */
    public boolean f32312d;

    /* renamed from: e */
    private ValueAnimator f32313e;

    /* renamed from: f */
    private int f32314f;

    /* renamed from: a */
    public void mo45888a() {
        this.f32313e.start();
    }

    /* renamed from: c */
    public void mo45891c() {
        int i = this.f32311c;
        mo45889a(i, i);
    }

    /* renamed from: f */
    private void m49520f() {
        this.f32313e.addListener(new Animator.AnimatorListener() {
            /* class com.bytedance.ee.bear.wiki.favourite.p581a.C11952a.C119531 */

            public void onAnimationCancel(Animator animator) {
            }

            public void onAnimationRepeat(Animator animator) {
            }

            public void onAnimationStart(Animator animator) {
                C13479a.m54764b("WikiStar", "zoom in anim start");
                C11952a.this.f32309a.setClickable(false);
            }

            public void onAnimationEnd(Animator animator) {
                C13479a.m54764b("WikiStar", "zoom in anim end");
                if (!C11952a.this.f32312d) {
                    C13479a.m54764b("WikiStar", "start zoom out anim");
                    C11952a.this.f32310b.start();
                    return;
                }
                C11952a.this.f32309a.setClickable(true);
            }
        });
    }

    /* renamed from: g */
    private void m49521g() {
        this.f32310b.addListener(new Animator.AnimatorListener() {
            /* class com.bytedance.ee.bear.wiki.favourite.p581a.C11952a.C119542 */

            public void onAnimationCancel(Animator animator) {
            }

            public void onAnimationRepeat(Animator animator) {
            }

            public void onAnimationStart(Animator animator) {
            }

            public void onAnimationEnd(Animator animator) {
                C13479a.m54764b("WikiStar", "zoom out anim end");
                if (!C11952a.this.f32312d) {
                    C13479a.m54764b("WikiStar", "auto set origin image size");
                    C11952a aVar = C11952a.this;
                    aVar.mo45889a(aVar.f32311c, C11952a.this.f32311c);
                }
                C11952a.this.f32309a.setClickable(true);
            }
        });
    }

    /* renamed from: d */
    private int m49518d() {
        ViewGroup.LayoutParams layoutParams = this.f32309a.getLayoutParams();
        C13479a.m54764b("WikiStar", "image view origin size = " + layoutParams.height);
        return layoutParams.height;
    }

    /* renamed from: e */
    private void m49519e() {
        this.f32313e = C13727b.m55683b((View) this.f32309a, this.f32311c, this.f32314f, (int) LocationRequest.PRIORITY_INDOOR);
        this.f32310b = C13727b.m55683b((View) this.f32309a, this.f32314f, this.f32311c, 150);
        this.f32313e.setInterpolator(new DecelerateInterpolator());
        this.f32310b.setInterpolator(new AccelerateInterpolator());
        m49520f();
        m49521g();
    }

    /* renamed from: b */
    public void mo45890b() {
        this.f32312d = true;
        if (this.f32313e.isRunning()) {
            C13479a.m54764b("WikiStar", "shut down zoom in anim");
            this.f32313e.cancel();
        }
        if (this.f32310b.isRunning()) {
            C13479a.m54764b("WikiStar", "shut down zoom out anim");
            this.f32310b.cancel();
        }
    }

    public C11952a(ImageView imageView) {
        this.f32309a = imageView;
        int d = m49518d();
        this.f32311c = d;
        this.f32314f = (int) (((float) d) * 1.4f);
        m49519e();
    }

    /* renamed from: a */
    public void mo45889a(int i, int i2) {
        ViewGroup.LayoutParams layoutParams = this.f32309a.getLayoutParams();
        layoutParams.height = i;
        layoutParams.width = i2;
        this.f32309a.setLayoutParams(layoutParams);
    }
}
