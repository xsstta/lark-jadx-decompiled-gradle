package com.bytedance.ee.bear.list.folder;

import androidx.p011a.p012a.p015c.AbstractC0193a;
import com.bytedance.ee.bear.document.AbstractC6158t;
import com.bytedance.ee.bear.list.cache.C8200i;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p702e.C13657b;
import com.bytedance.ee.util.p716r.C13721c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.list.folder.n */
public class C8371n implements AbstractC0193a<List<C8200i>, ArrayList<Document>> {
    /* renamed from: a */
    public ArrayList<Document> apply(List<C8200i> list) {
        ArrayList<Document> arrayList = new ArrayList<>();
        if (C13657b.m55421a(list)) {
            C13479a.m54764b("FolderDetailTransformFun", "TransformFun#apply()...input is empty");
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        for (C8200i iVar : list) {
            Document a = C8200i.m33449a(iVar);
            if (((AbstractC6158t) KoinJavaComponent.m268610a(AbstractC6158t.class)).mo20317a(iVar.mo32023a())) {
                arrayList3.add(a);
            } else if (a.mo32483t() == C8275a.f22370c.mo32555b()) {
                arrayList2.add(a);
            } else {
                arrayList4.add(a);
            }
        }
        try {
            Collections.sort(arrayList3, $$Lambda$n$EkeiQcYlvPIa7fn3uZlcGEhw8X4.INSTANCE);
        } catch (Exception e) {
            C13479a.m54761a("FolderDetailTransformFun", e);
        }
        arrayList.addAll(arrayList2);
        arrayList.addAll(arrayList3);
        arrayList.addAll(arrayList4);
        return arrayList;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ int m34650a(Document document, Document document2) {
        return (int) (C13721c.m55642a(document2.mo32479r(), 0L) - C13721c.m55642a(document.mo32479r(), 0L));
    }
}
