package com.bytedance.ee.bear.document.web;

import android.text.TextUtils;
import android.webkit.WebSettings;
import com.bytedance.ee.bear.basesdk.services.C4511g;
import com.bytedance.ee.bear.contract.AccountService;
import com.bytedance.ee.bear.contract.al;
import com.bytedance.ee.bear.document.C5671b;
import com.bytedance.ee.log.C13479a;
import io.reactivex.functions.Consumer;

public class SimpleWebActivity extends CommonWebActivity {

    /* renamed from: i */
    C5671b f17423i;

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.document.web.CommonWebActivity
    /* renamed from: h */
    public void mo25272h() {
        C5671b bVar = new C5671b(mo30076n());
        this.f17423i = bVar;
        bVar.mo22659a().mo238001b(new Consumer<AccountService.Account>() {
            /* class com.bytedance.ee.bear.document.web.SimpleWebActivity.C62881 */

            /* renamed from: a */
            public void accept(AccountService.Account account) throws Exception {
                SimpleWebActivity.this.f17408a.loadUrl(SimpleWebActivity.this.mo25264a());
            }
        }, new Consumer<Throwable>() {
            /* class com.bytedance.ee.bear.document.web.SimpleWebActivity.C62892 */

            /* renamed from: a */
            public void accept(Throwable th) throws Exception {
                C13479a.m54759a("SimpleWebActivity", "set cookie error.", th);
            }
        });
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.document.web.CommonWebActivity
    /* renamed from: g */
    public void mo25271g() {
        WebSettings settings = this.f17408a.getSettings();
        String a = C6290a.m25233a(this);
        al d = C4511g.m18594d();
        if (TextUtils.isEmpty(a)) {
            a = "Mozilla/5.0 (Linux; Android 7.0; FRD-AL00 Build/HUAWEIFRD-AL00; wv) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/55.0.2883.91 Mobile Safari/537.36";
        }
        String n = d.mo17364n();
        if (n != null && n.endsWith("-SNAPSHOT")) {
            n.replace("-SNAPSHOT", "");
        }
        settings.setUserAgentString(a + " Bytedance Docs/" + d.mo17364n() + " DocsSDK/" + d.mo17364n() + " Type/" + "Default" + " " + d.mo17360i());
        StringBuilder sb = new StringBuilder();
        sb.append("initUserAgent: ua=");
        sb.append(settings.getUserAgentString());
        C13479a.m54772d("SimpleWebActivity", sb.toString());
    }
}
