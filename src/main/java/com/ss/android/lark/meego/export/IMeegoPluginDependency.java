package com.ss.android.lark.meego.export;

import com.larksuite.framework.callback.IGetDataCallback;

public interface IMeegoPluginDependency {
    String getDeviceId();

    String getLanguage();

    String getNetProxy();

    String getRpcPersistDyecpFd();

    String getSession();

    String getTTEnv();

    String getTenantId();

    String getUsePpe();

    Boolean isBoeEnv();

    void openWebUrl(String str);

    void selectMyGroup(IGetDataCallback<ChatGroupInfo> iGetDataCallback);
}
