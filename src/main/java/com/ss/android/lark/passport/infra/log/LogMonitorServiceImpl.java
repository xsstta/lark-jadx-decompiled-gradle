package com.ss.android.lark.passport.infra.log;

import android.content.Context;
import com.ss.android.lark.manis.annotation.RemoteServiceImpl;

@RemoteServiceImpl(service = ILogMonitorService.class)
public class LogMonitorServiceImpl implements ILogMonitorService {
    private final Context mContext;

    @Override // com.ss.android.lark.passport.infra.log.ILogMonitorService
    public String getTraceId() {
        return MonitorUtil.m193716b();
    }

    @Override // com.ss.android.lark.passport.infra.log.ILogMonitorService
    public Integer getMsgId() {
        return Integer.valueOf(MsgIdUtil.m193726a());
    }

    public LogMonitorServiceImpl(Context context) {
        this.mContext = context;
    }
}
