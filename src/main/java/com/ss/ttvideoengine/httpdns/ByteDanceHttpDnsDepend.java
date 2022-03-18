package com.ss.ttvideoengine.httpdns;

import android.content.Context;

public interface ByteDanceHttpDnsDepend {
    String getAppId();

    Context getContext();

    String getHttpdnsAccountID();

    String getHttpdnsSecretKey();

    long getHttpdnsTemporaryKeyTimeStamp();

    String[] getPreloadDomains();

    boolean isTemporaryAuthentication();
}
