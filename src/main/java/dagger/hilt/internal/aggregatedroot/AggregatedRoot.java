package dagger.hilt.internal.aggregatedroot;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.CLASS)
public @interface AggregatedRoot {
    String originatingRoot();

    String root();

    Class<?> rootAnnotation();
}
