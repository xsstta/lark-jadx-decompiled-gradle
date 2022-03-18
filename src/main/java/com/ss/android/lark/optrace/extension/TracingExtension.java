package com.ss.android.lark.optrace.extension;

import java.io.Serializable;

public interface TracingExtension extends Serializable {
    TracingExtension mergeExtension(TracingExtension tracingExtension);
}
