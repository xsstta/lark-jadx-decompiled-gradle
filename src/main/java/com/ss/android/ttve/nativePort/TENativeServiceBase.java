package com.ss.android.ttve.nativePort;

import com.ss.android.ttve.common.AbstractC60184c;
import com.ss.android.ttve.nativePort.NativeCallbacks;

public class TENativeServiceBase {
    protected NativeCallbacks.AbstractC60235a mAudioExtendToFileCallback;
    protected NativeCallbacks.AbstractC60237c mEncoderDataCallback;
    protected NativeCallbacks.AbstractC60236b mExtractFrameProcessCallback;
    protected NativeCallbacks.AbstractC60238d mGetImageCallback;
    protected NativeCallbacks.AbstractC60239e mKeyFrameCallback;
    protected NativeCallbacks.AbstractC60240f mMVInitedCallback;
    protected NativeCallbacks.AbstractC60241g mMattingCallback;
    protected AbstractC60184c mOnErrorListener;
    protected AbstractC60184c mOnInfoListener;
    protected NativeCallbacks.AbstractC60242h mOpenGLCallback;
    protected NativeCallbacks.AbstractC60238d mSeekFrameCallback;

    public NativeCallbacks.AbstractC60237c getEncoderDataListener() {
        return this.mEncoderDataCallback;
    }

    public AbstractC60184c getErrorListener() {
        return this.mOnErrorListener;
    }

    public AbstractC60184c getInfoListener() {
        return this.mOnInfoListener;
    }

    public NativeCallbacks.AbstractC60242h getOpenGLListeners() {
        return this.mOpenGLCallback;
    }

    public void nativeCallback_onAudioExtendToFileCancel() {
        NativeCallbacks.AbstractC60235a aVar = this.mAudioExtendToFileCallback;
        if (aVar != null) {
            aVar.mo205726a();
        }
    }

    public void nativeCallback_onMVInited() {
        NativeCallbacks.AbstractC60240f fVar = this.mMVInitedCallback;
        if (fVar != null) {
            fVar.mo205734a();
        }
    }

    public void nativeCallback_onMattingStartedCallback() {
        NativeCallbacks.AbstractC60241g gVar = this.mMattingCallback;
        if (gVar != null) {
            gVar.mo205735a();
        }
    }

    public void setAudioExtendToFileCallback(NativeCallbacks.AbstractC60235a aVar) {
        this.mAudioExtendToFileCallback = aVar;
    }

    public void setEncoderDataListener(NativeCallbacks.AbstractC60237c cVar) {
        this.mEncoderDataCallback = cVar;
    }

    public void setErrorListener(AbstractC60184c cVar) {
        this.mOnErrorListener = cVar;
    }

    public void setExtractFrameProcessCallback(NativeCallbacks.AbstractC60236b bVar) {
        this.mExtractFrameProcessCallback = bVar;
    }

    public void setGetImageCallback(NativeCallbacks.AbstractC60238d dVar) {
        this.mGetImageCallback = dVar;
    }

    public void setGetSeekFrameCallback(NativeCallbacks.AbstractC60238d dVar) {
        this.mGetImageCallback = dVar;
    }

    public void setInfoListener(AbstractC60184c cVar) {
        this.mOnInfoListener = cVar;
    }

    public void setKeyFrameCallback(NativeCallbacks.AbstractC60239e eVar) {
        this.mKeyFrameCallback = eVar;
    }

    public void setMattingCallback(NativeCallbacks.AbstractC60241g gVar) {
        this.mMattingCallback = gVar;
    }

    public void setOpenGLListeners(NativeCallbacks.AbstractC60242h hVar) {
        this.mOpenGLCallback = hVar;
    }

    public void setSeekFrameCallback(NativeCallbacks.AbstractC60238d dVar) {
        this.mSeekFrameCallback = dVar;
    }

    public void setmMVInitedCallback(NativeCallbacks.AbstractC60240f fVar) {
        this.mMVInitedCallback = fVar;
    }

    public void nativeCallback_onAudioExtendToFileFinish(boolean z) {
        NativeCallbacks.AbstractC60235a aVar = this.mAudioExtendToFileCallback;
        if (aVar != null) {
            aVar.mo205728a(z);
        }
    }

    public void nativeCallback_onAudioExtendToFileProcess(float f) {
        NativeCallbacks.AbstractC60235a aVar = this.mAudioExtendToFileCallback;
        if (aVar != null) {
            aVar.mo205727a(f);
        }
    }

    public void nativeCallback_onExtractFrameProcess(float f) {
        NativeCallbacks.AbstractC60236b bVar = this.mExtractFrameProcessCallback;
        if (bVar != null) {
            bVar.mo205729a(f);
        }
    }

    public void nativeCallback_onMattingDoneCallback(float f) {
        NativeCallbacks.AbstractC60241g gVar = this.mMattingCallback;
        if (gVar != null) {
            gVar.mo205736a(f);
        }
    }

    public void nativeCallback_onOpenGLCreate(int i) {
        NativeCallbacks.AbstractC60242h hVar = this.mOpenGLCallback;
        if (hVar != null) {
            hVar.mo205739a(i);
        }
    }

    public void nativeCallback_onOpenGLDestroy(int i) {
        NativeCallbacks.AbstractC60242h hVar = this.mOpenGLCallback;
        if (hVar != null) {
            hVar.mo205741b(i);
        }
    }

    public void nativeCallback_onPreviewSurface(int i) {
        NativeCallbacks.AbstractC60242h hVar = this.mOpenGLCallback;
        if (hVar != null) {
            hVar.mo205743c(i);
        }
    }

    public void nativeCallback_onOpenGLDrawAfter(int i, double d) {
        NativeCallbacks.AbstractC60242h hVar = this.mOpenGLCallback;
        if (hVar != null) {
            hVar.mo205742b(i, d);
        }
    }

    public void nativeCallback_onOpenGLDrawBefore(int i, double d) {
        NativeCallbacks.AbstractC60242h hVar = this.mOpenGLCallback;
        if (hVar != null) {
            hVar.mo205740a(i, d);
        }
    }

    public void nativeCallback_onDisplayCallback(int i, int i2, int i3) {
        NativeCallbacks.AbstractC60239e eVar = this.mKeyFrameCallback;
        if (eVar != null) {
            eVar.mo205732a(i, i2, i3);
        }
    }

    public void nativeCallback_onMattingErrorCallback(int i, int i2, float f) {
        NativeCallbacks.AbstractC60241g gVar = this.mMattingCallback;
        if (gVar != null) {
            gVar.mo205738a(i, i2, f);
        }
    }

    public void nativeCallback_onProcessCallback(int i, int i2, String str) {
        NativeCallbacks.AbstractC60239e eVar = this.mKeyFrameCallback;
        if (eVar != null) {
            eVar.mo205733a(i, i2, str);
        }
    }

    public void nativeCallback_onInfoListener(int i, int i2, float f) {
        AbstractC60184c cVar = this.mOnInfoListener;
        if (cVar != null) {
            cVar.mo205522a(i, i2, f, null);
        }
    }

    public void nativeCallback_onCompressBuffer(byte[] bArr, int i, int i2, boolean z) {
        NativeCallbacks.AbstractC60237c cVar = this.mEncoderDataCallback;
        if (cVar != null) {
            cVar.mo205730a(bArr, i, i2, z);
        }
    }

    public void nativeCallback_onErrorListener(int i, int i2, float f, String str) {
        AbstractC60184c cVar = this.mOnErrorListener;
        if (cVar != null) {
            cVar.mo205522a(i, i2, f, str);
        }
    }

    public void nativeCallback_onMattingProgressCallback(int i, float f, float f2, boolean z) {
        NativeCallbacks.AbstractC60241g gVar = this.mMattingCallback;
        if (gVar != null) {
            gVar.mo205737a(i, f, f2, z);
        }
    }

    public int nativeCallback_onImageData(byte[] bArr, int i, int i2, int i3, float f) {
        NativeCallbacks.AbstractC60238d dVar = this.mGetImageCallback;
        if (dVar != null) {
            return dVar.mo205731a(bArr, i, i2, i3, f);
        }
        return 0;
    }

    public int nativeCallback_onSeekFrameData(byte[] bArr, int i, int i2, int i3, float f) {
        NativeCallbacks.AbstractC60238d dVar = this.mSeekFrameCallback;
        if (dVar != null) {
            return dVar.mo205731a(bArr, i, i2, i3, f);
        }
        return 0;
    }
}
