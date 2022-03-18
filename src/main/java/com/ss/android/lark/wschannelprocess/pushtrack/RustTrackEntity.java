package com.ss.android.lark.wschannelprocess.pushtrack;

import java.io.Serializable;
import java.util.Map;

public class RustTrackEntity implements Serializable {
    private Map<String, Object> category;
    private String key;
    private Map<String, Object> metric;
    private Map<String, Object> params;
    private int status;
    private TrackType trackType;

    public Map<String, Object> getCategory() {
        return this.category;
    }

    public String getKey() {
        return this.key;
    }

    public Map<String, Object> getMetric() {
        return this.metric;
    }

    public Map<String, Object> getParams() {
        return this.params;
    }

    public int getStatus() {
        return this.status;
    }

    public TrackType getTrackType() {
        return this.trackType;
    }

    public void setCategory(Map<String, Object> map) {
        this.category = map;
    }

    public void setKey(String str) {
        this.key = str;
    }

    public void setMetric(Map<String, Object> map) {
        this.metric = map;
    }

    public void setParams(Map<String, Object> map) {
        this.params = map;
    }

    public void setStatus(int i) {
        this.status = i;
    }

    public void setTrackType(TrackType trackType2) {
        this.trackType = trackType2;
    }

    public enum TrackType {
        TEA(1),
        SLARDAR(2);
        
        private int value;

        public static TrackType fromValue(int i) {
            if (i == 1) {
                return TEA;
            }
            if (i != 2) {
                return null;
            }
            return SLARDAR;
        }

        private TrackType(int i) {
            this.value = i;
        }
    }
}
