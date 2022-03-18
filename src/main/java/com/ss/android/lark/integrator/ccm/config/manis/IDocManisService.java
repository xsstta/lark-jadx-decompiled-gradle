package com.ss.android.lark.integrator.ccm.config.manis;

import com.ss.android.lark.manis.annotation.RemoteCallback;
import com.ss.android.lark.manis.annotation.RemoteService;
import ee.android.framework.manis.interfaces.IHookInterface;

@RemoteService
public interface IDocManisService extends IHookInterface {

    @RemoteCallback
    /* renamed from: com.ss.android.lark.integrator.ccm.config.manis.IDocManisService$a */
    public interface AbstractC39271a {
        /* renamed from: a */
        void mo143141a();
    }

    void onDocInitReady(AbstractC39271a aVar);
}
