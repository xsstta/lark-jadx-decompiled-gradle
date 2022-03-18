package com.bytedance.ee.bear.list.folder;

import android.content.Context;
import android.content.DialogInterface;
import com.bytedance.ee.bear.NodeType;
import com.bytedance.ee.bear.contract.BinderIDeleteDocCallback;
import com.bytedance.ee.bear.contract.am;
import com.bytedance.ee.bear.contract.net.C5203d;
import com.bytedance.ee.bear.document.AbstractC6158t;
import com.bytedance.ee.bear.facade.common.C7718l;
import com.bytedance.ee.bear.facade.common.widget.Toast;
import com.bytedance.ee.bear.list.AbstractC8651p;
import com.bytedance.ee.bear.list.C8144c;
import com.bytedance.ee.bear.list.C8292f;
import com.bytedance.ee.bear.list.DocumentListInfo;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.list.dto.DocVersion;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.bear.list.dto.FolderVersion;
import com.bytedance.ee.bear.list.folder.DialogC8333b;
import com.bytedance.ee.bear.list.folder.MyRootFolderPresenter;
import com.bytedance.ee.bear.list.list.AbstractC8544i;
import com.bytedance.ee.bear.list.list.BaseListPresenter;
import com.bytedance.ee.bear.list.route.C8706f;
import com.bytedance.ee.bear.p522q.C10539a;
import com.bytedance.ee.bear.route.AbstractC10740f;
import com.bytedance.ee.bear.route.RouteBean;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.watermark.interfaces.IWatermarkManager;
import com.bytedance.ee.bear.widgets.dialog.checkboxdialog.BearUDCheckBoxDialogBuilder;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p702e.C13657b;
import com.bytedance.ee.util.p718t.C13748k;
import com.larksuite.component.universe_design.dialog.UDBaseDialogBuilder;
import com.larksuite.component.universe_design.dialog.UDDialog;
import com.larksuite.suite.R;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.lang.ref.WeakReference;
import org.koin.java.KoinJavaComponent;

public class MyRootFolderPresenter extends BaseListPresenter<AbstractC8319ad, AbstractC8320ae, AbstractC8544i.AbstractC8545a> implements AbstractC8651p.AbstractC8653b, AbstractC8651p.AbstractC8654c, AbstractC8651p.AbstractC8662k {
    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.BaseListPresenter
    /* renamed from: a */
    public String mo32593a() {
        return "personal";
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.BaseListPresenter
    /* renamed from: c */
    public String mo32596c() {
        return "MyDocumentPresenter";
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.bytedance.ee.bear.list.list.BaseListPresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
    }

    /* access modifiers changed from: private */
    public static class DeleteDocCallback extends BinderIDeleteDocCallback.Stub {
        private final WeakReference<MyRootFolderPresenter> presenterRef;

        public /* synthetic */ void lambda$onPreExecute$0$MyRootFolderPresenter$DeleteDocCallback() {
            ((AbstractC8320ae) this.presenterRef.get().getView()).mo33342e(true);
        }

        @Override // com.bytedance.ee.bear.contract.am.AbstractC5108a
        public void onPostExecuteSuccess() {
            C13479a.m54764b("MyDocumentPresenter", "onPostExecuteSuccess()...");
            WeakReference<MyRootFolderPresenter> weakReference = this.presenterRef;
            if (weakReference != null && weakReference.get() != null) {
                C13748k.m55732a(new Runnable() {
                    /* class com.bytedance.ee.bear.list.folder.$$Lambda$MyRootFolderPresenter$DeleteDocCallback$FWxbXzobJgbPQwQbmW3CB_WvkI */

                    public final void run() {
                        MyRootFolderPresenter.DeleteDocCallback.this.lambda$onPostExecuteSuccess$2$MyRootFolderPresenter$DeleteDocCallback();
                    }
                });
            }
        }

        @Override // com.bytedance.ee.bear.contract.am.AbstractC5108a
        public void onPreExecute() {
            C13479a.m54764b("MyDocumentPresenter", "onPreExecute()...");
            WeakReference<MyRootFolderPresenter> weakReference = this.presenterRef;
            if (weakReference != null && weakReference.get() != null) {
                C13748k.m55732a(new Runnable() {
                    /* class com.bytedance.ee.bear.list.folder.$$Lambda$MyRootFolderPresenter$DeleteDocCallback$30KP20BysQUGy0AQX8LmkezaZQU */

                    public final void run() {
                        MyRootFolderPresenter.DeleteDocCallback.this.lambda$onPreExecute$0$MyRootFolderPresenter$DeleteDocCallback();
                    }
                });
            }
        }

        public /* synthetic */ void lambda$onOfflinePostExecute$1$MyRootFolderPresenter$DeleteDocCallback() {
            MyRootFolderPresenter myRootFolderPresenter = this.presenterRef.get();
            ((AbstractC8320ae) myRootFolderPresenter.getView()).mo33342e(false);
            Toast.showSuccessText(myRootFolderPresenter.f23067c, myRootFolderPresenter.f23067c.getResources().getString(R.string.Doc_Facade_DeleteSuccessfullyToastTip), 0);
        }

        public /* synthetic */ void lambda$onPostExecuteSuccess$2$MyRootFolderPresenter$DeleteDocCallback() {
            MyRootFolderPresenter myRootFolderPresenter = this.presenterRef.get();
            ((AbstractC8320ae) myRootFolderPresenter.getView()).mo33342e(false);
            Toast.showSuccessText(myRootFolderPresenter.f23067c, myRootFolderPresenter.f23067c.getResources().getString(R.string.Doc_Facade_DeleteSuccessfullyToastTip), 0);
        }

        DeleteDocCallback(MyRootFolderPresenter myRootFolderPresenter) {
            this.presenterRef = new WeakReference<>(myRootFolderPresenter);
        }

        @Override // com.bytedance.ee.bear.contract.am.AbstractC5108a
        public void onPostExecuteFail(int i) {
            C13479a.m54764b("MyDocumentPresenter", "onPostExecuteFail()...");
            WeakReference<MyRootFolderPresenter> weakReference = this.presenterRef;
            if (weakReference != null && weakReference.get() != null) {
                C13748k.m55732a(new Runnable(i) {
                    /* class com.bytedance.ee.bear.list.folder.$$Lambda$MyRootFolderPresenter$DeleteDocCallback$LFq96T0tRneUOH6BKKm_ipVfcFI */
                    public final /* synthetic */ int f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void run() {
                        MyRootFolderPresenter.DeleteDocCallback.this.lambda$onPostExecuteFail$3$MyRootFolderPresenter$DeleteDocCallback(this.f$1);
                    }
                });
            }
        }

        public /* synthetic */ void lambda$onPostExecuteFail$3$MyRootFolderPresenter$DeleteDocCallback(int i) {
            MyRootFolderPresenter myRootFolderPresenter = this.presenterRef.get();
            ((AbstractC8320ae) myRootFolderPresenter.getView()).mo33342e(false);
            if (i == 4202) {
                Toast.showFailureText(myRootFolderPresenter.f23067c, (int) R.string.CreationMobile_DataUpgrade_Locked_toast);
            } else {
                Toast.showFailureText(myRootFolderPresenter.f23067c, myRootFolderPresenter.f23067c.getResources().getString(R.string.Doc_Facade_DeleteFailToastTip), 0);
            }
        }

        @Override // com.bytedance.ee.bear.contract.am.AbstractC5108a
        public void onOfflinePostExecute(boolean z) {
            C13479a.m54764b("MyDocumentPresenter", "onOfflinePostExecute()...success = " + z);
            WeakReference<MyRootFolderPresenter> weakReference = this.presenterRef;
            if (weakReference != null && weakReference.get() != null) {
                C13748k.m55732a(new Runnable() {
                    /* class com.bytedance.ee.bear.list.folder.$$Lambda$MyRootFolderPresenter$DeleteDocCallback$iiFvrrWk7qJZ4uKTa9MuROl__og */

                    public final void run() {
                        MyRootFolderPresenter.DeleteDocCallback.this.lambda$onOfflinePostExecute$1$MyRootFolderPresenter$DeleteDocCallback();
                    }
                });
            }
        }
    }

    /* renamed from: d */
    public void mo32660d() {
        C13479a.m54764b(mo32596c(), "loadMoreIfEmpty()...");
        if (C13657b.m55421a(((AbstractC8320ae) getView()).mo33351w()) && ((AbstractC8319ad) getModel()).mo33363s()) {
            ((AbstractC8319ad) getModel()).mo33359o();
        }
    }

    /* access modifiers changed from: private */
    @Override // com.bytedance.ee.bear.list.list.BaseListPresenter
    /* renamed from: c */
    public /* synthetic */ void m34317c(Throwable th) throws Exception {
        C13479a.m54761a(mo32596c(), th);
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.list.folder.MyRootFolderPresenter$a */
    public static class C8309a implements C8144c.AbstractC8148c {

        /* renamed from: a */
        protected final WeakReference<MyRootFolderPresenter> f22466a;

        private C8309a(MyRootFolderPresenter myRootFolderPresenter) {
            this.f22466a = new WeakReference<>(myRootFolderPresenter);
        }

        @Override // com.bytedance.ee.bear.list.C8144c.AbstractC8148c
        /* renamed from: a */
        public void mo31479a(String str) {
            C13479a.m54764b("MyDocumentPresenter", "DeleteOnlineItemCallback onSuccess()...");
            if (this.f22466a.get() == null) {
                C13479a.m54764b("MyDocumentPresenter", "DeleteOnlineItemCallback#onSuccess()...presenterRef = null");
                return;
            }
            MyRootFolderPresenter myRootFolderPresenter = this.f22466a.get();
            ((AbstractC8319ad) myRootFolderPresenter.getModel()).mo32715a(str);
            ((AbstractC8320ae) myRootFolderPresenter.getView()).mo33342e(false);
            Toast.showSuccessText(myRootFolderPresenter.f23067c, myRootFolderPresenter.f23067c.getResources().getString(R.string.Doc_Facade_RemoveSuccessfullyToastTip), 0);
            myRootFolderPresenter.mo32660d();
        }

        @Override // com.bytedance.ee.bear.list.C8144c.AbstractC8148c
        /* renamed from: a */
        public void mo31480a(String str, DocumentListInfo documentListInfo) {
            C13479a.m54764b("MyDocumentPresenter", "DeleteOnlineItemCallback onAuthorityFail()...");
            if (this.f22466a.get() == null) {
                C13479a.m54764b("MyDocumentPresenter", "DeleteOnlineItemCallback#onAuthorityFail()...presenterRef = null");
                return;
            }
            MyRootFolderPresenter myRootFolderPresenter = this.f22466a.get();
            ((AbstractC8320ae) myRootFolderPresenter.getView()).mo33342e(false);
            new DialogC8333b.C8335a().mo32755a(documentListInfo).mo32756a($$Lambda$MyRootFolderPresenter$a$NVoMy2NzZY4Zs0FvUIO4JRvAI8o.INSTANCE).mo32754a($$Lambda$MyRootFolderPresenter$a$NyPXOwAR0_SX1JMe3034eEefMJg.INSTANCE).mo32758a(myRootFolderPresenter.f23067c, myRootFolderPresenter.f23068d, myRootFolderPresenter.f23074j).show();
        }

        @Override // com.bytedance.ee.bear.list.C8144c.AbstractC8148c
        /* renamed from: a */
        public void mo31481a(String str, Throwable th) {
            C13479a.m54764b("MyDocumentPresenter", "DeleteOnlineItemCallback#onFail()...throwable = " + th);
            if (this.f22466a.get() == null) {
                C13479a.m54764b("MyDocumentPresenter", "DeleteOnlineItemCallback#onFail()...presenterRef = null");
                return;
            }
            MyRootFolderPresenter myRootFolderPresenter = this.f22466a.get();
            ((AbstractC8320ae) myRootFolderPresenter.getView()).mo33342e(false);
            if (C5203d.m21235a(th, 4202)) {
                Toast.showFailureText(myRootFolderPresenter.f23067c, (int) R.string.CreationMobile_DataUpgrade_Locked_toast);
            } else {
                Toast.showFailureText(myRootFolderPresenter.f23067c, myRootFolderPresenter.f23067c.getResources().getString(R.string.Doc_Facade_RemoveFailToastTip), 0);
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public static /* synthetic */ void m34328a(DialogInterface dialogInterface, int i, Document document) {
            if (!document.ah()) {
                ((AbstractC10740f) KoinJavaComponent.m268610a(AbstractC10740f.class)).mo17292a(C8292f.m34185d(document));
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.list.folder.MyRootFolderPresenter$b */
    public static class C8310b implements C8144c.AbstractC8146a {

        /* renamed from: a */
        protected final WeakReference<MyRootFolderPresenter> f22467a;

        C8310b(MyRootFolderPresenter myRootFolderPresenter) {
            this.f22467a = new WeakReference<>(myRootFolderPresenter);
        }

        @Override // com.bytedance.ee.bear.list.C8144c.AbstractC8146a
        /* renamed from: a */
        public void mo31477a(String str) {
            C13479a.m54764b("MyDocumentPresenter", "RemoveItemCallback onSuccess()...");
            if (this.f22467a.get() == null) {
                C13479a.m54764b("MyDocumentPresenter", "RemoveItemCallback#onSuccess()...presenterRef = null");
                return;
            }
            MyRootFolderPresenter myRootFolderPresenter = this.f22467a.get();
            ((AbstractC8319ad) myRootFolderPresenter.getModel()).mo32715a(str);
            ((AbstractC8320ae) myRootFolderPresenter.getView()).mo33342e(false);
            Toast.showSuccessText(myRootFolderPresenter.f23067c, myRootFolderPresenter.f23067c.getResources().getString(R.string.Doc_Facade_RemoveSuccessfullyToastTip), 0);
            myRootFolderPresenter.mo32660d();
        }

        @Override // com.bytedance.ee.bear.list.C8144c.AbstractC8146a
        /* renamed from: a */
        public void mo31478a(String str, Throwable th) {
            C13479a.m54764b("MyDocumentPresenter", "RemoveItemCallback#onFail()...throwable = " + th);
            if (this.f22467a.get() == null) {
                C13479a.m54764b("MyDocumentPresenter", "RemoveItemCallback#onFail()...presenterRef = null");
                return;
            }
            MyRootFolderPresenter myRootFolderPresenter = this.f22467a.get();
            ((AbstractC8320ae) myRootFolderPresenter.getView()).mo33342e(false);
            if (C5203d.m21235a(th, 4202)) {
                Toast.showFailureText(myRootFolderPresenter.f23067c, (int) R.string.CreationMobile_DataUpgrade_Locked_toast);
            } else {
                Toast.showFailureText(myRootFolderPresenter.f23067c, myRootFolderPresenter.f23067c.getResources().getString(R.string.Doc_Facade_RemoveFailToastTip), 0);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m34314a(Boolean bool) throws Exception {
        C13479a.m54764b(mo32596c(), "deleteOfflineDoc()...success");
    }

    /* renamed from: c */
    private RouteBean m34316c(Document document) {
        return new C8706f(this.f23067c, document, mo32593a(), mo33311l(), "", "home").mo33741a();
    }

    @Override // com.bytedance.ee.bear.list.list.BaseListPresenter
    /* renamed from: b */
    private void m34315b(String str) {
        C13479a.m54764b(mo32596c(), "deleteOfflineDoc()...");
        this.f23075k.mo237937a(this.f23068d.mo41508c(am.class).mo238020d(new Function(str) {
            /* class com.bytedance.ee.bear.list.folder.$$Lambda$MyRootFolderPresenter$cdO58oI9Meuxb5fUY58toukPQ */
            public final /* synthetic */ String f$1;

            {
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return MyRootFolderPresenter.this.m34312a(this.f$1, (am) obj);
            }
        }).mo238001b(new Consumer() {
            /* class com.bytedance.ee.bear.list.folder.$$Lambda$MyRootFolderPresenter$a8FfzBDfLLkjMKGJvi4wziCMIWU */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                MyRootFolderPresenter.this.m34314a((MyRootFolderPresenter) ((Boolean) obj));
            }
        }, new Consumer() {
            /* class com.bytedance.ee.bear.list.folder.$$Lambda$MyRootFolderPresenter$0WAvuSM0nYMxHl0VAfwmgjITBk */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                MyRootFolderPresenter.this.m34317c((MyRootFolderPresenter) ((Throwable) obj));
            }
        }));
    }

    /* renamed from: e */
    private void m34318e(Document document) {
        C13479a.m54764b(mo32596c(), "deleteItem()...");
        if (((AbstractC6158t) KoinJavaComponent.m268610a(AbstractC6158t.class)).mo20317a(document.mo32472o())) {
            m34315b(document.mo32472o());
        } else {
            m34319f(document);
        }
    }

    @Override // com.bytedance.ee.bear.list.list.BaseListPresenter, com.bytedance.ee.bear.list.AbstractC8651p.AbstractC8662k
    /* renamed from: a */
    public void mo32651a(String str) {
        mo33313o();
    }

    /* renamed from: f */
    private void m34319f(Document document) {
        C13479a.m54764b(mo32596c(), "deleteOnlineDoc()...");
        if (document.mo32483t() == C8275a.f22370c.mo32555b()) {
            if (FolderVersion.isShareFolderV2(document.an())) {
                ((AbstractC8320ae) getView()).mo33342e(true);
                new C8144c(this.f23068d).mo31474a(document.mo32475p(), new C8309a());
                return;
            }
            ((AbstractC8320ae) getView()).mo33342e(true);
            new C8144c(this.f23068d).mo31475b(document.mo32475p(), new C8310b(this));
        } else if (new DocVersion(document.an()).isDocV2()) {
            ((AbstractC8320ae) getView()).mo33342e(true);
            new C8144c(this.f23068d).mo31474a(document.mo32475p(), new C8309a());
        } else {
            new C8144c(this.f23068d).mo31472a(document.mo32472o(), document.mo32483t(), document.an(), new DeleteDocCallback(this));
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
            if (document.mo32483t() != C8275a.f22370c.mo32555b() || !FolderVersion.isShareFolderV2(document.an())) {
                i = R.string.CreationMobile_ECM_DeleteConfirmDesc;
            } else {
                i = R.string.CreationMobile_ECM_DeleteDesc_folder;
            }
        }
        UDDialog build = ((BearUDCheckBoxDialogBuilder) ((BearUDCheckBoxDialogBuilder) ((BearUDCheckBoxDialogBuilder) ((BearUDCheckBoxDialogBuilder) ((BearUDCheckBoxDialogBuilder) ((BearUDCheckBoxDialogBuilder) ((BearUDCheckBoxDialogBuilder) ((BearUDCheckBoxDialogBuilder) new BearUDCheckBoxDialogBuilder(this.f23067c).title(str)).titleSize(16)).titleGravity(8388611)).message(i)).messageTextSize(14)).messageGravity(8388611)).mo45382b(false).addActionButton(new UDBaseDialogBuilder.ActionBuilder().mo90702a(R.id.ud_dialog_btn_primary).mo90710d(R.color.function_danger_500).mo90706b(R.string.Doc_Facade_Delete).mo90703a(new DialogInterface.OnClickListener(document) {
            /* class com.bytedance.ee.bear.list.folder.$$Lambda$MyRootFolderPresenter$xAISkLkTqnafVZkH9YH6Cnzsg */
            public final /* synthetic */ Document f$1;

            {
                this.f$1 = r2;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                MyRootFolderPresenter.this.m34313a((MyRootFolderPresenter) this.f$1, (Document) dialogInterface, (DialogInterface) i);
            }
        }))).addActionButton(R.id.ud_dialog_btn_secondary, R.string.Doc_Facade_Cancel, (DialogInterface.OnClickListener) null)).build();
        build.show();
        ((IWatermarkManager) KoinJavaComponent.m268610a(IWatermarkManager.class)).mo40652b(build);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ Boolean m34312a(String str, am amVar) throws Exception {
        amVar.delOfflineDoc(str, new DeleteDocCallback(this));
        return true;
    }

    @Override // com.bytedance.ee.bear.list.AbstractC8651p.AbstractC8653b
    /* renamed from: a */
    public void mo32652a(String str, String str2) {
        ((AbstractC8319ad) getModel()).mo32715a(str);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m34313a(Document document, DialogInterface dialogInterface, int i) {
        m34318e(document);
    }

    @Override // com.bytedance.ee.bear.list.list.AbstractC8544i.AbstractC8545a
    /* renamed from: a */
    public void mo32595a(Document document, int i, boolean z) {
        String c = mo32596c();
        C13479a.m54764b(c, "onItemClick()...doc = " + document.toString());
        C8292f.m34138a(this.f23069e.getActivity(), this.f23068d, document, mo33312n(), m34316c(document), mo32593a(), i, z);
    }

    @Override // com.bytedance.ee.bear.list.AbstractC8651p.AbstractC8654c
    /* renamed from: a */
    public void mo32653a(String str, String str2, String str3) {
        C13479a.m54764b(mo32596c(), "onMakeCopy()...");
        mo33313o();
    }

    MyRootFolderPresenter(AbstractC8320ae aeVar, AbstractC8319ad adVar, Context context, C10917c cVar, C7718l lVar) {
        super(aeVar, adVar, context, cVar, lVar);
    }
}
