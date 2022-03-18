package com.ss.android.lark.base.watermark;

public interface IWatermarkable {

    public @interface WatermarkMode {
    }

    boolean enableGlobalWatermark();

    int getWatermarkMode();
}
