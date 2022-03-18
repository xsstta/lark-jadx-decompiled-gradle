package com.tt.miniapp.titlemenu.item;

import android.app.Activity;
import android.view.View;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.larkbrand.menu.AbstractC13135b;
import com.bytedance.ee.larkbrand.menu.C13141f;
import com.bytedance.lark.pb.basic.v1.SendHttpResponse;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.suite.R;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.titlemenu.DialogC66908d;
import com.tt.miniapp.titlemenu.p3332a.C66899a;
import com.tt.miniapp.toast.ToastManager;
import com.tt.miniapphost.entity.AppInfoEntity;
import com.tt.miniapphost.p3371e.p3372a.C67500a;
import com.tt.miniapphost.p3371e.p3372a.C67501b;
import com.tt.miniapphost.util.C67590h;

/* renamed from: com.tt.miniapp.titlemenu.item.p */
public class C66959p extends C66937e {

    /* renamed from: a */
    public AbstractC13135b f168874a;

    /* renamed from: b */
    private C66899a f168875b;

    /* renamed from: c */
    private Activity f168876c;

    @Override // com.tt.miniapp.titlemenu.item.IMenuItem, com.tt.miniapp.titlemenu.item.C66937e
    /* renamed from: a */
    public final String mo49183a() {
        return "workplace";
    }

    @Override // com.tt.miniapp.titlemenu.item.IMenuItem, com.tt.miniapp.titlemenu.item.C66937e
    /* renamed from: b */
    public C66899a mo49184b() {
        return this.f168875b;
    }

    /* renamed from: a */
    public void mo232975a(final IAppContext iAppContext) {
        AppInfoEntity appInfo = AppbrandApplicationImpl.getInst(iAppContext).getAppInfo();
        if (appInfo != null) {
            ((AbstractC13135b) iAppContext.findServiceByInterface(AbstractC13135b.class)).mo49190c(appInfo.appId, new C13141f.AbstractC13143a() {
                /* class com.tt.miniapp.titlemenu.item.C66959p.C669612 */

                @Override // com.bytedance.ee.larkbrand.menu.C13141f.AbstractC13143a
                /* renamed from: a */
                public void mo49197a(SendHttpResponse sendHttpResponse, C13141f.C13144b bVar) {
                    C66959p.this.mo232977b(true);
                    C66959p.this.mo232974a(1);
                    new C67500a("mp_containerActions_onFavoriteClick", C67501b.f170253u, iAppContext).reportPlatform(4).addCategoryValue("action_type", "remove").flush();
                }

                @Override // com.bytedance.ee.larkbrand.menu.C13141f.AbstractC13143a
                /* renamed from: a */
                public void mo49198a(ErrorResult errorResult, C13141f.C13144b bVar) {
                    C66959p.this.mo232974a(2);
                    new C67500a("mp_containerActions_onFavoriteClick", C67501b.f170251s, iAppContext).reportPlatform(4).addCategoryValue("action_type", "remove").flush();
                }
            });
        }
    }

    /* renamed from: b */
    public void mo232976b(final IAppContext iAppContext) {
        AppInfoEntity appInfo = AppbrandApplicationImpl.getInst(iAppContext).getAppInfo();
        if (appInfo != null) {
            ((AbstractC13135b) iAppContext.findServiceByInterface(AbstractC13135b.class)).mo49189b(appInfo.appId, new C13141f.AbstractC13143a() {
                /* class com.tt.miniapp.titlemenu.item.C66959p.C669623 */

                @Override // com.bytedance.ee.larkbrand.menu.C13141f.AbstractC13143a
                /* renamed from: a */
                public void mo49197a(SendHttpResponse sendHttpResponse, C13141f.C13144b bVar) {
                    C66959p.this.mo232977b(false);
                    C66959p.this.mo232974a(0);
                    new C67500a("mp_containerActions_onFavoriteClick", C67501b.f170252t, iAppContext).reportPlatform(4).addCategoryValue("action_type", "add").flush();
                }

                @Override // com.bytedance.ee.larkbrand.menu.C13141f.AbstractC13143a
                /* renamed from: a */
                public void mo49198a(ErrorResult errorResult, C13141f.C13144b bVar) {
                    C66959p.this.mo232974a(2);
                    new C67500a("mp_containerActions_onFavoriteClick", C67501b.f170250r, iAppContext).reportPlatform(4).addCategoryValue("action_type", "add").flush();
                }
            });
        }
    }

    /* renamed from: a */
    public void mo232974a(int i) {
        if (i == 0) {
            Activity activity = this.f168876c;
            ToastManager.showToast(activity, activity.getString(R.string.OpenPlatform_AppActions_AddedToast), 0);
        } else if (i == 1) {
            Activity activity2 = this.f168876c;
            ToastManager.showToast(activity2, activity2.getString(R.string.OpenPlatform_AppActions_RemovedToast), 0);
        } else if (i == 2) {
            Activity activity3 = this.f168876c;
            ToastManager.showToast(activity3, activity3.getString(R.string.OpenPlatform_AppActions_NetworkErrToast), 0);
        }
    }

    /* renamed from: b */
    public void mo232977b(boolean z) {
        this.f168874a.mo49187a(!z);
        if (z) {
            this.f168875b.setIcon(this.f168876c.getDrawable(2131234574));
            this.f168875b.setLabel(C67590h.m263073a((int) R.string.OpenPlatform_AppActions_FavoriteBttn));
            return;
        }
        this.f168875b.setIcon(this.f168876c.getDrawable(2131234584));
        this.f168875b.setLabel(C67590h.m263073a((int) R.string.OpenPlatform_AppActions_UnfavoriteBttn));
    }

    public C66959p(Activity activity, final IAppContext iAppContext) {
        super(iAppContext);
        this.f168874a = (AbstractC13135b) iAppContext.findServiceByInterface(AbstractC13135b.class);
        this.f168876c = activity;
        this.f168875b = new C66899a(activity, iAppContext);
        mo232977b(!this.f168874a.mo49188a());
        this.f168875b.setOnClickListener(new View.OnClickListener() {
            /* class com.tt.miniapp.titlemenu.item.C66959p.View$OnClickListenerC669601 */

            public void onClick(View view) {
                if (C66959p.this.f168874a.mo49188a()) {
                    C66959p.this.mo232975a(iAppContext);
                } else {
                    C66959p.this.mo232976b(iAppContext);
                }
                DialogC66908d.m260930a(iAppContext).dismiss();
            }
        });
    }
}
