package com.bytedance.ee.bear.list.folder;

import android.content.Context;
import android.text.TextUtils;
import androidx.lifecycle.C1138ae;
import androidx.lifecycle.LiveData;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.facade.common.C7718l;
import com.bytedance.ee.bear.list.C8277e;
import com.bytedance.ee.bear.list.DocumentListInfo;
import com.bytedance.ee.bear.list.cache.C8153a;
import com.bytedance.ee.bear.list.cache.C8200i;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.bear.list.folder.complaint.C8351f;
import com.bytedance.ee.bear.list.folder.complaint.GetComplaintResult;
import com.bytedance.ee.bear.list.list.AbstractC8531b;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import io.reactivex.AbstractC68307f;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.AbstractC68322n;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.list.folder.k */
public class C8368k extends AbstractC8531b<AbstractC8314a> implements AbstractC8316ab {

    /* renamed from: k */
    private final String f22594k;

    /* renamed from: l */
    private final String f22595l;

    /* renamed from: m */
    private Document f22596m;

    /* renamed from: n */
    private Disposable f22597n;

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.AbstractC8531b
    /* renamed from: b */
    public String mo32588b() {
        return "/api/explorer/folder/children/";
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.AbstractC8531b
    /* renamed from: h */
    public String mo32590h() {
        return "FolderDetailModel";
    }

    @Override // com.bytedance.ee.bear.list.folder.AbstractC8316ab
    /* renamed from: k */
    public Document mo32720k() {
        return this.f22596m;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.AbstractC8531b
    /* renamed from: i */
    public C8277e mo32730i() {
        return new C8377p(this.f22594k);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.AbstractC8531b
    /* renamed from: g */
    public String mo32589g() {
        if (TextUtils.isEmpty(this.f22594k)) {
            return "root";
        }
        return this.f22594k;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.AbstractC8531b
    public AbstractC68307f<DocumentListInfo> E_() {
        return super.E_().mo238014c(new C8384w()).mo238014c(new C8383v((NetService) KoinJavaComponent.m268610a(NetService.class)));
    }

    @Override // com.bytedance.ee.bear.list.list.AbstractC8531b, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        super.destroy();
        Disposable disposable = this.f22597n;
        if (disposable != null && !disposable.isDisposed()) {
            this.f22597n.dispose();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public AbstractC8314a mo32592n() {
        if (TextUtils.isEmpty(this.f22594k)) {
            return new aq("");
        }
        return new ar(this.f22594k);
    }

    @Override // com.bytedance.ee.bear.list.folder.AbstractC8316ab
    /* renamed from: l */
    public AbstractC68307f<Document> mo32711l() {
        return AbstractC68307f.m265083a(this.f22594k).mo237998a((AbstractC68322n) new AbstractC68322n() {
            /* class com.bytedance.ee.bear.list.folder.$$Lambda$k$FodTMunnHkCJJ0tFICxlv24PYjA */

            @Override // io.reactivex.functions.AbstractC68322n
            public final boolean test(Object obj) {
                return C8368k.this.m34633c((String) obj);
            }
        }).mo237985a(C11678b.m48479c()).mo238020d($$Lambda$k$LWc_mj2oRpbosHmwEm32CGGvr54.INSTANCE);
    }

    @Override // com.bytedance.ee.bear.list.folder.AbstractC8316ab
    /* renamed from: m */
    public AbstractC68307f<GetComplaintResult> mo32712m() {
        return new C8351f().mo32792a(C8275a.f22370c.mo32555b(), this.f22594k);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.AbstractC8531b
    /* renamed from: c */
    public NetService.C5076e mo32729c() {
        NetService.C5076e c = super.mo32729c();
        c.mo20145a("need_path", "1");
        c.mo20145a("token", this.f22594k);
        if (!TextUtils.isEmpty(this.f22595l)) {
            c.mo20145a(ShareHitPoint.f121869d, this.f22595l);
        }
        c.mo20145a("show_no_perm", "1");
        return c;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.AbstractC8531b
    /* renamed from: d */
    public AbstractC68307f<DocumentListInfo> mo32740d() {
        return super.mo32740d().mo238014c(new C8384w()).mo238014c(new C8383v((NetService) KoinJavaComponent.m268610a(NetService.class))).mo238005b(new Consumer() {
            /* class com.bytedance.ee.bear.list.folder.$$Lambda$k$vl9DnmQbVSnAM6SMnP0qEcPwwE */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C8368k.this.m34627a((C8368k) ((DocumentListInfo) obj));
            }
        });
    }

    @Override // com.bytedance.ee.bear.list.folder.AbstractC8316ab
    /* renamed from: j */
    public void mo32591j() {
        Disposable disposable = this.f22597n;
        if (disposable != null && !disposable.isDisposed()) {
            this.f22597n.dispose();
        }
        this.f22597n = AbstractC68307f.m265083a((Object) true).mo237985a(C11678b.m48479c()).mo238001b(new Consumer() {
            /* class com.bytedance.ee.bear.list.folder.$$Lambda$k$ZNrq0_xsaR9tGntBr4Oh85F3_FI */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C8368k.this.m34628a((C8368k) ((Boolean) obj));
            }
        }, new Consumer() {
            /* class com.bytedance.ee.bear.list.folder.$$Lambda$k$T44BQOrhuC9XpJecCYyQrMaDM */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C8368k.this.m34630a((C8368k) ((Throwable) obj));
            }
        });
    }

    @Override // com.bytedance.ee.bear.list.list.AbstractC8542h
    /* renamed from: a */
    public LiveData<ArrayList<Document>> mo32587a() {
        if (TextUtils.isEmpty(this.f22594k)) {
            return C1138ae.m5354a(C8153a.m32844b().mo31575a(this.f22594k), new C8371n());
        }
        return C1138ae.m5354a(C8153a.m32844b().mo31598b(this.f22594k), new C8371n());
    }

    /* access modifiers changed from: private */
    @Override // com.bytedance.ee.bear.list.list.AbstractC8531b
    /* renamed from: a */
    public /* synthetic */ void m34627a(DocumentListInfo documentListInfo) throws Exception {
        this.f22596m = documentListInfo.getParent();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ Document m34631b(String str) throws Exception {
        return C8200i.m33448a(C8153a.m32844b().mo31650o(str));
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ boolean m34633c(String str) throws Exception {
        return !TextUtils.isEmpty(this.f22594k);
    }

    /* access modifiers changed from: private */
    @Override // com.bytedance.ee.bear.list.list.AbstractC8531b
    /* renamed from: a */
    public /* synthetic */ void m34630a(Throwable th) throws Exception {
        String h = mo32590h();
        C13479a.m54758a(h, "updateParentInCache()...error = " + th);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m34632b(Throwable th) throws Exception {
        String h = mo32590h();
        C13479a.m54758a(h, "removeItem()...throwable = " + th);
    }

    /* access modifiers changed from: private */
    @Override // com.bytedance.ee.bear.list.list.AbstractC8531b
    /* renamed from: a */
    public /* synthetic */ void m34628a(Boolean bool) throws Exception {
        long a = C8153a.m32844b().mo31573a(C8200i.m33446a(this.f22596m));
        String h = mo32590h();
        C13479a.m54764b(h, "updateParentInCache()...result = " + a);
    }

    @Override // com.bytedance.ee.bear.list.folder.AbstractC8316ab
    /* renamed from: a */
    public void mo32708a(String str) {
        C13479a.m54764b(mo32590h(), "removeItem()...");
        this.f23125f.mo237937a(AbstractC68307f.m265083a((Object) true).mo237985a(C11678b.m48479c()).mo238001b(new Consumer(str) {
            /* class com.bytedance.ee.bear.list.folder.$$Lambda$k$0Lfs405KczsEYDtAgYaYRux_M */
            public final /* synthetic */ String f$0;

            {
                this.f$0 = r1;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C8368k.m34629a(this.f$0, (Boolean) obj);
            }
        }, new Consumer() {
            /* class com.bytedance.ee.bear.list.folder.$$Lambda$k$rxhz2gPFnWsAnAJJXWKqj3hOPTo */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C8368k.this.m34632b((C8368k) ((Throwable) obj));
            }
        }));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m34629a(String str, Boolean bool) throws Exception {
        C8153a.m32844b().mo31610c(str);
    }

    C8368k(C7718l lVar, Context context, C10917c cVar, String str, String str2) {
        super(lVar, context, cVar);
        this.f22594k = str;
        this.f22595l = str2;
    }
}
