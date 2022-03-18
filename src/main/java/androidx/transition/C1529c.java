package androidx.transition;

import android.graphics.Rect;
import android.view.ViewGroup;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;

/* renamed from: androidx.transition.c */
public class C1529c extends aq {

    /* renamed from: a */
    private float f5380a = 3.0f;

    /* renamed from: a */
    private static float m7043a(float f, float f2, float f3, float f4) {
        float f5 = f3 - f;
        float f6 = f4 - f2;
        return (float) Math.sqrt((double) ((f5 * f5) + (f6 * f6)));
    }

    @Override // androidx.transition.AbstractC1559w
    /* renamed from: a */
    public long mo7998a(ViewGroup viewGroup, Transition transition, C1562y yVar, C1562y yVar2) {
        int i;
        int i2;
        int i3;
        if (yVar == null && yVar2 == null) {
            return 0;
        }
        if (yVar2 == null || mo7991b(yVar) == 0) {
            i = -1;
        } else {
            yVar = yVar2;
            i = 1;
        }
        int c = mo7992c(yVar);
        int d = mo7993d(yVar);
        Rect o = transition.mo7922o();
        if (o != null) {
            i3 = o.centerX();
            i2 = o.centerY();
        } else {
            int[] iArr = new int[2];
            viewGroup.getLocationOnScreen(iArr);
            int round = Math.round(((float) (iArr[0] + (viewGroup.getWidth() / 2))) + viewGroup.getTranslationX());
            i2 = Math.round(((float) (iArr[1] + (viewGroup.getHeight() / 2))) + viewGroup.getTranslationY());
            i3 = round;
        }
        float a = m7043a((float) c, (float) d, (float) i3, (float) i2) / m7043a((float) BitmapDescriptorFactory.HUE_RED, (float) BitmapDescriptorFactory.HUE_RED, (float) viewGroup.getWidth(), (float) viewGroup.getHeight());
        long b = transition.mo7895b();
        if (b < 0) {
            b = 300;
        }
        return (long) Math.round((((float) (b * ((long) i))) / this.f5380a) * a);
    }
}
