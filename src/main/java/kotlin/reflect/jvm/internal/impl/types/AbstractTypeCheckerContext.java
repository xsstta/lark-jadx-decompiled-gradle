package kotlin.reflect.jvm.internal.impl.types;

import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.socialbase.downloader.downloader.AbstractC60044a;
import com.ss.android.vesdk.p3188b.C63954b;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Set;
import kotlin._Assertions;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.model.CapturedTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentListMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext;
import kotlin.reflect.jvm.internal.impl.utils.SmartSet;

public abstract class AbstractTypeCheckerContext implements TypeSystemContext {
    public int argumentsDepth;
    private ArrayDeque<SimpleTypeMarker> supertypesDeque;
    private boolean supertypesLocked;
    private Set<SimpleTypeMarker> supertypesSet;

    public enum LowerCapturedTypePolicy {
        CHECK_ONLY_LOWER,
        CHECK_SUBTYPE_AND_LOWER,
        SKIP_LOWER
    }

    public Boolean addSubtypeConstraint(KotlinTypeMarker kotlinTypeMarker, KotlinTypeMarker kotlinTypeMarker2) {
        Intrinsics.checkParameterIsNotNull(kotlinTypeMarker, "subType");
        Intrinsics.checkParameterIsNotNull(kotlinTypeMarker2, "superType");
        return null;
    }

    public abstract boolean areEqualTypeConstructors(TypeConstructorMarker typeConstructorMarker, TypeConstructorMarker typeConstructorMarker2);

    public abstract boolean isAllowedTypeVariable(KotlinTypeMarker kotlinTypeMarker);

    public abstract boolean isErrorTypeEqualsToAnything();

    public abstract boolean isStubTypeEqualsToAnything();

    public KotlinTypeMarker prepareType(KotlinTypeMarker kotlinTypeMarker) {
        Intrinsics.checkParameterIsNotNull(kotlinTypeMarker, ShareHitPoint.f121869d);
        return kotlinTypeMarker;
    }

    public KotlinTypeMarker refineType(KotlinTypeMarker kotlinTypeMarker) {
        Intrinsics.checkParameterIsNotNull(kotlinTypeMarker, ShareHitPoint.f121869d);
        return kotlinTypeMarker;
    }

    public abstract SupertypesPolicy substitutionSupertypePolicy(SimpleTypeMarker simpleTypeMarker);

    public static abstract class SupertypesPolicy {
        public abstract SimpleTypeMarker transformType(AbstractTypeCheckerContext abstractTypeCheckerContext, KotlinTypeMarker kotlinTypeMarker);

        private SupertypesPolicy() {
        }

        public static abstract class DoCustomTransform extends SupertypesPolicy {
            public DoCustomTransform() {
                super(null);
            }
        }

        public static final class LowerIfFlexible extends SupertypesPolicy {
            public static final LowerIfFlexible INSTANCE = new LowerIfFlexible();

            private LowerIfFlexible() {
                super(null);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeCheckerContext.SupertypesPolicy
            public SimpleTypeMarker transformType(AbstractTypeCheckerContext abstractTypeCheckerContext, KotlinTypeMarker kotlinTypeMarker) {
                Intrinsics.checkParameterIsNotNull(abstractTypeCheckerContext, "context");
                Intrinsics.checkParameterIsNotNull(kotlinTypeMarker, ShareHitPoint.f121869d);
                return abstractTypeCheckerContext.lowerBoundIfFlexible(kotlinTypeMarker);
            }
        }

        public static final class None extends SupertypesPolicy {
            public static final None INSTANCE = new None();

            private None() {
                super(null);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeCheckerContext.SupertypesPolicy
            public Void transformType(AbstractTypeCheckerContext abstractTypeCheckerContext, KotlinTypeMarker kotlinTypeMarker) {
                Intrinsics.checkParameterIsNotNull(abstractTypeCheckerContext, "context");
                Intrinsics.checkParameterIsNotNull(kotlinTypeMarker, ShareHitPoint.f121869d);
                throw new UnsupportedOperationException("Should not be called");
            }
        }

        public static final class UpperIfFlexible extends SupertypesPolicy {
            public static final UpperIfFlexible INSTANCE = new UpperIfFlexible();

            private UpperIfFlexible() {
                super(null);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeCheckerContext.SupertypesPolicy
            public SimpleTypeMarker transformType(AbstractTypeCheckerContext abstractTypeCheckerContext, KotlinTypeMarker kotlinTypeMarker) {
                Intrinsics.checkParameterIsNotNull(abstractTypeCheckerContext, "context");
                Intrinsics.checkParameterIsNotNull(kotlinTypeMarker, ShareHitPoint.f121869d);
                return abstractTypeCheckerContext.upperBoundIfFlexible(kotlinTypeMarker);
            }
        }

        public /* synthetic */ SupertypesPolicy(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final ArrayDeque<SimpleTypeMarker> getSupertypesDeque() {
        return this.supertypesDeque;
    }

    public final Set<SimpleTypeMarker> getSupertypesSet() {
        return this.supertypesSet;
    }

    public final void clear() {
        ArrayDeque<SimpleTypeMarker> arrayDeque = this.supertypesDeque;
        if (arrayDeque == null) {
            Intrinsics.throwNpe();
        }
        arrayDeque.clear();
        Set<SimpleTypeMarker> set = this.supertypesSet;
        if (set == null) {
            Intrinsics.throwNpe();
        }
        set.clear();
        this.supertypesLocked = false;
    }

    public final void initialize() {
        boolean z = !this.supertypesLocked;
        if (!_Assertions.f173221a || z) {
            this.supertypesLocked = true;
            if (this.supertypesDeque == null) {
                this.supertypesDeque = new ArrayDeque<>(4);
            }
            if (this.supertypesSet == null) {
                this.supertypesSet = SmartSet.Companion.create();
                return;
            }
            return;
        }
        throw new AssertionError("Assertion failed");
    }

    public boolean hasFlexibleNullability(KotlinTypeMarker kotlinTypeMarker) {
        Intrinsics.checkParameterIsNotNull(kotlinTypeMarker, "$this$hasFlexibleNullability");
        return TypeSystemContext.DefaultImpls.hasFlexibleNullability(this, kotlinTypeMarker);
    }

    public boolean isClassType(SimpleTypeMarker simpleTypeMarker) {
        Intrinsics.checkParameterIsNotNull(simpleTypeMarker, "$this$isClassType");
        return TypeSystemContext.DefaultImpls.isClassType(this, simpleTypeMarker);
    }

    public boolean isDefinitelyNotNullType(KotlinTypeMarker kotlinTypeMarker) {
        Intrinsics.checkParameterIsNotNull(kotlinTypeMarker, "$this$isDefinitelyNotNullType");
        return TypeSystemContext.DefaultImpls.isDefinitelyNotNullType(this, kotlinTypeMarker);
    }

    public boolean isDynamic(KotlinTypeMarker kotlinTypeMarker) {
        Intrinsics.checkParameterIsNotNull(kotlinTypeMarker, "$this$isDynamic");
        return TypeSystemContext.DefaultImpls.isDynamic(this, kotlinTypeMarker);
    }

    public boolean isIntegerLiteralType(SimpleTypeMarker simpleTypeMarker) {
        Intrinsics.checkParameterIsNotNull(simpleTypeMarker, "$this$isIntegerLiteralType");
        return TypeSystemContext.DefaultImpls.isIntegerLiteralType(this, simpleTypeMarker);
    }

    public boolean isNothing(KotlinTypeMarker kotlinTypeMarker) {
        Intrinsics.checkParameterIsNotNull(kotlinTypeMarker, "$this$isNothing");
        return TypeSystemContext.DefaultImpls.isNothing(this, kotlinTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public SimpleTypeMarker lowerBoundIfFlexible(KotlinTypeMarker kotlinTypeMarker) {
        Intrinsics.checkParameterIsNotNull(kotlinTypeMarker, "$this$lowerBoundIfFlexible");
        return TypeSystemContext.DefaultImpls.lowerBoundIfFlexible(this, kotlinTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public int size(TypeArgumentListMarker typeArgumentListMarker) {
        Intrinsics.checkParameterIsNotNull(typeArgumentListMarker, "$this$size");
        return TypeSystemContext.DefaultImpls.size(this, typeArgumentListMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public TypeConstructorMarker typeConstructor(KotlinTypeMarker kotlinTypeMarker) {
        Intrinsics.checkParameterIsNotNull(kotlinTypeMarker, "$this$typeConstructor");
        return TypeSystemContext.DefaultImpls.typeConstructor(this, kotlinTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public SimpleTypeMarker upperBoundIfFlexible(KotlinTypeMarker kotlinTypeMarker) {
        Intrinsics.checkParameterIsNotNull(kotlinTypeMarker, "$this$upperBoundIfFlexible");
        return TypeSystemContext.DefaultImpls.upperBoundIfFlexible(this, kotlinTypeMarker);
    }

    public List<SimpleTypeMarker> fastCorrespondingSupertypes(SimpleTypeMarker simpleTypeMarker, TypeConstructorMarker typeConstructorMarker) {
        Intrinsics.checkParameterIsNotNull(simpleTypeMarker, "$this$fastCorrespondingSupertypes");
        Intrinsics.checkParameterIsNotNull(typeConstructorMarker, "constructor");
        return TypeSystemContext.DefaultImpls.fastCorrespondingSupertypes(this, simpleTypeMarker, typeConstructorMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public TypeArgumentMarker get(TypeArgumentListMarker typeArgumentListMarker, int i) {
        Intrinsics.checkParameterIsNotNull(typeArgumentListMarker, "$this$get");
        return TypeSystemContext.DefaultImpls.get(this, typeArgumentListMarker, i);
    }

    public TypeArgumentMarker getArgumentOrNull(SimpleTypeMarker simpleTypeMarker, int i) {
        Intrinsics.checkParameterIsNotNull(simpleTypeMarker, "$this$getArgumentOrNull");
        return TypeSystemContext.DefaultImpls.getArgumentOrNull(this, simpleTypeMarker, i);
    }

    public LowerCapturedTypePolicy getLowerCapturedTypePolicy(SimpleTypeMarker simpleTypeMarker, CapturedTypeMarker capturedTypeMarker) {
        Intrinsics.checkParameterIsNotNull(simpleTypeMarker, "subType");
        Intrinsics.checkParameterIsNotNull(capturedTypeMarker, "superType");
        return LowerCapturedTypePolicy.CHECK_SUBTYPE_AND_LOWER;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemOptimizationContext
    public boolean identicalArguments(SimpleTypeMarker simpleTypeMarker, SimpleTypeMarker simpleTypeMarker2) {
        Intrinsics.checkParameterIsNotNull(simpleTypeMarker, AbstractC60044a.f149675a);
        Intrinsics.checkParameterIsNotNull(simpleTypeMarker2, C63954b.f161494a);
        return TypeSystemContext.DefaultImpls.identicalArguments(this, simpleTypeMarker, simpleTypeMarker2);
    }
}
