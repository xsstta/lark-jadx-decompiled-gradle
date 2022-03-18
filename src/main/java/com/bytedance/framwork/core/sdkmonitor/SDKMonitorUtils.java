package com.bytedance.framwork.core.sdkmonitor;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.framwork.core.sdkmonitor.SDKMonitor;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

public class SDKMonitorUtils {
    private static ConcurrentHashMap<String, List<String>> sAidToConfigUrl = new ConcurrentHashMap<>();
    private static ConcurrentHashMap<String, List<String>> sAidToDefaultReportUrl = new ConcurrentHashMap<>();
    private static ConcurrentHashMap<String, SDKMonitor> sAidToMonitorCommon = new ConcurrentHashMap<>();

    public static String getSdkVersion() {
        return "2.0.35-rc.0";
    }

    public static SDKMonitor getInstance(String str) {
        if (!TextUtils.isEmpty(str)) {
            if (sAidToMonitorCommon.get(str) == null) {
                synchronized (SDKMonitorUtils.class) {
                    if (sAidToMonitorCommon.get(str) == null) {
                        sAidToMonitorCommon.put(str, new SDKMonitor(str));
                    }
                }
            }
            return sAidToMonitorCommon.get(str);
        }
        throw new IllegalArgumentException("param 'aid' is not allowed to assigned empty string");
    }

    public static List<String> convertReportUrl(List<String> list) {
        LinkedList linkedList = new LinkedList();
        for (String str : list) {
            try {
                URL url = new URL(str);
                linkedList.add(("https://" + url.getHost()) + "/monitor/collect/");
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
        return linkedList;
    }

    public static synchronized void setDeafultReportUrl(String str, List<String> list) {
        synchronized (SDKMonitorUtils.class) {
            if (!TextUtils.isEmpty(str)) {
                if (!C14176f.m57267a(list)) {
                    sAidToDefaultReportUrl.put(str, convertReportUrl(list));
                }
            }
        }
    }

    public static synchronized void setDefaultReportUrl(String str, List<String> list) {
        synchronized (SDKMonitorUtils.class) {
            if (!TextUtils.isEmpty(str)) {
                if (!C14176f.m57267a(list)) {
                    sAidToDefaultReportUrl.put(str, convertReportUrl(list));
                }
            }
        }
    }

    public static synchronized void setConfigUrl(String str, List<String> list) {
        synchronized (SDKMonitorUtils.class) {
            if (!TextUtils.isEmpty(str)) {
                if (!C14176f.m57267a(list)) {
                    LinkedList linkedList = new LinkedList();
                    for (String str2 : list) {
                        try {
                            URL url = new URL(str2);
                            linkedList.add(("https://" + url.getHost()) + "/monitor/appmonitor/v3/settings");
                        } catch (MalformedURLException e) {
                            e.printStackTrace();
                        }
                    }
                    sAidToConfigUrl.put(str, linkedList);
                }
            }
        }
    }

    public static synchronized void init(Context context, String str, JSONObject jSONObject, SDKMonitor.IGetCommonParams iGetCommonParams) {
        synchronized (SDKMonitorUtils.class) {
            if (context != null) {
                if (TextUtils.isEmpty(str)) {
                    throw new IllegalArgumentException("param 'aid' is not allowed to assigned empty string");
                } else if (jSONObject == null) {
                    throw new IllegalArgumentException("param 'headerInfo' is not allowed to be null");
                } else if (sAidToMonitorCommon.get(str) == null || !sAidToMonitorCommon.get(str).isHasInit()) {
                    SDKMonitor sDKMonitor = sAidToMonitorCommon.get(str);
                    if (sDKMonitor == null) {
                        sDKMonitor = new SDKMonitor(str);
                        sAidToMonitorCommon.put(str, sDKMonitor);
                    }
                    sDKMonitor.resetConfigUrls(sAidToConfigUrl.remove(str));
                    sDKMonitor.resetReportUrls(sAidToDefaultReportUrl.remove(str));
                    sDKMonitor.init(context, jSONObject, iGetCommonParams);
                }
            }
        }
    }

    public static synchronized void initMonitor(Context context, String str, JSONObject jSONObject, SDKMonitor.IGetExtendParams iGetExtendParams) {
        synchronized (SDKMonitorUtils.class) {
            if (context != null) {
                if (TextUtils.isEmpty(str)) {
                    throw new IllegalArgumentException("param 'aid' is not allowed to assigned empty string");
                } else if (jSONObject == null) {
                    throw new IllegalArgumentException("param 'headerInfo' is not allowed to be null");
                } else if (sAidToMonitorCommon.get(str) == null || !sAidToMonitorCommon.get(str).isHasInit()) {
                    SDKMonitor sDKMonitor = sAidToMonitorCommon.get(str);
                    if (sDKMonitor == null) {
                        sDKMonitor = new SDKMonitor(str);
                        sAidToMonitorCommon.put(str, sDKMonitor);
                    }
                    sDKMonitor.resetConfigUrls(sAidToConfigUrl.remove(str));
                    sDKMonitor.resetReportUrls(sAidToDefaultReportUrl.remove(str));
                    sDKMonitor.init(context, jSONObject, iGetExtendParams);
                }
            }
        }
    }
}
