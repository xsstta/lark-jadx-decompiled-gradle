package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.C0445f;
import androidx.appcompat.widget.C0448h;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.drawable.C0774a;
import androidx.core.util.C0845f;
import androidx.core.view.AbstractC0915q;
import androidx.core.view.ViewCompat;
import androidx.core.widget.AbstractC0950m;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.floatingactionbutton.C22290d;
import com.google.android.material.internal.C22331c;
import com.google.android.material.internal.VisibilityAwareImageButton;
import com.google.android.material.p980a.AbstractC22126k;
import com.google.android.material.p980a.C22123h;
import com.google.android.material.p986g.AbstractC22306a;
import com.google.android.material.p986g.C22308c;
import com.google.android.material.p990k.AbstractC22377b;
import com.google.android.material.shape.AbstractC22413o;
import com.google.android.material.shape.C22398l;
import com.google.android.material.stateful.ExtendableSavedState;
import com.larksuite.suite.R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;

public class FloatingActionButton extends VisibilityAwareImageButton implements CoordinatorLayout.AbstractC0701a, AbstractC0915q, AbstractC0950m, AbstractC22306a, AbstractC22413o {

    /* renamed from: d */
    private static final int f54481d = 2131887305;

    /* renamed from: a */
    public int f54482a;

    /* renamed from: b */
    boolean f54483b;

    /* renamed from: c */
    final Rect f54484c;

    /* renamed from: e */
    private ColorStateList f54485e;

    /* renamed from: f */
    private PorterDuff.Mode f54486f;

    /* renamed from: g */
    private ColorStateList f54487g;

    /* renamed from: h */
    private PorterDuff.Mode f54488h;

    /* renamed from: i */
    private ColorStateList f54489i;

    /* renamed from: j */
    private int f54490j;

    /* renamed from: k */
    private int f54491k;

    /* renamed from: l */
    private int f54492l;

    /* renamed from: m */
    private int f54493m;

    /* renamed from: n */
    private final Rect f54494n;

    /* renamed from: o */
    private final C0448h f54495o;

    /* renamed from: p */
    private final C22308c f54496p;

    /* renamed from: q */
    private C22290d f54497q;

    @Retention(RetentionPolicy.SOURCE)
    public @interface Size {
    }

    /* renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$a */
    public static abstract class AbstractC22282a {
        /* renamed from: a */
        public void mo76568a(FloatingActionButton floatingActionButton) {
        }

        /* renamed from: b */
        public void mo76569b(FloatingActionButton floatingActionButton) {
        }
    }

    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior, com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        public /* bridge */ /* synthetic */ void onAttachedToLayoutParams(CoordinatorLayout.LayoutParams layoutParams) {
            super.onAttachedToLayoutParams(layoutParams);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        /* renamed from: a */
        public /* bridge */ /* synthetic */ boolean mo77566a(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, int i) {
            return super.onLayoutChild(coordinatorLayout, floatingActionButton, i);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        /* renamed from: a */
        public /* bridge */ /* synthetic */ boolean mo77567a(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, Rect rect) {
            return super.getInsetDodgeRect(coordinatorLayout, floatingActionButton, rect);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        /* renamed from: a */
        public /* bridge */ /* synthetic */ boolean mo77568a(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, View view) {
            return super.onDependentViewChanged(coordinatorLayout, floatingActionButton, view);
        }
    }

    public ColorStateList getBackgroundTintList() {
        return this.f54485e;
    }

    public PorterDuff.Mode getBackgroundTintMode() {
        return this.f54486f;
    }

    public int getCustomSize() {
        return this.f54492l;
    }

    public ColorStateList getRippleColorStateList() {
        return this.f54489i;
    }

    public int getSize() {
        return this.f54491k;
    }

    @Override // androidx.core.widget.AbstractC0950m
    public ColorStateList getSupportImageTintList() {
        return this.f54487g;
    }

    @Override // androidx.core.widget.AbstractC0950m
    public PorterDuff.Mode getSupportImageTintMode() {
        return this.f54488h;
    }

    public boolean getUseCompatPadding() {
        return this.f54483b;
    }

    protected static class BaseBehavior<T extends FloatingActionButton> extends CoordinatorLayout.Behavior<T> {

        /* renamed from: a */
        private Rect f54500a;

        /* renamed from: b */
        private AbstractC22282a f54501b;

        /* renamed from: c */
        private boolean f54502c;

        public BaseBehavior() {
            this.f54502c = true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public void onAttachedToLayoutParams(CoordinatorLayout.LayoutParams layoutParams) {
            if (layoutParams.dodgeInsetEdges == 0) {
                layoutParams.dodgeInsetEdges = 80;
            }
        }

        /* renamed from: a */
        private static boolean m80644a(View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.LayoutParams) {
                return ((CoordinatorLayout.LayoutParams) layoutParams).getBehavior() instanceof BottomSheetBehavior;
            }
            return false;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.behavior_autoHide});
            this.f54502c = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
        }

        /* renamed from: a */
        private boolean m80645a(View view, FloatingActionButton floatingActionButton) {
            CoordinatorLayout.LayoutParams layoutParams = (CoordinatorLayout.LayoutParams) floatingActionButton.getLayoutParams();
            if (this.f54502c && layoutParams.getAnchorId() == view.getId() && floatingActionButton.getUserSetVisibility() == 0) {
                return true;
            }
            return false;
        }

        /* renamed from: b */
        private boolean m80647b(View view, FloatingActionButton floatingActionButton) {
            if (!m80645a(view, floatingActionButton)) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((CoordinatorLayout.LayoutParams) floatingActionButton.getLayoutParams()).topMargin) {
                floatingActionButton.mo77506b(this.f54501b, false);
                return true;
            }
            floatingActionButton.mo77500a(this.f54501b, false);
            return true;
        }

        /* renamed from: a */
        private void m80643a(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton) {
            int i;
            Rect rect = floatingActionButton.f54484c;
            if (rect != null && rect.centerX() > 0 && rect.centerY() > 0) {
                CoordinatorLayout.LayoutParams layoutParams = (CoordinatorLayout.LayoutParams) floatingActionButton.getLayoutParams();
                int i2 = 0;
                if (floatingActionButton.getRight() >= coordinatorLayout.getWidth() - layoutParams.rightMargin) {
                    i = rect.right;
                } else if (floatingActionButton.getLeft() <= layoutParams.leftMargin) {
                    i = -rect.left;
                } else {
                    i = 0;
                }
                if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - layoutParams.bottomMargin) {
                    i2 = rect.bottom;
                } else if (floatingActionButton.getTop() <= layoutParams.topMargin) {
                    i2 = -rect.top;
                }
                if (i2 != 0) {
                    ViewCompat.m4087i((View) floatingActionButton, i2);
                }
                if (i != 0) {
                    ViewCompat.m4089j((View) floatingActionButton, i);
                }
            }
        }

        /* renamed from: a */
        private boolean m80646a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            if (!m80645a(appBarLayout, floatingActionButton)) {
                return false;
            }
            if (this.f54500a == null) {
                this.f54500a = new Rect();
            }
            Rect rect = this.f54500a;
            C22331c.m80913b(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                floatingActionButton.mo77506b(this.f54501b, false);
                return true;
            }
            floatingActionButton.mo77500a(this.f54501b, false);
            return true;
        }

        /* renamed from: a */
        public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, int i) {
            List<View> c = coordinatorLayout.mo3950c(floatingActionButton);
            int size = c.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view = c.get(i2);
                if (!(view instanceof AppBarLayout)) {
                    if (m80644a(view) && m80647b(view, floatingActionButton)) {
                        break;
                    }
                } else if (m80646a(coordinatorLayout, (AppBarLayout) view, floatingActionButton)) {
                    break;
                }
            }
            coordinatorLayout.mo3939a(floatingActionButton, i);
            m80643a(coordinatorLayout, floatingActionButton);
            return true;
        }

        /* renamed from: a */
        public boolean getInsetDodgeRect(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, Rect rect) {
            Rect rect2 = floatingActionButton.f54484c;
            rect.set(floatingActionButton.getLeft() + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return true;
        }

        /* renamed from: a */
        public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                m80646a(coordinatorLayout, (AppBarLayout) view, floatingActionButton);
                return false;
            } else if (!m80644a(view)) {
                return false;
            } else {
                m80647b(view, floatingActionButton);
                return false;
            }
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$c */
    class C22284c<T extends FloatingActionButton> implements C22290d.AbstractC22299d {

        /* renamed from: b */
        private final AbstractC22126k<T> f54505b;

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.google.android.material.a.k<T extends com.google.android.material.floatingactionbutton.FloatingActionButton> */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.material.floatingactionbutton.C22290d.AbstractC22299d
        /* renamed from: a */
        public void mo77572a() {
            this.f54505b.mo76308a(FloatingActionButton.this);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.google.android.material.a.k<T extends com.google.android.material.floatingactionbutton.FloatingActionButton> */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.material.floatingactionbutton.C22290d.AbstractC22299d
        /* renamed from: b */
        public void mo77573b() {
            this.f54505b.mo76309b(FloatingActionButton.this);
        }

        public int hashCode() {
            return this.f54505b.hashCode();
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C22284c) || !((C22284c) obj).f54505b.equals(this.f54505b)) {
                return false;
            }
            return true;
        }

        C22284c(AbstractC22126k<T> kVar) {
            this.f54505b = kVar;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0701a
    public CoordinatorLayout.Behavior<FloatingActionButton> getBehavior() {
        return new Behavior();
    }

    public int getExpandedComponentIdHint() {
        return this.f54496p.mo77666c();
    }

    /* access modifiers changed from: package-private */
    public int getSizeDimension() {
        return m80622a(this.f54491k);
    }

    @Override // androidx.core.view.AbstractC0915q
    public ColorStateList getSupportBackgroundTintList() {
        return getBackgroundTintList();
    }

    @Override // androidx.core.view.AbstractC0915q
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return getBackgroundTintMode();
    }

    /* access modifiers changed from: private */
    /* renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$b */
    public class C22283b implements AbstractC22377b {
        @Override // com.google.android.material.p990k.AbstractC22377b
        /* renamed from: a */
        public boolean mo77571a() {
            return FloatingActionButton.this.f54483b;
        }

        C22283b() {
        }

        @Override // com.google.android.material.p990k.AbstractC22377b
        /* renamed from: a */
        public void mo77570a(Drawable drawable) {
            if (drawable != null) {
                FloatingActionButton.super.setBackgroundDrawable(drawable);
            }
        }

        @Override // com.google.android.material.p990k.AbstractC22377b
        /* renamed from: a */
        public void mo77569a(int i, int i2, int i3, int i4) {
            FloatingActionButton.this.f54484c.set(i, i2, i3, i4);
            FloatingActionButton floatingActionButton = FloatingActionButton.this;
            floatingActionButton.setPadding(i + floatingActionButton.f54482a, i2 + FloatingActionButton.this.f54482a, i3 + FloatingActionButton.this.f54482a, i4 + FloatingActionButton.this.f54482a);
        }
    }

    private C22290d getImpl() {
        if (this.f54497q == null) {
            this.f54497q = m80628e();
        }
        return this.f54497q;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        getImpl().mo77615a(getDrawableState());
    }

    public float getCompatElevation() {
        return getImpl().mo77601a();
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return getImpl().mo77616b();
    }

    public float getCompatPressedTranslationZ() {
        return getImpl().mo77625c();
    }

    public Drawable getContentBackground() {
        return getImpl().mo77638m();
    }

    public C22123h getHideMotionSpec() {
        return getImpl().mo77632g();
    }

    public int getRippleColor() {
        ColorStateList colorStateList = this.f54489i;
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    @Override // com.google.android.material.shape.AbstractC22413o
    public C22398l getShapeAppearanceModel() {
        return (C22398l) C0845f.m3991a(getImpl().mo77629e());
    }

    public C22123h getShowMotionSpec() {
        return getImpl().mo77631f();
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        getImpl().mo77635j();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getImpl().mo77642q();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getImpl().mo77643r();
    }

    /* renamed from: e */
    private C22290d m80628e() {
        if (Build.VERSION.SDK_INT >= 21) {
            return new C22303e(this, new C22283b());
        }
        return new C22290d(this, new C22283b());
    }

    /* renamed from: c */
    public boolean mo77508c() {
        return getImpl().mo77647v();
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        if (onSaveInstanceState == null) {
            onSaveInstanceState = new Bundle();
        }
        ExtendableSavedState extendableSavedState = new ExtendableSavedState(onSaveInstanceState);
        extendableSavedState.f55106a.put("expandableWidgetHelper", this.f54496p.mo77665b());
        return extendableSavedState;
    }

    /* renamed from: d */
    private void m80627d() {
        Drawable drawable = getDrawable();
        if (drawable != null) {
            ColorStateList colorStateList = this.f54487g;
            if (colorStateList == null) {
                C0774a.m3778f(drawable);
                return;
            }
            int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
            PorterDuff.Mode mode = this.f54488h;
            if (mode == null) {
                mode = PorterDuff.Mode.SRC_IN;
            }
            drawable.mutate().setColorFilter(C0445f.m1907a(colorForState, mode));
        }
    }

    /* renamed from: b */
    public boolean mo77507b() {
        return getImpl().mo77648w();
    }

    @Override // com.google.android.material.p986g.AbstractC22307b
    /* renamed from: a */
    public boolean mo77501a() {
        return this.f54496p.mo77664a();
    }

    @Override // androidx.core.view.AbstractC0915q
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    @Override // androidx.core.view.AbstractC0915q
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        setBackgroundTintMode(mode);
    }

    @Override // com.google.android.material.internal.VisibilityAwareImageButton
    public void setVisibility(int i) {
        super.setVisibility(i);
    }

    public FloatingActionButton(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public void mo77497a(Animator.AnimatorListener animatorListener) {
        getImpl().mo77605a(animatorListener);
    }

    /* renamed from: b */
    public void mo77503b(Animator.AnimatorListener animatorListener) {
        getImpl().mo77619b(animatorListener);
    }

    public void setBackgroundColor(int i) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    public void setBackgroundDrawable(Drawable drawable) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    public void setBackgroundResource(int i) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    public void setCompatElevation(float f) {
        getImpl().mo77602a(f);
    }

    public void setCompatHoveredFocusedTranslationZ(float f) {
        getImpl().mo77617b(f);
    }

    public void setCompatPressedTranslationZ(float f) {
        getImpl().mo77626c(f);
    }

    public void setExpandedComponentIdHint(int i) {
        this.f54496p.mo77662a(i);
    }

    public void setHideMotionSpec(C22123h hVar) {
        getImpl().mo77622b(hVar);
    }

    public void setRippleColor(int i) {
        setRippleColor(ColorStateList.valueOf(i));
    }

    public void setShadowPaddingEnabled(boolean z) {
        getImpl().mo77624b(z);
    }

    @Override // com.google.android.material.shape.AbstractC22413o
    public void setShapeAppearanceModel(C22398l lVar) {
        getImpl().mo77613a(lVar);
    }

    public void setShowMotionSpec(C22123h hVar) {
        getImpl().mo77610a(hVar);
    }

    /* renamed from: c */
    private C22290d.AbstractC22300e m80625c(final AbstractC22282a aVar) {
        if (aVar == null) {
            return null;
        }
        return new C22290d.AbstractC22300e() {
            /* class com.google.android.material.floatingactionbutton.FloatingActionButton.C222811 */

            @Override // com.google.android.material.floatingactionbutton.C22290d.AbstractC22300e
            /* renamed from: a */
            public void mo77564a() {
                aVar.mo76569b(FloatingActionButton.this);
            }

            @Override // com.google.android.material.floatingactionbutton.C22290d.AbstractC22300e
            /* renamed from: b */
            public void mo77565b() {
                aVar.mo76568a(FloatingActionButton.this);
            }
        };
    }

    /* renamed from: a */
    public void mo77498a(AbstractC22126k<? extends FloatingActionButton> kVar) {
        getImpl().mo77611a(new C22284c(kVar));
    }

    /* renamed from: b */
    public void mo77504b(Rect rect) {
        rect.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
        m80626c(rect);
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.f54485e != colorStateList) {
            this.f54485e = colorStateList;
            getImpl().mo77606a(colorStateList);
        }
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.f54486f != mode) {
            this.f54486f = mode;
            getImpl().mo77608a(mode);
        }
    }

    public void setCompatElevationResource(int i) {
        setCompatElevation(getResources().getDimension(i));
    }

    public void setCompatHoveredFocusedTranslationZResource(int i) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i));
    }

    public void setCompatPressedTranslationZResource(int i) {
        setCompatPressedTranslationZ(getResources().getDimension(i));
    }

    public void setElevation(float f) {
        super.setElevation(f);
        getImpl().mo77630e(f);
    }

    public void setHideMotionSpecResource(int i) {
        setHideMotionSpec(C22123h.m79717a(getContext(), i));
    }

    public void setImageResource(int i) {
        this.f54495o.mo2596a(i);
        m80627d();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (this.f54489i != colorStateList) {
            this.f54489i = colorStateList;
            getImpl().mo77620b(this.f54489i);
        }
    }

    public void setScaleX(float f) {
        super.setScaleX(f);
        getImpl().mo77637l();
    }

    public void setScaleY(float f) {
        super.setScaleY(f);
        getImpl().mo77637l();
    }

    public void setShowMotionSpecResource(int i) {
        setShowMotionSpec(C22123h.m79717a(getContext(), i));
    }

    public void setSize(int i) {
        this.f54492l = 0;
        if (i != this.f54491k) {
            this.f54491k = i;
            requestLayout();
        }
    }

    @Override // androidx.core.widget.AbstractC0950m
    public void setSupportImageTintList(ColorStateList colorStateList) {
        if (this.f54487g != colorStateList) {
            this.f54487g = colorStateList;
            m80627d();
        }
    }

    @Override // androidx.core.widget.AbstractC0950m
    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        if (this.f54488h != mode) {
            this.f54488h = mode;
            m80627d();
        }
    }

    public void setTranslationX(float f) {
        super.setTranslationX(f);
        getImpl().mo77636k();
    }

    public void setTranslationY(float f) {
        super.setTranslationY(f);
        getImpl().mo77636k();
    }

    public void setTranslationZ(float f) {
        super.setTranslationZ(f);
        getImpl().mo77636k();
    }

    public void setUseCompatPadding(boolean z) {
        if (this.f54483b != z) {
            this.f54483b = z;
            getImpl().mo77639n();
        }
    }

    /* renamed from: b */
    public void mo77505b(AbstractC22282a aVar) {
        mo77506b(aVar, true);
    }

    public void setCustomSize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Custom size must be non-negative");
        } else if (i != this.f54492l) {
            this.f54492l = i;
            requestLayout();
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        if (z != getImpl().mo77634i()) {
            getImpl().mo77614a(z);
            requestLayout();
        }
    }

    public void setImageDrawable(Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            getImpl().mo77627d();
            if (this.f54487g != null) {
                m80627d();
            }
        }
    }

    /* renamed from: a */
    private int m80622a(int i) {
        int i2 = this.f54492l;
        if (i2 != 0) {
            return i2;
        }
        Resources resources = getResources();
        if (i != -1) {
            if (i != 1) {
                return resources.getDimensionPixelSize(R.dimen.design_fab_size_normal);
            }
            return resources.getDimensionPixelSize(R.dimen.design_fab_size_mini);
        } else if (Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470) {
            return m80622a(1);
        } else {
            return m80622a(0);
        }
    }

    /* renamed from: c */
    private void m80626c(Rect rect) {
        rect.left += this.f54484c.left;
        rect.top += this.f54484c.top;
        rect.right -= this.f54484c.right;
        rect.bottom -= this.f54484c.bottom;
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof ExtendableSavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ExtendableSavedState extendableSavedState = (ExtendableSavedState) parcelable;
        super.onRestoreInstanceState(extendableSavedState.mo4902a());
        this.f54496p.mo77663a((Bundle) C0845f.m3991a(extendableSavedState.f55106a.get("expandableWidgetHelper")));
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0 || !mo77502a(this.f54494n) || this.f54494n.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    /* renamed from: a */
    public void mo77499a(AbstractC22282a aVar) {
        mo77500a(aVar, true);
    }

    /* renamed from: a */
    public boolean mo77502a(Rect rect) {
        if (!ViewCompat.m4012F(this)) {
            return false;
        }
        rect.set(0, 0, getWidth(), getHeight());
        m80626c(rect);
        return true;
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.floatingActionButtonStyle);
    }

    /* renamed from: a */
    private static int m80623a(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode == Integer.MIN_VALUE) {
            return Math.min(i, size);
        }
        if (mode == 0) {
            return i;
        }
        if (mode == 1073741824) {
            return size;
        }
        throw new IllegalArgumentException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo77506b(AbstractC22282a aVar, boolean z) {
        getImpl().mo77612a(m80625c(aVar), z);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int sizeDimension = getSizeDimension();
        this.f54482a = (sizeDimension - this.f54493m) / 2;
        getImpl().mo77640o();
        int min = Math.min(m80623a(sizeDimension, i), m80623a(sizeDimension, i2));
        setMeasuredDimension(this.f54484c.left + min + this.f54484c.right, min + this.f54484c.top + this.f54484c.bottom);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo77500a(AbstractC22282a aVar, boolean z) {
        getImpl().mo77623b(m80625c(aVar), z);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public FloatingActionButton(android.content.Context r12, android.util.AttributeSet r13, int r14) {
        /*
        // Method dump skipped, instructions count: 318
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.floatingactionbutton.FloatingActionButton.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
