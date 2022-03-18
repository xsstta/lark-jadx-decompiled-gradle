package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TypeEvaluator;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;

/* renamed from: androidx.transition.x */
class C1560x {

    /* renamed from: a */
    private static final boolean f5452a;

    /* renamed from: b */
    private static final boolean f5453b;

    /* renamed from: c */
    private static final boolean f5454c;

    /* renamed from: androidx.transition.x$a */
    static class C1561a implements TypeEvaluator<Matrix> {

        /* renamed from: a */
        final float[] f5455a = new float[9];

        /* renamed from: b */
        final float[] f5456b = new float[9];

        /* renamed from: c */
        final Matrix f5457c = new Matrix();

        C1561a() {
        }

        /* renamed from: a */
        public Matrix evaluate(float f, Matrix matrix, Matrix matrix2) {
            matrix.getValues(this.f5455a);
            matrix2.getValues(this.f5456b);
            for (int i = 0; i < 9; i++) {
                float[] fArr = this.f5456b;
                float f2 = fArr[i];
                float[] fArr2 = this.f5455a;
                fArr[i] = fArr2[i] + ((f2 - fArr2[i]) * f);
            }
            this.f5457c.setValues(this.f5456b);
            return this.f5457c;
        }
    }

    static {
        boolean z;
        boolean z2;
        boolean z3 = true;
        if (Build.VERSION.SDK_INT >= 19) {
            z = true;
        } else {
            z = false;
        }
        f5452a = z;
        if (Build.VERSION.SDK_INT >= 18) {
            z2 = true;
        } else {
            z2 = false;
        }
        f5453b = z2;
        if (Build.VERSION.SDK_INT < 28) {
            z3 = false;
        }
        f5454c = z3;
    }

    /* renamed from: a */
    static Animator m7140a(Animator animator, Animator animator2) {
        if (animator == null) {
            return animator2;
        }
        if (animator2 == null) {
            return animator;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(animator, animator2);
        return animatorSet;
    }

    /* renamed from: a */
    static View m7142a(ViewGroup viewGroup, View view, View view2) {
        Matrix matrix = new Matrix();
        matrix.setTranslate((float) (-view2.getScrollX()), (float) (-view2.getScrollY()));
        aj.m6999a(view, matrix);
        aj.m7001b(viewGroup, matrix);
        RectF rectF = new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) view.getWidth(), (float) view.getHeight());
        matrix.mapRect(rectF);
        int round = Math.round(rectF.left);
        int round2 = Math.round(rectF.top);
        int round3 = Math.round(rectF.right);
        int round4 = Math.round(rectF.bottom);
        ImageView imageView = new ImageView(view.getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        Bitmap a = m7141a(view, matrix, rectF, viewGroup);
        if (a != null) {
            imageView.setImageBitmap(a);
        }
        imageView.measure(View.MeasureSpec.makeMeasureSpec(round3 - round, 1073741824), View.MeasureSpec.makeMeasureSpec(round4 - round2, 1073741824));
        imageView.layout(round, round2, round3, round4);
        return imageView;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0088  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.graphics.Bitmap m7141a(android.view.View r9, android.graphics.Matrix r10, android.graphics.RectF r11, android.view.ViewGroup r12) {
        /*
        // Method dump skipped, instructions count: 168
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.C1560x.m7141a(android.view.View, android.graphics.Matrix, android.graphics.RectF, android.view.ViewGroup):android.graphics.Bitmap");
    }
}
