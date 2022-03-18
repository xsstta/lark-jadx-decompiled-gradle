package com.ss.texturerender;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.Surface;
import com.ss.texturerender.VideoSurfaceTexture;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

public class VideoSurface extends Surface implements Handler.Callback, VideoSurfaceTexture.TextureDrawCallback, VideoSurfaceTexture.TextureErrorCallback {
    private OnDrawFrameListener mDrawFrameListener;
    private ArrayList<OnErrorListener> mErrorListeners;
    private Object mHandlerObject;
    private Bundle mMsgObjectBundle;
    private Handler mNotifyHandler;
    private VideoSurfaceTexture mSurfaceTexture;

    public interface OnDrawFrameListener {
        void onDraw(long j);
    }

    public interface OnErrorListener {
        void onError(int i);
    }

    public interface SaveFrameCallback extends Serializable {
        int onFrame(ByteBuffer byteBuffer, int i, int i2);
    }

    /* access modifiers changed from: protected */
    @Override // android.view.Surface, java.lang.Object
    public void finalize() throws Throwable {
        releaseTexture();
        super.finalize();
    }

    public void preRender() {
        VideoSurfaceTexture videoSurfaceTexture = this.mSurfaceTexture;
        if (videoSurfaceTexture != null) {
            videoSurfaceTexture.preRender();
        }
    }

    public Bitmap saveFrame() {
        return saveFrame(null, null);
    }

    private synchronized void releaseTexture() {
        VideoSurfaceTexture videoSurfaceTexture = this.mSurfaceTexture;
        if (videoSurfaceTexture != null) {
            videoSurfaceTexture.releaseOffScreenSurface(false);
            this.mSurfaceTexture = null;
        }
    }

    public void release() {
        TextureRenderLog.m256492d("VideoSurface", this + "release");
        super.release();
        releaseTexture();
        synchronized (this.mHandlerObject) {
            this.mDrawFrameListener = null;
            this.mNotifyHandler = null;
            ArrayList<OnErrorListener> arrayList = this.mErrorListeners;
            if (arrayList != null) {
                arrayList.clear();
            }
        }
    }

    public void setOnDrawFrameListener(OnDrawFrameListener onDrawFrameListener) {
        this.mDrawFrameListener = onDrawFrameListener;
    }

    public int getIntOption(int i) {
        return getIntOption(i, -1);
    }

    public void ignoreSRResolutionCheck(boolean z) {
        VideoSurfaceTexture videoSurfaceTexture = this.mSurfaceTexture;
        if (videoSurfaceTexture != null) {
            videoSurfaceTexture.ignoreSRResolutionCheck(z);
        }
    }

    public void setEffect(Bundle bundle) {
        VideoSurfaceTexture videoSurfaceTexture = this.mSurfaceTexture;
        if (videoSurfaceTexture != null) {
            videoSurfaceTexture.setEffect(bundle);
        }
    }

    public void setSuperResolutionMode(int i) {
        VideoSurfaceTexture videoSurfaceTexture = this.mSurfaceTexture;
        if (videoSurfaceTexture != null) {
            videoSurfaceTexture.setSuperResolutionMode(i);
        }
    }

    public void updateRenderSurface(Surface surface) {
        VideoSurfaceTexture videoSurfaceTexture = this.mSurfaceTexture;
        if (videoSurfaceTexture != null) {
            videoSurfaceTexture.updateSurface(surface);
        }
    }

    public void pause(boolean z) {
        VideoSurfaceTexture videoSurfaceTexture = this.mSurfaceTexture;
        if (videoSurfaceTexture != null) {
            videoSurfaceTexture.pause(z, true);
        }
    }

    public void setLooper(Looper looper) {
        if (looper != null) {
            this.mNotifyHandler = new Handler(looper, this);
        }
    }

    public void setOnErrorListener(OnErrorListener onErrorListener) {
        if (this.mErrorListeners == null) {
            this.mErrorListeners = new ArrayList<>();
        }
        if (!this.mErrorListeners.contains(onErrorListener)) {
            this.mErrorListeners.add(onErrorListener);
        }
    }

    public VideoSurface(VideoSurfaceTexture videoSurfaceTexture) {
        super(videoSurfaceTexture);
        this.mSurfaceTexture = videoSurfaceTexture;
        if (Looper.myLooper() != null) {
            this.mNotifyHandler = new Handler(this);
        } else {
            this.mNotifyHandler = new Handler(Looper.getMainLooper(), this);
        }
        this.mHandlerObject = new Object();
        this.mMsgObjectBundle = new Bundle();
    }

    @Override // com.ss.texturerender.VideoSurfaceTexture.TextureErrorCallback
    public void onTextureRenderError(int i) {
        ArrayList<OnErrorListener> arrayList = this.mErrorListeners;
        if (arrayList != null && !arrayList.isEmpty()) {
            synchronized (this.mHandlerObject) {
                Message obtainMessage = this.mNotifyHandler.obtainMessage(4097);
                obtainMessage.arg1 = i;
                obtainMessage.sendToTarget();
            }
        }
    }

    public boolean handleMessage(Message message) {
        ArrayList<OnErrorListener> arrayList;
        int i = message.what;
        if (i != 4096) {
            if (i != 4097 || (arrayList = this.mErrorListeners) == null || arrayList.isEmpty() || this.mSurfaceTexture == null) {
                return true;
            }
            int i2 = message.arg1;
            Iterator<OnErrorListener> it = this.mErrorListeners.iterator();
            while (it.hasNext()) {
                it.next().onError(i2);
            }
            return true;
        } else if (this.mDrawFrameListener == null || this.mSurfaceTexture == null) {
            return true;
        } else {
            int i3 = message.arg1;
            int serial = this.mSurfaceTexture.getSerial();
            if (i3 != serial) {
                TextureRenderLog.m256492d("VideoSurface", "serial change :" + i3 + ", " + serial);
                return true;
            }
            this.mDrawFrameListener.onDraw(message.getData().getLong("timeStamp"));
            return true;
        }
    }

    public void setDefaultSize(int i, int i2) {
        VideoSurfaceTexture videoSurfaceTexture = this.mSurfaceTexture;
        if (videoSurfaceTexture != null) {
            videoSurfaceTexture.setDefaultBufferSize(i, i2);
        }
    }

    public void setExtraRenderSurface(Surface surface, int i) {
        VideoSurfaceTexture videoSurfaceTexture = this.mSurfaceTexture;
        if (videoSurfaceTexture != null) {
            videoSurfaceTexture.setExtraSurface(surface, i);
        }
    }

    public void setFloatOption(int i, float f) {
        VideoSurfaceTexture videoSurfaceTexture = this.mSurfaceTexture;
        if (videoSurfaceTexture != null) {
            videoSurfaceTexture.setOption(i, f);
        }
    }

    public void updateTexDimension(int i, int i2) {
        VideoSurfaceTexture videoSurfaceTexture = this.mSurfaceTexture;
        if (videoSurfaceTexture != null) {
            videoSurfaceTexture.updateTexDimension(i, i2);
        }
    }

    public int getIntOption(int i, int i2) {
        VideoSurfaceTexture videoSurfaceTexture = this.mSurfaceTexture;
        if (videoSurfaceTexture != null) {
            return videoSurfaceTexture.getIntOption(i, i2);
        }
        return -1;
    }

    public Bitmap saveFrame(Bundle bundle, SaveFrameCallback saveFrameCallback) {
        VideoSurfaceTexture videoSurfaceTexture = this.mSurfaceTexture;
        if (videoSurfaceTexture == null) {
            return null;
        }
        return videoSurfaceTexture.saveFrame(bundle, saveFrameCallback);
    }

    public boolean supportProcessResolution(int i, int i2) {
        VideoSurfaceTexture videoSurfaceTexture = this.mSurfaceTexture;
        if (videoSurfaceTexture == null) {
            return false;
        }
        return videoSurfaceTexture.supportProcessResolution(i, i2);
    }

    public void setIntOption(int i, int i2) {
        if (i != 1) {
            VideoSurfaceTexture videoSurfaceTexture = this.mSurfaceTexture;
            if (videoSurfaceTexture != null) {
                videoSurfaceTexture.setOption(i, i2);
                return;
            }
            return;
        }
        VideoSurfaceTexture videoSurfaceTexture2 = this.mSurfaceTexture;
        if (videoSurfaceTexture2 != null) {
            videoSurfaceTexture2.updateVideoState(i2);
        }
    }

    @Override // com.ss.texturerender.VideoSurfaceTexture.TextureDrawCallback
    public void onTextureUpdate(int i, long j) {
        if (this.mDrawFrameListener != null) {
            synchronized (this.mHandlerObject) {
                Message obtainMessage = this.mNotifyHandler.obtainMessage(4096);
                this.mMsgObjectBundle.putLong("timeStamp", j);
                obtainMessage.arg1 = i;
                obtainMessage.setData(this.mMsgObjectBundle);
                obtainMessage.sendToTarget();
            }
        }
    }

    public void frameMetaCallback(long j, long j2, Map<Integer, String> map) {
        VideoSurfaceTexture videoSurfaceTexture = this.mSurfaceTexture;
        if (videoSurfaceTexture != null) {
            videoSurfaceTexture.frameMetaCallback(j, j2, map);
        }
    }

    public void setSuperResolutionInitConfig(int i, String str, String str2, String str3) {
        VideoSurfaceTexture videoSurfaceTexture = this.mSurfaceTexture;
        if (videoSurfaceTexture != null) {
            videoSurfaceTexture.setSuperResolutionConfig(i, str, str2, str3, 0, 0, null);
        }
    }

    public void setSuperResolutionInitConfig(int i, String str, String str2, String str3, int i2, int i3) {
        VideoSurfaceTexture videoSurfaceTexture = this.mSurfaceTexture;
        if (videoSurfaceTexture != null) {
            videoSurfaceTexture.setSuperResolutionConfig(i, str, str2, str3, i2, i3, null);
        }
    }

    public void setSuperResolutionInitConfig(int i, String str, String str2, String str3, int i2, int i3, String str4) {
        VideoSurfaceTexture videoSurfaceTexture = this.mSurfaceTexture;
        if (videoSurfaceTexture != null) {
            videoSurfaceTexture.setSuperResolutionConfig(i, str, str2, str3, i2, i3, str4);
        }
    }
}
