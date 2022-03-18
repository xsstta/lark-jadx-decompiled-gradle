package com.ss.android.lark.mail.impl.mulprocess.mainprocess.imp;

import android.content.Context;
import com.ss.android.lark.mail.impl.entity.EmailAliasList;
import com.ss.android.lark.mail.impl.entity.MailAddress;
import com.ss.android.lark.mail.impl.mulprocess.mainprocess.IAccountService;
import com.ss.android.lark.mail.impl.service.C43277a;
import com.ss.android.lark.mail.impl.service.C43350d;
import com.ss.android.lark.manis.annotation.RemoteServiceImpl;

@RemoteServiceImpl(service = IAccountService.class)
public class AccountServiceImp implements IAccountService {
    private Context mContext;

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IAccountService
    public EmailAliasList getAliasList() {
        return C43350d.m172098a().mo155044j();
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IAccountService
    public MailAddress getCurrentAddress() {
        return C43277a.m171921a().mo154947k();
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IAccountService
    public boolean hasMultiAccount() {
        return C43277a.m171921a().mo154952p();
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IAccountService
    public boolean isExchangeClient() {
        return C43350d.m172098a().mo155013E();
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IAccountService
    public boolean isLarkServer() {
        return C43350d.m172098a().mo155012D();
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IAccountService
    public boolean isPrimaryAccount() {
        return C43277a.m171921a().mo154951o();
    }

    public AccountServiceImp(Context context) {
        this.mContext = context;
    }
}
