package com.ss.android.lark.diskmanage.monitor.settings;

import com.ss.android.lark.diskmanage.NonProguard;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MonitorExceptionConfig implements NonProguard {
    private List<String> ignoredRelativeDirs = new ArrayList();
    private List<String> ignoredRelativeFiles = new ArrayList();
    private Map<String, String> modules = new HashMap();

    public List<String> getIgnoredRelativeDirs() {
        return this.ignoredRelativeDirs;
    }

    public List<String> getIgnoredRelativeFiles() {
        return this.ignoredRelativeFiles;
    }

    public Map<String, String> getModules() {
        return this.modules;
    }

    public String toString() {
        return "MonitorExceptionConfig{ignoredRelativeFiles=" + this.ignoredRelativeFiles + ", ignoredRelativeDirs=" + this.ignoredRelativeDirs + ", modules=" + this.modules + '}';
    }

    public void setIgnoredRelativeDirs(List<String> list) {
        this.ignoredRelativeDirs = list;
    }

    public void setIgnoredRelativeFiles(List<String> list) {
        this.ignoredRelativeFiles = list;
    }

    public void setModules(Map<String, String> map) {
        this.modules = map;
    }
}
