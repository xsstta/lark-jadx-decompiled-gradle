package com.huawei.hms.support.hianalytics;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hianalytics.process.HiAnalyticsManager;
import com.huawei.hianalytics.util.HiAnalyticTools;
import com.huawei.hms.hatool.HmsHiAnalyticsUtils;
import com.huawei.hms.stats.C23781a;
import com.huawei.hms.stats.C23782b;
import com.huawei.hms.stats.C23783c;
import com.huawei.hms.support.log.HMSLog;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class HiAnalyticsUtils {
    public static final Object LOCK_INST = new Object();
    public static final Object LOCK_REPORT = new Object();
    public static final String TAG = "HiAnalyticsUtils";
    public static HiAnalyticsUtils sInstance;
    public int count = 0;
    public boolean isHianalyticsExist = C23783c.m86959a();

    public boolean getInitFlag() {
        if (!this.isHianalyticsExist) {
            return HmsHiAnalyticsUtils.getInitFlag();
        }
        return HiAnalyticsManager.getInitFlag(HiAnalyticsConstant.HA_SERVICE_TAG);
    }

    public static HiAnalyticsUtils getInstance() {
        HiAnalyticsUtils hiAnalyticsUtils;
        synchronized (LOCK_INST) {
            if (sInstance == null) {
                sInstance = new HiAnalyticsUtils();
            }
            hiAnalyticsUtils = sInstance;
        }
        return hiAnalyticsUtils;
    }

    public void enableLog() {
        HMSLog.m86966i(TAG, "Enable Log");
        if (!this.isHianalyticsExist) {
            HmsHiAnalyticsUtils.enableLog();
        } else {
            HMSLog.m86966i(TAG, "cp needs to pass in the context, this method is not supported");
        }
    }

    public boolean hasError(Context context) {
        return C23781a.m86954c(context);
    }

    public static LinkedHashMap<String, String> convertToLinkedHashMap(Map<String, String> map) {
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        for (String str : map.keySet()) {
            linkedHashMap.put(str, map.get(str));
        }
        return linkedHashMap;
    }

    private void reportOnNeed(Context context) {
        synchronized (LOCK_REPORT) {
            int i = this.count;
            if (i < 60) {
                this.count = i + 1;
            } else {
                this.count = 0;
                if (!this.isHianalyticsExist) {
                    HmsHiAnalyticsUtils.onReport();
                } else {
                    C23782b.m86956a(context, 0);
                    C23782b.m86956a(context, 1);
                }
            }
        }
    }

    public void enableLog(Context context) {
        HMSLog.m86966i(TAG, "Enable Log");
        if (!this.isHianalyticsExist) {
            HmsHiAnalyticsUtils.enableLog();
        } else {
            HiAnalyticTools.enableLog(context);
        }
    }

    private String getReportJson(Map<String, String> map) {
        if (map == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
        } catch (JSONException e) {
            HMSLog.m86964e(TAG, "AnalyticsHelper create json exception" + e.getMessage());
        }
        return jSONObject.toString();
    }

    public static String versionCodeToName(String str) {
        if (!TextUtils.isEmpty(str) && (str.length() == 8 || str.length() == 9)) {
            try {
                Integer.parseInt(str);
                return Integer.parseInt(str.substring(0, str.length() - 7)) + "." + Integer.parseInt(str.substring(str.length() - 7, str.length() - 5)) + "." + Integer.parseInt(str.substring(str.length() - 5, str.length() - 3)) + "." + Integer.parseInt(str.substring(str.length() - 3));
            } catch (NumberFormatException unused) {
            }
        }
        return "";
    }

    public void onBuoyEvent(Context context, String str, String str2) {
        if (!hasError(context) && context != null) {
            onEvent2(context, str, str2);
        }
    }

    public void onEvent2(Context context, String str, String str2) {
        if (hasError(context) || context == null || !getInitFlag()) {
            return;
        }
        if (!this.isHianalyticsExist) {
            HmsHiAnalyticsUtils.onEvent(context, str, str2);
        } else {
            C23782b.m86958a(context, str, str2);
        }
    }

    public void onEvent(Context context, String str, Map<String, String> map) {
        if (!hasError(context)) {
            String reportJson = getReportJson(map);
            if (!TextUtils.isEmpty(reportJson) && context != null && getInitFlag()) {
                if (!this.isHianalyticsExist) {
                    HmsHiAnalyticsUtils.onEvent(context, str, reportJson);
                    HmsHiAnalyticsUtils.onEvent(1, str, convertToLinkedHashMap(map));
                } else {
                    C23782b.m86958a(context, str, reportJson);
                    C23782b.m86957a(context, 1, str, convertToLinkedHashMap(map));
                }
                reportOnNeed(context);
            }
        }
    }

    public void onNewEvent(Context context, String str, Map map) {
        if (!hasError(context)) {
            String reportJson = getReportJson(map);
            if (!TextUtils.isEmpty(reportJson) && context != null && getInitFlag()) {
                if (!this.isHianalyticsExist) {
                    HmsHiAnalyticsUtils.onEvent(context, str, reportJson);
                    HmsHiAnalyticsUtils.onEvent(1, str, convertToLinkedHashMap(map));
                } else {
                    C23782b.m86958a(context, str, reportJson);
                    C23782b.m86957a(context, 1, str, convertToLinkedHashMap(map));
                }
                reportOnNeed(context);
            }
        }
    }

    public void onReport(Context context, String str, Map map) {
        if (!hasError(context)) {
            String reportJson = getReportJson(map);
            if (!TextUtils.isEmpty(reportJson) && context != null && getInitFlag()) {
                HMSLog.m86966i(TAG, "Report the data");
                if (!this.isHianalyticsExist) {
                    HmsHiAnalyticsUtils.onEvent(context, str, reportJson);
                    HmsHiAnalyticsUtils.onEvent(1, str, convertToLinkedHashMap(map));
                    HmsHiAnalyticsUtils.onReport();
                    return;
                }
                C23782b.m86958a(context, str, reportJson);
                C23782b.m86957a(context, 1, str, convertToLinkedHashMap(map));
                C23782b.m86956a(context, 0);
                C23782b.m86956a(context, 1);
            }
        }
    }
}
