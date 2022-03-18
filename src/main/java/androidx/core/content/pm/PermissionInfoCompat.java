package androidx.core.content.pm;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public final class PermissionInfoCompat {

    @Retention(RetentionPolicy.SOURCE)
    public @interface Protection {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface ProtectionFlags {
    }
}
