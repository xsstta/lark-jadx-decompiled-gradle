package com.bytedance.ee.bear.document.tips;

import android.text.TextUtils;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.ee.bear.browser.plugin.AbstractC4958n;
import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.contract.AbstractC5233x;
import com.bytedance.ee.bear.contract.C5084ad;
import com.bytedance.ee.bear.contract.C5234y;
import com.bytedance.ee.bear.contract.ConnectionService;
import com.bytedance.ee.bear.contract.doc.C5130a;
import com.bytedance.ee.bear.document.DocTipsLayout;
import com.bytedance.ee.bear.document.DocumentMetadata;
import com.bytedance.ee.bear.document.EditorAbility;
import com.bytedance.ee.bear.document.tips.TipsController;
import com.bytedance.ee.bear.document.titlebar.TitlePlugin;
import com.bytedance.ee.bear.domain.C6313i;
import com.bytedance.ee.bear.facade.common.widget.ErrorTipsView;
import com.bytedance.ee.bear.jsbridge.AbstractC7947h;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.notification.AbstractC10318c;
import com.bytedance.ee.bear.route.AbstractC10740f;
import com.bytedance.ee.log.C13479a;
import com.larksuite.suite.R;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.koin.java.KoinJavaComponent;

/* access modifiers changed from: package-private */
public class TipsController implements LifecycleObserver {

    /* renamed from: a */
    public final C4943e f17180a;

    /* renamed from: b */
    public DocTipsLayout f17181b;

    /* renamed from: c */
    public String f17182c;

    /* renamed from: d */
    private final AbstractC4958n f17183d;

    /* renamed from: e */
    private AbstractC10318c.AbstractC10319a f17184e = new C6167a(this);

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo24910b() {
        C13479a.m54764b("TipsController", "hideErrorTips");
        this.f17181b.mo22425b();
    }

    /* renamed from: c */
    public void mo24911c() {
        this.f17180a.mo19549a(TitlePlugin.class, $$Lambda$jVOgw0J0dZHvkuY9mB9wssxPSiY.INSTANCE);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy() {
        ((AbstractC10318c) KoinJavaComponent.m268610a(AbstractC10318c.class)).mo39425b(this.f17184e);
    }

    /* renamed from: d */
    private void m24909d() {
        C5084ad.m20847d().mo20037a().mo5923a(this.f17180a.mo19566h(), new AbstractC1178x() {
            /* class com.bytedance.ee.bear.document.tips.$$Lambda$TipsController$ebgO6dmj4hsMvXlT5uOPWXjSzA */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                TipsController.m269307lambda$ebgO6dmj4hsMvXlT5uOPWXjSzA(TipsController.this, (ConnectionService.NetworkState) obj);
            }
        });
    }

    /* renamed from: e */
    private void m24911e() {
        C13479a.m54764b("TipsController", "onSetBanner");
        this.f17181b.setNoNetworkTip(m24912f());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo24907a() {
        C13479a.m54764b("TipsController", "hideAtTips");
        this.f17181b.mo22427c();
    }

    /* renamed from: f */
    private String m24912f() {
        String documentType = ((EditorAbility) this.f17180a.mo19551b(EditorAbility.class)).mo24602q().getDocumentType();
        if (TextUtils.equals(documentType, C8275a.f22371d.mo32553a()) || TextUtils.equals(documentType, C8275a.f22378k.mo32553a())) {
            return m24904a(R.string.Doc_Facade_SyncedNextOnline);
        }
        if (TextUtils.equals(documentType, C8275a.f22372e.mo32553a())) {
            return m24904a(R.string.Doc_Facade_SheetSyncedNextOnline);
        }
        if (TextUtils.equals(documentType, C8275a.f22374g.mo32553a())) {
            return m24904a(R.string.Doc_Facade_SyncedNextOnline);
        }
        if (TextUtils.equals(documentType, C8275a.f22376i.mo32553a())) {
            return m24904a(R.string.Doc_Facade_SlideNoNetwork);
        }
        if (TextUtils.equals(documentType, C8275a.f22377j.mo32553a())) {
            return m24904a(R.string.Doc_Facade_SyncedNextOnline);
        }
        return m24904a(R.string.Doc_Facade_DocNoNetNoEdit);
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.document.tips.TipsController$a */
    public static class C6167a implements AbstractC10318c.AbstractC10319a {

        /* renamed from: a */
        private WeakReference<TipsController> f17185a;

        public C6167a(TipsController tipsController) {
            this.f17185a = new WeakReference<>(tipsController);
        }

        /* renamed from: b */
        private void m24919b(String str) {
            AbstractC5233x b = C5234y.m21391b();
            HashMap hashMap = new HashMap(b.mo21086c("docCommonParams"));
            hashMap.put("location", "android_lark");
            hashMap.put("announcement_id", str);
            C13479a.m54772d("TipsController", "reportNotificationView, params = " + hashMap);
            b.mo21084b("ccm_announcement_view", hashMap);
        }

        @Override // com.bytedance.ee.bear.notification.AbstractC10318c.AbstractC10319a
        /* renamed from: a */
        public void mo24913a(String str) {
            TipsController tipsController = this.f17185a.get();
            if (tipsController != null) {
                DocTipsLayout docTipsLayout = tipsController.f17181b;
                if (TextUtils.equals(str, docTipsLayout.getNotificationView().mo39431b())) {
                    docTipsLayout.getClass();
                    docTipsLayout.post(new Runnable() {
                        /* class com.bytedance.ee.bear.document.tips.$$Lambda$9vnJnYqy7yN7GyiJMpUeDOTEgjo */

                        public final void run() {
                            DocTipsLayout.this.mo22428d();
                        }
                    });
                }
            }
        }

        @Override // com.bytedance.ee.bear.notification.AbstractC10318c.AbstractC10319a
        /* renamed from: a */
        public void mo24914a(String str, List<String> list, String str2) {
            boolean z;
            boolean z2;
            TipsController tipsController = this.f17185a.get();
            if (tipsController != null) {
                C4943e eVar = tipsController.f17180a;
                if (!eVar.mo19569k()) {
                    DocumentMetadata q = ((EditorAbility) eVar.mo19551b(EditorAbility.class)).mo24602q();
                    DocTipsLayout docTipsLayout = tipsController.f17181b;
                    AbstractC10318c.AbstractC10320b notificationView = docTipsLayout.getNotificationView();
                    String str3 = C6313i.m25327a().mo25399g(q.getUrl()).f17446a;
                    Iterator<String> it = list.iterator();
                    while (true) {
                        z = true;
                        if (it.hasNext()) {
                            if (TextUtils.equals(str3, it.next())) {
                                z2 = true;
                                break;
                            }
                        } else {
                            z2 = false;
                            break;
                        }
                    }
                    if (q.isAnnounceDoc() || !z2) {
                        z = false;
                    }
                    docTipsLayout.post(new Runnable(z, tipsController, docTipsLayout, str, str2, notificationView, q) {
                        /* class com.bytedance.ee.bear.document.tips.$$Lambda$TipsController$a$Qw40j8aXtOVYIUJ4HnEXYkfZKlE */
                        public final /* synthetic */ boolean f$1;
                        public final /* synthetic */ TipsController f$2;
                        public final /* synthetic */ DocTipsLayout f$3;
                        public final /* synthetic */ String f$4;
                        public final /* synthetic */ String f$5;
                        public final /* synthetic */ AbstractC10318c.AbstractC10320b f$6;
                        public final /* synthetic */ DocumentMetadata f$7;

                        {
                            this.f$1 = r2;
                            this.f$2 = r3;
                            this.f$3 = r4;
                            this.f$4 = r5;
                            this.f$5 = r6;
                            this.f$6 = r7;
                            this.f$7 = r8;
                        }

                        public final void run() {
                            TipsController.C6167a.lambda$Qw40j8aXtOVYIUJ4HnEXYkfZKlE(TipsController.C6167a.this, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, this.f$7);
                        }
                    });
                }
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public /* synthetic */ void m24918a(boolean z, TipsController tipsController, DocTipsLayout docTipsLayout, String str, String str2, AbstractC10318c.AbstractC10320b bVar, DocumentMetadata qVar) {
            if (z) {
                tipsController.mo24911c();
                docTipsLayout.mo22423a(str, str2);
                m24919b(str);
                tipsController.f17182c = str;
            } else {
                docTipsLayout.mo22428d();
            }
            if (C6313i.m25327a().mo25389b(bVar.mo39432c(), qVar.getUrl())) {
                docTipsLayout.mo22428d();
            }
        }
    }

    /* renamed from: a */
    private String m24904a(int i) {
        return this.f17183d.mo19593b().getString(i);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m24908c(String str) {
        ((AbstractC10740f) KoinJavaComponent.m268610a(AbstractC10740f.class)).mo17292a(C5130a.m20993a(str, "tab_notice"));
        m24907b(this.f17182c);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m24905a(ConnectionService.NetworkState networkState) {
        C13479a.m54764b("TipsController", "Network changed:" + networkState);
        if (networkState == null) {
            return;
        }
        if (networkState.mo20041b()) {
            this.f17181b.mo22420a();
            return;
        }
        String f = m24912f();
        mo24911c();
        this.f17181b.mo22421a(f);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m24910d(String str) {
        this.f17181b.mo22428d();
        ((AbstractC10318c) KoinJavaComponent.m268610a(AbstractC10318c.class)).mo39424a(str);
        m24906a(str);
    }

    /* renamed from: a */
    private void m24906a(String str) {
        AbstractC5233x b = C5234y.m21391b();
        HashMap hashMap = new HashMap(b.mo21086c("docCommonParams"));
        hashMap.put("location", "android_lark");
        hashMap.put("announcement_id", str);
        hashMap.put("click", "close");
        hashMap.put("target", "none");
        C13479a.m54772d("TipsController", "reportNotificationClose, params = " + hashMap);
        b.mo21084b("ccm_announcement_click", hashMap);
    }

    /* renamed from: b */
    private void m24907b(String str) {
        AbstractC5233x b = C5234y.m21391b();
        HashMap hashMap = new HashMap(b.mo21086c("docCommonParams"));
        hashMap.put("location", "android_lark");
        hashMap.put("announcement_id", str);
        hashMap.put("click", "open");
        hashMap.put("target", "none");
        C13479a.m54772d("TipsController", "reportNotificationOpen, params = " + hashMap);
        b.mo21084b("ccm_announcement_click", hashMap);
    }

    TipsController(C4943e eVar, AbstractC4958n nVar) {
        this.f17180a = eVar;
        this.f17183d = nVar;
        DocTipsLayout docTipsLayout = (DocTipsLayout) nVar.mo19583a(R.id.doc_main_tips_layout);
        this.f17181b = docTipsLayout;
        AbstractC10318c.AbstractC10320b notificationView = docTipsLayout.getNotificationView();
        notificationView.mo39428a(new AbstractC10318c.AbstractC10320b.AbstractC10321a() {
            /* class com.bytedance.ee.bear.document.tips.$$Lambda$TipsController$kmyY_KnAnTuNlOVz0qUFnr6VSXg */

            @Override // com.bytedance.ee.bear.notification.AbstractC10318c.AbstractC10320b.AbstractC10321a
            public final void onUserClose(String str) {
                TipsController.lambda$kmyY_KnAnTuNlOVz0qUFnr6VSXg(TipsController.this, str);
            }
        });
        notificationView.mo39429a(new AbstractC10318c.AbstractC10320b.AbstractC10322b() {
            /* class com.bytedance.ee.bear.document.tips.$$Lambda$TipsController$slNCk5_rdyLrVUV2I9bw7riAifI */

            @Override // com.bytedance.ee.bear.notification.AbstractC10318c.AbstractC10320b.AbstractC10322b
            public final void onLinkClick(String str) {
                TipsController.lambda$slNCk5_rdyLrVUV2I9bw7riAifI(TipsController.this, str);
            }
        });
        ((AbstractC10318c) KoinJavaComponent.m268610a(AbstractC10318c.class)).mo39423a(this.f17184e);
        m24911e();
        eVar.mo19566h().getLifecycle().addObserver(this);
        m24909d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo24908a(String str, AbstractC7947h hVar) {
        C13479a.m54764b("TipsController", "showAtTips:" + str);
        mo24911c();
        this.f17181b.mo22422a(str, hVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo24909a(String str, String str2, String str3, ErrorTipsView.TipsType tipsType, boolean z, String str4, String str5, ErrorTipsView.AbstractC7725a aVar) {
        C13479a.m54764b("TipsController", "showErrorTips:" + str + "with link : " + str3 + " action:" + str4 + " actionText:" + str5);
        mo24911c();
        this.f17181b.mo22424a(str, str2, str3, z, str4, str5, tipsType, aVar);
    }
}
