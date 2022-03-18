package com.ss.ttvideoengine.metrics;

import android.os.Bundle;
import com.ss.ttvideoengine.log.VideoEventOnePlay;

class FirstFrameMetrics implements IMediaMetrics {
    private long mFirstFrameDecodedDuration;
    private long mFirstFrameRenderDuration;
    private int mFreeLastDuration;
    private Bundle mMetrics = new Bundle();
    private long mPlaybackBufferEndDuration;
    private long mPlayerFirstFrameRenderDuration;
    private long mReadFirstVideoPktDuration;
    private long mReadHeaderDuration;
    private int mType;

    @Override // com.ss.ttvideoengine.metrics.IMediaMetrics
    public int getType() {
        return this.mType;
    }

    @Override // com.ss.ttvideoengine.metrics.IMediaMetrics
    public Bundle popMetrics() {
        return this.mMetrics;
    }

    @Override // com.ss.ttvideoengine.metrics.IMediaMetrics
    public String printf() {
        return this.mMetrics.toString();
    }

    @Override // com.ss.ttvideoengine.metrics.IMediaMetrics
    public boolean popMetricBoolean(String str) {
        return this.mMetrics.getBoolean(str);
    }

    @Override // com.ss.ttvideoengine.metrics.IMediaMetrics
    public float popMetricFloat(String str) {
        return this.mMetrics.getFloat(str);
    }

    @Override // com.ss.ttvideoengine.metrics.IMediaMetrics
    public int popMetricInt(String str) {
        return this.mMetrics.getInt(str);
    }

    @Override // com.ss.ttvideoengine.metrics.IMediaMetrics
    public long popMetricLong(String str) {
        return this.mMetrics.getLong(str);
    }

    public FirstFrameMetrics(int i) {
        this.mType = i;
    }

    @Override // com.ss.ttvideoengine.metrics.IMediaMetrics
    public void logMetric(VideoEventOnePlay videoEventOnePlay) {
        long j;
        if (videoEventOnePlay != null) {
            long j2 = 0;
            if (videoEventOnePlay.tranFirstPacketT > 0) {
                j = videoEventOnePlay.tranFirstPacketT - videoEventOnePlay.prepare_start_time;
            } else {
                j = 0;
            }
            this.mReadHeaderDuration = j;
            this.mReadFirstVideoPktDuration = videoEventOnePlay.receiveFirstVideoFrameT - videoEventOnePlay.prepare_start_time;
            this.mFirstFrameDecodedDuration = videoEventOnePlay.decodeFirstVideoFrameT - videoEventOnePlay.prepare_start_time;
            this.mFirstFrameRenderDuration = videoEventOnePlay.vt - videoEventOnePlay.prepare_start_time;
            this.mPlayerFirstFrameRenderDuration = videoEventOnePlay.playerFirstFrameT - videoEventOnePlay.prepare_start_time;
            if (videoEventOnePlay.playbackBufferEndT > 0) {
                j2 = videoEventOnePlay.playbackBufferEndT - videoEventOnePlay.prepare_start_time;
            }
            this.mPlaybackBufferEndDuration = j2;
            this.mMetrics.putLong("ffr_read_head_duration", this.mReadHeaderDuration);
            this.mMetrics.putLong("ffr_read_first_data_duration", this.mReadFirstVideoPktDuration);
            this.mMetrics.putLong("ffr_decode_duration", this.mFirstFrameDecodedDuration);
            this.mMetrics.putLong("ffr_render_duration", this.mFirstFrameRenderDuration);
            this.mMetrics.putLong("ffr_playback_buffering_duration", this.mPlaybackBufferEndDuration);
            this.mMetrics.putLong("ffr_prender_duration", this.mPlayerFirstFrameRenderDuration);
        }
    }

    @Override // com.ss.ttvideoengine.metrics.IMediaMetrics
    public void logMetric(String str, float f) {
        this.mMetrics.putFloat(str, f);
    }

    @Override // com.ss.ttvideoengine.metrics.IMediaMetrics
    public void logMetric(String str, int i) {
        this.mMetrics.putInt(str, i);
    }

    @Override // com.ss.ttvideoengine.metrics.IMediaMetrics
    public void logMetric(String str, String str2) {
        this.mMetrics.putString(str, str2);
    }

    @Override // com.ss.ttvideoengine.metrics.IMediaMetrics
    public void logMetric(String str, boolean z) {
        this.mMetrics.putBoolean(str, z);
    }
}
