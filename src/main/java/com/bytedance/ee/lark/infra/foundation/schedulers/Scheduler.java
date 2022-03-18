package com.bytedance.ee.lark.infra.foundation.schedulers;

public interface Scheduler {
    void execute(Runnable runnable);
}
