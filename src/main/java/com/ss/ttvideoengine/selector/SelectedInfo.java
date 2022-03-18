package com.ss.ttvideoengine.selector;

import com.ss.ttvideoengine.model.IVideoInfo;
import com.ss.ttvideoengine.utils.Error;

public class SelectedInfo {
    private double calcBitRate;
    private final Error err;
    private final IVideoInfo selected;

    public Error getError() {
        return this.err;
    }

    public IVideoInfo getSelected() {
        return this.selected;
    }

    public IVideoInfo getVideoInfo() {
        return this.selected;
    }

    public boolean hasError() {
        if (this.err != null) {
            return true;
        }
        return false;
    }

    public SelectedInfo(IVideoInfo iVideoInfo) {
        this.selected = iVideoInfo;
    }

    public SelectedInfo(Error error) {
        this.err = error;
    }

    public double getDoubleValue(int i, double d) {
        if (i == 0) {
            return this.calcBitRate;
        }
        return d;
    }

    public void setDoubleValue(int i, double d) {
        if (i == 0) {
            this.calcBitRate = d;
        }
    }

    public SelectedInfo(IVideoInfo iVideoInfo, Error error) {
        this.selected = iVideoInfo;
        this.err = error;
    }
}
