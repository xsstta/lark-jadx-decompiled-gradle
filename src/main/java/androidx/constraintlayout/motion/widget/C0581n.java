package androidx.constraintlayout.motion.widget;

import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.p024a.AbstractC0528b;
import androidx.constraintlayout.motion.p024a.C0530c;
import androidx.constraintlayout.motion.p024a.C0536h;
import androidx.constraintlayout.motion.widget.AbstractC0555g;
import androidx.constraintlayout.motion.widget.AbstractC0588r;
import androidx.constraintlayout.motion.widget.AbstractC0605s;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.widget.C0689b;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: androidx.constraintlayout.motion.widget.n */
public class C0581n {

    /* renamed from: A */
    private C0578l[] f2249A;

    /* renamed from: B */
    private int f2250B = AbstractC0549c.f2095a;

    /* renamed from: a */
    View f2251a;

    /* renamed from: b */
    int f2252b;

    /* renamed from: c */
    String f2253c;

    /* renamed from: d */
    float f2254d = Float.NaN;

    /* renamed from: e */
    float f2255e = BitmapDescriptorFactory.HUE_RED;

    /* renamed from: f */
    float f2256f = 1.0f;

    /* renamed from: g */
    private int f2257g = -1;

    /* renamed from: h */
    private C0583p f2258h = new C0583p();

    /* renamed from: i */
    private C0583p f2259i = new C0583p();

    /* renamed from: j */
    private C0580m f2260j = new C0580m();

    /* renamed from: k */
    private C0580m f2261k = new C0580m();

    /* renamed from: l */
    private AbstractC0528b[] f2262l;

    /* renamed from: m */
    private AbstractC0528b f2263m;

    /* renamed from: n */
    private int[] f2264n;

    /* renamed from: o */
    private double[] f2265o;

    /* renamed from: p */
    private double[] f2266p;

    /* renamed from: q */
    private String[] f2267q;

    /* renamed from: r */
    private int[] f2268r;

    /* renamed from: s */
    private int f2269s = 4;

    /* renamed from: t */
    private float[] f2270t = new float[4];

    /* renamed from: u */
    private ArrayList<C0583p> f2271u = new ArrayList<>();

    /* renamed from: v */
    private float[] f2272v = new float[1];

    /* renamed from: w */
    private ArrayList<AbstractC0549c> f2273w = new ArrayList<>();

    /* renamed from: x */
    private HashMap<String, AbstractC0605s> f2274x;

    /* renamed from: y */
    private HashMap<String, AbstractC0588r> f2275y;

    /* renamed from: z */
    private HashMap<String, AbstractC0555g> f2276z;

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0105  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo3280a(float[] r21, int r22) {
        /*
        // Method dump skipped, instructions count: 281
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.C0581n.mo3280a(float[], int):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3279a(ArrayList<AbstractC0549c> arrayList) {
        this.f2273w.addAll(arrayList);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3277a(AbstractC0549c cVar) {
        this.f2273w.add(cVar);
    }

    /* renamed from: a */
    public void mo3276a(View view) {
        this.f2251a = view;
        this.f2252b = view.getId();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.LayoutParams) {
            this.f2253c = ((ConstraintLayout.LayoutParams) layoutParams).mo3846c();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3278a(ConstraintWidget constraintWidget, C0689b bVar) {
        this.f2258h.f2280d = BitmapDescriptorFactory.HUE_RED;
        this.f2258h.f2281e = BitmapDescriptorFactory.HUE_RED;
        m2637b(this.f2258h);
        this.f2258h.mo3290a((float) constraintWidget.mo3600y(), (float) constraintWidget.mo3601z(), (float) constraintWidget.mo3499A(), (float) constraintWidget.mo3500B());
        C0689b.C0690a a = bVar.mo3878a(this.f2252b);
        this.f2258h.mo3296a(a);
        this.f2254d = a.f2875c.f2937f;
        this.f2260j.mo3264a(constraintWidget, bVar, this.f2252b);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo3281a(View view, float f, long j, C0552e eVar) {
        boolean z;
        AbstractC0605s.C0609d dVar;
        double d;
        float a = m2635a(f, (float[]) null);
        HashMap<String, AbstractC0588r> hashMap = this.f2275y;
        if (hashMap != null) {
            for (AbstractC0588r rVar : hashMap.values()) {
                rVar.mo3353a(view, a);
            }
        }
        HashMap<String, AbstractC0605s> hashMap2 = this.f2274x;
        if (hashMap2 != null) {
            dVar = null;
            boolean z2 = false;
            for (AbstractC0605s sVar : hashMap2.values()) {
                if (sVar instanceof AbstractC0605s.C0609d) {
                    dVar = (AbstractC0605s.C0609d) sVar;
                } else {
                    z2 |= sVar.mo3365a(view, a, j, eVar);
                }
            }
            z = z2;
        } else {
            dVar = null;
            z = false;
        }
        AbstractC0528b[] bVarArr = this.f2262l;
        if (bVarArr != null) {
            double d2 = (double) a;
            bVarArr[0].mo3099a(d2, this.f2265o);
            this.f2262l[0].mo3103b(d2, this.f2266p);
            AbstractC0528b bVar = this.f2263m;
            if (bVar != null) {
                double[] dArr = this.f2265o;
                if (dArr.length > 0) {
                    bVar.mo3099a(d2, dArr);
                    this.f2263m.mo3103b(d2, this.f2266p);
                }
            }
            this.f2258h.mo3293a(view, this.f2264n, this.f2265o, this.f2266p, (double[]) null);
            HashMap<String, AbstractC0588r> hashMap3 = this.f2275y;
            if (hashMap3 != null) {
                for (AbstractC0588r rVar2 : hashMap3.values()) {
                    if (rVar2 instanceof AbstractC0588r.C0592d) {
                        double[] dArr2 = this.f2266p;
                        ((AbstractC0588r.C0592d) rVar2).mo3358a(view, a, dArr2[0], dArr2[1]);
                    }
                }
            }
            if (dVar != null) {
                double[] dArr3 = this.f2266p;
                d = d2;
                z = dVar.mo3368a(view, eVar, a, j, dArr3[0], dArr3[1]) | z;
            } else {
                d = d2;
            }
            int i = 1;
            while (true) {
                AbstractC0528b[] bVarArr2 = this.f2262l;
                if (i >= bVarArr2.length) {
                    break;
                }
                bVarArr2[i].mo3100a(d, this.f2270t);
                this.f2258h.f2289m.get(this.f2267q[i - 1]).mo3795a(view, this.f2270t);
                i++;
            }
            if (this.f2260j.f2224a == 0) {
                if (a <= BitmapDescriptorFactory.HUE_RED) {
                    view.setVisibility(this.f2260j.f2225b);
                } else if (a >= 1.0f) {
                    view.setVisibility(this.f2261k.f2225b);
                } else if (this.f2261k.f2225b != this.f2260j.f2225b) {
                    view.setVisibility(0);
                }
            }
            if (this.f2249A != null) {
                int i2 = 0;
                while (true) {
                    C0578l[] lVarArr = this.f2249A;
                    if (i2 >= lVarArr.length) {
                        break;
                    }
                    lVarArr[i2].mo3259a(a, view);
                    i2++;
                }
            }
        } else {
            float f2 = this.f2258h.f2282f + ((this.f2259i.f2282f - this.f2258h.f2282f) * a);
            float f3 = this.f2258h.f2283g + ((this.f2259i.f2283g - this.f2258h.f2283g) * a);
            float f4 = f2 + 0.5f;
            int i3 = (int) f4;
            float f5 = f3 + 0.5f;
            int i4 = (int) f5;
            int i5 = (int) (f4 + this.f2258h.f2284h + ((this.f2259i.f2284h - this.f2258h.f2284h) * a));
            int i6 = (int) (f5 + this.f2258h.f2285i + ((this.f2259i.f2285i - this.f2258h.f2285i) * a));
            int i7 = i5 - i3;
            int i8 = i6 - i4;
            if (!(this.f2259i.f2284h == this.f2258h.f2284h && this.f2259i.f2285i == this.f2258h.f2285i)) {
                view.measure(View.MeasureSpec.makeMeasureSpec(i7, 1073741824), View.MeasureSpec.makeMeasureSpec(i8, 1073741824));
            }
            view.layout(i3, i4, i5, i6);
        }
        HashMap<String, AbstractC0555g> hashMap4 = this.f2276z;
        if (hashMap4 != null) {
            for (AbstractC0555g gVar : hashMap4.values()) {
                if (gVar instanceof AbstractC0555g.C0561e) {
                    double[] dArr4 = this.f2266p;
                    ((AbstractC0555g.C0561e) gVar).mo3256a(view, a, dArr4[0], dArr4[1]);
                } else {
                    gVar.mo3244a(view, a);
                }
            }
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public float mo3269a() {
        return this.f2259i.f2282f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public float mo3282b() {
        return this.f2259i.f2283g;
    }

    /* renamed from: c */
    public int mo3286c() {
        int i = this.f2258h.f2279c;
        Iterator<C0583p> it = this.f2271u.iterator();
        while (it.hasNext()) {
            i = Math.max(i, it.next().f2279c);
        }
        return Math.max(i, this.f2259i.f2279c);
    }

    public String toString() {
        return " start: x: " + this.f2258h.f2282f + " y: " + this.f2258h.f2283g + " end: x: " + this.f2259i.f2282f + " y: " + this.f2259i.f2283g;
    }

    /* renamed from: d */
    private float m2638d() {
        float[] fArr = new float[2];
        float f = 1.0f / ((float) 99);
        double d = 0.0d;
        double d2 = 0.0d;
        float f2 = BitmapDescriptorFactory.HUE_RED;
        for (int i = 0; i < 100; i++) {
            float f3 = ((float) i) * f;
            double d3 = (double) f3;
            C0530c cVar = this.f2258h.f2278b;
            float f4 = Float.NaN;
            Iterator<C0583p> it = this.f2271u.iterator();
            float f5 = BitmapDescriptorFactory.HUE_RED;
            while (it.hasNext()) {
                C0583p next = it.next();
                if (next.f2278b != null) {
                    if (next.f2280d < f3) {
                        C0530c cVar2 = next.f2278b;
                        f5 = next.f2280d;
                        cVar = cVar2;
                    } else if (Float.isNaN(f4)) {
                        f4 = next.f2280d;
                    }
                }
            }
            if (cVar != null) {
                if (Float.isNaN(f4)) {
                    f4 = 1.0f;
                }
                float f6 = f4 - f5;
                d3 = (double) ((((float) cVar.mo3114a((double) ((f3 - f5) / f6))) * f6) + f5);
            }
            this.f2262l[0].mo3099a(d3, this.f2265o);
            this.f2258h.mo3298a(this.f2264n, this.f2265o, fArr, 0);
            if (i > 0) {
                f2 = (float) (((double) f2) + Math.hypot(d2 - ((double) fArr[1]), d - ((double) fArr[0])));
            }
            d = (double) fArr[0];
            d2 = (double) fArr[1];
        }
        return f2;
    }

    /* renamed from: b */
    public void mo3283b(int i) {
        this.f2250B = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0583p mo3271a(int i) {
        return this.f2271u.get(i);
    }

    /* renamed from: a */
    private void m2636a(C0583p pVar) {
        int binarySearch = Collections.binarySearch(this.f2271u, pVar);
        if (binarySearch == 0) {
            Log.e("MotionController", " KeyPath positon \"" + pVar.f2281e + "\" outside of range");
        }
        this.f2271u.add((-binarySearch) - 1, pVar);
    }

    /* renamed from: b */
    private void m2637b(C0583p pVar) {
        pVar.mo3290a((float) ((int) this.f2251a.getX()), (float) ((int) this.f2251a.getY()), (float) this.f2251a.getWidth(), (float) this.f2251a.getHeight());
    }

    C0581n(View view) {
        mo3276a(view);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo3284b(View view) {
        this.f2258h.f2280d = BitmapDescriptorFactory.HUE_RED;
        this.f2258h.f2281e = BitmapDescriptorFactory.HUE_RED;
        this.f2258h.mo3290a(view.getX(), view.getY(), (float) view.getWidth(), (float) view.getHeight());
        this.f2260j.mo3267b(view);
    }

    /* renamed from: a */
    private float m2635a(float f, float[] fArr) {
        float f2 = BitmapDescriptorFactory.HUE_RED;
        float f3 = 1.0f;
        if (fArr != null) {
            fArr[0] = 1.0f;
        } else {
            float f4 = this.f2256f;
            if (((double) f4) != 1.0d) {
                float f5 = this.f2255e;
                if (f < f5) {
                    f = BitmapDescriptorFactory.HUE_RED;
                }
                if (f > f5 && ((double) f) < 1.0d) {
                    f = (f - f5) * f4;
                }
            }
        }
        C0530c cVar = this.f2258h.f2278b;
        float f6 = Float.NaN;
        Iterator<C0583p> it = this.f2271u.iterator();
        while (it.hasNext()) {
            C0583p next = it.next();
            if (next.f2278b != null) {
                if (next.f2280d < f) {
                    cVar = next.f2278b;
                    f2 = next.f2280d;
                } else if (Float.isNaN(f6)) {
                    f6 = next.f2280d;
                }
            }
        }
        if (cVar != null) {
            if (!Float.isNaN(f6)) {
                f3 = f6;
            }
            float f7 = f3 - f2;
            double d = (double) ((f - f2) / f7);
            f = (((float) cVar.mo3114a(d)) * f7) + f2;
            if (fArr != null) {
                fArr[0] = (float) cVar.mo3115b(d);
            }
        }
        return f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo3270a(float[] fArr, int[] iArr) {
        if (fArr == null) {
            return 0;
        }
        double[] a = this.f2262l[0].mo3101a();
        if (iArr != null) {
            Iterator<C0583p> it = this.f2271u.iterator();
            int i = 0;
            while (it.hasNext()) {
                iArr[i] = it.next().f2290n;
                i++;
            }
        }
        int i2 = 0;
        for (double d : a) {
            this.f2262l[0].mo3099a(d, this.f2265o);
            this.f2258h.mo3298a(this.f2264n, this.f2265o, fArr, i2);
            i2 += 2;
        }
        return i2 / 2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo3285b(ConstraintWidget constraintWidget, C0689b bVar) {
        this.f2259i.f2280d = 1.0f;
        this.f2259i.f2281e = 1.0f;
        m2637b(this.f2259i);
        this.f2259i.mo3290a((float) constraintWidget.mo3600y(), (float) constraintWidget.mo3601z(), (float) constraintWidget.mo3499A(), (float) constraintWidget.mo3500B());
        this.f2259i.mo3296a(bVar.mo3878a(this.f2252b));
        this.f2261k.mo3264a(constraintWidget, bVar, this.f2252b);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3274a(float f, float[] fArr, int i) {
        this.f2262l[0].mo3099a((double) m2635a(f, (float[]) null), this.f2265o);
        this.f2258h.mo3302b(this.f2264n, this.f2265o, fArr, i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3272a(float f, float f2, float f3, float[] fArr) {
        double[] dArr;
        float a = m2635a(f, this.f2272v);
        AbstractC0528b[] bVarArr = this.f2262l;
        int i = 0;
        if (bVarArr != null) {
            double d = (double) a;
            bVarArr[0].mo3103b(d, this.f2266p);
            this.f2262l[0].mo3099a(d, this.f2265o);
            float f4 = this.f2272v[0];
            while (true) {
                dArr = this.f2266p;
                if (i >= dArr.length) {
                    break;
                }
                dArr[i] = dArr[i] * ((double) f4);
                i++;
            }
            AbstractC0528b bVar = this.f2263m;
            if (bVar != null) {
                double[] dArr2 = this.f2265o;
                if (dArr2.length > 0) {
                    bVar.mo3099a(d, dArr2);
                    this.f2263m.mo3103b(d, this.f2266p);
                    this.f2258h.mo3291a(f2, f3, fArr, this.f2264n, this.f2266p, this.f2265o);
                    return;
                }
                return;
            }
            this.f2258h.mo3291a(f2, f3, fArr, this.f2264n, dArr, this.f2265o);
            return;
        }
        float f5 = this.f2259i.f2282f - this.f2258h.f2282f;
        float f6 = this.f2259i.f2283g - this.f2258h.f2283g;
        float f7 = (this.f2259i.f2285i - this.f2258h.f2285i) + f6;
        fArr[0] = (f5 * (1.0f - f2)) + (((this.f2259i.f2284h - this.f2258h.f2284h) + f5) * f2);
        fArr[1] = (f6 * (1.0f - f3)) + (f7 * f3);
    }

    /* renamed from: a */
    public void mo3275a(int i, int i2, float f, long j) {
        ArrayList arrayList;
        boolean z;
        int i3;
        AbstractC0605s sVar;
        ConstraintAttribute constraintAttribute;
        int i4;
        AbstractC0588r rVar;
        ConstraintAttribute constraintAttribute2;
        new HashSet();
        HashSet<String> hashSet = new HashSet<>();
        HashSet<String> hashSet2 = new HashSet<>();
        HashSet<String> hashSet3 = new HashSet<>();
        HashMap<String, Integer> hashMap = new HashMap<>();
        if (this.f2250B != AbstractC0549c.f2095a) {
            this.f2258h.f2288l = this.f2250B;
        }
        this.f2260j.mo3263a(this.f2261k, hashSet2);
        ArrayList<AbstractC0549c> arrayList2 = this.f2273w;
        if (arrayList2 != null) {
            Iterator<AbstractC0549c> it = arrayList2.iterator();
            arrayList = null;
            while (it.hasNext()) {
                AbstractC0549c next = it.next();
                if (next instanceof C0573i) {
                    C0573i iVar = (C0573i) next;
                    m2636a(new C0583p(i, i2, iVar, this.f2258h, this.f2259i));
                    if (iVar.f2180q != AbstractC0549c.f2095a) {
                        this.f2257g = iVar.f2180q;
                    }
                } else if (next instanceof C0553f) {
                    next.mo3234a(hashSet3);
                } else if (next instanceof C0576k) {
                    next.mo3234a(hashSet);
                } else if (next instanceof C0578l) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add((C0578l) next);
                } else {
                    next.mo3236b(hashMap);
                    next.mo3234a(hashSet2);
                }
            }
        } else {
            arrayList = null;
        }
        char c = 0;
        if (arrayList != null) {
            this.f2249A = (C0578l[]) arrayList.toArray(new C0578l[0]);
        }
        char c2 = 1;
        if (!hashSet2.isEmpty()) {
            this.f2275y = new HashMap<>();
            Iterator<String> it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                String next2 = it2.next();
                if (next2.startsWith("CUSTOM,")) {
                    SparseArray sparseArray = new SparseArray();
                    String str = next2.split(",")[c2];
                    Iterator<AbstractC0549c> it3 = this.f2273w.iterator();
                    while (it3.hasNext()) {
                        AbstractC0549c next3 = it3.next();
                        if (!(next3.f2100f == null || (constraintAttribute2 = next3.f2100f.get(str)) == null)) {
                            sparseArray.append(next3.f2096b, constraintAttribute2);
                        }
                    }
                    rVar = AbstractC0588r.m2731a(next2, sparseArray);
                } else {
                    rVar = AbstractC0588r.m2732b(next2);
                }
                if (rVar != null) {
                    rVar.mo3354a(next2);
                    this.f2275y.put(next2, rVar);
                }
                c2 = 1;
            }
            ArrayList<AbstractC0549c> arrayList3 = this.f2273w;
            if (arrayList3 != null) {
                Iterator<AbstractC0549c> it4 = arrayList3.iterator();
                while (it4.hasNext()) {
                    AbstractC0549c next4 = it4.next();
                    if (next4 instanceof C0550d) {
                        next4.mo3233a(this.f2275y);
                    }
                }
            }
            this.f2260j.mo3266a(this.f2275y, 0);
            this.f2261k.mo3266a(this.f2275y, 100);
            for (String str2 : this.f2275y.keySet()) {
                if (hashMap.containsKey(str2)) {
                    i4 = hashMap.get(str2).intValue();
                } else {
                    i4 = 0;
                }
                this.f2275y.get(str2).mo3351a(i4);
            }
        }
        if (!hashSet.isEmpty()) {
            if (this.f2274x == null) {
                this.f2274x = new HashMap<>();
            }
            Iterator<String> it5 = hashSet.iterator();
            while (it5.hasNext()) {
                String next5 = it5.next();
                if (!this.f2274x.containsKey(next5)) {
                    if (next5.startsWith("CUSTOM,")) {
                        SparseArray sparseArray2 = new SparseArray();
                        String str3 = next5.split(",")[1];
                        Iterator<AbstractC0549c> it6 = this.f2273w.iterator();
                        while (it6.hasNext()) {
                            AbstractC0549c next6 = it6.next();
                            if (!(next6.f2100f == null || (constraintAttribute = next6.f2100f.get(str3)) == null)) {
                                sparseArray2.append(next6.f2096b, constraintAttribute);
                            }
                        }
                        sVar = AbstractC0605s.m2762a(next5, sparseArray2);
                    } else {
                        sVar = AbstractC0605s.m2761a(next5, j);
                    }
                    if (sVar != null) {
                        sVar.mo3364a(next5);
                        this.f2274x.put(next5, sVar);
                    }
                }
            }
            ArrayList<AbstractC0549c> arrayList4 = this.f2273w;
            if (arrayList4 != null) {
                Iterator<AbstractC0549c> it7 = arrayList4.iterator();
                while (it7.hasNext()) {
                    AbstractC0549c next7 = it7.next();
                    if (next7 instanceof C0576k) {
                        ((C0576k) next7).mo3258c(this.f2274x);
                    }
                }
            }
            for (String str4 : this.f2274x.keySet()) {
                if (hashMap.containsKey(str4)) {
                    i3 = hashMap.get(str4).intValue();
                } else {
                    i3 = 0;
                }
                this.f2274x.get(str4).mo3361a(i3);
            }
        }
        int i5 = 2;
        int size = this.f2271u.size() + 2;
        C0583p[] pVarArr = new C0583p[size];
        pVarArr[0] = this.f2258h;
        pVarArr[size - 1] = this.f2259i;
        if (this.f2271u.size() > 0 && this.f2257g == -1) {
            this.f2257g = 0;
        }
        Iterator<C0583p> it8 = this.f2271u.iterator();
        int i6 = 1;
        while (it8.hasNext()) {
            pVarArr[i6] = it8.next();
            i6++;
        }
        HashSet hashSet4 = new HashSet();
        for (String str5 : this.f2259i.f2289m.keySet()) {
            if (this.f2258h.f2289m.containsKey(str5)) {
                if (!hashSet2.contains("CUSTOM," + str5)) {
                    hashSet4.add(str5);
                }
            }
        }
        String[] strArr = (String[]) hashSet4.toArray(new String[0]);
        this.f2267q = strArr;
        this.f2268r = new int[strArr.length];
        int i7 = 0;
        while (true) {
            String[] strArr2 = this.f2267q;
            if (i7 >= strArr2.length) {
                break;
            }
            String str6 = strArr2[i7];
            this.f2268r[i7] = 0;
            int i8 = 0;
            while (true) {
                if (i8 >= size) {
                    break;
                } else if (pVarArr[i8].f2289m.containsKey(str6)) {
                    int[] iArr = this.f2268r;
                    iArr[i7] = iArr[i7] + pVarArr[i8].f2289m.get(str6).mo3798b();
                    break;
                } else {
                    i8++;
                }
            }
            i7++;
        }
        if (pVarArr[0].f2288l != AbstractC0549c.f2095a) {
            z = true;
        } else {
            z = false;
        }
        int length = 18 + this.f2267q.length;
        boolean[] zArr = new boolean[length];
        for (int i9 = 1; i9 < size; i9++) {
            pVarArr[i9].mo3295a(pVarArr[i9 - 1], zArr, this.f2267q, z);
        }
        int i10 = 0;
        for (int i11 = 1; i11 < length; i11++) {
            if (zArr[i11]) {
                i10++;
            }
        }
        int[] iArr2 = new int[i10];
        this.f2264n = iArr2;
        this.f2265o = new double[iArr2.length];
        this.f2266p = new double[iArr2.length];
        int i12 = 0;
        for (int i13 = 1; i13 < length; i13++) {
            if (zArr[i13]) {
                this.f2264n[i12] = i13;
                i12++;
            }
        }
        int[] iArr3 = new int[2];
        iArr3[1] = this.f2264n.length;
        iArr3[0] = size;
        double[][] dArr = (double[][]) Array.newInstance(double.class, iArr3);
        double[] dArr2 = new double[size];
        for (int i14 = 0; i14 < size; i14++) {
            pVarArr[i14].mo3297a(dArr[i14], this.f2264n);
            dArr2[i14] = (double) pVarArr[i14].f2280d;
        }
        int i15 = 0;
        while (true) {
            int[] iArr4 = this.f2264n;
            if (i15 >= iArr4.length) {
                break;
            }
            if (iArr4[i15] < C0583p.f2277a.length) {
                String str7 = C0583p.f2277a[this.f2264n[i15]] + " [";
                for (int i16 = 0; i16 < size; i16++) {
                    str7 = str7 + dArr[i16][i15];
                }
            }
            i15++;
        }
        this.f2262l = new AbstractC0528b[(this.f2267q.length + 1)];
        int i17 = 0;
        while (true) {
            String[] strArr3 = this.f2267q;
            if (i17 >= strArr3.length) {
                break;
            }
            double[][] dArr3 = null;
            String str8 = strArr3[i17];
            double[] dArr4 = null;
            int i18 = 0;
            int i19 = 0;
            while (i18 < size) {
                if (pVarArr[i18].mo3299a(str8)) {
                    if (dArr3 == null) {
                        int[] iArr5 = new int[i5];
                        iArr5[1] = pVarArr[i18].mo3300b(str8);
                        iArr5[c] = size;
                        dArr3 = (double[][]) Array.newInstance(double.class, iArr5);
                        dArr4 = new double[size];
                    }
                    dArr4[i19] = (double) pVarArr[i18].f2280d;
                    pVarArr[i18].mo3289a(str8, dArr3[i19], 0);
                    i19++;
                }
                i18++;
                i5 = 2;
                c = 0;
            }
            i17++;
            this.f2262l[i17] = AbstractC0528b.m2417a(this.f2257g, Arrays.copyOf(dArr4, i19), (double[][]) Arrays.copyOf(dArr3, i19));
            i5 = 2;
            c = 0;
        }
        this.f2262l[0] = AbstractC0528b.m2417a(this.f2257g, dArr2, dArr);
        if (pVarArr[0].f2288l != AbstractC0549c.f2095a) {
            int[] iArr6 = new int[size];
            double[] dArr5 = new double[size];
            int[] iArr7 = new int[2];
            iArr7[1] = 2;
            iArr7[0] = size;
            double[][] dArr6 = (double[][]) Array.newInstance(double.class, iArr7);
            for (int i20 = 0; i20 < size; i20++) {
                iArr6[i20] = pVarArr[i20].f2288l;
                dArr5[i20] = (double) pVarArr[i20].f2280d;
                dArr6[i20][0] = (double) pVarArr[i20].f2282f;
                dArr6[i20][1] = (double) pVarArr[i20].f2283g;
            }
            this.f2263m = AbstractC0528b.m2418a(iArr6, dArr5, dArr6);
        }
        float f2 = Float.NaN;
        this.f2276z = new HashMap<>();
        if (this.f2273w != null) {
            Iterator<String> it9 = hashSet3.iterator();
            while (it9.hasNext()) {
                String next8 = it9.next();
                AbstractC0555g b = AbstractC0555g.m2580b(next8);
                if (b != null) {
                    if (b.mo3246a() && Float.isNaN(f2)) {
                        f2 = m2638d();
                    }
                    b.mo3245a(next8);
                    this.f2276z.put(next8, b);
                }
            }
            Iterator<AbstractC0549c> it10 = this.f2273w.iterator();
            while (it10.hasNext()) {
                AbstractC0549c next9 = it10.next();
                if (next9 instanceof C0553f) {
                    ((C0553f) next9).mo3240c(this.f2276z);
                }
            }
            for (AbstractC0555g gVar : this.f2276z.values()) {
                gVar.mo3248c(f2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3273a(float f, int i, int i2, float f2, float f3, float[] fArr) {
        AbstractC0588r rVar;
        AbstractC0588r rVar2;
        AbstractC0588r rVar3;
        AbstractC0588r rVar4;
        AbstractC0588r rVar5;
        AbstractC0555g gVar;
        AbstractC0555g gVar2;
        AbstractC0555g gVar3;
        AbstractC0555g gVar4;
        float a = m2635a(f, this.f2272v);
        HashMap<String, AbstractC0588r> hashMap = this.f2275y;
        AbstractC0555g gVar5 = null;
        if (hashMap == null) {
            rVar = null;
        } else {
            rVar = hashMap.get("translationX");
        }
        HashMap<String, AbstractC0588r> hashMap2 = this.f2275y;
        if (hashMap2 == null) {
            rVar2 = null;
        } else {
            rVar2 = hashMap2.get("translationY");
        }
        HashMap<String, AbstractC0588r> hashMap3 = this.f2275y;
        if (hashMap3 == null) {
            rVar3 = null;
        } else {
            rVar3 = hashMap3.get("rotation");
        }
        HashMap<String, AbstractC0588r> hashMap4 = this.f2275y;
        if (hashMap4 == null) {
            rVar4 = null;
        } else {
            rVar4 = hashMap4.get("scaleX");
        }
        HashMap<String, AbstractC0588r> hashMap5 = this.f2275y;
        if (hashMap5 == null) {
            rVar5 = null;
        } else {
            rVar5 = hashMap5.get("scaleY");
        }
        HashMap<String, AbstractC0555g> hashMap6 = this.f2276z;
        if (hashMap6 == null) {
            gVar = null;
        } else {
            gVar = hashMap6.get("translationX");
        }
        HashMap<String, AbstractC0555g> hashMap7 = this.f2276z;
        if (hashMap7 == null) {
            gVar2 = null;
        } else {
            gVar2 = hashMap7.get("translationY");
        }
        HashMap<String, AbstractC0555g> hashMap8 = this.f2276z;
        if (hashMap8 == null) {
            gVar3 = null;
        } else {
            gVar3 = hashMap8.get("rotation");
        }
        HashMap<String, AbstractC0555g> hashMap9 = this.f2276z;
        if (hashMap9 == null) {
            gVar4 = null;
        } else {
            gVar4 = hashMap9.get("scaleX");
        }
        HashMap<String, AbstractC0555g> hashMap10 = this.f2276z;
        if (hashMap10 != null) {
            gVar5 = hashMap10.get("scaleY");
        }
        C0536h hVar = new C0536h();
        hVar.mo3129a();
        hVar.mo3133a(rVar3, a);
        hVar.mo3134a(rVar, rVar2, a);
        hVar.mo3136b(rVar4, rVar5, a);
        hVar.mo3131a(gVar3, a);
        hVar.mo3132a(gVar, gVar2, a);
        hVar.mo3135b(gVar4, gVar5, a);
        AbstractC0528b bVar = this.f2263m;
        if (bVar != null) {
            double[] dArr = this.f2265o;
            if (dArr.length > 0) {
                double d = (double) a;
                bVar.mo3099a(d, dArr);
                this.f2263m.mo3103b(d, this.f2266p);
                this.f2258h.mo3291a(f2, f3, fArr, this.f2264n, this.f2266p, this.f2265o);
            }
            hVar.mo3130a(f2, f3, i, i2, fArr);
            return;
        }
        int i3 = 0;
        if (this.f2262l != null) {
            double a2 = (double) m2635a(a, this.f2272v);
            this.f2262l[0].mo3103b(a2, this.f2266p);
            this.f2262l[0].mo3099a(a2, this.f2265o);
            float f4 = this.f2272v[0];
            while (true) {
                double[] dArr2 = this.f2266p;
                if (i3 < dArr2.length) {
                    dArr2[i3] = dArr2[i3] * ((double) f4);
                    i3++;
                } else {
                    this.f2258h.mo3291a(f2, f3, fArr, this.f2264n, dArr2, this.f2265o);
                    hVar.mo3130a(f2, f3, i, i2, fArr);
                    return;
                }
            }
        } else {
            float f5 = this.f2259i.f2282f - this.f2258h.f2282f;
            float f6 = this.f2259i.f2283g - this.f2258h.f2283g;
            float f7 = (this.f2259i.f2285i - this.f2258h.f2285i) + f6;
            fArr[0] = (f5 * (1.0f - f2)) + (((this.f2259i.f2284h - this.f2258h.f2284h) + f5) * f2);
            fArr[1] = (f6 * (1.0f - f3)) + (f7 * f3);
            hVar.mo3129a();
            hVar.mo3133a(rVar3, a);
            hVar.mo3134a(rVar, rVar2, a);
            hVar.mo3136b(rVar4, rVar5, a);
            hVar.mo3131a(gVar3, a);
            hVar.mo3132a(gVar, gVar2, a);
            hVar.mo3135b(gVar4, gVar5, a);
            hVar.mo3130a(f2, f3, i, i2, fArr);
        }
    }
}
