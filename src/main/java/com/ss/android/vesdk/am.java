package com.ss.android.vesdk;

public class am {

    /* renamed from: a */
    public String[] f161455a;

    /* renamed from: b */
    public int[] f161456b;

    /* renamed from: c */
    public int[] f161457c;

    /* renamed from: d */
    public int[] f161458d;

    /* renamed from: e */
    public int[] f161459e;

    /* renamed from: f */
    public int[] f161460f;

    /* renamed from: g */
    public double[] f161461g;

    /* renamed from: h */
    public boolean[] f161462h;

    /* renamed from: i */
    public ROTATE_DEGREE[] f161463i;

    public String toString() {
        int i;
        StringBuilder sb = new StringBuilder();
        try {
            String[] strArr = this.f161455a;
            if (strArr == null) {
                i = 0;
            } else {
                i = strArr.length;
            }
            for (int i2 = 0; i2 < i; i2++) {
                int[] iArr = this.f161456b;
                if (iArr != null && iArr.length > i2) {
                    sb.append(" videoFileIndex: ");
                    sb.append(this.f161456b[i2]);
                }
                String[] strArr2 = this.f161455a;
                if (strArr2 != null && strArr2.length > i2) {
                    sb.append(" videoFilePath: ");
                    sb.append(this.f161455a[i2]);
                }
                int[] iArr2 = this.f161457c;
                if (iArr2 != null && iArr2.length > i2) {
                    sb.append(" vTrimIn: ");
                    sb.append(this.f161457c[i2]);
                }
                int[] iArr3 = this.f161458d;
                if (iArr3 != null && iArr3.length > i2) {
                    sb.append(" vTrimOut: ");
                    sb.append(this.f161458d[i2]);
                }
                int[] iArr4 = this.f161459e;
                if (iArr4 != null && iArr4.length > i2) {
                    sb.append(" aTrimIn: ");
                    sb.append(this.f161459e[i2]);
                }
                int[] iArr5 = this.f161460f;
                if (iArr5 != null && iArr5.length > i2) {
                    sb.append(" aTrimOut: ");
                    sb.append(this.f161460f[i2]);
                }
                double[] dArr = this.f161461g;
                if (dArr != null && dArr.length > i2) {
                    sb.append(" speed: ");
                    sb.append(this.f161461g[i2]);
                }
                boolean[] zArr = this.f161462h;
                if (zArr != null && zArr.length > i2) {
                    sb.append(" enable: ");
                    sb.append(this.f161462h[i2]);
                }
                ROTATE_DEGREE[] rotate_degreeArr = this.f161463i;
                if (rotate_degreeArr != null && rotate_degreeArr.length > i2) {
                    sb.append(" rotate: ");
                    sb.append(this.f161463i[i2]);
                }
            }
            return sb.toString();
        } catch (Exception unused) {
            return "Exception";
        }
    }
}
