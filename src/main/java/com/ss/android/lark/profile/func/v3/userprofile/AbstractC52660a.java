package com.ss.android.lark.profile.func.v3.userprofile;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.C1144ai;
import com.ss.android.lark.base.fragment.BaseFragment;
import dagger.hilt.android.internal.lifecycle.C68133a;
import dagger.hilt.android.internal.managers.C68157g;
import dagger.hilt.internal.AbstractC68168c;
import dagger.hilt.internal.C68169d;
import dagger.hilt.internal.C68172f;

/* renamed from: com.ss.android.lark.profile.func.v3.userprofile.a */
public abstract class AbstractC52660a extends BaseFragment implements AbstractC68168c {

    /* renamed from: a */
    private ContextWrapper f130358a;

    /* renamed from: b */
    private volatile C68157g f130359b;

    /* renamed from: c */
    private final Object f130360c = new Object();

    /* renamed from: d */
    private boolean f130361d = false;

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public C68157g mo179962c() {
        return new C68157g(this);
    }

    /* renamed from: a */
    private void mo86226a() {
        if (this.f130358a == null) {
            this.f130358a = C68157g.m264801a(super.getContext(), this);
        }
    }

    @Override // dagger.hilt.internal.AbstractC68167b
    public final Object generatedComponent() {
        return mo179963d().generatedComponent();
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public C1144ai.AbstractC1146b getDefaultViewModelProviderFactory() {
        return C68133a.m264777a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: d */
    public final C68157g mo179963d() {
        if (this.f130359b == null) {
            synchronized (this.f130360c) {
                if (this.f130359b == null) {
                    this.f130359b = mo179962c();
                }
            }
        }
        return this.f130359b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo179964e() {
        if (!this.f130361d) {
            this.f130361d = true;
            ((au) generatedComponent()).mo102478a((UserProfileFragmentV3) C68172f.m264816a(this));
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public Context getContext() {
        if (super.getContext() == null && this.f130358a == null) {
            return null;
        }
        mo86226a();
        return this.f130358a;
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        mo86226a();
        mo179964e();
    }

    @Override // androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        return LayoutInflater.from(C68157g.m264802a(super.onGetLayoutInflater(bundle), this));
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        boolean z;
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f130358a;
        if (contextWrapper == null || C68157g.m264800a(contextWrapper) == activity) {
            z = true;
        } else {
            z = false;
        }
        C68169d.m264815a(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        mo86226a();
        mo179964e();
    }
}
