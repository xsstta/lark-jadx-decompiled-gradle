package com.bytedance.ee.bear.webview.fps;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.bytedance.apm.trace.p155a.C3069b;
import com.bytedance.ee.larkwebview.base.LarkWebView;

public class FpsWebViewV2 extends LarkWebView {

    /* renamed from: a */
    private String f31599a;

    /* renamed from: b */
    private C3069b f31600b;

    /* renamed from: c */
    private boolean f31601c;

    @Override // com.bytedance.ee.larkwebview.base.LarkWebView
    public void destroy() {
        super.destroy();
        mo19616a();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo19616a();
    }

    /* renamed from: a */
    private void mo19616a() {
        C3069b bVar = this.f31600b;
        if (bVar != null) {
            bVar.mo12926b();
            this.f31600b = null;
        }
    }

    /* renamed from: b */
    private void mo22336b() {
        if (this.f31600b == null) {
            String str = "docs_" + getSceneTag();
            if (TextUtils.isEmpty(str)) {
                str = "FpsWebViewV2";
            }
            this.f31600b = new C3069b(str);
        }
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0018 */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0056  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String getSceneTag() {
        /*
            r3 = this;
            java.lang.String r0 = r3.f31599a
            if (r0 == 0) goto L_0x0005
            return r0
        L_0x0005:
            r0 = 0
            android.content.res.Resources r1 = r3.getResources()     // Catch:{ Exception -> 0x0018 }
            android.view.ViewParent r2 = r3.getParent()     // Catch:{ Exception -> 0x0018 }
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2     // Catch:{ Exception -> 0x0018 }
            int r2 = r2.getId()     // Catch:{ Exception -> 0x0018 }
            java.lang.String r0 = r1.getResourceEntryName(r2)     // Catch:{ Exception -> 0x0018 }
        L_0x0018:
            android.content.res.Resources r1 = r3.getResources()     // Catch:{ Exception -> 0x0025 }
            int r2 = r3.getId()     // Catch:{ Exception -> 0x0025 }
            java.lang.String r1 = r1.getResourceEntryName(r2)     // Catch:{ Exception -> 0x0025 }
            goto L_0x002d
        L_0x0025:
            java.lang.Class r1 = r3.getClass()
            java.lang.String r1 = r1.getSimpleName()
        L_0x002d:
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L_0x0050
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L_0x0050
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r0 = "/"
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = r2.toString()
            r3.f31599a = r0
            goto L_0x0059
        L_0x0050:
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 == 0) goto L_0x0057
            r0 = r1
        L_0x0057:
            r3.f31599a = r0
        L_0x0059:
            java.lang.String r0 = r3.f31599a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.webview.fps.FpsWebViewV2.getSceneTag():java.lang.String");
    }

    public FpsWebViewV2(Context context) {
        super(context);
    }

    public FpsWebViewV2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.larkwebview.base.LarkWebView
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        if (!this.f31601c) {
            this.f31601c = true;
            mo22336b();
            C3069b bVar = this.f31600b;
            if (bVar != null) {
                bVar.mo12923a();
            }
        }
        super.onScrollChanged(i, i2, i3, i4);
    }
}
