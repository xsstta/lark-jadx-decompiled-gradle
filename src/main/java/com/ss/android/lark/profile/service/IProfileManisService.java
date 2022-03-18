package com.ss.android.lark.profile.service;

import com.ss.android.lark.biz.core.api.ProfileResponse;
import com.ss.android.lark.manis.annotation.RemoteCallback;
import com.ss.android.lark.manis.annotation.RemoteService;
import com.ss.android.lark.profile.dto.ErrorResultWrapper;
import ee.android.framework.manis.interfaces.IHookInterface;

@RemoteService
public interface IProfileManisService extends IHookInterface {

    @RemoteCallback
    /* renamed from: com.ss.android.lark.profile.service.IProfileManisService$a */
    public interface AbstractC52889a {
        void onError(ErrorResultWrapper errorResultWrapper);

        void onSuccess(ProfileResponse profileResponse);
    }

    void fetchUserProfile(String str, AbstractC52889a aVar);

    void startContactsProfileActivityByChatterId(String str);
}
