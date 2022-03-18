package kotlin.reflect.jvm.internal.impl.types;

import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.util.ArrayDeque;
import java.util.Set;
import kotlin._Assertions;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.AbstractTypeCheckerContext;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker;

public final class AbstractNullabilityChecker {
    public static final AbstractNullabilityChecker INSTANCE = new AbstractNullabilityChecker();

    private AbstractNullabilityChecker() {
    }

    public final boolean isPossibleSubtype(AbstractTypeCheckerContext abstractTypeCheckerContext, SimpleTypeMarker simpleTypeMarker, SimpleTypeMarker simpleTypeMarker2) {
        Intrinsics.checkParameterIsNotNull(abstractTypeCheckerContext, "context");
        Intrinsics.checkParameterIsNotNull(simpleTypeMarker, "subType");
        Intrinsics.checkParameterIsNotNull(simpleTypeMarker2, "superType");
        return runIsPossibleSubtype(abstractTypeCheckerContext, simpleTypeMarker, simpleTypeMarker2);
    }

    private final boolean isApplicableAsEndNode(AbstractTypeCheckerContext abstractTypeCheckerContext, SimpleTypeMarker simpleTypeMarker, TypeConstructorMarker typeConstructorMarker) {
        if (abstractTypeCheckerContext.isNothing(simpleTypeMarker)) {
            return true;
        }
        if (abstractTypeCheckerContext.isMarkedNullable(simpleTypeMarker)) {
            return false;
        }
        if (!abstractTypeCheckerContext.isStubTypeEqualsToAnything() || !abstractTypeCheckerContext.isStubType(simpleTypeMarker)) {
            return abstractTypeCheckerContext.isEqualTypeConstructors(abstractTypeCheckerContext.typeConstructor(simpleTypeMarker), typeConstructorMarker);
        }
        return true;
    }

    private final boolean runIsPossibleSubtype(AbstractTypeCheckerContext abstractTypeCheckerContext, SimpleTypeMarker simpleTypeMarker, SimpleTypeMarker simpleTypeMarker2) {
        boolean z;
        boolean z2;
        if (AbstractTypeChecker.RUN_SLOW_ASSERTIONS) {
            if (abstractTypeCheckerContext.isSingleClassifierType(simpleTypeMarker) || abstractTypeCheckerContext.isIntersection(abstractTypeCheckerContext.typeConstructor(simpleTypeMarker)) || abstractTypeCheckerContext.isAllowedTypeVariable(simpleTypeMarker)) {
                z = true;
            } else {
                z = false;
            }
            if (!_Assertions.f173221a || z) {
                if (abstractTypeCheckerContext.isSingleClassifierType(simpleTypeMarker2) || abstractTypeCheckerContext.isAllowedTypeVariable(simpleTypeMarker2)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (_Assertions.f173221a && !z2) {
                    throw new AssertionError("Not singleClassifierType superType: " + simpleTypeMarker2);
                }
            } else {
                throw new AssertionError("Not singleClassifierType and not intersection subType: " + simpleTypeMarker);
            }
        }
        if (abstractTypeCheckerContext.isMarkedNullable(simpleTypeMarker2) || abstractTypeCheckerContext.isDefinitelyNotNullType(simpleTypeMarker) || hasNotNullSupertype(abstractTypeCheckerContext, simpleTypeMarker, AbstractTypeCheckerContext.SupertypesPolicy.LowerIfFlexible.INSTANCE)) {
            return true;
        }
        if (!abstractTypeCheckerContext.isDefinitelyNotNullType(simpleTypeMarker2) && !hasNotNullSupertype(abstractTypeCheckerContext, simpleTypeMarker2, AbstractTypeCheckerContext.SupertypesPolicy.UpperIfFlexible.INSTANCE) && !abstractTypeCheckerContext.isClassType(simpleTypeMarker)) {
            return hasPathByNotMarkedNullableNodes(abstractTypeCheckerContext, simpleTypeMarker, abstractTypeCheckerContext.typeConstructor(simpleTypeMarker2));
        }
        return false;
    }

    public final boolean hasPathByNotMarkedNullableNodes(AbstractTypeCheckerContext abstractTypeCheckerContext, SimpleTypeMarker simpleTypeMarker, TypeConstructorMarker typeConstructorMarker) {
        AbstractTypeCheckerContext.SupertypesPolicy supertypesPolicy;
        Intrinsics.checkParameterIsNotNull(abstractTypeCheckerContext, "$this$hasPathByNotMarkedNullableNodes");
        Intrinsics.checkParameterIsNotNull(simpleTypeMarker, "start");
        Intrinsics.checkParameterIsNotNull(typeConstructorMarker, "end");
        if (INSTANCE.isApplicableAsEndNode(abstractTypeCheckerContext, simpleTypeMarker, typeConstructorMarker)) {
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
                    if (abstractTypeCheckerContext.isMarkedNullable(pop)) {
                        supertypesPolicy = AbstractTypeCheckerContext.SupertypesPolicy.None.INSTANCE;
                    } else {
                        supertypesPolicy = AbstractTypeCheckerContext.SupertypesPolicy.LowerIfFlexible.INSTANCE;
                    }
                    AbstractTypeCheckerContext.SupertypesPolicy supertypesPolicy2 = supertypesPolicy;
                    if (!(!Intrinsics.areEqual(supertypesPolicy2, AbstractTypeCheckerContext.SupertypesPolicy.None.INSTANCE))) {
                        supertypesPolicy2 = null;
                    }
                    if (supertypesPolicy2 != null) {
                        for (KotlinTypeMarker kotlinTypeMarker : abstractTypeCheckerContext.supertypes(abstractTypeCheckerContext.typeConstructor(pop))) {
                            SimpleTypeMarker transformType = supertypesPolicy2.transformType(abstractTypeCheckerContext, kotlinTypeMarker);
                            if (INSTANCE.isApplicableAsEndNode(abstractTypeCheckerContext, transformType, typeConstructorMarker)) {
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

    public final boolean hasNotNullSupertype(AbstractTypeCheckerContext abstractTypeCheckerContext, SimpleTypeMarker simpleTypeMarker, AbstractTypeCheckerContext.SupertypesPolicy supertypesPolicy) {
        boolean z;
        AbstractTypeCheckerContext.SupertypesPolicy.None none;
        boolean z2;
        Intrinsics.checkParameterIsNotNull(abstractTypeCheckerContext, "$this$hasNotNullSupertype");
        Intrinsics.checkParameterIsNotNull(simpleTypeMarker, ShareHitPoint.f121869d);
        Intrinsics.checkParameterIsNotNull(supertypesPolicy, "supertypesPolicy");
        if ((!abstractTypeCheckerContext.isClassType(simpleTypeMarker) || abstractTypeCheckerContext.isMarkedNullable(simpleTypeMarker)) && !abstractTypeCheckerContext.isDefinitelyNotNullType(simpleTypeMarker)) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
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
                        if (abstractTypeCheckerContext.isMarkedNullable(pop)) {
                            none = AbstractTypeCheckerContext.SupertypesPolicy.None.INSTANCE;
                        } else {
                            none = supertypesPolicy;
                        }
                        if (!(!Intrinsics.areEqual(none, AbstractTypeCheckerContext.SupertypesPolicy.None.INSTANCE))) {
                            none = null;
                        }
                        if (none != null) {
                            for (KotlinTypeMarker kotlinTypeMarker : abstractTypeCheckerContext.supertypes(abstractTypeCheckerContext.typeConstructor(pop))) {
                                SimpleTypeMarker transformType = none.transformType(abstractTypeCheckerContext, kotlinTypeMarker);
                                if ((!abstractTypeCheckerContext.isClassType(transformType) || abstractTypeCheckerContext.isMarkedNullable(transformType)) && !abstractTypeCheckerContext.isDefinitelyNotNullType(transformType)) {
                                    z2 = false;
                                } else {
                                    z2 = true;
                                }
                                if (z2) {
                                    abstractTypeCheckerContext.clear();
                                } else {
                                    supertypesDeque.add(transformType);
                                }
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
        return true;
    }
}
