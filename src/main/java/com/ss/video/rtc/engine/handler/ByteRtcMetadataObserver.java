package com.ss.video.rtc.engine.handler;

import com.ss.video.rtc.engine.IMetadataObserver;
import com.ss.video.rtc.engine.RtcEngineImpl.C65562RtcEngineImpl;
import java.lang.ref.WeakReference;

public class ByteRtcMetadataObserver {
    private WeakReference<C65562RtcEngineImpl> mRtcEngineImpl;

    public ByteRtcMetadataObserver(C65562RtcEngineImpl rtcEngineImpl) {
        this.mRtcEngineImpl = new WeakReference<>(rtcEngineImpl);
    }

    /* access modifiers changed from: package-private */
    public byte[] onReadyToSendMetadata(long j) {
        IMetadataObserver metadataObserver;
        C65562RtcEngineImpl rtcEngineImpl = this.mRtcEngineImpl.get();
        if (rtcEngineImpl == null || (metadataObserver = rtcEngineImpl.getMetadataObserver()) == null) {
            return null;
        }
        return metadataObserver.onReadyToSendMetadata(j);
    }

    /* access modifiers changed from: package-private */
    public void onMetadataReceived(byte[] bArr, String str, long j) {
        IMetadataObserver metadataObserver;
        C65562RtcEngineImpl rtcEngineImpl = this.mRtcEngineImpl.get();
        if (rtcEngineImpl != null && (metadataObserver = rtcEngineImpl.getMetadataObserver()) != null) {
            metadataObserver.onMetadataReceived(bArr, str, j);
        }
    }
}
