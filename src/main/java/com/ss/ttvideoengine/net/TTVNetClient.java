package com.ss.ttvideoengine.net;

import com.ss.ttvideoengine.utils.Error;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import java.util.Map;
import org.json.JSONObject;

public abstract class TTVNetClient {

    public interface CompletionListener {
        void onCompletion(JSONObject jSONObject, Error error);
    }

    public interface RawCompletionListener {
        void onCompletion(String str, Error error);
    }

    public void cancel() {
        TTVideoEngineLog.m256503e("TTVNetClient", "TTVNetClient is a abstract class, imp is null");
    }

    public void startTask(String str, CompletionListener completionListener) {
        TTVideoEngineLog.m256503e("TTVNetClient", "TTVNetClient is a abstract class, imp is null");
    }

    public void startTask(String str, Map<String, String> map, CompletionListener completionListener) {
        TTVideoEngineLog.m256503e("TTVNetClient", "TTVNetClient is a abstract class, imp is null");
    }

    public void startTask(String str, Map<String, String> map, JSONObject jSONObject, int i, CompletionListener completionListener) {
        TTVideoEngineLog.m256503e("TTVNetClient", "TTVNetClient is a abstract class, imp is null");
    }

    public void startTask(String str, Map<String, String> map, JSONObject jSONObject, int i, RawCompletionListener rawCompletionListener) {
        TTVideoEngineLog.m256503e("TTVNetClient", "TTVNetClient is a abstract class, imp is null");
    }
}
