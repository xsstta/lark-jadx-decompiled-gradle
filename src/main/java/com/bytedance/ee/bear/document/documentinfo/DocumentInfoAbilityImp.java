package com.bytedance.ee.bear.document.documentinfo;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\u0004H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/bytedance/ee/bear/document/documentinfo/DocumentInfoAbilityImp;", "Lcom/bytedance/ee/bear/document/documentinfo/DocumentInfoAbility;", "()V", "provider", "Lcom/bytedance/ee/bear/document/documentinfo/DocumentInfoProvider;", "getProvider", "()Lcom/bytedance/ee/bear/document/documentinfo/DocumentInfoProvider;", "setProvider", "(Lcom/bytedance/ee/bear/document/documentinfo/DocumentInfoProvider;)V", "getDocumentInfoProvider", "document-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.document.documentinfo.b */
public final class DocumentInfoAbilityImp implements DocumentInfoAbility {

    /* renamed from: a */
    private DocumentInfoProvider f16202a = new DocumentInfoProviderImpl();

    @Override // com.bytedance.ee.bear.document.documentinfo.DocumentInfoAbility
    /* renamed from: a */
    public DocumentInfoProvider mo23140a() {
        return this.f16202a;
    }
}
