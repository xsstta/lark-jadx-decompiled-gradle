package com.ss.ttm.utils;

public class AVUtils {

    public static class ScaleInfo {

        /* renamed from: h */
        public int f164681h;

        /* renamed from: w */
        public int f164682w;

        /* renamed from: x */
        public int f164683x;

        /* renamed from: y */
        public int f164684y;
    }

    public static final ScaleInfo getScaleInfoFromSize(float f, float f2, float f3, float f4) {
        ScaleInfo scaleInfo = new ScaleInfo();
        float f5 = f / f2;
        scaleInfo.f164682w = (int) f3;
        scaleInfo.f164681h = (int) (f3 / f5);
        if (((float) scaleInfo.f164681h) < f4) {
            scaleInfo.f164681h = (int) f4;
            scaleInfo.f164682w = (int) (f5 * f4);
        }
        scaleInfo.f164684y = ((int) (((float) scaleInfo.f164681h) - f4)) >> 1;
        scaleInfo.f164683x = ((int) (((float) scaleInfo.f164682w) - f3)) >> 1;
        if (((float) scaleInfo.f164681h) > f4) {
            scaleInfo.f164684y = 0 - scaleInfo.f164684y;
        }
        if (((float) scaleInfo.f164682w) > f3) {
            scaleInfo.f164683x = 0 - scaleInfo.f164683x;
        }
        return scaleInfo;
    }
}
