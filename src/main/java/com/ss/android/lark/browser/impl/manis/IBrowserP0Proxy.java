package com.ss.android.lark.browser.impl.manis;

import com.ss.android.lark.manis.annotation.RemoteService;
import ee.android.framework.manis.interfaces.IHookInterface;

@RemoteService(hostProcess = "p0")
public interface IBrowserP0Proxy extends IHookInterface {
    void clearWebViewCache();

    void syncCookieOnAccountChange(boolean z, boolean z2);

    void syncCookieOnLocaleChange();

    void warmUp();
}
