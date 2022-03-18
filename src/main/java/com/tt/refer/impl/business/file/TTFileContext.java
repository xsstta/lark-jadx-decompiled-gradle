package com.tt.refer.impl.business.file;

import com.ss.android.lark.opmonitor.trace.OPTrace;
import com.ss.android.lark.opmonitor.trace.OPTraceService;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u0005R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/tt/refer/impl/business/file/TTFileContext;", "", "opTrace", "Lcom/ss/android/lark/opmonitor/trace/OPTrace;", "tag", "", "(Lcom/ss/android/lark/opmonitor/trace/OPTrace;Ljava/lang/String;)V", "getOpTrace", "()Lcom/ss/android/lark/opmonitor/trace/OPTrace;", "getTag", "()Ljava/lang/String;", "innerContext", "api", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.tt.refer.impl.business.file.h */
public final class TTFileContext {

    /* renamed from: a */
    private final OPTrace f171104a;

    /* renamed from: b */
    private final String f171105b;

    public TTFileContext() {
        this(null, null, 3, null);
    }

    /* renamed from: a */
    public final OPTrace mo235658a() {
        return this.f171104a;
    }

    /* renamed from: b */
    public final String mo235660b() {
        return this.f171105b;
    }

    /* renamed from: a */
    public final TTFileContext mo235659a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "api");
        OPTrace oPTrace = this.f171104a;
        return new TTFileContext(oPTrace, "__filesystem_" + str);
    }

    public TTFileContext(OPTrace oPTrace, String str) {
        Intrinsics.checkParameterIsNotNull(str, "tag");
        this.f171104a = oPTrace;
        this.f171105b = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TTFileContext(OPTrace oPTrace, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? OPTraceService.m192757a() : oPTrace, (i & 2) != 0 ? "unknown" : str);
    }
}
