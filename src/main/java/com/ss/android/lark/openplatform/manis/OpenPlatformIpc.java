package com.ss.android.lark.openplatform.manis;

import com.ss.android.lark.manis.annotation.RemoteService;
import ee.android.framework.manis.interfaces.IHookInterface;

@RemoteService
public interface OpenPlatformIpc extends IHookInterface {
    void startChatWindowActivityByChatIdAndPos(String str, int i);
}
