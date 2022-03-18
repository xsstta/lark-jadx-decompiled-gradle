package com.ss.android.lark.dynamicconfig.manis;

import android.content.Context;
import com.ss.android.lark.dynamicconfig.C36882a;
import com.ss.android.lark.manis.annotation.RemoteServiceImpl;

@RemoteServiceImpl(service = DynamicHostProxy.class)
public class DynamicHostProxyImpl implements DynamicHostProxy {
    private Context mContext;

    @Override // com.ss.android.lark.dynamicconfig.manis.DynamicHostProxy
    public String getDocMainDomain() {
        return C36882a.m145564h();
    }

    @Override // com.ss.android.lark.dynamicconfig.manis.DynamicHostProxy
    public String getMainDomain() {
        return C36882a.m145561e();
    }

    public DynamicHostProxyImpl(Context context) {
        this.mContext = context;
    }
}
