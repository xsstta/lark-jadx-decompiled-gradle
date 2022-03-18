package com.bytedance.bdturing.verify.request;

import android.text.TextUtils;
import com.bytedance.bdturing.p209e.C3542b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\u0014\u0010\u000f\u001a\u00020\u00102\n\u0010\u0011\u001a\u00060\u0012j\u0002`\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0003H\u0016J\b\u0010\u0017\u001a\u00020\u0015H\u0016R\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\nR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\n¨\u0006\u0018"}, d2 = {"Lcom/bytedance/bdturing/verify/request/UpSmsRequest;", "Lcom/bytedance/bdturing/verify/request/AbstractRequest;", "verifyTicket", "", "channelMobile", "smsContent", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getChannelMobile", "()Ljava/lang/String;", "setChannelMobile", "(Ljava/lang/String;)V", "getSmsContent", "setSmsContent", "getVerifyTicket", "setVerifyTicket", "buildUrl", "", "queryBuilder", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "getEventLimits", "", "getServiceType", "getType", "BdTuringSdk_i18nRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.bdturing.f.a.m */
public final class UpSmsRequest extends AbstractRequest {

    /* renamed from: a */
    private String f11213a;

    /* renamed from: b */
    private String f11214b;

    /* renamed from: c */
    private String f11215c;

    public UpSmsRequest() {
        this(null, null, null, 7, null);
    }

    @Override // com.bytedance.bdturing.verify.request.AbstractRequest
    /* renamed from: f */
    public int mo14348f() {
        return 6;
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
        C3542b.m14904a(sb, "decision_config", "block-upsms");
        C3542b.m14903a(sb, "is_turing", 1);
        if (!TextUtils.isEmpty(this.f11213a)) {
            C3542b.m14904a(sb, "verify_ticket", this.f11213a);
        }
        C3542b.m14904a(sb, "channel_mobile", this.f11214b);
        C3542b.m14904a(sb, "sms_content", this.f11215c);
        C3542b.m14903a(sb, "use_turing_bridge", 1);
    }

    public UpSmsRequest(String str, String str2, String str3) {
        Intrinsics.checkParameterIsNotNull(str, "verifyTicket");
        Intrinsics.checkParameterIsNotNull(str2, "channelMobile");
        Intrinsics.checkParameterIsNotNull(str3, "smsContent");
        this.f11213a = str;
        this.f11214b = str2;
        this.f11215c = str3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ UpSmsRequest(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
    }
}
