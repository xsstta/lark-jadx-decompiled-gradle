package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.constraintlayout.widget.ConstraintAttribute;
import com.huawei.hms.android.HwBuildEx;
import com.larksuite.suite.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: androidx.constraintlayout.motion.widget.f */
public class C0553f extends AbstractC0549c {

    /* renamed from: g */
    public String f2119g;

    /* renamed from: h */
    public int f2120h;

    /* renamed from: i */
    public int f2121i = -1;

    /* renamed from: j */
    public float f2122j = Float.NaN;

    /* renamed from: k */
    public float f2123k;

    /* renamed from: l */
    public float f2124l = Float.NaN;

    /* renamed from: m */
    public int f2125m = -1;

    /* renamed from: n */
    public float f2126n = Float.NaN;

    /* renamed from: o */
    public float f2127o = Float.NaN;

    /* renamed from: p */
    public float f2128p = Float.NaN;

    /* renamed from: q */
    public float f2129q = Float.NaN;

    /* renamed from: r */
    public float f2130r = Float.NaN;

    /* renamed from: s */
    public float f2131s = Float.NaN;

    /* renamed from: t */
    public float f2132t = Float.NaN;

    /* renamed from: u */
    public float f2133u = Float.NaN;

    /* renamed from: v */
    public float f2134v = Float.NaN;

    /* renamed from: w */
    public float f2135w = Float.NaN;

    /* renamed from: x */
    public float f2136x = Float.NaN;

    public C0553f() {
        this.f2099e = 4;
        this.f2100f = new HashMap();
    }

    /* renamed from: androidx.constraintlayout.motion.widget.f$a */
    private static class C0554a {

        /* renamed from: a */
        private static SparseIntArray f2137a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f2137a = sparseIntArray;
            sparseIntArray.append(13, 1);
            f2137a.append(11, 2);
            f2137a.append(14, 3);
            f2137a.append(10, 4);
            f2137a.append(18, 5);
            f2137a.append(17, 6);
            f2137a.append(16, 7);
            f2137a.append(19, 8);
            f2137a.append(0, 9);
            f2137a.append(9, 10);
            f2137a.append(5, 11);
            f2137a.append(6, 12);
            f2137a.append(7, 13);
            f2137a.append(15, 14);
            f2137a.append(3, 15);
            f2137a.append(4, 16);
            f2137a.append(1, 17);
            f2137a.append(2, 18);
            f2137a.append(8, 19);
            f2137a.append(12, 20);
        }

        /* renamed from: a */
        public static void m2579a(C0553f fVar, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArray.getIndex(i);
                switch (f2137a.get(index)) {
                    case 1:
                        if (!MotionLayout.f1994a) {
                            if (typedArray.peekValue(index).type == 3) {
                                fVar.f2098d = typedArray.getString(index);
                                break;
                            } else {
                                fVar.f2097c = typedArray.getResourceId(index, fVar.f2097c);
                                break;
                            }
                        } else {
                            fVar.f2097c = typedArray.getResourceId(index, fVar.f2097c);
                            if (fVar.f2097c == -1) {
                                fVar.f2098d = typedArray.getString(index);
                                break;
                            } else {
                                break;
                            }
                        }
                    case 2:
                        fVar.f2096b = typedArray.getInt(index, fVar.f2096b);
                        break;
                    case 3:
                        fVar.f2119g = typedArray.getString(index);
                        break;
                    case 4:
                        fVar.f2120h = typedArray.getInteger(index, fVar.f2120h);
                        break;
                    case 5:
                        fVar.f2121i = typedArray.getInt(index, fVar.f2121i);
                        break;
                    case 6:
                        fVar.f2122j = typedArray.getFloat(index, fVar.f2122j);
                        break;
                    case 7:
                        if (typedArray.peekValue(index).type == 5) {
                            fVar.f2123k = typedArray.getDimension(index, fVar.f2123k);
                            break;
                        } else {
                            fVar.f2123k = typedArray.getFloat(index, fVar.f2123k);
                            break;
                        }
                    case 8:
                        fVar.f2125m = typedArray.getInt(index, fVar.f2125m);
                        break;
                    case 9:
                        fVar.f2126n = typedArray.getFloat(index, fVar.f2126n);
                        break;
                    case 10:
                        fVar.f2127o = typedArray.getDimension(index, fVar.f2127o);
                        break;
                    case 11:
                        fVar.f2128p = typedArray.getFloat(index, fVar.f2128p);
                        break;
                    case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                        fVar.f2130r = typedArray.getFloat(index, fVar.f2130r);
                        break;
                    case 13:
                        fVar.f2131s = typedArray.getFloat(index, fVar.f2131s);
                        break;
                    case 14:
                        fVar.f2129q = typedArray.getFloat(index, fVar.f2129q);
                        break;
                    case 15:
                        fVar.f2132t = typedArray.getFloat(index, fVar.f2132t);
                        break;
                    case 16:
                        fVar.f2133u = typedArray.getFloat(index, fVar.f2133u);
                        break;
                    case 17:
                        fVar.f2134v = typedArray.getDimension(index, fVar.f2134v);
                        break;
                    case 18:
                        fVar.f2135w = typedArray.getDimension(index, fVar.f2135w);
                        break;
                    case 19:
                        if (Build.VERSION.SDK_INT >= 21) {
                            fVar.f2136x = typedArray.getDimension(index, fVar.f2136x);
                            break;
                        } else {
                            break;
                        }
                    case 20:
                        fVar.f2124l = typedArray.getFloat(index, fVar.f2124l);
                        break;
                    default:
                        Log.e("KeyCycle", "unused attribute 0x" + Integer.toHexString(index) + "   " + f2137a.get(index));
                        break;
                }
            }
        }
    }

    /* renamed from: c */
    public void mo3240c(HashMap<String, AbstractC0555g> hashMap) {
        for (String str : hashMap.keySet()) {
            if (str.startsWith("CUSTOM")) {
                ConstraintAttribute constraintAttribute = (ConstraintAttribute) this.f2100f.get(str.substring(7));
                if (constraintAttribute != null && constraintAttribute.mo3794a() == ConstraintAttribute.AttributeType.FLOAT_TYPE) {
                    hashMap.get(str).mo3243a(this.f2096b, this.f2121i, this.f2125m, this.f2122j, this.f2123k, constraintAttribute.mo3799c(), constraintAttribute);
                }
            } else {
                float b = mo3239b(str);
                if (!Float.isNaN(b)) {
                    hashMap.get(str).mo3242a(this.f2096b, this.f2121i, this.f2125m, this.f2122j, this.f2123k, b);
                }
            }
        }
    }

    @Override // androidx.constraintlayout.motion.widget.AbstractC0549c
    /* renamed from: a */
    public void mo3234a(HashSet<String> hashSet) {
        if (!Float.isNaN(this.f2126n)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.f2127o)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f2128p)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.f2130r)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.f2131s)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.f2132t)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.f2133u)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f2129q)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f2134v)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f2135w)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.f2136x)) {
            hashSet.add("translationZ");
        }
        if (this.f2100f.size() > 0) {
            Iterator it = this.f2100f.keySet().iterator();
            while (it.hasNext()) {
                hashSet.add("CUSTOM," + ((String) it.next()));
            }
        }
    }

    @Override // androidx.constraintlayout.motion.widget.AbstractC0549c
    /* renamed from: a */
    public void mo3233a(HashMap<String, AbstractC0588r> hashMap) {
        C0547a.m2561a("KeyCycle", "add " + hashMap.size() + " values", 2);
        for (String str : hashMap.keySet()) {
            AbstractC0588r rVar = hashMap.get(str);
            str.hashCode();
            char c = 65535;
            switch (str.hashCode()) {
                case -1249320806:
                    if (str.equals("rotationX")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1249320805:
                    if (str.equals("rotationY")) {
                        c = 1;
                        break;
                    }
                    break;
                case -1225497657:
                    if (str.equals("translationX")) {
                        c = 2;
                        break;
                    }
                    break;
                case -1225497656:
                    if (str.equals("translationY")) {
                        c = 3;
                        break;
                    }
                    break;
                case -1225497655:
                    if (str.equals("translationZ")) {
                        c = 4;
                        break;
                    }
                    break;
                case -1001078227:
                    if (str.equals("progress")) {
                        c = 5;
                        break;
                    }
                    break;
                case -908189618:
                    if (str.equals("scaleX")) {
                        c = 6;
                        break;
                    }
                    break;
                case -908189617:
                    if (str.equals("scaleY")) {
                        c = 7;
                        break;
                    }
                    break;
                case -40300674:
                    if (str.equals("rotation")) {
                        c = '\b';
                        break;
                    }
                    break;
                case -4379043:
                    if (str.equals("elevation")) {
                        c = '\t';
                        break;
                    }
                    break;
                case 37232917:
                    if (str.equals("transitionPathRotate")) {
                        c = '\n';
                        break;
                    }
                    break;
                case 92909918:
                    if (str.equals("alpha")) {
                        c = 11;
                        break;
                    }
                    break;
                case 156108012:
                    if (str.equals("waveOffset")) {
                        c = '\f';
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    rVar.mo3352a(this.f2096b, this.f2130r);
                    break;
                case 1:
                    rVar.mo3352a(this.f2096b, this.f2131s);
                    break;
                case 2:
                    rVar.mo3352a(this.f2096b, this.f2134v);
                    break;
                case 3:
                    rVar.mo3352a(this.f2096b, this.f2135w);
                    break;
                case 4:
                    rVar.mo3352a(this.f2096b, this.f2136x);
                    break;
                case 5:
                    rVar.mo3352a(this.f2096b, this.f2124l);
                    break;
                case 6:
                    rVar.mo3352a(this.f2096b, this.f2132t);
                    break;
                case 7:
                    rVar.mo3352a(this.f2096b, this.f2133u);
                    break;
                case '\b':
                    rVar.mo3352a(this.f2096b, this.f2128p);
                    break;
                case '\t':
                    rVar.mo3352a(this.f2096b, this.f2127o);
                    break;
                case '\n':
                    rVar.mo3352a(this.f2096b, this.f2129q);
                    break;
                case 11:
                    rVar.mo3352a(this.f2096b, this.f2126n);
                    break;
                case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                    rVar.mo3352a(this.f2096b, this.f2123k);
                    break;
                default:
                    Log.v("KeyCycle", "WARNING KeyCycle UNKNOWN  " + str);
                    break;
            }
        }
    }

    /* renamed from: b */
    public float mo3239b(String str) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1249320806:
                if (str.equals("rotationX")) {
                    c = 0;
                    break;
                }
                break;
            case -1249320805:
                if (str.equals("rotationY")) {
                    c = 1;
                    break;
                }
                break;
            case -1225497657:
                if (str.equals("translationX")) {
                    c = 2;
                    break;
                }
                break;
            case -1225497656:
                if (str.equals("translationY")) {
                    c = 3;
                    break;
                }
                break;
            case -1225497655:
                if (str.equals("translationZ")) {
                    c = 4;
                    break;
                }
                break;
            case -1001078227:
                if (str.equals("progress")) {
                    c = 5;
                    break;
                }
                break;
            case -908189618:
                if (str.equals("scaleX")) {
                    c = 6;
                    break;
                }
                break;
            case -908189617:
                if (str.equals("scaleY")) {
                    c = 7;
                    break;
                }
                break;
            case -40300674:
                if (str.equals("rotation")) {
                    c = '\b';
                    break;
                }
                break;
            case -4379043:
                if (str.equals("elevation")) {
                    c = '\t';
                    break;
                }
                break;
            case 37232917:
                if (str.equals("transitionPathRotate")) {
                    c = '\n';
                    break;
                }
                break;
            case 92909918:
                if (str.equals("alpha")) {
                    c = 11;
                    break;
                }
                break;
            case 156108012:
                if (str.equals("waveOffset")) {
                    c = '\f';
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return this.f2130r;
            case 1:
                return this.f2131s;
            case 2:
                return this.f2134v;
            case 3:
                return this.f2135w;
            case 4:
                return this.f2136x;
            case 5:
                return this.f2124l;
            case 6:
                return this.f2132t;
            case 7:
                return this.f2133u;
            case '\b':
                return this.f2128p;
            case '\t':
                return this.f2127o;
            case '\n':
                return this.f2129q;
            case 11:
                return this.f2126n;
            case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                return this.f2123k;
            default:
                Log.v("KeyCycle", "WARNING! KeyCycle UNKNOWN  " + str);
                return Float.NaN;
        }
    }

    @Override // androidx.constraintlayout.motion.widget.AbstractC0549c
    /* renamed from: a */
    public void mo3232a(Context context, AttributeSet attributeSet) {
        C0554a.m2579a(this, context.obtainStyledAttributes(attributeSet, new int[]{16843551, 16843554, 16843555, 16843556, 16843557, 16843558, 16843559, 16843560, 16843770, 16843840, R.attr.curveFit, R.attr.framePosition, R.attr.motionProgress, R.attr.motionTarget, R.attr.transitionEasing, R.attr.transitionPathRotate, R.attr.waveOffset, R.attr.wavePeriod, R.attr.waveShape, R.attr.waveVariesBy}));
    }
}
