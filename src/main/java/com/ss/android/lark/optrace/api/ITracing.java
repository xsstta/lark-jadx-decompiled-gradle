package com.ss.android.lark.optrace.api;

import com.ss.android.lark.optrace.extension.TracingExtension;
import com.ss.android.lark.optrace.extension.TracingExtensionEnum;
import java.io.Serializable;

public interface ITracing extends Serializable {
    void addExtension(TracingExtensionEnum tracingExtensionEnum, TracingExtension tracingExtension);

    long clientDuration(String str);

    void clientDurationEndAll();

    long clientDurationTagEnd(String str);

    void clientDurationTagStart(String str);

    long createTime();

    String getRequestId();

    String getTracingID();

    void setRequestId(String str);
}
