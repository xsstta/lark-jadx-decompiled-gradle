package androidx.room;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.CLASS)
public @interface ColumnInfo {

    public @interface Collate {
    }

    public @interface SQLiteTypeAffinity {
    }

    int collate() default 1;

    boolean index() default false;

    String name() default "[field-name]";

    int typeAffinity() default 1;
}
