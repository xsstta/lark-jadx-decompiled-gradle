package kotlin.reflect.jvm.internal.impl.utils;

import kotlin.jvm.internal.DefaultConstructorMarker;

public enum ReportLevel {
    IGNORE("ignore"),
    WARN("warn"),
    STRICT("strict");
    
    public static final Companion Companion = new Companion(null);
    private final String description;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final String getDescription() {
        return this.description;
    }

    public final boolean isIgnore() {
        if (this == IGNORE) {
            return true;
        }
        return false;
    }

    public final boolean isWarning() {
        if (this == WARN) {
            return true;
        }
        return false;
    }

    private ReportLevel(String str) {
        this.description = str;
    }
}
