package com.larksuite.rucket.impl.serverimpl.annotation;

import com.ss.android.lark.pb.improto.Command;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;

@Target({ElementType.METHOD})
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\f\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004R\u0013\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/larksuite/rucket/impl/serverimpl/annotation/ServerCall;", "", "value", "Lcom/ss/android/lark/pb/improto/Command;", "Lcom/larksuite/rucket/impl/serverimpl/annotation/ServerCommand;", "()Lcom/ss/android/lark/pb/improto/Command;", "rucket_release"}, mo238835k = 1, mv = {1, 1, 16})
@kotlin.annotation.Target(allowedTargets = {AnnotationTarget.FUNCTION})
@Retention(RetentionPolicy.RUNTIME)
@kotlin.annotation.Retention(AnnotationRetention.RUNTIME)
public @interface ServerCall {
    Command value();
}
