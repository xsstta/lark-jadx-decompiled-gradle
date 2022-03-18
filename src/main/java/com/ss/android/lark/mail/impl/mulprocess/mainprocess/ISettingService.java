package com.ss.android.lark.mail.impl.mulprocess.mainprocess;

import com.ss.android.lark.mail.impl.entity.EmailAliasList;
import com.ss.android.lark.mail.impl.settings.AbstractC43396c;
import com.ss.android.lark.mail.impl.settings.subsetting.signature.EmailSignature;
import com.ss.android.lark.manis.annotation.RemoteService;
import ee.android.framework.manis.interfaces.IHookInterface;

@RemoteService
public interface ISettingService extends IHookInterface {
    void addSignatureChangeCallback(String str, AbstractC43396c cVar);

    EmailAliasList getAliasList(String str);

    boolean isSmartReplyEnable(String str);

    void removeSignatureChangeCallback(String str);

    void updateSignature(String str, EmailSignature emailSignature);
}
