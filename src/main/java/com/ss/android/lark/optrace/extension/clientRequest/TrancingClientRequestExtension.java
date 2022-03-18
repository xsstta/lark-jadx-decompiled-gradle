package com.ss.android.lark.optrace.extension.clientRequest;

import com.ss.android.lark.optrace.extension.TracingExtension;

public abstract class TrancingClientRequestExtension implements TracingExtension {
    public abstract String getRequestId();

    public abstract void setRequestId(String str);
}
