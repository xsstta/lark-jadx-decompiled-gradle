package com.bytedance.ies.common;

import java.util.Iterator;
import java.util.LinkedList;
import org.json.JSONException;
import org.json.JSONObject;

public class IESAppLogger {
    private static volatile IESAppLogger instance;
    private static final Object object = new Object();
    private String appId = null;
    private AbstractC14428a appLoggerCallback;
    private Boolean initFlag = false;
    private Boolean isAbroad = false;

    /* renamed from: com.bytedance.ies.common.IESAppLogger$a */
    public interface AbstractC14428a {
        /* renamed from: a */
        void mo52922a(String str, JSONObject jSONObject, String str2);
    }

    private IESAppLogger() {
    }

    public static IESAppLogger sharedInstance() {
        IESAppLogger iESAppLogger;
        if (instance != null) {
            return instance;
        }
        synchronized (object) {
            if (instance == null) {
                instance = new IESAppLogger();
            }
            iESAppLogger = instance;
        }
        return iESAppLogger;
    }

    private static JSONObject copyJson(JSONObject jSONObject) {
        if (jSONObject == null) {
            return new JSONObject();
        }
        LinkedList linkedList = new LinkedList();
        Iterator<String> keys = jSONObject.keys();
        if (keys == null) {
            return new JSONObject();
        }
        while (keys.hasNext()) {
            linkedList.add(keys.next());
        }
        try {
            return new JSONObject(jSONObject, (String[]) linkedList.toArray(new String[0]));
        } catch (Exception e) {
            e.printStackTrace();
            return jSONObject;
        }
    }

    public void appLogOnEvent(String str, JSONObject jSONObject, String str2) {
        appLogOnEvent(str, jSONObject, str2, false);
    }

    public void appLogOnEvent(String str, String str2, String str3) {
        JSONObject jSONObject;
        if (this.appLoggerCallback != null) {
            try {
                jSONObject = new JSONObject(str2);
            } catch (JSONException e) {
                e.printStackTrace();
                jSONObject = new JSONObject();
            }
            appLogOnEvent(str, jSONObject, str3);
        }
    }

    public void setAppLogCallback(String str, AbstractC14428a aVar, boolean z) {
        if (!this.initFlag.booleanValue()) {
            synchronized (object) {
                if (!this.initFlag.booleanValue()) {
                    this.appId = str;
                    this.appLoggerCallback = aVar;
                    this.initFlag = true;
                    this.isAbroad = Boolean.valueOf(z);
                }
            }
        }
    }

    public void appLogOnEvent(String str, JSONObject jSONObject, String str2, boolean z) {
        if (this.appLoggerCallback != null) {
            if (z) {
                this.appLoggerCallback.mo52922a(str, copyJson(jSONObject), str2);
            }
            JSONObject copyJson = copyJson(jSONObject);
            try {
                if (this.isAbroad.booleanValue()) {
                    copyJson.put("second_appid", "2780");
                    copyJson.put("second_appname", "vesdk_abroad");
                } else {
                    copyJson.put("second_appid", "1357");
                    copyJson.put("second_appname", "video_editor_sdk");
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
            this.appLoggerCallback.mo52922a(str, copyJson, str2);
        }
    }
}
