package com.ss.android.lark.mail.impl.mulprocess.mainprocess;

import com.ss.android.lark.mail.impl.entity.EmailAliasList;
import com.ss.android.lark.mail.impl.entity.MailAddress;
import com.ss.android.lark.manis.annotation.RemoteService;
import ee.android.framework.manis.interfaces.IHookInterface;

@RemoteService
public interface IAccountService extends IHookInterface {
    EmailAliasList getAliasList();

    MailAddress getCurrentAddress();

    boolean hasMultiAccount();

    boolean isExchangeClient();

    boolean isLarkServer();

    boolean isPrimaryAccount();
}
