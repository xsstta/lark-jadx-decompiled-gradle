package com.tt.miniapp.titlemenu.item;

import android.app.Activity;
import android.view.View;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.larksuite.suite.R;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.p3323q.C66683f;
import com.tt.miniapp.titlemenu.C66913e;
import com.tt.miniapp.titlemenu.DialogC66908d;
import com.tt.miniapp.titlemenu.p3332a.C66899a;
import com.tt.miniapphost.AppbrandContext;

/* renamed from: com.tt.miniapp.titlemenu.item.k */
public class C66948k extends C66937e {

    /* renamed from: a */
    private C66899a f168852a;

    @Override // com.tt.miniapp.titlemenu.item.IMenuItem, com.tt.miniapp.titlemenu.item.C66937e
    /* renamed from: a */
    public final String mo49183a() {
        return "see_profile";
    }

    @Override // com.tt.miniapp.titlemenu.item.IMenuItem, com.tt.miniapp.titlemenu.item.C66937e
    /* renamed from: b */
    public C66899a mo49184b() {
        return this.f168852a;
    }

    public C66948k(final Activity activity, final IAppContext iAppContext) {
        super(iAppContext);
        boolean z;
        C66899a aVar = new C66899a(activity, iAppContext);
        this.f168852a = aVar;
        aVar.setIcon(activity.getDrawable(2131234586));
        this.f168852a.setLabel(activity.getString(R.string.microapp_m_see_profile));
        this.f168852a.setOnClickListener(new View.OnClickListener() {
            /* class com.tt.miniapp.titlemenu.item.C66948k.View$OnClickListenerC669491 */

            public void onClick(View view) {
                C66913e.m260951a("mp_performance_data_show_click", iAppContext);
                C66683f.m260435a(activity, new C66683f.AbstractC66685a() {
                    /* class com.tt.miniapp.titlemenu.item.C66948k.View$OnClickListenerC669491.C669501 */

                    @Override // com.tt.miniapp.p3323q.C66683f.AbstractC66685a
                    /* renamed from: a */
                    public void mo232435a() {
                        C66913e.m260951a("mp_performance_data_close_click", iAppContext);
                    }
                }, false, iAppContext);
                DialogC66908d.m260930a(iAppContext).dismiss();
            }
        });
        if (!AppbrandApplicationImpl.getInst(iAppContext).getAppInfo().isLocalTest() || AppbrandContext.getInst().isGame()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            this.f168852a.setVisibility(0);
        } else {
            this.f168852a.setVisibility(8);
        }
    }
}
