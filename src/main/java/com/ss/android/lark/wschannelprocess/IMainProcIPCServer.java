package com.ss.android.lark.wschannelprocess;

import com.ss.android.lark.manis.annotation.RemoteService;
import com.ss.android.lark.wschannelprocess.dto.AppLogEntity;
import com.ss.android.lark.wschannelprocess.dto.TeaLogEntity;
import ee.android.framework.manis.interfaces.IHookInterface;
import java.util.List;

@RemoteService
public interface IMainProcIPCServer extends IHookInterface {
    boolean getMainProcDozeState();

    void removeMainProcDozeStateForWhile();

    void uploadAppLogRecord(List<AppLogEntity> list);

    void uploadTeaRecord(List<TeaLogEntity> list);
}
