package com.ss.ttvideoengine.strategrycenter;

public class StrategyMediaParam {
    public String sceneId;
    public int type;
    public String videoId;

    public StrategyMediaParam(String str, String str2, int i) {
        this.videoId = str;
        this.sceneId = str2;
        this.type = i;
    }
}
