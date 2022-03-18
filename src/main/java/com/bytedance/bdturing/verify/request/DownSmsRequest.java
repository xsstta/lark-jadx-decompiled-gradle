package com.bytedance.bdturing.verify.request;

import android.text.TextUtils;
import com.bytedance.bdturing.p209e.C3542b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u0014\u0010\f\u001a\u00020\r2\n\u0010\u000e\u001a\u00060\u000fj\u0002`\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0003H\u0016J\b\u0010\u0014\u001a\u00020\u0012H\u0016R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\t¨\u0006\u0015"}, d2 = {"Lcom/bytedance/bdturing/verify/request/DownSmsRequest;", "Lcom/bytedance/bdturing/verify/request/AbstractRequest;", "verifyTicket", "", "mobile", "(Ljava/lang/String;Ljava/lang/String;)V", "getMobile", "()Ljava/lang/String;", "setMobile", "(Ljava/lang/String;)V", "getVerifyTicket", "setVerifyTicket", "buildUrl", "", "queryBuilder", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "getEventLimits", "", "getServiceType", "getType", "BdTuringSdk_i18nRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.bdturing.f.a.b */
public final class DownSmsRequest extends AbstractRequest {

    /* renamed from: a */
    private String f11197a;

    /* renamed from: b */
    private String f11198b;

    public DownSmsRequest() {
        this(null, null, 3, null);
    }

    @Override // com.bytedance.bdturing.verify.request.AbstractRequest
    /* renamed from: f */
    public int mo14348f() {
        return 7;
    }

    @Override // com.bytedance.bdturing.verify.request.AbstractRequest
    /* renamed from: g */
    public String mo14349g() {
        return "twice_verify";
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
        C3542b.m14904a(sb, "decision_config", "block-sms");
        C3542b.m14903a(sb, "is_turing", 1);
        if (!TextUtils.isEmpty(this.f11197a)) {
            C3542b.m14904a(sb, "verify_ticket", this.f11197a);
        }
        if (!TextUtils.isEmpty(this.f11198b)) {
            C3542b.m14904a(sb, "show_mobile", this.f11198b);
        }
        C3542b.m14903a(sb, "use_turing_bridge", 1);
    }

    public DownSmsRequest(String str, String str2) {
        this.f11197a = str;
        this.f11198b = str2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DownSmsRequest(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
