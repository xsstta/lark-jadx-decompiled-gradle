package com.tt.miniapp.titlemenu.item;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.larksuite.suite.R;
import com.tt.miniapp.AppConfig;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.C66546p;
import com.tt.miniapp.titlemenu.C66913e;
import com.tt.miniapp.titlemenu.DialogC66908d;
import com.tt.miniapp.titlemenu.p3332a.C66899a;
import com.tt.miniapphost.AbstractC67497e;
import com.tt.miniapphost.MiniappHostBase;
import org.json.JSONObject;

/* renamed from: com.tt.miniapp.titlemenu.item.b */
public class C66917b extends C66937e {

    /* renamed from: a */
    private C66899a f168790a;

    @Override // com.tt.miniapp.titlemenu.item.IMenuItem, com.tt.miniapp.titlemenu.item.C66937e
    /* renamed from: a */
    public final String mo49183a() {
        return "back_home";
    }

    @Override // com.tt.miniapp.titlemenu.item.IMenuItem, com.tt.miniapp.titlemenu.item.C66937e
    /* renamed from: b */
    public final C66899a mo49184b() {
        return this.f168790a;
    }

    /* renamed from: a */
    public void mo232944a(Activity activity) {
        AppConfig appConfig;
        C66913e.m260951a("mp_home_btn_click", this.f168835d);
        DialogC66908d.m260930a(this.f168835d).dismiss();
        if (activity instanceof MiniappHostBase) {
            AbstractC67497e activityProxy = ((MiniappHostBase) activity).getActivityProxy();
            if ((activityProxy instanceof C66546p) && (appConfig = AppbrandApplicationImpl.getInst(this.f168835d).getAppConfig()) != null && !TextUtils.isEmpty(appConfig.f165497d) && !TextUtils.isEmpty(appConfig.f165497d)) {
                String str = appConfig.f165497d;
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("url", str);
                    ((C66546p) activityProxy).mo232120b(jSONObject.toString(), true);
                } catch (Exception e) {
                    AppBrandLogger.m52829e("BackHomeMenuItem", "onNewIntent", e);
                }
            }
        }
    }

    public C66917b(final Activity activity, IAppContext iAppContext) {
        super(iAppContext);
        C66899a aVar = new C66899a(activity, iAppContext);
        this.f168790a = aVar;
        aVar.setIcon(activity.getDrawable(2131234575));
        this.f168790a.setLabel(activity.getString(R.string.microapp_m_backhome));
        this.f168790a.setOnClickListener(new View.OnClickListener() {
            /* class com.tt.miniapp.titlemenu.item.C66917b.View$OnClickListenerC669181 */

            public void onClick(View view) {
                C66917b.this.mo232944a(activity);
            }
        });
    }
}
