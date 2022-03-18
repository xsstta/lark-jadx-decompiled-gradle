package com.bytedance.bae;

public class ByteAudioEventHandlerProxy {
    public ByteAudioEventHandler handler;
    public long nativeHandlerPtr;

    public void setNativeHandler(long j) {
        this.nativeHandlerPtr = j;
    }

    public ByteAudioEventHandlerProxy(ByteAudioEventHandler byteAudioEventHandler) {
        this.handler = byteAudioEventHandler;
    }

    public void onByteAudioLogMessage(String str) {
        ByteAudioEventHandler byteAudioEventHandler = this.handler;
        if (byteAudioEventHandler != null) {
            byteAudioEventHandler.onByteAudioLogMessage(str);
        }
    }

    public void onByteAudioEvent(int i, int i2, String str) {
        ByteAudioEventHandler byteAudioEventHandler = this.handler;
        if (byteAudioEventHandler != null) {
            byteAudioEventHandler.onByteAudioEvent(i, i2, str);
        }
    }
}
