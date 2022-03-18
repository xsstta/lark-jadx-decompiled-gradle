package com.bytedance.ee.bear.list.share;

import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.aj;
import com.bytedance.ee.bear.contract.net.C5203d;
import com.bytedance.ee.bear.facade.common.C7718l;
import com.bytedance.ee.bear.facade.common.widget.Toast;
import com.bytedance.ee.bear.list.C8144c;
import com.bytedance.ee.bear.list.C8292f;
import com.bytedance.ee.bear.list.analysis.ListAnalysis;
import com.bytedance.ee.bear.list.cache.FolderSortStrategy;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.bear.list.dto.FolderVersion;
import com.bytedance.ee.bear.list.list.AbstractC8544i;
import com.bytedance.ee.bear.list.list.BaseListPresenter;
import com.bytedance.ee.bear.list.route.C8706f;
import com.bytedance.ee.bear.list.sort.C8786n;
import com.bytedance.ee.bear.route.RouteBean;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.bear.watermark.interfaces.IWatermarkManager;
import com.bytedance.ee.bear.widgets.dialog.checkboxdialog.BearUDCheckBoxDialogBuilder;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p702e.C13657b;
import com.larksuite.component.universe_design.dialog.UDBaseDialogBuilder;
import com.larksuite.component.universe_design.dialog.UDDialog;
import com.larksuite.suite.R;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.list.share.v */
public class C8748v extends BaseListPresenter<AbstractC8738m, AbstractC8739n, AbstractC8544i.AbstractC8545a> {

    /* renamed from: a */
    protected C8786n f23604a;

    /* renamed from: b */
    private Disposable f23605b;

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.BaseListPresenter
    /* renamed from: a */
    public String mo32593a() {
        return "sharetome";
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.BaseListPresenter
    /* renamed from: c */
    public String mo32596c() {
        return "ShareDocumentPresenter";
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.BaseListPresenter
    /* renamed from: m */
    public String mo32597m() {
        return "shared";
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.bytedance.ee.bear.list.list.BaseListPresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        m36747d();
        C13479a.m54764b("ShareDocumentPresenter", "create()...");
    }

    /* renamed from: d */
    private void m36747d() {
        if (this.f23069e.getActivity() == null) {
            C13479a.m54758a("ShareDocumentPresenter", "observeSortAndFilter()...activity is null");
            return;
        }
        if (this.f23604a == null) {
            this.f23604a = (C8786n) aj.m5366a(this.f23069e.getActivity()).mo6005a(C8786n.class);
        }
        this.f23604a.getSortStrategyLiveData().mo5923a(this.f23069e, new AbstractC1178x() {
            /* class com.bytedance.ee.bear.list.share.$$Lambda$v$0pUFHQt0VXRTW_IYjUM8uv3lgQ */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                C8748v.this.m36742a((C8748v) ((FolderSortStrategy) obj));
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.list.share.v$a */
    public static class C8749a implements C8144c.AbstractC8146a {

        /* renamed from: a */
        private WeakReference<C8748v> f23606a;

        C8749a(C8748v vVar) {
            this.f23606a = new WeakReference<>(vVar);
        }

        @Override // com.bytedance.ee.bear.list.C8144c.AbstractC8146a
        /* renamed from: a */
        public void mo31477a(String str) {
            WeakReference<C8748v> weakReference = this.f23606a;
            if (weakReference != null && weakReference.get() != null) {
                C13479a.m54764b("ShareDocumentPresenter", "RemoveItemCallback onSuccess()...");
                C8748v vVar = this.f23606a.get();
                ((AbstractC8738m) vVar.getModel()).mo33780a(str);
                ((AbstractC8739n) vVar.getView()).mo33342e(false);
                Toast.showSuccessText(vVar.f23067c, vVar.f23067c.getResources().getString(R.string.Doc_Facade_RemoveSuccessfullyToastTip), 0);
            }
        }

        @Override // com.bytedance.ee.bear.list.C8144c.AbstractC8146a
        /* renamed from: a */
        public void mo31478a(String str, Throwable th) {
            WeakReference<C8748v> weakReference = this.f23606a;
            if (weakReference != null && weakReference.get() != null) {
                C13479a.m54764b("ShareDocumentPresenter", "RemoveItemCallback onFail()...throwable = " + th);
                C8748v vVar = this.f23606a.get();
                ((AbstractC8739n) vVar.getView()).mo33342e(false);
                if (C5203d.m21235a(th, 4202)) {
                    Toast.showFailureText(vVar.f23067c, (int) R.string.CreationMobile_DataUpgrade_Locked_toast);
                } else {
                    Toast.showFailureText(vVar.f23067c, vVar.f23067c.getResources().getString(R.string.Doc_Facade_RemoveFailToastTip), 0);
                }
            }
        }
    }

    /* renamed from: c */
    private RouteBean m36745c(Document document) {
        return new C8706f(this.f23067c, document, mo32593a(), mo33311l(), "", "home").mo33741a();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m36742a(FolderSortStrategy folderSortStrategy) {
        if (folderSortStrategy != null && TextUtils.equals(folderSortStrategy.mo31545a(), "shared_file")) {
            Disposable disposable = this.f23605b;
            if (disposable != null && !disposable.isDisposed()) {
                this.f23605b.dispose();
            }
            this.f23605b = ((AbstractC8738m) getModel()).C_().mo237985a(C11678b.m48481e()).mo238001b(new Consumer() {
                /* class com.bytedance.ee.bear.list.share.$$Lambda$v$QOUqNxhgHdfSxfJxRqOvDma_rrI */

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    C8748v.this.m36744b((C8748v) ((ArrayList) obj));
                }
            }, $$Lambda$v$2FcFimZKakAlUWKls5G6Ud90UCQ.INSTANCE);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m36744b(ArrayList arrayList) throws Exception {
        C13479a.m54764b("ShareDocumentPresenter", "onFilterChanged()...getFilterDocuments success, size = " + C13657b.m55424c(arrayList));
        if (C13657b.m55423b(arrayList)) {
            ((AbstractC8739n) getView()).mo33334b(arrayList);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static /* synthetic */ void m36746c(Throwable th) throws Exception {
        C13479a.m54758a("ShareDocumentPresenter", "getFilterDocuments()...error = " + th);
    }

    /* renamed from: e */
    private void m36748e(Document document) {
        C13479a.m54764b(mo32596c(), "deleteItem()...");
        ((AbstractC8739n) getView()).mo33342e(true);
        new C8144c(this.f23068d).mo31476c(document.mo32472o(), new C8749a(this));
    }

    @Override // com.bytedance.ee.bear.list.list.AbstractC8544i.AbstractC8545a, com.bytedance.ee.bear.list.list.BaseListPresenter
    /* renamed from: a */
    public void mo32594a(Document document) {
        boolean z;
        super.mo32594a(document);
        String a = mo32593a();
        String o = document.mo32472o();
        int t = document.mo32483t();
        String C = document.mo32377C();
        if (document.mo32483t() == C8275a.f22370c.mo32555b()) {
            z = true;
        } else {
            z = false;
        }
        ListAnalysis.m32523a("ccm_space_shared_page_click", "shared", a, "share", "ccm_permission_share_view", "", o, t, C, "", z, FolderVersion.isShareFolder(document.an(), document.ap()), false, 0, Boolean.valueOf(mo33308i()), "suspend_create");
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.BaseListPresenter
    public void a_(Document document) {
        C13479a.m54764b(mo32596c(), "responseDeleteClick()...");
        UDDialog build = ((BearUDCheckBoxDialogBuilder) ((BearUDCheckBoxDialogBuilder) ((BearUDCheckBoxDialogBuilder) ((BearUDCheckBoxDialogBuilder) ((BearUDCheckBoxDialogBuilder) ((BearUDCheckBoxDialogBuilder) ((BearUDCheckBoxDialogBuilder) ((BearUDCheckBoxDialogBuilder) new BearUDCheckBoxDialogBuilder(this.f23067c).title(R.string.Doc_List_Remove_ShareToMe_Document_Dialog_Title)).titleSize(16)).titleGravity(8388611)).message(R.string.Doc_List_Remove_Shared_Record_Confirm)).messageTextSize(14)).messageGravity(8388611)).mo45382b(false).addActionButton(new UDBaseDialogBuilder.ActionBuilder().mo90702a(R.id.ud_dialog_btn_primary).mo90710d(R.color.function_danger_500).mo90706b(R.string.Doc_Facade_Delete).mo90703a(new DialogInterface.OnClickListener(document) {
            /* class com.bytedance.ee.bear.list.share.$$Lambda$v$vj1EiltxzrIwCIdF5t0Bv6Pc2y0 */
            public final /* synthetic */ Document f$1;

            {
                this.f$1 = r2;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                C8748v.this.m36743a((C8748v) this.f$1, (Document) dialogInterface, (DialogInterface) i);
            }
        }))).addActionButton(R.id.ud_dialog_btn_secondary, R.string.Doc_Facade_Cancel, (DialogInterface.OnClickListener) null)).build();
        build.show();
        ((IWatermarkManager) KoinJavaComponent.m268610a(IWatermarkManager.class)).mo40652b(build);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m36743a(Document document, DialogInterface dialogInterface, int i) {
        m36748e(document);
    }

    @Override // com.bytedance.ee.bear.list.list.AbstractC8544i.AbstractC8545a
    /* renamed from: a */
    public void mo32595a(Document document, int i, boolean z) {
        String c = mo32596c();
        C13479a.m54764b(c, "onItemClick()...doc = " + document.toString());
        C8292f.m34138a(this.f23069e.getActivity(), this.f23068d, document, mo33312n(), m36745c(document), mo32593a(), i, z);
        ListAnalysis.m32521a("ccm_space_shared_page_click", "shared", mo32593a(), "", "", document.mo32472o(), document.mo32483t(), document.mo32377C(), FolderVersion.isShareFolder(document.an(), document.ap()), false, 0);
    }

    C8748v(AbstractC8739n nVar, AbstractC8738m mVar, Context context, C10917c cVar, C7718l lVar) {
        super(nVar, mVar, context, cVar, lVar);
    }
}
