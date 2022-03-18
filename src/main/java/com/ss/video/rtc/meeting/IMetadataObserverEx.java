package com.ss.video.rtc.meeting;

public interface IMetadataObserverEx {
    void onMetadataReceived(byte[] bArr, String str, long j, boolean z);

    byte[] onReadyToSendMetadata(long j, boolean z);
}
