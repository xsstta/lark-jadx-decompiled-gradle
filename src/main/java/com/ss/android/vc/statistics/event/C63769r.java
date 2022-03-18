package com.ss.android.vc.statistics.event;

import android.text.TextUtils;
import com.bytedance.ee.bear.doc.follow.impl.rn.RNFollowEvent;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60735ab;
import com.ss.android.vc.common.p3083e.C60742af;
import com.ss.android.vc.entity.follow.FollowInfo;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.follow.p3121b.C61773a;
import com.ss.android.vc.service.impl.C63682b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.vc.statistics.event.r */
public class C63769r {

    /* renamed from: a */
    private static Map<String, ArrayList<Long>> f160917a = new HashMap();

    /* renamed from: b */
    private static Map<String, ArrayList<Long>> f160918b = new HashMap();

    /* renamed from: c */
    private static Map<String, String> f160919c = new HashMap();

    /* renamed from: d */
    private static Map<String, Boolean> f160920d = new HashMap();

    /* renamed from: e */
    private static Map<String, String> f160921e = new HashMap();

    /* renamed from: f */
    private static Set<String> f160922f = new HashSet();

    /* renamed from: g */
    private static Set<String> f160923g = new HashSet();

    /* renamed from: h */
    private static int f160924h = 0;

    /* renamed from: i */
    private static int f160925i = 0;

    /* renamed from: j */
    private static int f160926j = 0;

    /* renamed from: k */
    private static Map<String, Integer> f160927k = new HashMap();

    /* renamed from: l */
    private static Map<String, Integer> f160928l = new HashMap();

    /* renamed from: m */
    private static Map<String, Integer> f160929m = new HashMap();

    /* renamed from: n */
    private static Map<String, Integer> f160930n = new HashMap();

    /* renamed from: a */
    private static void m250344a(Map<String, Integer> map, String str) {
        map.put(str, Integer.valueOf((map.containsKey(str) ? map.get(str).intValue() : 0) + 1));
    }

    /* renamed from: a */
    private static void m250336a() {
        f160917a.clear();
        f160918b.clear();
        f160919c.clear();
        f160920d.clear();
        f160921e.clear();
        f160922f.clear();
        f160923g.clear();
        f160927k.clear();
        f160928l.clear();
        f160929m.clear();
        f160930n.clear();
        f160924h = 0;
        f160925i = 0;
        f160926j = 0;
    }

    /* renamed from: a */
    private static void m250339a(Runnable runnable) {
        if (Thread.currentThread().getId() == C60735ab.m236017e().getLooper().getThread().getId()) {
            runnable.run();
        } else {
            C60735ab.m236017e().post(runnable);
        }
    }

    /* renamed from: a */
    public static void m250338a(C61303k kVar, FollowInfo followInfo) {
        m250339a(new Runnable(followInfo) {
            /* class com.ss.android.vc.statistics.event.$$Lambda$r$aeXgot8NWFN7sGaQ0uvIX2nyg1E */
            public final /* synthetic */ FollowInfo f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C63769r.m250357e(C61303k.this, this.f$1);
            }
        });
    }

    /* renamed from: a */
    public static void m250337a(RNFollowEvent rNFollowEvent, C61773a aVar) {
        if (rNFollowEvent != null && !TextUtils.isEmpty(rNFollowEvent.dataJson)) {
            m250339a(new Runnable(aVar) {
                /* class com.ss.android.vc.statistics.event.$$Lambda$r$kmaCuN5gvEc79bvgly43fFEuxfs */
                public final /* synthetic */ C61773a f$1;

                {
                    this.f$1 = r2;
                }

                public final void run() {
                    C63769r.m250354d(RNFollowEvent.this, this.f$1);
                }
            });
        }
    }

    /* renamed from: b */
    private static int m250345b(Map<String, Integer> map, String str) {
        if (map.containsKey(str)) {
            return map.get(str).intValue();
        }
        return 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static /* synthetic */ void m250357e(C61303k kVar, FollowInfo followInfo) {
        if (!f160919c.isEmpty()) {
            m250347b(kVar, followInfo);
            m250355d(kVar, followInfo);
            m250352c(kVar, followInfo);
            m250336a();
        }
    }

    /* renamed from: b */
    public static void m250346b(RNFollowEvent rNFollowEvent, C61773a aVar) {
        if (rNFollowEvent != null && !TextUtils.isEmpty(rNFollowEvent.dataJson)) {
            m250339a(new Runnable(aVar) {
                /* class com.ss.android.vc.statistics.event.$$Lambda$r$bfFz5D1pbTT_ZVF0LTCZfMt2bxI */
                public final /* synthetic */ C61773a f$1;

                {
                    this.f$1 = r2;
                }

                public final void run() {
                    C63769r.m250351c(RNFollowEvent.this, this.f$1);
                }
            });
        }
    }

    /* renamed from: b */
    private static void m250347b(C61303k kVar, FollowInfo followInfo) {
        String str;
        int i;
        try {
            JSONObject jSONObject = new JSONObject();
            String str2 = "";
            if (followInfo == null || followInfo.getStrategies() == null) {
                str = str2;
            } else {
                str = followInfo.getStrategies().get(0).getId();
            }
            jSONObject.put("strategy", str);
            if (followInfo == null) {
                i = 0;
            } else {
                i = followInfo.getShareId();
            }
            jSONObject.put("share_id", i);
            if (kVar != null) {
                str2 = kVar.mo212055d();
            }
            jSONObject.put("meeting_id", str2);
            jSONObject.put("received", f160924h);
            jSONObject.put("failed", f160925i);
            jSONObject.put("ignored", f160926j);
            jSONObject.put("name", "before-dispatch");
            C63682b.m249642a("vc_meeting_magic_share_action_consume_stat", jSONObject);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    private static void m250340a(String str, long j) {
        if (!f160917a.containsKey(str)) {
            f160917a.put(str, new ArrayList<>());
        }
        f160917a.get(str).add(Long.valueOf(j));
    }

    /* renamed from: b */
    private static void m250348b(String str, long j) {
        if (!f160918b.containsKey(str)) {
            f160918b.put(str, new ArrayList<>());
        }
        f160918b.get(str).add(Long.valueOf(j));
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static /* synthetic */ void m250351c(RNFollowEvent rNFollowEvent, C61773a aVar) {
        try {
            JSONArray jSONArray = new JSONArray(rNFollowEvent.dataJson);
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = (JSONObject) jSONArray.get(i);
                String optString = jSONObject.optString("uuid");
                String optString2 = jSONObject.optString("timestamp");
                String optString3 = jSONObject.optString(ShareHitPoint.f121869d);
                String optString4 = jSONObject.optString("moduleName");
                if (TextUtils.isEmpty(optString4)) {
                    optString4 = f160921e.get(optString);
                }
                if (TextUtils.isEmpty(optString4)) {
                    optString4 = "default";
                }
                String optString5 = jSONObject.optString("reason", "");
                if (TextUtils.equals(optString3, "received")) {
                    m250342a(optString, optString2, optString4);
                } else if (TextUtils.equals(optString3, "dispatched")) {
                    m250349b(optString, optString2, optString4);
                } else if (TextUtils.equals(optString3, "applied")) {
                    m250353c(optString, optString2, optString4);
                } else if (TextUtils.equals(optString3, "ignored")) {
                    m250350b(optString, optString2, optString4, optString5);
                } else if (TextUtils.equals(optString3, "failed")) {
                    m250343a(optString, optString2, optString4, optString5);
                }
                if (aVar != null) {
                    aVar.d_(optString4, optString3);
                }
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static /* synthetic */ void m250354d(RNFollowEvent rNFollowEvent, C61773a aVar) {
        try {
            JSONObject jSONObject = (JSONObject) new JSONArray(rNFollowEvent.dataJson).get(0);
            String optString = jSONObject.optString("uuid");
            String optString2 = jSONObject.optString("timestamp");
            String optString3 = jSONObject.optString(ShareHitPoint.f121869d);
            String optString4 = jSONObject.optString("moduleName");
            if (TextUtils.isEmpty(optString4)) {
                optString4 = f160921e.get(optString);
            }
            if (TextUtils.isEmpty(optString4)) {
                optString4 = "default";
            }
            String optString5 = jSONObject.optString("reason", "");
            if (TextUtils.equals(optString3, "received")) {
                m250342a(optString, optString2, optString4);
            } else if (TextUtils.equals(optString3, "dispatched")) {
                m250349b(optString, optString2, optString4);
            } else if (TextUtils.equals(optString3, "applied")) {
                m250353c(optString, optString2, optString4);
            } else if (TextUtils.equals(optString3, "ignored")) {
                m250350b(optString, optString2, optString4, optString5);
            } else if (TextUtils.equals(optString3, "failed")) {
                m250343a(optString, optString2, optString4, optString5);
            }
            if (aVar != null) {
                aVar.d_(optString4, optString3);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m250341a(String str, String str2) {
        if (f160919c.containsKey(str)) {
            if (f160920d.containsKey(str)) {
                m250344a(f160929m, str2);
                f160923g.add(str2);
            } else {
                f160926j++;
            }
        }
        f160919c.remove(str);
        f160920d.remove(str);
        f160921e.remove(str);
        f160922f.add(str2);
    }

    /* renamed from: c */
    private static void m250352c(C61303k kVar, FollowInfo followInfo) {
        String str;
        int i;
        if (!f160917a.containsKey("NotImplemented")) {
            f160917a.put("NotImplemented", new ArrayList<>());
        }
        if (!f160927k.containsKey("NotImplemented")) {
            f160927k.put("NotImplemented", 0);
        }
        if (!f160928l.containsKey("NotImplemented")) {
            f160928l.put("NotImplemented", 0);
        }
        if (!f160929m.containsKey("NotImplemented")) {
            f160929m.put("NotImplemented", 0);
        }
        if (!f160930n.containsKey("NotImplemented")) {
            f160930n.put("NotImplemented", 0);
        }
        f160922f.removeAll(f160923g);
        for (String str2 : f160922f) {
            if (!C60742af.m236059a(f160917a.get(str2))) {
                f160917a.get("NotImplemented").addAll(f160917a.get(str2));
            }
            Map<String, Integer> map = f160927k;
            map.put("NotImplemented", Integer.valueOf(map.get("NotImplemented").intValue() + m250345b(f160927k, str2)));
            Map<String, Integer> map2 = f160928l;
            map2.put("NotImplemented", Integer.valueOf(map2.get("NotImplemented").intValue() + m250345b(f160928l, str2)));
            Map<String, Integer> map3 = f160929m;
            map3.put("NotImplemented", Integer.valueOf(map3.get("NotImplemented").intValue() + m250345b(f160929m, str2)));
            Map<String, Integer> map4 = f160930n;
            map4.put("NotImplemented", Integer.valueOf(map4.get("NotImplemented").intValue() + m250345b(f160930n, str2)));
        }
        try {
            JSONObject jSONObject = new JSONObject();
            String str3 = "";
            if (followInfo == null || followInfo.getStrategies() == null) {
                str = str3;
            } else {
                str = followInfo.getStrategies().get(0).getId();
            }
            jSONObject.put("strategy", str);
            if (followInfo == null) {
                i = 0;
            } else {
                i = followInfo.getShareId();
            }
            jSONObject.put("share_id", i);
            if (kVar != null) {
                str3 = kVar.mo212055d();
            }
            jSONObject.put("meeting_id", str3);
            jSONObject.put("name", "NotImplemented");
            int intValue = f160927k.get("NotImplemented").intValue();
            int intValue2 = f160928l.get("NotImplemented").intValue();
            int intValue3 = f160929m.get("NotImplemented").intValue();
            int intValue4 = ((intValue - intValue2) - intValue3) - f160930n.get("NotImplemented").intValue();
            if (intValue4 < 0) {
                intValue4 = 0;
            }
            jSONObject.put("received", intValue);
            jSONObject.put("failed", intValue2);
            jSONObject.put("ignored", intValue3);
            jSONObject.put("missed", intValue4);
            long j = 0;
            if (f160917a.get("NotImplemented").size() == 0) {
                f160917a.get("NotImplemented").add(0L);
            }
            int size = f160917a.get("NotImplemented").size();
            Long[] lArr = (Long[]) f160917a.get("NotImplemented").toArray(new Long[size]);
            Arrays.sort(lArr);
            for (int i2 = 0; i2 < size; i2++) {
                j += lArr[i2].longValue();
            }
            jSONObject.put("dispatch_ave_cost", (double) (((float) j) / ((float) size)));
            jSONObject.put("dispatch_min_cost", lArr[0]);
            jSONObject.put("dispatch_max_cost", lArr[size - 1]);
            double d = (double) size;
            jSONObject.put("dispatch_mid_cost", lArr[((int) Math.round(0.5d * d)) - 1]);
            jSONObject.put("dispatch_pct80_cost", lArr[((int) Math.round(0.8d * d)) - 1]);
            jSONObject.put("dispatch_pct90_cost", lArr[((int) Math.round(0.9d * d)) - 1]);
            jSONObject.put("dispatch_pct95_cost", lArr[((int) Math.round(d * 0.95d)) - 1]);
            jSONObject.put("dispatch_total", size);
            C63682b.m249642a("vc_meeting_magic_share_action_consume_stat", jSONObject);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: d */
    private static void m250355d(C61303k kVar, FollowInfo followInfo) {
        String str;
        int i;
        for (String str2 : f160923g) {
            if (!f160917a.containsKey(str2)) {
                f160917a.put(str2, new ArrayList<>());
            }
            if (!f160918b.containsKey(str2)) {
                f160918b.put(str2, new ArrayList<>());
            }
            if (!f160927k.containsKey(str2)) {
                f160927k.put(str2, 0);
            }
            if (!f160928l.containsKey(str2)) {
                f160928l.put(str2, 0);
            }
            if (!f160929m.containsKey(str2)) {
                f160929m.put(str2, 0);
            }
            if (!f160930n.containsKey(str2)) {
                f160930n.put(str2, 0);
            }
            try {
                JSONObject jSONObject = new JSONObject();
                String str3 = "";
                if (followInfo == null || followInfo.getStrategies() == null) {
                    str = str3;
                } else {
                    str = followInfo.getStrategies().get(0).getId();
                }
                jSONObject.put("strategy", str);
                if (followInfo == null) {
                    i = 0;
                } else {
                    i = followInfo.getShareId();
                }
                jSONObject.put("share_id", i);
                if (kVar != null) {
                    str3 = kVar.mo212055d();
                }
                jSONObject.put("meeting_id", str3);
                jSONObject.put("name", str2);
                int intValue = f160927k.get(str2).intValue();
                int intValue2 = f160928l.get(str2).intValue();
                int intValue3 = f160929m.get(str2).intValue();
                int intValue4 = ((intValue - intValue2) - intValue3) - f160930n.get(str2).intValue();
                if (intValue4 < 0) {
                    intValue4 = 0;
                }
                jSONObject.put("received", intValue);
                jSONObject.put("failed", intValue2);
                jSONObject.put("ignored", intValue3);
                jSONObject.put("missed", intValue4);
                long j = 0;
                if (f160917a.get(str2).size() == 0) {
                    f160917a.get(str2).add(0L);
                }
                int size = f160917a.get(str2).size();
                Long[] lArr = (Long[]) f160917a.get(str2).toArray(new Long[size]);
                Arrays.sort(lArr);
                long j2 = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    j2 += lArr[i2].longValue();
                }
                jSONObject.put("dispatch_ave_cost", (double) (((float) j2) / ((float) size)));
                jSONObject.put("dispatch_min_cost", lArr[0]);
                jSONObject.put("dispatch_max_cost", lArr[size - 1]);
                double d = (double) size;
                jSONObject.put("dispatch_mid_cost", lArr[((int) Math.round(d * 0.5d)) - 1]);
                jSONObject.put("dispatch_pct80_cost", lArr[((int) Math.round(d * 0.8d)) - 1]);
                jSONObject.put("dispatch_pct90_cost", lArr[((int) Math.round(d * 0.9d)) - 1]);
                jSONObject.put("dispatch_pct95_cost", lArr[((int) Math.round(d * 0.95d)) - 1]);
                jSONObject.put("dispatch_total", size);
                if (f160918b.get(str2).size() == 0) {
                    f160918b.get(str2).add(0L);
                }
                int size2 = f160918b.get(str2).size();
                Long[] lArr2 = (Long[]) f160918b.get(str2).toArray(new Long[size2]);
                Arrays.sort(lArr2);
                for (int i3 = 0; i3 < size2; i3++) {
                    j += lArr2[i3].longValue();
                }
                jSONObject.put("apply_ave_cost", (double) (((float) j) / ((float) size2)));
                jSONObject.put("apply_min_cost", lArr2[0]);
                jSONObject.put("apply_max_cost", lArr2[size2 - 1]);
                double d2 = (double) size2;
                jSONObject.put("apply_mid_cost", lArr2[((int) Math.round(0.5d * d2)) - 1]);
                jSONObject.put("apply_pct80_cost", lArr2[((int) Math.round(0.8d * d2)) - 1]);
                jSONObject.put("apply_pct90_cost", lArr2[((int) Math.round(0.9d * d2)) - 1]);
                jSONObject.put("apply_pct95_cost", lArr2[((int) Math.round(d2 * 0.95d)) - 1]);
                jSONObject.put("apply_total", size2);
                C63682b.m249642a("vc_meeting_magic_share_action_consume_stat", jSONObject);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: b */
    public static void m250349b(String str, String str2, String str3) {
        m250339a(new Runnable(str, str2, str3) {
            /* class com.ss.android.vc.statistics.event.$$Lambda$r$BvOeA5ekcOeeHTKGzHDMZuLzTo */
            public final /* synthetic */ String f$0;
            public final /* synthetic */ String f$1;
            public final /* synthetic */ String f$2;

            {
                this.f$0 = r1;
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void run() {
                C63769r.m250359f(this.f$0, this.f$1, this.f$2);
            }
        });
    }

    /* renamed from: c */
    public static void m250353c(String str, String str2, String str3) {
        m250339a(new Runnable(str, str2, str3) {
            /* class com.ss.android.vc.statistics.event.$$Lambda$r$6NBfUnd03NaLdtg11ujOBFmYrkc */
            public final /* synthetic */ String f$0;
            public final /* synthetic */ String f$1;
            public final /* synthetic */ String f$2;

            {
                this.f$0 = r1;
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void run() {
                C63769r.m250356d(this.f$0, this.f$1, this.f$2);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public static /* synthetic */ void m250360g(String str, String str2, String str3) {
        f160919c.put(str, str2);
        f160921e.put(str, str3);
        f160924h++;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static /* synthetic */ void m250356d(String str, String str2, String str3) {
        long j;
        if (f160919c.containsKey(str)) {
            j = Long.parseLong(str2) - Long.parseLong(f160919c.get(str));
            m250344a(f160930n, str3);
            f160923g.add(str3);
        } else {
            j = 0;
        }
        m250348b(str3, j);
        f160919c.remove(str);
        f160920d.remove(str);
        f160921e.remove(str);
        f160922f.add(str3);
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static /* synthetic */ void m250359f(String str, String str2, String str3) {
        long j;
        if (f160919c.containsKey(str)) {
            j = Long.parseLong(str2) - Long.parseLong(f160919c.get(str));
            m250344a(f160927k, str3);
            f160920d.put(str, true);
        } else {
            j = 0;
        }
        f160922f.add(str3);
        m250340a(str3, j);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static /* synthetic */ void m250358e(String str, String str2, String str3) {
        if (f160919c.containsKey(str)) {
            if (f160920d.containsKey(str)) {
                m250344a(f160928l, str2);
                f160923g.add(str2);
            } else {
                f160925i++;
                C60700b.m235851b("FollowActionLifecycleChangeEvent", "[setFailedTime]", "moduleName:" + str2 + ", fail reason:" + str3);
            }
        }
        f160919c.remove(str);
        f160920d.remove(str);
        f160921e.remove(str);
        f160922f.add(str2);
    }

    /* renamed from: a */
    public static void m250342a(String str, String str2, String str3) {
        m250339a(new Runnable(str, str2, str3) {
            /* class com.ss.android.vc.statistics.event.$$Lambda$r$PHoFFBc52ZS0kXNXBfQLtwINo4 */
            public final /* synthetic */ String f$0;
            public final /* synthetic */ String f$1;
            public final /* synthetic */ String f$2;

            {
                this.f$0 = r1;
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void run() {
                C63769r.m250360g(this.f$0, this.f$1, this.f$2);
            }
        });
    }

    /* renamed from: b */
    public static void m250350b(String str, String str2, String str3, String str4) {
        m250339a(new Runnable(str, str3) {
            /* class com.ss.android.vc.statistics.event.$$Lambda$r$_Gt1Yvbun4FGhSEnI_MfGvM93pg */
            public final /* synthetic */ String f$0;
            public final /* synthetic */ String f$1;

            {
                this.f$0 = r1;
                this.f$1 = r2;
            }

            public final void run() {
                C63769r.m250341a(this.f$0, this.f$1);
            }
        });
    }

    /* renamed from: a */
    public static void m250343a(String str, String str2, String str3, String str4) {
        m250339a(new Runnable(str, str3, str4) {
            /* class com.ss.android.vc.statistics.event.$$Lambda$r$Pz8ZNnxHodulJ1TyicJXqAxUM */
            public final /* synthetic */ String f$0;
            public final /* synthetic */ String f$1;
            public final /* synthetic */ String f$2;

            {
                this.f$0 = r1;
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void run() {
                C63769r.m250358e(this.f$0, this.f$1, this.f$2);
            }
        });
    }
}
