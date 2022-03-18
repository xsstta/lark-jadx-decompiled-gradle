package com.ss.android.lark.optrace.api;

import java.io.Serializable;
import kotlin.Deprecated;

public interface TracingCoreSpan extends ITracing, ILogger, AbstractC48929b, Serializable {
    @Deprecated(message = "use subTrace")
    TracingCoreSpan generateSpan();

    TracingCoreSpan subTrace();
}
