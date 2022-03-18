package com.ss.android.vc.impl;

import com.alibaba.fastjson.JSON;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

public class RtcDnsInfo implements Serializable {
    private static final long serialVersionUID = 1;
    private Map<String, List<String>> hostIps;

    public Map<String, List<String>> getHostIps() {
        return this.hostIps;
    }

    public String toString() {
        return JSON.toJSONString(this);
    }

    public void setHostIps(Map<String, List<String>> map) {
        this.hostIps = map;
    }
}
