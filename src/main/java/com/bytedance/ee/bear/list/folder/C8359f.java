package com.bytedance.ee.bear.list.folder;

import android.text.TextUtils;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.ee.bear.basesdk.services.C4511g;
import com.bytedance.ee.bear.contract.AccountService;
import com.bytedance.ee.bear.list.C8292f;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.bear.list.list.AbstractC8544i;
import com.bytedance.ee.bear.list.more.itemv2.C8631a;
import com.bytedance.ee.bear.service.C10917c;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.bear.list.folder.f */
public class C8359f extends C8631a {
    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.more.itemv2.C8631a
    /* renamed from: a */
    public int mo32795a(Document document, boolean z) {
        if (m34595b(document, z)) {
            return R.string.Doc_List_Remove;
        }
        return Integer.MAX_VALUE;
    }

    /* renamed from: b */
    private boolean m34595b(Document document, boolean z) {
        if ((!document.mo32402R() || TextUtils.equals(document.mo32457k(), C4511g.m18594d().mo17356e())) && z && C8292f.m34175b(document)) {
            return true;
        }
        return false;
    }

    public C8359f(FragmentActivity fragmentActivity, C10917c cVar, Document document, AccountService.Account account, String str, String str2, boolean z, AbstractC8544i.AbstractC8545a aVar) {
        super(fragmentActivity, cVar, document, account, str, str2, z, aVar);
    }
}
