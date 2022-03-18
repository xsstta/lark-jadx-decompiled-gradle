package com.bytedance.ee.bear.list.share;

import androidx.fragment.app.FragmentActivity;
import com.bytedance.ee.bear.contract.AccountService;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.bear.list.list.AbstractC8544i;
import com.bytedance.ee.bear.list.more.itemv2.C8631a;
import com.bytedance.ee.bear.list.more.itemv2.ShareItemV2;
import com.bytedance.ee.bear.more.moreprotocol.CommonMoreItemId;
import com.bytedance.ee.bear.more.moreprotocol.MoreItemGroup;
import com.bytedance.ee.bear.service.C10917c;

public class aq extends C8631a {
    @Override // com.bytedance.ee.bear.list.more.itemv2.C8631a, com.bytedance.ee.bear.list.more.itemv2.C8634d.AbstractC8636b
    /* renamed from: a */
    public MoreItemGroup mo32726a() {
        MoreItemGroup cVar = new MoreItemGroup();
        cVar.mo39169a(1);
        cVar.mo39170a(new ShareItemV2(this.f23375a, this.f23376b, this.f23377c, this.f23378d, this.f23381g, this.f23379e, this.f23380f));
        cVar.mo39170a(mo33579a(this.f23375a, CommonMoreItemId.ADD));
        cVar.mo39170a(mo33579a(this.f23375a, CommonMoreItemId.ADD_SHORT_CUT));
        cVar.mo39170a(mo33579a(this.f23375a, CommonMoreItemId.STAR)).mo39170a(mo33579a(this.f23375a, CommonMoreItemId.PIN)).mo39170a(mo33579a(this.f23375a, CommonMoreItemId.MANUAL_CACHE));
        return cVar;
    }

    public aq(FragmentActivity fragmentActivity, C10917c cVar, Document document, AccountService.Account account, String str, String str2, boolean z, AbstractC8544i.AbstractC8545a aVar) {
        super(fragmentActivity, cVar, document, account, str, str2, z, aVar);
    }
}
