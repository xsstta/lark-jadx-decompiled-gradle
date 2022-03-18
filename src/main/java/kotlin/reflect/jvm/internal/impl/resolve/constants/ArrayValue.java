package kotlin.reflect.jvm.internal.impl.resolve.constants;

import java.util.List;
import kotlin._Assertions;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

public final class ArrayValue extends ConstantValue<List<? extends ConstantValue<?>>> {
    private final Function1<ModuleDescriptor, KotlinType> computeType;

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    public KotlinType getType(ModuleDescriptor moduleDescriptor) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(moduleDescriptor, "module");
        KotlinType invoke = this.computeType.invoke(moduleDescriptor);
        if (KotlinBuiltIns.isArray(invoke) || KotlinBuiltIns.isPrimitiveArray(invoke)) {
            z = true;
        } else {
            z = false;
        }
        if (!_Assertions.f173221a || z) {
            return invoke;
        }
        throw new AssertionError("Type should be an array, but was " + invoke + ": " + ((List) getValue()));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor, ? extends kotlin.reflect.jvm.internal.impl.types.KotlinType> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ArrayValue(List<? extends ConstantValue<?>> list, Function1<? super ModuleDescriptor, ? extends KotlinType> function1) {
        super(list);
        Intrinsics.checkParameterIsNotNull(list, "value");
        Intrinsics.checkParameterIsNotNull(function1, "computeType");
        this.computeType = function1;
    }
}
