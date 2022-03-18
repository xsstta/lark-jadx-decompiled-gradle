package com.bytedance.ee.bear.list.folderselect;

import android.content.Context;
import android.view.View;
import com.bytedance.ee.bear.contract.C5084ad;
import com.bytedance.ee.bear.contract.C5234y;
import com.bytedance.ee.bear.contract.route.parcelable.DocOperateBean;
import com.bytedance.ee.bear.list.C8292f;
import com.bytedance.ee.bear.list.DocumentListInfo;
import com.bytedance.ee.bear.list.config.SpaceFeatureGatingV2;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.bear.list.dto.FolderVersion;
import com.bytedance.ee.bear.list.folderselect.AbstractC8403e;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p702e.C13657b;
import com.larksuite.framework.mvp.BasePresenter;
import com.larksuite.suite.R;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;

/* renamed from: com.bytedance.ee.bear.list.folderselect.j */
public class C8414j extends BasePresenter<AbstractC8403e.AbstractC8404a, AbstractC8403e.AbstractC8405b, AbstractC8403e.AbstractC8405b.AbstractC8406a> {

    /* renamed from: a */
    public final AbstractC8417b f22684a;

    /* renamed from: b */
    private final Context f22685b;

    /* renamed from: c */
    private final C10917c f22686c;

    /* renamed from: d */
    private final DocOperateBean f22687d;

    /* renamed from: e */
    private final boolean f22688e;

    /* renamed from: f */
    private Disposable f22689f;

    /* renamed from: com.bytedance.ee.bear.list.folderselect.j$b */
    public interface AbstractC8417b {
        /* renamed from: a */
        void mo32878a();

        /* renamed from: a */
        void mo32879a(int i, String str, String str2, boolean z);

        /* renamed from: a */
        void mo32880a(int i, String str, String str2, boolean z, int i2, boolean z2, int i3);
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.list.folderselect.j$a */
    public class C8416a implements AbstractC8403e.AbstractC8405b.AbstractC8406a {
        @Override // com.bytedance.ee.bear.list.folderselect.AbstractC8403e.AbstractC8405b.AbstractC8406a
        /* renamed from: b */
        public void mo32857b() {
            C8414j.this.mo32883a(false);
        }

        @Override // com.bytedance.ee.bear.list.folderselect.AbstractC8403e.AbstractC8405b.AbstractC8406a
        /* renamed from: c */
        public void mo32858c() {
            C8414j.this.mo32883a(true);
        }

        @Override // com.bytedance.ee.bear.list.folderselect.AbstractC8403e.AbstractC8405b.AbstractC8406a
        /* renamed from: a */
        public void mo32855a() {
            C13479a.m54764b("RootFolderSelectPresenter", "onSearchClick()...");
            if (C8414j.this.f22684a != null) {
                C8414j.this.f22684a.mo32878a();
            }
        }

        private C8416a() {
        }

        @Override // com.bytedance.ee.bear.list.folderselect.AbstractC8403e.AbstractC8405b.AbstractC8406a
        /* renamed from: a */
        public void mo32856a(View view, int i, Document document) {
            C8414j.this.mo32882a(document);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public AbstractC8403e.AbstractC8405b.AbstractC8406a createViewDelegate() {
        return new C8416a();
    }

    /* renamed from: c */
    private boolean m34850c() {
        return !C5084ad.m20847d().mo20038b().mo20041b();
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        C13479a.m54764b("RootFolderSelectPresenter", "create()...");
        m34849b();
    }

    /* renamed from: b */
    private void m34849b() {
        if (!this.f22688e) {
            C13479a.m54764b("RootFolderSelectPresenter", "loadData()...showRecentFolder = false");
        } else if (m34850c()) {
            C13479a.m54764b("RootFolderSelectPresenter", "loadData()...offline, hide recently used group");
        } else {
            Disposable disposable = this.f22689f;
            if (disposable != null && !disposable.isDisposed()) {
                this.f22689f.dispose();
            }
            this.f22689f = ((AbstractC8403e.AbstractC8404a) getModel()).mo32853a().mo238001b(new Consumer() {
                /* class com.bytedance.ee.bear.list.folderselect.$$Lambda$j$Qg5UnKpDos8MhD9dOkwfIlGR14 */

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    C8414j.this.m34847a((C8414j) ((DocumentListInfo) obj));
                }
            }, $$Lambda$j$AIheoZNIhtoHBzx5W7uRvl6y2mw.INSTANCE);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m34848a(Throwable th) throws Exception {
        C13479a.m54758a("RootFolderSelectPresenter", "loadRecentFolders()...error = " + th);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m34847a(DocumentListInfo documentListInfo) throws Exception {
        C13479a.m54764b("RootFolderSelectPresenter", "loadRecentFolders()...success, size = " + C13657b.m55424c(documentListInfo.getDocumentList()));
        if (C13657b.m55423b(documentListInfo.getDocumentList())) {
            C13479a.m54764b("RootFolderSelectPresenter", "loadRecentFolders()...show recent folders");
            ((AbstractC8403e.AbstractC8405b) getView()).mo32854a(documentListInfo.getDocumentList());
        }
    }

    /* renamed from: a */
    public void mo32882a(Document document) {
        C13479a.m54764b("RootFolderSelectPresenter", "openSubFolder()....");
        AbstractC8417b bVar = this.f22684a;
        if (bVar != null) {
            bVar.mo32880a(document.mo32483t(), document.mo32472o(), C8292f.m34193g(this.f22685b, document), FolderVersion.isShareFolder(document.an(), document.ap()), document.mo32398N(), document.mo32400P(), document.an());
            FolderSelectAnalytic.m34772a(C5234y.m21391b(), this.f22687d, "click_recent_folder");
        }
    }

    /* renamed from: a */
    public void mo32883a(boolean z) {
        String str;
        int i;
        C13479a.m54764b("RootFolderSelectPresenter", "openFolder()...isShare = " + z);
        if (z) {
            i = 6;
            if (SpaceFeatureGatingV2.m32622a()) {
                str = this.f22685b.getString(R.string.CreationMobile_ECM_ShareWithMe_Tab);
            } else {
                str = this.f22685b.getString(R.string.Doc_List_Shared_Space);
            }
        } else {
            i = 4;
            str = this.f22685b.getString(R.string.Doc_List_My_Space);
        }
        AbstractC8417b bVar = this.f22684a;
        if (bVar != null) {
            bVar.mo32879a(i, "", str, z);
        }
    }

    public C8414j(Context context, C10917c cVar, AbstractC8403e.AbstractC8405b bVar, AbstractC8403e.AbstractC8404a aVar, AbstractC8417b bVar2, DocOperateBean docOperateBean, boolean z) {
        super(aVar, bVar);
        this.f22685b = context;
        this.f22686c = cVar;
        this.f22684a = bVar2;
        this.f22687d = docOperateBean;
        this.f22688e = z;
    }
}
