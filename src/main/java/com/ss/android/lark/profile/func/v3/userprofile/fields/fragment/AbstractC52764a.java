package com.ss.android.lark.profile.func.v3.userprofile.fields.fragment;

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

/* renamed from: com.ss.android.lark.profile.func.v3.userprofile.fields.fragment.a */
public abstract class AbstractC52764a extends BaseFragment implements AbstractC68168c {

    /* renamed from: a */
    private ContextWrapper f130524a;

    /* renamed from: b */
    private volatile C68157g f130525b;

    /* renamed from: c */
    private final Object f130526c = new Object();

    /* renamed from: d */
    private boolean f130527d = false;

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public C68157g mo180278c() {
        return new C68157g(this);
    }

    /* renamed from: a */
    private void mo86226a() {
        if (this.f130524a == null) {
            this.f130524a = C68157g.m264801a(super.getContext(), this);
        }
    }

    @Override // dagger.hilt.internal.AbstractC68167b
    public final Object generatedComponent() {
        return mo180279d().generatedComponent();
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public C1144ai.AbstractC1146b getDefaultViewModelProviderFactory() {
        return C68133a.m264777a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: d */
    public final C68157g mo180279d() {
        if (this.f130525b == null) {
            synchronized (this.f130526c) {
                if (this.f130525b == null) {
                    this.f130525b = mo180278c();
                }
            }
        }
        return this.f130525b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo180280e() {
        if (!this.f130527d) {
            this.f130527d = true;
            ((AbstractC52781d) generatedComponent()).mo102477a((PersonalInfoFragment) C68172f.m264816a(this));
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public Context getContext() {
        if (super.getContext() == null && this.f130524a == null) {
            return null;
        }
        mo86226a();
        return this.f130524a;
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        mo86226a();
        mo180280e();
    }

    @Override // androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        return LayoutInflater.from(C68157g.m264802a(super.onGetLayoutInflater(bundle), this));
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        boolean z;
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f130524a;
        if (contextWrapper == null || C68157g.m264800a(contextWrapper) == activity) {
            z = true;
        } else {
            z = false;
        }
        C68169d.m264815a(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        mo86226a();
        mo180280e();
    }
}
