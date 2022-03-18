package com.bytedance.ee.larkwebview.monitor.webview;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0003R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/bytedance/ee/larkwebview/monitor/webview/BizType;", "", "biz", "", "(Ljava/lang/String;)V", "getBiz", "Companion", "base_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.ee.larkwebview.monitor.webview.c */
public final class BizType {

    /* renamed from: a */
    public static final BizType f35437a = new BizType("docs");

    /* renamed from: b */
    public static final BizType f35438b = new BizType("larkweb");

    /* renamed from: c */
    public static final BizType f35439c = new BizType("gadget");

    /* renamed from: d */
    public static final BizType f35440d = new BizType("mail");

    /* renamed from: e */
    public static final BizType f35441e = new BizType("calendar");

    /* renamed from: f */
    public static final BizType f35442f = new BizType("passport");

    /* renamed from: g */
    public static final BizType f35443g = new BizType("unknown");

    /* renamed from: h */
    public static final Companion f35444h = new Companion(null);

    /* renamed from: i */
    private String f35445i;

    public BizType() {
        this(null, 1, null);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0011\u0010\t\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0011\u0010\u000b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u0011\u0010\r\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0006R\u0011\u0010\u000f\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0006R\u0011\u0010\u0011\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0006¨\u0006\u0013"}, d2 = {"Lcom/bytedance/ee/larkwebview/monitor/webview/BizType$Companion;", "", "()V", "CALENDAR", "Lcom/bytedance/ee/larkwebview/monitor/webview/BizType;", "getCALENDAR", "()Lcom/bytedance/ee/larkwebview/monitor/webview/BizType;", "DOCS", "getDOCS", "GADGET", "getGADGET", "LARKWEB", "getLARKWEB", "MAIL", "getMAIL", "PASSPORT", "getPASSPORT", GrsBaseInfo.CountryCodeSource.UNKNOWN, "getUNKNOWN", "base_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ee.larkwebview.monitor.webview.c$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final BizType mo49860a() {
            return BizType.f35437a;
        }

        /* renamed from: b */
        public final BizType mo49861b() {
            return BizType.f35438b;
        }

        /* renamed from: c */
        public final BizType mo49862c() {
            return BizType.f35439c;
        }

        /* renamed from: d */
        public final BizType mo49863d() {
            return BizType.f35440d;
        }

        /* renamed from: e */
        public final BizType mo49864e() {
            return BizType.f35442f;
        }

        /* renamed from: f */
        public final BizType mo49865f() {
            return BizType.f35443g;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final String mo49859a() {
        String str = this.f35445i;
        if (str != null) {
            return str;
        }
        return "unknown";
    }

    public BizType(String str) {
        this.f35445i = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BizType(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "unknown" : str);
    }
}
