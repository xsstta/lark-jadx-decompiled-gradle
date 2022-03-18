package com.bytedance.ee.bear.document.entersuite;

import com.bytedance.ee.bear.browser.C4933k;
import com.bytedance.ee.bear.browser.plugin.AbstractC4958n;
import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.contract.offline.OfflineDoc;
import com.bytedance.ee.bear.document.C6095s;
import com.bytedance.ee.bear.document.DocViewModel;
import com.bytedance.ee.bear.document.DocumentPlugin;
import com.bytedance.ee.bear.rn.RnBaseProtocol;
import com.bytedance.ee.bear.thread.C11678b;
import io.reactivex.AbstractC68307f;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import org.koin.java.KoinJavaComponent;

public class EnterSuitePlugin extends DocumentPlugin {
    public /* synthetic */ void lambda$onAttachToUIContainer$0$EnterSuitePlugin(String str) throws Exception {
        DocViewModel docViewModel = getDocViewModel();
        if (docViewModel != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new OfflineDoc(docViewModel.getToken(), docViewModel.getDocumentTypeValue()));
            ((RnBaseProtocol) KoinJavaComponent.m268610a(RnBaseProtocol.class)).mo40307a(arrayList);
        }
    }

    public /* synthetic */ void lambda$onDetachFromUIContainer$2$EnterSuitePlugin(String str) throws Exception {
        DocViewModel docViewModel = getDocViewModel();
        if (docViewModel != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new OfflineDoc(docViewModel.getToken(), docViewModel.getDocumentTypeValue()));
            ((RnBaseProtocol) KoinJavaComponent.m268610a(RnBaseProtocol.class)).mo40310b(arrayList);
        }
    }

    public void onAttachToUIContainer(C6095s sVar, AbstractC4958n nVar) {
        super.onAttachToUIContainer((C4943e) sVar, nVar);
        AbstractC68307f.m265083a("").mo237985a(C11678b.m48480d()).mo238001b(new Consumer() {
            /* class com.bytedance.ee.bear.document.entersuite.$$Lambda$EnterSuitePlugin$2HrXYJ9NxdZpBxllR2SLhIl3zfA */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                EnterSuitePlugin.this.lambda$onAttachToUIContainer$0$EnterSuitePlugin((String) obj);
            }
        }, $$Lambda$EnterSuitePlugin$_D2wY6680owEI6Lc6t_LkBjJGqI.INSTANCE);
    }

    public void onDetachFromUIContainer(C6095s sVar, AbstractC4958n nVar) {
        super.onDetachFromUIContainer((C4933k) sVar, nVar);
        AbstractC68307f.m265083a("").mo237985a(C11678b.m48480d()).mo238001b(new Consumer() {
            /* class com.bytedance.ee.bear.document.entersuite.$$Lambda$EnterSuitePlugin$PePbH7b_o4xeGy4jY06ei1eyAAw */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                EnterSuitePlugin.this.lambda$onDetachFromUIContainer$2$EnterSuitePlugin((String) obj);
            }
        }, $$Lambda$EnterSuitePlugin$1BU0NBwUJpw7hk9JUlqS5FtU5I.INSTANCE);
    }
}
