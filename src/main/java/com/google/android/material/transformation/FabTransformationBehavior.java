package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.Property;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import com.google.android.material.circularreveal.AbstractC22213b;
import com.google.android.material.circularreveal.C22211a;
import com.google.android.material.circularreveal.CircularRevealHelper;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.p980a.C22116a;
import com.google.android.material.p980a.C22117b;
import com.google.android.material.p980a.C22118c;
import com.google.android.material.p980a.C22119d;
import com.google.android.material.p980a.C22120e;
import com.google.android.material.p980a.C22123h;
import com.google.android.material.p980a.C22124i;
import com.google.android.material.p980a.C22125j;
import com.google.android.material.p987h.C22309a;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;
import java.util.ArrayList;
import java.util.List;

public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {

    /* renamed from: c */
    private final Rect f55358c;

    /* renamed from: d */
    private final RectF f55359d;

    /* renamed from: e */
    private final RectF f55360e;

    /* renamed from: f */
    private final int[] f55361f;

    /* renamed from: g */
    private float f55362g;

    /* renamed from: h */
    private float f55363h;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract C22504a mo78593a(Context context, boolean z);

    /* access modifiers changed from: protected */
    /* renamed from: com.google.android.material.transformation.FabTransformationBehavior$a */
    public static class C22504a {

        /* renamed from: a */
        public C22123h f55375a;

        /* renamed from: b */
        public C22125j f55376b;

        protected C22504a() {
        }
    }

    /* renamed from: a */
    private void m81678a(View view, View view2, boolean z, boolean z2, C22504a aVar, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator objectAnimator;
        float s = ViewCompat.m4104s(view2) - ViewCompat.m4104s(view);
        if (z) {
            if (!z2) {
                view2.setTranslationZ(-s);
            }
            objectAnimator = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Z, 0.0f);
        } else {
            objectAnimator = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Z, -s);
        }
        aVar.f55375a.mo76293b("elevation").mo76300a((Animator) objectAnimator);
        list.add(objectAnimator);
    }

    /* renamed from: a */
    private void m81676a(View view, View view2, boolean z, C22504a aVar, List<Animator> list) {
        float a = m81669a(view, view2, aVar.f55376b);
        float b = m81681b(view, view2, aVar.f55376b);
        Pair<C22124i, C22124i> a2 = m81671a(a, b, z, aVar);
        C22124i iVar = (C22124i) a2.first;
        C22124i iVar2 = (C22124i) a2.second;
        Property property = View.TRANSLATION_X;
        float[] fArr = new float[1];
        if (!z) {
            a = this.f55362g;
        }
        fArr[0] = a;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, property, fArr);
        Property property2 = View.TRANSLATION_Y;
        float[] fArr2 = new float[1];
        if (!z) {
            b = this.f55363h;
        }
        fArr2[0] = b;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, property2, fArr2);
        iVar.mo76300a((Animator) ofFloat);
        iVar2.mo76300a((Animator) ofFloat2);
        list.add(ofFloat);
        list.add(ofFloat2);
    }

    /* renamed from: a */
    private void m81679a(View view, View view2, boolean z, boolean z2, C22504a aVar, List<Animator> list, List<Animator.AnimatorListener> list2, RectF rectF) {
        ObjectAnimator objectAnimator;
        ObjectAnimator objectAnimator2;
        float a = m81669a(view, view2, aVar.f55376b);
        float b = m81681b(view, view2, aVar.f55376b);
        Pair<C22124i, C22124i> a2 = m81671a(a, b, z, aVar);
        C22124i iVar = (C22124i) a2.first;
        C22124i iVar2 = (C22124i) a2.second;
        if (z) {
            if (!z2) {
                view2.setTranslationX(-a);
                view2.setTranslationY(-b);
            }
            objectAnimator2 = ObjectAnimator.ofFloat(view2, View.TRANSLATION_X, 0.0f);
            objectAnimator = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Y, 0.0f);
            m81680a(view2, aVar, iVar, iVar2, -a, -b, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, rectF);
        } else {
            objectAnimator2 = ObjectAnimator.ofFloat(view2, View.TRANSLATION_X, -a);
            objectAnimator = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Y, -b);
        }
        iVar.mo76300a((Animator) objectAnimator2);
        iVar2.mo76300a((Animator) objectAnimator);
        list.add(objectAnimator2);
        list.add(objectAnimator);
    }

    /* renamed from: a */
    private void m81677a(View view, View view2, boolean z, boolean z2, C22504a aVar, float f, float f2, List<Animator> list, List<Animator.AnimatorListener> list2) {
        Animator animator;
        if (view2 instanceof AbstractC22213b) {
            final AbstractC22213b bVar = (AbstractC22213b) view2;
            float c = m81685c(view, view2, aVar.f55376b);
            float d = m81688d(view, view2, aVar.f55376b);
            ((FloatingActionButton) view).mo77502a(this.f55358c);
            float width = ((float) this.f55358c.width()) / 2.0f;
            C22124i b = aVar.f55375a.mo76293b("expansion");
            if (z) {
                if (!z2) {
                    bVar.setRevealInfo(new AbstractC22213b.C22218d(c, d, width));
                }
                if (z2) {
                    width = bVar.getRevealInfo().f54295c;
                }
                animator = C22211a.m80360a(bVar, c, d, C22309a.m80781a(c, d, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f, f2));
                animator.addListener(new AnimatorListenerAdapter() {
                    /* class com.google.android.material.transformation.FabTransformationBehavior.C225034 */

                    public void onAnimationEnd(Animator animator) {
                        AbstractC22213b.C22218d revealInfo = bVar.getRevealInfo();
                        revealInfo.f54295c = Float.MAX_VALUE;
                        bVar.setRevealInfo(revealInfo);
                    }
                });
                m81673a(view2, b.mo76299a(), (int) c, (int) d, width, list);
            } else {
                float f3 = bVar.getRevealInfo().f54295c;
                Animator a = C22211a.m80360a(bVar, c, d, width);
                int i = (int) c;
                int i2 = (int) d;
                m81673a(view2, b.mo76299a(), i, i2, f3, list);
                m81674a(view2, b.mo76299a(), b.mo76301b(), aVar.f55375a.mo76288a(), i, i2, width, list);
                animator = a;
            }
            b.mo76300a(animator);
            list.add(animator);
            list2.add(C22211a.m80359a(bVar));
        }
    }

    /* renamed from: a */
    private void m81680a(View view, C22504a aVar, C22124i iVar, C22124i iVar2, float f, float f2, float f3, float f4, RectF rectF) {
        float a = m81670a(aVar, iVar, f, f3);
        float a2 = m81670a(aVar, iVar2, f2, f4);
        Rect rect = this.f55358c;
        view.getWindowVisibleDisplayFrame(rect);
        RectF rectF2 = this.f55359d;
        rectF2.set(rect);
        RectF rectF3 = this.f55360e;
        m81675a(view, rectF3);
        rectF3.offset(a, a2);
        rectF3.intersect(rectF2);
        rectF.set(rectF3);
    }

    public FabTransformationBehavior() {
        this.f55358c = new Rect();
        this.f55359d = new RectF();
        this.f55360e = new RectF();
        this.f55361f = new int[2];
    }

    /* renamed from: b */
    private ViewGroup m81682b(View view) {
        if (view instanceof ViewGroup) {
            return (ViewGroup) view;
        }
        return null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onAttachedToLayoutParams(CoordinatorLayout.LayoutParams layoutParams) {
        if (layoutParams.dodgeInsetEdges == 0) {
            layoutParams.dodgeInsetEdges = 80;
        }
    }

    /* renamed from: c */
    private int m81686c(View view) {
        ColorStateList B = ViewCompat.m4008B(view);
        if (B != null) {
            return B.getColorForState(view.getDrawableState(), B.getDefaultColor());
        }
        return 0;
    }

    /* renamed from: a */
    private ViewGroup m81672a(View view) {
        View findViewById = view.findViewById(R.id.mtrl_child_content_container);
        if (findViewById != null) {
            return m81682b(findViewById);
        }
        if ((view instanceof TransformationChildLayout) || (view instanceof TransformationChildCard)) {
            return m81682b(((ViewGroup) view).getChildAt(0));
        }
        return m81682b(view);
    }

    /* renamed from: b */
    private void m81683b(View view, RectF rectF) {
        m81675a(view, rectF);
        rectF.offset(this.f55362g, this.f55363h);
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f55358c = new Rect();
        this.f55359d = new RectF();
        this.f55360e = new RectF();
        this.f55361f = new int[2];
    }

    /* renamed from: a */
    private void m81675a(View view, RectF rectF) {
        rectF.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) view.getWidth(), (float) view.getHeight());
        int[] iArr = this.f55361f;
        view.getLocationInWindow(iArr);
        rectF.offsetTo((float) iArr[0], (float) iArr[1]);
        rectF.offset((float) ((int) (-view.getTranslationX())), (float) ((int) (-view.getTranslationY())));
    }

    /* renamed from: c */
    private float m81685c(View view, View view2, C22125j jVar) {
        RectF rectF = this.f55359d;
        RectF rectF2 = this.f55360e;
        m81683b(view, rectF);
        m81675a(view2, rectF2);
        rectF2.offset(-m81669a(view, view2, jVar), BitmapDescriptorFactory.HUE_RED);
        return rectF.centerX() - rectF2.left;
    }

    /* renamed from: d */
    private float m81688d(View view, View view2, C22125j jVar) {
        RectF rectF = this.f55359d;
        RectF rectF2 = this.f55360e;
        m81683b(view, rectF);
        m81675a(view2, rectF2);
        rectF2.offset(BitmapDescriptorFactory.HUE_RED, -m81681b(view, view2, jVar));
        return rectF.centerY() - rectF2.top;
    }

    /* renamed from: a */
    private float m81669a(View view, View view2, C22125j jVar) {
        float f;
        float f2;
        float f3;
        RectF rectF = this.f55359d;
        RectF rectF2 = this.f55360e;
        m81683b(view, rectF);
        m81675a(view2, rectF2);
        int i = jVar.f53799a & 7;
        if (i == 1) {
            f3 = rectF2.centerX();
            f2 = rectF.centerX();
        } else if (i == 3) {
            f3 = rectF2.left;
            f2 = rectF.left;
        } else if (i != 5) {
            f = BitmapDescriptorFactory.HUE_RED;
            return f + jVar.f53800b;
        } else {
            f3 = rectF2.right;
            f2 = rectF.right;
        }
        f = f3 - f2;
        return f + jVar.f53800b;
    }

    /* renamed from: b */
    private float m81681b(View view, View view2, C22125j jVar) {
        float f;
        float f2;
        float f3;
        RectF rectF = this.f55359d;
        RectF rectF2 = this.f55360e;
        m81683b(view, rectF);
        m81675a(view2, rectF2);
        int i = jVar.f53799a & SmEvents.EVENT_NE_RR;
        if (i == 16) {
            f3 = rectF2.centerY();
            f2 = rectF.centerY();
        } else if (i == 48) {
            f3 = rectF2.top;
            f2 = rectF.top;
        } else if (i != 80) {
            f = BitmapDescriptorFactory.HUE_RED;
            return f + jVar.f53801c;
        } else {
            f3 = rectF2.bottom;
            f2 = rectF.bottom;
        }
        f = f3 - f2;
        return f + jVar.f53801c;
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (view.getVisibility() == 8) {
            throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
        } else if (!(view2 instanceof FloatingActionButton)) {
            return false;
        } else {
            int expandedComponentIdHint = ((FloatingActionButton) view2).getExpandedComponentIdHint();
            if (expandedComponentIdHint == 0 || expandedComponentIdHint == view.getId()) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: a */
    private float m81670a(C22504a aVar, C22124i iVar, float f, float f2) {
        long a = iVar.mo76299a();
        long b = iVar.mo76301b();
        C22124i b2 = aVar.f55375a.mo76293b("expansion");
        return C22116a.m79705a(f, f2, iVar.mo76302c().getInterpolation(((float) (((b2.mo76299a() + b2.mo76301b()) + 17) - a)) / ((float) b)));
    }

    /* renamed from: a */
    private Pair<C22124i, C22124i> m81671a(float f, float f2, boolean z, C22504a aVar) {
        C22124i iVar;
        C22124i iVar2;
        int i;
        if (f == BitmapDescriptorFactory.HUE_RED || f2 == BitmapDescriptorFactory.HUE_RED) {
            iVar2 = aVar.f55375a.mo76293b("translationXLinear");
            iVar = aVar.f55375a.mo76293b("translationYLinear");
        } else if ((!z || f2 >= BitmapDescriptorFactory.HUE_RED) && (z || i <= 0)) {
            iVar2 = aVar.f55375a.mo76293b("translationXCurveDownwards");
            iVar = aVar.f55375a.mo76293b("translationYCurveDownwards");
        } else {
            iVar2 = aVar.f55375a.mo76293b("translationXCurveUpwards");
            iVar = aVar.f55375a.mo76293b("translationYCurveUpwards");
        }
        return new Pair<>(iVar2, iVar);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    /* renamed from: b */
    public AnimatorSet mo78591b(final View view, final View view2, final boolean z, boolean z2) {
        C22504a a = mo78593a(view2.getContext(), z);
        if (z) {
            this.f55362g = view.getTranslationX();
            this.f55363h = view.getTranslationY();
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (Build.VERSION.SDK_INT >= 21) {
            m81678a(view, view2, z, z2, a, arrayList, arrayList2);
        }
        RectF rectF = this.f55359d;
        m81679a(view, view2, z, z2, a, arrayList, arrayList2, rectF);
        float width = rectF.width();
        float height = rectF.height();
        m81676a(view, view2, z, a, arrayList);
        m81684b(view, view2, z, z2, a, arrayList, arrayList2);
        m81677a(view, view2, z, z2, a, width, height, arrayList, arrayList2);
        m81687c(view, view2, z, z2, a, arrayList, arrayList2);
        m81689d(view, view2, z, z2, a, arrayList, arrayList2);
        AnimatorSet animatorSet = new AnimatorSet();
        C22117b.m79707a(animatorSet, arrayList);
        animatorSet.addListener(new AnimatorListenerAdapter() {
            /* class com.google.android.material.transformation.FabTransformationBehavior.C225001 */

            public void onAnimationEnd(Animator animator) {
                if (!z) {
                    view2.setVisibility(4);
                    view.setAlpha(1.0f);
                    view.setVisibility(0);
                }
            }

            public void onAnimationStart(Animator animator) {
                if (z) {
                    view2.setVisibility(0);
                    view.setAlpha(BitmapDescriptorFactory.HUE_RED);
                    view.setVisibility(4);
                }
            }
        });
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            animatorSet.addListener(arrayList2.get(i));
        }
        return animatorSet;
    }

    /* renamed from: a */
    private void m81673a(View view, long j, int i, int i2, float f, List<Animator> list) {
        if (Build.VERSION.SDK_INT >= 21 && j > 0) {
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view, i, i2, f, f);
            createCircularReveal.setStartDelay(0);
            createCircularReveal.setDuration(j);
            list.add(createCircularReveal);
        }
    }

    /* renamed from: b */
    private void m81684b(View view, final View view2, boolean z, boolean z2, C22504a aVar, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator objectAnimator;
        if ((view2 instanceof AbstractC22213b) && (view instanceof ImageView)) {
            final AbstractC22213b bVar = (AbstractC22213b) view2;
            final Drawable drawable = ((ImageView) view).getDrawable();
            if (drawable != null) {
                drawable.mutate();
                if (z) {
                    if (!z2) {
                        drawable.setAlpha(255);
                    }
                    objectAnimator = ObjectAnimator.ofInt(drawable, C22120e.f53786a, 0);
                } else {
                    objectAnimator = ObjectAnimator.ofInt(drawable, C22120e.f53786a, 255);
                }
                objectAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    /* class com.google.android.material.transformation.FabTransformationBehavior.C225012 */

                    public void onAnimationUpdate(ValueAnimator valueAnimator) {
                        view2.invalidate();
                    }
                });
                aVar.f55375a.mo76293b("iconFade").mo76300a((Animator) objectAnimator);
                list.add(objectAnimator);
                list2.add(new AnimatorListenerAdapter() {
                    /* class com.google.android.material.transformation.FabTransformationBehavior.C225023 */

                    public void onAnimationEnd(Animator animator) {
                        bVar.setCircularRevealOverlayDrawable(null);
                    }

                    public void onAnimationStart(Animator animator) {
                        bVar.setCircularRevealOverlayDrawable(drawable);
                    }
                });
            }
        }
    }

    /* renamed from: c */
    private void m81687c(View view, View view2, boolean z, boolean z2, C22504a aVar, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator objectAnimator;
        if (view2 instanceof AbstractC22213b) {
            AbstractC22213b bVar = (AbstractC22213b) view2;
            int c = m81686c(view);
            int i = 16777215 & c;
            if (z) {
                if (!z2) {
                    bVar.setCircularRevealScrimColor(c);
                }
                objectAnimator = ObjectAnimator.ofInt(bVar, AbstractC22213b.C22217c.f54292a, i);
            } else {
                objectAnimator = ObjectAnimator.ofInt(bVar, AbstractC22213b.C22217c.f54292a, c);
            }
            objectAnimator.setEvaluator(C22118c.m79708a());
            aVar.f55375a.mo76293b("color").mo76300a((Animator) objectAnimator);
            list.add(objectAnimator);
        }
    }

    /* renamed from: d */
    private void m81689d(View view, View view2, boolean z, boolean z2, C22504a aVar, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ViewGroup a;
        ObjectAnimator objectAnimator;
        if (view2 instanceof ViewGroup) {
            if ((!(view2 instanceof AbstractC22213b) || CircularRevealHelper.f54276a != 0) && (a = m81672a(view2)) != null) {
                if (z) {
                    if (!z2) {
                        C22119d.f53785a.set(a, Float.valueOf((float) BitmapDescriptorFactory.HUE_RED));
                    }
                    objectAnimator = ObjectAnimator.ofFloat(a, C22119d.f53785a, 1.0f);
                } else {
                    objectAnimator = ObjectAnimator.ofFloat(a, C22119d.f53785a, 0.0f);
                }
                aVar.f55375a.mo76293b("contentFade").mo76300a((Animator) objectAnimator);
                list.add(objectAnimator);
            }
        }
    }

    /* renamed from: a */
    private void m81674a(View view, long j, long j2, long j3, int i, int i2, float f, List<Animator> list) {
        if (Build.VERSION.SDK_INT >= 21) {
            long j4 = j + j2;
            if (j4 < j3) {
                Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view, i, i2, f, f);
                createCircularReveal.setStartDelay(j4);
                createCircularReveal.setDuration(j3 - j4);
                list.add(createCircularReveal);
            }
        }
    }
}
