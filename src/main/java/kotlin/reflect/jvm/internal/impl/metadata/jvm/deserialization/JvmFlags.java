package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

import kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags;

public final class JvmFlags {
    public static final JvmFlags INSTANCE = new JvmFlags();
    private static final Flags.BooleanFlagField IS_MOVED_FROM_INTERFACE_COMPANION = Flags.FlagField.booleanFirst();

    private JvmFlags() {
    }

    public final Flags.BooleanFlagField getIS_MOVED_FROM_INTERFACE_COMPANION() {
        return IS_MOVED_FROM_INTERFACE_COMPANION;
    }
}
