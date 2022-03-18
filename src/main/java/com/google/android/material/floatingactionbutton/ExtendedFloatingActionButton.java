package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.internal.C22331c;
import com.google.android.material.p980a.C22123h;
import com.larksuite.suite.R;
import java.util.List;

public class ExtendedFloatingActionButton extends MaterialButton implements CoordinatorLayout.AbstractC0701a {

    /* renamed from: h */
    static final Property<View, Float> f54453h = new Property<View, Float>(Float.class, "width") {
        /* class com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.C222744 */

        /* renamed from: a */
        public Float get(View view) {
            return Float.valueOf((float) view.getLayoutParams().width);
        }

        /* renamed from: a */
        public void set(View view, Float f) {
            view.getLayoutParams().width = f.intValue();
            view.requestLayout();
        }
    };

    /* renamed from: i */
    static final Property<View, Float> f54454i = new Property<View, Float>(Float.class, "height") {
        /* class com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.C222755 */

        /* renamed from: a */
        public Float get(View view) {
            return Float.valueOf((float) view.getLayoutParams().height);
        }

        /* renamed from: a */
        public void set(View view, Float f) {
            view.getLayoutParams().height = f.intValue();
            view.requestLayout();
        }
    };

    /* renamed from: j */
    private static final int f54455j = 2131887363;

    /* renamed from: a */
    public int f54456a;

    /* renamed from: b */
    public final AbstractC22305f f54457b;

    /* renamed from: c */
    public final AbstractC22305f f54458c;

    /* renamed from: e */
    public final AbstractC22305f f54459e;

    /* renamed from: f */
    public final AbstractC22305f f54460f;

    /* renamed from: g */
    public boolean f54461g;

    /* renamed from: k */
    private final C22285a f54462k;

    /* renamed from: l */
    private final CoordinatorLayout.Behavior<ExtendedFloatingActionButton> f54463l;

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$c */
    public static abstract class AbstractC22278c {
        /* renamed from: a */
        public void mo77493a(ExtendedFloatingActionButton extendedFloatingActionButton) {
        }

        /* renamed from: b */
        public void mo77494b(ExtendedFloatingActionButton extendedFloatingActionButton) {
        }

        /* renamed from: c */
        public void mo77495c(ExtendedFloatingActionButton extendedFloatingActionButton) {
        }

        /* renamed from: d */
        public void mo77496d(ExtendedFloatingActionButton extendedFloatingActionButton) {
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$e */
    interface AbstractC22280e {
        /* renamed from: a */
        int mo77466a();

        /* renamed from: b */
        int mo77467b();

        /* renamed from: c */
        ViewGroup.LayoutParams mo77468c();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0701a
    public CoordinatorLayout.Behavior<ExtendedFloatingActionButton> getBehavior() {
        return this.f54463l;
    }

    protected static class ExtendedFloatingActionButtonBehavior<T extends ExtendedFloatingActionButton> extends CoordinatorLayout.Behavior<T> {

        /* renamed from: a */
        private Rect f54470a;

        /* renamed from: b */
        private AbstractC22278c f54471b;

        /* renamed from: c */
        private AbstractC22278c f54472c;

        /* renamed from: d */
        private boolean f54473d;

        /* renamed from: e */
        private boolean f54474e;

        public ExtendedFloatingActionButtonBehavior() {
            this.f54474e = true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public void onAttachedToLayoutParams(CoordinatorLayout.LayoutParams layoutParams) {
            if (layoutParams.dodgeInsetEdges == 0) {
                layoutParams.dodgeInsetEdges = 80;
            }
        }

        /* renamed from: a */
        private static boolean m80586a(View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.LayoutParams) {
                return ((CoordinatorLayout.LayoutParams) layoutParams).getBehavior() instanceof BottomSheetBehavior;
            }
            return false;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void mo77484b(ExtendedFloatingActionButton extendedFloatingActionButton) {
            AbstractC22278c cVar;
            AbstractC22305f fVar;
            boolean z = this.f54474e;
            if (z) {
                cVar = this.f54472c;
            } else {
                cVar = this.f54471b;
            }
            if (z) {
                fVar = extendedFloatingActionButton.f54458c;
            } else {
                fVar = extendedFloatingActionButton.f54459e;
            }
            extendedFloatingActionButton.mo77449a(fVar, cVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo77480a(ExtendedFloatingActionButton extendedFloatingActionButton) {
            AbstractC22278c cVar;
            AbstractC22305f fVar;
            boolean z = this.f54474e;
            if (z) {
                cVar = this.f54472c;
            } else {
                cVar = this.f54471b;
            }
            if (z) {
                fVar = extendedFloatingActionButton.f54457b;
            } else {
                fVar = extendedFloatingActionButton.f54460f;
            }
            extendedFloatingActionButton.mo77449a(fVar, cVar);
        }

        public ExtendedFloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.behavior_autoHide, R.attr.behavior_autoShrink});
            this.f54473d = obtainStyledAttributes.getBoolean(0, false);
            this.f54474e = obtainStyledAttributes.getBoolean(1, true);
            obtainStyledAttributes.recycle();
        }

        /* renamed from: a */
        private boolean m80587a(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            CoordinatorLayout.LayoutParams layoutParams = (CoordinatorLayout.LayoutParams) extendedFloatingActionButton.getLayoutParams();
            if ((this.f54473d || this.f54474e) && layoutParams.getAnchorId() == view.getId()) {
                return true;
            }
            return false;
        }

        /* renamed from: b */
        private boolean m80589b(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!m80587a(view, extendedFloatingActionButton)) {
                return false;
            }
            if (view.getTop() < (extendedFloatingActionButton.getHeight() / 2) + ((CoordinatorLayout.LayoutParams) extendedFloatingActionButton.getLayoutParams()).topMargin) {
                mo77480a(extendedFloatingActionButton);
                return true;
            }
            mo77484b(extendedFloatingActionButton);
            return true;
        }

        /* renamed from: a */
        public boolean getInsetDodgeRect(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, Rect rect) {
            return super.getInsetDodgeRect(coordinatorLayout, extendedFloatingActionButton, rect);
        }

        /* renamed from: a */
        private boolean m80588a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!m80587a(appBarLayout, extendedFloatingActionButton)) {
                return false;
            }
            if (this.f54470a == null) {
                this.f54470a = new Rect();
            }
            Rect rect = this.f54470a;
            C22331c.m80913b(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                mo77480a(extendedFloatingActionButton);
                return true;
            }
            mo77484b(extendedFloatingActionButton);
            return true;
        }

        /* renamed from: a */
        public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, int i) {
            List<View> c = coordinatorLayout.mo3950c(extendedFloatingActionButton);
            int size = c.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view = c.get(i2);
                if (!(view instanceof AppBarLayout)) {
                    if (m80586a(view) && m80589b(view, extendedFloatingActionButton)) {
                        break;
                    }
                } else if (m80588a(coordinatorLayout, (AppBarLayout) view, extendedFloatingActionButton)) {
                    break;
                }
            }
            coordinatorLayout.mo3939a(extendedFloatingActionButton, i);
            return true;
        }

        /* renamed from: a */
        public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                m80588a(coordinatorLayout, (AppBarLayout) view, extendedFloatingActionButton);
                return false;
            } else if (!m80586a(view)) {
                return false;
            } else {
                m80589b(view, extendedFloatingActionButton);
                return false;
            }
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$b */
    class C22277b extends AbstractC22286b {

        /* renamed from: b */
        private boolean f54479b;

        @Override // com.google.android.material.floatingactionbutton.AbstractC22305f
        /* renamed from: h */
        public int mo77490h() {
            return R.animator.mtrl_extended_fab_hide_motion_spec;
        }

        @Override // com.google.android.material.floatingactionbutton.AbstractC22286b, com.google.android.material.floatingactionbutton.AbstractC22305f
        /* renamed from: e */
        public void mo77492e() {
            super.mo77492e();
            this.f54479b = true;
        }

        @Override // com.google.android.material.floatingactionbutton.AbstractC22305f
        /* renamed from: g */
        public void mo77489g() {
            ExtendedFloatingActionButton.this.setVisibility(8);
        }

        @Override // com.google.android.material.floatingactionbutton.AbstractC22305f
        /* renamed from: i */
        public boolean mo77491i() {
            return ExtendedFloatingActionButton.this.mo77451c();
        }

        @Override // com.google.android.material.floatingactionbutton.AbstractC22286b, com.google.android.material.floatingactionbutton.AbstractC22305f
        /* renamed from: d */
        public void mo77487d() {
            super.mo77487d();
            ExtendedFloatingActionButton.this.f54456a = 0;
            if (!this.f54479b) {
                ExtendedFloatingActionButton.this.setVisibility(8);
            }
        }

        @Override // com.google.android.material.floatingactionbutton.AbstractC22305f
        /* renamed from: a */
        public void mo77486a(AbstractC22278c cVar) {
            if (cVar != null) {
                cVar.mo77494b(ExtendedFloatingActionButton.this);
            }
        }

        @Override // com.google.android.material.floatingactionbutton.AbstractC22286b, com.google.android.material.floatingactionbutton.AbstractC22305f
        /* renamed from: a */
        public void mo77485a(Animator animator) {
            super.mo77485a(animator);
            this.f54479b = false;
            ExtendedFloatingActionButton.this.setVisibility(0);
            ExtendedFloatingActionButton.this.f54456a = 1;
        }

        public C22277b(C22285a aVar) {
            super(ExtendedFloatingActionButton.this, aVar);
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$d */
    class C22279d extends AbstractC22286b {
        @Override // com.google.android.material.floatingactionbutton.AbstractC22305f
        /* renamed from: h */
        public int mo77490h() {
            return R.animator.mtrl_extended_fab_show_motion_spec;
        }

        @Override // com.google.android.material.floatingactionbutton.AbstractC22305f
        /* renamed from: i */
        public boolean mo77491i() {
            return ExtendedFloatingActionButton.this.mo77450b();
        }

        @Override // com.google.android.material.floatingactionbutton.AbstractC22286b, com.google.android.material.floatingactionbutton.AbstractC22305f
        /* renamed from: d */
        public void mo77487d() {
            super.mo77487d();
            ExtendedFloatingActionButton.this.f54456a = 0;
        }

        @Override // com.google.android.material.floatingactionbutton.AbstractC22305f
        /* renamed from: g */
        public void mo77489g() {
            ExtendedFloatingActionButton.this.setVisibility(0);
            ExtendedFloatingActionButton.this.setAlpha(1.0f);
            ExtendedFloatingActionButton.this.setScaleY(1.0f);
            ExtendedFloatingActionButton.this.setScaleX(1.0f);
        }

        @Override // com.google.android.material.floatingactionbutton.AbstractC22305f
        /* renamed from: a */
        public void mo77486a(AbstractC22278c cVar) {
            if (cVar != null) {
                cVar.mo77493a(ExtendedFloatingActionButton.this);
            }
        }

        @Override // com.google.android.material.floatingactionbutton.AbstractC22286b, com.google.android.material.floatingactionbutton.AbstractC22305f
        /* renamed from: a */
        public void mo77485a(Animator animator) {
            super.mo77485a(animator);
            ExtendedFloatingActionButton.this.setVisibility(0);
            ExtendedFloatingActionButton.this.f54456a = 2;
        }

        public C22279d(C22285a aVar) {
            super(ExtendedFloatingActionButton.this, aVar);
        }
    }

    public C22123h getExtendMotionSpec() {
        return this.f54458c.mo77583c();
    }

    public C22123h getHideMotionSpec() {
        return this.f54460f.mo77583c();
    }

    public C22123h getShowMotionSpec() {
        return this.f54459e.mo77583c();
    }

    public C22123h getShrinkMotionSpec() {
        return this.f54457b.mo77583c();
    }

    /* renamed from: d */
    private boolean m80572d() {
        if (!ViewCompat.m4012F(this) || isInEditMode()) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public boolean mo77450b() {
        if (getVisibility() != 0) {
            if (this.f54456a == 2) {
                return true;
            }
            return false;
        } else if (this.f54456a != 1) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: c */
    public boolean mo77451c() {
        if (getVisibility() == 0) {
            if (this.f54456a == 1) {
                return true;
            }
            return false;
        } else if (this.f54456a != 2) {
            return true;
        } else {
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public int getCollapsedSize() {
        return (Math.min(ViewCompat.m4094l(this), ViewCompat.m4097m(this)) * 2) + getIconSize();
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.material.button.MaterialButton
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f54461g && TextUtils.isEmpty(getText()) && getIcon() != null) {
            this.f54461g = false;
            this.f54457b.mo77489g();
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$a */
    class C22276a extends AbstractC22286b {

        /* renamed from: b */
        private final AbstractC22280e f54476b;

        /* renamed from: c */
        private final boolean f54477c;

        @Override // com.google.android.material.floatingactionbutton.AbstractC22305f
        /* renamed from: h */
        public int mo77490h() {
            return R.animator.mtrl_extended_fab_change_size_motion_spec;
        }

        @Override // com.google.android.material.floatingactionbutton.AbstractC22286b, com.google.android.material.floatingactionbutton.AbstractC22305f
        /* renamed from: d */
        public void mo77487d() {
            super.mo77487d();
            ExtendedFloatingActionButton.this.setHorizontallyScrolling(false);
            ViewGroup.LayoutParams layoutParams = ExtendedFloatingActionButton.this.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = this.f54476b.mo77468c().width;
                layoutParams.height = this.f54476b.mo77468c().height;
            }
        }

        @Override // com.google.android.material.floatingactionbutton.AbstractC22305f
        /* renamed from: g */
        public void mo77489g() {
            ExtendedFloatingActionButton.this.f54461g = this.f54477c;
            ViewGroup.LayoutParams layoutParams = ExtendedFloatingActionButton.this.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = this.f54476b.mo77468c().width;
                layoutParams.height = this.f54476b.mo77468c().height;
                ExtendedFloatingActionButton.this.requestLayout();
            }
        }

        @Override // com.google.android.material.floatingactionbutton.AbstractC22305f
        /* renamed from: i */
        public boolean mo77491i() {
            if (this.f54477c == ExtendedFloatingActionButton.this.f54461g || ExtendedFloatingActionButton.this.getIcon() == null || TextUtils.isEmpty(ExtendedFloatingActionButton.this.getText())) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.material.floatingactionbutton.AbstractC22286b, com.google.android.material.floatingactionbutton.AbstractC22305f
        /* renamed from: f */
        public AnimatorSet mo77488f() {
            C22123h a = mo77579a();
            if (a.mo76294c("width")) {
                PropertyValuesHolder[] d = a.mo76295d("width");
                d[0].setFloatValues((float) ExtendedFloatingActionButton.this.getWidth(), (float) this.f54476b.mo77466a());
                a.mo76291a("width", d);
            }
            if (a.mo76294c("height")) {
                PropertyValuesHolder[] d2 = a.mo76295d("height");
                d2[0].setFloatValues((float) ExtendedFloatingActionButton.this.getHeight(), (float) this.f54476b.mo77467b());
                a.mo76291a("height", d2);
            }
            return super.mo77581b(a);
        }

        @Override // com.google.android.material.floatingactionbutton.AbstractC22286b, com.google.android.material.floatingactionbutton.AbstractC22305f
        /* renamed from: a */
        public void mo77485a(Animator animator) {
            super.mo77485a(animator);
            ExtendedFloatingActionButton.this.f54461g = this.f54477c;
            ExtendedFloatingActionButton.this.setHorizontallyScrolling(true);
        }

        @Override // com.google.android.material.floatingactionbutton.AbstractC22305f
        /* renamed from: a */
        public void mo77486a(AbstractC22278c cVar) {
            if (cVar != null) {
                if (this.f54477c) {
                    cVar.mo77495c(ExtendedFloatingActionButton.this);
                } else {
                    cVar.mo77496d(ExtendedFloatingActionButton.this);
                }
            }
        }

        C22276a(C22285a aVar, AbstractC22280e eVar, boolean z) {
            super(ExtendedFloatingActionButton.this, aVar);
            this.f54476b = eVar;
            this.f54477c = z;
        }
    }

    public ExtendedFloatingActionButton(Context context) {
        this(context, null);
    }

    public void setExtendMotionSpec(C22123h hVar) {
        this.f54458c.mo77580a(hVar);
    }

    public void setHideMotionSpec(C22123h hVar) {
        this.f54460f.mo77580a(hVar);
    }

    public void setShowMotionSpec(C22123h hVar) {
        this.f54459e.mo77580a(hVar);
    }

    public void setShrinkMotionSpec(C22123h hVar) {
        this.f54457b.mo77580a(hVar);
    }

    public void setExtendMotionSpecResource(int i) {
        setExtendMotionSpec(C22123h.m79717a(getContext(), i));
    }

    public void setHideMotionSpecResource(int i) {
        setHideMotionSpec(C22123h.m79717a(getContext(), i));
    }

    public void setShowMotionSpecResource(int i) {
        setShowMotionSpec(C22123h.m79717a(getContext(), i));
    }

    public void setShrinkMotionSpecResource(int i) {
        setShrinkMotionSpec(C22123h.m79717a(getContext(), i));
    }

    public void setExtended(boolean z) {
        AbstractC22305f fVar;
        if (this.f54461g != z) {
            if (z) {
                fVar = this.f54458c;
            } else {
                fVar = this.f54457b;
            }
            if (!fVar.mo77491i()) {
                fVar.mo77489g();
            }
        }
    }

    public ExtendedFloatingActionButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.extendedFloatingActionButtonStyle);
    }

    /* renamed from: a */
    public void mo77449a(final AbstractC22305f fVar, final AbstractC22278c cVar) {
        if (!fVar.mo77491i()) {
            if (!m80572d()) {
                fVar.mo77489g();
                fVar.mo77486a(cVar);
                return;
            }
            measure(0, 0);
            AnimatorSet f = fVar.mo77488f();
            f.addListener(new AnimatorListenerAdapter() {
                /* class com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.C222733 */

                /* renamed from: d */
                private boolean f54469d;

                public void onAnimationCancel(Animator animator) {
                    this.f54469d = true;
                    fVar.mo77492e();
                }

                public void onAnimationStart(Animator animator) {
                    fVar.mo77485a(animator);
                    this.f54469d = false;
                }

                public void onAnimationEnd(Animator animator) {
                    fVar.mo77487d();
                    if (!this.f54469d) {
                        fVar.mo77486a(cVar);
                    }
                }
            });
            for (Animator.AnimatorListener animatorListener : fVar.mo77582b()) {
                f.addListener(animatorListener);
            }
            f.start();
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ExtendedFloatingActionButton(android.content.Context r17, android.util.AttributeSet r18, int r19) {
        /*
        // Method dump skipped, instructions count: 168
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
