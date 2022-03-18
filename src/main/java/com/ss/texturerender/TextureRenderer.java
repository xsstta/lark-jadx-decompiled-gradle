package com.ss.texturerender;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.view.Surface;
import com.bytedance.platform.godzilla.thread.C20339a;
import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.texturerender.effect.EffectConfig;
import com.ss.texturerender.effect.EffectTextureManager;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class TextureRenderer implements Handler.Callback {
    public static String LOG_TAG = "TextureRenderer";
    protected long mDrawingObjectId;
    protected EffectConfig mEffectConfig;
    protected EffectTextureManager mEffectTextureManager;
    protected EGLConfig mEglConfig;
    protected EGLContext mEglContext;
    protected EGLDisplay mEglDisplay;
    protected EGLSurface mEglDummySurface;
    private OnEglErrorListener mErrorListener;
    private String mErrorReason;
    protected volatile Handler mHandler;
    private final Object mHandlerObject = new Object();
    private HandlerThread mHandlerThread;
    protected Handler mNotifyHandler;
    private Object mSetupFence = new Object();
    protected volatile int mState;
    private OnStateChangeListener mStateChangeListener;
    protected int mTexType;
    protected TextureFactory mTextureFactory;
    protected List<VideoSurfaceTexture> mTextureList;
    protected FloatBuffer mTriangleVertexBuffer;
    protected final float[] sVertexData = {-1.0f, -1.0f, 1.0f, -1.0f, 1.0f, 1.0f, -1.0f, 1.0f};

    public interface OnEglErrorListener {
        void onError(int i, String str);
    }

    public interface OnStateChangeListener {
        void onStateChanged(int i);
    }

    public interface OnTextureFocusLossListener {
        void onFocusLoss();
    }

    public static HandlerThread new_android_os_HandlerThread_by_knot(String str) {
        return C20341a.m74147a() ? C20339a.m74145a(str, 0, C20341a.f49621b) : new HandlerThread(str);
    }

    /* access modifiers changed from: protected */
    public abstract void deinitEffectComponents();

    /* access modifiers changed from: protected */
    public abstract void deinitGLComponents();

    /* access modifiers changed from: protected */
    public abstract void handleFrameAvailable(Message message);

    /* access modifiers changed from: protected */
    public abstract void handleGLThreadMessage(Message message);

    /* access modifiers changed from: protected */
    public abstract void handleSetSurface(Message message);

    /* access modifiers changed from: protected */
    public abstract void initGLComponents();

    /* access modifiers changed from: protected */
    public abstract void onInternalStateChanged(int i);

    /* access modifiers changed from: protected */
    public abstract void updateDisplaySize(int i, int i2);

    public EffectConfig getEffectConfig() {
        return this.mEffectConfig;
    }

    public EffectTextureManager getEffectTextureManager() {
        return this.mEffectTextureManager;
    }

    public String getErrorReason() {
        return this.mErrorReason;
    }

    public int getState() {
        return this.mState;
    }

    public int texType() {
        return this.mTexType;
    }

    private EGLDisplay getDefaultDisplay() {
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        if (eglGetDisplay == null) {
            notifyEGLError(0, "egl get display failed");
        }
        int[] iArr = new int[2];
        if (EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
            return eglGetDisplay;
        }
        notifyEGLError(0, "eglInitialize failed");
        return null;
    }

    private int[] getRGB565Attributes() {
        return new int[]{12352, 4, 12324, 5, 12323, 6, 12322, 5, 12344};
    }

    private int[] getRGB888Attributes() {
        return new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12344};
    }

    public VideoSurface genOffscreenSurface() {
        VideoSurfaceTexture surfaceTexture;
        if (this.mState >= 1 && (surfaceTexture = getSurfaceTexture()) != null) {
            return surfaceTexture.getOffScreenSurface();
        }
        return null;
    }

    private EGLConfig chooseEglConfig() {
        int[] iArr = new int[1];
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[][] iArr2 = {getRGB888Attributes(), getRGB565Attributes()};
        for (int i = 0; i < 2; i++) {
            if (EGL14.eglChooseConfig(this.mEglDisplay, iArr2[0], 0, eGLConfigArr, 0, 1, iArr, 0) && iArr[0] > 0) {
                return eGLConfigArr[0];
            }
        }
        notifyEGLError(0, "eglChooseConfig failed");
        return null;
    }

    private void deinitEGL() {
        if (this.mEglDisplay != EGL14.EGL_NO_DISPLAY) {
            EGL14.eglMakeCurrent(this.mEglDisplay, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_CONTEXT);
            if (this.mEglDummySurface != EGL14.EGL_NO_SURFACE) {
                EGL14.eglDestroySurface(this.mEglDisplay, this.mEglDummySurface);
                this.mEglDummySurface = EGL14.EGL_NO_SURFACE;
            }
            if (this.mEglContext != EGL14.EGL_NO_CONTEXT) {
                EGL14.eglDestroyContext(this.mEglDisplay, this.mEglContext);
                this.mEglContext = EGL14.EGL_NO_CONTEXT;
            }
            EGL14.eglTerminate(this.mEglDisplay);
            this.mEglDisplay = EGL14.EGL_NO_DISPLAY;
            String str = LOG_TAG;
            TextureRenderLog.m256492d(str, this + "OpenGL deinit OK.");
        }
    }

    private void deleteTextures() {
        synchronized (this.mTextureList) {
            if (this.mTextureList.size() > 0) {
                Iterator<VideoSurfaceTexture> it = this.mTextureList.iterator();
                while (it.hasNext()) {
                    it.next().release(true);
                    it.remove();
                }
            }
            String str = LOG_TAG;
            TextureRenderLog.m256492d(str, "delete textures : " + this.mTextureList.size());
            this.mTextureFactory.release();
        }
    }

    private ITexture getTexture() {
        try {
            Message obtainMessage = this.mHandler.obtainMessage(9);
            Message message = new Message();
            obtainMessage.obj = message;
            try {
                synchronized (message) {
                    this.mHandler.sendMessageAtFrontOfQueue(obtainMessage);
                    message.wait(1000);
                }
                if (message.obj == null) {
                    if (this.mHandler.hasMessages(9)) {
                        this.mErrorReason = "The handler is busy for other operation timeout";
                    } else {
                        this.mErrorReason = "Try modify the wait timeOut";
                    }
                }
                return (ITexture) message.obj;
            } catch (Exception e) {
                String str = LOG_TAG;
                TextureRenderLog.m256492d(str, "texture render may exit, error:" + e.toString());
                return null;
            }
        } catch (Exception unused) {
            TextureRenderLog.m256492d(LOG_TAG, "texture render already exit");
            return null;
        }
    }

    public void handleDeinit() {
        String str = LOG_TAG;
        TextureRenderLog.m256492d(str, this + "deinit");
        changeState(0, true);
        deinitEffectComponents();
        deleteTextures();
        deinitGLComponents();
        deinitEGL();
        this.mHandler = null;
        String str2 = LOG_TAG;
        TextureRenderLog.m256492d(str2, this + "deinit done");
    }

    public void release() {
        String str = LOG_TAG;
        TextureRenderLog.m256492d(str, this + "call release");
        synchronized (this) {
            if (this.mState != 0) {
                if (this.mHandler != null) {
                    String str2 = LOG_TAG;
                    TextureRenderLog.m256492d(str2, this + "send deinit");
                    this.mHandler.sendEmptyMessage(3);
                    try {
                        if (Build.VERSION.SDK_INT >= 18) {
                            this.mHandlerThread.quitSafely();
                        } else {
                            this.mHandlerThread.quit();
                        }
                    } catch (Exception unused) {
                    }
                    String str3 = LOG_TAG;
                    TextureRenderLog.m256492d(str3, this + "call release end");
                    return;
                }
            }
            String str4 = LOG_TAG;
            TextureRenderLog.m256492d(str4, this + "release return");
        }
    }

    private VideoSurfaceTexture getSurfaceTexture() {
        synchronized (this.mTextureList) {
            Iterator<VideoSurfaceTexture> it = this.mTextureList.iterator();
            while (true) {
                VideoSurfaceTexture videoSurfaceTexture = null;
                while (it.hasNext()) {
                    videoSurfaceTexture = it.next();
                    if (videoSurfaceTexture.isRelease() || videoSurfaceTexture.isAlive()) {
                        if (!this.mEffectConfig.isOpenSR() && !this.mEffectConfig.isOpenSharpen() && (this.mTexType & 4) == 0) {
                            TextureRenderLog.m256492d(LOG_TAG, "still living");
                            return null;
                        }
                    } else if (videoSurfaceTexture.canReuse(Looper.myLooper())) {
                        TextureRenderLog.m256492d(LOG_TAG, "same looper reuse texture");
                        videoSurfaceTexture.pause(false, false);
                        videoSurfaceTexture.getOffScreenSurface();
                        return videoSurfaceTexture;
                    } else {
                        TextureRenderLog.m256492d(LOG_TAG, "can't reuse, delete = " + videoSurfaceTexture);
                        videoSurfaceTexture.release(false);
                        it.remove();
                    }
                }
                ITexture texture = getTexture();
                if (texture != null) {
                    videoSurfaceTexture = new VideoSurfaceTexture(texture, this.mHandler, this);
                    videoSurfaceTexture.setOption(5, this.mTexType);
                    videoSurfaceTexture.bindEGLEnv(this.mEglContext, this.mEglDisplay, this.mEglConfig);
                    texture.decRef();
                    videoSurfaceTexture.getOffScreenSurface();
                    this.mTextureList.add(videoSurfaceTexture);
                }
                return videoSurfaceTexture;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0034, code lost:
        if (r0 == android.opengl.EGL14.EGL_NO_SURFACE) goto L_0x0036;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void initEGL() {
        /*
        // Method dump skipped, instructions count: 134
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.texturerender.TextureRenderer.initEGL():void");
    }

    public void checkExpired() {
        VideoSurfaceTexture next;
        if (this.mHandler == null) {
            return;
        }
        if ((!this.mEffectConfig.isOpenSR() && !this.mEffectConfig.isOpenSharpen()) || (this.mTexType & 4) != 0) {
            String str = LOG_TAG;
            TextureRenderLog.m256492d(str, "renderer =" + this + ", check expired");
            synchronized (this.mTextureList) {
                if (!this.mHandler.hasMessages(8)) {
                    if (!this.mHandler.hasMessages(9)) {
                        if (this.mTextureList.size() == 0) {
                            TextureRenderLog.m256492d(LOG_TAG, "renderer is expired");
                            release();
                            return;
                        }
                        boolean z = false;
                        Iterator<VideoSurfaceTexture> it = this.mTextureList.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            next = it.next();
                            if (next.isRelease() || (!next.isAlive() && next.couldForceRelease())) {
                            }
                        }
                        String str2 = LOG_TAG;
                        TextureRenderLog.m256492d(str2, "a texture is still working " + next);
                        z = true;
                        if (!z) {
                            TextureRenderLog.m256492d(LOG_TAG, "non live texture , renderer is expired");
                            release();
                            return;
                        }
                        this.mHandler.sendEmptyMessageDelayed(11, 120000);
                        return;
                    }
                }
                TextureRenderLog.m256492d(LOG_TAG, "renderer is excuting");
                this.mHandler.sendEmptyMessageDelayed(11, 120000);
            }
        }
    }

    private final void msgNotify(Message message) {
        if (message != null) {
            synchronized (message) {
                message.arg1 = this.mState;
                message.notify();
            }
        }
    }

    public void handleGenTexture(Message message) {
        ITexture createTexture = this.mTextureFactory.createTexture(36197);
        if (createTexture == null) {
            TextureRenderLog.m256492d(LOG_TAG, "Create Texture failed.");
        }
        message.obj = createTexture;
        synchronized (message) {
            message.notify();
        }
    }

    public void setOnErrorListener(OnEglErrorListener onEglErrorListener) {
        String str = LOG_TAG;
        TextureRenderLog.m256492d(str, "setOnErrorListener =  " + onEglErrorListener);
        this.mErrorListener = onEglErrorListener;
    }

    public void setOnStateChangedListener(OnStateChangeListener onStateChangeListener) {
        String str = LOG_TAG;
        TextureRenderLog.m256492d(str, "setOnStateChangedListener =  " + onStateChangeListener);
        this.mStateChangeListener = onStateChangeListener;
    }

    public void handleInit(Object obj) {
        TextureRenderLog.m256492d(LOG_TAG, "init start");
        initEGL();
        if (this.mState != -1) {
            initGLComponents();
            if (this.mState != -1) {
                changeState(1, true);
                synchronized (obj) {
                    obj.notify();
                    TextureRenderLog.m256492d(LOG_TAG, "init done");
                }
            }
        }
    }

    public void handleChangeActiveTexture(VideoSurfaceTexture videoSurfaceTexture) {
        if (videoSurfaceTexture != null) {
            String str = LOG_TAG;
            TextureRenderLog.m256492d(str, "resume texture =" + videoSurfaceTexture);
            if (!videoSurfaceTexture.isCurrentObject(this.mDrawingObjectId)) {
                videoSurfaceTexture.makeCurrent();
                this.mDrawingObjectId = videoSurfaceTexture.getOjbectId();
                String str2 = LOG_TAG;
                TextureRenderLog.m256492d(str2, "change active drawing id = " + this.mDrawingObjectId);
            }
        }
    }

    public boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 6) {
            OnEglErrorListener onEglErrorListener = this.mErrorListener;
            if (onEglErrorListener == null) {
                return true;
            }
            onEglErrorListener.onError(message.arg1, message.obj.toString());
            return true;
        } else if (i == 7) {
            OnStateChangeListener onStateChangeListener = this.mStateChangeListener;
            if (onStateChangeListener == null) {
                return true;
            }
            onStateChangeListener.onStateChanged(message.arg1);
            if (message.arg1 != 0) {
                return true;
            }
            this.mNotifyHandler.removeCallbacksAndMessages(null);
            this.mNotifyHandler = null;
            return true;
        } else if (i != 8) {
            return true;
        } else {
            int i2 = message.arg1;
            VideoSurfaceTexture videoSurfaceTexture = (VideoSurfaceTexture) message.obj;
            if (videoSurfaceTexture == null) {
                return true;
            }
            videoSurfaceTexture.notifyRenderFrame(i2);
            return true;
        }
    }

    public void handleClearSurface(Message message) {
        TextureRenderLog.m256492d(LOG_TAG, "handle clear surface");
        Message message2 = (Message) message.obj;
        if (this.mState < 1) {
            String str = LOG_TAG;
            TextureRenderLog.m256492d(str, "state is invalid : " + this.mState);
            msgNotify(message2);
            return;
        }
        Surface surface = (Surface) message.getData().getParcelable("surface");
        try {
            String str2 = LOG_TAG;
            TextureRenderLog.m256492d(str2, this + ",create window surface from " + surface);
            EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface(this.mEglDisplay, this.mEglConfig, surface, new int[]{12344}, 0);
            if (eglCreateWindowSurface == EGL14.EGL_NO_SURFACE) {
                String str3 = LOG_TAG;
                TextureRenderLog.m256492d(str3, "create window surface failed" + GLUtils.getEGLErrorString(EGL14.eglGetError()));
                msgNotify(message2);
            } else if (!EGL14.eglMakeCurrent(this.mEglDisplay, eglCreateWindowSurface, eglCreateWindowSurface, this.mEglContext)) {
                String str4 = LOG_TAG;
                TextureRenderLog.m256492d(str4, "make current failed = " + eglCreateWindowSurface);
                msgNotify(message2);
            } else {
                GLES20.glClearColor(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f);
                GLES20.glClear(16384);
                EGL14.eglSwapBuffers(this.mEglDisplay, eglCreateWindowSurface);
                EGLDisplay eGLDisplay = this.mEglDisplay;
                EGLSurface eGLSurface = this.mEglDummySurface;
                EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.mEglContext);
                EGL14.eglDestroySurface(this.mEglDisplay, eglCreateWindowSurface);
                msgNotify(message2);
            }
        } catch (Exception unused) {
            TextureRenderLog.m256492d(LOG_TAG, "create current exception failed");
        }
    }

    public void handleSaveFrame(Message message) {
        TextureRenderLog.m256492d(LOG_TAG, "handle save frame");
        Bundle data = message.getData();
        if (data != null) {
            VideoSurfaceTexture videoSurfaceTexture = (VideoSurfaceTexture) data.getSerializable("texture");
            if (videoSurfaceTexture != null) {
                Message message2 = (Message) message.obj;
                if (this.mState < 1) {
                    String str = LOG_TAG;
                    TextureRenderLog.m256492d(str, "state is invalid : " + this.mState);
                    msgNotify(message2);
                    return;
                }
                try {
                    int viewportWidth = videoSurfaceTexture.getViewportWidth();
                    int viewportHeight = videoSurfaceTexture.getViewportHeight();
                    if (viewportWidth == 0 || viewportHeight == 0) {
                        String str2 = LOG_TAG;
                        TextureRenderLog.m256492d(str2, "texture size is invalid = " + viewportWidth + ", height =" + viewportHeight);
                    }
                    String str3 = LOG_TAG;
                    TextureRenderLog.m256492d(str3, "savexx frame = " + viewportWidth + ", " + viewportHeight);
                    ByteBuffer allocateDirect = ByteBuffer.allocateDirect(viewportWidth * viewportHeight * 4);
                    allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
                    GLES20.glFinish();
                    GLES20.glReadPixels(0, 0, viewportWidth, viewportHeight, 6408, 5121, allocateDirect);
                    TexGLUtils.checkGLError("handleSaveFrame");
                    Bitmap createBitmap = Bitmap.createBitmap(viewportWidth, viewportHeight, Bitmap.Config.ARGB_8888);
                    allocateDirect.rewind();
                    createBitmap.copyPixelsFromBuffer(allocateDirect);
                    Matrix matrix = new Matrix();
                    matrix.postScale(1.0f, -1.0f);
                    message2.obj = Bitmap.createBitmap(createBitmap, 0, 0, viewportWidth, viewportHeight, matrix, true);
                    createBitmap.recycle();
                } catch (Exception e) {
                    String str4 = LOG_TAG;
                    TextureRenderLog.m256492d(str4, "save frame failed " + e.getMessage());
                }
                msgNotify(message2);
                return;
            }
            throw new RuntimeException("update surface but missing texture");
        }
        throw new RuntimeException("update surface but missing bundle?");
    }

    private EGLContext createContext(EGLDisplay eGLDisplay, EGLConfig eGLConfig) {
        EGLContext eGLContext = EGL14.EGL_NO_CONTEXT;
        EGLContext eglCreateContext = EGL14.eglCreateContext(eGLDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, new int[]{12440, 2, 12344}, 0);
        if (eglCreateContext == EGL14.EGL_NO_CONTEXT) {
            notifyEGLError(0, "eglcreateContext failed");
        }
        return eglCreateContext;
    }

    private void changeState(int i, boolean z) {
        if (this.mState != i) {
            if (this.mState != -1 || i == 0) {
                String str = LOG_TAG;
                TextureRenderLog.m256492d(str, "state change from " + this.mState + " to " + i);
                this.mState = i;
                if (z) {
                    synchronized (this.mHandlerObject) {
                        if (this.mStateChangeListener != null) {
                            Handler handler = this.mNotifyHandler;
                            if (handler != null) {
                                Message obtainMessage = handler.obtainMessage(7);
                                obtainMessage.arg1 = i;
                                obtainMessage.sendToTarget();
                            }
                        }
                    }
                }
            }
        }
    }

    public boolean clearSurface(Surface surface, boolean z) {
        Message obtainMessage = this.mHandler.obtainMessage(13);
        Bundle bundle = new Bundle();
        bundle.putParcelable("surface", surface);
        obtainMessage.setData(bundle);
        if (!z) {
            Message message = new Message();
            obtainMessage.obj = message;
            try {
                synchronized (message) {
                    TextureRenderLog.m256492d(LOG_TAG, "clear surface start");
                    this.mHandler.sendMessage(obtainMessage);
                    message.wait(1000);
                    String str = LOG_TAG;
                    TextureRenderLog.m256492d(str, "clear surface end : ret = " + message.arg1);
                }
                if (message.arg1 < 1) {
                    return false;
                }
            } catch (InterruptedException unused) {
                return false;
            }
        } else {
            this.mHandler.sendMessage(obtainMessage);
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void notifyEGLError(int i, String str) {
        synchronized (this.mHandlerObject) {
            this.mErrorReason = str + ", reason = " + GLUtils.getEGLErrorString(EGL14.eglGetError());
            changeState(-1, false);
            if (this.mErrorListener != null) {
                Message obtainMessage = this.mNotifyHandler.obtainMessage(6);
                obtainMessage.arg1 = i;
                obtainMessage.obj = "EGL fail = " + str + ", reason = " + GLUtils.getEGLErrorString(EGL14.eglGetError());
                obtainMessage.sendToTarget();
            }
        }
    }

    public TextureRenderer(EffectConfig effectConfig, int i) {
        TextureRenderLog.m256492d(LOG_TAG, "version :3.6.0");
        this.mState = 0;
        this.mErrorReason = null;
        this.mEglDummySurface = EGL14.EGL_NO_SURFACE;
        this.mEglContext = EGL14.EGL_NO_CONTEXT;
        this.mEglDisplay = EGL14.EGL_NO_DISPLAY;
        this.mDrawingObjectId = 0;
        this.mEffectConfig = new EffectConfig();
        this.mTexType = i;
        this.mTextureFactory = new TextureFactory();
        this.mTextureList = new ArrayList();
        HandlerThread new_android_os_HandlerThread_by_knot = new_android_os_HandlerThread_by_knot("RendererThread_" + i);
        this.mHandlerThread = new_android_os_HandlerThread_by_knot;
        new_android_os_HandlerThread_by_knot.start();
        this.mHandler = new Handler(this.mHandlerThread.getLooper()) {
            /* class com.ss.texturerender.TextureRenderer.HandlerC654071 */

            public void handleMessage(Message message) {
                int i = message.what;
                if (i == 1) {
                    TextureRenderer.this.handleInit(message.obj);
                } else if (i == 2) {
                    TextureRenderer.this.handleFrameAvailable(message);
                } else if (i == 3) {
                    TextureRenderer.this.handleDeinit();
                } else if (i == 4) {
                    TextureRenderer.this.handleSetSurface(message);
                } else if (i == 13) {
                    TextureRenderer.this.handleClearSurface(message);
                } else if (i != 14) {
                    switch (i) {
                        case 9:
                            TextureRenderer.this.handleGenTexture((Message) message.obj);
                            return;
                        case 10:
                            TextureRenderer.this.handleChangeActiveTexture((VideoSurfaceTexture) message.obj);
                            return;
                        case 11:
                            TextureRenderer.this.checkExpired();
                            return;
                        default:
                            TextureRenderer.this.handleGLThreadMessage(message);
                            return;
                    }
                } else {
                    TextureRenderer.this.handleSaveFrame(message);
                }
            }
        };
        Message obtainMessage = this.mHandler.obtainMessage(1);
        obtainMessage.obj = this.mSetupFence;
        synchronized (this.mSetupFence) {
            obtainMessage.sendToTarget();
            try {
                this.mSetupFence.wait(1000);
            } catch (InterruptedException unused) {
                throw new RuntimeException("EGL initial timeout");
            }
        }
        this.mHandler.sendMessageDelayed(this.mHandler.obtainMessage(11), 120000);
        TextureRenderLog.m256492d(LOG_TAG, "construct done");
    }
}
