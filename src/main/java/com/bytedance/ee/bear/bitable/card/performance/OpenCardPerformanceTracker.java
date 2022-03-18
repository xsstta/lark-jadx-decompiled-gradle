package com.bytedance.ee.bear.bitable.card.performance;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.contract.AbstractC5233x;
import com.bytedance.ee.log.C13479a;
import com.huawei.hms.adapter.internal.CommonCode;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u0000 !2\u00020\u0001:\u0002!\"B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0004J\u000e\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u0004J\u000e\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u0004J\u000e\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u0004J\u000e\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u0004J\u0018\u0010\u0017\u001a\u00020\u000e2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u000b\u001a\u00020\u0004J\"\u0010\u001a\u001a\u00020\u000e2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\f\u001a\u00020\u00042\b\u0010\u001b\u001a\u0004\u0018\u00010\u0019J@\u0010\u001c\u001a\u00020\u000e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u00192\b\u0010\u001e\u001a\u0004\u0018\u00010\u00192\b\u0010\u001f\u001a\u0004\u0018\u00010\u00192\b\u0010 \u001a\u0004\u0018\u00010\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\n\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lcom/bytedance/ee/bear/bitable/card/performance/OpenCardPerformanceTracker;", "Lcom/bytedance/ee/bear/bitable/card/performance/STPerformance;", "()V", "nativeReceiveShowCardActionTime", "", "nativeReceiveTableDataTime", "nativeReceiveTableMetaTime", "nativeRequestTableDataTime", "nativeRequestTableMetaTime", "nativeShowCardTime", "userClickTime", "webReceiveTableDataRequestTime", "webReceiveTableMetaRequestTime", "endCollectDataAndReport", "", "analyticService", "Lcom/bytedance/ee/bear/contract/AnalyticService;", "setNativeReceiveShowCardActionTimeIfNeed", "setNativeReceiveTableDataTimeIfNeed", "setNativeReceiveTableMetaTimeIfNeed", "setNativeRequestTableDataTimeIfNeed", "setNativeRequestTableMetaTimeIfNeed", "setNativeShowCardTimeIfNeed", "setWebReceiveTableDataRequestTimeIfNeed", "transactionId", "", "setWebReceiveTableMetaRequestTimeIfNeed", "viewType", "startCollectData", "module", "tableId", "viewId", "recordId", "Companion", "OpenCardPerformanceHolder", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.bitable.card.a.b */
public final class OpenCardPerformanceTracker extends STPerformance {

    /* renamed from: a */
    public static final Companion f13271a = new Companion(null);

    /* renamed from: c */
    private long f13272c;

    /* renamed from: d */
    private long f13273d;

    /* renamed from: e */
    private long f13274e;

    /* renamed from: f */
    private long f13275f;

    /* renamed from: g */
    private long f13276g;

    /* renamed from: h */
    private long f13277h;

    /* renamed from: i */
    private long f13278i;

    /* renamed from: j */
    private long f13279j;

    /* renamed from: k */
    private long f13280k;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/bytedance/ee/bear/bitable/card/performance/OpenCardPerformanceTracker$Companion;", "", "()V", "instance", "Lcom/bytedance/ee/bear/bitable/card/performance/OpenCardPerformanceTracker;", "getInstance", "()Lcom/bytedance/ee/bear/bitable/card/performance/OpenCardPerformanceTracker;", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.card.a.b$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final OpenCardPerformanceTracker mo17446a() {
            return OpenCardPerformanceHolder.f13281a.mo17447a();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/bytedance/ee/bear/bitable/card/performance/OpenCardPerformanceTracker$OpenCardPerformanceHolder;", "", "()V", "instance", "Lcom/bytedance/ee/bear/bitable/card/performance/OpenCardPerformanceTracker;", "getInstance", "()Lcom/bytedance/ee/bear/bitable/card/performance/OpenCardPerformanceTracker;", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.card.a.b$b */
    public static final class OpenCardPerformanceHolder {

        /* renamed from: a */
        public static final OpenCardPerformanceHolder f13281a = new OpenCardPerformanceHolder();

        /* renamed from: b */
        private static final OpenCardPerformanceTracker f13282b = new OpenCardPerformanceTracker(null);

        private OpenCardPerformanceHolder() {
        }

        /* renamed from: a */
        public final OpenCardPerformanceTracker mo17447a() {
            return f13282b;
        }
    }

    private OpenCardPerformanceTracker() {
    }

    public /* synthetic */ OpenCardPerformanceTracker(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* renamed from: a */
    public final void mo17436a(long j) {
        if (mo17471j()) {
            this.f13273d = j;
        }
    }

    /* renamed from: b */
    public final void mo17441b(long j) {
        if (mo17471j()) {
            this.f13274e = j;
        }
    }

    /* renamed from: c */
    public final void mo17442c(long j) {
        if (mo17471j()) {
            this.f13276g = j;
        }
    }

    /* renamed from: d */
    public final void mo17443d(long j) {
        if (mo17471j()) {
            this.f13277h = j;
        }
    }

    /* renamed from: e */
    public final void mo17444e(long j) {
        if (mo17471j()) {
            this.f13279j = j;
        }
    }

    /* renamed from: f */
    public final void mo17445f(long j) {
        if (mo17471j()) {
            this.f13280k = j;
        }
    }

    /* renamed from: a */
    public final void mo17437a(AbstractC5233x xVar) {
        Intrinsics.checkParameterIsNotNull(xVar, "analyticService");
        if (mo17471j()) {
            mo17454a(false);
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = jSONObject;
            jSONObject2.put((Object) "table_id", (Object) mo17457c());
            jSONObject2.put((Object) "view_id", (Object) mo17459d());
            jSONObject2.put((Object) "view_type", (Object) mo17461e());
            jSONObject2.put((Object) "module", (Object) mo17455b());
            jSONObject2.put((Object) CommonCode.MapKey.TRANSACTION_ID, (Object) mo17469i());
            jSONObject2.put((Object) "show_card_trigger_time", (Object) Integer.valueOf((int) (this.f13273d - this.f13272c)));
            jSONObject2.put((Object) "table_meta_request_time", (Object) Integer.valueOf((int) (this.f13275f - this.f13274e)));
            jSONObject2.put((Object) "table_meta_dispatch_time", (Object) Integer.valueOf((int) (this.f13276g - this.f13275f)));
            jSONObject2.put((Object) "table_data_request_time", (Object) Integer.valueOf((int) (this.f13278i - this.f13277h)));
            jSONObject2.put((Object) "table_data_dispatch_time", (Object) Integer.valueOf((int) (this.f13279j - this.f13278i)));
            jSONObject2.put((Object) "card_render_time", (Object) Integer.valueOf((int) (this.f13280k - this.f13279j)));
            jSONObject2.put((Object) "total_time", (Object) Integer.valueOf((int) (this.f13280k - this.f13272c)));
            C13479a.m54772d("STPerformanceTracker_OpenCard", "report the performance of opening ST card : params = " + jSONObject);
            xVar.mo21079a("bitable_performance_open_card", jSONObject2);
        }
    }

    /* renamed from: a */
    public final void mo17438a(String str, long j) {
        if (mo17471j() && TextUtils.equals(mo17469i(), str)) {
            this.f13278i = j;
        }
    }

    /* renamed from: a */
    public final void mo17439a(String str, long j, String str2) {
        if (mo17471j() && TextUtils.equals(mo17469i(), str)) {
            mo17462e(str2);
            this.f13275f = j;
        }
    }

    /* renamed from: a */
    public final void mo17440a(String str, String str2, String str3, String str4, String str5, long j) {
        if (!TextUtils.isEmpty(str5)) {
            mo17456b(str);
            mo17458c(str2);
            mo17460d(str3);
            mo17464f(str4);
            mo17470i(str5);
            this.f13272c = j;
            mo17454a(true);
        }
    }
}
