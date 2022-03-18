package bytekn.foundation.encryption;

import com.google.firebase.messaging.Constants;
import com.huawei.hms.feature.dynamic.DynamicModule;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntProgression;
import kotlin.ranges.RangesKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u000b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\r\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0016\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u000bJH\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0006H\u0002J\u0016\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u000bR\u000e\u0010\b\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lbytekn/foundation/encryption/AES;", "", "key", "", "([B)V", "keyWords", "", "([I)V", "invKeySchedule", "keySchedule", "keySize", "", "getKeyWords", "()[I", "ksRows", "numRounds", "decryptBlock", "", "M", "offset", "doCryptBlock", "SUB_MIX_0", "SUB_MIX_1", "SUB_MIX_2", "SUB_MIX_3", "SBOX", "encryptBlock", "Companion", "kn_common_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: bytekn.foundation.encryption.a */
public final class AES {

    /* renamed from: a */
    public static final Companion f5771a = new Companion(null);

    /* renamed from: h */
    private static final int[] f5772h = new int[DynamicModule.f58006b];

    /* renamed from: i */
    private static final int[] f5773i = new int[DynamicModule.f58006b];

    /* renamed from: j */
    private static final int[] f5774j = new int[DynamicModule.f58006b];

    /* renamed from: k */
    private static final int[] f5775k = new int[DynamicModule.f58006b];

    /* renamed from: l */
    private static final int[] f5776l = new int[DynamicModule.f58006b];

    /* renamed from: m */
    private static final int[] f5777m = new int[DynamicModule.f58006b];

    /* renamed from: n */
    private static final int[] f5778n = new int[DynamicModule.f58006b];

    /* renamed from: o */
    private static final int[] f5779o = new int[DynamicModule.f58006b];

    /* renamed from: p */
    private static final int[] f5780p = new int[DynamicModule.f58006b];

    /* renamed from: q */
    private static final int[] f5781q = new int[DynamicModule.f58006b];

    /* renamed from: r */
    private static final int[] f5782r = {0, 1, 2, 4, 8, 16, 32, 64, SmActions.ACTION_ONTHECALL_EXIT, 27, 54};

    /* renamed from: b */
    private final int f5783b;

    /* renamed from: c */
    private final int f5784c;

    /* renamed from: d */
    private final int f5785d;

    /* renamed from: e */
    private final int[] f5786e;

    /* renamed from: f */
    private final int[] f5787f;

    /* renamed from: g */
    private final int[] f5788g;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u000b\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u0016J&\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0016J&\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0016J\u001e\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0016J&\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0016J&\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0016J \u0010\u001d\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u0016J&\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0016J&\u0010\u001f\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0016J\u001e\u0010 \u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0016J&\u0010!\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0016J&\u0010\"\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0016J\u0012\u0010#\u001a\u00020\u00122\b\u0010$\u001a\u0004\u0018\u00010\u0012H\u0002J\f\u0010%\u001a\u00020\u0012*\u00020\u0006H\u0002J\f\u0010&\u001a\u00020\u0006*\u00020\u0012H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lbytekn/foundation/encryption/AES$Companion;", "", "()V", "BLOCK_SIZE", "", "INV_SBOX", "", "INV_SUB_MIX_0", "INV_SUB_MIX_1", "INV_SUB_MIX_2", "INV_SUB_MIX_3", "RCON", "SBOX", "SUB_MIX_0", "SUB_MIX_1", "SUB_MIX_2", "SUB_MIX_3", "decryptAes128Cbc", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "key", "padding", "Lbytekn/foundation/encryption/Padding;", "decryptAesCbc", "iv", "decryptAesCfb", "decryptAesEcb", "decryptAesOfb", "decryptAesPcbc", "encryptAes128Cbc", "encryptAesCbc", "encryptAesCfb", "encryptAesEcb", "encryptAesOfb", "encryptAesPcbc", "getIV", "srcIV", "toByteArray", "toIntArray", "kn_common_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: bytekn.foundation.encryption.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        private final byte[] m7536b(byte[] bArr) {
            int i = 16;
            byte[] bArr2 = new byte[16];
            if (bArr != null) {
                if (bArr.length < 16) {
                    i = bArr.length;
                }
                C1702b.m7545a(bArr, 0, bArr2, 0, i);
            }
            return bArr2;
        }

        /* renamed from: a */
        private final byte[] m7535a(int[] iArr) {
            byte[] bArr = new byte[(iArr.length * 4)];
            int i = 0;
            for (int i2 : iArr) {
                int i3 = i + 1;
                bArr[i] = (byte) ((i2 >> 24) & 255);
                int i4 = i3 + 1;
                bArr[i3] = (byte) ((i2 >> 16) & 255);
                int i5 = i4 + 1;
                bArr[i4] = (byte) ((i2 >> 8) & 255);
                i = i5 + 1;
                bArr[i5] = (byte) ((i2 >> 0) & 255);
            }
            return bArr;
        }

        /* renamed from: a */
        public final int[] mo8682a(byte[] bArr) {
            int length = bArr.length / 4;
            int[] iArr = new int[length];
            int i = 0;
            int i2 = 0;
            while (i < length) {
                int i3 = i2 + 1;
                int i4 = i3 + 1;
                int i5 = i4 + 1;
                int i6 = (bArr[i4] & 255) << 8;
                int i7 = (bArr[i3] & 255) << 16;
                iArr[i] = ((bArr[i2] & 255) << 24) | i7 | i6 | ((bArr[i5] & 255) << 0);
                i++;
                i2 = i5 + 1;
            }
            return iArr;
        }

        /* renamed from: a */
        public final byte[] mo8681a(byte[] bArr, byte[] bArr2, byte[] bArr3, Padding padding) {
            Intrinsics.checkParameterIsNotNull(bArr, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            Intrinsics.checkParameterIsNotNull(bArr2, "key");
            Intrinsics.checkParameterIsNotNull(bArr3, "iv");
            Intrinsics.checkParameterIsNotNull(padding, "padding");
            AES aVar = new AES(bArr2);
            Companion aVar2 = this;
            int[] a = aVar2.mo8682a(bArr);
            int length = a.length;
            int[] a2 = aVar2.mo8682a(aVar2.m7536b(bArr3));
            int i = a2[0];
            int i2 = a2[1];
            int i3 = a2[2];
            int i4 = a2[3];
            IntProgression step = RangesKt.step(RangesKt.until(0, length), 4);
            int a3 = step.mo239399a();
            int b = step.mo239400b();
            int c = step.mo239401c();
            if (c < 0 ? a3 >= b : a3 <= b) {
                while (true) {
                    int i5 = a3 + 0;
                    int i6 = a[i5];
                    int i7 = a3 + 1;
                    int i8 = a[i7];
                    int i9 = a3 + 2;
                    int i10 = a[i9];
                    int i11 = a3 + 3;
                    int i12 = a[i11];
                    aVar.mo8680a(a, a3);
                    a[i5] = a[i5] ^ i;
                    a[i7] = a[i7] ^ i2;
                    a[i9] = a[i9] ^ i3;
                    a[i11] = i4 ^ a[i11];
                    if (a3 == b) {
                        break;
                    }
                    a3 += c;
                    i = i6;
                    i2 = i8;
                    i3 = i10;
                    i4 = i12;
                }
            }
            return Padding.Companion.mo8679a(aVar2.m7535a(a), padding);
        }
    }

    static {
        int i;
        int[] iArr = new int[DynamicModule.f58006b];
        for (int i2 = 0; i2 < 256; i2++) {
            if (i2 >= 128) {
                i = (i2 << 1) ^ 283;
            } else {
                i = i2 << 1;
            }
            iArr[i2] = i;
        }
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < 256; i5++) {
            int i6 = ((((i3 << 1) ^ i3) ^ (i3 << 2)) ^ (i3 << 3)) ^ (i3 << 4);
            int i7 = ((i6 & 255) ^ (i6 >>> 8)) ^ 99;
            f5772h[i4] = i7;
            f5773i[i7] = i4;
            int i8 = iArr[i4];
            int i9 = iArr[i8];
            int i10 = iArr[i9];
            int i11 = (iArr[i7] * 257) ^ (i7 * 16843008);
            f5774j[i4] = (i11 << 24) | (i11 >>> 8);
            f5775k[i4] = (i11 << 16) | (i11 >>> 16);
            f5776l[i4] = (i11 << 8) | (i11 >>> 24);
            f5777m[i4] = i11 << 0;
            int i12 = (((i9 * 65537) ^ (16843009 * i10)) ^ (i8 * 257)) ^ (16843008 * i4);
            f5778n[i7] = (i12 << 24) | (i12 >>> 8);
            f5779o[i7] = (i12 << 16) | (i12 >>> 16);
            f5780p[i7] = (i12 << 8) | (i12 >>> 24);
            f5781q[i7] = i12 << 0;
            if (i4 == 0) {
                i3 = 1;
                i4 = 1;
            } else {
                i4 = iArr[iArr[iArr[i10 ^ i8]]] ^ i8;
                i3 ^= iArr[iArr[i3]];
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AES(byte[] bArr) {
        this(f5771a.mo8682a(bArr));
        Intrinsics.checkParameterIsNotNull(bArr, "key");
    }

    public AES(int[] iArr) {
        int i;
        int i2;
        Intrinsics.checkParameterIsNotNull(iArr, "keyWords");
        this.f5788g = iArr;
        int length = iArr.length;
        this.f5783b = length;
        int i3 = length + 6;
        this.f5784c = i3;
        int i4 = (i3 + 1) * 4;
        this.f5785d = i4;
        int[] iArr2 = new int[i4];
        for (int i5 = 0; i5 < i4; i5++) {
            int i6 = this.f5783b;
            if (i5 < i6) {
                i2 = this.f5788g[i5];
            } else {
                int i7 = iArr2[i5 - 1];
                if (i5 % i6 == 0) {
                    int i8 = (i7 >>> 24) | (i7 << 8);
                    int[] iArr3 = f5772h;
                    i7 = (iArr3[i8 & 255] | (((iArr3[(i8 >>> 24) & 255] << 24) | (iArr3[(i8 >>> 16) & 255] << 16)) | (iArr3[(i8 >>> 8) & 255] << 8))) ^ (f5782r[(i5 / i6) | 0] << 24);
                } else if (i6 > 6 && i5 % i6 == 4) {
                    int[] iArr4 = f5772h;
                    i7 = iArr4[i7 & 255] | (iArr4[(i7 >>> 24) & 255] << 24) | (iArr4[(i7 >>> 16) & 255] << 16) | (iArr4[(i7 >>> 8) & 255] << 8);
                }
                i2 = iArr2[i5 - i6] ^ i7;
            }
            iArr2[i5] = i2;
        }
        this.f5786e = iArr2;
        int i9 = this.f5785d;
        int[] iArr5 = new int[i9];
        for (int i10 = 0; i10 < i9; i10++) {
            int i11 = this.f5785d - i10;
            if (i10 % 4 != 0) {
                i = this.f5786e[i11];
            } else {
                i = this.f5786e[i11 - 4];
            }
            if (i10 >= 4 && i11 > 4) {
                int[] iArr6 = f5778n;
                int[] iArr7 = f5772h;
                i = f5781q[iArr7[i & 255]] ^ ((iArr6[iArr7[(i >>> 24) & 255]] ^ f5779o[iArr7[(i >>> 16) & 255]]) ^ f5780p[iArr7[(i >>> 8) & 255]]);
            }
            iArr5[i10] = i;
        }
        this.f5787f = iArr5;
    }

    /* renamed from: a */
    public final void mo8680a(int[] iArr, int i) {
        Intrinsics.checkParameterIsNotNull(iArr, "M");
        int i2 = i + 1;
        int i3 = iArr[i2];
        int i4 = i + 3;
        iArr[i2] = iArr[i4];
        iArr[i4] = i3;
        m7533a(iArr, i, this.f5787f, f5778n, f5779o, f5780p, f5781q, f5773i);
        int i5 = iArr[i2];
        iArr[i2] = iArr[i4];
        iArr[i4] = i5;
    }

    /* renamed from: a */
    private final void m7533a(int[] iArr, int i, int[] iArr2, int[] iArr3, int[] iArr4, int[] iArr5, int[] iArr6, int[] iArr7) {
        int i2 = i + 0;
        int i3 = iArr[i2] ^ iArr2[0];
        int i4 = i + 1;
        int i5 = 1;
        int i6 = iArr[i4] ^ iArr2[1];
        int i7 = i + 2;
        int i8 = iArr[i7] ^ iArr2[2];
        int i9 = i + 3;
        int i10 = iArr2[3] ^ iArr[i9];
        int i11 = this.f5784c;
        int i12 = 4;
        while (i5 < i11) {
            int i13 = i12 + 1;
            int i14 = iArr2[i12] ^ (((iArr3[(i3 >>> 24) & 255] ^ iArr4[(i6 >>> 16) & 255]) ^ iArr5[(i8 >>> 8) & 255]) ^ iArr6[(i10 >>> 0) & 255]);
            int i15 = i13 + 1;
            int i16 = (((iArr3[(i6 >>> 24) & 255] ^ iArr4[(i8 >>> 16) & 255]) ^ iArr5[(i10 >>> 8) & 255]) ^ iArr6[(i3 >>> 0) & 255]) ^ iArr2[i13];
            int i17 = ((iArr4[(i10 >>> 16) & 255] ^ iArr3[(i8 >>> 24) & 255]) ^ iArr5[(i3 >>> 8) & 255]) ^ iArr6[(i6 >>> 0) & 255];
            int i18 = i15 + 1;
            i10 = (((iArr4[(i3 >>> 16) & 255] ^ iArr3[(i10 >>> 24) & 255]) ^ iArr5[(i6 >>> 8) & 255]) ^ iArr6[(i8 >>> 0) & 255]) ^ iArr2[i18];
            i5++;
            i8 = i17 ^ iArr2[i15];
            i3 = i14;
            i12 = i18 + 1;
            i6 = i16;
        }
        int i19 = i12 + 1;
        int i20 = ((((iArr7[(i3 >>> 24) & 255] << 24) | (iArr7[(i6 >>> 16) & 255] << 16)) | (iArr7[(i8 >>> 8) & 255] << 8)) | iArr7[(i10 >>> 0) & 255]) ^ iArr2[i12];
        int i21 = i19 + 1;
        int i22 = iArr2[i19] ^ ((((iArr7[(i6 >>> 24) & 255] << 24) | (iArr7[(i8 >>> 16) & 255] << 16)) | (iArr7[(i10 >>> 8) & 255] << 8)) | iArr7[(i3 >>> 0) & 255]);
        int i23 = (iArr7[(i8 >>> 24) & 255] << 24) | (iArr7[(i10 >>> 16) & 255] << 16) | (iArr7[(i3 >>> 8) & 255] << 8) | iArr7[(i6 >>> 0) & 255];
        int i24 = iArr7[(i3 >>> 16) & 255] << 16;
        iArr[i2] = i20;
        iArr[i4] = i22;
        iArr[i7] = i23 ^ iArr2[i21];
        iArr[i9] = (((i24 | (iArr7[(i10 >>> 24) & 255] << 24)) | (iArr7[(i6 >>> 8) & 255] << 8)) | iArr7[(i8 >>> 0) & 255]) ^ iArr2[i21 + 1];
    }
}
