package com.bytedance.ee.larkbrand.menu;

import android.app.Activity;
import android.view.View;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.larkbrand.LarkExtensionManager;
import com.larksuite.suite.R;
import com.tt.miniapp.titlemenu.DialogC66908d;
import com.tt.miniapp.titlemenu.item.C66937e;
import com.tt.miniapp.titlemenu.p3332a.C66899a;

/* renamed from: com.bytedance.ee.larkbrand.menu.d */
public class C13138d extends C66937e {

    /* renamed from: a */
    private C66899a f34835a;

    @Override // com.tt.miniapp.titlemenu.item.IMenuItem, com.tt.miniapp.titlemenu.item.C66937e
    /* renamed from: a */
    public final String mo49183a() {
        return "enter_feedBack";
    }

    @Override // com.tt.miniapp.titlemenu.item.IMenuItem, com.tt.miniapp.titlemenu.item.C66937e
    /* renamed from: b */
    public final C66899a mo49184b() {
        return this.f34835a;
    }

    public C13138d(Activity activity, final IAppContext iAppContext) {
        super(iAppContext);
        C66899a aVar = new C66899a(activity, iAppContext);
        this.f34835a = aVar;
        aVar.setIcon(activity.getDrawable(2131234580));
        this.f34835a.setLabel(activity.getString(R.string.lark_brand_feedback));
        this.f34835a.setOnClickListener(new View.OnClickListener() {
            /* class com.bytedance.ee.larkbrand.menu.C13138d.View$OnClickListenerC131391 */

            public void onClick(View view) {
                DialogC66908d.m260930a(iAppContext).dismiss();
                LarkExtensionManager.getInstance().getExtension().mo49605a(iAppContext);
            }
        });
    }
}
