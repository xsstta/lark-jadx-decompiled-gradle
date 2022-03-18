package com.bytedance.ee.bear.lark.p415c;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentManager;
import com.bytedance.ee.bear.contract.ConnectionService;
import com.bytedance.ee.bear.list.homepage.navigation.C8480b;
import com.bytedance.ee.log.C13479a;
import com.larksuite.suite.R;
import com.ss.android.lark.ui.p2892a.C57582a;

/* renamed from: com.bytedance.ee.bear.lark.c.g */
public class C8022g implements AbstractC8019d {

    /* renamed from: a */
    private FrameLayout f21495a;

    /* renamed from: b */
    private C8480b f21496b;

    /* renamed from: c */
    private FragmentManager f21497c;

    /* renamed from: d */
    private boolean f21498d;

    /* renamed from: e */
    private boolean f21499e;

    @Override // com.bytedance.ee.bear.lark.p415c.AbstractC8019d
    /* renamed from: a */
    public void mo31027a(ConnectionService.NetworkState networkState) {
    }

    @Override // com.bytedance.ee.bear.lark.p415c.AbstractC8019d
    /* renamed from: a */
    public boolean mo31030a() {
        return true;
    }

    @Override // com.bytedance.ee.bear.lark.p415c.AbstractC8019d
    /* renamed from: b */
    public boolean mo31032b() {
        return this.f21499e;
    }

    /* renamed from: e */
    public FrameLayout mo31039e() {
        return this.f21495a;
    }

    @Override // com.bytedance.ee.bear.lark.p415c.AbstractC8021f
    /* renamed from: c */
    public void mo31033c() {
        C13479a.m54764b("NavigationHeader", "destroy()...");
        this.f21495a = null;
        this.f21497c = null;
        this.f21496b = null;
    }

    @Override // com.bytedance.ee.bear.lark.p415c.AbstractC8021f
    /* renamed from: d */
    public void mo31034d() {
        C13479a.m54764b("NavigationHeader", "reload()...");
        this.f21498d = true;
    }

    public C8022g(FragmentManager fragmentManager) {
        this.f21497c = fragmentManager;
    }

    @Override // com.bytedance.ee.bear.lark.p415c.AbstractC8021f
    /* renamed from: a */
    public void mo31029a(boolean z) {
        if (z) {
            if (this.f21498d) {
                C8480b bVar = this.f21496b;
                if (bVar != null) {
                    bVar.mo33149a();
                }
                this.f21498d = false;
            }
            C8480b bVar2 = this.f21496b;
            if (bVar2 != null) {
                bVar2.mo33150b();
            }
        }
    }

    @Override // com.bytedance.ee.bear.lark.p415c.AbstractC8019d
    /* renamed from: a */
    public View mo31026a(Context context) {
        C13479a.m54764b("NavigationHeader", "createView()...");
        FrameLayout frameLayout = new FrameLayout(context);
        this.f21495a = frameLayout;
        frameLayout.setId(R.id.header_banner_view);
        this.f21495a.setPadding(0, C57582a.m223600a(4), 0, C57582a.m223600a(8));
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        marginLayoutParams.topMargin = C57582a.m223600a(4);
        marginLayoutParams.bottomMargin = C57582a.m223600a(8);
        this.f21495a.setLayoutParams(marginLayoutParams);
        return this.f21495a;
    }

    @Override // com.bytedance.ee.bear.lark.p415c.AbstractC8019d
    /* renamed from: b */
    public void mo31031b(Context context) {
        C13479a.m54764b("NavigationHeader", "initData()...");
        this.f21499e = true;
        this.f21496b = (C8480b) this.f21497c.getFragmentFactory().instantiate(context.getClassLoader(), C8480b.class.getName());
        this.f21497c.beginTransaction().replace(R.id.header_banner_view, this.f21496b).commitNowAllowingStateLoss();
    }
}
