package kotlin.reflect.jvm.internal.impl.descriptors;

import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

public final class ConstUtil {
    public static final ConstUtil INSTANCE = new ConstUtil();

    private ConstUtil() {
    }

    @JvmStatic
    public static final boolean canBeUsedForConstVal(KotlinType kotlinType) {
        Intrinsics.checkParameterIsNotNull(kotlinType, ShareHitPoint.f121869d);
        return ConstUtilKt.canBeUsedForConstVal(kotlinType);
    }
}
