package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;

public final class LongValue extends IntegerValueConstant<Long> {
    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    public String toString() {
        return ((Number) getValue()).longValue() + ".toLong()";
    }

    public LongValue(long j) {
        super(Long.valueOf(j));
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    public SimpleType getType(ModuleDescriptor moduleDescriptor) {
        Intrinsics.checkParameterIsNotNull(moduleDescriptor, "module");
        SimpleType longType = moduleDescriptor.getBuiltIns().getLongType();
        Intrinsics.checkExpressionValueIsNotNull(longType, "module.builtIns.longType");
        return longType;
    }
}
