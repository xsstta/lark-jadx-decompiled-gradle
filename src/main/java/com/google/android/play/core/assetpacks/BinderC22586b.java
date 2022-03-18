package com.google.android.play.core.assetpacks;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.play.core.internal.AbstractBinderC22653v;
import com.google.android.play.core.internal.AbstractC22656y;
import com.google.android.play.core.internal.C22630b;
import com.google.android.play.core.internal.bf;
import java.util.Arrays;

/* renamed from: com.google.android.play.core.assetpacks.b */
final class BinderC22586b extends AbstractBinderC22653v {

    /* renamed from: a */
    private final C22630b f55749a = new C22630b("AssetPackExtractionService");

    /* renamed from: b */
    private final Context f55750b;

    /* renamed from: c */
    private final AssetPackExtractionService f55751c;

    /* renamed from: d */
    private final C22614x f55752d;

    BinderC22586b(Context context, AssetPackExtractionService assetPackExtractionService, C22614x xVar) {
        this.f55750b = context;
        this.f55751c = assetPackExtractionService;
        this.f55752d = xVar;
    }

    @Override // com.google.android.play.core.internal.AbstractC22654w
    /* renamed from: a */
    public final void mo78755a(Bundle bundle, AbstractC22656y yVar) throws RemoteException {
        String[] packagesForUid;
        this.f55749a.mo78871a("updateServiceState AIDL call", new Object[0]);
        if (bf.m82327a(this.f55750b) && (packagesForUid = this.f55750b.getPackageManager().getPackagesForUid(Binder.getCallingUid())) != null && Arrays.asList(packagesForUid).contains("com.android.vending")) {
            yVar.mo78961a(this.f55751c.mo78683a(bundle), new Bundle());
            return;
        }
        yVar.mo78960a(new Bundle());
        this.f55751c.mo78684a();
    }

    @Override // com.google.android.play.core.internal.AbstractC22654w
    /* renamed from: a */
    public final void mo78756a(AbstractC22656y yVar) throws RemoteException {
        this.f55752d.mo78840d();
        yVar.mo78962b(new Bundle());
    }
}
