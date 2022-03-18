package com.bytedance.ee.bear.list.mine;

import androidx.fragment.app.FragmentActivity;
import com.bytedance.ee.bear.contract.AccountService;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.bear.list.list.AbstractC8544i;
import com.bytedance.ee.bear.list.more.itemv2.C8631a;
import com.bytedance.ee.bear.service.C10917c;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.bear.list.mine.k */
public class C8622k extends C8631a {
    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.more.itemv2.C8631a
    /* renamed from: a */
    public int mo32795a(Document document, boolean z) {
        if (z) {
            return R.string.Doc_Facade_Delete;
        }
        return Integer.MAX_VALUE;
    }

    public C8622k(FragmentActivity fragmentActivity, C10917c cVar, Document document, AccountService.Account account, String str, String str2, boolean z, AbstractC8544i.AbstractC8545a aVar) {
        super(fragmentActivity, cVar, document, account, str, str2, z, aVar);
    }
}
