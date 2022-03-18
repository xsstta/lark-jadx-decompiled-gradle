package com.ss.video.rtc.engine;

public interface IMetadataObserver {
    void onMetadataReceived(byte[] bArr, String str, long j);

    byte[] onReadyToSendMetadata(long j);
}
