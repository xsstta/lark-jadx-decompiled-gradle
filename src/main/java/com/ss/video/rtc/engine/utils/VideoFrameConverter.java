package com.ss.video.rtc.engine.utils;

import android.graphics.Matrix;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import com.bytedance.platform.godzilla.thread.C20339a;
import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import com.ss.video.rtc.engine.RtcSharedContext;
import com.ss.video.rtc.engine.mediaio.RtcVideoFrame;
import java.nio.ByteBuffer;
import javax.microedition.khronos.egl.EGLContext;
import org.webrtc.EglBase;
import org.webrtc.JavaI420Buffer;
import org.webrtc.NV21Buffer;
import org.webrtc.RendererCommon;
import org.webrtc.VideoFrame;

public class VideoFrameConverter {
    private static boolean sEnableTextureCopy = true;
    private long gl420ConverterNativeHandle;
    private long glNativeHandle;
    private Handler mHandler = new Handler(this.mHandlerThread.getLooper());
    private HandlerThread mHandlerThread;
    private TextureHelper mI420TextureConverter;
    private boolean mIsConvertYUV;
    private boolean mIsStart = true;
    private TextureHelper mTextureHelper;

    public static HandlerThread new_android_os_HandlerThread_by_knot(String str) {
        return C20341a.m74147a() ? C20339a.m74145a(str, 0, C20341a.f49621b) : new HandlerThread(str);
    }

    public long getNativeEglContext(EGLContext eGLContext) {
        return 0;
    }

    public TextureHelper getTextureHelper() {
        return this.mTextureHelper;
    }

    public synchronized void dispose() {
        TextureHelper textureHelper = this.mTextureHelper;
        if (textureHelper != null) {
            textureHelper.dispose();
        }
        TextureHelper textureHelper2 = this.mI420TextureConverter;
        if (textureHelper2 != null) {
            textureHelper2.dispose();
        }
        HandlerThread handlerThread = this.mHandlerThread;
        if (handlerThread != null) {
            handlerThread.quit();
        }
        this.mIsStart = false;
        this.mIsConvertYUV = false;
    }

    public static void setEnableTextureCopy(boolean z) {
        sEnableTextureCopy = z;
    }

    public /* synthetic */ void lambda$convert2VideoFrame$0$VideoFrameConverter(RtcVideoFrame rtcVideoFrame) {
        this.mTextureHelper.queueTexture(rtcVideoFrame.textureId);
    }

    private long getNativeEglContext(android.opengl.EGLContext eGLContext) {
        if (Build.VERSION.SDK_INT >= 21) {
            return eGLContext.getNativeHandle();
        }
        return (long) eGLContext.getHandle();
    }

    public synchronized void post(Runnable runnable) {
        if (this.mIsStart) {
            TextureHelper textureHelper = this.mTextureHelper;
            if (textureHelper != null) {
                textureHelper.post(runnable);
            } else {
                this.mHandler.post(runnable);
            }
        }
    }

    public VideoFrameConverter(boolean z) {
        HandlerThread new_android_os_HandlerThread_by_knot = new_android_os_HandlerThread_by_knot("video-frame-converter");
        this.mHandlerThread = new_android_os_HandlerThread_by_knot;
        new_android_os_HandlerThread_by_knot.start();
        this.mIsConvertYUV = z;
    }

    public static ByteBuffer getExtendedData(RtcVideoFrame rtcVideoFrame) {
        if (rtcVideoFrame.extend_data == null || rtcVideoFrame.extend_data.isDirect()) {
            return rtcVideoFrame.extend_data;
        }
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(rtcVideoFrame.extend_data.capacity());
        rtcVideoFrame.extend_data.rewind();
        allocateDirect.put(rtcVideoFrame.extend_data);
        rtcVideoFrame.extend_data.rewind();
        allocateDirect.order(rtcVideoFrame.extend_data.order());
        allocateDirect.rewind();
        return allocateDirect;
    }

    public static ByteBuffer getSupplementaryInfo(RtcVideoFrame rtcVideoFrame) {
        if (rtcVideoFrame.supplementary_info == null || rtcVideoFrame.supplementary_info.isDirect()) {
            return rtcVideoFrame.supplementary_info;
        }
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(rtcVideoFrame.supplementary_info.capacity());
        rtcVideoFrame.supplementary_info.rewind();
        allocateDirect.put(rtcVideoFrame.supplementary_info);
        rtcVideoFrame.supplementary_info.rewind();
        allocateDirect.order(rtcVideoFrame.supplementary_info.order());
        allocateDirect.rewind();
        return allocateDirect;
    }

    public synchronized VideoFrame convert2I420Frame(RtcVideoFrame rtcVideoFrame) {
        VideoFrame videoFrame = null;
        if (rtcVideoFrame != null) {
            if (this.mIsStart) {
                if (rtcVideoFrame.format != 11) {
                    if (rtcVideoFrame.format != 10) {
                        if (rtcVideoFrame.format != 3) {
                            if (rtcVideoFrame.format != 1) {
                                LogUtil.m257133w("VideoFrameConverter", "pushExternalVideoFrame ExtVideoFrame type is not available");
                                return null;
                            }
                        }
                        updateEglContext(RtcSharedContext.getEGLContext(), rtcVideoFrame.stride, rtcVideoFrame.height);
                        return allocateVideoFrame(rtcVideoFrame, rtcVideoFrame.stride, rtcVideoFrame.height);
                    }
                }
                System.currentTimeMillis();
                if (rtcVideoFrame.eglContext14 != null) {
                    updateEglContext(RtcSharedContext.getEGLContext(), rtcVideoFrame.stride, rtcVideoFrame.height);
                } else if (rtcVideoFrame.eglContext11 != null) {
                    updateEglContext(RtcSharedContext.getEGLContext(), rtcVideoFrame.stride, rtcVideoFrame.height);
                }
                if (rtcVideoFrame.eglContext14 == null || !updateI420Converter(rtcVideoFrame.eglContext14, rtcVideoFrame.stride, rtcVideoFrame.height)) {
                    LogUtil.m257130e("VideoFrameConverter", "video frame  error frame eglContext14:" + rtcVideoFrame.eglContext14 + " isStart:" + this.mIsStart);
                    return null;
                }
                if (this.mTextureHelper != null) {
                    videoFrame = allocateVideoFrame(rtcVideoFrame, this.mI420TextureConverter, rtcVideoFrame.stride, rtcVideoFrame.height);
                }
                return videoFrame;
            }
        }
        LogUtil.m257130e("VideoFrameConverter", "video frame convert2I420Frame error frame:" + rtcVideoFrame + " isStart:" + this.mIsStart);
        return null;
    }

    public synchronized VideoFrame convert2VideoFrame(RtcVideoFrame rtcVideoFrame) {
        VideoFrame videoFrame = null;
        if (rtcVideoFrame == null) {
            LogUtil.m257133w("VideoFrameConverter", "convert2VideoFrame frame is null");
            return null;
        } else if (rtcVideoFrame.format == 11 || rtcVideoFrame.format == 10) {
            System.currentTimeMillis();
            if (rtcVideoFrame.eglContext14 != null) {
                updateEglContext(rtcVideoFrame.eglContext14, rtcVideoFrame.stride, rtcVideoFrame.height);
            } else if (rtcVideoFrame.eglContext11 != null) {
                updateEglContext(rtcVideoFrame.eglContext11, rtcVideoFrame.stride, rtcVideoFrame.height);
            }
            if (this.mTextureHelper != null) {
                if (rtcVideoFrame.hasReleaseCallback()) {
                    TextureHelper textureHelper = this.mTextureHelper;
                    int i = rtcVideoFrame.stride;
                    int i2 = rtcVideoFrame.height;
                    rtcVideoFrame.getClass();
                    videoFrame = allocateVideoFrame(rtcVideoFrame, textureHelper, i, i2, new Runnable() {
                        /* class com.ss.video.rtc.engine.utils.$$Lambda$MExm_oyhwpjSL0sKis0bgk1xREY */

                        public final void run() {
                            RtcVideoFrame.this.release();
                        }
                    });
                } else {
                    int dequeueTexture = this.mTextureHelper.dequeueTexture();
                    if (dequeueTexture == 0) {
                        return null;
                    }
                    this.mTextureHelper.drawTexture(rtcVideoFrame.format, rtcVideoFrame.textureId, dequeueTexture);
                    rtcVideoFrame.textureId = dequeueTexture;
                    rtcVideoFrame.format = 10;
                    videoFrame = allocateVideoFrame(rtcVideoFrame, this.mTextureHelper, rtcVideoFrame.stride, rtcVideoFrame.height, new Runnable(rtcVideoFrame) {
                        /* class com.ss.video.rtc.engine.utils.$$Lambda$VideoFrameConverter$PXgd1RCD4jkycOiUrjNId08X2o */
                        public final /* synthetic */ RtcVideoFrame f$1;

                        {
                            this.f$1 = r2;
                        }

                        public final void run() {
                            VideoFrameConverter.this.lambda$convert2VideoFrame$0$VideoFrameConverter(this.f$1);
                        }
                    });
                }
            }
            return videoFrame;
        } else if (rtcVideoFrame.format == 3 || rtcVideoFrame.format == 1) {
            updateEglContext(RtcSharedContext.getEGLContext(), rtcVideoFrame.stride, rtcVideoFrame.height);
            return allocateVideoFrame(rtcVideoFrame, rtcVideoFrame.stride, rtcVideoFrame.height);
        } else {
            LogUtil.m257133w("VideoFrameConverter", "pushExternalVideoFrame ExtVideoFrame type is not available");
            return null;
        }
    }

    private void updateEglContext(android.opengl.EGLContext eGLContext, int i, int i2) {
        if (this.mTextureHelper == null) {
            this.mTextureHelper = TextureHelper.create("EGL14TextureHelper", eGLContext, i, i2);
            this.glNativeHandle = getNativeEglContext(eGLContext);
            LogUtil.m257132i("VideoFrameConverter", "create  egl14 texture helper");
        } else if (this.glNativeHandle != getNativeEglContext(eGLContext)) {
            this.glNativeHandle = getNativeEglContext(eGLContext);
            this.mTextureHelper.dispose();
            this.mTextureHelper = TextureHelper.create("EGL14TextureHelper", eGLContext, i, i2);
            LogUtil.m257132i("VideoFrameConverter", "update egl14Context nativeHandle:" + this.glNativeHandle + " ,eglContext:" + eGLContext);
        }
    }

    private void updateEglContext(EGLContext eGLContext, int i, int i2) {
        if (this.mTextureHelper == null) {
            this.mTextureHelper = TextureHelper.create("EGL10TextureHelper", eGLContext, i, i2);
            this.glNativeHandle = getNativeEglContext(eGLContext);
            LogUtil.m257132i("VideoFrameConverter", "create  egl10 texture helper");
        } else if (this.glNativeHandle != getNativeEglContext(eGLContext)) {
            this.glNativeHandle = getNativeEglContext(eGLContext);
            this.mTextureHelper.dispose();
            this.mTextureHelper = TextureHelper.create("EGL10TextureHelper", eGLContext, i, i2);
            LogUtil.m257132i("VideoFrameConverter", "update egl14Context nativeHandle:" + this.glNativeHandle + " ,eglContext:" + eGLContext);
        }
    }

    private boolean updateI420Converter(android.opengl.EGLContext eGLContext, int i, int i2) {
        EglBase.Context context;
        if (RtcSharedContext.getEGLContext() == null || RtcSharedContext.getEGLContext().getEglBaseContext() == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("updateI420Converter error EglContext:");
            sb.append(RtcSharedContext.getEGLContext());
            sb.append("EglBaseContext:");
            if (RtcSharedContext.getEGLContext() != null) {
                context = RtcSharedContext.getEGLContext().getEglBaseContext();
            } else {
                context = null;
            }
            sb.append(context);
            LogUtil.m257130e("VideoFrameConverter", sb.toString());
            return false;
        } else if (this.mI420TextureConverter == null) {
            this.mI420TextureConverter = TextureHelper.create("EGLBaseTextureHelper", eGLContext, i, i2);
            this.gl420ConverterNativeHandle = getNativeEglContext(eGLContext);
            LogUtil.m257132i("VideoFrameConverter", "create EglBase 420 texture converter");
            return true;
        } else if (this.gl420ConverterNativeHandle == getNativeEglContext(eGLContext)) {
            return true;
        } else {
            this.gl420ConverterNativeHandle = getNativeEglContext(eGLContext);
            this.mI420TextureConverter.dispose();
            this.mI420TextureConverter = TextureHelper.create("EGL14TextureConverter", eGLContext, i, i2);
            LogUtil.m257132i("VideoFrameConverter", "update egl14texture converter nativeHandle:" + this.glNativeHandle + " ,eglContext:" + eGLContext);
            return true;
        }
    }

    private VideoFrame allocateVideoFrame(RtcVideoFrame rtcVideoFrame, int i, int i2) {
        VideoFrame.Buffer buffer;
        VideoFrame.Buffer buffer2;
        int i3 = rtcVideoFrame.format;
        if (i3 == 1) {
            JavaI420Buffer allocate = JavaI420Buffer.allocate(rtcVideoFrame.stride, rtcVideoFrame.height);
            ByteBuffer dataY = allocate.getDataY();
            ByteBuffer dataU = allocate.getDataU();
            ByteBuffer dataV = allocate.getDataV();
            byte[] array = rtcVideoFrame.buffer.array();
            dataY.put(array, 0, rtcVideoFrame.stride * rtcVideoFrame.height);
            dataU.put(array, rtcVideoFrame.stride * rtcVideoFrame.height, (rtcVideoFrame.stride * rtcVideoFrame.height) / 4);
            dataV.put(array, (rtcVideoFrame.stride * rtcVideoFrame.height) + ((rtcVideoFrame.stride * rtcVideoFrame.height) / 4), (rtcVideoFrame.stride * rtcVideoFrame.height) / 4);
            float f = (float) i;
            float f2 = (float) i2;
            float f3 = f / f2;
            if (((float) rtcVideoFrame.stride) / ((float) rtcVideoFrame.height) >= f3) {
                buffer = allocate.cropAndScale((rtcVideoFrame.stride - ((int) (((float) rtcVideoFrame.height) * f3))) / 2, 0, (int) (f3 * ((float) rtcVideoFrame.height)), rtcVideoFrame.height, i, i2);
            } else {
                float f4 = f2 / f;
                buffer = allocate.cropAndScale(0, (rtcVideoFrame.height - ((int) (((float) rtcVideoFrame.stride) * f4))) / 2, rtcVideoFrame.stride, (int) (f4 * ((float) rtcVideoFrame.stride)), i, i2);
            }
            VideoFrame videoFrame = new VideoFrame(buffer, rtcVideoFrame.rotation, rtcVideoFrame.timestamp);
            allocate.release();
            return videoFrame;
        } else if (i3 == 3) {
            NV21Buffer nV21Buffer = new NV21Buffer(rtcVideoFrame.buffer.array(), rtcVideoFrame.stride, rtcVideoFrame.height, null);
            float f5 = (float) i;
            float f6 = (float) i2;
            float f7 = f5 / f6;
            if (((float) rtcVideoFrame.stride) / ((float) rtcVideoFrame.height) >= f7) {
                buffer2 = nV21Buffer.cropAndScale((rtcVideoFrame.stride - ((int) (((float) rtcVideoFrame.height) * f7))) / 2, 0, (int) (f7 * ((float) rtcVideoFrame.height)), rtcVideoFrame.height, i, i2);
            } else {
                float f8 = f6 / f5;
                buffer2 = nV21Buffer.cropAndScale(0, (rtcVideoFrame.height - ((int) (((float) rtcVideoFrame.stride) * f8))) / 2, rtcVideoFrame.stride, (int) (f8 * ((float) rtcVideoFrame.stride)), i, i2);
            }
            VideoFrame videoFrame2 = new VideoFrame(buffer2, rtcVideoFrame.rotation, rtcVideoFrame.timestamp);
            nV21Buffer.release();
            return videoFrame2;
        } else if (i3 == 10 || i3 == 11) {
            return null;
        } else {
            LogUtil.m257133w("VideoFrameConverter", "texture or yuv picture format is not support");
            return null;
        }
    }

    private void updateEglContext(EglBase eglBase, int i, int i2) {
        if (this.mTextureHelper == null) {
            this.mTextureHelper = TextureHelper.create("EGLBaseTextureHelper", eglBase.getEglBaseContext(), i, i2);
            this.glNativeHandle = eglBase.getEglBaseContext().getNativeEglContext();
            LogUtil.m257132i("VideoFrameConverter", "create EglBase texture helper");
        } else if (this.glNativeHandle != eglBase.getEglBaseContext().getNativeEglContext()) {
            this.glNativeHandle = eglBase.getEglBaseContext().getNativeEglContext();
            this.mTextureHelper.dispose();
            this.mTextureHelper = TextureHelper.create("EGLBaseTextureHelper", eglBase.getEglBaseContext(), i, i2);
            LogUtil.m257132i("VideoFrameConverter", "update EglBase nativeHandle:" + this.glNativeHandle + " ,eglContext:" + eglBase);
        }
    }

    public void updateEglContext(EglBase.Context context, int i, int i2) {
        if (this.mTextureHelper == null) {
            this.mTextureHelper = TextureHelper.create("EGLBaseTextureHelper", context, i, i2);
            this.glNativeHandle = context.getNativeEglContext();
            LogUtil.m257132i("VideoFrameConverter", "create EglBase texture helper");
        } else if (this.glNativeHandle != context.getNativeEglContext()) {
            this.glNativeHandle = context.getNativeEglContext();
            this.mTextureHelper.dispose();
            this.mTextureHelper = TextureHelper.create("EGLBaseTextureHelper", context, i, i2);
            LogUtil.m257132i("VideoFrameConverter", "update EglBase nativeHandle:" + this.glNativeHandle + " ,eglContext:" + context);
        }
    }

    /* access modifiers changed from: package-private */
    public VideoFrame allocateVideoFrame(RtcVideoFrame rtcVideoFrame, TextureHelper textureHelper, int i, int i2) {
        Matrix convertMatrixToAndroidGraphicsMatrix = RendererCommon.convertMatrixToAndroidGraphicsMatrix(rtcVideoFrame.transform);
        int i3 = rtcVideoFrame.format;
        if (i3 == 1 || i3 == 3) {
            return allocateVideoFrame(rtcVideoFrame, textureHelper, i, i2, null);
        }
        if (i3 == 10) {
            return new VideoFrame(new TextureBufferImpl(rtcVideoFrame.stride, rtcVideoFrame.height, VideoFrame.TextureBuffer.Type.RGB, rtcVideoFrame.textureId, convertMatrixToAndroidGraphicsMatrix, textureHelper, null).toI420(), rtcVideoFrame.rotation, rtcVideoFrame.timestamp);
        }
        if (i3 == 11) {
            return new VideoFrame(new TextureBufferImpl(rtcVideoFrame.stride, rtcVideoFrame.height, VideoFrame.TextureBuffer.Type.OES, rtcVideoFrame.textureId, convertMatrixToAndroidGraphicsMatrix, textureHelper, null).toI420(), rtcVideoFrame.rotation, rtcVideoFrame.timestamp);
        }
        LogUtil.m257133w("VideoFrameConverter", "texture or yuv picture format is not support");
        return null;
    }

    public VideoFrame allocateVideoFrame(RtcVideoFrame rtcVideoFrame, TextureHelper textureHelper, int i, int i2, Runnable runnable) {
        TextureBufferImpl textureBufferImpl;
        TextureBufferImpl textureBufferImpl2;
        int i3 = rtcVideoFrame.format;
        if (i3 == 1) {
            JavaI420Buffer allocate = JavaI420Buffer.allocate(rtcVideoFrame.stride, rtcVideoFrame.height);
            ByteBuffer dataY = allocate.getDataY();
            ByteBuffer dataU = allocate.getDataU();
            ByteBuffer dataV = allocate.getDataV();
            byte[] array = rtcVideoFrame.buffer.array();
            dataY.put(array, 0, rtcVideoFrame.stride * rtcVideoFrame.height);
            dataU.put(array, rtcVideoFrame.stride * rtcVideoFrame.height, rtcVideoFrame.stride);
            dataV.put(array, (rtcVideoFrame.stride * rtcVideoFrame.height) + rtcVideoFrame.stride, rtcVideoFrame.stride);
            return new VideoFrame(allocate, rtcVideoFrame.rotation, rtcVideoFrame.timestamp);
        } else if (i3 == 3) {
            return new VideoFrame(new NV21Buffer(rtcVideoFrame.buffer.array(), rtcVideoFrame.stride, rtcVideoFrame.height, null), rtcVideoFrame.rotation, rtcVideoFrame.timestamp);
        } else {
            if (i3 == 10) {
                if (((float) rtcVideoFrame.stride) / ((float) rtcVideoFrame.height) >= ((float) i) / ((float) i2)) {
                    textureBufferImpl = new TextureBufferImpl(rtcVideoFrame.stride, rtcVideoFrame.height, VideoFrame.TextureBuffer.Type.RGB, rtcVideoFrame.textureId, RendererCommon.convertMatrixToAndroidGraphicsMatrix(rtcVideoFrame.transform), textureHelper, runnable);
                } else {
                    textureBufferImpl = new TextureBufferImpl(rtcVideoFrame.stride, rtcVideoFrame.height, VideoFrame.TextureBuffer.Type.RGB, rtcVideoFrame.textureId, RendererCommon.convertMatrixToAndroidGraphicsMatrix(rtcVideoFrame.transform), textureHelper, runnable);
                }
                textureBufferImpl.setEglBaseContext(textureHelper.getEglBaseContext());
                VideoFrame videoFrame = new VideoFrame(textureBufferImpl, rtcVideoFrame.rotation, rtcVideoFrame.timestamp);
                textureBufferImpl.release();
                return videoFrame;
            } else if (i3 != 11) {
                LogUtil.m257133w("VideoFrameConverter", "texture or yuv picture format is not support");
                return null;
            } else {
                float f = ((float) i) / ((float) i2);
                if (((float) rtcVideoFrame.stride) / ((float) rtcVideoFrame.height) >= f) {
                    textureBufferImpl2 = new TextureBufferImpl(rtcVideoFrame.stride, rtcVideoFrame.height, VideoFrame.TextureBuffer.Type.OES, rtcVideoFrame.textureId, RendererCommon.convertMatrixToAndroidGraphicsMatrix(rtcVideoFrame.transform), textureHelper, runnable);
                } else {
                    textureBufferImpl2 = new TextureBufferImpl(rtcVideoFrame.stride, rtcVideoFrame.height, VideoFrame.TextureBuffer.Type.RGB, rtcVideoFrame.textureId, RendererCommon.convertMatrixToAndroidGraphicsMatrix(rtcVideoFrame.transform), textureHelper, runnable);
                }
                VideoFrame.Buffer cropAndScale = textureBufferImpl2.cropAndScale((rtcVideoFrame.stride - ((int) (((float) rtcVideoFrame.height) * f))) / 2, 0, (int) (f * ((float) rtcVideoFrame.height)), rtcVideoFrame.height, i, i2);
                ((TextureBufferImpl) cropAndScale).setEglBaseContext(textureHelper.getEglBaseContext());
                VideoFrame videoFrame2 = new VideoFrame(cropAndScale, rtcVideoFrame.rotation, rtcVideoFrame.timestamp);
                textureBufferImpl2.release();
                return videoFrame2;
            }
        }
    }
}
