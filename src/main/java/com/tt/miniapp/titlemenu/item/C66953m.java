package com.tt.miniapp.titlemenu.item;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.larksuite.component.openplatform.core.plugin.messenger.share.C25277a;
import com.larksuite.suite.R;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.titlemenu.DialogC66908d;
import com.tt.miniapp.titlemenu.item.IMenuItem;
import com.tt.miniapp.titlemenu.p3332a.C66899a;
import com.tt.miniapphost.C67432a;
import com.tt.miniapphost.p3362a.p3363a.AbstractC67433a;
import com.tt.miniapphost.p3362a.p3363a.AbstractC67434b;
import com.tt.miniapphost.p3371e.p3372a.C67500a;
import com.tt.miniapphost.util.C67587d;
import com.tt.miniapphost.util.C67590h;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.tt.miniapp.titlemenu.item.m */
public class C66953m extends C66937e {

    /* renamed from: a */
    private C66899a f168862a;

    @Override // com.tt.miniapp.titlemenu.item.IMenuItem, com.tt.miniapp.titlemenu.item.C66937e
    /* renamed from: a */
    public final String mo49183a() {
        return "share";
    }

    @Override // com.tt.miniapp.titlemenu.item.IMenuItem, com.tt.miniapp.titlemenu.item.C66937e
    /* renamed from: b */
    public C66899a mo49184b() {
        return this.f168862a;
    }

    @Override // com.tt.miniapp.titlemenu.item.IMenuItem, com.tt.miniapp.titlemenu.item.C66937e
    /* renamed from: d */
    public IMenuItem.ItemCategory mo232940d() {
        return IMenuItem.ItemCategory.SHARE;
    }

    public C66953m(Activity activity, final IAppContext iAppContext) {
        super(iAppContext);
        C66899a aVar = new C66899a(activity, iAppContext);
        this.f168862a = aVar;
        aVar.setIcon(activity.getDrawable(2131234588));
        this.f168862a.setLabel(C67590h.m263073a((int) R.string.microapp_m_share));
        this.f168862a.setOnClickListener(new View.OnClickListener() {
            /* class com.tt.miniapp.titlemenu.item.C66953m.View$OnClickListenerC669541 */

            public void onClick(View view) {
                String str;
                DialogC66908d.m260930a(iAppContext).dismiss();
                C25277a.m90741a(1);
                AbstractC67434b a = ((AbstractC67433a) iAppContext).mo234156a();
                if (a != null) {
                    str = a.mo231014g();
                } else {
                    str = null;
                }
                JSONObject a2 = new C67587d().mo234783a("path", str).mo234784a();
                if (!TextUtils.isEmpty(AppbrandApplicationImpl.getInst(iAppContext).getCurrentWebViewUrl())) {
                    try {
                        a2.put("webViewUrl", AppbrandApplicationImpl.getInst(iAppContext).getCurrentWebViewUrl());
                    } catch (JSONException e) {
                        AppBrandLogger.m52829e("ShareMenuItem", "share menu webview url json error", e);
                    }
                }
                C67432a.m262319a(iAppContext).getJsBridge().sendMsgToJsCore("onShareAppMessage", a2.toString());
                new C67500a("openplatform_mp_container_menu_click", iAppContext).addCategoryValue("click", "app_share").addCategoryValue("target", "openplatform_application_share_view").reportPlatform(4).flush();
            }
        });
    }
}
