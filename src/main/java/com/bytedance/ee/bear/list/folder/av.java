package com.bytedance.ee.bear.list.folder;

import android.content.Context;
import androidx.lifecycle.C1138ae;
import androidx.lifecycle.LiveData;
import com.bytedance.ee.bear.appsetting.C4211a;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.facade.common.C7718l;
import com.bytedance.ee.bear.list.C8277e;
import com.bytedance.ee.bear.list.C8292f;
import com.bytedance.ee.bear.list.DocumentListInfo;
import com.bytedance.ee.bear.list.cache.C8153a;
import com.bytedance.ee.bear.list.cache.C8200i;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.bear.list.folder.complaint.C8351f;
import com.bytedance.ee.bear.list.folder.complaint.GetComplaintResult;
import com.bytedance.ee.bear.list.list.AbstractC8531b;
import com.bytedance.ee.bear.middleground_permission_export.model.folder.ShareFolderUserPermission;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import io.reactivex.AbstractC68307f;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.ArrayList;

public class av extends AbstractC8531b<AbstractC8314a> implements AbstractC8321af {

    /* renamed from: k */
    private final String f22495k;

    /* renamed from: l */
    private Document f22496l;

    /* renamed from: m */
    private ShareFolderUserPermission f22497m;

    /* renamed from: n */
    private Disposable f22498n;

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.AbstractC8531b
    /* renamed from: h */
    public String mo32590h() {
        return "SubFolderModel";
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.AbstractC8531b
    /* renamed from: g */
    public String mo32589g() {
        return this.f22495k;
    }

    @Override // com.bytedance.ee.bear.list.folder.AbstractC8321af
    /* renamed from: j */
    public ShareFolderUserPermission mo32591j() {
        return this.f22497m;
    }

    @Override // com.bytedance.ee.bear.list.folder.AbstractC8321af
    public Document z_() {
        return this.f22496l;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.AbstractC8531b
    /* renamed from: i */
    public C8277e mo32730i() {
        return new C8378q(this.f22495k);
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public AbstractC8314a mo32592n() {
        return new ar(this.f22495k);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.AbstractC8531b
    /* renamed from: c */
    public NetService.C5076e mo32729c() {
        NetService.C5076e c = super.mo32729c();
        c.mo20145a("need_path", "1");
        c.mo20145a("token", this.f22495k);
        c.mo20146a("shortcut_filter", C8292f.m34180c());
        return c;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.AbstractC8531b
    /* renamed from: d */
    public AbstractC68307f<DocumentListInfo> mo32740d() {
        return super.mo32740d().mo238014c(new C8386y()).mo238005b(new Consumer() {
            /* class com.bytedance.ee.bear.list.folder.$$Lambda$av$gBt5npMb5qvyS552pKJ9nWlKJng */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                av.this.m34451a((av) ((DocumentListInfo) obj));
            }
        });
    }

    @Override // com.bytedance.ee.bear.list.list.AbstractC8531b, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        super.destroy();
        Disposable disposable = this.f22498n;
        if (disposable != null && !disposable.isDisposed()) {
            this.f22498n.dispose();
        }
    }

    @Override // com.bytedance.ee.bear.list.folder.AbstractC8321af
    /* renamed from: k */
    public AbstractC68307f<Document> mo32720k() {
        return AbstractC68307f.m265083a((Object) true).mo237985a(C11678b.m48479c()).mo238020d(new Function() {
            /* class com.bytedance.ee.bear.list.folder.$$Lambda$av$r2PwnVodtIdGu_nuXJQh33TZWiw */

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return av.this.m34450a((Boolean) obj);
            }
        });
    }

    @Override // com.bytedance.ee.bear.list.folder.AbstractC8321af
    /* renamed from: l */
    public AbstractC68307f<GetComplaintResult> mo32721l() {
        return new C8351f().mo32792a(C8275a.f22370c.mo32555b(), this.f22495k);
    }

    @Override // com.bytedance.ee.bear.list.folder.AbstractC8321af
    /* renamed from: f */
    public void mo32718f() {
        Disposable disposable = this.f22498n;
        if (disposable != null && !disposable.isDisposed()) {
            this.f22498n.dispose();
        }
        this.f22498n = AbstractC68307f.m265083a((Object) true).mo237985a(C11678b.m48479c()).mo238001b(new Consumer() {
            /* class com.bytedance.ee.bear.list.folder.$$Lambda$av$0EQl2x5jvuMCesuPDneQy3ruXo */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                av.this.m34454b((av) ((Boolean) obj));
            }
        }, new Consumer() {
            /* class com.bytedance.ee.bear.list.folder.$$Lambda$av$NM3EXwniXsQMkmk8OKCK7mZZ5lU */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                av.this.m34453a((av) ((Throwable) obj));
            }
        });
    }

    @Override // com.bytedance.ee.bear.list.list.AbstractC8542h
    /* renamed from: a */
    public LiveData<ArrayList<Document>> mo32587a() {
        return C1138ae.m5354a(C8153a.m32844b().mo31598b(this.f22495k), new C8371n());
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.AbstractC8531b
    /* renamed from: b */
    public String mo32588b() {
        if (C4211a.m17514a().mo16536a("ccm.space.mobile.folder_shortcut_enable", false)) {
            return "/space/api/explorer/v3/children/list/";
        }
        return "/space/api/explorer/v2/children/list/";
    }

    /* access modifiers changed from: private */
    @Override // com.bytedance.ee.bear.list.list.AbstractC8531b
    /* renamed from: a */
    public /* synthetic */ Document m34450a(Boolean bool) throws Exception {
        return C8200i.m33448a(C8153a.m32844b().mo31650o(this.f22495k));
    }

    /* access modifiers changed from: private */
    @Override // com.bytedance.ee.bear.list.list.AbstractC8531b
    /* renamed from: a */
    public /* synthetic */ void m34451a(DocumentListInfo documentListInfo) throws Exception {
        this.f22496l = documentListInfo.getParent();
        this.f22497m = documentListInfo.getParentPermission();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m34455b(Throwable th) throws Exception {
        String h = mo32590h();
        C13479a.m54758a(h, "removeItem()...throwable = " + th);
    }

    /* access modifiers changed from: private */
    @Override // com.bytedance.ee.bear.list.list.AbstractC8531b
    /* renamed from: a */
    public /* synthetic */ void m34453a(Throwable th) throws Exception {
        String h = mo32590h();
        C13479a.m54758a(h, "updateParentInCache()...error = " + th);
    }

    /* access modifiers changed from: private */
    @Override // com.bytedance.ee.bear.list.list.AbstractC8531b
    /* renamed from: b */
    public /* synthetic */ void m34454b(Boolean bool) throws Exception {
        long a = C8153a.m32844b().mo31573a(C8200i.m33446a(this.f22496l));
        String h = mo32590h();
        C13479a.m54764b(h, "updateParentInCache()...result = " + a);
    }

    @Override // com.bytedance.ee.bear.list.folder.AbstractC8321af
    /* renamed from: a */
    public void mo32717a(String str) {
        C13479a.m54764b(mo32590h(), "removeItem()...");
        this.f23125f.mo237937a(AbstractC68307f.m265083a((Object) true).mo237985a(C11678b.m48479c()).mo238001b(new Consumer(str) {
            /* class com.bytedance.ee.bear.list.folder.$$Lambda$av$epKqY5SVEpg1S6GxbNzNHq5k2Bw */
            public final /* synthetic */ String f$0;

            {
                this.f$0 = r1;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                av.m34452a(this.f$0, (Boolean) obj);
            }
        }, new Consumer() {
            /* class com.bytedance.ee.bear.list.folder.$$Lambda$av$2CI2PR4ik9ez_1s93AgNsfYaRmg */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                av.this.m34455b((av) ((Throwable) obj));
            }
        }));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m34452a(String str, Boolean bool) throws Exception {
        C8153a.m32844b().mo31610c(str);
    }

    av(C7718l lVar, Context context, C10917c cVar, String str) {
        super(lVar, context, cVar);
        this.f22495k = str;
    }
}
