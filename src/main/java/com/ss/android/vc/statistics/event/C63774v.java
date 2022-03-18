package com.ss.android.vc.statistics.event;

import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.entity.follow.FollowInfo;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.follow.common.C61806b;
import com.ss.android.vc.service.impl.C63682b;
import com.ss.android.vc.statistics.p3182c.C63726b;
import java.util.ArrayList;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.vc.statistics.event.v */
public class C63774v {

    /* renamed from: a */
    public static volatile int f160945a;

    /* renamed from: b */
    public static volatile boolean f160946b;

    /* renamed from: c */
    private static volatile long f160947c;

    /* renamed from: d */
    private static volatile long f160948d;

    /* renamed from: e */
    private static volatile long f160949e;

    /* renamed from: f */
    private static volatile long f160950f;

    /* renamed from: g */
    private static volatile long f160951g;

    /* renamed from: h */
    private static volatile long f160952h;

    /* renamed from: i */
    private static volatile long f160953i;

    /* renamed from: j */
    private static ArrayList<Long> f160954j = new ArrayList<>();

    /* renamed from: a */
    public static void m250381a() {
        f160951g = System.currentTimeMillis();
    }

    /* renamed from: b */
    public static void m250389b() {
        f160952h = System.currentTimeMillis();
    }

    /* renamed from: c */
    public static void m250391c() {
        f160950f = System.currentTimeMillis();
    }

    /* renamed from: d */
    public static void m250393d() {
        f160947c = System.currentTimeMillis();
    }

    /* renamed from: e */
    public static void m250395e() {
        long j = 0;
        if (f160952h > 0) {
            f160952h = 0;
            j = System.currentTimeMillis() - f160952h;
        }
        synchronized ("FollowLoadingTimeEvent") {
            f160954j.add(Long.valueOf(j));
        }
    }

    /* renamed from: f */
    public static void m250396f() {
        long j = 0;
        if (f160950f > 0) {
            f160950f = 0;
            j = System.currentTimeMillis() - f160950f;
        }
        synchronized ("FollowLoadingTimeEvent") {
            f160954j.add(Long.valueOf(j));
        }
    }

    /* renamed from: a */
    public static void m250382a(int i) {
        f160946b = false;
        f160948d = System.currentTimeMillis();
        f160945a = i;
    }

    /* renamed from: a */
    public static void m250383a(VideoChat videoChat) {
        f160953i = System.currentTimeMillis();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("action_name", "ms_follow_start");
            C63726b.m249915a("vc_meeting_page_onthecall", jSONObject, videoChat);
        } catch (JSONException e) {
            C60700b.m235846a("FollowLoadingTimeEvent", "followStartCreateEvent", e);
        }
    }

    /* renamed from: a */
    public static void m250384a(VideoChat videoChat, int i) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("error_code", i);
            m250388a("ms_follow_fail", jSONObject, videoChat);
            f160953i = 0;
        } catch (JSONException e) {
            C60700b.m235846a("FollowLoadingTimeEvent", "followCreateFailEvent", e);
        }
    }

    /* renamed from: b */
    public static void m250390b(VideoChat videoChat, FollowInfo followInfo) {
        int i;
        f160949e = System.currentTimeMillis();
        try {
            JSONObject jSONObject = new JSONObject();
            int i2 = 0;
            if (followInfo == null) {
                i = 0;
            } else {
                i = followInfo.getShareId();
            }
            jSONObject.put("share_id", i);
            if (C61806b.m241471a(followInfo)) {
                i2 = 1;
            }
            jSONObject.put("is_presenter", i2);
            m250388a("webview_loading_start", jSONObject, videoChat);
        } catch (JSONException e) {
            C60700b.m235846a("FollowLoadingTimeEvent", "startLoadEvent", e);
        }
    }

    /* renamed from: d */
    public static void m250394d(VideoChat videoChat, FollowInfo followInfo) {
        int i;
        try {
            long j = 0;
            if (f160953i > 0) {
                f160953i = 0;
                j = System.currentTimeMillis() - f160953i;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("duration", j);
            if (followInfo == null) {
                i = 0;
            } else {
                i = followInfo.getShareId();
            }
            jSONObject.put("share_id", i);
            m250388a("ms_follow_success", jSONObject, videoChat);
        } catch (JSONException e) {
            C60700b.m235846a("FollowLoadingTimeEvent", "followCreateSuccessEvent", e);
        }
    }

    /* renamed from: a */
    public static void m250385a(VideoChat videoChat, FollowInfo followInfo) {
        int i;
        try {
            long j = 0;
            if (f160951g > 0) {
                f160951g = 0;
                j = System.currentTimeMillis() - f160951g;
            }
            JSONObject jSONObject = new JSONObject();
            int i2 = 0;
            if (followInfo == null) {
                i = 0;
            } else {
                i = followInfo.getShareId();
            }
            jSONObject.put("share_id", i);
            if (C61806b.m241471a(followInfo)) {
                i2 = 1;
            }
            jSONObject.put("is_presenter", i2);
            jSONObject.put("duration", j);
            m250388a("ms_groot_channel_success", jSONObject, videoChat);
        } catch (JSONException e) {
            C60700b.m235846a("FollowLoadingTimeEvent", "grootOpenTimeEvent", e);
        }
    }

    /* renamed from: c */
    public static void m250392c(VideoChat videoChat, FollowInfo followInfo) {
        int i;
        int i2;
        try {
            long j = 0;
            if (f160949e > 0) {
                f160949e = 0;
                j = System.currentTimeMillis() - f160949e;
            }
            JSONObject jSONObject = new JSONObject();
            if (followInfo == null) {
                i = 0;
            } else {
                i = followInfo.getShareId();
            }
            jSONObject.put("share_id", i);
            if (C61806b.m241471a(followInfo)) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            jSONObject.put("is_presenter", i2);
            jSONObject.put("duration", j);
            jSONObject.put("retry_times", 0);
            m250388a("webview_loading_success", jSONObject, videoChat);
        } catch (JSONException e) {
            C60700b.m235846a("FollowLoadingTimeEvent", "loadSuccessEvent", e);
        }
    }

    /* renamed from: a */
    public static void m250386a(C61303k kVar, FollowInfo followInfo, int i) {
        long j;
        long j2;
        int i2;
        if (kVar != null && kVar.mo212056e() != null && !f160946b) {
            int i3 = 1;
            try {
                f160946b = true;
                long j3 = 0;
                if (f160948d > 0) {
                    j2 = System.currentTimeMillis() - f160948d;
                    j = f160947c - f160948d;
                    f160948d = 0;
                    f160947c = 0;
                } else {
                    j2 = 0;
                    j = 0;
                }
                JSONObject jSONObject = new JSONObject();
                if (followInfo == null) {
                    i2 = 0;
                } else {
                    i2 = followInfo.getShareId();
                }
                jSONObject.put("share_id", i2);
                if (j > 0) {
                    j3 = j;
                }
                jSONObject.put("doc_create", j3);
                jSONObject.put("initial_action", j2);
                jSONObject.put("jssdk_ready", 0);
                jSONObject.put("inject_strategies", 0);
                jSONObject.put("is_aborted", i);
                jSONObject.put("from_source", f160945a);
                if (!C61806b.m241471a(followInfo)) {
                    i3 = 0;
                }
                jSONObject.put("is_presenter", i3);
                jSONObject.put("meeting_id", kVar.mo212055d());
                C63682b.m249642a("vc_meeting_magic_share_init_track", jSONObject);
            } catch (JSONException e) {
                C60700b.m235846a("FollowLoadingTimeEvent", "sendFollowLoadingTimeEvent", e);
            }
        }
    }

    /* renamed from: a */
    public static void m250387a(C61303k kVar, FollowInfo followInfo, String str) {
        int i;
        int i2;
        if (kVar != null && kVar.mo212056e() != null) {
            try {
                synchronized ("FollowLoadingTimeEvent") {
                    long j = 0;
                    if (f160954j.size() == 0) {
                        f160954j.add(0L);
                    }
                    int size = f160954j.size();
                    Long[] lArr = (Long[]) f160954j.toArray(new Long[size]);
                    Arrays.sort(lArr);
                    for (int i3 = 0; i3 < size; i3++) {
                        j += lArr[i3].longValue();
                    }
                    JSONObject jSONObject = new JSONObject();
                    if (followInfo == null) {
                        i = 0;
                    } else {
                        i = followInfo.getShareId();
                    }
                    jSONObject.put("share_id", i);
                    jSONObject.put(ShareHitPoint.f121869d, str);
                    if (followInfo != null) {
                        if (followInfo.getStrategies() != null) {
                            i2 = followInfo.getStrategies().get(0).getId();
                            jSONObject.put("strategy", i2);
                            jSONObject.put("ave_cost", j / ((long) size));
                            jSONObject.put("min_cost", lArr[0]);
                            jSONObject.put("max_cost", lArr[size - 1]);
                            double d = (double) size;
                            jSONObject.put("mid_cost", lArr[((int) Math.round(0.5d * d)) - 1]);
                            jSONObject.put("pct80_cost", lArr[((int) Math.round(0.8d * d)) - 1]);
                            jSONObject.put("pct90_cost", lArr[((int) Math.round(0.9d * d)) - 1]);
                            jSONObject.put("pct95_cost", lArr[((int) Math.round(d * 0.95d)) - 1]);
                            jSONObject.put("meeting_id", kVar.mo212055d());
                            C63682b.m249642a("vc_meeting_magic_share_stat", jSONObject);
                            f160954j.clear();
                        }
                    }
                    i2 = 0;
                    jSONObject.put("strategy", i2);
                    jSONObject.put("ave_cost", j / ((long) size));
                    jSONObject.put("min_cost", lArr[0]);
                    jSONObject.put("max_cost", lArr[size - 1]);
                    double d2 = (double) size;
                    jSONObject.put("mid_cost", lArr[((int) Math.round(0.5d * d2)) - 1]);
                    jSONObject.put("pct80_cost", lArr[((int) Math.round(0.8d * d2)) - 1]);
                    jSONObject.put("pct90_cost", lArr[((int) Math.round(0.9d * d2)) - 1]);
                    jSONObject.put("pct95_cost", lArr[((int) Math.round(d2 * 0.95d)) - 1]);
                    jSONObject.put("meeting_id", kVar.mo212055d());
                    C63682b.m249642a("vc_meeting_magic_share_stat", jSONObject);
                    f160954j.clear();
                }
            } catch (JSONException e) {
                C60700b.m235846a("FollowLoadingTimeEvent", "sendFollowConnectTimeEvent", e);
            }
        }
    }

    /* renamed from: a */
    private static void m250388a(String str, JSONObject jSONObject, VideoChat videoChat) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("action_name", str);
            if (jSONObject != null) {
                jSONObject2.put("extend_value", jSONObject);
            }
            C63726b.m249915a("vc_meeting_page_onthecall", jSONObject2, videoChat);
        } catch (JSONException e) {
            C60700b.m235846a("FollowLoadingTimeEvent", "sendFollowEvent", e);
        }
    }
}
