package com.bytedance.ee.larkbrand.menu;

import android.app.Activity;
import android.view.View;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.larkbrand.LarkExtensionManager;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.larksuite.suite.R;
import com.tt.miniapp.titlemenu.DialogC66908d;
import com.tt.miniapp.titlemenu.item.C66937e;
import com.tt.miniapp.titlemenu.p3332a.C66899a;
import com.tt.miniapphost.C67432a;
import com.tt.miniapphost.process.C67556a;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.ee.larkbrand.menu.a */
public class C13133a extends C66937e {

    /* renamed from: a */
    private C66899a f34826a;

    /* renamed from: b */
    private String f34827b;

    @Override // com.tt.miniapp.titlemenu.item.IMenuItem, com.tt.miniapp.titlemenu.item.C66937e
    /* renamed from: a */
    public final String mo49183a() {
        return "enter_bot";
    }

    @Override // com.tt.miniapp.titlemenu.item.IMenuItem, com.tt.miniapp.titlemenu.item.C66937e
    /* renamed from: b */
    public final C66899a mo49184b() {
        return this.f34826a;
    }

    public C13133a(Activity activity, final String str, final IAppContext iAppContext) {
        super(iAppContext);
        C66899a aVar = new C66899a(activity, iAppContext);
        this.f34826a = aVar;
        aVar.setIcon(activity.getDrawable(2131234577));
        this.f34826a.setLabel(activity.getString(R.string.lark_brand_enter_bot));
        this.f34827b = str;
        this.f34826a.setOnClickListener(new View.OnClickListener() {
            /* class com.bytedance.ee.larkbrand.menu.C13133a.View$OnClickListenerC131341 */

            public void onClick(View view) {
                DialogC66908d.m260930a(iAppContext).dismiss();
                LarkExtensionManager.getInstance().getExtension().mo49586a(str, iAppContext);
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put(HiAnalyticsConstant.HaKey.BI_KEY_APPID, C67432a.m262319a(iAppContext).getAppInfo().appId);
                    C67556a.m262937a("click_app_menu_bot", jSONObject, 6);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
