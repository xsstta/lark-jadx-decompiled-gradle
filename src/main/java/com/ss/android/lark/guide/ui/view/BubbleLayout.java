package com.ss.android.lark.guide.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.C0689b;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.larksuite.suite.R;

public class BubbleLayout extends FrameLayout {

    /* renamed from: a */
    private ConstraintLayout f99541a;

    /* renamed from: b */
    private RoundRectLayout f99542b;

    /* renamed from: c */
    private ArrowView f99543c;

    /* renamed from: d */
    private ConstraintLayout f99544d;

    /* renamed from: e */
    private int f99545e = 8388613;

    /* renamed from: f */
    private float f99546f;

    /* renamed from: g */
    private float f99547g;

    /* renamed from: h */
    private float f99548h;

    /* renamed from: i */
    private float f99549i;

    /* renamed from: j */
    private int f99550j;

    /* renamed from: k */
    private float f99551k;

    /* renamed from: l */
    private int f99552l;

    /* renamed from: m */
    private float f99553m;

    /* renamed from: n */
    private float f99554n;

    /* renamed from: o */
    private float f99555o;

    public float getArrowMainLen() {
        return this.f99554n;
    }

    public C38698a getArrowOffsetSetter() {
        return new C38698a(this);
    }

    public C38699b getConfigSetter() {
        return new C38699b(this);
    }

    /* renamed from: com.ss.android.lark.guide.ui.view.BubbleLayout$a */
    public static class C38698a {

        /* renamed from: a */
        private BubbleLayout f99556a;

        /* renamed from: a */
        public void mo141805a() {
            this.f99556a.mo141791b();
        }

        public C38698a(BubbleLayout bubbleLayout) {
            this.f99556a = bubbleLayout;
        }

        /* renamed from: a */
        public C38698a mo141804a(float f) {
            this.f99556a.setArrowOffset(f);
            return this;
        }
    }

    /* renamed from: a */
    public void mo141790a() {
        m152815d();
        m152817e();
        m152809a(this.f99541a, this.f99545e);
    }

    /* renamed from: d */
    private void m152815d() {
        this.f99542b.setPadding((int) this.f99546f, (int) this.f99547g, (int) this.f99548h, (int) this.f99549i);
        this.f99542b.setFillColor(this.f99550j);
        this.f99542b.setCornerRadius(this.f99551k);
    }

    /* renamed from: com.ss.android.lark.guide.ui.view.BubbleLayout$b */
    public static class C38699b {

        /* renamed from: a */
        private BubbleLayout f99557a;

        /* renamed from: a */
        public void mo141809a() {
            this.f99557a.mo141790a();
        }

        public C38699b(BubbleLayout bubbleLayout) {
            this.f99557a = bubbleLayout;
        }

        /* renamed from: a */
        public C38699b mo141806a(float f) {
            this.f99557a.setCardCornerRadius(f);
            return this;
        }

        /* renamed from: b */
        public C38699b mo141810b(float f) {
            this.f99557a.setArrowMainLength(f);
            return this;
        }

        /* renamed from: c */
        public C38699b mo141812c(float f) {
            this.f99557a.setArrowCrossLength(f);
            return this;
        }

        /* renamed from: a */
        public C38699b mo141807a(int i) {
            this.f99557a.setArrowColor(i);
            return this;
        }

        /* renamed from: b */
        public C38699b mo141811b(int i) {
            this.f99557a.setAnchorGravity(i);
            return this;
        }

        /* renamed from: a */
        public C38699b mo141808a(View view) {
            this.f99557a.setContentView(view);
            return this;
        }
    }

    /* renamed from: c */
    private void m152813c() {
        ConstraintLayout constraintLayout = new ConstraintLayout(getContext());
        this.f99541a = constraintLayout;
        constraintLayout.setId(R.id.bubble_container);
        addView(this.f99541a, new FrameLayout.LayoutParams(-2, -2));
        m152808a(this.f99541a);
        m152811b(this.f99541a);
    }

    /* renamed from: e */
    private void m152817e() {
        float f;
        float f2;
        this.f99543c.setAnchorGravity(this.f99545e);
        this.f99543c.setFillColor(this.f99552l);
        float cornerRadius = this.f99542b.getCornerRadius();
        float f3 = this.f99553m;
        if (f3 >= cornerRadius) {
            cornerRadius = f3;
        }
        int i = this.f99545e;
        if (i == 3 || i == 5 || i == 8388611 || i == 8388613) {
            f2 = this.f99555o;
            f = this.f99554n;
            this.f99544d.setPadding(0, (int) cornerRadius, 0, 0);
        } else {
            f2 = this.f99554n;
            f = this.f99555o;
            this.f99544d.setPadding((int) cornerRadius, 0, 0, 0);
        }
        C0689b bVar = new C0689b();
        bVar.mo3901b(this.f99544d);
        bVar.mo3907d(R.id.bubble_arrow, (int) f2);
        bVar.mo3904c(R.id.bubble_arrow, (int) f);
        bVar.mo3905c(this.f99544d);
    }

    /* renamed from: b */
    public void mo141791b() {
        float cornerRadius = this.f99542b.getCornerRadius();
        float f = this.f99553m;
        if (f >= cornerRadius) {
            cornerRadius = f;
        }
        int i = this.f99545e;
        if (i == 3 || i == 5 || i == 8388611 || i == 8388613) {
            this.f99544d.setPadding(0, (int) cornerRadius, 0, 0);
        } else {
            this.f99544d.setPadding((int) cornerRadius, 0, 0, 0);
        }
    }

    public void setAnchorGravity(int i) {
        this.f99545e = i;
    }

    public void setArrowColor(int i) {
        this.f99552l = i;
    }

    public void setArrowCrossLength(float f) {
        this.f99555o = f;
    }

    public void setArrowMainLength(float f) {
        this.f99554n = f;
    }

    public void setArrowOffset(float f) {
        this.f99553m = f;
    }

    public void setCardCornerRadius(float f) {
        this.f99551k = f;
    }

    public void setCardFillColor(int i) {
        this.f99550j = i;
    }

    public void setContentView(View view) {
        this.f99542b.addView(view, -2, -2);
    }

    public BubbleLayout(Context context) {
        super(context);
        m152813c();
    }

    /* renamed from: a */
    private void m152808a(ConstraintLayout constraintLayout) {
        RoundRectLayout roundRectLayout = new RoundRectLayout(getContext());
        this.f99542b = roundRectLayout;
        roundRectLayout.setId(R.id.bubble_card);
        constraintLayout.addView(this.f99542b, new ConstraintLayout.LayoutParams(-2, -2));
    }

    /* renamed from: b */
    private void m152812b(C0689b bVar) {
        bVar.mo3882a(R.id.bubble_arrow_wrapper, 3, 0, 3);
        bVar.mo3882a(R.id.bubble_arrow_wrapper, 4, R.id.bubble_card, 3);
        bVar.mo3882a(R.id.bubble_arrow_wrapper, 6, R.id.bubble_card, 6);
        bVar.mo3882a(R.id.bubble_card, 3, R.id.bubble_arrow_wrapper, 4);
        bVar.mo3882a(R.id.bubble_card, 6, 0, 6);
        bVar.mo3882a(R.id.bubble_card, 7, 0, 7);
    }

    /* renamed from: c */
    private void m152814c(C0689b bVar) {
        bVar.mo3882a(R.id.bubble_card, 6, 0, 6);
        bVar.mo3882a(R.id.bubble_card, 3, 0, 3);
        bVar.mo3882a(R.id.bubble_card, 4, 0, 4);
        bVar.mo3882a(R.id.bubble_card, 7, R.id.bubble_arrow_wrapper, 6);
        bVar.mo3882a(R.id.bubble_arrow_wrapper, 6, R.id.bubble_card, 7);
        bVar.mo3882a(R.id.bubble_arrow_wrapper, 3, R.id.bubble_card, 3);
    }

    public void setContentView(int i) {
        this.f99542b.addView(LayoutInflater.from(getContext()).inflate(i, (ViewGroup) this.f99542b, false), -2, -2);
    }

    /* renamed from: b */
    private void m152811b(ConstraintLayout constraintLayout) {
        ArrowView arrowView = new ArrowView(getContext());
        this.f99543c = arrowView;
        arrowView.setId(R.id.bubble_arrow);
        ConstraintLayout constraintLayout2 = new ConstraintLayout(getContext());
        this.f99544d = constraintLayout2;
        constraintLayout2.setId(R.id.bubble_arrow_wrapper);
        this.f99544d.addView(this.f99543c);
        constraintLayout.addView(this.f99544d);
    }

    /* renamed from: d */
    private void m152816d(C0689b bVar) {
        bVar.mo3882a(R.id.bubble_arrow_wrapper, 6, 0, 6);
        bVar.mo3882a(R.id.bubble_arrow_wrapper, 7, R.id.bubble_card, 6);
        bVar.mo3882a(R.id.bubble_arrow_wrapper, 3, R.id.bubble_card, 3);
        bVar.mo3882a(R.id.bubble_card, 6, R.id.bubble_arrow_wrapper, 7);
        bVar.mo3882a(R.id.bubble_card, 3, 0, 3);
        bVar.mo3882a(R.id.bubble_card, 4, 0, 4);
    }

    /* renamed from: a */
    private void m152810a(C0689b bVar) {
        bVar.mo3882a(R.id.bubble_card, 3, 0, 3);
        bVar.mo3882a(R.id.bubble_card, 4, R.id.bubble_arrow_wrapper, 3);
        bVar.mo3882a(R.id.bubble_card, 6, 0, 6);
        bVar.mo3882a(R.id.bubble_arrow_wrapper, 3, R.id.bubble_card, 4);
        bVar.mo3882a(R.id.bubble_arrow_wrapper, 6, R.id.bubble_card, 6);
    }

    public BubbleLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m152813c();
    }

    /* renamed from: a */
    private void m152809a(ConstraintLayout constraintLayout, int i) {
        C0689b bVar = new C0689b();
        bVar.mo3901b(constraintLayout);
        if (i == 8388611 || i == 3) {
            m152814c(bVar);
        } else if (i == 8388613 || i == 5) {
            m152816d(bVar);
        } else if (i == 48) {
            m152810a(bVar);
        } else if (i == 80) {
            m152812b(bVar);
        }
        bVar.mo3905c(constraintLayout);
    }

    public BubbleLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m152813c();
    }
}
