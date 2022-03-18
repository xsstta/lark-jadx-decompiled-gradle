package com.tt.miniapp.titlemenu.item;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.larksuite.suite.R;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.shortcut.C66817a;
import com.tt.miniapp.shortcut.C66827b;
import com.tt.miniapp.shortcut.ShortcutService;
import com.tt.miniapp.titlemenu.DialogC66908d;
import com.tt.miniapp.titlemenu.p3332a.C66899a;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.entity.AppInfoEntity;

/* renamed from: com.tt.miniapp.titlemenu.item.n */
public class C66955n extends C66937e {

    /* renamed from: a */
    private C66899a f168865a;

    @Override // com.tt.miniapp.titlemenu.item.IMenuItem, com.tt.miniapp.titlemenu.item.C66937e
    /* renamed from: a */
    public final String mo49183a() {
        return "generate_shortcut";
    }

    @Override // com.tt.miniapp.titlemenu.item.IMenuItem, com.tt.miniapp.titlemenu.item.C66937e
    /* renamed from: b */
    public C66899a mo49184b() {
        return this.f168865a;
    }

    public C66955n(final Activity activity, final IAppContext iAppContext) {
        super(iAppContext);
        C66899a aVar = new C66899a(activity, iAppContext);
        this.f168865a = aVar;
        aVar.setIcon(activity.getDrawable(2131234589));
        this.f168865a.setLabel(activity.getString(R.string.microapp_m_add_short_cut));
        this.f168865a.setOnClickListener(new View.OnClickListener() {
            /* class com.tt.miniapp.titlemenu.item.C66955n.View$OnClickListenerC669561 */

            public void onClick(View view) {
                DialogC66908d.m260930a(iAppContext).dismiss();
                C66827b.m260741a("user", iAppContext);
                AppbrandApplicationImpl inst = AppbrandApplicationImpl.getInst(iAppContext);
                AppInfoEntity appInfo = inst.getAppInfo();
                if (appInfo == null) {
                    AppBrandLogger.m52830i("ShortcutMenuItem", "shortcut fail appinfo is null");
                    C66827b.m260742a("no", "appInfo is null", iAppContext);
                    return;
                }
                ((ShortcutService) inst.getService(ShortcutService.class)).tryToAddShortcut(activity, new C66817a.C66818a().mo232743c(appInfo.appId).mo232740a(appInfo.icon).mo232742b(appInfo.appName).mo232739a(appInfo.type).mo232741a());
            }
        });
        if (!TextUtils.isEmpty(AppbrandContext.getInst().getInitParams().mo234509i())) {
            this.f168865a.setVisibility(0);
        } else {
            this.f168865a.setVisibility(8);
        }
    }
}
