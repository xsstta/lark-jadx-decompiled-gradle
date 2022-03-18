package com.bytedance.ee.bear.list.share;

import android.text.TextUtils;
import com.bytedance.ee.bear.contract.leanmode.AbstractC5197b;
import com.bytedance.ee.bear.domain.BearUrl;
import com.bytedance.ee.bear.route.AbstractC10737b;
import com.bytedance.ee.bear.route.AbstractC10738c;
import com.bytedance.ee.bear.route.RouteBean;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.log.C13479a;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.list.share.e */
public class C8726e extends AbstractC10737b {

    /* renamed from: a */
    private AbstractC5197b f23584a;

    @Override // com.bytedance.ee.bear.route.AbstractC10736a
    /* renamed from: a */
    public String mo17282a(BearUrl bearUrl) {
        return "/list/share/activity";
    }

    public C8726e(C10917c cVar) {
        super(cVar, new AbstractC10738c[0]);
    }

    @Override // com.bytedance.ee.bear.route.AbstractC10738c
    /* renamed from: a */
    public boolean mo17284a(BearUrl bearUrl, RouteBean routeBean) {
        if (this.f23584a == null) {
            this.f23584a = (AbstractC5197b) KoinJavaComponent.m268610a(AbstractC5197b.class);
        }
        if (!this.f23584a.mo20801b().mo20777c().f14914a || !TextUtils.equals(bearUrl.f17446a, "history_shared_folder")) {
            return false;
        }
        mo33776b(bearUrl, routeBean);
        return true;
    }

    /* renamed from: b */
    public void mo33776b(BearUrl bearUrl, RouteBean routeBean) {
        C13479a.m54764b("HistorySharedFolderRouteInterceptor", "dispatchUrl()..." + bearUrl.f17446a);
        mo40641d(bearUrl, routeBean).mo17316a("show_history_folders", true).mo17317a();
    }
}
