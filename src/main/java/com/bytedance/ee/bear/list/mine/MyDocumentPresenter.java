package com.bytedance.ee.bear.list.mine;

import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.aj;
import com.bytedance.ee.bear.contract.BinderIDeleteDocCallback;
import com.bytedance.ee.bear.contract.am;
import com.bytedance.ee.bear.document.AbstractC6158t;
import com.bytedance.ee.bear.facade.common.C7718l;
import com.bytedance.ee.bear.facade.common.widget.Toast;
import com.bytedance.ee.bear.list.AbstractC8651p;
import com.bytedance.ee.bear.list.C8144c;
import com.bytedance.ee.bear.list.C8292f;
import com.bytedance.ee.bear.list.analysis.ListAnalysis;
import com.bytedance.ee.bear.list.cache.FolderSortStrategy;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.bear.list.dto.FolderVersion;
import com.bytedance.ee.bear.list.list.AbstractC8544i;
import com.bytedance.ee.bear.list.list.BaseListPresenter;
import com.bytedance.ee.bear.list.mine.MyDocumentPresenter;
import com.bytedance.ee.bear.list.route.C8706f;
import com.bytedance.ee.bear.list.sort.C8786n;
import com.bytedance.ee.bear.p522q.C10539a;
import com.bytedance.ee.bear.route.RouteBean;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.bear.watermark.interfaces.IWatermarkManager;
import com.bytedance.ee.bear.widgets.dialog.checkboxdialog.BearUDCheckBoxDialogBuilder;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p702e.C13657b;
import com.bytedance.ee.util.p718t.C13748k;
import com.larksuite.component.universe_design.dialog.UDBaseDialogBuilder;
import com.larksuite.component.universe_design.dialog.UDDialog;
import com.larksuite.suite.R;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import org.koin.java.KoinJavaComponent;

public class MyDocumentPresenter extends BaseListPresenter<AbstractC8617f, AbstractC8618g, AbstractC8544i.AbstractC8545a> implements AbstractC8651p.AbstractC8654c {

    /* renamed from: b */
    static final /* synthetic */ boolean f23364b = true;

    /* renamed from: a */
    protected C8786n f23365a;

    /* renamed from: n */
    private Disposable f23366n;

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.BaseListPresenter
    /* renamed from: a */
    public String mo32593a() {
        return "belongtome";
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.BaseListPresenter
    /* renamed from: c */
    public String mo32596c() {
        return "MyDocumentPresenter";
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.BaseListPresenter
    /* renamed from: m */
    public String mo32597m() {
        return "personal";
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.bytedance.ee.bear.list.list.BaseListPresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        m35967d();
        C13479a.m54764b("MyDocumentPresenter", "create()...");
    }

    /* access modifiers changed from: private */
    public static class DeleteDocCallback extends BinderIDeleteDocCallback.Stub {
        private final WeakReference<MyDocumentPresenter> presenterRef;

        public /* synthetic */ void lambda$onPreExecute$0$MyDocumentPresenter$DeleteDocCallback() {
            ((AbstractC8618g) this.presenterRef.get().getView()).mo33342e(MyDocumentPresenter.f23364b);
        }

        @Override // com.bytedance.ee.bear.contract.am.AbstractC5108a
        public void onPostExecuteSuccess() {
            C13479a.m54764b("MyDocumentPresenter", "onPostExecuteSuccess()...");
            WeakReference<MyDocumentPresenter> weakReference = this.presenterRef;
            if (weakReference != null && weakReference.get() != null) {
                C13748k.m55732a(new Runnable() {
                    /* class com.bytedance.ee.bear.list.mine.$$Lambda$MyDocumentPresenter$DeleteDocCallback$lW2LWtgXZwaxgHeDLN1zZafVA */

                    public final void run() {
                        MyDocumentPresenter.DeleteDocCallback.this.lambda$onPostExecuteSuccess$2$MyDocumentPresenter$DeleteDocCallback();
                    }
                });
            }
        }

        @Override // com.bytedance.ee.bear.contract.am.AbstractC5108a
        public void onPreExecute() {
            C13479a.m54764b("MyDocumentPresenter", "onPreExecute()...");
            WeakReference<MyDocumentPresenter> weakReference = this.presenterRef;
            if (weakReference != null && weakReference.get() != null) {
                C13748k.m55732a(new Runnable() {
                    /* class com.bytedance.ee.bear.list.mine.$$Lambda$MyDocumentPresenter$DeleteDocCallback$wVMPOZlIbDYWqDlUAIyUFGzTTA */

                    public final void run() {
                        MyDocumentPresenter.DeleteDocCallback.this.lambda$onPreExecute$0$MyDocumentPresenter$DeleteDocCallback();
                    }
                });
            }
        }

        public /* synthetic */ void lambda$onOfflinePostExecute$1$MyDocumentPresenter$DeleteDocCallback() {
            MyDocumentPresenter myDocumentPresenter = this.presenterRef.get();
            ((AbstractC8618g) myDocumentPresenter.getView()).mo33342e(false);
            Toast.showSuccessText(myDocumentPresenter.f23067c, myDocumentPresenter.f23067c.getResources().getString(R.string.Doc_Facade_DeleteSuccessfullyToastTip), 0);
        }

        public /* synthetic */ void lambda$onPostExecuteSuccess$2$MyDocumentPresenter$DeleteDocCallback() {
            MyDocumentPresenter myDocumentPresenter = this.presenterRef.get();
            ((AbstractC8618g) myDocumentPresenter.getView()).mo33342e(false);
            Toast.showSuccessText(myDocumentPresenter.f23067c, myDocumentPresenter.f23067c.getResources().getString(R.string.Doc_Facade_DeleteSuccessfullyToastTip), 0);
        }

        DeleteDocCallback(MyDocumentPresenter myDocumentPresenter) {
            this.presenterRef = new WeakReference<>(myDocumentPresenter);
        }

        @Override // com.bytedance.ee.bear.contract.am.AbstractC5108a
        public void onPostExecuteFail(int i) {
            C13479a.m54764b("MyDocumentPresenter", "onPostExecuteFail()...");
            WeakReference<MyDocumentPresenter> weakReference = this.presenterRef;
            if (weakReference != null && weakReference.get() != null) {
                C13748k.m55732a(new Runnable(i) {
                    /* class com.bytedance.ee.bear.list.mine.$$Lambda$MyDocumentPresenter$DeleteDocCallback$hPuXT0_tojyhag3C6yYUl2Zs30 */
                    public final /* synthetic */ int f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void run() {
                        MyDocumentPresenter.DeleteDocCallback.this.lambda$onPostExecuteFail$3$MyDocumentPresenter$DeleteDocCallback(this.f$1);
                    }
                });
            }
        }

        public /* synthetic */ void lambda$onPostExecuteFail$3$MyDocumentPresenter$DeleteDocCallback(int i) {
            MyDocumentPresenter myDocumentPresenter = this.presenterRef.get();
            ((AbstractC8618g) myDocumentPresenter.getView()).mo33342e(false);
            if (i == 4202) {
                Toast.showFailureText(myDocumentPresenter.f23067c, (int) R.string.CreationMobile_DataUpgrade_Locked_toast);
            } else {
                Toast.showFailureText(myDocumentPresenter.f23067c, myDocumentPresenter.f23067c.getResources().getString(R.string.Doc_Facade_DeleteFailToastTip), 0);
            }
        }

        @Override // com.bytedance.ee.bear.contract.am.AbstractC5108a
        public void onOfflinePostExecute(boolean z) {
            C13479a.m54764b("MyDocumentPresenter", "onOfflinePostExecute()...success = " + z);
            WeakReference<MyDocumentPresenter> weakReference = this.presenterRef;
            if (weakReference != null && weakReference.get() != null) {
                C13748k.m55732a(new Runnable() {
                    /* class com.bytedance.ee.bear.list.mine.$$Lambda$MyDocumentPresenter$DeleteDocCallback$p9EmDtW2Az5YYskjkU_QVNkNh1U */

                    public final void run() {
                        MyDocumentPresenter.DeleteDocCallback.this.lambda$onOfflinePostExecute$1$MyDocumentPresenter$DeleteDocCallback();
                    }
                });
            }
        }
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.bytedance.ee.bear.list.list.BaseListPresenter, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        super.destroy();
        Disposable disposable = this.f23366n;
        if (disposable != null && !disposable.isDisposed()) {
            this.f23366n.dispose();
        }
    }

    /* renamed from: d */
    private void m35967d() {
        if (this.f23069e == null) {
            return;
        }
        if (f23364b || this.f23069e.getActivity() != null) {
            if (this.f23365a == null) {
                this.f23365a = (C8786n) aj.m5366a(this.f23069e.getActivity()).mo6005a(C8786n.class);
            }
            this.f23365a.getSortStrategyLiveData().mo5923a(this.f23069e, new AbstractC1178x() {
                /* class com.bytedance.ee.bear.list.mine.$$Lambda$MyDocumentPresenter$esYec2aR6wnJYbbFNj3H1cknMk */

                @Override // androidx.lifecycle.AbstractC1178x
                public final void onChanged(Object obj) {
                    MyDocumentPresenter.this.m35960a((MyDocumentPresenter) ((FolderSortStrategy) obj));
                }
            });
            return;
        }
        throw new AssertionError();
    }

    /* access modifiers changed from: private */
    @Override // com.bytedance.ee.bear.list.list.BaseListPresenter
    /* renamed from: c */
    public /* synthetic */ void m35966c(Throwable th) throws Exception {
        C13479a.m54761a(mo32596c(), th);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m35962a(Boolean bool) throws Exception {
        C13479a.m54764b(mo32596c(), "deleteOfflineDoc()...success");
    }

    /* renamed from: c */
    private RouteBean m35965c(Document document) {
        return new C8706f(this.f23067c, document, mo32593a(), mo33311l(), "", "home").mo33741a();
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static /* synthetic */ void m35968d(Throwable th) throws Exception {
        C13479a.m54758a("MyDocumentPresenter", "getFilterDocuments()...error = " + th);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m35960a(FolderSortStrategy folderSortStrategy) {
        if (folderSortStrategy != null && TextUtils.equals(folderSortStrategy.mo31545a(), "mine")) {
            Disposable disposable = this.f23366n;
            if (disposable != null && !disposable.isDisposed()) {
                this.f23366n.dispose();
            }
            this.f23366n = ((AbstractC8617f) getModel()).A_().mo237985a(C11678b.m48481e()).mo238001b(new Consumer() {
                /* class com.bytedance.ee.bear.list.mine.$$Lambda$MyDocumentPresenter$oY68rNHqbWH5TOa_cT1CZHeeEC4 */

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    MyDocumentPresenter.this.m35964b((MyDocumentPresenter) ((ArrayList) obj));
                }
            }, $$Lambda$MyDocumentPresenter$F14oXexvcM2sXdI6O2aI0GrctUo.INSTANCE);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m35964b(ArrayList arrayList) throws Exception {
        C13479a.m54764b("MyDocumentPresenter", "onFilterChanged()...getFilterDocuments success, size = " + C13657b.m55424c(arrayList));
        if (C13657b.m55423b(arrayList)) {
            ((AbstractC8618g) getView()).mo33334b(arrayList);
        }
    }

    /* renamed from: e */
    private void m35969e(Document document) {
        C13479a.m54764b(mo32596c(), "deleteItem()...");
        if (((AbstractC6158t) KoinJavaComponent.m268610a(AbstractC6158t.class)).mo20317a(document.mo32472o())) {
            m35963a(document.mo32472o());
        } else {
            m35970f(document);
        }
    }

    /* renamed from: f */
    private void m35970f(Document document) {
        C13479a.m54764b(mo32596c(), "deleteOnlineDoc()...");
        new C8144c(this.f23068d).mo31472a(document.mo32472o(), document.mo32483t(), document.an(), new DeleteDocCallback(this));
    }

    @Override // com.bytedance.ee.bear.list.list.BaseListPresenter
    /* renamed from: a */
    private void m35963a(String str) {
        C13479a.m54764b(mo32596c(), "deleteOfflineDoc()...");
        this.f23075k.mo237937a(this.f23068d.mo41508c(am.class).mo238020d(new Function(str) {
            /* class com.bytedance.ee.bear.list.mine.$$Lambda$MyDocumentPresenter$0AMsRkiJk1M23rCYeJ7sXqfQio */
            public final /* synthetic */ String f$1;

            {
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return MyDocumentPresenter.this.m35959a(this.f$1, (am) obj);
            }
        }).mo238001b(new Consumer() {
            /* class com.bytedance.ee.bear.list.mine.$$Lambda$MyDocumentPresenter$ptUosPknyjAFaPirdp_QNNRfANU */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                MyDocumentPresenter.this.m35962a((MyDocumentPresenter) ((Boolean) obj));
            }
        }, new Consumer() {
            /* class com.bytedance.ee.bear.list.mine.$$Lambda$MyDocumentPresenter$h8a7iFXIznVI9SAEfyFVQZCouS0 */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                MyDocumentPresenter.this.m35966c((MyDocumentPresenter) ((Throwable) obj));
            }
        }));
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
        if (document.mo32483t() == C8275a.f22370c.mo32555b()) {
            z = f23364b;
        } else {
            z = false;
        }
        boolean isShareFolder = FolderVersion.isShareFolder(document.an(), document.ap());
        Boolean valueOf = Boolean.valueOf(mo33308i());
        if (mo33308i()) {
            str = "middle";
        } else {
            str = "suspend_create";
        }
        ListAnalysis.m32523a("ccm_space_personal_page_click", "personal", a, "share", "ccm_permission_share_view", "", o, t, C, "", z, isShareFolder, false, 0, valueOf, str);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.BaseListPresenter
    public void a_(Document document) {
        C13479a.m54764b(mo32596c(), "responseDeleteClick()...");
        HashMap hashMap = new HashMap();
        hashMap.put("doc_name", C8292f.m34193g(this.f23067c, document));
        hashMap.put("doc_type", C8292f.m34129a(this.f23067c, document.mo32483t()));
        UDDialog build = ((BearUDCheckBoxDialogBuilder) ((BearUDCheckBoxDialogBuilder) ((BearUDCheckBoxDialogBuilder) ((BearUDCheckBoxDialogBuilder) ((BearUDCheckBoxDialogBuilder) ((BearUDCheckBoxDialogBuilder) ((BearUDCheckBoxDialogBuilder) ((BearUDCheckBoxDialogBuilder) new BearUDCheckBoxDialogBuilder(this.f23067c).title(C10539a.m43640a(this.f23067c, R.string.Doc_Contract_Remove_Owner_Document_Dialog_Title, hashMap))).titleSize(16)).titleGravity(8388611)).message(R.string.Doc_Contract_Remove_Owner_Document_Dialog_Content)).messageTextSize(14)).messageGravity(8388611)).mo45382b(false).addActionButton(new UDBaseDialogBuilder.ActionBuilder().mo90702a(R.id.ud_dialog_btn_primary).mo90710d(R.color.function_danger_500).mo90706b(R.string.Doc_Facade_Delete).mo90703a(new DialogInterface.OnClickListener(document) {
            /* class com.bytedance.ee.bear.list.mine.$$Lambda$MyDocumentPresenter$g4bNH1JbC8rBCvtbTlY8DXx0NbA */
            public final /* synthetic */ Document f$1;

            {
                this.f$1 = r2;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                MyDocumentPresenter.this.m35961a((MyDocumentPresenter) this.f$1, (Document) dialogInterface, (DialogInterface) i);
            }
        }))).addActionButton(R.id.ud_dialog_btn_secondary, R.string.Doc_Facade_Cancel, (DialogInterface.OnClickListener) null)).build();
        build.show();
        ((IWatermarkManager) KoinJavaComponent.m268610a(IWatermarkManager.class)).mo40652b(build);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ Boolean m35959a(String str, am amVar) throws Exception {
        amVar.delOfflineDoc(str, new DeleteDocCallback(this));
        return Boolean.valueOf((boolean) f23364b);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m35961a(Document document, DialogInterface dialogInterface, int i) {
        m35969e(document);
    }

    @Override // com.bytedance.ee.bear.list.list.AbstractC8544i.AbstractC8545a
    /* renamed from: a */
    public void mo32595a(Document document, int i, boolean z) {
        String c = mo32596c();
        C13479a.m54764b(c, "onItemClick()...doc = " + document.toString());
        C8292f.m34138a(this.f23069e.getActivity(), this.f23068d, document, mo33312n(), m35965c(document), mo32593a(), i, z);
        ListAnalysis.m32521a("ccm_space_personal_page_click", "personal", mo32593a(), "", "", document.mo32472o(), document.mo32483t(), document.mo32377C(), FolderVersion.isShareFolder(document.an(), document.ap()), false, 0);
    }

    @Override // com.bytedance.ee.bear.list.AbstractC8651p.AbstractC8654c
    /* renamed from: a */
    public void mo32653a(String str, String str2, String str3) {
        C13479a.m54764b(mo32596c(), "onMakeCopy()...");
        mo33313o();
    }

    MyDocumentPresenter(AbstractC8618g gVar, AbstractC8617f fVar, Context context, C10917c cVar, C7718l lVar) {
        super(gVar, fVar, context, cVar, lVar);
    }
}
