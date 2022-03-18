package com.ss.android.lark.passport.signinsdk_api.idp;

import com.ss.android.lark.passport.signinsdk_api.base.AbstractC49344b;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public interface IGetIdpTokenCallback<T> extends AbstractC49344b {

    @Retention(RetentionPolicy.SOURCE)
    public @interface Codes {
    }

    /* renamed from: a */
    void mo145132a(T t, int i, String str);
}
