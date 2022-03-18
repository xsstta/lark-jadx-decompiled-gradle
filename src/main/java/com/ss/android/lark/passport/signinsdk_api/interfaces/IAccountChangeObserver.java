package com.ss.android.lark.passport.signinsdk_api.interfaces;

import com.ss.android.lark.passport.signinsdk_api.entity.LoginInfo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public interface IAccountChangeObserver {

    @Retention(RetentionPolicy.SOURCE)
    public @interface Priority {
    }

    /* renamed from: com.ss.android.lark.passport.signinsdk_api.interfaces.IAccountChangeObserver$a */
    public interface AbstractC49385a {
        void onAccountChange(LoginInfo loginInfo);
    }

    /* renamed from: a */
    void mo172398a(AbstractC49385a aVar);

    /* renamed from: b */
    void mo172399b(AbstractC49385a aVar);
}
