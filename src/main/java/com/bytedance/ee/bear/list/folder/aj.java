package com.bytedance.ee.bear.list.folder;

import com.bytedance.ee.bear.contract.AccountService;
import com.bytedance.ee.bear.facade.common.C7718l;
import com.bytedance.ee.bear.list.C8292f;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.bear.list.more.itemv2.C8632b;
import com.bytedance.ee.bear.list.more.itemv2.ImportAsItemV2;
import com.bytedance.ee.bear.list.more.itemv2.ListDownloadItemV2;
import com.bytedance.ee.bear.list.more.itemv2.OpenFileItemV2;
import com.bytedance.ee.bear.list.rename.RenameItemV2;
import com.bytedance.ee.bear.more.AbstractC10194a;
import com.bytedance.ee.bear.more.moreprotocol.CommonMoreItemId;
import com.bytedance.ee.bear.more.moreprotocol.MoreItemGroup;
import com.bytedance.ee.bear.service.C10917c;
import org.koin.java.KoinJavaComponent;

public class aj extends C8632b {
    @Override // com.bytedance.ee.bear.list.more.itemv2.C8632b, com.bytedance.ee.bear.list.more.itemv2.C8634d.AbstractC8636b
    /* renamed from: a */
    public MoreItemGroup mo32726a() {
        return new MoreItemGroup().mo39169a(3).mo39170a(new RenameItemV2(this.f23383a, this.f23384b, this.f23385c, mo33582c(), this.f23386d, C8292f.m34136a(this.f23387e), this.f23388f)).mo39170a(new ImportAsItemV2(this.f23383a.getContext(), this.f23384b, this.f23385c, this.f23387e)).mo39170a(new MyRootFolderMoveItemV2(this.f23383a.getContext(), this.f23385c, this.f23386d, mo33582c(), this.f23388f, C8292f.m34136a(this.f23387e))).mo39170a(new ListDownloadItemV2(this.f23383a.getContext(), this.f23385c, mo33582c())).mo39170a(new OpenFileItemV2(this.f23383a.getContext(), this.f23384b, this.f23385c, mo33582c(), this.f23386d, C8292f.m34136a(this.f23387e), this.f23388f)).mo39170a(mo33581b()).mo39170a(mo33580a(this.f23383a.getActivity(), CommonMoreItemId.MAKE_COPY)).mo39170a(mo33580a(this.f23383a.getActivity(), CommonMoreItemId.SUBSCRIBE)).mo39170a(((AbstractC10194a) KoinJavaComponent.m268610a(AbstractC10194a.class)).mo38963a(this.f23383a.getActivity()));
    }

    public aj(C7718l lVar, C10917c cVar, Document document, AccountService.Account account, boolean z, String str) {
        super(lVar, cVar, document, account, z, str);
    }
}
