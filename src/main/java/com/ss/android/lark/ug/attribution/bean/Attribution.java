package com.ss.android.lark.ug.attribution.bean;

import java.util.Collections;
import java.util.Map;

public class Attribution {
    private Map<String, String> configs = Collections.emptyMap();
    private String source = "";

    public Map<String, String> getConfigs() {
        return this.configs;
    }

    public String getSource() {
        return this.source;
    }

    public Attribution() {
    }

    public String toString() {
        return "Attribution{source='" + this.source + '\'' + '}';
    }

    public void setConfigs(Map<String, String> map) {
        this.configs = map;
    }

    public void setSource(String str) {
        this.source = str;
    }

    public Attribution(String str, Map<String, String> map) {
        this.source = str == null ? "" : str;
        this.configs = map;
    }
}
