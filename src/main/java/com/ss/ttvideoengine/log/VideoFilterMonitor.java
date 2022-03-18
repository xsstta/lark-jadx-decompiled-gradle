package com.ss.ttvideoengine.log;

import android.os.Bundle;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONObject;

public class VideoFilterMonitor {
    private final ArrayList<String> mHistoryList = new ArrayList<>();
    private boolean mIsFilterOn;

    public ArrayList<String> getList() {
        return this.mHistoryList;
    }

    private boolean isEyeProtectionModeOn(Bundle bundle) {
        int i = bundle.getInt("action");
        if (bundle.getInt("effect_type") != 2) {
            return false;
        }
        if (i == 21) {
            if (bundle.getInt("use_effect") == 1) {
                return true;
            }
            return false;
        } else if (i == 19 && bundle.getInt("int_value") == 1) {
            return true;
        } else {
            return false;
        }
    }

    private void updateHistory(boolean z) {
        String str;
        HashMap hashMap = new HashMap();
        if (z) {
            str = "1";
        } else {
            str = "0";
        }
        hashMap.put("on", str);
        hashMap.put("t", Long.valueOf(System.currentTimeMillis()));
        this.mHistoryList.add(new JSONObject(hashMap).toString());
    }

    public void setEffect(Bundle bundle) {
        if (bundle != null) {
            if (bundle.getInt("effect_type") != 2) {
                TTVideoEngineLog.m256500d("VideoFilterMonitor", "not eye protection filter bundle");
                return;
            }
            boolean isEyeProtectionModeOn = isEyeProtectionModeOn(bundle);
            if (isEyeProtectionModeOn != this.mIsFilterOn) {
                this.mIsFilterOn = isEyeProtectionModeOn;
                updateHistory(isEyeProtectionModeOn);
            }
        }
    }
}
