package com.bytedance.lynx.webview.glue.sdk111;

import android.content.Context;
import android.os.Handler;
import android.os.Trace;
import com.bytedance.lynx.webview.extension.C19933b;
import com.bytedance.lynx.webview.extension.C19935c;
import com.bytedance.lynx.webview.internal.AbstractC19937a;
import com.bytedance.lynx.webview.internal.AppInfo;
import com.bytedance.lynx.webview.internal.C19943g;
import com.bytedance.lynx.webview.internal.C19986s;
import com.bytedance.lynx.webview.internal.C20011y;
import com.bytedance.lynx.webview.util.C20048g;
import com.bytedance.lynx.webview.util.C20051j;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

public abstract class IGlueToSdk111 {
    public static void setHasLoadLibrary() {
        C20011y.m72997c();
    }

    public static boolean getAppInfoValid() {
        return C19986s.m72926b();
    }

    public static Context getResourcesContext() {
        return getApplicationContext();
    }

    public static Set<String> getTagList() {
        return C19935c.m72697a();
    }

    public static Handler getUIHandler() {
        return C20011y.m72990b();
    }

    public static Context getApplicationContext() {
        return C20011y.m72976a().mo67938u();
    }

    public static String getLoadSoVersionCode() {
        return C20011y.m72976a().mo67932g(true);
    }

    public static String getSoDirectory() {
        return C20011y.m72976a().mo67902F().mo67778d();
    }

    public static Map<String, String> getAppInfoData() {
        AbstractC19937a l = C20011y.m73014l();
        if (l == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        AppInfo a = l.mo67714a();
        hashMap.put("IId", a.getIId());
        hashMap.put("UserId", a.getUserId());
        hashMap.put("AppId", a.getAppId());
        hashMap.put("OSApi", a.getOSApi());
        hashMap.put("AbFlag", a.getAbFlag());
        hashMap.put("IId", a.getIId());
        hashMap.put("UserId", a.getUserId());
        hashMap.put("AppId", a.getAppId());
        hashMap.put("OSApi", a.getOSApi());
        hashMap.put("AbFlag", a.getAbFlag());
        hashMap.put("OpenVersion", a.getOpenVersion());
        hashMap.put("DeviceId", a.getDeviceId());
        hashMap.put("NetAccessType", a.getNetAccessType());
        hashMap.put("VersionCode", a.getVersionCode());
        hashMap.put("DeviceType", a.getDeviceType());
        hashMap.put("AppName", a.getAppName());
        hashMap.put("Channel", a.getChannel());
        hashMap.put("CityName", a.getCityName());
        hashMap.put("LiveSdkVersion", a.getLiveSdkVersion());
        hashMap.put("OSVersion", a.getOSVersion());
        hashMap.put("DevicePlatform", a.getDevicePlatform());
        hashMap.put("UUID", a.getUUID());
        hashMap.put("OpenUdid", a.getOpenUdid());
        hashMap.put("Resolution", a.getResolution());
        hashMap.put("AbVersion", a.getAbVersion());
        hashMap.put("AbClient", a.getAbClient());
        hashMap.put("AbFeature", a.getAbFeature());
        hashMap.put("DeviceBrand", a.getDeviceBrand());
        hashMap.put("Language", a.getLanguage());
        hashMap.put("VersionName", a.getVersionName());
        hashMap.put("SSmix", a.getSSmix());
        hashMap.put("UpdateVersionCode", a.getUpdateVersionCode());
        hashMap.put("ManifestVersionCode", a.getManifestVersionCode());
        hashMap.put("DPI", a.getDPI());
        hashMap.put("Rticket", a.getRticket());
        hashMap.put("Abi", a.getAbi());
        hashMap.put("HostFirst", a.getHostFirst());
        hashMap.put("HostSecond", a.getHostSecond());
        hashMap.put("HostThird", a.getHostThird());
        hashMap.put("DomainBase", a.getDomainBase());
        hashMap.put("DomainLog", a.getDomainLog());
        hashMap.put("DomainSub", a.getDomainSub());
        hashMap.put("DomainChannel", a.getDomainChannel());
        hashMap.put("DomainMon", a.getDomainMon());
        hashMap.put("DomainSec", a.getDomainSec());
        hashMap.put("IsMainProcess", a.getIsMainProcess());
        hashMap.put("StoreIdc", a.getStoreIdc());
        hashMap.put("Region", a.getRegion());
        hashMap.put("SysRegion", a.getSysRegion());
        hashMap.put("CarrierRegion", a.getCarrierRegion());
        return hashMap;
    }

    public static void glueSendAlog(String... strArr) {
        C20048g.m73163c(strArr);
    }

    public static String getCurProcessName(Context context) {
        if (context == null) {
            return C20051j.m73197c(getApplicationContext());
        }
        return C20051j.m73197c(context);
    }

    public static void ensureResourcesLoaded(Context context) {
        try {
            Trace.beginSection("ensureResourcesLoaded");
            C20011y.m72976a().mo67902F().mo67777c(context);
        } finally {
            Trace.endSection();
        }
    }

    public static void addEventExtentionInfo(String str, String str2) {
        C19943g.m72726a(str, str2);
    }

    public static void glueSendCategoryEvent(int i, JSONObject jSONObject) {
        C19943g.m72722a(i, jSONObject);
    }

    public static void nativeSendCategoryEvent(int i, JSONObject jSONObject) {
        C19943g.m72722a(i, jSONObject);
    }

    public static boolean registerPackageLoadedCallback(String str, Runnable runnable) {
        return C20011y.m72989a(str, runnable);
    }

    public static boolean getBooleanConfig(String str, boolean z) {
        return C19986s.m72924a().mo67858a(str, z);
    }

    public static int getIntConfig(String str, int i) {
        return C19986s.m72924a().mo67850a(str, i);
    }

    public static String getStringConfig(String str, String str2) {
        return C19986s.m72924a().mo67851a(str, str2);
    }

    public static void reportData(String str, Map<String, Object> map, Map<String, Object> map2) {
        C19943g.m72727a(str, map, map2);
    }

    public static boolean getProcessFeature(String str, int i, boolean z) {
        return C19986s.m72924a().mo67857a(str, i, z);
    }

    public static void onURLRequestCompletedForFlowCount(String str, long j, long j2, long j3, Set<String> set) {
        C19933b.m72695a(str, j, j2, j3, set);
    }
}
