package com.ss.android.lark.mail.impl.mulprocess.mainprocess;

import com.ss.android.lark.manis.annotation.RemoteService;
import ee.android.framework.manis.interfaces.IHookInterface;

@RemoteService
public interface IWebProcessLifecycle extends IHookInterface {
    void onProcessCreated();
}
