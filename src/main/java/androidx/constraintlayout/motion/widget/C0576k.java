package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import com.huawei.hms.android.HwBuildEx;
import com.larksuite.suite.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: androidx.constraintlayout.motion.widget.k */
public class C0576k extends AbstractC0549c {

    /* renamed from: g */
    public String f2181g;

    /* renamed from: h */
    public int f2182h = -1;

    /* renamed from: i */
    public float f2183i = Float.NaN;

    /* renamed from: j */
    public float f2184j = Float.NaN;

    /* renamed from: k */
    public float f2185k = Float.NaN;

    /* renamed from: l */
    public float f2186l = Float.NaN;

    /* renamed from: m */
    public float f2187m = Float.NaN;

    /* renamed from: n */
    public float f2188n = Float.NaN;

    /* renamed from: o */
    public float f2189o = Float.NaN;

    /* renamed from: p */
    public float f2190p = Float.NaN;

    /* renamed from: q */
    public float f2191q = Float.NaN;

    /* renamed from: r */
    public float f2192r = Float.NaN;

    /* renamed from: s */
    public float f2193s = Float.NaN;

    /* renamed from: t */
    public float f2194t = Float.NaN;

    /* renamed from: u */
    public int f2195u;

    /* renamed from: v */
    public float f2196v = Float.NaN;

    /* renamed from: w */
    public float f2197w;

    public C0576k() {
        this.f2099e = 3;
        this.f2100f = new HashMap();
    }

    /* renamed from: androidx.constraintlayout.motion.widget.k$a */
    private static class C0577a {

        /* renamed from: a */
        private static SparseIntArray f2198a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f2198a = sparseIntArray;
            sparseIntArray.append(0, 1);
            f2198a.append(9, 2);
            f2198a.append(5, 4);
            f2198a.append(6, 5);
            f2198a.append(7, 6);
            f2198a.append(3, 7);
            f2198a.append(15, 8);
            f2198a.append(14, 9);
            f2198a.append(13, 10);
            f2198a.append(11, 12);
            f2198a.append(10, 13);
            f2198a.append(4, 14);
            f2198a.append(1, 15);
            f2198a.append(2, 16);
            f2198a.append(8, 17);
            f2198a.append(12, 18);
            f2198a.append(18, 20);
            f2198a.append(17, 21);
            f2198a.append(19, 19);
        }

        /* renamed from: a */
        public static void m2619a(C0576k kVar, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArray.getIndex(i);
                switch (f2198a.get(index)) {
                    case 1:
                        kVar.f2183i = typedArray.getFloat(index, kVar.f2183i);
                        break;
                    case 2:
                        kVar.f2184j = typedArray.getDimension(index, kVar.f2184j);
                        break;
                    case 3:
                    case 11:
                    default:
                        Log.e("KeyTimeCycle", "unused attribute 0x" + Integer.toHexString(index) + "   " + f2198a.get(index));
                        break;
                    case 4:
                        kVar.f2185k = typedArray.getFloat(index, kVar.f2185k);
                        break;
                    case 5:
                        kVar.f2186l = typedArray.getFloat(index, kVar.f2186l);
                        break;
                    case 6:
                        kVar.f2187m = typedArray.getFloat(index, kVar.f2187m);
                        break;
                    case 7:
                        kVar.f2189o = typedArray.getFloat(index, kVar.f2189o);
                        break;
                    case 8:
                        kVar.f2188n = typedArray.getFloat(index, kVar.f2188n);
                        break;
                    case 9:
                        kVar.f2181g = typedArray.getString(index);
                        break;
                    case 10:
                        if (!MotionLayout.f1994a) {
                            if (typedArray.peekValue(index).type == 3) {
                                kVar.f2098d = typedArray.getString(index);
                                break;
                            } else {
                                kVar.f2097c = typedArray.getResourceId(index, kVar.f2097c);
                                break;
                            }
                        } else {
                            kVar.f2097c = typedArray.getResourceId(index, kVar.f2097c);
                            if (kVar.f2097c == -1) {
                                kVar.f2098d = typedArray.getString(index);
                                break;
                            } else {
                                break;
                            }
                        }
                    case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                        kVar.f2096b = typedArray.getInt(index, kVar.f2096b);
                        break;
                    case 13:
                        kVar.f2182h = typedArray.getInteger(index, kVar.f2182h);
                        break;
                    case 14:
                        kVar.f2190p = typedArray.getFloat(index, kVar.f2190p);
                        break;
                    case 15:
                        kVar.f2191q = typedArray.getDimension(index, kVar.f2191q);
                        break;
                    case 16:
                        kVar.f2192r = typedArray.getDimension(index, kVar.f2192r);
                        break;
                    case 17:
                        if (Build.VERSION.SDK_INT >= 21) {
                            kVar.f2193s = typedArray.getDimension(index, kVar.f2193s);
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        kVar.f2194t = typedArray.getFloat(index, kVar.f2194t);
                        break;
                    case 19:
                        kVar.f2195u = typedArray.getInt(index, kVar.f2195u);
                        break;
                    case 20:
                        kVar.f2196v = typedArray.getFloat(index, kVar.f2196v);
                        break;
                    case 21:
                        if (typedArray.peekValue(index).type == 5) {
                            kVar.f2197w = typedArray.getDimension(index, kVar.f2197w);
                            break;
                        } else {
                            kVar.f2197w = typedArray.getFloat(index, kVar.f2197w);
                            break;
                        }
                }
            }
        }
    }

    @Override // androidx.constraintlayout.motion.widget.AbstractC0549c
    /* renamed from: a */
    public void mo3233a(HashMap<String, AbstractC0588r> hashMap) {
        throw new IllegalArgumentException(" KeyTimeCycles do not support SplineSet");
    }

    @Override // androidx.constraintlayout.motion.widget.AbstractC0549c
    /* renamed from: a */
    public void mo3234a(HashSet<String> hashSet) {
        if (!Float.isNaN(this.f2183i)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.f2184j)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f2185k)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.f2186l)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.f2187m)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.f2191q)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f2192r)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.f2193s)) {
            hashSet.add("translationZ");
        }
        if (!Float.isNaN(this.f2188n)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f2189o)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.f2190p)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f2194t)) {
            hashSet.add("progress");
        }
        if (this.f2100f.size() > 0) {
            Iterator it = this.f2100f.keySet().iterator();
            while (it.hasNext()) {
                hashSet.add("CUSTOM," + ((String) it.next()));
            }
        }
    }

    @Override // androidx.constraintlayout.motion.widget.AbstractC0549c
    /* renamed from: b */
    public void mo3236b(HashMap<String, Integer> hashMap) {
        if (this.f2182h != -1) {
            if (!Float.isNaN(this.f2183i)) {
                hashMap.put("alpha", Integer.valueOf(this.f2182h));
            }
            if (!Float.isNaN(this.f2184j)) {
                hashMap.put("elevation", Integer.valueOf(this.f2182h));
            }
            if (!Float.isNaN(this.f2185k)) {
                hashMap.put("rotation", Integer.valueOf(this.f2182h));
            }
            if (!Float.isNaN(this.f2186l)) {
                hashMap.put("rotationX", Integer.valueOf(this.f2182h));
            }
            if (!Float.isNaN(this.f2187m)) {
                hashMap.put("rotationY", Integer.valueOf(this.f2182h));
            }
            if (!Float.isNaN(this.f2191q)) {
                hashMap.put("translationX", Integer.valueOf(this.f2182h));
            }
            if (!Float.isNaN(this.f2192r)) {
                hashMap.put("translationY", Integer.valueOf(this.f2182h));
            }
            if (!Float.isNaN(this.f2193s)) {
                hashMap.put("translationZ", Integer.valueOf(this.f2182h));
            }
            if (!Float.isNaN(this.f2188n)) {
                hashMap.put("transitionPathRotate", Integer.valueOf(this.f2182h));
            }
            if (!Float.isNaN(this.f2189o)) {
                hashMap.put("scaleX", Integer.valueOf(this.f2182h));
            }
            if (!Float.isNaN(this.f2189o)) {
                hashMap.put("scaleY", Integer.valueOf(this.f2182h));
            }
            if (!Float.isNaN(this.f2194t)) {
                hashMap.put("progress", Integer.valueOf(this.f2182h));
            }
            if (this.f2100f.size() > 0) {
                Iterator it = this.f2100f.keySet().iterator();
                while (it.hasNext()) {
                    hashMap.put("CUSTOM," + ((String) it.next()), Integer.valueOf(this.f2182h));
                }
            }
        }
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0089, code lost:
        if (r1.equals("scaleY") == false) goto L_0x004d;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo3258c(java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.widget.AbstractC0605s> r11) {
        /*
        // Method dump skipped, instructions count: 604
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.C0576k.mo3258c(java.util.HashMap):void");
    }

    @Override // androidx.constraintlayout.motion.widget.AbstractC0549c
    /* renamed from: a */
    public void mo3232a(Context context, AttributeSet attributeSet) {
        C0577a.m2619a(this, context.obtainStyledAttributes(attributeSet, new int[]{16843551, 16843554, 16843555, 16843556, 16843557, 16843558, 16843559, 16843560, 16843770, 16843840, R.attr.curveFit, R.attr.framePosition, R.attr.motionProgress, R.attr.motionTarget, R.attr.transitionEasing, R.attr.transitionPathRotate, R.attr.waveDecay, R.attr.waveOffset, R.attr.wavePeriod, R.attr.waveShape}));
    }
}
