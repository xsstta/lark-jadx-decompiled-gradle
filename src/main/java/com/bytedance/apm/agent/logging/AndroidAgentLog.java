package com.bytedance.apm.agent.logging;

import android.util.Log;

public class AndroidAgentLog implements AgentLog {
    private int level = 3;

    @Override // com.bytedance.apm.agent.logging.AgentLog
    public int getLevel() {
        return this.level;
    }

    @Override // com.bytedance.apm.agent.logging.AgentLog
    public void audit(String str) {
        if (this.level == 6) {
            Log.d("[tt_apm]", str);
        }
    }

    @Override // com.bytedance.apm.agent.logging.AgentLog
    public void debug(String str) {
        if (this.level >= 5) {
            Log.d("[tt_apm]", str);
        }
    }

    @Override // com.bytedance.apm.agent.logging.AgentLog
    public void error(String str) {
        if (this.level >= 1) {
            Log.e("[tt_apm]", str);
        }
    }

    @Override // com.bytedance.apm.agent.logging.AgentLog
    public void info(String str) {
        if (this.level >= 3) {
            Log.i("[tt_apm]", str);
        }
    }

    @Override // com.bytedance.apm.agent.logging.AgentLog
    public void verbose(String str) {
        if (this.level >= 4) {
            Log.v("[tt_apm]", str);
        }
    }

    @Override // com.bytedance.apm.agent.logging.AgentLog
    public void warning(String str) {
        if (this.level >= 2) {
            Log.w("[tt_apm]", str);
        }
    }

    @Override // com.bytedance.apm.agent.logging.AgentLog
    public void setLevel(int i) {
        if (i > 6 || i < 1) {
            throw new IllegalArgumentException("Log level is not between ERROR and AUDIT");
        }
        this.level = i;
    }

    @Override // com.bytedance.apm.agent.logging.AgentLog
    public void error(String str, Throwable th) {
        if (this.level >= 1) {
            Log.e("[tt_apm]", str, th);
        }
    }
}
