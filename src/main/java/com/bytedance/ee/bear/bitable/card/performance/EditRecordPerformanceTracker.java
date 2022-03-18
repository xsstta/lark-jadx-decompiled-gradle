package com.bytedance.ee.bear.bitable.card.performance;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.contract.AbstractC5233x;
import com.bytedance.ee.log.C13479a;
import com.huawei.hms.adapter.internal.CommonCode;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u0000 \u001d2\u00020\u0001:\u0002\u001d\u001eB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0004J\u000e\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u0004J\u000e\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u0004J\u0018\u0010\u0013\u001a\u00020\f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\t\u001a\u00020\u0004J\u0018\u0010\u0016\u001a\u00020\f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\n\u001a\u00020\u0004JJ\u0010\u0017\u001a\u00020\f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00152\b\u0010\u0019\u001a\u0004\u0018\u00010\u00152\b\u0010\u001a\u001a\u0004\u0018\u00010\u00152\b\u0010\u001b\u001a\u0004\u0018\u00010\u00152\b\u0010\u001c\u001a\u0004\u0018\u00010\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\b\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/bytedance/ee/bear/bitable/card/performance/EditRecordPerformanceTracker;", "Lcom/bytedance/ee/bear/bitable/card/performance/STPerformance;", "()V", "nativeReceiveTableDataTime", "", "nativeReceiveUpdateRecordActionTime", "nativeRequestTableDataTime", "nativeUpdateCardTime", "userEditTime", "webReceiveEditRecordActionTime", "webReceiveTableDataRequestTime", "endCollectDataAndReport", "", "analyticService", "Lcom/bytedance/ee/bear/contract/AnalyticService;", "setNativeReceiveTableDataTimeIfNeed", "setNativeReceiveUpdateRecordActionTimeIfNeed", "setNativeRequestTableDataTimeIfNeed", "setNativeUpdateCardTimeIfNeed", "setWebReceiveEditRecordActionTimeIfNeed", "transactionId", "", "setWebReceiveTableDataRequestTimeIfNeed", "startCollectData", "tableId", "viewId", "recordId", "fieldId", "fieldType", "Companion", "EditRecordPerformanceHolder", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.bitable.card.a.a */
public final class EditRecordPerformanceTracker extends STPerformance {

    /* renamed from: a */
    public static final Companion f13261a = new Companion(null);

    /* renamed from: c */
    private long f13262c;

    /* renamed from: d */
    private long f13263d;

    /* renamed from: e */
    private long f13264e;

    /* renamed from: f */
    private long f13265f;

    /* renamed from: g */
    private long f13266g;

    /* renamed from: h */
    private long f13267h;

    /* renamed from: i */
    private long f13268i;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/bytedance/ee/bear/bitable/card/performance/EditRecordPerformanceTracker$Companion;", "", "()V", "instance", "Lcom/bytedance/ee/bear/bitable/card/performance/EditRecordPerformanceTracker;", "getInstance", "()Lcom/bytedance/ee/bear/bitable/card/performance/EditRecordPerformanceTracker;", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.card.a.a$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final EditRecordPerformanceTracker mo17434a() {
            return EditRecordPerformanceHolder.f13269a.mo17435a();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/bytedance/ee/bear/bitable/card/performance/EditRecordPerformanceTracker$EditRecordPerformanceHolder;", "", "()V", "instance", "Lcom/bytedance/ee/bear/bitable/card/performance/EditRecordPerformanceTracker;", "getInstance", "()Lcom/bytedance/ee/bear/bitable/card/performance/EditRecordPerformanceTracker;", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.card.a.a$b */
    public static final class EditRecordPerformanceHolder {

        /* renamed from: a */
        public static final EditRecordPerformanceHolder f13269a = new EditRecordPerformanceHolder();

        /* renamed from: b */
        private static final EditRecordPerformanceTracker f13270b = new EditRecordPerformanceTracker(null);

        private EditRecordPerformanceHolder() {
        }

        /* renamed from: a */
        public final EditRecordPerformanceTracker mo17435a() {
            return f13270b;
        }
    }

    private EditRecordPerformanceTracker() {
    }

    public /* synthetic */ EditRecordPerformanceTracker(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* renamed from: a */
    public final void mo17426a(long j) {
        if (mo17471j()) {
            this.f13264e = j;
        }
    }

    /* renamed from: b */
    public final void mo17430b(long j) {
        if (mo17471j()) {
            this.f13265f = j;
        }
    }

    /* renamed from: c */
    public final void mo17432c(long j) {
        if (mo17471j()) {
            this.f13267h = j;
        }
    }

    /* renamed from: d */
    public final void mo17433d(long j) {
        if (mo17471j()) {
            this.f13268i = j;
        }
    }

    /* renamed from: a */
    public final void mo17427a(AbstractC5233x xVar) {
        Intrinsics.checkParameterIsNotNull(xVar, "analyticService");
        if (mo17471j()) {
            mo17454a(false);
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = jSONObject;
            jSONObject2.put((Object) "table_id", (Object) mo17457c());
            jSONObject2.put((Object) "view_id", (Object) mo17459d());
            jSONObject2.put((Object) "record_id", (Object) mo17463f());
            jSONObject2.put((Object) "field_id", (Object) mo17465g());
            jSONObject2.put((Object) "field_type", (Object) mo17467h());
            jSONObject2.put((Object) CommonCode.MapKey.TRANSACTION_ID, (Object) mo17469i());
            jSONObject2.put((Object) "edit_record_trigger_time", (Object) Integer.valueOf((int) (this.f13263d - this.f13262c)));
            jSONObject2.put((Object) "update_record_trigger_time", (Object) Integer.valueOf((int) (this.f13264e - this.f13263d)));
            jSONObject2.put((Object) "table_data_request_time", (Object) Integer.valueOf((int) (this.f13266g - this.f13265f)));
            jSONObject2.put((Object) "table_data_dispatch_time", (Object) Integer.valueOf((int) (this.f13267h - this.f13266g)));
            jSONObject2.put((Object) "card_update_time", (Object) Integer.valueOf((int) (this.f13268i - this.f13267h)));
            jSONObject2.put((Object) "total_time", (Object) Integer.valueOf((int) (this.f13268i - this.f13262c)));
            C13479a.m54772d("STPerformanceTracker_EditRecord", "report the performance of editing ST field : params = " + jSONObject);
            xVar.mo21079a("bitable_performance_edit_record", jSONObject2);
        }
    }

    /* renamed from: a */
    public final void mo17428a(String str, long j) {
        if (mo17471j() && TextUtils.equals(mo17469i(), str)) {
            this.f13263d = j;
        }
    }

    /* renamed from: b */
    public final void mo17431b(String str, long j) {
        if (mo17471j() && TextUtils.equals(mo17469i(), str)) {
            this.f13266g = j;
        }
    }

    /* renamed from: a */
    public final void mo17429a(String str, String str2, String str3, String str4, String str5, String str6, long j) {
        if (!TextUtils.isEmpty(str6)) {
            mo17458c(str);
            mo17460d(str2);
            mo17464f(str3);
            mo17466g(str4);
            mo17468h(str5);
            mo17470i(str6);
            this.f13262c = j;
            mo17454a(true);
        }
    }
}
