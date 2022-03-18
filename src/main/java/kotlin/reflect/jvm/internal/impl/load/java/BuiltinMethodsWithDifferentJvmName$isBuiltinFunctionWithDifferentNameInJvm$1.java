package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.Map;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureMappingKt;

final class BuiltinMethodsWithDifferentJvmName$isBuiltinFunctionWithDifferentNameInJvm$1 extends Lambda implements Function1<CallableMemberDescriptor, Boolean> {
    final /* synthetic */ SimpleFunctionDescriptor $functionDescriptor;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    BuiltinMethodsWithDifferentJvmName$isBuiltinFunctionWithDifferentNameInJvm$1(SimpleFunctionDescriptor simpleFunctionDescriptor) {
        super(1);
        this.$functionDescriptor = simpleFunctionDescriptor;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public /* synthetic */ Boolean invoke(CallableMemberDescriptor callableMemberDescriptor) {
        return Boolean.valueOf(invoke(callableMemberDescriptor));
    }

    public final boolean invoke(CallableMemberDescriptor callableMemberDescriptor) {
        Intrinsics.checkParameterIsNotNull(callableMemberDescriptor, "it");
        Map access$getSIGNATURE_TO_JVM_REPRESENTATION_NAME$p = BuiltinMethodsWithDifferentJvmName.access$getSIGNATURE_TO_JVM_REPRESENTATION_NAME$p(BuiltinMethodsWithDifferentJvmName.INSTANCE);
        String computeJvmSignature = MethodSignatureMappingKt.computeJvmSignature(this.$functionDescriptor);
        if (access$getSIGNATURE_TO_JVM_REPRESENTATION_NAME$p != null) {
            return access$getSIGNATURE_TO_JVM_REPRESENTATION_NAME$p.containsKey(computeJvmSignature);
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.Map<K, *>");
    }
}
