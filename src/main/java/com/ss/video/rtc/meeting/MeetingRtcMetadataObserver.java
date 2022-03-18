package com.ss.video.rtc.meeting;

import java.lang.ref.WeakReference;

public class MeetingRtcMetadataObserver {
    private WeakReference<MeetingRtcEngineImpl> mRtcEngineImpl;

    public MeetingRtcMetadataObserver(MeetingRtcEngineImpl meetingRtcEngineImpl) {
        this.mRtcEngineImpl = new WeakReference<>(meetingRtcEngineImpl);
    }

    /* access modifiers changed from: package-private */
    public byte[] onReadyToSendMetadata(long j, boolean z) {
        IMetadataObserverEx metadataObserverEx;
        MeetingRtcEngineImpl meetingRtcEngineImpl = this.mRtcEngineImpl.get();
        if (meetingRtcEngineImpl == null || (metadataObserverEx = meetingRtcEngineImpl.getMetadataObserverEx()) == null) {
            return null;
        }
        return metadataObserverEx.onReadyToSendMetadata(j, z);
    }

    /* access modifiers changed from: package-private */
    public void onMetadataReceived(byte[] bArr, String str, long j, boolean z) {
        IMetadataObserverEx metadataObserverEx;
        MeetingRtcEngineImpl meetingRtcEngineImpl = this.mRtcEngineImpl.get();
        if (meetingRtcEngineImpl != null && (metadataObserverEx = meetingRtcEngineImpl.getMetadataObserverEx()) != null) {
            metadataObserverEx.onMetadataReceived(bArr, str, j, z);
        }
    }
}
