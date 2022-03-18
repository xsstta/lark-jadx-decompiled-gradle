package com.bytedance.ee.bear.lark.p415c;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.ee.bear.contract.ConnectionService;
import com.bytedance.ee.bear.list.homepage.p432a.C8460a;
import com.bytedance.ee.log.C13479a;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.bear.lark.c.h */
public class C8023h implements AbstractC8019d {

    /* renamed from: a */
    private FrameLayout f21500a;

    /* renamed from: b */
    private C8460a f21501b;

    /* renamed from: c */
    private boolean f21502c;

    /* renamed from: d */
    private C8460a.AbstractC8461a f21503d;

    @Override // com.bytedance.ee.bear.lark.p415c.AbstractC8021f
    /* renamed from: a */
    public void mo31029a(boolean z) {
    }

    @Override // com.bytedance.ee.bear.lark.p415c.AbstractC8019d
    /* renamed from: a */
    public boolean mo31030a() {
        return false;
    }

    @Override // com.bytedance.ee.bear.lark.p415c.AbstractC8019d
    /* renamed from: b */
    public boolean mo31032b() {
        return this.f21502c;
    }

    @Override // com.bytedance.ee.bear.lark.p415c.AbstractC8021f
    /* renamed from: d */
    public void mo31034d() {
        C13479a.m54764b("NotificationHeader", "reload()...");
    }

    @Override // com.bytedance.ee.bear.lark.p415c.AbstractC8021f
    /* renamed from: c */
    public void mo31033c() {
        C13479a.m54764b("NotificationHeader", "destroy()...");
        C8460a aVar = this.f21501b;
        if (aVar != null) {
            aVar.mo33075a();
        }
        this.f21500a = null;
    }

    public C8023h(C8460a.AbstractC8461a aVar) {
        this.f21503d = aVar;
    }

    @Override // com.bytedance.ee.bear.lark.p415c.AbstractC8019d
    /* renamed from: a */
    public void mo31027a(ConnectionService.NetworkState networkState) {
        this.f21501b.mo33076a(networkState);
    }

    @Override // com.bytedance.ee.bear.lark.p415c.AbstractC8019d
    /* renamed from: b */
    public void mo31031b(Context context) {
        C13479a.m54764b("NotificationHeader", "initData()...");
        this.f21502c = true;
        this.f21501b = new C8460a(context, this.f21500a, this.f21503d);
    }

    @Override // com.bytedance.ee.bear.lark.p415c.AbstractC8019d
    /* renamed from: a */
    public View mo31026a(Context context) {
        C13479a.m54764b("NotificationHeader", "createView()...");
        FrameLayout frameLayout = new FrameLayout(context);
        this.f21500a = frameLayout;
        frameLayout.setId(R.id.list_notification_container);
        this.f21500a.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return this.f21500a;
    }
}
