package kotlin.reflect.jvm.internal.impl.types.checker;

import com.ss.android.socialbase.downloader.downloader.AbstractC60044a;
import com.ss.android.vesdk.p3188b.C63954b;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.AbstractStrictEqualityTypeChecker;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;

public final class StrictEqualityTypeChecker {
    public static final StrictEqualityTypeChecker INSTANCE = new StrictEqualityTypeChecker();

    private StrictEqualityTypeChecker() {
    }

    public final boolean strictEqualTypes(UnwrappedType unwrappedType, UnwrappedType unwrappedType2) {
        Intrinsics.checkParameterIsNotNull(unwrappedType, AbstractC60044a.f149675a);
        Intrinsics.checkParameterIsNotNull(unwrappedType2, C63954b.f161494a);
        return AbstractStrictEqualityTypeChecker.INSTANCE.strictEqualTypes(SimpleClassicTypeSystemContext.INSTANCE, unwrappedType, unwrappedType2);
    }
}
