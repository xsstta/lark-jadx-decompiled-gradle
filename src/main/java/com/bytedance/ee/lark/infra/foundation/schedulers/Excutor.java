package com.bytedance.ee.lark.infra.foundation.schedulers;

public interface Excutor {
    Observable observeOn(Scheduler scheduler);

    Observable schudleOn(Scheduler scheduler);
}
