package com.ss.android.vc.irtc.impl;

import android.content.Context;
import android.content.Intent;
import android.graphics.RectF;
import android.opengl.EGLContext;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import com.ss.android.lark.voip.service.impl.RtcEngineEncryption;
import com.ss.android.lark.voip.service.impl.sodium.NaCl;
import com.ss.android.lark.voip.service.impl.sodium.Sodium;
import com.ss.android.lark.voip.service.impl.sodium.keys.KeyPair;
import com.ss.android.vc.irtc.AbstractC61023b;
import com.ss.android.vc.irtc.AbstractC61024c;
import com.ss.android.vc.irtc.AbstractC61025d;
import com.ss.android.vc.irtc.AbstractC61026e;
import com.ss.android.vc.irtc.AbstractC61027f;
import com.ss.android.vc.irtc.AbstractC61028g;
import com.ss.android.vc.irtc.AbstractC61029h;
import com.ss.android.vc.irtc.AbstractC61030i;
import com.ss.android.vc.irtc.AbstractC61058j;
import com.ss.android.vc.irtc.AbstractC61059k;
import com.ss.android.vc.irtc.AbstractC61060l;
import com.ss.android.vc.irtc.AbstractC61061m;
import com.ss.android.vc.irtc.AbstractC61062n;
import com.ss.android.vc.irtc.AbstractC61063o;
import com.ss.android.vc.irtc.C61064p;
import com.ss.android.vc.irtc.C61065q;
import com.ss.android.vc.irtc.C61070t;
import com.ss.android.vc.irtc.C61071u;
import com.ss.android.vc.irtc.RtcConstants;
import com.ss.android.vc.irtc.RtcDevicePerfInfo;
import com.ss.android.vc.irtc.SubChannelInfo;
import com.ss.android.vc.irtc.VideoSolution;
import com.ss.android.vc.irtc.impl.audioroute.AudioRoutingWrapper;
import com.ss.android.vc.irtc.impl.pool.ByteArrayPool;
import com.ss.android.vc.irtc.impl.widget.AbsVideoViewRenderer;
import com.ss.android.vc.irtc.impl.widget.IRecalBaseFrameListener;
import com.ss.android.vc.irtc.impl.widget.IVideoRenderListener;
import com.ss.android.vc.irtc.impl.widget.IVideoSinkListener;
import com.ss.android.vc.irtc.impl.widget.VideoViewRendererFactory;
import com.ss.android.vc.irtc.impl.widget.utils.EnvUtils;
import com.ss.android.vc.irtc.impl.widget.utils.RenderCommonUtils;
import com.ss.android.vc.irtc.impl.widget.utils.ThreadUtils;
import com.ss.android.vc.irtc.impl.widget.utils.VideoFrameUtils;
import com.ss.android.vc.irtc.impl.widget.webrtc.AudioCaptureAndroid;
import com.ss.android.vc.irtc.impl.widget.webrtc.FrameCaptureRender;
import com.ss.android.vc.irtc.impl.widget.webrtc.ScreenShareManager;
import com.ss.android.vc.irtc.impl.widget.webrtc.VideoSinkManager;
import com.ss.android.vc.irtc.impl.widget.webrtc.VideoViewSurfaceRenderer;
import com.ss.android.vc.irtc.impl.widget.webrtc.YuvRecorder;
import com.ss.video.rtc.engine.EffectInfo;
import com.ss.video.rtc.engine.IAudioFrameTestObserver;
import com.ss.video.rtc.engine.SubscribeConfig;
import com.ss.video.rtc.engine.VideoStreamDescription;
import com.ss.video.rtc.engine.handler.IRtcEngineAudioDeviceEventHandler;
import com.ss.video.rtc.engine.handler.IRtcEngineEventHandler;
import com.ss.video.rtc.engine.loader.RtcNativeLibraryLoader;
import com.ss.video.rtc.engine.mediaio.RtcVideoFrame;
import com.ss.video.rtc.engine.utils.ByteAudioFrame;
import com.ss.video.rtc.engine.utils.DevicePerformanceInfo;
import com.ss.video.rtc.engine.utils.LogUtil;
import com.ss.video.rtc.meeting.IMeetingRtcEngineEventHandler;
import com.ss.video.rtc.meeting.IMetadataObserverEx;
import com.ss.video.rtc.meeting.MeetingRtcConstants;
import com.ss.video.rtc.meeting.MeetingRtcEngine;
import com.ss.video.rtc.meeting.MeetingRtcEngineImpl;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import org.libsodium.jni.SodiumJNI;

public class RtcServiceImpl implements AbstractC61061m {
    private static final RtcServiceImpl mInstance = new RtcServiceImpl();
    private static final float[] mTransform = {1.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, -1.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, -1.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f, BitmapDescriptorFactory.HUE_RED, 1.0f};
    private final ByteArrayPool byteArrayPool = new ByteArrayPool(20);
    private boolean isLarkDebug;
    private String mAppId;
    private AudioCaptureAndroid mAudioCapture;
    private IRtcEngineAudioDeviceEventHandler mAudioDeviceEventHandler;
    private final AudioRoutingWrapper mAudioRoutingWrapper = new AudioRoutingWrapper();
    private Context mContext;
    private final AbstractC61026e mDefaultLogCallback;
    public AbstractC61026e mLogCallback;
    private final LogUtil.LoggerSink mLogSink;
    private YuvRecorder mRecorder;
    private RtcResourceFinder mResourceFinder;
    private C61065q mRtcConfig;
    private volatile MeetingRtcEngine mRtcEngine;
    private volatile String mRtcSdkVersion;
    private ScreenShareManager mScreenShareManager;
    private int mVendorType;
    private AbstractC61063o mVoipCallback;
    private IMetadataObserverEx metadataObserverEx;
    private final RtcEngineEventHandler sHandlers;
    private final VideoSinkManager videoSinkManager;

    private void initByteArrayPool(String str) {
    }

    private void test() {
    }

    public void enableAutoSubscribe(boolean z) {
    }

    public void muteAllRemoteAudioStreams(boolean z) {
    }

    public void setDnsResults(Map<String, List<String>> map) {
    }

    public void setIsUsingTTnet(boolean z) {
    }

    public void setWSProxyInfo(int i, String str, int i2, String str2, String str3) {
    }

    public static RtcServiceImpl getInstance() {
        return mInstance;
    }

    public ByteArrayPool getByteArrayPool() {
        return this.byteArrayPool;
    }

    public Context getContext() {
        return this.mContext;
    }

    public AbstractC61063o getVoipCallback() {
        return this.mVoipCallback;
    }

    @Override // com.ss.android.vc.irtc.AbstractC61061m
    public void sodium() {
        NaCl.sodium();
    }

    @Override // com.ss.android.vc.irtc.AbstractC61061m
    public void closeAudioRoute() {
        this.mAudioRoutingWrapper.uninitialize();
    }

    public View createRenderView() {
        return createRenderView(false);
    }

    @Override // com.ss.android.vc.irtc.AbstractC61061m
    public int crypto_kx_sessionkeybytes() {
        return SodiumJNI.crypto_kx_sessionkeybytes();
    }

    @Override // com.ss.android.vc.irtc.AbstractC61061m
    public String getEffectSDKVersion() {
        return MeetingRtcEngine.getEffectSDKVersion();
    }

    public AbstractC61026e getLogCallback() {
        AbstractC61026e eVar = this.mLogCallback;
        if (eVar != null) {
            return eVar;
        }
        return this.mDefaultLogCallback;
    }

    /* access modifiers changed from: protected */
    public synchronized MeetingRtcEngine getRtcEngine() {
        return this.mRtcEngine;
    }

    public RtcConstants.Status getRtcStatus() {
        return this.sHandlers.getRtcStatus();
    }

    public boolean isRTCEngineAlive() {
        if (this.mRtcEngine != null) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.vc.irtc.AbstractC61061m
    public KeyPair newKeyPair() {
        return new KeyPair();
    }

    @Override // com.ss.android.vc.irtc.AbstractC61061m
    public void openAudioRoute() {
        this.mAudioRoutingWrapper.initialize();
    }

    @Override // com.ss.android.vc.irtc.AbstractC61061m
    public void stopAudioCapture() {
        AudioCaptureAndroid audioCaptureAndroid = this.mAudioCapture;
        if (audioCaptureAndroid != null) {
            audioCaptureAndroid.stopAudioCapture();
        }
    }

    @Override // com.ss.android.vc.irtc.AbstractC61061m
    public void stopScreenCapturer() {
        ScreenShareManager screenShareManager = this.mScreenShareManager;
        if (screenShareManager != null) {
            screenShareManager.stopScreenCapturer();
        }
    }

    @Override // com.ss.android.vc.irtc.AbstractC61061m
    public void disableEncryption() {
        sodium();
        if (NaCl.isSoLoaded()) {
            RtcEngineEncryption.disableEncryption();
        }
    }

    @Override // com.ss.android.vc.irtc.AbstractC61061m
    public void enableEncryption() {
        sodium();
        if (NaCl.isSoLoaded()) {
            RtcEngineEncryption.enableEncryption(0);
        }
    }

    public long getNativeHandle() {
        C61064p.m237487c("RtcServiceImpl", "Unimplemented getNativeHandle");
        return -1;
    }

    public boolean isSharing() {
        ScreenShareManager screenShareManager = this.mScreenShareManager;
        if (screenShareManager == null || !screenShareManager.isSharing()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.vc.irtc.AbstractC61061m
    public void leaveBreakDownRoom() {
        MeetingRtcEngine rtcEngine = getRtcEngine();
        if (rtcEngine != null) {
            rtcEngine.leaveBreakDownRoom();
        }
    }

    public int startAudioRecordFrameListen() {
        if (this.mRtcEngine != null) {
            return this.mRtcEngine.startAudioRecordFrameListen();
        }
        return -1;
    }

    public int stopAudioRecordFrameListen() {
        if (this.mRtcEngine != null) {
            return this.mRtcEngine.stopAudioRecordFrameListen();
        }
        return -1;
    }

    public void stopHardwareEchoTest() {
        if (this.mRtcEngine != null) {
            this.mRtcEngine.stopHardwareEchoTest();
        }
    }

    private void checkNPE() {
        if (this.isLarkDebug) {
            AbstractC61026e eVar = this.mLogCallback;
            if (eVar != null) {
                eVar.logI("RtcServiceImpl", "checkNPE");
            }
            throw new RuntimeException("RtcServiceImpl checkNPE");
        }
    }

    @Override // com.ss.android.vc.irtc.AbstractC61061m
    public String getSdkVersion() {
        if (TextUtils.isEmpty(this.mRtcSdkVersion)) {
            this.mRtcSdkVersion = MeetingRtcEngineImpl.getSDKVersion();
        }
        return this.mRtcSdkVersion;
    }

    @Override // com.ss.android.vc.irtc.AbstractC61061m
    public boolean isMuteLocalAudio() {
        this.mLogCallback.logD("RtcServiceImpl", "[isMuteLocalAudio]");
        if (this.mRtcEngine == null) {
            return false;
        }
        return getRtcEngine().isMuteLocalAudio();
    }

    @Override // com.ss.android.vc.irtc.AbstractC61061m
    public boolean isMuteLocalVideo() {
        this.mLogCallback.logD("RtcServiceImpl", "[isMuteLocalVideo]");
        if (this.mRtcEngine == null) {
            return false;
        }
        return getRtcEngine().isMuteLocalVideo();
    }

    @Override // com.ss.android.vc.irtc.AbstractC61061m
    public void leaveChannel() {
        this.mLogCallback.logD("RtcServiceImpl", "[leaveChannel]");
        if (this.mRtcEngine != null) {
            getRtcEngine().leaveChannel();
            this.videoSinkManager.reset();
        }
    }

    @Override // com.ss.android.vc.irtc.AbstractC61061m
    public void startPreview() {
        this.mLogCallback.logD("RtcServiceImpl", "[startPreview]");
        if (this.mRtcEngine != null) {
            getRtcEngine().startPreview();
        }
    }

    @Override // com.ss.android.vc.irtc.AbstractC61061m
    public void stopPreview() {
        this.mLogCallback.logD("RtcServiceImpl", "[stopPreview]");
        MeetingRtcEngine meetingRtcEngine = this.mRtcEngine;
        if (meetingRtcEngine != null) {
            meetingRtcEngine.stopPreview();
        }
    }

    @Override // com.ss.android.vc.irtc.AbstractC61061m
    public void switchCamera() {
        this.mLogCallback.logD("RtcServiceImpl", "[switchCamera]");
        if (this.mRtcEngine != null) {
            getRtcEngine().switchCamera();
        }
    }

    /* renamed from: com.ss.android.vc.irtc.impl.RtcServiceImpl$10  reason: invalid class name */
    static /* synthetic */ class AnonymousClass10 {
        static final /* synthetic */ int[] $SwitchMap$com$ss$video$rtc$engine$handler$IRtcEngineEventHandler$RtcLogLevel;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.ss.video.rtc.engine.handler.IRtcEngineEventHandler$RtcLogLevel[] r0 = com.ss.video.rtc.engine.handler.IRtcEngineEventHandler.RtcLogLevel.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.vc.irtc.impl.RtcServiceImpl.AnonymousClass10.$SwitchMap$com$ss$video$rtc$engine$handler$IRtcEngineEventHandler$RtcLogLevel = r0
                com.ss.video.rtc.engine.handler.IRtcEngineEventHandler$RtcLogLevel r1 = com.ss.video.rtc.engine.handler.IRtcEngineEventHandler.RtcLogLevel.RTC_LOG_LEVEL_TRACE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.vc.irtc.impl.RtcServiceImpl.AnonymousClass10.$SwitchMap$com$ss$video$rtc$engine$handler$IRtcEngineEventHandler$RtcLogLevel     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.video.rtc.engine.handler.IRtcEngineEventHandler$RtcLogLevel r1 = com.ss.video.rtc.engine.handler.IRtcEngineEventHandler.RtcLogLevel.RTC_LOG_LEVEL_DEBUG     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.ss.android.vc.irtc.impl.RtcServiceImpl.AnonymousClass10.$SwitchMap$com$ss$video$rtc$engine$handler$IRtcEngineEventHandler$RtcLogLevel     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.ss.video.rtc.engine.handler.IRtcEngineEventHandler$RtcLogLevel r1 = com.ss.video.rtc.engine.handler.IRtcEngineEventHandler.RtcLogLevel.RTC_LOG_LEVEL_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.ss.android.vc.irtc.impl.RtcServiceImpl.AnonymousClass10.$SwitchMap$com$ss$video$rtc$engine$handler$IRtcEngineEventHandler$RtcLogLevel     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.ss.video.rtc.engine.handler.IRtcEngineEventHandler$RtcLogLevel r1 = com.ss.video.rtc.engine.handler.IRtcEngineEventHandler.RtcLogLevel.RTC_LOG_LEVEL_WARNING     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = com.ss.android.vc.irtc.impl.RtcServiceImpl.AnonymousClass10.$SwitchMap$com$ss$video$rtc$engine$handler$IRtcEngineEventHandler$RtcLogLevel     // Catch:{ NoSuchFieldError -> 0x003e }
                com.ss.video.rtc.engine.handler.IRtcEngineEventHandler$RtcLogLevel r1 = com.ss.video.rtc.engine.handler.IRtcEngineEventHandler.RtcLogLevel.RTC_LOG_LEVEL_ERROR     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vc.irtc.impl.RtcServiceImpl.AnonymousClass10.<clinit>():void");
        }
    }

    public RtcServiceImpl() {
        VideoSinkManager videoSinkManager2 = new VideoSinkManager();
        this.videoSinkManager = videoSinkManager2;
        this.sHandlers = new RtcEngineEventHandler(videoSinkManager2);
        this.mResourceFinder = null;
        this.isLarkDebug = false;
        C610331 r0 = new AbstractC61026e() {
            /* class com.ss.android.vc.irtc.impl.RtcServiceImpl.C610331 */

            @Override // com.ss.android.vc.irtc.AbstractC61026e
            public void logD(String str, String str2) {
                Log.d(str, str2);
            }

            @Override // com.ss.android.vc.irtc.AbstractC61026e
            public void logE(String str, String str2) {
                Log.e(str, str2);
            }

            @Override // com.ss.android.vc.irtc.AbstractC61026e
            public void logI(String str, String str2) {
                Log.i(str, str2);
            }

            @Override // com.ss.android.vc.irtc.AbstractC61026e
            public void monitor(String str, JSONObject jSONObject) {
                String str2;
                if (jSONObject != null) {
                    str2 = jSONObject.toString();
                } else {
                    str2 = "";
                }
                logI(str, str2);
            }

            @Override // com.ss.android.vc.irtc.AbstractC61026e
            public void statistics(String str, JSONObject jSONObject) {
                String str2;
                String str3 = "statistics_" + str;
                if (jSONObject == null) {
                    str2 = "";
                } else {
                    str2 = jSONObject.toString();
                }
                Log.d(str3, str2);
            }
        };
        this.mDefaultLogCallback = r0;
        this.mLogSink = new LogUtil.LoggerSink() {
            /* class com.ss.android.vc.irtc.impl.RtcServiceImpl.C610342 */
            private final String tag = "rtc_sdk";

            @Override // com.ss.video.rtc.engine.utils.LogUtil.LoggerSink
            public void onLoggerMessage(IRtcEngineEventHandler.RtcLogLevel rtcLogLevel, String str, Throwable th) {
                int i = AnonymousClass10.$SwitchMap$com$ss$video$rtc$engine$handler$IRtcEngineEventHandler$RtcLogLevel[rtcLogLevel.ordinal()];
                if (i == 1 || i == 2) {
                    RtcServiceImpl.this.mLogCallback.logD("rtc_sdk", str);
                    if (th != null) {
                        AbstractC61026e eVar = RtcServiceImpl.this.mLogCallback;
                        eVar.logD("rtc_sdk", "[Throwable]" + th.toString());
                    }
                } else if (i == 3 || i == 4) {
                    RtcServiceImpl.this.mLogCallback.logI("rtc_sdk", str);
                    if (th != null) {
                        AbstractC61026e eVar2 = RtcServiceImpl.this.mLogCallback;
                        eVar2.logI("rtc_sdk", "[Throwable]" + th.toString());
                    }
                } else if (i == 5) {
                    RtcServiceImpl.this.mLogCallback.logE("rtc_sdk", str);
                    if (th != null) {
                        AbstractC61026e eVar3 = RtcServiceImpl.this.mLogCallback;
                        eVar3.logE("rtc_sdk", "[Throwable]" + th.toString());
                    }
                }
            }
        };
        this.mLogCallback = r0;
        this.mRtcConfig = new C61065q();
    }

    private void destroyRtcEngine() {
        YuvRecorder yuvRecorder;
        synchronized (this) {
            this.videoSinkManager.setRtcEngine(null);
            this.mRtcEngine = null;
            this.mAppId = "";
        }
        MeetingRtcEngine.destroy();
        if (YuvRecorder.DEBUG && (yuvRecorder = this.mRecorder) != null) {
            yuvRecorder.release();
        }
        ScreenShareManager screenShareManager = this.mScreenShareManager;
        if (screenShareManager != null) {
            screenShareManager.destroy();
        }
        AudioCaptureAndroid audioCaptureAndroid = this.mAudioCapture;
        if (audioCaptureAndroid != null) {
            audioCaptureAndroid.destroy();
            this.mAudioCapture = null;
        }
    }

    @Override // com.ss.android.vc.irtc.AbstractC61061m
    public RtcDevicePerfInfo getDevicePerformanceInfo() {
        DevicePerformanceInfo devicePerformanceInfo = MeetingRtcEngine.getDevicePerformanceInfo();
        if (devicePerformanceInfo == null) {
            return null;
        }
        RtcDevicePerfInfo rtcDevicePerfInfo = new RtcDevicePerfInfo();
        rtcDevicePerfInfo.cpuCores = devicePerformanceInfo.cpuCores;
        rtcDevicePerfInfo.cpuFrequency = devicePerformanceInfo.cpuFrequency;
        rtcDevicePerfInfo.cpuModel = devicePerformanceInfo.cpuModel;
        rtcDevicePerfInfo.cpuThreads = devicePerformanceInfo.cpuThreads;
        rtcDevicePerfInfo.deviceModel = devicePerformanceInfo.deviceModel;
        rtcDevicePerfInfo.gpuModel = devicePerformanceInfo.gpuModel;
        rtcDevicePerfInfo.memory = devicePerformanceInfo.memory;
        rtcDevicePerfInfo.os = devicePerformanceInfo.os;
        rtcDevicePerfInfo.osVersion = devicePerformanceInfo.osVersion;
        return rtcDevicePerfInfo;
    }

    @Override // com.ss.android.vc.irtc.AbstractC61061m
    public synchronized void reset() {
        if (this.mRtcEngine != null && !TextUtils.isEmpty(this.mAppId)) {
            int hashCode = this.mRtcEngine.hashCode();
            AbstractC61026e eVar = this.mLogCallback;
            eVar.logI("RtcServiceImpl", "[resetByteRtcSdk] " + hashCode);
            destroyRtcEngine();
            this.mLogCallback.logI("RtcServiceImpl", "[resetByteRtcSdk] destroyRtcEngine done");
            this.videoSinkManager.reset();
            AbstractC61026e eVar2 = this.mLogCallback;
            eVar2.logI("RtcServiceImpl", "[resetByteRtcSdk] done " + hashCode);
        }
    }

    public void setLarkDebug(boolean z) {
        this.isLarkDebug = z;
    }

    @Override // com.ss.android.vc.irtc.AbstractC61061m
    public void setRtcDirPath(String str) {
        MeetingRtcEngine.setRtcDirPath(str);
    }

    @Override // com.ss.android.vc.irtc.AbstractC61061m
    public void setRtcDomainConfig(String str) {
        MeetingRtcEngine.setHostName(str);
    }

    @Override // com.ss.android.vc.irtc.AbstractC61061m
    public void setRtcFGConfig(String str) {
        MeetingRtcEngine.setRtcFGConfig(str);
    }

    @Override // com.ss.android.vc.irtc.AbstractC61061m
    public void setVoipCallback(AbstractC61063o oVar) {
        this.mVoipCallback = oVar;
    }

    @Override // com.ss.android.vc.irtc.AbstractC61061m
    public void enableSpeaker(boolean z) {
        this.mAudioRoutingWrapper.setEnableSpeakerphone(z);
    }

    @Override // com.ss.android.vc.irtc.AbstractC61061m
    public void setCaptureStatusCallback(AbstractC61023b bVar) {
        ScreenShareManager screenShareManager = this.mScreenShareManager;
        if (screenShareManager != null) {
            screenShareManager.setCaptureStatusCallback(bVar);
        }
    }

    public void setDefaultAudioRouteToSpeakerPhone(boolean z) {
        this.mAudioRoutingWrapper.setDefaultAudioRouteToSpeakerPhone(z);
    }

    @Override // com.ss.android.vc.irtc.AbstractC61061m
    public void setLocalRotation(int i) {
        VideoSinkManager videoSinkManager2 = this.videoSinkManager;
        if (videoSinkManager2 != null) {
            videoSinkManager2.setLocalRotation(i);
        }
    }

    @Override // com.ss.android.vc.irtc.AbstractC61061m
    public void setPlaybackDigitalMute(boolean z) {
        MeetingRtcEngine meetingRtcEngine = this.mRtcEngine;
        if (meetingRtcEngine != null) {
            meetingRtcEngine.setPlaybackDigitalMute(z);
        }
    }

    @Override // com.ss.android.vc.irtc.AbstractC61061m
    public void cancelEffect(String str) {
        if (this.mRtcEngine != null) {
            this.mRtcEngine.cancelEffect(str);
        }
    }

    public void changeMicroVolume(int i) {
        if (this.mRtcEngine != null) {
            this.mRtcEngine.adjustRecordingSignalVolume(i);
        }
    }

    @Override // com.ss.android.vc.irtc.AbstractC61061m
    public View createRenderView(boolean z) {
        if (z) {
            return VideoViewRendererFactory.createSurfaceRenderer(this.mContext);
        }
        return VideoViewRendererFactory.createTextureRenderer(this.mContext);
    }

    @Override // com.ss.android.vc.irtc.AbstractC61061m
    public void enableBackgroundBlur(boolean z) {
        MeetingRtcEngine rtcEngine = getRtcEngine();
        if (rtcEngine != null) {
            rtcEngine.enableBackgroundBlur(z);
        }
    }

    @Override // com.ss.android.vc.irtc.AbstractC61061m
    public void enableLocalAudio(boolean z) {
        if (this.mRtcEngine != null) {
            this.mRtcEngine.enableLocalAudio(z);
        }
    }

    @Override // com.ss.android.vc.irtc.AbstractC61061m
    public void enableLocalVideo(boolean z) {
        if (this.mRtcEngine != null) {
            this.mRtcEngine.enableLocalVideo(z);
        }
    }

    @Override // com.ss.android.vc.irtc.AbstractC61061m
    public void initInMainProcess(Context context) {
        this.mContext = context;
        EnvUtils.configEnv(context);
        this.mAudioRoutingWrapper.initInMainProcess(context);
    }

    @Override // com.ss.android.vc.irtc.AbstractC61061m
    public void registerListener(AbstractC61058j jVar) {
        this.sHandlers.addListener(jVar.hashCode(), jVar);
    }

    public void sendRoomBinaryMessage(byte[] bArr) {
        if (this.mRtcEngine != null) {
            this.mRtcEngine.sendBinaryMessageToRoom(bArr);
        }
    }

    public void sendRoomMessage(String str) {
        if (this.mRtcEngine != null) {
            this.mRtcEngine.sendMessageToRoom(str);
        }
    }

    public void setAudioDataTestEventHandler(final AbstractC61029h hVar) {
        if (this.mRtcEngine != null) {
            this.mRtcEngine.setAudioDataEventHandler(new IAudioFrameTestObserver() {
                /* class com.ss.android.vc.irtc.impl.RtcServiceImpl.C610408 */

                @Override // com.ss.video.rtc.engine.IAudioFrameTestObserver
                public void onAudioRecordFrame(ByteAudioFrame byteAudioFrame) {
                    AbstractC61029h hVar = hVar;
                    if (hVar != null) {
                        hVar.mo210656a(VideoFrameUtils.convert2VcAudioFrame(byteAudioFrame));
                    }
                }

                @Override // com.ss.video.rtc.engine.IAudioFrameTestObserver
                public void onLocalAudioVolume(int i, int i2) {
                    AbstractC61029h hVar = hVar;
                    if (hVar != null) {
                        hVar.mo210655a(i, i2);
                    }
                }

                @Override // com.ss.video.rtc.engine.IAudioFrameTestObserver
                public boolean onPlayoutBufferSink(int i, ByteAudioFrame byteAudioFrame) {
                    if (hVar == null) {
                        return false;
                    }
                    C61070t convert2VcAudioFrame = VideoFrameUtils.convert2VcAudioFrame(byteAudioFrame);
                    boolean a = hVar.mo210657a(i, convert2VcAudioFrame);
                    VideoFrameUtils.audioFrameCopyFromVc(byteAudioFrame, convert2VcAudioFrame);
                    return a;
                }
            });
        }
    }

    @Override // com.ss.android.vc.irtc.AbstractC61061m
    public void setBackgroundImage(String str) {
        MeetingRtcEngine rtcEngine = getRtcEngine();
        if (rtcEngine != null) {
            rtcEngine.setBackgroundImage(str);
        }
    }

    @Override // com.ss.android.vc.irtc.AbstractC61061m
    public void setCaptureDevice(int i) {
        if (this.mRtcEngine != null) {
            this.mRtcEngine.setCaptureDevice(i);
        }
    }

    public void setChannelProfile(int i) {
        if (this.mRtcEngine != null) {
            this.mRtcEngine.setChannelProfile(i);
        }
    }

    @Override // com.ss.android.vc.irtc.AbstractC61061m
    public int setClientRole(int i) {
        if (this.mRtcEngine != null) {
            return this.mRtcEngine.setClientRole(i);
        }
        return -1;
    }

    public void setDecoderMode(int i) {
        if (this.mRtcEngine != null) {
            this.mRtcEngine.forceSetDecoderMode(VideoStreamDescription.CodecMode.convertFromInt(i));
        }
    }

    public void setFaceBeautyLevel(int i) {
        MeetingRtcEngine rtcEngine = getRtcEngine();
        if (rtcEngine != null) {
            rtcEngine.setFaceBeautyLevel(i);
        }
    }

    @Override // com.ss.android.vc.irtc.AbstractC61061m
    public int setLocalVideoMirrorMode(int i) {
        if (this.mRtcEngine != null) {
            return this.mRtcEngine.setLocalVideoMirrorMode(i);
        }
        return 0;
    }

    @Override // com.ss.android.vc.irtc.AbstractC61061m
    public void setMicrophoneName(String str) {
        if (this.mRtcEngine != null) {
            this.mRtcEngine.setMicrophoneName(str);
        }
    }

    @Override // com.ss.android.vc.irtc.AbstractC61061m
    public void setPublishChannel(String str) {
        if (this.mRtcEngine != null) {
            this.mRtcEngine.setPublishChannel(str);
        }
    }

    public void setRtcNativeLibraryLoader(final AbstractC61059k kVar) {
        MeetingRtcEngine.setRtcNativeLibraryLoader(new RtcNativeLibraryLoader() {
            /* class com.ss.android.vc.irtc.impl.RtcServiceImpl.C610397 */

            @Override // org.webrtc.NativeLibraryLoader, com.ss.video.rtc.engine.loader.RtcNativeLibraryLoader
            public boolean load(String str) {
                return kVar.mo211277a(str);
            }
        });
    }

    @Override // com.ss.android.vc.irtc.AbstractC61061m
    public void setSpeakerName(String str) {
        if (this.mRtcEngine != null) {
            this.mRtcEngine.setSpeakerName(str);
        }
    }

    public int startAudioPlayoutExternSource(int i) {
        if (this.mRtcEngine != null) {
            return this.mRtcEngine.startAudioPlayoutExternSource(i);
        }
        return -1;
    }

    public void startHardwareEchoTest(String str) {
        if (this.mRtcEngine != null) {
            this.mRtcEngine.startHardwareEchoTest(str);
        }
    }

    public int stopAudioPlayoutExternSource(int i) {
        if (this.mRtcEngine != null) {
            return this.mRtcEngine.stopAudioPlayoutExternSource(i);
        }
        return -1;
    }

    @Override // com.ss.android.vc.irtc.AbstractC61061m
    public void unregisterListener(AbstractC61058j jVar) {
        this.sHandlers.removeListener(jVar.hashCode());
    }

    public int enableInEarMonitoring(boolean z) {
        AbstractC61026e eVar = this.mLogCallback;
        eVar.logD("RtcServiceImpl", "[enableInEarMonitoring] enable = " + z);
        return 0;
    }

    @Override // com.ss.android.vc.irtc.AbstractC61061m
    public void setDeviceOrientation(int i) {
        if (this.mRtcEngine == null) {
            return;
        }
        if (i == 0 || i == 90 || i == 180 || i == 270) {
            this.mRtcEngine.setDeviceOrientation(i);
        }
    }

    @Override // com.ss.android.vc.irtc.AbstractC61061m
    public void setLogCallback(AbstractC61026e eVar) {
        if (eVar != null) {
            this.mLogCallback = eVar;
            this.sHandlers.setCallback(eVar);
            return;
        }
        AbstractC61026e eVar2 = this.mDefaultLogCallback;
        this.mLogCallback = eVar2;
        this.sHandlers.setCallback(eVar2);
    }

    @Override // com.ss.android.vc.irtc.AbstractC61061m
    public void startAudioCapture(Intent intent) {
        if (this.mAudioCapture == null) {
            this.mAudioCapture = AudioCaptureAndroid.create(getContext(), this.mRtcEngine);
        }
        this.mAudioCapture.setRtcEngine(this.mRtcEngine).startAudioCapture(intent, this.mScreenShareManager);
    }

    @Override // com.ss.android.vc.irtc.AbstractC61061m
    public void unbindRenderView(View view) {
        if (view == null) {
            C61064p.m237485a("RtcServiceImpl", "[unbindRenderView]view is null");
            return;
        }
        ThreadUtils.checkIsOnMainThreadSafely("[unbindRenderView]");
        this.videoSinkManager.unbindRenderView((AbsVideoViewRenderer) view);
    }

    public void enableVideo(boolean z) {
        if (this.mRtcEngine != null) {
            if (z) {
                getRtcEngine().enableVideo();
                this.mAudioRoutingWrapper.enableVideo();
                return;
            }
            getRtcEngine().disableVideo();
            this.mAudioRoutingWrapper.disableVideo();
        }
    }

    @Override // com.ss.android.vc.irtc.AbstractC61061m
    public void muteAudio(boolean z) {
        AbstractC61026e eVar = this.mLogCallback;
        eVar.logD("RtcServiceImpl", "[muteAudio] isMute = " + z);
        if (this.mRtcEngine != null) {
            getRtcEngine().muteLocalAudioStream(z);
        }
    }

    @Override // com.ss.android.vc.irtc.AbstractC61061m
    public void muteCamera(boolean z) {
        AbstractC61026e eVar = this.mLogCallback;
        eVar.logD("RtcServiceImpl", "[muteCamera] isMute = " + z);
        MeetingRtcEngine meetingRtcEngine = this.mRtcEngine;
        if (meetingRtcEngine != null) {
            meetingRtcEngine.muteLocalVideoStream(z);
            this.mAudioRoutingWrapper.muteLocalVideoStream(z);
        }
    }

    @Override // com.ss.android.vc.irtc.AbstractC61061m
    public void registerMetadataObserverEx(final AbstractC61027f fVar) {
        this.mLogCallback.logD("RtcServiceImpl", "[registerMetadataObserverEx]");
        if (fVar != null) {
            this.metadataObserverEx = new IMetadataObserverEx() {
                /* class com.ss.android.vc.irtc.impl.RtcServiceImpl.C610419 */

                @Override // com.ss.video.rtc.meeting.IMetadataObserverEx
                public byte[] onReadyToSendMetadata(long j, boolean z) {
                    return fVar.onReadyToSendMetadata(j, z);
                }

                @Override // com.ss.video.rtc.meeting.IMetadataObserverEx
                public void onMetadataReceived(byte[] bArr, String str, long j, boolean z) {
                    fVar.onMetadataReceived(bArr, str, j, z);
                }
            };
            if (this.mRtcEngine != null) {
                this.mRtcEngine.registerMetadataObserverEx(this.metadataObserverEx);
                return;
            }
            return;
        }
        if (this.mRtcEngine != null) {
            this.mRtcEngine.registerMetadataObserverEx(null);
        }
        this.metadataObserverEx = null;
    }

    public void setAudioDeviceListener(final AbstractC61028g gVar) {
        if (this.mRtcEngine != null) {
            Log.d("RtcServiceImpl", "setAudioDeviceListener");
            this.mAudioDeviceEventHandler = new IRtcEngineAudioDeviceEventHandler() {
                /* class com.ss.android.vc.irtc.impl.RtcServiceImpl.C610386 */

                @Override // com.ss.video.rtc.engine.handler.IRtcEngineAudioDeviceEventHandler
                public void onAudioDevicePlayoutStart() {
                    Log.d("RtcServiceImpl", "onAudioDevicePlayoutStart");
                    AbstractC61028g gVar = gVar;
                    if (gVar != null) {
                        gVar.mo210653c();
                    }
                }

                @Override // com.ss.video.rtc.engine.handler.IRtcEngineAudioDeviceEventHandler
                public void onAudioDevicePlayoutStop() {
                    Log.d("RtcServiceImpl", "onAudioDevicePlayoutStop");
                    AbstractC61028g gVar = gVar;
                    if (gVar != null) {
                        gVar.mo210654d();
                    }
                }

                @Override // com.ss.video.rtc.engine.handler.IRtcEngineAudioDeviceEventHandler
                public void onAudioDeviceRecordStart() {
                    Log.d("RtcServiceImpl", "onAudioDeviceRecordStart");
                    AbstractC61028g gVar = gVar;
                    if (gVar != null) {
                        gVar.mo210651a();
                    }
                }

                @Override // com.ss.video.rtc.engine.handler.IRtcEngineAudioDeviceEventHandler
                public void onAudioDeviceRecordStop() {
                    Log.d("RtcServiceImpl", "onAudioDeviceRecordStop");
                    AbstractC61028g gVar = gVar;
                    if (gVar != null) {
                        gVar.mo210652b();
                    }
                }
            };
            if (getRtcEngine() != null) {
                getRtcEngine().setAudioDeviceEventHandler(this.mAudioDeviceEventHandler);
            } else {
                Log.d("RtcServiceImpl", "setAudioDeviceListener null!!!");
            }
        }
    }

    public int setEffectsVolume(int i) {
        AbstractC61026e eVar = this.mLogCallback;
        eVar.logD("RtcServiceImpl", "[setEffectsVolume] volume = " + i);
        if (this.mRtcEngine == null) {
            return -1;
        }
        return getRtcEngine().setEffectsVolume(i);
    }

    public void setEncoderVideoProfiles(VideoSolution[] videoSolutionArr) {
        VideoStreamDescription[] videoStreamDescriptionArr = new VideoStreamDescription[videoSolutionArr.length];
        for (int i = 0; i < videoSolutionArr.length; i++) {
            VideoSolution videoSolution = videoSolutionArr[i];
            videoStreamDescriptionArr[i] = new VideoStreamDescription(videoSolution.f152913a, videoSolution.f152914b, videoSolution.f152915c, videoSolution.f152916d, videoSolution.f152917e);
        }
        if (this.mRtcEngine != null) {
            this.mRtcEngine.forceSetEncoderVideoProfiles(videoStreamDescriptionArr);
        }
    }

    @Override // com.ss.android.vc.irtc.AbstractC61061m
    public void setResourceFinder(AbstractC61024c cVar) {
        RtcResourceFinder rtcResourceFinder = this.mResourceFinder;
        if (rtcResourceFinder == null) {
            if (cVar != null) {
                this.mResourceFinder = new RtcResourceFinder(cVar);
            }
        } else if (cVar != null) {
            rtcResourceFinder.setResourceFinder(cVar);
        } else {
            this.mResourceFinder = null;
        }
        if (this.mRtcEngine != null) {
            this.mRtcEngine.SetEffectResourceFinder(this.mResourceFinder);
        }
    }

    @Override // com.ss.android.vc.irtc.AbstractC61061m
    public void setSubChannels(SubChannelInfo[] subChannelInfoArr) {
        int length;
        if (this.mRtcEngine != null && (length = subChannelInfoArr.length) > 0) {
            com.ss.video.rtc.engine.SubChannelInfo[] subChannelInfoArr2 = new com.ss.video.rtc.engine.SubChannelInfo[length];
            for (int i = 0; i < length; i++) {
                subChannelInfoArr2[i] = new com.ss.video.rtc.engine.SubChannelInfo(subChannelInfoArr[i].f152905a, subChannelInfoArr[i].f152906b);
            }
            this.mRtcEngine.setSubChannels(subChannelInfoArr2);
        }
    }

    @Override // com.ss.android.vc.irtc.AbstractC61061m
    public int unloadEffect(int i) {
        AbstractC61026e eVar = this.mLogCallback;
        eVar.logD("RtcServiceImpl", "[unloadEffect] soundId = " + i);
        if (this.mRtcEngine == null) {
            return -1;
        }
        return getRtcEngine().unloadEffect(i);
    }

    public void unregisterListener(int i) {
        AbstractC61026e eVar = this.mLogCallback;
        eVar.logD("RtcServiceImpl", "[unregisterListener] before = " + this.sHandlers.getListeners().size());
        this.sHandlers.removeListener(i);
        AbstractC61026e eVar2 = this.mLogCallback;
        eVar2.logD("RtcServiceImpl", "[unregisterListener] after = " + this.sHandlers.getListeners().size());
    }

    @Override // com.ss.android.vc.irtc.AbstractC61061m
    public void enableAudioVolumeIndication(int i, int i2) {
        getRtcEngine().enableAudioVolumeIndication(i, i2);
    }

    public void statistics(String str, JSONObject jSONObject) {
        AbstractC61026e eVar = this.mLogCallback;
        if (eVar != null) {
            eVar.statistics(str, jSONObject);
        }
    }

    @Override // com.ss.android.vc.irtc.AbstractC61061m
    public int enableLocalAudioVolumeIndication(int i, int i2) {
        if (this.mRtcEngine != null) {
            return this.mRtcEngine.enableLocalAudioVolumeIndication(i, i2);
        }
        return 0;
    }

    @Override // com.ss.android.vc.irtc.AbstractC61061m
    public void forceFlipVideo(boolean z, boolean z2) {
        if (this.mRtcEngine != null) {
            this.mRtcEngine.forceFlipVideo(z, z2);
        }
    }

    @Override // com.ss.android.vc.irtc.AbstractC61061m
    public void forceSetCameraRotation(boolean z, boolean z2) {
        if (this.mRtcEngine != null) {
            this.mRtcEngine.forceSetCameraRotation(z, z2);
        }
    }

    @Override // com.ss.android.vc.irtc.AbstractC61061m
    public void joinBreakDownRoom(String str, boolean z) {
        MeetingRtcEngine rtcEngine = getRtcEngine();
        if (rtcEngine != null) {
            rtcEngine.joinBreakDownRoom(str, z);
        }
    }

    public void sendUserBinaryMessage(String str, byte[] bArr) {
        if (this.mRtcEngine != null) {
            this.mRtcEngine.sendBinaryMessageToUser(str, bArr);
        }
    }

    public void sendUserMessage(String str, String str2) {
        if (this.mRtcEngine != null) {
            this.mRtcEngine.sendMessageToUser(str, str2);
        }
    }

    @Override // com.ss.android.vc.irtc.AbstractC61061m
    public void setAutoRenderMode(View view, boolean z) {
        if (view instanceof AbsVideoViewRenderer) {
            ((AbsVideoViewRenderer) view).setAutoRenderMode(z);
        }
    }

    @Override // com.ss.android.vc.irtc.AbstractC61061m
    public void setEncryptKey(byte[] bArr, byte[] bArr2) {
        if (NaCl.isSoLoaded()) {
            RtcEngineEncryption.setEncryptKey(bArr, bArr2);
        }
    }

    @Override // com.ss.android.vc.irtc.AbstractC61061m
    public void setRenderMode(View view, int i) {
        if (view instanceof AbsVideoViewRenderer) {
            ((AbsVideoViewRenderer) view).setRenderMode(i);
        }
    }

    public boolean pullExternalAudioFrame(byte[] bArr, int i) {
        try {
            if (getRtcEngine() != null) {
                return getRtcEngine().pullExternalAudioFrame(bArr, i);
            }
            Log.d("RtcServiceImpl", "pullExternalAudioFrame null!!!");
            return false;
        } catch (Exception e) {
            e.printStackTrace();
            checkNPE();
            return false;
        }
    }

    public boolean pushExternalAudioFrame(byte[] bArr, int i) {
        try {
            if (getRtcEngine() != null) {
                return getRtcEngine().pushExternalAudioFrame(bArr, i);
            }
            Log.d("RtcServiceImpl", "pushExternalAudioFrame null!!!");
            return false;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override // com.ss.android.vc.irtc.AbstractC61061m
    public void renderFrame(View view, C61071u uVar) {
        if (view != null && (view instanceof VideoViewSurfaceRenderer) && uVar != null) {
            ((VideoViewSurfaceRenderer) view).renderFrame(VideoFrameUtils.convert2VideoFrame(uVar));
        }
    }

    @Override // com.ss.android.vc.irtc.AbstractC61061m
    public void setBaseFrameListener(View view, final AbstractC61060l lVar) {
        AbsVideoViewRenderer absVideoViewRenderer = (AbsVideoViewRenderer) view;
        if (lVar == null) {
            absVideoViewRenderer.setRecalBaseFrameListener(null);
        } else {
            absVideoViewRenderer.setRecalBaseFrameListener(new IRecalBaseFrameListener() {
                /* class com.ss.android.vc.irtc.impl.RtcServiceImpl.C610375 */

                @Override // com.ss.android.vc.irtc.impl.widget.IRecalBaseFrameListener
                public void onBaseFrameRecal() {
                    lVar.mo211278a();
                }

                @Override // com.ss.android.vc.irtc.impl.widget.IRecalBaseFrameListener
                public void onContentBoundChanged(RectF rectF) {
                    lVar.mo211279a(rectF);
                }
            });
        }
    }

    @Override // com.ss.android.vc.irtc.AbstractC61061m
    public void setRemoteUserPriority(String str, RtcConstants.RemoteUserPriority remoteUserPriority) {
        MeetingRtcConstants.RemoteUserPriority remoteUserPriority2 = MeetingRtcConstants.RemoteUserPriority.kRemoteUserPriorityLow;
        if (remoteUserPriority == RtcConstants.RemoteUserPriority.MEDIUM) {
            remoteUserPriority2 = MeetingRtcConstants.RemoteUserPriority.kRemoteUserPriorityMedium;
        } else if (remoteUserPriority == RtcConstants.RemoteUserPriority.HIGH) {
            remoteUserPriority2 = MeetingRtcConstants.RemoteUserPriority.kRemoteUserPriorityHigh;
        }
        if (this.mRtcEngine != null) {
            this.mRtcEngine.SetRemoteUserPriority(str, remoteUserPriority2);
        }
    }

    @Override // com.ss.android.vc.irtc.AbstractC61061m
    public void setRenderListener(View view, final AbstractC61030i iVar) {
        AbsVideoViewRenderer absVideoViewRenderer = (AbsVideoViewRenderer) view;
        if (iVar == null) {
            absVideoViewRenderer.setRenderListener(null);
        } else {
            absVideoViewRenderer.setRenderListener(new IVideoRenderListener() {
                /* class com.ss.android.vc.irtc.impl.RtcServiceImpl.C610353 */

                @Override // com.ss.android.vc.irtc.impl.widget.IVideoRenderListener
                public void onBeginRender() {
                    AbstractC61030i iVar = iVar;
                    if (iVar != null) {
                        iVar.mo210658a();
                    }
                }

                @Override // com.ss.android.vc.irtc.impl.widget.IVideoRenderListener
                public void onEndRender() {
                    AbstractC61030i iVar = iVar;
                    if (iVar != null) {
                        iVar.mo210659b();
                    }
                }

                @Override // com.ss.android.vc.irtc.impl.widget.IVideoRenderListener
                public void onRenderFrame() {
                    AbstractC61030i iVar = iVar;
                    if (iVar != null) {
                        iVar.mo210661d();
                    }
                }

                @Override // com.ss.android.vc.irtc.impl.widget.IVideoRenderListener
                public void onVideoFrameSizeChanged() {
                    AbstractC61030i iVar = iVar;
                    if (iVar != null) {
                        iVar.mo210660c();
                    }
                }
            });
        }
    }

    public void setVideoSinkListener(String str, final AbstractC61062n nVar) {
        if (nVar == null) {
            this.videoSinkManager.setSinkListener(str, null);
        } else {
            this.videoSinkManager.setSinkListener(str, new IVideoSinkListener() {
                /* class com.ss.android.vc.irtc.impl.RtcServiceImpl.C610364 */

                @Override // com.ss.android.vc.irtc.impl.widget.IVideoSinkListener
                public void firstConsumeVideoFrame() {
                    AbstractC61062n nVar = nVar;
                    if (nVar != null) {
                        nVar.mo211280a();
                    }
                }
            });
        }
    }

    @Override // com.ss.android.vc.irtc.AbstractC61061m
    public synchronized boolean isByteRtcSdkInited(String str, int i) {
        if (this.mRtcEngine == null || TextUtils.isEmpty(this.mAppId)) {
            return false;
        }
        if (this.mAppId.equals(str) && i == this.mVendorType) {
            return true;
        }
        this.mLogCallback.logI("RtcServiceImpl", "[isByteRtcSdkInited] VOIP has inited, destroy!");
        return false;
    }

    @Override // com.ss.android.vc.irtc.AbstractC61061m
    public int preloadEffect(int i, String str) {
        AbstractC61026e eVar = this.mLogCallback;
        eVar.logD("RtcServiceImpl", "[preloadEffect] soundId = " + i + ", filePath = " + str);
        if (this.mRtcEngine == null) {
            return -1;
        }
        return getRtcEngine().preloadEffect(i, str);
    }

    @Override // com.ss.android.vc.irtc.AbstractC61061m
    public void setupLocalFrameCapturer(AbstractC61025d dVar, String str) {
        if (this.mRtcEngine != null) {
            if (dVar != null) {
                getRtcEngine().setupLocalVideoRender(new FrameCaptureRender(dVar), str);
                this.videoSinkManager.clearLocalVideoSink();
                return;
            }
            getRtcEngine().setupLocalVideoRender(null, str);
        }
    }

    @Override // com.ss.android.vc.irtc.AbstractC61061m
    public void setupLocalView(View view, String str) {
        ThreadUtils.checkIsOnMainThreadSafely("[setupLocalView]" + str + ", view = " + view);
        if (this.mRtcEngine != null) {
            ((AbsVideoViewRenderer) view).setBgColor(this.mContext.getResources().getColor(R.color.vc_preview_big_bg_grey));
            this.videoSinkManager.bindLocalRenderView(view, str);
        }
    }

    @Override // com.ss.android.vc.irtc.AbstractC61061m
    public void setupRemoteFrameCapturer(AbstractC61025d dVar, String str) {
        if (this.mRtcEngine != null) {
            if (dVar != null) {
                getRtcEngine().setupRemoteVideoRender(new FrameCaptureRender(dVar), str);
                this.videoSinkManager.clearVideoSink(str, false);
                return;
            }
            getRtcEngine().setupRemoteVideoRender(null, str);
        }
    }

    @Override // com.ss.android.vc.irtc.AbstractC61061m
    public void setupRemoteScreen(View view, String str) {
        ThreadUtils.checkIsOnMainThreadSafely("[setupRemoteScreen]" + str + ", view = " + view);
        if (this.mRtcEngine != null && view != null) {
            AbsVideoViewRenderer absVideoViewRenderer = (AbsVideoViewRenderer) view;
            if (absVideoViewRenderer != null) {
                absVideoViewRenderer.setRenderMode(0);
            }
            this.videoSinkManager.bindRenderView(view, str, true);
        }
    }

    @Override // com.ss.android.vc.irtc.AbstractC61061m
    public void setupRemoteView(View view, String str) {
        ThreadUtils.checkIsOnMainThreadSafely("[setupRemoteView]" + str + ", view = " + view);
        if (this.mRtcEngine != null && view != null) {
            this.videoSinkManager.bindRenderView(view, str, false);
        }
    }

    public void registerListener(int i, AbstractC61058j jVar) {
        AbstractC61026e eVar = this.mLogCallback;
        eVar.logD("RtcServiceImpl", "[registerListener] before = " + this.sHandlers.getListeners().size());
        Iterator<Map.Entry<Integer, AbstractC61058j>> it = this.sHandlers.getListeners().entrySet().iterator();
        while (it.hasNext()) {
            AbstractC61026e eVar2 = this.mLogCallback;
            eVar2.logD("RtcServiceImpl", "[registerListener] before = key = " + it.next().getKey());
        }
        this.sHandlers.addListener(i, jVar);
        AbstractC61026e eVar3 = this.mLogCallback;
        eVar3.logD("RtcServiceImpl", "[registerListener] after = " + this.sHandlers.getListeners().size());
        Iterator<Map.Entry<Integer, AbstractC61058j>> it2 = this.sHandlers.getListeners().entrySet().iterator();
        while (it2.hasNext()) {
            AbstractC61026e eVar4 = this.mLogCallback;
            eVar4.logD("RtcServiceImpl", "[registerListener] after = key = " + it2.next().getKey());
        }
    }

    public JSONObject buildReportHeader(String str, String str2, String str3) {
        return new JSONObject();
    }

    @Override // com.ss.android.vc.irtc.AbstractC61061m
    public void changeCapturerFormat(int i, int i2, int i3) {
        ScreenShareManager screenShareManager = this.mScreenShareManager;
        if (screenShareManager != null) {
            screenShareManager.changeCapturerFormat(i, i2, i3);
        }
    }

    private void setVendorType(int i, boolean z, String str) {
        this.mVendorType = i;
        if (i == 0) {
            MeetingRtcEngine.setVendorType(MeetingRtcConstants.VendorType.VENDOR_TYPE_RTC, z, str);
        } else if (i == 1) {
            MeetingRtcEngine.setVendorType(MeetingRtcConstants.VendorType.VENDOR_TYPE_LARKRTC, z, str);
        } else if (i == 2) {
            MeetingRtcEngine.setVendorType(MeetingRtcConstants.VendorType.VENDOR_TYPE_LARKPRERTC, z, str);
        } else if (i == 240) {
            MeetingRtcEngine.setVendorType(MeetingRtcConstants.VendorType.VENDOR_TYPE_TEST_PRE, z, str);
        } else if (i == 241) {
            MeetingRtcEngine.setVendorType(MeetingRtcConstants.VendorType.VENDOR_TYPE_TEST_GAUSS, z, str);
        } else if (i == 255) {
            MeetingRtcEngine.setVendorType(MeetingRtcConstants.VendorType.VENDOR_TYPE_TEST, z, str);
        }
    }

    @Override // com.ss.android.vc.irtc.AbstractC61061m
    public void setExternalVideoSource(boolean z, boolean z2, boolean z3, boolean z4) {
        if (this.mRtcEngine != null) {
            getRtcEngine().setExternalVideoSource(z, z2, z3, z4);
        }
    }

    public void startScreenCapturer(Intent intent, int i, int i2, int i3) {
        ScreenShareManager screenShareManager = this.mScreenShareManager;
        if (screenShareManager != null) {
            screenShareManager.startScreenCapturer(intent, i, i2, i3, -1);
        }
    }

    public boolean setExternalAudioDevice(boolean z, int i, int i2, int i3) {
        Log.d("RtcServiceImpl", "setExternalAudioDevice");
        if (getRtcEngine() != null) {
            return getRtcEngine().setExternalAudioDevice(z, i, i2, i3);
        }
        Log.d("RtcServiceImpl", "setExternalAudioDevice null!!!");
        return false;
    }

    @Override // com.ss.android.vc.irtc.AbstractC61061m
    public void subscribeStream(String str, int i, boolean z, boolean z2) {
        AbstractC61026e eVar = this.mLogCallback;
        eVar.logD("RtcServiceImpl", "[subscribeStream] streamId = " + str + ", isMicrophoneMute = " + z + ", isCameraMute = " + z2);
        if (this.mRtcEngine != null) {
            SubscribeConfig subscribeConfig = new SubscribeConfig();
            subscribeConfig.subAudio = !z;
            subscribeConfig.subVideo = !z2;
            subscribeConfig.videoIndex = i;
            if (this.mRtcEngine != null) {
                this.mRtcEngine.subscribeStream(str, subscribeConfig);
            }
        }
    }

    @Override // com.ss.android.vc.irtc.AbstractC61061m
    public void setProxyInfo(int i, String str, int i2, String str2, String str3) {
        MeetingRtcEngine.setProxyInfo(i, str, i2, str2, str3);
    }

    @Override // com.ss.android.vc.irtc.AbstractC61061m
    public int crypto_kx_client_session_keys(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        return Sodium.crypto_kx_client_session_keys(bArr, bArr2, bArr3, bArr4, bArr5);
    }

    @Override // com.ss.android.vc.irtc.AbstractC61061m
    public int crypto_kx_server_session_keys(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        return Sodium.crypto_kx_server_session_keys(bArr, bArr2, bArr3, bArr4, bArr5);
    }

    @Override // com.ss.android.vc.irtc.AbstractC61061m
    public void startScreenCapturer(Intent intent, int i, int i2, int i3, int i4) {
        ScreenShareManager screenShareManager = this.mScreenShareManager;
        if (screenShareManager != null) {
            screenShareManager.startScreenCapturer(intent, i, i2, i3, i4);
        }
    }

    @Override // com.ss.android.vc.irtc.AbstractC61061m
    public void joinChannel(String str, String str2, String str3, String str4, String str5) {
        AbstractC61026e eVar = this.mLogCallback;
        eVar.logD("RtcServiceImpl", "[joinChannel] channel = " + str + ", uid = " + str2);
        if (this.mRtcEngine != null) {
            getRtcEngine().joinChannel(str3, str, str4, str2, str5);
        }
    }

    @Override // com.ss.android.vc.irtc.AbstractC61061m
    public int playEffect(int i, String str, boolean z, int i2, int i3) {
        AbstractC61026e eVar = this.mLogCallback;
        eVar.logD("RtcServiceImpl", "[playEffect] soundId = , filePath = " + str + ", loopback = " + z + ", cycle = " + i2 + ", volume = " + i3);
        MeetingRtcEngine meetingRtcEngine = this.mRtcEngine;
        if (meetingRtcEngine == null) {
            return -1;
        }
        return meetingRtcEngine.playEffect(i, str, z, i2, i3);
    }

    public void pushExternalVideoFrame(EGLContext eGLContext, int i, int i2, int i3, int i4, long j, boolean z) {
        if (this.mRtcEngine != null) {
            RtcVideoFrame rtcVideoFrame = new RtcVideoFrame();
            rtcVideoFrame.eglContext14 = eGLContext;
            rtcVideoFrame.textureId = i;
            rtcVideoFrame.format = 10;
            rtcVideoFrame.stride = i2;
            rtcVideoFrame.height = i3;
            rtcVideoFrame.timestamp = j;
            rtcVideoFrame.rotation = i4;
            if (z) {
                rtcVideoFrame.transform = RenderCommonUtils.multiplyMatrices(mTransform, RenderCommonUtils.horizontalFlipMatrix());
            } else {
                rtcVideoFrame.transform = mTransform;
            }
            boolean z2 = YuvRecorder.DEBUG;
            try {
                getRtcEngine().pushExternalVideoFrame(rtcVideoFrame);
            } catch (Exception e) {
                e.printStackTrace();
                AbstractC61026e eVar = this.mLogCallback;
                if (eVar != null) {
                    eVar.logI("RtcServiceImpl", "pushExternalVideoFrame NPE");
                }
                checkNPE();
            }
        }
    }

    @Override // com.ss.android.vc.irtc.AbstractC61061m
    public void applyEffect(String str, String str2, String str3, int i, int[] iArr, String[] strArr, int i2, String str4) {
        MeetingRtcEngine meetingRtcEngine = this.mRtcEngine;
        if (meetingRtcEngine != null) {
            EffectInfo effectInfo = new EffectInfo(str, str2, str3, i, iArr, strArr);
            if (i2 == 0) {
                meetingRtcEngine.applyEffect(effectInfo, MeetingRtcConstants.EffectType.EFFECT_TYPE_BUILTIN, str4);
            } else if (i2 == 1) {
                meetingRtcEngine.applyEffect(effectInfo, MeetingRtcConstants.EffectType.EFFECT_TYPE_EXCLUSIVE, str4);
            }
        }
    }

    @Override // com.ss.android.vc.irtc.AbstractC61061m
    public synchronized void initByteRtcSdk(String str, String str2, int i, boolean z, boolean z2, boolean z3, boolean z4, String str3, C61065q qVar, String str4, boolean z5, String str5) {
        if (!isByteRtcSdkInited(str, i)) {
            AbstractC61026e eVar = this.mLogCallback;
            eVar.logI("RtcServiceImpl", "[initByteRtcSdk] rtcEngine Version = " + getSdkVersion());
            initByteRtcSdkInternal(str, str2, i, z, z2, z3, z4, str3, qVar, str4, z5, str5);
            this.mLogCallback.logI("RtcServiceImpl", "[initByteRtcSdk] done");
        }
    }

    private void initByteRtcSdkInternal(String str, String str2, int i, boolean z, boolean z2, boolean z3, boolean z4, String str3, C61065q qVar, String str4, boolean z5, String str5) {
        Object obj;
        this.mAppId = str;
        if (qVar != null) {
            this.mRtcConfig = qVar;
        }
        EnvUtils.configRtc(qVar);
        StringBuilder sb = new StringBuilder();
        sb.append("DeviceConfig: ");
        if (qVar == null) {
            obj = "null";
        } else {
            obj = qVar;
        }
        sb.append(obj);
        C61064p.m237485a("RtcServiceImpl", sb.toString());
        this.videoSinkManager.config(qVar);
        try {
            C61064p.m237485a("RtcServiceImpl", "[initByteRtcSdkInternal] venderType = " + i + ", desktopMode = " + z + ", audioWhiteList = " + str5);
            setVendorType(i, z2, str4);
            this.mRtcEngine = MeetingRtcEngine.create(this.mContext, str, this.sHandlers, (Object) null, str5);
            LogUtil.setLoggerSink(this.mLogSink);
            this.videoSinkManager.setRtcEngine(this.mRtcEngine);
            if (qVar != null && qVar.f152926d) {
                this.mRtcEngine.SetAecOption(MeetingRtcConstants.AecOption.AEC_OPTION_DISABLE);
                this.mRtcEngine.SetNsOption(MeetingRtcConstants.NsOption.NS_OPTION_DISABLE);
            }
            MeetingRtcEngine.setDeviceId(str2);
            this.mRtcEngine.setLogFileDir("");
            this.mRtcEngine.setLogFilter(IMeetingRtcEngineEventHandler.RtcLogLevel.RTC_LOG_LEVEL_INFO);
            if (!z5) {
                this.mRtcEngine.setChannelProfile(0);
            } else if ("rooms".equals(str4)) {
                this.mRtcEngine.setChannelProfile(4);
            } else {
                this.mRtcEngine.setChannelProfile(2);
            }
            this.mAudioRoutingWrapper.setChannelProfile(0);
            this.mRtcEngine.setClientRole(1);
            this.mRtcEngine.setExternalVideoSource(z4, true, true, z3);
            if (qVar != null && qVar.f152923a) {
                setDecoderMode(2);
            }
            initByteArrayPool(str3);
            if (z3) {
                this.mRtcEngine.enableVideo();
            } else {
                this.mRtcEngine.disableVideo();
            }
        } catch (Exception e) {
            this.mLogCallback.logE("RtcServiceImpl", e.getMessage());
            checkNPE();
        }
        if (YuvRecorder.DEBUG) {
            this.mRecorder = new YuvRecorder("push_external_" + hashCode());
        }
        ScreenShareManager screenShareManager = new ScreenShareManager();
        this.mScreenShareManager = screenShareManager;
        screenShareManager.init(getContext(), this.mRtcEngine);
        if (qVar != null && this.mRtcEngine != null && qVar.f152924b) {
            this.mRtcEngine.setSubscribeSpecialStream(new int[]{1});
        }
    }
}
