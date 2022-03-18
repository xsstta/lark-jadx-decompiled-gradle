package com.ss.android.shapeimage.p3021a.p3022a;

import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.shapeimage.a.a.f */
public class C59979f {

    /* renamed from: e */
    private static final double[] f149520e = new double[SmActions.ACTION_ONTHECALL_EXIT];

    /* renamed from: a */
    public int f149521a;

    /* renamed from: b */
    private char f149522b;

    /* renamed from: c */
    private final CharSequence f149523c;

    /* renamed from: d */
    private final int f149524d;

    /* renamed from: c */
    public void mo204236c() {
        this.f149522b = m232772f();
    }

    /* renamed from: e */
    public float mo204238e() {
        mo204234a();
        float d = mo204237d();
        mo204235b();
        return d;
    }

    static {
        int i = 0;
        while (true) {
            double[] dArr = f149520e;
            if (i < dArr.length) {
                dArr[i] = Math.pow(10.0d, (double) i);
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: f */
    private char m232772f() {
        int i = this.f149521a;
        int i2 = this.f149524d;
        if (i < i2) {
            this.f149521a = i + 1;
        }
        int i3 = this.f149521a;
        if (i3 == i2) {
            return 0;
        }
        return this.f149523c.charAt(i3);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo204235b() {
        while (true) {
            int i = this.f149521a;
            if (i < this.f149524d) {
                char charAt = this.f149523c.charAt(i);
                if (charAt == '\t' || charAt == '\n' || charAt == ' ' || charAt == ',') {
                    mo204236c();
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public void mo204234a() {
        while (true) {
            int i = this.f149521a;
            if (i < this.f149524d && Character.isWhitespace(this.f149523c.charAt(i))) {
                mo204236c();
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0028 A[LOOP:0: B:10:0x0028->B:14:0x0034, LOOP_START] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00c1 A[LOOP:4: B:57:0x00c1->B:58:0x00c7, LOOP_START] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0025 A[RETURN] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public float mo204237d() {
        /*
        // Method dump skipped, instructions count: 506
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.shapeimage.p3021a.p3022a.C59979f.mo204237d():float");
    }

    public C59979f(CharSequence charSequence) {
        this.f149523c = charSequence;
        this.f149524d = charSequence.length();
        this.f149522b = charSequence.charAt(this.f149521a);
    }

    /* renamed from: a */
    private void m232771a(char c) {
        throw new RuntimeException("Unexpected char '" + c + "'.");
    }

    /* renamed from: a */
    private static float m232770a(int i, int i2) {
        double d;
        if (i2 < -125 || i == 0) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        if (i2 >= 128) {
            if (i > 0) {
                return Float.POSITIVE_INFINITY;
            }
            return Float.NEGATIVE_INFINITY;
        } else if (i2 == 0) {
            return (float) i;
        } else {
            if (i >= 67108864) {
                i++;
            }
            double d2 = (double) i;
            double[] dArr = f149520e;
            if (i2 > 0) {
                d = d2 * dArr[i2];
            } else {
                d = d2 / dArr[-i2];
            }
            return (float) d;
        }
    }
}
