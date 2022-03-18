package com.google.android.gms.auth.api.accounttransfer;

import android.os.RemoteException;
import com.google.android.gms.common.api.C21611a;
import com.google.android.gms.common.api.C21628c;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.AbstractC21677l;
import com.google.android.gms.internal.auth.C21882u;
import com.google.android.gms.internal.auth.zzs;
import com.google.android.gms.internal.auth.zzz;
import com.google.android.gms.tasks.TaskCompletionSource;

public class AccountTransferClient extends C21628c<C21552e> {

    /* renamed from: b */
    private static final C21611a.C21623g<C21882u> f52355b;

    /* renamed from: c */
    private static final C21611a.AbstractC21612a<C21882u, C21552e> f52356c;

    /* renamed from: d */
    private static final C21611a<C21552e> f52357d;

    /* access modifiers changed from: private */
    /* renamed from: com.google.android.gms.auth.api.accounttransfer.AccountTransferClient$a */
    public static abstract class AbstractC21546a<T> extends AbstractC21677l<C21882u, T> {

        /* renamed from: a */
        private TaskCompletionSource<T> f52358a;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract void mo72947a(zzz zzz) throws RemoteException;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo72948a(T t) {
            this.f52358a.setResult(t);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo72945a(Status status) {
            AccountTransferClient.m78058b(this.f52358a, status);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.android.gms.common.api.a$b, com.google.android.gms.tasks.TaskCompletionSource] */
        /* access modifiers changed from: protected */
        @Override // com.google.android.gms.common.api.internal.AbstractC21677l
        /* renamed from: a */
        public /* synthetic */ void mo72946a(C21882u uVar, TaskCompletionSource taskCompletionSource) throws RemoteException {
            this.f52358a = taskCompletionSource;
            mo72947a((zzz) uVar.getService());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.google.android.gms.auth.api.accounttransfer.AccountTransferClient$b */
    public static abstract class AbstractC21547b extends AbstractC21546a<Void> {
    }

    /* access modifiers changed from: private */
    public static class zza<T> extends zzs {
        private AbstractC21546a<T> zzav;

        public zza(AbstractC21546a<T> aVar) {
            this.zzav = aVar;
        }

        @Override // com.google.android.gms.internal.auth.zzs, com.google.android.gms.internal.auth.zzx
        public final void onFailure(Status status) {
            this.zzav.mo72945a(status);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m78058b(TaskCompletionSource taskCompletionSource, Status status) {
        taskCompletionSource.setException(new AccountTransferException(status));
    }

    static {
        C21611a.C21623g<C21882u> gVar = new C21611a.C21623g<>();
        f52355b = gVar;
        C21548a aVar = new C21548a();
        f52356c = aVar;
        f52357d = new C21611a<>("AccountTransfer.ACCOUNT_TRANSFER_API", aVar, gVar);
    }
}
