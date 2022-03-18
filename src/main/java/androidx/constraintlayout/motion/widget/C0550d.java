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

/* renamed from: androidx.constraintlayout.motion.widget.d */
public class C0550d extends AbstractC0549c {

    /* renamed from: g */
    public String f2101g;

    /* renamed from: h */
    public int f2102h = -1;

    /* renamed from: i */
    public float f2103i = Float.NaN;

    /* renamed from: j */
    public float f2104j = Float.NaN;

    /* renamed from: k */
    public float f2105k = Float.NaN;

    /* renamed from: l */
    public float f2106l = Float.NaN;

    /* renamed from: m */
    public float f2107m = Float.NaN;

    /* renamed from: n */
    public float f2108n = Float.NaN;

    /* renamed from: o */
    public float f2109o = Float.NaN;

    /* renamed from: p */
    public float f2110p = Float.NaN;

    /* renamed from: q */
    public float f2111q = Float.NaN;

    /* renamed from: r */
    public float f2112r = Float.NaN;

    /* renamed from: s */
    public float f2113s = Float.NaN;

    /* renamed from: t */
    public float f2114t = Float.NaN;

    /* renamed from: u */
    public float f2115u = Float.NaN;

    /* renamed from: v */
    public float f2116v = Float.NaN;

    public C0550d() {
        this.f2099e = 1;
        this.f2100f = new HashMap();
    }

    /* renamed from: androidx.constraintlayout.motion.widget.d$a */
    private static class C0551a {

        /* renamed from: a */
        private static SparseIntArray f2117a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f2117a = sparseIntArray;
            sparseIntArray.append(0, 1);
            f2117a.append(11, 2);
            f2117a.append(7, 4);
            f2117a.append(8, 5);
            f2117a.append(9, 6);
            f2117a.append(1, 19);
            f2117a.append(2, 20);
            f2117a.append(5, 7);
            f2117a.append(17, 8);
            f2117a.append(16, 9);
            f2117a.append(15, 10);
            f2117a.append(13, 12);
            f2117a.append(12, 13);
            f2117a.append(6, 14);
            f2117a.append(3, 15);
            f2117a.append(4, 16);
            f2117a.append(10, 17);
            f2117a.append(14, 18);
        }

        /* renamed from: a */
        public static void m2571a(C0550d dVar, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArray.getIndex(i);
                switch (f2117a.get(index)) {
                    case 1:
                        dVar.f2103i = typedArray.getFloat(index, dVar.f2103i);
                        break;
                    case 2:
                        dVar.f2104j = typedArray.getDimension(index, dVar.f2104j);
                        break;
                    case 3:
                    case 11:
                    default:
                        Log.e("KeyAttribute", "unused attribute 0x" + Integer.toHexString(index) + "   " + f2117a.get(index));
                        break;
                    case 4:
                        dVar.f2105k = typedArray.getFloat(index, dVar.f2105k);
                        break;
                    case 5:
                        dVar.f2106l = typedArray.getFloat(index, dVar.f2106l);
                        break;
                    case 6:
                        dVar.f2107m = typedArray.getFloat(index, dVar.f2107m);
                        break;
                    case 7:
                        dVar.f2111q = typedArray.getFloat(index, dVar.f2111q);
                        break;
                    case 8:
                        dVar.f2110p = typedArray.getFloat(index, dVar.f2110p);
                        break;
                    case 9:
                        dVar.f2101g = typedArray.getString(index);
                        break;
                    case 10:
                        if (!MotionLayout.f1994a) {
                            if (typedArray.peekValue(index).type == 3) {
                                dVar.f2098d = typedArray.getString(index);
                                break;
                            } else {
                                dVar.f2097c = typedArray.getResourceId(index, dVar.f2097c);
                                break;
                            }
                        } else {
                            dVar.f2097c = typedArray.getResourceId(index, dVar.f2097c);
                            if (dVar.f2097c == -1) {
                                dVar.f2098d = typedArray.getString(index);
                                break;
                            } else {
                                break;
                            }
                        }
                    case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                        dVar.f2096b = typedArray.getInt(index, dVar.f2096b);
                        break;
                    case 13:
                        dVar.f2102h = typedArray.getInteger(index, dVar.f2102h);
                        break;
                    case 14:
                        dVar.f2112r = typedArray.getFloat(index, dVar.f2112r);
                        break;
                    case 15:
                        dVar.f2113s = typedArray.getDimension(index, dVar.f2113s);
                        break;
                    case 16:
                        dVar.f2114t = typedArray.getDimension(index, dVar.f2114t);
                        break;
                    case 17:
                        if (Build.VERSION.SDK_INT >= 21) {
                            dVar.f2115u = typedArray.getDimension(index, dVar.f2115u);
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        dVar.f2116v = typedArray.getFloat(index, dVar.f2116v);
                        break;
                    case 19:
                        dVar.f2108n = typedArray.getDimension(index, dVar.f2108n);
                        break;
                    case 20:
                        dVar.f2109o = typedArray.getDimension(index, dVar.f2109o);
                        break;
                }
            }
        }
    }

    @Override // androidx.constraintlayout.motion.widget.AbstractC0549c
    /* renamed from: a */
    public void mo3234a(HashSet<String> hashSet) {
        if (!Float.isNaN(this.f2103i)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.f2104j)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f2105k)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.f2106l)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.f2107m)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.f2108n)) {
            hashSet.add("transformPivotX");
        }
        if (!Float.isNaN(this.f2109o)) {
            hashSet.add("transformPivotY");
        }
        if (!Float.isNaN(this.f2113s)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f2114t)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.f2115u)) {
            hashSet.add("translationZ");
        }
        if (!Float.isNaN(this.f2110p)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f2111q)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.f2112r)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f2116v)) {
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
        if (this.f2102h != -1) {
            if (!Float.isNaN(this.f2103i)) {
                hashMap.put("alpha", Integer.valueOf(this.f2102h));
            }
            if (!Float.isNaN(this.f2104j)) {
                hashMap.put("elevation", Integer.valueOf(this.f2102h));
            }
            if (!Float.isNaN(this.f2105k)) {
                hashMap.put("rotation", Integer.valueOf(this.f2102h));
            }
            if (!Float.isNaN(this.f2106l)) {
                hashMap.put("rotationX", Integer.valueOf(this.f2102h));
            }
            if (!Float.isNaN(this.f2107m)) {
                hashMap.put("rotationY", Integer.valueOf(this.f2102h));
            }
            if (!Float.isNaN(this.f2108n)) {
                hashMap.put("transformPivotX", Integer.valueOf(this.f2102h));
            }
            if (!Float.isNaN(this.f2109o)) {
                hashMap.put("transformPivotY", Integer.valueOf(this.f2102h));
            }
            if (!Float.isNaN(this.f2113s)) {
                hashMap.put("translationX", Integer.valueOf(this.f2102h));
            }
            if (!Float.isNaN(this.f2114t)) {
                hashMap.put("translationY", Integer.valueOf(this.f2102h));
            }
            if (!Float.isNaN(this.f2115u)) {
                hashMap.put("translationZ", Integer.valueOf(this.f2102h));
            }
            if (!Float.isNaN(this.f2110p)) {
                hashMap.put("transitionPathRotate", Integer.valueOf(this.f2102h));
            }
            if (!Float.isNaN(this.f2111q)) {
                hashMap.put("scaleX", Integer.valueOf(this.f2102h));
            }
            if (!Float.isNaN(this.f2112r)) {
                hashMap.put("scaleY", Integer.valueOf(this.f2102h));
            }
            if (!Float.isNaN(this.f2116v)) {
                hashMap.put("progress", Integer.valueOf(this.f2102h));
            }
            if (this.f2100f.size() > 0) {
                Iterator it = this.f2100f.keySet().iterator();
                while (it.hasNext()) {
                    hashMap.put("CUSTOM," + ((String) it.next()), Integer.valueOf(this.f2102h));
                }
            }
        }
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x009a, code lost:
        if (r1.equals("scaleY") == false) goto L_0x0044;
     */
    @Override // androidx.constraintlayout.motion.widget.AbstractC0549c
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo3233a(java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.widget.AbstractC0588r> r7) {
        /*
        // Method dump skipped, instructions count: 598
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.C0550d.mo3233a(java.util.HashMap):void");
    }

    @Override // androidx.constraintlayout.motion.widget.AbstractC0549c
    /* renamed from: a */
    public void mo3232a(Context context, AttributeSet attributeSet) {
        C0551a.m2571a(this, context.obtainStyledAttributes(attributeSet, new int[]{16843551, 16843552, 16843553, 16843554, 16843555, 16843556, 16843557, 16843558, 16843559, 16843560, 16843770, 16843840, R.attr.curveFit, R.attr.framePosition, R.attr.motionProgress, R.attr.motionTarget, R.attr.transitionEasing, R.attr.transitionPathRotate}));
    }
}
