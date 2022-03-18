package androidx.transition;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: androidx.transition.j */
class C1543j {
    /* renamed from: a */
    static void m7102a(View view) {
        if (Build.VERSION.SDK_INT == 28) {
            C1540h.m7089a(view);
        } else {
            C1541i.m7098b(view);
        }
    }

    /* renamed from: a */
    static AbstractC1538f m7101a(View view, ViewGroup viewGroup, Matrix matrix) {
        if (Build.VERSION.SDK_INT == 28) {
            return C1540h.m7087a(view, viewGroup, matrix);
        }
        return C1541i.m7097b(view, viewGroup, matrix);
    }
}
