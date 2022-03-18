package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

public final class TypeEnhancementInfo {
    private final Map<Integer, JavaTypeQualifiers> map;

    public final Map<Integer, JavaTypeQualifiers> getMap() {
        return this.map;
    }

    public TypeEnhancementInfo(Map<Integer, JavaTypeQualifiers> map2) {
        Intrinsics.checkParameterIsNotNull(map2, "map");
        this.map = map2;
    }
}
