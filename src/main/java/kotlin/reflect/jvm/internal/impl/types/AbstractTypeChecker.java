package kotlin.reflect.jvm.internal.impl.types;

import com.ss.android.socialbase.downloader.downloader.AbstractC60044a;
import com.ss.android.vesdk.p3188b.C63954b;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin._Assertions;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.AbstractTypeCheckerContext;
import kotlin.reflect.jvm.internal.impl.types.model.ArgumentList;
import kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus;
import kotlin.reflect.jvm.internal.impl.types.model.CapturedTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentListMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeVariance;
import kotlin.reflect.jvm.internal.impl.utils.SmartList;

public final class AbstractTypeChecker {
    public static final AbstractTypeChecker INSTANCE = new AbstractTypeChecker();
    public static boolean RUN_SLOW_ASSERTIONS;

    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[TypeVariance.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[TypeVariance.INV.ordinal()] = 1;
            iArr[TypeVariance.OUT.ordinal()] = 2;
            iArr[TypeVariance.IN.ordinal()] = 3;
            int[] iArr2 = new int[AbstractTypeCheckerContext.LowerCapturedTypePolicy.values().length];
            $EnumSwitchMapping$1 = iArr2;
            iArr2[AbstractTypeCheckerContext.LowerCapturedTypePolicy.CHECK_ONLY_LOWER.ordinal()] = 1;
            iArr2[AbstractTypeCheckerContext.LowerCapturedTypePolicy.CHECK_SUBTYPE_AND_LOWER.ordinal()] = 2;
            iArr2[AbstractTypeCheckerContext.LowerCapturedTypePolicy.SKIP_LOWER.ordinal()] = 3;
        }
    }

    private AbstractTypeChecker() {
    }

    public final TypeVariance effectiveVariance(TypeVariance typeVariance, TypeVariance typeVariance2) {
        Intrinsics.checkParameterIsNotNull(typeVariance, "declared");
        Intrinsics.checkParameterIsNotNull(typeVariance2, "useSite");
        if (typeVariance == TypeVariance.INV) {
            return typeVariance2;
        }
        if (typeVariance2 == TypeVariance.INV || typeVariance == typeVariance2) {
            return typeVariance;
        }
        return null;
    }

    private final boolean isCommonDenotableType(AbstractTypeCheckerContext abstractTypeCheckerContext, KotlinTypeMarker kotlinTypeMarker) {
        if (!abstractTypeCheckerContext.isDenotable(abstractTypeCheckerContext.typeConstructor(kotlinTypeMarker)) || abstractTypeCheckerContext.isDynamic(kotlinTypeMarker) || abstractTypeCheckerContext.isDefinitelyNotNullType(kotlinTypeMarker) || !Intrinsics.areEqual(abstractTypeCheckerContext.typeConstructor(abstractTypeCheckerContext.lowerBoundIfFlexible(kotlinTypeMarker)), abstractTypeCheckerContext.typeConstructor(abstractTypeCheckerContext.upperBoundIfFlexible(kotlinTypeMarker)))) {
            return false;
        }
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r12v0, resolved type: java.util.List<? extends kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker> */
    /* JADX WARN: Multi-variable type inference failed */
    private final List<SimpleTypeMarker> selectOnlyPureKotlinSupertypes(AbstractTypeCheckerContext abstractTypeCheckerContext, List<? extends SimpleTypeMarker> list) {
        boolean z;
        if (list.size() < 2) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            boolean z2 = true;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            TypeArgumentListMarker asArgumentList = abstractTypeCheckerContext.asArgumentList((SimpleTypeMarker) next);
            AbstractTypeCheckerContext abstractTypeCheckerContext2 = abstractTypeCheckerContext;
            int size = abstractTypeCheckerContext2.size(asArgumentList);
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                }
                if (abstractTypeCheckerContext.asFlexibleType(abstractTypeCheckerContext.getType(abstractTypeCheckerContext2.get(asArgumentList, i))) == null) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    z2 = false;
                    break;
                }
                i++;
            }
            if (z2) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = arrayList;
        return arrayList2.isEmpty() ^ true ? arrayList2 : list;
    }

    private final boolean hasNothingSupertype(AbstractTypeCheckerContext abstractTypeCheckerContext, SimpleTypeMarker simpleTypeMarker) {
        AbstractTypeCheckerContext.SupertypesPolicy.LowerIfFlexible lowerIfFlexible;
        TypeConstructorMarker typeConstructor = abstractTypeCheckerContext.typeConstructor(simpleTypeMarker);
        if (abstractTypeCheckerContext.isClassTypeConstructor(typeConstructor)) {
            return abstractTypeCheckerContext.isNothingConstructor(typeConstructor);
        }
        if (abstractTypeCheckerContext.isNothingConstructor(abstractTypeCheckerContext.typeConstructor(simpleTypeMarker))) {
            return true;
        }
        abstractTypeCheckerContext.initialize();
        ArrayDeque<SimpleTypeMarker> supertypesDeque = abstractTypeCheckerContext.getSupertypesDeque();
        if (supertypesDeque == null) {
            Intrinsics.throwNpe();
        }
        Set<SimpleTypeMarker> supertypesSet = abstractTypeCheckerContext.getSupertypesSet();
        if (supertypesSet == null) {
            Intrinsics.throwNpe();
        }
        supertypesDeque.push(simpleTypeMarker);
        while (!supertypesDeque.isEmpty()) {
            if (supertypesSet.size() <= 1000) {
                SimpleTypeMarker pop = supertypesDeque.pop();
                Intrinsics.checkExpressionValueIsNotNull(pop, "current");
                if (supertypesSet.add(pop)) {
                    if (abstractTypeCheckerContext.isClassType(pop)) {
                        lowerIfFlexible = AbstractTypeCheckerContext.SupertypesPolicy.None.INSTANCE;
                    } else {
                        lowerIfFlexible = AbstractTypeCheckerContext.SupertypesPolicy.LowerIfFlexible.INSTANCE;
                    }
                    if (!(!Intrinsics.areEqual(lowerIfFlexible, AbstractTypeCheckerContext.SupertypesPolicy.None.INSTANCE))) {
                        lowerIfFlexible = null;
                    }
                    if (lowerIfFlexible != null) {
                        for (KotlinTypeMarker kotlinTypeMarker : abstractTypeCheckerContext.supertypes(abstractTypeCheckerContext.typeConstructor(pop))) {
                            SimpleTypeMarker transformType = lowerIfFlexible.transformType(abstractTypeCheckerContext, kotlinTypeMarker);
                            if (abstractTypeCheckerContext.isNothingConstructor(abstractTypeCheckerContext.typeConstructor(transformType))) {
                                abstractTypeCheckerContext.clear();
                                return true;
                            }
                            supertypesDeque.add(transformType);
                        }
                        continue;
                    } else {
                        continue;
                    }
                }
            } else {
                throw new IllegalStateException(("Too many supertypes for type: " + simpleTypeMarker + ". Supertypes = " + CollectionsKt.joinToString$default(supertypesSet, null, null, null, 0, null, null, 63, null)).toString());
            }
        }
        abstractTypeCheckerContext.clear();
        return false;
    }

    private final List<SimpleTypeMarker> collectAndFilter(AbstractTypeCheckerContext abstractTypeCheckerContext, SimpleTypeMarker simpleTypeMarker, TypeConstructorMarker typeConstructorMarker) {
        return selectOnlyPureKotlinSupertypes(abstractTypeCheckerContext, collectAllSupertypesWithGivenTypeConstructor(abstractTypeCheckerContext, simpleTypeMarker, typeConstructorMarker));
    }

    private final boolean completeIsSubTypeOf(AbstractTypeCheckerContext abstractTypeCheckerContext, KotlinTypeMarker kotlinTypeMarker, KotlinTypeMarker kotlinTypeMarker2) {
        Boolean checkSubtypeForSpecialCases = checkSubtypeForSpecialCases(abstractTypeCheckerContext, abstractTypeCheckerContext.lowerBoundIfFlexible(kotlinTypeMarker), abstractTypeCheckerContext.upperBoundIfFlexible(kotlinTypeMarker2));
        if (checkSubtypeForSpecialCases != null) {
            boolean booleanValue = checkSubtypeForSpecialCases.booleanValue();
            abstractTypeCheckerContext.addSubtypeConstraint(kotlinTypeMarker, kotlinTypeMarker2);
            return booleanValue;
        }
        Boolean addSubtypeConstraint = abstractTypeCheckerContext.addSubtypeConstraint(kotlinTypeMarker, kotlinTypeMarker2);
        if (addSubtypeConstraint != null) {
            return addSubtypeConstraint.booleanValue();
        }
        return isSubtypeOfForSingleClassifierType(abstractTypeCheckerContext, abstractTypeCheckerContext.lowerBoundIfFlexible(kotlinTypeMarker), abstractTypeCheckerContext.upperBoundIfFlexible(kotlinTypeMarker2));
    }

    public final boolean isSubtypeOf(AbstractTypeCheckerContext abstractTypeCheckerContext, KotlinTypeMarker kotlinTypeMarker, KotlinTypeMarker kotlinTypeMarker2) {
        Intrinsics.checkParameterIsNotNull(abstractTypeCheckerContext, "context");
        Intrinsics.checkParameterIsNotNull(kotlinTypeMarker, "subType");
        Intrinsics.checkParameterIsNotNull(kotlinTypeMarker2, "superType");
        if (kotlinTypeMarker == kotlinTypeMarker2) {
            return true;
        }
        return INSTANCE.completeIsSubTypeOf(abstractTypeCheckerContext, abstractTypeCheckerContext.prepareType(abstractTypeCheckerContext.refineType(kotlinTypeMarker)), abstractTypeCheckerContext.prepareType(abstractTypeCheckerContext.refineType(kotlinTypeMarker2)));
    }

    private final Boolean checkSubtypeForIntegerLiteralType(AbstractTypeCheckerContext abstractTypeCheckerContext, SimpleTypeMarker simpleTypeMarker, SimpleTypeMarker simpleTypeMarker2) {
        if (!abstractTypeCheckerContext.isIntegerLiteralType(simpleTypeMarker) && !abstractTypeCheckerContext.isIntegerLiteralType(simpleTypeMarker2)) {
            return null;
        }
        AbstractTypeChecker$checkSubtypeForIntegerLiteralType$1 abstractTypeChecker$checkSubtypeForIntegerLiteralType$1 = new AbstractTypeChecker$checkSubtypeForIntegerLiteralType$1(abstractTypeCheckerContext);
        if (abstractTypeCheckerContext.isIntegerLiteralType(simpleTypeMarker) && abstractTypeCheckerContext.isIntegerLiteralType(simpleTypeMarker2)) {
            return true;
        }
        if (abstractTypeCheckerContext.isIntegerLiteralType(simpleTypeMarker)) {
            if (abstractTypeChecker$checkSubtypeForIntegerLiteralType$1.invoke(simpleTypeMarker, simpleTypeMarker2, false)) {
                return true;
            }
        } else if (abstractTypeCheckerContext.isIntegerLiteralType(simpleTypeMarker2) && abstractTypeChecker$checkSubtypeForIntegerLiteralType$1.invoke(simpleTypeMarker2, simpleTypeMarker, true)) {
            return true;
        }
        return null;
    }

    public final boolean equalTypes(AbstractTypeCheckerContext abstractTypeCheckerContext, KotlinTypeMarker kotlinTypeMarker, KotlinTypeMarker kotlinTypeMarker2) {
        Intrinsics.checkParameterIsNotNull(abstractTypeCheckerContext, "context");
        Intrinsics.checkParameterIsNotNull(kotlinTypeMarker, AbstractC60044a.f149675a);
        Intrinsics.checkParameterIsNotNull(kotlinTypeMarker2, C63954b.f161494a);
        if (kotlinTypeMarker == kotlinTypeMarker2) {
            return true;
        }
        AbstractTypeChecker abstractTypeChecker = INSTANCE;
        if (abstractTypeChecker.isCommonDenotableType(abstractTypeCheckerContext, kotlinTypeMarker) && abstractTypeChecker.isCommonDenotableType(abstractTypeCheckerContext, kotlinTypeMarker2)) {
            KotlinTypeMarker refineType = abstractTypeCheckerContext.refineType(kotlinTypeMarker);
            KotlinTypeMarker refineType2 = abstractTypeCheckerContext.refineType(kotlinTypeMarker2);
            SimpleTypeMarker lowerBoundIfFlexible = abstractTypeCheckerContext.lowerBoundIfFlexible(refineType);
            if (!abstractTypeCheckerContext.areEqualTypeConstructors(abstractTypeCheckerContext.typeConstructor(refineType), abstractTypeCheckerContext.typeConstructor(refineType2))) {
                return false;
            }
            if (abstractTypeCheckerContext.argumentsCount(lowerBoundIfFlexible) == 0) {
                if (abstractTypeCheckerContext.hasFlexibleNullability(refineType) || abstractTypeCheckerContext.hasFlexibleNullability(refineType2) || abstractTypeCheckerContext.isMarkedNullable(lowerBoundIfFlexible) == abstractTypeCheckerContext.isMarkedNullable(abstractTypeCheckerContext.lowerBoundIfFlexible(refineType2))) {
                    return true;
                }
                return false;
            }
        }
        if (!abstractTypeChecker.isSubtypeOf(abstractTypeCheckerContext, kotlinTypeMarker, kotlinTypeMarker2) || !abstractTypeChecker.isSubtypeOf(abstractTypeCheckerContext, kotlinTypeMarker2, kotlinTypeMarker)) {
            return false;
        }
        return true;
    }

    private final Boolean checkSubtypeForSpecialCases(AbstractTypeCheckerContext abstractTypeCheckerContext, SimpleTypeMarker simpleTypeMarker, SimpleTypeMarker simpleTypeMarker2) {
        KotlinTypeMarker kotlinTypeMarker;
        SimpleTypeMarker simpleTypeMarker3 = simpleTypeMarker;
        boolean z = false;
        if (abstractTypeCheckerContext.isError(simpleTypeMarker3) || abstractTypeCheckerContext.isError(simpleTypeMarker2)) {
            if (abstractTypeCheckerContext.isErrorTypeEqualsToAnything()) {
                return true;
            }
            if (!abstractTypeCheckerContext.isMarkedNullable(simpleTypeMarker) || abstractTypeCheckerContext.isMarkedNullable(simpleTypeMarker2)) {
                return Boolean.valueOf(AbstractStrictEqualityTypeChecker.INSTANCE.strictEqualTypes(abstractTypeCheckerContext, abstractTypeCheckerContext.withNullability(simpleTypeMarker, false), abstractTypeCheckerContext.withNullability(simpleTypeMarker2, false)));
            }
            return false;
        } else if (abstractTypeCheckerContext.isStubType(simpleTypeMarker) || abstractTypeCheckerContext.isStubType(simpleTypeMarker2)) {
            return Boolean.valueOf(abstractTypeCheckerContext.isStubTypeEqualsToAnything());
        } else {
            CapturedTypeMarker asCapturedType = abstractTypeCheckerContext.asCapturedType(simpleTypeMarker2);
            if (asCapturedType != null) {
                kotlinTypeMarker = abstractTypeCheckerContext.lowerType(asCapturedType);
            } else {
                kotlinTypeMarker = null;
            }
            if (!(asCapturedType == null || kotlinTypeMarker == null)) {
                int i = WhenMappings.$EnumSwitchMapping$1[abstractTypeCheckerContext.getLowerCapturedTypePolicy(simpleTypeMarker, asCapturedType).ordinal()];
                if (i == 1) {
                    return Boolean.valueOf(isSubtypeOf(abstractTypeCheckerContext, simpleTypeMarker3, kotlinTypeMarker));
                }
                if (i == 2 && isSubtypeOf(abstractTypeCheckerContext, simpleTypeMarker3, kotlinTypeMarker)) {
                    return true;
                }
            }
            TypeConstructorMarker typeConstructor = abstractTypeCheckerContext.typeConstructor(simpleTypeMarker2);
            if (!abstractTypeCheckerContext.isIntersection(typeConstructor)) {
                return null;
            }
            boolean z2 = !abstractTypeCheckerContext.isMarkedNullable(simpleTypeMarker2);
            if (!_Assertions.f173221a || z2) {
                Collection<KotlinTypeMarker> supertypes = abstractTypeCheckerContext.supertypes(typeConstructor);
                if (!(supertypes instanceof Collection) || !supertypes.isEmpty()) {
                    Iterator<T> it = supertypes.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        if (!INSTANCE.isSubtypeOf(abstractTypeCheckerContext, simpleTypeMarker3, it.next())) {
                            break;
                        }
                    }
                }
                z = true;
                return Boolean.valueOf(z);
            }
            throw new AssertionError("Intersection type should not be marked nullable!: " + simpleTypeMarker2);
        }
    }

    public final boolean isSubtypeForSameConstructor(AbstractTypeCheckerContext abstractTypeCheckerContext, TypeArgumentListMarker typeArgumentListMarker, SimpleTypeMarker simpleTypeMarker) {
        boolean z;
        boolean z2;
        Intrinsics.checkParameterIsNotNull(abstractTypeCheckerContext, "$this$isSubtypeForSameConstructor");
        Intrinsics.checkParameterIsNotNull(typeArgumentListMarker, "capturedSubArguments");
        Intrinsics.checkParameterIsNotNull(simpleTypeMarker, "superType");
        TypeConstructorMarker typeConstructor = abstractTypeCheckerContext.typeConstructor(simpleTypeMarker);
        int parametersCount = abstractTypeCheckerContext.parametersCount(typeConstructor);
        for (int i = 0; i < parametersCount; i++) {
            TypeArgumentMarker argument = abstractTypeCheckerContext.getArgument(simpleTypeMarker, i);
            if (!abstractTypeCheckerContext.isStarProjection(argument)) {
                KotlinTypeMarker type = abstractTypeCheckerContext.getType(argument);
                TypeArgumentMarker typeArgumentMarker = abstractTypeCheckerContext.get(typeArgumentListMarker, i);
                if (abstractTypeCheckerContext.getVariance(typeArgumentMarker) == TypeVariance.INV) {
                    z = true;
                } else {
                    z = false;
                }
                if (!_Assertions.f173221a || z) {
                    KotlinTypeMarker type2 = abstractTypeCheckerContext.getType(typeArgumentMarker);
                    TypeVariance effectiveVariance = effectiveVariance(abstractTypeCheckerContext.getVariance(abstractTypeCheckerContext.getParameter(typeConstructor, i)), abstractTypeCheckerContext.getVariance(argument));
                    if (effectiveVariance == null) {
                        return abstractTypeCheckerContext.isErrorTypeEqualsToAnything();
                    }
                    if (abstractTypeCheckerContext.argumentsDepth <= 100) {
                        abstractTypeCheckerContext.argumentsDepth++;
                        int i2 = WhenMappings.$EnumSwitchMapping$0[effectiveVariance.ordinal()];
                        if (i2 == 1) {
                            z2 = INSTANCE.equalTypes(abstractTypeCheckerContext, type2, type);
                        } else if (i2 == 2) {
                            z2 = INSTANCE.isSubtypeOf(abstractTypeCheckerContext, type2, type);
                        } else if (i2 == 3) {
                            z2 = INSTANCE.isSubtypeOf(abstractTypeCheckerContext, type, type2);
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                        abstractTypeCheckerContext.argumentsDepth--;
                        if (!z2) {
                            return false;
                        }
                    } else {
                        throw new IllegalStateException(("Arguments depth is too high. Some related argument: " + type2).toString());
                    }
                } else {
                    throw new AssertionError("Incorrect sub argument: " + typeArgumentMarker);
                }
            }
        }
        return true;
    }

    private final List<SimpleTypeMarker> collectAllSupertypesWithGivenTypeConstructor(AbstractTypeCheckerContext abstractTypeCheckerContext, SimpleTypeMarker simpleTypeMarker, TypeConstructorMarker typeConstructorMarker) {
        AbstractTypeCheckerContext.SupertypesPolicy.LowerIfFlexible lowerIfFlexible;
        List<SimpleTypeMarker> fastCorrespondingSupertypes = abstractTypeCheckerContext.fastCorrespondingSupertypes(simpleTypeMarker, typeConstructorMarker);
        if (fastCorrespondingSupertypes != null) {
            return fastCorrespondingSupertypes;
        }
        if (!abstractTypeCheckerContext.isClassTypeConstructor(typeConstructorMarker) && abstractTypeCheckerContext.isClassType(simpleTypeMarker)) {
            return CollectionsKt.emptyList();
        }
        if (!abstractTypeCheckerContext.isCommonFinalClassConstructor(typeConstructorMarker)) {
            SmartList smartList = new SmartList();
            abstractTypeCheckerContext.initialize();
            ArrayDeque<SimpleTypeMarker> supertypesDeque = abstractTypeCheckerContext.getSupertypesDeque();
            if (supertypesDeque == null) {
                Intrinsics.throwNpe();
            }
            Set<SimpleTypeMarker> supertypesSet = abstractTypeCheckerContext.getSupertypesSet();
            if (supertypesSet == null) {
                Intrinsics.throwNpe();
            }
            supertypesDeque.push(simpleTypeMarker);
            while (!supertypesDeque.isEmpty()) {
                if (supertypesSet.size() <= 1000) {
                    SimpleTypeMarker pop = supertypesDeque.pop();
                    Intrinsics.checkExpressionValueIsNotNull(pop, "current");
                    if (supertypesSet.add(pop)) {
                        SimpleTypeMarker captureFromArguments = abstractTypeCheckerContext.captureFromArguments(pop, CaptureStatus.FOR_SUBTYPING);
                        if (captureFromArguments == null) {
                            captureFromArguments = pop;
                        }
                        if (abstractTypeCheckerContext.areEqualTypeConstructors(abstractTypeCheckerContext.typeConstructor(captureFromArguments), typeConstructorMarker)) {
                            smartList.add(captureFromArguments);
                            lowerIfFlexible = AbstractTypeCheckerContext.SupertypesPolicy.None.INSTANCE;
                        } else if (abstractTypeCheckerContext.argumentsCount(captureFromArguments) == 0) {
                            lowerIfFlexible = AbstractTypeCheckerContext.SupertypesPolicy.LowerIfFlexible.INSTANCE;
                        } else {
                            lowerIfFlexible = abstractTypeCheckerContext.substitutionSupertypePolicy(captureFromArguments);
                        }
                        if (!(!Intrinsics.areEqual(lowerIfFlexible, AbstractTypeCheckerContext.SupertypesPolicy.None.INSTANCE))) {
                            lowerIfFlexible = null;
                        }
                        if (lowerIfFlexible != null) {
                            for (KotlinTypeMarker kotlinTypeMarker : abstractTypeCheckerContext.supertypes(abstractTypeCheckerContext.typeConstructor(pop))) {
                                supertypesDeque.add(lowerIfFlexible.transformType(abstractTypeCheckerContext, kotlinTypeMarker));
                            }
                        }
                    }
                } else {
                    throw new IllegalStateException(("Too many supertypes for type: " + simpleTypeMarker + ". Supertypes = " + CollectionsKt.joinToString$default(supertypesSet, null, null, null, 0, null, null, 63, null)).toString());
                }
            }
            abstractTypeCheckerContext.clear();
            return smartList;
        } else if (!abstractTypeCheckerContext.areEqualTypeConstructors(abstractTypeCheckerContext.typeConstructor(simpleTypeMarker), typeConstructorMarker)) {
            return CollectionsKt.emptyList();
        } else {
            SimpleTypeMarker captureFromArguments2 = abstractTypeCheckerContext.captureFromArguments(simpleTypeMarker, CaptureStatus.FOR_SUBTYPING);
            if (captureFromArguments2 != null) {
                simpleTypeMarker = captureFromArguments2;
            }
            return CollectionsKt.listOf(simpleTypeMarker);
        }
    }

    private final boolean isSubtypeOfForSingleClassifierType(AbstractTypeCheckerContext abstractTypeCheckerContext, SimpleTypeMarker simpleTypeMarker, SimpleTypeMarker simpleTypeMarker2) {
        boolean z;
        KotlinTypeMarker type;
        boolean z2;
        boolean z3;
        if (RUN_SLOW_ASSERTIONS) {
            if (abstractTypeCheckerContext.isSingleClassifierType(simpleTypeMarker) || abstractTypeCheckerContext.isIntersection(abstractTypeCheckerContext.typeConstructor(simpleTypeMarker)) || abstractTypeCheckerContext.isAllowedTypeVariable(simpleTypeMarker)) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!_Assertions.f173221a || z2) {
                if (abstractTypeCheckerContext.isSingleClassifierType(simpleTypeMarker2) || abstractTypeCheckerContext.isAllowedTypeVariable(simpleTypeMarker2)) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (_Assertions.f173221a && !z3) {
                    throw new AssertionError("Not singleClassifierType superType: " + simpleTypeMarker2);
                }
            } else {
                throw new AssertionError("Not singleClassifierType and not intersection subType: " + simpleTypeMarker);
            }
        }
        if (!AbstractNullabilityChecker.INSTANCE.isPossibleSubtype(abstractTypeCheckerContext, simpleTypeMarker, simpleTypeMarker2)) {
            return false;
        }
        SimpleTypeMarker simpleTypeMarker3 = simpleTypeMarker;
        SimpleTypeMarker simpleTypeMarker4 = simpleTypeMarker2;
        Boolean checkSubtypeForIntegerLiteralType = checkSubtypeForIntegerLiteralType(abstractTypeCheckerContext, abstractTypeCheckerContext.lowerBoundIfFlexible(simpleTypeMarker3), abstractTypeCheckerContext.upperBoundIfFlexible(simpleTypeMarker4));
        if (checkSubtypeForIntegerLiteralType != null) {
            boolean booleanValue = checkSubtypeForIntegerLiteralType.booleanValue();
            abstractTypeCheckerContext.addSubtypeConstraint(simpleTypeMarker3, simpleTypeMarker4);
            return booleanValue;
        }
        TypeConstructorMarker typeConstructor = abstractTypeCheckerContext.typeConstructor(simpleTypeMarker2);
        if ((abstractTypeCheckerContext.isEqualTypeConstructors(abstractTypeCheckerContext.typeConstructor(simpleTypeMarker), typeConstructor) && abstractTypeCheckerContext.parametersCount(typeConstructor) == 0) || abstractTypeCheckerContext.isAnyConstructor(abstractTypeCheckerContext.typeConstructor(simpleTypeMarker2))) {
            return true;
        }
        List<SimpleTypeMarker> findCorrespondingSupertypes = findCorrespondingSupertypes(abstractTypeCheckerContext, simpleTypeMarker, typeConstructor);
        int size = findCorrespondingSupertypes.size();
        if (size == 0) {
            return hasNothingSupertype(abstractTypeCheckerContext, simpleTypeMarker);
        }
        if (size == 1) {
            return isSubtypeForSameConstructor(abstractTypeCheckerContext, abstractTypeCheckerContext.asArgumentList((SimpleTypeMarker) CollectionsKt.first((List) findCorrespondingSupertypes)), simpleTypeMarker2);
        }
        ArgumentList argumentList = new ArgumentList(abstractTypeCheckerContext.parametersCount(typeConstructor));
        int parametersCount = abstractTypeCheckerContext.parametersCount(typeConstructor);
        boolean z4 = false;
        for (int i = 0; i < parametersCount; i++) {
            if (z4 || abstractTypeCheckerContext.getVariance(abstractTypeCheckerContext.getParameter(typeConstructor, i)) != TypeVariance.OUT) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (!z4) {
                List<SimpleTypeMarker> list = findCorrespondingSupertypes;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                for (T t : list) {
                    TypeArgumentMarker argumentOrNull = abstractTypeCheckerContext.getArgumentOrNull(t, i);
                    if (argumentOrNull != null) {
                        if (abstractTypeCheckerContext.getVariance(argumentOrNull) == TypeVariance.INV) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (!z) {
                            argumentOrNull = null;
                        }
                        if (!(argumentOrNull == null || (type = abstractTypeCheckerContext.getType(argumentOrNull)) == null)) {
                            arrayList.add(type);
                        }
                    }
                    throw new IllegalStateException(("Incorrect type: " + ((Object) t) + ", subType: " + simpleTypeMarker + ", superType: " + simpleTypeMarker2).toString());
                }
                argumentList.add(abstractTypeCheckerContext.asTypeArgument(abstractTypeCheckerContext.intersectTypes(arrayList)));
            }
        }
        if (!z4 && isSubtypeForSameConstructor(abstractTypeCheckerContext, argumentList, simpleTypeMarker2)) {
            return true;
        }
        List<SimpleTypeMarker> list2 = findCorrespondingSupertypes;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                if (INSTANCE.isSubtypeForSameConstructor(abstractTypeCheckerContext, abstractTypeCheckerContext.asArgumentList(it.next()), simpleTypeMarker2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final List<SimpleTypeMarker> findCorrespondingSupertypes(AbstractTypeCheckerContext abstractTypeCheckerContext, SimpleTypeMarker simpleTypeMarker, TypeConstructorMarker typeConstructorMarker) {
        AbstractTypeCheckerContext.SupertypesPolicy.LowerIfFlexible lowerIfFlexible;
        Intrinsics.checkParameterIsNotNull(abstractTypeCheckerContext, "$this$findCorrespondingSupertypes");
        Intrinsics.checkParameterIsNotNull(simpleTypeMarker, "subType");
        Intrinsics.checkParameterIsNotNull(typeConstructorMarker, "superConstructor");
        if (abstractTypeCheckerContext.isClassType(simpleTypeMarker)) {
            return collectAndFilter(abstractTypeCheckerContext, simpleTypeMarker, typeConstructorMarker);
        }
        if (!(abstractTypeCheckerContext.isClassTypeConstructor(typeConstructorMarker) || abstractTypeCheckerContext.isIntegerLiteralTypeConstructor(typeConstructorMarker))) {
            return collectAllSupertypesWithGivenTypeConstructor(abstractTypeCheckerContext, simpleTypeMarker, typeConstructorMarker);
        }
        SmartList<SimpleTypeMarker> smartList = new SmartList();
        abstractTypeCheckerContext.initialize();
        ArrayDeque<SimpleTypeMarker> supertypesDeque = abstractTypeCheckerContext.getSupertypesDeque();
        if (supertypesDeque == null) {
            Intrinsics.throwNpe();
        }
        Set<SimpleTypeMarker> supertypesSet = abstractTypeCheckerContext.getSupertypesSet();
        if (supertypesSet == null) {
            Intrinsics.throwNpe();
        }
        supertypesDeque.push(simpleTypeMarker);
        while (!supertypesDeque.isEmpty()) {
            if (supertypesSet.size() <= 1000) {
                SimpleTypeMarker pop = supertypesDeque.pop();
                Intrinsics.checkExpressionValueIsNotNull(pop, "current");
                if (supertypesSet.add(pop)) {
                    if (abstractTypeCheckerContext.isClassType(pop)) {
                        smartList.add(pop);
                        lowerIfFlexible = AbstractTypeCheckerContext.SupertypesPolicy.None.INSTANCE;
                    } else {
                        lowerIfFlexible = AbstractTypeCheckerContext.SupertypesPolicy.LowerIfFlexible.INSTANCE;
                    }
                    if (!(!Intrinsics.areEqual(lowerIfFlexible, AbstractTypeCheckerContext.SupertypesPolicy.None.INSTANCE))) {
                        lowerIfFlexible = null;
                    }
                    if (lowerIfFlexible != null) {
                        for (KotlinTypeMarker kotlinTypeMarker : abstractTypeCheckerContext.supertypes(abstractTypeCheckerContext.typeConstructor(pop))) {
                            supertypesDeque.add(lowerIfFlexible.transformType(abstractTypeCheckerContext, kotlinTypeMarker));
                        }
                    }
                }
            } else {
                throw new IllegalStateException(("Too many supertypes for type: " + simpleTypeMarker + ". Supertypes = " + CollectionsKt.joinToString$default(supertypesSet, null, null, null, 0, null, null, 63, null)).toString());
            }
        }
        abstractTypeCheckerContext.clear();
        ArrayList arrayList = new ArrayList();
        for (SimpleTypeMarker simpleTypeMarker2 : smartList) {
            AbstractTypeChecker abstractTypeChecker = INSTANCE;
            Intrinsics.checkExpressionValueIsNotNull(simpleTypeMarker2, "it");
            CollectionsKt.addAll(arrayList, abstractTypeChecker.collectAndFilter(abstractTypeCheckerContext, simpleTypeMarker2, typeConstructorMarker));
        }
        return arrayList;
    }
}
