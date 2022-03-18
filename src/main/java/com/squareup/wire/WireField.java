package com.squareup.wire;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface WireField {
    String adapter();

    String keyAdapter() default "";

    Label label() default Label.OPTIONAL;

    boolean redacted() default false;

    int tag();

    public enum Label {
        REQUIRED,
        OPTIONAL,
        REPEATED,
        ONE_OF,
        PACKED;

        /* access modifiers changed from: package-private */
        public boolean isOneOf() {
            if (this == ONE_OF) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public boolean isPacked() {
            if (this == PACKED) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public boolean isRepeated() {
            if (this == REPEATED || this == PACKED) {
                return true;
            }
            return false;
        }
    }
}
