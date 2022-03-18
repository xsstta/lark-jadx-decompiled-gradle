package com.ss.android.lark.passport.signinsdk_api.interfaces;

import com.ss.android.lark.passport.signinsdk_api.entity.AccountInterceptorBean;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public interface IAccountInterceptor {

    @Retention(RetentionPolicy.SOURCE)
    public @interface Step {
    }

    /* renamed from: com.ss.android.lark.passport.signinsdk_api.interfaces.IAccountInterceptor$a */
    public interface AbstractC49386a {

        /* renamed from: com.ss.android.lark.passport.signinsdk_api.interfaces.IAccountInterceptor$a$-CC  reason: invalid class name */
        public final /* synthetic */ class CC {
            public static void $default$b(AbstractC49386a aVar) {
            }
        }

        /* renamed from: a */
        void mo133323a();

        /* renamed from: b */
        void mo133324b();
    }

    /* renamed from: a */
    boolean mo144654a();

    /* renamed from: b */
    AccountInterceptorBean mo144655b();

    /* renamed from: c */
    int mo144656c();

    /* renamed from: d */
    int mo144657d();
}
