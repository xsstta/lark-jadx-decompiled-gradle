package com.ss.video.rtc.engine.adapter;

import android.opengl.EGLContext;
import com.ss.video.rtc.engine.mediaio.IVideoSink;
import com.ss.video.rtc.engine.mediaio.RtcVideoFrame;
import com.ss.video.rtc.engine.utils.ByteBufferUtils;
import com.ss.video.rtc.engine.video.InternalRtcVideoFrame;
import java.nio.ByteBuffer;
import org.webrtc.VideoFrame;
import org.webrtc.YuvHelper;

public class VideoSinkAdapter implements IVideoSink {
    public boolean mInitialized;
    public IVideoSink mSink;
    public boolean mStarted;
    private VideoSinkTask mVideoSinkTask;

    @Override // com.ss.video.rtc.engine.mediaio.IVideoSink
    public int getBufferType() {
        IVideoSink iVideoSink = this.mSink;
        if (iVideoSink != null) {
            return iVideoSink.getBufferType();
        }
        return 0;
    }

    @Override // com.ss.video.rtc.engine.mediaio.IVideoSink
    public EGLContext getEGLContextHandle() {
        IVideoSink iVideoSink = this.mSink;
        if (iVideoSink != null) {
            return iVideoSink.getEGLContextHandle();
        }
        return null;
    }

    @Override // com.ss.video.rtc.engine.mediaio.IVideoSink
    public int getPixelFormat() {
        IVideoSink iVideoSink = this.mSink;
        if (iVideoSink != null) {
            return iVideoSink.getPixelFormat();
        }
        return 1;
    }

    @Override // com.ss.video.rtc.engine.mediaio.IVideoSink
    public int getRenderElapse() {
        IVideoSink iVideoSink = this.mSink;
        if (iVideoSink != null) {
            return iVideoSink.getRenderElapse();
        }
        return 0;
    }

    @Override // com.ss.video.rtc.engine.mediaio.IVideoSink
    public void onDispose() {
        VideoSinkTask videoSinkTask;
        if (this.mSink != null && (videoSinkTask = this.mVideoSinkTask) != null) {
            videoSinkTask.post(new Runnable() {
                /* class com.ss.video.rtc.engine.adapter.VideoSinkAdapter.RunnableC655684 */

                public void run() {
                    if (VideoSinkAdapter.this.mSink != null) {
                        VideoSinkAdapter.this.mSink.onDispose();
                    }
                    VideoSinkAdapter.this.mInitialized = false;
                }
            });
        }
    }

    @Override // com.ss.video.rtc.engine.mediaio.IVideoSink
    public boolean onInitialize() {
        VideoSinkTask videoSinkTask;
        if (this.mSink == null || (videoSinkTask = this.mVideoSinkTask) == null) {
            return false;
        }
        videoSinkTask.post(new Runnable() {
            /* class com.ss.video.rtc.engine.adapter.VideoSinkAdapter.RunnableC655651 */

            public void run() {
                if (VideoSinkAdapter.this.mSink != null) {
                    VideoSinkAdapter videoSinkAdapter = VideoSinkAdapter.this;
                    videoSinkAdapter.mInitialized = videoSinkAdapter.mSink.onInitialize();
                }
            }
        });
        return true;
    }

    @Override // com.ss.video.rtc.engine.mediaio.IVideoSink
    public boolean onStart() {
        VideoSinkTask videoSinkTask;
        if (this.mSink == null || (videoSinkTask = this.mVideoSinkTask) == null) {
            return false;
        }
        videoSinkTask.post(new Runnable() {
            /* class com.ss.video.rtc.engine.adapter.VideoSinkAdapter.RunnableC655662 */

            public void run() {
                if (VideoSinkAdapter.this.mSink != null && VideoSinkAdapter.this.mInitialized) {
                    VideoSinkAdapter videoSinkAdapter = VideoSinkAdapter.this;
                    videoSinkAdapter.mStarted = videoSinkAdapter.mSink.onStart();
                }
            }
        });
        return true;
    }

    @Override // com.ss.video.rtc.engine.mediaio.IVideoSink
    public void onStop() {
        VideoSinkTask videoSinkTask;
        if (this.mSink != null && (videoSinkTask = this.mVideoSinkTask) != null) {
            videoSinkTask.post(new Runnable() {
                /* class com.ss.video.rtc.engine.adapter.VideoSinkAdapter.RunnableC655673 */

                public void run() {
                    if (VideoSinkAdapter.this.mSink != null) {
                        VideoSinkAdapter.this.mSink.onStop();
                    }
                    VideoSinkAdapter.this.mStarted = false;
                }
            });
        }
    }

    @Override // com.ss.video.rtc.engine.mediaio.IVideoFrameConsumer
    public void consumeVideoFrame(RtcVideoFrame rtcVideoFrame) {
        IVideoSink iVideoSink = this.mSink;
        if (iVideoSink != null && this.mInitialized && this.mStarted) {
            iVideoSink.consumeVideoFrame(rtcVideoFrame);
        }
    }

    /* access modifiers changed from: package-private */
    public void onVideoFrame(VideoFrame videoFrame) {
        if (videoFrame != null) {
            if (getBufferType() == 2) {
                consumeVideoFrame(new InternalRtcVideoFrame(videoFrame.getBuffer(), videoFrame.getExtendedData(), videoFrame.getRotation(), videoFrame.getTimestampNs(), videoFrame.getFlipState()));
            } else {
                int width = videoFrame.getBuffer().getWidth();
                int height = videoFrame.getBuffer().getHeight();
                VideoFrame.I420Buffer i420 = videoFrame.getBuffer().toI420();
                final ByteBuffer nativeAllocateBuffer = ByteBufferUtils.nativeAllocateBuffer((width * height) + (((width + 1) / 2) * ((height + 1) / 2) * 2));
                RtcVideoFrame rtcVideoFrame = new RtcVideoFrame(nativeAllocateBuffer, videoFrame.getExtendedData(), null, width, height, videoFrame.getRotation(), videoFrame.getTimestampNs(), new Runnable() {
                    /* class com.ss.video.rtc.engine.adapter.VideoSinkAdapter.RunnableC655695 */

                    public void run() {
                        ByteBufferUtils.nativeReleaseBuffer(nativeAllocateBuffer);
                    }
                });
                if (i420 != null) {
                    YuvHelper.I420Copy(i420.getDataY(), i420.getStrideY(), i420.getDataU(), i420.getStrideU(), i420.getDataV(), i420.getStrideV(), rtcVideoFrame.buffer, i420.getWidth(), i420.getHeight());
                    i420.release();
                }
                consumeVideoFrame(rtcVideoFrame);
                rtcVideoFrame.release();
            }
            videoFrame.release();
        }
    }

    public VideoSinkAdapter(IVideoSink iVideoSink, VideoSinkTask videoSinkTask) {
        this.mSink = iVideoSink;
        this.mVideoSinkTask = videoSinkTask;
    }
}
