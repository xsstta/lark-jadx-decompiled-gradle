package com.bytedance.ee.bear.lark.p415c;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ee.bear.contract.ConnectionService;
import com.larksuite.suite.R;
import com.ss.android.lark.ui.p2892a.C57582a;

/* renamed from: com.bytedance.ee.bear.lark.c.b */
public class C8016b implements AbstractC8019d {

    /* renamed from: a */
    private View f21487a;

    /* renamed from: b */
    private boolean f21488b;

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
        return this.f21488b;
    }

    @Override // com.bytedance.ee.bear.lark.p415c.AbstractC8021f
    /* renamed from: d */
    public void mo31034d() {
        Log.i("DividerHeader", "reload()...");
    }

    @Override // com.bytedance.ee.bear.lark.p415c.AbstractC8021f
    /* renamed from: c */
    public void mo31033c() {
        Log.i("DividerHeader", "destroy()...");
        this.f21487a = null;
    }

    @Override // com.bytedance.ee.bear.lark.p415c.AbstractC8019d
    /* renamed from: b */
    public void mo31031b(Context context) {
        Log.i("DividerHeader", "initData()...");
        this.f21488b = true;
    }

    @Override // com.bytedance.ee.bear.lark.p415c.AbstractC8019d
    /* renamed from: a */
    public View mo31026a(Context context) {
        Log.i("DividerHeader", "createView()...");
        View view = new View(context);
        this.f21487a = view;
        view.setBackground(context.getResources().getDrawable(R.color.bg_base, null));
        this.f21487a.setLayoutParams(new ViewGroup.LayoutParams(-1, C57582a.m223600a(12)));
        return this.f21487a;
    }
}
