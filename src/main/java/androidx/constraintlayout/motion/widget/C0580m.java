package androidx.constraintlayout.motion.widget;

import android.os.Build;
import android.util.Log;
import android.view.View;
import androidx.constraintlayout.motion.p024a.C0530c;
import androidx.constraintlayout.motion.widget.AbstractC0588r;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.widget.C0689b;
import androidx.constraintlayout.widget.ConstraintAttribute;
import com.huawei.hms.android.HwBuildEx;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;

/* access modifiers changed from: package-private */
/* renamed from: androidx.constraintlayout.motion.widget.m */
public class C0580m implements Comparable<C0580m> {

    /* renamed from: d */
    static String[] f2220d = {"position", "x", "y", "width", "height", "pathRotate"};

    /* renamed from: A */
    private float f2221A;

    /* renamed from: B */
    private float f2222B = Float.NaN;

    /* renamed from: C */
    private float f2223C = Float.NaN;

    /* renamed from: a */
    int f2224a;

    /* renamed from: b */
    int f2225b;

    /* renamed from: c */
    public float f2226c;

    /* renamed from: e */
    LinkedHashMap<String, ConstraintAttribute> f2227e = new LinkedHashMap<>();

    /* renamed from: f */
    int f2228f = 0;

    /* renamed from: g */
    double[] f2229g = new double[18];

    /* renamed from: h */
    double[] f2230h = new double[18];

    /* renamed from: i */
    private float f2231i = 1.0f;

    /* renamed from: j */
    private boolean f2232j;

    /* renamed from: k */
    private float f2233k;

    /* renamed from: l */
    private float f2234l;

    /* renamed from: m */
    private float f2235m;

    /* renamed from: n */
    private float f2236n = 1.0f;

    /* renamed from: o */
    private float f2237o = 1.0f;

    /* renamed from: p */
    private float f2238p = Float.NaN;

    /* renamed from: q */
    private float f2239q = Float.NaN;

    /* renamed from: r */
    private float f2240r;

    /* renamed from: s */
    private float f2241s;

    /* renamed from: t */
    private float f2242t;

    /* renamed from: u */
    private C0530c f2243u;

    /* renamed from: v */
    private int f2244v;

    /* renamed from: w */
    private float f2245w;

    /* renamed from: x */
    private float f2246x;

    /* renamed from: y */
    private float f2247y;

    /* renamed from: z */
    private float f2248z;

    /* renamed from: a */
    public int compareTo(C0580m mVar) {
        return Float.compare(this.f2245w, mVar.f2245w);
    }

    /* renamed from: b */
    public void mo3267b(View view) {
        mo3261a(view.getX(), view.getY(), (float) view.getWidth(), (float) view.getHeight());
        mo3262a(view);
    }

    /* renamed from: a */
    public void mo3262a(View view) {
        float f;
        this.f2225b = view.getVisibility();
        if (view.getVisibility() != 0) {
            f = BitmapDescriptorFactory.HUE_RED;
        } else {
            f = view.getAlpha();
        }
        this.f2231i = f;
        this.f2232j = false;
        if (Build.VERSION.SDK_INT >= 21) {
            this.f2233k = view.getElevation();
        }
        this.f2234l = view.getRotation();
        this.f2235m = view.getRotationX();
        this.f2226c = view.getRotationY();
        this.f2236n = view.getScaleX();
        this.f2237o = view.getScaleY();
        this.f2238p = view.getPivotX();
        this.f2239q = view.getPivotY();
        this.f2240r = view.getTranslationX();
        this.f2241s = view.getTranslationY();
        if (Build.VERSION.SDK_INT >= 21) {
            this.f2242t = view.getTranslationZ();
        }
    }

    /* renamed from: a */
    public void mo3265a(C0689b.C0690a aVar) {
        float f;
        this.f2224a = aVar.f2874b.f2941c;
        this.f2225b = aVar.f2874b.f2940b;
        if (aVar.f2874b.f2940b == 0 || this.f2224a != 0) {
            f = aVar.f2874b.f2942d;
        } else {
            f = BitmapDescriptorFactory.HUE_RED;
        }
        this.f2231i = f;
        this.f2232j = aVar.f2877e.f2956l;
        this.f2233k = aVar.f2877e.f2957m;
        this.f2234l = aVar.f2877e.f2946b;
        this.f2235m = aVar.f2877e.f2947c;
        this.f2226c = aVar.f2877e.f2948d;
        this.f2236n = aVar.f2877e.f2949e;
        this.f2237o = aVar.f2877e.f2950f;
        this.f2238p = aVar.f2877e.f2951g;
        this.f2239q = aVar.f2877e.f2952h;
        this.f2240r = aVar.f2877e.f2953i;
        this.f2241s = aVar.f2877e.f2954j;
        this.f2242t = aVar.f2877e.f2955k;
        this.f2243u = C0530c.m2431a(aVar.f2875c.f2934c);
        this.f2222B = aVar.f2875c.f2938g;
        this.f2244v = aVar.f2875c.f2936e;
        this.f2223C = aVar.f2874b.f2943e;
        for (String str : aVar.f2878f.keySet()) {
            ConstraintAttribute constraintAttribute = aVar.f2878f.get(str);
            if (constraintAttribute.mo3794a() != ConstraintAttribute.AttributeType.STRING_TYPE) {
                this.f2227e.put(str, constraintAttribute);
            }
        }
    }

    /* renamed from: a */
    private boolean m2626a(float f, float f2) {
        if (Float.isNaN(f) || Float.isNaN(f2)) {
            if (Float.isNaN(f) != Float.isNaN(f2)) {
                return true;
            }
            return false;
        } else if (Math.abs(f - f2) > 1.0E-6f) {
            return true;
        } else {
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3263a(C0580m mVar, HashSet<String> hashSet) {
        if (m2626a(this.f2231i, mVar.f2231i)) {
            hashSet.add("alpha");
        }
        if (m2626a(this.f2233k, mVar.f2233k)) {
            hashSet.add("elevation");
        }
        int i = this.f2225b;
        int i2 = mVar.f2225b;
        if (i != i2 && this.f2224a == 0 && (i == 0 || i2 == 0)) {
            hashSet.add("alpha");
        }
        if (m2626a(this.f2234l, mVar.f2234l)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.f2222B) || !Float.isNaN(mVar.f2222B)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f2223C) || !Float.isNaN(mVar.f2223C)) {
            hashSet.add("progress");
        }
        if (m2626a(this.f2235m, mVar.f2235m)) {
            hashSet.add("rotationX");
        }
        if (m2626a(this.f2226c, mVar.f2226c)) {
            hashSet.add("rotationY");
        }
        if (m2626a(this.f2238p, mVar.f2238p)) {
            hashSet.add("transformPivotX");
        }
        if (m2626a(this.f2239q, mVar.f2239q)) {
            hashSet.add("transformPivotY");
        }
        if (m2626a(this.f2236n, mVar.f2236n)) {
            hashSet.add("scaleX");
        }
        if (m2626a(this.f2237o, mVar.f2237o)) {
            hashSet.add("scaleY");
        }
        if (m2626a(this.f2240r, mVar.f2240r)) {
            hashSet.add("translationX");
        }
        if (m2626a(this.f2241s, mVar.f2241s)) {
            hashSet.add("translationY");
        }
        if (m2626a(this.f2242t, mVar.f2242t)) {
            hashSet.add("translationZ");
        }
    }

    /* renamed from: a */
    public void mo3266a(HashMap<String, AbstractC0588r> hashMap, int i) {
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
                case -760884510:
                    if (str.equals("transformPivotX")) {
                        c = '\b';
                        break;
                    }
                    break;
                case -760884509:
                    if (str.equals("transformPivotY")) {
                        c = '\t';
                        break;
                    }
                    break;
                case -40300674:
                    if (str.equals("rotation")) {
                        c = '\n';
                        break;
                    }
                    break;
                case -4379043:
                    if (str.equals("elevation")) {
                        c = 11;
                        break;
                    }
                    break;
                case 37232917:
                    if (str.equals("transitionPathRotate")) {
                        c = '\f';
                        break;
                    }
                    break;
                case 92909918:
                    if (str.equals("alpha")) {
                        c = '\r';
                        break;
                    }
                    break;
            }
            float f = 1.0f;
            float f2 = BitmapDescriptorFactory.HUE_RED;
            switch (c) {
                case 0:
                    if (!Float.isNaN(this.f2235m)) {
                        f2 = this.f2235m;
                    }
                    rVar.mo3352a(i, f2);
                    break;
                case 1:
                    if (!Float.isNaN(this.f2226c)) {
                        f2 = this.f2226c;
                    }
                    rVar.mo3352a(i, f2);
                    break;
                case 2:
                    if (!Float.isNaN(this.f2240r)) {
                        f2 = this.f2240r;
                    }
                    rVar.mo3352a(i, f2);
                    break;
                case 3:
                    if (!Float.isNaN(this.f2241s)) {
                        f2 = this.f2241s;
                    }
                    rVar.mo3352a(i, f2);
                    break;
                case 4:
                    if (!Float.isNaN(this.f2242t)) {
                        f2 = this.f2242t;
                    }
                    rVar.mo3352a(i, f2);
                    break;
                case 5:
                    if (!Float.isNaN(this.f2223C)) {
                        f2 = this.f2223C;
                    }
                    rVar.mo3352a(i, f2);
                    break;
                case 6:
                    if (!Float.isNaN(this.f2236n)) {
                        f = this.f2236n;
                    }
                    rVar.mo3352a(i, f);
                    break;
                case 7:
                    if (!Float.isNaN(this.f2237o)) {
                        f = this.f2237o;
                    }
                    rVar.mo3352a(i, f);
                    break;
                case '\b':
                    if (!Float.isNaN(this.f2238p)) {
                        f2 = this.f2238p;
                    }
                    rVar.mo3352a(i, f2);
                    break;
                case '\t':
                    if (!Float.isNaN(this.f2239q)) {
                        f2 = this.f2239q;
                    }
                    rVar.mo3352a(i, f2);
                    break;
                case '\n':
                    if (!Float.isNaN(this.f2234l)) {
                        f2 = this.f2234l;
                    }
                    rVar.mo3352a(i, f2);
                    break;
                case 11:
                    if (!Float.isNaN(this.f2233k)) {
                        f2 = this.f2233k;
                    }
                    rVar.mo3352a(i, f2);
                    break;
                case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                    if (!Float.isNaN(this.f2222B)) {
                        f2 = this.f2222B;
                    }
                    rVar.mo3352a(i, f2);
                    break;
                case '\r':
                    if (!Float.isNaN(this.f2231i)) {
                        f = this.f2231i;
                    }
                    rVar.mo3352a(i, f);
                    break;
                default:
                    if (str.startsWith("CUSTOM")) {
                        String str2 = str.split(",")[1];
                        if (this.f2227e.containsKey(str2)) {
                            ConstraintAttribute constraintAttribute = this.f2227e.get(str2);
                            if (rVar instanceof AbstractC0588r.C0590b) {
                                ((AbstractC0588r.C0590b) rVar).mo3357a(i, constraintAttribute);
                                break;
                            } else {
                                Log.e("MotionPaths", str + " splineSet not a CustomSet frame = " + i + ", value" + constraintAttribute.mo3799c() + rVar);
                                break;
                            }
                        } else {
                            Log.e("MotionPaths", "UNKNOWN customName " + str2);
                            break;
                        }
                    } else {
                        Log.e("MotionPaths", "UNKNOWN spline " + str);
                        break;
                    }
            }
        }
    }

    /* renamed from: a */
    public void mo3264a(ConstraintWidget constraintWidget, C0689b bVar, int i) {
        mo3261a((float) constraintWidget.mo3600y(), (float) constraintWidget.mo3601z(), (float) constraintWidget.mo3499A(), (float) constraintWidget.mo3500B());
        mo3265a(bVar.mo3878a(i));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3261a(float f, float f2, float f3, float f4) {
        this.f2246x = f;
        this.f2247y = f2;
        this.f2248z = f3;
        this.f2221A = f4;
    }
}
