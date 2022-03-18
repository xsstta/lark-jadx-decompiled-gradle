package com.ss.android.lark.mail.impl.mulprocess.mainprocess;

import com.ss.android.lark.manis.annotation.RemoteService;
import ee.android.framework.manis.interfaces.IHookInterface;

@RemoteService
public interface IAppLifecycleService extends IHookInterface {
    void entranceCompose();

    void exitCompose();

    boolean isComposeRunning();
}
