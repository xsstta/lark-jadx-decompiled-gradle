package kotlin.reflect.jvm.internal.impl.types.model;

import com.ss.android.socialbase.downloader.downloader.AbstractC60044a;
import com.ss.android.vesdk.p3188b.C63954b;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.jvm.internal.impl.types.model.TypeSystemOptimizationContext;

public interface TypeSystemContext extends TypeSystemOptimizationContext {
    int argumentsCount(KotlinTypeMarker kotlinTypeMarker);

    TypeArgumentListMarker asArgumentList(SimpleTypeMarker simpleTypeMarker);

    CapturedTypeMarker asCapturedType(SimpleTypeMarker simpleTypeMarker);

    DefinitelyNotNullTypeMarker asDefinitelyNotNullType(SimpleTypeMarker simpleTypeMarker);

    DynamicTypeMarker asDynamicType(FlexibleTypeMarker flexibleTypeMarker);

    FlexibleTypeMarker asFlexibleType(KotlinTypeMarker kotlinTypeMarker);

    SimpleTypeMarker asSimpleType(KotlinTypeMarker kotlinTypeMarker);

    TypeArgumentMarker asTypeArgument(KotlinTypeMarker kotlinTypeMarker);

    SimpleTypeMarker captureFromArguments(SimpleTypeMarker simpleTypeMarker, CaptureStatus captureStatus);

    TypeArgumentMarker get(TypeArgumentListMarker typeArgumentListMarker, int i);

    TypeArgumentMarker getArgument(KotlinTypeMarker kotlinTypeMarker, int i);

    TypeParameterMarker getParameter(TypeConstructorMarker typeConstructorMarker, int i);

    KotlinTypeMarker getType(TypeArgumentMarker typeArgumentMarker);

    TypeVariance getVariance(TypeArgumentMarker typeArgumentMarker);

    TypeVariance getVariance(TypeParameterMarker typeParameterMarker);

    KotlinTypeMarker intersectTypes(List<? extends KotlinTypeMarker> list);

    boolean isAnyConstructor(TypeConstructorMarker typeConstructorMarker);

    boolean isClassTypeConstructor(TypeConstructorMarker typeConstructorMarker);

    boolean isCommonFinalClassConstructor(TypeConstructorMarker typeConstructorMarker);

    boolean isDenotable(TypeConstructorMarker typeConstructorMarker);

    boolean isEqualTypeConstructors(TypeConstructorMarker typeConstructorMarker, TypeConstructorMarker typeConstructorMarker2);

    boolean isError(KotlinTypeMarker kotlinTypeMarker);

    boolean isIntegerLiteralTypeConstructor(TypeConstructorMarker typeConstructorMarker);

    boolean isIntersection(TypeConstructorMarker typeConstructorMarker);

    boolean isMarkedNullable(SimpleTypeMarker simpleTypeMarker);

    boolean isNothingConstructor(TypeConstructorMarker typeConstructorMarker);

    boolean isNullableType(KotlinTypeMarker kotlinTypeMarker);

    boolean isPrimitiveType(SimpleTypeMarker simpleTypeMarker);

    boolean isSingleClassifierType(SimpleTypeMarker simpleTypeMarker);

    boolean isStarProjection(TypeArgumentMarker typeArgumentMarker);

    boolean isStubType(SimpleTypeMarker simpleTypeMarker);

    SimpleTypeMarker lowerBound(FlexibleTypeMarker flexibleTypeMarker);

    SimpleTypeMarker lowerBoundIfFlexible(KotlinTypeMarker kotlinTypeMarker);

    KotlinTypeMarker lowerType(CapturedTypeMarker capturedTypeMarker);

    int parametersCount(TypeConstructorMarker typeConstructorMarker);

    Collection<KotlinTypeMarker> possibleIntegerTypes(SimpleTypeMarker simpleTypeMarker);

    int size(TypeArgumentListMarker typeArgumentListMarker);

    Collection<KotlinTypeMarker> supertypes(TypeConstructorMarker typeConstructorMarker);

    TypeConstructorMarker typeConstructor(KotlinTypeMarker kotlinTypeMarker);

    TypeConstructorMarker typeConstructor(SimpleTypeMarker simpleTypeMarker);

    SimpleTypeMarker upperBound(FlexibleTypeMarker flexibleTypeMarker);

    SimpleTypeMarker upperBoundIfFlexible(KotlinTypeMarker kotlinTypeMarker);

    SimpleTypeMarker withNullability(SimpleTypeMarker simpleTypeMarker, boolean z);

    public static final class DefaultImpls {
        public static List<SimpleTypeMarker> fastCorrespondingSupertypes(TypeSystemContext typeSystemContext, SimpleTypeMarker simpleTypeMarker, TypeConstructorMarker typeConstructorMarker) {
            Intrinsics.checkParameterIsNotNull(simpleTypeMarker, "$this$fastCorrespondingSupertypes");
            Intrinsics.checkParameterIsNotNull(typeConstructorMarker, "constructor");
            return null;
        }

        public static boolean identicalArguments(TypeSystemContext typeSystemContext, SimpleTypeMarker simpleTypeMarker, SimpleTypeMarker simpleTypeMarker2) {
            Intrinsics.checkParameterIsNotNull(simpleTypeMarker, AbstractC60044a.f149675a);
            Intrinsics.checkParameterIsNotNull(simpleTypeMarker2, C63954b.f161494a);
            return TypeSystemOptimizationContext.DefaultImpls.identicalArguments(typeSystemContext, simpleTypeMarker, simpleTypeMarker2);
        }

        public static boolean isClassType(TypeSystemContext typeSystemContext, SimpleTypeMarker simpleTypeMarker) {
            Intrinsics.checkParameterIsNotNull(simpleTypeMarker, "$this$isClassType");
            return typeSystemContext.isClassTypeConstructor(typeSystemContext.typeConstructor(simpleTypeMarker));
        }

        public static boolean isIntegerLiteralType(TypeSystemContext typeSystemContext, SimpleTypeMarker simpleTypeMarker) {
            Intrinsics.checkParameterIsNotNull(simpleTypeMarker, "$this$isIntegerLiteralType");
            return typeSystemContext.isIntegerLiteralTypeConstructor(typeSystemContext.typeConstructor(simpleTypeMarker));
        }

        public static boolean hasFlexibleNullability(TypeSystemContext typeSystemContext, KotlinTypeMarker kotlinTypeMarker) {
            Intrinsics.checkParameterIsNotNull(kotlinTypeMarker, "$this$hasFlexibleNullability");
            if (typeSystemContext.isMarkedNullable(typeSystemContext.lowerBoundIfFlexible(kotlinTypeMarker)) != typeSystemContext.isMarkedNullable(typeSystemContext.upperBoundIfFlexible(kotlinTypeMarker))) {
                return true;
            }
            return false;
        }

        public static boolean isDefinitelyNotNullType(TypeSystemContext typeSystemContext, KotlinTypeMarker kotlinTypeMarker) {
            DefinitelyNotNullTypeMarker definitelyNotNullTypeMarker;
            Intrinsics.checkParameterIsNotNull(kotlinTypeMarker, "$this$isDefinitelyNotNullType");
            SimpleTypeMarker asSimpleType = typeSystemContext.asSimpleType(kotlinTypeMarker);
            if (asSimpleType != null) {
                definitelyNotNullTypeMarker = typeSystemContext.asDefinitelyNotNullType(asSimpleType);
            } else {
                definitelyNotNullTypeMarker = null;
            }
            if (definitelyNotNullTypeMarker != null) {
                return true;
            }
            return false;
        }

        public static boolean isDynamic(TypeSystemContext typeSystemContext, KotlinTypeMarker kotlinTypeMarker) {
            DynamicTypeMarker dynamicTypeMarker;
            Intrinsics.checkParameterIsNotNull(kotlinTypeMarker, "$this$isDynamic");
            FlexibleTypeMarker asFlexibleType = typeSystemContext.asFlexibleType(kotlinTypeMarker);
            if (asFlexibleType != null) {
                dynamicTypeMarker = typeSystemContext.asDynamicType(asFlexibleType);
            } else {
                dynamicTypeMarker = null;
            }
            if (dynamicTypeMarker != null) {
                return true;
            }
            return false;
        }

        public static boolean isNothing(TypeSystemContext typeSystemContext, KotlinTypeMarker kotlinTypeMarker) {
            Intrinsics.checkParameterIsNotNull(kotlinTypeMarker, "$this$isNothing");
            if (!typeSystemContext.isNothingConstructor(typeSystemContext.typeConstructor(kotlinTypeMarker)) || typeSystemContext.isNullableType(kotlinTypeMarker)) {
                return false;
            }
            return true;
        }

        public static SimpleTypeMarker lowerBoundIfFlexible(TypeSystemContext typeSystemContext, KotlinTypeMarker kotlinTypeMarker) {
            SimpleTypeMarker simpleTypeMarker;
            Intrinsics.checkParameterIsNotNull(kotlinTypeMarker, "$this$lowerBoundIfFlexible");
            FlexibleTypeMarker asFlexibleType = typeSystemContext.asFlexibleType(kotlinTypeMarker);
            if ((asFlexibleType == null || (simpleTypeMarker = typeSystemContext.lowerBound(asFlexibleType)) == null) && (simpleTypeMarker = typeSystemContext.asSimpleType(kotlinTypeMarker)) == null) {
                Intrinsics.throwNpe();
            }
            return simpleTypeMarker;
        }

        public static TypeConstructorMarker typeConstructor(TypeSystemContext typeSystemContext, KotlinTypeMarker kotlinTypeMarker) {
            Intrinsics.checkParameterIsNotNull(kotlinTypeMarker, "$this$typeConstructor");
            SimpleTypeMarker asSimpleType = typeSystemContext.asSimpleType(kotlinTypeMarker);
            if (asSimpleType == null) {
                asSimpleType = typeSystemContext.lowerBoundIfFlexible(kotlinTypeMarker);
            }
            return typeSystemContext.typeConstructor(asSimpleType);
        }

        public static SimpleTypeMarker upperBoundIfFlexible(TypeSystemContext typeSystemContext, KotlinTypeMarker kotlinTypeMarker) {
            SimpleTypeMarker simpleTypeMarker;
            Intrinsics.checkParameterIsNotNull(kotlinTypeMarker, "$this$upperBoundIfFlexible");
            FlexibleTypeMarker asFlexibleType = typeSystemContext.asFlexibleType(kotlinTypeMarker);
            if ((asFlexibleType == null || (simpleTypeMarker = typeSystemContext.upperBound(asFlexibleType)) == null) && (simpleTypeMarker = typeSystemContext.asSimpleType(kotlinTypeMarker)) == null) {
                Intrinsics.throwNpe();
            }
            return simpleTypeMarker;
        }

        public static int size(TypeSystemContext typeSystemContext, TypeArgumentListMarker typeArgumentListMarker) {
            Intrinsics.checkParameterIsNotNull(typeArgumentListMarker, "$this$size");
            if (typeArgumentListMarker instanceof SimpleTypeMarker) {
                return typeSystemContext.argumentsCount((KotlinTypeMarker) typeArgumentListMarker);
            }
            if (typeArgumentListMarker instanceof ArgumentList) {
                return ((ArgumentList) typeArgumentListMarker).size();
            }
            throw new IllegalStateException(("unknown type argument list type: " + typeArgumentListMarker + ", " + Reflection.getOrCreateKotlinClass(typeArgumentListMarker.getClass())).toString());
        }

        public static TypeArgumentMarker getArgumentOrNull(TypeSystemContext typeSystemContext, SimpleTypeMarker simpleTypeMarker, int i) {
            Intrinsics.checkParameterIsNotNull(simpleTypeMarker, "$this$getArgumentOrNull");
            SimpleTypeMarker simpleTypeMarker2 = simpleTypeMarker;
            int argumentsCount = typeSystemContext.argumentsCount(simpleTypeMarker2);
            if (i >= 0 && argumentsCount > i) {
                return typeSystemContext.getArgument(simpleTypeMarker2, i);
            }
            return null;
        }

        public static TypeArgumentMarker get(TypeSystemContext typeSystemContext, TypeArgumentListMarker typeArgumentListMarker, int i) {
            Intrinsics.checkParameterIsNotNull(typeArgumentListMarker, "$this$get");
            if (typeArgumentListMarker instanceof SimpleTypeMarker) {
                return typeSystemContext.getArgument((KotlinTypeMarker) typeArgumentListMarker, i);
            }
            if (typeArgumentListMarker instanceof ArgumentList) {
                Object obj = ((ArgumentList) typeArgumentListMarker).get(i);
                Intrinsics.checkExpressionValueIsNotNull(obj, "get(index)");
                return (TypeArgumentMarker) obj;
            }
            throw new IllegalStateException(("unknown type argument list type: " + typeArgumentListMarker + ", " + Reflection.getOrCreateKotlinClass(typeArgumentListMarker.getClass())).toString());
        }
    }
}
