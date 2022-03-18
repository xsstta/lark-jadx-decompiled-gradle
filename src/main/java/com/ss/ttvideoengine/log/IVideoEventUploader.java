package com.ss.ttvideoengine.log;

import org.json.JSONObject;

public interface IVideoEventUploader {
    void onUplaod(String str, JSONObject jSONObject);
}
