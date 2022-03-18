package com.ss.android.lark.ding.widget.switchbtn;

import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;

public class SwitchView extends LinearLayout {

    /* renamed from: a */
    private ImageView f94514a;

    /* renamed from: b */
    private int f94515b = 1;

    public int getSwitchState() {
        return this.f94515b;
    }

    /* renamed from: a */
    private void m145095a() {
        ImageView imageView = new ImageView(getContext());
        this.f94514a = imageView;
        imageView.setLayoutParams(new LinearLayout.LayoutParams(0, -1, 1.0f));
        this.f94514a.setBackgroundResource(R.drawable.ding_switch_btn_bg);
        addView(this.f94514a);
    }

    public SwitchView(Context context) {
        super(context);
        m145095a();
    }

    private void setGravityByState(int i) {
        if (i == 1) {
            setGravity(3);
        } else if (i == 2) {
            setGravity(17);
        } else if (i == 3) {
            setGravity(5);
        }
    }

    /* renamed from: a */
    public void mo135495a(int i) {
        if (i != this.f94515b) {
            Animation animation = this.f94514a.getAnimation();
            if (animation != null) {
                animation.cancel();
                this.f94514a.clearAnimation();
            }
            if (i == 1) {
                this.f94514a.setBackgroundResource(R.drawable.ding_switch_btn_bg);
            } else if (i == 2) {
                this.f94514a.setBackgroundResource(R.drawable.ding_middle_switch_btn_bg);
            } else if (i == 3) {
                this.f94514a.setBackgroundResource(R.drawable.ding_right_switch_btn_bg);
            }
            setGravityByState(this.f94515b);
            this.f94514a.startAnimation(m145094a(i, this.f94515b));
            this.f94515b = i;
        }
    }

    public SwitchView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m145095a();
    }

    /* renamed from: a */
    private Animation m145094a(int i, int i2) {
        TranslateAnimation translateAnimation = new TranslateAnimation(1, BitmapDescriptorFactory.HUE_RED, 0, (float) (this.f94514a.getWidth() * (i - i2)), 1, BitmapDescriptorFactory.HUE_RED, 1, BitmapDescriptorFactory.HUE_RED);
        translateAnimation.setDuration(300);
        translateAnimation.setFillAfter(true);
        translateAnimation.setAnimationListener(new Animation.AnimationListener() {
            /* class com.ss.android.lark.ding.widget.switchbtn.SwitchView.animationAnimation$AnimationListenerC367851 */

            public void onAnimationEnd(Animation animation) {
            }

            public void onAnimationRepeat(Animation animation) {
            }

            public void onAnimationStart(Animation animation) {
            }
        });
        return translateAnimation;
    }
}
