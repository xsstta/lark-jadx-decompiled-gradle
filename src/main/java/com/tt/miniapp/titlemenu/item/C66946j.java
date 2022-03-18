package com.tt.miniapp.titlemenu.item;

import android.app.Activity;
import android.view.View;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.larksuite.suite.R;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.event.C66020b;
import com.tt.miniapp.process.p3316a.C66612a;
import com.tt.miniapp.titlemenu.DialogC66908d;
import com.tt.miniapp.titlemenu.p3332a.C66899a;
import com.tt.miniapphost.AppbrandContext;

/* renamed from: com.tt.miniapp.titlemenu.item.j */
public class C66946j extends C66937e {

    /* renamed from: a */
    private C66899a f168849a;

    @Override // com.tt.miniapp.titlemenu.item.IMenuItem, com.tt.miniapp.titlemenu.item.C66937e
    /* renamed from: a */
    public final String mo49183a() {
        return "restart_mini_app";
    }

    @Override // com.tt.miniapp.titlemenu.item.IMenuItem, com.tt.miniapp.titlemenu.item.C66937e
    /* renamed from: b */
    public final C66899a mo49184b() {
        return this.f168849a;
    }

    /* renamed from: a */
    private String m261016a(Activity activity) {
        if (AppbrandContext.getInst().isGame()) {
            return activity.getString(R.string.microapp_m_restart_game);
        }
        return activity.getString(R.string.microapp_m_restart_program);
    }

    public C66946j(Activity activity, final IAppContext iAppContext) {
        super(iAppContext);
        C66899a aVar = new C66899a(activity, iAppContext);
        this.f168849a = aVar;
        aVar.setIcon(activity.getDrawable(2131234585));
        this.f168849a.setLabel(m261016a(activity));
        this.f168849a.setOnClickListener(new View.OnClickListener() {
            /* class com.tt.miniapp.titlemenu.item.C66946j.View$OnClickListenerC669471 */

            public void onClick(View view) {
                C66020b.m258530a("mp_restart_miniapp", iAppContext).mo231092a();
                C66612a.m260227a(AppbrandApplicationImpl.getInst(iAppContext).getAppInfo().appId, AppbrandApplicationImpl.getInst(iAppContext).getSchema(), false);
                DialogC66908d.m260930a(iAppContext).dismiss();
            }
        });
    }
}
