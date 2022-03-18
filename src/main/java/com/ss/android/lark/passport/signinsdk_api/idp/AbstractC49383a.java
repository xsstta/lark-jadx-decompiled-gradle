package com.ss.android.lark.passport.signinsdk_api.idp;

import android.app.Activity;
import android.content.Context;
import com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d;

/* renamed from: com.ss.android.lark.passport.signinsdk_api.idp.a */
public interface AbstractC49383a<T> {
    /* renamed from: a */
    void mo171957a();

    /* renamed from: a */
    void mo171958a(Activity activity, IdPSettingResponse idPSettingResponse, AbstractC49352d dVar);

    /* renamed from: a */
    void mo171959a(Context context, IGetIdpTokenCallback<T> iGetIdpTokenCallback, long j);

    /* renamed from: a */
    void mo171960a(Context context, boolean z, IGetIdpTokenCallback<String> iGetIdpTokenCallback);

    /* renamed from: a */
    void mo171961a(String str, AbstractC49352d<String> dVar);

    /* renamed from: a */
    boolean mo171962a(Context context);
}
