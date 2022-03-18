package androidx.constraintlayout.solver;

import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import java.util.Arrays;

public class SolverVariable {

    /* renamed from: p */
    private static int f2387p = 1;

    /* renamed from: q */
    private static int f2388q = 1;

    /* renamed from: r */
    private static int f2389r = 1;

    /* renamed from: s */
    private static int f2390s = 1;

    /* renamed from: t */
    private static int f2391t = 1;

    /* renamed from: a */
    public boolean f2392a;

    /* renamed from: b */
    public int f2393b = -1;

    /* renamed from: c */
    int f2394c = -1;

    /* renamed from: d */
    public int f2395d;

    /* renamed from: e */
    public float f2396e;

    /* renamed from: f */
    public boolean f2397f;

    /* renamed from: g */
    float[] f2398g = new float[9];

    /* renamed from: h */
    float[] f2399h = new float[9];

    /* renamed from: i */
    Type f2400i;

    /* renamed from: j */
    C0624b[] f2401j = new C0624b[16];

    /* renamed from: k */
    int f2402k;

    /* renamed from: l */
    public int f2403l;

    /* renamed from: m */
    boolean f2404m;

    /* renamed from: n */
    int f2405n = -1;

    /* renamed from: o */
    float f2406o;

    /* renamed from: u */
    private String f2407u;

    public enum Type {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    /* renamed from: a */
    static void m2809a() {
        f2388q++;
    }

    /* renamed from: b */
    public void mo3391b() {
        this.f2407u = null;
        this.f2400i = Type.UNKNOWN;
        this.f2395d = 0;
        this.f2393b = -1;
        this.f2394c = -1;
        this.f2396e = BitmapDescriptorFactory.HUE_RED;
        this.f2397f = false;
        this.f2404m = false;
        this.f2405n = -1;
        this.f2406o = BitmapDescriptorFactory.HUE_RED;
        int i = this.f2402k;
        for (int i2 = 0; i2 < i; i2++) {
            this.f2401j[i2] = null;
        }
        this.f2402k = 0;
        this.f2403l = 0;
        this.f2392a = false;
        Arrays.fill(this.f2399h, (float) BitmapDescriptorFactory.HUE_RED);
    }

    public String toString() {
        if (this.f2407u != null) {
            return "" + this.f2407u;
        }
        return "" + this.f2393b;
    }

    /* renamed from: a */
    public final void mo3388a(C0624b bVar) {
        int i = 0;
        while (true) {
            int i2 = this.f2402k;
            if (i >= i2) {
                C0624b[] bVarArr = this.f2401j;
                if (i2 >= bVarArr.length) {
                    this.f2401j = (C0624b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
                }
                C0624b[] bVarArr2 = this.f2401j;
                int i3 = this.f2402k;
                bVarArr2[i3] = bVar;
                this.f2402k = i3 + 1;
                return;
            } else if (this.f2401j[i] != bVar) {
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: b */
    public final void mo3392b(C0624b bVar) {
        int i = this.f2402k;
        int i2 = 0;
        while (i2 < i) {
            if (this.f2401j[i2] == bVar) {
                while (i2 < i - 1) {
                    C0624b[] bVarArr = this.f2401j;
                    int i3 = i2 + 1;
                    bVarArr[i2] = bVarArr[i3];
                    i2 = i3;
                }
                this.f2402k--;
                return;
            }
            i2++;
        }
    }

    /* renamed from: a */
    public void mo3387a(Type type, String str) {
        this.f2400i = type;
    }

    public SolverVariable(Type type, String str) {
        this.f2400i = type;
    }

    /* renamed from: a */
    public final void mo3390a(C0627d dVar, C0624b bVar) {
        int i = this.f2402k;
        for (int i2 = 0; i2 < i; i2++) {
            this.f2401j[i2].mo3418a(dVar, bVar, false);
        }
        this.f2402k = 0;
    }

    /* renamed from: a */
    public void mo3389a(C0627d dVar, float f) {
        this.f2396e = f;
        this.f2397f = true;
        this.f2404m = false;
        this.f2405n = -1;
        this.f2406o = BitmapDescriptorFactory.HUE_RED;
        int i = this.f2402k;
        this.f2394c = -1;
        for (int i2 = 0; i2 < i; i2++) {
            this.f2401j[i2].mo3417a(dVar, this, false);
        }
        this.f2402k = 0;
    }
}
