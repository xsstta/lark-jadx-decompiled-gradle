package com.bytedance.apm.agent.tracing;

import android.text.TextUtils;
import com.bytedance.apm.C2785b;
import com.bytedance.apm.agent.monitor.MonitorTool;
import com.bytedance.apm.p139e.C2921a;
import com.bytedance.apm.p153n.C3047b;
import com.bytedance.apm.trace.p156b.C3092a;
import java.util.HashSet;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.json.JSONArray;
import org.json.JSONObject;

public class AutoPageTraceHelper {
    private static boolean sIsFirstWindowFocusChangedActivity;
    private static long sMaxValidTimeMs = 20000;
    private static final HashSet<String> sMethodSet = new HashSet<>(32);
    private static final ConcurrentLinkedQueue<PageTraceEntity> sPageList = new ConcurrentLinkedQueue<>();

    public static void reportStats() {
        int i;
        try {
            int size = sPageList.size();
            for (int i2 = 0; i2 < size; i2++) {
                ConcurrentLinkedQueue<PageTraceEntity> concurrentLinkedQueue = sPageList;
                PageTraceEntity peek = concurrentLinkedQueue.peek();
                if (peek == null) {
                    return;
                }
                if (peek.onWindowFocusTs != 0 || peek.onViewShowTs != 0) {
                    PageTraceEntity poll = concurrentLinkedQueue.poll();
                    if (poll.isCreateAndResumeValid()) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("name", "onCreate");
                        jSONObject.put("start", poll.onCreateStartTs);
                        jSONObject.put("end", poll.onCreateEndTs);
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("name", "onResume");
                        jSONObject2.put("start", poll.onResumeStartTs);
                        jSONObject2.put("end", poll.onResumeEndTs);
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put("name", "onWindowFocusChanged");
                        jSONObject3.put("start", poll.onWindowFocusTs);
                        JSONArray jSONArray = new JSONArray();
                        jSONArray.put(jSONObject);
                        jSONArray.put(jSONObject2);
                        jSONArray.put(jSONObject3);
                        if (poll.onViewShowTs > 0) {
                            JSONObject jSONObject4 = new JSONObject();
                            jSONObject4.put("name", "viewShow");
                            jSONObject4.put("start", poll.onViewShowTs);
                            jSONArray.put(jSONObject4);
                        }
                        JSONObject jSONObject5 = new JSONObject();
                        jSONObject5.put("name", "page_load_stats");
                        jSONObject5.put("page_type", "activity");
                        jSONObject5.put("start", poll.onCreateStartTs);
                        if (poll.onViewShowTs > 0) {
                            jSONObject5.put("end", poll.onViewShowTs);
                            if (poll.onViewShowTs - poll.onCreateStartTs >= 0) {
                                if (poll.onViewShowTs - poll.onCreateStartTs > sMaxValidTimeMs) {
                                }
                            }
                        } else {
                            jSONObject5.put("end", poll.onWindowFocusTs);
                            if (poll.onWindowFocusTs - poll.onCreateStartTs >= 0) {
                                if (poll.onWindowFocusTs - poll.onCreateStartTs > sMaxValidTimeMs) {
                                }
                            }
                        }
                        jSONObject5.put("spans", jSONArray);
                        HashSet<String> hashSet = sMethodSet;
                        if (hashSet.contains(poll.pageName)) {
                            i = 2;
                        } else {
                            i = 1;
                        }
                        hashSet.add(poll.pageName);
                        jSONObject5.put("launch_mode", i);
                        jSONObject5.put("collect_from", 1);
                        jSONObject5.put("page_name", poll.pageName);
                        JSONObject jSONObject6 = new JSONObject();
                        jSONObject6.put("trace", jSONObject5);
                        if (C2921a.m12357a()) {
                            C2921a.m12361d("PageLoadTrace", jSONObject5.toString());
                        }
                        MonitorTool.monitorPerformance("page_load_trace", null, null, jSONObject6);
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
        } catch (Exception e) {
            if (C2785b.m11769j()) {
                e.printStackTrace();
            }
        }
    }

    public static void setMaxValidTimeMs(long j) {
        sMaxValidTimeMs = j;
    }

    public static void reportViewIdStats(long j, String str) {
        PageTraceEntity peek = sPageList.peek();
        if (peek != null && TextUtils.equals(str, peek.pageName)) {
            peek.onViewShowTs = j;
            C3047b.m12756a().mo12886a(new Runnable() {
                /* class com.bytedance.apm.agent.tracing.AutoPageTraceHelper.RunnableC27712 */

                public void run() {
                    AutoPageTraceHelper.reportStats();
                }
            });
        }
    }

    public static void onTrace(String str, String str2, boolean z) {
        if (TextUtils.equals("onCreate", str2)) {
            if (z) {
                if (!sIsFirstWindowFocusChangedActivity) {
                    AutoLaunchTraceHelper.launcherActivityOnCreateStart(str);
                }
                ConcurrentLinkedQueue<PageTraceEntity> concurrentLinkedQueue = sPageList;
                if (concurrentLinkedQueue.size() > 50) {
                    concurrentLinkedQueue.poll();
                }
                concurrentLinkedQueue.add(new PageTraceEntity(str, System.currentTimeMillis()));
                return;
            }
            if (!sIsFirstWindowFocusChangedActivity) {
                AutoLaunchTraceHelper.launcherActivityOnCreateEnd();
            }
            PageTraceEntity peek = sPageList.peek();
            if (peek != null) {
                peek.onCreateEndTs = System.currentTimeMillis();
            }
        } else if (TextUtils.equals("onResume", str2)) {
            if (z) {
                if (!sIsFirstWindowFocusChangedActivity) {
                    AutoLaunchTraceHelper.launcherActivityOnResumeStart(str);
                }
                PageTraceEntity peek2 = sPageList.peek();
                if (peek2 != null) {
                    peek2.onResumeStartTs = System.currentTimeMillis();
                    return;
                }
                return;
            }
            if (!sIsFirstWindowFocusChangedActivity) {
                AutoLaunchTraceHelper.launcherActivityOnResumeEnd();
            }
            PageTraceEntity peek3 = sPageList.peek();
            if (peek3 != null) {
                peek3.onResumeEndTs = System.currentTimeMillis();
            }
        } else if (TextUtils.equals("onWindowFocusChanged", str2)) {
            if (z) {
                if (!sIsFirstWindowFocusChangedActivity) {
                    AutoLaunchTraceHelper.launcherActivityOnWindowFocusChangedStart(str);
                    sIsFirstWindowFocusChangedActivity = true;
                }
                PageTraceEntity peek4 = sPageList.peek();
                if (peek4 != null && peek4.onWindowFocusTs == 0) {
                    peek4.onWindowFocusTs = System.currentTimeMillis();
                    if (C3092a.m12878a(str) == null) {
                        C3047b.m12756a().mo12886a(new Runnable() {
                            /* class com.bytedance.apm.agent.tracing.AutoPageTraceHelper.RunnableC27701 */

                            public void run() {
                                AutoPageTraceHelper.reportStats();
                            }
                        });
                    }
                }
            }
        } else if (!TextUtils.equals("onStart", str2)) {
        } else {
            if (z) {
                if (!sIsFirstWindowFocusChangedActivity) {
                    AutoLaunchTraceHelper.launcherActivityOnStartStart(str);
                }
            } else if (!sIsFirstWindowFocusChangedActivity) {
                AutoLaunchTraceHelper.launcherActivityOnStartEnd(str);
            }
        }
    }
}
