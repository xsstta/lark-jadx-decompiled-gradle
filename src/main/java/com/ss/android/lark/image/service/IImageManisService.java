package com.ss.android.lark.image.service;

import com.ss.android.lark.biz.core.api.EncryptImageData;
import com.ss.android.lark.manis.annotation.RemoteCallback;
import com.ss.android.lark.manis.annotation.RemoteService;
import ee.android.framework.manis.interfaces.IHookInterface;

@RemoteService
public interface IImageManisService extends IHookInterface {

    @RemoteCallback
    /* renamed from: com.ss.android.lark.image.service.IImageManisService$a */
    public interface AbstractC38924a {
        void onError(ErrorResultWrapper errorResultWrapper);

        void onSuccess(EncryptImageData encryptImageData);
    }

    void uploadEncryptImage(String str, boolean z, boolean z2, AbstractC38924a aVar);
}
