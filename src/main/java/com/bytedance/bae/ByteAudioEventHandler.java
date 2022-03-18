package com.bytedance.bae;

public interface ByteAudioEventHandler {
    void onByteAudioEvent(int i, int i2, String str);

    void onByteAudioLogMessage(String str);
}
