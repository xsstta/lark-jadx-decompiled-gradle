package com.ss.android.lark.profile.func.v3.userprofile;

import android.content.Context;
import androidx.activity.contextaware.AbstractC0205b;
import androidx.lifecycle.C1144ai;
import com.ss.android.lark.base.fragment.BaseFragmentActivity;
import dagger.hilt.android.internal.lifecycle.C68133a;
import dagger.hilt.android.internal.managers.C68145a;
import dagger.hilt.internal.AbstractC68168c;
import dagger.hilt.internal.C68172f;

public abstract class Hilt_UserProfileActivityV3 extends BaseFragmentActivity implements AbstractC68168c {

    /* renamed from: a */
    private volatile C68145a f130353a;

    /* renamed from: b */
    private final Object f130354b = new Object();

    /* renamed from: c */
    private boolean f130355c = false;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C68145a mo179949a() {
        return new C68145a(this);
    }

    /* renamed from: d */
    private void mo179955d() {
        addOnContextAvailableListener(new AbstractC0205b() {
            /* class com.ss.android.lark.profile.func.v3.userprofile.Hilt_UserProfileActivityV3.C526591 */

            @Override // androidx.activity.contextaware.AbstractC0205b
            /* renamed from: a */
            public void mo635a(Context context) {
                Hilt_UserProfileActivityV3.this.mo179951c();
            }
        });
    }

    @Override // dagger.hilt.internal.AbstractC68167b
    public final Object generatedComponent() {
        return mo179950b().generatedComponent();
    }

    @Override // androidx.activity.ComponentActivity, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public C1144ai.AbstractC1146b getDefaultViewModelProviderFactory() {
        return C68133a.m264776a(this, super.getDefaultViewModelProviderFactory());
    }

    Hilt_UserProfileActivityV3() {
        mo179955d();
    }

    /* renamed from: b */
    public final C68145a mo179950b() {
        if (this.f130353a == null) {
            synchronized (this.f130354b) {
                if (this.f130353a == null) {
                    this.f130353a = mo179949a();
                }
            }
        }
        return this.f130353a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo179951c() {
        if (!this.f130355c) {
            this.f130355c = true;
            ((AbstractC52747f) generatedComponent()).mo102463a((UserProfileActivityV3) C68172f.m264816a(this));
        }
    }
}
