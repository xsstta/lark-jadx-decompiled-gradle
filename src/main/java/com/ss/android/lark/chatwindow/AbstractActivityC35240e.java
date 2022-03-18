package com.ss.android.lark.chatwindow;

import android.content.Context;
import androidx.activity.contextaware.AbstractC0205b;
import androidx.lifecycle.C1144ai;
import com.ss.android.lark.base.fragment.BaseFragmentActivity;
import dagger.hilt.android.internal.lifecycle.C68133a;
import dagger.hilt.android.internal.managers.C68145a;
import dagger.hilt.internal.AbstractC68168c;
import dagger.hilt.internal.C68172f;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.lark.chatwindow.e */
public abstract class AbstractActivityC35240e extends BaseFragmentActivity implements AbstractC68168c {

    /* renamed from: a */
    private volatile C68145a f91003a;

    /* renamed from: b */
    private final Object f91004b = new Object();

    /* renamed from: c */
    private boolean f91005c = false;

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public C68145a mo129700e() {
        return new C68145a(this);
    }

    /* renamed from: a */
    private void mo129674a() {
        addOnContextAvailableListener(new AbstractC0205b() {
            /* class com.ss.android.lark.chatwindow.AbstractActivityC35240e.C352411 */

            @Override // androidx.activity.contextaware.AbstractC0205b
            /* renamed from: a */
            public void mo635a(Context context) {
                AbstractActivityC35240e.this.mo129702g();
            }
        });
    }

    @Override // dagger.hilt.internal.AbstractC68167b
    public final Object generatedComponent() {
        return mo129701f().generatedComponent();
    }

    @Override // androidx.activity.ComponentActivity, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public C1144ai.AbstractC1146b getDefaultViewModelProviderFactory() {
        return C68133a.m264776a(this, super.getDefaultViewModelProviderFactory());
    }

    AbstractActivityC35240e() {
        mo129674a();
    }

    /* renamed from: f */
    public final C68145a mo129701f() {
        if (this.f91003a == null) {
            synchronized (this.f91004b) {
                if (this.f91003a == null) {
                    this.f91003a = mo129700e();
                }
            }
        }
        return this.f91003a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo129702g() {
        if (!this.f91005c) {
            this.f91005c = true;
            ((AbstractC35239c) generatedComponent()).mo102462a((ChatWindowActivity) C68172f.m264816a(this));
        }
    }
}
