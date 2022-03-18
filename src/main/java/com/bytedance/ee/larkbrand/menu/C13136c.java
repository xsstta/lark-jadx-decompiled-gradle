package com.bytedance.ee.larkbrand.menu;

import android.app.Activity;
import android.view.View;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.larkbrand.AboutDebugActivity;
import com.larksuite.suite.R;
import com.tt.miniapp.manager.p3302a.C66399c;
import com.tt.miniapp.titlemenu.DialogC66908d;
import com.tt.miniapp.titlemenu.item.C66937e;
import com.tt.miniapp.titlemenu.p3332a.C66899a;
import com.tt.miniapphost.C67432a;
import com.tt.miniapphost.data.C67485a;
import com.tt.miniapphost.p3362a.p3363a.AbstractC67433a;
import java.util.Map;

/* renamed from: com.bytedance.ee.larkbrand.menu.c */
public class C13136c extends C66937e {

    /* renamed from: a */
    private C66899a f34831a;

    @Override // com.tt.miniapp.titlemenu.item.IMenuItem, com.tt.miniapp.titlemenu.item.C66937e
    /* renamed from: a */
    public final String mo49183a() {
        return "debug";
    }

    @Override // com.tt.miniapp.titlemenu.item.IMenuItem, com.tt.miniapp.titlemenu.item.C66937e
    /* renamed from: b */
    public final C66899a mo49184b() {
        return this.f34831a;
    }

    public C13136c(final Activity activity, final IAppContext iAppContext) {
        super(iAppContext);
        C66899a aVar = new C66899a(activity, iAppContext);
        this.f34831a = aVar;
        aVar.setIcon(activity.getDrawable(2131234573));
        this.f34831a.setLabel(activity.getString(R.string.lark_brand_debug));
        this.f34831a.setOnClickListener(new View.OnClickListener() {
            /* class com.bytedance.ee.larkbrand.menu.C13136c.View$OnClickListenerC131371 */

            public void onClick(View view) {
                boolean z;
                DialogC66908d.m260930a(iAppContext).dismiss();
                String str = C67432a.m262319a(iAppContext).getAppInfo().version;
                String b = C66399c.m259608a().mo231922b(activity, iAppContext);
                String a = C66399c.m259608a().mo231913a(activity);
                IAppContext iAppContext = iAppContext;
                if (iAppContext instanceof AbstractC67433a) {
                    z = ((AbstractC67433a) iAppContext).mo234169i();
                } else {
                    z = false;
                }
                Map<String, String> a2 = C67485a.m262488a(iAppContext).mo234275E().mo85965a(iAppContext.getApplicationContext());
                Activity activity = activity;
                activity.startActivity(AboutDebugActivity.m53278a(activity, str, b, a, z, a2));
                activity.overridePendingTransition(R.anim.microapp_i_slide_in_right, R.anim.microapp_i_stay_out);
            }
        });
    }
}
