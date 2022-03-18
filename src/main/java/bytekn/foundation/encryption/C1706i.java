package bytekn.foundation.encryption;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: bytekn.foundation.encryption.i */
public final /* synthetic */ class C1706i {

    /* renamed from: a */
    public static final /* synthetic */ int[] f5810a;

    /* renamed from: b */
    public static final /* synthetic */ int[] f5811b;

    static {
        int[] iArr = new int[Padding.values().length];
        f5810a = iArr;
        iArr[Padding.NoPadding.ordinal()] = 1;
        iArr[Padding.PKCS7Padding.ordinal()] = 2;
        iArr[Padding.ANSIX923Padding.ordinal()] = 3;
        iArr[Padding.ISO10126Padding.ordinal()] = 4;
        iArr[Padding.ZeroPadding.ordinal()] = 5;
        int[] iArr2 = new int[Padding.values().length];
        f5811b = iArr2;
        iArr2[Padding.NoPadding.ordinal()] = 1;
        iArr2[Padding.PKCS7Padding.ordinal()] = 2;
        iArr2[Padding.ANSIX923Padding.ordinal()] = 3;
        iArr2[Padding.ISO10126Padding.ordinal()] = 4;
        iArr2[Padding.ZeroPadding.ordinal()] = 5;
    }
}
