package com.bytedance.ee.bear.rn.jsmodel.jsrequest;

import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\u0010\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/bytedance/ee/bear/rn/jsmodel/jsrequest/JSDocRequest;", "Lcom/bytedance/ee/bear/rn/jsmodel/jsrequest/JSRequest;", "()V", "mRequestId", "", "getRequestId", "getType", "setRequestId", "", "requestId", "Companion", "rn-bridge-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.rn.a.a.b */
public final class JSDocRequest extends JSRequest {

    /* renamed from: a */
    public static final Companion f28545a = new Companion(null);

    /* renamed from: b */
    private String f28546b = "";

    @Override // com.bytedance.ee.bridge.p597a.AbstractC12581a
    /* renamed from: a */
    public String mo40268a() {
        return "requestFromDocs";
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/rn/jsmodel/jsrequest/JSDocRequest$Companion;", "", "()V", "DUMMY_REQUEST_ID", "", "rn-bridge-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.rn.a.a.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.bytedance.ee.bear.rn.jsmodel.jsrequest.JSRequest, com.bytedance.ee.bridge.p597a.AbstractC12581a
    /* renamed from: b */
    public String mo40270b() {
        return this.f28546b;
    }

    /* renamed from: a */
    public final void mo40269a(String str) {
        boolean z;
        String str2 = str;
        if (str2 == null || StringsKt.isBlank(str2)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f28546b = "";
        } else if (str != null) {
            this.f28546b = str;
        } else {
            throw new TypeCastException("null cannot be cast to non-null type kotlin.String");
        }
    }
}
