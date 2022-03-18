package com.ss.mediakit.net;

import org.json.JSONObject;

public interface DNSCompletionListener {
    void onCancelled();

    void onCompletion(JSONObject jSONObject, Error error);

    void onRetry(Error error);
}
