package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.checker.NewTypeVariableConstructor;

public class TypeUtils {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final SimpleType CANT_INFER_FUNCTION_PARAM_TYPE = ErrorUtils.createErrorType("Cannot be inferred");
    public static final SimpleType DONT_CARE = ErrorUtils.createErrorTypeWithCustomDebugName("DONT_CARE");
    public static final SimpleType NO_EXPECTED_TYPE = new SpecialType("NO_EXPECTED_TYPE");
    public static final SimpleType UNIT_EXPECTED_TYPE = new SpecialType("UNIT_EXPECTED_TYPE");

    /* JADX WARNING: Removed duplicated region for block: B:100:0x0187  */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x018c  */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0191  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0194  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0199  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x019e  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x01a1  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x01a4  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x01a7  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x01ac  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x01af  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x01b2  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x01b7  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x01da  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0128  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x012e  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x013a  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0140  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x014c  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0152  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0158  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x015e  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0164  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0169  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x016e  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0173  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0178  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x017d  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0182  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static /* synthetic */ void $$$reportNull$$$0(int r24) {
        /*
        // Method dump skipped, instructions count: 776
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.types.TypeUtils.$$$reportNull$$$0(int):void");
    }

    public static class SpecialType extends DelegatingSimpleType {
        private final String name;

        /* JADX WARNING: Removed duplicated region for block: B:21:0x0036  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x003e  */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x0044  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static /* synthetic */ void $$$reportNull$$$0(int r9) {
            /*
            // Method dump skipped, instructions count: 106
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.types.TypeUtils.SpecialType.$$$reportNull$$$0(int):void");
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType, kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType, kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType, kotlin.reflect.jvm.internal.impl.types.UnwrappedType, kotlin.reflect.jvm.internal.impl.types.KotlinType
        public SpecialType refine(KotlinTypeRefiner kotlinTypeRefiner) {
            if (kotlinTypeRefiner == null) {
                $$$reportNull$$$0(3);
            }
            return this;
        }

        /* access modifiers changed from: protected */
        @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType
        public SimpleType getDelegate() {
            throw new IllegalStateException(this.name);
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType
        public String toString() {
            String str = this.name;
            if (str == null) {
                $$$reportNull$$$0(1);
            }
            return str;
        }

        public SpecialType(String str) {
            this.name = str;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType, kotlin.reflect.jvm.internal.impl.types.SimpleType
        public SimpleType makeNullableAsSpecified(boolean z) {
            throw new IllegalStateException(this.name);
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType, kotlin.reflect.jvm.internal.impl.types.SimpleType
        public SimpleType replaceAnnotations(Annotations annotations) {
            if (annotations == null) {
                $$$reportNull$$$0(0);
            }
            throw new IllegalStateException(this.name);
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType
        public DelegatingSimpleType replaceDelegate(SimpleType simpleType) {
            if (simpleType == null) {
                $$$reportNull$$$0(2);
            }
            throw new IllegalStateException(this.name);
        }
    }

    public static KotlinType makeNotNullable(KotlinType kotlinType) {
        if (kotlinType == null) {
            $$$reportNull$$$0(2);
        }
        return makeNullableAsSpecified(kotlinType, false);
    }

    public static KotlinType makeNullable(KotlinType kotlinType) {
        if (kotlinType == null) {
            $$$reportNull$$$0(1);
        }
        return makeNullableAsSpecified(kotlinType, true);
    }

    public static TypeProjection makeStarProjection(TypeParameterDescriptor typeParameterDescriptor) {
        if (typeParameterDescriptor == null) {
            $$$reportNull$$$0(45);
        }
        return new StarProjectionImpl(typeParameterDescriptor);
    }

    public static boolean noExpectedType(KotlinType kotlinType) {
        if (kotlinType == null) {
            $$$reportNull$$$0(0);
        }
        if (kotlinType == NO_EXPECTED_TYPE || kotlinType == UNIT_EXPECTED_TYPE) {
            return true;
        }
        return false;
    }

    public static ClassDescriptor getClassDescriptor(KotlinType kotlinType) {
        if (kotlinType == null) {
            $$$reportNull$$$0(30);
        }
        ClassifierDescriptor declarationDescriptor = kotlinType.getConstructor().getDeclarationDescriptor();
        if (declarationDescriptor instanceof ClassDescriptor) {
            return (ClassDescriptor) declarationDescriptor;
        }
        return null;
    }

    public static TypeParameterDescriptor getTypeParameterDescriptorOrNull(KotlinType kotlinType) {
        if (kotlinType == null) {
            $$$reportNull$$$0(62);
        }
        if (kotlinType.getConstructor().getDeclarationDescriptor() instanceof TypeParameterDescriptor) {
            return (TypeParameterDescriptor) kotlinType.getConstructor().getDeclarationDescriptor();
        }
        return null;
    }

    public static boolean isDontCarePlaceholder(KotlinType kotlinType) {
        if (kotlinType == null || kotlinType.getConstructor() != DONT_CARE.getConstructor()) {
            return false;
        }
        return true;
    }

    public static boolean isTypeParameter(KotlinType kotlinType) {
        if (kotlinType == null) {
            $$$reportNull$$$0(59);
        }
        if (getTypeParameterDescriptorOrNull(kotlinType) != null || (kotlinType.getConstructor() instanceof NewTypeVariableConstructor)) {
            return true;
        }
        return false;
    }

    public static boolean acceptsNullable(KotlinType kotlinType) {
        if (kotlinType == null) {
            $$$reportNull$$$0(28);
        }
        if (kotlinType.isMarkedNullable()) {
            return true;
        }
        if (!FlexibleTypesKt.isFlexible(kotlinType) || !acceptsNullable(FlexibleTypesKt.asFlexibleType(kotlinType).getUpperBound())) {
            return false;
        }
        return true;
    }

    public static List<TypeProjection> getDefaultTypeProjections(List<TypeParameterDescriptor> list) {
        if (list == null) {
            $$$reportNull$$$0(16);
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (TypeParameterDescriptor typeParameterDescriptor : list) {
            arrayList.add(new TypeProjectionImpl(typeParameterDescriptor.getDefaultType()));
        }
        List<TypeProjection> list2 = CollectionsKt.toList(arrayList);
        if (list2 == null) {
            $$$reportNull$$$0(17);
        }
        return list2;
    }

    public static List<KotlinType> getImmediateSupertypes(KotlinType kotlinType) {
        if (kotlinType == null) {
            $$$reportNull$$$0(18);
        }
        TypeSubstitutor create = TypeSubstitutor.create(kotlinType);
        Collection<KotlinType> supertypes = kotlinType.getConstructor().getSupertypes();
        ArrayList arrayList = new ArrayList(supertypes.size());
        for (KotlinType kotlinType2 : supertypes) {
            KotlinType createSubstitutedSupertype = createSubstitutedSupertype(kotlinType, kotlinType2, create);
            if (createSubstitutedSupertype != null) {
                arrayList.add(createSubstitutedSupertype);
            }
        }
        return arrayList;
    }

    public static boolean hasNullableSuperType(KotlinType kotlinType) {
        if (kotlinType == null) {
            $$$reportNull$$$0(29);
        }
        if (kotlinType.getConstructor().getDeclarationDescriptor() instanceof ClassDescriptor) {
            return false;
        }
        for (KotlinType kotlinType2 : getImmediateSupertypes(kotlinType)) {
            if (isNullableType(kotlinType2)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isNullableType(KotlinType kotlinType) {
        if (kotlinType == null) {
            $$$reportNull$$$0(27);
        }
        if (kotlinType.isMarkedNullable()) {
            return true;
        }
        if (FlexibleTypesKt.isFlexible(kotlinType) && isNullableType(FlexibleTypesKt.asFlexibleType(kotlinType).getUpperBound())) {
            return true;
        }
        if (isTypeParameter(kotlinType)) {
            return hasNullableSuperType(kotlinType);
        }
        TypeConstructor constructor = kotlinType.getConstructor();
        if (!(constructor instanceof IntersectionTypeConstructor)) {
            return false;
        }
        for (KotlinType kotlinType2 : constructor.getSupertypes()) {
            if (isNullableType(kotlinType2)) {
                return true;
            }
        }
        return false;
    }

    public static boolean contains(KotlinType kotlinType, Function1<UnwrappedType, Boolean> function1) {
        if (function1 == null) {
            $$$reportNull$$$0(43);
        }
        return contains(kotlinType, function1, new HashSet());
    }

    public static KotlinType makeNullableAsSpecified(KotlinType kotlinType, boolean z) {
        if (kotlinType == null) {
            $$$reportNull$$$0(3);
        }
        UnwrappedType makeNullableAsSpecified = kotlinType.unwrap().makeNullableAsSpecified(z);
        if (makeNullableAsSpecified == null) {
            $$$reportNull$$$0(4);
        }
        return makeNullableAsSpecified;
    }

    public static KotlinType makeNullableIfNeeded(KotlinType kotlinType, boolean z) {
        if (kotlinType == null) {
            $$$reportNull$$$0(8);
        }
        if (z) {
            return makeNullable(kotlinType);
        }
        if (kotlinType == null) {
            $$$reportNull$$$0(9);
        }
        return kotlinType;
    }

    public static SimpleType makeNullableIfNeeded(SimpleType simpleType, boolean z) {
        if (simpleType == null) {
            $$$reportNull$$$0(5);
        }
        if (z) {
            SimpleType makeNullableAsSpecified = simpleType.makeNullableAsSpecified(true);
            if (makeNullableAsSpecified == null) {
                $$$reportNull$$$0(6);
            }
            return makeNullableAsSpecified;
        }
        if (simpleType == null) {
            $$$reportNull$$$0(7);
        }
        return simpleType;
    }

    public static KotlinType createSubstitutedSupertype(KotlinType kotlinType, KotlinType kotlinType2, TypeSubstitutor typeSubstitutor) {
        if (kotlinType == null) {
            $$$reportNull$$$0(20);
        }
        if (kotlinType2 == null) {
            $$$reportNull$$$0(21);
        }
        if (typeSubstitutor == null) {
            $$$reportNull$$$0(22);
        }
        KotlinType substitute = typeSubstitutor.substitute(kotlinType2, Variance.INVARIANT);
        if (substitute != null) {
            return makeNullableIfNeeded(substitute, kotlinType.isMarkedNullable());
        }
        return null;
    }

    public static SimpleType makeUnsubstitutedType(ClassifierDescriptor classifierDescriptor, MemberScope memberScope, Function1<KotlinTypeRefiner, SimpleType> function1) {
        if (!ErrorUtils.isError(classifierDescriptor)) {
            return makeUnsubstitutedType(classifierDescriptor.getTypeConstructor(), memberScope, function1);
        }
        SimpleType createErrorType = ErrorUtils.createErrorType("Unsubstituted type for " + classifierDescriptor);
        if (createErrorType == null) {
            $$$reportNull$$$0(11);
        }
        return createErrorType;
    }

    public static SimpleType makeUnsubstitutedType(TypeConstructor typeConstructor, MemberScope memberScope, Function1<KotlinTypeRefiner, SimpleType> function1) {
        if (typeConstructor == null) {
            $$$reportNull$$$0(12);
        }
        if (memberScope == null) {
            $$$reportNull$$$0(13);
        }
        if (function1 == null) {
            $$$reportNull$$$0(14);
        }
        SimpleType simpleTypeWithNonTrivialMemberScope = KotlinTypeFactory.simpleTypeWithNonTrivialMemberScope(Annotations.Companion.getEMPTY(), typeConstructor, getDefaultTypeProjections(typeConstructor.getParameters()), false, memberScope, function1);
        if (simpleTypeWithNonTrivialMemberScope == null) {
            $$$reportNull$$$0(15);
        }
        return simpleTypeWithNonTrivialMemberScope;
    }

    private static boolean contains(KotlinType kotlinType, Function1<UnwrappedType, Boolean> function1, HashSet<KotlinType> hashSet) {
        FlexibleType flexibleType;
        if (function1 == null) {
            $$$reportNull$$$0(44);
        }
        if (kotlinType == null || hashSet.contains(kotlinType)) {
            return false;
        }
        hashSet.add(kotlinType);
        UnwrappedType unwrap = kotlinType.unwrap();
        if (function1.invoke(unwrap).booleanValue()) {
            return true;
        }
        if (unwrap instanceof FlexibleType) {
            flexibleType = (FlexibleType) unwrap;
        } else {
            flexibleType = null;
        }
        if (flexibleType != null && (contains(flexibleType.getLowerBound(), function1, hashSet) || contains(flexibleType.getUpperBound(), function1, hashSet))) {
            return true;
        }
        if ((unwrap instanceof DefinitelyNotNullType) && contains(((DefinitelyNotNullType) unwrap).getOriginal(), function1, hashSet)) {
            return true;
        }
        TypeConstructor constructor = kotlinType.getConstructor();
        if (constructor instanceof IntersectionTypeConstructor) {
            for (KotlinType kotlinType2 : ((IntersectionTypeConstructor) constructor).getSupertypes()) {
                if (contains(kotlinType2, function1, hashSet)) {
                    return true;
                }
            }
            return false;
        }
        for (TypeProjection typeProjection : kotlinType.getArguments()) {
            if (!typeProjection.isStarProjection()) {
                if (contains(typeProjection.getType(), function1, hashSet)) {
                    return true;
                }
            }
        }
        return false;
    }
}
