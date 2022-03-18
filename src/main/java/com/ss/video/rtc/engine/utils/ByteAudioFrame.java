package com.ss.video.rtc.engine.utils;

public class ByteAudioFrame {
    public int bytesPerSample;
    public int channels;
    public int numOfSamples;
    public byte[] samples;
    public int samplesPerSec;

    public ByteAudioFrame() {
    }

    public ByteAudioFrame(byte[] bArr, int i, int i2, int i3, int i4) {
        this.samples = bArr;
        this.numOfSamples = i;
        this.bytesPerSample = i2;
        this.channels = i3;
        this.samplesPerSec = i4;
    }
}
