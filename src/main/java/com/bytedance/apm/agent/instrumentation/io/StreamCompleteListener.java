package com.bytedance.apm.agent.instrumentation.io;

public interface StreamCompleteListener {
    void streamComplete(StreamCompleteEvent streamCompleteEvent);

    void streamError(StreamCompleteEvent streamCompleteEvent);
}
