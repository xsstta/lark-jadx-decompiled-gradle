package com.bytedance.ee.bear.document.contactservice;

import com.bytedance.ee.bear.browser.C4933k;
import com.bytedance.ee.bear.browser.plugin.AbstractC4958n;
import com.bytedance.ee.bear.contract.ak;
import com.bytedance.ee.bear.document.C6095s;
import com.bytedance.ee.bear.document.DocumentPlugin;
import com.bytedance.ee.bear.jsbridge.AbstractC7945d;
import com.bytedance.ee.bear.jsbridge.AbstractC7947h;
import io.reactivex.disposables.C68289a;
import java.util.Map;

public class ContactServicePlugin extends DocumentPlugin {
    public final C68289a disposables = new C68289a();

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.document.contactservice.ContactServicePlugin$a */
    public class C5722a implements AbstractC7945d<Void> {
        private C5722a() {
        }

        /* renamed from: a */
        public void handle(Void r2, AbstractC7947h hVar) {
            ContactServicePlugin.this.disposables.mo237937a(ContactServicePlugin.this.getServiceFlowable(ak.class).mo238001b($$Lambda$ZWpgxc4_nO_8C_LGo4thXlaIHpE.INSTANCE, $$Lambda$ContactServicePlugin$a$shMKiRR5jYZqP_491W3zowzjnU.INSTANCE));
        }
    }

    @Override // com.bytedance.ee.bear.document.DocumentPlugin, com.bytedance.ee.bear.browser.plugin.lazy.AbstractC4952a
    public void getBridgeHandlers(Map<String, AbstractC7945d<?>> map) {
        map.put("biz.util.contactUs", new C5722a());
    }

    public void onDetachFromUIContainer(C6095s sVar, AbstractC4958n nVar) {
        super.onDetachFromUIContainer((C4933k) sVar, nVar);
        this.disposables.mo237935a();
    }
}
