package com.bytedance.ee.bear.document.titlebar.badge;

import com.bytedance.ee.bear.document.DocumentMetadata;
import com.bytedance.ee.bear.document.titlebar.badge.ITitleBarBadgeStrategy;
import com.bytedance.ee.bear.guide.p396b.C7811a;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.log.C13479a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\fH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\r"}, d2 = {"Lcom/bytedance/ee/bear/document/titlebar/badge/DocsAppMoreBadgeStrategy;", "Lcom/bytedance/ee/bear/document/titlebar/badge/ITitleBarBadgeStrategy;", "metadata", "Lcom/bytedance/ee/bear/document/DocumentMetadata;", "(Lcom/bytedance/ee/bear/document/DocumentMetadata;)V", "getMetadata", "()Lcom/bytedance/ee/bear/document/DocumentMetadata;", "getId", "", "isNew", "", "markNotNew", "", "document-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.document.titlebar.a.a */
public final class DocsAppMoreBadgeStrategy implements ITitleBarBadgeStrategy {

    /* renamed from: a */
    private final DocumentMetadata f17262a;

    @Override // com.bytedance.ee.bear.document.titlebar.badge.ITitleBarBadgeStrategy
    /* renamed from: a */
    public String mo25029a() {
        return "mobile_doc_share_callout";
    }

    @Override // com.bytedance.ee.bear.document.titlebar.badge.ITitleBarBadgeStrategy
    /* renamed from: c */
    public void mo25031c() {
    }

    @Override // com.bytedance.ee.bear.document.titlebar.badge.ITitleBarBadgeStrategy
    /* renamed from: d */
    public boolean mo25032d() {
        return ITitleBarBadgeStrategy.C6197a.m24996a(this);
    }

    @Override // com.bytedance.ee.bear.document.titlebar.badge.ITitleBarBadgeStrategy
    /* renamed from: b */
    public boolean mo25030b() {
        boolean a = C7811a.m31302a(this.f17262a.isOwner());
        C8275a aVar = C8275a.f22372e;
        Intrinsics.checkExpressionValueIsNotNull(aVar, "DocumentType.SHEET");
        boolean areEqual = Intrinsics.areEqual(aVar.mo32553a(), this.f17262a.getDocumentType());
        C13479a.m54764b("DocsAppMoreBadgeStrategy", "shouldShowBadge=" + a + ", isSheet=" + areEqual);
        if (!a || !areEqual) {
            return false;
        }
        return true;
    }

    public DocsAppMoreBadgeStrategy(DocumentMetadata qVar) {
        Intrinsics.checkParameterIsNotNull(qVar, "metadata");
        this.f17262a = qVar;
    }
}
