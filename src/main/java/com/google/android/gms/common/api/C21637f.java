package com.google.android.gms.common.api;

import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.common.api.internal.C21676k;
import com.google.android.gms.common.internal.Preconditions;

/* renamed from: com.google.android.gms.common.api.f */
public final class C21637f {

    /* renamed from: com.google.android.gms.common.api.f$a */
    private static final class C21638a<R extends AbstractC21641i> extends BasePendingResult<R> {

        /* renamed from: a */
        private final R f52600a;

        public C21638a(AbstractC21631d dVar, R r) {
            super(dVar);
            this.f52600a = r;
        }

        /* access modifiers changed from: protected */
        @Override // com.google.android.gms.common.api.internal.BasePendingResult
        /* renamed from: a */
        public final R mo73103a(Status status) {
            return this.f52600a;
        }
    }

    /* renamed from: a */
    public static AbstractC21635e<Status> m78316a(Status status, AbstractC21631d dVar) {
        Preconditions.checkNotNull(status, "Result must not be null");
        C21676k kVar = new C21676k(dVar);
        kVar.mo73314b(status);
        return kVar;
    }

    /* renamed from: a */
    public static <R extends AbstractC21641i> AbstractC21635e<R> m78317a(R r, AbstractC21631d dVar) {
        Preconditions.checkNotNull(r, "Result must not be null");
        Preconditions.checkArgument(!r.getStatus().isSuccess(), "Status code must not be SUCCESS");
        C21638a aVar = new C21638a(dVar, r);
        aVar.mo73314b(r);
        return aVar;
    }
}
