package com.ss.android.lark.stepcount.service.impl;

import android.content.Context;
import com.ss.android.lark.manis.annotation.RemoteServiceImpl;
import com.ss.android.lark.stepcount.service.IStepCountManisService;

@RemoteServiceImpl(service = IStepCountManisService.class)
public class StepCountManisServiceImpl implements IStepCountManisService {
    private Context mContext;

    @Override // com.ss.android.lark.stepcount.service.IStepCountManisService
    public int getDayStepCount() {
        return C54995a.m213613b().mo187802c();
    }

    @Override // com.ss.android.lark.stepcount.service.IStepCountManisService
    public boolean getStepCountAuthorized() {
        return C54995a.m213613b().mo187803d();
    }

    public StepCountManisServiceImpl(Context context) {
        this.mContext = context;
    }

    @Override // com.ss.android.lark.stepcount.service.IStepCountManisService
    public void setStepCountAuthorized(boolean z) {
        C54995a.m213613b().mo187801a(z);
    }
}
