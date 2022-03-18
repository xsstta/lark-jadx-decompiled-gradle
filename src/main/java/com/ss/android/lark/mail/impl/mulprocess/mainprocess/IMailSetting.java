package com.ss.android.lark.mail.impl.mulprocess.mainprocess;

import com.ss.android.lark.mail.impl.entity.EmailAliasList;
import com.ss.android.lark.mail.impl.entity.EmailAutoReply;
import com.ss.android.lark.mail.impl.mulprocess.entity.ByteArray;
import com.ss.android.lark.manis.annotation.RemoteCallback;
import com.ss.android.lark.manis.annotation.RemoteService;
import ee.android.framework.manis.interfaces.IHookInterface;

@RemoteService
public interface IMailSetting extends IHookInterface {

    @RemoteCallback
    /* renamed from: com.ss.android.lark.mail.impl.mulprocess.mainprocess.IMailSetting$a */
    public interface AbstractC43218a {
        void onFail();

        void onSuc(ByteArray byteArray);
    }

    EmailAliasList getAliasList();

    EmailAutoReply getAutoReplyValue();

    void updateAutoReply(EmailAutoReply emailAutoReply, AbstractC43218a aVar);
}
