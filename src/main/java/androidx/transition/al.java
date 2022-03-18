package androidx.transition;

import android.graphics.Matrix;
import android.view.View;

class al extends ak {

    /* renamed from: a */
    private static boolean f5364a = true;

    /* renamed from: b */
    private static boolean f5365b = true;

    /* renamed from: c */
    private static boolean f5366c = true;

    al() {
    }

    @Override // androidx.transition.ap
    /* renamed from: a */
    public void mo7984a(View view, Matrix matrix) {
        if (f5365b) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError unused) {
                f5365b = false;
            }
        }
    }

    @Override // androidx.transition.ap
    /* renamed from: b */
    public void mo7985b(View view, Matrix matrix) {
        if (f5366c) {
            try {
                view.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                f5366c = false;
            }
        }
    }

    @Override // androidx.transition.ap
    /* renamed from: c */
    public void mo7986c(View view, Matrix matrix) {
        if (f5364a) {
            try {
                view.setAnimationMatrix(matrix);
            } catch (NoSuchMethodError unused) {
                f5364a = false;
            }
        }
    }
}
