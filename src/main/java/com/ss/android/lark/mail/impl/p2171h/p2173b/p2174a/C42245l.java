package com.ss.android.lark.mail.impl.p2171h.p2173b.p2174a;

import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.C41816b;
import com.ss.android.lark.mail.impl.message.p2204d.C42879j;
import com.ss.android.lark.mail.impl.p2171h.C42226b;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.mail.impl.h.b.a.l */
public class C42245l extends AbstractC42235a {

    /* renamed from: c */
    public static boolean f107546c = true;

    /* renamed from: d */
    private static String f107547d = "lazyloadmessage";

    /* renamed from: e */
    private static String f107548e = "preloadweb";

    /* renamed from: f */
    private static String f107549f = "preunread";

    /* renamed from: g */
    private static String[] f107550g = {"start", "key_before_load_data", "key_get_rust_data_start", "key_get_rust_data_success", "key_parse_html_start", "key_parse_html_finish", "key_render_page_start", "key_render_page_finish", "key_finish"};

    /* renamed from: h */
    private String f107551h = "";

    /* renamed from: i */
    private int f107552i;

    /* renamed from: j */
    private int f107553j;

    /* renamed from: k */
    private boolean f107554k;

    /* renamed from: l */
    private boolean f107555l;

    /* renamed from: m */
    private boolean f107556m = true;

    /* renamed from: n */
    private long f107557n;

    /* renamed from: o */
    private boolean f107558o;

    /* renamed from: p */
    private long f107559p;

    /* renamed from: q */
    private long f107560q;

    /* renamed from: r */
    private long f107561r;

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.p2171h.p2173b.p2174a.AbstractC42235a
    /* renamed from: a */
    public String mo152338a() {
        return "MessageListDetailMonitor";
    }

    /* renamed from: f */
    public long mo152364f() {
        return this.f107557n;
    }

    /* renamed from: g */
    public boolean mo152365g() {
        return this.f107555l;
    }

    @Override // com.ss.android.lark.mail.impl.p2171h.p2173b.p2174a.AbstractC42235a
    /* renamed from: c */
    public void mo152342c() {
        super.mo152342c();
        mo152339a("start");
    }

    @Override // com.ss.android.lark.mail.impl.p2171h.p2173b.p2174a.AbstractC42235a
    /* renamed from: b */
    public String[] mo152341b() {
        return f107550g;
    }

    @Override // com.ss.android.lark.mail.impl.p2171h.p2173b.p2174a.AbstractC42235a
    /* renamed from: e */
    public void mo152344e() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        String str = "key_before_load_data";
        mo152339a("key_finish");
        Log.m165389i("MessageListDetailMonitor", "testAsynRender report tea: mFinish:" + this.f107523b + " mTimes:" + this.f107522a + " this.rustTimeCost:" + this.f107559p + " this.parseTimeCost:" + this.f107560q + " this.renderTimeCost:" + this.f107561r);
        if (!this.f107523b && this.f107522a != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                long currentTimeMillis = System.currentTimeMillis() + mo152340b(str);
                if (this.f107561r == 0) {
                    str = "key_render_page_start";
                    this.f107561r = mo152340b("key_render_page_finish");
                }
                if (this.f107559p == 0) {
                    str = "key_get_rust_data_start";
                    this.f107559p = mo152340b("key_get_rust_data_success");
                    this.f107560q = mo152340b("key_parse_html_finish");
                }
                long longValue = currentTimeMillis - ((Long) this.f107522a.get(str)).longValue();
                Log.m165389i("MessageListDetailMonitor", "testAsynRender report rustTimeCost: " + this.f107559p + " parseTimeCost:" + this.f107560q);
                if (longValue > 0 && this.f107559p > 0 && this.f107560q > 0 && this.f107561r > 0) {
                    if (longValue <= 50000) {
                        jSONObject.putOpt(C42226b.C42230c.f107492f, this.f107551h);
                        jSONObject.putOpt(C42226b.C42230c.f107493g, Integer.valueOf(this.f107553j));
                        jSONObject.putOpt(C42226b.C42230c.f107491e, Integer.valueOf(this.f107552i));
                        String str2 = C42226b.C42230c.f107494h;
                        int i6 = 1;
                        if (this.f107554k) {
                            i = 1;
                        } else {
                            i = 0;
                        }
                        jSONObject.putOpt(str2, Integer.valueOf(i));
                        String str3 = C42226b.C42230c.f107498l;
                        if (this.f107555l) {
                            i2 = 1;
                        } else {
                            i2 = 0;
                        }
                        jSONObject.putOpt(str3, Integer.valueOf(i2));
                        jSONObject.putOpt(C42226b.C42230c.f107488b, Long.valueOf(longValue));
                        jSONObject.putOpt(C42226b.C42230c.f107495i, Long.valueOf(this.f107559p));
                        jSONObject.putOpt(C42226b.C42230c.f107496j, Long.valueOf(this.f107560q));
                        jSONObject.putOpt(C42226b.C42230c.f107497k, Long.valueOf(this.f107561r));
                        String str4 = C42226b.C42230c.f107499m;
                        if (f107546c) {
                            i3 = 1;
                        } else {
                            i3 = 0;
                        }
                        jSONObject.putOpt(str4, Integer.valueOf(i3));
                        String str5 = C42226b.C42230c.f107502p;
                        if (this.f107556m) {
                            i4 = 1;
                        } else {
                            i4 = 0;
                        }
                        jSONObject.putOpt(str5, Integer.valueOf(i4));
                        jSONObject.putOpt(C42226b.C42230c.f107500n, Long.valueOf(this.f107557n));
                        String str6 = C42226b.C42230c.f107501o;
                        if (this.f107558o) {
                            i5 = 1;
                        } else {
                            i5 = 0;
                        }
                        jSONObject.putOpt(str6, Integer.valueOf(i5));
                        StringBuffer stringBuffer = new StringBuffer();
                        stringBuffer.append("");
                        if (C41816b.m166115a().mo150154u().mo150160a("larkmail.cli.mobile.readmail.lazyloaditem")) {
                            stringBuffer.append(f107547d);
                        }
                        if (C41816b.m166115a().mo150154u().mo150160a("larkmail.cli.prestartweb")) {
                            stringBuffer.append(f107548e);
                        }
                        if (C42879j.m170799a().mo153874b()) {
                            stringBuffer.append(f107549f);
                        }
                        jSONObject.putOpt(C42226b.C42230c.f107503q, stringBuffer.toString());
                        String str7 = C42226b.C42230c.f107504r;
                        if (!C42879j.f109205a) {
                            i6 = 0;
                        }
                        jSONObject.putOpt(str7, Integer.valueOf(i6));
                        Log.m165389i("MessageListDetailMonitor", "testAsynRender report tea: " + jSONObject.toString());
                        C42226b.m168638a().mo152311b("mail_dev_message_list_cost_time", jSONObject);
                        f107546c = false;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        super.mo152344e();
    }

    /* renamed from: b */
    public void mo152361b(int i) {
        this.f107553j = i;
    }

    /* renamed from: a */
    public void mo152357a(long j) {
        this.f107557n = j;
    }

    /* renamed from: b */
    public void mo152362b(long j) {
        this.f107561r = j;
    }

    /* renamed from: b */
    public void mo152363b(boolean z) {
        this.f107556m = z;
    }

    /* renamed from: a */
    public void mo152360a(boolean z) {
        this.f107558o = z;
    }

    /* renamed from: a */
    public void mo152358a(long j, long j2) {
        this.f107559p = j;
        this.f107560q = j2;
    }

    /* renamed from: a */
    public void mo152359a(String str, int i, boolean z, boolean z2) {
        this.f107551h = str;
        this.f107552i = i;
        this.f107554k = z;
        this.f107555l = z2;
    }
}
