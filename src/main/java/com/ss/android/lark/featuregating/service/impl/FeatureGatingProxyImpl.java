package com.ss.android.lark.featuregating.service.impl;

import android.content.Context;
import com.ss.android.lark.featuregating.C37239a;
import com.ss.android.lark.featuregating.service.IFeatureGatingProxy;
import com.ss.android.lark.manis.annotation.RemoteServiceImpl;

@RemoteServiceImpl(service = IFeatureGatingProxy.class)
public class FeatureGatingProxyImpl implements IFeatureGatingProxy {
    private Context context;

    public FeatureGatingProxyImpl(Context context2) {
        this.context = context2;
    }

    @Override // com.ss.android.lark.featuregating.service.IFeatureGatingProxy
    public boolean isEnable(String str, boolean z) {
        return C37239a.m146648b().mo136952a(str, z);
    }
}
