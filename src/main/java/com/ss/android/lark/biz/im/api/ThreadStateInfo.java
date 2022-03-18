package com.ss.android.lark.biz.im.api;

import com.larksuite.framework.utils.p1203a.AbstractC26248b;
import java.io.Serializable;

public class ThreadStateInfo implements AbstractC26248b<ThreadStateInfo>, Serializable {
    private String operatorId;
    private ThreadState state;
    private Long updateTimeMs;

    public boolean isItemSame(ThreadStateInfo threadStateInfo) {
        return this == threadStateInfo;
    }

    public enum ThreadState {
        UNKNOWN(0),
        OPEN(1),
        CLOSED(2);
        
        private int value;

        public int getNumber() {
            return this.value;
        }

        public static ThreadState valueOf(int i) {
            return forNumber(i);
        }

        public static ThreadState forNumber(int i) {
            if (i == 1) {
                return OPEN;
            }
            if (i != 2) {
                return UNKNOWN;
            }
            return CLOSED;
        }

        private ThreadState(int i) {
            this.value = i;
        }
    }

    public String getOperatorId() {
        return this.operatorId;
    }

    public ThreadState getState() {
        return this.state;
    }

    public Long getUpdateTimeMs() {
        return this.updateTimeMs;
    }

    public void setOperatorId(String str) {
        this.operatorId = str;
    }

    public void setState(ThreadState threadState) {
        this.state = threadState;
    }

    public void setUpdateTimeMs(Long l) {
        this.updateTimeMs = l;
    }

    public boolean isContentSame(ThreadStateInfo threadStateInfo) {
        if (this.state == threadStateInfo.state) {
            return true;
        }
        return false;
    }

    public ThreadStateInfo(ThreadState threadState, String str, Long l) {
        this.state = threadState;
        this.operatorId = str;
        this.updateTimeMs = l;
    }
}
