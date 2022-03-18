package bytekn.foundation.encryption;

import bytekn.foundation.encryption.encoding.Hex;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b@\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0012\u0012\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\r\u0010\tR\u0011\u0010\u000e\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\tR\u0011\u0010\u0010\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\tø\u0001\u0000\u0002\u0004\n\u0002\b\u0019¨\u0006\u0019"}, d2 = {"Lbytekn/foundation/encryption/Hash;", "", "bytes", "", "constructor-impl", "([B)[B", "base64", "", "getBase64-impl", "([B)Ljava/lang/String;", "getBytes", "()[B", "hex", "getHex-impl", "hexLower", "getHexLower-impl", "hexUpper", "getHexUpper-impl", "equals", "", "other", "hashCode", "", "toString", "Companion", "kn_common_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: bytekn.foundation.encryption.c */
public final class Hash {

    /* renamed from: a */
    public static final Companion f5796a = new Companion(null);

    /* renamed from: b */
    private final byte[] f5797b;

    /* renamed from: a */
    public static boolean m7547a(byte[] bArr, Object obj) {
        return (obj instanceof Hash) && Intrinsics.areEqual(bArr, ((Hash) obj).mo8686a());
    }

    /* renamed from: b */
    public static byte[] m7548b(byte[] bArr) {
        Intrinsics.checkParameterIsNotNull(bArr, "bytes");
        return bArr;
    }

    /* renamed from: c */
    public static String m7549c(byte[] bArr) {
        return "Hash(bytes=" + Arrays.toString(bArr) + ")";
    }

    /* renamed from: d */
    public static int m7550d(byte[] bArr) {
        if (bArr != null) {
            return Arrays.hashCode(bArr);
        }
        return 0;
    }

    /* renamed from: a */
    public final /* synthetic */ byte[] mo8686a() {
        return this.f5797b;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0002\u0010\u0007J\u0016\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0002\u0010\u0007\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, d2 = {"Lbytekn/foundation/encryption/Hash$Companion;", "", "()V", "fromBase64", "Lbytekn/foundation/encryption/Hash;", "base64", "", "(Ljava/lang/String;)[B", "fromHex", "hex", "kn_common_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: bytekn.foundation.encryption.c$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public int hashCode() {
        return m7550d(this.f5797b);
    }

    public String toString() {
        return m7549c(this.f5797b);
    }

    /* renamed from: a */
    public static final String m7546a(byte[] bArr) {
        return Hex.f5792a.mo8685a(bArr);
    }

    public boolean equals(Object obj) {
        return m7547a(this.f5797b, obj);
    }
}
