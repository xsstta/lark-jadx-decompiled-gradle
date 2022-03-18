package com.ss.android.lark.passport.infra.log;

import com.ss.android.lark.manis.annotation.RemoteService;
import ee.android.framework.manis.interfaces.IHookInterface;

@RemoteService
public interface ILogMonitorService extends IHookInterface {
    Integer getMsgId();

    String getTraceId();
}
