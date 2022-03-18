package com.ss.android.lark.helpdesk.manis;

import com.ss.android.lark.manis.annotation.RemoteService;
import ee.android.framework.manis.interfaces.IHookInterface;

@RemoteService
public interface HelpdeskIpc extends IHookInterface {
    void openOncallChatId(String str, String str2, String str3);

    void openOncallChatId(String str, String str2, String str3, String str4);
}
