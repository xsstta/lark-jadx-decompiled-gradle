package com.bytedance.ee.bear.list.folderselect;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.ee.bear.contract.AccountService;
import com.bytedance.ee.bear.contract.C5084ad;
import com.bytedance.ee.bear.contract.C5234y;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.contract.an;
import com.bytedance.ee.bear.contract.create.DocumentCreateInfo;
import com.bytedance.ee.bear.contract.route.parcelable.DocOperateBean;
import com.bytedance.ee.bear.facade.common.widget.Toast;
import com.bytedance.ee.bear.list.C8292f;
import com.bytedance.ee.bear.list.DocumentListInfo;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.bear.list.dto.FolderVersion;
import com.bytedance.ee.bear.list.dto.SaveTemplateResult;
import com.bytedance.ee.bear.list.folderselect.AbstractC8407f;
import com.bytedance.ee.bear.list.folderselect.p430a.AbstractC8391c;
import com.bytedance.ee.bear.list.folderselect.p430a.C8389a;
import com.bytedance.ee.bear.list.folderselect.p430a.C8390b;
import com.bytedance.ee.bear.list.folderselect.p430a.C8392d;
import com.bytedance.ee.bear.list.folderselect.p430a.C8393e;
import com.bytedance.ee.bear.list.folderselect.p430a.C8396f;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p702e.C13657b;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.BasePresenter;
import com.larksuite.suite.R;
import io.reactivex.AbstractC68307f;
import io.reactivex.disposables.C68289a;
import io.reactivex.functions.Consumer;
import java.io.IOException;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.list.folderselect.n */
public class C8424n extends BasePresenter<AbstractC8407f.AbstractC8408a, AbstractC8407f.AbstractC8409b, AbstractC8407f.AbstractC8409b.AbstractC8410a> {

    /* renamed from: a */
    public final Context f22724a;

    /* renamed from: b */
    public final AbstractC8427b f22725b;

    /* renamed from: c */
    public final DocOperateBean f22726c;

    /* renamed from: d */
    public String f22727d;

    /* renamed from: e */
    public final String f22728e;

    /* renamed from: f */
    private final C10917c f22729f;

    /* renamed from: g */
    private AccountService.Account f22730g;

    /* renamed from: h */
    private final Fragment f22731h;

    /* renamed from: i */
    private final boolean f22732i;

    /* renamed from: j */
    private final boolean f22733j;

    /* renamed from: k */
    private final C68289a f22734k = new C68289a();

    /* renamed from: l */
    private final int f22735l;

    /* renamed from: m */
    private final int f22736m;

    /* renamed from: com.bytedance.ee.bear.list.folderselect.n$b */
    public interface AbstractC8427b {
        /* renamed from: a */
        void mo32885a();

        /* renamed from: a */
        void mo32886a(int i, String str, String str2, boolean z, int i2, boolean z2, int i3);

        /* renamed from: a */
        void mo32887a(Intent intent);

        /* renamed from: b */
        void mo32888b();

        /* renamed from: c */
        void mo32889c();
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.list.folderselect.n$a */
    public class C8426a implements AbstractC8407f.AbstractC8409b.AbstractC8410a {
        @Override // com.bytedance.ee.bear.list.folderselect.AbstractC8407f.AbstractC8409b.AbstractC8410a
        /* renamed from: b */
        public void mo32872b() {
            C8424n.this.mo32891b();
        }

        @Override // com.bytedance.ee.bear.list.folderselect.AbstractC8407f.AbstractC8409b.AbstractC8410a
        /* renamed from: c */
        public void mo32873c() {
            C8424n.this.mo32893d();
        }

        @Override // com.bytedance.ee.bear.list.folderselect.AbstractC8407f.AbstractC8409b.AbstractC8410a
        /* renamed from: f */
        public void mo32876f() {
            C8424n.this.mo32892c();
        }

        @Override // com.bytedance.ee.bear.list.folderselect.AbstractC8407f.AbstractC8409b.AbstractC8410a
        /* renamed from: g */
        public void mo32877g() {
            C8424n.this.mo32892c();
        }

        @Override // com.bytedance.ee.bear.list.folderselect.AbstractC8407f.AbstractC8409b.AbstractC8410a
        /* renamed from: a */
        public void mo32870a() {
            if (C8424n.this.f22725b != null) {
                C8424n.this.f22725b.mo32885a();
            }
        }

        @Override // com.bytedance.ee.bear.list.folderselect.AbstractC8407f.AbstractC8409b.AbstractC8410a
        /* renamed from: e */
        public void mo32875e() {
            if (C8424n.this.f22725b != null) {
                C8424n.this.f22725b.mo32888b();
            }
        }

        @Override // com.bytedance.ee.bear.list.folderselect.AbstractC8407f.AbstractC8409b.AbstractC8410a
        /* renamed from: d */
        public void mo32874d() {
            if (C8424n.this.f22726c.mo20971a() == 3) {
                new C8396f(C8424n.this.f22727d, C8424n.this.f22728e, C8424n.this.f22725b).mo32841b();
            } else if (C8424n.this.mo32895f()) {
                ((AbstractC8407f.AbstractC8409b) C8424n.this.getView()).mo32868b();
            } else if (C8424n.this.mo32896g()) {
                ((AbstractC8407f.AbstractC8409b) C8424n.this.getView()).mo32869c();
            } else {
                C8424n.this.mo32892c();
            }
        }

        private C8426a() {
        }

        @Override // com.bytedance.ee.bear.list.folderselect.AbstractC8407f.AbstractC8409b.AbstractC8410a
        /* renamed from: a */
        public void mo32871a(View view, int i, Document document) {
            if (C8424n.this.f22725b != null) {
                C8424n.this.f22725b.mo32886a(document.mo32483t(), document.mo32472o(), C8292f.m34193g(C8424n.this.f22724a, document), FolderVersion.isShareFolder(document.an(), document.ap()), document.mo32398N(), document.mo32400P(), document.an());
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public AbstractC8407f.AbstractC8409b.AbstractC8410a createViewDelegate() {
        return new C8426a();
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        super.destroy();
        m34889h();
    }

    /* renamed from: h */
    private void m34889h() {
        if (!this.f22734k.isDisposed()) {
            this.f22734k.mo237935a();
        }
    }

    /* renamed from: i */
    private void m34890i() {
        this.f22730g = ((an) KoinJavaComponent.m268610a(an.class)).mo16408f();
    }

    /* renamed from: j */
    private boolean m34891j() {
        return !C5084ad.m20847d().mo20038b().mo20041b();
    }

    /* renamed from: e */
    public void mo32894e() {
        FolderSelectAnalytic.m34772a(C5234y.m21391b(), this.f22726c, "click_create_folder");
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        m34890i();
        ((AbstractC8407f.AbstractC8409b) getView()).mo32862a();
        mo32891b();
    }

    /* renamed from: g */
    public boolean mo32896g() {
        if (!this.f22726c.mo20983i() || ((!this.f22732i && !this.f22726c.mo20990p()) || this.f22726c.mo20971a() != 1)) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public void mo32893d() {
        if (m34891j()) {
            Context context = this.f22724a;
            Toast.showFailureText(context, context.getString(R.string.Doc_List_OperateFailedNoNet), 0);
            return;
        }
        ((AbstractC8407f.AbstractC8408a) getModel()).mo32860a(this.f22731h.getActivity(), new IGetDataCallback<DocumentCreateInfo>() {
            /* class com.bytedance.ee.bear.list.folderselect.C8424n.C84251 */

            /* renamed from: a */
            public void onSuccess(DocumentCreateInfo documentCreateInfo) {
                C8424n.this.mo32894e();
                C8424n.this.mo32891b();
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                C8424n.this.mo32894e();
                Toast.showFailureText(C8424n.this.f22724a, C8424n.this.f22724a.getString(R.string.Doc_Facade_CreateFailed), 0);
            }
        });
    }

    /* renamed from: b */
    public void mo32891b() {
        m34889h();
        if (m34891j()) {
            C13479a.m54764b("SubFolderSelectPresenter", "loadData()...failed, for offline.");
            ((AbstractC8407f.AbstractC8409b) getView()).mo32865a(new IOException("No Network"));
            return;
        }
        this.f22734k.mo237937a(((AbstractC8407f.AbstractC8408a) getModel()).mo32859a().mo238001b(new Consumer() {
            /* class com.bytedance.ee.bear.list.folderselect.$$Lambda$n$vfaCQmeq7m9LBrEn_IosS4mZZR8 */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C8424n.this.m34883a((C8424n) ((DocumentListInfo) obj));
            }
        }, new Consumer() {
            /* class com.bytedance.ee.bear.list.folderselect.$$Lambda$n$uREsRGmm9dpHlbqKHyNuM7vrPas */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C8424n.this.m34888c((Throwable) obj);
            }
        }));
        if (this.f22736m == 4 && !this.f22726c.mo20983i()) {
            this.f22734k.mo237937a(((AbstractC8407f.AbstractC8408a) getModel()).mo32861b().mo238001b(new Consumer() {
                /* class com.bytedance.ee.bear.list.folderselect.$$Lambda$n$AhRnl02UspI4qBjMWW4dnH5bxCs */

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    C8424n.this.m34884a((C8424n) ((GetMyRootFolderTokenResult) obj));
                }
            }, $$Lambda$n$uK9eU_qQvwlcbJ3Jzv_goAhvMfE.INSTANCE));
        }
    }

    /* renamed from: f */
    public boolean mo32895f() {
        boolean z;
        boolean z2;
        AccountService.Account account = this.f22730g;
        if (account == null || !account.mo19681c()) {
            z = false;
        } else {
            z = true;
        }
        C13479a.m54764b("SubFolderSelectPresenter", "isConsumer = " + z);
        if (z || !this.f22733j || this.f22726c.mo20989o() || !(this.f22726c.mo20971a() == 0 || this.f22726c.mo20971a() == 1 || this.f22726c.mo20971a() == 4)) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (this.f22726c.mo20983i()) {
            return z2;
        }
        if (!z2 || !this.f22726c.mo20982h()) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public void mo32892c() {
        AbstractC8391c cVar;
        if (m34891j()) {
            C13479a.m54764b("SubFolderSelectPresenter", "doCommand()...failed, offline");
            Context context = this.f22724a;
            Toast.showFailureText(context, context.getString(R.string.Doc_List_OperateFailedNoNet));
            return;
        }
        m34889h();
        ((AbstractC8407f.AbstractC8409b) getView()).mo32867a(true);
        if (this.f22726c.mo20971a() == 0) {
            cVar = new C8390b(this.f22729f, this.f22724a, this.f22726c.mo20976c(), this.f22726c.mo20975b(), this.f22727d, this.f22728e);
        } else if (this.f22726c.mo20971a() == 1) {
            cVar = new C8392d(this.f22729f, this.f22724a, this.f22726c.mo20976c(), this.f22727d, this.f22728e, this.f22726c.mo20983i());
        } else if (this.f22726c.mo20971a() == 4) {
            cVar = new C8393e(this.f22729f, this.f22724a, this.f22727d, this.f22726c.mo20988n(), this.f22735l);
        } else {
            cVar = new C8389a(this.f22729f, this.f22724a, this.f22726c.mo20976c(), this.f22726c.mo20977d(), this.f22727d);
        }
        this.f22734k.mo237937a(((AbstractC68307f) cVar.mo32841b()).mo238001b(new Consumer(cVar) {
            /* class com.bytedance.ee.bear.list.folderselect.$$Lambda$n$hBVCzGz5RSONs8NM2XJuUvAuSTk */
            public final /* synthetic */ AbstractC8391c f$1;

            {
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C8424n.this.m34885a(this.f$1, (NetService.Result) obj);
            }
        }, new Consumer() {
            /* class com.bytedance.ee.bear.list.folderselect.$$Lambda$n$bVwK2VVTQQV56vVw6OR93yon5C0 */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C8424n.this.m34886a((C8424n) ((Throwable) obj));
            }
        }));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m34884a(GetMyRootFolderTokenResult getMyRootFolderTokenResult) throws Exception {
        C13479a.m54764b("SubFolderSelectPresenter", "getMyRootFolderToken()...success");
        if (!TextUtils.isEmpty(getMyRootFolderTokenResult.getToken())) {
            this.f22727d = getMyRootFolderTokenResult.getToken();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m34887b(Throwable th) throws Exception {
        C13479a.m54758a("SubFolderSelectPresenter", "getMyRootFolderToken()...error = " + th);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m34888c(Throwable th) throws Exception {
        C13479a.m54758a("SubFolderSelectPresenter", "loadData()...error = " + th);
        ((AbstractC8407f.AbstractC8409b) getView()).mo32865a(th);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m34883a(DocumentListInfo documentListInfo) throws Exception {
        C13479a.m54764b("SubFolderSelectPresenter", "loadData()...success, size = " + C13657b.m55424c(documentListInfo.getDocumentList()));
        ((AbstractC8407f.AbstractC8409b) getView()).mo32866a(documentListInfo.getDocumentList());
        ((AbstractC8407f.AbstractC8409b) getView()).mo32864a(documentListInfo.getParentPermission());
        ((AbstractC8407f.AbstractC8409b) getView()).mo32863a(documentListInfo.getParent());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m34886a(Throwable th) throws Exception {
        C13479a.m54758a("SubFolderSelectPresenter", "doCommand()...error = " + th);
        ((AbstractC8407f.AbstractC8409b) getView()).mo32867a(false);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m34885a(AbstractC8391c cVar, NetService.Result result) throws Exception {
        C13479a.m54764b("SubFolderSelectPresenter", "doCommand()...success");
        ((AbstractC8407f.AbstractC8409b) getView()).mo32867a(false);
        AbstractC8427b bVar = this.f22725b;
        if (bVar == null) {
            return;
        }
        if (cVar instanceof C8393e) {
            Intent intent = new Intent();
            ((SaveTemplateResult) result).setParentToken(this.f22727d);
            intent.putExtra("TEMPLATE_RESULT_KEY", result);
            this.f22725b.mo32887a(intent);
            return;
        }
        bVar.mo32889c();
    }

    C8424n(Fragment fragment, Context context, AbstractC8407f.AbstractC8409b bVar, AbstractC8407f.AbstractC8408a aVar, C10917c cVar, DocOperateBean docOperateBean, AbstractC8427b bVar2, boolean z, String str, String str2, boolean z2, int i, int i2) {
        super(aVar, bVar);
        this.f22724a = context;
        this.f22729f = cVar;
        this.f22726c = docOperateBean;
        this.f22725b = bVar2;
        this.f22731h = fragment;
        this.f22732i = z;
        this.f22727d = str;
        this.f22728e = str2;
        this.f22733j = z2;
        this.f22735l = i;
        this.f22736m = i2;
    }
}
