package com.ss.android.lark.chat.service;

import com.ss.android.lark.manis.annotation.RemoteService;
import ee.android.framework.manis.interfaces.IHookInterface;

@RemoteService
public interface IChatManisService extends IHookInterface {
    void openChatByChatId(String str);

    void openChatByChatterId(String str);
}
