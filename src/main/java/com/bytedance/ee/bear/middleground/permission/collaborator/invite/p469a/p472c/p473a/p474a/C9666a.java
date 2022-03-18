package com.bytedance.ee.bear.middleground.permission.collaborator.invite.p469a.p472c.p473a.p474a;

import com.bytedance.ee.bear.contract.AccountService;
import com.bytedance.ee.bear.middleground.permission.collaborator.invite.C9638a;
import com.bytedance.ee.bear.share.export.UserInfo;
import com.chad.library.adapter.base.C20923c;
import com.larksuite.suite.R;
import java.util.Locale;

/* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.invite.a.c.a.a.a */
public class C9666a extends C9638a {
    public C9666a(Locale locale, AccountService.Account account) {
        super(locale, account);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.invite.C9638a
    /* renamed from: a */
    public void mo16806a(C20923c cVar, UserInfo userInfo) {
        super.mo16806a(cVar, userInfo);
        cVar.mo70740b(R.id.share_item_permission_icon).setVisibility(8);
    }
}
