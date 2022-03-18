package com.ss.android.lark.live;

import android.content.Context;
import com.ss.android.lark.live.model.AbstractC41519a;
import com.ss.android.lark.live.p2133a.C41488a;
import com.ss.android.lark.live.settings.C41524a;
import com.ss.android.lark.mm.p2288b.C45855f;
import com.ss.android.lark.statistics.Statistics;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.live.a */
public class C41487a implements AbstractC41519a {

    /* renamed from: a */
    private static C41488a f105466a;

    /* renamed from: b */
    private final C41524a f105467b = new C41524a();

    @Override // com.ss.android.lark.live.model.AbstractC41519a
    /* renamed from: c */
    public void mo149307c() {
        m164616a().mo149322b();
    }

    @Override // com.ss.android.lark.live.model.AbstractC41519a
    /* renamed from: b */
    public boolean mo149306b() {
        return m164616a().mo149325d();
    }

    /* renamed from: a */
    public static C41488a m164616a() {
        if (f105466a == null) {
            synchronized (C41488a.class) {
                if (f105466a == null) {
                    f105466a = new C41488a();
                }
            }
        }
        return f105466a;
    }

    @Override // com.ss.android.lark.live.model.AbstractC41519a
    /* renamed from: a */
    public boolean mo149305a(String str) {
        C45855f.m181664c("LiveModule", "[isVcLiveUrl] enter");
        return this.f105467b.mo149410a(str);
    }

    @Override // com.ss.android.lark.live.model.AbstractC41519a
    /* renamed from: a */
    public boolean mo149304a(Context context, String str, int i) {
        C45855f.m181664c("LiveModule", "[handleVcLiveUrl] enter");
        C41504b.m164713c();
        C41504b.m164715e();
        C41504b.m164717g();
        C41504b.m164721k();
        C41504b.m164723m();
        C41504b.m164725o();
        if (i == 5 || i == 6) {
            try {
                Statistics.sendEvent("link_clicked", new JSONObject().put("link_source", "live"));
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        m164616a().mo149316a(context, str, 2);
        return true;
    }
}
