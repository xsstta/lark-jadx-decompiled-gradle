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
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.bear.list.list.AbstractC8531b;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import io.reactivex.AbstractC68307f;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;

public class am extends AbstractC8531b<C8325ai> implements AbstractC8319ad {
    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.AbstractC8531b
    /* renamed from: g */
    public String mo32589g() {
        return "my_root";
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.AbstractC8531b
    /* renamed from: h */
    public String mo32590h() {
        return "MyRootFolderModel";
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.AbstractC8531b
    public boolean w_() {
        return false;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.AbstractC8531b
    public AbstractC68307f<DocumentListInfo> E_() {
        return super.E_();
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.AbstractC8531b
    /* renamed from: i */
    public C8277e mo32730i() {
        return new ak();
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public C8325ai mo32592n() {
        return new C8325ai();
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.AbstractC8531b
    /* renamed from: b */
    public String mo32588b() {
        if (C4211a.m17514a().mo16536a("ccm.space.mobile.folder_shortcut_enable", false)) {
            return "/space/api/explorer/v3/my_space/list/";
        }
        return "/space/api/explorer/v2/my_space/list/";
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.AbstractC8531b
    /* renamed from: c */
    public NetService.C5076e mo32729c() {
        NetService.C5076e c = super.mo32729c();
        c.mo20145a("need_path", "1");
        c.mo20146a("shortcut_filter", C8292f.m34180c());
        return c;
    }

    @Override // com.bytedance.ee.bear.list.list.AbstractC8542h
    /* renamed from: a */
    public LiveData<ArrayList<Document>> mo32587a() {
        return C1138ae.m5354a(C8153a.m32844b().mo31598b(""), new C8371n());
    }

    /* access modifiers changed from: private */
    @Override // com.bytedance.ee.bear.list.list.AbstractC8531b
    /* renamed from: a */
    public /* synthetic */ void m34408a(Throwable th) throws Exception {
        String h = mo32590h();
        C13479a.m54758a(h, "removeItem()...throwable = " + th);
    }

    @Override // com.bytedance.ee.bear.list.folder.AbstractC8319ad
    /* renamed from: a */
    public void mo32715a(String str) {
        C13479a.m54764b(mo32590h(), "removeItem()...");
        this.f23125f.mo237937a(AbstractC68307f.m265083a((Object) true).mo237985a(C11678b.m48479c()).mo238001b(new Consumer(str) {
            /* class com.bytedance.ee.bear.list.folder.$$Lambda$am$Uwf8wa2kAnbQXzKugfvqXbrlbtQ */
            public final /* synthetic */ String f$0;

            {
                this.f$0 = r1;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                am.m34407a(this.f$0, (Boolean) obj);
            }
        }, new Consumer() {
            /* class com.bytedance.ee.bear.list.folder.$$Lambda$am$pRk5UMvXZrCPYUHdlJeEQCqmiF8 */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                am.this.m34408a((am) ((Throwable) obj));
            }
        }));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m34407a(String str, Boolean bool) throws Exception {
        C8153a.m32844b().mo31610c(str);
    }

    am(C7718l lVar, Context context, C10917c cVar) {
        super(lVar, context, cVar);
    }
}
