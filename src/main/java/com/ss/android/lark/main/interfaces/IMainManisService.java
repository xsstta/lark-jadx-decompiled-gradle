package com.ss.android.lark.main.interfaces;

import com.ss.android.lark.manis.annotation.RemoteService;
import ee.android.framework.manis.interfaces.IHookInterface;

@RemoteService
public interface IMainManisService extends IHookInterface {
    void openLostPage(String str);
}
