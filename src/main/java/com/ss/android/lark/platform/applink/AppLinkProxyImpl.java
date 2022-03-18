package com.ss.android.lark.platform.applink;

import android.content.Context;
import com.ss.android.lark.applink.AppLink;
import com.ss.android.lark.manis.annotation.RemoteServiceImpl;

@RemoteServiceImpl(service = AppLinkProxy.class)
public class AppLinkProxyImpl implements AppLinkProxy {
    private Context context;

    public AppLinkProxyImpl(Context context2) {
        this.context = context2;
    }

    @Override // com.ss.android.lark.platform.applink.AppLinkProxy
    public void handle(String str, AppLink appLink) {
        C51707a.m200495a().mo103472b(this.context, str, appLink);
    }
}
