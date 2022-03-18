package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.C21608a;
import com.google.android.gms.common.api.AbstractC21631d;
import com.google.android.gms.common.api.C21611a;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.C21746g;
import java.util.Set;

/* renamed from: com.google.android.gms.common.internal.f */
public abstract class AbstractC21745f<T extends IInterface> extends BaseGmsClient<T> implements C21611a.AbstractC21622f, C21746g.AbstractC21747a {

    /* renamed from: a */
    private final C21740c f53072a;

    /* renamed from: b */
    private final Set<Scope> f53073b;

    /* renamed from: c */
    private final Account f53074c;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Set<Scope> mo73705a(Set<Scope> set) {
        return set;
    }

    protected AbstractC21745f(Context context, Looper looper, int i, C21740c cVar, AbstractC21631d.AbstractC21633b bVar, AbstractC21631d.AbstractC21634c cVar2) {
        this(context, looper, AbstractC21748h.m78990a(context), C21608a.m78228a(), i, cVar, (AbstractC21631d.AbstractC21633b) Preconditions.checkNotNull(bVar), (AbstractC21631d.AbstractC21634c) Preconditions.checkNotNull(cVar2));
    }

    protected AbstractC21745f(Context context, Looper looper, AbstractC21748h hVar, C21608a aVar, int i, C21740c cVar, AbstractC21631d.AbstractC21633b bVar, AbstractC21631d.AbstractC21634c cVar2) {
        super(context, looper, hVar, aVar, i, m78977a(bVar), m78978a(cVar2), cVar.mo73694h());
        this.f53072a = cVar;
        this.f53074c = cVar.mo73688b();
        this.f53073b = m78979b(cVar.mo73691e());
    }

    /* renamed from: b */
    private final Set<Scope> m78979b(Set<Scope> set) {
        Set<Scope> a = mo73705a(set);
        for (Scope scope : a) {
            if (!set.contains(scope)) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        return a;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final Account getAccount() {
        return this.f53074c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C21740c mo73706b() {
        return this.f53072a;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final Set<Scope> getScopes() {
        return this.f53073b;
    }

    /* renamed from: a */
    private static BaseGmsClient.BaseConnectionCallbacks m78977a(AbstractC21631d.AbstractC21633b bVar) {
        if (bVar == null) {
            return null;
        }
        return new C21761r(bVar);
    }

    /* renamed from: a */
    private static BaseGmsClient.BaseOnConnectionFailedListener m78978a(AbstractC21631d.AbstractC21634c cVar) {
        if (cVar == null) {
            return null;
        }
        return new C21762s(cVar);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.C21611a.AbstractC21622f
    public int getMinApkVersion() {
        return super.getMinApkVersion();
    }
}
