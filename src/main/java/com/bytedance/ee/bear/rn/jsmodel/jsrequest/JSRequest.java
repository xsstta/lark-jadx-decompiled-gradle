package com.bytedance.ee.bear.rn.jsmodel.jsrequest;

import com.bytedance.ee.bridge.p597a.AbstractC12581a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/bytedance/ee/bear/rn/jsmodel/jsrequest/JSRequest;", "Lcom/bytedance/ee/bridge/client/AbsJSRequest;", "()V", "mMessage", "", "getRequestId", "getRequestMessage", "setMessage", "", "message", "rn-bridge-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.rn.a.a.h */
public abstract class JSRequest extends AbstractC12581a {

    /* renamed from: a */
    private String f28549a;

    @Override // com.bytedance.ee.bridge.p597a.AbstractC12581a
    /* renamed from: b */
    public String mo40270b() {
        return "";
    }

    @Override // com.bytedance.ee.bridge.p597a.AbstractC12581a
    /* renamed from: c */
    public String mo40278c() {
        String str = this.f28549a;
        if (str != null) {
            return str;
        }
        return "";
    }

    /* renamed from: b */
    public final void mo40277b(String str) {
        Intrinsics.checkParameterIsNotNull(str, "message");
        this.f28549a = str;
    }
}
