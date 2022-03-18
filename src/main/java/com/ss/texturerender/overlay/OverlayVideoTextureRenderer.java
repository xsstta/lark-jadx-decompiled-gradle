package com.ss.texturerender.overlay;

import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.os.Bundle;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Surface;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.ss.texturerender.ITexture;
import com.ss.texturerender.TexGLUtils;
import com.ss.texturerender.TextureRenderLog;
import com.ss.texturerender.TextureRenderManager;
import com.ss.texturerender.TextureRenderer;
import com.ss.texturerender.VideoSurfaceTexture;
import com.ss.texturerender.VsyncHelper;
import com.ss.texturerender.effect.EffectConfig;
import com.ss.texturerender.effect.FrameBuffer;
import com.ss.texturerender.effect.GLDefaultFilter;
import com.ss.texturerender.effect.GLOesTo2DFilter;
import com.ss.texturerender.overlay.FrameTimeQueue;
import com.ss.ttvideoengine.TTVideoEngine;
import com.ss.ttvideoengine.log.IVideoEventLogger;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Vector;

public class OverlayVideoTextureRenderer extends TextureRenderer {
    private static int ALL_VIDEO_STREAM_NUM = 2;
    private static int DROP_NUM_THRESHOLD = 3;
    private static int DROP_THRESHOLD_MS = 500;
    private int mAvailCount;
    private NormalClock mClock = new NormalClock();
    private Surface mCurrentSurface;
    private GLDefaultFilter mDefaultDrawer;
    private EGLSurface mEglSurface = EGL14.EGL_NO_SURFACE;
    private FrameBuffer mFBO;
    private int mFBOTexH;
    private int mFBOTexW;
    private boolean mIsMakeCurrent;
    private boolean mIsOverlayRatioChanged;
    private boolean mIsVsyncWorking;
    private FrameTimeQueue mMainFrameTimeQueue = new FrameTimeQueue();
    private VideoSurfaceTexture mMainSurfaceTexture;
    private ITexture mMainTex;
    private float[] mMainTexVerticesData;
    private int mMainVideoFastDropNum;
    private boolean mNeedSync;
    private GLOesTo2DFilter mOESDrawer;
    private float mOverlayRatio = 0.5f;
    private Vector<SurfaceTextureStatus> mReadySurfaceTextureVector = new Vector<>(2);
    private FrameTimeQueue mSubFrameTimeQueue = new FrameTimeQueue();
    private ITexture mSubTex;
    private float[] mSubTexVerticesData;
    private int mSubVideoFastDropNum;
    private HashMap<VideoSurfaceTexture, Message> mTextureNotifyMap = new HashMap<>();
    private long mTid;
    private long mUpdateSurfaceTime;
    private VsyncHelper.VsyncCallback mVsyncCallback;
    private VsyncHelper mVsyncHelper = new VsyncHelper(TextureRenderManager.getManager().getContext());

    /* access modifiers changed from: protected */
    @Override // com.ss.texturerender.TextureRenderer
    public void deinitEffectComponents() {
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.texturerender.TextureRenderer
    public void onInternalStateChanged(int i) {
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.texturerender.TextureRenderer
    public void updateDisplaySize(int i, int i2) {
    }

    public long getSurfaceUpdateTime() {
        return this.mUpdateSurfaceTime;
    }

    public long getMasterTimeStamp() {
        return this.mClock.getClock();
    }

    public int getConsumerHeight() {
        if (this.mEglSurface == EGL14.EGL_NO_SURFACE) {
            return -1;
        }
        int[] iArr = new int[1];
        EGL14.eglQuerySurface(this.mEglDisplay, this.mEglSurface, 12374, iArr, 0);
        return iArr[0];
    }

    public int getConsumerWidth() {
        if (this.mEglSurface == EGL14.EGL_NO_SURFACE) {
            return -1;
        }
        int[] iArr = new int[1];
        EGL14.eglQuerySurface(this.mEglDisplay, this.mEglSurface, 12375, iArr, 0);
        return iArr[0];
    }

    @Override // com.ss.texturerender.TextureRenderer
    public synchronized void release() {
        super.release();
        _dropAllFrames();
        this.mAvailCount = 0;
        this.mClock.stop();
    }

    private void _dropAllFrames() {
        Iterator<SurfaceTextureStatus> it = this.mReadySurfaceTextureVector.iterator();
        while (it.hasNext()) {
            SurfaceTextureStatus next = it.next();
            TextureRenderLog.m256492d("OverlayVideoTextureRenderer", "_dropAllFrames isMain:" + isMainSurface(next.surfaceTexture));
            _updateTexImage(next.surfaceTexture);
            notify(next.surfaceTexture);
            it.remove();
        }
    }

    private int _render() {
        if (this.mEglSurface == EGL14.EGL_NO_SURFACE) {
            TextureRenderLog.m256492d("OverlayVideoTextureRenderer", "no surface to render");
            return -1;
        } else if (EGL14.eglSwapBuffers(this.mEglDisplay, this.mEglSurface)) {
            return 0;
        } else {
            TextureRenderLog.m256492d("OverlayVideoTextureRenderer", this + "swap buffer failed");
            return -1;
        }
    }

    private void handleVsyncDraw() {
        _avSyncByVsync();
        if (_draw()) {
            _render();
        }
        TextureRenderLog.m256492d("OverlayVideoTextureRenderer", "handleVsyncDraw end, ReadyVector size:" + this.mReadySurfaceTextureVector.size());
        if (this.mReadySurfaceTextureVector.isEmpty()) {
            this.mVsyncHelper.removeObserver(this.mVsyncCallback);
            this.mIsVsyncWorking = false;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.texturerender.TextureRenderer
    public void deinitGLComponents() {
        GLOesTo2DFilter gLOesTo2DFilter = this.mOESDrawer;
        if (gLOesTo2DFilter != null) {
            gLOesTo2DFilter.release();
            this.mOESDrawer = null;
        }
        GLDefaultFilter gLDefaultFilter = this.mDefaultDrawer;
        if (gLDefaultFilter != null) {
            gLDefaultFilter.release();
            this.mDefaultDrawer = null;
        }
        FrameBuffer frameBuffer = this.mFBO;
        if (frameBuffer != null) {
            frameBuffer.release();
            this.mFBO = null;
        }
        ITexture iTexture = this.mMainTex;
        if (iTexture != null) {
            iTexture.decRef();
            this.mMainTex = null;
        }
        ITexture iTexture2 = this.mSubTex;
        if (iTexture2 != null) {
            iTexture2.decRef();
            this.mSubTex = null;
        }
    }

    private boolean _makeCurrent() {
        if (this.mEglSurface == EGL14.EGL_NO_SURFACE) {
            TextureRenderLog.m256492d("OverlayVideoTextureRenderer", "no surface for make current");
            return false;
        }
        TextureRenderLog.m256492d("OverlayVideoTextureRenderer", this + " make current again");
        GLES20.glFinish();
        EGLDisplay eGLDisplay = this.mEglDisplay;
        EGLSurface eGLSurface = this.mEglSurface;
        if (!EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.mEglContext)) {
            TextureRenderLog.m256492d("OverlayVideoTextureRenderer", "make current failed = " + this.mEglSurface);
            return false;
        }
        TextureRenderLog.m256492d("OverlayVideoTextureRenderer", this + "make current done");
        this.mIsMakeCurrent = true;
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.texturerender.TextureRenderer
    public void initGLComponents() {
        if (this.mState != -1) {
            try {
                GLOesTo2DFilter gLOesTo2DFilter = this.mOESDrawer;
                if (gLOesTo2DFilter != null) {
                    gLOesTo2DFilter.release();
                }
                GLOesTo2DFilter gLOesTo2DFilter2 = new GLOesTo2DFilter();
                this.mOESDrawer = gLOesTo2DFilter2;
                gLOesTo2DFilter2.init(null);
                GLDefaultFilter gLDefaultFilter = this.mDefaultDrawer;
                if (gLDefaultFilter != null) {
                    gLDefaultFilter.release();
                }
                GLDefaultFilter gLDefaultFilter2 = new GLDefaultFilter();
                this.mDefaultDrawer = gLDefaultFilter2;
                gLDefaultFilter2.init(null);
                this.mVsyncCallback = new VsyncHelper.VsyncCallback(this.mHandler);
            } catch (Exception e) {
                notifyEGLError(0, e.toString());
            }
            TextureRenderLog.m256492d("OverlayVideoTextureRenderer", "initGLComponents done render:" + this);
        }
    }

    private void _avSyncByVsync() {
        int i;
        long masterTimeStamp = getMasterTimeStamp();
        Iterator<SurfaceTextureStatus> it = this.mReadySurfaceTextureVector.iterator();
        while (it.hasNext()) {
            SurfaceTextureStatus next = it.next();
            long j = next.frameTime.pts - masterTimeStamp;
            if (j > ((long) DROP_THRESHOLD_MS)) {
                if (isMainSurface(next.surfaceTexture)) {
                    i = this.mMainVideoFastDropNum + 1;
                    this.mMainVideoFastDropNum = i;
                } else {
                    i = this.mSubVideoFastDropNum + 1;
                    this.mSubVideoFastDropNum = i;
                }
                if (i <= DROP_NUM_THRESHOLD) {
                    next.status = SurfaceTextureStatus.NEED_DROP;
                } else {
                    next.status = SurfaceTextureStatus.NEED_NOT_DRAW;
                }
            } else {
                long j2 = 1000000 * j;
                if (j2 < this.mVsyncHelper.getVsyncDurationNs() * -2) {
                    next.status = SurfaceTextureStatus.NEED_DROP;
                } else if (j2 > this.mVsyncHelper.getVsyncDurationNs()) {
                    next.status = SurfaceTextureStatus.NEED_NOT_DRAW;
                } else {
                    next.status = SurfaceTextureStatus.NEED_DRAW;
                }
            }
            TextureRenderLog.m256492d("OverlayVideoTextureRenderer", "_avSyncByVsync pts:" + next.frameTime.pts + " master:" + masterTimeStamp + " diff:" + j + " isMainSurface:" + isMainSurface(next.surfaceTexture) + " status:" + next.status);
        }
    }

    private void _initFBOComponents() {
        if (this.mFBO == null) {
            this.mFBO = new FrameBuffer();
        }
        if (this.mSubTex == null) {
            this.mSubTex = this.mTextureFactory.createTexture(3553);
        }
        if (this.mMainTex == null) {
            this.mMainTex = this.mTextureFactory.createTexture(3553);
        }
        int consumerWidth = getConsumerWidth();
        int consumerHeight = getConsumerHeight();
        if (consumerWidth > 0 && consumerHeight > 0) {
            if (this.mFBOTexW != consumerWidth || this.mFBOTexH != consumerHeight) {
                TextureRenderLog.m256492d("OverlayVideoTextureRenderer", "_initFBOComponents surface H:" + consumerHeight + " W:" + consumerWidth + " mFBOTexH:" + this.mFBOTexH + " mFBOTexW:" + this.mFBOTexW);
                GLES20.glBindTexture(3553, this.mSubTex.lock());
                GLES20.glTexImage2D(3553, 0, 6408, consumerWidth, consumerHeight, 0, 6408, 5121, null);
                this.mSubTex.unlock();
                TexGLUtils.checkGLError("createTexture sub");
                GLES20.glBindTexture(3553, this.mMainTex.lock());
                GLES20.glTexImage2D(3553, 0, 6408, consumerWidth, consumerHeight, 0, 6408, 5121, null);
                this.mMainTex.unlock();
                TexGLUtils.checkGLError("createTexture main");
                this.mFBOTexH = consumerHeight;
                this.mFBOTexW = consumerWidth;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean _draw() {
        /*
        // Method dump skipped, instructions count: 507
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.texturerender.overlay.OverlayVideoTextureRenderer._draw():boolean");
    }

    public void handleVsyncComing(Message message) {
        handleVsyncDraw();
    }

    private boolean isMainSurface(VideoSurfaceTexture videoSurfaceTexture) {
        if (videoSurfaceTexture == this.mMainSurfaceTexture) {
            return true;
        }
        return false;
    }

    public void updateMaster(long j) {
        this.mClock.updateClock(j);
    }

    private void _updateTexImage(VideoSurfaceTexture videoSurfaceTexture) {
        try {
            videoSurfaceTexture.lock();
            if (videoSurfaceTexture.isRelease()) {
                videoSurfaceTexture.unlock();
                return;
            }
            videoSurfaceTexture.updateTexImage();
            videoSurfaceTexture.unlock();
        } catch (Exception e) {
            e.printStackTrace();
        } catch (Throwable th) {
            videoSurfaceTexture.unlock();
            throw th;
        }
    }

    private boolean needNotify(VideoSurfaceTexture videoSurfaceTexture) {
        Iterator<SurfaceTextureStatus> it = this.mReadySurfaceTextureVector.iterator();
        while (it.hasNext()) {
            if (it.next().surfaceTexture == videoSurfaceTexture) {
                return false;
            }
        }
        if (isMainSurface(videoSurfaceTexture)) {
            if (this.mMainFrameTimeQueue.getSize() > 0) {
                return false;
            }
            return true;
        } else if (this.mSubFrameTimeQueue.getSize() > 0) {
            return false;
        } else {
            return true;
        }
    }

    public void handleSetOverlayRatio(Message message) {
        float f = message.getData().getFloat("overlay_ratio");
        TextureRenderLog.m256492d("OverlayVideoTextureRenderer", "SetOverlayRatio ratio:" + f);
        if (f != this.mOverlayRatio) {
            this.mOverlayRatio = f;
            this.mIsOverlayRatioChanged = true;
            if (!this.mIsVsyncWorking) {
                this.mVsyncHelper.addObserver(this.mVsyncCallback);
                this.mIsVsyncWorking = true;
            }
        }
    }

    private void notify(VideoSurfaceTexture videoSurfaceTexture) {
        Message message = this.mTextureNotifyMap.get(videoSurfaceTexture);
        if (message != null) {
            synchronized (message) {
                TextureRenderLog.m256492d("OverlayVideoTextureRenderer", "notify st:" + videoSurfaceTexture + " MainQueue:" + this.mMainFrameTimeQueue.toString() + " SubQueue:" + this.mSubFrameTimeQueue.toString());
                message.arg1 = Integer.MIN_VALUE;
                message.notify();
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.texturerender.TextureRenderer
    public void handleFrameAvailable(Message message) {
        FrameTimeQueue.FrameTime frameTime;
        long j;
        VideoSurfaceTexture videoSurfaceTexture = (VideoSurfaceTexture) message.obj;
        if (isMainSurface(videoSurfaceTexture)) {
            frameTime = this.mMainFrameTimeQueue.poll(videoSurfaceTexture.getTimestamp());
        } else {
            frameTime = this.mSubFrameTimeQueue.poll(videoSurfaceTexture.getTimestamp());
        }
        long j2 = -1;
        if (frameTime != null) {
            j = frameTime.pts - getMasterTimeStamp();
        } else {
            j = -1;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("handleFrameAvailable,st = ");
        sb.append(videoSurfaceTexture);
        sb.append(" isMainSurface:");
        sb.append(isMainSurface(videoSurfaceTexture));
        sb.append(" pts:");
        if (frameTime != null) {
            j2 = frameTime.pts;
        }
        sb.append(j2);
        sb.append(" master:");
        sb.append(getMasterTimeStamp());
        sb.append(" diff:");
        sb.append(j);
        TextureRenderLog.m256492d("OverlayVideoTextureRenderer", sb.toString());
        if (j < 0) {
            _updateTexImage(videoSurfaceTexture);
            notify(videoSurfaceTexture);
            return;
        }
        if (!this.mIsVsyncWorking) {
            this.mVsyncHelper.addObserver(this.mVsyncCallback);
            this.mIsVsyncWorking = true;
        }
        this.mReadySurfaceTextureVector.add(new SurfaceTextureStatus(videoSurfaceTexture, frameTime));
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.texturerender.TextureRenderer
    public void handleGLThreadMessage(Message message) {
        boolean z = true;
        switch (message.what) {
            case 26:
                if (isMainSurface((VideoSurfaceTexture) message.obj)) {
                    int i = message.arg1;
                    if (i == 1) {
                        this.mClock.start();
                        return;
                    } else if (i == 3) {
                        TextureRenderLog.m256492d("OverlayVideoTextureRenderer", "TEXTURE_STATE_STOP");
                        this.mMainFrameTimeQueue.clear();
                        this.mSubFrameTimeQueue.clear();
                        this.mClock.stop();
                        return;
                    } else if (i == 4) {
                        this.mClock.pause();
                        return;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP:
                handleSetOverlayRatio(message);
                return;
            case IVideoEventLogger.LOGGER_OPTION_ENABLE_SR /*{ENCODED_INT: 28}*/:
                handleVsyncComing(message);
                return;
            case 29:
            case 30:
            default:
                return;
            case TTVideoEngine.PLAYER_OPTION_ENABLE_PLAYER3_HARDWARE_DECODE /*{ENCODED_INT: 31}*/:
                if (message.arg1 != 1) {
                    z = false;
                }
                this.mNeedSync = z;
                TextureRenderLog.m256492d("OverlayVideoTextureRenderer", "MSG_SET_OVERLAY_SYNC mNeedSync:" + this.mNeedSync);
                return;
            case 32:
                Bundle data = message.getData();
                VideoSurfaceTexture videoSurfaceTexture = (VideoSurfaceTexture) data.getSerializable("texture");
                FrameTimeQueue.FrameTime frameTime = (FrameTimeQueue.FrameTime) data.getSerializable("update_frame_time");
                if (isMainSurface(videoSurfaceTexture)) {
                    String string = data.getString("master_clock");
                    if (!TextUtils.isEmpty(string)) {
                        updateMaster(Long.parseLong(string.trim()) + (SystemClock.elapsedRealtime() - data.getLong("master_clock_diff")));
                    }
                }
                boolean needNotify = needNotify(videoSurfaceTexture);
                if (needNotify) {
                    Message message2 = (Message) message.obj;
                    synchronized (message2) {
                        message2.arg1 = (int) frameTime.pts;
                        message.obj.notify();
                    }
                }
                this.mTextureNotifyMap.put(videoSurfaceTexture, (Message) message.obj);
                if (isMainSurface(videoSurfaceTexture)) {
                    this.mMainFrameTimeQueue.add(frameTime);
                } else {
                    this.mSubFrameTimeQueue.add(frameTime);
                }
                TextureRenderLog.m256492d("OverlayVideoTextureRenderer", "MSG_UPDATE_FRAME_TIME needNotify:" + needNotify + " MainQueue:" + this.mMainFrameTimeQueue.getSize() + " SubQueue:" + this.mSubFrameTimeQueue.getSize());
                return;
            case 33:
                this.mMainSurfaceTexture = (VideoSurfaceTexture) message.obj;
                TextureRenderLog.m256492d("OverlayVideoTextureRenderer", "MSG_SET_MAIN_SURFACE st:" + this.mMainSurfaceTexture);
                return;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.texturerender.TextureRenderer
    public void handleSetSurface(Message message) {
        Bundle data = message.getData();
        if (data != null) {
            VideoSurfaceTexture videoSurfaceTexture = (VideoSurfaceTexture) data.getSerializable("texture");
            if (videoSurfaceTexture != null) {
                Surface updateSurface = videoSurfaceTexture.getUpdateSurface();
                Surface surface = this.mCurrentSurface;
                if (surface == null || surface != updateSurface || updateSurface == null || !updateSurface.toString().contains("SurfaceTexture")) {
                    if (updateSurface == null) {
                        _dropAllFrames();
                        if (this.mCurrentSurface == null) {
                            TextureRenderLog.m256492d("OverlayVideoTextureRenderer", "reset null surface, return");
                            return;
                        }
                    }
                    if (this.mEglSurface != EGL14.EGL_NO_SURFACE) {
                        TextureRenderLog.m256492d("OverlayVideoTextureRenderer", "destory previous surface = " + this.mEglSurface);
                        if (updateSurface == null) {
                            TextureRenderLog.m256492d("OverlayVideoTextureRenderer", "make current to dummy surface due to non render surface");
                            EGL14.eglMakeCurrent(this.mEglDisplay, this.mEglDummySurface, this.mEglDummySurface, this.mEglContext);
                        }
                        boolean eglDestroySurface = EGL14.eglDestroySurface(this.mEglDisplay, this.mEglSurface);
                        this.mEglSurface = EGL14.EGL_NO_SURFACE;
                        this.mIsMakeCurrent = false;
                        TextureRenderLog.m256492d("OverlayVideoTextureRenderer", "destory previous surface done = " + this.mEglSurface + " ret:" + eglDestroySurface);
                    }
                    if (updateSurface != null && updateSurface.isValid()) {
                        int[] iArr = {12344};
                        try {
                            TextureRenderLog.m256492d("OverlayVideoTextureRenderer", this + ",create window surface from " + updateSurface);
                            EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface(this.mEglDisplay, this.mEglConfig, updateSurface, iArr, 0);
                            this.mEglSurface = eglCreateWindowSurface;
                            if (eglCreateWindowSurface == EGL14.EGL_NO_SURFACE) {
                                TextureRenderLog.m256492d("OverlayVideoTextureRenderer", "create window surface failed" + GLUtils.getEGLErrorString(EGL14.eglGetError()));
                                return;
                            }
                            _makeCurrent();
                            int length = GLDefaultFilter.mTextureVerticesData.length;
                            this.mMainTexVerticesData = new float[length];
                            System.arraycopy(GLDefaultFilter.mTextureVerticesData, 0, this.mMainTexVerticesData, 0, length);
                            this.mSubTexVerticesData = new float[length];
                            System.arraycopy(GLDefaultFilter.mTextureVerticesData, 0, this.mSubTexVerticesData, 0, length);
                        } catch (Exception unused) {
                            TextureRenderLog.m256492d("OverlayVideoTextureRenderer", "create current exception failed");
                            return;
                        }
                    }
                    this.mUpdateSurfaceTime = System.nanoTime();
                    this.mCurrentSurface = updateSurface;
                    Object obj = message.obj;
                    if (obj != null) {
                        synchronized (obj) {
                            obj.notify();
                        }
                    }
                    TextureRenderLog.m256492d("OverlayVideoTextureRenderer", "set surface done, mEglSurface=" + this.mEglSurface + " render:" + this);
                    return;
                }
                TextureRenderLog.m256492d("OverlayVideoTextureRenderer", "set same surface, return");
                return;
            }
            throw new RuntimeException("OverlayVideoTextureRenderer update surface but missing texture");
        }
        throw new RuntimeException("OverlayVideoTextureRenderer update surface but missing bundle?");
    }

    /* access modifiers changed from: private */
    public static class SurfaceTextureStatus {
        public static int NEED_DRAW = 1;
        public static int NEED_DROP = 3;
        public static int NEED_NOT_DRAW = 2;
        public FrameTimeQueue.FrameTime frameTime;
        public int status = NEED_DRAW;
        public VideoSurfaceTexture surfaceTexture;

        public SurfaceTextureStatus(VideoSurfaceTexture videoSurfaceTexture, FrameTimeQueue.FrameTime frameTime2) {
            this.surfaceTexture = videoSurfaceTexture;
            this.frameTime = frameTime2;
        }
    }

    public OverlayVideoTextureRenderer(EffectConfig effectConfig, int i) {
        super(effectConfig, i);
        TextureRenderLog.m256492d("OverlayVideoTextureRenderer", "OverlayVideoTextureRenderer");
    }
}
