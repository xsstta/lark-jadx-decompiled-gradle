package bytekn.foundation.encryption;

import com.huawei.hms.site.ActivityC23764o;
import kotlin.Metadata;
import kotlin.collections.C69043h;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\n\u001a0\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0000\u001a0\u0010\u0000\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0000\u001a\u0015\u0010\t\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\b\u001a\u0014\u0010\u000b\u001a\u00020\u0004*\u00020\u00012\u0006\u0010\f\u001a\u00020\u0004H\u0000\u001a\u0014\u0010\r\u001a\u00020\u0004*\u00020\u00012\u0006\u0010\f\u001a\u00020\u0004H\u0000\u001a\u0014\u0010\u000e\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004H\u0000\u001a\u0014\u0010\u0010\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004H\u0000¨\u0006\u0012"}, d2 = {"arraycopy", "", "src", "srcPos", "", "dst", "dstPos", "count", "", "ext8", "offset", "readS32_be", ActivityC23764o.f58839a, "readU8", "rotateLeft", "bits", "rotateRight", "amount", "kn_common_release"}, mo238835k = 2, mv = {1, 1, 16})
/* renamed from: bytekn.foundation.encryption.b */
public final class C1702b {
    /* renamed from: a */
    public static final int m7544a(int i, int i2) {
        return (i >>> (32 - i2)) | (i << i2);
    }

    /* renamed from: a */
    public static final byte[] m7545a(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        Intrinsics.checkParameterIsNotNull(bArr, "src");
        Intrinsics.checkParameterIsNotNull(bArr2, "dst");
        return C69043h.m265722a(bArr, bArr2, i2, i, i3 + i);
    }
}
