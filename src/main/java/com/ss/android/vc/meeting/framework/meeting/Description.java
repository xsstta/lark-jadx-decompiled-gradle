package com.ss.android.vc.meeting.framework.meeting;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Description {
    String desc() default "";

    String tips() default "";
}
