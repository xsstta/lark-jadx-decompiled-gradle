package com.ss.ttvideoengine;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.platform.godzilla.thread.C20339a;
import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import com.bytedance.vcloud.strategy.ISelectBitrateListener;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.android.HwBuildEx;
import com.huawei.hms.api.ConnectionResult;
import com.huawei.hms.framework.common.ContainerUtils;
import com.huawei.hms.framework.common.ExceptionCode;
import com.huawei.hms.location.LocationRequest;
import com.huawei.hms.maps.model.CameraPosition;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.ss.android.lark.calendar.impl.features.search.result.CalendarSearchResultRv;
import com.ss.android.lark.mm.module.list.control.MmListControl;
import com.ss.android.lark.mm.module.participant.ParticipantRepo;
import com.ss.android.ugc.p3041a.C60447b;
import com.ss.android.vc.meeting.framework.meeting.IByteRtcError;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;
import com.ss.mediakit.medialoader.AVMDLCopyOperation;
import com.ss.mediakit.medialoader.AVMDLCopyOperationListener;
import com.ss.mediakit.medialoader.AVMDLDataLoader;
import com.ss.mediakit.medialoader.AVMDLDataLoaderConfigure;
import com.ss.mediakit.medialoader.AVMDLDataLoaderListener;
import com.ss.mediakit.medialoader.AVMDLDataLoaderNotifyInfo;
import com.ss.mediakit.medialoader.AVMDLStartCompleteListener;
import com.ss.mediakit.medialoader.LoaderListener;
import com.ss.mediakit.net.AVMDLDNSParser;
import com.ss.ttm.player.MediaPlayer;
import com.ss.ttvideoengine.TTNetWorkListener;
import com.ss.ttvideoengine.VideoModelCache;
import com.ss.ttvideoengine.cache.CopyCacheItem;
import com.ss.ttvideoengine.data.P2PStragetyManager;
import com.ss.ttvideoengine.download.Downloader;
import com.ss.ttvideoengine.fetcher.VideoInfoFetcher;
import com.ss.ttvideoengine.log.IVideoEventLogger;
import com.ss.ttvideoengine.log.IVideoEventUploader;
import com.ss.ttvideoengine.log.VideoEventEngineUploader;
import com.ss.ttvideoengine.model.IVideoModel;
import com.ss.ttvideoengine.model.VideoInfo;
import com.ss.ttvideoengine.model.VideoModel;
import com.ss.ttvideoengine.model.VideoRef;
import com.ss.ttvideoengine.net.NetUtils;
import com.ss.ttvideoengine.net.TTVNetClient;
import com.ss.ttvideoengine.preload.PreloadConfig;
import com.ss.ttvideoengine.preload.PreloadLoadProgressCenter;
import com.ss.ttvideoengine.preload.PreloadMedia;
import com.ss.ttvideoengine.preload.PreloadModelMedia;
import com.ss.ttvideoengine.preload.PreloadScene;
import com.ss.ttvideoengine.preload.PreloadTaskConfig;
import com.ss.ttvideoengine.preload.PreloadURLMedia;
import com.ss.ttvideoengine.preload.PreloadUtil;
import com.ss.ttvideoengine.setting.SettingsHelper;
import com.ss.ttvideoengine.strategrycenter.ISelectBitrateCallback;
import com.ss.ttvideoengine.strategrycenter.StrategyHelper;
import com.ss.ttvideoengine.utils.DataLoaderCDNLog;
import com.ss.ttvideoengine.utils.Error;
import com.ss.ttvideoengine.utils.TTHelper;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import com.ss.ttvideoengine.utils.TTVideoEngineUtils;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class DataLoaderHelper implements AVMDLDataLoaderListener, AVMDLStartCompleteListener {
    private volatile boolean isProxyLibraryLoaded;
    private DataLoaderTaskQueue mAllPlayTasks;
    private DataLoaderTaskQueue mAllPreloadTasks;
    private HashMap<String, ArrayList<TTVideoEngine>> mAllUsingEngies;
    private boolean mAudioPreloadFirst;
    private int mBackupLoaderType;
    private AVMDLDataLoaderConfigure mConfigure;
    private Context mContext;
    public int mCurrentAccessType;
    private int mEnableBackupIP;
    private int mEnableBufferPreload;
    private int mEnableDumpLibMd5;
    private int mEnableHls;
    private boolean mEnableMdlProtocol;
    private int mEnableMdlV2;
    private int mEnableNetworkChangedListen;
    private int mEnablePreParseHost;
    private int mEnableReportSpeed;
    private int mEnableSplitPreload;
    private final ReentrantLock mEngineLock;
    private VideoEventEngineUploader mEngineUploader;
    private Exception mException;
    private DataLoaderTaskQueue mExecuteTasks;
    private int mFloatSize;
    private DataLoaderHeartBeat mHeartBeat;
    private int mHeartBeatInterval;
    private AVMDLDataLoader mInnerDataLoader;
    private boolean mInvalidMdlProcotol;
    public DataLoaderListener mListener;
    private final ReentrantLock mLock;
    private int mMdlDataSourceId;
    private int mMdlOldPreloadStrategy;
    private int mMdlPreloadStrategy;
    private long mMdlProtocolHandle;
    private VideoModelCache mModelCache;
    private int mNeedDLLoadP2PLib;
    private int mNeedSpeedTestByTimeInternal;
    private TTNetworkStateCallback mNetWorkChangeCb;
    private WeakReference<TTNetworkStateCallback> mNetWorkChangeCbr;
    private int mPreloadPreConnect;
    private int mPreloadTaskIgnorePlayerStall;
    private DataLoaderTaskQueue mPreloadTasks;
    private final PreloadUtil mPreloadUtil;
    private volatile LibraryLoaderProxy mProxy;
    private boolean mReportLogEnable;
    private volatile int mState;
    private boolean mSupporHls;
    private TestSpeedListener mTestSpeedListener;
    private String mUpdatePlaySourceId;
    private IVideoEventUploader mUploader;
    private String mVersionInfo;
    private PreloadMediaThread mediaOperateThread;

    /* access modifiers changed from: private */
    public interface TaskListener {
        void taskFinished(DataLoaderTaskItem dataLoaderTaskItem);
    }

    private String _apiStringForVid(PreloaderVidItem preloaderVidItem) {
        return null;
    }

    public void addPreloadUrlMedia(PreloadURLMedia preloadURLMedia) {
    }

    @Override // com.ss.mediakit.medialoader.AVMDLDataLoaderListener
    public long getInt64Value(int i, long j) {
        return 0;
    }

    public int getProbeIntervalMS() {
        return -1;
    }

    public int getProbeType() {
        return 0;
    }

    public float playTaskProgress() {
        return -1.0f;
    }

    public void removePreloadMedia(PreloadMedia preloadMedia, String str) {
    }

    public void setNetworkClient(TTVNetClient tTVNetClient) {
    }

    public void setPlayTaskProgress(float f) {
    }

    public void setProbeIntervalMS(int i) {
    }

    public void setProbeType(int i) {
    }

    public void setTaskConfigs(List<PreloadTaskConfig> list) {
    }

    private static class Holder {
        public static DataLoaderHelper instance = new DataLoaderHelper();

        private Holder() {
        }
    }

    public static DataLoaderHelper getDataLoader() {
        return Holder.instance;
    }

    public void addTask(String str, String str2, VideoModel videoModel, Resolution resolution, long j) {
        addTask(new PreloaderVideoModelItem(videoModel, resolution, j, (PreloaderFilePathListener) null));
    }

    public void addTask(String str, String str2, String str3, long j) {
        if (TextUtils.isEmpty(str3)) {
            TTVideoEngineLog.m256503e("DataLoaderHelper", "[preload] url invalid.");
            return;
        }
        addTask(new PreloaderURLItem(str, str2, j, new String[]{str3}));
    }

    public void addTask(String str, String str2, String[] strArr, long j) {
        if (strArr == null || strArr.length == 0) {
            TTVideoEngineLog.m256503e("DataLoaderHelper", "urls invalid.");
        } else {
            addTask(new PreloaderURLItem(str, str2, j, strArr));
        }
    }

    public void addTask(String str, String str2, String[] strArr, long j, String str3) {
        if (strArr == null || strArr.length == 0) {
            TTVideoEngineLog.m256503e("DataLoaderHelper", "urls invalid.");
        } else {
            addTask(new PreloaderURLItem(str, str2, j, strArr, str3));
        }
    }

    public void addTask(String[] strArr, String str, long j, String str2) {
        if (strArr == null || strArr.length == 0) {
            TTVideoEngineLog.m256503e("DataLoaderHelper", "urls invalid.");
            return;
        }
        this.mLock.lock();
        try {
            String keyFromFilePath = TTHelper.keyFromFilePath(this.mContext, str2);
            PreloaderURLItem preloaderURLItem = new PreloaderURLItem(str, j, strArr, str2);
            preloaderURLItem.setKey(keyFromFilePath);
            addTask(preloaderURLItem);
        } finally {
            this.mLock.unlock();
        }
    }

    /* access modifiers changed from: private */
    public class DataLoaderHeartBeat {
        private MyHeartBeatTask mHbTask;
        private Timer mHbTimer;

        public void stop() {
            Timer timer = this.mHbTimer;
            if (timer != null) {
                timer.cancel();
            }
        }

        /* access modifiers changed from: private */
        public class MyHeartBeatTask extends TimerTask {
            private AVMDLDataLoader mDataLoader;

            public void run() {
                try {
                    AVMDLDataLoader aVMDLDataLoader = this.mDataLoader;
                    if (aVMDLDataLoader != null) {
                        aVMDLDataLoader.onLogInfo(70, 0, aVMDLDataLoader.getStringValue(1011));
                    }
                } catch (Exception e) {
                    TTVideoEngineLog.m256501d(e);
                }
            }

            public MyHeartBeatTask(AVMDLDataLoader aVMDLDataLoader) {
                this.mDataLoader = aVMDLDataLoader;
            }
        }

        private DataLoaderHeartBeat() {
        }

        public void start(AVMDLDataLoader aVMDLDataLoader, int i) {
            if (this.mHbTask == null && this.mHbTimer == null && i > 0) {
                this.mHbTask = new MyHeartBeatTask(aVMDLDataLoader);
                Timer timer = new Timer();
                this.mHbTimer = timer;
                long j = (long) i;
                timer.schedule(this.mHbTask, j, j);
            }
        }
    }

    public class DataLoaderTaskItem {
        public String mApiString;
        public boolean mDidCanceled;
        public VideoInfoFetcher mFetcher;
        public TaskListener mListener;
        public PreloadMedia mPreloadMedia;
        public long mPreloadMilliSecondOffset;
        public float mPreloadSecond;
        public long mPreloadSize;
        public int mPriorityLevel;
        public IVideoModel mResponseData;
        public Error mResponseError;
        public Resolution mSetResolution = Resolution.Undefine;
        public String mSubTag;
        public String mTag;
        public long mTimePreloadLowerLimitSize;
        public long mTimePreloadUpperLimitSize;
        public List<TrackItem> mTracks = new CopyOnWriteArrayList();
        public PreloaderURLItem mURLItem;
        public PreloaderVidItem mVidItem;
        public String mVideoId;
        public PreloaderVideoModelItem mVideoModelItem;

        public void setFetchListener() {
            VideoInfoFetcher videoInfoFetcher = this.mFetcher;
            if (videoInfoFetcher != null) {
                videoInfoFetcher.setListener(new MyFetcherListener(this));
            }
        }

        public void removeVidPlaceholderTrack() {
            if (this.mVidItem != null && this.mTracks.size() == 1) {
                this.mTracks.remove(0);
            }
        }

        public IPreLoaderItemCallBackListener getCallBackListener() {
            PreloaderURLItem preloaderURLItem = this.mURLItem;
            if (preloaderURLItem != null && preloaderURLItem.getCallBackListener() != null) {
                return this.mURLItem.getCallBackListener();
            }
            PreloaderVidItem preloaderVidItem = this.mVidItem;
            if (preloaderVidItem != null) {
                return preloaderVidItem.getCallBackListener();
            }
            PreloaderVideoModelItem preloaderVideoModelItem = this.mVideoModelItem;
            if (preloaderVideoModelItem != null) {
                return preloaderVideoModelItem.getCallBackListener();
            }
            PreloadMedia preloadMedia = this.mPreloadMedia;
            if (preloadMedia != null) {
                return preloadMedia.getCallBackListener();
            }
            return null;
        }

        public void setListener(TaskListener taskListener) {
            this.mListener = taskListener;
        }

        public class TrackItem {
            public long mCacheSize;
            public String mCustomHeader;
            public String mDecryptionKey;
            public String mExternalInfo;
            public String mLocalFilePath;
            public long mMediaSize;
            public long mPreSize;
            public long mPreloadHeaderSize;
            public long mPreloadOffset;
            public String mProxyUrl;
            public String mTaskKey;
            public String[] mUrls;
            public Resolution mUsingResolution = Resolution.Undefine;
            public VideoInfo mVideoInfo;

            public TrackItem() {
            }
        }

        public DataLoaderTaskItem() {
        }

        public void _notifyError(int i) {
            if (getCallBackListener() != null) {
                PreLoaderItemCallBackInfo preLoaderItemCallBackInfo = new PreLoaderItemCallBackInfo(3);
                preLoaderItemCallBackInfo.preloadError = new Error("kTTVideoErrorDomainDataLoaderPreload", i);
                getCallBackListener().preloadItemInfo(preLoaderItemCallBackInfo);
            }
        }

        public TrackItem addTrackItemByKey(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            TrackItem trackItem = getTrackItem(str);
            if (trackItem != null) {
                return trackItem;
            }
            TrackItem trackItem2 = new TrackItem();
            trackItem2.mTaskKey = str;
            this.mTracks.add(trackItem2);
            return trackItem2;
        }

        public TrackItem getTrackItem(String str) {
            if (this.mTracks.size() > 0) {
                for (int i = 0; i < this.mTracks.size(); i++) {
                    TrackItem trackItem = this.mTracks.get(i);
                    if (trackItem.mTaskKey.equals(str)) {
                        return trackItem;
                    }
                }
            }
            return null;
        }

        /* access modifiers changed from: private */
        public class MyFetcherListener implements VideoInfoFetcher.FetcherListener {
            private final WeakReference<DataLoaderTaskItem> mTaskItemRef;

            @Override // com.ss.ttvideoengine.fetcher.VideoInfoFetcher.FetcherListener
            public void onLog(String str) {
            }

            @Override // com.ss.ttvideoengine.fetcher.VideoInfoFetcher.FetcherListener
            public void onRetry(Error error) {
            }

            public MyFetcherListener(DataLoaderTaskItem dataLoaderTaskItem) {
                this.mTaskItemRef = new WeakReference<>(dataLoaderTaskItem);
            }

            @Override // com.ss.ttvideoengine.fetcher.VideoInfoFetcher.FetcherListener
            public void onCompletion(VideoModel videoModel, Error error) {
                DataLoaderTaskItem dataLoaderTaskItem = this.mTaskItemRef.get();
                if (dataLoaderTaskItem != null) {
                    dataLoaderTaskItem.mResponseData = videoModel;
                    dataLoaderTaskItem.mResponseError = error;
                    if (dataLoaderTaskItem.mListener != null) {
                        dataLoaderTaskItem.mListener.taskFinished(dataLoaderTaskItem);
                    }
                }
            }

            @Override // com.ss.ttvideoengine.fetcher.VideoInfoFetcher.FetcherListener
            public void onStatusException(int i, String str) {
                DataLoaderTaskItem dataLoaderTaskItem = this.mTaskItemRef.get();
                if (dataLoaderTaskItem != null) {
                    if (!(i == 0 || i == 10)) {
                        dataLoaderTaskItem.mResponseError = new Error("kTTVideoErrorDomainFetchingInfo", -7996);
                    }
                    if (dataLoaderTaskItem.mListener != null) {
                        dataLoaderTaskItem.mListener.taskFinished(dataLoaderTaskItem);
                    }
                }
            }
        }

        public void setUp(String str, Resolution resolution, long j) {
            if (this.mTracks.size() == 0) {
                TrackItem trackItem = new TrackItem();
                trackItem.mTaskKey = str;
                trackItem.mUsingResolution = resolution;
                trackItem.mPreSize = j;
                this.mTracks.add(trackItem);
            } else {
                TTVideoEngineLog.m256503e("DataLoaderHelper", "[preload] DataLoaderTaskItem setup fail");
            }
            this.mSetResolution = resolution;
            this.mPreloadSize = j;
        }
    }

    public class DataLoaderTaskLoadProgress {
        public List<CacheInfo> mCacheInfos;
        protected boolean mSeparateAudioVideo;
        public int mTaskType;
        public String mVideoId;

        public class CacheInfo {
            public List<CacheRange> mCacheRanges;
            public Error mError;
            public String mKey;
            public String mLocalFilePath;
            public long mMediaSize;
            public long mPreloadSize;
            public Resolution mResolution = Resolution.Undefine;

            public long getCacheSize() {
                List<CacheRange> list = this.mCacheRanges;
                if (list == null || list.size() <= 0) {
                    return 0;
                }
                List<CacheRange> list2 = this.mCacheRanges;
                return list2.get(list2.size() - 1).mSize;
            }

            public boolean finished() {
                long j;
                long j2 = this.mPreloadSize;
                if (j2 > 0) {
                    j = Math.min(j2, this.mMediaSize);
                } else {
                    j = this.mMediaSize;
                }
                CacheRange cacheRange = null;
                List<CacheRange> list = this.mCacheRanges;
                if (list != null) {
                    cacheRange = list.get(list.size() - 1);
                }
                if (this.mError != null) {
                    return true;
                }
                if (cacheRange == null || this.mMediaSize <= 0 || cacheRange.mOffset + cacheRange.mSize < j) {
                    return false;
                }
                return true;
            }

            public class CacheRange {
                public long mOffset;
                public long mSize;

                public CacheRange() {
                }
            }

            public CacheInfo() {
            }

            /* access modifiers changed from: package-private */
            public void setCacheSize(long j) {
                if (this.mCacheRanges == null) {
                    this.mCacheRanges = new ArrayList();
                }
                if (this.mCacheRanges.size() == 0) {
                    this.mCacheRanges.add(new CacheRange());
                }
                this.mCacheRanges.get(0).mOffset = 0;
                this.mCacheRanges.get(0).mSize = j;
            }
        }

        public long getTotalCacheSize() {
            long j = 0;
            if (this.mCacheInfos != null) {
                for (int i = 0; i < this.mCacheInfos.size(); i++) {
                    j += this.mCacheInfos.get(i).getCacheSize();
                }
            }
            return j;
        }

        public boolean isPreloadComplete() {
            if (this.mTaskType != 2) {
                TTVideoEngineLog.m256500d("DataLoaderHelper", "task is not a preload task");
                return false;
            }
            if (this.mCacheInfos != null) {
                for (int i = 0; i < this.mCacheInfos.size(); i++) {
                    CacheInfo cacheInfo = this.mCacheInfos.get(i);
                    if (!(cacheInfo == null || cacheInfo.finished())) {
                        return false;
                    }
                }
            }
            return true;
        }

        public boolean isCacheEnd() {
            int i;
            boolean z;
            if (this.mCacheInfos != null) {
                z = true;
                i = 0;
                for (int i2 = 0; i2 < this.mCacheInfos.size(); i2++) {
                    CacheInfo cacheInfo = this.mCacheInfos.get(i2);
                    if (cacheInfo == null || cacheInfo.finished()) {
                        i++;
                    } else {
                        z = false;
                    }
                }
            } else {
                z = true;
                i = 0;
            }
            if (!this.mSeparateAudioVideo) {
                if (z || (i >= 1 && this.mTaskType == 1)) {
                    return true;
                }
                return false;
            } else if (z || (i >= 2 && this.mTaskType == 1)) {
                return true;
            } else {
                return false;
            }
        }

        public DataLoaderTaskLoadProgress() {
        }

        private CacheInfo getCacheInfo(String str) {
            List<CacheInfo> list;
            if (!TextUtils.isEmpty(str) && (list = this.mCacheInfos) != null) {
                for (CacheInfo cacheInfo : list) {
                    if (cacheInfo.mKey.equals(str)) {
                        return cacheInfo;
                    }
                }
            }
            return null;
        }

        public void setUp(DataLoaderTaskItem dataLoaderTaskItem) {
            this.mVideoId = dataLoaderTaskItem.mVideoId;
            if (this.mCacheInfos == null) {
                this.mCacheInfos = new ArrayList();
            }
            Iterator<DataLoaderTaskItem.TrackItem> it = dataLoaderTaskItem.mTracks.iterator();
            int i = 0;
            int i2 = 0;
            while (true) {
                boolean z = true;
                if (!it.hasNext()) {
                    break;
                }
                DataLoaderTaskItem.TrackItem next = it.next();
                CacheInfo cacheInfo = getCacheInfo(next.mTaskKey);
                if (cacheInfo == null) {
                    cacheInfo = new CacheInfo();
                    z = false;
                }
                cacheInfo.mKey = next.mTaskKey;
                cacheInfo.mMediaSize = next.mMediaSize;
                cacheInfo.mResolution = next.mUsingResolution;
                cacheInfo.setCacheSize(next.mCacheSize);
                cacheInfo.mLocalFilePath = next.mLocalFilePath;
                cacheInfo.mPreloadSize = next.mPreSize;
                if (next.mVideoInfo != null) {
                    if (next.mVideoInfo.getMediatype() == VideoRef.TYPE_VIDEO) {
                        i2++;
                    } else if (next.mVideoInfo.getMediatype() == VideoRef.TYPE_AUDIO) {
                        i++;
                    }
                }
                if (!z) {
                    this.mCacheInfos.add(cacheInfo);
                }
            }
            if (i > 0 && i2 > 0) {
                this.mSeparateAudioVideo = true;
            }
        }

        public void onError(String str, Error error) {
            CacheInfo cacheInfo = getCacheInfo(str);
            if (cacheInfo != null) {
                cacheInfo.mError = error;
            }
        }
    }

    /* access modifiers changed from: private */
    public class DataLoaderTaskQueue {
        private final ReentrantLock mLock;
        private long mMaxCount;
        private final ArrayList<DataLoaderTaskItem> mTaskItems;

        public long count() {
            this.mLock.lock();
            long size = (long) this.mTaskItems.size();
            this.mLock.unlock();
            return size;
        }

        public void removeAll() {
            try {
                this.mLock.lock();
                this.mTaskItems.clear();
            } finally {
                this.mLock.unlock();
            }
        }

        public ArrayList<DataLoaderTaskItem> toArray() {
            try {
                this.mLock.lock();
                ArrayList<DataLoaderTaskItem> arrayList = new ArrayList<>();
                arrayList.addAll(this.mTaskItems);
                return arrayList;
            } finally {
                this.mLock.unlock();
            }
        }

        private Boolean _enoughItems() {
            boolean z = false;
            if (this.mMaxCount < 1) {
                return false;
            }
            if (((long) this.mTaskItems.size()) >= this.mMaxCount) {
                z = true;
            }
            return Boolean.valueOf(z);
        }

        public DataLoaderTaskItem backItem() {
            this.mLock.lock();
            if (this.mTaskItems.size() == 0) {
                this.mLock.unlock();
                return null;
            }
            ArrayList<DataLoaderTaskItem> arrayList = this.mTaskItems;
            DataLoaderTaskItem dataLoaderTaskItem = arrayList.get(arrayList.size() - 1);
            this.mLock.unlock();
            return dataLoaderTaskItem;
        }

        public DataLoaderTaskItem frontItem() {
            this.mLock.lock();
            if (this.mTaskItems.size() == 0) {
                this.mLock.unlock();
                return null;
            }
            DataLoaderTaskItem dataLoaderTaskItem = this.mTaskItems.get(0);
            this.mLock.unlock();
            return dataLoaderTaskItem;
        }

        public DataLoaderTaskItem popBackItem() {
            this.mLock.lock();
            if (this.mTaskItems.size() == 0) {
                this.mLock.unlock();
                return null;
            }
            ArrayList<DataLoaderTaskItem> arrayList = this.mTaskItems;
            DataLoaderTaskItem dataLoaderTaskItem = arrayList.get(arrayList.size() - 1);
            this.mTaskItems.remove(dataLoaderTaskItem);
            this.mLock.unlock();
            return dataLoaderTaskItem;
        }

        public DataLoaderTaskItem popFrontItem() {
            this.mLock.lock();
            if (this.mTaskItems.size() == 0) {
                this.mLock.unlock();
                return null;
            }
            DataLoaderTaskItem dataLoaderTaskItem = this.mTaskItems.get(0);
            this.mTaskItems.remove(dataLoaderTaskItem);
            this.mLock.unlock();
            return dataLoaderTaskItem;
        }

        public void setMaxCount(long j) {
            this.mMaxCount = j;
        }

        private DataLoaderTaskQueue() {
            this.mLock = new ReentrantLock();
            this.mTaskItems = new ArrayList<>();
            this.mMaxCount = 0;
        }

        public boolean containItem(String str) {
            int i = 0;
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            Boolean bool = false;
            this.mLock.lock();
            while (true) {
                if (i >= this.mTaskItems.size()) {
                    break;
                } else if (this.mTaskItems.get(i).getTrackItem(str) != null) {
                    bool = true;
                    break;
                } else {
                    i++;
                }
            }
            this.mLock.unlock();
            return bool.booleanValue();
        }

        /* access modifiers changed from: package-private */
        public boolean enqueueItem(DataLoaderTaskItem dataLoaderTaskItem) {
            Boolean bool;
            if (dataLoaderTaskItem == null || dataLoaderTaskItem.mTracks.size() == 0) {
                return false;
            }
            Boolean.valueOf(false);
            this.mLock.lock();
            if (_enoughItems().booleanValue()) {
                bool = false;
            } else {
                this.mTaskItems.add(dataLoaderTaskItem);
                bool = true;
            }
            this.mLock.unlock();
            return bool.booleanValue();
        }

        public DataLoaderTaskItem itemForKey(String str) {
            DataLoaderTaskItem dataLoaderTaskItem = null;
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            this.mLock.lock();
            int i = 0;
            while (true) {
                if (i >= this.mTaskItems.size()) {
                    break;
                }
                DataLoaderTaskItem dataLoaderTaskItem2 = this.mTaskItems.get(i);
                if (dataLoaderTaskItem2.getTrackItem(str) != null) {
                    dataLoaderTaskItem = dataLoaderTaskItem2;
                    break;
                }
                i++;
            }
            this.mLock.unlock();
            return dataLoaderTaskItem;
        }

        public DataLoaderTaskItem itemForVideoId(String str) {
            DataLoaderTaskItem dataLoaderTaskItem = null;
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            this.mLock.lock();
            int i = 0;
            while (true) {
                if (i >= this.mTaskItems.size()) {
                    break;
                }
                DataLoaderTaskItem dataLoaderTaskItem2 = this.mTaskItems.get(i);
                if (!TextUtils.isEmpty(dataLoaderTaskItem2.mVideoId) && dataLoaderTaskItem2.mVideoId.equals(str)) {
                    dataLoaderTaskItem = dataLoaderTaskItem2;
                    break;
                }
                i++;
            }
            this.mLock.unlock();
            return dataLoaderTaskItem;
        }

        /* JADX WARNING: Removed duplicated region for block: B:9:0x001e  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.ss.ttvideoengine.DataLoaderHelper.DataLoaderTaskItem popItem(com.ss.ttvideoengine.DataLoaderHelper.DataLoaderTaskItem r3) {
            /*
                r2 = this;
                java.lang.String r0 = r3.mVideoId
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                if (r0 != 0) goto L_0x0011
                java.lang.String r0 = r3.mVideoId
                com.ss.ttvideoengine.DataLoaderHelper$DataLoaderTaskItem r0 = r2.popItemForVideoId(r0)
                if (r0 == 0) goto L_0x0012
                return r0
            L_0x0011:
                r0 = 0
            L_0x0012:
                java.util.List<com.ss.ttvideoengine.DataLoaderHelper$DataLoaderTaskItem$TrackItem> r3 = r3.mTracks
                java.util.Iterator r3 = r3.iterator()
            L_0x0018:
                boolean r1 = r3.hasNext()
                if (r1 == 0) goto L_0x002c
                java.lang.Object r0 = r3.next()
                com.ss.ttvideoengine.DataLoaderHelper$DataLoaderTaskItem$TrackItem r0 = (com.ss.ttvideoengine.DataLoaderHelper.DataLoaderTaskItem.TrackItem) r0
                java.lang.String r0 = r0.mTaskKey
                com.ss.ttvideoengine.DataLoaderHelper$DataLoaderTaskItem r0 = r2.popItem(r0)
                if (r0 == 0) goto L_0x0018
            L_0x002c:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.ttvideoengine.DataLoaderHelper.DataLoaderTaskQueue.popItem(com.ss.ttvideoengine.DataLoaderHelper$DataLoaderTaskItem):com.ss.ttvideoengine.DataLoaderHelper$DataLoaderTaskItem");
        }

        public DataLoaderTaskItem popItemForVideoId(String str) {
            DataLoaderTaskItem dataLoaderTaskItem = null;
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            this.mLock.lock();
            int i = 0;
            while (true) {
                if (i >= this.mTaskItems.size()) {
                    break;
                }
                DataLoaderTaskItem dataLoaderTaskItem2 = this.mTaskItems.get(i);
                if (!TextUtils.isEmpty(dataLoaderTaskItem2.mVideoId) && dataLoaderTaskItem2.mVideoId.equals(str)) {
                    dataLoaderTaskItem = dataLoaderTaskItem2;
                    break;
                }
                i++;
            }
            if (dataLoaderTaskItem != null) {
                this.mTaskItems.remove(dataLoaderTaskItem);
            }
            this.mLock.unlock();
            return dataLoaderTaskItem;
        }

        public DataLoaderTaskItem popItem(String str) {
            DataLoaderTaskItem dataLoaderTaskItem = null;
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            this.mLock.lock();
            int i = 0;
            while (true) {
                if (i >= this.mTaskItems.size()) {
                    break;
                }
                DataLoaderTaskItem dataLoaderTaskItem2 = this.mTaskItems.get(i);
                if (dataLoaderTaskItem2.getTrackItem(str) != null) {
                    dataLoaderTaskItem = dataLoaderTaskItem2;
                    break;
                }
                i++;
            }
            if (dataLoaderTaskItem != null) {
                this.mTaskItems.remove(dataLoaderTaskItem);
            }
            this.mLock.unlock();
            return dataLoaderTaskItem;
        }
    }

    public long getPreloadTaskCount() {
        return this.mExecuteTasks.count() + this.mAllPreloadTasks.count() + this.mPreloadTasks.count();
    }

    public boolean isNeedPlayInfo() {
        if (this.mEnableBufferPreload > 0 && this.mPreloadUtil.mPlayBufferLowerBound > 0 && this.mPreloadUtil.mPlayBufferUpperBound > 0) {
            return true;
        }
        return false;
    }

    public boolean isReportLogEnable() {
        this.mLock.lock();
        try {
            return this.mReportLogEnable;
        } finally {
            this.mLock.unlock();
        }
    }

    public boolean isRunning() {
        boolean z;
        this.mLock.lock();
        try {
            if (this.mState == 0) {
                z = true;
            } else {
                z = false;
            }
            return z;
        } finally {
            this.mLock.unlock();
        }
    }

    public void resumeFileWriteIO() {
        if (this.mState == 0) {
            this.mLock.lock();
            try {
                AVMDLDataLoader aVMDLDataLoader = this.mInnerDataLoader;
                if (aVMDLDataLoader != null) {
                    aVMDLDataLoader.resumeFileWriteIO();
                }
            } finally {
                this.mLock.unlock();
            }
        }
    }

    /* access modifiers changed from: private */
    public static class PreloadMediaThread {
        private Handler mHandler;
        private HandlerThread mHandlerThread;

        public static HandlerThread new_android_os_HandlerThread_by_knot(String str) {
            return C20341a.m74147a() ? C20339a.m74145a(str, 0, C20341a.f49621b) : new HandlerThread(str);
        }

        public PreloadMediaThread() {
            try {
                HandlerThread new_android_os_HandlerThread_by_knot = new_android_os_HandlerThread_by_knot("vclould.engine.preload.media");
                this.mHandlerThread = new_android_os_HandlerThread_by_knot;
                new_android_os_HandlerThread_by_knot.start();
                this.mHandler = new Handler(this.mHandlerThread.getLooper()) {
                    /* class com.ss.ttvideoengine.DataLoaderHelper.PreloadMediaThread.HandlerC654231 */

                    public void handleMessage(Message message) {
                        if (message != null) {
                            try {
                                if (!(message.obj instanceof ArrayList)) {
                                    TTVideoEngineLog.m256500d("DataLoaderHelper", "[preload] obj should instance of ArrayList");
                                    return;
                                }
                                ArrayList arrayList = (ArrayList) message.obj;
                                if (arrayList == null) {
                                    TTVideoEngineLog.m256500d("DataLoaderHelper", "[preload] obj should instance of ArrayList");
                                    return;
                                }
                                DataLoaderHelper dataLoaderHelper = (DataLoaderHelper) arrayList.get(0);
                                switch (message.what) {
                                    case SmEvents.EVENT_NT:
                                        if (arrayList.size() == 3) {
                                            PreloadModelMedia preloadModelMedia = (PreloadModelMedia) arrayList.get(1);
                                            String str = (String) arrayList.get(2);
                                            if (dataLoaderHelper != null) {
                                                dataLoaderHelper._doMl_addMedia(preloadModelMedia, str);
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    case SmEvents.EVENT_NE_RR:
                                        if (arrayList.size() == 3) {
                                            String str2 = (String) arrayList.get(1);
                                            String str3 = (String) arrayList.get(2);
                                            if (dataLoaderHelper != null) {
                                                dataLoaderHelper._doMl_removeMedia(str2, str3);
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    case SmEvents.EVENT_RE:
                                        if (arrayList.size() == 3) {
                                            String str4 = (String) arrayList.get(1);
                                            int intValue = ((Integer) arrayList.get(2)).intValue();
                                            if (dataLoaderHelper != null) {
                                                dataLoaderHelper._doMl_removeAllMedias(str4, intValue);
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    case SmEvents.EVENT_TO:
                                        if (arrayList.size() == 3) {
                                            String str5 = (String) arrayList.get(1);
                                            int intValue2 = ((Integer) arrayList.get(2)).intValue();
                                            if (dataLoaderHelper != null) {
                                                StrategyHelper.helper().getCenter().mo70645b(str5, intValue2);
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    default:
                                        return;
                                }
                            } catch (Throwable th) {
                                TTVideoEngineLog.m256501d(th);
                            }
                        }
                    }
                };
            } catch (Throwable th) {
                TTVideoEngineLog.m256501d(th);
                this.mHandlerThread = null;
                this.mHandler = null;
            }
        }

        public void postMessage(ArrayList<Object> arrayList, int i) {
            if (this.mHandler != null && this.mHandlerThread != null) {
                Message obtain = Message.obtain();
                obtain.what = i;
                obtain.obj = arrayList;
                this.mHandler.sendMessage(obtain);
            }
        }
    }

    private void _tryToSetDefaultCacheDir() {
        if (this.mContext != null && TextUtils.isEmpty(this.mConfigure.mCacheDir)) {
            String str = TTHelper.getAppFilesPath(this.mContext) + File.separator + "mdlcache";
            File file = new File(str);
            if (!file.exists()) {
                file.mkdir();
            }
            this.mConfigure.mCacheDir = str;
        }
    }

    public void cancelAllTasks() {
        if (this.mInnerDataLoader == null || this.mState != 0) {
            TTVideoEngineLog.m256503e("DataLoaderHelper", "need start mdl first");
            return;
        }
        this.mLock.lock();
        try {
            cancelAllTasksInternal();
        } catch (Throwable th) {
            this.mLock.unlock();
            throw th;
        }
        this.mLock.unlock();
    }

    public void clearAllCaches() {
        if (this.mState == 0) {
            this.mLock.lock();
            try {
                AVMDLDataLoader aVMDLDataLoader = this.mInnerDataLoader;
                if (aVMDLDataLoader == null) {
                    TTVideoEngineLog.m256503e("DataLoaderHelper", "mInnerDataLoader == null");
                    this.mLock.unlock();
                    return;
                }
                aVMDLDataLoader.clearAllCaches();
                this.mLock.unlock();
            } catch (Throwable th) {
                this.mLock.unlock();
                throw th;
            }
        }
    }

    public void clearNetinfoCache() {
        this.mLock.lock();
        try {
            AVMDLDataLoader aVMDLDataLoader = this.mInnerDataLoader;
            if (aVMDLDataLoader == null) {
                this.mLock.unlock();
                return;
            }
            aVMDLDataLoader.clearNetinfoCache();
            this.mLock.unlock();
        } catch (Throwable th) {
            this.mLock.unlock();
            throw th;
        }
    }

    public long getAllCacheSize() {
        long j = 0;
        if (this.mState != 0) {
            return 0;
        }
        if (this.mLock.tryLock()) {
            try {
                if (this.mInnerDataLoader == null) {
                    TTVideoEngineLog.m256503e("DataLoaderHelper", "mInnerDataLoader == null");
                }
                j = this.mInnerDataLoader.getAllCacheSize();
            } catch (Throwable th) {
                this.mLock.unlock();
                throw th;
            }
            this.mLock.unlock();
        }
        return j;
    }

    private void dumpLibMd5() {
        String str;
        if (this.mEnableDumpLibMd5 == 1 && this.mContext != null) {
            try {
                str = this.mContext.getApplicationInfo().dataDir + "/lib";
            } catch (Exception unused) {
                str = null;
            }
            if (str != null) {
                String fileMd5 = TTHelper.getFileMd5(new File(str + File.separatorChar + "libavmdl.so"));
                if (fileMd5 != null) {
                    TTVideoEngineLog.m256503e("DataLoaderHelper", "libavmdl md5: " + fileMd5);
                }
            }
        }
    }

    private boolean loadLibrary() {
        if (this.mProxy == null) {
            return true;
        }
        dumpLibMd5();
        if (this.mProxy != null && !this.isProxyLibraryLoaded) {
            if (this.mEnableMdlV2 == 1) {
                try {
                    this.mProxy.loadLibrary("avmdlbase");
                    this.isProxyLibraryLoaded = this.mProxy.loadLibrary("avmdlv2");
                } catch (Exception unused) {
                    this.isProxyLibraryLoaded = false;
                }
            }
            TTVideoEngineLog.m256500d("DataLoaderHelper", "try to load avmdl: " + this.isProxyLibraryLoaded);
            if (!this.isProxyLibraryLoaded) {
                this.isProxyLibraryLoaded = this.mProxy.loadLibrary("avmdl");
            }
        }
        return this.isProxyLibraryLoaded;
    }

    public void cancelAllWaitReqs() {
        TTVideoEngineLog.m256500d("DataLoaderHelper", "start do cancel all wait reqs");
        if (this.mInnerDataLoader == null || this.mState != 0) {
            TTVideoEngineLog.m256503e("DataLoaderHelper", "need start mdl first");
            return;
        }
        this.mLock.lock();
        try {
            this.mInnerDataLoader.cancelAllPreloadWaitReqs();
        } catch (Throwable th) {
            this.mLock.unlock();
            throw th;
        }
        this.mLock.unlock();
    }

    public void close() {
        this.mLock.lock();
        try {
            if (this.mState == 1) {
                TTVideoEngineLog.m256503e("DataLoaderHelper", "DataLoader not started, not need close");
                return;
            }
            this.mListener = null;
            this.mInnerDataLoader.close();
            cancelAllTasksInternal();
            removeAllPreloadMedia(null, 1);
            this.mState = 1;
            TTNetWorkListener.getInstance().stopListen(this.mNetWorkChangeCbr);
            TTNetWorkListener.getInstance().unregisterListener(this.mContext);
            this.mLock.unlock();
        } finally {
            this.mLock.unlock();
        }
    }

    @Override // com.ss.mediakit.medialoader.AVMDLStartCompleteListener
    public void onStartComplete() {
        TTVideoEngineLog.m256500d("DataLoaderHelper", "MediaDataLoader start complete");
        SettingsHelper.helper().config().load(SettingsHelper.MODULE_MDL);
        int currentAccessType = TTNetWorkListener.getInstance().getCurrentAccessType();
        this.mCurrentAccessType = currentAccessType;
        AVMDLDataLoader aVMDLDataLoader = this.mInnerDataLoader;
        if (aVMDLDataLoader != null) {
            aVMDLDataLoader.setIntValue(7219, currentAccessType);
            if (!StrategyHelper.helper().isRunning()) {
                TTVideoEngineLog.m256500d("DataLoaderHelper", "strategy center running failed, set mdl preload strategy back " + this.mMdlOldPreloadStrategy);
                this.mInnerDataLoader.setIntValue(1030, this.mMdlOldPreloadStrategy);
            }
        }
    }

    private DataLoaderHelper() {
        this.mState = 1;
        this.mPreloadTasks = new DataLoaderTaskQueue();
        this.mExecuteTasks = new DataLoaderTaskQueue();
        this.mAllPreloadTasks = new DataLoaderTaskQueue();
        this.mAllPlayTasks = new DataLoaderTaskQueue();
        this.mAllUsingEngies = new HashMap<>();
        this.mEngineLock = new ReentrantLock();
        this.mInnerDataLoader = null;
        this.mConfigure = null;
        this.mContext = null;
        this.mModelCache = null;
        this.mException = null;
        this.mVersionInfo = null;
        this.mHeartBeat = null;
        this.mUploader = null;
        this.mEngineUploader = null;
        this.mNeedDLLoadP2PLib = 0;
        this.mMdlProtocolHandle = -1;
        this.mInvalidMdlProcotol = true;
        this.mMdlDataSourceId = 0;
        this.mEnableMdlProtocol = false;
        this.mLock = new ReentrantLock();
        this.mHeartBeatInterval = 0;
        this.mEnableReportSpeed = 0;
        this.mEnableNetworkChangedListen = 0;
        this.mNetWorkChangeCb = null;
        this.mNetWorkChangeCbr = null;
        this.mCurrentAccessType = -1;
        this.mEnableDumpLibMd5 = 0;
        this.mNeedSpeedTestByTimeInternal = 0;
        this.mAudioPreloadFirst = false;
        this.mPreloadTaskIgnorePlayerStall = 1;
        this.mUpdatePlaySourceId = null;
        this.mFloatSize = 0;
        this.mPreloadPreConnect = 0;
        this.mEnablePreParseHost = 0;
        this.mEnableBackupIP = 0;
        this.mEnableHls = 0;
        this.mSupporHls = false;
        this.mediaOperateThread = null;
        this.mReportLogEnable = true;
        this.mBackupLoaderType = 0;
        this.mMdlPreloadStrategy = 0;
        this.mMdlOldPreloadStrategy = 0;
        this.mEnableMdlV2 = 0;
        this.mEnableBufferPreload = 0;
        this.mEnableSplitPreload = 0;
        this.mPreloadUtil = new PreloadUtil();
        this.mModelCache = VideoModelCache.getInstance();
        this.mState = 1;
        this.mConfigure = AVMDLDataLoaderConfigure.getDefaultonfigure();
    }

    private boolean initInternal() {
        boolean z;
        boolean z2;
        boolean z3;
        if (this.mInnerDataLoader != null) {
            return true;
        }
        if (!loadLibrary()) {
            TTVideoEngineLog.m256503e("DataLoaderHelper", String.format("library load fail", new Object[0]));
            return false;
        }
        if (this.mProxy == null && this.mEnableMdlV2 == 1 && this.mListener != null) {
            TTVideoEngineLog.m256500d("DataLoaderHelper", "try to load mdlv2");
            AVMDLDataLoader.loadAVMDLBaseLibrary();
            z = this.mListener.loadLibrary("avmdlv2");
            TTVideoEngineLog.m256500d("DataLoaderHelper", "load mdlv2: " + z);
        } else {
            z = false;
        }
        if (!z) {
            if (this.mProxy != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (this.mNeedDLLoadP2PLib != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (AVMDLDataLoader.init(z2, z3) != 0) {
                TTVideoEngineLog.m256503e("DataLoaderHelper", String.format("library has not been loaded", new Object[0]));
                return false;
            }
            TTVideoEngineLog.m256503e("P2PLIB", String.format("loadertype:%d NeedDLLoadP2PLib:%d, liveloaderType: %d", Integer.valueOf(this.mConfigure.mLoaderType), Integer.valueOf(this.mNeedDLLoadP2PLib), Integer.valueOf(this.mConfigure.mLiveLoaderType)));
            if (this.mNeedDLLoadP2PLib == 0 && ((this.mConfigure.mLoaderType > 0 || (this.mConfigure.mLiveLoaderType != 10000 && this.mConfigure.mLiveLoaderType >= 7)) && this.mListener != null)) {
                TTVideoEngineLog.m256503e("P2PLIB", "try to load p2p lib");
                TTVideoEngineLog.m256503e("P2PLIB", String.format("load p2p lib result:%d", Integer.valueOf(this.mListener.loadLibrary("avmdlp2p") ? 1 : 0)));
            }
        }
        try {
            AVMDLDataLoader instance = AVMDLDataLoader.getInstance();
            this.mInnerDataLoader = instance;
            instance.setConfigure(this.mConfigure);
            this.mInnerDataLoader.setListener(this);
            this.mInnerDataLoader.setStartCompleteListener(this);
            this.mHeartBeat = new DataLoaderHeartBeat();
            return true;
        } catch (Exception e) {
            TTVideoEngineLog.m256501d(e);
            return false;
        }
    }

    public void cancelAllTasksInternal() {
        ArrayList arrayList = new ArrayList();
        if (this.mExecuteTasks.count() > 0) {
            while (true) {
                DataLoaderTaskItem popBackItem = this.mExecuteTasks.popBackItem();
                if (popBackItem == null) {
                    break;
                } else if (popBackItem.mPriorityLevel >= 10000) {
                    arrayList.add(popBackItem);
                } else {
                    if (popBackItem.mFetcher != null) {
                        popBackItem.mFetcher.cancel();
                    }
                    _notifyPreloadCancel(popBackItem);
                }
            }
            for (int i = 0; i < arrayList.size(); i++) {
                this.mExecuteTasks.enqueueItem((DataLoaderTaskItem) arrayList.get(i));
            }
            arrayList.clear();
        }
        if (this.mPreloadTasks.count() > 0) {
            while (true) {
                DataLoaderTaskItem popBackItem2 = this.mPreloadTasks.popBackItem();
                if (popBackItem2 == null) {
                    break;
                } else if (popBackItem2.mPriorityLevel >= 10000) {
                    arrayList.add(popBackItem2);
                } else {
                    if (popBackItem2.mFetcher != null) {
                        popBackItem2.mFetcher.cancel();
                    }
                    _notifyPreloadCancel(popBackItem2);
                }
            }
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                this.mPreloadTasks.enqueueItem((DataLoaderTaskItem) arrayList.get(i2));
            }
            arrayList.clear();
        }
        if (this.mAllPreloadTasks.count() > 0) {
            boolean z = false;
            while (true) {
                DataLoaderTaskItem popBackItem3 = this.mAllPreloadTasks.popBackItem();
                if (popBackItem3 == null) {
                    break;
                } else if (popBackItem3.mPriorityLevel >= 10000) {
                    arrayList.add(popBackItem3);
                } else {
                    _notifyPreloadCancel(popBackItem3);
                    z = true;
                }
            }
            if (z) {
                this.mInnerDataLoader.cancelAll();
            }
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                this.mAllPreloadTasks.enqueueItem((DataLoaderTaskItem) arrayList.get(i3));
            }
            arrayList.clear();
        }
    }

    public void tryStartStrategyCenter() {
        if (this.mConfigure.mEnableIOManager != 0) {
            long longValue = this.mInnerDataLoader.getLongValue(7390);
            long longValue2 = this.mInnerDataLoader.getLongValue(7402);
            if (longValue > 0 && longValue2 >= 0) {
                this.mediaOperateThread = new PreloadMediaThread();
                StrategyHelper.helper().setIOManager(longValue, longValue2);
                StrategyHelper.helper().setContext(this.mContext);
                boolean z = false;
                if (this.mProxy != null) {
                    z = this.mProxy.loadLibrary("preload");
                }
                StrategyHelper.helper().start(!z);
                StrategyHelper.helper().configAppInfo(AppInfo.toJsonString(), null);
                if (!this.mInnerDataLoader.isRunning()) {
                    return;
                }
                if (!StrategyHelper.helper().isRunning()) {
                    TTVideoEngineLog.m256500d("DataLoaderHelper", "strategy center start failed, set mdl preload strategy back " + this.mMdlOldPreloadStrategy);
                    this.mInnerDataLoader.setIntValue(1030, this.mMdlOldPreloadStrategy);
                    return;
                }
                this.mInnerDataLoader.setIntValue(1030, this.mMdlPreloadStrategy);
            }
        }
    }

    private void _startExecuteTask() {
        String str;
        String str2;
        VideoModelCache.VideoModelCacheInfo videoModelCacheInfo;
        if (this.mInnerDataLoader == null) {
            TTVideoEngineLog.m256503e("DataLoaderHelper", "[preload] need load mdl first.");
            return;
        }
        DataLoaderTaskItem backItem = this.mPreloadTasks.backItem();
        if (backItem != null && this.mExecuteTasks.enqueueItem(backItem)) {
            this.mPreloadTasks.popBackItem();
            if (backItem.mResponseData == null && backItem.mURLItem == null) {
                backItem.removeVidPlaceholderTrack();
                HashMap hashMap = new HashMap();
                if (backItem.mVidItem != null && backItem.mVidItem.mCodecType.equals("bytevc2")) {
                    hashMap.put("codec_type", "4");
                } else if (backItem.mVidItem != null && backItem.mVidItem.mCodecType.equals("bytevc1")) {
                    hashMap.put("codec_type", "3");
                }
                if (backItem.mVidItem != null && backItem.mVidItem.mDashEnable) {
                    hashMap.put("format_type", "dash");
                }
                if (backItem.mVidItem != null && backItem.mVidItem.mHttpsEnable) {
                    hashMap.put("ssl", "1");
                }
                String str3 = null;
                if (backItem.mVidItem == null || backItem.mVidItem.mListener == null) {
                    str2 = null;
                    str = null;
                } else {
                    str2 = backItem.mVidItem.mListener.apiString(hashMap, backItem.mVideoId, backItem.mVidItem.mApiVersion);
                    str = backItem.mVidItem.mListener.authString(backItem.mVideoId, backItem.mVidItem.mApiVersion);
                    if (backItem.mVidItem.mBoeEnable) {
                        str2 = TTHelper.buildBoeUrl(str2);
                    }
                    backItem.mApiString = str2;
                }
                if (this.mListener != null && TextUtils.isEmpty(backItem.mApiString)) {
                    String apiStringForFetchVideoModel = this.mListener.apiStringForFetchVideoModel(hashMap, backItem.mVideoId, backItem.mSetResolution);
                    str = this.mListener.authStringForFetchVideoModel(backItem.mVideoId, backItem.mSetResolution);
                    if (backItem.mVidItem.mBoeEnable) {
                        apiStringForFetchVideoModel = TTHelper.buildBoeUrl(apiStringForFetchVideoModel);
                    }
                    str2 = apiStringForFetchVideoModel;
                    backItem.mApiString = TTVideoEngineUtils.BuildHttpsApi(str2);
                }
                int networkScore = TTNetWorkListener.MyNetworkQualityHelper.getInstance().getNetworkScore();
                if (networkScore != -1) {
                    str2 = str2 + String.format("&%s=%s", "network_score", Integer.valueOf(networkScore));
                    backItem.mApiString = TTVideoEngineUtils.BuildHttpsApi(str2);
                }
                String BuildHttpsApi = TTVideoEngineUtils.BuildHttpsApi(str2);
                synchronized (PreloaderVidItem.class) {
                    videoModelCacheInfo = this.mModelCache.get(backItem.mVideoId, BuildHttpsApi);
                }
                if (videoModelCacheInfo != null && !videoModelCacheInfo.isExpired) {
                    backItem.mResponseData = videoModelCacheInfo.model;
                    TTVideoEngineLog.m256505i("DataLoaderHelper", String.format("[preload] get videoModel , videoId = %s", backItem.mVideoId));
                    _exectTask(backItem);
                } else if (backItem.mVidItem != null) {
                    backItem.mFetcher = new VideoInfoFetcher(this.mContext, backItem.mVidItem.getNetClient());
                    backItem.setFetchListener();
                    backItem.mFetcher.setResolutionMap(backItem.mVidItem.mResolutionMap);
                    backItem.mFetcher.setVideoID(backItem.mVidItem.mVideoId);
                    backItem.mFetcher.setUseVideoModelCache(true);
                    VideoInfoFetcher videoInfoFetcher = backItem.mFetcher;
                    if (!(backItem.mVidItem.mApiVersion == 2 || backItem.mVidItem.mApiVersion == 4)) {
                        str3 = str;
                    }
                    videoInfoFetcher.fetchInfo(BuildHttpsApi, str3, backItem.mVidItem.mApiVersion);
                }
            } else {
                _exectTask(backItem);
            }
        }
    }

    public void start() throws Exception {
        this.mLock.lock();
        try {
            if (this.mState == 0) {
                TTVideoEngineLog.m256503e("DataLoaderHelper", "DataLoader has started not need start");
            } else if (initInternal()) {
                this.mExecuteTasks.setMaxCount(4);
                if (this.mConfigure == null) {
                    this.mConfigure = AVMDLDataLoaderConfigure.getDefaultonfigure();
                }
                JSONObject jSONObject = new JSONObject();
                try {
                    if (!TextUtils.isEmpty(AppInfo.mAppChannel)) {
                        jSONObject.put("app_channel", AppInfo.mAppChannel);
                    }
                    if (!TextUtils.isEmpty(AppInfo.mAppName)) {
                        jSONObject.put("app_name", AppInfo.mAppName);
                    }
                    if (!TextUtils.isEmpty(AppInfo.mDeviceId)) {
                        jSONObject.put("device_id", AppInfo.mDeviceId);
                    }
                    if (!TextUtils.isEmpty(AppInfo.mAppVersion)) {
                        jSONObject.put("app_version", AppInfo.mAppVersion);
                    }
                    if (AppInfo.mAppID >= 0) {
                        jSONObject.put("app_id", AppInfo.mAppID);
                    }
                    if (jSONObject.has("app_id")) {
                        this.mConfigure.mAppInfo = jSONObject.toString();
                    }
                } catch (JSONException e) {
                    TTVideoEngineLog.m256501d(e);
                }
                boolean z = true;
                if (this.mEngineUploader != null) {
                    this.mConfigure.mEnableReportTaskLog = 1;
                }
                changeConfigWithPermission(this.mConfigure);
                this.mInnerDataLoader.setConfigure(this.mConfigure);
                if (this.mInnerDataLoader.start() >= 0) {
                    TTVideoEngineLog.m256505i("DataLoaderHelper", "[preload] preload strategy " + this.mMdlPreloadStrategy);
                    tryStartStrategyCenter();
                    P2PStragetyManager.getInstance().init();
                    long longValue = this.mInnerDataLoader.getLongValue(7218);
                    this.mMdlProtocolHandle = longValue;
                    if (longValue == -1) {
                        this.mInvalidMdlProcotol = true;
                    }
                    if (this.mInnerDataLoader.getLongValue(9407) != 1) {
                        z = false;
                    }
                    this.mSupporHls = z;
                    TTVideoEngineLog.m256505i("DataLoaderHelper", "start: get mdlprotocolHandle: " + this.mMdlProtocolHandle);
                    this.mHeartBeat.start(this.mInnerDataLoader, this.mHeartBeatInterval);
                    this.mState = 0;
                    TTNetWorkListener.getInstance().init(this.mContext);
                    this.mNetWorkChangeCb = new TTNetworkStateCallback() {
                        /* class com.ss.ttvideoengine.DataLoaderHelper.C654211 */

                        @Override // com.ss.ttvideoengine.TTNetworkStateCallback
                        public void onAccessChanged(int i, int i2, int i3) {
                            if (i == 0) {
                                TTVideoEngineLog.m256500d("DataLoaderHelper", "access changed, from: " + i2 + " to: " + i3);
                                DataLoaderHelper.this.mCurrentAccessType = i3;
                                P2PStragetyManager.getInstance().switchNetwork(i2, i3);
                                DataLoaderHelper.this.setIntValue(1000, 1);
                                DataLoaderHelper.this.setIntValue(ExceptionCode.CANCEL, i3);
                            }
                        }
                    };
                    this.mNetWorkChangeCbr = new WeakReference<>(this.mNetWorkChangeCb);
                    TTNetWorkListener.getInstance().startListen(this.mNetWorkChangeCbr);
                    TTVideoEngineLog.m256500d("DataLoaderHelper", "DataLoader start.");
                    this.mLock.unlock();
                    return;
                }
                throw new Exception("start data loader fail");
            } else {
                throw new Exception("init data loader fail");
            }
        } finally {
            this.mLock.unlock();
        }
    }

    public void setUploader(IVideoEventUploader iVideoEventUploader) {
        this.mUploader = iVideoEventUploader;
    }

    public class DataLoaderCacheFileInfo {
        public long mCacheSizeFromZero;
        public String mLocalFilePath;
        public long mMediaSize;

        public DataLoaderCacheFileInfo() {
        }
    }

    public class DataLoaderCacheInfo {
        public long mCacheSizeFromZero;
        public String mLocalFilePath;
        public long mMediaSize;

        public DataLoaderCacheInfo() {
        }
    }

    public void _removePlayTask(String str) {
        this.mAllPlayTasks.popItem(str);
    }

    public long getCacheFileSize(String str) {
        return getCacheSize(str);
    }

    public synchronized void setEngineUploader(VideoEventEngineUploader videoEventEngineUploader) {
        this.mEngineUploader = videoEventEngineUploader;
    }

    public class DataLoaderTaskProgressInfo {
        public long mCacheSizeFromZero;
        public String mDecryptionKey;
        public String mKey;
        public String mLocalFilePath;
        public long mMediaSize;
        public Resolution mResolution = Resolution.Undefine;
        public int mTaskType;
        public VideoInfo mUsingVideoInfo;
        public String mVideoId;

        public DataLoaderTaskProgressInfo() {
        }
    }

    private void changeConfigWithPermission(AVMDLDataLoaderConfigure aVMDLDataLoaderConfigure) {
        if (!FeatureManager.hasPermission("http_dns")) {
            aVMDLDataLoaderConfigure.mEnableExternDNS = 0;
        }
    }

    public void cancelTaskByFilePath(String str) {
        cancelTask(TTHelper.keyFromFilePath(this.mContext, str));
    }

    public void doParseHosts(String[] strArr) {
        if (strArr != null && strArr.length != 0) {
            this.mEnablePreParseHost = 1;
            this.mInnerDataLoader.doParseHosts(strArr);
        }
    }

    public void notifyTriggerPreload(long j) {
        DataLoaderListener dataLoaderListener = this.mListener;
        if (dataLoaderListener != null) {
            dataLoaderListener.onNotify(9, 0, j, "");
        }
    }

    public void setPreloadLogLevel(int i) {
        if (i == 1) {
            i = 1;
        }
        if (i >= 4) {
            i = 3;
        }
        StrategyHelper.helper().setLogLevel(i);
    }

    private void _notifyPreloadCancel(DataLoaderTaskItem dataLoaderTaskItem) {
        if (dataLoaderTaskItem != null && !dataLoaderTaskItem.mDidCanceled) {
            dataLoaderTaskItem.mDidCanceled = true;
            if (dataLoaderTaskItem.getCallBackListener() != null) {
                dataLoaderTaskItem.getCallBackListener().preloadItemInfo(new PreLoaderItemCallBackInfo(5));
            }
        }
    }

    public DataLoaderCacheFileInfo cacheFileInfo(String str) {
        DataLoaderCacheInfo cacheInfo = getCacheInfo(str);
        if (cacheInfo == null) {
            return null;
        }
        DataLoaderCacheFileInfo dataLoaderCacheFileInfo = new DataLoaderCacheFileInfo();
        dataLoaderCacheFileInfo.mMediaSize = cacheInfo.mMediaSize;
        dataLoaderCacheFileInfo.mCacheSizeFromZero = cacheInfo.mCacheSizeFromZero;
        dataLoaderCacheFileInfo.mLocalFilePath = cacheInfo.mLocalFilePath;
        return dataLoaderCacheFileInfo;
    }

    public void copyCache(final CopyCacheItem copyCacheItem) {
        if (copyCacheItem != null) {
            asyncCopyOperation(new AVMDLCopyOperation(copyCacheItem.mFileKey, copyCacheItem.mDestPath, copyCacheItem.mWaitIfCaching, new AVMDLCopyOperationListener() {
                /* class com.ss.ttvideoengine.DataLoaderHelper.C654222 */

                @Override // com.ss.mediakit.medialoader.AVMDLCopyOperationListener
                public void onCopyComplete(boolean z, int i, String str) {
                    if (copyCacheItem.mListener != null) {
                        copyCacheItem.mListener.onCopyComplete(z, i, str);
                    }
                }
            }));
        }
    }

    public void createScene(PreloadScene preloadScene) {
        if (this.mMdlPreloadStrategy == 200) {
            StrategyHelper.helper().getCenter().mo70635a(preloadScene.toJsonString());
        }
    }

    public void destroyScene(String str) {
        if (this.mMdlPreloadStrategy == 200) {
            StrategyHelper.helper().getCenter().mo70644b(str);
        }
    }

    @Override // com.ss.mediakit.medialoader.AVMDLDataLoaderListener
    public String getCheckSumInfo(String str) {
        try {
            if (this.mListener == null || TextUtils.isEmpty(str)) {
                return null;
            }
            return this.mListener.getCheckSumInfo(str);
        } catch (Exception e) {
            TTVideoEngineLog.m256501d(e);
            return null;
        }
    }

    public void moveToScene(String str) {
        if (this.mMdlPreloadStrategy == 200) {
            StrategyHelper.helper().getCenter().mo70649c(str);
        }
    }

    public void setListener(DataLoaderListener dataLoaderListener) {
        this.mLock.lock();
        try {
            this.mListener = dataLoaderListener;
        } finally {
            this.mLock.unlock();
        }
    }

    public void setLoadProxy(LibraryLoaderProxy libraryLoaderProxy) {
        this.mLock.lock();
        if (libraryLoaderProxy != null) {
            try {
                this.mProxy = libraryLoaderProxy;
            } catch (Throwable th) {
                this.mLock.unlock();
                throw th;
            }
        }
        this.mLock.unlock();
    }

    public void setLoaderEventListener(LoaderListener loaderListener) {
        this.mLock.lock();
        try {
            AVMDLDataLoader.getInstance().setEventListener(loaderListener);
        } finally {
            this.mLock.unlock();
        }
    }

    public void setReportLogEnable(boolean z) {
        this.mLock.lock();
        try {
            this.mReportLogEnable = z;
        } finally {
            this.mLock.unlock();
        }
    }

    public void setTestSpeedListener(TestSpeedListener testSpeedListener) {
        this.mLock.lock();
        try {
            this.mTestSpeedListener = testSpeedListener;
        } finally {
            this.mLock.unlock();
        }
    }

    private JSONObject _onHeartBeatFire(JSONObject jSONObject) {
        try {
            long playWastDataSize = VideoInfoCollector.getInstance().getPlayWastDataSize();
            if (playWastDataSize > 0) {
                jSONObject.put("_play_waste_data", playWastDataSize);
            }
            long playConsumedSize = VideoInfoCollector.getInstance().getPlayConsumedSize();
            if (playConsumedSize > 0) {
                jSONObject.put("_play_consumed_data", playConsumedSize);
            }
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    private void asyncCopyOperation(AVMDLCopyOperation aVMDLCopyOperation) {
        if (this.mState == 0) {
            this.mLock.lock();
            try {
                AVMDLDataLoader aVMDLDataLoader = this.mInnerDataLoader;
                if (aVMDLDataLoader == null) {
                    this.mLock.unlock();
                    return;
                }
                aVMDLDataLoader.asyncCopyOperation(aVMDLCopyOperation);
                this.mLock.unlock();
            } catch (Throwable th) {
                this.mLock.unlock();
                throw th;
            }
        }
    }

    private void reportSpeed(AVMDLDataLoaderNotifyInfo aVMDLDataLoaderNotifyInfo) {
        if (this.mEnableReportSpeed != 0) {
            long j = aVMDLDataLoaderNotifyInfo.code;
            long j2 = aVMDLDataLoaderNotifyInfo.parameter;
            if (j > 0 && j2 > 0) {
                double d = (double) j;
                C60447b.m234869a().mo206936a((8.0d * d) / (((double) j2) / 1000.0d), d, j2);
            }
        }
    }

    public void addTask(PreloaderURLItem preloaderURLItem) {
        if (preloaderURLItem == null) {
            TTVideoEngineLog.m256503e("DataLoaderHelper", "[preload] url item invalid");
            return;
        }
        this.mLock.lock();
        try {
            _addTask(preloaderURLItem.getKey(), preloaderURLItem.getVideoId(), preloaderURLItem.getPreloadSize(), null, null, preloaderURLItem);
        } finally {
            this.mLock.unlock();
        }
    }

    public void checkLoaderType(int i) {
        int i2;
        this.mLock.lock();
        if (this.mConfigure.mLoaderType == i || (i2 = this.mBackupLoaderType) == i) {
            this.mLock.unlock();
        } else if (i2 > 0) {
            this.mLock.unlock();
        } else {
            try {
                this.mInnerDataLoader.setIntValue(7227, i);
            } catch (Exception unused) {
                TTVideoEngineLog.m256500d("DataLoaderHelper", "set backup loader type failed");
            } catch (Throwable th) {
                this.mLock.unlock();
                throw th;
            }
            this.mLock.unlock();
        }
    }

    public void disableAutoTrim(String str) {
        if (!TextUtils.isEmpty(str) && this.mInnerDataLoader != null) {
            this.mLock.lock();
            try {
                this.mInnerDataLoader.makeFileAutoDeleteFlag(str, 1);
            } finally {
                this.mLock.unlock();
            }
        }
    }

    public void enableAutoTrim(String str) {
        if (!TextUtils.isEmpty(str) && this.mInnerDataLoader != null) {
            this.mLock.lock();
            try {
                this.mInnerDataLoader.makeFileAutoDeleteFlag(str, 0);
            } finally {
                this.mLock.unlock();
            }
        }
    }

    public DataLoaderCacheInfo getCacheInfo(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        this.mLock.lock();
        try {
            if (this.mInnerDataLoader != null) {
                if (this.mState == 0) {
                    DataLoaderCacheInfo _processCacheInfo = _processCacheInfo(this.mInnerDataLoader.getStringCacheInfo(str));
                    this.mLock.unlock();
                    return _processCacheInfo;
                }
            }
        } catch (Throwable th) {
            this.mLock.unlock();
            throw th;
        }
        this.mLock.unlock();
        return null;
    }

    public DataLoaderCacheInfo getCacheInfoByFilePath(String str) {
        this.mLock.lock();
        try {
            if (this.mInnerDataLoader != null) {
                DataLoaderCacheInfo _processCacheInfo = _processCacheInfo(this.mInnerDataLoader.getStringCacheInfo(TTHelper.keyFromFilePath(this.mContext, str), str));
                this.mLock.unlock();
                return _processCacheInfo;
            }
        } catch (Throwable th) {
            this.mLock.unlock();
            throw th;
        }
        this.mLock.unlock();
        return null;
    }

    public long getCacheSize(String str) {
        long j = 0;
        if (this.mState != 0) {
            return 0;
        }
        this.mLock.lock();
        try {
            AVMDLDataLoader aVMDLDataLoader = this.mInnerDataLoader;
            if (aVMDLDataLoader != null) {
                long cacheSize = aVMDLDataLoader.getCacheSize(str);
                if (cacheSize > 0) {
                    j = cacheSize;
                }
            }
        } catch (Throwable th) {
            this.mLock.unlock();
            throw th;
        }
        this.mLock.unlock();
        return j;
    }

    public long getCacheSizeByFilePath(String str) {
        this.mLock.lock();
        long j = 0;
        try {
            if (this.mInnerDataLoader != null) {
                long cacheSize = this.mInnerDataLoader.getCacheSize(TTHelper.keyFromFilePath(this.mContext, str), str);
                if (cacheSize > 0) {
                    j = cacheSize;
                }
            }
        } catch (Throwable th) {
            this.mLock.unlock();
            throw th;
        }
        this.mLock.unlock();
        return j;
    }

    public long getLongValue(int i) {
        long j;
        this.mLock.lock();
        long j2 = -1;
        if (i != 1003) {
            if (i == 1152) {
                j = this.mConfigure.mMonitorTimeInternal;
            } else if (i != 1153) {
                this.mLock.unlock();
                return -1;
            } else {
                try {
                    j = this.mConfigure.mMonitorMinAllowLoadSize;
                } catch (Throwable th) {
                    this.mLock.unlock();
                    throw th;
                }
            }
            this.mLock.unlock();
            return j;
        }
        if (this.mEnableMdlProtocol) {
            j2 = this.mMdlProtocolHandle;
        }
        this.mLock.unlock();
        return j2;
    }

    public String getPlayLog(String str) {
        String str2 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        this.mLock.lock();
        try {
            AVMDLDataLoader aVMDLDataLoader = this.mInnerDataLoader;
            if (aVMDLDataLoader != null) {
                str2 = aVMDLDataLoader.getStringValueByStr(str, 1010);
            }
        } catch (Exception e) {
            TTVideoEngineLog.m256501d(e);
        } catch (Throwable th) {
            this.mLock.unlock();
            throw th;
        }
        this.mLock.unlock();
        return str2;
    }

    public String getStringValue(int i) {
        String str;
        AVMDLDataLoader aVMDLDataLoader;
        this.mLock.lock();
        if (i != 0) {
            if (i == 6) {
                try {
                    if (this.mVersionInfo == null && (aVMDLDataLoader = this.mInnerDataLoader) != null) {
                        this.mVersionInfo = aVMDLDataLoader.getStringValue(11);
                    }
                    str = this.mVersionInfo;
                } catch (Exception e) {
                    TTVideoEngineLog.m256501d(e);
                } catch (Throwable th) {
                    this.mLock.unlock();
                    throw th;
                }
            }
            this.mLock.unlock();
            return null;
        }
        str = this.mConfigure.mCacheDir;
        this.mLock.unlock();
        return str;
    }

    public void setContext(Context context) {
        if (context != null) {
            this.mLock.lock();
            try {
                if (this.mContext == null) {
                    SettingsHelper.helper().setContext(context);
                    SettingsHelper.helper().loadMDLCache();
                }
                this.mContext = context;
            } finally {
                this.mLock.unlock();
            }
        }
    }

    public void suspendedDownload(String str) {
        if (this.mState == 0) {
            this.mLock.lock();
            try {
                AVMDLDataLoader aVMDLDataLoader = this.mInnerDataLoader;
                if (aVMDLDataLoader == null) {
                    this.mLock.unlock();
                    return;
                }
                aVMDLDataLoader.suspendDownload(str);
                TTVideoEngineLog.m256505i("DataLoaderHelper", "[downloader] suspended download, key = " + str);
                this.mLock.unlock();
            } catch (Throwable th) {
                this.mLock.unlock();
                throw th;
            }
        }
    }

    public long tryQuickGetCacheFileSize(String str) {
        long j = 0;
        if (this.mState != 0) {
            return 0;
        }
        this.mLock.lock();
        try {
            AVMDLDataLoader aVMDLDataLoader = this.mInnerDataLoader;
            if (aVMDLDataLoader != null) {
                long tryQuickGetCacheSize = aVMDLDataLoader.tryQuickGetCacheSize(str);
                if (tryQuickGetCacheSize > 0) {
                    j = tryQuickGetCacheSize;
                }
            }
        } catch (Throwable th) {
            this.mLock.unlock();
            throw th;
        }
        this.mLock.unlock();
        return j;
    }

    public void tryToClearCachesByUsedTime(long j) {
        this.mLock.lock();
        try {
            AVMDLDataLoader aVMDLDataLoader = this.mInnerDataLoader;
            if (aVMDLDataLoader == null) {
                this.mLock.unlock();
                return;
            }
            aVMDLDataLoader.tryToClearCachesByUsedTime(j);
            this.mLock.unlock();
        } catch (Throwable th) {
            this.mLock.unlock();
            throw th;
        }
    }

    private void _cacheEndNotifyEngine(DataLoaderTaskItem dataLoaderTaskItem) {
        boolean z;
        ArrayList<DataLoaderTaskItem> array = this.mAllPlayTasks.toArray();
        int i = 0;
        while (true) {
            if (i >= array.size()) {
                z = true;
                break;
            }
            DataLoaderTaskItem dataLoaderTaskItem2 = array.get(i);
            if (!(TextUtils.isEmpty(dataLoaderTaskItem2.mVideoId) || TextUtils.isEmpty(dataLoaderTaskItem.mVideoId) || !dataLoaderTaskItem2.mVideoId.equals(dataLoaderTaskItem.mVideoId))) {
                z = false;
                break;
            }
            i++;
        }
        if (z) {
            this.mLock.lock();
            this.mPreloadUtil.notifyCacheEnd(dataLoaderTaskItem.mVideoId);
            this.mLock.unlock();
            ArrayList<TTVideoEngine> _getEnginesByRawKey = _getEnginesByRawKey(dataLoaderTaskItem.mVideoId);
            if (!(_getEnginesByRawKey == null || _getEnginesByRawKey.size() == 0)) {
                for (int i2 = 0; i2 < _getEnginesByRawKey.size(); i2++) {
                    _getEnginesByRawKey.get(i2).notifyCacheEnd();
                }
            }
        }
    }

    private ArrayList<TTVideoEngine> _getEnginesByRawKey(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            this.mEngineLock.lock();
            ArrayList<TTVideoEngine> arrayList = this.mAllUsingEngies.get(str);
            if (arrayList != null) {
                ArrayList<TTVideoEngine> arrayList2 = new ArrayList<>();
                arrayList2.addAll(arrayList);
                TTVideoEngineLog.m256505i("DataLoaderHelper", "get engine ref,rawKey = " + str + " engine ref count: " + arrayList2.size());
                return arrayList2;
            }
            this.mEngineLock.unlock();
            return null;
        } finally {
            this.mEngineLock.unlock();
        }
    }

    private DataLoaderCacheInfo _processCacheInfo(String str) {
        DataLoaderCacheInfo dataLoaderCacheInfo = null;
        if (str == null) {
            return null;
        }
        String[] split = str.split(",");
        if (split.length >= 4) {
            dataLoaderCacheInfo = new DataLoaderCacheInfo();
            dataLoaderCacheInfo.mLocalFilePath = split[3];
            if (!TextUtils.isEmpty(split[0])) {
                dataLoaderCacheInfo.mCacheSizeFromZero = Long.valueOf(split[0]).longValue();
            }
            if (!TextUtils.isEmpty(split[1])) {
                dataLoaderCacheInfo.mMediaSize = Long.valueOf(split[1]).longValue();
            }
            TTVideoEngineLog.m256500d("DataLoaderHelper", "get cache info.");
        }
        return dataLoaderCacheInfo;
    }

    private String[] _removeRepeatUrls(String[] strArr) {
        if (strArr == null || strArr.length <= 1) {
            return strArr;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(strArr[0]);
        for (int i = 1; i < strArr.length; i++) {
            String str = strArr[i];
            Boolean bool = true;
            int size = arrayList.size() - 1;
            while (true) {
                if (size < 0) {
                    break;
                } else if (((String) arrayList.get(size)).equals(str)) {
                    bool = false;
                    break;
                } else {
                    size--;
                }
            }
            if (bool.booleanValue()) {
                arrayList.add(str);
            }
        }
        String[] strArr2 = new String[arrayList.size()];
        arrayList.toArray(strArr2);
        return strArr2;
    }

    private boolean _supportProxy(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String lowerCase = str.toLowerCase();
        if (!lowerCase.startsWith("mdl://") && !lowerCase.startsWith("http://127.0.0.1") && !lowerCase.startsWith("http://localhost") && !lowerCase.startsWith("file://") && !lowerCase.startsWith("/") && !lowerCase.endsWith(".mpd") && !lowerCase.contains(".mpd?") && (((this.mEnableHls == 1 && this.mSupporHls) || (!lowerCase.contains(".m3u8?") && !lowerCase.endsWith(".m3u8"))) && !lowerCase.contains(".m3u?") && !lowerCase.endsWith(".m3u"))) {
            return true;
        }
        return false;
    }

    public String _getProxyUrl(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            if (!str.startsWith("mdl://")) {
                return str;
            }
            int indexOf = str.indexOf("?");
            if (indexOf == -1) {
                return null;
            }
            String localAddr = this.mInnerDataLoader.getLocalAddr();
            if (TextUtils.isEmpty(localAddr)) {
                return null;
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("http://");
            stringBuffer.append(localAddr);
            stringBuffer.append(str.substring(indexOf));
            String stringBuffer2 = stringBuffer.toString();
            TTVideoEngineLog.m256503e("DataLoaderHelper", "_proxyUrl: " + stringBuffer2);
            return stringBuffer2;
        } catch (Exception unused) {
            TTVideoEngineLog.m256503e("DataLoaderHelper", "get proxy url failed: " + str);
            return str;
        }
    }

    /* access modifiers changed from: package-private */
    public String _headerString(HashMap<String, String> hashMap) {
        if (hashMap == null || hashMap.size() < 1) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (String str : hashMap.keySet()) {
            sb.append(str);
            sb.append(":");
            sb.append(" ");
            sb.append(hashMap.get(str));
            sb.append("\r\n");
        }
        return sb.toString();
    }

    public void addPreloadModelMedia(PreloadModelMedia preloadModelMedia) {
        if (FeatureManager.hasPermission("preload")) {
            if (preloadModelMedia == null || preloadModelMedia.mVideoModel == null || preloadModelMedia.mResolution == null) {
                TTVideoEngineLog.m256503e("DataLoaderHelper", "[preload] addTask videoModel input invalid");
                if (preloadModelMedia != null && preloadModelMedia.getCallBackListener() != null) {
                    PreLoaderItemCallBackInfo preLoaderItemCallBackInfo = new PreLoaderItemCallBackInfo(3);
                    preLoaderItemCallBackInfo.preloadError = new Error("kTTVideoErrorDomainDataLoaderPreload", -100001);
                    preloadModelMedia.getCallBackListener().preloadItemInfo(preLoaderItemCallBackInfo);
                }
            } else if (TextUtils.isEmpty(preloadModelMedia.mVideoModel.getVideoRefStr(2))) {
                TTVideoEngineLog.m256503e("DataLoaderHelper", "[preload] videoId invalid.");
                if (preloadModelMedia.getCallBackListener() != null) {
                    PreLoaderItemCallBackInfo preLoaderItemCallBackInfo2 = new PreLoaderItemCallBackInfo(3);
                    preLoaderItemCallBackInfo2.preloadError = new Error("kTTVideoErrorDomainDataLoaderPreload", -100001);
                    preloadModelMedia.getCallBackListener().preloadItemInfo(preLoaderItemCallBackInfo2);
                }
            } else if (this.mMdlPreloadStrategy == 200) {
                _ml_addMedia(preloadModelMedia, preloadModelMedia.mSceneId);
            }
        }
    }

    public void addTask(PreloaderVidItem preloaderVidItem) {
        if (preloaderVidItem == null || this.mState != 0) {
            return;
        }
        if (TextUtils.isEmpty(preloaderVidItem.mVideoId)) {
            TTVideoEngineLog.m256503e("DataLoaderHelper", "videoId invalid.");
            return;
        }
        String str = preloaderVidItem.mVideoId + "_" + preloaderVidItem.mResolution.toString(0) + preloaderVidItem.mCodecType + preloaderVidItem.mDashEnable + preloaderVidItem.mHlsEnable + preloaderVidItem.mEncryptEnable;
        this.mLock.lock();
        try {
            _addTask(str, preloaderVidItem.mVideoId, preloaderVidItem.mPreloadSize, preloaderVidItem, null, null);
        } finally {
            this.mLock.unlock();
        }
    }

    public void cancelTask(String str) {
        if (!TextUtils.isEmpty(str)) {
            if (this.mInnerDataLoader == null || this.mState != 0) {
                TTVideoEngineLog.m256503e("DataLoaderHelper", "need start mdl first");
                return;
            }
            this.mLock.lock();
            try {
                DataLoaderTaskItem popItem = this.mPreloadTasks.popItem(str);
                if (popItem != null) {
                    _notifyPreloadCancel(popItem);
                } else {
                    DataLoaderTaskItem popItem2 = this.mExecuteTasks.popItem(str);
                    if (popItem2 != null) {
                        if (popItem2.mFetcher != null) {
                            popItem2.mFetcher.cancel();
                        }
                        _notifyPreloadCancel(popItem2);
                    } else {
                        DataLoaderTaskItem popItem3 = this.mAllPreloadTasks.popItem(str);
                        if (popItem3 != null) {
                            this.mInnerDataLoader.cancel(str);
                            _notifyPreloadCancel(popItem3);
                        }
                    }
                }
                TTVideoEngineLog.m256505i("DataLoaderHelper", "[preload] cancel preload task. key = " + str);
            } catch (Throwable th) {
                this.mLock.unlock();
                throw th;
            }
            this.mLock.unlock();
        }
    }

    /* access modifiers changed from: package-private */
    public void forceRemoveCacheFile(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.mLock.lock();
            try {
                if (this.mInnerDataLoader == null) {
                    TTVideoEngineLog.m256503e("DataLoaderHelper", "mInnerDataLoader == null");
                    this.mLock.unlock();
                    return;
                }
                TTVideoEngineLog.m256505i("DataLoaderHelper", " force remove mdl file. key " + str);
                this.mInnerDataLoader.forceRemoveFileCache(str);
                this.mLock.unlock();
            } catch (Throwable th) {
                this.mLock.unlock();
                throw th;
            }
        }
    }

    public JSONObject getCDNLog(String str) {
        String cDNLog;
        if (this.mState != 0 || TextUtils.isEmpty(str)) {
            return null;
        }
        this.mLock.lock();
        try {
            AVMDLDataLoader aVMDLDataLoader = this.mInnerDataLoader;
            if (!(aVMDLDataLoader == null || (cDNLog = aVMDLDataLoader.getCDNLog(str)) == null)) {
                JSONObject jSONObject = new JSONObject(cDNLog);
                TTVideoEngineLog.m256500d("DataLoaderHelper", "get cdn log suc" + jSONObject.toString());
                this.mLock.unlock();
                return jSONObject;
            }
        } catch (Exception e) {
            TTVideoEngineLog.m256500d("DataLoaderHelper", "get log exception" + e.toString());
        } catch (Throwable th) {
            this.mLock.unlock();
            throw th;
        }
        this.mLock.unlock();
        return null;
    }

    public void p2pPredown(String str) {
        if (this.mState != 0 || TextUtils.isEmpty(str)) {
            TTVideoEngineLog.m256500d("DataLoaderHelper", "[predown]  state or url is invalid, not allow predown");
        } else if (this.mConfigure.mLoaderType <= 0) {
            TTVideoEngineLog.m256500d("DataLoaderHelper", "[predown]  loader type is http, not allow predown");
        } else {
            this.mLock.lock();
            try {
                TTVideoEngineLog.m256500d("DataLoaderHelper", "[predown] start predown for url: " + str);
                AVMDLDataLoader aVMDLDataLoader = this.mInnerDataLoader;
                if (aVMDLDataLoader != null) {
                    aVMDLDataLoader.p2pPredown(str);
                }
                TTVideoEngineLog.m256500d("DataLoaderHelper", "[predown] end predown for url");
            } finally {
                this.mLock.unlock();
            }
        }
    }

    public void preConnect(String str) {
        AVMDLDataLoader aVMDLDataLoader;
        if (this.mState == 0 && !TextUtils.isEmpty(str)) {
            this.mLock.lock();
            try {
                Uri parse = Uri.parse(str);
                int port = parse.getPort();
                if (port == -1) {
                    port = 80;
                    if (str.startsWith("https")) {
                        port = 443;
                    }
                }
                if (!(parse == null || (aVMDLDataLoader = this.mInnerDataLoader) == null)) {
                    aVMDLDataLoader.preConnectByHost(parse.getHost(), port);
                }
            } finally {
                this.mLock.unlock();
            }
        }
    }

    public void removeCacheFile(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.mLock.lock();
            try {
                if (this.mInnerDataLoader == null) {
                    TTVideoEngineLog.m256503e("DataLoaderHelper", "mInnerDataLoader == null");
                    this.mLock.unlock();
                    return;
                }
                TTVideoEngineLog.m256505i("DataLoaderHelper", "remove mdl file. key " + str);
                this.mInnerDataLoader.removeFileCache(str);
                this.mLock.unlock();
            } catch (Throwable th) {
                this.mLock.unlock();
                throw th;
            }
        }
    }

    public boolean startDownload(String str) {
        boolean z = false;
        if (!FeatureManager.hasPermission() || this.mState != 0) {
            return false;
        }
        this.mLock.lock();
        try {
            if (this.mInnerDataLoader != null) {
                if (!TextUtils.isEmpty(str)) {
                    this.mInnerDataLoader.downloadResource(str);
                    TTVideoEngineLog.m256505i("DataLoaderHelper", "[downloader] start download resource = " + str);
                    z = true;
                }
            }
        } catch (Throwable unused) {
        }
        this.mLock.unlock();
        return z;
    }

    /* access modifiers changed from: private */
    public class MyTaskListener implements TaskListener {
        private final WeakReference<DataLoaderHelper> mDataLoader;

        @Override // com.ss.ttvideoengine.DataLoaderHelper.TaskListener
        public void taskFinished(DataLoaderTaskItem dataLoaderTaskItem) {
            DataLoaderHelper dataLoaderHelper = this.mDataLoader.get();
            if (dataLoaderHelper != null && dataLoaderTaskItem != null) {
                if (!(dataLoaderTaskItem.mResponseData == null || dataLoaderTaskItem.getCallBackListener() == null)) {
                    PreLoaderItemCallBackInfo preLoaderItemCallBackInfo = new PreLoaderItemCallBackInfo(4);
                    preLoaderItemCallBackInfo.fetchVideoModel = (VideoModel) dataLoaderTaskItem.mResponseData;
                    dataLoaderTaskItem.getCallBackListener().preloadItemInfo(preLoaderItemCallBackInfo);
                    dataLoaderTaskItem.mSetResolution = dataLoaderTaskItem.mVidItem.mResolution;
                }
                if (!(dataLoaderTaskItem == null || dataLoaderTaskItem.mVidItem == null || dataLoaderTaskItem.mVidItem.getFetchEndListener() == null)) {
                    dataLoaderTaskItem.mVidItem.getFetchEndListener().fetchEnd((VideoModel) dataLoaderTaskItem.mResponseData, dataLoaderTaskItem.mResponseError);
                    dataLoaderTaskItem.mSetResolution = dataLoaderTaskItem.mVidItem.mResolution;
                }
                if (dataLoaderTaskItem.mVidItem != null && !dataLoaderTaskItem.mVidItem.getOnlyFetchVideoModel()) {
                    dataLoaderHelper._exectTask(dataLoaderTaskItem);
                }
                if (dataLoaderTaskItem.mResponseError != null) {
                    if (dataLoaderHelper.mListener != null) {
                        dataLoaderHelper.mListener.dataLoaderError(dataLoaderTaskItem.mVideoId, 1, dataLoaderTaskItem.mResponseError);
                    }
                    if (dataLoaderTaskItem.getCallBackListener() != null) {
                        PreLoaderItemCallBackInfo preLoaderItemCallBackInfo2 = new PreLoaderItemCallBackInfo(3);
                        preLoaderItemCallBackInfo2.preloadError = dataLoaderTaskItem.mResponseError;
                        dataLoaderTaskItem.getCallBackListener().preloadItemInfo(preLoaderItemCallBackInfo2);
                    }
                }
            }
        }

        public MyTaskListener(DataLoaderHelper dataLoaderHelper) {
            this.mDataLoader = new WeakReference<>(dataLoaderHelper);
        }
    }

    public void addTask(PreloaderVideoModelItem preloaderVideoModelItem) {
        String str;
        if (preloaderVideoModelItem == null || preloaderVideoModelItem.mVideoModel == null || preloaderVideoModelItem.mResolution == null) {
            TTVideoEngineLog.m256503e("DataLoaderHelper", "[preload] addTask videoModel input invalid");
            if (preloaderVideoModelItem != null) {
                preloaderVideoModelItem._notifyError(-100001);
                return;
            }
            return;
        }
        VideoInfo videoInfo = preloaderVideoModelItem.mVideoModel.getVideoInfo(preloaderVideoModelItem.mResolution, preloaderVideoModelItem.mParams, true);
        if (videoInfo != null) {
            str = videoInfo.getValueStr(15);
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            TTVideoEngineLog.m256503e("DataLoaderHelper", "[preload] key invalid.");
            preloaderVideoModelItem._notifyError(-100001);
            return;
        }
        String videoRefStr = preloaderVideoModelItem.mVideoModel.getVideoRefStr(2);
        if (TextUtils.isEmpty(videoRefStr)) {
            TTVideoEngineLog.m256503e("DataLoaderHelper", "[preload] videoId invalid.");
            preloaderVideoModelItem._notifyError(-100001);
            return;
        }
        this.mLock.lock();
        try {
            _addTask(str, videoRefStr, preloaderVideoModelItem.mPreloadSize, null, preloaderVideoModelItem, null);
        } finally {
            this.mLock.unlock();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v18, resolved type: boolean */
    /* JADX WARN: Multi-variable type inference failed */
    public int getIntValue(int i) {
        int i2;
        this.mLock.lock();
        if (i == 7) {
            i2 = this.mConfigure.mEnableExternDNS;
        } else if (i == 8) {
            i2 = this.mConfigure.mEnableSocketReuse;
        } else if (i == 12) {
            i2 = this.mMdlPreloadStrategy;
        } else if (i == 90) {
            i2 = this.mConfigure.mDNSMainType;
        } else if (i == 103) {
            i2 = AVMDLDNSParser.getIntValue(4);
        } else if (i == 105) {
            i2 = AVMDLDNSParser.getIntValue(6);
        } else if (i == 1001) {
            i2 = this.mConfigure.mEnablePreconnect;
        } else if (i == 1008) {
            i2 = this.mCurrentAccessType;
        } else if (i == 1150) {
            i2 = this.mConfigure.mEnableIOManager;
        } else if (i == 9009) {
            i2 = this.mSupporHls;
        } else if (i == 100) {
            i2 = this.mConfigure.mMaxTlsVersion;
        } else if (i == 101) {
            i2 = this.mConfigure.mEnableSessionReuse;
        } else if (i == 114) {
            i2 = this.mEnablePreParseHost;
        } else if (i != 115) {
            i2 = -1;
        } else {
            try {
                i2 = this.mEnableBackupIP;
            } catch (Throwable th) {
                this.mLock.unlock();
                throw th;
            }
        }
        this.mLock.unlock();
        return i2 == 1 ? 1 : 0;
    }

    public void cancelTaskByVideoId(String str) {
        if (!TextUtils.isEmpty(str)) {
            if (this.mInnerDataLoader == null || this.mState != 0) {
                TTVideoEngineLog.m256503e("DataLoaderHelper", "need start mdl first");
                return;
            }
            ArrayList arrayList = new ArrayList();
            this.mLock.lock();
            try {
                if (this.mPreloadTasks.count() > 0) {
                    ArrayList<DataLoaderTaskItem> array = this.mPreloadTasks.toArray();
                    for (int i = 0; i < array.size(); i++) {
                        DataLoaderTaskItem dataLoaderTaskItem = array.get(i);
                        if (!TextUtils.isEmpty(dataLoaderTaskItem.mVideoId) && str.equals(dataLoaderTaskItem.mVideoId)) {
                            for (DataLoaderTaskItem.TrackItem trackItem : dataLoaderTaskItem.mTracks) {
                                if (!TextUtils.isEmpty(trackItem.mTaskKey)) {
                                    arrayList.add(trackItem.mTaskKey);
                                }
                            }
                        }
                    }
                }
                if (this.mExecuteTasks.count() > 0) {
                    ArrayList<DataLoaderTaskItem> array2 = this.mExecuteTasks.toArray();
                    for (int i2 = 0; i2 < array2.size(); i2++) {
                        DataLoaderTaskItem dataLoaderTaskItem2 = array2.get(i2);
                        if (!TextUtils.isEmpty(dataLoaderTaskItem2.mVideoId) && str.equals(dataLoaderTaskItem2.mVideoId)) {
                            for (DataLoaderTaskItem.TrackItem trackItem2 : dataLoaderTaskItem2.mTracks) {
                                if (!TextUtils.isEmpty(trackItem2.mTaskKey)) {
                                    arrayList.add(trackItem2.mTaskKey);
                                }
                            }
                        }
                    }
                }
                if (this.mAllPreloadTasks.count() > 0) {
                    ArrayList<DataLoaderTaskItem> array3 = this.mAllPreloadTasks.toArray();
                    for (int i3 = 0; i3 < array3.size(); i3++) {
                        DataLoaderTaskItem dataLoaderTaskItem3 = array3.get(i3);
                        if (!TextUtils.isEmpty(dataLoaderTaskItem3.mVideoId) && str.equals(dataLoaderTaskItem3.mVideoId)) {
                            for (DataLoaderTaskItem.TrackItem trackItem3 : dataLoaderTaskItem3.mTracks) {
                                if (!TextUtils.isEmpty(trackItem3.mTaskKey)) {
                                    arrayList.add(trackItem3.mTaskKey);
                                }
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                this.mLock.unlock();
                throw th;
            }
            this.mLock.unlock();
            if (arrayList.size() > 0) {
                for (int i4 = 0; i4 < arrayList.size(); i4++) {
                    cancelTask((String) arrayList.get(i4));
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:106:0x0363  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x039d  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x048c  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x0495  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x028a  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x02a2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void _exectTask(com.ss.ttvideoengine.DataLoaderHelper.DataLoaderTaskItem r42) {
        /*
        // Method dump skipped, instructions count: 1443
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttvideoengine.DataLoaderHelper._exectTask(com.ss.ttvideoengine.DataLoaderHelper$DataLoaderTaskItem):void");
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.ss.mediakit.medialoader.AVMDLDataLoaderListener
    public void onNotify(AVMDLDataLoaderNotifyInfo aVMDLDataLoaderNotifyInfo) {
        String str;
        DataLoaderTaskItem itemForKey;
        String str2;
        TestSpeedListener testSpeedListener;
        if (aVMDLDataLoaderNotifyInfo != null) {
            int i = aVMDLDataLoaderNotifyInfo.what;
            boolean z = true;
            if (i != 8) {
                if (i == 70) {
                    aVMDLDataLoaderNotifyInfo.jsonLog = _onHeartBeatFire(aVMDLDataLoaderNotifyInfo.jsonLog);
                    VideoEventEngineUploader videoEventEngineUploader = this.mEngineUploader;
                    if (videoEventEngineUploader != null) {
                        videoEventEngineUploader.onEvent(aVMDLDataLoaderNotifyInfo.logType, aVMDLDataLoaderNotifyInfo.jsonLog);
                        return;
                    }
                    DataLoaderListener dataLoaderListener = this.mListener;
                    if (dataLoaderListener != null) {
                        dataLoaderListener.onLogInfo(3, aVMDLDataLoaderNotifyInfo.logType, aVMDLDataLoaderNotifyInfo.jsonLog);
                    }
                    IVideoEventUploader iVideoEventUploader = this.mUploader;
                    if (iVideoEventUploader != null && this.mReportLogEnable) {
                        iVideoEventUploader.onUplaod(aVMDLDataLoaderNotifyInfo.logType, aVMDLDataLoaderNotifyInfo.jsonLog);
                    }
                    TTVideoEngineLog.m256500d("DataLoaderHelper", "heart beat msg: " + aVMDLDataLoaderNotifyInfo.logInfo);
                    return;
                } else if (i == 700) {
                    TTVideoEngineLog.m256500d("DataLoaderHelper", "KeyIsSpeedTestSampledByTime " + aVMDLDataLoaderNotifyInfo.code);
                    if (FeatureManager.hasPermission("net_speed")) {
                        TestSpeedListener testSpeedListener2 = this.mTestSpeedListener;
                        if (testSpeedListener2 != null) {
                            testSpeedListener2.onNotify(2, aVMDLDataLoaderNotifyInfo.code, aVMDLDataLoaderNotifyInfo.parameter, aVMDLDataLoaderNotifyInfo.logInfo, aVMDLDataLoaderNotifyInfo.logType, aVMDLDataLoaderNotifyInfo.logExtraJsonStr);
                        }
                        if (this.mNeedSpeedTestByTimeInternal == 1) {
                            this.mListener.onNotify(2, aVMDLDataLoaderNotifyInfo.code, aVMDLDataLoaderNotifyInfo.parameter, aVMDLDataLoaderNotifyInfo.logInfo);
                            return;
                        }
                        return;
                    }
                    return;
                } else if (i != 702) {
                    if (i == 10) {
                        VideoEventEngineUploader videoEventEngineUploader2 = this.mEngineUploader;
                        if (videoEventEngineUploader2 != null) {
                            videoEventEngineUploader2.onEvent(aVMDLDataLoaderNotifyInfo.logType, aVMDLDataLoaderNotifyInfo.jsonLog);
                            return;
                        }
                        DataLoaderListener dataLoaderListener2 = this.mListener;
                        if (dataLoaderListener2 != null) {
                            dataLoaderListener2.onLogInfo(4, aVMDLDataLoaderNotifyInfo.logType, aVMDLDataLoaderNotifyInfo.jsonLog);
                            TTVideoEngineLog.m256500d("DataLoaderHelper", "live loader log msg: " + aVMDLDataLoaderNotifyInfo.logInfo);
                            return;
                        }
                        return;
                    } else if (i != 11) {
                        switch (i) {
                            case 0:
                                VideoEventEngineUploader videoEventEngineUploader3 = this.mEngineUploader;
                                if (videoEventEngineUploader3 != null) {
                                    videoEventEngineUploader3.onEvent(aVMDLDataLoaderNotifyInfo.logType, aVMDLDataLoaderNotifyInfo.jsonLog);
                                    return;
                                }
                                DataLoaderListener dataLoaderListener3 = this.mListener;
                                if (dataLoaderListener3 != null) {
                                    dataLoaderListener3.onLogInfo(0, aVMDLDataLoaderNotifyInfo.logType, aVMDLDataLoaderNotifyInfo.jsonLog);
                                }
                                IVideoEventUploader iVideoEventUploader2 = this.mUploader;
                                if (iVideoEventUploader2 != null && this.mReportLogEnable) {
                                    iVideoEventUploader2.onUplaod(aVMDLDataLoaderNotifyInfo.logType, aVMDLDataLoaderNotifyInfo.jsonLog);
                                    return;
                                }
                                return;
                            case 1:
                                VideoEventEngineUploader videoEventEngineUploader4 = this.mEngineUploader;
                                if (videoEventEngineUploader4 != null) {
                                    videoEventEngineUploader4.onEvent(aVMDLDataLoaderNotifyInfo.logType, aVMDLDataLoaderNotifyInfo.jsonLog);
                                    return;
                                }
                                DataLoaderListener dataLoaderListener4 = this.mListener;
                                if (dataLoaderListener4 != null) {
                                    dataLoaderListener4.onLogInfo(1, aVMDLDataLoaderNotifyInfo.logType, aVMDLDataLoaderNotifyInfo.jsonLog);
                                }
                                IVideoEventUploader iVideoEventUploader3 = this.mUploader;
                                if (iVideoEventUploader3 != null && this.mReportLogEnable) {
                                    iVideoEventUploader3.onUplaod(aVMDLDataLoaderNotifyInfo.logType, aVMDLDataLoaderNotifyInfo.jsonLog);
                                    return;
                                }
                                return;
                            case 2:
                                if (FeatureManager.hasPermission("net_speed")) {
                                    DataLoaderListener dataLoaderListener5 = this.mListener;
                                    if (dataLoaderListener5 != null) {
                                        dataLoaderListener5.onNotify(2, aVMDLDataLoaderNotifyInfo.code, aVMDLDataLoaderNotifyInfo.parameter, aVMDLDataLoaderNotifyInfo.logInfo);
                                    }
                                    reportSpeed(aVMDLDataLoaderNotifyInfo);
                                    return;
                                }
                                return;
                            case 3:
                            case 4:
                                TTVideoEngineLog.m256500d("DataLoaderHelper", "KeyIsFileCacheProgress log = " + aVMDLDataLoaderNotifyInfo.logInfo + ", task type = " + aVMDLDataLoaderNotifyInfo.parameter + " code = " + ((int) aVMDLDataLoaderNotifyInfo.code));
                                if (aVMDLDataLoaderNotifyInfo.logInfo == null) {
                                    return;
                                }
                                if (aVMDLDataLoaderNotifyInfo.parameter == 3) {
                                    Downloader.getInstance().progress(aVMDLDataLoaderNotifyInfo.logInfo);
                                    return;
                                }
                                if (aVMDLDataLoaderNotifyInfo.parameter != 2) {
                                    z = false;
                                }
                                _progressInfoString(aVMDLDataLoaderNotifyInfo, z);
                                return;
                            case 5:
                                DataLoaderListener dataLoaderListener6 = this.mListener;
                                if (dataLoaderListener6 != null) {
                                    dataLoaderListener6.onNotify(20, aVMDLDataLoaderNotifyInfo.code, aVMDLDataLoaderNotifyInfo.parameter, aVMDLDataLoaderNotifyInfo.logInfo);
                                    return;
                                }
                                return;
                            case 6:
                                try {
                                    JSONObject process = DataLoaderCDNLog.process(aVMDLDataLoaderNotifyInfo.jsonLog);
                                    if (process != null) {
                                        DataLoaderListener dataLoaderListener7 = this.mListener;
                                        if (dataLoaderListener7 != null) {
                                            dataLoaderListener7.onNotifyCDNLog(process);
                                        }
                                        TTVideoEngineLog.m256500d("avmdlcdnlog", "receive log:" + process);
                                        return;
                                    }
                                    return;
                                } catch (Exception e) {
                                    e.printStackTrace();
                                    return;
                                }
                            default:
                                switch (i) {
                                    case 13:
                                        if (this.mListener != null && aVMDLDataLoaderNotifyInfo.jsonLog != null) {
                                            this.mListener.onLogInfo(0, aVMDLDataLoaderNotifyInfo.logType, aVMDLDataLoaderNotifyInfo.jsonLog);
                                            return;
                                        }
                                        return;
                                    case 14:
                                        TTVideoEngineLog.m256505i("DataLoaderHelper", "MDL Alog: " + aVMDLDataLoaderNotifyInfo.logInfo);
                                        return;
                                    case 15:
                                        VideoEventEngineUploader videoEventEngineUploader5 = this.mEngineUploader;
                                        if (videoEventEngineUploader5 != null) {
                                            videoEventEngineUploader5.onEvent(aVMDLDataLoaderNotifyInfo.logType, aVMDLDataLoaderNotifyInfo.jsonLog);
                                            return;
                                        } else if (this.mListener != null && aVMDLDataLoaderNotifyInfo.jsonLog != null) {
                                            this.mListener.onLogInfoToMonitor(6, aVMDLDataLoaderNotifyInfo.logType, aVMDLDataLoaderNotifyInfo.jsonLog);
                                            return;
                                        } else {
                                            return;
                                        }
                                    case 16:
                                        DataLoaderListener dataLoaderListener8 = this.mListener;
                                        if (dataLoaderListener8 != null) {
                                            dataLoaderListener8.onLogInfo(0, aVMDLDataLoaderNotifyInfo.logType, aVMDLDataLoaderNotifyInfo.jsonLog);
                                            return;
                                        }
                                        return;
                                    default:
                                        switch (i) {
                                            case 19:
                                                VideoEventEngineUploader videoEventEngineUploader6 = this.mEngineUploader;
                                                if (videoEventEngineUploader6 != null) {
                                                    videoEventEngineUploader6.onEvent(aVMDLDataLoaderNotifyInfo.logType, aVMDLDataLoaderNotifyInfo.jsonLog);
                                                    return;
                                                }
                                                DataLoaderListener dataLoaderListener9 = this.mListener;
                                                if (dataLoaderListener9 != null) {
                                                    dataLoaderListener9.onLogInfo(7, aVMDLDataLoaderNotifyInfo.logType, aVMDLDataLoaderNotifyInfo.jsonLog);
                                                    return;
                                                }
                                                return;
                                            case 20:
                                                break;
                                            case 21:
                                                if (aVMDLDataLoaderNotifyInfo.logInfo != null) {
                                                    Downloader.getInstance().progress(aVMDLDataLoaderNotifyInfo.logInfo);
                                                    return;
                                                }
                                                return;
                                            case 22:
                                                if (aVMDLDataLoaderNotifyInfo.logInfo != null) {
                                                    Downloader.getInstance().downloadDidSuspened(aVMDLDataLoaderNotifyInfo.logInfo);
                                                    return;
                                                }
                                                return;
                                            default:
                                                switch (i) {
                                                    case 1000:
                                                    case CommonCode.StatusCode.API_CLIENT_EXPIRED:
                                                    case 1002:
                                                    case 1003:
                                                        VideoEventEngineUploader videoEventEngineUploader7 = this.mEngineUploader;
                                                        if (videoEventEngineUploader7 != null) {
                                                            videoEventEngineUploader7.onEvent(aVMDLDataLoaderNotifyInfo.logType, aVMDLDataLoaderNotifyInfo.jsonLog);
                                                            return;
                                                        }
                                                        DataLoaderListener dataLoaderListener10 = this.mListener;
                                                        if (dataLoaderListener10 != null) {
                                                            dataLoaderListener10.onLogInfo(10, aVMDLDataLoaderNotifyInfo.logType, aVMDLDataLoaderNotifyInfo.jsonLog);
                                                            return;
                                                        }
                                                        return;
                                                    default:
                                                        return;
                                                }
                                        }
                                }
                        }
                    } else {
                        VideoEventEngineUploader videoEventEngineUploader8 = this.mEngineUploader;
                        if (videoEventEngineUploader8 != null) {
                            videoEventEngineUploader8.onEvent(aVMDLDataLoaderNotifyInfo.logType, aVMDLDataLoaderNotifyInfo.jsonLog);
                            return;
                        }
                        DataLoaderListener dataLoaderListener11 = this.mListener;
                        if (dataLoaderListener11 != null) {
                            dataLoaderListener11.onLogInfo(5, aVMDLDataLoaderNotifyInfo.logType, aVMDLDataLoaderNotifyInfo.jsonLog);
                            TTVideoEngineLog.m256500d("DataLoaderHelper", "live loader log sample msg: " + aVMDLDataLoaderNotifyInfo.logInfo);
                            return;
                        }
                        return;
                    }
                } else if (FeatureManager.hasPermission("net_speed") && (testSpeedListener = this.mTestSpeedListener) != null && testSpeedListener != null) {
                    testSpeedListener.onNotify(2, aVMDLDataLoaderNotifyInfo.logInfo);
                    return;
                } else {
                    return;
                }
            }
            if (aVMDLDataLoaderNotifyInfo.logInfo != null && aVMDLDataLoaderNotifyInfo.parameter == 3) {
                String str3 = aVMDLDataLoaderNotifyInfo.logInfo;
                Downloader.getInstance().downloadFail(str3, _errorWithCode((int) aVMDLDataLoaderNotifyInfo.code, aVMDLDataLoaderNotifyInfo.parameter, str3));
            } else if (aVMDLDataLoaderNotifyInfo.logInfo != null) {
                TTVideoEngineLog.m256505i("DataLoaderHelper", " task fail log = " + aVMDLDataLoaderNotifyInfo.logInfo + ", code = " + aVMDLDataLoaderNotifyInfo.code + ", task type = " + aVMDLDataLoaderNotifyInfo.parameter);
                String[] split = aVMDLDataLoaderNotifyInfo.logInfo.split(",");
                if (split.length >= 1 && (itemForKey = this.mAllPreloadTasks.itemForKey((str = split[0]))) != null) {
                    DataLoaderTaskQueue dataLoaderTaskQueue = this.mAllPreloadTasks;
                    Error error = new Error("kTTVideoErrorDomainDataLoaderPreload", (int) aVMDLDataLoaderNotifyInfo.code, aVMDLDataLoaderNotifyInfo.logInfo);
                    if (TextUtils.isEmpty(itemForKey.mVideoId)) {
                        str2 = str;
                    } else {
                        str2 = itemForKey.mVideoId;
                    }
                    DataLoaderTaskLoadProgress loadProgressByRawKey = PreloadLoadProgressCenter.center().getLoadProgressByRawKey(str2);
                    if (loadProgressByRawKey == null) {
                        loadProgressByRawKey = new DataLoaderTaskLoadProgress();
                    }
                    loadProgressByRawKey.mVideoId = itemForKey.mVideoId;
                    loadProgressByRawKey.mTaskType = (int) aVMDLDataLoaderNotifyInfo.parameter;
                    loadProgressByRawKey.setUp(itemForKey);
                    loadProgressByRawKey.onError(str, error);
                    DataLoaderListener dataLoaderListener12 = this.mListener;
                    if (dataLoaderListener12 != null) {
                        dataLoaderListener12.onLoadProgress(loadProgressByRawKey);
                    }
                    PreloadLoadProgressCenter.center().putByRawKey(str2, loadProgressByRawKey);
                    if (loadProgressByRawKey.isCacheEnd() || loadProgressByRawKey.isPreloadComplete()) {
                        dataLoaderTaskQueue.popItem(str);
                        TTVideoEngineLog.m256505i("DataLoaderHelper", "pop all task item. videoId = " + itemForKey.mVideoId + " key = " + str);
                        PreloadLoadProgressCenter.center().removeLoadProgressByRawKey(str2);
                        if (this.mListener != null) {
                            DataLoaderTaskProgressInfo dataLoaderTaskProgressInfo = new DataLoaderTaskProgressInfo();
                            dataLoaderTaskProgressInfo.mTaskType = (int) aVMDLDataLoaderNotifyInfo.parameter;
                            dataLoaderTaskProgressInfo.mVideoId = itemForKey.mVideoId;
                            dataLoaderTaskProgressInfo.mKey = str;
                            if (!(itemForKey.mURLItem == null || itemForKey.mURLItem.getFilePath() == null)) {
                                dataLoaderTaskProgressInfo.mLocalFilePath = itemForKey.mURLItem.getFilePath();
                                dataLoaderTaskProgressInfo.mKey = null;
                            }
                            this.mListener.onTaskProgress(dataLoaderTaskProgressInfo);
                        }
                        if (itemForKey.getCallBackListener() != null && aVMDLDataLoaderNotifyInfo.parameter == 2) {
                            PreLoaderItemCallBackInfo preLoaderItemCallBackInfo = new PreLoaderItemCallBackInfo(3);
                            preLoaderItemCallBackInfo.preloadError = error;
                            preLoaderItemCallBackInfo.loadProgress = loadProgressByRawKey;
                            preLoaderItemCallBackInfo.preloadDataInfo = null;
                            itemForKey.getCallBackListener().preloadItemInfo(preLoaderItemCallBackInfo);
                        }
                    }
                }
            }
        }
    }

    public void removeMedia(String str, String str2) {
        _ml_removeMedia(str, str2);
    }

    /* access modifiers changed from: package-private */
    public class MySelectBitrateListener implements ISelectBitrateListener {
        private ISelectBitrateCallback mCallback;

        MySelectBitrateListener(ISelectBitrateCallback iSelectBitrateCallback) {
            this.mCallback = iSelectBitrateCallback;
        }

        public String selectBitrateJsonString(String str, int i) {
            Map<String, Integer> selectBitrate;
            ISelectBitrateCallback iSelectBitrateCallback = this.mCallback;
            if (iSelectBitrateCallback == null || (selectBitrate = iSelectBitrateCallback.selectBitrate(i)) == null) {
                return null;
            }
            return new JSONObject(selectBitrate).toString();
        }
    }

    public String generateSubUrlKey(String str, String str2) {
        return AVMDLDataLoader.makeTsFileKey(str, str2);
    }

    public void _doMl_removeAllMedias(String str, int i) {
        StrategyHelper.helper().getCenter().mo70636a(str, i);
    }

    public void _doMl_removeMedia(String str, String str2) {
        StrategyHelper.helper().getCenter().mo70639a(str, str2);
    }

    public void notifyPreloadCancelled(String str, String str2) {
        DataLoaderListener dataLoaderListener = this.mListener;
        if (dataLoaderListener != null) {
            dataLoaderListener.onNotify(8, 0, 0, str);
        }
    }

    public String proxyUrl(String str, String str2) {
        return proxyUrl(str, str, new String[]{str2}, null, null);
    }

    public void removeAllPreloadMedia(String str, int i) {
        if (this.mMdlPreloadStrategy == 200) {
            _ml_removeAllMedias(str, i);
        }
    }

    private String[] _addP2pFlag(boolean z, String[] strArr) {
        if (!z) {
            return strArr;
        }
        for (int i = 0; i < strArr.length; i++) {
            if (!TextUtils.isEmpty(strArr[i])) {
                strArr[i] = TTHelper.appendQueryString(strArr[i], "p2p=0");
            }
        }
        return strArr;
    }

    private void _ml_addMedia(PreloadModelMedia preloadModelMedia, String str) {
        if (preloadModelMedia == null) {
            return;
        }
        if (this.mediaOperateThread != null) {
            ArrayList<Object> arrayList = new ArrayList<>();
            arrayList.add(this);
            arrayList.add(preloadModelMedia);
            arrayList.add(str);
            this.mediaOperateThread.postMessage(arrayList, SmEvents.EVENT_NT);
            return;
        }
        _doMl_addMedia(preloadModelMedia, str);
    }

    private void _ml_removeMedia(String str, String str2) {
        if (this.mediaOperateThread != null) {
            ArrayList<Object> arrayList = new ArrayList<>();
            arrayList.add(this);
            arrayList.add(str);
            arrayList.add(str2);
            this.mediaOperateThread.postMessage(arrayList, SmEvents.EVENT_NE_RR);
            return;
        }
        _doMl_removeMedia(str, str2);
    }

    public void setBackUpIP(String str, String str2) {
        AVMDLDNSParser.getInstance().setBackUpIP(str, str2);
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            this.mEnableBackupIP = 1;
        }
    }

    public void setCacheInfoLists(String[] strArr, long[] jArr) {
        TTVideoEngineLog.m256500d("DataLoaderHelper", "setcustom paths and maxcaches ");
        this.mLock.lock();
        try {
            this.mConfigure.setCacheInfoList(strArr, jArr);
        } finally {
            this.mLock.unlock();
        }
    }

    private void _ml_removeAllMedias(String str, int i) {
        if (this.mediaOperateThread != null) {
            ArrayList<Object> arrayList = new ArrayList<>();
            arrayList.add(this);
            arrayList.add(str);
            arrayList.add(Integer.valueOf(i));
            this.mediaOperateThread.postMessage(arrayList, SmEvents.EVENT_RE);
            return;
        }
        _doMl_removeAllMedias(str, i);
    }

    private String[] addMdlFlag(String[] strArr, String str) {
        if (strArr == null || strArr.length == 0 || P2PStragetyManager.getInstance().isAllowP2p(str) == 1) {
            return strArr;
        }
        for (int i = 0; i < strArr.length; i++) {
            if (!TextUtils.isEmpty(strArr[i])) {
                strArr[i] = TTHelper.appendQueryString(strArr[i], "p2p=0");
            }
        }
        return strArr;
    }

    public void focusMedia(String str, int i) {
        if (this.mediaOperateThread != null) {
            ArrayList<Object> arrayList = new ArrayList<>();
            arrayList.add(this);
            arrayList.add(str);
            arrayList.add(Integer.valueOf(i));
            this.mediaOperateThread.postMessage(arrayList, SmEvents.EVENT_TO);
            return;
        }
        StrategyHelper.helper().getCenter().mo70645b(str, i);
    }

    public void _addEngine(TTVideoEngine tTVideoEngine, String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                this.mEngineLock.lock();
                ArrayList<TTVideoEngine> arrayList = this.mAllUsingEngies.get(str);
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                    this.mAllUsingEngies.put(str, arrayList);
                }
                if (!arrayList.contains(tTVideoEngine)) {
                    arrayList.add(tTVideoEngine);
                    TTVideoEngineLog.m256505i("DataLoaderHelper", "add engine ref,rawKey = " + str + " engine ref count: " + arrayList.size());
                }
            } finally {
                this.mEngineLock.unlock();
            }
        }
    }

    public void _doMl_addMedia(PreloadModelMedia preloadModelMedia, String str) {
        if (preloadModelMedia != null) {
            MySelectBitrateListener mySelectBitrateListener = null;
            if (preloadModelMedia.getSelectCallback() != null) {
                mySelectBitrateListener = new MySelectBitrateListener(preloadModelMedia.getSelectCallback());
            }
            String mediaInfoJsonString = preloadModelMedia.mVideoModel.toMediaInfoJsonString();
            if (preloadModelMedia.getExtraInfo() != null) {
                JSONObject mediaInfo = preloadModelMedia.mVideoModel.getMediaInfo();
                try {
                    mediaInfo.put("sc_extra", new JSONObject(preloadModelMedia.getExtraInfo()));
                    mediaInfoJsonString = mediaInfo.toString();
                } catch (JSONException e) {
                    TTVideoEngineLog.m256501d(e);
                }
            }
            StrategyHelper.helper().getCenter().mo70638a(mediaInfoJsonString, mySelectBitrateListener, str, preloadModelMedia.isLast);
        }
    }

    public void _removeEngine(TTVideoEngine tTVideoEngine, String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                this.mEngineLock.lock();
                ArrayList<TTVideoEngine> arrayList = this.mAllUsingEngies.get(str);
                if (arrayList != null) {
                    arrayList.remove(tTVideoEngine);
                    TTVideoEngineLog.m256505i("DataLoaderHelper", "remove engine ref,rawKey = " + str + " engine ref count: " + arrayList.size());
                    if (arrayList.size() == 0) {
                        this.mAllUsingEngies.remove(str);
                    }
                }
            } finally {
                this.mEngineLock.unlock();
            }
        }
    }

    public void addPreloadMedias(List<PreloadMedia> list, String str) {
        if (FeatureManager.hasPermission("preload") && list != null) {
            if (str == null) {
                str = PreloadConfig.share().getCurrentSceneId();
            }
            TTVideoEngineLog.m256505i("DataLoaderHelper", "[preload] add preload  mediaList ,size = " + list.size() + "sceneId = " + str);
            for (int i = 0; i < list.size(); i++) {
                PreloadMedia preloadMedia = list.get(i);
                preloadMedia.mSceneId = str;
                if (preloadMedia instanceof PreloadURLMedia) {
                    addPreloadUrlMedia((PreloadURLMedia) preloadMedia);
                } else if (preloadMedia instanceof PreloadModelMedia) {
                    if (i == list.size() - 1) {
                        ((PreloadModelMedia) preloadMedia).isLast = true;
                    }
                    addPreloadModelMedia((PreloadModelMedia) preloadMedia);
                }
            }
        }
    }

    public void setIntValueSync(int i, int i2) {
        this.mLock.lock();
        if (this.mInnerDataLoader == null) {
            this.mLock.unlock();
            TTVideoEngineLog.m256500d("DataLoaderHelper", "setIntValueSync failed, key = " + i + ", value = " + i2);
            return;
        }
        TTVideoEngineLog.m256500d("DataLoaderHelper", "setIntValueSync key = " + i + ", value = " + i2);
        if (i != 2103) {
            if (i == 2105 && i2 >= 0) {
                try {
                    this.mInnerDataLoader.setIntValue(11005, i2);
                } catch (Exception e) {
                    e.printStackTrace();
                } catch (Throwable th) {
                    this.mLock.unlock();
                    throw th;
                }
            }
        } else if (i2 >= 0) {
            this.mInnerDataLoader.setIntValue(11003, i2);
        }
        this.mLock.unlock();
    }

    public void setStringValueSync(int i, String str) {
        if (!TextUtils.isEmpty(str)) {
            this.mLock.lock();
            if (this.mInnerDataLoader == null) {
                this.mLock.unlock();
                TTVideoEngineLog.m256500d("DataLoaderHelper", "setStringValueSync failed, key = " + i + ", value = " + str);
                return;
            }
            TTVideoEngineLog.m256500d("DataLoaderHelper", "setStringValueSync key = " + i + ", value = " + str);
            if (i == 2106) {
                try {
                    this.mInnerDataLoader.setStringValue(11006, str);
                } catch (Exception e) {
                    e.printStackTrace();
                } catch (Throwable th) {
                    this.mLock.unlock();
                    throw th;
                }
            }
            this.mLock.unlock();
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:29|30) */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0074, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        com.ss.ttvideoengine.utils.TTVideoEngineLog.m256503e("DataLoaderHelper", "setLongValue failed, key: " + r4 + ", value: " + r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0094, code lost:
        r3.mLock.unlock();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0099, code lost:
        throw r4;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0076 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setLongValue(int r4, long r5) {
        /*
        // Method dump skipped, instructions count: 172
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttvideoengine.DataLoaderHelper.setLongValue(int, long):void");
    }

    public void setStringValue(int i, String str) {
        TTVideoEngineLog.m256500d("DataLoaderHelper", "setStringValue key = " + i + ", value = " + str);
        this.mLock.lock();
        if (i == 0) {
            this.mConfigure.mCacheDir = str;
        } else if (i == 102) {
            this.mConfigure.mNetCacheDir = str;
        } else if (i == 111) {
            this.mConfigure.mDownloadDir = str;
        } else if (i == 514) {
            this.mConfigure.mLiveContainerString = str;
        } else if (i == 1149) {
            this.mConfigure.mNetSchedulerConfigStr = str;
        } else if (i == 1165) {
            this.mConfigure.mDynamicPreconnectConfigStr = str;
        } else if (i == 1500) {
            this.mConfigure.mMdlExtensionOptsStr = str;
        } else if (i == 2101) {
            this.mConfigure.mVdpExtGlobalInfo = str;
        } else if (i == 9010) {
            this.mConfigure.mSocketTraingCenterConfigStr = str;
        } else if (i == 9012) {
            this.mConfigure.mP2PConfigStr = str;
        } else if (i == 107) {
            AVMDLDNSParser.setStringValue(8, str);
        } else if (i == 108) {
            AVMDLDNSParser.setStringValue(9, str);
        } else if (i == 1106) {
            this.mConfigure.mVdpABTestId = str;
        } else if (i != 1107) {
            switch (i) {
                case ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED:
                    this.mConfigure.mSettingsDomain = str;
                    break;
                case ConnectionResult.RESTRICTED_PROFILE:
                    this.mConfigure.mDmDomain = str;
                    break;
                case ConnectionResult.SERVICE_UPDATING:
                    this.mConfigure.mForesightDomain = str;
                    break;
                case ConnectionResult.SIGN_IN_FAILED:
                    this.mConfigure.mDomains = str;
                    break;
                case 9006:
                    this.mConfigure.mKeyDomain = str;
                    break;
                case 9007:
                    try {
                        this.mConfigure.mKeyToken = str;
                        break;
                    } catch (Exception e) {
                        TTVideoEngineLog.m256501d(e);
                        break;
                    } catch (Throwable th) {
                        this.mLock.unlock();
                        throw th;
                    }
            }
        } else {
            this.mConfigure.mVdpGroupId = str;
        }
        this.mLock.unlock();
    }

    public void updateDnsInfo(JSONObject jSONObject, long j) {
        String next;
        if (jSONObject == null) {
            TTVideoEngineLog.m256503e("DataLoaderHelper", "ip direct info invalid");
        } else if (NetUtils.netUpdateTimeMs == -1 || 1000 * j >= NetUtils.netUpdateTimeMs) {
            this.mLock.lock();
            try {
                Iterator<String> keys = jSONObject.keys();
                do {
                    next = keys.next();
                    JSONArray optJSONArray = jSONObject.optJSONArray(next);
                    String str = "";
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        str = str + optJSONArray.optString(i);
                        if (i < optJSONArray.length() - 1) {
                            str = str + ",";
                        }
                    }
                    AVMDLDNSParser.updateDNSInfo(next, str, j);
                    if (!keys.hasNext()) {
                        break;
                    }
                } while (!TextUtils.isEmpty(next));
            } catch (Exception e) {
                TTVideoEngineLog.m256503e("DataLoaderHelper", e.toString());
            } catch (Throwable th) {
                this.mLock.unlock();
                throw th;
            }
            this.mLock.unlock();
        } else {
            TTVideoEngineLog.m256503e("DataLoaderHelper", "network did change, dnsinfo is invalid");
        }
    }

    private void _prepareUrlInfo(VideoInfo videoInfo, DataLoaderTaskItem dataLoaderTaskItem) {
        if (videoInfo == null || dataLoaderTaskItem == null) {
            TTVideoEngineLog.m256503e("DataLoaderHelper", "[preload] prepare url info fail. info or taskItem is null");
            return;
        }
        String[] valueStrArr = videoInfo.getValueStrArr(16);
        String valueStr = videoInfo.getValueStr(15);
        DataLoaderTaskItem.TrackItem addTrackItemByKey = dataLoaderTaskItem.addTrackItemByKey(valueStr);
        if (valueStrArr == null || valueStrArr.length < 1) {
            TTVideoEngineLog.m256503e("DataLoaderHelper", "[preload] url info, urls info invalid");
            dataLoaderTaskItem._notifyError(-100001);
            return;
        }
        String[] strArr = (String[]) valueStrArr.clone();
        boolean z = false;
        if (dataLoaderTaskItem.mVidItem != null) {
            z = dataLoaderTaskItem.mVidItem.mForbidP2p;
        } else if (dataLoaderTaskItem.mVideoModelItem != null) {
            z = dataLoaderTaskItem.mVideoModelItem.mForbidP2p;
        }
        String[] _addP2pFlag = _addP2pFlag(z, strArr);
        String str = null;
        if (dataLoaderTaskItem.mVidItem != null && dataLoaderTaskItem.mVidItem.getFilePathListener() != null && !TextUtils.isEmpty(valueStr)) {
            String cacheFilePath = dataLoaderTaskItem.mVidItem.getFilePathListener().cacheFilePath(dataLoaderTaskItem.mVideoId, videoInfo);
            if (!TextUtils.isEmpty(cacheFilePath) && cacheFilePath.contains(valueStr)) {
                str = cacheFilePath;
            }
            if (!TextUtils.isEmpty(str)) {
                valueStr = TTHelper.keyFromFilePath(this.mContext, str);
            }
        } else if (!(dataLoaderTaskItem.mVideoModelItem == null || dataLoaderTaskItem.mVideoModelItem.getFilePathListener() == null || TextUtils.isEmpty(valueStr))) {
            String cacheFilePath2 = dataLoaderTaskItem.mVideoModelItem.getFilePathListener().cacheFilePath(dataLoaderTaskItem.mVideoId, videoInfo);
            if (!TextUtils.isEmpty(cacheFilePath2) && cacheFilePath2.contains(valueStr)) {
                str = cacheFilePath2;
            }
            if (!TextUtils.isEmpty(str)) {
                valueStr = TTHelper.keyFromFilePath(this.mContext, str);
            }
        }
        StringBuffer stringBuffer = new StringBuffer();
        String valueStr2 = videoInfo.getValueStr(28);
        String str2 = "";
        if (valueStr2 == null) {
            valueStr2 = str2;
        }
        String valueStr3 = videoInfo.getValueStr(29);
        if (valueStr3 != null) {
            str2 = valueStr3;
        }
        int valueInt = videoInfo.getValueInt(3);
        stringBuffer.append("fileId=");
        stringBuffer.append(valueStr2);
        stringBuffer.append("&bitrate=");
        stringBuffer.append(valueInt);
        stringBuffer.append("&pcrc=");
        stringBuffer.append(TTHelper.encodeUrl(str2));
        stringBuffer.append("&tag=");
        stringBuffer.append(TTHelper.encodeUrl(dataLoaderTaskItem.mTag));
        if (!TextUtils.isEmpty(dataLoaderTaskItem.mSubTag)) {
            stringBuffer.append("&stag=");
            stringBuffer.append(TTHelper.encodeUrl(dataLoaderTaskItem.mSubTag));
        }
        if (addTrackItemByKey == null) {
            addTrackItemByKey = dataLoaderTaskItem.addTrackItemByKey(valueStr);
        }
        if (addTrackItemByKey == null) {
            dataLoaderTaskItem._notifyError(-100001);
            return;
        }
        addTrackItemByKey.mTaskKey = valueStr;
        addTrackItemByKey.mVideoInfo = videoInfo;
        addTrackItemByKey.mDecryptionKey = videoInfo.getValueStr(5);
        addTrackItemByKey.mUsingResolution = videoInfo.getResolution();
        addTrackItemByKey.mUrls = _addP2pFlag;
        addTrackItemByKey.mLocalFilePath = str;
        addTrackItemByKey.mExternalInfo = stringBuffer.toString();
        TTVideoEngineLog.m256500d("DataLoaderHelper", "[preload] prepare url info. videoId = " + dataLoaderTaskItem.mVideoId + ", key is " + valueStr + ", resolution = " + addTrackItemByKey.mUsingResolution.toString());
    }

    public void addTask(String str, PreloaderVidItem preloaderVidItem) {
        if (this.mState == 0) {
            if (preloaderVidItem == null || TextUtils.isEmpty(preloaderVidItem.mVideoId)) {
                TTVideoEngineLog.m256503e("DataLoaderHelper", "videoId invalid.");
                return;
            }
            TTVideoEngineLog.m256505i("DataLoaderHelper", String.format("addTask key is %s; videoId = %s", str, preloaderVidItem.mVideoId));
            this.mLock.lock();
            try {
                _addTask(str, preloaderVidItem.mVideoId, preloaderVidItem.mPreloadSize, preloaderVidItem, null, null);
            } finally {
                this.mLock.unlock();
            }
        }
    }

    private void _progressInfoString(AVMDLDataLoaderNotifyInfo aVMDLDataLoaderNotifyInfo, boolean z) {
        DataLoaderTaskQueue dataLoaderTaskQueue;
        DataLoaderTaskItem dataLoaderTaskItem;
        String str;
        int i;
        DataLoaderTaskItem.TrackItem trackItem;
        String str2;
        String str3;
        if (aVMDLDataLoaderNotifyInfo != null && !TextUtils.isEmpty(aVMDLDataLoaderNotifyInfo.logInfo)) {
            String[] split = aVMDLDataLoaderNotifyInfo.logInfo.split(",");
            if (split.length >= 4) {
                try {
                    long longValue = Long.valueOf(split[0]).longValue();
                    long longValue2 = Long.valueOf(split[1]).longValue();
                    if (longValue2 > 0 || aVMDLDataLoaderNotifyInfo.what == 4) {
                        String str4 = split[2];
                        String str5 = split[3];
                        if (z) {
                            dataLoaderTaskItem = this.mAllPreloadTasks.itemForKey(str4);
                            if (dataLoaderTaskItem == null) {
                                TTVideoEngineLog.m256505i("DataLoaderHelper", "[preload] preload temItem == null return " + aVMDLDataLoaderNotifyInfo.logInfo);
                                if (aVMDLDataLoaderNotifyInfo.what == 4) {
                                    DataLoaderTaskProgressInfo dataLoaderTaskProgressInfo = new DataLoaderTaskProgressInfo();
                                    dataLoaderTaskProgressInfo.mCacheSizeFromZero = longValue;
                                    dataLoaderTaskProgressInfo.mMediaSize = longValue2;
                                    dataLoaderTaskProgressInfo.mKey = str4;
                                    dataLoaderTaskProgressInfo.mTaskType = 2;
                                    dataLoaderTaskProgressInfo.mLocalFilePath = str5;
                                    DataLoaderListener dataLoaderListener = this.mListener;
                                    if (dataLoaderListener != null) {
                                        dataLoaderListener.onTaskProgress(dataLoaderTaskProgressInfo);
                                        TTVideoEngineLog.m256505i("DataLoaderHelper", " task progress. cache end. key = " + str4);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            dataLoaderTaskQueue = this.mAllPreloadTasks;
                        } else {
                            dataLoaderTaskItem = this.mAllPlayTasks.itemForKey(str4);
                            if (dataLoaderTaskItem == null) {
                                TTVideoEngineLog.m256505i("DataLoaderHelper", "[preload] play temItem == null return " + aVMDLDataLoaderNotifyInfo.logInfo);
                                return;
                            }
                            dataLoaderTaskQueue = this.mAllPlayTasks;
                        }
                        if (dataLoaderTaskItem != null) {
                            DataLoaderTaskItem.TrackItem trackItem2 = dataLoaderTaskItem.getTrackItem(str4);
                            if (trackItem2 != null) {
                                trackItem2.mMediaSize = longValue2;
                                trackItem2.mCacheSize = longValue;
                                trackItem2.mLocalFilePath = str5;
                            }
                            if (TextUtils.isEmpty(dataLoaderTaskItem.mVideoId)) {
                                str = str4;
                            } else {
                                str = dataLoaderTaskItem.mVideoId;
                            }
                            DataLoaderTaskLoadProgress loadProgressByRawKey = PreloadLoadProgressCenter.center().getLoadProgressByRawKey(str);
                            if (loadProgressByRawKey == null) {
                                loadProgressByRawKey = new DataLoaderTaskLoadProgress();
                            }
                            loadProgressByRawKey.mVideoId = dataLoaderTaskItem.mVideoId;
                            if (z) {
                                i = 2;
                            } else {
                                i = 1;
                            }
                            loadProgressByRawKey.mTaskType = i;
                            loadProgressByRawKey.setUp(dataLoaderTaskItem);
                            if (longValue2 != longValue || trackItem2 == null || trackItem2.mVideoInfo == null) {
                                str2 = " task progress. cache end. key = ";
                                trackItem = trackItem2;
                            } else {
                                StringBuilder sb = new StringBuilder();
                                str2 = " task progress. cache end. key = ";
                                sb.append("[preload] ");
                                trackItem = trackItem2;
                                if (trackItem2.mVideoInfo.getMediatype() == VideoRef.TYPE_AUDIO) {
                                    str3 = "Audio";
                                } else {
                                    str3 = "Video";
                                }
                                sb.append(str3);
                                sb.append(" cache complete key: ");
                                sb.append(str4);
                                TTVideoEngineLog.m256505i("DataLoaderHelper", sb.toString());
                            }
                            DataLoaderListener dataLoaderListener2 = this.mListener;
                            if (dataLoaderListener2 != null) {
                                dataLoaderListener2.onLoadProgress(loadProgressByRawKey);
                            }
                            PreloadLoadProgressCenter.center().putByRawKey(str, loadProgressByRawKey);
                            if (loadProgressByRawKey.isCacheEnd() || ((z && loadProgressByRawKey.isPreloadComplete()) || aVMDLDataLoaderNotifyInfo.what == 4)) {
                                dataLoaderTaskQueue.popItem(str4);
                                PreloadLoadProgressCenter.center().removeLoadProgressByRawKey(str);
                                if (!z) {
                                    TTVideoEngineLog.m256505i("DataLoaderHelper", "[preload] notify vid cache end key: " + str);
                                    _cacheEndNotifyEngine(dataLoaderTaskItem);
                                }
                                DataLoaderTaskProgressInfo dataLoaderTaskProgressInfo2 = new DataLoaderTaskProgressInfo();
                                dataLoaderTaskProgressInfo2.mCacheSizeFromZero = longValue;
                                dataLoaderTaskProgressInfo2.mMediaSize = longValue2;
                                dataLoaderTaskProgressInfo2.mKey = str4;
                                dataLoaderTaskProgressInfo2.mLocalFilePath = str5;
                                dataLoaderTaskProgressInfo2.mResolution = trackItem.mUsingResolution;
                                dataLoaderTaskProgressInfo2.mDecryptionKey = trackItem.mDecryptionKey;
                                dataLoaderTaskProgressInfo2.mUsingVideoInfo = trackItem.mVideoInfo;
                                dataLoaderTaskProgressInfo2.mVideoId = dataLoaderTaskItem.mVideoId;
                                dataLoaderTaskProgressInfo2.mTaskType = loadProgressByRawKey.mTaskType;
                                if (dataLoaderTaskItem.getCallBackListener() != null && z) {
                                    PreLoaderItemCallBackInfo preLoaderItemCallBackInfo = new PreLoaderItemCallBackInfo(2);
                                    preLoaderItemCallBackInfo.preloadDataInfo = dataLoaderTaskProgressInfo2;
                                    preLoaderItemCallBackInfo.loadProgress = loadProgressByRawKey;
                                    dataLoaderTaskItem.getCallBackListener().preloadItemInfo(preLoaderItemCallBackInfo);
                                    TTVideoEngineLog.m256505i("DataLoaderHelper", "[preload] notify end cache size = " + loadProgressByRawKey.getTotalCacheSize());
                                }
                                DataLoaderListener dataLoaderListener3 = this.mListener;
                                if (dataLoaderListener3 != null) {
                                    dataLoaderListener3.onTaskProgress(dataLoaderTaskProgressInfo2);
                                    TTVideoEngineLog.m256505i("DataLoaderHelper", str2 + str4 + ", rawKey = " + str);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    TTVideoEngineLog.m256505i("DataLoaderHelper", "[preload] mediaSize <= 0 return " + aVMDLDataLoaderNotifyInfo.logInfo);
                } catch (Exception e) {
                    TTVideoEngineLog.m256501d(e);
                }
            }
        }
    }

    private void _startMDLPreloadTask(DataLoaderTaskItem dataLoaderTaskItem, DataLoaderTaskItem.TrackItem trackItem) {
        boolean z;
        boolean z2;
        if (dataLoaderTaskItem == null || trackItem == null) {
            TTVideoEngineLog.m256503e("DataLoaderHelper", "[preload] start mdl preload task fail. track is null");
            return;
        }
        TTVideoEngineLog.m256505i("DataLoaderHelper", "[preload] start mdl preload task.  key = " + trackItem.mTaskKey);
        String str = trackItem.mCustomHeader;
        String str2 = trackItem.mTaskKey;
        if (dataLoaderTaskItem.mURLItem != null && dataLoaderTaskItem.mURLItem.getProvider() != null) {
            trackItem.mProxyUrl = proxyQueryProvideMode(str2, dataLoaderTaskItem.mVideoId, dataLoaderTaskItem.mPriorityLevel, 1);
            if (!TextUtils.isEmpty(trackItem.mProxyUrl)) {
                this.mAllPreloadTasks.popItem(str2);
                this.mAllPreloadTasks.enqueueItem(dataLoaderTaskItem);
                if (trackItem.mPreloadOffset > 0 && trackItem.mPreloadOffset < trackItem.mPreloadHeaderSize + 102400) {
                    trackItem.mPreSize += trackItem.mPreloadOffset;
                    trackItem.mPreloadOffset = 0;
                }
                TTVideoEngineLog.m256505i("DataLoaderHelper", "[preload] preload offset " + trackItem.mPreloadOffset + " header size = " + trackItem.mPreloadHeaderSize + " preload size = " + trackItem.mPreSize);
                if (trackItem.mPreloadOffset > 0) {
                    if (trackItem.mPreloadHeaderSize > 0) {
                        this.mInnerDataLoader.preloadResource(trackItem.mProxyUrl, (int) trackItem.mPreloadHeaderSize);
                    }
                    this.mInnerDataLoader.preloadResource(trackItem.mProxyUrl, (int) trackItem.mPreloadOffset, (int) trackItem.mPreSize);
                } else {
                    this.mInnerDataLoader.preloadResource(trackItem.mProxyUrl, (int) trackItem.mPreSize);
                }
            } else {
                dataLoaderTaskItem._notifyError(-100001);
            }
            TTVideoEngineLog.m256505i("DataLoaderHelper", String.format("[preload] exect preload task by provider mode, key is %s; videoId = %s proxyurl:%s", str2, dataLoaderTaskItem.mVideoId, trackItem.mProxyUrl));
        } else if (trackItem.mUrls != null) {
            String[] strArr = trackItem.mUrls;
            if (dataLoaderTaskItem.mResponseData != null) {
                z = dataLoaderTaskItem.mResponseData.hasFormat(IVideoModel.Format.HLS);
            } else {
                z = false;
            }
            if (strArr.length <= 0 || !strArr[0].toLowerCase().contains(".m3u")) {
                z2 = z;
            } else {
                z2 = true;
            }
            if (dataLoaderTaskItem.mTag != null) {
                if (trackItem.mExternalInfo == null) {
                    trackItem.mExternalInfo = "tag=" + TTHelper.encodeUrl(dataLoaderTaskItem.mTag);
                } else {
                    trackItem.mExternalInfo += "&tag=" + TTHelper.encodeUrl(dataLoaderTaskItem.mTag);
                }
            }
            if (dataLoaderTaskItem.mSubTag != null) {
                if (trackItem.mExternalInfo == null) {
                    trackItem.mExternalInfo = "stag=" + TTHelper.encodeUrl(dataLoaderTaskItem.mSubTag);
                } else {
                    trackItem.mExternalInfo += "&stag=" + TTHelper.encodeUrl(dataLoaderTaskItem.mSubTag);
                }
            }
            trackItem.mProxyUrl = preloadProxyQuery(str2, dataLoaderTaskItem.mVideoId, trackItem.mPreloadOffset, 0, strArr, trackItem.mLocalFilePath, trackItem.mExternalInfo, dataLoaderTaskItem.mPriorityLevel, str, z2, null);
            if (!TextUtils.isEmpty(trackItem.mProxyUrl)) {
                this.mAllPreloadTasks.popItem(str2);
                this.mAllPreloadTasks.enqueueItem(dataLoaderTaskItem);
                if (trackItem.mPreloadOffset > 0 && trackItem.mPreloadOffset < trackItem.mPreloadHeaderSize + 102400) {
                    trackItem.mPreSize += trackItem.mPreloadOffset;
                    trackItem.mPreloadOffset = 0;
                }
                TTVideoEngineLog.m256505i("DataLoaderHelper", "[preload] preload offset " + trackItem.mPreloadOffset + " header size = " + trackItem.mPreloadHeaderSize + " preload size = " + trackItem.mPreSize);
                if (trackItem.mPreloadOffset > 0) {
                    if (trackItem.mPreloadHeaderSize > 0) {
                        this.mInnerDataLoader.preloadResource(trackItem.mProxyUrl, (int) trackItem.mPreloadHeaderSize);
                    }
                    this.mInnerDataLoader.preloadResource(trackItem.mProxyUrl, (int) trackItem.mPreloadOffset, (int) trackItem.mPreSize);
                } else {
                    this.mInnerDataLoader.preloadResource(trackItem.mProxyUrl, (int) trackItem.mPreSize);
                }
                TTVideoEngineLog.m256505i("DataLoaderHelper", String.format("[preload] exect preload task ,key is %s; videoId = %s", trackItem.mTaskKey, dataLoaderTaskItem.mVideoId));
                return;
            }
            dataLoaderTaskItem._notifyError(-100001);
        } else {
            dataLoaderTaskItem._notifyError(-100001);
        }
    }

    public void setIntValue(int i, int i2) {
        this.mLock.lock();
        TTVideoEngineLog.m256500d("DataLoaderHelper", "setIntValue key = " + i + ", value = " + i2);
        boolean z = true;
        if (i == 1) {
            this.mConfigure.mMaxCacheSize = i2;
        } else if (i == 2) {
            this.mConfigure.mRWTimeOut = i2;
        } else if (i == 3) {
            this.mConfigure.mOpenTimeOut = i2;
        } else if (i == 4) {
            this.mConfigure.mTryCount = i2;
        } else if (i == 5) {
            this.mConfigure.mLoaderType = i2;
        } else if (i == 7) {
            this.mConfigure.mEnableExternDNS = i2;
        } else if (i == 8) {
            this.mConfigure.mEnableSocketReuse = i2;
        } else if (i == 9) {
            this.mConfigure.mSocketIdleTimeOut = i2;
        } else if (i == 55) {
            this.mConfigure.mMaxCacheAge = i2;
        } else if (i == 56) {
            this.mConfigure.mEnableMaxCacheAgeForAllDir = i2;
        } else if (i == 60) {
            this.mConfigure.mEnablePreloadReUse = i2;
        } else if (i == 61) {
            this.mHeartBeatInterval = i2;
        } else if (i == 109) {
            P2PStragetyManager.getInstance().minNetSpeed = i2;
        } else if (i == 110) {
            P2PStragetyManager.getInstance().minNetworkLevel = i2;
        } else if (i == 112) {
            this.mConfigure.mSpeedSampleInterval = i2;
        } else if (i != 113) {
            switch (i) {
                case 11:
                    this.mConfigure.mPreloadParallelNum = i2;
                    AVMDLDataLoader aVMDLDataLoader = this.mInnerDataLoader;
                    if (aVMDLDataLoader != null) {
                        aVMDLDataLoader.setIntValue(102, i2);
                        break;
                    }
                    break;
                case HwBuildEx.VersionCodes.EMUI_5_1:
                    if (i2 >= 100) {
                        this.mMdlOldPreloadStrategy = this.mConfigure.mPreloadStrategy;
                        this.mConfigure.mPreloadStrategy = 100;
                    } else {
                        this.mMdlOldPreloadStrategy = this.mConfigure.mPreloadStrategy;
                        this.mConfigure.mPreloadStrategy = i2;
                    }
                    this.mMdlPreloadStrategy = i2;
                    if (i2 == 200) {
                        this.mConfigure.mEnableIOManager = 1;
                        break;
                    }
                    break;
                case 13:
                    this.mConfigure.mCheckSumLevel = i2;
                    break;
                case 14:
                    this.mConfigure.mTestSpeedTypeVersion = i2;
                    break;
                case 15:
                    this.mNeedDLLoadP2PLib = i2;
                    break;
                case 16:
                    this.mConfigure.mLoaderFactoryP2PLevel = i2;
                    break;
                case 17:
                    TTVideoEngineLog.m256505i("DataLoaderHelper", "set write file notify intervalMS " + i2);
                    this.mConfigure.mWriteFileNotifyIntervalMS = i2;
                    break;
                case 18:
                    this.mPreloadTaskIgnorePlayerStall = i2;
                    break;
                case 19:
                    this.mFloatSize = i2;
                    break;
                case 20:
                    this.mPreloadPreConnect = i2;
                    break;
                case 21:
                    this.mConfigure.mEnableDownloaderLog = i2;
                    break;
                case 22:
                    this.mConfigure.mEnableTTNetLoader = i2;
                    break;
                case 23:
                    this.mConfigure.mTTNetLoaderCronetBufSizeKB = i2;
                    break;
                case 30:
                    this.mConfigure.mEncryptVersion = i2;
                    break;
                case MmListControl.f116813f:
                    this.mConfigure.mIsCloseFileCache = i2;
                    break;
                case CalendarSearchResultRv.f82651b:
                    this.mConfigure.mPreloadWaitListType = i2;
                    break;
                case 119:
                    SettingsHelper.helper().setEnable(i2);
                    break;
                case SmActions.ACTION_INIT_ENTRY:
                    this.mConfigure.mUseNewSpeedTestForSingle = i2;
                    break;
                case LocationRequest.PRIORITY_HD_ACCURACY:
                    this.mConfigure.mEnableEventInfo = i2;
                    break;
                case ParticipantRepo.f117150c:
                    this.mConfigure.mLiveP2pAllow = i2;
                    break;
                case 501:
                    this.mConfigure.mLiveLoaderType = i2;
                    break;
                case 502:
                    this.mConfigure.mLiveLoaderEnable = i2;
                    break;
                case 505:
                    this.mConfigure.mLiveWatchDurationThreshold = i2;
                    break;
                case 506:
                    this.mConfigure.mLiveCacheThresholdHttpToP2p = i2;
                    break;
                case 507:
                    this.mConfigure.mLiveCacheThresholdP2pToHttp = i2;
                    break;
                case 508:
                    this.mConfigure.mLiveMaxTrySwitchP2pTimes = i2;
                    break;
                case 509:
                    this.mConfigure.mLiveWaitP2pReadyThreshold = i2;
                    break;
                case MediaPlayer.MEDIA_PLAYER_OPTION_LICENSE_DIR:
                    this.mConfigure.mLiveMobileUploadAllow = i2;
                    break;
                case MediaPlayer.MEDIA_PLAYER_OPTION_LICENSE_FILENAME:
                    this.mConfigure.mLiveMobileDownloadAllow = i2;
                    break;
                case MediaPlayer.MEDIA_PLAYER_OPTION_APPID:
                    this.mConfigure.mAlogEnable = i2;
                    AVMDLDataLoader aVMDLDataLoader2 = this.mInnerDataLoader;
                    if (aVMDLDataLoader2 != null) {
                        aVMDLDataLoader2.setIntValue(7225, i2);
                        break;
                    }
                    break;
                case MediaPlayer.MEDIA_PLAYER_OPTION_MODULE_ID:
                    this.mConfigure.mLiveRecvDataTimeout = i2;
                    break;
                case 1000:
                    if (this.mEnableNetworkChangedListen == 1) {
                        clearNetinfoCache();
                        AVMDLDataLoader aVMDLDataLoader3 = this.mInnerDataLoader;
                        if (aVMDLDataLoader3 != null) {
                            aVMDLDataLoader3.setIntValue(7217, 1);
                            break;
                        }
                    }
                    break;
                case CommonCode.StatusCode.API_CLIENT_EXPIRED:
                    this.mConfigure.mEnablePreconnect = i2;
                    break;
                case 1002:
                    this.mConfigure.mPreconnectNum = i2;
                    break;
                case 1004:
                    if (i2 == 0) {
                        z = false;
                    }
                    this.mInvalidMdlProcotol = z;
                    TTVideoEngineLog.m256505i("DataLoaderHelper", "setIntValue: mInvalidMdlProcotol: " + this.mInvalidMdlProcotol);
                    break;
                case 1005:
                    if (i2 != 1) {
                        z = false;
                    }
                    this.mEnableMdlProtocol = z;
                    TTVideoEngineLog.m256505i("DataLoaderHelper", "config DATALOADER_KEY_SET_MDL_PROTOCOL_ENABLE: " + this.mEnableMdlProtocol);
                    break;
                case 1006:
                    this.mConfigure.mRingBufferSizeKB = i2;
                    break;
                case 1007:
                    this.mConfigure.mEnableFileCacheV2 = i2;
                    break;
                case 1009:
                    this.mConfigure.mEnableFileRingBuffer = i2;
                    break;
                case 1010:
                    this.mConfigure.mEnableUseFileExtendLoaderBuffer = i2;
                    break;
                case 1011:
                    this.mEnableNetworkChangedListen = i2;
                    break;
                case 1100:
                    this.mEnableReportSpeed = i2;
                    break;
                case 1101:
                    this.mConfigure.mEnableLoaderPreempt = i2;
                    break;
                case ExceptionCode.NETWORK_IO_EXCEPTION:
                    this.mConfigure.mAccessCheckLevel = i2;
                    break;
                case ExceptionCode.CRASH_EXCEPTION:
                    this.mConfigure.mNextDownloadThreshold = i2;
                    break;
                case ExceptionCode.CANCEL:
                    AVMDLDataLoader aVMDLDataLoader4 = this.mInnerDataLoader;
                    if (aVMDLDataLoader4 != null) {
                        aVMDLDataLoader4.setIntValue(7219, i2);
                        break;
                    }
                    break;
                case 1105:
                    this.mConfigure.mSocketSendBufferKB = i2;
                    break;
                case 1108:
                    this.mConfigure.mEnableSyncDnsForPcdn = i2;
                    break;
                case 1109:
                    AVMDLDataLoader aVMDLDataLoader5 = this.mInnerDataLoader;
                    if (aVMDLDataLoader5 != null) {
                        aVMDLDataLoader5.setIntValue(7227, i2);
                        break;
                    }
                    break;
                case 1110:
                    this.mConfigure.mXYLibValue = i2;
                    break;
                case 1111:
                    this.mConfigure.mCheckPreloadLevel = i2;
                    break;
                case 1112:
                    this.mNeedSpeedTestByTimeInternal = i2;
                    break;
                case 1113:
                    if (i2 == 0) {
                        z = false;
                    }
                    this.mAudioPreloadFirst = z;
                    break;
                case 1115:
                    this.mConfigure.mMaxIPV6Num = i2;
                    break;
                case 1116:
                    this.mConfigure.mMaxIPV4Num = i2;
                    break;
                case 1117:
                    this.mConfigure.mForbidByPassCookie = i2;
                    break;
                case 1118:
                    this.mConfigure.mEnableLazyBufferpool = i2;
                    break;
                case 1119:
                    this.mConfigure.mSessionTimeout = i2;
                    break;
                case 1120:
                    this.mConfigure.mEnableNewBufferpool = i2;
                    break;
                case 1121:
                    this.mConfigure.mNewBufferPoolBlockSize = i2;
                    break;
                case 1122:
                    this.mConfigure.mNewBufferPoolResidentSize = i2;
                    break;
                case 1123:
                    this.mConfigure.mNewBufferPoolGrowBlockCount = i2;
                    break;
                case 1124:
                    this.mConfigure.mEnablePlayInfoCache = i2;
                    break;
                case 1125:
                    this.mConfigure.mControlCDNRangeType = i2;
                    break;
                case 1126:
                    this.mConfigure.mEnableP2PPreDown = i2;
                    break;
                case 1127:
                    this.mConfigure.mEnablePlayLog = i2;
                    break;
                case 1128:
                    this.mConfigure.mEnableNetScheduler = i2;
                    break;
                case 1129:
                    this.mConfigure.mNetSchedulerBlockAllNetErr = i2;
                    break;
                case 1130:
                    this.mConfigure.mNetSchedulerBlockErrCount = i2;
                    break;
                case 1131:
                    this.mConfigure.mNetSChedulerBlockDurationMs = i2;
                    break;
                case 1132:
                    this.mConfigure.mFirstRangeLeftThreshold = i2;
                    break;
                case 1133:
                    this.mConfigure.mIsAllowTryTheLastUrl = i2;
                    break;
                case 1134:
                    this.mConfigure.mEnableCacheReqRange = i2;
                    break;
                case 1135:
                    this.mConfigure.mEnableLoaderSeek = i2;
                    break;
                case 1136:
                    this.mConfigure.mP2PPreDownPeerCount = i2;
                    break;
                case 1137:
                    this.mConfigure.mEnableDynamicTimeout = i2;
                    break;
                case 1138:
                    this.mConfigure.mSocketInitialTimeout = i2;
                    break;
                case 1139:
                    this.mConfigure.mMaxSocketReuseCount = i2;
                    break;
                case 1140:
                    AVMDLDNSParser.setIntValue(10, i2);
                    break;
                case 1141:
                    AVMDLDNSParser.setIntValue(2, i2);
                    break;
                case 1143:
                    this.mConfigure.mP2PFirstRangeLoaderType = i2;
                    break;
                case 1145:
                    this.mConfigure.mMaxAliveHostNum = i2;
                    break;
                case 1146:
                    this.mConfigure.mFileExtendSizeKB = i2;
                    break;
                case 1147:
                    this.mConfigure.mMinAllowSpeed = i2;
                    break;
                case 1148:
                    this.mConfigure.mNetSchedulerBlockHostIpErrCount = i2;
                    break;
                case 1150:
                    this.mConfigure.mEnableIOManager = i2;
                    break;
                case 1151:
                    this.mConfigure.mEnableOwnVDPPreloadNotify = i2;
                    break;
                case 1154:
                    this.mEnableMdlV2 = i2;
                    break;
                case 1155:
                    this.mEnableSplitPreload = i2;
                    break;
                case 1156:
                    if (i2 > 0) {
                        this.mPreloadUtil.mPlayBufferLowerBound = (long) i2;
                        break;
                    }
                    break;
                case 1157:
                    if (i2 > 0) {
                        this.mPreloadUtil.mPlayBufferUpperBound = (long) i2;
                        break;
                    }
                    break;
                case 1158:
                    this.mConfigure.mMaxFileMemCacheSize = i2;
                    break;
                case 1159:
                    this.mConfigure.mMaxFileMemCacheNum = i2;
                    break;
                case 1160:
                    if (i2 >= 0) {
                        this.mConfigure.mEnableEarlyData = i2;
                        break;
                    }
                    break;
                case 1161:
                    if (i2 > 0) {
                        this.mConfigure.mSocketRecvBufferSize = i2;
                        break;
                    }
                    break;
                case 1162:
                    if (i2 > 0) {
                        this.mConfigure.mEnableSpeedPredict = i2;
                        break;
                    }
                    break;
                case 1163:
                    this.mEnableBufferPreload = i2;
                    break;
                case 1164:
                    this.mConfigure.mEnableUseOriginalUrl = i2;
                    break;
                case 2000:
                    this.mConfigure.mEnableStorageModule = i2;
                    break;
                case 2001:
                    this.mConfigure.mStoPlayDldWinSizeKBNM = i2;
                    break;
                case 2002:
                    this.mConfigure.mStoPlayDldWinSizeKBLS = i2;
                    break;
                case 2003:
                    this.mConfigure.mStoRingBufferSizeKB = i2;
                    break;
                case 2004:
                    this.mConfigure.mStoIoWriteLimitKBTh1 = i2;
                    break;
                case 2005:
                    this.mConfigure.mStoIoWriteLimitKBTh2 = i2;
                    break;
                case 2006:
                    this.mConfigure.mStoMaxIdleTimeSec = i2;
                    break;
                case 2100:
                    if (i2 >= 0) {
                        this.mConfigure.mEnableP2pUpload = i2;
                        break;
                    }
                    break;
                case 2102:
                    if (i2 >= 0) {
                        this.mConfigure.mDevDiskSizeMB = i2;
                        break;
                    }
                    break;
                case 2104:
                    if (i2 >= 0) {
                        this.mConfigure.mDevMemorySizeMB = i2;
                        break;
                    }
                    break;
                case ConnectionResult.NETWORK_ERROR:
                    this.mEnableDumpLibMd5 = i2;
                    break;
                case ConnectionResult.RESOLUTION_REQUIRED:
                    this.mConfigure.mIgnorePlayInfo = i2;
                    break;
                case 9008:
                    this.mEnableHls = i2;
                    break;
                default:
                    switch (i) {
                        case 63:
                            this.mConfigure.mMaxIpCountEachDomain = i2;
                            break;
                        case 64:
                            this.mConfigure.mEnableIpBucket = i2;
                            break;
                        case 65:
                            this.mConfigure.mErrorStateTrustTime = i2;
                            break;
                        case 66:
                            this.mConfigure.mOnlyUseCdn = i2;
                            break;
                        default:
                            switch (i) {
                                case CameraPosition.TILT_90:
                                    this.mConfigure.mDNSMainType = i2;
                                    AVMDLDNSParser.setIntValue(0, i2);
                                    break;
                                case 91:
                                    this.mConfigure.mDNSBackType = i2;
                                    AVMDLDNSParser.setIntValue(1, i2);
                                    break;
                                case 92:
                                    this.mConfigure.mMainToBackUpDelayedTime = i2;
                                    AVMDLDNSParser.setIntValue(3, i2);
                                    break;
                                case 93:
                                    this.mConfigure.mEnableBenchMarkIOSpeed = i2;
                                    break;
                                case 94:
                                    this.mConfigure.mSpeedCoefficientValue = i2;
                                    break;
                                case 95:
                                    P2PStragetyManager.getInstance().enableP2PStragetyConntrol = i2;
                                    break;
                                case 96:
                                    P2PStragetyManager.getInstance().minPlayNum = i2;
                                    break;
                                case 97:
                                    P2PStragetyManager.getInstance().maxLeaveWaitTme = i2;
                                    break;
                                case 98:
                                    P2PStragetyManager.getInstance().maxBufferingTime = i2;
                                    break;
                                case SmEvents.EVENT_UE:
                                    P2PStragetyManager.getInstance().expiredT = i2;
                                    break;
                                case 100:
                                    this.mConfigure.mMaxTlsVersion = i2;
                                    break;
                                case 101:
                                    this.mConfigure.mEnableSessionReuse = i2;
                                    break;
                                default:
                                    switch (i) {
                                        case 103:
                                            AVMDLDNSParser.setIntValue(4, i2);
                                            break;
                                        case 104:
                                            AVMDLDNSParser.setIntValue(5, i2);
                                            break;
                                        case LocationRequest.PRIORITY_NO_POWER:
                                            AVMDLDNSParser.setIntValue(6, i2);
                                            break;
                                        case 106:
                                            try {
                                                AVMDLDNSParser.setIntValue(7, 1);
                                                break;
                                            } catch (Exception e) {
                                                e.printStackTrace();
                                                break;
                                            } catch (Throwable th) {
                                                this.mLock.unlock();
                                                throw th;
                                            }
                                    }
                            }
                    }
            }
        } else {
            this.mConfigure.mGlobalSpeedSampleInterval = i2;
            AVMDLDataLoader aVMDLDataLoader6 = this.mInnerDataLoader;
            if (aVMDLDataLoader6 != null) {
                aVMDLDataLoader6.setIntValue(7370, i2);
            }
        }
        this.mLock.unlock();
    }

    public void addTask(VideoModel videoModel, Resolution resolution, long j) {
        addTask(videoModel, resolution, (Map<Integer, String>) null, j);
    }

    public String downloadUrl(String str, String str2, String[] strArr) {
        if (TextUtils.isEmpty(str) || strArr == null || strArr.length < 1) {
            return null;
        }
        return proxyQuery(str, str2, 0, 0, strArr, null, null, false, null);
    }

    private Error _errorWithCode(int i, long j, String str) {
        int i2;
        String str2;
        String str3;
        int i3;
        if (i != -5000) {
            if (i == -4000) {
                str2 = "request invalid.";
            } else if (i == -2000) {
                str2 = "media data content length invalid";
            } else if (i == -3001) {
                str2 = "server invalid. response status code >= 500";
                i2 = -9944;
            } else if (i != -3000) {
                switch (i) {
                    case IByteRtcError.BRERR_NO_PUBLISH_PERMISSION:
                        str2 = "Waiting for too many tasks, > 20";
                        break;
                    case IByteRtcError.BRERR_JOIN_ROOM_ERROR:
                        str2 = "add the same key task.";
                        break;
                    case IByteRtcError.BRERR_INVALID_TOKEN:
                        str2 = "create preload task fail.";
                        break;
                    default:
                        str2 = "task fail. reply task error.";
                        break;
                }
            } else {
                if (!NetUtils.isNetAvailable(this.mContext)) {
                    i3 = -9960;
                } else {
                    i3 = -9945;
                }
                i2 = i3;
                str2 = "url invalid. response status code >= 400";
            }
            i2 = i;
        } else {
            str2 = "write file fail.";
            i2 = -9948;
        }
        if (j == 3) {
            str3 = "kTTVideoErrorDomainDownload";
        } else {
            str3 = "kTTVideoErrorDomainDataLoaderPreload";
        }
        return new Error(str3, i2, i, "key = " + str + ", reason = " + str2);
    }

    @Override // com.ss.mediakit.medialoader.AVMDLDataLoaderListener
    public String getStringValue(int i, long j, String str) {
        String str2 = str;
        TTVideoEngineLog.m256505i("DataLoaderHelper", "[preload] getStringValue, key = " + str2);
        String str3 = null;
        if (i == 1506) {
            DataLoaderTaskQueue dataLoaderTaskQueue = this.mAllPreloadTasks;
            DataLoaderTaskItem itemForKey = dataLoaderTaskQueue != null ? dataLoaderTaskQueue.itemForKey(str2) : null;
            TTVideoEngineLog.m256505i("DataLoaderHelper", "[preload] getStringValue, key = " + str2);
            if (!(itemForKey == null || itemForKey.mURLItem == null || itemForKey.mURLItem.getProvider() == null)) {
                String key = itemForKey.mURLItem.getProvider().getKey();
                String[] urls = itemForKey.mURLItem.getProvider().getUrls();
                DataLoaderTaskItem.TrackItem trackItem = itemForKey.getTrackItem(str2);
                long j2 = trackItem.mPreSize;
                str3 = proxyQuery(key, key, trackItem.mPreloadOffset, itemForKey.mURLItem.getProvider().getPreloadSize(), urls, itemForKey.mURLItem.getProvider().getCacheDir(), itemForKey.mTag != null ? "tag=" + TTHelper.encodeUrl(itemForKey.mTag) : null, false, null);
                if (!TextUtils.isEmpty(key)) {
                    str2 = key;
                }
                trackItem.mTaskKey = str2;
                TTVideoEngineLog.m256505i("DataLoaderHelper", String.format("[preload] get proxxy url from url: %s", str3));
            }
        } else if (i == 1509 && this.mListener != null && !TextUtils.isEmpty(str)) {
            HashMap<String, String> customHttpHeaders = this.mListener.getCustomHttpHeaders(str2);
            if (customHttpHeaders == null || customHttpHeaders.size() == 0) {
                return null;
            }
            StringBuilder sb = new StringBuilder();
            for (String str4 : customHttpHeaders.keySet()) {
                if (!TextUtils.isEmpty(str4) && !TextUtils.isEmpty(customHttpHeaders.get(str4))) {
                    sb.append(str4);
                    sb.append(": ");
                    sb.append(customHttpHeaders.get(str4));
                    sb.append("\r\n");
                }
            }
            TTVideoEngineLog.m256505i("DataLoaderHelper", String.format("[customheader] get custom header:%s url: %s", str2, sb.toString()));
            return sb.toString();
        }
        return str3;
    }

    public void addTask(VideoModel videoModel, Resolution resolution, Map<Integer, String> map, long j) {
        PreloaderVideoModelItem preloaderVideoModelItem = new PreloaderVideoModelItem(videoModel, resolution, j, (PreloaderFilePathListener) null);
        preloaderVideoModelItem.mParams = map;
        addTask(preloaderVideoModelItem);
    }

    public String downloadUrl(String str, String str2, String[] strArr, int i) {
        if (TextUtils.isEmpty(str) || strArr == null || strArr.length < 1) {
            return null;
        }
        return proxyQuery(str, str2, 0, 0, strArr, null, null, false, null, i);
    }

    public void setPlayInfoOnlyForPreload(int i, String str, String str2, long j) {
        if (this.mState != 0) {
            TTVideoEngineLog.m256500d("DataLoaderHelper", "dataloader not started, not allow set play info");
        } else if (this.mEnableBufferPreload <= 0) {
            TTVideoEngineLog.m256500d("DataLoaderHelper", "buffer preload not enable, not allow set play info");
        } else {
            this.mLock.lock();
            if (this.mPreloadUtil.mPlayBufferLowerBound > 0 && this.mPreloadUtil.mPlayBufferUpperBound > 0) {
                this.mPreloadUtil.updatePlayInfo(i, str, str2, j);
            }
            this.mLock.unlock();
        }
    }

    private String proxyQueryProvideMode(String str, String str2, int i, int i2) {
        if (TextUtils.isEmpty(str) || i2 == 0) {
            return null;
        }
        String encodeUrl = TTHelper.encodeUrl(str);
        if (TextUtils.isEmpty(encodeUrl)) {
            return null;
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = str;
        }
        String encodeUrl2 = TTHelper.encodeUrl(str2);
        if (!TextUtils.isEmpty(encodeUrl2)) {
            str = encodeUrl2;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("?rk=");
        stringBuffer.append(str);
        stringBuffer.append("&k=");
        stringBuffer.append(encodeUrl);
        stringBuffer.append("&pv=");
        stringBuffer.append(1);
        if (i > 0) {
            stringBuffer.append("&l=");
            stringBuffer.append(i);
        }
        return stringBuffer.toString();
    }

    public void setPlayInfo(int i, String str, String str2, long j) {
        if (this.mState != 0) {
            TTVideoEngineLog.m256500d("DataLoaderHelper", "dataloader not started, not allow set play info");
            return;
        }
        this.mLock.lock();
        setPlayInfoOnlyForPreload(i, str, str2, j);
        int i2 = -1;
        switch (i) {
            case 22:
                i2 = 7210;
                break;
            case 23:
                i2 = 7211;
                break;
            case 24:
                i2 = 7212;
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT:
                i2 = 7213;
                break;
            case 26:
                i2 = 7214;
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP:
                i2 = 7215;
                break;
            case IVideoEventLogger.LOGGER_OPTION_ENABLE_SR:
                i2 = 7338;
                break;
        }
        try {
            this.mInnerDataLoader.setInt64ValueByStrKey(i2, str, j);
        } catch (Exception e) {
            e.printStackTrace();
        } catch (Throwable th) {
            this.mLock.unlock();
            throw th;
        }
        this.mLock.unlock();
    }

    public void addTask(String str, String str2, long j, String str3) {
        if (TextUtils.isEmpty(str)) {
            TTVideoEngineLog.m256503e("DataLoaderHelper", "url invalid.");
            return;
        }
        addTask(new String[]{str}, str2, j, str3);
    }

    public String getDataLoaderUrl(String str, String str2, String[] strArr, Resolution resolution, String str3) {
        return _proxyUrl(str, str2, 0, strArr, resolution, str3, null, null, null, false, false, null);
    }

    public String proxyUrl(String str, String str2, String[] strArr, Resolution resolution, String str3) {
        return _proxyUrl(str, str2, 0, strArr, resolution, str3, null, null, null, false, false, null);
    }

    public void addTask(String str, String str2, long j, DataLoaderResourceProvider dataLoaderResourceProvider, String str3) {
        if (dataLoaderResourceProvider == null) {
            TTVideoEngineLog.m256503e("DataLoaderHelper", "provider invalid.");
        } else {
            addTask(new PreloaderURLItem(str, str2, j, dataLoaderResourceProvider, str3));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:50:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00e8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void _addTask(java.lang.String r6, java.lang.String r7, long r8, com.ss.ttvideoengine.PreloaderVidItem r10, com.ss.ttvideoengine.PreloaderVideoModelItem r11, com.ss.ttvideoengine.PreloaderURLItem r12) {
        /*
        // Method dump skipped, instructions count: 269
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttvideoengine.DataLoaderHelper._addTask(java.lang.String, java.lang.String, long, com.ss.ttvideoengine.PreloaderVidItem, com.ss.ttvideoengine.PreloaderVideoModelItem, com.ss.ttvideoengine.PreloaderURLItem):void");
    }

    private String proxyQuery(String str, String str2, long j, long j2, String[] strArr, String str3, String str4, boolean z, String str5) {
        return preloadProxyQuery(str, str2, j, j2, strArr, str3, str4, 0, null, z, str5, 0);
    }

    private String proxyQuery(String str, String str2, long j, long j2, String[] strArr, String str3, String str4, boolean z, String str5, int i) {
        return preloadProxyQuery(str, str2, j, j2, strArr, str3, str4, 0, null, z, str5, i);
    }

    private String preloadProxyQuery(String str, String str2, long j, long j2, String[] strArr, String str3, String str4, int i, String str5, boolean z, String str6) {
        return preloadProxyQuery(str, str2, j, j2, strArr, str3, str4, i, str5, z, str6, 0);
    }

    private String preloadProxyQuery(String str, String str2, long j, long j2, String[] strArr, String str3, String str4, int i, String str5, boolean z, String str6, int i2) {
        String str7;
        if (TextUtils.isEmpty(str) || strArr == null || strArr.length < 1) {
            return null;
        }
        String[] strArr2 = (String[]) strArr.clone();
        long j3 = j2 > 0 ? j2 : 0;
        for (String str8 : strArr2) {
            if (!_supportProxy(str8)) {
                return null;
            }
        }
        String[] _removeRepeatUrls = _removeRepeatUrls(strArr2);
        String encodeUrl = TTHelper.encodeUrl(str);
        if (TextUtils.isEmpty(encodeUrl)) {
            return null;
        }
        if (TextUtils.isEmpty(str2)) {
            str7 = str;
        } else {
            str7 = str2;
        }
        String[] addMdlFlag = addMdlFlag(_removeRepeatUrls, str7);
        StringBuilder sb = new StringBuilder();
        sb.append("preloadProxyQuery: key = ");
        String str9 = str;
        sb.append(str9);
        sb.append(", rawKey = ");
        sb.append(str2);
        TTVideoEngineLog.m256505i("DataLoaderHelper", sb.toString());
        if (!TextUtils.isEmpty(str2)) {
            str9 = str2;
        }
        String encodeUrl2 = TTHelper.encodeUrl(str9);
        if (TextUtils.isEmpty(encodeUrl2)) {
            encodeUrl2 = "videoId";
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("?rk=");
        stringBuffer.append(encodeUrl2);
        stringBuffer.append("&k=");
        stringBuffer.append(encodeUrl);
        if (j3 > 0) {
            stringBuffer.append("&s=");
            stringBuffer.append(j + j3);
        }
        if (i > 0) {
            stringBuffer.append("&l=");
            stringBuffer.append(i);
        }
        if (!TextUtils.isEmpty(str3)) {
            String encodeUrl3 = TTHelper.encodeUrl(str3);
            if (!TextUtils.isEmpty(encodeUrl3)) {
                stringBuffer.append("&p=");
                stringBuffer.append(encodeUrl3);
            }
        }
        if (!TextUtils.isEmpty(str5)) {
            String encodeUrl4 = TTHelper.encodeUrl(str5);
            if (!TextUtils.isEmpty(encodeUrl4)) {
                stringBuffer.append("&h=");
                stringBuffer.append(encodeUrl4);
            }
        }
        if (z) {
            stringBuffer.append("&ft=1");
        }
        if (i2 > 0) {
            stringBuffer.append("&ev=" + i2);
        }
        if (!TextUtils.isEmpty(str6)) {
            String encodeUrl5 = TTHelper.encodeUrl(str6);
            if (!TextUtils.isEmpty(encodeUrl5)) {
                stringBuffer.append("&dtk=");
                stringBuffer.append(encodeUrl5);
            }
        }
        StringBuffer stringBuffer2 = new StringBuffer();
        for (int i3 = 0; i3 < addMdlFlag.length; i3++) {
            String encodeUrlByQuery = TTHelper.encodeUrlByQuery(addMdlFlag[i3]);
            StringBuffer stringBuffer3 = new StringBuffer();
            if (!TextUtils.isEmpty(encodeUrlByQuery)) {
                stringBuffer3.append("&u");
                stringBuffer3.append(i3);
                stringBuffer3.append(ContainerUtils.KEY_VALUE_DELIMITER);
                stringBuffer3.append(encodeUrlByQuery);
            }
            if (stringBuffer.length() + stringBuffer2.length() + stringBuffer3.length() + 32 > 3096) {
                break;
            }
            stringBuffer2.append(stringBuffer3);
        }
        if (stringBuffer2.length() < 1) {
            return null;
        }
        stringBuffer.append(stringBuffer2);
        if (!TextUtils.isEmpty(str4) && stringBuffer.length() + str4.length() + 33 <= 3096) {
            stringBuffer.append(ContainerUtils.FIELD_DELIMITER);
            stringBuffer.append(str4);
        }
        return stringBuffer.toString();
    }

    public String _proxyUrl(String str, String str2, long j, String[] strArr, Resolution resolution, String str3, VideoInfo videoInfo, String str4, String str5, boolean z, boolean z2, String str6) {
        boolean z3;
        boolean z4;
        if (this.mState != 0 || TextUtils.isEmpty(str) || strArr == null || strArr.length < 1) {
            return null;
        }
        String[] addMdlFlag = addMdlFlag((String[]) strArr.clone(), str2);
        boolean z5 = false;
        for (int i = 0; i < addMdlFlag.length; i++) {
            if (!_supportProxy(addMdlFlag[i])) {
                TTVideoEngineLog.m256500d("DataLoaderHelper", "not support");
                return addMdlFlag[i];
            }
        }
        if (this.mInnerDataLoader == null) {
            TTVideoEngineLog.m256503e("DataLoaderHelper", "start mdl first");
            return null;
        }
        if (this.mEnableHls == 1) {
            String lowerCase = addMdlFlag[0].toLowerCase();
            if (z2 || lowerCase.contains(".m3u8?") || lowerCase.endsWith(".m3u8") || lowerCase.contains(".m3u?") || lowerCase.endsWith(".m3u")) {
                z5 = true;
            }
            if (z5) {
                z3 = z5;
                z4 = true;
            } else {
                z4 = z;
                z3 = z5;
            }
        } else {
            z4 = z;
            z3 = false;
        }
        this.mLock.lock();
        try {
            String localAddr = this.mInnerDataLoader.getLocalAddr();
            if (TextUtils.isEmpty(localAddr)) {
                TTVideoEngineLog.m256503e("DataLoaderHelper", "local host error");
                return null;
            }
            String proxyQuery = proxyQuery(str, str2, 0, j, addMdlFlag, str4, str5, z3, str6);
            if (TextUtils.isEmpty(proxyQuery)) {
                this.mLock.unlock();
                return null;
            }
            StringBuffer stringBuffer = new StringBuffer();
            int i2 = this.mMdlDataSourceId;
            this.mMdlDataSourceId = i2 + 1;
            StringBuffer stringBuffer2 = new StringBuffer();
            TTVideoEngineLog.m256505i("DataLoaderHelper", "proxy url, mInvalidMdlProcotol: " + this.mInvalidMdlProcotol);
            if (z4 || this.mInvalidMdlProcotol || !this.mEnableMdlProtocol) {
                stringBuffer.append("http://");
                stringBuffer.append(localAddr);
                stringBuffer.append("/");
                stringBuffer.append(i2);
            } else {
                stringBuffer.append("mdl://");
                stringBuffer.append("id");
                stringBuffer.append(i2);
                stringBuffer.append("/");
            }
            stringBuffer.append(proxyQuery);
            stringBuffer2.append(proxyQuery);
            String auth = this.mInnerDataLoader.getAuth(proxyQuery);
            if (!TextUtils.isEmpty(auth)) {
                stringBuffer.append("&ah=");
                stringBuffer.append(auth);
                stringBuffer2.append("&ah=");
                stringBuffer2.append(auth);
            }
            String stringBuffer3 = stringBuffer.toString();
            TTVideoEngineLog.m256505i("DataLoaderHelper", "_proxyUrl: " + stringBuffer3);
            this.mLock.unlock();
            DataLoaderTaskItem popItemForVideoId = this.mAllPlayTasks.popItemForVideoId(str2);
            if (popItemForVideoId == null) {
                popItemForVideoId = new DataLoaderTaskItem();
            }
            DataLoaderTaskItem.TrackItem addTrackItemByKey = popItemForVideoId.addTrackItemByKey(str);
            if (addTrackItemByKey != null) {
                addTrackItemByKey.mTaskKey = str;
                popItemForVideoId.mVideoId = str2;
                addTrackItemByKey.mProxyUrl = stringBuffer3;
                addTrackItemByKey.mUsingResolution = resolution;
                addTrackItemByKey.mDecryptionKey = str3;
                addTrackItemByKey.mVideoInfo = videoInfo;
                addTrackItemByKey.mUrls = addMdlFlag;
                addTrackItemByKey.mLocalFilePath = str4;
                addTrackItemByKey.mExternalInfo = str5;
                this.mAllPlayTasks.enqueueItem(popItemForVideoId);
            }
            return stringBuffer3;
        } finally {
            this.mLock.unlock();
        }
    }
}
