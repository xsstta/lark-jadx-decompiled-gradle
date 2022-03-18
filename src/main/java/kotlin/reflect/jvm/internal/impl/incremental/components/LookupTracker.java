package kotlin.reflect.jvm.internal.impl.incremental.components;

import kotlin.jvm.internal.Intrinsics;

public interface LookupTracker {
    boolean getRequiresPosition();

    void record(String str, Position position, String str2, ScopeKind scopeKind, String str3);

    public static final class DO_NOTHING implements LookupTracker {
        public static final DO_NOTHING INSTANCE = new DO_NOTHING();

        @Override // kotlin.reflect.jvm.internal.impl.incremental.components.LookupTracker
        public boolean getRequiresPosition() {
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.incremental.components.LookupTracker
        public void record(String str, Position position, String str2, ScopeKind scopeKind, String str3) {
            Intrinsics.checkParameterIsNotNull(str, "filePath");
            Intrinsics.checkParameterIsNotNull(position, "position");
            Intrinsics.checkParameterIsNotNull(str2, "scopeFqName");
            Intrinsics.checkParameterIsNotNull(scopeKind, "scopeKind");
            Intrinsics.checkParameterIsNotNull(str3, "name");
        }

        private DO_NOTHING() {
        }
    }
}
