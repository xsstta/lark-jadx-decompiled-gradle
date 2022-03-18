package com.bytedance.sysoptimizer;

public interface ExceptionCatcher {
    boolean analysis(Throwable th);

    boolean registerCondition();
}
