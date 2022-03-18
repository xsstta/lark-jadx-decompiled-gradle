package com.ss.android.lark.abtest.api.listener;

import android.app.Application;

public interface AbTestModuleDependency {
    <T> T getAbSettings(String str, Class<T> cls, T t);

    String getAbTestHost();

    Application getApp();

    int getTenantTag();

    String getUserId();

    boolean isAbTestEnable();

    boolean isDebug();

    void registerExperiments();
}
