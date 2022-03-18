package com.bytedance.ee.bear.rn.middleground.business.version;

import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.rn.RnVersionProtocol;
import com.bytedance.ee.bear.rn.middleground.common.ReferenceCounter;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p700c.C13598b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\r\u001a\u00020\u000eH\u0002J\b\u0010\u000f\u001a\u00020\u000eH\u0002J\b\u0010\u0010\u001a\u00020\u0003H\u0002J\u0010\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\fH\u0016J\b\u0010\u0013\u001a\u00020\u000eH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/bytedance/ee/bear/rn/middleground/business/version/VersionSDK;", "Lcom/bytedance/ee/bear/rn/RnVersionProtocol;", "docToken", "", "documentType", "Lcom/bytedance/ee/bear/list/dto/DocumentType;", "(Ljava/lang/String;Lcom/bytedance/ee/bear/list/dto/DocumentType;)V", "mRealObserver", "Lcom/bytedance/ee/bear/rn/jsmodel/jsrequest/JSDocObserver;", "mReferenceCounter", "Lcom/bytedance/ee/bear/rn/middleground/common/ReferenceCounter;", "mVersionManagerObserver", "Lcom/bytedance/ee/bear/rn/RnVersionProtocol$VersionManagerObserver;", "beginSyncVersion", "", "endSyncVersion", "info", "registerVersionManagerObserver", "observer", "unregisterVersionManagerObserver", "Companion", "rn-bridge-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.rn.middleground.business.c.a */
public final class VersionSDK implements RnVersionProtocol {

    /* renamed from: c */
    public static final Companion f28660c = new Companion(null);

    /* renamed from: a */
    public final String f28661a;

    /* renamed from: b */
    public final C8275a f28662b;

    /* renamed from: d */
    private final ReferenceCounter f28663d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/rn/middleground/business/version/VersionSDK$Companion;", "", "()V", "TAG", "", "rn-bridge-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.rn.middleground.business.c.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    private final String m44372a() {
        return "objToken = " + C13598b.m55200g(this.f28661a) + ", fileType = " + this.f28662b;
    }

    public VersionSDK(String str, C8275a aVar) {
        Intrinsics.checkParameterIsNotNull(str, "docToken");
        Intrinsics.checkParameterIsNotNull(aVar, "documentType");
        this.f28661a = str;
        this.f28662b = aVar;
        this.f28663d = new ReferenceCounter("version:" + str + ':' + aVar.mo32555b() + ':' + aVar.mo32553a());
        StringBuilder sb = new StringBuilder();
        sb.append(this);
        sb.append(", ");
        sb.append(m44372a());
        C13479a.m54764b("VersionSDK", sb.toString());
    }
}
