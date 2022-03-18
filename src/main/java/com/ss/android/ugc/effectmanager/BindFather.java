package com.ss.android.ugc.effectmanager;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;

@Target({ElementType.TYPE})
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001BR\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\u0012\b\u0002\u0010\t\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\f\u001a\u00020\u0005R\u000f\u0010\f\u001a\u00020\u0005¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u000f\u0010\u0006\u001a\u00020\u0007¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u000eR\u0013\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u000fR\u000f\u0010\u0004\u001a\u00020\u0005¢\u0006\u0006\u001a\u0004\b\u0004\u0010\rR\u0019\u0010\t\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\n¢\u0006\u0006\u001a\u0004\b\t\u0010\u0010R\u000f\u0010\u000b\u001a\u00020\u0007¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u000eR\u000f\u0010\b\u001a\u00020\u0007¢\u0006\u0006\u001a\u0004\b\b\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/ss/android/ugc/effectmanager/BindFather;", "", "father", "Lkotlin/reflect/KClass;", "fatherName", "", "enableParcel", "", "isOpen", "innerClass", "", "isInnerClass", "destPackage", "()Ljava/lang/String;", "()Z", "()Ljava/lang/Class;", "()[Ljava/lang/Class;", "epannotation"}, mo238835k = 1, mv = {1, 1, 15})
@kotlin.annotation.Target(allowedTargets = {AnnotationTarget.CLASS})
@Retention(RetentionPolicy.SOURCE)
@kotlin.annotation.Retention(AnnotationRetention.SOURCE)
public @interface BindFather {
    String destPackage() default "";

    boolean enableParcel() default false;

    Class<?> father();

    String fatherName() default "";

    Class<?>[] innerClass() default {};

    boolean isInnerClass() default false;

    boolean isOpen() default false;
}
