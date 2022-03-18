package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawSubstitution;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawTypeImpl;
import kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.sequences.C69294l;
import kotlin.sequences.Sequence;

public final class ErasedOverridabilityCondition implements ExternalOverridabilityCondition {

    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OverridingUtil.OverrideCompatibilityInfo.Result.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[OverridingUtil.OverrideCompatibilityInfo.Result.OVERRIDABLE.ordinal()] = 1;
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition
    public ExternalOverridabilityCondition.Contract getContract() {
        return ExternalOverridabilityCondition.Contract.SUCCESS_ONLY;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition
    public ExternalOverridabilityCondition.Result isOverridable(CallableDescriptor callableDescriptor, CallableDescriptor callableDescriptor2, ClassDescriptor classDescriptor) {
        OverridingUtil.OverrideCompatibilityInfo.Result result;
        boolean z;
        boolean z2;
        Intrinsics.checkParameterIsNotNull(callableDescriptor, "superDescriptor");
        Intrinsics.checkParameterIsNotNull(callableDescriptor2, "subDescriptor");
        if (callableDescriptor2 instanceof JavaMethodDescriptor) {
            JavaMethodDescriptor javaMethodDescriptor = (JavaMethodDescriptor) callableDescriptor2;
            List<TypeParameterDescriptor> typeParameters = javaMethodDescriptor.getTypeParameters();
            Intrinsics.checkExpressionValueIsNotNull(typeParameters, "subDescriptor.typeParameters");
            if (!(!typeParameters.isEmpty())) {
                OverridingUtil.OverrideCompatibilityInfo basicOverridabilityProblem = OverridingUtil.getBasicOverridabilityProblem(callableDescriptor, callableDescriptor2);
                KotlinType kotlinType = null;
                if (basicOverridabilityProblem != null) {
                    result = basicOverridabilityProblem.getResult();
                } else {
                    result = null;
                }
                if (result != null) {
                    return ExternalOverridabilityCondition.Result.UNKNOWN;
                }
                List<ValueParameterDescriptor> valueParameters = javaMethodDescriptor.getValueParameters();
                Intrinsics.checkExpressionValueIsNotNull(valueParameters, "subDescriptor.valueParameters");
                Sequence e = C69294l.m266140e(CollectionsKt.asSequence(valueParameters), ErasedOverridabilityCondition$isOverridable$signatureTypes$1.INSTANCE);
                KotlinType returnType = javaMethodDescriptor.getReturnType();
                if (returnType == null) {
                    Intrinsics.throwNpe();
                }
                Sequence a = C69294l.m266130a(e, returnType);
                ReceiverParameterDescriptor extensionReceiverParameter = javaMethodDescriptor.getExtensionReceiverParameter();
                if (extensionReceiverParameter != null) {
                    kotlinType = extensionReceiverParameter.getType();
                }
                Iterator a2 = C69294l.m266129a(a, (Iterable) CollectionsKt.listOfNotNull(kotlinType)).mo4717a();
                while (true) {
                    if (!a2.hasNext()) {
                        z = false;
                        break;
                    }
                    KotlinType kotlinType2 = (KotlinType) a2.next();
                    if (!(!kotlinType2.getArguments().isEmpty()) || (kotlinType2.unwrap() instanceof RawTypeImpl)) {
                        z2 = false;
                        continue;
                    } else {
                        z2 = true;
                        continue;
                    }
                    if (z2) {
                        z = true;
                        break;
                    }
                }
                if (z) {
                    return ExternalOverridabilityCondition.Result.UNKNOWN;
                }
                FunctionDescriptor functionDescriptor = (CallableDescriptor) callableDescriptor.substitute(RawSubstitution.INSTANCE.buildSubstitutor());
                if (functionDescriptor == null) {
                    return ExternalOverridabilityCondition.Result.UNKNOWN;
                }
                if (functionDescriptor instanceof SimpleFunctionDescriptor) {
                    SimpleFunctionDescriptor simpleFunctionDescriptor = (SimpleFunctionDescriptor) functionDescriptor;
                    List<TypeParameterDescriptor> typeParameters2 = simpleFunctionDescriptor.getTypeParameters();
                    Intrinsics.checkExpressionValueIsNotNull(typeParameters2, "erasedSuper.typeParameters");
                    if (!typeParameters2.isEmpty()) {
                        FunctionDescriptor build = simpleFunctionDescriptor.newCopyBuilder().setTypeParameters(CollectionsKt.emptyList()).build();
                        if (build == null) {
                            Intrinsics.throwNpe();
                        }
                        functionDescriptor = build;
                    }
                }
                OverridingUtil.OverrideCompatibilityInfo isOverridableByWithoutExternalConditions = OverridingUtil.DEFAULT.isOverridableByWithoutExternalConditions(functionDescriptor, callableDescriptor2, false);
                Intrinsics.checkExpressionValueIsNotNull(isOverridableByWithoutExternalConditions, "OverridingUtil.DEFAULT.i…er, subDescriptor, false)");
                OverridingUtil.OverrideCompatibilityInfo.Result result2 = isOverridableByWithoutExternalConditions.getResult();
                Intrinsics.checkExpressionValueIsNotNull(result2, "OverridingUtil.DEFAULT.i…Descriptor, false).result");
                if (WhenMappings.$EnumSwitchMapping$0[result2.ordinal()] != 1) {
                    return ExternalOverridabilityCondition.Result.UNKNOWN;
                }
                return ExternalOverridabilityCondition.Result.OVERRIDABLE;
            }
        }
        return ExternalOverridabilityCondition.Result.UNKNOWN;
    }
}
