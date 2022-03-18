package com.ss.android.vc.irtc.impl.widget.webrtc;

import android.content.Context;
import android.content.Intent;
import android.media.projection.MediaProjection;
import com.ss.android.vc.irtc.AbstractC61023b;
import com.ss.video.rtc.engine.mediaio.RtcVideoFrame;
import com.ss.video.rtc.engine.utils.LogUtil;
import com.ss.video.rtc.engine.video.InternalRtcVideoFrame;
import com.ss.video.rtc.meeting.MeetingRtcEngine;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import org.webrtc.CapturerObserver;
import org.webrtc.ScreenCapturerAndroid;
import org.webrtc.SurfaceTextureHelper;
import org.webrtc.VideoCapturer;
import org.webrtc.VideoFrame;

public class ScreenShareManager implements IMediaProjectionProvider {
    private MeetingRtcEngine mEngine;
    private boolean mIsInited;
    private AtomicBoolean mIsSharing = new AtomicBoolean(false);
    private ScreenShareCapturer mScreenVideoCapturer;

    public boolean isInited() {
        return this.mIsInited;
    }

    @Override // com.ss.android.vc.irtc.impl.widget.webrtc.IMediaProjectionProvider
    public MediaProjection getMediaProjection() {
        return this.mScreenVideoCapturer.getMediaProjection();
    }

    public boolean isSharing() {
        return this.mIsSharing.get();
    }

    /* access modifiers changed from: private */
    public static class ScreenShareCapturer {
        public AbstractC61023b mCaptureStatusCallback;
        private WeakReference<Context> mContextRef;
        public boolean mIsMediaProjectionStop;
        private SurfaceTextureHelper mSurfaceTextureHelper;
        public VideoCapturer mVideoCapturer;

        public interface ICapturerListener {
            void onFrameCaptured(RtcVideoFrame rtcVideoFrame);
        }

        public MediaProjection getMediaProjection() {
            VideoCapturer videoCapturer = this.mVideoCapturer;
            if (videoCapturer instanceof ScreenCapturerAndroid) {
                return ((ScreenCapturerAndroid) videoCapturer).getMediaProjection();
            }
            return null;
        }

        public void stopCapture() {
            VideoCapturer videoCapturer = this.mVideoCapturer;
            if (videoCapturer != null) {
                try {
                    videoCapturer.stopCapture();
                    this.mVideoCapturer.dispose();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                this.mVideoCapturer = null;
            }
            SurfaceTextureHelper surfaceTextureHelper = this.mSurfaceTextureHelper;
            if (surfaceTextureHelper != null) {
                try {
                    surfaceTextureHelper.dispose();
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
                this.mSurfaceTextureHelper = null;
            }
        }

        public void setCaptureStatusCallback(AbstractC61023b bVar) {
            this.mCaptureStatusCallback = bVar;
        }

        public ScreenShareCapturer(Context context) {
            this.mContextRef = new WeakReference<>(context);
        }

        private VideoCapturer createScreenCapturer(Intent intent) {
            this.mIsMediaProjectionStop = false;
            return new ScreenCapturerAndroid(intent, new MediaProjection.Callback() {
                /* class com.ss.android.vc.irtc.impl.widget.webrtc.ScreenShareManager.ScreenShareCapturer.C610552 */

                public void onStop() {
                    LogUtil.m257132i("ScreenShareManager", "User revoked permission to capture the screen." + ScreenShareCapturer.this.mCaptureStatusCallback);
                    ScreenShareCapturer.this.mIsMediaProjectionStop = true;
                    if (ScreenShareCapturer.this.mCaptureStatusCallback != null) {
                        ScreenShareCapturer.this.mCaptureStatusCallback.onStop();
                    }
                }
            });
        }

        public void changeCaptureFormat(int i, int i2, int i3) {
            VideoCapturer videoCapturer = this.mVideoCapturer;
            if (videoCapturer != null) {
                videoCapturer.changeCaptureFormat(i, i2, i3);
            }
        }

        public void startCapture(Intent intent, int i, int i2, int i3, int i4, final ICapturerListener iCapturerListener) {
            WeakReference<Context> weakReference = this.mContextRef;
            if (weakReference == null || weakReference.get() == null) {
                LogUtil.m257129d("ScreenShareManager", "LocalVideoCapturer start error : Context is null");
                return;
            }
            VideoCapturer videoCapturer = this.mVideoCapturer;
            if (videoCapturer != null) {
                videoCapturer.dispose();
                this.mVideoCapturer = null;
            }
            SurfaceTextureHelper surfaceTextureHelper = this.mSurfaceTextureHelper;
            if (surfaceTextureHelper != null) {
                surfaceTextureHelper.dispose();
                this.mSurfaceTextureHelper = null;
            }
            this.mSurfaceTextureHelper = SurfaceTextureHelper.create("screenCapture", MeetingRtcEngine.getEglContext());
            VideoCapturer createScreenCapturer = createScreenCapturer(intent);
            this.mVideoCapturer = createScreenCapturer;
            if (createScreenCapturer != null) {
                createScreenCapturer.initialize(this.mSurfaceTextureHelper, this.mContextRef.get(), new CapturerObserver() {
                    /* class com.ss.android.vc.irtc.impl.widget.webrtc.ScreenShareManager.ScreenShareCapturer.C610541 */

                    @Override // org.webrtc.CapturerObserver
                    public void onCapturerStarted(boolean z) {
                    }

                    @Override // org.webrtc.CapturerObserver
                    public void onCapturerStopped() {
                    }

                    @Override // org.webrtc.CapturerObserver
                    public void onFrameCaptured(VideoFrame videoFrame) {
                        try {
                            iCapturerListener.onFrameCaptured(new InternalRtcVideoFrame(videoFrame.getBuffer(), videoFrame.getExtendedData(), videoFrame.getRotation(), videoFrame.getTimestampNs(), videoFrame.getFlipState()));
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                });
                try {
                    LogUtil.m257129d("ScreenShareManager", "LocalVideoCapturer start capture : minFrameRate is " + i4);
                    if (i4 > -1) {
                        this.mVideoCapturer.startCapture(i, i2, i3, i4);
                    } else {
                        this.mVideoCapturer.startCapture(i, i2, i3);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Override // com.ss.android.vc.irtc.impl.widget.webrtc.IMediaProjectionProvider
    public boolean isValid() {
        ScreenShareCapturer screenShareCapturer;
        if (!isSharing() || (screenShareCapturer = this.mScreenVideoCapturer) == null || screenShareCapturer.mIsMediaProjectionStop) {
            return false;
        }
        return true;
    }

    public void destroy() {
        LogUtil.m257132i("ScreenShareManager", "destroy inited: " + this.mIsInited);
        stopScreenCapturer();
        this.mEngine = null;
        this.mScreenVideoCapturer = null;
        this.mIsInited = false;
    }

    public void stopScreenCapturer() {
        MeetingRtcEngine meetingRtcEngine;
        LogUtil.m257132i("ScreenShareManager", "[stopScreenCapturer] mIsSharing: " + this.mIsSharing.get());
        if (this.mIsSharing.compareAndSet(true, false) && (meetingRtcEngine = this.mEngine) != null) {
            meetingRtcEngine.unpublishScreen();
            ScreenShareCapturer screenShareCapturer = this.mScreenVideoCapturer;
            if (screenShareCapturer != null) {
                screenShareCapturer.stopCapture();
            }
        }
    }

    public /* synthetic */ void lambda$startScreenCapturer$0$ScreenShareManager(RtcVideoFrame rtcVideoFrame) {
        MeetingRtcEngine meetingRtcEngine = this.mEngine;
        if (meetingRtcEngine != null) {
            meetingRtcEngine.pushScreenFrame(rtcVideoFrame);
        }
    }

    public void setCaptureStatusCallback(AbstractC61023b bVar) {
        ScreenShareCapturer screenShareCapturer = this.mScreenVideoCapturer;
        if (screenShareCapturer != null) {
            screenShareCapturer.setCaptureStatusCallback(bVar);
        }
    }

    public void init(Context context, MeetingRtcEngine meetingRtcEngine) {
        LogUtil.m257132i("ScreenShareManager", "init inited: " + this.mIsInited);
        if (meetingRtcEngine != null) {
            this.mEngine = meetingRtcEngine;
            this.mScreenVideoCapturer = new ScreenShareCapturer(context);
        }
        this.mIsInited = true;
    }

    public void changeCapturerFormat(int i, int i2, int i3) {
        ScreenShareCapturer screenShareCapturer = this.mScreenVideoCapturer;
        if (screenShareCapturer != null) {
            screenShareCapturer.changeCaptureFormat(i, i2, i3);
        }
    }

    public void startScreenCapturer(Intent intent, int i, int i2, int i3, int i4) {
        MeetingRtcEngine meetingRtcEngine;
        LogUtil.m257132i("ScreenShareManager", "[startScreenCapturer] mIsSharing: " + this.mIsSharing.get() + ", width = [" + i + "], height = [" + i2 + "], fps = [" + i3 + "], minFrameRate = [" + i4 + "]");
        if (this.mIsSharing.compareAndSet(false, true) && (meetingRtcEngine = this.mEngine) != null) {
            meetingRtcEngine.publishScreen();
            ScreenShareCapturer screenShareCapturer = this.mScreenVideoCapturer;
            if (screenShareCapturer != null) {
                screenShareCapturer.startCapture(intent, i, i2, i3, i4, new ScreenShareCapturer.ICapturerListener() {
                    /* class com.ss.android.vc.irtc.impl.widget.webrtc.$$Lambda$ScreenShareManager$jR4A2FpiebOvbsnrvnPTkJhbEg */

                    @Override // com.ss.android.vc.irtc.impl.widget.webrtc.ScreenShareManager.ScreenShareCapturer.ICapturerListener
                    public final void onFrameCaptured(RtcVideoFrame rtcVideoFrame) {
                        ScreenShareManager.this.lambda$startScreenCapturer$0$ScreenShareManager(rtcVideoFrame);
                    }
                });
            }
        }
    }
}
