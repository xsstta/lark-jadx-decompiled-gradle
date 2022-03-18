package com.bytedance.ee.bear.document.documentinfo;

import com.bytedance.ee.bear.DocMetaInfo;
import com.bytedance.ee.bear.DocObjInfo;
import com.bytedance.ee.bear.document.docmetainfo.DocMetaInfoExecutor;
import com.bytedance.ee.bear.document.docsobjinfo.DocObjInfoExecutor;
import com.bytedance.ee.bear.domain.BearUrl;
import com.bytedance.ee.bear.domain.C6313i;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.list.dto.DocVersion;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.bear.list.p424c.AbstractC8149a;
import com.bytedance.ee.bear.middleground_permission_export.model.doc.DocPermission;
import com.bytedance.ee.bear.middleground_permission_export.model.p499a.AbstractC10157c;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;
import io.reactivex.AbstractC68307f;
import io.reactivex.functions.AbstractC68314f;
import io.reactivex.functions.BiFunction;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J:\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0007J&\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0004H\u0003R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/bytedance/ee/bear/document/documentinfo/DocumentInfoFetcher;", "", "()V", "TAG", "", "fetchDocumentInfo", "Lio/reactivex/Flowable;", "Lcom/bytedance/ee/bear/document/documentinfo/DocumentInfo;", "objToken", ShareHitPoint.f121869d, "", "url", "originUrl", "checkWiki", "", "fetchDocumentInfoCC", "document-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.document.documentinfo.c */
public final class DocumentInfoFetcher {

    /* renamed from: a */
    public static final DocumentInfoFetcher f16203a = new DocumentInfoFetcher();

    private DocumentInfoFetcher() {
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/document/documentinfo/DocumentInfo;", "document", "objInfo", "Lcom/bytedance/ee/bear/DocObjInfo;", "apply"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.document.documentinfo.c$a */
    public static final class C5746a<T1, T2, R> implements BiFunction<DocumentInfo, DocObjInfo, DocumentInfo> {

        /* renamed from: a */
        public static final C5746a f16204a = new C5746a();

        C5746a() {
        }

        /* renamed from: a */
        public final DocumentInfo apply(DocumentInfo documentInfo, DocObjInfo docObjInfo) {
            boolean z;
            Intrinsics.checkParameterIsNotNull(documentInfo, "document");
            Intrinsics.checkParameterIsNotNull(docObjInfo, "objInfo");
            documentInfo.setDocObjInfo(docObjInfo);
            DocMetaInfo docMetaInfo = documentInfo.getDocMetaInfo();
            boolean z2 = false;
            if (documentInfo.getDocMetaInfo().isPined() || docObjInfo.isPined()) {
                z = true;
            } else {
                z = false;
            }
            docMetaInfo.setPined(z);
            DocMetaInfo docMetaInfo2 = documentInfo.getDocMetaInfo();
            if (documentInfo.getDocMetaInfo().isStared() || docObjInfo.isStared()) {
                z2 = true;
            }
            docMetaInfo2.setStared(z2);
            return documentInfo;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/document/documentinfo/DocumentInfo;", "meta", "Lcom/bytedance/ee/bear/DocMetaInfo;", "perm", "Lcom/bytedance/ee/bear/middleground_permission_export/model/doc/DocPermission;", "ownerType", "Lcom/bytedance/ee/bear/list/dto/DocVersion;", "apply"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.document.documentinfo.c$b */
    public static final class C5747b<T1, T2, T3, R> implements AbstractC68314f<DocMetaInfo, DocPermission, DocVersion, DocumentInfo> {

        /* renamed from: a */
        final /* synthetic */ String f16205a;

        /* renamed from: b */
        final /* synthetic */ String f16206b;

        /* renamed from: c */
        final /* synthetic */ int f16207c;

        C5747b(String str, String str2, int i) {
            this.f16205a = str;
            this.f16206b = str2;
            this.f16207c = i;
        }

        /* renamed from: a */
        public final DocumentInfo apply(DocMetaInfo docMetaInfo, DocPermission docPermission, DocVersion docVersion) {
            Intrinsics.checkParameterIsNotNull(docMetaInfo, "meta");
            Intrinsics.checkParameterIsNotNull(docPermission, "perm");
            Intrinsics.checkParameterIsNotNull(docVersion, "ownerType");
            return new DocumentInfo(docMetaInfo, docPermission, docVersion, this.f16205a, this.f16206b, this.f16207c, null, 64, null);
        }
    }

    @JvmStatic
    /* renamed from: a */
    private static final AbstractC68307f<DocumentInfo> m23224a(String str, int i, String str2) {
        AbstractC68307f<DocumentInfo> a = AbstractC68307f.m265094a(DocMetaInfoExecutor.f15945a.mo22562a(str, i), ((AbstractC10157c) KoinJavaComponent.m268613a(AbstractC10157c.class, null, null, 6, null)).mo36638a().mo36642a(str, i), ((AbstractC8149a) KoinJavaComponent.m268613a(AbstractC8149a.class, null, null, 6, null)).mo31488a(str, i), new C5747b(str2, str, i));
        Intrinsics.checkExpressionValueIsNotNull(a, "Flowable.zip(metaFlowabl…bjToken, type)\n        })");
        return a;
    }

    @JvmStatic
    /* renamed from: a */
    public static final AbstractC68307f<DocumentInfo> m23225a(String str, int i, String str2, String str3, boolean z) {
        String str4;
        int i2;
        Intrinsics.checkParameterIsNotNull(str, "objToken");
        Intrinsics.checkParameterIsNotNull(str2, "url");
        Intrinsics.checkParameterIsNotNull(str3, "originUrl");
        BearUrl g = C6313i.m25327a().mo25399g(str3);
        Intrinsics.checkExpressionValueIsNotNull(g, "SpaceKitUrlHelper.getIns…nce().parseUrl(originUrl)");
        if (Document.m33924M(g.f17447b)) {
            str4 = str;
        } else {
            str4 = g.f17447b;
        }
        if (Document.m33924M(g.f17447b)) {
            i2 = i;
        } else {
            C8275a d = C8275a.m34055d(g.f17446a);
            Intrinsics.checkExpressionValueIsNotNull(d, "DocumentType.getDocumentType(originBearUrl.type)");
            i2 = d.mo32555b();
        }
        AbstractC68307f<DocumentInfo> a = m23224a(str, i, str2);
        Intrinsics.checkExpressionValueIsNotNull(str4, "originToken");
        AbstractC68307f<DocumentInfo> a2 = AbstractC68307f.m265092a(a, DocObjInfoExecutor.m23012a(str4, i2, z, false, false, false, null, SmEvents.EVENT_NW, null), C5746a.f16204a);
        Intrinsics.checkExpressionValueIsNotNull(a2, "Flowable.zip(documentFlo…      document\n        })");
        return a2;
    }
}
