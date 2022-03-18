package com.google.zxing.qrcode.p1003a;

/* renamed from: com.google.zxing.qrcode.a.d */
final class C23220d {
    /* renamed from: a */
    static int m84111a(C23217b bVar) {
        return m84112a(bVar, true) + m84112a(bVar, false);
    }

    /* renamed from: b */
    static int m84116b(C23217b bVar) {
        byte[][] c = bVar.mo80533c();
        int b = bVar.mo80532b();
        int a = bVar.mo80528a();
        int i = 0;
        for (int i2 = 0; i2 < a - 1; i2++) {
            byte[] bArr = c[i2];
            int i3 = 0;
            while (i3 < b - 1) {
                byte b2 = bArr[i3];
                int i4 = i3 + 1;
                if (b2 == bArr[i4]) {
                    int i5 = i2 + 1;
                    if (b2 == c[i5][i3] && b2 == c[i5][i4]) {
                        i++;
                    }
                }
                i3 = i4;
            }
        }
        return i * 3;
    }

    /* renamed from: d */
    static int m84118d(C23217b bVar) {
        byte[][] c = bVar.mo80533c();
        int b = bVar.mo80532b();
        int a = bVar.mo80528a();
        int i = 0;
        for (int i2 = 0; i2 < a; i2++) {
            byte[] bArr = c[i2];
            for (int i3 = 0; i3 < b; i3++) {
                if (bArr[i3] == 1) {
                    i++;
                }
            }
        }
        int a2 = bVar.mo80528a() * bVar.mo80532b();
        return ((Math.abs((i * 2) - a2) * 10) / a2) * 10;
    }

    /* renamed from: c */
    static int m84117c(C23217b bVar) {
        byte[][] c = bVar.mo80533c();
        int b = bVar.mo80532b();
        int a = bVar.mo80528a();
        int i = 0;
        for (int i2 = 0; i2 < a; i2++) {
            for (int i3 = 0; i3 < b; i3++) {
                byte[] bArr = c[i2];
                int i4 = i3 + 6;
                if (i4 < b && bArr[i3] == 1 && bArr[i3 + 1] == 0 && bArr[i3 + 2] == 1 && bArr[i3 + 3] == 1 && bArr[i3 + 4] == 1 && bArr[i3 + 5] == 0 && bArr[i4] == 1 && (m84114a(bArr, i3 - 4, i3) || m84114a(bArr, i3 + 7, i3 + 11))) {
                    i++;
                }
                int i5 = i2 + 6;
                if (i5 < a && c[i2][i3] == 1 && c[i2 + 1][i3] == 0 && c[i2 + 2][i3] == 1 && c[i2 + 3][i3] == 1 && c[i2 + 4][i3] == 1 && c[i2 + 5][i3] == 0 && c[i5][i3] == 1 && (m84115a(c, i3, i2 - 4, i2) || m84115a(c, i3, i2 + 7, i2 + 11))) {
                    i++;
                }
            }
        }
        return i * 40;
    }

    /* renamed from: a */
    private static int m84112a(C23217b bVar, boolean z) {
        int i;
        int i2;
        byte b;
        if (z) {
            i = bVar.mo80528a();
        } else {
            i = bVar.mo80532b();
        }
        if (z) {
            i2 = bVar.mo80532b();
        } else {
            i2 = bVar.mo80528a();
        }
        byte[][] c = bVar.mo80533c();
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            byte b2 = -1;
            int i5 = 0;
            for (int i6 = 0; i6 < i2; i6++) {
                if (z) {
                    b = c[i4][i6];
                } else {
                    b = c[i6][i4];
                }
                if (b == b2) {
                    i5++;
                } else {
                    if (i5 >= 5) {
                        i3 += (i5 - 5) + 3;
                    }
                    b2 = b;
                    i5 = 1;
                }
            }
            if (i5 >= 5) {
                i3 += (i5 - 5) + 3;
            }
        }
        return i3;
    }

    /* renamed from: a */
    private static boolean m84114a(byte[] bArr, int i, int i2) {
        int min = Math.min(i2, bArr.length);
        for (int max = Math.max(i, 0); max < min; max++) {
            if (bArr[max] == 1) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    static boolean m84113a(int i, int i2, int i3) {
        int i4;
        int i5;
        switch (i) {
            case 0:
                i3 += i2;
                i4 = i3 & 1;
                break;
            case 1:
                i4 = i3 & 1;
                break;
            case 2:
                i4 = i2 % 3;
                break;
            case 3:
                i4 = (i3 + i2) % 3;
                break;
            case 4:
                i3 /= 2;
                i2 /= 3;
                i3 += i2;
                i4 = i3 & 1;
                break;
            case 5:
                int i6 = i3 * i2;
                i4 = (i6 & 1) + (i6 % 3);
                break;
            case 6:
                int i7 = i3 * i2;
                i5 = (i7 & 1) + (i7 % 3);
                i4 = i5 & 1;
                break;
            case 7:
                i5 = ((i3 * i2) % 3) + ((i3 + i2) & 1);
                i4 = i5 & 1;
                break;
            default:
                throw new IllegalArgumentException("Invalid mask pattern: " + i);
        }
        if (i4 == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m84115a(byte[][] bArr, int i, int i2, int i3) {
        int min = Math.min(i3, bArr.length);
        for (int max = Math.max(i2, 0); max < min; max++) {
            if (bArr[max][i] == 1) {
                return false;
            }
        }
        return true;
    }
}
