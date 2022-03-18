package com.bytedance.ee.bear.list.create;

import android.text.TextUtils;
import com.bytedance.ee.bear.contract.AccountService;
import com.bytedance.ee.bear.contract.BinderIManualOfflineCallback;
import com.bytedance.ee.bear.contract.an;
import com.bytedance.ee.bear.list.C8292f;
import com.bytedance.ee.bear.list.DocumentCreateHelper;
import com.bytedance.ee.bear.list.cache.C8153a;
import com.bytedance.ee.bear.list.cache.C8200i;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.bear.list.offlinecache.ManualOfflineConfig;
import com.bytedance.ee.bear.list.p424c.AbstractC8149a;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.list.create.o */
public class C8255o implements Function<DocumentCreateHelper.DocumentCreateEntity, DocumentCreateHelper.DocumentCreateEntity> {

    /* renamed from: a */
    private an f22267a;

    /* renamed from: b */
    private int f22268b;

    /* renamed from: c */
    private String f22269c;

    /* renamed from: d */
    private String f22270d;

    /* renamed from: e */
    private String f22271e;

    /* renamed from: a */
    public DocumentCreateHelper.DocumentCreateEntity apply(DocumentCreateHelper.DocumentCreateEntity documentCreateEntity) {
        AccountService.Account d;
        an anVar = this.f22267a;
        if (anVar == null || (d = anVar.mo16406d()) == null) {
            return documentCreateEntity;
        }
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        Document document = new Document();
        document.mo32443g(this.f22269c);
        document.mo32433d(this.f22268b);
        document.mo32451i(documentCreateEntity.getObjToken());
        document.mo32454j(documentCreateEntity.getToken());
        document.mo32467m(documentCreateEntity.getUrl());
        document.mo32482s(String.valueOf(currentTimeMillis));
        document.mo32462l(String.valueOf(currentTimeMillis));
        document.mo32476p(String.valueOf(currentTimeMillis));
        document.mo32374A(String.valueOf(currentTimeMillis));
        document.mo32497z(String.valueOf(currentTimeMillis));
        document.mo32480r(this.f22270d);
        document.mo32434d(d.f14584a);
        document.mo32459k(d.f14584a);
        document.mo32470n(d.f14595l);
        document.mo32473o(d.f14596m);
        document.mo32378C(d.f14592i);
        document.mo32460k(true);
        document.mo32461l(documentCreateEntity.ownerType);
        if (!TextUtils.isEmpty(documentCreateEntity.title)) {
            document.mo32443g(documentCreateEntity.title);
        }
        ArrayList arrayList = new ArrayList();
        if (document.mo32483t() != C8275a.f22370c.mo32555b()) {
            arrayList.add(C8200i.m33447a(document, 1).mo32114d("").mo32116e(""));
            arrayList.add(C8200i.m33447a(document, 2).mo32114d(""));
        }
        if (TextUtils.equals(this.f22271e, "offline") && ManualOfflineConfig.isEnable(this.f22268b)) {
            document.mo32382E(String.valueOf(System.currentTimeMillis() / 1000));
            arrayList.add(C8200i.m33447a(document, 7).mo32114d("").mo32116e(""));
            ((AbstractC8149a) KoinJavaComponent.m268610a(AbstractC8149a.class)).mo31506a(false, C8292f.f22432b, this.f22271e, true, document, (BinderIManualOfflineCallback) null);
        }
        arrayList.add(C8200i.m33447a(document, 3));
        C8153a.m32844b().mo31584a(C8200i.m33446a(document), arrayList);
        return documentCreateEntity;
    }

    public C8255o(an anVar, int i, String str, String str2, String str3) {
        this.f22267a = anVar;
        this.f22268b = i;
        this.f22269c = str;
        this.f22270d = str2;
        this.f22271e = str3;
    }
}
