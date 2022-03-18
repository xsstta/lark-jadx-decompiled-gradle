package kotlin.reflect.jvm.internal.impl.load.java.descriptors;

import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

public final class ValueParameterData {
    private final boolean hasDefaultValue;
    private final KotlinType type;

    public final boolean getHasDefaultValue() {
        return this.hasDefaultValue;
    }

    public final KotlinType getType() {
        return this.type;
    }

    public ValueParameterData(KotlinType kotlinType, boolean z) {
        Intrinsics.checkParameterIsNotNull(kotlinType, ShareHitPoint.f121869d);
        this.type = kotlinType;
        this.hasDefaultValue = z;
    }
}
