package bytekn.foundation.encryption;

import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0001\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\t"}, d2 = {"Lbytekn/foundation/encryption/Padding;", "", "(Ljava/lang/String;I)V", "NoPadding", "PKCS7Padding", "ANSIX923Padding", "ISO10126Padding", "ZeroPadding", "Companion", "kn_common_release"}, mo238835k = 1, mv = {1, 1, 16})
public enum Padding {
    NoPadding,
    PKCS7Padding,
    ANSIX923Padding,
    ISO10126Padding,
    ZeroPadding;
    
    public static final Companion Companion = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\bJ\u0016\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\b¨\u0006\n"}, d2 = {"Lbytekn/foundation/encryption/Padding$Companion;", "", "()V", "padding", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "blockSize", "", "Lbytekn/foundation/encryption/Padding;", "removePadding", "kn_common_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: bytekn.foundation.encryption.Padding$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final byte[] mo8679a(byte[] bArr, Padding padding) {
            Intrinsics.checkParameterIsNotNull(bArr, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            Intrinsics.checkParameterIsNotNull(padding, "padding");
            int i = C1706i.f5811b[padding.ordinal()];
            if (i == 1) {
                return bArr;
            }
            if (i == 2 || i == 3 || i == 4) {
                int length = bArr.length - (bArr[bArr.length - 1] & 255);
                byte[] bArr2 = new byte[length];
                C1702b.m7545a(bArr, 0, bArr2, 0, length);
                return bArr2;
            } else if (i == 5) {
                int length2 = bArr.length - 1;
                int i2 = 0;
                while (length2 >= 0 && bArr[length2] == 0) {
                    i2++;
                    length2--;
                }
                int length3 = bArr.length - i2;
                byte[] bArr3 = new byte[length3];
                C1702b.m7545a(bArr, 0, bArr3, 0, length3);
                return bArr3;
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
    }
}
