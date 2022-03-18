package com.bytedance.apm.agent.instrumentation.io;

import java.util.EventObject;

public final class StreamCompleteEvent extends EventObject {
    private static final long serialVersionUID = 1;
    private final long bytes;
    private final Exception exception;

    public long getBytes() {
        return this.bytes;
    }

    public Exception getException() {
        return this.exception;
    }

    public boolean isError() {
        if (this.exception != null) {
            return true;
        }
        return false;
    }

    public StreamCompleteEvent(Object obj, long j) {
        this(obj, j, null);
    }

    public StreamCompleteEvent(Object obj, long j, Exception exc) {
        super(obj);
        this.bytes = j;
        this.exception = exc;
    }
}
