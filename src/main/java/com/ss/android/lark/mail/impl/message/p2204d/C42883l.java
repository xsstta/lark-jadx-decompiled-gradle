package com.ss.android.lark.mail.impl.message.p2204d;

import android.content.Context;
import android.text.TextUtils;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.message.p2204d.C42851b;
import com.ss.android.lark.mail.impl.message.view.p2212c.C43194a;

/* renamed from: com.ss.android.lark.mail.impl.message.d.l */
public class C42883l extends AbstractC42849a {
    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.message.p2204d.AbstractC42849a
    /* renamed from: a */
    public C42851b mo153798a() {
        return new C42884m();
    }

    @Override // com.ss.android.lark.mail.impl.message.p2204d.AbstractC42849a
    /* renamed from: a */
    public void mo153801a(String str, Context context, String str2) {
        super.mo153801a(str, context, str2);
        Log.m165389i("UnReadPreLoader", "testAsynRender tryToAsynWebViewRender");
        C43194a b = C42859c.m170753a().mo153837b(context);
        if (this.f109085d.f109092a.containsKey(str) && b != null) {
            C42851b.C42858b bVar = this.f109085d.f109092a.get(str);
            Log.m165389i("UnReadPreLoader", "testAsynRender tryToAsynWebViewRender preLoadInfo:" + bVar);
            if (bVar != null && !TextUtils.isEmpty(bVar.f109138b) && bVar.f109137a != null) {
                Log.m165389i("UnReadPreLoader", "testAsynRender tryToAsynWebViewRender doRenderWebView 11:");
                C42879j.f109205a = true;
                mo153802a(str, bVar.f109138b, bVar.f109137a, context, str2);
                Log.m165389i("UnReadPreLoader", "testAsynRender tryToAsynWebViewRender doRenderWebView 22:");
            }
        }
    }
}
