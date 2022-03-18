package kotlin.reflect.jvm.internal.impl.types.checker;

import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.AbstractNullabilityChecker;
import kotlin.reflect.jvm.internal.impl.types.AbstractTypeCheckerContext;
import kotlin.reflect.jvm.internal.impl.types.FlexibleTypesKt;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;

public final class NullabilityChecker {
    public static final NullabilityChecker INSTANCE = new NullabilityChecker();

    private NullabilityChecker() {
    }

    public final boolean isSubtypeOfAny(UnwrappedType unwrappedType) {
        Intrinsics.checkParameterIsNotNull(unwrappedType, ShareHitPoint.f121869d);
        return AbstractNullabilityChecker.INSTANCE.hasNotNullSupertype(SimpleClassicTypeSystemContext.INSTANCE.newBaseTypeCheckerContext(false, true), FlexibleTypesKt.lowerIfFlexible(unwrappedType), AbstractTypeCheckerContext.SupertypesPolicy.LowerIfFlexible.INSTANCE);
    }
}
