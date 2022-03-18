package com.google.android.gms.dynamic;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.dynamic.AbstractC21818a;

/* renamed from: com.google.android.gms.dynamic.g */
final class C21825g implements AbstractC21818a.AbstractC21819a {

    /* renamed from: a */
    private final /* synthetic */ FrameLayout f53238a;

    /* renamed from: b */
    private final /* synthetic */ LayoutInflater f53239b;

    /* renamed from: c */
    private final /* synthetic */ ViewGroup f53240c;

    /* renamed from: d */
    private final /* synthetic */ Bundle f53241d;

    /* renamed from: e */
    private final /* synthetic */ AbstractC21818a f53242e;

    C21825g(AbstractC21818a aVar, FrameLayout frameLayout, LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f53242e = aVar;
        this.f53238a = frameLayout;
        this.f53239b = layoutInflater;
        this.f53240c = viewGroup;
        this.f53241d = bundle;
    }

    @Override // com.google.android.gms.dynamic.AbstractC21818a.AbstractC21819a
    /* renamed from: a */
    public final int mo73890a() {
        return 2;
    }

    @Override // com.google.android.gms.dynamic.AbstractC21818a.AbstractC21819a
    /* renamed from: a */
    public final void mo73891a(AbstractC21820b bVar) {
        this.f53238a.removeAllViews();
        this.f53238a.addView(AbstractC21818a.m79106b(this.f53242e).mo73892a(this.f53239b, this.f53240c, this.f53241d));
    }
}
