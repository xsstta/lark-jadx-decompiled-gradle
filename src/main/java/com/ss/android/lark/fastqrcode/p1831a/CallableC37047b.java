package com.ss.android.lark.fastqrcode.p1831a;

import android.graphics.Rect;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.qrcode.AbstractC23215a;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.lark.fastqrcode.C37040a;
import com.ss.android.lark.fastqrcode.C37051b;
import com.ss.android.lark.fastqrcode.C37055c;
import com.ss.android.lark.fastqrcode.EnigmaQRCode;
import com.ss.android.lark.fastqrcode.p1832b.C37054a;
import com.ss.android.lark.fastqrcode.p1833c.C37056a;
import com.ss.android.lark.fastqrcode.widget.C37068a;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.lark.fastqrcode.a.b */
public class CallableC37047b implements Callable<C37054a> {

    /* renamed from: e */
    private static long f95176e;

    /* renamed from: a */
    private byte[] f95177a;

    /* renamed from: b */
    private int f95178b;

    /* renamed from: c */
    private int f95179c;

    /* renamed from: d */
    private Rect f95180d;

    /* renamed from: f */
    private AbstractC23215a f95181f;

    /* renamed from: g */
    private boolean f95182g = C37040a.m146121a(C37040a.m146119a());

    /* renamed from: a */
    public C37054a call() throws Exception {
        return m146139c();
    }

    /* renamed from: b */
    public static void m146138b() {
        long j = f95176e;
        if (j != 0) {
            EnigmaQRCode._releaseHandle(j);
            f95176e = 0;
        }
        C37051b.m146150a("DetectQRCodeWorker", "[reset]");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.fastqrcode.a.b$1 */
    public static /* synthetic */ class C370481 {

        /* renamed from: a */
        static final /* synthetic */ int[] f95183a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.google.zxing.BarcodeFormat[] r0 = com.google.zxing.BarcodeFormat.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.lark.fastqrcode.p1831a.CallableC37047b.C370481.f95183a = r0
                com.google.zxing.BarcodeFormat r1 = com.google.zxing.BarcodeFormat.QR_CODE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.lark.fastqrcode.p1831a.CallableC37047b.C370481.f95183a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.zxing.BarcodeFormat r1 = com.google.zxing.BarcodeFormat.EAN_8     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.ss.android.lark.fastqrcode.p1831a.CallableC37047b.C370481.f95183a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.zxing.BarcodeFormat r1 = com.google.zxing.BarcodeFormat.EAN_13     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.ss.android.lark.fastqrcode.p1831a.CallableC37047b.C370481.f95183a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.zxing.BarcodeFormat r1 = com.google.zxing.BarcodeFormat.CODE_39     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = com.ss.android.lark.fastqrcode.p1831a.CallableC37047b.C370481.f95183a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.zxing.BarcodeFormat r1 = com.google.zxing.BarcodeFormat.CODE_128     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.fastqrcode.p1831a.CallableC37047b.C370481.<clinit>():void");
        }
    }

    /* renamed from: d */
    private byte[] m146140d() {
        byte[] bArr;
        byte[] bArr2 = this.f95177a;
        int i = this.f95178b;
        int i2 = this.f95179c;
        int a = C37068a.m146232a(C37040a.m146119a());
        if (!C37055c.f95201d) {
            bArr = new byte[bArr2.length];
            m146135a(a, bArr2, bArr, i, i2);
        } else {
            bArr = m146137a(bArr2, i, i2, a);
        }
        if (this.f95182g) {
            this.f95178b = i2;
            this.f95179c = i;
        }
        return bArr;
    }

    /* renamed from: c */
    private C37054a m146139c() {
        int i;
        int i2;
        int i3;
        int i4;
        long currentTimeMillis = System.currentTimeMillis();
        byte[] d = m146140d();
        byte[] bArr = new byte[4096];
        int[] iArr = new int[1];
        float[] fArr = new float[1];
        if (C37055c.f95198a) {
            i2 = this.f95178b;
            i = this.f95179c;
            i4 = 0;
            i3 = 0;
        } else {
            int i5 = this.f95180d.left;
            int i6 = this.f95180d.top;
            i4 = i5;
            i3 = i6;
            i2 = this.f95180d.width();
            i = this.f95180d.height();
        }
        int i7 = this.f95178b;
        long currentTimeMillis2 = System.currentTimeMillis();
        int _decode = EnigmaQRCode._decode(f95176e, d, EnigmaQRCode.f95163e, this.f95178b, this.f95179c, i4, i3, i2, i, i7, 0, bArr, iArr, fArr);
        long currentTimeMillis3 = System.currentTimeMillis();
        if (_decode == 0) {
            C37056a.m146166d(currentTimeMillis3 - currentTimeMillis2);
            C37056a.m146164b(currentTimeMillis3 - currentTimeMillis);
            String trim = new String(bArr).trim();
            C37054a aVar = new C37054a(trim, m146134a(iArr[0]));
            C37051b.m146150a("DetectQRCodeWorker", "decodeUseEnigma success text: " + trim);
            return aVar;
        }
        C37051b.m146152c("DetectQRCodeWorker", "decodeUseEnigma failed ret = " + _decode);
        if (fArr[0] != BitmapDescriptorFactory.HUE_RED) {
            C37051b.m146151b("DetectQRCodeWorker", "zoom = " + fArr[0]);
            this.f95181f.mo80524a(fArr[0]);
        }
        return null;
    }

    /* renamed from: a */
    private static BarcodeFormat m146134a(int i) {
        if (i == 1) {
            return BarcodeFormat.QR_CODE;
        }
        if (i == 16) {
            return BarcodeFormat.EAN_8;
        }
        if (i == 32) {
            return BarcodeFormat.EAN_13;
        }
        if (i == 64) {
            return BarcodeFormat.CODE_39;
        }
        if (i != 128) {
            return null;
        }
        return BarcodeFormat.CODE_128;
    }

    /* renamed from: a */
    private void m146136a(BarcodeFormat[] barcodeFormatArr) {
        f95176e = EnigmaQRCode._createHandler();
        int length = barcodeFormatArr.length;
        long j = 0;
        int i = 0;
        while (true) {
            long j2 = 1;
            if (i < length) {
                int i2 = C370481.f95183a[barcodeFormatArr[i].ordinal()];
                if (i2 != 1) {
                    if (i2 == 2) {
                        j2 = 16;
                    } else if (i2 == 3) {
                        j2 = 32;
                    } else if (i2 == 4) {
                        j2 = 64;
                    } else if (i2 != 5) {
                        i++;
                    } else {
                        j2 = 128;
                    }
                }
                j |= j2;
                i++;
            } else {
                EnigmaQRCode._setDecodeHint(f95176e, 2, j);
                EnigmaQRCode._setDecodeHint(f95176e, 6, 1);
                return;
            }
        }
    }

    /* renamed from: a */
    private static byte[] m146137a(byte[] bArr, int i, int i2, int i3) {
        boolean z;
        boolean z2;
        boolean z3;
        int i4;
        int i5;
        int i6;
        int i7;
        if (i3 == 0) {
            return bArr;
        }
        if (i3 % 90 != 0 || i3 < 0 || i3 > 270) {
            C37051b.m146152c("DetectQRCodeWorker", "0 <= rotation < 360, rotation % 90 == 0");
            return bArr;
        }
        byte[] bArr2 = new byte[bArr.length];
        int i8 = i * i2;
        if (i3 % 180 != 0) {
            z = true;
        } else {
            z = false;
        }
        if (i3 % 270 != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (i3 >= 180) {
            z3 = true;
        } else {
            z3 = false;
        }
        for (int i9 = 0; i9 < i2; i9++) {
            for (int i10 = 0; i10 < i; i10++) {
                int i11 = (i9 * i) + i10;
                int i12 = ((i9 >> 1) * i) + i8 + (i10 & -2);
                int i13 = i12 + 1;
                if (z) {
                    i4 = i2;
                } else {
                    i4 = i;
                }
                if (z) {
                    i5 = i;
                } else {
                    i5 = i2;
                }
                if (z) {
                    i6 = i9;
                } else {
                    i6 = i10;
                }
                if (z) {
                    i7 = i10;
                } else {
                    i7 = i9;
                }
                if (z2) {
                    i6 = (i4 - i6) - 1;
                }
                if (z3) {
                    i7 = (i5 - i7) - 1;
                }
                int i14 = i8 + ((i7 >> 1) * i4) + (i6 & -2);
                bArr2[(i7 * i4) + i6] = (byte) (bArr[i11] & 255);
                bArr2[i14] = (byte) (bArr[i12] & 255);
                bArr2[i14 + 1] = (byte) (bArr[i13] & 255);
            }
        }
        return bArr2;
    }

    /* renamed from: a */
    private static void m146135a(int i, byte[] bArr, byte[] bArr2, int i2, int i3) {
        if (i == 90) {
            for (int i4 = 0; i4 < i3; i4++) {
                for (int i5 = 0; i5 < i2; i5++) {
                    bArr2[(((i5 * i3) + i3) - i4) - 1] = bArr[(i4 * i2) + i5];
                }
            }
        } else if (i == 270) {
            for (int i6 = 0; i6 < i3; i6++) {
                for (int i7 = 0; i7 < i2; i7++) {
                    bArr2[(((i3 * i2) - (i3 * i7)) - i3) + i6] = bArr[(i6 * i2) + i7];
                }
            }
        }
    }

    public CallableC37047b(byte[] bArr, int i, int i2, Rect rect, AbstractC23215a aVar, BarcodeFormat[] barcodeFormatArr) {
        this.f95177a = bArr;
        this.f95178b = i;
        this.f95179c = i2;
        this.f95180d = rect;
        this.f95181f = aVar;
        if (f95176e == 0) {
            C37051b.m146150a("DetectQRCodeWorker", "use EnigmaQRCode");
            m146136a(barcodeFormatArr);
        }
    }
}
