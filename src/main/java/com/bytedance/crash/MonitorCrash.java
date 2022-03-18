package com.bytedance.crash;

import android.content.Context;
import com.bytedance.crash.entity.C3744d;
import com.bytedance.crash.runtime.p229c.C3848b;
import com.bytedance.crash.upload.C3906h;
import com.bytedance.crash.upload.C3908i;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public class MonitorCrash {
    private static volatile boolean sAppMonitorCrashInit;
    Config mConfig;
    AttachUserData mCustomData;
    AttachUserData mCustomLongData;
    HeaderParams mParams;
    HashMap<String, String> mTagMap = new HashMap<>();

    public interface HeaderParams {
        Map<String, Object> getCommonParams();
    }

    public Config config() {
        return this.mConfig;
    }

    public MonitorCrash setCustomDataCallback(AttachUserData attachUserData) {
        this.mCustomData = attachUserData;
        return this;
    }

    public MonitorCrash withOtherHeaders(HeaderParams headerParams) {
        this.mParams = headerParams;
        return this;
    }

    public class Config {
        public String mAid;
        String mChannel;
        String mDeviceId;
        String mPackageName;
        String[] mSoList;
        long mUID;
        long mVersionInt = -1;
        String mVersionStr;
        boolean test;

        public Config setChannel(String str) {
            this.mChannel = str;
            C3848b.m15952c();
            return this;
        }

        public Config setDeviceId(String str) {
            this.mDeviceId = str;
            C3848b.m15952c();
            return this;
        }

        public Config setPackageName(String str) {
            this.mPackageName = str;
            C3848b.m15952c();
            return this;
        }

        public Config setSoList(String[] strArr) {
            this.mSoList = strArr;
            C3848b.m15952c();
            return this;
        }

        public Config setUID(long j) {
            this.mUID = j;
            C3848b.m15952c();
            return this;
        }

        public Config() {
        }
    }

    public MonitorCrash addTags(String str, String str2) {
        this.mTagMap.put(str, str2);
        return this;
    }

    public void reportCustomErr(String str, String str2, Throwable th) {
        C3906h.m16180a(this, th, str, true, null, str2, "core_exception_monitor");
    }

    private MonitorCrash(Context context, String str, long j, String str2) {
        Config config = new Config();
        this.mConfig = config;
        config.mAid = str;
        this.mConfig.mVersionInt = j;
        this.mConfig.mVersionStr = str2;
        C3756h.m15535a(context, this);
    }

    private MonitorCrash(String str, long j, String str2, String str3) {
        Config config = new Config();
        this.mConfig = config;
        config.mAid = str;
        this.mConfig.mVersionInt = j;
        this.mConfig.mVersionStr = str2;
        this.mConfig.mPackageName = str3;
        C3756h.m15536a(this);
    }

    public static MonitorCrash init(Context context, String str, long j, String str2) {
        if (sAppMonitorCrashInit) {
            return null;
        }
        synchronized (MonitorCrash.class) {
            if (sAppMonitorCrashInit) {
                return null;
            }
            sAppMonitorCrashInit = true;
            C3775n.m15624a(context, true, true, true, true, 0);
            return new MonitorCrash(context, str, j, str2);
        }
    }

    public void reportEvent(String str, int i, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        C3908i.m16191a(this, C3744d.m15481a(str, i, null, jSONObject, jSONObject2, jSONObject3));
    }

    public static MonitorCrash initSDK(Context context, String str, long j, String str2, String str3) {
        C3775n.m15624a(context, true, true, true, true, 0);
        MonitorCrash monitorCrash = new MonitorCrash(str, j, str2, str3);
        monitorCrash.config().setPackageName(str3);
        return monitorCrash;
    }

    public static MonitorCrash initSDK(Context context, String str, long j, String str2, String str3, String[] strArr) {
        C3775n.m15624a(context, true, true, true, true, 0);
        MonitorCrash monitorCrash = new MonitorCrash(str, j, str2, str3);
        monitorCrash.config().setPackageName(str3).setSoList(strArr);
        return monitorCrash;
    }
}
