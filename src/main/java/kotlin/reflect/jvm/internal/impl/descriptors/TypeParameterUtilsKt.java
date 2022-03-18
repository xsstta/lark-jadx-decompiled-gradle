package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin._Assertions;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.ErrorUtils;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.sequences.C69294l;

public final class TypeParameterUtilsKt {
    public static final PossiblyInnerType buildPossiblyInnerType(KotlinType kotlinType) {
        Intrinsics.checkParameterIsNotNull(kotlinType, "$this$buildPossiblyInnerType");
        ClassifierDescriptor declarationDescriptor = kotlinType.getConstructor().getDeclarationDescriptor();
        if (!(declarationDescriptor instanceof ClassifierDescriptorWithTypeParameters)) {
            declarationDescriptor = null;
        }
        return buildPossiblyInnerType(kotlinType, (ClassifierDescriptorWithTypeParameters) declarationDescriptor, 0);
    }

    public static final List<TypeParameterDescriptor> computeConstructorTypeParameters(ClassifierDescriptorWithTypeParameters classifierDescriptorWithTypeParameters) {
        List<TypeParameterDescriptor> list;
        DeclarationDescriptor declarationDescriptor;
        TypeConstructor typeConstructor;
        Intrinsics.checkParameterIsNotNull(classifierDescriptorWithTypeParameters, "$this$computeConstructorTypeParameters");
        List<TypeParameterDescriptor> declaredTypeParameters = classifierDescriptorWithTypeParameters.getDeclaredTypeParameters();
        Intrinsics.checkExpressionValueIsNotNull(declaredTypeParameters, "declaredTypeParameters");
        if (!(classifierDescriptorWithTypeParameters.isInner() || (classifierDescriptorWithTypeParameters.getContainingDeclaration() instanceof CallableDescriptor))) {
            return declaredTypeParameters;
        }
        ClassifierDescriptorWithTypeParameters classifierDescriptorWithTypeParameters2 = classifierDescriptorWithTypeParameters;
        List h = C69294l.m266144h(C69294l.m266138d(C69294l.m266131a(C69294l.m266136c(DescriptorUtilsKt.getParents(classifierDescriptorWithTypeParameters2), TypeParameterUtilsKt$computeConstructorTypeParameters$parametersFromContainingFunctions$1.INSTANCE), (Function1) TypeParameterUtilsKt$computeConstructorTypeParameters$parametersFromContainingFunctions$2.INSTANCE), TypeParameterUtilsKt$computeConstructorTypeParameters$parametersFromContainingFunctions$3.INSTANCE));
        Iterator<DeclarationDescriptor> a = DescriptorUtilsKt.getParents(classifierDescriptorWithTypeParameters2).mo4717a();
        while (true) {
            list = null;
            if (!a.hasNext()) {
                declarationDescriptor = null;
                break;
            }
            declarationDescriptor = a.next();
            if (declarationDescriptor instanceof ClassDescriptor) {
                break;
            }
        }
        ClassDescriptor classDescriptor = (ClassDescriptor) declarationDescriptor;
        if (!(classDescriptor == null || (typeConstructor = classDescriptor.getTypeConstructor()) == null)) {
            list = typeConstructor.getParameters();
        }
        if (list == null) {
            list = CollectionsKt.emptyList();
        }
        if (!h.isEmpty() || !list.isEmpty()) {
            List<TypeParameterDescriptor> plus = CollectionsKt.plus((Collection) h, (Iterable) list);
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(plus, 10));
            for (TypeParameterDescriptor typeParameterDescriptor : plus) {
                Intrinsics.checkExpressionValueIsNotNull(typeParameterDescriptor, "it");
                arrayList.add(capturedCopyForInnerDeclaration(typeParameterDescriptor, classifierDescriptorWithTypeParameters2, declaredTypeParameters.size()));
            }
            return CollectionsKt.plus((Collection) declaredTypeParameters, (Iterable) arrayList);
        }
        List<TypeParameterDescriptor> declaredTypeParameters2 = classifierDescriptorWithTypeParameters.getDeclaredTypeParameters();
        Intrinsics.checkExpressionValueIsNotNull(declaredTypeParameters2, "declaredTypeParameters");
        return declaredTypeParameters2;
    }

    private static final CapturedTypeParameterDescriptor capturedCopyForInnerDeclaration(TypeParameterDescriptor typeParameterDescriptor, DeclarationDescriptor declarationDescriptor, int i) {
        return new CapturedTypeParameterDescriptor(typeParameterDescriptor, declarationDescriptor, i);
    }

    private static final PossiblyInnerType buildPossiblyInnerType(KotlinType kotlinType, ClassifierDescriptorWithTypeParameters classifierDescriptorWithTypeParameters, int i) {
        boolean z;
        ClassifierDescriptorWithTypeParameters classifierDescriptorWithTypeParameters2 = null;
        if (classifierDescriptorWithTypeParameters != null) {
            ClassifierDescriptorWithTypeParameters classifierDescriptorWithTypeParameters3 = classifierDescriptorWithTypeParameters;
            if (!ErrorUtils.isError(classifierDescriptorWithTypeParameters3)) {
                int size = classifierDescriptorWithTypeParameters.getDeclaredTypeParameters().size() + i;
                if (!classifierDescriptorWithTypeParameters.isInner()) {
                    if (size == kotlinType.getArguments().size() || DescriptorUtils.isLocal(classifierDescriptorWithTypeParameters3)) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!_Assertions.f173221a || z) {
                        return new PossiblyInnerType(classifierDescriptorWithTypeParameters, kotlinType.getArguments().subList(i, kotlinType.getArguments().size()), null);
                    }
                    throw new AssertionError((kotlinType.getArguments().size() - size) + " trailing arguments were found in " + kotlinType + " type");
                }
                List<TypeProjection> subList = kotlinType.getArguments().subList(i, size);
                DeclarationDescriptor containingDeclaration = classifierDescriptorWithTypeParameters.getContainingDeclaration();
                if (containingDeclaration instanceof ClassifierDescriptorWithTypeParameters) {
                    classifierDescriptorWithTypeParameters2 = containingDeclaration;
                }
                return new PossiblyInnerType(classifierDescriptorWithTypeParameters, subList, buildPossiblyInnerType(kotlinType, classifierDescriptorWithTypeParameters2, size));
            }
        }
        return null;
    }
}
