package androidx.room;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public @interface ForeignKey {

    @Retention(RetentionPolicy.SOURCE)
    public @interface Action {
    }

    String[] childColumns();

    boolean deferred() default false;

    Class entity();

    int onDelete() default 1;

    int onUpdate() default 1;

    String[] parentColumns();
}
