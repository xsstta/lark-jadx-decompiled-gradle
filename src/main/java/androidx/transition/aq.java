package androidx.transition;

import android.view.View;

public abstract class aq extends AbstractC1559w {

    /* renamed from: a */
    private static final String[] f5374a = {"android:visibilityPropagation:visibility", "android:visibilityPropagation:center"};

    @Override // androidx.transition.AbstractC1559w
    /* renamed from: a */
    public String[] mo7990a() {
        return f5374a;
    }

    /* renamed from: c */
    public int mo7992c(C1562y yVar) {
        return m7036a(yVar, 0);
    }

    /* renamed from: d */
    public int mo7993d(C1562y yVar) {
        return m7036a(yVar, 1);
    }

    /* renamed from: b */
    public int mo7991b(C1562y yVar) {
        Integer num;
        if (yVar == null || (num = (Integer) yVar.f5458a.get("android:visibilityPropagation:visibility")) == null) {
            return 8;
        }
        return num.intValue();
    }

    @Override // androidx.transition.AbstractC1559w
    /* renamed from: a */
    public void mo7989a(C1562y yVar) {
        View view = yVar.f5459b;
        Integer num = (Integer) yVar.f5458a.get("android:visibility:visibility");
        if (num == null) {
            num = Integer.valueOf(view.getVisibility());
        }
        yVar.f5458a.put("android:visibilityPropagation:visibility", num);
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        iArr[0] = iArr[0] + Math.round(view.getTranslationX());
        iArr[0] = iArr[0] + (view.getWidth() / 2);
        iArr[1] = iArr[1] + Math.round(view.getTranslationY());
        iArr[1] = iArr[1] + (view.getHeight() / 2);
        yVar.f5458a.put("android:visibilityPropagation:center", iArr);
    }

    /* renamed from: a */
    private static int m7036a(C1562y yVar, int i) {
        int[] iArr;
        if (yVar == null || (iArr = (int[]) yVar.f5458a.get("android:visibilityPropagation:center")) == null) {
            return -1;
        }
        return iArr[i];
    }
}
