package com.ss.video.rtc.engine.handler;

import com.ss.video.rtc.engine.mediaio.RtcVideoFrame;
import com.ss.video.rtc.engine.utils.ByteBufferUtils;
import java.nio.ByteBuffer;
import org.webrtc.VideoFrame;
import org.webrtc.YuvHelper;

public class ByteRtcVideoFrameObserver {
    /* access modifiers changed from: package-private */
    public void onLocalScreenFrame(VideoFrame videoFrame) {
        try {
            videoFrame.release();
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    /* access modifiers changed from: package-private */
    public void onLocalVideoFrame(VideoFrame videoFrame) {
        try {
            videoFrame.release();
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    /* access modifiers changed from: protected */
    public RtcVideoFrame ConvertVideoFrame(VideoFrame videoFrame) {
        if (videoFrame == null) {
            return null;
        }
        int width = videoFrame.getBuffer().getWidth();
        int height = videoFrame.getBuffer().getHeight();
        final ByteBuffer nativeAllocateBuffer = ByteBufferUtils.nativeAllocateBuffer((width * height) + (((width + 1) / 2) * ((height + 1) / 2) * 2));
        RtcVideoFrame rtcVideoFrame = new RtcVideoFrame(nativeAllocateBuffer, videoFrame.getExtendedData(), null, width, height, videoFrame.getRotation(), videoFrame.getTimestampNs(), new Runnable() {
            /* class com.ss.video.rtc.engine.handler.ByteRtcVideoFrameObserver.RunnableC655701 */

            public void run() {
                ByteBuffer byteBuffer = nativeAllocateBuffer;
                if (byteBuffer != null) {
                    ByteBufferUtils.nativeReleaseBuffer(byteBuffer);
                }
            }
        });
        VideoFrame.I420Buffer i420 = videoFrame.getBuffer().toI420();
        if (i420 != null) {
            YuvHelper.I420Copy(i420.getDataY(), i420.getStrideY(), i420.getDataU(), i420.getStrideU(), i420.getDataV(), i420.getStrideV(), rtcVideoFrame.buffer, i420.getWidth(), i420.getHeight());
            i420.release();
        }
        videoFrame.release();
        return rtcVideoFrame;
    }

    /* access modifiers changed from: package-private */
    public void onMergeFrame(String str, String str2, VideoFrame videoFrame) {
        try {
            videoFrame.release();
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    /* access modifiers changed from: package-private */
    public void onRemoteScreenFrame(String str, String str2, VideoFrame videoFrame) {
        try {
            videoFrame.release();
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    /* access modifiers changed from: package-private */
    public void onRemoteVideoFrame(String str, String str2, VideoFrame videoFrame) {
        try {
            videoFrame.release();
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }
}
