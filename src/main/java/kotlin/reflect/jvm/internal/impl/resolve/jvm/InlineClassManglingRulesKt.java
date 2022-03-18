package kotlin.reflect.jvm.internal.impl.resolve.jvm;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibilities;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.InlineClassesUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;

public final class InlineClassManglingRulesKt {
    private static final boolean isDontMangleClass(ClassDescriptor classDescriptor) {
        return Intrinsics.areEqual(DescriptorUtilsKt.getFqNameSafe(classDescriptor), DescriptorUtils.RESULT_FQ_NAME);
    }

    public static final boolean isInlineClassThatRequiresMangling(DeclarationDescriptor declarationDescriptor) {
        Intrinsics.checkParameterIsNotNull(declarationDescriptor, "$this$isInlineClassThatRequiresMangling");
        if (!InlineClassesUtilsKt.isInlineClass(declarationDescriptor) || isDontMangleClass((ClassDescriptor) declarationDescriptor)) {
            return false;
        }
        return true;
    }

    private static final boolean isTypeParameterWithUpperBoundThatRequiresMangling(KotlinType kotlinType) {
        ClassifierDescriptor declarationDescriptor = kotlinType.getConstructor().getDeclarationDescriptor();
        if (!(declarationDescriptor instanceof TypeParameterDescriptor)) {
            declarationDescriptor = null;
        }
        TypeParameterDescriptor typeParameterDescriptor = (TypeParameterDescriptor) declarationDescriptor;
        if (typeParameterDescriptor != null) {
            return requiresFunctionNameMangling(TypeUtilsKt.getRepresentativeUpperBound(typeParameterDescriptor));
        }
        return false;
    }

    private static final boolean requiresFunctionNameMangling(KotlinType kotlinType) {
        if (isInlineClassThatRequiresMangling(kotlinType) || isTypeParameterWithUpperBoundThatRequiresMangling(kotlinType)) {
            return true;
        }
        return false;
    }

    public static final boolean isInlineClassThatRequiresMangling(KotlinType kotlinType) {
        Intrinsics.checkParameterIsNotNull(kotlinType, "$this$isInlineClassThatRequiresMangling");
        ClassifierDescriptor declarationDescriptor = kotlinType.getConstructor().getDeclarationDescriptor();
        if (declarationDescriptor == null || !isInlineClassThatRequiresMangling(declarationDescriptor)) {
            return false;
        }
        return true;
    }

    public static final boolean shouldHideConstructorDueToInlineClassTypeValueParameters(CallableMemberDescriptor callableMemberDescriptor) {
        Intrinsics.checkParameterIsNotNull(callableMemberDescriptor, "descriptor");
        if (!(callableMemberDescriptor instanceof ClassConstructorDescriptor)) {
            callableMemberDescriptor = null;
        }
        ClassConstructorDescriptor classConstructorDescriptor = (ClassConstructorDescriptor) callableMemberDescriptor;
        if (classConstructorDescriptor == null || Visibilities.isPrivate(classConstructorDescriptor.getVisibility())) {
            return false;
        }
        ClassDescriptor constructedClass = classConstructorDescriptor.getConstructedClass();
        Intrinsics.checkExpressionValueIsNotNull(constructedClass, "constructorDescriptor.constructedClass");
        if (constructedClass.isInline() || DescriptorUtils.isSealedClass(classConstructorDescriptor.getConstructedClass())) {
            return false;
        }
        List<ValueParameterDescriptor> valueParameters = classConstructorDescriptor.getValueParameters();
        Intrinsics.checkExpressionValueIsNotNull(valueParameters, "constructorDescriptor.valueParameters");
        List<ValueParameterDescriptor> list = valueParameters;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        for (T t : list) {
            Intrinsics.checkExpressionValueIsNotNull(t, "it");
            KotlinType type = t.getType();
            Intrinsics.checkExpressionValueIsNotNull(type, "it.type");
            if (requiresFunctionNameMangling(type)) {
                return true;
            }
        }
        return false;
    }
}
