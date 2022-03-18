package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.C21611a;
import java.util.ArrayList;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.common.api.internal.ae */
public final class C21649ae extends AbstractRunnableC21652ah {

    /* renamed from: a */
    private final ArrayList<C21611a.AbstractC21622f> f52628a;

    /* renamed from: b */
    private final /* synthetic */ C21690y f52629b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21649ae(C21690y yVar, ArrayList<C21611a.AbstractC21622f> arrayList) {
        super(yVar, null);
        this.f52629b = yVar;
        this.f52628a = arrayList;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractRunnableC21652ah
    /* renamed from: a */
    public final void mo73336a() {
        this.f52629b.f52887a.f52675d.f52637c = this.f52629b.m78824i();
        ArrayList<C21611a.AbstractC21622f> arrayList = this.f52628a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            C21611a.AbstractC21622f fVar = arrayList.get(i);
            i++;
            fVar.getRemoteService(this.f52629b.f52901o, this.f52629b.f52887a.f52675d.f52637c);
        }
    }
}
