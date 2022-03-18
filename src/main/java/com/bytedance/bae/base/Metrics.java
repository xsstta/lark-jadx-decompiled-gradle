package com.bytedance.bae.base;

import java.util.HashMap;
import java.util.Map;

public class Metrics {
    public final Map<String, HistogramInfo> map = new HashMap();

    private static native void nativeEnable();

    private static native Metrics nativeGetAndReset();

    public static void enable() {
        nativeEnable();
    }

    public static Metrics getAndReset() {
        return nativeGetAndReset();
    }

    Metrics() {
    }

    private void add(String str, HistogramInfo histogramInfo) {
        this.map.put(str, histogramInfo);
    }

    public static class HistogramInfo {
        public final int bucketCount;
        public final int max;
        public final int min;
        public final Map<Integer, Integer> samples = new HashMap();

        public void addSample(int i, int i2) {
            this.samples.put(Integer.valueOf(i), Integer.valueOf(i2));
        }

        public HistogramInfo(int i, int i2, int i3) {
            this.min = i;
            this.max = i2;
            this.bucketCount = i3;
        }
    }
}
