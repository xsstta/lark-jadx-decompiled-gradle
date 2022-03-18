package com.ss.android.vc.dependency;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public interface IAccountInterceptor {

    @Retention(RetentionPolicy.SOURCE)
    public @interface Step {
    }

    /* renamed from: a */
    int mo208724a();

    C60874a getDetail();

    int interceptOnConfirm();

    boolean needIntercept();
}
