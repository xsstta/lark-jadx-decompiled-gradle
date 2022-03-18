package com.google.android.material.bottomappbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.drawable.C0774a;
import androidx.core.view.ViewCompat;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.internal.C22365r;
import com.google.android.material.p980a.AbstractC22126k;
import com.google.android.material.shape.C22394h;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BottomAppBar extends Toolbar implements CoordinatorLayout.AbstractC0701a {

    /* renamed from: r */
    private static final int f53918r = 2131887332;

    /* renamed from: e */
    public final int f53919e;

    /* renamed from: f */
    public final MaterialShapeDrawable f53920f;

    /* renamed from: g */
    public Animator f53921g;

    /* renamed from: h */
    public int f53922h;

    /* renamed from: i */
    public final boolean f53923i;

    /* renamed from: j */
    public final boolean f53924j;

    /* renamed from: k */
    public final boolean f53925k;

    /* renamed from: l */
    public boolean f53926l;

    /* renamed from: m */
    public int f53927m;

    /* renamed from: n */
    public int f53928n;

    /* renamed from: o */
    public int f53929o;

    /* renamed from: p */
    AnimatorListenerAdapter f53930p;

    /* renamed from: q */
    AbstractC22126k<FloatingActionButton> f53931q;

    /* renamed from: s */
    private Animator f53932s;

    /* renamed from: t */
    private int f53933t;

    /* renamed from: u */
    private boolean f53934u;

    /* renamed from: v */
    private int f53935v;

    /* renamed from: w */
    private ArrayList<AbstractC22160a> f53936w;

    /* renamed from: x */
    private Behavior f53937x;

    @Retention(RetentionPolicy.SOURCE)
    public @interface FabAlignmentMode {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface FabAnimationMode {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$a */
    public interface AbstractC22160a {
        /* renamed from: a */
        void mo76584a(BottomAppBar bottomAppBar);

        /* renamed from: b */
        void mo76585b(BottomAppBar bottomAppBar);
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitle(CharSequence charSequence) {
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(CharSequence charSequence) {
    }

    public int getBottomInset() {
        return this.f53927m;
    }

    public int getFabAlignmentMode() {
        return this.f53922h;
    }

    public int getFabAnimationMode() {
        return this.f53933t;
    }

    public boolean getHideOnScroll() {
        return this.f53934u;
    }

    public int getLeftInset() {
        return this.f53929o;
    }

    public int getRightInset() {
        return this.f53928n;
    }

    public ColorStateList getBackgroundTint() {
        return this.f53920f.mo77949N();
    }

    public float getFabTranslationX() {
        return mo76533c(this.f53922h);
    }

    private float getFabTranslationY() {
        return -getTopEdgeTreatment().mo76591c();
    }

    /* renamed from: t */
    private boolean m79861t() {
        FloatingActionButton o = mo76548o();
        if (o == null || !o.mo77508c()) {
            return false;
        }
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0701a
    public Behavior getBehavior() {
        if (this.f53937x == null) {
            this.f53937x = new Behavior();
        }
        return this.f53937x;
    }

    public float getCradleVerticalOffset() {
        return getTopEdgeTreatment().mo76591c();
    }

    public float getFabCradleMargin() {
        return getTopEdgeTreatment().mo76593d();
    }

    public float getFabCradleRoundedCornerRadius() {
        return getTopEdgeTreatment().mo76595e();
    }

    public C22161a getTopEdgeTreatment() {
        return (C22161a) this.f53920f.getShapeAppearanceModel().mo78014k();
    }

    /* renamed from: o */
    public FloatingActionButton mo76548o() {
        View p = mo76550p();
        if (p instanceof FloatingActionButton) {
            return (FloatingActionButton) p;
        }
        return null;
    }

    /* renamed from: q */
    public void mo76551q() {
        Animator animator = this.f53921g;
        if (animator != null) {
            animator.cancel();
        }
        Animator animator2 = this.f53932s;
        if (animator2 != null) {
            animator2.cancel();
        }
    }

    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {

        /* renamed from: b */
        public final Rect f53952b = new Rect();

        /* renamed from: c */
        public WeakReference<BottomAppBar> f53953c;

        /* renamed from: d */
        public int f53954d;

        /* renamed from: e */
        private final View.OnLayoutChangeListener f53955e = new View.OnLayoutChangeListener() {
            /* class com.google.android.material.bottomappbar.BottomAppBar.Behavior.View$OnLayoutChangeListenerC221581 */

            public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                BottomAppBar bottomAppBar = Behavior.this.f53953c.get();
                if (bottomAppBar == null || !(view instanceof FloatingActionButton)) {
                    view.removeOnLayoutChangeListener(this);
                    return;
                }
                FloatingActionButton floatingActionButton = (FloatingActionButton) view;
                floatingActionButton.mo77504b(Behavior.this.f53952b);
                int height = Behavior.this.f53952b.height();
                bottomAppBar.mo76532b(height);
                CoordinatorLayout.LayoutParams layoutParams = (CoordinatorLayout.LayoutParams) view.getLayoutParams();
                if (Behavior.this.f53954d == 0) {
                    layoutParams.bottomMargin = bottomAppBar.getBottomInset() + (bottomAppBar.getResources().getDimensionPixelOffset(R.dimen.mtrl_bottomappbar_fab_bottom_margin) - ((floatingActionButton.getMeasuredHeight() - height) / 2));
                    layoutParams.leftMargin = bottomAppBar.getLeftInset();
                    layoutParams.rightMargin = bottomAppBar.getRightInset();
                    if (C22365r.m81024a(floatingActionButton)) {
                        layoutParams.leftMargin += bottomAppBar.f53919e;
                    } else {
                        layoutParams.rightMargin += bottomAppBar.f53919e;
                    }
                }
            }
        };

        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* renamed from: a */
        public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, int i) {
            this.f53953c = new WeakReference<>(bottomAppBar);
            View p = bottomAppBar.mo76550p();
            if (p != null && !ViewCompat.m4012F(p)) {
                CoordinatorLayout.LayoutParams layoutParams = (CoordinatorLayout.LayoutParams) p.getLayoutParams();
                layoutParams.anchorGravity = 49;
                this.f53954d = layoutParams.bottomMargin;
                if (p instanceof FloatingActionButton) {
                    FloatingActionButton floatingActionButton = (FloatingActionButton) p;
                    floatingActionButton.addOnLayoutChangeListener(this.f53955e);
                    bottomAppBar.mo76530a(floatingActionButton);
                }
                bottomAppBar.mo76552r();
            }
            coordinatorLayout.mo3939a(bottomAppBar, i);
            return super.onLayoutChild(coordinatorLayout, bottomAppBar, i);
        }

        /* renamed from: a */
        public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, View view, View view2, int i, int i2) {
            if (!bottomAppBar.getHideOnScroll() || !super.onStartNestedScroll(coordinatorLayout, bottomAppBar, view, view2, i, i2)) {
                return false;
            }
            return true;
        }
    }

    private ActionMenuView getActionMenuView() {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C22394h.m81149a(this, this.f53920f);
        if (getParent() instanceof ViewGroup) {
            ((ViewGroup) getParent()).setClipChildren(false);
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.Toolbar
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f53957a = this.f53922h;
        savedState.f53958b = this.f53926l;
        return savedState;
    }

    /* renamed from: s */
    public void mo76553s() {
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView != null) {
            actionMenuView.setAlpha(1.0f);
            if (!m79861t()) {
                mo76529a(actionMenuView, 0, false);
            } else {
                mo76529a(actionMenuView, this.f53922h, this.f53926l);
            }
        }
    }

    /* renamed from: m */
    public void mo76546m() {
        ArrayList<AbstractC22160a> arrayList;
        int i = this.f53935v;
        this.f53935v = i + 1;
        if (i == 0 && (arrayList = this.f53936w) != null) {
            Iterator<AbstractC22160a> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().mo76584a(this);
            }
        }
    }

    /* renamed from: n */
    public void mo76547n() {
        ArrayList<AbstractC22160a> arrayList;
        int i = this.f53935v - 1;
        this.f53935v = i;
        if (i == 0 && (arrayList = this.f53936w) != null) {
            Iterator<AbstractC22160a> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().mo76585b(this);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x001e  */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View mo76550p() {
        /*
            r4 = this;
            android.view.ViewParent r0 = r4.getParent()
            boolean r0 = r0 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout
            r1 = 0
            if (r0 != 0) goto L_0x000a
            return r1
        L_0x000a:
            android.view.ViewParent r0 = r4.getParent()
            androidx.coordinatorlayout.widget.CoordinatorLayout r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r0
            java.util.List r0 = r0.mo3954d(r4)
            java.util.Iterator r0 = r0.iterator()
        L_0x0018:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x002d
            java.lang.Object r2 = r0.next()
            android.view.View r2 = (android.view.View) r2
            boolean r3 = r2 instanceof com.google.android.material.floatingactionbutton.FloatingActionButton
            if (r3 != 0) goto L_0x002c
            boolean r3 = r2 instanceof com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton
            if (r3 == 0) goto L_0x0018
        L_0x002c:
            return r2
        L_0x002d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomappbar.BottomAppBar.mo76550p():android.view.View");
    }

    /* renamed from: r */
    public void mo76552r() {
        float f;
        getTopEdgeTreatment().mo76590b(getFabTranslationX());
        View p = mo76550p();
        MaterialShapeDrawable materialShapeDrawable = this.f53920f;
        if (!this.f53926l || !m79861t()) {
            f = BitmapDescriptorFactory.HUE_RED;
        } else {
            f = 1.0f;
        }
        materialShapeDrawable.mo77983p(f);
        if (p != null) {
            p.setTranslationY(getFabTranslationY());
            p.setTranslationX(getFabTranslationX());
        }
    }

    /* access modifiers changed from: package-private */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() {
            /* class com.google.android.material.bottomappbar.BottomAppBar.SavedState.C221591 */

            /* renamed from: a */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }

            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }
        };

        /* renamed from: a */
        int f53957a;

        /* renamed from: b */
        boolean f53958b;

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // androidx.customview.view.AbsSavedState
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f53957a);
            parcel.writeInt(this.f53958b ? 1 : 0);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            boolean z;
            this.f53957a = parcel.readInt();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            this.f53958b = z;
        }
    }

    public void setFabAnimationMode(int i) {
        this.f53933t = i;
    }

    public void setHideOnScroll(boolean z) {
        this.f53934u = z;
    }

    public BottomAppBar(Context context) {
        this(context, null, 0);
    }

    public void setBackgroundTint(ColorStateList colorStateList) {
        C0774a.m3768a(this.f53920f, colorStateList);
    }

    public void setFabAlignmentMode(int i) {
        m79860d(i);
        mo76528a(i, this.f53926l);
        this.f53922h = i;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.Toolbar
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.mo4902a());
        this.f53922h = savedState.f53957a;
        this.f53926l = savedState.f53958b;
    }

    public void setCradleVerticalOffset(float f) {
        if (f != getCradleVerticalOffset()) {
            getTopEdgeTreatment().mo76592c(f);
            this.f53920f.invalidateSelf();
            mo76552r();
        }
    }

    public void setElevation(float f) {
        this.f53920f.mo77985r(f);
        getBehavior().mo76516a(this, this.f53920f.mo77957V() - this.f53920f.mo77960Y());
    }

    public void setFabCradleMargin(float f) {
        if (f != getFabCradleMargin()) {
            getTopEdgeTreatment().mo76594d(f);
            this.f53920f.invalidateSelf();
        }
    }

    public void setFabCradleRoundedCornerRadius(float f) {
        if (f != getFabCradleRoundedCornerRadius()) {
            getTopEdgeTreatment().mo76596e(f);
            this.f53920f.invalidateSelf();
        }
    }

    /* renamed from: d */
    private void m79860d(int i) {
        if (this.f53922h != i && ViewCompat.m4012F(this)) {
            Animator animator = this.f53932s;
            if (animator != null) {
                animator.cancel();
            }
            ArrayList arrayList = new ArrayList();
            if (this.f53933t == 1) {
                m79859b(i, arrayList);
            } else {
                mo76527a(i, arrayList);
            }
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(arrayList);
            this.f53932s = animatorSet;
            animatorSet.addListener(new AnimatorListenerAdapter() {
                /* class com.google.android.material.bottomappbar.BottomAppBar.C221524 */

                public void onAnimationEnd(Animator animator) {
                    BottomAppBar.this.mo76547n();
                }

                public void onAnimationStart(Animator animator) {
                    BottomAppBar.this.mo76546m();
                }
            });
            this.f53932s.start();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo76532b(int i) {
        float f = (float) i;
        if (f == getTopEdgeTreatment().mo76586a()) {
            return false;
        }
        getTopEdgeTreatment().mo76587a(f);
        this.f53920f.invalidateSelf();
        return true;
    }

    /* renamed from: c */
    public float mo76533c(int i) {
        int i2;
        boolean a = C22365r.m81024a(this);
        int i3 = 1;
        if (i != 1) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        if (a) {
            i2 = this.f53929o;
        } else {
            i2 = this.f53928n;
        }
        int measuredWidth = (getMeasuredWidth() / 2) - (this.f53919e + i2);
        if (a) {
            i3 = -1;
        }
        return (float) (measuredWidth * i3);
    }

    /* renamed from: a */
    public void mo76530a(FloatingActionButton floatingActionButton) {
        floatingActionButton.mo77503b(this.f53930p);
        floatingActionButton.mo77497a(new AnimatorListenerAdapter() {
            /* class com.google.android.material.bottomappbar.BottomAppBar.C221578 */

            public void onAnimationStart(Animator animator) {
                BottomAppBar.this.f53930p.onAnimationStart(animator);
                FloatingActionButton o = BottomAppBar.this.mo76548o();
                if (o != null) {
                    o.setTranslationX(BottomAppBar.this.getFabTranslationX());
                }
            }
        });
        floatingActionButton.mo77498a(this.f53931q);
    }

    public BottomAppBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.bottomAppBarStyle);
    }

    /* renamed from: b */
    private void m79859b(int i, List<Animator> list) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(mo76548o(), "translationX", mo76533c(i));
        ofFloat.setDuration(300L);
        list.add(ofFloat);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo76527a(final int i, List<Animator> list) {
        FloatingActionButton o = mo76548o();
        if (o != null && !o.mo77507b()) {
            mo76546m();
            o.mo77505b(new FloatingActionButton.AbstractC22282a() {
                /* class com.google.android.material.bottomappbar.BottomAppBar.C221535 */

                @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.AbstractC22282a
                /* renamed from: a */
                public void mo76568a(FloatingActionButton floatingActionButton) {
                    floatingActionButton.setTranslationX(BottomAppBar.this.mo76533c(i));
                    floatingActionButton.mo77499a(new FloatingActionButton.AbstractC22282a() {
                        /* class com.google.android.material.bottomappbar.BottomAppBar.C221535.C221541 */

                        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.AbstractC22282a
                        /* renamed from: b */
                        public void mo76569b(FloatingActionButton floatingActionButton) {
                            BottomAppBar.this.mo76547n();
                        }
                    });
                }
            });
        }
    }

    /* renamed from: a */
    public void mo76528a(int i, boolean z) {
        if (ViewCompat.m4012F(this)) {
            Animator animator = this.f53921g;
            if (animator != null) {
                animator.cancel();
            }
            ArrayList arrayList = new ArrayList();
            if (!m79861t()) {
                i = 0;
                z = false;
            }
            m79858a(i, z, arrayList);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(arrayList);
            this.f53921g = animatorSet;
            animatorSet.addListener(new AnimatorListenerAdapter() {
                /* class com.google.android.material.bottomappbar.BottomAppBar.C221556 */

                public void onAnimationStart(Animator animator) {
                    BottomAppBar.this.mo76546m();
                }

                public void onAnimationEnd(Animator animator) {
                    BottomAppBar.this.mo76547n();
                    BottomAppBar.this.f53921g = null;
                }
            });
            this.f53921g.start();
        }
    }

    /* renamed from: a */
    public void mo76529a(ActionMenuView actionMenuView, int i, boolean z) {
        actionMenuView.setTranslationX((float) mo76531b(actionMenuView, i, z));
    }

    /* renamed from: a */
    private void m79858a(final int i, final boolean z, List<Animator> list) {
        final ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView != null) {
            Animator ofFloat = ObjectAnimator.ofFloat(actionMenuView, "alpha", 1.0f);
            if (Math.abs(actionMenuView.getTranslationX() - ((float) mo76531b(actionMenuView, i, z))) > 1.0f) {
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(actionMenuView, "alpha", 0.0f);
                ofFloat2.addListener(new AnimatorListenerAdapter() {
                    /* class com.google.android.material.bottomappbar.BottomAppBar.C221567 */

                    /* renamed from: a */
                    public boolean f53946a;

                    public void onAnimationCancel(Animator animator) {
                        this.f53946a = true;
                    }

                    public void onAnimationEnd(Animator animator) {
                        if (!this.f53946a) {
                            BottomAppBar.this.mo76529a(actionMenuView, i, z);
                        }
                    }
                });
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.setDuration(150L);
                animatorSet.playSequentially(ofFloat2, ofFloat);
                list.add(animatorSet);
            } else if (actionMenuView.getAlpha() < 1.0f) {
                list.add(ofFloat);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public int mo76531b(ActionMenuView actionMenuView, int i, boolean z) {
        int i2;
        int i3;
        int i4;
        boolean z2;
        if (i != 1 || !z) {
            return 0;
        }
        boolean a = C22365r.m81024a(this);
        if (a) {
            i2 = getMeasuredWidth();
        } else {
            i2 = 0;
        }
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            View childAt = getChildAt(i5);
            if (!(childAt.getLayoutParams() instanceof Toolbar.LayoutParams) || (((Toolbar.LayoutParams) childAt.getLayoutParams()).f476a & 8388615) != 8388611) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z2) {
                if (a) {
                    i2 = Math.min(i2, childAt.getLeft());
                } else {
                    i2 = Math.max(i2, childAt.getRight());
                }
            }
        }
        if (a) {
            i3 = actionMenuView.getRight();
        } else {
            i3 = actionMenuView.getLeft();
        }
        if (a) {
            i4 = this.f53928n;
        } else {
            i4 = -this.f53929o;
        }
        return i2 - (i3 + i4);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public BottomAppBar(android.content.Context r12, android.util.AttributeSet r13, int r14) {
        /*
        // Method dump skipped, instructions count: 220
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomappbar.BottomAppBar.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.Toolbar
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            mo76551q();
            mo76552r();
        }
        mo76553s();
    }
}
