package com.google.android.material.appbar;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.C0774a;
import androidx.core.p028b.C0745a;
import androidx.core.util.C0843d;
import androidx.core.view.C0883ab;
import androidx.core.view.ViewCompat;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.internal.C22327a;
import com.google.android.material.internal.C22331c;
import com.google.android.material.p980a.C22116a;
import com.larksuite.suite.R;

public class CollapsingToolbarLayout extends FrameLayout {

    /* renamed from: e */
    private static final int f53821e = 2131887304;

    /* renamed from: a */
    final C22327a f53822a;

    /* renamed from: b */
    Drawable f53823b;

    /* renamed from: c */
    int f53824c;

    /* renamed from: d */
    C0883ab f53825d;

    /* renamed from: f */
    private boolean f53826f;

    /* renamed from: g */
    private int f53827g;

    /* renamed from: h */
    private Toolbar f53828h;

    /* renamed from: i */
    private View f53829i;

    /* renamed from: j */
    private View f53830j;

    /* renamed from: k */
    private int f53831k;

    /* renamed from: l */
    private int f53832l;

    /* renamed from: m */
    private int f53833m;

    /* renamed from: n */
    private int f53834n;

    /* renamed from: o */
    private final Rect f53835o;

    /* renamed from: p */
    private boolean f53836p;

    /* renamed from: q */
    private boolean f53837q;

    /* renamed from: r */
    private Drawable f53838r;

    /* renamed from: s */
    private int f53839s;

    /* renamed from: t */
    private boolean f53840t;

    /* renamed from: u */
    private ValueAnimator f53841u;

    /* renamed from: v */
    private long f53842v;

    /* renamed from: w */
    private int f53843w;

    /* renamed from: x */
    private AppBarLayout.AbstractC22134b f53844x;

    public Drawable getContentScrim() {
        return this.f53838r;
    }

    public int getExpandedTitleMarginBottom() {
        return this.f53834n;
    }

    public int getExpandedTitleMarginEnd() {
        return this.f53833m;
    }

    public int getExpandedTitleMarginStart() {
        return this.f53831k;
    }

    public int getExpandedTitleMarginTop() {
        return this.f53832l;
    }

    /* access modifiers changed from: package-private */
    public int getScrimAlpha() {
        return this.f53839s;
    }

    public long getScrimAnimationDuration() {
        return this.f53842v;
    }

    public Drawable getStatusBarScrim() {
        return this.f53823b;
    }

    /* renamed from: e */
    private void m79763e() {
        setContentDescription(getTitle());
    }

    public int getCollapsedTitleGravity() {
        return this.f53822a.mo77796f();
    }

    public Typeface getCollapsedTitleTypeface() {
        return this.f53822a.mo77797g();
    }

    public int getExpandedTitleGravity() {
        return this.f53822a.mo77794e();
    }

    public Typeface getExpandedTitleTypeface() {
        return this.f53822a.mo77798h();
    }

    public int getMaxLines() {
        return this.f53822a.mo77804n();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -1);
    }

    public CharSequence getTitle() {
        if (this.f53836p) {
            return this.f53822a.mo77803m();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        ViewParent parent = getParent();
        AppBarLayout.AbstractC22134b bVar = this.f53844x;
        if (bVar != null && (parent instanceof AppBarLayout)) {
            ((AppBarLayout) parent).removeOnOffsetChangedListener(bVar);
        }
        super.onDetachedFromWindow();
    }

    /* renamed from: d */
    private void m79761d() {
        View view;
        if (!this.f53836p && (view = this.f53830j) != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f53830j);
            }
        }
        if (this.f53836p && this.f53828h != null) {
            if (this.f53830j == null) {
                this.f53830j = new View(getContext());
            }
            if (this.f53830j.getParent() == null) {
                this.f53828h.addView(this.f53830j, -1, -1);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo76404b() {
        boolean z;
        if (this.f53838r != null || this.f53823b != null) {
            if (getHeight() + this.f53824c < getScrimVisibleHeightTrigger()) {
                z = true;
            } else {
                z = false;
            }
            setScrimsShown(z);
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f53823b;
        boolean z = false;
        if (drawable != null && drawable.isStateful()) {
            z = false | drawable.setState(drawableState);
        }
        Drawable drawable2 = this.f53838r;
        if (drawable2 != null && drawable2.isStateful()) {
            z |= drawable2.setState(drawableState);
        }
        C22327a aVar = this.f53822a;
        if (aVar != null) {
            z |= aVar.mo77780a(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    public int getScrimVisibleHeightTrigger() {
        int i;
        int i2 = this.f53843w;
        if (i2 >= 0) {
            return i2;
        }
        C0883ab abVar = this.f53825d;
        if (abVar != null) {
            i = abVar.mo4644b();
        } else {
            i = 0;
        }
        int q = ViewCompat.m4102q(this);
        if (q > 0) {
            return Math.min((q * 2) + i, getHeight());
        }
        return getHeight() / 3;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            ViewCompat.m4059b(this, ViewCompat.m4109x((View) parent));
            if (this.f53844x == null) {
                this.f53844x = new C22137a();
            }
            ((AppBarLayout) parent).addOnOffsetChangedListener(this.f53844x);
            ViewCompat.m4108w(this);
        }
    }

    /* renamed from: c */
    private void m79758c() {
        if (this.f53826f) {
            Toolbar toolbar = null;
            this.f53828h = null;
            this.f53829i = null;
            int i = this.f53827g;
            if (i != -1) {
                Toolbar toolbar2 = (Toolbar) findViewById(i);
                this.f53828h = toolbar2;
                if (toolbar2 != null) {
                    this.f53829i = m79760d(toolbar2);
                }
            }
            if (this.f53828h == null) {
                int childCount = getChildCount();
                int i2 = 0;
                while (true) {
                    if (i2 >= childCount) {
                        break;
                    }
                    View childAt = getChildAt(i2);
                    if (childAt instanceof Toolbar) {
                        toolbar = (Toolbar) childAt;
                        break;
                    }
                    i2++;
                }
                this.f53828h = toolbar;
            }
            m79761d();
            this.f53826f = false;
        }
    }

    public static class LayoutParams extends FrameLayout.LayoutParams {

        /* renamed from: a */
        int f53847a;

        /* renamed from: b */
        float f53848b = 0.5f;

        /* renamed from: a */
        public void mo76462a(float f) {
            this.f53848b = f;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.layout_collapseMode, R.attr.layout_collapseParallaxMultiplier});
            this.f53847a = obtainStyledAttributes.getInt(0, 0);
            mo76462a(obtainStyledAttributes.getFloat(1, 0.5f));
            obtainStyledAttributes.recycle();
        }
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    public void setScrimAnimationDuration(long j) {
        this.f53842v = j;
    }

    /* renamed from: com.google.android.material.appbar.CollapsingToolbarLayout$a */
    private class C22137a implements AppBarLayout.AbstractC22134b {
        C22137a() {
        }

        @Override // com.google.android.material.appbar.AppBarLayout.AbstractC22133a
        public void onOffsetChanged(AppBarLayout appBarLayout, int i) {
            int i2;
            CollapsingToolbarLayout.this.f53824c = i;
            if (CollapsingToolbarLayout.this.f53825d != null) {
                i2 = CollapsingToolbarLayout.this.f53825d.mo4644b();
            } else {
                i2 = 0;
            }
            int childCount = CollapsingToolbarLayout.this.getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = CollapsingToolbarLayout.this.getChildAt(i3);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                C22139a a = CollapsingToolbarLayout.m79756a(childAt);
                int i4 = layoutParams.f53847a;
                if (i4 == 1) {
                    a.mo76477a(C0745a.m3627a(-i, 0, CollapsingToolbarLayout.this.mo76403b(childAt)));
                } else if (i4 == 2) {
                    a.mo76477a(Math.round(((float) (-i)) * layoutParams.f53848b));
                }
            }
            CollapsingToolbarLayout.this.mo76404b();
            if (CollapsingToolbarLayout.this.f53823b != null && i2 > 0) {
                ViewCompat.m4073e(CollapsingToolbarLayout.this);
            }
            CollapsingToolbarLayout.this.f53822a.mo77782b(((float) Math.abs(i)) / ((float) ((CollapsingToolbarLayout.this.getHeight() - ViewCompat.m4102q(CollapsingToolbarLayout.this)) - i2)));
        }
    }

    public CollapsingToolbarLayout(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public FrameLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    public void setCollapsedTitleGravity(int i) {
        this.f53822a.mo77783b(i);
    }

    public void setCollapsedTitleTextAppearance(int i) {
        this.f53822a.mo77790c(i);
    }

    public void setCollapsedTitleTextColor(int i) {
        setCollapsedTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setCollapsedTitleTypeface(Typeface typeface) {
        this.f53822a.mo77778a(typeface);
    }

    public void setExpandedTitleColor(int i) {
        setExpandedTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setExpandedTitleGravity(int i) {
        this.f53822a.mo77771a(i);
    }

    public void setExpandedTitleMarginBottom(int i) {
        this.f53834n = i;
        requestLayout();
    }

    public void setExpandedTitleMarginEnd(int i) {
        this.f53833m = i;
        requestLayout();
    }

    public void setExpandedTitleMarginStart(int i) {
        this.f53831k = i;
        requestLayout();
    }

    public void setExpandedTitleMarginTop(int i) {
        this.f53832l = i;
        requestLayout();
    }

    public void setExpandedTitleTextAppearance(int i) {
        this.f53822a.mo77793d(i);
    }

    public void setExpandedTitleTextColor(ColorStateList colorStateList) {
        this.f53822a.mo77786b(colorStateList);
    }

    public void setExpandedTitleTypeface(Typeface typeface) {
        this.f53822a.mo77788b(typeface);
    }

    public void setMaxLines(int i) {
        this.f53822a.mo77795e(i);
    }

    public void setCollapsedTitleTextColor(ColorStateList colorStateList) {
        this.f53822a.mo77774a(colorStateList);
    }

    public void setContentScrimColor(int i) {
        setContentScrim(new ColorDrawable(i));
    }

    public void setContentScrimResource(int i) {
        setContentScrim(ContextCompat.getDrawable(getContext(), i));
    }

    public void setScrimVisibleHeightTrigger(int i) {
        if (this.f53843w != i) {
            this.f53843w = i;
            mo76404b();
        }
    }

    public void setStatusBarScrimColor(int i) {
        setStatusBarScrim(new ColorDrawable(i));
    }

    public void setStatusBarScrimResource(int i) {
        setStatusBarScrim(ContextCompat.getDrawable(getContext(), i));
    }

    public void setTitle(CharSequence charSequence) {
        this.f53822a.mo77779a(charSequence);
        m79763e();
    }

    public void setTitleEnabled(boolean z) {
        if (z != this.f53836p) {
            this.f53836p = z;
            m79763e();
            m79761d();
            requestLayout();
        }
    }

    /* renamed from: a */
    static C22139a m79756a(View view) {
        C22139a aVar = (C22139a) view.getTag(R.id.view_offset_helper);
        if (aVar != null) {
            return aVar;
        }
        C22139a aVar2 = new C22139a(view);
        view.setTag(R.id.view_offset_helper, aVar2);
        return aVar2;
    }

    /* renamed from: c */
    private boolean m79759c(View view) {
        View view2 = this.f53829i;
        if (view2 == null || view2 == this) {
            if (view == this.f53828h) {
                return true;
            }
        } else if (view == view2) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    private View m79760d(View view) {
        ViewParent parent = view.getParent();
        while (parent != this && parent != null) {
            if (parent instanceof View) {
                view = (View) parent;
            }
            parent = parent.getParent();
        }
        return view;
    }

    /* renamed from: e */
    private static int m79762e(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return view.getHeight();
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return view.getHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final int mo76403b(View view) {
        return ((getHeight() - m79756a(view).mo76483e()) - view.getHeight()) - ((LayoutParams) view.getLayoutParams()).bottomMargin;
    }

    @Override // android.widget.FrameLayout, android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* access modifiers changed from: package-private */
    public void setScrimAlpha(int i) {
        Toolbar toolbar;
        if (i != this.f53839s) {
            if (!(this.f53838r == null || (toolbar = this.f53828h) == null)) {
                ViewCompat.m4073e(toolbar);
            }
            this.f53839s = i;
            ViewCompat.m4073e(this);
        }
    }

    public void setScrimsShown(boolean z) {
        boolean z2;
        if (!ViewCompat.m4012F(this) || isInEditMode()) {
            z2 = false;
        } else {
            z2 = true;
        }
        mo76402a(z, z2);
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        if (super.verifyDrawable(drawable) || drawable == this.f53838r || drawable == this.f53823b) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0883ab mo76400a(C0883ab abVar) {
        C0883ab abVar2;
        if (ViewCompat.m4109x(this)) {
            abVar2 = abVar;
        } else {
            abVar2 = null;
        }
        if (!C0843d.m3987a(this.f53825d, abVar2)) {
            this.f53825d = abVar2;
            requestLayout();
        }
        return abVar.mo4651g();
    }

    public void setContentScrim(Drawable drawable) {
        Drawable drawable2 = this.f53838r;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.f53838r = drawable3;
            if (drawable3 != null) {
                drawable3.setBounds(0, 0, getWidth(), getHeight());
                this.f53838r.setCallback(this);
                this.f53838r.setAlpha(this.f53839s);
            }
            ViewCompat.m4073e(this);
        }
    }

    public void setVisibility(int i) {
        boolean z;
        super.setVisibility(i);
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        Drawable drawable = this.f53823b;
        if (!(drawable == null || drawable.isVisible() == z)) {
            this.f53823b.setVisible(z, false);
        }
        Drawable drawable2 = this.f53838r;
        if (drawable2 != null && drawable2.isVisible() != z) {
            this.f53838r.setVisible(z, false);
        }
    }

    /* renamed from: a */
    private void m79757a(int i) {
        TimeInterpolator timeInterpolator;
        m79758c();
        ValueAnimator valueAnimator = this.f53841u;
        if (valueAnimator == null) {
            ValueAnimator valueAnimator2 = new ValueAnimator();
            this.f53841u = valueAnimator2;
            valueAnimator2.setDuration(this.f53842v);
            ValueAnimator valueAnimator3 = this.f53841u;
            if (i > this.f53839s) {
                timeInterpolator = C22116a.f53781c;
            } else {
                timeInterpolator = C22116a.f53782d;
            }
            valueAnimator3.setInterpolator(timeInterpolator);
            this.f53841u.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                /* class com.google.android.material.appbar.CollapsingToolbarLayout.C221362 */

                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    CollapsingToolbarLayout.this.setScrimAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
                }
            });
        } else if (valueAnimator.isRunning()) {
            this.f53841u.cancel();
        }
        this.f53841u.setIntValues(this.f53839s, i);
        this.f53841u.start();
    }

    public void draw(Canvas canvas) {
        int i;
        Drawable drawable;
        super.draw(canvas);
        m79758c();
        if (this.f53828h == null && (drawable = this.f53838r) != null && this.f53839s > 0) {
            drawable.mutate().setAlpha(this.f53839s);
            this.f53838r.draw(canvas);
        }
        if (this.f53836p && this.f53837q) {
            this.f53822a.mo77775a(canvas);
        }
        if (this.f53823b != null && this.f53839s > 0) {
            C0883ab abVar = this.f53825d;
            if (abVar != null) {
                i = abVar.mo4644b();
            } else {
                i = 0;
            }
            if (i > 0) {
                this.f53823b.setBounds(0, -this.f53824c, getWidth(), i - this.f53824c);
                this.f53823b.mutate().setAlpha(this.f53839s);
                this.f53823b.draw(canvas);
            }
        }
    }

    public void setStatusBarScrim(Drawable drawable) {
        boolean z;
        Drawable drawable2 = this.f53823b;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.f53823b = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.f53823b.setState(getDrawableState());
                }
                C0774a.m3774b(this.f53823b, ViewCompat.m4082h(this));
                Drawable drawable4 = this.f53823b;
                if (getVisibility() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                drawable4.setVisible(z, false);
                this.f53823b.setCallback(this);
                this.f53823b.setAlpha(this.f53839s);
            }
            ViewCompat.m4073e(this);
        }
    }

    public CollapsingToolbarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        m79758c();
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        C0883ab abVar = this.f53825d;
        if (abVar != null) {
            i3 = abVar.mo4644b();
        } else {
            i3 = 0;
        }
        if (mode == 0 && i3 > 0) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + i3, 1073741824));
        }
    }

    /* renamed from: a */
    public void mo76402a(boolean z, boolean z2) {
        if (this.f53840t != z) {
            int i = 255;
            if (z2) {
                if (!z) {
                    i = 0;
                }
                m79757a(i);
            } else {
                if (!z) {
                    i = 0;
                }
                setScrimAlpha(i);
            }
            this.f53840t = z;
        }
    }

    /* access modifiers changed from: protected */
    public boolean drawChild(Canvas canvas, View view, long j) {
        boolean z;
        if (this.f53838r == null || this.f53839s <= 0 || !m79759c(view)) {
            z = false;
        } else {
            this.f53838r.mutate().setAlpha(this.f53839s);
            this.f53838r.draw(canvas);
            z = true;
        }
        if (super.drawChild(canvas, view, j) || z) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public CollapsingToolbarLayout(android.content.Context r10, android.util.AttributeSet r11, int r12) {
        /*
        // Method dump skipped, instructions count: 310
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.CollapsingToolbarLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        Drawable drawable = this.f53838r;
        if (drawable != null) {
            drawable.setBounds(0, 0, i, i2);
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View view;
        boolean z2;
        int i5;
        int i6;
        int i7;
        int i8;
        super.onLayout(z, i, i2, i3, i4);
        C0883ab abVar = this.f53825d;
        if (abVar != null) {
            int b = abVar.mo4644b();
            int childCount = getChildCount();
            for (int i9 = 0; i9 < childCount; i9++) {
                View childAt = getChildAt(i9);
                if (!ViewCompat.m4109x(childAt) && childAt.getTop() < b) {
                    ViewCompat.m4087i(childAt, b);
                }
            }
        }
        int childCount2 = getChildCount();
        for (int i10 = 0; i10 < childCount2; i10++) {
            m79756a(getChildAt(i10)).mo76475a();
        }
        if (this.f53836p && (view = this.f53830j) != null) {
            boolean z3 = true;
            if (!ViewCompat.m4015I(view) || this.f53830j.getVisibility() != 0) {
                z2 = false;
            } else {
                z2 = true;
            }
            this.f53837q = z2;
            if (z2) {
                if (ViewCompat.m4082h(this) != 1) {
                    z3 = false;
                }
                View view2 = this.f53829i;
                if (view2 == null) {
                    view2 = this.f53828h;
                }
                int b2 = mo76403b(view2);
                C22331c.m80913b(this, this.f53830j, this.f53835o);
                C22327a aVar = this.f53822a;
                int i11 = this.f53835o.left;
                if (z3) {
                    i5 = this.f53828h.getTitleMarginEnd();
                } else {
                    i5 = this.f53828h.getTitleMarginStart();
                }
                int i12 = i11 + i5;
                int titleMarginTop = this.f53835o.top + b2 + this.f53828h.getTitleMarginTop();
                int i13 = this.f53835o.right;
                if (z3) {
                    i6 = this.f53828h.getTitleMarginStart();
                } else {
                    i6 = this.f53828h.getTitleMarginEnd();
                }
                aVar.mo77784b(i12, titleMarginTop, i13 - i6, (this.f53835o.bottom + b2) - this.f53828h.getTitleMarginBottom());
                C22327a aVar2 = this.f53822a;
                if (z3) {
                    i7 = this.f53833m;
                } else {
                    i7 = this.f53831k;
                }
                int i14 = this.f53835o.top + this.f53832l;
                int i15 = i3 - i;
                if (z3) {
                    i8 = this.f53831k;
                } else {
                    i8 = this.f53833m;
                }
                aVar2.mo77772a(i7, i14, i15 - i8, (i4 - i2) - this.f53834n);
                this.f53822a.mo77802l();
            }
        }
        if (this.f53828h != null) {
            if (this.f53836p && TextUtils.isEmpty(this.f53822a.mo77803m())) {
                setTitle(this.f53828h.getTitle());
            }
            View view3 = this.f53829i;
            if (view3 == null || view3 == this) {
                setMinimumHeight(m79762e(this.f53828h));
            } else {
                setMinimumHeight(m79762e(view3));
            }
        }
        mo76404b();
        int childCount3 = getChildCount();
        for (int i16 = 0; i16 < childCount3; i16++) {
            m79756a(getChildAt(i16)).mo76478b();
        }
    }
}
