package com.bytedance.ee.bear.search.p536a;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.EditText;
import android.widget.TextView;
import com.bytedance.ee.bear.search.p536a.C10792b;
import com.larksuite.framework.utils.DeviceUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.ui.p2892a.C57582a;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;

/* renamed from: com.bytedance.ee.bear.search.a.a */
public class C10788a {

    /* renamed from: a */
    private Context f28929a;

    /* renamed from: b */
    private boolean f28930b;

    /* renamed from: c */
    private EditText f28931c;

    /* renamed from: d */
    private ViewGroup f28932d;

    /* renamed from: e */
    private TextView f28933e;

    /* renamed from: f */
    private View f28934f;

    /* renamed from: g */
    private C10792b f28935g;

    /* renamed from: h */
    private C10792b.AbstractC10797a f28936h;

    /* renamed from: b */
    public void mo40862b() {
        C10792b bVar = this.f28935g;
        if (bVar != null) {
            bVar.mo40866a();
        }
    }

    /* renamed from: c */
    public void mo40863c() {
        C10792b bVar = this.f28935g;
        if (bVar != null) {
            bVar.mo40870b();
        }
    }

    /* renamed from: d */
    private void m44783d() {
        C10792b bVar = new C10792b(this.f28936h);
        this.f28935g = bVar;
        bVar.mo40868a(new AnimatorListenerAdapter() {
            /* class com.bytedance.ee.bear.search.p536a.C10788a.C107891 */
        }, this.f28930b);
    }

    /* renamed from: e */
    private void m44784e() {
        this.f28931c.setWidth((DeviceUtils.getScreenWidth(this.f28929a) - C57582a.m223600a((int) SmEvents.EVENT_RS)) - UIUtils.getWidth(this.f28933e));
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f28934f.getLayoutParams();
        marginLayoutParams.rightMargin = 0;
        this.f28934f.setLayoutParams(marginLayoutParams);
        this.f28932d.startAnimation(AnimationUtils.loadAnimation(this.f28929a, R.anim.search_slide_right_in));
    }

    /* renamed from: a */
    public void mo40860a() {
        if (this.f28930b) {
            m44783d();
        } else {
            m44784e();
        }
    }

    /* renamed from: a */
    public C10788a mo40853a(Context context) {
        this.f28929a = context;
        return this;
    }

    /* renamed from: a */
    public C10788a mo40854a(View view) {
        this.f28934f = view;
        return this;
    }

    /* renamed from: b */
    private void m44781b(final Animator.AnimatorListener animatorListener) {
        this.f28935g.mo40867a(new AnimatorListenerAdapter() {
            /* class com.bytedance.ee.bear.search.p536a.C10788a.C107902 */

            public void onAnimationEnd(Animator animator) {
                Animator.AnimatorListener animatorListener = animatorListener;
                if (animatorListener != null) {
                    animatorListener.onAnimationEnd(animator);
                }
            }
        });
    }

    /* renamed from: a */
    public C10788a mo40855a(ViewGroup viewGroup) {
        this.f28932d = viewGroup;
        return this;
    }

    /* renamed from: c */
    private void m44782c(final Animator.AnimatorListener animatorListener) {
        Animation loadAnimation = AnimationUtils.loadAnimation(this.f28929a, R.anim.search_slide_left_out);
        loadAnimation.setAnimationListener(new AbstractanimationAnimation$AnimationListenerC10798c() {
            /* class com.bytedance.ee.bear.search.p536a.C10788a.C107913 */

            @Override // com.bytedance.ee.bear.search.p536a.AbstractanimationAnimation$AnimationListenerC10798c
            public void onAnimationEnd(Animation animation) {
                Animator.AnimatorListener animatorListener = animatorListener;
                if (animatorListener != null) {
                    animatorListener.onAnimationEnd(null);
                }
            }
        });
        this.f28932d.startAnimation(loadAnimation);
    }

    /* renamed from: a */
    public C10788a mo40856a(EditText editText) {
        this.f28931c = editText;
        return this;
    }

    /* renamed from: a */
    public C10788a mo40857a(TextView textView) {
        this.f28933e = textView;
        return this;
    }

    /* renamed from: a */
    public C10788a mo40858a(C10792b.AbstractC10797a aVar) {
        this.f28936h = aVar;
        return this;
    }

    /* renamed from: a */
    public C10788a mo40859a(boolean z) {
        this.f28930b = z;
        return this;
    }

    /* renamed from: a */
    public void mo40861a(Animator.AnimatorListener animatorListener) {
        if (this.f28930b) {
            m44781b(animatorListener);
        } else {
            m44782c(animatorListener);
        }
    }
}
