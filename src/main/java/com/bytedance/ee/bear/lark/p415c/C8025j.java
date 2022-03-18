package com.bytedance.ee.bear.lark.p415c;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ee.bear.contract.ConnectionService;
import com.bytedance.ee.bear.list.homepage.tab.HomeSubMenuView;
import com.bytedance.ee.log.C13479a;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.bear.lark.c.j */
public class C8025j implements AbstractC8019d {

    /* renamed from: a */
    private HomeSubMenuView f21506a;

    /* renamed from: b */
    private boolean f21507b;

    @Override // com.bytedance.ee.bear.lark.p415c.AbstractC8019d
    /* renamed from: a */
    public void mo31027a(ConnectionService.NetworkState networkState) {
    }

    @Override // com.bytedance.ee.bear.lark.p415c.AbstractC8021f
    /* renamed from: a */
    public void mo31029a(boolean z) {
    }

    @Override // com.bytedance.ee.bear.lark.p415c.AbstractC8019d
    /* renamed from: a */
    public boolean mo31030a() {
        return true;
    }

    @Override // com.bytedance.ee.bear.lark.p415c.AbstractC8019d
    /* renamed from: b */
    public boolean mo31032b() {
        return this.f21507b;
    }

    @Override // com.bytedance.ee.bear.lark.p415c.AbstractC8021f
    /* renamed from: d */
    public void mo31034d() {
        C13479a.m54764b("SubMenuHeader", "reload()...");
    }

    @Override // com.bytedance.ee.bear.lark.p415c.AbstractC8021f
    /* renamed from: c */
    public void mo31033c() {
        C13479a.m54764b("SubMenuHeader", "destroy()...");
        this.f21506a = null;
    }

    @Override // com.bytedance.ee.bear.lark.p415c.AbstractC8019d
    /* renamed from: b */
    public void mo31031b(Context context) {
        C13479a.m54764b("SubMenuHeader", "initData()...");
        this.f21507b = true;
    }

    @Override // com.bytedance.ee.bear.lark.p415c.AbstractC8019d
    /* renamed from: a */
    public View mo31026a(Context context) {
        C13479a.m54764b("SubMenuHeader", "createView()...");
        HomeSubMenuView homeSubMenuView = new HomeSubMenuView(context);
        this.f21506a = homeSubMenuView;
        homeSubMenuView.setId(R.id.home_sub_title_view);
        this.f21506a.setBackground(context.getResources().getDrawable(R.drawable.list_home_sub_menu_bg, null));
        this.f21506a.setLayoutParams(new ViewGroup.LayoutParams(-1, context.getResources().getDimensionPixelOffset(R.dimen.list_home_sub_menu_height)));
        return this.f21506a;
    }
}
