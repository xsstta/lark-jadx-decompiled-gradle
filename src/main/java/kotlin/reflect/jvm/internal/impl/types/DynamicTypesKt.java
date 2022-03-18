package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.Intrinsics;

public final class DynamicTypesKt {
    public static final boolean isDynamic(KotlinType kotlinType) {
        Intrinsics.checkParameterIsNotNull(kotlinType, "$this$isDynamic");
        return kotlinType.unwrap() instanceof DynamicType;
    }
}
