package com.ss.android.lark.mail.impl.monitor.event.detail;

import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.p2171h.C42226b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0014J\u0013\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\fH\u0016¢\u0006\u0002\u0010\rJ\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/mail/impl/monitor/event/detail/BigMessageMonitor;", "Lcom/ss/android/lark/mail/impl/monitor/event/detail/AbsDetailMonitor;", "()V", "bodyLen", "", "getBodyLen", "()J", "setBodyLen", "(J)V", "getMonitorTag", "", "getSteps", "", "()[Ljava/lang/String;", "start", "", "stop", "Companion", "mail_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mail.impl.h.b.a.b */
public final class BigMessageMonitor extends AbstractC42235a {

    /* renamed from: c */
    public static final String[] f107524c = {"event_start", "init_event", "rust_start", "rust_end", "parse_start", "parse_end", "render_start", "render_end"};

    /* renamed from: d */
    public static final Companion f107525d = new Companion(null);

    /* renamed from: e */
    private long f107526e;

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.p2171h.p2173b.p2174a.AbstractC42235a
    /* renamed from: a */
    public String mo152338a() {
        return "BigMessageMonitor";
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0011\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0019\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/mail/impl/monitor/event/detail/BigMessageMonitor$Companion;", "", "()V", "EVENT_START", "", "INIT_END", "PARSE_END", "PARSE_START", "RENDER_END", "RENDER_START", "RUST_END", "RUST_START", "TAG", "steps", "", "getSteps", "()[Ljava/lang/String;", "[Ljava/lang/String;", "mail_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mail.impl.h.b.a.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.ss.android.lark.mail.impl.p2171h.p2173b.p2174a.AbstractC42235a
    /* renamed from: b */
    public String[] mo152341b() {
        return f107524c;
    }

    @Override // com.ss.android.lark.mail.impl.p2171h.p2173b.p2174a.AbstractC42235a
    /* renamed from: c */
    public void mo152342c() {
        super.mo152342c();
        mo152339a("event_start");
    }

    @Override // com.ss.android.lark.mail.impl.p2171h.p2173b.p2174a.AbstractC42235a
    /* renamed from: e */
    public void mo152344e() {
        try {
            if (!this.f107523b && this.f107522a != null) {
                long b = mo152340b("rust_end");
                long b2 = mo152340b("parse_end");
                long b3 = mo152340b("render_end");
                long b4 = mo152340b("init_event") + b + b2 + b3;
                if (b >= 0 && b2 >= 0 && b3 >= 0) {
                    if (b4 >= 0) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.putOpt(C42226b.C42230c.f107488b, Long.valueOf(b4));
                        jSONObject.putOpt(C42226b.C42230c.f107495i, Long.valueOf(b));
                        jSONObject.putOpt(C42226b.C42230c.f107496j, Long.valueOf(b2));
                        jSONObject.putOpt(C42226b.C42230c.f107497k, Long.valueOf(b3));
                        jSONObject.putOpt("mail_body_length", Long.valueOf(this.f107526e));
                        Log.m165389i("BigMessageMonitor", "report tea: " + jSONObject);
                        C42226b.m168638a().mo152311b("mail_open_big_message_dev", jSONObject);
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
        } catch (Exception e) {
            Log.m165389i("BigMessageMonitor", "get cost time fail " + e);
        }
        super.mo152344e();
    }

    /* renamed from: a */
    public final void mo152345a(long j) {
        this.f107526e = j;
    }
}
