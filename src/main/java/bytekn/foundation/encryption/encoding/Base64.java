package bytekn.foundation.encryption.encoding;

import com.huawei.hms.feature.dynamic.DynamicModule;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nJ\u000e\u0010\u0007\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0006J\u000e\u0010\r\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0006J\u000e\u0010\u000e\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nJ\u0011\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\nH\u0002J\u0011\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0006H\u0002J\u0014\u0010\u0011\u001a\u00020\b*\u00020\n2\u0006\u0010\u0012\u001a\u00020\bH\u0002J\u0014\u0010\u0013\u001a\u00020\b*\u00020\n2\u0006\u0010\u0012\u001a\u00020\bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XD¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lbytekn/foundation/encryption/encoding/Base64;", "", "()V", "DECODE", "", "TABLE", "", "decode", "", "src", "", "dst", "str", "decodeIgnoringSpaces", "encode", "invoke", "v", "readU24BE", "index", "readU8", "kn_common_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: bytekn.foundation.encryption.a.a */
public final class Base64 {

    /* renamed from: a */
    public static final Base64 f5789a = new Base64();

    /* renamed from: b */
    private static final String f5790b = f5790b;

    /* renamed from: c */
    private static final int[] f5791c;

    private Base64() {
    }

    static {
        int[] iArr = new int[DynamicModule.f58006b];
        for (int i = 0; i <= 255; i++) {
            iArr[i] = -1;
        }
        int length = f5790b.length();
        for (int i2 = 0; i2 < length; i2++) {
            iArr[f5790b.charAt(i2)] = i2;
        }
        f5791c = iArr;
    }

    /* renamed from: a */
    public final byte[] mo8684a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "str");
        int length = str.length();
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            bArr[i] = (byte) str.charAt(i);
        }
        byte[] bArr2 = new byte[length];
        byte[] copyOf = Arrays.copyOf(bArr2, mo8683a(bArr, bArr2));
        Intrinsics.checkExpressionValueIsNotNull(copyOf, "java.util.Arrays.copyOf(this, newSize)");
        return copyOf;
    }

    /* renamed from: a */
    private final int m7539a(byte[] bArr, int i) {
        return bArr[i] & 255;
    }

    /* renamed from: a */
    public final int mo8683a(byte[] bArr, byte[] bArr2) {
        Intrinsics.checkParameterIsNotNull(bArr, "src");
        Intrinsics.checkParameterIsNotNull(bArr2, "dst");
        int i = 0;
        int i2 = 0;
        while (i < bArr.length) {
            int[] iArr = f5791c;
            if (iArr[m7539a(bArr, i)] < 0) {
                i++;
            } else {
                int i3 = i + 1;
                int i4 = iArr[m7539a(bArr, i)];
                int i5 = i3 + 1;
                int i6 = iArr[m7539a(bArr, i3)];
                int i7 = i5 + 1;
                int i8 = iArr[m7539a(bArr, i5)];
                int i9 = i7 + 1;
                int i10 = iArr[m7539a(bArr, i7)];
                int i11 = i2 + 1;
                bArr2[i2] = (byte) ((i4 << 2) | (i6 >> 4));
                if (i8 < 64) {
                    i2 = i11 + 1;
                    bArr2[i11] = (byte) ((i6 << 4) | (i8 >> 2));
                    if (i10 < 64) {
                        bArr2[i2] = (byte) (i10 | (i8 << 6));
                        i2++;
                    }
                } else {
                    i2 = i11;
                }
                i = i9;
            }
        }
        return i2;
    }
}
