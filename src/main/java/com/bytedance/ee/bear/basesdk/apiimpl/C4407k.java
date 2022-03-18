package com.bytedance.ee.bear.basesdk.apiimpl;

import android.net.Uri;
import com.bytedance.ee.bear.basesdk.api.AbstractC4386j;
import com.bytedance.ee.bear.contract.drive.AbstractC5138b;
import com.bytedance.ee.bear.middleground.drive.rustsdk.C9408k;

/* renamed from: com.bytedance.ee.bear.basesdk.apiimpl.k */
public final class C4407k implements AbstractC4386j {

    /* renamed from: a */
    private AbstractC5138b f13021a = new C9408k();

    @Override // com.bytedance.ee.bear.basesdk.api.AbstractC4386j
    /* renamed from: a */
    public AbstractC5138b mo17062a() {
        return new C9408k();
    }

    @Override // com.bytedance.ee.bear.basesdk.api.AbstractC4386j
    /* renamed from: a */
    public int mo17061a(String[] strArr) {
        return this.f13021a.mo20420a(strArr);
    }

    @Override // com.bytedance.ee.bear.basesdk.api.AbstractC4386j
    /* renamed from: b */
    public int mo17066b(String[] strArr) {
        return this.f13021a.mo20425b(strArr);
    }

    @Override // com.bytedance.ee.bear.basesdk.api.AbstractC4386j
    /* renamed from: a */
    public String mo17063a(Uri uri, String str, String str2, String str3, AbstractC5138b.AbstractC5140b bVar) {
        return this.f13021a.mo20421a(uri, str, str2, str3, bVar);
    }

    @Override // com.bytedance.ee.bear.basesdk.api.AbstractC4386j
    /* renamed from: a */
    public String mo17064a(String str, String str2, int i, boolean z, AbstractC5138b.AbstractC5139a aVar) {
        return this.f13021a.mo20422a(str, str2, i, z, aVar);
    }

    @Override // com.bytedance.ee.bear.basesdk.api.AbstractC4386j
    /* renamed from: a */
    public String mo17065a(String str, String str2, String str3, String str4, AbstractC5138b.AbstractC5140b bVar) {
        return this.f13021a.mo20424a(str, str2, str3, str4, bVar);
    }
}
