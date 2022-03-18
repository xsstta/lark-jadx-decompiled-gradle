package com.ss.android.lark.dynamicconfig.service.impl;

import android.content.Context;
import com.bytedance.lark.pb.basic.v1.DomainSettings;
import com.ss.android.lark.dynamicconfig.interfaces.IDynamicManisService;
import com.ss.android.lark.manis.annotation.RemoteServiceImpl;

@RemoteServiceImpl(service = IDynamicManisService.class)
public class DynamicManisServiceImpl implements IDynamicManisService {
    private Context mContext;

    public DynamicManisServiceImpl(Context context) {
        this.mContext = context;
    }

    @Override // com.ss.android.lark.dynamicconfig.interfaces.IDynamicManisService
    public String getDynamicDomain(int i) {
        return C36885b.m145580c().mo136164a(DomainSettings.Alias.fromValue(i));
    }
}
