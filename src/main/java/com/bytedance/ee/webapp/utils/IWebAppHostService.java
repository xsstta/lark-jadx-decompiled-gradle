package com.bytedance.ee.webapp.utils;

import com.ss.android.lark.manis.annotation.RemoteService;
import ee.android.framework.manis.interfaces.IHookInterface;
import java.util.ArrayList;

@RemoteService
public interface IWebAppHostService extends IHookInterface {
    void setInspectDebugList(ArrayList<String> arrayList);

    void tryKillAllBrandProcess();
}
