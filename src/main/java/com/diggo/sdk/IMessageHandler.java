package com.diggo.sdk;

public interface IMessageHandler {
    void onError(String str);

    void onMessage(String str);

    void onProgress(String str, int i);
}
