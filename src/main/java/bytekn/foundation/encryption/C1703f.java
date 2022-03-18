package bytekn.foundation.encryption;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000¢\u0006\u0002\u0010\u0005\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006"}, d2 = {"hash", "Lbytekn/foundation/encryption/Hash;", "", "algo", "Lbytekn/foundation/encryption/HasherFactory;", "([BLbytekn/foundation/encryption/HasherFactory;)[B", "kn_common_release"}, mo238835k = 2, mv = {1, 1, 16})
/* renamed from: bytekn.foundation.encryption.f */
public final class C1703f {
    /* renamed from: a */
    public static final byte[] m7561a(byte[] bArr, HasherFactory eVar) {
        Intrinsics.checkParameterIsNotNull(bArr, "$this$hash");
        Intrinsics.checkParameterIsNotNull(eVar, "algo");
        return eVar.mo8698a(bArr);
    }
}
