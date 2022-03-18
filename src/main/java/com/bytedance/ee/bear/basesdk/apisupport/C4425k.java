package com.bytedance.ee.bear.basesdk.apisupport;

import android.net.Uri;
import com.bytedance.ee.bear.basesdk.api.AbstractC4386j;
import com.bytedance.ee.bear.contract.drive.AbstractC5138b;
import com.bytedance.ee.log.C13479a;

/* renamed from: com.bytedance.ee.bear.basesdk.apisupport.k */
final class C4425k implements AbstractC4386j {

    /* renamed from: a */
    private final AbstractC4431q f13056a;

    /* renamed from: b */
    private final AbstractC4386j f13057b;

    @Override // com.bytedance.ee.bear.basesdk.api.AbstractC4386j
    /* renamed from: a */
    public AbstractC5138b mo17062a() {
        C13479a.m54764b("Apisupport", "api call: getDriveUploadDownProxy");
        this.f13056a.mo17158a();
        return this.f13057b.mo17062a();
    }

    @Override // com.bytedance.ee.bear.basesdk.api.AbstractC4386j
    /* renamed from: a */
    public int mo17061a(String[] strArr) {
        C13479a.m54764b("Apisupport", "api call: driveCancelDownload");
        this.f13056a.mo17158a();
        return this.f13057b.mo17061a(strArr);
    }

    @Override // com.bytedance.ee.bear.basesdk.api.AbstractC4386j
    /* renamed from: b */
    public int mo17066b(String[] strArr) {
        C13479a.m54764b("Apisupport", "api call: driveCancelUpload");
        this.f13056a.mo17158a();
        return this.f13057b.mo17066b(strArr);
    }

    C4425k(AbstractC4431q qVar, AbstractC4386j jVar) {
        this.f13056a = qVar;
        this.f13057b = jVar;
    }

    @Override // com.bytedance.ee.bear.basesdk.api.AbstractC4386j
    /* renamed from: a */
    public String mo17063a(Uri uri, String str, String str2, String str3, AbstractC5138b.AbstractC5140b bVar) {
        C13479a.m54764b("Apisupport", "api call: driveUpload");
        this.f13056a.mo17158a();
        return this.f13057b.mo17063a(uri, str, str2, str3, bVar);
    }

    @Override // com.bytedance.ee.bear.basesdk.api.AbstractC4386j
    /* renamed from: a */
    public String mo17064a(String str, String str2, int i, boolean z, AbstractC5138b.AbstractC5139a aVar) {
        C13479a.m54764b("Apisupport", "api call: driveDownloadNormal");
        this.f13056a.mo17158a();
        return this.f13057b.mo17064a(str, str2, i, z, aVar);
    }

    @Override // com.bytedance.ee.bear.basesdk.api.AbstractC4386j
    /* renamed from: a */
    public String mo17065a(String str, String str2, String str3, String str4, AbstractC5138b.AbstractC5140b bVar) {
        C13479a.m54764b("Apisupport", "api call: driveUpload");
        this.f13056a.mo17158a();
        return this.f13057b.mo17065a(str, str2, str3, str4, bVar);
    }
}
