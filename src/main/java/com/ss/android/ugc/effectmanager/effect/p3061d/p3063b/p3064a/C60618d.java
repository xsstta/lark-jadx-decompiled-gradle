package com.ss.android.ugc.effectmanager.effect.p3061d.p3063b.p3064a;

import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.ss.android.ugc.effectmanager.C60549e;
import com.ss.android.ugc.effectmanager.common.C60499b;
import com.ss.android.ugc.effectmanager.common.EffectConstants;
import com.ss.android.ugc.effectmanager.common.cachemanager.ICache;
import com.ss.android.ugc.effectmanager.common.logger.EPLog;
import com.ss.android.ugc.effectmanager.common.p3048c.AbstractC60510b;
import com.ss.android.ugc.effectmanager.common.p3048c.AbstractC60511c;
import com.ss.android.ugc.effectmanager.common.p3052g.C60519c;
import com.ss.android.ugc.effectmanager.common.p3053h.C60529g;
import com.ss.android.ugc.effectmanager.common.p3053h.C60532k;
import com.ss.android.ugc.effectmanager.common.p3053h.C60537p;
import com.ss.android.ugc.effectmanager.common.task.NormalTask;
import com.ss.android.ugc.effectmanager.common.utils.EffectRequestUtil;
import com.ss.android.ugc.effectmanager.effect.model.net.CategoryEffectListResponse;
import com.ss.android.ugc.effectmanager.effect.p3061d.p3062a.C60599g;
import com.ss.android.ugc.effectmanager.p3043b.C60483a;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.effectmanager.effect.d.b.a.d */
public class C60618d extends NormalTask {

    /* renamed from: a */
    private C60483a f151571a;

    /* renamed from: b */
    private C60549e f151572b;

    /* renamed from: c */
    private ICache f151573c;

    /* renamed from: d */
    private AbstractC60510b f151574d = this.f151572b.mo207331p();

    /* renamed from: e */
    private AbstractC60511c f151575e = this.f151572b.mo207339x();

    /* renamed from: f */
    private String f151576f;

    /* renamed from: g */
    private int f151577g = this.f151572b.mo207327l();

    /* renamed from: h */
    private String f151578h;

    /* renamed from: i */
    private int f151579i;

    /* renamed from: j */
    private int f151580j;

    /* renamed from: k */
    private int f151581k;

    /* renamed from: l */
    private String f151582l;

    /* renamed from: m */
    private String f151583m;

    /* renamed from: n */
    private String f151584n;

    /* renamed from: o */
    private String f151585o;

    /* renamed from: p */
    private long f151586p;

    /* renamed from: q */
    private int f151587q = this.f151572b.mo207310A();

    /* renamed from: c */
    private C60499b m235537c() {
        String str;
        HashMap<String, String> a = EffectRequestUtil.f151340a.mo207238a(this.f151572b);
        if (!TextUtils.isEmpty(this.f151576f)) {
            a.put("panel", this.f151576f);
        }
        a.put("category", this.f151578h);
        a.put("cursor", String.valueOf(this.f151580j));
        a.put("count", String.valueOf(this.f151579i));
        a.put("sorting_position", String.valueOf(this.f151581k));
        a.put(HiAnalyticsConstant.HaKey.BI_KEY_VERSION, String.valueOf(this.f151582l));
        String s = this.f151572b.mo207334s();
        if (!TextUtils.isEmpty(s)) {
            a.put("test_status", s);
        }
        this.f151584n = this.f151571a.mo207067b();
        StringBuilder sb = new StringBuilder();
        sb.append(this.f151584n);
        sb.append(this.f151572b.mo207325j());
        if (this.f151587q == 2) {
            str = "/category/effects/v2";
        } else {
            str = "/category/effects";
        }
        sb.append(str);
        String a2 = C60537p.m235320a(a, sb.toString());
        this.f151583m = a2;
        try {
            this.f151585o = InetAddress.getByName(new URL(a2).getHost()).getHostAddress();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (MalformedURLException e2) {
            e2.printStackTrace();
        }
        return new C60499b("GET", a2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0197, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0198, code lost:
        r5 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x019a, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x019b, code lost:
        r16 = r4;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0197 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:10:0x0032] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x01a8 A[Catch:{ all -> 0x019f }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x01b4 A[ADDED_TO_REGION, EDGE_INSN: B:50:0x01b4->B:44:0x01b4 ?: BREAK  , SYNTHETIC] */
    @Override // com.ss.android.ugc.effectmanager.common.p3052g.AbstractC60520e
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo207037a() {
        /*
        // Method dump skipped, instructions count: 451
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.effectmanager.effect.p3061d.p3063b.p3064a.C60618d.mo207037a():void");
    }

    /* renamed from: a */
    private void m235536a(CategoryEffectListResponse categoryEffectListResponse) {
        String a = C60529g.m235256a(this.f151576f, this.f151578h, this.f151579i, this.f151580j, this.f151581k);
        try {
            this.f151586p = this.f151573c.mo207128a(a, this.f151574d.mo207189a(categoryEffectListResponse)) / ((long) EffectConstants.f151228a);
        } catch (Exception e) {
            EPLog.m235180c("FetchCategoryEffectTask", Log.getStackTraceString(e));
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(HiAnalyticsConstant.HaKey.BI_KEY_VERSION, categoryEffectListResponse.getData().getCategoryEffects().getVersion());
            jSONObject.put("cursor", categoryEffectListResponse.getData().getCategoryEffects().getCursor());
            jSONObject.put("sorting_position", categoryEffectListResponse.getData().getCategoryEffects().getSortingPosition());
            this.f151573c.mo207128a(C60529g.m235255a(this.f151576f, this.f151578h), jSONObject.toString());
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    /* renamed from: a */
    private void m235535a(C60519c cVar) {
        cVar.mo207219a(this.f151583m, this.f151584n, this.f151585o);
        mo207224a(21, new C60599g(null, cVar));
        AbstractC60511c cVar2 = this.f151575e;
        if (cVar2 != null) {
            cVar2.mo207190a("category_list_success_rate", 1, C60532k.m235271a().mo207241a("app_id", this.f151572b.mo207329n()).mo207241a("access_key", this.f151572b.mo207318c()).mo207241a("panel", this.f151576f).mo207241a("category", this.f151578h).mo207239a("error_code", Integer.valueOf(cVar.mo207221c())).mo207241a("error_msg", cVar.mo207217a()).mo207241a("download_url", this.f151583m).mo207241a("host_ip", this.f151585o).mo207239a("effect_platform_type", (Integer) 0).mo207243b());
        }
    }

    public C60618d(C60483a aVar, String str, String str2, String str3, int i, int i2, int i3, String str4, Handler handler) {
        super(handler, str2);
        this.f151576f = str;
        this.f151578h = str3;
        this.f151579i = i;
        this.f151580j = i2;
        this.f151581k = i3;
        this.f151582l = str4;
        this.f151571a = aVar;
        C60549e a = aVar.mo207066a();
        this.f151572b = a;
        this.f151573c = a.mo207335t();
    }
}
