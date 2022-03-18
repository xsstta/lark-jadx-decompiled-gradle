package com.ss.android.lark.chatwindow.view.tip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.core.view.animation.PathInterpolatorCompat;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.ui.display.manager.C25649b;
import com.larksuite.component.ui.display.manager.LarkFont;
import com.larksuite.component.universe_design.color.UDColorUtils;
import com.larksuite.component.universe_design.icon.UDIconUtils;
import com.larksuite.component.universe_design.shadow.UDShadowLayout;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.utils.C34336c;
import com.ss.android.lark.chatwindow.view.tip.AbstractC35310a;
import com.ss.android.lark.utils.UIHelper;

public class NewMessageTip extends FrameLayout {

    /* renamed from: n */
    private static final int f91238n;

    /* renamed from: o */
    private static final int f91239o;

    /* renamed from: p */
    private static final int f91240p;

    /* renamed from: a */
    public TextView f91241a;

    /* renamed from: b */
    public ImageView f91242b;

    /* renamed from: c */
    public ProgressBar f91243c;

    /* renamed from: d */
    public ImageView f91244d;

    /* renamed from: e */
    public UDShadowLayout f91245e;

    /* renamed from: f */
    public View f91246f;

    /* renamed from: g */
    public ViewGroup f91247g;

    /* renamed from: h */
    public FrameLayout f91248h;

    /* renamed from: i */
    public View f91249i;

    /* renamed from: j */
    public ImageView f91250j;

    /* renamed from: k */
    public boolean f91251k;

    /* renamed from: l */
    public boolean f91252l;

    /* renamed from: m */
    private boolean f91253m;

    /* renamed from: q */
    private final Interpolator f91254q;

    /* access modifiers changed from: private */
    /* renamed from: i */
    public /* synthetic */ void m137887i() {
        m137885g();
        m137886h();
    }

    public ViewGroup.LayoutParams getLayoutParams() {
        ViewGroup.LayoutParams layoutParams = super.getLayoutParams();
        if (layoutParams == null) {
            return new ViewGroup.MarginLayoutParams(-2, -2);
        }
        return layoutParams;
    }

    static {
        int dp2px = UIHelper.dp2px(268.0f);
        f91238n = dp2px;
        int dp2px2 = UIHelper.dp2px(92.0f);
        f91239o = dp2px2;
        f91240p = dp2px - dp2px2;
    }

    /* renamed from: d */
    private void m137880d() {
        C25649b.m91853a(this.f91244d, 20);
        C25649b.m91857a(this.f91241a, LarkFont.HEADLINE);
        C25649b.m91853a(this.f91242b, 12);
        C25649b.m91853a(this.f91243c, 12);
    }

    /* renamed from: e */
    private void m137882e() {
        setVisibility(0);
        this.f91249i.setVisibility(8);
        this.f91245e.setVisibility(0);
        this.f91247g.setVisibility(0);
        this.f91244d.setVisibility(8);
        this.f91251k = false;
    }

    /* renamed from: a */
    public void mo129913a() {
        setVisibility(8);
        this.f91251k = false;
    }

    /* renamed from: b */
    public void mo129917b() {
        setVisibility(0);
        this.f91249i.setVisibility(0);
        this.f91245e.setVisibility(8);
        this.f91247g.setVisibility(8);
        this.f91244d.setVisibility(8);
        this.f91251k = true;
    }

    /* renamed from: f */
    private void m137884f() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, BitmapDescriptorFactory.HUE_RED);
        ofFloat.setDuration(150L);
        ofFloat.setInterpolator(this.f91254q);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.ss.android.lark.chatwindow.view.tip.$$Lambda$NewMessageTip$5v940EcnZhW8Rg1ibZurx62KgFY */

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                NewMessageTip.this.m137878c(valueAnimator);
            }
        });
        ofFloat.addListener(new AnimatorListenerAdapter() {
            /* class com.ss.android.lark.chatwindow.view.tip.NewMessageTip.C353084 */

            public void onAnimationEnd(Animator animator) {
                NewMessageTip.this.f91249i.setVisibility(8);
                NewMessageTip.this.f91249i.setAlpha(1.0f);
            }
        });
        ofFloat.start();
    }

    /* renamed from: g */
    private void m137885g() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.ss.android.lark.chatwindow.view.tip.$$Lambda$NewMessageTip$3f70_N9zU3gRt1bLBn3Wxdo5sGI */

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                NewMessageTip.this.m137876b(valueAnimator);
            }
        });
        ofFloat.setInterpolator(this.f91254q);
        ofFloat.setDuration(150L);
        ofFloat.start();
    }

    /* renamed from: h */
    private void m137886h() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.ss.android.lark.chatwindow.view.tip.$$Lambda$NewMessageTip$p9_QiEf1eitwJ9NQrQ77_nm1mVw */

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                NewMessageTip.this.m137875a((NewMessageTip) valueAnimator);
            }
        });
        ofFloat.addListener(new AnimatorListenerAdapter() {
            /* class com.ss.android.lark.chatwindow.view.tip.NewMessageTip.C353095 */

            public void onAnimationEnd(Animator animator) {
                NewMessageTip.this.f91251k = false;
                NewMessageTip.this.f91252l = false;
            }
        });
        ofFloat.setInterpolator(this.f91254q);
        ofFloat.setDuration(150L);
        ofFloat.start();
    }

    /* renamed from: c */
    private void m137877c() {
        Drawable findDrawableByLayerId;
        LayoutInflater.from(getContext()).inflate(R.layout.layout_new_message_tip, (ViewGroup) this, true);
        this.f91245e = (UDShadowLayout) findViewById(R.id.new_messages_root);
        this.f91246f = findViewById(R.id.new_messages_bg);
        TextView textView = (TextView) findViewById(R.id.text);
        this.f91241a = textView;
        textView.setMaxWidth(f91240p);
        this.f91242b = (ImageView) findViewById(R.id.state);
        this.f91243c = (ProgressBar) findViewById(R.id.loading);
        this.f91244d = (ImageView) findViewById(R.id.image);
        this.f91247g = (ViewGroup) findViewById(R.id.new_messages_content);
        this.f91248h = (FrameLayout) findViewById(R.id.state_container);
        this.f91249i = findViewById(R.id.back_to_bottom_root);
        ImageView imageView = (ImageView) findViewById(R.id.back_to_bottom_drawable);
        this.f91250j = imageView;
        if ((imageView.getDrawable() instanceof LayerDrawable) && (findDrawableByLayerId = ((LayerDrawable) this.f91250j.getDrawable()).findDrawableByLayerId(R.id.double_angle)) != null) {
            findDrawableByLayerId.setTint(UDColorUtils.getColor(getContext(), R.color.icon_n1));
        }
        m137880d();
    }

    /* renamed from: a */
    public void mo129914a(ViewGroup.LayoutParams layoutParams) {
        setLayoutParams(layoutParams);
    }

    public NewMessageTip(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m137875a(ValueAnimator valueAnimator) {
        this.f91247g.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m137876b(ValueAnimator valueAnimator) {
        this.f91245e.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m137878c(ValueAnimator valueAnimator) {
        this.f91249i.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public void setLoadingState(boolean z) {
        if (z) {
            this.f91242b.setVisibility(8);
            this.f91243c.setVisibility(0);
            return;
        }
        this.f91242b.setVisibility(0);
        this.f91243c.setVisibility(8);
    }

    private void setNormalTip(final String str) {
        if (this.f91244d.getVisibility() == 8) {
            setNormalTipStyle(str);
            return;
        }
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, (float) BitmapDescriptorFactory.HUE_RED);
        alphaAnimation.setInterpolator(new AccelerateInterpolator());
        alphaAnimation.setDuration(150);
        alphaAnimation.setAnimationListener(new Animation.AnimationListener() {
            /* class com.ss.android.lark.chatwindow.view.tip.NewMessageTip.animationAnimation$AnimationListenerC353041 */

            public void onAnimationRepeat(Animation animation) {
            }

            public void onAnimationStart(Animation animation) {
            }

            public void onAnimationEnd(Animation animation) {
                AlphaAnimation alphaAnimation = new AlphaAnimation((float) BitmapDescriptorFactory.HUE_RED, 1.0f);
                alphaAnimation.setInterpolator(new DecelerateInterpolator());
                alphaAnimation.setDuration(150);
                alphaAnimation.setAnimationListener(new Animation.AnimationListener() {
                    /* class com.ss.android.lark.chatwindow.view.tip.NewMessageTip.animationAnimation$AnimationListenerC353041.animationAnimation$AnimationListenerC353051 */

                    public void onAnimationEnd(Animation animation) {
                    }

                    public void onAnimationRepeat(Animation animation) {
                    }

                    public void onAnimationStart(Animation animation) {
                        NewMessageTip.this.setNormalTipStyle(str);
                    }
                });
                NewMessageTip.this.f91245e.startAnimation(alphaAnimation);
                NewMessageTip.this.f91247g.startAnimation(alphaAnimation);
            }
        });
        this.f91245e.startAnimation(alphaAnimation);
        this.f91247g.startAnimation(alphaAnimation);
    }

    public void setArrowDirection(boolean z) {
        int i;
        this.f91253m = z;
        ImageView imageView = this.f91242b;
        Context context = getContext();
        if (this.f91253m) {
            i = R.drawable.ud_icon_up_top_outlined;
        } else {
            i = R.drawable.ud_icon_down_bottom_outlined;
        }
        imageView.setImageDrawable(UDIconUtils.getIconDrawable(context, i, UDColorUtils.getColor(getContext(), R.color.primary_pri_500)));
    }

    /* renamed from: a */
    public void mo129916a(String str) {
        if (this.f91251k) {
            m137883e(null, str);
            setNormalTipStyle(str);
            return;
        }
        m137882e();
        setNormalTip(str);
    }

    public void setNormalTipStyle(String str) {
        int i;
        this.f91245e.setShadowColor(UDColorUtils.getColor(getContext(), R.color.ud_N900_08));
        this.f91246f.setBackground(UIHelper.getDrawable(R.drawable.new_messages_tip_white_bg));
        ImageView imageView = this.f91242b;
        Context context = getContext();
        if (this.f91253m) {
            i = R.drawable.ud_icon_up_top_outlined;
        } else {
            i = R.drawable.ud_icon_down_bottom_outlined;
        }
        imageView.setImageDrawable(UDIconUtils.getIconDrawable(context, i, UDColorUtils.getColor(getContext(), R.color.primary_pri_500)));
        this.f91244d.setVisibility(8);
        this.f91241a.setTextColor(UIUtils.getColor(getContext(), R.color.primary_pri_500));
        this.f91241a.setText(str);
    }

    public NewMessageTip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: e */
    private void m137883e(AbstractC35310a.C35311a aVar, String str) {
        if (!this.f91252l) {
            this.f91252l = true;
            m137884f();
            m137879c(aVar, str);
            postDelayed(new Runnable() {
                /* class com.ss.android.lark.chatwindow.view.tip.$$Lambda$NewMessageTip$3EFp9eyi0ni9v5OmgDRo0KeeAY */

                public final void run() {
                    NewMessageTip.this.m137887i();
                }
            }, 150);
        }
    }

    /* renamed from: a */
    public void mo129915a(AbstractC35310a.C35311a aVar, String str) {
        if (this.f91251k) {
            m137883e(aVar, str);
        } else {
            m137881d(aVar, str);
        }
    }

    /* renamed from: c */
    private void m137879c(AbstractC35310a.C35311a aVar, String str) {
        this.f91249i.setVisibility(8);
        if (aVar != null) {
            this.f91244d.setVisibility(0);
            C34336c.m133129a(getContext(), this.f91244d, aVar.f91273d, aVar.f91274e, UIHelper.dp2px((float) aVar.f91275f), UIHelper.dp2px((float) aVar.f91276g));
        } else {
            this.f91244d.setVisibility(8);
        }
        mo129918b(aVar, str);
        this.f91247g.setAlpha(BitmapDescriptorFactory.HUE_RED);
        this.f91245e.setAlpha(BitmapDescriptorFactory.HUE_RED);
        this.f91247g.setVisibility(0);
        this.f91245e.setVisibility(0);
    }

    /* renamed from: d */
    private void m137881d(final AbstractC35310a.C35311a aVar, final String str) {
        if (getVisibility() == 0 && this.f91245e.getVisibility() == 0 && this.f91244d.getVisibility() == 0) {
            mo129918b(aVar, str);
            return;
        }
        setVisibility(0);
        this.f91245e.setVisibility(0);
        final AlphaAnimation alphaAnimation = new AlphaAnimation((float) BitmapDescriptorFactory.HUE_RED, 1.0f);
        alphaAnimation.setInterpolator(new DecelerateInterpolator());
        alphaAnimation.setDuration(150);
        alphaAnimation.setAnimationListener(new Animation.AnimationListener() {
            /* class com.ss.android.lark.chatwindow.view.tip.NewMessageTip.animationAnimation$AnimationListenerC353062 */

            public void onAnimationEnd(Animation animation) {
            }

            public void onAnimationRepeat(Animation animation) {
            }

            public void onAnimationStart(Animation animation) {
                NewMessageTip.this.mo129918b(aVar, str);
            }
        });
        AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, (float) BitmapDescriptorFactory.HUE_RED);
        alphaAnimation2.setInterpolator(new AccelerateInterpolator());
        alphaAnimation2.setDuration(0);
        alphaAnimation2.setAnimationListener(new Animation.AnimationListener() {
            /* class com.ss.android.lark.chatwindow.view.tip.NewMessageTip.animationAnimation$AnimationListenerC353073 */

            public void onAnimationRepeat(Animation animation) {
            }

            public void onAnimationStart(Animation animation) {
            }

            public void onAnimationEnd(Animation animation) {
                NewMessageTip.this.f91245e.startAnimation(alphaAnimation);
                NewMessageTip.this.f91247g.startAnimation(alphaAnimation);
            }
        });
        if (this.f91247g.getVisibility() == 0) {
            this.f91247g.startAnimation(alphaAnimation2);
        }
        if (this.f91245e.getVisibility() == 0) {
            this.f91245e.startAnimation(alphaAnimation2);
            return;
        }
        mo129918b(aVar, str);
        this.f91245e.startAnimation(alphaAnimation);
        this.f91247g.startAnimation(alphaAnimation);
    }

    /* renamed from: b */
    public void mo129918b(AbstractC35310a.C35311a aVar, String str) {
        int i;
        if (aVar != null && !TextUtils.isEmpty(aVar.f91272c) && !TextUtils.isEmpty(str)) {
            float measureText = this.f91241a.getPaint().measureText(str);
            int i2 = f91240p;
            if (measureText >= ((float) i2)) {
                float measureText2 = (((float) i2) - this.f91241a.getPaint().measureText(aVar.f91272c)) - 1.0f;
                if (measureText2 > BitmapDescriptorFactory.HUE_RED) {
                    CharSequence ellipsize = TextUtils.ellipsize(str, this.f91241a.getPaint(), measureText2, TextUtils.TruncateAt.END);
                    str = ((Object) ellipsize) + aVar.f91272c;
                }
            }
            this.f91244d.setVisibility(0);
            C34336c.m133129a(getContext(), this.f91244d, aVar.f91273d, aVar.f91274e, UIHelper.dp2px((float) aVar.f91275f), UIHelper.dp2px((float) aVar.f91276g));
        }
        this.f91245e.setShadowColor(UDColorUtils.getColor(getContext(), R.color.ud_B500_12));
        this.f91246f.setBackground(UIUtils.getDrawable(getContext(), R.drawable.bg_new_messages_tip_blue));
        ImageView imageView = this.f91242b;
        Context context = getContext();
        if (this.f91253m) {
            i = R.drawable.ud_icon_up_top_outlined;
        } else {
            i = R.drawable.ud_icon_down_bottom_outlined;
        }
        imageView.setImageDrawable(UDIconUtils.getIconDrawable(context, i, UDColorUtils.getColor(getContext(), R.color.static_white)));
        this.f91241a.setTextColor(UIUtils.getColor(getContext(), R.color.static_white));
        this.f91241a.setText(str);
    }

    public NewMessageTip(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f91254q = PathInterpolatorCompat.create(0.32f, 0.94f, 0.6f, 1.0f);
        m137877c();
    }
}
