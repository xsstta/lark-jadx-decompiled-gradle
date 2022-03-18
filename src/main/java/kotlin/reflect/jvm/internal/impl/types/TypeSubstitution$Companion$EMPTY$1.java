package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.Intrinsics;

public final class TypeSubstitution$Companion$EMPTY$1 extends TypeSubstitution {
    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    public Void get(KotlinType kotlinType) {
        Intrinsics.checkParameterIsNotNull(kotlinType, "key");
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    public boolean isEmpty() {
        return true;
    }

    public String toString() {
        return "Empty TypeSubstitution";
    }

    TypeSubstitution$Companion$EMPTY$1() {
    }
}
