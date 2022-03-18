package com.bytedance.ee.bear.list.share;

import android.content.Context;
import android.content.DialogInterface;
import com.bytedance.ee.bear.contract.net.C5203d;
import com.bytedance.ee.bear.facade.common.C7718l;
import com.bytedance.ee.bear.facade.common.widget.Toast;
import com.bytedance.ee.bear.list.AbstractC8651p;
import com.bytedance.ee.bear.list.C8144c;
import com.bytedance.ee.bear.list.C8292f;
import com.bytedance.ee.bear.list.analysis.ListAnalysis;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.bear.list.dto.FolderVersion;
import com.bytedance.ee.bear.list.list.BaseListPresenter;
import com.bytedance.ee.bear.list.route.C8706f;
import com.bytedance.ee.bear.list.share.AbstractC8741p;
import com.bytedance.ee.bear.p522q.C10539a;
import com.bytedance.ee.bear.route.RouteBean;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.watermark.interfaces.IWatermarkManager;
import com.bytedance.ee.bear.widgets.dialog.checkboxdialog.BearUDCheckBoxDialogBuilder;
import com.bytedance.ee.log.C13479a;
import com.larksuite.component.universe_design.dialog.UDBaseDialogBuilder;
import com.larksuite.component.universe_design.dialog.UDDialog;
import com.larksuite.suite.R;
import java.lang.ref.WeakReference;
import org.koin.java.KoinJavaComponent;

public class aj extends BaseListPresenter<AbstractC8740o, AbstractC8741p, AbstractC8741p.AbstractC8742a> implements AbstractC8651p.AbstractC8658g, AbstractC8741p.AbstractC8742a {
    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.BaseListPresenter
    /* renamed from: a */
    public String mo32593a() {
        return "shared_folder_root";
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.BaseListPresenter
    /* renamed from: c */
    public String mo32596c() {
        return "ShareFolderPresenter";
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.bytedance.ee.bear.list.list.BaseListPresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        C13479a.m54764b("ShareFolderPresenter", "create()...");
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.list.share.aj$a */
    public static class C8717a implements C8144c.AbstractC8146a {

        /* renamed from: a */
        private final WeakReference<aj> f23563a;

        C8717a(aj ajVar) {
            this.f23563a = new WeakReference<>(ajVar);
        }

        @Override // com.bytedance.ee.bear.list.C8144c.AbstractC8146a
        /* renamed from: a */
        public void mo31477a(String str) {
            if (this.f23563a.get() != null) {
                C13479a.m54764b("ShareFolderPresenter", "RemoveItemCallback onSuccess()...");
                aj ajVar = this.f23563a.get();
                ((AbstractC8740o) ajVar.getModel()).mo33767a(str);
                ((AbstractC8741p) ajVar.getView()).mo33342e(false);
                Toast.showSuccessText(ajVar.f23067c, ajVar.f23067c.getResources().getString(R.string.Doc_Facade_RemoveSuccessfullyToastTip), 0);
            }
        }

        @Override // com.bytedance.ee.bear.list.C8144c.AbstractC8146a
        /* renamed from: a */
        public void mo31478a(String str, Throwable th) {
            if (this.f23563a.get() != null) {
                C13479a.m54764b("ShareFolderPresenter", "RemoveItemCallback onFail()... throwable = " + th);
                aj ajVar = this.f23563a.get();
                ((AbstractC8741p) ajVar.getView()).mo33342e(false);
                if (C5203d.m21235a(th, 4202)) {
                    Toast.showFailureText(ajVar.f23067c, (int) R.string.CreationMobile_DataUpgrade_Locked_toast);
                } else {
                    Toast.showFailureText(ajVar.f23067c, ajVar.f23067c.getResources().getString(R.string.Doc_Facade_RemoveFailToastTip), 0);
                }
            }
        }
    }

    /* renamed from: e */
    private RouteBean m36503e(Document document) {
        return new C8706f(this.f23067c, document, mo32593a(), mo33311l(), "", "", 0, document.mo32472o()).mo33741a();
    }

    @Override // com.bytedance.ee.bear.list.share.AbstractC8741p.AbstractC8742a
    /* renamed from: c */
    public void mo32659c(Document document) {
        C13479a.m54764b(mo32596c(), "onStarClick()...");
        C8292f.m34170b(this.f23068d, document, mo32593a(), mo33318t());
    }

    /* renamed from: f */
    private void m36504f(Document document) {
        C13479a.m54764b(mo32596c(), "removeItem()...");
        ((AbstractC8741p) getView()).mo33342e(true);
        new C8144c(this.f23068d).mo31475b(document.mo32475p(), new C8717a(this));
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
        ListAnalysis.m32523a("ccm_space_folder_click", a, "", "share", "ccm_permission_share_view", "", o, t, C, "", z, FolderVersion.isShareFolder(document.an(), document.ap()), false, 0, Boolean.valueOf(mo33308i()), "suspend_create");
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.BaseListPresenter
    public void a_(Document document) {
        C13479a.m54764b(mo32596c(), "responseDeleteClick()...");
        UDDialog build = ((BearUDCheckBoxDialogBuilder) ((BearUDCheckBoxDialogBuilder) ((BearUDCheckBoxDialogBuilder) ((BearUDCheckBoxDialogBuilder) ((BearUDCheckBoxDialogBuilder) ((BearUDCheckBoxDialogBuilder) ((BearUDCheckBoxDialogBuilder) ((BearUDCheckBoxDialogBuilder) new BearUDCheckBoxDialogBuilder(this.f23067c).title(C10539a.m43639a(this.f23067c, R.string.Doc_List_Remove_Folder, "folder_name", C8292f.m34193g(this.f23067c, document)))).titleSize(16)).titleGravity(8388611)).message(R.string.Doc_List_Remove_Folder_Confirm)).messageTextSize(14)).messageGravity(8388611)).mo45382b(false).addActionButton(new UDBaseDialogBuilder.ActionBuilder().mo90702a(R.id.ud_dialog_btn_primary).mo90710d(R.color.function_danger_500).mo90706b(R.string.Doc_Facade_Delete).mo90703a(new DialogInterface.OnClickListener(document) {
            /* class com.bytedance.ee.bear.list.share.$$Lambda$aj$yrvRCV0OsKD3t5MGWwYP_4uv_K8 */
            public final /* synthetic */ Document f$1;

            {
                this.f$1 = r2;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                aj.this.m36502a((aj) this.f$1, (Document) dialogInterface, (DialogInterface) i);
            }
        }))).addActionButton(R.id.ud_dialog_btn_secondary, R.string.Doc_Facade_Cancel, (DialogInterface.OnClickListener) null)).build();
        build.show();
        ((IWatermarkManager) KoinJavaComponent.m268610a(IWatermarkManager.class)).mo40652b(build);
    }

    @Override // com.bytedance.ee.bear.list.AbstractC8651p.AbstractC8658g
    public void a_(String str, boolean z) {
        mo33313o();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m36502a(Document document, DialogInterface dialogInterface, int i) {
        m36504f(document);
    }

    @Override // com.bytedance.ee.bear.list.list.AbstractC8544i.AbstractC8545a
    /* renamed from: a */
    public void mo32595a(Document document, int i, boolean z) {
        String c = mo32596c();
        C13479a.m54764b(c, "onItemClick()...doc = " + document.toString());
        C8292f.m34138a(this.f23069e.getActivity(), this.f23068d, document, mo33312n(), m36503e(document), mo32593a(), i, z);
        ((AbstractC8740o) getModel()).mo33768a(document.mo32472o(), true);
        ListAnalysis.m32521a("ccm_space_folder_click", mo32593a(), "", "", "", document.mo32472o(), document.mo32483t(), document.mo32377C(), FolderVersion.isShareFolder(document.an(), document.ap()), false, 0);
    }

    aj(AbstractC8741p pVar, AbstractC8740o oVar, Context context, C10917c cVar, C7718l lVar) {
        super(pVar, oVar, context, cVar, lVar);
    }
}
