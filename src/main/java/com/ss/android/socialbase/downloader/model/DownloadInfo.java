package com.ss.android.socialbase.downloader.model;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.ss.android.socialbase.downloader.constants.AsyncHandleStatus;
import com.ss.android.socialbase.downloader.constants.ByteInvalidRetryStatus;
import com.ss.android.socialbase.downloader.constants.C59997c;
import com.ss.android.socialbase.downloader.constants.EnqueueType;
import com.ss.android.socialbase.downloader.constants.RetryDelayStatus;
import com.ss.android.socialbase.downloader.depend.AbstractC60041s;
import com.ss.android.socialbase.downloader.downloader.AbstractC60059i;
import com.ss.android.socialbase.downloader.downloader.C60046b;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.p3025b.C59990a;
import com.ss.android.socialbase.downloader.utils.C60161d;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class DownloadInfo implements Parcelable {
    public static final Parcelable.Creator<DownloadInfo> CREATOR = new Parcelable.Creator<DownloadInfo>() {
        /* class com.ss.android.socialbase.downloader.model.DownloadInfo.C601181 */

        /* renamed from: a */
        public DownloadInfo[] newArray(int i) {
            return new DownloadInfo[i];
        }

        /* renamed from: a */
        public DownloadInfo createFromParcel(Parcel parcel) {
            return new DownloadInfo(parcel);
        }
    };
    private boolean addListenerToSameTask;
    private AtomicLong allConnectTime;
    private int appVersionCode;
    private AsyncHandleStatus asyncHandleStatus;
    private boolean autoResumed;
    private int backUpUrlRetryCount;
    private boolean backUpUrlUsed;
    private List<String> backUpUrls;
    private String backUpUrlsStr;
    private int bindValueCount;
    private ByteInvalidRetryStatus byteInvalidRetryStatus;
    private int chunkCount;
    private boolean chunkDowngradeRetryUsed;
    private int curBackUpUrlIndex;
    private AtomicLong curBytes;
    private int curRetryTime;
    private JSONObject dbJsonData;
    private String dbJsonDataString;
    private long downloadTime;
    private String eTag;
    private EnqueueType enqueueType;
    private StringBuffer errorBytesLog;
    private String extra;
    private List<HttpHeader> extraHeaders;
    private int[] extraMonitorStatus;
    private BaseException failedException;
    private String filePackageName;
    private List<String> forbiddenBackupUrls;
    private boolean force;
    private boolean forceIgnoreRecommendSize;
    private boolean headConnectionAvailable;
    private String headConnectionException;
    private int httpStatusCode;
    private String httpStatusMessage;
    private boolean httpsToHttpRetryUsed;
    private String iconUrl;
    private int id;
    private boolean ignoreDataVerify;
    private Boolean isAutoInstallWithoutNotification;
    private boolean isFirstDownload;
    private boolean isFirstSuccess;
    private boolean isForbiddenRetryed;
    private volatile boolean isSaveTempFile;
    private AtomicLong lastNotifyProgressTime;
    private boolean mDownloadFromReserveWifi;
    private int maxBytes;
    private int maxProgressCount;
    private String md5;
    private String mimeType;
    private int minProgressTimeMsInterval;
    private String monitorScene;
    private String name;
    private boolean needChunkDowngradeRetry;
    private boolean needDefaultHttpServiceBackUp;
    private boolean needHttpsToHttpRetry;
    private boolean needIndependentProcess;
    private boolean needPostProgress;
    private boolean needRetryDelay;
    private boolean needReuseChunkRunnable;
    private boolean needReuseFirstConnection;
    private boolean needSDKMonitor;
    private String networkQuality;
    private boolean newSaveTempFileEnable;
    private int notificationVisibility;
    private boolean onlyWifi;
    private String[] outIp;
    private int[] outSize;
    private String packageName;
    private long realDownloadTime;
    private long realStartDownloadTime;
    private int retryCount;
    private RetryDelayStatus retryDelayStatus;
    private String retryDelayTimeArray;
    private int retryScheduleMinutes;
    private String savePath;
    private boolean showNotification;
    private boolean showNotificationForAutoResumed;
    private boolean showNotificationForNetworkResumed;
    private JSONObject spData;
    private long startDownloadTime;
    private AtomicInteger status;
    private int statusAtDbInit;
    private boolean supportPartial;
    private Bundle tempCacheData;
    private volatile List<AbstractC60041s> tempFileSaveCompleteCallbacks;
    private String tempPath;
    private long throttleNetSpeed;
    private String title;
    private long totalBytes;
    private String url;

    public int describeContents() {
        return 0;
    }

    public boolean isNeedRetryDelay() {
        return false;
    }

    public void setForbiddenRetryed() {
        this.isForbiddenRetryed = true;
    }

    public int getAppVersionCode() {
        return this.appVersionCode;
    }

    public AsyncHandleStatus getAsyncHandleStatus() {
        return this.asyncHandleStatus;
    }

    public int getBackUpUrlRetryCount() {
        return this.backUpUrlRetryCount;
    }

    public List<String> getBackUpUrls() {
        return this.backUpUrls;
    }

    public int getBindValueCount() {
        return this.bindValueCount;
    }

    public ByteInvalidRetryStatus getByteInvalidRetryStatus() {
        return this.byteInvalidRetryStatus;
    }

    public int getChunkCount() {
        return this.chunkCount;
    }

    public int getCurBackUpUrlIndex() {
        return this.curBackUpUrlIndex;
    }

    public int getCurRetryTime() {
        return this.curRetryTime;
    }

    public long getDownloadTime() {
        return this.downloadTime;
    }

    public EnqueueType getEnqueueType() {
        return this.enqueueType;
    }

    public String getExtra() {
        return this.extra;
    }

    public List<HttpHeader> getExtraHeaders() {
        return this.extraHeaders;
    }

    public int[] getExtraMonitorStatus() {
        return this.extraMonitorStatus;
    }

    public BaseException getFailedException() {
        return this.failedException;
    }

    public String getFilePackageName() {
        return this.filePackageName;
    }

    public List<String> getForbiddenBackupUrls() {
        return this.forbiddenBackupUrls;
    }

    public String getHeadConnectionException() {
        return this.headConnectionException;
    }

    public int getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public String getHttpStatusMessage() {
        return this.httpStatusMessage;
    }

    public String getIconUrl() {
        return this.iconUrl;
    }

    public boolean getIsFirstDownload() {
        return this.isFirstDownload;
    }

    public int getMaxBytes() {
        return this.maxBytes;
    }

    public int getMaxProgressCount() {
        return this.maxProgressCount;
    }

    public String getMd5() {
        return this.md5;
    }

    public String getMimeType() {
        return this.mimeType;
    }

    public String getMonitorScene() {
        return this.monitorScene;
    }

    public String getName() {
        return this.name;
    }

    public String getNetworkQuality() {
        return this.networkQuality;
    }

    public int getNotificationVisibility() {
        return this.notificationVisibility;
    }

    public String[] getOutIp() {
        return this.outIp;
    }

    public int[] getOutSize() {
        return this.outSize;
    }

    public String getPackageName() {
        return this.packageName;
    }

    public int getRetryCount() {
        return this.retryCount;
    }

    public RetryDelayStatus getRetryDelayStatus() {
        return this.retryDelayStatus;
    }

    public String getRetryDelayTimeArray() {
        return this.retryDelayTimeArray;
    }

    public String getSavePath() {
        return this.savePath;
    }

    public int getStatusAtDbInit() {
        return this.statusAtDbInit;
    }

    public long getThrottleNetSpeed() {
        return this.throttleNetSpeed;
    }

    public long getTotalBytes() {
        return this.totalBytes;
    }

    public String getUrl() {
        return this.url;
    }

    public String geteTag() {
        return this.eTag;
    }

    public boolean isAddListenerToSameTask() {
        return this.addListenerToSameTask;
    }

    public boolean isAutoResumed() {
        return this.autoResumed;
    }

    public boolean isBackUpUrlUsed() {
        return this.backUpUrlUsed;
    }

    public boolean isChunkDowngradeRetryUsed() {
        return this.chunkDowngradeRetryUsed;
    }

    public boolean isDownloadFromReserveWifi() {
        return this.mDownloadFromReserveWifi;
    }

    public boolean isFirstSuccess() {
        return this.isFirstSuccess;
    }

    public boolean isForbiddenRetryed() {
        return this.isForbiddenRetryed;
    }

    public boolean isForce() {
        return this.force;
    }

    public boolean isForceIgnoreRecommendSize() {
        return this.forceIgnoreRecommendSize;
    }

    public boolean isHeadConnectionAvailable() {
        return this.headConnectionAvailable;
    }

    public boolean isHttpsToHttpRetryUsed() {
        return this.httpsToHttpRetryUsed;
    }

    public boolean isIgnoreDataVerify() {
        return this.ignoreDataVerify;
    }

    public boolean isNeedChunkDowngradeRetry() {
        return this.needChunkDowngradeRetry;
    }

    public boolean isNeedDefaultHttpServiceBackUp() {
        return this.needDefaultHttpServiceBackUp;
    }

    public boolean isNeedHttpsToHttpRetry() {
        return this.needHttpsToHttpRetry;
    }

    public boolean isNeedIndependentProcess() {
        return this.needIndependentProcess;
    }

    public boolean isNeedPostProgress() {
        return this.needPostProgress;
    }

    public boolean isNeedReuseChunkRunnable() {
        return this.needReuseChunkRunnable;
    }

    public boolean isNeedReuseFirstConnection() {
        return this.needReuseFirstConnection;
    }

    public boolean isNeedSDKMonitor() {
        return this.needSDKMonitor;
    }

    public boolean isNewSaveTempFileEnable() {
        return this.newSaveTempFileEnable;
    }

    public boolean isOnlyWifi() {
        return this.onlyWifi;
    }

    public boolean isShowNotification() {
        return this.showNotification;
    }

    public boolean isShowNotificationForAutoResumed() {
        return this.showNotificationForAutoResumed;
    }

    public boolean isShowNotificationForNetworkResumed() {
        return this.showNotificationForNetworkResumed;
    }

    public boolean isSupportPartial() {
        return this.supportPartial;
    }

    public Bundle getTempCacheData() {
        ensureTempCacheData();
        return this.tempCacheData;
    }

    public String getTempName() {
        return C60161d.m233786b(this.name);
    }

    public boolean isChunked() {
        return C60161d.m233792b(this.totalBytes);
    }

    public boolean isDownloaded() {
        return C60161d.m233804c(this);
    }

    public synchronized boolean isSaveTempFile() {
        return this.isSaveTempFile;
    }

    public void resetRealStartDownloadTime() {
        this.realStartDownloadTime = 0;
    }

    private int getReserveWifiStatus() {
        ensureSpData();
        try {
            return this.spData.optInt("pause_reserve_on_wifi", 0);
        } catch (Exception unused) {
            return 0;
        }
    }

    public int checkMd5Status() {
        return C60161d.m233781b(getSavePath(), getName(), this.md5);
    }

    public boolean checkMd5Valid() {
        return C60161d.m233806c(getSavePath(), getName(), this.md5);
    }

    public long getCurBytes() {
        AtomicLong atomicLong = this.curBytes;
        if (atomicLong != null) {
            return atomicLong.get();
        }
        return 0;
    }

    public long getDownloadPrepareTime() {
        ensureDBJsonData();
        return this.dbJsonData.optLong("dbjson_key_download_prepare_time");
    }

    public String getDownloadSettingString() {
        ensureDBJsonData();
        return this.dbJsonData.optString("download_setting");
    }

    public int getExecutorGroup() {
        ensureDBJsonData();
        return this.dbJsonData.optInt("executor_group", 2);
    }

    public long getExpectFileLength() {
        ensureDBJsonData();
        return this.dbJsonData.optLong("dbjson_key_expect_file_length");
    }

    public int getFailedResumeCount() {
        ensureSpData();
        return this.spData.optInt("failed_resume_count", 0);
    }

    public long getFirstSpeedTime() {
        ensureDBJsonData();
        return this.dbJsonData.optLong("dbjson_key_first_speed_time");
    }

    public int getId() {
        if (this.id == 0) {
            this.id = C60046b.m232950a(this);
        }
        return this.id;
    }

    public long getLastDownloadTime() {
        ensureDBJsonData();
        return this.dbJsonData.optLong("dbjson_last_start_download_time", 0);
    }

    public long getLastFailedResumeTime() {
        ensureSpData();
        return this.spData.optLong("last_failed_resume_time", 0);
    }

    public long getLastUninstallResumeTime() {
        ensureSpData();
        return this.spData.optLong("last_unins_resume_time", 0);
    }

    public int getMinProgressTimeMsInterval() {
        int i = this.minProgressTimeMsInterval;
        if (i < 1000) {
            return 1000;
        }
        return i;
    }

    public int getPreconnectLevel() {
        ensureDBJsonData();
        return this.dbJsonData.optInt("dbjson_key_preconnect_level", 0);
    }

    public long getRealDownloadTime() {
        return TimeUnit.NANOSECONDS.toMillis(this.realDownloadTime);
    }

    public int getRealStatus() {
        AtomicInteger atomicInteger = this.status;
        if (atomicInteger != null) {
            return atomicInteger.get();
        }
        return 0;
    }

    public int getRetryScheduleCount() {
        ensureDBJsonData();
        return this.dbJsonData.optInt("retry_schedule_count", 0);
    }

    public int getStatus() {
        AtomicInteger atomicInteger = this.status;
        if (atomicInteger == null) {
            return 0;
        }
        int i = atomicInteger.get();
        if (i == -5) {
            return -2;
        }
        return i;
    }

    public int getTTMd5CheckStatus() {
        ensureDBJsonData();
        return this.dbJsonData.optInt("ttmd5_check_status", -1);
    }

    public String getTargetFilePath() {
        return C60161d.m233749a(this.savePath, this.name);
    }

    public String getTempFilePath() {
        return C60161d.m233750a(this.savePath, this.tempPath, this.name);
    }

    public String getTempPath() {
        return C60161d.m233787b(this.savePath, this.tempPath);
    }

    public String getTitle() {
        if (TextUtils.isEmpty(this.title)) {
            return this.name;
        }
        return this.title;
    }

    public int getUninstallResumeCount() {
        ensureSpData();
        return this.spData.optInt("unins_resume_count", 0);
    }

    public boolean hasPauseReservedOnWifi() {
        if ((getReserveWifiStatus() & 1) > 0) {
            return true;
        }
        return false;
    }

    public boolean isBreakpointAvailable() {
        if (!isFileDataValid()) {
            return false;
        }
        return isChunkBreakpointAvailable();
    }

    public boolean isDownloadOverStatus() {
        return C59997c.m232856a(getStatus());
    }

    public boolean isDownloadingStatus() {
        return C59997c.m232857b(getStatus());
    }

    public boolean isNewTask() {
        if (getStatus() == 0) {
            return true;
        }
        return false;
    }

    public boolean isPauseReserveOnWifi() {
        if ((getReserveWifiStatus() & 2) > 0) {
            return true;
        }
        return false;
    }

    public boolean isSavePathRedirected() {
        ensureDBJsonData();
        return this.dbJsonData.optBoolean("is_save_path_redirected", false);
    }

    public boolean isWaitingWifiStatus() {
        BaseException baseException = this.failedException;
        if (baseException == null || baseException.getErrorCode() != 1013) {
            return false;
        }
        return true;
    }

    public void setLastNotifyProgressTime() {
        this.lastNotifyProgressTime.set(SystemClock.uptimeMillis());
    }

    public void startPauseReserveOnWifi() {
        ensureSpData();
        try {
            this.spData.put("pause_reserve_on_wifi", 3);
            updateSpData();
        } catch (Exception unused) {
        }
    }

    public void stopPauseReserveOnWifi() {
        ensureSpData();
        try {
            this.spData.put("pause_reserve_on_wifi", 1);
            updateSpData();
        } catch (Exception unused) {
        }
    }

    public void updateRealStartDownloadTime() {
        if (this.realStartDownloadTime == 0) {
            this.realStartDownloadTime = System.nanoTime();
        }
    }

    private void ensureTempCacheData() {
        if (this.tempCacheData == null) {
            synchronized (this) {
                if (this.tempCacheData == null) {
                    this.tempCacheData = new Bundle();
                }
            }
        }
    }

    private String getDBJsonDataString() {
        String jSONObject;
        String str = this.dbJsonDataString;
        if (str != null) {
            return str;
        }
        ensureDBJsonData();
        synchronized (this.dbJsonData) {
            jSONObject = this.dbJsonData.toString();
            this.dbJsonDataString = jSONObject;
        }
        return jSONObject;
    }

    public boolean canNotifyProgress() {
        long j = this.lastNotifyProgressTime.get();
        if (j == 0 || SystemClock.uptimeMillis() - j > 20) {
            return true;
        }
        return false;
    }

    public boolean canReStartAsyncTask() {
        if (getStatus() == -3 || this.asyncHandleStatus != AsyncHandleStatus.ASYNC_HANDLE_WAITING) {
            return false;
        }
        return true;
    }

    public boolean canReplaceHttpForRetry() {
        if (TextUtils.isEmpty(this.url) || !this.url.startsWith("https") || !this.needHttpsToHttpRetry || this.httpsToHttpRetryUsed) {
            return false;
        }
        return true;
    }

    public boolean canShowNotification() {
        boolean z = this.autoResumed;
        if ((z || !this.showNotification) && (!z || (!this.showNotificationForAutoResumed && !this.showNotificationForNetworkResumed))) {
            return false;
        }
        return true;
    }

    public boolean canStartRetryDelayTask() {
        if (!isNeedRetryDelay() || getStatus() == -3 || this.retryDelayStatus != RetryDelayStatus.DELAY_RETRY_WAITING) {
            return false;
        }
        return true;
    }

    public long getAllConnectTime() {
        ensureDBJsonData();
        if (this.allConnectTime == null) {
            this.allConnectTime = new AtomicLong(this.dbJsonData.optLong("dbjson_key_all_connect_time"));
        }
        return this.allConnectTime.get();
    }

    public int getCurRetryTimeInTotal() {
        int i = this.curRetryTime;
        if (!this.backUpUrlUsed) {
            return i;
        }
        int i2 = i + this.retryCount;
        int i3 = this.curBackUpUrlIndex;
        if (i3 > 0) {
            return i2 + (i3 * this.backUpUrlRetryCount);
        }
        return i2;
    }

    public String getErrorBytesLog() {
        StringBuffer stringBuffer = this.errorBytesLog;
        if (stringBuffer == null || stringBuffer.length() == 0) {
            return "";
        }
        return this.errorBytesLog.toString();
    }

    public int getTotalRetryCount() {
        int i = this.retryCount;
        List<String> list = this.backUpUrls;
        if (list == null || list.isEmpty()) {
            return i;
        }
        return i + (this.backUpUrlRetryCount * this.backUpUrls.size());
    }

    public boolean hasNextBackupUrl() {
        List<String> list = this.backUpUrls;
        if (list != null && list.size() > 0) {
            if (!this.backUpUrlUsed) {
                return true;
            }
            int i = this.curBackUpUrlIndex;
            if (i < 0 || i >= this.backUpUrls.size() - 1) {
                return false;
            }
            return true;
        }
        return false;
    }

    public boolean isDownloadWithWifiValid() {
        if (!isOnlyWifi() || C60161d.m233772a(C60046b.m232945G())) {
            return true;
        }
        return false;
    }

    public boolean isEntityInvalid() {
        if (TextUtils.isEmpty(this.url) || TextUtils.isEmpty(this.name) || TextUtils.isEmpty(this.savePath)) {
            return true;
        }
        return false;
    }

    public boolean isPauseReserveWithWifiValid() {
        if (!this.mDownloadFromReserveWifi) {
            return true;
        }
        if (!isPauseReserveOnWifi() || !C60161d.m233772a(C60046b.m232945G())) {
            return false;
        }
        return true;
    }

    public boolean isRwConcurrent() {
        ensureDBJsonData();
        if (this.dbJsonData.optInt("rw_concurrent", 0) == 1) {
            return true;
        }
        return false;
    }

    public void reset() {
        setCurBytes(0, true);
        this.totalBytes = 0;
        this.chunkCount = 1;
        this.downloadTime = 0;
        this.realStartDownloadTime = 0;
        this.realDownloadTime = 0;
    }

    public boolean statusInPause() {
        if (getRealStatus() == -2 || getRealStatus() == -5) {
            return true;
        }
        return false;
    }

    public void updateDownloadTime() {
        if (this.startDownloadTime != 0) {
            long uptimeMillis = SystemClock.uptimeMillis() - this.startDownloadTime;
            if (this.downloadTime < 0) {
                this.downloadTime = 0;
            }
            if (uptimeMillis > 0) {
                this.downloadTime = uptimeMillis;
            }
        }
    }

    public void updateStartDownloadTime() {
        this.startDownloadTime = SystemClock.uptimeMillis();
        safePutToDBJsonData("dbjson_last_start_download_time", Long.valueOf(System.currentTimeMillis()));
    }

    public DownloadInfo() {
        this.needDefaultHttpServiceBackUp = true;
        this.retryDelayStatus = RetryDelayStatus.DELAY_RETRY_NONE;
        this.asyncHandleStatus = AsyncHandleStatus.ASYNC_HANDLE_NONE;
        this.supportPartial = true;
        this.needSDKMonitor = true;
        this.chunkCount = 1;
        this.isFirstDownload = true;
        this.isFirstSuccess = true;
        this.byteInvalidRetryStatus = ByteInvalidRetryStatus.BYTE_INVALID_RETRY_STATUS_NONE;
        this.enqueueType = EnqueueType.ENQUEUE_NONE;
        this.lastNotifyProgressTime = new AtomicLong(0);
        this.newSaveTempFileEnable = true;
        this.isAutoInstallWithoutNotification = null;
    }

    private void ensureDBJsonData() {
        if (this.dbJsonData == null) {
            synchronized (this) {
                if (this.dbJsonData == null) {
                    try {
                        if (!TextUtils.isEmpty(this.dbJsonDataString)) {
                            this.dbJsonData = new JSONObject(this.dbJsonDataString);
                        } else {
                            this.dbJsonData = new JSONObject();
                        }
                    } catch (Throwable unused) {
                        this.dbJsonData = new JSONObject();
                    }
                }
            }
        }
    }

    private void ensureSpData() {
        if (this.spData == null) {
            Context G = C60046b.m232945G();
            if (G != null) {
                String string = G.getSharedPreferences("sp_download_info", 0).getString(Long.toString((long) getId()), "");
                if (!TextUtils.isEmpty(string)) {
                    try {
                        this.spData = new JSONObject(string);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
            }
            if (this.spData == null) {
                this.spData = new JSONObject();
            }
        }
    }

    private void putMonitorSetting() {
        safePutToDBJsonData("need_sdk_monitor", Boolean.valueOf(this.needSDKMonitor));
        safePutToDBJsonData("monitor_scene", this.monitorScene);
        try {
            JSONArray jSONArray = new JSONArray();
            int[] iArr = this.extraMonitorStatus;
            if (iArr != null && iArr.length > 0) {
                int i = 0;
                while (true) {
                    int[] iArr2 = this.extraMonitorStatus;
                    if (i >= iArr2.length) {
                        break;
                    }
                    jSONArray.put(iArr2[i]);
                    i++;
                }
            }
            safePutToDBJsonData("extra_monitor_status", jSONArray);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public boolean canSkipStatusHandler() {
        int status2 = getStatus();
        if (status2 == 7 || this.retryDelayStatus == RetryDelayStatus.DELAY_RETRY_WAITING || status2 == 8 || this.asyncHandleStatus == AsyncHandleStatus.ASYNC_HANDLE_WAITING || this.asyncHandleStatus == AsyncHandleStatus.ASYNC_HANDLE_RESTART || this.byteInvalidRetryStatus == ByteInvalidRetryStatus.BYTE_INVALID_RETRY_STATUS_RESTART) {
            return true;
        }
        return false;
    }

    public void changeSkipStatus() {
        int status2 = getStatus();
        if (status2 == 7 || this.retryDelayStatus == RetryDelayStatus.DELAY_RETRY_WAITING) {
            setRetryDelayStatus(RetryDelayStatus.DELAY_RETRY_DOWNLOADING);
        }
        if (status2 == 8 || this.asyncHandleStatus == AsyncHandleStatus.ASYNC_HANDLE_WAITING || this.asyncHandleStatus == AsyncHandleStatus.ASYNC_HANDLE_RESTART) {
            setAsyncHandleStatus(AsyncHandleStatus.ASYNC_HANDLE_DOWNLOADING);
        }
        if (this.byteInvalidRetryStatus == ByteInvalidRetryStatus.BYTE_INVALID_RETRY_STATUS_RESTART) {
            setByteInvalidRetryStatus(ByteInvalidRetryStatus.BYTE_INVALID_RETRY_STATUS_DOWNLOADING);
        }
    }

    public void clearSpData() {
        Context G = C60046b.m232945G();
        if (G != null) {
            try {
                G.getSharedPreferences("sp_download_info", 0).edit().remove(Integer.toString(getId())).apply();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public void erase() {
        setCurBytes(0, true);
        this.totalBytes = 0;
        this.chunkCount = 1;
        this.downloadTime = 0;
        this.realStartDownloadTime = 0;
        this.realDownloadTime = 0;
        this.curRetryTime = 0;
        this.isFirstDownload = true;
        this.isFirstSuccess = true;
        this.backUpUrlUsed = false;
        this.httpsToHttpRetryUsed = false;
        this.eTag = null;
        this.failedException = null;
        this.tempCacheData = null;
    }

    public String getBackUpUrl() {
        List<String> list;
        int i;
        if (this.backUpUrlUsed && (list = this.backUpUrls) != null && list.size() > 0 && (i = this.curBackUpUrlIndex) >= 0 && i < this.backUpUrls.size()) {
            String str = this.backUpUrls.get(this.curBackUpUrlIndex);
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
        }
        return "";
    }

    public int getDownloadProcess() {
        if (this.totalBytes <= 0) {
            return 0;
        }
        if (getCurBytes() > this.totalBytes) {
            return 100;
        }
        return (int) ((getCurBytes() * 100) / this.totalBytes);
    }

    public double getDownloadSpeed() {
        double curBytes2 = ((double) getCurBytes()) / 1048576.0d;
        double realDownloadTime2 = ((double) getRealDownloadTime()) / 1000.0d;
        if (curBytes2 <= 0.0d || realDownloadTime2 <= 0.0d) {
            return -1.0d;
        }
        return curBytes2 / realDownloadTime2;
    }

    public boolean isAutoInstallWithoutNotification() {
        if (this.isAutoInstallWithoutNotification == null) {
            if (!TextUtils.isEmpty(this.extra)) {
                try {
                    this.isAutoInstallWithoutNotification = Boolean.valueOf(new JSONObject(this.extra).optBoolean("auto_install_without_notification", false));
                } catch (JSONException unused) {
                    this.isAutoInstallWithoutNotification = false;
                }
            } else {
                this.isAutoInstallWithoutNotification = false;
            }
        }
        return this.isAutoInstallWithoutNotification.booleanValue();
    }

    public boolean isCanResumeFromBreakPointStatus() {
        int status2 = getStatus();
        if (status2 == 4 || status2 == 3 || status2 == -1 || status2 == 5 || status2 == 8) {
            return true;
        }
        if ((status2 == 1 || status2 == 2) && getCurBytes() > 0) {
            return true;
        }
        return false;
    }

    public boolean isFileDataExists() {
        if (isEntityInvalid()) {
            return false;
        }
        File file = new File(getTempPath(), getTempName());
        boolean exists = file.exists();
        boolean isDirectory = file.isDirectory();
        if (!exists || isDirectory) {
            return false;
        }
        return true;
    }

    public boolean isFirstDownload() {
        if (this.isFirstDownload && !TextUtils.isEmpty(getTempPath()) && !TextUtils.isEmpty(getTempName())) {
            return !new File(getTempPath(), getTempName()).exists();
        }
        return false;
    }

    public boolean trySwitchToNextBackupUrl() {
        if (this.backUpUrlUsed) {
            this.curBackUpUrlIndex++;
        }
        List<String> list = this.backUpUrls;
        if (!(list == null || list.size() == 0 || this.curBackUpUrlIndex < 0)) {
            while (this.curBackUpUrlIndex < this.backUpUrls.size()) {
                if (!TextUtils.isEmpty(this.backUpUrls.get(this.curBackUpUrlIndex))) {
                    this.backUpUrlUsed = true;
                    return true;
                }
                this.curBackUpUrlIndex++;
            }
        }
        return false;
    }

    public void updateSpData() {
        Context G;
        if (this.spData != null && (G = C60046b.m232945G()) != null) {
            G.getSharedPreferences("sp_download_info", 0).edit().putString(Integer.toString(getId()), this.spData.toString()).apply();
        }
    }

    private String getBackUpUrlsStr() {
        List<String> list;
        if (this.backUpUrlsStr == null && (list = this.backUpUrls) != null && !list.isEmpty()) {
            try {
                JSONArray jSONArray = new JSONArray();
                for (String str : this.backUpUrls) {
                    if (!TextUtils.isEmpty(str)) {
                        jSONArray.put(str);
                    }
                }
                this.backUpUrlsStr = jSONArray.toString();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (this.backUpUrlsStr == null) {
            this.backUpUrlsStr = "";
        }
        return this.backUpUrlsStr;
    }

    private void parseMonitorSetting() {
        ensureDBJsonData();
        this.needSDKMonitor = this.dbJsonData.optBoolean("need_sdk_monitor", false);
        this.monitorScene = this.dbJsonData.optString("monitor_scene", "");
        JSONArray optJSONArray = this.dbJsonData.optJSONArray("extra_monitor_status");
        if (optJSONArray != null && optJSONArray.length() > 0) {
            this.extraMonitorStatus = new int[optJSONArray.length()];
            for (int i = 0; i < optJSONArray.length(); i++) {
                this.extraMonitorStatus[i] = optJSONArray.optInt(i);
            }
        }
    }

    public String getConnectionUrl() {
        List<String> list;
        int i;
        List<String> list2;
        String str = this.url;
        if (getStatus() == 8 && (list2 = this.forbiddenBackupUrls) != null && !list2.isEmpty() && !this.backUpUrlUsed) {
            return this.forbiddenBackupUrls.get(0);
        }
        if (this.backUpUrlUsed && (list = this.backUpUrls) != null && list.size() > 0 && (i = this.curBackUpUrlIndex) >= 0 && i < this.backUpUrls.size()) {
            String str2 = this.backUpUrls.get(this.curBackUpUrlIndex);
            return !TextUtils.isEmpty(str2) ? str2 : str;
        } else if (TextUtils.isEmpty(this.url) || !this.url.startsWith("https") || !this.needHttpsToHttpRetry || !this.httpsToHttpRetryUsed) {
            return str;
        } else {
            return this.url.replaceFirst("https", "http");
        }
    }

    public boolean isChunkBreakpointAvailable() {
        AbstractC60059i t;
        if (this.chunkCount > 1 && (t = C60046b.m233010t()) != null) {
            List<DownloadChunk> downloadChunk = t.getDownloadChunk(getId());
            if (downloadChunk == null || downloadChunk.size() != this.chunkCount) {
                return false;
            }
            long j = 0;
            for (DownloadChunk downloadChunk2 : downloadChunk) {
                if (downloadChunk2 != null) {
                    j += downloadChunk2.mo205023o();
                }
            }
            if (j != getCurBytes()) {
                setCurBytes(j);
            }
        }
        return true;
    }

    public boolean isFileDataValid() {
        if (isEntityInvalid()) {
            return false;
        }
        File file = new File(getTempPath(), getTempName());
        boolean exists = file.exists();
        boolean isDirectory = file.isDirectory();
        if (exists && !isDirectory) {
            long length = file.length();
            long curBytes2 = getCurBytes();
            if (length > 0 && curBytes2 > 0) {
                long j = this.totalBytes;
                if (j <= 0 || this.chunkCount <= 0 || length < curBytes2 || length > j || curBytes2 >= j) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public String toString() {
        return "DownloadInfo{id=" + this.id + ", name='" + this.name + '\'' + ", title='" + this.title + '\'' + ", url='" + this.url + '\'' + ", savePath='" + this.savePath + '\'' + '}';
    }

    public ContentValues toContentValues() {
        ContentValues contentValues = new ContentValues();
        contentValues.put("_id", Integer.valueOf(this.id));
        contentValues.put("url", this.url);
        contentValues.put("savePath", this.savePath);
        contentValues.put("tempPath", this.tempPath);
        contentValues.put("name", this.name);
        contentValues.put("chunkCount", Integer.valueOf(this.chunkCount));
        contentValues.put(UpdateKey.STATUS, Integer.valueOf(getStatus()));
        contentValues.put("curBytes", Long.valueOf(getCurBytes()));
        contentValues.put("totalBytes", Long.valueOf(this.totalBytes));
        contentValues.put("eTag", this.eTag);
        contentValues.put("onlyWifi", Integer.valueOf(this.onlyWifi ? 1 : 0));
        contentValues.put("force", Integer.valueOf(this.force ? 1 : 0));
        contentValues.put("retryCount", Integer.valueOf(this.retryCount));
        contentValues.put("extra", this.extra);
        contentValues.put("mimeType", this.mimeType);
        contentValues.put("title", this.title);
        contentValues.put("notificationEnable", Integer.valueOf(this.showNotification ? 1 : 0));
        contentValues.put("notificationVisibility", Integer.valueOf(this.notificationVisibility));
        contentValues.put("isFirstDownload", Integer.valueOf(this.isFirstDownload ? 1 : 0));
        contentValues.put("isFirstSuccess", Integer.valueOf(this.isFirstSuccess ? 1 : 0));
        contentValues.put("needHttpsToHttpRetry", Integer.valueOf(this.needHttpsToHttpRetry ? 1 : 0));
        contentValues.put("downloadTime", Long.valueOf(this.downloadTime));
        contentValues.put("packageName", this.packageName);
        contentValues.put("md5", this.md5);
        contentValues.put("retryDelay", Integer.valueOf(this.needRetryDelay ? 1 : 0));
        contentValues.put("curRetryTime", Integer.valueOf(this.curRetryTime));
        contentValues.put("retryDelayStatus", Integer.valueOf(this.retryDelayStatus.ordinal()));
        contentValues.put("defaultHttpServiceBackUp", Integer.valueOf(this.needDefaultHttpServiceBackUp ? 1 : 0));
        contentValues.put("chunkRunnableReuse", Integer.valueOf(this.needReuseChunkRunnable ? 1 : 0));
        contentValues.put("retryDelayTimeArray", this.retryDelayTimeArray);
        contentValues.put("chunkDowngradeRetry", Integer.valueOf(this.needChunkDowngradeRetry ? 1 : 0));
        contentValues.put("backUpUrlsStr", getBackUpUrlsStr());
        contentValues.put("backUpUrlRetryCount", Integer.valueOf(this.backUpUrlRetryCount));
        contentValues.put("realDownloadTime", Long.valueOf(this.realDownloadTime));
        contentValues.put("retryScheduleMinutes", Integer.valueOf(this.retryScheduleMinutes));
        contentValues.put("independentProcess", Integer.valueOf(this.needIndependentProcess ? 1 : 0));
        contentValues.put("auxiliaryJsonobjectString", getDBJsonDataString());
        contentValues.put("iconUrl", this.iconUrl);
        contentValues.put("appVersionCode", Integer.valueOf(this.appVersionCode));
        return contentValues;
    }

    /* renamed from: com.ss.android.socialbase.downloader.model.DownloadInfo$a */
    public static class C60119a {

        /* renamed from: A */
        public String f149988A;

        /* renamed from: B */
        public long f149989B;

        /* renamed from: C */
        public boolean f149990C;

        /* renamed from: D */
        public String f149991D;

        /* renamed from: E */
        public boolean f149992E;

        /* renamed from: F */
        public boolean f149993F;

        /* renamed from: G */
        public EnqueueType f149994G = EnqueueType.ENQUEUE_NONE;

        /* renamed from: H */
        public boolean f149995H;

        /* renamed from: I */
        public boolean f149996I;

        /* renamed from: J */
        public boolean f149997J;

        /* renamed from: K */
        public String f149998K;

        /* renamed from: L */
        public long f149999L;

        /* renamed from: M */
        public boolean f150000M = true;

        /* renamed from: N */
        public boolean f150001N;

        /* renamed from: O */
        public JSONObject f150002O;

        /* renamed from: P */
        public boolean f150003P = true;

        /* renamed from: Q */
        public String f150004Q;

        /* renamed from: R */
        public int[] f150005R;

        /* renamed from: S */
        public int f150006S;

        /* renamed from: a */
        public String f150007a;

        /* renamed from: b */
        public String f150008b;

        /* renamed from: c */
        public String f150009c;

        /* renamed from: d */
        public String f150010d;

        /* renamed from: e */
        public String f150011e;

        /* renamed from: f */
        public boolean f150012f;

        /* renamed from: g */
        public String f150013g;

        /* renamed from: h */
        public List<HttpHeader> f150014h;

        /* renamed from: i */
        public int f150015i;

        /* renamed from: j */
        public String[] f150016j;

        /* renamed from: k */
        public int[] f150017k;

        /* renamed from: l */
        public int f150018l;

        /* renamed from: m */
        public int f150019m;

        /* renamed from: n */
        public boolean f150020n;

        /* renamed from: o */
        public boolean f150021o = true;

        /* renamed from: p */
        public int f150022p;

        /* renamed from: q */
        public int f150023q;

        /* renamed from: r */
        public List<String> f150024r;

        /* renamed from: s */
        public boolean f150025s;

        /* renamed from: t */
        public String f150026t;

        /* renamed from: u */
        public boolean f150027u;

        /* renamed from: v */
        public boolean f150028v;

        /* renamed from: w */
        public boolean f150029w;

        /* renamed from: x */
        public boolean f150030x = true;

        /* renamed from: y */
        public boolean f150031y;

        /* renamed from: z */
        public String f150032z;

        /* renamed from: a */
        public DownloadInfo mo205279a() {
            return new DownloadInfo(this);
        }

        /* renamed from: a */
        public C60119a mo205270a(int i) {
            this.f150015i = i;
            return this;
        }

        /* renamed from: b */
        public C60119a mo205280b(int i) {
            this.f150018l = i;
            return this;
        }

        /* renamed from: c */
        public C60119a mo205286c(int i) {
            this.f150019m = i;
            return this;
        }

        /* renamed from: d */
        public C60119a mo205289d(int i) {
            this.f150022p = i;
            return this;
        }

        /* renamed from: e */
        public C60119a mo205292e(int i) {
            this.f150023q = i;
            return this;
        }

        /* renamed from: f */
        public C60119a mo205295f(int i) {
            this.f150006S = i;
            return this;
        }

        /* renamed from: g */
        public C60119a mo205298g(String str) {
            this.f150026t = str;
            return this;
        }

        /* renamed from: h */
        public C60119a mo205300h(String str) {
            this.f150032z = str;
            return this;
        }

        /* renamed from: i */
        public C60119a mo205302i(String str) {
            this.f149988A = str;
            return this;
        }

        /* renamed from: j */
        public C60119a mo205304j(String str) {
            this.f149991D = str;
            return this;
        }

        /* renamed from: k */
        public C60119a mo205306k(String str) {
            this.f150004Q = str;
            return this;
        }

        /* renamed from: l */
        public C60119a mo205308l(String str) {
            this.f149998K = str;
            return this;
        }

        /* renamed from: m */
        public C60119a mo205310m(boolean z) {
            this.f149995H = z;
            return this;
        }

        /* renamed from: n */
        public C60119a mo205311n(boolean z) {
            this.f149996I = z;
            return this;
        }

        /* renamed from: o */
        public C60119a mo205312o(boolean z) {
            this.f149997J = z;
            return this;
        }

        /* renamed from: p */
        public C60119a mo205313p(boolean z) {
            this.f150000M = z;
            return this;
        }

        /* renamed from: q */
        public C60119a mo205314q(boolean z) {
            this.f150001N = z;
            return this;
        }

        /* renamed from: r */
        public C60119a mo205315r(boolean z) {
            this.f150003P = z;
            return this;
        }

        /* renamed from: a */
        public C60119a mo205271a(long j) {
            this.f149989B = j;
            return this;
        }

        /* renamed from: b */
        public C60119a mo205281b(long j) {
            this.f149999L = j;
            return this;
        }

        /* renamed from: c */
        public C60119a mo205287c(String str) {
            this.f150009c = str;
            return this;
        }

        /* renamed from: d */
        public C60119a mo205290d(String str) {
            this.f150010d = str;
            return this;
        }

        /* renamed from: e */
        public C60119a mo205293e(String str) {
            this.f150011e = str;
            return this;
        }

        /* renamed from: f */
        public C60119a mo205296f(String str) {
            this.f150013g = str;
            return this;
        }

        /* renamed from: g */
        public C60119a mo205299g(boolean z) {
            this.f150029w = z;
            return this;
        }

        /* renamed from: h */
        public C60119a mo205301h(boolean z) {
            this.f150030x = z;
            return this;
        }

        /* renamed from: i */
        public C60119a mo205303i(boolean z) {
            this.f150031y = z;
            return this;
        }

        /* renamed from: j */
        public C60119a mo205305j(boolean z) {
            this.f149990C = z;
            return this;
        }

        /* renamed from: k */
        public C60119a mo205307k(boolean z) {
            this.f149992E = z;
            return this;
        }

        /* renamed from: l */
        public C60119a mo205309l(boolean z) {
            this.f149993F = z;
            return this;
        }

        /* renamed from: a */
        public C60119a mo205272a(EnqueueType enqueueType) {
            this.f149994G = enqueueType;
            return this;
        }

        /* renamed from: b */
        public C60119a mo205282b(String str) {
            this.f150008b = str;
            return this;
        }

        /* renamed from: c */
        public C60119a mo205288c(boolean z) {
            this.f150021o = z;
            return this;
        }

        /* renamed from: d */
        public C60119a mo205291d(boolean z) {
            this.f150027u = z;
            return this;
        }

        /* renamed from: e */
        public C60119a mo205294e(boolean z) {
            this.f150025s = z;
            return this;
        }

        /* renamed from: f */
        public C60119a mo205297f(boolean z) {
            this.f150028v = z;
            return this;
        }

        /* renamed from: a */
        public C60119a mo205273a(String str) {
            this.f150007a = str;
            return this;
        }

        /* renamed from: b */
        public C60119a mo205283b(List<String> list) {
            this.f150024r = list;
            return this;
        }

        /* renamed from: a */
        public C60119a mo205274a(List<HttpHeader> list) {
            this.f150014h = list;
            return this;
        }

        /* renamed from: b */
        public C60119a mo205284b(boolean z) {
            this.f150020n = z;
            return this;
        }

        /* renamed from: a */
        public C60119a mo205275a(JSONObject jSONObject) {
            this.f150002O = jSONObject;
            return this;
        }

        /* renamed from: b */
        public C60119a mo205285b(int[] iArr) {
            this.f150005R = iArr;
            return this;
        }

        /* renamed from: a */
        public C60119a mo205276a(boolean z) {
            this.f150012f = z;
            return this;
        }

        /* renamed from: a */
        public C60119a mo205277a(int[] iArr) {
            this.f150017k = iArr;
            return this;
        }

        /* renamed from: a */
        public C60119a mo205278a(String[] strArr) {
            this.f150016j = strArr;
            return this;
        }
    }

    public void setAppVersionCode(int i) {
        this.appVersionCode = i;
    }

    public void setAsyncHandleStatus(AsyncHandleStatus asyncHandleStatus2) {
        this.asyncHandleStatus = asyncHandleStatus2;
    }

    public void setAutoResumed(boolean z) {
        this.autoResumed = z;
    }

    public void setByteInvalidRetryStatus(ByteInvalidRetryStatus byteInvalidRetryStatus2) {
        this.byteInvalidRetryStatus = byteInvalidRetryStatus2;
    }

    public void setChunkCount(int i) {
        this.chunkCount = i;
    }

    public void setChunkDowngradeRetryUsed(boolean z) {
        this.chunkDowngradeRetryUsed = z;
    }

    public void setDownloadFromReserveWifi(boolean z) {
        this.mDownloadFromReserveWifi = z;
    }

    public void setExtra(String str) {
        this.extra = str;
    }

    public void setFailedException(BaseException baseException) {
        this.failedException = baseException;
    }

    public void setFilePackageName(String str) {
        this.filePackageName = str;
    }

    public void setFirstDownload(boolean z) {
        this.isFirstDownload = z;
    }

    public void setFirstSuccess(boolean z) {
        this.isFirstSuccess = z;
    }

    public void setForceIgnoreRecommendSize(boolean z) {
        this.forceIgnoreRecommendSize = z;
    }

    public void setHeadConnectionException(String str) {
        this.headConnectionException = str;
    }

    public void setHttpStatusCode(int i) {
        this.httpStatusCode = i;
    }

    public void setHttpStatusMessage(String str) {
        this.httpStatusMessage = str;
    }

    public void setHttpsToHttpRetryUsed(boolean z) {
        this.httpsToHttpRetryUsed = z;
    }

    public void setIconUrl(String str) {
        this.iconUrl = str;
    }

    public void setId(int i) {
        this.id = i;
    }

    public void setMd5(String str) {
        this.md5 = str;
    }

    public void setMimeType(String str) {
        this.mimeType = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setNetworkQuality(String str) {
        this.networkQuality = str;
    }

    public void setNotificationVisibility(int i) {
        this.notificationVisibility = i;
    }

    public void setOnlyWifi(boolean z) {
        this.onlyWifi = z;
    }

    public void setPackageName(String str) {
        this.packageName = str;
    }

    public void setRetryDelayStatus(RetryDelayStatus retryDelayStatus2) {
        this.retryDelayStatus = retryDelayStatus2;
    }

    public void setSavePath(String str) {
        this.savePath = str;
    }

    public void setShowNotification(boolean z) {
        this.showNotification = z;
    }

    public void setShowNotificationForAutoResumed(boolean z) {
        this.showNotificationForAutoResumed = z;
    }

    public void setShowNotificationForNetworkResumed(boolean z) {
        this.showNotificationForNetworkResumed = z;
    }

    public void setStatusAtDbInit(int i) {
        this.statusAtDbInit = i;
    }

    public void setSupportPartial(boolean z) {
        this.supportPartial = z;
    }

    public void setThrottleNetSpeed(long j) {
        this.throttleNetSpeed = j;
    }

    public void setTotalBytes(long j) {
        this.totalBytes = j;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public void seteTag(String str) {
        this.eTag = str;
    }

    public void increaseCurBytes(long j) {
        this.curBytes.addAndGet(j);
    }

    public synchronized void setIsSaveTempFile(boolean z) {
        this.isSaveTempFile = z;
    }

    public int getAntiHijackErrorCode(int i) {
        ensureDBJsonData();
        return this.dbJsonData.optInt("anti_hijack_error_code", i);
    }

    public int getSpIntVal(String str) {
        ensureSpData();
        return this.spData.optInt(str, 0);
    }

    public long getSpLongVal(String str) {
        ensureSpData();
        return this.spData.optLong(str, 0);
    }

    public String getSpStringVal(String str) {
        ensureSpData();
        return this.spData.optString(str, null);
    }

    public void setAntiHijackErrorCode(int i) {
        safePutToDBJsonData("anti_hijack_error_code", Integer.valueOf(i));
    }

    public void setCurBytes(long j) {
        AtomicLong atomicLong = this.curBytes;
        if (atomicLong != null) {
            atomicLong.set(j);
        } else {
            this.curBytes = new AtomicLong(j);
        }
    }

    public void setDownloadTime(long j) {
        if (j >= 0) {
            this.downloadTime = j;
        }
    }

    public void setExecutorGroup(int i) {
        safePutToDBJsonData("executor_group", Integer.valueOf(i));
    }

    public void setFailedResumeCount(int i) {
        ensureSpData();
        try {
            this.spData.put("failed_resume_count", i);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setFirstSpeedTime(long j) {
        safePutToDBJsonData("dbjson_key_first_speed_time", Long.valueOf(j));
    }

    public void setIsRwConcurrent(boolean z) {
        safePutToDBJsonData("rw_concurrent", Integer.valueOf(z ? 1 : 0));
    }

    public void setLastFailedResumeTime(long j) {
        ensureSpData();
        try {
            this.spData.put("last_failed_resume_time", j);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setLastUninstallResumeTime(long j) {
        ensureSpData();
        try {
            this.spData.put("last_unins_resume_time", j);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setPreconnectLevel(int i) {
        ensureDBJsonData();
        safePutToDBJsonData("dbjson_key_preconnect_level", Integer.valueOf(i));
    }

    public void setRetryScheduleCount(int i) {
        safePutToDBJsonData("retry_schedule_count", Integer.valueOf(i));
    }

    public void setSavePathRedirected(boolean z) {
        safePutToDBJsonData("is_save_path_redirected", Boolean.valueOf(z));
    }

    public void setStatus(int i) {
        AtomicInteger atomicInteger = this.status;
        if (atomicInteger != null) {
            atomicInteger.set(i);
        } else {
            this.status = new AtomicInteger(i);
        }
    }

    public void setTTMd5CheckStatus(int i) {
        safePutToDBJsonData("ttmd5_check_status", Integer.valueOf(i));
    }

    public void setUninstallResumeCount(int i) {
        ensureSpData();
        try {
            this.spData.put("unins_resume_count", i);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void convertEnqueueType(int i) {
        if (i == EnqueueType.ENQUEUE_HEAD.ordinal()) {
            this.enqueueType = EnqueueType.ENQUEUE_HEAD;
        } else if (i == EnqueueType.ENQUEUE_TAIL.ordinal()) {
            this.enqueueType = EnqueueType.ENQUEUE_TAIL;
        } else {
            this.enqueueType = EnqueueType.ENQUEUE_NONE;
        }
    }

    private JSONObject convertStrToJson(String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                return new JSONObject(str);
            }
            return null;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public long getMinByteIntervalForPostToMainThread(long j) {
        int i = this.maxProgressCount;
        if (i <= 0) {
            i = 100;
        }
        long j2 = j / ((long) (i + 1));
        if (j2 <= 0) {
            return 1048576;
        }
        return j2;
    }

    public void increaseAllConnectTime(long j) {
        if (j > 0) {
            getAllConnectTime();
            safePutToDBJsonData("dbjson_key_all_connect_time", Long.valueOf(this.allConnectTime.addAndGet(j)));
        }
    }

    public void increaseDownloadPrepareTime(long j) {
        if (j > 0) {
            safePutToDBJsonData("dbjson_key_download_prepare_time", Long.valueOf(getDownloadPrepareTime() + j));
        }
    }

    public void resetDataForEtagEndure(String str) {
        setCurBytes(0, true);
        setTotalBytes(0);
        seteTag(str);
        setChunkCount(1);
        this.downloadTime = 0;
        this.realStartDownloadTime = 0;
        this.realDownloadTime = 0;
    }

    public void updateCurRetryTime(int i) {
        int i2;
        if (this.backUpUrlUsed) {
            i2 = this.backUpUrlRetryCount;
        } else {
            i2 = this.retryCount;
        }
        int i3 = i2 - i;
        this.curRetryTime = i3;
        if (i3 < 0) {
            this.curRetryTime = 0;
        }
    }

    private void convertRetryDelayStatus(int i) {
        if (i == RetryDelayStatus.DELAY_RETRY_WAITING.ordinal()) {
            this.retryDelayStatus = RetryDelayStatus.DELAY_RETRY_WAITING;
        } else if (i == RetryDelayStatus.DELAY_RETRY_DOWNLOADING.ordinal()) {
            this.retryDelayStatus = RetryDelayStatus.DELAY_RETRY_DOWNLOADING;
        } else if (i == RetryDelayStatus.DELAY_RETRY_DOWNLOADED.ordinal()) {
            this.retryDelayStatus = RetryDelayStatus.DELAY_RETRY_DOWNLOADED;
        } else {
            this.retryDelayStatus = RetryDelayStatus.DELAY_RETRY_NONE;
        }
    }

    private void mergeAuxiliaryJSONObject(JSONObject jSONObject) {
        if (jSONObject != null) {
            ensureDBJsonData();
            synchronized (this.dbJsonData) {
                try {
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        Object opt = jSONObject.opt(next);
                        if (!this.dbJsonData.has(next)) {
                            if (opt != null) {
                                this.dbJsonData.put(next, opt);
                            }
                        }
                    }
                } catch (Exception unused) {
                }
                this.dbJsonDataString = null;
            }
            parseMonitorSetting();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: boolean */
    /* JADX WARN: Multi-variable type inference failed */
    private void refreshBackupUrls(boolean z) {
        List<String> list = this.forbiddenBackupUrls;
        if (list != null && list.size() > z) {
            List<String> list2 = this.backUpUrls;
            if (list2 == null) {
                this.backUpUrls = new ArrayList();
            } else {
                list2.clear();
            }
            this.backUpUrlUsed = false;
            this.curBackUpUrlIndex = 0;
            int i = z;
            while (i < this.forbiddenBackupUrls.size()) {
                this.backUpUrls.add(this.forbiddenBackupUrls.get(i == 1 ? 1 : 0));
                i++;
            }
        }
    }

    private void setBackUpUrlsStr(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.backUpUrlsStr = str;
            try {
                JSONArray jSONArray = new JSONArray(str);
                if (jSONArray.length() > 0) {
                    ArrayList arrayList = new ArrayList();
                    for (int i = 0; i < jSONArray.length(); i++) {
                        String optString = jSONArray.optString(i);
                        if (!TextUtils.isEmpty(optString)) {
                            arrayList.add(optString);
                        }
                    }
                    this.backUpUrls = arrayList;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public boolean equalsTask(DownloadInfo downloadInfo) {
        String str;
        String str2;
        if (downloadInfo == null || (str = this.url) == null || !str.equals(downloadInfo.getUrl()) || (str2 = this.savePath) == null || !str2.equals(downloadInfo.getSavePath())) {
            return false;
        }
        return true;
    }

    public synchronized void registerTempFileSaveCallback(AbstractC60041s sVar) {
        if (sVar != null) {
            try {
                C59990a.m232838b("DownloadInfo", "registerTempFileSaveCallback");
                if (this.tempFileSaveCompleteCallbacks == null) {
                    this.tempFileSaveCompleteCallbacks = new ArrayList();
                }
                if (!this.tempFileSaveCompleteCallbacks.contains(sVar)) {
                    this.tempFileSaveCompleteCallbacks.add(sVar);
                }
            } catch (Throwable th) {
                th.printStackTrace();
                sVar.mo204529a(new BaseException(1038, C60161d.m233788b(th, "registerTempFileSaveCallback")));
            }
            return;
        }
        return;
    }

    public void updateRealDownloadTime(boolean z) {
        long nanoTime = System.nanoTime();
        long j = this.realStartDownloadTime;
        if (j > 0) {
            long j2 = nanoTime - j;
            if (z) {
                this.realStartDownloadTime = nanoTime;
            } else {
                this.realStartDownloadTime = 0;
            }
            if (j2 > 0) {
                this.realDownloadTime += j2;
            }
        } else if (z) {
            this.realStartDownloadTime = nanoTime;
        }
    }

    protected DownloadInfo(Parcel parcel) {
        this.needDefaultHttpServiceBackUp = true;
        this.retryDelayStatus = RetryDelayStatus.DELAY_RETRY_NONE;
        this.asyncHandleStatus = AsyncHandleStatus.ASYNC_HANDLE_NONE;
        this.supportPartial = true;
        this.needSDKMonitor = true;
        this.chunkCount = 1;
        this.isFirstDownload = true;
        this.isFirstSuccess = true;
        this.byteInvalidRetryStatus = ByteInvalidRetryStatus.BYTE_INVALID_RETRY_STATUS_NONE;
        this.enqueueType = EnqueueType.ENQUEUE_NONE;
        this.lastNotifyProgressTime = new AtomicLong(0);
        this.newSaveTempFileEnable = true;
        this.isAutoInstallWithoutNotification = null;
        readFromParcel(parcel);
    }

    private DownloadInfo(C60119a aVar) {
        this.needDefaultHttpServiceBackUp = true;
        this.retryDelayStatus = RetryDelayStatus.DELAY_RETRY_NONE;
        this.asyncHandleStatus = AsyncHandleStatus.ASYNC_HANDLE_NONE;
        this.supportPartial = true;
        this.needSDKMonitor = true;
        this.chunkCount = 1;
        this.isFirstDownload = true;
        this.isFirstSuccess = true;
        this.byteInvalidRetryStatus = ByteInvalidRetryStatus.BYTE_INVALID_RETRY_STATUS_NONE;
        this.enqueueType = EnqueueType.ENQUEUE_NONE;
        this.lastNotifyProgressTime = new AtomicLong(0);
        this.newSaveTempFileEnable = true;
        this.isAutoInstallWithoutNotification = null;
        if (aVar != null) {
            this.name = aVar.f150007a;
            this.title = aVar.f150008b;
            this.url = aVar.f150009c;
            this.savePath = aVar.f150010d;
            this.tempPath = aVar.f150011e;
            this.status = new AtomicInteger(0);
            this.curBytes = new AtomicLong(0);
            this.extra = aVar.f150013g;
            this.onlyWifi = aVar.f150012f;
            this.extraHeaders = aVar.f150014h;
            this.maxBytes = aVar.f150015i;
            this.retryCount = aVar.f150018l;
            this.backUpUrlRetryCount = aVar.f150019m;
            this.force = aVar.f150020n;
            this.outIp = aVar.f150016j;
            this.outSize = aVar.f150017k;
            this.needPostProgress = aVar.f150021o;
            this.maxProgressCount = aVar.f150022p;
            this.minProgressTimeMsInterval = aVar.f150023q;
            this.backUpUrls = aVar.f150024r;
            this.showNotification = aVar.f150025s;
            this.mimeType = aVar.f150026t;
            this.needHttpsToHttpRetry = aVar.f150027u;
            this.needRetryDelay = aVar.f149990C;
            this.retryDelayTimeArray = aVar.f149991D;
            this.autoResumed = aVar.f150028v;
            this.showNotificationForAutoResumed = aVar.f150029w;
            this.needDefaultHttpServiceBackUp = aVar.f150030x;
            this.needReuseChunkRunnable = aVar.f150031y;
            this.packageName = aVar.f150032z;
            this.md5 = aVar.f149988A;
            this.needReuseFirstConnection = aVar.f149992E;
            this.needIndependentProcess = aVar.f149993F;
            this.enqueueType = aVar.f149994G;
            this.headConnectionAvailable = aVar.f149995H;
            this.ignoreDataVerify = aVar.f149996I;
            this.newSaveTempFileEnable = aVar.f150000M;
            this.addListenerToSameTask = aVar.f150001N;
            this.needChunkDowngradeRetry = aVar.f149997J;
            this.iconUrl = aVar.f149998K;
            this.throttleNetSpeed = aVar.f149999L;
            JSONObject jSONObject = aVar.f150002O;
            if (jSONObject != null) {
                safePutToDBJsonData("download_setting", jSONObject.toString());
            }
            safePutToDBJsonData("dbjson_key_expect_file_length", Long.valueOf(aVar.f149989B));
            safePutToDBJsonData("executor_group", Integer.valueOf(aVar.f150006S));
            this.needSDKMonitor = aVar.f150003P;
            this.monitorScene = aVar.f150004Q;
            this.extraMonitorStatus = aVar.f150005R;
            putMonitorSetting();
        }
    }

    public DownloadInfo(Cursor cursor) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11 = true;
        this.needDefaultHttpServiceBackUp = true;
        this.retryDelayStatus = RetryDelayStatus.DELAY_RETRY_NONE;
        this.asyncHandleStatus = AsyncHandleStatus.ASYNC_HANDLE_NONE;
        this.supportPartial = true;
        this.needSDKMonitor = true;
        this.chunkCount = 1;
        this.isFirstDownload = true;
        this.isFirstSuccess = true;
        this.byteInvalidRetryStatus = ByteInvalidRetryStatus.BYTE_INVALID_RETRY_STATUS_NONE;
        this.enqueueType = EnqueueType.ENQUEUE_NONE;
        this.lastNotifyProgressTime = new AtomicLong(0);
        this.newSaveTempFileEnable = true;
        this.isAutoInstallWithoutNotification = null;
        if (cursor != null) {
            try {
                int columnIndex = cursor.getColumnIndex("_id");
                if (columnIndex != -1) {
                    this.id = cursor.getInt(columnIndex);
                }
                int columnIndex2 = cursor.getColumnIndex("name");
                if (columnIndex2 != -1) {
                    this.name = cursor.getString(columnIndex2);
                }
                int columnIndex3 = cursor.getColumnIndex("title");
                if (columnIndex3 != -1) {
                    this.title = cursor.getString(columnIndex3);
                }
                int columnIndex4 = cursor.getColumnIndex("url");
                if (columnIndex4 != -1) {
                    this.url = cursor.getString(columnIndex4);
                }
                int columnIndex5 = cursor.getColumnIndex("savePath");
                if (columnIndex5 != -1) {
                    this.savePath = cursor.getString(columnIndex5);
                }
                int columnIndex6 = cursor.getColumnIndex("tempPath");
                if (columnIndex6 != -1) {
                    this.tempPath = cursor.getString(columnIndex6);
                }
                int columnIndex7 = cursor.getColumnIndex("chunkCount");
                if (columnIndex7 != -1) {
                    this.chunkCount = cursor.getInt(columnIndex7);
                }
                int columnIndex8 = cursor.getColumnIndex(UpdateKey.STATUS);
                if (columnIndex8 != -1) {
                    this.status = new AtomicInteger(cursor.getInt(columnIndex8));
                } else {
                    this.status = new AtomicInteger(0);
                }
                int columnIndex9 = cursor.getColumnIndex("curBytes");
                if (columnIndex9 != -1) {
                    this.curBytes = new AtomicLong(cursor.getLong(columnIndex9));
                } else {
                    this.curBytes = new AtomicLong(0);
                }
                int columnIndex10 = cursor.getColumnIndex("totalBytes");
                if (columnIndex10 != -1) {
                    this.totalBytes = cursor.getLong(columnIndex10);
                }
                int columnIndex11 = cursor.getColumnIndex("eTag");
                if (columnIndex11 != -1) {
                    this.eTag = cursor.getString(columnIndex11);
                }
                int columnIndex12 = cursor.getColumnIndex("onlyWifi");
                if (columnIndex12 != -1) {
                    if (cursor.getInt(columnIndex12) != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    this.onlyWifi = z10;
                }
                int columnIndex13 = cursor.getColumnIndex("force");
                if (columnIndex13 != -1) {
                    if (cursor.getInt(columnIndex13) != 0) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    this.force = z9;
                }
                int columnIndex14 = cursor.getColumnIndex("retryCount");
                if (columnIndex14 != -1) {
                    this.retryCount = cursor.getInt(columnIndex14);
                }
                int columnIndex15 = cursor.getColumnIndex("extra");
                if (columnIndex15 != -1) {
                    this.extra = cursor.getString(columnIndex15);
                }
                int columnIndex16 = cursor.getColumnIndex("mimeType");
                if (columnIndex16 != -1) {
                    this.mimeType = cursor.getString(columnIndex16);
                }
                int columnIndex17 = cursor.getColumnIndex("notificationEnable");
                if (columnIndex17 != -1) {
                    if (cursor.getInt(columnIndex17) != 0) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    this.showNotification = z8;
                }
                int columnIndex18 = cursor.getColumnIndex("notificationVisibility");
                if (columnIndex18 != -1) {
                    this.notificationVisibility = cursor.getInt(columnIndex18);
                }
                int columnIndex19 = cursor.getColumnIndex("isFirstDownload");
                if (columnIndex19 != -1) {
                    if (cursor.getInt(columnIndex19) == 1) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    this.isFirstDownload = z7;
                }
                int columnIndex20 = cursor.getColumnIndex("isFirstSuccess");
                if (columnIndex20 != -1) {
                    if (cursor.getInt(columnIndex20) == 1) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    this.isFirstSuccess = z6;
                }
                int columnIndex21 = cursor.getColumnIndex("needHttpsToHttpRetry");
                if (columnIndex21 != -1) {
                    if (cursor.getInt(columnIndex21) == 1) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    this.needHttpsToHttpRetry = z5;
                }
                int columnIndex22 = cursor.getColumnIndex("downloadTime");
                if (columnIndex22 != -1) {
                    this.downloadTime = cursor.getLong(columnIndex22);
                }
                int columnIndex23 = cursor.getColumnIndex("packageName");
                if (columnIndex23 != -1) {
                    this.packageName = cursor.getString(columnIndex23);
                }
                int columnIndex24 = cursor.getColumnIndex("md5");
                if (columnIndex24 != -1) {
                    this.md5 = cursor.getString(columnIndex24);
                }
                int columnIndex25 = cursor.getColumnIndex("retryDelay");
                if (columnIndex25 != -1) {
                    if (cursor.getInt(columnIndex25) == 1) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    this.needRetryDelay = z4;
                }
                int columnIndex26 = cursor.getColumnIndex("curRetryTime");
                if (columnIndex26 != -1) {
                    this.curRetryTime = cursor.getInt(columnIndex26);
                }
                int columnIndex27 = cursor.getColumnIndex("retryDelayStatus");
                if (columnIndex27 != -1) {
                    int i = cursor.getInt(columnIndex27);
                    if (i == RetryDelayStatus.DELAY_RETRY_WAITING.ordinal()) {
                        this.retryDelayStatus = RetryDelayStatus.DELAY_RETRY_WAITING;
                    } else if (i == RetryDelayStatus.DELAY_RETRY_DOWNLOADING.ordinal()) {
                        this.retryDelayStatus = RetryDelayStatus.DELAY_RETRY_DOWNLOADING;
                    } else if (i == RetryDelayStatus.DELAY_RETRY_DOWNLOADED.ordinal()) {
                        this.retryDelayStatus = RetryDelayStatus.DELAY_RETRY_DOWNLOADED;
                    } else {
                        this.retryDelayStatus = RetryDelayStatus.DELAY_RETRY_NONE;
                    }
                }
                int columnIndex28 = cursor.getColumnIndex("defaultHttpServiceBackUp");
                if (columnIndex28 != -1) {
                    if (cursor.getInt(columnIndex28) == 1) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    this.needDefaultHttpServiceBackUp = z3;
                }
                int columnIndex29 = cursor.getColumnIndex("chunkRunnableReuse");
                if (columnIndex29 != -1) {
                    if (cursor.getInt(columnIndex29) == 1) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    this.needReuseChunkRunnable = z2;
                }
                int columnIndex30 = cursor.getColumnIndex("retryDelayTimeArray");
                if (columnIndex30 != -1) {
                    this.retryDelayTimeArray = cursor.getString(columnIndex30);
                }
                int columnIndex31 = cursor.getColumnIndex("chunkDowngradeRetry");
                if (columnIndex31 != -1) {
                    if (cursor.getInt(columnIndex31) == 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    this.needChunkDowngradeRetry = z;
                }
                int columnIndex32 = cursor.getColumnIndex("backUpUrlsStr");
                if (columnIndex32 != -1) {
                    setBackUpUrlsStr(cursor.getString(columnIndex32));
                }
                int columnIndex33 = cursor.getColumnIndex("backUpUrlRetryCount");
                if (columnIndex33 != -1) {
                    this.backUpUrlRetryCount = cursor.getInt(columnIndex33);
                }
                int columnIndex34 = cursor.getColumnIndex("realDownloadTime");
                if (columnIndex34 != -1) {
                    this.realDownloadTime = cursor.getLong(columnIndex34);
                }
                int columnIndex35 = cursor.getColumnIndex("retryScheduleMinutes");
                if (columnIndex35 != -1) {
                    this.retryScheduleMinutes = cursor.getInt(columnIndex35);
                }
                int columnIndex36 = cursor.getColumnIndex("independentProcess");
                if (columnIndex36 != -1) {
                    if (cursor.getInt(columnIndex36) != 1) {
                        z11 = false;
                    }
                    this.needIndependentProcess = z11;
                }
                int columnIndex37 = cursor.getColumnIndex("auxiliaryJsonobjectString");
                if (columnIndex37 != -1) {
                    this.dbJsonDataString = cursor.getString(columnIndex37);
                }
                int columnIndex38 = cursor.getColumnIndex("iconUrl");
                if (columnIndex38 != -1) {
                    this.iconUrl = cursor.getString(columnIndex38);
                }
                int columnIndex39 = cursor.getColumnIndex("appVersionCode");
                if (columnIndex39 != -1) {
                    this.appVersionCode = cursor.getInt(columnIndex39);
                }
                parseMonitorSetting();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void bindValue(SQLiteStatement sQLiteStatement) {
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        long j7;
        long j8;
        long j9;
        long j10;
        if (sQLiteStatement != null) {
            this.bindValueCount = 0;
            sQLiteStatement.clearBindings();
            int i = this.bindValueCount + 1;
            this.bindValueCount = i;
            sQLiteStatement.bindLong(i, (long) this.id);
            int i2 = this.bindValueCount + 1;
            this.bindValueCount = i2;
            String str = this.url;
            String str2 = "";
            if (str == null) {
                str = str2;
            }
            sQLiteStatement.bindString(i2, str);
            int i3 = this.bindValueCount + 1;
            this.bindValueCount = i3;
            String str3 = this.savePath;
            if (str3 == null) {
                str3 = str2;
            }
            sQLiteStatement.bindString(i3, str3);
            int i4 = this.bindValueCount + 1;
            this.bindValueCount = i4;
            String str4 = this.tempPath;
            if (str4 == null) {
                str4 = str2;
            }
            sQLiteStatement.bindString(i4, str4);
            int i5 = this.bindValueCount + 1;
            this.bindValueCount = i5;
            String str5 = this.name;
            if (str5 == null) {
                str5 = str2;
            }
            sQLiteStatement.bindString(i5, str5);
            int i6 = this.bindValueCount + 1;
            this.bindValueCount = i6;
            sQLiteStatement.bindLong(i6, (long) this.chunkCount);
            int i7 = this.bindValueCount + 1;
            this.bindValueCount = i7;
            sQLiteStatement.bindLong(i7, (long) getStatus());
            int i8 = this.bindValueCount + 1;
            this.bindValueCount = i8;
            sQLiteStatement.bindLong(i8, getCurBytes());
            int i9 = this.bindValueCount + 1;
            this.bindValueCount = i9;
            sQLiteStatement.bindLong(i9, this.totalBytes);
            int i10 = this.bindValueCount + 1;
            this.bindValueCount = i10;
            String str6 = this.eTag;
            if (str6 == null) {
                str6 = str2;
            }
            sQLiteStatement.bindString(i10, str6);
            int i11 = this.bindValueCount + 1;
            this.bindValueCount = i11;
            long j11 = 1;
            if (this.onlyWifi) {
                j = 1;
            } else {
                j = 0;
            }
            sQLiteStatement.bindLong(i11, j);
            int i12 = this.bindValueCount + 1;
            this.bindValueCount = i12;
            if (this.force) {
                j2 = 1;
            } else {
                j2 = 0;
            }
            sQLiteStatement.bindLong(i12, j2);
            int i13 = this.bindValueCount + 1;
            this.bindValueCount = i13;
            sQLiteStatement.bindLong(i13, (long) this.retryCount);
            int i14 = this.bindValueCount + 1;
            this.bindValueCount = i14;
            String str7 = this.extra;
            if (str7 == null) {
                str7 = str2;
            }
            sQLiteStatement.bindString(i14, str7);
            int i15 = this.bindValueCount + 1;
            this.bindValueCount = i15;
            String str8 = this.mimeType;
            if (str8 == null) {
                str8 = str2;
            }
            sQLiteStatement.bindString(i15, str8);
            int i16 = this.bindValueCount + 1;
            this.bindValueCount = i16;
            String str9 = this.title;
            if (str9 == null) {
                str9 = str2;
            }
            sQLiteStatement.bindString(i16, str9);
            int i17 = this.bindValueCount + 1;
            this.bindValueCount = i17;
            if (this.showNotification) {
                j3 = 1;
            } else {
                j3 = 0;
            }
            sQLiteStatement.bindLong(i17, j3);
            int i18 = this.bindValueCount + 1;
            this.bindValueCount = i18;
            sQLiteStatement.bindLong(i18, (long) this.notificationVisibility);
            int i19 = this.bindValueCount + 1;
            this.bindValueCount = i19;
            if (this.isFirstDownload) {
                j4 = 1;
            } else {
                j4 = 0;
            }
            sQLiteStatement.bindLong(i19, j4);
            int i20 = this.bindValueCount + 1;
            this.bindValueCount = i20;
            if (this.isFirstSuccess) {
                j5 = 1;
            } else {
                j5 = 0;
            }
            sQLiteStatement.bindLong(i20, j5);
            int i21 = this.bindValueCount + 1;
            this.bindValueCount = i21;
            if (this.needHttpsToHttpRetry) {
                j6 = 1;
            } else {
                j6 = 0;
            }
            sQLiteStatement.bindLong(i21, j6);
            int i22 = this.bindValueCount + 1;
            this.bindValueCount = i22;
            sQLiteStatement.bindLong(i22, this.downloadTime);
            int i23 = this.bindValueCount + 1;
            this.bindValueCount = i23;
            String str10 = this.packageName;
            if (str10 == null) {
                str10 = str2;
            }
            sQLiteStatement.bindString(i23, str10);
            int i24 = this.bindValueCount + 1;
            this.bindValueCount = i24;
            String str11 = this.md5;
            if (str11 == null) {
                str11 = str2;
            }
            sQLiteStatement.bindString(i24, str11);
            int i25 = this.bindValueCount + 1;
            this.bindValueCount = i25;
            if (this.needRetryDelay) {
                j7 = 1;
            } else {
                j7 = 0;
            }
            sQLiteStatement.bindLong(i25, j7);
            int i26 = this.bindValueCount + 1;
            this.bindValueCount = i26;
            sQLiteStatement.bindLong(i26, (long) this.curRetryTime);
            int i27 = this.bindValueCount + 1;
            this.bindValueCount = i27;
            sQLiteStatement.bindLong(i27, (long) this.retryDelayStatus.ordinal());
            int i28 = this.bindValueCount + 1;
            this.bindValueCount = i28;
            if (this.needDefaultHttpServiceBackUp) {
                j8 = 1;
            } else {
                j8 = 0;
            }
            sQLiteStatement.bindLong(i28, j8);
            int i29 = this.bindValueCount + 1;
            this.bindValueCount = i29;
            if (this.needReuseChunkRunnable) {
                j9 = 1;
            } else {
                j9 = 0;
            }
            sQLiteStatement.bindLong(i29, j9);
            int i30 = this.bindValueCount + 1;
            this.bindValueCount = i30;
            String str12 = this.retryDelayTimeArray;
            if (str12 == null) {
                str12 = str2;
            }
            sQLiteStatement.bindString(i30, str12);
            int i31 = this.bindValueCount + 1;
            this.bindValueCount = i31;
            if (this.needChunkDowngradeRetry) {
                j10 = 1;
            } else {
                j10 = 0;
            }
            sQLiteStatement.bindLong(i31, j10);
            int i32 = this.bindValueCount + 1;
            this.bindValueCount = i32;
            sQLiteStatement.bindString(i32, getBackUpUrlsStr());
            int i33 = this.bindValueCount + 1;
            this.bindValueCount = i33;
            sQLiteStatement.bindLong(i33, (long) this.backUpUrlRetryCount);
            int i34 = this.bindValueCount + 1;
            this.bindValueCount = i34;
            sQLiteStatement.bindLong(i34, this.realDownloadTime);
            int i35 = this.bindValueCount + 1;
            this.bindValueCount = i35;
            sQLiteStatement.bindLong(i35, (long) this.retryScheduleMinutes);
            int i36 = this.bindValueCount + 1;
            this.bindValueCount = i36;
            if (!this.needIndependentProcess) {
                j11 = 0;
            }
            sQLiteStatement.bindLong(i36, j11);
            int i37 = this.bindValueCount + 1;
            this.bindValueCount = i37;
            sQLiteStatement.bindString(i37, getDBJsonDataString());
            int i38 = this.bindValueCount + 1;
            this.bindValueCount = i38;
            String str13 = this.iconUrl;
            if (str13 != null) {
                str2 = str13;
            }
            sQLiteStatement.bindString(i38, str2);
            int i39 = this.bindValueCount + 1;
            this.bindValueCount = i39;
            sQLiteStatement.bindLong(i39, (long) this.appVersionCode);
        }
    }

    public void readFromParcel(Parcel parcel) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z20;
        boolean z21;
        boolean z22;
        boolean z23;
        this.id = parcel.readInt();
        this.name = parcel.readString();
        this.title = parcel.readString();
        this.url = parcel.readString();
        this.savePath = parcel.readString();
        this.tempPath = parcel.readString();
        boolean z24 = true;
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.onlyWifi = z;
        this.extra = parcel.readString();
        this.extraHeaders = parcel.createTypedArrayList(HttpHeader.CREATOR);
        this.maxBytes = parcel.readInt();
        this.outIp = parcel.createStringArray();
        this.outSize = parcel.createIntArray();
        this.retryCount = parcel.readInt();
        this.backUpUrlRetryCount = parcel.readInt();
        if (parcel.readByte() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.force = z2;
        if (parcel.readByte() != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.needPostProgress = z3;
        this.maxProgressCount = parcel.readInt();
        this.minProgressTimeMsInterval = parcel.readInt();
        this.backUpUrls = parcel.createStringArrayList();
        if (parcel.readByte() != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.showNotification = z4;
        this.mimeType = parcel.readString();
        if (parcel.readByte() != 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        this.needHttpsToHttpRetry = z5;
        this.packageName = parcel.readString();
        this.md5 = parcel.readString();
        if (parcel.readByte() != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        this.needRetryDelay = z6;
        if (parcel.readByte() != 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        this.needDefaultHttpServiceBackUp = z7;
        if (parcel.readByte() != 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.needReuseChunkRunnable = z8;
        this.retryDelayTimeArray = parcel.readString();
        this.eTag = parcel.readString();
        this.curRetryTime = parcel.readInt();
        convertRetryDelayStatus(parcel.readInt());
        if (parcel.readByte() != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.needReuseFirstConnection = z9;
        if (parcel.readByte() != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.forceIgnoreRecommendSize = z10;
        this.networkQuality = parcel.readString();
        this.curBackUpUrlIndex = parcel.readInt();
        this.notificationVisibility = parcel.readInt();
        this.chunkCount = parcel.readInt();
        setCurBytes(parcel.readLong());
        this.totalBytes = parcel.readLong();
        setStatus(parcel.readInt());
        this.downloadTime = parcel.readLong();
        this.realDownloadTime = parcel.readLong();
        if (parcel.readByte() != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.backUpUrlUsed = z11;
        if (parcel.readByte() != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.httpsToHttpRetryUsed = z12;
        try {
            StringBuffer stringBuffer = this.errorBytesLog;
            if (stringBuffer == null) {
                this.errorBytesLog = new StringBuffer(parcel.readString());
            } else {
                stringBuffer.delete(0, stringBuffer.length()).append(parcel.readString());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (parcel.readByte() != 0) {
            z13 = true;
        } else {
            z13 = false;
        }
        this.autoResumed = z13;
        if (parcel.readByte() != 0) {
            z14 = true;
        } else {
            z14 = false;
        }
        this.showNotificationForAutoResumed = z14;
        if (parcel.readByte() != 0) {
            z15 = true;
        } else {
            z15 = false;
        }
        this.showNotificationForNetworkResumed = z15;
        this.forbiddenBackupUrls = parcel.createStringArrayList();
        if (parcel.readByte() != 0) {
            z16 = true;
        } else {
            z16 = false;
        }
        this.needIndependentProcess = z16;
        convertEnqueueType(parcel.readInt());
        if (parcel.readByte() != 0) {
            z17 = true;
        } else {
            z17 = false;
        }
        this.headConnectionAvailable = z17;
        this.httpStatusCode = parcel.readInt();
        this.httpStatusMessage = parcel.readString();
        if (parcel.readByte() != 0) {
            z18 = true;
        } else {
            z18 = false;
        }
        this.isSaveTempFile = z18;
        if (parcel.readByte() != 0) {
            z19 = true;
        } else {
            z19 = false;
        }
        this.isForbiddenRetryed = z19;
        if (parcel.readByte() != 0) {
            z20 = true;
        } else {
            z20 = false;
        }
        this.newSaveTempFileEnable = z20;
        if (parcel.readByte() != 0) {
            z21 = true;
        } else {
            z21 = false;
        }
        this.addListenerToSameTask = z21;
        if (parcel.readByte() != 0) {
            z22 = true;
        } else {
            z22 = false;
        }
        this.needChunkDowngradeRetry = z22;
        if (parcel.readByte() != 0) {
            z23 = true;
        } else {
            z23 = false;
        }
        this.chunkDowngradeRetryUsed = z23;
        this.failedException = (BaseException) parcel.readParcelable(BaseException.class.getClassLoader());
        this.retryScheduleMinutes = parcel.readInt();
        this.dbJsonDataString = parcel.readString();
        if (parcel.readByte() == 0) {
            z24 = false;
        }
        this.supportPartial = z24;
        this.iconUrl = parcel.readString();
        this.appVersionCode = parcel.readInt();
        parseMonitorSetting();
    }

    public void setForbiddenBackupUrls(List<String> list, boolean z) {
        this.forbiddenBackupUrls = list;
        refreshBackupUrls(z);
    }

    private void safePutToDBJsonData(String str, Object obj) {
        ensureDBJsonData();
        synchronized (this.dbJsonData) {
            try {
                this.dbJsonData.put(str, obj);
            } catch (Exception unused) {
            }
            this.dbJsonDataString = null;
        }
    }

    public void setCurBytes(long j, boolean z) {
        if (z) {
            setCurBytes(j);
        } else if (j > getCurBytes()) {
            setCurBytes(j);
        }
    }

    public void setSpValue(String str, String str2) {
        ensureSpData();
        try {
            this.spData.put(str, str2);
            updateSpData();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void copyFromCacheData(DownloadInfo downloadInfo, boolean z) {
        if (downloadInfo != null) {
            setChunkCount(downloadInfo.getChunkCount());
            setTotalBytes(downloadInfo.getTotalBytes());
            setCurBytes(downloadInfo.getCurBytes(), true);
            this.realDownloadTime = downloadInfo.realDownloadTime;
            if (downloadInfo.canSkipStatusHandler() || canSkipStatusHandler()) {
                this.curRetryTime = downloadInfo.getCurRetryTime();
            } else {
                this.curRetryTime = 0;
                this.isForbiddenRetryed = false;
                this.backUpUrlUsed = false;
                this.curBackUpUrlIndex = 0;
                this.httpsToHttpRetryUsed = false;
            }
            seteTag(downloadInfo.geteTag());
            if (z) {
                setStatus(downloadInfo.getStatus());
            }
            this.isFirstDownload = downloadInfo.getIsFirstDownload();
            this.isFirstSuccess = downloadInfo.isFirstSuccess();
            this.retryDelayStatus = downloadInfo.getRetryDelayStatus();
            mergeAuxiliaryJSONObject(downloadInfo.dbJsonData);
        }
    }

    public synchronized void handleTempSaveCallback(boolean z, BaseException baseException) {
        this.isSaveTempFile = false;
        if (this.tempFileSaveCompleteCallbacks != null) {
            C59990a.m232838b("DownloadInfo", "handleTempSaveCallback isSuccess " + z + " callback size:" + this.tempFileSaveCompleteCallbacks.size());
            for (AbstractC60041s sVar : this.tempFileSaveCompleteCallbacks) {
                if (sVar != null) {
                    if (z) {
                        sVar.mo204528a();
                    } else {
                        sVar.mo204529a(baseException);
                    }
                }
            }
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        String str;
        parcel.writeInt(this.id);
        parcel.writeString(this.name);
        parcel.writeString(this.title);
        parcel.writeString(this.url);
        parcel.writeString(this.savePath);
        parcel.writeString(this.tempPath);
        parcel.writeByte(this.onlyWifi ? (byte) 1 : 0);
        parcel.writeString(this.extra);
        parcel.writeTypedList(this.extraHeaders);
        parcel.writeInt(this.maxBytes);
        parcel.writeStringArray(this.outIp);
        parcel.writeIntArray(this.outSize);
        parcel.writeInt(this.retryCount);
        parcel.writeInt(this.backUpUrlRetryCount);
        parcel.writeByte(this.force ? (byte) 1 : 0);
        parcel.writeByte(this.needPostProgress ? (byte) 1 : 0);
        parcel.writeInt(this.maxProgressCount);
        parcel.writeInt(this.minProgressTimeMsInterval);
        parcel.writeStringList(this.backUpUrls);
        parcel.writeByte(this.showNotification ? (byte) 1 : 0);
        parcel.writeString(this.mimeType);
        parcel.writeByte(this.needHttpsToHttpRetry ? (byte) 1 : 0);
        parcel.writeString(this.packageName);
        parcel.writeString(this.md5);
        parcel.writeByte(this.needRetryDelay ? (byte) 1 : 0);
        parcel.writeByte(this.needDefaultHttpServiceBackUp ? (byte) 1 : 0);
        parcel.writeByte(this.needReuseChunkRunnable ? (byte) 1 : 0);
        parcel.writeString(this.retryDelayTimeArray);
        parcel.writeString(this.eTag);
        parcel.writeInt(this.curRetryTime);
        parcel.writeInt(this.retryDelayStatus.ordinal());
        parcel.writeByte(this.needReuseFirstConnection ? (byte) 1 : 0);
        parcel.writeByte(this.forceIgnoreRecommendSize ? (byte) 1 : 0);
        parcel.writeString(this.networkQuality);
        parcel.writeInt(this.curBackUpUrlIndex);
        parcel.writeInt(this.notificationVisibility);
        parcel.writeInt(this.chunkCount);
        parcel.writeLong(getCurBytes());
        parcel.writeLong(this.totalBytes);
        parcel.writeInt(getRealStatus());
        parcel.writeLong(this.downloadTime);
        parcel.writeLong(this.realDownloadTime);
        parcel.writeByte(this.backUpUrlUsed ? (byte) 1 : 0);
        parcel.writeByte(this.httpsToHttpRetryUsed ? (byte) 1 : 0);
        StringBuffer stringBuffer = this.errorBytesLog;
        if (stringBuffer != null) {
            str = stringBuffer.toString();
        } else {
            str = "";
        }
        parcel.writeString(str);
        parcel.writeByte(this.autoResumed ? (byte) 1 : 0);
        parcel.writeByte(this.showNotificationForAutoResumed ? (byte) 1 : 0);
        parcel.writeByte(this.showNotificationForNetworkResumed ? (byte) 1 : 0);
        parcel.writeStringList(this.forbiddenBackupUrls);
        parcel.writeByte(this.needIndependentProcess ? (byte) 1 : 0);
        parcel.writeInt(this.enqueueType.ordinal());
        parcel.writeByte(this.headConnectionAvailable ? (byte) 1 : 0);
        parcel.writeInt(this.httpStatusCode);
        parcel.writeString(this.httpStatusMessage);
        parcel.writeByte(this.isSaveTempFile ? (byte) 1 : 0);
        parcel.writeByte(this.isForbiddenRetryed ? (byte) 1 : 0);
        parcel.writeByte(this.newSaveTempFileEnable ? (byte) 1 : 0);
        parcel.writeByte(this.addListenerToSameTask ? (byte) 1 : 0);
        parcel.writeByte(this.needChunkDowngradeRetry ? (byte) 1 : 0);
        parcel.writeByte(this.chunkDowngradeRetryUsed ? (byte) 1 : 0);
        parcel.writeParcelable(this.failedException, i);
        parcel.writeInt(this.retryScheduleMinutes);
        parcel.writeString(getDBJsonDataString());
        parcel.writeByte(this.supportPartial ? (byte) 1 : 0);
        parcel.writeString(this.iconUrl);
        parcel.writeInt(this.appVersionCode);
    }

    public void addErrorBytesLog(long j, int i, String str) {
        try {
            if (C59990a.m232836a()) {
                if (this.errorBytesLog == null) {
                    this.errorBytesLog = new StringBuffer();
                }
                if (this.errorBytesLog.length() != 0) {
                    this.errorBytesLog.append(",");
                }
                StringBuffer stringBuffer = this.errorBytesLog;
                stringBuffer.append("[type:");
                stringBuffer.append(i);
                stringBuffer.append(",bytes:");
                stringBuffer.append(j);
                stringBuffer.append(",method:");
                stringBuffer.append(str);
                stringBuffer.append("]");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
