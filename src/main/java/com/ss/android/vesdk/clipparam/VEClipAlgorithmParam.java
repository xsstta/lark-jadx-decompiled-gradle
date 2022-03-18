package com.ss.android.vesdk.clipparam;

public class VEClipAlgorithmParam {
    public static int BINGO_EFFECT_NULL = 0;
    public static int BINGO_EFFECT_ZOOMIN = 1;
    public static int BINGO_EFFECT_ZOOMOUT = 2;
    public int bingoEffect;
    public int index;
    public int range;
    public int rotate;
    public int trimIn;
    public int trimOut;

    public String toString() {
        return "index: " + this.index + ", trimIn: " + this.trimIn + ", trimOut: " + this.trimOut + ", range: " + this.range + ", bingoEffect: " + this.bingoEffect + ", rotate: " + this.rotate;
    }
}
