package kotlin.reflect.jvm.internal.impl.descriptors.deserialization;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;

public interface PlatformDependentDeclarationFilter {
    boolean isFunctionAvailable(ClassDescriptor classDescriptor, SimpleFunctionDescriptor simpleFunctionDescriptor);

    public static final class All implements PlatformDependentDeclarationFilter {
        public static final All INSTANCE = new All();

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter
        public boolean isFunctionAvailable(ClassDescriptor classDescriptor, SimpleFunctionDescriptor simpleFunctionDescriptor) {
            Intrinsics.checkParameterIsNotNull(classDescriptor, "classDescriptor");
            Intrinsics.checkParameterIsNotNull(simpleFunctionDescriptor, "functionDescriptor");
            return true;
        }

        private All() {
        }
    }

    public static final class NoPlatformDependent implements PlatformDependentDeclarationFilter {
        public static final NoPlatformDependent INSTANCE = new NoPlatformDependent();

        private NoPlatformDependent() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter
        public boolean isFunctionAvailable(ClassDescriptor classDescriptor, SimpleFunctionDescriptor simpleFunctionDescriptor) {
            Intrinsics.checkParameterIsNotNull(classDescriptor, "classDescriptor");
            Intrinsics.checkParameterIsNotNull(simpleFunctionDescriptor, "functionDescriptor");
            return !simpleFunctionDescriptor.getAnnotations().hasAnnotation(PlatformDependentDeclarationFilterKt.getPLATFORM_DEPENDENT_ANNOTATION_FQ_NAME());
        }
    }
}
