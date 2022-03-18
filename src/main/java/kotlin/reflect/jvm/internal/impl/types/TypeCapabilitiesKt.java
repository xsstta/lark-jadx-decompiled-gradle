package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.Intrinsics;

public final class TypeCapabilitiesKt {
    public static final CustomTypeVariable getCustomTypeVariable(KotlinType kotlinType) {
        Intrinsics.checkParameterIsNotNull(kotlinType, "$this$getCustomTypeVariable");
        UnwrappedType unwrap = kotlinType.unwrap();
        if (!(unwrap instanceof CustomTypeVariable)) {
            unwrap = null;
        }
        CustomTypeVariable customTypeVariable = (CustomTypeVariable) unwrap;
        if (customTypeVariable == null || !customTypeVariable.isTypeVariable()) {
            return null;
        }
        return customTypeVariable;
    }

    public static final KotlinType getSubtypeRepresentative(KotlinType kotlinType) {
        KotlinType subTypeRepresentative;
        Intrinsics.checkParameterIsNotNull(kotlinType, "$this$getSubtypeRepresentative");
        UnwrappedType unwrap = kotlinType.unwrap();
        if (!(unwrap instanceof SubtypingRepresentatives)) {
            unwrap = null;
        }
        SubtypingRepresentatives subtypingRepresentatives = (SubtypingRepresentatives) unwrap;
        return (subtypingRepresentatives == null || (subTypeRepresentative = subtypingRepresentatives.getSubTypeRepresentative()) == null) ? kotlinType : subTypeRepresentative;
    }

    public static final KotlinType getSupertypeRepresentative(KotlinType kotlinType) {
        KotlinType superTypeRepresentative;
        Intrinsics.checkParameterIsNotNull(kotlinType, "$this$getSupertypeRepresentative");
        UnwrappedType unwrap = kotlinType.unwrap();
        if (!(unwrap instanceof SubtypingRepresentatives)) {
            unwrap = null;
        }
        SubtypingRepresentatives subtypingRepresentatives = (SubtypingRepresentatives) unwrap;
        return (subtypingRepresentatives == null || (superTypeRepresentative = subtypingRepresentatives.getSuperTypeRepresentative()) == null) ? kotlinType : superTypeRepresentative;
    }

    public static final boolean isCustomTypeVariable(KotlinType kotlinType) {
        Intrinsics.checkParameterIsNotNull(kotlinType, "$this$isCustomTypeVariable");
        UnwrappedType unwrap = kotlinType.unwrap();
        if (!(unwrap instanceof CustomTypeVariable)) {
            unwrap = null;
        }
        CustomTypeVariable customTypeVariable = (CustomTypeVariable) unwrap;
        if (customTypeVariable != null) {
            return customTypeVariable.isTypeVariable();
        }
        return false;
    }

    public static final boolean sameTypeConstructors(KotlinType kotlinType, KotlinType kotlinType2) {
        boolean z;
        boolean z2;
        Intrinsics.checkParameterIsNotNull(kotlinType, "first");
        Intrinsics.checkParameterIsNotNull(kotlinType2, "second");
        UnwrappedType unwrap = kotlinType.unwrap();
        SubtypingRepresentatives subtypingRepresentatives = null;
        if (!(unwrap instanceof SubtypingRepresentatives)) {
            unwrap = null;
        }
        SubtypingRepresentatives subtypingRepresentatives2 = (SubtypingRepresentatives) unwrap;
        if (subtypingRepresentatives2 != null) {
            z = subtypingRepresentatives2.sameTypeConstructor(kotlinType2);
        } else {
            z = false;
        }
        if (!z) {
            UnwrappedType unwrap2 = kotlinType2.unwrap();
            if (unwrap2 instanceof SubtypingRepresentatives) {
                subtypingRepresentatives = unwrap2;
            }
            SubtypingRepresentatives subtypingRepresentatives3 = subtypingRepresentatives;
            if (subtypingRepresentatives3 != null) {
                z2 = subtypingRepresentatives3.sameTypeConstructor(kotlinType);
            } else {
                z2 = false;
            }
            if (z2) {
                return true;
            }
            return false;
        }
        return true;
    }
}
