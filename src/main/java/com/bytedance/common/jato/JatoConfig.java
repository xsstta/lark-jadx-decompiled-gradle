package com.bytedance.common.jato;

public class JatoConfig {
    public final boolean isEnabledArtGcBlocker = Builder.isEnabledArtGcBlocker;
    public final boolean isEnabledDalvikGcBlocker = Builder.isEnabledDalvikGcBlocker;

    public static class Builder {
        public static boolean isEnabledArtGcBlocker = true;
        public static boolean isEnabledDalvikGcBlocker;

        public static JatoConfig build() {
            return new JatoConfig();
        }
    }
}
