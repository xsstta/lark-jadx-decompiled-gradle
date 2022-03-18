package com.ss.android.lark.featuregating.service;

import com.ss.android.lark.manis.annotation.RemoteService;
import ee.android.framework.manis.interfaces.IHookInterface;

@RemoteService
public interface IFeatureGatingProxy extends IHookInterface {
    boolean isEnable(String str, boolean z);
}
