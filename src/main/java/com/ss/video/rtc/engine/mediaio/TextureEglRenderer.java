package com.ss.video.rtc.engine.mediaio;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.Looper;
import android.view.TextureView;
import com.ss.video.rtc.engine.ui.VideoFrameRender;
import com.ss.video.rtc.engine.utils.LogUtil;
import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import org.webrtc.EglBase;
import org.webrtc.EglRenderer;
import org.webrtc.RendererCommon;
import org.webrtc.ThreadUtils;
import org.webrtc.VideoFrame;

public class TextureEglRenderer extends EglRenderer implements TextureView.SurfaceTextureListener {
    private static Object TextureViewUniTag = new Object();
    private volatile boolean hasInit = false;
    private CountDownLatch mCountDownLatch;
    private VideoFrameRender.OnEglSurfaceCreated mOnEglSurfaceCreated;
    private TextureView.SurfaceTextureListener mSurfaceTextureListener;
    private WeakReference<TextureView> mTextureViewRef;
    private Handler mainHandler = new Handler(Looper.getMainLooper());
    private Runnable onFrameCompleteRunnable = new Runnable() {
        /* class com.ss.video.rtc.engine.mediaio.$$Lambda$TextureEglRenderer$DaJO6oXQHo2kfAj0jj3DLuIhF0Q */

        public final void run() {
            TextureEglRenderer.this.lambda$new$0$TextureEglRenderer();
        }
    };

    public Runnable getOnFrameCompleteRunnable() {
        return this.onFrameCompleteRunnable;
    }

    public /* synthetic */ void lambda$new$0$TextureEglRenderer() {
        CountDownLatch countDownLatch = this.mCountDownLatch;
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
    }

    @Override // org.webrtc.EglRenderer
    public void release() {
        TextureView textureView;
        LogUtil.m257129d("TextureEglRenderer", "release");
        this.hasInit = false;
        super.release();
        CountDownLatch countDownLatch = new CountDownLatch(1);
        releaseEglSurface(new Runnable(countDownLatch) {
            /* class com.ss.video.rtc.engine.mediaio.$$Lambda$xXXywdCqM5leaxXkxy473i7s2A */
            public final /* synthetic */ CountDownLatch f$0;

            {
                this.f$0 = r1;
            }

            public final void run() {
                this.f$0.countDown();
            }
        });
        ThreadUtils.awaitUninterruptibly(countDownLatch);
        WeakReference<TextureView> weakReference = this.mTextureViewRef;
        if (weakReference != null && (textureView = weakReference.get()) != null) {
            textureView.setSurfaceTextureListener(null);
        }
    }

    public void setSurfaceTextureListener(TextureView.SurfaceTextureListener surfaceTextureListener) {
        this.mSurfaceTextureListener = surfaceTextureListener;
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        TextureView.SurfaceTextureListener surfaceTextureListener = this.mSurfaceTextureListener;
        if (surfaceTextureListener != null) {
            surfaceTextureListener.onSurfaceTextureUpdated(surfaceTexture);
        }
    }

    public TextureEglRenderer(String str) {
        super(str);
    }

    private void runOnUIThread(Runnable runnable) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            runnable.run();
        } else {
            new Handler(Looper.getMainLooper()).post(runnable);
        }
    }

    public /* synthetic */ void lambda$bind$1$TextureEglRenderer(TextureView textureView) {
        textureView.setSurfaceTextureListener(this);
        if (textureView.getSurfaceTexture() != null) {
            createEglSurface(textureView.getSurfaceTexture());
            VideoFrameRender.OnEglSurfaceCreated onEglSurfaceCreated = this.mOnEglSurfaceCreated;
            if (onEglSurfaceCreated != null) {
                onEglSurfaceCreated.onCreated();
            }
        }
    }

    @Override // org.webrtc.EglRenderer, org.webrtc.VideoSink
    public void onFrame(VideoFrame videoFrame) {
        TextureView textureView = this.mTextureViewRef.get();
        if (videoFrame != null && textureView != null && textureView.isShown() && this.hasInit) {
            super.onFrame(videoFrame);
        }
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        LogUtil.m257129d("TextureEglRenderer", "onSurfaceTextureDestroyed");
        ThreadUtils.checkIsOnMainThread();
        CountDownLatch countDownLatch = new CountDownLatch(1);
        releaseEglSurface(new Runnable(countDownLatch) {
            /* class com.ss.video.rtc.engine.mediaio.$$Lambda$xXXywdCqM5leaxXkxy473i7s2A */
            public final /* synthetic */ CountDownLatch f$0;

            {
                this.f$0 = r1;
            }

            public final void run() {
                this.f$0.countDown();
            }
        });
        ThreadUtils.awaitUninterruptibly(countDownLatch);
        TextureView.SurfaceTextureListener surfaceTextureListener = this.mSurfaceTextureListener;
        if (surfaceTextureListener != null) {
            surfaceTextureListener.onSurfaceTextureDestroyed(surfaceTexture);
        }
        return true;
    }

    private void postOnMainThreadAndLock(Runnable runnable, CountDownLatch countDownLatch) {
        this.mainHandler.post(new Runnable(runnable, countDownLatch) {
            /* class com.ss.video.rtc.engine.mediaio.$$Lambda$TextureEglRenderer$s4bNCO0eRI7m5Q8pPFFPRFheBs */
            public final /* synthetic */ Runnable f$0;
            public final /* synthetic */ CountDownLatch f$1;

            {
                this.f$0 = r1;
                this.f$1 = r2;
            }

            public final void run() {
                TextureEglRenderer.lambda$postOnMainThreadAndLock$2(this.f$0, this.f$1);
            }
        });
    }

    static /* synthetic */ void lambda$postOnMainThreadAndLock$2(Runnable runnable, CountDownLatch countDownLatch) {
        runnable.run();
        try {
            if (countDownLatch.getCount() != 0) {
                countDownLatch.await();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void bind(TextureView textureView, VideoFrameRender.OnEglSurfaceCreated onEglSurfaceCreated) {
        if (!this.hasInit) {
            LogUtil.m257129d("TextureEglRenderer", "TextureView not init");
            return;
        }
        LogUtil.m257129d("TextureEglRenderer", "bind");
        this.mTextureViewRef = new WeakReference<>(textureView);
        this.mOnEglSurfaceCreated = onEglSurfaceCreated;
        runOnUIThread(new Runnable(textureView) {
            /* class com.ss.video.rtc.engine.mediaio.$$Lambda$TextureEglRenderer$SYou562Oju3CPNvVeG4XzztZY2E */
            public final /* synthetic */ TextureView f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                TextureEglRenderer.this.lambda$bind$1$TextureEglRenderer(this.f$1);
            }
        });
    }

    @Override // org.webrtc.EglRenderer
    public void init(EglBase.Context context, int[] iArr, RendererCommon.GlDrawer glDrawer) {
        LogUtil.m257129d("TextureEglRenderer", "init");
        this.hasInit = true;
        super.init(context, iArr, glDrawer);
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        LogUtil.m257129d("TextureEglRenderer", "onSurfaceTextureSizeChanged");
        TextureView.SurfaceTextureListener surfaceTextureListener = this.mSurfaceTextureListener;
        if (surfaceTextureListener != null) {
            surfaceTextureListener.onSurfaceTextureSizeChanged(surfaceTexture, i, i2);
        }
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        ThreadUtils.checkIsOnMainThread();
        LogUtil.m257129d("TextureEglRenderer", "onSurfaceTextureAvailable");
        createEglSurface(surfaceTexture);
        VideoFrameRender.OnEglSurfaceCreated onEglSurfaceCreated = this.mOnEglSurfaceCreated;
        if (onEglSurfaceCreated != null) {
            onEglSurfaceCreated.onCreated();
        }
        TextureView.SurfaceTextureListener surfaceTextureListener = this.mSurfaceTextureListener;
        if (surfaceTextureListener != null) {
            surfaceTextureListener.onSurfaceTextureAvailable(surfaceTexture, i, i2);
        }
    }
}
