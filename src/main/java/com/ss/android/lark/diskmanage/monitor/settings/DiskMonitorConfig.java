package com.ss.android.lark.diskmanage.monitor.settings;

import com.ss.android.lark.diskmanage.NonProguard;

public class DiskMonitorConfig implements NonProguard {
    private MonitorExceptionConfig exceptionConfig = new MonitorExceptionConfig();
    private String extraConfig = "";
    private MonitorGlobalConfig globalConfig = new MonitorGlobalConfig();

    public MonitorExceptionConfig getExceptionConfig() {
        return this.exceptionConfig;
    }

    public String getExtraConfig() {
        return this.extraConfig;
    }

    public MonitorGlobalConfig getGlobalConfig() {
        return this.globalConfig;
    }

    public String toString() {
        return "DiskMonitorConfig{globalConfig=" + this.globalConfig + ", exceptionConfig=" + this.exceptionConfig + ", extraConfig='" + this.extraConfig + '\'' + '}';
    }

    public void setExceptionConfig(MonitorExceptionConfig monitorExceptionConfig) {
        this.exceptionConfig = monitorExceptionConfig;
    }

    public void setExtraConfig(String str) {
        this.extraConfig = str;
    }

    public void setGlobalConfig(MonitorGlobalConfig monitorGlobalConfig) {
        this.globalConfig = monitorGlobalConfig;
    }
}
