package com.ss.video.rtc.engine.utils;

import android.opengl.EGLContext;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.os.Handler;
import android.os.HandlerThread;
import com.bytedance.platform.godzilla.thread.C20339a;
import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Callable;
import org.webrtc.EglBase;
import org.webrtc.GlRectDrawer;
import org.webrtc.GlUtil;
import org.webrtc.ThreadUtils;
import org.webrtc.VideoFrame;
import org.webrtc.YuvConverter;

public class TextureHelper {
    public static float[] TEX_MATRIX = new float[16];
    public final EglBase mEglBase;
    private int mFrameBufferId;
    private final Handler mHandler;
    public int mHeight;
    public boolean mIsQuitting;
    private boolean mIsRelease;
    public boolean mIsTextureInUse;
    private int mTextureCnt;
    public GlRectDrawer mTextureDrawer;
    private List<Integer> mTextureFreeQueue = new LinkedList();
    private List<Integer> mTextureUsedQueue = new LinkedList();
    public int mWidth;
    public YuvConverter mYuvConverter;

    public static HandlerThread new_android_os_HandlerThread_by_knot(String str) {
        return C20341a.m74147a() ? C20339a.m74145a(str, 0, C20341a.f49621b) : new HandlerThread(str);
    }

    public EglBase.Context getEglBaseContext() {
        EglBase eglBase = this.mEglBase;
        if (eglBase != null) {
            return eglBase.getEglBaseContext();
        }
        return null;
    }

    public long getNativeEglContext() {
        EglBase eglBase = this.mEglBase;
        if (eglBase != null) {
            return eglBase.getEglBaseContext().getNativeEglContext();
        }
        return 0;
    }

    public /* synthetic */ void lambda$dispose$7$TextureHelper() {
        this.mIsQuitting = true;
        if (!this.mIsTextureInUse) {
            release();
        }
    }

    public int dequeueTexture() {
        int[] iArr = new int[1];
        ThreadUtils.invokeAtFrontUninterruptibly(this.mHandler, new Runnable(iArr) {
            /* class com.ss.video.rtc.engine.utils.$$Lambda$TextureHelper$FAURWHrJ7J0VXL5naBQ4vMHXe8 */
            public final /* synthetic */ int[] f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                TextureHelper.this.lambda$dequeueTexture$3$TextureHelper(this.f$1);
            }
        });
        return iArr[0];
    }

    public synchronized void dispose() {
        LogUtil.m257129d("TextureHelper", "dispose()");
        ThreadUtils.invokeAtFrontUninterruptibly(this.mHandler, new Runnable() {
            /* class com.ss.video.rtc.engine.utils.$$Lambda$TextureHelper$vb6HkpOOSgofBPjHYKu30pd6RU */

            public final void run() {
                TextureHelper.this.lambda$dispose$7$TextureHelper();
            }
        });
    }

    public void release() {
        if (this.mHandler.getLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Wrong thread.");
        } else if (this.mIsTextureInUse || !this.mIsQuitting) {
            throw new IllegalStateException("Unexpected release.");
        } else {
            this.mIsRelease = true;
            YuvConverter yuvConverter = this.mYuvConverter;
            if (yuvConverter != null) {
                yuvConverter.release();
            }
            List<Integer> list = this.mTextureFreeQueue;
            if (list != null && list.size() > 0) {
                Iterator<Integer> it = this.mTextureFreeQueue.iterator();
                while (it.hasNext()) {
                    GLES20.glDeleteTextures(1, new int[]{it.next().intValue()}, 0);
                }
            }
            this.mTextureFreeQueue.clear();
            List<Integer> list2 = this.mTextureUsedQueue;
            if (list2 != null && list2.size() > 0) {
                Iterator<Integer> it2 = this.mTextureUsedQueue.iterator();
                while (it2.hasNext()) {
                    GLES20.glDeleteTextures(1, new int[]{it2.next().intValue()}, 0);
                }
            }
            this.mTextureUsedQueue.clear();
            GLES20.glDeleteFramebuffers(1, new int[]{this.mFrameBufferId}, 0);
            this.mFrameBufferId = 0;
            this.mEglBase.release();
            this.mHandler.getLooper().quit();
        }
    }

    public void post(Runnable runnable) {
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.post(runnable);
        }
    }

    public void queueTexture(int i) {
        this.mHandler.post(new Runnable(i) {
            /* class com.ss.video.rtc.engine.utils.$$Lambda$TextureHelper$EMHIECl77aH2wgTTJojwPHcB0M */
            public final /* synthetic */ int f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                TextureHelper.this.lambda$queueTexture$4$TextureHelper(this.f$1);
            }
        });
    }

    public void releaseTextureID(int i) {
        if (i > 0 && !this.mIsQuitting && !this.mIsRelease) {
            ThreadUtils.invokeAtFrontUninterruptibly(this.mHandler, new Runnable(i) {
                /* class com.ss.video.rtc.engine.utils.$$Lambda$TextureHelper$MPk79JiYO_BsX62bKATn6LdKWnw */
                public final /* synthetic */ int f$0;

                {
                    this.f$0 = r1;
                }

                public final void run() {
                    GLES20.glDeleteTextures(1, new int[]{this.f$0}, 0);
                }
            });
        }
    }

    public synchronized VideoFrame.I420Buffer textureToYuv(final VideoFrame.TextureBuffer textureBuffer) {
        final VideoFrame.I420Buffer[] i420BufferArr;
        i420BufferArr = new VideoFrame.I420Buffer[1];
        ThreadUtils.invokeAtFrontUninterruptibly(this.mHandler, new Runnable() {
            /* class com.ss.video.rtc.engine.utils.TextureHelper.RunnableC655952 */

            public void run() {
                TextureHelper.this.mIsTextureInUse = true;
                if (TextureHelper.this.mYuvConverter == null) {
                    TextureHelper.this.mYuvConverter = new YuvConverter();
                }
                if (TextureHelper.this.mTextureDrawer == null) {
                    TextureHelper.this.mTextureDrawer = new GlRectDrawer();
                }
                i420BufferArr[0] = TextureHelper.this.mYuvConverter.convert(textureBuffer);
                TextureHelper.this.mIsTextureInUse = false;
                if (TextureHelper.this.mIsQuitting) {
                    TextureHelper.this.release();
                }
            }
        });
        return i420BufferArr[0];
    }

    public /* synthetic */ void lambda$queueTexture$4$TextureHelper(int i) {
        List<Integer> list = this.mTextureUsedQueue;
        if (list != null && list.contains(Integer.valueOf(i))) {
            this.mTextureUsedQueue.remove(new Integer(i));
            List<Integer> list2 = this.mTextureFreeQueue;
            if (list2 != null) {
                list2.add(Integer.valueOf(i));
            }
        }
    }

    public /* synthetic */ void lambda$dequeueTexture$3$TextureHelper(int[] iArr) {
        List<Integer> list = this.mTextureFreeQueue;
        if (list == null) {
            return;
        }
        if (list.size() == 0) {
            iArr[0] = generateTexture(3553, this.mWidth, this.mHeight);
            if (iArr[0] > 0) {
                this.mTextureUsedQueue.add(Integer.valueOf(iArr[0]));
                return;
            }
            return;
        }
        iArr[0] = this.mTextureFreeQueue.get(0).intValue();
        this.mTextureFreeQueue.remove(0);
        this.mTextureUsedQueue.add(Integer.valueOf(iArr[0]));
    }

    public void drawTexture(final int i, final int i2, final int i3) {
        ThreadUtils.invokeAtFrontUninterruptibly(this.mHandler, new Runnable() {
            /* class com.ss.video.rtc.engine.utils.TextureHelper.RunnableC655941 */

            public void run() {
                if (TextureHelper.this.mTextureDrawer == null) {
                    TextureHelper.this.mTextureDrawer = new GlRectDrawer();
                }
                GlUtil.checkNoGLES2Error("TextureHelper construct");
                GLES20.glBindFramebuffer(36160, i3);
                GLES20.glFramebufferTexture2D(36160, 36064, 3553, i3, 0);
                int i = i;
                if (i == 10) {
                    TextureHelper.this.mTextureDrawer.drawRgb(i2, TextureHelper.TEX_MATRIX, TextureHelper.this.mWidth, TextureHelper.this.mHeight, 0, 0, TextureHelper.this.mWidth, TextureHelper.this.mHeight);
                } else if (i != 11) {
                    LogUtil.m257130e("TextureHelper", "draw texture type error");
                } else {
                    TextureHelper.this.mTextureDrawer.drawOes(i2, TextureHelper.TEX_MATRIX, TextureHelper.this.mWidth, TextureHelper.this.mHeight, 0, 0, TextureHelper.this.mWidth, TextureHelper.this.mHeight);
                }
                GLES20.glBindTexture(3553, 0);
                GLES20.glBindFramebuffer(36160, 0);
                GlUtil.checkNoGLES2Error("TextureHelper drawTexture");
                TextureHelper.this.mEglBase.swapBuffers();
            }
        });
    }

    private int generateTexture(int i, int i2, int i3) {
        if (this.mTextureCnt == 4) {
            return 0;
        }
        return ((Integer) ThreadUtils.invokeAtFrontUninterruptibly(this.mHandler, new Callable(i, i2, i3) {
            /* class com.ss.video.rtc.engine.utils.$$Lambda$TextureHelper$qj0ogbFjRYohlbTm1qGItdrw_0 */
            public final /* synthetic */ int f$1;
            public final /* synthetic */ int f$2;
            public final /* synthetic */ int f$3;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return TextureHelper.this.lambda$generateTexture$6$TextureHelper(this.f$1, this.f$2, this.f$3);
            }
        })).intValue();
    }

    public /* synthetic */ Integer lambda$generateTexture$6$TextureHelper(int i, int i2, int i3) throws Exception {
        int generateTexture = GlUtil.generateTexture(i);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, generateTexture);
        GLES20.glTexImage2D(3553, 0, 6408, i2, i3, 0, 6408, 5121, null);
        GLES20.glBindTexture(3553, 0);
        if (GLES20.glGetError() != 0) {
            return 0;
        }
        this.mTextureCnt++;
        return Integer.valueOf(generateTexture);
    }

    public static TextureHelper create(String str, EGLContext eGLContext, int i, int i2) {
        HandlerThread new_android_os_HandlerThread_by_knot = new_android_os_HandlerThread_by_knot(str);
        new_android_os_HandlerThread_by_knot.start();
        Handler handler = new Handler(new_android_os_HandlerThread_by_knot.getLooper());
        return (TextureHelper) ThreadUtils.invokeAtFrontUninterruptibly(handler, new Callable(eGLContext, handler, i, i2, str) {
            /* class com.ss.video.rtc.engine.utils.$$Lambda$TextureHelper$HdiB_ZeyKdfayhhR0MdhB8ooR2c */
            public final /* synthetic */ EGLContext f$0;
            public final /* synthetic */ Handler f$1;
            public final /* synthetic */ int f$2;
            public final /* synthetic */ int f$3;
            public final /* synthetic */ String f$4;

            {
                this.f$0 = r1;
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
                this.f$4 = r5;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return TextureHelper.lambda$create$1(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4);
            }
        });
    }

    public static TextureHelper create(String str, javax.microedition.khronos.egl.EGLContext eGLContext, int i, int i2) {
        HandlerThread new_android_os_HandlerThread_by_knot = new_android_os_HandlerThread_by_knot(str);
        new_android_os_HandlerThread_by_knot.start();
        Handler handler = new Handler(new_android_os_HandlerThread_by_knot.getLooper());
        return (TextureHelper) ThreadUtils.invokeAtFrontUninterruptibly(handler, new Callable(eGLContext, handler, i, i2, str) {
            /* class com.ss.video.rtc.engine.utils.$$Lambda$TextureHelper$DyVvCE66IOxSIcU_bwd4ha15twA */
            public final /* synthetic */ javax.microedition.khronos.egl.EGLContext f$0;
            public final /* synthetic */ Handler f$1;
            public final /* synthetic */ int f$2;
            public final /* synthetic */ int f$3;
            public final /* synthetic */ String f$4;

            {
                this.f$0 = r1;
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
                this.f$4 = r5;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return TextureHelper.lambda$create$0(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4);
            }
        });
    }

    private TextureHelper(Object obj, Handler handler, int i, int i2) {
        if (handler.getLooper().getThread() == Thread.currentThread()) {
            this.mWidth = i;
            this.mHeight = i2;
            this.mHandler = handler;
            Matrix.setIdentityM(TEX_MATRIX, 0);
            if (obj instanceof javax.microedition.khronos.egl.EGLContext) {
                this.mEglBase = EglBase.CC.createEgl10((javax.microedition.khronos.egl.EGLContext) obj, EglBase.CONFIG_PIXEL_BUFFER);
            } else if (obj instanceof EGLContext) {
                this.mEglBase = EglBase.CC.createEgl14((EGLContext) obj, EglBase.CONFIG_PIXEL_BUFFER);
            } else if (obj instanceof EglBase.Context) {
                this.mEglBase = EglBase.CC.create((EglBase.Context) obj);
            } else {
                throw new RuntimeException("unknown shareContext:" + obj);
            }
            try {
                this.mEglBase.createPbufferSurface(this.mWidth, this.mHeight);
                this.mEglBase.makeCurrent();
                int[] iArr = new int[1];
                GLES20.glGenFramebuffers(1, iArr, 0);
                this.mFrameBufferId = iArr[0];
                this.mTextureDrawer = new GlRectDrawer();
                GlUtil.checkNoGLES2Error("TextureHelper construct");
            } catch (RuntimeException e) {
                this.mEglBase.release();
                handler.getLooper().quit();
                throw e;
            }
        } else {
            throw new IllegalStateException("TextureHelper must be created on the handler thread");
        }
    }

    public static TextureHelper create(String str, EglBase.Context context, int i, int i2) {
        HandlerThread new_android_os_HandlerThread_by_knot = new_android_os_HandlerThread_by_knot(str);
        new_android_os_HandlerThread_by_knot.start();
        Handler handler = new Handler(new_android_os_HandlerThread_by_knot.getLooper());
        return (TextureHelper) ThreadUtils.invokeAtFrontUninterruptibly(handler, new Callable(handler, i, i2, str) {
            /* class com.ss.video.rtc.engine.utils.$$Lambda$TextureHelper$auzfT8ojUZSJGh6UcLTHHOY8su8 */
            public final /* synthetic */ Handler f$1;
            public final /* synthetic */ int f$2;
            public final /* synthetic */ int f$3;
            public final /* synthetic */ String f$4;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
                this.f$4 = r5;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return TextureHelper.lambda$create$2(EglBase.Context.this, this.f$1, this.f$2, this.f$3, this.f$4);
            }
        });
    }

    static /* synthetic */ TextureHelper lambda$create$0(javax.microedition.khronos.egl.EGLContext eGLContext, Handler handler, int i, int i2, String str) throws Exception {
        try {
            return new TextureHelper(eGLContext, handler, i, i2);
        } catch (RuntimeException e) {
            LogUtil.m257131e("TextureHelper", str + " create failure", e);
            return null;
        }
    }

    static /* synthetic */ TextureHelper lambda$create$1(EGLContext eGLContext, Handler handler, int i, int i2, String str) throws Exception {
        try {
            return new TextureHelper(eGLContext, handler, i, i2);
        } catch (RuntimeException e) {
            LogUtil.m257131e("TextureHelper", str + " create failure", e);
            return null;
        }
    }

    static /* synthetic */ TextureHelper lambda$create$2(EglBase.Context context, Handler handler, int i, int i2, String str) throws Exception {
        try {
            return new TextureHelper(context, handler, i, i2);
        } catch (RuntimeException e) {
            LogUtil.m257131e("TextureHelper", str + " create failure", e);
            return null;
        }
    }
}
