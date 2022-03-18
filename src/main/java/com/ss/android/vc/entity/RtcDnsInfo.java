package com.ss.android.vc.entity;

import com.ss.android.vc.entity.response.C60984s;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

public class RtcDnsInfo implements Serializable {
    private static final long serialVersionUID = 1;
    private Map<String, List<String>> hostIps;
    private Map<String, C60984s.C60985a> result;

    public Map<String, List<String>> getHostIps() {
        return this.hostIps;
    }

    public Map<String, C60984s.C60985a> getResult() {
        return this.result;
    }

    public String toString() {
        return "RtcDnsInfo{hostIps=" + this.hostIps + ", result=" + this.result + '}';
    }

    public void setHostIps(Map<String, List<String>> map) {
        this.hostIps = map;
    }

    public void setResult(Map<String, C60984s.C60985a> map) {
        this.result = map;
    }
}
