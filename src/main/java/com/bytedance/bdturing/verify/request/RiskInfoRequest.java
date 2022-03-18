package com.bytedance.bdturing.verify.request;

import com.bytedance.bdturing.p209e.C3542b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u001b\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u0014\u0010\u0013\u001a\u00020\u00142\n\u0010\u0015\u001a\u00060\u0016j\u0002`\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0010H\u0016J\b\u0010\u0019\u001a\u00020\u0003H\u0016J\b\u0010\u001a\u001a\u00020\u0010H\u0016R$\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8V@VX\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001b"}, d2 = {"Lcom/bytedance/bdturing/verify/request/RiskInfoRequest;", "Lcom/bytedance/bdturing/verify/request/AbstractRequest;", "riskInfo", "", "(Ljava/lang/String;)V", "uid", "(Ljava/lang/String;Ljava/lang/String;)V", "value", "", "fullscreen", "getFullscreen", "()Z", "setFullscreen", "(Z)V", "innerRequest", "mMaxEvents", "", "getRiskInfo", "()Ljava/lang/String;", "buildUrl", "", "queryBuilder", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "getEventLimits", "getServiceType", "getType", "BdTuringSdk_i18nRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.bdturing.f.a.j */
public final class RiskInfoRequest extends AbstractRequest {

    /* renamed from: a */
    private AbstractRequest f11205a;

    /* renamed from: b */
    private int f11206b;

    /* renamed from: c */
    private final String f11207c;

    @Override // com.bytedance.bdturing.verify.request.AbstractRequest
    /* renamed from: h */
    public int mo14350h() {
        return this.f11206b;
    }

    @Override // com.bytedance.bdturing.verify.request.AbstractRequest
    /* renamed from: b */
    public boolean mo14343b() {
        AbstractRequest aVar = this.f11205a;
        if (aVar != null) {
            return aVar.mo14343b();
        }
        return false;
    }

    @Override // com.bytedance.bdturing.verify.request.AbstractRequest
    /* renamed from: f */
    public int mo14348f() {
        AbstractRequest aVar = this.f11205a;
        if (aVar != null) {
            return aVar.mo14348f();
        }
        return 0;
    }

    @Override // com.bytedance.bdturing.verify.request.AbstractRequest
    /* renamed from: g */
    public String mo14349g() {
        String g;
        AbstractRequest aVar = this.f11205a;
        if (aVar == null || (g = aVar.mo14349g()) == null) {
            return "";
        }
        return g;
    }

    @Override // com.bytedance.bdturing.verify.request.AbstractRequest
    /* renamed from: a */
    public void mo14341a(boolean z) {
        AbstractRequest aVar = this.f11205a;
        if (aVar != null) {
            aVar.mo14341a(z);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public RiskInfoRequest(String str) {
        this(null, str);
        Intrinsics.checkParameterIsNotNull(str, "riskInfo");
    }

    @Override // com.bytedance.bdturing.verify.request.AbstractRequest
    /* renamed from: a */
    public void mo14340a(StringBuilder sb) {
        Intrinsics.checkParameterIsNotNull(sb, "queryBuilder");
        AbstractRequest aVar = this.f11205a;
        if (aVar != null) {
            aVar.mo14340a(sb);
        }
        C3542b.m14904a(sb, "verify_data", this.f11207c);
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00ca, code lost:
        if (r4.equals("whirl") != false) goto L_0x0127;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00e6, code lost:
        if (r4.equals("slide") != false) goto L_0x0127;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00ef, code lost:
        if (r4.equals("text") != false) goto L_0x0127;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0125, code lost:
        if (r4.equals("3d") != false) goto L_0x0127;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0127, code lost:
        r16.f11205a = new com.bytedance.bdturing.verify.request.ImageRequest(0, 1, null);
     */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0166  */
    /* JADX WARNING: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public RiskInfoRequest(java.lang.String r17, java.lang.String r18) {
        /*
        // Method dump skipped, instructions count: 550
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.bdturing.verify.request.RiskInfoRequest.<init>(java.lang.String, java.lang.String):void");
    }
}
