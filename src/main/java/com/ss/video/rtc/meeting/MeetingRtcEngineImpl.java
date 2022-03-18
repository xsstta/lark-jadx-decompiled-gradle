package com.ss.video.rtc.meeting;

import android.content.Context;
import android.content.pm.PackageManager;
import android.media.AudioManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.C1711a;
import com.bytedance.platform.godzilla.thread.C20339a;
import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import com.huawei.hms.location.LocationRequest;
import com.ss.video.rtc.base.utils.NetworkUtils;
import com.ss.video.rtc.engine.EffectInfo;
import com.ss.video.rtc.engine.IAudioFrameObserver;
import com.ss.video.rtc.engine.IAudioFrameTestObserver;
import com.ss.video.rtc.engine.IMetadataObserver;
import com.ss.video.rtc.engine.IRtcAudioDeviceManager;
import com.ss.video.rtc.engine.InternalVideoStreamDescription;
import com.ss.video.rtc.engine.RtcAudioDumpSampleConfig;
import com.ss.video.rtc.engine.RtcSharedContext;
import com.ss.video.rtc.engine.SubChannelInfo;
import com.ss.video.rtc.engine.SubscribeConfig;
import com.ss.video.rtc.engine.VideoCanvas;
import com.ss.video.rtc.engine.VideoStreamDescription;
import com.ss.video.rtc.engine.adapter.VideoSinkAdapter;
import com.ss.video.rtc.engine.adapter.VideoSinkTask;
import com.ss.video.rtc.engine.handler.ByteRtcAudioDeviceEventHandler;
import com.ss.video.rtc.engine.handler.ByteRtcVideoFrameObserver;
import com.ss.video.rtc.engine.handler.EngineAudioDeviceEventHandler;
import com.ss.video.rtc.engine.handler.IRtcEngineAudioDeviceEventHandler;
import com.ss.video.rtc.engine.handler.IRtcEngineEventHandler;
import com.ss.video.rtc.engine.live.LiveTranscoding;
import com.ss.video.rtc.engine.loader.RtcNativeLibraryListenerImpl;
import com.ss.video.rtc.engine.loader.RtcNativeLibraryLoader;
import com.ss.video.rtc.engine.loader.RtcNativeLibraryLoaderImpl;
import com.ss.video.rtc.engine.loader.RtcNativeLibraryLoaderListener;
import com.ss.video.rtc.engine.mediaio.IVideoSink;
import com.ss.video.rtc.engine.mediaio.RtcVideoFrame;
import com.ss.video.rtc.engine.utils.AppMonitor;
import com.ss.video.rtc.engine.utils.DevicePerformanceInfo;
import com.ss.video.rtc.engine.utils.LogUtil;
import com.ss.video.rtc.engine.utils.VideoFrameConverter;
import com.ss.video.rtc.engine.video.InternalRtcVideoFrame;
import com.ss.video.rtc.meeting.IMeetingRtcEngineEventHandler;
import com.ss.video.rtc.meeting.MeetingRtcConstants;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;
import org.webrtc.EglBase;
import org.webrtc.ThreadUtils;
import org.webrtc.VideoFrame;

public final class MeetingRtcEngineImpl extends MeetingRtcEngine {
    private static IAudioFrameTestObserver mAudioDataObserver;
    private static WeakReference<IRtcAudioDeviceManager.IRtcAudioDeviceEventHandler> mAudioDeviceManagerEventHandler;
    private static WeakReference<IAudioFrameObserver> mAudioFrameObserver;
    private static ByteRtcAudioDeviceEventHandler mByteAudioDeviceManagerEventHandler;
    private static String mDeviceId = "";
    private static MeetingRtcEngineImpl mInstance;
    private static boolean mIsDesktopMode = false;
    private static boolean mIsFront = true;
    private static boolean mIsVideoMirror = true;
    private static boolean mLibraryLoaded;
    private static WeakReference<IMetadataObserver> mMetadataObserver;
    private static WeakReference<IMetadataObserverEx> mMetadataObserverEx;
    private static RtcNativeLibraryLoaderListener mRtcNativeLibraryListener = new RtcNativeLibraryListenerImpl();
    protected static RtcNativeLibraryLoader mRtcNativeLibraryLoader = new RtcNativeLibraryLoaderImpl();
    private static String rtcPath = null;
    private AppMonitor.Callback appStateCallback = new AppMonitor.Callback() {
        /* class com.ss.video.rtc.meeting.$$Lambda$MeetingRtcEngineImpl$kyAtN8n9yEQdfIWJrPyvr3jMCIU */

        @Override // com.ss.video.rtc.engine.utils.AppMonitor.Callback
        public final void callback(int i) {
            MeetingRtcEngineImpl.this.lambda$new$0$MeetingRtcEngineImpl(i);
        }
    };
    private String mAppId;
    private boolean mAudioEnabled = true;
    private MeetingRtcAudioFrameObserver mByteRtcAudioFrameObserver;
    private ByteRtcVideoFrameObserver mByteRtcVideoFrameObserver;
    private int mChannelProfile;
    private int mClientRole = 3;
    private Context mContext;
    private Handler mEglHandler;
    private HandlerThread mEglThread;
    private boolean mEnableTranscode;
    private EngineAudioDeviceEventHandler mEngineAudioDeviceEventHandler;
    private MeetingRtcEngineEventHandler mEngineEventHandler;
    private boolean mIsUseCustomEglEnv;
    private LiveTranscoding mLiveTranscoding;
    private LogUtil.LoggerSink mLoggerSink = $$Lambda$MeetingRtcEngineImpl$77guItqOuNrR7z_EoBxME1oW2k.INSTANCE;
    private MeetingRtcAudioTestObserver mMeetingAudioTestObserver;
    private MeetingRtcMetadataObserver mMeetingRtcMetadataObserver;
    private long mNativeMeetingRtcEngine = -1;
    private Runnable mOnDestroyCompletedCallback;
    private boolean mPushMode = true;
    private boolean mRequestSoftwareEncoder;
    private String mRoom;
    private WeakReference<IMeetingRtcEngineEventHandler> mRtcEngineHandler;
    private VideoFrameConverter mScreenFrameConverter;
    private String mSessionId;
    private State mState;
    private String mToken;
    private boolean mUseExtTexture;
    private boolean mUseExtVideoSource = true;
    private String mUser;
    private boolean mVideoEnabled = true;
    private VideoFrameConverter mVideoFrameConverter;
    private int mVideoMirrorMode;
    private VideoSinkTask mVideoSinkTask;

    /* access modifiers changed from: package-private */
    public enum State {
        IDLE,
        IN_ROOM,
        DESTORY
    }

    static /* synthetic */ void lambda$new$1(IRtcEngineEventHandler.RtcLogLevel rtcLogLevel, String str, Throwable th) {
    }

    public static HandlerThread new_android_os_HandlerThread_by_knot(String str) {
        return C20341a.m74147a() ? C20339a.m74145a(str, 0, C20341a.f49621b) : new HandlerThread(str);
    }

    @Override // com.ss.video.rtc.meeting.MeetingRtcEngine
    public int addPublishStreamUrl(String str, boolean z) {
        return 0;
    }

    public static boolean getDesktopMode() {
        return mIsDesktopMode;
    }

    public /* synthetic */ void lambda$doDestroy$3$MeetingRtcEngineImpl() {
        Runnable runnable = this.mOnDestroyCompletedCallback;
        if (runnable != null) {
            runnable.run();
        }
    }

    public static IAudioFrameObserver getAudioFrameObserver() {
        if (mInstance == null) {
            return null;
        }
        return mAudioFrameObserver.get();
    }

    public static IAudioFrameTestObserver getAudioFrameTestHandler() {
        if (mInstance == null) {
            return null;
        }
        return mAudioDataObserver;
    }

    public static IRtcEngineAudioDeviceEventHandler getRtcEngineAudioDeviceEventHandler() {
        if (mInstance == null) {
            return null;
        }
        return RtcSharedContext.getRtcEngineAudioDeviceEventHandler();
    }

    public static String getSDKVersion() {
        if (!mLibraryLoaded) {
            return "";
        }
        return MeetingRtcNativeFunctions.nativeGetSDKVersion();
    }

    public IMetadataObserver getMetadataObserver() {
        return mMetadataObserver.get();
    }

    public IMetadataObserverEx getMetadataObserverEx() {
        return mMetadataObserverEx.get();
    }

    private String getAppVersion() {
        Context context = this.mContext;
        if (context == null) {
            return "unknown";
        }
        try {
            return context.getPackageManager().getPackageInfo(this.mContext.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return "unknown";
        }
    }

    public static DevicePerformanceInfo getDevicePerformanceInfo() {
        LogUtil.m257132i("MeetingRtcEngineImpl", "getEffectSDKVersion");
        if (!mLibraryLoaded) {
            return null;
        }
        return MeetingRtcNativeFunctions.nativeGetDevicePerformanceInfo();
    }

    public static String getEffectSDKVersion() {
        LogUtil.m257132i("MeetingRtcEngineImpl", "getEffectSDKVersion");
        if (!mLibraryLoaded) {
            return "unloaded";
        }
        return MeetingRtcNativeFunctions.nativeGetEffectSDKVersion();
    }

    public static IMeetingRtcEngineEventHandler getRtcEngineHandler() {
        synchronized (MeetingRtcEngineImpl.class) {
            MeetingRtcEngineImpl meetingRtcEngineImpl = mInstance;
            if (meetingRtcEngineImpl != null) {
                WeakReference<IMeetingRtcEngineEventHandler> weakReference = meetingRtcEngineImpl.mRtcEngineHandler;
                if (weakReference != null) {
                    return weakReference.get();
                }
            }
            return null;
        }
    }

    @Override // com.ss.video.rtc.meeting.MeetingRtcEngine
    public int disableVideo() {
        LogUtil.m257129d("MeetingRtcEngineImpl", "disableVideo.");
        long j = this.mNativeMeetingRtcEngine;
        if (j == -1) {
            LogUtil.m257130e("MeetingRtcEngineImpl", "native engine is invalid, disableVideo failed.");
            return -1;
        }
        MeetingRtcNativeFunctions.nativeDisableVideo(j);
        return 0;
    }

    @Override // com.ss.video.rtc.meeting.MeetingRtcEngine
    public int enableVideo() {
        LogUtil.m257129d("MeetingRtcEngineImpl", "enableVideo.");
        long j = this.mNativeMeetingRtcEngine;
        if (j == -1) {
            LogUtil.m257130e("MeetingRtcEngineImpl", "native engine is invalid, enableVideo failed.");
            return -1;
        }
        MeetingRtcNativeFunctions.nativeEnableVideo(j);
        return 0;
    }

    @Override // com.ss.video.rtc.meeting.MeetingRtcEngine
    public int getAudioMixingCurrentPosition() {
        long j = this.mNativeMeetingRtcEngine;
        if (j != -1) {
            return MeetingRtcNativeFunctions.nativeGetAudioMixingCurrentPosition(j);
        }
        LogUtil.m257130e("MeetingRtcEngineImpl", "native engine is invalid, getAudioMixingCurrentPosition failed.");
        return -1;
    }

    @Override // com.ss.video.rtc.meeting.MeetingRtcEngine
    public int getAudioMixingDuration() {
        long j = this.mNativeMeetingRtcEngine;
        if (j != -1) {
            return MeetingRtcNativeFunctions.nativeGetAudioMixingDuration(j);
        }
        LogUtil.m257130e("MeetingRtcEngineImpl", "native engine is invalid, getAudioMixingDuration failed.");
        return -1;
    }

    @Override // com.ss.video.rtc.meeting.MeetingRtcEngine
    public int getMaximumScreenShareFps() {
        long j = this.mNativeMeetingRtcEngine;
        if (j != -1) {
            return MeetingRtcNativeFunctions.nativeGetMaxShareFpsInternal(j);
        }
        LogUtil.m257130e("MeetingRtcEngineImpl", "native engine is invalid, getMaximumScreenShareFps failed.");
        return 5;
    }

    @Override // com.ss.video.rtc.meeting.MeetingRtcEngine
    public boolean isLocalVideoMirrorOn() {
        long j = this.mNativeMeetingRtcEngine;
        if (j != -1) {
            return MeetingRtcNativeFunctions.nativeIsMirror(j);
        }
        LogUtil.m257130e("MeetingRtcEngineImpl", "native engine is invalid, get LocalVideoMirror failed.");
        return false;
    }

    @Override // com.ss.video.rtc.meeting.MeetingRtcEngine
    public boolean isMuteLocalAudio() {
        long j = this.mNativeMeetingRtcEngine;
        if (j != -1) {
            return MeetingRtcNativeFunctions.nativeIsMuteLocalAudio(j);
        }
        LogUtil.m257130e("MeetingRtcEngineImpl", "native engine is invalid, isMuteLocalAudio failed.");
        return false;
    }

    @Override // com.ss.video.rtc.meeting.MeetingRtcEngine
    public boolean isMuteLocalVideo() {
        long j = this.mNativeMeetingRtcEngine;
        if (j != -1) {
            return MeetingRtcNativeFunctions.nativeIsMuteLocalVideo(j);
        }
        LogUtil.m257130e("MeetingRtcEngineImpl", "native engine is invalid, isMuteLocalVideo failed.");
        return false;
    }

    @Override // com.ss.video.rtc.meeting.MeetingRtcEngine
    public boolean isSpeakerphoneEnabled() {
        Context context = this.mContext;
        if (context == null) {
            return false;
        }
        return ((AudioManager) context.getSystemService("audio")).isSpeakerphoneOn();
    }

    @Override // com.ss.video.rtc.meeting.MeetingRtcEngine
    public int leaveBreakDownRoom() {
        long j = this.mNativeMeetingRtcEngine;
        if (j == -1) {
            LogUtil.m257130e("MeetingRtcEngineImpl", "native engine is invalid, leaveBreakDownRoom failed.");
            return -1;
        }
        MeetingRtcNativeFunctions.nativeLeaveBreakDownRoom(j);
        return 0;
    }

    @Override // com.ss.video.rtc.meeting.MeetingRtcEngine
    public int pauseAllEffects() {
        long j = this.mNativeMeetingRtcEngine;
        if (j != -1) {
            return MeetingRtcNativeFunctions.nativePauseAllEffects(j);
        }
        LogUtil.m257130e("MeetingRtcEngineImpl", "native engine is invalid, pauseAllEffects failed.");
        return -1;
    }

    @Override // com.ss.video.rtc.meeting.MeetingRtcEngine
    public int pauseAudioMixing() {
        long j = this.mNativeMeetingRtcEngine;
        if (j != -1) {
            return MeetingRtcNativeFunctions.nativePauseAudioMixing(j);
        }
        LogUtil.m257130e("MeetingRtcEngineImpl", "native engine is invalid, pauseAudioMixing failed.");
        return -1;
    }

    @Override // com.ss.video.rtc.meeting.MeetingRtcEngine
    public int publishScreen() {
        LogUtil.m257129d("MeetingRtcEngineImpl", "publishScreen");
        long j = this.mNativeMeetingRtcEngine;
        if (j == -1) {
            LogUtil.m257130e("MeetingRtcEngineImpl", "native engine is invalid, publishScreen failed.");
            return -1;
        }
        MeetingRtcNativeFunctions.nativePublishScreen(j);
        return 0;
    }

    @Override // com.ss.video.rtc.meeting.MeetingRtcEngine
    public int publishScreenAudio() {
        long j = this.mNativeMeetingRtcEngine;
        if (j != -1) {
            return MeetingRtcNativeFunctions.nativePublishScreenAudio(j);
        }
        LogUtil.m257130e("MeetingRtcEngineImpl", "native engine is invalid, publishScreenAudio failed.");
        return -1;
    }

    @Override // com.ss.video.rtc.meeting.MeetingRtcEngine
    public int resumeAllEffects() {
        long j = this.mNativeMeetingRtcEngine;
        if (j != -1) {
            return MeetingRtcNativeFunctions.nativeResumeAllEffects(j);
        }
        LogUtil.m257130e("MeetingRtcEngineImpl", "native engine is invalid, resumeAllEffects failed.");
        return -1;
    }

    @Override // com.ss.video.rtc.meeting.MeetingRtcEngine
    public int resumeAudioMixing() {
        long j = this.mNativeMeetingRtcEngine;
        if (j != -1) {
            return MeetingRtcNativeFunctions.nativeResumeAudioMixing(j);
        }
        LogUtil.m257130e("MeetingRtcEngineImpl", "native engine is invalid, resumeAudioMixing failed.");
        return -1;
    }

    @Override // com.ss.video.rtc.meeting.MeetingRtcEngine
    public int startAudioLocalPlayout() {
        long j = this.mNativeMeetingRtcEngine;
        if (j == -1) {
            LogUtil.m257130e("MeetingRtcEngineImpl", "native engine is invalid, startAudioLocalPlayout failed.");
            return -1;
        }
        MeetingRtcNativeFunctions.nativeStartAudioLocalPlayout(j);
        return 0;
    }

    @Override // com.ss.video.rtc.meeting.MeetingRtcEngine
    public int startAudioLocalRecord() {
        long j = this.mNativeMeetingRtcEngine;
        if (j == -1) {
            LogUtil.m257130e("MeetingRtcEngineImpl", "native engine is invalid, startAudioLocalRecord failed.");
            return -1;
        }
        MeetingRtcNativeFunctions.nativeStartAudioLocalRecord(j);
        return 0;
    }

    @Override // com.ss.video.rtc.meeting.MeetingRtcEngine
    public int startAudioLocalShare() {
        long j = this.mNativeMeetingRtcEngine;
        if (j == -1) {
            LogUtil.m257130e("MeetingRtcEngineImpl", "native engine is invalid, startAudioLocalShare failed.");
            return -1;
        }
        MeetingRtcNativeFunctions.nativeStartAudioLocalShare(j);
        return 0;
    }

    @Override // com.ss.video.rtc.meeting.MeetingRtcEngine
    public int startAudioRecordFrameListen() {
        long j = this.mNativeMeetingRtcEngine;
        if (j != -1) {
            return MeetingRtcNativeFunctions.nativeStartAudioRecordFrameListen(j);
        }
        LogUtil.m257130e("MeetingRtcEngineImpl", "native engine is invalid, startAudioRecordFrameListen failed.");
        return -1;
    }

    @Override // com.ss.video.rtc.meeting.MeetingRtcEngine
    public int startPreview() {
        LogUtil.m257129d("MeetingRtcEngineImpl", "startPreview.");
        long j = this.mNativeMeetingRtcEngine;
        if (j == -1) {
            LogUtil.m257130e("MeetingRtcEngineImpl", "native engine is invalid, startPreview failed.");
            return -1;
        }
        MeetingRtcNativeFunctions.nativeStartPreview(j);
        return 0;
    }

    @Override // com.ss.video.rtc.meeting.MeetingRtcEngine
    public int stopAllEffects() {
        long j = this.mNativeMeetingRtcEngine;
        if (j != -1) {
            return MeetingRtcNativeFunctions.nativeStopAllEffects(j);
        }
        LogUtil.m257130e("MeetingRtcEngineImpl", "native engine is invalid, stopAllEffects failed.");
        return -1;
    }

    @Override // com.ss.video.rtc.meeting.MeetingRtcEngine
    public void stopAudioDump() {
        long j = this.mNativeMeetingRtcEngine;
        if (j == -1) {
            LogUtil.m257130e("MeetingRtcEngineImpl", "native engine is invalid, stopAudioDump failed.");
        } else {
            MeetingRtcNativeFunctions.nativeStopAudioDump(j);
        }
    }

    @Override // com.ss.video.rtc.meeting.MeetingRtcEngine
    public int stopAudioLocalPlayout() {
        long j = this.mNativeMeetingRtcEngine;
        if (j == -1) {
            LogUtil.m257130e("MeetingRtcEngineImpl", "native engine is invalid, stopAudioLocalPlayout failed.");
            return -1;
        }
        MeetingRtcNativeFunctions.nativeStopAudioLocalPlayout(j);
        return 0;
    }

    @Override // com.ss.video.rtc.meeting.MeetingRtcEngine
    public int stopAudioLocalRecord() {
        long j = this.mNativeMeetingRtcEngine;
        if (j == -1) {
            LogUtil.m257130e("MeetingRtcEngineImpl", "native engine is invalid, stopAudioLocalRecord failed.");
            return -1;
        }
        MeetingRtcNativeFunctions.nativeStopAudioLocalRecord(j);
        return 0;
    }

    @Override // com.ss.video.rtc.meeting.MeetingRtcEngine
    public int stopAudioLocalShare() {
        long j = this.mNativeMeetingRtcEngine;
        if (j == -1) {
            LogUtil.m257130e("MeetingRtcEngineImpl", "native engine is invalid, stopAudioLocalShare failed.");
            return -1;
        }
        MeetingRtcNativeFunctions.nativeStopAudioLocalShare(j);
        return 0;
    }

    @Override // com.ss.video.rtc.meeting.MeetingRtcEngine
    public int stopAudioMixing() {
        long j = this.mNativeMeetingRtcEngine;
        if (j == -1) {
            LogUtil.m257130e("MeetingRtcEngineImpl", "native engine is invalid, stopAudioMixing failed.");
            return -1;
        }
        MeetingRtcNativeFunctions.nativeStopAudioMixing(j);
        return 0;
    }

    @Override // com.ss.video.rtc.meeting.MeetingRtcEngine
    public int stopAudioRecordFrameListen() {
        long j = this.mNativeMeetingRtcEngine;
        if (j != -1) {
            return MeetingRtcNativeFunctions.nativeStopAudioRecordFrameListen(j);
        }
        LogUtil.m257130e("MeetingRtcEngineImpl", "native engine is invalid, stopAudioRecordFrameListen failed.");
        return -1;
    }

    @Override // com.ss.video.rtc.meeting.MeetingRtcEngine
    public void stopHardwareEchoTest() {
        long j = this.mNativeMeetingRtcEngine;
        if (j == -1) {
            LogUtil.m257130e("MeetingRtcEngineImpl", "native engine is invalid, stopHardwareEchoTest failed.");
        } else {
            MeetingRtcNativeFunctions.nativeStopHardwareEchoTest(j);
        }
    }

    @Override // com.ss.video.rtc.meeting.MeetingRtcEngine
    public int stopPreview() {
        LogUtil.m257129d("MeetingRtcEngineImpl", "stopPreview.");
        long j = this.mNativeMeetingRtcEngine;
        if (j == -1) {
            LogUtil.m257130e("MeetingRtcEngineImpl", "native engine is invalid, stopPreview failed.");
            return -1;
        }
        MeetingRtcNativeFunctions.nativeStopPreview(j);
        return 0;
    }

    @Override // com.ss.video.rtc.meeting.MeetingRtcEngine
    public int switchCamera() {
        LogUtil.m257129d("MeetingRtcEngineImpl", "switchCamera");
        long j = this.mNativeMeetingRtcEngine;
        if (j == -1) {
            LogUtil.m257130e("MeetingRtcEngineImpl", "native engine is invalid, switchCamera failed.");
            return -1;
        }
        MeetingRtcNativeFunctions.nativeSwitchCamera(j);
        return 0;
    }

    @Override // com.ss.video.rtc.meeting.MeetingRtcEngine
    public int unloadAllEffects() {
        long j = this.mNativeMeetingRtcEngine;
        if (j != -1) {
            return MeetingRtcNativeFunctions.nativeUnloadAllEffects(j);
        }
        LogUtil.m257130e("MeetingRtcEngineImpl", "native engine is invalid, unloadAllEffects failed.");
        return -1;
    }

    @Override // com.ss.video.rtc.meeting.MeetingRtcEngine
    public int unpublishScreen() {
        LogUtil.m257129d("MeetingRtcEngineImpl", "unpublishScreen");
        long j = this.mNativeMeetingRtcEngine;
        if (j == -1) {
            LogUtil.m257130e("MeetingRtcEngineImpl", "native engine is invalid, unpublishScreen failed.");
            return -1;
        }
        MeetingRtcNativeFunctions.nativeUnpublishScreen(j);
        return 0;
    }

    @Override // com.ss.video.rtc.meeting.MeetingRtcEngine
    public int unpublishScreenAudio() {
        long j = this.mNativeMeetingRtcEngine;
        if (j != -1) {
            return MeetingRtcNativeFunctions.nativeUnpublishScreenAudio(j);
        }
        LogUtil.m257130e("MeetingRtcEngineImpl", "native engine is invalid, unpublishScreenAudio failed.");
        return -1;
    }

    static {
        loadSoFile();
    }

    @Override // com.ss.video.rtc.meeting.MeetingRtcEngine
    public int leaveChannel() {
        IMeetingRtcEngineEventHandler iMeetingRtcEngineEventHandler;
        LogUtil.m257129d("MeetingRtcEngineImpl", "leaveChannel");
        if (this.mNativeMeetingRtcEngine == -1) {
            LogUtil.m257130e("MeetingRtcEngineImpl", "native engine is invalid, leaveChannel failed.");
            return -1;
        }
        this.mState = State.IDLE;
        this.mRoom = "";
        this.mUser = "";
        this.mSessionId = "";
        this.mToken = "";
        WeakReference<IMeetingRtcEngineEventHandler> weakReference = this.mRtcEngineHandler;
        if (weakReference == null) {
            iMeetingRtcEngineEventHandler = null;
        } else {
            iMeetingRtcEngineEventHandler = weakReference.get();
        }
        if (iMeetingRtcEngineEventHandler != null) {
            iMeetingRtcEngineEventHandler.onLeaveChannel(null);
        }
        MeetingRtcNativeFunctions.nativeLeaveChannel(this.mNativeMeetingRtcEngine);
        return 0;
    }

    private static void loadSoFile() {
        if (mLibraryLoaded) {
            mRtcNativeLibraryListener.onLoadAlready("bytertc");
            return;
        }
        RtcNativeLibraryLoader rtcNativeLibraryLoader = mRtcNativeLibraryLoader;
        if (rtcNativeLibraryLoader != null) {
            mLibraryLoaded = true;
            boolean load = rtcNativeLibraryLoader.load("effect") & true;
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
                C1711a.m7628a("bytertc");
                mLibraryLoaded = true;
                mRtcNativeLibraryListener.onLoadSuccess("bytertc");
            } catch (UnsatisfiedLinkError e) {
                LogUtil.m257131e("MeetingRtcEngineImpl", "Failed to load native library: bytertc", e);
                mRtcNativeLibraryListener.onLoadError("bytertc");
            }
        }
    }

    public void doDestroy() {
        LogUtil.m257132i("MeetingRtcEngineImpl", "destroy RtcEngineImpl begin.");
        if (this.mNativeMeetingRtcEngine == -1) {
            LogUtil.m257130e("MeetingRtcEngineImpl", "native engine is invalid, no need to destroy now.");
            return;
        }
        this.mState = State.DESTORY;
        NetworkUtils.unregisterReceiver(this.mContext);
        MeetingRtcNativeFunctions.nativeDestroyByteRtcEngine(this.mNativeMeetingRtcEngine);
        this.mNativeMeetingRtcEngine = -1;
        mInstance = null;
        mIsFront = true;
        mIsVideoMirror = true;
        RtcSharedContext.setVideoFrameConverter(null);
        this.mVideoFrameConverter.dispose();
        this.mVideoFrameConverter = null;
        this.mScreenFrameConverter.dispose();
        this.mScreenFrameConverter = null;
        new Handler(Looper.getMainLooper()).post(new Runnable() {
            /* class com.ss.video.rtc.meeting.$$Lambda$MeetingRtcEngineImpl$FXGpzAPEGSFL2IWu1X0DVsnHA50 */

            public final void run() {
                MeetingRtcEngineImpl.this.lambda$doDestroy$3$MeetingRtcEngineImpl();
            }
        });
        ThreadUtils.invokeAtFrontUninterruptibly(this.mEglHandler, $$Lambda$MeetingRtcEngineImpl$2puusdeyXhH5Qosb5bitFIx2t6E.INSTANCE);
        this.mEglThread.quit();
        AppMonitor.get(this.mContext).unRegister(this.appStateCallback).release(this.mContext);
        VideoSinkTask videoSinkTask = this.mVideoSinkTask;
        if (videoSinkTask != null) {
            videoSinkTask.exit();
        }
        LogUtil.m257132i("MeetingRtcEngineImpl", "destroy RtcEngineImpl end.");
        LogUtil.setLoggerSink(null);
    }

    /* renamed from: com.ss.video.rtc.meeting.MeetingRtcEngineImpl$1 */
    static /* synthetic */ class C656041 {
        static final /* synthetic */ int[] $SwitchMap$com$ss$video$rtc$meeting$IMeetingRtcEngineEventHandler$RtcLogLevel;
        static final /* synthetic */ int[] $SwitchMap$com$ss$video$rtc$meeting$MeetingRtcConstants$AecOption;
        static final /* synthetic */ int[] $SwitchMap$com$ss$video$rtc$meeting$MeetingRtcConstants$EffectType;
        static final /* synthetic */ int[] $SwitchMap$com$ss$video$rtc$meeting$MeetingRtcConstants$NsOption;

        /* JADX WARNING: Can't wrap try/catch for region: R(30:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|(2:15|16)|17|19|20|21|22|(2:23|24)|25|27|28|(2:29|30)|31|33|34|35|36|37|38|39|40|42) */
        /* JADX WARNING: Can't wrap try/catch for region: R(32:0|1|2|3|(2:5|6)|7|9|10|11|13|14|(2:15|16)|17|19|20|21|22|(2:23|24)|25|27|28|(2:29|30)|31|33|34|35|36|37|38|39|40|42) */
        /* JADX WARNING: Can't wrap try/catch for region: R(36:0|1|2|3|5|6|7|9|10|11|13|14|15|16|17|19|20|21|22|23|24|25|27|28|29|30|31|33|34|35|36|37|38|39|40|42) */
        /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0033 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x004f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0059 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0074 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x008f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x0099 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x00a3 */
        static {
            /*
            // Method dump skipped, instructions count: 174
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.video.rtc.meeting.MeetingRtcEngineImpl.C656041.<clinit>():void");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x00c9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String prepareEffectResource() {
        /*
        // Method dump skipped, instructions count: 279
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.video.rtc.meeting.MeetingRtcEngineImpl.prepareEffectResource():java.lang.String");
    }

    public static void setDesktopMode(boolean z) {
        mIsDesktopMode = z;
    }

    @Override // com.ss.video.rtc.meeting.MeetingRtcEngine
    public void setOnDestroyCompletedCallback(Runnable runnable) {
        this.mOnDestroyCompletedCallback = runnable;
    }

    @Override // com.ss.video.rtc.meeting.MeetingRtcEngine
    public void SetEffectResourceFinder(IRtcResourceFinder iRtcResourceFinder) {
        if (mLibraryLoaded) {
            MeetingResourceFinderAdapter.sFinder = iRtcResourceFinder;
        }
    }

    public /* synthetic */ void lambda$new$2$MeetingRtcEngineImpl(Object obj) {
        this.mIsUseCustomEglEnv = RtcSharedContext.initEglContext(obj);
    }

    @Override // com.ss.video.rtc.meeting.MeetingRtcEngine
    public boolean pushExternalVideoFrame(RtcVideoFrame rtcVideoFrame) {
        return pushExternalVideoFrame(rtcVideoFrame, this.mIsUseCustomEglEnv);
    }

    @Override // com.ss.video.rtc.meeting.MeetingRtcEngine
    public boolean setAudioDeviceEventHandler(IRtcEngineAudioDeviceEventHandler iRtcEngineAudioDeviceEventHandler) {
        return RtcSharedContext.setAudioDeviceEventHandler(iRtcEngineAudioDeviceEventHandler);
    }

    @Override // com.ss.video.rtc.meeting.MeetingRtcEngine
    public int setLogFileDir(String str) {
        LogUtil.setLogDir(str);
        return 0;
    }

    public static int setDeviceId(String str) {
        if (str == null) {
            return -1;
        }
        mDeviceId = str;
        if (!mLibraryLoaded) {
            return -1;
        }
        return MeetingRtcNativeFunctions.nativeSetDeviceId(str);
    }

    public static void setIsUsingTTnet(boolean z) {
        if (mLibraryLoaded) {
            MeetingRtcNativeFunctions.nativeSetIsUsingTTnet(z);
        }
    }

    public /* synthetic */ void lambda$new$0$MeetingRtcEngineImpl(int i) {
        String str;
        long j = this.mNativeMeetingRtcEngine;
        if (i == 1) {
            str = "active";
        } else {
            str = "background";
        }
        MeetingRtcNativeFunctions.nativeSetAppState(j, str);
    }

    private static void checkDir(File file) {
        if (!file.exists()) {
            file.mkdirs();
        } else if (!file.isDirectory()) {
            throw new IllegalArgumentException("Path is not directory");
        }
    }

    public static void setRtcDirPath(String str) {
        if (mLibraryLoaded) {
            rtcPath = str;
            LogUtil.m257129d("MeetingRtcEngineImpl", "setRtcDirPath: " + rtcPath);
        }
    }

    public static void setRtcEngineEventHandler(IMeetingRtcEngineEventHandler iMeetingRtcEngineEventHandler) {
        LogUtil.m257129d("MeetingRtcEngineImpl", "setRtcEngineEventHandler");
        synchronized (MeetingRtcEngineImpl.class) {
            MeetingRtcEngineImpl meetingRtcEngineImpl = mInstance;
            if (meetingRtcEngineImpl != null) {
                meetingRtcEngineImpl.mRtcEngineHandler = new WeakReference<>(iMeetingRtcEngineEventHandler);
            }
        }
    }

    @Override // com.ss.video.rtc.meeting.MeetingRtcEngine
    public void SetHighpassFilter(boolean z) {
        long j = this.mNativeMeetingRtcEngine;
        if (j == -1) {
            LogUtil.m257130e("MeetingRtcEngineImpl", "native engine is invalid, SetHighpassFilter failed.");
        } else {
            MeetingRtcNativeFunctions.nativeSetHighpassFilterEnable(j, z);
        }
    }

    @Override // com.ss.video.rtc.meeting.MeetingRtcEngine
    public int adjustAudioMixingPlayoutVolume(int i) {
        long j = this.mNativeMeetingRtcEngine;
        if (j != -1) {
            return MeetingRtcNativeFunctions.nativeAdjustAudioMixingPlayoutVolume(j, i);
        }
        LogUtil.m257130e("MeetingRtcEngineImpl", "native engine is invalid, adjustAudioMixingPlayoutVolume failed.");
        return -1;
    }

    @Override // com.ss.video.rtc.meeting.MeetingRtcEngine
    public int adjustAudioMixingPublishVolume(int i) {
        long j = this.mNativeMeetingRtcEngine;
        if (j != -1) {
            return MeetingRtcNativeFunctions.nativeAdjustAudioMixingPublishVolume(j, i);
        }
        LogUtil.m257130e("MeetingRtcEngineImpl", "native engine is invalid, adjustAudioMixingPublishVolume failed.");
        return -1;
    }

    @Override // com.ss.video.rtc.meeting.MeetingRtcEngine
    public int adjustAudioMixingVolume(int i) {
        long j = this.mNativeMeetingRtcEngine;
        if (j == -1) {
            LogUtil.m257130e("MeetingRtcEngineImpl", "native engine is invalid, adjustAudioMixingVolume failed.");
            return -1;
        }
        MeetingRtcNativeFunctions.nativeAdjustAudioMixingVolume(j, i);
        return 0;
    }

    @Override // com.ss.video.rtc.meeting.MeetingRtcEngine
    public int adjustPlaybackSignalVolume(int i) {
        long j = this.mNativeMeetingRtcEngine;
        if (j == -1) {
            LogUtil.m257130e("MeetingRtcEngineImpl", "native engine is invalid, adjustPlaybackSignalVolume failed.");
            return -1;
        }
        MeetingRtcNativeFunctions.nativeAdjustPlaybackSignalVolume(j, i);
        return 0;
    }

    @Override // com.ss.video.rtc.meeting.MeetingRtcEngine
    public int adjustRecordingSignalVolume(int i) {
        long j = this.mNativeMeetingRtcEngine;
        if (j == -1) {
            LogUtil.m257130e("MeetingRtcEngineImpl", "native engine is invalid, adjustRecordingSignalVolume failed.");
            return -1;
        }
        MeetingRtcNativeFunctions.nativeAdjustRecordingSignalVolume(j, i);
        return 0;
    }

    @Override // com.ss.video.rtc.meeting.MeetingRtcEngine
    public void enableBackgroundBlur(boolean z) {
        if (this.mNativeMeetingRtcEngine == -1) {
            LogUtil.m257130e("MeetingRtcEngineImpl", "native engine is invalid, enableBackgroundBlur failed.");
            return;
        }
        LogUtil.m257129d("MeetingRtcEngineImpl", "enableBlur");
        MeetingRtcNativeFunctions.nativeEnableBackgroundBlur(this.mNativeMeetingRtcEngine, z);
    }

    @Override // com.ss.video.rtc.meeting.MeetingRtcEngine
    public int enableEncryption(boolean z) {
        long j = this.mNativeMeetingRtcEngine;
        if (j != -1) {
            return MeetingRtcNativeFunctions.nativeEnableEncryption(j, z);
        }
        LogUtil.m257130e("MeetingRtcEngineImpl", "native engine is invalid, enableEncryption failed.");
        return -1;
    }

    @Override // com.ss.video.rtc.meeting.MeetingRtcEngine
    public int enableLocalVideo(boolean z) {
        long j = this.mNativeMeetingRtcEngine;
        if (j != -1) {
            return MeetingRtcNativeFunctions.nativeEnableLocalVideo(j, z);
        }
        LogUtil.m257130e("MeetingRtcEngineImpl", "native engine is invalid, enableLocalVideo failed.");
        return -1;
    }

    @Override // com.ss.video.rtc.meeting.MeetingRtcEngine
    public void enableRNNoise(boolean z) {
        long j = this.mNativeMeetingRtcEngine;
        if (j == -1) {
            LogUtil.m257130e("MeetingRtcEngineImpl", "native engine is invalid, enableRNNoise failed.");
        } else {
            MeetingRtcNativeFunctions.nativeEnableRNNoise(j, z);
        }
    }

    @Override // com.ss.video.rtc.meeting.MeetingRtcEngine
    public int getEffectVolume(int i) {
        long j = this.mNativeMeetingRtcEngine;
        if (j != -1) {
            return MeetingRtcNativeFunctions.nativeGetEffectVolume(j, i);
        }
        LogUtil.m257130e("MeetingRtcEngineImpl", "native engine is invalid, getEffectVolume failed.");
        return -1;
    }

    @Override // com.ss.video.rtc.meeting.MeetingRtcEngine
    public int pauseEffect(int i) {
        long j = this.mNativeMeetingRtcEngine;
        if (j != -1) {
            return MeetingRtcNativeFunctions.nativePauseEffect(j, i);
        }
        LogUtil.m257130e("MeetingRtcEngineImpl", "native engine is invalid, pauseEffect failed.");
        return -1;
    }

    @Override // com.ss.video.rtc.meeting.MeetingRtcEngine
    public int registerAudioFrameObserver(IAudioFrameObserver iAudioFrameObserver) {
        mAudioFrameObserver = new WeakReference<>(iAudioFrameObserver);
        if (iAudioFrameObserver == null) {
            MeetingRtcNativeFunctions.nativeSetAudioFrameObserver(this.mNativeMeetingRtcEngine, null);
            return 0;
        }
        MeetingRtcNativeFunctions.nativeSetAudioFrameObserver(this.mNativeMeetingRtcEngine, this.mByteRtcAudioFrameObserver);
        return 0;
    }

    @Override // com.ss.video.rtc.meeting.MeetingRtcEngine
    public void registerMetadataObserver(IMetadataObserver iMetadataObserver) {
        mMetadataObserver = new WeakReference<>(iMetadataObserver);
        if (iMetadataObserver == null) {
            MeetingRtcNativeFunctions.nativeSetMetadataObserver(this.mNativeMeetingRtcEngine, null);
        } else {
            MeetingRtcNativeFunctions.nativeSetMetadataObserver(this.mNativeMeetingRtcEngine, this.mMeetingRtcMetadataObserver);
        }
    }

    @Override // com.ss.video.rtc.meeting.MeetingRtcEngine
    public void registerMetadataObserverEx(IMetadataObserverEx iMetadataObserverEx) {
        mMetadataObserverEx = new WeakReference<>(iMetadataObserverEx);
        if (iMetadataObserverEx == null) {
            MeetingRtcNativeFunctions.nativeSetMeetingMetadataObserver(this.mNativeMeetingRtcEngine, null);
        } else {
            MeetingRtcNativeFunctions.nativeSetMeetingMetadataObserver(this.mNativeMeetingRtcEngine, this.mMeetingRtcMetadataObserver);
        }
    }

    @Override // com.ss.video.rtc.meeting.MeetingRtcEngine
    public int resumeEffect(int i) {
        long j = this.mNativeMeetingRtcEngine;
        if (j != -1) {
            return MeetingRtcNativeFunctions.nativeResumeEffect(j, i);
        }
        LogUtil.m257130e("MeetingRtcEngineImpl", "native engine is invalid, resumeEffect failed.");
        return -1;
    }

    @Override // com.ss.video.rtc.meeting.MeetingRtcEngine
    public long sendBinaryMessageToRoom(byte[] bArr) {
        long j = this.mNativeMeetingRtcEngine;
        if (j != -1) {
            return (long) MeetingRtcNativeFunctions.nativeSendBinaryMessageToRoom(j, bArr);
        }
        LogUtil.m257130e("MeetingRtcEngineImpl", "native engine is invalid, sendBinaryMessageToRoom failed.");
        return -1;
    }

    @Override // com.ss.video.rtc.meeting.MeetingRtcEngine
    public long sendMessageToRoom(String str) {
        long j = this.mNativeMeetingRtcEngine;
        if (j != -1) {
            return (long) MeetingRtcNativeFunctions.nativeSendMessageToRoom(j, str);
        }
        LogUtil.m257130e("MeetingRtcEngineImpl", "native engine is invalid, sendMessageToRoom failed.");
        return -1;
    }

    @Override // com.ss.video.rtc.meeting.MeetingRtcEngine
    public int setAudioMixingPosition(int i) {
        long j = this.mNativeMeetingRtcEngine;
        if (j != -1) {
            return MeetingRtcNativeFunctions.nativeSetAudioMixingPosition(j, i);
        }
        LogUtil.m257130e("MeetingRtcEngineImpl", "native engine is invalid, setAudioMixingPosition failed.");
        return -1;
    }

    @Override // com.ss.video.rtc.meeting.MeetingRtcEngine
    public int setEffectsVolume(int i) {
        long j = this.mNativeMeetingRtcEngine;
        if (j != -1) {
            return MeetingRtcNativeFunctions.nativeSetEffectsVolume(j, i);
        }
        LogUtil.m257130e("MeetingRtcEngineImpl", "native engine is invalid, setEffectsVolume failed.");
        return -1;
    }

    @Override // com.ss.video.rtc.meeting.MeetingRtcEngine
    public int setPlaybackDigitalMute(boolean z) {
        long j = this.mNativeMeetingRtcEngine;
        if (j == -1) {
            LogUtil.m257130e("MeetingRtcEngineImpl", "native engine is invalid, setPlaybackDigitalMute failed.");
            return -1;
        }
        MeetingRtcNativeFunctions.nativeSetPlaybackDigitalMute(j, z);
        return 0;
    }

    @Override // com.ss.video.rtc.meeting.MeetingRtcEngine
    public int setPublishSpecialStream(int i) {
        long j = this.mNativeMeetingRtcEngine;
        if (j == -1) {
            LogUtil.m257130e("MeetingRtcEngineImpl", "native engine is invalid, setPublishSpecialStream failed.");
            return -1;
        }
        MeetingRtcNativeFunctions.nativeSetPublishSpecialStream(j, i);
        return 0;
    }

    @Override // com.ss.video.rtc.meeting.MeetingRtcEngine
    public int setSendScreenMaxKbps(int i) {
        long j = this.mNativeMeetingRtcEngine;
        if (j == -1) {
            LogUtil.m257130e("MeetingRtcEngineImpl", "native engine is invalid, setSendScreenMaxKbps failed.");
            return -1;
        }
        MeetingRtcNativeFunctions.nativeSetSendScreenMaxKbps(j, i);
        return 0;
    }

    @Override // com.ss.video.rtc.meeting.MeetingRtcEngine
    public int setSubChannels(SubChannelInfo[] subChannelInfoArr) {
        LogUtil.m257129d("MeetingRtcEngineImpl", "setSubChannels");
        long j = this.mNativeMeetingRtcEngine;
        if (j == -1) {
            LogUtil.m257130e("MeetingRtcEngineImpl", "native engine is invalid, setSubChannels failed.");
            return -1;
        }
        MeetingRtcNativeFunctions.nativeSetSubChannels(j, subChannelInfoArr);
        return 0;
    }

    @Override // com.ss.video.rtc.meeting.MeetingRtcEngine
    public void setupRemoteScreen(VideoCanvas videoCanvas) {
        if (videoCanvas == null || videoCanvas.uid == null) {
            LogUtil.m257132i("MeetingRtcEngineImpl", "EventType: setupRemoteVideo canvas or uid is null");
        } else {
            MeetingRtcNativeFunctions.nativeSetupRemoteVideo(this.mNativeMeetingRtcEngine, videoCanvas.renderView, videoCanvas.renderMode, videoCanvas.uid, videoCanvas.isScreen);
        }
    }

    @Override // com.ss.video.rtc.meeting.MeetingRtcEngine
    public int setupRemoteVideo(VideoCanvas videoCanvas) {
        if (videoCanvas == null || videoCanvas.uid == null) {
            LogUtil.m257132i("MeetingRtcEngineImpl", "EventType: setupRemoteVideo canvas or uid is null");
            return -1;
        }
        MeetingRtcNativeFunctions.nativeSetupRemoteVideo(this.mNativeMeetingRtcEngine, videoCanvas.renderView, videoCanvas.renderMode, videoCanvas.uid, videoCanvas.isScreen);
        return 0;
    }

    @Override // com.ss.video.rtc.meeting.MeetingRtcEngine
    public int startAudioPlayoutExternSource(int i) {
        long j = this.mNativeMeetingRtcEngine;
        if (j != -1) {
            return MeetingRtcNativeFunctions.nativeStartAudioPlayoutExternSource(j, i);
        }
        LogUtil.m257130e("MeetingRtcEngineImpl", "native engine is invalid, startAudioPlayoutExternSource failed.");
        return -1;
    }

    @Override // com.ss.video.rtc.meeting.MeetingRtcEngine
    public void startHardwareEchoTest(String str) {
        long j = this.mNativeMeetingRtcEngine;
        if (j == -1) {
            LogUtil.m257130e("MeetingRtcEngineImpl", "native engine is invalid, startHardwareEchoTest failed.");
        } else {
            MeetingRtcNativeFunctions.nativeStartHardwareEchoTest(j, str);
        }
    }

    @Override // com.ss.video.rtc.meeting.MeetingRtcEngine
    public int stopAudioPlayoutExternSource(int i) {
        long j = this.mNativeMeetingRtcEngine;
        if (j != -1) {
            return MeetingRtcNativeFunctions.nativeStopAudioPlayoutExternSource(j, i);
        }
        LogUtil.m257130e("MeetingRtcEngineImpl", "native engine is invalid, startAudioPlayoutExternSource failed.");
        return -1;
    }

    @Override // com.ss.video.rtc.meeting.MeetingRtcEngine
    public int stopEffect(int i) {
        long j = this.mNativeMeetingRtcEngine;
        if (j != -1) {
            return MeetingRtcNativeFunctions.nativeStopEffect(j, i);
        }
        LogUtil.m257130e("MeetingRtcEngineImpl", "native engine is invalid, stopEffect failed.");
        return -1;
    }

    @Override // com.ss.video.rtc.meeting.MeetingRtcEngine
    public int unloadEffect(int i) {
        long j = this.mNativeMeetingRtcEngine;
        if (j != -1) {
            return MeetingRtcNativeFunctions.nativeUnloadEffect(j, i);
        }
        LogUtil.m257130e("MeetingRtcEngineImpl", "native engine is invalid, unloadEffect failed.");
        return -1;
    }

    private void setAudioMode(int i) {
        AudioManager audioManager;
        LogUtil.m257132i("MeetingRtcEngineImpl", "setAudioMode mode:" + i);
        Context context = this.mContext;
        if (context != null && (audioManager = (AudioManager) context.getSystemService("audio")) != null && audioManager.getMode() != i) {
            audioManager.setMode(i);
        }
    }

    public static void setHostName(String str) {
        if (mLibraryLoaded && str != null) {
            LogUtil.m257132i("MeetingRtcEngineImpl", "setHostName: " + str.toString());
            MeetingRtcNativeFunctions.nativeSetHostName(str);
        }
    }

    public static void setLogPath(String str) {
        LogUtil.m257132i("MeetingRtcEngineImpl", "setLogPath " + str);
        if (!mLibraryLoaded) {
            LogUtil.m257130e("MeetingRtcEngineImpl", "setLogPath failed");
            return;
        }
        if (str == null) {
            str = "";
        }
        MeetingRtcNativeFunctions.nativeSetLogPath(str);
    }

    public static void setRtcFGConfig(String str) {
        LogUtil.m257132i("MeetingRtcEngineImpl", "setRtcFgConfig " + str);
        if (!mLibraryLoaded) {
            LogUtil.m257130e("MeetingRtcEngineImpl", "library is not loaded, setRtcFGConfig failed.");
        } else {
            MeetingRtcNativeFunctions.nativeSetRtcFGConfig(str);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0020, code lost:
        if (r6 != 3) goto L_0x0022;
     */
    @Override // com.ss.video.rtc.meeting.MeetingRtcEngine
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void SetAecOption(com.ss.video.rtc.meeting.MeetingRtcConstants.AecOption r6) {
        /*
            r5 = this;
            long r0 = r5.mNativeMeetingRtcEngine
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x0010
            java.lang.String r6 = "MeetingRtcEngineImpl"
            java.lang.String r0 = "native engine is invalid, SetAecOption failed."
            com.ss.video.rtc.engine.utils.LogUtil.m257130e(r6, r0)
            return
        L_0x0010:
            int[] r0 = com.ss.video.rtc.meeting.MeetingRtcEngineImpl.C656041.$SwitchMap$com$ss$video$rtc$meeting$MeetingRtcConstants$AecOption
            int r6 = r6.ordinal()
            r6 = r0[r6]
            r0 = 2
            r1 = 1
            r2 = 0
            if (r6 == r1) goto L_0x0022
            if (r6 == r0) goto L_0x0024
            r1 = 3
            if (r6 == r1) goto L_0x0025
        L_0x0022:
            r0 = 0
            goto L_0x0025
        L_0x0024:
            r0 = 1
        L_0x0025:
            long r1 = r5.mNativeMeetingRtcEngine
            com.ss.video.rtc.meeting.MeetingRtcNativeFunctions.nativeSetAecOption(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.video.rtc.meeting.MeetingRtcEngineImpl.SetAecOption(com.ss.video.rtc.meeting.MeetingRtcConstants$AecOption):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0026, code lost:
        if (r6 != 5) goto L_0x0028;
     */
    @Override // com.ss.video.rtc.meeting.MeetingRtcEngine
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void SetNsOption(com.ss.video.rtc.meeting.MeetingRtcConstants.NsOption r6) {
        /*
            r5 = this;
            long r0 = r5.mNativeMeetingRtcEngine
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x0010
            java.lang.String r6 = "MeetingRtcEngineImpl"
            java.lang.String r0 = "native engine is invalid, SetNsOption failed."
            com.ss.video.rtc.engine.utils.LogUtil.m257130e(r6, r0)
            return
        L_0x0010:
            int[] r0 = com.ss.video.rtc.meeting.MeetingRtcEngineImpl.C656041.$SwitchMap$com$ss$video$rtc$meeting$MeetingRtcConstants$NsOption
            int r6 = r6.ordinal()
            r6 = r0[r6]
            r0 = 3
            r1 = 2
            r2 = 1
            r3 = -1
            if (r6 == r2) goto L_0x0028
            if (r6 == r1) goto L_0x002e
            if (r6 == r0) goto L_0x002c
            r2 = 4
            if (r6 == r2) goto L_0x002a
            r1 = 5
            if (r6 == r1) goto L_0x002f
        L_0x0028:
            r0 = -1
            goto L_0x002f
        L_0x002a:
            r0 = 2
            goto L_0x002f
        L_0x002c:
            r0 = 1
            goto L_0x002f
        L_0x002e:
            r0 = 0
        L_0x002f:
            long r1 = r5.mNativeMeetingRtcEngine
            com.ss.video.rtc.meeting.MeetingRtcNativeFunctions.nativeSetNsOption(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.video.rtc.meeting.MeetingRtcEngineImpl.SetNsOption(com.ss.video.rtc.meeting.MeetingRtcConstants$NsOption):void");
    }

    @Override // com.ss.video.rtc.meeting.MeetingRtcEngine
    public void cancelEffect(String str) {
        if (this.mNativeMeetingRtcEngine == -1) {
            LogUtil.m257130e("MeetingRtcEngineImpl", "native engine is invalid, cancelEffect failed.");
            return;
        }
        LogUtil.m257129d("MeetingRtcEngineImpl", "cancelEffect " + str);
        MeetingRtcNativeFunctions.nativeCancelEffect(this.mNativeMeetingRtcEngine, str);
    }

    @Override // com.ss.video.rtc.meeting.MeetingRtcEngine
    public int enableAudio(boolean z) {
        LogUtil.m257132i("MeetingRtcEngineImpl", "enableAudio " + z);
        long j = this.mNativeMeetingRtcEngine;
        if (j == -1) {
            LogUtil.m257130e("MeetingRtcEngineImpl", "native engine is invalid, enableLocalAudio failed.");
            return -1;
        } else if (z) {
            MeetingRtcNativeFunctions.nativeEnableAudio(j);
            return 0;
        } else {
            MeetingRtcNativeFunctions.nativeDisableAudio(j);
            return 0;
        }
    }

    @Override // com.ss.video.rtc.meeting.MeetingRtcEngine
    public void enableAutoSubscribe(boolean z) {
        LogUtil.m257132i("MeetingRtcEngineImpl", "enableAudio " + z);
        long j = this.mNativeMeetingRtcEngine;
        if (j == -1) {
            LogUtil.m257130e("MeetingRtcEngineImpl", "native engine is invalid, enableAutoSubscribe failed.");
        } else {
            MeetingRtcNativeFunctions.nativeEnableAutoSubscribe(j, z);
        }
    }

    @Override // com.ss.video.rtc.meeting.MeetingRtcEngine
    public int enableLocalAudio(boolean z) {
        LogUtil.m257132i("MeetingRtcEngineImpl", "enableLocalAudio " + z);
        long j = this.mNativeMeetingRtcEngine;
        if (j == -1) {
            LogUtil.m257130e("MeetingRtcEngineImpl", "native engine is invalid, enableLocalAudio failed.");
            return -1;
        }
        MeetingRtcNativeFunctions.nativeEnableLocalAudio(j, z);
        return 0;
    }

    @Override // com.ss.video.rtc.meeting.MeetingRtcEngine
    public void forceSetDecoderMode(VideoStreamDescription.CodecMode codecMode) {
        LogUtil.m257129d("MeetingRtcEngineImpl", "forceSetDecoderMode " + codecMode);
        long j = this.mNativeMeetingRtcEngine;
        if (j == -1) {
            LogUtil.m257130e("MeetingRtcEngineImpl", "native engine is invalid, forceSetVideoProfiles failed.");
        } else {
            MeetingRtcNativeFunctions.nativeForceSetDecoderMode(j, codecMode.getValue());
        }
    }

    @Override // com.ss.video.rtc.meeting.MeetingRtcEngine
    public void forceSetEncoderVideoProfiles(VideoStreamDescription[] videoStreamDescriptionArr) {
        LogUtil.m257129d("MeetingRtcEngineImpl", "forceSetEncoderVideoProfiles");
        if (this.mNativeMeetingRtcEngine == -1) {
            LogUtil.m257130e("MeetingRtcEngineImpl", "native engine is invalid, forceSetVideoProfiles failed.");
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (VideoStreamDescription videoStreamDescription : videoStreamDescriptionArr) {
            if (!videoStreamDescription.isValid()) {
                LogUtil.m257130e("MeetingRtcEngineImpl", "setVideoResolutions with illegal params");
                return;
            } else {
                arrayList.add(new InternalVideoStreamDescription(videoStreamDescription));
            }
        }
        MeetingRtcNativeFunctions.nativeForceSetVideoProfiles(this.mNativeMeetingRtcEngine, arrayList);
    }

    @Override // com.ss.video.rtc.meeting.MeetingRtcEngine
    public int muteAllRemoteAudioStreams(boolean z) {
        LogUtil.m257129d("MeetingRtcEngineImpl", "muteAllRemoteAudioStreams: " + z);
        long j = this.mNativeMeetingRtcEngine;
        if (j != -1) {
            return MeetingRtcNativeFunctions.nativeMuteAllRemoteAudioStreams(j, z);
        }
        LogUtil.m257130e("MeetingRtcEngineImpl", "native engine is invalid, muteAllRemoteAudioStreams failed.");
        return -1;
    }

    @Override // com.ss.video.rtc.meeting.MeetingRtcEngine
    public int muteAllRemoteVideoStreams(boolean z) {
        LogUtil.m257129d("MeetingRtcEngineImpl", "muteAllRemoteVideoStreams: " + z);
        long j = this.mNativeMeetingRtcEngine;
        if (j != -1) {
            return MeetingRtcNativeFunctions.nativeMuteAllRemoteVideoStreams(j, z);
        }
        LogUtil.m257130e("MeetingRtcEngineImpl", "native engine is invalid, muteAllRemoteVideoStreams failed.");
        return -1;
    }

    @Override // com.ss.video.rtc.meeting.MeetingRtcEngine
    public int muteLocalAudioStream(boolean z) {
        LogUtil.m257129d("MeetingRtcEngineImpl", "muteLocalAudioStream: " + z);
        long j = this.mNativeMeetingRtcEngine;
        if (j == -1) {
            LogUtil.m257130e("MeetingRtcEngineImpl", "native engine is invalid, muteLocalAudioStream failed.");
            return -1;
        }
        MeetingRtcNativeFunctions.nativeMuteLocalAudioStream(j, z);
        return 0;
    }

    @Override // com.ss.video.rtc.meeting.MeetingRtcEngine
    public int muteLocalVideoStream(boolean z) {
        LogUtil.m257129d("MeetingRtcEngineImpl", "muteLocalVideoStream: " + z);
        long j = this.mNativeMeetingRtcEngine;
        if (j == -1) {
            LogUtil.m257130e("MeetingRtcEngineImpl", "native engine is invalid, muteLocalVideoStream failed.");
            return -1;
        }
        MeetingRtcNativeFunctions.nativeMuteLocalVideoStream(j, z);
        return 0;
    }

    @Override // com.ss.video.rtc.meeting.MeetingRtcEngine
    public int renewToken(String str) {
        LogUtil.m257129d("MeetingRtcEngineImpl", "renewToken: " + str);
        long j = this.mNativeMeetingRtcEngine;
        if (j == -1) {
            LogUtil.m257130e("MeetingRtcEngineImpl", "native engine is invalid, renewToken failed.");
            return -1;
        }
        MeetingRtcNativeFunctions.nativeRenewToken(j, str);
        return 0;
    }

    @Override // com.ss.video.rtc.meeting.MeetingRtcEngine
    public int setAudioDataEventHandler(IAudioFrameTestObserver iAudioFrameTestObserver) {
        if (this.mNativeMeetingRtcEngine == -1) {
            LogUtil.m257130e("MeetingRtcEngineImpl", "native engine is invalid, setAudioDataEventHandler failed.");
            return -1;
        }
        mAudioDataObserver = iAudioFrameTestObserver;
        if (iAudioFrameTestObserver == null) {
            LogUtil.m257130e("MeetingRtcEngineImpl", "audioDataHandler is null.");
            return MeetingRtcNativeFunctions.nativeSetAudioDataEventHandler(this.mNativeMeetingRtcEngine, null);
        }
        LogUtil.m257130e("MeetingRtcEngineImpl", "audioDataHandler is not null.");
        return MeetingRtcNativeFunctions.nativeSetAudioDataEventHandler(this.mNativeMeetingRtcEngine, this.mMeetingAudioTestObserver);
    }

    @Override // com.ss.video.rtc.meeting.MeetingRtcEngine
    public void setBackgroundImage(String str) {
        if (this.mNativeMeetingRtcEngine == -1) {
            LogUtil.m257130e("MeetingRtcEngineImpl", "native engine is invalid, setBackgroundImage failed.");
            return;
        }
        LogUtil.m257129d("MeetingRtcEngineImpl", "setBackgroundImage " + str);
        MeetingRtcNativeFunctions.nativeSetBackgroundImage(this.mNativeMeetingRtcEngine, str);
    }

    @Override // com.ss.video.rtc.meeting.MeetingRtcEngine
    public int setCaptureDevice(int i) {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("setCaptureDevice ");
        if (i == 1) {
            str = "USBCamera";
        } else {
            str = "AndroidSystemCamera";
        }
        sb.append(str);
        LogUtil.m257132i("MeetingRtcEngineImpl", sb.toString());
        long j = this.mNativeMeetingRtcEngine;
        if (j == -1) {
            LogUtil.m257130e("MeetingRtcEngineImpl", "native engine is invalid, setCaptureDevice failed.");
            return -1;
        }
        MeetingRtcNativeFunctions.nativeSetCaptureDevice(j, i);
        return 0;
    }

    @Override // com.ss.video.rtc.meeting.MeetingRtcEngine
    public int setChannelProfile(int i) {
        LogUtil.m257129d("MeetingRtcEngineImpl", "setChannelProfile. profile : " + i);
        long j = this.mNativeMeetingRtcEngine;
        if (j == -1) {
            LogUtil.m257130e("MeetingRtcEngineImpl", "native engine is invalid, setChannelProfile failed.");
            return -1;
        }
        MeetingRtcNativeFunctions.nativeSetChannelProfile(j, i);
        return 0;
    }

    @Override // com.ss.video.rtc.meeting.MeetingRtcEngine
    public int setClientRole(int i) {
        LogUtil.m257129d("MeetingRtcEngineImpl", "setClientRole. role : " + i);
        long j = this.mNativeMeetingRtcEngine;
        if (j == -1) {
            LogUtil.m257130e("MeetingRtcEngineImpl", "native engine is invalid, setClientRole failed.");
            return -1;
        }
        MeetingRtcNativeFunctions.nativeSetClientRole(j, i);
        return 0;
    }

    @Override // com.ss.video.rtc.meeting.MeetingRtcEngine
    public int setDefaultMuteAllRemoteAudioStreams(boolean z) {
        LogUtil.m257129d("MeetingRtcEngineImpl", "setDefaultMuteAllRemoteAudioStreams: " + z);
        long j = this.mNativeMeetingRtcEngine;
        if (j != -1) {
            return MeetingRtcNativeFunctions.nativeSetDefaultMuteAllRemoteAudioStreams(j, z);
        }
        LogUtil.m257130e("MeetingRtcEngineImpl", "native engine is invalid, setDefaultMuteAllRemoteAudioStreams failed.");
        return -1;
    }

    @Override // com.ss.video.rtc.meeting.MeetingRtcEngine
    public int setDefaultMuteAllRemoteVideoStreams(boolean z) {
        LogUtil.m257129d("MeetingRtcEngineImpl", "setDefaultMuteAllRemoteVideoStreams: " + z);
        long j = this.mNativeMeetingRtcEngine;
        if (j != -1) {
            return MeetingRtcNativeFunctions.nativeSetDefaultMuteAllRemoteVideoStreams(j, z);
        }
        LogUtil.m257130e("MeetingRtcEngineImpl", "native engine is invalid, setDefaultMuteAllRemoteVideoStreams failed.");
        return -1;
    }

    @Override // com.ss.video.rtc.meeting.MeetingRtcEngine
    public void setDeviceOrientation(int i) {
        if (this.mNativeMeetingRtcEngine == -1) {
            LogUtil.m257130e("MeetingRtcEngineImpl", "native engine is invalid, setDeviceOrientation failed.");
            return;
        }
        LogUtil.m257129d("MeetingRtcEngineImpl", "setDeviceOrientation " + i);
        MeetingRtcNativeFunctions.nativeSetDeviceOrientation(this.mNativeMeetingRtcEngine, i);
    }

    @Override // com.ss.video.rtc.meeting.MeetingRtcEngine
    public int setEnableSpeakerphone(boolean z) {
        LogUtil.m257129d("MeetingRtcEngineImpl", "setEnableSpeakerphone: " + z);
        long j = this.mNativeMeetingRtcEngine;
        if (j != -1) {
            return MeetingRtcNativeFunctions.nativeSetEnableSpeakerphone(j, z);
        }
        LogUtil.m257130e("MeetingRtcEngineImpl", "native engine is invalid, setEnableSpeakerphone failed.");
        return -1;
    }

    @Override // com.ss.video.rtc.meeting.MeetingRtcEngine
    public void setFaceBeautyLevel(int i) {
        if (this.mNativeMeetingRtcEngine == -1) {
            LogUtil.m257130e("MeetingRtcEngineImpl", "native engine is invalid, setFaceBeautyLevel failed.");
            return;
        }
        LogUtil.m257129d("MeetingRtcEngineImpl", "setFaceBeautyLevel " + i);
        MeetingRtcNativeFunctions.nativeSetFaceBeautyLevel(this.mNativeMeetingRtcEngine, i);
    }

    @Override // com.ss.video.rtc.meeting.MeetingRtcEngine
    public int setLocalVideoMirrorMode(int i) {
        boolean z;
        if (this.mNativeMeetingRtcEngine == -1) {
            LogUtil.m257130e("MeetingRtcEngineImpl", "native engine is invalid, setLocalVideoMirrorMode failed.");
            return -1;
        }
        LogUtil.m257129d("MeetingRtcEngineImpl", "setLocalVideoMirrorMode " + i);
        boolean z2 = true;
        if (i == 2) {
            z = false;
        } else {
            z = true;
        }
        mIsVideoMirror = z;
        long j = this.mNativeMeetingRtcEngine;
        if (!z || !mIsFront) {
            z2 = false;
        }
        MeetingRtcNativeFunctions.nativeSetMirror(j, z2);
        return 0;
    }

    @Override // com.ss.video.rtc.meeting.MeetingRtcEngine
    public void setLogFilter(IMeetingRtcEngineEventHandler.RtcLogLevel rtcLogLevel) {
        IRtcEngineEventHandler.RtcLogLevel rtcLogLevel2 = IRtcEngineEventHandler.RtcLogLevel.RTC_LOG_LEVEL_INFO;
        int i = C656041.$SwitchMap$com$ss$video$rtc$meeting$IMeetingRtcEngineEventHandler$RtcLogLevel[rtcLogLevel.ordinal()];
        if (i == 1) {
            rtcLogLevel2 = IRtcEngineEventHandler.RtcLogLevel.RTC_LOG_LEVEL_INFO;
        } else if (i == 2) {
            rtcLogLevel2 = IRtcEngineEventHandler.RtcLogLevel.RTC_LOG_LEVEL_DEBUG;
        } else if (i == 3) {
            rtcLogLevel2 = IRtcEngineEventHandler.RtcLogLevel.RTC_LOG_LEVEL_WARNING;
        } else if (i == 4) {
            rtcLogLevel2 = IRtcEngineEventHandler.RtcLogLevel.RTC_LOG_LEVEL_ERROR;
        }
        LogUtil.setLogLevel(rtcLogLevel2);
    }

    @Override // com.ss.video.rtc.meeting.MeetingRtcEngine
    public int setMediaServerIP(String str) {
        LogUtil.m257129d("MeetingRtcEngineImpl", "setMediaServerIP: " + str);
        long j = this.mNativeMeetingRtcEngine;
        if (j == -1) {
            LogUtil.m257130e("MeetingRtcEngineImpl", "native engine is invalid, setMediaServerIP failed.");
            return -1;
        }
        MeetingRtcNativeFunctions.nativeSetMediaServerIP(j, str);
        return 0;
    }

    @Override // com.ss.video.rtc.meeting.MeetingRtcEngine
    public void setMicrophoneName(String str) {
        if (this.mNativeMeetingRtcEngine == -1) {
            LogUtil.m257130e("MeetingRtcEngineImpl", "native engine is invalid, setMicrophoneName failed.");
            return;
        }
        LogUtil.m257132i("MeetingRtcEngineImpl", "setMicrophoneName " + str);
        MeetingRtcNativeFunctions.nativeSetMicphoneName(this.mNativeMeetingRtcEngine, str);
    }

    @Override // com.ss.video.rtc.meeting.MeetingRtcEngine
    public int setPublishChannel(String str) {
        LogUtil.m257129d("MeetingRtcEngineImpl", "setPublishChannel: " + str);
        long j = this.mNativeMeetingRtcEngine;
        if (j == -1) {
            LogUtil.m257130e("MeetingRtcEngineImpl", "native engine is invalid, setPublishChannel failed.");
            return -1;
        }
        MeetingRtcNativeFunctions.nativeSetPublishChannel(j, str);
        return 0;
    }

    @Override // com.ss.video.rtc.meeting.MeetingRtcEngine
    public void setSpeakerName(String str) {
        if (this.mNativeMeetingRtcEngine == -1) {
            LogUtil.m257130e("MeetingRtcEngineImpl", "native engine is invalid, setSpeakerName failed.");
            return;
        }
        LogUtil.m257132i("MeetingRtcEngineImpl", "setSpeakerName " + str);
        MeetingRtcNativeFunctions.nativeSetSpeakerName(this.mNativeMeetingRtcEngine, str);
    }

    @Override // com.ss.video.rtc.meeting.MeetingRtcEngine
    public int setSpeakerphoneVolume(int i) {
        LogUtil.m257129d("MeetingRtcEngineImpl", "setSpeakerphoneVolume: " + i);
        long j = this.mNativeMeetingRtcEngine;
        if (j != -1) {
            return MeetingRtcNativeFunctions.nativeSetSpeakerVolume(j, i);
        }
        LogUtil.m257130e("MeetingRtcEngineImpl", "native engine is invalid, setSpeakerphoneVolume failed.");
        return -1;
    }

    @Override // com.ss.video.rtc.meeting.MeetingRtcEngine
    public int setSubscribeSpecialStream(int[] iArr) {
        if (iArr == null || iArr.length == 0) {
            LogUtil.m257130e("MeetingRtcEngineImpl", "setSubscribeSpecialStream invalid types");
            return -1;
        }
        long j = this.mNativeMeetingRtcEngine;
        if (j == -1) {
            LogUtil.m257130e("MeetingRtcEngineImpl", "native engine is invalid, setSubscribeSpecialStream failed.");
            return -1;
        }
        MeetingRtcNativeFunctions.nativeSetSubscribeSpecialStream(j, iArr);
        return 0;
    }

    @Override // com.ss.video.rtc.meeting.MeetingRtcEngine
    public int setupLocalScreen(VideoCanvas videoCanvas) {
        LogUtil.m257132i("MeetingRtcEngineImpl", "setupLocalScreen canvas: " + videoCanvas.toString());
        if (videoCanvas == null) {
            LogUtil.m257132i("MeetingRtcEngineImpl", "EventType: setupLocalScreen canvas is null");
            return -1;
        }
        MeetingRtcNativeFunctions.nativeSetupLocalVideo(this.mNativeMeetingRtcEngine, videoCanvas.renderView, videoCanvas.renderMode, true);
        return 0;
    }

    @Override // com.ss.video.rtc.meeting.MeetingRtcEngine
    public int setupLocalVideo(VideoCanvas videoCanvas) {
        LogUtil.m257132i("MeetingRtcEngineImpl", "setupLocalVideo canvas: " + videoCanvas.toString());
        if (videoCanvas == null) {
            LogUtil.m257132i("MeetingRtcEngineImpl", "EventType: setupLocalVideo canvas is null");
            return -1;
        }
        MeetingRtcNativeFunctions.nativeSetupLocalVideo(this.mNativeMeetingRtcEngine, videoCanvas.renderView, videoCanvas.renderMode, false);
        return 0;
    }

    @Override // com.ss.video.rtc.meeting.MeetingRtcEngine
    public void unSubscribe(String str) {
        LogUtil.m257129d("MeetingRtcEngineImpl", "unSubscribe: " + str);
        long j = this.mNativeMeetingRtcEngine;
        if (j == -1) {
            LogUtil.m257130e("MeetingRtcEngineImpl", "native engine is invalid, unSubscribe failed.");
        } else {
            MeetingRtcNativeFunctions.nativeUnSubscribe(j, str);
        }
    }

    @Override // com.ss.video.rtc.meeting.MeetingRtcEngine
    public boolean pushScreenFrame(RtcVideoFrame rtcVideoFrame) {
        VideoFrame videoFrame;
        if (this.mScreenFrameConverter != null) {
            if (rtcVideoFrame.buffer_type == 2) {
                InternalRtcVideoFrame internalRtcVideoFrame = (InternalRtcVideoFrame) rtcVideoFrame;
                videoFrame = new VideoFrame(internalRtcVideoFrame.buffer, internalRtcVideoFrame.extend_data, internalRtcVideoFrame.rotation, internalRtcVideoFrame.timestampNs, internalRtcVideoFrame.isFlip);
                videoFrame.retain();
            } else {
                videoFrame = this.mScreenFrameConverter.convert2I420Frame(rtcVideoFrame);
            }
            if (videoFrame != null) {
                long j = this.mNativeMeetingRtcEngine;
                if (j == -1) {
                    LogUtil.m257130e("MeetingRtcEngineImpl", "native engine is invalid, pushScreenFrame failed.");
                    return false;
                }
                boolean nativePushScreenFrame = MeetingRtcNativeFunctions.nativePushScreenFrame(j, videoFrame);
                videoFrame.release();
                return nativePushScreenFrame;
            }
        }
        return false;
    }

    @Override // com.ss.video.rtc.meeting.MeetingRtcEngine
    public int setupLocalScreenRender(IVideoSink iVideoSink, String str) {
        return setLocalRenderInternal(iVideoSink, str, true, false);
    }

    @Override // com.ss.video.rtc.meeting.MeetingRtcEngine
    public int setupLocalVideoRender(IVideoSink iVideoSink, String str) {
        return setLocalRenderInternal(iVideoSink, str, false, false);
    }

    @Override // com.ss.video.rtc.meeting.MeetingRtcEngine
    public int setAudioProfile(int i, int i2) {
        LogUtil.m257130e("MeetingRtcEngineImpl", "setAudioProfile not supported");
        return -1;
    }

    @Override // com.ss.video.rtc.meeting.MeetingRtcEngine
    public int setupRemoteScreenRender(IVideoSink iVideoSink, String str) {
        return setupRemoteVideoRenderInternal(iVideoSink, null, str, true, false);
    }

    @Override // com.ss.video.rtc.meeting.MeetingRtcEngine
    public int setupRemoteVideoRender(IVideoSink iVideoSink, String str) {
        return setupRemoteVideoRenderInternal(iVideoSink, null, str, false, false);
    }

    @Override // com.ss.video.rtc.meeting.MeetingRtcEngine
    public int joinBreakDownRoom(String str, boolean z) {
        long j = this.mNativeMeetingRtcEngine;
        if (j == -1) {
            LogUtil.m257130e("MeetingRtcEngineImpl", "native engine is invalid, joinBreakDownRoom failed.");
            return -1;
        }
        MeetingRtcNativeFunctions.nativeJoinBreakDownRoom(j, str, z);
        return 0;
    }

    @Override // com.ss.video.rtc.meeting.MeetingRtcEngine
    public int preloadEffect(int i, String str) {
        long j = this.mNativeMeetingRtcEngine;
        if (j != -1) {
            return MeetingRtcNativeFunctions.nativePreloadEffect(j, i, str);
        }
        LogUtil.m257130e("MeetingRtcEngineImpl", "native engine is invalid, preloadEffect failed.");
        return -1;
    }

    @Override // com.ss.video.rtc.meeting.MeetingRtcEngine
    public boolean pullExternalAudioFrame(byte[] bArr, int i) {
        long j = this.mNativeMeetingRtcEngine;
        if (j != -1) {
            return MeetingRtcNativeFunctions.nativePullExternalAudioFrame(j, bArr, i);
        }
        LogUtil.m257130e("MeetingRtcEngineImpl", "native engine is invalid, pullExternalAudioFrame failed.");
        return false;
    }

    @Override // com.ss.video.rtc.meeting.MeetingRtcEngine
    public int pushExternalAudioFrame(byte[] bArr, long j) {
        long j2 = this.mNativeMeetingRtcEngine;
        if (j2 == -1) {
            LogUtil.m257130e("MeetingRtcEngineImpl", "native engine is invalid, pushExternalAudioFrame failed.");
            return -1;
        } else if (MeetingRtcNativeFunctions.nativePushExternalAudioFrame(j2, bArr, (int) j)) {
            return 0;
        } else {
            return -1;
        }
    }

    @Override // com.ss.video.rtc.meeting.MeetingRtcEngine
    public long sendBinaryMessageToUser(String str, byte[] bArr) {
        long j = this.mNativeMeetingRtcEngine;
        if (j != -1) {
            return (long) MeetingRtcNativeFunctions.nativeSendBinaryMessageToUser(j, str, bArr);
        }
        LogUtil.m257130e("MeetingRtcEngineImpl", "native engine is invalid, SendBinaryMessageToUser failed.");
        return -1;
    }

    @Override // com.ss.video.rtc.meeting.MeetingRtcEngine
    public long sendMessageToUser(String str, String str2) {
        long j = this.mNativeMeetingRtcEngine;
        if (j != -1) {
            return (long) MeetingRtcNativeFunctions.nativeSendMessageToUser(j, str, str2);
        }
        LogUtil.m257130e("MeetingRtcEngineImpl", "native engine is invalid, SendMessageToUser failed.");
        return -1;
    }

    @Override // com.ss.video.rtc.meeting.MeetingRtcEngine
    public int setVolumeOfEffect(int i, int i2) {
        long j = this.mNativeMeetingRtcEngine;
        if (j != -1) {
            return MeetingRtcNativeFunctions.nativeSetVolumeOfEffect(j, i, i2);
        }
        LogUtil.m257130e("MeetingRtcEngineImpl", "native engine is invalid, setVolumeOfEffect failed.");
        return -1;
    }

    @Override // com.ss.video.rtc.meeting.MeetingRtcEngine
    public void startAudioDump(RtcAudioDumpSampleConfig rtcAudioDumpSampleConfig, String str) {
        long j = this.mNativeMeetingRtcEngine;
        if (j == -1) {
            LogUtil.m257130e("MeetingRtcEngineImpl", "native engine is invalid, startAudioDump failed.");
        } else {
            MeetingRtcNativeFunctions.nativeStartAudioDump(j, rtcAudioDumpSampleConfig, str);
        }
    }

    @Override // com.ss.video.rtc.meeting.MeetingRtcEngine
    public int SetRemoteUserPriority(String str, MeetingRtcConstants.RemoteUserPriority remoteUserPriority) {
        int i;
        if (this.mNativeMeetingRtcEngine == -1) {
            LogUtil.m257130e("MeetingRtcEngineImpl", "native engine is invalid, setPublishSpecialStream failed.");
            return -1;
        }
        if (remoteUserPriority != MeetingRtcConstants.RemoteUserPriority.kRemoteUserPriorityLow) {
            if (remoteUserPriority == MeetingRtcConstants.RemoteUserPriority.kRemoteUserPriorityMedium) {
                i = 100;
            } else if (remoteUserPriority == MeetingRtcConstants.RemoteUserPriority.kRemoteUserPriorityHigh) {
                i = LocationRequest.PRIORITY_HD_ACCURACY;
            }
            MeetingRtcNativeFunctions.nativeSetRemoteUserPriority(this.mNativeMeetingRtcEngine, str, i);
            return 0;
        }
        i = 0;
        MeetingRtcNativeFunctions.nativeSetRemoteUserPriority(this.mNativeMeetingRtcEngine, str, i);
        return 0;
    }

    @Override // com.ss.video.rtc.meeting.MeetingRtcEngine
    public int enableAudioVolumeIndication(int i, int i2) {
        LogUtil.m257129d("MeetingRtcEngineImpl", "enableAudioVolumeIndication interval: " + i + " ,smooth: " + i2);
        long j = this.mNativeMeetingRtcEngine;
        if (j != -1) {
            return MeetingRtcNativeFunctions.nativeEnableAudioVolumeIndication(j, i, i2);
        }
        LogUtil.m257130e("MeetingRtcEngineImpl", "native engine is invalid, enableAudioVolumeIndication failed.");
        return -1;
    }

    @Override // com.ss.video.rtc.meeting.MeetingRtcEngine
    public int enableLocalAudioVolumeIndication(int i, int i2) {
        LogUtil.m257129d("MeetingRtcEngineImpl", "enableLocalAudioVolumeIndication interval: " + i + " ,level: " + i2);
        long j = this.mNativeMeetingRtcEngine;
        if (j != -1) {
            return MeetingRtcNativeFunctions.nativeEnableLocalAudioVolumeIndication(j, i, i2);
        }
        LogUtil.m257130e("MeetingRtcEngineImpl", "native engine is invalid, enableLocalAudioVolumeIndication failed.");
        return -1;
    }

    @Override // com.ss.video.rtc.meeting.MeetingRtcEngine
    public void forceFlipVideo(boolean z, boolean z2) {
        if (this.mNativeMeetingRtcEngine == -1) {
            LogUtil.m257130e("MeetingRtcEngineImpl", "native engine is invalid, forceFlipVideo failed.");
            return;
        }
        LogUtil.m257129d("MeetingRtcEngineImpl", "forceFlipVideo flipCamera: " + z + ", flipVideo: " + z2);
        MeetingRtcNativeFunctions.nativeForceFlipVideo(this.mNativeMeetingRtcEngine, z, z2);
    }

    @Override // com.ss.video.rtc.meeting.MeetingRtcEngine
    public void forceSetCameraRotation(boolean z, boolean z2) {
        if (this.mNativeMeetingRtcEngine == -1) {
            LogUtil.m257130e("MeetingRtcEngineImpl", "native engine is invalid, forceSetCameraRotation failed.");
            return;
        }
        LogUtil.m257129d("MeetingRtcEngineImpl", "forceSetCameraRotation " + z + " ,ignore_selfview_rotation: " + z2);
        MeetingRtcNativeFunctions.nativeForceSetCameraRotation(this.mNativeMeetingRtcEngine, z, z2);
    }

    @Override // com.ss.video.rtc.meeting.MeetingRtcEngine
    public int muteRemoteAudioStream(String str, boolean z) {
        LogUtil.m257129d("MeetingRtcEngineImpl", "setDefaultMuteAllRemoteAudioStreams: " + z);
        long j = this.mNativeMeetingRtcEngine;
        if (j != -1) {
            return MeetingRtcNativeFunctions.nativeMuteRemoteAudioStream(j, str, z);
        }
        LogUtil.m257130e("MeetingRtcEngineImpl", "native engine is invalid, setDefaultMuteAllRemoteAudioStreams failed.");
        return -1;
    }

    @Override // com.ss.video.rtc.meeting.MeetingRtcEngine
    public int muteRemoteVideoStream(String str, boolean z) {
        LogUtil.m257129d("MeetingRtcEngineImpl", "muteRemoteVideoStream: " + z);
        long j = this.mNativeMeetingRtcEngine;
        if (j != -1) {
            return MeetingRtcNativeFunctions.nativeMuteRemoteVideoStream(j, str, z);
        }
        LogUtil.m257130e("MeetingRtcEngineImpl", "native engine is invalid, muteRemoteVideoStream failed.");
        return -1;
    }

    @Override // com.ss.video.rtc.meeting.MeetingRtcEngine
    public boolean pushExternalAudioFrame(byte[] bArr, int i) {
        long j = this.mNativeMeetingRtcEngine;
        if (j != -1) {
            return MeetingRtcNativeFunctions.nativePushExternalAudioFrame(j, bArr, i);
        }
        LogUtil.m257130e("MeetingRtcEngineImpl", "native engine is invalid, pushExternalAudioFrame failed.");
        return false;
    }

    @Override // com.ss.video.rtc.meeting.MeetingRtcEngine
    public void subscribeStream(String str, SubscribeConfig subscribeConfig) {
        if (subscribeConfig == null) {
            LogUtil.m257132i("MeetingRtcEngineImpl", "EventType: subscribeStream info is null");
            return;
        }
        LogUtil.m257129d("MeetingRtcEngineImpl", "subscribeStream: " + str + ", info:" + subscribeConfig.toString());
        long j = this.mNativeMeetingRtcEngine;
        if (j == -1) {
            LogUtil.m257130e("MeetingRtcEngineImpl", "native engine is invalid, subscribeStream failed.");
        } else {
            MeetingRtcNativeFunctions.nativeSubscribeStream(j, str, subscribeConfig.subVideo, subscribeConfig.subAudio, subscribeConfig.videoIndex);
        }
    }

    private boolean pushExternalVideoFrame(RtcVideoFrame rtcVideoFrame, boolean z) {
        VideoFrame videoFrame;
        VideoFrame videoFrame2;
        long currentTimeMillis = System.currentTimeMillis();
        if (this.mVideoFrameConverter == null || !this.mUseExtVideoSource) {
            LogUtil.m257130e("MeetingRtcEngineImpl", "pushExternalVideoFrame failed videoFrameConverter:" + this.mVideoFrameConverter + " useExtVideoSource:" + this.mUseExtVideoSource);
            return false;
        }
        if (rtcVideoFrame.buffer_type == 2) {
            InternalRtcVideoFrame internalRtcVideoFrame = (InternalRtcVideoFrame) rtcVideoFrame;
            videoFrame = new VideoFrame(internalRtcVideoFrame.buffer, internalRtcVideoFrame.extend_data, internalRtcVideoFrame.rotation, internalRtcVideoFrame.timestampNs, internalRtcVideoFrame.isFlip);
        } else {
            if (z) {
                videoFrame2 = this.mVideoFrameConverter.convert2VideoFrame(rtcVideoFrame);
            } else {
                videoFrame2 = this.mVideoFrameConverter.convert2I420Frame(rtcVideoFrame);
            }
            videoFrame = videoFrame2;
        }
        if (videoFrame == null) {
            LogUtil.m257130e("MeetingRtcEngineImpl", "pushExternalVideoFrame convert video frame is null");
            return false;
        } else if (this.mNativeMeetingRtcEngine == -1) {
            LogUtil.m257130e("MeetingRtcEngineImpl", "native engine is invalid, pushExternalVideoFrame failed.");
            return false;
        } else if (z) {
            MeetingRtcNativeFunctions.nativePushExternalVideoFrame(this.mNativeMeetingRtcEngine, videoFrame, VideoFrameConverter.getExtendedData(rtcVideoFrame), VideoFrameConverter.getSupplementaryInfo(rtcVideoFrame), currentTimeMillis);
            videoFrame.release();
            return true;
        } else {
            MeetingRtcNativeFunctions.nativePushExternalVideoFrame(this.mNativeMeetingRtcEngine, videoFrame, VideoFrameConverter.getExtendedData(rtcVideoFrame), VideoFrameConverter.getSupplementaryInfo(rtcVideoFrame), currentTimeMillis);
            videoFrame.release();
            return true;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0075 A[SYNTHETIC, Splitter:B:25:0x0075] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0080 A[SYNTHETIC, Splitter:B:32:0x0080] */
    /* JADX WARNING: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean unzipInternal(java.io.InputStream r6, java.lang.String r7) {
        /*
        // Method dump skipped, instructions count: 137
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.video.rtc.meeting.MeetingRtcEngineImpl.unzipInternal(java.io.InputStream, java.lang.String):boolean");
    }

    @Override // com.ss.video.rtc.meeting.MeetingRtcEngine
    public void applyEffect(EffectInfo effectInfo, MeetingRtcConstants.EffectType effectType, String str) {
        if (this.mNativeMeetingRtcEngine == -1) {
            LogUtil.m257130e("MeetingRtcEngineImpl", "native engine is invalid, applyEffect failed.");
            return;
        }
        LogUtil.m257129d("MeetingRtcEngineImpl", "applyEffect" + effectInfo.toString());
        int i = 1;
        if (C656041.$SwitchMap$com$ss$video$rtc$meeting$MeetingRtcConstants$EffectType[effectType.ordinal()] == 1) {
            i = 0;
        }
        MeetingRtcNativeFunctions.nativeApplyEffect(this.mNativeMeetingRtcEngine, effectInfo, i, str);
    }

    @Override // com.ss.video.rtc.meeting.MeetingRtcEngine
    public void setExternalVideoSource(boolean z, boolean z2, boolean z3) {
        LogUtil.m257129d("MeetingRtcEngineImpl", "setExternalVideoSource enable: " + z + " ,useTexture: " + z2 + " ,pushMode: " + z3);
        this.mUseExtVideoSource = z;
        long j = this.mNativeMeetingRtcEngine;
        if (j == -1) {
            LogUtil.m257130e("MeetingRtcEngineImpl", "native engine is invalid, setExternalVideoSource failed.");
        } else {
            MeetingRtcNativeFunctions.nativeSetExternalVideoSource(j, z);
        }
    }

    public static void setVendorType(MeetingRtcConstants.VendorType vendorType, boolean z, String str) {
        LogUtil.m257132i("MeetingRtcEngineImpl", "setVendorType " + vendorType + ", isOversea " + z + ", serviceType " + str);
        if (!mLibraryLoaded) {
            LogUtil.m257130e("MeetingRtcEngineImpl", "setVendorType fails");
            return;
        }
        int i = 2;
        if (vendorType != MeetingRtcConstants.VendorType.VENDOR_TYPE_RTC) {
            if (vendorType == MeetingRtcConstants.VendorType.VENDOR_TYPE_LARKRTC) {
                i = 3;
            } else if (vendorType == MeetingRtcConstants.VendorType.VENDOR_TYPE_LARKPRERTC) {
                i = 4;
            } else if (vendorType == MeetingRtcConstants.VendorType.VENDOR_TYPE_TEST_PRE) {
                i = 240;
            } else if (vendorType == MeetingRtcConstants.VendorType.VENDOR_TYPE_TEST_GAUSS) {
                i = 241;
            } else if (vendorType == MeetingRtcConstants.VendorType.VENDOR_TYPE_TEST) {
                i = 255;
            }
        }
        if (str == null) {
            str = "";
        }
        MeetingRtcNativeFunctions.nativeSetVendorType(i, z, str);
    }

    @Override // com.ss.video.rtc.meeting.MeetingRtcEngine
    public void setExternalVideoSource(boolean z, boolean z2, boolean z3, boolean z4) {
        setExternalVideoSource(z, z2, z3);
    }

    @Override // com.ss.video.rtc.meeting.MeetingRtcEngine
    public int joinChannel(String str, String str2, String str3, String str4) {
        return joinChannel(str, str2, str3, str4, "");
    }

    @Override // com.ss.video.rtc.meeting.MeetingRtcEngine
    public int setExternalAudioSource(boolean z, int i, int i2, int i3) {
        long j = this.mNativeMeetingRtcEngine;
        if (j == -1) {
            LogUtil.m257130e("MeetingRtcEngineImpl", "native engine is invalid, setExternalAudioSource failed.");
            return -1;
        }
        MeetingRtcNativeFunctions.nativeSetExternalAudioDevice(j, z, i, i2, i3);
        return 0;
    }

    @Override // com.ss.video.rtc.meeting.MeetingRtcEngine
    public int startAudioMixing(String str, boolean z, boolean z2, int i) {
        long j = this.mNativeMeetingRtcEngine;
        if (j != -1) {
            return MeetingRtcNativeFunctions.nativeStartAudioMixing(j, str, z, z2, i);
        }
        LogUtil.m257130e("MeetingRtcEngineImpl", "native engine is invalid, startAudioMixing failed.");
        return -1;
    }

    private int setLocalRenderInternal(IVideoSink iVideoSink, String str, boolean z, boolean z2) {
        VideoSinkAdapter videoSinkAdapter;
        if (str == null) {
            LogUtil.m257130e("MeetingRtcEngineImpl", "setLocalRenderInternal, uid is null set failed.");
            return -2;
        }
        if (iVideoSink == null) {
            LogUtil.m257132i("MeetingRtcEngineImpl", "EventType: setLocalRenderInternal videoSink is null");
            videoSinkAdapter = null;
        } else {
            LogUtil.m257132i("MeetingRtcEngineImpl", "EventType: setLocalRenderInternal videoSink:" + iVideoSink.hashCode() + " ThreadPool  workthreadID" + Thread.currentThread().getId());
            videoSinkAdapter = new VideoSinkAdapter(iVideoSink, this.mVideoSinkTask);
        }
        MeetingRtcNativeFunctions.nativeSetupLocalVideoSink(this.mNativeMeetingRtcEngine, videoSinkAdapter, z);
        return 0;
    }

    @Override // com.ss.video.rtc.meeting.MeetingRtcEngine
    public boolean setExternalAudioDevice(boolean z, int i, int i2, int i3) {
        if (i != 8000 && i != 16000 && i != 32000 && i != 44100 && i != 48000) {
            LogUtil.m257132i("MeetingRtcEngineImpl", "sample rate should in [8000 / 16000 / 32000 / 44100 / 48000], but it is setted to be:  " + i);
            return false;
        } else if (i2 != 1 && i2 != 2) {
            LogUtil.m257132i("MeetingRtcEngineImpl", "record channel num should be in [ 1 / 2 ], but it is setted to be:  " + i2);
            return false;
        } else if (i3 == 1 || i3 == 2) {
            long j = this.mNativeMeetingRtcEngine;
            if (j == -1) {
                LogUtil.m257130e("MeetingRtcEngineImpl", "native engine is invalid, setExternalAudioDevice failed.");
                return false;
            }
            MeetingRtcNativeFunctions.nativeSetExternalAudioDevice(j, z, i, i2, i3);
            MeetingRtcNativeFunctions.nativeSetAudioDeviceObserver(this.mNativeMeetingRtcEngine, this.mEngineAudioDeviceEventHandler);
            return true;
        } else {
            LogUtil.m257132i("MeetingRtcEngineImpl", "playout channel num should be in [ 1 / 2 ], but it is setted to be:  " + i3);
            return false;
        }
    }

    public static void setProxyInfo(int i, String str, int i2, String str2, String str3) {
        LogUtil.m257129d("MeetingRtcEngineImpl", "setProxyInfo");
        if (str == null) {
            LogUtil.m257130e("MeetingRtcEngineImpl", "proxy ip is invalid.");
        } else if (!mLibraryLoaded) {
            LogUtil.m257130e("MeetingRtcEngineImpl", "library is not loaded, setProxyInfo failed.");
        } else {
            MeetingRtcNativeFunctions.nativeSetProxyInfo(i, str, i2, str2, str3);
        }
    }

    @Override // com.ss.video.rtc.meeting.MeetingRtcEngine
    public int playEffect(int i, String str, boolean z, int i2, int i3) {
        long j = this.mNativeMeetingRtcEngine;
        if (j != -1) {
            return MeetingRtcNativeFunctions.nativePlayEffect(j, i, str, z, i2, i3);
        }
        LogUtil.m257130e("MeetingRtcEngineImpl", "native engine is invalid, playEffect failed.");
        return -1;
    }

    @Override // com.ss.video.rtc.meeting.MeetingRtcEngine
    public boolean pushScreenAudioFrame(byte[] bArr, int i, int i2, int i3, int i4) {
        long j = this.mNativeMeetingRtcEngine;
        if (j != -1) {
            return MeetingRtcNativeFunctions.nativePushScreenAudioFrame(j, bArr, i, i2, i3, i4);
        }
        LogUtil.m257130e("MeetingRtcEngineImpl", "native engine is invalid, unpublishScreenAudio failed.");
        return false;
    }

    private int setupRemoteVideoRenderInternal(IVideoSink iVideoSink, String str, String str2, boolean z, boolean z2) {
        VideoSinkAdapter videoSinkAdapter;
        if (str2 == null) {
            LogUtil.m257130e("MeetingRtcEngineImpl", "EventType: setupRemoteRenderInternal, uid is null");
            return -2;
        }
        if (iVideoSink == null) {
            LogUtil.m257132i("MeetingRtcEngineImpl", "EventType: setupRemoteRenderInternal videoSink is null");
            videoSinkAdapter = null;
        } else {
            LogUtil.m257132i("MeetingRtcEngineImpl", "EventType: setupRemoteRenderInternal canvas:" + iVideoSink.hashCode());
            videoSinkAdapter = new VideoSinkAdapter(iVideoSink, this.mVideoSinkTask);
        }
        MeetingRtcNativeFunctions.nativeSetupRemoteVideoSink(this.mNativeMeetingRtcEngine, videoSinkAdapter, str2, z);
        return 0;
    }

    @Override // com.ss.video.rtc.meeting.MeetingRtcEngine
    public int joinChannel(String str, String str2, String str3, String str4, String str5) {
        String str6;
        String str7;
        String str8;
        LogUtil.m257129d("MeetingRtcEngineImpl", "joinChannel with token: " + str + " , channel: " + str2 + " and uid: " + str4 + " and trace_id: " + str5);
        if (this.mState != State.IDLE) {
            return -4;
        }
        if (this.mNativeMeetingRtcEngine == -1) {
            LogUtil.m257130e("MeetingRtcEngineImpl", "native engine is invalid, joinChannel failed.");
            return -3;
        } else if (str4 == null || str4.length() == 0) {
            LogUtil.m257130e("MeetingRtcEngineImpl", "uid is invalid, joinChannel failed.");
            return -2;
        } else if (str2 == null || str2.length() == 0) {
            LogUtil.m257130e("MeetingRtcEngineImpl", "channel is invalid, joinChannel failed.");
            return -1;
        } else {
            this.mState = State.IN_ROOM;
            this.mRoom = str2;
            this.mUser = str4;
            long j = this.mNativeMeetingRtcEngine;
            if (str == null) {
                str6 = "";
            } else {
                str6 = str;
            }
            if (str3 == null) {
                str7 = "";
            } else {
                str7 = str3;
            }
            if (str5 == null) {
                str8 = "";
            } else {
                str8 = str5;
            }
            MeetingRtcNativeFunctions.nativeJoinChannel(j, str6, str2, str4, str7, str8);
            return 0;
        }
    }

    public MeetingRtcEngineImpl(Context context, String str, IMeetingRtcEngineEventHandler iMeetingRtcEngineEventHandler, Object obj, String str2) throws IllegalStateException {
        String str3;
        LogUtil.m257129d("MeetingRtcEngineImpl", "create RtcEngineImpl with appId: " + str);
        if (mLibraryLoaded) {
            mInstance = this;
            Context applicationContext = context.getApplicationContext();
            this.mContext = applicationContext;
            RtcSharedContext.initialize(applicationContext);
            HandlerThread new_android_os_HandlerThread_by_knot = new_android_os_HandlerThread_by_knot("rtc_egl_thread");
            this.mEglThread = new_android_os_HandlerThread_by_knot;
            new_android_os_HandlerThread_by_knot.start();
            VideoSinkTask videoSinkTask = new VideoSinkTask();
            this.mVideoSinkTask = videoSinkTask;
            videoSinkTask.init();
            Handler handler = new Handler(this.mEglThread.getLooper());
            this.mEglHandler = handler;
            ThreadUtils.invokeAtFrontUninterruptibly(handler, new Runnable(obj) {
                /* class com.ss.video.rtc.meeting.$$Lambda$MeetingRtcEngineImpl$I85f8svqwCeV3ELurJ59NQ6js0s */
                public final /* synthetic */ Object f$1;

                {
                    this.f$1 = r2;
                }

                public final void run() {
                    MeetingRtcEngineImpl.this.lambda$new$2$MeetingRtcEngineImpl(this.f$1);
                }
            });
            this.mAppId = str;
            this.mState = State.IDLE;
            this.mRtcEngineHandler = new WeakReference<>(iMeetingRtcEngineEventHandler);
            this.mEngineEventHandler = new MeetingRtcEngineEventHandler(this);
            this.mVideoFrameConverter = new VideoFrameConverter(false);
            this.mScreenFrameConverter = new VideoFrameConverter(false);
            RtcSharedContext.setVideoFrameConverter(this.mVideoFrameConverter);
            this.mEngineAudioDeviceEventHandler = new EngineAudioDeviceEventHandler();
            this.mByteRtcVideoFrameObserver = new ByteRtcVideoFrameObserver();
            this.mByteRtcAudioFrameObserver = new MeetingRtcAudioFrameObserver(this);
            this.mMeetingRtcMetadataObserver = new MeetingRtcMetadataObserver(this);
            this.mMeetingAudioTestObserver = new MeetingRtcAudioTestObserver(this);
            MeetingRtcNativeFunctions.nativeSetBuiltInResourcePath(prepareEffectResource());
            long j = RtcSharedContext.getEGLContext().getEglBaseContext() != null ? RtcSharedContext.getEGLContext().getEglBaseContext().getNativeEglContext() : 0;
            Context applicationContext2 = this.mContext.getApplicationContext();
            MeetingRtcEngineEventHandler meetingRtcEngineEventHandler = this.mEngineEventHandler;
            EglBase.Context eglBaseContext = RtcSharedContext.getEGLContext().getEglBaseContext();
            if (str2 == null) {
                str3 = "";
            } else {
                str3 = str2;
            }
            long nativeCreateByteRtcEngine = MeetingRtcNativeFunctions.nativeCreateByteRtcEngine(applicationContext2, str, meetingRtcEngineEventHandler, eglBaseContext, j, str3);
            this.mNativeMeetingRtcEngine = nativeCreateByteRtcEngine;
            if (nativeCreateByteRtcEngine == -1) {
                LogUtil.m257130e("MeetingRtcEngineImpl", "create native engine error, native engine is invalid.");
            } else {
                MeetingRtcNativeFunctions.nativeSetAppVersion(nativeCreateByteRtcEngine, getAppVersion());
            }
            NetworkUtils.registerReceiver(context);
            AppMonitor.get(context).register(context, this.appStateCallback);
            return;
        }
        mInstance = null;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("event_key", "rtc_error");
            jSONObject.put("rtc_app_id", str);
            jSONObject.put("device_id", mDeviceId);
            jSONObject.put("error_code", -1072);
            jSONObject.put("message", "rtc_sdk_load_so_failed");
            jSONObject.put("timestamp", System.currentTimeMillis());
            jSONObject.put("rtc_timestamp", System.currentTimeMillis());
            jSONObject.put("os", "android");
            jSONObject.put("product_line", "rtc");
            jSONObject.put("report_version", 5);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        iMeetingRtcEngineEventHandler.onLogReport("live_webrtc_monitor_log", jSONObject);
        iMeetingRtcEngineEventHandler.onError(-1072);
        LogUtil.m257130e("MeetingRtcEngineImpl", "Load so failed.");
        throw new IllegalStateException("Create engine failed");
    }
}
