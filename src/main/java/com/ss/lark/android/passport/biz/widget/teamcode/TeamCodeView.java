package com.ss.lark.android.passport.biz.widget.teamcode;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.universe_design.color.UDColorUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.passport.infra.widget.StatefulInput;
import com.ss.android.lark.passport.infra.widget.StatefulInputBgDrawable;

public class TeamCodeView extends RelativeLayout {

    /* renamed from: a */
    public View f164578a;

    /* renamed from: b */
    public C65357a f164579b;

    /* renamed from: c */
    private TextView f164580c;

    /* renamed from: d */
    private ValueAnimator f164581d;

    /* renamed from: e */
    private StatefulInputBgDrawable f164582e;

    /* renamed from: b */
    public void mo224797b() {
        mo224798c();
    }

    public String getText() {
        TextView textView = this.f164580c;
        if (textView != null) {
            return textView.getText().toString();
        }
        return "";
    }

    /* renamed from: c */
    public void mo224798c() {
        TextView textView = this.f164580c;
        if (textView != null) {
            textView.setText("");
        }
        StatefulInputBgDrawable dVar = this.f164582e;
        if (dVar != null) {
            dVar.mo171824a();
        }
        View view = this.f164578a;
        if (view != null) {
            view.setVisibility(8);
            setCursorFlicker(false);
        }
    }

    /* renamed from: d */
    public void mo224799d() {
        StatefulInputBgDrawable dVar = this.f164582e;
        if (dVar != null) {
            dVar.mo171824a();
        }
        View view = this.f164578a;
        if (view != null) {
            view.setVisibility(8);
            setCursorFlicker(false);
        }
    }

    /* renamed from: e */
    private void m256343e() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, BitmapDescriptorFactory.HUE_RED);
        this.f164581d = ofFloat;
        ofFloat.setRepeatCount(-1);
        this.f164581d.setRepeatMode(2);
        this.f164581d.setDuration(600L);
        this.f164581d.setInterpolator(new LinearInterpolator());
        this.f164581d.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.ss.lark.android.passport.biz.widget.teamcode.TeamCodeView.C653561 */

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                if (((double) valueAnimator.getAnimatedFraction()) < 0.5d) {
                    TeamCodeView.this.f164578a.setBackgroundColor(0);
                } else {
                    TeamCodeView.this.f164578a.setBackgroundColor(TeamCodeView.this.f164579b.f164586c);
                }
            }
        });
    }

    /* renamed from: a */
    public void mo224795a() {
        View view;
        if (this.f164579b.f164584a && (view = this.f164578a) != null) {
            view.setVisibility(0);
            setCursorFlicker(this.f164579b.f164585b);
        }
        TextView textView = this.f164580c;
        if (textView != null) {
            textView.setText("");
        }
        StatefulInputBgDrawable dVar = this.f164582e;
        if (dVar != null) {
            dVar.mo171827b();
        }
    }

    /* renamed from: com.ss.lark.android.passport.biz.widget.teamcode.TeamCodeView$a */
    public static class C65357a {

        /* renamed from: a */
        public boolean f164584a = true;

        /* renamed from: b */
        public boolean f164585b;

        /* renamed from: c */
        public int f164586c;

        /* renamed from: d */
        public int f164587d = 26;

        /* renamed from: e */
        public int f164588e;

        /* renamed from: f */
        public int f164589f;

        /* renamed from: g */
        public int f164590g;

        /* renamed from: h */
        public int f164591h;

        /* renamed from: i */
        public Integer f164592i;

        /* renamed from: a */
        public C65357a mo224803a(int i) {
            this.f164586c = i;
            return this;
        }

        /* renamed from: b */
        public C65357a mo224806b(int i) {
            this.f164587d = i;
            return this;
        }

        /* renamed from: c */
        public C65357a mo224808c(int i) {
            this.f164588e = i;
            return this;
        }

        /* renamed from: d */
        public C65357a mo224809d(int i) {
            this.f164589f = i;
            return this;
        }

        /* renamed from: e */
        public C65357a mo224810e(int i) {
            this.f164590g = i;
            return this;
        }

        /* renamed from: f */
        public C65357a mo224811f(int i) {
            this.f164591h = i;
            return this;
        }

        /* renamed from: a */
        public C65357a mo224804a(Integer num) {
            this.f164592i = num;
            return this;
        }

        /* renamed from: b */
        public C65357a mo224807b(boolean z) {
            this.f164585b = z;
            return this;
        }

        /* renamed from: a */
        public C65357a mo224805a(boolean z) {
            this.f164584a = z;
            return this;
        }

        public C65357a(Context context) {
            this.f164588e = UDColorUtils.getColor(context, R.color.text_title);
            this.f164589f = UDColorUtils.getColor(context, R.color.line_border_card);
            this.f164590g = UDColorUtils.getColor(context, R.color.primary_pri_500);
            this.f164591h = UDColorUtils.getColor(context, R.color.function_danger_500);
            this.f164586c = UDColorUtils.getColor(context, R.color.primary_pri_500);
        }
    }

    public TeamCodeView(Context context) {
        this(context, null);
    }

    private void setCursorFlicker(boolean z) {
        if (z) {
            this.f164581d.start();
        } else {
            this.f164581d.cancel();
        }
    }

    /* renamed from: a */
    private int m256342a(float f) {
        return (int) ((f * getContext().getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setText(String str) {
        TextView textView = this.f164580c;
        if (textView != null) {
            textView.setText(str);
        }
        StatefulInputBgDrawable dVar = this.f164582e;
        if (dVar != null) {
            dVar.mo171827b();
        }
        View view = this.f164578a;
        if (view != null) {
            view.setVisibility(8);
            setCursorFlicker(false);
        }
    }

    /* renamed from: a */
    public void mo224796a(C65357a aVar) {
        if (aVar != null) {
            removeAllViews();
            this.f164579b = aVar;
            StatefulInputBgDrawable dVar = this.f164582e;
            if (dVar != null) {
                dVar.mo171825a(StatefulInput.InputState.f123624a, this.f164579b.f164589f);
                this.f164582e.mo171825a(StatefulInput.InputState.f123625b, this.f164579b.f164590g);
                this.f164582e.mo171825a(StatefulInput.InputState.f123626c, this.f164579b.f164591h);
            }
            this.f164580c = new TextView(getContext());
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -1);
            layoutParams.addRule(14, -1);
            layoutParams.bottomMargin = m256342a(8.0f);
            layoutParams.topMargin = m256342a(8.0f);
            this.f164580c.setTextColor(aVar.f164588e);
            this.f164580c.setTextSize((float) aVar.f164587d);
            this.f164580c.setGravity(17);
            this.f164580c.getPaint().setFakeBoldText(true);
            this.f164580c.setId(R.id.signin_sdk_cv_text_id);
            if (aVar.f164592i != null) {
                this.f164580c.setInputType(aVar.f164592i.intValue());
            }
            addView(this.f164580c, layoutParams);
            this.f164578a = new View(getContext());
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(m256342a(1.5f), -1);
            layoutParams2.addRule(1, R.id.signin_sdk_cv_text_id);
            layoutParams2.bottomMargin = m256342a(14.0f);
            layoutParams2.topMargin = m256342a(12.0f);
            this.f164578a.setBackgroundColor(aVar.f164586c);
            addView(this.f164578a, layoutParams2);
            setBackground(this.f164582e);
            mo224798c();
        }
    }

    public TeamCodeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TeamCodeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m256343e();
    }
}
