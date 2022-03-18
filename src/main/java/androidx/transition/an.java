package androidx.transition;

import android.os.Build;
import android.view.View;

class an extends am {

    /* renamed from: a */
    private static boolean f5368a = true;

    an() {
    }

    @Override // androidx.transition.ap
    /* renamed from: a */
    public void mo7988a(View view, int i) {
        if (Build.VERSION.SDK_INT == 28) {
            super.mo7988a(view, i);
        } else if (f5368a) {
            try {
                view.setTransitionVisibility(i);
            } catch (NoSuchMethodError unused) {
                f5368a = false;
            }
        }
    }
}
