package com.larksuite.component.service;

import com.larksuite.component.dto.MetricIPCData;
import com.ss.android.lark.manis.annotation.RemoteService;
import ee.android.framework.manis.interfaces.IHookInterface;

@RemoteService
public interface IMetricManisService extends IHookInterface {
    void metricIPC(MetricIPCData metricIPCData);
}
