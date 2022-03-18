package com.bytedance.ee.bear.document;

import android.text.TextUtils;
import com.bytedance.ee.bear.contract.AbstractC5089af;
import com.bytedance.ee.bear.contract.AccountService;
import com.bytedance.ee.bear.document.reloadwebview.C6083a;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.common.C13606d;
import com.bytedance.ee.util.common.C13608f;
import org.koin.java.KoinJavaComponent;

/* access modifiers changed from: package-private */
public class EditorInit$1 extends AccountService.AccountChangeUICallback {
    final /* synthetic */ C6282w this$0;

    EditorInit$1(C6282w wVar) {
        this.this$0 = wVar;
    }

    static /* synthetic */ void lambda$onChangeInUi$1(Throwable th) throws Exception {
        C13479a.m54761a("EditorInit", th);
        C13606d.m55245a("EditorInit", th);
    }

    static /* synthetic */ void lambda$onChangeInUi$3(Throwable th) throws Exception {
        C13479a.m54761a("EditorInit", th);
        C13606d.m55245a("EditorInit", th);
    }

    @Override // com.bytedance.ee.bear.contract.AccountService.AccountChangeUICallback
    public void onChangeInUi(AccountService.Account account) {
        if (account == null || !account.mo19677a()) {
            C13479a.m54764b("EditorInit", "  account == null, return " + account);
            return;
        }
        String str = account.f14584a;
        C13479a.m54764b("EditorInit", "currentUid = " + str + ", mLatestUid = " + this.this$0.f17404a);
        if (TextUtils.equals(this.this$0.f17404a, str)) {
            C13479a.m54764b("EditorInit", "same uid , return");
            return;
        }
        if (TextUtils.isEmpty(this.this$0.f17404a) || C6083a.f16962c != 0) {
            ((AbstractC5089af) KoinJavaComponent.m268610a(AbstractC5089af.class)).mo20190b(false).mo238001b($$Lambda$EditorInit$1$TMea2vPVq5EOaOvp9qcW7sMbjo.INSTANCE, $$Lambda$EditorInit$1$13MEBxm3rdWk14oot8J3Qkkm6m4.INSTANCE);
        } else {
            ((AbstractC5089af) KoinJavaComponent.m268610a(AbstractC5089af.class)).mo20182a(false).mo238001b($$Lambda$EditorInit$1$OCmGsifubFM8hV6lc0QJtwmLBo.INSTANCE, $$Lambda$EditorInit$1$4htBZV8mPTdf2c4n5R1ImmvtE8.INSTANCE);
        }
        this.this$0.f17404a = str;
        C13608f.m55249a($$Lambda$EditorInit$1$zmRZzNALiBZfARau28080v7awLI.INSTANCE);
    }
}
