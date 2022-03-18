package com.bytedance.apm.p143i.p147c;

import android.app.Activity;
import android.content.SharedPreferences;
import com.bytedance.apm.C2785b;
import com.bytedance.apm.C3013j;
import com.bytedance.apm.p124a.p126b.C2753f;
import com.bytedance.apm.p138d.AbstractC2919f;
import com.bytedance.apm.p143i.AbstractC2946a;
import com.bytedance.apm.p143i.p147c.C2960a;
import com.bytedance.apm.p153n.C3047b;
import com.bytedance.apm.util.C3130n;
import com.huawei.hms.location.LocationRequest;
import com.ss.android.lark.mm.module.participant.ParticipantRepo;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.i.c.f */
public class C2973f extends AbstractC2946a {

    /* renamed from: n */
    private static int f9550n = 0;

    /* renamed from: o */
    private static int f9551o = 1;

    /* renamed from: p */
    private static int f9552p = 2;

    /* renamed from: r */
    private static String f9553r = "bg_never_front";

    /* renamed from: a */
    public Map<String, C3130n<Long, Long>> f9554a;

    /* renamed from: b */
    public C2977g f9555b;

    /* renamed from: c */
    private long f9556c;

    /* renamed from: d */
    private long f9557d;

    /* renamed from: e */
    private long f9558e;

    /* renamed from: f */
    private long f9559f;

    /* renamed from: g */
    private long f9560g;

    /* renamed from: h */
    private long f9561h;

    /* renamed from: i */
    private long f9562i;

    /* renamed from: j */
    private long f9563j;

    /* renamed from: m */
    private long f9564m;

    /* renamed from: q */
    private int f9565q;

    /* renamed from: s */
    private long f9566s;

    /* renamed from: t */
    private long f9567t;

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.apm.i.c.f$a */
    public static class C2976a {

        /* renamed from: a */
        public static final C2973f f9573a = new C2973f();
    }

    /* renamed from: a */
    public static void m12512a(AbstractC2919f fVar) {
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.apm.p143i.AbstractC2946a
    /* renamed from: c */
    public boolean mo12101c() {
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.apm.p143i.AbstractC2946a
    /* renamed from: d */
    public long mo12102d() {
        return 600000;
    }

    /* renamed from: a */
    public static C2973f m12511a() {
        return C2976a.f9573a;
    }

    private C2973f() {
        this.f9556c = 500000000;
        this.f9557d = 1;
        this.f9558e = -1;
        this.f9565q = f9550n;
        this.f9459k = "traffic";
        C2977g a = C2977g.m12520a();
        this.f9555b = a;
        a.mo12714a(mo12652n());
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.apm.p143i.AbstractC2946a
    /* renamed from: b */
    public void mo12123b() {
        C2973f fVar;
        SharedPreferences sharedPreferences;
        SharedPreferences sharedPreferences2 = C2785b.m11735a().getSharedPreferences("traffic_monitor_info", 0);
        long j = sharedPreferences2.getLong("init", -1);
        long j2 = sharedPreferences2.getLong("init_ts", 0);
        if (j > -1) {
            long j3 = sharedPreferences2.getLong("usage", 0);
            long j4 = sharedPreferences2.getLong("usage_ts", 0);
            long j5 = j3 - j;
            if (j5 > 0) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("total_usage", j5);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("total_usage_duration", ((j4 - j2) / 1000) / 60);
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("init_ts", j2);
                    jSONObject3.put("usage_ts", j4);
                    sharedPreferences = sharedPreferences2;
                    try {
                        jSONObject3.put("biz_usage", sharedPreferences.getLong("biz_usage", 0));
                        jSONObject3.put("init", j);
                        jSONObject3.put("usage", j3);
                        String string = sharedPreferences.getString("biz_json", "");
                        if (string != "") {
                            JSONObject jSONObject4 = new JSONObject();
                            jSONObject4.put("usage", new JSONArray(string));
                            jSONObject3.put("detail", jSONObject4);
                        }
                        C2753f fVar2 = new C2753f();
                        fVar = this;
                        try {
                            fVar2.mo11818a(fVar.f9459k).mo11819b(jSONObject).mo11820c(jSONObject2).mo11822e(jSONObject3);
                            fVar.mo12646a(fVar2);
                        } catch (JSONException unused) {
                        }
                    } catch (JSONException unused2) {
                        fVar = this;
                    }
                } catch (JSONException unused3) {
                }
            }
            fVar = this;
            sharedPreferences = sharedPreferences2;
        } else {
            fVar = this;
            sharedPreferences = sharedPreferences2;
        }
        fVar.f9564m = fVar.f9555b.mo12721h();
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putLong("init", fVar.f9564m);
        edit.putLong("init_ts", System.currentTimeMillis());
        edit.putLong("usage", 0);
        edit.apply();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x0124 */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0193  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x02ea A[LOOP:3: B:86:0x02e4->B:88:0x02ea, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0310  */
    @Override // com.bytedance.apm.p143i.AbstractC2946a
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo12103e() {
        /*
        // Method dump skipped, instructions count: 853
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.apm.p143i.p147c.C2973f.mo12103e():void");
    }

    @Override // com.bytedance.apm.p143i.AbstractC2946a, com.bytedance.services.apm.api.AbstractC20698c
    public void onBackground(Activity activity) {
        super.onBackground(activity);
        this.f9555b.mo12714a(true);
    }

    @Override // com.bytedance.apm.p143i.AbstractC2946a, com.bytedance.services.apm.api.AbstractC20698c
    public void onFront(Activity activity) {
        super.onFront(activity);
        f9553r = "bg_ever_front";
        this.f9555b.mo12714a(false);
    }

    /* renamed from: a */
    public synchronized void mo12710a(final String str) {
        C3047b.m12756a().mo12886a(new Runnable() {
            /* class com.bytedance.apm.p143i.p147c.C2973f.RunnableC29752 */

            public void run() {
                if (C2973f.this.f9554a != null && C2973f.this.f9554a.containsKey(str)) {
                    long longValue = C2973f.this.f9554a.get(str).f10052a.longValue();
                    long h = C2973f.this.f9555b.mo12721h() - C2973f.this.f9554a.get(str).f10053b.longValue();
                    C2973f.this.f9554a.remove(str);
                    if (h < 0) {
                        C2960a.m12448a().mo12679b(str);
                        return;
                    }
                    Map<String, C2960a.C2964a> c = C2960a.m12448a().mo12681c(str);
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("init_ts", longValue);
                        jSONObject.put("usage_ts", System.currentTimeMillis());
                        if (c != null && c.size() > 0) {
                            JSONObject jSONObject2 = new JSONObject();
                            JSONArray jSONArray = new JSONArray();
                            try {
                                for (Map.Entry<String, C2960a.C2964a> entry : c.entrySet()) {
                                    jSONArray.put(entry.getValue().mo12687a());
                                }
                                jSONObject2.put("usage", jSONArray);
                                jSONObject.put("detail", jSONObject2);
                            } catch (JSONException unused) {
                            }
                        }
                        C2960a.m12448a().mo12679b(str);
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put(str, h);
                        C2753f fVar = new C2753f();
                        fVar.mo11818a(C2973f.this.f9459k).mo11819b(jSONObject3).mo11822e(jSONObject);
                        C2973f.this.mo12646a(fVar);
                    } catch (JSONException e) {
                        C3013j.m12658a().mo12827a(e, "apm_error");
                    }
                }
            }
        });
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.apm.p143i.AbstractC2946a
    /* renamed from: a */
    public void mo12099a(JSONObject jSONObject) {
        super.mo12099a(jSONObject);
        boolean z = false;
        if (jSONObject.optInt("cause_analysis", 0) == 1) {
            z = true;
        }
        if (z) {
            C2960a.m12448a().mo12678b();
            this.f9556c = (long) (jSONObject.optInt("exception_threshold_mb", ParticipantRepo.f117150c) * 1000 * 1000);
            this.f9557d = (long) (jSONObject.optInt("exception_threshold_bg_mb", ParticipantRepo.f117150c) * 1000 * 1000);
            this.f9566s = (long) jSONObject.optInt("high_freq_threshold", LocationRequest.PRIORITY_HD_ACCURACY);
            C2960a.m12448a().mo12672a(jSONObject.optDouble("large_usage_threshold_mb", 10.0d) * 1000.0d * 1000.0d);
        }
    }

    /* renamed from: a */
    public synchronized void mo12711a(final String str, final boolean z) {
        C3047b.m12756a().mo12886a(new Runnable() {
            /* class com.bytedance.apm.p143i.p147c.C2973f.RunnableC29741 */

            public void run() {
                if (C2973f.this.f9554a == null) {
                    C2973f.this.f9554a = new HashMap();
                }
                C2973f.this.f9554a.put(str, new C3130n<>(Long.valueOf(System.currentTimeMillis()), Long.valueOf(C2973f.this.f9555b.mo12721h())));
                if (z) {
                    C2960a.m12448a().mo12674a(str);
                }
            }
        });
    }
}
