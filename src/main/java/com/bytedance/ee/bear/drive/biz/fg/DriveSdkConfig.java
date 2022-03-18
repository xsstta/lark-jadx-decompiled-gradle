package com.bytedance.ee.bear.drive.biz.fg;

import com.bytedance.ee.bear.appsetting.C4211a;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.io.NonProguard;
import com.ss.android.lark.appsetting.annotation.AppConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@AppConfig(key = "drive_sdk_config")
public class DriveSdkConfig implements NonProguard {
    private static volatile DriveSdkConfig sDriveSdkConfig;
    private volatile Map<String, Map<String, ArrayList<Integer>>> previewTranfroms;

    private DriveSdkConfig() {
    }

    public Map<String, Map<String, ArrayList<Integer>>> getPreviewTranfroms() {
        if (this.previewTranfroms != null) {
            return this.previewTranfroms;
        }
        C13479a.m54758a("DriveSdk_DriveSdkConfig", "getPreviewTranfromsInApp() getPreviewTranfroms null return empty map");
        return new HashMap();
    }

    public String toString() {
        return "DriveSdkConfig{previewTranfroms=" + this.previewTranfroms + '}';
    }

    public static DriveSdkConfig getConfig() {
        if (sDriveSdkConfig == null) {
            synchronized (DriveSdkConfig.class) {
                if (sDriveSdkConfig == null) {
                    sDriveSdkConfig = (DriveSdkConfig) C4211a.m17514a().mo16532a("drive_sdk_config", DriveSdkConfig.class, new DriveSdkConfig());
                    C13479a.m54764b("DriveSdk_DriveSdkConfig", "init DriveSdkConfig=" + sDriveSdkConfig);
                }
            }
        }
        return sDriveSdkConfig;
    }

    public void setPreviewTranfroms(Map<String, Map<String, ArrayList<Integer>>> map) {
        this.previewTranfroms = map;
    }

    public Map<String, ArrayList<Integer>> getPreviewTranfromsInApp(String str) {
        Map<String, ArrayList<Integer>> map = getPreviewTranfroms().get(str);
        if (map != null) {
            return map;
        }
        C13479a.m54758a("DriveSdk_DriveSdkConfig", "getPreviewTranfromsInApp() get appid tranfoems null return empty map");
        return new HashMap();
    }
}
