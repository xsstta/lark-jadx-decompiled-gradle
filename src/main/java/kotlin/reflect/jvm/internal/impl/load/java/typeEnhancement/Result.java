package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* access modifiers changed from: package-private */
public class Result {
    private final int subtreeSize;
    private final KotlinType type;
    private final boolean wereChanges;

    public final int getSubtreeSize() {
        return this.subtreeSize;
    }

    public KotlinType getType() {
        return this.type;
    }

    public final boolean getWereChanges() {
        return this.wereChanges;
    }

    public final KotlinType getTypeIfChanged() {
        KotlinType type2 = getType();
        if (this.wereChanges) {
            return type2;
        }
        return null;
    }

    public Result(KotlinType kotlinType, int i, boolean z) {
        Intrinsics.checkParameterIsNotNull(kotlinType, ShareHitPoint.f121869d);
        this.type = kotlinType;
        this.subtreeSize = i;
        this.wereChanges = z;
    }
}
