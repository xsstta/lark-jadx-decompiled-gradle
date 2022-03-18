package com.ss.video.rtc.engine.utils;

public class ByteAudioFrameHelper {
    static int getBytesPerSample(ByteAudioFrame byteAudioFrame) {
        return byteAudioFrame.bytesPerSample;
    }

    static int getChannels(ByteAudioFrame byteAudioFrame) {
        return byteAudioFrame.channels;
    }

    static int getNumOfSamples(ByteAudioFrame byteAudioFrame) {
        return byteAudioFrame.numOfSamples;
    }

    static byte[] getSampleBuffer(ByteAudioFrame byteAudioFrame) {
        return byteAudioFrame.samples;
    }

    static int getSamplePerSec(ByteAudioFrame byteAudioFrame) {
        return byteAudioFrame.samplesPerSec;
    }
}
