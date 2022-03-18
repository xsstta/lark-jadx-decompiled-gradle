package com.google.android.gms.common.api.internal;

import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.AbstractC21631d;
import com.google.android.gms.common.internal.Preconditions;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public class cd extends cf {

    /* renamed from: e */
    private final SparseArray<C21665a> f52783e = new SparseArray<>();

    /* renamed from: b */
    public static cd m78614b(C21666d dVar) {
        AbstractC21667e a = m78341a(dVar);
        cd cdVar = (cd) a.mo73471a("AutoManageHelper", cd.class);
        if (cdVar != null) {
            return cdVar;
        }
        return new cd(a);
    }

    /* access modifiers changed from: private */
    /* renamed from: com.google.android.gms.common.api.internal.cd$a */
    public class C21665a implements AbstractC21631d.AbstractC21634c {

        /* renamed from: a */
        public final int f52784a;

        /* renamed from: b */
        public final AbstractC21631d f52785b;

        /* renamed from: c */
        public final AbstractC21631d.AbstractC21634c f52786c;

        public C21665a(int i, AbstractC21631d dVar, AbstractC21631d.AbstractC21634c cVar) {
            this.f52784a = i;
            this.f52785b = dVar;
            this.f52786c = cVar;
            dVar.mo73263a(this);
        }

        @Override // com.google.android.gms.common.api.AbstractC21631d.AbstractC21634c
        public final void onConnectionFailed(ConnectionResult connectionResult) {
            String valueOf = String.valueOf(connectionResult);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
            sb.append("beginFailureResolution for ");
            sb.append(valueOf);
            Log.d("AutoManageHelper", sb.toString());
            cd.this.mo73456b(connectionResult, this.f52784a);
        }
    }

    private cd(AbstractC21667e eVar) {
        super(eVar);
        this.f52619a.mo73472a("AutoManageHelper", this);
    }

    /* renamed from: a */
    public final void mo73450a(int i, AbstractC21631d dVar, AbstractC21631d.AbstractC21634c cVar) {
        Preconditions.checkNotNull(dVar, "GoogleApiClient instance cannot be null");
        boolean z = this.f52783e.indexOfKey(i) < 0;
        StringBuilder sb = new StringBuilder(54);
        sb.append("Already managing a GoogleApiClient with id ");
        sb.append(i);
        Preconditions.checkState(z, sb.toString());
        cg cgVar = (cg) this.f52794c.get();
        boolean z2 = this.f52793b;
        String valueOf = String.valueOf(cgVar);
        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 49);
        sb2.append("starting AutoManage for client ");
        sb2.append(i);
        sb2.append(" ");
        sb2.append(z2);
        sb2.append(" ");
        sb2.append(valueOf);
        Log.d("AutoManageHelper", sb2.toString());
        this.f52783e.put(i, new C21665a(i, dVar, cVar));
        if (this.f52793b && cgVar == null) {
            String valueOf2 = String.valueOf(dVar);
            StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf2).length() + 11);
            sb3.append("connecting ");
            sb3.append(valueOf2);
            Log.d("AutoManageHelper", sb3.toString());
            dVar.mo73273e();
        }
    }

    /* renamed from: a */
    public final void mo73449a(int i) {
        C21665a aVar = this.f52783e.get(i);
        this.f52783e.remove(i);
        if (aVar != null) {
            aVar.f52785b.mo73269b(aVar);
            aVar.f52785b.mo73275g();
        }
    }

    @Override // com.google.android.gms.common.api.internal.cf, com.google.android.gms.common.api.internal.LifecycleCallback
    /* renamed from: b */
    public void mo73329b() {
        super.mo73329b();
        boolean z = this.f52793b;
        String valueOf = String.valueOf(this.f52783e);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 14);
        sb.append("onStart ");
        sb.append(z);
        sb.append(" ");
        sb.append(valueOf);
        Log.d("AutoManageHelper", sb.toString());
        if (this.f52794c.get() == null) {
            for (int i = 0; i < this.f52783e.size(); i++) {
                C21665a b = m78613b(i);
                if (b != null) {
                    b.f52785b.mo73273e();
                }
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.cf, com.google.android.gms.common.api.internal.LifecycleCallback
    /* renamed from: d */
    public void mo73332d() {
        super.mo73332d();
        for (int i = 0; i < this.f52783e.size(); i++) {
            C21665a b = m78613b(i);
            if (b != null) {
                b.f52785b.mo73275g();
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    /* renamed from: a */
    public void mo73328a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        for (int i = 0; i < this.f52783e.size(); i++) {
            C21665a b = m78613b(i);
            if (b != null) {
                printWriter.append((CharSequence) str).append("GoogleApiClient #").print(b.f52784a);
                printWriter.println(":");
                b.f52785b.mo73265a(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.api.internal.cf
    /* renamed from: a */
    public final void mo73451a(ConnectionResult connectionResult, int i) {
        Log.w("AutoManageHelper", "Unresolved error while connecting client. Stopping auto-manage.");
        if (i < 0) {
            Log.wtf("AutoManageHelper", "AutoManageLifecycleHelper received onErrorResolutionFailed callback but no failing client ID is set", new Exception());
            return;
        }
        C21665a aVar = this.f52783e.get(i);
        if (aVar != null) {
            mo73449a(i);
            AbstractC21631d.AbstractC21634c cVar = aVar.f52786c;
            if (cVar != null) {
                cVar.onConnectionFailed(connectionResult);
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.api.internal.cf
    /* renamed from: f */
    public final void mo73452f() {
        for (int i = 0; i < this.f52783e.size(); i++) {
            C21665a b = m78613b(i);
            if (b != null) {
                b.f52785b.mo73273e();
            }
        }
    }

    /* renamed from: b */
    private final C21665a m78613b(int i) {
        if (this.f52783e.size() <= i) {
            return null;
        }
        SparseArray<C21665a> sparseArray = this.f52783e;
        return sparseArray.get(sparseArray.keyAt(i));
    }
}
