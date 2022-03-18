package com.ss.android.vc.meeting.basedialog.FullScreen;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import com.larksuite.suite.R;

public class FullScreenFrame extends LinearLayout {

    /* renamed from: a */
    private AnimationType f153298a;

    public enum AnimationType {
        RIGHT_IN_OUT,
        BOTTOM_IN_OUT
    }

    /* renamed from: c */
    private void m238032c() {
        startAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.frame_right_in));
    }

    /* renamed from: d */
    private void m238033d() {
        startAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.frame_right_out));
    }

    /* renamed from: e */
    private void m238034e() {
        startAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.frame_bottom_in));
    }

    /* renamed from: f */
    private void m238035f() {
        startAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.frame_bottom_out));
    }

    /* renamed from: a */
    public void mo211624a() {
        AnimationType animationType = this.f153298a;
        if (animationType != null) {
            if (animationType == AnimationType.RIGHT_IN_OUT) {
                m238032c();
            } else {
                m238034e();
            }
        }
    }

    /* renamed from: b */
    public void mo211625b() {
        AnimationType animationType = this.f153298a;
        if (animationType != null) {
            if (animationType == AnimationType.RIGHT_IN_OUT) {
                m238033d();
            } else {
                m238035f();
            }
        }
        if (getParent() instanceof ViewGroup) {
            ((ViewGroup) getParent()).removeView(this);
        }
    }

    public void setAnimationType(AnimationType animationType) {
        this.f153298a = animationType;
    }

    public FullScreenFrame(Context context) {
        this(context, null);
    }

    public FullScreenFrame(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FullScreenFrame(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f153298a = AnimationType.BOTTOM_IN_OUT;
        setOrientation(1);
        setClickable(true);
        setFocusable(true);
    }
}
