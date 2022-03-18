package com.ss.ttvideoengine.utils;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.huawei.hms.android.HwBuildEx;
import com.ss.ttvideoengine.net.NetUtils;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeService {
    public static int mErrorCount = 0;
    private static boolean mForceUseLocalTime = true;
    public static String mNtpServer;
    public static int mState = 0;
    public static TimeInfo mTimeInfo = new TimeInfo();

    /* access modifiers changed from: package-private */
    public static class TimeInfo {
        public long mLocalTime = -1;
        public long mNtpTime = -1;

        TimeInfo() {
        }

        public boolean isUpdated() {
            if (this.mNtpTime > 0) {
                return true;
            }
            return false;
        }
    }

    public static boolean isUpdated() {
        synchronized (TimeService.class) {
            TimeInfo timeInfo = mTimeInfo;
            if (timeInfo == null) {
                return false;
            }
            return timeInfo.isUpdated();
        }
    }

    public static long currentTimeMillis() {
        if (!mForceUseLocalTime) {
            synchronized (TimeService.class) {
                TimeInfo timeInfo = mTimeInfo;
                if (timeInfo != null && timeInfo.isUpdated()) {
                    return (mTimeInfo.mNtpTime + SystemClock.elapsedRealtime()) - mTimeInfo.mLocalTime;
                }
            }
        }
        return System.currentTimeMillis();
    }

    public static void updateTimeFromNTP(final Context context) {
        if (!mForceUseLocalTime && !TextUtils.isEmpty(mNtpServer)) {
            synchronized (TimeService.class) {
                TimeInfo timeInfo = mTimeInfo;
                if (timeInfo != null && timeInfo.isUpdated()) {
                    return;
                }
                if (context != null && !NetUtils.isNetAvailable(context)) {
                    TTVideoEngineLog.m256500d("TimeService", "network unavailable");
                } else if (mState == 0) {
                    mState = 1;
                    if (mErrorCount <= 6) {
                        EngineThreadPool.addExecuteTask(new Runnable() {
                            /* class com.ss.ttvideoengine.utils.TimeService.RunnableC654861 */

                            public void run() {
                                SntpClient sntpClient = new SntpClient();
                                boolean requestTime = sntpClient.requestTime(TimeService.mNtpServer, HwBuildEx.VersionCodes.CUR_DEVELOPMENT);
                                synchronized (TimeService.class) {
                                    if (!requestTime) {
                                        Context context = context;
                                        if (context != null && NetUtils.isNetAvailable(context)) {
                                            TimeService.mErrorCount++;
                                        }
                                        TTVideoEngineLog.m256500d("TimeService", "NTP update fail,error count:" + TimeService.mErrorCount);
                                        TimeService.mState = 0;
                                    } else if (TimeService.mTimeInfo != null) {
                                        TimeService.mTimeInfo.mNtpTime = sntpClient.getNtpTime();
                                        TimeService.mTimeInfo.mLocalTime = sntpClient.getNtpTimeReference();
                                        TimeService.mState = 2;
                                        TTVideoEngineLog.m256500d("TimeService", "NTP updated time:" + TimeService.longToStringWithFormat((TimeService.mTimeInfo.mNtpTime + SystemClock.elapsedRealtime()) - TimeService.mTimeInfo.mLocalTime, "yyyy-MM-dd HH:mm:ss.SSS"));
                                    }
                                }
                            }
                        });
                    }
                }
            }
        }
    }

    public static String longToStringWithFormat(long j, String str) {
        try {
            return new SimpleDateFormat(str).format(new Date(j));
        } catch (Exception unused) {
            return "";
        }
    }

    public static void setForceUseLocalTime(boolean z, String str) {
        TTVideoEngineLog.m256500d("TimeService", "force use localtime:" + z);
        mForceUseLocalTime = z;
        mNtpServer = str;
    }
}
