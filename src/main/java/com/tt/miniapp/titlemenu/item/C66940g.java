package com.tt.miniapp.titlemenu.item;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.larksuite.suite.R;
import com.tt.miniapp.settings.ProjectSettingsActivity;
import com.tt.miniapp.titlemenu.C66913e;
import com.tt.miniapp.titlemenu.DialogC66908d;
import com.tt.miniapp.titlemenu.p3332a.C66899a;
import com.tt.miniapp.util.C67031e;

/* renamed from: com.tt.miniapp.titlemenu.item.g */
public class C66940g extends C66937e {

    /* renamed from: a */
    private C66899a f168839a;

    @Override // com.tt.miniapp.titlemenu.item.IMenuItem, com.tt.miniapp.titlemenu.item.C66937e
    /* renamed from: a */
    public final String mo49183a() {
        return "project_mode";
    }

    @Override // com.tt.miniapp.titlemenu.item.IMenuItem, com.tt.miniapp.titlemenu.item.C66937e
    /* renamed from: b */
    public C66899a mo49184b() {
        return this.f168839a;
    }

    public C66940g(final Activity activity, final IAppContext iAppContext) {
        super(iAppContext);
        C66899a aVar = new C66899a(activity, iAppContext);
        this.f168839a = aVar;
        aVar.setIcon(activity.getDrawable(2131234582));
        this.f168839a.setLabel(activity.getString(R.string.microapp_m_debug_mode));
        this.f168839a.setOnClickListener(new View.OnClickListener() {
            /* class com.tt.miniapp.titlemenu.item.C66940g.View$OnClickListenerC669411 */

            public void onClick(View view) {
                C66913e.m260951a("mp_engineering_mode_click", iAppContext);
                activity.startActivity(new Intent(ProjectSettingsActivity.m260553a(activity)));
                activity.overridePendingTransition(R.anim.microapp_i_slide_in_right, R.anim.microapp_i_stay_out);
                DialogC66908d.m260930a(iAppContext).dismiss();
            }
        });
        if (C67031e.m261247a()) {
            this.f168839a.setVisibility(0);
        } else {
            this.f168839a.setVisibility(8);
        }
    }
}
