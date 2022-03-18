package com.ss.android.lark.integrator.littleapp.manis;

import com.ss.android.lark.manis.annotation.RemoteService;
import ee.android.framework.manis.interfaces.IHookInterface;

@RemoteService
public interface GadgetProxy extends IHookInterface {
    void monitorEvent(String str, String str2, String str3, String str4);
}
