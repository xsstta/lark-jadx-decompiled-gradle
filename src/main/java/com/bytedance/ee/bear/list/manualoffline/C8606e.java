package com.bytedance.ee.bear.list.manualoffline;

import android.content.Context;
import android.content.DialogInterface;
import com.bytedance.ee.bear.facade.common.C7718l;
import com.bytedance.ee.bear.list.C8292f;
import com.bytedance.ee.bear.list.C8674q;
import com.bytedance.ee.bear.list.analysis.ListAnalysis;
import com.bytedance.ee.bear.list.cache.C8153a;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.bear.list.dto.FolderVersion;
import com.bytedance.ee.bear.list.list.AbstractC8542h;
import com.bytedance.ee.bear.list.list.AbstractC8544i;
import com.bytedance.ee.bear.list.list.BaseListPresenter;
import com.bytedance.ee.bear.list.route.C8706f;
import com.bytedance.ee.bear.route.RouteBean;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.bear.watermark.interfaces.IWatermarkManager;
import com.bytedance.ee.bear.widgets.dialog.checkboxdialog.BearUDCheckBoxDialogBuilder;
import com.bytedance.ee.log.C13479a;
import com.larksuite.component.universe_design.dialog.UDBaseDialogBuilder;
import com.larksuite.component.universe_design.dialog.UDDialog;
import com.larksuite.suite.R;
import io.reactivex.AbstractC68307f;
import io.reactivex.functions.Consumer;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.list.manualoffline.e */
public class C8606e extends BaseListPresenter<AbstractC8542h, AbstractC8601b, AbstractC8544i.AbstractC8545a> {
    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.BaseListPresenter
    /* renamed from: a */
    public String mo32593a() {
        return "offline";
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.BaseListPresenter
    /* renamed from: c */
    public String mo32596c() {
        return "ManualOfflineDocumentPresenter";
    }

    /* renamed from: c */
    private RouteBean m35922c(Document document) {
        return new C8706f(this.f23067c, document, mo32593a(), mo33311l(), "", "home").mo33741a();
    }

    @Override // com.bytedance.ee.bear.list.list.BaseListPresenter
    /* renamed from: a */
    private void m35920a(String str) {
        C13479a.m54764b(mo32596c(), "deleteItem()...");
        this.f23075k.mo237937a(AbstractC68307f.m265083a(str).mo237985a(C11678b.m48479c()).mo238001b(new Consumer(str) {
            /* class com.bytedance.ee.bear.list.manualoffline.$$Lambda$e$K_3PPL6wsn6afr4ZjmguE5BAJV4 */
            public final /* synthetic */ String f$1;

            {
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C8606e.this.m35921a((C8606e) this.f$1, (String) obj);
            }
        }, new Consumer() {
            /* class com.bytedance.ee.bear.list.manualoffline.$$Lambda$e$pzN_qrzUnDrY1fFx7KhwYZKn6E */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C8606e.this.m35923c((C8606e) ((Throwable) obj));
            }
        }));
    }

    /* access modifiers changed from: private */
    @Override // com.bytedance.ee.bear.list.list.BaseListPresenter
    /* renamed from: c */
    public /* synthetic */ void m35923c(Throwable th) throws Exception {
        String c = mo32596c();
        C13479a.m54758a(c, "delete Doc failed:" + th);
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
        ListAnalysis.m32523a("ccm_space_offline_page_click", a, "", "share", "ccm_permission_share_view", "", o, t, C, "", z, FolderVersion.isShareFolder(document.an(), document.ap()), false, 0, Boolean.valueOf(mo33308i()), "suspend_create");
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.BaseListPresenter
    public void a_(Document document) {
        C13479a.m54764b(mo32596c(), "responseDeleteClick()...");
        String string = this.f23067c.getString(R.string.Doc_List_OfflineRemoveTitle);
        UDDialog build = ((BearUDCheckBoxDialogBuilder) ((BearUDCheckBoxDialogBuilder) ((BearUDCheckBoxDialogBuilder) ((BearUDCheckBoxDialogBuilder) ((BearUDCheckBoxDialogBuilder) ((BearUDCheckBoxDialogBuilder) ((BearUDCheckBoxDialogBuilder) ((BearUDCheckBoxDialogBuilder) new BearUDCheckBoxDialogBuilder(this.f23067c).title(string)).titleSize(16)).titleGravity(8388611)).message(this.f23067c.getString(R.string.Doc_List_OfflineRemoveContent))).messageTextSize(14)).messageGravity(8388611)).mo45382b(false).addActionButton(new UDBaseDialogBuilder.ActionBuilder().mo90702a(R.id.ud_dialog_btn_primary).mo90710d(R.color.function_danger_500).mo90706b(R.string.Doc_Facade_Delete).mo90703a(new DialogInterface.OnClickListener(document) {
            /* class com.bytedance.ee.bear.list.manualoffline.$$Lambda$e$HB5MqDTkhk8Kn2sEgF5m4rIUgc0 */
            public final /* synthetic */ Document f$1;

            {
                this.f$1 = r2;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                C8606e.this.m35919a((C8606e) this.f$1, (Document) dialogInterface, (DialogInterface) i);
            }
        }))).addActionButton(R.id.ud_dialog_btn_secondary, R.string.Doc_Facade_Cancel, (DialogInterface.OnClickListener) null)).build();
        build.show();
        ((IWatermarkManager) KoinJavaComponent.m268610a(IWatermarkManager.class)).mo40652b(build);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m35921a(String str, String str2) throws Exception {
        C13479a.m54764b(mo32596c(), "deleteItem()...success");
        C8153a.m32844b().mo31594b(7, str);
        C8674q.m36243f().mo33644a(str, 0);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m35919a(Document document, DialogInterface dialogInterface, int i) {
        m35920a(document.mo32472o());
    }

    @Override // com.bytedance.ee.bear.list.list.AbstractC8544i.AbstractC8545a
    /* renamed from: a */
    public void mo32595a(Document document, int i, boolean z) {
        String c = mo32596c();
        C13479a.m54764b(c, "onItemClick()...doc = " + document.toString());
        C8292f.m34138a(this.f23069e.getActivity(), this.f23068d, document, mo33312n(), m35922c(document), mo32593a(), i, z);
        ListAnalysis.m32521a("ccm_space_offline_page_click", mo32593a(), "", "", "", document.mo32472o(), document.mo32483t(), document.mo32377C(), FolderVersion.isShareFolder(document.an(), document.ap()), false, 0);
    }

    C8606e(AbstractC8601b bVar, AbstractC8542h hVar, Context context, C10917c cVar, C7718l lVar) {
        super(bVar, hVar, context, cVar, lVar);
    }
}
