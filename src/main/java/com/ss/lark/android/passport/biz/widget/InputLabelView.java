package com.ss.lark.android.passport.biz.widget;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import com.ss.android.lark.passport.infra.util.p2442d.C49186a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;

public class InputLabelView extends ConstraintLayout {

    /* renamed from: a */
    public AbstractC65266a f164345a;

    /* renamed from: b */
    private int f164346b;

    /* renamed from: c */
    private final List<ValueAnimator> f164347c = new ArrayList();

    /* renamed from: d */
    private boolean f164348d;
    @BindView(6362)
    TextView mMailLabelView;
    @BindView(6365)
    View mMailSwitcher;
    @BindView(6363)
    TextView mPhoneLabelView;
    @BindView(6366)
    View mPhoneSwitcher;

    @Retention(RetentionPolicy.SOURCE)
    public @interface Mode {
    }

    /* renamed from: com.ss.lark.android.passport.biz.widget.InputLabelView$a */
    public interface AbstractC65266a {
        /* renamed from: a */
        void mo224557a(int i);
    }

    /* renamed from: a */
    private void m256168a() {
        ButterKnife.bind(this, LayoutInflater.from(getContext()).inflate(R.layout.signin_sdk_widget_input_label, this));
        this.mPhoneSwitcher.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.lark.android.passport.biz.widget.InputLabelView.View$OnClickListenerC652601 */

            public void onClick(View view) {
                if (InputLabelView.this.f164345a != null) {
                    InputLabelView.this.f164345a.mo224557a(2);
                }
                InputLabelView.this.mo224548a(2);
            }
        });
        this.mMailSwitcher.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.lark.android.passport.biz.widget.InputLabelView.View$OnClickListenerC652612 */

            public void onClick(View view) {
                if (InputLabelView.this.f164345a != null) {
                    InputLabelView.this.f164345a.mo224557a(1);
                }
                InputLabelView.this.mo224548a(1);
            }
        });
    }

    /* renamed from: b */
    private void m256170b() {
        this.mMailSwitcher.setAlpha(BitmapDescriptorFactory.HUE_RED);
        this.mMailSwitcher.setVisibility(0);
        this.mMailSwitcher.setEnabled(false);
        this.mPhoneSwitcher.setEnabled(false);
        ValueAnimator duration = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f).setDuration(300L);
        duration.setInterpolator(C49186a.m193930a());
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.ss.lark.android.passport.biz.widget.InputLabelView.C652623 */

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                float animatedFraction = valueAnimator.getAnimatedFraction();
                InputLabelView.this.mMailSwitcher.setAlpha(animatedFraction);
                InputLabelView.this.mPhoneSwitcher.setAlpha(1.0f - animatedFraction);
                if (animatedFraction >= 1.0f) {
                    InputLabelView.this.mPhoneSwitcher.setVisibility(8);
                    InputLabelView.this.mMailSwitcher.setEnabled(true);
                }
            }
        });
        duration.start();
        this.f164347c.add(duration);
    }

    /* renamed from: c */
    private void m256171c() {
        this.mPhoneSwitcher.setAlpha(BitmapDescriptorFactory.HUE_RED);
        this.mPhoneSwitcher.setVisibility(0);
        this.mMailSwitcher.setEnabled(false);
        this.mPhoneSwitcher.setEnabled(false);
        ValueAnimator duration = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f).setDuration(300L);
        duration.setInterpolator(C49186a.m193930a());
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.ss.lark.android.passport.biz.widget.InputLabelView.C652634 */

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                float animatedFraction = valueAnimator.getAnimatedFraction();
                InputLabelView.this.mPhoneSwitcher.setAlpha(animatedFraction);
                InputLabelView.this.mMailSwitcher.setAlpha(1.0f - animatedFraction);
                if (animatedFraction >= 1.0f) {
                    InputLabelView.this.mMailSwitcher.setVisibility(8);
                    InputLabelView.this.mPhoneSwitcher.setEnabled(true);
                }
            }
        });
        duration.start();
        this.f164347c.add(duration);
    }

    /* renamed from: d */
    private void m256172d() {
        this.mMailSwitcher.setAlpha(BitmapDescriptorFactory.HUE_RED);
        this.mMailLabelView.setAlpha(BitmapDescriptorFactory.HUE_RED);
        this.mMailSwitcher.setVisibility(0);
        this.mMailLabelView.setVisibility(0);
        this.mMailSwitcher.setEnabled(false);
        this.mPhoneSwitcher.setEnabled(false);
        ValueAnimator duration = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f).setDuration(300L);
        duration.setInterpolator(C49186a.m193930a());
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.ss.lark.android.passport.biz.widget.InputLabelView.C652645 */

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                float animatedFraction = valueAnimator.getAnimatedFraction();
                InputLabelView.this.mMailLabelView.setAlpha(animatedFraction);
                InputLabelView.this.mMailSwitcher.setAlpha(animatedFraction);
                float f = 1.0f - animatedFraction;
                InputLabelView.this.mPhoneLabelView.setAlpha(f);
                InputLabelView.this.mPhoneSwitcher.setAlpha(f);
                if (animatedFraction >= 1.0f) {
                    InputLabelView.this.mPhoneSwitcher.setVisibility(8);
                    InputLabelView.this.mPhoneLabelView.setVisibility(8);
                    InputLabelView.this.mMailSwitcher.setEnabled(true);
                }
            }
        });
        duration.start();
        this.f164347c.add(duration);
    }

    /* renamed from: e */
    private void m256173e() {
        this.mPhoneSwitcher.setAlpha(BitmapDescriptorFactory.HUE_RED);
        this.mPhoneLabelView.setAlpha(BitmapDescriptorFactory.HUE_RED);
        this.mPhoneSwitcher.setVisibility(0);
        this.mPhoneLabelView.setVisibility(0);
        this.mMailSwitcher.setEnabled(false);
        this.mPhoneSwitcher.setEnabled(false);
        ValueAnimator duration = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f).setDuration(300L);
        duration.setInterpolator(C49186a.m193930a());
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.ss.lark.android.passport.biz.widget.InputLabelView.C652656 */

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                float animatedFraction = valueAnimator.getAnimatedFraction();
                InputLabelView.this.mPhoneLabelView.setAlpha(animatedFraction);
                InputLabelView.this.mPhoneSwitcher.setAlpha(animatedFraction);
                float f = 1.0f - animatedFraction;
                InputLabelView.this.mMailLabelView.setAlpha(f);
                InputLabelView.this.mMailSwitcher.setAlpha(f);
                if (animatedFraction >= 1.0f) {
                    InputLabelView.this.mMailSwitcher.setVisibility(8);
                    InputLabelView.this.mMailLabelView.setVisibility(8);
                    InputLabelView.this.mPhoneSwitcher.setEnabled(true);
                }
            }
        });
        duration.start();
        this.f164347c.add(duration);
    }

    public void setListener(AbstractC65266a aVar) {
        this.f164345a = aVar;
    }

    public InputLabelView(Context context) {
        super(context);
        m256168a();
    }

    public void setFixLabel(String str) {
        this.f164348d = true;
        this.mPhoneLabelView.setText(str);
        this.mMailLabelView.setText(str);
    }

    /* renamed from: a */
    private void m256169a(AttributeSet attributeSet) {
        this.f164346b = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.mode}).getInteger(0, 1);
    }

    /* renamed from: a */
    public void mo224548a(int i) {
        this.f164346b = i;
        if (i == 2) {
            if (this.f164348d) {
                m256170b();
            } else {
                m256172d();
            }
        } else if (i != 1) {
        } else {
            if (this.f164348d) {
                m256171c();
            } else {
                m256173e();
            }
        }
    }

    public InputLabelView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m256169a(attributeSet);
        m256168a();
    }

    public InputLabelView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m256169a(attributeSet);
        m256168a();
    }
}
