package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.play.core.internal.AbstractBinderC22651t;
import com.google.android.play.core.tasks.C22741m;
import java.util.List;

class al<T> extends AbstractBinderC22651t {

    /* renamed from: a */
    final C22741m<T> f55681a;

    /* renamed from: b */
    final /* synthetic */ C22604n f55682b;

    al(C22604n nVar, C22741m<T> mVar) {
        this.f55682b = nVar;
        this.f55681a = mVar;
    }

    al(C22604n nVar, C22741m mVar, byte[] bArr) {
        this(nVar, mVar);
    }

    al(C22604n nVar, C22741m mVar, char[] cArr) {
        this(nVar, mVar);
    }

    al(C22604n nVar, C22741m mVar, int[] iArr) {
        this(nVar, mVar);
    }

    al(C22604n nVar, C22741m mVar, short[] sArr) {
        this(nVar, mVar);
    }

    @Override // com.google.android.play.core.internal.AbstractC22652u
    /* renamed from: a */
    public void mo78736a() {
        this.f55682b.f55959e.mo78858a();
        C22604n.f55955a.mo78874c("onCancelDownloads()", new Object[0]);
    }

    @Override // com.google.android.play.core.internal.AbstractC22652u
    /* renamed from: a */
    public final void mo78737a(int i) {
        this.f55682b.f55959e.mo78858a();
        C22604n.f55955a.mo78874c("onCancelDownload(%d)", Integer.valueOf(i));
    }

    @Override // com.google.android.play.core.internal.AbstractC22652u
    /* renamed from: a */
    public void mo78738a(int i, Bundle bundle) {
        this.f55682b.f55959e.mo78858a();
        C22604n.f55955a.mo78874c("onStartDownload(%d)", Integer.valueOf(i));
    }

    @Override // com.google.android.play.core.internal.AbstractC22652u
    /* renamed from: a */
    public void mo78739a(Bundle bundle) {
        this.f55682b.f55959e.mo78858a();
        int i = bundle.getInt("error_code");
        C22604n.f55955a.mo78873b("onError(%d)", Integer.valueOf(i));
        this.f55681a.mo79091b(new AssetPackException(i));
    }

    @Override // com.google.android.play.core.internal.AbstractC22652u
    /* renamed from: a */
    public void mo78740a(Bundle bundle, Bundle bundle2) {
        this.f55682b.f55960f.mo78858a();
        C22604n.f55955a.mo78874c("onKeepAlive(%b)", Boolean.valueOf(bundle.getBoolean("keep_alive")));
    }

    @Override // com.google.android.play.core.internal.AbstractC22652u
    /* renamed from: a */
    public void mo78741a(List<Bundle> list) {
        this.f55682b.f55959e.mo78858a();
        C22604n.f55955a.mo78874c("onGetSessionStates", new Object[0]);
    }

    @Override // com.google.android.play.core.internal.AbstractC22652u
    /* renamed from: b */
    public void mo78742b() {
        this.f55682b.f55959e.mo78858a();
        C22604n.f55955a.mo78874c("onRemoveModule()", new Object[0]);
    }

    @Override // com.google.android.play.core.internal.AbstractC22652u
    /* renamed from: b */
    public final void mo78743b(int i) {
        this.f55682b.f55959e.mo78858a();
        C22604n.f55955a.mo78874c("onGetSession(%d)", Integer.valueOf(i));
    }

    @Override // com.google.android.play.core.internal.AbstractC22652u
    /* renamed from: b */
    public void mo78744b(Bundle bundle) {
        this.f55682b.f55959e.mo78858a();
        C22604n.f55955a.mo78874c("onNotifyChunkTransferred(%s, %s, %d, session=%d)", bundle.getString("module_name"), bundle.getString("slice_id"), Integer.valueOf(bundle.getInt("chunk_number")), Integer.valueOf(bundle.getInt("session_id")));
    }

    @Override // com.google.android.play.core.internal.AbstractC22652u
    /* renamed from: b */
    public void mo78745b(Bundle bundle, Bundle bundle2) throws RemoteException {
        this.f55682b.f55959e.mo78858a();
        C22604n.f55955a.mo78874c("onGetChunkFileDescriptor", new Object[0]);
    }

    @Override // com.google.android.play.core.internal.AbstractC22652u
    /* renamed from: c */
    public void mo78746c(Bundle bundle) {
        this.f55682b.f55959e.mo78858a();
        C22604n.f55955a.mo78874c("onNotifyModuleCompleted(%s, sessionId=%d)", bundle.getString("module_name"), Integer.valueOf(bundle.getInt("session_id")));
    }

    @Override // com.google.android.play.core.internal.AbstractC22652u
    /* renamed from: c */
    public void mo78747c(Bundle bundle, Bundle bundle2) {
        this.f55682b.f55959e.mo78858a();
        C22604n.f55955a.mo78874c("onRequestDownloadInfo()", new Object[0]);
    }

    @Override // com.google.android.play.core.internal.AbstractC22652u
    /* renamed from: d */
    public void mo78748d(Bundle bundle) {
        this.f55682b.f55959e.mo78858a();
        C22604n.f55955a.mo78874c("onNotifySessionFailed(%d)", Integer.valueOf(bundle.getInt("session_id")));
    }
}
