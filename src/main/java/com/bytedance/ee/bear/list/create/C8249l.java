package com.bytedance.ee.bear.list.create;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.aj;
import com.bytedance.ee.bear.AbstractC4967c;
import com.bytedance.ee.bear.abtest.service.AbstractC4156b;
import com.bytedance.ee.bear.appsetting.C4211a;
import com.bytedance.ee.bear.basesdk.services.C4511g;
import com.bytedance.ee.bear.contract.C5084ad;
import com.bytedance.ee.bear.contract.C5234y;
import com.bytedance.ee.bear.contract.ConnectionService;
import com.bytedance.ee.bear.contract.create.DocumentCreateInfo;
import com.bytedance.ee.bear.contract.offline.OfflineDoc;
import com.bytedance.ee.bear.contract.offline.route.parcelable.FolderRouteBean;
import com.bytedance.ee.bear.contract.p283g.C5174a;
import com.bytedance.ee.bear.domain.C6313i;
import com.bytedance.ee.bear.facade.common.C7718l;
import com.bytedance.ee.bear.facade.common.widget.Toast;
import com.bytedance.ee.bear.list.C8292f;
import com.bytedance.ee.bear.list.C8674q;
import com.bytedance.ee.bear.list.DocumentCreateHelper;
import com.bytedance.ee.bear.list.analysis.ListAnalysis;
import com.bytedance.ee.bear.list.create.C8242h;
import com.bytedance.ee.bear.list.create.SelectCreationMenuItem;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.route.AbstractC10740f;
import com.bytedance.ee.bear.route.RouteBean;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.templates.C11515d;
import com.bytedance.ee.bear.templates.TemplateV4CreateAbTestExperiment;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.bear.widgets.dialog.inputdialog.BearUDInputDialogBuilder;
import com.bytedance.ee.log.C13479a;
import com.larksuite.framework.mvp.BasePresenter;
import com.larksuite.suite.R;
import io.reactivex.disposables.C68289a;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.list.create.l */
public class C8249l extends BasePresenter<C8242h.AbstractC8243a, C8242h.AbstractC8244b, C8242h.AbstractC8244b.AbstractC8245a> {

    /* renamed from: a */
    static final /* synthetic */ boolean f22237a = true;

    /* renamed from: b */
    private final C7718l f22238b;

    /* renamed from: c */
    private final C10917c f22239c;

    /* renamed from: d */
    private C8254n f22240d;

    /* renamed from: e */
    private final String f22241e;

    /* renamed from: f */
    private final String f22242f;

    /* renamed from: g */
    private final String f22243g;

    /* renamed from: h */
    private final String f22244h;

    /* renamed from: i */
    private final String f22245i;

    /* renamed from: j */
    private boolean f22246j;

    /* renamed from: k */
    private final boolean f22247k;

    /* renamed from: l */
    private final boolean f22248l;

    /* renamed from: m */
    private final C68289a f22249m = new C68289a();

    /* renamed from: n */
    private boolean f22250n;

    /* renamed from: o */
    private boolean f22251o;

    /* renamed from: a */
    public void mo32348a(int i) {
        C13479a.m54764b("SelectCreationMenuPresenter", "createDocument()...menuType = " + i + ", mIsConnect = " + this.f22246j);
        int b = C8275a.f22369b.mo32555b();
        if (i == SelectCreationMenuItem.ItemType.ADD_DOC.getType() || i == SelectCreationMenuItem.ItemType.ADD_SHEET.getType() || i == SelectCreationMenuItem.ItemType.ADD_MINDNOTE.getType() || i == SelectCreationMenuItem.ItemType.ADD_BITABLE.getType() || i == SelectCreationMenuItem.ItemType.ADD_DOCX.getType()) {
            int b2 = m33869b(i);
            if (!C4211a.m17514a().mo16536a("spacekit.mobile.doc_create_optimization_enable", false) || !this.f22251o) {
                m33862a(i, b2, m33871c(i), this.f22250n);
                ListAnalysis.m32513a(this.f22241e, this.f22244h, b2, this.f22242f, "", "ccm_docs_page_view");
            } else {
                this.f22240d.setSelectedCreationType(i);
                ((AbstractC10740f) KoinJavaComponent.m268610a(AbstractC10740f.class)).mo17295b("/list/template4/activity").mo17308a("objType", b2).mo17314a("enterSource", "create_new").mo17314a(C11515d.f31005b, "create_new_template").mo17314a("openTemplateCenter", "system").mo17316a("key_folder_version", this.f22250n).mo17314a("MODULE", this.f22241e).mo17314a("ROOT_TOKEN", this.f22242f).mo17317a();
                C8228a.m33797b(C5234y.m21391b(), "docs_newcreate_click");
                ListAnalysis.m32513a(this.f22241e, this.f22244h, b2, this.f22242f, "", "ccm_template_systemcenter_view");
            }
            C8228a.m33796a(C5234y.m21391b(), C8275a.m34050a(b2), this.f22241e, this.f22247k, this.f22248l);
        } else if (i == SelectCreationMenuItem.ItemType.ADD_FOLDER.getType()) {
            b = C8275a.f22370c.mo32555b();
            m33875d(i);
        } else if (i == SelectCreationMenuItem.ItemType.UPLOAD_PHOTOS.getType()) {
            b = C8275a.f22375h.mo32555b();
            m33877f();
        } else if (i == SelectCreationMenuItem.ItemType.UPLOAD_FILE.getType()) {
            b = C8275a.f22375h.mo32555b();
            m33878g();
        }
        if (b != C8275a.f22369b.mo32555b()) {
            C8228a.m33791a(C5234y.m21391b(), C8275a.m34050a(b), this.f22241e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m33868a(boolean z, int i, Throwable th) throws Exception {
        C13479a.m54758a("SelectCreationMenuPresenter", "createOnlineDocument()...failed, throwable = " + th);
        C8241g.m33835a(this.f22238b.getContext(), new C8237e(this.f22239c, this.f22242f, this.f22241e, "docs_manage", z), C8275a.m34050a(i), null, this.f22239c, th);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m33867a(Throwable th) throws Exception {
        Toast.showFailureText(this.f22238b.getContext(), this.f22238b.getString(R.string.Doc_Facade_CreateFailed), 0);
        C13479a.m54758a("SelectCreationMenuPresenter", "create folder failed " + th);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C8242h.AbstractC8244b.AbstractC8245a createViewDelegate() {
        return new C8251a();
    }

    /* renamed from: c */
    private void m33872c() {
        this.f22249m.mo237937a(this.f22239c.mo41508c(AbstractC4156b.class).mo238001b(new Consumer() {
            /* class com.bytedance.ee.bear.list.create.$$Lambda$l$cOZtI7p19HhEqhtKfka22fsrKTQ */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C8249l.this.m33865a((C8249l) ((AbstractC4156b) obj));
            }
        }, $$Lambda$l$TDDIiWwzzdwzxtf85Ia_MESL8.INSTANCE));
    }

    /* renamed from: e */
    private void m33876e() {
        C5084ad.m20847d().mo20037a().mo5923a(this.f22238b, new AbstractC1178x() {
            /* class com.bytedance.ee.bear.list.create.$$Lambda$l$kd_ApAIJKMAZhGB6KcD_h7mCbhQ */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                C8249l.this.m33866a((C8249l) ((ConnectionService.NetworkState) obj));
            }
        });
    }

    /* renamed from: a */
    public void mo32347a() {
        C8228a.m33795a(C5234y.m21391b(), "cancel", "", this.f22241e, this.f22247k, this.f22248l);
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        m33874d();
        m33872c();
        m33876e();
        ListAnalysis.m32532c(this.f22241e, this.f22244h, this.f22242f);
    }

    /* renamed from: h */
    private Bundle m33879h() {
        Bundle bundle = new Bundle();
        bundle.putString("module", this.f22241e);
        bundle.putString("sub_module", this.f22244h);
        bundle.putString("src_module", this.f22245i);
        bundle.putString("parent_token", this.f22242f);
        return bundle;
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        super.destroy();
        this.f22240d.setSelectCreationMenuState(0);
        this.f22240d.setSelectCreationMenuState(null);
        if (!this.f22249m.isDisposed()) {
            this.f22249m.mo237935a();
        }
    }

    /* renamed from: d */
    private void m33874d() {
        boolean z;
        if (f22237a || this.f22238b.getActivity() != null) {
            this.f22240d = (C8254n) aj.m5366a(this.f22238b.getActivity()).mo6005a(C8254n.class);
            ConnectionService.NetworkState b = C5084ad.m20847d().mo20038b();
            if (b == null || !b.mo20041b()) {
                z = false;
            } else {
                z = f22237a;
            }
            this.f22246j = z;
            ((C8242h.AbstractC8243a) getModel()).mo32340a(this.f22246j);
            ((C8242h.AbstractC8244b) getView()).mo32342a(((C8242h.AbstractC8243a) getModel()).mo32339a(), ((C8242h.AbstractC8243a) getModel()).mo32341b());
            return;
        }
        throw new AssertionError();
    }

    /* renamed from: f */
    private void m33877f() {
        C13479a.m54764b("SelectCreationMenuPresenter", "uploadMedia()...");
        this.f22240d.setSelectedCreationType(C8275a.f22375h.mo32555b());
        ((AbstractC4967c) KoinJavaComponent.m268610a(AbstractC4967c.class)).mo19662b(this.f22242f, "explorer", m33879h(), -1);
        C8228a.m33795a(C5234y.m21391b(), "upload_image", "", this.f22241e, this.f22247k, this.f22248l);
        ListAnalysis.m32522a(this.f22241e, this.f22244h, "image_upload", "ccm_space_file_choose_view", "", this.f22242f, "", C8275a.f22369b.mo32555b());
        ListAnalysis.m32536e(this.f22241e, this.f22244h, this.f22242f);
    }

    /* renamed from: g */
    private void m33878g() {
        C13479a.m54764b("SelectCreationMenuPresenter", "uploadFile()...");
        this.f22240d.setSelectedCreationType(C8275a.f22375h.mo32555b());
        ((AbstractC4967c) KoinJavaComponent.m268610a(AbstractC4967c.class)).mo19654a(this.f22242f, "explorer", m33879h(), -1);
        C8228a.m33795a(C5234y.m21391b(), "upload_file", "", this.f22241e, this.f22247k, this.f22248l);
        ListAnalysis.m32522a(this.f22241e, this.f22244h, "file_upload", "ccm_space_file_choose_view", "", this.f22242f, "", C8275a.f22369b.mo32555b());
        ListAnalysis.m32536e(this.f22241e, this.f22244h, this.f22242f);
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.list.create.l$a */
    public class C8251a implements C8242h.AbstractC8244b.AbstractC8245a {
        private C8251a() {
        }

        @Override // com.bytedance.ee.bear.list.create.C8242h.AbstractC8244b.AbstractC8245a
        /* renamed from: a */
        public void mo32343a(int i) {
            C13479a.m54764b("SelectCreationMenuPresenter", "onItemClick()...menuType = " + i);
            C8249l.this.mo32348a(i);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m33870b(Throwable th) throws Exception {
        C13479a.m54758a("SelectCreationMenuPresenter", "createOfflineDocumentFlow()...failed, throwable = " + th);
    }

    /* renamed from: c */
    private String m33871c(int i) {
        if (i == SelectCreationMenuItem.ItemType.ADD_DOC.getType()) {
            return "action_doc_create";
        }
        if (i == SelectCreationMenuItem.ItemType.ADD_SHEET.getType()) {
            return "action_sheet_create";
        }
        if (i == SelectCreationMenuItem.ItemType.ADD_MINDNOTE.getType()) {
            return "action_mindnote_create";
        }
        if (i == SelectCreationMenuItem.ItemType.ADD_BITABLE.getType()) {
            return "action_bitable_create";
        }
        if (i == SelectCreationMenuItem.ItemType.ADD_DOCX.getType()) {
            return "action_docx_create";
        }
        return "";
    }

    /* renamed from: d */
    private void m33875d(int i) {
        C8292f.m34145a(this.f22238b.getActivity(), this.f22241e, this.f22244h, this.f22242f, new BearUDInputDialogBuilder.OnBtnClickListener(i) {
            /* class com.bytedance.ee.bear.list.create.$$Lambda$l$OtG2ABYw8I6cboKaVMe0FeT8wtY */
            public final /* synthetic */ int f$1;

            {
                this.f$1 = r2;
            }

            @Override // com.bytedance.ee.bear.widgets.dialog.inputdialog.BearUDInputDialogBuilder.OnBtnClickListener
            public final void onClick(String str) {
                C8249l.this.m33864a((C8249l) this.f$1, (int) str);
            }
        });
        ListAnalysis.m32522a(this.f22241e, this.f22244h, "folder", "ccm_space_folder_view", "", this.f22242f, "", C8275a.f22370c.mo32555b());
    }

    /* renamed from: b */
    private int m33869b(int i) {
        if (i == SelectCreationMenuItem.ItemType.ADD_DOC.getType()) {
            return C8275a.f22371d.mo32555b();
        }
        if (i == SelectCreationMenuItem.ItemType.ADD_SHEET.getType()) {
            return C8275a.f22372e.mo32555b();
        }
        if (i == SelectCreationMenuItem.ItemType.ADD_MINDNOTE.getType()) {
            return C8275a.f22374g.mo32555b();
        }
        if (i == SelectCreationMenuItem.ItemType.ADD_BITABLE.getType()) {
            return C8275a.f22373f.mo32555b();
        }
        if (i == SelectCreationMenuItem.ItemType.ADD_DOCX.getType()) {
            return C8275a.f22378k.mo32555b();
        }
        return -1;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m33865a(AbstractC4156b bVar) throws Exception {
        this.f22251o = "true".equalsIgnoreCase(bVar.getABTestStringValue(TemplateV4CreateAbTestExperiment.class.getName(), f22237a));
        C13479a.m54764b("SelectCreationMenuPresenter", "initABTest mCreateOpenTemplateCenter: " + this.f22251o);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m33866a(ConnectionService.NetworkState networkState) {
        boolean z;
        C13479a.m54764b("SelectCreationMenuPresenter", "observeNetwork()...state = " + networkState);
        if (networkState == null || !networkState.mo20041b()) {
            z = false;
        } else {
            z = f22237a;
        }
        this.f22246j = z;
        if (networkState != null) {
            ((C8242h.AbstractC8243a) getModel()).mo32340a(networkState.mo20041b());
            ((C8242h.AbstractC8244b) getView()).mo32342a(((C8242h.AbstractC8243a) getModel()).mo32339a(), ((C8242h.AbstractC8243a) getModel()).mo32341b());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m33863a(int i, DocumentCreateInfo documentCreateInfo) throws Exception {
        C13479a.m54764b("SelectCreationMenuPresenter", "create folder success");
        this.f22240d.setSelectedCreationType(i);
        FolderRouteBean folderRouteBean = new FolderRouteBean();
        folderRouteBean.mo20914d(documentCreateInfo.f14847f);
        ((AbstractC10740f) KoinJavaComponent.m268610a(AbstractC10740f.class)).mo17293a(documentCreateInfo.mo20275c(), folderRouteBean);
        C8674q.m36243f().mo33639a();
        C8228a.m33790a(C5234y.m21391b(), C8275a.m34050a(C8275a.f22370c.mo32555b()));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m33864a(int i, String str) {
        new DocumentCreateHelper(this.f22239c).mo31350a(C8275a.f22370c.mo32555b(), str, null, this.f22242f, this.f22241e, this.f22250n).mo238001b(new Consumer(i) {
            /* class com.bytedance.ee.bear.list.create.$$Lambda$l$7qvQ11Gn58xUESyRRNpj8_wpUvQ */
            public final /* synthetic */ int f$1;

            {
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C8249l.this.m33863a((C8249l) this.f$1, (int) ((DocumentCreateInfo) obj));
            }
        }, new Consumer() {
            /* class com.bytedance.ee.bear.list.create.$$Lambda$l$EkNz8g8u0tbh_DIr4uyf_qaWLns */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C8249l.this.m33867a((C8249l) ((Throwable) obj));
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m33860a(int i, int i2, DocumentCreateInfo documentCreateInfo) throws Exception {
        C13479a.m54758a("SelectCreationMenuPresenter", "createOnlineDocument()...success, type = " + i);
        this.f22240d.setSelectedCreationType(i2);
        C8241g.m33840a(this.f22238b.getContext(), C8292f.m34178c(this.f22238b.getContext(), i), "tab_create", this.f22239c, documentCreateInfo.mo20275c());
        C8228a.m33790a(C5234y.m21391b(), C8275a.m34050a(i));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m33861a(int i, int i2, OfflineDoc offlineDoc) throws Exception {
        C13479a.m54764b("SelectCreationMenuPresenter", "createOfflineDocumentFlow()...success, type = " + i);
        this.f22240d.setSelectedCreationType(i2);
        if (!TextUtils.isEmpty(offlineDoc.getFakeToken())) {
            String a = C6313i.m25327a().mo25382a(C8275a.m34050a(i), offlineDoc.getFakeToken(), "tab_create");
            RouteBean routeBean = new RouteBean();
            routeBean.mo40622h(a);
            routeBean.mo40615d(offlineDoc.getName());
            ((AbstractC10740f) KoinJavaComponent.m268610a(AbstractC10740f.class)).mo17293a(a, routeBean);
        }
        C8228a.m33790a(C5234y.m21391b(), C8275a.m34050a(i));
        C8228a.m33793a(C5234y.m21391b(), C8275a.m34050a(i), offlineDoc.getFakeToken(), C5174a.m21161a(C4511g.m18594d().mo17344E()), this.f22242f, this.f22241e);
    }

    /* renamed from: a */
    private void m33862a(int i, int i2, String str, boolean z) {
        Disposable disposable;
        if (CreateControl.m33799a(m33869b(i)) || !this.f22246j) {
            disposable = C8241g.m33831a(i2, this.f22242f, this.f22241e, z).mo237985a(C11678b.m48481e()).mo238001b(new Consumer(i2, i) {
                /* class com.bytedance.ee.bear.list.create.$$Lambda$l$WOm4q6iQpcb6OPjxWRAhP3GDPqA */
                public final /* synthetic */ int f$1;
                public final /* synthetic */ int f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    C8249l.this.m33861a((C8249l) this.f$1, this.f$2, (int) ((OfflineDoc) obj));
                }
            }, $$Lambda$l$zgPhiYV0XV41RUQ_mCoAJcncMbk.INSTANCE);
        } else {
            disposable = C8241g.m33832a(this.f22239c, i2, this.f22242f, this.f22241e, z).mo237985a(C11678b.m48481e()).mo238001b(new Consumer(i2, i) {
                /* class com.bytedance.ee.bear.list.create.$$Lambda$l$EhRr1Yr5R195XnojiQqX_PIGw */
                public final /* synthetic */ int f$1;
                public final /* synthetic */ int f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    C8249l.this.m33860a((C8249l) this.f$1, this.f$2, (int) ((DocumentCreateInfo) obj));
                }
            }, new Consumer(z, i2) {
                /* class com.bytedance.ee.bear.list.create.$$Lambda$l$OmqxUr4qbQF1CM7kI3e3Jxrq3Fg */
                public final /* synthetic */ boolean f$1;
                public final /* synthetic */ int f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    C8249l.this.m33868a((C8249l) this.f$1, (boolean) this.f$2, (int) ((Throwable) obj));
                }
            });
        }
        this.f22249m.mo237937a(disposable);
    }

    C8249l(C7718l lVar, C8242h.AbstractC8244b bVar, C8242h.AbstractC8243a aVar, C10917c cVar, String str, String str2, String str3, boolean z, boolean z2, String str4, String str5, boolean z3) {
        super(aVar, bVar);
        this.f22238b = lVar;
        this.f22239c = cVar;
        this.f22241e = str;
        this.f22242f = str2;
        this.f22243g = str3;
        this.f22247k = z;
        this.f22248l = z2;
        this.f22244h = str4;
        this.f22245i = str5;
        this.f22250n = z3;
    }
}
