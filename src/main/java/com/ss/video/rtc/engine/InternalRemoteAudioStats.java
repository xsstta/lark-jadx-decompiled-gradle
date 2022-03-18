package com.ss.video.rtc.engine;

public class InternalRemoteAudioStats {
    public float audioLossRate;
    public int concealedSamples;
    public int concealmentEvent;
    public int decDuration;
    public int decSampleRate;
    public long e2eDelay;
    public int frozenRate;
    public int jitterBufferDelay;
    public int numChannels;
    public int playoutSampleRate;
    public int quality;
    public int receivedKBitrate;
    public int receivedSampleRate;
    public int rtt;
    public int stallCount;
    public int stallDuration;
    public int statsInterval;
    public String uid;

    public InternalRemoteAudioStats() {
    }

    public InternalRemoteAudioStats(String str, float f, int i, int i2, int i3, long j, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15) {
        this.uid = str;
        this.audioLossRate = f;
        this.receivedKBitrate = i;
        this.stallCount = i2;
        this.stallDuration = i3;
        this.e2eDelay = j;
        this.statsInterval = i5;
        this.rtt = i6;
        this.quality = i7;
        this.jitterBufferDelay = i8;
        this.numChannels = i9;
        this.receivedSampleRate = i10;
        this.frozenRate = i11;
        this.concealedSamples = i12;
        this.concealmentEvent = i13;
        this.decSampleRate = i14;
        this.decDuration = i15;
    }

    private static InternalRemoteAudioStats create(String str, float f, int i, int i2, int i3, long j, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15) {
        return new InternalRemoteAudioStats(str, f, i, i2, i3, j, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15);
    }
}
