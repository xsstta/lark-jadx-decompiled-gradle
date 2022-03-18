package com.bytedance.ee.bear.list.folder;

import com.alibaba.fastjson.JSON;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.list.DocumentListInfo;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.bear.list.dto.FolderVersion;
import com.bytedance.ee.bear.list.folder.GetDocumentExternalPermParam;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p702e.C13657b;
import io.reactivex.AbstractC68307f;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.p3511d.AbstractC70020b;

/* renamed from: com.bytedance.ee.bear.list.folder.v */
public class C8383v implements Function<DocumentListInfo, AbstractC70020b<DocumentListInfo>> {

    /* renamed from: a */
    private final NetService f22622a;

    C8383v(NetService netService) {
        this.f22622a = netService;
    }

    /* renamed from: a */
    private NetService.C5076e m34721a(List<Document> list) {
        NetService.C5077f fVar = new NetService.C5077f("/space/api/explorer/obj/show_external_hint/");
        fVar.mo20143a(1);
        GetDocumentExternalPermParam getDocumentExternalPermParam = new GetDocumentExternalPermParam();
        getDocumentExternalPermParam.setObjs(m34723b(list));
        fVar.mo20153c(JSON.toJSONString(getDocumentExternalPermParam));
        return fVar;
    }

    /* renamed from: b */
    private List<GetDocumentExternalPermParam.ObjsBean> m34723b(List<Document> list) {
        ArrayList arrayList = new ArrayList();
        for (Document document : list) {
            if (document.mo32483t() != C8275a.f22370c.mo32555b()) {
                GetDocumentExternalPermParam.ObjsBean objsBean = new GetDocumentExternalPermParam.ObjsBean();
                objsBean.setType(document.mo32483t());
                objsBean.setToken(document.mo32472o());
                arrayList.add(objsBean);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public AbstractC70020b<DocumentListInfo> apply(DocumentListInfo documentListInfo) {
        if (C13657b.m55421a(documentListInfo.getDocumentList())) {
            C13479a.m54764b("GetAndSetDocumentExternalFunction", "GetAndSetDocumentExternalFunction()...list is empty");
            return AbstractC68307f.m265083a(documentListInfo);
        }
        Document parent = documentListInfo.getParent();
        if (parent != null && !FolderVersion.isPersonalFolder(parent.an(), parent.ap())) {
            return this.f22622a.mo20117a(new C8385x()).mo20141a(m34721a(documentListInfo.getDocumentList())).mo238020d(new Function() {
                /* class com.bytedance.ee.bear.list.folder.$$Lambda$v$UZPIULm1ePaiactle5M4f6djpkk */

                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return C8383v.m34722a(DocumentListInfo.this, (GetDocumentExternalPermResult) obj);
                }
            }).mo238010b(documentListInfo);
        }
        C13479a.m54764b("GetAndSetDocumentExternalFunction", "GetAndSetDocumentExternalFunction()...not old share folder or fg is close");
        return AbstractC68307f.m265083a(documentListInfo);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ DocumentListInfo m34722a(DocumentListInfo documentListInfo, GetDocumentExternalPermResult getDocumentExternalPermResult) throws Exception {
        boolean z;
        HashMap<String, Boolean> permMap = getDocumentExternalPermResult.getPermMap();
        Iterator<Document> it = documentListInfo.getDocumentList().iterator();
        while (it.hasNext()) {
            Document next = it.next();
            Boolean bool = permMap.get(next.mo32472o());
            if (bool == null || !bool.booleanValue() || !documentListInfo.getParent().mo32400P()) {
                z = false;
            } else {
                z = true;
            }
            next.mo32463l(z);
        }
        return documentListInfo;
    }
}
