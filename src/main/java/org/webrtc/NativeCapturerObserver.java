package org.webrtc;

import org.webrtc.VideoFrame;

class NativeCapturerObserver implements CapturerObserver {
    private final long nativeSource;

    private static native void nativeCapturerStarted(long j, boolean z);

    private static native void nativeCapturerStopped(long j);

    private static native void nativeOnFrameCaptured(long j, int i, int i2, int i3, long j2, VideoFrame.Buffer buffer);

    @Override // org.webrtc.CapturerObserver
    public void onCapturerStopped() {
        nativeCapturerStopped(this.nativeSource);
    }

    public NativeCapturerObserver(long j) {
        this.nativeSource = j;
    }

    @Override // org.webrtc.CapturerObserver
    public void onCapturerStarted(boolean z) {
        nativeCapturerStarted(this.nativeSource, z);
    }

    @Override // org.webrtc.CapturerObserver
    public void onFrameCaptured(VideoFrame videoFrame) {
        nativeOnFrameCaptured(this.nativeSource, videoFrame.getBuffer().getWidth(), videoFrame.getBuffer().getHeight(), videoFrame.getRotation(), videoFrame.getTimestampNs(), videoFrame.getBuffer());
    }
}
