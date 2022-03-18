package com.bytedance.ee.bear.list.folder;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
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
import com.bytedance.ee.bear.list.analysis.ListAnalysis;
import com.bytedance.ee.bear.list.cache.C8153a;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.bear.list.dto.FolderVersion;
import com.bytedance.ee.bear.list.folder.AbstractC8317ac;
import com.bytedance.ee.bear.list.folder.FolderDetailPresenter;
import com.bytedance.ee.bear.list.folder.complaint.ComplaintState;
import com.bytedance.ee.bear.list.folder.complaint.FolderForbiddenView;
import com.bytedance.ee.bear.list.folder.complaint.GetComplaintResult;
import com.bytedance.ee.bear.list.list.BaseListPresenter;
import com.bytedance.ee.bear.list.list.C8533d;
import com.bytedance.ee.bear.list.route.C8706f;
import com.bytedance.ee.bear.middleground_permission_export.model.AbstractC10169g;
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
import io.reactivex.AbstractC68307f;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.lang.ref.WeakReference;
import org.koin.java.KoinJavaComponent;

public class FolderDetailPresenter extends BaseListPresenter<AbstractC8316ab, AbstractC8317ac, AbstractC8317ac.AbstractC8318a> implements AbstractC8317ac.AbstractC8318a, AbstractC8651p.AbstractC8653b, AbstractC8651p.AbstractC8654c, AbstractC8651p.AbstractC8662k {

    /* renamed from: a */
    public final String f22439a;

    /* renamed from: b */
    public final AbstractC8315aa f22440b;

    /* renamed from: n */
    private final int f22441n;

    /* renamed from: o */
    private String f22442o;

    /* renamed from: p */
    private final String f22443p;

    /* renamed from: q */
    private Document f22444q;

    /* renamed from: r */
    private final C8533d f22445r = new C8533d();

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.BaseListPresenter
    /* renamed from: c */
    public String mo32596c() {
        return "FolderDetailPresenter";
    }

    @Override // com.bytedance.ee.bear.list.list.AbstractC8544i.AbstractC8545a
    /* renamed from: a */
    public void mo32595a(Document document, int i, boolean z) {
        String c = mo32596c();
        C13479a.m54764b(c, "onItemClick()...doc = " + document.toString());
        if (!document.ah()) {
            ((AbstractC10740f) KoinJavaComponent.m268610a(AbstractC10740f.class)).mo17292a(C8292f.m34185d(document));
        } else {
            C8292f.m34139a(this.f23069e.getActivity(), this.f23068d, document, mo33312n(), m34261h(document), mo32593a(), i, z, this.f22441n + 1);
        }
        ListAnalysis.m32521a("ccm_space_folder_click", mo32593a(), "", "", this.f22439a, document.mo32472o(), document.mo32483t(), document.mo32377C(), FolderVersion.isShareFolder(document.an(), document.ap()), !TextUtils.isEmpty(this.f22439a), this.f22441n);
    }

    @Override // com.bytedance.ee.bear.list.list.BaseListPresenter, com.bytedance.ee.bear.list.list.AbstractC8542h.AbstractC8543a
    /* renamed from: a */
    public void mo32655a(Throwable th) {
        super.mo32655a(th);
        if (C5203d.m21235a(th, 4)) {
            if (ap.m34441a(th)) {
                ((AbstractC10157c) KoinJavaComponent.m268610a(AbstractC10157c.class)).mo36639b().mo36667a(this.f23069e.getActivity(), this.f22439a, C8275a.f22370c.mo32555b(), false, (Runnable) new RunnableC8305a(this));
            } else {
                m34254c(th);
            }
            m34263u();
            ((AbstractC8317ac) getView()).mo33354z();
        } else if (C5203d.m21235a(th, 7)) {
            Toast.showFailureText(this.f23067c, this.f23067c.getString(R.string.Doc_List_FolderDeleted), 0);
            m34263u();
            AbstractC8315aa aaVar = this.f22440b;
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
        ((AbstractC8316ab) getModel()).mo32708a(str);
        if (TextUtils.equals(this.f22439a, str)) {
            this.f22440b.mo32707a();
        } else if (TextUtils.equals(this.f22439a, str2)) {
            mo33313o();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.BaseListPresenter
    /* renamed from: a */
    public void mo32654a(String str, boolean z) {
        super.mo32654a(str, z);
        Document document = this.f22444q;
        if (document != null && TextUtils.equals(document.mo32472o(), str)) {
            this.f22444q.mo32438e(z);
            ((AbstractC8317ac) getView()).mo32713a(this.f22444q);
        }
    }

    @Override // com.bytedance.ee.bear.list.folder.complaint.FolderForbiddenView.AbstractC8342a
    /* renamed from: e */
    public void mo32661e() {
        C8292f.m34148a(this.f22444q, this.f23069e);
    }

    @Override // com.bytedance.ee.bear.list.folder.complaint.FolderForbiddenView.AbstractC8342a
    /* renamed from: f */
    public void mo32662f() {
        C8292f.m34150a((AbstractC10740f) KoinJavaComponent.m268610a(AbstractC10740f.class));
    }

    /* access modifiers changed from: private */
    public static class DeleteDocCallback extends BinderIDeleteDocCallback.Stub {
        private final WeakReference<FolderDetailPresenter> presenterRef;

        public /* synthetic */ void lambda$onPreExecute$0$FolderDetailPresenter$DeleteDocCallback() {
            ((AbstractC8317ac) this.presenterRef.get().getView()).mo33342e(true);
        }

        @Override // com.bytedance.ee.bear.contract.am.AbstractC5108a
        public void onPostExecuteSuccess() {
            C13479a.m54764b("FolderDetailPresenter", "DeleteDocCallback#onPostExecuteSuccess()...");
            if (this.presenterRef.get() == null) {
                C13479a.m54764b("FolderDetailPresenter", "DeleteDocCallback#onPostExecuteSuccess()...presenterRef = null");
            } else {
                C13748k.m55732a(new Runnable() {
                    /* class com.bytedance.ee.bear.list.folder.$$Lambda$FolderDetailPresenter$DeleteDocCallback$BT14gE5F89JtdPKCTE8YhoG4gk */

                    public final void run() {
                        FolderDetailPresenter.DeleteDocCallback.this.lambda$onPostExecuteSuccess$2$FolderDetailPresenter$DeleteDocCallback();
                    }
                });
            }
        }

        @Override // com.bytedance.ee.bear.contract.am.AbstractC5108a
        public void onPreExecute() {
            C13479a.m54764b("FolderDetailPresenter", "DeleteDocCallback#onPreExecute()...");
            if (this.presenterRef.get() == null) {
                C13479a.m54764b("FolderDetailPresenter", "DeleteDocCallback#onPreExecute()...presenterRef = null");
            } else {
                C13748k.m55732a(new Runnable() {
                    /* class com.bytedance.ee.bear.list.folder.$$Lambda$FolderDetailPresenter$DeleteDocCallback$64w5ABkr_2f_NrriAFJMHEe7RIs */

                    public final void run() {
                        FolderDetailPresenter.DeleteDocCallback.this.lambda$onPreExecute$0$FolderDetailPresenter$DeleteDocCallback();
                    }
                });
            }
        }

        public /* synthetic */ void lambda$onOfflinePostExecute$1$FolderDetailPresenter$DeleteDocCallback() {
            FolderDetailPresenter folderDetailPresenter = this.presenterRef.get();
            ((AbstractC8317ac) folderDetailPresenter.getView()).mo33342e(false);
            Toast.showSuccessText(folderDetailPresenter.f23067c, folderDetailPresenter.f23067c.getResources().getString(R.string.Doc_Facade_DeleteSuccessfullyToastTip), 0);
            folderDetailPresenter.mo32660d();
        }

        public /* synthetic */ void lambda$onPostExecuteSuccess$2$FolderDetailPresenter$DeleteDocCallback() {
            FolderDetailPresenter folderDetailPresenter = this.presenterRef.get();
            ((AbstractC8317ac) folderDetailPresenter.getView()).mo33342e(false);
            Toast.showSuccessText(folderDetailPresenter.f23067c, folderDetailPresenter.f23067c.getResources().getString(R.string.Doc_Facade_DeleteSuccessfullyToastTip), 0);
            folderDetailPresenter.mo32660d();
        }

        DeleteDocCallback(FolderDetailPresenter folderDetailPresenter) {
            this.presenterRef = new WeakReference<>(folderDetailPresenter);
        }

        @Override // com.bytedance.ee.bear.contract.am.AbstractC5108a
        public void onPostExecuteFail(int i) {
            C13479a.m54764b("FolderDetailPresenter", "DeleteDocCallback#onPostExecuteFail()...");
            if (this.presenterRef.get() == null) {
                C13479a.m54764b("FolderDetailPresenter", "DeleteDocCallback#onPostExecuteFail()...presenterRef = null");
            } else {
                C13748k.m55732a(new Runnable(i) {
                    /* class com.bytedance.ee.bear.list.folder.$$Lambda$FolderDetailPresenter$DeleteDocCallback$ujACyfs3Y3l5zgL8BOa5zH74AFY */
                    public final /* synthetic */ int f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void run() {
                        FolderDetailPresenter.DeleteDocCallback.this.lambda$onPostExecuteFail$3$FolderDetailPresenter$DeleteDocCallback(this.f$1);
                    }
                });
            }
        }

        public /* synthetic */ void lambda$onPostExecuteFail$3$FolderDetailPresenter$DeleteDocCallback(int i) {
            FolderDetailPresenter folderDetailPresenter = this.presenterRef.get();
            ((AbstractC8317ac) folderDetailPresenter.getView()).mo33342e(false);
            if (i == 4202) {
                Toast.showFailureText(folderDetailPresenter.f23067c, (int) R.string.CreationMobile_DataUpgrade_Locked_toast);
            } else {
                Toast.showFailureText(folderDetailPresenter.f23067c, folderDetailPresenter.f23067c.getResources().getString(R.string.Doc_Facade_DeleteFailToastTip), 0);
            }
        }

        @Override // com.bytedance.ee.bear.contract.am.AbstractC5108a
        public void onOfflinePostExecute(boolean z) {
            C13479a.m54764b("FolderDetailPresenter", "DeleteDocCallback#onOfflinePostExecute()...success = " + z);
            if (this.presenterRef.get() == null) {
                C13479a.m54764b("FolderDetailPresenter", "DeleteDocCallback#onOfflinePostExecute()...presenterRef = null");
            } else {
                C13748k.m55732a(new Runnable() {
                    /* class com.bytedance.ee.bear.list.folder.$$Lambda$FolderDetailPresenter$DeleteDocCallback$ZRqnORKgZTv9fnpxcOYS6glmlSc */

                    public final void run() {
                        FolderDetailPresenter.DeleteDocCallback.this.lambda$onOfflinePostExecute$1$FolderDetailPresenter$DeleteDocCallback();
                    }
                });
            }
        }
    }

    @Override // com.bytedance.ee.bear.list.list.BaseListPresenter
    /* renamed from: u */
    private void m34263u() {
        C13479a.m54764b(mo32596c(), "deleteFolderInDB()...");
        C13608f.m55249a(new Runnable() {
            /* class com.bytedance.ee.bear.list.folder.$$Lambda$FolderDetailPresenter$Ds5ZWckVwKh0TqLnxeFoj9K07o */

            public final void run() {
                FolderDetailPresenter.this.m34265w();
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public /* synthetic */ void m34265w() {
        C8153a.m32844b().mo31594b(4, this.f22439a);
        C8153a.m32844b().mo31619d(this.f22439a);
    }

    /* renamed from: com.bytedance.ee.bear.list.folder.FolderDetailPresenter$a */
    private static final class RunnableC8305a implements Runnable {

        /* renamed from: a */
        private final WeakReference<FolderDetailPresenter> f22446a;

        public void run() {
            if (this.f22446a.get() == null) {
                C13479a.m54764b("FolderDetailPresenter", "InputPasswordCallback()...presenterRef.get() = null");
                return;
            }
            C13479a.m54764b("FolderDetailPresenter", "InputPasswordCallback()...success");
            this.f22446a.get().mo33313o();
        }

        RunnableC8305a(FolderDetailPresenter folderDetailPresenter) {
            this.f22446a = new WeakReference<>(folderDetailPresenter);
        }
    }

    /* renamed from: v */
    private void m34264v() {
        if (!this.f22444q.aq() || !mo33312n()) {
            ((AbstractC8317ac) getView()).mo32714a(FolderForbiddenView.ForbiddenState.COMPLAINT_SUCCESS);
            return;
        }
        this.f23075k.mo237937a(((AbstractC8316ab) getModel()).mo32712m().mo238001b(new Consumer() {
            /* class com.bytedance.ee.bear.list.folder.$$Lambda$FolderDetailPresenter$xFLhDfFoIDMx8e1o7Nmp6WTYp6A */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                FolderDetailPresenter.this.m34250a((FolderDetailPresenter) ((GetComplaintResult) obj));
            }
        }, new Consumer() {
            /* class com.bytedance.ee.bear.list.folder.$$Lambda$FolderDetailPresenter$4rbCRCgzRh9oKKotyyubPI1t3l8 */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                FolderDetailPresenter.this.m34255d((FolderDetailPresenter) ((Throwable) obj));
            }
        }));
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.BaseListPresenter
    /* renamed from: a */
    public String mo32593a() {
        if (TextUtils.isEmpty(this.f22439a)) {
            return "personal_folder_root";
        }
        if (TextUtils.isEmpty(this.f22442o)) {
            return "personal_subfolder";
        }
        return "shared_subfolder";
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.bytedance.ee.bear.list.list.BaseListPresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        this.f23075k.mo237937a(((AbstractC8316ab) getModel()).mo32711l().mo237985a(C11678b.m48481e()).mo238001b(new Consumer() {
            /* class com.bytedance.ee.bear.list.folder.$$Lambda$FolderDetailPresenter$PkGiewkCJcVIO3hMC1vyiurOYto */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                FolderDetailPresenter.this.m34262i((FolderDetailPresenter) ((Document) obj));
            }
        }, $$Lambda$FolderDetailPresenter$XhZpoHNurSTgbIO_96DKUXWzuXQ.INSTANCE));
    }

    /* renamed from: d */
    public void mo32660d() {
        C13479a.m54764b(mo32596c(), "loadMoreIfEmpty()...");
        if (C13657b.m55421a(((AbstractC8317ac) getView()).mo33351w()) && ((AbstractC8316ab) getModel()).mo33363s()) {
            ((AbstractC8316ab) getModel()).mo33359o();
        }
    }

    /* access modifiers changed from: private */
    @Override // com.bytedance.ee.bear.list.list.BaseListPresenter
    /* renamed from: e */
    public /* synthetic */ void m34257e(Throwable th) throws Exception {
        C13479a.m54761a(mo32596c(), th);
    }

    @Override // com.bytedance.ee.bear.list.list.BaseListPresenter, com.bytedance.ee.bear.list.AbstractC8651p.AbstractC8662k
    /* renamed from: a */
    public void mo32651a(String str) {
        mo33313o();
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.list.folder.FolderDetailPresenter$b */
    public static class C8306b implements C8144c.AbstractC8146a {

        /* renamed from: a */
        private final WeakReference<FolderDetailPresenter> f22447a;

        C8306b(FolderDetailPresenter folderDetailPresenter) {
            this.f22447a = new WeakReference<>(folderDetailPresenter);
        }

        @Override // com.bytedance.ee.bear.list.C8144c.AbstractC8146a
        /* renamed from: a */
        public void mo31477a(String str) {
            C13479a.m54764b("FolderDetailPresenter", "RemoveItemCallback onSuccess()...");
            if (this.f22447a.get() == null) {
                C13479a.m54764b("FolderDetailPresenter", "RemoveItemCallback#onSuccess()...presenterRef = null");
                return;
            }
            FolderDetailPresenter folderDetailPresenter = this.f22447a.get();
            ((AbstractC8316ab) folderDetailPresenter.getModel()).mo32708a(str);
            ((AbstractC8317ac) folderDetailPresenter.getView()).mo33342e(false);
            Toast.showSuccessText(folderDetailPresenter.f23067c, folderDetailPresenter.f23067c.getResources().getString(R.string.Doc_Facade_RemoveSuccessfullyToastTip), 0);
            if (TextUtils.equals(folderDetailPresenter.f22439a, str)) {
                folderDetailPresenter.f22440b.mo32707a();
            }
            folderDetailPresenter.mo32660d();
        }

        @Override // com.bytedance.ee.bear.list.C8144c.AbstractC8146a
        /* renamed from: a */
        public void mo31478a(String str, Throwable th) {
            C13479a.m54764b("FolderDetailPresenter", "RemoveItemCallback#onFail()...throwable = " + th);
            if (this.f22447a.get() == null) {
                C13479a.m54764b("FolderDetailPresenter", "RemoveItemCallback#onFail()...presenterRef = null");
                return;
            }
            FolderDetailPresenter folderDetailPresenter = this.f22447a.get();
            ((AbstractC8317ac) folderDetailPresenter.getView()).mo33342e(false);
            if (C5203d.m21235a(th, 4202)) {
                Toast.showFailureText(folderDetailPresenter.f23067c, (int) R.string.CreationMobile_DataUpgrade_Locked_toast);
            } else {
                Toast.showFailureText(folderDetailPresenter.f23067c, folderDetailPresenter.f23067c.getResources().getString(R.string.Doc_Facade_RemoveFailToastTip), 0);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m34251a(Boolean bool) throws Exception {
        C13479a.m54764b(mo32596c(), "deleteOfflineDoc()...success");
    }

    /* renamed from: e */
    private void m34256e(Document document) {
        C13479a.m54764b(mo32596c(), "onDeleteConfirmClick()...");
        if (this.f22445r.mo33365b()) {
            mo32659c(document);
        } else {
            m34260g(document);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static /* synthetic */ void m34259f(Throwable th) throws Exception {
        C13479a.m54758a("FolderDetailPresenter", "getParentFromCache()...throwable = " + th);
    }

    /* renamed from: h */
    private RouteBean m34261h(Document document) {
        return new C8706f(this.f23067c, document, mo32593a(), mo33311l(), "", this.f22443p, this.f22441n + 1, this.f22439a).mo33741a();
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public /* synthetic */ void m34262i(Document document) throws Exception {
        ((AbstractC8317ac) getView()).mo32713a(document);
        C13479a.m54764b("FolderDetailPresenter", "getParentFromCache()...success");
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.list.folder.FolderDetailPresenter$c */
    public static class C8307c implements AbstractC10169g {

        /* renamed from: a */
        private final String f22448a;

        /* renamed from: b */
        private final WeakReference<FolderDetailPresenter> f22449b;

        @Override // com.bytedance.ee.bear.middleground_permission_export.model.AbstractC10169g
        /* renamed from: a */
        public void mo17110a() {
        }

        @Override // com.bytedance.ee.bear.middleground_permission_export.model.AbstractC10169g
        /* renamed from: a */
        public void mo17112a(Throwable th) {
            C13479a.m54761a("FolderDetailPresenter", th);
            if (this.f22449b.get() == null) {
                C13479a.m54764b("FolderDetailPresenter", "onFailed()...presenterRef == null");
                return;
            }
            FolderDetailPresenter folderDetailPresenter = this.f22449b.get();
            if (C5203d.m21235a(th, 10040)) {
                Toast.showFailureText(folderDetailPresenter.f23067c, (int) R.string.CreationMobile_DataUpgrade_Locked_toast);
            } else {
                Toast.showFailureText(folderDetailPresenter.f23067c, folderDetailPresenter.f23067c.getString(R.string.Doc_Facade_SetFailed), 0);
            }
        }

        @Override // com.bytedance.ee.bear.middleground_permission_export.model.AbstractC10169g
        /* renamed from: a */
        public void mo17111a(int i) {
            C13479a.m54764b("FolderDetailPresenter", "SetExternalPermissionCallback#onSuccess()...result = " + i);
            if (this.f22449b.get() == null) {
                C13479a.m54764b("FolderDetailPresenter", "SetExternalPermissionCallback#onSuccess()...presenterRef == null");
                return;
            }
            FolderDetailPresenter folderDetailPresenter = this.f22449b.get();
            folderDetailPresenter.f23075k.mo237937a(AbstractC68307f.m265083a(this.f22448a).mo237985a(C11678b.m48479c()).mo238001b(new Consumer(folderDetailPresenter) {
                /* class com.bytedance.ee.bear.list.folder.$$Lambda$FolderDetailPresenter$c$Qb1gz9u0K20iFOv8J1raaNFnQwg */
                public final /* synthetic */ FolderDetailPresenter f$1;

                {
                    this.f$1 = r2;
                }

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    FolderDetailPresenter.C8307c.this.m34287a(this.f$1, (String) obj);
                }
            }, $$Lambda$FolderDetailPresenter$c$80lE6cWedv18yQHICCdxKb4SMLY.INSTANCE));
            Toast.showSuccessText(folderDetailPresenter.f23067c, folderDetailPresenter.f23067c.getString(R.string.Doc_Facade_SetSuccess), 0);
        }

        C8307c(String str, FolderDetailPresenter folderDetailPresenter) {
            this.f22448a = str;
            this.f22449b = new WeakReference<>(folderDetailPresenter);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public /* synthetic */ void m34287a(FolderDetailPresenter folderDetailPresenter, String str) throws Exception {
            C8153a.m32844b().mo31586a(this.f22448a, folderDetailPresenter.f22439a, false);
        }
    }

    @Override // com.bytedance.ee.bear.list.list.BaseListPresenter
    /* renamed from: b */
    private void m34253b(String str) {
        C13479a.m54764b(mo32596c(), "deleteOfflineDoc()...");
        this.f23075k.mo237937a(this.f23068d.mo41508c(am.class).mo238020d(new Function(str) {
            /* class com.bytedance.ee.bear.list.folder.$$Lambda$FolderDetailPresenter$cp3Zs8Ib73uBaHfBYkpmgBJyG8Y */
            public final /* synthetic */ String f$1;

            {
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return FolderDetailPresenter.this.m34248a(this.f$1, (am) obj);
            }
        }).mo238001b(new Consumer() {
            /* class com.bytedance.ee.bear.list.folder.$$Lambda$FolderDetailPresenter$ZOFpQfQAh5R5j6PtDnLkOYMJg */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                FolderDetailPresenter.this.m34251a((FolderDetailPresenter) ((Boolean) obj));
            }
        }, new Consumer() {
            /* class com.bytedance.ee.bear.list.folder.$$Lambda$FolderDetailPresenter$58YBou6lpaQ4wd3mGkeG63voDBg */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                FolderDetailPresenter.this.m34257e((FolderDetailPresenter) ((Throwable) obj));
            }
        }));
    }

    /* renamed from: f */
    private void m34258f(Document document) {
        C13479a.m54764b(mo32596c(), "deleteOnlineDoc()...");
        new C8144c(this.f23068d).mo31472a(document.mo32472o(), document.mo32483t(), document.an(), new DeleteDocCallback(this));
    }

    /* renamed from: g */
    private void m34260g(Document document) {
        C13479a.m54764b(mo32596c(), "removeItem()...");
        ((AbstractC8317ac) getView()).mo33342e(true);
        new C8144c(this.f23068d).mo31475b(document.mo32475p(), new C8306b(this));
    }

    /* renamed from: c */
    public void mo32659c(Document document) {
        C13479a.m54764b(mo32596c(), "deleteItem()....");
        if (((AbstractC6158t) KoinJavaComponent.m268610a(AbstractC6158t.class)).mo20317a(document.mo32472o())) {
            m34253b(document.mo32472o());
        } else {
            m34258f(document);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m34250a(GetComplaintResult getComplaintResult) throws Exception {
        C13479a.m54764b("FolderDetailPresenter", "getComplaintState()...result = " + getComplaintResult.getResult());
        if (getComplaintResult.getResult() == ComplaintState.IN_THE_COMPLAINT.getResult()) {
            ((AbstractC8317ac) getView()).mo32714a(FolderForbiddenView.ForbiddenState.IN_COMPLAINT);
        } else if (getComplaintResult.getResult() == ComplaintState.COMPLAINT_FAIL.getResult()) {
            ((AbstractC8317ac) getView()).mo32714a(FolderForbiddenView.ForbiddenState.COMPLAINT_FAIL);
        } else {
            ((AbstractC8317ac) getView()).mo32714a(FolderForbiddenView.ForbiddenState.WARNING);
        }
    }

    @Override // com.bytedance.ee.bear.list.list.BaseListPresenter
    /* renamed from: c */
    private void m34254c(Throwable th) {
        String str;
        boolean z;
        C13479a.m54764b(mo32596c(), "requestFolderPermission()...");
        C8382u a = C8292f.m34123a(th);
        if (this.f23069e.getActivity() != null) {
            AbstractC10159e b = ((AbstractC10157c) KoinJavaComponent.m268610a(AbstractC10157c.class)).mo36639b();
            FragmentActivity activity = this.f23069e.getActivity();
            String str2 = this.f22439a;
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
            b.mo36673a(activity, str2, aVar, str, true, string, "", z, "", false, false, mo32593a(), "forbidden", "", false);
        }
    }

    /* access modifiers changed from: private */
    @Override // com.bytedance.ee.bear.list.list.BaseListPresenter
    /* renamed from: d */
    public /* synthetic */ void m34255d(Throwable th) throws Exception {
        C13479a.m54758a("FolderDetailPresenter", "getComplaintState()...error = " + th);
        if (C5203d.m21235a(th, 3)) {
            ((AbstractC8317ac) getView()).mo32714a(FolderForbiddenView.ForbiddenState.WARNING);
        } else if (C5203d.m21235a(th, 10004)) {
            ((AbstractC8317ac) getView()).mo32714a(FolderForbiddenView.ForbiddenState.COMPLAINT_EXCEED_LIMITS_DAY);
        } else if (C5203d.m21235a(th, 10005)) {
            ((AbstractC8317ac) getView()).mo32714a(FolderForbiddenView.ForbiddenState.COMPLAINT_EXCEED_LIMITS);
        } else {
            ((AbstractC8317ac) getView()).mo32714a(FolderForbiddenView.ForbiddenState.WARNING);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.BaseListPresenter
    public void a_(Document document) {
        UDDialog uDDialog;
        String str;
        C13479a.m54764b(mo32596c(), "responseDeleteClick()...");
        this.f22445r.mo33364a();
        if (document.mo32483t() == C8275a.f22370c.mo32555b()) {
            uDDialog = ((BearUDCheckBoxDialogBuilder) ((BearUDCheckBoxDialogBuilder) ((BearUDCheckBoxDialogBuilder) ((BearUDCheckBoxDialogBuilder) ((BearUDCheckBoxDialogBuilder) ((BearUDCheckBoxDialogBuilder) ((BearUDCheckBoxDialogBuilder) ((BearUDCheckBoxDialogBuilder) new BearUDCheckBoxDialogBuilder(this.f23067c).title(C10539a.m43639a(this.f23067c, R.string.Doc_List_Remove_Folder, "folder_name", C8292f.m34193g(this.f23067c, document)))).titleSize(16)).titleGravity(8388611)).message(R.string.Doc_List_Remove_Folder_Confirm)).messageTextSize(14)).messageGravity(8388611)).mo45382b(false).addActionButton(new UDBaseDialogBuilder.ActionBuilder().mo90702a(R.id.ud_dialog_btn_primary).mo90710d(R.color.function_danger_500).mo90706b(R.string.Doc_Facade_Delete).mo90703a(new DialogInterface.OnClickListener(document) {
                /* class com.bytedance.ee.bear.list.folder.$$Lambda$FolderDetailPresenter$YmwdbwybgIoI4TQa_e2uv_8clw */
                public final /* synthetic */ Document f$1;

                {
                    this.f$1 = r2;
                }

                public final void onClick(DialogInterface dialogInterface, int i) {
                    FolderDetailPresenter.this.m34252b(this.f$1, dialogInterface, i);
                }
            }))).addActionButton(R.id.ud_dialog_btn_secondary, R.string.Doc_Facade_Cancel, (DialogInterface.OnClickListener) null)).build();
        } else {
            BearUDCheckBoxDialogBuilder aVar = (BearUDCheckBoxDialogBuilder) ((BearUDCheckBoxDialogBuilder) ((BearUDCheckBoxDialogBuilder) ((BearUDCheckBoxDialogBuilder) ((BearUDCheckBoxDialogBuilder) ((BearUDCheckBoxDialogBuilder) new BearUDCheckBoxDialogBuilder(this.f23067c).title(R.string.Doc_List_Remove_Folder_Document_Dialog_Title)).titleSize(16)).titleGravity(8388611)).message(R.string.Doc_List_Remove_Folder_Document_Dialog_Content)).messageTextSize(14)).messageGravity(8388611);
            String k = document.mo32457k();
            if (this.f23074j == null) {
                str = "";
            } else {
                str = this.f23074j.f14584a;
            }
            uDDialog = ((BearUDCheckBoxDialogBuilder) ((BearUDCheckBoxDialogBuilder) aVar.mo45382b(TextUtils.equals(k, str)).mo45379a(this.f23067c.getString(R.string.Doc_List_Delete_Source_Item)).mo45378a(this.f22445r).addActionButton(new UDBaseDialogBuilder.ActionBuilder().mo90702a(R.id.ud_dialog_btn_primary).mo90710d(R.color.function_danger_500).mo90706b(R.string.Doc_Facade_Confirm).mo90703a(new DialogInterface.OnClickListener(document) {
                /* class com.bytedance.ee.bear.list.folder.$$Lambda$FolderDetailPresenter$yy3CydeV8bjOf_0hzLy9iNOTsJ4 */
                public final /* synthetic */ Document f$1;

                {
                    this.f$1 = r2;
                }

                public final void onClick(DialogInterface dialogInterface, int i) {
                    FolderDetailPresenter.this.m34249a((FolderDetailPresenter) this.f$1, (Document) dialogInterface, (DialogInterface) i);
                }
            }))).addActionButton(R.id.ud_dialog_btn_secondary, R.string.Doc_Facade_Cancel, (DialogInterface.OnClickListener) null)).build();
        }
        uDDialog.show();
        ((IWatermarkManager) KoinJavaComponent.m268610a(IWatermarkManager.class)).mo40652b(uDDialog);
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
        String str2 = this.f22439a;
        if (document.mo32483t() == C8275a.f22370c.mo32555b()) {
            z = true;
        } else {
            z = false;
        }
        boolean isShareFolder = FolderVersion.isShareFolder(document.an(), document.ap());
        boolean isEmpty = TextUtils.isEmpty(this.f22439a);
        int i = this.f22441n;
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
    public /* synthetic */ Boolean m34248a(String str, am amVar) throws Exception {
        amVar.delOfflineDoc(str, new DeleteDocCallback(this));
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.BaseListPresenter
    /* renamed from: b */
    public void mo32657b(String str, String str2) {
        super.mo32657b(str, str2);
        Document document = this.f22444q;
        if (document != null && TextUtils.equals(str, document.mo32472o())) {
            this.f22444q.mo32443g(str2);
            ((AbstractC8317ac) getView()).mo32713a(this.f22444q);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.BaseListPresenter
    /* renamed from: b */
    public void mo32658b(String str, boolean z) {
        super.mo32658b(str, z);
        Document document = this.f22444q;
        if (document != null && TextUtils.equals(document.mo32472o(), str)) {
            this.f22444q.mo32412a(z);
            ((AbstractC8317ac) getView()).mo32713a(this.f22444q);
        }
    }

    @Override // com.bytedance.ee.bear.list.list.BaseListPresenter, com.bytedance.ee.bear.list.list.AbstractC8542h.AbstractC8543a
    /* renamed from: a */
    public void mo32648a(int i, boolean z) {
        super.mo32648a(i, z);
        Document k = ((AbstractC8316ab) getModel()).mo32710k();
        this.f22444q = k;
        if (k != null) {
            this.f22442o = k.mo32399O();
            if (FolderVersion.isNewShareFolder(this.f22444q.mo32397M())) {
                ((AbstractC10740f) KoinJavaComponent.m268610a(AbstractC10740f.class)).mo17287a();
                m34263u();
                this.f22440b.mo32707a();
            }
            ((AbstractC8316ab) getModel()).mo32709j();
            m34264v();
        }
        ((AbstractC8317ac) getView()).mo32713a(this.f22444q);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m34249a(Document document, DialogInterface dialogInterface, int i) {
        m34256e(document);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m34252b(Document document, DialogInterface dialogInterface, int i) {
        m34256e(document);
    }

    /* renamed from: a */
    public void mo32647a(int i, int i2, Intent intent) {
        C13479a.m54764b("FolderDetailPresenter", "onActivityResult()...requestCode = " + i + ", resultCode = " + i2);
        if (i != 1) {
            return;
        }
        if (i2 == 1) {
            ((AbstractC8317ac) getView()).mo32714a(FolderForbiddenView.ForbiddenState.IN_COMPLAINT);
        } else {
            mo33313o();
        }
    }

    @Override // com.bytedance.ee.bear.list.folder.AbstractC8317ac.AbstractC8318a
    /* renamed from: a */
    public void mo32649a(View view, int i, Document document, boolean z) {
        C8292f.m34143a(this.f23067c, document, this.f23074j, new C8307c(document.mo32472o(), this));
    }

    FolderDetailPresenter(AbstractC8317ac acVar, AbstractC8316ab abVar, Context context, C10917c cVar, C7718l lVar, String str, int i, String str2, String str3, AbstractC8315aa aaVar) {
        super(acVar, abVar, context, cVar, lVar);
        this.f22439a = str;
        this.f22441n = i;
        this.f22442o = str2;
        this.f22440b = aaVar;
        this.f22443p = str3;
    }
}
