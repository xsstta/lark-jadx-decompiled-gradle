package com.bytedance.ee.bear.list.share;

import android.content.Context;
import androidx.lifecycle.C1138ae;
import androidx.lifecycle.LiveData;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.facade.common.C7718l;
import com.bytedance.ee.bear.list.C8277e;
import com.bytedance.ee.bear.list.cache.C8153a;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.bear.list.list.AbstractC8531b;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.common.C13608f;
import java.util.ArrayList;

/* renamed from: com.bytedance.ee.bear.list.share.d */
public class C8725d extends AbstractC8531b<C8712ae> implements AbstractC8740o {
    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.AbstractC8531b
    /* renamed from: b */
    public String mo32588b() {
        return "/api/explorer/share/folder/newlist/";
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.AbstractC8531b
    /* renamed from: g */
    public String mo32589g() {
        return "shared_folder";
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.AbstractC8531b
    /* renamed from: h */
    public String mo32590h() {
        return "HistorySharedFolderModel";
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.AbstractC8531b
    public boolean w_() {
        return false;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.AbstractC8531b
    /* renamed from: i */
    public C8277e mo32730i() {
        return new C8713af();
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public C8712ae mo32592n() {
        return new C8712ae();
    }

    @Override // com.bytedance.ee.bear.list.list.AbstractC8542h
    /* renamed from: a */
    public LiveData<ArrayList<Document>> mo32587a() {
        return C1138ae.m5354a(C8153a.m32844b().mo31617d(), $$Lambda$8hh2XxIY6BsfWOqZONdgoQZzF8w.INSTANCE);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.AbstractC8531b
    /* renamed from: c */
    public NetService.C5076e mo32729c() {
        NetService.C5076e c = super.mo32729c();
        c.mo20145a("be_shared", String.valueOf(true));
        return c;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m36636b(String str) {
        C8153a.m32844b().mo31615d(str, true);
    }

    @Override // com.bytedance.ee.bear.list.share.AbstractC8740o
    /* renamed from: a */
    public void mo33767a(String str) {
        C13479a.m54764b(mo32590h(), "removeItem()...");
        ((C8712ae) this.f23126g).mo33765a(str);
    }

    @Override // com.bytedance.ee.bear.list.share.AbstractC8740o
    /* renamed from: a */
    public void mo33768a(String str, boolean z) {
        String h = mo32590h();
        C13479a.m54764b(h, "updateItemVisited()...visited = " + z);
        C13608f.m55249a(new Runnable(str) {
            /* class com.bytedance.ee.bear.list.share.$$Lambda$d$ATk4ZcmiUE1aVIMecvv26XYRzLQ */
            public final /* synthetic */ String f$0;

            {
                this.f$0 = r1;
            }

            public final void run() {
                C8725d.m36636b(this.f$0);
            }
        });
    }

    C8725d(C7718l lVar, Context context, C10917c cVar) {
        super(lVar, context, cVar);
    }
}
