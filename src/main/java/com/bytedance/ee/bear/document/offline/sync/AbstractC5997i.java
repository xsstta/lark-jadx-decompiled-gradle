package com.bytedance.ee.bear.document.offline.sync;

import com.bytedance.ee.bear.contract.AccountService;
import com.bytedance.ee.bear.contract.BinderIPreloadCallback;
import com.bytedance.ee.bear.contract.offline.OfflineDoc;
import com.bytedance.ee.bear.document.offline.offlinestorage.C5968f;

/* renamed from: com.bytedance.ee.bear.document.offline.sync.i */
public interface AbstractC5997i {
    /* renamed from: a */
    void mo24217a(AccountService.Account account);

    /* renamed from: a */
    void mo24221a(OfflineDoc offlineDoc, BinderIPreloadCallback binderIPreloadCallback);

    /* renamed from: a */
    void mo24222a(AbstractC5990h hVar);

    /* renamed from: a */
    void mo24223a(String str, String str2, String str3);

    /* renamed from: c */
    C5968f mo24219c(String str);
}
