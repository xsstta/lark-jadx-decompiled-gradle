package com.larksuite.component.openplatform.core.container.crossprocess;

import com.ss.android.lark.manis.annotation.RemoteService;
import com.tt.miniapphost.process.data.CrossProcessCallEntity;
import ee.android.framework.manis.interfaces.IHookInterface;

@RemoteService(hostProcess = "p0")
public interface IP0ProcessHandleEvent extends IHookInterface {
    void callP0Process(CrossProcessCallEntity crossProcessCallEntity, int i);
}
