package com.ss.android.lark.platform.applink;

import com.ss.android.lark.applink.AppLink;
import com.ss.android.lark.manis.annotation.RemoteService;
import ee.android.framework.manis.interfaces.IHookInterface;

@RemoteService
public interface AppLinkProxy extends IHookInterface {
    void handle(String str, AppLink appLink);
}
