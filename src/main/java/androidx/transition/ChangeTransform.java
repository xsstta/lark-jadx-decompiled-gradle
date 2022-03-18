package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.res.C0767f;
import androidx.core.view.ViewCompat;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import org.xmlpull.v1.XmlPullParser;

public class ChangeTransform extends Transition {

    /* renamed from: i */
    private static final String[] f5214i = {"android:changeTransform:matrix", "android:changeTransform:transforms", "android:changeTransform:parentMatrix"};

    /* renamed from: j */
    private static final Property<C1486b, float[]> f5215j = new Property<C1486b, float[]>(float[].class, "nonTranslations") {
        /* class androidx.transition.ChangeTransform.C14821 */

        /* renamed from: a */
        public float[] get(C1486b bVar) {
            return null;
        }

        /* renamed from: a */
        public void set(C1486b bVar, float[] fArr) {
            bVar.mo7865a(fArr);
        }
    };

    /* renamed from: k */
    private static final Property<C1486b, PointF> f5216k = new Property<C1486b, PointF>(PointF.class, "translations") {
        /* class androidx.transition.ChangeTransform.C14832 */

        /* renamed from: a */
        public PointF get(C1486b bVar) {
            return null;
        }

        /* renamed from: a */
        public void set(C1486b bVar, PointF pointF) {
            bVar.mo7864a(pointF);
        }
    };

    /* renamed from: l */
    private static final boolean f5217l;

    /* renamed from: a */
    boolean f5218a = true;

    /* renamed from: m */
    private boolean f5219m = true;

    /* renamed from: n */
    private Matrix f5220n = new Matrix();

    /* access modifiers changed from: private */
    /* renamed from: androidx.transition.ChangeTransform$b */
    public static class C1486b {

        /* renamed from: a */
        private final Matrix f5231a = new Matrix();

        /* renamed from: b */
        private final View f5232b;

        /* renamed from: c */
        private final float[] f5233c;

        /* renamed from: d */
        private float f5234d;

        /* renamed from: e */
        private float f5235e;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public Matrix mo7863a() {
            return this.f5231a;
        }

        /* renamed from: b */
        private void m6770b() {
            float[] fArr = this.f5233c;
            fArr[2] = this.f5234d;
            fArr[5] = this.f5235e;
            this.f5231a.setValues(fArr);
            aj.m7003c(this.f5232b, this.f5231a);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo7864a(PointF pointF) {
            this.f5234d = pointF.x;
            this.f5235e = pointF.y;
            m6770b();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo7865a(float[] fArr) {
            System.arraycopy(fArr, 0, this.f5233c, 0, fArr.length);
            m6770b();
        }

        C1486b(View view, float[] fArr) {
            this.f5232b = view;
            float[] fArr2 = (float[]) fArr.clone();
            this.f5233c = fArr2;
            this.f5234d = fArr2[2];
            this.f5235e = fArr2[5];
            m6770b();
        }
    }

    @Override // androidx.transition.Transition
    /* renamed from: a */
    public String[] mo7809a() {
        return f5214i;
    }

    public ChangeTransform() {
    }

    static {
        boolean z;
        if (Build.VERSION.SDK_INT >= 21) {
            z = true;
        } else {
            z = false;
        }
        f5217l = z;
    }

    /* access modifiers changed from: private */
    /* renamed from: androidx.transition.ChangeTransform$c */
    public static class C1487c {

        /* renamed from: a */
        final float f5236a;

        /* renamed from: b */
        final float f5237b;

        /* renamed from: c */
        final float f5238c;

        /* renamed from: d */
        final float f5239d;

        /* renamed from: e */
        final float f5240e;

        /* renamed from: f */
        final float f5241f;

        /* renamed from: g */
        final float f5242g;

        /* renamed from: h */
        final float f5243h;

        public int hashCode() {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            float f = this.f5236a;
            int i8 = 0;
            if (f != BitmapDescriptorFactory.HUE_RED) {
                i = Float.floatToIntBits(f);
            } else {
                i = 0;
            }
            int i9 = i * 31;
            float f2 = this.f5237b;
            if (f2 != BitmapDescriptorFactory.HUE_RED) {
                i2 = Float.floatToIntBits(f2);
            } else {
                i2 = 0;
            }
            int i10 = (i9 + i2) * 31;
            float f3 = this.f5238c;
            if (f3 != BitmapDescriptorFactory.HUE_RED) {
                i3 = Float.floatToIntBits(f3);
            } else {
                i3 = 0;
            }
            int i11 = (i10 + i3) * 31;
            float f4 = this.f5239d;
            if (f4 != BitmapDescriptorFactory.HUE_RED) {
                i4 = Float.floatToIntBits(f4);
            } else {
                i4 = 0;
            }
            int i12 = (i11 + i4) * 31;
            float f5 = this.f5240e;
            if (f5 != BitmapDescriptorFactory.HUE_RED) {
                i5 = Float.floatToIntBits(f5);
            } else {
                i5 = 0;
            }
            int i13 = (i12 + i5) * 31;
            float f6 = this.f5241f;
            if (f6 != BitmapDescriptorFactory.HUE_RED) {
                i6 = Float.floatToIntBits(f6);
            } else {
                i6 = 0;
            }
            int i14 = (i13 + i6) * 31;
            float f7 = this.f5242g;
            if (f7 != BitmapDescriptorFactory.HUE_RED) {
                i7 = Float.floatToIntBits(f7);
            } else {
                i7 = 0;
            }
            int i15 = (i14 + i7) * 31;
            float f8 = this.f5243h;
            if (f8 != BitmapDescriptorFactory.HUE_RED) {
                i8 = Float.floatToIntBits(f8);
            }
            return i15 + i8;
        }

        /* renamed from: a */
        public void mo7866a(View view) {
            ChangeTransform.m6753a(view, this.f5236a, this.f5237b, this.f5238c, this.f5239d, this.f5240e, this.f5241f, this.f5242g, this.f5243h);
        }

        C1487c(View view) {
            this.f5236a = view.getTranslationX();
            this.f5237b = view.getTranslationY();
            this.f5238c = ViewCompat.m4105t(view);
            this.f5239d = view.getScaleX();
            this.f5240e = view.getScaleY();
            this.f5241f = view.getRotationX();
            this.f5242g = view.getRotationY();
            this.f5243h = view.getRotation();
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C1487c)) {
                return false;
            }
            C1487c cVar = (C1487c) obj;
            if (cVar.f5236a == this.f5236a && cVar.f5237b == this.f5237b && cVar.f5238c == this.f5238c && cVar.f5239d == this.f5239d && cVar.f5240e == this.f5240e && cVar.f5241f == this.f5241f && cVar.f5242g == this.f5242g && cVar.f5243h == this.f5243h) {
                return true;
            }
            return false;
        }
    }

    @Override // androidx.transition.Transition
    /* renamed from: b */
    public void mo7810b(C1562y yVar) {
        m6757d(yVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: androidx.transition.ChangeTransform$a */
    public static class C1485a extends C1555u {

        /* renamed from: a */
        private View f5229a;

        /* renamed from: b */
        private AbstractC1538f f5230b;

        @Override // androidx.transition.C1555u, androidx.transition.Transition.AbstractC1505d
        /* renamed from: c */
        public void mo7817c(Transition transition) {
            this.f5230b.setVisibility(4);
        }

        @Override // androidx.transition.C1555u, androidx.transition.Transition.AbstractC1505d
        /* renamed from: d */
        public void mo7818d(Transition transition) {
            this.f5230b.setVisibility(0);
        }

        @Override // androidx.transition.C1555u, androidx.transition.Transition.AbstractC1505d
        /* renamed from: b */
        public void mo7816b(Transition transition) {
            transition.mo7898b(this);
            C1543j.m7102a(this.f5229a);
            this.f5229a.setTag(R.id.transition_transform, null);
            this.f5229a.setTag(R.id.parent_matrix, null);
        }

        C1485a(View view, AbstractC1538f fVar) {
            this.f5229a = view;
            this.f5230b = fVar;
        }
    }

    /* renamed from: a */
    static void m6752a(View view) {
        m6753a(view, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f, 1.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
    }

    /* renamed from: d */
    private void m6757d(C1562y yVar) {
        Matrix matrix;
        View view = yVar.f5459b;
        if (view.getVisibility() != 8) {
            yVar.f5458a.put("android:changeTransform:parent", view.getParent());
            yVar.f5458a.put("android:changeTransform:transforms", new C1487c(view));
            Matrix matrix2 = view.getMatrix();
            if (matrix2 == null || matrix2.isIdentity()) {
                matrix = null;
            } else {
                matrix = new Matrix(matrix2);
            }
            yVar.f5458a.put("android:changeTransform:matrix", matrix);
            if (this.f5219m) {
                Matrix matrix3 = new Matrix();
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                aj.m6999a(viewGroup, matrix3);
                matrix3.preTranslate((float) (-viewGroup.getScrollX()), (float) (-viewGroup.getScrollY()));
                yVar.f5458a.put("android:changeTransform:parentMatrix", matrix3);
                yVar.f5458a.put("android:changeTransform:intermediateMatrix", view.getTag(R.id.transition_transform));
                yVar.f5458a.put("android:changeTransform:intermediateParentMatrix", view.getTag(R.id.parent_matrix));
            }
        }
    }

    @Override // androidx.transition.Transition
    /* renamed from: a */
    public void mo7807a(C1562y yVar) {
        m6757d(yVar);
        if (!f5217l) {
            ((ViewGroup) yVar.f5459b.getParent()).startViewTransition(yVar.f5459b);
        }
    }

    public ChangeTransform(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1553s.f5437g);
        XmlPullParser xmlPullParser = (XmlPullParser) attributeSet;
        this.f5218a = C0767f.m3699a(obtainStyledAttributes, xmlPullParser, "reparentWithOverlay", 1, true);
        this.f5219m = C0767f.m3699a(obtainStyledAttributes, xmlPullParser, "reparent", 0, true);
        obtainStyledAttributes.recycle();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        if (r5 == r4.f5459b) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001a, code lost:
        if (r4 == r5) goto L_0x001e;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m6754a(android.view.ViewGroup r4, android.view.ViewGroup r5) {
        /*
            r3 = this;
            boolean r0 = r3.mo7903b(r4)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x001a
            boolean r0 = r3.mo7903b(r5)
            if (r0 != 0) goto L_0x000f
            goto L_0x001a
        L_0x000f:
            androidx.transition.y r4 = r3.mo7899b(r4, r1)
            if (r4 == 0) goto L_0x001f
            android.view.View r4 = r4.f5459b
            if (r5 != r4) goto L_0x001d
            goto L_0x001e
        L_0x001a:
            if (r4 != r5) goto L_0x001d
            goto L_0x001e
        L_0x001d:
            r1 = 0
        L_0x001e:
            r2 = r1
        L_0x001f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.ChangeTransform.m6754a(android.view.ViewGroup, android.view.ViewGroup):boolean");
    }

    /* renamed from: b */
    private void m6756b(C1562y yVar, C1562y yVar2) {
        Matrix matrix = (Matrix) yVar2.f5458a.get("android:changeTransform:parentMatrix");
        yVar2.f5459b.setTag(R.id.parent_matrix, matrix);
        Matrix matrix2 = this.f5220n;
        matrix2.reset();
        matrix.invert(matrix2);
        Matrix matrix3 = (Matrix) yVar.f5458a.get("android:changeTransform:matrix");
        if (matrix3 == null) {
            matrix3 = new Matrix();
            yVar.f5458a.put("android:changeTransform:matrix", matrix3);
        }
        matrix3.postConcat((Matrix) yVar.f5458a.get("android:changeTransform:parentMatrix"));
        matrix3.postConcat(matrix2);
    }

    /* renamed from: b */
    private void m6755b(ViewGroup viewGroup, C1562y yVar, C1562y yVar2) {
        View view = yVar2.f5459b;
        Matrix matrix = new Matrix((Matrix) yVar2.f5458a.get("android:changeTransform:parentMatrix"));
        aj.m7001b(viewGroup, matrix);
        AbstractC1538f a = C1543j.m7101a(view, viewGroup, matrix);
        if (a != null) {
            a.mo8001a((ViewGroup) yVar.f5458a.get("android:changeTransform:parent"), yVar.f5459b);
            Transition transition = this;
            while (transition.f5279e != null) {
                transition = transition.f5279e;
            }
            transition.mo7880a(new C1485a(view, a));
            if (f5217l) {
                if (yVar.f5459b != yVar2.f5459b) {
                    aj.m6996a(yVar.f5459b, (float) BitmapDescriptorFactory.HUE_RED);
                }
                aj.m6996a(view, 1.0f);
            }
        }
    }

    @Override // androidx.transition.Transition
    /* renamed from: a */
    public Animator mo7806a(ViewGroup viewGroup, C1562y yVar, C1562y yVar2) {
        boolean z;
        if (yVar == null || yVar2 == null || !yVar.f5458a.containsKey("android:changeTransform:parent") || !yVar2.f5458a.containsKey("android:changeTransform:parent")) {
            return null;
        }
        ViewGroup viewGroup2 = (ViewGroup) yVar.f5458a.get("android:changeTransform:parent");
        ViewGroup viewGroup3 = (ViewGroup) yVar2.f5458a.get("android:changeTransform:parent");
        if (!this.f5219m || m6754a(viewGroup2, viewGroup3)) {
            z = false;
        } else {
            z = true;
        }
        Matrix matrix = (Matrix) yVar.f5458a.get("android:changeTransform:intermediateMatrix");
        if (matrix != null) {
            yVar.f5458a.put("android:changeTransform:matrix", matrix);
        }
        Matrix matrix2 = (Matrix) yVar.f5458a.get("android:changeTransform:intermediateParentMatrix");
        if (matrix2 != null) {
            yVar.f5458a.put("android:changeTransform:parentMatrix", matrix2);
        }
        if (z) {
            m6756b(yVar, yVar2);
        }
        ObjectAnimator a = m6751a(yVar, yVar2, z);
        if (z && a != null && this.f5218a) {
            m6755b(viewGroup, yVar, yVar2);
        } else if (!f5217l) {
            viewGroup2.endViewTransition(yVar.f5459b);
        }
        return a;
    }

    /* renamed from: a */
    private ObjectAnimator m6751a(C1562y yVar, C1562y yVar2, final boolean z) {
        Matrix matrix = (Matrix) yVar.f5458a.get("android:changeTransform:matrix");
        final Matrix matrix2 = (Matrix) yVar2.f5458a.get("android:changeTransform:matrix");
        if (matrix == null) {
            matrix = C1545l.f5419a;
        }
        if (matrix2 == null) {
            matrix2 = C1545l.f5419a;
        }
        if (matrix.equals(matrix2)) {
            return null;
        }
        final C1487c cVar = (C1487c) yVar2.f5458a.get("android:changeTransform:transforms");
        final View view = yVar2.f5459b;
        m6752a(view);
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        float[] fArr2 = new float[9];
        matrix2.getValues(fArr2);
        final C1486b bVar = new C1486b(view, fArr);
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(bVar, PropertyValuesHolder.ofObject(f5215j, new C1530d(new float[9]), fArr, fArr2), C1549o.m7110a(f5216k, mo7920m().mo7802a(fArr[2], fArr[5], fArr2[2], fArr2[5])));
        C14843 r14 = new AnimatorListenerAdapter() {
            /* class androidx.transition.ChangeTransform.C14843 */

            /* renamed from: g */
            private boolean f5227g;

            /* renamed from: h */
            private Matrix f5228h = new Matrix();

            public void onAnimationCancel(Animator animator) {
                this.f5227g = true;
            }

            public void onAnimationResume(Animator animator) {
                ChangeTransform.m6752a(view);
            }

            public void onAnimationPause(Animator animator) {
                m6766a(bVar.mo7863a());
            }

            /* renamed from: a */
            private void m6766a(Matrix matrix) {
                this.f5228h.set(matrix);
                view.setTag(R.id.transition_transform, this.f5228h);
                cVar.mo7866a(view);
            }

            public void onAnimationEnd(Animator animator) {
                if (!this.f5227g) {
                    if (!z || !ChangeTransform.this.f5218a) {
                        view.setTag(R.id.transition_transform, null);
                        view.setTag(R.id.parent_matrix, null);
                    } else {
                        m6766a(matrix2);
                    }
                }
                aj.m7003c(view, null);
                cVar.mo7866a(view);
            }
        };
        ofPropertyValuesHolder.addListener(r14);
        C1511a.m6957a(ofPropertyValuesHolder, r14);
        return ofPropertyValuesHolder;
    }

    /* renamed from: a */
    static void m6753a(View view, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        view.setTranslationX(f);
        view.setTranslationY(f2);
        ViewCompat.m4095l(view, f3);
        view.setScaleX(f4);
        view.setScaleY(f5);
        view.setRotationX(f6);
        view.setRotationY(f7);
        view.setRotation(f8);
    }
}
