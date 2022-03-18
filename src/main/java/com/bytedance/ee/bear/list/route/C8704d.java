package com.bytedance.ee.bear.list.route;

import android.text.TextUtils;
import com.bytedance.ee.bear.contract.leanmode.AbstractC5197b;
import com.bytedance.ee.bear.contract.offline.route.parcelable.FolderRouteBean;
import com.bytedance.ee.bear.domain.BearUrl;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.list.dto.FolderVersion;
import com.bytedance.ee.bear.route.AbstractC10737b;
import com.bytedance.ee.bear.route.AbstractC10738c;
import com.bytedance.ee.bear.route.AbstractC10740f;
import com.bytedance.ee.bear.route.RouteBean;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.log.C13479a;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.list.route.d */
public class C8704d extends AbstractC10737b {

    /* renamed from: a */
    private AbstractC5197b f23541a;

    @Override // com.bytedance.ee.bear.route.AbstractC10736a
    /* renamed from: a */
    public String mo17282a(BearUrl bearUrl) {
        return "/list/folder/activity";
    }

    public C8704d(C10917c cVar) {
        super(cVar, new AbstractC10738c[0]);
    }

    /* renamed from: b */
    private void m36429b(BearUrl bearUrl) {
        ((AbstractC10740f) KoinJavaComponent.m268610a(AbstractC10740f.class)).mo17295b("/list/folder/route/activity").mo17314a("url", bearUrl.f17450e).mo17314a("token", bearUrl.f17447b).mo17314a(ShareHitPoint.f121868c, bearUrl.f17451f).mo17306a(0, 0).mo17317a();
    }

    @Override // com.bytedance.ee.bear.route.AbstractC10738c
    /* renamed from: a */
    public boolean mo17284a(BearUrl bearUrl, RouteBean routeBean) {
        if (this.f23541a == null) {
            this.f23541a = (AbstractC5197b) KoinJavaComponent.m268610a(AbstractC5197b.class);
        }
        if (!this.f23541a.mo20801b().mo20777c().f14914a || !TextUtils.equals(bearUrl.f17446a, C8275a.f22370c.mo32553a()) || TextUtils.isEmpty(bearUrl.f17447b)) {
            return false;
        }
        if (mo40642c(bearUrl, routeBean)) {
            return true;
        }
        mo33740b(bearUrl, routeBean);
        return true;
    }

    /* renamed from: b */
    public void mo33740b(BearUrl bearUrl, RouteBean routeBean) {
        C13479a.m54764b("FolderInterceptor", "dispatchUrl()..." + bearUrl.f17446a);
        if (routeBean instanceof FolderRouteBean) {
            m36428a(bearUrl, (FolderRouteBean) routeBean);
        } else {
            m36429b(bearUrl);
        }
    }

    /* renamed from: a */
    private void m36428a(BearUrl bearUrl, FolderRouteBean folderRouteBean) {
        if (FolderVersion.isNewShareFolder(folderRouteBean.mo20916e())) {
            ((AbstractC10740f) KoinJavaComponent.m268610a(AbstractC10740f.class)).mo17287a();
        } else {
            ((AbstractC10740f) KoinJavaComponent.m268610a(AbstractC10740f.class)).mo17295b("/list/folder/activity").mo17314a("url", bearUrl.f17450e).mo17314a("token", bearUrl.f17447b).mo17314a(ShareHitPoint.f121868c, bearUrl.f17451f).mo17314a("title", folderRouteBean.mo40629o()).mo17308a("owner_type", folderRouteBean.mo20919h()).mo17308a("depth", folderRouteBean.mo20906b()).mo17314a("parent_space_id", folderRouteBean.mo20910c()).mo17314a("current_module", folderRouteBean.mo20902a()).mo17308a("permission", folderRouteBean.mo20913d()).mo17316a("is_external", folderRouteBean.mo20917f()).mo17316a("is_personal_folder", folderRouteBean.mo20918g()).mo17314a("parent_token", folderRouteBean.mo20920i()).mo17317a();
        }
    }
}
