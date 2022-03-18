package com.ss.android.lark.chatthread;

import android.content.Context;
import androidx.activity.contextaware.AbstractC0205b;
import androidx.lifecycle.C1144ai;
import com.ss.android.lark.base.fragment.BaseFragmentActivity;
import dagger.hilt.android.internal.lifecycle.C68133a;
import dagger.hilt.android.internal.managers.C68145a;
import dagger.hilt.internal.AbstractC68168c;
import dagger.hilt.internal.C68172f;

/* renamed from: com.ss.android.lark.chatthread.f */
abstract class AbstractActivityC35133f extends BaseFragmentActivity implements AbstractC68168c {

    /* renamed from: a */
    private volatile C68145a f90751a;

    /* renamed from: b */
    private final Object f90752b = new Object();

    /* renamed from: c */
    private boolean f90753c = false;

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public C68145a mo129555e() {
        return new C68145a(this);
    }

    /* renamed from: a */
    private void mo129316a() {
        addOnContextAvailableListener(new AbstractC0205b() {
            /* class com.ss.android.lark.chatthread.AbstractActivityC35133f.C351341 */

            @Override // androidx.activity.contextaware.AbstractC0205b
            /* renamed from: a */
            public void mo635a(Context context) {
                AbstractActivityC35133f.this.mo129557g();
            }
        });
    }

    @Override // dagger.hilt.internal.AbstractC68167b
    public final Object generatedComponent() {
        return mo129556f().generatedComponent();
    }

    @Override // androidx.activity.ComponentActivity, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public C1144ai.AbstractC1146b getDefaultViewModelProviderFactory() {
        return C68133a.m264776a(this, super.getDefaultViewModelProviderFactory());
    }

    AbstractActivityC35133f() {
        mo129316a();
    }

    /* renamed from: f */
    public final C68145a mo129556f() {
        if (this.f90751a == null) {
            synchronized (this.f90752b) {
                if (this.f90751a == null) {
                    this.f90751a = mo129555e();
                }
            }
        }
        return this.f90751a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo129557g() {
        if (!this.f90753c) {
            this.f90753c = true;
            ((AbstractC35078a) generatedComponent()).mo102461a((ChatThreadActivity) C68172f.m264816a(this));
        }
    }
}
