package com.ss.android.lark.wschannelprocess;

import com.ss.android.lark.manis.annotation.RemoteService;
import ee.android.framework.manis.interfaces.IHookInterface;

@RemoteService(hostProcess = "wschannel")
public interface IWschannelProcIPCServer extends IHookInterface {
    void dealMainProcDozeStateChange(boolean z);
}
