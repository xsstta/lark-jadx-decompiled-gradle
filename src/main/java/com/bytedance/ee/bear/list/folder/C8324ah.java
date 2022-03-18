package com.bytedance.ee.bear.list.folder;

import androidx.fragment.app.FragmentActivity;
import com.bytedance.ee.bear.contract.AccountService;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.list.dto.DocVersion;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.bear.list.list.AbstractC8544i;
import com.bytedance.ee.bear.list.more.itemv2.C8631a;
import com.bytedance.ee.bear.list.more.itemv2.ShareItemV2;
import com.bytedance.ee.bear.more.moreprotocol.CommonMoreItemId;
import com.bytedance.ee.bear.more.moreprotocol.MoreItemGroup;
import com.bytedance.ee.bear.service.C10917c;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.bear.list.folder.ah */
public class C8324ah extends C8631a {
    @Override // com.bytedance.ee.bear.list.more.itemv2.C8631a, com.bytedance.ee.bear.list.more.itemv2.C8634d.AbstractC8636b
    /* renamed from: a */
    public MoreItemGroup mo32726a() {
        MoreItemGroup cVar = new MoreItemGroup();
        cVar.mo39169a(1);
        cVar.mo39170a(new ShareItemV2(this.f23375a, this.f23376b, this.f23377c, this.f23378d, this.f23381g, this.f23379e, this.f23380f));
        cVar.mo39170a(mo33579a(this.f23375a, CommonMoreItemId.ADD));
        cVar.mo39170a(mo33579a(this.f23375a, CommonMoreItemId.ADD_SHORT_CUT));
        cVar.mo39170a(mo33579a(this.f23375a, CommonMoreItemId.STAR)).mo39170a(mo33579a(this.f23375a, CommonMoreItemId.PIN)).mo39170a(mo33579a(this.f23375a, CommonMoreItemId.MANUAL_CACHE)).mo39170a(new MyRootFolderDeleteItemV2(this.f23377c, this.f23381g, m34400a(this.f23377c), this.f23382h));
        return cVar;
    }

    /* renamed from: a */
    private int m34400a(Document document) {
        if (document.mo32483t() == C8275a.f22370c.mo32555b() || DocVersion.isDocV2(document.an())) {
            return R.string.Doc_List_Remove;
        }
        return R.string.Doc_Facade_Delete;
    }

    public C8324ah(FragmentActivity fragmentActivity, C10917c cVar, Document document, AccountService.Account account, String str, String str2, boolean z, AbstractC8544i.AbstractC8545a aVar) {
        super(fragmentActivity, cVar, document, account, str, str2, z, aVar);
    }
}
