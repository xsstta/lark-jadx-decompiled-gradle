package com.bytedance.bae.base;

import com.bytedance.bae.base.Logging;

public interface Loggable {
    void onLogMessage(String str, Logging.Severity severity, String str2);
}
