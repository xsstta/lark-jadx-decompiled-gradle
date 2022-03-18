package com.bytedance.ee.lark.infra.foundation.utils;

import com.ss.android.lark.opmonitor.model.OPMonitorCode;
import com.ss.android.lark.opmonitor.service.OPMonitor;

public interface IMonitorCreator {
    <T extends OPMonitor> T createOPMonitor(String str, OPMonitorCode oPMonitorCode);
}
