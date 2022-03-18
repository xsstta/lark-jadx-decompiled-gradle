package com.ss.android.lark.stepcount.service;

import com.ss.android.lark.manis.annotation.RemoteService;
import ee.android.framework.manis.interfaces.IHookInterface;

@RemoteService
public interface IStepCountManisService extends IHookInterface {
    int getDayStepCount();

    boolean getStepCountAuthorized();

    void setStepCountAuthorized(boolean z);
}
