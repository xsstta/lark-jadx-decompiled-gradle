package com.google.android.material.transition;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.core.util.C0845f;
import androidx.core.view.ViewCompat;
import androidx.transition.ArcMotion;
import androidx.transition.C1562y;
import androidx.transition.PathMotion;
import androidx.transition.Transition;
import com.google.android.material.internal.C22365r;
import com.google.android.material.p980a.C22116a;
import com.google.android.material.shape.AbstractC22413o;
import com.google.android.material.shape.C22398l;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.transition.C22529k;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public final class MaterialContainerTransform extends Transition {

    /* renamed from: i */
    private static final String f55383i = "MaterialContainerTransform";

    /* renamed from: j */
    private static final String[] f55384j = {"materialContainerTransition:bounds", "materialContainerTransition:shapeAppearance"};

    /* renamed from: k */
    private static final C22509b f55385k = new C22509b(new C22508a(BitmapDescriptorFactory.HUE_RED, 0.25f), new C22508a(BitmapDescriptorFactory.HUE_RED, 1.0f), new C22508a(BitmapDescriptorFactory.HUE_RED, 1.0f), new C22508a(BitmapDescriptorFactory.HUE_RED, 0.75f));

    /* renamed from: l */
    private static final C22509b f55386l = new C22509b(new C22508a(0.6f, 0.9f), new C22508a(BitmapDescriptorFactory.HUE_RED, 1.0f), new C22508a(BitmapDescriptorFactory.HUE_RED, 0.9f), new C22508a(0.3f, 0.9f));

    /* renamed from: m */
    private static final C22509b f55387m = new C22509b(new C22508a(0.1f, 0.4f), new C22508a(0.1f, 1.0f), new C22508a(0.1f, 1.0f), new C22508a(0.1f, 0.9f));

    /* renamed from: n */
    private static final C22509b f55388n = new C22509b(new C22508a(0.6f, 0.9f), new C22508a(BitmapDescriptorFactory.HUE_RED, 0.9f), new C22508a(BitmapDescriptorFactory.HUE_RED, 0.9f), new C22508a(0.2f, 0.9f));

    /* renamed from: A */
    private View f55389A;

    /* renamed from: B */
    private C22398l f55390B;

    /* renamed from: C */
    private C22398l f55391C;

    /* renamed from: D */
    private C22508a f55392D;

    /* renamed from: E */
    private C22508a f55393E;

    /* renamed from: F */
    private C22508a f55394F;

    /* renamed from: G */
    private C22508a f55395G;

    /* renamed from: H */
    private boolean f55396H;

    /* renamed from: I */
    private float f55397I;

    /* renamed from: J */
    private float f55398J;

    /* renamed from: a */
    public boolean f55399a;

    /* renamed from: o */
    private boolean f55400o;

    /* renamed from: p */
    private int f55401p = 16908290;

    /* renamed from: q */
    private int f55402q = -1;

    /* renamed from: r */
    private int f55403r = -1;

    /* renamed from: s */
    private int f55404s;

    /* renamed from: t */
    private int f55405t;

    /* renamed from: u */
    private int f55406u;

    /* renamed from: v */
    private int f55407v = 1375731712;

    /* renamed from: w */
    private int f55408w;

    /* renamed from: x */
    private int f55409x;

    /* renamed from: y */
    private int f55410y;

    /* renamed from: z */
    private View f55411z;

    @Retention(RetentionPolicy.SOURCE)
    public @interface FadeMode {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface FitMode {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface TransitionDirection {
    }

    /* renamed from: com.google.android.material.transition.MaterialContainerTransform$a */
    public static class C22508a {

        /* renamed from: a */
        public final float f55419a;

        /* renamed from: b */
        public final float f55420b;

        /* renamed from: a */
        public float mo78603a() {
            return this.f55419a;
        }

        /* renamed from: b */
        public float mo78604b() {
            return this.f55420b;
        }

        public C22508a(float f, float f2) {
            this.f55419a = f;
            this.f55420b = f2;
        }
    }

    @Override // androidx.transition.Transition
    /* renamed from: a */
    public String[] mo7809a() {
        return f55384j;
    }

    @Override // androidx.transition.Transition
    /* renamed from: a */
    public void mo7807a(C1562y yVar) {
        m81704a(yVar, this.f55411z, this.f55402q, this.f55390B);
    }

    @Override // androidx.transition.Transition
    /* renamed from: a */
    public Animator mo7806a(ViewGroup viewGroup, C1562y yVar, C1562y yVar2) {
        final View view;
        if (!(yVar == null || yVar2 == null)) {
            RectF rectF = (RectF) yVar.f5458a.get("materialContainerTransition:bounds");
            C22398l lVar = (C22398l) yVar.f5458a.get("materialContainerTransition:shapeAppearance");
            if (rectF == null || lVar == null) {
                Log.w(f55383i, "Skipping due to null start bounds. Ensure start view is laid out and measured.");
            } else {
                RectF rectF2 = (RectF) yVar2.f5458a.get("materialContainerTransition:bounds");
                C22398l lVar2 = (C22398l) yVar2.f5458a.get("materialContainerTransition:shapeAppearance");
                if (rectF2 == null || lVar2 == null) {
                    Log.w(f55383i, "Skipping due to null end bounds. Ensure end view is laid out and measured.");
                    return null;
                }
                final View view2 = yVar.f5459b;
                final View view3 = yVar2.f5459b;
                View view4 = view3.getParent() != null ? view3 : view2;
                if (this.f55401p == view4.getId()) {
                    view = (View) view4.getParent();
                } else {
                    view = C22529k.m81786b(view4, this.f55401p);
                    view4 = null;
                }
                RectF b = C22529k.m81785b(view);
                float f = -b.left;
                float f2 = -b.top;
                RectF a = m81699a(view, view4, f, f2);
                rectF.offset(f, f2);
                rectF2.offset(f, f2);
                boolean a2 = m81705a(rectF, rectF2);
                final C22510c cVar = new C22510c(mo7920m(), view2, rectF, lVar, m81697a(this.f55397I, view2), view3, rectF2, lVar2, m81697a(this.f55398J, view3), this.f55404s, this.f55405t, this.f55406u, this.f55407v, a2, this.f55396H, C22514b.m81740a(this.f55409x, a2), C22521e.m81750a(this.f55410y, a2, rectF, rectF2), m81702a(a2), this.f55400o);
                cVar.setBounds(Math.round(a.left), Math.round(a.top), Math.round(a.right), Math.round(a.bottom));
                ValueAnimator ofFloat = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f);
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    /* class com.google.android.material.transition.MaterialContainerTransform.C225061 */

                    public void onAnimationUpdate(ValueAnimator valueAnimator) {
                        cVar.mo78605a(valueAnimator.getAnimatedFraction());
                    }
                });
                mo7880a(new AbstractC22528j() {
                    /* class com.google.android.material.transition.MaterialContainerTransform.C225072 */

                    @Override // com.google.android.material.transition.AbstractC22528j, androidx.transition.Transition.AbstractC1505d
                    /* renamed from: e */
                    public void mo7931e(Transition transition) {
                        C22365r.m81028e(view).mo77864a(cVar);
                        view2.setAlpha(BitmapDescriptorFactory.HUE_RED);
                        view3.setAlpha(BitmapDescriptorFactory.HUE_RED);
                    }

                    @Override // com.google.android.material.transition.AbstractC22528j, androidx.transition.Transition.AbstractC1505d
                    /* renamed from: b */
                    public void mo7816b(Transition transition) {
                        MaterialContainerTransform.this.mo7898b(this);
                        if (!MaterialContainerTransform.this.f55399a) {
                            view2.setAlpha(1.0f);
                            view3.setAlpha(1.0f);
                            C22365r.m81028e(view).mo77865b(cVar);
                        }
                    }
                });
                return ofFloat;
            }
        }
        return null;
    }

    /* renamed from: a */
    private boolean m81705a(RectF rectF, RectF rectF2) {
        int i = this.f55408w;
        if (i != 0) {
            if (i == 1) {
                return true;
            }
            if (i == 2) {
                return false;
            }
            throw new IllegalArgumentException("Invalid transition direction: " + this.f55408w);
        } else if (C22529k.m81774a(rectF2) > C22529k.m81774a(rectF)) {
            return true;
        } else {
            return false;
        }
    }

    public MaterialContainerTransform() {
        boolean z;
        if (Build.VERSION.SDK_INT >= 28) {
            z = true;
        } else {
            z = false;
        }
        this.f55396H = z;
        this.f55397I = -1.0f;
        this.f55398J = -1.0f;
        mo7879a(C22116a.f53780b);
    }

    /* renamed from: com.google.android.material.transition.MaterialContainerTransform$c */
    private static final class C22510c extends Drawable {

        /* renamed from: A */
        private final C22509b f55425A;

        /* renamed from: B */
        private final AbstractC22513a f55426B;

        /* renamed from: C */
        private final AbstractC22520d f55427C;

        /* renamed from: D */
        private final boolean f55428D;

        /* renamed from: E */
        private final Paint f55429E;

        /* renamed from: F */
        private final Path f55430F;

        /* renamed from: G */
        private C22519c f55431G;

        /* renamed from: H */
        private C22524f f55432H;

        /* renamed from: I */
        private RectF f55433I;

        /* renamed from: J */
        private float f55434J;

        /* renamed from: K */
        private float f55435K;

        /* renamed from: L */
        private float f55436L;

        /* renamed from: a */
        public final View f55437a;

        /* renamed from: b */
        public final View f55438b;

        /* renamed from: c */
        private final RectF f55439c;

        /* renamed from: d */
        private final C22398l f55440d;

        /* renamed from: e */
        private final float f55441e;

        /* renamed from: f */
        private final RectF f55442f;

        /* renamed from: g */
        private final C22398l f55443g;

        /* renamed from: h */
        private final float f55444h;

        /* renamed from: i */
        private final Paint f55445i;

        /* renamed from: j */
        private final Paint f55446j;

        /* renamed from: k */
        private final Paint f55447k;

        /* renamed from: l */
        private final Paint f55448l;

        /* renamed from: m */
        private final Paint f55449m;

        /* renamed from: n */
        private final C22525g f55450n;

        /* renamed from: o */
        private final PathMeasure f55451o;

        /* renamed from: p */
        private final float f55452p;

        /* renamed from: q */
        private final float[] f55453q;

        /* renamed from: r */
        private final boolean f55454r;

        /* renamed from: s */
        private final float f55455s;

        /* renamed from: t */
        private final float f55456t;

        /* renamed from: u */
        private final boolean f55457u;

        /* renamed from: v */
        private final MaterialShapeDrawable f55458v;

        /* renamed from: w */
        private final RectF f55459w;

        /* renamed from: x */
        private final RectF f55460x;

        /* renamed from: y */
        private final RectF f55461y;

        /* renamed from: z */
        private final RectF f55462z;

        public int getOpacity() {
            return -3;
        }

        public void setAlpha(int i) {
            throw new UnsupportedOperationException("Setting alpha on is not supported");
        }

        public void setColorFilter(ColorFilter colorFilter) {
            throw new UnsupportedOperationException("Setting a color filter is not supported");
        }

        /* renamed from: a */
        private static PointF m81715a(RectF rectF) {
            return new PointF(rectF.centerX(), rectF.top);
        }

        /* renamed from: a */
        private void m81716a(Canvas canvas) {
            canvas.save();
            canvas.clipPath(this.f55450n.mo78617a(), Region.Op.DIFFERENCE);
            if (Build.VERSION.SDK_INT > 28) {
                m81722b(canvas);
            } else {
                m81723c(canvas);
            }
            canvas.restore();
        }

        /* renamed from: b */
        private void m81722b(Canvas canvas) {
            C22398l b = this.f55450n.mo78620b();
            if (b.mo78004a(this.f55433I)) {
                float a = b.mo78009f().mo77991a(this.f55433I);
                canvas.drawRoundRect(this.f55433I, a, a, this.f55448l);
                return;
            }
            canvas.drawPath(this.f55450n.mo78617a(), this.f55448l);
        }

        /* renamed from: c */
        private void m81723c(Canvas canvas) {
            this.f55458v.setBounds((int) this.f55433I.left, (int) this.f55433I.top, (int) this.f55433I.right, (int) this.f55433I.bottom);
            this.f55458v.mo77985r(this.f55434J);
            this.f55458v.mo77945E((int) this.f55435K);
            this.f55458v.setShapeAppearanceModel(this.f55450n.mo78620b());
            this.f55458v.draw(canvas);
        }

        /* renamed from: d */
        private void m81724d(Canvas canvas) {
            m81717a(canvas, this.f55446j);
            C22529k.m81784a(canvas, getBounds(), this.f55459w.left, this.f55459w.top, this.f55432H.f55476a, this.f55431G.f55471a, new C22529k.AbstractC22532a() {
                /* class com.google.android.material.transition.MaterialContainerTransform.C22510c.C225111 */

                @Override // com.google.android.material.transition.C22529k.AbstractC22532a
                /* renamed from: a */
                public void mo78610a(Canvas canvas) {
                    C22510c.this.f55437a.draw(canvas);
                }
            });
        }

        /* renamed from: e */
        private void m81725e(Canvas canvas) {
            m81717a(canvas, this.f55447k);
            C22529k.m81784a(canvas, getBounds(), this.f55461y.left, this.f55461y.top, this.f55432H.f55477b, this.f55431G.f55472b, new C22529k.AbstractC22532a() {
                /* class com.google.android.material.transition.MaterialContainerTransform.C22510c.C225122 */

                @Override // com.google.android.material.transition.C22529k.AbstractC22532a
                /* renamed from: a */
                public void mo78610a(Canvas canvas) {
                    C22510c.this.f55438b.draw(canvas);
                }
            });
        }

        public void draw(Canvas canvas) {
            int i;
            if (this.f55449m.getAlpha() > 0) {
                canvas.drawRect(getBounds(), this.f55449m);
            }
            if (this.f55428D) {
                i = canvas.save();
            } else {
                i = -1;
            }
            if (this.f55457u && this.f55434J > BitmapDescriptorFactory.HUE_RED) {
                m81716a(canvas);
            }
            this.f55450n.mo78619a(canvas);
            m81717a(canvas, this.f55445i);
            if (this.f55431G.f55473c) {
                m81724d(canvas);
                m81725e(canvas);
            } else {
                m81725e(canvas);
                m81724d(canvas);
            }
            if (this.f55428D) {
                canvas.restoreToCount(i);
                m81719a(canvas, this.f55459w, this.f55430F, -65281);
                m81718a(canvas, this.f55460x, -256);
                m81718a(canvas, this.f55459w, -16711936);
                m81718a(canvas, this.f55462z, -16711681);
                m81718a(canvas, this.f55461y, -16776961);
            }
        }

        /* renamed from: b */
        private void m81721b(float f) {
            float f2;
            RectF rectF;
            this.f55436L = f;
            Paint paint = this.f55449m;
            if (this.f55454r) {
                f2 = C22529k.m81772a((float) BitmapDescriptorFactory.HUE_RED, 255.0f, f);
            } else {
                f2 = C22529k.m81772a(255.0f, (float) BitmapDescriptorFactory.HUE_RED, f);
            }
            paint.setAlpha((int) f2);
            this.f55451o.getPosTan(this.f55452p * f, this.f55453q, null);
            float[] fArr = this.f55453q;
            float f3 = fArr[0];
            float f4 = fArr[1];
            C22524f a = this.f55427C.mo78614a(f, ((Float) C0845f.m3991a(Float.valueOf(this.f55425A.f55422b.f55419a))).floatValue(), ((Float) C0845f.m3991a(Float.valueOf(this.f55425A.f55422b.f55420b))).floatValue(), this.f55439c.width(), this.f55439c.height(), this.f55442f.width(), this.f55442f.height());
            this.f55432H = a;
            this.f55459w.set(f3 - (a.f55478c / 2.0f), f4, (this.f55432H.f55478c / 2.0f) + f3, this.f55432H.f55479d + f4);
            this.f55461y.set(f3 - (this.f55432H.f55480e / 2.0f), f4, f3 + (this.f55432H.f55480e / 2.0f), this.f55432H.f55481f + f4);
            this.f55460x.set(this.f55459w);
            this.f55462z.set(this.f55461y);
            float floatValue = ((Float) C0845f.m3991a(Float.valueOf(this.f55425A.f55423c.f55419a))).floatValue();
            float floatValue2 = ((Float) C0845f.m3991a(Float.valueOf(this.f55425A.f55423c.f55420b))).floatValue();
            boolean a2 = this.f55427C.mo78616a(this.f55432H);
            if (a2) {
                rectF = this.f55460x;
            } else {
                rectF = this.f55462z;
            }
            float a3 = C22529k.m81773a((float) BitmapDescriptorFactory.HUE_RED, 1.0f, floatValue, floatValue2, f);
            if (!a2) {
                a3 = 1.0f - a3;
            }
            this.f55427C.mo78615a(rectF, a3, this.f55432H);
            this.f55433I = new RectF(Math.min(this.f55460x.left, this.f55462z.left), Math.min(this.f55460x.top, this.f55462z.top), Math.max(this.f55460x.right, this.f55462z.right), Math.max(this.f55460x.bottom, this.f55462z.bottom));
            this.f55450n.mo78618a(f, this.f55440d, this.f55443g, this.f55459w, this.f55460x, this.f55462z, this.f55425A.f55424d);
            this.f55434J = C22529k.m81772a(this.f55441e, this.f55444h, f);
            float a4 = m81714a(this.f55433I, this.f55455s);
            float b = m81720b(this.f55433I, this.f55456t);
            float f5 = this.f55434J;
            float f6 = (float) ((int) (b * f5));
            this.f55435K = f6;
            this.f55448l.setShadowLayer(f5, (float) ((int) (a4 * f5)), f6, 754974720);
            this.f55431G = this.f55426B.mo78613a(f, ((Float) C0845f.m3991a(Float.valueOf(this.f55425A.f55421a.f55419a))).floatValue(), ((Float) C0845f.m3991a(Float.valueOf(this.f55425A.f55421a.f55420b))).floatValue());
            if (this.f55446j.getColor() != 0) {
                this.f55446j.setAlpha(this.f55431G.f55471a);
            }
            if (this.f55447k.getColor() != 0) {
                this.f55447k.setAlpha(this.f55431G.f55472b);
            }
            invalidateSelf();
        }

        /* renamed from: a */
        public void mo78605a(float f) {
            if (this.f55436L != f) {
                m81721b(f);
            }
        }

        /* renamed from: b */
        private static float m81720b(RectF rectF, float f) {
            return (rectF.centerY() / f) * 1.5f;
        }

        /* renamed from: a */
        private static float m81714a(RectF rectF, float f) {
            return ((rectF.centerX() / (f / 2.0f)) - 1.0f) * 0.3f;
        }

        /* renamed from: a */
        private void m81717a(Canvas canvas, Paint paint) {
            if (paint.getColor() != 0 && paint.getAlpha() > 0) {
                canvas.drawRect(getBounds(), paint);
            }
        }

        /* renamed from: a */
        private void m81718a(Canvas canvas, RectF rectF, int i) {
            this.f55429E.setColor(i);
            canvas.drawRect(rectF, this.f55429E);
        }

        /* renamed from: a */
        private void m81719a(Canvas canvas, RectF rectF, Path path, int i) {
            PointF a = m81715a(rectF);
            if (this.f55436L == BitmapDescriptorFactory.HUE_RED) {
                path.reset();
                path.moveTo(a.x, a.y);
                return;
            }
            path.lineTo(a.x, a.y);
            this.f55429E.setColor(i);
            canvas.drawPath(path, this.f55429E);
        }

        private C22510c(PathMotion pathMotion, View view, RectF rectF, C22398l lVar, float f, View view2, RectF rectF2, C22398l lVar2, float f2, int i, int i2, int i3, int i4, boolean z, boolean z2, AbstractC22513a aVar, AbstractC22520d dVar, C22509b bVar, boolean z3) {
            Paint paint = new Paint();
            this.f55445i = paint;
            Paint paint2 = new Paint();
            this.f55446j = paint2;
            Paint paint3 = new Paint();
            this.f55447k = paint3;
            this.f55448l = new Paint();
            Paint paint4 = new Paint();
            this.f55449m = paint4;
            this.f55450n = new C22525g();
            float[] fArr = new float[2];
            this.f55453q = fArr;
            MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
            this.f55458v = materialShapeDrawable;
            Paint paint5 = new Paint();
            this.f55429E = paint5;
            this.f55430F = new Path();
            this.f55437a = view;
            this.f55439c = rectF;
            this.f55440d = lVar;
            this.f55441e = f;
            this.f55438b = view2;
            this.f55442f = rectF2;
            this.f55443g = lVar2;
            this.f55444h = f2;
            this.f55454r = z;
            this.f55457u = z2;
            this.f55426B = aVar;
            this.f55427C = dVar;
            this.f55425A = bVar;
            this.f55428D = z3;
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((WindowManager) view.getContext().getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
            this.f55455s = (float) displayMetrics.widthPixels;
            this.f55456t = (float) displayMetrics.heightPixels;
            paint.setColor(i);
            paint2.setColor(i2);
            paint3.setColor(i3);
            materialShapeDrawable.mo77973g(ColorStateList.valueOf(0));
            materialShapeDrawable.mo77944D(2);
            materialShapeDrawable.mo77974g(false);
            materialShapeDrawable.mo77947G(-7829368);
            RectF rectF3 = new RectF(rectF);
            this.f55459w = rectF3;
            this.f55460x = new RectF(rectF3);
            RectF rectF4 = new RectF(rectF3);
            this.f55461y = rectF4;
            this.f55462z = new RectF(rectF4);
            PointF a = m81715a(rectF);
            PointF a2 = m81715a(rectF2);
            PathMeasure pathMeasure = new PathMeasure(pathMotion.mo7802a(a.x, a.y, a2.x, a2.y), false);
            this.f55451o = pathMeasure;
            this.f55452p = pathMeasure.getLength();
            fArr[0] = rectF.centerX();
            fArr[1] = rectF.top;
            paint4.setStyle(Paint.Style.FILL);
            paint4.setShader(C22529k.m81778a(i4));
            paint5.setStyle(Paint.Style.STROKE);
            paint5.setStrokeWidth(10.0f);
            m81721b(BitmapDescriptorFactory.HUE_RED);
        }
    }

    @Override // androidx.transition.Transition
    /* renamed from: b */
    public void mo7810b(C1562y yVar) {
        m81704a(yVar, this.f55389A, this.f55403r, this.f55391C);
    }

    /* renamed from: a */
    private static int m81698a(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{R.attr.transitionShapeAppearance});
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    /* renamed from: a */
    private C22509b m81702a(boolean z) {
        PathMotion m = mo7920m();
        if ((m instanceof ArcMotion) || (m instanceof C22526h)) {
            return m81703a(z, f55387m, f55388n);
        }
        return m81703a(z, f55385k, f55386l);
    }

    /* renamed from: a */
    private static float m81697a(float f, View view) {
        if (f != -1.0f) {
            return f;
        }
        return ViewCompat.m4104s(view);
    }

    /* renamed from: a */
    private static C22398l m81701a(View view, C22398l lVar) {
        if (lVar != null) {
            return lVar;
        }
        if (view.getTag(R.id.mtrl_motion_snapshot_view) instanceof C22398l) {
            return (C22398l) view.getTag(R.id.mtrl_motion_snapshot_view);
        }
        Context context = view.getContext();
        int a = m81698a(context);
        if (a != -1) {
            return C22398l.m81157a(context, a, 0).mo78024a();
        }
        if (view instanceof AbstractC22413o) {
            return ((AbstractC22413o) view).getShapeAppearanceModel();
        }
        return C22398l.m81156a().mo78024a();
    }

    /* renamed from: a */
    private static C22398l m81700a(View view, RectF rectF, C22398l lVar) {
        return C22529k.m81780a(m81701a(view, lVar), rectF);
    }

    /* renamed from: a */
    private C22509b m81703a(boolean z, C22509b bVar, C22509b bVar2) {
        if (!z) {
            bVar = bVar2;
        }
        return new C22509b((C22508a) C22529k.m81783a(this.f55392D, bVar.f55421a), (C22508a) C22529k.m81783a(this.f55393E, bVar.f55422b), (C22508a) C22529k.m81783a(this.f55394F, bVar.f55423c), (C22508a) C22529k.m81783a(this.f55395G, bVar.f55424d));
    }

    /* access modifiers changed from: private */
    /* renamed from: com.google.android.material.transition.MaterialContainerTransform$b */
    public static class C22509b {

        /* renamed from: a */
        public final C22508a f55421a;

        /* renamed from: b */
        public final C22508a f55422b;

        /* renamed from: c */
        public final C22508a f55423c;

        /* renamed from: d */
        public final C22508a f55424d;

        private C22509b(C22508a aVar, C22508a aVar2, C22508a aVar3, C22508a aVar4) {
            this.f55421a = aVar;
            this.f55422b = aVar2;
            this.f55423c = aVar3;
            this.f55424d = aVar4;
        }
    }

    /* renamed from: a */
    private static RectF m81699a(View view, View view2, float f, float f2) {
        if (view2 == null) {
            return new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) view.getWidth(), (float) view.getHeight());
        }
        RectF b = C22529k.m81785b(view2);
        b.offset(f, f2);
        return b;
    }

    /* renamed from: a */
    private static void m81704a(C1562y yVar, View view, int i, C22398l lVar) {
        RectF rectF;
        if (i != -1) {
            yVar.f5459b = C22529k.m81779a(yVar.f5459b, i);
        } else if (view != null) {
            yVar.f5459b = view;
        } else if (yVar.f5459b.getTag(R.id.mtrl_motion_snapshot_view) instanceof View) {
            yVar.f5459b.setTag(R.id.mtrl_motion_snapshot_view, null);
            yVar.f5459b = (View) yVar.f5459b.getTag(R.id.mtrl_motion_snapshot_view);
        }
        View view2 = yVar.f5459b;
        if (ViewCompat.m4012F(view2) || view2.getWidth() != 0 || view2.getHeight() != 0) {
            if (view2.getParent() == null) {
                rectF = C22529k.m81777a(view2);
            } else {
                rectF = C22529k.m81785b(view2);
            }
            yVar.f5458a.put("materialContainerTransition:bounds", rectF);
            yVar.f5458a.put("materialContainerTransition:shapeAppearance", m81700a(view2, rectF, lVar));
        }
    }
}
