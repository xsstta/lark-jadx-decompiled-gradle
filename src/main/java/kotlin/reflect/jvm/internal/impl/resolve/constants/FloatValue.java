package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;

public final class FloatValue extends ConstantValue<Float> {
    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    public String toString() {
        return ((Number) getValue()).floatValue() + ".toFloat()";
    }

    public FloatValue(float f) {
        super(Float.valueOf(f));
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    public SimpleType getType(ModuleDescriptor moduleDescriptor) {
        Intrinsics.checkParameterIsNotNull(moduleDescriptor, "module");
        SimpleType floatType = moduleDescriptor.getBuiltIns().getFloatType();
        Intrinsics.checkExpressionValueIsNotNull(floatType, "module.builtIns.floatType");
        return floatType;
    }
}
