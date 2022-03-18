package dagger.hilt;

import dagger.hilt.internal.definecomponent.C68170a;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.CLASS)
public @interface DefineComponent {

    @Target({ElementType.TYPE})
    @Retention(RetentionPolicy.CLASS)
    public @interface Builder {
    }

    Class<?> parent() default C68170a.class;
}
