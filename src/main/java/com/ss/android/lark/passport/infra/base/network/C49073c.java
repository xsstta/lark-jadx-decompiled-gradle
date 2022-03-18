package com.ss.android.lark.passport.infra.base.network;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.infra.model.C49121a;
import com.ss.android.lark.passport.infra.service.ServiceFinder;
import com.ss.android.lark.passport.signinsdk_api.entity.DeviceInfo;

/* renamed from: com.ss.android.lark.passport.infra.base.network.c */
public class C49073c {
    /* renamed from: a */
    public static boolean m193391a() {
        return ServiceFinder.m193752g().getCommonEnv().isOverSea();
    }

    /* renamed from: a */
    public static String m193390a(String str) {
        String str2;
        JSONObject jSONObject = new JSONObject();
        if (!TextUtils.isEmpty(str)) {
            jSONObject.put("device_id", (Object) str);
        }
        jSONObject.put("terminal_type", (Object) Integer.valueOf(TerminalType.ANDROID.getValue()));
        DeviceInfo deviceInfo = ServiceFinder.m193761p().getDeviceInfo();
        String deviceName = deviceInfo.getDeviceName();
        if (!TextUtils.isEmpty(deviceName)) {
            jSONObject.put("device_name", (Object) deviceName);
        }
        String deviceModel = deviceInfo.getDeviceModel();
        if (!TextUtils.isEmpty(deviceModel)) {
            jSONObject.put("device_model", (Object) deviceModel);
        }
        String deviceOs = deviceInfo.getDeviceOs();
        if (!TextUtils.isEmpty(deviceOs)) {
            jSONObject.put("device_os", (Object) deviceOs);
        }
        Context applicationContext = ServiceFinder.m193748c().getApplicationContext();
        String packageName = applicationContext.getPackageName();
        if (!TextUtils.isEmpty(packageName)) {
            jSONObject.put("package_name", (Object) packageName);
        }
        try {
            str2 = applicationContext.getPackageManager().getPackageInfo(applicationContext.getPackageName(), 0).versionName;
        } catch (Exception e) {
            PassportLog.f123351c.mo171474a().mo171462a("HttpConfig", "getDeviceInfo error", e);
            str2 = "";
        }
        if (!TextUtils.isEmpty(str2)) {
            jSONObject.put("lark_version", (Object) str2);
        }
        String buildPackageChannel = ServiceFinder.m193752g().getBuildPackageChannel(ServiceFinder.m193748c().getApplicationContext());
        if (!TextUtils.isEmpty(buildPackageChannel)) {
            jSONObject.put("channel", (Object) buildPackageChannel);
        }
        jSONObject.put("tt_app_id", (Object) Integer.valueOf(C49121a.m193727a().mo171508c()));
        String appsFlyerUID = ServiceFinder.m193752g().getAppsFlyerUID();
        if (!TextUtils.isEmpty(appsFlyerUID)) {
            jSONObject.put("af_id", (Object) appsFlyerUID);
        }
        jSONObject.put("is_lark", (Object) Boolean.valueOf(ServiceFinder.m193748c().isLarkPackage()));
        return jSONObject.toJSONString();
    }
}
