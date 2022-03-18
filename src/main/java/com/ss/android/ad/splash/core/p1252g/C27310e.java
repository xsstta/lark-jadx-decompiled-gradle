package com.ss.android.ad.splash.core.p1252g;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import com.ss.android.ad.splash.core.C27287e;
import com.ss.android.ad.splash.p1244b.C27234a;
import com.ss.android.ad.splash.utils.C27476f;
import com.ss.android.ad.splash.utils.C27477g;
import com.ss.android.ad.splash.utils.C27480i;
import com.ss.android.ad.splash.utils.NetworkUtils;
import java.util.List;
import java.util.Random;
import java.util.UUID;
import org.json.JSONObject;

/* renamed from: com.ss.android.ad.splash.core.g.e */
public class C27310e implements AbstractC27309d {

    /* renamed from: a */
    public Context f68078a;

    /* renamed from: b */
    public AbstractC27315g f68079b;

    @Override // com.ss.android.ad.splash.core.p1252g.AbstractC27309d
    /* renamed from: a */
    public void mo97353a() {
        if (NetworkUtils.m100276a(this.f68078a)) {
            C27287e.m99212K().submit(new Runnable() {
                /* class com.ss.android.ad.splash.core.p1252g.C27310e.RunnableC273111 */

                public void run() {
                    final List<C27314f> a = C27310e.this.f68079b.mo97370a();
                    new Handler(Looper.getMainLooper()).post(new Runnable() {
                        /* class com.ss.android.ad.splash.core.p1252g.C27310e.RunnableC273111.RunnableC273121 */

                        public void run() {
                            C27310e.this.mo97355a(a);
                        }
                    });
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.ad.splash.core.g.e$a */
    public class AsyncTaskC27313a extends AsyncTask<Void, Void, Void> {

        /* renamed from: b */
        private C27314f f68084b;

        /* renamed from: c */
        private long f68085c;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo97359a(String str) {
            if (TextUtils.isEmpty(str) || (!str.startsWith("http://") && !str.startsWith("https://"))) {
                return false;
            }
            return true;
        }

        /* renamed from: c */
        private String m99345c(String str) {
            if (TextUtils.isEmpty(str)) {
                return str;
            }
            long currentTimeMillis = System.currentTimeMillis();
            this.f68085c = currentTimeMillis;
            if (str.contains("{TS}") || str.contains("__TS__")) {
                return str.replace("{TS}", String.valueOf(currentTimeMillis)).replace("__TS__", String.valueOf(currentTimeMillis));
            }
            return str;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public String mo97360b(String str) {
            if (TextUtils.isEmpty(str)) {
                return str;
            }
            try {
                return str.replace("[ss_random]", String.valueOf(new Random().nextLong())).replace("[ss_timestamp]", String.valueOf(System.currentTimeMillis()));
            } catch (Exception e) {
                e.printStackTrace();
                return str;
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Void doInBackground(Void... voidArr) {
            if (!mo97359a(this.f68084b.mo97364b())) {
                return null;
            }
            if (this.f68084b.mo97366d() == 0) {
                C27310e.this.f68079b.mo97373c(this.f68084b);
                return null;
            }
            boolean z = false;
            while (true) {
                if (this.f68084b.mo97366d() <= 0 || isCancelled()) {
                    break;
                }
                if (this.f68084b.mo97366d() == 5) {
                    C27310e.this.f68079b.mo97371a(this.f68084b);
                }
                if (!NetworkUtils.m100276a(C27310e.this.f68078a)) {
                    break;
                }
                String c = m99345c(this.f68084b.mo97364b());
                int g = this.f68084b.mo97369g();
                if (this.f68084b.mo97365c()) {
                    c = mo97360b(c);
                }
                if (C27287e.m99205D() == null) {
                    return null;
                }
                C27317i a = C27287e.m99205D().mo97106a(c);
                if (a != null) {
                    m99344a(a, c, g);
                    if (a.mo97374a() >= 200 && a.mo97374a() < 300) {
                        z = true;
                    }
                }
                if (z) {
                    C27310e.this.f68079b.mo97373c(this.f68084b);
                    C27477g.m100328b("SplashAdSdk", "track success : " + this.f68084b.mo97364b());
                    break;
                }
                C27477g.m100328b("SplashAdSdk", "track fail : " + this.f68084b.mo97364b());
                C27314f fVar = this.f68084b;
                fVar.mo97363a(fVar.mo97366d() - 1);
                if (this.f68084b.mo97366d() == 0) {
                    C27310e.this.f68079b.mo97373c(this.f68084b);
                    C27477g.m100328b("SplashAdSdk", "track fail and delete : " + this.f68084b.mo97364b());
                    break;
                }
                C27310e.this.f68079b.mo97372b(this.f68084b);
            }
            if (!z) {
                C27310e.this.mo97354a(this.f68084b.mo97364b());
            }
            return null;
        }

        private AsyncTaskC27313a(C27314f fVar) {
            this.f68084b = fVar;
        }

        /* renamed from: a */
        private void m99344a(C27317i iVar, String str, int i) {
            JSONObject jSONObject = new JSONObject();
            C27314f fVar = this.f68084b;
            if (fVar != null && fVar.mo97367e() > 0) {
                try {
                    jSONObject.put("track_url_list", str);
                    jSONObject.put("track_status", iVar.mo97374a());
                    jSONObject.put("ts", this.f68085c);
                    jSONObject.put("local_time_ms", System.currentTimeMillis());
                    if (!C27480i.m100385a(iVar.mo97375b())) {
                        jSONObject.put("user_agent", iVar.mo97375b());
                    } else {
                        jSONObject.put("user_agent", -1);
                    }
                    jSONObject.put("is_ad_event", "1");
                    jSONObject.put("ad_event_type", "monitor");
                    long j = -1;
                    if (C27287e.m99267i() != null && C27287e.m99267i().mo97277e() > 0) {
                        j = C27287e.m99267i().mo97277e();
                    }
                    jSONObject.put("user_id", j);
                    if (!C27480i.m100385a(this.f68084b.mo97368f())) {
                        jSONObject.put("log_extra", this.f68084b.mo97368f());
                    } else {
                        jSONObject.put("log_extra", -1);
                    }
                    String str2 = "";
                    if (i == 1) {
                        str2 = "show";
                    } else if (i == 2) {
                        str2 = "play";
                    } else if (i == 3) {
                        str2 = "click";
                    } else if (i == 4) {
                        str2 = "play_over";
                    }
                    jSONObject.put("track_label", str2);
                    C27287e.m99229a(this.f68084b.mo97367e(), "track_ad", "track_url", jSONObject);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* renamed from: a */
    public void mo97354a(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("key_send_track_url", str);
            C27234a.m98988a().mo97123a("service_ad_send_track_fail", (JSONObject) null, jSONObject);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public void mo97355a(List<C27314f> list) {
        if (C27476f.m100323b(list)) {
            for (C27314f fVar : list) {
                new AsyncTaskC27313a(fVar).executeOnExecutor(C27287e.m99212K(), new Void[0]);
            }
        }
    }

    public C27310e(Context context, AbstractC27315g gVar) {
        this.f68078a = context;
        this.f68079b = gVar;
    }

    /* renamed from: a */
    private void m99335a(long j, String str, List<String> list, boolean z, int i) {
        if (C27476f.m100323b(list)) {
            for (String str2 : list) {
                new AsyncTaskC27313a(new C27314f(j, str, UUID.randomUUID().toString(), str2, z, 5, i)).executeOnExecutor(C27287e.m99212K(), new Void[0]);
            }
        }
    }

    @Override // com.ss.android.ad.splash.core.p1252g.AbstractC27306b
    /* renamed from: a */
    public void mo97346a(View view, long j, List<String> list, String str, boolean z, long j2, JSONObject jSONObject, C27307c cVar) {
        m99335a(j, str, list, true, 1);
    }

    @Override // com.ss.android.ad.splash.core.p1252g.AbstractC27306b
    /* renamed from: c */
    public void mo97349c(View view, long j, List<String> list, String str, boolean z, long j2, JSONObject jSONObject, C27307c cVar) {
        m99335a(j, str, list, true, 2);
    }

    @Override // com.ss.android.ad.splash.core.p1252g.AbstractC27306b
    /* renamed from: d */
    public void mo97350d(View view, long j, List<String> list, String str, boolean z, long j2, JSONObject jSONObject, C27307c cVar) {
        m99335a(j, str, list, true, 4);
    }

    @Override // com.ss.android.ad.splash.core.p1252g.AbstractC27306b
    /* renamed from: b */
    public void mo97348b(View view, long j, List<String> list, String str, boolean z, long j2, JSONObject jSONObject, C27307c cVar) {
        m99335a(j, str, list, true, 3);
        C27287e.m99218Q().mo97344e();
    }

    @Override // com.ss.android.ad.splash.core.p1252g.AbstractC27306b
    /* renamed from: a */
    public void mo97347a(View view, String str, long j, List<String> list, String str2, boolean z, long j2, JSONObject jSONObject, C27307c cVar) {
        int i;
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1877652737:
                if (str.equals("play_over")) {
                    c = 0;
                    break;
                }
                break;
            case 3443508:
                if (str.equals("play")) {
                    c = 1;
                    break;
                }
                break;
            case 3529469:
                if (str.equals("show")) {
                    c = 2;
                    break;
                }
                break;
            case 94750088:
                if (str.equals("click")) {
                    c = 3;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                i = 4;
                break;
            case 1:
                i = 2;
                break;
            case 2:
                i = 1;
                break;
            case 3:
                i = 3;
                break;
            default:
                i = 0;
                break;
        }
        m99335a(j, str2, list, true, i);
    }
}
