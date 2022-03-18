package com.ss.texturerender;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.view.Surface;
import com.huawei.hms.android.HwBuildEx;
import com.ss.texturerender.TextureRenderer;
import com.ss.texturerender.VideoSurface;
import com.ss.texturerender.effect.EffectConfig;
import com.ss.texturerender.effect.EffectTexture;
import com.ss.texturerender.effect.EffectTextureManager;
import com.ss.texturerender.overlay.FrameTimeQueue;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.locks.ReentrantLock;

public class VideoSurfaceTexture extends SurfaceTexture implements SurfaceTexture.OnFrameAvailableListener, TextureRenderer.OnTextureFocusLossListener, Serializable {
    public static final int ERROR_SR_EXE_FAIL = 2;
    public static final int ERROR_SR_INIT_FAIL = 1;
    private static int[] resHeightTab = {864, 960, 960, 1024, 648, 1016};
    private static int[] resWdithTab = {480, 540, 544, 576, 576, 576};
    private EffectConfig mConfig = new EffectConfig();
    private Looper mCreateLooper;
    private int mDropCount = 0;
    private EGLConfig mEglConfig;
    private EGLContext mEglContext;
    private EGLDisplay mEglDisplay;
    private EGLSurface mEglSurface = EGL14.EGL_NO_SURFACE;
    private HashMap<Surface, EGLSurface> mExtraSurfaceMap;
    private long mIdleTimeStamp;
    private boolean mIgnoreSRResCheck = false;
    private boolean mIsMakeCurrent = false;
    private boolean mIsPaused = false;
    private boolean mIsPreRender = false;
    private volatile boolean mIsRelease = false;
    private ReentrantLock mLock;
    private long mObjectId;
    private VideoSurface mOffScreenSurface = null;
    private Handler mRenderHandler;
    private Bundle mRenderMsgBundle;
    private Surface mRenderSurface = null;
    private Bundle mSaveFrameBundle = new Bundle();
    private int mSerial = 0;
    private long mStartPlayTimeNanos = -1;
    private int mState = 3;
    private volatile int mSuperOpen;
    private Message mSyncMsg = new Message();
    private int mSyncUpdateSurface = 0;
    private int mTexHeight;
    private int mTexType;
    private int mTexWidth;
    private ITexture mTextureId;
    private LinkedList<EffectTexture> mTextureQueue = new LinkedList<>();
    private TextureRenderer mTextureRenderer;
    private long mTid;
    private Surface mUpdateSurface = null;
    private long mUpdateSurfaceTime;
    private HashMap<Integer, Integer> mUsingEffect = new HashMap<>();
    private int mViewportHeight = 0;
    private int mViewportWidth = 0;

    public interface TextureDrawCallback {
        void onTextureUpdate(int i, long j);
    }

    public interface TextureErrorCallback {
        void onTextureRenderError(int i);
    }

    @Override // com.ss.texturerender.TextureRenderer.OnTextureFocusLossListener
    public void onFocusLoss() {
        this.mIsMakeCurrent = false;
    }

    public void preRender() {
        this.mIsPreRender = true;
    }

    public EffectConfig getEffectConfig() {
        return this.mConfig;
    }

    public HashMap<Surface, EGLSurface> getExtraRealSurfaces() {
        return this.mExtraSurfaceMap;
    }

    public long getOjbectId() {
        return this.mObjectId;
    }

    public Surface getRenderSurface() {
        return this.mRenderSurface;
    }

    public int getSerial() {
        return this.mSerial;
    }

    public long getSurfaceUpdateTime() {
        return this.mUpdateSurfaceTime;
    }

    public int getTexHeight() {
        return this.mTexHeight;
    }

    public ITexture getTexId() {
        return this.mTextureId;
    }

    public int getTexWidth() {
        return this.mTexWidth;
    }

    public Surface getUpdateSurface() {
        return this.mUpdateSurface;
    }

    public int getUseSr() {
        return this.mSuperOpen;
    }

    public boolean isPreRender() {
        return this.mIsPreRender;
    }

    public boolean isRelease() {
        return this.mIsRelease;
    }

    public void lock() {
        this.mLock.lock();
    }

    public void resetFlag() {
        this.mUsingEffect.clear();
    }

    public void unlock() {
        this.mLock.unlock();
    }

    /* access modifiers changed from: protected */
    @Override // android.graphics.SurfaceTexture, java.lang.Object
    public void finalize() throws Throwable {
        TextureRenderLog.m256492d("VideoSurfaceTexture", "finalize");
        releaseInternal();
        super.finalize();
    }

    public int getViewportHeight() {
        int consumerHeight = getConsumerHeight(this.mEglSurface);
        if (this.mViewportHeight != consumerHeight) {
            this.mViewportHeight = consumerHeight;
        }
        return this.mViewportHeight;
    }

    public int getViewportWidth() {
        int consumerWidth = getConsumerWidth(this.mEglSurface);
        if (this.mViewportWidth != consumerWidth) {
            this.mViewportWidth = consumerWidth;
        }
        return this.mViewportWidth;
    }

    public boolean isMakeCurrent() {
        if (!this.mIsMakeCurrent || this.mEglSurface == EGL14.EGL_NO_SURFACE) {
            return false;
        }
        return true;
    }

    public boolean makeCurrent() {
        if (!makeCurrent(this.mEglSurface)) {
            return false;
        }
        this.mIsMakeCurrent = true;
        return true;
    }

    public void release() {
        TextureRenderLog.m256492d("VideoSurfaceTexture", "release");
        releaseInternal();
        super.release();
    }

    public boolean couldForceRelease() {
        if (SystemClock.elapsedRealtime() - this.mIdleTimeStamp > 120000) {
            return true;
        }
        return false;
    }

    public boolean render() {
        if (!eglSwapBuffer(this.mEglSurface)) {
            return false;
        }
        notifyRenderFrame(this.mSerial);
        return true;
    }

    private void sendRenderMsg() {
        Handler handler = this.mRenderHandler;
        if (handler != null) {
            try {
                Message obtainMessage = handler.obtainMessage(2);
                obtainMessage.obj = this;
                if (!this.mSaveFrameBundle.isEmpty()) {
                    synchronized (this.mSaveFrameBundle) {
                        obtainMessage.setData(this.mSaveFrameBundle);
                        this.mSaveFrameBundle = new Bundle();
                    }
                }
                obtainMessage.sendToTarget();
            } catch (Exception unused) {
            }
        }
    }

    public EffectTexture dequeueTexture() {
        EffectTexture poll = this.mTextureQueue.poll();
        if (poll == null) {
            return null;
        }
        if (!(poll.getWidth() == this.mTexWidth && poll.getHeight() == this.mTexHeight)) {
            EffectTextureManager effectTextureManager = this.mTextureRenderer.getEffectTextureManager();
            effectTextureManager.onTextureReturn(poll);
            poll = effectTextureManager.genTexture(this.mTexWidth, this.mTexHeight);
        }
        poll.setSurfaceTexture(this);
        return poll;
    }

    public synchronized VideoSurface getOffScreenSurface() {
        if (this.mIsRelease) {
            return null;
        }
        if (this.mOffScreenSurface == null) {
            this.mOffScreenSurface = new VideoSurface(this);
        }
        this.mIdleTimeStamp = -9223372036854775807L;
        return this.mOffScreenSurface;
    }

    public boolean isAlive() {
        TextureRenderLog.m256492d("VideoSurfaceTexture", "is alive = " + this.mOffScreenSurface + ", eglsur = " + this.mEglSurface);
        if (this.mOffScreenSurface == null && this.mEglSurface == EGL14.EGL_NO_SURFACE) {
            return false;
        }
        return true;
    }

    public synchronized void releaseAllExtraSurface_l() {
        Handler handler = this.mRenderHandler;
        if (handler != null) {
            Message obtainMessage = handler.obtainMessage(25);
            obtainMessage.arg1 = 3;
            Bundle bundle = new Bundle();
            bundle.putSerializable("texture", this);
            obtainMessage.setData(bundle);
            this.mRenderHandler.sendMessage(obtainMessage);
        }
    }

    public boolean needDrop() {
        int i;
        long j = this.mStartPlayTimeNanos;
        if (j > 0 && j > getTimestamp() && (i = this.mDropCount) < 5) {
            this.mDropCount = i + 1;
            TextureRenderLog.m256492d("VideoSurfaceTexture", "texture" + this + " previous play period,drop count:" + this.mDropCount);
            return true;
        } else if (!this.mIsPaused) {
            return false;
        } else {
            TextureRenderLog.m256492d("VideoSurfaceTexture", "texture" + this + " is paused");
            return true;
        }
    }

    public void releaseAllExtraSurface() {
        Iterator<Map.Entry<Surface, EGLSurface>> it = this.mExtraSurfaceMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Surface, EGLSurface> next = it.next();
            if (!(next.getValue() == EGL14.EGL_NO_SURFACE || next.getValue() == null)) {
                EGL14.eglDestroySurface(this.mEglDisplay, next.getValue());
                TextureRenderLog.m256492d("VideoSurfaceTexture", "releaseAllExtraSurface sf:" + this + ", eglSurface:" + next.getValue());
            }
            it.remove();
        }
    }

    public void updateTextureForFbo() {
        if (!this.mIsRelease) {
            while (this.mTextureQueue.size() < 2) {
                EffectTexture genTexture = this.mTextureRenderer.getEffectTextureManager().genTexture(this.mTexWidth, this.mTexHeight);
                this.mTextureQueue.offer(genTexture);
                TextureRenderLog.m256492d("VideoSurfaceTexture", "gen fbotex:" + genTexture.getTexID() + ",st:" + this);
            }
        }
    }

    public synchronized void releaseInternal() {
        if (!this.mIsRelease) {
            try {
                lock();
                TextureRenderLog.m256492d("VideoSurfaceTexture", this + " release internal");
                this.mIsRelease = true;
                this.mTextureId.decRef();
                this.mRenderHandler = null;
                this.mCreateLooper = null;
                EffectTextureManager effectTextureManager = this.mTextureRenderer.getEffectTextureManager();
                while (this.mTextureQueue.size() > 0) {
                    EffectTexture poll = this.mTextureQueue.poll();
                    if (effectTextureManager != null) {
                        effectTextureManager.onTextureReturn(poll);
                    } else {
                        TexGLUtils.deleteTexture(poll.getTexID());
                    }
                    TextureRenderLog.m256492d("VideoSurfaceTexture", "return fbotex:" + poll.getTexID() + ",st:" + this);
                }
                TextureRenderLog.m256492d("VideoSurfaceTexture", this + " release internal done");
            } finally {
                unlock();
            }
        }
    }

    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        sendRenderMsg();
    }

    public void notifyError(int i) {
        try {
            this.mOffScreenSurface.onTextureRenderError(i);
        } catch (Exception unused) {
        }
    }

    public boolean isCurrentObject(long j) {
        if (this.mObjectId == j) {
            return true;
        }
        return false;
    }

    public void notifyRenderFrame(int i) {
        if (i == this.mSerial) {
            try {
                this.mOffScreenSurface.onTextureUpdate(i, getTimestamp());
            } catch (Exception unused) {
            }
        }
    }

    public int getConsumerHeight(EGLSurface eGLSurface) {
        if (eGLSurface == EGL14.EGL_NO_SURFACE) {
            return -1;
        }
        int[] iArr = new int[1];
        EGL14.eglQuerySurface(this.mEglDisplay, eGLSurface, 12374, iArr, 0);
        return iArr[0];
    }

    public int getConsumerWidth(EGLSurface eGLSurface) {
        if (eGLSurface == EGL14.EGL_NO_SURFACE) {
            return -1;
        }
        int[] iArr = new int[1];
        EGL14.eglQuerySurface(this.mEglDisplay, eGLSurface, 12375, iArr, 0);
        return iArr[0];
    }

    public void ignoreSRResolutionCheck(boolean z) {
        this.mIgnoreSRResCheck = z;
        TextureRenderLog.m256492d("VideoSurfaceTexture", "ignoreSRResolutionCheck:" + z);
    }

    public synchronized void updateVideoState(int i) {
        Handler handler = this.mRenderHandler;
        if (handler != null) {
            Message obtainMessage = handler.obtainMessage(26);
            obtainMessage.obj = this;
            obtainMessage.arg1 = i;
            this.mRenderHandler.sendMessageAtFrontOfQueue(obtainMessage);
        }
    }

    public boolean eglSwapBuffer(EGLSurface eGLSurface) {
        if (EGL14.eglSwapBuffers(this.mEglDisplay, eGLSurface)) {
            return true;
        }
        notifyError(EGL14.eglGetError());
        TextureRenderLog.m256492d("VideoSurfaceTexture", this + "swap buffer failed:" + GLUtils.getEGLErrorString(EGL14.eglGetError()));
        return false;
    }

    public void enqueueTexture(EffectTexture effectTexture) {
        if (this.mTextureQueue == null || this.mIsRelease) {
            EffectTextureManager effectTextureManager = this.mTextureRenderer.getEffectTextureManager();
            if (effectTextureManager != null) {
                effectTextureManager.onTextureReturn(effectTexture);
            } else {
                TexGLUtils.deleteTexture(effectTexture.getTexID());
            }
        } else {
            this.mTextureQueue.offer(effectTexture);
        }
    }

    public void release(boolean z) {
        TextureRenderLog.m256492d("VideoSurfaceTexture", "release " + this + ", glthread = " + z);
        releaseOffScreenSurface(z);
        release();
    }

    public synchronized void setSuperResolutionMode(int i) {
        TextureRenderLog.m256492d("VideoSurfaceTexture", this + " set sr = " + i);
        this.mSuperOpen = i;
        this.mConfig.setEffectOpen(5, i);
    }

    private void internalConstruct(Handler handler) {
        this.mObjectId = new Random().nextLong();
        this.mRenderHandler = handler;
        this.mLock = new ReentrantLock();
        this.mCreateLooper = Looper.myLooper();
        this.mRenderMsgBundle = new Bundle();
        this.mEglSurface = EGL14.EGL_NO_SURFACE;
        this.mSuperOpen = 0;
        setOnFrameAvailableListener(this);
        TextureRenderLog.m256492d("VideoSurfaceTexture", this + "gen a texture :" + this.mObjectId + ", thread id " + Thread.currentThread().getId() + ", looper = " + looperToString(this.mCreateLooper));
    }

    private String looperToString(Looper looper) {
        if (looper == null) {
            return null;
        }
        Thread thread = looper.getThread();
        if (thread != null) {
            return "Looper (" + thread.getName() + ", tid " + thread.getId() + ") {" + Integer.toHexString(System.identityHashCode(looper)) + "}";
        }
        return "Looper {" + Integer.toHexString(System.identityHashCode(looper)) + "}";
    }

    public boolean canReuse(Looper looper) {
        StringBuilder sb;
        boolean z = false;
        try {
            if (looper == this.mCreateLooper) {
                z = true;
            }
            sb = new StringBuilder();
        } catch (Exception unused) {
            sb = new StringBuilder();
        } catch (Throwable unused2) {
            sb = new StringBuilder();
        }
        sb.append(this);
        sb.append("ret = ");
        sb.append(z);
        sb.append(" looper =");
        sb.append(looperToString(looper));
        sb.append(", mlooper = ");
        sb.append(looperToString(this.mCreateLooper));
        TextureRenderLog.m256492d("VideoSurfaceTexture", sb.toString());
        return z;
    }

    public EGLSurface createEGLWindowSurface(Surface surface) {
        EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
        if (surface == null || !surface.isValid()) {
            return eGLSurface;
        }
        int[] iArr = {12344};
        try {
            TextureRenderLog.m256492d("VideoSurfaceTexture", this + ",create window surface from " + surface);
            EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface(this.mEglDisplay, this.mEglConfig, surface, iArr, 0);
            if (eglCreateWindowSurface != EGL14.EGL_NO_SURFACE) {
                return eglCreateWindowSurface;
            }
            notifyError(EGL14.eglGetError());
            TextureRenderLog.m256492d("VideoSurfaceTexture", "create window surface failed" + GLUtils.getEGLErrorString(EGL14.eglGetError()));
            return eglCreateWindowSurface;
        } catch (Exception unused) {
            notifyError(5);
            TextureRenderLog.m256492d("VideoSurfaceTexture", "createEGLWindowSurface exception failed");
            return EGL14.EGL_NO_SURFACE;
        }
    }

    public void handleUpdateVideoState(int i) {
        this.mState = i;
        if (i != 1) {
            if (i == 2) {
                TextureRenderLog.m256492d("VideoSurfaceTexture", "TEXTURE_STATE_STOP mStartPlayTimeNanos:" + this.mStartPlayTimeNanos);
            } else if (i == 3) {
                this.mDropCount = 0;
                TextureRenderLog.m256492d("VideoSurfaceTexture", "TEXTURE_STATE_STOP");
            }
        } else if (this.mStartPlayTimeNanos <= 0) {
            this.mStartPlayTimeNanos = System.nanoTime();
            TextureRenderLog.m256492d("VideoSurfaceTexture", "TEXTURE_STATE_PLAYING mStartPlayTimeNanos:" + this.mStartPlayTimeNanos);
        }
    }

    public void initExtraSurface(Surface surface) {
        TextureRenderLog.m256492d("VideoSurfaceTexture", "initExtraSurface begin sf:" + this + ", surface:" + surface + ", mExtraSurfaceMap size:" + this.mExtraSurfaceMap.size());
        if (surface != null && !this.mExtraSurfaceMap.containsKey(surface)) {
            EGLSurface createEGLWindowSurface = createEGLWindowSurface(surface);
            this.mExtraSurfaceMap.put(surface, createEGLWindowSurface);
            TextureRenderLog.m256492d("VideoSurfaceTexture", "initExtraSurface end sf:" + this + ", eglSurface:" + createEGLWindowSurface + ", mExtraSurfaceMap size:" + this.mExtraSurfaceMap.size());
        }
    }

    public boolean makeCurrent(EGLSurface eGLSurface) {
        if (eGLSurface == EGL14.EGL_NO_SURFACE) {
            TextureRenderLog.m256492d("VideoSurfaceTexture", "no surface for make current");
            return false;
        }
        TextureRenderLog.m256492d("VideoSurfaceTexture", this + " make current again");
        GLES20.glFinish();
        if (!EGL14.eglMakeCurrent(this.mEglDisplay, eGLSurface, eGLSurface, this.mEglContext)) {
            notifyError(EGL14.eglGetError());
            TextureRenderLog.m256492d("VideoSurfaceTexture", "make current failed:" + eGLSurface + " error:" + GLUtils.getEGLErrorString(EGL14.eglGetError()));
            return false;
        }
        TextureRenderLog.m256492d("VideoSurfaceTexture", this + "make current done = " + this.mOffScreenSurface);
        return true;
    }

    public void releaseExtraSurface(Surface surface) {
        TextureRenderLog.m256492d("VideoSurfaceTexture", "releaseExtraSurface begin sf:" + this + ", surface:" + surface + ", mExtraSurfaceMap size:" + this.mExtraSurfaceMap.size());
        EGLSurface eGLSurface = this.mExtraSurfaceMap.get(surface);
        if (eGLSurface != null) {
            if (eGLSurface != EGL14.EGL_NO_SURFACE) {
                EGL14.eglDestroySurface(this.mEglDisplay, eGLSurface);
            }
            this.mExtraSurfaceMap.remove(surface);
        }
        TextureRenderLog.m256492d("VideoSurfaceTexture", "releaseExtraSurface end sf:" + this + ", eglSurface:" + eGLSurface + ", mExtraSurfaceMap size:" + this.mExtraSurfaceMap.size());
    }

    public void releaseOffScreenSurface(boolean z) {
        this.mOffScreenSurface = null;
        if (z) {
            this.mUpdateSurface = null;
            if (this.mEglSurface != EGL14.EGL_NO_SURFACE) {
                EGL14.eglDestroySurface(this.mEglDisplay, this.mEglSurface);
                this.mEglSurface = EGL14.EGL_NO_SURFACE;
                this.mIsMakeCurrent = false;
            }
            releaseAllExtraSurface();
        } else {
            updateSurface(null);
            releaseAllExtraSurface_l();
        }
        if ((this.mTexType & 4) > 0) {
            synchronized (this.mSyncMsg) {
                this.mSyncMsg.arg1 = Integer.MIN_VALUE;
                this.mSyncMsg.notify();
                TextureRenderLog.m256492d("VideoSurfaceTexture", "releaseOffScreenSurface mSyncMsg.notify");
            }
        }
        this.mIdleTimeStamp = SystemClock.elapsedRealtime();
        this.mState = 3;
        TextureRenderLog.m256492d("VideoSurfaceTexture", this + "release offscreen surface done = " + this.mIdleTimeStamp);
    }

    public synchronized void setEffect(Bundle bundle) {
        if (bundle != null) {
            TextureRenderLog.m256492d("VideoSurfaceTexture", "setEffect bundle:" + bundle.toString());
            int i = bundle.getInt("action");
            int i2 = bundle.getInt("effect_type");
            if (i != 0) {
                if (i == 19) {
                    this.mConfig.setEffectOpen(i2, bundle.getInt("int_value"));
                }
            } else if (i2 != 1) {
            }
            Handler handler = this.mRenderHandler;
            if (handler != null) {
                Message obtainMessage = handler.obtainMessage(36);
                obtainMessage.obj = this;
                obtainMessage.setData(bundle);
                this.mRenderHandler.sendMessageAtFrontOfQueue(obtainMessage);
            }
        }
    }

    public synchronized void updateSurface(Surface surface) {
        TextureRenderLog.m256492d("VideoSurfaceTexture", "update Surface = " + this + ", " + surface + ", " + this.mUpdateSurface);
        if (surface != this.mUpdateSurface || surface == null || !surface.toString().contains("SurfaceTexture")) {
            this.mLock.lock();
            this.mUpdateSurface = surface;
            this.mLock.unlock();
            Handler handler = this.mRenderHandler;
            if (handler != null) {
                Message obtainMessage = handler.obtainMessage(4);
                this.mRenderMsgBundle.putSerializable("texture", this);
                obtainMessage.setData(this.mRenderMsgBundle);
                if (this.mSyncUpdateSurface != 1) {
                    this.mRenderHandler.sendMessageAtFrontOfQueue(obtainMessage);
                } else {
                    Object obj = new Object();
                    obtainMessage.obj = obj;
                    synchronized (obj) {
                        this.mRenderHandler.sendMessageAtFrontOfQueue(obtainMessage);
                        try {
                            TextureRenderLog.m256492d("VideoSurfaceTexture", "update surface wait");
                            obj.wait(100);
                        } catch (Exception unused) {
                        }
                    }
                }
            }
            TextureRenderLog.m256492d("VideoSurfaceTexture", "update Surface end");
            return;
        }
        TextureRenderLog.m256492d("VideoSurfaceTexture", "prevent the same surface???");
    }

    public boolean supportProcessResolution(int i, int i2) {
        if (this.mIgnoreSRResCheck) {
            return true;
        }
        int i3 = 0;
        while (true) {
            int[] iArr = resWdithTab;
            if (i3 >= iArr.length) {
                TextureRenderLog.m256492d("VideoSurfaceTexture", "sr not support resolution width:" + i + ",height：" + i2);
                return false;
            } else if (iArr[i3] == i && resHeightTab[i3] == i2) {
                return true;
            } else {
                i3++;
            }
        }
    }

    public void updateTexDimension(int i, int i2) {
        TextureRenderLog.m256492d("VideoSurfaceTexture", "update tex dimension : " + i + ", " + i2);
        this.mTexWidth = i;
        this.mTexHeight = i2;
    }

    public int getIntOption(int i, int i2) {
        if (i != 6) {
            if (i == 10) {
                TextureRenderer textureRenderer = this.mTextureRenderer;
                if (textureRenderer == null || !textureRenderer.getEffectConfig().isOpenSR()) {
                    return 0;
                }
                return 1;
            } else if (i == 23) {
                TextureRenderer textureRenderer2 = this.mTextureRenderer;
                if (textureRenderer2 == null || !textureRenderer2.getEffectConfig().getEffectOpen(i2)) {
                    return 0;
                }
                return 1;
            } else if (i != 15) {
                if (i == 16) {
                    return this.mConfig.getEffectOpen(1) ? 1 : 0;
                }
                if (i == 18) {
                    TextureRenderer textureRenderer3 = this.mTextureRenderer;
                    if (textureRenderer3 == null || !textureRenderer3.getEffectConfig().isOpenSharpen()) {
                        return 0;
                    }
                    return 1;
                } else if (i != 19) {
                    return -1;
                }
            }
        }
        if (i == 6) {
            i2 = 5;
        } else if (i == 15) {
            i2 = 1;
        }
        Integer num = this.mUsingEffect.get(Integer.valueOf(i2));
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public boolean handleSurfaceChange(boolean z, EGLSurface eGLSurface) {
        boolean z2;
        this.mLock.lock();
        Surface surface = this.mRenderSurface;
        Surface surface2 = this.mUpdateSurface;
        if (surface != surface2 || surface2 == null || !surface2.toString().contains("SurfaceTexture")) {
            Surface surface3 = this.mRenderSurface;
            Surface surface4 = this.mUpdateSurface;
            if (surface3 != surface4 || surface4 == null) {
                z2 = false;
            } else {
                z2 = true;
            }
            this.mRenderSurface = surface4;
            this.mLock.unlock();
            boolean createEGLWindowSurface = createEGLWindowSurface(z, z2, eGLSurface);
            if (!createEGLWindowSurface) {
                return createEGLWindowSurface;
            }
            this.mSerial++;
            TextureRenderLog.m256492d("VideoSurfaceTexture", this + "update surface done serial = " + this.mSerial + "update time = " + this.mUpdateSurfaceTime);
            if (this.mEglSurface != EGL14.EGL_NO_SURFACE) {
                return true;
            }
            return false;
        }
        TextureRenderLog.m256492d("VideoSurfaceTexture", "surface change the same surface hashcode");
        this.mLock.unlock();
        return false;
    }

    public synchronized void pause(boolean z, boolean z2) {
        if (z2 && !z) {
            if (this.mRenderHandler != null && (this.mIsPaused || this.mIsPreRender)) {
                TextureRenderLog.m256492d("VideoSurfaceTexture", this + "need active , post a resume msg");
                Message obtainMessage = this.mRenderHandler.obtainMessage(10);
                obtainMessage.obj = this;
                this.mIsPreRender = false;
                this.mRenderHandler.sendMessageAtFrontOfQueue(obtainMessage);
            }
        }
        this.mIsPaused = z;
        TextureRenderLog.m256492d("VideoSurfaceTexture", this + "paused = " + this.mIsPaused);
    }

    public synchronized void setExtraSurface(Surface surface, int i) {
        TextureRenderLog.m256492d("VideoSurfaceTexture", "setExtraSurface = " + this + ", " + surface + ", opera:" + i);
        Handler handler = this.mRenderHandler;
        if (handler != null) {
            Message obtainMessage = handler.obtainMessage(25);
            obtainMessage.arg1 = i;
            Bundle bundle = new Bundle();
            bundle.putSerializable("texture", this);
            bundle.putParcelable("surface", surface);
            obtainMessage.setData(bundle);
            this.mRenderHandler.sendMessage(obtainMessage);
        }
        TextureRenderLog.m256492d("VideoSurfaceTexture", "setExtraSurface end");
    }

    public synchronized void setOption(int i, float f) {
        if (i != 4) {
            switch (i) {
                case 11:
                case HwBuildEx.VersionCodes.EMUI_5_1:
                case 13:
                    Handler handler = this.mRenderHandler;
                    if (handler != null) {
                        try {
                            Message obtainMessage = handler.obtainMessage(35);
                            obtainMessage.obj = this;
                            obtainMessage.arg1 = i;
                            Bundle bundle = new Bundle();
                            bundle.putFloat("float_value", f);
                            obtainMessage.setData(bundle);
                            obtainMessage.sendToTarget();
                            break;
                        } catch (Exception unused) {
                            break;
                        }
                    } else {
                        return;
                    }
            }
        } else {
            TextureRenderLog.m256492d("VideoSurfaceTexture", "set TEXTURE_OPTION_SET_OVERLAY_RATIO ratio:" + f);
            Message obtainMessage2 = this.mRenderHandler.obtainMessage(27);
            obtainMessage2.obj = this;
            Bundle bundle2 = new Bundle();
            bundle2.putFloat("overlay_ratio", f);
            obtainMessage2.setData(bundle2);
            obtainMessage2.sendToTarget();
        }
    }

    public Bitmap saveFrame(Bundle bundle, VideoSurface.SaveFrameCallback saveFrameCallback) {
        Handler handler = this.mRenderHandler;
        if (handler == null) {
            return null;
        }
        if (saveFrameCallback != null) {
            synchronized (this.mSaveFrameBundle) {
                if (!this.mSaveFrameBundle.isEmpty()) {
                    this.mSaveFrameBundle.clear();
                }
                this.mSaveFrameBundle.putAll(bundle);
                this.mSaveFrameBundle.putSerializable("callback", saveFrameCallback);
            }
            if (this.mState != 1) {
                sendRenderMsg();
            }
            return null;
        }
        Message obtainMessage = handler.obtainMessage(14);
        this.mRenderMsgBundle.putSerializable("texture", this);
        obtainMessage.setData(this.mRenderMsgBundle);
        Message message = new Message();
        obtainMessage.obj = message;
        try {
            synchronized (message) {
                this.mRenderHandler.sendMessageAtFrontOfQueue(obtainMessage);
                message.wait(500);
            }
            if (message.obj == null && this.mRenderHandler.hasMessages(14)) {
                TextureRenderLog.m256492d("VideoSurfaceTexture", "render thread is busy");
            }
            TextureRenderLog.m256492d("VideoSurfaceTexture", "save frame done = " + message.obj);
            return (Bitmap) message.obj;
        } catch (InterruptedException unused) {
            return null;
        }
    }

    public synchronized void setOption(int i, int i2) {
        if (i != 2) {
            if (i == 3) {
                TextureRenderLog.m256492d("VideoSurfaceTexture", "set TEXTURE_OPTION_SET_OVERLAY_SYNC st:" + this);
                Message obtainMessage = this.mRenderHandler.obtainMessage(31);
                obtainMessage.obj = this;
                obtainMessage.arg1 = i2;
                obtainMessage.sendToTarget();
            } else if (i == 5) {
                this.mTexType = i2;
            } else if (i != 6) {
                if (i != 8) {
                    if (i == 9) {
                        this.mSyncUpdateSurface = i2;
                    } else if (i != 25) {
                        switch (i) {
                            case 15:
                                this.mUsingEffect.put(1, Integer.valueOf(i2));
                                break;
                            case 16:
                                this.mConfig.setEffectOpen(1, i2);
                                break;
                        }
                    } else {
                        for (int i3 = 0; i3 < i2; i3++) {
                            sendRenderMsg();
                        }
                    }
                }
                Handler handler = this.mRenderHandler;
                if (handler != null) {
                    try {
                        Message obtainMessage2 = handler.obtainMessage(34);
                        obtainMessage2.obj = this;
                        obtainMessage2.arg1 = i;
                        obtainMessage2.arg2 = i2;
                        obtainMessage2.sendToTarget();
                    } catch (Exception unused) {
                    }
                }
            } else {
                this.mUsingEffect.put(5, Integer.valueOf(i2));
            }
        } else if (i2 == 1) {
            Handler handler2 = this.mRenderHandler;
            if (handler2 != null) {
                Message obtainMessage3 = handler2.obtainMessage(33);
                obtainMessage3.obj = this;
                this.mRenderHandler.sendMessageAtFrontOfQueue(obtainMessage3);
            }
        }
    }

    public void bindEGLEnv(EGLContext eGLContext, EGLDisplay eGLDisplay, EGLConfig eGLConfig) {
        if (eGLContext == null || eGLDisplay == null || eGLConfig == null) {
            throw new RuntimeException("no egl env for texture bind");
        }
        this.mEglContext = eGLContext;
        this.mEglDisplay = eGLDisplay;
        this.mEglConfig = eGLConfig;
    }

    public void setOption(int i, int i2, int i3) {
        if (i == 19 && i2 >= 0) {
            this.mUsingEffect.put(Integer.valueOf(i2), Integer.valueOf(i3));
        }
    }

    public VideoSurfaceTexture(ITexture iTexture, Handler handler, TextureRenderer textureRenderer) {
        super(iTexture.lock());
        iTexture.addRef();
        this.mTextureId = iTexture;
        iTexture.unlock();
        internalConstruct(handler);
        this.mExtraSurfaceMap = new HashMap<>();
        this.mTextureRenderer = textureRenderer;
    }

    public boolean createEGLWindowSurface(boolean z, boolean z2, EGLSurface eGLSurface) {
        if (this.mEglSurface != EGL14.EGL_NO_SURFACE) {
            TextureRenderLog.m256492d("VideoSurfaceTexture", "destory previous surface = " + this.mEglSurface);
            if ((this.mRenderSurface == null && z) || z2) {
                TextureRenderLog.m256492d("VideoSurfaceTexture", "make current to dummy surface due to non render surface, force:" + z2);
                EGL14.eglMakeCurrent(this.mEglDisplay, eGLSurface, eGLSurface, this.mEglContext);
            }
            EGL14.eglDestroySurface(this.mEglDisplay, this.mEglSurface);
            this.mEglSurface = EGL14.EGL_NO_SURFACE;
            this.mIsMakeCurrent = false;
            TextureRenderLog.m256492d("VideoSurfaceTexture", "destory previous surface done = " + this.mEglSurface);
        }
        EGLSurface createEGLWindowSurface = createEGLWindowSurface(this.mRenderSurface);
        this.mEglSurface = createEGLWindowSurface;
        if (createEGLWindowSurface == EGL14.EGL_NO_SURFACE) {
            return false;
        }
        try {
            makeCurrent();
            this.mUpdateSurfaceTime = System.nanoTime();
            return true;
        } catch (Exception unused) {
            TextureRenderLog.m256492d("VideoSurfaceTexture", "makeCurrent exception failed");
            return false;
        }
    }

    public void frameMetaCallback(long j, long j2, Map<Integer, String> map) {
        String str;
        TextureRenderLog.m256492d("VideoSurfaceTexture", "frameMetaCallback this:" + this + " pts:" + j + " mRenderHandler:" + this.mRenderHandler);
        Handler handler = this.mRenderHandler;
        if (handler != null && (this.mTexType & 4) != 0) {
            if (this.mOffScreenSurface == null) {
                TextureRenderLog.m256492d("VideoSurfaceTexture", "mOffScreenSurface null,return this:" + this);
                return;
            }
            try {
                Message obtainMessage = handler.obtainMessage(32);
                Bundle bundle = new Bundle();
                bundle.putSerializable("update_frame_time", new FrameTimeQueue.FrameTime(j, j2));
                if (map != null) {
                    str = map.get(46);
                } else {
                    str = null;
                }
                bundle.putString("master_clock", str);
                bundle.putLong("master_clock_diff", SystemClock.elapsedRealtime());
                bundle.putSerializable("texture", this);
                obtainMessage.setData(bundle);
                obtainMessage.obj = this.mSyncMsg;
                synchronized (this.mSyncMsg) {
                    obtainMessage.sendToTarget();
                    try {
                        this.mSyncMsg.wait();
                        if (!(this.mSyncMsg.arg1 == Integer.MIN_VALUE || ((long) this.mSyncMsg.arg1) == j)) {
                            this.mSyncMsg.wait();
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public VideoSurfaceTexture(ITexture iTexture, boolean z, Handler handler, TextureRenderer textureRenderer) {
        super(iTexture.lock(), z);
        iTexture.addRef();
        this.mTextureId = iTexture;
        iTexture.unlock();
        internalConstruct(handler);
        this.mExtraSurfaceMap = new HashMap<>();
        this.mTextureRenderer = textureRenderer;
    }

    public synchronized void setSuperResolutionConfig(int i, String str, String str2, String str3, int i2, int i3, String str4) {
        Handler handler = this.mRenderHandler;
        if (handler != null) {
            Message obtainMessage = handler.obtainMessage(12);
            obtainMessage.obj = this;
            Bundle bundle = new Bundle();
            bundle.putInt("effect_type", 5);
            bundle.putInt("action", 21);
            bundle.putInt("srAlgType", i);
            bundle.putInt("srMaxSizeWidth", i2);
            bundle.putInt("srMaxSizeHeight", i3);
            bundle.putString("kernelBinPath", str);
            bundle.putString("oclModleName", str2);
            bundle.putString("dspModleName", str3);
            bundle.putString("moduleName", str4);
            obtainMessage.setData(bundle);
            this.mRenderHandler.sendMessageAtFrontOfQueue(obtainMessage);
        }
    }
}
