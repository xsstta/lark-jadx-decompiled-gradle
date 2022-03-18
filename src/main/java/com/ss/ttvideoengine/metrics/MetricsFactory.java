package com.ss.ttvideoengine.metrics;

import com.ss.ttvideoengine.log.VideoEventOnePlay;

public final class MetricsFactory {
    private MetricsFactory() {
    }

    public static IMediaMetrics createMetrics(int i, VideoEventOnePlay videoEventOnePlay) {
        FirstFrameMetrics firstFrameMetrics;
        if (i != 0) {
            firstFrameMetrics = null;
        } else {
            firstFrameMetrics = new FirstFrameMetrics(i);
        }
        if (firstFrameMetrics != null) {
            firstFrameMetrics.logMetric(videoEventOnePlay);
        }
        return firstFrameMetrics;
    }
}
