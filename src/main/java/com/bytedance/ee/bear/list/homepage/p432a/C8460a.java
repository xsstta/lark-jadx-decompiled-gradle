package com.bytedance.ee.bear.list.homepage.p432a;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import com.bytedance.ee.bear.contract.ConnectionService;
import com.bytedance.ee.bear.docshost.AbstractC5586d;
import com.bytedance.ee.bear.domain.C6313i;
import com.bytedance.ee.bear.list.analysis.ListAnalysis;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.list.homepage.p432a.C8460a;
import com.bytedance.ee.bear.notification.AbstractC10318c;
import com.bytedance.ee.bear.route.AbstractC10740f;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p718t.C13742g;
import com.larksuite.suite.R;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.list.homepage.a.a */
public class C8460a implements AbstractC10318c.AbstractC10320b.AbstractC10322b {

    /* renamed from: a */
    public AbstractC10318c.AbstractC10320b f22843a;

    /* renamed from: b */
    private AbstractC10318c.AbstractC10319a f22844b;

    /* renamed from: c */
    private final Context f22845c;

    /* renamed from: d */
    private final AbstractC10740f f22846d = ((AbstractC10740f) KoinJavaComponent.m268610a(AbstractC10740f.class));

    /* renamed from: e */
    private FrameLayout f22847e;

    /* renamed from: f */
    private final View f22848f;

    /* renamed from: g */
    private final AbstractC8461a f22849g;

    /* renamed from: h */
    private String f22850h;

    /* renamed from: com.bytedance.ee.bear.list.homepage.a.a$a */
    public interface AbstractC8461a {
        /* renamed from: a */
        String mo31037a();

        /* renamed from: b */
        String mo31038b();
    }

    /* renamed from: b */
    private void m35043b() {
        C13479a.m54764b("NotificationPresenter", "init()...");
        this.f22843a = ((AbstractC10318c) KoinJavaComponent.m268610a(AbstractC10318c.class)).mo39422a();
        this.f22844b = new C8462b(this);
        ((AbstractC10318c) KoinJavaComponent.m268610a(AbstractC10318c.class)).mo39423a(this.f22844b);
    }

    /* renamed from: a */
    public void mo33075a() {
        C13479a.m54764b("NotificationPresenter", "destroy()...");
        if (this.f22844b != null) {
            ((AbstractC10318c) KoinJavaComponent.m268610a(AbstractC10318c.class)).mo39425b(this.f22844b);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.list.homepage.a.a$b */
    public static class C8462b implements AbstractC10318c.AbstractC10319a {

        /* renamed from: a */
        WeakReference<C8460a> f22851a;

        public C8462b(C8460a aVar) {
            this.f22851a = new WeakReference<>(aVar);
        }

        @Override // com.bytedance.ee.bear.notification.AbstractC10318c.AbstractC10319a
        /* renamed from: a */
        public void mo24913a(String str) {
            C13479a.m54764b("NotificationPresenter", "closeNotification()...nid = " + str);
            C8460a aVar = this.f22851a.get();
            if (aVar == null) {
                C13479a.m54764b("NotificationPresenter", "NotificationPresenter is null");
                return;
            }
            AbstractC10318c.AbstractC10320b bVar = aVar.f22843a;
            if (TextUtils.equals(str, bVar.mo39431b())) {
                bVar.getClass();
                C13742g.m55705a(new Runnable() {
                    /* class com.bytedance.ee.bear.list.homepage.p432a.$$Lambda$ZH31Mgt4ZuZ4k_HGFrVrEsdftHQ */

                    public final void run() {
                        AbstractC10318c.AbstractC10320b.this.mo39427a();
                    }
                });
            }
        }

        @Override // com.bytedance.ee.bear.notification.AbstractC10318c.AbstractC10319a
        /* renamed from: a */
        public void mo24914a(String str, List<String> list, String str2) {
            boolean z;
            C13479a.m54764b("NotificationPresenter", "showNotification()...nid = " + str);
            C8460a aVar = this.f22851a.get();
            if (aVar == null) {
                C13479a.m54775e("NotificationPresenter", "NotificationPresenter is null");
                return;
            }
            Iterator<String> it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (TextUtils.equals("explorer", it.next())) {
                        z = true;
                        break;
                    }
                } else {
                    z = false;
                    break;
                }
            }
            C13742g.m55705a(new Runnable(z, aVar, str, str2, aVar.f22843a) {
                /* class com.bytedance.ee.bear.list.homepage.p432a.$$Lambda$a$b$VwmdpLUzlpQwh9f9o4k2O0abS08 */
                public final /* synthetic */ boolean f$0;
                public final /* synthetic */ C8460a f$1;
                public final /* synthetic */ String f$2;
                public final /* synthetic */ String f$3;
                public final /* synthetic */ AbstractC10318c.AbstractC10320b f$4;

                {
                    this.f$0 = r1;
                    this.f$1 = r2;
                    this.f$2 = r3;
                    this.f$3 = r4;
                    this.f$4 = r5;
                }

                public final void run() {
                    C8460a.C8462b.m35050a(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4);
                }
            });
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public static /* synthetic */ void m35050a(boolean z, C8460a aVar, String str, String str2, AbstractC10318c.AbstractC10320b bVar) {
            if (z) {
                aVar.mo33077a(str, str2);
            } else {
                bVar.mo39427a();
            }
        }
    }

    /* renamed from: a */
    public void mo33076a(ConnectionService.NetworkState networkState) {
        C13479a.m54764b("NotificationPresenter", "onNetworkStateChanged()...networkState = " + networkState);
        if (this.f22847e == null) {
            return;
        }
        if (networkState == null || !networkState.mo20041b()) {
            this.f22847e.setVisibility(8);
        } else {
            this.f22847e.setVisibility(0);
        }
    }

    @Override // com.bytedance.ee.bear.notification.AbstractC10318c.AbstractC10320b.AbstractC10322b
    public void onLinkClick(String str) {
        C13479a.m54764b("NotificationPresenter", "onLinkClick()...");
        ListAnalysis.m32540g(this.f22850h, this.f22849g.mo31037a(), this.f22849g.mo31038b());
        if (!C6313i.m25327a().mo25392c(str)) {
            ((AbstractC5586d) KoinJavaComponent.m268610a(AbstractC5586d.class)).mo22261b(str);
        } else if (C8275a.m34051b(C6313i.m25327a().mo25399g(str).f17446a) == C8275a.f22369b.mo32555b()) {
            m35042a(this.f22846d, str);
        } else {
            this.f22846d.mo17292a(str);
        }
    }

    /* renamed from: a */
    private static void m35042a(AbstractC10740f fVar, String str) {
        C13479a.m54764b("NotificationPresenter", "openSimpleWebView()...");
        fVar.mo17295b("/doc/simple_web").mo17313a("web_url", (CharSequence) str).mo17317a();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m35044b(String str, String str2) {
        ((AbstractC10318c) KoinJavaComponent.m268610a(AbstractC10318c.class)).mo39424a(str2);
        this.f22843a.mo39427a();
        ListAnalysis.m32542h(str, this.f22849g.mo31037a(), this.f22849g.mo31038b());
    }

    /* renamed from: a */
    public void mo33077a(String str, String str2) {
        C13479a.m54764b("NotificationPresenter", "showNotification()...nid = " + str);
        if (this.f22847e == null) {
            C13479a.m54764b("NotificationPresenter", "mNotificationContainer is null");
            ViewStub viewStub = (ViewStub) this.f22848f.findViewById(R.id.header_notification_view_stub);
            if (viewStub == null) {
                this.f22847e = (FrameLayout) this.f22848f.findViewById(R.id.list_notification_container);
            } else {
                this.f22847e = (FrameLayout) viewStub.inflate();
            }
            this.f22847e.addView(this.f22843a.mo39426a(this.f22845c));
            this.f22843a.mo39429a(this);
            this.f22843a.mo39428a(new AbstractC10318c.AbstractC10320b.AbstractC10321a(str) {
                /* class com.bytedance.ee.bear.list.homepage.p432a.$$Lambda$a$y2Xay4S0WQg3ZMPkOs8QmrPJEM0 */
                public final /* synthetic */ String f$1;

                {
                    this.f$1 = r2;
                }

                @Override // com.bytedance.ee.bear.notification.AbstractC10318c.AbstractC10320b.AbstractC10321a
                public final void onUserClose(String str) {
                    C8460a.this.m35044b(this.f$1, str);
                }
            });
        }
        AbstractC10318c.AbstractC10320b bVar = this.f22843a;
        if (bVar != null) {
            this.f22850h = str;
            bVar.mo39430a(str, str2);
            ListAnalysis.m32538f(str, this.f22849g.mo31037a(), this.f22849g.mo31038b());
        }
    }

    public C8460a(Context context, View view, AbstractC8461a aVar) {
        this.f22845c = context;
        this.f22848f = view;
        this.f22849g = aVar;
        m35043b();
    }
}
