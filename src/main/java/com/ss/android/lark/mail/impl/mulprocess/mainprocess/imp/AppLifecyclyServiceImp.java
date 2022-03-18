package com.ss.android.lark.mail.impl.mulprocess.mainprocess.imp;

import android.content.Context;
import com.ss.android.lark.mail.impl.mulprocess.mainprocess.IAppLifecycleService;
import com.ss.android.lark.mail.impl.service.C43345c;
import com.ss.android.lark.manis.annotation.RemoteServiceImpl;

@RemoteServiceImpl(service = IAppLifecycleService.class)
public class AppLifecyclyServiceImp implements IAppLifecycleService {
    private Context mContext;

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IAppLifecycleService
    public void entranceCompose() {
        C43345c.m172076m().mo155002h();
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IAppLifecycleService
    public void exitCompose() {
        C43345c.m172076m().mo155003i();
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IAppLifecycleService
    public boolean isComposeRunning() {
        return C43345c.m172076m().mo155004j();
    }

    public AppLifecyclyServiceImp(Context context) {
        this.mContext = context;
    }
}
