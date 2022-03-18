package com.ss.android.vc.irtc.impl.widget.webrtc;

import android.opengl.EGLContext;
import com.ss.android.vc.irtc.AbstractC61025d;
import com.ss.android.vc.irtc.C61071u;
import com.ss.video.rtc.engine.mediaio.IVideoSink;
import com.ss.video.rtc.engine.mediaio.RtcVideoFrame;
import org.webrtc.VideoFrame;

public class FrameCaptureRender implements IVideoSink {
    private AbstractC61025d frameCapturer;

    public void consumeTextureFrame(VideoFrame videoFrame) {
    }

    @Override // com.ss.video.rtc.engine.mediaio.IVideoFrameConsumer
    public void consumeVideoFrame(RtcVideoFrame rtcVideoFrame) {
    }

    @Override // com.ss.video.rtc.engine.mediaio.IVideoSink
    public int getBufferType() {
        return 0;
    }

    @Override // com.ss.video.rtc.engine.mediaio.IVideoSink
    public EGLContext getEGLContextHandle() {
        return null;
    }

    @Override // com.ss.video.rtc.engine.mediaio.IVideoSink
    public int getPixelFormat() {
        return 1;
    }

    @Override // com.ss.video.rtc.engine.mediaio.IVideoSink
    public int getRenderElapse() {
        return 0;
    }

    @Override // com.ss.video.rtc.engine.mediaio.IVideoSink
    public void onDispose() {
        this.frameCapturer = null;
    }

    @Override // com.ss.video.rtc.engine.mediaio.IVideoSink
    public boolean onInitialize() {
        return true;
    }

    @Override // com.ss.video.rtc.engine.mediaio.IVideoSink
    public boolean onStart() {
        return true;
    }

    @Override // com.ss.video.rtc.engine.mediaio.IVideoSink
    public void onStop() {
        this.frameCapturer = null;
    }

    public FrameCaptureRender(AbstractC61025d dVar) {
        this.frameCapturer = dVar;
    }

    public void consumeYUVByteArrayFrame(byte[] bArr, byte[] bArr2, byte[] bArr3, int i, int i2, int i3, int i4, int i5, int i6, long j, boolean z) {
        AbstractC61025d dVar = this.frameCapturer;
        if (dVar != null) {
            dVar.mo210648a(new C61071u(bArr, bArr2, bArr3, i, i2, i3, i4, i5, i6, j, z));
        }
    }
}
