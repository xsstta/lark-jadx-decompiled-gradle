package com.ss.android.lark.passport.infra.service;

import android.content.Context;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.passport.infra.entity.SwitchEntity;
import com.ss.android.lark.passport.signinsdk_api.account.User;
import com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.C49382d;

/* renamed from: com.ss.android.lark.passport.infra.service.n */
public interface AbstractC49128n {
    void switchToNextValidUser(Context context, int i, int i2, IGetDataCallback<User> iGetDataCallback);

    void switchUser(Context context, SwitchEntity switchEntity, IGetDataCallback<C49382d> iGetDataCallback);

    void switchUser(Context context, String str, IGetDataCallback<C49382d> iGetDataCallback);
}
