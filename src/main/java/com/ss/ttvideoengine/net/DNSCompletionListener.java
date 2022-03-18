package com.ss.ttvideoengine.net;

import com.ss.ttvideoengine.utils.Error;
import org.json.JSONObject;

public interface DNSCompletionListener {
    void onCancelled();

    void onCompletion(JSONObject jSONObject, Error error);

    void onRetry(Error error);
}
