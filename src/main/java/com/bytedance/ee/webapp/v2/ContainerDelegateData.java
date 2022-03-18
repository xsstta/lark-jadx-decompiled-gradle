package com.bytedance.ee.webapp.v2;

import com.tt.miniapphost.p3362a.p3367e.C67462h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/bytedance/ee/webapp/v2/ContainerDelegateData;", "", "()V", "url", "", "getUrl", "()Ljava/lang/String;", "setUrl", "(Ljava/lang/String;)V", "webAppContext", "Lcom/tt/miniapphost/appcontainer/impl/WebAppContext;", "getWebAppContext", "()Lcom/tt/miniapphost/appcontainer/impl/WebAppContext;", "setWebAppContext", "(Lcom/tt/miniapphost/appcontainer/impl/WebAppContext;)V", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.ee.webapp.v2.a */
public final class ContainerDelegateData {

    /* renamed from: a */
    private String f36169a = "";

    /* renamed from: b */
    private C67462h f36170b;

    /* renamed from: a */
    public final String mo51047a() {
        return this.f36169a;
    }

    /* renamed from: b */
    public final C67462h mo51050b() {
        return this.f36170b;
    }

    /* renamed from: a */
    public final void mo51048a(C67462h hVar) {
        this.f36170b = hVar;
    }

    /* renamed from: a */
    public final void mo51049a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f36169a = str;
    }
}
