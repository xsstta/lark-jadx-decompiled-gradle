package com.ss.ttvideoengine.log;

import org.json.JSONObject;

public interface VideoEventEngineUploader {
    void onEvent(String str, JSONObject jSONObject);

    void onEventV2(String str, JSONObject jSONObject);
}
