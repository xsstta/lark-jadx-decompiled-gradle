package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.internal.Intrinsics;

public final class ModalityKt {
    public static final boolean isFinalClass(ClassDescriptor classDescriptor) {
        Intrinsics.checkParameterIsNotNull(classDescriptor, "$this$isFinalClass");
        if (classDescriptor.getModality() != Modality.FINAL || classDescriptor.getKind() == ClassKind.ENUM_CLASS) {
            return false;
        }
        return true;
    }
}
