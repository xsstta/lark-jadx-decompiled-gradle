package com.bytedance.apm.agent.instrumentation.io;

public interface StreamCompleteListenerSource {
    void addStreamCompleteListener(StreamCompleteListener streamCompleteListener);

    void removeStreamCompleteListener(StreamCompleteListener streamCompleteListener);
}
