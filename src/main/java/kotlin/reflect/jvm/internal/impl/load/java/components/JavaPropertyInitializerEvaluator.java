package kotlin.reflect.jvm.internal.impl.load.java.components;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;

public interface JavaPropertyInitializerEvaluator {
    ConstantValue<?> getInitializerConstant(JavaField javaField, PropertyDescriptor propertyDescriptor);

    public static final class DoNothing implements JavaPropertyInitializerEvaluator {
        public static final DoNothing INSTANCE = new DoNothing();

        @Override // kotlin.reflect.jvm.internal.impl.load.java.components.JavaPropertyInitializerEvaluator
        public ConstantValue<?> getInitializerConstant(JavaField javaField, PropertyDescriptor propertyDescriptor) {
            Intrinsics.checkParameterIsNotNull(javaField, "field");
            Intrinsics.checkParameterIsNotNull(propertyDescriptor, "descriptor");
            return null;
        }

        private DoNothing() {
        }
    }
}
