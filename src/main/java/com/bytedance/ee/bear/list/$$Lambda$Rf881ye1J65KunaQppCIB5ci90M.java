package com.bytedance.ee.bear.list;

import android.os.IInterface;
import com.bytedance.ee.bear.contract.BinderListDataChangeCallback;
import com.bytedance.ee.bear.service.remote.C10959f;

/* renamed from: com.bytedance.ee.bear.list.-$$Lambda$Rf881ye1J65KunaQppCIB5ci90M  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$Rf881ye1J65KunaQppCIB5ci90M implements C10959f.AbstractC10961b {
    public static final /* synthetic */ $$Lambda$Rf881ye1J65KunaQppCIB5ci90M INSTANCE = new $$Lambda$Rf881ye1J65KunaQppCIB5ci90M();

    private /* synthetic */ $$Lambda$Rf881ye1J65KunaQppCIB5ci90M() {
    }

    @Override // com.bytedance.ee.bear.service.remote.C10959f.AbstractC10961b
    public final void notify(IInterface iInterface) {
        ((BinderListDataChangeCallback) iInterface).onFileOpen();
    }
}
