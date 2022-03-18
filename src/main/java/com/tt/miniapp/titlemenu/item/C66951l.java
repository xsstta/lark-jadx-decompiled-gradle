package com.tt.miniapp.titlemenu.item;

import android.app.Activity;
import android.view.View;
import com.bytedance.ee.lark.infra.sandbox.context.AbstractC12888c;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.larksuite.component.openplatform.core.utils.C25529d;
import com.larksuite.suite.R;
import com.tt.miniapp.permission.PermissionSettingActivity;
import com.tt.miniapp.titlemenu.C66913e;
import com.tt.miniapp.titlemenu.DialogC66908d;
import com.tt.miniapp.titlemenu.p3332a.C66899a;
import com.tt.miniapphost.host.HostDependManager;

/* renamed from: com.tt.miniapp.titlemenu.item.l */
public class C66951l extends C66937e {

    /* renamed from: a */
    private C66899a f168857a;

    /* renamed from: b */
    private View.OnClickListener f168858b;

    @Override // com.tt.miniapp.titlemenu.item.IMenuItem, com.tt.miniapp.titlemenu.item.C66937e
    /* renamed from: a */
    public final String mo49183a() {
        return "settings";
    }

    @Override // com.tt.miniapp.titlemenu.item.IMenuItem, com.tt.miniapp.titlemenu.item.C66937e
    /* renamed from: b */
    public final C66899a mo49184b() {
        return this.f168857a;
    }

    public C66951l(final Activity activity, final IAppContext iAppContext) {
        super(iAppContext);
        C66899a aVar = new C66899a(activity, iAppContext);
        this.f168857a = aVar;
        aVar.setIcon(activity.getDrawable(2131234587));
        this.f168857a.setLabel(activity.getString(R.string.microapp_m_settings));
        C66899a aVar2 = this.f168857a;
        View$OnClickListenerC669521 r1 = new View.OnClickListener() {
            /* class com.tt.miniapp.titlemenu.item.C66951l.View$OnClickListenerC669521 */

            public void onClick(View view) {
                C66913e.m260951a("mp_settings_btn_click", iAppContext);
                DialogC66908d.m260930a(iAppContext).dismiss();
                AbstractC12888c i = C25529d.m91168i(iAppContext);
                if (i != null) {
                    i.startActivityForResult(PermissionSettingActivity.m260080a(activity, iAppContext), 5);
                } else {
                    Activity activity = activity;
                    activity.startActivityForResult(PermissionSettingActivity.m260080a(activity, iAppContext), 5);
                }
                activity.overridePendingTransition(R.anim.microapp_i_slide_in_right, R.anim.microapp_i_stay_out);
            }
        };
        this.f168858b = r1;
        aVar2.setOnClickListener(r1);
        if (HostDependManager.getInst().needSettingTitleMenuItem()) {
            mo49184b().setVisibility(0);
        } else {
            mo49184b().setVisibility(8);
        }
    }
}
