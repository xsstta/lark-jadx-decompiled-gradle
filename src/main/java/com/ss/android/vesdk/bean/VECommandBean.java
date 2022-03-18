package com.ss.android.vesdk.bean;

public class VECommandBean {
    private String commandTag;
    private String[] coordinateArray;
    private String keyValueArray;
    private String layerId;

    public String getCommandTag() {
        return this.commandTag;
    }

    public String[] getCoordinateArray() {
        return this.coordinateArray;
    }

    public String getKeyValueArray() {
        return this.keyValueArray;
    }

    public String getLayerId() {
        return this.layerId;
    }

    private void setCoordinateArray(String[] strArr) {
        this.coordinateArray = strArr;
    }
}
