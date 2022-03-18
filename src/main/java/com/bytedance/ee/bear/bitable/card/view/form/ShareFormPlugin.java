package com.bytedance.ee.bear.bitable.card.view.form;

import androidx.fragment.app.DialogInterface$OnCancelListenerC1021b;
import com.bytedance.ee.bear.bitable.card.view.form.ShareFormPlugin;
import com.bytedance.ee.bear.browser.C4933k;
import com.bytedance.ee.bear.browser.plugin.AbstractC4958n;
import com.bytedance.ee.bear.document.C6095s;
import com.bytedance.ee.bear.document.DocumentPlugin;
import com.bytedance.ee.bear.jsbridge.AbstractC7945d;
import com.bytedance.ee.bear.jsbridge.AbstractC7947h;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.share.IBitableApi;
import com.bytedance.ee.bear.share.IShareMeta;
import com.bytedance.ee.bear.share.export.AbstractC11003a;
import com.bytedance.ee.bear.share.export.ShareParams;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.io.NonProguard;
import io.reactivex.disposables.C68289a;
import io.reactivex.functions.Consumer;
import java.util.Map;
import org.koin.java.KoinJavaComponent;

public class ShareFormPlugin extends DocumentPlugin {
    public final C68289a compositeDisposable = new C68289a();
    public DialogInterface$OnCancelListenerC1021b dialogFragment;

    public static class FormMeta implements NonProguard {
        public String baseToken;
        public String formName;
        public String tableId;
        public String viewId;
    }

    public String getBitableType() {
        String documentType = getDocViewModel().getDocumentType();
        documentType.hashCode();
        char c = 65535;
        switch (documentType.hashCode()) {
            case -102775833:
                if (documentType.equals("bitable")) {
                    c = 0;
                    break;
                }
                break;
            case 99640:
                if (documentType.equals("doc")) {
                    c = 1;
                    break;
                }
                break;
            case 109403487:
                if (documentType.equals("sheet")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return "bitable_app";
            case 1:
                return "bitable_doc_block";
            case 2:
                return "bitable_sheet_block";
            default:
                return "";
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.bitable.card.view.form.ShareFormPlugin$a */
    public class C4714a implements AbstractC7945d<FormMeta> {
        private C4714a() {
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public /* synthetic */ void m19566a(FormMeta formMeta, IShareMeta iShareMeta) throws Exception {
            ShareParams build = new ShareParams.ShareParamsBuilder(ShareFormPlugin.this.getActivity()).token(formMeta.baseToken).type(C8275a.f22380m.mo32555b()).bitableShareMeta(iShareMeta).tableId(formMeta.tableId).viewId(formMeta.viewId).bitableType(ShareFormPlugin.this.getBitableType()).docName(formMeta.formName).build();
            ShareFormPlugin.this.dialogFragment = ((AbstractC11003a) KoinJavaComponent.m268610a(AbstractC11003a.class)).mo41765b(build);
        }

        /* renamed from: a */
        public void handle(FormMeta formMeta, AbstractC7947h hVar) {
            if (formMeta == null) {
                C13479a.m54758a("ShareFormPlugin", "shareFormHandler, data is null");
                return;
            }
            if (ShareFormPlugin.this.dialogFragment != null && ShareFormPlugin.this.dialogFragment.isAdded()) {
                C13479a.m54764b("ShareFormPlugin", "shareFormHandler, bitableShareFragment is already added");
            }
            ShareFormPlugin.this.compositeDisposable.mo237937a(((IBitableApi) KoinJavaComponent.m268610a(IBitableApi.class)).mo17422a(formMeta.baseToken, formMeta.tableId, formMeta.viewId, 1).mo238001b(new Consumer(formMeta) {
                /* class com.bytedance.ee.bear.bitable.card.view.form.$$Lambda$ShareFormPlugin$a$hWeMz9ppx_oSydU9E_sC0mxAu2g */
                public final /* synthetic */ ShareFormPlugin.FormMeta f$1;

                {
                    this.f$1 = r2;
                }

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    ShareFormPlugin.C4714a.this.m19566a((ShareFormPlugin.C4714a) this.f$1, (ShareFormPlugin.FormMeta) ((IShareMeta) obj));
                }
            }, $$Lambda$ShareFormPlugin$a$g5ZAMEHzWWwZXsSWduaM7HxEnJ8.INSTANCE));
        }
    }

    @Override // com.bytedance.ee.bear.document.DocumentPlugin, com.bytedance.ee.bear.browser.plugin.lazy.AbstractC4952a
    public void getBridgeHandlers(Map<String, AbstractC7945d<?>> map) {
        map.put("biz.bitable.form.share", new C4714a());
    }

    public void onDetachFromUIContainer(C6095s sVar, AbstractC4958n nVar) {
        this.compositeDisposable.mo237935a();
        DialogInterface$OnCancelListenerC1021b bVar = this.dialogFragment;
        if (bVar != null) {
            bVar.mo5513b();
        }
        super.onDetachFromUIContainer((C4933k) sVar, nVar);
    }
}
