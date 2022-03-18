package com.ss.video.rtc.engine.RtcEngineImpl;

import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.C1711a;
import com.bytedance.platform.godzilla.thread.C20339a;
import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.video.rtc.base.utils.NetworkUtils;
import com.ss.video.rtc.base.utils.RtcContextUtils;
import com.ss.video.rtc.engine.ByteRtcAudioDeviceManager;
import com.ss.video.rtc.engine.IAudioFrameObserver;
import com.ss.video.rtc.engine.IMetadataObserver;
import com.ss.video.rtc.engine.IRtcAudioDeviceManager;
import com.ss.video.rtc.engine.IRtcRoom;
import com.ss.video.rtc.engine.InternalScreenSharingParams;
import com.ss.video.rtc.engine.InternalVideoStreamDescription;
import com.ss.video.rtc.engine.NativeFunctions;
import com.ss.video.rtc.engine.PublisherConfiguration;
import com.ss.video.rtc.engine.RtcEngine;
import com.ss.video.rtc.engine.RtcEngineEx;
import com.ss.video.rtc.engine.RtcHttpClient;
import com.ss.video.rtc.engine.RtcRoom;
import com.ss.video.rtc.engine.RtcSharedContext;
import com.ss.video.rtc.engine.SubscribeConfig;
import com.ss.video.rtc.engine.VideoCanvas;
import com.ss.video.rtc.engine.VideoStreamDescription;
import com.ss.video.rtc.engine.adapter.VideoSinkAdapter;
import com.ss.video.rtc.engine.adapter.VideoSinkTask;
import com.ss.video.rtc.engine.data.ByteRtcData;
import com.ss.video.rtc.engine.handler.ByteRtcAudioDeviceEventHandler;
import com.ss.video.rtc.engine.handler.ByteRtcAudioFrameObserver;
import com.ss.video.rtc.engine.handler.ByteRtcEngineEncryptHandler;
import com.ss.video.rtc.engine.handler.ByteRtcEngineEventHandler;
import com.ss.video.rtc.engine.handler.ByteRtcEngineInternalEventHandler;
import com.ss.video.rtc.engine.handler.ByteRtcMetadataObserver;
import com.ss.video.rtc.engine.handler.ByteRtcVideoFrameObserver;
import com.ss.video.rtc.engine.handler.EngineAudioDeviceEventHandler;
import com.ss.video.rtc.engine.handler.IRtcEngineAudioDeviceEventHandler;
import com.ss.video.rtc.engine.handler.IRtcEngineEventHandler;
import com.ss.video.rtc.engine.handler.IRtcEngineInternalEventHandler;
import com.ss.video.rtc.engine.live.LiveTranscoding;
import com.ss.video.rtc.engine.loader.RtcNativeLibraryListenerImpl;
import com.ss.video.rtc.engine.loader.RtcNativeLibraryLoaderListener;
import com.ss.video.rtc.engine.mediaio.IVideoSink;
import com.ss.video.rtc.engine.mediaio.RtcVideoFrame;
import com.ss.video.rtc.engine.utils.AppMonitor;
import com.ss.video.rtc.engine.utils.LogUtil;
import com.ss.video.rtc.engine.utils.VideoFrameConverter;
import com.ss.video.rtc.engine.video.ScreenSharingParameters;
import com.ss.video.rtc.engine.video.VideoEncoderConfiguration;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import javax.microedition.khronos.egl.EGLContext;
import org.json.JSONException;
import org.json.JSONObject;
import org.webrtc.EglBase;
import org.webrtc.ThreadUtils;
import org.webrtc.VideoFrame;

/* renamed from: com.ss.video.rtc.engine.RtcEngineImpl.RtcEngineImpl */
public final class C65562RtcEngineImpl extends RtcEngineEx {
    private static ByteRtcAudioDeviceManager mAudioDeviceManager = null;
    private static WeakReference<IRtcAudioDeviceManager.IRtcAudioDeviceEventHandler> mAudioDeviceManagerEventHandler;
    private static ByteRtcAudioDeviceEventHandler mByteAudioDeviceManagerEventHandler = null;
    private static String mDeviceId = "";
    private static boolean mLibraryLoaded;
    private static RtcNativeLibraryLoaderListener mRtcNativeLibraryListener = new RtcNativeLibraryListenerImpl();
    private static C65562RtcEngineImpl sRtcEngineInstance;
    private AppMonitor.Callback appStateCallback = new AppMonitor.Callback() {
        /* class com.ss.video.rtc.engine.RtcEngineImpl.$$Lambda$RtcEngineImpl$6jJ1aiFilT1ajOC64eOshvaqbIg */

        @Override // com.ss.video.rtc.engine.utils.AppMonitor.Callback
        public final void callback(int i) {
            C65562RtcEngineImpl.this.lambda$new$1$RtcEngineImpl(i);
        }
    };
    private boolean isMultiRoom;
    private String mAppId;
    private boolean mAudioEnabled = true;
    private WeakReference<IAudioFrameObserver> mAudioFrameObserver;
    private ByteRtcAudioFrameObserver mByteRtcAudioFrameObserver;
    private ByteRtcMetadataObserver mByteRtcMetadataObserver;
    private ByteRtcVideoFrameObserver mByteRtcVideoFrameObserver;
    private int mChannelProfile;
    private int mClientRole = 3;
    private Context mContext;
    private Handler mEglHandler;
    private HandlerThread mEglThread;
    private boolean mEnableTranscode;
    private EngineAudioDeviceEventHandler mEngineAudioDeviceEventHandler;
    private ByteRtcEngineEventHandler mEngineEventHandler;
    private ByteRtcEngineInternalEventHandler mEngineInternalEventHandler;
    private boolean mIsFront = true;
    private boolean mIsUseCustomEglEnv;
    private boolean mIsVideoMirror = true;
    private LiveTranscoding mLiveTranscoding;
    private LogUtil.LoggerSink mLoggerSink = new LogUtil.LoggerSink() {
        /* class com.ss.video.rtc.engine.RtcEngineImpl.$$Lambda$RtcEngineImpl$BmD8RJV8FTgWuxCBICFpTpMEXE */

        @Override // com.ss.video.rtc.engine.utils.LogUtil.LoggerSink
        public final void onLoggerMessage(IRtcEngineEventHandler.RtcLogLevel rtcLogLevel, String str, Throwable th) {
            C65562RtcEngineImpl.this.lambda$new$0$RtcEngineImpl(rtcLogLevel, str, th);
        }
    };
    private WeakReference<IMetadataObserver> mMetadataObserver;
    private long mNativeByteRtcEngine = -1;
    private Runnable mOnDestroyCompletedCallback;
    private boolean mPushMode = true;
    private boolean mRequestSoftwareEncoder;
    private String mRoom;
    private WeakReference<IRtcEngineEventHandler> mRtcEngineHandler;
    private VideoFrameConverter mScreenFrameConverter;
    private String mSessionId;
    private State mState;
    private String mToken;
    private boolean mUseExtTexture;
    private boolean mUseExtVideoSource;
    private String mUser;
    private boolean mVideoEnabled = true;
    private VideoFrameConverter mVideoFrameConverter;
    private VideoSinkTask mVideoSinkTask;

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.video.rtc.engine.RtcEngineImpl.RtcEngineImpl$State */
    public enum State {
        IDLE,
        IN_ROOM,
        DESTORY
    }

    public static HandlerThread new_android_os_HandlerThread_by_knot(String str) {
        return C20341a.m74147a() ? C20339a.m74145a(str, 0, C20341a.f49621b) : new HandlerThread(str);
    }

    @Override // com.ss.video.rtc.engine.RtcEngine
    public int replaceBackground(RtcEngine.BackgroundMode backgroundMode, RtcEngine.DivideModel divideModel) {
        return 0;
    }

    /* renamed from: com.ss.video.rtc.engine.RtcEngineImpl.RtcEngineImpl$RtcHttpCallbackImpl */
    public static class RtcHttpCallbackImpl implements RtcHttpClient.RtcHttpCallback {
        private int callbackId;
        private int clientId;

        public int getCallbackId() {
            return this.callbackId;
        }

        public void setCallbackId(int i) {
            this.callbackId = i;
        }

        public void setClientId(int i) {
            this.clientId = i;
        }

        @Override // com.ss.video.rtc.engine.RtcHttpClient.RtcHttpCallback
        public void run(int i, String str) {
            NativeFunctions.nativeHttpClientCallback(this.callbackId, this.clientId, i, str);
        }
    }

    public String getLocalUser() {
        return this.mUser;
    }

    public String getRoomName() {
        return this.mRoom;
    }

    public VideoSinkTask getVideoSinkTask() {
        return this.mVideoSinkTask;
    }

    @Override // com.ss.video.rtc.engine.RtcEngine
    public int getAudioMixingStreamCachedFrameNum() {
        return NativeFunctions.nativeGetAudioMixingStreamCachedFrameNum(this.mNativeByteRtcEngine);
    }

    @Override // com.ss.video.rtc.engine.RtcEngine
    public IRtcEngineInternalEventHandler getRtcEngineInternalEventHandler() {
        return this.mEngineInternalEventHandler.getRtcEngineInternalEventHandler();
    }

    @Override // com.ss.video.rtc.engine.RtcEngine
    public boolean isLocalVideoMirrorOn() {
        return NativeFunctions.nativeIsMirror(this.mNativeByteRtcEngine);
    }

    public /* synthetic */ void lambda$doDestroy$3$RtcEngineImpl() {
        Runnable runnable = this.mOnDestroyCompletedCallback;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // com.ss.video.rtc.engine.RtcEngine
    public int stopScreenSharing() {
        return NativeFunctions.nativeStopScreenSharing(this.mNativeByteRtcEngine);
    }

    public static IRtcAudioDeviceManager.IRtcAudioDeviceEventHandler getAudioDeviceManagerEvent() {
        return mAudioDeviceManagerEventHandler.get();
    }

    public static String getSDKVersion() {
        if (!mLibraryLoaded) {
            return "";
        }
        return NativeFunctions.nativeGetSDKVersion();
    }

    public IAudioFrameObserver getAudioFrameObserver() {
        return this.mAudioFrameObserver.get();
    }

    public IMetadataObserver getMetadataObserver() {
        return this.mMetadataObserver.get();
    }

    public IRtcEngineEventHandler getRtcEngineHandler() {
        return this.mRtcEngineHandler.get();
    }

    @Override // com.ss.video.rtc.engine.RtcEngine
    public void disableLiveTranscoding() {
        LogUtil.m257129d("RtcEngineImpl", "disableLiveTranscoding...");
        this.mEnableTranscode = false;
        long j = this.mNativeByteRtcEngine;
        if (j == -1) {
            LogUtil.m257130e("RtcEngineImpl", "native engine is invalid, disableLiveTranscoding failed.");
        } else {
            NativeFunctions.nativeDisableLiveTranscoding(j);
        }
    }

    @Override // com.ss.video.rtc.engine.RtcEngine
    public int getAudioMixingCurrentPosition() {
        long j = this.mNativeByteRtcEngine;
        if (j != -1) {
            return NativeFunctions.nativeGetAudioMixingCurrentPosition(j);
        }
        LogUtil.m257130e("RtcEngineImpl", "native engine is invalid, getAudioMixingCurrentPosition failed.");
        return -1;
    }

    @Override // com.ss.video.rtc.engine.RtcEngine
    public int getAudioMixingDuration() {
        long j = this.mNativeByteRtcEngine;
        if (j != -1) {
            return NativeFunctions.nativeGetAudioMixingDuration(j);
        }
        LogUtil.m257130e("RtcEngineImpl", "native engine is invalid, getAudioMixingDuration failed.");
        return -1;
    }

    @Override // com.ss.video.rtc.engine.RtcEngine
    public boolean isSpeakerphoneEnabled() {
        Context context = this.mContext;
        if (context == null) {
            return false;
        }
        return ((AudioManager) context.getSystemService("audio")).isSpeakerphoneOn();
    }

    @Override // com.ss.video.rtc.engine.RtcEngine
    public int pauseAllEffects() {
        long j = this.mNativeByteRtcEngine;
        if (j != -1) {
            return NativeFunctions.nativePauseAllEffects(j);
        }
        LogUtil.m257130e("RtcEngineImpl", "native engine is invalid, pauseAllEffects failed.");
        return -1;
    }

    @Override // com.ss.video.rtc.engine.RtcEngine
    public int pauseAudioMixing() {
        long j = this.mNativeByteRtcEngine;
        if (j != -1) {
            return NativeFunctions.nativePauseAudioMixing(j);
        }
        LogUtil.m257130e("RtcEngineImpl", "native engine is invalid, pauseAudioMixing failed.");
        return -1;
    }

    @Override // com.ss.video.rtc.engine.RtcEngine
    public int publishScreen() {
        long j = this.mNativeByteRtcEngine;
        if (j != -1) {
            return NativeFunctions.nativePublishScreen(j);
        }
        LogUtil.m257130e("RtcEngineImpl", "native engine is invalid, publishScreen failed.");
        return -1;
    }

    @Override // com.ss.video.rtc.engine.RtcEngine
    public int resumeAllEffects() {
        long j = this.mNativeByteRtcEngine;
        if (j != -1) {
            return NativeFunctions.nativeResumeAllEffects(j);
        }
        LogUtil.m257130e("RtcEngineImpl", "native engine is invalid, resumeAllEffects failed.");
        return -1;
    }

    @Override // com.ss.video.rtc.engine.RtcEngine
    public int resumeAudioMixing() {
        long j = this.mNativeByteRtcEngine;
        if (j != -1) {
            return NativeFunctions.nativeResumeAudioMixing(j);
        }
        LogUtil.m257130e("RtcEngineImpl", "native engine is invalid, resumeAudioMixing failed.");
        return -1;
    }

    @Override // com.ss.video.rtc.engine.RtcEngine
    public int startPreview() {
        LogUtil.m257129d("RtcEngineImpl", "startPreview.");
        long j = this.mNativeByteRtcEngine;
        if (j == -1) {
            LogUtil.m257130e("RtcEngineImpl", "native engine is invalid, startPreview failed.");
            return -1;
        }
        NativeFunctions.nativeStartPreview(j);
        return 0;
    }

    @Override // com.ss.video.rtc.engine.RtcEngine
    public int stopAllEffects() {
        long j = this.mNativeByteRtcEngine;
        if (j != -1) {
            return NativeFunctions.nativeStopAllEffects(j);
        }
        LogUtil.m257130e("RtcEngineImpl", "native engine is invalid, stopAllEffects failed.");
        return -1;
    }

    @Override // com.ss.video.rtc.engine.RtcEngine
    public int stopAudioMixing() {
        long j = this.mNativeByteRtcEngine;
        if (j == -1) {
            LogUtil.m257130e("RtcEngineImpl", "native engine is invalid, stopAudioMixing failed.");
            return -1;
        }
        NativeFunctions.nativeStopAudioMixing(j);
        return 0;
    }

    @Override // com.ss.video.rtc.engine.RtcEngine
    public void stopCloudRendering() {
        String cloudRenderingInfo = getCloudRenderingInfo("stopped", "");
        if (cloudRenderingInfo != null) {
            NativeFunctions.nativeUpdateCloudRending(this.mNativeByteRtcEngine, cloudRenderingInfo);
        }
    }

    @Override // com.ss.video.rtc.engine.RtcEngine
    public int stopPreview() {
        LogUtil.m257129d("RtcEngineImpl", "stopPreview.");
        long j = this.mNativeByteRtcEngine;
        if (j == -1) {
            LogUtil.m257130e("RtcEngineImpl", "native engine is invalid, stopPreview failed.");
            return -1;
        }
        NativeFunctions.nativeStopPreview(j);
        return 0;
    }

    @Override // com.ss.video.rtc.engine.RtcEngine
    public int unloadAllEffects() {
        long j = this.mNativeByteRtcEngine;
        if (j != -1) {
            return NativeFunctions.nativeUnloadAllEffects(j);
        }
        LogUtil.m257130e("RtcEngineImpl", "native engine is invalid, unloadAllEffects failed.");
        return -1;
    }

    @Override // com.ss.video.rtc.engine.RtcEngine
    public int unpublishScreen() {
        long j = this.mNativeByteRtcEngine;
        if (j != -1) {
            return NativeFunctions.nativeUnpublishScreen(j);
        }
        LogUtil.m257130e("RtcEngineImpl", "native engine is invalid, unpublishScreen failed.");
        return -1;
    }

    @Override // com.ss.video.rtc.engine.RtcEngine
    public int leaveChannel() {
        IRtcEngineEventHandler iRtcEngineEventHandler;
        LogUtil.m257129d("RtcEngineImpl", "leaveChannel");
        if (this.mNativeByteRtcEngine == -1) {
            LogUtil.m257130e("RtcEngineImpl", "native engine is invalid, leaveChannel failed.");
            return -1;
        }
        this.mState = State.IDLE;
        this.mRoom = "";
        this.mUser = "";
        this.mSessionId = "";
        this.mToken = "";
        WeakReference<IRtcEngineEventHandler> weakReference = this.mRtcEngineHandler;
        if (weakReference == null) {
            iRtcEngineEventHandler = null;
        } else {
            iRtcEngineEventHandler = weakReference.get();
        }
        if (iRtcEngineEventHandler != null) {
            iRtcEngineEventHandler.onLeaveChannel(null);
        }
        NativeFunctions.nativeLeaveChannel(this.mNativeByteRtcEngine);
        return 0;
    }

    @Override // com.ss.video.rtc.engine.RtcEngine
    public int switchCamera() {
        LogUtil.m257129d("RtcEngineImpl", "switchCamera");
        long j = this.mNativeByteRtcEngine;
        if (j == -1) {
            LogUtil.m257130e("RtcEngineImpl", "native engine is invalid, switchCamera failed.");
            return -1;
        }
        NativeFunctions.nativeSwitchCamera(j);
        boolean z = true;
        boolean z2 = !this.mIsFront;
        this.mIsFront = z2;
        long j2 = this.mNativeByteRtcEngine;
        if (!this.mIsVideoMirror || !z2) {
            z = false;
        }
        NativeFunctions.nativeSetLocalVideoMirrorMode(j2, z);
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.video.rtc.engine.RtcEngineImpl.RtcEngineImpl$1 */
    public static /* synthetic */ class C655631 {
        static final /* synthetic */ int[] $SwitchMap$com$ss$video$rtc$engine$RtcEngine$ByteRtcEnv;
        static final /* synthetic */ int[] $SwitchMap$com$ss$video$rtc$engine$RtcEngine$CHANNEL_PROFILE_TYPE;
        static final /* synthetic */ int[] $SwitchMap$com$ss$video$rtc$engine$RtcEngine$CLIENT_ROLE_TYPE;

        /* JADX WARNING: Can't wrap try/catch for region: R(19:0|(2:1|2)|3|(2:5|6)|7|9|10|(2:11|12)|13|15|16|17|18|19|21|22|23|24|(3:25|26|28)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(21:0|(2:1|2)|3|5|6|7|9|10|11|12|13|15|16|17|18|19|21|22|23|24|(3:25|26|28)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0043 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x005f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0069 */
        static {
            /*
            // Method dump skipped, instructions count: 116
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.video.rtc.engine.RtcEngineImpl.C65562RtcEngineImpl.C655631.<clinit>():void");
        }
    }

    private static void loadSoFile() {
        if (mLibraryLoaded) {
            mRtcNativeLibraryListener.onLoadAlready("bytertc");
        } else if (mRtcNativeLibraryLoader != null) {
            mLibraryLoaded = true;
            boolean load = mRtcNativeLibraryLoader.load("byteaudio") & true;
            mLibraryLoaded = load;
            boolean load2 = load & mRtcNativeLibraryLoader.load("bytertc");
            mLibraryLoaded = load2;
            if (load2) {
                mRtcNativeLibraryListener.onLoadSuccess("bytertc");
            } else {
                mRtcNativeLibraryListener.onLoadError("bytertc");
            }
        } else {
            try {
                C1711a.m7628a("byteaudio");
                C1711a.m7628a("bytertc");
                mLibraryLoaded = true;
                mRtcNativeLibraryListener.onLoadSuccess("bytertc");
            } catch (UnsatisfiedLinkError e) {
                LogUtil.m257131e("RtcEngineImpl", "Failed to load native library: bytertc", e);
                mRtcNativeLibraryListener.onLoadError("bytertc");
            }
        }
    }

    public void doDestroy() {
        LogUtil.m257129d("RtcEngineImpl", "destroy RtcEngineImpl.");
        if (this.mNativeByteRtcEngine == -1) {
            LogUtil.m257130e("RtcEngineImpl", "native engine is invalid, no need to destroy now.");
            return;
        }
        this.mState = State.DESTORY;
        NetworkUtils.unregisterReceiver(this.mContext);
        NativeFunctions.nativeDestroyByteRtcEngine(this.mNativeByteRtcEngine);
        this.mNativeByteRtcEngine = -1;
        this.mIsFront = true;
        this.mIsVideoMirror = true;
        RtcSharedContext.setVideoFrameConverter(null);
        this.mVideoFrameConverter.dispose();
        this.mVideoFrameConverter = null;
        this.mScreenFrameConverter.dispose();
        this.mScreenFrameConverter = null;
        new Handler(Looper.getMainLooper()).post(new Runnable() {
            /* class com.ss.video.rtc.engine.RtcEngineImpl.$$Lambda$RtcEngineImpl$eXKp2KU3_9UsB4EGZuuygVRE13Q */

            public final void run() {
                C65562RtcEngineImpl.this.lambda$doDestroy$3$RtcEngineImpl();
            }
        });
        ThreadUtils.invokeAtFrontUninterruptibly(this.mEglHandler, $$Lambda$RtcEngineImpl$dyE3BmkrPPR6NpLLpuStuM0d2iQ.INSTANCE);
        this.mEglThread.quit();
        AppMonitor.get(this.mContext).unRegister(this.appStateCallback).release(this.mContext);
        VideoSinkTask videoSinkTask = this.mVideoSinkTask;
        if (videoSinkTask != null) {
            videoSinkTask.exit();
        }
        LogUtil.setLoggerSink(null);
    }

    public static void SetNetworkType(int i) {
        NativeFunctions.nativeSetNetworkType(i);
    }

    @Override // com.ss.video.rtc.engine.RtcEngine
    public void setLogFilter(IRtcEngineEventHandler.RtcLogLevel rtcLogLevel) {
        LogUtil.setLogLevel(rtcLogLevel);
    }

    @Override // com.ss.video.rtc.engine.RtcEngine
    public void setOnDestroyCompletedCallback(Runnable runnable) {
        this.mOnDestroyCompletedCallback = runnable;
    }

    @Override // com.ss.video.rtc.engine.RtcEngine
    public int EnableRangeAudio(boolean z) {
        return NativeFunctions.nativeEnableRangeAudio(this.mNativeByteRtcEngine, z);
    }

    @Override // com.ss.video.rtc.engine.RtcEngine
    public int SetTeamId(String str) {
        return NativeFunctions.nativeSetTeamId(this.mNativeByteRtcEngine, str);
    }

    @Override // com.ss.video.rtc.engine.RtcEngine
    public int enableVideoEffect(boolean z) {
        return NativeFunctions.nativeEnableVideoEffect(this.mNativeByteRtcEngine, z);
    }

    public /* synthetic */ void lambda$new$2$RtcEngineImpl(Object obj) {
        this.mIsUseCustomEglEnv = RtcSharedContext.initEglContext(obj);
    }

    @Override // com.ss.video.rtc.engine.RtcEngine
    public boolean pushExternalVideoFrame(RtcVideoFrame rtcVideoFrame) {
        return pushExternalVideoFrame(rtcVideoFrame, this.mIsUseCustomEglEnv);
    }

    @Override // com.ss.video.rtc.engine.RtcEngine
    public boolean setAudioDeviceEventHandler(IRtcEngineAudioDeviceEventHandler iRtcEngineAudioDeviceEventHandler) {
        return RtcSharedContext.setAudioDeviceEventHandler(iRtcEngineAudioDeviceEventHandler);
    }

    @Override // com.ss.video.rtc.engine.RtcEngine
    public int setBusinessId(String str) {
        return NativeFunctions.nativeSetBusinessId(this.mNativeByteRtcEngine, str);
    }

    @Override // com.ss.video.rtc.engine.RtcEngine
    public void setCustomizeEncryptHandler(ByteRtcEngineEncryptHandler byteRtcEngineEncryptHandler) {
        NativeFunctions.nativeSetCustomizeEncryptHandler(this.mNativeByteRtcEngine, byteRtcEngineEncryptHandler);
    }

    @Override // com.ss.video.rtc.engine.RtcEngine
    public void setRtcEngineInternalEventHandler(IRtcEngineInternalEventHandler iRtcEngineInternalEventHandler) {
        this.mEngineInternalEventHandler.setRtcEngineInternalEventHandler(iRtcEngineInternalEventHandler);
    }

    @Override // com.ss.video.rtc.engine.RtcEngine
    public void setVideoEffectAlgoModelPath(String str) {
        NativeFunctions.nativeInitVideoEffect(this.mNativeByteRtcEngine, str);
    }

    @Override // com.ss.video.rtc.engine.RtcEngine
    public void setVideoEffectColorFilter(String str) {
        NativeFunctions.nativeSetVideoEffectColorFilter(this.mNativeByteRtcEngine, str);
    }

    @Override // com.ss.video.rtc.engine.RtcEngine
    public void setVideoEffectColorFilterIntensity(float f) {
        NativeFunctions.nativeSetVideoEffectColorFilterIntensity(this.mNativeByteRtcEngine, f);
    }

    @Override // com.ss.video.rtc.engine.RtcEngine
    public int setVideoProfiles(VideoStreamDescription[] videoStreamDescriptionArr) {
        return setVideoProfiles(videoStreamDescriptionArr, VideoEncoderConfiguration.ORIENTATION_MODE.ORIENTATION_MODE_ADAPTIVE);
    }

    public static void enablePerformanceCollect(boolean z) {
        if (mLibraryLoaded) {
            NativeFunctions.nativeEnablePerformanceCollect(z);
        }
    }

    public static String getErrorDescription(int i) {
        if (i != -1072) {
            return NativeFunctions.nativeGetErrorDescription(i);
        }
        return "Failed to load library.";
    }

    public static int setDeviceId(String str) {
        if (str == null) {
            return -1;
        }
        mDeviceId = str;
        if (!mLibraryLoaded) {
            return -1;
        }
        return NativeFunctions.nativeSetDeviceId(str);
    }

    public static void setRtcHttpClient(RtcHttpClient rtcHttpClient) {
        if (mLibraryLoaded) {
            RtcSharedContext.setHttpClient(rtcHttpClient);
            NativeFunctions.nativeSetUpperHttpClient(true);
        }
    }

    @Override // com.ss.video.rtc.engine.RtcEngine
    public void SetAudioPerfProfile(RtcEngine.AudioPerfProfile audioPerfProfile) {
        NativeFunctions.nativeSetAudioPerfProfile(this.mNativeByteRtcEngine, audioPerfProfile.value());
    }

    @Override // com.ss.video.rtc.engine.RtcEngine
    public int SetAudioRecvMode(RtcEngine.RangeAudioMode rangeAudioMode) {
        return NativeFunctions.nativeSetAudioRecvMode(this.mNativeByteRtcEngine, rangeAudioMode.value());
    }

    @Override // com.ss.video.rtc.engine.RtcEngine
    public int SetAudioSendMode(RtcEngine.RangeAudioMode rangeAudioMode) {
        return NativeFunctions.nativeSetAudioSendMode(this.mNativeByteRtcEngine, rangeAudioMode.value());
    }

    @Override // com.ss.video.rtc.engine.RtcEngine
    public int SetRtcMode(RtcEngine.RtcMode rtcMode) {
        return NativeFunctions.nativeSetRtcMode(this.mNativeByteRtcEngine, rtcMode.value());
    }

    @Override // com.ss.video.rtc.engine.RtcEngine
    public void SetRuntimeParameters(JSONObject jSONObject) {
        String str;
        long j = this.mNativeByteRtcEngine;
        if (jSONObject == null) {
            str = "";
        } else {
            str = jSONObject.toString();
        }
        NativeFunctions.nativeSetRuntimeParameters(j, str);
    }

    @Override // com.ss.video.rtc.engine.RtcEngine
    public void addVideoEffectPath(List<String> list) {
        String[] strArr = new String[list.size()];
        list.toArray(strArr);
        NativeFunctions.nativeAddVideoEffectPath(this.mNativeByteRtcEngine, strArr);
    }

    public /* synthetic */ void lambda$new$1$RtcEngineImpl(int i) {
        String str;
        long j = this.mNativeByteRtcEngine;
        if (i == 1) {
            str = "active";
        } else {
            str = "background";
        }
        NativeFunctions.nativeSetAppState(j, str);
    }

    @Override // com.ss.video.rtc.engine.RtcEngine
    public void removeVideoEffectPath(List<String> list) {
        String[] strArr = new String[list.size()];
        list.toArray(strArr);
        NativeFunctions.nativeRemoveVideoEffectPath(this.mNativeByteRtcEngine, strArr);
    }

    @Override // com.ss.video.rtc.engine.RtcEngine
    public void setRtcEngineEventHandler(IRtcEngineEventHandler iRtcEngineEventHandler) {
        LogUtil.m257129d("RtcEngineImpl", "setRtcEngineEventHandler");
        this.mRtcEngineHandler = new WeakReference<>(iRtcEngineEventHandler);
    }

    @Override // com.ss.video.rtc.engine.RtcEngine
    public void setVideoEffectPath(List<String> list) {
        String[] strArr = new String[list.size()];
        list.toArray(strArr);
        NativeFunctions.nativeSetVideoEffectPath(this.mNativeByteRtcEngine, strArr);
    }

    @Override // com.ss.video.rtc.engine.RtcEngine
    public void startCloudRendering(String str) {
        String cloudRenderingInfo = getCloudRenderingInfo("started", str);
        if (cloudRenderingInfo != null) {
            NativeFunctions.nativeUpdateCloudRending(this.mNativeByteRtcEngine, cloudRenderingInfo);
        }
    }

    @Override // com.ss.video.rtc.engine.RtcEngine
    public void updateCloudRendering(String str) {
        String cloudRenderingInfo = getCloudRenderingInfo("changed", str);
        if (cloudRenderingInfo != null) {
            NativeFunctions.nativeUpdateCloudRending(this.mNativeByteRtcEngine, cloudRenderingInfo);
        }
    }

    @Override // com.ss.video.rtc.engine.RtcEngine
    public int updateScreenSharingParameters(ScreenSharingParameters screenSharingParameters) {
        return NativeFunctions.nativeUpdateScreenSharingParameters(this.mNativeByteRtcEngine, new InternalScreenSharingParams(screenSharingParameters));
    }

    public static IRtcAudioDeviceManager createAudioDeviceManager(IRtcAudioDeviceManager.IRtcAudioDeviceEventHandler iRtcAudioDeviceEventHandler) {
        mAudioDeviceManagerEventHandler = new WeakReference<>(iRtcAudioDeviceEventHandler);
        ByteRtcAudioDeviceManager byteRtcAudioDeviceManager = mAudioDeviceManager;
        if (byteRtcAudioDeviceManager != null) {
            return byteRtcAudioDeviceManager;
        }
        ByteRtcAudioDeviceEventHandler byteRtcAudioDeviceEventHandler = new ByteRtcAudioDeviceEventHandler();
        mByteAudioDeviceManagerEventHandler = byteRtcAudioDeviceEventHandler;
        ByteRtcAudioDeviceManager byteRtcAudioDeviceManager2 = new ByteRtcAudioDeviceManager(byteRtcAudioDeviceEventHandler);
        mAudioDeviceManager = byteRtcAudioDeviceManager2;
        return byteRtcAudioDeviceManager2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0016, code lost:
        if (r3 != 3) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int setEnv(com.ss.video.rtc.engine.RtcEngine.ByteRtcEnv r3) {
        /*
            boolean r0 = com.ss.video.rtc.engine.RtcEngineImpl.C65562RtcEngineImpl.mLibraryLoaded
            if (r0 != 0) goto L_0x0006
            r3 = -1
            return r3
        L_0x0006:
            int[] r0 = com.ss.video.rtc.engine.RtcEngineImpl.C65562RtcEngineImpl.C655631.$SwitchMap$com$ss$video$rtc$engine$RtcEngine$ByteRtcEnv
            int r3 = r3.ordinal()
            r3 = r0[r3]
            r0 = 2
            r1 = 1
            r2 = 0
            if (r3 == r1) goto L_0x0018
            if (r3 == r0) goto L_0x001a
            r1 = 3
            if (r3 == r1) goto L_0x001b
        L_0x0018:
            r0 = 0
            goto L_0x001b
        L_0x001a:
            r0 = 1
        L_0x001b:
            int r3 = com.ss.video.rtc.engine.NativeFunctions.nativeSetByteRtcEnv(r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.video.rtc.engine.RtcEngineImpl.C65562RtcEngineImpl.setEnv(com.ss.video.rtc.engine.RtcEngine$ByteRtcEnv):int");
    }

    public static int setParameters(String str) {
        if (mLibraryLoaded && str != null && !str.isEmpty()) {
            return NativeFunctions.nativeSetParameters(str);
        }
        return -1;
    }

    @Override // com.ss.video.rtc.engine.RtcEngine
    public int adjustAudioMixingPlayoutVolume(int i) {
        long j = this.mNativeByteRtcEngine;
        if (j != -1) {
            return NativeFunctions.nativeAdjustAudioMixingPlayoutVolume(j, i);
        }
        LogUtil.m257130e("RtcEngineImpl", "native engine is invalid, adjustAudioMixingPlayoutVolume failed.");
        return -1;
    }

    @Override // com.ss.video.rtc.engine.RtcEngine
    public int adjustAudioMixingPublishVolume(int i) {
        long j = this.mNativeByteRtcEngine;
        if (j != -1) {
            return NativeFunctions.nativeAdjustAudioMixingPublishVolume(j, i);
        }
        LogUtil.m257130e("RtcEngineImpl", "native engine is invalid, adjustAudioMixingPublishVolume failed.");
        return -1;
    }

    @Override // com.ss.video.rtc.engine.RtcEngine
    public int adjustAudioMixingVolume(int i) {
        long j = this.mNativeByteRtcEngine;
        if (j != -1) {
            return NativeFunctions.nativeAdjustAudioMixingVolume(j, i);
        }
        LogUtil.m257130e("RtcEngineImpl", "native engine is invalid, adjustAudioMixingVolume failed.");
        return -1;
    }

    @Override // com.ss.video.rtc.engine.RtcEngine
    public int adjustPlaybackSignalVolume(int i) {
        long j = this.mNativeByteRtcEngine;
        if (j == -1) {
            LogUtil.m257130e("RtcEngineImpl", "native engine is invalid, adjustPlaybackSignalVolume failed.");
            return -1;
        }
        NativeFunctions.nativeAdjustPlaybackSignalVolume(j, i);
        return 0;
    }

    @Override // com.ss.video.rtc.engine.RtcEngine
    public int adjustRecordingSignalVolume(int i) {
        long j = this.mNativeByteRtcEngine;
        if (j == -1) {
            LogUtil.m257130e("RtcEngineImpl", "native engine is invalid, adjustRecordingSignalVolume failed.");
            return -1;
        }
        NativeFunctions.nativeAdjustRecordingSignalVolume(j, i);
        return 0;
    }

    @Override // com.ss.video.rtc.engine.RtcEngine
    public IRtcRoom createRoom(String str) {
        long nativeCreateRtcRoom = NativeFunctions.nativeCreateRtcRoom(this.mNativeByteRtcEngine, str);
        if (nativeCreateRtcRoom == 0) {
            LogUtil.m257130e("RtcEngineImpl", "createRoom faildd, native room is invalid");
            return null;
        }
        RtcRoom rtcRoom = new RtcRoom(str, nativeCreateRtcRoom, this);
        this.isMultiRoom = true;
        return rtcRoom;
    }

    @Override // com.ss.video.rtc.engine.RtcEngine
    public int getEffectVolume(int i) {
        long j = this.mNativeByteRtcEngine;
        if (j != -1) {
            return NativeFunctions.nativeGetEffectVolume(j, i);
        }
        LogUtil.m257130e("RtcEngineImpl", "native engine is invalid, getEffectVolume failed.");
        return -1;
    }

    @Override // com.ss.video.rtc.engine.RtcEngine
    public int pauseEffect(int i) {
        long j = this.mNativeByteRtcEngine;
        if (j != -1) {
            return NativeFunctions.nativePauseEffect(j, i);
        }
        LogUtil.m257130e("RtcEngineImpl", "native engine is invalid, pauseEffect failed.");
        return -1;
    }

    @Override // com.ss.video.rtc.engine.RtcEngine
    public int registerAudioFrameObserver(IAudioFrameObserver iAudioFrameObserver) {
        this.mAudioFrameObserver = new WeakReference<>(iAudioFrameObserver);
        if (iAudioFrameObserver == null) {
            NativeFunctions.nativeSetAudioFrameObserver(this.mNativeByteRtcEngine, null);
            return 0;
        }
        NativeFunctions.nativeSetAudioFrameObserver(this.mNativeByteRtcEngine, this.mByteRtcAudioFrameObserver);
        return 0;
    }

    @Override // com.ss.video.rtc.engine.RtcEngine
    public void registerMetadataObserver(IMetadataObserver iMetadataObserver) {
        this.mMetadataObserver = new WeakReference<>(iMetadataObserver);
        if (iMetadataObserver == null) {
            NativeFunctions.nativeSetMetadataObserver(this.mNativeByteRtcEngine, null);
        } else {
            NativeFunctions.nativeSetMetadataObserver(this.mNativeByteRtcEngine, this.mByteRtcMetadataObserver);
        }
    }

    @Override // com.ss.video.rtc.engine.RtcEngine
    public int resumeEffect(int i) {
        long j = this.mNativeByteRtcEngine;
        if (j != -1) {
            return NativeFunctions.nativeResumeEffect(j, i);
        }
        LogUtil.m257130e("RtcEngineImpl", "native engine is invalid, resumeEffect failed.");
        return -1;
    }

    @Override // com.ss.video.rtc.engine.RtcEngine
    public long sendRoomBinaryMessage(byte[] bArr) {
        long j = this.mNativeByteRtcEngine;
        if (j != -1) {
            return (long) NativeFunctions.nativeSendRoomBinaryMessage(j, bArr);
        }
        LogUtil.m257130e("RtcEngineImpl", "native engine is invalid, sendCustomMessage failed.");
        return -1;
    }

    @Override // com.ss.video.rtc.engine.RtcEngine
    public long sendRoomMessage(String str) {
        long j = this.mNativeByteRtcEngine;
        if (j != -1) {
            return (long) NativeFunctions.nativeSendRoomMessage(j, str);
        }
        LogUtil.m257130e("RtcEngineImpl", "native engine is invalid, sendCustomMessage failed.");
        return -1;
    }

    @Override // com.ss.video.rtc.engine.RtcEngine
    public int setAudioMixingPosition(int i) {
        long j = this.mNativeByteRtcEngine;
        if (j != -1) {
            return NativeFunctions.nativeSetAudioMixingPosition(j, i);
        }
        LogUtil.m257130e("RtcEngineImpl", "native engine is invalid, setAudioMixingPosition failed.");
        return -1;
    }

    public void setAudioMode(int i) {
        AudioManager audioManager;
        Context context = this.mContext;
        if (context != null && (audioManager = (AudioManager) context.getSystemService("audio")) != null && audioManager.getMode() != i) {
            audioManager.setMode(i);
        }
    }

    @Override // com.ss.video.rtc.engine.RtcEngine
    public int setEffectsVolume(int i) {
        long j = this.mNativeByteRtcEngine;
        if (j != -1) {
            return NativeFunctions.nativeSetEffectsVolume(j, i);
        }
        LogUtil.m257130e("RtcEngineImpl", "native engine is invalid, setEffectsVolume failed.");
        return -1;
    }

    @Override // com.ss.video.rtc.engine.RtcEngine
    public int setLocalVideoMirrorMode(int i) {
        boolean z;
        boolean z2 = true;
        if (i == 2) {
            z = false;
        } else {
            z = true;
        }
        this.mIsVideoMirror = z;
        long j = this.mNativeByteRtcEngine;
        if (!z || !this.mIsFront) {
            z2 = false;
        }
        NativeFunctions.nativeSetLocalVideoMirrorMode(j, z2);
        return 0;
    }

    @Override // com.ss.video.rtc.engine.RtcEngine
    public int setupLocalScreen(VideoCanvas videoCanvas) {
        if (videoCanvas == null) {
            LogUtil.m257132i("RtcEngineImpl", "EventType: setupLocalScreen canvas is null");
            return -1;
        }
        NativeFunctions.nativeSetupLocalScreen(this.mNativeByteRtcEngine, videoCanvas.renderView, videoCanvas.renderMode);
        return 0;
    }

    @Override // com.ss.video.rtc.engine.RtcEngine
    public int setupLocalVideo(VideoCanvas videoCanvas) {
        if (videoCanvas == null) {
            LogUtil.m257132i("RtcEngineImpl", "EventType: setupLocalVideo canvas is null");
            return -1;
        }
        NativeFunctions.nativeSetupLocalVideo(this.mNativeByteRtcEngine, videoCanvas.renderView, videoCanvas.renderMode);
        return 0;
    }

    @Override // com.ss.video.rtc.engine.RtcEngine
    public void setupRemoteScreen(VideoCanvas videoCanvas) {
        if (videoCanvas == null || videoCanvas.uid == null) {
            LogUtil.m257132i("RtcEngineImpl", "EventType: setupRemoteVideo canvas or uid is null");
        } else {
            NativeFunctions.nativeSetupRemoteVideo(this.mNativeByteRtcEngine, videoCanvas.renderView, videoCanvas.renderMode, videoCanvas.uid, videoCanvas.isScreen);
        }
    }

    @Override // com.ss.video.rtc.engine.RtcEngine
    public int setupRemoteVideo(VideoCanvas videoCanvas) {
        if (videoCanvas == null || videoCanvas.uid == null) {
            LogUtil.m257132i("RtcEngineImpl", "EventType: setupRemoteVideo canvas or uid is null");
            return -1;
        }
        NativeFunctions.nativeSetupRemoteVideo(this.mNativeByteRtcEngine, videoCanvas.renderView, videoCanvas.renderMode, videoCanvas.uid, videoCanvas.isScreen);
        return 0;
    }

    @Override // com.ss.video.rtc.engine.RtcEngine
    public int stopEffect(int i) {
        long j = this.mNativeByteRtcEngine;
        if (j != -1) {
            return NativeFunctions.nativeStopEffect(j, i);
        }
        LogUtil.m257130e("RtcEngineImpl", "native engine is invalid, stopEffect failed.");
        return -1;
    }

    @Override // com.ss.video.rtc.engine.RtcEngine
    public int unloadEffect(int i) {
        long j = this.mNativeByteRtcEngine;
        if (j != -1) {
            return NativeFunctions.nativeUnloadEffect(j, i);
        }
        LogUtil.m257130e("RtcEngineImpl", "native engine is invalid, unloadEffect failed.");
        return -1;
    }

    private long getNativeEglHandle(RtcVideoFrame rtcVideoFrame) {
        if (rtcVideoFrame == null || rtcVideoFrame.eglContext14 == null) {
            if (rtcVideoFrame == null) {
                return 0;
            }
            EGLContext eGLContext = rtcVideoFrame.eglContext11;
            return 0;
        } else if (Build.VERSION.SDK_INT >= 21) {
            return rtcVideoFrame.eglContext14.getNativeHandle();
        } else {
            if (Build.VERSION.SDK_INT >= 17) {
                return (long) rtcVideoFrame.eglContext14.getHandle();
            }
            return 0;
        }
    }

    @Override // com.ss.video.rtc.engine.RtcEngine
    public int enableLocalAudio(boolean z) {
        LogUtil.m257129d("RtcEngineImpl", "enableLocalAudio...enable: " + z);
        long j = this.mNativeByteRtcEngine;
        if (j == -1) {
            LogUtil.m257130e("RtcEngineImpl", "native engine is invalid, enableLocalAudio failed.");
            return -1;
        }
        NativeFunctions.nativeEnableLocalAudio(j, z);
        return 0;
    }

    @Override // com.ss.video.rtc.engine.RtcEngine
    public int enableLocalVideo(boolean z) {
        LogUtil.m257129d("RtcEngineImpl", "enableLocalVideo...enable: " + z);
        long j = this.mNativeByteRtcEngine;
        if (j == -1) {
            LogUtil.m257130e("RtcEngineImpl", "native engine is invalid, enableLocalVideo failed.");
            return -1;
        }
        NativeFunctions.nativeEnableLocalVideo(j, z);
        return 0;
    }

    @Override // com.ss.video.rtc.engine.RtcEngine
    public void enableSubscribeLocalStream(boolean z) {
        LogUtil.m257129d("RtcEngineImpl", "enableSubscribeLocalStream: " + z);
        long j = this.mNativeByteRtcEngine;
        if (j == -1) {
            LogUtil.m257130e("RtcEngineImpl", "native engine is invalid, enableSubscribeLocalStream failed.");
        } else {
            NativeFunctions.nativeEnableSubscribeLocalStream(j, z);
        }
    }

    @Override // com.ss.video.rtc.engine.RtcEngine
    public int muteAllRemoteAudioStreams(boolean z) {
        LogUtil.m257129d("RtcEngineImpl", "muteAllRemoteAudioStreams: " + z);
        long j = this.mNativeByteRtcEngine;
        if (j == -1) {
            LogUtil.m257130e("RtcEngineImpl", "native engine is invalid, muteAllRemoteAudioStreams failed.");
            return -1;
        }
        NativeFunctions.nativeMuteAllRemoteAudioStreams(j, z);
        return 0;
    }

    @Override // com.ss.video.rtc.engine.RtcEngine
    public int muteAllRemoteVideoStreams(boolean z) {
        LogUtil.m257129d("RtcEngineImpl", "muteAllRemoteVideoStreams: " + z);
        long j = this.mNativeByteRtcEngine;
        if (j == -1) {
            LogUtil.m257130e("RtcEngineImpl", "native engine is invalid, muteAllRemoteVideoStreams failed.");
            return -1;
        }
        NativeFunctions.nativeMuteAllRemoteVideoStreams(j, z);
        return 0;
    }

    @Override // com.ss.video.rtc.engine.RtcEngine
    public int muteLocalAudioStream(boolean z) {
        LogUtil.m257129d("RtcEngineImpl", "muteLocalAudioStream: " + z);
        long j = this.mNativeByteRtcEngine;
        if (j == -1) {
            LogUtil.m257130e("RtcEngineImpl", "native engine is invalid, muteLocalAudioStream failed.");
            return -1;
        }
        NativeFunctions.nativeMuteLocalAudioStream(j, z);
        return 0;
    }

    @Override // com.ss.video.rtc.engine.RtcEngine
    public int muteLocalVideoStream(boolean z) {
        LogUtil.m257129d("RtcEngineImpl", "muteLocalVideoStream: " + z);
        long j = this.mNativeByteRtcEngine;
        if (j == -1) {
            LogUtil.m257130e("RtcEngineImpl", "native engine is invalid, muteLocalVideoStream failed.");
            return -1;
        }
        NativeFunctions.nativeMuteLocalVideoStream(j, z);
        return 0;
    }

    @Override // com.ss.video.rtc.engine.RtcEngine
    public boolean pushScreenFrame(RtcVideoFrame rtcVideoFrame) {
        VideoFrame convert2I420Frame;
        VideoFrameConverter videoFrameConverter = this.mScreenFrameConverter;
        if (videoFrameConverter == null || (convert2I420Frame = videoFrameConverter.convert2I420Frame(rtcVideoFrame)) == null) {
            return false;
        }
        long j = this.mNativeByteRtcEngine;
        if (j == -1) {
            LogUtil.m257130e("RtcEngineImpl", "native engine is invalid, pushScreenFrame failed.");
            return false;
        }
        boolean nativePushScreenFrame = NativeFunctions.nativePushScreenFrame(j, convert2I420Frame);
        convert2I420Frame.release();
        return nativePushScreenFrame;
    }

    @Override // com.ss.video.rtc.engine.RtcEngine
    public int renewToken(String str) {
        LogUtil.m257129d("RtcEngineImpl", "renewToken: " + str);
        long j = this.mNativeByteRtcEngine;
        if (j == -1) {
            LogUtil.m257130e("RtcEngineImpl", "native engine is invalid, renewToken failed.");
            return -1;
        }
        NativeFunctions.nativeRenewToken(j, str);
        return 0;
    }

    @Override // com.ss.video.rtc.engine.RtcEngine
    public int setClientRole(RtcEngine.CLIENT_ROLE_TYPE client_role_type) {
        LogUtil.m257129d("RtcEngineImpl", "setClientRole. role : " + client_role_type);
        if (this.mNativeByteRtcEngine == -1) {
            LogUtil.m257130e("RtcEngineImpl", "native engine is invalid, setClientRole failed.");
            return -1;
        }
        int i = 1;
        if (C655631.$SwitchMap$com$ss$video$rtc$engine$RtcEngine$CLIENT_ROLE_TYPE[client_role_type.ordinal()] != 1) {
            i = 3;
        }
        NativeFunctions.nativeSetClientRole(this.mNativeByteRtcEngine, i);
        return 0;
    }

    @Override // com.ss.video.rtc.engine.RtcEngine
    public int setDefaultMuteAllRemoteAudioStreams(boolean z) {
        LogUtil.m257129d("RtcEngineImpl", "setDefaultMuteAllRemoteAudioStreams: " + z);
        long j = this.mNativeByteRtcEngine;
        if (j == -1) {
            LogUtil.m257130e("RtcEngineImpl", "native engine is invalid, setDefaultMuteAllRemoteAudioStreams failed.");
            return -1;
        }
        NativeFunctions.nativeSetDefaultMuteAllRemoteAudioStreams(j, z);
        return 0;
    }

    @Override // com.ss.video.rtc.engine.RtcEngine
    public int setDefaultMuteAllRemoteVideoStreams(boolean z) {
        LogUtil.m257129d("RtcEngineImpl", "setDefaultMuteAllRemoteVideoStreams: " + z);
        long j = this.mNativeByteRtcEngine;
        if (j == -1) {
            LogUtil.m257130e("RtcEngineImpl", "native engine is invalid, setDefaultMuteAllRemoteVideoStreams failed.");
            return -1;
        }
        NativeFunctions.nativeSetDefaultMuteAllRemoteVideoStreams(j, z);
        return 0;
    }

    @Override // com.ss.video.rtc.engine.RtcEngine
    public int setEnableSpeakerphone(boolean z) {
        LogUtil.m257129d("RtcEngineImpl", "setEnableSpeakerphone: " + z);
        long j = this.mNativeByteRtcEngine;
        if (j == -1) {
            LogUtil.m257130e("RtcEngineImpl", "native engine is invalid, setEnableSpeakerphone failed.");
            return -1;
        }
        NativeFunctions.nativeSetEnableSpeakerphone(j, z);
        return 0;
    }

    @Override // com.ss.video.rtc.engine.RtcEngine
    public int setPublishFallbackOption(int i) {
        LogUtil.m257129d("RtcEngineImpl", "setPublishFallbackOption: option: " + i);
        long j = this.mNativeByteRtcEngine;
        if (j == -1) {
            LogUtil.m257130e("RtcEngineImpl", "native engine is invalid, setPublishFallbackOption failed.");
            return -1;
        }
        NativeFunctions.nativeSetPublishFallbackOption(j, i);
        return 0;
    }

    @Override // com.ss.video.rtc.engine.RtcEngine
    public int setRemoteSubscribeFallbackOption(RtcEngine.SubscribeFallbackOptions subscribeFallbackOptions) {
        LogUtil.m257129d("RtcEngineImpl", "setRemoteSubscribeFallbackOption: option: " + subscribeFallbackOptions);
        long j = this.mNativeByteRtcEngine;
        if (j == -1) {
            LogUtil.m257130e("RtcEngineImpl", "native engine is invalid, setRemoteSubscribeFallbackOption failed.");
            return -1;
        }
        NativeFunctions.nativeSetRemoteSubscribeFallbackOption(j, subscribeFallbackOptions.value());
        return 0;
    }

    @Override // com.ss.video.rtc.engine.RtcEngine
    public void enableLiveTranscoding(LiveTranscoding liveTranscoding) {
        LogUtil.m257129d("RtcEngineImpl", "enableLiveTranscoding...");
        if (liveTranscoding == null) {
            LogUtil.m257129d("RtcEngineImpl", "enableLiveTranscoding...liveTranscode is null, no effect, please check.");
        } else if (this.mNativeByteRtcEngine == -1) {
            LogUtil.m257130e("RtcEngineImpl", "native engine is invalid, enableLiveTranscoding failed.");
        } else {
            this.mEnableTranscode = true;
            this.mLiveTranscoding = liveTranscoding;
            liveTranscoding.setAction("started");
            String jSONObject = this.mLiveTranscoding.getTranscodeMessage().toString();
            LogUtil.m257129d("RtcEngineImpl", "enableLiveTranscoding...liveTranscodeJson: " + jSONObject);
            NativeFunctions.nativeEnableLiveTranscoding(this.mNativeByteRtcEngine, jSONObject);
        }
    }

    @Override // com.ss.video.rtc.engine.RtcEngine
    public int setChannelProfile(RtcEngine.CHANNEL_PROFILE_TYPE channel_profile_type) {
        LogUtil.m257129d("RtcEngineImpl", "setChannelProfile. profile : " + channel_profile_type);
        if (this.mNativeByteRtcEngine == -1) {
            LogUtil.m257130e("RtcEngineImpl", "native engine is invalid, setChannelProfile failed.");
            return -1;
        }
        int i = C655631.$SwitchMap$com$ss$video$rtc$engine$RtcEngine$CHANNEL_PROFILE_TYPE[channel_profile_type.ordinal()];
        int i2 = 3;
        if (i == 1) {
            i2 = 2;
        } else if (i != 2) {
            if (i == 3 || i != 4) {
                i2 = 0;
            } else {
                i2 = 1;
            }
        }
        NativeFunctions.nativeSetChannelProfile(this.mNativeByteRtcEngine, i2);
        return 0;
    }

    @Override // com.ss.video.rtc.engine.RtcEngine
    public void setVideoCompositingLayout(LiveTranscoding.Layout layout) {
        LogUtil.m257129d("RtcEngineImpl", "setVideoCompositingLayout...");
        LiveTranscoding liveTranscoding = this.mLiveTranscoding;
        if (liveTranscoding == null) {
            LogUtil.m257129d("RtcEngineImpl", "setVideoCompositingLayout...mLiveTranscoding is null, no effect, please check.");
        } else if (this.mNativeByteRtcEngine == -1) {
            LogUtil.m257130e("RtcEngineImpl", "native engine is invalid, setVideoCompositingLayout failed.");
        } else {
            liveTranscoding.setLayout(layout);
            this.mLiveTranscoding.setAction("layoutChanged");
            String jSONObject = this.mLiveTranscoding.getTranscodeMessage().toString();
            LogUtil.m257129d("RtcEngineImpl", "setVideoCompositingLayout...liveTranscodeJson: " + jSONObject);
            NativeFunctions.nativeSetVideoCompositingLayout(this.mNativeByteRtcEngine, jSONObject);
        }
    }

    @Override // com.ss.video.rtc.engine.RtcEngine
    public int UpdateAudioRecvRange(int i, int i2) {
        return NativeFunctions.nativeUpdateAudioRecvRange(this.mNativeByteRtcEngine, i, i2);
    }

    @Override // com.ss.video.rtc.engine.RtcEngine
    public int checkVideoEffectLicense(Context context, String str) {
        return NativeFunctions.nativeCheckVideoEffectLicense(context, this.mNativeByteRtcEngine, str);
    }

    @Override // com.ss.video.rtc.engine.RtcEngine
    public boolean pushAudioMixingStreamData(byte[] bArr, int i) {
        return NativeFunctions.nativePushAudioMixingStreamData(this.mNativeByteRtcEngine, bArr, i);
    }

    @Override // com.ss.video.rtc.engine.RtcEngine
    public void setEncryptInfo(int i, String str) {
        NativeFunctions.nativeSetEncryptInfo(this.mNativeByteRtcEngine, i, str);
    }

    @Override // com.ss.video.rtc.engine.RtcEngine
    public boolean setMixedAudioFrameParameters(int i, int i2) {
        NativeFunctions.nativeSetMixedAudioFrameParameters(this.mNativeByteRtcEngine, i, i2);
        return true;
    }

    @Override // com.ss.video.rtc.engine.RtcEngine
    public boolean setPlaybackAudioFrameParameters(int i, int i2) {
        NativeFunctions.nativeSetPlaybackAudioFrameParameters(this.mNativeByteRtcEngine, i, i2);
        return true;
    }

    @Override // com.ss.video.rtc.engine.RtcEngine
    public boolean setRecordingAudioFrameParameters(int i, int i2) {
        NativeFunctions.nativeSetRecordingAudioFrameParameters(this.mNativeByteRtcEngine, i, i2);
        return true;
    }

    @Override // com.ss.video.rtc.engine.RtcEngine
    public int setupLocalScreenRender(IVideoSink iVideoSink, String str) {
        return setLocalRenderInternal(iVideoSink, str, true, false);
    }

    @Override // com.ss.video.rtc.engine.RtcEngine
    public int setupLocalVideoRender(IVideoSink iVideoSink, String str) {
        return setLocalRenderInternal(iVideoSink, str, false, false);
    }

    @Override // com.ss.video.rtc.engine.RtcEngine
    public void AdjustRemoteAudioVolume(String str, int i) {
        if (str == null) {
            LogUtil.m257130e("RtcEngineImpl", "AdjustRemoteAudioVolume: uid is null adjust failed");
        } else {
            NativeFunctions.nativeAdjustRemoteAudioVolume(this.mNativeByteRtcEngine, str, i);
        }
    }

    @Override // com.ss.video.rtc.engine.RtcEngine
    public int setupRemoteScreenRender(IVideoSink iVideoSink, String str) {
        return setupRemoteVideoRenderInternal(iVideoSink, null, str, true, false);
    }

    @Override // com.ss.video.rtc.engine.RtcEngine
    public int setupRemoteVideoRender(IVideoSink iVideoSink, String str) {
        return setupRemoteVideoRenderInternal(iVideoSink, null, str, false, false);
    }

    @Override // com.ss.video.rtc.engine.RtcEngine
    public int startScreenSharing(Intent intent, ScreenSharingParameters screenSharingParameters) {
        return NativeFunctions.nativeStartScreenSharing(this.mNativeByteRtcEngine, intent, new InternalScreenSharingParams(screenSharingParameters));
    }

    @Override // com.ss.video.rtc.engine.RtcEngine
    public int preloadEffect(int i, String str) {
        long j = this.mNativeByteRtcEngine;
        if (j != -1) {
            return NativeFunctions.nativePreloadEffect(j, i, str);
        }
        LogUtil.m257130e("RtcEngineImpl", "native engine is invalid, preloadEffect failed.");
        return -1;
    }

    @Override // com.ss.video.rtc.engine.RtcEngine
    public boolean pullExternalAudioFrame(byte[] bArr, int i) {
        if (this.mNativeByteRtcEngine != -1 && this.mState != State.DESTORY) {
            return NativeFunctions.nativePullExternalAudioFrame(this.mNativeByteRtcEngine, bArr, i);
        }
        LogUtil.m257130e("RtcEngineImpl", "native engine is invalid, pullExternalAudioFrame failed.");
        return false;
    }

    @Override // com.ss.video.rtc.engine.RtcEngine
    public boolean pushExternalAudioFrame(byte[] bArr, int i) {
        if (this.mNativeByteRtcEngine != -1 && this.mState != State.DESTORY) {
            return NativeFunctions.nativePushExternalAudioFrame(this.mNativeByteRtcEngine, bArr, i);
        }
        LogUtil.m257130e("RtcEngineImpl", "native engine is invalid, pushExternalAudioFrame failed.");
        return false;
    }

    @Override // com.ss.video.rtc.engine.RtcEngine
    public long sendUserBinaryMessage(String str, byte[] bArr) {
        long j = this.mNativeByteRtcEngine;
        if (j == -1) {
            LogUtil.m257130e("RtcEngineImpl", "native engine is invalid, sendBinaryMessage failed.");
            return -1;
        } else if (str != null) {
            return NativeFunctions.nativeSendUserBinaryMessage(j, str, bArr);
        } else {
            LogUtil.m257130e("RtcEngineImpl", "sendBinaryMessage: uid is null send failed");
            return -2;
        }
    }

    @Override // com.ss.video.rtc.engine.RtcEngine
    public long sendUserMessage(String str, String str2) {
        long j = this.mNativeByteRtcEngine;
        if (j == -1) {
            LogUtil.m257130e("RtcEngineImpl", "native engine is invalid, sendMessage failed.");
            return -1;
        } else if (str != null) {
            return NativeFunctions.nativeSendUserMessage(j, str, str2);
        } else {
            LogUtil.m257130e("RtcEngineImpl", "sendMessage: uid is null send failed");
            return -2;
        }
    }

    @Override // com.ss.video.rtc.engine.RtcEngine
    public int setVolumeOfEffect(int i, int i2) {
        long j = this.mNativeByteRtcEngine;
        if (j != -1) {
            return NativeFunctions.nativeSetVolumeOfEffect(j, i, i2);
        }
        LogUtil.m257130e("RtcEngineImpl", "native engine is invalid, setVolumeOfEffect failed.");
        return -1;
    }

    @Override // com.ss.video.rtc.engine.RtcEngine
    public int enableAudioVolumeIndication(int i, int i2) {
        LogUtil.m257129d("RtcEngineImpl", "enableAudioVolumeIndication interval: " + i + " ,smooth: " + i2);
        long j = this.mNativeByteRtcEngine;
        if (j == -1) {
            LogUtil.m257130e("RtcEngineImpl", "native engine is invalid, enableAudioVolumeIndication failed.");
            return -1;
        }
        NativeFunctions.nativeEnableAudioVolumeIndication(j, i, i2);
        return 0;
    }

    @Override // com.ss.video.rtc.engine.RtcEngine
    public void enableAutoSubscribe(RtcEngine.SubscribeMode subscribeMode, RtcEngine.SubscribeMode subscribeMode2) {
        LogUtil.m257129d("RtcEngineImpl", "enableAutoSubscribe: audio:" + subscribeMode + ", video: " + subscribeMode2);
        long j = this.mNativeByteRtcEngine;
        if (j == -1) {
            LogUtil.m257130e("RtcEngineImpl", "native engine is invalid, enableAutoSubscribe failed.");
        } else {
            NativeFunctions.nativeEnableAutoSubscribe(j, subscribeMode.value(), subscribeMode2.value());
        }
    }

    @Override // com.ss.video.rtc.engine.RtcEngine
    public int muteRemoteAudioStream(String str, boolean z) {
        LogUtil.m257129d("RtcEngineImpl", "muteRemoteAudioStream, uid: " + str + " , muted: " + z);
        long j = this.mNativeByteRtcEngine;
        if (j == -1) {
            LogUtil.m257130e("RtcEngineImpl", "native engine is invalid, muteRemoteAudioStream failed.");
            return -1;
        } else if (str == null) {
            LogUtil.m257130e("RtcEngineImpl", "muteRemoteAudioStream, uid is null mute failed.");
            return -2;
        } else {
            NativeFunctions.nativeMuteRemoteAudioStream(j, str, z);
            return 0;
        }
    }

    @Override // com.ss.video.rtc.engine.RtcEngine
    public int muteRemoteVideoStream(String str, boolean z) {
        LogUtil.m257129d("RtcEngineImpl", "muteRemoteVideoStream, uid: " + str + " , muted: " + z);
        long j = this.mNativeByteRtcEngine;
        if (j == -1) {
            LogUtil.m257130e("RtcEngineImpl", "native engine is invalid, muteRemoteVideoStream failed.");
            return -1;
        } else if (str == null) {
            LogUtil.m257130e("RtcEngineImpl", "muteRemoteVideoStream, uid is null mute failed");
            return -2;
        } else {
            NativeFunctions.nativeMuteRemoteVideoStream(j, str, z);
            return 0;
        }
    }

    @Override // com.ss.video.rtc.engine.RtcEngine
    public int setRemoteUserPriority(String str, RtcEngine.RemoteUserPriority remoteUserPriority) {
        LogUtil.m257129d("RtcEngineImpl", "setRemoteUserPriority: uid: " + str + ", priority: " + remoteUserPriority);
        long j = this.mNativeByteRtcEngine;
        if (j == -1) {
            LogUtil.m257130e("RtcEngineImpl", "native engine is invalid, setRemoteUserPriority failed.");
            return -1;
        } else if (str == null) {
            LogUtil.m257130e("RtcEngineImpl", "setRemoteUserPriority: uid is null set failed");
            return -2;
        } else {
            NativeFunctions.nativeSetRemoteUserPriority(j, str, remoteUserPriority.value());
            return 0;
        }
    }

    @Override // com.ss.video.rtc.engine.RtcEngine
    public void unSubscribe(String str, boolean z) {
        LogUtil.m257129d("RtcEngineImpl", "unSubscribe: " + str);
        long j = this.mNativeByteRtcEngine;
        if (j == -1) {
            LogUtil.m257130e("RtcEngineImpl", "native engine is invalid, unSubscribe failed.");
        } else {
            NativeFunctions.nativeUnSubscribe(j, str, z);
        }
    }

    public static String getCloudRenderingInfo(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            JSONObject jSONObject3 = new JSONObject();
            jSONObject.put("action", str);
            jSONObject.put(ShareHitPoint.f121869d, "render");
            jSONObject2.put("effect", str2);
            jSONObject3.put("layout", jSONObject2);
            jSONObject.put("renderMeta", jSONObject3);
            return jSONObject.toString();
        } catch (Exception e) {
            LogUtil.m257130e("RtcEngineImpl", "getCloudRenderingInfo catch exception , e : " + e.getMessage());
            return null;
        }
    }

    @Override // com.ss.video.rtc.engine.RtcEngine
    public boolean pushExternalVideoFrame(RtcVideoFrame rtcVideoFrame, boolean z) {
        VideoFrame videoFrame;
        if (this.mNativeByteRtcEngine == -1 || this.mState == State.DESTORY) {
            LogUtil.m257130e("RtcEngineImpl", "native engine is invalid, pushExternalVideoFrame failed.");
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis();
        VideoFrameConverter videoFrameConverter = this.mVideoFrameConverter;
        if (videoFrameConverter == null || !this.mUseExtVideoSource) {
            LogUtil.m257130e("RtcEngineImpl", "pushExternalVideoFrame failed videoFrameConverter:" + this.mVideoFrameConverter + " useExtVideoSource:" + this.mUseExtVideoSource);
            return false;
        }
        if (z) {
            videoFrame = videoFrameConverter.convert2VideoFrame(rtcVideoFrame);
        } else {
            videoFrame = videoFrameConverter.convert2I420Frame(rtcVideoFrame);
        }
        if (videoFrame == null) {
            LogUtil.m257130e("RtcEngineImpl", "pushExternalVideoFrame convert video frame is null");
            return false;
        } else if (z) {
            NativeFunctions.nativePushExternalVideoFrame(this.mNativeByteRtcEngine, videoFrame, VideoFrameConverter.getExtendedData(rtcVideoFrame), VideoFrameConverter.getSupplementaryInfo(rtcVideoFrame), currentTimeMillis);
            videoFrame.release();
            return true;
        } else {
            NativeFunctions.nativePushExternalVideoFrame(this.mNativeByteRtcEngine, videoFrame, VideoFrameConverter.getExtendedData(rtcVideoFrame), VideoFrameConverter.getSupplementaryInfo(rtcVideoFrame), currentTimeMillis);
            videoFrame.release();
            return true;
        }
    }

    @Override // com.ss.video.rtc.engine.RtcEngine
    public int setVideoProfiles(VideoStreamDescription[] videoStreamDescriptionArr, VideoEncoderConfiguration.ORIENTATION_MODE orientation_mode) {
        if (videoStreamDescriptionArr == null) {
            videoStreamDescriptionArr = new VideoStreamDescription[0];
        }
        if (this.mNativeByteRtcEngine == -1) {
            LogUtil.m257130e("RtcEngineImpl", "native engine is invalid, setVideoResolutions failed.");
            return -1;
        }
        ArrayList arrayList = new ArrayList();
        for (VideoStreamDescription videoStreamDescription : videoStreamDescriptionArr) {
            if (!videoStreamDescription.isValid()) {
                LogUtil.m257130e("RtcEngineImpl", "setVideoResolutions with illegal params");
                return -2;
            }
            arrayList.add(new InternalVideoStreamDescription(videoStreamDescription));
        }
        ByteRtcData.instance().setOrientationMode(orientation_mode);
        NativeFunctions.nativeSetVideoProfiles(this.mNativeByteRtcEngine, arrayList);
        return 0;
    }

    @Override // com.ss.video.rtc.engine.RtcEngine
    public void subscribeStream(String str, SubscribeConfig subscribeConfig) {
        String str2;
        StringBuilder sb = new StringBuilder();
        sb.append("subscribeStream: ");
        sb.append(str);
        sb.append(", info:");
        if (subscribeConfig == null) {
            str2 = "null";
        } else {
            str2 = subscribeConfig.toString();
        }
        sb.append(str2);
        LogUtil.m257129d("RtcEngineImpl", sb.toString());
        if (subscribeConfig != null) {
            long j = this.mNativeByteRtcEngine;
            if (j == -1) {
                LogUtil.m257130e("RtcEngineImpl", "native engine is invalid, subscribeStream failed.");
            } else {
                NativeFunctions.nativeSubscribeStream(j, str, subscribeConfig.isScreen, subscribeConfig.subVideo, subscribeConfig.subAudio, subscribeConfig.videoIndex);
            }
        }
    }

    @Override // com.ss.video.rtc.engine.RtcEngine
    public int UpdateSelfPosition(int i, int i2, int i3) {
        return NativeFunctions.nativeUpdateSelfPosition(this.mNativeByteRtcEngine, i, i2, i3);
    }

    @Override // com.ss.video.rtc.engine.RtcEngine
    public void setAudioPlayoutMixStream(boolean z, int i, int i2) {
        NativeFunctions.nativeSetAudioPlayoutMixStream(this.mNativeByteRtcEngine, z, i, i2);
    }

    @Override // com.ss.video.rtc.engine.RtcEngine
    public void updateVideoEffect(String str, String str2, float f) {
        NativeFunctions.nativeUpdateVideoEffect(this.mNativeByteRtcEngine, str, str2, f);
    }

    @Override // com.ss.video.rtc.engine.RtcEngine
    public int setupLocalVideoRender(IVideoSink iVideoSink, String str, boolean z) {
        return setLocalRenderInternal(iVideoSink, str, false, z);
    }

    @Override // com.ss.video.rtc.engine.RtcEngine
    public int setupRemoteScreenRender(IVideoSink iVideoSink, String str, String str2) {
        return setupRemoteVideoRenderInternal(iVideoSink, str, str2, true, false);
    }

    @Override // com.ss.video.rtc.engine.RtcEngine
    public int setupRemoteVideoRender(IVideoSink iVideoSink, String str, String str2) {
        return setupRemoteVideoRenderInternal(iVideoSink, str, str2, false, false);
    }

    public /* synthetic */ void lambda$new$0$RtcEngineImpl(IRtcEngineEventHandler.RtcLogLevel rtcLogLevel, String str, Throwable th) {
        IRtcEngineEventHandler rtcEngineHandler = getRtcEngineHandler();
        if (rtcEngineHandler != null) {
            try {
                rtcEngineHandler.onLoggerMessage(rtcLogLevel, str, th);
            } catch (Exception e) {
                LogUtil.m257130e("RtcEngineImpl", "Exception in App thread when handler onLoggerMessage , e : " + e.getMessage());
            }
        }
    }

    @Override // com.ss.video.rtc.engine.RtcEngine
    public void setExternalVideoSource(boolean z, boolean z2, boolean z3) {
        this.mUseExtVideoSource = z;
        long j = this.mNativeByteRtcEngine;
        if (j == -1) {
            LogUtil.m257130e("RtcEngineImpl", "native engine is invalid, setExternalVideoSource failed.");
            return;
        }
        NativeFunctions.nativeSetExternalVideoSource(j, z);
        boolean z4 = false;
        if (this.mUseExtVideoSource) {
            NativeFunctions.nativeSetLocalVideoMirrorMode(this.mNativeByteRtcEngine, false);
            return;
        }
        long j2 = this.mNativeByteRtcEngine;
        if (this.mIsVideoMirror && this.mIsFront) {
            z4 = true;
        }
        NativeFunctions.nativeSetLocalVideoMirrorMode(j2, z4);
    }

    @Override // com.ss.video.rtc.engine.RtcEngine
    public int setupRemoteVideoRender(IVideoSink iVideoSink, String str, boolean z) {
        return setupRemoteVideoRenderInternal(iVideoSink, null, str, false, z);
    }

    @Override // com.ss.video.rtc.engine.RtcEngine
    public void setExternalVideoSource(boolean z, boolean z2, boolean z3, boolean z4) {
        setExternalVideoSource(z, z2, z3);
    }

    @Override // com.ss.video.rtc.engine.RtcEngine
    public int joinChannel(String str, String str2, PublisherConfiguration publisherConfiguration, String str3) {
        return joinChannel(str, str2, publisherConfiguration, str3, "");
    }

    @Override // com.ss.video.rtc.engine.RtcEngine
    public int startAudioMixing(String str, boolean z, boolean z2, int i) {
        long j = this.mNativeByteRtcEngine;
        if (j != -1) {
            return NativeFunctions.nativeStartAudioMixing(j, str, z, z2, i);
        }
        LogUtil.m257130e("RtcEngineImpl", "native engine is invalid, startAudioMixing failed.");
        return -1;
    }

    @Override // com.ss.video.rtc.engine.RtcEngine
    public int setupRemoteVideoRender(IVideoSink iVideoSink, String str, String str2, boolean z) {
        return setupRemoteVideoRenderInternal(iVideoSink, str, str2, false, z);
    }

    private int setLocalRenderInternal(IVideoSink iVideoSink, String str, boolean z, boolean z2) {
        if (iVideoSink == null) {
            LogUtil.m257132i("RtcEngineImpl", "EventType: setLocalRenderInternal videoSink is null");
            return -1;
        } else if (str == null) {
            LogUtil.m257130e("RtcEngineImpl", "setLocalRenderInternal, uid is null set failed.");
            return -2;
        } else {
            LogUtil.m257132i("RtcEngineImpl", "EventType: setLocalRenderInternal videoSink:" + iVideoSink.hashCode() + " ThreadPool  workthreadID" + Thread.currentThread().getId());
            if (!z) {
                NativeFunctions.nativeSetupLocalVideoSink(this.mNativeByteRtcEngine, new VideoSinkAdapter(iVideoSink, this.mVideoSinkTask), str);
                return 0;
            }
            NativeFunctions.nativeSetupLocalScreenSink(this.mNativeByteRtcEngine, new VideoSinkAdapter(iVideoSink, this.mVideoSinkTask), str);
            return 0;
        }
    }

    @Override // com.ss.video.rtc.engine.RtcEngine
    public boolean setExternalAudioDevice(boolean z, int i, int i2, int i3) {
        if (i != 8000 && i != 16000 && i != 32000 && i != 44100 && i != 48000) {
            LogUtil.m257132i("RtcEngineImpl", "sample rate should in [8000 / 16000 / 32000 / 44100 / 48000], but it is setted to be:  " + i);
            return false;
        } else if (i2 != 1 && i2 != 2) {
            LogUtil.m257132i("RtcEngineImpl", "record channel num should be in [ 1 / 2 ], but it is setted to be:  " + i2);
            return false;
        } else if (i3 == 1 || i3 == 2) {
            long j = this.mNativeByteRtcEngine;
            if (j == -1) {
                LogUtil.m257130e("RtcEngineImpl", "native engine is invalid, setExternalAudioDevice failed.");
                return false;
            }
            NativeFunctions.nativeSetExternalAudioDevice(j, z, i, i2, i3);
            if (this.mEngineAudioDeviceEventHandler == null) {
                EngineAudioDeviceEventHandler engineAudioDeviceEventHandler = new EngineAudioDeviceEventHandler();
                this.mEngineAudioDeviceEventHandler = engineAudioDeviceEventHandler;
                NativeFunctions.nativeSetAudioDeviceObserver(this.mNativeByteRtcEngine, engineAudioDeviceEventHandler);
            }
            return true;
        } else {
            LogUtil.m257132i("RtcEngineImpl", "playout channel num should be in [ 1 / 2 ], but it is setted to be:  " + i3);
            return false;
        }
    }

    @Override // com.ss.video.rtc.engine.RtcEngine
    public int playEffect(int i, String str, boolean z, int i2, int i3) {
        long j = this.mNativeByteRtcEngine;
        if (j != -1) {
            return NativeFunctions.nativePlayEffect(j, i, str, z, i2, i3);
        }
        LogUtil.m257130e("RtcEngineImpl", "native engine is invalid, playEffect failed.");
        return -1;
    }

    private int setupRemoteVideoRenderInternal(IVideoSink iVideoSink, String str, String str2, boolean z, boolean z2) {
        if (iVideoSink == null) {
            LogUtil.m257132i("RtcEngineImpl", "EventType: setupRemoteRenderInternal videoSink is null");
            return -1;
        } else if (str2 == null) {
            LogUtil.m257130e("RtcEngineImpl", "EventType: setupRemoteRenderInternal, uid is null");
            return -2;
        } else {
            LogUtil.m257132i("RtcEngineImpl", "EventType: setupRemoteRenderInternal canvas:" + iVideoSink.hashCode());
            NativeFunctions.nativeSetupRemoteVideoSink(this.mNativeByteRtcEngine, new VideoSinkAdapter(iVideoSink, this.mVideoSinkTask), str2, z);
            return 0;
        }
    }

    @Override // com.ss.video.rtc.engine.RtcEngine
    public int joinChannel(String str, String str2, PublisherConfiguration publisherConfiguration, String str3, String str4) {
        LogUtil.m257129d("RtcEngineImpl", "joinChannel with token: " + str + " , channel: " + str2 + " and uid: " + str3 + " and trace_id: " + str4);
        if (this.mState != State.IDLE) {
            return -4;
        }
        if (this.mNativeByteRtcEngine == -1) {
            LogUtil.m257130e("RtcEngineImpl", "native engine is invalid, joinChannel failed.");
            return -3;
        } else if (str3 == null || str3.length() == 0) {
            LogUtil.m257130e("RtcEngineImpl", "uid is invalid, joinChannel failed.");
            return -2;
        } else if (str2 == null || str2.length() == 0) {
            LogUtil.m257130e("RtcEngineImpl", "channel is invalid, joinChannel failed.");
            return -1;
        } else {
            this.mState = State.IN_ROOM;
            this.mRoom = str2;
            this.mUser = str3;
            System.currentTimeMillis();
            int nativeJoinChannel = NativeFunctions.nativeJoinChannel(this.mNativeByteRtcEngine, str, str2, str3, "", str4);
            if (nativeJoinChannel < 0) {
                return nativeJoinChannel;
            }
            return 0;
        }
    }

    public C65562RtcEngineImpl(Context context, String str, IRtcEngineEventHandler iRtcEngineEventHandler, Object obj, JSONObject jSONObject) throws IllegalStateException {
        String str2;
        LogUtil.m257129d("RtcEngineImpl", "create RtcEngineImpl with appId: " + str);
        if (mLibraryLoaded) {
            sRtcEngineInstance = this;
            Context applicationContext = context.getApplicationContext();
            this.mContext = applicationContext;
            RtcContextUtils.initialize(applicationContext);
            HandlerThread new_android_os_HandlerThread_by_knot = new_android_os_HandlerThread_by_knot("rtc_egl_thread");
            this.mEglThread = new_android_os_HandlerThread_by_knot;
            new_android_os_HandlerThread_by_knot.start();
            VideoSinkTask videoSinkTask = new VideoSinkTask();
            this.mVideoSinkTask = videoSinkTask;
            videoSinkTask.init();
            Handler handler = new Handler(this.mEglThread.getLooper());
            this.mEglHandler = handler;
            ThreadUtils.invokeAtFrontUninterruptibly(handler, new Runnable(obj) {
                /* class com.ss.video.rtc.engine.RtcEngineImpl.$$Lambda$RtcEngineImpl$6d1UZ60He7wSAcfvLBO1KCONsI0 */
                public final /* synthetic */ Object f$1;

                {
                    this.f$1 = r2;
                }

                public final void run() {
                    C65562RtcEngineImpl.this.lambda$new$2$RtcEngineImpl(this.f$1);
                }
            });
            this.mAppId = str;
            this.mState = State.IDLE;
            this.mRtcEngineHandler = new WeakReference<>(iRtcEngineEventHandler);
            LogUtil.setLoggerSink(this.mLoggerSink);
            this.mEngineEventHandler = new ByteRtcEngineEventHandler(this);
            this.mEngineInternalEventHandler = new ByteRtcEngineInternalEventHandler(this);
            this.mVideoFrameConverter = new VideoFrameConverter(false);
            this.mScreenFrameConverter = new VideoFrameConverter(false);
            RtcSharedContext.setVideoFrameConverter(this.mVideoFrameConverter);
            this.mByteRtcVideoFrameObserver = new ByteRtcVideoFrameObserver();
            this.mByteRtcAudioFrameObserver = new ByteRtcAudioFrameObserver(this);
            this.mByteRtcMetadataObserver = new ByteRtcMetadataObserver(this);
            long j = RtcSharedContext.getEGLContext().getEglBaseContext() != null ? RtcSharedContext.getEGLContext().getEglBaseContext().getNativeEglContext() : 0;
            Context applicationContext2 = this.mContext.getApplicationContext();
            ByteRtcEngineEventHandler byteRtcEngineEventHandler = this.mEngineEventHandler;
            EglBase.Context eglBaseContext = RtcSharedContext.getEGLContext().getEglBaseContext();
            if (jSONObject == null) {
                str2 = "";
            } else {
                str2 = jSONObject.toString();
            }
            long nativeCreateByteRtcEngine = NativeFunctions.nativeCreateByteRtcEngine(applicationContext2, str, byteRtcEngineEventHandler, eglBaseContext, j, str2);
            this.mNativeByteRtcEngine = nativeCreateByteRtcEngine;
            if (nativeCreateByteRtcEngine == -1) {
                LogUtil.m257130e("RtcEngineImpl", "create native engine error, native engine is invalid.");
            } else {
                NativeFunctions.nativeRegisterInternalEventObserver(nativeCreateByteRtcEngine, this.mEngineInternalEventHandler);
            }
            NetworkUtils.registerReceiver(context);
            AppMonitor.get(context).register(context, this.appStateCallback);
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("event_key", "rtc_error");
            jSONObject2.put("rtc_app_id", str);
            jSONObject2.put("device_id", mDeviceId);
            jSONObject2.put("error_code", -1072);
            jSONObject2.put("message", "rtc_sdk_load_so_failed");
            jSONObject2.put("timestamp", System.currentTimeMillis());
            jSONObject2.put("rtc_timestamp", System.currentTimeMillis());
            jSONObject2.put("os", "android");
            jSONObject2.put("product_line", "rtc");
            jSONObject2.put("report_version", 5);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        iRtcEngineEventHandler.onLogReport("live_webrtc_monitor_log", jSONObject2);
        iRtcEngineEventHandler.onError(-1072);
        LogUtil.m257130e("RtcEngineImpl", "Load so failed.");
        throw new IllegalStateException("Create engine failed");
    }
}
