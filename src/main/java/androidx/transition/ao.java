package androidx.transition;

import android.graphics.Matrix;
import android.view.View;

class ao extends an {
    ao() {
    }

    @Override // androidx.transition.ap, androidx.transition.ak
    /* renamed from: a */
    public float mo7980a(View view) {
        return view.getTransitionAlpha();
    }

    @Override // androidx.transition.ap, androidx.transition.ak
    /* renamed from: a */
    public void mo7981a(View view, float f) {
        view.setTransitionAlpha(f);
    }

    @Override // androidx.transition.ap, androidx.transition.al
    /* renamed from: b */
    public void mo7985b(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }

    @Override // androidx.transition.ap, androidx.transition.al
    /* renamed from: c */
    public void mo7986c(View view, Matrix matrix) {
        view.setAnimationMatrix(matrix);
    }

    @Override // androidx.transition.an, androidx.transition.ap
    /* renamed from: a */
    public void mo7988a(View view, int i) {
        view.setTransitionVisibility(i);
    }

    @Override // androidx.transition.ap, androidx.transition.al
    /* renamed from: a */
    public void mo7984a(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // androidx.transition.am, androidx.transition.ap
    /* renamed from: a */
    public void mo7987a(View view, int i, int i2, int i3, int i4) {
        view.setLeftTopRightBottom(i, i2, i3, i4);
    }
}
