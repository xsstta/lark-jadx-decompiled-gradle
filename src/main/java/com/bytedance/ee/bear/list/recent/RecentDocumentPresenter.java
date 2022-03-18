package com.bytedance.ee.bear.list.recent;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.C1144ai;
import com.bytedance.ee.bear.contract.BinderIDeleteDocCallback;
import com.bytedance.ee.bear.contract.am;
import com.bytedance.ee.bear.contract.net.C5203d;
import com.bytedance.ee.bear.document.AbstractC6158t;
import com.bytedance.ee.bear.facade.common.C7718l;
import com.bytedance.ee.bear.facade.common.widget.Toast;
import com.bytedance.ee.bear.list.AbstractC8651p;
import com.bytedance.ee.bear.list.C8144c;
import com.bytedance.ee.bear.list.C8256d;
import com.bytedance.ee.bear.list.C8292f;
import com.bytedance.ee.bear.list.analysis.ListAnalysis;
import com.bytedance.ee.bear.list.cache.FolderSortStrategy;
import com.bytedance.ee.bear.list.config.SpaceFeatureGatingV2;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.bear.list.dto.FolderVersion;
import com.bytedance.ee.bear.list.list.AbstractC8544i;
import com.bytedance.ee.bear.list.list.BaseListPresenter;
import com.bytedance.ee.bear.list.list.C8533d;
import com.bytedance.ee.bear.list.p422a.C8143b;
import com.bytedance.ee.bear.list.preload.C8672e;
import com.bytedance.ee.bear.list.recent.RecentDocumentPresenter;
import com.bytedance.ee.bear.list.route.C8706f;
import com.bytedance.ee.bear.list.sort.C8786n;
import com.bytedance.ee.bear.route.RouteBean;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.thread.BearExecutors;
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
import org.koin.java.KoinJavaComponent;

public class RecentDocumentPresenter extends BaseListPresenter<AbstractC8679a, AbstractC8680b, AbstractC8544i.AbstractC8545a> implements AbstractC8651p.AbstractC8654c {

    /* renamed from: a */
    protected C8786n f23489a;

    /* renamed from: b */
    private final C8533d f23490b = new C8533d();

    /* renamed from: n */
    private Disposable f23491n;

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m36264a(Boolean bool) throws Exception {
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.BaseListPresenter
    /* renamed from: a */
    public String mo32593a() {
        return "recent";
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.BaseListPresenter
    /* renamed from: c */
    public String mo32596c() {
        return "RecentDocumentPresenter";
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.BaseListPresenter
    /* renamed from: m */
    public String mo32597m() {
        return "home";
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public /* synthetic */ void m36272f() {
        if (this.f23489a != null) {
            this.f23489a = null;
        }
        m36270e();
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.bytedance.ee.bear.list.list.BaseListPresenter, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        Disposable disposable = this.f23491n;
        if (disposable != null) {
            disposable.dispose();
        }
        super.destroy();
    }

    /* access modifiers changed from: private */
    public static class DeleteDocCallback extends BinderIDeleteDocCallback.Stub {
        private final WeakReference<RecentDocumentPresenter> presenterRef;

        public /* synthetic */ void lambda$onPreExecute$0$RecentDocumentPresenter$DeleteDocCallback() {
            ((AbstractC8680b) this.presenterRef.get().getView()).mo33342e(true);
        }

        @Override // com.bytedance.ee.bear.contract.am.AbstractC5108a
        public void onPostExecuteSuccess() {
            C13479a.m54764b("RecentDocumentPresenter", "onPostExecuteSuccess()...");
            WeakReference<RecentDocumentPresenter> weakReference = this.presenterRef;
            if (weakReference != null && weakReference.get() != null) {
                C13748k.m55732a(new Runnable() {
                    /* class com.bytedance.ee.bear.list.recent.$$Lambda$RecentDocumentPresenter$DeleteDocCallback$qTZoDN2gohSuG6ML62Tp1qtoIzU */

                    public final void run() {
                        RecentDocumentPresenter.DeleteDocCallback.this.lambda$onPostExecuteSuccess$2$RecentDocumentPresenter$DeleteDocCallback();
                    }
                });
            }
        }

        @Override // com.bytedance.ee.bear.contract.am.AbstractC5108a
        public void onPreExecute() {
            C13479a.m54764b("RecentDocumentPresenter", "onPreExecute()...");
            WeakReference<RecentDocumentPresenter> weakReference = this.presenterRef;
            if (weakReference != null && weakReference.get() != null) {
                C13748k.m55732a(new Runnable() {
                    /* class com.bytedance.ee.bear.list.recent.$$Lambda$RecentDocumentPresenter$DeleteDocCallback$64Bk9qPaS2Z7Eio7pCV5I5eRbY0 */

                    public final void run() {
                        RecentDocumentPresenter.DeleteDocCallback.this.lambda$onPreExecute$0$RecentDocumentPresenter$DeleteDocCallback();
                    }
                });
            }
        }

        public /* synthetic */ void lambda$onOfflinePostExecute$1$RecentDocumentPresenter$DeleteDocCallback() {
            RecentDocumentPresenter recentDocumentPresenter = this.presenterRef.get();
            ((AbstractC8680b) recentDocumentPresenter.getView()).mo33342e(false);
            Toast.showSuccessText(recentDocumentPresenter.f23067c, recentDocumentPresenter.f23067c.getResources().getString(R.string.Doc_Facade_DeleteSuccessfullyToastTip), 0);
        }

        public /* synthetic */ void lambda$onPostExecuteSuccess$2$RecentDocumentPresenter$DeleteDocCallback() {
            RecentDocumentPresenter recentDocumentPresenter = this.presenterRef.get();
            ((AbstractC8680b) recentDocumentPresenter.getView()).mo33342e(false);
            Toast.showSuccessText(recentDocumentPresenter.f23067c, recentDocumentPresenter.f23067c.getResources().getString(R.string.Doc_Facade_DeleteSuccessfullyToastTip), 0);
        }

        DeleteDocCallback(RecentDocumentPresenter recentDocumentPresenter) {
            this.presenterRef = new WeakReference<>(recentDocumentPresenter);
        }

        @Override // com.bytedance.ee.bear.contract.am.AbstractC5108a
        public void onPostExecuteFail(int i) {
            C13479a.m54764b("RecentDocumentPresenter", "onPostExecuteFail()...");
            WeakReference<RecentDocumentPresenter> weakReference = this.presenterRef;
            if (weakReference != null && weakReference.get() != null) {
                C13748k.m55732a(new Runnable(i) {
                    /* class com.bytedance.ee.bear.list.recent.$$Lambda$RecentDocumentPresenter$DeleteDocCallback$IM6d_Uyoz88AvqAkzZMYFT6tBE */
                    public final /* synthetic */ int f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void run() {
                        RecentDocumentPresenter.DeleteDocCallback.this.lambda$onPostExecuteFail$3$RecentDocumentPresenter$DeleteDocCallback(this.f$1);
                    }
                });
            }
        }

        public /* synthetic */ void lambda$onPostExecuteFail$3$RecentDocumentPresenter$DeleteDocCallback(int i) {
            RecentDocumentPresenter recentDocumentPresenter = this.presenterRef.get();
            ((AbstractC8680b) recentDocumentPresenter.getView()).mo33342e(false);
            if (i == 4202) {
                Toast.showFailureText(recentDocumentPresenter.f23067c, (int) R.string.CreationMobile_DataUpgrade_Locked_toast);
            } else {
                Toast.showFailureText(recentDocumentPresenter.f23067c, recentDocumentPresenter.f23067c.getResources().getString(R.string.Doc_Facade_DeleteFailToastTip), 0);
            }
        }

        @Override // com.bytedance.ee.bear.contract.am.AbstractC5108a
        public void onOfflinePostExecute(boolean z) {
            C13479a.m54764b("RecentDocumentPresenter", "onOfflinePostExecute()...success = " + z);
            WeakReference<RecentDocumentPresenter> weakReference = this.presenterRef;
            if (weakReference != null && weakReference.get() != null) {
                C13748k.m55732a(new Runnable() {
                    /* class com.bytedance.ee.bear.list.recent.$$Lambda$RecentDocumentPresenter$DeleteDocCallback$QqNAgeR7UplRm6Vr5lbimUAb4o */

                    public final void run() {
                        RecentDocumentPresenter.DeleteDocCallback.this.lambda$onOfflinePostExecute$1$RecentDocumentPresenter$DeleteDocCallback();
                    }
                });
            }
        }
    }

    @Override // com.bytedance.ee.bear.list.list.BaseListPresenter, com.bytedance.ee.bear.list.AbstractC8651p.AbstractC8661j
    /* renamed from: b */
    public void mo33101b() {
        super.mo33101b();
        BearExecutors.m48468c().execute(new Runnable() {
            /* class com.bytedance.ee.bear.list.recent.$$Lambda$RecentDocumentPresenter$Qn399sBD9GJFeaztTNwsamEq8k */

            public final void run() {
                RecentDocumentPresenter.this.m36272f();
            }
        });
        C13479a.m54764b("RecentDocumentPresenter", "onTenantChanged()...");
    }

    /* renamed from: e */
    private void m36270e() {
        if (this.f23069e.getActivity() == null) {
            C13479a.m54758a("RecentDocumentPresenter", "observeSortAndFilter()...activity is null");
            return;
        }
        if (this.f23489a == null) {
            this.f23489a = (C8786n) new C1144ai(this.f23069e.getActivity()).mo6005a(C8786n.class);
        }
        this.f23489a.getSortStrategyLiveData().mo5923a(this.f23069e, new AbstractC1178x() {
            /* class com.bytedance.ee.bear.list.recent.$$Lambda$xZ_2Nqf773kNp58nv3JG_Xu0fOg */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                RecentDocumentPresenter.this.mo33693a((FolderSortStrategy) obj);
            }
        });
    }

    /* renamed from: d */
    public void mo32660d() {
        if (C13657b.m55421a(((AbstractC8680b) getView()).mo33351w()) && ((AbstractC8679a) getModel()).mo33363s()) {
            ((AbstractC8679a) getModel()).mo33359o();
        }
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.bytedance.ee.bear.list.list.BaseListPresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        ArrayList<Document> b = C8672e.m36232a(this.f23067c).mo33679b();
        if (C13657b.m55423b(b)) {
            C13479a.m54764b("RecentDocumentPresenter", "show preload list");
            C8143b.m32605a().mo31469b(true);
            ((AbstractC8680b) getView()).mo32744a(b.size());
            ((AbstractC8680b) getView()).mo33334b(b);
        }
        m36270e();
        C13479a.m54764b("RecentDocumentPresenter", "create()...");
    }

    /* access modifiers changed from: private */
    @Override // com.bytedance.ee.bear.list.list.BaseListPresenter
    /* renamed from: c */
    public /* synthetic */ void m36268c(Throwable th) throws Exception {
        C13479a.m54761a(mo32596c(), th);
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.list.recent.RecentDocumentPresenter$a */
    public static class C8678a implements C8144c.AbstractC8146a {

        /* renamed from: a */
        private final WeakReference<RecentDocumentPresenter> f23492a;

        C8678a(RecentDocumentPresenter recentDocumentPresenter) {
            this.f23492a = new WeakReference<>(recentDocumentPresenter);
        }

        @Override // com.bytedance.ee.bear.list.C8144c.AbstractC8146a
        /* renamed from: a */
        public void mo31477a(String str) {
            if (this.f23492a.get() != null) {
                RecentDocumentPresenter recentDocumentPresenter = this.f23492a.get();
                ((AbstractC8679a) recentDocumentPresenter.getModel()).mo33705a(str);
                ((AbstractC8680b) recentDocumentPresenter.getView()).mo33342e(false);
                Toast.showSuccessText(recentDocumentPresenter.f23067c, recentDocumentPresenter.f23067c.getResources().getString(R.string.Doc_Facade_RemoveSuccessfullyToastTip), 0);
                recentDocumentPresenter.mo32660d();
            }
        }

        @Override // com.bytedance.ee.bear.list.C8144c.AbstractC8146a
        /* renamed from: a */
        public void mo31478a(String str, Throwable th) {
            if (this.f23492a.get() != null) {
                RecentDocumentPresenter recentDocumentPresenter = this.f23492a.get();
                ((AbstractC8680b) recentDocumentPresenter.getView()).mo33342e(false);
                if (C5203d.m21235a(th, 4202)) {
                    Toast.showFailureText(recentDocumentPresenter.f23067c, (int) R.string.CreationMobile_DataUpgrade_Locked_toast);
                } else {
                    Toast.showFailureText(recentDocumentPresenter.f23067c, recentDocumentPresenter.f23067c.getResources().getString(R.string.Doc_Facade_RemoveFailToastTip), 0);
                }
            }
        }
    }

    /* renamed from: e */
    private void m36271e(Document document) {
        if (this.f23490b.mo33365b()) {
            m36274g(document);
        } else {
            m36273f(document);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static /* synthetic */ void m36269d(Throwable th) throws Exception {
        C13479a.m54758a("RecentDocumentPresenter", "getFilterDocuments()...error = " + th);
    }

    /* renamed from: f */
    private void m36273f(Document document) {
        ((AbstractC8680b) getView()).mo33342e(true);
        new C8144c(this.f23068d).mo31473a(document.mo32472o(), new C8678a(this));
    }

    /* renamed from: g */
    private void m36274g(Document document) {
        if (((AbstractC6158t) KoinJavaComponent.m268610a(AbstractC6158t.class)).mo20317a(document.mo32472o())) {
            m36265a(document.mo32472o());
        } else {
            m36275h(document);
        }
    }

    /* renamed from: h */
    private void m36275h(Document document) {
        new C8144c(this.f23068d).mo31472a(document.mo32472o(), document.mo32483t(), document.an(), new DeleteDocCallback(this));
    }

    @Override // com.bytedance.ee.bear.list.list.BaseListPresenter
    /* renamed from: a */
    private void m36265a(String str) {
        this.f23075k.mo237937a(this.f23068d.mo41508c(am.class).mo238020d(new Function(str) {
            /* class com.bytedance.ee.bear.list.recent.$$Lambda$RecentDocumentPresenter$Sncr7irVP8n3Vn2qPB_2sIwXTUs */
            public final /* synthetic */ String f$1;

            {
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return RecentDocumentPresenter.this.m36262a(this.f$1, (am) obj);
            }
        }).mo238001b($$Lambda$RecentDocumentPresenter$mVJudA2tAPmqUAUltNwYm7h3FxQ.INSTANCE, new Consumer() {
            /* class com.bytedance.ee.bear.list.recent.$$Lambda$RecentDocumentPresenter$K8VQgzjYBGx38juqQwdrkbMtciQ */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                RecentDocumentPresenter.this.m36268c((RecentDocumentPresenter) ((Throwable) obj));
            }
        }));
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m36266b(ArrayList arrayList) throws Exception {
        C13479a.m54764b("RecentDocumentPresenter", "onFilterChanged()...getFilterDocuments success, size = " + C13657b.m55424c(arrayList));
        if (C13657b.m55423b(arrayList)) {
            ((AbstractC8680b) getView()).mo32744a(arrayList.size());
            ((AbstractC8680b) getView()).mo33334b(arrayList);
        }
    }

    /* renamed from: c */
    private RouteBean m36267c(Document document) {
        RouteBean a = new C8706f(this.f23067c, document, "home", mo33311l(), mo32593a(), "").mo33741a();
        Bundle bundle = new Bundle();
        bundle.putString("wiki_version", document.al());
        a.mo40613b(bundle);
        return a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo33693a(FolderSortStrategy folderSortStrategy) {
        if (folderSortStrategy != null && TextUtils.equals(folderSortStrategy.mo31545a(), "recent")) {
            Disposable disposable = this.f23491n;
            if (disposable != null && !disposable.isDisposed()) {
                this.f23491n.dispose();
            }
            this.f23491n = ((AbstractC8679a) getModel()).B_().mo237985a(C11678b.m48481e()).mo238001b(new Consumer() {
                /* class com.bytedance.ee.bear.list.recent.$$Lambda$RecentDocumentPresenter$Mq9IHPS4KcNn7dDdzRGaO68uZ7I */

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    RecentDocumentPresenter.this.m36266b((RecentDocumentPresenter) ((ArrayList) obj));
                }
            }, $$Lambda$RecentDocumentPresenter$X95DLMHMcg5uj9yYNs07SlvYHPQ.INSTANCE);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.BaseListPresenter
    public void a_(Document document) {
        String str;
        boolean z;
        this.f23490b.mo33364a();
        String k = document.mo32457k();
        if (this.f23074j == null) {
            str = "";
        } else {
            str = this.f23074j.f14584a;
        }
        if (!TextUtils.equals(k, str) || document.mo32483t() == C8275a.f22377j.mo32555b() || SpaceFeatureGatingV2.m32622a()) {
            z = false;
        } else {
            z = true;
        }
        UDDialog build = ((BearUDCheckBoxDialogBuilder) ((BearUDCheckBoxDialogBuilder) ((BearUDCheckBoxDialogBuilder) ((BearUDCheckBoxDialogBuilder) ((BearUDCheckBoxDialogBuilder) ((BearUDCheckBoxDialogBuilder) ((BearUDCheckBoxDialogBuilder) ((BearUDCheckBoxDialogBuilder) new BearUDCheckBoxDialogBuilder(this.f23067c).title(R.string.Doc_List_Remove_Recent_Dialog_Title)).titleSize(16)).titleGravity(8388611)).message(R.string.Doc_List_Remove_Recent_Dialog_Content)).messageTextSize(14)).messageGravity(8388611)).mo45382b(z).mo45379a(this.f23067c.getString(R.string.Doc_List_Delete_Source_Item)).mo45378a(this.f23490b).addActionButton(new UDBaseDialogBuilder.ActionBuilder().mo90702a(R.id.ud_dialog_btn_primary).mo90710d(R.color.function_danger_500).mo90706b(R.string.Doc_Facade_Delete).mo90703a(new DialogInterface.OnClickListener(document) {
            /* class com.bytedance.ee.bear.list.recent.$$Lambda$RecentDocumentPresenter$d8QUeZ8iEsmp0NvINfGBk4uiX8 */
            public final /* synthetic */ Document f$1;

            {
                this.f$1 = r2;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                RecentDocumentPresenter.this.m36263a((RecentDocumentPresenter) this.f$1, (Document) dialogInterface, (DialogInterface) i);
            }
        }))).addActionButton(R.id.ud_dialog_btn_secondary, R.string.Doc_Facade_Cancel, (DialogInterface.OnClickListener) null)).build();
        build.show();
        ((IWatermarkManager) KoinJavaComponent.m268610a(IWatermarkManager.class)).mo40652b(build);
    }

    @Override // com.bytedance.ee.bear.list.list.AbstractC8544i.AbstractC8545a, com.bytedance.ee.bear.list.list.BaseListPresenter
    /* renamed from: a */
    public void mo32594a(Document document) {
        String str;
        super.mo32594a(document);
        String a = mo32593a();
        String a2 = mo32593a();
        String o = document.mo32472o();
        int t = document.mo32483t();
        String C = document.mo32377C();
        Boolean valueOf = Boolean.valueOf(mo33308i());
        if (mo33308i()) {
            str = "middle";
        } else {
            str = "suspend_create";
        }
        ListAnalysis.m32520a("home", a, "share", "ccm_permission_share_view", a2, o, t, C, valueOf, str);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ Boolean m36262a(String str, am amVar) throws Exception {
        amVar.delOfflineDoc(str, new DeleteDocCallback(this));
        return true;
    }

    @Override // com.bytedance.ee.bear.list.list.BaseListPresenter, com.bytedance.ee.bear.list.list.AbstractC8542h.AbstractC8543a
    /* renamed from: a */
    public void mo32648a(int i, boolean z) {
        super.mo32648a(i, z);
        C8256d.m33894a(this.f23068d, (ArrayList) ((AbstractC8680b) getView()).mo33351w());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m36263a(Document document, DialogInterface dialogInterface, int i) {
        m36271e(document);
    }

    @Override // com.bytedance.ee.bear.list.list.AbstractC8544i.AbstractC8545a
    /* renamed from: a */
    public void mo32595a(Document document, int i, boolean z) {
        String c = mo32596c();
        C13479a.m54764b(c, "onItemClick()...doc = " + document.toString());
        C8292f.m34138a(this.f23069e.getActivity(), this.f23068d, document, mo33312n(), m36267c(document), mo32593a(), i, z);
        ListAnalysis.m32521a("ccm_space_home_page_click", "home", mo32593a(), mo32593a(), "", document.mo32472o(), document.mo32483t(), document.mo32377C(), FolderVersion.isShareFolder(document.an(), document.ap()), false, 0);
    }

    @Override // com.bytedance.ee.bear.list.AbstractC8651p.AbstractC8654c
    /* renamed from: a */
    public void mo32653a(String str, String str2, String str3) {
        mo33313o();
    }

    RecentDocumentPresenter(AbstractC8680b bVar, AbstractC8679a aVar, Context context, C10917c cVar, C7718l lVar) {
        super(bVar, aVar, context, cVar, lVar);
    }
}
