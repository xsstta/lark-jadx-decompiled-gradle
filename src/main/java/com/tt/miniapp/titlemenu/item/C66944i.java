package com.tt.miniapp.titlemenu.item;

import android.app.Activity;
import android.view.View;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.larksuite.suite.R;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.process.p3316a.C66612a;
import com.tt.miniapp.titlemenu.DialogC66908d;
import com.tt.miniapp.titlemenu.p3332a.C66899a;

/* renamed from: com.tt.miniapp.titlemenu.item.i */
public class C66944i extends C66937e {

    /* renamed from: a */
    private C66899a f168846a;

    @Override // com.tt.miniapp.titlemenu.item.IMenuItem, com.tt.miniapp.titlemenu.item.C66937e
    /* renamed from: a */
    public final String mo49183a() {
        return "refresh";
    }

    @Override // com.tt.miniapp.titlemenu.item.IMenuItem, com.tt.miniapp.titlemenu.item.C66937e
    /* renamed from: b */
    public C66899a mo49184b() {
        return this.f168846a;
    }

    public C66944i(Activity activity, final IAppContext iAppContext) {
        super(iAppContext);
        C66899a aVar = new C66899a(activity, iAppContext);
        this.f168846a = aVar;
        aVar.setIcon(activity.getDrawable(R.drawable.ud_icon_refresh_outlined));
        this.f168846a.setLabel(activity.getString(R.string.OpenPlatform_GadgetErr_ReEnterAppTtl));
        this.f168846a.setOnClickListener(new View.OnClickListener() {
            /* class com.tt.miniapp.titlemenu.item.C66944i.View$OnClickListenerC669451 */

            public void onClick(View view) {
                C66612a.m260227a(AppbrandApplicationImpl.getInst(iAppContext).getAppInfo().appId, AppbrandApplicationImpl.getInst(iAppContext).getSchema(), false);
                DialogC66908d.m260930a(iAppContext).dismiss();
            }
        });
    }
}
