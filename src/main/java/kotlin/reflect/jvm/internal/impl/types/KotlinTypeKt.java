package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.Intrinsics;

public final class KotlinTypeKt {
    public static final boolean isError(KotlinType kotlinType) {
        Intrinsics.checkParameterIsNotNull(kotlinType, "$this$isError");
        UnwrappedType unwrap = kotlinType.unwrap();
        if ((unwrap instanceof ErrorType) || ((unwrap instanceof FlexibleType) && (((FlexibleType) unwrap).getDelegate() instanceof ErrorType))) {
            return true;
        }
        return false;
    }
}
