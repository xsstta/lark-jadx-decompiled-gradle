package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.reflect.jvm.internal.impl.types.SimpleType;

public interface LocalClassifierTypeSettings {
    SimpleType getReplacementTypeForLocalClassifiers();

    public static final class Default implements LocalClassifierTypeSettings {
        public static final Default INSTANCE = new Default();

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.LocalClassifierTypeSettings
        public SimpleType getReplacementTypeForLocalClassifiers() {
            return null;
        }

        private Default() {
        }
    }
}
