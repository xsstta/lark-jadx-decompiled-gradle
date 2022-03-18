package com.ss.android.lark.integrator.plugin;

import com.larksuite.component.openplatform.core.plugin.OPPlugin;
import com.larksuite.framework.apiplugin.AbstractC25905b;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.larksuite.framework.apiplugin.common.Messenger;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25897h;
import com.ss.android.lark.biz.core.api.ContactSource;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.optrace.api.ILogger;
import com.ss.android.lark.utils.ApiUtils;

public class EnterProfileByUserIdPlugin extends OPPlugin {
    @LKPluginFunction(async = true, eventName = {"enterProfileByUserId"})
    public void enterProfileByUserId(Messenger.EnterProfileByUserRequest enterProfileByUserRequest, AbstractC25905b bVar, ILogger aVar, AbstractC25897h<Messenger.EnterProfileByUserResponse> hVar) {
        aVar.mo92224i("EnterProfileByUserIdPlu", "enter profile by userId");
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).startUserProfile(bVar.mo92207a(), enterProfileByUserRequest.mUserId, null, new ContactSource.C29531a().mo104726a(0).mo104728a());
        hVar.callback(new Messenger.EnterProfileByUserResponse());
    }
}
