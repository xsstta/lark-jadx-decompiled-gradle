package com.bytedance.ee.bear.list.folder;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.text.TextUtils;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.ee.bear.NodeType;
import com.bytedance.ee.bear.contract.BinderIDeleteDocCallback;
import com.bytedance.ee.bear.contract.ConnectionService;
import com.bytedance.ee.bear.contract.am;
import com.bytedance.ee.bear.contract.net.C5203d;
import com.bytedance.ee.bear.document.AbstractC6158t;
import com.bytedance.ee.bear.facade.common.C7718l;
import com.bytedance.ee.bear.facade.common.widget.Toast;
import com.bytedance.ee.bear.list.AbstractC8651p;
import com.bytedance.ee.bear.list.C8144c;
import com.bytedance.ee.bear.list.C8292f;
import com.bytedance.ee.bear.list.DocumentListInfo;
import com.bytedance.ee.bear.list.analysis.ListAnalysis;
import com.bytedance.ee.bear.list.cache.C8153a;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.bear.list.dto.FolderVersion;
import com.bytedance.ee.bear.list.folder.AbstractC8322ag;
import com.bytedance.ee.bear.list.folder.DialogC8333b;
import com.bytedance.ee.bear.list.folder.SubFolderPresenter;
import com.bytedance.ee.bear.list.folder.complaint.ComplaintState;
import com.bytedance.ee.bear.list.folder.complaint.FolderForbiddenView;
import com.bytedance.ee.bear.list.folder.complaint.GetComplaintResult;
import com.bytedance.ee.bear.list.list.BaseListPresenter;
import com.bytedance.ee.bear.list.route.C8706f;
import com.bytedance.ee.bear.middleground_permission_export.model.folder.ShareFolderUserPermission;
import com.bytedance.ee.bear.middleground_permission_export.model.p499a.AbstractC10157c;
import com.bytedance.ee.bear.middleground_permission_export.model.p499a.AbstractC10159e;
import com.bytedance.ee.bear.p522q.C10539a;
import com.bytedance.ee.bear.route.AbstractC10740f;
import com.bytedance.ee.bear.route.RouteBean;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.bear.watermark.interfaces.IWatermarkManager;
import com.bytedance.ee.bear.widgets.dialog.checkboxdialog.BearUDCheckBoxDialogBuilder;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.common.C13608f;
import com.bytedance.ee.util.p702e.C13657b;
import com.bytedance.ee.util.p718t.C13748k;
import com.larksuite.component.universe_design.dialog.UDBaseDialogBuilder;
import com.larksuite.component.universe_design.dialog.UDDialog;
import com.larksuite.suite.R;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.lang.ref.WeakReference;
import org.koin.java.KoinJavaComponent;

public class SubFolderPresenter extends BaseListPresenter<AbstractC8321af, AbstractC8322ag, AbstractC8322ag.AbstractC8323a> implements AbstractC8322ag.AbstractC8323a, AbstractC8651p.AbstractC8653b, AbstractC8651p.AbstractC8654c, AbstractC8651p.AbstractC8662k {

    /* renamed from: a */
    public final String f22468a;

    /* renamed from: b */
    public final AbstractC8315aa f22469b;

    /* renamed from: n */
    private final int f22470n;

    /* renamed from: o */
    private final String f22471o;

    /* renamed from: p */
    private Document f22472p;

    /* renamed from: q */
    private ShareFolderUserPermission f22473q;

    /* renamed from: r */
    private boolean f22474r;

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.BaseListPresenter
    /* renamed from: c */
    public String mo32596c() {
        return "SubFolderPresenter";
    }

    @Override // com.bytedance.ee.bear.list.list.AbstractC8544i.AbstractC8545a
    /* renamed from: a */
    public void mo32595a(Document document, int i, boolean z) {
        String c = mo32596c();
        C13479a.m54764b(c, "onItemClick()...doc = " + document.toString());
        C8292f.m34139a(this.f23069e.getActivity(), this.f23068d, document, mo33312n(), m34344f(document), mo32593a(), i, z, this.f22470n + 1);
        ListAnalysis.m32521a("ccm_space_folder_click", mo32593a(), "", "", this.f22468a, document.mo32472o(), document.mo32483t(), document.mo32377C(), FolderVersion.isShareFolder(document.an(), document.ap()), TextUtils.isEmpty(this.f22468a) ^ true, this.f22470n);
    }

    @Override // com.bytedance.ee.bear.list.list.BaseListPresenter, com.bytedance.ee.bear.list.list.AbstractC8542h.AbstractC8543a
    /* renamed from: a */
    public void mo32655a(Throwable th) {
        super.mo32655a(th);
        if (C5203d.m21235a(th, 4)) {
            this.f23075k.mo237937a(((AbstractC10157c) KoinJavaComponent.m268610a(AbstractC10157c.class)).mo36638a().mo36653c(this.f22468a, FolderVersion.getFolderVersionV2(), false).mo238001b(new Consumer() {
                /* class com.bytedance.ee.bear.list.folder.$$Lambda$SubFolderPresenter$6tzlEwSUQMT8pFxsEzvrBNk3Uo */

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    SubFolderPresenter.this.m34337a((SubFolderPresenter) ((ShareFolderUserPermission) obj));
                }
            }, new Consumer() {
                /* class com.bytedance.ee.bear.list.folder.$$Lambda$SubFolderPresenter$_GWc6QLYq87OPbmx_XPctnomnoE */

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    SubFolderPresenter.this.m34343e((SubFolderPresenter) ((Throwable) obj));
                }
            }));
            m34348u();
            ((AbstractC8322ag) getView()).mo33354z();
        } else if (C5203d.m21235a(th, 7)) {
            Toast.showFailureText(this.f23067c, this.f23067c.getString(R.string.Doc_List_FolderDeleted), 0);
            m34348u();
            AbstractC8315aa aaVar = this.f22469b;
            if (aaVar != null) {
                aaVar.mo32707a();
            }
        }
    }

    @Override // com.bytedance.ee.bear.list.AbstractC8651p.AbstractC8654c
    /* renamed from: a */
    public void mo32653a(String str, String str2, String str3) {
        C13479a.m54764b(mo32596c(), "onMakeCopy()...");
        mo33313o();
    }

    @Override // com.bytedance.ee.bear.list.AbstractC8651p.AbstractC8653b
    /* renamed from: a */
    public void mo32652a(String str, String str2) {
        C13479a.m54764b(mo32596c(), "onListItemMoved()...");
        ((AbstractC8321af) getModel()).mo32717a(str);
        if (TextUtils.equals(this.f22468a, str)) {
            this.f22469b.mo32707a();
        } else if (TextUtils.equals(this.f22468a, str2)) {
            mo33313o();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.BaseListPresenter
    /* renamed from: a */
    public void mo32654a(String str, boolean z) {
        super.mo32654a(str, z);
        Document document = this.f22472p;
        if (document != null && TextUtils.equals(document.mo32472o(), str)) {
            this.f22472p.mo32438e(z);
            ((AbstractC8322ag) getView()).mo32723a(this.f22472p);
        }
    }

    @Override // com.bytedance.ee.bear.list.folder.complaint.FolderForbiddenView.AbstractC8342a
    /* renamed from: e */
    public void mo32661e() {
        C8292f.m34148a(this.f22472p, this.f23069e);
    }

    @Override // com.bytedance.ee.bear.list.folder.complaint.FolderForbiddenView.AbstractC8342a
    /* renamed from: f */
    public void mo32662f() {
        C8292f.m34150a((AbstractC10740f) KoinJavaComponent.m268610a(AbstractC10740f.class));
    }

    /* access modifiers changed from: private */
    public static class DeleteDocCallback extends BinderIDeleteDocCallback.Stub {
        private final WeakReference<SubFolderPresenter> presenterRef;

        @Override // com.bytedance.ee.bear.contract.am.AbstractC5108a
        public void onPreExecute() {
        }

        @Override // com.bytedance.ee.bear.contract.am.AbstractC5108a
        public void onPostExecuteSuccess() {
            C13479a.m54764b("SubFolderPresenter", "DeleteDocCallback#onPostExecuteSuccess()...");
            if (this.presenterRef.get() == null) {
                C13479a.m54764b("SubFolderPresenter", "DeleteDocCallback#onPostExecuteSuccess()...presenterRef = null");
            } else {
                C13748k.m55732a(new Runnable() {
                    /* class com.bytedance.ee.bear.list.folder.$$Lambda$SubFolderPresenter$DeleteDocCallback$q31GRSnsYNGoT_ocKyL6GHfluM */

                    public final void run() {
                        SubFolderPresenter.DeleteDocCallback.this.lambda$onPostExecuteSuccess$1$SubFolderPresenter$DeleteDocCallback();
                    }
                });
            }
        }

        public /* synthetic */ void lambda$onOfflinePostExecute$0$SubFolderPresenter$DeleteDocCallback() {
            SubFolderPresenter subFolderPresenter = this.presenterRef.get();
            ((AbstractC8322ag) subFolderPresenter.getView()).mo33342e(false);
            Toast.showSuccessText(subFolderPresenter.f23067c, subFolderPresenter.f23067c.getResources().getString(R.string.Doc_Facade_DeleteSuccessfullyToastTip), 0);
            subFolderPresenter.mo32660d();
        }

        public /* synthetic */ void lambda$onPostExecuteSuccess$1$SubFolderPresenter$DeleteDocCallback() {
            SubFolderPresenter subFolderPresenter = this.presenterRef.get();
            ((AbstractC8322ag) subFolderPresenter.getView()).mo33342e(false);
            Toast.showSuccessText(subFolderPresenter.f23067c, subFolderPresenter.f23067c.getResources().getString(R.string.Doc_Facade_DeleteSuccessfullyToastTip), 0);
            subFolderPresenter.mo32660d();
        }

        DeleteDocCallback(SubFolderPresenter subFolderPresenter) {
            this.presenterRef = new WeakReference<>(subFolderPresenter);
        }

        @Override // com.bytedance.ee.bear.contract.am.AbstractC5108a
        public void onPostExecuteFail(int i) {
            C13479a.m54764b("SubFolderPresenter", "DeleteDocCallback#onPostExecuteFail()...");
            if (this.presenterRef.get() == null) {
                C13479a.m54764b("SubFolderPresenter", "DeleteDocCallback#onPostExecuteFail()...presenterRef = null");
            } else {
                C13748k.m55732a(new Runnable(i) {
                    /* class com.bytedance.ee.bear.list.folder.$$Lambda$SubFolderPresenter$DeleteDocCallback$AZCWSejsyCjTMudvmmh6rSvFcBM */
                    public final /* synthetic */ int f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void run() {
                        SubFolderPresenter.DeleteDocCallback.this.lambda$onPostExecuteFail$2$SubFolderPresenter$DeleteDocCallback(this.f$1);
                    }
                });
            }
        }

        public /* synthetic */ void lambda$onPostExecuteFail$2$SubFolderPresenter$DeleteDocCallback(int i) {
            SubFolderPresenter subFolderPresenter = this.presenterRef.get();
            ((AbstractC8322ag) subFolderPresenter.getView()).mo33342e(false);
            if (i == 4202) {
                Toast.showFailureText(subFolderPresenter.f23067c, (int) R.string.CreationMobile_DataUpgrade_Locked_toast);
            } else {
                Toast.showFailureText(subFolderPresenter.f23067c, subFolderPresenter.f23067c.getResources().getString(R.string.Doc_Facade_DeleteFailToastTip), 0);
            }
        }

        @Override // com.bytedance.ee.bear.contract.am.AbstractC5108a
        public void onOfflinePostExecute(boolean z) {
            C13479a.m54764b("SubFolderPresenter", "DeleteDocCallback#onOfflinePostExecute()...success = " + z);
            if (this.presenterRef.get() == null) {
                C13479a.m54764b("SubFolderPresenter", "DeleteDocCallback#onOfflinePostExecute()...presenterRef = null");
            } else {
                C13748k.m55732a(new Runnable() {
                    /* class com.bytedance.ee.bear.list.folder.$$Lambda$SubFolderPresenter$DeleteDocCallback$SUxIxmYywmkjdBmRAP3NsQtBio */

                    public final void run() {
                        SubFolderPresenter.DeleteDocCallback.this.lambda$onOfflinePostExecute$0$SubFolderPresenter$DeleteDocCallback();
                    }
                });
            }
        }
    }

    @Override // com.bytedance.ee.bear.list.list.BaseListPresenter
    /* renamed from: u */
    private void m34348u() {
        C13479a.m54764b(mo32596c(), "deleteFolderInDB()...");
        C13608f.m55249a(new Runnable() {
            /* class com.bytedance.ee.bear.list.folder.$$Lambda$SubFolderPresenter$G_14gE4109aDhHD_HHcE6ZM9XQI */

            public final void run() {
                SubFolderPresenter.this.m34350w();
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public /* synthetic */ void m34350w() {
        C8153a.m32844b().mo31594b(4, this.f22468a);
        C8153a.m32844b().mo31619d(this.f22468a);
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.list.folder.SubFolderPresenter$b */
    public static final class RunnableC8313b implements Runnable {

        /* renamed from: a */
        private final WeakReference<SubFolderPresenter> f22476a;

        public void run() {
            if (this.f22476a.get() == null) {
                C13479a.m54764b("SubFolderPresenter", "InputPasswordCallback()...presenterRef.get() = null");
                return;
            }
            C13479a.m54764b("SubFolderPresenter", "InputPasswordCallback()...success");
            this.f22476a.get().mo33313o();
        }

        RunnableC8313b(SubFolderPresenter subFolderPresenter) {
            this.f22476a = new WeakReference<>(subFolderPresenter);
        }
    }

    /* renamed from: v */
    private void m34349v() {
        if (this.f22472p.aq()) {
            this.f23075k.mo237937a(((AbstractC8321af) getModel()).mo32721l().mo238001b(new Consumer() {
                /* class com.bytedance.ee.bear.list.folder.$$Lambda$SubFolderPresenter$MWGuLmbkr0aY9nOOq0c_qKT5nk */

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    SubFolderPresenter.this.m34336a((SubFolderPresenter) ((GetComplaintResult) obj));
                }
            }, new Consumer() {
                /* class com.bytedance.ee.bear.list.folder.$$Lambda$SubFolderPresenter$UjHIXjvB0VqxpjDmcmWWQifXOM8 */

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    SubFolderPresenter.this.m34341d((SubFolderPresenter) ((Throwable) obj));
                }
            }));
            return;
        }
        ((AbstractC8322ag) getView()).mo32724a(FolderForbiddenView.ForbiddenState.COMPLAINT_SUCCESS);
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.bytedance.ee.bear.list.list.BaseListPresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        this.f23075k.mo237937a(((AbstractC8321af) getModel()).mo32720k().mo237985a(C11678b.m48481e()).mo238001b(new Consumer() {
            /* class com.bytedance.ee.bear.list.folder.$$Lambda$SubFolderPresenter$P1EbeEQnvVH9GtFjQyGOuuCl0gw */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                SubFolderPresenter.this.m34346g((SubFolderPresenter) ((Document) obj));
            }
        }, $$Lambda$SubFolderPresenter$AT2V0njSUyI_nXfPXvGwZl4viQA.INSTANCE));
    }

    /* renamed from: d */
    public void mo32660d() {
        C13479a.m54764b(mo32596c(), "loadMoreIfEmpty()...");
        if (C13657b.m55421a(((AbstractC8322ag) getView()).mo33351w()) && ((AbstractC8321af) getModel()).mo33363s()) {
            ((AbstractC8321af) getModel()).mo33359o();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.BaseListPresenter
    /* renamed from: a */
    public String mo32593a() {
        if (this.f22474r) {
            return "personal_subfolder";
        }
        return "shared_subfolder";
    }

    /* access modifiers changed from: private */
    @Override // com.bytedance.ee.bear.list.list.BaseListPresenter
    /* renamed from: f */
    public /* synthetic */ void m34345f(Throwable th) throws Exception {
        C13479a.m54761a(mo32596c(), th);
    }

    @Override // com.bytedance.ee.bear.list.list.BaseListPresenter, com.bytedance.ee.bear.list.AbstractC8651p.AbstractC8662k
    /* renamed from: a */
    public void mo32651a(String str) {
        mo33313o();
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.list.folder.SubFolderPresenter$a */
    public static class C8312a implements C8144c.AbstractC8148c {

        /* renamed from: a */
        protected final WeakReference<SubFolderPresenter> f22475a;

        private C8312a(SubFolderPresenter subFolderPresenter) {
            this.f22475a = new WeakReference<>(subFolderPresenter);
        }

        @Override // com.bytedance.ee.bear.list.C8144c.AbstractC8148c
        /* renamed from: a */
        public void mo31479a(String str) {
            C13479a.m54764b("SubFolderPresenter", "DeleteOnlineItemCallback onSuccess()...");
            if (this.f22475a.get() == null) {
                C13479a.m54764b("SubFolderPresenter", "DeleteOnlineItemCallback#onSuccess()...presenterRef = null");
                return;
            }
            SubFolderPresenter subFolderPresenter = this.f22475a.get();
            ((AbstractC8321af) subFolderPresenter.getModel()).mo32717a(str);
            ((AbstractC8322ag) subFolderPresenter.getView()).mo33342e(false);
            Toast.showSuccessText(subFolderPresenter.f23067c, subFolderPresenter.f23067c.getResources().getString(R.string.Doc_Facade_RemoveSuccessfullyToastTip), 0);
            if (TextUtils.equals(subFolderPresenter.f22468a, str)) {
                subFolderPresenter.f22469b.mo32707a();
            }
            subFolderPresenter.mo32660d();
        }

        @Override // com.bytedance.ee.bear.list.C8144c.AbstractC8148c
        /* renamed from: a */
        public void mo31480a(String str, DocumentListInfo documentListInfo) {
            C13479a.m54764b("SubFolderPresenter", "DeleteOnlineItemCallback onAuthorityFail()...");
            if (this.f22475a.get() == null) {
                C13479a.m54764b("SubFolderPresenter", "DeleteOnlineItemCallback#onAuthorityFail()...presenterRef = null");
                return;
            }
            SubFolderPresenter subFolderPresenter = this.f22475a.get();
            ((AbstractC8322ag) subFolderPresenter.getView()).mo33342e(false);
            new DialogC8333b.C8335a().mo32755a(documentListInfo).mo32756a($$Lambda$SubFolderPresenter$a$Oll_2gNcInpPNtiiBX_uG_2fHpc.INSTANCE).mo32754a($$Lambda$SubFolderPresenter$a$SEZqpeameEwuB5fEtI0C9jWrLQ.INSTANCE).mo32758a(subFolderPresenter.f23067c, subFolderPresenter.f23068d, subFolderPresenter.f23074j).show();
        }

        @Override // com.bytedance.ee.bear.list.C8144c.AbstractC8148c
        /* renamed from: a */
        public void mo31481a(String str, Throwable th) {
            C13479a.m54764b("SubFolderPresenter", "DeleteOnlineItemCallback#onFail()...throwable = " + th);
            if (this.f22475a.get() == null) {
                C13479a.m54764b("SubFolderPresenter", "DeleteOnlineItemCallback#onFail()...presenterRef = null");
                return;
            }
            SubFolderPresenter subFolderPresenter = this.f22475a.get();
            ((AbstractC8322ag) subFolderPresenter.getView()).mo33342e(false);
            if (C5203d.m21235a(th, 4202)) {
                Toast.showFailureText(subFolderPresenter.f23067c, (int) R.string.CreationMobile_DataUpgrade_Locked_toast);
            } else {
                Toast.showFailureText(subFolderPresenter.f23067c, subFolderPresenter.f23067c.getResources().getString(R.string.Doc_Facade_RemoveFailToastTip), 0);
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public static /* synthetic */ void m34370a(DialogInterface dialogInterface, int i, Document document) {
            C13479a.m54764b("SubFolderPresenter", "onItemClick()...doc = " + document.toString());
            if (!document.ah()) {
                ((AbstractC10740f) KoinJavaComponent.m268610a(AbstractC10740f.class)).mo17292a(C8292f.m34185d(document));
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m34337a(ShareFolderUserPermission shareFolderUserPermission) throws Exception {
        C13479a.m54764b("SubFolderPresenter", "fetchShareFolderUserPermission()...shareFolderUserPermission = " + shareFolderUserPermission);
        this.f22473q = shareFolderUserPermission;
    }

    /* renamed from: e */
    private void m34342e(Document document) {
        C13479a.m54764b(mo32596c(), "deleteOnlineDoc()...");
        new C8144c(this.f23068d).mo31474a(document.mo32475p(), new C8312a());
    }

    /* renamed from: f */
    private RouteBean m34344f(Document document) {
        return new C8706f(this.f23067c, document, mo32593a(), mo33311l(), "", this.f22471o, this.f22470n + 1, this.f22468a).mo33741a();
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ void m34346g(Document document) throws Exception {
        ((AbstractC8322ag) getView()).mo32723a(document);
        C13479a.m54764b("SubFolderPresenter", "getParentFromCache()...success");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m34338a(Boolean bool) throws Exception {
        C13479a.m54764b(mo32596c(), "deleteOfflineDoc()...success");
    }

    @Override // com.bytedance.ee.bear.list.list.BaseListPresenter
    /* renamed from: b */
    private void m34339b(String str) {
        C13479a.m54764b(mo32596c(), "deleteOfflineDoc()...");
        this.f23075k.mo237937a(this.f23068d.mo41508c(am.class).mo238020d(new Function(str) {
            /* class com.bytedance.ee.bear.list.folder.$$Lambda$SubFolderPresenter$cWr2zTjsPcnw87LawvZaFSA6hDg */
            public final /* synthetic */ String f$1;

            {
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return SubFolderPresenter.this.m34334a(this.f$1, (am) obj);
            }
        }).mo238001b(new Consumer() {
            /* class com.bytedance.ee.bear.list.folder.$$Lambda$SubFolderPresenter$2a_mcsqfuTpMcM4JRtjkkmRinQw */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                SubFolderPresenter.this.m34338a((SubFolderPresenter) ((Boolean) obj));
            }
        }, new Consumer() {
            /* class com.bytedance.ee.bear.list.folder.$$Lambda$SubFolderPresenter$3cHL7_T67719S_0wpE2HGbIsE */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                SubFolderPresenter.this.m34345f((SubFolderPresenter) ((Throwable) obj));
            }
        }));
    }

    /* access modifiers changed from: private */
    @Override // com.bytedance.ee.bear.list.list.BaseListPresenter
    /* renamed from: e */
    public /* synthetic */ void m34343e(Throwable th) throws Exception {
        C13479a.m54758a("SubFolderPresenter", "get exception while getting user permission ...");
        if (ap.m34441a(th)) {
            ((AbstractC10157c) KoinJavaComponent.m268610a(AbstractC10157c.class)).mo36639b().mo36667a(this.f23069e.getActivity(), this.f22468a, C8275a.f22370c.mo32555b(), true, (Runnable) new RunnableC8313b(this));
        } else {
            m34340c(th);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public static /* synthetic */ void m34347g(Throwable th) throws Exception {
        C13479a.m54758a("SubFolderPresenter", "getParentFromCache()...throwable = " + th);
    }

    /* renamed from: c */
    public void mo32659c(Document document) {
        C13479a.m54764b(mo32596c(), "deleteItem()....");
        ((AbstractC8322ag) getView()).mo33342e(true);
        if (((AbstractC6158t) KoinJavaComponent.m268610a(AbstractC6158t.class)).mo20317a(document.mo32472o())) {
            m34339b(document.mo32472o());
        } else {
            m34342e(document);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m34336a(GetComplaintResult getComplaintResult) throws Exception {
        C13479a.m54764b("SubFolderPresenter", "getComplaintState()...result = " + getComplaintResult.getResult());
        if (getComplaintResult.getResult() == ComplaintState.IN_THE_COMPLAINT.getResult()) {
            ((AbstractC8322ag) getView()).mo32724a(FolderForbiddenView.ForbiddenState.IN_COMPLAINT);
        } else if (getComplaintResult.getResult() == ComplaintState.COMPLAINT_FAIL.getResult()) {
            ((AbstractC8322ag) getView()).mo32724a(FolderForbiddenView.ForbiddenState.COMPLAINT_FAIL);
        } else {
            ((AbstractC8322ag) getView()).mo32724a(FolderForbiddenView.ForbiddenState.WARNING);
        }
    }

    @Override // com.bytedance.ee.bear.list.list.BaseListPresenter
    /* renamed from: c */
    private void m34340c(Throwable th) {
        String str;
        boolean z;
        C13479a.m54764b(mo32596c(), "requestFolderPermission()...");
        C8382u a = C8292f.m34123a(th);
        if (this.f23069e.getActivity() != null) {
            AbstractC10159e b = ((AbstractC10157c) KoinJavaComponent.m268610a(AbstractC10157c.class)).mo36639b();
            FragmentActivity activity = this.f23069e.getActivity();
            String str2 = this.f22468a;
            C8275a aVar = C8275a.f22370c;
            if (a == null) {
                str = "";
            } else {
                str = a.mo32812a();
            }
            String string = this.f23067c.getString(R.string.Doc_Permission_AdminNotAuthorizeCross);
            if (a == null || !a.f22621c) {
                z = false;
            } else {
                z = true;
            }
            b.mo36673a(activity, str2, aVar, str, true, string, "", z, "", false, false, mo32593a(), "forbidden", "", true);
        }
    }

    /* access modifiers changed from: private */
    @Override // com.bytedance.ee.bear.list.list.BaseListPresenter
    /* renamed from: d */
    public /* synthetic */ void m34341d(Throwable th) throws Exception {
        C13479a.m54758a("SubFolderPresenter", "getComplaintState()...error = " + th);
        if (C5203d.m21235a(th, 3)) {
            ((AbstractC8322ag) getView()).mo32724a(FolderForbiddenView.ForbiddenState.WARNING);
        } else if (C5203d.m21235a(th, 10004)) {
            ((AbstractC8322ag) getView()).mo32724a(FolderForbiddenView.ForbiddenState.COMPLAINT_EXCEED_LIMITS_DAY);
        } else if (C5203d.m21235a(th, 10005)) {
            ((AbstractC8322ag) getView()).mo32724a(FolderForbiddenView.ForbiddenState.COMPLAINT_EXCEED_LIMITS);
        } else {
            ((AbstractC8322ag) getView()).mo32724a(FolderForbiddenView.ForbiddenState.WARNING);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.BaseListPresenter
    public void a_(Document document) {
        int i;
        String str;
        C13479a.m54764b(mo32596c(), "responseDeleteClick()...");
        if (NodeType.isShortcut(document.ao())) {
            str = C10539a.m43639a(this.f23067c, R.string.CreationMobile_ECM_DeleteTitle, "doc_name", document.mo32469n());
            i = R.string.CreationMobile_ECM_DeleteDesc;
        } else {
            str = C10539a.m43639a(this.f23067c, R.string.CreationMobile_ECM_DeleteConfirmTitle, "doc_name", C8292f.m34193g(this.f23067c, document));
            if (document.mo32483t() == C8275a.f22370c.mo32555b()) {
                i = R.string.CreationMobile_ECM_DeleteDesc_folder;
            } else {
                i = R.string.CreationMobile_ECM_DeleteConfirmDesc;
            }
        }
        UDDialog build = ((BearUDCheckBoxDialogBuilder) ((BearUDCheckBoxDialogBuilder) ((BearUDCheckBoxDialogBuilder) ((BearUDCheckBoxDialogBuilder) ((BearUDCheckBoxDialogBuilder) ((BearUDCheckBoxDialogBuilder) ((BearUDCheckBoxDialogBuilder) ((BearUDCheckBoxDialogBuilder) new BearUDCheckBoxDialogBuilder(this.f23067c).title(str)).titleSize(16)).titleGravity(8388611)).message(i)).messageTextSize(14)).messageGravity(8388611)).mo45382b(false).addActionButton(new UDBaseDialogBuilder.ActionBuilder().mo90702a(R.id.ud_dialog_btn_primary).mo90710d(R.color.function_danger_500).mo90706b(R.string.Doc_Facade_Delete).mo90703a(new DialogInterface.OnClickListener(document) {
            /* class com.bytedance.ee.bear.list.folder.$$Lambda$SubFolderPresenter$PgQkPqLs_kIEbf4kKYwfAZXK2U */
            public final /* synthetic */ Document f$1;

            {
                this.f$1 = r2;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                SubFolderPresenter.this.m34335a((SubFolderPresenter) this.f$1, (Document) dialogInterface, (DialogInterface) i);
            }
        }))).addActionButton(R.id.ud_dialog_btn_secondary, R.string.Doc_Facade_Cancel, (DialogInterface.OnClickListener) null)).build();
        build.show();
        ((IWatermarkManager) KoinJavaComponent.m268610a(IWatermarkManager.class)).mo40652b(build);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.BaseListPresenter
    /* renamed from: a */
    public void mo32650a(ConnectionService.NetworkState networkState) {
        if ((this.f23073i == null || !this.f23073i.mo20041b()) && networkState != null && networkState.mo20041b()) {
            mo33313o();
        }
        super.mo32650a(networkState);
    }

    @Override // com.bytedance.ee.bear.list.list.AbstractC8544i.AbstractC8545a, com.bytedance.ee.bear.list.list.BaseListPresenter
    /* renamed from: a */
    public void mo32594a(Document document) {
        boolean z;
        String str;
        super.mo32594a(document);
        String a = mo32593a();
        String o = document.mo32472o();
        int t = document.mo32483t();
        String C = document.mo32377C();
        String str2 = this.f22468a;
        if (document.mo32483t() == C8275a.f22370c.mo32555b()) {
            z = true;
        } else {
            z = false;
        }
        boolean isShareFolder = FolderVersion.isShareFolder(document.an(), document.ap());
        boolean isEmpty = TextUtils.isEmpty(this.f22468a);
        int i = this.f22470n;
        Boolean valueOf = Boolean.valueOf(mo33308i());
        if (mo33308i()) {
            str = "middle";
        } else {
            str = "suspend_create";
        }
        ListAnalysis.m32523a("ccm_space_folder_click", a, "", "share", "ccm_permission_share_view", "", o, t, C, str2, z, isShareFolder, isEmpty, i, valueOf, str);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ Boolean m34334a(String str, am amVar) throws Exception {
        amVar.delOfflineDoc(str, new DeleteDocCallback(this));
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.BaseListPresenter
    /* renamed from: b */
    public void mo32657b(String str, String str2) {
        super.mo32657b(str, str2);
        Document document = this.f22472p;
        if (document != null && TextUtils.equals(str, document.mo32472o())) {
            this.f22472p.mo32443g(str2);
            ((AbstractC8322ag) getView()).mo32723a(this.f22472p);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.BaseListPresenter
    /* renamed from: b */
    public void mo32658b(String str, boolean z) {
        super.mo32658b(str, z);
        Document document = this.f22472p;
        if (document != null && TextUtils.equals(document.mo32472o(), str)) {
            this.f22472p.mo32412a(z);
            ((AbstractC8322ag) getView()).mo32723a(this.f22472p);
        }
    }

    @Override // com.bytedance.ee.bear.list.list.BaseListPresenter, com.bytedance.ee.bear.list.list.AbstractC8542h.AbstractC8543a
    /* renamed from: a */
    public void mo32648a(int i, boolean z) {
        super.mo32648a(i, z);
        Document z_ = ((AbstractC8321af) getModel()).z_();
        this.f22472p = z_;
        if (z_ != null) {
            this.f22474r = !z_.ap();
            ((AbstractC8321af) getModel()).mo32718f();
            m34349v();
        }
        ((AbstractC8322ag) getView()).mo32723a(this.f22472p);
        this.f22473q = ((AbstractC8321af) getModel()).mo32719j();
        ((AbstractC8322ag) getView()).mo32725a(this.f22473q);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m34335a(Document document, DialogInterface dialogInterface, int i) {
        mo32659c(document);
    }

    /* renamed from: a */
    public void mo32702a(int i, int i2, Intent intent) {
        C13479a.m54764b("SubFolderPresenter", "onActivityResult()...requestCode = " + i + ", resultCode = " + i2);
        if (i != 1) {
            return;
        }
        if (i2 == 1) {
            ((AbstractC8322ag) getView()).mo32724a(FolderForbiddenView.ForbiddenState.IN_COMPLAINT);
        } else {
            mo33313o();
        }
    }

    SubFolderPresenter(AbstractC8322ag agVar, AbstractC8321af afVar, Context context, C10917c cVar, C7718l lVar, String str, boolean z, int i, String str2, AbstractC8315aa aaVar) {
        super(agVar, afVar, context, cVar, lVar);
        this.f22468a = str;
        this.f22474r = z;
        this.f22470n = i;
        this.f22469b = aaVar;
        this.f22471o = str2;
    }
}
