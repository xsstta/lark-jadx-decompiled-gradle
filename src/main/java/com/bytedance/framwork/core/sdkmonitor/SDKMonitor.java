package com.bytedance.framwork.core.sdkmonitor;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.frameworks.core.p747a.C14094b;
import com.bytedance.framwork.core.p748a.C14114c;
import com.bytedance.framwork.core.sdklib.C14129b;
import com.bytedance.framwork.core.sdklib.C14140d;
import com.bytedance.framwork.core.sdklib.p750a.AbstractC14127b;
import com.bytedance.framwork.core.sdklib.p750a.C14128c;
import com.bytedance.framwork.core.sdklib.p752c.AbstractC14137c;
import com.bytedance.framwork.core.sdklib.p752c.C14138d;
import com.bytedance.framwork.core.sdklib.p752c.C14139e;
import com.bytedance.framwork.core.sdklib.p753d.AbstractC14144b;
import com.bytedance.framwork.core.sdklib.p753d.C14141a;
import com.bytedance.framwork.core.sdklib.util.C14154a;
import com.bytedance.framwork.core.sdklib.util.NetUtils;
import com.bytedance.framwork.core.sdkmonitor.MonitorNetUtil;
import com.bytedance.news.common.service.manager.C20216d;
import com.bytedance.services.apm.api.C20697b;
import com.bytedance.services.apm.api.IHttpService;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.framework.common.ContainerUtils;
import com.huawei.hms.location.LocationRequest;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;
import com.ss.ttm.player.MediaPlayer;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

public class SDKMonitor implements AbstractC14127b, AbstractC14137c, AbstractC14144b {
    private String mAid;
    private volatile JSONObject mAllowLogType;
    private volatile List<String> mAllowReportList;
    private volatile List<Pattern> mAllowReportPatterns;
    private volatile JSONObject mAllowService;
    private volatile List<String> mBlockReportList;
    private volatile List<Pattern> mBlockReportPatterns;
    public C14171b mCacheData;
    public Map<String, String> mCommonParams;
    public volatile boolean mConfigExit;
    public List<String> mConfigUrls = new LinkedList();
    private Context mContext;
    private volatile int mDisableReportApiError;
    private volatile long mFetchSettingInterval;
    private volatile boolean mHasInit;
    private JSONObject mHeaderInfo;
    private volatile IHttpService mHttpService;
    private IGetExtendParams mIGetExtendParams;
    public volatile boolean mIsEncrypt = true;
    private volatile long mLastFetchSettingTime;
    private volatile boolean mLogRemoveNet;
    private volatile boolean mLogRemoveSwitch;
    public C14129b mLogReportManager;
    private volatile int mLogSendSwitch = 1;
    public C14140d mMonitorManager;
    private volatile long mMonitorMaxRowCount;
    private boolean mOversea;
    private volatile int mReportCount;
    private volatile int mReportFailBaseTime;
    private volatile int mReportFailRepeatCount;
    private volatile int mReportInterval;
    private volatile int mReportSLA;
    private List<String> mReportUrlList = new LinkedList();
    private volatile long mStopMoreChannelInterval;

    public interface IGetCommonParams {
        String getSessionId();
    }

    public interface IGetExtendParams {
        Map<String, String> getCommonParams();

        String getSessionId();
    }

    /* renamed from: com.bytedance.framwork.core.sdkmonitor.SDKMonitor$a */
    public interface AbstractC14169a {
        /* renamed from: a */
        void mo52019a(boolean z);
    }

    /* access modifiers changed from: protected */
    public boolean isHasInit() {
        return this.mHasInit;
    }

    @Override // com.bytedance.framwork.core.sdklib.p750a.AbstractC14127b
    public JSONObject reportJsonHeaderInfo() {
        return this.mHeaderInfo;
    }

    /* access modifiers changed from: package-private */
    public boolean getLogSendSwitch() {
        if (this.mLogSendSwitch == 1) {
            return true;
        }
        return false;
    }

    public long getMonitorLogMaxSaveCount() {
        return getMonitorLogMaxSaveCount();
    }

    public boolean isLogSendSwitch() {
        if (this.mLogSendSwitch == 1) {
            return true;
        }
        return false;
    }

    public void restoreCollectDelay() {
        this.mLogReportManager.mo51913e();
    }

    private String getSessionId() {
        IGetExtendParams iGetExtendParams = this.mIGetExtendParams;
        if (iGetExtendParams != null) {
            return iGetExtendParams.getSessionId();
        }
        return null;
    }

    private void initLogLib() {
        C14114c.m57113a(new C14114c.AbstractC14116b() {
            /* class com.bytedance.framwork.core.sdkmonitor.SDKMonitor.AnonymousClass11 */

            @Override // com.bytedance.framwork.core.p748a.C14114c.AbstractC14116b
            /* renamed from: a */
            public boolean mo51875a(Context context) {
                return MonitorNetUtil.m57253b(context);
            }
        });
    }

    public void deleteAllLogs() {
        try {
            this.mMonitorManager.mo51939b();
            this.mLogReportManager.mo51910b();
        } catch (Throwable unused) {
        }
    }

    public void dropAllData() {
        this.mLogReportManager.mo51914f();
        this.mLogRemoveNet = true;
    }

    public void flushBuffer() {
        C14141a.m57218a().mo51941a(new Runnable() {
            /* class com.bytedance.framwork.core.sdkmonitor.SDKMonitor.RunnableC141612 */

            public void run() {
                if (SDKMonitor.this.mMonitorManager != null) {
                    SDKMonitor.this.mMonitorManager.mo51938a(0, true);
                }
            }
        });
    }

    public void flushReport() {
        C14141a.m57218a().mo51941a(new Runnable() {
            /* class com.bytedance.framwork.core.sdkmonitor.SDKMonitor.RunnableC141634 */

            public void run() {
                if (SDKMonitor.this.mMonitorManager != null && SDKMonitor.this.mLogReportManager != null) {
                    SDKMonitor.this.mLogReportManager.mo51909a(true);
                }
            }
        });
    }

    public int getNetWorkType() {
        return NetUtils.m57238a(this.mContext).getValue();
    }

    @Override // com.bytedance.framwork.core.sdklib.p750a.AbstractC14127b
    public boolean getRemoveSwitch() {
        if (this.mLogRemoveNet) {
            return this.mLogRemoveNet;
        }
        return this.mLogRemoveSwitch;
    }

    @Override // com.bytedance.framwork.core.sdklib.p750a.AbstractC14127b
    public int reportCount() {
        if (this.mReportCount <= 0) {
            return 100;
        }
        return this.mReportCount;
    }

    @Override // com.bytedance.framwork.core.sdklib.p750a.AbstractC14127b
    public int reportFailRepeatBaseTime() {
        if (this.mReportFailBaseTime <= 0) {
            return 15;
        }
        return this.mReportFailBaseTime;
    }

    @Override // com.bytedance.framwork.core.sdklib.p750a.AbstractC14127b
    public int reportFailRepeatCount() {
        if (this.mReportFailRepeatCount <= 0) {
            return 4;
        }
        return this.mReportFailRepeatCount;
    }

    @Override // com.bytedance.framwork.core.sdklib.p750a.AbstractC14127b
    public int reportInterval() {
        if (this.mReportInterval <= 0) {
            return SmEvents.EVENT_NW;
        }
        return this.mReportInterval;
    }

    private boolean needUpdateConfigFromNet() {
        if ((System.currentTimeMillis() - this.mLastFetchSettingTime) / 1000 > this.mFetchSettingInterval) {
            return true;
        }
        return false;
    }

    public IHttpService getHttpService() {
        if (this.mHttpService == null) {
            this.mHttpService = (IHttpService) C20216d.m73783a(IHttpService.class);
        }
        return this.mHttpService;
    }

    public long stopMoreChannelInterval() {
        if (this.mStopMoreChannelInterval == 0) {
            return 1800000;
        }
        return this.mStopMoreChannelInterval * 1000;
    }

    private SharedPreferences getSp() {
        String a = C14178h.m57269a(this.mContext);
        Context context = this.mContext;
        return context.getSharedPreferences("monitor_config" + this.mAid + a, 0);
    }

    private void initConfig() {
        boolean z;
        SharedPreferences sp = getSp();
        String string = sp.getString("monitor_net_config", null);
        this.mLastFetchSettingTime = sp.getLong("monitor_configure_refresh_time", 0);
        if (sp.getInt("monitor_config_update", 0) == 1) {
            z = true;
        } else {
            z = false;
        }
        C14141a.m57218a().mo51940a(this);
        if (!TextUtils.isEmpty(string)) {
            try {
                this.mConfigExit = true;
                JSONObject jSONObject = new JSONObject(string);
                if (!z) {
                    jSONObject.remove("report_host_new");
                }
                updateConfig(jSONObject);
            } catch (Exception unused) {
                Log.e("monitor_config", "配置信息读取失败");
            }
        }
        updateConfigFromNet(false);
    }

    @Override // com.bytedance.framwork.core.sdklib.p750a.AbstractC14127b
    public List<String> reportUrl(String str) {
        return this.mReportUrlList;
    }

    public void setCollectDelay(long j) {
        this.mLogReportManager.mo51908a(j);
    }

    public void setStopCollect(boolean z) {
        this.mMonitorManager.mo51937a(z);
    }

    private boolean isMatchAllowURI(String str) {
        return isMatch(str, this.mAllowReportList, this.mAllowReportPatterns);
    }

    private boolean isMatchBlackURI(String str) {
        return isMatch(str, this.mBlockReportList, this.mBlockReportPatterns);
    }

    @Override // com.bytedance.framwork.core.sdklib.p753d.AbstractC14144b
    public void onTimeEvent(long j) {
        if (this.mFetchSettingInterval > 0) {
            updateConfigFromNet(false);
        }
    }

    public void flushBuffer(final AbstractC14169a aVar) {
        C14141a.m57218a().mo51941a(new Runnable() {
            /* class com.bytedance.framwork.core.sdkmonitor.SDKMonitor.RunnableC141623 */

            public void run() {
                boolean z = false;
                try {
                    if (SDKMonitor.this.mMonitorManager != null) {
                        z = SDKMonitor.this.mMonitorManager.mo51938a(0, true);
                    }
                } finally {
                    aVar.mo52019a(z);
                }
            }
        });
    }

    public void flushReport(final AbstractC14169a aVar) {
        C14141a.m57218a().mo51941a(new Runnable() {
            /* class com.bytedance.framwork.core.sdkmonitor.SDKMonitor.RunnableC141645 */

            public void run() {
                boolean z = false;
                try {
                    if (!(SDKMonitor.this.mMonitorManager == null || SDKMonitor.this.mLogReportManager == null)) {
                        z = SDKMonitor.this.mLogReportManager.mo51909a(true);
                    }
                } finally {
                    aVar.mo52019a(z);
                }
            }
        });
    }

    public boolean getLogTypeSwitch(String str) {
        if (this.mAllowLogType == null || TextUtils.isEmpty(str) || this.mAllowLogType.opt(str) == null) {
            return false;
        }
        return true;
    }

    public boolean getServiceSwitch(String str) {
        if (this.mAllowService == null || TextUtils.isEmpty(str) || this.mAllowService.opt(str) == null) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public void resetConfigUrls(List<String> list) {
        if (list != null && !C14176f.m57267a(list)) {
            this.mConfigUrls.clear();
            this.mConfigUrls.addAll(list);
        }
    }

    /* access modifiers changed from: package-private */
    public void resetReportUrls(List<String> list) {
        if (list != null && !C14176f.m57267a(list)) {
            this.mReportUrlList.clear();
            this.mReportUrlList.addAll(list);
        }
    }

    protected SDKMonitor(String str) {
        this.mAid = str;
        this.mConfigExit = false;
        this.mCacheData = new C14171b();
    }

    /* access modifiers changed from: package-private */
    public void updateConfigFromNet(boolean z) {
        if (this.mFetchSettingInterval < 600) {
            this.mFetchSettingInterval = 600;
        }
        if ((z || needUpdateConfigFromNet()) && MonitorNetUtil.m57253b(this.mContext)) {
            synchronized (SDKMonitor.class) {
                this.mLastFetchSettingTime = System.currentTimeMillis();
            }
            try {
                C14141a.m57218a().mo51941a(new Runnable() {
                    /* class com.bytedance.framwork.core.sdkmonitor.SDKMonitor.AnonymousClass10 */

                    public void run() {
                        byte[] bArr;
                        try {
                            if (SDKMonitor.this.mCommonParams != null) {
                                for (String str : SDKMonitor.this.mConfigUrls) {
                                    StringBuilder addParamsToURL = SDKMonitor.this.addParamsToURL(str);
                                    addParamsToURL.append("&encrypt=close");
                                    String sb = addParamsToURL.toString();
                                    try {
                                        if (SDKMonitor.this.getHttpService() != null) {
                                            bArr = SDKMonitor.this.getHttpService().doGet(sb, null).mo69901b();
                                        } else {
                                            bArr = MonitorNetUtil.m57251a(sb, null, SDKMonitor.this.mIsEncrypt);
                                        }
                                        if (bArr != null) {
                                            SDKMonitor.this.updateToSP(new JSONObject(new String(bArr)));
                                            return;
                                        }
                                        return;
                                    } catch (Throwable th) {
                                        th.printStackTrace();
                                    }
                                }
                            }
                        } catch (Throwable th2) {
                            if (!SDKMonitor.this.mConfigExit) {
                                SDKMonitor.this.mConfigExit = true;
                                SDKMonitor.this.mCacheData.mo52020a(SDKMonitor.this);
                            }
                            th2.printStackTrace();
                        }
                    }
                });
            } catch (Throwable unused) {
            }
        }
    }

    public StringBuilder addParamsToURL(String str) {
        StringBuilder sb = new StringBuilder(str);
        if (!TextUtils.isDigitsOnly(str) && this.mCommonParams != null) {
            if (!str.contains("?")) {
                sb.append("?");
            }
            appendUrlParam(sb, "sdk_version", String.valueOf((int) MediaPlayer.MEDIA_PLAYER_OPTION_USE_CODEC_POOL));
            Map<String, String> map = this.mCommonParams;
            if (map != null && map.size() > 0) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    if (entry.getKey() != null) {
                        appendUrlParam(sb, String.valueOf(entry.getKey()), String.valueOf(entry.getValue()));
                    }
                }
            }
        }
        return sb;
    }

    public void updateToSP(JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.length() > 0) {
            try {
                updateConfig(jSONObject.getJSONObject("ret"));
                SharedPreferences.Editor edit = getSp().edit();
                edit.putLong("monitor_configure_refresh_time", System.currentTimeMillis());
                edit.putInt("monitor_config_update", 1);
                edit.putString("monitor_net_config", jSONObject.getJSONObject("ret").toString());
                edit.apply();
                if (!this.mConfigExit) {
                    this.mConfigExit = true;
                    this.mCacheData.mo52020a(this);
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x006e, code lost:
        r2.clear();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void updateConfig(org.json.JSONObject r9) {
        /*
        // Method dump skipped, instructions count: 369
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.framwork.core.sdkmonitor.SDKMonitor.updateConfig(org.json.JSONObject):void");
    }

    private static String encode(String str, String str2) {
        if (str2 == null) {
            str2 = "UTF-8";
        }
        try {
            return URLEncoder.encode(str, str2);
        } catch (UnsupportedEncodingException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public void monitorCommonLog(String str, JSONObject jSONObject) {
        try {
            if (!this.mConfigExit) {
                this.mCacheData.mo52025a(new C14173c(str, jSONObject, System.currentTimeMillis()));
            } else {
                monitorCommonLogAsync(str, jSONObject, System.currentTimeMillis());
            }
        } catch (Throwable unused) {
        }
    }

    private void combineJson(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject != null && jSONObject2 != null && jSONObject2.length() > 0) {
            try {
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    jSONObject.put(next, jSONObject2.get(next));
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    @Override // com.bytedance.framwork.core.sdklib.p752c.AbstractC14137c
    public C14139e sendLog(String str, byte[] bArr) {
        byte[] bArr2;
        Map<String, String> map;
        C14139e eVar = new C14139e();
        try {
            String sb = addParamsToURL(str).toString();
            new HashMap();
            if (getHttpService() != null) {
                HashMap hashMap = new HashMap();
                byte[] a = MonitorNetUtil.m57252a(bArr, hashMap);
                if (this.mIsEncrypt) {
                    byte[] a2 = C14094b.m57065a(a, a.length);
                    if (a2 != null) {
                        sb = sb + "&tt_data=a";
                        hashMap.put("Content-Type", "application/octet-stream;tt-data=a");
                    }
                    C20697b doPost = getHttpService().doPost(sb, a2, hashMap);
                    bArr2 = doPost.mo69901b();
                    map = doPost.mo69902c();
                } else {
                    C20697b doPost2 = getHttpService().doPost(sb, a, hashMap);
                    bArr2 = doPost2.mo69901b();
                    map = doPost2.mo69902c();
                }
            } else {
                C20697b a3 = MonitorNetUtil.m57248a(sb, bArr, MonitorNetUtil.CompressType.GZIP, "application/json; charset=utf-8", this.mIsEncrypt);
                bArr2 = a3.mo69901b();
                map = a3.mo69902c();
            }
            String str2 = null;
            if (map != null && !map.isEmpty()) {
                str2 = map.get("ran");
            }
            eVar.f37168a = LocationRequest.PRIORITY_HD_ACCURACY;
            JSONObject jSONObject = new JSONObject(new String(bArr2));
            try {
                String optString = jSONObject.optString(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
                if (!optString.isEmpty()) {
                    String a4 = C14154a.m57239a(optString.getBytes(), str2);
                    if (!TextUtils.isEmpty(a4)) {
                        jSONObject = new JSONObject(a4);
                    } else {
                        jSONObject.put("message", "success");
                    }
                }
                eVar.f37169b = jSONObject;
            } catch (Throwable th) {
                th.printStackTrace();
            }
            eVar.f37169b = jSONObject;
            return eVar;
        } catch (Throwable th2) {
            if (th2 instanceof HttpResponseException) {
                eVar.f37168a = th2.getStatusCode();
            } else {
                eVar.f37168a = -1;
            }
            return eVar;
        }
    }

    public void monitorDuration(String str, JSONObject jSONObject, JSONObject jSONObject2) {
        monitorStatusAndDuration(str, 0, jSONObject, jSONObject2);
    }

    public void monitorStatusRate(String str, int i, JSONObject jSONObject) {
        monitorStatusAndDuration(str, i, null, jSONObject);
    }

    public boolean init(Context context, JSONObject jSONObject, final IGetCommonParams iGetCommonParams) {
        if (iGetCommonParams == null) {
            return init(context, jSONObject, new IGetExtendParams() {
                /* class com.bytedance.framwork.core.sdkmonitor.SDKMonitor.C141601 */

                @Override // com.bytedance.framwork.core.sdkmonitor.SDKMonitor.IGetExtendParams
                public Map<String, String> getCommonParams() {
                    return null;
                }

                @Override // com.bytedance.framwork.core.sdkmonitor.SDKMonitor.IGetExtendParams
                public String getSessionId() {
                    return null;
                }
            });
        }
        return init(context, jSONObject, new IGetExtendParams() {
            /* class com.bytedance.framwork.core.sdkmonitor.SDKMonitor.C141667 */

            @Override // com.bytedance.framwork.core.sdkmonitor.SDKMonitor.IGetExtendParams
            public Map<String, String> getCommonParams() {
                return null;
            }

            @Override // com.bytedance.framwork.core.sdkmonitor.SDKMonitor.IGetExtendParams
            public String getSessionId() {
                return iGetCommonParams.getSessionId();
            }
        });
    }

    /* access modifiers changed from: package-private */
    public void monitorCommonLogAsync(final String str, final JSONObject jSONObject, final long j) {
        C14141a.m57218a().mo51941a(new Runnable() {
            /* class com.bytedance.framwork.core.sdkmonitor.SDKMonitor.RunnableC141656 */

            public void run() {
                SDKMonitor.this.monitorCommonLogInternal(str, jSONObject, j);
            }
        });
    }

    private StringBuilder appendUrlParam(StringBuilder sb, String str, String str2) {
        if (sb.charAt(sb.length() - 1) != '?') {
            sb.append(ContainerUtils.FIELD_DELIMITER);
        }
        sb.append(encode(str, "UTF-8"));
        sb.append('=');
        sb.append(encode(str2, "UTF-8"));
        return sb;
    }

    public boolean init(final Context context, final JSONObject jSONObject, final IGetExtendParams iGetExtendParams) {
        this.mHasInit = true;
        C14141a.m57218a().mo51942a(new Runnable() {
            /* class com.bytedance.framwork.core.sdkmonitor.SDKMonitor.RunnableC141678 */

            public void run() {
                SDKMonitor.this.initMonitor(context, jSONObject, iGetExtendParams);
                if (SDKMonitor.this.mConfigExit) {
                    SDKMonitor.this.mCacheData.mo52020a(SDKMonitor.this);
                }
            }
        }, 5000);
        return true;
    }

    /* access modifiers changed from: package-private */
    public void monitorCommonLogInternal(String str, JSONObject jSONObject, long j) {
        try {
            jSONObject.put("log_type", str);
            jSONObject.put("network_type", getNetWorkType());
            if (!TextUtils.isEmpty(getSessionId())) {
                jSONObject.put("session_id", getSessionId());
            }
            if (jSONObject.isNull("timestamp")) {
                jSONObject.put("timestamp", j);
            }
            if (this.mMonitorManager != null && getLogTypeSwitch(str)) {
                this.mMonitorManager.mo51936a("common_log", "common_log", jSONObject);
            }
        } catch (Throwable unused) {
        }
    }

    private boolean isMatch(String str, List<String> list, List<Pattern> list2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (!C14176f.m57267a(list)) {
            for (String str2 : list) {
                if (str.contains(str2)) {
                    return true;
                }
            }
        }
        try {
            String path = new URI(str).getPath();
            if (!C14176f.m57267a(list2)) {
                for (Pattern pattern : list2) {
                    if (pattern.matcher(path).matches()) {
                        return true;
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    public void initMonitor(Context context, JSONObject jSONObject, IGetExtendParams iGetExtendParams) {
        if (context != null && jSONObject != null) {
            this.mHasInit = true;
            this.mContext = context.getApplicationContext();
            this.mHeaderInfo = jSONObject;
            try {
                jSONObject.put("aid", this.mAid);
                this.mHeaderInfo.put("os", "Android");
                this.mHeaderInfo.put("device_platform", "android");
                this.mHeaderInfo.put("os_version", Build.VERSION.RELEASE);
                this.mHeaderInfo.put("os_api", Build.VERSION.SDK_INT);
                this.mHeaderInfo.put("device_model", Build.MODEL);
                this.mHeaderInfo.put("device_brand", Build.BRAND);
                this.mHeaderInfo.put("device_manufacturer", Build.MANUFACTURER);
                this.mHeaderInfo.put("sdkmonitor_version", "2.0.35-rc.0");
                this.mHeaderInfo.put("monitor_from", "sdk");
                if (TextUtils.isEmpty(this.mHeaderInfo.optString("package_name"))) {
                    this.mHeaderInfo.put("package_name", context.getPackageName());
                }
                PackageInfo packageInfo = null;
                if (TextUtils.isEmpty(this.mHeaderInfo.optString("version_name"))) {
                    packageInfo = this.mContext.getPackageManager().getPackageInfo(this.mContext.getPackageName(), 0);
                    this.mHeaderInfo.put("version_name", packageInfo.versionName);
                }
                if (TextUtils.isEmpty(this.mHeaderInfo.optString("version_code"))) {
                    if (packageInfo == null) {
                        packageInfo = this.mContext.getPackageManager().getPackageInfo(this.mContext.getPackageName(), 0);
                    }
                    this.mHeaderInfo.put("version_code", packageInfo.versionCode);
                }
                this.mIGetExtendParams = iGetExtendParams;
                if (iGetExtendParams == null) {
                    this.mIGetExtendParams = new IGetExtendParams() {
                        /* class com.bytedance.framwork.core.sdkmonitor.SDKMonitor.C141689 */

                        @Override // com.bytedance.framwork.core.sdkmonitor.SDKMonitor.IGetExtendParams
                        public Map<String, String> getCommonParams() {
                            return null;
                        }

                        @Override // com.bytedance.framwork.core.sdkmonitor.SDKMonitor.IGetExtendParams
                        public String getSessionId() {
                            return null;
                        }
                    };
                }
                Map<String, String> commonParams = this.mIGetExtendParams.getCommonParams();
                this.mCommonParams = commonParams;
                if (commonParams == null) {
                    this.mCommonParams = new HashMap();
                }
                this.mOversea = TextUtils.equals(this.mCommonParams.get("oversea"), "1");
                this.mCommonParams.put("aid", this.mAid);
                this.mCommonParams.put("device_id", this.mHeaderInfo.optString("device_id"));
                this.mCommonParams.put("device_platform", "android");
                this.mCommonParams.put("package_name", this.mHeaderInfo.optString("package_name"));
                this.mCommonParams.put("channel", this.mHeaderInfo.optString("channel"));
                this.mCommonParams.put("app_version", this.mHeaderInfo.optString("app_version"));
                this.mCommonParams.put("sdkmonitor_version", "2.0.35-rc.0");
                this.mCommonParams.put("minor_version", "1");
                C14128c.m57152a(this.mAid, this);
                C14138d.m57209a(this.mAid, this);
                initLogLib();
                C14140d dVar = new C14140d(this.mContext, this.mAid);
                this.mMonitorManager = dVar;
                dVar.mo51934a();
                this.mHttpService = (IHttpService) C20216d.m73783a(IHttpService.class);
                initConfig();
            } catch (Exception unused) {
            }
        }
    }

    public void monitorEvent(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        try {
            if (!this.mConfigExit) {
                this.mCacheData.mo52026a(new C14179i(str, 0, null, jSONObject, jSONObject2, jSONObject3, System.currentTimeMillis()));
            } else {
                monitorServiceAsync(str, 0, null, jSONObject, jSONObject2, jSONObject3, System.currentTimeMillis());
            }
        } catch (Throwable unused) {
        }
    }

    public void monitorStatusAndDuration(String str, int i, JSONObject jSONObject, JSONObject jSONObject2) {
        try {
            if (!this.mConfigExit) {
                this.mCacheData.mo52026a(new C14179i(str, i, jSONObject, null, null, jSONObject2, System.currentTimeMillis()));
            } else {
                monitorServiceAsync(str, i, jSONObject, null, null, jSONObject2, System.currentTimeMillis());
            }
        } catch (Throwable unused) {
        }
    }

    public void monitorStatusAndEvent(String str, int i, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        try {
            if (!this.mConfigExit) {
                this.mCacheData.mo52026a(new C14179i(str, i, null, jSONObject, jSONObject2, jSONObject3, System.currentTimeMillis()));
            } else {
                monitorServiceAsync(str, i, null, jSONObject, jSONObject2, jSONObject3, System.currentTimeMillis());
            }
        } catch (Throwable unused) {
        }
    }

    /* access modifiers changed from: package-private */
    public void monitorServiceAsync(final String str, final int i, final JSONObject jSONObject, final JSONObject jSONObject2, final JSONObject jSONObject3, final JSONObject jSONObject4, final long j) {
        C14141a.m57218a().mo51941a(new Runnable() {
            /* class com.bytedance.framwork.core.sdkmonitor.SDKMonitor.AnonymousClass14 */

            public void run() {
                SDKMonitor.this.monitorService(str, i, jSONObject, jSONObject2, jSONObject3, jSONObject4, j);
            }
        });
    }

    /* access modifiers changed from: package-private */
    public void handleApiError(long j, long j2, String str, String str2, String str3, int i, JSONObject jSONObject) {
        C14140d dVar;
        if (this.mDisableReportApiError != 1 && !isMatchBlackURI(str)) {
            JSONObject packLog = packLog("api_error", j, j2, str, str2, str3, i);
            combineJson(packLog, jSONObject);
            if (packLog != null && packLog.length() > 0 && (dVar = this.mMonitorManager) != null) {
                dVar.mo51936a("api_error", "api_error", packLog);
            }
        }
    }

    public void monitorApiError(final long j, final long j2, final String str, final String str2, final String str3, final int i, final JSONObject jSONObject) {
        try {
            if (!this.mConfigExit) {
                this.mCacheData.mo52024a(new C14170a("api_all", j, j2, str, str2, str3, i, jSONObject));
            } else {
                C14141a.m57218a().mo51941a(new Runnable() {
                    /* class com.bytedance.framwork.core.sdkmonitor.SDKMonitor.AnonymousClass13 */

                    public void run() {
                        SDKMonitor.this.handleApiError(j, j2, str, str2, str3, i, jSONObject);
                    }
                });
            }
        } catch (Throwable unused) {
        }
    }

    public void monitorSLA(final long j, final long j2, final String str, final String str2, final String str3, final int i, final JSONObject jSONObject) {
        try {
            if (!this.mConfigExit) {
                this.mCacheData.mo52024a(new C14170a("api_all", j, j2, str, str2, str3, i, jSONObject));
            } else {
                C14141a.m57218a().mo51941a(new Runnable() {
                    /* class com.bytedance.framwork.core.sdkmonitor.SDKMonitor.AnonymousClass12 */

                    public void run() {
                        SDKMonitor.this.handleNetSLA(j, j2, str, str2, str3, i, jSONObject);
                    }
                });
            }
        } catch (Throwable unused) {
        }
    }

    private JSONObject packLog(String str, long j, long j2, String str2, String str3, String str4, int i) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("log_type", str);
            jSONObject.put("duration", j);
            if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("uri", Uri.parse(str2));
            }
            if (j2 > 0) {
                jSONObject.put("timestamp", j2);
            }
            jSONObject.put(UpdateKey.STATUS, i);
            if (!TextUtils.isEmpty(str3)) {
                jSONObject.put("ip", str3);
            }
            if (!TextUtils.isEmpty(str4)) {
                jSONObject.put("trace_code", str4);
            } else {
                jSONObject.put("trace_code", "");
            }
            jSONObject.put("network_type", MonitorNetUtil.m57247a(this.mContext).getValue());
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public void handleNetSLA(long j, long j2, String str, String str2, String str3, int i, JSONObject jSONObject) {
        if (!isMatchBlackURI(str) && MonitorNetUtil.m57253b(this.mContext)) {
            JSONObject packLog = packLog("api_all", j, j2, str, str2, str3, i);
            combineJson(packLog, jSONObject);
            if ((packLog != null && isMatchAllowURI(str)) || this.mReportSLA != 0) {
                try {
                    packLog.put("hit_rules", 1);
                    this.mMonitorManager.mo51936a("api_all", "api_all", packLog);
                } catch (JSONException unused) {
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void monitorService(String str, int i, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, long j) {
        if (jSONObject4 == null) {
            try {
                jSONObject4 = new JSONObject();
            } catch (Throwable unused) {
                return;
            }
        }
        jSONObject4.put("log_type", "service_monitor");
        jSONObject4.put("service", str);
        jSONObject4.put(UpdateKey.STATUS, i);
        jSONObject4.put("network_type", getNetWorkType());
        jSONObject4.put("value", jSONObject);
        if (jSONObject2 != null) {
            jSONObject4.put("category", jSONObject2);
        }
        if (jSONObject3 != null) {
            jSONObject4.put("metric", jSONObject3);
        }
        if (jSONObject4.isNull("timestamp")) {
            jSONObject4.put("timestamp", j);
        }
        if (!TextUtils.isEmpty(getSessionId())) {
            jSONObject4.put("session_id", getSessionId());
        }
        if (this.mMonitorManager != null && getServiceSwitch(str)) {
            this.mMonitorManager.mo51936a("service_monitor", "service_monitor", jSONObject4);
        }
    }
}
