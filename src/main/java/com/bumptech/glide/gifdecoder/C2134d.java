package com.bumptech.glide.gifdecoder;

import android.graphics.Bitmap;
import android.util.Log;
import com.bumptech.glide.gifdecoder.GifDecoder;
import com.huawei.hms.feature.dynamic.DynamicModule;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Iterator;

/* renamed from: com.bumptech.glide.gifdecoder.d */
public class C2134d implements GifDecoder {

    /* renamed from: a */
    private static final String f7406a = "d";

    /* renamed from: b */
    private int[] f7407b;

    /* renamed from: c */
    private final int[] f7408c;

    /* renamed from: d */
    private final GifDecoder.AbstractC2130a f7409d;

    /* renamed from: e */
    private ByteBuffer f7410e;

    /* renamed from: f */
    private byte[] f7411f;

    /* renamed from: g */
    private short[] f7412g;

    /* renamed from: h */
    private byte[] f7413h;

    /* renamed from: i */
    private byte[] f7414i;

    /* renamed from: j */
    private byte[] f7415j;

    /* renamed from: k */
    private int[] f7416k;

    /* renamed from: l */
    private int f7417l;

    /* renamed from: m */
    private C2132b f7418m;

    /* renamed from: n */
    private Bitmap f7419n;

    /* renamed from: o */
    private boolean f7420o;

    /* renamed from: p */
    private int f7421p;

    /* renamed from: q */
    private int f7422q;

    /* renamed from: r */
    private int f7423r;

    /* renamed from: s */
    private int f7424s;

    /* renamed from: t */
    private Boolean f7425t;

    /* renamed from: u */
    private Bitmap.Config f7426u;

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    /* renamed from: f */
    public void mo10452f() {
        this.f7417l = -1;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    /* renamed from: a */
    public ByteBuffer mo10446a() {
        return this.f7410e;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    /* renamed from: e */
    public int mo10451e() {
        return this.f7417l;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    /* renamed from: d */
    public int mo10450d() {
        return this.f7418m.f7391c;
    }

    /* renamed from: j */
    private int m9295j() {
        return this.f7410e.get() & 255;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    /* renamed from: b */
    public void mo10448b() {
        this.f7417l = (this.f7417l + 1) % this.f7418m.f7391c;
    }

    /* renamed from: k */
    private int m9296k() {
        int j = m9295j();
        if (j <= 0) {
            return j;
        }
        ByteBuffer byteBuffer = this.f7410e;
        byteBuffer.get(this.f7411f, 0, Math.min(j, byteBuffer.remaining()));
        return j;
    }

    /* renamed from: l */
    private Bitmap m9297l() {
        Bitmap.Config config;
        Boolean bool = this.f7425t;
        if (bool == null || bool.booleanValue()) {
            config = Bitmap.Config.ARGB_8888;
        } else {
            config = this.f7426u;
        }
        Bitmap a = this.f7409d.mo10456a(this.f7424s, this.f7423r, config);
        a.setHasAlpha(true);
        return a;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    /* renamed from: c */
    public int mo10449c() {
        int i;
        if (this.f7418m.f7391c <= 0 || (i = this.f7417l) < 0) {
            return 0;
        }
        return mo10469a(i);
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    /* renamed from: g */
    public int mo10453g() {
        return this.f7410e.limit() + this.f7415j.length + (this.f7416k.length * 4);
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    /* renamed from: i */
    public void mo10455i() {
        this.f7418m = null;
        byte[] bArr = this.f7415j;
        if (bArr != null) {
            this.f7409d.mo10458a(bArr);
        }
        int[] iArr = this.f7416k;
        if (iArr != null) {
            this.f7409d.mo10459a(iArr);
        }
        Bitmap bitmap = this.f7419n;
        if (bitmap != null) {
            this.f7409d.mo10457a(bitmap);
        }
        this.f7419n = null;
        this.f7410e = null;
        this.f7425t = null;
        byte[] bArr2 = this.f7411f;
        if (bArr2 != null) {
            this.f7409d.mo10458a(bArr2);
        }
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    /* renamed from: h */
    public synchronized Bitmap mo10454h() {
        C2131a aVar;
        int[] iArr;
        if (this.f7418m.f7391c <= 0 || this.f7417l < 0) {
            String str = f7406a;
            if (Log.isLoggable(str, 3)) {
                Log.d(str, "Unable to decode frame, frameCount=" + this.f7418m.f7391c + ", framePointer=" + this.f7417l);
            }
            this.f7421p = 1;
        }
        int i = this.f7421p;
        if (i != 1) {
            if (i != 2) {
                this.f7421p = 0;
                if (this.f7411f == null) {
                    this.f7411f = this.f7409d.mo10460a(255);
                }
                C2131a aVar2 = this.f7418m.f7393e.get(this.f7417l);
                int i2 = this.f7417l - 1;
                if (i2 >= 0) {
                    aVar = this.f7418m.f7393e.get(i2);
                } else {
                    aVar = null;
                }
                if (aVar2.f7388k != null) {
                    iArr = aVar2.f7388k;
                } else {
                    iArr = this.f7418m.f7389a;
                }
                this.f7407b = iArr;
                if (iArr == null) {
                    String str2 = f7406a;
                    if (Log.isLoggable(str2, 3)) {
                        Log.d(str2, "No valid color table found for frame #" + this.f7417l);
                    }
                    this.f7421p = 1;
                    return null;
                }
                if (aVar2.f7383f) {
                    int[] iArr2 = this.f7407b;
                    System.arraycopy(iArr2, 0, this.f7408c, 0, iArr2.length);
                    int[] iArr3 = this.f7408c;
                    this.f7407b = iArr3;
                    iArr3[aVar2.f7385h] = 0;
                    if (aVar2.f7384g == 2 && this.f7417l == 0) {
                        this.f7425t = true;
                    }
                }
                return m9291a(aVar2, aVar);
            }
        }
        String str3 = f7406a;
        if (Log.isLoggable(str3, 3)) {
            Log.d(str3, "Unable to decode frame, status=" + this.f7421p);
        }
        return null;
    }

    public C2134d(GifDecoder.AbstractC2130a aVar) {
        this.f7408c = new int[DynamicModule.f58006b];
        this.f7426u = Bitmap.Config.ARGB_8888;
        this.f7409d = aVar;
        this.f7418m = new C2132b();
    }

    /* renamed from: a */
    public int mo10469a(int i) {
        if (i < 0 || i >= this.f7418m.f7391c) {
            return -1;
        }
        return this.f7418m.f7393e.get(i).f7386i;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    /* renamed from: a */
    public void mo10447a(Bitmap.Config config) {
        if (config == Bitmap.Config.ARGB_8888 || config == Bitmap.Config.RGB_565) {
            this.f7426u = config;
            return;
        }
        throw new IllegalArgumentException("Unsupported format: " + config + ", must be one of " + Bitmap.Config.ARGB_8888 + " or " + Bitmap.Config.RGB_565);
    }

    /* renamed from: b */
    private void m9293b(C2131a aVar) {
        boolean z;
        boolean z2;
        int i;
        int i2;
        boolean z3;
        int i3;
        int i4;
        int i5;
        int[] iArr = this.f7416k;
        int i6 = aVar.f7381d / this.f7422q;
        int i7 = aVar.f7379b / this.f7422q;
        int i8 = aVar.f7380c / this.f7422q;
        int i9 = aVar.f7378a;
        int i10 = this.f7422q;
        int i11 = i9 / i10;
        if (this.f7417l == 0) {
            z = true;
        } else {
            z = false;
        }
        int i12 = this.f7424s;
        int i13 = this.f7423r;
        byte[] bArr = this.f7415j;
        int[] iArr2 = this.f7407b;
        Boolean bool = this.f7425t;
        int i14 = 8;
        int i15 = 0;
        int i16 = 0;
        int i17 = 1;
        while (i15 < i6) {
            Boolean bool2 = bool;
            if (aVar.f7382e) {
                if (i16 >= i6) {
                    i = i6;
                    int i18 = i17 + 1;
                    if (i18 == 2) {
                        i17 = i18;
                        i16 = 4;
                    } else if (i18 == 3) {
                        i17 = i18;
                        i16 = 2;
                        i14 = 4;
                    } else if (i18 != 4) {
                        i17 = i18;
                    } else {
                        i17 = i18;
                        i16 = 1;
                        i14 = 2;
                    }
                } else {
                    i = i6;
                }
                i2 = i16 + i14;
            } else {
                i = i6;
                i2 = i16;
                i16 = i15;
            }
            int i19 = i16 + i7;
            if (i10 == 1) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (i19 < i13) {
                int i20 = i19 * i12;
                int i21 = i20 + i11;
                int i22 = i21 + i8;
                int i23 = i20 + i12;
                if (i23 < i22) {
                    i22 = i23;
                }
                i3 = i2;
                int i24 = i15 * i10 * aVar.f7380c;
                if (z3) {
                    int i25 = i21;
                    while (i25 < i22) {
                        int i26 = iArr2[bArr[i24] & 255];
                        if (i26 != 0) {
                            iArr[i25] = i26;
                        } else if (z && bool2 == null) {
                            bool2 = true;
                        }
                        i24 += i10;
                        i25++;
                        i7 = i7;
                    }
                } else {
                    i5 = i7;
                    int i27 = ((i22 - i21) * i10) + i24;
                    int i28 = i21;
                    while (true) {
                        i4 = i8;
                        if (i28 >= i22) {
                            break;
                        }
                        int a = m9290a(i24, i27, aVar.f7380c);
                        if (a != 0) {
                            iArr[i28] = a;
                        } else if (z && bool2 == null) {
                            bool2 = true;
                        }
                        i24 += i10;
                        i28++;
                        i8 = i4;
                    }
                    bool = bool2;
                    i15++;
                    i7 = i5;
                    i8 = i4;
                    i6 = i;
                    i16 = i3;
                }
            } else {
                i3 = i2;
            }
            i5 = i7;
            i4 = i8;
            bool = bool2;
            i15++;
            i7 = i5;
            i8 = i4;
            i6 = i;
            i16 = i3;
        }
        if (this.f7425t == null) {
            if (bool == null) {
                z2 = false;
            } else {
                z2 = bool.booleanValue();
            }
            this.f7425t = Boolean.valueOf(z2);
        }
    }

    /* renamed from: a */
    private void m9292a(C2131a aVar) {
        boolean z;
        boolean z2;
        C2131a aVar2 = aVar;
        int[] iArr = this.f7416k;
        int i = aVar2.f7381d;
        int i2 = aVar2.f7379b;
        int i3 = aVar2.f7380c;
        int i4 = aVar2.f7378a;
        if (this.f7417l == 0) {
            z = true;
        } else {
            z = false;
        }
        int i5 = this.f7424s;
        byte[] bArr = this.f7415j;
        int[] iArr2 = this.f7407b;
        int i6 = 0;
        byte b = -1;
        while (i6 < i) {
            int i7 = (i6 + i2) * i5;
            int i8 = i7 + i4;
            int i9 = i8 + i3;
            int i10 = i7 + i5;
            if (i10 < i9) {
                i9 = i10;
            }
            int i11 = aVar2.f7380c * i6;
            int i12 = i8;
            while (i12 < i9) {
                byte b2 = bArr[i11];
                int i13 = b2 & 255;
                if (i13 != b) {
                    int i14 = iArr2[i13];
                    if (i14 != 0) {
                        iArr[i12] = i14;
                    } else {
                        b = b2;
                    }
                }
                i11++;
                i12++;
                i = i;
            }
            i6++;
            aVar2 = aVar;
        }
        Boolean bool = this.f7425t;
        if ((bool == null || !bool.booleanValue()) && (this.f7425t != null || !z || b == -1)) {
            z2 = false;
        } else {
            z2 = true;
        }
        this.f7425t = Boolean.valueOf(z2);
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:72:0x00fb */
    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: short[] */
    /* JADX DEBUG: Multi-variable search result rejected for r7v13, resolved type: short */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: c */
    private void m9294c(C2131a aVar) {
        int i;
        short s;
        C2134d dVar = this;
        if (aVar != null) {
            dVar.f7410e.position(aVar.f7387j);
        }
        if (aVar == null) {
            i = dVar.f7418m.f7394f * dVar.f7418m.f7395g;
        } else {
            i = aVar.f7381d * aVar.f7380c;
        }
        byte[] bArr = dVar.f7415j;
        if (bArr == null || bArr.length < i) {
            dVar.f7415j = dVar.f7409d.mo10460a(i);
        }
        byte[] bArr2 = dVar.f7415j;
        if (dVar.f7412g == null) {
            dVar.f7412g = new short[4096];
        }
        short[] sArr = dVar.f7412g;
        if (dVar.f7413h == null) {
            dVar.f7413h = new byte[4096];
        }
        byte[] bArr3 = dVar.f7413h;
        if (dVar.f7414i == null) {
            dVar.f7414i = new byte[4097];
        }
        byte[] bArr4 = dVar.f7414i;
        int j = m9295j();
        int i2 = 1 << j;
        int i3 = i2 + 1;
        int i4 = i2 + 2;
        int i5 = j + 1;
        int i6 = (1 << i5) - 1;
        int i7 = 0;
        for (int i8 = 0; i8 < i2; i8++) {
            sArr[i8] = 0;
            bArr3[i8] = (byte) i8;
        }
        byte[] bArr5 = dVar.f7411f;
        int i9 = i5;
        int i10 = i4;
        int i11 = i6;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = -1;
        int i18 = 0;
        int i19 = 0;
        while (true) {
            if (i7 >= i) {
                break;
            }
            if (i12 == 0) {
                i12 = m9296k();
                if (i12 <= 0) {
                    dVar.f7421p = 3;
                    break;
                }
                i13 = 0;
            }
            i15 += (bArr5[i13] & 255) << i14;
            i13++;
            i12--;
            int i20 = i14 + 8;
            int i21 = i10;
            int i22 = i9;
            int i23 = i17;
            int i24 = i18;
            while (true) {
                if (i20 < i22) {
                    i17 = i23;
                    i10 = i21;
                    i14 = i20;
                    dVar = this;
                    i18 = i24;
                    i5 = i5;
                    i9 = i22;
                    break;
                }
                int i25 = i15 & i11;
                i15 >>= i22;
                i20 -= i22;
                if (i25 == i2) {
                    i11 = i6;
                    i22 = i5;
                    i21 = i4;
                    i4 = i21;
                    i23 = -1;
                } else if (i25 == i3) {
                    i14 = i20;
                    i18 = i24;
                    i10 = i21;
                    i5 = i5;
                    i4 = i4;
                    i17 = i23;
                    i9 = i22;
                    dVar = this;
                    break;
                } else if (i23 == -1) {
                    bArr2[i16] = bArr3[i25];
                    i16++;
                    i7++;
                    i23 = i25;
                    i24 = i23;
                    i4 = i4;
                    i20 = i20;
                } else {
                    if (i25 >= i21) {
                        bArr4[i19] = (byte) i24;
                        i19++;
                        s = i23;
                    } else {
                        s = i25;
                    }
                    while (s >= i2) {
                        bArr4[i19] = bArr3[s];
                        i19++;
                        s = sArr[s];
                    }
                    i24 = bArr3[s] & 255;
                    byte b = (byte) i24;
                    bArr2[i16] = b;
                    while (true) {
                        i16++;
                        i7++;
                        if (i19 <= 0) {
                            break;
                        }
                        i19--;
                        bArr2[i16] = bArr4[i19];
                    }
                    if (i21 < 4096) {
                        sArr[i21] = (short) i23;
                        bArr3[i21] = b;
                        i21++;
                        if ((i21 & i11) == 0 && i21 < 4096) {
                            i22++;
                            i11 += i21;
                        }
                    }
                    i23 = i25;
                    i4 = i4;
                    i20 = i20;
                    bArr4 = bArr4;
                }
            }
        }
        Arrays.fill(bArr2, i16, i, (byte) 0);
    }

    /* renamed from: a */
    private Bitmap m9291a(C2131a aVar, C2131a aVar2) {
        Bitmap bitmap;
        int[] iArr = this.f7416k;
        int i = 0;
        if (aVar2 == null) {
            Bitmap bitmap2 = this.f7419n;
            if (bitmap2 != null) {
                this.f7409d.mo10457a(bitmap2);
            }
            this.f7419n = null;
            Arrays.fill(iArr, 0);
        }
        if (aVar2 != null && aVar2.f7384g == 3 && this.f7419n == null) {
            Arrays.fill(iArr, 0);
        }
        if (aVar2 != null && aVar2.f7384g > 0) {
            if (aVar2.f7384g == 2) {
                if (!aVar.f7383f) {
                    int i2 = this.f7418m.f7400l;
                    if (aVar.f7388k == null || this.f7418m.f7398j != aVar.f7385h) {
                        i = i2;
                    }
                }
                int i3 = aVar2.f7381d / this.f7422q;
                int i4 = aVar2.f7379b / this.f7422q;
                int i5 = aVar2.f7380c / this.f7422q;
                int i6 = aVar2.f7378a / this.f7422q;
                int i7 = this.f7424s;
                int i8 = (i4 * i7) + i6;
                int i9 = (i3 * i7) + i8;
                while (i8 < i9) {
                    int i10 = i8 + i5;
                    for (int i11 = i8; i11 < i10; i11++) {
                        iArr[i11] = i;
                    }
                    i8 += this.f7424s;
                }
            } else if (aVar2.f7384g == 3 && (bitmap = this.f7419n) != null) {
                int i12 = this.f7424s;
                bitmap.getPixels(iArr, 0, i12, 0, 0, i12, this.f7423r);
            }
        }
        m9294c(aVar);
        if (aVar.f7382e || this.f7422q != 1) {
            m9293b(aVar);
        } else {
            m9292a(aVar);
        }
        if (this.f7420o && (aVar.f7384g == 0 || aVar.f7384g == 1)) {
            if (this.f7419n == null) {
                this.f7419n = m9297l();
            }
            Bitmap bitmap3 = this.f7419n;
            int i13 = this.f7424s;
            bitmap3.setPixels(iArr, 0, i13, 0, 0, i13, this.f7423r);
        }
        Bitmap l = m9297l();
        int i14 = this.f7424s;
        l.setPixels(iArr, 0, i14, 0, 0, i14, this.f7423r);
        return l;
    }

    /* renamed from: a */
    private int m9290a(int i, int i2, int i3) {
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = i; i9 < this.f7422q + i; i9++) {
            byte[] bArr = this.f7415j;
            if (i9 >= bArr.length || i9 >= i2) {
                break;
            }
            int i10 = this.f7407b[bArr[i9] & 255];
            if (i10 != 0) {
                i4 += (i10 >> 24) & 255;
                i5 += (i10 >> 16) & 255;
                i6 += (i10 >> 8) & 255;
                i7 += i10 & 255;
                i8++;
            }
        }
        int i11 = i + i3;
        for (int i12 = i11; i12 < this.f7422q + i11; i12++) {
            byte[] bArr2 = this.f7415j;
            if (i12 >= bArr2.length || i12 >= i2) {
                break;
            }
            int i13 = this.f7407b[bArr2[i12] & 255];
            if (i13 != 0) {
                i4 += (i13 >> 24) & 255;
                i5 += (i13 >> 16) & 255;
                i6 += (i13 >> 8) & 255;
                i7 += i13 & 255;
                i8++;
            }
        }
        if (i8 == 0) {
            return 0;
        }
        return ((i4 / i8) << 24) | ((i5 / i8) << 16) | ((i6 / i8) << 8) | (i7 / i8);
    }

    /* renamed from: a */
    public synchronized void mo10470a(C2132b bVar, ByteBuffer byteBuffer, int i) {
        if (i > 0) {
            int highestOneBit = Integer.highestOneBit(i);
            this.f7421p = 0;
            this.f7418m = bVar;
            this.f7417l = -1;
            ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
            this.f7410e = asReadOnlyBuffer;
            asReadOnlyBuffer.position(0);
            this.f7410e.order(ByteOrder.LITTLE_ENDIAN);
            this.f7420o = false;
            Iterator<C2131a> it = bVar.f7393e.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (it.next().f7384g == 3) {
                        this.f7420o = true;
                        break;
                    }
                } else {
                    break;
                }
            }
            this.f7422q = highestOneBit;
            this.f7424s = bVar.f7394f / highestOneBit;
            this.f7423r = bVar.f7395g / highestOneBit;
            this.f7415j = this.f7409d.mo10460a(bVar.f7394f * bVar.f7395g);
            this.f7416k = this.f7409d.mo10461b(this.f7424s * this.f7423r);
        } else {
            throw new IllegalArgumentException("Sample size must be >=0, not: " + i);
        }
    }

    public C2134d(GifDecoder.AbstractC2130a aVar, C2132b bVar, ByteBuffer byteBuffer, int i) {
        this(aVar);
        mo10470a(bVar, byteBuffer, i);
    }
}
