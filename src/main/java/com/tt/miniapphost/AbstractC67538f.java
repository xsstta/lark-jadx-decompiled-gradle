package com.tt.miniapphost;

import com.tt.frontendapiinterface.IActivityLife;
import com.tt.frontendapiinterface.IJsBridge;
import com.tt.miniapphost.entity.AppInfoEntity;
import com.tt.miniapphost.p3374g.AbstractC67547a;

/* renamed from: com.tt.miniapphost.f */
public interface AbstractC67538f {
    IActivityLife getActivityLife();

    AppInfoEntity getAppInfo();

    String getCurrentPagePath();

    String getCurrentPageType();

    IJsBridge getJsBridge();

    AbstractC67547a getPreloadManager();

    String getSchema();

    AppInfoEntity getUpdateAppInfo();

    void invokeHandler(int i, int i2, String str);

    void onCreate();
}
