package bytekn.foundation.encryption;

import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bø\u0001\u0000¢\u0006\u0002\u0010\fR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"Lbytekn/foundation/encryption/HasherFactory;", "", "create", "Lkotlin/Function0;", "Lbytekn/foundation/encryption/Hasher;", "(Lkotlin/jvm/functions/Function0;)V", "getCreate", "()Lkotlin/jvm/functions/Function0;", "digest", "Lbytekn/foundation/encryption/Hash;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "([B)[B", "kn_common_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: bytekn.foundation.encryption.e */
public class HasherFactory {

    /* renamed from: a */
    private final Function0<Hasher> f5803a;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function0<? extends bytekn.foundation.encryption.d> */
    /* JADX WARN: Multi-variable type inference failed */
    public HasherFactory(Function0<? extends Hasher> function0) {
        Intrinsics.checkParameterIsNotNull(function0, "create");
        this.f5803a = function0;
    }

    /* renamed from: a */
    public final byte[] mo8698a(byte[] bArr) {
        Intrinsics.checkParameterIsNotNull(bArr, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        Hasher invoke = this.f5803a.invoke();
        invoke.mo8690a(bArr, 0, bArr.length);
        return invoke.mo8695b();
    }
}
