package com.bytedance.ee.lark.infra.network.ref.entity;

import java.io.Serializable;

public enum ECOTaskState implements Serializable {
    TASK_INIT("init"),
    TASK_EXECUTED("executed"),
    TASK_CANCELED("canceled");
    
    private String state;

    public String getState() {
        return this.state;
    }

    private ECOTaskState(String str) {
        this.state = str;
    }
}
