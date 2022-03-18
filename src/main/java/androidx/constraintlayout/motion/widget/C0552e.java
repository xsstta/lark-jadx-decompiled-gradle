package androidx.constraintlayout.motion.widget;

import java.util.Arrays;
import java.util.HashMap;

/* renamed from: androidx.constraintlayout.motion.widget.e */
public class C0552e {

    /* renamed from: a */
    HashMap<Object, HashMap<String, float[]>> f2118a = new HashMap<>();

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public float mo3237a(Object obj, String str, int i) {
        if (!this.f2118a.containsKey(obj)) {
            return Float.NaN;
        }
        HashMap<String, float[]> hashMap = this.f2118a.get(obj);
        if (!hashMap.containsKey(str)) {
            return Float.NaN;
        }
        float[] fArr = hashMap.get(str);
        if (fArr.length > i) {
            return fArr[i];
        }
        return Float.NaN;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3238a(Object obj, String str, int i, float f) {
        if (!this.f2118a.containsKey(obj)) {
            HashMap<String, float[]> hashMap = new HashMap<>();
            float[] fArr = new float[(i + 1)];
            fArr[i] = f;
            hashMap.put(str, fArr);
            this.f2118a.put(obj, hashMap);
            return;
        }
        HashMap<String, float[]> hashMap2 = this.f2118a.get(obj);
        if (!hashMap2.containsKey(str)) {
            float[] fArr2 = new float[(i + 1)];
            fArr2[i] = f;
            hashMap2.put(str, fArr2);
            this.f2118a.put(obj, hashMap2);
            return;
        }
        float[] fArr3 = hashMap2.get(str);
        if (fArr3.length <= i) {
            fArr3 = Arrays.copyOf(fArr3, i + 1);
        }
        fArr3[i] = f;
        hashMap2.put(str, fArr3);
    }
}
