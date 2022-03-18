package com.ss.android.ugc.effectmanager.effect.p3061d.p3063b.p3064a;

import android.os.Handler;
import android.util.Log;
import com.ss.android.ugc.effectmanager.C60549e;
import com.ss.android.ugc.effectmanager.common.cachemanager.ICache;
import com.ss.android.ugc.effectmanager.common.logger.EPLog;
import com.ss.android.ugc.effectmanager.common.p3048c.AbstractC60510b;
import com.ss.android.ugc.effectmanager.common.p3048c.AbstractC60511c;
import com.ss.android.ugc.effectmanager.common.p3052g.C60519c;
import com.ss.android.ugc.effectmanager.common.p3053h.C60524b;
import com.ss.android.ugc.effectmanager.common.p3053h.C60529g;
import com.ss.android.ugc.effectmanager.common.p3053h.C60532k;
import com.ss.android.ugc.effectmanager.common.task.NormalTask;
import com.ss.android.ugc.effectmanager.effect.model.net.CategoryEffectListResponse;
import com.ss.android.ugc.effectmanager.effect.p3061d.p3062a.C60599g;
import com.ss.android.ugc.effectmanager.p3043b.C60483a;
import java.io.InputStream;

/* renamed from: com.ss.android.ugc.effectmanager.effect.d.b.a.c */
public class C60617c extends NormalTask {

    /* renamed from: a */
    private C60483a f151560a;

    /* renamed from: b */
    private C60549e f151561b;

    /* renamed from: c */
    private ICache f151562c;

    /* renamed from: d */
    private AbstractC60510b f151563d = this.f151561b.mo207331p();

    /* renamed from: e */
    private String f151564e;

    /* renamed from: f */
    private String f151565f;

    /* renamed from: g */
    private int f151566g;

    /* renamed from: h */
    private int f151567h;

    /* renamed from: i */
    private int f151568i;

    /* renamed from: j */
    private AbstractC60511c f151569j = this.f151561b.mo207339x();

    /* renamed from: k */
    private int f151570k = this.f151561b.mo207310A();

    @Override // com.ss.android.ugc.effectmanager.common.p3052g.AbstractC60520e
    /* renamed from: a */
    public void mo207037a() {
        CategoryEffectListResponse categoryEffectListResponse;
        long currentTimeMillis = System.currentTimeMillis();
        InputStream a = this.f151562c.mo207129a(C60529g.m235256a(this.f151564e, this.f151565f, this.f151566g, this.f151567h, this.f151568i));
        if (a == null) {
            mo207224a(21, new C60599g(null, new C60519c(10004)));
            return;
        }
        try {
            categoryEffectListResponse = (CategoryEffectListResponse) this.f151563d.mo207188a(a, CategoryEffectListResponse.class);
        } catch (Exception e) {
            EPLog.m235180c("FetchCategoryEffectCacheTask", Log.getStackTraceString(e));
            categoryEffectListResponse = null;
        }
        long currentTimeMillis2 = System.currentTimeMillis();
        if (categoryEffectListResponse == null || !categoryEffectListResponse.checkValue()) {
            m235533a(currentTimeMillis2 - currentTimeMillis);
            mo207224a(21, new C60599g(null, new C60519c(10004)));
        } else {
            mo207224a(21, new C60599g(categoryEffectListResponse.getData(), null));
        }
        C60524b.m235232a(a);
    }

    /* renamed from: a */
    private void m235533a(long j) {
        AbstractC60511c cVar = this.f151569j;
        if (cVar != null) {
            cVar.mo207190a("category_list_success_rate", 0, C60532k.m235271a().mo207241a("app_id", this.f151561b.mo207329n()).mo207241a("access_key", this.f151561b.mo207318c()).mo207241a("panel", this.f151564e).mo207241a("category", this.f151565f).mo207240a("duration", Long.valueOf(j)).mo207241a("from_cache", "true").mo207239a("request_strategy", Integer.valueOf(this.f151570k)).mo207239a("effect_platform_type", (Integer) 0).mo207243b());
        }
    }

    public C60617c(C60483a aVar, String str, String str2, String str3, int i, int i2, int i3, String str4, Handler handler) {
        super(handler, str2);
        this.f151564e = str;
        this.f151565f = str3;
        this.f151566g = i;
        this.f151567h = i2;
        this.f151568i = i3;
        this.f151560a = aVar;
        C60549e a = aVar.mo207066a();
        this.f151561b = a;
        this.f151562c = a.mo207335t();
    }
}
