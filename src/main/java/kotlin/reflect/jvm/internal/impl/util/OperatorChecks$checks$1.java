package kotlin.reflect.jvm.internal.impl.util;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;

final class OperatorChecks$checks$1 extends Lambda implements Function1<FunctionDescriptor, String> {
    public static final OperatorChecks$checks$1 INSTANCE = new OperatorChecks$checks$1();

    OperatorChecks$checks$1() {
        super(1);
    }

    public final String invoke(FunctionDescriptor functionDescriptor) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(functionDescriptor, "$receiver");
        List<ValueParameterDescriptor> valueParameters = functionDescriptor.getValueParameters();
        Intrinsics.checkExpressionValueIsNotNull(valueParameters, "valueParameters");
        ValueParameterDescriptor valueParameterDescriptor = (ValueParameterDescriptor) CollectionsKt.lastOrNull((List) valueParameters);
        boolean z2 = false;
        if (valueParameterDescriptor != null) {
            if (DescriptorUtilsKt.declaresOrInheritsDefaultValue(valueParameterDescriptor) || valueParameterDescriptor.getVarargElementType() != null) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                z2 = true;
            }
        }
        OperatorChecks operatorChecks = OperatorChecks.INSTANCE;
        if (!z2) {
            return "last parameter should not have a default value or be a vararg";
        }
        return null;
    }
}
