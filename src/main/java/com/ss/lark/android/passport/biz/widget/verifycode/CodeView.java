package com.ss.lark.android.passport.biz.widget.verifycode;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.universe_design.color.UDColorUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.passport.infra.util.C49154ag;
import com.ss.android.lark.passport.infra.widget.StatefulInput;
import com.ss.android.lark.passport.infra.widget.StatefulInputBgDrawable;

public class CodeView extends RelativeLayout {

    /* renamed from: a */
    public View f164593a;

    /* renamed from: b */
    public C65359a f164594b;

    /* renamed from: c */
    private TextView f164595c;

    /* renamed from: d */
    private ValueAnimator f164596d;

    /* renamed from: e */
    private final StatefulInputBgDrawable f164597e;

    /* renamed from: d */
    public void mo224816d() {
        mo224817e();
    }

    /* renamed from: b */
    public void mo224814b() {
        View view = this.f164593a;
        if (view != null) {
            view.setVisibility(8);
            setCursorFlicker(false);
        }
    }

    public String getText() {
        TextView textView = this.f164595c;
        if (textView != null) {
            return textView.getText().toString();
        }
        return "";
    }

    /* renamed from: c */
    public void mo224815c() {
        View view;
        if (this.f164594b.f164599a && (view = this.f164593a) != null) {
            view.setVisibility(0);
            setCursorFlicker(this.f164594b.f164600b);
        }
    }

    /* renamed from: e */
    public void mo224817e() {
        TextView textView = this.f164595c;
        if (textView != null) {
            textView.setText("");
        }
        this.f164597e.mo171824a();
        View view = this.f164593a;
        if (view != null) {
            view.setVisibility(8);
            setCursorFlicker(false);
        }
    }

    /* renamed from: f */
    public void mo224818f() {
        this.f164597e.mo171824a();
        View view = this.f164593a;
        if (view != null) {
            view.setVisibility(8);
            setCursorFlicker(false);
        }
    }

    /* renamed from: g */
    private void m256359g() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, BitmapDescriptorFactory.HUE_RED);
        this.f164596d = ofFloat;
        ofFloat.setRepeatCount(-1);
        this.f164596d.setRepeatMode(2);
        this.f164596d.setDuration(600L);
        this.f164596d.setInterpolator(new LinearInterpolator());
        this.f164596d.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.ss.lark.android.passport.biz.widget.verifycode.CodeView.C653581 */

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                if (((double) valueAnimator.getAnimatedFraction()) < 0.5d) {
                    CodeView.this.f164593a.setBackgroundColor(0);
                } else {
                    CodeView.this.f164593a.setBackgroundColor(CodeView.this.f164594b.f164601c);
                }
            }
        });
    }

    /* renamed from: a */
    public void mo224812a() {
        View view;
        if (this.f164594b.f164599a && (view = this.f164593a) != null) {
            view.setVisibility(0);
            setCursorFlicker(this.f164594b.f164600b);
        }
        TextView textView = this.f164595c;
        if (textView != null) {
            textView.setText("");
        }
        this.f164597e.mo171827b();
    }

    /* renamed from: com.ss.lark.android.passport.biz.widget.verifycode.CodeView$a */
    public static class C65359a {

        /* renamed from: a */
        public boolean f164599a = true;

        /* renamed from: b */
        public boolean f164600b;

        /* renamed from: c */
        public int f164601c;

        /* renamed from: d */
        public int f164602d = 17;

        /* renamed from: e */
        public int f164603e;

        /* renamed from: f */
        public int f164604f;

        /* renamed from: g */
        public int f164605g;

        /* renamed from: h */
        public int f164606h;

        /* renamed from: i */
        public int f164607i = 18;

        /* renamed from: a */
        public C65359a mo224823a(int i) {
            this.f164601c = i;
            return this;
        }

        /* renamed from: b */
        public C65359a mo224825b(int i) {
            this.f164602d = i;
            return this;
        }

        /* renamed from: c */
        public C65359a mo224827c(int i) {
            this.f164603e = i;
            return this;
        }

        /* renamed from: d */
        public C65359a mo224828d(int i) {
            this.f164604f = i;
            return this;
        }

        /* renamed from: e */
        public C65359a mo224829e(int i) {
            this.f164605g = i;
            return this;
        }

        /* renamed from: f */
        public C65359a mo224830f(int i) {
            this.f164607i = i;
            return this;
        }

        /* renamed from: g */
        public C65359a mo224831g(int i) {
            this.f164606h = i;
            return this;
        }

        /* renamed from: a */
        public C65359a mo224824a(boolean z) {
            this.f164599a = z;
            return this;
        }

        /* renamed from: b */
        public C65359a mo224826b(boolean z) {
            this.f164600b = z;
            return this;
        }

        public C65359a(Context context) {
            this.f164603e = UDColorUtils.getColor(context, R.color.text_title);
            this.f164604f = UDColorUtils.getColor(context, R.color.line_border_card);
            this.f164605g = UDColorUtils.getColor(context, R.color.primary_pri_500);
            this.f164606h = UDColorUtils.getColor(context, R.color.function_danger_500);
            this.f164601c = UDColorUtils.getColor(context, R.color.primary_pri_500);
        }
    }

    public CodeView(Context context) {
        this(context, null);
    }

    private void setCursorFlicker(boolean z) {
        if (z) {
            this.f164596d.start();
        } else {
            this.f164596d.cancel();
        }
    }

    /* renamed from: a */
    private int m256358a(float f) {
        return (int) ((f * getContext().getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setText(String str) {
        TextView textView = this.f164595c;
        if (textView != null) {
            textView.setText(str);
        }
        this.f164597e.mo171827b();
        View view = this.f164593a;
        if (view != null) {
            view.setVisibility(8);
            setCursorFlicker(false);
        }
    }

    /* renamed from: a */
    public void mo224813a(C65359a aVar) {
        if (aVar != null) {
            removeAllViews();
            this.f164594b = aVar;
            this.f164597e.mo171825a(StatefulInput.InputState.f123624a, this.f164594b.f164604f);
            this.f164597e.mo171825a(StatefulInput.InputState.f123625b, this.f164594b.f164605g);
            this.f164597e.mo171825a(StatefulInput.InputState.f123626c, this.f164594b.f164606h);
            this.f164595c = new TextView(getContext());
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -1);
            layoutParams.addRule(14, -1);
            this.f164595c.setTextColor(aVar.f164603e);
            this.f164595c.setTextSize((float) aVar.f164602d);
            this.f164595c.setTypeface(Typeface.defaultFromStyle(1));
            this.f164595c.setGravity(17);
            this.f164595c.setId(R.id.signin_sdk_cv_text_id);
            this.f164595c.setInputType(aVar.f164607i);
            addView(this.f164595c, layoutParams);
            this.f164593a = new View(getContext());
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(m256358a(1.5f), -1);
            layoutParams2.addRule(1, R.id.signin_sdk_cv_text_id);
            layoutParams2.bottomMargin = m256358a(10.0f);
            layoutParams2.topMargin = m256358a(10.0f);
            this.f164593a.setBackgroundColor(aVar.f164601c);
            addView(this.f164593a, layoutParams2);
            setBackground(this.f164597e);
            mo224817e();
        }
    }

    public CodeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (DesktopUtil.m144301a(getContext())) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(C49154ag.m193828a(getContext(), 48.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(C49154ag.m193828a(getContext(), 48.0f), 1073741824));
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec((int) ((double) (((float) size) * 1.05f)), 1073741824));
    }

    public CodeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f164597e = new StatefulInputBgDrawable(getContext());
        m256359g();
        setClipChildren(false);
    }
}
