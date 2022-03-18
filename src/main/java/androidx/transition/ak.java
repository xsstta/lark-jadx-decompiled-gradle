package androidx.transition;

import android.view.View;

class ak extends ap {

    /* renamed from: a */
    private static boolean f5363a = true;

    @Override // androidx.transition.ap
    /* renamed from: b */
    public void mo7982b(View view) {
    }

    @Override // androidx.transition.ap
    /* renamed from: c */
    public void mo7983c(View view) {
    }

    ak() {
    }

    @Override // androidx.transition.ap
    /* renamed from: a */
    public float mo7980a(View view) {
        if (f5363a) {
            try {
                return view.getTransitionAlpha();
            } catch (NoSuchMethodError unused) {
                f5363a = false;
            }
        }
        return view.getAlpha();
    }

    @Override // androidx.transition.ap
    /* renamed from: a */
    public void mo7981a(View view, float f) {
        if (f5363a) {
            try {
                view.setTransitionAlpha(f);
                return;
            } catch (NoSuchMethodError unused) {
                f5363a = false;
            }
        }
        view.setAlpha(f);
    }
}
