package com.bytedance.ee.bear.contract.doc;

import com.bytedance.ee.bear.DocMetaInfo;
import com.bytedance.ee.bear.DocObjInfo;
import com.bytedance.ee.bear.document.AbstractC6158t;
import com.bytedance.ee.bear.document.docmetainfo.DocMetaInfoExecutor;
import com.bytedance.ee.bear.document.docsobjinfo.DocObjInfoExecutor;
import io.reactivex.AbstractC68307f;

/* renamed from: com.bytedance.ee.bear.contract.doc.b */
public class C5131b implements AbstractC6158t {
    @Override // com.bytedance.ee.bear.document.AbstractC6158t
    /* renamed from: a */
    public String mo20315a() {
        return C5130a.m20992a();
    }

    @Override // com.bytedance.ee.bear.document.AbstractC6158t
    /* renamed from: b */
    public boolean mo20318b(int i) {
        return C5130a.m20996b(i);
    }

    @Override // com.bytedance.ee.bear.document.AbstractC6158t
    /* renamed from: a */
    public boolean mo20316a(int i) {
        return C5130a.m20995a(i);
    }

    @Override // com.bytedance.ee.bear.document.AbstractC6158t
    /* renamed from: a */
    public boolean mo20317a(String str) {
        return C5130a.m20997b(str);
    }

    @Override // com.bytedance.ee.bear.document.AbstractC6158t
    /* renamed from: a */
    public AbstractC68307f<DocMetaInfo> mo20313a(String str, int i) {
        DocMetaInfoExecutor aVar = DocMetaInfoExecutor.f15945a;
        if (str == null) {
            str = "";
        }
        return aVar.mo22562a(str, i);
    }

    @Override // com.bytedance.ee.bear.document.AbstractC6158t
    /* renamed from: a */
    public AbstractC68307f<DocObjInfo> mo20314a(String str, int i, boolean z, boolean z2, boolean z3, String str2) {
        return DocObjInfoExecutor.m23011a(str, i, false, z, z2, z3, str2);
    }
}
