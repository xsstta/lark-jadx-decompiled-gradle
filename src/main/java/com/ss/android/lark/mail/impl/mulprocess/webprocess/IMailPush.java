package com.ss.android.lark.mail.impl.mulprocess.webprocess;

import com.ss.android.lark.mail.impl.mulprocess.entity.ByteArray;
import com.ss.android.lark.manis.annotation.RemoteService;
import ee.android.framework.manis.interfaces.IHookInterface;

@RemoteService(hostProcess = "mailweb")
public interface IMailPush extends IHookInterface {
    void push(int i, ByteArray byteArray, String str, boolean z, boolean z2);
}
