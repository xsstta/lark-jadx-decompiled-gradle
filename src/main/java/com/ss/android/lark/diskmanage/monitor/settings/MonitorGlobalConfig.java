package com.ss.android.lark.diskmanage.monitor.settings;

import com.ss.android.lark.diskmanage.NonProguard;
import java.util.ArrayList;
import java.util.List;

public class MonitorGlobalConfig implements NonProguard {
    private long abnormalFileSize = 20971520;
    private long abnormalFolderSize = 52428800;
    private List<String> diskCustomedPaths = new ArrayList();
    private boolean dumpSwitch;
    private long dumpThreshold = 629145600;
    private int dumpTopCount = 20;

    public long getAbnormalFileSize() {
        return this.abnormalFileSize;
    }

    public long getAbnormalFolderSize() {
        return this.abnormalFolderSize;
    }

    public List<String> getDiskCustomedPaths() {
        return this.diskCustomedPaths;
    }

    public boolean getDumpSwitch() {
        return this.dumpSwitch;
    }

    public long getDumpThreshold() {
        return this.dumpThreshold;
    }

    public int getDumpTopCount() {
        return this.dumpTopCount;
    }

    public String toString() {
        return "MonitorGlobalConfig{dumpSwitch=" + this.dumpSwitch + ", dumpThreshold=" + this.dumpThreshold + ", abnormalFileSize=" + this.abnormalFileSize + ", abnormalFolderSize=" + this.abnormalFolderSize + ", dumpTopCount=" + this.dumpTopCount + ", diskCustomedPaths=" + this.diskCustomedPaths + '}';
    }

    public void setAbnormalFileSize(long j) {
        this.abnormalFileSize = j;
    }

    public void setAbnormalFolderSize(long j) {
        this.abnormalFolderSize = j;
    }

    public void setDiskCustomedPaths(List<String> list) {
        this.diskCustomedPaths = list;
    }

    public void setDumpSwitch(boolean z) {
        this.dumpSwitch = z;
    }

    public void setDumpThreshold(long j) {
        this.dumpThreshold = j;
    }

    public void setDumpTopCount(int i) {
        this.dumpTopCount = i;
    }
}
