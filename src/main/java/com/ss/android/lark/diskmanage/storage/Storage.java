package com.ss.android.lark.diskmanage.storage;

import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;

@Target({ElementType.METHOD})
@kotlin.annotation.Target(allowedTargets = {AnnotationTarget.FUNCTION})
@Retention(RetentionPolicy.RUNTIME)
@kotlin.annotation.Retention(AnnotationRetention.RUNTIME)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001:\u0001\bB\u0012\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005R\u000f\u0010\u0004\u001a\u00020\u0005¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0006R\u000f\u0010\u0002\u001a\u00020\u0003¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/diskmanage/storage/Storage;", "", ShareHitPoint.f121869d, "Lcom/ss/android/lark/diskmanage/storage/Storage$Type;", "bizChildPath", "", "()Ljava/lang/String;", "()Lcom/ss/android/lark/diskmanage/storage/Storage$Type;", "Type", "disk-manage_release"}, mo238835k = 1, mv = {1, 1, 15})
public @interface Storage {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/diskmanage/storage/Storage$Type;", "", "(Ljava/lang/String;I)V", "INNER_CACHE", "CACHE", "INNER_FILES", "FILES", "STORAGE_LARK", "disk-manage_release"}, mo238835k = 1, mv = {1, 1, 15})
    public enum Type {
        INNER_CACHE,
        CACHE,
        INNER_FILES,
        FILES,
        STORAGE_LARK
    }

    String bizChildPath() default "";

    Type type();
}
