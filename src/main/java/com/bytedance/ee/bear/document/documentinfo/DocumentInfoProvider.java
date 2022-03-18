package com.bytedance.ee.bear.document.documentinfo;

import androidx.lifecycle.C1177w;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0003H&J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0004H&J\u0010\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0004H&JD\u0010\u0012\u001a\u00020\u000f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0014\u001a\u00020\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0017H&R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0006R\u0018\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u0006¨\u0006\u001a"}, d2 = {"Lcom/bytedance/ee/bear/document/documentinfo/DocumentInfoProvider;", "", "docName", "Landroidx/lifecycle/MutableLiveData;", "", "getDocName", "()Landroidx/lifecycle/MutableLiveData;", "docPermission", "Lcom/bytedance/ee/bear/middleground_permission_export/model/doc/DocPermission;", "getDocPermission", "documentInfoDta", "Lcom/bytedance/ee/bear/document/documentinfo/DocumentInfo;", "getDocumentInfoDta", "liveDocumentInfoData", "registerPermissionChangeListener", "", "objToken", "requestDocPermission", "requestDocumentInfo", "url", "originUrl", "spaceId", "isFromVc", "", "isWiki", "checkWiki", "document-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.document.documentinfo.d */
public interface DocumentInfoProvider {
    /* renamed from: a */
    C1177w<String> mo23144a();

    /* renamed from: a */
    void mo23145a(String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3);

    /* renamed from: b */
    C1177w<DocumentInfo> mo23146b();
}
