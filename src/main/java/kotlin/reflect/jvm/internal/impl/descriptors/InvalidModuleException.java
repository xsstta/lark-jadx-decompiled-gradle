package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.internal.Intrinsics;

public final class InvalidModuleException extends IllegalStateException {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InvalidModuleException(String str) {
        super(str);
        Intrinsics.checkParameterIsNotNull(str, "message");
    }
}
