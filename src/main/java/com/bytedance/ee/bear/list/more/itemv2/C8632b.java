package com.bytedance.ee.bear.list.more.itemv2;

import androidx.fragment.app.FragmentActivity;
import com.bytedance.ee.bear.contract.AccountService;
import com.bytedance.ee.bear.contract.C5084ad;
import com.bytedance.ee.bear.facade.common.C7718l;
import com.bytedance.ee.bear.list.C8292f;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.bear.list.more.itemv2.C8634d;
import com.bytedance.ee.bear.list.rename.RenameItemV2;
import com.bytedance.ee.bear.more.AbstractC10194a;
import com.bytedance.ee.bear.more.moreprotocol.CommonMoreItemId;
import com.bytedance.ee.bear.more.moreprotocol.IBaseMoreItem;
import com.bytedance.ee.bear.more.moreprotocol.MoreItemGroup;
import com.bytedance.ee.bear.service.C10917c;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.list.more.itemv2.b */
public class C8632b implements C8634d.AbstractC8636b {

    /* renamed from: a */
    protected final C7718l f23383a;

    /* renamed from: b */
    protected final C10917c f23384b;

    /* renamed from: c */
    protected final Document f23385c;

    /* renamed from: d */
    protected final AccountService.Account f23386d;

    /* renamed from: e */
    protected final boolean f23387e;

    /* renamed from: f */
    protected final String f23388f;

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo33582c() {
        return C5084ad.m20847d().mo20038b().mo20041b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public IBaseMoreItem mo33581b() {
        return ((AbstractC10194a) KoinJavaComponent.m268610a(AbstractC10194a.class)).mo38966a(C8292f.m34136a(this.f23387e), this.f23388f);
    }

    @Override // com.bytedance.ee.bear.list.more.itemv2.C8634d.AbstractC8636b
    /* renamed from: a */
    public MoreItemGroup mo32726a() {
        boolean c = mo33582c();
        return new MoreItemGroup().mo39169a(3).mo39170a(new RenameItemV2(this.f23383a, this.f23384b, this.f23385c, c, this.f23386d, C8292f.m34136a(this.f23387e), this.f23388f)).mo39170a(new ImportAsItemV2(this.f23383a.getContext(), this.f23384b, this.f23385c, this.f23387e)).mo39170a(new ListDownloadItemV2(this.f23383a.getContext(), this.f23385c, mo33582c())).mo39170a(new OpenFileItemV2(this.f23383a.getContext(), this.f23384b, this.f23385c, c, this.f23386d, C8292f.m34136a(this.f23387e), this.f23388f)).mo39170a(mo33581b()).mo39170a(mo33580a(this.f23383a.getActivity(), CommonMoreItemId.MAKE_COPY)).mo39170a(mo33580a(this.f23383a.getActivity(), CommonMoreItemId.SUBSCRIBE)).mo39170a(((AbstractC10194a) KoinJavaComponent.m268610a(AbstractC10194a.class)).mo38963a(this.f23383a.getActivity()));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public IBaseMoreItem mo33580a(FragmentActivity fragmentActivity, CommonMoreItemId commonMoreItemId) {
        return ((AbstractC10194a) KoinJavaComponent.m268610a(AbstractC10194a.class)).mo38964a(fragmentActivity, commonMoreItemId);
    }

    public C8632b(C7718l lVar, C10917c cVar, Document document, AccountService.Account account, boolean z, String str) {
        this.f23383a = lVar;
        this.f23384b = cVar;
        this.f23385c = document;
        this.f23386d = account;
        this.f23387e = z;
        this.f23388f = str;
    }
}
