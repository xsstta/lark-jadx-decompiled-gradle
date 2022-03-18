package kotlin.reflect.jvm.internal.impl.types.checker;

import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* access modifiers changed from: package-private */
public final class SubtypePathNode {
    private final SubtypePathNode previous;
    private final KotlinType type;

    public final SubtypePathNode getPrevious() {
        return this.previous;
    }

    public final KotlinType getType() {
        return this.type;
    }

    public SubtypePathNode(KotlinType kotlinType, SubtypePathNode subtypePathNode) {
        Intrinsics.checkParameterIsNotNull(kotlinType, ShareHitPoint.f121869d);
        this.type = kotlinType;
        this.previous = subtypePathNode;
    }
}
