package com.ss.android.vc.irtc.impl.widget.webrtc;

import android.opengl.EGLContext;
import com.ss.android.vc.irtc.C61064p;
import com.ss.android.vc.irtc.C61065q;
import com.ss.android.vc.irtc.impl.RtcServiceImpl;
import com.ss.android.vc.irtc.impl.widget.AbsVideoViewRenderer;
import com.ss.android.vc.irtc.impl.widget.IVideoSinkListener;
import com.ss.video.rtc.engine.mediaio.IVideoSink;
import com.ss.video.rtc.engine.mediaio.RtcVideoFrame;
import com.ss.video.rtc.engine.video.InternalRtcVideoFrame;
import com.ss.video.rtc.meeting.MeetingRtcEngine;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONException;
import org.json.JSONObject;
import org.webrtc.EglBase;
import org.webrtc.VideoFrame;

public class BvVideoViewSink implements IVideoSink {
    private final String TAG = ("BvVideoViewSink#" + this);
    private final C61065q config;
    private boolean hasLogged = false;
    private boolean isInitialized = false;
    private boolean mIsEverConsume = false;
    private IVideoSinkListener mListener;
    private int mLocalRotation = -1;
    private YuvRecorder mRecorder;
    private final List<AbsVideoViewRenderer> mRendererList = new CopyOnWriteArrayList();
    private long startTime = 0;
    private boolean streamBound;

    @Override // com.ss.video.rtc.engine.mediaio.IVideoSink
    public int getBufferType() {
        return 2;
    }

    @Override // com.ss.video.rtc.engine.mediaio.IVideoSink
    public EGLContext getEGLContextHandle() {
        return null;
    }

    @Override // com.ss.video.rtc.engine.mediaio.IVideoSink
    public boolean onStart() {
        return true;
    }

    @Override // com.ss.video.rtc.engine.mediaio.IVideoSink
    public void onStop() {
    }

    public List<AbsVideoViewRenderer> getRenderList() {
        return this.mRendererList;
    }

    public boolean isStreamBound() {
        return this.streamBound;
    }

    public EglBase.Context getEglBaseContext() {
        return MeetingRtcEngine.getEglContext();
    }

    @Override // com.ss.video.rtc.engine.mediaio.IVideoSink
    public int getPixelFormat() {
        C61065q qVar = this.config;
        if (qVar == null || !qVar.f152923a) {
            return 1;
        }
        return 10;
    }

    private void calRenderTime() {
        long j = 0;
        for (AbsVideoViewRenderer absVideoViewRenderer : this.mRendererList) {
            RenderInfo renderInfo = absVideoViewRenderer.getRenderInfo();
            if (renderInfo != null) {
                j += renderInfo.perRenderTime();
            }
        }
        String str = this.TAG;
        C61064p.m237485a(str, "perRenderTime = " + j);
    }

    @Override // com.ss.video.rtc.engine.mediaio.IVideoSink
    public int getRenderElapse() {
        long j = 0;
        for (AbsVideoViewRenderer absVideoViewRenderer : this.mRendererList) {
            RenderInfo renderInfo = absVideoViewRenderer.getRenderInfo();
            if (renderInfo != null) {
                j += renderInfo.perRenderTime();
            }
        }
        return (int) j;
    }

    @Override // com.ss.video.rtc.engine.mediaio.IVideoSink
    public synchronized void onDispose() {
        YuvRecorder yuvRecorder;
        if (YuvRecorder.DEBUG && (yuvRecorder = this.mRecorder) != null) {
            yuvRecorder.release();
        }
        this.hasLogged = false;
        this.isInitialized = false;
        this.mIsEverConsume = false;
        String str = this.TAG;
        C61064p.m237485a(str, "[onDispose] mRender = " + this.mRendererList.size());
        for (AbsVideoViewRenderer absVideoViewRenderer : this.mRendererList) {
            absVideoViewRenderer.release();
        }
    }

    @Override // com.ss.video.rtc.engine.mediaio.IVideoSink
    public synchronized boolean onInitialize() {
        String str = this.TAG;
        C61064p.m237486b(str, "[onInitialize]RenderList = " + this.mRendererList.size());
        EglBase.Context eglBaseContext = getEglBaseContext();
        if (eglBaseContext == null) {
            C61064p.m237487c(this.TAG, "[onInitialize]Context is null.");
        } else {
            String str2 = this.TAG;
            C61064p.m237485a(str2, "[onInitialize]Context is not null: " + eglBaseContext.hashCode());
        }
        for (AbsVideoViewRenderer absVideoViewRenderer : this.mRendererList) {
            absVideoViewRenderer.init(eglBaseContext);
        }
        if (YuvRecorder.DEBUG) {
            this.mRecorder = new YuvRecorder("texture_render_" + hashCode());
        }
        this.isInitialized = true;
        return true;
    }

    public void setLocalRotation(int i) {
        this.mLocalRotation = i;
    }

    public void setStreamBound(boolean z) {
        this.streamBound = z;
    }

    private byte[] convert(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        return bArr;
    }

    public synchronized int indexOf(AbsVideoViewRenderer absVideoViewRenderer) {
        return this.mRendererList.indexOf(absVideoViewRenderer);
    }

    public synchronized void remove(AbsVideoViewRenderer absVideoViewRenderer) {
        this.mRendererList.remove(absVideoViewRenderer);
    }

    public void setListener(IVideoSinkListener iVideoSinkListener) {
        this.mListener = iVideoSinkListener;
        if (iVideoSinkListener == null) {
            C61064p.m237487c(this.TAG, "[setListener]Listener is null");
        }
    }

    public synchronized void add(AbsVideoViewRenderer absVideoViewRenderer) {
        if (!this.mRendererList.contains(absVideoViewRenderer)) {
            this.mRendererList.add(absVideoViewRenderer);
            if (this.isInitialized) {
                absVideoViewRenderer.init(getEglBaseContext());
            }
        }
    }

    public BvVideoViewSink(C61065q qVar) {
        this.config = qVar;
    }

    public synchronized void consumeTextureFrame(VideoFrame videoFrame) {
        if (getPixelFormat() != 10 && !this.hasLogged) {
            String str = this.TAG;
            C61064p.m237487c(str, "Error stream format: " + getPixelFormat());
            this.hasLogged = true;
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("real_data", "texture");
            } catch (JSONException e) {
                e.printStackTrace();
            }
            RtcServiceImpl.getInstance().statistics("frame_data_type_mismatch", jSONObject);
        }
        for (AbsVideoViewRenderer absVideoViewRenderer : this.mRendererList) {
            absVideoViewRenderer.renderFrame(new BvVideoFrame(videoFrame));
        }
        if (YuvRecorder.DEBUG && this.mRecorder != null) {
            VideoFrame.I420Buffer i420 = videoFrame.getBuffer().toI420();
            this.mRecorder.write(convert(i420.getDataY()), convert(i420.getDataU()), convert(i420.getDataV()), i420.getStrideY(), i420.getStrideU(), i420.getStrideV(), i420.getWidth(), i420.getHeight());
            i420.release();
        }
    }

    @Override // com.ss.video.rtc.engine.mediaio.IVideoFrameConsumer
    public synchronized void consumeVideoFrame(RtcVideoFrame rtcVideoFrame) {
        C61065q qVar = this.config;
        if (qVar != null && qVar.f152927e) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.startTime >= 2000) {
                String str = this.TAG;
                C61064p.m237485a(str, "[consumeVideoFrame] type = " + rtcVideoFrame.buffer_type);
                this.startTime = currentTimeMillis;
            }
        }
        if (rtcVideoFrame.buffer_type == 2) {
            IVideoSinkListener iVideoSinkListener = this.mListener;
            if (iVideoSinkListener != null && !this.mIsEverConsume) {
                this.mIsEverConsume = true;
                C61064p.m237485a(this.TAG, "[consumeVideoFrame] onFirstConsumeVideoFrame");
                iVideoSinkListener.firstConsumeVideoFrame();
            }
            InternalRtcVideoFrame internalRtcVideoFrame = (InternalRtcVideoFrame) rtcVideoFrame;
            VideoFrame.Buffer buffer = internalRtcVideoFrame.buffer;
            ByteBuffer byteBuffer = internalRtcVideoFrame.extend_data;
            int i = this.mLocalRotation;
            if (i <= -1) {
                i = internalRtcVideoFrame.rotation;
            }
            VideoFrame videoFrame = new VideoFrame(buffer, byteBuffer, i, internalRtcVideoFrame.timestampNs, internalRtcVideoFrame.isFlip);
            for (AbsVideoViewRenderer absVideoViewRenderer : this.mRendererList) {
                absVideoViewRenderer.renderFrame(new BvVideoFrame(videoFrame));
            }
        }
    }

    public synchronized void consumeYUVByteArrayFrame(byte[] bArr, byte[] bArr2, byte[] bArr3, int i, int i2, int i3, int i4, int i5, int i6, long j, boolean z) {
        YuvRecorder yuvRecorder;
        if (YuvRecorder.DEBUG && (yuvRecorder = this.mRecorder) != null) {
            yuvRecorder.write(bArr, bArr2, bArr3, i, i2, i3, i4, i5);
        }
        if (getPixelFormat() != 1 && !this.hasLogged) {
            String str = this.TAG;
            C61064p.m237487c(str, "Error stream format: " + getPixelFormat());
            this.hasLogged = true;
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("real_data", "yuv_array");
            } catch (JSONException e) {
                e.printStackTrace();
            }
            RtcServiceImpl.getInstance().statistics("frame_data_type_mismatch", jSONObject);
        }
        for (Iterator<AbsVideoViewRenderer> it = this.mRendererList.iterator(); it.hasNext(); it = it) {
            it.next().renderFrame(new BvVideoFrame(bArr, bArr2, bArr3, i, i2, i3, i4, i5, i6, j, z));
        }
    }
}
