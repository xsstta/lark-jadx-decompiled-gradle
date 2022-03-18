package com.google.android.material.transition.platform;

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
import android.transition.ArcMotion;
import android.transition.PathMotion;
import android.transition.Transition;
import android.transition.TransitionValues;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.core.util.C0845f;
import androidx.core.view.ViewCompat;
import com.google.android.material.internal.C22365r;
import com.google.android.material.p980a.C22116a;
import com.google.android.material.shape.AbstractC22413o;
import com.google.android.material.shape.C22398l;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.transition.platform.C22558k;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public final class MaterialContainerTransform extends Transition {

    /* renamed from: b */
    private static final String f55496b = "MaterialContainerTransform";

    /* renamed from: c */
    private static final String[] f55497c = {"materialContainerTransition:bounds", "materialContainerTransition:shapeAppearance"};

    /* renamed from: d */
    private static final C22538b f55498d = new C22538b(new C22537a(BitmapDescriptorFactory.HUE_RED, 0.25f), new C22537a(BitmapDescriptorFactory.HUE_RED, 1.0f), new C22537a(BitmapDescriptorFactory.HUE_RED, 1.0f), new C22537a(BitmapDescriptorFactory.HUE_RED, 0.75f));

    /* renamed from: e */
    private static final C22538b f55499e = new C22538b(new C22537a(0.6f, 0.9f), new C22537a(BitmapDescriptorFactory.HUE_RED, 1.0f), new C22537a(BitmapDescriptorFactory.HUE_RED, 0.9f), new C22537a(0.3f, 0.9f));

    /* renamed from: f */
    private static final C22538b f55500f = new C22538b(new C22537a(0.1f, 0.4f), new C22537a(0.1f, 1.0f), new C22537a(0.1f, 1.0f), new C22537a(0.1f, 0.9f));

    /* renamed from: g */
    private static final C22538b f55501g = new C22538b(new C22537a(0.6f, 0.9f), new C22537a(BitmapDescriptorFactory.HUE_RED, 0.9f), new C22537a(BitmapDescriptorFactory.HUE_RED, 0.9f), new C22537a(0.2f, 0.9f));

    /* renamed from: A */
    private boolean f55502A;

    /* renamed from: B */
    private float f55503B;

    /* renamed from: C */
    private float f55504C;

    /* renamed from: a */
    public boolean f55505a;

    /* renamed from: h */
    private boolean f55506h;

    /* renamed from: i */
    private int f55507i = 16908290;

    /* renamed from: j */
    private int f55508j = -1;

    /* renamed from: k */
    private int f55509k = -1;

    /* renamed from: l */
    private int f55510l;

    /* renamed from: m */
    private int f55511m;

    /* renamed from: n */
    private int f55512n;

    /* renamed from: o */
    private int f55513o = 1375731712;

    /* renamed from: p */
    private int f55514p;

    /* renamed from: q */
    private int f55515q;

    /* renamed from: r */
    private int f55516r;

    /* renamed from: s */
    private View f55517s;

    /* renamed from: t */
    private View f55518t;

    /* renamed from: u */
    private C22398l f55519u;

    /* renamed from: v */
    private C22398l f55520v;

    /* renamed from: w */
    private C22537a f55521w;

    /* renamed from: x */
    private C22537a f55522x;

    /* renamed from: y */
    private C22537a f55523y;

    /* renamed from: z */
    private C22537a f55524z;

    @Retention(RetentionPolicy.SOURCE)
    public @interface FadeMode {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface FitMode {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface TransitionDirection {
    }

    /* renamed from: com.google.android.material.transition.platform.MaterialContainerTransform$a */
    public static class C22537a {

        /* renamed from: a */
        public final float f55532a;

        /* renamed from: b */
        public final float f55533b;

        /* renamed from: a */
        public float mo78629a() {
            return this.f55532a;
        }

        /* renamed from: b */
        public float mo78630b() {
            return this.f55533b;
        }

        public C22537a(float f, float f2) {
            this.f55532a = f;
            this.f55533b = f2;
        }
    }

    public String[] getTransitionProperties() {
        return f55497c;
    }

    /* renamed from: a */
    private boolean m81802a(RectF rectF, RectF rectF2) {
        int i = this.f55514p;
        if (i != 0) {
            if (i == 1) {
                return true;
            }
            if (i == 2) {
                return false;
            }
            throw new IllegalArgumentException("Invalid transition direction: " + this.f55514p);
        } else if (C22558k.m81855a(rectF2) > C22558k.m81855a(rectF)) {
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
        this.f55502A = z;
        this.f55503B = -1.0f;
        this.f55504C = -1.0f;
        setInterpolator(C22116a.f53780b);
    }

    /* renamed from: com.google.android.material.transition.platform.MaterialContainerTransform$c */
    private static final class C22539c extends Drawable {

        /* renamed from: A */
        private final C22538b f55538A;

        /* renamed from: B */
        private final AbstractC22542a f55539B;

        /* renamed from: C */
        private final AbstractC22549d f55540C;

        /* renamed from: D */
        private final boolean f55541D;

        /* renamed from: E */
        private final Paint f55542E;

        /* renamed from: F */
        private final Path f55543F;

        /* renamed from: G */
        private C22548c f55544G;

        /* renamed from: H */
        private C22553f f55545H;

        /* renamed from: I */
        private RectF f55546I;

        /* renamed from: J */
        private float f55547J;

        /* renamed from: K */
        private float f55548K;

        /* renamed from: L */
        private float f55549L;

        /* renamed from: a */
        public final View f55550a;

        /* renamed from: b */
        public final View f55551b;

        /* renamed from: c */
        private final RectF f55552c;

        /* renamed from: d */
        private final C22398l f55553d;

        /* renamed from: e */
        private final float f55554e;

        /* renamed from: f */
        private final RectF f55555f;

        /* renamed from: g */
        private final C22398l f55556g;

        /* renamed from: h */
        private final float f55557h;

        /* renamed from: i */
        private final Paint f55558i;

        /* renamed from: j */
        private final Paint f55559j;

        /* renamed from: k */
        private final Paint f55560k;

        /* renamed from: l */
        private final Paint f55561l;

        /* renamed from: m */
        private final Paint f55562m;

        /* renamed from: n */
        private final C22554g f55563n;

        /* renamed from: o */
        private final PathMeasure f55564o;

        /* renamed from: p */
        private final float f55565p;

        /* renamed from: q */
        private final float[] f55566q;

        /* renamed from: r */
        private final boolean f55567r;

        /* renamed from: s */
        private final float f55568s;

        /* renamed from: t */
        private final float f55569t;

        /* renamed from: u */
        private final boolean f55570u;

        /* renamed from: v */
        private final MaterialShapeDrawable f55571v;

        /* renamed from: w */
        private final RectF f55572w;

        /* renamed from: x */
        private final RectF f55573x;

        /* renamed from: y */
        private final RectF f55574y;

        /* renamed from: z */
        private final RectF f55575z;

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
        private static PointF m81806a(RectF rectF) {
            return new PointF(rectF.centerX(), rectF.top);
        }

        /* renamed from: a */
        private void m81807a(Canvas canvas) {
            canvas.save();
            canvas.clipPath(this.f55563n.mo78645a(), Region.Op.DIFFERENCE);
            if (Build.VERSION.SDK_INT > 28) {
                m81813b(canvas);
            } else {
                m81814c(canvas);
            }
            canvas.restore();
        }

        /* renamed from: b */
        private void m81813b(Canvas canvas) {
            C22398l b = this.f55563n.mo78648b();
            if (b.mo78004a(this.f55546I)) {
                float a = b.mo78009f().mo77991a(this.f55546I);
                canvas.drawRoundRect(this.f55546I, a, a, this.f55561l);
                return;
            }
            canvas.drawPath(this.f55563n.mo78645a(), this.f55561l);
        }

        /* renamed from: c */
        private void m81814c(Canvas canvas) {
            this.f55571v.setBounds((int) this.f55546I.left, (int) this.f55546I.top, (int) this.f55546I.right, (int) this.f55546I.bottom);
            this.f55571v.mo77985r(this.f55547J);
            this.f55571v.mo77945E((int) this.f55548K);
            this.f55571v.setShapeAppearanceModel(this.f55563n.mo78648b());
            this.f55571v.draw(canvas);
        }

        /* renamed from: d */
        private void m81815d(Canvas canvas) {
            m81808a(canvas, this.f55559j);
            C22558k.m81865a(canvas, getBounds(), this.f55572w.left, this.f55572w.top, this.f55545H.f55589a, this.f55544G.f55584a, new C22558k.AbstractC22561a() {
                /* class com.google.android.material.transition.platform.MaterialContainerTransform.C22539c.C225401 */

                @Override // com.google.android.material.transition.platform.C22558k.AbstractC22561a
                /* renamed from: a */
                public void mo78636a(Canvas canvas) {
                    C22539c.this.f55550a.draw(canvas);
                }
            });
        }

        /* renamed from: e */
        private void m81816e(Canvas canvas) {
            m81808a(canvas, this.f55560k);
            C22558k.m81865a(canvas, getBounds(), this.f55574y.left, this.f55574y.top, this.f55545H.f55590b, this.f55544G.f55585b, new C22558k.AbstractC22561a() {
                /* class com.google.android.material.transition.platform.MaterialContainerTransform.C22539c.C225412 */

                @Override // com.google.android.material.transition.platform.C22558k.AbstractC22561a
                /* renamed from: a */
                public void mo78636a(Canvas canvas) {
                    C22539c.this.f55551b.draw(canvas);
                }
            });
        }

        public void draw(Canvas canvas) {
            int i;
            if (this.f55562m.getAlpha() > 0) {
                canvas.drawRect(getBounds(), this.f55562m);
            }
            if (this.f55541D) {
                i = canvas.save();
            } else {
                i = -1;
            }
            if (this.f55570u && this.f55547J > BitmapDescriptorFactory.HUE_RED) {
                m81807a(canvas);
            }
            this.f55563n.mo78647a(canvas);
            m81808a(canvas, this.f55558i);
            if (this.f55544G.f55586c) {
                m81815d(canvas);
                m81816e(canvas);
            } else {
                m81816e(canvas);
                m81815d(canvas);
            }
            if (this.f55541D) {
                canvas.restoreToCount(i);
                m81810a(canvas, this.f55572w, this.f55543F, -65281);
                m81809a(canvas, this.f55573x, -256);
                m81809a(canvas, this.f55572w, -16711936);
                m81809a(canvas, this.f55575z, -16711681);
                m81809a(canvas, this.f55574y, -16776961);
            }
        }

        /* renamed from: b */
        private void m81812b(float f) {
            float f2;
            RectF rectF;
            this.f55549L = f;
            Paint paint = this.f55562m;
            if (this.f55567r) {
                f2 = C22558k.m81853a((float) BitmapDescriptorFactory.HUE_RED, 255.0f, f);
            } else {
                f2 = C22558k.m81853a(255.0f, (float) BitmapDescriptorFactory.HUE_RED, f);
            }
            paint.setAlpha((int) f2);
            this.f55564o.getPosTan(this.f55565p * f, this.f55566q, null);
            float[] fArr = this.f55566q;
            float f3 = fArr[0];
            float f4 = fArr[1];
            C22553f a = this.f55540C.mo78642a(f, ((Float) C0845f.m3991a(Float.valueOf(this.f55538A.f55535b.f55532a))).floatValue(), ((Float) C0845f.m3991a(Float.valueOf(this.f55538A.f55535b.f55533b))).floatValue(), this.f55552c.width(), this.f55552c.height(), this.f55555f.width(), this.f55555f.height());
            this.f55545H = a;
            this.f55572w.set(f3 - (a.f55591c / 2.0f), f4, (this.f55545H.f55591c / 2.0f) + f3, this.f55545H.f55592d + f4);
            this.f55574y.set(f3 - (this.f55545H.f55593e / 2.0f), f4, f3 + (this.f55545H.f55593e / 2.0f), this.f55545H.f55594f + f4);
            this.f55573x.set(this.f55572w);
            this.f55575z.set(this.f55574y);
            float floatValue = ((Float) C0845f.m3991a(Float.valueOf(this.f55538A.f55536c.f55532a))).floatValue();
            float floatValue2 = ((Float) C0845f.m3991a(Float.valueOf(this.f55538A.f55536c.f55533b))).floatValue();
            boolean a2 = this.f55540C.mo78644a(this.f55545H);
            if (a2) {
                rectF = this.f55573x;
            } else {
                rectF = this.f55575z;
            }
            float a3 = C22558k.m81854a((float) BitmapDescriptorFactory.HUE_RED, 1.0f, floatValue, floatValue2, f);
            if (!a2) {
                a3 = 1.0f - a3;
            }
            this.f55540C.mo78643a(rectF, a3, this.f55545H);
            this.f55546I = new RectF(Math.min(this.f55573x.left, this.f55575z.left), Math.min(this.f55573x.top, this.f55575z.top), Math.max(this.f55573x.right, this.f55575z.right), Math.max(this.f55573x.bottom, this.f55575z.bottom));
            this.f55563n.mo78646a(f, this.f55553d, this.f55556g, this.f55572w, this.f55573x, this.f55575z, this.f55538A.f55537d);
            this.f55547J = C22558k.m81853a(this.f55554e, this.f55557h, f);
            float a4 = m81805a(this.f55546I, this.f55568s);
            float b = m81811b(this.f55546I, this.f55569t);
            float f5 = this.f55547J;
            float f6 = (float) ((int) (b * f5));
            this.f55548K = f6;
            this.f55561l.setShadowLayer(f5, (float) ((int) (a4 * f5)), f6, 754974720);
            this.f55544G = this.f55539B.mo78641a(f, ((Float) C0845f.m3991a(Float.valueOf(this.f55538A.f55534a.f55532a))).floatValue(), ((Float) C0845f.m3991a(Float.valueOf(this.f55538A.f55534a.f55533b))).floatValue());
            if (this.f55559j.getColor() != 0) {
                this.f55559j.setAlpha(this.f55544G.f55584a);
            }
            if (this.f55560k.getColor() != 0) {
                this.f55560k.setAlpha(this.f55544G.f55585b);
            }
            invalidateSelf();
        }

        /* renamed from: a */
        public void mo78631a(float f) {
            if (this.f55549L != f) {
                m81812b(f);
            }
        }

        /* renamed from: b */
        private static float m81811b(RectF rectF, float f) {
            return (rectF.centerY() / f) * 1.5f;
        }

        /* renamed from: a */
        private static float m81805a(RectF rectF, float f) {
            return ((rectF.centerX() / (f / 2.0f)) - 1.0f) * 0.3f;
        }

        /* renamed from: a */
        private void m81808a(Canvas canvas, Paint paint) {
            if (paint.getColor() != 0 && paint.getAlpha() > 0) {
                canvas.drawRect(getBounds(), paint);
            }
        }

        /* renamed from: a */
        private void m81809a(Canvas canvas, RectF rectF, int i) {
            this.f55542E.setColor(i);
            canvas.drawRect(rectF, this.f55542E);
        }

        /* renamed from: a */
        private void m81810a(Canvas canvas, RectF rectF, Path path, int i) {
            PointF a = m81806a(rectF);
            if (this.f55549L == BitmapDescriptorFactory.HUE_RED) {
                path.reset();
                path.moveTo(a.x, a.y);
                return;
            }
            path.lineTo(a.x, a.y);
            this.f55542E.setColor(i);
            canvas.drawPath(path, this.f55542E);
        }

        private C22539c(PathMotion pathMotion, View view, RectF rectF, C22398l lVar, float f, View view2, RectF rectF2, C22398l lVar2, float f2, int i, int i2, int i3, int i4, boolean z, boolean z2, AbstractC22542a aVar, AbstractC22549d dVar, C22538b bVar, boolean z3) {
            Paint paint = new Paint();
            this.f55558i = paint;
            Paint paint2 = new Paint();
            this.f55559j = paint2;
            Paint paint3 = new Paint();
            this.f55560k = paint3;
            this.f55561l = new Paint();
            Paint paint4 = new Paint();
            this.f55562m = paint4;
            this.f55563n = new C22554g();
            float[] fArr = new float[2];
            this.f55566q = fArr;
            MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
            this.f55571v = materialShapeDrawable;
            Paint paint5 = new Paint();
            this.f55542E = paint5;
            this.f55543F = new Path();
            this.f55550a = view;
            this.f55552c = rectF;
            this.f55553d = lVar;
            this.f55554e = f;
            this.f55551b = view2;
            this.f55555f = rectF2;
            this.f55556g = lVar2;
            this.f55557h = f2;
            this.f55567r = z;
            this.f55570u = z2;
            this.f55539B = aVar;
            this.f55540C = dVar;
            this.f55538A = bVar;
            this.f55541D = z3;
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((WindowManager) view.getContext().getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
            this.f55568s = (float) displayMetrics.widthPixels;
            this.f55569t = (float) displayMetrics.heightPixels;
            paint.setColor(i);
            paint2.setColor(i2);
            paint3.setColor(i3);
            materialShapeDrawable.mo77973g(ColorStateList.valueOf(0));
            materialShapeDrawable.mo77944D(2);
            materialShapeDrawable.mo77974g(false);
            materialShapeDrawable.mo77947G(-7829368);
            RectF rectF3 = new RectF(rectF);
            this.f55572w = rectF3;
            this.f55573x = new RectF(rectF3);
            RectF rectF4 = new RectF(rectF3);
            this.f55574y = rectF4;
            this.f55575z = new RectF(rectF4);
            PointF a = m81806a(rectF);
            PointF a2 = m81806a(rectF2);
            PathMeasure pathMeasure = new PathMeasure(pathMotion.getPath(a.x, a.y, a2.x, a2.y), false);
            this.f55564o = pathMeasure;
            this.f55565p = pathMeasure.getLength();
            fArr[0] = rectF.centerX();
            fArr[1] = rectF.top;
            paint4.setStyle(Paint.Style.FILL);
            paint4.setShader(C22558k.m81859a(i4));
            paint5.setStyle(Paint.Style.STROKE);
            paint5.setStrokeWidth(10.0f);
            m81812b(BitmapDescriptorFactory.HUE_RED);
        }
    }

    public void captureEndValues(TransitionValues transitionValues) {
        m81801a(transitionValues, this.f55518t, this.f55509k, this.f55520v);
    }

    public void captureStartValues(TransitionValues transitionValues) {
        m81801a(transitionValues, this.f55517s, this.f55508j, this.f55519u);
    }

    /* renamed from: a */
    private static int m81795a(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{R.attr.transitionShapeAppearance});
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    /* renamed from: a */
    private C22538b m81799a(boolean z) {
        PathMotion pathMotion = getPathMotion();
        if ((pathMotion instanceof ArcMotion) || (pathMotion instanceof C22555h)) {
            return m81800a(z, f55500f, f55501g);
        }
        return m81800a(z, f55498d, f55499e);
    }

    /* renamed from: a */
    private static float m81794a(float f, View view) {
        if (f != -1.0f) {
            return f;
        }
        return ViewCompat.m4104s(view);
    }

    /* renamed from: a */
    private static C22398l m81798a(View view, C22398l lVar) {
        if (lVar != null) {
            return lVar;
        }
        if (view.getTag(R.id.mtrl_motion_snapshot_view) instanceof C22398l) {
            return (C22398l) view.getTag(R.id.mtrl_motion_snapshot_view);
        }
        Context context = view.getContext();
        int a = m81795a(context);
        if (a != -1) {
            return C22398l.m81157a(context, a, 0).mo78024a();
        }
        if (view instanceof AbstractC22413o) {
            return ((AbstractC22413o) view).getShapeAppearanceModel();
        }
        return C22398l.m81156a().mo78024a();
    }

    /* renamed from: a */
    private static C22398l m81797a(View view, RectF rectF, C22398l lVar) {
        return C22558k.m81861a(m81798a(view, lVar), rectF);
    }

    public Animator createAnimator(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
        View view;
        final View view2;
        if (!(transitionValues == null || transitionValues2 == null)) {
            RectF rectF = (RectF) transitionValues.values.get("materialContainerTransition:bounds");
            C22398l lVar = (C22398l) transitionValues.values.get("materialContainerTransition:shapeAppearance");
            if (rectF == null || lVar == null) {
                Log.w(f55496b, "Skipping due to null start bounds. Ensure start view is laid out and measured.");
            } else {
                RectF rectF2 = (RectF) transitionValues2.values.get("materialContainerTransition:bounds");
                C22398l lVar2 = (C22398l) transitionValues2.values.get("materialContainerTransition:shapeAppearance");
                if (rectF2 == null || lVar2 == null) {
                    Log.w(f55496b, "Skipping due to null end bounds. Ensure end view is laid out and measured.");
                    return null;
                }
                final View view3 = transitionValues.view;
                final View view4 = transitionValues2.view;
                if (view4.getParent() != null) {
                    view = view4;
                } else {
                    view = view3;
                }
                if (this.f55507i == view.getId()) {
                    view2 = (View) view.getParent();
                } else {
                    view2 = C22558k.m81867b(view, this.f55507i);
                    view = null;
                }
                RectF b = C22558k.m81866b(view2);
                float f = -b.left;
                float f2 = -b.top;
                RectF a = m81796a(view2, view, f, f2);
                rectF.offset(f, f2);
                rectF2.offset(f, f2);
                boolean a2 = m81802a(rectF, rectF2);
                final C22539c cVar = new C22539c(getPathMotion(), view3, rectF, lVar, m81794a(this.f55503B, view3), view4, rectF2, lVar2, m81794a(this.f55504C, view4), this.f55510l, this.f55511m, this.f55512n, this.f55513o, a2, this.f55502A, C22543b.m81829a(this.f55515q, a2), C22550e.m81839a(this.f55516r, a2, rectF, rectF2), m81799a(a2), this.f55506h);
                cVar.setBounds(Math.round(a.left), Math.round(a.top), Math.round(a.right), Math.round(a.bottom));
                ValueAnimator ofFloat = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f);
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    /* class com.google.android.material.transition.platform.MaterialContainerTransform.C225351 */

                    public void onAnimationUpdate(ValueAnimator valueAnimator) {
                        cVar.mo78631a(valueAnimator.getAnimatedFraction());
                    }
                });
                addListener(new AbstractC22557j() {
                    /* class com.google.android.material.transition.platform.MaterialContainerTransform.C225362 */

                    @Override // com.google.android.material.transition.platform.AbstractC22557j
                    public void onTransitionStart(Transition transition) {
                        C22365r.m81028e(view2).mo77864a(cVar);
                        view3.setAlpha(BitmapDescriptorFactory.HUE_RED);
                        view4.setAlpha(BitmapDescriptorFactory.HUE_RED);
                    }

                    @Override // com.google.android.material.transition.platform.AbstractC22557j
                    public void onTransitionEnd(Transition transition) {
                        MaterialContainerTransform.this.removeListener(this);
                        if (!MaterialContainerTransform.this.f55505a) {
                            view3.setAlpha(1.0f);
                            view4.setAlpha(1.0f);
                            C22365r.m81028e(view2).mo77865b(cVar);
                        }
                    }
                });
                return ofFloat;
            }
        }
        return null;
    }

    /* renamed from: a */
    private C22538b m81800a(boolean z, C22538b bVar, C22538b bVar2) {
        if (!z) {
            bVar = bVar2;
        }
        return new C22538b((C22537a) C22558k.m81864a(this.f55521w, bVar.f55534a), (C22537a) C22558k.m81864a(this.f55522x, bVar.f55535b), (C22537a) C22558k.m81864a(this.f55523y, bVar.f55536c), (C22537a) C22558k.m81864a(this.f55524z, bVar.f55537d));
    }

    /* access modifiers changed from: private */
    /* renamed from: com.google.android.material.transition.platform.MaterialContainerTransform$b */
    public static class C22538b {

        /* renamed from: a */
        public final C22537a f55534a;

        /* renamed from: b */
        public final C22537a f55535b;

        /* renamed from: c */
        public final C22537a f55536c;

        /* renamed from: d */
        public final C22537a f55537d;

        private C22538b(C22537a aVar, C22537a aVar2, C22537a aVar3, C22537a aVar4) {
            this.f55534a = aVar;
            this.f55535b = aVar2;
            this.f55536c = aVar3;
            this.f55537d = aVar4;
        }
    }

    /* renamed from: a */
    private static RectF m81796a(View view, View view2, float f, float f2) {
        if (view2 == null) {
            return new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) view.getWidth(), (float) view.getHeight());
        }
        RectF b = C22558k.m81866b(view2);
        b.offset(f, f2);
        return b;
    }

    /* renamed from: a */
    private static void m81801a(TransitionValues transitionValues, View view, int i, C22398l lVar) {
        RectF rectF;
        if (i != -1) {
            transitionValues.view = C22558k.m81860a(transitionValues.view, i);
        } else if (view != null) {
            transitionValues.view = view;
        } else if (transitionValues.view.getTag(R.id.mtrl_motion_snapshot_view) instanceof View) {
            transitionValues.view.setTag(R.id.mtrl_motion_snapshot_view, null);
            transitionValues.view = (View) transitionValues.view.getTag(R.id.mtrl_motion_snapshot_view);
        }
        View view2 = transitionValues.view;
        if (ViewCompat.m4012F(view2) || view2.getWidth() != 0 || view2.getHeight() != 0) {
            if (view2.getParent() == null) {
                rectF = C22558k.m81858a(view2);
            } else {
                rectF = C22558k.m81866b(view2);
            }
            transitionValues.values.put("materialContainerTransition:bounds", rectF);
            transitionValues.values.put("materialContainerTransition:shapeAppearance", m81797a(view2, rectF, lVar));
        }
    }
}
