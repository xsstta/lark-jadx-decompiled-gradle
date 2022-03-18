package com.larksuite.component.blockit.sub_process;

import com.ss.android.lark.manis.annotation.RemoteService;
import ee.android.framework.manis.interfaces.IHookInterface;

@RemoteService(hostProcess = "p0")
public interface IP0SubProcess extends IHookInterface {
    void triggerRefresh(String str);
}
