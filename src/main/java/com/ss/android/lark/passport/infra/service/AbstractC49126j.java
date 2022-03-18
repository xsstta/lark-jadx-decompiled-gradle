package com.ss.android.lark.passport.infra.service;

import android.content.Context;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.passport.signinsdk_api.account.User;
import com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.C49382d;

/* renamed from: com.ss.android.lark.passport.infra.service.j */
public interface AbstractC49126j {
    void asyncMakeUserOnline(Context context, User user, User user2, String str, int i, IGetDataCallback<C49382d> iGetDataCallback);
}
