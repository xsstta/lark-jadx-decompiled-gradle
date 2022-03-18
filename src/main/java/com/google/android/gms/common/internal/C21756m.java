package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.api.C21611a;

/* renamed from: com.google.android.gms.common.internal.m */
public class C21756m<T extends IInterface> extends AbstractC21745f<T> {

    /* renamed from: a */
    private final C21611a.AbstractC21624h<T> f53097a;

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public String getStartServiceAction() {
        return this.f53097a.mo73240a();
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public String getServiceDescriptor() {
        return this.f53097a.mo73242b();
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public T createServiceInterface(IBinder iBinder) {
        return this.f53097a.mo73239a(iBinder);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public void onSetConnectState(int i, T t) {
        this.f53097a.mo73241a(i, t);
    }

    /* renamed from: a */
    public C21611a.AbstractC21624h<T> mo73729a() {
        return this.f53097a;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.C21611a.AbstractC21622f, com.google.android.gms.common.internal.AbstractC21745f
    public int getMinApkVersion() {
        return super.getMinApkVersion();
    }
}
