package com.ss.ttvideoengine.log;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.frameworks.baselib.network.http.cronet.impl.C14002h;
import com.bytedance.vcloud.networkpredictor.SpeedPredictorResultCollection;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.adapter.internal.CommonCode;
import com.huawei.hms.android.HwBuildEx;
import com.huawei.hms.framework.common.ContainerUtils;
import com.huawei.hms.location.LocationRequest;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.huawei.hms.maps.model.CameraPosition;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.ss.android.lark.calendar.impl.features.search.result.CalendarSearchResultRv;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.mm.module.list.control.MmListControl;
import com.ss.android.ttvecamera.p3038g.C60375c;
import com.ss.android.vc.meeting.framework.meeting.IByteRtcError;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;
import com.ss.ttm.player.PlaybackParams;
import com.ss.ttvideoengine.AppInfo;
import com.ss.ttvideoengine.DataLoaderHelper;
import com.ss.ttvideoengine.Resolution;
import com.ss.ttvideoengine.TTNetWorkListener;
import com.ss.ttvideoengine.TTVideoEngine;
import com.ss.ttvideoengine.VideoInfoCollector;
import com.ss.ttvideoengine.data.VideoLoadWrapper;
import com.ss.ttvideoengine.log.IVideoEventLogger;
import com.ss.ttvideoengine.log.VideoEventLoggerV2;
import com.ss.ttvideoengine.metrics.IMediaMetrics;
import com.ss.ttvideoengine.metrics.MetricsFactory;
import com.ss.ttvideoengine.model.IVideoModel;
import com.ss.ttvideoengine.model.VideoModel;
import com.ss.ttvideoengine.net.DNSServerIP;
import com.ss.ttvideoengine.utils.EngineThreadPool;
import com.ss.ttvideoengine.utils.Error;
import com.ss.ttvideoengine.utils.ScreenUtils;
import com.ss.ttvideoengine.utils.TTHelper;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import com.ss.ttvideoengine.utils.TimeService;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import org.json.JSONArray;
import org.json.JSONObject;

public class VideoEventLoggerV2 implements IVideoEventLogger {
    private static Map sFeatures = new HashMap();
    private static int sIsColdStart = 1;
    private ArrayList<String> mAVBadInterlacedList = new ArrayList<>();
    private boolean mAVOutSyncing = false;
    private int mAccumVDS;
    private int mAccumVPS;
    private int mApiVer = -1;
    private int mAsyncCodecId = -1;
    private int mAsyncInit;
    private String mAudioInitURL;
    private boolean mAudioStreamDisabled;
    private String mAuth;
    private long mBitrate;
    private long mBlockBeginT;
    public int mBreakCount;
    private BrightnessMonitor mBrightMonitor;
    private int mBufferDataSeconds;
    public int mBufferTimeout = Integer.MIN_VALUE;
    private ArrayList<Integer> mChargingList = new ArrayList<>();
    private Context mContext;
    public int mCurBufferCount;
    public long mCurDecoderBufferAccuT;
    public int mCurDecoderBufferCount;
    private Error mCurError = null;
    public long mCustomClickT = -2147483648L;
    public long mCustomGetVideoModelT = -2147483648L;
    public long mCustomInitEngineT = -2147483648L;
    private int mCustomP2PCDNType = -1;
    public long mCustomPlayEngineT = -2147483648L;
    private String mCustomStr;
    public EventLoggerSource mDataSource;
    private long mDecodeBufferingStartT;
    private int mDisableAccurateStart;
    private int mDuration;
    private int mEnableBash;
    private int mEnableMask = 0;
    private int mEnableMaskThread = 0;
    private int mEnableNNSR;
    private int mEnableOptSubLoad = 0;
    private boolean mEnablePlayerDegrade;
    private boolean mEnableSpeedReport;
    private int mEnableSub = 0;
    private int mEnableSubThread = 0;
    private ArrayList mErrorInfo;
    private ArrayList<String> mErrorList = new ArrayList<>();
    public VideoEventOnePlay mEvent;
    public VideoEventBase mEventBase;
    private VideoEventOneError mEventOneError;
    private VideoEventOneEvent mEventOneEvent;
    private VideoEventOneOpera mEventOneOpera;
    private VideoEventOneOutSync mEventOneOutSync;
    private VideoEventSampleRecord mEventSample;
    private String mExtraInfo = "";
    private FeatureConfigs mFeatureConfigs;
    private Map mFeatures = new HashMap();
    private boolean mFetchComplete;
    private VideoFilterMonitor mFilterMonitor;
    private ArrayList mFirstDNSErrorInfo;
    private int mFirstRangeSize;
    private int mHardwareConfType = -1;
    private final HeadsetStateMonitor mHeadsetStateMonitor;
    private int mHeight;
    private String mInitialHost;
    private String mInitialIP;
    private String mInitialQuality = "";
    private String mInitialResolution = "";
    private String mInitialURL;
    private boolean mIsDegradeRelease;
    private boolean mIsEngineReuse;
    private boolean mIsLocal;
    private int mIsReplay;
    private int mIsStartPlayAutomatically;
    private boolean mLeave;
    private int mLeaveReason = IByteRtcError.BRERR_NO_PUBLISH_PERMISSION;
    private int mLoopCount;
    private ArrayList<String> mLoopList = new ArrayList<>();
    private boolean mLooping;
    public long mMDLDownloadSize;
    public long mMDLDownloadTime;
    private ArrayList<String> mMDLRetryInfo;
    private Map mMainError;
    private int mMaskErrc = 0;
    private String mMaskURL = "";
    public int mMediaCodecRender = Integer.MIN_VALUE;
    private String mMessage = "";
    private int mModelVersion;
    public int mNetBufferIndex;
    private int mNetLevelIntervalMs;
    public int mNetLevelMaxCount = 1000;
    private int mNetSpeedLevel;
    private int mNetSpeedUpdateInterval;
    private int mNetWorkTryCount = -1;
    private float mNetworkSpeedPredictSamplingRate;
    public int mNetworkTimeout = Integer.MIN_VALUE;
    private NoAVRenderEvent mNoAVRenderEvent;
    private ArrayList<String> mNoAudioRenderList = new ArrayList<>();
    private ArrayList<String> mNoVideoRenderList = new ArrayList<>();
    private String mP2PSDKVersion = "";
    private String mP2PUrl = "";
    private ArrayList<String> mPauseList = new ArrayList<>();
    private int mPlayCount;
    private ArrayList<String> mPlayList = new ArrayList<>();
    private ArrayList<String> mPlaySpeedList = new ArrayList<>();
    private Map mPlaybackParams;
    private ArrayList<Integer> mPowerList = new ArrayList<>();
    private int mPreRangeOff;
    private String mProxyUrl = "";
    private int mRadioMode;
    private ArrayList<String> mRadiomodeList = new ArrayList<>();
    private int mReadCacheMode;
    private ArrayList<String> mResolutionList = new ArrayList<>();
    private ArrayList mRetryFetchErrorInfo;
    private long mRetryStartT = -2147483648L;
    private int mRetryStrategy = -1;
    private long mSeekBeginT;
    private int mSeekCount;
    private SuperResolutionMonitor mSrMonitor;
    private int mStartTime;
    private int mState;
    private String mSubError = "";
    private int mSubIdsCount = 0;
    private int mSubLanSwitchCount = 0;
    private String mSubReqURL = "";
    private String mSurfaceCode;
    private long mSurfaceSetTime;
    private int mSwitchResolutionCount;
    private Timer mTimer;
    private TimerTask mTimerTask;
    private boolean mUploadLogEnabled;
    private int mUseCodecPool;
    private ArrayList mVUArray;
    private IVideoModel mVideoModel;
    private boolean mVideoStreamDisabled;
    private int mWidth;
    private long prepare_before_play_t = -2147483648L;
    private long ps_t = -2147483648L;
    private long setds_t = -2147483648L;

    @Override // com.ss.ttvideoengine.log.IVideoEventLogger
    public void accuBuffingTime(long j) {
    }

    @Override // com.ss.ttvideoengine.log.IVideoEventLogger
    public void didSentEvent(int i) {
    }

    @Override // com.ss.ttvideoengine.log.IVideoEventLogger
    public void accumulateSize() {
        _accumulateVPS();
    }

    @Override // com.ss.ttvideoengine.log.IVideoEventLogger
    public long getCurDecoderBufferAccuT() {
        return this.mCurDecoderBufferAccuT;
    }

    @Override // com.ss.ttvideoengine.log.IVideoEventLogger
    public int getCurDecoderBufferCount() {
        return this.mCurDecoderBufferCount;
    }

    @Override // com.ss.ttvideoengine.log.IVideoEventLogger
    public String getExtraInfo() {
        return this.mExtraInfo;
    }

    @Override // com.ss.ttvideoengine.log.IVideoEventLogger
    public boolean isUploadLogEnabled() {
        return this.mUploadLogEnabled;
    }

    private void _sendEvent() {
        if (this.mEvent != null) {
            if (!this.mEnablePlayerDegrade || !this.mIsDegradeRelease) {
                TTVideoEngineLog.m256505i("VideoEventLoggerV2", "sendEvent pt_new:" + this.mEvent.pt_new + ", mEvent:" + this.mEvent + ", eventBase:" + this.mEventBase);
            } else {
                TTVideoEngineLog.m256505i("VideoEventLoggerV2", "player degrade, store context");
            }
            if (this.mEvent.pt_new > 0 || this.ps_t > 0) {
                EventLoggerSource eventLoggerSource = this.mDataSource;
                if (eventLoggerSource != null) {
                    Map bytesInfo = eventLoggerSource.bytesInfo();
                    if (bytesInfo != null) {
                        int intValue = ((Long) bytesInfo.get("vps")).intValue();
                        int intValue2 = ((Long) bytesInfo.get("vds")).intValue();
                        int intValue3 = ((Long) bytesInfo.get("single_vds")).intValue();
                        this.mEvent.vps = this.mAccumVPS + intValue;
                        if (this.mLooping) {
                            this.mEvent.vds = this.mAccumVDS + intValue3;
                        } else {
                            this.mEvent.vds = this.mAccumVDS + intValue2;
                        }
                        EngineThreadPool.addExecuteTask(new VideoInfoCollector.myVideoCollectorAddConsumeSize((long) this.mEvent.vps));
                    }
                    this.mEvent.render_type = this.mDataSource.getLogValueStr(1);
                    logMessage(this.mDataSource.getLogValueStr(2));
                    this.mEvent.apiString = this.mDataSource.getLogValueStr(3);
                    this.mEvent.netClient = this.mDataSource.getLogValueStr(4);
                    this.mEvent.engineState = this.mDataSource.getLogValueInt(23);
                    this.mEvent.isPreferNearestSample = this.mDataSource.getLogValueInt(34);
                    this.mEvent.networkTimeout = this.mDataSource.getLogValueInt(35);
                    this.mEvent.isDisableShortSeek = this.mDataSource.getLogValueInt(36);
                    if (this.mEvent.internalIP == null) {
                        String logValueStr = this.mDataSource.getLogValueStr(5);
                        if (logValueStr == null) {
                            logValueStr = "";
                        }
                        this.mEvent.internalIP = logValueStr;
                    }
                    String logValueStr2 = this.mDataSource.getLogValueStr(33);
                    if (!TextUtils.isEmpty(logValueStr2)) {
                        this.mEvent.loaderType = logValueStr2;
                    }
                    if (this.mEvent.dnsT <= 0) {
                        this.mEvent.dnsModule = 1;
                        this.mEvent.dnsT = this.mDataSource.getLogValueLong(7);
                    }
                    if (this.mEvent.tranConnectT <= 0) {
                        long logValueLong = this.mDataSource.getLogValueLong(10);
                        if (logValueLong > this.ps_t) {
                            this.mEvent.tranConnectT = logValueLong;
                        }
                    }
                    if (this.mEvent.tranFirstPacketT <= 0) {
                        long logValueLong2 = this.mDataSource.getLogValueLong(11);
                        if (logValueLong2 > this.ps_t) {
                            this.mEvent.tranFirstPacketT = logValueLong2;
                        }
                    }
                    if (this.mEvent.audioDnsT <= 0) {
                        this.mEvent.audioDnsT = this.mDataSource.getLogValueLong(51);
                    }
                    if (this.mEvent.audioTranConnectT <= 0) {
                        long logValueLong3 = this.mDataSource.getLogValueLong(52);
                        if (logValueLong3 > this.ps_t) {
                            this.mEvent.audioTranConnectT = logValueLong3;
                        }
                    }
                    if (this.mEvent.audioTranFirstPacketT <= 0) {
                        long logValueLong4 = this.mDataSource.getLogValueLong(53);
                        if (logValueLong4 > this.ps_t) {
                            this.mEvent.audioTranFirstPacketT = logValueLong4;
                        }
                    }
                    if (this.mEvent.receiveFirstVideoFrameT <= 0) {
                        this.mEvent.receiveFirstVideoFrameT = this.mDataSource.getLogValueLong(12);
                    }
                    if (this.mEvent.receiveFirstAudioFrameT <= 0) {
                        this.mEvent.receiveFirstAudioFrameT = this.mDataSource.getLogValueLong(13);
                    }
                    if (this.mEvent.decodeFirstVideoFrameT <= 0) {
                        this.mEvent.decodeFirstVideoFrameT = this.mDataSource.getLogValueLong(14);
                    }
                    if (this.mEvent.decodeFirstAudioFrameT <= 0) {
                        this.mEvent.decodeFirstAudioFrameT = this.mDataSource.getLogValueLong(15);
                    }
                    if (this.mEvent.videoDeviceStartTime <= 0) {
                        this.mEvent.videoDeviceStartTime = this.mDataSource.getLogValueLong(17);
                    }
                    if (this.mEvent.audioDeviceStartTime <= 0) {
                        this.mEvent.audioDeviceStartTime = this.mDataSource.getLogValueLong(16);
                    }
                    if (this.mEvent.videoDeviceOpenedTime <= 0) {
                        this.mEvent.videoDeviceOpenedTime = this.mDataSource.getLogValueLong(19);
                    }
                    if (this.mEvent.audioDeviceOpenedTime <= 0) {
                        this.mEvent.audioDeviceOpenedTime = this.mDataSource.getLogValueLong(18);
                    }
                    if (this.mEvent.playPreparedT <= 0) {
                        this.mEvent.playPreparedT = this.mDataSource.getLogValueLong(38);
                    }
                    if (this.mEvent.playStartedT <= 0) {
                        this.mEvent.playStartedT = this.mDataSource.getLogValueLong(39);
                    }
                    this.mEvent.core_volume = this.mDataSource.getLogValueInt(61);
                    this.mEvent.mute = this.mDataSource.getLogValueInt(27);
                    this.mEvent.apiverFinal = this.mDataSource.getLogValueInt(30);
                    this.mEvent.chipBoardName = this.mDataSource.getLogValueStr(31);
                    this.mEvent.chipHardwareName = this.mDataSource.getLogValueStr(32);
                    this.mEvent.ae_type = this.mDataSource.getLogValueInt(81);
                    this.mEvent.videoAudioGap = this.mDataSource.getLogValueLong(54);
                    this.mEvent.moovPos = this.mDataSource.getLogValueLong(57);
                    this.mEvent.mdatPos = this.mDataSource.getLogValueLong(58);
                    int logValueInt = this.mDataSource.getLogValueInt(100);
                    if (logValueInt != 0) {
                        this.mEvent.textureRenderErrorCode = logValueInt;
                    }
                    if (this.mEvent.mVideoCodecProfile == Integer.MIN_VALUE) {
                        this.mEvent.mVideoCodecProfile = this.mDataSource.getLogValueInt(63);
                    }
                    if (this.mEvent.mAudioCodecProfile == Integer.MIN_VALUE) {
                        this.mEvent.mAudioCodecProfile = this.mDataSource.getLogValueInt(64);
                    }
                    if (this.mEventBase.mVideoHWUser == 1 && this.mEventBase.mVideoHW == 0) {
                        this.mEvent.mVideoHWErrReason = this.mDataSource.getLogValueInt(77);
                    }
                    this.mEvent.mIsViewHidden = this.mDataSource.getLogValueInt(87);
                    Map batteryInfo = this.mDataSource.batteryInfo();
                    if (batteryInfo != null) {
                        this.mPowerList.add((Integer) batteryInfo.get("power"));
                        this.mChargingList.add((Integer) batteryInfo.get("isCharging"));
                    }
                    ArrayList forebackSwitchList = this.mDataSource.forebackSwitchList();
                    if (forebackSwitchList != null) {
                        this.mEvent.mForebackSwitchList = forebackSwitchList;
                    }
                }
                int i = this.mDuration;
                if (i > 0) {
                    this.mEventBase.vd = i;
                }
                Context context = this.mContext;
                if (context != null) {
                    SharedPreferences sharedPreferences = context.getSharedPreferences("VideoEventLogger", 0);
                    this.mEvent.mLastSessionID = sharedPreferences.getString("playersessionid", "");
                    SharedPreferences.Editor edit = sharedPreferences.edit();
                    edit.putString("playersessionid", this.mEventBase.mSessionID);
                    edit.apply();
                }
                this.mEvent.mSessionID = this.mEventBase.mSessionID;
                this.mEvent.leave_reason = this.mLeaveReason;
                this.mEvent.apiver = this.mApiVer;
                this.mEvent.auth = this.mAuth;
                this.mEvent.startTime = this.mStartTime;
                this.mEvent.disableAccurateStart = this.mDisableAccurateStart;
                this.mEvent.vu = this.mVUArray;
                this.mEvent.lf = this.mEventBase.mLastResolution;
                this.mEvent.df = this.mEventBase.mCurrentResolution;
                this.mEvent.merror = this.mMainError;
                this.mEvent.isStartPlayAutomatically = this.mIsStartPlayAutomatically;
                this.mEvent.bufferSeconds = this.mBufferDataSeconds;
                this.mEvent.loopcount = this.mLoopCount;
                this.mEvent.width = this.mWidth;
                this.mEvent.height = this.mHeight;
                this.mEvent.p2pUrl = this.mP2PUrl;
                this.mEvent.customP2PCDNType = this.mCustomP2PCDNType;
                this.mEvent.asyncInit = this.mAsyncInit;
                this.mEvent.asyncCodecId = this.mAsyncCodecId;
                this.mEvent.dns_server_ip = DNSServerIP.getDNSServerIP();
                this.mEvent.bc = this.mCurBufferCount;
                this.mEvent.br = this.mBreakCount;
                this.mEvent.bitrate = this.mBitrate;
                this.mEvent.firstRangeSize = (long) this.mFirstRangeSize;
                this.mEvent.netSpeedLevel = (long) this.mNetSpeedLevel;
                this.mEvent.modelVersion = (long) this.mModelVersion;
                this.mEvent.mRadioMode = this.mRadioMode;
                this.mEvent.mAudioStreamDisabled = this.mAudioStreamDisabled;
                this.mEvent.mVideoStreamDisabled = this.mVideoStreamDisabled;
                this.mEvent.isReplay = this.mIsReplay;
                this.mEvent.mediaCodecRender = this.mMediaCodecRender;
                this.mEvent.codecPool = this.mUseCodecPool;
                long j = this.mSurfaceSetTime;
                if (j > 0) {
                    this.mEvent.surfaceSetTime = j;
                }
                this.mEvent.surfaceCode = this.mSurfaceCode;
                VideoEventOneEvent videoEventOneEvent = this.mEventOneEvent;
                if (videoEventOneEvent != null) {
                    this.mEvent.bufferAccuT = videoEventOneEvent.mAccuCostTime;
                }
                this.mEvent.decoderBufferAccuT = this.mCurDecoderBufferAccuT;
                this.mEvent.seekCount = this.mSeekCount;
                this.mEvent.switchResolutionCount = this.mSwitchResolutionCount;
                this.mEvent.mEnableNNSR = this.mEnableNNSR;
                this.mEvent.mReadCacheMode = this.mReadCacheMode;
                this.mEvent.mPreRangeOff = this.mPreRangeOff;
                this.mEvent.mBufferTimeout = this.mBufferTimeout;
                this.mEvent.mCustomPlayEngineT = this.mCustomPlayEngineT;
                this.mEvent.mCustomInitEngineT = this.mCustomInitEngineT;
                this.mEvent.mCustomGetVideoModelT = this.mCustomGetVideoModelT;
                this.mEvent.mCustomClickT = this.mCustomClickT;
                this.mEvent.mHardwareConfType = this.mHardwareConfType;
                this.mEvent.mScreenWidth = getScreenWidth();
                this.mEvent.mScreenHeight = getScreenHeight();
                this.mEvent.mPixelDensity = ScreenUtils.getScreenPixelDensity();
                if (this.mSrMonitor.getWidthFactor() > BitmapDescriptorFactory.HUE_RED) {
                    this.mEvent.mSrWidthFactor = this.mSrMonitor.getWidthFactor();
                }
                if (this.mSrMonitor.getHeightFactor() > BitmapDescriptorFactory.HUE_RED) {
                    this.mEvent.mSrHeightFactor = this.mSrMonitor.getHeightFactor();
                }
                this.mEvent.mVideoFilterList = this.mFilterMonitor.getList();
                this.mEvent.mBrightList = this.mBrightMonitor.getList();
                this.mEvent.mViewSizeList = getViewSizeList();
                HashMap hashMap = new HashMap();
                int i2 = 0;
                while (true) {
                    try {
                        if (i2 >= this.mRetryFetchErrorInfo.size()) {
                            break;
                        } else if (i2 >= 3) {
                            break;
                        } else {
                            hashMap.put(String.format("fetchretry%d", Integer.valueOf(i2)), this.mRetryFetchErrorInfo.get(i2));
                            i2++;
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                int i3 = 0;
                while (true) {
                    if (i3 >= this.mFirstDNSErrorInfo.size()) {
                        break;
                    } else if (i3 >= 3) {
                        break;
                    } else {
                        hashMap.put(String.format("ldns%d", Integer.valueOf(i3)), ((Error) this.mFirstDNSErrorInfo.get(i3)).toMap());
                        i3++;
                    }
                }
                for (int i4 = 0; i4 < this.mErrorInfo.size(); i4++) {
                    if (i4 < 2 || i4 == this.mErrorInfo.size() - 1) {
                        hashMap.put(String.format("error%d", Integer.valueOf(i4)), this.mErrorInfo.get(i4));
                    }
                }
                if (!TextUtils.isEmpty(this.mMessage)) {
                    hashMap.put("log", this.mMessage);
                }
                if (!TextUtils.isEmpty(this.mEvent.textureRenderErrorMsg)) {
                    hashMap.put("tr_err_msg", this.mEvent.textureRenderErrorMsg);
                }
                this.mMessage = "";
                this.mEvent.ex = hashMap;
                this.mExtraInfo = hashMap.toString();
                String str = this.mCustomStr;
                if (str != null) {
                    this.mEvent.mCustomStr = str;
                }
                String str2 = this.mInitialURL;
                if (str2 != null) {
                    this.mEvent.mInitialURL = str2;
                }
                String str3 = this.mAudioInitURL;
                if (str3 != null) {
                    this.mEvent.mAudioInitUrl = str3;
                }
                String str4 = this.mInitialHost;
                if (str4 != null) {
                    this.mEvent.mInitialHost = str4;
                }
                String str5 = this.mInitialIP;
                if (str5 != null) {
                    this.mEvent.mInitialIP = str5;
                }
                String str6 = this.mInitialResolution;
                if (str6 != null) {
                    this.mEvent.mInitialResolution = str6;
                }
                String str7 = this.mInitialQuality;
                if (str7 != null) {
                    this.mEvent.mInitialQuality = str7;
                }
                String str8 = this.mProxyUrl;
                if (str8 != null) {
                    this.mEvent.proxy_url = str8;
                }
                Map map = this.mPlaybackParams;
                if (map != null) {
                    this.mEvent.playbackparams = map;
                }
                String str9 = this.mSubReqURL;
                if (str9 != null) {
                    this.mEvent.mSubReqURL = str9;
                }
                String str10 = this.mMaskURL;
                if (str10 != null) {
                    this.mEvent.mMaskURL = str10;
                }
                String str11 = this.mSubError;
                if (str11 != null) {
                    this.mEvent.mSubError = str11;
                }
                if (this.mEvent.mask_opened_t <= 0) {
                    this.mEvent.mask_opened_t = -2147483648L;
                }
                if (this.mEvent.mask_open_t <= 0) {
                    this.mEvent.mask_open_t = -2147483648L;
                }
                if (this.mEvent.sub_req_finish_t <= 0) {
                    this.mEvent.sub_req_finish_t = -2147483648L;
                }
                if (this.mEvent.sub_load_finish_t <= 0) {
                    this.mEvent.sub_load_finish_t = -2147483648L;
                }
                this.mEvent.enableSub = this.mEnableSub;
                this.mEvent.enableSubThread = this.mEnableSubThread;
                this.mEvent.enableMask = this.mEnableMask;
                this.mEvent.enableMaskThread = this.mEnableMaskThread;
                this.mEvent.maskErrc = this.mMaskErrc;
                this.mEvent.subLanSwichCount = this.mSubLanSwitchCount;
                this.mEvent.subIdsCount = this.mSubIdsCount;
                this.mEvent.enableBash = this.mEnableBash;
                this.mEvent.enableMDL = this.mEventBase.mEnableMDL;
                this.mEvent.netWorkTryCount = this.mNetWorkTryCount;
                this.mEvent.isColdStart = sIsColdStart;
                sIsColdStart = 0;
                if (this.mEvent.lastSeekEndT < this.mEvent.lastSeekStartT) {
                    this.mEvent.lastSeekEndT = -2147483648L;
                }
                if (this.mEvent.lastResolutionEndT < this.mEvent.lastResolutionStartT) {
                    this.mEvent.lastResolutionEndT = -2147483648L;
                }
                this.mEvent.prepare_before_play_t = this.prepare_before_play_t;
                this.mEvent.setds_t = this.setds_t;
                VideoEventOnePlay videoEventOnePlay = this.mEvent;
                videoEventOnePlay.pt = videoEventOnePlay.pt_new;
                this.mEvent.ps_t = this.ps_t;
                if (this.mEvent.et <= 0 && this.mEvent.vt > 0) {
                    this.mEvent.et = System.currentTimeMillis();
                }
                this.mEvent.mPlayList = this.mPlayList;
                this.mEvent.mPauseList = this.mPauseList;
                this.mEvent.mResolutionList = this.mResolutionList;
                this.mEvent.mPlaySpeedList = this.mPlaySpeedList;
                this.mEvent.mRadiomodeList = this.mRadiomodeList;
                this.mEvent.mLoopList = this.mLoopList;
                this.mEvent.mErrorList = this.mErrorList;
                this.mEvent.mRebufList = this.mEventOneEvent.mRebufList;
                this.mEvent.mSeekList = this.mEventOneOpera.mSeekList;
                this.mEvent.mHeadsetStateList = this.mHeadsetStateMonitor.getConnectionHistory();
                this.mEvent.mAVOutsyncList = this.mEventOneOutSync.mList;
                this.mEvent.mAVOutsyncCount = this.mEventOneOutSync.mAVOutSyncCount;
                this.mEvent.mMDLRetryList = this.mMDLRetryInfo;
                this.mEvent.mPowerList = this.mPowerList;
                this.mEvent.mChargingList = this.mChargingList;
                this.mEvent.mAVBadInterlacedList = this.mAVBadInterlacedList;
                NoAVRenderEvent noAVRenderEvent = this.mNoAVRenderEvent;
                if (noAVRenderEvent != null && !noAVRenderEvent.isStopped()) {
                    this.mNoAVRenderEvent.stop();
                    NoAVRenderEvent.addToCorrespondList(this.mNoAVRenderEvent, this.mNoAudioRenderList, this.mNoVideoRenderList);
                }
                this.mEvent.mNoVideoRenderList = this.mNoVideoRenderList;
                this.mEvent.mNoAudioRenderList = this.mNoAudioRenderList;
                _getVidInfo();
                _getMaskEvents();
                _getSubEvents();
                if (TextUtils.isEmpty(this.mEvent.log_id)) {
                    _parseUrlLogID();
                }
                if (this.mBlockBeginT > 0) {
                    this.mEvent.leave_block_t = (int) (SystemClock.elapsedRealtime() - this.mBlockBeginT);
                }
                VideoEventOneOpera videoEventOneOpera = this.mEventOneOpera;
                if (videoEventOneOpera != null) {
                    this.mEvent.seek_accu_t = videoEventOneOpera.mAccuCostTime;
                }
                if (TimeService.isUpdated()) {
                    this.mEvent.server_local_diff = TimeService.currentTimeMillis() - System.currentTimeMillis();
                }
                _updateFeatures();
                this.mEvent.mNetworkScore = TTNetWorkListener.MyNetworkQualityHelper.getInstance().getNetworkScore();
                if (!this.mEnablePlayerDegrade) {
                    EngineThreadPool.addExecuteTask(new AyncGetLogDataRunnable(this.mContext, this.mEvent, this, this.mEventBase));
                } else if (this.mIsDegradeRelease) {
                    TTVideoEngineLog.m256505i("VideoEventLoggerV2", "degrade1, vid:" + this.mEventBase.mOriginVid);
                    VideoEventOneStorage.getInstance().storeOnePlay(this.mEventBase.mOriginVid, this.mEvent);
                    VideoEventOneStorage.getInstance().storeSessionId(this.mEventBase.mOriginVid, this.mEventBase.mSessionID);
                    this.mIsDegradeRelease = false;
                } else {
                    TTVideoEngineLog.m256505i("VideoEventLoggerV2", "degrade2, vid:" + this.mEventBase.mOriginVid);
                    VideoEventOneStorage.getInstance().storeOnePlay(this.mEventBase.mOriginVid, this.mEvent);
                    this.mEventBase.degradeModeChangeSession();
                    VideoEventOnePlay restoreOnePlay = VideoEventOneStorage.getInstance().restoreOnePlay(this.mEventBase.mOriginVid);
                    this.mEvent = restoreOnePlay;
                    EngineThreadPool.addExecuteTask(new AyncGetLogDataRunnable(this.mContext, restoreOnePlay, this, this.mEventBase));
                    VideoEventOneStorage.getInstance().removeByVideoId(this.mEventBase.mOriginVid);
                }
                _clear();
            }
        }
    }

    @Override // com.ss.ttvideoengine.log.IVideoEventLogger
    public void addSubtitleSwitchTime() {
        this.mSubLanSwitchCount++;
    }

    @Override // com.ss.ttvideoengine.log.IVideoEventLogger
    public void reportBufferingMetrics() {
        VideoEventOneEvent videoEventOneEvent = this.mEventOneEvent;
        if (videoEventOneEvent != null) {
            videoEventOneEvent.triggerBufferStartCb();
        }
    }

    private int getScreenHeight() {
        if (AppInfo.mScreenHeight > 0) {
            return AppInfo.mScreenHeight;
        }
        return ScreenUtils.getScreenHeight();
    }

    private int getScreenWidth() {
        if (AppInfo.mScreenWidth > 0) {
            return AppInfo.mScreenWidth;
        }
        return ScreenUtils.getScreenWidth();
    }

    @Override // com.ss.ttvideoengine.log.IVideoEventLogger
    public int getMovieStalledType() {
        VideoEventOneEvent videoEventOneEvent = this.mEventOneEvent;
        if (videoEventOneEvent != null) {
            return videoEventOneEvent.getMovieStalledType();
        }
        return -1;
    }

    @Override // com.ss.ttvideoengine.log.IVideoEventLogger
    public long getStalledAudioBufferTime() {
        VideoEventOneEvent videoEventOneEvent = this.mEventOneEvent;
        if (videoEventOneEvent != null) {
            return videoEventOneEvent.getStatlledAudioBufferTime();
        }
        return -1;
    }

    @Override // com.ss.ttvideoengine.log.IVideoEventLogger
    public long getStalledVideoBufferTime() {
        VideoEventOneEvent videoEventOneEvent = this.mEventOneEvent;
        if (videoEventOneEvent != null) {
            return videoEventOneEvent.getStalledVideoBufferTime();
        }
        return -1;
    }

    @Override // com.ss.ttvideoengine.log.IVideoEventLogger
    public String getTraceID() {
        VideoEventOnePlay videoEventOnePlay = this.mEvent;
        if (videoEventOnePlay != null) {
            return videoEventOnePlay.traceID;
        }
        return null;
    }

    @Override // com.ss.ttvideoengine.log.IVideoEventLogger
    public void showedFirstFrame() {
        if (this.mDataSource != null) {
            this.mDataSource.onInfo(2, _getFirstFrameSplitInfo());
        }
    }

    @Override // com.ss.ttvideoengine.log.IVideoEventLogger
    public void watchFinish() {
        VideoEventOnePlay videoEventOnePlay = this.mEvent;
        if (videoEventOnePlay != null) {
            videoEventOnePlay.finish = 1;
        }
    }

    @Override // com.ss.ttvideoengine.log.IVideoEventLogger
    public long getLeaveWaitTime() {
        VideoEventOnePlay videoEventOnePlay = this.mEvent;
        if (videoEventOnePlay == null || videoEventOnePlay.pt_new <= 0 || this.mEvent.lt <= 0) {
            return 0;
        }
        return this.mEvent.lt - this.mEvent.pt_new;
    }

    @Override // com.ss.ttvideoengine.log.IVideoEventLogger
    public void loopAgain() {
        this.mLoopCount++;
        this.mLoopList.add(String.valueOf(System.currentTimeMillis()));
    }

    @Override // com.ss.ttvideoengine.log.IVideoEventLogger
    public void movieBufferDidReachEnd() {
        if (this.mEvent.bft <= 0) {
            this.mEvent.bft = System.currentTimeMillis();
        }
    }

    @Override // com.ss.ttvideoengine.log.IVideoEventLogger
    public void playbackBufferEnd() {
        if (this.mEvent.playbackBufferEndT <= 0) {
            this.mEvent.playbackBufferEndT = System.currentTimeMillis();
        }
    }

    @Override // com.ss.ttvideoengine.log.IVideoEventLogger
    public void playbackBufferStart() {
        if (this.mEvent.playbackBufferStartT <= 0) {
            this.mEvent.playbackBufferStartT = System.currentTimeMillis();
        }
    }

    @Override // com.ss.ttvideoengine.log.IVideoEventLogger
    public void prepareEnd() {
        if (this.mEvent.vt <= 0) {
            this.mEvent.prepare_end_time = System.currentTimeMillis();
        }
    }

    @Override // com.ss.ttvideoengine.log.IVideoEventLogger
    public void prepareStart() {
        if (this.mEvent.vt <= 0) {
            this.mEvent.prepare_start_time = System.currentTimeMillis();
        }
    }

    @Override // com.ss.ttvideoengine.log.IVideoEventLogger
    public void seekCompleted() {
        if (this.mSeekBeginT > 0) {
            this.mSeekBeginT = 0;
            VideoEventOnePlay videoEventOnePlay = this.mEvent;
            if (videoEventOnePlay != null) {
                videoEventOnePlay.lastSeekEndT = System.currentTimeMillis();
            }
        }
    }

    @Override // com.ss.ttvideoengine.log.IVideoEventLogger
    public void switchResolution() {
        VideoEventOnePlay videoEventOnePlay = this.mEvent;
        if (videoEventOnePlay != null) {
            videoEventOnePlay.lastResolutionStartT = System.currentTimeMillis();
        }
        _recordExitReason(-2005, true);
    }

    /* renamed from: com.ss.ttvideoengine.log.VideoEventLoggerV2$2 */
    static /* synthetic */ class C654532 {
        static final /* synthetic */ int[] $SwitchMap$com$ss$ttvideoengine$log$IVideoEventLogger$VideoEventCustomInfo;

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
                com.ss.ttvideoengine.log.IVideoEventLogger$VideoEventCustomInfo[] r0 = com.ss.ttvideoengine.log.IVideoEventLogger.VideoEventCustomInfo.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.ttvideoengine.log.VideoEventLoggerV2.C654532.$SwitchMap$com$ss$ttvideoengine$log$IVideoEventLogger$VideoEventCustomInfo = r0
                com.ss.ttvideoengine.log.IVideoEventLogger$VideoEventCustomInfo r1 = com.ss.ttvideoengine.log.IVideoEventLogger.VideoEventCustomInfo.VIDEOEVENT_CUSTOM_INFO_FFTIME_CLICK     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.ttvideoengine.log.VideoEventLoggerV2.C654532.$SwitchMap$com$ss$ttvideoengine$log$IVideoEventLogger$VideoEventCustomInfo     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.ttvideoengine.log.IVideoEventLogger$VideoEventCustomInfo r1 = com.ss.ttvideoengine.log.IVideoEventLogger.VideoEventCustomInfo.VIDEOEVENT_CUSTOM_INFO_FFTIME_VIDEOMODEL     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.ss.ttvideoengine.log.VideoEventLoggerV2.C654532.$SwitchMap$com$ss$ttvideoengine$log$IVideoEventLogger$VideoEventCustomInfo     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.ss.ttvideoengine.log.IVideoEventLogger$VideoEventCustomInfo r1 = com.ss.ttvideoengine.log.IVideoEventLogger.VideoEventCustomInfo.VIDEOEVENT_CUSTOM_INFO_FFTIME_CUSTOMPLAY     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.ss.ttvideoengine.log.VideoEventLoggerV2.C654532.$SwitchMap$com$ss$ttvideoengine$log$IVideoEventLogger$VideoEventCustomInfo     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.ss.ttvideoengine.log.IVideoEventLogger$VideoEventCustomInfo r1 = com.ss.ttvideoengine.log.IVideoEventLogger.VideoEventCustomInfo.VIDEOEVENT_CUSTOM_INFO_FFTIME_INITENGINE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = com.ss.ttvideoengine.log.VideoEventLoggerV2.C654532.$SwitchMap$com$ss$ttvideoengine$log$IVideoEventLogger$VideoEventCustomInfo     // Catch:{ NoSuchFieldError -> 0x003e }
                com.ss.ttvideoengine.log.IVideoEventLogger$VideoEventCustomInfo r1 = com.ss.ttvideoengine.log.IVideoEventLogger.VideoEventCustomInfo.VIDEOEVENT_CUSTOM_INFO_FFTIME_PLAYENGINE     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.ttvideoengine.log.VideoEventLoggerV2.C654532.<clinit>():void");
        }
    }

    private void _accumulateVPS() {
        Map bytesInfo;
        EventLoggerSource eventLoggerSource = this.mDataSource;
        if (eventLoggerSource != null && (bytesInfo = eventLoggerSource.bytesInfo()) != null) {
            int intValue = ((Long) bytesInfo.get("vps")).intValue();
            int intValue2 = ((Long) bytesInfo.get("vds")).intValue();
            this.mAccumVPS += intValue;
            this.mAccumVDS += intValue2;
        }
    }

    @Override // com.ss.ttvideoengine.log.IVideoEventLogger
    public void pause() {
        int i;
        EventLoggerSource eventLoggerSource = this.mDataSource;
        if (eventLoggerSource != null) {
            i = eventLoggerSource.getLogValueInt(67);
        } else {
            i = -1;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("p", Integer.valueOf(i));
        hashMap.put("t", Long.valueOf(System.currentTimeMillis()));
        this.mPauseList.add(new JSONObject(hashMap).toString());
    }

    @Override // com.ss.ttvideoengine.log.IVideoEventLogger
    public void play() {
        int i;
        EventLoggerSource eventLoggerSource = this.mDataSource;
        if (eventLoggerSource != null) {
            i = eventLoggerSource.getLogValueInt(67);
        } else {
            i = -1;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("p", Integer.valueOf(i));
        hashMap.put("t", Long.valueOf(System.currentTimeMillis()));
        this.mPlayList.add(new JSONObject(hashMap).toString());
        this.mBrightMonitor.start();
    }

    private Map _getFirstFrameSplitInfo() {
        HashMap hashMap = new HashMap();
        hashMap.put("format_open_input", Long.valueOf(this.mEvent.demuxer_create_t));
        hashMap.put("tran_connect", Long.valueOf(this.mEvent.tranConnectT));
        hashMap.put("http_response", Long.valueOf(this.mEvent.httpResponseT));
        hashMap.put("receive_first_video_frame", Long.valueOf(this.mEvent.receiveFirstVideoFrameT));
        hashMap.put("decode_first_video_frame", Long.valueOf(this.mEvent.decodeFirstVideoFrameT));
        hashMap.put("render_first_video_frame", Long.valueOf(this.mEvent.v_render_f_t));
        hashMap.put("prepared", Long.valueOf(this.mEvent.player_prepared_time));
        return hashMap;
    }

    private void _getMaskEvents() {
        if (this.mEvent != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("mask_open_ts", Long.valueOf(this.mEvent.mask_open_t));
            hashMap.put("mask_opened_ts", Long.valueOf(this.mEvent.mask_opened_t));
            hashMap.put("mask_errc", Integer.valueOf(this.mMaskErrc));
            hashMap.put("mask_enable", Integer.valueOf(this.mEnableMask));
            hashMap.put("mask_thread_enable", Integer.valueOf(this.mEnableMaskThread));
            hashMap.put("mask_url", this.mMaskURL);
            this.mEvent.maskEvents = hashMap;
        }
    }

    private void _getSubEvents() {
        if (this.mEvent != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("sub_langs_c", Integer.valueOf(this.mSubIdsCount));
            hashMap.put("sub_req_fin_ts", Long.valueOf(this.mEvent.sub_req_finish_t));
            hashMap.put("sub_load_fin_ts", Long.valueOf(this.mEvent.sub_load_finish_t));
            hashMap.put("sub_switch_c", Integer.valueOf(this.mSubLanSwitchCount));
            hashMap.put("sub_error", this.mSubError);
            hashMap.put("sub_req_url", this.mSubReqURL);
            hashMap.put("sub_enable", Integer.valueOf(this.mEnableSub));
            hashMap.put("sub_enable_opt_load", Integer.valueOf(this.mEnableOptSubLoad));
            hashMap.put("sub_thread_enable", Integer.valueOf(this.mEnableSubThread));
            this.mEvent.subEvents = hashMap;
        }
    }

    private void _getVidInfo() {
        Resolution[] supportResolutions;
        if (!(this.mVideoModel == null || this.mEvent.errt == Integer.MIN_VALUE || (supportResolutions = this.mVideoModel.getSupportResolutions()) == null)) {
            int videoRefInt = this.mVideoModel.getVideoRefInt(7);
            HashMap hashMap = new HashMap();
            for (Resolution resolution : supportResolutions) {
                hashMap.put(resolution.toString(videoRefInt), this.mVideoModel.allVideoURLs(resolution));
            }
            HashMap hashMap2 = new HashMap();
            hashMap2.put("url", hashMap);
            this.mEvent.vidInfo = hashMap2;
        }
    }

    private void _parseUrlLogID() {
        String str;
        String str2;
        if (!TextUtils.isEmpty(this.mInitialURL)) {
            str = this.mInitialURL;
        } else if (!TextUtils.isEmpty(this.mProxyUrl)) {
            str = this.mProxyUrl;
        } else if (!TextUtils.isEmpty(this.mAudioInitURL)) {
            str = this.mAudioInitURL;
        } else {
            return;
        }
        try {
            str = URLDecoder.decode(str, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            TTVideoEngineLog.m256503e("VideoEventLoggerV2", "exception:" + e.toString());
        } catch (IllegalArgumentException e2) {
            TTVideoEngineLog.m256503e("VideoEventLoggerV2", "exception:" + e2.toString());
        }
        int indexOf = str.indexOf("&l=");
        if (indexOf > 0) {
            int indexOf2 = str.indexOf(ContainerUtils.FIELD_DELIMITER, indexOf + 1);
            if (indexOf2 > 0) {
                str2 = str.substring(indexOf + 3, indexOf2);
            } else {
                str2 = str.substring(indexOf + 3);
            }
            this.mEvent.log_id = str2;
        }
    }

    private ArrayList<String> getViewSizeList() {
        if (this.mDataSource == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("w", Integer.valueOf(this.mDataSource.getLogValueInt(97)));
        hashMap.put(C14002h.f36692e, Integer.valueOf(this.mDataSource.getLogValueInt(98)));
        hashMap.put("t", Long.valueOf(System.currentTimeMillis()));
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add(new JSONObject(hashMap).toString());
        return arrayList;
    }

    @Override // com.ss.ttvideoengine.log.IVideoEventLogger
    public void retryFinish() {
        int i;
        if (this.mCurError != null && this.mRetryStartT > 0) {
            long currentTimeMillis = System.currentTimeMillis();
            long j = currentTimeMillis - this.mRetryStartT;
            HashMap hashMap = new HashMap();
            EventLoggerSource eventLoggerSource = this.mDataSource;
            if (eventLoggerSource != null) {
                i = eventLoggerSource.getLogValueInt(67);
            } else {
                i = -1;
            }
            hashMap.put("ec", Integer.valueOf(this.mCurError.code));
            hashMap.put("p", Integer.valueOf(i));
            hashMap.put("t", Long.valueOf(currentTimeMillis));
            hashMap.put(C60375c.f150914a, Long.valueOf(j));
            hashMap.put("st", Integer.valueOf(this.mRetryStrategy));
            this.mErrorList.add(new JSONObject(hashMap).toString());
        }
        this.mCurError = null;
        this.mRetryStartT = -2147483648L;
        this.mRetryStrategy = -1;
    }

    @Override // com.ss.ttvideoengine.log.IVideoEventLogger
    public void showedOneFrame() {
        if (this.mState != 4 || this.mLeave) {
            this.mState = 2;
            this.mLeave = false;
            if (this.mIsReplay == 1 && this.mEvent.prepare_end_time <= 0) {
                this.mEvent.prepare_end_time = System.currentTimeMillis();
            }
            if (this.mEvent.vt <= 0) {
                this.mEvent.vt = System.currentTimeMillis();
                VideoEventOneEvent videoEventOneEvent = this.mEventOneEvent;
                if (videoEventOneEvent != null) {
                    videoEventOneEvent.showedFirstFrame();
                }
                VideoEventOneOutSync videoEventOneOutSync = this.mEventOneOutSync;
                if (videoEventOneOutSync != null) {
                    videoEventOneOutSync.showedFirstFrame();
                }
                EventLoggerSource eventLoggerSource = this.mDataSource;
                if (eventLoggerSource != null) {
                    this.mEvent.mVideoCodecProfile = eventLoggerSource.getLogValueInt(63);
                    this.mEvent.mAudioCodecProfile = this.mDataSource.getLogValueInt(64);
                }
            }
            _recordExitReason(-2001, true);
        }
    }

    /* access modifiers changed from: private */
    public static class AyncGetLogDataRunnable implements Runnable {
        private Context rContext;
        private VideoEventOnePlay rEvent;
        VideoEventBase rEventBase;
        private Handler rHandler = new Handler(Looper.getMainLooper());
        VideoEventLoggerV2 rLogger;

        public void run() {
            TTVideoEngineLog.m256505i("VideoEventLoggerV2", "AyncGetLogDataRunnable enter");
            VideoEventOnePlay videoEventOnePlay = this.rEvent;
            if (videoEventOnePlay == null) {
                TTVideoEngineLog.m256503e("VideoEventLoggerV2", "rEvent is null, return.");
                return;
            }
            videoEventOnePlay.volume = (int) TTHelper.getVolume(this.rContext);
            if (TextUtils.isEmpty(this.rEvent.p2pLoadInfo)) {
                this.rEvent.p2pLoadInfo = VideoLoadWrapper.getInstance().getLoadInfo(this.rEvent.p2pUrl);
            }
            VideoEventBase videoEventBase = this.rEventBase;
            if (videoEventBase != null) {
                videoEventBase.updateMDLInfo();
                this.rEventBase.mNetworkType = VideoEventBase.getNetType();
                if (this.rEventBase.mdlVideoInfo.mdl_cache_type == 2) {
                    this.rEvent.mFeatures.put("preload", 1);
                }
            }
            JSONObject jsonObject = this.rEvent.toJsonObject(this.rEventBase);
            boolean z = this.rEventBase.isUploadLogEnabled;
            Handler handler = this.rHandler;
            if (handler == null || handler.getLooper() == null) {
                TTVideoEngineLog.m256505i("VideoEventLoggerV2", "report in child thread");
                VideoEventManager.instance.addEvent(z, jsonObject);
                return;
            }
            TTVideoEngineLog.m256505i("VideoEventLoggerV2", "report in main looper");
            this.rHandler.post(new Runnable(z, jsonObject) {
                /* class com.ss.ttvideoengine.log.$$Lambda$VideoEventLoggerV2$AyncGetLogDataRunnable$caPFmAz2VK34zFcykBsGIlvBGyY */
                public final /* synthetic */ boolean f$0;
                public final /* synthetic */ JSONObject f$1;

                {
                    this.f$0 = r1;
                    this.f$1 = r2;
                }

                public final void run() {
                    VideoEventLoggerV2.AyncGetLogDataRunnable.lambda$run$0(this.f$0, this.f$1);
                }
            });
        }

        public AyncGetLogDataRunnable(Context context, VideoEventOnePlay videoEventOnePlay, VideoEventLoggerV2 videoEventLoggerV2, VideoEventBase videoEventBase) {
            this.rEvent = videoEventOnePlay;
            this.rContext = context;
            this.rLogger = videoEventLoggerV2;
            this.rEventBase = videoEventBase;
        }
    }

    @Override // com.ss.ttvideoengine.log.IVideoEventLogger
    public void reset() {
        this.mIsLocal = false;
        this.mLeave = true;
        this.mRetryFetchErrorInfo = new ArrayList();
        this.mMDLRetryInfo = new ArrayList<>();
        this.mFirstDNSErrorInfo = new ArrayList();
        this.mErrorInfo = new ArrayList();
        this.mVUArray = new ArrayList();
        this.mMainError = new HashMap();
        this.mNoVideoRenderList = new ArrayList<>();
        this.mNoAudioRenderList = new ArrayList<>();
        this.mCustomStr = null;
        this.mInitialURL = null;
        this.mAudioInitURL = null;
        this.mInitialHost = null;
        this.mInitialIP = null;
        this.mInitialResolution = null;
        this.mInitialQuality = null;
        this.mMessage = "";
        this.mBufferDataSeconds = 0;
        this.mPlaybackParams = null;
        this.mDuration = 0;
        this.mStartTime = 0;
        this.mCurBufferCount = 0;
        this.mNetBufferIndex = 0;
        this.mCurDecoderBufferCount = 0;
        this.mBreakCount = 0;
        this.mCurDecoderBufferAccuT = 0;
        this.mSeekCount = 0;
        this.mSwitchResolutionCount = 0;
        this.mAccumVPS = 0;
        this.mAccumVDS = 0;
        this.mRadioMode = 0;
        this.mEnableNNSR = 0;
        this.mReadCacheMode = 0;
        this.mPreRangeOff = 0;
        this.mAudioStreamDisabled = false;
        this.mVideoStreamDisabled = false;
        this.mMediaCodecRender = Integer.MIN_VALUE;
        this.mWidth = 0;
        this.mHeight = 0;
        this.mProxyUrl = null;
        this.mFetchComplete = false;
        this.mEnableBash = 0;
        int i = this.mEventBase.mEnableMDL;
        this.mEventBase.unregisterNetwork();
        VideoEventBase videoEventBase = new VideoEventBase(this.mDataSource, this.mUploadLogEnabled, this.mContext);
        this.mEventBase = videoEventBase;
        videoEventBase.mEnableMDL = i;
        VideoEventSampleRecord videoEventSampleRecord = new VideoEventSampleRecord(this.mEventBase);
        this.mEventSample = videoEventSampleRecord;
        videoEventSampleRecord.mSampingRate = this.mNetworkSpeedPredictSamplingRate;
        this.mEventOneEvent.mEventBase = this.mEventBase;
        this.mEventOneOpera.mEventBase = this.mEventBase;
        this.mEventOneOutSync.mEventBase = this.mEventBase;
        this.mFeatureConfigs = new FeatureConfigs();
    }

    private void _clear() {
        this.mRetryFetchErrorInfo = new ArrayList();
        this.mMDLRetryInfo = new ArrayList<>();
        this.mFirstDNSErrorInfo = new ArrayList();
        this.mErrorInfo = new ArrayList();
        this.mMainError = new HashMap();
        this.mNoAudioRenderList = new ArrayList<>();
        this.mNoVideoRenderList = new ArrayList<>();
        this.mState = 0;
        this.mBlockBeginT = 0;
        this.mAccumVPS = 0;
        this.mAccumVDS = 0;
        this.mBitrate = 0;
        this.mLeave = true;
        this.mCurBufferCount = 0;
        this.mNetBufferIndex = 0;
        this.mCurDecoderBufferCount = 0;
        this.mBreakCount = 0;
        this.mCurDecoderBufferAccuT = 0;
        this.mLoopCount = 0;
        this.mLooping = false;
        this.mSwitchResolutionCount = 0;
        this.mSeekCount = 0;
        this.mSeekBeginT = 0;
        this.prepare_before_play_t = -2147483648L;
        this.ps_t = -2147483648L;
        this.setds_t = -2147483648L;
        this.mRadioMode = 0;
        this.mAudioStreamDisabled = false;
        this.mVideoStreamDisabled = false;
        this.mIsReplay = 0;
        this.mSurfaceCode = null;
        this.mSurfaceSetTime = 0;
        this.mPlayList = new ArrayList<>();
        this.mPauseList = new ArrayList<>();
        this.mResolutionList = new ArrayList<>();
        this.mPlaySpeedList = new ArrayList<>();
        this.mRadiomodeList = new ArrayList<>();
        this.mLoopList = new ArrayList<>();
        this.mErrorList = new ArrayList<>();
        this.mPowerList = new ArrayList<>();
        this.mChargingList = new ArrayList<>();
        this.mAVBadInterlacedList = new ArrayList<>();
        this.mCurError = null;
        this.mRetryStartT = -2147483648L;
        this.mRetryStrategy = -1;
        this.mCustomClickT = -2147483648L;
        this.mCustomGetVideoModelT = -2147483648L;
        this.mCustomInitEngineT = -2147483648L;
        this.mCustomPlayEngineT = -2147483648L;
        this.mAVOutSyncing = false;
        this.mEnableSub = 0;
        this.mEnableOptSubLoad = 0;
        this.mEnableSubThread = 0;
        this.mEnableMask = 0;
        this.mEnableMaskThread = 0;
        this.mMaskURL = null;
        this.mSubReqURL = null;
        this.mSubError = null;
        this.mSubIdsCount = 0;
        this.mSubLanSwitchCount = 0;
        this.mMaskErrc = 0;
        this.mFeatureConfigs.mHDRType = 0;
        this.mFeatureConfigs.mEnableABRStartup = 0;
        this.mFeatureConfigs.mEnableThreadPriority = 0;
        this.mSrMonitor = new SuperResolutionMonitor();
        this.mFilterMonitor = new VideoFilterMonitor();
        this.mBrightMonitor = new BrightnessMonitor(this.mContext);
        this.mFeatures.clear();
    }

    private class MyTimerTask extends TimerTask {
        public void run() {
            int i;
            int i2;
            String str;
            EventLoggerSource eventLoggerSource = VideoEventLoggerV2.this.mDataSource;
            VideoEventBase videoEventBase = VideoEventLoggerV2.this.mEventBase;
            VideoEventOnePlay videoEventOnePlay = VideoEventLoggerV2.this.mEvent;
            int i3 = -1;
            if (eventLoggerSource != null) {
                i2 = eventLoggerSource.getLogValueInt(74);
                i = eventLoggerSource.getLogValueInt(99);
            } else {
                i2 = -1;
                i = -1;
            }
            String netType = VideoEventBase.getNetType();
            String signalStrength = VideoEventBase.getSignalStrength();
            if (videoEventBase != null) {
                String str2 = videoEventBase.mCurQuality;
                int i4 = videoEventBase.mCurrentConfigBitrate;
                if (i4 < 0 && eventLoggerSource != null) {
                    i4 = (int) eventLoggerSource.getLogValueLong(75);
                }
                str = str2;
                i3 = i4;
            } else {
                str = null;
            }
            float f = -1.0f;
            if (videoEventOnePlay != null) {
                if (videoEventOnePlay.mCatowerRttList.size() >= VideoEventLoggerV2.this.mNetLevelMaxCount) {
                    videoEventOnePlay.mCatowerRttList.remove(0);
                }
                videoEventOnePlay.mCatowerRttList.add(Integer.valueOf(i2));
                if (videoEventOnePlay.mCatowerRttMsList.size() >= VideoEventLoggerV2.this.mNetLevelMaxCount) {
                    videoEventOnePlay.mCatowerRttMsList.remove(0);
                }
                videoEventOnePlay.mCatowerRttMsList.add(Integer.valueOf(i));
                synchronized ("VideoEventLoggerV2") {
                    if (VideoEventLoggerV2.this.mMDLDownloadTime > 0) {
                        f = (float) (((VideoEventLoggerV2.this.mMDLDownloadSize * 8) * 1000) / VideoEventLoggerV2.this.mMDLDownloadTime);
                    }
                    VideoEventLoggerV2.this.mMDLDownloadTime = 0;
                    VideoEventLoggerV2.this.mMDLDownloadSize = 0;
                }
                videoEventOnePlay.mMdlMultiSpeedList.add(Float.valueOf(f));
                if (i3 > 0) {
                    int size = videoEventOnePlay.mBitrateList.size();
                    if (size > 0) {
                        int intValue = videoEventOnePlay.mBitrateList.get((String) videoEventOnePlay.mBitrateList.keySet().toArray()[size - 1]).intValue();
                        if (intValue > 0 && i3 > 0 && intValue != i3) {
                            videoEventOnePlay.mBitrateList.put(Integer.toString(videoEventOnePlay.mNetQualityIndex), Integer.valueOf(i3));
                        }
                    } else {
                        videoEventOnePlay.mBitrateList.put(Integer.toString(videoEventOnePlay.mNetQualityIndex), Integer.valueOf(i3));
                    }
                }
                int size2 = videoEventOnePlay.mQualityList.size();
                if (size2 > 0) {
                    String str3 = videoEventOnePlay.mQualityList.get((String) videoEventOnePlay.mQualityList.keySet().toArray()[size2 - 1]);
                    if (!TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str) && !str3.equals(str)) {
                        videoEventOnePlay.mQualityList.put(Integer.toString(videoEventOnePlay.mNetQualityIndex), str);
                    }
                } else {
                    videoEventOnePlay.mQualityList.put(Integer.toString(videoEventOnePlay.mNetQualityIndex), str);
                }
                int size3 = videoEventOnePlay.mNetworkTypeList.size();
                if (size3 > 0) {
                    String str4 = videoEventOnePlay.mNetworkTypeList.get((String) videoEventOnePlay.mNetworkTypeList.keySet().toArray()[size3 - 1]);
                    if (!TextUtils.isEmpty(str4) && !TextUtils.isEmpty(netType) && !str4.equals(netType)) {
                        videoEventOnePlay.mNetworkTypeList.put(Integer.toString(videoEventOnePlay.mNetQualityIndex), netType);
                    }
                } else {
                    videoEventOnePlay.mNetworkTypeList.put(Integer.toString(videoEventOnePlay.mNetQualityIndex), netType);
                }
                int size4 = videoEventOnePlay.mSignalStrengthList.size();
                if (size4 > 0) {
                    String str5 = videoEventOnePlay.mSignalStrengthList.get((String) videoEventOnePlay.mSignalStrengthList.keySet().toArray()[size4 - 1]);
                    if (!TextUtils.isEmpty(str5) && !TextUtils.isEmpty(signalStrength) && !str5.equals(signalStrength)) {
                        videoEventOnePlay.mSignalStrengthList.put(Integer.toString(videoEventOnePlay.mNetQualityIndex), signalStrength);
                    }
                } else {
                    videoEventOnePlay.mSignalStrengthList.put(Integer.toString(videoEventOnePlay.mNetQualityIndex), signalStrength);
                }
                videoEventOnePlay.mNetQualityIndex++;
            }
            TTVideoEngineLog.m256500d("VideoEventLoggerV2", "netlevel rttLevel:" + i2 + ", rttMs:" + i + ", netType:" + netType + ", sigLevel:" + signalStrength + ", bitrate:" + i3 + ", quality:" + str + ", speed:" + f);
        }

        private MyTimerTask() {
        }
    }

    private void _updateFeatures() {
        int intValue;
        HashMap hashMap = new HashMap();
        hashMap.putAll(sFeatures);
        hashMap.putAll(this.mFeatures);
        if (this.mEventBase.mVideoHW != 0) {
            hashMap.put("v_hw", Integer.valueOf(this.mEventBase.mVideoHW));
        }
        if (this.mEventBase.mAudioHwUser != 0) {
            hashMap.put("a_hw", Integer.valueOf(this.mEventBase.mAudioHwUser));
        }
        int i = this.mAsyncInit;
        if (i != 0) {
            hashMap.put("async_init", Integer.valueOf(i));
        }
        int i2 = this.mUseCodecPool;
        if (i2 != 0) {
            hashMap.put("codec_pool", Integer.valueOf(i2));
        }
        if (this.mEventBase.codec_type.equals("bytevc1")) {
            hashMap.put("bytevc1", 1);
        } else if (this.mEventBase.codec_type.equals("bytevc2")) {
            hashMap.put("bytevc2", 1);
        }
        int i3 = this.mNetworkTimeout;
        if (i3 > 0) {
            hashMap.put("network_timeout", Integer.valueOf(i3));
        }
        int i4 = this.mBufferTimeout;
        if (i4 > 0) {
            hashMap.put("buffer_timeout", Integer.valueOf(i4));
        }
        if (this.mFeatureConfigs.mEnableBufferDirectly > 0) {
            hashMap.put("buffer_directly", Integer.valueOf(this.mFeatureConfigs.mEnableBufferDirectly));
        }
        if (this.mFeatureConfigs.mFirstBufEndMs > 0) {
            hashMap.put("first_buf_end_ms", Integer.valueOf(this.mFeatureConfigs.mFirstBufEndMs));
        }
        if (this.mEvent.textureRender > 0) {
            hashMap.put("oes_texture", Integer.valueOf(this.mEvent.textureRender));
        }
        int i5 = this.mEnableNNSR;
        if (i5 > 0) {
            hashMap.put("sr", Integer.valueOf(i5));
        }
        if (this.mFeatureConfigs.mEnableVolumeBalance > 0) {
            if (this.mFeatureConfigs.mAEType == 0) {
                hashMap.put("volume_balance", 1);
            } else if (this.mFeatureConfigs.mAEType == 1) {
                hashMap.put("volume_balancev2", 1);
            }
        }
        int i6 = this.mEnableBash;
        if (i6 > 0) {
            hashMap.put("bash", Integer.valueOf(i6));
        }
        if (this.mEventBase.is_enable_abr > 0) {
            hashMap.put("abr", Integer.valueOf(this.mEventBase.is_enable_abr));
        }
        if (this.mFeatureConfigs.mEnableEngineLooper > 0) {
            hashMap.put("engine_looper", Integer.valueOf(this.mFeatureConfigs.mEnableEngineLooper));
        }
        if (this.mFeatureConfigs.mEnableAutoRange > 0) {
            hashMap.put("auto_range", Integer.valueOf(this.mFeatureConfigs.mEnableAutoRange));
        }
        if (this.mFeatureConfigs.mEnableHwDropNonRef > 0) {
            hashMap.put("hw_drop", Integer.valueOf(this.mFeatureConfigs.mEnableHwDropNonRef));
        }
        if (this.mFeatureConfigs.mEnableHttps > 0) {
            hashMap.put("enable_https", Integer.valueOf(this.mFeatureConfigs.mEnableHttps));
        }
        if (this.mEvent.checkHijack > 0) {
            hashMap.put("enable_hijack", Integer.valueOf(this.mEvent.checkHijack));
        }
        if (this.mEvent.hijackRetry > 0) {
            hashMap.put("hijack_retry", Integer.valueOf(this.mEvent.hijackRetry));
        }
        if (this.mFeatureConfigs.mEnableFallbackApi > 0) {
            hashMap.put("fallback_api", Integer.valueOf(this.mFeatureConfigs.mEnableFallbackApi));
        }
        if (this.mFeatureConfigs.mEnableAsyncPosition > 0) {
            hashMap.put("async_pos", Integer.valueOf(this.mFeatureConfigs.mEnableAsyncPosition));
        }
        if (this.mEventBase.mReuseSocket > 0) {
            hashMap.put("socket_reuse", Integer.valueOf(this.mEventBase.mReuseSocket));
        }
        if (this.mEventBase.mEnableMDL > 0) {
            hashMap.put("mdl_type", Integer.valueOf(this.mEventBase.mEnableMDL));
        }
        if (this.mFeatureConfigs.mEnableLoadControl > 0) {
            hashMap.put("enable_loadcontrol", Integer.valueOf(this.mFeatureConfigs.mEnableLoadControl));
        }
        if (this.mFeatureConfigs.mRenderType != 5) {
            hashMap.put("render_type", Integer.valueOf(this.mFeatureConfigs.mRenderType));
        } else if (this.mEventBase.mVideoHW == 0) {
            hashMap.put("render_type", 5);
        } else {
            hashMap.put("render_type", 3);
        }
        hashMap.put("image_scale", Integer.valueOf(this.mFeatureConfigs.mImageScaleType));
        int i7 = this.mMediaCodecRender;
        if (i7 >= 0) {
            hashMap.put("mc_render", Integer.valueOf(i7));
        }
        if (this.mFeatureConfigs.mAudioRenderType >= 0) {
            hashMap.put("audio_render_type", Integer.valueOf(this.mFeatureConfigs.mAudioRenderType));
        }
        if (this.mFeatureConfigs.mSkipFindStreamInfo > 0) {
            hashMap.put("skip_find_stream", Integer.valueOf(this.mFeatureConfigs.mSkipFindStreamInfo));
        }
        if (this.mFeatureConfigs.mEnableAsyncPrepare > 0) {
            hashMap.put("async_prepare", Integer.valueOf(this.mFeatureConfigs.mEnableAsyncPrepare));
        }
        if (this.mFeatureConfigs.mCodecFrcLevel > 0) {
            hashMap.put("frc_level", Integer.valueOf(this.mFeatureConfigs.mCodecFrcLevel));
        }
        if (this.mFeatureConfigs.mEnableLazySeek > 0) {
            hashMap.put("lazy_seek", Integer.valueOf(this.mFeatureConfigs.mEnableLazySeek));
        }
        if (this.mFeatureConfigs.mKeepFormatThreadAlive > 0) {
            hashMap.put("keep_formater_alive", Integer.valueOf(this.mFeatureConfigs.mKeepFormatThreadAlive));
        }
        if (this.mEvent.isDisableShortSeek > 0) {
            hashMap.put("dis_short_seek", Integer.valueOf(this.mEvent.isDisableShortSeek));
        }
        if (this.mEvent.isPreferNearestSample > 0) {
            hashMap.put("pref_near_sample", Integer.valueOf(this.mEvent.isPreferNearestSample));
        }
        int i8 = this.mEnableSubThread;
        if (i8 > 0) {
            hashMap.put("sub_thread_enable", Integer.valueOf(i8));
        }
        int i9 = this.mEnableMaskThread;
        if (i9 > 0) {
            hashMap.put("mask_thread_enable", Integer.valueOf(i9));
        }
        if ((this.mFeatureConfigs.mHDRType & 1) == 1) {
            hashMap.put("hdr_pq", 1);
        }
        if ((this.mFeatureConfigs.mHDRType & 2) == 2) {
            hashMap.put("hdr_hlg", 1);
        }
        if (this.mFeatureConfigs.mEnableABRStartup > 0) {
            hashMap.put("abr_startup", 1);
        }
        if (this.mFeatureConfigs.mEnableThreadPriority > 0) {
            hashMap.put("thread_priority", 1);
        }
        if (this.mFeatureConfigs.mEnableSmoothClock > 0) {
            hashMap.put("smooth_clock", 1);
        }
        if (this.mFeatureConfigs.mDisableSplitVoice > 0) {
            hashMap.put("disable_split_voice", 1);
        }
        if (this.mEventBase.mVideoHW == 0 && this.mFeatureConfigs.mEnableNativeYV12 > 0) {
            hashMap.put("yv12", 1);
        }
        if (this.mEvent.mAudioCodecProfile == 28) {
            hashMap.put("heaacv2", 1);
        }
        if (this.mFeatureConfigs.mEnableStrategyCenter > 0) {
            hashMap.put("strategy_center", 1);
        } else {
            hashMap.put("strategy_center", 0);
        }
        if (this.mFeatureConfigs.mEnableOutletDropLimit >= 0) {
            hashMap.put("drop_limit", Integer.valueOf(this.mFeatureConfigs.mEnableOutletDropLimit));
        }
        int intValue2 = DataLoaderHelper.getDataLoader().getIntValue(8);
        if (intValue2 > 0) {
            hashMap.put("mdl_socket_reuse", Integer.valueOf(intValue2));
        }
        int intValue3 = DataLoaderHelper.getDataLoader().getIntValue(CommonCode.StatusCode.API_CLIENT_EXPIRED);
        if (intValue3 > 0) {
            hashMap.put("mdl_preconn", Integer.valueOf(intValue3));
        }
        if (DataLoaderHelper.getDataLoader().getIntValue(7) > 0 && ((intValue = DataLoaderHelper.getDataLoader().getIntValue(90)) == 2 || intValue == 3 || intValue == 4)) {
            hashMap.put("mdl_httpdns", Integer.valueOf(intValue));
        }
        int intValue4 = DataLoaderHelper.getDataLoader().getIntValue(SmEvents.EVENT_TO);
        if (intValue4 > 0) {
            hashMap.put("mdl_predns", Integer.valueOf(intValue4));
        }
        int intValue5 = DataLoaderHelper.getDataLoader().getIntValue(LocationRequest.PRIORITY_NO_POWER);
        if (intValue5 > 0) {
            hashMap.put("mdl_dns_refresh", Integer.valueOf(intValue5));
        }
        int intValue6 = DataLoaderHelper.getDataLoader().getIntValue(103);
        if (intValue6 > 0) {
            hashMap.put("mdl_dns_parallel", Integer.valueOf(intValue6));
        }
        int intValue7 = DataLoaderHelper.getDataLoader().getIntValue(115);
        if (intValue7 > 0) {
            hashMap.put("mdl_backip", Integer.valueOf(intValue7));
        }
        int intValue8 = DataLoaderHelper.getDataLoader().getIntValue(101);
        if (intValue8 > 0) {
            hashMap.put("mdl_session_reuse", Integer.valueOf(intValue8));
        }
        int intValue9 = DataLoaderHelper.getDataLoader().getIntValue(100);
        if (intValue9 == 3) {
            hashMap.put("mdl_tls_ver", Integer.valueOf(intValue9));
        }
        long longValue = DataLoaderHelper.getDataLoader().getLongValue(1152);
        long longValue2 = DataLoaderHelper.getDataLoader().getLongValue(1153);
        if (longValue > 0 && longValue2 > 0) {
            hashMap.put("mdl_socket_monitor", 1);
        }
        this.mEvent.mFeatures = hashMap;
    }

    @Override // com.ss.ttvideoengine.log.IVideoEventLogger
    public void bufferDataSeconds(int i) {
        this.mBufferDataSeconds = i;
    }

    @Override // com.ss.ttvideoengine.log.IVideoEventLogger
    public void setCustomP2PCDNType(int i) {
        this.mCustomP2PCDNType = i;
    }

    @Override // com.ss.ttvideoengine.log.IVideoEventLogger
    public void setCustomStr(String str) {
        this.mCustomStr = str;
    }

    @Override // com.ss.ttvideoengine.log.IVideoEventLogger
    public void setDisableAccurateStart(int i) {
        this.mDisableAccurateStart = i;
    }

    @Override // com.ss.ttvideoengine.log.IVideoEventLogger
    public void setEnableBash(int i) {
        this.mEnableBash = i;
    }

    @Override // com.ss.ttvideoengine.log.IVideoEventLogger
    public void setFeed(VideoModel videoModel) {
        setFeed((IVideoModel) videoModel);
    }

    @Override // com.ss.ttvideoengine.log.IVideoEventLogger
    public void setInitialQuality(String str) {
        this.mInitialQuality = str;
    }

    @Override // com.ss.ttvideoengine.log.IVideoEventLogger
    public void setLooping(boolean z) {
        this.mLooping = z;
    }

    @Override // com.ss.ttvideoengine.log.IVideoEventLogger
    public void setMaskErrorCode(int i) {
        this.mMaskErrc = i;
    }

    @Override // com.ss.ttvideoengine.log.IVideoEventLogger
    public void setMaskUrl(String str) {
        this.mMaskURL = str;
    }

    @Override // com.ss.ttvideoengine.log.IVideoEventLogger
    public void setMediaCodecRender(int i) {
        this.mMediaCodecRender = i;
    }

    @Override // com.ss.ttvideoengine.log.IVideoEventLogger
    public void setNetWorkTryCount(int i) {
        this.mNetWorkTryCount = i;
    }

    @Override // com.ss.ttvideoengine.log.IVideoEventLogger
    public void setProxyUrl(String str) {
        this.mProxyUrl = str;
    }

    @Override // com.ss.ttvideoengine.log.IVideoEventLogger
    public void setStartPlayHeight(int i) {
        this.mHeight = i;
    }

    @Override // com.ss.ttvideoengine.log.IVideoEventLogger
    public void setStartPlayWidth(int i) {
        this.mWidth = i;
    }

    @Override // com.ss.ttvideoengine.log.IVideoEventLogger
    public void setStartTime(int i) {
        this.mStartTime = i;
    }

    @Override // com.ss.ttvideoengine.log.IVideoEventLogger
    public void setSubtitleError(String str) {
        this.mSubError = str;
    }

    @Override // com.ss.ttvideoengine.log.IVideoEventLogger
    public void setSubtitleIdsCount(int i) {
        this.mSubIdsCount = i;
    }

    @Override // com.ss.ttvideoengine.log.IVideoEventLogger
    public void setSubtitleRequestUrl(String str) {
        this.mSubReqURL = str;
    }

    @Override // com.ss.ttvideoengine.log.IVideoEventLogger
    public void setVUArray(ArrayList arrayList) {
        this.mVUArray = arrayList;
    }

    @Override // com.ss.ttvideoengine.log.IVideoEventLogger
    public void updateVideoInfo(VideoModel videoModel) {
        updateVideoInfo((IVideoModel) videoModel);
    }

    @Override // com.ss.ttvideoengine.log.IVideoEventLogger
    public void useCodecPool(int i) {
        this.mUseCodecPool = i;
    }

    @Override // com.ss.ttvideoengine.log.IVideoEventLogger
    public void addWatchedDuration(int i) {
        this.mEvent.watchduration = i;
    }

    @Override // com.ss.ttvideoengine.log.IVideoEventLogger
    public IMediaMetrics buildMetrics(int i) {
        return MetricsFactory.createMetrics(i, this.mEvent);
    }

    @Override // com.ss.ttvideoengine.log.IVideoEventLogger
    public void clockDiff(long j) {
        VideoEventOnePlay videoEventOnePlay = this.mEvent;
        if (videoEventOnePlay != null) {
            videoEventOnePlay.clockDiff = j;
        }
    }

    @Override // com.ss.ttvideoengine.log.IVideoEventLogger
    public void containerFps(float f) {
        VideoEventOnePlay videoEventOnePlay = this.mEvent;
        if (videoEventOnePlay != null) {
            videoEventOnePlay.containerFps = f;
        }
    }

    @Override // com.ss.ttvideoengine.log.IVideoEventLogger
    public void curVideoDecoderFps(int i) {
        VideoEventOnePlay videoEventOnePlay = this.mEvent;
        if (videoEventOnePlay != null) {
            videoEventOnePlay.curVideoDecoderFps = i;
        }
    }

    @Override // com.ss.ttvideoengine.log.IVideoEventLogger
    public void curVideoOutputFps(float f) {
        VideoEventOnePlay videoEventOnePlay = this.mEvent;
        if (videoEventOnePlay != null) {
            videoEventOnePlay.curVideoOutputFps = f;
        }
    }

    @Override // com.ss.ttvideoengine.log.IVideoEventLogger
    public void dropCount(int i) {
        VideoEventOnePlay videoEventOnePlay = this.mEvent;
        if (videoEventOnePlay != null) {
            videoEventOnePlay.dropCount = i;
        }
    }

    @Override // com.ss.ttvideoengine.log.IVideoEventLogger
    public void enableSharp(int i) {
        VideoEventOnePlay videoEventOnePlay = this.mEvent;
        if (videoEventOnePlay != null) {
            videoEventOnePlay.enableSharp = i;
        }
    }

    @Override // com.ss.ttvideoengine.log.IVideoEventLogger
    public void engineState(int i) {
        VideoEventOnePlay videoEventOnePlay = this.mEvent;
        if (videoEventOnePlay != null) {
            videoEventOnePlay.engineState = i;
        }
    }

    @Override // com.ss.ttvideoengine.log.IVideoEventLogger
    public void fetchedAndLeaveByUser(int i) {
        this.mEvent.fetchedAndLeaveByUser = i;
    }

    @Override // com.ss.ttvideoengine.log.IVideoEventLogger
    public void firstDNSFailed(Error error) {
        this.mFirstDNSErrorInfo.add(error);
    }

    @Override // com.ss.ttvideoengine.log.IVideoEventLogger
    public void hwCodecException(int i) {
        VideoEventOnePlay videoEventOnePlay = this.mEvent;
        if (videoEventOnePlay != null) {
            videoEventOnePlay.hwCodecException = i;
        }
    }

    @Override // com.ss.ttvideoengine.log.IVideoEventLogger
    public void hwCodecName(String str) {
        VideoEventOnePlay videoEventOnePlay = this.mEvent;
        if (videoEventOnePlay != null) {
            videoEventOnePlay.hwCodecName = str;
        }
    }

    @Override // com.ss.ttvideoengine.log.IVideoEventLogger
    public void setAbrGeneralInfo(Map<String, Object> map) {
        VideoEventBase videoEventBase = this.mEventBase;
        if (videoEventBase != null) {
            videoEventBase.abrGeneralInfo = map;
        }
    }

    @Override // com.ss.ttvideoengine.log.IVideoEventLogger
    public void setAbrInfo(Map<String, Object> map) {
        VideoEventBase videoEventBase = this.mEventBase;
        if (videoEventBase != null) {
            videoEventBase.abrInfo = map;
        }
    }

    @Override // com.ss.ttvideoengine.log.IVideoEventLogger
    public void setAudioTranConnectTime(long j) {
        VideoEventOnePlay videoEventOnePlay = this.mEvent;
        if (videoEventOnePlay != null) {
            videoEventOnePlay.audioTranConnectT = j;
        }
    }

    @Override // com.ss.ttvideoengine.log.IVideoEventLogger
    public void setAudioTranFirstPacketTime(long j) {
        VideoEventOnePlay videoEventOnePlay = this.mEvent;
        if (videoEventOnePlay != null) {
            videoEventOnePlay.audioTranFirstPacketT = j;
        }
    }

    @Override // com.ss.ttvideoengine.log.IVideoEventLogger
    public void setCheckHijack(int i) {
        VideoEventOnePlay videoEventOnePlay = this.mEvent;
        if (videoEventOnePlay != null) {
            videoEventOnePlay.checkHijack = i;
        }
    }

    @Override // com.ss.ttvideoengine.log.IVideoEventLogger
    public void setCurQuality(String str) {
        VideoEventBase videoEventBase = this.mEventBase;
        if (videoEventBase != null) {
            videoEventBase.setCurQuality(str);
        }
    }

    @Override // com.ss.ttvideoengine.log.IVideoEventLogger
    public void setCurResolution(String str) {
        VideoEventBase videoEventBase = this.mEventBase;
        if (videoEventBase != null) {
            videoEventBase.setCurResolution(str);
        }
    }

    @Override // com.ss.ttvideoengine.log.IVideoEventLogger
    public void setCurrentQualityDesc(String str) {
        this.mEventBase.setCurrentQualityDesc(str);
    }

    @Override // com.ss.ttvideoengine.log.IVideoEventLogger
    public void setDashAudioCacheSize(long j) {
        VideoEventOnePlay videoEventOnePlay = this.mEvent;
        if (videoEventOnePlay != null) {
            videoEventOnePlay.d_apls = j;
        }
    }

    @Override // com.ss.ttvideoengine.log.IVideoEventLogger
    public void setDashVideoCacheSize(long j) {
        VideoEventOnePlay videoEventOnePlay = this.mEvent;
        if (videoEventOnePlay != null) {
            videoEventOnePlay.d_vpls = j;
        }
    }

    @Override // com.ss.ttvideoengine.log.IVideoEventLogger
    public void setDecodeFirstAudioFrameTime(long j) {
        VideoEventOnePlay videoEventOnePlay = this.mEvent;
        if (videoEventOnePlay != null) {
            videoEventOnePlay.decodeFirstAudioFrameT = j;
        }
    }

    @Override // com.ss.ttvideoengine.log.IVideoEventLogger
    public void setDecodeFirstVideoFrameTime(long j) {
        VideoEventOnePlay videoEventOnePlay = this.mEvent;
        if (videoEventOnePlay != null) {
            videoEventOnePlay.decodeFirstVideoFrameT = j;
        }
    }

    @Override // com.ss.ttvideoengine.log.IVideoEventLogger
    public void setDrmTokenUrl(String str) {
        this.mEventBase.mDrmTokenUrl = str;
    }

    @Override // com.ss.ttvideoengine.log.IVideoEventLogger
    public void setDrmType(int i) {
        this.mEventBase.mDrmType = i;
    }

    @Override // com.ss.ttvideoengine.log.IVideoEventLogger
    public void setDuration(int i) {
        this.mDuration = i;
        this.mEventBase.vd = i;
    }

    @Override // com.ss.ttvideoengine.log.IVideoEventLogger
    public void setEffect(Bundle bundle) {
        this.mFilterMonitor.setEffect(bundle);
    }

    @Override // com.ss.ttvideoengine.log.IVideoEventLogger
    public void setEnableMDL(int i) {
        this.mEventBase.mEnableMDL = i;
    }

    @Override // com.ss.ttvideoengine.log.IVideoEventLogger
    public void setEncryptKey(String str) {
        VideoEventOnePlay videoEventOnePlay = this.mEvent;
        if (videoEventOnePlay != null) {
            videoEventOnePlay.encryptKey = str;
        }
    }

    @Override // com.ss.ttvideoengine.log.IVideoEventLogger
    public void setFeed(IVideoModel iVideoModel) {
        if (iVideoModel != null) {
            updateVideoInfo(iVideoModel);
        }
    }

    @Override // com.ss.ttvideoengine.log.IVideoEventLogger
    public void setFramesDropNum(int i) {
        VideoEventOnePlay videoEventOnePlay = this.mEvent;
        if (videoEventOnePlay != null) {
            videoEventOnePlay.mFramesSetDropNum = i;
        }
    }

    @Override // com.ss.ttvideoengine.log.IVideoEventLogger
    public void setHijackRetry(int i) {
        VideoEventOnePlay videoEventOnePlay = this.mEvent;
        if (videoEventOnePlay != null) {
            videoEventOnePlay.hijackRetry = i;
        }
    }

    @Override // com.ss.ttvideoengine.log.IVideoEventLogger
    public void setIsEnableABR(int i) {
        this.mEventBase.is_enable_abr = i;
    }

    @Override // com.ss.ttvideoengine.log.IVideoEventLogger
    public void setIsMultiDimensionsInput(int i) {
        this.mEventBase.is_multi_dimensionsInput = i;
    }

    @Override // com.ss.ttvideoengine.log.IVideoEventLogger
    public void setIsMultiDimensionsOut(int i) {
        this.mEventBase.is_multi_dimensions = i;
    }

    @Override // com.ss.ttvideoengine.log.IVideoEventLogger
    public void setIsVideoModelCache(int i) {
        VideoEventOnePlay videoEventOnePlay = this.mEvent;
        if (videoEventOnePlay != null) {
            videoEventOnePlay.useVideoModelCache = i;
        }
    }

    @Override // com.ss.ttvideoengine.log.IVideoEventLogger
    public void setP2PCDNType(int i) {
        this.mEventBase.setP2PCDNType(i);
    }

    @Override // com.ss.ttvideoengine.log.IVideoEventLogger
    public void setP2PSDKVersion(String str) {
        if (str != null) {
            this.mP2PSDKVersion = str;
        }
    }

    @Override // com.ss.ttvideoengine.log.IVideoEventLogger
    public void setP2PUrl(String str) {
        if (str != null) {
            this.mP2PUrl = str;
        }
    }

    @Override // com.ss.ttvideoengine.log.IVideoEventLogger
    public void setPlayType(int i) {
        this.mEventBase.mPlayType = i;
    }

    @Override // com.ss.ttvideoengine.log.IVideoEventLogger
    public void setReceiveFirstAudioFrameTime(long j) {
        VideoEventOnePlay videoEventOnePlay = this.mEvent;
        if (videoEventOnePlay != null) {
            videoEventOnePlay.receiveFirstAudioFrameT = j;
        }
    }

    @Override // com.ss.ttvideoengine.log.IVideoEventLogger
    public void setReceiveFirstVideoFrameTime(long j) {
        VideoEventOnePlay videoEventOnePlay = this.mEvent;
        if (videoEventOnePlay != null) {
            videoEventOnePlay.receiveFirstVideoFrameT = j;
        }
    }

    @Override // com.ss.ttvideoengine.log.IVideoEventLogger
    public void setSpeedPredictorAlgoType(int i) {
        this.mEventBase.speed_predict_type = i;
    }

    @Override // com.ss.ttvideoengine.log.IVideoEventLogger
    public void setSrAlgorithm(int i) {
        this.mSrMonitor.setAlgorithm(i);
    }

    @Override // com.ss.ttvideoengine.log.IVideoEventLogger
    public void setTranConnectTime(long j) {
        VideoEventOnePlay videoEventOnePlay = this.mEvent;
        if (videoEventOnePlay != null) {
            videoEventOnePlay.tranConnectT = j;
        }
    }

    @Override // com.ss.ttvideoengine.log.IVideoEventLogger
    public void setTranFirstPacketTime(long j) {
        VideoEventOnePlay videoEventOnePlay = this.mEvent;
        if (videoEventOnePlay != null) {
            videoEventOnePlay.tranFirstPacketT = j;
        }
    }

    @Override // com.ss.ttvideoengine.log.IVideoEventLogger
    public void setUploadLogEnabled(boolean z) {
        this.mUploadLogEnabled = z;
        this.mEventBase.isUploadLogEnabled = z;
    }

    @Override // com.ss.ttvideoengine.log.IVideoEventLogger
    public void setVideoCacheSize(long j) {
        VideoEventOnePlay videoEventOnePlay = this.mEvent;
        if (videoEventOnePlay != null) {
            videoEventOnePlay.vpls = j;
        }
    }

    @Override // com.ss.ttvideoengine.log.IVideoEventLogger
    public void useHardwareDecode(int i) {
        this.mEventBase.useVideoHW(i);
    }

    @Override // com.ss.ttvideoengine.log.IVideoEventLogger
    public void useTextureRender(int i) {
        VideoEventOnePlay videoEventOnePlay = this.mEvent;
        if (videoEventOnePlay != null) {
            videoEventOnePlay.textureRender = i;
        }
    }

    @Override // com.ss.ttvideoengine.log.IVideoEventLogger
    public void AVOutSyncEnd(int i) {
        this.mEventOneOutSync.AVOutSyncEnd(i, "wait");
        this.mAVOutSyncing = false;
    }

    @Override // com.ss.ttvideoengine.log.IVideoEventLogger
    public void curAudioDecodeError(int i) {
        VideoEventOnePlay videoEventOnePlay = this.mEvent;
        if (videoEventOnePlay != null && i > 0) {
            videoEventOnePlay.curAudioDecodeError = i;
        }
    }

    @Override // com.ss.ttvideoengine.log.IVideoEventLogger
    public void curPlayBackTime(int i) {
        VideoEventOnePlay videoEventOnePlay = this.mEvent;
        if (videoEventOnePlay != null) {
            videoEventOnePlay.curPlayBackTime = (long) i;
        }
    }

    @Override // com.ss.ttvideoengine.log.IVideoEventLogger
    public void curVideoDecodeError(int i) {
        VideoEventOnePlay videoEventOnePlay = this.mEvent;
        if (videoEventOnePlay != null && i > 0) {
            videoEventOnePlay.curVideoDecodeError = i;
        }
    }

    @Override // com.ss.ttvideoengine.log.IVideoEventLogger
    public void curVideoRenderError(int i) {
        VideoEventOnePlay videoEventOnePlay = this.mEvent;
        if (videoEventOnePlay != null && i >= 0) {
            videoEventOnePlay.curVideoRenderError = i;
        }
    }

    @Override // com.ss.ttvideoengine.log.IVideoEventLogger
    public void enableStartPlayAutomatically(boolean z) {
        if (z) {
            this.mIsStartPlayAutomatically = 1;
        } else {
            this.mIsStartPlayAutomatically = 0;
        }
    }

    @Override // com.ss.ttvideoengine.log.IVideoEventLogger
    public void mainURLHTTPDNSFailed(Error error) {
        if (error != null) {
            this.mMainError.put("httpdns", error.toMap());
        }
    }

    @Override // com.ss.ttvideoengine.log.IVideoEventLogger
    public void mainURLLocalDNSFailed(Error error) {
        if (error != null) {
            this.mMainError.put("localdns", error.toMap());
        }
    }

    @Override // com.ss.ttvideoengine.log.IVideoEventLogger
    public void moviePreStalled(int i) {
        TTVideoEngineLog.m256505i("VideoEventLoggerV2", "movie may stall");
        this.mEventOneEvent.moviePreStalled(i);
    }

    @Override // com.ss.ttvideoengine.log.IVideoEventLogger
    public void setAudioBufferLength(long j) {
        VideoEventOnePlay videoEventOnePlay = this.mEvent;
        if (videoEventOnePlay != null) {
            videoEventOnePlay.audioBufferLength = (int) j;
        }
    }

    @Override // com.ss.ttvideoengine.log.IVideoEventLogger
    public void setInitialHost(String str) {
        this.mInitialHost = str;
        VideoEventBase videoEventBase = this.mEventBase;
        if (videoEventBase != null) {
            videoEventBase.mInitialHost = str;
        }
    }

    @Override // com.ss.ttvideoengine.log.IVideoEventLogger
    public void setInitialIP(String str) {
        this.mInitialIP = str;
        VideoEventBase videoEventBase = this.mEventBase;
        if (videoEventBase != null) {
            videoEventBase.mInitialIP = str;
        }
    }

    @Override // com.ss.ttvideoengine.log.IVideoEventLogger
    public void setPlayerHostAddr(String str) {
        if (this.mEvent != null && !TextUtils.isEmpty(str)) {
            this.mEvent.internalIP = str;
        }
    }

    @Override // com.ss.ttvideoengine.log.IVideoEventLogger
    public void setTextureRenderError(String str) {
        if (this.mEvent != null && !TextUtils.isEmpty(str)) {
            this.mEvent.textureRenderErrorMsg = str;
        }
    }

    @Override // com.ss.ttvideoengine.log.IVideoEventLogger
    public void setTraceID(String str) {
        VideoEventOnePlay videoEventOnePlay = this.mEvent;
        if (videoEventOnePlay != null) {
            videoEventOnePlay.traceID = str;
        }
        this.mEventBase.mTraceID = str;
    }

    @Override // com.ss.ttvideoengine.log.IVideoEventLogger
    public void setVideoBufferLength(long j) {
        VideoEventOnePlay videoEventOnePlay = this.mEvent;
        if (videoEventOnePlay != null) {
            videoEventOnePlay.videoBufferLength = (int) j;
        }
    }

    @Override // com.ss.ttvideoengine.log.IVideoEventLogger
    public void updateMultiNetworkSpeed(final String str) {
        EngineThreadPool.addExecuteTask(new Runnable() {
            /* class com.ss.ttvideoengine.log.VideoEventLoggerV2.RunnableC654521 */

            public void run() {
                synchronized ("VideoEventLoggerV2") {
                    try {
                        JSONArray optJSONArray = new JSONObject(str).optJSONArray(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
                        long j = 0;
                        long j2 = 0;
                        int i = 0;
                        while (i < optJSONArray.length()) {
                            JSONArray optJSONArray2 = optJSONArray.getJSONObject(i).optJSONArray("downinfo");
                            if (optJSONArray2 != null && optJSONArray2.length() > 0) {
                                int i2 = 0;
                                while (i2 < optJSONArray2.length()) {
                                    JSONObject jSONObject = optJSONArray2.getJSONObject(i2);
                                    long optLong = jSONObject.optLong("size");
                                    long optLong2 = jSONObject.optLong("costTime");
                                    if (optLong != j || optLong2 != -1) {
                                        VideoEventLoggerV2.this.mMDLDownloadSize += optLong;
                                        j2 = Math.max(j2, optLong2);
                                    }
                                    i2++;
                                    j = 0;
                                }
                            }
                            i++;
                            j = 0;
                        }
                        VideoEventLoggerV2.this.mMDLDownloadTime = j2;
                    } catch (Exception e) {
                        TTVideoEngineLog.m256503e("VideoEventLoggerV2", "update networkspeed error " + e.toString());
                    }
                }
            }
        });
    }

    @Override // com.ss.ttvideoengine.log.IVideoEventLogger
    public void updateVideoInfo(IVideoModel iVideoModel) {
        if (iVideoModel != null) {
            this.mEventBase.setVideoInfo(iVideoModel);
            this.mVideoModel = iVideoModel;
        }
    }

    @Override // com.ss.ttvideoengine.log.IVideoEventLogger
    public void validateVideoMetaInfoFail(Error error) {
        this.mEvent.hijack = 1;
        this.mErrorInfo.add(error);
    }

    /* access modifiers changed from: package-private */
    public class FeatureConfigs {
        public int mAEType = -1;
        public int mAudioRenderType = Integer.MIN_VALUE;
        public int mCodecFrcLevel;
        public int mDisableSplitVoice;
        public int mEnableABRStartup;
        public int mEnableAsyncPosition;
        public int mEnableAsyncPrepare;
        public int mEnableAutoRange;
        public int mEnableBufferDirectly;
        public int mEnableEngineLooper;
        public int mEnableFallbackApi;
        public int mEnableHttps;
        public int mEnableHwDropNonRef;
        public int mEnableLazySeek;
        public int mEnableLoadControl;
        public int mEnableNativeYV12;
        public int mEnableOutletDropLimit = -1;
        public int mEnableSmoothClock;
        public int mEnableStrategyCenter;
        public int mEnableThreadPriority;
        public int mEnableVolumeBalance;
        public int mFirstBufEndMs;
        public int mHDRType;
        public int mImageScaleType;
        public int mKeepFormatThreadAlive;
        public int mRenderType = Integer.MIN_VALUE;
        public int mSkipFindStreamInfo;

        FeatureConfigs() {
        }
    }

    @Override // com.ss.ttvideoengine.log.IVideoEventLogger
    public void AVOutSyncStart(int i) {
        long j;
        this.mAVOutSyncing = true;
        VideoEventOneEvent videoEventOneEvent = this.mEventOneEvent;
        long j2 = -1;
        if (videoEventOneEvent != null) {
            j = videoEventOneEvent.getLastRebufTime();
        } else {
            j = -1;
        }
        VideoEventOneOpera videoEventOneOpera = this.mEventOneOpera;
        if (videoEventOneOpera != null) {
            j2 = videoEventOneOpera.getLastSeekTime();
        }
        this.mEventOneOutSync.AVOutSyncStart(i, j, j2);
    }

    @Override // com.ss.ttvideoengine.log.IVideoEventLogger
    public String getStringOption(int i) {
        String str;
        if (i == 47) {
            str = this.mEventBase.mSourceTypeStr;
        } else if (i != 86) {
            return "";
        } else {
            try {
                str = this.mEventBase.mSessionID;
            } catch (Throwable th) {
                TTVideoEngineLog.m256501d(th);
                return "";
            }
        }
        return str;
    }

    @Override // com.ss.ttvideoengine.log.IVideoEventLogger
    public void logMessage(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.mMessage += str;
        }
    }

    @Override // com.ss.ttvideoengine.log.IVideoEventLogger
    public void logPluginException(String str) {
        VideoEventOnePlay videoEventOnePlay = this.mEvent;
        if (videoEventOnePlay != null) {
            videoEventOnePlay.pluginException = 1;
            if (!TextUtils.isEmpty(str)) {
                this.mEvent.ownPlayerCreateException = str;
            }
        }
    }

    @Override // com.ss.ttvideoengine.log.IVideoEventLogger
    public void renderSeekCompleted(int i) {
        _recordExitReason(-2002, false);
        this.mState = 2;
        this.mEventOneOpera.endSeek("wait", i);
    }

    @Override // com.ss.ttvideoengine.log.IVideoEventLogger
    public void setCurHost(String str) {
        if (this.mEventBase != null && str != null && !str.isEmpty()) {
            this.mEventBase.setCurHost(str);
        }
    }

    @Override // com.ss.ttvideoengine.log.IVideoEventLogger
    public void setCurIP(String str) {
        if (this.mEventBase != null && str != null && !str.isEmpty()) {
            this.mEventBase.setCurIP(str);
        }
    }

    @Override // com.ss.ttvideoengine.log.IVideoEventLogger
    public void setCurURL(String str) {
        if (this.mEventBase != null && str != null && !str.isEmpty()) {
            this.mEventBase.setCurURL(str);
        }
    }

    @Override // com.ss.ttvideoengine.log.IVideoEventLogger
    public void setDNSEndTime(long j) {
        VideoEventOnePlay videoEventOnePlay = this.mEvent;
        if (videoEventOnePlay != null) {
            videoEventOnePlay.dns_end_t = j;
            if (this.mLeave && this.mEvent.dnsModule == 0) {
                _recordExitReason(IByteRtcError.BRERR_GET_ROOM_INVALID_RESPONSE, true);
            }
        }
    }

    @Override // com.ss.ttvideoengine.log.IVideoEventLogger
    public void setFirstPlayerFirstFrameTime(long j) {
        VideoEventOnePlay videoEventOnePlay = this.mEvent;
        if (videoEventOnePlay != null && videoEventOnePlay.playerFirstFrameT <= 0) {
            this.mEvent.playerFirstFrameT = j;
        }
    }

    @Override // com.ss.ttvideoengine.log.IVideoEventLogger
    public void setHijackCode(int i) {
        VideoEventOnePlay videoEventOnePlay = this.mEvent;
        if (videoEventOnePlay != null && i != -1) {
            if (videoEventOnePlay.firstHijackCode == -1) {
                this.mEvent.firstHijackCode = i;
            } else {
                this.mEvent.lastHijackCode = i;
            }
        }
    }

    @Override // com.ss.ttvideoengine.log.IVideoEventLogger
    public void setPlayerCreatedT(long j) {
        VideoEventOnePlay videoEventOnePlay = this.mEvent;
        if (videoEventOnePlay != null && videoEventOnePlay.player_created_t <= 0) {
            this.mEvent.player_created_t = j;
        }
    }

    @Override // com.ss.ttvideoengine.log.IVideoEventLogger
    public void setSubTag(String str) {
        if (this.mEventBase != null && str != null && !str.isEmpty()) {
            this.mEventBase.mSubTag = str;
        }
    }

    @Override // com.ss.ttvideoengine.log.IVideoEventLogger
    public void setSurface(String str) {
        if (TextUtils.isEmpty(this.mSurfaceCode)) {
            this.mSurfaceCode = str;
        }
        if (this.mSurfaceSetTime <= 0) {
            this.mSurfaceSetTime = System.currentTimeMillis();
        }
    }

    @Override // com.ss.ttvideoengine.log.IVideoEventLogger
    public void setTag(String str) {
        if (this.mEventBase != null && str != null && !str.isEmpty()) {
            this.mEventBase.mTag = str;
        }
    }

    private void _setDefaultExitReason(int i) {
        if (i == 6 || i == 0) {
            this.mLeaveReason = IByteRtcError.BRERR_GET_ROOM_INVALID_RESPONSE;
        } else if (i == 1 || i == 4 || i == 2 || i == 3 || i == 7) {
            this.mLeaveReason = IByteRtcError.BRRERR_DUPLICATE_LOGIN;
        } else if (i == 5) {
            this.mLeaveReason = IByteRtcError.BRERR_NO_PUBLISH_PERMISSION;
        }
    }

    @Override // com.ss.ttvideoengine.log.IVideoEventLogger
    public void logFirstError(Error error) {
        VideoEventOnePlay videoEventOnePlay = this.mEvent;
        if (videoEventOnePlay != null && videoEventOnePlay.first_errc == Integer.MIN_VALUE && this.mEvent.first_errt == Integer.MIN_VALUE && this.mEvent.first_errc_internal == Integer.MIN_VALUE) {
            this.mEvent.first_errt = error.getType();
            this.mEvent.first_errc = error.code;
            this.mEvent.first_errc_internal = error.internalCode;
        }
    }

    @Override // com.ss.ttvideoengine.log.IVideoEventLogger
    public void onAVBadInterlaced(long j) {
        VideoEventOneEvent videoEventOneEvent = this.mEventOneEvent;
        if (videoEventOneEvent != null) {
            videoEventOneEvent.onAVBadInterlaced();
        }
        VideoEventOneOutSync videoEventOneOutSync = this.mEventOneOutSync;
        if (videoEventOneOutSync != null) {
            videoEventOneOutSync.onAVBadInterlaced();
        }
        HashMap hashMap = new HashMap();
        hashMap.put("pts", "-1");
        hashMap.put(ShareHitPoint.f121869d, "non");
        hashMap.put("diff", Long.toString(j));
        this.mAVBadInterlacedList.add(new JSONObject(hashMap).toString());
    }

    @Override // com.ss.ttvideoengine.log.IVideoEventLogger
    public void setDnsMode(int i) {
        if (i == 1 || ((i != 0 && this.mEventBase.mSourceTypeStr.equals("dir_url")) || this.mEventBase.mEnableMDL == 1 || this.mEventBase.mEnableMDL == 2)) {
            this.mEvent.dnsModule = 1;
        } else {
            this.mEvent.dnsModule = 0;
        }
    }

    @Override // com.ss.ttvideoengine.log.IVideoEventLogger
    public void setLoggerTimes(int i) {
        long currentTimeMillis = System.currentTimeMillis();
        switch (i) {
            case 63:
                if (this.setds_t <= 0) {
                    this.setds_t = currentTimeMillis;
                    return;
                }
                return;
            case 64:
                if (this.mEvent.pt_new <= 0) {
                    this.mEvent.pt_new = currentTimeMillis;
                    return;
                }
                return;
            case 65:
                if (this.prepare_before_play_t <= 0) {
                    this.prepare_before_play_t = currentTimeMillis;
                    return;
                }
                return;
            default:
                return;
        }
    }

    private void _upload(int i) {
        this.mEvent.leave_method = i;
        TimerTask timerTask = this.mTimerTask;
        if (timerTask != null) {
            timerTask.cancel();
            this.mTimerTask = null;
        }
        Timer timer = this.mTimer;
        if (timer != null) {
            timer.cancel();
            this.mTimer = null;
        }
        if (this.mEnableSpeedReport) {
            this.mEventSample.stopRecord();
        }
        TTNetWorkListener.MyNetworkQualityHelper.getInstance().calculateNetworkScore();
        _sendEvent();
        this.mEvent = new VideoEventOnePlay();
        this.mEventSample.mEventBase = this.mEventBase;
        this.mEventOneEvent.reset();
        this.mEventOneOpera.reset();
        this.mEventOneOutSync.reset();
    }

    @Override // com.ss.ttvideoengine.log.IVideoEventLogger
    public void AVNoRenderEnd(int i) {
        TTVideoEngineLog.m256500d("VideoEventLoggerV2", "AVNoRenderEnd, type: " + i);
        NoAVRenderEvent noAVRenderEvent = this.mNoAVRenderEvent;
        if (noAVRenderEvent == null) {
            TTVideoEngineLog.m256505i("VideoEventLoggerV2", "AVNoRenderEnd, not started before, abort");
        } else if (i != 1 || !noAVRenderEvent.isVideo()) {
            this.mNoAVRenderEvent.stop();
            NoAVRenderEvent.addToCorrespondList(this.mNoAVRenderEvent, this.mNoAudioRenderList, this.mNoVideoRenderList);
            HashMap hashMap = new HashMap();
            hashMap.put(ShareHitPoint.f121869d, Integer.valueOf(i));
            hashMap.put("t", Long.valueOf(System.currentTimeMillis()));
            EventLoggerSource eventLoggerSource = this.mDataSource;
            if (eventLoggerSource != null) {
                eventLoggerSource.onInfo(6, hashMap);
            }
        } else {
            TTVideoEngineLog.m256505i("VideoEventLoggerV2", "AVNoRenderEnd, type does not match, abort");
        }
    }

    @Override // com.ss.ttvideoengine.log.IVideoEventLogger
    public void movieFinish(int i) {
        long currentTimeMillis = System.currentTimeMillis();
        if (i != 5) {
            boolean z = true;
            if (this.mState == 4) {
                this.mEventOneOpera.endSeek("wait", 0);
                z = false;
            }
            if (this.mState == 3) {
                this.mEventOneEvent.movieStallEnd("wait");
                this.mEvent.lastBufferEndT = currentTimeMillis;
                z = false;
            }
            if (z) {
                this.mEventBase.movieFinish();
            }
        }
        if (this.mAVOutSyncing) {
            long j = -1;
            EventLoggerSource eventLoggerSource = this.mDataSource;
            if (eventLoggerSource != null) {
                j = (long) eventLoggerSource.getLogValueInt(67);
            }
            this.mEventOneOutSync.AVOutSyncEnd((int) j, "finish");
            this.mAVOutSyncing = false;
        }
        if (!this.mLeave || this.mEvent.vt > 0) {
            this.mEvent.et = currentTimeMillis;
        } else {
            this.mEvent.lt = currentTimeMillis;
        }
        _upload(i);
    }

    @Override // com.ss.ttvideoengine.log.IVideoEventLogger
    public void movieStallEnd(int i) {
        if (i == 0 && this.mState == 3) {
            this.mState = 2;
            this.mEventOneEvent.movieStallEnd("wait");
        }
        if (this.mEvent != null) {
            if (i == 0) {
                if (this.mState != 4) {
                    _recordExitReason(-2003, false);
                }
            } else if (i == 1) {
                _recordExitReason(-2004, false);
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (this.mEvent.firstBufferEndT <= 0) {
                this.mEvent.firstBufferEndT = currentTimeMillis;
            }
            if (i == 1) {
                long j = this.mDecodeBufferingStartT;
                if (j > 0 && currentTimeMillis >= j) {
                    this.mCurDecoderBufferAccuT += currentTimeMillis - j;
                    this.mDecodeBufferingStartT = 0;
                }
            }
            this.mEvent.lastBufferEndT = currentTimeMillis;
        }
    }

    @Override // com.ss.ttvideoengine.log.IVideoEventLogger
    public void setInitialResolution(String str) {
        this.mInitialResolution = str;
        HashMap hashMap = new HashMap();
        hashMap.put("to", str);
        hashMap.put("p", -1);
        hashMap.put("t", Long.valueOf(System.currentTimeMillis()));
        hashMap.put(C60375c.f150914a, 0);
        hashMap.put("seam", false);
        this.mResolutionList.add(new JSONObject(hashMap).toString());
    }

    @Override // com.ss.ttvideoengine.log.IVideoEventLogger
    public void AVNoRenderStart(int i) {
        TTVideoEngineLog.m256500d("VideoEventLoggerV2", "AVNoRenderStart, type: " + i);
        int i2 = 1;
        if (i != 1) {
            i2 = 0;
        }
        NoAVRenderEvent noAVRenderEvent = new NoAVRenderEvent(i2);
        this.mNoAVRenderEvent = noAVRenderEvent;
        noAVRenderEvent.start();
        long j = -1;
        if (this.mEvent.vt > 0) {
            j = this.mEvent.vt - this.mEvent.pt_new;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(ShareHitPoint.f121869d, Integer.valueOf(i));
        hashMap.put("t", Long.valueOf(System.currentTimeMillis()));
        hashMap.put("codec", this.mEventBase.getCodecType());
        hashMap.put(CommonCode.MapKey.HAS_RESOLUTION, this.mEventBase.getCurResolution());
        hashMap.put("quality_desc", this.mEventBase.mCurrentQualityDesc);
        hashMap.put("hw", Integer.valueOf(this.mEventBase.mVideoHW));
        hashMap.put("ps_t", Long.valueOf(this.ps_t));
        hashMap.put("first_frame_cost", Long.valueOf(j));
        if (this.mEvent.lastSeekStartT != -2147483648L) {
            hashMap.put("seek_t", Long.valueOf(this.mEvent.lastSeekStartT));
        }
        EventLoggerSource eventLoggerSource = this.mDataSource;
        if (eventLoggerSource != null) {
            hashMap.put("enable_nnsr", Integer.valueOf(eventLoggerSource.getLogValueInt(101)));
            hashMap.put("surface_error_code", Integer.valueOf(this.mDataSource.getLogValueInt(100)));
            hashMap.put("switch_resolution_t", Long.valueOf(this.mDataSource.getLogValueLong(92)));
            this.mDataSource.onInfo(5, hashMap);
        }
    }

    @Override // com.ss.ttvideoengine.log.IVideoEventLogger
    public void setPlaybackParams(PlaybackParams playbackParams) {
        if (this.mEvent != null) {
            float speed = playbackParams.getSpeed();
            HashMap hashMap = new HashMap();
            this.mPlaybackParams = hashMap;
            hashMap.put("AFMode", Integer.valueOf(playbackParams.getAudioFallbackMode()));
            this.mPlaybackParams.put("pitch", Float.valueOf(playbackParams.getPitch()));
            this.mPlaybackParams.put("speed", Float.valueOf(speed));
            if (this.mEventBase.mPlaySpeed != speed || this.mPlaySpeedList.isEmpty()) {
                this.mEventBase.mPlaySpeed = speed;
                HashMap hashMap2 = new HashMap();
                int i = -1;
                EventLoggerSource eventLoggerSource = this.mDataSource;
                if (eventLoggerSource != null) {
                    i = eventLoggerSource.getLogValueInt(67);
                }
                hashMap2.put("to", Float.valueOf(this.mEventBase.mPlaySpeed));
                hashMap2.put("p", Integer.valueOf(i));
                hashMap2.put("t", Long.valueOf(System.currentTimeMillis()));
                this.mPlaySpeedList.add(new JSONObject(hashMap2).toString());
            }
        }
    }

    @Override // com.ss.ttvideoengine.log.IVideoEventLogger
    public void stop(int i) {
        if (this.mState != 0) {
            boolean z = true;
            long currentTimeMillis = System.currentTimeMillis();
            if (this.mState == 4) {
                this.mEventOneOpera.endSeek("exit", 0);
                z = false;
            }
            if (this.mState == 3) {
                this.mEventOneEvent.movieStallEnd("exit");
                this.mEvent.lastBufferEndT = currentTimeMillis;
                z = false;
            }
            this.mState = 0;
            if (!this.mLeave || this.mEvent.pt_new <= 0 || this.mEvent.vt > 0) {
                this.mEvent.et = currentTimeMillis;
            } else if (this.mEvent.lt <= 0) {
                this.mEvent.lt = currentTimeMillis;
            }
            if (z) {
                this.mEventBase.movieFinish();
            }
            if (this.mAVOutSyncing) {
                long j = -1;
                EventLoggerSource eventLoggerSource = this.mDataSource;
                if (eventLoggerSource != null) {
                    j = (long) eventLoggerSource.getLogValueInt(67);
                }
                this.mEventOneOutSync.AVOutSyncEnd((int) j, "exit");
                this.mAVOutSyncing = false;
            }
            if (this.mEvent.playerFirstFrameT <= 0) {
                this.mDataSource.onInfo(2, _getFirstFrameSplitInfo());
            }
            this.mBrightMonitor.stop();
            _upload(i);
        }
    }

    @Override // com.ss.ttvideoengine.log.IVideoEventLogger
    public void switchResolutionEnd(boolean z) {
        if (z) {
            if (this.mState == 4) {
                this.mEventOneOpera.endSeek("wait", 0);
            }
            if (this.mState == 3) {
                this.mState = 2;
            }
        }
        VideoEventOnePlay videoEventOnePlay = this.mEvent;
        if (videoEventOnePlay != null) {
            videoEventOnePlay.lastResolutionEndT = System.currentTimeMillis();
            if (this.mEvent.lastResolutionStartT > 0) {
                long j = this.mEvent.lastResolutionEndT - this.mEvent.lastResolutionStartT;
                int i = -1;
                EventLoggerSource eventLoggerSource = this.mDataSource;
                if (eventLoggerSource != null) {
                    i = eventLoggerSource.getLogValueInt(67);
                }
                HashMap hashMap = new HashMap();
                hashMap.put("to", this.mEventBase.mCurrentResolution);
                hashMap.put("p", Integer.valueOf(i));
                hashMap.put("t", Long.valueOf(System.currentTimeMillis()));
                hashMap.put(C60375c.f150914a, Long.valueOf(j));
                hashMap.put("seam", Boolean.valueOf(z));
                this.mResolutionList.add(new JSONObject(hashMap).toString());
            }
        }
        if (z) {
            _recordExitReason(-2005, false);
        }
    }

    @Override // com.ss.ttvideoengine.log.IVideoEventLogger
    public void fetchInfoComplete(VideoModel videoModel, Error error) {
        fetchInfoComplete((IVideoModel) videoModel, error);
    }

    @Override // com.ss.ttvideoengine.log.IVideoEventLogger
    public void configResolution(String str, String str2) {
        this.mEventBase.configResolution(str, str2);
    }

    @Override // com.ss.ttvideoengine.log.IVideoEventLogger
    public void setAudioDNSParseTime(long j, int i) {
        VideoEventOnePlay videoEventOnePlay = this.mEvent;
        if (videoEventOnePlay != null) {
            videoEventOnePlay.audioDnsT = j;
        }
    }

    @Override // com.ss.ttvideoengine.log.IVideoEventLogger
    public void setPlayAPIVersion(int i, String str) {
        this.mApiVer = i;
        this.mAuth = str;
    }

    @Override // com.ss.ttvideoengine.log.IVideoEventLogger
    public void useAsyncInit(int i, int i2) {
        this.mAsyncInit = i;
        this.mAsyncCodecId = i2;
    }

    @Override // com.ss.ttvideoengine.log.IVideoEventLogger
    public void setFloatOption(int i, float f) {
        if (i == 20) {
            this.mNetworkSpeedPredictSamplingRate = f;
            this.mEventSample.setSamplingRate(f);
        }
    }

    @Override // com.ss.ttvideoengine.log.IVideoEventLogger
    public void setInitialURL(String str, String str2) {
        this.mInitialURL = str;
        VideoEventBase videoEventBase = this.mEventBase;
        if (videoEventBase != null) {
            videoEventBase.mInitialURL = str;
        }
        this.mAudioInitURL = str2;
    }

    @Override // com.ss.ttvideoengine.log.IVideoEventLogger
    public void codecName(int i, int i2) {
        if (this.mEvent != null) {
            if (i == 0) {
                this.mEventBase.videoCodecNameId = i2;
            } else if (i == 1) {
                this.mEventBase.audioCodecNameId = i2;
            }
        }
    }

    @Override // com.ss.ttvideoengine.log.IVideoEventLogger
    public void deviceStartTime(int i, long j) {
        VideoEventOnePlay videoEventOnePlay = this.mEvent;
        if (videoEventOnePlay != null) {
            if (i == 0) {
                videoEventOnePlay.videoDeviceStartTime = j;
            } else if (i == 1) {
                videoEventOnePlay.audioDeviceStartTime = j;
            }
        }
    }

    @Override // com.ss.ttvideoengine.log.IVideoEventLogger
    public void devicedOpenedTime(int i, long j) {
        VideoEventOnePlay videoEventOnePlay = this.mEvent;
        if (videoEventOnePlay != null) {
            if (i == 0) {
                videoEventOnePlay.videoDeviceOpenedTime = j;
            } else if (i == 1) {
                videoEventOnePlay.audioDeviceOpenedTime = j;
            }
        }
    }

    @Override // com.ss.ttvideoengine.log.IVideoEventLogger
    public void mainURLCDNFailed(Error error, String str) {
        if (error != null) {
            HashMap map = error.toMap();
            if (str == null) {
                str = "";
            }
            map.put("url", str);
            this.mMainError.put("cdn", map);
        }
    }

    @Override // com.ss.ttvideoengine.log.IVideoEventLogger
    public void needRetryToFetch(Error error, int i) {
        HashMap map = error.toMap();
        map.put("apiver", Integer.valueOf(i));
        this.mRetryFetchErrorInfo.add(map);
    }

    @Override // com.ss.ttvideoengine.log.IVideoEventLogger
    public void playerDidFailed(Error error, String str) {
        if (error != null) {
            HashMap map = error.toMap();
            if (str == null) {
                str = "";
            }
            map.put("url", str);
            this.mMainError.put("player", map);
        }
    }

    @Override // com.ss.ttvideoengine.log.IVideoEventLogger
    public void recordBlockReason(int i, boolean z) {
        if (this.mEvent != null) {
            if (z) {
                this.mLeaveReason = i;
                this.mBlockBeginT = SystemClock.elapsedRealtime();
                return;
            }
            this.mLeaveReason = Integer.MIN_VALUE;
            this.mBlockBeginT = 0;
        }
    }

    @Override // com.ss.ttvideoengine.log.IVideoEventLogger
    public void setDNSParseTime(long j, int i) {
        VideoEventOnePlay videoEventOnePlay = this.mEvent;
        if (videoEventOnePlay != null && videoEventOnePlay.dnsT <= 0) {
            this.mEvent.dnsT = j;
            this.mEvent.dnsModule = i;
        }
    }

    @Override // com.ss.ttvideoengine.log.IVideoEventLogger
    public void setDNSStartTime(long j, int i) {
        VideoEventOnePlay videoEventOnePlay = this.mEvent;
        if (videoEventOnePlay != null) {
            videoEventOnePlay.dns_start_t = j;
            this.mEvent.dnsModule = i;
            if (this.mLeave && i == 0) {
                _recordExitReason(IByteRtcError.BRRERR_DUPLICATE_LOGIN, true);
            }
        }
    }

    @Override // com.ss.ttvideoengine.log.IVideoEventLogger
    public void setNetworkSpeedFrom(double d, int i) {
        VideoEventOnePlay videoEventOnePlay = this.mEvent;
        if (videoEventOnePlay != null) {
            if (i == 0) {
                videoEventOnePlay.firstFrameSpeed = d;
            } else if (i == 1) {
                videoEventOnePlay.playEndSpeed = d;
            }
        }
    }

    @Override // com.ss.ttvideoengine.log.IVideoEventLogger
    public void setSourceType(int i, String str) {
        if (i == 0) {
            this.mIsLocal = true;
        }
        this.mEventBase.setSourceType(i, str);
        this.mPlayCount = 0;
        _setDefaultExitReason(i);
    }

    @Override // com.ss.ttvideoengine.log.IVideoEventLogger
    public void setStringOption(int i, String str) {
        if (i == 15) {
            this.mEvent.log_id = str;
        } else if (i == 53) {
            this.mEventBase.mOriginVid = str;
        } else if (i == 86) {
            this.mEventBase.mDNSType = str;
        }
    }

    public static void addFeatureGlobal(String str, Object obj) {
        if (!TextUtils.isEmpty(str) && obj != null) {
            sFeatures.put(str, obj);
            TTVideoEngineLog.m256500d("VideoEventLoggerV2", "addFeatureGlobal, key:" + str + ", value:" + obj);
        }
    }

    @Override // com.ss.ttvideoengine.log.IVideoEventLogger
    public void addFeature(String str, Object obj) {
        if (!TextUtils.isEmpty(str) && obj != null) {
            this.mFeatures.put(str, obj);
            TTVideoEngineLog.m256500d("VideoEventLoggerV2", "addFeature, key:" + str + ", value:" + obj);
        }
    }

    @Override // com.ss.ttvideoengine.log.IVideoEventLogger
    public void fetchInfoComplete(IVideoModel iVideoModel, Error error) {
        if (error != null) {
            this.mMainError.put("api", error.toMap());
        } else if (iVideoModel != null) {
            updateVideoInfo(iVideoModel);
            if (this.mEvent.vt <= 0) {
                this.mEvent.at = System.currentTimeMillis();
            }
            this.mFetchComplete = true;
            if (this.mEvent.dnsModule == 1) {
                _recordExitReason(IByteRtcError.BRERR_GET_ROOM_INVALID_RESPONSE, true);
            } else if (this.mEvent.dnsModule == 0) {
                _recordExitReason(IByteRtcError.BRRERR_DUPLICATE_LOGIN, true);
            }
        }
    }

    @Override // com.ss.ttvideoengine.log.IVideoEventLogger
    public void movieFinish(int i, String str) {
        boolean z;
        boolean z2 = false;
        if (this.mState == 4) {
            this.mEventOneOpera.endSeek("error", 0);
            z = false;
        } else {
            z = true;
        }
        if (this.mState == 3) {
            this.mEventOneEvent.movieStallEnd("error");
            this.mEvent.lastBufferEndT = System.currentTimeMillis();
        } else {
            z2 = z;
        }
        this.mState = 5;
        if (z2) {
            this.mEventBase.movieFinish();
        }
        this.mEvent.vsc = i;
        this.mEvent.vscMessage = str;
        movieFinish(5);
    }

    public void _recordExitReason(int i, boolean z) {
        if (this.mEvent != null) {
            if (z) {
                this.mLeaveReason = i;
                if (i == -1002 || i == -1003 || i == -1004 || i == -1005) {
                    if (this.mBlockBeginT == 0) {
                        this.mBlockBeginT = SystemClock.elapsedRealtime();
                    }
                } else if (i == -2003 || i == -2002) {
                    this.mBlockBeginT = SystemClock.elapsedRealtime();
                } else {
                    this.mBlockBeginT = 0;
                }
            } else {
                this.mLeaveReason = -2001;
                this.mBlockBeginT = 0;
            }
        }
    }

    @Override // com.ss.ttvideoengine.log.IVideoEventLogger
    public void movieStalled(int i, int i2) {
        TTVideoEngineLog.m256505i("VideoEventLoggerV2", "movieStalled, type: " + i);
        if (i == 0) {
            int i3 = this.mState;
            if (!(i3 == 3 || i3 == 4)) {
                this.mState = 3;
                int i4 = this.mNetBufferIndex + 1;
                this.mNetBufferIndex = i4;
                this.mEventOneEvent.movieStalled(i2, i4);
            }
            this.mCurBufferCount++;
            if (this.mState != 4) {
                _recordExitReason(-2003, true);
            }
        } else if (i == 1) {
            this.mCurDecoderBufferCount++;
            _recordExitReason(-2004, true);
        }
        if (this.mEvent != null) {
            long currentTimeMillis = System.currentTimeMillis();
            if (this.mEvent.firstBufferStartT <= 0) {
                this.mEvent.firstBufferStartT = currentTimeMillis;
            }
            if (i == 1) {
                this.mDecodeBufferingStartT = currentTimeMillis;
            }
            this.mEvent.lastBufferStartT = currentTimeMillis;
        }
    }

    @Override // com.ss.ttvideoengine.log.IVideoEventLogger
    public void setCustomInfo(IVideoEventLogger.VideoEventCustomInfo videoEventCustomInfo, Object obj) {
        TTVideoEngineLog.m256500d("VideoEventLoggerV2", "brian setCustomInfo key:" + videoEventCustomInfo + ", value:" + obj);
        if (this.mEvent != null) {
            try {
                int i = C654532.$SwitchMap$com$ss$ttvideoengine$log$IVideoEventLogger$VideoEventCustomInfo[videoEventCustomInfo.ordinal()];
                if (i == 1) {
                    this.mCustomClickT = ((Long) obj).longValue();
                } else if (i == 2) {
                    this.mCustomGetVideoModelT = ((Long) obj).longValue();
                } else if (i == 3) {
                } else {
                    if (i == 4) {
                        this.mCustomInitEngineT = ((Long) obj).longValue();
                    } else if (i != 5) {
                        TTVideoEngineLog.m256503e("VideoEventLoggerV2", "setCustomInfo invalid key:" + videoEventCustomInfo + ", value:" + obj);
                    } else {
                        this.mCustomPlayEngineT = ((Long) obj).longValue();
                    }
                }
            } catch (Exception e) {
                TTVideoEngineLog.m256503e("VideoEventLoggerV2", "setCustomInfo fail:" + e.toString());
            }
        }
    }

    @Override // com.ss.ttvideoengine.log.IVideoEventLogger
    public void setLongOption(int i, long j) {
        if (i == 21) {
            this.mBitrate = j;
        } else if (i == 87) {
            this.mEvent.httpResponseT = j;
        } else if (i == 88) {
            this.mEvent.player_prepared_time = j;
        } else if (i == 98) {
            this.mEvent.mVideoStreamDuration = j;
        } else if (i != 99) {
            switch (i) {
                case 66:
                    this.mEvent.a_dns_start_t = j;
                    return;
                case 67:
                    this.mEvent.formater_create_t = j;
                    return;
                case 68:
                    this.mEvent.avformat_open_t = j;
                    return;
                case 69:
                    this.mEvent.demuxer_create_t = j;
                    return;
                case 70:
                    this.mEvent.dec_create_t = j;
                    return;
                case 71:
                    this.mEvent.outlet_create_t = j;
                    return;
                case 72:
                    this.mEvent.v_dec_start_t = j;
                    return;
                case 73:
                    this.mEvent.a_dec_start_t = j;
                    return;
                case 74:
                    this.mEvent.v_dec_opened_t = j;
                    return;
                case 75:
                    this.mEvent.a_dec_opened_t = j;
                    return;
                case 76:
                    this.mEvent.v_render_f_t = j;
                    return;
                case 77:
                    this.mEvent.a_render_f_t = j;
                    return;
                case 78:
                    this.mEvent.demuxer_begin_t = j;
                    return;
                default:
                    switch (i) {
                        case 82:
                            this.mEvent.sub_load_finish_t = j;
                            return;
                        case 83:
                            this.mEvent.sub_req_finish_t = j;
                            return;
                        case 84:
                            this.mEvent.mask_open_t = j;
                            return;
                        case 85:
                            this.mEvent.mask_opened_t = j;
                            return;
                        default:
                            return;
                    }
            }
        } else {
            this.mEvent.mAudioStreamDuration = j;
        }
    }

    @Override // com.ss.ttvideoengine.log.IVideoEventLogger
    public void movieFinish(Error error, int i) {
        boolean z;
        long currentTimeMillis = System.currentTimeMillis();
        if (this.mState == 4) {
            this.mEventOneOpera.endSeek("error", 0);
            z = false;
        } else {
            z = true;
        }
        if (this.mState == 3) {
            this.mEventOneEvent.movieStallEnd("error");
            this.mEvent.lastBufferEndT = currentTimeMillis;
            z = false;
        }
        this.mState = 5;
        HashMap map = error.toMap();
        map.put("strategy", 0);
        map.put("apiver", Integer.valueOf(i));
        this.mErrorInfo.add(map);
        if (!this.mLeave || this.mEvent.vt > 0) {
            if (error.isPlayerErrorDomain() && this.mVUArray.size() <= 1) {
                this.mBreakCount++;
            }
            this.mEvent.et = currentTimeMillis;
        } else {
            this.mEvent.lt = currentTimeMillis;
        }
        logFirstError(error);
        long j = -1;
        EventLoggerSource eventLoggerSource = this.mDataSource;
        if (eventLoggerSource != null) {
            j = (long) eventLoggerSource.getLogValueInt(67);
            if (this.mEvent.playerFirstFrameT <= 0) {
                this.mDataSource.onInfo(2, _getFirstFrameSplitInfo());
            }
        }
        if (this.mCurError != null) {
            long j2 = this.mRetryStartT;
            if (j2 > 0) {
                HashMap hashMap = new HashMap();
                hashMap.put("ec", Integer.valueOf(this.mCurError.code));
                hashMap.put("p", Long.valueOf(j));
                hashMap.put("t", Long.valueOf(currentTimeMillis));
                hashMap.put(C60375c.f150914a, Long.valueOf(currentTimeMillis - j2));
                hashMap.put("st", Integer.valueOf(this.mRetryStrategy));
                this.mErrorList.add(new JSONObject(hashMap).toString());
                this.mCurError = null;
                this.mRetryStrategy = -1;
                this.mRetryStartT = -2147483648L;
            }
        }
        if (z) {
            this.mEventBase.movieFinish();
        }
        if (this.mAVOutSyncing) {
            this.mEventOneOutSync.AVOutSyncEnd((int) j, "error");
            this.mAVOutSyncing = false;
        }
        this.mEvent.errt = error.getType();
        this.mEvent.errc = error.code;
        _upload(4);
    }

    @Override // com.ss.ttvideoengine.log.IVideoEventLogger
    public void setIntOption(int i, int i2) {
        if (i == 54) {
            this.mFeatureConfigs.mAEType = i2;
        } else if (i == 55) {
            this.mFeatureConfigs.mEnableNativeYV12 = i2;
        } else if (i == 59) {
            this.mFirstRangeSize = i2;
        } else if (i == 60) {
            this.mNetSpeedLevel = i2;
        } else if (i != 62) {
            boolean z = false;
            switch (i) {
                case 11:
                    this.mRadioMode = i2;
                    return;
                case HwBuildEx.VersionCodes.EMUI_5_1:
                    if (i2 == 1) {
                        z = true;
                    }
                    this.mVideoStreamDisabled = z;
                    return;
                case 13:
                    if (i2 == 1) {
                        z = true;
                    }
                    this.mAudioStreamDisabled = z;
                    return;
                case 14:
                    this.mIsReplay = i2;
                    return;
                default:
                    switch (i) {
                        case 16:
                            this.mEventBase.mAudioHwUser = i2;
                            return;
                        case 17:
                            this.mEventSample.setInterval(i2);
                            return;
                        case 18:
                            if (i2 != 0) {
                                this.mEnableSpeedReport = true;
                                this.mEventSample.startRecord();
                                return;
                            }
                            this.mEnableSpeedReport = false;
                            this.mEventSample.stopRecord();
                            return;
                        case 19:
                            this.mEventSample.setMaxWindowSize(i2);
                            return;
                        default:
                            switch (i) {
                                case 22:
                                    this.mNetLevelIntervalMs = i2;
                                    return;
                                case 23:
                                    this.mNetLevelMaxCount = i2;
                                    return;
                                case 24:
                                    this.mBufferTimeout = i2;
                                    return;
                                case AvailableCode.ERROR_ON_ACTIVITY_RESULT:
                                    this.mNetworkTimeout = i2;
                                    return;
                                case 26:
                                    this.mFeatureConfigs.mEnableBufferDirectly = i2;
                                    return;
                                case AvailableCode.USER_IGNORE_PREVIOUS_POPUP:
                                    this.mFeatureConfigs.mFirstBufEndMs = i2;
                                    return;
                                default:
                                    switch (i) {
                                        case 29:
                                            this.mFeatureConfigs.mEnableVolumeBalance = i2;
                                            return;
                                        case 30:
                                            this.mFeatureConfigs.mEnableEngineLooper = i2;
                                            return;
                                        case TTVideoEngine.PLAYER_OPTION_ENABLE_PLAYER3_HARDWARE_DECODE /*{ENCODED_INT: 31}*/:
                                            this.mFeatureConfigs.mEnableAutoRange = i2;
                                            return;
                                        case 32:
                                            this.mFeatureConfigs.mEnableHwDropNonRef = i2;
                                            return;
                                        case 33:
                                            this.mFeatureConfigs.mEnableHttps = i2;
                                            return;
                                        case 34:
                                            this.mFeatureConfigs.mEnableFallbackApi = i2;
                                            return;
                                        case 35:
                                            this.mFeatureConfigs.mEnableAsyncPosition = i2;
                                            return;
                                        case 36:
                                            this.mFeatureConfigs.mEnableLoadControl = i2;
                                            return;
                                        case 37:
                                            this.mFeatureConfigs.mRenderType = i2;
                                            return;
                                        case 38:
                                            this.mFeatureConfigs.mImageScaleType = i2;
                                            return;
                                        case 39:
                                            this.mFeatureConfigs.mAudioRenderType = i2;
                                            return;
                                        case 40:
                                            this.mFeatureConfigs.mSkipFindStreamInfo = i2;
                                            return;
                                        case 41:
                                            this.mFeatureConfigs.mEnableAsyncPrepare = i2;
                                            return;
                                        case 42:
                                            this.mFeatureConfigs.mCodecFrcLevel = i2;
                                            return;
                                        case 43:
                                            this.mFeatureConfigs.mEnableLazySeek = i2;
                                            return;
                                        case 44:
                                            this.mFeatureConfigs.mKeepFormatThreadAlive = i2;
                                            return;
                                        case 45:
                                            int i3 = -1;
                                            HashMap hashMap = new HashMap();
                                            EventLoggerSource eventLoggerSource = this.mDataSource;
                                            if (eventLoggerSource != null) {
                                                i3 = eventLoggerSource.getLogValueInt(67);
                                            }
                                            hashMap.put("s", Integer.valueOf(this.mRadioMode));
                                            hashMap.put("p", Integer.valueOf(i3));
                                            hashMap.put("t", Long.valueOf(System.currentTimeMillis()));
                                            this.mRadiomodeList.add(new JSONObject(hashMap).toString());
                                            return;
                                        case 46:
                                            this.mEnableMaskThread = i2;
                                            return;
                                        case 47:
                                            this.mEnableSubThread = i2;
                                            return;
                                        case 48:
                                            this.mEnableMask = i2;
                                            return;
                                        case 49:
                                            this.mEnableSub = i2;
                                            return;
                                        case MmListControl.f116813f:
                                            this.mEnableOptSubLoad = i2;
                                            return;
                                        case 51:
                                            if (i2 == 1) {
                                                z = true;
                                            }
                                            this.mEnablePlayerDegrade = z;
                                            this.mEventBase.mEnablePlayerDegrade = z;
                                            return;
                                        case 52:
                                            if (i2 == 1) {
                                                z = true;
                                            }
                                            this.mIsDegradeRelease = z;
                                            return;
                                        default:
                                            switch (i) {
                                                case 79:
                                                    this.mEnableNNSR = i2;
                                                    return;
                                                case CalendarSearchResultRv.f82651b:
                                                    this.mReadCacheMode = i2;
                                                    return;
                                                case 81:
                                                    this.mPreRangeOff = i2;
                                                    return;
                                                default:
                                                    switch (i) {
                                                        case 89:
                                                            this.mEvent.color_trc = i2;
                                                            return;
                                                        case CameraPosition.TILT_90:
                                                            if (i2 > 0) {
                                                                FeatureConfigs featureConfigs = this.mFeatureConfigs;
                                                                featureConfigs.mHDRType = i2 | featureConfigs.mHDRType;
                                                                return;
                                                            }
                                                            return;
                                                        case 91:
                                                            this.mFeatureConfigs.mEnableABRStartup = i2;
                                                            return;
                                                        case 92:
                                                            if (i2 > 0) {
                                                                this.mFeatureConfigs.mEnableThreadPriority = i2;
                                                                return;
                                                            }
                                                            return;
                                                        case 93:
                                                            this.mFeatureConfigs.mEnableSmoothClock = i2;
                                                            return;
                                                        case 94:
                                                            this.mFeatureConfigs.mDisableSplitVoice = i2;
                                                            return;
                                                        case 95:
                                                            this.mHardwareConfType = i2;
                                                            return;
                                                        case 96:
                                                            this.mFeatureConfigs.mEnableStrategyCenter = i2;
                                                            return;
                                                        case 97:
                                                            this.mFeatureConfigs.mEnableOutletDropLimit = i2;
                                                            return;
                                                        default:
                                                            return;
                                                    }
                                            }
                                    }
                            }
                    }
            }
        } else {
            this.mModelVersion = i2;
        }
    }

    @Override // com.ss.ttvideoengine.log.IVideoEventLogger
    public void updateNetworkSpeedPredictorSampleMutiValue(SpeedPredictorResultCollection speedPredictorResultCollection, SpeedPredictorResultCollection speedPredictorResultCollection2, long j) {
        VideoEventSampleRecord videoEventSampleRecord;
        if (speedPredictorResultCollection != null && speedPredictorResultCollection2 != null && (videoEventSampleRecord = this.mEventSample) != null) {
            videoEventSampleRecord.updateNetworkMutiSpeed(speedPredictorResultCollection, speedPredictorResultCollection2, j);
        }
    }

    @Override // com.ss.ttvideoengine.log.IVideoEventLogger
    public void mdlRetryResult(int i, String str, Error error) {
        HashMap hashMap = new HashMap();
        if (error != null) {
            hashMap = error.toMap();
        }
        hashMap.put("result", Integer.valueOf(i));
        if (str != null) {
            hashMap.put("filehash", str);
        }
        this.mMDLRetryInfo.add(new JSONObject(hashMap).toString());
    }

    @Override // com.ss.ttvideoengine.log.IVideoEventLogger
    public void seekTo(int i, int i2, boolean z) {
        if (!this.mLeave) {
            if (!z) {
                long currentTimeMillis = System.currentTimeMillis();
                if (this.mState == 3) {
                    this.mEventOneEvent.movieStallEnd("seek");
                    this.mEvent.lastBufferEndT = currentTimeMillis;
                }
                if (this.mState == 4) {
                    this.mEventOneOpera.endSeek("seek", 0);
                }
                int i3 = this.mSeekCount + 1;
                this.mSeekCount = i3;
                this.mState = 4;
                this.mEventOneOpera.beginSeek(i, i2, i3);
                this.mEventOneOpera.mLastBufferStartT = this.mEvent.lastBufferStartT;
                this.mEventOneOpera.mLastBufferEndT = this.mEvent.lastBufferEndT;
                this.mSeekBeginT = currentTimeMillis;
                VideoEventOnePlay videoEventOnePlay = this.mEvent;
                if (videoEventOnePlay != null) {
                    videoEventOnePlay.lastSeekStartT = currentTimeMillis;
                    this.mEvent.lastSeekPosition = i2;
                }
                this.mSeekBeginT = SystemClock.elapsedRealtime();
            }
            _recordExitReason(-2002, true);
        }
    }

    @Override // com.ss.ttvideoengine.log.IVideoEventLogger
    public void switchResolution(String str, String str2, boolean z) {
        if (z) {
            if (this.mState == 4) {
                this.mEventOneOpera.endSeek("switch", 0);
            }
            if (this.mState == 3) {
                this.mEventOneEvent.movieStallEnd("switch");
                this.mEvent.lastBufferEndT = System.currentTimeMillis();
            }
        }
        this.mEvent.et = System.currentTimeMillis();
        if (!str.equals(str2)) {
            this.mSwitchResolutionCount++;
        }
        this.mEventBase.configResolution(str, str2);
        VideoEventOnePlay videoEventOnePlay = this.mEvent;
        if (videoEventOnePlay != null) {
            videoEventOnePlay.lastResolutionStartT = System.currentTimeMillis();
        }
        if (z) {
            _recordExitReason(-2005, true);
        }
    }

    @Override // com.ss.ttvideoengine.log.IVideoEventLogger
    public void updateGlobalNetworkSpeed(long j, long j2, int i) {
        if (i == this.mNetSpeedUpdateInterval) {
            synchronized ("VideoEventLoggerV2") {
                TTVideoEngineLog.m256500d("VideoEventLoggerV2", "global speed size:" + j + ", time:" + j2 + ", totalsize:" + this.mMDLDownloadSize + ", totaltime:" + this.mMDLDownloadTime);
                this.mMDLDownloadSize = this.mMDLDownloadSize + j;
                this.mMDLDownloadTime = this.mMDLDownloadTime + j2;
            }
        }
    }

    public VideoEventLoggerV2(Context context, EventLoggerSource eventLoggerSource, HeadsetStateMonitor headsetStateMonitor) {
        this.mDataSource = eventLoggerSource;
        this.mEventBase = new VideoEventBase(eventLoggerSource, this.mUploadLogEnabled, context);
        this.mEvent = new VideoEventOnePlay();
        VideoEventOneOpera videoEventOneOpera = new VideoEventOneOpera(this.mEventBase);
        this.mEventOneOpera = videoEventOneOpera;
        this.mEventOneEvent = new VideoEventOneEvent(this.mEventBase, videoEventOneOpera);
        this.mEventSample = new VideoEventSampleRecord(this.mEventBase);
        this.mEventOneOutSync = new VideoEventOneOutSync(this.mEventBase);
        this.mFeatureConfigs = new FeatureConfigs();
        this.mRetryFetchErrorInfo = new ArrayList();
        this.mMDLRetryInfo = new ArrayList<>();
        this.mFirstDNSErrorInfo = new ArrayList();
        this.mErrorInfo = new ArrayList();
        this.mVUArray = new ArrayList();
        this.mMainError = new HashMap();
        this.mLeave = true;
        this.mFetchComplete = false;
        this.mContext = context;
        this.mHeadsetStateMonitor = headsetStateMonitor;
        this.mSrMonitor = new SuperResolutionMonitor();
        this.mFilterMonitor = new VideoFilterMonitor();
        this.mBrightMonitor = new BrightnessMonitor(this.mContext);
    }

    @Override // com.ss.ttvideoengine.log.IVideoEventLogger
    public void beginToPlay(String str, long j, String str2) {
        Map batteryInfo;
        this.mState = 1;
        this.mEventBase.beginToPlay(str, str2);
        if (this.mIsReplay == 1) {
            this.setds_t = j;
        }
        if (this.ps_t <= 0) {
            this.ps_t = j;
            EventLoggerSource eventLoggerSource = this.mDataSource;
            if (!(eventLoggerSource == null || (batteryInfo = eventLoggerSource.batteryInfo()) == null)) {
                this.mPowerList.add((Integer) batteryInfo.get("power"));
                this.mChargingList.add((Integer) batteryInfo.get("isCharging"));
            }
        }
        this.mLeave = true;
        this.mEvent.traceID = this.mEventBase.mSessionID;
        if (this.mIsReplay == 1) {
            this.mEvent.prepare_start_time = j;
        } else {
            this.mEvent.prepare_start_time = 0;
        }
        this.mEvent.prepare_end_time = 0;
        this.mEvent.dnsT = 0;
        this.mEvent.tranConnectT = 0;
        this.mEvent.tranFirstPacketT = 0;
        this.mEvent.audioDnsT = 0;
        this.mEvent.audioTranConnectT = 0;
        this.mEvent.audioTranFirstPacketT = 0;
        this.mEvent.receiveFirstVideoFrameT = 0;
        this.mEvent.receiveFirstAudioFrameT = 0;
        this.mEvent.decodeFirstVideoFrameT = 0;
        this.mEvent.decodeFirstAudioFrameT = 0;
        this.mEvent.videoDeviceStartTime = 0;
        this.mEvent.audioDeviceStartTime = 0;
        this.mEvent.videoDeviceOpenedTime = 0;
        this.mEvent.audioDeviceOpenedTime = 0;
        this.mPlayCount++;
        this.mEvent.lastSeekStartT = -2147483648L;
        this.mEvent.lastSeekEndT = -2147483648L;
        this.mEvent.lastBufferStartT = -2147483648L;
        this.mEvent.lastBufferEndT = -2147483648L;
        this.mEvent.lastResolutionStartT = -2147483648L;
        this.mEvent.lastResolutionEndT = -2147483648L;
        this.mEvent.lastSeekPosition = Integer.MIN_VALUE;
        this.mEvent.mIsEngineReuse = this.mIsEngineReuse;
        if (!this.mIsEngineReuse) {
            this.mIsEngineReuse = true;
        }
        if (this.mEventBase.mSourceTypeStr.equals("vid")) {
            _recordExitReason(IByteRtcError.BRERR_NO_PUBLISH_PERMISSION, true);
        } else if (this.mEventBase.mSourceTypeStr.equals("local_url")) {
            _recordExitReason(IByteRtcError.BRERR_GET_ROOM_INVALID_RESPONSE, true);
        } else if (this.mEvent.dnsModule == 0) {
            _recordExitReason(IByteRtcError.BRERR_NO_SUBSCRIBE_PERMISSION, true);
        } else if (this.mEvent.dnsModule == 1) {
            _recordExitReason(IByteRtcError.BRERR_GET_ROOM_INVALID_RESPONSE, true);
        }
        if (this.mEnableSpeedReport) {
            this.mEventSample.startRecord();
        }
        TTVideoEngineLog.m256505i("VideoEventLoggerV2", "netlevel interval:" + this.mNetLevelIntervalMs + ", max count:" + this.mNetLevelMaxCount);
        if (this.mNetLevelIntervalMs > 0 && this.mTimer == null && this.mTimerTask == null) {
            this.mTimer = new Timer();
            MyTimerTask myTimerTask = new MyTimerTask();
            this.mTimerTask = myTimerTask;
            this.mTimer.schedule(myTimerTask, 1000, (long) this.mNetLevelIntervalMs);
            this.mEvent.mNetQualityInterval = this.mNetLevelIntervalMs;
            this.mEventBase.registerNetwork();
            int i = this.mNetLevelIntervalMs / 3;
            this.mNetSpeedUpdateInterval = i;
            if (i < 200) {
                i = LocationRequest.PRIORITY_HD_ACCURACY;
            }
            this.mNetSpeedUpdateInterval = i;
            synchronized ("VideoEventLoggerV2") {
                DataLoaderHelper.getDataLoader().setIntValue(SmEvents.EVENT_RE, this.mNetSpeedUpdateInterval);
                this.mMDLDownloadTime = 0;
                this.mMDLDownloadSize = 0;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x00e7  */
    @Override // com.ss.ttvideoengine.log.IVideoEventLogger
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void movieShouldRetry(com.ss.ttvideoengine.utils.Error r12, int r13, int r14) {
        /*
        // Method dump skipped, instructions count: 376
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttvideoengine.log.VideoEventLoggerV2.movieShouldRetry(com.ss.ttvideoengine.utils.Error, int, int):void");
    }

    @Override // com.ss.ttvideoengine.log.IVideoEventLogger
    public void setP2PStragetyInfo(int i, int i2, int i3, int i4) {
        VideoEventOnePlay videoEventOnePlay = this.mEvent;
        if (videoEventOnePlay != null) {
            videoEventOnePlay.p2pStragetyMinPlayNum = i;
            this.mEvent.p2pStragetyPlayNum = i2;
            this.mEvent.p2pStragetyMinSpeed = i3;
            this.mEvent.p2pStragetyProbeSpeed = i4;
        }
    }

    @Override // com.ss.ttvideoengine.log.IVideoEventLogger
    public void updateNetworkSpeedPredictorSampleValue(String str, String str2, float f, float f2, float f3, float f4, long j, Map<String, String> map, Map<String, String> map2) {
        VideoEventSampleRecord videoEventSampleRecord = this.mEventSample;
        if (videoEventSampleRecord != null) {
            videoEventSampleRecord.updateNetworkSpeed(str, str2, f, f2, f3, f4, j, map, map2);
        }
    }
}
