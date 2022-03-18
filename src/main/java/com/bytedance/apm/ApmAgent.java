package com.bytedance.apm;

import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.apm.alog.AbstractC2783d;
import com.bytedance.apm.alog.IALogActiveUploadObserver;
import com.bytedance.apm.battery.BatteryEnergyCollector;
import com.bytedance.apm.battery.p131b.C2803a;
import com.bytedance.apm.block.p136a.C2854g;
import com.bytedance.apm.config.C2885c;
import com.bytedance.apm.config.C2892e;
import com.bytedance.apm.constant.C2905a;
import com.bytedance.apm.core.ActivityLifeObserver;
import com.bytedance.apm.internal.ApmDelegate;
import com.bytedance.apm.p124a.AbstractC2747b;
import com.bytedance.apm.p124a.p125a.C2741a;
import com.bytedance.apm.p124a.p125a.C2744d;
import com.bytedance.apm.p124a.p126b.C2748a;
import com.bytedance.apm.p124a.p126b.C2749b;
import com.bytedance.apm.p124a.p126b.C2750c;
import com.bytedance.apm.p124a.p126b.C2751d;
import com.bytedance.apm.p124a.p126b.C2752e;
import com.bytedance.apm.p124a.p126b.C2753f;
import com.bytedance.apm.p124a.p126b.C2754g;
import com.bytedance.apm.p139e.C2921a;
import com.bytedance.apm.p143i.C2959c;
import com.bytedance.apm.p143i.C2984e;
import com.bytedance.apm.p143i.C2985f;
import com.bytedance.apm.p143i.C2992h;
import com.bytedance.apm.p143i.C2995i;
import com.bytedance.apm.p143i.p144a.C2948b;
import com.bytedance.apm.p143i.p147c.C2960a;
import com.bytedance.apm.p143i.p147c.C2973f;
import com.bytedance.apm.p148j.C3017a;
import com.bytedance.apm.p153n.C3047b;
import com.bytedance.apm.p153n.C3053c;
import com.bytedance.apm.p154o.C3063a;
import com.bytedance.apm.util.C3117e;
import com.bytedance.apm.util.C3121h;
import com.bytedance.apm.util.C3122i;
import com.bytedance.apm.util.C3140w;
import com.bytedance.apm6.p157a.C3150a;
import com.bytedance.apm6.p184h.p185a.C3331c;
import com.bytedance.apm6.util.C3355e;
import com.bytedance.crash.util.C3926a;
import com.bytedance.monitor.collector.C20152k;
import com.bytedance.services.apm.api.AbstractC20700e;
import com.bytedance.ttnet.http.HttpRequestInfo;
import com.ss.p3204b.C64199c;
import java.io.File;
import java.io.RandomAccessFile;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONException;
import org.json.JSONObject;

public class ApmAgent {
    static AtomicLong atomicLong = new AtomicLong(0);
    private static long sLastCheckDiskTime = -1;
    private static MappedByteBuffer sMappedByteBuffer;
    private static File sProcessLogsFolder;

    public static void addBlockFilter(Map<String, String> map) {
    }

    public static void addFpsFilter(Map<String, String> map) {
    }

    public static void monitorImageSample(String str, int i, String str2, long j, JSONObject jSONObject) {
    }

    public static void reportLegacyMonitorLog(Context context, long j, long j2, boolean z) {
    }

    public static boolean isConfigReady() {
        return ApmDelegate.m12591a().mo12794g();
    }

    private static JSONObject getCapacity() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("battery_percent", C64199c.m252473c(C2785b.m11735a()));
            JSONObject d = C2803a.m11844a().mo12138d();
            if (d.length() == 0) {
                jSONObject.put("more", "no-more-info");
            } else {
                jSONObject.put("more", d);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    private static JSONObject getGalvanicNow() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("battery_current", (double) C64199c.m252472b(C2785b.m11735a()));
            jSONObject.put("scene", ActivityLifeObserver.getInstance().getTopActivityClassName());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    private static void weedOutOldestLogFiles() {
        if (C2785b.m11761e() && sProcessLogsFolder.exists()) {
            File[] listFiles = sProcessLogsFolder.listFiles();
            Arrays.sort(listFiles, new Comparator<File>() {
                /* class com.bytedance.apm.ApmAgent.AnonymousClass26 */

                /* renamed from: a */
                public int compare(File file, File file2) {
                    if (Build.VERSION.SDK_INT >= 19) {
                        return Long.compare(file.lastModified(), file2.lastModified());
                    }
                    int i = (file.lastModified() > file2.lastModified() ? 1 : (file.lastModified() == file2.lastModified() ? 0 : -1));
                    if (i < 0) {
                        return -1;
                    }
                    if (i == 0) {
                        return 0;
                    }
                    return 1;
                }
            });
            int i = 60;
            if (listFiles.length <= 60) {
                i = listFiles.length;
            }
            for (int i2 = 0; i2 < i; i2++) {
                listFiles[i2].delete();
            }
        }
    }

    private static void reportFeedbackInfo() {
        try {
            if (!C2992h.m12578a().mo12744d() && C2785b.m11735a() != null) {
                C2992h.m12578a().mo12742b();
            }
            JSONObject jSONObject = new JSONObject();
            JSONObject a = C2985f.m12541a().mo12727a(true);
            a.put("crash_section", C2785b.m11754c(System.currentTimeMillis()));
            a.put("crash_type", "feedback");
            JSONObject k = C20152k.m73538a().mo68303k();
            k.put("activity_track", C3926a.m16276a());
            k.put("cpu_info", C2984e.m12539a().mo12726b());
            k.put("memory_info", getMemInfo(C2959c.m12447a(C2785b.m11735a())));
            k.put("temperature", (double) C2992h.m12578a().mo12743c());
            String a2 = C2854g.m12031a().mo12263a(0L, SystemClock.uptimeMillis());
            if (!TextUtils.isEmpty(a2)) {
                k.put("evil_method", a2);
                a.put("with_evil_method", "true");
            }
            String c = C20152k.m73538a().mo68295c(0, SystemClock.uptimeMillis());
            if (!TextUtils.isEmpty(c) && c.length() > 10) {
                k.put("profiler_monitor", c);
            }
            k.put("battery", getCapacity());
            k.put("battery_current", getGalvanicNow());
            jSONObject.put("custom", k);
            jSONObject.put("filters", a);
            jSONObject.put("stack", "at feedback.*(a.java:-1)");
            jSONObject.put("event_type", "serious_lag");
            C2751d dVar = new C2751d("serious_block_monitor", jSONObject);
            dVar.mo11815e();
            C2741a.m11630c().mo11785a(dVar);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public static int reportThreadCount(String str) {
        try {
            return C2995i.m12584a(str, true);
        } catch (Exception unused) {
            return 0;
        }
    }

    public static void setReportMode(C2885c cVar) {
        ApmDelegate.m12591a().mo12777a(cVar);
    }

    public static void stopTrafficStats(String str) {
        C2973f.m12511a().mo12710a(str);
    }

    public static boolean getLogTypeSwitch(String str) {
        return ApmDelegate.m12591a().mo12782a(str);
    }

    public static boolean getMetricsSwitch(String str) {
        return ApmDelegate.m12591a().mo12790c(str);
    }

    public static boolean getServiceSwitch(String str) {
        return ApmDelegate.m12591a().mo12786b(str);
    }

    public static void startScene(String str) {
        C2985f.m12541a().mo12728a(str);
        C3331c.m13887a().mo13564a(str);
    }

    public static void startTrafficStats(String str) {
        C2973f.m12511a().mo12711a(str, false);
    }

    public static void stopScene(String str) {
        C2985f.m12541a().mo12731b(str);
        C3331c.m13887a().mo13567b(str);
    }

    private static JSONObject getExtraLog(JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (jSONObject.isNull("timestamp")) {
            try {
                jSONObject.put("timestamp", System.currentTimeMillis());
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return jSONObject;
    }

    private static JSONObject preProcessExtJson(JSONObject jSONObject) {
        try {
            JSONObject b = C3121h.m13001b(jSONObject);
            if (b == null) {
                b = new JSONObject();
            }
            if (b.isNull("timestamp")) {
                b.put("timestamp", System.currentTimeMillis());
            }
            return b;
        } catch (Exception unused) {
            return jSONObject;
        }
    }

    private static JSONObject preProcessExtJson2(JSONObject jSONObject) {
        try {
            JSONObject b = C3355e.m13959b(jSONObject);
            if (b == null) {
                b = new JSONObject();
            }
            if (b.isNull("timestamp")) {
                b.put("timestamp", System.currentTimeMillis());
            }
            return b;
        } catch (Exception unused) {
            return jSONObject;
        }
    }

    public static void startCollectCurrent(final String str) {
        if (C2785b.m11735a() != null) {
            C3047b.m12756a().mo12886a(new Runnable() {
                /* class com.bytedance.apm.ApmAgent.AnonymousClass22 */

                public void run() {
                    BatteryEnergyCollector.m11801a().mo12098a(str);
                }
            });
        } else {
            C2921a.m12360c("apm_debug", "ApmAgent#startCollectCurrent  apm do not be init");
        }
    }

    public static void stopCollectCurrent(final String str) {
        if (C2785b.m11735a() != null) {
            C3047b.m12756a().mo12886a(new Runnable() {
                /* class com.bytedance.apm.ApmAgent.AnonymousClass24 */

                public void run() {
                    BatteryEnergyCollector.m11801a().mo12100b(str);
                }
            });
        } else {
            C2921a.m12360c("apm_debug", "ApmAgent#stopCollectCurrent  apm do not be init");
        }
    }

    private static void addDebugMessage(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("_debug_uuid", C2785b.m11767h() + "_" + atomicLong.getAndAdd(1));
                jSONObject.put("_debug_self", jSONObject2);
            } catch (Exception unused) {
            }
        }
    }

    private static JSONObject getMemInfo(C2948b bVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("javaTotalMemory", bVar.f9463a);
        jSONObject.put("javaFreeMemory", bVar.f9464b);
        jSONObject.put("javaUsedMemory", bVar.f9465c);
        jSONObject.put("pssDalvik", bVar.f9466d);
        jSONObject.put("pssNative", bVar.f9467e);
        jSONObject.put("pssTotal", bVar.f9468f);
        jSONObject.put("graphics", bVar.f9469g);
        jSONObject.put("vmSize", bVar.f9470h);
        return jSONObject;
    }

    public static void monitorEvent(final C2892e eVar) {
        if (eVar != null) {
            final JSONObject extraLog = getExtraLog(eVar.mo12475e());
            addDebugMessage(extraLog);
            C3047b.m12756a().mo12886a(new Runnable() {
                /* class com.bytedance.apm.ApmAgent.RunnableC27262 */

                public void run() {
                    C3150a.m13129a(eVar.mo12471a(), eVar.mo12474d(), null, eVar.mo12472b(), eVar.mo12473c(), extraLog);
                }
            });
            if (C2785b.m11770k()) {
                final JSONObject d = C3121h.m13004d(eVar.mo12472b());
                final JSONObject d2 = C3121h.m13004d(eVar.mo12473c());
                final JSONObject d3 = C3121h.m13004d(extraLog);
                C3053c.m12774a().mo12897a(new Runnable() {
                    /* class com.bytedance.apm.ApmAgent.RunnableC27273 */

                    public void run() {
                        JSONObject a = new C2750c(eVar.mo12471a(), eVar.mo12474d(), null, d, d2, d3, eVar.mo12476f()).mo11807a();
                        if (a != null) {
                            ApmAgent.storeLogBypass("monitorEvent", a.toString());
                        }
                    }
                });
            }
        }
    }

    public static void monitorCommonLog(String str, JSONObject jSONObject) {
        monitorCommonLog(str, jSONObject, false);
    }

    public static void monitorPageLoad(JSONObject jSONObject, JSONObject jSONObject2) {
        try {
            monitorPerformance("page_load", "page_load", jSONObject, jSONObject2, null);
        } catch (Exception unused) {
        }
    }

    public static void startTrafficStats(String str, boolean z) {
        C2973f.m12511a().mo12711a(str, z);
    }

    public static void addPerfTag(String str, String str2) {
        C2985f.m12541a().mo12729a(str, str2);
        C3331c.m13887a().mo13565a(str, str2);
    }

    public static void removePerfTag(String str, String str2) {
        C2985f.m12541a().mo12732b(str, str2);
        C3331c.m13887a().mo13568b(str, str2);
    }

    public static void monitorExceptionLog(final String str, JSONObject jSONObject) {
        final JSONObject preProcessExtJson = preProcessExtJson(jSONObject);
        C3047b.m12756a().mo12886a(new Runnable() {
            /* class com.bytedance.apm.ApmAgent.AnonymousClass11 */

            public void run() {
                C2741a.m11630c().mo11785a(new C2751d(str, preProcessExtJson));
            }
        });
        if (C2785b.m11770k()) {
            C3053c.m12774a().mo12897a(new Runnable() {
                /* class com.bytedance.apm.ApmAgent.AnonymousClass13 */

                public void run() {
                    JSONObject a = new C2751d(str, preProcessExtJson).mo11807a();
                    if (a != null) {
                        ApmAgent.storeLogBypass("monitorExceptionLog", a.toString());
                    }
                }
            });
        }
    }

    public static void uploadMappingFile(String str, AbstractC20700e eVar) {
        String optString = C2785b.m11774o().optString("aid");
        String optString2 = C2785b.m11774o().optString("update_version_code");
        String optString3 = C2785b.m11774o().optString("channel");
        String optString4 = C2785b.m11774o().optString("release_build");
        String optString5 = C2785b.m11774o().optString("device_id");
        if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(optString2) && !TextUtils.isEmpty(optString3) && !TextUtils.isEmpty(optString4)) {
            C3017a.m12670a(optString, optString2, optString3, optString4, str, null, optString5, eVar);
        } else if (eVar != null) {
            eVar.mo69904a("Missing required parameters");
        }
    }

    public static void storeLogBypass(String str, String str2) {
        long j;
        long j2;
        try {
            synchronized (ApmAgent.class) {
                String d = C2785b.m11756d();
                long id = Thread.currentThread().getId();
                long currentTimeMillis = System.currentTimeMillis();
                String a = C3140w.m13081a();
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append(str);
                stringBuffer.append("#");
                stringBuffer.append(id);
                stringBuffer.append("#");
                stringBuffer.append(currentTimeMillis);
                stringBuffer.append("#");
                stringBuffer.append(a);
                stringBuffer.append("\n");
                stringBuffer.append(str2);
                stringBuffer.append("\n");
                byte[] bytes = stringBuffer.toString().getBytes("UTF-8");
                String absolutePath = C2785b.m11735a().getExternalFilesDir(null).getAbsolutePath();
                if (sMappedByteBuffer == null) {
                    File file = new File(absolutePath + "/logs");
                    sProcessLogsFolder = new File(absolutePath + "/logs/proc: " + d);
                    File file2 = new File(absolutePath + "/logs/proc: " + d + "/" + a);
                    if (!file.exists()) {
                        file.mkdirs();
                    }
                    if (!sProcessLogsFolder.exists()) {
                        sProcessLogsFolder.mkdirs();
                    }
                    file2.createNewFile();
                    FileChannel channel = new RandomAccessFile(file2, "rw").getChannel();
                    FileChannel.MapMode mapMode = FileChannel.MapMode.READ_WRITE;
                    if (C2785b.m11761e()) {
                        j2 = 2097152;
                    } else {
                        j2 = 262144;
                    }
                    sMappedByteBuffer = channel.map(mapMode, 0, j2);
                }
                if (sMappedByteBuffer.remaining() < bytes.length) {
                    sMappedByteBuffer.force();
                    FileChannel channel2 = new RandomAccessFile(new File(absolutePath + "/logs/proc: " + d + "/" + a), "rw").getChannel();
                    FileChannel.MapMode mapMode2 = FileChannel.MapMode.READ_WRITE;
                    if (C2785b.m11761e()) {
                        j = 2097152;
                    } else {
                        j = 262144;
                    }
                    sMappedByteBuffer = channel2.map(mapMode2, 0, j);
                }
                sMappedByteBuffer.put(bytes);
                if (sLastCheckDiskTime == -1 || System.currentTimeMillis() - sLastCheckDiskTime > 3600000) {
                    if (C3117e.m12985b(sProcessLogsFolder) > 1073741824 || C3117e.m12979a(C2785b.m11735a()).getFreeSpace() < 1073741824) {
                        weedOutOldestLogFiles();
                    }
                    sLastCheckDiskTime = System.currentTimeMillis();
                }
            }
        } catch (Throwable unused) {
        }
    }

    public static void monitorUIAction(String str, String str2, JSONObject jSONObject) {
        monitorUIAction(str, str2, jSONObject, null);
    }

    public static void feedbackReport(final long j, final long j2, final boolean z) {
        C3047b.m12756a().mo12886a(new Runnable() {
            /* class com.bytedance.apm.ApmAgent.AnonymousClass25 */

            public void run() {
                ApmAgent.reportLegacyMonitorLog(C2785b.m11735a(), j, j2, z);
            }
        });
    }

    public static void monitorDirectOnTimer(final String str, final String str2, final float f) {
        C3047b.m12756a().mo12886a(new Runnable() {
            /* class com.bytedance.apm.ApmAgent.AnonymousClass20 */

            public void run() {
                C2741a.m11630c().mo11785a(new C2752e(str, str2, f));
            }
        });
        if (C2785b.m11770k()) {
            C3053c.m12774a().mo12897a(new Runnable() {
                /* class com.bytedance.apm.ApmAgent.AnonymousClass21 */

                public void run() {
                    JSONObject a = new C2752e(str, str2, f).mo11807a();
                    if (a != null) {
                        ApmAgent.storeLogBypass("monitorDirectOnTimer", a.toString());
                    }
                }
            });
        }
    }

    public static void monitorCommonLog(final String str, JSONObject jSONObject, final boolean z) {
        final JSONObject preProcessExtJson = preProcessExtJson(jSONObject);
        addDebugMessage(preProcessExtJson);
        C3047b.m12756a().mo12886a(new Runnable() {
            /* class com.bytedance.apm.ApmAgent.AnonymousClass14 */

            public void run() {
                C3150a.m13130a(str, preProcessExtJson);
            }
        });
        if (C2785b.m11770k()) {
            final JSONObject d = C3121h.m13004d(preProcessExtJson);
            C3053c.m12774a().mo12897a(new Runnable() {
                /* class com.bytedance.apm.ApmAgent.AnonymousClass15 */

                public void run() {
                    JSONObject a = new C2749b(str, d, z).mo11807a();
                    if (a != null) {
                        ApmAgent.storeLogBypass("monitorCommonLog", a.toString());
                    }
                }
            });
        }
    }

    public static void monitorDuration(final String str, JSONObject jSONObject, JSONObject jSONObject2) {
        JSONObject preProcessExtJson2 = preProcessExtJson2(jSONObject2);
        addDebugMessage(preProcessExtJson2);
        C3150a.m13131a(str, C3355e.m13959b(jSONObject), preProcessExtJson2);
        if (C2785b.m11770k()) {
            final JSONObject d = C3121h.m13004d(jSONObject);
            final JSONObject d2 = C3121h.m13004d(preProcessExtJson2);
            C3053c.m12774a().mo12897a(new Runnable() {
                /* class com.bytedance.apm.ApmAgent.RunnableC27317 */

                public void run() {
                    JSONObject a = new C2750c(str, 0, d, null, null, d2).mo11807a();
                    if (a != null) {
                        ApmAgent.storeLogBypass("monitorDuration", a.toString());
                    }
                }
            });
        }
    }

    public static void monitorStatusRate(final String str, final int i, JSONObject jSONObject) {
        JSONObject preProcessExtJson = preProcessExtJson(jSONObject);
        addDebugMessage(preProcessExtJson);
        C3150a.m13126a(str, i, preProcessExtJson);
        if (C2785b.m11770k()) {
            final JSONObject d = C3121h.m13004d(preProcessExtJson);
            C3053c.m12774a().mo12897a(new Runnable() {
                /* class com.bytedance.apm.ApmAgent.RunnableC27306 */

                public void run() {
                    JSONObject a = new C2750c(str, i, null, null, null, d).mo11807a();
                    if (a != null) {
                        ApmAgent.storeLogBypass("monitorStatusRate", a.toString());
                    }
                }
            });
        }
    }

    public static void monitorPerformance(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        monitorPerformance(str, "", jSONObject, jSONObject2, jSONObject3);
    }

    public static void activeUploadAlog(long j, long j2, String str, IALogActiveUploadObserver iALogActiveUploadObserver) {
        activeUploadAlog("", j, j2, str, iALogActiveUploadObserver);
    }

    public static void monitorEvent(final String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        JSONObject preProcessExtJson = preProcessExtJson(jSONObject3);
        addDebugMessage(preProcessExtJson);
        C3150a.m13132a(str, C3121h.m13005e(jSONObject), C3121h.m13005e(jSONObject2), preProcessExtJson);
        if (C2785b.m11770k()) {
            final JSONObject d = C3121h.m13004d(jSONObject);
            final JSONObject d2 = C3121h.m13004d(jSONObject2);
            final JSONObject d3 = C3121h.m13004d(preProcessExtJson);
            C3053c.m12774a().mo12897a(new Runnable() {
                /* class com.bytedance.apm.ApmAgent.AnonymousClass32 */

                public void run() {
                    JSONObject a = new C2750c(str, 0, null, d, d2, d3).mo11807a();
                    if (a != null) {
                        ApmAgent.storeLogBypass("monitorEvent", a.toString());
                    }
                }
            });
        }
    }

    public static void monitorStatusAndDuration(final String str, final int i, JSONObject jSONObject, JSONObject jSONObject2) {
        JSONObject preProcessExtJson = preProcessExtJson(jSONObject2);
        addDebugMessage(preProcessExtJson);
        C3150a.m13127a(str, i, C3121h.m13005e(jSONObject), C3121h.m13005e(preProcessExtJson));
        if (C2785b.m11770k()) {
            final JSONObject d = C3121h.m13004d(jSONObject);
            final JSONObject d2 = C3121h.m13004d(preProcessExtJson);
            C3053c.m12774a().mo12897a(new Runnable() {
                /* class com.bytedance.apm.ApmAgent.AnonymousClass10 */

                public void run() {
                    JSONObject a = new C2750c(str, i, d, null, null, d2).mo11807a();
                    if (a != null) {
                        ApmAgent.storeLogBypass("monitorStatusAndDuration", a.toString());
                    }
                }
            });
        }
    }

    public static void monitorUIAction(final String str, final String str2, JSONObject jSONObject, JSONObject jSONObject2) {
        try {
            final JSONObject b = C3121h.m13001b(jSONObject);
            final JSONObject preProcessExtJson = preProcessExtJson(jSONObject2);
            C3047b.m12756a().mo12886a(new Runnable() {
                /* class com.bytedance.apm.ApmAgent.AnonymousClass16 */

                public void run() {
                    C2741a.m11630c().mo11785a(new C2754g(str, str2, b, preProcessExtJson));
                }
            });
            if (C2785b.m11770k()) {
                C3053c.m12774a().mo12897a(new Runnable() {
                    /* class com.bytedance.apm.ApmAgent.AnonymousClass17 */

                    public void run() {
                        JSONObject a = new C2754g(str, str2, b, preProcessExtJson).mo11807a();
                        if (a != null) {
                            ApmAgent.storeLogBypass("monitorUIAction", a.toString());
                        }
                    }
                });
            }
        } catch (Exception unused) {
        }
    }

    public static void monitorDuration(final String str, final JSONObject jSONObject, JSONObject jSONObject2, long j) {
        if (jSONObject2 != null) {
            try {
                jSONObject2.put("timestamp", j);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        final JSONObject preProcessExtJson = preProcessExtJson(jSONObject2);
        addDebugMessage(preProcessExtJson);
        C3047b.m12756a().mo12886a(new Runnable() {
            /* class com.bytedance.apm.ApmAgent.RunnableC27328 */

            public void run() {
                C3150a.m13131a(str, C3121h.m13004d(jSONObject), C3121h.m13004d(preProcessExtJson));
            }
        });
        if (C2785b.m11770k()) {
            final JSONObject d = C3121h.m13004d(jSONObject);
            final JSONObject d2 = C3121h.m13004d(preProcessExtJson);
            C3053c.m12774a().mo12897a(new Runnable() {
                /* class com.bytedance.apm.ApmAgent.RunnableC27339 */

                public void run() {
                    JSONObject a = new C2750c(str, 0, d, null, null, d2).mo11807a();
                    if (a != null) {
                        ApmAgent.storeLogBypass("monitorDuration", a.toString());
                    }
                }
            });
        }
    }

    public static void activeUploadAlog(String str, long j, long j2, String str2, IALogActiveUploadObserver iALogActiveUploadObserver) {
        activeUploadAlog(str, j, j2, str2, iALogActiveUploadObserver, null);
    }

    public static void monitorPerformance(final String str, final String str2, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        try {
            final JSONObject b = C3121h.m13001b(jSONObject2);
            final JSONObject b2 = C3121h.m13001b(jSONObject);
            final JSONObject preProcessExtJson = preProcessExtJson(jSONObject3);
            C3047b.m12756a().mo12886a(new Runnable() {
                /* class com.bytedance.apm.ApmAgent.AnonymousClass18 */

                public void run() {
                    C2741a.m11630c().mo11785a(new C2753f(str, str2, b2, b, preProcessExtJson));
                }
            });
            if (C2785b.m11770k()) {
                C3053c.m12774a().mo12897a(new Runnable() {
                    /* class com.bytedance.apm.ApmAgent.AnonymousClass19 */

                    public void run() {
                        JSONObject a = new C2753f(str, str2, b2, b, preProcessExtJson).mo11807a();
                        if (a != null) {
                            ApmAgent.storeLogBypass("monitorPerformance", a.toString());
                        }
                    }
                });
            }
        } catch (Exception unused) {
        }
    }

    public static void monitorStatusAndEvent(final String str, final int i, final JSONObject jSONObject, final JSONObject jSONObject2, JSONObject jSONObject3) {
        final JSONObject preProcessExtJson = preProcessExtJson(jSONObject3);
        addDebugMessage(preProcessExtJson);
        C3047b.m12756a().mo12886a(new Runnable() {
            /* class com.bytedance.apm.ApmAgent.RunnableC27284 */

            public void run() {
                C3150a.m13128a(str, i, C3121h.m13004d(jSONObject), C3121h.m13004d(jSONObject2), C3121h.m13004d(preProcessExtJson));
            }
        });
        if (C2785b.m11770k()) {
            final JSONObject d = C3121h.m13004d(jSONObject);
            final JSONObject d2 = C3121h.m13004d(jSONObject2);
            final JSONObject d3 = C3121h.m13004d(preProcessExtJson);
            C3053c.m12774a().mo12897a(new Runnable() {
                /* class com.bytedance.apm.ApmAgent.RunnableC27295 */

                public void run() {
                    JSONObject a = new C2750c(str, i, null, d, d2, d3).mo11807a();
                    if (a != null) {
                        ApmAgent.storeLogBypass("monitorStatusAndEvent", a.toString());
                    }
                }
            });
        }
    }

    public static void trafficStats(long j, String str, String str2, String str3, JSONObject jSONObject, JSONObject jSONObject2) {
        C2960a.m12448a().mo12673a(j, str, str2, str3, jSONObject, jSONObject2);
    }

    public static void activeUploadAlog(String str, long j, long j2, String str2, IALogActiveUploadObserver iALogActiveUploadObserver, AbstractC2783d dVar) {
        ApmDelegate.m12591a().mo12780a(str, j, j2, str2, iALogActiveUploadObserver, dVar);
    }

    public static void uploadMappingFile(String str, String str2, String str3, String str4, String str5, AbstractC20700e eVar) {
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4) && !TextUtils.isEmpty(str5)) {
            uploadMappingFileInternal(str, str2, str3, str4, str5, null, eVar);
        } else if (eVar != null) {
            eVar.mo69904a("Missing required parameters");
        }
    }

    public static void monitorApiError(final long j, final long j2, final String str, final String str2, final String str3, final int i, JSONObject jSONObject) {
        final JSONObject preProcessExtJson = preProcessExtJson(jSONObject);
        C3047b.m12756a().mo12886a(new Runnable() {
            /* class com.bytedance.apm.ApmAgent.AnonymousClass23 */

            public void run() {
                C2744d.m11644c().mo11785a((AbstractC2747b) new C2748a("api_error", j, j2, str, str2, str3, i, C3121h.m13004d(preProcessExtJson)));
            }
        });
        if (C2785b.m11770k()) {
            C3053c.m12774a().mo12897a(new Runnable() {
                /* class com.bytedance.apm.ApmAgent.AnonymousClass27 */

                public void run() {
                    JSONObject a = new C2748a("api_error", j, j2, str, str2, str3, i, preProcessExtJson).mo11807a();
                    if (a != null) {
                        ApmAgent.storeLogBypass("monitorApiError", a.toString());
                    }
                }
            });
        }
    }

    public static void monitorSLA(final long j, final long j2, final String str, final String str2, final String str3, final int i, JSONObject jSONObject) {
        final JSONObject preProcessExtJson = preProcessExtJson(jSONObject);
        C3047b.m12756a().mo12886a(new Runnable() {
            /* class com.bytedance.apm.ApmAgent.RunnableC27251 */

            public void run() {
                C2744d.m11644c().mo11785a((AbstractC2747b) new C2748a("api_all", j, j2, str, str2, str3, i, C3121h.m13004d(preProcessExtJson)));
            }
        });
        if (C2785b.m11770k()) {
            C3053c.m12774a().mo12897a(new Runnable() {
                /* class com.bytedance.apm.ApmAgent.AnonymousClass12 */

                public void run() {
                    JSONObject a = new C2748a("api_all", j, j2, str, str2, str3, i, preProcessExtJson).mo11807a();
                    if (a != null) {
                        ApmAgent.storeLogBypass("monitorSLA", a.toString());
                    }
                }
            });
        }
    }

    private static void uploadMappingFileInternal(String str, String str2, String str3, String str4, String str5, String str6, AbstractC20700e eVar) {
        if (!C3122i.m13009a(C2905a.f9396c)) {
            try {
                C3017a.m12671b(new URL(C2905a.f9396c.get(0)).getHost());
                C3017a.m12670a(str2, str3, str4, str5, str, null, str6, eVar);
            } catch (MalformedURLException unused) {
                if (eVar != null) {
                    eVar.mo69904a("MalformedURLException");
                }
            }
        } else if (eVar != null) {
            eVar.mo69904a("need host");
        }
    }

    public static void uploadMappingFile(String str, String str2, String str3, String str4, String str5, AbstractC20700e eVar, String str6) {
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4) && !TextUtils.isEmpty(str5) && !TextUtils.isEmpty(str6)) {
            C3017a.m12671b(str6);
            C3017a.m12669a(str2, str3, str4, str5, str, null, eVar);
        } else if (eVar != null) {
            eVar.mo69904a("Missing required parameters");
        }
    }

    public static void uploadMappingFile(String str, String str2, String str3, String str4, String str5, String str6, AbstractC20700e eVar) {
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4) && !TextUtils.isEmpty(str5) && !TextUtils.isEmpty(str6)) {
            uploadMappingFileInternal(str, str2, str3, str4, str5, str6, eVar);
        } else if (eVar != null) {
            eVar.mo69904a("Missing required parameters");
        }
    }

    public static void monitorSLA(final long j, final long j2, final String str, final String str2, final String str3, final int i, JSONObject jSONObject, HttpRequestInfo httpRequestInfo) {
        final JSONObject preProcessExtJson = preProcessExtJson(jSONObject);
        C3063a.m12798a(httpRequestInfo, preProcessExtJson);
        C3047b.m12756a().mo12886a(new Runnable() {
            /* class com.bytedance.apm.ApmAgent.AnonymousClass28 */

            public void run() {
                C2744d.m11644c().mo11785a((AbstractC2747b) new C2748a("api_all", j, j2, str, str2, str3, i, C3121h.m13004d(preProcessExtJson)));
            }
        });
        if (C2785b.m11770k()) {
            C3053c.m12774a().mo12897a(new Runnable() {
                /* class com.bytedance.apm.ApmAgent.AnonymousClass29 */

                public void run() {
                    JSONObject a = new C2748a("api_all", j, j2, str, str2, str3, i, preProcessExtJson).mo11807a();
                    if (a != null) {
                        ApmAgent.storeLogBypass("monitorSLA", a.toString());
                    }
                }
            });
        }
    }

    public static void uploadMappingFile(String str, String str2, String str3, String str4, String str5, AbstractC20700e eVar, String str6, String str7) {
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4) && !TextUtils.isEmpty(str5) && !TextUtils.isEmpty(str7) && !TextUtils.isEmpty(str6)) {
            C3017a.m12671b(str6);
            C3017a.m12670a(str2, str3, str4, str5, str, null, str7, eVar);
        } else if (eVar != null) {
            eVar.mo69904a("Missing required parameters");
        }
    }

    public static void monitorApiError(final long j, final long j2, final String str, final String str2, final String str3, final int i, JSONObject jSONObject, HttpRequestInfo httpRequestInfo, Throwable th) {
        final JSONObject preProcessExtJson = preProcessExtJson(jSONObject);
        C3063a.m12797a(httpRequestInfo, th, preProcessExtJson);
        C3047b.m12756a().mo12886a(new Runnable() {
            /* class com.bytedance.apm.ApmAgent.AnonymousClass30 */

            public void run() {
                C2744d.m11644c().mo11785a((AbstractC2747b) new C2748a("api_error", j, j2, str, str2, str3, i, C3121h.m13004d(preProcessExtJson)));
            }
        });
        if (C2785b.m11770k()) {
            C3053c.m12774a().mo12897a(new Runnable() {
                /* class com.bytedance.apm.ApmAgent.AnonymousClass31 */

                public void run() {
                    JSONObject a = new C2748a("api_error", j, j2, str, str2, str3, i, preProcessExtJson).mo11807a();
                    if (a != null) {
                        ApmAgent.storeLogBypass("monitorApiError", a.toString());
                    }
                }
            });
        }
    }
}
