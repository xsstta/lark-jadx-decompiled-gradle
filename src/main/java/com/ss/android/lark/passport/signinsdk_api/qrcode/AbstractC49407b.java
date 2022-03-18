package com.ss.android.lark.passport.signinsdk_api.qrcode;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.ss.android.lark.passport.signinsdk_api.base.NetworkErrorResult;

/* renamed from: com.ss.android.lark.passport.signinsdk_api.qrcode.b */
public interface AbstractC49407b {

    /* renamed from: com.ss.android.lark.passport.signinsdk_api.qrcode.b$a */
    public interface AbstractC49408a {
        void onActivityDestory(Activity activity);
    }

    /* renamed from: com.ss.android.lark.passport.signinsdk_api.qrcode.b$b */
    public interface AbstractC49409b {
        /* renamed from: a */
        void mo172452a(View view);
    }

    /* renamed from: a */
    Context mo145304a();

    /* renamed from: a */
    void mo145305a(NetworkErrorResult networkErrorResult);

    /* renamed from: a */
    void mo145306a(AbstractC49408a aVar);
}
