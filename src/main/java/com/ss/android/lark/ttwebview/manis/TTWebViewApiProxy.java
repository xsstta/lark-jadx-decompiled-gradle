package com.ss.android.lark.ttwebview.manis;

import com.ss.android.lark.manis.annotation.RemoteService;
import ee.android.framework.manis.interfaces.IHookInterface;

@RemoteService
public interface TTWebViewApiProxy extends IHookInterface {
    void fetchWebViewCore(boolean z);

    String getLoadSoVersion();

    String getLocalSoVersion();
}
