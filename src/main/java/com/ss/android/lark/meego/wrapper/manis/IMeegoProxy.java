package com.ss.android.lark.meego.wrapper.manis;

import com.ss.android.lark.manis.annotation.RemoteService;
import ee.android.framework.manis.interfaces.IHookInterface;

@RemoteService
public interface IMeegoProxy extends IHookInterface {
    String getMeegoSignature();

    String getRpcPersistDyecpFd();

    String getTtFeatureEnv();

    void installPlugin(AbstractC44874a aVar);

    void openWebUrl(String str);
}
