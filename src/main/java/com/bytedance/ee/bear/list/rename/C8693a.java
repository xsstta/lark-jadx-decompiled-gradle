package com.bytedance.ee.bear.list.rename;

import com.alibaba.fastjson.JSON;
import com.bytedance.ee.bear.NodeType;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.contract.net.C5203d;
import com.bytedance.ee.bear.contract.net.SimpleRequestResult;
import com.bytedance.ee.bear.facade.common.C7718l;
import com.bytedance.ee.bear.facade.common.widget.Toast;
import com.bytedance.ee.bear.list.cache.C8153a;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.bear.list.dto.FolderVersion;
import com.bytedance.ee.bear.list.p424c.AbstractC8149a;
import com.bytedance.ee.bear.p513o.AbstractC10365a;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.bear.watermark.interfaces.IWatermarkManager;
import com.bytedance.ee.bear.widgets.dialog.inputdialog.BearUDInputDialogBuilder;
import com.bytedance.ee.log.C13479a;
import com.larksuite.suite.R;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.list.rename.a */
public class C8693a {

    /* renamed from: a */
    private final WeakReference<C7718l> f23511a;

    /* renamed from: b */
    private final C10917c f23512b;

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m36390a() {
        m36391a(R.string.Doc_List_RenameFailed);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ SimpleRequestResult m36389a(String str) throws NetService.ParseException {
        return (SimpleRequestResult) JSON.parseObject(str, SimpleRequestResult.class);
    }

    /* renamed from: a */
    private void m36391a(int i) {
        if (this.f23511a.get() == null) {
            C13479a.m54758a("RenameWrapper", "RenameWrapper.showRenameResult, mHostRef.get() is null. ");
            return;
        }
        C7718l lVar = this.f23511a.get();
        Toast.showFailureText(lVar.getActivity(), lVar.getActivity().getResources().getText(i), 0);
        C13479a.m54772d("RenameWrapper", "showRenameResult: fail");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m36394a(Throwable th) throws Exception {
        C13479a.m54758a("RenameWrapper", "doRenameInternal()...failed, throwable = " + th);
        if (C5203d.m21235a(th, 4)) {
            m36391a(R.string.Doc_Facade_OperateFailedNoPermission);
        } else if (C5203d.m21235a(th, 4202)) {
            m36391a(R.string.CreationMobile_DataUpgrade_Locked_toast);
        } else {
            ((AbstractC10365a) KoinJavaComponent.m268610a(AbstractC10365a.class)).mo39500a(this.f23511a.get().getContext(), th, new Runnable() {
                /* class com.bytedance.ee.bear.list.rename.$$Lambda$a$dRLkn_Ojx2r43SsIDhcg4NUf5g */

                public final void run() {
                    C8693a.this.m36390a();
                }
            });
        }
    }

    /* renamed from: a */
    public void mo33719a(Document document) {
        if (this.f23511a.get() == null) {
            C13479a.m54758a("RenameWrapper", "rename()...mHostRef.get() is null. ");
        } else if (document == null) {
            C13479a.m54758a("RenameWrapper", "rename()...document is null");
        } else {
            ((IWatermarkManager) KoinJavaComponent.m268610a(IWatermarkManager.class)).mo40652b(((BearUDInputDialogBuilder) new BearUDInputDialogBuilder(this.f23511a.get().getContext()).title(R.string.Doc_Facade_Rename)).mo45397b(document.mo32469n()).mo45399c(R.string.Doc_Facade_Confirm).mo45391a(new BearUDInputDialogBuilder.OnBtnClickListener(document) {
                /* class com.bytedance.ee.bear.list.rename.$$Lambda$a$Cqnope3IKM3zmv2Uys6wxkGhJc */
                public final /* synthetic */ Document f$1;

                {
                    this.f$1 = r2;
                }

                @Override // com.bytedance.ee.bear.widgets.dialog.inputdialog.BearUDInputDialogBuilder.OnBtnClickListener
                public final void onClick(String str) {
                    C8693a.this.m36396c(this.f$1, str);
                }
            }).mo45402d(R.string.Doc_Facade_Cancel).show());
        }
    }

    public C8693a(C7718l lVar, C10917c cVar) {
        this.f23511a = new WeakReference<>(lVar);
        this.f23512b = cVar;
    }

    /* renamed from: b */
    private NetService.C5076e m36395b(Document document, String str) {
        String str2;
        String str3;
        if (FolderVersion.isShareFolderV2(document.an())) {
            str2 = "/space/api/explorer/v2/rename/";
        } else {
            str2 = "/api/explorer/rename/";
        }
        if (NodeType.isShortcut(document.ao())) {
            str3 = document.mo32475p();
        } else {
            str3 = document.mo32472o();
        }
        NetService.C5077f fVar = new NetService.C5077f(str2);
        HashMap hashMap = new HashMap();
        hashMap.put("token", str3);
        hashMap.put("name", str);
        hashMap.put("extra", "");
        fVar.mo20147a(hashMap);
        fVar.mo20143a(1);
        return fVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m36396c(Document document, String str) {
        ((NetService) KoinJavaComponent.m268610a(NetService.class)).mo20117a($$Lambda$a$r6znKTYRg1BaE5s6EFJY0H5Qu8Y.INSTANCE).mo20141a(m36395b(document, str)).mo237985a(C11678b.m48479c()).mo238020d(new Function(str) {
            /* class com.bytedance.ee.bear.list.rename.$$Lambda$a$9AM0SRrdBlVQNiDXS4DYxWbwSA */
            public final /* synthetic */ String f$1;

            {
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C8693a.m36388a(Document.this, this.f$1, (SimpleRequestResult) obj);
            }
        }).mo237985a(C11678b.m48481e()).mo238001b($$Lambda$a$WvQL0DkejLyzP24JOnO_4wXYbcg.INSTANCE, new Consumer() {
            /* class com.bytedance.ee.bear.list.rename.$$Lambda$a$HXd2yFtXwk5p4k2k2Ghytj1SuA */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C8693a.this.m36394a((C8693a) ((Throwable) obj));
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ SimpleRequestResult m36388a(Document document, String str, SimpleRequestResult simpleRequestResult) throws Exception {
        C13479a.m54764b("RenameWrapper", "doRenameInternal()...online success");
        if (NodeType.isShortcut(document.ao())) {
            C8153a.m32844b().mo31611c(document.mo32475p(), str);
        } else {
            C8153a.m32844b().mo31601b(document.mo32472o(), str);
            ((AbstractC8149a) KoinJavaComponent.m268610a(AbstractC8149a.class)).mo31504a(document.mo32472o(), str);
        }
        return simpleRequestResult;
    }
}
