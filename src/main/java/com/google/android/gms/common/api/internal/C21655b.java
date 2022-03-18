package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.AbstractC21631d;
import com.google.android.gms.common.api.AbstractC21641i;
import com.google.android.gms.common.api.C21611a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C21756m;
import com.google.android.gms.common.internal.Preconditions;

/* renamed from: com.google.android.gms.common.api.internal.b */
public class C21655b {

    /* renamed from: com.google.android.gms.common.api.internal.b$b */
    public interface AbstractC21657b<R> {
        /* renamed from: a */
        void mo73385a(R r);
    }

    /* renamed from: com.google.android.gms.common.api.internal.b$a */
    public static abstract class AbstractC21656a<R extends AbstractC21641i, A extends C21611a.AbstractC21613b> extends BasePendingResult<R> implements AbstractC21657b<R> {

        /* renamed from: a */
        private final C21611a.C21614c<A> f52695a;

        /* renamed from: b */
        private final C21611a<?> f52696b;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract void mo73104a(A a) throws RemoteException;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo73384a(R r) {
        }

        protected AbstractC21656a(C21611a<?> aVar, AbstractC21631d dVar) {
            super((AbstractC21631d) Preconditions.checkNotNull(dVar, "GoogleApiClient must not be null"));
            Preconditions.checkNotNull(aVar, "Api must not be null");
            this.f52695a = (C21611a.C21614c<A>) aVar.mo73222c();
            this.f52696b = aVar;
        }

        /* renamed from: d */
        public final C21611a.C21614c<A> mo73388d() {
            return this.f52695a;
        }

        /* renamed from: e */
        public final C21611a<?> mo73389e() {
            return this.f52696b;
        }

        /* renamed from: b */
        public final void mo73387b(A a) throws DeadObjectException {
            if (a instanceof C21756m) {
                a = ((C21756m) a).mo73729a();
            }
            try {
                mo73104a((C21611a.AbstractC21613b) a);
            } catch (DeadObjectException e) {
                m78441a((RemoteException) e);
                throw e;
            } catch (RemoteException e2) {
                m78441a(e2);
            }
        }

        /* renamed from: b */
        public final void mo73386b(Status status) {
            Preconditions.checkArgument(!status.isSuccess(), "Failed result must not be success");
            R a = mo73103a(status);
            mo73314b(a);
            mo73384a((AbstractC21641i) a);
        }

        /* renamed from: a */
        private void m78441a(RemoteException remoteException) {
            mo73386b(new Status(8, remoteException.getLocalizedMessage(), null));
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.google.android.gms.common.api.internal.b$a<R extends com.google.android.gms.common.api.i, A extends com.google.android.gms.common.api.a$b> */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.gms.common.api.internal.C21655b.AbstractC21657b
        /* renamed from: a */
        public /* synthetic */ void mo73385a(Object obj) {
            super.mo73314b((AbstractC21641i) obj);
        }
    }
}
