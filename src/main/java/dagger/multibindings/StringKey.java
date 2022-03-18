package dagger.multibindings;

import dagger.MapKey;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@MapKey
@Target({ElementType.METHOD, ElementType.FIELD})
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface StringKey {
    String value();
}
