package com.bytedance.ee.bear.wikiv2.home.recent;

import android.content.Context;
import android.view.View;
import com.bytedance.ee.bear.contract.ConnectionService;
import com.bytedance.ee.bear.facade.common.C7667e;
import com.bytedance.ee.bear.facade.common.p380a.C7662a;
import com.bytedance.ee.bear.list.cache.FolderSortStrategy;
import com.bytedance.ee.bear.list.homepage.widget.AbstractC8509a;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.wikiv2.home.banner.C12271b;
import com.bytedance.ee.bear.wikiv2.home.banner.C12272c;
import com.bytedance.ee.bear.wikiv2.home.banner.C12273d;
import com.google.android.material.appbar.AppBarLayout;

/* renamed from: com.bytedance.ee.bear.wikiv2.home.recent.a */
public class C12289a extends AbstractC8509a {

    /* renamed from: k */
    private C12271b f32996k;

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.homepage.widget.AbstractC8509a
    /* renamed from: a */
    public void mo33265a(View view) {
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.homepage.widget.AbstractC8509a
    /* renamed from: a */
    public void mo33268a(FolderSortStrategy folderSortStrategy) {
    }

    @Override // com.bytedance.ee.bear.list.homepage.widget.AbstractC8509a, com.bytedance.ee.bear.list.AbstractC8651p.AbstractC8660i
    /* renamed from: a */
    public void mo30963a(boolean z) {
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.homepage.widget.AbstractC8509a
    /* renamed from: c */
    public void mo33270c() {
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.homepage.widget.AbstractC8509a
    /* renamed from: e */
    public String mo33272e() {
        return "wiki_home";
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.homepage.widget.AbstractC8509a
    /* renamed from: f */
    public String mo33273f() {
        return "none";
    }

    @Override // com.bytedance.ee.bear.list.homepage.AbstractC8474e.AbstractC8475a
    /* renamed from: h */
    public void mo30969h() {
    }

    @Override // com.bytedance.ee.bear.list.homepage.AbstractC8474e.AbstractC8475a
    /* renamed from: j */
    public void mo30971j() {
    }

    /* renamed from: g */
    private void m51175g() {
        if (this.f23021c != null) {
            this.f23021c.mo33135a();
        }
        if (this.f23022d != null) {
            this.f23022d.mo33135a();
        }
    }

    /* renamed from: i */
    private void m51176i() {
        if (this.f23021c != null) {
            this.f23021c.mo33138b();
        }
        if (this.f23022d != null) {
            this.f23022d.mo33138b();
        }
    }

    @Override // com.bytedance.ee.bear.list.homepage.widget.AbstractC8509a
    /* renamed from: b */
    public void mo33269b(ConnectionService.NetworkState networkState) {
        if (!(this.f23026h == null || networkState == null || this.f23026h.mo20041b() || !networkState.mo20041b() || this.f23023e == null)) {
            this.f23023e.mo33105f();
        }
        super.mo33269b(networkState);
    }

    public C12289a(C7662a aVar, Context context, C10917c cVar, AppBarLayout appBarLayout) {
        super(aVar, context, cVar, appBarLayout);
        m51176i();
        m51175g();
    }

    @Override // com.bytedance.ee.bear.list.homepage.widget.AbstractC8509a
    /* renamed from: a */
    public void mo33267a(C7667e eVar, Context context, C10917c cVar, View view) {
        this.f32996k = new C12271b(context, cVar);
        this.f23024f = new C12273d(context, view, cVar);
        this.f32996k.mo46837b(3);
        this.f23023e = new C12272c(eVar, context, this.f32996k, this.f23024f, cVar);
        this.f23023e.create();
    }
}
