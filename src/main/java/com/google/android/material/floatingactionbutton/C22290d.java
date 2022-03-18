package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.FloatEvaluator;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.core.graphics.drawable.C0774a;
import androidx.core.util.C0845f;
import androidx.core.view.ViewCompat;
import com.google.android.material.internal.C22348h;
import com.google.android.material.p980a.C22116a;
import com.google.android.material.p980a.C22117b;
import com.google.android.material.p980a.C22121f;
import com.google.android.material.p980a.C22122g;
import com.google.android.material.p980a.C22123h;
import com.google.android.material.p989j.C22372a;
import com.google.android.material.p989j.C22375b;
import com.google.android.material.p990k.AbstractC22377b;
import com.google.android.material.shape.AbstractC22413o;
import com.google.android.material.shape.C22394h;
import com.google.android.material.shape.C22398l;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import java.util.ArrayList;
import java.util.Iterator;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.material.floatingactionbutton.d */
public class C22290d {

    /* renamed from: a */
    static final TimeInterpolator f54530a = C22116a.f53781c;

    /* renamed from: p */
    static final int[] f54531p = {16842919, 16842910};

    /* renamed from: q */
    static final int[] f54532q = {16843623, 16842908, 16842910};

    /* renamed from: r */
    static final int[] f54533r = {16842908, 16842910};

    /* renamed from: s */
    static final int[] f54534s = {16843623, 16842910};

    /* renamed from: t */
    static final int[] f54535t = {16842910};

    /* renamed from: u */
    static final int[] f54536u = new int[0];

    /* renamed from: A */
    private C22123h f54537A;

    /* renamed from: B */
    private C22123h f54538B;

    /* renamed from: C */
    private float f54539C;

    /* renamed from: D */
    private int f54540D;

    /* renamed from: E */
    private ArrayList<Animator.AnimatorListener> f54541E;

    /* renamed from: F */
    private ArrayList<Animator.AnimatorListener> f54542F;

    /* renamed from: G */
    private ArrayList<AbstractC22299d> f54543G;

    /* renamed from: H */
    private final Rect f54544H = new Rect();

    /* renamed from: I */
    private final RectF f54545I = new RectF();

    /* renamed from: J */
    private final RectF f54546J = new RectF();

    /* renamed from: K */
    private final Matrix f54547K = new Matrix();

    /* renamed from: L */
    private ViewTreeObserver.OnPreDrawListener f54548L;

    /* renamed from: b */
    C22398l f54549b;

    /* renamed from: c */
    MaterialShapeDrawable f54550c;

    /* renamed from: d */
    Drawable f54551d;

    /* renamed from: e */
    C22287c f54552e;

    /* renamed from: f */
    Drawable f54553f;

    /* renamed from: g */
    boolean f54554g;

    /* renamed from: h */
    boolean f54555h = true;

    /* renamed from: i */
    float f54556i;

    /* renamed from: j */
    float f54557j;

    /* renamed from: k */
    float f54558k;

    /* renamed from: l */
    int f54559l;

    /* renamed from: m */
    public Animator f54560m;

    /* renamed from: n */
    public float f54561n = 1.0f;

    /* renamed from: o */
    public int f54562o;

    /* renamed from: v */
    final FloatingActionButton f54563v;

    /* renamed from: w */
    final AbstractC22377b f54564w;

    /* renamed from: x */
    private final C22348h f54565x;

    /* renamed from: y */
    private C22123h f54566y;

    /* renamed from: z */
    private C22123h f54567z;

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.floatingactionbutton.d$d */
    public interface AbstractC22299d {
        /* renamed from: a */
        void mo77572a();

        /* renamed from: b */
        void mo77573b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.floatingactionbutton.d$e */
    public interface AbstractC22300e {
        /* renamed from: a */
        void mo77564a();

        /* renamed from: b */
        void mo77565b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public void mo77639n() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public boolean mo77641p() {
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public boolean mo77644s() {
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public float mo77601a() {
        return this.f54556i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public float mo77616b() {
        return this.f54557j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public float mo77625c() {
        return this.f54558k;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final C22398l mo77629e() {
        return this.f54549b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final C22123h mo77631f() {
        return this.f54537A;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final C22123h mo77632g() {
        return this.f54538B;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public boolean mo77634i() {
        return this.f54554g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final Drawable mo77638m() {
        return this.f54553f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo77607a(ColorStateList colorStateList, PorterDuff.Mode mode, ColorStateList colorStateList2, int i) {
        MaterialShapeDrawable u = mo77646u();
        this.f54550c = u;
        u.setTintList(colorStateList);
        if (mode != null) {
            this.f54550c.setTintMode(mode);
        }
        this.f54550c.mo77947G(-12303292);
        this.f54550c.mo77965a(this.f54563v.getContext());
        C22372a aVar = new C22372a(this.f54550c.getShapeAppearanceModel());
        aVar.setTintList(C22375b.m81040b(colorStateList2));
        this.f54551d = aVar;
        this.f54553f = new LayerDrawable(new Drawable[]{(Drawable) C0845f.m3991a(this.f54550c), aVar});
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo77608a(PorterDuff.Mode mode) {
        MaterialShapeDrawable materialShapeDrawable = this.f54550c;
        if (materialShapeDrawable != null) {
            materialShapeDrawable.setTintMode(mode);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo77613a(C22398l lVar) {
        this.f54549b = lVar;
        MaterialShapeDrawable materialShapeDrawable = this.f54550c;
        if (materialShapeDrawable != null) {
            materialShapeDrawable.setShapeAppearanceModel(lVar);
        }
        Drawable drawable = this.f54551d;
        if (drawable instanceof AbstractC22413o) {
            ((AbstractC22413o) drawable).setShapeAppearanceModel(lVar);
        }
        C22287c cVar = this.f54552e;
        if (cVar != null) {
            cVar.mo77588a(lVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo77610a(C22123h hVar) {
        this.f54537A = hVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo77614a(boolean z) {
        this.f54554g = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo77615a(int[] iArr) {
        this.f54565x.mo77846a(iArr);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo77612a(final AbstractC22300e eVar, final boolean z) {
        if (!mo77648w()) {
            Animator animator = this.f54560m;
            if (animator != null) {
                animator.cancel();
            }
            if (m80680B()) {
                C22123h hVar = this.f54538B;
                if (hVar == null) {
                    hVar = m80686z();
                }
                AnimatorSet a = m80681a(hVar, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
                a.addListener(new AnimatorListenerAdapter() {
                    /* class com.google.android.material.floatingactionbutton.C22290d.C222911 */

                    /* renamed from: d */
                    private boolean f54571d;

                    public void onAnimationCancel(Animator animator) {
                        this.f54571d = true;
                    }

                    public void onAnimationStart(Animator animator) {
                        C22290d.this.f54563v.mo77767a(0, z);
                        C22290d.this.f54562o = 1;
                        C22290d.this.f54560m = animator;
                        this.f54571d = false;
                    }

                    public void onAnimationEnd(Animator animator) {
                        int i;
                        C22290d.this.f54562o = 0;
                        C22290d.this.f54560m = null;
                        if (!this.f54571d) {
                            FloatingActionButton floatingActionButton = C22290d.this.f54563v;
                            boolean z = z;
                            if (z) {
                                i = 8;
                            } else {
                                i = 4;
                            }
                            floatingActionButton.mo77767a(i, z);
                            AbstractC22300e eVar = eVar;
                            if (eVar != null) {
                                eVar.mo77565b();
                            }
                        }
                    }
                });
                ArrayList<Animator.AnimatorListener> arrayList = this.f54542F;
                if (arrayList != null) {
                    Iterator<Animator.AnimatorListener> it = arrayList.iterator();
                    while (it.hasNext()) {
                        a.addListener(it.next());
                    }
                }
                a.start();
                return;
            }
            this.f54563v.mo77767a(z ? 8 : 4, z);
            if (eVar != null) {
                eVar.mo77565b();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo77611a(AbstractC22299d dVar) {
        if (this.f54543G == null) {
            this.f54543G = new ArrayList<>();
        }
        this.f54543G.add(dVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo77609a(Rect rect) {
        int sizeDimension = this.f54554g ? (this.f54559l - this.f54563v.getSizeDimension()) / 2 : 0;
        float a = this.f54555h ? mo77601a() + this.f54558k : BitmapDescriptorFactory.HUE_RED;
        int max = Math.max(sizeDimension, (int) Math.ceil((double) a));
        int max2 = Math.max(sizeDimension, (int) Math.ceil((double) (a * 1.5f)));
        rect.set(max, max2, max, max2);
    }

    /* renamed from: com.google.android.material.floatingactionbutton.d$f */
    private class C22301f extends AbstractC22302g {
        /* access modifiers changed from: protected */
        @Override // com.google.android.material.floatingactionbutton.C22290d.AbstractC22302g
        /* renamed from: a */
        public float mo77658a() {
            return C22290d.this.f54556i;
        }

        C22301f() {
            super();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo77627d() {
        mo77628d(this.f54561n);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo77635j() {
        this.f54565x.mo77845a();
    }

    /* renamed from: com.google.android.material.floatingactionbutton.d$b */
    private class C22297b extends AbstractC22302g {
        /* access modifiers changed from: protected */
        @Override // com.google.android.material.floatingactionbutton.C22290d.AbstractC22302g
        /* renamed from: a */
        public float mo77658a() {
            return C22290d.this.f54556i + C22290d.this.f54557j;
        }

        C22297b() {
            super();
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.d$c */
    private class C22298c extends AbstractC22302g {
        /* access modifiers changed from: protected */
        @Override // com.google.android.material.floatingactionbutton.C22290d.AbstractC22302g
        /* renamed from: a */
        public float mo77658a() {
            return C22290d.this.f54556i + C22290d.this.f54558k;
        }

        C22298c() {
            super();
        }
    }

    /* renamed from: A */
    private ViewTreeObserver.OnPreDrawListener m80679A() {
        if (this.f54548L == null) {
            this.f54548L = new ViewTreeObserver.OnPreDrawListener() {
                /* class com.google.android.material.floatingactionbutton.C22290d.ViewTreeObserver$OnPreDrawListenerC222955 */

                public boolean onPreDraw() {
                    C22290d.this.mo77645t();
                    return true;
                }
            };
        }
        return this.f54548L;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public MaterialShapeDrawable mo77646u() {
        return new MaterialShapeDrawable((C22398l) C0845f.m3991a(this.f54549b));
    }

    /* renamed from: B */
    private boolean m80680B() {
        if (!ViewCompat.m4012F(this.f54563v) || this.f54563v.isInEditMode()) {
            return false;
        }
        return true;
    }

    /* renamed from: y */
    private C22123h m80685y() {
        if (this.f54566y == null) {
            this.f54566y = C22123h.m79717a(this.f54563v.getContext(), (int) R.animator.design_fab_show_motion_spec);
        }
        return (C22123h) C0845f.m3991a(this.f54566y);
    }

    /* renamed from: z */
    private C22123h m80686z() {
        if (this.f54567z == null) {
            this.f54567z = C22123h.m79717a(this.f54563v.getContext(), (int) R.animator.design_fab_hide_motion_spec);
        }
        return (C22123h) C0845f.m3991a(this.f54567z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final boolean mo77633h() {
        if (!this.f54554g || this.f54563v.getSizeDimension() >= this.f54559l) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo77636k() {
        ArrayList<AbstractC22299d> arrayList = this.f54543G;
        if (arrayList != null) {
            Iterator<AbstractC22299d> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().mo77572a();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo77637l() {
        ArrayList<AbstractC22299d> arrayList = this.f54543G;
        if (arrayList != null) {
            Iterator<AbstractC22299d> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().mo77573b();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public final void mo77640o() {
        Rect rect = this.f54544H;
        mo77609a(rect);
        mo77621b(rect);
        this.f54564w.mo77569a(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo77642q() {
        MaterialShapeDrawable materialShapeDrawable = this.f54550c;
        if (materialShapeDrawable != null) {
            C22394h.m81149a(this.f54563v, materialShapeDrawable);
        }
        if (mo77644s()) {
            this.f54563v.getViewTreeObserver().addOnPreDrawListener(m80679A());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo77643r() {
        ViewTreeObserver viewTreeObserver = this.f54563v.getViewTreeObserver();
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = this.f54548L;
        if (onPreDrawListener != null) {
            viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
            this.f54548L = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public void mo77645t() {
        float rotation = this.f54563v.getRotation();
        if (this.f54539C != rotation) {
            this.f54539C = rotation;
            mo77649x();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public boolean mo77647v() {
        if (this.f54563v.getVisibility() != 0) {
            if (this.f54562o == 2) {
                return true;
            }
            return false;
        } else if (this.f54562o != 1) {
            return true;
        } else {
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public boolean mo77648w() {
        if (this.f54563v.getVisibility() == 0) {
            if (this.f54562o == 1) {
                return true;
            }
            return false;
        } else if (this.f54562o != 2) {
            return true;
        } else {
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public void mo77649x() {
        if (Build.VERSION.SDK_INT == 19) {
            if (this.f54539C % 90.0f != BitmapDescriptorFactory.HUE_RED) {
                if (this.f54563v.getLayerType() != 1) {
                    this.f54563v.setLayerType(1, null);
                }
            } else if (this.f54563v.getLayerType() != 0) {
                this.f54563v.setLayerType(0, null);
            }
        }
        MaterialShapeDrawable materialShapeDrawable = this.f54550c;
        if (materialShapeDrawable != null) {
            materialShapeDrawable.mo77946F((int) this.f54539C);
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.d$a */
    private class C22296a extends AbstractC22302g {
        /* access modifiers changed from: protected */
        @Override // com.google.android.material.floatingactionbutton.C22290d.AbstractC22302g
        /* renamed from: a */
        public float mo77658a() {
            return BitmapDescriptorFactory.HUE_RED;
        }

        C22296a() {
            super();
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.d$g */
    private abstract class AbstractC22302g extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        private boolean f54583a;

        /* renamed from: c */
        private float f54585c;

        /* renamed from: d */
        private float f54586d;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract float mo77658a();

        private AbstractC22302g() {
        }

        public void onAnimationEnd(Animator animator) {
            C22290d.this.mo77630e((float) ((int) this.f54586d));
            this.f54583a = false;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float f;
            if (!this.f54583a) {
                if (C22290d.this.f54550c == null) {
                    f = BitmapDescriptorFactory.HUE_RED;
                } else {
                    f = C22290d.this.f54550c.mo77954S();
                }
                this.f54585c = f;
                this.f54586d = mo77658a();
                this.f54583a = true;
            }
            C22290d dVar = C22290d.this;
            float f2 = this.f54585c;
            dVar.mo77630e((float) ((int) (f2 + ((this.f54586d - f2) * valueAnimator.getAnimatedFraction()))));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo77622b(C22123h hVar) {
        this.f54538B = hVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo77630e(float f) {
        MaterialShapeDrawable materialShapeDrawable = this.f54550c;
        if (materialShapeDrawable != null) {
            materialShapeDrawable.mo77985r(f);
        }
    }

    /* renamed from: a */
    private void m80684a(ObjectAnimator objectAnimator) {
        if (Build.VERSION.SDK_INT == 26) {
            objectAnimator.setEvaluator(new TypeEvaluator<Float>() {
                /* class com.google.android.material.floatingactionbutton.C22290d.C222944 */

                /* renamed from: a */
                FloatEvaluator f54576a = new FloatEvaluator();

                /* renamed from: a */
                public Float evaluate(float f, Float f2, Float f3) {
                    float floatValue = this.f54576a.evaluate(f, (Number) f2, (Number) f3).floatValue();
                    if (floatValue < 0.1f) {
                        floatValue = BitmapDescriptorFactory.HUE_RED;
                    }
                    return Float.valueOf(floatValue);
                }
            });
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo77617b(float f) {
        if (this.f54557j != f) {
            this.f54557j = f;
            mo77603a(this.f54556i, f, this.f54558k);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo77626c(float f) {
        if (this.f54558k != f) {
            this.f54558k = f;
            mo77603a(this.f54556i, this.f54557j, f);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo77628d(float f) {
        this.f54561n = f;
        Matrix matrix = this.f54547K;
        m80683a(f, matrix);
        this.f54563v.setImageMatrix(matrix);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo77602a(float f) {
        if (this.f54556i != f) {
            this.f54556i = f;
            mo77603a(f, this.f54557j, this.f54558k);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo77618b(int i) {
        if (this.f54540D != i) {
            this.f54540D = i;
            mo77627d();
        }
    }

    /* renamed from: a */
    private ValueAnimator m80682a(AbstractC22302g gVar) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(f54530a);
        valueAnimator.setDuration(100L);
        valueAnimator.addListener(gVar);
        valueAnimator.addUpdateListener(gVar);
        valueAnimator.setFloatValues(BitmapDescriptorFactory.HUE_RED, 1.0f);
        return valueAnimator;
    }

    /* renamed from: b */
    public void mo77619b(Animator.AnimatorListener animatorListener) {
        if (this.f54542F == null) {
            this.f54542F = new ArrayList<>();
        }
        this.f54542F.add(animatorListener);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo77620b(ColorStateList colorStateList) {
        Drawable drawable = this.f54551d;
        if (drawable != null) {
            C0774a.m3768a(drawable, C22375b.m81040b(colorStateList));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo77621b(Rect rect) {
        C0845f.m3992a(this.f54553f, "Didn't initialize content background");
        if (mo77641p()) {
            this.f54564w.mo77570a(new InsetDrawable(this.f54553f, rect.left, rect.top, rect.right, rect.bottom));
            return;
        }
        this.f54564w.mo77570a(this.f54553f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo77604a(int i) {
        this.f54559l = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo77605a(Animator.AnimatorListener animatorListener) {
        if (this.f54541E == null) {
            this.f54541E = new ArrayList<>();
        }
        this.f54541E.add(animatorListener);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo77624b(boolean z) {
        this.f54555h = z;
        mo77640o();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo77606a(ColorStateList colorStateList) {
        MaterialShapeDrawable materialShapeDrawable = this.f54550c;
        if (materialShapeDrawable != null) {
            materialShapeDrawable.setTintList(colorStateList);
        }
        C22287c cVar = this.f54552e;
        if (cVar != null) {
            cVar.mo77587a(colorStateList);
        }
    }

    /* renamed from: a */
    private void m80683a(float f, Matrix matrix) {
        matrix.reset();
        Drawable drawable = this.f54563v.getDrawable();
        if (drawable != null && this.f54540D != 0) {
            RectF rectF = this.f54545I;
            RectF rectF2 = this.f54546J;
            rectF.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) drawable.getIntrinsicWidth(), (float) drawable.getIntrinsicHeight());
            int i = this.f54540D;
            rectF2.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) i, (float) i);
            matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
            int i2 = this.f54540D;
            matrix.postScale(f, f, ((float) i2) / 2.0f, ((float) i2) / 2.0f);
        }
    }

    C22290d(FloatingActionButton floatingActionButton, AbstractC22377b bVar) {
        this.f54563v = floatingActionButton;
        this.f54564w = bVar;
        C22348h hVar = new C22348h();
        this.f54565x = hVar;
        hVar.mo77847a(f54531p, m80682a((AbstractC22302g) new C22298c()));
        hVar.mo77847a(f54532q, m80682a((AbstractC22302g) new C22297b()));
        hVar.mo77847a(f54533r, m80682a((AbstractC22302g) new C22297b()));
        hVar.mo77847a(f54534s, m80682a((AbstractC22302g) new C22297b()));
        hVar.mo77847a(f54535t, m80682a((AbstractC22302g) new C22301f()));
        hVar.mo77847a(f54536u, m80682a((AbstractC22302g) new C22296a()));
        this.f54539C = floatingActionButton.getRotation();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo77623b(final AbstractC22300e eVar, final boolean z) {
        if (!mo77647v()) {
            Animator animator = this.f54560m;
            if (animator != null) {
                animator.cancel();
            }
            if (m80680B()) {
                if (this.f54563v.getVisibility() != 0) {
                    this.f54563v.setAlpha(BitmapDescriptorFactory.HUE_RED);
                    this.f54563v.setScaleY(BitmapDescriptorFactory.HUE_RED);
                    this.f54563v.setScaleX(BitmapDescriptorFactory.HUE_RED);
                    mo77628d(BitmapDescriptorFactory.HUE_RED);
                }
                C22123h hVar = this.f54537A;
                if (hVar == null) {
                    hVar = m80685y();
                }
                AnimatorSet a = m80681a(hVar, 1.0f, 1.0f, 1.0f);
                a.addListener(new AnimatorListenerAdapter() {
                    /* class com.google.android.material.floatingactionbutton.C22290d.C222922 */

                    public void onAnimationEnd(Animator animator) {
                        C22290d.this.f54562o = 0;
                        C22290d.this.f54560m = null;
                        AbstractC22300e eVar = eVar;
                        if (eVar != null) {
                            eVar.mo77564a();
                        }
                    }

                    public void onAnimationStart(Animator animator) {
                        C22290d.this.f54563v.mo77767a(0, z);
                        C22290d.this.f54562o = 2;
                        C22290d.this.f54560m = animator;
                    }
                });
                ArrayList<Animator.AnimatorListener> arrayList = this.f54541E;
                if (arrayList != null) {
                    Iterator<Animator.AnimatorListener> it = arrayList.iterator();
                    while (it.hasNext()) {
                        a.addListener(it.next());
                    }
                }
                a.start();
                return;
            }
            this.f54563v.mo77767a(0, z);
            this.f54563v.setAlpha(1.0f);
            this.f54563v.setScaleY(1.0f);
            this.f54563v.setScaleX(1.0f);
            mo77628d(1.0f);
            if (eVar != null) {
                eVar.mo77564a();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo77603a(float f, float f2, float f3) {
        mo77640o();
        mo77630e(f);
    }

    /* renamed from: a */
    private AnimatorSet m80681a(C22123h hVar, float f, float f2, float f3) {
        ArrayList arrayList = new ArrayList();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f54563v, View.ALPHA, f);
        hVar.mo76293b("opacity").mo76300a((Animator) ofFloat);
        arrayList.add(ofFloat);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f54563v, View.SCALE_X, f2);
        hVar.mo76293b("scale").mo76300a((Animator) ofFloat2);
        m80684a(ofFloat2);
        arrayList.add(ofFloat2);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f54563v, View.SCALE_Y, f2);
        hVar.mo76293b("scale").mo76300a((Animator) ofFloat3);
        m80684a(ofFloat3);
        arrayList.add(ofFloat3);
        m80683a(f3, this.f54547K);
        ObjectAnimator ofObject = ObjectAnimator.ofObject(this.f54563v, new C22121f(), new C22122g() {
            /* class com.google.android.material.floatingactionbutton.C22290d.C222933 */

            @Override // com.google.android.material.p980a.C22122g
            /* renamed from: a */
            public Matrix evaluate(float f, Matrix matrix, Matrix matrix2) {
                C22290d.this.f54561n = f;
                return super.evaluate(f, matrix, matrix2);
            }
        }, new Matrix(this.f54547K));
        hVar.mo76293b("iconScale").mo76300a((Animator) ofObject);
        arrayList.add(ofObject);
        AnimatorSet animatorSet = new AnimatorSet();
        C22117b.m79707a(animatorSet, arrayList);
        return animatorSet;
    }
}
