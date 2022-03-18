package com.tt.miniapp.titlemenu.item;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.larksuite.suite.R;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.debug.VConsoleManager;
import com.tt.miniapp.titlemenu.C66913e;
import com.tt.miniapp.titlemenu.p3332a.C66899a;
import com.tt.miniapphost.util.ProcessUtil;

/* renamed from: com.tt.miniapp.titlemenu.item.o */
public class C66957o extends C66937e {

    /* renamed from: a */
    public final Activity f168869a;

    /* renamed from: b */
    public VConsoleManager f168870b;

    /* renamed from: c */
    private C66899a f168871c;

    @Override // com.tt.miniapp.titlemenu.item.IMenuItem, com.tt.miniapp.titlemenu.item.C66937e
    /* renamed from: a */
    public final String mo49183a() {
        return "v_consonle";
    }

    @Override // com.tt.miniapp.titlemenu.item.IMenuItem, com.tt.miniapp.titlemenu.item.C66937e
    /* renamed from: b */
    public C66899a mo49184b() {
        return this.f168871c;
    }

    @Override // com.tt.miniapp.titlemenu.item.IMenuItem, com.tt.miniapp.titlemenu.item.C66937e
    /* renamed from: c */
    public void mo232939c() {
        this.f168871c.setLabel(m261029a(this.f168869a));
    }

    /* renamed from: a */
    private String m261029a(Context context) {
        if (this.f168870b.isVConsoleSwitchOn()) {
            return context.getString(R.string.microapp_m_close_debug);
        }
        return context.getString(R.string.microapp_m_open_debug);
    }

    public C66957o(Activity activity, final IAppContext iAppContext) {
        super(iAppContext);
        this.f168870b = (VConsoleManager) AppbrandApplicationImpl.getInst(iAppContext).getService(VConsoleManager.class);
        this.f168869a = activity;
        C66899a aVar = new C66899a(activity, iAppContext);
        this.f168871c = aVar;
        aVar.setIcon(activity.getDrawable(2131234591));
        this.f168871c.setLabel(m261029a(activity));
        this.f168871c.setOnClickListener(new View.OnClickListener() {
            /* class com.tt.miniapp.titlemenu.item.C66957o.View$OnClickListenerC669581 */

            public void onClick(View view) {
                if (C66957o.this.f168870b.isVConsoleSwitchOn()) {
                    C66913e.m260951a("mp_debug_close_click", iAppContext);
                    C66957o.this.f168870b.setVConsoleSwitchOn(C66957o.this.f168869a, false);
                } else {
                    C66913e.m260951a("mp_debug_open_click", iAppContext);
                    C66957o.this.f168870b.setVConsoleSwitchOn(C66957o.this.f168869a, true);
                }
                ProcessUtil.killCurrentMiniAppProcess();
            }
        });
        if (AppbrandApplicationImpl.getInst(iAppContext).getAppInfo().isLocalTest()) {
            this.f168871c.setVisibility(0);
        } else {
            this.f168871c.setVisibility(8);
        }
    }
}
