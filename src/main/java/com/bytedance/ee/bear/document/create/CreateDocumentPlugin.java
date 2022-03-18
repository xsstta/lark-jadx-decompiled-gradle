package com.bytedance.ee.bear.document.create;

import android.text.TextUtils;
import com.bytedance.ee.bear.browser.C4933k;
import com.bytedance.ee.bear.browser.plugin.AbstractC4958n;
import com.bytedance.ee.bear.contract.create.DocumentCreateInfo;
import com.bytedance.ee.bear.contract.offline.OfflineDoc;
import com.bytedance.ee.bear.document.C6095s;
import com.bytedance.ee.bear.document.DocumentPlugin;
import com.bytedance.ee.bear.document.create.CreateDocumentPlugin;
import com.bytedance.ee.bear.domain.C6313i;
import com.bytedance.ee.bear.jsbridge.AbstractC7945d;
import com.bytedance.ee.bear.jsbridge.AbstractC7947h;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.list.p424c.AbstractC8149a;
import com.bytedance.ee.bear.route.AbstractC10740f;
import com.bytedance.ee.bear.route.RouteBean;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import io.reactivex.disposables.C68289a;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.util.Map;
import org.koin.java.KoinJavaComponent;

public class CreateDocumentPlugin extends DocumentPlugin {
    public final C68289a mDisposable = new C68289a();

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.document.create.CreateDocumentPlugin$a */
    public class C5724a implements AbstractC7945d<Void> {
        private C5724a() {
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public static /* synthetic */ void m23119a(DocumentCreateInfo documentCreateInfo) throws Exception {
            C13479a.m54764b("CreateDocumentPlugin", "createDocument success");
            ((AbstractC10740f) KoinJavaComponent.m268610a(AbstractC10740f.class)).mo17292a(documentCreateInfo.mo20275c());
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public static /* synthetic */ void m23118a(int i, OfflineDoc offlineDoc) throws Exception {
            C13479a.m54764b("CreateDocumentPlugin", "createOfflineDocument success");
            if (!TextUtils.isEmpty(offlineDoc.getFakeToken())) {
                String a = C6313i.m25327a().mo25382a(C8275a.m34050a(i), offlineDoc.getFakeToken(), "web_create");
                RouteBean routeBean = new RouteBean();
                routeBean.mo40615d(offlineDoc.getName());
                routeBean.mo40622h(a);
                ((AbstractC10740f) KoinJavaComponent.m268610a(AbstractC10740f.class)).mo17293a(a, routeBean);
            }
        }

        /* renamed from: a */
        public void handle(Void r7, AbstractC7947h hVar) {
            boolean z;
            Disposable disposable;
            int documentTypeValue = CreateDocumentPlugin.this.getDocViewModel().getDocumentTypeValue();
            String documentType = CreateDocumentPlugin.this.getDocViewModel().getDocumentType();
            if (documentTypeValue == 2 || documentTypeValue == 3) {
                z = true;
            } else {
                z = false;
            }
            boolean f = ((AbstractC8149a) KoinJavaComponent.m268610a(AbstractC8149a.class)).mo31525f();
            if (z) {
                disposable = ((AbstractC8149a) KoinJavaComponent.m268610a(AbstractC8149a.class)).mo31484a(documentTypeValue, "", documentType, f).mo237985a(C11678b.m48481e()).mo238001b(new Consumer(documentTypeValue) {
                    /* class com.bytedance.ee.bear.document.create.$$Lambda$CreateDocumentPlugin$a$4Yc677kSdnHNl26rpNaqlzbbzrY */
                    public final /* synthetic */ int f$0;

                    {
                        this.f$0 = r1;
                    }

                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj) {
                        CreateDocumentPlugin.C5724a.m23118a(this.f$0, (OfflineDoc) obj);
                    }
                }, $$Lambda$CreateDocumentPlugin$a$XuCUfhULZM85pjmJ6BwojO6hkPk.INSTANCE);
            } else {
                disposable = ((AbstractC8149a) KoinJavaComponent.m268610a(AbstractC8149a.class)).mo31486a(CreateDocumentPlugin.this.getContext(), documentTypeValue, "", documentType, f).mo237985a(C11678b.m48481e()).mo238001b($$Lambda$CreateDocumentPlugin$a$JcrXCGWEnoWh82cPcJVMqflbSM.INSTANCE, $$Lambda$CreateDocumentPlugin$a$FrmsSQpKIF1wOlTXKivAjbTAd8.INSTANCE);
            }
            CreateDocumentPlugin.this.mDisposable.mo237937a(disposable);
        }
    }

    @Override // com.bytedance.ee.bear.document.DocumentPlugin, com.bytedance.ee.bear.browser.plugin.lazy.AbstractC4952a
    public void getBridgeHandlers(Map<String, AbstractC7945d<?>> map) {
        map.put("biz.util.createNewPage", new C5724a());
    }

    public void onDetachFromUIContainer(C6095s sVar, AbstractC4958n nVar) {
        super.onDetachFromUIContainer((C4933k) sVar, nVar);
        this.mDisposable.mo237935a();
    }
}
