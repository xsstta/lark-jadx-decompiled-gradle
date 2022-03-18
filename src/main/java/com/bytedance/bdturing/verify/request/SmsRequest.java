package com.bytedance.bdturing.verify.request;

import com.bytedance.bdturing.p209e.C3542b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B'\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\u0014\u0010\u0013\u001a\u00020\u00142\n\u0010\u0015\u001a\u00060\u0016j\u0002`\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0003H\u0016J\b\u0010\u001b\u001a\u00020\u0019H\u0016R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\n\"\u0004\b\u0012\u0010\f¨\u0006\u001c"}, d2 = {"Lcom/bytedance/bdturing/verify/request/SmsRequest;", "Lcom/bytedance/bdturing/verify/request/AbstractRequest;", "scene", "", "showToastSuccess", "", "(Ljava/lang/String;Z)V", "uid", "(Ljava/lang/String;ZLjava/lang/String;)V", "getScene", "()Ljava/lang/String;", "setScene", "(Ljava/lang/String;)V", "getShowToastSuccess", "()Z", "setShowToastSuccess", "(Z)V", "getUid", "setUid", "buildUrl", "", "queryBuilder", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "getEventLimits", "", "getServiceType", "getType", "BdTuringSdk_i18nRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.bdturing.f.a.l */
public final class SmsRequest extends AbstractRequest {

    /* renamed from: a */
    private String f11210a;

    /* renamed from: b */
    private boolean f11211b;

    /* renamed from: c */
    private String f11212c;

    public SmsRequest() {
        this(null, false, null, 7, null);
    }

    @Override // com.bytedance.bdturing.verify.request.AbstractRequest
    /* renamed from: f */
    public int mo14348f() {
        return 1;
    }

    @Override // com.bytedance.bdturing.verify.request.AbstractRequest
    /* renamed from: g */
    public String mo14349g() {
        return "sms";
    }

    @Override // com.bytedance.bdturing.verify.request.AbstractRequest
    /* renamed from: h */
    public int mo14350h() {
        return 6000;
    }

    @Override // com.bytedance.bdturing.verify.request.AbstractRequest
    /* renamed from: a */
    public void mo14340a(StringBuilder sb) {
        Intrinsics.checkParameterIsNotNull(sb, "queryBuilder");
        C3542b.m14904a(sb, "scene", this.f11210a);
        C3542b.m14903a(sb, "show_success_toast", this.f11211b ? 1 : 0);
        C3542b.m14904a(sb, "uid", this.f11212c);
    }

    public SmsRequest(String str, boolean z, String str2) {
        this.f11210a = str;
        this.f11211b = z;
        this.f11212c = str2;
        mo14341a(true);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SmsRequest(String str, boolean z, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : str2);
    }
}
