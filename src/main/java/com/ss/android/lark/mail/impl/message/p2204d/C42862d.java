package com.ss.android.lark.mail.impl.message.p2204d;

import android.content.Context;
import android.text.TextUtils;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.entity.C42099l;

/* renamed from: com.ss.android.lark.mail.impl.message.d.d */
public class C42862d extends AbstractC42849a {
    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.message.p2204d.AbstractC42849a
    /* renamed from: a */
    public C42851b mo153798a() {
        return new C42863e();
    }

    @Override // com.ss.android.lark.mail.impl.message.p2204d.AbstractC42849a
    /* renamed from: a */
    public void mo153801a(String str, Context context, String str2) {
        super.mo153801a(str, context, str2);
        Log.m165389i("AsynWebViewRender", "testAsynRender tryToAsynWebViewRender");
        String a = this.f109085d.mo153809a(str);
        C42099l b = this.f109085d.mo153816b(str);
        if (!TextUtils.isEmpty(a) && b != null) {
            Log.m165389i("AsynWebViewRender", "testAsynRender tryToAsynWebViewRender doRenderWebView 11:");
            mo153802a(str, a, b, context, str2);
            Log.m165389i("AsynWebViewRender", "testAsynRender tryToAsynWebViewRender doRenderWebView 22:");
        }
    }
}
