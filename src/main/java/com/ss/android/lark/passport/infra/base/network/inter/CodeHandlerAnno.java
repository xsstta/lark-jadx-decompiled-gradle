package com.ss.android.lark.passport.infra.base.network.inter;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;

@Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE})
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\n\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003R\u000f\u0010\u0002\u001a\u00020\u0003¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/passport/infra/base/network/inter/CodeHandlerAnno;", "", "code", "", "()I", "passport-infra_release"}, mo238835k = 1, mv = {1, 1, 16})
@kotlin.annotation.Target(allowedTargets = {AnnotationTarget.ANNOTATION_CLASS, AnnotationTarget.CLASS})
@Retention(RetentionPolicy.RUNTIME)
@kotlin.annotation.Retention(AnnotationRetention.RUNTIME)
public @interface CodeHandlerAnno {
    int code() default -1;
}
