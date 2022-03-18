package com.ss.android.lark.browser.manis;

import com.ss.android.lark.manis.annotation.RemoteService;
import ee.android.framework.manis.interfaces.IHookInterface;
import java.util.List;
import java.util.Map;

@RemoteService
public interface AppConfig extends IHookInterface {
    List<String> getJSAPIWhiteList();

    int getSampleTextMaxContentLength();

    Map<String, String> getSchemaHandleList();

    List<String> getSecLinkWhiteList();

    boolean isUrlEnableForWebTranslate(String str);
}
