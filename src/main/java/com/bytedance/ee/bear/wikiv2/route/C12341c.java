package com.bytedance.ee.bear.wikiv2.route;

import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.ee.bear.contract.ak;
import com.bytedance.ee.bear.contract.leanmode.AbstractC5197b;
import com.bytedance.ee.bear.contract.p282f.C5171a;
import com.bytedance.ee.bear.contract.route.parcelable.IWiki;
import com.bytedance.ee.bear.domain.BearUrl;
import com.bytedance.ee.bear.route.AbstractC10737b;
import com.bytedance.ee.bear.route.AbstractC10738c;
import com.bytedance.ee.bear.route.RouteBean;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.wikiv2.p589c.C12237b;
import com.bytedance.ee.log.C13479a;
import io.reactivex.AbstractC68307f;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.wikiv2.route.c */
public class C12341c extends AbstractC10737b {

    /* renamed from: a */
    private AbstractC5197b f33122a = ((AbstractC5197b) KoinJavaComponent.m268610a(AbstractC5197b.class));

    @Override // com.bytedance.ee.bear.route.AbstractC10736a
    /* renamed from: a */
    public String mo17282a(BearUrl bearUrl) {
        return "/wikiv2/home/activity";
    }

    /* renamed from: a */
    private AbstractC68307f<Boolean> m51380a() {
        Bundle bundle = new Bundle();
        bundle.putString("command", "check_wiki_tab_exit");
        return this.f28725d.mo41508c(ak.class).mo238020d(new Function(bundle) {
            /* class com.bytedance.ee.bear.wikiv2.route.$$Lambda$c$UrYo2pkExkyb1hFGQJs8M0Xxecs */
            public final /* synthetic */ Bundle f$0;

            {
                this.f$0 = r1;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C12341c.m51386b(this.f$0, (ak) obj);
            }
        });
    }

    /* renamed from: b */
    private void m51387b() {
        Bundle bundle = new Bundle();
        bundle.putString("command", "tab_wiki");
        this.f28725d.mo41508c(ak.class).mo238020d(new Function(bundle) {
            /* class com.bytedance.ee.bear.wikiv2.route.$$Lambda$c$cmkPmXZ6oGUP0joAN_k4F5HeW1k */
            public final /* synthetic */ Bundle f$0;

            {
                this.f$0 = r1;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return ((ak) obj).doCommand(this.f$0);
            }
        }).mo238001b($$Lambda$c$sdsPvzOsBCfc3iwSCcpNl9miYww.INSTANCE, $$Lambda$c$KvQPP7D6OrGggY4APpAVSeyNU40.INSTANCE);
    }

    public C12341c(C10917c cVar) {
        super(cVar, new AbstractC10738c[0]);
    }

    /* renamed from: b */
    private void m51388b(BearUrl bearUrl) {
        String str;
        if (bearUrl == null || !TextUtils.equals(bearUrl.f17453h, "appcenter")) {
            str = "home_link";
        } else {
            str = "app_center";
        }
        C12237b.m50897a(str);
    }

    /* renamed from: e */
    private void m51389e(BearUrl bearUrl, RouteBean routeBean) {
        mo40641d(bearUrl, routeBean).mo17317a();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ Boolean m51386b(Bundle bundle, ak akVar) throws Exception {
        Bundle doCommand = akVar.doCommand(bundle);
        if (doCommand != null) {
            return Boolean.valueOf(doCommand.getBoolean("exit"));
        }
        return false;
    }

    /* renamed from: b */
    public void mo47037b(BearUrl bearUrl, RouteBean routeBean) {
        C13479a.m54764b("WikiTabRouteInterceptorV2", "openWikiHomePage: ");
        m51388b(bearUrl);
        m51380a().mo238001b(new Consumer(bearUrl, routeBean) {
            /* class com.bytedance.ee.bear.wikiv2.route.$$Lambda$c$ftDRZTFLf4K069NjaVE5XXd7xFg */
            public final /* synthetic */ BearUrl f$1;
            public final /* synthetic */ RouteBean f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C12341c.this.m51382a((C12341c) this.f$1, (BearUrl) this.f$2, (RouteBean) ((Boolean) obj));
            }
        }, new Consumer(bearUrl, routeBean) {
            /* class com.bytedance.ee.bear.wikiv2.route.$$Lambda$c$sNE_WYwIGrPDzJkDXzaH1ClreQE */
            public final /* synthetic */ BearUrl f$1;
            public final /* synthetic */ RouteBean f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C12341c.this.m51383a((C12341c) this.f$1, (BearUrl) this.f$2, (RouteBean) ((Throwable) obj));
            }
        });
    }

    @Override // com.bytedance.ee.bear.route.AbstractC10738c
    /* renamed from: a */
    public boolean mo17284a(BearUrl bearUrl, RouteBean routeBean) {
        if (!this.f33122a.mo20801b().mo20781f().f14914a) {
            C13479a.m54775e("WikiTabRouteInterceptorV2", "lean model open, disable wikihome route");
            return false;
        } else if (!((IWiki) KoinJavaComponent.m268610a(IWiki.class)).mo21070c()) {
            C13479a.m54775e("WikiTabRouteInterceptorV2", "wiki new version disable now, ignore route WikiTabRouteInterceptor#onIntercept");
            return false;
        } else if (!C5171a.m21155d(bearUrl)) {
            return false;
        } else {
            C13479a.m54764b("WikiTabRouteInterceptorV2", "dispatchUrl()..." + bearUrl.f17446a);
            if (mo40642c(bearUrl, routeBean)) {
                return true;
            }
            mo47037b(bearUrl, routeBean);
            return true;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m51383a(BearUrl bearUrl, RouteBean routeBean, Throwable th) throws Exception {
        C13479a.m54759a("WikiTabRouteInterceptorV2", "checkWikiTabExit fail", th);
        m51389e(bearUrl, routeBean);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m51382a(BearUrl bearUrl, RouteBean routeBean, Boolean bool) throws Exception {
        if (bool.booleanValue()) {
            C13479a.m54764b("WikiTabRouteInterceptorV2", "wiki tab exit");
            m51387b();
            return;
        }
        C13479a.m54764b("WikiTabRouteInterceptorV2", "wiki tab not exit, start activity");
        m51389e(bearUrl, routeBean);
    }
}
