package com.ss.ttvideoengine.preload;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public class PreloadScene {
    private List<PreloadTaskConfig> configs;
    private String mAlgorithmName;
    public int mAutoPlay;
    private String mConfigString;
    public int mMaxVisibleCardCnt = 1;
    public int mMute;
    public String mSceneId;

    public String toJsonString() {
        HashMap hashMap = new HashMap();
        hashMap.put("scene_id", this.mSceneId);
        hashMap.put("auto_play", Integer.valueOf(this.mAutoPlay));
        hashMap.put("mute", Integer.valueOf(this.mMute));
        hashMap.put("card_cnt", Integer.valueOf(this.mMaxVisibleCardCnt));
        hashMap.put("json", this.mConfigString);
        return new JSONObject(hashMap).toString();
    }

    public void setAlgorithmName(String str) {
        this.mAlgorithmName = str;
    }

    public void setConfigs(List<PreloadTaskConfig> list) {
        this.configs = list;
    }

    public PreloadScene(String str) {
        this.mSceneId = str;
    }

    public void setConfigJsonString(String str) {
        this.mConfigString = str;
        if (!TextUtils.isEmpty(str)) {
            try {
                this.mAlgorithmName = new JSONObject(str).getJSONObject("preload_strategy").getString("name");
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }
}
