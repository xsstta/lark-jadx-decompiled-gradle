package com.bytedance.ee.bear.bitable.card.performance;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0016\u0018\u0000 &2\u00020\u0001:\u0001&B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0006\"\u0004\b\u0016\u0010\bR\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0006\"\u0004\b\u0019\u0010\bR\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0006\"\u0004\b\u001c\u0010\bR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0006\"\u0004\b\u001f\u0010\bR\u001c\u0010 \u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0006\"\u0004\b\"\u0010\bR\u001c\u0010#\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0006\"\u0004\b%\u0010\b¨\u0006'"}, d2 = {"Lcom/bytedance/ee/bear/bitable/card/performance/STPerformance;", "", "()V", "fieldId", "", "getFieldId", "()Ljava/lang/String;", "setFieldId", "(Ljava/lang/String;)V", "fieldType", "getFieldType", "setFieldType", "fileId", "getFileId", "setFileId", "isCollectingData", "", "()Z", "setCollectingData", "(Z)V", "module", "getModule", "setModule", "recordId", "getRecordId", "setRecordId", "tableId", "getTableId", "setTableId", "transactionId", "getTransactionId", "setTransactionId", "viewId", "getViewId", "setViewId", "viewType", "getViewType", "setViewType", "Companion", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.bitable.card.a.d */
public class STPerformance {

    /* renamed from: b */
    public static final Companion f13286b = new Companion(null);

    /* renamed from: a */
    private String f13287a;

    /* renamed from: c */
    private String f13288c;

    /* renamed from: d */
    private String f13289d;

    /* renamed from: e */
    private String f13290e;

    /* renamed from: f */
    private String f13291f;

    /* renamed from: g */
    private String f13292g;

    /* renamed from: h */
    private String f13293h;

    /* renamed from: i */
    private String f13294i;

    /* renamed from: j */
    private String f13295j;

    /* renamed from: k */
    private boolean f13296k;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/bytedance/ee/bear/bitable/card/performance/STPerformance$Companion;", "", "()V", "TAG", "", "curTransactionId", "getCurTransactionId", "()Ljava/lang/String;", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.card.a.d$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final String mo17472a() {
            if (OpenCardPerformanceTracker.f13271a.mo17446a().mo17471j()) {
                return OpenCardPerformanceTracker.f13271a.mo17446a().mo17469i();
            }
            if (EditRecordPerformanceTracker.f13261a.mo17434a().mo17471j()) {
                return EditRecordPerformanceTracker.f13261a.mo17434a().mo17469i();
            }
            return null;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo17452a() {
        return this.f13287a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo17455b() {
        return this.f13288c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final String mo17457c() {
        return this.f13289d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final String mo17459d() {
        return this.f13290e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final String mo17461e() {
        return this.f13291f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final String mo17463f() {
        return this.f13292g;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final String mo17465g() {
        return this.f13293h;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final String mo17467h() {
        return this.f13294i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final String mo17469i() {
        return this.f13295j;
    }

    /* renamed from: j */
    public final boolean mo17471j() {
        return this.f13296k;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo17453a(String str) {
        this.f13287a = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo17456b(String str) {
        this.f13288c = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo17458c(String str) {
        this.f13289d = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo17460d(String str) {
        this.f13290e = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo17462e(String str) {
        this.f13291f = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo17464f(String str) {
        this.f13292g = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo17466g(String str) {
        this.f13293h = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final void mo17468h(String str) {
        this.f13294i = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final void mo17470i(String str) {
        this.f13295j = str;
    }

    /* renamed from: a */
    public final void mo17454a(boolean z) {
        this.f13296k = z;
    }
}
