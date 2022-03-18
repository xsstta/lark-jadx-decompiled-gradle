package com.ss.ttvideoengine.setting;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.p234e.AbstractC4028e;
import com.bytedance.p234e.C4022a;
import com.bytedance.p234e.C4031g;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;
import com.ss.ttm.player.TTPlayerConfiger;
import com.ss.ttvideoengine.AppInfo;
import com.ss.ttvideoengine.BuildConfig;
import com.ss.ttvideoengine.DataLoaderHelper;
import com.ss.ttvideoengine.TTVideoEngineConfig;
import com.ss.ttvideoengine.net.TTHTTPNetwork;
import com.ss.ttvideoengine.net.TTVNetClient;
import com.ss.ttvideoengine.utils.Error;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public class SettingsHelper {
    public static int HARDWARE_CONFIG_SETTINGS = 3;
    public static int HARDWARE_CONFIG_VIDEO_MODEL = 2;
    public static String MODULE_MDL = "mdl";
    public static String MODULE_VOD = "vod";
    public static String REGION_CN = C4022a.f12191a;
    public static String REGION_SG = C4022a.f12193c;
    public static String REGION_US = C4022a.f12192b;
    private static String TAG = "SettingsHelper";
    private Context mContext;
    private boolean mDebug;
    private int mEnable;
    private String mMdlVersion;
    public TTVNetClient mNetClient;
    private String mPlayerVersion;
    private C4031g mSettingsManager;

    private String _sdkVersion() {
        return BuildConfig.VERSION_NAME;
    }

    private String _settingsVersion() {
        return "1.9.0";
    }

    private String _strategyVersion() {
        return "3.56.0";
    }

    /* access modifiers changed from: private */
    public static class HelperHolder {
        public static final SettingsHelper Instance = new SettingsHelper();

        private HelperHolder() {
        }
    }

    public C4031g settings() {
        return this.mSettingsManager;
    }

    public SettingsHelper loadMDLCache() {
        C4031g gVar;
        if (!(this.mContext == null || (gVar = this.mSettingsManager) == null)) {
            gVar.mo15780a(2);
        }
        return this;
    }

    private String _mdlVersion() {
        if (this.mMdlVersion == null) {
            this.mMdlVersion = DataLoaderHelper.getDataLoader().getStringValue(6);
        }
        return this.mMdlVersion;
    }

    private String _playerVersion() {
        if (this.mPlayerVersion == null) {
            this.mPlayerVersion = TTPlayerConfiger.getValue(14, "");
        }
        return this.mPlayerVersion;
    }

    public static SettingsHelper helper() {
        if (HelperHolder.Instance.mSettingsManager == null) {
            HelperHolder.Instance.mSettingsManager = C4031g.m16731a();
        }
        return HelperHolder.Instance;
    }

    public SettingsHelper config() {
        if (!TextUtils.isEmpty(AppInfo.mRegion)) {
            if (AppInfo.mRegion.equals("cn-north-1")) {
                C4022a.m16703a(C4022a.f12191a);
            } else {
                C4022a.m16703a(AppInfo.mRegion);
            }
        }
        HashMap hashMap = new HashMap();
        hashMap.put("aid", Integer.valueOf(AppInfo.mAppID));
        hashMap.put("app_name", AppInfo.mAppName);
        hashMap.put("device_id", AppInfo.mDeviceId);
        hashMap.put("app_channel", AppInfo.mAppChannel);
        hashMap.put("app_version", AppInfo.mAppVersion);
        C4022a.m16704a(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("sdk_version", _sdkVersion());
        hashMap2.put("player_version", _playerVersion());
        hashMap2.put("mdl_version", _mdlVersion());
        hashMap2.put("st_version", _strategyVersion());
        hashMap2.put("settings_version", _settingsVersion());
        C4022a.m16707b(hashMap2);
        return this;
    }

    public void setDebug(boolean z) {
        this.mDebug = z;
    }

    public JSONObject getMDLJsonObject(String str) {
        if (this.mEnable == 0) {
            return null;
        }
        return this.mSettingsManager.mo15786b("mdl", str);
    }

    public JSONArray getVodJsonArray(String str) {
        if (this.mEnable == 0) {
            return null;
        }
        return this.mSettingsManager.mo15785b(str);
    }

    public JSONObject getVodJsonObject(String str) {
        if (this.mEnable == 0) {
            return null;
        }
        return this.mSettingsManager.mo15786b("vod", str);
    }

    public SettingsHelper load(String str) {
        C4031g gVar;
        if (!(this.mEnable == 0 || this.mContext == null || (gVar = this.mSettingsManager) == null)) {
            gVar.mo15784a(str, true);
        }
        return this;
    }

    public SettingsHelper setContext(Context context) {
        this.mContext = context;
        C4031g gVar = this.mSettingsManager;
        if (gVar != null) {
            gVar.mo15775a(context);
            this.mSettingsManager.mo15777a(this.mDebug);
            this.mSettingsManager.mo15776a(new AbstractC4028e() {
                /* class com.ss.ttvideoengine.setting.SettingsHelper.C654771 */

                @Override // com.bytedance.p234e.AbstractC4028e
                public void cancel() {
                    if (SettingsHelper.this.mNetClient != null) {
                        SettingsHelper.this.mNetClient.cancel();
                    }
                }

                @Override // com.bytedance.p234e.AbstractC4028e
                public void start(String str, Map<String, String> map, final AbstractC4028e.AbstractC4029a aVar) {
                    synchronized (this) {
                        if (SettingsHelper.this.mNetClient == null) {
                            if (TTVideoEngineConfig.gNetClient != null) {
                                SettingsHelper.this.mNetClient = TTVideoEngineConfig.gNetClient;
                            } else {
                                SettingsHelper.this.mNetClient = new TTHTTPNetwork();
                            }
                        }
                        SettingsHelper.this.mNetClient.startTask(SettingsHelper.this.buildURLString(str, map), null, new TTVNetClient.CompletionListener() {
                            /* class com.ss.ttvideoengine.setting.SettingsHelper.C654771.C654781 */

                            @Override // com.ss.ttvideoengine.net.TTVNetClient.CompletionListener
                            public void onCompletion(JSONObject jSONObject, Error error) {
                                if (error != null) {
                                    AbstractC4028e.AbstractC4029a aVar = aVar;
                                    aVar.mo15766a(null, new Error(" fail. info: " + error.toString()));
                                } else if (jSONObject != null) {
                                    aVar.mo15766a(jSONObject, null);
                                }
                            }
                        });
                    }
                }
            });
        }
        return this;
    }

    public void setEnable(int i) {
        this.mEnable = i;
        if (C4022a.m16710c() != null) {
            config().load(MODULE_VOD);
        }
    }

    public int getMDLInt(String str, int i) {
        if (this.mEnable == 0) {
            return i;
        }
        return this.mSettingsManager.mo15773a("mdl", str, i);
    }

    public long getMDLLong(String str, long j) {
        if (this.mEnable == 0) {
            return j;
        }
        return this.mSettingsManager.mo15774a("mdl", str, j);
    }

    public String getMDLString(String str, String str2) {
        if (this.mEnable == 0) {
            return str2;
        }
        return this.mSettingsManager.mo15778a("mdl", str, str2);
    }

    public int getVodInt(String str, int i) {
        if (this.mEnable == 0) {
            return i;
        }
        return this.mSettingsManager.mo15773a("vod", str, i);
    }

    public long getVodLong(String str, long j) {
        if (this.mEnable == 0) {
            return j;
        }
        return this.mSettingsManager.mo15774a("vod", str, j);
    }

    public String getVodString(String str, String str2) {
        if (this.mEnable == 0) {
            return str2;
        }
        return this.mSettingsManager.mo15778a("vod", str, str2);
    }

    public SettingsHelper setRegionHost(int i, String str) {
        switch (i) {
            case SmEvents.EVENT_RS:
                C4022a.m16712d(str);
                break;
            case 117:
                C4022a.m16709c(str);
                break;
            case 118:
                C4022a.m16706b(str);
                break;
        }
        return this;
    }

    public String buildURLString(String str, Map<String, String> map) {
        if (str == null || map == null || map.isEmpty()) {
            return str;
        }
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            buildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
        }
        return buildUpon.build().toString();
    }
}
