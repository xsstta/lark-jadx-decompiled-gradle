package com.ss.android.lark.dynamicconfig.interfaces;

import com.ss.android.lark.manis.annotation.RemoteService;
import ee.android.framework.manis.interfaces.IHookInterface;

@RemoteService
public interface IDynamicManisService extends IHookInterface {
    String getDynamicDomain(int i);
}
