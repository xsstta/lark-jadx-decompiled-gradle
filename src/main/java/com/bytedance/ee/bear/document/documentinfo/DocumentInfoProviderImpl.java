package com.bytedance.ee.bear.document.documentinfo;

import android.text.TextUtils;
import androidx.lifecycle.C1177w;
import com.bytedance.ee.bear.contract.doc.C5130a;
import com.bytedance.ee.bear.domain.C6313i;
import com.bytedance.ee.bear.middleground_permission_export.model.doc.DocPermission;
import com.bytedance.ee.bear.middleground_permission_export.model.p499a.AbstractC10157c;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p700c.C13598b;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u0000 !2\u00020\u0001:\u0001!B\u0005¢\u0006\u0002\u0010\u0002J\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004J\u000e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0004H\u0016J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0005H\u0016J\u0010\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0005H\u0016JD\u0010\u0016\u001a\u00020\u00132\b\u0010\u0017\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0018\u001a\u00020\u00052\b\u0010\u0019\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001bH\u0017J\u000e\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u0005J\u000e\u0010\u001f\u001a\u00020\u00132\u0006\u0010 \u001a\u00020\u000eR\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0007R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0007¨\u0006\""}, d2 = {"Lcom/bytedance/ee/bear/document/documentinfo/DocumentInfoProviderImpl;", "Lcom/bytedance/ee/bear/document/documentinfo/DocumentInfoProvider;", "()V", "docName", "Landroidx/lifecycle/MutableLiveData;", "", "getDocName", "()Landroidx/lifecycle/MutableLiveData;", "docPermission", "Lcom/bytedance/ee/bear/middleground_permission_export/model/doc/DocPermission;", "getDocPermission", "documentInfoDisposable", "Lio/reactivex/disposables/Disposable;", "documentInfoDta", "Lcom/bytedance/ee/bear/document/documentinfo/DocumentInfo;", "getDocumentInfoDta", "liveDocName", "liveDocumentInfoData", "registerPermissionChangeListener", "", "objToken", "requestDocPermission", "requestDocumentInfo", "url", "originUrl", "spaceId", "isFromVc", "", "isWiki", "checkWiki", "setDocName", "setDocumentInfoDta", "documentInfo", "Companion", "document-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.document.documentinfo.e */
public final class DocumentInfoProviderImpl implements DocumentInfoProvider {

    /* renamed from: a */
    public static final Companion f16208a = new Companion(null);

    /* renamed from: b */
    private final C1177w<DocumentInfo> f16209b = new C1177w<>();

    /* renamed from: c */
    private final C1177w<DocPermission> f16210c = new C1177w<>();

    /* renamed from: d */
    private final C1177w<String> f16211d = new C1177w<>();

    /* renamed from: e */
    private Disposable f16212e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/bytedance/ee/bear/document/documentinfo/DocumentInfoProviderImpl$Companion;", "", "()V", "DOCUMENT_PERMISSION_TAG_PREFIX", "", "TAG", "document-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.document.documentinfo.e$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.bytedance.ee.bear.document.documentinfo.DocumentInfoProvider
    /* renamed from: a */
    public C1177w<String> mo23144a() {
        return this.f16211d;
    }

    /* renamed from: c */
    public C1177w<DocumentInfo> mo23149c() {
        return this.f16209b;
    }

    @Override // com.bytedance.ee.bear.document.documentinfo.DocumentInfoProvider
    /* renamed from: b */
    public C1177w<DocumentInfo> mo23146b() {
        return mo23149c();
    }

    /* renamed from: d */
    public final C1177w<String> mo23150d() {
        return mo23144a();
    }

    /* renamed from: a */
    public final void mo23147a(DocumentInfo documentInfo) {
        Intrinsics.checkParameterIsNotNull(documentInfo, "documentInfo");
        mo23146b().mo5929b(documentInfo);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "throwable", "", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.document.documentinfo.e$c */
    static final class C5749c<T> implements Consumer<Throwable> {

        /* renamed from: a */
        public static final C5749c f16219a = new C5749c();

        C5749c() {
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            Intrinsics.checkParameterIsNotNull(th, "throwable");
            C13479a.m54758a("DocumentInfoProviderImpl", "fetchDocumentInfo: onFailure" + th);
        }
    }

    /* renamed from: a */
    public final void mo23148a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "docName");
        mo23150d().mo5929b(str);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "documentInfo", "Lcom/bytedance/ee/bear/document/documentinfo/DocumentInfo;", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.document.documentinfo.e$b */
    static final class C5748b<T> implements Consumer<DocumentInfo> {

        /* renamed from: a */
        final /* synthetic */ DocumentInfoProviderImpl f16213a;

        /* renamed from: b */
        final /* synthetic */ String f16214b;

        /* renamed from: c */
        final /* synthetic */ String f16215c;

        /* renamed from: d */
        final /* synthetic */ int f16216d;

        /* renamed from: e */
        final /* synthetic */ boolean f16217e;

        /* renamed from: f */
        final /* synthetic */ boolean f16218f;

        C5748b(DocumentInfoProviderImpl eVar, String str, String str2, int i, boolean z, boolean z2) {
            this.f16213a = eVar;
            this.f16214b = str;
            this.f16215c = str2;
            this.f16216d = i;
            this.f16217e = z;
            this.f16218f = z2;
        }

        /* renamed from: a */
        public final void accept(DocumentInfo documentInfo) {
            Intrinsics.checkParameterIsNotNull(documentInfo, "documentInfo");
            C13479a.m54764b("DocumentInfoProviderImpl", "fetchDocumentInfo: onSuccess");
            C13479a.m54772d("DocumentInfoProviderImpl", "space id = " + this.f16214b);
            if (!TextUtils.isEmpty(this.f16214b)) {
                documentInfo.setSpaceId(String.valueOf(this.f16214b));
            }
            this.f16213a.mo23148a(documentInfo.getTitle());
            this.f16213a.mo23147a(documentInfo);
            ((AbstractC10157c) KoinJavaComponent.m268613a(AbstractC10157c.class, null, null, 6, null)).mo36641d().mo36654a(this.f16215c, this.f16216d, "", this.f16217e, documentInfo.getDocPermission().mo38591a().getReportJson(), documentInfo.getDocPermission().mo38594b().getReportJson(), this.f16218f, "", "");
        }
    }

    @Override // com.bytedance.ee.bear.document.documentinfo.DocumentInfoProvider
    /* renamed from: a */
    public void mo23145a(String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3) {
        Intrinsics.checkParameterIsNotNull(str2, "originUrl");
        Intrinsics.checkParameterIsNotNull(str4, "objToken");
        if (TextUtils.isEmpty(str)) {
            C13479a.m54758a("DocumentInfoProviderImpl", "requestDocPermission : url is empty");
            return;
        }
        Disposable disposable = this.f16212e;
        if (disposable != null) {
            if (disposable == null) {
                Intrinsics.throwNpe();
            }
            if (!disposable.isDisposed()) {
                Disposable disposable2 = this.f16212e;
                if (disposable2 == null) {
                    Intrinsics.throwNpe();
                }
                disposable2.dispose();
            }
        }
        if (C6313i.m25327a().mo25392c(str)) {
            int c = C5130a.m20998c(str);
            if (C5130a.m20997b(str4)) {
                C13479a.m54758a("DocumentInfoProviderImpl", "requestDocPermission : url illegal , url = " + C13598b.m55197d(str));
                return;
            }
            C13479a.m54772d("DocumentInfoProviderImpl", "requestDocPermission()... type = " + c + "，objToken = " + C13598b.m55197d(str4));
            if (str == null) {
                Intrinsics.throwNpe();
            }
            this.f16212e = DocumentInfoFetcher.m23225a(str4, c, str, str2, z3).mo237985a(C11678b.m48481e()).mo238001b(new C5748b(this, str3, str4, c, z2, z), C5749c.f16219a);
            return;
        }
        C13479a.m54758a("DocumentInfoProviderImpl", "requestDocPermission : url illegal , url = " + C13598b.m55197d(str));
    }
}
