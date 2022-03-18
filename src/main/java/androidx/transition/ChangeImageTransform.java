package androidx.transition;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.transition.C1560x;
import java.util.Map;

public class ChangeImageTransform extends Transition {

    /* renamed from: a */
    private static final String[] f5209a = {"android:changeImageTransform:matrix", "android:changeImageTransform:bounds"};

    /* renamed from: i */
    private static final TypeEvaluator<Matrix> f5210i = new TypeEvaluator<Matrix>() {
        /* class androidx.transition.ChangeImageTransform.C14791 */

        /* renamed from: a */
        public Matrix evaluate(float f, Matrix matrix, Matrix matrix2) {
            return null;
        }
    };

    /* renamed from: j */
    private static final Property<ImageView, Matrix> f5211j = new Property<ImageView, Matrix>(Matrix.class, "animatedTransform") {
        /* class androidx.transition.ChangeImageTransform.C14802 */

        /* renamed from: a */
        public Matrix get(ImageView imageView) {
            return null;
        }

        /* renamed from: a */
        public void set(ImageView imageView, Matrix matrix) {
            C1544k.m7104a(imageView, matrix);
        }
    };

    public ChangeImageTransform() {
    }

    @Override // androidx.transition.Transition
    /* renamed from: a */
    public String[] mo7809a() {
        return f5209a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.transition.ChangeImageTransform$3 */
    public static /* synthetic */ class C14813 {

        /* renamed from: a */
        static final /* synthetic */ int[] f5212a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                android.widget.ImageView$ScaleType[] r0 = android.widget.ImageView.ScaleType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.transition.ChangeImageTransform.C14813.f5212a = r0
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_XY     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = androidx.transition.ChangeImageTransform.C14813.f5212a     // Catch:{ NoSuchFieldError -> 0x001d }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER_CROP     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.transition.ChangeImageTransform.C14813.<clinit>():void");
        }
    }

    @Override // androidx.transition.Transition
    /* renamed from: a */
    public void mo7807a(C1562y yVar) {
        m6738d(yVar);
    }

    @Override // androidx.transition.Transition
    /* renamed from: b */
    public void mo7810b(C1562y yVar) {
        m6738d(yVar);
    }

    /* renamed from: a */
    private ObjectAnimator m6733a(ImageView imageView) {
        return ObjectAnimator.ofObject(imageView, f5211j, f5210i, C1545l.f5419a, C1545l.f5419a);
    }

    /* renamed from: b */
    private static Matrix m6735b(ImageView imageView) {
        Drawable drawable = imageView.getDrawable();
        if (drawable.getIntrinsicWidth() > 0 && drawable.getIntrinsicHeight() > 0) {
            int i = C14813.f5212a[imageView.getScaleType().ordinal()];
            if (i == 1) {
                return m6736c(imageView);
            }
            if (i == 2) {
                return m6737d(imageView);
            }
        }
        return new Matrix(imageView.getImageMatrix());
    }

    /* renamed from: c */
    private static Matrix m6736c(ImageView imageView) {
        Drawable drawable = imageView.getDrawable();
        Matrix matrix = new Matrix();
        matrix.postScale(((float) imageView.getWidth()) / ((float) drawable.getIntrinsicWidth()), ((float) imageView.getHeight()) / ((float) drawable.getIntrinsicHeight()));
        return matrix;
    }

    /* renamed from: d */
    private static Matrix m6737d(ImageView imageView) {
        Drawable drawable = imageView.getDrawable();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        float width = (float) imageView.getWidth();
        float f = (float) intrinsicWidth;
        int intrinsicHeight = drawable.getIntrinsicHeight();
        float height = (float) imageView.getHeight();
        float f2 = (float) intrinsicHeight;
        float max = Math.max(width / f, height / f2);
        int round = Math.round((width - (f * max)) / 2.0f);
        int round2 = Math.round((height - (f2 * max)) / 2.0f);
        Matrix matrix = new Matrix();
        matrix.postScale(max, max);
        matrix.postTranslate((float) round, (float) round2);
        return matrix;
    }

    /* renamed from: d */
    private void m6738d(C1562y yVar) {
        View view = yVar.f5459b;
        if ((view instanceof ImageView) && view.getVisibility() == 0) {
            ImageView imageView = (ImageView) view;
            if (imageView.getDrawable() != null) {
                Map<String, Object> map = yVar.f5458a;
                map.put("android:changeImageTransform:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
                map.put("android:changeImageTransform:matrix", m6735b(imageView));
            }
        }
    }

    public ChangeImageTransform(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    private ObjectAnimator m6734a(ImageView imageView, Matrix matrix, Matrix matrix2) {
        return ObjectAnimator.ofObject(imageView, f5211j, new C1560x.C1561a(), matrix, matrix2);
    }

    @Override // androidx.transition.Transition
    /* renamed from: a */
    public Animator mo7806a(ViewGroup viewGroup, C1562y yVar, C1562y yVar2) {
        boolean z;
        if (yVar == null || yVar2 == null) {
            return null;
        }
        Rect rect = (Rect) yVar.f5458a.get("android:changeImageTransform:bounds");
        Rect rect2 = (Rect) yVar2.f5458a.get("android:changeImageTransform:bounds");
        if (rect == null || rect2 == null) {
            return null;
        }
        Matrix matrix = (Matrix) yVar.f5458a.get("android:changeImageTransform:matrix");
        Matrix matrix2 = (Matrix) yVar2.f5458a.get("android:changeImageTransform:matrix");
        if (!(matrix == null && matrix2 == null) && (matrix == null || !matrix.equals(matrix2))) {
            z = false;
        } else {
            z = true;
        }
        if (rect.equals(rect2) && z) {
            return null;
        }
        ImageView imageView = (ImageView) yVar2.f5459b;
        Drawable drawable = imageView.getDrawable();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            return m6733a(imageView);
        }
        if (matrix == null) {
            matrix = C1545l.f5419a;
        }
        if (matrix2 == null) {
            matrix2 = C1545l.f5419a;
        }
        f5211j.set(imageView, matrix);
        return m6734a(imageView, matrix, matrix2);
    }
}
