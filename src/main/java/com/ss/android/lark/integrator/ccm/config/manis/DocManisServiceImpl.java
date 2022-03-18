package com.ss.android.lark.integrator.ccm.config.manis;

import android.content.Context;
import com.ss.android.lark.integrator.ccm.config.manis.IDocManisService;
import com.ss.android.lark.manis.annotation.RemoteServiceImpl;

@RemoteServiceImpl(service = IDocManisService.class)
public class DocManisServiceImpl implements IDocManisService {
    private Context mContext;

    @Override // com.ss.android.lark.integrator.ccm.config.manis.IDocManisService
    public void onDocInitReady(IDocManisService.AbstractC39271a aVar) {
        aVar.mo143141a();
    }

    public DocManisServiceImpl(Context context) {
        this.mContext = context;
    }
}
