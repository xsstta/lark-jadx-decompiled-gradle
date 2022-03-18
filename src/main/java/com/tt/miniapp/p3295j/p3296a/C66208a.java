package com.tt.miniapp.p3295j.p3296a;

import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.RenderViewManager;
import com.tt.miniapp.webbridge.WebBridge;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.tt.miniapp.j.a.a */
public class C66208a extends WebBridge {

    /* renamed from: a */
    private int f167121a;

    /* renamed from: b */
    private List<String> f167122b = Arrays.asList("getHostInfoSync", "hostLogin", "callHostMethod");

    /* access modifiers changed from: protected */
    @Override // com.tt.miniapp.webbridge.WebBridge
    public boolean interceptInvoke(String str) {
        return this.f167122b.contains(str);
    }

    public C66208a(int i, IAppContext iAppContext) {
        super(iAppContext);
        this.f167121a = i;
    }

    /* renamed from: a */
    public void mo231553a(int i, String str) {
        RenderViewManager renderViewManager = AppbrandApplicationImpl.getInst(this.appContext).getRenderViewManager();
        if (renderViewManager != null) {
            renderViewManager.invokeHandler(this.f167121a, i, str);
        }
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0054, code lost:
        if (r7.equals("hostLogin") == false) goto L_0x0036;
     */
    @Override // com.tt.miniapp.webbridge.WebBridge
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String handleInterceptedInvoke(java.lang.String r7, java.lang.String r8, int r9) {
        /*
        // Method dump skipped, instructions count: 172
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tt.miniapp.p3295j.p3296a.C66208a.handleInterceptedInvoke(java.lang.String, java.lang.String, int):java.lang.String");
    }
}
