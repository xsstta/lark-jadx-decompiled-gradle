package com.google.android.material.tabs;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.p017a.p018a.C0215a;
import androidx.appcompat.widget.C0431ah;
import androidx.core.graphics.drawable.C0774a;
import androidx.core.util.Pools;
import androidx.core.view.C0906h;
import androidx.core.view.C0914p;
import androidx.core.view.ViewCompat;
import androidx.core.view.p029a.C0864d;
import androidx.core.widget.TextViewCompat;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.badge.C22143a;
import com.google.android.material.internal.C22365r;
import com.google.android.material.p980a.C22116a;
import com.google.android.material.p989j.C22375b;
import com.google.android.material.shape.C22394h;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

@ViewPager.DecorView
public class TabLayout extends HorizontalScrollView {

    /* renamed from: y */
    private static final int f55116y = 2131887309;

    /* renamed from: z */
    private static final Pools.AbstractC0839a<C22451f> f55117z = new Pools.SynchronizedPool(16);

    /* renamed from: A */
    private final ArrayList<C22451f> f55118A;

    /* renamed from: B */
    private C22451f f55119B;

    /* renamed from: C */
    private final int f55120C;

    /* renamed from: D */
    private final int f55121D;

    /* renamed from: E */
    private final int f55122E;

    /* renamed from: F */
    private int f55123F;

    /* renamed from: G */
    private AbstractC22445b f55124G;

    /* renamed from: H */
    private final ArrayList<AbstractC22445b> f55125H;

    /* renamed from: I */
    private AbstractC22445b f55126I;

    /* renamed from: J */
    private ValueAnimator f55127J;

    /* renamed from: K */
    private PagerAdapter f55128K;

    /* renamed from: L */
    private DataSetObserver f55129L;

    /* renamed from: M */
    private C22452g f55130M;

    /* renamed from: N */
    private C22444a f55131N;

    /* renamed from: O */
    private boolean f55132O;

    /* renamed from: P */
    private final Pools.AbstractC0839a<C22453h> f55133P;

    /* renamed from: a */
    public final RectF f55134a;

    /* renamed from: b */
    final C22448e f55135b;

    /* renamed from: c */
    int f55136c;

    /* renamed from: d */
    int f55137d;

    /* renamed from: e */
    int f55138e;

    /* renamed from: f */
    int f55139f;

    /* renamed from: g */
    int f55140g;

    /* renamed from: h */
    ColorStateList f55141h;

    /* renamed from: i */
    ColorStateList f55142i;

    /* renamed from: j */
    ColorStateList f55143j;

    /* renamed from: k */
    Drawable f55144k;

    /* renamed from: l */
    PorterDuff.Mode f55145l;

    /* renamed from: m */
    float f55146m;

    /* renamed from: n */
    float f55147n;

    /* renamed from: o */
    final int f55148o;

    /* renamed from: p */
    int f55149p;

    /* renamed from: q */
    int f55150q;

    /* renamed from: r */
    int f55151r;

    /* renamed from: s */
    int f55152s;

    /* renamed from: t */
    int f55153t;

    /* renamed from: u */
    boolean f55154u;

    /* renamed from: v */
    boolean f55155v;

    /* renamed from: w */
    boolean f55156w;

    /* renamed from: x */
    ViewPager f55157x;

    public @interface LabelVisibility {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface Mode {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface TabGravity {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface TabIndicatorGravity {
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$b */
    public interface AbstractC22445b<T extends C22451f> {
        /* renamed from: a */
        void mo78292a(T t);

        /* renamed from: b */
        void mo78293b(T t);

        /* renamed from: c */
        void mo78294c(T t);
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$c */
    public interface AbstractC22446c extends AbstractC22445b<C22451f> {
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$f */
    public static class C22451f {

        /* renamed from: a */
        public CharSequence f55179a;

        /* renamed from: b */
        public CharSequence f55180b;

        /* renamed from: c */
        public int f55181c = 1;

        /* renamed from: d */
        public TabLayout f55182d;

        /* renamed from: e */
        public C22453h f55183e;

        /* renamed from: f */
        private Object f55184f;

        /* renamed from: g */
        private Drawable f55185g;

        /* renamed from: h */
        private int f55186h = -1;

        /* renamed from: i */
        private View f55187i;

        /* renamed from: a */
        public View mo78310a() {
            return this.f55187i;
        }

        /* renamed from: b */
        public Drawable mo78315b() {
            return this.f55185g;
        }

        /* renamed from: c */
        public int mo78318c() {
            return this.f55186h;
        }

        /* renamed from: d */
        public CharSequence mo78319d() {
            return this.f55179a;
        }

        /* renamed from: e */
        public int mo78320e() {
            return this.f55181c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public void mo78323h() {
            C22453h hVar = this.f55183e;
            if (hVar != null) {
                hVar.mo78330b();
            }
        }

        /* renamed from: f */
        public void mo78321f() {
            TabLayout tabLayout = this.f55182d;
            if (tabLayout != null) {
                tabLayout.mo78247c(this);
                return;
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        /* renamed from: g */
        public boolean mo78322g() {
            TabLayout tabLayout = this.f55182d;
            if (tabLayout == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            } else if (tabLayout.getSelectedTabPosition() == this.f55186h) {
                return true;
            } else {
                return false;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public void mo78324i() {
            this.f55182d = null;
            this.f55183e = null;
            this.f55184f = null;
            this.f55185g = null;
            this.f55179a = null;
            this.f55180b = null;
            this.f55186h = -1;
            this.f55187i = null;
        }

        /* renamed from: a */
        public C22451f mo78313a(View view) {
            this.f55187i = view;
            mo78323h();
            return this;
        }

        /* renamed from: b */
        public C22451f mo78316b(CharSequence charSequence) {
            this.f55180b = charSequence;
            mo78323h();
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo78317b(int i) {
            this.f55186h = i;
        }

        /* renamed from: a */
        public C22451f mo78311a(int i) {
            return mo78313a(LayoutInflater.from(this.f55183e.getContext()).inflate(i, (ViewGroup) this.f55183e, false));
        }

        /* renamed from: a */
        public C22451f mo78312a(Drawable drawable) {
            this.f55185g = drawable;
            if (this.f55182d.f55150q == 1 || this.f55182d.f55153t == 2) {
                this.f55182d.mo78237a(true);
            }
            mo78323h();
            if (C22143a.f53895a && this.f55183e.mo78332d() && this.f55183e.f55191a.isVisible()) {
                this.f55183e.invalidate();
            }
            return this;
        }

        /* renamed from: a */
        public C22451f mo78314a(CharSequence charSequence) {
            if (TextUtils.isEmpty(this.f55180b) && !TextUtils.isEmpty(charSequence)) {
                this.f55183e.setContentDescription(charSequence);
            }
            this.f55179a = charSequence;
            mo78323h();
            return this;
        }
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$h */
    public final class C22453h extends LinearLayout {

        /* renamed from: a */
        public BadgeDrawable f55191a;

        /* renamed from: c */
        private C22451f f55193c;

        /* renamed from: d */
        private TextView f55194d;

        /* renamed from: e */
        private ImageView f55195e;

        /* renamed from: f */
        private View f55196f;

        /* renamed from: g */
        private View f55197g;

        /* renamed from: h */
        private TextView f55198h;

        /* renamed from: i */
        private ImageView f55199i;

        /* renamed from: j */
        private Drawable f55200j;

        /* renamed from: k */
        private int f55201k = 2;

        public BadgeDrawable getBadge() {
            return this.f55191a;
        }

        public C22451f getTab() {
            return this.f55193c;
        }

        /* renamed from: d */
        public boolean mo78332d() {
            if (this.f55191a != null) {
                return true;
            }
            return false;
        }

        /* renamed from: g */
        private FrameLayout m81470g() {
            FrameLayout frameLayout = new FrameLayout(getContext());
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            return frameLayout;
        }

        /* renamed from: i */
        private void m81472i() {
            if (mo78332d()) {
                m81464a(true);
                View view = this.f55196f;
                if (view != null) {
                    C22143a.m79830b(this.f55191a, view, m81467d(view));
                    this.f55196f = null;
                }
            }
        }

        public BadgeDrawable getOrCreateBadge() {
            if (this.f55191a == null) {
                this.f55191a = BadgeDrawable.m79798a(getContext());
            }
            m81471h();
            BadgeDrawable badgeDrawable = this.f55191a;
            if (badgeDrawable != null) {
                return badgeDrawable;
            }
            throw new IllegalStateException("Unable to create badge");
        }

        public boolean performClick() {
            boolean performClick = super.performClick();
            if (this.f55193c == null) {
                return performClick;
            }
            if (!performClick) {
                playSoundEffect(0);
            }
            this.f55193c.mo78321f();
            return true;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.google.android.material.tabs.TabLayout$h */
        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: e */
        private void m81468e() {
            FrameLayout frameLayout;
            if (C22143a.f53895a) {
                frameLayout = m81470g();
                addView(frameLayout, 0);
            } else {
                frameLayout = this;
            }
            ImageView imageView = (ImageView) LayoutInflater.from(getContext()).inflate(R.layout.design_layout_tab_icon, (ViewGroup) frameLayout, false);
            this.f55195e = imageView;
            frameLayout.addView(imageView, 0);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.google.android.material.tabs.TabLayout$h */
        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: f */
        private void m81469f() {
            FrameLayout frameLayout;
            if (C22143a.f53895a) {
                frameLayout = m81470g();
                addView(frameLayout);
            } else {
                frameLayout = this;
            }
            TextView textView = (TextView) LayoutInflater.from(getContext()).inflate(R.layout.design_layout_tab_text, (ViewGroup) frameLayout, false);
            this.f55194d = textView;
            frameLayout.addView(textView);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo78326a() {
            setTab(null);
            setSelected(false);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public final void mo78331c() {
            setOrientation(!TabLayout.this.f55154u ? 1 : 0);
            TextView textView = this.f55198h;
            if (textView == null && this.f55199i == null) {
                m81463a(this.f55194d, this.f55195e);
            } else {
                m81463a(textView, this.f55199i);
            }
        }

        /* access modifiers changed from: protected */
        public void drawableStateChanged() {
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            Drawable drawable = this.f55200j;
            boolean z = false;
            if (drawable != null && drawable.isStateful()) {
                z = false | this.f55200j.setState(drawableState);
            }
            if (z) {
                invalidate();
                TabLayout.this.invalidate();
            }
        }

        /* renamed from: h */
        private void m81471h() {
            C22451f fVar;
            C22451f fVar2;
            if (mo78332d()) {
                if (this.f55197g != null) {
                    m81472i();
                } else if (this.f55195e != null && (fVar2 = this.f55193c) != null && fVar2.mo78315b() != null) {
                    View view = this.f55196f;
                    ImageView imageView = this.f55195e;
                    if (view != imageView) {
                        m81472i();
                        m81466c(this.f55195e);
                        return;
                    }
                    mo78329a(imageView);
                } else if (this.f55194d == null || (fVar = this.f55193c) == null || fVar.mo78320e() != 1) {
                    m81472i();
                } else {
                    View view2 = this.f55196f;
                    TextView textView = this.f55194d;
                    if (view2 != textView) {
                        m81472i();
                        m81466c(this.f55194d);
                        return;
                    }
                    mo78329a(textView);
                }
            }
        }

        public int getContentWidth() {
            View[] viewArr = {this.f55194d, this.f55195e, this.f55197g};
            int i = 0;
            int i2 = 0;
            boolean z = false;
            for (int i3 = 0; i3 < 3; i3++) {
                View view = viewArr[i3];
                if (view != null && view.getVisibility() == 0) {
                    if (z) {
                        i2 = Math.min(i2, view.getLeft());
                    } else {
                        i2 = view.getLeft();
                    }
                    if (z) {
                        i = Math.max(i, view.getRight());
                    } else {
                        i = view.getRight();
                    }
                    z = true;
                }
            }
            return i - i2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public final void mo78330b() {
            View view;
            boolean z;
            C22451f fVar = this.f55193c;
            Drawable drawable = null;
            if (fVar != null) {
                view = fVar.mo78310a();
            } else {
                view = null;
            }
            if (view != null) {
                ViewParent parent = view.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(view);
                    }
                    addView(view);
                }
                this.f55197g = view;
                TextView textView = this.f55194d;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f55195e;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f55195e.setImageDrawable(null);
                }
                TextView textView2 = (TextView) view.findViewById(16908308);
                this.f55198h = textView2;
                if (textView2 != null) {
                    this.f55201k = TextViewCompat.m4486a(textView2);
                }
                this.f55199i = (ImageView) view.findViewById(16908294);
            } else {
                View view2 = this.f55197g;
                if (view2 != null) {
                    removeView(view2);
                    this.f55197g = null;
                }
                this.f55198h = null;
                this.f55199i = null;
            }
            if (this.f55197g == null) {
                if (this.f55195e == null) {
                    m81468e();
                }
                if (!(fVar == null || fVar.mo78315b() == null)) {
                    drawable = C0774a.m3779g(fVar.mo78315b()).mutate();
                }
                if (drawable != null) {
                    C0774a.m3768a(drawable, TabLayout.this.f55142i);
                    if (TabLayout.this.f55145l != null) {
                        C0774a.m3771a(drawable, TabLayout.this.f55145l);
                    }
                }
                if (this.f55194d == null) {
                    m81469f();
                    this.f55201k = TextViewCompat.m4486a(this.f55194d);
                }
                TextViewCompat.m4490a(this.f55194d, TabLayout.this.f55140g);
                if (TabLayout.this.f55141h != null) {
                    this.f55194d.setTextColor(TabLayout.this.f55141h);
                }
                m81463a(this.f55194d, this.f55195e);
                m81471h();
                m81465b(this.f55195e);
                m81465b(this.f55194d);
            } else {
                TextView textView3 = this.f55198h;
                if (!(textView3 == null && this.f55199i == null)) {
                    m81463a(textView3, this.f55199i);
                }
            }
            if (fVar != null && !TextUtils.isEmpty(fVar.f55180b)) {
                setContentDescription(fVar.f55180b);
            }
            if (fVar == null || !fVar.mo78322g()) {
                z = false;
            } else {
                z = true;
            }
            setSelected(z);
        }

        /* renamed from: b */
        private void m81465b(final View view) {
            if (view != null) {
                view.addOnLayoutChangeListener(new View.OnLayoutChangeListener() {
                    /* class com.google.android.material.tabs.TabLayout.C22453h.View$OnLayoutChangeListenerC224541 */

                    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                        if (view.getVisibility() == 0) {
                            C22453h.this.mo78329a(view);
                        }
                    }
                });
            }
        }

        /* access modifiers changed from: package-private */
        public void setTab(C22451f fVar) {
            if (fVar != this.f55193c) {
                this.f55193c = fVar;
                mo78330b();
            }
        }

        /* renamed from: a */
        private void m81464a(boolean z) {
            setClipChildren(z);
            setClipToPadding(z);
            ViewGroup viewGroup = (ViewGroup) getParent();
            if (viewGroup != null) {
                viewGroup.setClipChildren(z);
                viewGroup.setClipToPadding(z);
            }
        }

        /* renamed from: c */
        private void m81466c(View view) {
            if (mo78332d() && view != null) {
                m81464a(false);
                C22143a.m79829a(this.f55191a, view, m81467d(view));
                this.f55196f = view;
            }
        }

        /* renamed from: d */
        private FrameLayout m81467d(View view) {
            if ((view == this.f55195e || view == this.f55194d) && C22143a.f53895a) {
                return (FrameLayout) view.getParent();
            }
            return null;
        }

        public void setSelected(boolean z) {
            boolean z2;
            if (isSelected() != z) {
                z2 = true;
            } else {
                z2 = false;
            }
            super.setSelected(z);
            if (z2 && z && Build.VERSION.SDK_INT < 16) {
                sendAccessibilityEvent(4);
            }
            TextView textView = this.f55194d;
            if (textView != null) {
                textView.setSelected(z);
            }
            ImageView imageView = this.f55195e;
            if (imageView != null) {
                imageView.setSelected(z);
            }
            View view = this.f55197g;
            if (view != null) {
                view.setSelected(z);
            }
        }

        /* renamed from: a */
        public void mo78328a(Canvas canvas) {
            Drawable drawable = this.f55200j;
            if (drawable != null) {
                drawable.setBounds(getLeft(), getTop(), getRight(), getBottom());
                this.f55200j.draw(canvas);
            }
        }

        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            BadgeDrawable badgeDrawable = this.f55191a;
            if (badgeDrawable != null && badgeDrawable.isVisible()) {
                CharSequence contentDescription = getContentDescription();
                accessibilityNodeInfo.setContentDescription(((Object) contentDescription) + ", " + ((Object) this.f55191a.mo76498f()));
            }
            C0864d a = C0864d.m4171a(accessibilityNodeInfo);
            a.mo4567b(C0864d.C0867c.m4258a(0, 1, this.f55193c.mo78318c(), 1, false, isSelected()));
            if (isSelected()) {
                a.mo4592h(false);
                a.mo4569b(C0864d.C0865a.f3373e);
            }
            a.mo4595i("Tab");
        }

        /* renamed from: a */
        public void mo78327a(Context context) {
            GradientDrawable gradientDrawable = null;
            if (TabLayout.this.f55148o != 0) {
                Drawable b = C0215a.m655b(context, TabLayout.this.f55148o);
                this.f55200j = b;
                if (b != null && b.isStateful()) {
                    this.f55200j.setState(getDrawableState());
                }
            } else {
                this.f55200j = null;
            }
            Drawable gradientDrawable2 = new GradientDrawable();
            ((GradientDrawable) gradientDrawable2).setColor(0);
            if (TabLayout.this.f55143j != null) {
                GradientDrawable gradientDrawable3 = new GradientDrawable();
                gradientDrawable3.setCornerRadius(1.0E-5f);
                gradientDrawable3.setColor(-1);
                ColorStateList a = C22375b.m81038a(TabLayout.this.f55143j);
                if (Build.VERSION.SDK_INT >= 21) {
                    if (TabLayout.this.f55156w) {
                        gradientDrawable2 = null;
                    }
                    if (!TabLayout.this.f55156w) {
                        gradientDrawable = gradientDrawable3;
                    }
                    gradientDrawable2 = new RippleDrawable(a, gradientDrawable2, gradientDrawable);
                } else {
                    Drawable g = C0774a.m3779g(gradientDrawable3);
                    C0774a.m3768a(g, a);
                    gradientDrawable2 = new LayerDrawable(new Drawable[]{gradientDrawable2, g});
                }
            }
            ViewCompat.m4039a(this, gradientDrawable2);
            TabLayout.this.invalidate();
        }

        /* renamed from: a */
        public void mo78329a(View view) {
            if (mo78332d() && view == this.f55196f) {
                C22143a.m79831c(this.f55191a, view, m81467d(view));
            }
        }

        public C22453h(Context context) {
            super(context);
            mo78327a(context);
            ViewCompat.m4058b(this, TabLayout.this.f55136c, TabLayout.this.f55137d, TabLayout.this.f55138e, TabLayout.this.f55139f);
            setGravity(17);
            setOrientation(!TabLayout.this.f55154u ? 1 : 0);
            setClickable(true);
            ViewCompat.m4045a(this, C0914p.m4401a(getContext(), 1002));
        }

        /* renamed from: a */
        private void m81463a(TextView textView, ImageView imageView) {
            Drawable drawable;
            CharSequence charSequence;
            CharSequence charSequence2;
            int i;
            C22451f fVar = this.f55193c;
            CharSequence charSequence3 = null;
            if (fVar == null || fVar.mo78315b() == null) {
                drawable = null;
            } else {
                drawable = C0774a.m3779g(this.f55193c.mo78315b()).mutate();
            }
            C22451f fVar2 = this.f55193c;
            if (fVar2 != null) {
                charSequence = fVar2.mo78319d();
            } else {
                charSequence = null;
            }
            if (imageView != null) {
                if (drawable != null) {
                    imageView.setImageDrawable(drawable);
                    imageView.setVisibility(0);
                    setVisibility(0);
                } else {
                    imageView.setVisibility(8);
                    imageView.setImageDrawable(null);
                }
            }
            boolean z = !TextUtils.isEmpty(charSequence);
            if (textView != null) {
                if (z) {
                    textView.setText(charSequence);
                    if (this.f55193c.f55181c == 1) {
                        textView.setVisibility(0);
                    } else {
                        textView.setVisibility(8);
                    }
                    setVisibility(0);
                } else {
                    textView.setVisibility(8);
                    textView.setText((CharSequence) null);
                }
            }
            if (imageView != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
                if (!z || imageView.getVisibility() != 0) {
                    i = 0;
                } else {
                    i = (int) C22365r.m81020a(getContext(), 8);
                }
                if (TabLayout.this.f55154u) {
                    if (i != C0906h.m4357b(marginLayoutParams)) {
                        C0906h.m4358b(marginLayoutParams, i);
                        marginLayoutParams.bottomMargin = 0;
                        imageView.setLayoutParams(marginLayoutParams);
                        imageView.requestLayout();
                    }
                } else if (i != marginLayoutParams.bottomMargin) {
                    marginLayoutParams.bottomMargin = i;
                    C0906h.m4358b(marginLayoutParams, 0);
                    imageView.setLayoutParams(marginLayoutParams);
                    imageView.requestLayout();
                }
            }
            C22451f fVar3 = this.f55193c;
            if (fVar3 != null) {
                charSequence2 = fVar3.f55180b;
            } else {
                charSequence2 = null;
            }
            if (!z) {
                charSequence3 = charSequence2;
            }
            C0431ah.m1845a(this, charSequence3);
        }

        public void onMeasure(int i, int i2) {
            Layout layout;
            int size = View.MeasureSpec.getSize(i);
            int mode = View.MeasureSpec.getMode(i);
            int tabMaxWidth = TabLayout.this.getTabMaxWidth();
            if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
                i = View.MeasureSpec.makeMeasureSpec(TabLayout.this.f55149p, Integer.MIN_VALUE);
            }
            super.onMeasure(i, i2);
            if (this.f55194d != null) {
                float f = TabLayout.this.f55146m;
                int i3 = this.f55201k;
                ImageView imageView = this.f55195e;
                boolean z = true;
                if (imageView == null || imageView.getVisibility() != 0) {
                    TextView textView = this.f55194d;
                    if (textView != null && textView.getLineCount() > 1) {
                        f = TabLayout.this.f55147n;
                    }
                } else {
                    i3 = 1;
                }
                float textSize = this.f55194d.getTextSize();
                int lineCount = this.f55194d.getLineCount();
                int a = TextViewCompat.m4486a(this.f55194d);
                int i4 = (f > textSize ? 1 : (f == textSize ? 0 : -1));
                if (i4 != 0 || (a >= 0 && i3 != a)) {
                    if (TabLayout.this.f55153t == 1 && i4 > 0 && lineCount == 1 && ((layout = this.f55194d.getLayout()) == null || m81462a(layout, 0, f) > ((float) ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight())))) {
                        z = false;
                    }
                    if (z) {
                        this.f55194d.setTextSize(0, f);
                        this.f55194d.setMaxLines(i3);
                        super.onMeasure(i, i2);
                    }
                }
            }
        }

        /* renamed from: a */
        private float m81462a(Layout layout, int i, float f) {
            return layout.getLineWidth(i) * (f / layout.getPaint().getTextSize());
        }
    }

    public int getTabGravity() {
        return this.f55150q;
    }

    public ColorStateList getTabIconTint() {
        return this.f55142i;
    }

    public int getTabIndicatorGravity() {
        return this.f55152s;
    }

    /* access modifiers changed from: package-private */
    public int getTabMaxWidth() {
        return this.f55149p;
    }

    public int getTabMode() {
        return this.f55153t;
    }

    public ColorStateList getTabRippleColor() {
        return this.f55143j;
    }

    public Drawable getTabSelectedIndicator() {
        return this.f55144k;
    }

    public ColorStateList getTabTextColors() {
        return this.f55141h;
    }

    /* renamed from: a */
    public void mo78230a(int i, float f, boolean z, boolean z2) {
        int round = Math.round(((float) i) + f);
        if (round >= 0 && round < this.f55135b.getChildCount()) {
            if (z2) {
                this.f55135b.mo78298a(i, f);
            }
            ValueAnimator valueAnimator = this.f55127J;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f55127J.cancel();
            }
            scrollTo(m81394a(i, f), 0);
            if (z) {
                setSelectedTabView(round);
            }
        }
    }

    /* renamed from: a */
    public void mo78234a(C22451f fVar) {
        mo78236a(fVar, this.f55118A.isEmpty());
    }

    /* renamed from: a */
    public void mo78236a(C22451f fVar, boolean z) {
        mo78235a(fVar, this.f55118A.size(), z);
    }

    /* renamed from: a */
    public void mo78235a(C22451f fVar, int i, boolean z) {
        if (fVar.f55182d == this) {
            m81400a(fVar, i);
            m81405e(fVar);
            if (z) {
                fVar.mo78321f();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
    }

    /* renamed from: a */
    public void mo78233a(AbstractC22445b bVar) {
        if (!this.f55125H.contains(bVar)) {
            this.f55125H.add(bVar);
        }
    }

    /* renamed from: a */
    public C22451f mo78227a(int i) {
        if (i < 0 || i >= getTabCount()) {
            return null;
        }
        return this.f55118A.get(i);
    }

    /* renamed from: a */
    public void mo78232a(ViewPager viewPager, boolean z) {
        m81398a(viewPager, z, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo78231a(PagerAdapter pagerAdapter, boolean z) {
        DataSetObserver dataSetObserver;
        PagerAdapter pagerAdapter2 = this.f55128K;
        if (!(pagerAdapter2 == null || (dataSetObserver = this.f55129L) == null)) {
            pagerAdapter2.unregisterDataSetObserver(dataSetObserver);
        }
        this.f55128K = pagerAdapter;
        if (z && pagerAdapter != null) {
            if (this.f55129L == null) {
                this.f55129L = new C22447d();
            }
            pagerAdapter.registerDataSetObserver(this.f55129L);
        }
        mo78249e();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo78237a(boolean z) {
        for (int i = 0; i < this.f55135b.getChildCount(); i++) {
            View childAt = this.f55135b.getChildAt(i);
            childAt.setMinimumWidth(getTabMinWidth());
            m81397a((LinearLayout.LayoutParams) childAt.getLayoutParams());
            if (z) {
                childAt.requestLayout();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.google.android.material.tabs.TabLayout$d */
    public class C22447d extends DataSetObserver {
        public void onChanged() {
            TabLayout.this.mo78249e();
        }

        public void onInvalidated() {
            TabLayout.this.mo78249e();
        }

        C22447d() {
        }
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$g */
    public static class C22452g implements ViewPager.OnPageChangeListener {

        /* renamed from: a */
        private final WeakReference<TabLayout> f55188a;

        /* renamed from: b */
        private int f55189b;

        /* renamed from: c */
        private int f55190c;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo78325a() {
            this.f55190c = 0;
            this.f55189b = 0;
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i) {
            this.f55189b = this.f55190c;
            this.f55190c = i;
        }

        public C22452g(TabLayout tabLayout) {
            this.f55188a = new WeakReference<>(tabLayout);
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i) {
            boolean z;
            TabLayout tabLayout = this.f55188a.get();
            if (tabLayout != null && tabLayout.getSelectedTabPosition() != i && i < tabLayout.getTabCount()) {
                int i2 = this.f55190c;
                if (i2 == 0 || (i2 == 2 && this.f55189b == 0)) {
                    z = true;
                } else {
                    z = false;
                }
                tabLayout.mo78244b(tabLayout.mo78227a(i), z);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i, float f, int i2) {
            boolean z;
            TabLayout tabLayout = this.f55188a.get();
            if (tabLayout != null) {
                int i3 = this.f55190c;
                boolean z2 = false;
                if (i3 != 2 || this.f55189b == 1) {
                    z = true;
                } else {
                    z = false;
                }
                if (!(i3 == 2 && this.f55189b == 0)) {
                    z2 = true;
                }
                tabLayout.mo78230a(i, f, z, z2);
            }
        }
    }

    /* renamed from: a */
    public void mo78228a() {
        this.f55125H.clear();
    }

    public int getTabCount() {
        return this.f55118A.size();
    }

    /* renamed from: g */
    private LinearLayout.LayoutParams m81408g() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        m81397a(layoutParams);
        return layoutParams;
    }

    /* renamed from: b */
    public C22451f mo78242b() {
        C22451f c = mo78246c();
        c.f55182d = this;
        c.f55183e = m81403d(c);
        return c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public C22451f mo78246c() {
        C22451f acquire = f55117z.acquire();
        if (acquire == null) {
            return new C22451f();
        }
        return acquire;
    }

    public int getSelectedTabPosition() {
        C22451f fVar = this.f55119B;
        if (fVar != null) {
            return fVar.mo78318c();
        }
        return -1;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f55132O) {
            setupWithViewPager(null);
            this.f55132O = false;
        }
    }

    public boolean shouldDelayChildPressedState() {
        if (getTabScrollRange() > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    private void m81406f() {
        int size = this.f55118A.size();
        for (int i = 0; i < size; i++) {
            this.f55118A.get(i).mo78323h();
        }
    }

    private int getTabMinWidth() {
        int i = this.f55120C;
        if (i != -1) {
            return i;
        }
        int i2 = this.f55153t;
        if (i2 == 0 || i2 == 2) {
            return this.f55122E;
        }
        return 0;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.f55135b.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C22394h.m81147a(this);
        if (this.f55157x == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                m81398a((ViewPager) parent, true, true);
            }
        }
    }

    private int getDefaultHeight() {
        int size = this.f55118A.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i < size) {
                C22451f fVar = this.f55118A.get(i);
                if (fVar != null && fVar.mo78315b() != null && !TextUtils.isEmpty(fVar.mo78319d())) {
                    z = true;
                    break;
                }
                i++;
            } else {
                break;
            }
        }
        if (!z || this.f55154u) {
            return 48;
        }
        return 72;
    }

    /* renamed from: h */
    private void m81410h() {
        if (this.f55127J == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f55127J = valueAnimator;
            valueAnimator.setInterpolator(C22116a.f53780b);
            this.f55127J.setDuration((long) this.f55151r);
            this.f55127J.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                /* class com.google.android.material.tabs.TabLayout.C224431 */

                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    TabLayout.this.scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
                }
            });
        }
    }

    /* renamed from: i */
    private void m81412i() {
        int i;
        int i2 = this.f55153t;
        if (i2 == 0 || i2 == 2) {
            i = Math.max(0, this.f55123F - this.f55136c);
        } else {
            i = 0;
        }
        ViewCompat.m4058b(this.f55135b, i, 0, 0, 0);
        int i3 = this.f55153t;
        if (i3 == 0) {
            m81404d(this.f55150q);
        } else if (i3 == 1 || i3 == 2) {
            if (this.f55150q == 2) {
                Log.w("TabLayout", "GRAVITY_START is not supported with the current tab mode, GRAVITY_CENTER will be used instead");
            }
            this.f55135b.setGravity(1);
        }
        mo78237a(true);
    }

    /* renamed from: d */
    public void mo78248d() {
        for (int childCount = this.f55135b.getChildCount() - 1; childCount >= 0; childCount--) {
            m81401b(childCount);
        }
        Iterator<C22451f> it = this.f55118A.iterator();
        while (it.hasNext()) {
            C22451f next = it.next();
            it.remove();
            next.mo78324i();
            mo78245b(next);
        }
        this.f55119B = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo78249e() {
        int currentItem;
        mo78248d();
        PagerAdapter pagerAdapter = this.f55128K;
        if (pagerAdapter != null) {
            int count = pagerAdapter.getCount();
            for (int i = 0; i < count; i++) {
                mo78236a(mo78242b().mo78314a(this.f55128K.getPageTitle(i)), false);
            }
            ViewPager viewPager = this.f55157x;
            if (viewPager != null && count > 0 && (currentItem = viewPager.getCurrentItem()) != getSelectedTabPosition() && currentItem < getTabCount()) {
                mo78247c(mo78227a(currentItem));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.tabs.TabLayout$e */
    public class C22448e extends LinearLayout {

        /* renamed from: a */
        int f55162a = -1;

        /* renamed from: b */
        float f55163b;

        /* renamed from: c */
        int f55164c = -1;

        /* renamed from: d */
        int f55165d = -1;

        /* renamed from: e */
        ValueAnimator f55166e;

        /* renamed from: f */
        public int f55167f = -1;

        /* renamed from: g */
        public int f55168g = -1;

        /* renamed from: i */
        private int f55170i;

        /* renamed from: j */
        private final Paint f55171j;

        /* renamed from: k */
        private final GradientDrawable f55172k;

        /* renamed from: l */
        private int f55173l = -1;

        /* renamed from: b */
        private void m81439b() {
            int i;
            int i2;
            View childAt = getChildAt(this.f55162a);
            if (childAt == null || childAt.getWidth() <= 0) {
                i2 = -1;
                i = -1;
            } else {
                i2 = childAt.getLeft();
                i = childAt.getRight();
                if (!TabLayout.this.f55155v && (childAt instanceof C22453h)) {
                    m81437a((C22453h) childAt, TabLayout.this.f55134a);
                    i2 = (int) TabLayout.this.f55134a.left;
                    i = (int) TabLayout.this.f55134a.right;
                }
                if (this.f55163b > BitmapDescriptorFactory.HUE_RED && this.f55162a < getChildCount() - 1) {
                    View childAt2 = getChildAt(this.f55162a + 1);
                    int left = childAt2.getLeft();
                    int right = childAt2.getRight();
                    if (!TabLayout.this.f55155v && (childAt2 instanceof C22453h)) {
                        m81437a((C22453h) childAt2, TabLayout.this.f55134a);
                        left = (int) TabLayout.this.f55134a.left;
                        right = (int) TabLayout.this.f55134a.right;
                    }
                    float f = this.f55163b;
                    i2 = (int) ((((float) left) * f) + ((1.0f - f) * ((float) i2)));
                    i = (int) ((((float) right) * f) + ((1.0f - f) * ((float) i)));
                }
            }
            mo78299a(i2, i);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo78300a() {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                if (getChildAt(i).getWidth() <= 0) {
                    return true;
                }
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo78301b(int i) {
            if (this.f55170i != i) {
                this.f55170i = i;
                ViewCompat.m4073e(this);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo78297a(int i) {
            if (this.f55171j.getColor() != i) {
                this.f55171j.setColor(i);
                ViewCompat.m4073e(this);
            }
        }

        public void onRtlPropertiesChanged(int i) {
            super.onRtlPropertiesChanged(i);
            if (Build.VERSION.SDK_INT < 23 && this.f55173l != i) {
                requestLayout();
                this.f55173l = i;
            }
        }

        public void draw(Canvas canvas) {
            int i;
            Drawable drawable;
            int i2 = 0;
            if (TabLayout.this.f55144k != null) {
                i = TabLayout.this.f55144k.getIntrinsicHeight();
            } else {
                i = 0;
            }
            int i3 = this.f55170i;
            if (i3 >= 0) {
                i = i3;
            }
            int i4 = TabLayout.this.f55152s;
            if (i4 == 0) {
                i2 = getHeight() - i;
                i = getHeight();
            } else if (i4 == 1) {
                i2 = (getHeight() - i) / 2;
                i = (getHeight() + i) / 2;
            } else if (i4 != 2) {
                if (i4 != 3) {
                    i = 0;
                } else {
                    i = getHeight();
                }
            }
            int i5 = this.f55164c;
            if (i5 >= 0 && this.f55165d > i5) {
                if (TabLayout.this.f55144k != null) {
                    drawable = TabLayout.this.f55144k;
                } else {
                    drawable = this.f55172k;
                }
                Drawable mutate = C0774a.m3779g(drawable).mutate();
                mutate.setBounds(this.f55164c, i2, this.f55165d, i);
                if (this.f55171j != null) {
                    if (Build.VERSION.SDK_INT == 21) {
                        mutate.setColorFilter(this.f55171j.getColor(), PorterDuff.Mode.SRC_IN);
                    } else {
                        C0774a.m3766a(mutate, this.f55171j.getColor());
                    }
                }
                mutate.draw(canvas);
            }
            super.draw(canvas);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo78299a(int i, int i2) {
            if (i != this.f55164c || i2 != this.f55165d) {
                this.f55164c = i;
                this.f55165d = i2;
                ViewCompat.m4073e(this);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo78302b(int i, int i2) {
            ValueAnimator valueAnimator = this.f55166e;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f55166e.cancel();
            }
            m81438a(true, i, i2);
        }

        C22448e(Context context) {
            super(context);
            setWillNotDraw(false);
            this.f55171j = new Paint();
            this.f55172k = new GradientDrawable();
        }

        /* renamed from: a */
        private void m81437a(C22453h hVar, RectF rectF) {
            int contentWidth = hVar.getContentWidth();
            int a = (int) C22365r.m81020a(getContext(), 24);
            if (contentWidth < a) {
                contentWidth = a;
            }
            int left = (hVar.getLeft() + hVar.getRight()) / 2;
            int i = contentWidth / 2;
            rectF.set((float) (left - i), BitmapDescriptorFactory.HUE_RED, (float) (left + i), BitmapDescriptorFactory.HUE_RED);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo78298a(int i, float f) {
            ValueAnimator valueAnimator = this.f55166e;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f55166e.cancel();
            }
            this.f55162a = i;
            this.f55163b = f;
            m81439b();
        }

        /* access modifiers changed from: protected */
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            if (View.MeasureSpec.getMode(i) == 1073741824) {
                boolean z = true;
                if (TabLayout.this.f55150q == 1 || TabLayout.this.f55153t == 2) {
                    int childCount = getChildCount();
                    int i3 = 0;
                    for (int i4 = 0; i4 < childCount; i4++) {
                        View childAt = getChildAt(i4);
                        if (childAt.getVisibility() == 0) {
                            i3 = Math.max(i3, childAt.getMeasuredWidth());
                        }
                    }
                    if (i3 > 0) {
                        if (i3 * childCount <= getMeasuredWidth() - (((int) C22365r.m81020a(getContext(), 16)) * 2)) {
                            boolean z2 = false;
                            for (int i5 = 0; i5 < childCount; i5++) {
                                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i5).getLayoutParams();
                                if (layoutParams.width != i3 || layoutParams.weight != BitmapDescriptorFactory.HUE_RED) {
                                    layoutParams.width = i3;
                                    layoutParams.weight = BitmapDescriptorFactory.HUE_RED;
                                    z2 = true;
                                }
                            }
                            z = z2;
                        } else {
                            TabLayout.this.f55150q = 0;
                            TabLayout.this.mo78237a(false);
                        }
                        if (z) {
                            super.onMeasure(i, i2);
                        }
                    }
                }
            }
        }

        /* renamed from: a */
        private void m81438a(boolean z, final int i, int i2) {
            View childAt = getChildAt(i);
            if (childAt == null) {
                m81439b();
                return;
            }
            final int left = childAt.getLeft();
            final int right = childAt.getRight();
            if (!TabLayout.this.f55155v && (childAt instanceof C22453h)) {
                m81437a((C22453h) childAt, TabLayout.this.f55134a);
                left = (int) TabLayout.this.f55134a.left;
                right = (int) TabLayout.this.f55134a.right;
            }
            int i3 = this.f55164c;
            int i4 = this.f55165d;
            if (i3 != left || i4 != right) {
                if (z) {
                    this.f55167f = i3;
                    this.f55168g = i4;
                }
                C224491 r0 = new ValueAnimator.AnimatorUpdateListener() {
                    /* class com.google.android.material.tabs.TabLayout.C22448e.C224491 */

                    public void onAnimationUpdate(ValueAnimator valueAnimator) {
                        float animatedFraction = valueAnimator.getAnimatedFraction();
                        C22448e eVar = C22448e.this;
                        eVar.mo78299a(C22116a.m79706a(eVar.f55167f, left, animatedFraction), C22116a.m79706a(C22448e.this.f55168g, right, animatedFraction));
                    }
                };
                if (z) {
                    ValueAnimator valueAnimator = new ValueAnimator();
                    this.f55166e = valueAnimator;
                    valueAnimator.setInterpolator(C22116a.f53780b);
                    valueAnimator.setDuration((long) i2);
                    valueAnimator.setFloatValues(BitmapDescriptorFactory.HUE_RED, 1.0f);
                    valueAnimator.addUpdateListener(r0);
                    valueAnimator.addListener(new AnimatorListenerAdapter() {
                        /* class com.google.android.material.tabs.TabLayout.C22448e.C224502 */

                        public void onAnimationStart(Animator animator) {
                            C22448e.this.f55162a = i;
                        }

                        public void onAnimationEnd(Animator animator) {
                            C22448e.this.f55162a = i;
                            C22448e.this.f55163b = BitmapDescriptorFactory.HUE_RED;
                        }
                    });
                    valueAnimator.start();
                    return;
                }
                this.f55166e.removeAllUpdateListeners();
                this.f55166e.addUpdateListener(r0);
            }
        }

        /* access modifiers changed from: protected */
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            ValueAnimator valueAnimator = this.f55166e;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                m81439b();
            } else {
                m81438a(false, this.f55162a, -1);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.google.android.material.tabs.TabLayout$a */
    public class C22444a implements ViewPager.AbstractC1578c {

        /* renamed from: b */
        private boolean f55160b;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo78291a(boolean z) {
            this.f55160b = z;
        }

        C22444a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.AbstractC1578c
        /* renamed from: a */
        public void mo8153a(ViewPager viewPager, PagerAdapter pagerAdapter, PagerAdapter pagerAdapter2) {
            if (TabLayout.this.f55157x == viewPager) {
                TabLayout.this.mo78231a(pagerAdapter2, this.f55160b);
            }
        }
    }

    public void addView(View view) {
        m81396a(view);
    }

    public void setOnTabSelectedListener(AbstractC22446c cVar) {
        setOnTabSelectedListener((AbstractC22445b) cVar);
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$i */
    public static class C22455i implements AbstractC22446c {

        /* renamed from: a */
        private final ViewPager f55204a;

        @Override // com.google.android.material.tabs.TabLayout.AbstractC22445b
        /* renamed from: b */
        public void mo78293b(C22451f fVar) {
        }

        @Override // com.google.android.material.tabs.TabLayout.AbstractC22445b
        /* renamed from: c */
        public void mo78294c(C22451f fVar) {
        }

        public C22455i(ViewPager viewPager) {
            this.f55204a = viewPager;
        }

        @Override // com.google.android.material.tabs.TabLayout.AbstractC22445b
        /* renamed from: a */
        public void mo78292a(C22451f fVar) {
            this.f55204a.setCurrentItem(fVar.mo78318c());
        }
    }

    public TabLayout(Context context) {
        this(context, null);
    }

    /* renamed from: b */
    public void mo78243b(AbstractC22445b bVar) {
        this.f55125H.remove(bVar);
    }

    /* renamed from: c */
    public void mo78247c(C22451f fVar) {
        mo78244b(fVar, true);
    }

    public void setElevation(float f) {
        super.setElevation(f);
        C22394h.m81148a(this, f);
    }

    public void setSelectedTabIndicatorColor(int i) {
        this.f55135b.mo78297a(i);
    }

    public void setSelectedTabIndicatorHeight(int i) {
        this.f55135b.mo78301b(i);
    }

    public void setTabIndicatorFullWidth(boolean z) {
        this.f55155v = z;
        ViewCompat.m4073e(this.f55135b);
    }

    public void setTabsFromPagerAdapter(PagerAdapter pagerAdapter) {
        mo78231a(pagerAdapter, false);
    }

    public void setupWithViewPager(ViewPager viewPager) {
        mo78232a(viewPager, true);
    }

    @Override // android.widget.FrameLayout, android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    public void setInlineLabelResource(int i) {
        setInlineLabel(getResources().getBoolean(i));
    }

    public void setOnTabSelectedListener(AbstractC22445b bVar) {
        AbstractC22445b bVar2 = this.f55124G;
        if (bVar2 != null) {
            mo78243b(bVar2);
        }
        this.f55124G = bVar;
        if (bVar != null) {
            mo78233a(bVar);
        }
    }

    /* access modifiers changed from: package-private */
    public void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        m81410h();
        this.f55127J.addListener(animatorListener);
    }

    public void setSelectedTabIndicator(Drawable drawable) {
        if (this.f55144k != drawable) {
            this.f55144k = drawable;
            ViewCompat.m4073e(this.f55135b);
        }
    }

    public void setSelectedTabIndicatorGravity(int i) {
        if (this.f55152s != i) {
            this.f55152s = i;
            ViewCompat.m4073e(this.f55135b);
        }
    }

    public void setTabGravity(int i) {
        if (this.f55150q != i) {
            this.f55150q = i;
            m81412i();
        }
    }

    public void setTabIconTint(ColorStateList colorStateList) {
        if (this.f55142i != colorStateList) {
            this.f55142i = colorStateList;
            m81406f();
        }
    }

    public void setTabIconTintResource(int i) {
        setTabIconTint(C0215a.m652a(getContext(), i));
    }

    public void setTabMode(int i) {
        if (i != this.f55153t) {
            this.f55153t = i;
            m81412i();
        }
    }

    public void setTabRippleColorResource(int i) {
        setTabRippleColor(C0215a.m652a(getContext(), i));
    }

    public void setTabTextColors(ColorStateList colorStateList) {
        if (this.f55141h != colorStateList) {
            this.f55141h = colorStateList;
            m81406f();
        }
    }

    public void setUnboundedRippleResource(int i) {
        setUnboundedRipple(getResources().getBoolean(i));
    }

    /* renamed from: b */
    private void m81401b(int i) {
        C22453h hVar = (C22453h) this.f55135b.getChildAt(i);
        this.f55135b.removeViewAt(i);
        if (hVar != null) {
            hVar.mo78326a();
            this.f55133P.release(hVar);
        }
        requestLayout();
    }

    /* renamed from: d */
    private void m81404d(int i) {
        if (i == 0) {
            Log.w("TabLayout", "MODE_SCROLLABLE + GRAVITY_FILL is not supported, GRAVITY_START will be used instead");
        } else if (i == 1) {
            this.f55135b.setGravity(1);
            return;
        } else if (i != 2) {
            return;
        }
        this.f55135b.setGravity(8388611);
    }

    /* renamed from: e */
    private void m81405e(C22451f fVar) {
        C22453h hVar = fVar.f55183e;
        hVar.setSelected(false);
        hVar.setActivated(false);
        this.f55135b.addView(hVar, fVar.mo78318c(), m81408g());
    }

    /* renamed from: g */
    private void m81409g(C22451f fVar) {
        for (int size = this.f55125H.size() - 1; size >= 0; size--) {
            this.f55125H.get(size).mo78293b(fVar);
        }
    }

    /* renamed from: h */
    private void m81411h(C22451f fVar) {
        for (int size = this.f55125H.size() - 1; size >= 0; size--) {
            this.f55125H.get(size).mo78294c(fVar);
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        for (int i = 0; i < this.f55135b.getChildCount(); i++) {
            View childAt = this.f55135b.getChildAt(i);
            if (childAt instanceof C22453h) {
                ((C22453h) childAt).mo78328a(canvas);
            }
        }
        super.onDraw(canvas);
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C0864d.m4171a(accessibilityNodeInfo).mo4559a(C0864d.C0866b.m4257a(1, getTabCount(), false, 1));
    }

    public void setSelectedTabIndicator(int i) {
        if (i != 0) {
            setSelectedTabIndicator(C0215a.m655b(getContext(), i));
        } else {
            setSelectedTabIndicator((Drawable) null);
        }
    }

    /* renamed from: a */
    private void m81396a(View view) {
        if (view instanceof TabItem) {
            m81399a((TabItem) view);
            return;
        }
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    /* renamed from: d */
    private C22453h m81403d(C22451f fVar) {
        C22453h hVar;
        Pools.AbstractC0839a<C22453h> aVar = this.f55133P;
        if (aVar != null) {
            hVar = aVar.acquire();
        } else {
            hVar = null;
        }
        if (hVar == null) {
            hVar = new C22453h(getContext());
        }
        hVar.setTab(fVar);
        hVar.setFocusable(true);
        hVar.setMinimumWidth(getTabMinWidth());
        if (TextUtils.isEmpty(fVar.f55180b)) {
            hVar.setContentDescription(fVar.f55179a);
        } else {
            hVar.setContentDescription(fVar.f55180b);
        }
        return hVar;
    }

    /* renamed from: f */
    private void m81407f(C22451f fVar) {
        for (int size = this.f55125H.size() - 1; size >= 0; size--) {
            this.f55125H.get(size).mo78292a(fVar);
        }
    }

    private void setSelectedTabView(int i) {
        boolean z;
        int childCount = this.f55135b.getChildCount();
        if (i < childCount) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = this.f55135b.getChildAt(i2);
                boolean z2 = true;
                if (i2 == i) {
                    z = true;
                } else {
                    z = false;
                }
                childAt.setSelected(z);
                if (i2 != i) {
                    z2 = false;
                }
                childAt.setActivated(z2);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo78245b(C22451f fVar) {
        return f55117z.release(fVar);
    }

    public void setInlineLabel(boolean z) {
        if (this.f55154u != z) {
            this.f55154u = z;
            for (int i = 0; i < this.f55135b.getChildCount(); i++) {
                View childAt = this.f55135b.getChildAt(i);
                if (childAt instanceof C22453h) {
                    ((C22453h) childAt).mo78331c();
                }
            }
            m81412i();
        }
    }

    public void setTabRippleColor(ColorStateList colorStateList) {
        if (this.f55143j != colorStateList) {
            this.f55143j = colorStateList;
            for (int i = 0; i < this.f55135b.getChildCount(); i++) {
                View childAt = this.f55135b.getChildAt(i);
                if (childAt instanceof C22453h) {
                    ((C22453h) childAt).mo78327a(getContext());
                }
            }
        }
    }

    public void setUnboundedRipple(boolean z) {
        if (this.f55156w != z) {
            this.f55156w = z;
            for (int i = 0; i < this.f55135b.getChildCount(); i++) {
                View childAt = this.f55135b.getChildAt(i);
                if (childAt instanceof C22453h) {
                    ((C22453h) childAt).mo78327a(getContext());
                }
            }
        }
    }

    /* renamed from: c */
    private void m81402c(int i) {
        if (i != -1) {
            if (getWindowToken() == null || !ViewCompat.m4012F(this) || this.f55135b.mo78300a()) {
                mo78229a(i, BitmapDescriptorFactory.HUE_RED, true);
                return;
            }
            int scrollX = getScrollX();
            int a = m81394a(i, BitmapDescriptorFactory.HUE_RED);
            if (scrollX != a) {
                m81410h();
                this.f55127J.setIntValues(scrollX, a);
                this.f55127J.start();
            }
            this.f55135b.mo78302b(i, this.f55151r);
        }
    }

    /* renamed from: a */
    private void m81397a(LinearLayout.LayoutParams layoutParams) {
        if (this.f55153t == 1 && this.f55150q == 0) {
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
            return;
        }
        layoutParams.width = -2;
        layoutParams.weight = BitmapDescriptorFactory.HUE_RED;
    }

    /* renamed from: a */
    private void m81399a(TabItem tabItem) {
        C22451f b = mo78242b();
        if (tabItem.f55113a != null) {
            b.mo78314a(tabItem.f55113a);
        }
        if (tabItem.f55114b != null) {
            b.mo78312a(tabItem.f55114b);
        }
        if (tabItem.f55115c != 0) {
            b.mo78311a(tabItem.f55115c);
        }
        if (!TextUtils.isEmpty(tabItem.getContentDescription())) {
            b.mo78316b(tabItem.getContentDescription());
        }
        mo78234a(b);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i) {
        m81396a(view);
    }

    public TabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.tabStyle);
    }

    /* renamed from: a */
    private static ColorStateList m81395a(int i, int i2) {
        return new ColorStateList(new int[][]{SELECTED_STATE_SET, EMPTY_STATE_SET}, new int[]{i2, i});
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        m81396a(view);
    }

    /* renamed from: a */
    private int m81394a(int i, float f) {
        View view;
        int i2;
        int i3 = this.f55153t;
        int i4 = 0;
        if (i3 != 0 && i3 != 2) {
            return 0;
        }
        View childAt = this.f55135b.getChildAt(i);
        int i5 = i + 1;
        if (i5 < this.f55135b.getChildCount()) {
            view = this.f55135b.getChildAt(i5);
        } else {
            view = null;
        }
        if (childAt != null) {
            i2 = childAt.getWidth();
        } else {
            i2 = 0;
        }
        if (view != null) {
            i4 = view.getWidth();
        }
        int left = (childAt.getLeft() + (i2 / 2)) - (getWidth() / 2);
        int i6 = (int) (((float) (i2 + i4)) * 0.5f * f);
        if (ViewCompat.m4082h(this) == 0) {
            return left + i6;
        }
        return left - i6;
    }

    /* renamed from: b */
    public void mo78244b(C22451f fVar, boolean z) {
        int i;
        C22451f fVar2 = this.f55119B;
        if (fVar2 != fVar) {
            if (fVar != null) {
                i = fVar.mo78318c();
            } else {
                i = -1;
            }
            if (z) {
                if ((fVar2 == null || fVar2.mo78318c() == -1) && i != -1) {
                    mo78229a(i, BitmapDescriptorFactory.HUE_RED, true);
                } else {
                    m81402c(i);
                }
                if (i != -1) {
                    setSelectedTabView(i);
                }
            }
            this.f55119B = fVar;
            if (fVar2 != null) {
                m81409g(fVar2);
            }
            if (fVar != null) {
                m81407f(fVar);
            }
        } else if (fVar2 != null) {
            m81411h(fVar);
            m81402c(fVar.mo78318c());
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0073, code lost:
        if (r0 != 2) goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x007e, code lost:
        if (r7.getMeasuredWidth() != getMeasuredWidth()) goto L_0x0080;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0080, code lost:
        r4 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x008a, code lost:
        if (r7.getMeasuredWidth() < getMeasuredWidth()) goto L_0x0080;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r7, int r8) {
        /*
        // Method dump skipped, instructions count: 174
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.onMeasure(int, int):void");
    }

    /* renamed from: a */
    private void m81400a(C22451f fVar, int i) {
        fVar.mo78317b(i);
        this.f55118A.add(i, fVar);
        int size = this.f55118A.size();
        while (true) {
            i++;
            if (i < size) {
                this.f55118A.get(i).mo78317b(i);
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public void mo78229a(int i, float f, boolean z) {
        mo78230a(i, f, z, true);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        m81396a(view);
    }

    /* renamed from: a */
    private void m81398a(ViewPager viewPager, boolean z, boolean z2) {
        ViewPager viewPager2 = this.f55157x;
        if (viewPager2 != null) {
            C22452g gVar = this.f55130M;
            if (gVar != null) {
                viewPager2.removeOnPageChangeListener(gVar);
            }
            C22444a aVar = this.f55131N;
            if (aVar != null) {
                this.f55157x.removeOnAdapterChangeListener(aVar);
            }
        }
        AbstractC22445b bVar = this.f55126I;
        if (bVar != null) {
            mo78243b(bVar);
            this.f55126I = null;
        }
        if (viewPager != null) {
            this.f55157x = viewPager;
            if (this.f55130M == null) {
                this.f55130M = new C22452g(this);
            }
            this.f55130M.mo78325a();
            viewPager.addOnPageChangeListener(this.f55130M);
            C22455i iVar = new C22455i(viewPager);
            this.f55126I = iVar;
            mo78233a(iVar);
            PagerAdapter adapter = viewPager.getAdapter();
            if (adapter != null) {
                mo78231a(adapter, z);
            }
            if (this.f55131N == null) {
                this.f55131N = new C22444a();
            }
            this.f55131N.mo78291a(z);
            viewPager.addOnAdapterChangeListener(this.f55131N);
            mo78229a(viewPager.getCurrentItem(), BitmapDescriptorFactory.HUE_RED, true);
        } else {
            this.f55157x = null;
            mo78231a((PagerAdapter) null, false);
        }
        this.f55132O = z2;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public TabLayout(android.content.Context r13, android.util.AttributeSet r14, int r15) {
        /*
        // Method dump skipped, instructions count: 518
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
