package com.bytedance.ee.webapp.utils;

import android.content.Context;
import com.ss.android.lark.manis.annotation.RemoteServiceImpl;
import com.tt.miniapp.debug.InspectDebugHelper;
import java.util.ArrayList;

@RemoteServiceImpl(service = IWebAppHostService.class)
public class WebAppHostServiceImpl implements IWebAppHostService {
    @Override // com.bytedance.ee.webapp.utils.IWebAppHostService
    public void tryKillAllBrandProcess() {
        InspectDebugHelper.f166565a.mo230984b();
    }

    public WebAppHostServiceImpl(Context context) {
    }

    @Override // com.bytedance.ee.webapp.utils.IWebAppHostService
    public void setInspectDebugList(ArrayList<String> arrayList) {
        InspectDebugHelper.f166565a.mo230981a(arrayList);
    }
}
