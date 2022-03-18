package com.ss.video.rtc.engine;

import android.content.Context;
import android.util.Log;
import com.ss.video.rtc.base.utils.RtcContextUtils;
import com.ss.video.rtc.engine.RtcEngineImpl.C65562RtcEngineImpl;
import com.ss.video.rtc.engine.handler.IRtcEngineAudioDeviceEventHandler;
import com.ss.video.rtc.engine.utils.TextureHelper;
import com.ss.video.rtc.engine.utils.VideoFrameConverter;
import java.lang.ref.WeakReference;
import javax.microedition.khronos.egl.EGLContext;
import org.webrtc.EglBase;

public class RtcSharedContext {
    private static String mPackageName;
    private static EglBase mRootEglBase;
    private static WeakReference<IRtcEngineAudioDeviceEventHandler> mRtcEngineAudioDeviceHandler;
    private static VideoFrameConverter mVideoFrameConverter;
    private static RtcHttpClient nativeHttpClient;

    public static EglBase getEGLContext() {
        return mRootEglBase;
    }

    public static VideoFrameConverter getVideoFrameConverter() {
        return mVideoFrameConverter;
    }

    public static Context getApplicationContext() {
        return RtcContextUtils.getApplicationContext();
    }

    public static String getRtcPackageName() {
        String str = mPackageName;
        if (str != null) {
            return str;
        }
        return "";
    }

    public static TextureHelper getTextureHelper() {
        return mVideoFrameConverter.getTextureHelper();
    }

    public static IRtcEngineAudioDeviceEventHandler getRtcEngineAudioDeviceEventHandler() {
        return mRtcEngineAudioDeviceHandler.get();
    }

    public static void releaseEglContext() {
        EglBase eglBase = mRootEglBase;
        if (eglBase != null) {
            eglBase.release();
            mRootEglBase = null;
        }
    }

    public static long getNativeEGLContext() {
        TextureHelper textureHelper = getTextureHelper();
        if (textureHelper != null) {
            return textureHelper.getNativeEglContext();
        }
        EglBase eglBase = mRootEglBase;
        if (eglBase != null) {
            return eglBase.getEglBaseContext().getNativeEglContext();
        }
        return 0;
    }

    public static void initialize(Context context) {
        RtcContextUtils.initialize(context);
        mPackageName = context.getPackageName();
    }

    public static synchronized boolean setAudioDeviceEventHandler(IRtcEngineAudioDeviceEventHandler iRtcEngineAudioDeviceEventHandler) {
        synchronized (RtcSharedContext.class) {
            mRtcEngineAudioDeviceHandler = new WeakReference<>(iRtcEngineAudioDeviceEventHandler);
        }
        return true;
    }

    public static synchronized void setHttpClient(RtcHttpClient rtcHttpClient) {
        synchronized (RtcSharedContext.class) {
            nativeHttpClient = rtcHttpClient;
        }
    }

    public static synchronized void setRootEglBase(EglBase eglBase) {
        synchronized (RtcSharedContext.class) {
            mRootEglBase = eglBase;
        }
    }

    public static synchronized void setVideoFrameConverter(VideoFrameConverter videoFrameConverter) {
        synchronized (RtcSharedContext.class) {
            mVideoFrameConverter = videoFrameConverter;
        }
    }

    public static boolean initEglContext(Object obj) {
        if (obj == null) {
            mRootEglBase = EglBase.CC.create();
            return false;
        } else if (obj instanceof EGLContext) {
            mRootEglBase = EglBase.CC.createEgl10((EGLContext) obj, EglBase.CONFIG_PLAIN);
            return true;
        } else if (obj instanceof android.opengl.EGLContext) {
            mRootEglBase = EglBase.CC.createEgl14((android.opengl.EGLContext) obj, EglBase.CONFIG_PLAIN);
            return true;
        } else if (obj instanceof EglBase) {
            mRootEglBase = EglBase.CC.create(((EglBase) obj).getEglBaseContext(), EglBase.CONFIG_PLAIN);
            return true;
        } else {
            mRootEglBase = EglBase.CC.create();
            return true;
        }
    }

    public static void httpGetAsync(String str, int i, int i2, int i3) {
        if (nativeHttpClient == null) {
            Log.d("bytertc", "native http client has not been init!");
            return;
        }
        C65562RtcEngineImpl.RtcHttpCallbackImpl rtcHttpCallbackImpl = new C65562RtcEngineImpl.RtcHttpCallbackImpl();
        rtcHttpCallbackImpl.setCallbackId(i2);
        rtcHttpCallbackImpl.setClientId(i3);
        nativeHttpClient.GetAsync(str, rtcHttpCallbackImpl, i);
    }

    public static void httpPostAsync(String str, String str2, int i, int i2, int i3) {
        if (nativeHttpClient == null) {
            Log.d("bytertc", "native http client has not been init!");
            return;
        }
        Log.d("bytertc", "http in java called, callback Id: " + i2);
        C65562RtcEngineImpl.RtcHttpCallbackImpl rtcHttpCallbackImpl = new C65562RtcEngineImpl.RtcHttpCallbackImpl();
        rtcHttpCallbackImpl.setCallbackId(i2);
        rtcHttpCallbackImpl.setClientId(i3);
        nativeHttpClient.PostAsync(str, str2, rtcHttpCallbackImpl, i);
    }
}
