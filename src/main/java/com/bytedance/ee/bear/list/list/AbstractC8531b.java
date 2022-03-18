package com.bytedance.ee.bear.list.list;

import android.content.Context;
import android.text.TextUtils;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.aj;
import com.bytedance.ee.bear.appsetting.C4211a;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.facade.common.C7718l;
import com.bytedance.ee.bear.facade.common.widget.Toast;
import com.bytedance.ee.bear.list.AbstractC8457h;
import com.bytedance.ee.bear.list.C8277e;
import com.bytedance.ee.bear.list.C8292f;
import com.bytedance.ee.bear.list.DocumentListInfo;
import com.bytedance.ee.bear.list.cache.FolderSortStrategy;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.list.list.AbstractC8542h;
import com.bytedance.ee.bear.list.sort.C8786n;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p702e.C13657b;
import com.larksuite.suite.R;
import io.reactivex.AbstractC68307f;
import io.reactivex.disposables.C68289a;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.Objects;
import org.koin.java.KoinJavaComponent;
import org.p3511d.AbstractC70020b;

/* renamed from: com.bytedance.ee.bear.list.list.b */
public abstract class AbstractC8531b<T extends AbstractC8457h> implements AbstractC8542h {

    /* renamed from: a */
    protected C7718l f23120a;

    /* renamed from: b */
    protected Context f23121b;

    /* renamed from: c */
    protected C10917c f23122c;

    /* renamed from: d */
    public FolderSortStrategy f23123d;

    /* renamed from: e */
    protected C8786n f23124e;

    /* renamed from: f */
    protected C68289a f23125f = new C68289a();

    /* renamed from: g */
    protected T f23126g;

    /* renamed from: h */
    protected NetService.AbstractC5075d<DocumentListInfo> f23127h;

    /* renamed from: i */
    protected DocumentListInfo f23128i;

    /* renamed from: j */
    public AbstractC8542h.AbstractC8543a f23129j;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract String mo32588b();

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public abstract String mo32589g();

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public abstract String mo32590h();

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public abstract T mo32592n();

    /* access modifiers changed from: protected */
    public boolean w_() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public C8277e mo32730i() {
        return new C8277e();
    }

    /* access modifiers changed from: protected */
    public AbstractC68307f<DocumentListInfo> E_() {
        return this.f23127h.mo20141a(mo32591j());
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        C13479a.m54764b(mo32590h(), "create()...");
        mo32720k();
        mo33362r();
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        C13479a.m54764b(mo32590h(), "destroy()...");
        this.f23125f.mo237935a();
    }

    @Override // com.bytedance.ee.bear.list.list.AbstractC8542h
    /* renamed from: p */
    public void mo33360p() {
        this.f23123d = null;
        if (this.f23124e != null) {
            this.f23124e = null;
        }
        mo33362r();
    }

    @Override // com.bytedance.ee.bear.list.list.AbstractC8542h
    /* renamed from: q */
    public void mo33361q() {
        C13479a.m54764b(mo32590h(), "refreshFromNet()...");
        mo33358a(false);
    }

    @Override // com.bytedance.ee.bear.list.list.AbstractC8542h
    /* renamed from: s */
    public boolean mo33363s() {
        DocumentListInfo documentListInfo = this.f23128i;
        if (documentListInfo == null || !documentListInfo.isHasMore()) {
            return false;
        }
        return true;
    }

    /* renamed from: k */
    private void mo32720k() {
        this.f23127h = ((NetService) KoinJavaComponent.m268610a(NetService.class)).mo20117a(mo32730i());
        this.f23126g = mo32592n();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public AbstractC68307f<DocumentListInfo> mo32740d() {
        return AbstractC68307f.m265083a((Object) true).mo237985a(C11678b.m48479c()).mo238020d(new Function() {
            /* class com.bytedance.ee.bear.list.list.$$Lambda$b$D3M2C5r_o60QE6DFfvLC5oJ34dU */

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return AbstractC8531b.this.m35565b((Boolean) obj);
            }
        }).mo238014c(new Function() {
            /* class com.bytedance.ee.bear.list.list.$$Lambda$b$bw4R7SMGwYJgFMAMKleKbnyCqo */

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return AbstractC8531b.this.m35561a((Boolean) obj);
            }
        });
    }

    @Override // com.bytedance.ee.bear.list.list.AbstractC8542h
    /* renamed from: o */
    public void mo33359o() {
        C13479a.m54764b(mo32590h(), "loadMoreFromNet()...");
        this.f23125f.mo237937a(E_().mo238001b(new Consumer() {
            /* class com.bytedance.ee.bear.list.list.$$Lambda$b$LCUZHsfnXppv0J_NVH_Y0YL3RXo */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                AbstractC8531b.this.m35566b((AbstractC8531b) ((DocumentListInfo) obj));
            }
        }, new Consumer() {
            /* class com.bytedance.ee.bear.list.list.$$Lambda$b$6QTAR6GGuhM93qnNe4c6pBDXoM8 */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                AbstractC8531b.this.m35563a((AbstractC8531b) ((Throwable) obj));
            }
        }));
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public void mo33362r() {
        C7718l lVar = this.f23120a;
        if (lVar == null || lVar.getActivity() == null) {
            C13479a.m54758a(mo32590h(), "observeSortAndFilter()...fragment or activity is null");
            return;
        }
        if (this.f23124e == null) {
            this.f23124e = (C8786n) aj.m5366a(this.f23120a.getActivity()).mo6005a(C8786n.class);
        }
        this.f23124e.getSortStrategyLiveData().mo5923a(this.f23120a, new AbstractC1178x() {
            /* class com.bytedance.ee.bear.list.list.$$Lambda$GSAPBVEAm8qxtpYSej5MEbxaE8Q */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                AbstractC8531b.this.mo33356a((FolderSortStrategy) obj);
            }
        });
    }

    /* renamed from: j */
    private NetService.C5076e mo32591j() {
        NetService.C5076e c = mo32729c();
        DocumentListInfo documentListInfo = this.f23128i;
        if (documentListInfo == null) {
            return c;
        }
        if (!TextUtils.isEmpty(documentListInfo.getCheckId())) {
            c.mo20145a("check_id", String.valueOf(this.f23128i.getCheckId()));
        }
        if (!TextUtils.isEmpty(this.f23128i.getNextId())) {
            c.mo20145a("next_id", String.valueOf(this.f23128i.getNextId()));
        }
        if (!TextUtils.isEmpty(this.f23128i.getLastLabel())) {
            c.mo20145a("last_label", this.f23128i.getLastLabel());
        }
        return c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public NetService.C5076e mo32729c() {
        NetService.C5077f fVar = new NetService.C5077f(mo32588b());
        fVar.mo20145a("need_total", "1");
        if (w_()) {
            fVar.mo20145a("length", "100");
        }
        FolderSortStrategy folderSortStrategy = this.f23123d;
        if (folderSortStrategy != null) {
            if (folderSortStrategy.mo31554d() == C8275a.f22371d.mo32555b() && C4211a.m17514a().mo16538b("spacekit.mobile.docx_enable", false)) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(String.valueOf(C8275a.f22371d.mo32555b()));
                arrayList.add(String.valueOf(C8275a.f22378k.mo32555b()));
                fVar.mo20146a("obj_type", arrayList);
            } else if (this.f23123d.mo31554d() != C8275a.f22369b.mo32555b()) {
                fVar.mo20145a("obj_type", String.valueOf(this.f23123d.mo31554d()));
            }
            if (!TextUtils.isEmpty(this.f23123d.mo31560f())) {
                fVar.mo20145a("file_type", this.f23123d.mo31560f());
            }
            if (!TextUtils.isEmpty(this.f23123d.mo31561g())) {
                fVar.mo20145a("forbidden_file_type", this.f23123d.mo31561g());
            }
            if (this.f23123d.mo31549b() != -1) {
                fVar.mo20145a("rank", String.valueOf(this.f23123d.mo31549b()));
                fVar.mo20145a("asc", String.valueOf(this.f23123d.mo31558e()));
            }
        }
        NetService.C5076e a = C8292f.m34122a(this.f23122c, this.f23121b, fVar);
        Objects.requireNonNull(a);
        return a;
    }

    @Override // com.bytedance.ee.bear.list.list.AbstractC8542h
    /* renamed from: a */
    public void mo33357a(AbstractC8542h.AbstractC8543a aVar) {
        this.f23129j = aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ AbstractC70020b m35561a(Boolean bool) throws Exception {
        return this.f23127h.mo20141a(mo32729c());
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ Boolean m35565b(Boolean bool) throws Exception {
        if (this.f23123d == null) {
            FolderSortStrategy a = this.f23126g.mo32619a();
            this.f23123d = a;
            if (a != null) {
                this.f23124e.postSortStrategy(a);
            }
        }
        return bool;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo33356a(FolderSortStrategy folderSortStrategy) {
        if (folderSortStrategy != null && TextUtils.equals(folderSortStrategy.mo31545a(), mo32589g()) && !folderSortStrategy.equals(this.f23123d)) {
            this.f23123d = folderSortStrategy;
            mo33358a(true);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m35562a(DocumentListInfo documentListInfo) throws Exception {
        String h = mo32590h();
        C13479a.m54764b(h, "refreshFromNet()...success, size = " + C13657b.m55424c(documentListInfo.getDocumentList()));
        this.f23128i = documentListInfo;
        AbstractC8542h.AbstractC8543a aVar = this.f23129j;
        if (aVar != null) {
            aVar.mo32648a(documentListInfo.getTotal(), this.f23128i.isHasMore());
        }
        this.f23126g.mo32620a(documentListInfo.getDocumentList());
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m35566b(DocumentListInfo documentListInfo) throws Exception {
        String h = mo32590h();
        C13479a.m54764b(h, "loadMoreFromNet()...success, size = " + C13657b.m55424c(documentListInfo.getDocumentList()));
        this.f23128i = documentListInfo;
        this.f23126g.mo32621b(documentListInfo.getDocumentList());
        AbstractC8542h.AbstractC8543a aVar = this.f23129j;
        if (aVar != null) {
            aVar.mo33304b(this.f23128i.isHasMore());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m35563a(Throwable th) throws Exception {
        String h = mo32590h();
        C13479a.m54759a(h, "loadMoreFromNet()...error, path = " + mo32588b(), th);
        this.f23128i = null;
        AbstractC8542h.AbstractC8543a aVar = this.f23129j;
        if (aVar != null) {
            aVar.mo33303b(th);
        }
    }

    /* renamed from: a */
    public void mo33358a(boolean z) {
        String h = mo32590h();
        C13479a.m54764b(h, "refreshFromNet()...needFailToast = " + z);
        this.f23125f.mo237937a(mo32740d().mo238001b(new Consumer() {
            /* class com.bytedance.ee.bear.list.list.$$Lambda$b$jfOhyqxuEeF6t411kRGzPf2o8No */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                AbstractC8531b.this.m35562a((AbstractC8531b) ((DocumentListInfo) obj));
            }
        }, new Consumer(z) {
            /* class com.bytedance.ee.bear.list.list.$$Lambda$b$qQKAmDMlyHLpQJqz771CFOfzjY */
            public final /* synthetic */ boolean f$1;

            {
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                AbstractC8531b.this.m35564a(this.f$1, (Throwable) obj);
            }
        }));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m35564a(boolean z, Throwable th) throws Exception {
        String h = mo32590h();
        C13479a.m54759a(h, "refreshFromNet()...error, path = " + mo32588b(), th);
        this.f23128i = null;
        AbstractC8542h.AbstractC8543a aVar = this.f23129j;
        if (aVar != null) {
            aVar.mo32655a(th);
        }
        if (z) {
            Context context = this.f23121b;
            Toast.showFailureText(context, context.getString(R.string.Doc_Normal_PermissionRequestFail));
        }
    }

    public AbstractC8531b(C7718l lVar, Context context, C10917c cVar) {
        this.f23120a = lVar;
        this.f23121b = context;
        this.f23122c = cVar;
    }
}
