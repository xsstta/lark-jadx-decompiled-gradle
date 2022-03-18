package kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil;

import java.util.Collection;
import java.util.LinkedHashSet;
import kotlin.TypeCastException;
import kotlin._Assertions;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyAccessorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefinerKt;
import kotlin.reflect.jvm.internal.impl.types.checker.Ref;
import kotlin.reflect.jvm.internal.impl.utils.DFS;
import kotlin.sequences.C69294l;
import kotlin.sequences.Sequence;

public final class DescriptorUtilsKt {
    private static final Name RETENTION_PARAMETER_NAME;

    static {
        Name identifier = Name.identifier("value");
        Intrinsics.checkExpressionValueIsNotNull(identifier, "Name.identifier(\"value\")");
        RETENTION_PARAMETER_NAME = identifier;
    }

    public static final KotlinBuiltIns getBuiltIns(DeclarationDescriptor declarationDescriptor) {
        Intrinsics.checkParameterIsNotNull(declarationDescriptor, "$this$builtIns");
        return getModule(declarationDescriptor).getBuiltIns();
    }

    public static final FqName getFqNameSafe(DeclarationDescriptor declarationDescriptor) {
        Intrinsics.checkParameterIsNotNull(declarationDescriptor, "$this$fqNameSafe");
        FqName fqNameSafe = DescriptorUtils.getFqNameSafe(declarationDescriptor);
        Intrinsics.checkExpressionValueIsNotNull(fqNameSafe, "DescriptorUtils.getFqNameSafe(this)");
        return fqNameSafe;
    }

    public static final FqNameUnsafe getFqNameUnsafe(DeclarationDescriptor declarationDescriptor) {
        Intrinsics.checkParameterIsNotNull(declarationDescriptor, "$this$fqNameUnsafe");
        FqNameUnsafe fqName = DescriptorUtils.getFqName(declarationDescriptor);
        Intrinsics.checkExpressionValueIsNotNull(fqName, "DescriptorUtils.getFqName(this)");
        return fqName;
    }

    public static final ModuleDescriptor getModule(DeclarationDescriptor declarationDescriptor) {
        Intrinsics.checkParameterIsNotNull(declarationDescriptor, "$this$module");
        ModuleDescriptor containingModule = DescriptorUtils.getContainingModule(declarationDescriptor);
        Intrinsics.checkExpressionValueIsNotNull(containingModule, "DescriptorUtils.getContainingModule(this)");
        return containingModule;
    }

    public static final Sequence<DeclarationDescriptor> getParents(DeclarationDescriptor declarationDescriptor) {
        Intrinsics.checkParameterIsNotNull(declarationDescriptor, "$this$parents");
        return C69294l.m266128a(getParentsWithSelf(declarationDescriptor), 1);
    }

    public static final Sequence<DeclarationDescriptor> getParentsWithSelf(DeclarationDescriptor declarationDescriptor) {
        Intrinsics.checkParameterIsNotNull(declarationDescriptor, "$this$parentsWithSelf");
        return C69294l.m266115a(declarationDescriptor, DescriptorUtilsKt$parentsWithSelf$1.INSTANCE);
    }

    public static final ConstantValue<?> firstArgument(AnnotationDescriptor annotationDescriptor) {
        Intrinsics.checkParameterIsNotNull(annotationDescriptor, "$this$firstArgument");
        return (ConstantValue) CollectionsKt.firstOrNull(annotationDescriptor.getAllValueArguments().values());
    }

    public static final FqName fqNameOrNull(DeclarationDescriptor declarationDescriptor) {
        Intrinsics.checkParameterIsNotNull(declarationDescriptor, "$this$fqNameOrNull");
        FqNameUnsafe fqNameUnsafe = getFqNameUnsafe(declarationDescriptor);
        if (!fqNameUnsafe.isSafe()) {
            fqNameUnsafe = null;
        }
        if (fqNameUnsafe != null) {
            return fqNameUnsafe.toSafe();
        }
        return null;
    }

    public static final ClassDescriptor getAnnotationClass(AnnotationDescriptor annotationDescriptor) {
        Intrinsics.checkParameterIsNotNull(annotationDescriptor, "$this$annotationClass");
        ClassifierDescriptor declarationDescriptor = annotationDescriptor.getType().getConstructor().getDeclarationDescriptor();
        if (!(declarationDescriptor instanceof ClassDescriptor)) {
            declarationDescriptor = null;
        }
        return (ClassDescriptor) declarationDescriptor;
    }

    public static final KotlinTypeRefiner getKotlinTypeRefiner(ModuleDescriptor moduleDescriptor) {
        KotlinTypeRefiner kotlinTypeRefiner;
        Intrinsics.checkParameterIsNotNull(moduleDescriptor, "$this$getKotlinTypeRefiner");
        Ref ref = (Ref) moduleDescriptor.getCapability(KotlinTypeRefinerKt.getREFINER_CAPABILITY());
        if (ref == null || (kotlinTypeRefiner = (KotlinTypeRefiner) ref.getValue()) == null) {
            return KotlinTypeRefiner.Default.INSTANCE;
        }
        return kotlinTypeRefiner;
    }

    public static final CallableMemberDescriptor getPropertyIfAccessor(CallableMemberDescriptor callableMemberDescriptor) {
        Intrinsics.checkParameterIsNotNull(callableMemberDescriptor, "$this$propertyIfAccessor");
        if (!(callableMemberDescriptor instanceof PropertyAccessorDescriptor)) {
            return callableMemberDescriptor;
        }
        PropertyDescriptor correspondingProperty = ((PropertyAccessorDescriptor) callableMemberDescriptor).getCorrespondingProperty();
        Intrinsics.checkExpressionValueIsNotNull(correspondingProperty, "correspondingProperty");
        return correspondingProperty;
    }

    public static final boolean isTypeRefinementEnabled(ModuleDescriptor moduleDescriptor) {
        KotlinTypeRefiner kotlinTypeRefiner;
        Intrinsics.checkParameterIsNotNull(moduleDescriptor, "$this$isTypeRefinementEnabled");
        Ref ref = (Ref) moduleDescriptor.getCapability(KotlinTypeRefinerKt.getREFINER_CAPABILITY());
        if (ref != null) {
            kotlinTypeRefiner = (KotlinTypeRefiner) ref.getValue();
        } else {
            kotlinTypeRefiner = null;
        }
        if (kotlinTypeRefiner != null) {
            return true;
        }
        return false;
    }

    public static final boolean declaresOrInheritsDefaultValue(ValueParameterDescriptor valueParameterDescriptor) {
        Intrinsics.checkParameterIsNotNull(valueParameterDescriptor, "$this$declaresOrInheritsDefaultValue");
        Boolean ifAny = DFS.ifAny(CollectionsKt.listOf(valueParameterDescriptor), DescriptorUtilsKt$declaresOrInheritsDefaultValue$1.INSTANCE, DescriptorUtilsKt$declaresOrInheritsDefaultValue$2.INSTANCE);
        Intrinsics.checkExpressionValueIsNotNull(ifAny, "DFS.ifAny(\n        listO…eclaresDefaultValue\n    )");
        return ifAny.booleanValue();
    }

    public static final ClassId getClassId(ClassifierDescriptor classifierDescriptor) {
        DeclarationDescriptor containingDeclaration;
        ClassId classId;
        if (classifierDescriptor == null || (containingDeclaration = classifierDescriptor.getContainingDeclaration()) == null) {
            return null;
        }
        if (containingDeclaration instanceof PackageFragmentDescriptor) {
            return new ClassId(((PackageFragmentDescriptor) containingDeclaration).getFqName(), classifierDescriptor.getName());
        }
        if (!(containingDeclaration instanceof ClassifierDescriptorWithTypeParameters) || (classId = getClassId((ClassifierDescriptor) containingDeclaration)) == null) {
            return null;
        }
        return classId.createNestedClassId(classifierDescriptor.getName());
    }

    public static final Collection<ClassDescriptor> computeSealedSubclasses(ClassDescriptor classDescriptor) {
        Intrinsics.checkParameterIsNotNull(classDescriptor, "sealedClass");
        if (classDescriptor.getModality() != Modality.SEALED) {
            return CollectionsKt.emptyList();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        DescriptorUtilsKt$computeSealedSubclasses$1 descriptorUtilsKt$computeSealedSubclasses$1 = new DescriptorUtilsKt$computeSealedSubclasses$1(classDescriptor, linkedHashSet);
        DeclarationDescriptor containingDeclaration = classDescriptor.getContainingDeclaration();
        Intrinsics.checkExpressionValueIsNotNull(containingDeclaration, "sealedClass.containingDeclaration");
        if (containingDeclaration instanceof PackageFragmentDescriptor) {
            descriptorUtilsKt$computeSealedSubclasses$1.invoke(((PackageFragmentDescriptor) containingDeclaration).getMemberScope(), false);
        }
        MemberScope unsubstitutedInnerClassesScope = classDescriptor.getUnsubstitutedInnerClassesScope();
        Intrinsics.checkExpressionValueIsNotNull(unsubstitutedInnerClassesScope, "sealedClass.unsubstitutedInnerClassesScope");
        descriptorUtilsKt$computeSealedSubclasses$1.invoke(unsubstitutedInnerClassesScope, true);
        return linkedHashSet;
    }

    public static final ClassDescriptor getSuperClassNotAny(ClassDescriptor classDescriptor) {
        Intrinsics.checkParameterIsNotNull(classDescriptor, "$this$getSuperClassNotAny");
        for (KotlinType kotlinType : classDescriptor.getDefaultType().getConstructor().getSupertypes()) {
            if (!KotlinBuiltIns.isAnyOrNullableAny(kotlinType)) {
                ClassifierDescriptor declarationDescriptor = kotlinType.getConstructor().getDeclarationDescriptor();
                if (DescriptorUtils.isClassOrEnumClass(declarationDescriptor)) {
                    if (declarationDescriptor != null) {
                        return (ClassDescriptor) declarationDescriptor;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                }
            }
        }
        return null;
    }

    public static final CallableMemberDescriptor firstOverridden(CallableMemberDescriptor callableMemberDescriptor, boolean z, Function1<? super CallableMemberDescriptor, Boolean> function1) {
        Intrinsics.checkParameterIsNotNull(callableMemberDescriptor, "$this$firstOverridden");
        Intrinsics.checkParameterIsNotNull(function1, "predicate");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = (T) null;
        return (CallableMemberDescriptor) DFS.dfs(CollectionsKt.listOf(callableMemberDescriptor), new DescriptorUtilsKt$firstOverridden$1(z), new DescriptorUtilsKt$firstOverridden$2(objectRef, function1));
    }

    public static final ClassDescriptor resolveTopLevelClass(ModuleDescriptor moduleDescriptor, FqName fqName, LookupLocation lookupLocation) {
        Intrinsics.checkParameterIsNotNull(moduleDescriptor, "$this$resolveTopLevelClass");
        Intrinsics.checkParameterIsNotNull(fqName, "topLevelClassFqName");
        Intrinsics.checkParameterIsNotNull(lookupLocation, "location");
        boolean z = !fqName.isRoot();
        if (!_Assertions.f173221a || z) {
            FqName parent = fqName.parent();
            Intrinsics.checkExpressionValueIsNotNull(parent, "topLevelClassFqName.parent()");
            MemberScope memberScope = moduleDescriptor.getPackage(parent).getMemberScope();
            Name shortName = fqName.shortName();
            Intrinsics.checkExpressionValueIsNotNull(shortName, "topLevelClassFqName.shortName()");
            ClassifierDescriptor contributedClassifier = memberScope.getContributedClassifier(shortName, lookupLocation);
            if (!(contributedClassifier instanceof ClassDescriptor)) {
                contributedClassifier = null;
            }
            return (ClassDescriptor) contributedClassifier;
        }
        throw new AssertionError("Assertion failed");
    }

    public static /* synthetic */ CallableMemberDescriptor firstOverridden$default(CallableMemberDescriptor callableMemberDescriptor, boolean z, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return firstOverridden(callableMemberDescriptor, z, function1);
    }
}
