package com.ss.android.lark.invitation.v2.feat.member.welcome;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.core.view.animation.PathInterpolatorCompat;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.larksuite.component.universe_design.color.UDColorUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;

public class CommonPickInput extends BaseContactInput {

    /* renamed from: b */
    private static int f102841b = Color.parseColor("#E6E8EB");

    /* renamed from: c */
    private static int f102842c = Color.parseColor("#3377FF");

    /* renamed from: d */
    private final GradientDrawable f102843d = m160230a(getContext());
    @BindView(7035)
    TextView mContentInput;
    @BindView(8262)
    View mDivider;

    @Override // com.ss.android.lark.invitation.v2.feat.member.welcome.BaseContactInput
    public String getContent() {
        return this.mContentInput.getText().toString();
    }

    /* renamed from: a */
    private void m160231a() {
        f102842c = UDColorUtils.getColor(getContext(), R.color.primary_pri_500);
        f102841b = UDColorUtils.getColor(getContext(), R.color.line_border_component);
        ButterKnife.bind(this, LayoutInflater.from(getContext()).inflate(R.layout.inv_widget_common_picker, this));
        this.mDivider.setBackground(this.f102843d);
        this.mContentInput.setTypeface(Typeface.defaultFromStyle(0));
    }

    /* renamed from: a */
    public void mo146529a(boolean z) {
        m160233a(this.mDivider, z);
    }

    public void setInputHint(String str) {
        this.mContentInput.setHint(str);
    }

    public void setInputText(String str) {
        this.mContentInput.setText(str);
    }

    public void setInputType(int i) {
        this.mContentInput.setInputType(i);
    }

    public CommonPickInput(Context context) {
        super(context);
        m160231a();
    }

    /* renamed from: a */
    public static GradientDrawable m160230a(Context context) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setStroke(UIUtils.dp2px(context, 1.0f), UIUtils.getColor(context, R.color.line_border_component));
        gradientDrawable.setCornerRadius((float) UIUtils.dp2px(context, 6.0f));
        return gradientDrawable;
    }

    public CommonPickInput(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m160231a();
    }

    /* renamed from: a */
    private void m160233a(View view, boolean z) {
        int i;
        int i2;
        if (z) {
            i = f102841b;
        } else {
            i = f102842c;
        }
        if (z) {
            i2 = f102842c;
        } else {
            i2 = f102841b;
        }
        final Drawable background = view.getBackground();
        if (background instanceof GradientDrawable) {
            ValueAnimator duration = ValueAnimator.ofInt(i, i2).setDuration(300L);
            duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                /* class com.ss.android.lark.invitation.v2.feat.member.welcome.CommonPickInput.C404921 */

                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    CommonPickInput.m160232a(CommonPickInput.this.getContext(), (GradientDrawable) background, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                }
            });
            duration.setInterpolator(PathInterpolatorCompat.create(0.32f, 0.94f, 0.6f, 1.0f));
            duration.setEvaluator(new ArgbEvaluator());
            duration.start();
        }
    }

    /* renamed from: a */
    public static void m160232a(Context context, GradientDrawable gradientDrawable, int i) {
        if (gradientDrawable != null) {
            gradientDrawable.setStroke(UIUtils.dp2px(context, 1.0f), i);
        }
    }

    public CommonPickInput(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m160231a();
    }
}
