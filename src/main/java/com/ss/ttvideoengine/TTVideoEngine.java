package com.ss.ttvideoengine;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.webkit.URLUtil;
import com.bytedance.vcloud.abrmodule.ABRResult;
import com.bytedance.vcloud.abrmodule.AbstractC20879g;
import com.bytedance.vcloud.abrmodule.C20871a;
import com.bytedance.vcloud.abrmodule.C20872b;
import com.bytedance.vcloud.abrmodule.C20873c;
import com.bytedance.vcloud.abrmodule.C20877e;
import com.bytedance.vcloud.abrmodule.C20878f;
import com.bytedance.vcloud.abrmodule.DefaultABRModule;
import com.bytedance.vcloud.abrmodule.IABRInfoListener;
import com.bytedance.vcloud.abrmodule.IPlayStateSupplier;
import com.bytedance.vcloud.mlcomponent_api.IMLComponentConfigModel;
import com.bytedance.vcloud.mlcomponent_api.IMLComponentDownLoader;
import com.bytedance.vcloud.mlcomponent_api.IMLComponentLogger;
import com.bytedance.vcloud.mlcomponent_api.IMLComponentStateListener;
import com.bytedance.vcloud.mlcomponent_api.MLComponentManager;
import com.bytedance.vcloud.networkpredictor.AbstractC20887b;
import com.bytedance.vcloud.networkpredictor.AbstractC20890e;
import com.bytedance.vcloud.networkpredictor.AbstractC20891f;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.android.HwBuildEx;
import com.huawei.hms.feature.dynamic.DynamicModule;
import com.huawei.hms.framework.common.ContainerUtils;
import com.huawei.hms.location.LocationRequest;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.huawei.hms.maps.model.CameraPosition;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.ss.android.lark.mm.module.list.control.MmListControl;
import com.ss.android.lark.mm.module.participant.ParticipantRepo;
import com.ss.android.ugc.p3041a.C60447b;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;
import com.ss.mediakit.fetcher.AVMDLURLFetcherBridge;
import com.ss.mediakit.medialoader.LoaderListener;
import com.ss.texturerender.TextureRenderConfig;
import com.ss.texturerender.TextureRenderLog;
import com.ss.texturerender.TextureRenderManager;
import com.ss.texturerender.VideoSurface;
import com.ss.ttm.player.AVThreadPool;
import com.ss.ttm.player.AudioProcessor;
import com.ss.ttm.player.FrameMetadataListener;
import com.ss.ttm.player.ILibraryLoader;
import com.ss.ttm.player.IMediaDataSource;
import com.ss.ttm.player.LoadControl;
import com.ss.ttm.player.MaskInfo;
import com.ss.ttm.player.MediaFormat;
import com.ss.ttm.player.MediaPlayer;
import com.ss.ttm.player.NativeAudioProcessor;
import com.ss.ttm.player.PlaybackParams;
import com.ss.ttm.player.SubInfo;
import com.ss.ttm.player.TTPlayerConfiger;
import com.ss.ttvideoengine.DataLoaderHelper;
import com.ss.ttvideoengine.TTNetWorkListener;
import com.ss.ttvideoengine.VideoInfoCollector;
import com.ss.ttvideoengine.VideoModelCache;
import com.ss.ttvideoengine.abr.SegmentInfo;
import com.ss.ttvideoengine.cache.CopyCacheItem;
import com.ss.ttvideoengine.data.P2PStragetyManager;
import com.ss.ttvideoengine.data.VideoLoadWrapper;
import com.ss.ttvideoengine.database.VideoModelDBManager;
import com.ss.ttvideoengine.drm.DrmUtils;
import com.ss.ttvideoengine.fetcher.FetcherMaker;
import com.ss.ttvideoengine.fetcher.SubInfoFetcher;
import com.ss.ttvideoengine.fetcher.VideoInfoFetcher;
import com.ss.ttvideoengine.fetcher.mdlfethcer.FetcherMakerNew;
import com.ss.ttvideoengine.fetcher.mdlfethcer.MDLFetcherListener;
import com.ss.ttvideoengine.httpdns.ByteDanceHttpDnsDepend;
import com.ss.ttvideoengine.httpdns.BytedanceHTTPDNSParser;
import com.ss.ttvideoengine.info.DeviceInfoVE;
import com.ss.ttvideoengine.info.networkRTTLevelListener;
import com.ss.ttvideoengine.log.AppLogEngineUploader;
import com.ss.ttvideoengine.log.AppLogTOBVer2;
import com.ss.ttvideoengine.log.BatteryMonitor;
import com.ss.ttvideoengine.log.EventLoggerSource;
import com.ss.ttvideoengine.log.ExternVideoLoggerListener;
import com.ss.ttvideoengine.log.HeadsetStateMonitor;
import com.ss.ttvideoengine.log.IVideoEventLogger;
import com.ss.ttvideoengine.log.IVideoEventUploader;
import com.ss.ttvideoengine.log.VideoEventLoggerV2;
import com.ss.ttvideoengine.log.VideoEventManager;
import com.ss.ttvideoengine.log.VideoEventOneStorage;
import com.ss.ttvideoengine.metrics.IMediaMetrics;
import com.ss.ttvideoengine.model.DubbedInfo;
import com.ss.ttvideoengine.model.IVideoModel;
import com.ss.ttvideoengine.model.IntertrustDrmHelper;
import com.ss.ttvideoengine.model.MediaBitrateFitterInfo;
import com.ss.ttvideoengine.model.P2PPlayUrlInfo;
import com.ss.ttvideoengine.model.VideoInfo;
import com.ss.ttvideoengine.model.VideoModel;
import com.ss.ttvideoengine.model.VideoRef;
import com.ss.ttvideoengine.net.DNSCompletionListener;
import com.ss.ttvideoengine.net.DNSParser;
import com.ss.ttvideoengine.net.HTTPDNS;
import com.ss.ttvideoengine.net.NetUtils;
import com.ss.ttvideoengine.net.TTVNetClient;
import com.ss.ttvideoengine.preload.PreloadMedia;
import com.ss.ttvideoengine.preload.PreloadModelMedia;
import com.ss.ttvideoengine.preload.PreloadTaskConfig;
import com.ss.ttvideoengine.preload.PreloadURLMedia;
import com.ss.ttvideoengine.preloader.TTAVPreloaderItem;
import com.ss.ttvideoengine.selector.BestResolution;
import com.ss.ttvideoengine.selector.gracie.GracieSelector;
import com.ss.ttvideoengine.selector.shift.SpeedShiftConfig;
import com.ss.ttvideoengine.setting.SettingsHelper;
import com.ss.ttvideoengine.setting.TTVideoEngineSettingManager;
import com.ss.ttvideoengine.source.Source;
import com.ss.ttvideoengine.source.strategy.CodecStrategyAdapter;
import com.ss.ttvideoengine.strategrycenter.IStrategyStateSupplier;
import com.ss.ttvideoengine.strategrycenter.StrategyCenter;
import com.ss.ttvideoengine.strategrycenter.StrategyHelper;
import com.ss.ttvideoengine.strategrycenter.StrategyKeys;
import com.ss.ttvideoengine.superresolution.ISRStrategyListener;
import com.ss.ttvideoengine.superresolution.SRStrategy;
import com.ss.ttvideoengine.superresolution.SRStrategyConfig;
import com.ss.ttvideoengine.utils.EngineThreadPool;
import com.ss.ttvideoengine.utils.Error;
import com.ss.ttvideoengine.utils.PlayDurationManager;
import com.ss.ttvideoengine.utils.TTHelper;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import com.ss.ttvideoengine.utils.TTVideoEngineUtils;
import com.ss.ttvideoengine.utils.TimeService;
import java.io.File;
import java.io.FileDescriptor;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.security.MessageDigest;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class TTVideoEngine {
    private static boolean HTTP_DNS_FIRST = false;
    private static boolean ONLY_USE_MEDIALOADER = false;
    public static final int PLAYER_OPTION_DEFAULT_RENDER_TYPE = 414;
    public static final int PLAYER_OPTION_ENABEL_HARDWARE_DECODE_AUDIO = 413;
    public static final int PLAYER_OPTION_ENABLE_PLAYER3_HARDWARE_DECODE = 31;
    public static final int PLAYER_OPTION_PREFER_NEARESTSAMPLE = 311;
    public static final int PLAYER_OPTION_SET_SUPER_RES = 210;
    public static final int PLAYER_OPTION_SET_SUPER_RES_FXAA = 211;
    public static final int PLAYER_OPTION_SET_SUPER_RES_STRENGTH = 212;
    public static final int PLAYER_OPTION_SET_USE_PLAYER3 = 30;
    public static final int PLAYER_OPTION_SUB_LANG_IDS = 532;
    public static final int PLAYER_OPTION_USE_AJ_MEDIACODEC = 412;
    public static final int PLAYER_OPTION_USE_THREAD_POOL = 411;
    private static int PLAY_URL_EXPIRE_TIME = 2400;
    public static String REGION_CN = SettingsHelper.REGION_CN;
    public static String REGION_SG = SettingsHelper.REGION_SG;
    public static String REGION_US = SettingsHelper.REGION_US;
    private static DataLoaderListener dataLoaderListener = null;
    private static String mAppPath = null;
    private static Lock mCreatCacheFileLock = new ReentrantLock();
    private static boolean mForceUseLitePlayer = false;
    private static boolean mForceUsePluginPlayer = false;
    private static boolean mHasRegisterMdlProto = false;
    private static boolean mIsFirstOpenEngine = true;
    private static int mOutPutLogLevel = 0;
    private static String[] mQualityInfos = new String[0];
    private static Context mSettingConfig = null;
    private static int mStaticRenderType = -1;
    private static TextureRenderLog.OnLogListener mTextureLogListener = null;
    private static int sABRAlgorithmType = 0;
    private static int sABRSpeedPredictInputType = 0;
    public static int sDNSCustomType;
    private static int[] sDNSType;
    private static FetcherMaker sFetcherMaker;
    private static FetcherMakerNew sFetcherMakerNew;
    private static int sIsReportTestSpeedInfo = 0;
    private static int sNetSpeedAbrPredictType = 0;
    private static int sReportSpeedInfoMaxWindowSize = 100;
    private static int sTestSpeedInterval = 0;
    private static int sTestSpeedSampleInterval = ParticipantRepo.f117150c;
    public P2PPlayUrlInfo curP2PUrlInfo;
    private String currentHost;
    private Map<Integer, String> currentParams = null;
    public Resolution currentResolution;
    public VideoInfo currentVideoInfo;
    private Map<Integer, String> dashAudioUrlMap;
    private Map<Resolution, String> dashVideoUrlMap;
    private Map<Integer, String> expectedParams = null;
    private Resolution expectedResolution;
    private Resolution lastResolution;
    private int mABR4GMaxResolutionIndex = Resolution.Undefine.getIndex();
    private int mABR4GMaxResolutionMode = 0;
    private String mABR4GMaxResolutionQuality = null;
    private float mABRBandwidthParameter = 1.0f;
    public int mABRCurrentDownloadedAudioBitrate;
    private int mABRFixedLevel = 2;
    ABRListener mABRListener;
    private AbstractC20879g mABRModule;
    private int mABROnceType = 0;
    private int mABRSpeedPredictOutType = 0;
    private float mABRStallPenaltyParameter = 9.0f;
    private float mABRStartupBandwidthParameter = 0.9f;
    private int mABRStartupModel = 0;
    private int mABRStartupSpeedType = 4;
    private int mABRSwitchCSModel = 1;
    private int mABRSwitchMode = 0;
    private float mABRSwitchPenaltyParameter = 2.0f;
    private int mABRSwitchSensitivity = 0;
    private int mABRTimerIntervalMilliseconds = ParticipantRepo.f117150c;
    private boolean mABRUsed = false;
    private int mABRWithSR = 1;
    private boolean mAEForbidCompressor;
    private float mAEPreGain = 0.25f;
    private float mAEPredelay = 0.007f;
    private float mAERatio = 8.0f;
    private float mAEThreshold = -18.0f;
    private int mAEType;
    private long mALogWriteAddr = 0;
    public String mAPIString;
    private int mAVSyncInterruptEnable;
    private float mAbrStartUpAverageSpeed = -1.0f;
    private float mAbrStartUpPredictSpeed = -1.0f;
    private float mAbrStartUpSpeed = -1.0f;
    private long mAbrStartupBitrateBeforeFitScreen = -1;
    private String mAbrVer = null;
    private int mAccumulatedErrorCount = 0;
    private int mAccurateLayout = 0;
    private boolean mAllowedExpiredModel = false;
    private int mAlwaysDoAVSync;
    private AppLogEngineUploader mAppLogEngineUploader;
    private int mAsyncInitEnable;
    public boolean mAsyncInitSR;
    private boolean mAsyncPlayHitVMCache = false;
    private MediaPlayer mAsyncPlayer;
    private int mAudioCodecID = -1;
    public int mAudioCodecProfile = -1;
    public int mAudioCodecType = -1;
    private int mAudioInfoId = -1;
    private AudioProcessor mAudioProcessor = null;
    private int mAudioRangeSize = 409600;
    private int mAudioRangeTime = HwBuildEx.VersionCodes.CUR_DEVELOPMENT;
    private int mAudioStreamType = -2;
    private int mAudioTrackSessionId = -1;
    public String mAuthorization = "";
    private int mAutoRangeOffset;
    float mAverageDownloadSpeed = BitmapDescriptorFactory.HUE_RED;
    float mAveragePredictSpeed = BitmapDescriptorFactory.HUE_RED;
    private String mBarrageMaskUrl;
    public HashMap<String, String> mBashDashDefaultMDLKeys = new HashMap<>();
    private boolean mBashEnabled;
    public BatteryMonitor mBatteryMonitor = null;
    private int mBestResolutionType = 0;
    private long mBitrate = -1;
    private int mBufferDataMiliSeconds;
    private int mBufferTimeout = 30;
    private long mBufferingStartT = 0;
    private int mBufferingType = -1;
    private boolean mCacheControlEnabled = false;
    private String mCacheDir = "";
    private int mCacheFileEnable;
    CacheFilePathListener mCacheFilePathListener;
    private String mCachePath = null;
    private boolean mCheckHijack = false;
    private String mCheckInfoString = null;
    private String mClassLoaderState = null;
    private int mCleanSurfaceWhenReset = 0;
    private int mCleanWhenStop = 0;
    private boolean mClearShutDown;
    private int mClipHEAACV2FirstPtsPacket = 0;
    private int mCodecFrcLevel = 0;
    private int mCodecId;
    private final CodecStrategyAdapter mCodecStrategyAdapter = new CodecStrategyAdapter();
    private String mCodecType = "h264";
    private HashMap<Integer, Integer> mConfigParams = null;
    private int mConfigParamsOption = 1;
    private float mContainerFPS = BitmapDescriptorFactory.HUE_RED;
    private Context mContext;
    public int mCurPosition = -1;
    private String mCurrentQuality = "";
    private String mCurrentQualityDesc = "";
    private int mCurrentSubId = 0;
    private int mDNSExpiredTime = 0;
    private DNSParser mDNSParser;
    private int mDangerBufferThreshold;
    public boolean mDashEnabled;
    public int mDataLoaderEnable = 0;
    private DataSource mDataSource;
    public boolean mDecodedVideoFirstFrame = false;
    private int mDecoderType;
    private String mDecryptionKey = "";
    private String mDefaultCacheDir = null;
    private int mDefaultRenderType = 3;
    private int mDelayBufferingUpdate = 0;
    private String mDirectURL = "";
    private boolean mDirectUrlBashEnabled;
    private String mDirectUrlSrc = "";
    private int mDisableAccurateStart;
    private int mDisableHWDecSeamless = 0;
    private int mDisableMcReuse = 0;
    private int mDisablePlayerStayAwake = 0;
    private int mDisablePlayerTimeOut;
    private int mDisableResetSystemVolume;
    private int mDisableSpiltVoiceWrite = 0;
    private long mDowngradeBitrate = -1;
    private int mDowngradeResolutionIndex = Resolution.Undefine.getIndex();
    private String mDowngradeResolutionQuality = null;
    private int mDrmCloseRootCheck = 0;
    private int mDrmDowngrade = 0;
    private boolean mDrmRetry = true;
    private int mDrmType = 0;
    private int mDummyAudioSleep = 1;
    public int mDuration;
    private VideoInfo mDynamicAudioInfo;
    private boolean mDynamicControlSR;
    private int mDynamicThreadPriorityValue = 0;
    private VideoInfo mDynamicVideoInfo;
    private int mEGLNeedWorkAround = 1;
    private Queue<Bundle> mEffectBundle = new LinkedList();
    private int mEglVersion = 2;
    public int mEnableABR = 0;
    private int mEnableAsync = 0;
    private int mEnableAudioTrackSmoothClock = 0;
    public int mEnableBarrageMask = 0;
    private int mEnableCacheTimeStamp = 0;
    private int mEnableClearMDLCache = 0;
    private int mEnableClockResumeResetEof = 0;
    private int mEnableDebugUINotify;
    private int mEnableDemuxNonBlockRead = 0;
    private int mEnableDirectUrlCheck = 0;
    private int mEnableFallbackSWDec = 1;
    private int mEnableFlushSeek = 0;
    private int mEnableFragRange = 0;
    private int mEnableHEAACV2PtsMSCorrection = 0;
    public boolean mEnableHeartBeat = false;
    private boolean mEnableHttps = false;
    private int mEnableIndexCache = 0;
    private int mEnableLoadControlBufferingTimeout;
    private boolean mEnableLooperThread = false;
    private int mEnableMaskThread = 0;
    private int mEnableMediaCodecRealtime = 1;
    private int mEnableNativeYV12Render = 0;
    private int mEnableOpenTimeout = 1;
    private int mEnableOppoControl = 0;
    private int mEnableOptSubLoadTime = 0;
    private int mEnableOptSubSearch = 0;
    private boolean mEnableOutletDropLimit = false;
    private boolean mEnablePlayerDegrade = false;
    private int mEnablePreRenderBufferingUpdate = 0;
    private int mEnableRecreateSubIfDetached = 0;
    private int mEnableRefreshByTime = 0;
    private int mEnableSeekInterrupt;
    private int mEnableSetPlayInfoToP2P = 1;
    private int mEnableSharp;
    private boolean mEnableSpeedReport = false;
    public int mEnableSub = 0;
    public int mEnableSubThread = 0;
    private int mEnableThreadPriority = 0;
    private int mEnableVC1BlockList = 1;
    private int mEnableVideoCodecPixelAlign = 0;
    private int mEnableVideoFrameMetaCallback = 0;
    private int mEnableVideoTimestampMonotonic = 0;
    private int mEnableVolumeBalance;
    private int mEncryptEnabled;
    private String mEngineHash;
    private int mEnhancementType;
    public Error mError = null;
    public int mErrorCount = 0;
    private boolean mErrorEnd = false;
    private int mExposeSignal;
    private String mExternLogKey;
    ExternVideoLoggerListener mExternVideoLoggerListener;
    private LinkedList<Pair<Surface, Integer>> mExtraSurfaceQueue = new LinkedList<>();
    private int mFFCodecerHeaacV2Compat = 0;
    private String mFallbackAPI;
    private int mFallbackApiRetry = 0;
    private boolean mFallbackExoFirst;
    private int mFeedPacketUntilEmpty = 0;
    private VideoInfoFetcher mFetcher;
    private List<String> mFileHashs = new ArrayList();
    private String mFileKey = null;
    private int mFilePlayNoBuffering = 0;
    private int mFindStreamInfoProbDuration = 0;
    private int mFindStreamInfoProbeSize = 5000000;
    public int mFirstFrameOpenTexture = 0;
    private float mFirstFrameSecOffset = BitmapDescriptorFactory.HUE_RED;
    public boolean mFirstGetWidthHeight = true;
    private boolean mFirstHost = true;
    private boolean mFirstIP = true;
    private boolean mFirstQuality = true;
    private int mFirstRangeSize = 0;
    private boolean mFirstResolution = true;
    private boolean mFirstURL = true;
    private int mForbidByteVC1SoftwareDecode = 1;
    private int mForbidOSPlayer = 0;
    private int mForbidP2P;
    private int mForbidP2PWhenSeek = 0;
    private int mForceCloseCodec = 0;
    private String mForceCodec = null;
    public int mFrameCount = 0;
    private int mFrameDropNum = 2;
    private int mGetMasterClockByPts;
    private boolean mGetPositionSkipLooper = false;
    public String mGroupID = "";
    private boolean mHLSSeamlessSwitch;
    public Handler mHandler;
    private int mHardwareDecodeEnablePlayer2;
    private int mHardwareDropNonRef;
    public boolean mHasAudioFirstFrameShown = false;
    public boolean mHasComplete = false;
    public boolean mHasFetchedSubtitle = false;
    public boolean mHasFirstFrameShown = false;
    private boolean mHasSetAESrcLoudness;
    private boolean mHasSetAESrcPeak;
    private boolean mHasSetHardWare;
    private boolean mHaveSetSpeedTest;
    public HashMap<String, String> mHeaders;
    public HeadsetStateMonitor mHeadsetMonitor;
    private int mHeartBeatInterval = LocationRequest.PRIORITY_INDOOR;
    public boolean mHeartBeatStarted = false;
    private boolean mHijackRetry = true;
    private int mHijackRetryBackupDNSType = 0;
    private int mHijackRetryCount = 0;
    private int mHijackRetryMainDNSType = 2;
    private int mHlsEnabled;
    private boolean mHttpsEnabled;
    private int mIgnoreDirectlyBuffering = 0;
    public IntertrustDrmHelper mIntertrustDrmHelper = null;
    public boolean mIsDashSource;
    private boolean mIsDirectURL = false;
    public int mIsDisableShortSeek = 0;
    private boolean mIsFeedInfo = false;
    public boolean mIsFetchingInfo = false;
    public boolean mIsLocal = false;
    private boolean mIsMute;
    public boolean mIsPlayComplete = false;
    private boolean mIsPlayItem = false;
    public boolean mIsPreDecodeAutoPause = true;
    public boolean mIsPreloaderItem = false;
    public boolean mIsStartPlayAutomatically = true;
    private int mIsTTHlsDrm = 0;
    private boolean mIsUseBoe = false;
    private int mIsUsePlayerDNS = -1;
    private boolean mIsUseServerDns = false;
    private int mKeepFormatThreadAlive = 0;
    private String mKeyseed;
    private int mKsyFrameWait = 1;
    public int mLastPlaybackTime = 0;
    public long mLastSwitchRadioModeTime = 0;
    public long mLastSwitchResolutionTime = 0;
    private int mLayoutType;
    private int mLazySeek = 1;
    private float mLeftVolume = -1.0f;
    private Bundle mLensBundle = null;
    private int mLimitMDLCacheSize = 0;
    private int mLiveStartIndex = -3;
    private LoadControl mLoadControlInterface;
    public int mLoadState;
    public int mLoadedProgress;
    private String mLocalURL = "";
    public IVideoEventLogger mLogger;
    private int mLoopCount = 0;
    private int mLoopEndTime = 0;
    private int mLoopReferVideo;
    private int mLoopStartTime = 0;
    public TTVideoEngineLooperThread mLooperThread;
    public boolean mLooping;
    private MDLFetcherListener mMDLFetcherListener;
    private MaskInfo mMaskInfoInterface;
    MaskInfoListener mMaskInfoListener;
    private int mMaxAccumulatedCountSetByUser = 30;
    private int mMaxBufferDataMilliSeconds = 5000;
    private long mMaxCacheBitrate = -1;
    private int mMaxFileCacheSize = -1;
    private int mMaxFps = 31;
    private int mMaxTextureHeight = 0;
    private int mMaxTextureWidth = 0;
    private int mMdlEnableSeekReopen = 0;
    private int mMediaCodecRender = 1;
    private int mMediaCodecSkipNonRef;
    private int mMediaCodecSyncMode;
    private IMediaDataSource mMediaDataSource = null;
    private String mMediaInfoString = null;
    public MediaPlayer mMediaPlayer;
    private int mMediacodecStopTimeout = 0;
    public int mMovPreferNearestSample;
    private int mNativeRenderRotationAdapt = 0;
    private int mNeedAdaptiveWorkaround = 0;
    private TTVNetClient mNetClient;
    private int mNetSpeedLevel = -1;
    private int mNetworkReconnectCount = 0;
    private float mNetworkSpeedReportSamplingRate = BitmapDescriptorFactory.HUE_RED;
    public int mNetworkTimeout = 5;
    private int mNetworkTryCount = -1;
    private int mNoAVSync = 0;
    private int mNoBufferUpdate = 0;
    private int mNotifyBufferingDirectly;
    private int mOldTextureAlgType = -1;
    private int mOpenSubRetryTimes = -1;
    private int mOpenVoiceEarly;
    private int mOriginalRetry = 1;
    private int mOutputLog;
    private int mOverlayMode;
    private int mP2PCDNType;
    private long mPauseStartT = 0;
    public boolean mPausedBeforePrepared;
    private long mPipeLength = 0;
    private long mPipeOffset = 0;
    public int mPlayAPIVersion;
    public boolean mPlayBackUsedSR;
    public PlayDurationManager mPlayDuration;
    private FileDescriptor mPlayFd = null;
    private TTVideoEnginePlayItem mPlayItem = null;
    public long mPlayStartTime = -1;
    private long mPlayStartTimestamp;
    public long mPlayTime = 0;
    private int mPlayType;
    public PlaybackParams mPlaybackParams;
    public int mPlaybackState;
    private int mPlayerCache;
    private int mPlayerDegradeMode;
    PlayerEventSimpleListener mPlayerEventListener;
    public boolean mPlayerFirstFrame = false;
    public int mPlayerType;
    private int mPlayerViewHeight = -1;
    private int mPlayerViewWidth = -1;
    public int mPosUpdateInterval = 0;
    private int mPostPrepare = 0;
    private int mPreRenderBufferingUpdatePercentage = 0;
    private int mPreciseCache = 0;
    private int mPreferNearestMaxPosOffset = -1;
    private TTAVPreloaderItem mPreloaderItem = null;
    private int mPrepareCacheMs = 1000;
    public boolean mPrepared;
    private int mQcomVppLevel = -1;
    private int mQueryWinEnable = -1;
    public int mRadioModeEnable = 0;
    private int mRangeMode = 0;
    private int mReadCacheMode = 0;
    private int mReadMode = 0;
    private int mRenderHDR2SDR = 0;
    public long mRenderStartTime = -1;
    private int mRenderType = 3;
    private HashMap<String, Resolution> mResolutionMap = null;
    private boolean mResolutionSwitching = false;
    private long mResolutionSwitchingStartTime = 0;
    private int mResumeFileIOBlockThresMs = 0;
    private boolean mRetryEnableHttps = false;
    public boolean mRetrying = false;
    public boolean mRetryingNotHandleError = false;
    private int mReuseSocket = 0;
    private float mRightVolume = -1.0f;
    SARChangeListener mSARChangeListener;
    public boolean mSRIgnoreRes;
    private int mSRNotUseReason = 0;
    public SRStrategy mSRStrategy = new SRStrategy();
    private int mScaleType;
    private int mScreenHeight = -1;
    private int mScreenWidth = -1;
    public boolean mSeamSwitchingResolution = false;
    private int mSecureBufferThreshold;
    SeekCompletionListener mSeekCompletionListener;
    private int mSeekEndEnabled;
    private int mSeekExact = 0;
    public boolean mSeeking = false;
    private long mSeekingStartTime = 0;
    private int mSegmentFormatFlag = 2;
    private long mSendEngineMsgTimeout = 0;
    private final long mSerial = System.currentTimeMillis();
    private int mSetTrackVolume;
    private long mSettingMask;
    public boolean mShouldPlay = false;
    public boolean mShouldStop = false;
    public boolean mShouldUseAudioRenderStart = false;
    VideoEngineCallback mSimpleCallback;
    private int mSkipAudioGraph;
    private int mSkipBufferTimeout = 0;
    private int mSkipFfmpegFindStreamInfo;
    public boolean mSkipStartWhenPrepared = false;
    private int mSoloPlayEnable = 1;
    private String mSpadea = "";
    int mSpeedAverageCount = 0;
    private SpeedShiftConfig mSpeedShiftConfig;
    private int mSpeedXDrop;
    private float mSpeedXDropFPSLimit = 50.0f;
    private float mSrcLoudness;
    private float mSrcPeak;
    public int mStandAlongAbrStartUp = 0;
    public int mStartTime = 0;
    private long mStartUpBitrate = -1;
    String mStartUpResolution = "";
    public boolean mStarted;
    private int mStartupMaxBitRateIndex = Resolution.SuperHigh.getIndex();
    private String mStartupMaxBitRateQuality = null;
    int mState;
    private int mStopSourceAsync = 0;
    StreamInfoListener mStreamInfoListener;
    private String mSubAuthToken = "";
    private SubDesInfoModelProvider mSubDesInfoModel;
    private SubInfoFetcher mSubFetcher;
    private String mSubFormat = "";
    private String mSubHostName = "";
    private String mSubIds = "";
    SubInfoSimpleCallBack mSubInfoCallBack;
    private SubInfo mSubInfoInterface;
    SubInfoListener mSubInfoListener;
    private String mSubLanIds = "";
    public String mSubPathInfo = null;
    private String mSubTag = "";
    public Surface mSurface;
    private TTVideoEngineSurfaceCallback mSurfaceCallback = null;
    public SurfaceHolder mSurfaceHolder;
    private int mSurfaceHolderByKernel = 0;
    private int mSyncUpdateSurface = 0;
    private String mTTHlsDrmToken = "";
    private String mTag = "";
    private float mTarLoudness;
    private int mTestAction;
    public int mTestNetSpeed = -1;
    public int mTestNetSpeedDiff = ParticipantRepo.f117150c;
    public Handler mTestNetSpeedHandler;
    public TestNetSpeedListener mTestNetSpeedListener;
    public Runnable mTestNetSpeedRunable;
    public boolean mTexNotifyFirstFrame = false;
    private int mTextureAlgType = -1;
    public boolean mTextureFirstFrame = false;
    public int mTextureRenderError;
    private String mTextureRenderErrorMsg = null;
    private TextureRenderManager mTextureRenderer;
    private String mTextureSRBinPath;
    private String mTextureSRDspModuleName;
    private String mTextureSROclModuleName;
    private int mTextureSrOpen = 0;
    public VideoSurface mTextureSurface;
    private int mThreadPriorityValue = 0;
    private int mThreadSafeRefSwitcher = 0;
    private int mTimeBarPercentage = 0;
    private String mTokenUrlTemplate = "";
    protected String mTraceId = "";
    public URLInfo mURLInfo = new URLInfo();
    private String[] mURLs;
    private int mUnsupportSampleRatesInBinary;
    private int mUpdateTimestampMode = 1;
    private int mUseAudioHWDec = 0;
    private int mUseCodecPool = 0;
    private boolean mUseDNSCache = false;
    private int mUseExternalDir;
    private Boolean mUseFallbackAPI;
    private int mUseMediacodecAudio;
    private boolean mUsePlayerSpade = false;
    private int mUseQcomLowLatency;
    private int mUseQcomVpp;
    public boolean mUseSRTexture;
    private boolean mUseServerDecodingMode;
    private int mUseTextureRender = 0;
    private boolean mUseVideoModelCache = false;
    private long mUserExpectedBitrate = -1;
    public boolean mUserStopped = false;
    public ArrayList<String> mUsingDataLoaderPlayFilePaths = new ArrayList<>();
    private String mUsingDataLoaderPlayRawKey = null;
    public ArrayList<String> mUsingDataLoaderPlayTaskKeys = new ArrayList<>();
    public long mVVTime = 0;
    VideoBufferDetailListener mVideoBufferDetailListener;
    VideoBufferListener mVideoBufferListener;
    public int mVideoCodecID = -1;
    public int mVideoCodecProfile = -1;
    public int mVideoCodecType = -1;
    public VideoEngineGetInfoListener mVideoEngineGetInfoListener;
    VideoEngineInfoListener mVideoEngineInfoListener;
    VideoEngineListener mVideoEngineListener;
    public String mVideoID;
    VideoInfoListener mVideoInfoListener;
    public IVideoModel mVideoModel;
    private VideoModelCache mVideoModelCache;
    private int mVideoModelVersion;
    public long mVideoPreloadSize = 0;
    private int mVideoRangeSize = 1048576;
    private int mVideoRangeTime = 5000;
    VideoURLRouteListener mVideoRouteListener;
    private int mVoiceType = -1;
    public boolean mWaitForFetchInfoResult = true;
    private int mWifiDefaultResolutionIndex = Resolution.SuperHigh.getIndex();
    private String mWifiDefaultResolutionQuality = null;
    private Map<String, IpInfo> urlIPMap;
    public Map<Resolution, Integer> urlIndexMap;

    public static String getDeviceID() {
        return "";
    }

    public static String getEngineVersion() {
        return BuildConfig.VERSION_NAME;
    }

    public static boolean isExpiredIpEnable() {
        return false;
    }

    public static boolean isUsingTTNETHttpDns() {
        return false;
    }

    public static void setExpiredIpEnable(boolean z) {
    }

    public static void setSettingConfig(Context context, Map<String, Object> map) {
    }

    public static void setUsingTTNETHttpDns(boolean z) {
    }

    /* access modifiers changed from: private */
    public static class MyTextureLogListener implements TextureRenderLog.OnLogListener {
        private MyTextureLogListener() {
        }

        @Override // com.ss.texturerender.TextureRenderLog.OnLogListener
        public int log(String str, String str2) {
            TTVideoEngineLog.m256505i(str, str2);
            return 0;
        }
    }

    public static String[] getAllQualityInfos() {
        return mQualityInfos;
    }

    public static int[] getDNSType() {
        return sDNSType;
    }

    public static int getSpeedPredictorInputType() {
        return sABRSpeedPredictInputType;
    }

    public static boolean isForceUseLitePlayer() {
        return mForceUseLitePlayer;
    }

    public static boolean isForceUsePluginPlayer() {
        return mForceUsePluginPlayer;
    }

    public static boolean isHttpDnsFirst() {
        return HTTP_DNS_FIRST;
    }

    public static void releaseStartAndSelectGearSpeedPredictor() {
        StrategyCenter.closeNewStartAndSelectGearSpeedPredictor();
    }

    public int getBufferingType() {
        return this.mBufferingType;
    }

    public boolean getCacheControlEnabled() {
        return this.mCacheControlEnabled;
    }

    /* access modifiers changed from: package-private */
    public Context getContext() {
        return this.mContext;
    }

    public String getCurrentQualityDesc() {
        return this.mCurrentQualityDesc;
    }

    public Resolution getCurrentResolution() {
        return this.currentResolution;
    }

    public int getDuration() {
        return this.mDuration;
    }

    /* access modifiers changed from: package-private */
    public String getHash() {
        return this.mEngineHash;
    }

    public IVideoModel getIVideoModel() {
        return this.mVideoModel;
    }

    public int getLoadState() {
        return this.mLoadState;
    }

    public int getLoadedProgress() {
        return this.mLoadedProgress;
    }

    public IVideoEventLogger getLogger() {
        return this.mLogger;
    }

    /* access modifiers changed from: package-private */
    public int getPlayAPIVersion() {
        return this.mPlayAPIVersion;
    }

    public int getPlaybackState() {
        return this.mPlaybackState;
    }

    public VideoSurface getTextureSurface() {
        return this.mTextureSurface;
    }

    public boolean isDashSource() {
        return this.mIsDashSource;
    }

    public boolean isLooping() {
        return this.mLooping;
    }

    public boolean isShouldPlay() {
        return this.mShouldPlay;
    }

    public boolean isStarted() {
        return this.mStarted;
    }

    public static void addTask(String str, String str2, String str3, long j) {
        DataLoaderHelper.getDataLoader().addTask(str, str2, str3, j);
    }

    public static void addTask(String str, String str2, String[] strArr, long j) {
        DataLoaderHelper.getDataLoader().addTask(str, str2, strArr, j);
    }

    public static void addTask(String str, String str2, String[] strArr, long j, String str3) {
        DataLoaderHelper.getDataLoader().addTask(str, str2, strArr, j, str3);
    }

    public static void addTask(String[] strArr, String str, long j, String str2) {
        DataLoaderHelper.getDataLoader().addTask(strArr, str, j, str2);
    }

    public static void addTask(String str, String str2, VideoModel videoModel, Resolution resolution, long j) {
        DataLoaderHelper.getDataLoader().addTask(str, str2, videoModel, resolution, j);
    }

    /* JADX WARNING: Removed duplicated region for block: B:267:0x085f  */
    /* JADX WARNING: Removed duplicated region for block: B:279:0x0885  */
    /* JADX WARNING: Removed duplicated region for block: B:314:0x08f8  */
    /* JADX WARNING: Removed duplicated region for block: B:317:0x0971  */
    /* JADX WARNING: Removed duplicated region for block: B:338:0x0aaf  */
    /* JADX WARNING: Removed duplicated region for block: B:339:0x0ab1  */
    /* JADX WARNING: Removed duplicated region for block: B:342:0x0ac3  */
    /* JADX WARNING: Removed duplicated region for block: B:345:0x0ae7  */
    /* JADX WARNING: Removed duplicated region for block: B:443:0x0cb2  */
    /* JADX WARNING: Removed duplicated region for block: B:458:0x0ced  */
    /* JADX WARNING: Removed duplicated region for block: B:499:0x0d83  */
    /* JADX WARNING: Removed duplicated region for block: B:522:0x0dd9  */
    /* JADX WARNING: Removed duplicated region for block: B:524:0x0deb  */
    /* JADX WARNING: Removed duplicated region for block: B:530:0x0e18 A[Catch:{ all -> 0x1294 }] */
    /* JADX WARNING: Removed duplicated region for block: B:531:0x0e23 A[Catch:{ all -> 0x1294 }] */
    /* JADX WARNING: Removed duplicated region for block: B:559:0x0ec7  */
    /* JADX WARNING: Removed duplicated region for block: B:583:0x1043  */
    /* JADX WARNING: Removed duplicated region for block: B:601:0x10b3  */
    /* JADX WARNING: Removed duplicated region for block: B:603:0x10bb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void _playInternal(java.lang.String r20, java.util.HashMap r21) {
        /*
        // Method dump skipped, instructions count: 4773
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttvideoengine.TTVideoEngine._playInternal(java.lang.String, java.util.HashMap):void");
    }

    /* access modifiers changed from: package-private */
    public void _doSetIntOption(int i, int i2) {
        int i3 = i2;
        if (i == 11) {
            this.mBufferTimeout = i3;
            this.mSettingMask |= 4;
            MediaPlayer mediaPlayer = this.mMediaPlayer;
            if (mediaPlayer != null) {
                mediaPlayer.setIntOption(81, i3);
            }
            this.mLogger.setIntOption(24, i3);
        } else if (i == 12) {
            if (DataLoaderHelper.getDataLoader().getIntValue(12) == 200) {
                i3 = 0;
            }
            this.mNetworkTimeout = i3;
            MediaPlayer mediaPlayer2 = this.mMediaPlayer;
            if (mediaPlayer2 != null) {
                mediaPlayer2.setIntOption(9, 1000000 * i3);
            }
            this.mLogger.setIntOption(25, i3);
        } else if (i == 100) {
            boolean z = i3 != 0;
            this.mIsStartPlayAutomatically = z;
            MediaPlayer mediaPlayer3 = this.mMediaPlayer;
            if (mediaPlayer3 != null) {
                mediaPlayer3.setIntOption(196, !z ? 1 : 0);
            }
        } else if (i == 101) {
            this.mEnableSharp = i3;
        } else if (i == 110) {
            this.mIsUsePlayerDNS = i3;
        } else if (i == 111) {
            this.mUsePlayerSpade = i3 == 1;
        } else if (i == 117) {
            TTPlayerConfiger.setValue(4, i3);
        } else if (i == 118) {
            this.mBufferDataMiliSeconds = i3;
            MediaPlayer mediaPlayer4 = this.mMediaPlayer;
            if (mediaPlayer4 != null) {
                mediaPlayer4.setIntOption(86, i3);
            }
        } else if (i == 160) {
            this.mDataLoaderEnable = i3;
            TTVideoEngineLog.m256500d("TTVideoEngine", "DataLoaderEnable is: " + this.mDataLoaderEnable);
        } else if (i == 161) {
            this.mLimitMDLCacheSize = i3;
        } else if (i == 183) {
            this.mEGLNeedWorkAround = i3;
            MediaPlayer mediaPlayer5 = this.mMediaPlayer;
            if (mediaPlayer5 != null && i3 == 0) {
                mediaPlayer5.setIntOption(183, i3);
            }
        } else if (i != 184) {
            switch (i) {
                case 0:
                    this.mPlayerCache = i3;
                    MediaPlayer mediaPlayer6 = this.mMediaPlayer;
                    if (mediaPlayer6 != null) {
                        mediaPlayer6.setIntOption(24, i3);
                        break;
                    }
                    break;
                case 1:
                    this.mEnhancementType = i3;
                    MediaPlayer mediaPlayer7 = this.mMediaPlayer;
                    if (mediaPlayer7 != null) {
                        mediaPlayer7.setIntOption(37, i3);
                        break;
                    }
                    break;
                case 2:
                    this.mScaleType = i3;
                    MediaPlayer mediaPlayer8 = this.mMediaPlayer;
                    if (mediaPlayer8 != null) {
                        mediaPlayer8.setIntOption(38, i3);
                        break;
                    }
                    break;
                case 3:
                    this.mForbidOSPlayer = i3;
                    TTPlayerConfiger.setValue(11, i3);
                    break;
                case 4:
                    this.mLayoutType = i3;
                    MediaPlayer mediaPlayer9 = this.mMediaPlayer;
                    if (mediaPlayer9 != null) {
                        mediaPlayer9.setIntOption(36, i3);
                        break;
                    }
                    break;
                case 5:
                    if ((i3 != 1 && i3 != 2) || FeatureManager.hasPermission("vr_panorama")) {
                        this.mRenderType = i3;
                        MediaPlayer mediaPlayer10 = this.mMediaPlayer;
                        if (mediaPlayer10 != null) {
                            mediaPlayer10.setIntOption(56, i3);
                            break;
                        }
                    } else {
                        TTVideoEngineLog.m256503e("TTVideoEngine", String.format("set int option failed key:%d value:%d", Integer.valueOf(i), Integer.valueOf(i2)));
                        return;
                    }
                    break;
                case 6:
                    this.mSettingMask |= 64;
                    if (i3 != 0) {
                        this.mCodecType = "bytevc1";
                        break;
                    }
                    break;
                case 7:
                    this.mHasSetHardWare = true;
                    MediaPlayer mediaPlayer11 = this.mAsyncPlayer;
                    if (mediaPlayer11 == null) {
                        mediaPlayer11 = this.mMediaPlayer;
                    }
                    this.mHardwareDecodeEnablePlayer2 = i3;
                    this.mSettingMask |= 32;
                    TTVideoEngineLog.m256505i("TTVideoEngine", "hardware enable = " + this.mHardwareDecodeEnablePlayer2);
                    if (mediaPlayer11 != null) {
                        mediaPlayer11.setIntOption(59, i3);
                        break;
                    }
                    break;
                default:
                    switch (i) {
                        case 9:
                            this.mDecoderType = i3;
                            MediaPlayer mediaPlayer12 = this.mMediaPlayer;
                            if (mediaPlayer12 != null) {
                                mediaPlayer12.setIntOption(67, i3);
                                break;
                            }
                            break;
                        case 14:
                            this.mMaxFileCacheSize = i3;
                            break;
                        case 15:
                            this.mUseExternalDir = i3;
                            break;
                        case 16:
                            this.mTestAction = i3;
                            MediaPlayer mediaPlayer13 = this.mMediaPlayer;
                            if (mediaPlayer13 != null) {
                                mediaPlayer13.setIntOption(83, i3);
                                break;
                            }
                            break;
                        case 17:
                            this.mDashEnabled = i3 == 1;
                            break;
                        case 18:
                            this.mUseDNSCache = i3 == 1;
                            break;
                        case 19:
                            this.mDNSExpiredTime = i3;
                            break;
                        case 20:
                            this.mDisableAccurateStart = i3;
                            this.mLogger.setDisableAccurateStart(i3);
                            MediaPlayer mediaPlayer14 = this.mMediaPlayer;
                            if (mediaPlayer14 != null) {
                                mediaPlayer14.setIntOption(133, i3);
                                break;
                            }
                            break;
                        case 21:
                            if (i3 != 1) {
                                this.mUseVideoModelCache = false;
                                break;
                            } else {
                                this.mUseVideoModelCache = true;
                                this.mVideoModelCache = VideoModelCache.getInstance();
                                VideoModelDBManager.getInstance(this.mContext);
                                break;
                            }
                        case 22:
                            VideoModelCache videoModelCache = this.mVideoModelCache;
                            if (videoModelCache != null) {
                                videoModelCache.setTimeOutInSec(i3);
                                break;
                            }
                            break;
                        case 23:
                            VideoModelCache videoModelCache2 = this.mVideoModelCache;
                            if (videoModelCache2 != null) {
                                videoModelCache2.setCacheNb(i3);
                                break;
                            }
                            break;
                        case 24:
                            this.mLoopStartTime = i3;
                            MediaPlayer mediaPlayer15 = this.mMediaPlayer;
                            if (mediaPlayer15 != null) {
                                mediaPlayer15.setIntOption(137, i3);
                                break;
                            }
                            break;
                        case AvailableCode.ERROR_ON_ACTIVITY_RESULT:
                            this.mLoopEndTime = i3;
                            MediaPlayer mediaPlayer16 = this.mMediaPlayer;
                            if (mediaPlayer16 != null) {
                                mediaPlayer16.setIntOption(138, i3);
                                break;
                            }
                            break;
                        case 26:
                            this.mReuseSocket = i3;
                            MediaPlayer mediaPlayer17 = this.mMediaPlayer;
                            if (mediaPlayer17 != null) {
                                mediaPlayer17.setIntOption(154, i3);
                                break;
                            }
                            break;
                        case AvailableCode.USER_IGNORE_PREVIOUS_POPUP:
                            this.mCleanWhenStop = i3;
                            break;
                        case IVideoEventLogger.LOGGER_OPTION_ENABLE_SR:
                            this.mMaxAccumulatedCountSetByUser = i3;
                            break;
                        case 29:
                        case 494:
                            if (FeatureManager.hasPermission("abr")) {
                                this.mEnableABR = i3;
                                if (i3 > 0) {
                                    if (this.mABRModule == null) {
                                        this.mABRModule = _initABRModule(this.mVideoModel);
                                    }
                                    if (this.mABRModule != null && isSupportSeamlessSwitch(this.mVideoModel)) {
                                        this.mABRModule.mo70552c(sABRAlgorithmType, this.mABRTimerIntervalMilliseconds);
                                        this.mLogger.setIsEnableABR(1);
                                    }
                                } else {
                                    AbstractC20879g gVar = this.mABRModule;
                                    if (gVar != null) {
                                        gVar.mo70551c();
                                        this.mLogger.setIsEnableABR(0);
                                    }
                                }
                                MediaPlayer mediaPlayer18 = this.mMediaPlayer;
                                if (mediaPlayer18 != null) {
                                    mediaPlayer18.setIntOption(172, i3);
                                    break;
                                }
                            } else {
                                TTVideoEngineLog.m256503e("TTVideoEngine", String.format("set int option failed key:%d value:%d", Integer.valueOf(i), Integer.valueOf(i2)));
                                return;
                            }
                            break;
                        case 85:
                            this.mFallbackExoFirst = i3 != 0;
                            break;
                        case SmEvents.EVENT_NW:
                            this.mMediaCodecSyncMode = i3;
                            MediaPlayer mediaPlayer19 = this.mMediaPlayer;
                            if (mediaPlayer19 != null) {
                                mediaPlayer19.setIntOption(90, i3);
                                break;
                            }
                            break;
                        case 198:
                            this.mIsDisableShortSeek = i3;
                            MediaPlayer mediaPlayer20 = this.mMediaPlayer;
                            if (mediaPlayer20 != null) {
                                mediaPlayer20.setIntOption(201, i3);
                                break;
                            }
                            break;
                        case 199:
                            this.mUseTextureRender = i3;
                            if (i3 == 1) {
                                MediaPlayer mediaPlayer21 = this.mAsyncPlayer;
                                if (mediaPlayer21 == null) {
                                    mediaPlayer21 = this.mMediaPlayer;
                                }
                                if (mediaPlayer21 != null && this.mTextureSurface == null) {
                                    setupTextureRender();
                                    VideoSurface videoSurface = this.mTextureSurface;
                                    if (videoSurface != null) {
                                        videoSurface.updateTexDimension(getVideoWidth(), getVideoHeight());
                                    }
                                    SurfaceHolder surfaceHolder = this.mSurfaceHolder;
                                    if (surfaceHolder == null) {
                                        Surface surface = this.mSurface;
                                        if (surface != null) {
                                            setSurfaceHook(surface);
                                            break;
                                        }
                                    } else {
                                        setSurfaceHook(surfaceHolder.getSurface());
                                        break;
                                    }
                                }
                            }
                            break;
                        case LocationRequest.PRIORITY_HD_ACCURACY:
                            int i4 = i3 * 1000;
                            this.mBufferDataMiliSeconds = i4;
                            MediaPlayer mediaPlayer22 = this.mMediaPlayer;
                            if (mediaPlayer22 != null) {
                                mediaPlayer22.setIntOption(86, i4);
                                break;
                            }
                            break;
                        case 201:
                            this.mTestNetSpeedDiff = i3;
                            if (i3 < 500) {
                                this.mTestNetSpeedDiff = ParticipantRepo.f117150c;
                                Log.e("TTVideoEngine", "setIntOption: netspeed diff is less than 500ms,set it to 500ms");
                            }
                            MediaPlayer mediaPlayer23 = this.mMediaPlayer;
                            if (mediaPlayer23 != null) {
                                mediaPlayer23.setIntOption(66, this.mTestNetSpeedDiff);
                                break;
                            }
                            break;
                        case 202:
                            this.mMaxBufferDataMilliSeconds = i3;
                            MediaPlayer mediaPlayer24 = this.mMediaPlayer;
                            if (mediaPlayer24 != null) {
                                mediaPlayer24.setIntOption(SmEvents.EVENT_NO, i3);
                                break;
                            }
                            break;
                        case SmEvents.EVENT_HBRESET:
                        case 311:
                            this.mMovPreferNearestSample = i3;
                            MediaPlayer mediaPlayer25 = this.mMediaPlayer;
                            if (mediaPlayer25 != null) {
                                mediaPlayer25.setIntOption(95, i3);
                                break;
                            }
                            break;
                        case 204:
                            this.mSkipFfmpegFindStreamInfo = i3;
                            MediaPlayer mediaPlayer26 = this.mMediaPlayer;
                            if (mediaPlayer26 != null) {
                                mediaPlayer26.setIntOption(96, i3);
                                break;
                            }
                            break;
                        case SmEvents.EVENT_HB_NOTICE_DISCONNECT:
                            this.mMaxFps = i3;
                            MediaPlayer mediaPlayer27 = this.mMediaPlayer;
                            if (mediaPlayer27 != null) {
                                mediaPlayer27.setIntOption(134, i3);
                                break;
                            }
                            break;
                        case SmEvents.EVENT_NONET:
                            IVideoEventLogger iVideoEventLogger = this.mLogger;
                            if (iVideoEventLogger != null) {
                                iVideoEventLogger.didSentEvent(i3);
                                break;
                            }
                            break;
                        case 207:
                            if (this.mFrameDropNum >= 0) {
                                this.mFrameDropNum = i3;
                                MediaPlayer mediaPlayer28 = this.mMediaPlayer;
                                if (mediaPlayer28 != null) {
                                    mediaPlayer28.setIntOption(159, i3);
                                    break;
                                }
                            } else {
                                return;
                            }
                            break;
                        case 208:
                            this.mKsyFrameWait = i3;
                            MediaPlayer mediaPlayer29 = this.mMediaPlayer;
                            if (mediaPlayer29 != null) {
                                mediaPlayer29.setIntOption(192, i3);
                                break;
                            }
                            break;
                        case 213:
                            this.mLoopReferVideo = i3;
                            MediaPlayer mediaPlayer30 = this.mMediaPlayer;
                            if (mediaPlayer30 != null) {
                                mediaPlayer30.setIntOption(195, i3);
                                break;
                            }
                            break;
                        case SmEvents.EVENT_FT:
                            this.mSkipAudioGraph = i3;
                            MediaPlayer mediaPlayer31 = this.mMediaPlayer;
                            if (mediaPlayer31 != null) {
                                mediaPlayer31.setIntOption(199, i3);
                                break;
                            }
                            break;
                        case SmEvents.EVENT_HEARTBEAT_INVALID:
                            this.mMediaCodecRender = i3;
                            MediaPlayer mediaPlayer32 = this.mMediaPlayer;
                            if (mediaPlayer32 != null) {
                                mediaPlayer32.setIntOption(88, i3);
                                break;
                            }
                            break;
                        case SmEvents.EVENT_MEETING_LICENSE_TIME_OUT:
                            this.mUseMediacodecAudio = i3;
                            MediaPlayer mediaPlayer33 = this.mMediaPlayer;
                            if (mediaPlayer33 != null) {
                                mediaPlayer33.setIntOption(97, i3);
                                break;
                            }
                            break;
                        case 250:
                            this.mIsTTHlsDrm = i3;
                            MediaPlayer mediaPlayer34 = this.mMediaPlayer;
                            if (mediaPlayer34 != null) {
                                mediaPlayer34.setIntOption(250, i3);
                                break;
                            }
                            break;
                        case 255:
                            this.mAudioStreamType = i3;
                            MediaPlayer mediaPlayer35 = this.mMediaPlayer;
                            if (mediaPlayer35 != null) {
                                mediaPlayer35.setIntOption(255, i3);
                                break;
                            }
                            break;
                        case 301:
                            if (FeatureManager.hasPermission("pcdn")) {
                                this.mP2PCDNType = i3;
                                DataLoaderHelper.getDataLoader().checkLoaderType(this.mP2PCDNType);
                                break;
                            } else {
                                TTVideoEngineLog.m256503e("TTVideoEngine", String.format("set int option failed key:%d value:%d", Integer.valueOf(i), Integer.valueOf(i2)));
                                this.mForbidP2P = 1;
                                return;
                            }
                        case 302:
                            if (FeatureManager.hasPermission("pcdn")) {
                                this.mForbidP2P = i3;
                                break;
                            } else {
                                TTVideoEngineLog.m256503e("TTVideoEngine", String.format("set int option failed key:%d value:%d", Integer.valueOf(i), Integer.valueOf(i2)));
                                this.mForbidP2P = 1;
                                return;
                            }
                        case 310:
                            this.mNetworkTryCount = i3;
                            MediaPlayer mediaPlayer36 = this.mMediaPlayer;
                            if (mediaPlayer36 != null) {
                                mediaPlayer36.setIntOption(230, i3);
                                break;
                            }
                            break;
                        case 312:
                            this.mEnableHttps = i3 == 1;
                            break;
                        case 313:
                            this.mCheckHijack = i3 == 1;
                            break;
                        case 314:
                            this.mTimeBarPercentage = i3;
                            break;
                        case 320:
                        case 472:
                            this.mOutputLog = i3;
                            MediaPlayer mediaPlayer37 = this.mMediaPlayer;
                            if (mediaPlayer37 != null) {
                                mediaPlayer37.setIntOption(223, i3);
                            }
                            DataLoaderHelper.getDataLoader().setIntValue(MediaPlayer.MEDIA_PLAYER_OPTION_APPID, i3);
                            break;
                        case 321:
                            this.mExposeSignal = i3;
                            MediaPlayer mediaPlayer38 = this.mMediaPlayer;
                            if (mediaPlayer38 != null) {
                                mediaPlayer38.setIntOption(301, i3);
                                break;
                            }
                            break;
                        case 322:
                            this.mNotifyBufferingDirectly = i3;
                            MediaPlayer mediaPlayer39 = this.mMediaPlayer;
                            if (mediaPlayer39 != null) {
                                mediaPlayer39.setIntOption(211, i3);
                            }
                            this.mLogger.setIntOption(26, i3);
                            break;
                        case 323:
                            this.mMediaCodecSkipNonRef = i3;
                            MediaPlayer mediaPlayer40 = this.mMediaPlayer;
                            if (mediaPlayer40 != null) {
                                mediaPlayer40.setIntOption(SmEvents.EVENT_MEETING_LICENSE_TIME_OUT, i3);
                                break;
                            }
                            break;
                        case 324:
                            this.mUseQcomLowLatency = i3;
                            MediaPlayer mediaPlayer41 = this.mMediaPlayer;
                            if (mediaPlayer41 != null) {
                                mediaPlayer41.setIntOption(SmEvents.EVENT_HEARTBEAT_INVALID, i3);
                                break;
                            }
                            break;
                        case 329:
                            if (FeatureManager.hasPermission("volume_balance")) {
                                this.mEnableVolumeBalance = i3;
                                MediaPlayer mediaPlayer42 = this.mMediaPlayer;
                                if (mediaPlayer42 != null) {
                                    mediaPlayer42.setIntOption(302, i3);
                                    break;
                                }
                            } else {
                                TTVideoEngineLog.m256503e("TTVideoEngine", String.format("set int option failed key:%d value:%d", Integer.valueOf(i), Integer.valueOf(i2)));
                                return;
                            }
                            break;
                        case 330:
                            this.mDisablePlayerTimeOut = i3;
                            MediaPlayer mediaPlayer43 = this.mMediaPlayer;
                            if (mediaPlayer43 != null) {
                                mediaPlayer43.setIntOption(247, i3);
                                break;
                            }
                            break;
                        case 331:
                            this.mEnableSeekInterrupt = i3;
                            MediaPlayer mediaPlayer44 = this.mMediaPlayer;
                            if (mediaPlayer44 != null) {
                                mediaPlayer44.setIntOption(248, i3);
                                break;
                            }
                            break;
                        case 332:
                            this.mUseCodecPool = i3;
                            MediaPlayer mediaPlayer45 = this.mAsyncPlayer;
                            if (mediaPlayer45 == null) {
                                mediaPlayer45 = this.mMediaPlayer;
                            }
                            if (mediaPlayer45 != null) {
                                mediaPlayer45.setIntOption(MediaPlayer.MEDIA_PLAYER_OPTION_USE_CODEC_POOL, i3);
                                break;
                            }
                            break;
                        case 333:
                            this.mNeedAdaptiveWorkaround = i3;
                            MediaPlayer mediaPlayer46 = this.mAsyncPlayer;
                            if (mediaPlayer46 == null) {
                                mediaPlayer46 = this.mMediaPlayer;
                            }
                            if (mediaPlayer46 != null) {
                                mediaPlayer46.setIntOption(254, i3);
                                break;
                            }
                            break;
                        case 334:
                            this.mScreenWidth = i3;
                            break;
                        case 335:
                            this.mScreenHeight = i3;
                            break;
                        case 339:
                            this.mEnableVideoCodecPixelAlign = i3;
                            MediaPlayer mediaPlayer47 = this.mMediaPlayer;
                            if (mediaPlayer47 != null) {
                                mediaPlayer47.setIntOption(280, i3);
                                break;
                            }
                            break;
                        case 340:
                            this.mDisableResetSystemVolume = i3;
                            MediaPlayer mediaPlayer48 = this.mMediaPlayer;
                            if (mediaPlayer48 != null) {
                                mediaPlayer48.setIntOption(98, i3);
                                break;
                            }
                            break;
                        case 341:
                            this.mPlayerViewWidth = i3;
                            AbstractC20879g gVar2 = this.mABRModule;
                            if (gVar2 != null) {
                                gVar2.mo70540a(6, i3);
                                break;
                            }
                            break;
                        case 342:
                            this.mPlayerViewHeight = i3;
                            AbstractC20879g gVar3 = this.mABRModule;
                            if (gVar3 != null) {
                                gVar3.mo70540a(7, i3);
                                break;
                            }
                            break;
                        case 343:
                            this.mAEType = i3;
                            MediaPlayer mediaPlayer49 = this.mMediaPlayer;
                            if (mediaPlayer49 != null) {
                                mediaPlayer49.setIntOption(643, i3);
                                break;
                            }
                            break;
                        case 358:
                            this.mSpeedXDrop = i3;
                            MediaPlayer mediaPlayer50 = this.mMediaPlayer;
                            if (mediaPlayer50 != null) {
                                mediaPlayer50.setIntOption(358, i3);
                                break;
                            }
                            break;
                        case 370:
                            this.mEnableLoadControlBufferingTimeout = i3;
                            MediaPlayer mediaPlayer51 = this.mMediaPlayer;
                            if (mediaPlayer51 != null) {
                                mediaPlayer51.setIntOption(370, i3);
                                break;
                            }
                            break;
                        case 371:
                            this.mOpenVoiceEarly = i3;
                            MediaPlayer mediaPlayer52 = this.mMediaPlayer;
                            if (mediaPlayer52 != null) {
                                mediaPlayer52.setIntOption(827, i3);
                                break;
                            }
                            break;
                        case MediaPlayer.MEDIA_PLAYER_OPTION_USE_CODEC_POOL:
                            this.mIsUseBoe = i3 == 1;
                            break;
                        case 401:
                            this.mEnableOppoControl = i3;
                            break;
                        case 402:
                            this.mSeekEndEnabled = i3;
                            break;
                        case 403:
                            this.mIsUseServerDns = i3 == 1;
                            break;
                        case 410:
                            this.mAsyncPlayHitVMCache = i3 == 1;
                            break;
                        case PLAYER_OPTION_USE_THREAD_POOL /*{ENCODED_INT: 411}*/:
                            TTPlayerConfiger.setValue(24, i3);
                            break;
                        case PLAYER_OPTION_ENABEL_HARDWARE_DECODE_AUDIO /*{ENCODED_INT: 413}*/:
                            this.mUseAudioHWDec = i3;
                            break;
                        case PLAYER_OPTION_DEFAULT_RENDER_TYPE /*{ENCODED_INT: 414}*/:
                            this.mDefaultRenderType = i3;
                            MediaPlayer mediaPlayer53 = this.mMediaPlayer;
                            break;
                        case 415:
                            this.mSetTrackVolume = i3;
                            MediaPlayer mediaPlayer54 = this.mMediaPlayer;
                            if (mediaPlayer54 != null) {
                                mediaPlayer54.setIntOption(94, i3);
                                break;
                            }
                            break;
                        case 416:
                            this.mEnableSetPlayInfoToP2P = i3;
                            break;
                        case 417:
                            this.mSoloPlayEnable = i3;
                            MediaPlayer mediaPlayer55 = this.mMediaPlayer;
                            if (mediaPlayer55 != null) {
                                mediaPlayer55.setIntOption(185, i3);
                                break;
                            }
                            break;
                        case 418:
                            this.mForbidP2PWhenSeek = i3;
                            break;
                        case 419:
                            this.mBestResolutionType = i3;
                            break;
                        case 420:
                            this.mEnableIndexCache = i3;
                            break;
                        case 421:
                            this.mEnableFragRange = i3;
                            break;
                        case 422:
                            this.mVideoRangeSize = i3;
                            break;
                        case 423:
                            this.mAudioRangeSize = i3;
                            break;
                        case 424:
                            this.mHijackRetryMainDNSType = i3;
                            break;
                        case 425:
                            this.mHijackRetryBackupDNSType = i3;
                            break;
                        case 427:
                            this.mHijackRetry = i3 == 1;
                            break;
                        case 430:
                            this.mVoiceType = i3;
                            MediaPlayer mediaPlayer56 = this.mMediaPlayer;
                            if (mediaPlayer56 != null) {
                                mediaPlayer56.setIntOption(378, i3);
                                break;
                            }
                            break;
                        case 431:
                            this.mAccurateLayout = i3;
                            break;
                        case 432:
                            this.mSettingMask |= 128;
                            if (i3 != 0) {
                                this.mCodecType = "bytevc2";
                                break;
                            }
                            break;
                        case 450:
                            this.mAllowedExpiredModel = i3 > 0;
                            break;
                        case 460:
                            this.mHardwareDropNonRef = i3;
                            MediaPlayer mediaPlayer57 = this.mMediaPlayer;
                            if (mediaPlayer57 != null) {
                                mediaPlayer57.setIntOption(252, i3);
                            }
                            this.mLogger.setIntOption(32, this.mHardwareDropNonRef);
                            break;
                        case 470:
                            TTVideoEngineConfig.openPerformanceUtils = i3 == 1;
                            break;
                        case 471:
                            this.mFallbackApiRetry = i3;
                            break;
                        case 473:
                            this.mRangeMode = i3;
                            break;
                        case 474:
                            this.mVideoRangeTime = i3;
                            break;
                        case 475:
                            this.mAudioRangeTime = i3;
                            break;
                        case 476:
                            this.mEglVersion = i3;
                            MediaPlayer mediaPlayer58 = this.mMediaPlayer;
                            if (mediaPlayer58 != null) {
                                mediaPlayer58.setIntOption(DynamicModule.f58006b, i3);
                                break;
                            }
                            break;
                        case 478:
                            this.mEnableAsync = i3;
                            break;
                        case 479:
                            IVideoEventLogger iVideoEventLogger2 = this.mLogger;
                            if (iVideoEventLogger2 != null) {
                                iVideoEventLogger2.setIntOption(10, i3);
                                break;
                            }
                            break;
                        case 480:
                            if (FeatureManager.hasPermission("audio_only")) {
                                this.mRadioModeEnable = i3;
                                this.mLastSwitchRadioModeTime = System.currentTimeMillis();
                                MediaPlayer mediaPlayer59 = this.mMediaPlayer;
                                if (mediaPlayer59 != null) {
                                    mediaPlayer59.setIntOption(261, i3);
                                }
                                this.mLogger.setIntOption(45, i3);
                                this.mLogger.setIntOption(11, i3);
                                break;
                            } else {
                                TTVideoEngineLog.m256503e("TTVideoEngine", String.format("set int option failed key:%d value:%d", Integer.valueOf(i), Integer.valueOf(i2)));
                                return;
                            }
                        case 481:
                            this.mDelayBufferingUpdate = i3;
                            MediaPlayer mediaPlayer60 = this.mMediaPlayer;
                            if (mediaPlayer60 != null) {
                                mediaPlayer60.setIntOption(263, i3);
                                break;
                            }
                            break;
                        case 482:
                            this.mPostPrepare = i3;
                            MediaPlayer mediaPlayer61 = this.mMediaPlayer;
                            if (mediaPlayer61 != null) {
                                mediaPlayer61.setIntOption(276, i3);
                                break;
                            }
                            break;
                        case 483:
                            this.mReadMode = i3;
                            break;
                        case 484:
                            this.mStopSourceAsync = i3;
                            MediaPlayer mediaPlayer62 = this.mMediaPlayer;
                            if (mediaPlayer62 != null) {
                                mediaPlayer62.setIntOption(278, i3);
                                break;
                            }
                            break;
                        case 485:
                            this.mDisableHWDecSeamless = i3;
                            MediaPlayer mediaPlayer63 = this.mMediaPlayer;
                            if (mediaPlayer63 != null) {
                                mediaPlayer63.setIntOption(279, i3);
                                break;
                            }
                            break;
                        case 486:
                            this.mFirstRangeSize = i3;
                            break;
                        case 487:
                            this.mNetSpeedLevel = i3;
                            break;
                        case 488:
                            this.mDisableMcReuse = i3;
                            MediaPlayer mediaPlayer64 = this.mMediaPlayer;
                            if (mediaPlayer64 != null) {
                                mediaPlayer64.setIntOption(401, i3);
                                break;
                            }
                            break;
                        case 489:
                            this.mSegmentFormatFlag = i3;
                            break;
                        case 490:
                            this.mCodecFrcLevel = i3;
                            MediaPlayer mediaPlayer65 = this.mMediaPlayer;
                            if (mediaPlayer65 != null) {
                                mediaPlayer65.setIntOption(285, i3);
                                break;
                            }
                            break;
                        case 491:
                            if (i3 > 0) {
                                this.mPrepareCacheMs = i3;
                                MediaPlayer mediaPlayer66 = this.mMediaPlayer;
                                if (mediaPlayer66 != null) {
                                    mediaPlayer66.setIntOption(286, i3);
                                    break;
                                }
                            }
                            break;
                        case 492:
                            this.mUseFallbackAPI = Boolean.valueOf(i3 > 0);
                            break;
                        case 493:
                            this.mDirectUrlBashEnabled = i3 == 1;
                            break;
                        case 495:
                            this.mUpdateTimestampMode = i3;
                            break;
                        case 496:
                            this.mEnableOpenTimeout = i3;
                            break;
                        case 497:
                            this.mFirstFrameSecOffset = ((float) i3) / 1000.0f;
                            break;
                        case 498:
                            this.mLazySeek = i3;
                            MediaPlayer mediaPlayer67 = this.mMediaPlayer;
                            if (mediaPlayer67 != null) {
                                mediaPlayer67.setIntOption(146, i3);
                                break;
                            }
                            break;
                        case 499:
                            this.mEnableBarrageMask = i3;
                            MediaPlayer mediaPlayer68 = this.mMediaPlayer;
                            if (mediaPlayer68 != null) {
                                mediaPlayer68.setIntOption(613, i3);
                            }
                            IVideoEventLogger iVideoEventLogger3 = this.mLogger;
                            if (iVideoEventLogger3 != null) {
                                iVideoEventLogger3.setIntOption(48, i3);
                                break;
                            }
                            break;
                        case ParticipantRepo.f117150c:
                            this.mABRTimerIntervalMilliseconds = i3;
                            break;
                        case 501:
                            this.mABRSwitchSensitivity = i3;
                            break;
                        case 502:
                            this.mABR4GMaxResolutionIndex = i3;
                            break;
                        case 503:
                            this.mABRSwitchMode = i3;
                            break;
                        case 504:
                            this.mABRSwitchCSModel = i3;
                            C20873c.m75971c(i2);
                            break;
                        case 505:
                            this.mABRStartupModel = i3;
                            C20873c.m75976e(i2);
                            break;
                        case 506:
                            this.mABRFixedLevel = i3;
                            C20873c.m75974d(i2);
                            break;
                        case 507:
                            this.mABR4GMaxResolutionMode = i3;
                            break;
                        case 508:
                            if (DataLoaderHelper.getDataLoader().getIntValue(12) == 200) {
                                i3 = 1;
                            }
                            this.mEnableCacheTimeStamp = i3;
                            MediaPlayer mediaPlayer69 = this.mMediaPlayer;
                            if (mediaPlayer69 != null) {
                                mediaPlayer69.setIntOption(292, i3);
                                break;
                            }
                            break;
                        case 509:
                            this.mKeepFormatThreadAlive = i3;
                            MediaPlayer mediaPlayer70 = this.mMediaPlayer;
                            if (mediaPlayer70 != null) {
                                mediaPlayer70.setIntOption(293, i3);
                                break;
                            }
                            break;
                        case MediaPlayer.MEDIA_PLAYER_OPTION_LICENSE_DIR:
                            if (FeatureManager.hasPermission("subtitle_mask")) {
                                this.mEnableMaskThread = i3;
                                IVideoEventLogger iVideoEventLogger4 = this.mLogger;
                                if (iVideoEventLogger4 != null) {
                                    iVideoEventLogger4.setIntOption(46, i3);
                                    break;
                                }
                            } else {
                                TTVideoEngineLog.m256503e("TTVideoEngine", String.format("set int option failed key:%d value:%d", Integer.valueOf(i), Integer.valueOf(i2)));
                                return;
                            }
                            break;
                        case 515:
                            this.mSeekExact = i3;
                            MediaPlayer mediaPlayer71 = this.mMediaPlayer;
                            if (mediaPlayer71 != null) {
                                mediaPlayer71.setIntOption(515, i3);
                                break;
                            }
                            break;
                        case 516:
                            this.mSkipBufferTimeout = i3;
                            MediaPlayer mediaPlayer72 = this.mMediaPlayer;
                            if (mediaPlayer72 != null) {
                                mediaPlayer72.setIntOption(297, i3);
                                break;
                            }
                            break;
                        case 517:
                            this.mLiveStartIndex = i3;
                            break;
                        case 518:
                            this.mEnableRefreshByTime = i3;
                            break;
                        case 519:
                            this.mUseServerDecodingMode = i3 != 0;
                            break;
                        case 520:
                            this.mClearShutDown = i3 != 0;
                            break;
                        case 521:
                            this.mStandAlongAbrStartUp = i3;
                            if (i3 > 0 && this.mEnableABR == 0) {
                                sABRAlgorithmType = 4;
                                break;
                            }
                        case 522:
                            this.mEnableSpeedReport = i3 != 0;
                            this.mLogger.setIntOption(18, i3);
                            break;
                        case 523:
                            sReportSpeedInfoMaxWindowSize = i3;
                            this.mLogger.setIntOption(19, i3);
                            break;
                        case 525:
                            this.mABRSpeedPredictOutType = i3;
                            break;
                        case 530:
                            this.mCurrentSubId = i3;
                            MediaPlayer mediaPlayer73 = this.mMediaPlayer;
                            if (!(mediaPlayer73 == null || this.mLogger == null)) {
                                mediaPlayer73.setIntOption(619, i3);
                                this.mLogger.addSubtitleSwitchTime();
                                break;
                            }
                        case 533:
                            this.mEnableSub = i3;
                            MediaPlayer mediaPlayer74 = this.mMediaPlayer;
                            if (mediaPlayer74 != null) {
                                mediaPlayer74.setIntOption(618, i3);
                            }
                            IVideoEventLogger iVideoEventLogger5 = this.mLogger;
                            if (iVideoEventLogger5 != null) {
                                iVideoEventLogger5.setIntOption(49, i3);
                                break;
                            }
                            break;
                        case 534:
                            if (FeatureManager.hasPermission("subtitle_mask")) {
                                this.mEnableSubThread = i3;
                                IVideoEventLogger iVideoEventLogger6 = this.mLogger;
                                if (iVideoEventLogger6 != null) {
                                    iVideoEventLogger6.setIntOption(47, i3);
                                    break;
                                }
                            } else {
                                TTVideoEngineLog.m256503e("TTVideoEngine", String.format("set int option failed key:%d value:%d", Integer.valueOf(i), Integer.valueOf(i2)));
                                return;
                            }
                            break;
                        case 536:
                            this.mWifiDefaultResolutionIndex = i3;
                            break;
                        case 537:
                            this.mStartupMaxBitRateIndex = i3;
                            break;
                        case 541:
                            this.mFFCodecerHeaacV2Compat = i3;
                            break;
                        case 542:
                            this.mCleanSurfaceWhenReset = i3;
                            break;
                        case 543:
                            this.mEnableNativeYV12Render = i3;
                            MediaPlayer mediaPlayer75 = this.mMediaPlayer;
                            if (mediaPlayer75 != null) {
                                mediaPlayer75.setIntOption(542, i3);
                                break;
                            }
                            break;
                        case 544:
                            this.mDowngradeResolutionIndex = i3;
                            break;
                        case 550:
                            this.mForceCloseCodec = i3;
                            MediaPlayer mediaPlayer76 = this.mMediaPlayer;
                            if (mediaPlayer76 != null) {
                                mediaPlayer76.setIntOption(550, i3);
                                break;
                            }
                            break;
                        case 551:
                            this.mFilePlayNoBuffering = i3;
                            MediaPlayer mediaPlayer77 = this.mMediaPlayer;
                            if (mediaPlayer77 != null) {
                                mediaPlayer77.setIntOption(551, i3);
                                break;
                            }
                            break;
                        case 552:
                            this.mNoBufferUpdate = i3;
                            MediaPlayer mediaPlayer78 = this.mMediaPlayer;
                            if (mediaPlayer78 != null) {
                                mediaPlayer78.setIntOption(552, i3);
                                break;
                            }
                            break;
                        case 557:
                            this.mClipHEAACV2FirstPtsPacket = i3;
                            MediaPlayer mediaPlayer79 = this.mMediaPlayer;
                            if (mediaPlayer79 != null) {
                                mediaPlayer79.setIntOption(557, i3);
                                break;
                            }
                            break;
                        case 558:
                            this.mWaitForFetchInfoResult = i3 != 0;
                            break;
                        case 559:
                            this.mEnableVideoTimestampMonotonic = i3;
                            MediaPlayer mediaPlayer80 = this.mMediaPlayer;
                            if (mediaPlayer80 != null) {
                                mediaPlayer80.setIntOption(558, i3);
                                break;
                            }
                            break;
                        case 560:
                            this.mFeedPacketUntilEmpty = i3;
                            MediaPlayer mediaPlayer81 = this.mMediaPlayer;
                            if (mediaPlayer81 != null) {
                                mediaPlayer81.setIntOption(559, i3);
                                break;
                            }
                            break;
                        case 561:
                            this.mEnableDemuxNonBlockRead = i3;
                            break;
                        case 562:
                            this.mEnableThreadPriority = i3;
                            MediaPlayer mediaPlayer82 = this.mMediaPlayer;
                            if (mediaPlayer82 != null) {
                                mediaPlayer82.setIntOption(561, i3);
                                break;
                            }
                            break;
                        case 563:
                            this.mThreadPriorityValue = i3;
                            MediaPlayer mediaPlayer83 = this.mMediaPlayer;
                            if (mediaPlayer83 != null) {
                                mediaPlayer83.setIntOption(562, i3);
                                break;
                            }
                            break;
                        case 564:
                            this.mEnableAudioTrackSmoothClock = i3;
                            break;
                        case 565:
                            this.mDisableSpiltVoiceWrite = i3;
                            break;
                        case 566:
                            this.mNativeRenderRotationAdapt = i3;
                            MediaPlayer mediaPlayer84 = this.mMediaPlayer;
                            if (mediaPlayer84 != null) {
                                mediaPlayer84.setIntOption(565, i3);
                                break;
                            }
                            break;
                        case 567:
                            this.mIgnoreDirectlyBuffering = i3;
                            break;
                        case 568:
                            this.mOpenSubRetryTimes = i3;
                            MediaPlayer mediaPlayer85 = this.mMediaPlayer;
                            if (mediaPlayer85 != null) {
                                mediaPlayer85.setIntOption(853, i3);
                                break;
                            }
                            break;
                        case 569:
                            this.mEnableRecreateSubIfDetached = i3;
                            MediaPlayer mediaPlayer86 = this.mMediaPlayer;
                            if (mediaPlayer86 != null) {
                                mediaPlayer86.setIntOption(854, i3);
                                break;
                            }
                            break;
                        case 571:
                            this.mABRWithSR = i3;
                            break;
                        case 572:
                            this.mEnableMediaCodecRealtime = i3;
                            break;
                        case 573:
                            this.mABROnceType = i3;
                            break;
                        case 574:
                            this.mABRStartupSpeedType = i3;
                            GracieSelector.setSpeedType(i2);
                            break;
                        case 575:
                            this.mEnablePreRenderBufferingUpdate = i3;
                            break;
                        case 576:
                            this.mPreRenderBufferingUpdatePercentage = i3;
                            break;
                        case 577:
                            this.mEnableHEAACV2PtsMSCorrection = i3;
                            break;
                        case 578:
                            this.mEnableVC1BlockList = i3;
                            break;
                        case 600:
                            this.mHlsEnabled = i3;
                            break;
                        case 601:
                            this.mEncryptEnabled = i3;
                            break;
                        case 602:
                            this.mPosUpdateInterval = i3;
                            MediaPlayer mediaPlayer87 = this.mMediaPlayer;
                            if (mediaPlayer87 != null) {
                                mediaPlayer87.setIntOption(647, i3);
                                break;
                            }
                            break;
                        case 603:
                            this.mEnableClearMDLCache = i3;
                            break;
                        case 604:
                            IVideoEventLogger iVideoEventLogger7 = this.mLogger;
                            if (iVideoEventLogger7 != null) {
                                iVideoEventLogger7.setIntOption(22, i3);
                                break;
                            }
                            break;
                        case 605:
                            IVideoEventLogger iVideoEventLogger8 = this.mLogger;
                            if (iVideoEventLogger8 != null) {
                                iVideoEventLogger8.setIntOption(23, i3);
                                break;
                            }
                            break;
                        case 606:
                            this.mEnableDirectUrlCheck = i3;
                            break;
                        case 607:
                            this.mFindStreamInfoProbeSize = i3;
                            MediaPlayer mediaPlayer88 = this.mMediaPlayer;
                            if (mediaPlayer88 != null) {
                                mediaPlayer88.setIntOption(536, i3);
                                break;
                            }
                            break;
                        case 608:
                            this.mFindStreamInfoProbDuration = i3;
                            MediaPlayer mediaPlayer89 = this.mMediaPlayer;
                            if (mediaPlayer89 != null) {
                                mediaPlayer89.setIntOption(537, i3);
                                break;
                            }
                            break;
                        case 609:
                            this.mNetworkReconnectCount = i3;
                            break;
                        case 610:
                            this.mDummyAudioSleep = i3;
                            break;
                        case 611:
                            this.mDisablePlayerStayAwake = i3;
                            MediaPlayer mediaPlayer90 = this.mMediaPlayer;
                            if (mediaPlayer90 != null) {
                                mediaPlayer90.setIntOption(5003, i3);
                                break;
                            }
                            break;
                        case 612:
                            this.mIsPreDecodeAutoPause = i3 != 0;
                            break;
                        case 613:
                            this.mEnableVideoFrameMetaCallback = i3;
                            MediaPlayer mediaPlayer91 = this.mMediaPlayer;
                            if (mediaPlayer91 != null) {
                                mediaPlayer91.setIntOption(333, i3);
                                break;
                            }
                            break;
                        case 616:
                            this.mEnablePlayerDegrade = i3 == 1;
                            break;
                        case 617:
                            IVideoEventLogger iVideoEventLogger9 = this.mLogger;
                            if (iVideoEventLogger9 != null) {
                                iVideoEventLogger9.setIntOption(52, i3);
                                break;
                            }
                            break;
                        case 618:
                            if (i3 != 0 && this.mBatteryMonitor == null) {
                                this.mBatteryMonitor = new BatteryMonitor(this.mContext);
                                break;
                            }
                        case 620:
                            this.mNoAVSync = i3;
                            MediaPlayer mediaPlayer92 = this.mMediaPlayer;
                            if (mediaPlayer92 != null) {
                                mediaPlayer92.setIntOption(820, i3);
                                break;
                            }
                            break;
                        case 650:
                            this.mOverlayMode = i3;
                            break;
                        case 652:
                            this.mRenderHDR2SDR = i3;
                            break;
                        case 654:
                            this.mSyncUpdateSurface = i3;
                            VideoSurface videoSurface2 = this.mTextureSurface;
                            if (videoSurface2 != null) {
                                videoSurface2.setIntOption(9, i3);
                                break;
                            }
                            break;
                        case 656:
                            this.mEnableHeartBeat = i3 == 1;
                            break;
                        case 657:
                            if (i3 > 0) {
                                this.mHeartBeatInterval = i3;
                                break;
                            }
                            break;
                        case 658:
                            this.mEnableFlushSeek = i3;
                            MediaPlayer mediaPlayer93 = this.mMediaPlayer;
                            if (mediaPlayer93 != null) {
                                mediaPlayer93.setIntOption(823, i3);
                                break;
                            }
                            break;
                        case 661:
                            this.mFirstFrameOpenTexture = i3;
                            break;
                        case 663:
                            this.mGetPositionSkipLooper = i3 == 1;
                            break;
                        case 664:
                            this.mEnableDebugUINotify = i3;
                            break;
                        case 665:
                            this.mGetMasterClockByPts = i3;
                            break;
                        case 666:
                            this.mAlwaysDoAVSync = i3;
                            break;
                        case 668:
                            if (i3 >= 0) {
                                this.mResumeFileIOBlockThresMs = i3;
                                break;
                            }
                            break;
                        case 669:
                            this.mEnableOptSubLoadTime = i3;
                            MediaPlayer mediaPlayer94 = this.mMediaPlayer;
                            if (mediaPlayer94 != null) {
                                mediaPlayer94.setIntOption(828, i3);
                                break;
                            }
                            break;
                        case 670:
                            this.mEnableFallbackSWDec = i3;
                            break;
                        case 671:
                            this.mHLSSeamlessSwitch = i3 == 1;
                            break;
                        case 673:
                            this.mEnableOutletDropLimit = i3 == 1;
                            MediaPlayer mediaPlayer95 = this.mMediaPlayer;
                            if (mediaPlayer95 != null) {
                                mediaPlayer95.setIntOption(149, i3);
                            }
                            this.mLogger.setIntOption(97, this.mEnableOutletDropLimit ? 1 : 0);
                            break;
                        case 675:
                            MediaPlayer mediaPlayer96 = this.mMediaPlayer;
                            if (!(mediaPlayer96 == null || this.mAudioInfoId == i3)) {
                                mediaPlayer96.setIntOption(660, i3);
                            }
                            this.mAudioInfoId = i3;
                            break;
                        case 677:
                            this.mThreadSafeRefSwitcher = i3;
                            MediaPlayer mediaPlayer97 = this.mMediaPlayer;
                            if (mediaPlayer97 != null) {
                                mediaPlayer97.setIntOption(870, i3);
                                break;
                            }
                            break;
                        case 678:
                            this.mEnableOptSubSearch = i3;
                            MediaPlayer mediaPlayer98 = this.mMediaPlayer;
                            if (mediaPlayer98 != null) {
                                mediaPlayer98.setIntOption(829, i3);
                                break;
                            }
                            break;
                        case 679:
                            this.mAVSyncInterruptEnable = i3;
                            break;
                        case 680:
                            this.mEnableClockResumeResetEof = i3;
                            break;
                        case 681:
                            this.mSkipStartWhenPrepared = i3 == 1;
                            break;
                        case 700:
                            this.mAudioTrackSessionId = i3;
                            MediaPlayer mediaPlayer99 = this.mMediaPlayer;
                            if (mediaPlayer99 != null) {
                                mediaPlayer99.setIntOption(960, i3);
                                break;
                            }
                            break;
                        case 703:
                            this.mPreciseCache = i3;
                            break;
                        case 800:
                            this.mMdlEnableSeekReopen = i3;
                            break;
                        case 950:
                            this.mSendEngineMsgTimeout = (long) i3;
                            break;
                        case 951:
                            this.mSurfaceHolderByKernel = i3;
                            break;
                        case 952:
                            this.mMediacodecStopTimeout = i3;
                            MediaPlayer mediaPlayer100 = this.mMediaPlayer;
                            if (mediaPlayer100 != null) {
                                mediaPlayer100.setIntOption(952, i3);
                                break;
                            }
                            break;
                        case 953:
                            this.mQueryWinEnable = i3;
                            MediaPlayer mediaPlayer101 = this.mMediaPlayer;
                            if (!(mediaPlayer101 == null || i3 == -1)) {
                                mediaPlayer101.setIntOption(982, i3);
                                break;
                            }
                        case 954:
                            this.mPreferNearestMaxPosOffset = i3;
                            MediaPlayer mediaPlayer102 = this.mMediaPlayer;
                            if (!(mediaPlayer102 == null || i3 == -1)) {
                                mediaPlayer102.setIntOption(985, i3);
                                break;
                            }
                        default:
                            switch (i) {
                                case PLAYER_OPTION_ENABLE_PLAYER3_HARDWARE_DECODE /*{ENCODED_INT: 31}*/:
                                    MediaPlayer mediaPlayer103 = this.mMediaPlayer;
                                    if (mediaPlayer103 != null) {
                                        mediaPlayer103.setIntOption(59, i3);
                                        break;
                                    }
                                    break;
                                case 32:
                                    this.mLoopCount = i3;
                                    MediaPlayer mediaPlayer104 = this.mMediaPlayer;
                                    if (mediaPlayer104 != null) {
                                        mediaPlayer104.setIntOption(193, i3);
                                        break;
                                    }
                                    break;
                                case 33:
                                    this.mBashEnabled = i3 == 1;
                                    break;
                                case 34:
                                    this.mDrmType = i3;
                                    MediaPlayer mediaPlayer105 = this.mMediaPlayer;
                                    if (mediaPlayer105 != null) {
                                        mediaPlayer105.setIntOption(SmEvents.EVENT_NONET, i3);
                                        break;
                                    }
                                    break;
                                default:
                                    switch (i) {
                                        case 36:
                                            this.mDrmDowngrade = i3;
                                            MediaPlayer mediaPlayer106 = this.mMediaPlayer;
                                            if (mediaPlayer106 != null) {
                                                mediaPlayer106.setIntOption(208, i3);
                                                break;
                                            }
                                            break;
                                        case 37:
                                            this.mDrmRetry = i3 == 1;
                                            break;
                                        case 38:
                                            this.mDrmCloseRootCheck = i3;
                                            MediaPlayer mediaPlayer107 = this.mMediaPlayer;
                                            if (mediaPlayer107 != null) {
                                                mediaPlayer107.setIntOption(209, i3);
                                                break;
                                            }
                                            break;
                                    }
                            }
                    }
                    break;
            }
        } else {
            this.mOriginalRetry = i3;
            MediaPlayer mediaPlayer108 = this.mMediaPlayer;
            if (mediaPlayer108 != null) {
                mediaPlayer108.setIntOption(197, i3);
            }
        }
        TTVideoEngineLog.m256505i("TTVideoEngine", String.format("set int option key:%d value:%d", Integer.valueOf(i), Integer.valueOf(i3)));
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x041a  */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x0470  */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x0495  */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x049a  */
    /* JADX WARNING: Removed duplicated region for block: B:217:0x04e3  */
    /* JADX WARNING: Removed duplicated region for block: B:232:0x0527  */
    /* JADX WARNING: Removed duplicated region for block: B:244:0x057b  */
    /* JADX WARNING: Removed duplicated region for block: B:263:0x05ee  */
    /* JADX WARNING: Removed duplicated region for block: B:264:0x05f7  */
    /* JADX WARNING: Removed duplicated region for block: B:269:0x0603  */
    /* JADX WARNING: Removed duplicated region for block: B:276:0x063d  */
    /* JADX WARNING: Removed duplicated region for block: B:284:0x0656  */
    /* JADX WARNING: Removed duplicated region for block: B:285:0x065e  */
    /* JADX WARNING: Removed duplicated region for block: B:287:0x0667  */
    /* JADX WARNING: Removed duplicated region for block: B:289:0x066b  */
    /* JADX WARNING: Removed duplicated region for block: B:449:0x0440 A[EDGE_INSN: B:449:0x0440->B:175:0x0440 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void _doParseIPAddress(com.ss.ttvideoengine.model.IVideoModel r34) {
        /*
        // Method dump skipped, instructions count: 2515
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttvideoengine.TTVideoEngine._doParseIPAddress(com.ss.ttvideoengine.model.IVideoModel):void");
    }

    /* access modifiers changed from: private */
    public static class DeleteBeforeDirFileRunnable implements Runnable {
        private Context context;

        public void run() {
            TTHelper.deleteBeforeDirFiles(this.context);
        }

        public DeleteBeforeDirFileRunnable(Context context2) {
            this.context = context2;
        }
    }

    /* access modifiers changed from: private */
    public static class MyDNSCompletionListener implements DNSCompletionListener {
        private final WeakReference<TTVideoEngine> mVideoEngineRef;

        @Override // com.ss.ttvideoengine.net.DNSCompletionListener
        public void onCancelled() {
            TTVideoEngineLog.m256505i("TTVideoEngine", "dns cancelled");
        }

        public MyDNSCompletionListener(TTVideoEngine tTVideoEngine) {
            this.mVideoEngineRef = new WeakReference<>(tTVideoEngine);
        }

        @Override // com.ss.ttvideoengine.net.DNSCompletionListener
        public void onRetry(Error error) {
            if (error == null) {
                TTVideoEngineLog.m256503e("TTVideoEngine", String.format("fetcher should retry, error:%s", error.toString()));
                TTVideoEngine tTVideoEngine = this.mVideoEngineRef.get();
                if (tTVideoEngine != null) {
                    if (tTVideoEngine.urlIndexMap.get(tTVideoEngine.currentResolution).intValue() == 0) {
                        tTVideoEngine.mLogger.mainURLLocalDNSFailed(error);
                    }
                    tTVideoEngine.mLogger.firstDNSFailed(error);
                }
            }
        }

        @Override // com.ss.ttvideoengine.net.DNSCompletionListener
        public void onCompletion(JSONObject jSONObject, Error error) {
            TTVideoEngine tTVideoEngine = this.mVideoEngineRef.get();
            if (tTVideoEngine != null) {
                if (tTVideoEngine.mShouldStop) {
                    TTVideoEngineLog.m256508w("TTVideoEngine", "MyDNSCompletionListener should stop");
                } else if (error != null) {
                    TTVideoEngineLog.m256503e("TTVideoEngine", String.format("dns failed:%s", error.toString()));
                    if (tTVideoEngine.urlIndexMap.get(tTVideoEngine.currentResolution).intValue() == 0) {
                        tTVideoEngine.mLogger.mainURLHTTPDNSFailed(error);
                    }
                    tTVideoEngine._receivedError(error);
                } else {
                    String str = null;
                    if (jSONObject != null) {
                        str = jSONObject.optString("ip");
                        long optLong = jSONObject.optLong("time");
                        String optString = jSONObject.optString("dns_type");
                        if (tTVideoEngine.mLogger != null) {
                            tTVideoEngine.mLogger.setDNSEndTime(optLong);
                            tTVideoEngine.mLogger.setStringOption(86, optString);
                        }
                    }
                    if (TextUtils.isEmpty(str)) {
                        tTVideoEngine._receivedError(new Error("", -9997, "DNS result empty"));
                        TTVideoEngineLog.m256503e("TTVideoEngine", "dns parse empty");
                        return;
                    }
                    tTVideoEngine._parseDNSComplete(str);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public static class RecursionDeleteFileRunnable implements Runnable {
        private File mNeedDeleteFile;

        public void run() {
            TTHelper.recursionDeleteFile(this.mNeedDeleteFile);
        }

        public RecursionDeleteFileRunnable(File file) {
            this.mNeedDeleteFile = file;
        }
    }

    public static void cancelAllWaitReqs() {
        DataLoaderHelper.getDataLoader().cancelAllWaitReqs();
    }

    public static void clearAllCaches() {
        DataLoaderHelper.getDataLoader().clearAllCaches();
    }

    public static void closeDataLoader() {
        DataLoaderHelper.getDataLoader().close();
    }

    public static void onPause() {
        TTVideoEngineLog.m256500d("TTVideoEngine", "onPause");
    }

    public static void onResume() {
        TTVideoEngineLog.m256500d("TTVideoEngine", "onResume");
    }

    public static void removeAllPreloadMedia() {
        removeAllPreloadMedia(null, 1);
    }

    public EventLoggerSource getVideoEngineDataSource() {
        return new MyLoggerDataSource(this);
    }

    public float getVolume() {
        return TTHelper.getVolume(this.mContext);
    }

    public boolean isOSPlayer() {
        return isPlayerType(2);
    }

    public boolean isReportLogEnable() {
        return this.mLogger.isUploadLogEnabled();
    }

    public boolean isSupportHDR() {
        return InfoWrapper.isHDREnable();
    }

    public boolean isSupportSR() {
        return InfoWrapper.isSREnable();
    }

    public boolean isSystemPlayer() {
        return _doIsSystemPlayer();
    }

    /* access modifiers changed from: private */
    public static class MyPlayStateSupplier implements IPlayStateSupplier {
        private int mSidxAudioWindowSize = -1;
        private int mSidxVideoWindowSize = -1;
        private final WeakReference<TTVideoEngine> mVideoEngineRef;

        public Queue<Object> getTimelineNetworkSpeed() {
            return null;
        }

        public int getCurrentDownloadAudioBitrate() {
            TTVideoEngine tTVideoEngine = this.mVideoEngineRef.get();
            if (tTVideoEngine == null) {
                return -1;
            }
            return tTVideoEngine.mABRCurrentDownloadedAudioBitrate;
        }

        public int getNetworkState() {
            return TTNetWorkListener.getInstance().getCurrentAccessType();
        }

        public int getCurrentDownloadAudioSegmentIndex() {
            MediaPlayer mediaPlayer;
            TTVideoEngine tTVideoEngine = this.mVideoEngineRef.get();
            if (tTVideoEngine == null || (mediaPlayer = tTVideoEngine.mMediaPlayer) == null) {
                return -1;
            }
            return mediaPlayer.getIntOption(519, -1);
        }

        public int getCurrentDownloadVideoBitrate() {
            TTVideoEngine tTVideoEngine = this.mVideoEngineRef.get();
            if (tTVideoEngine == null || tTVideoEngine.mMediaPlayer == null) {
                return -1;
            }
            return tTVideoEngine.mMediaPlayer.getIntOption(601, -1);
        }

        public int getCurrentDownloadVideoSegmentIndex() {
            MediaPlayer mediaPlayer;
            TTVideoEngine tTVideoEngine = this.mVideoEngineRef.get();
            if (tTVideoEngine == null || (mediaPlayer = tTVideoEngine.mMediaPlayer) == null) {
                return -1;
            }
            return mediaPlayer.getIntOption(520, -1);
        }

        public int getCurrentPlaybackTime() {
            TTVideoEngine tTVideoEngine = this.mVideoEngineRef.get();
            if (tTVideoEngine == null || tTVideoEngine.mMediaPlayer == null) {
                return -1;
            }
            return tTVideoEngine.mMediaPlayer.getCurrentPosition();
        }

        public int getMaxCacheAudioTime() {
            MediaPlayer mediaPlayer;
            int intOption;
            TTVideoEngine tTVideoEngine = this.mVideoEngineRef.get();
            if (tTVideoEngine == null || (mediaPlayer = tTVideoEngine.mMediaPlayer) == null || (intOption = mediaPlayer.getIntOption(24, -1)) <= 0) {
                return 30000;
            }
            return intOption * 1000;
        }

        public int getMaxCacheVideoTime() {
            MediaPlayer mediaPlayer;
            int intOption;
            TTVideoEngine tTVideoEngine = this.mVideoEngineRef.get();
            if (tTVideoEngine == null || (mediaPlayer = tTVideoEngine.mMediaPlayer) == null || (intOption = mediaPlayer.getIntOption(24, -1)) <= 0) {
                return 30000;
            }
            return intOption * 1000;
        }

        public float getPlaySpeed() {
            TTVideoEngine tTVideoEngine = this.mVideoEngineRef.get();
            if (tTVideoEngine == null || tTVideoEngine.mPlaybackParams == null) {
                return 1.0f;
            }
            return tTVideoEngine.mPlaybackParams.getSpeed();
        }

        public int getPlayerAudioCacheTime() {
            MediaPlayer mediaPlayer;
            TTVideoEngine tTVideoEngine = this.mVideoEngineRef.get();
            if (tTVideoEngine == null || (mediaPlayer = tTVideoEngine.mMediaPlayer) == null) {
                return -1;
            }
            return (int) mediaPlayer.getLongOption(73, -1);
        }

        public int getPlayerVideoCacheTime() {
            MediaPlayer mediaPlayer;
            TTVideoEngine tTVideoEngine = this.mVideoEngineRef.get();
            if (tTVideoEngine == null || (mediaPlayer = tTVideoEngine.mMediaPlayer) == null) {
                return -1;
            }
            return (int) mediaPlayer.getLongOption(72, -1);
        }

        public float getDownloadSpeed() {
            Map<String, String> b;
            if (StrategyCenter.sNetAbrSpeedPredictor == null || (b = StrategyCenter.sNetAbrSpeedPredictor.mo70590b(VideoRef.TYPE_VIDEO)) == null || b.get("download_speed") == null) {
                return -1.0f;
            }
            return Float.parseFloat(b.get("download_speed"));
        }

        public int getLoaderType() {
            TTVideoEngine tTVideoEngine = this.mVideoEngineRef.get();
            if (tTVideoEngine == null || tTVideoEngine.mMediaPlayer == null) {
                return -1;
            }
            try {
                return Integer.parseInt(tTVideoEngine.mMediaPlayer.getStringOption(LocationRequest.PRIORITY_HD_ACCURACY));
            } catch (Exception e) {
                TTVideoEngineLog.m256501d(e);
                return -1;
            }
        }

        public float getNetworkSpeed() {
            if (StrategyCenter.sNetAbrSpeedPredictor == null) {
                return -1.0f;
            }
            float a = StrategyCenter.sNetAbrSpeedPredictor.mo70582a(0);
            TTVideoEngineLog.m256500d("TTVideoEngine", String.format("[ABR] get network speed:%f", Float.valueOf(a)));
            return a;
        }

        public float getSpeedConfidence() {
            if (StrategyCenter.sNetAbrSpeedPredictor == null) {
                return -1.0f;
            }
            float c = StrategyCenter.sNetAbrSpeedPredictor.mo70591c();
            TTVideoEngineLog.m256500d("TTVideoEngine", String.format("[ABR] get network confidence:%f", Float.valueOf(c)));
            return c;
        }

        public Map<String, Object> getAudioBufferInfo() {
            List<VideoInfo> videoInfoList;
            HashMap hashMap = new HashMap();
            TTVideoEngine tTVideoEngine = this.mVideoEngineRef.get();
            if (!(tTVideoEngine == null || tTVideoEngine.mVideoModel == null || (videoInfoList = tTVideoEngine.mVideoModel.getVideoInfoList()) == null || videoInfoList.size() == 0)) {
                for (VideoInfo videoInfo : videoInfoList) {
                    if (videoInfo != null && videoInfo.getMediatype() == VideoRef.TYPE_AUDIO) {
                        C20872b bVar = new C20872b();
                        String valueStr = videoInfo.getValueStr(15);
                        bVar.mo70560a(valueStr);
                        bVar.mo70559a(TTVideoEngine.getCacheFileSize(valueStr));
                        MediaBitrateFitterInfo bitrateFitterInfo = videoInfo.getBitrateFitterInfo();
                        if (bitrateFitterInfo != null) {
                            bVar.mo70561b((long) bitrateFitterInfo.getHeaderSize());
                        }
                        hashMap.put("" + videoInfo.getValueInt(3), bVar);
                    }
                }
            }
            return hashMap;
        }

        public Map<String, Object> getVideoBufferInfo() {
            List<VideoInfo> videoInfoList;
            HashMap hashMap = new HashMap();
            TTVideoEngine tTVideoEngine = this.mVideoEngineRef.get();
            if (!(tTVideoEngine == null || tTVideoEngine.mVideoModel == null || (videoInfoList = tTVideoEngine.mVideoModel.getVideoInfoList()) == null || videoInfoList.size() == 0)) {
                for (VideoInfo videoInfo : videoInfoList) {
                    if (videoInfo != null && videoInfo.getMediatype() == VideoRef.TYPE_VIDEO) {
                        C20872b bVar = new C20872b();
                        String valueStr = videoInfo.getValueStr(15);
                        bVar.mo70560a(valueStr);
                        bVar.mo70559a(TTVideoEngine.getCacheFileSize(valueStr));
                        MediaBitrateFitterInfo bitrateFitterInfo = videoInfo.getBitrateFitterInfo();
                        if (bitrateFitterInfo != null) {
                            bVar.mo70561b((long) bitrateFitterInfo.getHeaderSize());
                        }
                        hashMap.put("" + videoInfo.getValueInt(3), bVar);
                    }
                }
            }
            return hashMap;
        }

        public MyPlayStateSupplier(TTVideoEngine tTVideoEngine) {
            this.mVideoEngineRef = new WeakReference<>(tTVideoEngine);
        }

        public List<? extends Object> getSegmentInfoList(int i, int i2) {
            Object objectOption;
            TTVideoEngine tTVideoEngine = this.mVideoEngineRef.get();
            if (tTVideoEngine == null) {
                return null;
            }
            MediaPlayer mediaPlayer = tTVideoEngine.mMediaPlayer;
            ArrayList arrayList = new ArrayList();
            if (i != this.mSidxVideoWindowSize) {
                this.mSidxVideoWindowSize = i;
                mediaPlayer.setIntOption(522, i);
            }
            if (i2 != this.mSidxAudioWindowSize) {
                this.mSidxAudioWindowSize = i2;
                mediaPlayer.setIntOption(523, i2);
            }
            if ((mediaPlayer instanceof MediaPlayerWrapper) && (objectOption = ((MediaPlayerWrapper) mediaPlayer).getObjectOption(521)) != null) {
                for (Object obj : (Object[]) objectOption) {
                    arrayList.add(new SegmentInfo(obj));
                }
            }
            return arrayList;
        }

        public float getAverageDownloadSpeed(int i, int i2, boolean z) {
            if (StrategyCenter.sNetAbrSpeedPredictor != null) {
                return StrategyCenter.sNetAbrSpeedPredictor.mo70583a(i, i2, z);
            }
            return -1.0f;
        }
    }

    /* access modifiers changed from: private */
    public class URLInfo {
        public String hostURL;
        public String ipURL;
        public boolean isIp;

        public String getCurrentURL() {
            if (this.isIp) {
                return this.ipURL;
            }
            return this.hostURL;
        }

        public void reset() {
            this.hostURL = null;
            this.ipURL = null;
            this.isIp = false;
        }

        private URLInfo() {
        }

        public void setHostURL(String str) {
            this.hostURL = str;
            this.isIp = false;
        }

        public void setIpURL(String str) {
            this.ipURL = str;
            this.isIp = true;
        }
    }

    private void _dataLoaderAddEngineRef() {
        DataLoaderHelper.getDataLoader()._addEngine(this, this.mUsingDataLoaderPlayRawKey);
    }

    private int _getPlayerTime() {
        MediaPlayer mediaPlayer = this.mMediaPlayer;
        if (mediaPlayer == null) {
            return 0;
        }
        return mediaPlayer.getCurrentPosition();
    }

    private static void _initSettings() {
        TTVideoEngineSettingManager instance = TTVideoEngineSettingManager.getInstance();
        instance.loadFetchConfig();
        instance.startFetchSettingisForce(true);
    }

    private void _resetUsingDataLoaderField() {
        this.mUsingDataLoaderPlayTaskKeys.clear();
        this.mUsingDataLoaderPlayFilePaths.clear();
        this.mUsingDataLoaderPlayRawKey = null;
    }

    public static void cancelAllPreloadTasks() {
        TTVideoEngineLog.m256500d("TTVideoEngine", "<preload> cancel all preload task outside");
        DataLoaderHelper.getDataLoader().cancelAllTasks();
    }

    public static boolean dataLoaderIsRunning() {
        return DataLoaderHelper.getDataLoader().isRunning();
    }

    public static int getProbeIntervalMS() {
        return DataLoaderHelper.getDataLoader().getProbeIntervalMS();
    }

    public static int getProbeType() {
        return DataLoaderHelper.getDataLoader().getProbeType();
    }

    public static boolean isStrategyCenterRunning() {
        return StrategyHelper.helper().isRunning();
    }

    public static float playTaskProgress() {
        return DataLoaderHelper.getDataLoader().playTaskProgress();
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void releaseTextureRender() {
        /*
            java.lang.Class<com.ss.ttvideoengine.TTVideoEngine> r0 = com.ss.ttvideoengine.TTVideoEngine.class
            monitor-enter(r0)
            com.ss.texturerender.TextureRenderManager r1 = com.ss.texturerender.TextureRenderManager.getManager()     // Catch:{ NullPointerException -> 0x000e, all -> 0x000b }
            r1.release()     // Catch:{ NullPointerException -> 0x000e, all -> 0x000b }
            goto L_0x000e
        L_0x000b:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x000e:
            monitor-exit(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttvideoengine.TTVideoEngine.releaseTextureRender():void");
    }

    /* access modifiers changed from: package-private */
    public void _doHeartBeatThings() {
        _syncPlayInfoToMdl();
        this.mLooperThread.postEngineMessageDelay(24, this.mHeartBeatInterval);
    }

    /* access modifiers changed from: package-private */
    public boolean _doIsMute() {
        boolean z = this.mIsMute;
        MediaPlayer mediaPlayer = this.mMediaPlayer;
        if (mediaPlayer != null) {
            return mediaPlayer.isMute();
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    public void _doStart() {
        this.mShouldPlay = true;
        this.mShouldStop = false;
        this.mUserStopped = false;
        this.mAccumulatedErrorCount = 0;
        _play(true);
        this.mIsPlayComplete = false;
    }

    public int getAudioLatencytime() {
        MediaPlayer mediaPlayer = this.mMediaPlayer;
        if (mediaPlayer != null) {
            return mediaPlayer.getIntOption(567, 0);
        }
        return 0;
    }

    public String getCurrentPlayPath() {
        if (this.mIsLocal) {
            return this.mLocalURL;
        }
        return this.mURLInfo.hostURL;
    }

    public TTVNetClient getNetClientSetByUser() {
        TTVNetClient tTVNetClient = this.mNetClient;
        if (tTVNetClient != null) {
            return tTVNetClient;
        }
        if (TTVideoEngineConfig.gNetClient != null) {
            return TTVideoEngineConfig.gNetClient;
        }
        return null;
    }

    public String getPlayerSessionId() {
        IVideoEventLogger iVideoEventLogger = this.mLogger;
        if (iVideoEventLogger != null) {
            return iVideoEventLogger.getStringOption(86);
        }
        return null;
    }

    public int getVideoHeight() {
        MediaPlayer mediaPlayer = this.mMediaPlayer;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoHeight();
        }
        return 0;
    }

    public VideoModel getVideoModel() {
        IVideoModel iVideoModel = this.mVideoModel;
        if (iVideoModel instanceof VideoModel) {
            return (VideoModel) iVideoModel;
        }
        return null;
    }

    public int getVideoWidth() {
        MediaPlayer mediaPlayer = this.mMediaPlayer;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoWidth();
        }
        return 0;
    }

    public int getWatchedDuration() {
        PlayDurationManager playDurationManager = this.mPlayDuration;
        if (playDurationManager != null) {
            return playDurationManager.getPlayedDuration();
        }
        return 0;
    }

    public Bitmap saveFrame() {
        VideoSurface videoSurface = this.mTextureSurface;
        if (videoSurface == null) {
            return null;
        }
        try {
            return videoSurface.saveFrame();
        } catch (Exception unused) {
            return null;
        }
    }

    public String[] supportedQualityInfos() {
        IVideoModel iVideoModel = this.mVideoModel;
        if (iVideoModel != null) {
            return iVideoModel.getSupportQualityInfos();
        }
        return null;
    }

    public List<com.ss.ttvideoengine.model.SubInfo> supportedSubInfoList() {
        IVideoModel iVideoModel = this.mVideoModel;
        if (iVideoModel != null) {
            return iVideoModel.getSubInfoList();
        }
        return null;
    }

    public int[] supportedSubtitleLangs() {
        IVideoModel iVideoModel = this.mVideoModel;
        if (iVideoModel != null) {
            return iVideoModel.getSupportSubtitleLangs();
        }
        return null;
    }

    /* access modifiers changed from: private */
    public static class MyLoggerDataSource implements EventLoggerSource {
        private final WeakReference<TTVideoEngine> mVideoEngineRef;

        @Override // com.ss.ttvideoengine.log.EventLoggerSource
        public Map batteryInfo() {
            TTVideoEngine tTVideoEngine = this.mVideoEngineRef.get();
            if (tTVideoEngine == null || tTVideoEngine.mBatteryMonitor == null) {
                return null;
            }
            return tTVideoEngine.mBatteryMonitor.getChargingState();
        }

        @Override // com.ss.ttvideoengine.log.EventLoggerSource
        public ArrayList forebackSwitchList() {
            TTVideoEngine tTVideoEngine = this.mVideoEngineRef.get();
            if (tTVideoEngine == null || tTVideoEngine.mVideoEngineGetInfoListener == null) {
                return null;
            }
            return (ArrayList) tTVideoEngine.mVideoEngineGetInfoListener.getInfo(2);
        }

        @Override // com.ss.ttvideoengine.log.EventLoggerSource
        public String getMediaLoaderInfo() {
            TTVideoEngine tTVideoEngine = this.mVideoEngineRef.get();
            if (tTVideoEngine != null && tTVideoEngine.mDataLoaderEnable != 0) {
                return DataLoaderHelper.getDataLoader().getPlayLog(tTVideoEngine.mTraceId);
            }
            TTVideoEngineLog.m256503e("TTVideoEngine", "videoEngine is:" + tTVideoEngine + ", dataloader enable:" + tTVideoEngine.mDataLoaderEnable);
            return null;
        }

        @Override // com.ss.ttvideoengine.log.EventLoggerSource
        public Map bytesInfo() {
            MediaPlayer mediaPlayer;
            TTVideoEngine tTVideoEngine = this.mVideoEngineRef.get();
            if (tTVideoEngine == null || (mediaPlayer = tTVideoEngine.mMediaPlayer) == null) {
                return null;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("vds", Long.valueOf(mediaPlayer.getLongOption(45, 0)));
            hashMap.put("vps", Long.valueOf(mediaPlayer.getLongOption(46, 0)));
            hashMap.put("download_speed", Long.valueOf(mediaPlayer.getLongOption(63, -1)));
            hashMap.put("vlen", Long.valueOf(mediaPlayer.getLongOption(72, 0)));
            hashMap.put("alen", Long.valueOf(mediaPlayer.getLongOption(73, 0)));
            hashMap.put("vDecLen", Long.valueOf(mediaPlayer.getLongOption(602, 0)));
            hashMap.put("aDecLen", Long.valueOf(mediaPlayer.getLongOption(603, 0)));
            hashMap.put("vBaseLen", Long.valueOf(mediaPlayer.getLongOption(604, 0)));
            hashMap.put("aBaseLen", Long.valueOf(mediaPlayer.getLongOption(605, 0)));
            hashMap.put("avGap", Long.valueOf(mediaPlayer.getLongOption(606, -1)));
            hashMap.put("single_vds", Long.valueOf(mediaPlayer.getLongOption(SmEvents.EVENT_UA_ERROR, 0)));
            return hashMap;
        }

        @Override // com.ss.ttvideoengine.log.EventLoggerSource
        public Map versionInfo() {
            TTVideoEngine tTVideoEngine = this.mVideoEngineRef.get();
            if (tTVideoEngine == null) {
                return null;
            }
            HashMap hashMap = new HashMap();
            String value = TTPlayerConfiger.getValue(14, "");
            if (tTVideoEngine.mPlayerType == 0 || tTVideoEngine.mPlayerType == 1) {
                hashMap.put("sv", "5.6");
                hashMap.put("pv", "3.0");
                hashMap.put("pc", value);
                hashMap.put("sdk_version", BuildConfig.VERSION_NAME);
            } else if (tTVideoEngine.mPlayerType == 2) {
                hashMap.put("sv", "5.6");
                hashMap.put("pv", "1.0");
                hashMap.put("pc", "0");
                hashMap.put("sdk_version", BuildConfig.VERSION_NAME);
            } else if (tTVideoEngine.mPlayerType == 5) {
                hashMap.put("sv", "5.6");
                hashMap.put("pv", "5.0");
                hashMap.put("pc", "5");
                hashMap.put("sdk_version", BuildConfig.VERSION_NAME);
            } else {
                hashMap.put("sv", "5.6");
                hashMap.put("pv", "4.0");
                hashMap.put("pc", value);
                hashMap.put("sdk_version", BuildConfig.VERSION_NAME);
            }
            hashMap.put("trv", TextureRenderConfig.getValue(24));
            try {
                hashMap.put("ffv", (String) Class.forName("com.ss.ttffmpeg.FFmpegLibLoaderWrapper").getMethod("getFFmpegVersion", new Class[0]).invoke(null, new Object[0]));
            } catch (Throwable th) {
                TTVideoEngineLog.m256508w("TTVideoEngine", "get ffmpeg version error: " + th.toString());
            }
            return hashMap;
        }

        public MyLoggerDataSource(TTVideoEngine tTVideoEngine) {
            this.mVideoEngineRef = new WeakReference<>(tTVideoEngine);
        }

        @Override // com.ss.ttvideoengine.log.EventLoggerSource
        public float getLogValueFloat(int i) {
            TTVideoEngine tTVideoEngine = this.mVideoEngineRef.get();
            if (tTVideoEngine == null || tTVideoEngine.mMediaPlayer == null) {
                return BitmapDescriptorFactory.HUE_RED;
            }
            if (i == 82) {
                return tTVideoEngine.mMediaPlayer.getFloatOption(151, BitmapDescriptorFactory.HUE_RED);
            }
            if (i != 83) {
                return BitmapDescriptorFactory.HUE_RED;
            }
            return tTVideoEngine.mMediaPlayer.getFloatOption(150, BitmapDescriptorFactory.HUE_RED);
        }

        @Override // com.ss.ttvideoengine.log.EventLoggerSource
        public long getLogValueLong(int i) {
            TTVideoEngine tTVideoEngine = this.mVideoEngineRef.get();
            if (tTVideoEngine == null || tTVideoEngine.mMediaPlayer == null) {
                return 0;
            }
            if (i == 7) {
                return tTVideoEngine.mMediaPlayer.getLongOption(68, 0);
            }
            if (i == 45) {
                return tTVideoEngine.mMediaPlayer.getLongOption(152, -1);
            }
            if (i == 66) {
                return tTVideoEngine.mMediaPlayer.getLongOption(517, -1);
            }
            if (i == 68) {
                return tTVideoEngine.mMediaPlayer.getLongOption(72, -1);
            }
            if (i == 75) {
                return tTVideoEngine.mMediaPlayer.getLongOption(171, -1);
            }
            if (i != 95) {
                if (i == 96) {
                    return tTVideoEngine.mMediaPlayer.getLongOption(526, -1);
                }
                switch (i) {
                    case 10:
                        return tTVideoEngine.mMediaPlayer.getLongOption(69, 0);
                    case 11:
                        return tTVideoEngine.mMediaPlayer.getLongOption(70, 0);
                    case HwBuildEx.VersionCodes.EMUI_5_1:
                        return tTVideoEngine.mMediaPlayer.getLongOption(75, 0);
                    case 13:
                        return tTVideoEngine.mMediaPlayer.getLongOption(76, 0);
                    case 14:
                        return tTVideoEngine.mMediaPlayer.getLongOption(77, 0);
                    case 15:
                        return tTVideoEngine.mMediaPlayer.getLongOption(78, 0);
                    case 16:
                        return tTVideoEngine.mMediaPlayer.getLongOption(156, -1);
                    case 17:
                        return tTVideoEngine.mMediaPlayer.getLongOption(155, -1);
                    case 18:
                        return tTVideoEngine.mMediaPlayer.getLongOption(163, -1);
                    case 19:
                        return tTVideoEngine.mMediaPlayer.getLongOption(162, -1);
                    default:
                        switch (i) {
                            case 38:
                                return tTVideoEngine.mMediaPlayer.getLongOption(307, -1);
                            case 39:
                                return tTVideoEngine.mMediaPlayer.getLongOption(308, -1);
                            case 40:
                                return tTVideoEngine.mPlayTime;
                            case 41:
                                return tTVideoEngine.mVVTime;
                            default:
                                switch (i) {
                                    case 51:
                                        return tTVideoEngine.mMediaPlayer.getLongOption(267, 0);
                                    case 52:
                                        return tTVideoEngine.mMediaPlayer.getLongOption(268, 0);
                                    case 53:
                                        return tTVideoEngine.mMediaPlayer.getLongOption(269, 0);
                                    case 54:
                                        return tTVideoEngine.mMediaPlayer.getLongOption(606, -1);
                                    default:
                                        switch (i) {
                                            case 56:
                                                return tTVideoEngine.mMediaPlayer.getLongOption(45, -1);
                                            case 57:
                                                return tTVideoEngine.mMediaPlayer.getLongOption(607, -1);
                                            case 58:
                                                return tTVideoEngine.mMediaPlayer.getLongOption(608, -1);
                                            default:
                                                switch (i) {
                                                    case 70:
                                                        return tTVideoEngine.mMediaPlayer.getLongOption(636, -1);
                                                    case 71:
                                                        return tTVideoEngine.mMediaPlayer.getLongOption(637, -1);
                                                    case 72:
                                                        return tTVideoEngine.mMediaPlayer.getLongOption(638, -1);
                                                    case 73:
                                                        return tTVideoEngine.mMediaPlayer.getLongOption(639, -1);
                                                    default:
                                                        switch (i) {
                                                            case 91:
                                                                return tTVideoEngine.mLastSwitchRadioModeTime;
                                                            case 92:
                                                                return tTVideoEngine.mLastSwitchResolutionTime;
                                                            case 93:
                                                                if (tTVideoEngine.mHeadsetMonitor == null) {
                                                                    return 0;
                                                                }
                                                                return tTVideoEngine.mHeadsetMonitor.getLastSwitchTime();
                                                            default:
                                                                return 0;
                                                        }
                                                }
                                        }
                                }
                        }
                }
            } else if (tTVideoEngine.mVideoEngineGetInfoListener == null) {
                return -1;
            } else {
                return ((Long) tTVideoEngine.mVideoEngineGetInfoListener.getInfo(3)).longValue();
            }
        }

        /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
        @Override // com.ss.ttvideoengine.log.EventLoggerSource
        public String getLogValueStr(int i) {
            TTVideoEngine tTVideoEngine = this.mVideoEngineRef.get();
            if (tTVideoEngine == null) {
                return "";
            }
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        MediaPlayer mediaPlayer = tTVideoEngine.mMediaPlayer;
                        if (mediaPlayer != null) {
                            return mediaPlayer.getStringOption(5002);
                        }
                    } else if (i == 3) {
                        return tTVideoEngine.mAPIString;
                    } else {
                        if (i != 4) {
                            if (i != 5) {
                                if (i != 20) {
                                    if (i == 29) {
                                        return tTVideoEngine.mAuthorization;
                                    }
                                    if (i == 37) {
                                        return DataLoaderHelper.getDataLoader().getStringValue(6);
                                    }
                                    if (i != 46) {
                                        if (i != 55) {
                                            if (i != 65) {
                                                if (i != 76) {
                                                    if (i != 78) {
                                                        if (i != 80) {
                                                            switch (i) {
                                                                case TTVideoEngine.PLAYER_OPTION_ENABLE_PLAYER3_HARDWARE_DECODE /*{ENCODED_INT: 31}*/:
                                                                    try {
                                                                        return Build.BOARD;
                                                                    } catch (Exception e) {
                                                                        TTVideoEngineLog.m256501d(e);
                                                                        return "";
                                                                    }
                                                                case 32:
                                                                    try {
                                                                        return Build.HARDWARE;
                                                                    } catch (Exception e2) {
                                                                        TTVideoEngineLog.m256501d(e2);
                                                                        return "";
                                                                    }
                                                                case 33:
                                                                    if (tTVideoEngine.mMediaPlayer != null) {
                                                                        return tTVideoEngine.mMediaPlayer.getStringOption(LocationRequest.PRIORITY_HD_ACCURACY);
                                                                    }
                                                                    break;
                                                            }
                                                        } else if (tTVideoEngine.mMediaPlayer != null) {
                                                            return tTVideoEngine.mMediaPlayer.getStringOption(824);
                                                        }
                                                    } else if (tTVideoEngine.mMediaPlayer != null) {
                                                        return tTVideoEngine.mMediaPlayer.getStringOption(825);
                                                    }
                                                } else if (tTVideoEngine.currentVideoInfo != null) {
                                                    return tTVideoEngine.currentVideoInfo.getValueStr(7);
                                                } else {
                                                    return "";
                                                }
                                            } else if (tTVideoEngine.mMediaPlayer != null) {
                                                return tTVideoEngine.mMediaPlayer.getStringOption(516);
                                            }
                                        } else if (tTVideoEngine.mMediaPlayer != null) {
                                            return tTVideoEngine.mMediaPlayer.getStringOption(609);
                                        }
                                    } else if (tTVideoEngine.mLogger != null) {
                                        return tTVideoEngine.mLogger.getExtraInfo();
                                    } else {
                                        return "";
                                    }
                                } else if (tTVideoEngine.curP2PUrlInfo != null) {
                                    return VideoLoadWrapper.getInstance().getLoadInfo(tTVideoEngine.curP2PUrlInfo.mUrl);
                                }
                            } else if (tTVideoEngine.mMediaPlayer != null) {
                                return tTVideoEngine.mMediaPlayer.getStringOption(71);
                            }
                        } else if (tTVideoEngine.getNetClientSetByUser() == null) {
                            return "own";
                        } else {
                            return "user";
                        }
                    }
                } else if (tTVideoEngine.mMediaPlayer != null) {
                    int intOption = tTVideoEngine.mMediaPlayer.getIntOption(139, -1);
                    if (intOption == 0) {
                        return "opengl";
                    }
                    if (intOption != 1) {
                        return "";
                    }
                    return "nativewindow";
                }
            } else if (tTVideoEngine.mMediaPlayer != null) {
                int i2 = tTVideoEngine.mVideoCodecID;
                if (i2 < 0) {
                    i2 = tTVideoEngine.mMediaPlayer.getIntOption(SmActions.ACTION_IDLE_ENTRY, -1);
                }
                if (i2 == 0) {
                    return "h264";
                }
                if (i2 == 1) {
                    return "bytevc1";
                }
                if (i2 == 33) {
                    return "bytevc2";
                }
            }
            return "";
        }

        @Override // com.ss.ttvideoengine.log.EventLoggerSource
        public int getLogValueInt(int i) {
            TTVideoEngine tTVideoEngine = this.mVideoEngineRef.get();
            if (tTVideoEngine == null) {
                return 0;
            }
            if (i == 30) {
                return tTVideoEngine.mPlayAPIVersion;
            }
            if (i != 61) {
                if (i != 67) {
                    if (i != 69) {
                        if (i == 74) {
                            return TTNetWorkListener.getInstance().getNetworkRTTLevel();
                        }
                        if (i != 77) {
                            if (i != 79) {
                                if (i != 81) {
                                    if (i != 94) {
                                        if (i == 48) {
                                            P2PStragetyManager.getInstance().setLeaveWaitTime(tTVideoEngine.mLogger.getLeaveWaitTime());
                                            return 0;
                                        } else if (i != 49) {
                                            if (i != 63) {
                                                if (i != 64) {
                                                    if (i != 84) {
                                                        if (i == 85) {
                                                            return TTVideoEngine.sDNSCustomType;
                                                        }
                                                        switch (i) {
                                                            case 21:
                                                                return tTVideoEngine.mPlaybackState;
                                                            case 22:
                                                                return tTVideoEngine.mLoadState;
                                                            case 23:
                                                                return tTVideoEngine.mState;
                                                            case 24:
                                                                if (tTVideoEngine.mMediaPlayer == null) {
                                                                    return 0;
                                                                }
                                                                if (tTVideoEngine.mVideoCodecType < 0) {
                                                                    tTVideoEngine.mVideoCodecType = tTVideoEngine.mMediaPlayer.getIntOption(157, -1);
                                                                }
                                                                return tTVideoEngine.mVideoCodecType;
                                                            case AvailableCode.ERROR_ON_ACTIVITY_RESULT:
                                                                if (tTVideoEngine.mMediaPlayer == null) {
                                                                    return 0;
                                                                }
                                                                if (tTVideoEngine.mAudioCodecType < 0) {
                                                                    tTVideoEngine.mAudioCodecType = tTVideoEngine.mMediaPlayer.getIntOption(158, -1);
                                                                }
                                                                return tTVideoEngine.mAudioCodecType;
                                                            case 26:
                                                                return (int) tTVideoEngine.getVolume();
                                                            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP:
                                                                if (tTVideoEngine.mMediaPlayer == null) {
                                                                    return -1;
                                                                }
                                                                if (tTVideoEngine.mMediaPlayer.isMute()) {
                                                                    return 1;
                                                                }
                                                                return 0;
                                                            default:
                                                                switch (i) {
                                                                    case 34:
                                                                        return tTVideoEngine.mMovPreferNearestSample;
                                                                    case 35:
                                                                        return tTVideoEngine.mNetworkTimeout;
                                                                    case 36:
                                                                        return tTVideoEngine.mIsDisableShortSeek;
                                                                    default:
                                                                        switch (i) {
                                                                            case 42:
                                                                                if (tTVideoEngine.mMediaPlayer == null) {
                                                                                    return 0;
                                                                                }
                                                                                return tTVideoEngine.mMediaPlayer.getIntOption(221, -1);
                                                                            case 43:
                                                                                if (tTVideoEngine.mMediaPlayer == null) {
                                                                                    return 0;
                                                                                }
                                                                                return tTVideoEngine.mMediaPlayer.getIntOption(222, -1);
                                                                            case 44:
                                                                                if (tTVideoEngine.mMediaPlayer == null) {
                                                                                    return 0;
                                                                                }
                                                                                return tTVideoEngine.mMediaPlayer.getIntOption(245, -1);
                                                                            default:
                                                                                switch (i) {
                                                                                    case 87:
                                                                                        if (tTVideoEngine.mSurface == null) {
                                                                                            return 1;
                                                                                        }
                                                                                        return 0;
                                                                                    case 88:
                                                                                        return tTVideoEngine.mRadioModeEnable;
                                                                                    case 89:
                                                                                        if (tTVideoEngine.mHeadsetMonitor != null) {
                                                                                            return tTVideoEngine.mHeadsetMonitor.isWiredConnected() ? 1 : 0;
                                                                                        }
                                                                                        return 0;
                                                                                    case CameraPosition.TILT_90:
                                                                                        if (tTVideoEngine.mHeadsetMonitor != null) {
                                                                                            return tTVideoEngine.mHeadsetMonitor.isWirelessConnected() ? 1 : 0;
                                                                                        }
                                                                                        return 0;
                                                                                    default:
                                                                                        switch (i) {
                                                                                            case 97:
                                                                                                if (tTVideoEngine.mMediaPlayer != null) {
                                                                                                    return tTVideoEngine.mMediaPlayer.getIntOption(463, -1);
                                                                                                }
                                                                                                return -1;
                                                                                            case 98:
                                                                                                if (tTVideoEngine.mMediaPlayer != null) {
                                                                                                    return tTVideoEngine.mMediaPlayer.getIntOption(464, -1);
                                                                                                }
                                                                                                return -1;
                                                                                            case SmEvents.EVENT_UE:
                                                                                                return TTNetWorkListener.getInstance().getNetworkRTTMS();
                                                                                            case 100:
                                                                                                return tTVideoEngine.mTextureRenderError;
                                                                                            case 101:
                                                                                                return tTVideoEngine.isplaybackUsedSR() ? 1 : 0;
                                                                                            default:
                                                                                                return 0;
                                                                                        }
                                                                                }
                                                                        }
                                                                }
                                                        }
                                                    } else if (tTVideoEngine.mMediaPlayer != null) {
                                                        return tTVideoEngine.mMediaPlayer.getIntOption(186, -1);
                                                    } else {
                                                        return -1;
                                                    }
                                                } else if (tTVideoEngine.mAudioCodecProfile != -1) {
                                                    return tTVideoEngine.mAudioCodecProfile;
                                                } else {
                                                    if (tTVideoEngine.mMediaPlayer != null) {
                                                        tTVideoEngine.mAudioCodecProfile = tTVideoEngine.mMediaPlayer.getIntOption(402, -1);
                                                    }
                                                    return tTVideoEngine.mAudioCodecProfile;
                                                }
                                            } else if (tTVideoEngine.mVideoCodecProfile != -1) {
                                                return tTVideoEngine.mVideoCodecProfile;
                                            } else {
                                                if (tTVideoEngine.mMediaPlayer != null) {
                                                    tTVideoEngine.mVideoCodecProfile = tTVideoEngine.mMediaPlayer.getIntOption(403, -1);
                                                }
                                                return tTVideoEngine.mVideoCodecProfile;
                                            }
                                        } else if (tTVideoEngine.mMediaPlayer == null) {
                                            return 0;
                                        } else {
                                            return tTVideoEngine.mMediaPlayer.getIntOption(44, -1);
                                        }
                                    } else if (tTVideoEngine.mVideoEngineGetInfoListener == null) {
                                        return Integer.MIN_VALUE;
                                    } else {
                                        return ((Integer) tTVideoEngine.mVideoEngineGetInfoListener.getInfo(1)).intValue();
                                    }
                                } else if (tTVideoEngine.mMediaPlayer == null) {
                                    return 0;
                                } else {
                                    return tTVideoEngine.mMediaPlayer.getIntOption(643, -1);
                                }
                            } else if (tTVideoEngine.mMediaPlayer != null) {
                                return tTVideoEngine.mMediaPlayer.getIntOption(826, -1);
                            } else {
                                return -1;
                            }
                        } else if (tTVideoEngine.mMediaPlayer != null) {
                            return tTVideoEngine.mMediaPlayer.getIntOption(540, -1);
                        } else {
                            return -1;
                        }
                    } else if (tTVideoEngine.mMediaPlayer != null) {
                        return tTVideoEngine.mMediaPlayer.getIntOption(601, -1);
                    } else {
                        return -1;
                    }
                } else if (tTVideoEngine.mCurPosition > 0) {
                    return tTVideoEngine.mCurPosition;
                } else {
                    if (tTVideoEngine.mMediaPlayer != null) {
                        return tTVideoEngine.mMediaPlayer.getCurrentPosition();
                    }
                    return -1;
                }
            } else if (tTVideoEngine.mMediaPlayer != null) {
                return tTVideoEngine.mMediaPlayer.getIntOption(53, -1);
            } else {
                return -1;
            }
        }

        @Override // com.ss.ttvideoengine.log.EventLoggerSource
        public void onInfo(int i, Map map) {
            TTVideoEngine tTVideoEngine = this.mVideoEngineRef.get();
            switch (i) {
                case 0:
                    if (tTVideoEngine != null && tTVideoEngine.mVideoEngineInfoListener != null) {
                        VideoEngineInfos videoEngineInfos = new VideoEngineInfos();
                        videoEngineInfos.setKey("bufferStartInfos");
                        videoEngineInfos.setObject(map);
                        if (tTVideoEngine.mLooperThread.checkSendMainLooper()) {
                            tTVideoEngine.mLooperThread.postEngineMessage(TTVideoEngine.PLAYER_OPTION_USE_AJ_MEDIACODEC, 0, 0, videoEngineInfos);
                            return;
                        } else if (tTVideoEngine.mVideoEngineInfoListener != null) {
                            tTVideoEngine.mVideoEngineInfoListener.onVideoEngineInfos(videoEngineInfos);
                            return;
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                case 1:
                    if (tTVideoEngine != null && tTVideoEngine.mVideoEngineInfoListener != null) {
                        VideoEngineInfos videoEngineInfos2 = new VideoEngineInfos();
                        videoEngineInfos2.setKey("bufferEndInfos");
                        videoEngineInfos2.setObject(map);
                        if (tTVideoEngine.mLooperThread.checkSendMainLooper()) {
                            tTVideoEngine.mLooperThread.postEngineMessage(TTVideoEngine.PLAYER_OPTION_USE_AJ_MEDIACODEC, 0, 0, videoEngineInfos2);
                            return;
                        } else if (tTVideoEngine.mVideoEngineInfoListener != null) {
                            tTVideoEngine.mVideoEngineInfoListener.onVideoEngineInfos(videoEngineInfos2);
                            return;
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                case 2:
                    if (tTVideoEngine != null && tTVideoEngine.mVideoEngineInfoListener != null) {
                        JSONObject jSONObject = new JSONObject(map);
                        VideoEngineInfos videoEngineInfos3 = new VideoEngineInfos();
                        videoEngineInfos3.setKey("firstframe_split");
                        videoEngineInfos3.setObject(jSONObject);
                        videoEngineInfos3.setGroupID(tTVideoEngine.mGroupID);
                        if (tTVideoEngine.mLooperThread.checkSendMainLooper()) {
                            tTVideoEngine.mLooperThread.postMainLooperMessage(TTVideoEngine.PLAYER_OPTION_USE_AJ_MEDIACODEC, 0, 0, videoEngineInfos3);
                            return;
                        } else {
                            tTVideoEngine.mVideoEngineInfoListener.onVideoEngineInfos(videoEngineInfos3);
                            return;
                        }
                    } else {
                        return;
                    }
                case 3:
                    if (tTVideoEngine != null && tTVideoEngine.mVideoEngineInfoListener != null) {
                        VideoEngineInfos videoEngineInfos4 = new VideoEngineInfos();
                        videoEngineInfos4.setKey("outsyncStartInfos");
                        videoEngineInfos4.setObject(map);
                        if (tTVideoEngine.mLooperThread.checkSendMainLooper()) {
                            tTVideoEngine.mLooperThread.postEngineMessage(TTVideoEngine.PLAYER_OPTION_USE_AJ_MEDIACODEC, 0, 0, videoEngineInfos4);
                            return;
                        } else if (tTVideoEngine.mVideoEngineInfoListener != null) {
                            tTVideoEngine.mVideoEngineInfoListener.onVideoEngineInfos(videoEngineInfos4);
                            return;
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                case 4:
                    if (tTVideoEngine != null && tTVideoEngine.mVideoEngineInfoListener != null) {
                        VideoEngineInfos videoEngineInfos5 = new VideoEngineInfos();
                        videoEngineInfos5.setKey("outsyncEndInfos");
                        videoEngineInfos5.setObject(map);
                        if (tTVideoEngine.mLooperThread.checkSendMainLooper()) {
                            tTVideoEngine.mLooperThread.postEngineMessage(TTVideoEngine.PLAYER_OPTION_USE_AJ_MEDIACODEC, 0, 0, videoEngineInfos5);
                            return;
                        } else if (tTVideoEngine.mVideoEngineInfoListener != null) {
                            tTVideoEngine.mVideoEngineInfoListener.onVideoEngineInfos(videoEngineInfos5);
                            return;
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                case 5:
                    if (tTVideoEngine != null && tTVideoEngine.mVideoEngineInfoListener != null) {
                        VideoEngineInfos videoEngineInfos6 = new VideoEngineInfos();
                        videoEngineInfos6.setKey("noRenderStartInfos");
                        videoEngineInfos6.setObject(map);
                        if (tTVideoEngine.mLooperThread.checkSendMainLooper()) {
                            tTVideoEngine.mLooperThread.postEngineMessage(TTVideoEngine.PLAYER_OPTION_USE_AJ_MEDIACODEC, 0, 0, videoEngineInfos6);
                            return;
                        } else if (tTVideoEngine.mVideoEngineInfoListener != null) {
                            tTVideoEngine.mVideoEngineInfoListener.onVideoEngineInfos(videoEngineInfos6);
                            return;
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                case 6:
                    if (tTVideoEngine != null && tTVideoEngine.mVideoEngineInfoListener != null) {
                        VideoEngineInfos videoEngineInfos7 = new VideoEngineInfos();
                        videoEngineInfos7.setKey("noRenderEndInfos");
                        videoEngineInfos7.setObject(map);
                        if (tTVideoEngine.mLooperThread.checkSendMainLooper()) {
                            tTVideoEngine.mLooperThread.postEngineMessage(TTVideoEngine.PLAYER_OPTION_USE_AJ_MEDIACODEC, 0, 0, videoEngineInfos7);
                            return;
                        } else if (tTVideoEngine.mVideoEngineInfoListener != null) {
                            tTVideoEngine.mVideoEngineInfoListener.onVideoEngineInfos(videoEngineInfos7);
                            return;
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                default:
                    return;
            }
        }
    }

    /* access modifiers changed from: private */
    public static class MyReleaseRunnable implements Runnable {
        private MediaPlayer mPlayer;

        public void run() {
            if (this.mPlayer != null) {
                try {
                    TTVideoEngineLog.m256505i("TTVideoEngine", "MyReleaseRunnable release");
                    this.mPlayer.release();
                    this.mPlayer = null;
                } catch (Exception e) {
                    TTVideoEngineLog.m256503e("TTVideoEngine", e.toString());
                }
            }
        }

        public MyReleaseRunnable(MediaPlayer mediaPlayer) {
            this.mPlayer = mediaPlayer;
        }
    }

    private void _clearSurface() {
        Surface surface;
        if (this.mClearShutDown) {
            SurfaceHolder surfaceHolder = this.mSurfaceHolder;
            if (surfaceHolder != null) {
                surface = surfaceHolder.getSurface();
            } else {
                surface = this.mSurface;
            }
            clearSurface(surface, false);
        }
    }

    private void _initUsingHandle() {
        if (this.mHandler == null) {
            this.mHandler = new Handler(TTHelper.getLooper()) {
                /* class com.ss.ttvideoengine.TTVideoEngine.HandlerC654328 */

                public void handleMessage(Message message) {
                    super.handleMessage(message);
                    if (message.what == 10) {
                        String str = (String) message.obj;
                        long j = (long) message.arg1;
                        String str2 = TTVideoEngine.this.mBashDashDefaultMDLKeys.get("video");
                        String str3 = TTVideoEngine.this.mBashDashDefaultMDLKeys.get("audio");
                        if (TTVideoEngine.this.mState != 5) {
                            if (TextUtils.isEmpty(str3) || !str3.equals(str)) {
                                if (!TextUtils.isEmpty(str2) && str2.equals(str) && TTVideoEngine.this.mLogger != null) {
                                    TTVideoEngine.this.mLogger.setDashVideoCacheSize(j);
                                }
                            } else if (TTVideoEngine.this.mLogger != null) {
                                TTVideoEngine.this.mLogger.setDashAudioCacheSize(j);
                            }
                            String str4 = "";
                            if (TTVideoEngine.this.mUsingDataLoaderPlayFilePaths != null && TTVideoEngine.this.mUsingDataLoaderPlayFilePaths.contains(str)) {
                                TTVideoEngine.this.mVideoPreloadSize += j;
                                if (TTVideoEngine.this.mLogger != null) {
                                    TTVideoEngine.this.mLogger.setVideoCacheSize(TTVideoEngine.this.mVideoPreloadSize);
                                }
                                StringBuilder sb = new StringBuilder();
                                sb.append("using mdl cache, key :");
                                sb.append(str);
                                sb.append(" size = ");
                                sb.append(j);
                                sb.append(" vid = ");
                                if (!TextUtils.isEmpty(TTVideoEngine.this.mVideoID)) {
                                    str4 = TTVideoEngine.this.mVideoID;
                                }
                                sb.append(str4);
                                TTVideoEngineLog.m256505i("TTVideoEngine", sb.toString());
                                if ((TTVideoEngine.this.mBashDashDefaultMDLKeys.size() < 2 || (TTVideoEngine.this.mBashDashDefaultMDLKeys.size() >= 2 && TTVideoEngine.this.mBashDashDefaultMDLKeys.values().contains(str))) && TTVideoEngine.this.mVideoEngineInfoListener != null) {
                                    VideoEngineInfos videoEngineInfos = new VideoEngineInfos();
                                    videoEngineInfos.setKey("mdlfilepathhitcachesize");
                                    videoEngineInfos.mUsingMDLPlayFilePath = str;
                                    videoEngineInfos.mHitCacheSize = j;
                                    if (TTVideoEngine.this.mLooperThread.checkSendMainLooper()) {
                                        TTVideoEngine.this.mLooperThread.postMainLooperMessage(TTVideoEngine.PLAYER_OPTION_USE_AJ_MEDIACODEC, 0, 0, videoEngineInfos);
                                    } else {
                                        TTVideoEngine.this.mVideoEngineInfoListener.onVideoEngineInfos(videoEngineInfos);
                                    }
                                }
                            } else if (TTVideoEngine.this.mUsingDataLoaderPlayTaskKeys != null && TTVideoEngine.this.mUsingDataLoaderPlayTaskKeys.contains(str)) {
                                TTVideoEngine.this.mVideoPreloadSize += j;
                                if (TTVideoEngine.this.mLogger != null) {
                                    TTVideoEngine.this.mLogger.setVideoCacheSize(TTVideoEngine.this.mVideoPreloadSize);
                                }
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("using mdl cache, key :");
                                sb2.append(str);
                                sb2.append(" size = ");
                                sb2.append(j);
                                sb2.append(" vid = ");
                                if (!TextUtils.isEmpty(TTVideoEngine.this.mVideoID)) {
                                    str4 = TTVideoEngine.this.mVideoID;
                                }
                                sb2.append(str4);
                                TTVideoEngineLog.m256505i("TTVideoEngine", sb2.toString());
                                if ((TTVideoEngine.this.mBashDashDefaultMDLKeys.size() < 2 || TTVideoEngine.this.mBashDashDefaultMDLKeys.values().contains(str)) && TTVideoEngine.this.mVideoEngineInfoListener != null) {
                                    VideoEngineInfos videoEngineInfos2 = new VideoEngineInfos();
                                    videoEngineInfos2.setKey("mdlhitcachesize");
                                    videoEngineInfos2.mUsingMDLPlayTaskKey = str;
                                    videoEngineInfos2.mHitCacheSize = j;
                                    if (TTVideoEngine.this.mLooperThread.checkSendMainLooper()) {
                                        TTVideoEngine.this.mLooperThread.postMainLooperMessage(TTVideoEngine.PLAYER_OPTION_USE_AJ_MEDIACODEC, 0, 0, videoEngineInfos2);
                                    } else {
                                        TTVideoEngine.this.mVideoEngineInfoListener.onVideoEngineInfos(videoEngineInfos2);
                                    }
                                }
                            }
                        }
                    }
                }
            };
        }
    }

    private boolean _shouldPrepare() {
        int i = this.mPlaybackState;
        if ((i == 0 || i == 3) && !this.mPrepared) {
            return true;
        }
        MediaPlayer mediaPlayer = this.mMediaPlayer;
        if (mediaPlayer == null || mediaPlayer.getPlayerType() != 0 || this.mPrepared) {
            return false;
        }
        return true;
    }

    private void createCacheFileDirectory() {
        File file = new File(this.mDefaultCacheDir);
        if (!file.exists()) {
            file.mkdirs();
        }
    }

    private int getBufferStartAction() {
        boolean z = this.mSeeking;
        if (!z || !this.mResolutionSwitching) {
            if (z) {
                return 1;
            }
            if (this.mResolutionSwitching) {
                return 2;
            }
            return 0;
        } else if (this.mSeekingStartTime > this.mResolutionSwitchingStartTime) {
            return 1;
        } else {
            return 2;
        }
    }

    public static void setPredictorDataLoaderListener() {
        DataLoaderHelper.getDataLoader().setListener(new TTDataLoaderDefaultListener(StrategyCenter.sNetSpeedPredictor, dataLoaderListener));
    }

    /* access modifiers changed from: package-private */
    public int _doGetCurrentPlaybackTime() {
        int i;
        if (this.mSeamSwitchingResolution || this.mSeeking) {
            i = this.mLastPlaybackTime;
        } else {
            i = _getPlayerTime();
        }
        _updateCurrentInfoToMDL(i);
        return i;
    }

    /* access modifiers changed from: package-private */
    public boolean _doIsSystemPlayer() {
        MediaPlayer mediaPlayer = this.mMediaPlayer;
        if (mediaPlayer == null) {
            int i = this.mPlayerType;
            if (i == 2 || i == 5) {
                return true;
            }
            return false;
        } else if (mediaPlayer.isOSPlayer() || mediaPlayer.getPlayerType() == 5) {
            return true;
        } else {
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public void _doPause() {
        this.mShouldPlay = false;
        this.mLogger.pause();
        _pause();
        this.mPauseStartT = SystemClock.elapsedRealtime();
        PlayDurationManager playDurationManager = this.mPlayDuration;
        if (playDurationManager != null) {
            playDurationManager.stop();
        }
    }

    public synchronized void createPlayer() {
        if (this.mAsyncPlayer == null) {
            this.mAsyncPlayer = _createPlayer(null);
        }
    }

    public int getCurrentPlaybackTimeAsync() {
        if (this.mPlayerType == 2 || this.mPosUpdateInterval <= 0) {
            return getCurrentPlaybackTime();
        }
        return this.mCurPosition;
    }

    public float getMaxVolume() {
        int i;
        Context context = this.mContext;
        if (context == null) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        int i2 = 0;
        if (audioManager != null) {
            i = audioManager.getStreamMaxVolume(3);
        } else {
            i = 0;
        }
        if (i >= 0) {
            i2 = i;
        }
        return (float) i2;
    }

    public boolean isInHousePlayer() {
        if (isPlayerType(1) || isPlayerType(2) || isPlayerType(3) || isPlayerType(4)) {
            return true;
        }
        return false;
    }

    public void pauseByInterruption() {
        TTVideoEngineLog.m256505i("TTVideoEngine", "pause by interruption");
        if (this.mLooperThread.checkEngineLooperThread(false)) {
            this.mLooperThread.postEngineMessage(11);
        } else {
            _pauseByInterruption();
        }
    }

    public void start() {
        TTVideoEngineLog.m256505i("TTVideoEngine", "start");
        if (this.mLooperThread.checkEngineLooperThread(false)) {
            this.mLooperThread.postEngineMessage(23);
        } else {
            _doStart();
        }
    }

    public Resolution[] supportedResolutionTypes() {
        TTAVPreloaderItem tTAVPreloaderItem;
        if (this.mIsPreloaderItem && (tTAVPreloaderItem = this.mPreloaderItem) != null) {
            return tTAVPreloaderItem.supportResolutions();
        }
        IVideoModel iVideoModel = this.mVideoModel;
        if (iVideoModel != null) {
            return iVideoModel.getSupportResolutions();
        }
        return new Resolution[0];
    }

    private void _configNativeRenderRotationAdapt() {
        this.mNativeRenderRotationAdapt = SettingsHelper.helper().getVodInt("native_render_rotation_adapt", this.mNativeRenderRotationAdapt);
        TTVideoEngineLog.m256505i("TTVideoEngine", "native render rotation adapt: " + this.mNativeRenderRotationAdapt);
    }

    private void _configNativeYV12Render() {
        this.mEnableNativeYV12Render = SettingsHelper.helper().getVodInt("native_yv12_render", this.mEnableNativeYV12Render);
        TTVideoEngineLog.m256505i("TTVideoEngine", "enabled native YV12: " + this.mEnableNativeYV12Render);
    }

    private void _dataLoaderRemoveEngineRef() {
        DataLoaderHelper.getDataLoader()._removeEngine(this, this.mUsingDataLoaderPlayRawKey);
        if (this.mUsingDataLoaderPlayTaskKeys != null) {
            for (int i = 0; i < this.mUsingDataLoaderPlayTaskKeys.size(); i++) {
                DataLoaderHelper.getDataLoader()._removePlayTask(this.mUsingDataLoaderPlayTaskKeys.get(i));
            }
        }
        _resetUsingDataLoaderField();
        this.mBashDashDefaultMDLKeys.clear();
    }

    private Map _getCommentInfo() {
        MediaPlayer mediaPlayer = this.mMediaPlayer;
        if (mediaPlayer == null) {
            return null;
        }
        String stringOption = mediaPlayer.getStringOption(47);
        HashMap hashMap = new HashMap();
        if (stringOption != null) {
            for (String str : stringOption.replaceAll(" ", "").split(",")) {
                String[] split = str.split(":");
                if (split.length == 2) {
                    hashMap.put(split[0], split[1]);
                }
            }
        }
        return hashMap;
    }

    private static void _initDefaultEventUploader() {
        boolean isAppLogVer2Exist = AppLogTOBVer2.isAppLogVer2Exist();
        TTVideoEngineLog.m256500d("TTVideoEngine", "_setDefaultEventUploader hasAppLogLib = " + isAppLogVer2Exist);
        if (isAppLogVer2Exist) {
            AppInfo.mUploader = new AppLogTOBVer2();
            setVideoEventUploader(AppInfo.mUploader);
        }
    }

    private void _pause() {
        TTVideoEngineLog.m256505i("TTVideoEngine", "_pause");
        if (!this.mPrepared) {
            this.mPausedBeforePrepared = true;
            _updatePlaybackState(2);
            return;
        }
        if (this.mMediaPlayer != null) {
            TTVideoEngineLog.m256505i("TTVideoEngine", "player will pause");
            this.mMediaPlayer.pause();
            _updatePlaybackState(2);
            _updateTextureState(2);
        }
        AbstractC20879g gVar = this.mABRModule;
        if (gVar != null) {
            gVar.mo70551c();
            this.mLogger.setIsEnableABR(0);
        }
    }

    private void _resetUrlIndexMap() {
        Resolution[] allResolutions = Resolution.getAllResolutions();
        for (int i = 0; i < allResolutions.length; i++) {
            this.urlIndexMap.put(allResolutions[i], 0);
            this.dashVideoUrlMap.put(allResolutions[i], "");
        }
    }

    private void _setExtraSurface() {
        if (this.mTextureSurface != null) {
            while (this.mExtraSurfaceQueue.peek() != null) {
                Pair<Surface, Integer> poll = this.mExtraSurfaceQueue.poll();
                this.mTextureSurface.setExtraRenderSurface((Surface) poll.first, ((Integer) poll.second).intValue());
            }
        }
    }

    private void _tryNextURL() {
        this.urlIndexMap.put(this.currentResolution, Integer.valueOf(this.urlIndexMap.get(this.currentResolution).intValue() + 1));
        _parseIPAddress(this.mVideoModel);
    }

    private int clearMdlCache() {
        for (String str : this.mFileHashs) {
            TTVideoEngineLog.m256505i("TTVideoEngine", String.format("clear mdl cache by filekey: %s", str));
            forceRemoveCacheFile(str);
        }
        return 0;
    }

    private boolean deleteCacheFile() {
        String filePath = getFilePath();
        if (filePath == null || filePath.length() == 0) {
            return true;
        }
        File file = new File(filePath);
        try {
            if (!file.isFile() || !file.delete()) {
                return false;
            }
            return true;
        } catch (Throwable th) {
            TTVideoEngineLog.m256501d(th);
            return false;
        }
    }

    private void fallbackOSPlayer() {
        MediaPlayer mediaPlayer = this.mMediaPlayer;
        if (!(mediaPlayer == null || mediaPlayer.getPlayerType() == 0)) {
            this.mMediaPlayer.releaseAsync();
            this.mMediaPlayer = null;
        }
        MediaPlayer mediaPlayer2 = this.mAsyncPlayer;
        if (!(mediaPlayer2 == null || mediaPlayer2.getPlayerType() == 0)) {
            this.mAsyncPlayer.releaseAsync();
            this.mAsyncPlayer = null;
        }
        TTVideoEngineLog.m256500d("TTVideoEngine", "license invalid fallback to os player");
        this.mPlayerType = 2;
    }

    private String getDefaultCacheFileDirPath() {
        String appFilesPath = TTHelper.getAppFilesPath(this.mContext);
        if (appFilesPath == null) {
            return null;
        }
        return appFilesPath + File.separator + "mediattmp";
    }

    public static float getNetworkSpeedFromPredictor() {
        if (StrategyCenter.sNetSpeedPredictor == null) {
            return -1.0f;
        }
        float b = StrategyCenter.sNetSpeedPredictor.mo70589b();
        String format = new DecimalFormat("#.000000000").format((double) b);
        TTVideoEngineLog.m256500d("TTVideoEngine", String.format(Locale.US, "[IESSpeedPredictor] get network speed:%s", format));
        return b;
    }

    public static void initAppLog() {
        boolean isAppLogVer2Exist = AppLogTOBVer2.isAppLogVer2Exist();
        TTVideoEngineLog.m256500d("TTVideoEngine", "initAppLog hasAppLogLib = " + isAppLogVer2Exist);
        if (isAppLogVer2Exist) {
            AppLogTOBVer2.init(AppInfo.mContext, String.valueOf(AppInfo.mAppID), AppInfo.mAppChannel, AppInfo.mRegion);
        }
    }

    private void mdlFetcherRemove() {
        FetcherMaker.remove(this.mVideoID);
        try {
            FetcherMakerNew.removeListener(this.mMDLFetcherListener);
        } catch (Throwable th) {
            TTVideoEngineLog.m256505i("TTVideoEngine", "fetcherMakerNew exception " + th);
        }
        this.mMDLFetcherListener = null;
    }

    private void mdlFetcherStore() {
        FetcherMaker.store(this.mVideoID, this.mKeyseed, this.mFallbackAPI, this.mVideoModelVersion);
        if (this.mMDLFetcherListener == null) {
            this.mMDLFetcherListener = new EngineMDLFetcherListener(this);
        }
        try {
            FetcherMakerNew.storeListener(this.mMDLFetcherListener);
        } catch (Throwable th) {
            TTVideoEngineLog.m256505i("TTVideoEngine", "fetcherMakerNew exception " + th);
        }
    }

    private void releaseTextureRenderRef() {
        if (this.mTextureRenderer != null) {
            if (this.mTextureSurface != null) {
                TTVideoEngineLog.m256505i("TTVideoEngine", "release video surface : " + this.mTextureSurface);
                doOpenSR(0, -7880);
                this.mTextureSurface.release();
                this.mTextureSurface = null;
            }
            this.mTextureRenderer = null;
            this.mRenderHDR2SDR = 0;
            this.mSyncUpdateSurface = 0;
            this.mTextureRenderError = 0;
            TTVideoEngineLog.m256505i("TTVideoEngine", "mTextureRenderer become to null");
        }
    }

    private void setSpeedTest() {
        if (!this.mHaveSetSpeedTest) {
            DataLoaderHelper.getDataLoader().setTestSpeedListener(new TTTestSpeedListener(this, StrategyCenter.sNetSpeedPredictor, StrategyCenter.sNetAbrSpeedPredictor));
            this.mHaveSetSpeedTest = true;
            this.mLogger.setIntOption(17, sTestSpeedSampleInterval);
            this.mLogger.setIntOption(18, sIsReportTestSpeedInfo);
            this.mLogger.setIntOption(19, sReportSpeedInfoMaxWindowSize);
            this.mLogger.setSpeedPredictorAlgoType(sNetSpeedAbrPredictType);
        }
    }

    /* access modifiers changed from: package-private */
    public JSONObject _doGetPlayErrorInfo() {
        String str;
        try {
            MediaPlayer mediaPlayer = this.mMediaPlayer;
            if (mediaPlayer != null) {
                if (mediaPlayer.getIntOption(5000, 0) != 0) {
                    JSONObject jSONObject = new JSONObject();
                    String stringOption = this.mMediaPlayer.getStringOption(5001);
                    if (this.mMediaPlayer.getIntOption(26, 1) == 1) {
                        str = "breakpad crash";
                    } else {
                        str = "simple crash";
                    }
                    jSONObject.put(str, stringOption);
                    return jSONObject;
                }
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public void _doPlay() {
        _initUsingHandle();
        this.mShouldPlay = true;
        this.mShouldStop = false;
        this.mUserStopped = false;
        this.mAccumulatedErrorCount = 0;
        IVideoModel iVideoModel = this.mVideoModel;
        if (iVideoModel != null) {
            iVideoModel.setUpResolution(this.mResolutionMap);
        }
        if (this.mHasComplete) {
            this.mLogger.setIntOption(14, 1);
            this.mHasComplete = false;
        }
        if (this.mIsStartPlayAutomatically || this.mPlayTime > 0 || this.mPrepared) {
            _play(true);
        } else {
            _play(false);
        }
        this.mIsPlayComplete = false;
    }

    /* access modifiers changed from: package-private */
    public void _doPrepare() {
        this.mIsStartPlayAutomatically = false;
        this.mShouldPlay = false;
        this.mShouldStop = false;
        this.mUserStopped = false;
        this.mAccumulatedErrorCount = 0;
        IVideoModel iVideoModel = this.mVideoModel;
        if (iVideoModel != null) {
            iVideoModel.setUpResolution(this.mResolutionMap);
        }
        IVideoEventLogger iVideoEventLogger = this.mLogger;
        if (iVideoEventLogger != null) {
            iVideoEventLogger.setLoggerTimes(65);
        }
        _play(false);
        this.mIsPlayComplete = false;
    }

    public void _formaterStart() {
        PlayerEventSimpleListener playerEventSimpleListener;
        if (this.mEnableDebugUINotify != 0 && (playerEventSimpleListener = this.mPlayerEventListener) != null && this.mMediaPlayer != null) {
            playerEventSimpleListener.onMediaOpened(getVideoFormatInfo(), this.mMediaPlayer.getLongOption(621, 0), this.mMediaPlayer.getLongOption(625, 0));
        }
    }

    /* access modifiers changed from: package-private */
    public void _pauseByInterruption() {
        TTVideoEngineLog.m256505i("TTVideoEngine", "_pause ");
        if (!this.mPrepared) {
            this.mPausedBeforePrepared = true;
        } else if (this.mMediaPlayer != null) {
            TTVideoEngineLog.m256505i("TTVideoEngine", "player will pause by interruption");
            this.mMediaPlayer.pause();
            this.mPlaybackState = 2;
        }
    }

    public void _videoRenderStartNotify() {
        MediaPlayer mediaPlayer;
        PlayerEventSimpleListener playerEventSimpleListener;
        if (this.mEnableDebugUINotify != 0 && (mediaPlayer = this.mMediaPlayer) != null && (playerEventSimpleListener = this.mPlayerEventListener) != null) {
            playerEventSimpleListener.onVideoRenderOpened(mediaPlayer.getIntOption(139, -1), this.mMediaPlayer.getLongOption(155, -1), this.mMediaPlayer.getLongOption(162, -1));
        }
    }

    public JSONObject getPlayErrorInfo() {
        if (!this.mLooperThread.checkEngineLooperThread(true)) {
            return _doGetPlayErrorInfo();
        }
        this.mLooperThread.sendEngineMessage(154, -1);
        this.mLooperThread.mEngineMsgRetValue.setDataPosition(0);
        return (JSONObject) this.mLooperThread.mEngineMsgRetValue.readValue(null);
    }

    public Surface getSurface() {
        TTVideoEngineLog.m256505i("TTVideoEngine", "getSurface:" + this.mSurface + ", this:" + this);
        return this.mSurface;
    }

    public boolean isMute() {
        boolean z = this.mIsMute;
        if (this.mState != 3 || (!this.mShouldPlay && this.mPlaybackState != 2)) {
            return z;
        }
        if (!this.mLooperThread.checkEngineLooperThread(true)) {
            return _doIsMute();
        }
        this.mLooperThread.sendEngineMessage(155, -1);
        this.mLooperThread.mEngineMsgRetValue.setDataPosition(0);
        if (this.mLooperThread.mEngineMsgRetValue.readInt() == 1) {
            return true;
        }
        return false;
    }

    public boolean isplaybackUsedSR() {
        VideoSurface videoSurface = this.mTextureSurface;
        boolean z = false;
        if (videoSurface != null && videoSurface.getIntOption(6) == 1) {
            z = true;
        }
        TTVideoEngineLog.m256505i("TTVideoEngine", "isplaybackUsedSR ,mPlayBackUsedSR = " + this.mPlayBackUsedSR + ", mTextureSrOpen = " + this.mTextureSrOpen + ", ret = " + z);
        return z;
    }

    /* access modifiers changed from: package-private */
    public void notifyCacheEnd() {
        if (this.mVideoEngineInfoListener != null) {
            TTVideoEngineLog.m256505i("TTVideoEngine", "notify cache end. source id: " + this.mUsingDataLoaderPlayRawKey);
            VideoEngineInfos videoEngineInfos = new VideoEngineInfos();
            videoEngineInfos.setKey("mdlcacheend");
            if (this.mLooperThread.checkSendMainLooper()) {
                this.mLooperThread.postMainLooperMessage(PLAYER_OPTION_USE_AJ_MEDIACODEC, 0, 0, videoEngineInfos);
            } else {
                this.mVideoEngineInfoListener.onVideoEngineInfos(videoEngineInfos);
            }
        }
    }

    public void pause() {
        TTVideoEngineLog.m256505i("TTVideoEngine", "pause," + this);
        if (this.mLooperThread.checkEngineLooperThread(false)) {
            this.mLooperThread.postEngineMessage(2);
        } else {
            _doPause();
        }
    }

    public void play() {
        TTVideoEngineLog.m256505i("TTVideoEngine", "play:" + this);
        if (this.mState == 5) {
            TTVideoEngineLog.m256503e("TTVideoEngine", "already released, return");
        } else if (this.mLooperThread.checkEngineLooperThread(false)) {
            this.mLooperThread.postEngineMessage(1);
        } else {
            _doPlay();
        }
    }

    public void prepare() {
        TTVideoEngineLog.m256505i("TTVideoEngine", "prepare," + this);
        if (this.mLooperThread.checkEngineLooperThread(false)) {
            this.mLooperThread.postEngineMessage(22);
        } else {
            _doPrepare();
        }
    }

    public void release() {
        TTVideoEngineLog.m256505i("TTVideoEngine", "release," + this);
        this.mShouldStop = true;
        if (this.mLooperThread.checkEngineLooperThread(false)) {
            this.mLooperThread.postEngineMessage(4);
        } else {
            _doRelease();
        }
    }

    public void releaseAsync() {
        TTVideoEngineLog.m256505i("TTVideoEngine", "releaseAsync," + this);
        this.mShouldStop = true;
        if (this.mLooperThread.checkEngineLooperThread(false)) {
            this.mLooperThread.postEngineMessage(5);
        } else {
            _doReleaseAsync();
        }
    }

    public void stop() {
        TTVideoEngineLog.m256505i("TTVideoEngine", "stop:" + this);
        this.mShouldPlay = false;
        this.mIsFetchingInfo = false;
        this.mTextureFirstFrame = false;
        this.mTexNotifyFirstFrame = false;
        this.mShouldStop = true;
        this.mRenderHDR2SDR = 0;
        this.mSyncUpdateSurface = 0;
        if (this.mLooperThread.checkEngineLooperThread(false)) {
            this.mLooperThread.postEngineMessage(3);
        } else {
            _doStop();
        }
    }

    public boolean supportByteVC1Playback() {
        if (!this.mLooperThread.checkEngineLooperThread(true)) {
            return _doSupportByteVC1Playback();
        }
        this.mLooperThread.sendEngineMessage(156, -1);
        this.mLooperThread.mEngineMsgRetValue.setDataPosition(0);
        if (this.mLooperThread.mEngineMsgRetValue.readInt() == 1) {
            return true;
        }
        return false;
    }

    public boolean supportByteVC2Playback() {
        if (!this.mLooperThread.checkEngineLooperThread(true)) {
            return _doSupportByteVC2Playback();
        }
        this.mLooperThread.sendEngineMessage(157, -1);
        this.mLooperThread.mEngineMsgRetValue.setDataPosition(0);
        if (this.mLooperThread.mEngineMsgRetValue.readInt() == 1) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    public static class MDLCacheSizeRunnable implements Runnable {
        private WeakReference<TTVideoEngine> mVideoEngineRef;
        private ArrayList<String> temFilePaths;
        private ArrayList<String> temKeys;

        public void run() {
            TTVideoEngine tTVideoEngine = this.mVideoEngineRef.get();
            if (tTVideoEngine != null && tTVideoEngine.mState != 5) {
                ArrayList<String> arrayList = this.temFilePaths;
                int i = 0;
                if (arrayList == null || arrayList.size() <= 0) {
                    ArrayList<String> arrayList2 = this.temKeys;
                    if (arrayList2 != null && arrayList2.size() > 0) {
                        while (i < this.temKeys.size()) {
                            String str = this.temKeys.get(i);
                            long cacheFileSize = TTVideoEngine.getCacheFileSize(str);
                            if (tTVideoEngine.mHandler != null) {
                                int i2 = (int) cacheFileSize;
                                tTVideoEngine.mHandler.sendMessage(Message.obtain(tTVideoEngine.mHandler, 10, i2, i2, str));
                            }
                            i++;
                        }
                        return;
                    }
                    return;
                }
                while (i < this.temFilePaths.size()) {
                    String str2 = this.temFilePaths.get(i);
                    long cacheFileSizeByFilePath = TTVideoEngine.getCacheFileSizeByFilePath(str2);
                    if (tTVideoEngine.mHandler != null) {
                        int i3 = (int) cacheFileSizeByFilePath;
                        tTVideoEngine.mHandler.sendMessage(Message.obtain(tTVideoEngine.mHandler, 10, i3, i3, str2));
                    }
                    i++;
                }
            }
        }

        public MDLCacheSizeRunnable(TTVideoEngine tTVideoEngine, ArrayList<String> arrayList, ArrayList<String> arrayList2) {
            this.mVideoEngineRef = new WeakReference<>(tTVideoEngine);
            this.temKeys = arrayList;
            this.temFilePaths = arrayList2;
        }
    }

    private void _fetchSubInfo() {
        String _getSubApiString = _getSubApiString();
        if (this.mIsUseBoe) {
            _getSubApiString = TTHelper.buildBoeUrl(_getSubApiString);
        }
        String BuildHttpsApi = TTVideoEngineUtils.BuildHttpsApi(_getSubApiString);
        TTVideoEngineLog.m256505i("TTVideoEngine", String.format("start to fetch sub info:%s", BuildHttpsApi));
        IVideoEventLogger iVideoEventLogger = this.mLogger;
        if (iVideoEventLogger != null) {
            iVideoEventLogger.setSubtitleRequestUrl(BuildHttpsApi);
        }
        SubInfoFetcher subInfoFetcher = new SubInfoFetcher(this.mContext, getNetClientSetByUser());
        this.mSubFetcher = subInfoFetcher;
        subInfoFetcher.setListener(new MySubFetcherListener(this));
        this.mSubFetcher.fetchInfo(BuildHttpsApi);
    }

    private boolean _initIntertrustDrm() {
        IntertrustDrmHelper intertrustDrmHelper = this.mIntertrustDrmHelper;
        if (intertrustDrmHelper != null) {
            intertrustDrmHelper.stop();
        } else {
            this.mIntertrustDrmHelper = new IntertrustDrmHelper();
        }
        int init = this.mIntertrustDrmHelper.init(this.mContext, this.mDrmCloseRootCheck);
        if (init != 0) {
            if (init == -1000) {
                _receivedError(new Error("kTTVideoErrorDomainIntertrustDRM", -9939));
                return false;
            } else if (init == -1) {
                _receivedError(new Error("kTTVideoErrorDomainIntertrustDRM", -9938));
                return false;
            } else if (init == -1002) {
                _receivedError(new Error("kTTVideoErrorDomainIntertrustDRM", -9933));
                return false;
            } else {
                _receivedError(new Error("kTTVideoErrorDomainIntertrustDRM", -9938, init));
                return false;
            }
        } else if (this.mIntertrustDrmHelper.start() == -1) {
            _receivedError(new Error("kTTVideoErrorDomainIntertrustDRM", -9938));
            return false;
        } else {
            this.mIntertrustDrmHelper.setListener(new MyDrmTokenProcessedListener(this));
            if (TextUtils.isEmpty(this.mTokenUrlTemplate)) {
                return true;
            }
            this.mIntertrustDrmHelper.setTokenUrlTemplate(this.mTokenUrlTemplate);
            return true;
        }
    }

    private void _setupSubtitleInfo() {
        int i;
        SubDesInfoModelProvider subDesInfoModelProvider;
        IVideoModel iVideoModel = this.mVideoModel;
        if (iVideoModel == null || iVideoModel.getSubInfoList() == null || this.mEnableSubThread <= 0) {
            i = 0;
        } else {
            i = this.mVideoModel.getSubInfoList().size();
            TTVideoEngineLog.m256500d("TTVideoEngine", "subtitle num:" + i);
        }
        TTVideoEngineLog.m256500d("TTVideoEngine", "_setup subtitle info in");
        int i2 = this.mEnableSubThread;
        if (i2 > 0 && (subDesInfoModelProvider = this.mSubDesInfoModel) != null) {
            String subDesInfoModelProvider2 = subDesInfoModelProvider.toString();
            if (subDesInfoModelProvider2 != null && subDesInfoModelProvider2.length() > 0 && this.mSubDesInfoModel.subtitleCount() > 0) {
                IVideoEventLogger iVideoEventLogger = this.mLogger;
                if (iVideoEventLogger != null) {
                    iVideoEventLogger.setSubtitleIdsCount(i);
                }
                TTVideoEngineLog.m256500d("TTVideoEngine", "using subtitle description info for setup subtitle");
                _setSubInfoToMediaPlayer(subDesInfoModelProvider2);
            }
        } else if (i2 > 0 && !this.mHasFetchedSubtitle && i > 0) {
            IVideoEventLogger iVideoEventLogger2 = this.mLogger;
            if (iVideoEventLogger2 != null) {
                iVideoEventLogger2.setSubtitleIdsCount(i);
            }
            TTVideoEngineLog.m256500d("TTVideoEngine", "start fetch subtitle info");
            _fetchSubInfo();
            this.mHasFetchedSubtitle = true;
        }
    }

    private void _syncPlayInfoToMdl() {
        MediaPlayer mediaPlayer = this.mMediaPlayer;
        if (mediaPlayer == null) {
            return;
        }
        if (this.mP2PCDNType == 0 && !DataLoaderHelper.getDataLoader().isNeedPlayInfo()) {
            return;
        }
        if (this.mIsPlayComplete || this.mErrorEnd) {
            TTVideoEngineLog.m256500d("TTVideoEngine", "_syncPlayInfoToMdl complete");
            return;
        }
        long longOption = mediaPlayer.getLongOption(73, -1);
        long longOption2 = mediaPlayer.getLongOption(72, -1);
        int i = (longOption > 0 ? 1 : (longOption == 0 ? 0 : -1));
        if (i >= 0 && longOption2 >= 0) {
            longOption = Math.min(longOption, longOption2);
        } else if (i < 0) {
            if (longOption2 >= 0) {
                longOption = longOption2;
            } else {
                return;
            }
        }
        setPlayInfo(5, longOption);
    }

    private boolean _validateVideo() {
        if (this.mPlayAPIVersion >= 2) {
            return true;
        }
        try {
            String videoRefStr = this.mVideoModel.getVideoRefStr(LocationRequest.PRIORITY_NO_POWER);
            boolean z = false;
            if (!TextUtils.isEmpty(videoRefStr) && !"0".equals(videoRefStr) && !isOSPlayer()) {
                z = !this.mVideoID.equals(_getCommentInfo().get("vid"));
            }
            if (z) {
                this.mLogger.validateVideoMetaInfoFail(new Error("kTTVideoErrorDomainVideoOwnPlayer", -9991, "header meta validate failed"));
            }
        } catch (NullPointerException unused) {
            Log.d("TTVideoEngine", "fetcher video model null");
        }
        return true;
    }

    private void createDefaultCacheFileDirectory() {
        if (mCreatCacheFileLock.tryLock()) {
            try {
                if (!mIsFirstOpenEngine) {
                    mCreatCacheFileLock.unlock();
                    return;
                }
                mIsFirstOpenEngine = false;
                String defaultCacheFileDirPath = getDefaultCacheFileDirPath();
                File file = new File(defaultCacheFileDirPath);
                if (!file.exists()) {
                    file.mkdirs();
                } else if (file.list() != null) {
                    File file2 = new File(defaultCacheFileDirPath + "tem");
                    file.renameTo(file2);
                    file.mkdirs();
                    EngineThreadPool.addExecuteTask(new RecursionDeleteFileRunnable(file2));
                }
                EngineThreadPool.addExecuteTask(new DeleteBeforeDirFileRunnable(this.mContext.getApplicationContext()));
                mCreatCacheFileLock.unlock();
            } catch (Throwable unused) {
            }
        }
    }

    private String getFilePath() {
        VideoInfo videoInfo;
        if (!this.mIsLocal && !this.mIsPlayItem && !this.mIsPreloaderItem) {
            if (this.mIsDirectURL) {
                return this.mFileKey;
            }
            if (!TextUtils.isEmpty(this.mCacheDir) && ((videoInfo = this.currentVideoInfo) == null || !TextUtils.isEmpty(videoInfo.getValueStr(15)))) {
                String mediaFileKey = getMediaFileKey();
                if (TextUtils.isEmpty(mediaFileKey)) {
                    return null;
                }
                if (this.mCacheDir.charAt(this.mCacheDir.length() - 1) == '/') {
                    return String.format("%s%s.ttmp", this.mCacheDir, mediaFileKey);
                }
                return String.format("%s/%s.ttmp", this.mCacheDir, mediaFileKey);
            }
        }
        return null;
    }

    public void _audioRenderStart() {
        PlayerEventSimpleListener playerEventSimpleListener;
        TTVideoEngineLog.m256505i("TTVideoEngine", "_audioRenderStart,this:" + this);
        MediaPlayer mediaPlayer = this.mMediaPlayer;
        if (mediaPlayer != null) {
            if (!(this.mEnableDebugUINotify == 0 || (playerEventSimpleListener = this.mPlayerEventListener) == null)) {
                playerEventSimpleListener.onAudioRenderOpened(mediaPlayer.getIntOption(48, -1), mediaPlayer.getLongOption(156, -1), mediaPlayer.getLongOption(163, -1));
            }
            if (!this.mHasAudioFirstFrameShown) {
                this.mHasAudioFirstFrameShown = true;
                this.mLogger.setLongOption(77, mediaPlayer.getLongOption(628, 0));
            }
            if (!this.mHasFirstFrameShown) {
                if (mediaPlayer.getIntOption(62, -100) == 0 || this.mRadioModeEnable != 0 || this.mShouldUseAudioRenderStart) {
                    _renderStart();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void _doRelease() {
        NetUtils.release(this.mContext);
        mdlFetcherRemove();
        EngineThreadPool.addExecuteTask(new VideoInfoCollector.myVideoCollectorUnregister(this.mSerial));
        this.mShouldPlay = false;
        _stop(false, 1);
        releaseTextureRenderRef();
        AbstractC20879g gVar = this.mABRModule;
        if (gVar != null) {
            gVar.mo70553d();
            this.mABRModule = null;
        }
        MediaPlayer mediaPlayer = this.mMediaPlayer;
        if (mediaPlayer != null) {
            try {
                mediaPlayer.release();
            } catch (Exception unused) {
            } catch (Throwable th) {
                this.mMediaPlayer = null;
                throw th;
            }
            this.mMediaPlayer = null;
            _clearSurface();
        }
        HeadsetStateMonitor headsetStateMonitor = this.mHeadsetMonitor;
        if (headsetStateMonitor != null) {
            headsetStateMonitor.stop();
            this.mHeadsetMonitor = null;
        }
        this.mBatteryMonitor = null;
        this.mAudioProcessor = null;
        this.mPreloaderItem = null;
        this.mIsPreloaderItem = false;
        this.mCachePath = null;
        this.mFileKey = null;
        this.mMaskInfoInterface = null;
        this.mSubInfoInterface = null;
        this.mSubPathInfo = null;
        this.mHasSetAESrcPeak = false;
        this.mHasSetAESrcLoudness = false;
        this.mSRNotUseReason = 0;
        _dataLoaderRemoveEngineRef();
        IntertrustDrmHelper intertrustDrmHelper = this.mIntertrustDrmHelper;
        if (intertrustDrmHelper != null) {
            intertrustDrmHelper.release();
            this.mIntertrustDrmHelper = null;
        }
        this.mState = 5;
        this.mLooperThread.closeEngineLooperThread();
    }

    /* access modifiers changed from: package-private */
    public void _doStop() {
        _stop(true, 0);
        if (this.mCleanWhenStop > 0) {
            MediaPlayer mediaPlayer = this.mMediaPlayer;
            if (mediaPlayer != null) {
                mediaPlayer.reset();
                this.mPrepared = false;
            }
            MediaPlayer mediaPlayer2 = this.mMediaPlayer;
            if (!(mediaPlayer2 == null || this.mCleanSurfaceWhenReset <= 0 || this.mTextureSurface == null)) {
                mediaPlayer2.setSurface(null);
            }
            MediaPlayer mediaPlayer3 = this.mMediaPlayer;
            if (mediaPlayer3 != null && mediaPlayer3.getPlayerType() == 0) {
                this.mMediaPlayer.release();
                this.mMediaPlayer = null;
            }
            MediaPlayer mediaPlayer4 = this.mAsyncPlayer;
            if (mediaPlayer4 != null) {
                mediaPlayer4.release();
                this.mAsyncPlayer = null;
            }
            this.mState = 0;
        }
        Handler handler = this.mTestNetSpeedHandler;
        if (handler != null) {
            handler.removeCallbacks(this.mTestNetSpeedRunable);
        }
        _dataLoaderRemoveEngineRef();
        this.mSRNotUseReason = 0;
    }

    private void _ShutdownOldSource() {
        this.mIsLocal = false;
        this.mIsDirectURL = false;
        this.mIsPreloaderItem = false;
        this.mIsPlayItem = false;
        this.mIsFeedInfo = false;
        MediaPlayer mediaPlayer = this.mMediaPlayer;
        if (mediaPlayer != null && mediaPlayer.getPlayerType() == 0) {
            this.mMediaPlayer.release();
            this.mMediaPlayer = null;
        }
        _reset();
        _resetUrlIndexMap();
        mdlFetcherRemove();
        this.mState = 0;
        this.currentVideoInfo = null;
        this.mDynamicAudioInfo = null;
        this.mDynamicVideoInfo = null;
        this.mVideoModel = null;
        this.mDirectURL = null;
        this.mLocalURL = null;
        this.mVideoID = null;
        this.mPlayFd = null;
        this.mDirectURL = null;
        this.mTextureFirstFrame = false;
        this.mTexNotifyFirstFrame = false;
        this.mHasFirstFrameShown = false;
        this.mHasFetchedSubtitle = false;
        this.mHasAudioFirstFrameShown = false;
        this.mPlayDuration.reset();
        this.mIsPlayComplete = false;
        this.mDecodedVideoFirstFrame = false;
        this.mPlayStartTimestamp = 0;
        this.mHasComplete = false;
        this.mPlayTime = 0;
        this.mRetryingNotHandleError = false;
        this.dashAudioUrlMap.clear();
        this.mCurPosition = -1;
        this.mVideoCodecType = -1;
        this.mAudioCodecType = -1;
        this.mVideoCodecID = -1;
        this.mAudioCodecID = -1;
        this.mAudioCodecProfile = -1;
        this.mVideoCodecProfile = -1;
        this.mBitrate = -1;
        this.mContainerFPS = BitmapDescriptorFactory.HUE_RED;
        this.mAudioProcessor = null;
        this.mHasSetAESrcPeak = false;
        this.mHasSetAESrcLoudness = false;
        this.mSubDesInfoModel = null;
        this.mSeeking = false;
        IVideoEventLogger iVideoEventLogger = this.mLogger;
        if (iVideoEventLogger != null) {
            iVideoEventLogger.setLoggerTimes(63);
        }
        this.mFileHashs.clear();
    }

    private void _configWithAppSettings() {
        int i = 0;
        if ((this.mSettingMask & 4) == 0) {
            int bufferTimeOut = InfoWrapper.getBufferTimeOut();
            this.mBufferTimeout = bufferTimeOut;
            TTVideoEngineLog.m256500d("TTVideoEngine", String.format("==========mBufferTimeout:%d", Integer.valueOf(bufferTimeOut)));
        }
        if ((this.mSettingMask & 64) == 0) {
            if (InfoWrapper.getByteVC1Enable() > 0) {
                this.mCodecType = "bytevc1";
            }
            TTVideoEngineLog.m256500d("TTVideoEngine", String.format("==========mByteVC1Enabled:%s", Boolean.valueOf(this.mCodecType.equals("bytevc1"))));
        }
        if ((this.mSettingMask & 128) == 0) {
            if (InfoWrapper.getByteVC2Enable() > 0) {
                this.mCodecType = "bytevc2";
            }
            TTVideoEngineLog.m256500d("TTVideoEngine", String.format("==========mByteVC2Enabled:%s", Boolean.valueOf(this.mCodecType.equals("bytevc2"))));
        }
        int byteVC1SoftwareCapabilityEnable = InfoWrapper.getByteVC1SoftwareCapabilityEnable();
        if ((this.mSettingMask & 32) == 0) {
            this.mHardwareDecodeEnablePlayer2 = InfoWrapper.getHardwareEnable();
            if (byteVC1SoftwareCapabilityEnable == 0 && !this.mCodecStrategyAdapter.isCodecStrategyValid() && this.mErrorCount <= 0) {
                this.mHardwareDecodeEnablePlayer2 = 1;
            }
            TTVideoEngineLog.m256500d("TTVideoEngine", String.format("==========mHardwareDecodeEnablePlayer2:%d", Integer.valueOf(this.mHardwareDecodeEnablePlayer2)));
        }
        if (byteVC1SoftwareCapabilityEnable == 0) {
            i = 1;
        }
        this.mForbidByteVC1SoftwareDecode = i;
    }

    private String _getSubApiString() {
        if (this.mVideoModel == null || this.currentVideoInfo == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        String valueStr = this.currentVideoInfo.getValueStr(28);
        if (valueStr == null) {
            valueStr = "";
        }
        if (!TextUtils.isEmpty(this.mSubHostName)) {
            if (this.mSubHostName.startsWith("http://") || this.mSubHostName.startsWith("https://")) {
                sb.append(String.format("%s/video/subtitle/v1/%s/%s?", this.mSubHostName, this.mVideoID, valueStr));
            } else {
                sb.append(String.format("https://%s/video/subtitle/v1/%s/%s?", this.mSubHostName, this.mVideoID, valueStr));
            }
            if (!TextUtils.isEmpty(this.mSubIds)) {
                sb.append(String.format("sub_ids=%s", this.mSubIds));
            }
            if (!TextUtils.isEmpty(this.mSubFormat)) {
                if (!TextUtils.isEmpty(this.mSubIds)) {
                    sb.append(ContainerUtils.FIELD_DELIMITER);
                }
                sb.append(String.format("format=%s", this.mSubFormat));
            }
        }
        return sb.toString();
    }

    private void _prepareToPlay() {
        String str;
        String str2;
        boolean z;
        PlayDurationManager playDurationManager = this.mPlayDuration;
        if (playDurationManager != null) {
            playDurationManager.clear();
        }
        this.mLogger.setTag(this.mTag);
        this.mLogger.setSubTag(this.mSubTag);
        if (this.mPlayStartTimestamp == 0) {
            this.mPlayStartTimestamp = System.currentTimeMillis();
            P2PStragetyManager.getInstance().onePlay();
        }
        if (this.mIsLocal || this.mIsDirectURL || this.mPlayFd != null || this.mMediaDataSource != null) {
            _logBeginToPlay(null);
            if (this.mIsLocal) {
                str = this.mLocalURL;
            } else {
                str = this.mDirectURL;
            }
            _logFirstURL(str);
            if (this.mIsLocal) {
                str2 = this.mLocalURL;
            } else {
                str2 = this.mDirectURL;
            }
            _singleURLParseAndPlay(str2, this.mHeaders);
        } else if (this.mIsPreloaderItem) {
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            if (this.mPreloaderItem.mUrlTime <= 0 || currentTimeMillis - this.mPreloaderItem.mUrlTime <= ((long) PLAY_URL_EXPIRE_TIME)) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                _fetchVideoInfo();
            }
            _logFirstURL(this.mPreloaderItem.mUrl);
            _logBeginToPlay(this.mPreloaderItem.mVideoID);
            _singleURLParseAndPlay(this.mPreloaderItem.mUrl, this.mHeaders);
        } else if (this.mIsPlayItem) {
            _logBeginToPlay(this.mVideoID);
            _logFirstURL(this.mPlayItem.playURL);
            _singleURLParseAndPlay(this.mPlayItem.playURL, this.mHeaders);
        } else if (this.mIsFeedInfo) {
            _logBeginToPlay(this.mVideoID);
            _parseIPAddress(this.mVideoModel);
        } else {
            _logBeginToPlay(this.mVideoID);
            _fetchVideoInfo();
        }
        if (this.mMediaPlayer != null && this.mP2PCDNType != 0) {
            setPlayInfo(5, 0);
        }
    }

    private void _replayOrResume() {
        String str;
        IpInfo ipInfo;
        if (!_shouldPrepare()) {
            TTVideoEngineLog.m256500d("TTVideoEngine", "_replayOrResume state:" + this.mPlaybackState + ", playtime:" + this.mPlayTime);
            if (this.mIsPlayComplete || (this.mPlaybackState == 0 && this.mPlayTime == 0)) {
                _logBeginToPlay(this.mVideoID);
                PlayDurationManager playDurationManager = this.mPlayDuration;
                if (playDurationManager != null) {
                    playDurationManager.clear();
                }
            }
            _resumeVideo();
        } else if (this.mIsLocal || this.mIsDirectURL || this.mPlayFd != null || this.mMediaDataSource != null) {
            _logBeginToPlay(null);
            if (this.mIsLocal) {
                str = this.mLocalURL;
            } else {
                str = this.mDirectURL;
            }
            _singleURLParseAndPlay(str, this.mHeaders);
        } else if (this.mIsPreloaderItem) {
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            if (this.mPreloaderItem.mUrlTime > 0 && currentTimeMillis - this.mPreloaderItem.mUrlTime > ((long) PLAY_URL_EXPIRE_TIME)) {
                _fetchVideoInfo();
            }
            _logBeginToPlay(this.mPreloaderItem.mVideoID);
            _singleURLParseAndPlay(this.mPreloaderItem.mUrl, this.mHeaders);
        } else if (this.mIsPlayItem) {
            _logBeginToPlay(this.mVideoID);
            _singleURLParseAndPlay(this.mPlayItem.playURL, this.mHeaders);
        } else {
            _logBeginToPlay(this.mVideoID);
            Map<String, IpInfo> map = this.urlIPMap;
            if (!(map == null || (ipInfo = map.get(this.mURLInfo.hostURL)) == null)) {
                ipInfo.dns = "FromCache";
                this.urlIPMap.put(this.mURLInfo.hostURL, ipInfo);
                _updateVU();
            }
            _playInternal(this.mURLInfo.getCurrentURL(), this.mHeaders);
        }
    }

    private void _reset() {
        TTVideoEngineLog.m256505i("TTVideoEngine", "reset, this:" + this);
        this.mShouldPlay = false;
        this.mShouldStop = false;
        this.mPrepared = false;
        this.mIsFetchingInfo = false;
        this.mABRUsed = false;
        this.mAverageDownloadSpeed = BitmapDescriptorFactory.HUE_RED;
        this.mAveragePredictSpeed = BitmapDescriptorFactory.HUE_RED;
        this.mSpeedAverageCount = 0;
        this.mHeaders.clear();
        _stop(true, 6);
        if (this.mMediaPlayer != null) {
            if (this.mHardwareDecodeEnablePlayer2 == 1) {
                setSurfaceHook(null);
            }
            if (this.mTextureSrOpen == 1 && this.mPlayBackUsedSR && this.mTextureSurface != null) {
                TTVideoEngineLog.m256505i("TTVideoEngine", "disable sr while _ShutdownOldSource = " + this.mTextureSrOpen);
                doOpenSR(0, -7880);
            }
            VideoSurface videoSurface = this.mTextureSurface;
            if (videoSurface != null) {
                videoSurface.pause(false);
            }
            this.mMediaPlayer.reset();
            _clearSurface();
        }
        this.mSRStrategy.resetStream();
        this.mPlayerFirstFrame = false;
        this.mHasFirstFrameShown = false;
        this.mHasFetchedSubtitle = false;
        this.mHasAudioFirstFrameShown = false;
        this.mHttpsEnabled = false;
        this.mRetryEnableHttps = false;
        this.mKeyseed = null;
        this.mFallbackAPI = null;
        this.mHijackRetryCount = 0;
        this.mRetrying = false;
        this.mLogger.reset();
        this.mFirstResolution = true;
        this.mFirstGetWidthHeight = true;
        this.mSeamSwitchingResolution = false;
        this.mFrameCount = 0;
        this.mPlayStartTime = -1;
        this.mRenderStartTime = -1;
        this.mStartUpBitrate = -1;
        this.mCheckInfoString = null;
        AbstractC20879g gVar = this.mABRModule;
        if (gVar != null) {
            gVar.mo70553d();
            this.mABRModule = null;
        }
        this.mForceCodec = null;
        this.mShouldUseAudioRenderStart = false;
        this.mAudioInfoId = -1;
        this.mLastSwitchRadioModeTime = 0;
        this.mLastSwitchResolutionTime = 0;
    }

    private void _resumeVideo() {
        TTVideoEngineLog.m256505i("TTVideoEngine", "resumed video, shouldplay:" + this.mShouldPlay + ", mediaplayer:" + this.mMediaPlayer + ", prepared:" + this.mPrepared);
        MediaPlayer mediaPlayer = this.mMediaPlayer;
        if (mediaPlayer != null && this.mShouldPlay) {
            mediaPlayer.setScreenOnWhilePlaying(true);
            if (this.mPrepared) {
                if ((this.mPlaybackState == 0 || this.mIsPlayComplete) && !TextUtils.isEmpty(this.mVideoID) && !this.mIsFeedInfo && this.mVideoModel != null && this.mVideoInfoListener != null) {
                    if (this.mLooperThread.checkSendMainLooper()) {
                        this.mLooperThread.postMainLooperMessage(PLAYER_OPTION_USE_THREAD_POOL, 0, 0, this.mVideoModel);
                    } else {
                        this.mVideoInfoListener.onFetchedVideoInfo((VideoModel) this.mVideoModel);
                    }
                }
                this.mMediaPlayer.setIntOption(100, this.mStartTime);
                this.mMediaPlayer.start();
                _dumpSurface("_renderVideo");
                _updateTextureState(1);
                if (this.mHasFirstFrameShown) {
                    PlayDurationManager playDurationManager = this.mPlayDuration;
                    if (playDurationManager != null) {
                        playDurationManager.start();
                    }
                    _updatePlaybackState(1);
                }
                if (this.mABRModule != null && this.mEnableABR > 0 && isSupportSeamlessSwitch(this.mVideoModel)) {
                    this.mABRModule.mo70552c(sABRAlgorithmType, this.mABRTimerIntervalMilliseconds);
                    this.mLogger.setIsEnableABR(1);
                    return;
                }
                return;
            }
            this.mPausedBeforePrepared = false;
        }
    }

    private void _updateVU() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, IpInfo> entry : this.urlIPMap.entrySet()) {
            String key = entry.getKey();
            IpInfo value = entry.getValue();
            if (!(key == null || value == null)) {
                if (value instanceof IpInfo) {
                    IpInfo ipInfo = value;
                    HashMap hashMap = new HashMap();
                    hashMap.put("url", key);
                    hashMap.put("ip", ipInfo.ip);
                    hashMap.put("dns", ipInfo.dns);
                    hashMap.put("dns_cache_open", Integer.valueOf(ipInfo.isDNSCacheOpen));
                    hashMap.put("server_dns_open", Integer.valueOf(ipInfo.isServerDNSOpen));
                    hashMap.put("url_desc", ipInfo.urlDesc);
                    if (this.mIsDirectURL && !TextUtils.isEmpty(this.mGroupID)) {
                        hashMap.put("gid", this.mGroupID);
                    }
                    arrayList.add(hashMap);
                } else {
                    throw new RuntimeException(value.getClass().getName());
                }
            }
        }
        this.mLogger.setVUArray(arrayList);
    }

    private String getMediaFileKey() {
        String str;
        String str2;
        long j;
        String str3;
        if (!this.mIsLocal && !this.mIsPlayItem && !this.mIsPreloaderItem) {
            if (this.mIsDirectURL) {
                return this.mFileKey;
            }
            if (this.mVideoModel == null) {
                return null;
            }
            VideoInfo videoInfo = this.currentVideoInfo;
            if (videoInfo != null) {
                str3 = videoInfo.getValueStr(26);
                j = this.currentVideoInfo.getValueLong(12);
                str2 = this.currentVideoInfo.getValueStr(5);
                str = this.currentVideoInfo.getValueStr(15);
            } else {
                str3 = null;
                str2 = null;
                str = null;
                j = 0;
            }
            if (!TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str) && j != 0) {
                if (!TextUtils.isEmpty(str2)) {
                    return String.format("%s_%s_%s_%d_%s", this.mVideoID, str3, str, Long.valueOf(j), TTHelper.customBase64Encode(str2));
                }
                return String.format("%s_%s_%s_%d", this.mVideoID, str3, str, Long.valueOf(j));
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public void _doReleaseAsync() {
        if (!isInHousePlayer()) {
            release();
            return;
        }
        NetUtils.release(this.mContext);
        mdlFetcherRemove();
        EngineThreadPool.addExecuteTask(new VideoInfoCollector.myVideoCollectorUnregister(this.mSerial));
        this.mShouldPlay = false;
        _stop(false, 2);
        AbstractC20879g gVar = this.mABRModule;
        if (gVar != null) {
            gVar.mo70553d();
            this.mABRModule = null;
        }
        MediaPlayer mediaPlayer = this.mMediaPlayer;
        if (mediaPlayer != null) {
            if (this.mSurfaceHolderByKernel != 0) {
                if (this.mSurfaceHolder != null) {
                    mediaPlayer.setDisplay(null);
                }
                if (this.mSurface != null) {
                    setSurfaceHook(null);
                }
            } else if (!(this.mSurfaceHolder == null && this.mSurface == null)) {
                setSurfaceHook(null);
            }
            releaseTextureRenderRef();
        }
        HeadsetStateMonitor headsetStateMonitor = this.mHeadsetMonitor;
        if (headsetStateMonitor != null) {
            headsetStateMonitor.stop();
            this.mHeadsetMonitor = null;
        }
        this.mBatteryMonitor = null;
        MediaPlayer mediaPlayer2 = this.mAsyncPlayer;
        if (mediaPlayer2 != null) {
            mediaPlayer2.release();
            this.mAsyncPlayer = null;
        }
        this.mAudioProcessor = null;
        this.mPreloaderItem = null;
        MediaPlayer mediaPlayer3 = this.mMediaPlayer;
        this.mMediaPlayer = null;
        this.mCachePath = null;
        this.mFileKey = null;
        this.mMaskInfoInterface = null;
        this.mSubInfoInterface = null;
        this.mSubPathInfo = null;
        this.mSRNotUseReason = 0;
        if (mediaPlayer3 != null) {
            EngineThreadPool.addExecuteTask(new MyReleaseRunnable(mediaPlayer3));
        }
        _dataLoaderRemoveEngineRef();
        IntertrustDrmHelper intertrustDrmHelper = this.mIntertrustDrmHelper;
        if (intertrustDrmHelper != null) {
            intertrustDrmHelper.release();
            this.mIntertrustDrmHelper = null;
        }
        this.mState = 5;
        this.mLooperThread.closeEngineLooperThread();
    }

    /* access modifiers changed from: package-private */
    public boolean _doSupportByteVC1Playback() {
        MediaPlayer mediaPlayer = this.mMediaPlayer;
        if (mediaPlayer == null) {
            return true;
        }
        try {
            int currentPosition = mediaPlayer.getCurrentPosition();
            int duration = this.mMediaPlayer.getDuration();
            long longOption = this.mMediaPlayer.getLongOption(72, -1);
            if (this.mMediaPlayer.getIntOption(157, -1) == 5 && this.mPlaybackState == 1 && this.mLoadState == 1 && currentPosition >= 1000 && duration - currentPosition >= 1000 && longOption >= 500) {
                int intOption = this.mMediaPlayer.getIntOption(160, 100);
                long longOption2 = this.mMediaPlayer.getLongOption(152, -1);
                int intOption2 = this.mMediaPlayer.getIntOption(153, -1);
                float floatOption = this.mMediaPlayer.getFloatOption(151, BitmapDescriptorFactory.HUE_RED);
                if (floatOption > ((float) this.mMaxFps)) {
                    floatOption /= 2.0f;
                }
                int i = this.mFrameDropNum;
                int i2 = (((int) floatOption) * i) / (i + 1);
                Log.d("TTVideoEngine", "cd = " + longOption2 + ", dc = " + intOption2 + ", mdps = " + i2 + ", vs =" + intOption);
                if (longOption2 > -350 || intOption2 < (i2 * 2) / 3 || intOption <= 2) {
                    return true;
                }
                return false;
            }
        } catch (Exception unused) {
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean _doSupportByteVC2Playback() {
        MediaPlayer mediaPlayer = this.mMediaPlayer;
        if (mediaPlayer == null) {
            return true;
        }
        try {
            int currentPosition = mediaPlayer.getCurrentPosition();
            int duration = this.mMediaPlayer.getDuration();
            long longOption = this.mMediaPlayer.getLongOption(72, -1);
            if (this.mMediaPlayer.getIntOption(157, -1) == 7 && this.mPlaybackState == 1 && this.mLoadState == 1 && currentPosition >= 1000 && duration - currentPosition >= 1000 && longOption >= 500) {
                int intOption = this.mMediaPlayer.getIntOption(160, 100);
                long longOption2 = this.mMediaPlayer.getLongOption(152, -1);
                int intOption2 = this.mMediaPlayer.getIntOption(153, -1);
                float floatOption = this.mMediaPlayer.getFloatOption(151, BitmapDescriptorFactory.HUE_RED);
                if (floatOption > ((float) this.mMaxFps)) {
                    floatOption /= 2.0f;
                }
                int i = this.mFrameDropNum;
                int i2 = (((int) floatOption) * i) / (i + 1);
                Log.d("TTVideoEngine", "cd = " + longOption2 + ", dc = " + intOption2 + ", mdps = " + i2 + ", vs =" + intOption);
                if (longOption2 > -350 || intOption2 < (i2 * 2) / 3 || intOption <= 2) {
                    return true;
                }
                return false;
            }
        } catch (Exception unused) {
        }
        return true;
    }

    public void _logFirstFrame() {
        if (!this.mHasFirstFrameShown) {
            if (this.mLogger != null) {
                this.mVVTime = System.currentTimeMillis();
                this.mRenderStartTime = SystemClock.elapsedRealtime();
                TTVideoEngineLog.m256505i("TTVideoEngine", "mRenderStartTime:" + this.mRenderStartTime + ", curT:" + this.mVVTime);
                this.mLogger.showedOneFrame();
            }
            _updateLogTime();
            IVideoEventLogger iVideoEventLogger = this.mLogger;
            if (iVideoEventLogger != null) {
                iVideoEventLogger.showedFirstFrame();
            }
            this.mHasFirstFrameShown = true;
        }
        this.mLogger.setNetworkSpeedFrom(C60447b.m234869a().mo206937b(), 0);
        MediaPlayer mediaPlayer = this.mMediaPlayer;
        if (mediaPlayer != null) {
            this.mVideoCodecType = mediaPlayer.getIntOption(157, -1);
            this.mAudioCodecType = mediaPlayer.getIntOption(158, -1);
            this.mVideoCodecID = mediaPlayer.getIntOption(SmActions.ACTION_IDLE_ENTRY, -1);
            this.mAudioCodecID = mediaPlayer.getIntOption(140, -1);
            this.mAudioCodecProfile = mediaPlayer.getIntOption(402, -1);
            this.mVideoCodecProfile = mediaPlayer.getIntOption(403, -1);
            this.mBitrate = mediaPlayer.getLongOption(171, -1);
            this.mContainerFPS = mediaPlayer.getFloatOption(151, BitmapDescriptorFactory.HUE_RED);
        }
    }

    public void _onABRGetPredictResult() {
        ABRResult b;
        int a;
        AbstractC20879g gVar = this.mABRModule;
        if (gVar != null && (b = gVar.mo70549b()) != null && (a = b.mo70536a()) != 0 && a > 0) {
            C20877e a2 = b.mo70537a(0);
            int b2 = a2.mo70564b();
            int a3 = (int) a2.mo70563a();
            int c = a2.mo70565c();
            TTVideoEngineLog.m256500d("TTVideoEngine", String.format("[ABR] predict next segment bitrate:%dbps", Integer.valueOf(a3)) + ", this:" + this);
            if (this.mLooperThread.checkSendMainLooper()) {
                this.mLooperThread.postMainLooperMessage(600, b2, a3, null);
            } else {
                ABRListener aBRListener = this.mABRListener;
                if (aBRListener != null) {
                    aBRListener.onPredictBitrate(b2, a3);
                }
                VideoEngineCallback videoEngineCallback = this.mSimpleCallback;
                if (videoEngineCallback != null) {
                    videoEngineCallback.onABRPredictBitrate(b2, a3);
                }
            }
            MediaPlayer mediaPlayer = this.mMediaPlayer;
            if (mediaPlayer != null && this.mABRSwitchMode == 0) {
                if (c >= 0) {
                    mediaPlayer.setIntOption(270, c);
                }
                this.mMediaPlayer.setIntOption(600, a3);
            }
        }
    }

    public int getCurrentPlaybackTime() {
        int i = this.mState;
        int i2 = -1;
        if (i != 3) {
            if (this.mSeamSwitchingResolution || i == 4) {
                i2 = this.mLastPlaybackTime;
            }
            TTVideoEngineLog.m256505i("TTVideoEngine", "state not correct return:" + this.mState);
            return i2;
        }
        int i3 = this.mPlaybackState;
        if ((i3 != 1 && i3 != 2 && !this.mPrepared) || this.mShouldStop) {
            TTVideoEngineLog.m256505i("TTVideoEngine", "playbackstate not correct return:" + this.mPlaybackState);
            return -1;
        } else if (this.mHasComplete) {
            int i4 = this.mDuration;
            if (i4 > 0) {
                return i4;
            }
            return -1;
        } else if (this.mGetPositionSkipLooper || !this.mLooperThread.checkEngineLooperThread(true)) {
            return _doGetCurrentPlaybackTime();
        } else {
            if (!this.mLooperThread.sendEngineMessage(151, this.mSendEngineMsgTimeout)) {
                return -1;
            }
            this.mLooperThread.mEngineMsgRetValue.setDataPosition(0);
            return this.mLooperThread.mEngineMsgRetValue.readInt();
        }
    }

    public VideoFormatInfo getVideoFormatInfo() {
        VideoFormatInfo videoFormatInfo = new VideoFormatInfo();
        MediaPlayer mediaPlayer = this.mMediaPlayer;
        if (mediaPlayer != null) {
            String stringOption = mediaPlayer.getStringOption(516);
            if (!TextUtils.isEmpty(stringOption)) {
                if (stringOption.indexOf("mp4") > 0) {
                    videoFormatInfo.fileFormat = "mp4";
                } else {
                    int indexOf = stringOption.indexOf(",");
                    if (indexOf < 0) {
                        videoFormatInfo.fileFormat = stringOption;
                    } else {
                        videoFormatInfo.fileFormat = stringOption.substring(0, indexOf);
                    }
                }
            }
            videoFormatInfo.bitrate = this.mMediaPlayer.getLongOption(171, 0);
            videoFormatInfo.videoCodecName = this.mMediaPlayer.getIntOption(157, -1);
            videoFormatInfo.videoProfile = this.mMediaPlayer.getIntOption(403, -1);
            videoFormatInfo.width = this.mMediaPlayer.getVideoWidth();
            videoFormatInfo.height = this.mMediaPlayer.getVideoHeight();
            videoFormatInfo.rotation = this.mMediaPlayer.getIntOption(555, -1);
            videoFormatInfo.containerFps = this.mMediaPlayer.getFloatOption(151, BitmapDescriptorFactory.HUE_RED);
            videoFormatInfo.audioCodecName = this.mMediaPlayer.getIntOption(158, -1);
            videoFormatInfo.audioProfile = this.mMediaPlayer.getIntOption(402, -1);
            videoFormatInfo.channels = this.mMediaPlayer.getIntOption(553, -1);
            videoFormatInfo.sampleRate = this.mMediaPlayer.getIntOption(554, -1);
        }
        return videoFormatInfo;
    }

    public void setupTextureRender() {
        TTVideoEngineLog.m256505i("TTVideoEngine", "[SRLog]setupTextureRender");
        int i = 0;
        this.mTextureRenderError = 0;
        IVideoEventLogger iVideoEventLogger = this.mLogger;
        if (iVideoEventLogger != null) {
            iVideoEventLogger.useTextureRender(this.mUseTextureRender);
        }
        this.mTextureRenderer = TextureRenderManager.getManager();
        TTVideoEngineLog.m256505i("TTVideoEngine", "get texture renderer start");
        TextureRenderManager textureRenderManager = this.mTextureRenderer;
        if (textureRenderManager == null) {
            this.mUseTextureRender = 0;
            TTVideoEngineLog.m256503e("TTVideoEngine", "couldn't get rendererManager");
            return;
        }
        textureRenderManager.setContext(this.mContext);
        if (mTextureLogListener == null) {
            MyTextureLogListener myTextureLogListener = new MyTextureLogListener();
            mTextureLogListener = myTextureLogListener;
            TextureRenderLog.setOnLogListener(myTextureLogListener);
        }
        boolean z = this.mUseSRTexture;
        this.mPlayBackUsedSR = z;
        if (!z || !this.mAsyncInitSR || this.mTextureRenderer.isSRRenderAvaiable(0)) {
            this.mAsyncInitSR = false;
            if (this.mTextureRenderer.isSRRenderAvaiable(0) && (this.mUseSRTexture || this.mPlayBackUsedSR)) {
                this.mPlayBackUsedSR = true;
                z = true;
            }
            VideoSurface initTextureRender = initTextureRender(z);
            if (initTextureRender == null) {
                this.mUseTextureRender = 0;
                this.mTextureRenderErrorMsg = this.mTextureRenderer.getTextureError();
                TTVideoEngineLog.m256503e("TTVideoEngine", "genOffscreenSurface failed = " + this.mTextureRenderErrorMsg);
                return;
            }
            initTextureRender.ignoreSRResolutionCheck(this.mSRIgnoreRes);
            initTextureRender.setOnDrawFrameListener(new VideoSurface.OnDrawFrameListener() {
                /* class com.ss.ttvideoengine.TTVideoEngine.C654251 */

                @Override // com.ss.texturerender.VideoSurface.OnDrawFrameListener
                public void onDraw(long j) {
                    if (TTVideoEngine.this.mDecodedVideoFirstFrame) {
                        TTVideoEngine.this.mFrameCount++;
                        if (TTVideoEngine.this.mFrameCount >= 3 && TTVideoEngine.this.mTextureSurface != null) {
                            int intOption = TTVideoEngine.this.mTextureSurface.getIntOption(6);
                            if (3 == TTVideoEngine.this.mFrameCount) {
                                TTVideoEngineLog.m256500d("TTVideoEngine", "[SRLog]using sr:" + intOption);
                            }
                            TTVideoEngine.this.mSRStrategy.onSRStatus(intOption, 0);
                        }
                        if (TTVideoEngine.this.mSimpleCallback != null) {
                            TTVideoEngine.this.mSimpleCallback.onFrameDraw(TTVideoEngine.this.mFrameCount, null);
                        }
                    }
                    if (!TTVideoEngine.this.mTextureFirstFrame && TTVideoEngine.this.mDecodedVideoFirstFrame) {
                        TTVideoEngineLog.m256500d("TTVideoEngine", "recive first frame render from texture");
                        TTVideoEngine.this.mTextureFirstFrame = true;
                    }
                    if (TTVideoEngine.this.mPlayerFirstFrame && !TTVideoEngine.this.mTexNotifyFirstFrame && TTVideoEngine.this.mShouldPlay && TTVideoEngine.this.mFirstFrameOpenTexture != 1) {
                        TTVideoEngineLog.m256500d("TTVideoEngine", "render start by texture, state =" + TTVideoEngine.this.mPlaybackState);
                        TTVideoEngine.this._renderStart();
                    }
                }
            });
            initTextureRender.setOnErrorListener(new VideoSurface.OnErrorListener() {
                /* class com.ss.ttvideoengine.TTVideoEngine.C654262 */

                @Override // com.ss.texturerender.VideoSurface.OnErrorListener
                public void onError(int i) {
                    int i2;
                    TTVideoEngine.this.mTextureRenderError = i;
                    if (i == 1 || i == 2) {
                        TTVideoEngineLog.m256500d("TTVideoEngine", "sr fail : " + i);
                        if (i == 1) {
                            i2 = -7896;
                        } else {
                            i2 = -7895;
                        }
                        TTVideoEngine.this.mSRStrategy.onSRStatus(2, i2);
                    }
                }
            });
            initTextureRender.setIntOption(3, 1);
            if (this.mOverlayMode == 2) {
                i = 1;
            }
            initTextureRender.setIntOption(2, i);
            while (!this.mEffectBundle.isEmpty()) {
                initTextureRender.setEffect(this.mEffectBundle.poll());
            }
            TTVideoEngineLog.m256505i("TTVideoEngine", "get a surface = " + initTextureRender);
            this.mTextureSurface = initTextureRender;
            return;
        }
        TTVideoEngineLog.m256505i("TTVideoEngine", "sr instance not exist, useSR:" + z + ", asyncInitSR:" + this.mAsyncInitSR);
        this.mUseSRTexture = false;
    }

    private void _configHardwareDecode() {
        IVideoModel iVideoModel;
        boolean z;
        int vodInt = SettingsHelper.helper().getVodInt("config_hardware_type", 0);
        this.mLogger.setIntOption(95, vodInt);
        if (vodInt > 0) {
            TTVideoEngineLog.m256505i("TTVideoEngine", "settings hardware config " + vodInt);
            if (vodInt == SettingsHelper.HARDWARE_CONFIG_VIDEO_MODEL) {
                IVideoModel iVideoModel2 = this.mVideoModel;
                if (iVideoModel2 != null) {
                    String videoRefStr = iVideoModel2.getVideoRefStr(223);
                    if (!TextUtils.isEmpty(videoRefStr) && videoRefStr.equals("hw")) {
                        this.mHardwareDecodeEnablePlayer2 = 1;
                    }
                    TTVideoEngineLog.m256505i("TTVideoEngine", "using videoModel hardware: " + this.mHardwareDecodeEnablePlayer2);
                }
            } else if (vodInt == SettingsHelper.HARDWARE_CONFIG_SETTINGS) {
                JSONArray vodJsonArray = SettingsHelper.helper().getVodJsonArray("hw_nin_tags");
                if (vodJsonArray != null && this.mTag != null) {
                    int i = 0;
                    while (true) {
                        if (i >= vodJsonArray.length()) {
                            break;
                        } else if (this.mTag.equals(vodJsonArray.optString(i))) {
                            z = true;
                            break;
                        } else {
                            i++;
                        }
                    }
                }
                z = false;
                if (!z) {
                    this.mHardwareDecodeEnablePlayer2 = SettingsHelper.helper().getVodInt("hardware_decode", 0);
                    if (this.mVideoModel != null) {
                        this.mAsyncInitEnable = SettingsHelper.helper().getVodInt("hardware_async_init", 1);
                    }
                }
                TTVideoEngineLog.m256505i("TTVideoEngine", "using settings hardware: " + this.mHardwareDecodeEnablePlayer2 + ", async = " + this.mAsyncInitEnable + ", ninTag = " + z);
            }
        } else if ((!this.mHasSetHardWare || this.mUseServerDecodingMode) && (iVideoModel = this.mVideoModel) != null) {
            String videoRefStr2 = iVideoModel.getVideoRefStr(223);
            if (!TextUtils.isEmpty(videoRefStr2) && videoRefStr2.equals("hw")) {
                this.mHardwareDecodeEnablePlayer2 = 1;
            }
        }
        if (this.mMediaPlayer.getPlayerType() != 1 && this.mMediaPlayer.getPlayerType() != 2) {
            this.mHardwareDecodeEnablePlayer2 = 0;
        }
    }

    private void _fetchVideoInfo() {
        String str;
        VideoModelCache.VideoModelCacheInfo videoModelCacheInfo;
        Handler handler;
        boolean z = true;
        this.mState = 1;
        _resetUrlIndexMap();
        String _getAPIString = _getAPIString();
        if (this.mIsUseBoe) {
            _getAPIString = TTHelper.buildBoeUrl(_getAPIString);
        }
        String BuildHttpsApi = TTVideoEngineUtils.BuildHttpsApi(_getAPIString);
        this.mAPIString = BuildHttpsApi;
        boolean z2 = false;
        TTVideoEngineLog.m256505i("TTVideoEngine", String.format("start to fetch video info:%s", BuildHttpsApi));
        if (this.mVideoModelCache != null && !TextUtils.isEmpty(this.mVideoID) && this.mUseVideoModelCache) {
            boolean isNetAvailable = NetUtils.isNetAvailable(this.mContext);
            if (((this.mErrorCount <= 1 && isNetAvailable) || !isNetAvailable) && (videoModelCacheInfo = this.mVideoModelCache.get(this.mVideoID, this.mAPIString)) != null && (!videoModelCacheInfo.isExpired || (videoModelCacheInfo.isExpired && !isNetAvailable && DataLoaderHelper.getDataLoader().isRunning() && this.mDataLoaderEnable > 0))) {
                TTVideoEngineLog.m256505i("TTVideoEngine", "using videomodel cache");
                this.mLogger.setIsVideoModelCache(1);
                VideoModel videoModel = videoModelCacheInfo.model;
                this.mVideoModel = videoModel;
                _logFetchedVideoInfo(videoModel);
                if (this.mVideoInfoListener != null) {
                    if (!this.mLooperThread.checkSendMainLooper()) {
                        IVideoModel iVideoModel = this.mVideoModel;
                        if (iVideoModel instanceof VideoModel) {
                            z2 = this.mVideoInfoListener.onFetchedVideoInfo((VideoModel) iVideoModel);
                        }
                    } else if (this.mWaitForFetchInfoResult) {
                        this.mLooperThread.sendMainLooperMessage(PLAYER_OPTION_USE_THREAD_POOL, 0, 0, this.mVideoModel);
                        this.mLooperThread.mMainMsgRetValue.setDataPosition(0);
                        if (this.mLooperThread.mMainMsgRetValue.readInt() != 1) {
                            z = false;
                        }
                        z2 = z;
                    } else {
                        this.mLooperThread.postMainLooperMessage(PLAYER_OPTION_USE_THREAD_POOL, 0, 0, this.mVideoModel);
                    }
                    if (z2) {
                        return;
                    }
                }
                if (!this.mAsyncPlayHitVMCache || (handler = this.mHandler) == null) {
                    _parseIPAddress(this.mVideoModel);
                    return;
                }
                try {
                    handler.post(new Runnable() {
                        /* class com.ss.ttvideoengine.TTVideoEngine.RunnableC654306 */

                        public void run() {
                            TTVideoEngine tTVideoEngine = TTVideoEngine.this;
                            tTVideoEngine._parseIPAddress(tTVideoEngine.mVideoModel);
                        }
                    });
                    return;
                } catch (Exception e) {
                    TTVideoEngineLog.m256503e("TTVideoEngine", e.toString());
                    _parseIPAddress(this.mVideoModel);
                    return;
                }
            }
        }
        if (this.mUseVideoModelCache) {
            this.mLogger.setIsVideoModelCache(0);
        }
        this.mIsFetchingInfo = true;
        VideoInfoFetcher videoInfoFetcher = new VideoInfoFetcher(this.mContext, getNetClientSetByUser(), this.mTag);
        this.mFetcher = videoInfoFetcher;
        videoInfoFetcher.setVideoID(this.mVideoID);
        this.mFetcher.setUseVideoModelCache(this.mUseVideoModelCache);
        this.mFetcher.setPlayType(this.mPlayType);
        if (this.mUseFallbackAPI.booleanValue() && this.mFallbackAPI != null) {
            this.mFetcher.setUseFallbakApi(this.mUseFallbackAPI);
        }
        this.mFetcher.setListener(new MyFetcherListener(this));
        VideoInfoFetcher videoInfoFetcher2 = this.mFetcher;
        String str2 = this.mAPIString;
        int i = this.mPlayAPIVersion;
        if (i == 2 || i == 4) {
            str = null;
        } else {
            str = this.mAuthorization;
        }
        videoInfoFetcher2.fetchInfo(str2, str, i, this.mKeyseed);
        this.mFetcher.setResolutionMap(this.mResolutionMap);
    }

    private void _updateLogTime() {
        MediaPlayer mediaPlayer = this.mMediaPlayer;
        if (this.mLogger != null && mediaPlayer != null && !this.mHasFirstFrameShown) {
            long longOption = mediaPlayer.getLongOption(68, 0);
            this.mLogger.setDNSParseTime(longOption, 1);
            this.mLogger.setTranConnectTime(mediaPlayer.getLongOption(69, 0));
            this.mLogger.setTranFirstPacketTime(mediaPlayer.getLongOption(70, 0));
            this.mLogger.setAudioDNSParseTime(mediaPlayer.getLongOption(267, 0), 1);
            this.mLogger.setAudioTranConnectTime(mediaPlayer.getLongOption(268, 0));
            this.mLogger.setAudioTranFirstPacketTime(mediaPlayer.getLongOption(269, 0));
            this.mLogger.setReceiveFirstVideoFrameTime(mediaPlayer.getLongOption(75, 0));
            this.mLogger.setReceiveFirstAudioFrameTime(mediaPlayer.getLongOption(76, 0));
            this.mLogger.setDecodeFirstVideoFrameTime(mediaPlayer.getLongOption(77, 0));
            this.mLogger.setDecodeFirstAudioFrameTime(mediaPlayer.getLongOption(78, 0));
            this.mLogger.setPlayerHostAddr(mediaPlayer.getStringOption(71));
            this.mLogger.deviceStartTime(1, mediaPlayer.getLongOption(156, -1));
            this.mLogger.deviceStartTime(0, mediaPlayer.getLongOption(155, -1));
            this.mLogger.devicedOpenedTime(1, mediaPlayer.getLongOption(163, -1));
            this.mLogger.devicedOpenedTime(0, mediaPlayer.getLongOption(162, -1));
            long longOption2 = mediaPlayer.getLongOption(210, 0);
            this.mLogger.setFirstPlayerFirstFrameTime(longOption2);
            if (longOption > 0) {
                this.mLogger.setDNSEndTime(longOption);
            }
            long longOption3 = mediaPlayer.getLongOption(622, 0);
            if (longOption3 > 0) {
                this.mLogger.setDNSStartTime(longOption3, 1);
            }
            long longOption4 = mediaPlayer.getLongOption(623, 0);
            if (longOption4 > 0) {
                this.mLogger.setLongOption(66, longOption4);
            }
            this.mLogger.setLongOption(67, mediaPlayer.getLongOption(620, 0));
            this.mLogger.setLongOption(68, mediaPlayer.getLongOption(624, 0));
            this.mLogger.setLongOption(78, mediaPlayer.getLongOption(621, 0));
            this.mLogger.setLongOption(69, mediaPlayer.getLongOption(625, 0));
            this.mLogger.setLongOption(70, mediaPlayer.getLongOption(626, 0));
            this.mLogger.setLongOption(71, mediaPlayer.getLongOption(627, 0));
            this.mLogger.setLongOption(72, mediaPlayer.getLongOption(629, 0));
            this.mLogger.setLongOption(73, mediaPlayer.getLongOption(631, 0));
            this.mLogger.setLongOption(74, mediaPlayer.getLongOption(630, 0));
            this.mLogger.setLongOption(75, mediaPlayer.getLongOption(632, 0));
            this.mLogger.setLongOption(76, longOption2);
            this.mLogger.setLongOption(77, mediaPlayer.getLongOption(628, 0));
            this.mLogger.setLongOption(87, mediaPlayer.getLongOption(822, 0));
            this.mLogger.setLongOption(88, mediaPlayer.getLongOption(307, 0));
        }
    }

    /* access modifiers changed from: package-private */
    public String _getAPIString() {
        int i;
        if (!TextUtils.isEmpty(this.mFallbackAPI)) {
            try {
                i = JniUtils.getDecodeMethod();
            } catch (Exception unused) {
                i = 0;
            }
            StringBuilder sb = new StringBuilder(this.mFallbackAPI);
            sb.append(String.format("&method=%d", Integer.valueOf(i)));
            if (!TextUtils.isEmpty(this.mForceCodec)) {
                sb.append(String.format("&%s=%s", "force_codec", this.mForceCodec));
            }
            String sb2 = sb.toString();
            TTVideoEngineLog.m256505i("TTVideoEngine", String.format("api string from fallback api:%s", sb2));
            return sb2;
        } else if (this.mDataSource == null) {
            return null;
        } else {
            HashMap hashMap = new HashMap();
            boolean tryLoadPlayerPlugin = MediaPlayerWrapper.tryLoadPlayerPlugin();
            String value = TTPlayerConfiger.getValue(14, "");
            if (tryLoadPlayerPlugin) {
                if (this.mDashEnabled) {
                    hashMap.put("format_type", "dash");
                }
                if (this.mCodecType.equals("bytevc2")) {
                    hashMap.put("codec_type", "4");
                } else if (this.mCodecType.equals("bytevc1")) {
                    hashMap.put("codec_type", "3");
                }
            } else {
                this.mHardwareDecodeEnablePlayer2 = 0;
            }
            if (this.mPlayerType == 2 && this.mDrmType == 2) {
                hashMap.put("format_type", "mpd");
            }
            if (this.mEnableHttps || this.mRetryEnableHttps) {
                this.mHttpsEnabled = true;
                hashMap.put("ssl", "1");
            } else {
                this.mHttpsEnabled = false;
            }
            hashMap.put("player_version", value);
            if (this.mEnableMaskThread > 1) {
                hashMap.put("barragemask", "1");
            }
            hashMap.put("cdn_type", String.valueOf(this.mP2PCDNType));
            int networkScore = TTNetWorkListener.MyNetworkQualityHelper.getInstance().getNetworkScore();
            if (networkScore != -1) {
                hashMap.put("network_score", String.valueOf(networkScore));
            }
            if (!TextUtils.isEmpty(this.mForceCodec)) {
                hashMap.put("force_codec", this.mForceCodec);
            }
            TTVideoEngineLog.m256505i("TTVideoEngine", hashMap.toString());
            String apiForFetcher = this.mDataSource.apiForFetcher(hashMap, this.mPlayAPIVersion);
            TTVideoEngineLog.m256505i("TTVideoEngine", "api string from apiForFetcher:" + apiForFetcher);
            return apiForFetcher;
        }
    }

    public void _renderStart() {
        int i;
        TTVideoEngineLog.m256505i("TTVideoEngine", "start to render,this:" + this);
        if (this.mShouldPlay) {
            _updatePlaybackState(1);
        }
        _logFirstFrame();
        _setupSubtitleInfo();
        this.mTexNotifyFirstFrame = true;
        if (this.mPlayBackUsedSR) {
            if (this.mAsyncInitSR && this.mTextureSurface == null) {
                this.mSRNotUseReason = -7898;
                EngineThreadPool.addExecuteTask(new Runnable() {
                    /* class com.ss.ttvideoengine.TTVideoEngine.RunnableC654339 */

                    public void run() {
                        VideoSurface initTextureRender = TTVideoEngine.this.initTextureRender(true);
                        if (initTextureRender != null) {
                            initTextureRender.release();
                        }
                        TTVideoEngine.this.mAsyncInitSR = false;
                    }
                });
            }
            if (!(this.mTextureSurface == null || this.mMediaPlayer == null)) {
                Float valueOf = Float.valueOf(this.mContainerFPS);
                TTVideoEngineLog.m256500d("TTVideoEngine", "[SRLog]open sr = " + this.mTextureSrOpen + ",open sr check fps: = " + valueOf);
                SRStrategyConfig sRStrategyConfig = new SRStrategyConfig();
                sRStrategyConfig.setMaxFps(30.0f).setCurrentFps(this.mContainerFPS);
                this.mSRStrategy.updateConfig(sRStrategyConfig);
                if (this.mSRStrategy.getSRStrategyMode() == 1) {
                    if (valueOf.floatValue() <= BitmapDescriptorFactory.HUE_RED || valueOf.floatValue() >= 31.0f) {
                        this.mTextureSrOpen = 0;
                        i = -7892;
                    } else {
                        i = 0;
                    }
                    TTVideoEngineLog.m256500d("TTVideoEngine", "[SRLog]open sr after first frame render open=" + this.mTextureSrOpen);
                    doOpenSR(this.mTextureSrOpen, i);
                }
            }
        }
        if (!this.mSRStrategy.shouldUseSRTexture() && !this.mSRStrategy.isSRSatisfied()) {
            SRStrategy sRStrategy = this.mSRStrategy;
            sRStrategy.onSRStatus(0, sRStrategy.getSRNotUseReason());
        }
        _updateLoadState(1, -1);
        PlayDurationManager playDurationManager = this.mPlayDuration;
        if (playDurationManager != null) {
            playDurationManager.start();
        }
        if (this.mTestNetSpeed >= 0 && this.mMediaPlayer != null && this.mTestNetSpeedDiff > 0) {
            this.mTestNetSpeedHandler = new Handler();
            AnonymousClass10 r0 = new Runnable() {
                /* class com.ss.ttvideoengine.TTVideoEngine.AnonymousClass10 */

                public void run() {
                    if (TTVideoEngine.this.mMediaPlayer != null) {
                        long longOption = TTVideoEngine.this.mMediaPlayer.getLongOption(63, 0);
                        int i = (longOption > 0 ? 1 : (longOption == 0 ? 0 : -1));
                        if (i >= 0 && TTVideoEngine.this.mTestNetSpeedListener != null) {
                            TTVideoEngine.this.mTestNetSpeedListener.onSpeedReceive(longOption);
                        }
                        if ((TTVideoEngine.this.mTestNetSpeed == 1 || (TTVideoEngine.this.mTestNetSpeed == 0 && i < 0)) && TTVideoEngine.this.mTestNetSpeedDiff > 0) {
                            TTVideoEngine.this.mTestNetSpeedHandler.postDelayed(TTVideoEngine.this.mTestNetSpeedRunable, (long) TTVideoEngine.this.mTestNetSpeedDiff);
                        }
                    }
                }
            };
            this.mTestNetSpeedRunable = r0;
            Handler handler = this.mTestNetSpeedHandler;
            int i2 = this.mTestNetSpeedDiff;
            handler.postDelayed(r0, (long) (i2 + (i2 / 2)));
        }
        if (this.mRetrying) {
            if (this.mLastPlaybackTime != 0 && !isInHousePlayer()) {
                _seekTo(this.mLastPlaybackTime, this.mRetrying);
            }
            this.mRetrying = false;
            this.mLogger.retryFinish();
        }
        if (this.mStartTime != 0 && !isInHousePlayer()) {
            _seekTo(this.mStartTime, this.mSeamSwitchingResolution);
        }
        this.mStartTime = 0;
        if (this.mSeamSwitchingResolution) {
            if (this.mLastPlaybackTime == 0 || isInHousePlayer()) {
                this.mSeamSwitchingResolution = false;
                changeResolutionSwitchingState(false);
                IVideoEventLogger iVideoEventLogger = this.mLogger;
                if (iVideoEventLogger != null) {
                    iVideoEventLogger.switchResolutionEnd(true);
                }
            } else {
                _seekTo(this.mLastPlaybackTime, this.mSeamSwitchingResolution);
            }
        }
        this.mErrorCount = 0;
        this.mBestResolutionType = 0;
        if (this.mLooperThread.checkSendMainLooper()) {
            this.mLooperThread.postMainLooperMessage(406, 0, 0, this.mTraceId);
        } else {
            if (this.mVideoEngineListener != null) {
                TTVideoEngineLog.m256505i("TTVideoEngine", "notify render start");
                this.mVideoEngineListener.onRenderStart(this);
            }
            if (this.mSimpleCallback != null) {
                TTVideoEngineLog.m256505i("TTVideoEngine", "notify render start");
                this.mSimpleCallback.onRenderStart(this);
            }
        }
        setPlayInfo(0, (long) this.mDuration);
    }

    public void _updateLogger() {
        MediaPlayer mediaPlayer = this.mMediaPlayer;
        IVideoEventLogger iVideoEventLogger = this.mLogger;
        if (iVideoEventLogger != null) {
            if (mediaPlayer != null) {
                iVideoEventLogger.curVideoOutputFps(mediaPlayer.getFloatOption(150, BitmapDescriptorFactory.HUE_RED));
                this.mLogger.containerFps(mediaPlayer.getFloatOption(151, BitmapDescriptorFactory.HUE_RED));
                this.mLogger.curVideoDecoderFps(mediaPlayer.getIntOption(186, -1));
                this.mLogger.clockDiff(mediaPlayer.getLongOption(152, -1));
                this.mLogger.dropCount(mediaPlayer.getIntOption(153, -1));
                this.mLogger.enableSharp(mediaPlayer.getIntOption(189, -1));
                this.mLogger.curVideoDecodeError(mediaPlayer.getIntOption(221, -1));
                this.mLogger.curAudioDecodeError(mediaPlayer.getIntOption(222, -1));
                this.mLogger.curVideoRenderError(mediaPlayer.getIntOption(245, -1));
                if (this.mHardwareDecodeEnablePlayer2 > 0) {
                    this.mLogger.hwCodecName(mediaPlayer.getStringOption(187));
                    this.mLogger.hwCodecException(mediaPlayer.getIntOption(188, -1));
                }
                if (this.mPlaybackState != 0) {
                    this.mLogger.setAudioBufferLength(mediaPlayer.getLongOption(73, -1));
                    this.mLogger.setVideoBufferLength(mediaPlayer.getLongOption(72, -1));
                }
                this.mLogger.setTextureRenderError(this.mTextureRenderErrorMsg);
                this.mLogger.setLongOption(21, mediaPlayer.getLongOption(171, -1));
                this.mLogger.setLongOption(82, mediaPlayer.getLongOption(850, 0));
                this.mLogger.setLongOption(84, mediaPlayer.getLongOption(851, 0));
                this.mLogger.setLongOption(85, mediaPlayer.getLongOption(852, 0));
                int intOption = mediaPlayer.getIntOption(62, -100);
                int intOption2 = mediaPlayer.getIntOption(61, -100);
                if (intOption == 0) {
                    this.mLogger.setIntOption(12, 1);
                } else {
                    this.mLogger.setIntOption(12, 0);
                }
                if (intOption2 == 0) {
                    this.mLogger.setIntOption(13, 1);
                } else {
                    this.mLogger.setIntOption(13, 0);
                }
                this.mLogger.setIntOption(89, mediaPlayer.getIntOption(912, -1));
                _updateLogTime();
                HashMap hashMap = new HashMap();
                hashMap.put("abrv", this.mAbrVer);
                hashMap.put("used", Integer.valueOf(this.mABRUsed ? 1 : 0));
                hashMap.put("pcnt", Integer.valueOf(mediaPlayer.getIntOption(179, 0)));
                hashMap.put("scnt", Integer.valueOf(mediaPlayer.getIntOption(173, 0)));
                hashMap.put("apbr", Integer.valueOf(mediaPlayer.getIntOption(174, 0)));
                hashMap.put("apsp", Float.valueOf(mediaPlayer.getFloatOption(175, BitmapDescriptorFactory.HUE_RED)));
                hashMap.put("adbr", Integer.valueOf(mediaPlayer.getIntOption(610, 0)));
                hashMap.put("npad", Float.valueOf(this.mAverageDownloadSpeed));
                hashMap.put("npap", Float.valueOf(this.mAveragePredictSpeed));
                hashMap.put("adob", Integer.valueOf(mediaPlayer.getIntOption(615, 0)));
                hashMap.put("aplb", Integer.valueOf(mediaPlayer.getIntOption(614, 0)));
                hashMap.put("avbl", Float.valueOf(mediaPlayer.getFloatOption(616, BitmapDescriptorFactory.HUE_RED)));
                hashMap.put("iast", Integer.valueOf(this.mStandAlongAbrStartUp));
                hashMap.put("acsm", Integer.valueOf(C20873c.m75969c()));
                hashMap.put("stbr", Long.valueOf(this.mStartUpBitrate));
                hashMap.put("uebr", Long.valueOf(this.mUserExpectedBitrate));
                hashMap.put("stre", this.mStartUpResolution);
                hashMap.put("dgbt", Long.valueOf(this.mDowngradeBitrate));
                this.mLogger.setAbrInfo(hashMap);
                if (this.mABRUsed || this.mStandAlongAbrStartUp > 0) {
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put("adtp", Integer.valueOf(sABRAlgorithmType));
                    hashMap2.put("sptp", Integer.valueOf(sNetSpeedAbrPredictType));
                    hashMap2.put("astp", Integer.valueOf(C20873c.m75975e()));
                    hashMap2.put("mcbr", Long.valueOf(this.mMaxCacheBitrate));
                    hashMap2.put("stsp", Float.valueOf(this.mAbrStartUpSpeed));
                    hashMap2.put("spsp", Float.valueOf(this.mAbrStartUpPredictSpeed));
                    hashMap2.put("sasp", Float.valueOf(this.mAbrStartUpAverageSpeed));
                    hashMap2.put("stfs", Long.valueOf(this.mAbrStartupBitrateBeforeFitScreen));
                    ArrayList arrayList = new ArrayList();
                    IVideoModel iVideoModel = this.mVideoModel;
                    if (iVideoModel != null) {
                        List<VideoInfo> videoInfoList = iVideoModel.getVideoInfoList();
                        if (videoInfoList == null) {
                            videoInfoList = Collections.emptyList();
                        }
                        for (VideoInfo videoInfo : videoInfoList) {
                            if (videoInfo != null) {
                                HashMap hashMap3 = new HashMap();
                                hashMap3.put("br", Integer.valueOf(videoInfo.getValueInt(3)));
                                String valueStr = videoInfo.getValueStr(32);
                                if (!TextUtils.isEmpty(valueStr)) {
                                    hashMap3.put("def", valueStr);
                                } else {
                                    hashMap3.put("def", _resolutionToString(videoInfo.getResolution()));
                                }
                                arrayList.add(hashMap3);
                            }
                        }
                    }
                    if (arrayList.size() > 0) {
                        hashMap2.put("brs", arrayList.toArray());
                    }
                    this.mLogger.setAbrGeneralInfo(hashMap2);
                }
            }
            this.mLogger.setIntOption(11, this.mRadioModeEnable);
            this.mLogger.setIntOption(79, isplaybackUsedSR() ? 1 : 0);
            this.mLogger.setIntOption(80, this.mReadCacheMode);
            this.mLogger.setIntOption(81, this.mAutoRangeOffset);
        }
    }

    public static void configBoeSuffix(String str) {
        TTHelper.configBoeSuffix(str);
    }

    public static void onlyUseMediaLoader(boolean z) {
        ONLY_USE_MEDIALOADER = z;
    }

    public static void setAllQualityInfos(String[] strArr) {
        mQualityInfos = strArr;
    }

    public static void setDefaultABRAlgorithm(int i) {
        sABRAlgorithmType = i;
    }

    public static void setForceUseLitePlayer(boolean z) {
        mForceUseLitePlayer = z;
    }

    public static void setForceUsePluginPlayer(boolean z) {
        mForceUsePluginPlayer = z;
    }

    public static void setGlobalNetworkClient(TTVNetClient tTVNetClient) {
        TTVideoEngineConfig.gNetClient = tTVNetClient;
    }

    public static void setHTTPDNSFirst(boolean z) {
        HTTP_DNS_FIRST = z;
    }

    public static void setSpeedPredictorListener(AbstractC20890e eVar) {
        StrategyCenter.setSpeedPredictorListener(eVar);
    }

    public static void setSpeedPredictorMlConfig(AbstractC20891f fVar) {
        StrategyCenter.setSpeedPredictorMlConfig(fVar);
    }

    public static void setTTDNSServerHost(String str) {
        HTTPDNS.setTTDNSServerHost(str);
    }

    public static void setupNewSpeedPredictorConfigInfo(Map map) {
        StrategyCenter.setConfigInfo(map);
    }

    public boolean getLooping(boolean z) {
        return this.mLooping;
    }

    public void setABRListener(ABRListener aBRListener) {
        this.mABRListener = aBRListener;
    }

    public void setCacheControlEnabled(boolean z) {
        this.mCacheControlEnabled = z;
    }

    public void setCacheFilePathListener(CacheFilePathListener cacheFilePathListener) {
        this.mCacheFilePathListener = cacheFilePathListener;
    }

    public void setDataSource(DataSource dataSource) {
        this.mDataSource = dataSource;
    }

    public void setGroupID(String str) {
        this.mGroupID = str;
    }

    public void setLensParams(Bundle bundle) {
        this.mLensBundle = bundle;
    }

    public void setLoadControl(LoadControl loadControl) {
        this.mLoadControlInterface = loadControl;
    }

    public void setNetworkClient(TTVNetClient tTVNetClient) {
        this.mNetClient = tTVNetClient;
    }

    public void setPlayerEventListener(PlayerEventSimpleListener playerEventSimpleListener) {
        this.mPlayerEventListener = playerEventSimpleListener;
    }

    public void setSARChangeListener(SARChangeListener sARChangeListener) {
        this.mSARChangeListener = sARChangeListener;
    }

    public void setStreamInfoListener(StreamInfoListener streamInfoListener) {
        this.mStreamInfoListener = streamInfoListener;
    }

    public void setSubTag(String str) {
        this.mSubTag = str;
    }

    public void setTTHlsDrmToken(String str) {
        this.mTTHlsDrmToken = str;
    }

    public void setTag(String str) {
        this.mTag = str;
    }

    public void setVideoBufferDetailListener(VideoBufferDetailListener videoBufferDetailListener) {
        this.mVideoBufferDetailListener = videoBufferDetailListener;
    }

    public void setVideoEngineGetInfoListener(VideoEngineGetInfoListener videoEngineGetInfoListener) {
        this.mVideoEngineGetInfoListener = videoEngineGetInfoListener;
    }

    public void setVideoEngineInfoListener(VideoEngineInfoListener videoEngineInfoListener) {
        this.mVideoEngineInfoListener = videoEngineInfoListener;
    }

    public void setVideoEngineSimpleCallback(VideoEngineSimpleCallback videoEngineSimpleCallback) {
        setVideoEngineCallback(videoEngineSimpleCallback);
    }

    public void setVideoModel(VideoModel videoModel) {
        setVideoModel((IVideoModel) videoModel);
    }

    public void setVideoURLRouteListener(VideoURLRouteListener videoURLRouteListener) {
        this.mVideoRouteListener = videoURLRouteListener;
    }

    public static void addPreloadModelMedia(PreloadModelMedia preloadModelMedia) {
        DataLoaderHelper.getDataLoader().addPreloadModelMedia(preloadModelMedia);
    }

    public static void addPreloadURLMedia(PreloadURLMedia preloadURLMedia) {
        DataLoaderHelper.getDataLoader().addPreloadUrlMedia(preloadURLMedia);
    }

    public static void addTask(PreloaderURLItem preloaderURLItem) {
        DataLoaderHelper.getDataLoader().addTask(preloaderURLItem);
    }

    public static void cancelPreloadTask(String str) {
        DataLoaderHelper.getDataLoader().cancelTask(str);
    }

    public static void cancelPreloadTaskByFilePath(String str) {
        DataLoaderHelper.getDataLoader().cancelTaskByFilePath(str);
    }

    public static void cancelPreloadTaskByVideoId(String str) {
        DataLoaderHelper.getDataLoader().cancelTaskByVideoId(str);
    }

    public static void copyDataLoaderCache(CopyCacheItem copyCacheItem) {
        DataLoaderHelper.getDataLoader().copyCache(copyCacheItem);
    }

    public static void disableAutoTrim(String str) {
        DataLoaderHelper.getDataLoader().disableAutoTrim(str);
    }

    public static void enableAutoTrim(String str) {
        DataLoaderHelper.getDataLoader().enableAutoTrim(str);
    }

    public static void forceRemoveCacheFile(String str) {
        DataLoaderHelper.getDataLoader().forceRemoveCacheFile(str);
    }

    public static String getEngineUniqueId(Context context) {
        return DrmUtils.getEngineUniqueId(context);
    }

    public static void preConnect(String str) {
        DataLoaderHelper.getDataLoader().preConnect(str);
    }

    public static void removeCacheFile(String str) {
        DataLoaderHelper.getDataLoader().removeCacheFile(str);
    }

    public static void setApplicationContext(Context context) {
        DataLoaderHelper.getDataLoader().setContext(context);
    }

    public static void setDataLoaderNetworkClient(TTVNetClient tTVNetClient) {
        DataLoaderHelper.getDataLoader().setNetworkClient(tTVNetClient);
    }

    public static void setLoaderEventListener(LoaderListener loaderListener) {
        DataLoaderHelper.getDataLoader().setLoaderEventListener(loaderListener);
    }

    public static final void setNetworkRTTLevelListener(networkRTTLevelListener networkrttlevellistener) {
        TTNetWorkListener.getInstance().setNetworkRTTLevelListener(networkrttlevellistener);
    }

    public static void setPlayTaskProgress(float f) {
        DataLoaderHelper.getDataLoader().setPlayTaskProgress(f);
    }

    public static void setPreloadTaskConfigs(List<PreloadTaskConfig> list) {
        DataLoaderHelper.getDataLoader().setTaskConfigs(list);
    }

    public static void setProbeIntervalMS(int i) {
        DataLoaderHelper.getDataLoader().setProbeIntervalMS(i);
    }

    public static void setProbeType(int i) {
        DataLoaderHelper.getDataLoader().setProbeType(i);
    }

    public static void setStrategyStateSupplier(IStrategyStateSupplier iStrategyStateSupplier) {
        StrategyHelper.helper().setSupplier(iStrategyStateSupplier);
    }

    public static void setVideoEventUploader(IVideoEventUploader iVideoEventUploader) {
        VideoEventManager.instance.setUploader(iVideoEventUploader);
    }

    public void _logFetchedFailed(Error error) {
        this.mLogger.fetchInfoComplete((VideoModel) null, error);
    }

    public void _logFetchedVideoInfo(IVideoModel iVideoModel) {
        this.mLogger.fetchInfoComplete(iVideoModel, (Error) null);
    }

    public void _logMessage(String str) {
        this.mLogger.logMessage(str);
    }

    public int getIntOption(int i) {
        return _doGetIntOption(i);
    }

    public long getLongOption(int i) {
        return _doGetLongOption(i);
    }

    public String getStringOption(int i) {
        return _doGetStringOption(i);
    }

    public void setSpeedShiftConfig(SpeedShiftConfig speedShiftConfig) {
        this.mSpeedShiftConfig = speedShiftConfig;
        this.mBestResolutionType = 3;
    }

    /* access modifiers changed from: private */
    public static class MyABRInfoListener implements IABRInfoListener {
        private final WeakReference<TTVideoEngine> mVideoEngineRef;

        public MyABRInfoListener(TTVideoEngine tTVideoEngine) {
            this.mVideoEngineRef = new WeakReference<>(tTVideoEngine);
        }

        public void onInfo(int i, int i2) {
            TTVideoEngine tTVideoEngine = this.mVideoEngineRef.get();
            if (tTVideoEngine != null && i == 1) {
                tTVideoEngine._onABRGetPredictResult();
            }
        }
    }

    /* access modifiers changed from: private */
    public static class MyBufferingUpdateListener implements MediaPlayer.OnBufferingUpdateListener {
        private final WeakReference<TTVideoEngine> mVideoEngineRef;

        public MyBufferingUpdateListener(TTVideoEngine tTVideoEngine) {
            this.mVideoEngineRef = new WeakReference<>(tTVideoEngine);
        }

        @Override // com.ss.ttm.player.MediaPlayer.OnBufferingUpdateListener
        public void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
            TTVideoEngine tTVideoEngine = this.mVideoEngineRef.get();
            if (tTVideoEngine != null) {
                if (tTVideoEngine.mIsLocal) {
                    i = 100;
                }
                tTVideoEngine.mLoadedProgress = i;
                tTVideoEngine.setPlayInfo(2, (long) i);
                if (tTVideoEngine.mLooperThread.checkSendMainLooper()) {
                    tTVideoEngine.mLooperThread.postMainLooperMessage(403, i, 0, null);
                    return;
                }
                if (tTVideoEngine.mVideoEngineListener != null) {
                    tTVideoEngine.mVideoEngineListener.onBufferingUpdate(tTVideoEngine, i);
                }
                if (tTVideoEngine.mSimpleCallback != null) {
                    tTVideoEngine.mSimpleCallback.onBufferingUpdate(tTVideoEngine, i);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public static class MyCompletionListener implements MediaPlayer.OnCompletionListener {
        private final WeakReference<TTVideoEngine> mVideoEngineRef;

        public MyCompletionListener(TTVideoEngine tTVideoEngine) {
            this.mVideoEngineRef = new WeakReference<>(tTVideoEngine);
        }

        @Override // com.ss.ttm.player.MediaPlayer.OnCompletionListener
        public void onCompletion(MediaPlayer mediaPlayer) {
            TTVideoEngine tTVideoEngine = this.mVideoEngineRef.get();
            if (tTVideoEngine != null) {
                TTVideoEngineLog.m256505i("TTVideoEngine", "receive onCompletion,this:" + tTVideoEngine);
                tTVideoEngine.mLogger.watchFinish();
                if (!tTVideoEngine.mLooping) {
                    tTVideoEngine.mIsPlayComplete = true;
                    tTVideoEngine._updatePlaybackState(0);
                    if (tTVideoEngine.mPlayDuration != null) {
                        tTVideoEngine.mPlayDuration.stop();
                        tTVideoEngine.mLogger.addWatchedDuration(tTVideoEngine.mPlayDuration.getPlayedDuration());
                    }
                    if (tTVideoEngine.mPosUpdateInterval > 0) {
                        tTVideoEngine.mCurPosition = tTVideoEngine.mDuration;
                    }
                    tTVideoEngine.mLogger.curPlayBackTime(tTVideoEngine.mDuration);
                    tTVideoEngine._updateLogger();
                    tTVideoEngine.mLogger.movieFinish(3);
                    tTVideoEngine.mHasFirstFrameShown = false;
                    tTVideoEngine.mHasFetchedSubtitle = false;
                    tTVideoEngine.mPlayStartTime = -1;
                    tTVideoEngine.mRenderStartTime = -1;
                    tTVideoEngine.mHasAudioFirstFrameShown = false;
                    tTVideoEngine.mSeamSwitchingResolution = false;
                    tTVideoEngine.changeResolutionSwitchingState(false);
                    tTVideoEngine.mLastPlaybackTime = 0;
                    tTVideoEngine.mRetrying = false;
                    tTVideoEngine.mStarted = false;
                    tTVideoEngine.mHasComplete = true;
                    tTVideoEngine.mSeeking = false;
                    tTVideoEngine._updateTextureState(3);
                } else {
                    tTVideoEngine.mLogger.loopAgain();
                }
                if (tTVideoEngine.mLooperThread.checkSendMainLooper()) {
                    tTVideoEngine.mLooperThread.postMainLooperMessage(408, 0, 0, null);
                } else {
                    if (tTVideoEngine.mVideoEngineListener != null) {
                        tTVideoEngine.mVideoEngineListener.onCompletion(tTVideoEngine);
                    }
                    if (tTVideoEngine.mSimpleCallback != null) {
                        tTVideoEngine.mSimpleCallback.onCompletion(tTVideoEngine);
                    }
                }
                if (mediaPlayer.isOSPlayer()) {
                    tTVideoEngine.mPrepared = false;
                }
                tTVideoEngine.mStartTime = 0;
            }
        }
    }

    /* access modifiers changed from: private */
    public static class MyDrmTokenProcessedListener implements IntertrustDrmHelper.IntertrustDrmHelperListener {
        private final WeakReference<TTVideoEngine> mVideoEngineRef;

        public MyDrmTokenProcessedListener(TTVideoEngine tTVideoEngine) {
            this.mVideoEngineRef = new WeakReference<>(tTVideoEngine);
        }

        @Override // com.ss.ttvideoengine.model.IntertrustDrmHelper.IntertrustDrmHelperListener
        public void onError(Error error) {
            TTVideoEngine tTVideoEngine = this.mVideoEngineRef.get();
            if (tTVideoEngine != null && error != null) {
                tTVideoEngine._receivedError(error);
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:26:0x0071  */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x0077  */
        @Override // com.ss.ttvideoengine.model.IntertrustDrmHelper.IntertrustDrmHelperListener
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onTokenProcessed(com.ss.ttvideoengine.utils.Error r7) {
            /*
            // Method dump skipped, instructions count: 176
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.ttvideoengine.TTVideoEngine.MyDrmTokenProcessedListener.onTokenProcessed(com.ss.ttvideoengine.utils.Error):void");
        }
    }

    /* access modifiers changed from: private */
    public static class MyErrorListener implements MediaPlayer.OnErrorListener {
        private final WeakReference<TTVideoEngine> mVideoEngineRef;

        public MyErrorListener(TTVideoEngine tTVideoEngine) {
            this.mVideoEngineRef = new WeakReference<>(tTVideoEngine);
        }

        @Override // com.ss.ttm.player.MediaPlayer.OnErrorListener
        public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
            TTVideoEngine tTVideoEngine = this.mVideoEngineRef.get();
            if (tTVideoEngine == null) {
                return false;
            }
            if (tTVideoEngine.mPlayDuration != null) {
                tTVideoEngine.mPlayDuration.stop();
            }
            tTVideoEngine._updatePlaybackState(3);
            tTVideoEngine._updateLoadState(3, -1);
            String stringOption = mediaPlayer.getStringOption(5002);
            String domainForPlayer = Error.getDomainForPlayer(mediaPlayer);
            P2PStragetyManager.getInstance().setPlayErrororInterrupt(i);
            if (!domainForPlayer.equals("kTTVideoErrorDomainVideoOwnPlayer") || !tTVideoEngine.mRetryingNotHandleError) {
                tTVideoEngine.mError = new Error(domainForPlayer, i, i2, stringOption);
                tTVideoEngine._receivedError(tTVideoEngine.mError);
                return true;
            }
            TTVideoEngineLog.m256505i("TTVideoEngine", "retrying, not handle error: " + i + ", i1:" + i2);
            return true;
        }
    }

    /* access modifiers changed from: private */
    public static class MyFetcherListener implements VideoInfoFetcher.FetcherListener {
        private final WeakReference<TTVideoEngine> mVideoEngineRef;

        public MyFetcherListener(TTVideoEngine tTVideoEngine) {
            this.mVideoEngineRef = new WeakReference<>(tTVideoEngine);
        }

        @Override // com.ss.ttvideoengine.fetcher.VideoInfoFetcher.FetcherListener
        public void onLog(String str) {
            TTVideoEngineLog.m256505i("TTVideoEngine", "fetcher cancelled");
            TTVideoEngine tTVideoEngine = this.mVideoEngineRef.get();
            if (tTVideoEngine != null) {
                tTVideoEngine._logMessage(str);
            }
        }

        @Override // com.ss.ttvideoengine.fetcher.VideoInfoFetcher.FetcherListener
        public void onRetry(Error error) {
            if (error != null) {
                TTVideoEngineLog.m256503e("TTVideoEngine", String.format("fetcher should retry, error:%s", error.toString()));
                TTVideoEngine tTVideoEngine = this.mVideoEngineRef.get();
                if (tTVideoEngine != null) {
                    tTVideoEngine.mLogger.needRetryToFetch(error, tTVideoEngine.mPlayAPIVersion);
                }
            }
        }

        @Override // com.ss.ttvideoengine.fetcher.VideoInfoFetcher.FetcherListener
        public void onStatusException(int i, String str) {
            TTVideoEngine tTVideoEngine = this.mVideoEngineRef.get();
            if (tTVideoEngine != null) {
                TTVideoEngineLog.m256503e("TTVideoEngine", String.format("video status exception:%d", Integer.valueOf(i)));
                tTVideoEngine.mIsFetchingInfo = false;
                if (tTVideoEngine.mLogger != null) {
                    tTVideoEngine.mLogger.movieFinish(i, str);
                }
                if (tTVideoEngine.mLooperThread.checkSendMainLooper()) {
                    tTVideoEngine.mLooperThread.postMainLooperMessage(410, i, 0, null);
                    return;
                }
                if (tTVideoEngine.mVideoEngineListener != null) {
                    tTVideoEngine.mVideoEngineListener.onVideoStatusException(i);
                }
                if (tTVideoEngine.mSimpleCallback != null) {
                    tTVideoEngine.mSimpleCallback.onVideoStatusException(i);
                }
            }
        }

        @Override // com.ss.ttvideoengine.fetcher.VideoInfoFetcher.FetcherListener
        public void onCompletion(VideoModel videoModel, Error error) {
            boolean z;
            TTVideoEngine tTVideoEngine = this.mVideoEngineRef.get();
            if (tTVideoEngine != null) {
                tTVideoEngine.mIsFetchingInfo = false;
                if (videoModel == null || error != null) {
                    TTVideoEngineLog.m256503e("TTVideoEngine", String.format("fetch info failed:%s", error.toString()));
                    if (error != null) {
                        if (error.parameters.containsKey("log_id")) {
                            tTVideoEngine.mLogger.setStringOption(15, (String) error.parameters.get("log_id"));
                        }
                        tTVideoEngine._logFetchedFailed(error);
                        tTVideoEngine._receivedError(error);
                        return;
                    }
                    tTVideoEngine._logFetchedFailed(new Error("kTTVideoErrorDomainFetchingInfo", -9997, "fetch empty"));
                    tTVideoEngine._receivedError(new Error("kTTVideoErrorDomainFetchingInfo", -9997, "fetch empty"));
                    return;
                }
                tTVideoEngine.mVideoModel = videoModel;
                TTVideoEngineLog.m256505i("TTVideoEngine", "fetch info success");
                tTVideoEngine._logFetchedVideoInfo(videoModel);
                tTVideoEngine.mIsDashSource = videoModel.isDashSource();
                tTVideoEngine.mDashEnabled = tTVideoEngine.mIsDashSource;
                if (!tTVideoEngine.mIsPreloaderItem) {
                    if (tTVideoEngine.mVideoInfoListener != null) {
                        if (tTVideoEngine.mLooperThread.checkSendMainLooper()) {
                            if (tTVideoEngine.mWaitForFetchInfoResult) {
                                tTVideoEngine.mLooperThread.sendMainLooperMessage(TTVideoEngine.PLAYER_OPTION_USE_THREAD_POOL, 0, 0, tTVideoEngine.mVideoModel);
                                if (tTVideoEngine.mLooperThread.mMainMsgRetValue.readInt() == 1) {
                                    z = true;
                                }
                            } else {
                                tTVideoEngine.mLooperThread.postMainLooperMessage(TTVideoEngine.PLAYER_OPTION_USE_THREAD_POOL, 0, 0, tTVideoEngine.mVideoModel);
                            }
                            z = false;
                        } else {
                            z = tTVideoEngine.mVideoInfoListener.onFetchedVideoInfo(videoModel);
                        }
                        if (z) {
                            tTVideoEngine.mLogger.fetchedAndLeaveByUser(1);
                            return;
                        }
                        tTVideoEngine.mLogger.fetchedAndLeaveByUser(0);
                    }
                    tTVideoEngine._parseIPAddress(videoModel);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public static class MyFrameMetadataListener implements FrameMetadataListener {
        private final WeakReference<TTVideoEngine> mVideoEngineRef;

        @Override // com.ss.ttm.player.FrameMetadataListener
        public void frameDTSNotify(int i, long j, long j2) {
        }

        @Override // com.ss.ttm.player.FrameMetadataListener
        public void updateFrameTerminatedDTS(int i, long j, long j2) {
        }

        private MyFrameMetadataListener(TTVideoEngine tTVideoEngine) {
            this.mVideoEngineRef = new WeakReference<>(tTVideoEngine);
        }

        @Override // com.ss.ttm.player.FrameMetadataListener
        public void onFrameAboutToBeRendered(int i, long j, long j2, Map<Integer, String> map) {
            TTVideoEngine tTVideoEngine = this.mVideoEngineRef.get();
            if (tTVideoEngine != null && tTVideoEngine.mTextureSurface != null) {
                tTVideoEngine.mTextureSurface.frameMetaCallback(j, j2, map);
            }
        }
    }

    /* access modifiers changed from: private */
    public static class MyInfoListener implements MediaPlayer.OnInfoListener {
        private final WeakReference<TTVideoEngine> mVideoEngineRef;

        public MyInfoListener(TTVideoEngine tTVideoEngine) {
            this.mVideoEngineRef = new WeakReference<>(tTVideoEngine);
        }

        @Override // com.ss.ttm.player.MediaPlayer.OnInfoListener
        public boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
            TTVideoEngine tTVideoEngine = this.mVideoEngineRef.get();
            if (tTVideoEngine == null) {
                return false;
            }
            if (i == 3) {
                TTVideoEngineLog.m256505i("TTVideoEngine", "player callback render start");
                tTVideoEngine._videoRenderStartNotify();
                if (tTVideoEngine.mFirstFrameOpenTexture == 1) {
                    tTVideoEngine.mPlayerFirstFrame = true;
                    tTVideoEngine._renderStart();
                    if (!(tTVideoEngine.mTextureSurface == null || tTVideoEngine.mSurface == null || tTVideoEngine.mSurfaceHolder != null)) {
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        mediaPlayer.setSurface(tTVideoEngine.mTextureSurface);
                        tTVideoEngine.mTextureSurface.updateRenderSurface(tTVideoEngine.mSurface);
                        TTVideoEngineLog.m256505i("TTVideoEngine", "renderstart change to texturesurface,time:" + (SystemClock.elapsedRealtime() - elapsedRealtime));
                    }
                } else if (tTVideoEngine.mTextureSurface == null) {
                    TTVideoEngineLog.m256505i("TTVideoEngine", "render start by player");
                    tTVideoEngine._renderStart();
                } else {
                    tTVideoEngine.mPlayerFirstFrame = true;
                    if (tTVideoEngine.mTextureFirstFrame) {
                        TTVideoEngineLog.m256505i("TTVideoEngine", "render start by player after texture");
                        tTVideoEngine._renderStart();
                    }
                }
                if (!tTVideoEngine.isInHousePlayer()) {
                    tTVideoEngine._streamChanged(0);
                }
            } else if (i == 4) {
                tTVideoEngine._logFirstFrame();
            } else if (i == 701) {
                tTVideoEngine._bufferStart(i2);
            } else if (i != 702) {
                switch (i) {
                    case -268435438:
                        tTVideoEngine.mCurPosition = i2;
                        tTVideoEngine._updateCurrentInfoToMDL(i2);
                        break;
                    case -268435436:
                        if (tTVideoEngine.mSimpleCallback != null) {
                            tTVideoEngine.mSimpleCallback.onInfoIdChanged(i2);
                            break;
                        }
                        break;
                    case -268435392:
                        if (tTVideoEngine.mLogger != null) {
                            tTVideoEngine.mLogger.setMaskErrorCode(i2);
                            break;
                        }
                        break;
                    case -268435390:
                        if (!tTVideoEngine.mLooperThread.checkSendMainLooper()) {
                            if (tTVideoEngine.mSimpleCallback != null) {
                                tTVideoEngine.mSimpleCallback.onReadyForDisplay(tTVideoEngine);
                                break;
                            }
                        } else {
                            tTVideoEngine.mLooperThread.postMainLooperMessage(419, i, 0, null);
                            break;
                        }
                        break;
                    case 801:
                        tTVideoEngine._seekComplete(false);
                        break;
                    case 251658244:
                        tTVideoEngine._streamChanged(i2);
                        break;
                    case 251658252:
                        tTVideoEngine._audioRenderStart();
                        break;
                    default:
                        switch (i) {
                            case -268435408:
                                tTVideoEngine._preBuffering(i2);
                                break;
                            case -268435407:
                                TTVideoEngineLog.m256505i("TTVideoEngine", "av outsync start:" + i2);
                                tTVideoEngine.mLogger.AVOutSyncStart(i2);
                                break;
                            case -268435406:
                                TTVideoEngineLog.m256505i("TTVideoEngine", "av outsync end:" + i2);
                                tTVideoEngine.mLogger.AVOutSyncEnd(i2);
                                break;
                            case -268435405:
                                tTVideoEngine._formaterStart();
                                break;
                            case -268435404:
                                tTVideoEngine._decoderStart(i2);
                                break;
                            case -268435403:
                                tTVideoEngine.mLogger.AVNoRenderStart(i2);
                                break;
                            case -268435402:
                                tTVideoEngine.mLogger.AVNoRenderEnd(i2);
                                break;
                            case -268435401:
                                TTVideoEngineLog.m256505i("TTVideoEngine", "starttime is bigger than video duration:" + i2);
                                tTVideoEngine.mShouldUseAudioRenderStart = true;
                                break;
                            default:
                                switch (i) {
                                    case 251658248:
                                        tTVideoEngine._renderSeekComplete(i2);
                                        break;
                                    case 251658249:
                                        tTVideoEngine._videoBitrateChanged(i2);
                                        break;
                                }
                        }
                }
            } else {
                tTVideoEngine._bufferEnd(i2);
            }
            return false;
        }
    }

    /* access modifiers changed from: private */
    public static class MyOnSarChangedListener implements MediaPlayer.onSARChangedListener {
        private final WeakReference<TTVideoEngine> mVideoEngineRef;

        public MyOnSarChangedListener(TTVideoEngine tTVideoEngine) {
            this.mVideoEngineRef = new WeakReference<>(tTVideoEngine);
        }

        @Override // com.ss.ttm.player.MediaPlayer.onSARChangedListener
        public void onSARChanged(MediaPlayer mediaPlayer, int i, int i2) {
            TTVideoEngine tTVideoEngine = this.mVideoEngineRef.get();
            if (tTVideoEngine != null) {
                TTVideoEngineLog.m256505i("TTVideoEngine", "onSARChanged = " + i + ", " + i2);
                if (tTVideoEngine.mLooperThread.checkSendMainLooper()) {
                    tTVideoEngine.mLooperThread.postMainLooperMessage(418, i, i2, null);
                    return;
                }
                if (tTVideoEngine.mSARChangeListener != null) {
                    tTVideoEngine.mSARChangeListener.onSARChanged(i, i2);
                }
                if (tTVideoEngine.mSimpleCallback != null) {
                    tTVideoEngine.mSimpleCallback.onSARChanged(i, i2);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public static class MyOnVideoSizeChangedListener implements MediaPlayer.OnVideoSizeChangedListener {
        private final WeakReference<TTVideoEngine> mVideoEngineRef;

        public MyOnVideoSizeChangedListener(TTVideoEngine tTVideoEngine) {
            this.mVideoEngineRef = new WeakReference<>(tTVideoEngine);
        }

        @Override // com.ss.ttm.player.MediaPlayer.OnVideoSizeChangedListener
        public void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
            int i3;
            TTVideoEngine tTVideoEngine = this.mVideoEngineRef.get();
            if (tTVideoEngine != null) {
                TTVideoEngineLog.m256505i("TTVideoEngine", "[SRLog]video size changed = " + i + ", " + i2);
                SRStrategyConfig sRStrategyConfig = new SRStrategyConfig();
                sRStrategyConfig.setCurrentWidth(i).setCurrentHeight(i2);
                tTVideoEngine.mSRStrategy.updateConfig(sRStrategyConfig);
                if (tTVideoEngine.mTextureSurface != null) {
                    tTVideoEngine.mTextureSurface.updateTexDimension(i, i2);
                    if (tTVideoEngine.mPlayBackUsedSR && !tTVideoEngine.mSRIgnoreRes && !tTVideoEngine.mTextureSurface.supportProcessResolution(i, i2)) {
                        TTVideoEngineLog.m256505i("TTVideoEngine", "VideoSurface resolution not support for sr");
                        tTVideoEngine.doOpenSR(0, -7891);
                    }
                }
                int intOption = mediaPlayer.getIntOption(912, -1);
                TTVideoEngineLog.m256500d("TTVideoEngine", "colorTrc " + intOption);
                if (intOption == 16) {
                    i3 = 1;
                } else if (intOption == 18) {
                    i3 = 2;
                } else {
                    i3 = 0;
                }
                tTVideoEngine._setHDRInfoToTexturerender(mediaPlayer, i3);
                tTVideoEngine.mLogger.setIntOption(90, i3);
                if (tTVideoEngine.mLooperThread.checkSendMainLooper()) {
                    tTVideoEngine.mLooperThread.postMainLooperMessage(402, i, i2, null);
                } else {
                    if (tTVideoEngine.mVideoEngineListener != null) {
                        tTVideoEngine.mVideoEngineListener.onVideoSizeChanged(tTVideoEngine, i, i2);
                    }
                    if (tTVideoEngine.mSimpleCallback != null) {
                        tTVideoEngine.mSimpleCallback.onVideoSizeChanged(tTVideoEngine, i, i2);
                    }
                }
                if (!tTVideoEngine.mSeamSwitchingResolution && tTVideoEngine.mFirstGetWidthHeight) {
                    TTVideoEngineLog.m256500d("TTVideoEngine", "changed video size set");
                    tTVideoEngine.mFirstGetWidthHeight = false;
                    tTVideoEngine.mLogger.setStartPlayWidth(i);
                    tTVideoEngine.mLogger.setStartPlayHeight(i2);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public static class MyPreparedListener implements MediaPlayer.OnPreparedListener {
        private final WeakReference<TTVideoEngine> mVideoEngineRef;

        public MyPreparedListener(TTVideoEngine tTVideoEngine) {
            this.mVideoEngineRef = new WeakReference<>(tTVideoEngine);
        }

        @Override // com.ss.ttm.player.MediaPlayer.OnPreparedListener
        public void onPrepared(MediaPlayer mediaPlayer) {
            TTVideoEngine tTVideoEngine = this.mVideoEngineRef.get();
            if (tTVideoEngine != null && !tTVideoEngine.mShouldStop && tTVideoEngine.mMediaPlayer != null && mediaPlayer != null) {
                TTVideoEngineLog.m256505i("TTVideoEngine", "reveive onPrepared");
                if (tTVideoEngine.mMediaPlayer.getIntOption(SmActions.ACTION_IDLE_ENTRY, -1) != 1 || FeatureManager.hasPermission("bvc1")) {
                    int intOption = tTVideoEngine.mMediaPlayer.getIntOption(44, -1);
                    TTVideoEngineLog.m256500d("TTVideoEngine", "onPrepared mediaFormat " + intOption);
                    if (intOption == 5 && !FeatureManager.hasPermission("dash")) {
                        tTVideoEngine._receivedError(new Error("kTTVideoErrorDomainLicenseCheck", -30001, -310001));
                    } else if (intOption != 6 || FeatureManager.hasPermission("bash")) {
                        tTVideoEngine.mErrorCount = 0;
                        tTVideoEngine.mError = null;
                        tTVideoEngine.mDuration = mediaPlayer.getDuration();
                        tTVideoEngine.mPrepared = true;
                        if (tTVideoEngine.mLogger != null) {
                            tTVideoEngine.mLogger.prepareEnd();
                            tTVideoEngine.mLogger.setDuration(tTVideoEngine.mDuration);
                        }
                        if (tTVideoEngine.mLooperThread.checkSendMainLooper()) {
                            tTVideoEngine.mLooperThread.postMainLooperMessage(405, 0, 0, null);
                        } else {
                            if (tTVideoEngine.mVideoEngineListener != null) {
                                tTVideoEngine.mVideoEngineListener.onPrepared(tTVideoEngine);
                            }
                            if (tTVideoEngine.mSimpleCallback != null) {
                                tTVideoEngine.mSimpleCallback.onPrepared(tTVideoEngine);
                            }
                        }
                        if (tTVideoEngine.mMediaPlayer == null) {
                            TTVideoEngineLog.m256503e("TTVideoEngine", "onPrepared mediaplayer is null!");
                            return;
                        }
                        tTVideoEngine._dumpSurface("onPrepared");
                        TTVideoEngineLog.m256505i("TTVideoEngine", "mPausedBeforePrepared:" + tTVideoEngine.mPausedBeforePrepared + ", mShouldPlay:" + tTVideoEngine.mShouldPlay + ", mIsStartPlayAutomatically:" + tTVideoEngine.mIsStartPlayAutomatically + ", mIsPreDecodeAutoPause:" + tTVideoEngine.mIsPreDecodeAutoPause + ", skip start:" + tTVideoEngine.mSkipStartWhenPrepared);
                        if (mediaPlayer != null && !tTVideoEngine.mSkipStartWhenPrepared && ((!tTVideoEngine.mPausedBeforePrepared && tTVideoEngine.mShouldPlay) || (!tTVideoEngine.mIsStartPlayAutomatically && tTVideoEngine.mIsPreDecodeAutoPause))) {
                            mediaPlayer.start();
                        }
                        if (mediaPlayer != null && tTVideoEngine.mSeamSwitchingResolution && !tTVideoEngine.mShouldPlay) {
                            mediaPlayer.start();
                            mediaPlayer.pause();
                        }
                        if (!TextUtils.isEmpty(tTVideoEngine.mSubPathInfo) && tTVideoEngine.mSeamSwitchingResolution && tTVideoEngine.mEnableSubThread > 0) {
                            tTVideoEngine.mMediaPlayer.setIntOption(618, tTVideoEngine.mEnableSub);
                            tTVideoEngine.mMediaPlayer.setStringOption(617, tTVideoEngine.mSubPathInfo);
                            TTVideoEngineLog.m256500d("TTVideoEngine", "sub option: " + tTVideoEngine.mEnableSub + " url:" + tTVideoEngine.mSubPathInfo);
                        }
                        if (tTVideoEngine.mPlaybackParams != null && tTVideoEngine.isOSPlayer() && Build.VERSION.SDK_INT >= 23) {
                            mediaPlayer.setPlaybackParams(tTVideoEngine.mPlaybackParams);
                            tTVideoEngine.mLogger.setPlaybackParams(tTVideoEngine.mPlaybackParams);
                        }
                        int intOption2 = mediaPlayer.getIntOption(62, -100);
                        int intOption3 = mediaPlayer.getIntOption(61, -100);
                        if (intOption2 == 0) {
                            tTVideoEngine.mLogger.setIntOption(12, 1);
                        } else {
                            tTVideoEngine.mLogger.setIntOption(12, 0);
                        }
                        if (intOption3 == 0) {
                            tTVideoEngine.mLogger.setIntOption(13, 1);
                        } else {
                            tTVideoEngine.mLogger.setIntOption(13, 0);
                        }
                        TTVideoEngineLog.m256505i("TTVideoEngine", "videoEnabled:" + intOption2 + ",audioEnabled:" + intOption3);
                        long longOption = tTVideoEngine.mMediaPlayer.getLongOption(524, -100);
                        long longOption2 = tTVideoEngine.mMediaPlayer.getLongOption(525, -100);
                        tTVideoEngine.mLogger.setLongOption(98, longOption);
                        tTVideoEngine.mLogger.setLongOption(99, longOption2);
                        if (tTVideoEngine.mEnableHeartBeat && !tTVideoEngine.mHeartBeatStarted) {
                            tTVideoEngine.mLooperThread.postEngineMessage(24);
                            tTVideoEngine.mHeartBeatStarted = true;
                        }
                        if (mediaPlayer.isOSPlayer() && tTVideoEngine.mRadioModeEnable == 1 && !tTVideoEngine.mHasFirstFrameShown) {
                            TTVideoEngineLog.m256505i("TTVideoEngine", "OSPlayer in radioMode enter renderStart");
                            tTVideoEngine._renderStart();
                        }
                    } else {
                        tTVideoEngine._receivedError(new Error("kTTVideoErrorDomainLicenseCheck", -30001, -310002));
                    }
                } else {
                    tTVideoEngine._receivedError(new Error("kTTVideoErrorDomainLicenseCheck", -30001, -310000));
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public static class MySRStrategyListener implements ISRStrategyListener {
        private final WeakReference<TTVideoEngine> mVideoEngineRef;

        public MySRStrategyListener(TTVideoEngine tTVideoEngine) {
            this.mVideoEngineRef = new WeakReference<>(tTVideoEngine);
        }

        @Override // com.ss.ttvideoengine.superresolution.ISRStrategyListener
        public void onSRStrategy(SRStrategy sRStrategy) {
            TTVideoEngine tTVideoEngine;
            if (sRStrategy != null && (tTVideoEngine = this.mVideoEngineRef.get()) != null) {
                int sRStrategyMode = sRStrategy.getSRStrategyMode();
                int sRRealStatus = sRStrategy.getSRRealStatus();
                int sROpenStatus = sRStrategy.getSROpenStatus();
                boolean isSRSatisfied = sRStrategy.isSRSatisfied();
                boolean isSREnabled = sRStrategy.isSREnabled();
                int sRNotUseReason = sRStrategy.getSRNotUseReason();
                boolean shouldUseSRTexture = sRStrategy.shouldUseSRTexture();
                TTVideoEngineLog.m256505i("TTVideoEngine", "[SRLog]onSRStrategy  mode=" + sRStrategyMode + " srRealStatus=" + sRRealStatus + " srOpenStatus=" + sROpenStatus + " satisfied=" + isSRSatisfied + " enabled=" + isSREnabled + " notUseReason=" + sRNotUseReason + " shouldUseSRTexture=" + shouldUseSRTexture);
                if (sRRealStatus == 2) {
                    if (sROpenStatus != 0 && 1 != sRStrategyMode) {
                        tTVideoEngine.doOpenSR(0, sRNotUseReason);
                        if (tTVideoEngine.mStandAlongAbrStartUp > 0 && tTVideoEngine.mEnableABR == 0) {
                            Resolution startupResolution = sRStrategy.getStartupResolution();
                            Resolution startupResolutionShiftFrom = sRStrategy.getStartupResolutionShiftFrom();
                            if (startupResolution != null && startupResolutionShiftFrom != null && tTVideoEngine.currentResolution != null && tTVideoEngine.currentResolution.compareTo((Enum) startupResolution) == 0 && startupResolution.compareTo((Enum) startupResolutionShiftFrom) != 0) {
                                tTVideoEngine._switchToResolution(startupResolutionShiftFrom, null);
                                TTVideoEngineLog.m256505i("TTVideoEngine", "[SRLog]onSRStrategy sr open fail switch resolution to " + startupResolutionShiftFrom);
                            }
                        }
                    }
                } else if (1 != sRStrategyMode) {
                    tTVideoEngine.mUseSRTexture = shouldUseSRTexture;
                    if (isSRSatisfied && sROpenStatus != 1) {
                        tTVideoEngine.doOpenSR(1, 0);
                    } else if (!isSRSatisfied && sROpenStatus != 0) {
                        tTVideoEngine.doOpenSR(0, sRNotUseReason);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public static class MySeekCompletionListener implements MediaPlayer.OnSeekCompleteListener {
        private final WeakReference<TTVideoEngine> mVideoEngineRef;

        public MySeekCompletionListener(TTVideoEngine tTVideoEngine) {
            this.mVideoEngineRef = new WeakReference<>(tTVideoEngine);
        }

        @Override // com.ss.ttm.player.MediaPlayer.OnSeekCompleteListener
        public void onSeekComplete(MediaPlayer mediaPlayer) {
            TTVideoEngine tTVideoEngine = this.mVideoEngineRef.get();
            if (tTVideoEngine != null) {
                tTVideoEngine._seekComplete(true);
            }
        }
    }

    /* access modifiers changed from: private */
    public static class MySubFetcherListener implements SubInfoFetcher.FetcherListener {
        private final WeakReference<TTVideoEngine> mVideoEngineRef;

        public MySubFetcherListener(TTVideoEngine tTVideoEngine) {
            this.mVideoEngineRef = new WeakReference<>(tTVideoEngine);
        }

        @Override // com.ss.ttvideoengine.fetcher.SubInfoFetcher.FetcherListener
        public void onLog(String str) {
            TTVideoEngineLog.m256505i("TTVideoEngine", "sub fetcher cancelled");
            if (this.mVideoEngineRef.get() == null) {
            }
        }

        @Override // com.ss.ttvideoengine.fetcher.SubInfoFetcher.FetcherListener
        public void onCompletion(String str, Error error) {
            TTVideoEngine tTVideoEngine = this.mVideoEngineRef.get();
            if (tTVideoEngine != null) {
                SubInfoListener subInfoListener = tTVideoEngine.mSubInfoListener;
                SubInfoSimpleCallBack subInfoSimpleCallBack = tTVideoEngine.mSubInfoCallBack;
                if (subInfoListener != null && tTVideoEngine.mEnableSub > 0) {
                    subInfoListener.onSubPathInfo(str, error);
                } else if (subInfoSimpleCallBack == null || tTVideoEngine.mEnableSub <= 0) {
                    TTVideoEngineLog.m256503e("TTVideoEngine", "mSubInfoListener is null");
                } else {
                    subInfoSimpleCallBack.onSubPathInfo(str, error);
                }
                if (str == null || error != null) {
                    TTVideoEngineLog.m256503e("TTVideoEngine", String.format("sub fetch info failed:%s", error.toString()));
                    if (error != null && tTVideoEngine.mLogger != null) {
                        tTVideoEngine.mLogger.setSubtitleError(error.toString());
                    }
                } else if (str != null && tTVideoEngine.mMediaPlayer != null && tTVideoEngine.mLogger != null) {
                    tTVideoEngine._setSubInfoToMediaPlayer(str);
                }
            }
        }
    }

    public static void addPreloadMedias(List<PreloadMedia> list) {
        DataLoaderHelper.getDataLoader().addPreloadMedias(list, null);
    }

    public static void addTask(PreloaderVidItem preloaderVidItem) {
        DataLoaderHelper.getDataLoader().addTask(preloaderVidItem);
    }

    public static long getCacheFileSizeByFilePath(String str) {
        return DataLoaderHelper.getDataLoader().getCacheSizeByFilePath(str);
    }

    public static DataLoaderHelper.DataLoaderCacheInfo getCacheInfo(String str) {
        return DataLoaderHelper.getDataLoader().getCacheInfo(str);
    }

    public static DataLoaderHelper.DataLoaderCacheInfo getCacheInfoByFilePath(String str) {
        return DataLoaderHelper.getDataLoader().getCacheInfoByFilePath(str);
    }

    public static String getStringValue(int i) {
        return DataLoaderHelper.getDataLoader().getStringValue(i);
    }

    private boolean isSupportBash(int i) {
        if (((this.mSegmentFormatFlag >> i) & 1) == 1) {
            return true;
        }
        return false;
    }

    public static void openBytedanceHTTPDNS(ByteDanceHttpDnsDepend byteDanceHttpDnsDepend) {
        sDNSCustomType = new BytedanceHTTPDNSParser(byteDanceHttpDnsDepend).start();
    }

    public static void removeMedia(String str) {
        DataLoaderHelper.getDataLoader().removeMedia(str, "");
    }

    public static void setDataLoaderListener(DataLoaderListener dataLoaderListener2) {
        DataLoaderHelper.getDataLoader().setListener(dataLoaderListener2);
        dataLoaderListener = dataLoaderListener2;
    }

    public static void setPlayerThreadPoolExecutor(ExecutorService executorService) {
        TTVideoEngineLog.m256505i("TTVideoEngine", "set player threadpool");
        AVThreadPool.setExecutorInstance(executorService);
    }

    public static void setThreadPoolExecutor(ThreadPoolExecutor threadPoolExecutor) {
        TTVideoEngineLog.m256505i("TTVideoEngine", "set threadpool");
        EngineThreadPool.setExecutorInstance(threadPoolExecutor);
    }

    public static void startStartAndSelectGearSpeedPredictor(int i) {
        if (StrategyCenter.sNetSpeedPredictor == null) {
            StrategyCenter.createNewStartAndSelectGearSpeedPredictor(i);
            setPredictorDataLoaderListener();
        }
    }

    /* access modifiers changed from: package-private */
    public void _doSetDataSource(IMediaDataSource iMediaDataSource) {
        _ShutdownOldSource();
        this.mMediaDataSource = iMediaDataSource;
        IVideoEventLogger iVideoEventLogger = this.mLogger;
        if (iVideoEventLogger != null) {
            iVideoEventLogger.setSourceType(7, null);
        }
    }

    /* access modifiers changed from: package-private */
    public void _doSetTestSpeedEnbale(int i) {
        MediaPlayer mediaPlayer = this.mMediaPlayer;
        if (mediaPlayer != null) {
            mediaPlayer.setIntOption(79, i);
        }
    }

    /* access modifiers changed from: package-private */
    public void _updateCurrentInfoToMDL(int i) {
        setPlayInfo(1, (long) i);
        if (!this.mEnableHeartBeat) {
            _syncPlayInfoToMdl();
        }
    }

    public void _updateTextureState(int i) {
        VideoSurface videoSurface = this.mTextureSurface;
        if (videoSurface != null) {
            videoSurface.setIntOption(1, i);
        }
    }

    public float getFloatOption(int i) {
        if (i != 474) {
            return _doGetFloatOption(i);
        }
        return this.mAverageDownloadSpeed;
    }

    public IMediaMetrics getMetrics(int i) {
        IVideoEventLogger iVideoEventLogger = this.mLogger;
        if (iVideoEventLogger == null) {
            return null;
        }
        return iVideoEventLogger.buildMetrics(i);
    }

    public void setAudioProcessor(AudioProcessor audioProcessor) {
        this.mAudioProcessor = audioProcessor;
        MediaPlayer mediaPlayer = this.mMediaPlayer;
        if (mediaPlayer != null) {
            ((MediaPlayerWrapper) mediaPlayer).setAudioProcessor(audioProcessor);
        }
    }

    public void setDecryptionKey(String str) {
        TTVideoEngineLog.m256505i("TTVideoEngine", "setDecryptionKey");
        this.mDecryptionKey = str;
    }

    public void setDefaultFileCacheDir(String str) {
        if (str != null && str.length() != 0) {
            this.mDefaultCacheDir = str;
            createCacheFileDirectory();
        }
    }

    public void setFileCacheDir(String str) {
        if (str != null && str.length() != 0) {
            this.mCacheDir = str;
        }
    }

    public void setLiveID(String str) {
        setVideoID(str);
        this.mLogger.setPlayType(1);
        this.mPlayType = 1;
    }

    public void setMaskInfoListener(MaskInfoListener maskInfoListener) {
        this.mMaskInfoListener = maskInfoListener;
        if (this.mMaskInfoInterface == null) {
            this.mMaskInfoInterface = new MaskInfo() {
                /* class com.ss.ttvideoengine.TTVideoEngine.C654273 */

                /* access modifiers changed from: protected */
                @Override // com.ss.ttm.player.MaskInfo
                public void onMaskInfoCallback(int i, int i2, String str) {
                    if (TTVideoEngine.this.mMaskInfoListener == null || TTVideoEngine.this.mEnableBarrageMask <= 0) {
                        TTVideoEngineLog.m256503e("TTVideoEngine", "mMaskInfoListener is null");
                    } else {
                        TTVideoEngine.this.mMaskInfoListener.onMaskInfoCallback(i, i2, str);
                    }
                }
            };
        }
    }

    public void setResolutionMap(HashMap<String, Resolution> hashMap) {
        if (hashMap != null && hashMap.size() > 0) {
            this.mResolutionMap = hashMap;
        }
    }

    public void setSubInfoCallBack(SubInfoSimpleCallBack subInfoSimpleCallBack) {
        this.mSubInfoCallBack = subInfoSimpleCallBack;
        if (this.mSubInfoInterface == null) {
            this.mSubInfoInterface = new SubInfo() {
                /* class com.ss.ttvideoengine.TTVideoEngine.C654295 */

                /* access modifiers changed from: protected */
                @Override // com.ss.ttm.player.SubInfo
                public void onSubLoadFinished(int i) {
                    int i2;
                    if (TTVideoEngine.this.mSubInfoCallBack == null || TTVideoEngine.this.mEnableSub <= 0) {
                        TTVideoEngineLog.m256503e("TTVideoEngine", "mSubInfoCallBack is null");
                        return;
                    }
                    TTVideoEngineLog.m256500d("TTVideoEngine", "subtitle call back: finished old did call back");
                    if (i >= 0) {
                        i2 = 1;
                    } else {
                        i2 = 0;
                    }
                    TTVideoEngine.this.mSubInfoCallBack.onSubLoadFinished(i2);
                }

                /* access modifiers changed from: protected */
                @Override // com.ss.ttm.player.SubInfo
                public void onSubInfoCallback2(int i, String str) {
                    if (TTVideoEngine.this.mSubInfoCallBack == null || TTVideoEngine.this.mEnableSub <= 0) {
                        TTVideoEngineLog.m256503e("TTVideoEngine", "mSubInfoCallBack is null");
                    } else {
                        TTVideoEngine.this.mSubInfoCallBack.onSubInfoCallback(i, str);
                    }
                }

                /* access modifiers changed from: protected */
                @Override // com.ss.ttm.player.SubInfo
                public void onSubSwitchCompleted(int i, int i2) {
                    if (TTVideoEngine.this.mSubInfoCallBack == null || TTVideoEngine.this.mEnableSub <= 0) {
                        TTVideoEngineLog.m256503e("TTVideoEngine", "mSubInfoCallBack is null");
                    } else {
                        TTVideoEngine.this.mSubInfoCallBack.onSubSwitchCompleted(i, i2);
                    }
                }

                /* access modifiers changed from: protected */
                @Override // com.ss.ttm.player.SubInfo
                public void onSubLoadFinished2(int i, String str) {
                    int i2;
                    if (TTVideoEngine.this.mSubInfoCallBack == null || TTVideoEngine.this.mEnableSub <= 0) {
                        TTVideoEngineLog.m256503e("TTVideoEngine", "mSubInfoCallBack is null");
                        return;
                    }
                    TTVideoEngineLog.m256500d("TTVideoEngine", "subtitle call back: finished did call back");
                    if (i >= 0) {
                        i2 = 1;
                    } else {
                        i2 = 0;
                    }
                    TTVideoEngine.this.mSubInfoCallBack.onSubLoadFinished2(i2, str);
                }

                /* access modifiers changed from: protected */
                @Override // com.ss.ttm.player.SubInfo
                public void onSubInfoCallback(int i, int i2, String str) {
                    if (TTVideoEngine.this.mSubInfoCallBack == null || TTVideoEngine.this.mEnableSub <= 0) {
                        TTVideoEngineLog.m256503e("TTVideoEngine", "mSubInfoCallBack is null");
                        return;
                    }
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("info", str);
                        jSONObject.put("pts", i2);
                        TTVideoEngine.this.mSubInfoCallBack.onSubInfoCallback(i, jSONObject.toString());
                    } catch (JSONException unused) {
                        TTVideoEngineLog.m256503e("TTVideoEngine", "put content field failed");
                    }
                }
            };
        }
    }

    public void setSubInfoListener(SubInfoListener subInfoListener) {
        this.mSubInfoListener = subInfoListener;
        if (this.mSubInfoInterface == null) {
            this.mSubInfoInterface = new SubInfo() {
                /* class com.ss.ttvideoengine.TTVideoEngine.C654284 */

                /* access modifiers changed from: protected */
                @Override // com.ss.ttm.player.SubInfo
                public void onSubLoadFinished(int i) {
                }

                /* access modifiers changed from: protected */
                @Override // com.ss.ttm.player.SubInfo
                public void onSubLoadFinished2(int i, String str) {
                }

                /* access modifiers changed from: protected */
                @Override // com.ss.ttm.player.SubInfo
                public void onSubSwitchCompleted(int i, int i2) {
                }

                /* access modifiers changed from: protected */
                @Override // com.ss.ttm.player.SubInfo
                public void onSubInfoCallback2(int i, String str) {
                    if (TTVideoEngine.this.mSubInfoListener == null || TTVideoEngine.this.mEnableSub <= 0) {
                        TTVideoEngineLog.m256503e("TTVideoEngine", "mSubInfoListener is null");
                        return;
                    }
                    try {
                        JSONObject jSONObject = new JSONObject(str);
                        String optString = jSONObject.optString("info");
                        TTVideoEngine.this.mSubInfoListener.onSubInfoCallback(i, jSONObject.optInt("pts"), optString);
                    } catch (JSONException unused) {
                        TTVideoEngineLog.m256503e("TTVideoEngine", "construct json failed");
                    }
                }

                /* access modifiers changed from: protected */
                @Override // com.ss.ttm.player.SubInfo
                public void onSubInfoCallback(int i, int i2, String str) {
                    if (TTVideoEngine.this.mSubInfoListener == null || TTVideoEngine.this.mEnableSub <= 0) {
                        TTVideoEngineLog.m256503e("TTVideoEngine", "mSubInfoListener is null");
                    } else {
                        TTVideoEngine.this.mSubInfoListener.onSubInfoCallback(i, i2, str);
                    }
                }
            };
        }
    }

    public void setTokenUrlTemplate(String str) {
        this.mTokenUrlTemplate = str;
        IntertrustDrmHelper intertrustDrmHelper = this.mIntertrustDrmHelper;
        if (intertrustDrmHelper != null) {
            intertrustDrmHelper.setTokenUrlTemplate(str);
        }
    }

    private boolean _isDashSource(VideoInfo videoInfo) {
        String valueStr = videoInfo.getValueStr(6);
        if (TextUtils.isEmpty(valueStr) || (!valueStr.equals("dash") && !valueStr.equals("mpd"))) {
            return false;
        }
        return true;
    }

    private void _logFirstHost(String str) {
        if (this.mFirstHost) {
            this.mFirstHost = false;
            this.mLogger.setInitialHost(str);
        }
        this.mLogger.setCurHost(str);
    }

    private void _logFirstIP(String str) {
        if (this.mFirstIP) {
            this.mFirstIP = false;
            this.mLogger.setInitialIP(str);
        }
        this.mLogger.setCurIP(str);
    }

    private void _logFirstQuality(String str) {
        if (this.mFirstQuality) {
            this.mFirstQuality = false;
            this.mLogger.setInitialQuality(str);
        }
        this.mLogger.setCurQuality(str);
    }

    private void _logFirstResolution(Resolution resolution) {
        boolean z;
        String _resolutionToString = _resolutionToString(resolution);
        if (this.mFirstResolution) {
            if (resolution == Resolution.Auto) {
                z = true;
            } else {
                z = false;
            }
            this.mFirstResolution = z;
            this.mLogger.setInitialResolution(_resolutionToString);
        }
        this.mLogger.setCurResolution(_resolutionToString);
    }

    private String _resolutionToString(Resolution resolution) {
        if (resolution == null) {
            return "nil";
        }
        IVideoModel iVideoModel = this.mVideoModel;
        if (iVideoModel != null) {
            return iVideoModel.resolutionToString(resolution);
        }
        return resolution.toString(VideoRef.TYPE_VIDEO);
    }

    private boolean _usePlayerDNS(boolean z) {
        IVideoEventLogger iVideoEventLogger;
        if ((this.mIsUsePlayerDNS == 1 || z) && (iVideoEventLogger = this.mLogger) != null) {
            iVideoEventLogger.setStringOption(86, "localDNS");
        }
        int i = this.mIsUsePlayerDNS;
        if (i == 1) {
            return true;
        }
        if (i != 0 && z) {
            return true;
        }
        return false;
    }

    public static void addTask(PreloaderVideoModelItem preloaderVideoModelItem) {
        DataLoaderHelper.getDataLoader().addTask(preloaderVideoModelItem);
    }

    public static String computeMD5(String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.update(str.getBytes());
            return new BigInteger(1, instance.digest()).toString(16);
        } catch (Exception unused) {
            return str;
        }
    }

    private void initMDLFetcher(Context context) {
        if (sFetcherMaker == null) {
            sFetcherMaker = new FetcherMaker(context);
        }
        AVMDLURLFetcherBridge.setFetcherMaker(sFetcherMaker);
    }

    private boolean isSupportHLSSeamlessSwitch(IVideoModel iVideoModel) {
        if (iVideoModel != null && iVideoModel.hasFormat(IVideoModel.Format.HLS)) {
            return iVideoModel.isSupportHLSSeamlessSwitch();
        }
        return false;
    }

    public static void setDeviceInfo(DeviceInfoVE deviceInfoVE) {
        if (deviceInfoVE != null) {
            DeviceInfoVE.overAllScore = DeviceInfoVE.overAllScore;
            TTVideoEngineLog.m256500d("TTVideoEngine", "DeviceInfoVE.overAllScore: " + DeviceInfoVE.overAllScore);
        }
    }

    public static void setupSpeedPredictorInputType(int i) {
        sABRSpeedPredictInputType = i;
        if (i == 2) {
            DataLoaderHelper.getDataLoader().setIntValue(SmEvents.EVENT_NE_RR, ParticipantRepo.f117150c);
        } else {
            DataLoaderHelper.getDataLoader().setIntValue(SmEvents.EVENT_NE_RR, 0);
        }
    }

    public static void startDataLoader(Context context) throws Exception {
        DataLoaderHelper.getDataLoader().setContext(context);
        try {
            DataLoaderHelper.getDataLoader().start();
            TTVideoEngineLog.m256500d("TTVideoEngine", "DataLoader Start");
        } catch (Exception e) {
            TTVideoEngineLog.m256500d("TTVideoEngine", "DataLoader Start Fail");
            throw e;
        }
    }

    public static void startIESSpeedPredictor(int i) {
        if (FeatureManager.hasPermission("net_speed") && StrategyCenter.sNetSpeedPredictor == null) {
            StrategyCenter.createSpeedPredictor(i);
            setPredictorDataLoaderListener();
        }
    }

    /* access modifiers changed from: package-private */
    public void _doSetDataSource(FileDescriptor fileDescriptor) {
        _ShutdownOldSource();
        this.mPlayFd = fileDescriptor;
        IVideoEventLogger iVideoEventLogger = this.mLogger;
        if (iVideoEventLogger != null) {
            iVideoEventLogger.setSourceType(6, null);
        }
    }

    /* access modifiers changed from: package-private */
    public void _doSetLooping(boolean z) {
        MediaPlayer mediaPlayer = this.mMediaPlayer;
        if (mediaPlayer != null) {
            mediaPlayer.setLooping(this.mLooping);
        }
        this.mLogger.setLooping(this.mLooping);
    }

    public void _parseDNSComplete(String str) {
        if (this.mLooperThread.checkEngineLooperThread(false)) {
            this.mLooperThread.postEngineMessage(LocationRequest.PRIORITY_INDOOR, 0, 0, str);
        } else {
            _doParseDNSComplete(str);
        }
    }

    public void _parseIPAddress(IVideoModel iVideoModel) {
        if (this.mLooperThread.checkEngineLooperThread(false)) {
            this.mLooperThread.postEngineMessage(301, 0, 0, iVideoModel);
        } else {
            _doParseIPAddress(iVideoModel);
        }
    }

    public void asyncInitSR(boolean z) {
        this.mAsyncInitSR = z;
        TTVideoEngineLog.m256505i("TTVideoEngine", "[SRLog]asyncInitSR = " + z);
    }

    public void changeResolutionSwitchingState(boolean z) {
        if (z) {
            this.mResolutionSwitching = true;
            this.mResolutionSwitchingStartTime = SystemClock.currentThreadTimeMillis();
            return;
        }
        this.mResolutionSwitching = false;
        this.mResolutionSwitchingStartTime = 0;
    }

    public void configResolution(Resolution resolution) {
        TTVideoEngineLog.m256500d("TTVideoEngine", "configResolution " + resolution);
        if (resolution != null) {
            _configResolution(resolution, null);
        }
    }

    public void dynamicControlSR(boolean z) {
        this.mDynamicControlSR = z;
        TTVideoEngineLog.m256505i("TTVideoEngine", "[SRLog]dynamicControlSR = " + z);
    }

    public void ignoreSRResolutionLimit(boolean z) {
        this.mSRIgnoreRes = z;
        TTVideoEngineLog.m256505i("TTVideoEngine", "[SRLog]ignoreSRResolutionLimit ignore=" + z);
    }

    public boolean isPlayerType(int i) {
        int i2;
        MediaPlayer mediaPlayer = this.mMediaPlayer;
        if (mediaPlayer != null) {
            i2 = mediaPlayer.getPlayerType();
        } else {
            i2 = this.mPlayerType;
        }
        if (i2 == i) {
            return true;
        }
        return false;
    }

    public void setBarrageMaskUrl(String str) {
        TTVideoEngineLog.m256505i("TTVideoEngine", "setBarrageMaskUrl " + str);
        this.mBarrageMaskUrl = str;
    }

    public void setDataSource(IMediaDataSource iMediaDataSource) {
        if (this.mLooperThread.checkEngineLooperThread(false)) {
            this.mLooperThread.postEngineMessage(13, 0, 0, iMediaDataSource);
        } else {
            _doSetDataSource(iMediaDataSource);
        }
    }

    public void setDirectURL(String str) {
        if (this.mLooperThread.checkEngineLooperThread(false)) {
            this.mLooperThread.postEngineMessage(19, 0, 0, str);
        } else {
            _doSetDirectURL(str);
        }
    }

    public void setEffect(Bundle bundle) {
        VideoSurface videoSurface = this.mTextureSurface;
        if (videoSurface != null) {
            videoSurface.setEffect(bundle);
        } else {
            this.mEffectBundle.offer(bundle);
        }
        this.mLogger.setEffect(bundle);
    }

    public void setEncodedKey(String str) {
        if (!TextUtils.isEmpty(str)) {
            TTVideoEngineLog.m256505i("TTVideoEngine", "setEncodedKey");
            this.mSpadea = str;
        }
    }

    public void setListener(VideoEngineListener videoEngineListener) {
        TTVideoEngineLog.m256500d("TTVideoEngine", "setListener " + videoEngineListener);
        this.mVideoEngineListener = videoEngineListener;
    }

    public void setLocalURL(String str) {
        if (this.mLooperThread.checkEngineLooperThread(false)) {
            this.mLooperThread.postEngineMessage(18, 0, 0, str);
        } else {
            _doSetLocalURL(str);
        }
    }

    public void setPlayItem(TTVideoEnginePlayItem tTVideoEnginePlayItem) {
        if (tTVideoEnginePlayItem != null) {
            if (this.mLooperThread.checkEngineLooperThread(false)) {
                this.mLooperThread.postEngineMessage(17, 0, 0, tTVideoEnginePlayItem);
            } else {
                _doSetPlayItem(tTVideoEnginePlayItem);
            }
        }
    }

    public void setReportLogEnable(boolean z) {
        TTVideoEngineLog.m256500d("TTVideoEngine", "setReportLogEnable " + z);
        this.mLogger.setUploadLogEnabled(z);
    }

    public void setStartTime(int i) {
        TTVideoEngineLog.m256505i("TTVideoEngine", "setStartTime:" + i);
        this.mStartTime = i;
        this.mLogger.setStartTime(i);
    }

    public void setSubDesInfoModel(SubDesInfoModelProvider subDesInfoModelProvider) {
        TTVideoEngineLog.m256500d("TTVideoEngine", "subtitle: set subtitle description info: " + subDesInfoModelProvider.toString());
        this.mSubDesInfoModel = subDesInfoModelProvider;
    }

    public void setUnSupportSampleRates(int[] iArr) {
        if (isInHousePlayer()) {
            if (this.mLooperThread.checkEngineLooperThread(false)) {
                this.mLooperThread.postEngineMessage(51, 0, 0, iArr);
            } else {
                _setUnSupportSampleRates(iArr);
            }
        }
    }

    public void setVideoBufferListener(VideoBufferListener videoBufferListener) {
        TTVideoEngineLog.m256500d("TTVideoEngine", "setVideoBufferListener " + videoBufferListener);
        this.mVideoBufferListener = videoBufferListener;
    }

    public void setVideoEngineCallback(VideoEngineCallback videoEngineCallback) {
        TTVideoEngineLog.m256500d("TTVideoEngine", "setVideoEngineSimpleCallback " + videoEngineCallback);
        this.mSimpleCallback = videoEngineCallback;
    }

    public void setVideoID(String str) {
        if (this.mLooperThread.checkEngineLooperThread(false)) {
            this.mLooperThread.postEngineMessage(14, 0, 0, str);
        } else {
            _doSetVideoID(str);
        }
    }

    public void setVideoInfoListener(VideoInfoListener videoInfoListener) {
        TTVideoEngineLog.m256500d("TTVideoEngine", "setVideoInfoListener " + videoInfoListener);
        this.mVideoInfoListener = videoInfoListener;
    }

    public void setVideoModel(IVideoModel iVideoModel) {
        if (iVideoModel != null) {
            if (this.mLooperThread.checkEngineLooperThread(false)) {
                this.mLooperThread.postEngineMessage(16, 0, 0, iVideoModel);
            } else {
                _doSetVideoModel(iVideoModel);
            }
        }
    }

    private boolean _isDashSource(String str) {
        if (TextUtils.isEmpty(str) || str.indexOf(".mpd") <= 0) {
            return false;
        }
        return true;
    }

    private void _logBeginToPlay(String str) {
        if (this.mLogger != null) {
            long currentTimeMillis = System.currentTimeMillis();
            this.mPlayTime = currentTimeMillis;
            this.mLogger.setDnsMode(this.mIsUsePlayerDNS);
            this.mLogger.beginToPlay(str, currentTimeMillis, AppInfo.mDeviceId);
            this.mTraceId = this.mLogger.getTraceID();
        }
    }

    public static void enableNewMDLFetcher(boolean z) {
        if (z) {
            try {
                if (sFetcherMakerNew == null) {
                    sFetcherMakerNew = new FetcherMakerNew();
                }
                AVMDLURLFetcherBridge.setNewFetcherMaker(sFetcherMakerNew);
            } catch (Throwable th) {
                TTVideoEngineLog.m256505i("TTVideoEngine", "setFetcherMakerNew exception " + th);
            }
        } else {
            AVMDLURLFetcherBridge.setNewFetcherMaker(null);
        }
    }

    public static void focusEngine(TTVideoEngine tTVideoEngine) {
        if (tTVideoEngine != null) {
            TTVideoEngineLog.m256505i("TTVideoEngine", "[strategy] focus engine" + tTVideoEngine.mVideoID);
            focusMedia(tTVideoEngine.mVideoID, 1);
        }
    }

    private boolean isSupportBash(IVideoModel iVideoModel) {
        if (iVideoModel == null) {
            return false;
        }
        if ((!iVideoModel.hasFormat(IVideoModel.Format.DASH) || !isSupportBash(1)) && (!iVideoModel.hasFormat(IVideoModel.Format.MP4) || !isSupportBash(2))) {
            return false;
        }
        return iVideoModel.isSupportBash();
    }

    private boolean isSupportSeamlessSwitch(IVideoModel iVideoModel) {
        if (iVideoModel == null) {
            return false;
        }
        if (iVideoModel.hasFormat(IVideoModel.Format.DASH)) {
            return true;
        }
        if (iVideoModel.hasFormat(IVideoModel.Format.MP4)) {
            if (!this.mBashEnabled || !isSupportBash(iVideoModel)) {
                return false;
            }
            return true;
        } else if (!iVideoModel.hasFormat(IVideoModel.Format.HLS) || !this.mHLSSeamlessSwitch || !isSupportHLSSeamlessSwitch(iVideoModel)) {
            return false;
        } else {
            return true;
        }
    }

    private static void removeCacheFile(IVideoModel iVideoModel) {
        List<VideoInfo> videoInfoList;
        if (iVideoModel != null && iVideoModel.hasData() && (videoInfoList = iVideoModel.getVideoInfoList()) != null && videoInfoList.size() > 0) {
            for (VideoInfo videoInfo : videoInfoList) {
                DataLoaderHelper.getDataLoader().forceRemoveCacheFile(videoInfo.getValueStr(15));
            }
        }
    }

    public static synchronized void setPlayerLibraryLoader(ILibraryLoader iLibraryLoader) {
        synchronized (TTVideoEngine.class) {
            try {
                Class<?> clzUsingPluginLoader = TTHelper.getClzUsingPluginLoader(LocationRequest.PRIORITY_HD_ACCURACY, "com.ss.ttm.player.TTPlayerLibLoader");
                Method declaredMethod = clzUsingPluginLoader.getDeclaredMethod("setLibraryLoader", ILibraryLoader.class);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(clzUsingPluginLoader, iLibraryLoader);
            } catch (Throwable th) {
                TTVideoEngineLog.m256503e("TTVideoEngine", "setPlayerLibraryLoader failed = " + th);
            }
        }
        return;
    }

    /* access modifiers changed from: package-private */
    public float _doGetFloatOption(int i) {
        MediaPlayer mediaPlayer = this.mMediaPlayer;
        if (i == 70) {
            if (this.mContainerFPS <= BitmapDescriptorFactory.HUE_RED) {
                this.mContainerFPS = mediaPlayer.getFloatOption(151, BitmapDescriptorFactory.HUE_RED);
            }
            return this.mContainerFPS;
        } else if (i != 71) {
            if (i != 474) {
                return BitmapDescriptorFactory.HUE_RED;
            }
            try {
                return this.mAverageDownloadSpeed;
            } catch (Throwable th) {
                TTVideoEngineLog.m256501d(th);
                return BitmapDescriptorFactory.HUE_RED;
            }
        } else if (mediaPlayer != null) {
            return mediaPlayer.getFloatOption(150, BitmapDescriptorFactory.HUE_RED);
        } else {
            return BitmapDescriptorFactory.HUE_RED;
        }
    }

    /* access modifiers changed from: package-private */
    public void _doSetPlaybackParams(PlaybackParams playbackParams) {
        if (this.mMediaPlayer != null) {
            try {
                if (!isOSPlayer() || (Build.VERSION.SDK_INT >= 23 && this.mPrepared)) {
                    this.mMediaPlayer.setPlaybackParams(playbackParams);
                    this.mLogger.setPlaybackParams(this.mPlaybackParams);
                }
            } catch (NullPointerException unused) {
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void _doSetSurface(Surface surface) {
        IVideoEventLogger iVideoEventLogger;
        this.mSurface = surface;
        if (!(surface == null || (iVideoEventLogger = this.mLogger) == null || this.mHasFirstFrameShown)) {
            iVideoEventLogger.setSurface(surface.toString());
        }
        MediaPlayer mediaPlayer = this.mAsyncPlayer;
        if (mediaPlayer == null) {
            mediaPlayer = this.mMediaPlayer;
        }
        if (mediaPlayer != null) {
            setSurfaceHook(this.mSurface);
        }
    }

    public void _preBuffering(int i) {
        TTVideoEngineLog.m256505i("TTVideoEngine", "preBuffering start,this:" + this + ", code:" + i);
        IVideoEventLogger iVideoEventLogger = this.mLogger;
        if (iVideoEventLogger != null) {
            iVideoEventLogger.moviePreStalled(i);
        }
    }

    /* access modifiers changed from: package-private */
    public void _setPlayerMute(boolean z) {
        float f;
        MediaPlayer mediaPlayer = this.mMediaPlayer;
        if (mediaPlayer == null) {
            return;
        }
        if (mediaPlayer.isOSPlayer()) {
            if (z) {
                f = BitmapDescriptorFactory.HUE_RED;
            } else {
                f = 1.0f;
            }
            try {
                this.mMediaPlayer.setVolume(f, f);
            } catch (Exception e) {
                TTVideoEngineLog.m256501d(e);
            }
        } else {
            this.mMediaPlayer.setIsMute(z);
        }
    }

    /* access modifiers changed from: package-private */
    public void _setUnSupportSampleRates(int[] iArr) {
        int length = iArr.length;
        if (length > 0) {
            int length2 = MediaPlayer.MEDIA_PLAYER_SUPPORT_SAMPLERATES.length;
            this.mUnsupportSampleRatesInBinary = 0;
            for (int i = 0; i < length; i++) {
                int i2 = 0;
                while (true) {
                    if (i2 >= length2) {
                        break;
                    } else if (MediaPlayer.MEDIA_PLAYER_SUPPORT_SAMPLERATES[i2] == iArr[i]) {
                        this.mUnsupportSampleRatesInBinary = (1 << i2) | this.mUnsupportSampleRatesInBinary;
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            MediaPlayer mediaPlayer = this.mMediaPlayer;
            if (mediaPlayer != null) {
                mediaPlayer.setIntOption(SmEvents.EVENT_NT, this.mUnsupportSampleRatesInBinary);
            }
        }
    }

    public void initSRStrategyConfig(SRStrategyConfig sRStrategyConfig) {
        TTVideoEngineLog.m256505i("TTVideoEngine", "[SRLog]initSRStrategyConfig mSRStrategy=" + this.mSRStrategy + " config=" + sRStrategyConfig);
        this.mSRStrategy.setSRStrategyMode(0);
        this.mSRStrategy.updateConfig(sRStrategyConfig);
    }

    public VideoSurface initTextureRender(boolean z) {
        int i;
        TTVideoEngineLog.m256505i("TTVideoEngine", "use sr tex = " + z);
        if (this.mOverlayMode != 0) {
            i = 4;
        } else {
            i = 0;
        }
        VideoSurface genAvaiableSurface = this.mTextureRenderer.genAvaiableSurface(z, i | 0);
        if (genAvaiableSurface != null && z) {
            initSr(genAvaiableSurface);
        }
        return genAvaiableSurface;
    }

    /* access modifiers changed from: package-private */
    public boolean isMayUseP2P(String str) {
        if (TextUtils.isEmpty(str)) {
            TTVideoEngineLog.m256500d("TTVideoEngine", "url null, may not use p2p");
            return false;
        } else if (!str.contains("http://127.0.0.1") && !str.contains("mdl://")) {
            TTVideoEngineLog.m256500d("TTVideoEngine", "url not 127 or mdl protocol, may not use p2p");
            return false;
        } else if (!str.contains("cdn_type")) {
            TTVideoEngineLog.m256500d("TTVideoEngine", "url not contain cdntype, may not use p2p");
            return false;
        } else {
            TTVideoEngineLog.m256500d("TTVideoEngine", "url  may use p2p");
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    public int parseP2PCDNType(String str) {
        int indexOf;
        int i;
        if (TextUtils.isEmpty(str) || (indexOf = str.indexOf("cdn_type=")) == -1 || (i = indexOf + 9) >= str.length()) {
            return 0;
        }
        char charAt = str.charAt(i);
        if (!Character.isDigit(charAt)) {
            return 0;
        }
        return Character.getNumericValue(charAt);
    }

    public void setCustomStr(String str) {
        if (this.mLogger != null && !TextUtils.isEmpty(str)) {
            if (str.length() > 512) {
                str = str.substring(0, MediaPlayer.MEDIA_PLAYER_OPTION_APPID);
                TTVideoEngineLog.m256505i("TTVideoEngine", "customStr too long to be truncated!");
            }
            this.mLogger.setCustomStr(str);
        }
    }

    public void setIsMute(boolean z) {
        TTVideoEngineLog.m256505i("TTVideoEngine", String.format("setIsMute:%s", Boolean.valueOf(z)));
        this.mIsMute = z;
        if (this.mLooperThread.checkEngineLooperThread(false)) {
            this.mLooperThread.postEngineMessage(10, z ? 1 : 0);
        } else {
            _setPlayerMute(z);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: boolean */
    /* JADX WARN: Multi-variable type inference failed */
    public void setLooping(boolean z) {
        TTVideoEngineLog.m256505i("TTVideoEngine", String.format("setLooping:%s", Boolean.valueOf(z)));
        this.mLooping = z;
        if (this.mLooperThread.checkEngineLooperThread(false)) {
            this.mLooperThread.postEngineMessage(6, z);
        } else {
            _doSetLooping(z);
        }
        TTVideoEngineLog.m256505i("TTVideoEngine", String.format("set looping value:%d", Integer.valueOf(z ? 1 : 0)));
    }

    public void setPreloaderItem(TTAVPreloaderItem tTAVPreloaderItem) {
        if (tTAVPreloaderItem == null) {
            this.mIsPreloaderItem = false;
        } else if (TextUtils.isEmpty(tTAVPreloaderItem.mUrl)) {
            setVideoID(tTAVPreloaderItem.mVideoID);
        } else if (this.mLooperThread.checkEngineLooperThread(false)) {
            this.mLooperThread.postEngineMessage(15, 0, 0, tTAVPreloaderItem);
        } else {
            _doSetPreloaderItem(tTAVPreloaderItem);
        }
    }

    public void setSubAuthToken(String str) {
        String base64Decode = TTHelper.base64Decode(str);
        if (!TextUtils.isEmpty(base64Decode)) {
            try {
                String optString = new JSONObject(base64Decode).optString("GetSubtitleAuthToken");
                this.mSubAuthToken = optString;
                if (TextUtils.isEmpty(optString)) {
                    this.mSubAuthToken = base64Decode;
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        TTVideoEngineLog.m256500d("TTVideoEngine", "setSubAuthToken " + str);
    }

    public void setSurface(Surface surface) {
        TTVideoEngineLog.m256505i("TTVideoEngine", "setsurface = " + surface + ", pre-surface:" + this.mSurface + ",this:" + this);
        if (this.mLooperThread.checkEngineLooperThread(false)) {
            this.mLooperThread.postEngineMessage(54, 0, 0, surface);
        } else {
            _doSetSurface(surface);
        }
    }

    public void setSurfaceHolder(SurfaceHolder surfaceHolder) {
        TTVideoEngineLog.m256505i("TTVideoEngine", "setSurfaceHolder = " + surfaceHolder + ",this:" + this);
        if (this.mLooperThread.checkEngineLooperThread(false)) {
            this.mLooperThread.postEngineMessage(55, 0, 0, surfaceHolder);
        } else {
            _doSetSurfaceHolder(surfaceHolder);
        }
    }

    public void setSurfaceHolderSync(SurfaceHolder surfaceHolder) {
        TTVideoEngineLog.m256505i("TTVideoEngine", "setSurfaceHolderSync = " + surfaceHolder + ",this:" + this);
        if (this.mLooperThread.checkEngineLooperThread(false)) {
            this.mLooperThread.sendEngineMessage(55, this.mSendEngineMsgTimeout, 0, 0, surfaceHolder);
        } else {
            _doSetSurfaceHolder(surfaceHolder);
        }
    }

    public void setSurfaceSync(Surface surface) {
        TTVideoEngineLog.m256505i("TTVideoEngine", "setSurfaceSync = " + surface + ",this:" + this);
        if (this.mLooperThread.checkEngineLooperThread(false)) {
            this.mLooperThread.sendEngineMessage(54, this.mSendEngineMsgTimeout, 0, 0, surface);
        } else {
            _doSetSurface(surface);
        }
    }

    public void updateSRStrategyConfig(SRStrategyConfig sRStrategyConfig) {
        TTVideoEngineLog.m256505i("TTVideoEngine", "[SRLog]updateSRStrategyConfig mSRStrategy=" + this.mSRStrategy + " config=" + sRStrategyConfig);
        this.mSRStrategy.updateConfig(sRStrategyConfig);
    }

    private MediaPlayer _createPlayer(String str) {
        updateConfigParams(this.mConfigParams);
        MediaPlayer create = MediaPlayerWrapper.create(this.mContext, this.mPlayerDegradeMode, this.mConfigParams);
        if (create == null) {
            return null;
        }
        MediaPlayerWrapper mediaPlayerWrapper = (MediaPlayerWrapper) create;
        if (mediaPlayerWrapper.hasException() && this.mLogger != null) {
            String exceptionStr = mediaPlayerWrapper.getExceptionStr();
            this.mLogger.logPluginException(exceptionStr + ",customState:" + this.mClassLoaderState);
        }
        if (mediaPlayerWrapper.getPlayerClient() == null) {
            return null;
        }
        _tryRegisterMdlHandle(create);
        IVideoEventLogger iVideoEventLogger = this.mLogger;
        if (iVideoEventLogger != null) {
            iVideoEventLogger.setPlayerCreatedT(System.currentTimeMillis());
        }
        TTVideoEngineLog.m256505i("TTVideoEngine", "_playInternal MediaPlayerWrapper.create done videoId = " + this.mVideoID);
        return create;
    }

    private void _notifyError(Error error) {
        IVideoEventLogger iVideoEventLogger = this.mLogger;
        if (iVideoEventLogger != null) {
            PlayDurationManager playDurationManager = this.mPlayDuration;
            if (playDurationManager != null) {
                iVideoEventLogger.addWatchedDuration(playDurationManager.getPlayedDuration());
            }
            this.mLogger.movieFinish(error, this.mPlayAPIVersion);
        }
        this.mStarted = false;
        this.mIsStartPlayAutomatically = true;
        if (this.mLooperThread.checkSendMainLooper()) {
            this.mLooperThread.postMainLooperMessage(409, 0, 0, error);
        } else {
            VideoEngineListener videoEngineListener = this.mVideoEngineListener;
            if (videoEngineListener != null) {
                videoEngineListener.onError(error);
            }
            VideoEngineCallback videoEngineCallback = this.mSimpleCallback;
            if (videoEngineCallback != null) {
                videoEngineCallback.onError(error);
            }
        }
        this.mErrorCount = 0;
        this.mAccumulatedErrorCount = 0;
        this.mErrorEnd = true;
    }

    private void _tryRegisterMdlHandle(MediaPlayer mediaPlayer) {
        TTVideoEngineLog.m256505i("TTVideoEngine", "_tryRegisterMdlHandle, player type:" + mediaPlayer.getPlayerType());
        if (!mHasRegisterMdlProto && mediaPlayer.getPlayerType() == 1) {
            long longValue = DataLoaderHelper.getDataLoader().getLongValue(1003);
            if (longValue != -1) {
                DataLoaderHelper.getDataLoader().setIntValue(1004, (int) mediaPlayer.setLongOption(ParticipantRepo.f117150c, longValue));
                mHasRegisterMdlProto = true;
            }
            TTVideoEngineLog.m256505i("TTVideoEngine", "get handle: " + longValue);
        }
    }

    public static long getCacheFileSize(String str) {
        return DataLoaderHelper.getDataLoader().getCacheSize(str);
    }

    private void initSr(VideoSurface videoSurface) {
        TTVideoEngineLog.m256505i("TTVideoEngine", "initSr,mTextureAlgType:" + this.mTextureAlgType);
        if (this.mTextureAlgType != -1 && videoSurface != null) {
            Bundle bundle = this.mLensBundle;
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putInt("effect_type", 5);
            bundle.putInt("action", 21);
            bundle.putInt("srAlgType", this.mTextureAlgType);
            bundle.putInt("srMaxSizeWidth", this.mMaxTextureWidth);
            bundle.putInt("srMaxSizeHeight", this.mMaxTextureHeight);
            bundle.putString("kernelBinPath", this.mTextureSRBinPath);
            bundle.putString("oclModleName", this.mTextureSROclModuleName);
            bundle.putString("dspModleName", this.mTextureSRDspModuleName);
            bundle.putString("moduleName", FeatureManager.getModuleName());
            videoSurface.setEffect(bundle);
        }
    }

    private boolean isSupportBash(String str) {
        if (!TextUtils.isEmpty(str) && isSupportBash(2)) {
            String lowerCase = str.toLowerCase();
            if (lowerCase.startsWith("file://") || lowerCase.startsWith("/") || lowerCase.indexOf(".m3u8") > 0 || lowerCase.indexOf(".mpd") > 0) {
                return false;
            }
            return true;
        }
        return false;
    }

    private boolean isSupportSeamlessSwitch(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String lowerCase = str.toLowerCase();
        if (lowerCase.startsWith("mem://bash") || lowerCase.startsWith("mem://hls") || lowerCase.indexOf(".m3u8") > 0 || lowerCase.indexOf(".mpd") > 0) {
            return true;
        }
        return false;
    }

    private void resetFallbackApi(Error error) {
        String str = this.mFallbackAPI;
        if (str != null && "dash".equals(TTHelper.getParam(str, "format_type")) && (-9993 == error.code || !isInHousePlayer())) {
            this.mFallbackAPI = TTHelper.overrideUrlParam(this.mFallbackAPI, "format_type", "mp4");
        }
        if (this.mFallbackAPI == null) {
            return;
        }
        if (-9993 == error.code || !isInHousePlayer()) {
            this.mFallbackAPI = TTHelper.overrideUrlParam(this.mFallbackAPI, "codec_type", "0");
        }
    }

    private void setSurfaceHook(Surface surface) {
        MediaPlayer mediaPlayer = this.mAsyncPlayer;
        if (mediaPlayer == null) {
            mediaPlayer = this.mMediaPlayer;
        }
        TTVideoEngineLog.m256505i("TTVideoEngine", "setSurfaceHook, player:" + mediaPlayer + ", surface:" + surface + ", texturesurface:" + this.mTextureSurface + ", this:" + this);
        if (mediaPlayer == null) {
            return;
        }
        if (this.mFirstFrameOpenTexture == 1 && this.mSurfaceHolder == null && !this.mPlayerFirstFrame) {
            _doSetPlayerSurface(surface, 1);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("set surface to player = ");
        Surface surface2 = this.mTextureSurface;
        if (surface2 == null) {
            surface2 = surface;
        }
        sb.append(surface2);
        TTVideoEngineLog.m256505i("TTVideoEngine", sb.toString());
        Surface surface3 = this.mTextureSurface;
        if (surface3 == null) {
            surface3 = surface;
        }
        _doSetPlayerSurface(surface3, 0);
        VideoSurface videoSurface = this.mTextureSurface;
        if (videoSurface != null && this.mTextureRenderer != null) {
            videoSurface.updateRenderSurface(surface);
        }
    }

    private void updateConfigParams(Map<Integer, Integer> map) {
        int i;
        int i2;
        if (map != null) {
            int i3 = 0;
            if (this.mPlayerType == 1) {
                i = 1;
            } else {
                i = 0;
            }
            map.put(2, Integer.valueOf(i));
            int i4 = this.mPlayerType;
            if (i4 == 2 || i4 == 5) {
                i2 = 0;
            } else {
                i2 = 1;
            }
            map.put(1, Integer.valueOf(i2));
            HashMap<Integer, Integer> hashMap = this.mConfigParams;
            if (this.mPlayerType == 5) {
                i3 = 1;
            }
            hashMap.put(26, Integer.valueOf(i3));
            map.put(11, Integer.valueOf(this.mForbidOSPlayer));
            map.put(100, Integer.valueOf(this.mConfigParamsOption));
            map.put(27, Integer.valueOf(this.mFallbackExoFirst ? 1 : 0));
        }
    }

    public void _decoderStart(int i) {
        PlayerEventSimpleListener playerEventSimpleListener;
        PlayerEventSimpleListener playerEventSimpleListener2;
        MediaPlayer mediaPlayer = this.mMediaPlayer;
        if (mediaPlayer != null && this.mEnableDebugUINotify != 0) {
            if (i == 0 && (playerEventSimpleListener2 = this.mPlayerEventListener) != null) {
                playerEventSimpleListener2.onVideoDecoderOpened(mediaPlayer.getIntOption(157, -1), this.mMediaPlayer.getLongOption(629, -1), this.mMediaPlayer.getLongOption(630, -1));
                this.mPlayerEventListener.onVideoDecodedFirstFrame(this.mMediaPlayer.getLongOption(77, -1));
            } else if (i == 1 && (playerEventSimpleListener = this.mPlayerEventListener) != null) {
                playerEventSimpleListener.onAudioDecoderOpened(mediaPlayer.getIntOption(158, -1), this.mMediaPlayer.getLongOption(631, -1), this.mMediaPlayer.getLongOption(632, -1));
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void _doSetDirectURL(String str) {
        if (str != null && !str.equals(this.mDirectURL)) {
            TTVideoEngineLog.m256505i("TTVideoEngine", String.format("set direct url:%s", str));
            _ShutdownOldSource();
            this.mState = 0;
            this.mFirstURL = true;
            this.mFirstIP = true;
            this.mFirstHost = true;
            this.mUserStopped = false;
            this.mLastPlaybackTime = 0;
            this.mAPIString = null;
        }
        this.mStarted = false;
        this.mIsDirectURL = true;
        this.mDirectURL = str;
        this.mDirectUrlSrc = str;
        this.mBufferingStartT = 0;
        this.mCachePath = null;
        this.mFileKey = null;
        Resolution resolution = Resolution.Undefine;
        this.currentResolution = resolution;
        this.mLogger.configResolution(_resolutionToString(resolution), "");
        this.mLogger.setSourceType(1, "");
        this.mLogger.setIntOption(51, this.mEnablePlayerDegrade ? 1 : 0);
    }

    /* access modifiers changed from: package-private */
    public void _doSetLocalURL(String str) {
        if (str != null && !str.equals(this.mLocalURL)) {
            TTVideoEngineLog.m256505i("TTVideoEngine", String.format("set local url:%s", str));
            _ShutdownOldSource();
            this.mState = 0;
            this.mUserStopped = false;
            this.mLastPlaybackTime = 0;
            this.mFirstURL = true;
            this.mAPIString = null;
        }
        this.mStarted = false;
        this.mIsLocal = true;
        this.mLocalURL = str;
        this.mBufferingStartT = 0;
        this.mLogger.setSourceType(0, "");
        this.mCachePath = null;
        this.mFileKey = null;
        Resolution resolution = Resolution.Undefine;
        this.currentResolution = resolution;
        this.mLogger.configResolution(_resolutionToString(resolution), "");
    }

    /* access modifiers changed from: package-private */
    public void _doSetPlayItem(TTVideoEnginePlayItem tTVideoEnginePlayItem) {
        boolean isExpired = tTVideoEnginePlayItem.isExpired();
        if (TextUtils.isEmpty(tTVideoEnginePlayItem.playURL) || isExpired) {
            setVideoID(tTVideoEnginePlayItem.vid);
            return;
        }
        _ShutdownOldSource();
        if (!tTVideoEnginePlayItem.equals(this.mPlayItem)) {
            if (this.mPlayItem != null) {
                _reset();
            }
            this.mIsPlayItem = true;
            this.mFirstURL = true;
            this.mFirstIP = true;
            this.mFirstHost = true;
            this.mState = 0;
            this.mUserStopped = false;
            this.mLastPlaybackTime = 0;
            this.mAPIString = null;
        }
        this.mStarted = false;
        this.mPlayItem = tTVideoEnginePlayItem;
        this.mBufferingStartT = 0;
        if (tTVideoEnginePlayItem.resolution != null) {
            this.currentResolution = tTVideoEnginePlayItem.resolution;
        }
        this.mVideoID = tTVideoEnginePlayItem.vid;
        this.mLogger.setSourceType(2, tTVideoEnginePlayItem.vid);
        this.urlIPMap.clear();
        this.mCachePath = null;
        this.mFileKey = null;
    }

    /* access modifiers changed from: package-private */
    public void _doSetPreloaderItem(TTAVPreloaderItem tTAVPreloaderItem) {
        int i = tTAVPreloaderItem.mResolution;
        if (i == 0) {
            this.currentResolution = Resolution.Standard;
        } else if (i == 1) {
            this.currentResolution = Resolution.High;
        } else if (i == 2) {
            this.currentResolution = Resolution.SuperHigh;
        } else if (i == 3) {
            this.currentResolution = Resolution.ExtremelyHigh;
        } else if (i != 4) {
            setVideoID(tTAVPreloaderItem.mVideoID);
            return;
        } else {
            this.currentResolution = Resolution.FourK;
        }
        _ShutdownOldSource();
        TTAVPreloaderItem tTAVPreloaderItem2 = this.mPreloaderItem;
        if (tTAVPreloaderItem2 != null && !tTAVPreloaderItem2.equals(tTAVPreloaderItem)) {
            _reset();
            this.mIsLocal = false;
            this.mFirstURL = true;
            this.mFirstIP = true;
            this.mFirstHost = true;
            this.mState = 0;
            this.mUserStopped = false;
            this.mLastPlaybackTime = 0;
            this.mFetcher = null;
            this.mAPIString = null;
        }
        this.mStarted = false;
        this.mIsPreloaderItem = true;
        this.mPreloaderItem = tTAVPreloaderItem;
        this.mBufferingStartT = 0;
        this.urlIPMap.clear();
        String str = tTAVPreloaderItem.mVideoID;
        this.mVideoID = str;
        this.mLogger.setSourceType(3, str);
        this.mCachePath = null;
        this.mFileKey = null;
        TTVideoEngineLog.m256505i("TTVideoEngine", "set preloaderitem");
    }

    /* access modifiers changed from: package-private */
    public void _doSetVideoID(String str) {
        if (str != null && !str.equals(this.mVideoID)) {
            TTVideoEngineLog.m256505i("TTVideoEngine", String.format("set video id:%s", str));
            _ShutdownOldSource();
            this.mIsLocal = false;
            this.mFirstURL = true;
            this.mFirstIP = true;
            this.mFirstHost = true;
            this.mState = 0;
            this.mUserStopped = false;
            this.mLastPlaybackTime = 0;
            this.mAPIString = null;
        }
        this.mStarted = false;
        this.mVideoID = str;
        this.mBufferingStartT = 0;
        this.mLogger.setSourceType(5, str);
        this.urlIPMap.clear();
        this.mCachePath = null;
        this.mFileKey = null;
    }

    /* access modifiers changed from: package-private */
    public void _dumpSurface(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(this);
        sb.append(" -> ");
        sb.append(str);
        sb.append(" dumpSurface: ");
        sb.append("mSurface = ");
        sb.append(this.mSurface);
        if (this.mSurface != null) {
            sb.append(" isValid = ");
            sb.append(this.mSurface.isValid());
        }
        sb.append(", mSurfaceHolder = ");
        sb.append(this.mSurfaceHolder);
        SurfaceHolder surfaceHolder = this.mSurfaceHolder;
        if (surfaceHolder != null) {
            Surface surface = surfaceHolder.getSurface();
            sb.append(" surface = ");
            sb.append(surface);
            if (surface != null) {
                sb.append(" isValid = ");
                sb.append(surface.isValid());
            }
        }
        sb.append(", mTextureSurface = ");
        sb.append(this.mTextureSurface);
        if (this.mTextureSurface != null) {
            sb.append(" isValid = ");
            sb.append(this.mTextureSurface.isValid());
        }
        TTVideoEngineLog.m256500d("TTVideoEngine", sb.toString());
    }

    public void _renderSeekComplete(int i) {
        TTVideoEngineLog.m256505i("TTVideoEngine", String.format("render seek complete:%d", Integer.valueOf(i)));
        IVideoEventLogger iVideoEventLogger = this.mLogger;
        if (iVideoEventLogger != null) {
            iVideoEventLogger.renderSeekCompleted(i);
            this.mLogger.showedOneFrame();
        }
        if (this.mSeeking) {
            this.mSeeking = false;
            this.mSeekingStartTime = 0;
            IVideoEventLogger iVideoEventLogger2 = this.mLogger;
            if (iVideoEventLogger2 != null) {
                iVideoEventLogger2.seekCompleted();
                this.mLogger.showedOneFrame();
            }
        }
        if (this.mVideoEngineInfoListener != null) {
            TTVideoEngineLog.m256505i("TTVideoEngine", "render seek complete call back " + i);
            VideoEngineInfos videoEngineInfos = new VideoEngineInfos();
            videoEngineInfos.setKey("renderSeekComplete");
            videoEngineInfos.setObject(Integer.valueOf(i));
            if (this.mLooperThread.checkSendMainLooper()) {
                this.mLooperThread.postMainLooperMessage(PLAYER_OPTION_USE_AJ_MEDIACODEC, 0, 0, videoEngineInfos);
            } else {
                this.mVideoEngineInfoListener.onVideoEngineInfos(videoEngineInfos);
            }
        }
    }

    public void _seekComplete(boolean z) {
        TTVideoEngineLog.m256505i("TTVideoEngine", "seek complete");
        if (!isInHousePlayer()) {
            this.mSeeking = false;
            this.mSeekingStartTime = 0;
            IVideoEventLogger iVideoEventLogger = this.mLogger;
            if (iVideoEventLogger != null) {
                iVideoEventLogger.seekCompleted();
                this.mLogger.showedOneFrame();
            }
        }
        if (this.mSeamSwitchingResolution) {
            this.mSeamSwitchingResolution = false;
            changeResolutionSwitchingState(false);
            IVideoEventLogger iVideoEventLogger2 = this.mLogger;
            if (iVideoEventLogger2 != null) {
                iVideoEventLogger2.switchResolutionEnd(true);
            }
        }
        if (this.mLooperThread.checkSendMainLooper()) {
            this.mLooperThread.postMainLooperMessage(PLAYER_OPTION_DEFAULT_RENDER_TYPE, z ? 1 : 0, 0, null);
        } else {
            SeekCompletionListener seekCompletionListener = this.mSeekCompletionListener;
            if (seekCompletionListener != null) {
                seekCompletionListener.onCompletion(z);
                this.mSeekCompletionListener = null;
            }
        }
        MediaPlayer mediaPlayer = this.mMediaPlayer;
        if (mediaPlayer != null && this.mP2PCDNType != 0) {
            long longOption = mediaPlayer.getLongOption(73, -1);
            long longOption2 = this.mMediaPlayer.getLongOption(72, -1);
            int i = (longOption > 0 ? 1 : (longOption == 0 ? 0 : -1));
            if (i >= 0 && longOption2 >= 0) {
                longOption = Math.min(longOption, longOption2);
            } else if (i < 0) {
                if (longOption2 >= 0) {
                    longOption = longOption2;
                } else {
                    return;
                }
            }
            setPlayInfo(5, longOption);
        }
    }

    public void _setSubInfoToMediaPlayer(String str) {
        this.mSubPathInfo = str;
        if (!TextUtils.isEmpty(str) && this.mEnableSubThread > 0) {
            this.mMediaPlayer.setIntOption(618, this.mEnableSub);
            this.mMediaPlayer.setStringOption(617, this.mSubPathInfo);
            this.mLogger.setLongOption(83, System.currentTimeMillis());
        }
        TTVideoEngineLog.m256500d("TTVideoEngine", "sub option: " + this.mEnableSub + "sub thread: " + this.mEnableSubThread + " url:" + this.mSubPathInfo);
    }

    public void _updatePlaybackState(int i) {
        int i2 = this.mPlaybackState;
        if (i2 != i) {
            TTVideoEngineLog.m256505i("TTVideoEngine", String.format("playback state changed, prev:%d, current:%d", Integer.valueOf(i2), Integer.valueOf(i)));
            this.mPlaybackState = i;
            if (this.mLooperThread.checkSendMainLooper()) {
                this.mLooperThread.postMainLooperMessage(MediaPlayer.MEDIA_PLAYER_OPTION_USE_CODEC_POOL, this.mPlaybackState, 0, null);
                return;
            }
            VideoEngineListener videoEngineListener = this.mVideoEngineListener;
            if (videoEngineListener != null) {
                videoEngineListener.onPlaybackStateChanged(this, this.mPlaybackState);
            }
            VideoEngineCallback videoEngineCallback = this.mSimpleCallback;
            if (videoEngineCallback != null) {
                videoEngineCallback.onPlaybackStateChanged(this, this.mPlaybackState);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setPlayAuthToken(java.lang.String r4) {
        /*
        // Method dump skipped, instructions count: 109
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttvideoengine.TTVideoEngine.setPlayAuthToken(java.lang.String):void");
    }

    public void setPlaybackParams(PlaybackParams playbackParams) {
        if (playbackParams != null) {
            TTVideoEngineLog.m256500d("TTVideoEngine", "[SRLog]setPlaybackParams:" + playbackParams + ", speed:" + playbackParams.getSpeed() + ", pitch:" + playbackParams.getPitch());
        }
        this.mPlaybackParams = playbackParams;
        if (!(playbackParams == null || playbackParams.getSpeed() == -1.0f)) {
            SRStrategyConfig sRStrategyConfig = new SRStrategyConfig();
            if (((int) (playbackParams.getSpeed() * 100.0f)) == 100) {
                sRStrategyConfig.setIsSpeed(false);
            } else {
                sRStrategyConfig.setIsSpeed(true);
            }
            this.mSRStrategy.updateConfig(sRStrategyConfig);
        }
        if (this.mLooperThread.checkEngineLooperThread(false)) {
            this.mLooperThread.postEngineMessage(53, 0, 0, playbackParams);
        } else {
            _doSetPlaybackParams(playbackParams);
        }
    }

    private AbstractC20879g _initABRModule(IVideoModel iVideoModel) {
        boolean z;
        float f;
        float f2;
        float f3;
        float f4;
        DefaultABRModule defaultABRModule = null;
        if (!(iVideoModel == null || (this.mEnableABR == 0 && this.mStandAlongAbrStartUp == 0))) {
            if (!isSupportSeamlessSwitch(iVideoModel) && this.mStandAlongAbrStartUp <= 0) {
                return null;
            }
            if (this.mEnableABR == 1 || this.mABRUsed) {
                z = true;
            } else {
                z = false;
            }
            this.mABRUsed = z;
            TTVideoEngineLog.m256500d("TTVideoEngine", String.format("[ABR] init ABR，algorithm type:%d", Integer.valueOf(sABRAlgorithmType)));
            C20873c.m75968b(this.mABRSwitchSensitivity);
            C20873c.m75964a(this.mABRStartupBandwidthParameter);
            C20873c.m75967b(this.mABRStallPenaltyParameter);
            C20873c.m75970c(this.mABRSwitchPenaltyParameter);
            C20873c.m75973d(this.mABRBandwidthParameter);
            defaultABRModule = new DefaultABRModule();
            defaultABRModule.mo70543a(new MyABRInfoListener(this));
            defaultABRModule.mo70544a(new MyPlayStateSupplier(this));
            defaultABRModule.mo70540a(34, this.mScreenWidth);
            defaultABRModule.mo70540a(35, this.mScreenHeight);
            defaultABRModule.mo70540a(6, this.mPlayerViewWidth);
            defaultABRModule.mo70540a(7, this.mPlayerViewHeight);
            defaultABRModule.mo70541a(26, this.mPlayStartTimestamp);
            AbstractC20887b bVar = StrategyCenter.sNetAbrSpeedPredictor;
            float f5 = BitmapDescriptorFactory.HUE_RED;
            if (bVar != null) {
                Map<String, String> b = StrategyCenter.sNetAbrSpeedPredictor.mo70590b(VideoRef.TYPE_VIDEO);
                if (!(b == null || b.get("download_speed") == null)) {
                    f5 = Float.parseFloat(b.get("download_speed"));
                }
                f2 = StrategyCenter.sNetAbrSpeedPredictor.mo70582a(0);
                f = StrategyCenter.sNetAbrSpeedPredictor.mo70591c();
                f3 = StrategyCenter.sNetAbrSpeedPredictor.mo70583a(VideoRef.TYPE_VIDEO, 1, true);
                f4 = StrategyCenter.sNetAbrSpeedPredictor.mo70583a(VideoRef.TYPE_VIDEO, this.mABRStartupSpeedType, false);
            } else {
                f4 = BitmapDescriptorFactory.HUE_RED;
                f3 = BitmapDescriptorFactory.HUE_RED;
                f2 = BitmapDescriptorFactory.HUE_RED;
                f = BitmapDescriptorFactory.HUE_RED;
            }
            defaultABRModule.mo70539a(25, f5);
            defaultABRModule.mo70539a(23, f2);
            defaultABRModule.mo70539a(24, f);
            defaultABRModule.mo70539a(27, f3);
            defaultABRModule.mo70539a(28, f4);
            defaultABRModule.mo70540a(21, TTNetWorkListener.getInstance().getCurrentAccessType());
            setMediaInfo2Abr(defaultABRModule, iVideoModel);
        }
        return defaultABRModule;
    }

    private void _parseDNS(String str) {
        TTVideoEngineLog.m256505i("TTVideoEngine", String.format("hostnameURL:%s", str));
        if (this.mShouldStop) {
            TTVideoEngineLog.m256508w("TTVideoEngine", "_parseDNS should stop");
            return;
        }
        this.mState = 2;
        IVideoEventLogger iVideoEventLogger = this.mLogger;
        if (iVideoEventLogger != null) {
            iVideoEventLogger.setDNSStartTime(System.currentTimeMillis(), 0);
        }
        try {
            DNSParser dNSParser = new DNSParser(this.mContext, new URL(str).getHost(), getNetClientSetByUser());
            this.mDNSParser = dNSParser;
            dNSParser.setCompletionListener(new MyDNSCompletionListener(this));
            if (this.mErrorCount != 0) {
                this.mDNSParser.setForceReparse();
            }
            this.mDNSParser.setIsUseDNSCache(this.mUseDNSCache);
            int i = this.mDNSExpiredTime;
            if (i > 0) {
                this.mDNSParser.setDNSExpiredTimeInS(i);
            }
            boolean z = this.mIsUseServerDns;
            if (z && this.mVideoModel != null) {
                this.mDNSParser.setIsUseServerDNS(z);
                this.mDNSParser.setDnsInfo(this.mVideoModel.getDnsInfo(), Long.valueOf(this.mVideoModel.getVideoRefLong(SmEvents.EVENT_MEETING_LICENSE_TIME_OUT)));
            }
            this.mDNSParser.start();
        } catch (Exception e) {
            TTVideoEngineLog.m256501d(e);
        }
    }

    public void _bufferEnd(int i) {
        IVideoEventLogger iVideoEventLogger;
        TTVideoEngineLog.m256505i("TTVideoEngine", "buffering end,this:" + this + ", code:" + i);
        PlayDurationManager playDurationManager = this.mPlayDuration;
        if (playDurationManager != null && this.mPlaybackState == 1) {
            playDurationManager.start();
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.mBufferingStartT;
        if (j > 0 && elapsedRealtime >= j) {
            IVideoEventLogger iVideoEventLogger2 = this.mLogger;
            if (iVideoEventLogger2 != null) {
                iVideoEventLogger2.movieStallEnd(i);
                if (i == 0) {
                    P2PStragetyManager.getInstance().setBufferingTime(elapsedRealtime - this.mBufferingStartT);
                }
            }
            if (i == 0) {
                setPlayInfo(4, 1);
            }
            P2PPlayUrlInfo p2PPlayUrlInfo = this.curP2PUrlInfo;
            if (p2PPlayUrlInfo != null && !TextUtils.isEmpty(p2PPlayUrlInfo.mUrl)) {
                VideoLoadWrapper.getInstance().videoStalled(this.curP2PUrlInfo.mUrl, (int) (elapsedRealtime - this.mBufferingStartT));
            }
            int i2 = this.mResumeFileIOBlockThresMs;
            if (i2 > 0 && elapsedRealtime - this.mBufferingStartT > ((long) i2)) {
                TTVideoEngineLog.m256500d("TTVideoEngine", String.format("resume io thres:%d cur block:%d", Integer.valueOf(i2), Long.valueOf(elapsedRealtime - this.mBufferingStartT)));
            }
            this.mBufferingStartT = 0;
        } else if (this.mNotifyBufferingDirectly == 1 && (iVideoEventLogger = this.mLogger) != null) {
            iVideoEventLogger.playbackBufferEnd();
        }
        this.mBufferingType = -1;
        VideoBufferListener videoBufferListener = this.mVideoBufferListener;
        if (videoBufferListener != null) {
            videoBufferListener.onBufferEnd(i);
        }
        VideoBufferDetailListener videoBufferDetailListener = this.mVideoBufferDetailListener;
        if (videoBufferDetailListener != null) {
            videoBufferDetailListener.onBufferEnd(i);
        }
        VideoEngineCallback videoEngineCallback = this.mSimpleCallback;
        if (videoEngineCallback != null) {
            videoEngineCallback.onBufferEnd(i);
        }
        _updateLoadState(1, i);
        _updateTextureState(1);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v5, resolved type: com.ss.ttvideoengine.VideoBufferDetailListener */
    /* JADX DEBUG: Multi-variable search result rejected for r1v6, resolved type: com.ss.ttvideoengine.TTVideoEngineLooperThread */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int, boolean] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void _bufferStart(int r5) {
        /*
        // Method dump skipped, instructions count: 144
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttvideoengine.TTVideoEngine._bufferStart(int):void");
    }

    /* access modifiers changed from: package-private */
    public long _doGetLongOption(int i) {
        MediaPlayer mediaPlayer = this.mMediaPlayer;
        if (i != 81) {
            if (i != 315) {
                if (i == 461) {
                    return this.mVideoPreloadSize;
                }
                if (i == 614) {
                    long j = this.mPlayStartTime;
                    TTVideoEngineLog.m256505i("TTVideoEngine", "get mPlayStartTime:" + j);
                    return j;
                } else if (i != 615) {
                    switch (i) {
                        case 60:
                            if (this.mBitrate < 0) {
                                this.mBitrate = mediaPlayer.getLongOption(171, 0);
                            }
                            return this.mBitrate;
                        case 61:
                            if (mediaPlayer != null) {
                                return mediaPlayer.getLongOption(73, 0);
                            }
                            return -1;
                        case 62:
                            if (mediaPlayer != null) {
                                return mediaPlayer.getLongOption(72, 0);
                            }
                            return -1;
                        case 63:
                            if (mediaPlayer == null) {
                                return -1;
                            }
                            try {
                                return mediaPlayer.getLongOption(63, -1);
                            } catch (Throwable th) {
                                TTVideoEngineLog.m256501d(th);
                                return -1;
                            }
                        default:
                            return -1;
                    }
                } else {
                    long j2 = this.mRenderStartTime;
                    TTVideoEngineLog.m256505i("TTVideoEngine", "get mRenderStartTime:" + j2);
                    return j2;
                }
            } else if (mediaPlayer != null) {
                return mediaPlayer.getLongOption(46, 0);
            } else {
                return -1;
            }
        } else if (mediaPlayer == null) {
            return -1;
        } else {
            long longOption = mediaPlayer.getLongOption(240, 0);
            TTVideoEngineLog.m256505i("TTVideoEngine", "get value of KeyIsLastBufferSizeU64: " + longOption);
            return longOption;
        }
    }

    /* access modifiers changed from: package-private */
    public String _doGetStringOption(int i) {
        MediaPlayer mediaPlayer = this.mMediaPlayer;
        String str = "";
        if (i != 80) {
            if (i != 82) {
                if (i == 462) {
                    Map<String, IpInfo> map = this.urlIPMap;
                    if (map == null) {
                        return str;
                    }
                    for (Map.Entry<String, IpInfo> entry : map.entrySet()) {
                        String key = entry.getKey();
                        IpInfo value = entry.getValue();
                        if (!(key == null || value == null)) {
                            if (value instanceof IpInfo) {
                                IpInfo ipInfo = value;
                                HashMap hashMap = new HashMap();
                                hashMap.put("ip", ipInfo.ip);
                                hashMap.put("dns", ipInfo.dns);
                                hashMap.put("dns_cache_open", Integer.valueOf(ipInfo.isDNSCacheOpen));
                                hashMap.put("server_dns_open", Integer.valueOf(ipInfo.isServerDNSOpen));
                                hashMap.put("url_desc", ipInfo.urlDesc);
                                str = hashMap.toString();
                            } else {
                                throw new RuntimeException(value.getClass().getName());
                            }
                        }
                    }
                    return str;
                } else if (i != 477) {
                    return str;
                } else {
                    try {
                        IVideoEventLogger iVideoEventLogger = this.mLogger;
                        if (iVideoEventLogger != null) {
                            return iVideoEventLogger.getStringOption(47);
                        }
                        return str;
                    } catch (Throwable th) {
                        TTVideoEngineLog.m256501d(th);
                        return str;
                    }
                }
            } else if (mForceUsePluginPlayer) {
                return MediaPlayerWrapper.getPluginVersion();
            } else {
                return TTPlayerConfiger.getValue(14, str);
            }
        } else if (mediaPlayer != null) {
            return mediaPlayer.getStringOption(142);
        } else {
            return str;
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x006b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void _doParseDNSComplete(java.lang.String r13) {
        /*
        // Method dump skipped, instructions count: 158
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttvideoengine.TTVideoEngine._doParseDNSComplete(java.lang.String):void");
    }

    /* access modifiers changed from: package-private */
    public void _doSetSurfaceHolder(SurfaceHolder surfaceHolder) {
        IVideoEventLogger iVideoEventLogger;
        if (!(this.mSurfaceCallback == null || this.mSurfaceHolder == null)) {
            TTVideoEngineLog.m256500d("TTVideoEngine", "remove callback:" + this.mSurfaceCallback + ", surfaceholder:" + surfaceHolder + ", mSurface:" + this.mSurface + ", mSurfaceHolder:" + this.mSurfaceHolder);
            this.mSurfaceCallback.reset();
            this.mSurfaceHolder.removeCallback(this.mSurfaceCallback);
            this.mSurfaceCallback = null;
        }
        this.mSurfaceHolder = surfaceHolder;
        if (!(surfaceHolder == null || (iVideoEventLogger = this.mLogger) == null)) {
            iVideoEventLogger.setSurface(surfaceHolder.toString());
        }
        if (this.mSurfaceHolderByKernel != 0) {
            MediaPlayer mediaPlayer = this.mMediaPlayer;
            if (mediaPlayer != null) {
                mediaPlayer.setDisplay(surfaceHolder);
            }
        } else if (this.mSurfaceHolder == null) {
            setSurfaceHook(null);
        } else {
            TTVideoEngineSurfaceCallback tTVideoEngineSurfaceCallback = new TTVideoEngineSurfaceCallback(this);
            this.mSurfaceCallback = tTVideoEngineSurfaceCallback;
            this.mSurfaceHolder.addCallback(tTVideoEngineSurfaceCallback);
            setSurfaceHook(this.mSurfaceHolder.getSurface());
        }
    }

    /* access modifiers changed from: package-private */
    public void _doSetVideoModel(IVideoModel iVideoModel) {
        String videoRefStr = iVideoModel.getVideoRefStr(2);
        if (TextUtils.isEmpty(videoRefStr)) {
            TTVideoEngineLog.m256505i("TTVideoEngine", "_doSetVideoModel vid is empty");
            return;
        }
        if (iVideoModel != null && !iVideoModel.equals(this.mVideoModel)) {
            TTVideoEngineLog.m256505i("TTVideoEngine", "_doSetVideoModel VideoModel is new");
            _ShutdownOldSource();
            this.mIsLocal = false;
            this.mFirstURL = true;
            this.mFirstIP = true;
            this.mFirstHost = true;
            this.mState = 0;
            this.mUserStopped = false;
            this.mLastPlaybackTime = 0;
            this.mFetcher = null;
            this.mAPIString = null;
        }
        this.mStarted = false;
        this.mVideoModel = iVideoModel;
        this.mKeyseed = iVideoModel.getVideoRefStr(SmEvents.EVENT_AUTO_END);
        this.mFallbackAPI = this.mVideoModel.getVideoRefStr(SmEvents.EVENT_LOCAL_BUSY_FORCE_END_LAST);
        this.mVideoModelVersion = this.mVideoModel.getVideoRefInt(9);
        this.mVideoModel.setUpResolution(this.mResolutionMap);
        this.mVideoID = videoRefStr;
        mdlFetcherStore();
        this.mIsFeedInfo = true;
        this.mBufferingStartT = 0;
        this.mLogger.setSourceType(4, this.mVideoID);
        this.mLogger.setFeed(iVideoModel);
        this.mCachePath = null;
        this.mFileKey = null;
        TTVideoEngineLog.m256505i("TTVideoEngine", String.format("set video model, fallback api:%s, keyseed:%s", this.mFallbackAPI, this.mKeyseed));
    }

    /* access modifiers changed from: package-private */
    public void _play(boolean z) {
        TTAVPreloaderItem tTAVPreloaderItem;
        TTVideoEngineLog.m256505i("TTVideoEngine", "_play, mState:" + this.mState + ", byPlay:" + z + ", this:" + this);
        this.mStarted = true;
        this.mPausedBeforePrepared = false;
        if (z) {
            setSpeedTest();
        }
        _initUsingHandle();
        IVideoEventLogger iVideoEventLogger = this.mLogger;
        if (iVideoEventLogger != null) {
            if (z) {
                iVideoEventLogger.setLoggerTimes(64);
                if (this.mPlayStartTime < 0) {
                    this.mPlayStartTime = SystemClock.elapsedRealtime();
                    TTVideoEngineLog.m256505i("TTVideoEngine", "mPlayStartTime:" + this.mPlayStartTime + ", curT:" + System.currentTimeMillis());
                }
            } else if (this.mReadCacheMode != 0) {
                iVideoEventLogger.setIntOption(31, 1);
            }
            this.mLogger.play();
        }
        int i = this.mState;
        if (i != 0) {
            if (i != 1) {
                if (i == 3) {
                    _replayOrResume();
                    return;
                } else if (i != 4) {
                    return;
                }
            } else if (this.mVideoModel != null) {
                if (!this.mIsPreloaderItem || (tTAVPreloaderItem = this.mPreloaderItem) == null) {
                    _logBeginToPlay(this.mVideoID);
                } else {
                    _logBeginToPlay(tTAVPreloaderItem.mVideoID);
                }
                _parseIPAddress(this.mVideoModel);
                return;
            } else if (!this.mIsFetchingInfo) {
                _prepareToPlay();
                return;
            } else {
                return;
            }
        }
        _prepareToPlay();
    }

    public void _streamChanged(int i) {
        PlayerEventSimpleListener playerEventSimpleListener;
        TTVideoEngineLog.m256505i("TTVideoEngine", String.format("stream %d changed, state:%d, mPrepared:%d, mLoadState:%d", Integer.valueOf(i), Integer.valueOf(this.mPlaybackState), Integer.valueOf(this.mPrepared ? 1 : 0), Integer.valueOf(this.mLoadState)));
        if (this.mSeeking) {
            this.mSeeking = false;
            this.mSeekingStartTime = 0;
        }
        if (!(this.mEnableDebugUINotify == 0 || (playerEventSimpleListener = this.mPlayerEventListener) == null || this.mMediaPlayer == null)) {
            if (i == 0) {
                playerEventSimpleListener.onVideoInputFormatChanged(getVideoFormatInfo());
            } else if (i == 1) {
                playerEventSimpleListener.onAudioInputFormatChanged(getVideoFormatInfo());
            }
        }
        if (i == 0 && !this.mDecodedVideoFirstFrame) {
            this.mDecodedVideoFirstFrame = true;
        }
        if (this.mPrepared && this.mPlaybackState != 0 && this.mLoadState != 0) {
            if (this.mLooperThread.checkSendMainLooper()) {
                this.mLooperThread.postMainLooperMessage(407, i, 0, null);
                return;
            }
            VideoEngineListener videoEngineListener = this.mVideoEngineListener;
            if (videoEngineListener != null) {
                videoEngineListener.onStreamChanged(this, i);
            }
            VideoEngineCallback videoEngineCallback = this.mSimpleCallback;
            if (videoEngineCallback != null) {
                videoEngineCallback.onStreamChanged(this, i);
            }
        }
    }

    public void _videoBitrateChanged(int i) {
        Resolution resolution = Resolution.Undefine;
        IVideoModel iVideoModel = this.mVideoModel;
        if (iVideoModel != null && iVideoModel.hasData()) {
            Resolution[] allResolutions = Resolution.getAllResolutions();
            int i2 = 0;
            while (true) {
                if (i2 < allResolutions.length) {
                    VideoInfo videoInfo = this.mVideoModel.getVideoInfo(allResolutions[i2], VideoRef.TYPE_VIDEO, (Map<Integer, String>) null);
                    if (videoInfo != null && videoInfo.getValueInt(3) == i) {
                        resolution = allResolutions[i2];
                        this.lastResolution = this.currentResolution;
                        this.currentResolution = resolution;
                        this.mCurrentQualityDesc = videoInfo.getValueStr(32);
                        _logFirstResolution(this.currentResolution);
                        this.mLogger.configResolution(_resolutionToString(this.currentResolution), _resolutionToString(this.lastResolution));
                        this.mLogger.setCurrentQualityDesc(this.mCurrentQualityDesc);
                        break;
                    }
                    i2++;
                } else {
                    break;
                }
            }
        }
        TTVideoEngineLog.m256505i("TTVideoEngine", String.format("video bitrate changed:%d, resoluton:%s", Integer.valueOf(i), resolution.toString(VideoRef.TYPE_VIDEO)));
        if (this.mPlaybackState != 2 || !this.mSeamSwitchingResolution) {
            if (this.mResolutionSwitching) {
                this.mLogger.switchResolutionEnd(false);
            }
            changeResolutionSwitchingState(false);
        } else {
            this.mSeamSwitchingResolution = false;
            changeResolutionSwitchingState(false);
            IVideoEventLogger iVideoEventLogger = this.mLogger;
            if (iVideoEventLogger != null) {
                iVideoEventLogger.switchResolutionEnd(true);
            }
        }
        if (this.mLooperThread.checkSendMainLooper()) {
            this.mLooperThread.postMainLooperMessage(417, i, 0, resolution);
            return;
        }
        StreamInfoListener streamInfoListener = this.mStreamInfoListener;
        if (streamInfoListener != null) {
            streamInfoListener.onVideoStreamBitrateChanged(resolution, i);
        }
        VideoEngineCallback videoEngineCallback = this.mSimpleCallback;
        if (videoEngineCallback != null) {
            videoEngineCallback.onVideoStreamBitrateChanged(resolution, i);
        }
    }

    public String getDubbedMemUrl(List<DubbedInfo> list) {
        Exception e;
        if (list != null) {
            try {
                if (list.size() > 0) {
                    JSONObject jSONObject = new JSONObject();
                    JSONArray jSONArray = new JSONArray();
                    JSONArray jSONArray2 = new JSONArray();
                    for (DubbedInfo dubbedInfo : list) {
                        if (dubbedInfo != null) {
                            if (!TextUtils.isEmpty(dubbedInfo.mFileKey)) {
                                String str = dubbedInfo.mFileKey;
                                try {
                                    String _mdlUrl = _mdlUrl(str, null, (long) this.mLimitMDLCacheSize, new String[]{dubbedInfo.mMainUrl}, Resolution.Undefine, null, null, null, null);
                                    if (!TextUtils.isEmpty(_mdlUrl)) {
                                        dubbedInfo.mMainUrl = _mdlUrl;
                                    }
                                } catch (Exception e2) {
                                    e = e2;
                                    e.printStackTrace();
                                    return null;
                                }
                            }
                            JSONObject bashJsonObject = dubbedInfo.toBashJsonObject();
                            if (bashJsonObject != null) {
                                if (dubbedInfo.mMediaType == 0) {
                                    jSONArray.put(bashJsonObject);
                                } else if (dubbedInfo.mMediaType == 1) {
                                    jSONArray2.put(bashJsonObject);
                                }
                            }
                        }
                    }
                    jSONObject.put("dynamic_video_list", jSONArray);
                    jSONObject.put("dynamic_audio_list", jSONArray2);
                    return "mem://bash/url_index:0/segment_format:1/" + jSONObject.toString();
                }
            } catch (Exception e3) {
                e = e3;
                e.printStackTrace();
                return null;
            }
        }
        return null;
    }

    private void _logFirstURL(String str) {
        String str2;
        VideoInfo videoInfo;
        if (TextUtils.isEmpty(str)) {
            TTVideoEngineLog.m256500d("TTVideoEngine", "log first url . url is null");
            return;
        }
        if (this.mFirstURL) {
            int i = 0;
            this.mFirstURL = false;
            String str3 = "";
            if (str.startsWith("mem://bash") && (videoInfo = this.currentVideoInfo) != null) {
                if (videoInfo.getMediatype() == VideoRef.TYPE_VIDEO) {
                    str2 = this.dashVideoUrlMap.get(this.currentResolution);
                    if (str2 == null || str2.isEmpty()) {
                        str2 = str;
                    }
                    for (Map.Entry<Integer, String> entry : this.dashAudioUrlMap.entrySet()) {
                        if (i == 0) {
                            i = entry.getKey().intValue();
                        } else if (i > entry.getKey().intValue()) {
                            i = entry.getKey().intValue();
                        }
                    }
                    if (i > 0) {
                        str3 = this.dashAudioUrlMap.get(Integer.valueOf(i));
                    }
                    this.mLogger.setInitialURL(str2, str3);
                } else if (this.currentVideoInfo.getMediatype() == VideoRef.TYPE_AUDIO) {
                    str3 = this.dashAudioUrlMap.get(Integer.valueOf(this.currentVideoInfo.getValueInt(3)));
                }
            }
            str2 = str;
            this.mLogger.setInitialURL(str2, str3);
        }
        String[] strArr = null;
        VideoInfo videoInfo2 = this.currentVideoInfo;
        if (videoInfo2 != null) {
            strArr = videoInfo2.getValueStrArr(16);
        } else {
            IVideoModel iVideoModel = this.mVideoModel;
            if (iVideoModel != null) {
                strArr = iVideoModel.allVideoURLs(this.currentResolution, this.currentParams);
            }
        }
        if (strArr == null || strArr.length <= 0) {
            this.mLogger.setCurURL(str);
            TTVideoEngineLog.m256505i("TTVideoEngine", "set curUrl:" + str);
            return;
        }
        int intValue = this.urlIndexMap.get(this.currentResolution).intValue();
        if (intValue < strArr.length) {
            this.mLogger.setCurURL(strArr[intValue]);
            TTVideoEngineLog.m256505i("TTVideoEngine", "find curUrl:" + strArr[intValue]);
            return;
        }
        this.mLogger.setCurURL(str);
        TTVideoEngineLog.m256505i("TTVideoEngine", "set curUrl:" + str);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v14, resolved type: boolean */
    /* JADX DEBUG: Multi-variable search result rejected for r1v16, resolved type: boolean */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: package-private */
    public int _doGetIntOption(int i) {
        long wiredPlayedDuration;
        int i2;
        MediaPlayer mediaPlayer = this.mMediaPlayer;
        int i3 = 0;
        i3 = 0;
        i3 = 0;
        i3 = 0;
        i3 = 0;
        int i4 = -1;
        if (i != 0) {
            if (i != 4) {
                if (i == 83) {
                    PlayDurationManager playDurationManager = this.mPlayDuration;
                    if (playDurationManager != null) {
                        wiredPlayedDuration = playDurationManager.getWiredPlayedDuration();
                    }
                } else if (i != 84) {
                    if (i == 301) {
                        i3 = this.mP2PCDNType;
                    } else if (i == 302) {
                        i3 = this.mForbidP2P;
                    } else if (i == 424) {
                        i3 = this.mHijackRetryMainDNSType;
                    } else if (i == 425) {
                        i3 = this.mHijackRetryBackupDNSType;
                    } else if (i != 700) {
                        if (i != 701) {
                            switch (i) {
                                case 4:
                                    break;
                                case 26:
                                    i3 = this.mReuseSocket;
                                    break;
                                case 29:
                                case 494:
                                    i3 = this.mEnableABR;
                                    break;
                                case 33:
                                    i3 = this.mBashEnabled;
                                    break;
                                case 160:
                                    i3 = this.mDataLoaderEnable;
                                    break;
                                case 313:
                                    i3 = this.mCheckHijack;
                                    break;
                                case 343:
                                    if (mediaPlayer != null) {
                                        i3 = mediaPlayer.getIntOption(643, 0);
                                        break;
                                    }
                                    break;
                                case 371:
                                    if (mediaPlayer != null) {
                                        i3 = mediaPlayer.getIntOption(540, -1);
                                        break;
                                    }
                                    break;
                                case 416:
                                    i3 = this.mEnableSetPlayInfoToP2P;
                                    break;
                                case 480:
                                    i3 = this.mRadioModeEnable;
                                    break;
                                case 499:
                                    i3 = this.mEnableBarrageMask;
                                    break;
                                case 525:
                                    i3 = this.mABRSpeedPredictOutType;
                                    break;
                                case 530:
                                    i3 = this.mCurrentSubId;
                                    break;
                                case 533:
                                    i3 = this.mEnableSub;
                                    break;
                                case 650:
                                    i3 = this.mOverlayMode;
                                    break;
                                case 655:
                                    if (mediaPlayer != null) {
                                        i3 = mediaPlayer.getIntOption(541, 0);
                                        break;
                                    }
                                    break;
                                case 660:
                                    i2 = this.mSRNotUseReason;
                                    if (i2 >= 0) {
                                        VideoSurface videoSurface = this.mTextureSurface;
                                        if (videoSurface != null) {
                                            if (videoSurface.getIntOption(10) == 1) {
                                                if (this.mTextureSurface.getIntOption(6) != 1) {
                                                    i3 = -7899;
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            } else {
                                                TextureRenderManager textureRenderManager = this.mTextureRenderer;
                                                if (textureRenderManager != null && textureRenderManager.isSRRenderAvaiable(0)) {
                                                    i3 = -7894;
                                                    break;
                                                } else {
                                                    i3 = -7889;
                                                    break;
                                                }
                                            }
                                        } else if (!this.mStarted) {
                                            i3 = -7897;
                                            break;
                                        } else {
                                            i3 = -7893;
                                            break;
                                        }
                                    }
                                    i3 = i2;
                                    break;
                                case 667:
                                    IVideoModel iVideoModel = this.mVideoModel;
                                    if (iVideoModel != null) {
                                        VideoInfo videoInfo = iVideoModel.getVideoInfo(this.currentResolution, 0, (Map<Integer, String>) null);
                                        if (videoInfo != null) {
                                            i2 = videoInfo.getValueInt(41);
                                            i3 = i2;
                                            break;
                                        } else {
                                            break;
                                        }
                                    } else {
                                        break;
                                    }
                                default:
                                    switch (i) {
                                        case 40:
                                            IVideoEventLogger iVideoEventLogger = this.mLogger;
                                            if (iVideoEventLogger != null) {
                                                i3 = iVideoEventLogger.getCurDecoderBufferCount();
                                                break;
                                            }
                                            break;
                                        case 41:
                                            IVideoEventLogger iVideoEventLogger2 = this.mLogger;
                                            if (iVideoEventLogger2 != null) {
                                                wiredPlayedDuration = iVideoEventLogger2.getCurDecoderBufferAccuT();
                                                break;
                                            }
                                            break;
                                        case 42:
                                            if (mediaPlayer != null) {
                                                i3 = mediaPlayer.getIntOption(153, -1);
                                                break;
                                            }
                                            break;
                                        case 43:
                                            if (this.mVideoCodecType < 0 && mediaPlayer != null) {
                                                this.mVideoCodecType = mediaPlayer.getIntOption(157, -1);
                                            }
                                            i3 = this.mVideoCodecType;
                                            break;
                                        case 44:
                                            if (this.mAudioCodecType < 0 && mediaPlayer != null) {
                                                this.mAudioCodecType = mediaPlayer.getIntOption(158, -1);
                                            }
                                            i3 = this.mAudioCodecType;
                                            break;
                                        case 45:
                                            if (this.mVideoCodecID < 0 && mediaPlayer != null) {
                                                this.mVideoCodecID = mediaPlayer.getIntOption(SmActions.ACTION_IDLE_ENTRY, -1);
                                            }
                                            i3 = this.mVideoCodecID;
                                            break;
                                        case 46:
                                            if (this.mAudioCodecID < 0 && mediaPlayer != null) {
                                                this.mAudioCodecID = mediaPlayer.getIntOption(140, -1);
                                            }
                                            i3 = this.mAudioCodecID;
                                            break;
                                        case 47:
                                            i3 = this.mPlayerType;
                                            break;
                                        case 48:
                                            Context context = this.mContext;
                                            if (context != null) {
                                                AudioManager audioManager = (AudioManager) context.getSystemService("audio");
                                                if (audioManager != null) {
                                                    i4 = audioManager.getStreamMaxVolume(3);
                                                }
                                                if (i4 < 0) {
                                                    break;
                                                }
                                                i3 = i4;
                                                break;
                                            }
                                            break;
                                        case 49:
                                            Context context2 = this.mContext;
                                            if (context2 != null) {
                                                AudioManager audioManager2 = (AudioManager) context2.getSystemService("audio");
                                                if (audioManager2 != null) {
                                                    i4 = audioManager2.getStreamVolume(3);
                                                }
                                                if (i4 < 0) {
                                                    break;
                                                }
                                                i3 = i4;
                                                break;
                                            }
                                            break;
                                        case MmListControl.f116813f:
                                            i3 = this.mDuration;
                                            break;
                                        case 51:
                                            i3 = this.mLoadedProgress;
                                            break;
                                        case 52:
                                            if (!this.mSeamSwitchingResolution) {
                                                i3 = _getPlayerTime();
                                                break;
                                            } else {
                                                i3 = this.mLastPlaybackTime;
                                                break;
                                            }
                                        case 53:
                                            PlayDurationManager playDurationManager2 = this.mPlayDuration;
                                            if (playDurationManager2 != null) {
                                                i3 = playDurationManager2.getPlayedDuration();
                                                break;
                                            }
                                            break;
                                        case 54:
                                            i3 = this.mBufferingType;
                                            break;
                                        case 55:
                                            i3 = this.mPlaybackState;
                                            break;
                                        case 56:
                                            i3 = this.mLoadState;
                                            break;
                                        case 57:
                                            i3 = this.mState;
                                            break;
                                        case 58:
                                            if (this.mVideoCodecProfile == -1 && mediaPlayer != null) {
                                                this.mVideoCodecProfile = mediaPlayer.getIntOption(403, -1);
                                            }
                                            i3 = this.mVideoCodecProfile;
                                            break;
                                        case 59:
                                            try {
                                                if (this.mAudioCodecProfile == -1 && mediaPlayer != null) {
                                                    this.mAudioCodecProfile = mediaPlayer.getIntOption(402, -1);
                                                }
                                                i3 = this.mAudioCodecProfile;
                                                break;
                                            } catch (Throwable th) {
                                                TTVideoEngineLog.m256501d(th);
                                                return -1;
                                            }
                                    }
                            }
                        } else if (mediaPlayer != null) {
                            i3 = mediaPlayer.getIntOption(569, -1);
                        }
                    } else if (mediaPlayer != null) {
                        i3 = mediaPlayer.getIntOption(961, -1);
                    }
                    return i3 == 1 ? 1 : 0;
                } else {
                    PlayDurationManager playDurationManager3 = this.mPlayDuration;
                    if (playDurationManager3 != null) {
                        wiredPlayedDuration = playDurationManager3.getWirelessPlayedDuration(this.mContext);
                    }
                }
                i3 = (int) wiredPlayedDuration;
                return i3 == 1 ? 1 : 0;
            }
            i3 = this.mLayoutType;
            return i3 == 1 ? 1 : 0;
        } else if (mediaPlayer != null) {
            i3 = mediaPlayer.getIntOption(24, -1);
            return i3 == 1 ? 1 : 0;
        }
        i3 = -1;
        return i3 == 1 ? 1 : 0;
    }

    public void _receivedError(Error error) {
        boolean z;
        IntertrustDrmHelper intertrustDrmHelper;
        this.mAllowedExpiredModel = false;
        _updateLogTime();
        if (this.mUserStopped) {
            this.mState = 0;
            return;
        }
        int i = this.mPlayAPIVersion;
        int _getPlayerTime = _getPlayerTime();
        if (!this.mRetrying) {
            int i2 = this.mStartTime;
            if (i2 != 0) {
                this.mLastPlaybackTime = i2;
                this.mStartTime = 0;
            } else if (isInHousePlayer() || (!isInHousePlayer() && this.mPrepared && !this.mSeamSwitchingResolution)) {
                int i3 = this.mDuration;
                if (i3 <= 0 || _getPlayerTime - i3 <= -1000) {
                    this.mLastPlaybackTime = _getPlayerTime;
                } else {
                    this.mLastPlaybackTime = 0;
                }
            }
        }
        MediaPlayer mediaPlayer = this.mMediaPlayer;
        if (mediaPlayer == null || !(mediaPlayer.isOSPlayer() || this.mMediaPlayer.getPlayerType() == 3 || this.mMediaPlayer.getPlayerType() == 4 || this.mMediaPlayer.getPlayerType() == 5)) {
            z = false;
        } else {
            z = true;
        }
        int i4 = 2;
        if (!isInHousePlayer() && this.mDrmType == 2) {
            z = false;
        }
        MediaPlayer mediaPlayer2 = this.mMediaPlayer;
        if (mediaPlayer2 != null && (mediaPlayer2.getPlayerType() == 0 || this.mMediaPlayer.getPlayerType() == 2 || this.mMediaPlayer.getPlayerType() == 5)) {
            this.mMediaPlayer.release();
            this.mMediaPlayer = null;
            this.mIsStartPlayAutomatically = true;
        }
        this.mErrorCount++;
        this.mAccumulatedErrorCount++;
        this.mState = 4;
        TTVideoEngineLog.m256505i("TTVideoEngine", "videoEngine failed:" + error.toString());
        if (error.domain.equals("kTTVideoErrorDomainIntertrustDRM") && (intertrustDrmHelper = this.mIntertrustDrmHelper) != null) {
            intertrustDrmHelper.stop();
        }
        if (error.code == -9939) {
            _notifyError(error);
        } else if (error.code == -9987) {
            TTVideoEngineLog.m256503e("TTVideoEngine", "can't decrypt video");
            _notifyError(error);
        } else if (error.code == -9988) {
            TTVideoEngineLog.m256503e("TTVideoEngine", "decode encryptionkey error, not need to retry");
            _notifyError(error);
        } else if (error.code == -9990) {
            TTVideoEngineLog.m256503e("TTVideoEngine", "invalid request, no need to retry");
            _notifyError(error);
        } else if (this.mErrorCount >= 3) {
            TTVideoEngineLog.m256503e("TTVideoEngine", "videoEngine retry failed");
            _notifyError(error);
        } else if (this.mAccumulatedErrorCount >= this.mMaxAccumulatedCountSetByUser) {
            TTVideoEngineLog.m256503e("TTVideoEngine", "videoEngine retry failed:reach maxAccumulatedErrorCount");
            _notifyError(error);
        } else if (error.code == -9966) {
            TTVideoEngineLog.m256503e("TTVideoEngine", "invalid url");
            _notifyError(error);
        } else {
            String currentURL = this.mURLInfo.getCurrentURL();
            if ((error.domain.equals("kTTVideoErrorDomainVideoOSPlayer") || error.equals("kTTVideoErrorDomainVideoExoPlayer") || error.code == -499975) && !TextUtils.isEmpty(currentURL) && currentURL.startsWith("mdl")) {
                if (this.mIsDirectURL && this.mDirectURL.startsWith("mdl")) {
                    DataLoaderHelper.getDataLoader().setIntValue(1004, -1);
                    this.mDirectURL = DataLoaderHelper.getDataLoader()._getProxyUrl(this.mDirectURL);
                    TTVideoEngineLog.m256505i("TTVideoEngine", "mdl failed: mIsDirectURL: " + this.mIsDirectURL + ", mDirectUrlSrc: " + this.mDirectUrlSrc);
                } else if (!TextUtils.isEmpty(currentURL) && currentURL.startsWith("mdl")) {
                    DataLoaderHelper.getDataLoader().setIntValue(1004, -1);
                    this.mURLInfo.setHostURL(DataLoaderHelper.getDataLoader()._getProxyUrl(currentURL));
                    TTVideoEngineLog.m256505i("TTVideoEngine", "mdl failed: urlInfo: " + currentURL);
                } else if (error.domain.equals("kTTVideoErrorDomainVideoOSPlayer") || error.domain.equals("kTTVideoErrorDomainVideoExoPlayer")) {
                    DataLoaderHelper.getDataLoader().setIntValue(1004, -1);
                }
            }
            this.mRetrying = true;
            if (error.domain.equals("kTTVideoErrorDomainVideoOwnPlayer")) {
                this.mRetryingNotHandleError = true;
            }
            int retryStrategy = error.getRetryStrategy();
            if ((this.mCodecType.equals("bytevc1") || this.mCodecType.equals("bytevc2") || this.mDashEnabled || this.mBashEnabled || this.mHttpsEnabled) && z) {
                this.mCodecType = "h264";
                this.mDashEnabled = false;
                this.mBashEnabled = false;
                this.mEnableHttps = false;
                this.mRetryEnableHttps = false;
                this.mForceCodec = "h264";
                retryStrategy = 1;
            }
            int clearByErrcode = clearByErrcode(error, z);
            if (clearByErrcode != 10) {
                if (clearByErrcode != 11) {
                    retryStrategy = clearByErrcode;
                }
                if (error.code == -499699 || error.code == -499698) {
                    if (!this.mDrmRetry) {
                        _notifyError(error);
                        return;
                    } else {
                        this.mDrmType = 0;
                        retryStrategy = 3;
                    }
                }
                if (this.mUsePlayerSpade && error.domain.equals("kTTVideoErrorDomainVideoOwnPlayer") && (error.code == -499973 || error.code == -499983)) {
                    this.mUsePlayerSpade = false;
                }
                if (this.mErrorCount == 2) {
                    if (this.mPlayAPIVersion == 2 && !TextUtils.isEmpty(this.mAuthorization)) {
                        this.mPlayAPIVersion = 1;
                    }
                    retryStrategy = 1;
                }
                if (this.mIsLocal || this.mIsDirectURL) {
                    retryStrategy = 3;
                }
                if (this.mIsPlayItem) {
                    this.mIsPlayItem = false;
                    retryStrategy = 1;
                }
                TTVideoEngineLog.m256505i("TTVideoEngine", String.format("retry strategy:%d", Integer.valueOf(retryStrategy)));
                if (i != this.mPlayAPIVersion) {
                    TTVideoEngineLog.m256505i("TTVideoEngine", "APIVersion rollback from PLAY_API_VERSION_" + i + " to PLAY_API_VERSION_" + this.mPlayAPIVersion + " errorCount:" + this.mErrorCount);
                }
                String str = this.mURLInfo.hostURL;
                if (!TextUtils.isEmpty(str) && str.startsWith("mem://bash")) {
                    str = String.format("mem://bash/url_index:%d", this.urlIndexMap.get(this.currentResolution));
                }
                if (!error.domain.equals("kTTVideoErrorDomainHTTPDNS") && !error.domain.equals("kTTVideoErrorDomainLocalDNS") && retryStrategy == 2 && this.urlIndexMap.get(this.currentResolution).intValue() == 0) {
                    this.mLogger.mainURLCDNFailed(error, str);
                }
                if (retryStrategy == 3 && !this.mIsLocal) {
                    IVideoEventLogger iVideoEventLogger = this.mLogger;
                    if (this.mIsDirectURL) {
                        str = this.mDirectURL;
                    }
                    iVideoEventLogger.playerDidFailed(error, str);
                    if (error.code == -2139062143) {
                        this.mMediaPlayer = null;
                    }
                }
                if (this.mIsPreloaderItem) {
                    if (this.mVideoModel == null) {
                        VideoInfoFetcher videoInfoFetcher = this.mFetcher;
                        if (videoInfoFetcher != null) {
                            videoInfoFetcher.cancel();
                        }
                        i4 = 1;
                    }
                    this.mIsPreloaderItem = false;
                } else {
                    i4 = retryStrategy;
                }
                if (i4 != 0) {
                    this.mLogger.movieShouldRetry(error, i4, i);
                }
                if (i4 == 1) {
                    if (this.mLooperThread.checkSendMainLooper()) {
                        this.mLooperThread.postMainLooperMessage(PLAYER_OPTION_ENABEL_HARDWARE_DECODE_AUDIO, 0, 0, error, this.mAPIString);
                    } else {
                        VideoURLRouteListener videoURLRouteListener = this.mVideoRouteListener;
                        if (videoURLRouteListener != null) {
                            videoURLRouteListener.onFailed(error, this.mAPIString);
                        }
                        VideoEngineCallback videoEngineCallback = this.mSimpleCallback;
                        if (videoEngineCallback != null) {
                            videoEngineCallback.onVideoURLRouteFailed(error, this.mAPIString);
                        }
                    }
                }
                _retry(i4, error);
            }
        }
    }

    public static void addPreloadMedias(List<PreloadMedia> list, String str) {
        DataLoaderHelper.getDataLoader().addPreloadMedias(list, str);
    }

    public static Resolution findBestResolution(VideoModel videoModel, int i) {
        return findBestResolution(videoModel, Resolution.Standard, i, null);
    }

    public static Resolution findDefaultResolution(VideoModel videoModel, Resolution resolution) {
        return BestResolution.findDefaultResolution(videoModel, resolution);
    }

    public static Resolution findMaxCacheResolution(VideoModel videoModel, Resolution resolution) {
        return BestResolution.findMaxCacheResolution(videoModel, resolution);
    }

    public static Resolution findMaxQualityResolution(VideoModel videoModel, Resolution resolution) {
        return BestResolution.findMaxQualityResolution(videoModel, resolution);
    }

    public static long getCacheFileSize(IVideoModel iVideoModel, Resolution resolution) {
        return getCacheFileSize(iVideoModel, resolution, (Map<Integer, String>) null);
    }

    public static void removeMedia(String str, String str2) {
        DataLoaderHelper.getDataLoader().removeMedia(str, str2);
    }

    public static void removePreloadMedia(PreloadMedia preloadMedia, String str) {
        DataLoaderHelper.getDataLoader().removePreloadMedia(preloadMedia, str);
    }

    public static void setAlgorithmJson(int i, String str) {
        StrategyHelper.helper().setAlgorithmJson(i, str);
    }

    public static void setIntValueSync(int i, int i2) {
        DataLoaderHelper.getDataLoader().setIntValueSync(i, i2);
    }

    public static void setLongValue(int i, long j) {
        DataLoaderHelper.getDataLoader().setLongValue(i, j);
    }

    public static void setStringValueSync(int i, String str) {
        DataLoaderHelper.getDataLoader().setStringValueSync(i, str);
    }

    public static void startSpeedPredictor(int i, int i2) {
        startSpeedPredictor(i, i2, 0, 0);
    }

    /* access modifiers changed from: package-private */
    public void _doSetDirectURL(String str, String str2) {
        _doSetDirectURL(str);
        this.mCachePath = str2;
        this.mFileKey = str2;
    }

    public void configParams(Resolution resolution, Map<Integer, String> map) {
        if (resolution != null) {
            _configResolution(resolution, map);
        }
    }

    public void setCacheInfoLists(String[] strArr, long[] jArr) {
        DataLoaderHelper.getDataLoader().setCacheInfoLists(strArr, jArr);
    }

    public void setCustomInfo(IVideoEventLogger.VideoEventCustomInfo videoEventCustomInfo, Object obj) {
        IVideoEventLogger iVideoEventLogger = this.mLogger;
        if (iVideoEventLogger != null) {
            iVideoEventLogger.setCustomInfo(videoEventCustomInfo, obj);
        }
    }

    public void setDirectUrlUseDataLoader(String[] strArr, String str) {
        setDirectUrlUseDataLoader(strArr, str, this.mVideoID);
    }

    public void setExpectedParams(Resolution resolution, Map<Integer, String> map) {
        this.expectedResolution = resolution;
        this.expectedParams = map;
    }

    public void setExternLogListener(ExternVideoLoggerListener externVideoLoggerListener, String str) {
        this.mExternVideoLoggerListener = externVideoLoggerListener;
        this.mExternLogKey = str;
    }

    public void setQcomVpp(boolean z, int i) {
        this.mUseQcomVpp = z ? 1 : 0;
        this.mQcomVppLevel = i;
    }

    public void setSourceUseDataLoader(Source source, int i) {
        throw new UnsupportedOperationException("toB only");
    }

    public static void addPreloadModelMedia(PreloadModelMedia preloadModelMedia, String str) {
        preloadModelMedia.mSceneId = str;
        DataLoaderHelper.getDataLoader().addPreloadModelMedia(preloadModelMedia);
    }

    public static void businessEvent(int i, int i2) {
        StrategyHelper.helper().getCenter().mo70642b(i, i2);
    }

    public static long getCacheFileSize(VideoModel videoModel, Resolution resolution) {
        return getCacheFileSize((IVideoModel) videoModel, resolution);
    }

    public static void removeAllPreloadMedia(String str, int i) {
        DataLoaderHelper.getDataLoader().removeAllPreloadMedia(str, i);
    }

    public static void setStringValue(int i, String str) {
        SettingsHelper.helper().setRegionHost(i, str);
        DataLoaderHelper.getDataLoader().setStringValue(i, str);
    }

    public boolean clearSurface(Surface surface, boolean z) {
        try {
            return TextureRenderManager.getManager().clearSurface(surface, z);
        } catch (Exception unused) {
            return false;
        }
    }

    public void setDirectUrlUseDataLoader(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            setDirectUrlUseDataLoader(str, str2, this.mVideoID);
        }
    }

    public static void businessEvent(int i, String str) {
        StrategyHelper.helper().getCenter().mo70643b(i, str);
    }

    public static void focusMedia(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            TTVideoEngineLog.m256505i("TTVideoEngine", "[strategy] focus media . videoId is null");
        } else {
            DataLoaderHelper.getDataLoader().focusMedia(str, i);
        }
    }

    /* access modifiers changed from: package-private */
    public void _doSetPlayerSurface(Surface surface, int i) {
        MediaPlayer mediaPlayer = this.mAsyncPlayer;
        if (mediaPlayer == null) {
            mediaPlayer = this.mMediaPlayer;
        }
        if (mediaPlayer == null) {
            return;
        }
        if (surface == null) {
            mediaPlayer.setSurface(null);
        } else if (i == 1) {
            mediaPlayer.setSurface(surface);
        } else {
            VideoSurface videoSurface = this.mTextureSurface;
            if (videoSurface != null) {
                surface = videoSurface;
            }
            mediaPlayer.setSurface(surface);
        }
    }

    public void setAsyncInit(boolean z, int i) {
        if (this.mLooperThread.checkEngineLooperThread(false)) {
            this.mLooperThread.postEngineMessage(50, z ? 1 : 0, i);
        } else {
            _doSetAsyncInit(z, i);
        }
    }

    public void setCustomHeader(String str, String str2) {
        if (this.mLooperThread.checkEngineLooperThread(false)) {
            this.mLooperThread.postEngineMessage(57, 0, 0, str, str2);
        } else {
            _doSetCustomHeader(str, str2);
        }
    }

    public void setExtraSurface(Surface surface, int i) {
        synchronized (this.mExtraSurfaceQueue) {
            this.mExtraSurfaceQueue.offer(new Pair<>(surface, Integer.valueOf(i)));
            _setExtraSurface();
        }
    }

    public void setIntOption(int i, int i2) {
        if (this.mLooperThread.checkEngineLooperThread(false)) {
            this.mLooperThread.postEngineMessage(101, i, i2);
        } else {
            _doSetIntOption(i, i2);
        }
    }

    public void setLongOption(int i, long j) {
        if (this.mLooperThread.checkEngineLooperThread(false)) {
            this.mLooperThread.postEngineMessage(102, i, 0, Long.valueOf(j));
        } else {
            _doSetLongOption(i, j);
        }
    }

    public void setStringOption(int i, String str) {
        if (this.mLooperThread.checkEngineLooperThread(false)) {
            this.mLooperThread.postEngineMessage(108, i, 0, str);
        } else {
            _doSetStringOption(i, str);
        }
    }

    private void _selectTrack(int i, int i2) {
        MediaPlayer.TrackInfo[] trackInfo;
        int i3;
        int i4;
        MediaPlayer mediaPlayer = this.mMediaPlayer;
        if (mediaPlayer != null && (trackInfo = mediaPlayer.getTrackInfo()) != null) {
            if (i2 == VideoRef.TYPE_VIDEO) {
                i3 = 1;
            } else {
                i3 = 2;
            }
            int length = trackInfo.length;
            int i5 = 0;
            while (true) {
                if (i5 >= length) {
                    i4 = -1;
                    break;
                }
                MediaPlayer.TrackInfo trackInfo2 = trackInfo[i5];
                if (trackInfo2.getTrackType() == i3) {
                    MediaFormat format = trackInfo2.getFormat();
                    if (format.getInteger("bitrate") == i) {
                        i4 = format.getInteger("track-id");
                        break;
                    }
                }
                i5++;
            }
            if (i4 != -1) {
                this.mMediaPlayer.selectTrack(i4);
            }
        }
    }

    private String[] addMdlFlag(String[] strArr, String str) {
        if (P2PStragetyManager.getInstance().isAllowP2p(str) == 1 && this.mForbidP2P == 0) {
            return strArr;
        }
        for (int i = 0; i < strArr.length; i++) {
            if (!TextUtils.isEmpty(strArr[i])) {
                strArr[i] = TTHelper.appendQueryString(strArr[i], "p2p=0");
            }
        }
        return strArr;
    }

    private int clearByErrcode(Error error, boolean z) {
        switch (error.code) {
            case -1094995529:
            case -499985:
            case -499978:
            case -499977:
                if (this.mEnableClearMDLCache > 0) {
                    clearMdlCache();
                }
                return 11;
            case -499972:
            case -499970:
                return clearHijackIpCacheByErrcode(error, z);
            default:
                return 11;
        }
    }

    private boolean isSupportFileCache(String str, IVideoModel iVideoModel) {
        if (iVideoModel != null && (iVideoModel.hasFormat(IVideoModel.Format.DASH) || iVideoModel.getSource() == IVideoModel.Source.LIVE)) {
            return false;
        }
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        if (str.indexOf(".m3u8") > 0 || str.indexOf(".mpd") > 0) {
            return false;
        }
        return true;
    }

    public static void setDNSType(int i, int i2) {
        sDNSType = new int[]{i, i2};
        TTVideoEngineLog.m256505i("TTVideoEngine", "setDNSType main:" + i + " backup:" + i2);
    }

    public static void setReportLogByEngine(boolean z, Context context) {
        TTVideoEngineLog.m256505i("TTVideoEngine", "setReportLogByEngine " + z);
        if (context == null) {
            TTVideoEngineLog.m256503e("TTVideoEngine", "setReportLogByEngine context is null");
        } else {
            AppLogEngineUploader.getInstance().setReportLogByEngine(z, context.getApplicationContext());
        }
    }

    /* access modifiers changed from: package-private */
    public void _doSetCustomHeader(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            HashMap<String, String> hashMap = this.mHeaders;
            hashMap.put(str.substring(0, 1).toUpperCase() + str.substring(1), str2);
        }
    }

    /* access modifiers changed from: package-private */
    public void _setPlayerVolume(float f, float f2) {
        if (this.mMediaPlayer != null) {
            if (this.mSetTrackVolume == 0 && !isInHousePlayer()) {
                float f3 = 1.0f;
                if (f != BitmapDescriptorFactory.HUE_RED) {
                    f2 = 1.0f;
                } else {
                    f3 = f;
                }
                AudioManager audioManager = (AudioManager) this.mContext.getSystemService("audio");
                if (audioManager != null) {
                    audioManager.setStreamVolume(3, (int) f, 0);
                }
                f = f3;
            }
            this.mMediaPlayer.setVolume(f, f2);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: boolean */
    /* JADX WARN: Multi-variable type inference failed */
    public void openTextureSR(boolean z, boolean z2) {
        TTVideoEngineLog.m256505i("TTVideoEngine", "[SRLog]openTextureSR =  sr = " + z + ", open =" + z2);
        if (FeatureManager.hasPermission("super_resolution")) {
            this.mSRStrategy.setSRStrategyMode(1);
            this.mUseSRTexture = z;
            this.mTextureSrOpen = z2 ? 1 : 0;
            int i = 0;
            if (!z || z2 == 0) {
                i = -7890;
            }
            if (this.mDynamicControlSR) {
                doOpenSR(z2, i);
            }
        }
    }

    public void seekTo(int i, SeekCompletionListener seekCompletionListener) {
        TTVideoEngineLog.m256505i("TTVideoEngine", String.format("seek to time:%d", Integer.valueOf(i)));
        this.mSeekCompletionListener = seekCompletionListener;
        if (this.mMediaPlayer != null && this.mStarted && this.mPosUpdateInterval > 0) {
            this.mCurPosition = i;
        }
        if (this.mLooperThread.checkEngineLooperThread(false)) {
            this.mLooperThread.postEngineMessage(7, i);
        } else {
            _seekTo(i, false);
        }
    }

    public void setAutoRangeRead(int i, int i2) {
        TTVideoEngineLog.m256505i("TTVideoEngine", "set auto range read = " + i + ", " + i2);
        this.mReadCacheMode = i;
        this.mAutoRangeOffset = i2;
    }

    public void setBufferThresholdControl(int i, int i2) {
        TTVideoEngineLog.m256505i("TTVideoEngine", "setBufferThresholdControl= " + i + ", " + i2);
        if (i > 0 && i2 > 0) {
            if (DataLoaderHelper.getDataLoader().getIntValue(12) == 200) {
                i = 0;
                i2 = 0;
            }
            this.mDangerBufferThreshold = i;
            this.mSecureBufferThreshold = i2;
        }
    }

    public void setDirectURL(String str, String str2) {
        if (this.mLooperThread.checkEngineLooperThread(false)) {
            this.mLooperThread.postEngineMessage(19, 0, 0, str, str2);
        } else {
            _doSetDirectURL(str, str2);
        }
    }

    public void setDirectUrlUseDataLoaderByFilePath(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            if (this.mLooperThread.checkEngineLooperThread(false)) {
                this.mLooperThread.postEngineMessage(21, 0, 0, str, str2);
                return;
            }
            setDirectUrlUseDataLoaderByFilePath(new String[]{str}, str2);
        }
    }

    public void setPlayAPIVersion(int i, String str) {
        TTVideoEngineLog.m256505i("TTVideoEngine", String.format("setPlayAPIVersion:%d", Integer.valueOf(i)));
        this.mPlayAPIVersion = i;
        this.mAuthorization = str;
        IVideoEventLogger iVideoEventLogger = this.mLogger;
        if (iVideoEventLogger != null) {
            iVideoEventLogger.setPlayAPIVersion(i, str);
        }
    }

    public void setSrMaxTexureSize(int i, int i2) {
        this.mMaxTextureWidth = i;
        this.mMaxTextureHeight = i2;
        TTVideoEngineLog.m256505i("TTVideoEngine", "[SRLog]setSrMaxTexureSize:" + this.mMaxTextureWidth + "," + this.mMaxTextureHeight);
        SRStrategyConfig sRStrategyConfig = new SRStrategyConfig();
        sRStrategyConfig.setMaxWidth(i).setMaxHeight(i2);
        this.mSRStrategy.updateConfig(sRStrategyConfig);
    }

    public void setTestSpeedEnable(int i, TestNetSpeedListener testNetSpeedListener) {
        if (FeatureManager.hasPermission("net_speed")) {
            this.mTestNetSpeed = i;
            this.mTestNetSpeedListener = testNetSpeedListener;
            if (this.mLooperThread.checkEngineLooperThread(false)) {
                this.mLooperThread.postEngineMessage(52, i);
            } else {
                _doSetTestSpeedEnbale(i);
            }
        }
    }

    private boolean _isUrlExpired(VideoInfo videoInfo, IVideoModel iVideoModel) {
        if (videoInfo == null || iVideoModel == null || this.mAllowedExpiredModel) {
            return false;
        }
        if (iVideoModel.getVideoRefLong(220) > 0 && TimeService.isUpdated() && TimeService.currentTimeMillis() - (iVideoModel.getVideoRefLong(220) * 1000) > -30000) {
            return true;
        }
        if (videoInfo.getValueLong(30) <= 0 || !TimeService.isUpdated() || TimeService.currentTimeMillis() - (videoInfo.getValueLong(30) * 1000) <= -30000) {
            return false;
        }
        return true;
    }

    private void _playVideo(String str, String str2) {
        TTVideoEngineLog.m256505i("TTVideoEngine", String.format("start to play video, host:%s, ip:%s", str, str2));
        if (this.mShouldStop) {
            TTVideoEngineLog.m256508w("TTVideoEngine", "_playVideo should stop");
        } else if (!TextUtils.isEmpty(str2)) {
            this.mURLInfo.setIpURL(str2);
            if (!TextUtils.isEmpty(str)) {
                this.currentHost = str;
                this.mHeaders.put("Host", String.format(" %s", str));
            }
            _playInternal(this.mURLInfo.ipURL, this.mHeaders);
        } else {
            _playInternal(this.mURLInfo.hostURL, this.mHeaders);
        }
    }

    private void _retry(int i, Error error) {
        String str;
        String str2;
        if (i == 0) {
            _notifyError(error);
        } else if (i == 1) {
            resetFallbackApi(error);
            _fetchVideoInfo();
        } else if (i == 2) {
            _tryNextURL();
        } else if (i == 3) {
            boolean z = this.mIsLocal;
            if (z || this.mIsDirectURL) {
                if (z) {
                    str = this.mLocalURL;
                } else {
                    str = this.mDirectURL;
                }
                _singleURLParseAndPlay(str, this.mHeaders);
                return;
            }
            boolean z2 = this.mIsPreloaderItem;
            if (z2 || this.mIsPlayItem) {
                if (z2) {
                    str2 = this.mPreloaderItem.mUrl;
                } else {
                    str2 = this.mPlayItem.playURL;
                }
                _singleURLParseAndPlay(str2, this.mHeaders);
                return;
            }
            _playInternal(this.mURLInfo.getCurrentURL(), this.mHeaders);
        } else if (i == 12 && !this.mCodecStrategyAdapter.interceptFallbackRetry(this, error)) {
            _notifyError(error);
        }
    }

    private void _singleURLParseAndPlay(String str, HashMap hashMap) {
        this.mURLInfo.setHostURL(str);
        boolean _isDashSource = _isDashSource(str);
        this.mIsDashSource = _isDashSource;
        this.mDashEnabled = _isDashSource;
        if (_usePlayerDNS(true) || this.mIsLocal) {
            _playInternal(str, hashMap);
        } else if (TTHelper.isIP(str)) {
            _playInternal(str, hashMap);
        } else if (str.indexOf("http") == 0) {
            this.urlIPMap.put(this.mURLInfo.hostURL, new IpInfo("", "", this.mUseDNSCache ? 1 : 0, this.mIsUseServerDns ? 1 : 0, "single"));
            this.mURLs = new String[]{str};
            _updateVU();
            _parseDNS(str);
        } else {
            _playInternal(str, hashMap);
        }
    }

    private int clearHijackIpCacheByErrcode(Error error, boolean z) {
        IVideoModel iVideoModel;
        if (!this.mHijackRetry) {
            _notifyError(error);
            return 10;
        }
        this.mLogger.setHijackCode(error.code);
        sDNSType = new int[]{this.mHijackRetryMainDNSType, this.mHijackRetryBackupDNSType};
        removeCacheFile(this.mVideoModel);
        DataLoaderHelper.getDataLoader().clearNetinfoCache();
        DataLoaderHelper.getDataLoader().setIntValue(90, this.mHijackRetryMainDNSType);
        DataLoaderHelper.getDataLoader().setIntValue(91, this.mHijackRetryBackupDNSType);
        if (this.mHijackRetryCount != 0 || z || (iVideoModel = this.mVideoModel) == null || !iVideoModel.getVideoRefBool(106)) {
            this.mHijackRetryCount = 0;
            _notifyError(error);
            return 10;
        }
        this.mHijackRetryCount++;
        this.mRetryEnableHttps = true;
        return 2;
    }

    public static List<Resolution> findCachedResolutionList(VideoModel videoModel, Map<Integer, String> map) {
        Resolution[] supportResolutions;
        int i;
        ArrayList arrayList = new ArrayList();
        if (!(videoModel == null || (supportResolutions = videoModel.getSupportResolutions()) == null || supportResolutions.length < 1)) {
            String videoRefStr = videoModel.getVideoRefStr(7);
            if (!TextUtils.isEmpty(videoRefStr) || !videoRefStr.equals("audio")) {
                i = VideoRef.TYPE_VIDEO;
            } else {
                i = VideoRef.TYPE_AUDIO;
            }
            Resolution resolution = supportResolutions[0];
            for (Resolution resolution2 : supportResolutions) {
                VideoInfo videoInfo = videoModel.getVideoInfo(resolution2, i, map, false);
                if (!(videoInfo == null || DataLoaderHelper.getDataLoader().getCacheFileSize(videoInfo.getValueStr(15)) <= 0 || videoInfo.getResolution() == null)) {
                    arrayList.add(videoInfo.getResolution());
                }
            }
        }
        return arrayList;
    }

    public static void setIntValue(int i, int i2) {
        if (i == 672) {
            TTVideoEngineLog.m256505i("TTVideoEngine", "do set static render type, value = " + i2);
            mStaticRenderType = i2;
        } else if (i == 674) {
            TTVideoEngineLog.m256505i("TTVideoEngine", "enable https for fetch");
            TTVideoEngineUtils.sEnableHTTPSForFetch = i2;
        } else if (i == 112) {
            if (i2 > 0) {
                sABRSpeedPredictInputType = 2;
                DataLoaderHelper.getDataLoader().setIntValue(SmEvents.EVENT_NE_RR, i2);
                return;
            }
            sABRSpeedPredictInputType = 1;
            DataLoaderHelper.getDataLoader().setIntValue(SmEvents.EVENT_NE_RR, 0);
        } else if (i == 676) {
            StrategyCenter.setSpeedQueueSize(i2);
        } else if (i == 702) {
            mOutPutLogLevel = i2;
        } else {
            DataLoaderHelper.getDataLoader().setIntValue(i, i2);
            StrategyKeys.setIntValue(i, i2);
        }
    }

    private void setMediaBuffer2Abr(AbstractC20879g gVar, IVideoModel iVideoModel) {
        List<VideoInfo> videoInfoList;
        if (!(iVideoModel == null || this.mStandAlongAbrStartUp == 0 || (videoInfoList = iVideoModel.getVideoInfoList()) == null || videoInfoList.size() == 0)) {
            for (VideoInfo videoInfo : videoInfoList) {
                if (videoInfo != null) {
                    String valueStr = videoInfo.getValueStr(15);
                    gVar.mo70542a(videoInfo.getMediatype(), valueStr, (long) videoInfo.getValueInt(3), getCacheFileSize(valueStr), (long) videoInfo.getValueInt(38));
                }
            }
            gVar.mo70540a(6, this.mPlayerViewWidth);
            gVar.mo70540a(7, this.mPlayerViewHeight);
        }
    }

    /* access modifiers changed from: package-private */
    public void _configResolution(Resolution resolution, Map<Integer, String> map) {
        int i;
        if (resolution != Resolution.Auto || FeatureManager.hasPermission("abr")) {
            if (this.mABRSwitchMode == 0) {
                if (resolution == Resolution.Auto) {
                    i = 1;
                } else {
                    i = 0;
                }
                setIntOption(494, i);
            }
            if (resolution != Resolution.Auto) {
                int i2 = this.mState;
                if (i2 == 0 || i2 == 1 || this.mIsPlayComplete) {
                    this.lastResolution = resolution;
                    this.currentResolution = resolution;
                    this.currentParams = map;
                    if (TextUtils.isEmpty(this.mDirectURL) && TextUtils.isEmpty(this.mLocalURL)) {
                        this.mLogger.configResolution(_resolutionToString(resolution), _resolutionToString(resolution));
                    }
                } else if (i2 != 3) {
                } else {
                    if (this.mLooperThread.checkEngineLooperThread(false)) {
                        this.mLooperThread.postEngineMessage(8, 0, 0, resolution, map);
                    } else {
                        _switchToResolution(resolution, map);
                    }
                }
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: boolean */
    /* JADX WARN: Multi-variable type inference failed */
    /* access modifiers changed from: package-private */
    public void _doSetAsyncInit(boolean z, int i) {
        MediaPlayer mediaPlayer = this.mAsyncPlayer;
        if (mediaPlayer == null) {
            mediaPlayer = this.mMediaPlayer;
        }
        this.mAsyncInitEnable = z ? 1 : 0;
        if (this.mVideoModel != null) {
            i = -1;
        }
        this.mCodecId = i;
        TTVideoEngineLog.m256505i("TTVideoEngine", String.format("setAsyncInit enable:%b codecid:%d", Integer.valueOf((int) z), Integer.valueOf(this.mCodecId)));
        if (mediaPlayer != null && this.mHardwareDecodeEnablePlayer2 == 1) {
            mediaPlayer.setIntOption(181, this.mAsyncInitEnable);
            mediaPlayer.setIntOption(182, this.mCodecId);
            this.mLogger.useAsyncInit(this.mAsyncInitEnable, this.mCodecId);
        }
    }

    /* access modifiers changed from: package-private */
    public void _doSetLongOption(int i, long j) {
        if (i == 217) {
            this.mALogWriteAddr = j;
            DataLoaderHelper.getDataLoader().setLongValue(62, j);
        } else if (i == 440 && j > 0) {
            NativeAudioProcessor nativeAudioProcessor = new NativeAudioProcessor();
            this.mAudioProcessor = nativeAudioProcessor;
            nativeAudioProcessor.setNativeWrapper(j);
            MediaPlayer mediaPlayer = this.mMediaPlayer;
            if (mediaPlayer != null) {
                ((MediaPlayerWrapper) mediaPlayer).setAudioProcessor(this.mAudioProcessor);
            }
        }
        TTVideoEngineLog.m256505i("TTVideoEngine", "set long option key:" + i + ",value:" + j);
    }

    /* access modifiers changed from: package-private */
    public void _doSetStringOption(int i, String str) {
        if (i == 531) {
            this.mSubHostName = str;
        } else if (i == 532) {
            this.mSubLanIds = str;
        } else if (i == 659) {
            this.mClassLoaderState = str;
        } else if (i != 662) {
            switch (i) {
                case 538:
                    this.mABR4GMaxResolutionQuality = str;
                    break;
                case 539:
                    this.mWifiDefaultResolutionQuality = str;
                    break;
                case 540:
                    this.mStartupMaxBitRateQuality = str;
                    break;
                default:
                    switch (i) {
                        case 545:
                            this.mDowngradeResolutionQuality = str;
                            break;
                        case 546:
                            this.mSubIds = str;
                            break;
                        case 547:
                            this.mSubFormat = str;
                            break;
                    }
            }
        } else {
            this.mCheckInfoString = str;
        }
        TTVideoEngineLog.m256505i("TTVideoEngine", String.format("set int option key:%d value:%s", Integer.valueOf(i), str));
    }

    /* access modifiers changed from: package-private */
    public void _seekTo(int i, boolean z) {
        int i2;
        P2PPlayUrlInfo p2PPlayUrlInfo;
        TTVideoEngineLog.m256505i("TTVideoEngine", String.format("_seekTo:%d", Integer.valueOf(i)));
        if (this.mMediaPlayer == null || !this.mStarted) {
            _seekComplete(false);
            return;
        }
        if (z) {
            i2 = this.mLastPlaybackTime;
        } else {
            i2 = _getPlayerTime();
        }
        if (this.mForbidP2PWhenSeek > 0 && (p2PPlayUrlInfo = this.curP2PUrlInfo) != null && p2PPlayUrlInfo.mP2PCDNType > 0 && !TextUtils.isEmpty(this.curP2PUrlInfo.mUrl)) {
            TTVideoEngineLog.m256505i("TTVideoEngine", "forbid proxy p2p when seek");
            VideoLoadWrapper.getInstance().forbidP2P(this.curP2PUrlInfo.mUrl);
        }
        this.mSeeking = true;
        this.mSeekingStartTime = SystemClock.currentThreadTimeMillis();
        this.mLastPlaybackTime = i;
        setPlayInfo(6, 1);
        this.mMediaPlayer.seekTo(i);
        setPlayInfo(1, (long) i);
        this.mLogger.seekTo(i2, i, z);
    }

    public void _setHDRInfoToTexturerender(MediaPlayer mediaPlayer, int i) {
        VideoSurface videoSurface;
        boolean z;
        if (mediaPlayer != null && (videoSurface = this.mTextureSurface) != null && this.mRenderHDR2SDR == 1) {
            if (i == 1 || i == 2) {
                z = true;
            } else {
                z = false;
            }
            if (videoSurface != null) {
                Bundle bundle = new Bundle();
                bundle.putInt("effect_type", 4);
                if (z) {
                    bundle.putInt("action", 21);
                    bundle.putInt("hdr_type", i);
                    bundle.putInt("use_effect", 1);
                } else {
                    bundle.putInt("action", 19);
                    bundle.putInt("use_effect", 0);
                }
                videoSurface.setEffect(bundle);
            }
        }
    }

    public boolean doOpenSR(int i, int i2) {
        TTVideoEngineLog.m256505i("TTVideoEngine", "[SRLog]doOpenSR open=" + i + " reason=" + i2 + " mTextureSurface=" + this.mTextureSurface + " mHasFirstFrameShown=" + this.mHasFirstFrameShown);
        this.mTextureSrOpen = i;
        if (i == 0) {
            this.mSRNotUseReason = i2;
        }
        VideoSurface videoSurface = this.mTextureSurface;
        boolean z = false;
        if (videoSurface != null) {
            if (1 == i) {
                try {
                    if (this.mHasFirstFrameShown) {
                        videoSurface.setSuperResolutionMode(i);
                    }
                } catch (Exception e) {
                    TTVideoEngineLog.m256505i("TTVideoEngine", "[SRLog]doOpenSR catch exception e=" + e.toString());
                }
            } else {
                videoSurface.setSuperResolutionMode(i);
            }
            z = true;
        }
        if (z) {
            this.mSRStrategy.setSROpenStatus(i);
        }
        return z;
    }

    public void setDirectUrlUseDataLoaderByFilePath(String[] strArr, String str) {
        if (strArr == null || strArr.length == 0 || TextUtils.isEmpty(strArr[0])) {
            TTVideoEngineLog.m256503e("TTVideoEngine", "invalid urls list, it is empty");
        } else if (TextUtils.isEmpty(str) || this.mDataLoaderEnable == 0) {
            setDirectURL(strArr[0]);
        } else {
            _resetUsingDataLoaderField();
            String keyFromFilePath = TTHelper.keyFromFilePath(this.mContext, str);
            String _mdlUrl = _mdlUrl(keyFromFilePath, this.mVideoID, (long) this.mLimitMDLCacheSize, strArr, Resolution.Undefine, this.mDecryptionKey, null, str, null);
            if (!this.mFileHashs.contains(keyFromFilePath)) {
                this.mFileHashs.add(keyFromFilePath);
            }
            if (TextUtils.isEmpty(_mdlUrl)) {
                setDirectURL(strArr[0]);
            } else {
                setDirectURL(_mdlUrl);
            }
        }
    }

    public void setVolume(float f, float f2) {
        TTVideoEngineLog.m256505i("TTVideoEngine", "setVolume left:" + f + " right:" + f2);
        this.mLeftVolume = f;
        this.mRightVolume = f2;
        if (this.mLooperThread.checkEngineLooperThread(false)) {
            this.mLooperThread.postEngineMessage(9, 0, 0, Float.valueOf(f), Float.valueOf(f2));
        } else {
            _setPlayerVolume(f, f2);
        }
    }

    public static void addTask(String str, PreloaderVidItem preloaderVidItem) {
        DataLoaderHelper.getDataLoader().addTask(str, preloaderVidItem);
    }

    private P2PPlayUrlInfo generateP2PInfo(String str, HashMap hashMap) {
        int parseP2PCDNType;
        String str2;
        P2PPlayUrlInfo p2PPlayUrlInfo = new P2PPlayUrlInfo(str, hashMap, 0);
        if (this.mP2PCDNType == 0 || TextUtils.isEmpty(str) || str.startsWith("http://127.0.0.1") || str.startsWith("mem://bash") || (parseP2PCDNType = parseP2PCDNType(str)) != 1) {
            return p2PPlayUrlInfo;
        }
        if (hashMap != null && hashMap.containsKey("Host")) {
            String obj = hashMap.get("Host").toString();
            try {
                str2 = new URI(str).getHost();
            } catch (URISyntaxException e) {
                TTVideoEngineLog.m256501d(e);
                str2 = "";
            }
            if (!TextUtils.isEmpty(obj) && !TextUtils.isEmpty(str2)) {
                str = str.replaceFirst(str2, obj.trim());
                if (!TextUtils.isEmpty(str2)) {
                    str = TTHelper.appendQueryString(str, "xycip=" + str2);
                }
            }
        }
        if (this.mForbidP2P == 1) {
            str = TTHelper.appendQueryString(str, "xyp2p=0");
        }
        String reWriteUrl = VideoLoadWrapper.getInstance().getReWriteUrl(TTHelper.appendQueryString(str, "xynp=1&xyer=1"), 1);
        if (!TextUtils.isEmpty(reWriteUrl) && (reWriteUrl.startsWith("http://127.0.0.1") || reWriteUrl.startsWith("https://127.0.0.1"))) {
            if (hashMap != null) {
                hashMap.remove("Host");
            }
            p2PPlayUrlInfo.mP2PCDNType = parseP2PCDNType;
            p2PPlayUrlInfo.mUrl = reWriteUrl;
            p2PPlayUrlInfo.mHeaders = hashMap;
            p2PPlayUrlInfo.mSDKVersion = VideoLoadWrapper.getInstance().getSDKVersion();
        }
        return p2PPlayUrlInfo;
    }

    public static void setAppInfo(Context context, Map map) {
        if (map != null && map.size() > 0) {
            try {
                TTVideoEngineLog.m256500d("TTVideoEngine", "setAppInfo:" + map.toString());
                AppInfo.mContext = context;
                AppInfo.mAppID = TTHelper.parseInt(map.get(HiAnalyticsConstant.HaKey.BI_KEY_APPID));
                AppInfo.mAppName = (String) map.get("appname");
                AppInfo.mAppChannel = (String) map.get("appchannel");
                AppInfo.mAppVersion = (String) map.get("appversion");
                if (map.containsKey("screen_height")) {
                    AppInfo.mScreenHeight = ((Integer) map.get("screen_height")).intValue();
                }
                if (map.containsKey("screen_width")) {
                    AppInfo.mScreenWidth = ((Integer) map.get("screen_width")).intValue();
                }
                if (map.containsKey("deviceid")) {
                    AppInfo.mDeviceId = (String) map.get("deviceid");
                }
                if (map.containsKey("region")) {
                    AppInfo.mRegion = (String) map.get("region");
                }
                StrategyHelper.helper().configAppInfo(AppInfo.toJsonString(), map);
                SettingsHelper.helper().config().load(SettingsHelper.MODULE_VOD);
            } catch (Exception e) {
                TTVideoEngineLog.m256500d("TTVideoEngine", e.toString());
            }
        }
    }

    public void _updateLoadState(int i, int i2) {
        MediaPlayer mediaPlayer;
        int i3 = this.mLoadState;
        if (i3 != i) {
            TTVideoEngineLog.m256505i("TTVideoEngine", String.format("load state changed, prev:%d, current:%d", Integer.valueOf(i3), Integer.valueOf(i)));
            if (i == 2 && this.mHasFirstFrameShown && !this.mSeeking && this.mLoadState != 3) {
                int _getPlayerTime = _getPlayerTime();
                this.mBufferingType = i2;
                int i4 = -1;
                IVideoEventLogger iVideoEventLogger = this.mLogger;
                if (iVideoEventLogger != null) {
                    iVideoEventLogger.movieStalled(i2, _getPlayerTime);
                    i4 = this.mLogger.getMovieStalledType();
                }
                if (i2 == 0) {
                    setPlayInfo(3, (long) i4);
                }
                this.mBufferingStartT = SystemClock.elapsedRealtime();
            }
            this.mLoadState = i;
            if (this.mLooperThread.checkSendMainLooper()) {
                this.mLooperThread.postMainLooperMessage(401, this.mLoadState, this.mShouldPlay ? 1 : 0, null);
            } else {
                VideoEngineListener videoEngineListener = this.mVideoEngineListener;
                if (videoEngineListener != null && (this.mShouldPlay || i != 3)) {
                    videoEngineListener.onLoadStateChanged(this, this.mLoadState);
                }
                VideoEngineCallback videoEngineCallback = this.mSimpleCallback;
                if (videoEngineCallback != null && (this.mShouldPlay || i != 3)) {
                    videoEngineCallback.onLoadStateChanged(this, this.mLoadState);
                }
            }
            if (i == 2 && (mediaPlayer = this.mMediaPlayer) != null) {
                long longOption = mediaPlayer.getLongOption(665, 0);
                if (longOption > 0) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("diff", Long.valueOf(longOption));
                    this.mLogger.onAVBadInterlaced(longOption);
                    if (this.mLooperThread.checkSendMainLooper()) {
                        this.mLooperThread.postMainLooperMessage(420, 0, 0, hashMap);
                        return;
                    }
                    VideoEngineCallback videoEngineCallback2 = this.mSimpleCallback;
                    if (videoEngineCallback2 != null) {
                        videoEngineCallback2.onAVBadInterlaced(hashMap);
                    }
                }
            }
        }
    }

    public void setFloatOption(int i, float f) {
        if (i == 359) {
            this.mSpeedXDropFPSLimit = f;
        } else if (i == 535) {
            this.mNetworkSpeedReportSamplingRate = f;
            this.mLogger.setFloatOption(20, f);
        } else if (i != 651) {
            switch (i) {
                case 325:
                    this.mAEPreGain = f;
                    break;
                case 326:
                    this.mAEThreshold = f;
                    break;
                case 327:
                    this.mAERatio = f;
                    break;
                case 328:
                    this.mAEPredelay = f;
                    break;
                default:
                    boolean z = true;
                    switch (i) {
                        case 344:
                            this.mTarLoudness = f;
                            MediaPlayer mediaPlayer = this.mMediaPlayer;
                            if (mediaPlayer != null) {
                                mediaPlayer.setFloatOption(645, f);
                                break;
                            }
                            break;
                        case 345:
                            this.mHasSetAESrcLoudness = true;
                            this.mSrcLoudness = f;
                            MediaPlayer mediaPlayer2 = this.mMediaPlayer;
                            if (mediaPlayer2 != null) {
                                mediaPlayer2.setFloatOption(644, f);
                                break;
                            }
                            break;
                        case 346:
                            this.mHasSetAESrcPeak = true;
                            this.mSrcPeak = f;
                            MediaPlayer mediaPlayer3 = this.mMediaPlayer;
                            if (mediaPlayer3 != null) {
                                mediaPlayer3.setFloatOption(646, f);
                                break;
                            }
                            break;
                        case 347:
                            if (f <= BitmapDescriptorFactory.HUE_RED) {
                                z = false;
                            }
                            this.mAEForbidCompressor = z;
                            break;
                        default:
                            switch (i) {
                                case 526:
                                    this.mABRStartupBandwidthParameter = f;
                                    break;
                                case 527:
                                    this.mABRStallPenaltyParameter = f;
                                    break;
                                case 528:
                                    this.mABRSwitchPenaltyParameter = f;
                                    break;
                                case 529:
                                    this.mABRBandwidthParameter = f;
                                    break;
                            }
                    }
            }
        } else {
            VideoSurface videoSurface = this.mTextureSurface;
            if (videoSurface != null) {
                videoSurface.setFloatOption(4, f);
            }
        }
        TTVideoEngineLog.m256505i("TTVideoEngine", "set float option key:" + i + ",value:" + f);
    }

    public void setPlayAuthToken(String str, int i) {
        TTVideoEngineLog.m256500d("TTVideoEngine", "setPlayAPIVersion:" + i);
        this.mPlayAPIVersion = i;
        IVideoEventLogger iVideoEventLogger = this.mLogger;
        if (iVideoEventLogger != null) {
            iVideoEventLogger.setPlayAPIVersion(i, str);
        }
        String base64Decode = TTHelper.base64Decode(str);
        if (!TextUtils.isEmpty(base64Decode)) {
            try {
                String optString = new JSONObject(base64Decode).optString("GetPlayInfoToken");
                this.mAuthorization = optString;
                if (TextUtils.isEmpty(optString)) {
                    this.mAuthorization = base64Decode;
                }
            } catch (JSONException e) {
                e.printStackTrace();
                this.mAuthorization = base64Decode;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:0x00f6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String _generatePlayUrl(java.lang.String r11, java.util.HashMap r12) {
        /*
        // Method dump skipped, instructions count: 273
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttvideoengine.TTVideoEngine._generatePlayUrl(java.lang.String, java.util.HashMap):java.lang.String");
    }

    private void _setDataSource(String str, HashMap hashMap) throws IOException {
        String str2;
        int i;
        String _generatePlayUrl = _generatePlayUrl(str, hashMap);
        if (this.mRetryEnableHttps) {
            _generatePlayUrl = TTHelper.buildHttpsUrl(_generatePlayUrl);
        }
        System.currentTimeMillis();
        P2PPlayUrlInfo generateP2PInfo = generateP2PInfo(_generatePlayUrl, hashMap);
        if (generateP2PInfo.mP2PCDNType > 0) {
            this.mMediaPlayer.setIntOption(310, this.mNetworkTryCount);
            IVideoEventLogger iVideoEventLogger = this.mLogger;
            if (iVideoEventLogger != null) {
                iVideoEventLogger.setNetWorkTryCount(this.mNetworkTryCount);
            }
        }
        this.curP2PUrlInfo = generateP2PInfo;
        System.currentTimeMillis();
        IVideoEventLogger iVideoEventLogger2 = this.mLogger;
        if (iVideoEventLogger2 != null) {
            iVideoEventLogger2.setCustomP2PCDNType(this.mP2PCDNType);
            if (generateP2PInfo.mP2PCDNType > 0) {
                this.mLogger.setP2PUrl(generateP2PInfo.mUrl);
            }
        }
        if (!this.mPrepared) {
            long currentTimeMillis = System.currentTimeMillis();
            IVideoEventLogger iVideoEventLogger3 = this.mLogger;
            if (iVideoEventLogger3 != null) {
                this.mTraceId = iVideoEventLogger3.getTraceID();
            } else {
                this.mTraceId = TTHelper.genTrackID(AppInfo.mDeviceId, currentTimeMillis);
            }
            if (!TextUtils.isEmpty(this.mTraceId)) {
                generateP2PInfo.mHeaders.put("X-Tt-Traceid", this.mTraceId);
                this.mHeaders.put("X-Tt-Traceid", this.mTraceId);
                TTVideoEngineLog.m256505i("TTVideoEngine", "X-Tt-Traceid:" + this.mTraceId);
            }
            if (!this.mIsDirectURL && (i = this.mFallbackApiRetry) != 0) {
                this.mHeaders.put("X-Tt-Fapi", String.valueOf(i));
                this.mHeaders.put("Engine-ID", String.valueOf(this.mEngineHash));
                this.mLogger.setIntOption(34, this.mFallbackApiRetry);
            }
            if (sABRSpeedPredictInputType == 1) {
                this.mHeaders.put("X-SpeedTest-TimeInternal", String.valueOf(sTestSpeedInterval));
            }
            HashMap<String, String> hashMap2 = this.mHeaders;
            if (TextUtils.isEmpty(this.mTag)) {
                str2 = "default";
            } else {
                str2 = this.mTag;
            }
            hashMap2.put("X-Tt-Tag", str2);
            if (!TextUtils.isEmpty(this.mSubTag)) {
                this.mHeaders.put("X-Tt-SubTag", this.mSubTag);
            }
        }
        if (generateP2PInfo.mHeaders != null) {
            TTVideoEngineLog.m256505i("TTVideoEngine", "setDataSource X-Tt-Traceid:" + generateP2PInfo.mHeaders.get("X-Tt-Traceid"));
        }
        this.mMediaPlayer.setDataSource(this.mContext, Uri.parse(generateP2PInfo.mUrl), generateP2PInfo.mHeaders);
    }

    private void _stop(boolean z, int i) {
        PlayDurationManager playDurationManager;
        MediaPlayer mediaPlayer = this.mAsyncPlayer;
        if (mediaPlayer == null) {
            mediaPlayer = this.mMediaPlayer;
        }
        TTVideoEngineLog.m256505i("TTVideoEngine", "_stop, mState:" + this.mState + ", this:" + this);
        int i2 = this.mState;
        if (i2 == 0) {
            this.mUserStopped = true;
        } else if (i2 == 1) {
            this.mUserStopped = true;
            VideoInfoFetcher videoInfoFetcher = this.mFetcher;
            if (videoInfoFetcher != null) {
                videoInfoFetcher.cancel();
            }
        } else if (i2 == 2) {
            this.mUserStopped = true;
            DNSParser dNSParser = this.mDNSParser;
            if (dNSParser != null) {
                dNSParser.cancel();
            }
        } else if (i2 == 3) {
            this.mUserStopped = true;
        }
        _updateLogger();
        if (mediaPlayer != null && z && (mediaPlayer.getPlayerType() != 0 || (mediaPlayer.getPlayerType() == 0 && this.mPrepared))) {
            mediaPlayer.stop();
        }
        PlayDurationManager playDurationManager2 = this.mPlayDuration;
        if (playDurationManager2 != null) {
            playDurationManager2.stop();
        }
        IntertrustDrmHelper intertrustDrmHelper = this.mIntertrustDrmHelper;
        if (intertrustDrmHelper != null) {
            intertrustDrmHelper.stop();
        }
        if (this.mLogger != null) {
            if (mediaPlayer != null) {
                int currentPosition = mediaPlayer.getCurrentPosition();
                if (this.mPosUpdateInterval > 0) {
                    this.mCurPosition = currentPosition;
                }
                this.mLogger.curPlayBackTime(currentPosition);
                if (this.mState == 3) {
                    this.mLogger.setHijackCode(mediaPlayer.getIntOption(204, -1));
                }
                this.mLogger.setNetworkSpeedFrom(C60447b.m234869a().mo206937b(), 1);
            }
            if (!(this.mPlaybackState == 0 || (playDurationManager = this.mPlayDuration) == null)) {
                this.mLogger.addWatchedDuration(playDurationManager.getPlayedDuration());
            }
            this.mLogger.stop(i);
        }
        _updatePlaybackState(0);
        this.mHasFirstFrameShown = false;
        this.mHasFetchedSubtitle = false;
        this.mRenderStartTime = -1;
        this.mPlayStartTime = -1;
        this.mHasAudioFirstFrameShown = false;
        this.mPlayTime = 0;
        this.mDecodedVideoFirstFrame = false;
        this.mPlayerFirstFrame = false;
        this.mTextureFirstFrame = false;
        this.mSeeking = false;
        if (i != 6) {
            TTVideoEngineSurfaceCallback tTVideoEngineSurfaceCallback = this.mSurfaceCallback;
            if (tTVideoEngineSurfaceCallback != null) {
                SurfaceHolder surfaceHolder = this.mSurfaceHolder;
                if (surfaceHolder != null) {
                    surfaceHolder.removeCallback(tTVideoEngineSurfaceCallback);
                }
                TTVideoEngineLog.m256505i("TTVideoEngine", "remove surface callback:" + this.mSurfaceCallback);
                this.mSurfaceCallback.reset();
                this.mSurfaceCallback = null;
            }
            this.mSkipStartWhenPrepared = false;
        }
        _updateTextureState(3);
    }

    private void setMediaInfo2Abr(AbstractC20879g gVar, IVideoModel iVideoModel) {
        HashMap hashMap;
        HashMap hashMap2;
        List<VideoInfo> videoInfoList = iVideoModel.getVideoInfoList();
        if (!(videoInfoList == null || videoInfoList.size() == 0)) {
            List<Object> arrayList = new ArrayList<>();
            List<Object> arrayList2 = new ArrayList<>();
            for (VideoInfo videoInfo : videoInfoList) {
                if (videoInfo != null) {
                    int i = -1;
                    if (videoInfo.getMediatype() == VideoRef.TYPE_VIDEO) {
                        C20878f fVar = new C20878f();
                        String valueStr = videoInfo.getValueStr(15);
                        fVar.mo70568a(valueStr);
                        fVar.mo70573e(videoInfo.getValueInt(3));
                        fVar.mo70570b(videoInfo.getValueStr(8));
                        int valueInt = videoInfo.getValueInt(1);
                        int valueInt2 = videoInfo.getValueInt(2);
                        fVar.mo70567a(valueInt);
                        fVar.mo70569b(valueInt2);
                        fVar.mo70571c(-1);
                        fVar.mo70572d(5000);
                        if (!TextUtils.isEmpty(valueStr)) {
                            arrayList.add(fVar);
                        }
                        fVar.mo70574f(0);
                        Integer maxWidth = this.mSRStrategy.getMaxWidth();
                        Integer maxHeight = this.mSRStrategy.getMaxHeight();
                        if (maxWidth != null && maxHeight != null && valueInt <= maxWidth.intValue() && valueInt2 <= maxHeight.intValue()) {
                            fVar.mo70574f(1);
                        }
                        Resolution resolution = videoInfo.getResolution();
                        if (resolution != null) {
                            i = resolution.getIndex();
                        }
                        String valueStr2 = videoInfo.getValueStr(32);
                        if (valueStr2 != null) {
                            try {
                                i = Integer.parseInt(valueStr2);
                            } catch (NumberFormatException unused) {
                            }
                        }
                        fVar.mo70575g(i);
                    } else {
                        C20871a aVar = new C20871a();
                        String valueStr3 = videoInfo.getValueStr(15);
                        aVar.mo70555a(valueStr3);
                        aVar.mo70558c(videoInfo.getValueInt(3));
                        aVar.mo70557b(videoInfo.getValueStr(8));
                        aVar.mo70556b(-1);
                        aVar.mo70554a(5000);
                        if (!TextUtils.isEmpty(valueStr3)) {
                            arrayList2.add(aVar);
                        }
                    }
                }
            }
            gVar.mo70545a(arrayList, arrayList2);
            Resolution valueOf = Resolution.valueOf(this.mABR4GMaxResolutionIndex);
            HashMap hashMap3 = null;
            if (valueOf != null || !TextUtils.isEmpty(this.mABR4GMaxResolutionQuality)) {
                if (!TextUtils.isEmpty(this.mABR4GMaxResolutionQuality)) {
                    hashMap2 = new HashMap();
                    hashMap2.put(32, this.mABR4GMaxResolutionQuality);
                } else {
                    hashMap2 = null;
                }
                VideoInfo videoInfo2 = iVideoModel.getVideoInfo(valueOf, (Map<Integer, String>) hashMap2, true);
                if (videoInfo2 != null) {
                    gVar.mo70541a(2, (long) videoInfo2.getValueInt(3));
                }
            }
            Resolution valueOf2 = Resolution.valueOf(this.mWifiDefaultResolutionIndex);
            if (valueOf2 != null || !TextUtils.isEmpty(this.mWifiDefaultResolutionQuality)) {
                if (!TextUtils.isEmpty(this.mWifiDefaultResolutionQuality)) {
                    hashMap = new HashMap();
                    hashMap.put(32, this.mWifiDefaultResolutionQuality);
                } else {
                    hashMap = null;
                }
                VideoInfo videoInfo3 = iVideoModel.getVideoInfo(valueOf2, (Map<Integer, String>) hashMap, true);
                if (videoInfo3 != null) {
                    gVar.mo70541a(12, (long) videoInfo3.getValueInt(3));
                }
            }
            Resolution valueOf3 = Resolution.valueOf(this.mStartupMaxBitRateIndex);
            if (valueOf3 != null || !TextUtils.isEmpty(this.mStartupMaxBitRateQuality)) {
                if (!TextUtils.isEmpty(this.mStartupMaxBitRateQuality)) {
                    hashMap3 = new HashMap();
                    hashMap3.put(32, this.mStartupMaxBitRateQuality);
                }
                VideoInfo videoInfo4 = iVideoModel.getVideoInfo(valueOf3, (Map<Integer, String>) hashMap3, true);
                if (videoInfo4 != null) {
                    gVar.mo70541a(13, (long) videoInfo4.getValueInt(3));
                }
            }
        }
    }

    public void setPlayInfo(int i, long j) {
        P2PPlayUrlInfo p2PPlayUrlInfo = this.curP2PUrlInfo;
        int i2 = 3;
        int i3 = -1;
        if (p2PPlayUrlInfo != null && p2PPlayUrlInfo.mP2PCDNType > 0 && !TextUtils.isEmpty(this.curP2PUrlInfo.mUrl)) {
            if (i == 0) {
                i2 = 2;
            } else if (i != 2) {
                i2 = -1;
            }
            if (i == 1) {
                TTVideoEngineLog.m256507t("PROXY-XY-SETPLAYINFO", String.format("set play info into xyproxy p2p  key is play pos value:%d", Long.valueOf(j)));
                VideoLoadWrapper.getInstance().setPlayPos(this.curP2PUrlInfo.mUrl, j);
                return;
            }
            TTVideoEngineLog.m256507t("PROXY-XY-SETPLAYINFO", String.format("set play info into xyproxy p2p key:%d value:%d", Integer.valueOf(i2), Long.valueOf(j)));
            VideoLoadWrapper.getInstance().setPlayInfo(this.curP2PUrlInfo.mUrl, i2, j);
        } else if (this.mDataLoaderEnable <= 0) {
        } else {
            if (TextUtils.isEmpty(this.mTraceId)) {
                TTVideoEngineLog.m256507t("TTVideoEngine", "trace id null, not allow setplayinfo");
                return;
            }
            switch (i) {
                case 0:
                    i3 = 22;
                    break;
                case 1:
                    i3 = 23;
                    break;
                case 2:
                    i3 = 24;
                    break;
                case 3:
                    i3 = 25;
                    break;
                case 4:
                    i3 = 26;
                    break;
                case 5:
                    MediaPlayer mediaPlayer = this.mMediaPlayer;
                    if (mediaPlayer != null) {
                        if (j == -1) {
                            j = mediaPlayer.getLongOption(73, -1);
                            long longOption = mediaPlayer.getLongOption(72, -1);
                            if (j >= 0 && longOption >= 0) {
                                j = Math.min(j, longOption);
                            } else if (longOption >= 0) {
                                j = longOption;
                            }
                        }
                        i3 = 27;
                        break;
                    } else {
                        TTVideoEngineLog.m256507t("MDL-SETPLAYINFO", "mediaplayer is null not allow set PLAY_INFO_CURRENT_BUFFER");
                        return;
                    }
                    break;
                case 6:
                    i3 = 28;
                    break;
            }
            if (this.mEnableSetPlayInfoToP2P == 0 || this.mForbidP2P == 1) {
                DataLoaderHelper.getDataLoader().setPlayInfoOnlyForPreload(i3, this.mTraceId, this.mVideoID, j);
            } else {
                DataLoaderHelper.getDataLoader().setPlayInfo(i3, this.mTraceId, this.mVideoID, j);
            }
            TTVideoEngineLog.m256507t("MDL-SETPLAYINFO", String.format("set play info into mdl key:%d value:%d traceid:%s", Integer.valueOf(i3), Long.valueOf(j), this.mTraceId));
        }
    }

    public TTVideoEngine(Context context, int i) {
        JniUtils.loadLibrary();
        TTVideoEngineLog.m256505i("TTVideoEngine", "init, type:" + i + ", this:" + this);
        initEngine(context, i, null);
    }

    /* access modifiers changed from: protected */
    public void _switchToResolution(Resolution resolution, Map<Integer, String> map) {
        PlayDurationManager playDurationManager;
        int i;
        int i2;
        Map<Integer, String> map2;
        if (this.currentResolution != resolution || (!((map2 = this.currentParams) == null && map == null) && (map2 == null || !map2.equals(map)))) {
            IVideoModel iVideoModel = this.mVideoModel;
            if (iVideoModel != null) {
                if (!(this.currentResolution == resolution || (this.mVideoEngineListener == null && this.mSimpleCallback == null))) {
                    VideoInfo videoInfo = iVideoModel.getVideoInfo(resolution, iVideoModel.getVideoRefInt(7), map, false);
                    IVideoModel iVideoModel2 = this.mVideoModel;
                    VideoInfo videoInfo2 = iVideoModel2.getVideoInfo(this.currentResolution, iVideoModel2.getVideoRefInt(7), this.currentParams, false);
                    if (!(videoInfo2 == null || videoInfo == null || videoInfo.getValueInt(3) != videoInfo2.getValueInt(3))) {
                        if (this.mLooperThread.checkSendMainLooper()) {
                            this.mLooperThread.postMainLooperMessage(407, this.mVideoModel.getVideoRefInt(7), 0, null);
                        } else {
                            VideoEngineListener videoEngineListener = this.mVideoEngineListener;
                            if (videoEngineListener != null) {
                                videoEngineListener.onStreamChanged(this, this.mVideoModel.getVideoRefInt(7));
                            }
                            VideoEngineCallback videoEngineCallback = this.mSimpleCallback;
                            if (videoEngineCallback != null) {
                                videoEngineCallback.onStreamChanged(this, this.mVideoModel.getVideoRefInt(7));
                            }
                        }
                    }
                }
                this.lastResolution = this.currentResolution;
                this.mLastSwitchResolutionTime = System.currentTimeMillis();
                this.currentResolution = resolution;
                this.currentParams = map;
                TTVideoEngineLog.m256505i("TTVideoEngine", String.format("will switch to resolution:%s, from resolution:%s", _resolutionToString(resolution), _resolutionToString(this.lastResolution)));
                if (map != null) {
                    for (Map.Entry<Integer, String> entry : map.entrySet()) {
                        TTVideoEngineLog.m256505i("TTVideoEngine", "will switch to params, Key = " + entry.getKey() + ",Value = " + entry.getValue());
                    }
                }
                boolean isSupportSeamlessSwitch = isSupportSeamlessSwitch(this.mVideoModel);
                if (isSupportSeamlessSwitch && this.mPlaybackState != 2) {
                    int i3 = VideoRef.TYPE_VIDEO;
                    if (this.mVideoModel.hasData()) {
                        if (map == null) {
                            map = new HashMap<>();
                        }
                        if (this.mCodecType.equals("bytevc2") && this.mVideoModel.getVideoRefBool(228)) {
                            map.put(8, "bytevc2");
                        } else if (this.mCodecType.equals("bytevc1") && this.mVideoModel.getVideoRefBool(204)) {
                            map.put(8, "bytevc1");
                        } else if (this.mVideoModel.getVideoRefBool(SmEvents.EVENT_HBRESET)) {
                            map.put(8, "h264");
                        }
                        VideoInfo _videoInfoForResolution = _videoInfoForResolution(this.currentResolution, this.mVideoModel.getVideoRefInt(7), map);
                        if (_videoInfoForResolution != null) {
                            i2 = _videoInfoForResolution.getValueInt(3);
                            i = _videoInfoForResolution.getMediatype();
                        } else {
                            i = i3;
                            i2 = 0;
                        }
                        if (this.mVideoEngineInfoListener != null) {
                            ArrayList arrayList = new ArrayList();
                            if (this.mVideoModel.hasFormat(IVideoModel.Format.DASH)) {
                                String dynamicType = this.mVideoModel.getDynamicType();
                                if (!TextUtils.isEmpty(dynamicType) && dynamicType.equals("segment_base")) {
                                    VideoInfo _videoInfoForResolution2 = _videoInfoForResolution(this.currentResolution, VideoRef.TYPE_VIDEO, map);
                                    VideoInfo _videoInfoForResolution3 = _videoInfoForResolution(this.currentResolution, VideoRef.TYPE_AUDIO, map);
                                    if (_videoInfoForResolution2 != null) {
                                        arrayList.add(_videoInfoForResolution2);
                                    }
                                    if (_videoInfoForResolution3 != null) {
                                        arrayList.add(_videoInfoForResolution3);
                                    }
                                }
                            } else if (_videoInfoForResolution != null) {
                                arrayList.add(_videoInfoForResolution);
                            }
                            if (arrayList.size() > 0) {
                                VideoEngineInfos videoEngineInfos = new VideoEngineInfos();
                                videoEngineInfos.setKey("usingUrlInfos");
                                videoEngineInfos.setUrlInfos(arrayList);
                                if (this.mLooperThread.checkSendMainLooper()) {
                                    this.mLooperThread.postMainLooperMessage(PLAYER_OPTION_USE_AJ_MEDIACODEC, 0, 0, videoEngineInfos);
                                } else {
                                    this.mVideoEngineInfoListener.onVideoEngineInfos(videoEngineInfos);
                                }
                            }
                        }
                    } else {
                        i = i3;
                        i2 = 0;
                    }
                    if (this.mMediaPlayer != null && isInHousePlayer()) {
                        this.mLogger.switchResolution(_resolutionToString(this.currentResolution), _resolutionToString(this.lastResolution), false);
                        changeResolutionSwitchingState(true);
                        this.mMediaPlayer.switchStream(i2, i);
                        return;
                    }
                }
                if (!this.mSeamSwitchingResolution) {
                    this.mSeamSwitchingResolution = true;
                    this.mLogger.switchResolution(_resolutionToString(this.currentResolution), _resolutionToString(this.lastResolution), true);
                    changeResolutionSwitchingState(true);
                    if (!isSupportSeamlessSwitch && (playDurationManager = this.mPlayDuration) != null) {
                        playDurationManager.stop();
                    }
                    this.mLastPlaybackTime = _getPlayerTime();
                }
                MediaPlayer mediaPlayer = this.mMediaPlayer;
                if (mediaPlayer != null) {
                    mediaPlayer.pause();
                }
                _parseIPAddress(this.mVideoModel);
                return;
            }
            return;
        }
        TTVideoEngineLog.m256503e("TTVideoEngine", String.format("switch to the same resolution:%s, drop", _resolutionToString(resolution)));
    }

    public static Resolution findBestResolution(VideoModel videoModel, Resolution resolution, int i) {
        return findBestResolution(videoModel, resolution, i, null);
    }

    public static long getCacheFileSize(VideoModel videoModel, Resolution resolution, Map<Integer, String> map) {
        return getCacheFileSize((IVideoModel) videoModel, resolution, map);
    }

    public void setDirectUrlUseDataLoader(String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str)) {
            setDirectUrlUseDataLoader(new String[]{str}, str2, str3);
        }
    }

    public static void addTask(VideoModel videoModel, Resolution resolution, long j) {
        DataLoaderHelper.getDataLoader().addTask(videoModel, resolution, j);
    }

    public static long getCacheFileSize(IVideoModel iVideoModel, Resolution resolution, Map<Integer, String> map) {
        long j = 0;
        if (iVideoModel == null || resolution == null) {
            return 0;
        }
        VideoInfo videoInfo = iVideoModel.getVideoInfo(resolution, VideoRef.TYPE_VIDEO, map, false);
        if (videoInfo != null) {
            j = 0 + DataLoaderHelper.getDataLoader().getCacheFileSize(videoInfo.getValueStr(15));
        }
        VideoInfo videoInfo2 = iVideoModel.getVideoInfo(resolution, VideoRef.TYPE_AUDIO, map, true);
        if (videoInfo2 != null) {
            return j + DataLoaderHelper.getDataLoader().getCacheFileSize(videoInfo2.getValueStr(15));
        }
        return j;
    }

    public void setDataSource(FileDescriptor fileDescriptor, long j, long j2) {
        this.mPipeOffset = j;
        this.mPipeLength = j2;
        if (this.mLooperThread.checkEngineLooperThread(false)) {
            this.mLooperThread.postEngineMessage(12, 0, 0, fileDescriptor);
        } else {
            _doSetDataSource(fileDescriptor);
        }
    }

    public void setDirectUrlUseDataLoader(String[] strArr, String str, String str2) {
        if (this.mLooperThread.checkEngineLooperThread(false)) {
            this.mLooperThread.postEngineMessage(20, 0, 0, strArr, str, str2);
        } else {
            _doSetDirectUrlUseDataLoader(strArr, str, str2);
        }
    }

    public void setPlayerSurface(Surface surface, int i, int i2) {
        if (!this.mLooperThread.checkEngineLooperThread(false)) {
            _doSetPlayerSurface(surface, i);
        } else if (i2 == 1) {
            this.mLooperThread.sendEngineMessage(56, this.mSendEngineMsgTimeout, i, 0, surface);
        } else {
            this.mLooperThread.postEngineMessage(56, i, 0, surface);
        }
    }

    private VideoInfo _videoInfoForResolution(Resolution resolution, int i, Map<Integer, String> map) {
        IVideoModel iVideoModel = this.mVideoModel;
        if (iVideoModel == null || !iVideoModel.hasData()) {
            return null;
        }
        VideoInfo videoInfo = this.mVideoModel.getVideoInfo(resolution, i, map, true);
        if (videoInfo != null) {
            int videoRefInt = this.mVideoModel.getVideoRefInt(7);
            if (videoRefInt == VideoRef.TYPE_AUDIO && videoInfo.getMediatype() == VideoRef.TYPE_AUDIO) {
                this.currentResolution = videoInfo.getResolution();
                this.mCurrentQualityDesc = videoInfo.getValueStr(32);
            } else if (videoRefInt == VideoRef.TYPE_VIDEO && videoInfo.getMediatype() == VideoRef.TYPE_VIDEO) {
                this.currentResolution = videoInfo.getResolution();
                this.mCurrentQualityDesc = videoInfo.getValueStr(32);
            }
            this.mLogger.setCurrentQualityDesc(this.mCurrentQualityDesc);
            this.mLogger.configResolution(_resolutionToString(this.currentResolution), "");
        }
        return videoInfo;
    }

    /* access modifiers changed from: package-private */
    public void _doSetDirectUrlUseDataLoader(String[] strArr, String str, String str2) {
        String str3 = str;
        if (strArr == null || strArr.length == 0 || TextUtils.isEmpty(strArr[0])) {
            TTVideoEngineLog.m256503e("TTVideoEngine", "invalid urls list, it is empty");
            return;
        }
        this.mMediaInfoString = StrategyHelper.buildMediaInfo(str2, str3, strArr);
        if (TextUtils.isEmpty(str) || this.mDataLoaderEnable == 0) {
            _doSetDirectURL(strArr[0]);
        } else {
            _resetUsingDataLoaderField();
            TTVideoEngineLog.m256505i("TTVideoEngine", "setDirectUrlUseDataLoader key = " + str3 + ", videoId = " + str2);
            String _mdlUrl = _mdlUrl(str, str2, (long) this.mLimitMDLCacheSize, strArr, Resolution.Undefine, this.mDecryptionKey, null, null, null);
            if (!this.mFileHashs.contains(str3)) {
                this.mFileHashs.add(str3);
            }
            if (TextUtils.isEmpty(_mdlUrl)) {
                _doSetDirectURL(strArr[0]);
            } else {
                this.mVideoID = str2;
                boolean z = true;
                if (this.mEnableDirectUrlCheck == 1) {
                    int length = strArr.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            z = false;
                            break;
                        } else if (URLUtil.isValidUrl(strArr[i])) {
                            break;
                        } else {
                            i++;
                        }
                    }
                    if (!z) {
                        TTVideoEngineLog.m256503e("TTVideoEngine", "invalid urls list, all url invalid");
                        _receivedError(new Error("kTTVideoErrorDomainVideoOwnPlayer", -9966, "Direct url is invalid url."));
                        return;
                    }
                }
                _doSetDirectURL(_mdlUrl);
            }
            IVideoEventLogger iVideoEventLogger = this.mLogger;
            if (iVideoEventLogger != null) {
                iVideoEventLogger.setProxyUrl(_mdlUrl);
            }
        }
        if (this.mEnablePlayerDegrade) {
            if (!TextUtils.isEmpty(str2)) {
                str3 = str2;
            } else {
                String extractVideoId = VideoEventOneStorage.extractVideoId(strArr[0]);
                if (!TextUtils.isEmpty(extractVideoId)) {
                    str3 = extractVideoId;
                }
            }
            VideoEventOneStorage.getInstance().storeVideoId(str3);
            IVideoEventLogger iVideoEventLogger2 = this.mLogger;
            if (iVideoEventLogger2 != null) {
                iVideoEventLogger2.setStringOption(53, str3);
            }
        }
        this.mVideoID = str2;
    }

    private void initEngine(Context context, int i, Map map) {
        int i2;
        boolean z;
        boolean z2;
        this.mContext = context;
        boolean z3 = false;
        this.mIsMute = false;
        this.mFirstURL = true;
        this.mFirstIP = true;
        this.mFirstHost = true;
        this.mUseFallbackAPI = true;
        this.currentResolution = Resolution.Standard;
        this.expectedResolution = Resolution.Auto;
        this.urlIndexMap = new HashMap();
        this.dashVideoUrlMap = new HashMap();
        this.dashAudioUrlMap = new HashMap();
        _resetUrlIndexMap();
        this.urlIPMap = new HashMap();
        this.mHeaders = new HashMap<>();
        this.mConfigParams = new HashMap<>();
        this.mPlayerType = i;
        this.mTextureFirstFrame = false;
        this.mPlayerFirstFrame = false;
        this.mDataLoaderEnable = ONLY_USE_MEDIALOADER ? 1 : 0;
        this.mSendEngineMsgTimeout = 500;
        TTVideoEngineLog.m256500d("TTVideoEngine", "DataLoaderEnable is: " + this.mDataLoaderEnable);
        TTPlayerConfiger.setValue(6, false);
        if (i == 2 || i == 5) {
            i2 = 0;
        } else {
            i2 = 1;
        }
        TTPlayerConfiger.setValue(1, i2);
        if (i == 1) {
            z = true;
        } else {
            z = false;
        }
        TTPlayerConfiger.setValue(2, z);
        if (i == 5) {
            z2 = true;
        } else {
            z2 = false;
        }
        TTPlayerConfiger.setValue(26, z2);
        TTPlayerConfiger.setValue(11, false);
        TTPlayerConfiger.setValue(4, false);
        if (i == 3) {
            setForceUseLitePlayer(true);
        }
        this.mHeadsetMonitor = new HeadsetStateMonitor(context);
        VideoEventLoggerV2 videoEventLoggerV2 = new VideoEventLoggerV2(context, new MyLoggerDataSource(this), this.mHeadsetMonitor);
        this.mLogger = videoEventLoggerV2;
        videoEventLoggerV2.setUploadLogEnabled(true);
        this.mLogger.configResolution(_resolutionToString(this.currentResolution), "");
        if (!ONLY_USE_MEDIALOADER) {
            createDefaultCacheFileDirectory();
        }
        this.mPlayDuration = new PlayDurationManager(this.mHeadsetMonitor);
        if (!TimeService.isUpdated()) {
            TimeService.updateTimeFromNTP(this.mContext);
        }
        EngineThreadPool.addExecuteTask(new VideoInfoCollector.myVideoCollectorRegister(this, this.mSerial));
        this.mLooperThread = new TTVideoEngineLooperThread(this);
        if (SettingsHelper.helper().getVodInt("engine_enable_looper", 0) != 0) {
            z3 = true;
        }
        this.mEnableLooperThread = z3;
        if (map != null && map.containsKey("enable_looper")) {
            this.mEnableLooperThread = ((Boolean) map.get("enable_looper")).booleanValue();
        }
        if (this.mEnableLooperThread) {
            HandlerThread handlerThread = null;
            if (map != null && map.containsKey("handler_thread")) {
                handlerThread = (HandlerThread) map.get("handler_thread");
            }
            this.mLooperThread.start(handlerThread);
            this.mLogger.setIntOption(30, 1);
        }
        VideoEventManager.instance.setContext(context);
        initMDLFetcher(context);
        this.mEngineHash = String.valueOf(hashCode());
        TTVideoEngineLog.m256505i("TTVideoEngine", "initEngine, engine hash:" + this.mEngineHash);
    }

    public TTVideoEngine(Context context, int i, Map map) {
        JniUtils.loadLibrary();
        TTVideoEngineLog.m256505i("TTVideoEngine", "init2, type:" + i + ", this:" + this);
        initEngine(context, i, map);
    }

    public static void setupNewSpeedPredictMLComponent(IMLComponentConfigModel iMLComponentConfigModel, IMLComponentDownLoader iMLComponentDownLoader, IMLComponentLogger iMLComponentLogger, IMLComponentStateListener iMLComponentStateListener) {
        MLComponentManager mLComponentManager = new MLComponentManager("networkPredict");
        mLComponentManager.mo70578a(new MLComponentDownLoaderListener(iMLComponentDownLoader)).mo70577a(iMLComponentConfigModel).mo70579a(iMLComponentLogger).mo70580a(iMLComponentStateListener);
        StrategyCenter.setSpeedPredictorMLComponent(mLComponentManager);
    }

    protected static Resolution findBestResolution(IVideoModel iVideoModel, Resolution resolution, int i, SpeedShiftConfig speedShiftConfig) {
        Resolution findDefaultResolution = BestResolution.findDefaultResolution(iVideoModel, resolution);
        if (i == 1) {
            return BestResolution.findMaxCacheResolution(iVideoModel, findDefaultResolution);
        }
        if (i == 2) {
            return BestResolution.findMaxQualityResolution(iVideoModel, findDefaultResolution);
        }
        if (i != 3) {
            return findDefaultResolution;
        }
        double d = -1.0d;
        if (StrategyCenter.sNetSpeedPredictor != null) {
            d = (double) ((StrategyCenter.sNetSpeedPredictor.mo70589b() / 8.0f) / 1024.0f);
        }
        return BestResolution.findAwemeShiftResolution(iVideoModel, findDefaultResolution, d, speedShiftConfig);
    }

    public static void startSpeedPredictor(int i, int i2, int i3, int i4) {
        if (FeatureManager.hasPermission("net_speed") && StrategyCenter.sNetAbrSpeedPredictor == null) {
            sNetSpeedAbrPredictType = i;
            sIsReportTestSpeedInfo = i3;
            sReportSpeedInfoMaxWindowSize = i4;
            if (sABRSpeedPredictInputType == 0) {
                sABRSpeedPredictInputType = 1;
            }
            if (i2 > 0) {
                sTestSpeedInterval = i2;
                sTestSpeedSampleInterval = i2;
            }
            TTVideoEngineLog.m256500d("TTVideoEngine", String.format("[ABR] abrSpeedPredictUpdateIntervalMs:%d", Integer.valueOf(i2)));
            StrategyCenter.createAbrSpeedPredictor(i, i2);
        }
    }

    public static void addTask(VideoModel videoModel, Resolution resolution, Map<Integer, String> map, long j) {
        DataLoaderHelper.getDataLoader().addTask(videoModel, resolution, map, j);
    }

    public void setSRInitConfig(int i, String str, String str2, String str3) {
        this.mOldTextureAlgType = this.mTextureAlgType;
        this.mTextureAlgType = i;
        this.mTextureSRBinPath = str;
        this.mTextureSROclModuleName = str2;
        this.mTextureSRDspModuleName = str3;
        this.mLogger.setSrAlgorithm(i);
        TTVideoEngineLog.m256505i("TTVideoEngine", "[SRLog]sr init config = " + this.mTextureAlgType + "," + this.mTextureSRBinPath + "," + this.mTextureSROclModuleName + ", " + this.mTextureSRDspModuleName);
    }

    public static void addTask(String str, String str2, long j, DataLoaderResourceProvider dataLoaderResourceProvider) {
        DataLoaderHelper.getDataLoader().addTask(str, str2, j, dataLoaderResourceProvider, (String) null);
    }

    public static void addTask(String str, String str2, long j, String str3) {
        DataLoaderHelper.getDataLoader().addTask(str, str2, j, str3);
    }

    public static String proxyUrl(String str, String str2, String[] strArr, Resolution resolution, String str3) {
        return DataLoaderHelper.getDataLoader().proxyUrl(str, str2, strArr, resolution, str3);
    }

    public static void addTask(String str, String str2, long j, DataLoaderResourceProvider dataLoaderResourceProvider, String str3) {
        DataLoaderHelper.getDataLoader().addTask(str, str2, j, dataLoaderResourceProvider, str3);
    }

    /* access modifiers changed from: private */
    public class IpInfo {
        public String dns;
        public String ip;
        public int isDNSCacheOpen;
        public int isServerDNSOpen;
        public String urlDesc;

        public IpInfo(String str, String str2, int i, int i2, String str3) {
            this.ip = str;
            this.dns = str2;
            this.isDNSCacheOpen = i;
            this.isServerDNSOpen = i2;
            this.urlDesc = str3;
        }
    }

    private String _mdlUrl(String str, String str2, long j, String[] strArr, Resolution resolution, String str3, VideoInfo videoInfo, String str4, String str5) {
        boolean z;
        boolean z2;
        TTVideoEngine tTVideoEngine;
        IVideoModel iVideoModel = this.mVideoModel;
        if (iVideoModel == null || !iVideoModel.hasFormat(IVideoModel.Format.HLS)) {
            z = false;
        } else {
            z = true;
        }
        if (this.mPlayerType != 0) {
            TTVideoEngineLog.m256505i("TTVideoEngine", "force disable native mal because play type: " + this.mPlayerType);
            z2 = true;
        } else {
            z2 = false;
        }
        String _proxyUrl = DataLoaderHelper.getDataLoader()._proxyUrl(str, str2, j, strArr, resolution, str3, videoInfo, str4, str5, z2, z, this.mTTHlsDrmToken);
        if (!TextUtils.isEmpty(_proxyUrl)) {
            StringBuilder sb = new StringBuilder();
            sb.append("_mdlUrl get proxyUrl: key = ");
            sb.append(str);
            sb.append(", videoId = ");
            String str6 = str2;
            sb.append(str6);
            TTVideoEngineLog.m256505i("TTVideoEngine", sb.toString());
            if (_proxyUrl.startsWith("mdl://")) {
                tTVideoEngine = this;
                tTVideoEngine.mLogger.setEnableMDL(2);
            } else {
                tTVideoEngine = this;
                tTVideoEngine.mLogger.setEnableMDL(1);
            }
            tTVideoEngine.mLogger.setProxyUrl(_proxyUrl);
            if (TextUtils.isEmpty(str2)) {
                str6 = str;
            }
            tTVideoEngine.mUsingDataLoaderPlayRawKey = str6;
            if (!TextUtils.isEmpty(str4)) {
                tTVideoEngine.mUsingDataLoaderPlayFilePaths.add(str4);
            }
            if (!TextUtils.isEmpty(str)) {
                tTVideoEngine.mUsingDataLoaderPlayTaskKeys.add(str);
            }
            _dataLoaderAddEngineRef();
        }
        return _proxyUrl;
    }
}
