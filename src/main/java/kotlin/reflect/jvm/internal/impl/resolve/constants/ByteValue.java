package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;

public final class ByteValue extends IntegerValueConstant<Byte> {
    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    public String toString() {
        return ((int) ((Number) getValue()).byteValue()) + ".toByte()";
    }

    public ByteValue(byte b) {
        super(Byte.valueOf(b));
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    public SimpleType getType(ModuleDescriptor moduleDescriptor) {
        Intrinsics.checkParameterIsNotNull(moduleDescriptor, "module");
        SimpleType byteType = moduleDescriptor.getBuiltIns().getByteType();
        Intrinsics.checkExpressionValueIsNotNull(byteType, "module.builtIns.byteType");
        return byteType;
    }
}
