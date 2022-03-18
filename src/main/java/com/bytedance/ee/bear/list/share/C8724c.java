package com.bytedance.ee.bear.list.share;

import android.text.TextUtils;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.ee.bear.basesdk.services.C4511g;
import com.bytedance.ee.bear.contract.AccountService;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.bear.list.list.AbstractC8544i;
import com.bytedance.ee.bear.list.more.itemv2.C8631a;
import com.bytedance.ee.bear.list.more.itemv2.DeleteItemV2;
import com.bytedance.ee.bear.list.more.itemv2.ShareItemV2;
import com.bytedance.ee.bear.more.moreprotocol.CommonMoreItemId;
import com.bytedance.ee.bear.more.moreprotocol.MoreItemGroup;
import com.bytedance.ee.bear.service.C10917c;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.bear.list.share.c */
public class C8724c extends C8631a {
    @Override // com.bytedance.ee.bear.list.more.itemv2.C8631a, com.bytedance.ee.bear.list.more.itemv2.C8634d.AbstractC8636b
    /* renamed from: a */
    public MoreItemGroup mo32726a() {
        return new MoreItemGroup().mo39169a(1).mo39170a(new ShareItemV2(this.f23375a, this.f23376b, this.f23377c, this.f23378d, this.f23381g, this.f23379e, "")).mo39170a(mo33579a(this.f23375a, CommonMoreItemId.STAR)).mo39170a(mo33579a(this.f23375a, CommonMoreItemId.PIN)).mo39170a(new DeleteItemV2(this.f23377c, mo32795a(this.f23377c, this.f23381g), this.f23382h));
    }

    /* renamed from: a */
    private boolean m36633a(Document document) {
        return TextUtils.equals(document.mo32457k(), C4511g.m18594d().mo17356e());
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.more.itemv2.C8631a
    /* renamed from: a */
    public int mo32795a(Document document, boolean z) {
        if (m36633a(document)) {
            return R.string.Doc_List_Remove;
        }
        return Integer.MAX_VALUE;
    }

    public C8724c(FragmentActivity fragmentActivity, C10917c cVar, Document document, AccountService.Account account, String str, String str2, boolean z, AbstractC8544i.AbstractC8545a aVar) {
        super(fragmentActivity, cVar, document, account, str, str2, z, aVar);
    }
}
