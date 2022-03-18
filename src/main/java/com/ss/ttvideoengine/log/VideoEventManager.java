package com.ss.ttvideoengine.log;

import android.content.Context;
import android.provider.Settings;
import com.ss.ttvideoengine.utils.EngineThreadPool;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import org.json.JSONArray;
import org.json.JSONObject;

public enum VideoEventManager {
    instance;
    
    private Context mContext;
    private VideoEventEngineUploader mEngineUploader;
    private JSONArray mJsonArray = new JSONArray();
    private JSONArray mJsonArrayV2 = new JSONArray();
    private VideoEventListener mListener;
    private int mLoggerVersion = 2;
    private IVideoEventUploader mUploader;

    private static class AsyncShowEventRunnable implements Runnable {
        private JSONObject mJsonObject;
        private VideoEventManager mVideoEventManager;

        public void run() {
            JSONObject jSONObject;
            VideoEventManager videoEventManager = this.mVideoEventManager;
            if (videoEventManager != null && (jSONObject = this.mJsonObject) != null) {
                videoEventManager.showEvent(jSONObject);
            }
        }

        public AsyncShowEventRunnable(VideoEventManager videoEventManager, JSONObject jSONObject) {
            this.mVideoEventManager = videoEventManager;
            this.mJsonObject = jSONObject;
        }
    }

    public synchronized JSONArray popAllEvents() {
        JSONArray jSONArray;
        jSONArray = this.mJsonArray;
        this.mJsonArray = new JSONArray();
        return jSONArray;
    }

    public int getLoggerVersion() {
        TTVideoEngineLog.m256503e("VideoEventManager", "getLoggerVersion: " + this.mLoggerVersion);
        return this.mLoggerVersion;
    }

    public JSONArray popAllEventsV2() {
        JSONArray jSONArray = this.mJsonArrayV2;
        synchronized (VideoEventManager.class) {
            this.mJsonArrayV2 = new JSONArray();
        }
        return jSONArray;
    }

    public void setListener(VideoEventListener videoEventListener) {
        this.mListener = videoEventListener;
    }

    public void setUploader(IVideoEventUploader iVideoEventUploader) {
        this.mUploader = iVideoEventUploader;
    }

    public void setContext(Context context) {
        this.mContext = context.getApplicationContext();
    }

    public synchronized void setEngineUploader(VideoEventEngineUploader videoEventEngineUploader) {
        this.mEngineUploader = videoEventEngineUploader;
    }

    public void setLoggerVersion(int i) {
        TTVideoEngineLog.m256503e("VideoEventManager", "setLoggerVersion: " + i);
        if (i == 1 || i == 2) {
            this.mLoggerVersion = i;
        }
    }

    private void showLongLog(String str) {
        if (str != null) {
            int i = 3900;
            if (str.length() > 3900) {
                int length = str.length();
                int i2 = 0;
                while (i < length) {
                    TTVideoEngineLog.m256505i("VideoEventManager", str.substring(i2, i));
                    i2 += 3900;
                    i = Math.min(i + 3900, length);
                }
                TTVideoEngineLog.m256505i("VideoEventManager", str.substring(i2, i));
                return;
            }
        }
        TTVideoEngineLog.m256505i("VideoEventManager", str);
    }

    public void showEvent(JSONObject jSONObject) {
        String str;
        if (((TTVideoEngineLog.LogNotifyLevel >> 2) & 1) == 1 || ((TTVideoEngineLog.LogTurnOn >> 2) & 1) == 1) {
            showLongLog(jSONObject.toString());
        }
        if (((TTVideoEngineLog.LogTurnOn >> 1) & 1) == 1) {
            Context context = this.mContext;
            if (context != null) {
                str = Settings.Global.getString(context.getContentResolver(), "engine.debug");
            } else {
                str = "";
            }
            if (str != null) {
                String[] split = str.split(",", -1);
                for (String str2 : split) {
                    if (jSONObject.opt(str2) != null) {
                        TTVideoEngineLog.m256505i("VideoEventManager", str2 + ":" + jSONObject.opt(str2));
                    }
                }
            }
        }
    }

    private VideoEventManager() {
    }

    /* access modifiers changed from: protected */
    public void addEvent(boolean z, JSONObject jSONObject) {
        synchronized (VideoEventManager.class) {
            if (jSONObject != null) {
                TTVideoEngineLog.m256500d("VideoEventManager", "addEvent  uploadLog = " + z);
                EngineThreadPool.addExecuteTask(new AsyncShowEventRunnable(this, jSONObject));
                VideoEventEngineUploader videoEventEngineUploader = this.mEngineUploader;
                if (videoEventEngineUploader != null) {
                    videoEventEngineUploader.onEvent("video_playq", jSONObject);
                    return;
                }
                IVideoEventUploader iVideoEventUploader = this.mUploader;
                if (iVideoEventUploader == null || !z) {
                    this.mJsonArray.put(jSONObject);
                    VideoEventListener videoEventListener = this.mListener;
                    if (videoEventListener != null) {
                        videoEventListener.onEvent();
                    }
                } else {
                    iVideoEventUploader.onUplaod("video_playq", jSONObject);
                }
            }
        }
    }

    public void addEventV2(boolean z, JSONObject jSONObject, String str) {
        synchronized (VideoEventManager.class) {
            if (jSONObject != null) {
                TTVideoEngineLog.m256500d("VideoEventManager", "addEventV2  uploadLog = " + z + ", listener:" + this.mListener + ", uploader:" + this.mUploader);
                EngineThreadPool.addExecuteTask(new AsyncShowEventRunnable(this, jSONObject));
                VideoEventEngineUploader videoEventEngineUploader = this.mEngineUploader;
                if (videoEventEngineUploader != null) {
                    videoEventEngineUploader.onEventV2(str, jSONObject);
                    return;
                }
                IVideoEventUploader iVideoEventUploader = this.mUploader;
                if (iVideoEventUploader == null || !z) {
                    this.mJsonArrayV2.put(jSONObject);
                    VideoEventListener videoEventListener = this.mListener;
                    if (videoEventListener != null) {
                        videoEventListener.onEventV2(str);
                    }
                } else {
                    iVideoEventUploader.onUplaod("video_playq", jSONObject);
                }
            }
        }
    }
}
