package com.bytedance.ee.bear.lark.p415c;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.ee.bear.contract.ConnectionService;
import com.bytedance.ee.bear.facade.common.widget.recyclerview.AbstractC7741a;
import com.bytedance.ee.bear.facade.common.widget.recyclerview.DigitDanceHeader;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p718t.C13749l;
import com.larksuite.suite.R;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.ss.android.lark.ui.p2892a.C57582a;

/* renamed from: com.bytedance.ee.bear.lark.c.a */
public class C8015a implements AbstractC8019d {

    /* renamed from: a */
    private DigitDanceHeader f21485a;

    /* renamed from: b */
    private boolean f21486b;

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
        return this.f21486b;
    }

    @Override // com.bytedance.ee.bear.lark.p415c.AbstractC8021f
    /* renamed from: d */
    public void mo31034d() {
        C13479a.m54764b("DigitalRefreshHeader", "reload()...");
    }

    @Override // com.bytedance.ee.bear.lark.p415c.AbstractC8021f
    /* renamed from: c */
    public void mo31033c() {
        C13479a.m54764b("DigitalRefreshHeader", "destroy()...");
        this.f21485a = null;
    }

    /* renamed from: a */
    private void m31992a(String str) {
        DigitDanceHeader digitDanceHeader = this.f21485a;
        if (digitDanceHeader != null) {
            digitDanceHeader.setCustomText(str);
        }
    }

    @Override // com.bytedance.ee.bear.lark.p415c.AbstractC8019d
    /* renamed from: b */
    public void mo31031b(Context context) {
        C13479a.m54764b("DigitalRefreshHeader", "initData()...");
        this.f21486b = true;
    }

    @Override // com.bytedance.ee.bear.lark.p415c.AbstractC8019d
    /* renamed from: a */
    public View mo31026a(Context context) {
        C13479a.m54764b("DigitalRefreshHeader", "createView()...");
        DigitDanceHeader digitDanceHeader = new DigitDanceHeader(context);
        this.f21485a = digitDanceHeader;
        digitDanceHeader.setId(R.id.list_appbar_refresh_header);
        this.f21485a.setLayoutParams(new LinearLayout.LayoutParams(-1, C57582a.m223600a(65)));
        return this.f21485a;
    }

    /* renamed from: a */
    public void mo31028a(SmartRefreshLayout smartRefreshLayout) {
        C13479a.m54764b("DigitalRefreshHeader", "attachToRefreshLayout()...");
        if (smartRefreshLayout == null) {
            C13479a.m54758a("DigitalRefreshHeader", "attachToRefreshLayout()...smartRefreshLayout is null");
            return;
        }
        AbstractC7741a aVar = (AbstractC7741a) smartRefreshLayout.getRefreshHeader();
        if (aVar != null) {
            aVar.setAssociatedHeader(this.f21485a);
            m31992a(C13749l.m55745a(smartRefreshLayout.getContext(), (int) R.string.Doc_List_RefreshDocTips));
        }
    }
}
