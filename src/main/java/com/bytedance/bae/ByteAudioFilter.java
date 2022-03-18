package com.bytedance.bae;

public abstract class ByteAudioFilter {
    public abstract int onProcess(ByteAudioStreamBuffer byteAudioStreamBuffer);
}
