package com.bytedance.ee.bear.contract.drive;

import android.text.TextUtils;
import com.bytedance.ee.bear.document.C5627ab;
import com.bytedance.ee.bear.document.C5681c;
import com.bytedance.ee.bear.document.offline.file.p319a.C5937c;
import com.bytedance.ee.bear.document.offline.file.p319a.C5938d;
import com.bytedance.ee.bear.document.offline.offlinestorage.C5955d;
import com.bytedance.ee.bear.document.offline.p315b.C5893b;
import com.bytedance.ee.bear.drive.AbstractC6317a;
import com.bytedance.ee.bear.middleground.drive.export.DownloadRequestInfo;
import com.bytedance.ee.log.C13479a;
import io.reactivex.AbstractC68307f;
import java.io.File;
import java.util.Map;

/* renamed from: com.bytedance.ee.bear.contract.drive.a */
public class C5136a implements AbstractC6317a {
    @Override // com.bytedance.ee.bear.drive.AbstractC6317a
    /* renamed from: a */
    public String mo20408a() {
        return "docsource://com.bytedance.net/file/f/";
    }

    @Override // com.bytedance.ee.bear.drive.AbstractC6317a
    /* renamed from: b */
    public boolean mo20411b(String str) {
        return C5627ab.m22836a(str);
    }

    @Override // com.bytedance.ee.bear.drive.AbstractC6317a
    /* renamed from: c */
    public boolean mo20412c(String str) {
        return C5681c.m23038a(str);
    }

    @Override // com.bytedance.ee.bear.drive.AbstractC6317a
    /* renamed from: a */
    public boolean mo20410a(String str) {
        return C5627ab.m22839c(str);
    }

    @Override // com.bytedance.ee.bear.drive.AbstractC6317a
    /* renamed from: f */
    public String mo20415f(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return mo20416g(str);
    }

    @Override // com.bytedance.ee.bear.drive.AbstractC6317a
    /* renamed from: d */
    public String mo20413d(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (C5627ab.m22836a(str)) {
            return mo20414e(str);
        }
        if (C5681c.m23038a(str)) {
            return mo20416g(str);
        }
        return null;
    }

    @Override // com.bytedance.ee.bear.drive.AbstractC6317a
    /* renamed from: e */
    public String mo20414e(String str) {
        C5937c d = C5955d.m24025b().mo24097d(str);
        if (d != null) {
            String d2 = d.mo23961d();
            if (new File(d2).exists()) {
                C13479a.m54764b("DriveFileProtocolImpl", "getFilePathByLocalUrl success.");
                return d2;
            }
            C13479a.m54764b("DriveFileProtocolImpl", "invalid path.");
            C5955d.m24025b().mo24103g(d2);
        }
        return null;
    }

    @Override // com.bytedance.ee.bear.drive.AbstractC6317a
    /* renamed from: g */
    public String mo20416g(String str) {
        C5937c e = C5955d.m24025b().mo24099e(str);
        if (e == null) {
            return null;
        }
        String d = e.mo23961d();
        if (new File(d).exists()) {
            C13479a.m54764b("DriveFileProtocolImpl", "getFilePathByNetUrl success");
            return d;
        }
        C13479a.m54764b("DriveFileProtocolImpl", "invalid path.");
        C5955d.m24025b().mo24103g(d);
        return null;
    }

    @Override // com.bytedance.ee.bear.drive.AbstractC6317a
    /* renamed from: a */
    public AbstractC68307f<Boolean> mo20407a(String str, Map<String, String> map) {
        return C5938d.m23938a(str, map, false);
    }

    @Override // com.bytedance.ee.bear.drive.AbstractC6317a
    /* renamed from: a */
    public void mo20409a(String str, boolean z, final AbstractC6317a.AbstractC6318a aVar, DownloadRequestInfo.DownloadType downloadType, String str2, int i) {
        C5893b.m23724a().mo23809a(str, downloadType, z, new C5893b.AbstractC5899c() {
            /* class com.bytedance.ee.bear.contract.drive.C5136a.C51371 */

            @Override // com.bytedance.ee.bear.document.offline.p315b.C5893b.AbstractC5899c
            /* renamed from: a */
            public void mo20417a(String str) {
                AbstractC6317a.AbstractC6318a aVar = aVar;
                if (aVar != null) {
                    aVar.mo25411a(str);
                }
            }

            @Override // com.bytedance.ee.bear.document.offline.p315b.C5893b.AbstractC5899c
            /* renamed from: a */
            public void mo20418a(String str, C5893b.C5896a aVar) {
                AbstractC6317a.AbstractC6318a aVar2 = aVar;
                if (aVar2 != null) {
                    aVar2.mo25412a(str, aVar.mo23817b().getAbsolutePath());
                }
            }

            @Override // com.bytedance.ee.bear.document.offline.p315b.C5893b.AbstractC5899c
            /* renamed from: a */
            public void mo20419a(String str, String str2, int i) {
                AbstractC6317a.AbstractC6318a aVar = aVar;
                if (aVar != null) {
                    aVar.mo25413a(str, str2, i);
                }
            }
        }, str2, i);
    }
}
