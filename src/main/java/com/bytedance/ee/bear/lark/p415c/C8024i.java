package com.bytedance.ee.bear.lark.p415c;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ee.bear.contract.ConnectionService;
import com.bytedance.ee.bear.facade.common.widget.NoNetworkView;

/* renamed from: com.bytedance.ee.bear.lark.c.i */
public class C8024i implements AbstractC8019d {

    /* renamed from: a */
    private View f21504a;

    /* renamed from: b */
    private boolean f21505b;

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
        return this.f21505b;
    }

    @Override // com.bytedance.ee.bear.lark.p415c.AbstractC8021f
    /* renamed from: d */
    public void mo31034d() {
        Log.i("OfflineTipsHeader", "reload()...");
    }

    @Override // com.bytedance.ee.bear.lark.p415c.AbstractC8021f
    /* renamed from: c */
    public void mo31033c() {
        Log.i("OfflineTipsHeader", "destroy()...");
        this.f21504a = null;
    }

    @Override // com.bytedance.ee.bear.lark.p415c.AbstractC8019d
    /* renamed from: b */
    public void mo31031b(Context context) {
        Log.i("OfflineTipsHeader", "initData()...");
        this.f21505b = true;
    }

    @Override // com.bytedance.ee.bear.lark.p415c.AbstractC8019d
    /* renamed from: a */
    public void mo31027a(ConnectionService.NetworkState networkState) {
        if (networkState == null || !networkState.mo20041b()) {
            this.f21504a.setVisibility(0);
        } else {
            this.f21504a.setVisibility(8);
        }
    }

    @Override // com.bytedance.ee.bear.lark.p415c.AbstractC8019d
    /* renamed from: a */
    public View mo31026a(Context context) {
        Log.i("OfflineTipsHeader", "createView()...");
        NoNetworkView noNetworkView = new NoNetworkView(context);
        this.f21504a = noNetworkView;
        noNetworkView.setVisibility(8);
        this.f21504a.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return this.f21504a;
    }
}
