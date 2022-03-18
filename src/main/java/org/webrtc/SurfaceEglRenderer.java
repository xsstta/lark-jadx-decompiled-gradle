package org.webrtc;

import android.view.SurfaceHolder;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import java.util.concurrent.CountDownLatch;
import org.webrtc.EglBase;
import org.webrtc.RendererCommon;

public class SurfaceEglRenderer extends EglRenderer implements SurfaceHolder.Callback {
    private int frameRotation;
    private boolean isFirstFrameRendered;
    private boolean isRenderingPaused;
    private final Object layoutLock = new Object();
    private RendererCommon.RendererEvents rendererEvents;
    private int rotatedFrameHeight;
    private int rotatedFrameWidth;

    @Override // org.webrtc.EglRenderer
    public void disableFpsReduction() {
        synchronized (this.layoutLock) {
            this.isRenderingPaused = false;
        }
        super.disableFpsReduction();
    }

    @Override // org.webrtc.EglRenderer
    public void pauseVideo() {
        synchronized (this.layoutLock) {
            this.isRenderingPaused = true;
        }
        super.pauseVideo();
    }

    @Override // org.webrtc.EglRenderer
    public void release() {
        super.release();
        CountDownLatch countDownLatch = new CountDownLatch(1);
        releaseEglSurface(new Runnable(countDownLatch) {
            /* class org.webrtc.$$Lambda$xXXywdCqM5leaxXkxy473i7s2A */
            public final /* synthetic */ CountDownLatch f$0;

            {
                this.f$0 = r1;
            }

            public final void run() {
                this.f$0.countDown();
            }
        });
        ThreadUtils.awaitUninterruptibly(countDownLatch);
    }

    @Override // org.webrtc.EglRenderer, org.webrtc.VideoSink
    public void onFrame(VideoFrame videoFrame) {
        updateFrameDimensionsAndReportEvents(videoFrame);
        super.onFrame(videoFrame);
    }

    public SurfaceEglRenderer(String str) {
        super(str);
    }

    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        ThreadUtils.checkIsOnMainThread();
        createEglSurface(surfaceHolder.getSurface());
    }

    private void logD(String str) {
        Logging.m268870d("SurfaceEglRenderer", this.name + ": " + str);
    }

    @Override // org.webrtc.EglRenderer
    public void setFpsReduction(float f) {
        boolean z;
        synchronized (this.layoutLock) {
            if (f == BitmapDescriptorFactory.HUE_RED) {
                z = true;
            } else {
                z = false;
            }
            this.isRenderingPaused = z;
        }
        super.setFpsReduction(f);
    }

    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        ThreadUtils.checkIsOnMainThread();
        CountDownLatch countDownLatch = new CountDownLatch(1);
        releaseEglSurface(new Runnable(countDownLatch) {
            /* class org.webrtc.$$Lambda$xXXywdCqM5leaxXkxy473i7s2A */
            public final /* synthetic */ CountDownLatch f$0;

            {
                this.f$0 = r1;
            }

            public final void run() {
                this.f$0.countDown();
            }
        });
        ThreadUtils.awaitUninterruptibly(countDownLatch);
    }

    private void updateFrameDimensionsAndReportEvents(VideoFrame videoFrame) {
        synchronized (this.layoutLock) {
            if (!this.isRenderingPaused) {
                if (!this.isFirstFrameRendered) {
                    this.isFirstFrameRendered = true;
                    logD("Reporting first rendered frame.");
                    RendererCommon.RendererEvents rendererEvents2 = this.rendererEvents;
                    if (rendererEvents2 != null) {
                        rendererEvents2.onFirstFrameRendered();
                    }
                }
                if (!(this.rotatedFrameWidth == videoFrame.getRotatedWidth() && this.rotatedFrameHeight == videoFrame.getRotatedHeight() && this.frameRotation == videoFrame.getRotation())) {
                    logD("Reporting frame resolution changed to " + videoFrame.getBuffer().getWidth() + "x" + videoFrame.getBuffer().getHeight() + " with rotation " + videoFrame.getRotation());
                    RendererCommon.RendererEvents rendererEvents3 = this.rendererEvents;
                    if (rendererEvents3 != null) {
                        rendererEvents3.onFrameResolutionChanged(videoFrame.getBuffer().getWidth(), videoFrame.getBuffer().getHeight(), videoFrame.getRotation());
                    }
                    this.rotatedFrameWidth = videoFrame.getRotatedWidth();
                    this.rotatedFrameHeight = videoFrame.getRotatedHeight();
                    this.frameRotation = videoFrame.getRotation();
                }
            }
        }
    }

    @Override // org.webrtc.EglRenderer
    public void init(EglBase.Context context, int[] iArr, RendererCommon.GlDrawer glDrawer) {
        init(context, (RendererCommon.RendererEvents) null, iArr, glDrawer);
    }

    public void init(EglBase.Context context, RendererCommon.RendererEvents rendererEvents2, int[] iArr, RendererCommon.GlDrawer glDrawer) {
        ThreadUtils.checkIsOnMainThread();
        this.rendererEvents = rendererEvents2;
        synchronized (this.layoutLock) {
            this.isFirstFrameRendered = false;
            this.rotatedFrameWidth = 0;
            this.rotatedFrameHeight = 0;
            this.frameRotation = 0;
        }
        super.init(context, iArr, glDrawer);
    }

    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        ThreadUtils.checkIsOnMainThread();
        logD("surfaceChanged: format: " + i + " size: " + i2 + "x" + i3);
    }
}
