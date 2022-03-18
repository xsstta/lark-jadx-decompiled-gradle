package kotlin.reflect.jvm.internal.impl.types.typeUtil;

import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin._Assertions;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.types.FlexibleType;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.StarProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutionKt;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.TypeWithEnhancementKt;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker;
import kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedType;
import kotlin.reflect.jvm.internal.impl.types.checker.NewTypeVariableConstructor;

public final class TypeUtilsKt {
    public static final TypeProjection asTypeProjection(KotlinType kotlinType) {
        Intrinsics.checkParameterIsNotNull(kotlinType, "$this$asTypeProjection");
        return new TypeProjectionImpl(kotlinType);
    }

    public static final boolean containsTypeAliasParameters(KotlinType kotlinType) {
        Intrinsics.checkParameterIsNotNull(kotlinType, "$this$containsTypeAliasParameters");
        return contains(kotlinType, TypeUtilsKt$containsTypeAliasParameters$1.INSTANCE);
    }

    public static final boolean isTypeParameter(KotlinType kotlinType) {
        Intrinsics.checkParameterIsNotNull(kotlinType, "$this$isTypeParameter");
        return TypeUtils.isTypeParameter(kotlinType);
    }

    public static final KotlinType makeNotNullable(KotlinType kotlinType) {
        Intrinsics.checkParameterIsNotNull(kotlinType, "$this$makeNotNullable");
        KotlinType makeNotNullable = TypeUtils.makeNotNullable(kotlinType);
        Intrinsics.checkExpressionValueIsNotNull(makeNotNullable, "TypeUtils.makeNotNullable(this)");
        return makeNotNullable;
    }

    public static final KotlinType makeNullable(KotlinType kotlinType) {
        Intrinsics.checkParameterIsNotNull(kotlinType, "$this$makeNullable");
        KotlinType makeNullable = TypeUtils.makeNullable(kotlinType);
        Intrinsics.checkExpressionValueIsNotNull(makeNullable, "TypeUtils.makeNullable(this)");
        return makeNullable;
    }

    public static final boolean requiresTypeAliasExpansion(KotlinType kotlinType) {
        Intrinsics.checkParameterIsNotNull(kotlinType, "$this$requiresTypeAliasExpansion");
        return contains(kotlinType, TypeUtilsKt$requiresTypeAliasExpansion$1.INSTANCE);
    }

    public static final KotlinBuiltIns getBuiltIns(KotlinType kotlinType) {
        Intrinsics.checkParameterIsNotNull(kotlinType, "$this$builtIns");
        KotlinBuiltIns builtIns = kotlinType.getConstructor().getBuiltIns();
        Intrinsics.checkExpressionValueIsNotNull(builtIns, "constructor.builtIns");
        return builtIns;
    }

    public static final boolean isTypeAliasParameter(ClassifierDescriptor classifierDescriptor) {
        Intrinsics.checkParameterIsNotNull(classifierDescriptor, "$this$isTypeAliasParameter");
        if (!(classifierDescriptor instanceof TypeParameterDescriptor) || !(((TypeParameterDescriptor) classifierDescriptor).getContainingDeclaration() instanceof TypeAliasDescriptor)) {
            return false;
        }
        return true;
    }

    public static final boolean canHaveUndefinedNullability(UnwrappedType unwrappedType) {
        Intrinsics.checkParameterIsNotNull(unwrappedType, "$this$canHaveUndefinedNullability");
        if ((unwrappedType.getConstructor() instanceof NewTypeVariableConstructor) || (unwrappedType.getConstructor().getDeclarationDescriptor() instanceof TypeParameterDescriptor) || (unwrappedType instanceof NewCapturedType)) {
            return true;
        }
        return false;
    }

    public static final KotlinType getRepresentativeUpperBound(TypeParameterDescriptor typeParameterDescriptor) {
        T t;
        Intrinsics.checkParameterIsNotNull(typeParameterDescriptor, "$this$representativeUpperBound");
        List<KotlinType> upperBounds = typeParameterDescriptor.getUpperBounds();
        Intrinsics.checkExpressionValueIsNotNull(upperBounds, "upperBounds");
        boolean z = !upperBounds.isEmpty();
        if (!_Assertions.f173221a || z) {
            List<KotlinType> upperBounds2 = typeParameterDescriptor.getUpperBounds();
            Intrinsics.checkExpressionValueIsNotNull(upperBounds2, "upperBounds");
            Iterator<T> it = upperBounds2.iterator();
            while (true) {
                t = null;
                if (!it.hasNext()) {
                    break;
                }
                T next = it.next();
                ClassifierDescriptor declarationDescriptor = next.getConstructor().getDeclarationDescriptor();
                if (declarationDescriptor instanceof ClassDescriptor) {
                    t = declarationDescriptor;
                }
                T t2 = t;
                boolean z2 = false;
                if (!(t2 == null || t2.getKind() == ClassKind.INTERFACE || t2.getKind() == ClassKind.ANNOTATION_CLASS)) {
                    z2 = true;
                    continue;
                }
                if (z2) {
                    t = next;
                    break;
                }
            }
            T t3 = t;
            if (t3 != null) {
                return t3;
            }
            List<KotlinType> upperBounds3 = typeParameterDescriptor.getUpperBounds();
            Intrinsics.checkExpressionValueIsNotNull(upperBounds3, "upperBounds");
            Object first = CollectionsKt.first((List) upperBounds3);
            Intrinsics.checkExpressionValueIsNotNull(first, "upperBounds.first()");
            return (KotlinType) first;
        }
        throw new AssertionError("Upper bounds should not be empty: " + typeParameterDescriptor);
    }

    public static final KotlinType replaceArgumentsWithStarProjections(KotlinType kotlinType) {
        SimpleType simpleType;
        Intrinsics.checkParameterIsNotNull(kotlinType, "$this$replaceArgumentsWithStarProjections");
        UnwrappedType unwrap = kotlinType.unwrap();
        if (unwrap instanceof FlexibleType) {
            FlexibleType flexibleType = (FlexibleType) unwrap;
            SimpleType lowerBound = flexibleType.getLowerBound();
            if (!lowerBound.getConstructor().getParameters().isEmpty() && lowerBound.getConstructor().getDeclarationDescriptor() != null) {
                List<TypeParameterDescriptor> parameters = lowerBound.getConstructor().getParameters();
                Intrinsics.checkExpressionValueIsNotNull(parameters, "constructor.parameters");
                List<TypeParameterDescriptor> list = parameters;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(new StarProjectionImpl(it.next()));
                }
                lowerBound = TypeSubstitutionKt.replace$default(lowerBound, (List) arrayList, (Annotations) null, 2, (Object) null);
            }
            SimpleType upperBound = flexibleType.getUpperBound();
            if (!upperBound.getConstructor().getParameters().isEmpty() && upperBound.getConstructor().getDeclarationDescriptor() != null) {
                List<TypeParameterDescriptor> parameters2 = upperBound.getConstructor().getParameters();
                Intrinsics.checkExpressionValueIsNotNull(parameters2, "constructor.parameters");
                List<TypeParameterDescriptor> list2 = parameters2;
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                Iterator<T> it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(new StarProjectionImpl(it2.next()));
                }
                upperBound = TypeSubstitutionKt.replace$default(upperBound, (List) arrayList2, (Annotations) null, 2, (Object) null);
            }
            simpleType = KotlinTypeFactory.flexibleType(lowerBound, upperBound);
        } else if (unwrap instanceof SimpleType) {
            SimpleType simpleType2 = (SimpleType) unwrap;
            if (!simpleType2.getConstructor().getParameters().isEmpty() && simpleType2.getConstructor().getDeclarationDescriptor() != null) {
                List<TypeParameterDescriptor> parameters3 = simpleType2.getConstructor().getParameters();
                Intrinsics.checkExpressionValueIsNotNull(parameters3, "constructor.parameters");
                List<TypeParameterDescriptor> list3 = parameters3;
                ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
                Iterator<T> it3 = list3.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(new StarProjectionImpl(it3.next()));
                }
                simpleType2 = TypeSubstitutionKt.replace$default(simpleType2, (List) arrayList3, (Annotations) null, 2, (Object) null);
            }
            simpleType = simpleType2;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return TypeWithEnhancementKt.inheritEnhancement(simpleType, unwrap);
    }

    public static final boolean contains(KotlinType kotlinType, Function1<? super UnwrappedType, Boolean> function1) {
        Intrinsics.checkParameterIsNotNull(kotlinType, "$this$contains");
        Intrinsics.checkParameterIsNotNull(function1, "predicate");
        return TypeUtils.contains(kotlinType, function1);
    }

    public static final boolean isSubtypeOf(KotlinType kotlinType, KotlinType kotlinType2) {
        Intrinsics.checkParameterIsNotNull(kotlinType, "$this$isSubtypeOf");
        Intrinsics.checkParameterIsNotNull(kotlinType2, "superType");
        return KotlinTypeChecker.DEFAULT.isSubtypeOf(kotlinType, kotlinType2);
    }

    public static final KotlinType replaceAnnotations(KotlinType kotlinType, Annotations annotations) {
        Intrinsics.checkParameterIsNotNull(kotlinType, "$this$replaceAnnotations");
        Intrinsics.checkParameterIsNotNull(annotations, "newAnnotations");
        if (!kotlinType.getAnnotations().isEmpty() || !annotations.isEmpty()) {
            return kotlinType.unwrap().replaceAnnotations(annotations);
        }
        return kotlinType;
    }

    public static final TypeProjection createProjection(KotlinType kotlinType, Variance variance, TypeParameterDescriptor typeParameterDescriptor) {
        Variance variance2;
        Intrinsics.checkParameterIsNotNull(kotlinType, ShareHitPoint.f121869d);
        Intrinsics.checkParameterIsNotNull(variance, "projectionKind");
        if (typeParameterDescriptor != null) {
            variance2 = typeParameterDescriptor.getVariance();
        } else {
            variance2 = null;
        }
        if (variance2 == variance) {
            variance = Variance.INVARIANT;
        }
        return new TypeProjectionImpl(variance, kotlinType);
    }
}
