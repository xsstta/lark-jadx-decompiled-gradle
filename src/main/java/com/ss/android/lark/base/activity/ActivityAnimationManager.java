package com.ss.android.lark.base.activity;

import android.app.Activity;
import android.content.Context;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;

public class ActivityAnimationManager {
    public static final int[] ANIM_FADE_OUT = {R.anim.lark_base_hold, R.anim.fade_out};
    public static final int[] ANIM_HOLD = {0, 0};
    public static final int[] ANIM_PUSH_LEFT_CREAT = {R.anim.push_left_in, R.anim.push_left_out};
    public static final int[] ANIM_SLIDE_BOTTOM_OUT = {R.anim.activity_nothing, R.anim.activity_close_to_bottom};
    public static final int[] ANIM_SLIDE_LEFT_OUT = {R.anim.lark_base_hold, R.anim.slide_left_out};
    public static final int[] ANIM_SLIDE_RIGHT_IN = {R.anim.slide_right_in, R.anim.lark_base_hold};
    public static final int[] ANIM_SLIDE_RIGHT_OUT = {R.anim.lark_base_hold, R.anim.slide_right_out};
    public static final int[] ANIM_SLIDE_UP_IN = {R.anim.activity_enter_from_bottom, R.anim.activity_nothing};

    public static class AnimationConfig {
        private int mEnterAnimation = Integer.MIN_VALUE;
        private int mExitAnimation = Integer.MIN_VALUE;

        public int getEnterAnimation() {
            return this.mEnterAnimation;
        }

        public int getExitAnimation() {
            return this.mExitAnimation;
        }

        public AnimationConfig() {
        }

        public AnimationConfig setEnterAnimation(int i) {
            this.mEnterAnimation = i;
            return this;
        }

        public AnimationConfig setExitAnimation(int i) {
            this.mExitAnimation = i;
            return this;
        }

        public AnimationConfig(int[] iArr) {
            if (iArr != null) {
                if (iArr.length > 0) {
                    this.mEnterAnimation = iArr[0];
                }
                if (iArr.length > 1) {
                    this.mExitAnimation = iArr[1];
                }
            }
        }

        public AnimationConfig(int i, int i2) {
            this.mEnterAnimation = i;
            this.mExitAnimation = i2;
        }
    }

    public static void doAnimation(Activity activity, AnimationConfig animationConfig) {
        if (activity != null && animationConfig != null) {
            int enterAnimation = animationConfig.getEnterAnimation();
            int exitAnimation = animationConfig.getExitAnimation();
            if (DesktopUtil.m144301a((Context) activity)) {
                activity.overridePendingTransition(0, 0);
            } else {
                activity.overridePendingTransition(enterAnimation, exitAnimation);
            }
        }
    }

    public static void doAnimationWithDefault(Activity activity, AnimationConfig animationConfig, AnimationConfig animationConfig2) {
        if (animationConfig == null) {
            animationConfig = animationConfig2;
        }
        doAnimation(activity, animationConfig);
    }
}
