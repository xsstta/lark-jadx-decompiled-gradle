package com.bytedance.ee.bear.bitable.card.performance;

import com.bytedance.ee.bear.contract.AbstractC5233x;
import com.bytedance.ee.bear.domain.BearUrl;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p700c.C13598b;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000f2\u00020\u0001:\u0002\u000f\u0010B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\bJ\"\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\b¨\u0006\u0011"}, d2 = {"Lcom/bytedance/ee/bear/bitable/card/performance/STDataParseFailTracker;", "Lcom/bytedance/ee/bear/bitable/card/performance/STPerformance;", "()V", "reportFailDetails", "", "analyticService", "Lcom/bytedance/ee/bear/contract/AnalyticService;", "failType", "", "errorMsg", "setBaseParams", "bearUrl", "Lcom/bytedance/ee/bear/domain/BearUrl;", "tableId", "viewId", "Companion", "STDataParseFailHolder", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.bitable.card.a.c */
public final class STDataParseFailTracker extends STPerformance {

    /* renamed from: a */
    public static final Companion f13283a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/bytedance/ee/bear/bitable/card/performance/STDataParseFailTracker$Companion;", "", "()V", "NATIVE_PARSE_COMMANDS_RESULT_FAILED", "", "NATIVE_PARSE_COMMON_DATA_FAILED", "NATIVE_PARSE_PERMISSIONS_DATA_FAILED", "NATIVE_PARSE_TABLE_DATA_FAILED", "NATIVE_PARSE_TABLE_META_FAILED", "NATIVE_PARSE_TABLE_RECORD_IDS_FAILED", "instance", "Lcom/bytedance/ee/bear/bitable/card/performance/STDataParseFailTracker;", "getInstance", "()Lcom/bytedance/ee/bear/bitable/card/performance/STDataParseFailTracker;", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.card.a.c$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final STDataParseFailTracker mo17450a() {
            return STDataParseFailHolder.f13284a.mo17451a();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/bytedance/ee/bear/bitable/card/performance/STDataParseFailTracker$STDataParseFailHolder;", "", "()V", "instance", "Lcom/bytedance/ee/bear/bitable/card/performance/STDataParseFailTracker;", "getInstance", "()Lcom/bytedance/ee/bear/bitable/card/performance/STDataParseFailTracker;", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.card.a.c$b */
    public static final class STDataParseFailHolder {

        /* renamed from: a */
        public static final STDataParseFailHolder f13284a = new STDataParseFailHolder();

        /* renamed from: b */
        private static final STDataParseFailTracker f13285b = new STDataParseFailTracker(null);

        private STDataParseFailHolder() {
        }

        /* renamed from: a */
        public final STDataParseFailTracker mo17451a() {
            return f13285b;
        }
    }

    private STDataParseFailTracker() {
    }

    public /* synthetic */ STDataParseFailTracker(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* renamed from: a */
    public final void mo17449a(BearUrl bearUrl, String str, String str2) {
        Intrinsics.checkParameterIsNotNull(bearUrl, "bearUrl");
        mo17453a(C13598b.m55197d(bearUrl.f17447b));
        mo17456b(bearUrl.f17446a);
        mo17458c(str);
        mo17460d(str2);
    }

    /* renamed from: a */
    public final void mo17448a(AbstractC5233x xVar, String str, String str2) {
        Intrinsics.checkParameterIsNotNull(xVar, "analyticService");
        OpenCardPerformanceTracker.f13271a.mo17446a().mo17454a(false);
        EditRecordPerformanceTracker.f13261a.mo17434a().mo17454a(false);
        HashMap hashMap = new HashMap();
        hashMap.put("file_id", mo17452a());
        hashMap.put("module", mo17455b());
        hashMap.put("table_id", mo17457c());
        hashMap.put("view_id", mo17459d());
        hashMap.put("platform", "native");
        hashMap.put("fail_type", str);
        hashMap.put("error_msg", str2);
        C13479a.m54772d("STPerformanceTracker_DataParseFail", "report the ST data parsing failed : params = " + hashMap);
        xVar.mo21079a("bitable_performance_fail_details", hashMap);
    }
}
