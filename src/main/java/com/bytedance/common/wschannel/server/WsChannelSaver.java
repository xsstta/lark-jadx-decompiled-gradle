package com.bytedance.common.wschannel.server;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.common.wschannel.WsChannelSettings;
import com.bytedance.common.wschannel.app.IWsApp;
import com.bytedance.common.wschannel.model.SsWsApp;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONArray;

class WsChannelSaver {
    private static final String TAG = "WsChannelSaver";
    private final Context mContext;

    /* access modifiers changed from: package-private */
    public Map<Integer, IWsApp> loadWsChannels() {
        JSONArray jSONArray;
        int length;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            String wsApp = WsChannelSettings.inst(this.mContext).getWsApp();
            String str = TAG;
            Logger.m15167d(str, "load from sp : " + wsApp);
            if (TextUtils.isEmpty(wsApp) || (length = (jSONArray = new JSONArray(wsApp)).length()) <= 0) {
                return linkedHashMap;
            }
            for (int i = 0; i < length; i++) {
                SsWsApp buildFromJson = new SsWsApp.SsWsAppBuilder().buildFromJson(jSONArray.optJSONObject(i));
                if (checkValidWsApp(buildFromJson)) {
                    linkedHashMap.put(Integer.valueOf(WsChannelService.getClientKey(buildFromJson)), buildFromJson);
                }
            }
            return linkedHashMap;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    WsChannelSaver(Context context) {
        this.mContext = context;
    }

    private boolean checkValidWsApp(IWsApp iWsApp) {
        if (iWsApp != null && iWsApp.getChannelId() > 0 && iWsApp.getAppId() > 0 && !StringUtils.isEmpty(iWsApp.getAppKey()) && iWsApp.getAppVersion() > 0 && !iWsApp.getConnectUrls().isEmpty() && !StringUtils.isEmpty(iWsApp.getDeviceId()) && iWsApp.getFPID() > 0 && !StringUtils.isEmpty(iWsApp.getInstallId()) && iWsApp.getPlatform() == 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public void saveWsChannels(Map<Integer, IWsApp> map) {
        if (map != null) {
            JSONArray jSONArray = new JSONArray();
            synchronized (WsChannelService.class) {
                for (Map.Entry<Integer, IWsApp> entry : map.entrySet()) {
                    try {
                        if (checkValidWsApp(entry.getValue())) {
                            jSONArray.put(entry.getValue().toJson());
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
            try {
                String str = TAG;
                Logger.m15167d(str, "save to sp : " + jSONArray.toString());
                WsChannelSettings.inst(this.mContext).setWsApp(jSONArray.toString());
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
}
