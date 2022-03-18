package kotlin.reflect.jvm.internal.impl.types;

import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import kotlin._Assertions;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.types.checker.NewTypeVariableConstructor;
import kotlin.reflect.jvm.internal.impl.types.checker.NullabilityChecker;
import kotlin.reflect.jvm.internal.impl.types.model.DefinitelyNotNullTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;

public final class DefinitelyNotNullType extends DelegatingSimpleType implements CustomTypeVariable, DefinitelyNotNullTypeMarker {
    public static final Companion Companion = new Companion(null);
    private final SimpleType original;

    @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType, kotlin.reflect.jvm.internal.impl.types.KotlinType
    public boolean isMarkedNullable() {
        return false;
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final boolean makesSenseToBeDefinitelyNotNull(UnwrappedType unwrappedType) {
            if (!TypeUtilsKt.canHaveUndefinedNullability(unwrappedType) || NullabilityChecker.INSTANCE.isSubtypeOfAny(unwrappedType)) {
                return false;
            }
            return true;
        }

        public final DefinitelyNotNullType makeDefinitelyNotNull$descriptors(UnwrappedType unwrappedType) {
            Intrinsics.checkParameterIsNotNull(unwrappedType, ShareHitPoint.f121869d);
            if (unwrappedType instanceof DefinitelyNotNullType) {
                return (DefinitelyNotNullType) unwrappedType;
            }
            if (!makesSenseToBeDefinitelyNotNull(unwrappedType)) {
                return null;
            }
            if (unwrappedType instanceof FlexibleType) {
                FlexibleType flexibleType = (FlexibleType) unwrappedType;
                boolean areEqual = Intrinsics.areEqual(flexibleType.getLowerBound().getConstructor(), flexibleType.getUpperBound().getConstructor());
                if (_Assertions.f173221a && !areEqual) {
                    throw new AssertionError("DefinitelyNotNullType for flexible type (" + unwrappedType + ") can be created only from type variable with the same constructor for bounds");
                }
            }
            return new DefinitelyNotNullType(FlexibleTypesKt.lowerIfFlexible(unwrappedType), null);
        }
    }

    /* access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType
    public SimpleType getDelegate() {
        return this.original;
    }

    public final SimpleType getOriginal() {
        return this.original;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType
    public String toString() {
        return getDelegate() + "!!";
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.CustomTypeVariable
    public boolean isTypeVariable() {
        if ((getDelegate().getConstructor() instanceof NewTypeVariableConstructor) || (getDelegate().getConstructor().getDeclarationDescriptor() instanceof TypeParameterDescriptor)) {
            return true;
        }
        return false;
    }

    private DefinitelyNotNullType(SimpleType simpleType) {
        this.original = simpleType;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType, kotlin.reflect.jvm.internal.impl.types.SimpleType
    public SimpleType makeNullableAsSpecified(boolean z) {
        if (z) {
            return getDelegate().makeNullableAsSpecified(z);
        }
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType
    public DefinitelyNotNullType replaceDelegate(SimpleType simpleType) {
        Intrinsics.checkParameterIsNotNull(simpleType, "delegate");
        return new DefinitelyNotNullType(simpleType);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.CustomTypeVariable
    public KotlinType substitutionResult(KotlinType kotlinType) {
        Intrinsics.checkParameterIsNotNull(kotlinType, "replacement");
        return SpecialTypesKt.makeDefinitelyNotNullOrNotNull(kotlinType.unwrap());
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType, kotlin.reflect.jvm.internal.impl.types.SimpleType
    public DefinitelyNotNullType replaceAnnotations(Annotations annotations) {
        Intrinsics.checkParameterIsNotNull(annotations, "newAnnotations");
        return new DefinitelyNotNullType(getDelegate().replaceAnnotations(annotations));
    }

    public /* synthetic */ DefinitelyNotNullType(SimpleType simpleType, DefaultConstructorMarker defaultConstructorMarker) {
        this(simpleType);
    }
}
