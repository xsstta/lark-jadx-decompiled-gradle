package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.am;
import kotlin.jvm.internal.Intrinsics;

public final class SignatureEnhancementKt {
    public static final NullabilityQualifier select(Set<? extends NullabilityQualifier> set, NullabilityQualifier nullabilityQualifier, boolean z) {
        Intrinsics.checkParameterIsNotNull(set, "$this$select");
        if (nullabilityQualifier == NullabilityQualifier.FORCE_FLEXIBILITY) {
            return NullabilityQualifier.FORCE_FLEXIBILITY;
        }
        return (NullabilityQualifier) select(set, NullabilityQualifier.NOT_NULL, NullabilityQualifier.NULLABLE, nullabilityQualifier, z);
    }

    public static final JavaTypeQualifiers createJavaTypeQualifiers(NullabilityQualifier nullabilityQualifier, MutabilityQualifier mutabilityQualifier, boolean z, boolean z2) {
        if (!z2 || nullabilityQualifier != NullabilityQualifier.NOT_NULL) {
            return new JavaTypeQualifiers(nullabilityQualifier, mutabilityQualifier, false, z);
        }
        return new JavaTypeQualifiers(nullabilityQualifier, mutabilityQualifier, true, z);
    }

    public static final <T> T select(Set<? extends T> set, T t, T t2, T t3, boolean z) {
        Set<? extends T> set2;
        T t4;
        Intrinsics.checkParameterIsNotNull(set, "$this$select");
        Intrinsics.checkParameterIsNotNull(t, "low");
        Intrinsics.checkParameterIsNotNull(t2, "high");
        if (z) {
            if (set.contains(t)) {
                t4 = t;
            } else if (set.contains(t2)) {
                t4 = t2;
            } else {
                t4 = null;
            }
            if (!Intrinsics.areEqual((Object) t4, (Object) t) || !Intrinsics.areEqual((Object) t3, (Object) t2)) {
                return t3 != null ? t3 : t4;
            }
            return null;
        }
        if (!(t3 == null || (set2 = CollectionsKt.toSet(am.m265693a((Set) set, (Object) t3))) == null)) {
            set = set2;
        }
        return (T) CollectionsKt.singleOrNull(set);
    }
}
