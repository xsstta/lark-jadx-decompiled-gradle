package androidx.transition;

import android.view.View;

class am extends al {

    /* renamed from: a */
    private static boolean f5367a = true;

    am() {
    }

    @Override // androidx.transition.ap
    /* renamed from: a */
    public void mo7987a(View view, int i, int i2, int i3, int i4) {
        if (f5367a) {
            try {
                view.setLeftTopRightBottom(i, i2, i3, i4);
            } catch (NoSuchMethodError unused) {
                f5367a = false;
            }
        }
    }
}
