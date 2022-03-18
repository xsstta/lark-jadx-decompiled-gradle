package com.ss.video.rtc.engine;

public class InternalRemoteVideoStats {
    public int decoderOutputFrameRate;
    public long e2eDelay;
    public int frozenRate;
    public int height;
    public boolean isScreen;
    public float receivedKBitrate;
    public int rendererOutputFrameRate;
    public int rtt;
    public int stallCount;
    public int stallDuration;
    public int statsInterval;
    public String uid;
    public int videoIndex;
    public float videoLossRate;
    public int width;

    public InternalRemoteVideoStats() {
    }

    public InternalRemoteVideoStats(String str, int i, int i2, float f, float f2, int i3, int i4, int i5, long j, boolean z, int i6, int i7, int i8, int i9) {
        this.uid = str;
        this.width = i;
        this.height = i2;
        this.videoLossRate = f;
        this.receivedKBitrate = f2;
        this.decoderOutputFrameRate = i3;
        this.rendererOutputFrameRate = i4;
        this.stallCount = i5;
        this.e2eDelay = j;
        this.isScreen = z;
        this.statsInterval = i6;
        this.rtt = i7;
        this.frozenRate = i8;
        this.videoIndex = i9;
    }

    private static InternalRemoteVideoStats create(String str, int i, int i2, float f, float f2, int i3, int i4, int i5, long j, boolean z, int i6, int i7, int i8, int i9) {
        return new InternalRemoteVideoStats(str, i, i2, f, f2, i3, i4, i5, j, z, i6, i7, i8, i9);
    }
}
