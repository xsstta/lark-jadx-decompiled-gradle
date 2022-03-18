package com.larksuite.component.openplatform.core.plugin.device.p1133d;

import android.net.wifi.WifiManager;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.tt.miniapp.errorcode.ApiCode;
import com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65797c;
import com.tt.miniapphost.AppbrandContext;
import com.tt.refer.common.annotation.ApiSupportType;
import com.tt.refer.common.base.AppType;
import com.tt.refer.p3400a.p3401a.p3402a.C67701b;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

@ApiSupportType(apiName = {"getWifiStatus"}, support = {AppType.WebAPP}, testSupport = {AppType.GadgetAPP})
/* renamed from: com.larksuite.component.openplatform.core.plugin.device.d.h */
public class C24826h extends AbstractC65797c {
    public C24826h() {
    }

    @Override // com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65792a
    /* renamed from: a */
    public List<String> mo87215a() {
        return Collections.singletonList("getWifiStatus");
    }

    @Override // com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65797c
    /* renamed from: a */
    public void mo87216a(C67701b bVar) {
        String str;
        WifiManager wifiManager = (WifiManager) AppbrandContext.getInst().getApplicationContext().getSystemService("wifi");
        if (wifiManager != null) {
            if (wifiManager.isWifiEnabled()) {
                str = "on";
            } else {
                str = "off";
            }
            HashMap<String, Object> hashMap = new HashMap<>();
            hashMap.put(UpdateKey.STATUS, str);
            mo230487a(hashMap);
            return;
        }
        mo230481a(ApiCode.GENERAL_UNKONW_ERROR);
    }

    public C24826h(String str, IAppContext iAppContext) {
        super(str, iAppContext);
    }
}
