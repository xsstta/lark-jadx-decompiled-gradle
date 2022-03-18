package com.bytedance.crash.runtime;

import android.text.TextUtils;
import com.bytedance.crash.AbstractC3725d;
import com.bytedance.crash.C3756h;
import com.bytedance.crash.C3774m;
import com.bytedance.crash.entity.C3746e;
import com.bytedance.crash.runtime.p228b.C3843b;
import com.bytedance.crash.runtime.p228b.C3845c;
import com.bytedance.crash.upload.C3886a;
import com.bytedance.crash.util.C3933b;
import com.bytedance.crash.util.C3946j;
import com.bytedance.crash.util.C3952n;
import com.bytedance.crash.util.C3966w;
import com.bytedance.news.common.service.manager.C20216d;
import com.bytedance.services.slardar.config.IConfigManager;
import com.ss.ttm.player.MediaPlayer;
import java.util.Set;
import java.util.concurrent.ThreadPoolExecutor;

public class ConfigManager {
    private static boolean sApmExists = true;
    private static IConfigManager sConfigManager;
    private String mAlogUploadUrl = "";
    private volatile long mAnrCheckInterval = 500;
    private String mApmConfigUrl = "";
    private String mAsanReportUploadUrl = "";
    private boolean mBlockMonitorEnable;
    private long mBlockMonitorInterval = 1000;
    private String mCoreDumpUrl = "";
    private AbstractC3725d mEncryptImpl = new AbstractC3725d() {
        /* class com.bytedance.crash.runtime.ConfigManager.C38211 */

        @Override // com.bytedance.crash.AbstractC3725d
        /* renamed from: a */
        public byte[] mo15182a(byte[] bArr) {
            return C3946j.m16382a(bArr);
        }
    };
    private boolean mEnsureEnable = true;
    private boolean mEnsureWithLogcat;
    private final String mEventUploadUrl = "";
    private String mExceptionUploadUrl = "";
    private String mExceptionZipUploadUrl = "";
    private boolean mIsDebugMode;
    private String mJavaCrashUploadUrl = "";
    private long mLaunchCrashInterval = 8000;
    private String mLaunchCrashUploadUrl = "";
    private int mLogcatDumpCount = MediaPlayer.MEDIA_PLAYER_OPTION_APPID;
    private int mLogcatLevel = 1;
    private final boolean mNativeCrashMiniDump = true;
    private String mNativeCrashUploadUrl = "";
    private String mNativeMemUrl = "";
    private ThreadPoolExecutor mThreadPoolExecutor;
    private String mUploadCheckCoreDumpUrl = "";
    private boolean reportErrorEnable = true;

    public boolean isNativeCrashMiniDump() {
        return true;
    }

    public long getBlockInterval() {
        return this.mBlockMonitorInterval;
    }

    public long getDefaultAnrCheckInterval() {
        return this.mAnrCheckInterval;
    }

    public AbstractC3725d getEncryptImpl() {
        return this.mEncryptImpl;
    }

    public long getLaunchCrashInterval() {
        return this.mLaunchCrashInterval;
    }

    public int getLogcatDumpCount() {
        return this.mLogcatDumpCount;
    }

    public int getLogcatLevel() {
        return this.mLogcatLevel;
    }

    public ThreadPoolExecutor getThreadPoolExecutor() {
        return this.mThreadPoolExecutor;
    }

    public boolean isBlockMonitorEnable() {
        return this.mBlockMonitorEnable;
    }

    public boolean isEnsureWithLogcat() {
        return this.mEnsureWithLogcat;
    }

    public boolean isReportErrorEnable() {
        return this.reportErrorEnable;
    }

    public Set<String> getFilterThreadSet() {
        return C3952n.m16432a();
    }

    public boolean isApmExists() {
        return C3886a.m16116d();
    }

    public boolean isDebugMode() {
        if (this.mIsDebugMode || C3746e.m15492d()) {
            return true;
        }
        return false;
    }

    public String getAlogUploadUrl() {
        if (!TextUtils.isEmpty(this.mAlogUploadUrl)) {
            return this.mAlogUploadUrl;
        }
        return C3823a.f11741a + "/monitor/collect/c/logcollect";
    }

    public IConfigManager getApmConfigManager() {
        if (sApmExists && sConfigManager == null) {
            try {
                sConfigManager = (IConfigManager) C20216d.m73783a(IConfigManager.class);
            } catch (Throwable unused) {
                sApmExists = false;
            }
        }
        if (sApmExists) {
            return sConfigManager;
        }
        return null;
    }

    public String getApmConfigUrl() {
        if (!TextUtils.isEmpty(this.mApmConfigUrl)) {
            return this.mApmConfigUrl;
        }
        return C3823a.f11741a + "/monitor/appmonitor/v3/settings";
    }

    public String getAsanReportUploadUrl() {
        return C3823a.f11741a + "/monitor/collect/c/native_bin_crash";
    }

    public String getCoreDumpUrl() {
        return C3823a.f11741a + "/monitor/collect/c/core_dump_collect";
    }

    public String getEventUploadUrl() {
        return C3823a.f11741a + "/monitor/collect/";
    }

    public String getExceptionUploadUrl() {
        if (!TextUtils.isEmpty(this.mExceptionUploadUrl)) {
            return this.mExceptionUploadUrl;
        }
        return C3823a.f11741a + "/monitor/collect/c/exception";
    }

    public String getExceptionZipUploadUrl() {
        if (!TextUtils.isEmpty(this.mExceptionZipUploadUrl)) {
            return this.mExceptionZipUploadUrl;
        }
        return C3823a.f11741a + "/monitor/collect/c/custom_exception/zip";
    }

    public String getJavaCrashUploadUrl() {
        if (!TextUtils.isEmpty(this.mJavaCrashUploadUrl)) {
            return this.mJavaCrashUploadUrl;
        }
        return C3823a.f11741a + "/monitor/collect/c/crash";
    }

    public String getLaunchCrashUploadUrl() {
        if (!TextUtils.isEmpty(this.mLaunchCrashUploadUrl)) {
            return this.mLaunchCrashUploadUrl;
        }
        return C3823a.f11741a + "/monitor/collect/c/exception/dump_collection";
    }

    public String getNativeCrashUploadUrl() {
        if (!TextUtils.isEmpty(this.mNativeCrashUploadUrl)) {
            return this.mNativeCrashUploadUrl;
        }
        return C3823a.f11741a + "/monitor/collect/c/native_bin_crash";
    }

    public String getNativeMemUrl() {
        return C3823a.f11741a + "/monitor/collect/c/rapheal_file_collect";
    }

    public String getUploadCheckCoreDumpUrl() {
        return C3823a.f11741a + "";
    }

    public boolean isEnsureEnable() {
        if ((!C3840b.m15879b() || !C3840b.m15882c()) && !this.mEnsureEnable) {
            return false;
        }
        return true;
    }

    private String getUrlSuffix() {
        if (C3756h.m15534a() == null) {
            return "";
        }
        return "?aid=" + C3756h.m15534a().config().mAid + "&device_id=" + C3774m.m15603d().mo15504a();
    }

    public void setBlockMonitorEnable(boolean z) {
        this.mBlockMonitorEnable = z;
    }

    public void setBlockMonitorInterval(long j) {
        this.mBlockMonitorInterval = j;
    }

    public void setCurrentProcessName(String str) {
        C3933b.m16329a(str);
    }

    public void setDebugMode(boolean z) {
        this.mIsDebugMode = z;
    }

    public void setDefaultAnrCheckInterval(long j) {
        this.mAnrCheckInterval = j;
    }

    public void setEnsureEnable(boolean z) {
        this.mEnsureEnable = z;
    }

    public void setEnsureWithLogcat(boolean z) {
        this.mEnsureWithLogcat = z;
    }

    public void setReportErrorEnable(boolean z) {
        this.reportErrorEnable = z;
    }

    public void setThreadPoolExecutor(ThreadPoolExecutor threadPoolExecutor) {
        this.mThreadPoolExecutor = threadPoolExecutor;
    }

    public void setEncryptImpl(AbstractC3725d dVar) {
        if (dVar != null) {
            this.mEncryptImpl = dVar;
        }
    }

    public void setLogcatDumpCount(int i) {
        if (i > 0) {
            this.mLogcatDumpCount = i;
        }
    }

    public void setLogcatLevel(int i) {
        if (i >= 0 && i <= 4) {
            this.mLogcatLevel = i;
        }
    }

    public void setAlogUploadUrl(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.mAlogUploadUrl = str;
        }
    }

    public void setConfigGetUrl(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.mApmConfigUrl = str;
        }
    }

    public void setJavaCrashUploadUrl(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.mJavaCrashUploadUrl = str;
        }
    }

    public void setLaunchCrashInterval(long j) {
        if (j > 0) {
            this.mLaunchCrashInterval = j;
        }
    }

    public void setNativeCrashUrl(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.mNativeCrashUploadUrl = str;
        }
    }

    public boolean isCrashIgnored(final String str) {
        try {
            C38222 r1 = new C3843b() {
                /* class com.bytedance.crash.runtime.ConfigManager.C38222 */

                @Override // com.bytedance.crash.runtime.p228b.C3843b
                /* renamed from: a */
                public Object mo15396a(String str) {
                    if (str.equals("md5")) {
                        return str;
                    }
                    return super.mo15396a(str);
                }
            };
            if (C3845c.m15930a("java_crash_ignore", r1)) {
                return true;
            }
            if (!C3966w.m16528b(C3774m.m15609j())) {
                return false;
            }
            C3886a.m16117e();
            return C3845c.m15930a("java_crash_ignore", r1);
        } catch (Throwable unused) {
            return false;
        }
    }

    public void setLaunchCrashUrl(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.mExceptionUploadUrl = str;
            int indexOf = str.indexOf("//");
            if (indexOf == -1) {
                this.mLaunchCrashUploadUrl = str.substring(0, str.indexOf("/") + 1) + "monitor/collect/c/exception/dump_collection";
                this.mExceptionZipUploadUrl = str.substring(0, str.indexOf("/") + 1) + "monitor/collect/c/custom_exception/zip";
                return;
            }
            StringBuilder sb = new StringBuilder();
            int i = indexOf + 2;
            sb.append(str.substring(0, str.indexOf("/", i) + 1));
            sb.append("monitor/collect/c/exception/dump_collection");
            this.mLaunchCrashUploadUrl = sb.toString();
            this.mExceptionZipUploadUrl = str.substring(0, str.indexOf("/", i) + 1) + "monitor/collect/c/custom_exception/zip";
        }
    }
}
