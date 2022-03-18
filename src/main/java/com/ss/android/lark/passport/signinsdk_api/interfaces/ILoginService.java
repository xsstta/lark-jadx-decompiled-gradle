package com.ss.android.lark.passport.signinsdk_api.interfaces;

import android.content.Context;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.passport.signinsdk_api.account.AbstractC49338a;
import com.ss.android.lark.passport.signinsdk_api.account.TenantInfo;
import com.ss.android.lark.passport.signinsdk_api.entity.SessionResult;
import com.ss.android.lark.passport.signinsdk_api.entity.SigninParams;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public interface ILoginService {

    @Retention(RetentionPolicy.SOURCE)
    public @interface LoginSource {
    }

    /* renamed from: a */
    void mo172409a(Context context, SigninParams signinParams);

    /* renamed from: a */
    void mo172410a(Context context, String str);

    /* renamed from: a */
    void mo172411a(Context context, boolean z);

    /* renamed from: a */
    void mo172412a(Context context, boolean z, String str, AbstractC49338a aVar);

    /* renamed from: a */
    void mo172413a(TenantInfo tenantInfo, IGetDataCallback<SessionResult> iGetDataCallback);

    /* renamed from: b */
    void mo172414b(Context context, boolean z, String str, AbstractC49338a aVar);
}
