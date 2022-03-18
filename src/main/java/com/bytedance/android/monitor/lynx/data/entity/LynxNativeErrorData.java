package com.bytedance.android.monitor.lynx.data.entity;

import com.bytedance.android.monitor.p104a.AbstractC2630b;
import com.bytedance.android.monitor.p112i.C2657e;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0010\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/bytedance/android/monitor/lynx/data/entity/LynxNativeErrorData;", "Lcom/bytedance/android/monitor/base/BaseNativeInfo;", "()V", "errorCode", "", "getErrorCode", "()I", "setErrorCode", "(I)V", "errorMsg", "", "getErrorMsg", "()Ljava/lang/String;", "setErrorMsg", "(Ljava/lang/String;)V", "scene", "getScene", "setScene", "appendNativeInfoParams", "", "jsonObject", "Lorg/json/JSONObject;", "fillInJsonObject", "Companion", "lynx_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.android.monitor.lynx.b.a.d */
public final class LynxNativeErrorData extends AbstractC2630b {

    /* renamed from: b */
    public static final Companion f8479b = new Companion(null);

    /* renamed from: c */
    private String f8480c = "lynx_error";

    /* renamed from: d */
    private int f8481d;

    /* renamed from: e */
    private String f8482e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/bytedance/android/monitor/lynx/data/entity/LynxNativeErrorData$Companion;", "", "()V", "LYNX_ERROR_CODE_JAVASCRIPT", "", "LYNX_ERROR_CODE_LAYOUT", "LYNX_ERROR_CODE_LOAD_TEMPLATE", "LYNX_ERROR_CODE_RESOURCE", "LYNX_ERROR_CODE_TEMPLATE_PROVIDER", "LYNX_ERROR_CODE_UPDATE", "lynx_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.android.monitor.lynx.b.a.d$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: b */
    public final int mo11518b() {
        return this.f8481d;
    }

    public LynxNativeErrorData() {
        super("nativeError");
    }

    /* renamed from: a */
    public final void mo11516a(int i) {
        this.f8481d = i;
    }

    /* renamed from: a */
    public final void mo11517a(String str) {
        this.f8480c = str;
    }

    /* renamed from: b */
    public final void mo11519b(String str) {
        this.f8482e = str;
    }

    @Override // com.bytedance.android.monitor.p104a.AbstractC2629a
    /* renamed from: a */
    public void mo11404a(JSONObject jSONObject) {
        Intrinsics.checkParameterIsNotNull(jSONObject, "jsonObject");
        m11252b(jSONObject);
    }

    /* renamed from: b */
    private final void m11252b(JSONObject jSONObject) {
        C2657e.m11174a(jSONObject, "scene", this.f8480c);
        C2657e.m11171a(jSONObject, "error_code", this.f8481d);
        C2657e.m11174a(jSONObject, "error_msg", this.f8482e);
    }
}
