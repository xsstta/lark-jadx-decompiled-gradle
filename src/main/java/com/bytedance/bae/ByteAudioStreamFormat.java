package com.bytedance.bae;

public class ByteAudioStreamFormat {
    public int bitRateBps;
    public int channelNum;
    public int codecType;
    public int sampleRate;

    public int getBitRateBps() {
        return this.bitRateBps;
    }

    public int getChannelNum() {
        return this.channelNum;
    }

    public int getCodecType() {
        return this.codecType;
    }

    public int getSampleRate() {
        return this.sampleRate;
    }

    public void setBitRateBps(int i) {
        this.bitRateBps = i;
    }

    public void setChannelNum(int i) {
        this.channelNum = i;
    }

    public void setSampleRate(int i) {
        this.sampleRate = i;
    }

    public void setCodecType(int i) {
        if (i < 10000 || i > 10006) {
            this.codecType = 0;
        } else {
            this.codecType = i;
        }
    }

    private static ByteAudioStreamFormat create(int i, int i2, int i3, int i4) {
        return new ByteAudioStreamFormat(i, i2, i3, i4);
    }

    public ByteAudioStreamFormat(int i, int i2, int i3, int i4) {
        this.sampleRate = i;
        this.channelNum = i2;
        this.codecType = i3;
        this.bitRateBps = i4;
    }
}
