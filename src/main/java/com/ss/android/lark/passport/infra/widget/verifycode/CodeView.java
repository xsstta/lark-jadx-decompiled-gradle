package com.ss.android.lark.passport.infra.widget.verifycode;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import java.io.Serializable;

public class CodeView extends RelativeLayout {

    /* renamed from: a */
    public View f123712a;

    /* renamed from: b */
    public Parameters f123713b;

    /* renamed from: c */
    private TextView f123714c;

    /* renamed from: d */
    private View f123715d;

    /* renamed from: e */
    private ValueAnimator f123716e;

    public String getText() {
        TextView textView = this.f123714c;
        if (textView != null) {
            return textView.getText().toString();
        }
        return "";
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        ValueAnimator valueAnimator = this.f123716e;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f123716e.cancel();
        }
        super.onDetachedFromWindow();
    }

    /* renamed from: a */
    private void m194172a() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, BitmapDescriptorFactory.HUE_RED);
        this.f123716e = ofFloat;
        ofFloat.setRepeatCount(-1);
        this.f123716e.setRepeatMode(2);
        this.f123716e.setDuration(600L);
        this.f123716e.setInterpolator(new LinearInterpolator());
        this.f123716e.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.ss.android.lark.passport.infra.widget.verifycode.CodeView.C492761 */

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                if (((double) valueAnimator.getAnimatedFraction()) < 0.5d) {
                    CodeView.this.f123712a.setBackgroundColor(0);
                } else {
                    CodeView.this.f123712a.setBackgroundColor(CodeView.this.f123713b.cursorColor);
                }
            }
        });
    }

    public static class Parameters implements Serializable {
        public int cursorColor = Color.rgb(51, 119, 255);
        private int errorColor = Color.rgb(255, 91, 76);
        public int inputType = 18;
        public boolean isFlickerCursor;
        public boolean isShowCursor = true;
        public int selectedLineColor = Color.rgb(51, 119, 255);
        public int textColor = Color.rgb(20, 31, 51);
        public int textSize = 17;
        public int unSelectedLineColor = Color.rgb(237, 237, 240);

        public Parameters setCursorColor(int i) {
            this.cursorColor = i;
            return this;
        }

        public Parameters setErrorColor(int i) {
            this.errorColor = i;
            return this;
        }

        public Parameters setFlickerCursor(boolean z) {
            this.isFlickerCursor = z;
            return this;
        }

        public Parameters setInputType(int i) {
            this.inputType = i;
            return this;
        }

        public Parameters setSelectedLineColor(int i) {
            this.selectedLineColor = i;
            return this;
        }

        public Parameters setShowCursor(boolean z) {
            this.isShowCursor = z;
            return this;
        }

        public Parameters setTextColor(int i) {
            this.textColor = i;
            return this;
        }

        public Parameters setTextSize(int i) {
            this.textSize = i;
            return this;
        }

        public Parameters setUnSelectedLineColor(int i) {
            this.unSelectedLineColor = i;
            return this;
        }
    }

    public CodeView(Context context) {
        this(context, null);
    }

    private void setCursorFlicker(boolean z) {
        if (z) {
            this.f123716e.start();
        } else {
            this.f123716e.cancel();
        }
    }

    public void setText(String str) {
        TextView textView = this.f123714c;
        if (textView != null) {
            textView.setText(str);
        }
        View view = this.f123715d;
        if (view != null) {
            view.setBackgroundColor(this.f123713b.selectedLineColor);
        }
        View view2 = this.f123712a;
        if (view2 != null) {
            view2.setVisibility(8);
            setCursorFlicker(false);
        }
    }

    public CodeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CodeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m194172a();
        setClipChildren(false);
    }
}
