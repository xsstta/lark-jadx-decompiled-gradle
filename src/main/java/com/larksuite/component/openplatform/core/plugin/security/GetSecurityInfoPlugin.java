package com.larksuite.component.openplatform.core.plugin.security;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.alibaba.fastjson.annotation.JSONField;
import com.larksuite.component.openplatform.core.plugin.OPPlugin;
import com.larksuite.framework.apiplugin.AbstractC25905b;
import com.larksuite.framework.apiplugin.LKEvent;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.larksuite.framework.apiplugin.common.C25920a;
import com.larksuite.framework.apiplugin.common.C25921b;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25897h;
import com.ss.android.lark.optrace.api.ILogger;
import com.ss.android.lark.p2069j.p2070a.C40632a;
import com.ss.ttm.player.MediaPlayer;
import com.tt.frontendapiinterface.ApiCallResultHelper;
import com.tt.miniapp.errorcode.ApiCode;
import com.tt.miniapp.util.C67044k;
import com.tt.miniapphost.p3371e.p3372a.C67500a;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class GetSecurityInfoPlugin extends OPPlugin {

    private static class GetSecurityInfoRequest extends C25920a {
        @JSONField(name = "blackAppList")
        public List<String> blackAppList;

        private GetSecurityInfoRequest() {
        }
    }

    private static class GetSecurityInfoResponse extends C25921b {
        @JSONField(name = "existBlackAppList")
        public List<String> existBlackAppList;
        @JSONField(name = "isCracked")
        public boolean isCracked;
        @JSONField(name = "isDebug")
        public boolean isDebug;
        @JSONField(name = "isEmulator")
        public boolean isEmulator;
        @JSONField(name = "timestamp")
        public long timestamp;

        private GetSecurityInfoResponse() {
        }
    }

    private String getSystemProperty(String str) throws Exception {
        Class<?> cls = Class.forName("android.os.SystemProperties");
        return (String) cls.getMethod("get", String.class).invoke(cls, str);
    }

    private boolean isAppCracked(ILogger aVar) {
        if (checkForBinary(aVar) || checkSuExists(aVar)) {
            return true;
        }
        return false;
    }

    private boolean checkForBinary(ILogger aVar) {
        String[] strArr = {"/system/bin/", "/system/xbin/", "/system/sbin/", "/system/sd/xbin/", "/system/usr/we-need-root/", "/sbin/", "/vendor/bin/", "/usr/local/bin/", "/data/local/", "/data/local/bin/", "/data/local/xbin/", "/cache/", "/data/", "/dev/"};
        for (int i = 0; i < 14; i++) {
            try {
                if (new File(strArr[i] + "su").exists()) {
                    aVar.mo92224i("GetSecurityInfoPlugin", "find su in : " + strArr[i]);
                    return true;
                }
            } catch (Exception e) {
                aVar.mo92223e("GetSecurityInfoPlugin", e);
            }
        }
        return false;
    }

    private boolean checkSuExists(ILogger aVar) {
        Process process = null;
        try {
            process = Runtime.getRuntime().exec(new String[]{"which", "su"});
            if (new BufferedReader(new InputStreamReader(process.getInputStream())).readLine() != null) {
                if (process != null) {
                    process.destroy();
                }
                return true;
            }
            if (process != null) {
                process.destroy();
            }
            return false;
        } catch (Throwable th) {
            if (process != null) {
                process.destroy();
            }
            throw th;
        }
    }

    private boolean isEmulator(ILogger aVar, Context context) {
        boolean z;
        try {
            if (getSystemProperty("ro.kernel.qemu").equals("1")) {
                return true;
            }
        } catch (Exception e) {
            aVar.mo92223e("GetSecurityInfoPlugin", e);
        }
        Intent intent = new Intent();
        intent.setData(Uri.parse("tel:123456"));
        intent.setAction("android.intent.action.DIAL");
        if (intent.resolveActivity(context.getPackageManager()) != null) {
            z = true;
        } else {
            z = false;
        }
        if (Build.FINGERPRINT.startsWith("generic") || Build.FINGERPRINT.toLowerCase().contains("vbox") || Build.FINGERPRINT.toLowerCase().contains("test-keys") || Build.MODEL.contains("google_sdk") || Build.MODEL.contains("Emulator") || Build.MODEL.contains("Android SDK built for x86") || Build.MANUFACTURER.contains("Genymotion") || ((Build.BRAND.startsWith("generic") && Build.DEVICE.startsWith("generic")) || "google_sdk".equals(Build.PRODUCT) || ((TelephonyManager) context.getSystemService("phone")).getNetworkOperatorName().toLowerCase().equals("android") || !z)) {
            return true;
        }
        return false;
    }

    private List<String> getExistAppList(Context context, ILogger aVar, List<String> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (String str : list) {
                if (checkAppExist(context, str, aVar)) {
                    arrayList.add(C67044k.m261294b(str));
                }
            }
        } else {
            aVar.mo92223e("GetSecurityInfoPlugin", "blackAppList null");
        }
        return arrayList;
    }

    private boolean checkAppExist(Context context, String str, ILogger aVar) {
        if (TextUtils.isEmpty(str) || !getApiDependency().mo235052f("openplatform.gadget.check_app.enable")) {
            aVar.mo92224i("GetSecurityInfoPlugin", "package: " + str + ", fg: " + getApiDependency().mo235052f("openplatform.gadget.check_app.enable"));
            return false;
        }
        try {
            context.getPackageManager().getPackageInfo(str, MediaPlayer.MEDIA_PLAYER_OPTION_APPID);
            aVar.mo92224i("GetSecurityInfoPlugin", "exist app: " + str);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    @LKPluginFunction(async = true, eventName = {"getSecurityInfo"})
    public void handleSecureInfoCollect(LKEvent lKEvent, GetSecurityInfoRequest getSecurityInfoRequest, AbstractC25905b bVar, AbstractC25897h<GetSecurityInfoResponse> hVar) {
        boolean z;
        GetSecurityInfoResponse getSecurityInfoResponse = new GetSecurityInfoResponse();
        ILogger b = lKEvent.mo92134c().mo92190b();
        try {
            long currentTimeMillis = System.currentTimeMillis();
            getSecurityInfoResponse.existBlackAppList = getExistAppList(bVar.mo92207a(), b, getSecurityInfoRequest.blackAppList);
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            if (Settings.Secure.getInt(bVar.mo92207a().getContentResolver(), "adb_enabled", 0) > 0) {
                z = true;
            } else {
                z = false;
            }
            getSecurityInfoResponse.isDebug = z;
            getSecurityInfoResponse.timestamp = System.currentTimeMillis();
            getSecurityInfoResponse.isEmulator = isEmulator(b, bVar.mo92207a());
            getSecurityInfoResponse.isCracked = isAppCracked(b);
            new C67500a(C40632a.f103059a, getAppContext()).addCategoryValue("checkBlockAppDuration", Long.toString(currentTimeMillis2)).addCategoryValue("existBlackAppList", getSecurityInfoResponse.existBlackAppList).addCategoryValue("isCracked", Boolean.valueOf(getSecurityInfoResponse.isCracked)).addCategoryValue("isDebug", Boolean.valueOf(getSecurityInfoResponse.isDebug)).addCategoryValue("isEmulator", Boolean.valueOf(getSecurityInfoResponse.isEmulator)).flush();
            hVar.callback(getSecurityInfoResponse);
        } catch (Exception e) {
            b.mo92223e("GetSecurityInfoPlugin", e);
            new C67500a(C40632a.f103060b, getAppContext()).flush();
            getSecurityInfoResponse.mErrorCode = ApiCode.GENERAL_UNKONW_ERROR.code;
            getSecurityInfoResponse.mErrorMessage = ApiCallResultHelper.generateThrowableExtraInfo(e);
            hVar.callback(getSecurityInfoResponse);
        }
    }
}
