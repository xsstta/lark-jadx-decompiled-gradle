package com.bytedance.ee.bear.list.folder;

import com.bytedance.ee.bear.list.DocumentListInfo;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.bear.list.dto.FolderVersion;
import com.bytedance.ee.bear.middleground_permission_export.model.p499a.AbstractC10157c;
import com.bytedance.ee.log.C13479a;
import io.reactivex.AbstractC68307f;
import io.reactivex.functions.Function;
import java.util.Iterator;
import org.koin.java.KoinJavaComponent;
import org.p3511d.AbstractC70020b;

/* renamed from: com.bytedance.ee.bear.list.folder.w */
public class C8384w implements Function<DocumentListInfo, AbstractC70020b<DocumentListInfo>> {
    /* renamed from: a */
    public AbstractC70020b<DocumentListInfo> apply(DocumentListInfo documentListInfo) {
        Document parent = documentListInfo.getParent();
        if (parent != null && !FolderVersion.isPersonalFolder(parent.an(), parent.ap())) {
            return ((AbstractC10157c) KoinJavaComponent.m268610a(AbstractC10157c.class)).mo36638a().mo36643a(parent.mo32399O(), new FolderVersion(parent.an(), parent.mo32397M(), parent.ap()), parent.mo32402R()).mo238020d(new Function() {
                /* class com.bytedance.ee.bear.list.folder.$$Lambda$w$1axN6HDqrvnEunWUMayViV877yc */

                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return C8384w.m34725a(DocumentListInfo.this, (Integer) obj);
                }
            }).mo238029f(new Function() {
                /* class com.bytedance.ee.bear.list.folder.$$Lambda$w$uQdRdWmY5yQNCe11JpNotHf0FM */

                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return C8384w.m34726a(DocumentListInfo.this, (Throwable) obj);
                }
            });
        }
        C13479a.m54764b("GetAndSetOldShareFolderPermissionFunction", "GetOldShareFolderPermissionFunction...no need, so return");
        return AbstractC68307f.m265083a(documentListInfo);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ DocumentListInfo m34725a(DocumentListInfo documentListInfo, Integer num) throws Exception {
        C13479a.m54764b("GetAndSetOldShareFolderPermissionFunction", "GetOldShareFolderPermissionFunction...success, permission = " + num);
        documentListInfo.getParent().mo32445h(num.intValue());
        Iterator<Document> it = documentListInfo.getDocumentList().iterator();
        while (it.hasNext()) {
            it.next().mo32445h(num.intValue());
        }
        return documentListInfo;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ DocumentListInfo m34726a(DocumentListInfo documentListInfo, Throwable th) throws Exception {
        C13479a.m54758a("GetAndSetOldShareFolderPermissionFunction", "GetOldShareFolderPermissionFunction...error = " + th);
        documentListInfo.getParent().mo32445h(1);
        Iterator<Document> it = documentListInfo.getDocumentList().iterator();
        while (it.hasNext()) {
            it.next().mo32445h(1);
        }
        return documentListInfo;
    }
}
