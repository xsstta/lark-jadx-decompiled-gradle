package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;

/* access modifiers changed from: package-private */
public final class SimpleResult extends Result {
    private final SimpleType type;

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.Result
    public SimpleType getType() {
        return this.type;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SimpleResult(SimpleType simpleType, int i, boolean z) {
        super(simpleType, i, z);
        Intrinsics.checkParameterIsNotNull(simpleType, ShareHitPoint.f121869d);
        this.type = simpleType;
    }
}
