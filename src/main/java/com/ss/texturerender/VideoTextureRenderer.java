package com.ss.texturerender;

import android.opengl.EGL14;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Bundle;
import android.os.Message;
import android.view.Surface;
import com.huawei.hms.android.HwBuildEx;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.texturerender.VideoSurface;
import com.ss.texturerender.effect.AbsEffect;
import com.ss.texturerender.effect.EffectConfig;
import com.ss.texturerender.effect.EffectTexture;
import com.ss.texturerender.effect.EffectTextureManager;
import com.ss.texturerender.effect.EmptyEffect;
import com.ss.texturerender.effect.FrameBuffer;
import com.ss.texturerender.effect.GLDefaultFilter;
import com.ss.texturerender.effect.GLOesTo2DFilter;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class VideoTextureRenderer extends TextureRenderer {
    private static VideoTextureRenderer mRenderInstance;
    private Queue<Integer> mErrorList = new LinkedList();
    private FrameBuffer mFrameBuffer;
    private ByteBuffer mSaveFrameBuffer = null;
    private GLDefaultFilter mTex2dDrawer;
    private GLOesTo2DFilter mTexOesDrawer;
    private AbsEffect mTopEffect = new EmptyEffect();

    /* access modifiers changed from: protected */
    @Override // com.ss.texturerender.TextureRenderer
    public void onInternalStateChanged(int i) {
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.texturerender.TextureRenderer
    public void updateDisplaySize(int i, int i2) {
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.texturerender.TextureRenderer
    public void deinitEffectComponents() {
        for (AbsEffect release = this.mTopEffect.release(); release != null; release = release.release()) {
        }
    }

    @Override // com.ss.texturerender.TextureRenderer
    public synchronized void release() {
        super.release();
        mRenderInstance = null;
    }

    private void setup2DGraphics() {
        try {
            GLDefaultFilter gLDefaultFilter = this.mTex2dDrawer;
            if (gLDefaultFilter != null) {
                gLDefaultFilter.release();
            }
            GLDefaultFilter gLDefaultFilter2 = new GLDefaultFilter();
            this.mTex2dDrawer = gLDefaultFilter2;
            gLDefaultFilter2.init(null);
        } catch (Exception e) {
            notifyEGLError(0, e.toString());
        }
    }

    private void setupGraphics() {
        try {
            GLOesTo2DFilter gLOesTo2DFilter = this.mTexOesDrawer;
            if (gLOesTo2DFilter != null) {
                gLOesTo2DFilter.release();
            }
            GLOesTo2DFilter gLOesTo2DFilter2 = new GLOesTo2DFilter();
            this.mTexOesDrawer = gLOesTo2DFilter2;
            gLOesTo2DFilter2.init(null);
        } catch (Exception e) {
            notifyEGLError(0, e.toString());
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.texturerender.TextureRenderer
    public void initGLComponents() {
        if (this.mState != -1) {
            setupGraphics();
            if (this.mEffectConfig.isOpenSR()) {
                setup2DGraphics();
            }
        }
    }

    public static synchronized VideoTextureRenderer getRenderer() {
        synchronized (VideoTextureRenderer.class) {
            if (mRenderInstance == null) {
                mRenderInstance = new VideoTextureRenderer(new EffectConfig(), 0);
            }
            VideoTextureRenderer videoTextureRenderer = mRenderInstance;
            if (videoTextureRenderer != null && videoTextureRenderer.mState == -1) {
                return null;
            }
            return mRenderInstance;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.texturerender.TextureRenderer
    public void deinitGLComponents() {
        TextureRenderLog.m256492d(LOG_TAG, "delete program");
        GLOesTo2DFilter gLOesTo2DFilter = this.mTexOesDrawer;
        if (gLOesTo2DFilter != null) {
            gLOesTo2DFilter.release();
            this.mTexOesDrawer = null;
        }
        GLDefaultFilter gLDefaultFilter = this.mTex2dDrawer;
        if (gLDefaultFilter != null) {
            gLDefaultFilter.release();
            this.mTex2dDrawer = null;
        }
        FrameBuffer frameBuffer = this.mFrameBuffer;
        if (frameBuffer != null) {
            frameBuffer.release();
            this.mFrameBuffer = null;
        }
        if (this.mEffectTextureManager != null) {
            this.mEffectTextureManager.release();
            this.mEffectTextureManager = null;
        }
    }

    /* access modifiers changed from: package-private */
    public int genQuadArrayBuffer() {
        int[] iArr = new int[1];
        GLES20.glGenBuffers(1, iArr, 0);
        if (iArr[0] == 0) {
            TextureRenderLog.m256492d(LOG_TAG, "glGenBuffers bufferID: 0");
            return 0;
        }
        String str = LOG_TAG;
        TextureRenderLog.m256492d(str, "gen buffer id : " + iArr[0]);
        GLES20.glBindBuffer(34962, iArr[0]);
        GLES20.glBufferData(34962, this.sVertexData.length, this.mTriangleVertexBuffer, 35044);
        return iArr[0];
    }

    private int getConsumerHeight(EGLSurface eGLSurface) {
        if (eGLSurface == EGL14.EGL_NO_SURFACE) {
            return -1;
        }
        int[] iArr = new int[1];
        EGL14.eglQuerySurface(this.mEglDisplay, eGLSurface, 12374, iArr, 0);
        return iArr[0];
    }

    private int getConsumerWidth(EGLSurface eGLSurface) {
        if (eGLSurface == EGL14.EGL_NO_SURFACE) {
            return -1;
        }
        int[] iArr = new int[1];
        EGL14.eglQuerySurface(this.mEglDisplay, eGLSurface, 12375, iArr, 0);
        return iArr[0];
    }

    private AbsEffect getEffect(int i) {
        for (AbsEffect nextEffect = this.mTopEffect.getNextEffect(); nextEffect != null; nextEffect = nextEffect.getNextEffect()) {
            if (nextEffect.getIntOption(10005) == i) {
                return nextEffect;
            }
        }
        return null;
    }

    private void initFbo(VideoSurfaceTexture videoSurfaceTexture) {
        if (this.mFrameBuffer == null) {
            this.mFrameBuffer = new FrameBuffer();
        }
        if (this.mEffectTextureManager == null) {
            this.mEffectTextureManager = new EffectTextureManager();
        }
        videoSurfaceTexture.updateTextureForFbo();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.texturerender.TextureRenderer
    public void handleFrameAvailable(Message message) {
        VideoSurfaceTexture videoSurfaceTexture = (VideoSurfaceTexture) message.obj;
        if (draw(videoSurfaceTexture)) {
            saveImage(message);
            videoSurfaceTexture.render();
        }
    }

    private void setEffect(Message message) {
        Bundle data = message.getData();
        if (data == null) {
            TextureRenderLog.m256492d(LOG_TAG, "set effect but missing bundle?");
            return;
        }
        int i = data.getInt("action");
        if (i == 20) {
            AbsEffect effect = getEffect(data.getInt("effect_type"));
            if (effect != null) {
                effect.setOption(i, data.getFloat("float_value"));
            }
        } else if (i == 21) {
            initEffect(data, (VideoSurfaceTexture) message.obj);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.texturerender.TextureRenderer
    public void handleGLThreadMessage(Message message) {
        int i = message.what;
        if (i != 12) {
            if (i == 25) {
                Bundle data = message.getData();
                Surface surface = (Surface) data.getParcelable("surface");
                VideoSurfaceTexture videoSurfaceTexture = (VideoSurfaceTexture) data.getSerializable("texture");
                if (message.arg1 == 1) {
                    videoSurfaceTexture.initExtraSurface(surface);
                    return;
                } else if (message.arg1 == 2) {
                    videoSurfaceTexture.releaseExtraSurface(surface);
                    return;
                } else if (message.arg1 == 3) {
                    videoSurfaceTexture.releaseAllExtraSurface();
                    return;
                } else {
                    return;
                }
            } else if (i != 26) {
                switch (i) {
                    case 34:
                        _setValueToElement(message.arg1, message.arg2);
                        return;
                    case 35:
                        Bundle data2 = message.getData();
                        if (data2 != null) {
                            _setValueToElement(message.arg1, data2.getFloat("float_value"));
                            return;
                        }
                        return;
                    case 36:
                        break;
                    default:
                        return;
                }
            } else {
                VideoSurfaceTexture videoSurfaceTexture2 = (VideoSurfaceTexture) message.obj;
                if (videoSurfaceTexture2 != null) {
                    videoSurfaceTexture2.handleUpdateVideoState(message.arg1);
                    return;
                }
                return;
            }
        }
        setEffect(message);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.texturerender.TextureRenderer
    public void handleSetSurface(Message message) {
        Bundle data = message.getData();
        if (data != null) {
            VideoSurfaceTexture videoSurfaceTexture = (VideoSurfaceTexture) data.getSerializable("texture");
            if (videoSurfaceTexture != null) {
                boolean z = true;
                if (this.mDrawingObjectId != 0 && !videoSurfaceTexture.isCurrentObject(this.mDrawingObjectId)) {
                    z = false;
                }
                if (videoSurfaceTexture.handleSurfaceChange(z, this.mEglDummySurface)) {
                    this.mDrawingObjectId = videoSurfaceTexture.getOjbectId();
                    String str = LOG_TAG;
                    TextureRenderLog.m256492d(str, "texture switch surface & playing " + this.mDrawingObjectId);
                }
                Object obj = message.obj;
                if (obj != null) {
                    synchronized (obj) {
                        obj.notify();
                    }
                }
                TextureRenderLog.m256492d(LOG_TAG, "set surface done");
                return;
            }
            throw new RuntimeException("update surface but missing texture");
        }
        throw new RuntimeException("update surface but missing bundle?");
    }

    private void saveImage(Message message) {
        int i;
        int i2;
        int i3;
        int i4;
        ByteBuffer byteBuffer;
        VideoSurfaceTexture videoSurfaceTexture = (VideoSurfaceTexture) message.obj;
        Bundle data = message.getData();
        VideoSurface.SaveFrameCallback saveFrameCallback = (VideoSurface.SaveFrameCallback) data.getSerializable("callback");
        if (saveFrameCallback != null) {
            try {
                int viewportWidth = videoSurfaceTexture.getViewportWidth();
                int viewportHeight = videoSurfaceTexture.getViewportHeight();
                float f = data.getFloat("width", -1.0f);
                if (f > BitmapDescriptorFactory.HUE_RED) {
                    float f2 = (float) viewportWidth;
                    i4 = Math.round(f * f2);
                    float f3 = (float) viewportHeight;
                    int round = Math.round(data.getFloat("height") * f3);
                    int round2 = Math.round(data.getFloat("x") * f2);
                    i = Math.round(data.getFloat("y") * f3);
                    i2 = round2;
                    i3 = round;
                } else {
                    i3 = viewportHeight;
                    i4 = viewportWidth;
                    i2 = 0;
                    i = 0;
                }
                String str = LOG_TAG;
                TextureRenderLog.m256492d(str, "async saveframe = " + i4 + ", " + i3 + " viewW:" + viewportWidth + " viewH:" + viewportHeight);
                int i5 = i4 * i3 * 4;
                if (data.getBoolean("reuse_buffer")) {
                    ByteBuffer byteBuffer2 = this.mSaveFrameBuffer;
                    if (byteBuffer2 == null || byteBuffer2.capacity() < i5) {
                        this.mSaveFrameBuffer = ByteBuffer.allocateDirect(i5);
                    }
                    byteBuffer = this.mSaveFrameBuffer;
                } else {
                    byteBuffer = ByteBuffer.allocateDirect(i5);
                }
                byteBuffer.rewind();
                byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
                GLES20.glFinish();
                GLES20.glReadPixels(i2, i, i4, i3, 6408, 5121, byteBuffer);
                TexGLUtils.checkGLError("handleSaveFrame");
                byteBuffer.rewind();
                int i6 = i4 * 4;
                byte[] bArr = new byte[i6];
                for (int i7 = 0; i7 < i3 / 2; i7++) {
                    byteBuffer.get(bArr);
                    System.arraycopy(byteBuffer.array(), byteBuffer.limit() - byteBuffer.position(), byteBuffer.array(), byteBuffer.position() - i6, i6);
                    System.arraycopy(bArr, 0, byteBuffer.array(), byteBuffer.limit() - byteBuffer.position(), i6);
                }
                byteBuffer.rewind();
                saveFrameCallback.onFrame(byteBuffer, i4, i3);
            } catch (Exception e) {
                String str2 = LOG_TAG;
                TextureRenderLog.m256492d(str2, "save frame failed " + e.getMessage());
            }
        }
    }

    private boolean draw(VideoSurfaceTexture videoSurfaceTexture) {
        boolean z;
        if (videoSurfaceTexture == null) {
            TextureRenderLog.m256492d(LOG_TAG, "surface texture is null not draw");
            return false;
        }
        try {
            videoSurfaceTexture.lock();
            if (videoSurfaceTexture.isRelease()) {
                TextureRenderLog.m256492d(LOG_TAG, "surface texture is released not draw");
                videoSurfaceTexture.unlock();
                return false;
            }
            videoSurfaceTexture.updateTexImage();
            videoSurfaceTexture.unlock();
            while (!this.mErrorList.isEmpty()) {
                videoSurfaceTexture.notifyError(this.mErrorList.poll().intValue());
            }
            if (videoSurfaceTexture.needDrop()) {
                return false;
            }
            if (!videoSurfaceTexture.isMakeCurrent()) {
                if (videoSurfaceTexture.getRenderSurface() == null) {
                    String str = LOG_TAG;
                    TextureRenderLog.m256492d(str, "texture : " + videoSurfaceTexture + " not set surface");
                    return false;
                } else if (!this.mHandler.hasMessages(4)) {
                    String str2 = LOG_TAG;
                    TextureRenderLog.m256492d(str2, "texture : " + videoSurfaceTexture + ", retry create");
                    if (!videoSurfaceTexture.createEGLWindowSurface(false, false, EGL14.EGL_NO_SURFACE)) {
                        String str3 = LOG_TAG;
                        TextureRenderLog.m256492d(str3, "texture : " + videoSurfaceTexture + ", retry failed");
                        return false;
                    }
                }
            }
            ITexture texId = videoSurfaceTexture.getTexId();
            int lock = texId.lock();
            HashMap effectConfigMap = this.mEffectConfig.getEffectConfigMap();
            EffectConfig effectConfig = videoSurfaceTexture.getEffectConfig();
            Iterator it = effectConfigMap.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                if (((Integer) entry.getValue()).intValue() == 1 && effectConfig.getEffectOpen(((Integer) entry.getKey()).intValue())) {
                    z = true;
                    break;
                }
            }
            int texWidth = videoSurfaceTexture.getTexWidth();
            int texHeight = videoSurfaceTexture.getTexHeight();
            EffectTexture effectTexture = new EffectTexture(null, lock, texWidth, texHeight, 36197);
            if (z) {
                for (AbsEffect nextEffect = this.mTopEffect.getNextEffect(); nextEffect != null; nextEffect = nextEffect.getNextEffect()) {
                    int intOption = nextEffect.getIntOption(10005);
                    if (effectConfig.getEffectOpen(intOption)) {
                        if (effectTexture.getTexTarget() == 36197 && nextEffect.getIntOption(10004) == 3553) {
                            videoSurfaceTexture.updateTextureForFbo();
                            this.mTexOesDrawer.setSurfaceTexture(videoSurfaceTexture);
                            this.mTexOesDrawer.setOption(10006, texWidth);
                            this.mTexOesDrawer.setOption(10007, texHeight);
                            effectTexture = this.mTexOesDrawer.process(effectTexture, this.mFrameBuffer);
                        }
                        nextEffect.setSurfaceTexture(videoSurfaceTexture);
                        nextEffect.setOption(10006, texWidth);
                        nextEffect.setOption(10007, texHeight);
                        effectTexture = nextEffect.process(effectTexture, this.mFrameBuffer);
                    } else {
                        videoSurfaceTexture.setOption(19, intOption, 0);
                    }
                }
            } else {
                videoSurfaceTexture.resetFlag();
            }
            boolean z2 = false;
            for (Map.Entry<Surface, EGLSurface> entry2 : videoSurfaceTexture.getExtraRealSurfaces().entrySet()) {
                EGLSurface value = entry2.getValue();
                videoSurfaceTexture.makeCurrent(value);
                drawToSurface(effectTexture, videoSurfaceTexture, videoSurfaceTexture.getConsumerHeight(value), videoSurfaceTexture.getConsumerWidth(value));
                videoSurfaceTexture.eglSwapBuffer(value);
                z2 = true;
            }
            if (!videoSurfaceTexture.isCurrentObject(this.mDrawingObjectId)) {
                if (videoSurfaceTexture.isMakeCurrent()) {
                    String str4 = LOG_TAG;
                    TextureRenderLog.m256492d(str4, "not active texture but already make current : " + videoSurfaceTexture);
                    videoSurfaceTexture.makeCurrent();
                    this.mDrawingObjectId = videoSurfaceTexture.getOjbectId();
                    String str5 = LOG_TAG;
                    TextureRenderLog.m256492d(str5, "texture switch surface & playing " + this.mDrawingObjectId);
                } else {
                    String str6 = LOG_TAG;
                    TextureRenderLog.m256492d(str6, "tex: " + videoSurfaceTexture + " not current object id " + this.mDrawingObjectId + ", " + videoSurfaceTexture.getOjbectId());
                    texId.unlock();
                    return false;
                }
            } else if (z2) {
                videoSurfaceTexture.makeCurrent();
            }
            drawToSurface(effectTexture, videoSurfaceTexture, videoSurfaceTexture.getViewportHeight(), videoSurfaceTexture.getViewportWidth());
            texId.unlock();
            if (GLES20.glGetError() == 0) {
                return true;
            }
            return false;
        } catch (Exception e) {
            e.printStackTrace();
        } catch (Throwable th) {
            videoSurfaceTexture.unlock();
            throw th;
        }
    }

    public VideoTextureRenderer(EffectConfig effectConfig, int i) {
        super(effectConfig, i);
    }

    private void _setValueToElement(int i, float f) {
        switch (i) {
            case 11:
            case HwBuildEx.VersionCodes.EMUI_5_1:
            case 13:
                this.mTopEffect.setOption(i, f);
                return;
            default:
                return;
        }
    }

    private void _setValueToElement(int i, int i2) {
        if (i == 8) {
            this.mTopEffect.setOption(i, i2);
        } else if (i == 14 || i == 17) {
            this.mTopEffect.setOption(i, i2);
        }
    }

    private int reInitIfNeed(int i, int i2) {
        AbsEffect effect = getEffect(i);
        if (effect == null) {
            return 0;
        }
        Bundle initBundle = effect.getInitBundle();
        if (initBundle != null) {
            initBundle.putInt("texture_type", i2);
        }
        int init = effect.init(initBundle);
        String str = LOG_TAG;
        TextureRenderLog.m256492d(str, "reInit, effectType:" + i + ",texTarget:" + i2);
        if (init == 0) {
            return 0;
        }
        effect.release();
        return init;
    }

    /* JADX WARNING: Removed duplicated region for block: B:55:0x00e8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int initEffect(android.os.Bundle r11, com.ss.texturerender.VideoSurfaceTexture r12) {
        /*
        // Method dump skipped, instructions count: 365
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.texturerender.VideoTextureRenderer.initEffect(android.os.Bundle, com.ss.texturerender.VideoSurfaceTexture):int");
    }

    private void drawToSurface(EffectTexture effectTexture, VideoSurfaceTexture videoSurfaceTexture, int i, int i2) {
        GLDefaultFilter gLDefaultFilter;
        if (effectTexture.getTexTarget() == 3553) {
            gLDefaultFilter = this.mTex2dDrawer;
        } else {
            gLDefaultFilter = this.mTexOesDrawer;
        }
        if (gLDefaultFilter != null) {
            gLDefaultFilter.setSurfaceTexture(videoSurfaceTexture);
            gLDefaultFilter.setOption(10006, i2);
            gLDefaultFilter.setOption(10007, i);
            gLDefaultFilter.process(effectTexture, null);
        }
    }
}
